package io.legado.app.help.tts

import android.content.Context
import io.legado.app.constant.AppLog
import io.legado.app.help.http.okHttpClient
import okhttp3.Request
import org.json.JSONObject
import java.io.ByteArrayInputStream
import java.io.File
import java.io.FileOutputStream
import java.io.InputStream
import java.util.zip.ZipEntry
import java.util.zip.ZipInputStream

object AiTtsEngine {
    private var loadedModelId: String? = null
    private var isModelLoaded = false

    fun isDictInstalled(context: Context): Boolean {
        val baseDir = File(context.filesDir, "ai-tts")
        return File(baseDir, "vi-word_id.bin").exists() && File(baseDir, "en-word_id.bin").exists()
    }

    fun isModelInstalled(context: Context, modelId: String): Boolean {
        val modelDir = File(context.filesDir, "ai-tts/models/$modelId")
        val modelFile = File(modelDir, "$modelId.vmodel")
        val configFile = File(modelDir, "config.json")
        return modelFile.exists() && configFile.exists()
    }

    @Synchronized
    fun loadModel(context: Context, modelId: String): Boolean {
        if (isModelLoaded && loadedModelId == modelId) return true

        try {
            val modelDir = File(context.filesDir, "ai-tts/models/$modelId")
            val modelFile = File(modelDir, "$modelId.vmodel")
            val configFile = File(modelDir, "config.json")

            if (!modelFile.exists() || !configFile.exists()) {
                AppLog.put("Mô hình $modelId chưa được cài đặt!")
                return false
            }

            // Đọc thông số cấu hình của mô hình từ config.json
            val configText = configFile.readText()
            val configJson = JSONObject(configText)
            val inferenceJson = configJson.optJSONObject("inference")
            val noiseScale = inferenceJson?.optDouble("noise_scale", 0.667)?.toFloat() ?: 0.667f
            val noiseW = inferenceJson?.optDouble("noise_w", 0.8)?.toFloat() ?: 0.8f
            val numSpeakers = configJson.optInt("num_speakers", 1)

            // Dừng mô hình cũ trước khi nạp mô hình mới
            com.reader.piper.PiperNcnn.stop()

            val success = com.reader.piper.PiperNcnn.loadModelEncrypted(
                modelFile.absolutePath,
                configFile.absolutePath,
                noiseScale,
                noiseW,
                numSpeakers
            )

            if (success) {
                loadedModelId = modelId
                isModelLoaded = true
                AppLog.put("Nạp mô hình TTS AI ngoại tuyến thành công: $modelId")
                return true
            } else {
                AppLog.put("Không thể nạp mô hình TTS AI JNI: $modelId")
            }
        } catch (e: Exception) {
            AppLog.put("Lỗi khi nạp mô hình TTS AI: ${e.localizedMessage}", e)
        }
        return false
    }

    /**
     * Dịch văn bản thành luồng PCM và xuất ra luồng âm thanh WAV
     */
    @Synchronized
    fun synthesizeText(
        context: Context,
        modelId: String,
        speakerId: Int,
        text: String,
        speed: Double
    ): InputStream? {
        try {
            // Đảm bảo mô hình được nạp sẵn sàng
            if (!loadModel(context, modelId)) return null

            // Chuyển văn bản sang chuỗi Phoneme ID
            val ids = AiTtsDict.textToPhonemeIds(context, text)
            if (ids.isEmpty()) return null

            // Gọi hàm JNI Piper NCNN suy luận tạo dữ liệu âm thanh PCM
            val pcmData = com.reader.piper.PiperNcnn.synthesizeFromIds(ids, speakerId, speed) ?: return null

            // Đóng gói mảng PCM sang dữ liệu tệp WAV
            val wavBytes = pcmToWav(pcmData, 22050)
            return ByteArrayInputStream(wavBytes)
        } catch (e: Exception) {
            AppLog.put("Lỗi tổng hợp giọng nói AI Local: ${e.localizedMessage}", e)
        }
        return null
    }

    fun stop() {
        try {
            com.reader.piper.PiperNcnn.stop()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    /**
     * Đóng gói luồng dữ liệu 16-bit PCM Mono sang định dạng WAV 44-byte Header
     */
    private fun pcmToWav(pcmData: ShortArray, sampleRate: Int): ByteArray {
        val totalAudioLen = pcmData.size * 2
        val totalDataLen = totalAudioLen + 36
        val byteRate = sampleRate * 2

        val header = ByteArray(44)
        header[0] = 'R'.code.toByte() // RIFF
        header[1] = 'I'.code.toByte()
        header[2] = 'F'.code.toByte()
        header[3] = 'F'.code.toByte()

        header[4] = (totalDataLen and 0xff).toByte()
        header[5] = ((totalDataLen shr 8) and 0xff).toByte()
        header[6] = ((totalDataLen shr 16) and 0xff).toByte()
        header[7] = ((totalDataLen shr 24) and 0xff).toByte()

        header[8] = 'W'.code.toByte() // WAVE
        header[9] = 'A'.code.toByte()
        header[10] = 'V'.code.toByte()
        header[11] = 'E'.code.toByte()

        header[12] = 'f'.code.toByte() // fmt chunk
        header[13] = 'm'.code.toByte()
        header[14] = 't'.code.toByte()
        header[15] = ' '.code.toByte()

        header[16] = 16 // Kích thước fmt chunk
        header[17] = 0
        header[18] = 0
        header[19] = 0

        header[20] = 1 // Định dạng PCM
        header[21] = 0

        header[22] = 1 // Mono (1 kênh)
        header[23] = 0

        header[24] = (sampleRate and 0xff).toByte()
        header[25] = ((sampleRate shr 8) and 0xff).toByte()
        header[26] = ((sampleRate shr 16) and 0xff).toByte()
        header[27] = ((sampleRate shr 24) and 0xff).toByte()

        header[28] = (byteRate and 0xff).toByte()
        header[29] = ((byteRate shr 8) and 0xff).toByte()
        header[30] = ((byteRate shr 16) and 0xff).toByte()
        header[31] = ((byteRate shr 24) and 0xff).toByte()

        header[32] = 2 // Block align (1 channel, 2 bytes/sample)
        header[33] = 0

        header[34] = 16 // Bits per sample
        header[35] = 0

        header[36] = 'd'.code.toByte() // data chunk
        header[37] = 'a'.code.toByte()
        header[38] = 't'.code.toByte()
        header[39] = 'a'.code.toByte()

        header[40] = (totalAudioLen and 0xff).toByte()
        header[41] = ((totalAudioLen shr 8) and 0xff).toByte()
        header[42] = ((totalAudioLen shr 16) and 0xff).toByte()
        header[43] = ((totalAudioLen shr 24) and 0xff).toByte()

        val wavBytes = ByteArray(44 + totalAudioLen)
        System.arraycopy(header, 0, wavBytes, 0, 44)

        for (i in pcmData.indices) {
            val sample = pcmData[i]
            wavBytes[44 + i * 2] = (sample.toInt() and 0xff).toByte()
            wavBytes[44 + i * 2 + 1] = ((sample.toInt() shr 8) and 0xff).toByte()
        }
        return wavBytes
    }

    /**
     * Tải tệp zip và giải nén vào thư mục cấu hình
     */
    fun downloadAndUnzip(context: Context, downloadUrl: String, destDir: File, onProgress: (Int) -> Unit) {
        val request = Request.Builder().url(downloadUrl).build()
        val response = okHttpClient.newCall(request).execute()
        if (!response.isSuccessful) throw Exception("Tải file thất bại: ${response.code}")

        val body = response.body ?: throw Exception("Nội dung tải trống")
        val totalBytes = body.contentLength()
        val inputStream = body.byteStream()

        val tempFile = File(context.cacheDir, "temp_download.zip")
        FileOutputStream(tempFile).use { out ->
            val buffer = ByteArray(8192)
            var bytesRead: Int
            var totalRead: Long = 0
            while (inputStream.read(buffer).also { bytesRead = it } != -1) {
                out.write(buffer, 0, bytesRead)
                totalRead += bytesRead
                if (totalBytes > 0) {
                    onProgress(((totalRead * 100) / totalBytes).toInt())
                }
            }
        }

        // Thực hiện giải nén
        destDir.mkdirs()
        ZipInputStream(tempFile.inputStream()).use { zip ->
            var entry: ZipEntry?
            while (zip.nextEntry.also { entry = it } != null) {
                val file = File(destDir, entry!!.name)
                if (entry!!.isDirectory) {
                    file.mkdirs()
                } else {
                    file.parentFile?.mkdirs()
                    FileOutputStream(file).use { out ->
                        val buffer = ByteArray(8192)
                        var length: Int
                        while (zip.read(buffer).also { length = it } != -1) {
                            out.write(buffer, 0, length)
                        }
                    }
                }
                zip.closeEntry()
            }
        }
        tempFile.delete()
    }
}

data class AiTtsModelInfo(
    val id: String,
    val name: String,
    val downloadUrl: String,
    val sizeBytes: Long,
    val numSpeakers: Int,
    val gender: String
)

val AI_TTS_MODELS = listOf(
    AiTtsModelInfo("vi_south", "Tiếng Việt - Miền Nam", "https://raw.githubusercontent.com/Darkrai9x/vbook-settings/main/ai-tts/models/vi_south.zip", 38210837L, 12, "multi"),
    AiTtsModelInfo("vi_north", "Tiếng Việt - Miền Bắc", "https://raw.githubusercontent.com/Darkrai9x/vbook-settings/main/ai-tts/models/vi_north.zip", 38210834L, 12, "multi"),
    AiTtsModelInfo("banmai", "Ban Mai", "https://raw.githubusercontent.com/Darkrai9x/vbook-settings/main/ai-tts/models/banmai.zip", 31472573L, 1, "female"),
    AiTtsModelInfo("ngochuyen", "Ngọc Huyền", "https://raw.githubusercontent.com/Darkrai9x/vbook-settings/main/ai-tts/models/ngochuyen.zip", 31472586L, 1, "female"),
    AiTtsModelInfo("minhquang", "Minh Quang", "https://raw.githubusercontent.com/Darkrai9x/vbook-settings/main/ai-tts/models/minhquang.zip", 31472581L, 1, "male"),
    AiTtsModelInfo("phuongtrang", "Phương Trang", "https://raw.githubusercontent.com/Darkrai9x/vbook-settings/main/ai-tts/models/phuongtrang.zip", 31472590L, 1, "female"),
    AiTtsModelInfo("manhdung", "Mạnh Dũng", "https://raw.githubusercontent.com/Darkrai9x/vbook-settings/main/ai-tts/models/manhdung.zip", 31472582L, 1, "male"),
    AiTtsModelInfo("ngocngan", "Ngọc Ngạn", "https://raw.githubusercontent.com/Darkrai9x/vbook-settings/main/ai-tts/models/ngocngan.zip", 31472528L, 1, "male"),
    AiTtsModelInfo("adam", "Adam", "https://raw.githubusercontent.com/Darkrai9x/vbook-settings/main/ai-tts/models/adam.zip", 31472513L, 1, "male")
)
