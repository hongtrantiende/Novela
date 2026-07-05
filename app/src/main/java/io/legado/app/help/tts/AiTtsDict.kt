package io.legado.app.help.tts

import android.content.Context
import io.legado.app.constant.AppLog
import java.io.File
import java.io.InputStream
import java.text.Normalizer

object AiTtsDict {
    private val viDict = HashMap<String, IntArray>()
    private val enDict = HashMap<String, IntArray>()
    private var isLoaded = false

    // Bản đồ phoneme ID mặc định của espeak cho các ký tự đơn lẻ và dấu câu
    private val charIdMap = mapOf(
        ' ' to intArrayOf(3),
        '!' to intArrayOf(4),
        '\'' to intArrayOf(5),
        '(' to intArrayOf(6),
        ')' to intArrayOf(7),
        ',' to intArrayOf(8),
        '-' to intArrayOf(9),
        '.' to intArrayOf(10),
        ':' to intArrayOf(11),
        ';' to intArrayOf(12),
        '?' to intArrayOf(13),
        'a' to intArrayOf(14),
        'b' to intArrayOf(15),
        'c' to intArrayOf(16),
        'd' to intArrayOf(17),
        'e' to intArrayOf(18),
        'f' to intArrayOf(19),
        'h' to intArrayOf(20),
        'i' to intArrayOf(21),
        'j' to intArrayOf(22),
        'k' to intArrayOf(23),
        'l' to intArrayOf(24),
        'm' to intArrayOf(25),
        'n' to intArrayOf(26),
        'o' to intArrayOf(27),
        'p' to intArrayOf(28),
        'q' to intArrayOf(29),
        'r' to intArrayOf(30),
        's' to intArrayOf(31),
        't' to intArrayOf(32),
        'u' to intArrayOf(33),
        'v' to intArrayOf(34),
        'w' to intArrayOf(35),
        'x' to intArrayOf(36),
        'y' to intArrayOf(37),
        'z' to intArrayOf(38)
    )

    @Synchronized
    fun load(context: Context) {
        if (isLoaded) return
        try {
            val baseDir = File(context.filesDir, "ai-tts")
            val viFile = File(baseDir, "vi-word_id.bin")
            val enFile = File(baseDir, "en-word_id.bin")

            if (viFile.exists()) {
                viFile.inputStream().use { loadDict(it, viDict) }
            }
            if (enFile.exists()) {
                enFile.inputStream().use { loadDict(it, enDict) }
            }
            isLoaded = true
        } catch (e: Exception) {
            AppLog.put("Lỗi khi tải từ điển TTS AI: ${e.localizedMessage}", e)
        }
    }

    private fun loadDict(stream: InputStream, map: HashMap<String, IntArray>) {
        val buffer = stream.readBytes()
        var pos = 0
        val keyBuffer = java.io.ByteArrayOutputStream()
        while (pos < buffer.size) {
            keyBuffer.reset()
            while (pos < buffer.size && buffer[pos] != 0.toByte()) {
                keyBuffer.write(buffer[pos].toInt())
                pos++
            }
            if (pos >= buffer.size) break
            pos++ // Bỏ qua byte null 0x00
            
            val key = keyBuffer.toString("UTF-8")
            
            val valList = ArrayList<Int>()
            while (pos < buffer.size && buffer[pos] != 0xFF.toByte()) {
                valList.add(buffer[pos].toInt() and 0xFF)
                pos++
            }
            pos++ // Bỏ qua byte kết thúc mục từ 0xFF
            
            map[key] = valList.toIntArray()
        }
    }

    /**
     * Chuyển đổi văn bản thô sang mảng Phoneme IDs của Piper
     */
    fun textToPhonemeIds(context: Context, text: String): IntArray {
        load(context)
        val ids = ArrayList<Int>()
        
        // 1. Ký hiệu bắt đầu câu (Start of sentence = 1)
        ids.add(1)
        
        // 2. Token hóa văn bản: tách thành từ (chữ và số) hoặc các ký tự đặc biệt/dấu câu
        // Phải Normalize văn bản về dạng NFC (Dựng sẵn) do từ điển vi-word_id.bin đang sử dụng NFC.
        val normalizedText = Normalizer.normalize(text.lowercase(), Normalizer.Form.NFC)
        val matcher = java.util.regex.Pattern.compile("([\\p{L}\\p{N}]+|\\s+|\\p{Punct})").matcher(normalizedText)
        
        while (matcher.find()) {
            val token = matcher.group()
            if (token.isBlank()) {
                // Nếu là khoảng trắng -> Thêm ID khoảng trắng (3)
                ids.add(3)
            } else if (token.length == 1 && !token[0].isLetterOrDigit()) {
                // Nếu là ký tự dấu câu đơn lẻ
                val charIds = charIdMap[token[0]]
                if (charIds != null) {
                    ids.addAll(charIds.toList())
                }
            } else {
                // Nếu là từ
                val wordIds = viDict[token] ?: enDict[token]
                if (wordIds != null) {
                    ids.addAll(wordIds.toList())
                } else {
                    // Dự phòng: ánh xạ từng chữ cái của từ chưa biết
                    // Loại bỏ dấu để có thể fallback xuống ký tự cơ bản (a-z) thay vì bị sót ký tự có dấu
                    val tokenNoAccents = java.util.regex.Pattern.compile("\\p{InCombiningDiacriticalMarks}+")
                        .matcher(Normalizer.normalize(token, Normalizer.Form.NFD))
                        .replaceAll("").replace("đ", "d")
                    
                    for (char in tokenNoAccents) {
                        val charIds = charIdMap[char]
                        if (charIds != null) {
                            ids.addAll(charIds.toList())
                        }
                    }
                }
            }
        }
        
        // 3. Ký hiệu kết thúc câu (End of sentence = 2)
        ids.add(2)
        
        return ids.toIntArray()
    }
}
