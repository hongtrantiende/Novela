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
                Bạn là một trợ lý dịch thuật Trung-Việt chuyên nghiệp.
                Nhiệm vụ: Hãy quét nội dung chương truyện tiếng Trung dưới đây để trích xuất và phân loại đầy đủ toàn bộ cả 4 nhóm thực thể quan trọng cùng một lúc thành từ điển truyện.
                
                Yêu cầu bắt buộc trích xuất đầy đủ 4 nhóm:
                1. Tên nhân vật (nhãn /PER): Trích xuất tất cả tên nhân vật xuất hiện.
                2. Tên địa danh (nhãn /LOC): Các địa điểm, thành trì, núi sông, khu vực.
                3. Tên tổ chức (nhãn /ORG): Tông môn, gia tộc, trường học, bang hội.
                4. Xưng hô (nhãn /PRON): Các đại từ xưng hô, cặp từ hô gọi đặc trưng (ví dụ: Sư phụ, Đệ tử, Lão tổ, v.v.).
                
                Thông tin ngữ cảnh bộ truyện:
                - Thể loại truyện: $genre
                
                Yêu cầu phong cách dịch tên riêng (PER/LOC/ORG):
                1. Hãy dịch tên riêng phù hợp nhất với thể loại truyện này:
                   - Nếu là truyện tiên hiệp, kiếm hiệp, huyền huyễn cổ đại Trung Quốc: Hãy dịch tên theo đúng âm Hán-Việt tiêu chuẩn (ví dụ: 萧炎=Tiêu Viêm/PER, 云岚宗=Vân Lam Tông/ORG).
                   - Nếu là truyện Võng Du, Khoa Huyễn, Tây Phương Huyền Huyễn: Dịch tên riêng theo phong cách Latin/Anh ngữ hoặc phiên âm phương Tây chuẩn (ví dụ: 杰克=Jack/PER, 史密斯=Smith/PER).
                   - Nếu là truyện chuyển ngữ từ Light Novel Nhật Bản, Hàn Quốc: Dịch theo đúng dạng Romanji hoặc phiên âm đặc trưng của nước đó (ví dụ: 桐人=Kirito/PER, 亚丝娜=Asuna/PER).
                2. TUYỆT ĐỐI KHÔNG dịch tên riêng thành nghĩa THUẦN VIỆT hoặc dịch nghĩa đen từ vựng (ví dụ: dịch 萧炎 thành Tiêu Viêm, tuyệt đối KHÔNG dịch thành Lửa Tiêu hay Viêm Tiêu).
                3. Trích xuất các đại từ xưng hô đặc trưng của truyện (ví dụ: 老师=Sư phụ/PRON).

                Định dạng kết quả trả về (Xuất chính xác mỗi dòng một từ khóa, không có markdown, không giải thích gì thêm, không chia nhóm tiêu đề):
                TừGốc=BảnDịch/TAG
                
                Trong đó TAG chỉ nhận một trong các giá trị sau:
                - PER
                - LOC
                - ORG
                - PRON
                
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
                put("temperature", 0.3)
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