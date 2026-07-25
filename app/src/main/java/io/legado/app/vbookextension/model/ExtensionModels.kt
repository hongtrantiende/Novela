package io.legado.app.vbookextension.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import io.legado.app.vbookextension.runtime.VBookExtensionDecryptor
import java.io.File
import java.text.Normalizer
import java.util.Locale

import kotlinx.serialization.json.*

@Serializable
data class ExtensionSetting(
    val key: String = "",
    val title: String = "",
    val type: String = "text", // "text" | "password" | "boolean" | "select"
    val default: String = "",
    val desc: String? = null,
    val choices: List<String>? = null,
    val mode: String? = null,
    val format: String? = null,
)

@Serializable
data class PluginJson(
    val metadata: PluginMetadata,
    val script: Map<String, String> = emptyMap(),
    @SerialName("settings") val rawSettings: JsonElement? = null,
    @SerialName("config") val rawConfig: JsonElement? = null,
) {
    val settings: List<ExtensionSetting> get() = getParsedSettings()

    fun getParsedSettings(): List<ExtensionSetting> {
        val list = mutableListOf<ExtensionSetting>()

        fun parseFromJsonObject(obj: JsonObject) {
            for ((key, element) in obj) {
                when (element) {
                    is JsonObject -> {
                        val title = element["title"]?.jsonPrimitive?.contentOrNull ?: key
                        val mode = element["mode"]?.jsonPrimitive?.contentOrNull
                        val format = element["format"]?.jsonPrimitive?.contentOrNull
                        val type = element["type"]?.jsonPrimitive?.contentOrNull ?: format ?: mode ?: "text"
                        val default = element["default"]?.jsonPrimitive?.contentOrNull ?: ""
                        val desc = element["desc"]?.jsonPrimitive?.contentOrNull
                            ?: element["description"]?.jsonPrimitive?.contentOrNull
                        val choices = element["choices"]?.jsonArray?.mapNotNull { it.jsonPrimitive.contentOrNull }
                            ?: element["options"]?.jsonArray?.mapNotNull { it.jsonPrimitive.contentOrNull }

                        list.add(
                            ExtensionSetting(
                                key = key,
                                title = title,
                                type = type,
                                default = default,
                                desc = desc,
                                choices = choices,
                                mode = mode,
                                format = format
                            )
                        )
                    }
                    else -> {}
                }
            }
        }

        rawSettings?.let { element ->
            when (element) {
                is JsonArray -> {
                    element.forEach { item ->
                        if (item is JsonObject) {
                            val key = item["key"]?.jsonPrimitive?.contentOrNull ?: ""
                            val title = item["title"]?.jsonPrimitive?.contentOrNull ?: key
                            val type = item["type"]?.jsonPrimitive?.contentOrNull ?: "text"
                            val default = item["default"]?.jsonPrimitive?.contentOrNull ?: ""
                            val desc = item["desc"]?.jsonPrimitive?.contentOrNull
                            val choices = item["choices"]?.jsonArray?.mapNotNull { it.jsonPrimitive.contentOrNull }
                            if (key.isNotBlank()) {
                                list.add(
                                    ExtensionSetting(
                                        key = key,
                                        title = title,
                                        type = type,
                                        default = default,
                                        desc = desc,
                                        choices = choices
                                    )
                                )
                            }
                        }
                    }
                }
                is JsonObject -> {
                    parseFromJsonObject(element)
                }
                else -> {}
            }
        }

        if (list.isEmpty() && rawConfig is JsonObject) {
            parseFromJsonObject(rawConfig)
        }

        return list.filterNot { setting ->
            val k = setting.key.lowercase()
            k == "thread_num" || k == "delay" || k == "thread" || k == "delay_time" || k == "threadnum"
        }
    }
}

@Serializable
data class PluginMetadata(
    val name: String,
    val author: String = "Unknown",
    val version: Double = 1.0,
    val source: String = "",
    val regexp: String? = null,
    val description: String = "",
    val locale: String = "vi_VN",
    val type: String = "novel",
    val language: String = "javascript",
    val encrypt: Boolean = false,
)

@Serializable
data class ExtensionInfo(
    val name: String,
    val author: String = "Unknown",
    val version: Double = 1.0,
    val source: String = "",
    val path: String = "",           // URL download plugin.zip
    val icon: String = "",           // URL icon
    val description: String = "",
    val type: String = "novel",      // "novel" | "comic"
    val locale: String = "vi_VN",
    val public: Boolean = false,
)

@Serializable
data class RepositoryIndex(
    val metadata: RepositoryMetadata? = null,
    val data: List<ExtensionInfo> = emptyList(),
)

@Serializable
data class RepositoryMetadata(
    val author: String = "",
    val description: String = "",
)

data class LoadedExtension(
    val pluginJson: PluginJson,
    val directory: File,
) {
    fun getScriptContent(fileName: String): String {
        val srcFile = File(directory, "src/$fileName")
        val content = if (srcFile.exists()) {
            srcFile.readText()
        } else {
            val rootFile = File(directory, fileName)
            if (rootFile.exists()) {
                rootFile.readText()
            } else {
                throw ExtensionException("Script file not found: $fileName in ${directory.absolutePath}")
            }
        }

        var finalContent = content
        if (pluginJson.metadata.encrypt) {
            val decrypted = VBookExtensionDecryptor.decrypt(
                content,
                pluginJson.metadata.source,
                pluginJson.metadata.author
            )
            if (decrypted != null) {
                finalContent = decrypted
            }
        }

        // Vá lỗi truyencv.io Regex match[0] null crash
        if (id == "truyencv-io" && fileName == "detail.js") {
            val oldRegex = """html.select("div.uk-text-truncate").text().match(/\d+(?=\s*Chương)/)[0]"""
            val safeRegex = """(function(){ var m = html.select("div.uk-text-truncate").text().match(/\d+(?=\s*Chương)/); return m ? m[0] : "Chưa rõ"; })()"""
            finalContent = finalContent.replace(oldRegex, safeRegex)
        }

        // Vá lỗi regex /story_id=(\d+)$/ và /chapter_id=(\d+)$/ khi url có query parameter
        finalContent = finalContent.replace(Regex("""(let|var|const)\s+storyId\s*=\s*/story_id=\(\\d\)\+\$/\.exec\(url\)\[1\];""")) { matchResult ->
            val keyword = matchResult.groupValues[1]
            "$keyword storyId = (function() { var m = /story_id=(\\d+)/.exec(url); return m ? m[1] : ''; })();"
        }
        finalContent = finalContent.replace(Regex("""(let|var|const)\s+chapterId\s*=\s*/chapter_id=\(\\d\)\+\$/\.exec\(url\)\[1\];""")) { matchResult ->
            val keyword = matchResult.groupValues[1]
            "$keyword chapterId = (function() { var m = /chapter_id=(\\d+)/.exec(url); return m ? m[1] : ''; })();"
        }

        // Tự động fallback tên miền Sáng Tác Việt nếu bị chặn ở Việt Nam
        /* if (id == "sang-tac-viet" || id.startsWith("stv")) {
            finalContent = finalContent
                .replace("https://sangtacviet.vip", "https://sangtacviet.com")
                .replace("http://sangtacviet.vip", "https://sangtacviet.com")
                .replace("https://sangtacviet.pro", "https://sangtacviet.com")
                .replace("http://sangtacviet.pro", "https://sangtacviet.com")
                .replace("https://dns1.stv-appdomain-00000001.org", "https://sangtacviet.com")
                .replace("http://dns1.stv-appdomain-00000001.org", "https://sangtacviet.com")
                .replace("http://14.225.254.182", "https://sangtacviet.com")
                .replace("https://14.225.254.182", "https://sangtacviet.com")
        } */

        finalContent = finalContent.replace("\r\n", "\n")

        // Sửa lỗi tìm kiếm tác giả và phân trang cho tiện ích Sáng Tác Việt
        if ((id.contains("sang-tac-viet") || id.contains("stv") || id.contains("sangtacviet")) && fileName == "search.js") {
            // 1. Thêm trường author vào đối tượng sách trả về trong stvToSearchItem
            val oldReturn = """    return {
        name: name,
        link: stvBuildPublicBookUrl(bookHost, bookId, book.status || 1, base),"""
            val newReturn = """    return {
        name: name,
        author: author,
        link: stvBuildPublicBookUrl(bookHost, bookId, book.status || 1, base),"""
            finalContent = finalContent.replace(oldReturn, newReturn)

            // 2. Chuyển pageIndex sang 0-indexed
            val oldPageIndex = """    var pageIndex = parseInt(stvTrim(page || "0"), 10);
    if (isNaN(pageIndex) || pageIndex < 0) pageIndex = 0;"""
            val newPageIndex = """    var pageIndex = parseInt(stvTrim(page || "1"), 10) - 1;
    if (isNaN(pageIndex) || pageIndex < 0) pageIndex = 0;"""
            finalContent = finalContent.replace(oldPageIndex, newPageIndex)

            // 3. Giới hạn chỉ lấy 20 kết quả đầu tiên của trang để tránh trùng lặp do cơ chế tích lũy
            val oldLoop = """    var out = [];
    for (var i = 0; i < json.list.length; i++) {
        out.push(stvToSearchItem(found.base, json.list[i] || {}));
    }"""
            val newLoop = """    var out = [];
            var limit = Math.min(json.list.length, 20);
            for (var i = 0; i < limit; i++) {
                out.push(stvToSearchItem(found.base, json.list[i] || {}));
            }"""
            finalContent = finalContent.replace(oldLoop, newLoop)

            // 4. Cập nhật chỉ số trang tiếp theo trả về (next)
            val oldNext = """    var next = null;
    if (out.length > 0) {
        next = String(pageIndex + 1);
    }"""
            val newNext = """    var next = null;
    if (out.length > 0) {
        next = String(pageIndex + 2);
    }"""
            finalContent = finalContent.replace(oldNext, newNext)
        }

        return finalContent
    }

    fun getIconFile(): File? {
        val file = File(directory, "icon.png")
        return if (file.exists()) file else null
    }

    val id: String get() {
        val normalized = Normalizer.normalize(pluginJson.metadata.name, Normalizer.Form.NFD)
            .replace(Regex("[\\p{InCombiningDiacriticalMarks}]"), "")
        return normalized
            .lowercase(Locale.ROOT)
            .replace("đ", "d").replace("Đ", "d")
            .replace(Regex("[^a-z0-9]"), "-")
            .replace(Regex("-+"), "-")
            .trim('-')
    }
}

class ExtensionException(message: String) : Exception(message)

sealed class ExtensionResult {
    data class Success(val data: String) : ExtensionResult()
    data class Error(val message: String) : ExtensionResult()
}

enum class ExtensionDebugMode {
    FULL,
    SEARCH,
    EXPLORE,
    DETAIL,
    TOC,
    CONTENT
}

enum class ScriptType(val key: String) {
    HOME("home"),
    GENRE("genre"),
    DETAIL("detail"),
    SEARCH("search"),
    PAGE("page"),          // Comic: danh sách ảnh của chapter
    TOC("toc"),
    CHAP("chap"),
    TRACK("track"),        // Video
    VOICE("voice"),        // TTS
    TTS("tts"),
    SUGGEST("suggest"),
    COMMENT("comment"),
    LANGUAGE("language"),
    HOMECONTENT("homecontent"),
    ;

    companion object {
        fun fromKey(key: String): ScriptType? = entries.find { it.key == key }
    }
}

val ExtensionInfo.cleanName: String
    get() {
        var clean = name
        // 1. Loại bỏ các phần trong ngoặc tròn/vuông chứa "Đăng Nhập", "Login", "VPN", "🔑", "🌐"
        val bracketKeywordsRegex = Regex("""[(\[][^()\n\[\]]*(đăng nhập|login|vpn|🔑|🌐)[^()\n\[\]]*[)\]]""", RegexOption.IGNORE_CASE)
        clean = bracketKeywordsRegex.replace(clean, "")

        // 2. Loại bỏ các từ khóa đăng nhập, vpn riêng lẻ nếu có
        val standaloneKeywordsRegex = Regex("\\b(đăng nhập|login|vpn)\\b", RegexOption.IGNORE_CASE)
        clean = standaloneKeywordsRegex.replace(clean, "")
        clean = clean.replace("🔑", "").replace("🌐", "")

        // 3. Loại bỏ hoàn toàn ký tự đóng mở ngoặc nhưng giữ chữ bên trong
        clean = clean.replace("(", "").replace(")", "").replace("[", "").replace("]", "")

        // 4. Loại bỏ khoảng trắng thừa
        clean = clean.replace(Regex("\\s+"), " ").trim()

        return clean
    }

data class ExtensionDebugResult(
    val success: Boolean,
    val bookUrl: String? = null,
    val chapterUrl: String? = null,
    val chapterContent: String? = null
)
