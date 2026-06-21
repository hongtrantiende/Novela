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
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.*

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

        val capitalizedName = extensionId.replace("-", " ").replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }

        val parsedType = obj["type"]?.safeString()
            ?: obj["is_comic"]?.safeString()?.let { if (it == "true" || it == "1" || it == "comic") "comic" else "novel" }
        val finalTypeStr = parsedType ?: extensionType
        val isComic = finalTypeStr.equals("comic", ignoreCase = true)
                || finalTypeStr.equals("manga", ignoreCase = true)
                || finalTypeStr.equals("image", ignoreCase = true)
        val bookType = if (isComic) io.legado.app.constant.BookType.image else io.legado.app.constant.BookType.text

        return SearchBook(
            bookUrl = resolvedUrl,
            origin = "ext_$extensionId",
            originName = capitalizedName,
            type = bookType,
            name = title,
            author = author,
            coverUrl = resolvedCover,
            intro = intro,
            kind = kind,
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

    suspend fun exploreBooks(sourceUrl: String, exploreUrl: String, page: Int): List<SearchBook> = withContext(Dispatchers.IO) {
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

        val result = extensionRunner.execute(extension, finalScript, tabInput, page.toString())
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

    suspend fun getHomeKinds(sourceUrl: String): List<ExploreKind> = withContext(Dispatchers.IO) {
        val extensionId = getSlugFromId(sourceUrl)
        val extension = extensionLoader.loadExtension(extensionId) ?: return@withContext emptyList()
        val result = extensionRunner.execute(extension, ScriptType.HOME, "1")
        parseKinds(result, extensionId)
    }

    suspend fun getGenreKinds(sourceUrl: String): List<ExploreKind> = withContext(Dispatchers.IO) {
        val extensionId = getSlugFromId(sourceUrl)
        val extension = extensionLoader.loadExtension(extensionId) ?: return@withContext emptyList()
        if (!extension.pluginJson.script.containsKey(ScriptType.GENRE.key)) {
            return@withContext emptyList()
        }
        val result = extensionRunner.execute(extension, ScriptType.GENRE, "1")
        parseKinds(result, extensionId)
    }

    suspend fun getSourceExploreKinds(sourceUrl: String): List<ExploreKind> {
        val genres = getGenreKinds(sourceUrl)
        if (genres.isNotEmpty()) return genres
        return getHomeKinds(sourceUrl)
    }

    suspend fun getBookDetail(sourceUrl: String, bookUrl: String): Book? = withContext(Dispatchers.IO) {
        val extensionId = getSlugFromId(sourceUrl)
        val extension = extensionLoader.loadExtension(extensionId) ?: return@withContext null
        val extSourceUrl = extension.pluginJson.metadata.source ?: ""
        val result = extensionRunner.execute(extension, ScriptType.DETAIL, bookUrl)
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

    suspend fun getTableOfContents(sourceUrl: String, bookUrl: String): List<BookChapter> = withContext(Dispatchers.IO) {
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
            val pageResult = extensionRunner.execute(extension, ScriptType.PAGE, bookUrl)
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
                            val tocResult = extensionRunner.execute(extension, ScriptType.TOC, ajaxUrl, "1")
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
            val result = extensionRunner.execute(extension, ScriptType.TOC, bookUrl, "1")
            parseTocData(when (result) {
                is ExtensionResult.Success -> result.data
                is ExtensionResult.Error -> ""
            })
        }
    }

    suspend fun getChapterContent(sourceUrl: String, chapterUrl: String): String? = withContext(Dispatchers.IO) {
        val extensionId = getSlugFromId(sourceUrl)
        val extension = extensionLoader.loadExtension(extensionId) ?: return@withContext null
        val result = extensionRunner.execute(extension, ScriptType.CHAP, chapterUrl)
        return@withContext when (result) {
            is ExtensionResult.Success -> {
                try {
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
}
