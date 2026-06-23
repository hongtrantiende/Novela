package io.legado.app.ui.association

import android.app.Application
import androidx.core.net.toUri
import io.legado.app.R
import io.legado.app.constant.AppConst
import io.legado.app.help.config.ReadBookConfig
import io.legado.app.help.http.decompressed
import io.legado.app.help.http.newCallResponseBody
import io.legado.app.help.http.okHttpClient
import io.legado.app.help.http.text
import io.legado.app.utils.FileUtils
import io.legado.app.utils.externalCache
import okhttp3.MediaType.Companion.toMediaType
import splitties.init.appCtx

class OnLineImportViewModel(app: Application) : BaseAssociationViewModel(app) {

    fun getText(url: String, success: (text: String) -> Unit) {
        execute {
            okHttpClient.newCallResponseBody {
                if (url.endsWith("#requestWithoutUA")) {
                    url(url.substringBeforeLast("#requestWithoutUA"))
                    header(AppConst.UA_NAME, "null")
                } else {
                    url(url)
                }
            }.decompressed().text("utf-8")
        }.onSuccess {
            success.invoke(it)
        }.onError {
            errorLive.postValue(
                it.localizedMessage ?: context.getString(R.string.unknown_error)
            )
        }
    }

    fun getBytes(url: String, success: (bytes: ByteArray) -> Unit) {
        execute {
            okHttpClient.newCallResponseBody {
                if (url.endsWith("#requestWithoutUA")) {
                    url(url.substringBeforeLast("#requestWithoutUA"))
                    header(AppConst.UA_NAME, "null")
                } else {
                    url(url)
                }
            }.bytes()
        }.onSuccess {
            success.invoke(it)
        }.onError {
            errorLive.postValue(
                it.localizedMessage ?: context.getString(R.string.unknown_error)
            )
        }
    }

    fun importReadConfig(bytes: ByteArray, finally: (title: String, msg: String) -> Unit) {
        execute {
            val config = ReadBookConfig.import(bytes)
            ReadBookConfig.configList.forEachIndexed { index, c ->
                if (c.name == config.name) {
                    ReadBookConfig.configList[index] = config
                    return@execute config.name
                }
                ReadBookConfig.configList.add(config)
                return@execute config.name
            }
        }.onSuccess {
            finally.invoke(context.getString(R.string.success), "Nhập sắp chữ thành công")
        }.onError {
            finally.invoke(
                context.getString(R.string.error),
                it.localizedMessage ?: context.getString(R.string.unknown_error)
            )
        }
    }

    fun determineType(url: String, finally: (title: String, msg: String) -> Unit) {
        execute {
            val rs = okHttpClient.newCallResponseBody {
                if (url.endsWith("#requestWithoutUA")) {
                    url(url.substringBeforeLast("#requestWithoutUA"))
                    header(AppConst.UA_NAME, "null")
                } else {
                    url(url)
                }
            }
            when (rs.contentType()) {
                "application/zip".toMediaType(),
                "application/octet-stream".toMediaType() -> {
                    importReadConfig(rs.bytes(), finally)
                }
                else -> {
                    val inputStream = rs.byteStream()
                    val file = FileUtils.createFileIfNotExist(
                        appCtx.externalCache,
                        "download",
                        "scheme_import_cache.json"
                    )
                    file.outputStream().use { out ->
                        inputStream.use {
                            it.copyTo(out)
                        }
                    }
                    importJson(file.toUri())
                }
            }
        }
    }

    fun importExtension(url: String, finally: (title: String, msg: String) -> Unit) {
        execute {
            val extensionLoader: io.legado.app.vbookextension.loader.ExtensionLoader =
                org.koin.mp.KoinPlatformTools.defaultContext().get().get()
            extensionLoader.installExtensionFromUrl(url)
        }.onSuccess {
            finally.invoke("Thành công", "Đã cài đặt tiện ích thành công!")
        }.onError {
            finally.invoke("Lỗi", it.localizedMessage ?: "Cài đặt tiện ích thất bại")
        }
    }

    fun importExtensionRepo(url: String, finally: (title: String, msg: String) -> Unit) {
        execute {
            val repositoryDao: io.legado.app.vbookextension.data.dao.RepositoryDao =
                org.koin.mp.KoinPlatformTools.defaultContext().get().get()
            val finalUrl = url.trim()
            val repoName = finalUrl.substringAfterLast("/").substringBefore(".")
                .ifBlank { "Repository" }
            repositoryDao.insert(
                io.legado.app.vbookextension.data.entity.RepositoryEntity(
                    url = finalUrl,
                    name = repoName,
                    addedAt = System.currentTimeMillis(),
                    isEnabled = true
                )
            )
        }.onSuccess {
            finally.invoke("Thành công", "Đã thêm kho tiện ích thành công!")
        }.onError {
            finally.invoke("Lỗi", it.localizedMessage ?: "Thêm kho tiện ích thất bại")
        }
    }

}