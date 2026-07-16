package io.legado.app.utils

import android.widget.TextView
import androidx.collection.LruCache
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import android.content.Context
import io.legado.app.R
import io.legado.app.constant.PreferKey
import io.legado.app.model.TranslationLoader
import io.legado.app.ui.config.translation.TranslationConfig
import kotlinx.coroutines.*
import splitties.init.appCtx
import java.util.regex.Pattern

import kotlinx.coroutines.sync.Semaphore
import kotlinx.coroutines.sync.withPermit

/**
 * Translation utility for VietPhrase Chinese-Vietnamese translation
 * Ported from Dictionary.js logic
 */
object TranslateUtils {
    
    val networkSemaphore = Semaphore(1)
    
    // Cache for translated texts (max 10MB worth of strings)
    private val translationCache = object : LruCache<String, String>(10 * 1024 * 1024) {
        override fun sizeOf(key: String, value: String): Int {
            return key.length * 2 + value.length * 2
        }
    }
    
    // Pending translation jobs
    private val pendingJobs = mutableMapOf<String, Job>()
    
    // Coroutine scope for translation
    private val translationScope = CoroutineScope(Dispatchers.IO + SupervisorJob())

    // Regex patterns for processText
    private val trimSpacesBefore = Pattern.compile(" +([,.?!\\]>”’):】])")
    private val trimSpacesAfter = Pattern.compile("([<\\[“‘(【]) +")
    private val capitalizeRegex = Pattern.compile("(^\\s*|[.!?“‘”’\\[【-]\\s*)(\\p{Ll})", Pattern.MULTILINE) // \p{Ll} is lowercase letter

    // Punctuation mapping
    private val punctuationMapping = mapOf(
        '。' to ". ", '．' to ". ", '，' to ", ", '、' to ", ", '；' to ";", '：' to ": ", '！' to "!", '？' to "?", '…' to "...",
        '（' to "【", '）' to "】",
        '〔' to "【", '〕' to "】",
        '【' to "【", '】' to "】",
        '〖' to "【", '〗' to "】",
        '〘' to "【", '〙' to "】",
        '〚' to "【", '〛' to "】",
        '『' to "【", '』' to "】",
        '《' to "【", '》' to "】",
        '〈' to "【", '〉' to "】",
        '｛' to "【", '｝' to "】",
        '「' to "【", '」' to "】",
        '(' to "【", ')' to "】",
        '{' to "【", '}' to "】",
        '～' to "~", '—' to "-", '　' to " "
    )

    private val chapterUnitMap = mapOf(
        "cuộn" to "Quyển",
        "trở lại" to "Hồi",
        "chương" to "Chương",
        "màn hình" to "Màn",
        "nếp gấp" to "Chiết",
        "Lễ hội" to "Tiết",
        "bộ" to "Tập"
    )

    /**
     * Check if translation is enabled
     */
    fun isTranslateEnabled(): Boolean {
        return io.legado.app.ui.config.translation.TranslationConfig.isGlobalTranslateEnabled ||
                io.legado.app.ui.config.translation.TranslationConfig.llmTranslateEnabled
    }

    /**
     * Translate chapter title (e.g. 第12章 -> Chương 12)
     * Also translates surrounding text using translateMeta
     */
    suspend fun translateChapterTitle(raw: String): String {
        val text = raw.trim()
        if (text.isEmpty()) return ""

        // Regex: 第 [numbers] [unit]
        // Supports: 第十二章, 第3回, 第一卷
        val regex = Regex("""第\s*([0-9一二三四五六七八九十百千零〇两]+)\s*([卷回章节幕折集])""")
        
        // Find match
        val match = regex.find(text)

        if (match == null) {
            return translateMeta(text)
        }

        // Extract parts
        val numberCn = match.groupValues[1]
        val unitCn = match.groupValues[2]

        // Convert number and unit
        val number = chineseNumberToInt(numberCn)
        val unitVi = chapterUnitMap[unitCn] ?: "Chương"
        
        val chapterPart = "$unitVi $number"

        // Translate text before and after the match
        val preMatch = text.substring(0, match.range.first)
        val postMatch = text.substring(match.range.last + 1)
        
        val translatedPre = if (preMatch.isNotBlank()) translateMeta(preMatch) + " " else ""
        val translatedPostRaw = if (postMatch.isNotBlank()) translateMeta(postMatch).trim() else ""

        val separator = if (translatedPostRaw.isNotEmpty()) {
            if (translatedPostRaw.startsWith(":") || translatedPostRaw.startsWith("：")) "" else ": "
        } else ""

        val translatedPost = if (translatedPostRaw.isNotEmpty()) separator + translatedPostRaw else ""

        return "$translatedPre$chapterPart$translatedPost".trim()
    }

    private fun chineseNumberToInt(chineseNumber: String): Int {
        var result = 0
        var temp = 0
        var bill = 0L // Billion
        
        // Simple mapping
        val map = mapOf(
            '零' to 0, '〇' to 0,
            '一' to 1, '二' to 2, '两' to 2, '三' to 3, '四' to 4,
            '五' to 5, '六' to 6, '七' to 7, '八' to 8, '九' to 9
        )
        
        if (chineseNumber.all { it.isDigit() }) {
             return chineseNumber.toIntOrNull() ?: 0
        }

        for (char in chineseNumber) {
            when (char) {
                in map.keys -> {
                    temp = map[char]!!
                }
                '十' -> {
                    if (temp == 0) temp = 1
                    result += temp * 10
                    temp = 0
                }
                '百' -> {
                    result += temp * 100
                    temp = 0
                }
                '千' -> {
                    result += temp * 1000
                    temp = 0
                }
                '万' -> {
                    result += temp
                    result *= 10000
                    temp = 0
                }
                else -> {
                    // Ignore unknown chars or just digit conversion locally if mixed
                    if (char.isDigit()) {
                        temp = char.toString().toInt()
                    }
                }
            }
        }
        result += temp
        return result
    }
    
    /**
     * Translate text for metadata (book names, authors, etc.)
     */
    suspend fun translateMeta(text: String?): String {
        return translateText(text, true)
    }
    
    /**
     * Translate text for content (chapter content)
     */
    suspend fun translateContent(text: String?): String {
        return translateText(text, false)
    }

    /**
     * Dịch an toàn cho sortUrl hoặc exploreUrl.
     * Chỉ dịch phần tên đứng trước '::', giữ nguyên phần URL sau '::'.
     */
    suspend fun translateSortExploreUrl(raw: String?): String? {
        if (raw.isNullOrBlank() || !isTranslateEnabled()) return raw
        
        // Nếu là JS hoặc có thẻ <js>, không dịch code để tránh hỏng cú pháp JS (như dấu ngoặc)
        if (raw.trim().startsWith("@js:", true) || raw.trim().startsWith("<js>", true)) {
            return raw
        }
        
        // Nếu là JSON Array, dùng translateCode để dịch an toàn các chuỗi bên trong
        if (raw.trim().startsWith("[")) {
            return translateCode(raw)
        }
        
        // Nếu là định dạng dòng Name::URL
        val lines = raw.split("\n")
        val result = StringBuilder()
        lines.forEachIndexed { index, line ->
            if (line.contains("::")) {
                val name = line.substringBefore("::")
                val url = line.substringAfter("::")
                result.append(translateCode(name)).append("::").append(url)
            } else {
                result.append(translateCode(line))
            }
            if (index < lines.size - 1) {
                result.append("\n")
            }
        }
        return result.toString()
    }

    /**
     * Translate text for code/templates (preserve exact syntax, brackets, casing)
     */
    suspend fun translateCode(text: String?): String {
        if (text.isNullOrBlank()) return text ?: ""
        if (!isTranslateEnabled()) return text
        
        val cacheKey = "translate|vietphrase|v2|code|" + MD5Utils.md5Encode16(text)
        translationCache.get(cacheKey)?.let { return it }
        
        return try {
            val translated = performCodeTranslation(text)
            translationCache.put(cacheKey, translated)
            translated
        } catch (e: Exception) {
            e.printStackTrace()
            text
        }
    }

    private suspend fun translateText(text: String?, isMeta: Boolean): String {
        if (text.isNullOrBlank()) return text ?: ""
        if (!isTranslateEnabled()) return text
        
        val cacheKey = generateCacheKey(text, isMeta)
        translationCache.get(cacheKey)?.let { return it }
        
        return try {
            // Protect HTML tags (especially <img>) from translation
            // Identify tags
            val matcher = Pattern.compile("<[^>]+>").matcher(text)
            val tags = ArrayList<String>()
            val sb = StringBuffer()
            var i = 0
            while (matcher.find()) {
                tags.add(matcher.group())
                matcher.appendReplacement(sb, "[[LG_TAG_$i]]")
                i++
            }
            matcher.appendTail(sb)
            
            var translated = performTranslation(sb.toString())
            
            // Restore tags
            // Use regex to find placeholders and replace back
            for (j in 0 until i) {
                // Use literal replacement to avoid issues with reserved chars
                translated = translated.replace("[[LG_TAG_$j]]", tags[j])
            }
            
            translationCache.put(cacheKey, translated)
            translated
        } catch (e: Exception) {
            e.printStackTrace()
            text
        }
    }
    
    /**
     * Translate a TextView's text asynchronously
     */
    fun translateView(
        textView: TextView,
        text: String?,
        transform: ((String) -> CharSequence)? = null,
        setter: ((CharSequence) -> Unit)? = null
    ) {
        if (text.isNullOrBlank()) {
            val finalText = transform?.invoke("") ?: ""
            (setter ?: { textView.text = it }).invoke(finalText)
            textView.setTag(R.id.tag_translate_key, null)
            return
        }
        
        if (!isTranslateEnabled()) {
            val finalText = transform?.invoke(text) ?: text
            (setter ?: { textView.text = it }).invoke(finalText)
            textView.setTag(R.id.tag_translate_key, null)
            return
        }
        
        val cacheKey = generateCacheKey(text, true)
        
        // Check if this view is already showing the translated version
        if (textView.getTag(R.id.tag_translate_key) == cacheKey) {
             translationCache.get(cacheKey)?.let { translated ->
                 // Already translated
                 return
             }
        }
        
        // Show original first
        val originalText = transform?.invoke(text) ?: text
        (setter ?: { textView.text = it }).invoke(originalText)
        textView.setTag(R.id.tag_translate_key, cacheKey)
        
        // Check cache
        translationCache.get(cacheKey)?.let { translated ->
            val finalText = transform?.invoke(translated) ?: translated
            (setter ?: { textView.text = it }).invoke(finalText)
            return
        }
        
        // Cancel any pending translation for this view
        pendingJobs[cacheKey]?.cancel()
        
        // Start async translation
        val job = translationScope.launch {
            try {
                val translated = performTranslation(text)
                translationCache.put(cacheKey, translated)
                
                withContext(Dispatchers.Main) {
                    // Only update if the view still has the same cache key
                    if (textView.getTag(R.id.tag_translate_key) == cacheKey) {
                        val finalText = transform?.invoke(translated) ?: translated
                        (setter ?: { textView.text = it }).invoke(finalText)
                    } else {
                    }
                }
            } catch (e: CancellationException) {
                // Expected cancellation, no need to print stack trace
            } catch (e: Exception) {
                android.util.Log.e("TranslateUtils", "Translation error for: ${text.take(30)}...", e)
            } finally {
                pendingJobs.remove(cacheKey)
            }
        }
        
        pendingJobs[cacheKey] = job
    }
    
    /**
     * Perform actual translation using VietPhrase dictionaries logic
     * Ported from Dictionary.js: translate(text)
     */
    private suspend fun performTranslation(text: String): String = withContext(Dispatchers.Default) {
        val context = splitties.init.appCtx
        io.legado.app.vbookextension.util.QuickTranslateEngine.translate(context, text, "vi")
    }

    /**
     * Perform translation optimized for Code (removes formatting steps that break URL and Syntax)
     */
    private suspend fun performCodeTranslation(text: String): String = withContext(Dispatchers.Default) {
        val data = TranslationLoader.loadTranslationData()
        if (data == null) {
            android.util.Log.e("TranslateUtils", "Translation data is null - cannot translate code")
            return@withContext text
        }
        
        // Tokenize Directly Without Punctuation Conversion
        val tokens = tokenize(text, data)
        val sb = java.lang.StringBuilder()
        
        for (token in tokens) {
            if (token.isEmpty()) continue
            
            if (!isChineseCharacter(token[0])) {
                sb.append(token)
                continue
            }
            
            if (token == "của" || token == "Hiểu rồi" || token == "viết") {
                continue
            }
            
            var translation = searchInDictionaries(token, data)
            if (translation != null) {
                val slashIdx = translation.indexOf('/')
                val barIdx = translation.indexOf('|')
                val splitIdx = when {
                    slashIdx != -1 && barIdx != -1 -> minOf(slashIdx, barIdx)
                    slashIdx != -1 -> slashIdx
                    barIdx != -1 -> barIdx
                    else -> -1
                }
                if (splitIdx != -1) {
                    translation = translation.substring(0, splitIdx).trim()
                }
                val lastChar = if (sb.isNotEmpty()) sb.last() else ' '
                if (lastChar.isLetterOrDigit()) {
                    sb.append(" ")
                }
                sb.append(translation)
            } else {
                val phienAm = data.chinesePhienAm[token]
                if (phienAm != null) {
                    val lastChar = if (sb.isNotEmpty()) sb.last() else ' '
                    if (lastChar.isLetterOrDigit()) {
                        sb.append(" ")
                    }
                    sb.append(phienAm)
                } else {
                    sb.append(token)
                }
            }
        }
        
        sb.toString()
    }

    private fun searchInDictionaries(key: String, data: io.legado.app.model.TranslationData): String? {
        // Priority: Names > VietPhrase
        data.names.findLongestMatch(key, 0)?.let { (len, value) -> 
            if (len == key.length) return value 
        }
        data.vietPhrase.findLongestMatch(key, 0)?.let { (len, value) -> 
            if (len == key.length) return value 
        }
        
        return null
    }

    fun tokenize(text: String, data: io.legado.app.model.TranslationData): List<String> {
        val output = ArrayList<String>()
        var currentIndex = 0
        val length = text.length
        
        while (currentIndex < length) {
            var longestMatchLen = 0
            
            // Check names dictionary
            data.names.findLongestMatch(text, currentIndex)?.let { (len, _) ->
                if (len > longestMatchLen) {
                    longestMatchLen = len
                }
            }
            
            // Check vietPhrase dictionary
            data.vietPhrase.findLongestMatch(text, currentIndex)?.let { (len, _) ->
                if (len > longestMatchLen) {
                    longestMatchLen = len
                }
            }
            
            if (longestMatchLen > 0) {
                // Found a word
                output.add(text.substring(currentIndex, currentIndex + longestMatchLen))
                currentIndex += longestMatchLen
            } else {
                // Not found
                if (isChineseCharacter(text[currentIndex])) {
                    output.add(text[currentIndex].toString())
                    currentIndex++
                } else {
                    // Non-Chinese sequence
                    val sb = StringBuilder()
                    sb.append(text[currentIndex])
                    currentIndex++
                    while (currentIndex < length && !isChineseCharacter(text[currentIndex])) {
                        sb.append(text[currentIndex])
                        currentIndex++
                    }
                    output.add(sb.toString())
                }
            }
        }
        return output
    }

    private fun isChineseCharacter(char: Char): Boolean {
        val charCode = char.code
        return charCode in 0x4E00..0x9FFF
    }

    private fun convertPunctuation(text: String): String {
        val sb = StringBuilder()
        for (char in text) {
            sb.append(punctuationMapping[char] ?: char)
        }
        return sb.toString()
    }

    private fun processText(input: String): String {
        // Step 1: Trim spaces
        val lines = input.split("\n")
        val processingLines = lines.map { it.trim() }
        val joined = processingLines.joinToString("\n")
        
        // Step 2: Regex Replacements
        var result = joined
        
        // trimSpacesBefore: / +([,.?!\]\>”’):])/g -> replace with $1
        var matcher = trimSpacesBefore.matcher(result)
        result = matcher.replaceAll("$1")
        
        // trimSpacesAfter: /([<\[“‘(]) +/g -> replace with $1
        matcher = trimSpacesAfter.matcher(result)
        result = matcher.replaceAll("$1")
        
        // capitalizeRegex: /(^\s*|[.!?“‘”’\[-]\s*)(\p{Ll})/gu -> uppercase $2
        val sb = StringBuilder()
        matcher = capitalizeRegex.matcher(result)
        var lastEnd = 0
        while (matcher.find()) {
            sb.append(result.substring(lastEnd, matcher.start()))
            val p1 = matcher.group(1) // punctuation/space prefix
            val p2 = matcher.group(2) // lowercase char
            sb.append(p1).append(p2?.uppercase())
            lastEnd = matcher.end()
        }
        sb.append(result.substring(lastEnd))
        result = sb.toString()
        
        // Replace special quotes and trim multiple spaces
        result = result.replace(Regex("[“‘”’]"), "\"")
        result = result.replace(Regex(" +"), " ")
        
        return result
    }

    /**
     * Generate cache key for text
     */
    private fun generateCacheKey(text: String, isMeta: Boolean): String {
        val md5 = MD5Utils.md5Encode16(text)
        val type = if (isMeta) "meta" else "content"
        return "translate|vietphrase|v2|$type|$md5"
    }
    
    /**
     * Clear translation cache
     */
    fun clearCache() {
        translationCache.evictAll()
        translateStateCache.evictAll()
        TranslationLoader.clearCache()
    }
    
    /**
     * Cancel all pending translations
     */
    fun cancelAll() {
        pendingJobs.values.forEach { it.cancel() }
        pendingJobs.clear()
    }

    /**
     * Perform Hán Việt (Phien Am) translation
     */
    suspend fun translatePhienAm(text: String?): String = withContext(Dispatchers.Default) {
        if (text.isNullOrBlank()) return@withContext ""
        val context = splitties.init.appCtx
        io.legado.app.vbookextension.util.QuickTranslateEngine.translate(context, text, "hanviet")
    }

    /**
     * Translate text dynamically based on the selected engine and mode
     */
    suspend fun translateWithEngine(text: String?, engine: String, mode: String): String = withContext(Dispatchers.IO) {
        if (text.isNullOrBlank()) return@withContext ""

        // 1. Tiền dịch bằng từ điển riêng của truyện
        var processedText = text ?: ""
        val bookKey = io.legado.app.vbookextension.util.QuickTranslateEngine.currentBookKey
        if (!bookKey.isNullOrBlank()) {
            val privateDict = io.legado.app.vbookextension.util.QuickTranslateEngine.privateDict
            if (privateDict.isNotEmpty()) {
                val sortedKeys = privateDict.keys.sortedByDescending { it.length }
                for (key in sortedKeys) {
                    val valPart = privateDict[key] ?: continue
                    val cleanTrans = valPart.substringBefore('/')
                    processedText = safeReplace(processedText, key, cleanTrans)
                }
            }
        }

        return@withContext when (engine) {
            "STV", "Sáng Tác Việt" -> {
                networkSemaphore.withPermit {
                    try {
                        val formBody = okhttp3.FormBody.Builder()
                            .add("sajax", "trans")
                            .add("content", processedText)
                            .build()
                        val request = okhttp3.Request.Builder()
                            .url("https://comic.sangtacvietcdn.xyz/tsm.php?cdn=/")
                            .post(formBody)
                            .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36")
                            .build()
                        io.legado.app.help.http.okHttpClient.newCall(request).execute().use { response ->
                            if (response.isSuccessful) {
                                val bodyStr = response.body?.string()
                                if (!bodyStr.isNullOrEmpty()) {
                                    bodyStr
                                } else {
                                    processedText
                                }
                            } else {
                                processedText
                            }
                        }
                    } catch (e: Exception) {
                        e.printStackTrace()
                        text ?: ""
                    }
                }
            }
            else -> { // QT
                val targetMode = if (mode.contains("Hán Việt")) "hanviet" else "vi"
                if (targetMode == "hanviet") translatePhienAm(text) else translateContent(text)
            }
        }
    }

    private fun isLatinLetterOrDigit(c: Char): Boolean {
        return c.isDigit() || java.lang.Character.UnicodeScript.of(c.code) == java.lang.Character.UnicodeScript.LATIN
    }

    private fun safeReplace(text: String, target: String, replacement: String): String {
        if (target.isEmpty() || !text.contains(target)) return text
        val sb = StringBuilder()
        var i = 0
        val len = text.length
        val targetLen = target.length
        while (i < len) {
            if (i <= len - targetLen && text.startsWith(target, i)) {
                val hasLetterBefore = i > 0 && isLatinLetterOrDigit(text[i - 1])
                val hasLetterAfter = i + targetLen < len && isLatinLetterOrDigit(text[i + targetLen])
                
                if (hasLetterBefore) {
                    sb.append(' ')
                }
                sb.append(replacement)
                if (hasLetterAfter) {
                    sb.append(' ')
                }
                i += targetLen
            } else {
                sb.append(text[i])
                i++
            }
        }
        return sb.toString()
    }

    suspend fun forceTranslateContent(text: String?): String {
        if (text.isNullOrBlank()) return ""
        return try {
            performTranslation(text)
        } catch (e: Exception) {
            e.printStackTrace()
            text
        }
    }
}

private val translateStateCache = android.util.LruCache<String, String>(500)

@Composable
fun translateAsState(
    text: String?,
    isMeta: Boolean = true,
    isDetail: Boolean = false,
    extId: String? = null
): State<String> {
    val isDictLoadedState = io.legado.app.vbookextension.util.QuickTranslateEngine.isDictLoadedFlow.collectAsState()
    val isDictLoaded = isDictLoadedState.value

    val isEnabled = TranslateUtils.isTranslateEnabled() &&
            (!isDetail || io.legado.app.ui.config.translation.TranslationConfig.translationScope == "Tất cả")

    val mode = when {
        TranslationConfig.isGlobalTranslateEnabled -> "Việt (VP)"
        TranslationConfig.llmTranslateEnabled && TranslationConfig.llmProvider == "sangtacviet" -> "Dịch bằng API"
        else -> "Gốc"
    }
    val engine = when {
        TranslationConfig.llmTranslateEnabled && TranslationConfig.llmProvider == "sangtacviet" -> "STV"
        else -> "QT"
    }

    val cacheKey = if (text.isNullOrBlank()) null else "${text}_${isEnabled}_${mode}_${engine}_${TranslationConfig.translationTarget}_${isMeta}_${isDictLoaded}"

    val state = remember(text, isEnabled, mode, engine, isDictLoaded) { 
        mutableStateOf(
            if (cacheKey != null && translateStateCache.get(cacheKey) != null) {
                translateStateCache.get(cacheKey)!!
            } else if (isEnabled && !isDictLoaded) {
                // Không hiển thị tiếng Trung khi đang đợi dịch lần đầu (tránh nháy chữ)
                // Dùng khoảng trắng tàng hình (zero-width space) để giữ nguyên cấu trúc layout không bị sập
                "\u200B"
            } else {
                text ?: ""
            }
        ) 
    }

    LaunchedEffect(text, isEnabled, mode, engine, isDictLoaded) {
        if (text.isNullOrBlank()) {
            state.value = ""
            return@LaunchedEffect
        }
        
        val cached = if (!isEnabled || isDictLoaded) cacheKey?.let { translateStateCache.get(it) } else null
        if (cached != null) {
            state.value = cached
            return@LaunchedEffect
        }
        
        android.util.Log.d("TranslateUtils", "translateAsState starting for: '$text'")
        if (isEnabled) {
            if (engine == "QT") {
                if (TranslationConfig.translationTarget == "Hán Việt") {
                    state.value = TranslateUtils.translatePhienAm(text)
                } else {
                    state.value = if (isMeta) TranslateUtils.translateMeta(text)
                                  else TranslateUtils.translateContent(text)
                }
            } else {
                state.value = TranslateUtils.translateWithEngine(text, engine, mode)
            }
            android.util.Log.d("TranslateUtils", "translateAsState finished: '$text' -> '${state.value}'")
        } else {
            state.value = text
        }
        
        if (cacheKey != null && (!isEnabled || isDictLoaded)) {
            translateStateCache.put(cacheKey, state.value)
        }
    }
    return state
}

