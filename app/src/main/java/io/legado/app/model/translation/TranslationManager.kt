package io.legado.app.model.translation

import io.legado.app.data.entities.Book
import io.legado.app.data.entities.BookChapter
import io.legado.app.domain.gateway.TranslationCacheGateway
import io.legado.app.domain.usecase.TranslateChapterUseCase
import io.legado.app.help.book.BookHelp
import io.legado.app.help.coroutine.Coroutine
import io.legado.app.ui.config.translation.TranslationConfig
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.withContext
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import java.util.concurrent.ConcurrentHashMap

object TranslationManager : KoinComponent {

    private val translationCacheGateway: TranslationCacheGateway by inject()
    private val translateChapterUseCase: TranslateChapterUseCase by inject()

    /** Per-chapter task state flows: bookUrl+chapterIndex -> StateFlow (only for in-progress tasks) */
    private val _taskStateFlows =
        ConcurrentHashMap<TranslationChapterKey, MutableStateFlow<TranslationChapterState>>()

    /** Per-chapter running background jobs */
    private val _runningJobs =
        ConcurrentHashMap<TranslationChapterKey, Coroutine<*>>()

    private fun getChapterKey(book: Book, chapter: BookChapter): TranslationChapterKey {
        return TranslationChapterKey(book.bookUrl, chapter.index)
    }

    /**
     * Get task StateFlow for a chapter if translation is in progress.
     * Returns null if no in-progress translation exists.
     */
    fun getChapterTaskStateFlow(bookUrl: String, chapterIndex: Int): StateFlow<TranslationChapterState>? {
        val key = TranslationChapterKey(bookUrl, chapterIndex)
        return _taskStateFlows[key]?.takeIf { it.value.status == TranslationChapterStatus.Translating }
    }

    /**
     * Check if translated cache file exists for a chapter.
     */
    fun hasTranslatedCache(book: Book, chapter: BookChapter): Boolean {
        val cacheFile =
            translationCacheGateway.getCacheFile(book, chapter, TranslationConfig.llmTargetLanguage)
        return cacheFile.exists()
    }

    /**
     * Get finished cached translation for a chapter.
     */
    fun getCachedTranslation(book: Book, chapter: BookChapter): String? {
        val cacheFile =
            translationCacheGateway.getCacheFile(book, chapter, TranslationConfig.llmTargetLanguage)
        return if (cacheFile.exists()) cacheFile.readText() else null
    }

    /**
     * Start translation for a chapter.
     * - If translation is already in progress, return existing task flow.
     * - If cache already exists, do nothing and return null.
     * - If original content doesn't exist, return null.
     * The returned flow updates with mixedContent during translation.
     */
    @Synchronized
    fun startTranslation(
        book: Book,
        chapter: BookChapter,
        onTranslateStarted: () -> Unit = {}
    ): MutableStateFlow<TranslationChapterState>? {
        val key = getChapterKey(book, chapter)

        // Check if already translating
        _taskStateFlows[key]?.let { taskFlow ->
            if (taskFlow.value.status == TranslationChapterStatus.Translating) {
                return taskFlow
            }
        }

        // Skip if cache already exists
        if (hasTranslatedCache(book, chapter)) {
            return null
        }

        // Check if original content exists
        if (BookHelp.getContent(book, chapter) == null) {
            return null
        }

        // Cancel existing job if running
        _runningJobs[key]?.cancel()
        _runningJobs.remove(key)

        // Create new task flow
        val taskFlow = MutableStateFlow(TranslationChapterState(key, status = TranslationChapterStatus.Idle))
        _taskStateFlows[key] = taskFlow

        // Start translation in background
        val job = Coroutine.async {
            if (TranslationConfig.llmBaseUrl.isNotBlank() && TranslationConfig.llmApiKey.isNotBlank()) {
                scanAndSaveNamesWithAi(book, chapter)
            }
            translateChapter(book, chapter, onTranslateStarted)
        }
        job.invokeOnCompletion {
            _runningJobs.remove(key)
        }
        _runningJobs[key] = job

        return taskFlow
    }

    private suspend fun translateChapter(
        book: Book,
        bookChapter: BookChapter,
        onTranslateStarted: () -> Unit
    ) = withContext(Dispatchers.IO) {
        val key = getChapterKey(book, bookChapter)
        val taskFlow = _taskStateFlows[key] ?: return@withContext

        taskFlow.update { it.copy(status = TranslationChapterStatus.Translating) }

        val result = translateChapterUseCase.execute(
            book = book,
            bookChapter = bookChapter,
            targetLanguage = TranslationConfig.llmTargetLanguage,
            onProgress = { progress ->
                taskFlow.update {
                    it.copy(
                        currentChunk = progress.currentChunk,
                        totalChunks = progress.totalChunks,
                        mixedContent = progress.mixedContent
                    )
                }
            },
            onTranslateStarted = onTranslateStarted
        )

        result.onSuccess { content ->
            taskFlow.update {
                it.copy(
                    status = TranslationChapterStatus.Translated,
                    translatedContent = content,
                    mixedContent = null
                )
            }
        }.onFailure { error ->
            taskFlow.update {
                it.copy(
                    status = TranslationChapterStatus.Failed,
                    errorMessage = error.message ?: "Translation failed"
                )
            }
        }
    }

    /**
     * Clear state for a single chapter.
     */
    fun clearChapterState(bookUrl: String, chapterIndex: Int) {
        val key = TranslationChapterKey(bookUrl, chapterIndex)
        _runningJobs[key]?.cancel()
        _runningJobs.remove(key)
        _taskStateFlows.remove(key)
    }

    /**
     * Clear all chapter states.
     */
    fun clearAllChapterStates() {
        _runningJobs.values.forEach { it.cancel() }
        _runningJobs.clear()
        _taskStateFlows.clear()
    }

    /**
     * Delete translation cache and state for a chapter.
     */
    suspend fun deleteTranslationCache(book: Book, bookChapter: BookChapter) {
        val key = getChapterKey(book, bookChapter)
        _runningJobs[key]?.cancel()
        _runningJobs.remove(key)
        _taskStateFlows.remove(key)
        translationCacheGateway.deleteTranslation(
            book,
            bookChapter,
            TranslationConfig.llmTargetLanguage
        )
        translationCacheGateway.clearChunkCacheForChapter(
            book,
            bookChapter,
            TranslationConfig.llmTargetLanguage
        )
    }

    /**
     * Clear translation cache for the whole book if engine is STV or QT.
     */
    suspend fun clearBookTranslationCache(book: Book) {
        val bookUrl = book.bookUrl
        _runningJobs.keys.filter { it.bookUrl == bookUrl }.forEach { key ->
            _runningJobs[key]?.cancel()
            _runningJobs.remove(key)
        }
        _taskStateFlows.keys.filter { it.bookUrl == bookUrl }.forEach { key ->
            _taskStateFlows.remove(key)
        }
        val currentEngine = TranslationConfig.translationEngine
        if (currentEngine == "STV" || currentEngine == "QT") {
            translationCacheGateway.deleteTranslationForBook(book, TranslationConfig.llmTargetLanguage)
        }
    }

    suspend fun scanAndSaveNamesWithAi(book: Book, chapter: BookChapter) = withContext(Dispatchers.IO) {
        val context = splitties.init.appCtx
        val bookKey = io.legado.app.utils.MD5Utils.md5Encode16(book.bookUrl)
        val privateNameFile = "book/book_${bookKey}_name.txt"
        val rawContent = BookHelp.getContent(book, chapter) ?: return@withContext
        val genre = book.kind?.takeIf { it.isNotBlank() } ?: "Không rõ"
        
        try {
            val prompt = """
                Bạn là một trợ lý dịch thuật Trung-Việt chuyên nghiệp, nhiệm vụ của bạn là xây dựng từ điển thuật ngữ cho bộ truyện.

                ⚠️ NHIỆM VỤ BẮT BUỘC — PHẢI THỰC HIỆN NGHIÊM TÚC:
                Đọc TOÀN BỘ văn bản chương truyện tiếng Trung dưới đây từ đầu đến cuối. Trích xuất và phân loại TOÀN BỘ, KHÔNG BỎ SÓT bất kỳ thực thể nào thuộc đúng 4 nhóm sau:

                1. Tên nhân vật (TAG: PER): TẤT CẢ tên người, nhân vật xuất hiện — dù nhân vật chính, phụ, hay chỉ được nhắc đến 1 lần.
                2. Địa danh (TAG: LOC): TẤT CẢ địa điểm, thành trì, núi, sông, vùng đất, cõi giới, thế giới.
                3. Tổ chức (TAG: ORG): TẤT CẢ tông môn, gia tộc, bang hội, trường phái, đội nhóm, tổ chức.
                4. Xưng hô (TAG: PRON): TẤT CẢ đại từ xưng hô, cách gọi đặc trưng (ví dụ: 师父=Sư phụ, 弟子=Đệ tử, 陛下=Bệ hạ).

                Thông tin ngữ cảnh:
                - Thể loại truyện: $genre

                Quy tắc dịch thuật bắt buộc:
                - Truyện tiên hiệp/kiếm hiệp/huyền huyễn cổ đại Trung Quốc → dịch âm Hán-Việt chuẩn (萧炎→Tiêu Viêm/PER, 云岚宗→Vân Lam Tông/ORG).
                - Truyện Võng Du/Khoa Huyễn/Tây Phương → phiên âm Latin/Anh (杰克→Jack/PER).
                - Light Novel Nhật/Hàn → Romaji hoặc phiên âm gốc (桐人→Kirito/PER).
                - TUYỆT ĐỐI KHÔNG dịch nghĩa đen tên riêng (萧炎 KHÔNG được dịch thành "Lửa Tiêu").

                ⚠️ CÁC RÀNG BUỘC BẮT BUỘC:
                - Quét TOÀN BỘ văn bản, KHÔNG bỏ qua đoạn nào.
                - Liệt kê TẤT CẢ thực thể, kể cả nhân vật/địa điểm chỉ xuất hiện 1 lần.
                - KHÔNG chọn lọc hay chỉ lấy tên "quan trọng" — phải lấy hết.
                - Mỗi thực thể chỉ xuất hiện 1 lần trong kết quả (không trùng lặp).
                - Chỉ trả về danh sách thô, KHÔNG có markdown, KHÔNG có tiêu đề, KHÔNG giải thích.

                Định dạng mỗi dòng (bắt buộc):
                TừGốcTiếngTrung=BảnDịchTiếngViệt/TAG

                Ví dụ:
                萧炎=Tiêu Viêm/PER
                云岚宗=Vân Lam Tông/ORG
                迦南学院=Ca Nam Học Viện/LOC
                师父=Sư phụ/PRON

                Nội dung chương truyện:
                $rawContent
            """.trimIndent()

            val jsonBody = org.json.JSONObject().apply {
                put("model", TranslationConfig.llmModel.ifBlank { "gpt-3.5-turbo" })
                put("messages", org.json.JSONArray().apply {
                    put(org.json.JSONObject().apply {
                        put("role", "user")
                        put("content", prompt)
                    })
                })
                put("temperature", 0.1)
                put("max_tokens", 4096)
            }

            val mediaType = "application/json; charset=utf-8".toMediaTypeOrNull()
            val requestBody = jsonBody.toString().toRequestBody(mediaType)

            val url = if (TranslationConfig.llmBaseUrl.endsWith("/")) {
                TranslationConfig.llmBaseUrl + "chat/completions"
            } else {
                TranslationConfig.llmBaseUrl + "/chat/completions"
            }

            val request = okhttp3.Request.Builder()
                .url(url)
                .post(requestBody)
                .addHeader("Authorization", "Bearer ${TranslationConfig.llmApiKey}")
                .build()

            io.legado.app.help.http.okHttpClient.newCall(request).execute().use { response ->
                if (response.isSuccessful) {
                    val responseBody = response.body?.string() ?: return@use
                    val responseJson = org.json.JSONObject(responseBody)
                    val choices = responseJson.optJSONArray("choices")
                    if (choices != null && choices.length() > 0) {
                        val aiResult = choices.getJSONObject(0)
                            .getJSONObject("message")
                            .getString("content")
                            .trim()

                        // Parse các dòng AI trả về
                        val newEntries = ArrayList<Pair<String, String>>()
                        aiResult.split("\n").forEach { line ->
                            val cleanLine = line.trim()
                            if (cleanLine.contains("=") && !cleanLine.startsWith("```")) {
                                val parts = cleanLine.split('=', limit = 2)
                                if (parts.size == 2) {
                                    val key = parts[0].trim()
                                    val value = parts[1].trim()
                                    if (key.isNotEmpty() && value.isNotEmpty()) {
                                        newEntries.add(Pair(key, value))
                                    }
                                }
                            }
                        }

                        if (newEntries.isNotEmpty()) {
                            // Gộp vào từ điển hiện tại của truyện
                            val currentEntries = io.legado.app.utils.QuickTranslateDictHelper.loadDictEntries(context, privateNameFile).toMutableList()
                            val currentKeys = currentEntries.map { it.first }.toSet()
                            
                            newEntries.forEach { (key, value) ->
                                if (!currentKeys.contains(key)) {
                                    currentEntries.add(Pair(key, value))
                                }
                            }
                            
                            io.legado.app.utils.QuickTranslateDictHelper.saveDictEntries(context, privateNameFile, currentEntries)
                            // Nạp lại từ điển vào RAM
                            io.legado.app.vbookextension.util.QuickTranslateEngine.initBookPrivateDict(context, bookKey)
                        }
                    }
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

}