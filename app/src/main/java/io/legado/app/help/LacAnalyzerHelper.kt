package io.legado.app.help

import android.content.Context
import android.util.Log
import baidu.lac.jni.LacLib
import baidu.lac.jni.NativeToken
import io.legado.app.help.http.okHttpClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.withContext
import okhttp3.Request
import java.io.File
import java.io.FileOutputStream
import java.util.zip.ZipInputStream

object LacAnalyzerHelper {
    private const val TAG = "LacAnalyzerHelper"
    private const val DEFAULT_MODEL_URL = "https://github.com/hoangtran0410/vBook-extension/releases/download/v1.0.0/analyzer.zip"

    @Volatile
    private var handle: Long = 0L

    private val _isDownloading = MutableStateFlow(false)
    val isDownloading: StateFlow<Boolean> = _isDownloading

    private val _downloadProgress = MutableStateFlow("")
    val downloadProgress: StateFlow<String> = _downloadProgress

    fun getModelDir(context: Context): File {
        return File(context.filesDir, "analyzer/model")
    }

    fun isModelDownloaded(context: Context): Boolean {
        val modelDir = getModelDir(context)
        if (!modelDir.exists()) return false
        val files = modelDir.listFiles()
        return !files.isNullOrEmpty()
    }

    suspend fun downloadAndExtractModel(context: Context, customUrl: String? = null): Boolean = withContext(Dispatchers.IO) {
        _isDownloading.value = true
        _downloadProgress.value = "Đang kết nối..."
        val url = if (!customUrl.isNullOrBlank()) customUrl else DEFAULT_MODEL_URL
        val tempZipFile = File(context.cacheDir, "temp_analyzer.zip")
        
        try {
            val request = Request.Builder().url(url).build()
            val response = okHttpClient.newCall(request).execute()
            if (!response.isSuccessful) {
                _downloadProgress.value = "Lỗi kết nối: ${response.code}"
                _isDownloading.value = false
                return@withContext false
            }

            _downloadProgress.value = "Đang tải dữ liệu model..."
            response.body?.byteStream()?.use { inputStream ->
                FileOutputStream(tempZipFile).use { outputStream ->
                    inputStream.copyTo(outputStream)
                }
            }

            _downloadProgress.value = "Đang giải nén model..."
            val analyzerDir = File(context.filesDir, "analyzer")
            if (!analyzerDir.exists()) {
                analyzerDir.mkdirs()
            }

            tempZipFile.inputStream().use { fileInput ->
                ZipInputStream(fileInput).use { zipInput ->
                    var entry = zipInput.nextEntry
                    while (entry != null) {
                        val file = File(analyzerDir, entry.name)
                        if (entry.isDirectory) {
                            file.mkdirs()
                        } else {
                            file.parentFile?.mkdirs()
                            FileOutputStream(file).use { output ->
                                zipInput.copyTo(output)
                            }
                        }
                        zipInput.closeEntry()
                        entry = zipInput.nextEntry
                    }
                }
            }
            tempZipFile.delete()
            _downloadProgress.value = "Hoàn thành!"
            _isDownloading.value = false
            true
        } catch (e: Exception) {
            Log.e(TAG, "Lỗi tải/giải nén model: ${e.message}", e)
            tempZipFile.delete()
            _downloadProgress.value = "Lỗi: ${e.localizedMessage}"
            _isDownloading.value = false
            false
        }
    }

    @Synchronized
    fun init(context: Context): Boolean {
        if (handle != 0L) return true
        if (!isModelDownloaded(context)) {
            Log.w(TAG, "Model chưa được tải")
            return false
        }
        return try {
            val modelDir = getModelDir(context).absolutePath
            handle = LacLib.create(context, modelDir, 1)
            Log.d(TAG, "Khởi tạo JNI LacLib thành công: handle = $handle")
            handle != 0L
        } catch (e: Throwable) {
            Log.e(TAG, "Lỗi khởi tạo native LacLib: ${e.message}", e)
            false
        }
    }

    @Synchronized
    fun analyze(text: String): List<NativeToken> {
        if (handle == 0L) {
            Log.w(TAG, "LacLib chưa được khởi tạo")
            return emptyList()
        }
        if (text.isBlank()) return emptyList()
        return try {
            val result = LacLib.analyze(handle, text)
            result?.toList() ?: emptyList()
        } catch (e: Throwable) {
            Log.e(TAG, "Lỗi phân tích JNI: ${e.message}", e)
            emptyList()
        }
    }

    @Synchronized
    fun destroy() {
        if (handle != 0L) {
            try {
                LacLib.destroy(handle)
                Log.d(TAG, "Đã giải phóng handle $handle")
            } catch (e: Throwable) {
                Log.e(TAG, "Lỗi giải phóng handle: ${e.message}", e)
            } finally {
                handle = 0L
            }
        }
    }
}
