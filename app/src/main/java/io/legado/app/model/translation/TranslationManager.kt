package io.legado.app.model.translation

import io.legado.app.data.entities.Book
import io.legado.app.utils.TranslateUtils
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
    private val aiProfileGateway: io.legado.app.domain.gateway.AiProfileGateway by inject()

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

        // Cancel existing job if running
        _runningJobs[key]?.cancel()
        _runningJobs.remove(key)

        val isCurrentChapter = (book.bookUrl == io.legado.app.model.ReadBook.book?.bookUrl && chapter.index == io.legado.app.model.ReadBook.durChapterIndex)
        if (isCurrentChapter) {
            _runningJobs.keys.filter { it.bookUrl == book.bookUrl && it.chapterIndex != chapter.index }.forEach { otherKey ->
                _runningJobs[otherKey]?.cancel()
                _runningJobs.remove(otherKey)
                _taskStateFlows.remove(otherKey)
            }
        }

        // Create new task flow
        val taskFlow = MutableStateFlow(TranslationChapterState(key, status = TranslationChapterStatus.Idle))
        _taskStateFlows[key] = taskFlow

        val job = Coroutine.async {
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

        // Wait for content to be downloaded if not present (up to 30 seconds)
        var content = BookHelp.getContent(book, bookChapter)
        var waitCount = 0
        while (content == null && waitCount < 60) {
            kotlinx.coroutines.delay(500)
            content = BookHelp.getContent(book, bookChapter)
            waitCount++
        }

        if (content == null) {
            taskFlow.update {
                it.copy(
                    status = TranslationChapterStatus.Failed,
                    errorMessage = "Original content not downloaded"
                )
            }
            return@withContext
        }

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
            val preset = aiProfileGateway.getTaskPreset(io.legado.app.domain.model.AiTaskType.SCAN_DICT)
            val isAdvanced = TranslationConfig.llmScanAdvanced
            val promptTemplate = preset?.promptTemplate ?: io.legado.app.domain.model.AiPromptTemplate.DEFAULT_SCAN_DICT
            
            val prompt = if (isAdvanced) {
                val translatedContent = TranslateUtils.forceTranslateContent(rawContent)
                var processedPrompt = promptTemplate
                    .replace("{genre}", genre)
                    .replace("${genre}", genre)
                    .replace("$genre", genre)
                    .replace("{content}", rawContent)
                    .replace("${rawContent}", rawContent)
                    .replace("$rawContent", rawContent)
                
                if (processedPrompt.contains("{translatedContent}")) {
                    processedPrompt = processedPrompt.replace("{translatedContent}", translatedContent)
                } else if (processedPrompt.contains("${translatedContent}")) {
                    processedPrompt = processedPrompt.replace("${translatedContent}", translatedContent)
                } else if (processedPrompt.contains("$translatedContent")) {
                    processedPrompt = processedPrompt.replace("$translatedContent", translatedContent)
                } else {
                    processedPrompt = processedPrompt + "\n\nBẢN DỊCH THÔ TỪ TỪ ĐIỂN:\n$translatedContent"
                }
                processedPrompt
            } else {
                promptTemplate
                    .replace("{genre}", genre)
                    .replace("${genre}", genre)
                    .replace("$genre", genre)
                    .replace("{content}", rawContent)
                    .replace("${rawContent}", rawContent)
                    .replace("$rawContent", rawContent)
            }

            val temperature = preset?.params?.temperature ?: 0.1f
            val maxTokens = preset?.params?.maxOutputTokens?.takeIf { it > 0 } ?: 4096

            val jsonBody = org.json.JSONObject().apply {
                put("model", TranslationConfig.llmModel.ifBlank { "gpt-3.5-turbo" })
                put("messages", org.json.JSONArray().apply {
                    put(org.json.JSONObject().apply {
                        put("role", "user")
                        put("content", prompt)
                    })
                })
                put("temperature", temperature)
                put("max_tokens", maxTokens)
            }

            val mediaType = "application/json; charset=utf-8".toMediaTypeOrNull()
            val requestBody = jsonBody.toString().toRequestBody(mediaType)

            val url = if (TranslationConfig.llmBaseUrl.endsWith("/")) {
                TranslationConfig.llmBaseUrl + "chat/completions"
            } else {
                TranslationConfig.llmBaseUrl + "/chat/completions"
            }

            android.util.Log.d("TranslationManager", "AI Dict Scan Request URL: $url")
            android.util.Log.d("TranslationManager", "AI Dict Scan Model: ${TranslationConfig.llmModel}")
            android.util.Log.d("TranslationManager", "AI Dict Scan Prompt:\n$prompt")

            val request = okhttp3.Request.Builder()
                .url(url)
                .post(requestBody)
                .addHeader("Authorization", "Bearer ${TranslationConfig.llmApiKey}")
                .build()

            io.legado.app.help.http.okHttpClient.newCall(request).execute().use { response ->
                android.util.Log.d("TranslationManager", "AI Dict Scan Response Code: ${response.code}")
                if (response.isSuccessful) {
                    val responseBody = response.body?.string() ?: return@use
                    android.util.Log.d("TranslationManager", "AI Dict Scan Response Body:\n$responseBody")
                    val responseJson = org.json.JSONObject(responseBody)
                    val choices = responseJson.optJSONArray("choices")
                    if (choices != null && choices.length() > 0) {
                        val aiResult = choices.getJSONObject(0)
                            .getJSONObject("message")
                            .getString("content")
                            .trim()

                        // Parse các dòng AI trả về
                        val allowedTags = setOf("PER", "LOC", "ORG", "PRON")
                        val newEntries = ArrayList<Pair<String, String>>()
                        aiResult.split("\n").forEach { line ->
                            val cleanLine = line.trim()
                            if (cleanLine.contains("=") && !cleanLine.startsWith("```")) {
                                val parts = cleanLine.split('=', limit = 2)
                                if (parts.size == 2) {
                                    val key = parts[0].trim()
                                    val value = parts[1].trim()
                                    if (key.isNotEmpty() && value.isNotEmpty()) {
                                        val tag = value.substringAfter('/', "").trim().uppercase()
                                        if (tag in allowedTags) {
                                            newEntries.add(Pair(key, value))
                                        }
                                    }
                                }
                            }
                        }

                        if (newEntries.isNotEmpty()) {
                            val currentEntries = io.legado.app.utils.QuickTranslateDictHelper.loadDictEntries(context, privateNameFile).toMutableList()
                            val currentKeys = currentEntries.map { it.first }.toSet()
                            val blacklist = io.legado.app.utils.QuickTranslateDictHelper.loadBlacklist(context, privateNameFile)
                            
                            newEntries.forEach { (key, value) ->
                                if (!currentKeys.contains(key) && !blacklist.contains(key)) {
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