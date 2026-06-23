package io.legado.app.vbookextension.loader

import android.content.Context
import android.util.Log
import io.legado.app.vbookextension.data.dao.ExtensionDao
import io.legado.app.vbookextension.data.dao.RepositoryDao
import io.legado.app.vbookextension.data.entity.ExtensionEntity
import io.legado.app.vbookextension.data.entity.RepositoryEntity
import io.legado.app.vbookextension.model.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.File
import java.io.FileOutputStream
import java.util.zip.ZipInputStream

class ExtensionLoader(
    private val appContext: Context,
    private val httpClient: OkHttpClient,
    private val extensionDao: ExtensionDao,
    private val repositoryDao: RepositoryDao,
) {
    companion object {
        private const val TAG = "ExtLoader"
        val DEFAULT_REPO_URL = "https://raw.githubusercontent.com/hongtrantiende/Extransion-TTC/main/plugin.json"
    }

    private val json = Json { ignoreUnknownKeys = true; isLenient = true }
    private val extensionsDir = File(appContext.filesDir, "extensions")
    private val cache = mutableMapOf<String, LoadedExtension>()

    fun clearCache(extensionId: String? = null) {
        if (extensionId != null) {
            cache.remove(extensionId)
        } else {
            cache.clear()
        }
    }

    private fun newRequest(url: String): Request {
        val builder = Request.Builder().url(url)
        if (url.contains("raw.githubusercontent.com/hongtrantiende/") || url.contains("githubusercontent.com/hongtrantiende/")) {
            builder.header("Authorization", "token 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")
        }
        return builder.build()
    }

    init {
        extensionsDir.mkdirs()
    }

    suspend fun fetchBuiltInExtensions(): List<ExtensionInfo> = withContext(Dispatchers.IO) {
        try {
            val folders = appContext.assets.list("extensions") ?: return@withContext emptyList()
            folders.mapNotNull { folderName ->
                try {
                    val pluginJsonStr = appContext.assets
                        .open("extensions/$folderName/plugin.json")
                        .bufferedReader().use { it.readText() }
                    val pluginJson = json.decodeFromString<PluginJson>(pluginJsonStr.replace("\uFEFF", ""))
                    val meta = pluginJson.metadata

                    val hasIcon = try {
                        appContext.assets.open("extensions/$folderName/icon.png").close()
                        true
                    } catch (e: Exception) { false }

                    ExtensionInfo(
                        name = meta.name,
                        author = meta.author,
                        version = meta.version,
                        source = meta.source,
                        path = "file:///android_asset/extensions/$folderName",
                        icon = if (hasIcon) "file:///android_asset/extensions/$folderName/icon.png" else "",
                        description = meta.description,
                        type = getNormalizedType(meta.name, meta.source, meta.type),
                        locale = getNormalizedLocale(meta.name, meta.source, meta.locale),
                    )
                } catch (e: Exception) {
                    Log.w(TAG, "Skipped extension folder: $folderName — ${e.message}")
                    null
                }
            }
        } catch (e: Throwable) {
            Log.e(TAG, "fetchBuiltInExtensions failed", e)
            emptyList()
        }
    }

    suspend fun fetchRepository(repoUrl: String): List<ExtensionInfo> = withContext(Dispatchers.IO) {
        try {
            val body = if (repoUrl.startsWith("file:///android_asset/")) {
                val assetPath = repoUrl.substringAfter("file:///android_asset/")
                appContext.assets.open(assetPath).bufferedReader().use { it.readText() }
            } else {
                val fetchUrl = if (repoUrl.startsWith("http")) {
                    val separator = if (repoUrl.contains("?")) "&" else "?"
                    "$repoUrl${separator}t=${System.currentTimeMillis()}"
                } else {
                    repoUrl
                }
                val request = newRequest(fetchUrl)
                val response = httpClient.newCall(request).execute()
                response.body?.string() ?: return@withContext emptyList()
            }

            val repo = json.decodeFromString<RepositoryIndex>(body.replace("\uFEFF", ""))
            repo.data.map { ext ->
                if (ext.icon.isBlank() && ext.path.isNotBlank()) {
                    if (ext.path.contains("/zips/")) {
                        val base = ext.path.substringBefore("/zips/")
                        val zipName = ext.path.substringAfter("/zips/").substringBefore(".zip")
                        val iconName = when (val cleaned = zipName
                            .replace(".net", "")
                            .replace(".com", "")
                            .replace(".vn", "")
                            .replace(".org", "")
                            .replace(".cc", "")
                            .replace("-ver-dich", "")) {
                            "biqugezz" -> "biquge"
                            "ixdzs8" -> "ixdzs"
                            "uukanshu" -> "uushuk"
                            else -> cleaned
                        }
                        val fileExt = when (iconName) {
                            "me-truyen-chu-vn", "lwxs", "pi12345", "xiaoshubao" -> "ico"
                            "h528" -> "jpg"
                            else -> "png"
                        }
                        ext.copy(icon = "$base/icons/$iconName.$fileExt")
                    } else if (ext.path.contains("/plugins/")) {
                        val base = ext.path.substringBefore("/plugins/")
                        val zipName = ext.path.substringAfter("/plugins/").substringBefore(".zip")
                        val iconName = when (val cleaned = zipName
                            .replace(".net", "")
                            .replace(".com", "")
                            .replace(".vn", "")
                            .replace(".org", "")
                            .replace(".cc", "")
                            .replace("-ver-dich", "")) {
                            "biqugezz" -> "biquge"
                            "ixdzs8" -> "ixdzs"
                            "uukanshu" -> "uushuk"
                            else -> cleaned
                        }
                        val fileExt = when (iconName) {
                            "me-truyen-chu-vn", "lwxs", "pi12345", "xiaoshubao" -> "ico"
                            "h528" -> "jpg"
                            else -> "png"
                        }
                        ext.copy(icon = "$base/icons/$iconName.$fileExt")
                    } else {
                        ext
                    }
                } else {
                    ext
                }
            }
        } catch (e: Throwable) {
            Log.e(TAG, "Failed to fetch repo: $repoUrl", e)
            emptyList()
        }
    }

    suspend fun installExtension(info: ExtensionInfo): LoadedExtension? = withContext(Dispatchers.IO) {
        try {
            val extId = info.name.toSlug()
            val extDir = File(extensionsDir, extId)
            extDir.deleteRecursively()
            extDir.mkdirs()

            val pluginJson: PluginJson
            var iconPath: String? = null

            if (info.path.startsWith("file:///android_asset/") && !info.path.endsWith(".zip")) {
                val assetPath = info.path.substringAfter("file:///android_asset/")
                Log.d(TAG, "Installing unzipped extension folder from assets: $assetPath")
                copyAssetFolder(assetPath, extDir)

                val pluginJsonFile = File(extDir, "plugin.json")
                if (!pluginJsonFile.exists()) {
                    throw ExtensionException("plugin.json not found in asset extension folder: ${info.name}")
                }
                pluginJson = json.decodeFromString<PluginJson>(pluginJsonFile.readText().replace("\uFEFF", ""))

                val iconFile = File(extDir, "icon.png")
                if (iconFile.exists()) {
                    iconPath = iconFile.absolutePath
                }
            } else {
                Log.d(TAG, "Loading extension: ${info.name} from ${info.path}")
                val zipBytes = if (info.path.startsWith("file:///android_asset/")) {
                    val assetPath = info.path.substringAfter("file:///android_asset/")
                    appContext.assets.open(assetPath).use { it.readBytes() }
                } else {
                    val zipRequest = newRequest(info.path)
                    val zipResponse = httpClient.newCall(zipRequest).execute()
                    zipResponse.body?.bytes() ?: throw ExtensionException("Empty download")
                }

                ZipInputStream(zipBytes.inputStream()).use { zip ->
                    var entry = zip.nextEntry
                    while (entry != null) {
                        val normalizedName = entry.name.replace('\\', '/')
                        val outFile = File(extDir, normalizedName)
                        if (entry.isDirectory || normalizedName.endsWith("/")) {
                            outFile.mkdirs()
                        } else {
                            outFile.parentFile?.mkdirs()
                            FileOutputStream(outFile).use { out ->
                                zip.copyTo(out)
                            }
                        }
                        zip.closeEntry()
                        entry = zip.nextEntry
                    }
                }

                val pluginJsonFile = File(extDir, "plugin.json")
                if (!pluginJsonFile.exists()) {
                    throw ExtensionException("plugin.json not found in extension: ${info.name}")
                }
                pluginJson = json.decodeFromString<PluginJson>(pluginJsonFile.readText().replace("\uFEFF", ""))

                if (info.icon.isNotBlank()) {
                    try {
                        val iconFile = File(extDir, "icon.png")
                        val iconBytes = if (info.icon.startsWith("file:///android_asset/")) {
                            val assetPath = info.icon.substringAfter("file:///android_asset/")
                            appContext.assets.open(assetPath).use { it.readBytes() }
                        } else if (info.icon.startsWith("/") && File(info.icon).exists()) {
                            File(info.icon).readBytes()
                        } else {
                            val iconRequest = newRequest(info.icon)
                            httpClient.newCall(iconRequest).execute().body?.bytes()
                        }
                        iconBytes?.let {
                            iconFile.writeBytes(it)
                            iconPath = iconFile.absolutePath
                        }
                    } catch (e: Exception) {
                        Log.w(TAG, "Failed to load icon for ${info.name}: ${e.message}")
                    }
                }

                if (iconPath == null) {
                    val localIconFile = File(extDir, "icon.png")
                    if (localIconFile.exists()) {
                        iconPath = localIconFile.absolutePath
                    }
                }
            }

            val normalizedType = getNormalizedType(info.name, info.source, info.type)
            val normalizedLocale = getNormalizedLocale(info.name, info.source, info.locale)
            extensionDao.insert(
                ExtensionEntity(
                    id = extId,
                    name = info.name,
                    author = info.author,
                    version = info.version.toInt(),
                    source = info.source,
                    type = normalizedType,
                    locale = normalizedLocale,
                    description = info.description,
                    localPath = extDir.absolutePath,
                    iconPath = iconPath,
                    isInstalled = true,
                    isEnabled = true,
                )
            )

            val loaded = LoadedExtension(pluginJson, extDir)
            cache[extId] = loaded
            Log.d(TAG, "✅ Installed extension: ${info.name}")
            loaded
        } catch (e: Throwable) {
            Log.e(TAG, "Failed to install extension: ${info.name}", e)
            null
        }
    }

    suspend fun installExtensionFromUrl(url: String): LoadedExtension? = withContext(Dispatchers.IO) {
        try {
            Log.d(TAG, "Downloading extension from URL: $url")
            val zipRequest = newRequest(url)
            val zipResponse = httpClient.newCall(zipRequest).execute()
            val zipBytes = zipResponse.body?.bytes() ?: throw ExtensionException("Tải tiện ích thất bại: empty body")

            val tempDir = File(appContext.cacheDir, "temp_ext_${System.currentTimeMillis()}")
            tempDir.deleteRecursively()
            tempDir.mkdirs()

            ZipInputStream(zipBytes.inputStream()).use { zip ->
                var entry = zip.nextEntry
                while (entry != null) {
                    val normalizedName = entry.name.replace('\\', '/')
                    val outFile = File(tempDir, normalizedName)
                    if (entry.isDirectory || normalizedName.endsWith("/")) {
                        outFile.mkdirs()
                    } else {
                        outFile.parentFile?.mkdirs()
                        FileOutputStream(outFile).use { out ->
                            zip.copyTo(out)
                        }
                    }
                    zip.closeEntry()
                    entry = zip.nextEntry
                }
            }

            val pluginJsonFile = File(tempDir, "plugin.json")
            if (!pluginJsonFile.exists()) {
                tempDir.deleteRecursively()
                throw ExtensionException("plugin.json not found in extension zip")
            }

            val pluginJson = json.decodeFromString<PluginJson>(pluginJsonFile.readText().replace("\uFEFF", ""))
            val meta = pluginJson.metadata
            val extId = meta.name.toSlug()
            val extDir = File(extensionsDir, extId)
            extDir.deleteRecursively()
            
            if (!tempDir.renameTo(extDir)) {
                tempDir.copyRecursively(extDir, overwrite = true)
                tempDir.deleteRecursively()
            }

            val normalizedType = getNormalizedType(meta.name, meta.source, meta.type)
            val normalizedLocale = getNormalizedLocale(meta.name, meta.source, meta.locale)
            
            val iconFile = File(extDir, "icon.png")
            val iconPath = if (iconFile.exists()) iconFile.absolutePath else null

            val entity = ExtensionEntity(
                id = extId,
                name = meta.name,
                author = meta.author,
                version = meta.version.toInt(),
                source = meta.source,
                type = normalizedType,
                locale = normalizedLocale,
                description = meta.description,
                localPath = extDir.absolutePath,
                iconPath = iconPath,
                isInstalled = true,
                isEnabled = true,
            )
            extensionDao.insert(entity)

            val loaded = LoadedExtension(pluginJson, extDir)
            cache[extId] = loaded
            Log.d(TAG, "✅ Installed extension from URL: ${meta.name}")
            loaded
        } catch (e: Throwable) {
            Log.e(TAG, "Failed to install extension from URL: $url", e)
            throw e
        }
    }

    suspend fun loadExtension(extensionId: String): LoadedExtension? {
        cache[extensionId]?.let { return it }

        return withContext(Dispatchers.IO) {
            try {
                val entity = extensionDao.getExtensionById(extensionId) ?: return@withContext null
                val extDir = File(entity.localPath)
                if (!extDir.exists()) return@withContext null

                val pluginJsonFile = File(extDir, "plugin.json")
                if (!pluginJsonFile.exists()) return@withContext null

                val pluginJson = json.decodeFromString<PluginJson>(pluginJsonFile.readText().replace("\uFEFF", ""))
                val loaded = LoadedExtension(pluginJson, extDir)
                cache[extensionId] = loaded
                loaded
            } catch (e: Throwable) {
                Log.e(TAG, "Failed to load extension: $extensionId", e)
                null
            }
        }
    }

    suspend fun uninstallExtension(extensionId: String) = withContext(Dispatchers.IO) {
        try {
            val entity = extensionDao.getExtensionById(extensionId)
            entity?.let {
                File(it.localPath).deleteRecursively()
                extensionDao.delete(it)
                cache.remove(extensionId)
            }
        } catch (e: Throwable) {
            Log.e(TAG, "Failed to uninstall extension: $extensionId", e)
        }
    }

    suspend fun ensureDefaultRepository() {
        val repos = repositoryDao.getEnabledRepositories()
        
        repos.forEach { repo ->
            if (repo.url == "file:///android_asset/plugin.json") {
                repositoryDao.delete(repo)
            }
            if (repo.url == "https://raw.githubusercontent.com/hongtrantiende/APK-TTC/main/plugin.json") {
                repositoryDao.delete(repo)
            }
        }

        repos.forEach { repo ->
            if (repo.url == "https://www.vbookext.me/api/plugin.json") {
                repositoryDao.insert(repo.copy(url = DEFAULT_REPO_URL, name = "Thư viện Tiện ích (GitHub)"))
            }
        }

        val hasDefault = repos.any { it.url == DEFAULT_REPO_URL }
        if (!hasDefault) {
            repositoryDao.insert(
                RepositoryEntity(
                    url = DEFAULT_REPO_URL,
                    name = "Thư viện Tiện ích (GitHub)",
                )
            )
        }
    }

    private fun copyAssetFolder(assetPath: String, targetDir: File) {
        val assets = appContext.assets.list(assetPath)
        if (assets.isNullOrEmpty()) {
            try {
                appContext.assets.open(assetPath).use { input ->
                    targetDir.parentFile?.mkdirs()
                    FileOutputStream(targetDir).use { output ->
                        input.copyTo(output)
                    }
                }
            } catch (e: Exception) {
                targetDir.mkdirs()
            }
        } else {
            targetDir.mkdirs()
            for (asset in assets) {
                val childAssetPath = if (assetPath.isEmpty()) asset else "$assetPath/$asset"
                val childTargetFile = File(targetDir, asset)
                copyAssetFolder(childAssetPath, childTargetFile)
            }
        }
    }

    private fun String.toSlug(): String {
        val normalized = java.text.Normalizer.normalize(this, java.text.Normalizer.Form.NFD)
            .replace(Regex("[\\p{InCombiningDiacriticalMarks}]"), "")
        return normalized
            .lowercase()
            .replace("đ", "d").replace("Đ", "d")
            .replace(Regex("[^a-z0-9]"), "-")
            .replace(Regex("-+"), "-")
            .trim('-')
    }

    suspend fun autoFixExtensionTypes() = withContext(Dispatchers.IO) {
        try {
            val installed = extensionDao.getEnabledExtensions()
            for (ext in installed) {
                val newType = getNormalizedType(ext.name, ext.source, ext.type)
                val newLocale = getNormalizedLocale(ext.name, ext.source, ext.locale)
                if (newType != ext.type || newLocale != ext.locale) {
                    extensionDao.insert(ext.copy(type = newType, locale = newLocale))
                    Log.d(TAG, "Auto-fixed extension: ${ext.name} [type: ${ext.type} -> $newType, locale: ${ext.locale} -> $newLocale]")
                }
            }
        } catch (e: Throwable) {
            Log.e(TAG, "Failed to auto-fix extension types: ${e.message}", e)
        }
    }

    private fun getNormalizedLocale(name: String, source: String, currentLocale: String): String {
        val cleanName = name.lowercase(java.util.Locale.ROOT)
        val cleanSource = source.lowercase(java.util.Locale.ROOT)
        val hasChineseChar = name.any { it.code in 0x4E00..0x9FFF }
        
        val isChinese = currentLocale.startsWith("zh", ignoreCase = true) || 
                        currentLocale.startsWith("cn", ignoreCase = true) ||
                        currentLocale.equals("chi", ignoreCase = true) ||
                        currentLocale.equals("zho", ignoreCase = true) ||
                        hasChineseChar ||
                        cleanSource.contains(".cn") ||
                        cleanSource.contains("69shu") ||
                        cleanSource.contains("biquge") ||
                        cleanSource.contains("qimao") ||
                        cleanSource.contains("sfacg") ||
                        cleanSource.contains("faloo") ||
                        cleanSource.contains("tadu") ||
                        cleanSource.contains("piaotian") ||
                        cleanSource.contains("uukanshu") ||
                        cleanSource.contains("hetushu") ||
                        cleanSource.contains("wenku8") ||
                        cleanSource.contains("bixiange") ||
                        cleanSource.contains("uuks") ||
                        cleanSource.contains("shuku") ||
                        cleanSource.contains("sjks") ||
                        cleanSource.contains("po18") ||
                        cleanSource.contains("twkan") ||
                        cleanSource.contains("ranwen") ||
                        cleanSource.contains("bqg") ||
                        cleanSource.contains("fanqie") ||
                        cleanSource.contains("zhihu") ||
                        cleanSource.contains("qq.com") ||
                        cleanSource.contains("ixunshu") ||
                        cleanSource.contains("gongzicp") ||
                        cleanSource.contains("shubl") ||
                        cleanSource.contains("20xs") ||
                        cleanSource.contains("trxs") ||
                        cleanSource.contains("baozimh") ||
                        cleanSource.contains("wnacg") ||
                        cleanSource.contains("dmxs") ||
                        cleanSource.contains("xbanxia") ||
                        cleanSource.contains("czbooks") ||
                        cleanSource.contains("xianqihaotianmi") ||
                        cleanSource.contains("tushumi")

        val isVietnameseTranslate = cleanSource.contains("sangtacviet") || 
                                    cleanSource.contains("14.225.254.182") || 
                                    cleanName.contains("stv") ||
                                    cleanSource.contains("metruyencv") || 
                                    cleanName.contains("mtc") ||
                                    cleanSource.contains("truyen35") ||
                                    cleanName.contains("truyện 35")

        return if (isChinese && !isVietnameseTranslate) {
            "zh_CN"
        } else {
            currentLocale
        }
    }

    private fun getNormalizedType(name: String, source: String, rawType: String): String {
        val cleanName = name.lowercase(java.util.Locale.ROOT)
        val cleanSource = source.lowercase(java.util.Locale.ROOT)
        return when {
            cleanSource.contains("sangtacviet") || cleanSource.contains("14.225.254.182") || cleanName.contains("stv") -> "novel"
            cleanSource.contains("tvtruyen") || cleanName.contains("tvtruyen") -> "novel"
            cleanSource.contains("truyentv") || cleanName.contains("truyện tv") -> "novel"
            cleanSource.contains("shinigamilnteam") || cleanName.contains("shinigami") -> "novel"
            cleanSource.contains("wnacg") || cleanName.contains("wnacg") -> "comic"
            cleanSource.contains("myreadingmanga") || cleanName.contains("myreadingmanga") -> "comic"
            cleanSource.contains("truyenqq") || cleanName.contains("truyện qq") || cleanName.contains("truyenqq") || cleanSource.contains("qqko") -> "comic"
            cleanSource.contains("ac.qq.com") || cleanName.contains("ac qq") -> "comic"
            cleanSource.contains("8muses") || cleanName.contains("8muses") -> "comic"
            cleanName.contains("scans") || cleanName.contains("raw") || cleanName.contains("sexy") || cleanSource.contains("scans") || cleanSource.contains("rawdevart") -> "comic"
            else -> rawType
        }
    }

    suspend fun installExtensionFromZip(extId: String, zipBytes: ByteArray): LoadedExtension? = withContext(Dispatchers.IO) {
        try {
            val extDir = File(extensionsDir, extId)
            extDir.deleteRecursively()
            extDir.mkdirs()

            ZipInputStream(zipBytes.inputStream()).use { zip ->
                var entry = zip.nextEntry
                while (entry != null) {
                    val normalizedName = entry.name.replace('\\', '/')
                    val outFile = File(extDir, normalizedName)
                    if (entry.isDirectory || normalizedName.endsWith("/")) {
                        outFile.mkdirs()
                    } else {
                        outFile.parentFile?.mkdirs()
                        FileOutputStream(outFile).use { out ->
                            zip.copyTo(out)
                        }
                    }
                    zip.closeEntry()
                    entry = zip.nextEntry
                }
            }

            val pluginJsonFile = File(extDir, "plugin.json")
            if (!pluginJsonFile.exists()) {
                throw ExtensionException("plugin.json not found in restored extension")
            }
            val pluginJson = json.decodeFromString<PluginJson>(pluginJsonFile.readText().replace("\uFEFF", ""))
            val meta = pluginJson.metadata

            val localIconFile = File(extDir, "icon.png")
            val iconPath = if (localIconFile.exists()) localIconFile.absolutePath else null

            val normalizedType = getNormalizedType(meta.name, meta.source, meta.type)
            val normalizedLocale = getNormalizedLocale(meta.name, meta.source, meta.locale)
            extensionDao.insert(
                ExtensionEntity(
                    id = extId,
                    name = meta.name,
                    author = meta.author,
                    version = meta.version.toInt(),
                    source = meta.source,
                    type = normalizedType,
                    locale = normalizedLocale,
                    description = meta.description ?: "",
                    localPath = extDir.absolutePath,
                    iconPath = iconPath,
                    isInstalled = true,
                    isEnabled = true,
                )
            )

            val loaded = LoadedExtension(pluginJson, extDir)
            cache[extId] = loaded
            Log.d(TAG, "✅ Restored extension from backup: ${meta.name}")
            loaded
        } catch (e: Exception) {
            Log.e(TAG, "Failed to restore extension from zip: $extId", e)
            null
        }
    }

    suspend fun autoInstallMissingExtension(extensionId: String): Boolean = withContext(Dispatchers.IO) {
        if (extensionId.isBlank() || extensionId == "local") return@withContext false
        try {
            val existing = extensionDao.getExtensionById(extensionId)
            if (existing != null && existing.isInstalled) {
                return@withContext true
            }

            Log.d(TAG, "Auto-installing missing extension: $extensionId")
            
            val onlineExts = fetchRepository(DEFAULT_REPO_URL)
            val matchedInfo = onlineExts.firstOrNull { it.name.toSlug() == extensionId }
            if (matchedInfo != null) {
                val loaded = installExtension(matchedInfo)
                return@withContext loaded != null
            } else {
                Log.w(TAG, "No online extension found matching ID: $extensionId")
            }
        } catch (e: Exception) {
            Log.e(TAG, "Failed to auto-install missing extension $extensionId: ${e.message}")
        }
        false
    }
}
