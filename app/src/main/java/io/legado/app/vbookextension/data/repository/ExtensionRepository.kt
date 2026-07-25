package io.legado.app.vbookextension.data.repository

import android.content.Context
import android.util.Log
import io.legado.app.data.entities.Book
import io.legado.app.data.entities.BookChapter
import io.legado.app.data.entities.SearchBook
import io.legado.app.data.entities.rule.ExploreKind
import io.legado.app.vbookextension.loader.ExtensionLoader
import io.legado.app.vbookextension.model.ScriptType
import io.legado.app.vbookextension.runtime.VBookJsExtensionRunner
import io.legado.app.vbookextension.model.ExtensionResult
import io.legado.app.vbookextension.model.LoadedExtension
import io.legado.app.help.book.BookCompletionStatus
import io.legado.app.help.book.resolveBookCompletionStatus
import io.legado.app.help.book.resolveExtensionCompletionStatus
import io.legado.app.help.book.withCompletionStatus
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.*
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class ExtensionRepository(
    private val context: Context,
    private val extensionLoader: ExtensionLoader,
    private val extensionRunner: VBookJsExtensionRunner,
) {
    companion object {
        private const val TAG = "ExtRepo"

        fun isExtensionId(sourceUrl: String): Boolean {
            return sourceUrl.startsWith("ext_")
        }

        fun getSlugFromId(sourceUrl: String): String {
            return if (sourceUrl.startsWith("ext_")) {
                sourceUrl.substring(4)
            } else {
                sourceUrl
            }
        }
    }

    private val json = Json { ignoreUnknownKeys = true; isLenient = true }

    private fun cleanHtmlText(text: String): String {
        return text.replace(Regex("<[^>]*>"), "").trim()
    }

    private fun resolveUrl(rawUrl: String, host: String, sourceUrl: String): String {
        if (rawUrl.isBlank()) return ""
        if (rawUrl.startsWith("http://") || rawUrl.startsWith("https://")) return rawUrl
        
        val base = if (host.isNotBlank()) host else {
            try {
                val uri = java.net.URI(sourceUrl)
                "${uri.scheme}://${uri.host}"
            } catch (e: Exception) {
                sourceUrl
            }
        }
        return if (rawUrl.startsWith("/")) {
            "${base.trimEnd('/')}$rawUrl"
        } else {
            "${base.trimEnd('/')}/$rawUrl"
        }
    }

    private fun JsonElement.safeString(): String {
        return (this as? JsonPrimitive)?.content ?: ""
    }

    private fun parseNovelFromJson(
        obj: JsonObject,
        extensionId: String,
        sourceUrl: String,
        extensionType: String
    ): SearchBook {
        val rawUrl = obj["url"]?.safeString()
            ?: obj["link"]?.safeString()
            ?: obj["path"]?.safeString()
            ?: ""
        
        val host = obj["host"]?.safeString() ?: ""
        val resolvedUrl = resolveUrl(rawUrl, host, sourceUrl)

        val rawCover = obj["cover"]?.safeString()
            ?: obj["image"]?.safeString()
            ?: ""
        val resolvedCover = resolveUrl(rawCover, host, sourceUrl)

        val rawTitle = obj["title"]?.safeString() 
            ?: obj["name"]?.safeString() 
            ?: ""
        val title = cleanHtmlText(rawTitle)

        val author = cleanHtmlText(obj["author"]?.safeString() ?: "")
        val intro = cleanHtmlText(obj["description"]?.safeString() ?: obj["desc"]?.safeString() ?: "")

        val genresList = mutableListOf<String>()
        obj["genres"]?.let { genElement ->
            try {
                if (genElement is JsonArray) {
                    genElement.forEach { item ->
                        if (item is JsonObject) {
                            val genreTitle = item["title"]?.safeString() ?: item["name"]?.safeString()
                            if (!genreTitle.isNullOrBlank()) {
                                genresList.add(cleanHtmlText(genreTitle))
                            }
                        } else if (item is JsonPrimitive) {
                            genresList.add(cleanHtmlText(item.content))
                        }
                    }
                } else if (genElement is JsonPrimitive) {
                    genresList.add(cleanHtmlText(genElement.content))
                }
            } catch (e: Exception) {
                // ignore
            }
        }
        val kind = genresList.joinToString(",")

        val latestChapter = cleanHtmlText(obj["latestChapter"]?.safeString() ?: obj["lastChapter"]?.safeString() ?: "")

        val wordCountRaw = obj["wordCount"]?.safeString()
            ?: obj["words"]?.safeString()
            ?: obj["word_count"]?.safeString()
            ?: obj["wordCountText"]?.safeString()
            ?: ""
        val wordCount = cleanHtmlText(wordCountRaw)

        val capitalizedName = extensionId.replace("-", " ").replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }

        val parsedType = obj["type"]?.safeString()
            ?: obj["is_comic"]?.safeString()?.let { if (it == "true" || it == "1" || it == "comic") "comic" else "novel" }
        val finalTypeStr = parsedType ?: extensionType
        val bookType = when {
            finalTypeStr.equals("comic", ignoreCase = true) ||
            finalTypeStr.equals("manga", ignoreCase = true) ||
            finalTypeStr.equals("image", ignoreCase = true) -> io.legado.app.constant.BookType.image

            finalTypeStr.equals("video", ignoreCase = true) ||
            finalTypeStr.equals("movie", ignoreCase = true) -> io.legado.app.constant.BookType.video

            finalTypeStr.equals("audio", ignoreCase = true) -> io.legado.app.constant.BookType.audio

            else -> io.legado.app.constant.BookType.text
        }

        val explicitStatus = listOf(
            "status",
            "bookStatus",
            "book_status",
            "state",
            "novelStatus",
            "novel_status"
        ).firstNotNullOfOrNull { key ->
            obj[key]?.safeString()?.takeIf(String::isNotBlank)
        }

        val boolCompletedElement = listOf(
            "completed",
            "isCompleted",
            "is_completed",
            "finished",
            "isFinished",
            "is_finished"
        ).firstNotNullOfOrNull { key ->
            (obj[key] as? JsonPrimitive)?.content
        }

        val completionStatus = resolveExtensionCompletionStatus(explicitStatus, boolCompletedElement, kind)
        val finalType = bookType.withCompletionStatus(completionStatus)

        return SearchBook(
            bookUrl = resolvedUrl,
            origin = "ext_$extensionId",
            originName = capitalizedName,
            type = finalType,
            name = title,
            author = author,
            coverUrl = resolvedCover,
            intro = intro,
            kind = kind.takeIf { it.isNotBlank() },
            wordCount = wordCount.takeIf { it.isNotBlank() },
            latestChapterTitle = latestChapter,
            time = System.currentTimeMillis()
        )
    }

    private fun checkExtensionErrorCode(element: JsonElement) {
        if (element is JsonObject) {
            val code = element["code"]?.safeString()?.toIntOrNull() ?: 0
            if (code != 0) {
                val errorMsg = element["data"]?.safeString() 
                    ?: element["message"]?.safeString() 
                    ?: "Lỗi tải dữ liệu từ extension"
                throw Exception("Lỗi từ extension: $errorMsg")
            }
        }
    }

    suspend fun exploreBooks(
        sourceUrl: String,
        exploreUrl: String,
        page: Int,
        logCollector: MutableList<String>? = null
    ): List<SearchBook> = withContext(Dispatchers.IO) {
        val extensionId = getSlugFromId(sourceUrl)
        val extension = extensionLoader.loadExtension(extensionId) ?: return@withContext emptyList()
        val extSourceUrl = extension.pluginJson.metadata.source ?: ""

        val parts = exploreUrl.split("||", limit = 2)
        val tabScript = parts.getOrNull(0) ?: ""
        val tabInput = parts.getOrNull(1) ?: ""

        val finalScript = if (tabScript.isBlank()) {
            extension.pluginJson.script["genre"] ?: extension.pluginJson.script["category"] ?: ""
        } else {
            tabScript
        }

        if (finalScript.isBlank()) {
            Log.e(TAG, "Both tabScript and genre script are empty for extension $extensionId")
            return@withContext emptyList()
        }

        val result = extensionRunner.execute(extension, finalScript, tabInput, page.toString(), logCollector = logCollector)
        return@withContext when (result) {
            is ExtensionResult.Success -> {
                try {
                    val element = json.parseToJsonElement(result.data)
                    checkExtensionErrorCode(element)
                    val items = if (element is JsonArray) {
                        element
                    } else {
                        val obj = element as? JsonObject
                        val dataElement = obj?.get("data")
                        val itemsElement = obj?.get("items")
                        when {
                            dataElement is JsonArray -> dataElement
                            itemsElement is JsonArray -> itemsElement
                            dataElement is JsonObject && dataElement.containsKey("items") -> dataElement["items"] as? JsonArray
                            else -> {
                                (obj?.get("list") as? JsonArray) ?: JsonArray(emptyList())
                            }
                        }
                    }
                    items?.mapNotNull { (it as? JsonObject)?.let { item -> parseNovelFromJson(item, extensionId, extSourceUrl, extension.pluginJson.metadata.type) } } ?: emptyList()
                } catch (e: Exception) {
                    Log.e(TAG, "Failed to parse novels list for $extensionId: ${e.message}")
                    emptyList()
                }
            }
            is ExtensionResult.Error -> {
                Log.e(TAG, "Extension error: ${result.message}")
                emptyList()
            }
        }
    }

    suspend fun searchBooks(sourceUrl: String, keyword: String, page: Int): List<SearchBook> = withContext(Dispatchers.IO) {
        val extensionId = getSlugFromId(sourceUrl)
        val extension = extensionLoader.loadExtension(extensionId) ?: return@withContext emptyList()
        val extSourceUrl = extension.pluginJson.metadata.source ?: ""

        if (!extension.pluginJson.script.containsKey(ScriptType.SEARCH.key)) {
            Log.e(TAG, "Search script not found in plugin.json for extension $extensionId")
            return@withContext emptyList()
        }

        val searchScript = extension.pluginJson.script[ScriptType.SEARCH.key] ?: ""
        val result = extensionRunner.execute(extension, searchScript, keyword, page.toString())
        return@withContext when (result) {
            is ExtensionResult.Success -> {
                try {
                    val element = json.parseToJsonElement(result.data)
                    checkExtensionErrorCode(element)
                    val items = if (element is JsonArray) {
                        element
                    } else {
                        val obj = element as? JsonObject
                        val dataElement = obj?.get("data")
                        val itemsElement = obj?.get("items")
                        when {
                            dataElement is JsonArray -> dataElement
                            itemsElement is JsonArray -> itemsElement
                            dataElement is JsonObject && dataElement.containsKey("items") -> dataElement["items"] as? JsonArray
                            else -> {
                                (obj?.get("list") as? JsonArray) ?: JsonArray(emptyList())
                            }
                        }
                    }
                    items?.mapNotNull { (it as? JsonObject)?.let { item -> parseNovelFromJson(item, extensionId, extSourceUrl, extension.pluginJson.metadata.type) } } ?: emptyList()
                } catch (e: Exception) {
                    Log.e(TAG, "Failed to parse search books list for $extensionId: ${e.message}")
                    emptyList()
                }
            }
            is ExtensionResult.Error -> {
                Log.e(TAG, "Extension search error: ${result.message}")
                emptyList()
            }
        }
    }

    private fun parseKinds(result: ExtensionResult, extensionId: String): List<ExploreKind> {
        return when (result) {
            is ExtensionResult.Success -> {
                try {
                    val element = json.parseToJsonElement(result.data)
                    checkExtensionErrorCode(element)
                    val array = if (element is JsonArray) {
                        element
                    } else {
                        val obj = element as? JsonObject
                        (obj?.get("data") as? JsonArray) ?: (obj?.get("items") as? JsonArray) ?: JsonArray(emptyList())
                    }
                    array.mapNotNull { tabObj ->
                        val obj = tabObj as? JsonObject ?: return@mapNotNull null
                        val title = obj["title"]?.safeString() ?: obj["name"]?.safeString() ?: ""
                        val input = obj["input"]?.safeString() ?: ""
                        val script = obj["script"]?.safeString() ?: ""
                        if (title.isNotBlank()) {
                            ExploreKind(
                                title = title,
                                url = "$script||$input"
                            )
                        } else null
                    }
                } catch (e: Exception) {
                    Log.e(TAG, "Failed to parse explore kinds for $extensionId: ${e.message}")
                    emptyList()
                }
            }
            is ExtensionResult.Error -> {
                Log.e(TAG, "Failed to load explore kinds: ${result.message}")
                emptyList()
            }
        }
    }

    suspend fun getHomeKinds(
        sourceUrl: String,
        logCollector: MutableList<String>? = null
    ): List<ExploreKind> = withContext(Dispatchers.IO) {
        val extensionId = getSlugFromId(sourceUrl)
        val extension = extensionLoader.loadExtension(extensionId) ?: return@withContext emptyList()
        val result = extensionRunner.execute(extension, ScriptType.HOME, "1", logCollector = logCollector)
        parseKinds(result, extensionId)
    }

    suspend fun getGenreKinds(
        sourceUrl: String,
        logCollector: MutableList<String>? = null
    ): List<ExploreKind> = withContext(Dispatchers.IO) {
        val extensionId = getSlugFromId(sourceUrl)
        val extension = extensionLoader.loadExtension(extensionId) ?: return@withContext emptyList()
        if (!extension.pluginJson.script.containsKey(ScriptType.GENRE.key)) {
            return@withContext emptyList()
        }
        val result = extensionRunner.execute(extension, ScriptType.GENRE, "1", logCollector = logCollector)
        parseKinds(result, extensionId)
    }

    suspend fun getSourceExploreKinds(
        sourceUrl: String,
        logCollector: MutableList<String>? = null
    ): List<ExploreKind> {
        val genres = getGenreKinds(sourceUrl, logCollector)
        if (genres.isNotEmpty()) return genres
        return getHomeKinds(sourceUrl, logCollector)
    }

    suspend fun getBookDetail(
        sourceUrl: String,
        bookUrl: String,
        logCollector: MutableList<String>? = null
    ): Book? = withContext(Dispatchers.IO) {
        val extensionId = getSlugFromId(sourceUrl)
        val extension = extensionLoader.loadExtension(extensionId) ?: return@withContext null
        val extSourceUrl = extension.pluginJson.metadata.source ?: ""
        val result = extensionRunner.execute(extension, ScriptType.DETAIL, bookUrl, logCollector = logCollector)
        return@withContext when (result) {
            is ExtensionResult.Success -> {
                try {
                    val element = json.parseToJsonElement(result.data)
                    checkExtensionErrorCode(element)
                    val rootObj = element as? JsonObject ?: return@withContext null
                    val dataObj = rootObj["data"]
                    val targetObj = if (dataObj is JsonObject) dataObj else rootObj
                    val searchBook = parseNovelFromJson(targetObj, extensionId, extSourceUrl, extension.pluginJson.metadata.type)
                    val book = searchBook.toBook()
                    if (book.bookUrl.isBlank()) {
                        book.bookUrl = bookUrl
                    }
                    book
                } catch (e: Exception) {
                    Log.e(TAG, "Failed to parse book detail for $extensionId: ${e.message}")
                    null
                }
            }
            is ExtensionResult.Error -> {
                Log.e(TAG, "Failed to load book detail: ${result.message}")
                null
            }
        }
    }

    suspend fun getTableOfContents(
        sourceUrl: String,
        bookUrl: String,
        logCollector: MutableList<String>? = null
    ): List<BookChapter> = withContext(Dispatchers.IO) {
        val extensionId = getSlugFromId(sourceUrl)
        val extension = extensionLoader.loadExtension(extensionId) ?: return@withContext emptyList()
        val extSourceUrl = extension.pluginJson.metadata.source ?: ""

        val parseTocData = { dataStr: String ->
            try {
                val element = json.parseToJsonElement(dataStr)
                checkExtensionErrorCode(element)
                val items = if (element is JsonArray) {
                    element
                } else {
                    val obj = element as? JsonObject
                    (obj?.get("items") as? JsonArray) 
                        ?: (obj?.get("data") as? JsonArray) 
                        ?: (obj?.get("chapters") as? JsonArray) 
                        ?: (obj?.get("list") as? JsonArray) 
                        ?: JsonArray(emptyList())
                }
                items.mapIndexedNotNull { index, item ->
                    val obj = item as? JsonObject ?: return@mapIndexedNotNull null
                    val isSection = obj["type"]?.safeString() == "section"
                    val rawTitle = obj["title"]?.safeString() 
                        ?: obj["name"]?.safeString() 
                        ?: "Chương ${index + 1}"
                    val title = cleanHtmlText(rawTitle)
                    val rawUrl = if (isSection) {
                        "section://$title"
                    } else {
                        obj["url"]?.safeString() 
                            ?: obj["link"]?.safeString()
                            ?: obj["path"]?.safeString()
                            ?: ""
                    }
                    val host = if (isSection) "" else (obj["host"]?.safeString() ?: "")
                    val resolvedUrl = if (isSection) rawUrl else resolveUrl(rawUrl, host, extSourceUrl)
                    BookChapter(
                        url = resolvedUrl,
                        title = title,
                        index = index,
                        bookUrl = bookUrl,
                        isVolume = isSection,
                        baseUrl = bookUrl
                    )
                }
            } catch (e: Exception) {
                Log.e(TAG, "Failed to parse TOC for $extensionId: ${e.message}")
                emptyList()
            }
        }

        if (extension.pluginJson.script.containsKey("page")) {
            val pageResult = extensionRunner.execute(extension, ScriptType.PAGE, bookUrl, logCollector = logCollector)
            when (pageResult) {
                is ExtensionResult.Success -> {
                    try {
                        val element = json.parseToJsonElement(pageResult.data)
                        val array = if (element is JsonArray) {
                            element
                        } else {
                            val obj = element as? JsonObject
                            (obj?.get("data") as? JsonArray) ?: (obj?.get("items") as? JsonArray) ?: JsonArray(emptyList())
                        }
                        val urls = array.mapNotNull { it.safeString() }
                        val allChapters = mutableListOf<BookChapter>()
                        urls.forEach { ajaxUrl ->
                            val tocResult = extensionRunner.execute(extension, ScriptType.TOC, ajaxUrl, "1", logCollector = logCollector)
                            if (tocResult is ExtensionResult.Success) {
                                allChapters.addAll(parseTocData(tocResult.data))
                            }
                        }
                        allChapters.mapIndexed { index, chapter ->
                            chapter.copy(index = index)
                        }
                    } catch (e: Exception) {
                        Log.e(TAG, "Failed to parse page.js output for $extensionId: ${e.message}")
                        emptyList()
                    }
                }
                is ExtensionResult.Error -> emptyList()
            }
        } else {
            val result = extensionRunner.execute(extension, ScriptType.TOC, bookUrl, "1", logCollector = logCollector)
            parseTocData(when (result) {
                is ExtensionResult.Success -> result.data
                is ExtensionResult.Error -> ""
            })
        }
    }

    suspend fun getChapterContent(
        sourceUrl: String,
        chapterUrl: String,
        logCollector: MutableList<String>? = null
    ): String? = withContext(Dispatchers.IO) {
        val extensionId = getSlugFromId(sourceUrl)
        val extension = extensionLoader.loadExtension(extensionId) ?: return@withContext null
        val result = extensionRunner.execute(extension, ScriptType.CHAP, chapterUrl, logCollector = logCollector)
        return@withContext when (result) {
            is ExtensionResult.Success -> {
                try {
                    val isVideo = extension.pluginJson.metadata.type == "video" ||
                            extension.pluginJson.metadata.type == "movie" ||
                            extension.pluginJson.metadata.type == "anime"
                    if (isVideo) {
                        val rawContent = result.data
                        val unwrappedContent = try {
                            if (rawContent.trim().startsWith("{")) {
                                val element = json.parseToJsonElement(rawContent)
                                checkExtensionErrorCode(element)

                                val obj = org.json.JSONObject(rawContent)
                                if (obj.has("code") && obj.optJSONArray("data") != null) {
                                    obj.getJSONArray("data").toString()
                                } else {
                                    rawContent
                                }
                            } else {
                                rawContent
                            }
                        } catch (e: Exception) {
                            if (e.message?.startsWith("Lỗi từ extension:") == true) {
                                throw e
                            }
                            rawContent
                        }
                        unwrappedContent
                    } else {
                        val element = json.parseToJsonElement(result.data)
                        checkExtensionErrorCode(element)
                        val content = if (element is JsonObject) {
                            val dataElement = element["data"]
                            val targetObj = if (dataElement is JsonObject) dataElement else element
                            val rawContent = targetObj["content"]?.safeString()
                                ?: targetObj["text"]?.safeString()
                                ?: (if (dataElement is JsonPrimitive) dataElement.content else null)
                            
                            val imagesElement = targetObj["images"] ?: targetObj["urls"] ?: targetObj["list"] ?: dataElement
                            if (imagesElement is JsonArray) {
                                val imgUrls = imagesElement.mapNotNull {
                                    if (it is JsonPrimitive) it.content
                                    else if (it is JsonObject) {
                                        it["link"]?.safeString() ?: it["url"]?.safeString() ?: it["src"]?.safeString()
                                    } else null
                                }
                                if (imgUrls.isNotEmpty()) {
                                    return@withContext imgUrls.joinToString("\n") { "<img src=\"$it\">" }
                                }
                            }
                            rawContent
                        } else if (element is JsonPrimitive) {
                            element.content
                        } else null

                        if (content != null) {
                            val urlObj = try { java.net.URL(chapterUrl) } catch (e: Exception) { null }
                            var formatted = io.legado.app.utils.HtmlFormatter.formatKeepImg(content, urlObj)
                            if (formatted.contains('&')) {
                                formatted = org.apache.commons.text.StringEscapeUtils.unescapeHtml4(formatted)
                            }
                            formatted
                        } else {
                            null
                        }
                    }
                } catch (e: Exception) {
                    Log.e(TAG, "Failed to parse chapter content for $extensionId: ${e.message}")
                    null
                }
            }
            is ExtensionResult.Error -> {
                Log.e(TAG, "Failed to load chapter content: ${result.message}")
                null
            }
        }
    }

    suspend fun executeExtension(
        extensionId: String,
        scriptType: ScriptType,
        vararg args: String,
    ): ExtensionResult = withContext(Dispatchers.IO) {
        val extension = extensionLoader.loadExtension(extensionId)
            ?: return@withContext ExtensionResult.Error("Extension not found: $extensionId")
        return@withContext extensionRunner.execute(extension, scriptType, *args)
    }

    suspend fun getExtension(extensionId: String): LoadedExtension? = withContext(Dispatchers.IO) {
        extensionLoader.loadExtension(extensionId)
    }

    suspend fun debugExtension(
        sourceUrl: String,
        mode: io.legado.app.vbookextension.model.ExtensionDebugMode = io.legado.app.vbookextension.model.ExtensionDebugMode.FULL,
        input: String,
        onLog: (state: Int, log: String) -> Unit
    ): io.legado.app.vbookextension.model.ExtensionDebugResult = withContext(Dispatchers.IO) {
        val startTime = System.currentTimeMillis()
        val timeFormat = SimpleDateFormat("[mm:ss.SSS]", Locale.getDefault())

        fun sanitize(msg: String): String {
            var clean = msg
            clean = clean.replace(Regex("""(?i)\b(Authorization|Proxy-Authorization|Cookie)\s*:\s*[^\r\n]+""")) { match ->
                val headerName = match.value.substringBefore(":")
                "$headerName: ***"
            }
            clean = clean.replace(Regex("""(?i)\b(token|password|authorization|cookie|api[_-]?key|secret|license[_-]?token)=[^;&\s\r\n]+""")) { match ->
                val key = match.value.substringBefore("=")
                "$key=***"
            }
            clean = clean.replace(Regex("""(?i)"(token|password|authorization|cookie|apiKey|api[_-]?key|secret|licenseToken|license[_-]?token)"\s*:\s*"(?:[^"\\]|\\.)*"""")) { match ->
                val key = match.value.substringBefore(":")
                "$key: \"***\""
            }
            return clean
        }

        suspend fun printLog(msg: String, state: Int = 1) {
            val timeStr = timeFormat.format(Date(System.currentTimeMillis() - startTime))
            val cleanMsg = sanitize(msg)
            withContext(Dispatchers.Main) {
                onLog(state, "$timeStr $cleanMsg")
            }
        }

        val extensionId = getSlugFromId(sourceUrl)
        printLog("⇒Bắt đầu kiểm tra nguồn Extension: $sourceUrl [$mode]")
        val extension = extensionLoader.loadExtension(extensionId)
        if (extension == null) {
            printLog("≡Nguồn Extension không tồn tại hoặc lỗi tải", state = -1)
            return@withContext io.legado.app.vbookextension.model.ExtensionDebugResult(success = false)
        }
        printLog("≡Đã tải Extension thành công: ${extension.pluginJson.metadata.name} v${extension.pluginJson.metadata.version}", state = 2)

        val extSourceUrl = extension.pluginJson.metadata.source ?: ""
        val logCollector = mutableListOf<String>()

        suspend fun flushLogs() {
            if (logCollector.isNotEmpty()) {
                logCollector.forEach { printLog(it) }
                logCollector.clear()
            }
        }

        suspend fun runSearch(keyword: String): SearchBook? {
            if (!extension.pluginJson.script.containsKey(ScriptType.SEARCH.key)) {
                printLog("≡Script tìm kiếm (search.js) không tồn tại", state = -1)
                return null
            }
            val searchKeyword = keyword.ifBlank { "của tôi" }
            printLog("⇒Bắt đầu tìm kiếm từ khóa: $searchKeyword")
            logCollector.clear()
            val searchResult = extensionRunner.execute(extension, ScriptType.SEARCH, searchKeyword, "1", logCollector = logCollector)
            flushLogs()

            return when (searchResult) {
                is ExtensionResult.Success -> {
                    printLog("≡Đã nhận kết quả tìm kiếm", state = 2)
                    try {
                        val element = json.parseToJsonElement(searchResult.data)
                        checkExtensionErrorCode(element)
                        val items = if (element is JsonArray) element else {
                            val obj = element as? JsonObject
                            val dataElement = obj?.get("data")
                            val itemsElement = obj?.get("items")
                            when {
                                dataElement is JsonArray -> dataElement
                                itemsElement is JsonArray -> itemsElement
                                dataElement is JsonObject && dataElement.containsKey("items") -> dataElement["items"] as? JsonArray
                                else -> (obj?.get("list") as? JsonArray) ?: JsonArray(emptyList())
                            }
                        }
                        val searchBooks = items?.mapNotNull { (it as? JsonObject)?.let { item -> parseNovelFromJson(item, extensionId, extSourceUrl, extension.pluginJson.metadata.type) } } ?: emptyList()
                        printLog("◇Số lượng kết quả: ${searchBooks.size}")
                        val firstBook = searchBooks.firstOrNull()
                        if (firstBook != null) {
                            printLog("┌Nhận tên sách: ${firstBook.name}")
                            printLog("┌Tác giả: ${firstBook.author.ifBlank { "Không có" }}")
                            printLog("┌URL sách: ${firstBook.bookUrl}")
                            val latestTitle = firstBook.latestChapterTitle?.ifBlank { "Không có" } ?: "Không có"
                            printLog("┌Mới nhất: $latestTitle")
                            firstBook
                        } else {
                            printLog("≡Không tìm thấy sách nào phù hợp", state = -1)
                            null
                        }
                    } catch (e: Exception) {
                        printLog("≡Lỗi phân tích kết quả tìm kiếm: ${e.message}", state = -1)
                        null
                    }
                }
                is ExtensionResult.Error -> {
                    printLog("≡Lỗi khi tìm kiếm: ${searchResult.message}", state = -1)
                    null
                }
            }
        }

        suspend fun runExplore(rawInput: String, testAllKinds: Boolean = false): SearchBook? {
            logCollector.clear()
            val kinds = getSourceExploreKinds(sourceUrl, logCollector)
            flushLogs()

            val hasExploreScript = extension.pluginJson.script.containsKey(ScriptType.GENRE.key) ||
                    extension.pluginJson.script.containsKey(ScriptType.HOME.key)
            if (!hasExploreScript && kinds.isEmpty()) {
                printLog("≡Script khám phá (genre.js / home.js) không tồn tại", state = -1)
                return null
            }

            if (testAllKinds) {
                printLog("≡Danh sách mục khám phá: ${kinds.size} mục")
                kinds.forEach { kind ->
                    printLog("┌Mục: ${kind.title} (${kind.url})")
                }

                if (kinds.isNotEmpty()) {
                    var successCount = 0
                    var firstSampleBook: SearchBook? = null

                    for (i in kinds.indices) {
                        val kind = kinds[i]
                        printLog("⇒[${i + 1}/${kinds.size}] Kiểm tra mục: ${kind.title}")
                        logCollector.clear()
                        val books = exploreBooks(sourceUrl, kind.url ?: "", 1, logCollector)
                        flushLogs()

                        val sample = books.firstOrNull()
                        if (sample != null) {
                            successCount++
                            if (firstSampleBook == null) {
                                firstSampleBook = sample
                            }
                            printLog("◇Số truyện nhận được: ${books.size}")
                            printLog("┌Truyện mẫu: ${sample.name}", state = 2)
                            printLog("┌Tác giả: ${sample.author.ifBlank { "Không có" }}")
                            printLog("┌URL sách: ${sample.bookUrl}")
                        } else {
                            printLog("≡Mục ${kind.title} lỗi hoặc không có truyện", state = -1)
                        }
                    }

                    val overallState = if (successCount > 0) 2 else -1
                    printLog("≡Khám phá hoàn tất: $successCount/${kinds.size} mục có truyện", state = overallState)
                    return firstSampleBook
                } else {
                    printLog("⇒Bắt đầu khám phá mặc định")
                    logCollector.clear()
                    val exploreBooksList = exploreBooks(sourceUrl, "", 1, logCollector)
                    flushLogs()

                    val first = exploreBooksList.firstOrNull()
                    if (first != null) {
                        printLog("┌Truyện mẫu: ${first.name}", state = 2)
                        printLog("┌Tác giả: ${first.author.ifBlank { "Không có" }}")
                        printLog("┌URL sách: ${first.bookUrl}")
                        printLog("≡Hoàn tất kiểm tra Khám phá!", state = 2)
                        return first
                    } else {
                        printLog("≡Không nhận được sách nào từ mục khám phá", state = -1)
                        return null
                    }
                }
            } else {
                printLog("≡Danh sách mục khám phá: ${kinds.size} mục")
                kinds.forEach { kind ->
                    printLog("┌Mục: ${kind.title} (${kind.url})")
                }

                val targetKind = if (rawInput.isNotBlank()) {
                    kinds.find { (it.title != null && it.title.contains(rawInput, ignoreCase = true)) || (it.url != null && it.url.contains(rawInput, ignoreCase = true)) }
                        ?: ExploreKind(title = rawInput, url = rawInput)
                } else {
                    kinds.firstOrNull()
                }

                val targetUrl = targetKind?.url ?: ""
                printLog("⇒Bắt đầu khám phá mục: ${targetKind?.title ?: "Mặc định"} [$targetUrl]")
                logCollector.clear()
                val exploreBooksList = exploreBooks(sourceUrl, targetUrl, 1, logCollector)
                flushLogs()

                printLog("◇Số lượng kết quả khám phá: ${exploreBooksList.size}")
                val first = exploreBooksList.firstOrNull()
                if (first != null) {
                    printLog("┌Sách đầu tiên: ${first.name}", state = 2)
                    printLog("┌Tác giả: ${first.author.ifBlank { "Không có" }}")
                    printLog("┌URL sách: ${first.bookUrl}")
                    printLog("≡Hoàn tất kiểm tra Khám phá!", state = 2)
                    return first
                } else {
                    printLog("≡Không nhận được sách nào từ mục khám phá", state = -1)
                    return null
                }
            }
        }

        suspend fun runDetail(bookUrl: String): Book? {
            if (!bookUrl.startsWith("http://") && !bookUrl.startsWith("https://")) {
                printLog("≡Vui lòng nhập URL sách hợp lệ (bắt đầu bằng http:// hoặc https://)", state = -1)
                return null
            }
            if (!extension.pluginJson.script.containsKey(ScriptType.DETAIL.key)) {
                printLog("≡Script chi tiết (detail.js) không tồn tại", state = -1)
                return null
            }

            printLog("⇒Bắt đầu phân tích trang chi tiết: $bookUrl")
            logCollector.clear()
            val book = getBookDetail(sourceUrl, bookUrl, logCollector)
            flushLogs()

            if (book != null) {
                printLog("≈Hoàn tất phân tích trang chi tiết", state = 2)
                printLog("┌Tên sách: ${book.name}")
                printLog("┌Tác giả: ${book.author.ifBlank { "Không có" }}")
                val coverStr = book.coverUrl?.ifBlank { "Không có" } ?: "Không có"
                printLog("┌Ảnh bìa: $coverStr")
                printLog("┌Thể loại: ${book.kind ?: "Không có"}")
                printLog("┌Chương mới nhất: ${book.latestChapterTitle ?: "Không có"}")
                val introDesc = if (book.intro.isNullOrBlank()) "Không có" else "${book.intro?.length} ký tự"
                printLog("┌Giới thiệu: $introDesc")
                return book
            } else {
                printLog("≡Lỗi tải hoặc phân tích trang chi tiết sách", state = -1)
                return null
            }
        }

        suspend fun runToc(bookUrl: String): List<BookChapter> {
            if (!bookUrl.startsWith("http://") && !bookUrl.startsWith("https://")) {
                printLog("≡Vui lòng nhập URL sách hợp lệ để lấy mục lục", state = -1)
                return emptyList()
            }
            val hasTocScript = extension.pluginJson.script.containsKey(ScriptType.TOC.key) ||
                    extension.pluginJson.script.containsKey(ScriptType.PAGE.key)
            if (!hasTocScript) {
                printLog("≡Script mục lục (toc.js / page.js) không tồn tại", state = -1)
                return emptyList()
            }

            printLog("⇒Bắt đầu lấy danh sách chương: $bookUrl")
            logCollector.clear()
            val chapters = getTableOfContents(sourceUrl, bookUrl, logCollector)
            flushLogs()

            printLog("≡Tổng số chương: ${chapters.size}")
            if (chapters.isNotEmpty()) {
                val first = chapters.firstOrNull { !it.isVolume } ?: chapters.first()
                val last = chapters.lastOrNull { !it.isVolume } ?: chapters.last()
                printLog("┌Chương đầu: ${first.title} (${first.url})")
                printLog("┌Chương cuối: ${last.title} (${last.url})")
            } else {
                printLog("≡Không lấy được danh sách chương", state = -1)
            }
            return chapters
        }

        suspend fun runContent(chapterUrl: String): String? {
            if (!chapterUrl.startsWith("http://") && !chapterUrl.startsWith("https://") && !chapterUrl.startsWith("section://")) {
                printLog("≡Vui lòng nhập URL chương hợp lệ", state = -1)
                return null
            }
            if (!extension.pluginJson.script.containsKey(ScriptType.CHAP.key)) {
                printLog("≡Script nội dung (chap.js) không tồn tại", state = -1)
                return null
            }

            printLog("⇒Bắt đầu lấy nội dung chương: $chapterUrl")
            logCollector.clear()
            val content = getChapterContent(sourceUrl, chapterUrl, logCollector)
            flushLogs()

            val extType = extension.pluginJson.metadata.type.lowercase()
            val isMedia = extType == "comic" || extType == "manga" || extType == "video" || extType == "movie" || extType == "anime"

            return if (!content.isNullOrBlank()) {
                if (isMedia) {
                    printLog("└Đã lấy dữ liệu $extType: ${content.length} ký tự / danh sách media", state = 2)
                } else {
                    val snippet = cleanHtmlText(content).take(150).replace("\n", " ")
                    printLog("└Nội dung văn bản: $snippet...", state = 2)
                    printLog("≡Độ dài nội dung: ${content.length} ký tự", state = 2)
                }
                printLog("≡Hoàn tất kiểm tra nội dung!", state = 2)
                content
            } else {
                printLog("≡Không lấy được nội dung chương", state = -1)
                null
            }
        }

        return@withContext when (mode) {
            io.legado.app.vbookextension.model.ExtensionDebugMode.SEARCH -> {
                val firstBook = runSearch(input)
                if (firstBook != null) {
                    io.legado.app.vbookextension.model.ExtensionDebugResult(
                        success = true,
                        bookUrl = firstBook.bookUrl
                    )
                } else {
                    io.legado.app.vbookextension.model.ExtensionDebugResult(success = false)
                }
            }
            io.legado.app.vbookextension.model.ExtensionDebugMode.EXPLORE -> {
                val sampleBook = runExplore(input, testAllKinds = input.isBlank())
                if (sampleBook != null) {
                    io.legado.app.vbookextension.model.ExtensionDebugResult(
                        success = true,
                        bookUrl = sampleBook.bookUrl
                    )
                } else {
                    io.legado.app.vbookextension.model.ExtensionDebugResult(success = false)
                }
            }
            io.legado.app.vbookextension.model.ExtensionDebugMode.DETAIL -> {
                val book = runDetail(input)
                if (book != null) {
                    io.legado.app.vbookextension.model.ExtensionDebugResult(
                        success = true,
                        bookUrl = book.bookUrl
                    )
                } else {
                    io.legado.app.vbookextension.model.ExtensionDebugResult(success = false)
                }
            }
            io.legado.app.vbookextension.model.ExtensionDebugMode.TOC -> {
                val chapters = runToc(input)
                val firstChap = chapters.firstOrNull { !it.isVolume } ?: chapters.firstOrNull()
                if (chapters.isNotEmpty() && firstChap != null) {
                    io.legado.app.vbookextension.model.ExtensionDebugResult(
                        success = true,
                        bookUrl = input,
                        chapterUrl = firstChap.url
                    )
                } else {
                    io.legado.app.vbookextension.model.ExtensionDebugResult(success = false)
                }
            }
            io.legado.app.vbookextension.model.ExtensionDebugMode.CONTENT -> {
                val content = runContent(input)
                io.legado.app.vbookextension.model.ExtensionDebugResult(
                    success = content != null,
                    chapterUrl = input,
                    chapterContent = content
                )
            }
            io.legado.app.vbookextension.model.ExtensionDebugMode.FULL -> {
                val directBookUrl = input.takeIf { it.startsWith("http://") || it.startsWith("https://") }

                val discoveredBook = if (directBookUrl == null) {
                    if (extension.pluginJson.script.containsKey(ScriptType.SEARCH.key)) {
                        runSearch(input)
                    }

                    val exploreBook = runExplore("", testAllKinds = true)
                    if (exploreBook == null) {
                        printLog("≡Không lấy được truyện từ bất kỳ mục Khám phá nào", state = -1)
                        return@withContext io.legado.app.vbookextension.model.ExtensionDebugResult(success = false)
                    }
                    printLog("┌Đã chọn truyện từ Khám phá: ${exploreBook.name}")
                    exploreBook
                } else {
                    null
                }

                val targetBookUrl = directBookUrl ?: discoveredBook?.bookUrl

                if (targetBookUrl.isNullOrBlank()) {
                    printLog("≡Không có URL truyện hợp lệ", state = -1)
                    return@withContext io.legado.app.vbookextension.model.ExtensionDebugResult(success = false)
                }

                val detailBook = runDetail(targetBookUrl)
                    ?: return@withContext io.legado.app.vbookextension.model.ExtensionDebugResult(success = false)

                val chapters = runToc(targetBookUrl)
                val firstChapter = chapters.firstOrNull { !it.isVolume } ?: chapters.firstOrNull()

                if (firstChapter == null) {
                    printLog("≡Không có chương nào để kiểm tra nội dung", state = -1)
                    return@withContext io.legado.app.vbookextension.model.ExtensionDebugResult(success = false)
                }

                printLog("┌Đã chọn chương đầu: ${firstChapter.title} (${firstChapter.url})")
                val content = runContent(firstChapter.url)

                if (content.isNullOrBlank()) {
                    printLog("≡Kiểm tra tổng quát thất bại ở bước Nội dung", state = -1)
                    return@withContext io.legado.app.vbookextension.model.ExtensionDebugResult(success = false)
                }

                printLog("≡Hoàn tất kiểm tra tổng quát Extension!", state = 2)
                io.legado.app.vbookextension.model.ExtensionDebugResult(
                    success = true,
                    bookUrl = targetBookUrl,
                    chapterUrl = firstChapter.url,
                    chapterContent = content
                )
            }
        }
    }
}
