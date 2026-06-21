package io.legado.app.help.storage

import android.content.Context
import android.database.sqlite.SQLiteConstraintException
import android.net.Uri
import androidx.core.content.edit
import androidx.documentfile.provider.DocumentFile
import io.legado.app.BuildConfig
import io.legado.app.R
import io.legado.app.constant.AppConst.androidId
import io.legado.app.constant.AppLog
import io.legado.app.constant.PreferKey
import io.legado.app.data.appDb
import io.legado.app.data.entities.Book
import io.legado.app.data.entities.BookGroup
import io.legado.app.data.entities.BookSource
import io.legado.app.data.entities.Bookmark
import io.legado.app.data.entities.DictRule
import io.legado.app.data.entities.HttpTTS
import io.legado.app.data.entities.KeyboardAssist
import io.legado.app.data.entities.ReplaceRule
import io.legado.app.data.entities.RssSource
import io.legado.app.data.entities.RssStar
import io.legado.app.data.entities.RuleSub
import io.legado.app.data.entities.SearchKeyword
import io.legado.app.data.entities.Server
import io.legado.app.data.entities.TxtTocRule
import io.legado.app.data.entities.readRecord.ReadRecord
import io.legado.app.data.entities.readRecord.ReadRecordDetail
import io.legado.app.data.entities.readRecord.ReadRecordSession
import io.legado.app.data.repository.SettingsRepository
import io.legado.app.help.DirectLinkUpload
import io.legado.app.help.LauncherIconHelp
import io.legado.app.help.book.isLocal
import io.legado.app.help.book.upType
import io.legado.app.help.config.LocalConfig
import io.legado.app.help.config.ThemeConfigStore
import io.legado.app.help.config.ReadBookConfig
import io.legado.app.model.BookCover
import io.legado.app.model.localBook.LocalBook
import io.legado.app.utils.ACache
import io.legado.app.utils.FileUtils
import io.legado.app.utils.GSON
import io.legado.app.utils.LogUtils
import io.legado.app.utils.compress.ZipUtils
import io.legado.app.utils.defaultSharedPreferences
import io.legado.app.utils.fromJsonArray
import io.legado.app.utils.getPrefString
import io.legado.app.utils.isContentScheme
import io.legado.app.utils.isJsonArray
import io.legado.app.utils.openInputStream
import io.legado.app.utils.toastOnUi
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserFactory
import splitties.init.appCtx
import java.io.File
import java.io.FileInputStream

/**
 * 恢复
 */
object Restore : KoinComponent {

    private val settingsRepository: SettingsRepository by inject()
    private const val TAG = "Restore"

    suspend fun restore(context: Context, uri: Uri) {
        BackupRestoreLock.withLock {
            LogUtils.d(TAG, "Bắt đầu khôi phục bản sao lưu uri:$uri")
            val unzipResult = kotlin.runCatching {
                FileUtils.delete(Backup.backupPath)
                if (uri.isContentScheme()) {
                    DocumentFile.fromSingleUri(context, uri)!!.openInputStream()!!.use {
                        ZipUtils.unZipToPath(it, Backup.backupPath)
                    }
                } else {
                    ZipUtils.unZipToPath(File(uri.path!!), Backup.backupPath)
                }
            }.onFailure {
                AppLog.put("Lỗi sao chép và giải nén tập tin\n${it.localizedMessage}", it)
            }
            if (unzipResult.isSuccess) {
                kotlin.runCatching {
                    restoreUnzipped(Backup.backupPath)
                    LocalConfig.lastBackup = System.currentTimeMillis()
                }.onFailure {
                    appCtx.toastOnUi("Lỗi khôi phục bản sao lưu\n${it.localizedMessage}")
                    AppLog.put("Lỗi khôi phục bản sao lưu\n${it.localizedMessage}", it)
                }
            }
        }
    }

    suspend fun restoreLocked(path: String) {
        BackupRestoreLock.withLock {
            restoreUnzipped(path)
        }
    }

    internal suspend fun restoreUnzipped(path: String) {
        restore(path)
    }

    private suspend fun restore(path: String) {
        val aes = BackupAES()
        fileToListT<Book>(path, "bookshelf.json")?.let {
            it.forEach { book ->
                book.upType()
            }
            it.filter { book -> book.isLocal }
                .forEach { book ->
                    book.coverUrl = LocalBook.getCoverPath(book)
                }
            val newBooks = arrayListOf<Book>()
            val ignoreLocalBook = BackupConfig.ignoreLocalBook
            it.forEach { book ->
                if (ignoreLocalBook && book.isLocal) {
                    return@forEach
                }
                if (appDb.bookDao.has(book.bookUrl)) {
                    try {
                        appDb.bookDao.update(book)
                    } catch (_: SQLiteConstraintException) {
                        appDb.bookDao.insert(book)
                    }
                } else {
                    newBooks.add(book)
                }
            }
            appDb.bookDao.insert(*newBooks.toTypedArray())
        }
        fileToListT<Bookmark>(path, "bookmark.json")?.let {
            try {
                appDb.bookmarkDao.insert(*it.toTypedArray())
            } catch (_: SQLiteConstraintException) {
            }
        }
        fileToListT<BookGroup>(path, "bookGroup.json")?.let {
            try {
                appDb.bookGroupDao.insert(*it.toTypedArray())
            } catch (_: SQLiteConstraintException) {
            }
        }
        fileToListT<BookSource>(path, "bookSource.json")?.let {
            try {
                appDb.bookSourceDao.insert(*it.toTypedArray())
            } catch (_: SQLiteConstraintException) {
            }
        } ?: run {
            val bookSourceFile = File(path, "bookSource.json")
            if (bookSourceFile.exists()) {
                val json = bookSourceFile.readText()
                ImportOldData.importOldSource(json)
            }
        }
        fileToListT<RssSource>(path, "rssSources.json")?.let {
            try {
                appDb.rssSourceDao.insert(*it.toTypedArray())
            } catch (_: SQLiteConstraintException) {
            }
        }
        fileToListT<RssStar>(path, "rssStar.json")?.let {
            try {
                appDb.rssStarDao.insert(*it.toTypedArray())
            } catch (_: SQLiteConstraintException) {
            }
        }
        fileToListT<ReplaceRule>(path, "replaceRule.json")?.let {
            try {
                appDb.replaceRuleDao.insert(*it.toTypedArray())
            } catch (_: SQLiteConstraintException) {
            }
        }
        fileToListT<SearchKeyword>(path, "searchHistory.json")?.let {
            try {
                appDb.searchKeywordDao.insert(*it.toTypedArray())
            } catch (_: SQLiteConstraintException) {
            }
        }
        fileToListT<RuleSub>(path, "sourceSub.json")?.let {
            try {
                appDb.ruleSubDao.insert(*it.toTypedArray())
            } catch (_: SQLiteConstraintException) {
            }
        }
        fileToListT<TxtTocRule>(path, "txtTocRule.json")?.let {
            try {
                appDb.txtTocRuleDao.insert(*it.toTypedArray())
            } catch (_: SQLiteConstraintException) {
            }
        }
        fileToListT<HttpTTS>(path, "httpTTS.json")?.let {
            try {
                appDb.httpTTSDao.insert(*it.toTypedArray())
            } catch (_: SQLiteConstraintException) {
            }
        }
        fileToListT<DictRule>(path, "dictRule.json")?.let {
            try {
                appDb.dictRuleDao.insert(*it.toTypedArray())
            } catch (_: SQLiteConstraintException) {
            }
        }
        fileToListT<KeyboardAssist>(path, "keyboardAssists.json")?.let {
            try {
                appDb.keyboardAssistsDao.insert(*it.toTypedArray())
            } catch (_: SQLiteConstraintException) {
            }
        }
        fileToListT<ReadRecord>(path, "readRecord.json")?.let {
            it.forEach { readRecord ->
                if (readRecord.deviceId != androidId) {
                    try {
                        appDb.readRecordDao.insert(readRecord)
                    } catch (_: SQLiteConstraintException) {
                    }
                } else {
                    val time = appDb.readRecordDao
                        .getReadTime(readRecord.deviceId, readRecord.bookName, readRecord.bookAuthor)
                    if (time == null || time < readRecord.readTime) {
                        try {
                            appDb.readRecordDao.insert(readRecord)
                        } catch (_: SQLiteConstraintException) {
                        }
                    }
                }
            }
        }
        fileToListT<ReadRecordDetail>(path, "readRecordDetail.json")?.let {
            it.forEach { detail ->
                try {
                    appDb.readRecordDao.insertDetail(detail)
                } catch (_: SQLiteConstraintException) {
                }
            }
        }
        fileToListT<ReadRecordSession>(path, "readRecordSession.json")?.let {
            it.forEach { session ->
                try {
                    appDb.readRecordDao.insertSession(session)
                } catch (_: SQLiteConstraintException) {
                }
            }
        }
        File(path, "servers.json").takeIf {
            it.exists()
        }?.runCatching {
            var json = readText()
            if (!json.isJsonArray()) {
                json = aes.decryptStr(json)
            }
            GSON.fromJsonArray<Server>(json).getOrNull()?.let {
                try {
                    appDb.serverDao.insert(*it.toTypedArray())
                } catch (_: SQLiteConstraintException) {
                }
            }
        }?.onFailure {
            AppLog.put("Lỗi cấu hình máy chủ khôi phục\n${it.localizedMessage}", it)
        }
        File(path, DirectLinkUpload.ruleFileName).takeIf {
            it.exists()
        }?.runCatching {
            val json = readText()
            ACache.get(cacheDir = false).put(DirectLinkUpload.ruleFileName, json)
        }?.onFailure {
            AppLog.put("Lỗi khôi phục tải lên liên kết trực tiếp\n${it.localizedMessage}", it)
        }
        //恢复主题配置
        if (!BackupConfig.ignoreThemeConfig) {
            File(path, ThemeConfigStore.configFileName).takeIf {
                it.exists()
            }?.runCatching {
                FileUtils.delete(ThemeConfigStore.configFilePath)
                copyTo(File(ThemeConfigStore.configFilePath))
                ThemeConfigStore.upConfig()
            }?.onFailure {
                AppLog.put("Lỗi khôi phục chủ đề\n${it.localizedMessage}", it)
            }
        }
        File(path, BookCover.configFileName).takeIf {
            it.exists() && !BackupConfig.ignoreCoverConfig
        }?.runCatching {
            val json = readText()
            BookCover.saveCoverRule(json)
        }?.onFailure {
            AppLog.put("Lỗi khôi phục quy tắc bìa\n${it.localizedMessage}", it)
        }
        if (!BackupConfig.ignoreReadConfig) {
            //恢复阅读界面配置
            File(path, ReadBookConfig.configFileName).takeIf {
                it.exists()
            }?.runCatching {
                FileUtils.delete(ReadBookConfig.configFilePath)
                copyTo(File(ReadBookConfig.configFilePath))
                ReadBookConfig.initConfigs()
            }?.onFailure {
                AppLog.put("Lỗi khôi phục giao diện đọc\n${it.localizedMessage}", it)
            }
            File(path, ReadBookConfig.shareConfigFileName).takeIf {
                it.exists()
            }?.runCatching {
                FileUtils.delete(ReadBookConfig.shareConfigFilePath)
                copyTo(File(ReadBookConfig.shareConfigFilePath))
                ReadBookConfig.initShareConfig()
            }?.onFailure {
                AppLog.put("Lỗi khôi phục giao diện đọc\n${it.localizedMessage}", it)
            }
        }
        // 恢复配置文件 (手动解析 XML，替代反射逻辑)
        val configFile = File(path, "config.xml")
        if (configFile.exists()) {
            try {
                val map = readXmlToMap(configFile)
                if (map.isNotEmpty()) {
                    applyConfigMap(map, aes)
                }
            } catch (e: Exception) {
                AppLog.put("Lỗi khôi phục cấu hình XML\n${e.localizedMessage}", e)
            }
        }

        appCtx.toastOnUi(R.string.restore_success)
        withContext(Main) {
            delay(100)
            if (!BuildConfig.DEBUG) {
                LauncherIconHelp.changeIcon(appCtx.getPrefString(PreferKey.launcherIcon))
            }
            ThemeConfigStore.applyDayNight(appCtx)
        }
    }

    private suspend fun applyConfigMap(map: Map<String, Any?>, aes: BackupAES) {
        val finalMap = mutableMapOf<String, Any>()
        appCtx.defaultSharedPreferences.edit {
            map.forEach { (key, value) ->
                if (BackupConfig.keyIsNotIgnore(key)) {
                    when (key) {
                        PreferKey.webDavPassword -> {
                            val password = kotlin.runCatching {
                                aes.decryptStr(value.toString())
                            }.getOrNull() ?: let {
                                if (appCtx.getPrefString(PreferKey.webDavPassword).isNullOrBlank()) {
                                    value.toString()
                                } else null
                            }
                            password?.let {
                                putString(key, it)
                                finalMap[key] = it
                            }
                        }

                        else -> {
                            if (value != null) {
                                when (value) {
                                    is Int -> { putInt(key, value); finalMap[key] = value }
                                    is Boolean -> { putBoolean(key, value); finalMap[key] = value }
                                    is Long -> { putLong(key, value); finalMap[key] = value }
                                    is Double -> { // JSON 数字会被解析为 Double
                                        val floatValue = value.toFloat()
                                        putFloat(key, floatValue)
                                        finalMap[key] = floatValue
                                    }
                                    is Float -> { putFloat(key, value); finalMap[key] = value }
                                    is String -> { putString(key, value); finalMap[key] = value }
                                }
                            }
                        }
                    }
                }
            }
        }
        // 同步恢复到 DataStore
        settingsRepository.batchPutFromMap(finalMap)
    }

    private fun readXmlToMap(file: File): Map<String, Any?> {
        val map = mutableMapOf<String, Any?>()
        try {
            val factory = XmlPullParserFactory.newInstance()
            val parser = factory.newPullParser()
            FileInputStream(file).use { fis ->
                parser.setInput(fis, "UTF-8")
                var eventType = parser.eventType
                while (eventType != XmlPullParser.END_DOCUMENT) {
                    if (eventType == XmlPullParser.START_TAG) {
                        val tagName = parser.name
                        val name = parser.getAttributeValue(null, "name")
                        if (name != null) {
                            when (tagName) {
                                "string" -> map[name] = parser.nextText()
                                "int" -> map[name] = parser.getAttributeValue(null, "value").toInt()
                                "long" -> map[name] = parser.getAttributeValue(null, "value").toLong()
                                "float" -> map[name] = parser.getAttributeValue(null, "value").toFloat()
                                "boolean" -> map[name] = parser.getAttributeValue(null, "value").toBoolean()
                            }
                        }
                    }
                    eventType = parser.next()
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return map
    }

    private inline fun <reified T> fileToListT(path: String, fileName: String): List<T>? {
        try {
            val file = File(path, fileName)
            if (file.exists()) {
                LogUtils.d(TAG, "Đọc khôi phục kích thước tệp sao lưu $fileName ${file.length()}")
                FileInputStream(file).use {
                    return GSON.fromJsonArray<T>(it).getOrThrow().also { list ->
                        LogUtils.d(TAG, "Đọc khôi phục kích thước danh sách $fileName sao lưu ${list.size}")
                    }
                }
            } else {
                LogUtils.d(TAG, "Đọc tệp $fileName sao lưu khôi phục không tồn tại")
            }
        } catch (e: Exception) {
            AppLog.put("$fileName\nĐọc lỗi phân tích cú pháp\n${e.localizedMessage}", e)
            appCtx.toastOnUi("$fileName\nLỗi đọc tập tin\n${e.localizedMessage}")
        }
        return null
    }

}
