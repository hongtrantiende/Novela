package io.legado.app.api.controller


import android.text.TextUtils
import io.legado.app.api.ReturnData
import io.legado.app.data.appDb
import io.legado.app.data.entities.BookSource
import io.legado.app.help.source.SourceHelp
import io.legado.app.utils.GSON
import io.legado.app.utils.fromJsonArray
import io.legado.app.utils.fromJsonObject
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking

object BookSourceController {

    val sources: ReturnData
        get() {
            val bookSources = appDb.bookSourceDao.all.toMutableList()
            try {
                val extensionDao: io.legado.app.vbookextension.data.dao.ExtensionDao =
                    org.koin.mp.KoinPlatformTools.defaultContext().get().get()
                val extensions = runBlocking {
                    extensionDao.getInstalledExtensions().first()
                }
                extensions.forEach { ext ->
                    val isComic = ext.type.equals("comic", ignoreCase = true)
                            || ext.type.equals("manga", ignoreCase = true)
                            || ext.type.equals("image", ignoreCase = true)
                    val bookType = if (isComic) io.legado.app.constant.BookSourceType.image else io.legado.app.constant.BookSourceType.default
                    val mockSource = BookSource(
                        bookSourceUrl = "ext_${ext.id}",
                        bookSourceName = ext.name,
                        bookSourceGroup = "Extension",
                        bookSourceType = bookType,
                        enabled = ext.isEnabled,
                        bookSourceComment = "Tác giả: ${ext.author}. ${ext.description}"
                    )
                    bookSources.add(mockSource)
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
            val returnData = ReturnData()
            return if (bookSources.isEmpty()) {
                returnData.setErrorMsg("Danh sách nguồn thiết bị trống")
            } else returnData.setData(bookSources)
        }

    fun saveSource(postData: String?): ReturnData {
        val returnData = ReturnData()
        postData ?: return returnData.setErrorMsg("Dữ liệu không thể trống")
        val bookSource = GSON.fromJsonObject<BookSource>(postData).getOrNull()
        if (bookSource != null) {
            if (TextUtils.isEmpty(bookSource.bookSourceName) || TextUtils.isEmpty(bookSource.bookSourceUrl)) {
                returnData.setErrorMsg("Tên nguồn và URL không được để trống")
            } else {
                if (bookSource.bookSourceUrl.startsWith("ext_")) {
                    val extId = bookSource.bookSourceUrl.removePrefix("ext_")
                    val extensionDao: io.legado.app.vbookextension.data.dao.ExtensionDao =
                        org.koin.mp.KoinPlatformTools.defaultContext().get().get()
                    runBlocking {
                        extensionDao.setEnabled(extId, bookSource.enabled)
                    }
                    returnData.setData("")
                } else {
                    appDb.bookSourceDao.insert(bookSource)
                    returnData.setData("")
                }
            }
        } else {
            returnData.setErrorMsg("Nguồn chuyển đổi không thành công")
        }
        return returnData
    }

    fun saveSources(postData: String?): ReturnData {
        postData ?: return ReturnData().setErrorMsg("Dữ liệu trống")
        val okSources = arrayListOf<BookSource>()
        val bookSources = GSON.fromJsonArray<BookSource>(postData).getOrNull()
        if (bookSources.isNullOrEmpty()) {
            return ReturnData().setErrorMsg("Nguồn chuyển đổi không thành công")
        }
        val extensionDao: io.legado.app.vbookextension.data.dao.ExtensionDao =
            org.koin.mp.KoinPlatformTools.defaultContext().get().get()
        bookSources.forEach { bookSource ->
            if (bookSource.bookSourceName.isNotBlank()
                && bookSource.bookSourceUrl.isNotBlank()
            ) {
                if (bookSource.bookSourceUrl.startsWith("ext_")) {
                    val extId = bookSource.bookSourceUrl.removePrefix("ext_")
                    runBlocking {
                        extensionDao.setEnabled(extId, bookSource.enabled)
                    }
                    okSources.add(bookSource)
                } else {
                    appDb.bookSourceDao.insert(bookSource)
                    okSources.add(bookSource)
                }
            }
        }
        return ReturnData().setData(okSources)
    }

    fun getSource(parameters: Map<String, List<String>>): ReturnData {
        val url = parameters["url"]?.firstOrNull()
        val returnData = ReturnData()
        if (url.isNullOrEmpty()) {
            return returnData.setErrorMsg("Url tham số không được để trống, vui lòng chỉ định địa chỉ nguồn")
        }
        if (url.startsWith("ext_")) {
            val extId = url.removePrefix("ext_")
            val extensionDao: io.legado.app.vbookextension.data.dao.ExtensionDao =
                org.koin.mp.KoinPlatformTools.defaultContext().get().get()
            val ext = runBlocking { extensionDao.getExtensionById(extId) }
                ?: return returnData.setErrorMsg("Không tìm thấy nguồn, vui lòng kiểm tra địa chỉ nguồn sách")
            val isComic = ext.type.equals("comic", ignoreCase = true)
                    || ext.type.equals("manga", ignoreCase = true)
                    || ext.type.equals("image", ignoreCase = true)
            val bookType = if (isComic) io.legado.app.constant.BookSourceType.image else io.legado.app.constant.BookSourceType.default
            val mockSource = BookSource(
                bookSourceUrl = "ext_${ext.id}",
                bookSourceName = ext.name,
                bookSourceGroup = "Extension",
                bookSourceType = bookType,
                enabled = ext.isEnabled,
                bookSourceComment = "Tác giả: ${ext.author}. ${ext.description}"
            )
            return returnData.setData(mockSource)
        }
        val bookSource = appDb.bookSourceDao.getBookSource(url)
            ?: return returnData.setErrorMsg("Không tìm thấy nguồn, vui lòng kiểm tra địa chỉ nguồn sách")
        return returnData.setData(bookSource)
    }

    fun deleteSources(postData: String?): ReturnData {
        kotlin.runCatching {
            val list = GSON.fromJsonArray<BookSource>(postData).getOrThrow()
            val regularSources = list.filterNot { it.bookSourceUrl.startsWith("ext_") }
            val extSources = list.filter { it.bookSourceUrl.startsWith("ext_") }
            if (regularSources.isNotEmpty()) {
                SourceHelp.deleteBookSources(regularSources)
            }
            if (extSources.isNotEmpty()) {
                val extensionDao: io.legado.app.vbookextension.data.dao.ExtensionDao =
                    org.koin.mp.KoinPlatformTools.defaultContext().get().get()
                extSources.forEach { extSource ->
                    val extId = extSource.bookSourceUrl.removePrefix("ext_")
                    runBlocking {
                        extensionDao.getExtensionById(extId)?.let {
                            extensionDao.delete(it)
                        }
                    }
                }
            }
        }.onFailure {
            return ReturnData().setErrorMsg(it.localizedMessage ?: "Lỗi định dạng dữ liệu")
        }
        return ReturnData().setData("Đã thực hiện"/*okSources*/)
    }
}

