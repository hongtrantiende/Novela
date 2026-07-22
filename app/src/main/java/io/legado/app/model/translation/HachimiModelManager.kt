package io.legado.app.model.translation

import android.content.Context
import io.legado.app.domain.model.TranslationConstants
import io.legado.app.help.http.okHttpClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.withContext
import okhttp3.Request
import splitties.init.appCtx
import timber.log.Timber
import java.io.File
import java.io.FileOutputStream
import java.util.zip.ZipInputStream

object HachimiModelManager {

    sealed interface DownloadState {
        object Idle : DownloadState
        data class Downloading(val progress: Float, val downloadedBytes: Long, val totalBytes: Long) : DownloadState
        object Extracting : DownloadState
        object Ready : DownloadState
        data class Error(val message: String) : DownloadState
    }

    private val _state = MutableStateFlow<DownloadState>(DownloadState.Idle)
    val state: StateFlow<DownloadState> = _state.asStateFlow()

    private val _selectedModelIdFlow = MutableStateFlow(selectedModelId)
    val selectedModelIdFlow: StateFlow<String> = _selectedModelIdFlow.asStateFlow()

    /** Currently selected model ID, persisted in SharedPreferences */
    var selectedModelId: String
        get() {
            val prefs = appCtx.getSharedPreferences("hachimi_mt", Context.MODE_PRIVATE)
            return prefs.getString("selected_model_id", TranslationConstants.DEFAULT_ONNX_MODEL_ID)
                ?: TranslationConstants.DEFAULT_ONNX_MODEL_ID
        }
        set(value) {
            appCtx.getSharedPreferences("hachimi_mt", Context.MODE_PRIVATE)
                .edit().putString("selected_model_id", value).apply()
            _selectedModelIdFlow.value = value
        }

    /** Get the selected OnnxModelInfo */
    fun getSelectedModelInfo(): TranslationConstants.OnnxModelInfo {
        return TranslationConstants.AVAILABLE_ONNX_MODELS.find { it.id == selectedModelId }
            ?: TranslationConstants.AVAILABLE_ONNX_MODELS.first()
    }

    private val requiredFiles = listOf(
        "encoder_model.onnx",
        "decoder_model_merged.onnx",
        "tokenizer.onnx",
        "detokenizer.onnx",
        "model_manifest.json"
    )

    private fun canReadZipFile(file: File?): Boolean {
        if (file == null) return false
        return runCatching { file.exists() && file.canRead() && file.length() > 0 }.getOrDefault(false)
    }

    /** Get model directory for a specific model ID */
    fun getModelDir(context: Context = appCtx, modelId: String = selectedModelId): File {
        val dir = File(context.filesDir, "models/$modelId")
        if (!dir.exists()) {
            dir.mkdirs()
        }
        return dir
    }

    /** Check if a specific model is ready */
    fun isModelReady(context: Context = appCtx, modelId: String = selectedModelId): Boolean {
        // Ensure old model dir is migrated before checking
        if (modelId == "hachimi-mt60" && !hasMigrated) {
            migrateOldModelIfNeeded(context)
            hasMigrated = true
        }
        val dir = getModelDir(context, modelId)
        val ready = requiredFiles.all { fileName ->
            val file = File(dir, fileName)
            file.exists() && file.length() > 0
        }
        if (ready && modelId == selectedModelId && _state.value is DownloadState.Idle) {
            _state.value = DownloadState.Ready
        }
        return ready
    }

    /** Get list of installed model IDs */
    fun getInstalledModelIds(context: Context = appCtx): Set<String> {
        return TranslationConstants.AVAILABLE_ONNX_MODELS
            .filter { isModelReady(context, it.id) }
            .map { it.id }
            .toSet()
    }

    /** Switch to a different model. Returns true if model is ready. */
    fun switchModel(modelId: String, context: Context = appCtx): Boolean {
        selectedModelId = modelId
        val ready = isModelReady(context, modelId)
        _state.value = if (ready) DownloadState.Ready else DownloadState.Idle
        // Force translator to reinitialize with new model
        HachimiOnnxTranslator.close()
        return ready
    }

    suspend fun ensureModelReady(
        context: Context = appCtx,
        modelInfo: TranslationConstants.OnnxModelInfo = getSelectedModelInfo(),
        onProgress: ((Float) -> Unit)? = null
    ): Result<Unit> = withContext(Dispatchers.IO) {
        if (isModelReady(context, modelInfo.id)) {
            _state.value = DownloadState.Ready
            return@withContext Result.success(Unit)
        }

        try {
            val zipFilename = modelInfo.zipFilename

            // Check if local zip file exists in various locations
            val externalAppZip = File(context.getExternalFilesDir(null), zipFilename)
            val localZip = File(context.filesDir.parentFile, zipFilename)
            val sdcardDownloadZip = File("/sdcard/Download/$zipFilename")
            val externalDownloadZip = File(
                android.os.Environment.getExternalStoragePublicDirectory(
                    android.os.Environment.DIRECTORY_DOWNLOADS
                ), zipFilename
            )
            // Also check for legacy filename
            val legacyZip = File(
                context.getExternalFilesDir(null),
                "legado-hachimi-onnx-arm64-20260721.zip"
            )

            val zipSourceFile = when {
                canReadZipFile(externalAppZip) -> externalAppZip
                canReadZipFile(localZip) -> localZip
                canReadZipFile(externalDownloadZip) -> externalDownloadZip
                canReadZipFile(sdcardDownloadZip) -> sdcardDownloadZip
                canReadZipFile(legacyZip) && modelInfo.id == "hachimi-mt60" -> legacyZip
                else -> null
            }

            val modelDir = getModelDir(context, modelInfo.id)

            if (zipSourceFile != null) {
                var extractedSuccessfully = false
                _state.value = DownloadState.Extracting
                Timber.d("Extracting ${modelInfo.displayName} from local zip: ${zipSourceFile.absolutePath}")
                runCatching {
                    zipSourceFile.inputStream().use { inputStream ->
                        extractZipStream(inputStream, modelDir)
                    }
                    extractedSuccessfully = true
                }.onFailure { e ->
                    Timber.w(e, "Failed to read local zip ${zipSourceFile.absolutePath}, falling back to network download")
                }

                if (extractedSuccessfully) {
                    _state.value = DownloadState.Ready
                    return@withContext Result.success(Unit)
                }
            }

            // For local import models, do not download from network
            if (modelInfo.isLocalImport) {
                val errorMsg = "Đặt file ${modelInfo.zipFilename} vào thư mục Download rồi thử lại"
                _state.value = DownloadState.Error(errorMsg)
                return@withContext Result.failure(Exception(errorMsg))
            }

            // Download from Remote URL
            _state.value = DownloadState.Downloading(0f, 0, 0)
            val request = Request.Builder().url(modelInfo.downloadUrl).build()
            val response = okHttpClient.newCall(request).execute()

            if (!response.isSuccessful) {
                val errorMsg = if (response.code == 404) {
                    "Lỗi HTTP 404. Hãy chép file ${modelInfo.zipFilename} vào thư mục Download của máy để ứng dụng tự nạp cục bộ."
                } else {
                    "HTTP ${response.code}: ${response.message}"
                }
                _state.value = DownloadState.Error(errorMsg)
                return@withContext Result.failure(Exception(errorMsg))
            }

            val body = response.body ?: run {
                val errorMsg = "Response body is null"
                _state.value = DownloadState.Error(errorMsg)
                return@withContext Result.failure(Exception(errorMsg))
            }

            val totalBytes = body.contentLength()
            val tempZipFile = File(modelDir, "temp_model.zip")

            body.byteStream().use { input ->
                FileOutputStream(tempZipFile).use { output ->
                    val buffer = ByteArray(8192)
                    var bytesRead: Int
                    var totalRead = 0L

                    while (input.read(buffer).also { bytesRead = it } != -1) {
                        output.write(buffer, 0, bytesRead)
                        totalRead += bytesRead
                        val progress = if (totalBytes > 0) totalRead.toFloat() / totalBytes else 0f
                        _state.value = DownloadState.Downloading(progress, totalRead, totalBytes)
                        onProgress?.invoke(progress)
                    }
                }
            }

            _state.value = DownloadState.Extracting
            tempZipFile.inputStream().use { inputStream ->
                extractZipStream(inputStream, modelDir)
            }
            tempZipFile.delete()

            _state.value = DownloadState.Ready
            Result.success(Unit)
        } catch (e: Exception) {
            Timber.e(e, "Failed to prepare ${modelInfo.displayName} model")
            _state.value = DownloadState.Error(e.message ?: "Download failed")
            Result.failure(e)
        }
    }

    private fun extractZipStream(inputStream: java.io.InputStream, targetDir: File) {
        ZipInputStream(inputStream).use { zipInput ->
            var entry = zipInput.nextEntry
            while (entry != null) {
                if (!entry.isDirectory) {
                    val outFile = File(targetDir, entry.name)
                    outFile.parentFile?.mkdirs()
                    FileOutputStream(outFile).use { out ->
                        zipInput.copyTo(out)
                    }
                }
                zipInput.closeEntry()
                entry = zipInput.nextEntry
            }
        }
    }

    fun deleteModel(context: Context = appCtx, modelId: String = selectedModelId): Boolean {
        val dir = getModelDir(context, modelId)
        val success = dir.deleteRecursively()
        if (modelId == selectedModelId) {
            selectedModelId = TranslationConstants.DEFAULT_ONNX_MODEL_ID
            _state.value = DownloadState.Idle
            HachimiOnnxTranslator.close()
        }
        return success
    }

    fun deleteModel(modelId: String, context: Context): Boolean = deleteModel(context, modelId)

    private var hasMigrated = false

    /** Migrate existing model from old directory structure */
    fun migrateOldModelIfNeeded(context: Context = appCtx) {
        val oldDir = File(context.filesDir, "models/hachimi_mt")
        val newDir = getModelDir(context, "hachimi-mt60")
        if (oldDir.exists() && !newDir.exists()) {
            Timber.d("Migrating old model dir to new structure")
            newDir.parentFile?.mkdirs()
            oldDir.renameTo(newDir)
        }
    }

    /**
     * Import a local ONNX model ZIP from a content URI (file picker).
     * The ZIP must contain encoder_model.onnx, decoder_model_merged.onnx,
     * tokenizer.onnx, detokenizer.onnx, and model_manifest.json.
     * Returns the model ID from the manifest.
     */
    suspend fun importLocalZip(
        context: Context,
        uri: android.net.Uri
    ): Result<String> = withContext(Dispatchers.IO) {
        try {
            _state.value = DownloadState.Extracting

            // Extract to a temp directory first
            val tempDir = File(context.filesDir, "models/_import_temp")
            tempDir.deleteRecursively()
            tempDir.mkdirs()

            context.contentResolver.openInputStream(uri)?.use { inputStream ->
                extractZipStream(inputStream, tempDir)
            } ?: return@withContext Result.failure(Exception("Không đọc được file"))

            // Read manifest to get model ID
            val manifestFile = File(tempDir, "model_manifest.json")
            if (!manifestFile.exists()) {
                tempDir.deleteRecursively()
                _state.value = DownloadState.Error("Thiếu model_manifest.json trong ZIP")
                return@withContext Result.failure(Exception("Thiếu model_manifest.json"))
            }

            val manifest = org.json.JSONObject(manifestFile.readText())
            val modelId = manifest.getString("modelId")
            val displayName = manifest.optString("displayName", modelId)

            // Verify required files
            val missing = requiredFiles.filter { !File(tempDir, it).exists() }
            if (missing.isNotEmpty()) {
                tempDir.deleteRecursively()
                val msg = "Thiếu files: ${missing.joinToString()}"
                _state.value = DownloadState.Error(msg)
                return@withContext Result.failure(Exception(msg))
            }

            // Move to final location
            val finalDir = getModelDir(context, modelId)
            finalDir.deleteRecursively()
            tempDir.renameTo(finalDir)

            // Switch to imported model
            selectedModelId = modelId
            HachimiOnnxTranslator.close()
            _state.value = DownloadState.Ready

            Timber.d("Imported local model: $displayName ($modelId)")
            Result.success(modelId)
        } catch (e: Exception) {
            _state.value = DownloadState.Error(e.message ?: "Lỗi nhập model")
            Timber.e(e, "Failed to import local ONNX model")
            Result.failure(e)
        }
    }

    /** Get list of all installed model directories (including locally imported) */
    fun getAllInstalledModelIds(context: Context = appCtx): List<Pair<String, String>> {
        val modelsRoot = File(context.filesDir, "models")
        if (!modelsRoot.exists()) return emptyList()

        return modelsRoot.listFiles()?.filter { dir ->
            dir.isDirectory && requiredFiles.all { File(dir, it).exists() }
        }?.map { dir ->
            val manifestFile = File(dir, "model_manifest.json")
            val displayName = if (manifestFile.exists()) {
                runCatching {
                    org.json.JSONObject(manifestFile.readText()).optString("displayName", dir.name)
                }.getOrDefault(dir.name)
            } else dir.name
            dir.name to displayName
        } ?: emptyList()
    }
}
