package io.legado.app.help.tts

import android.content.Context
import io.legado.app.constant.AppLog
import org.json.JSONObject
import java.io.File
import java.text.Normalizer

/**
 * Vietnamese G2P (Grapheme-to-Phoneme) engine for Piper TTS models.
 *
 * Converts Vietnamese text into phoneme ID sequences that the Piper ONNX model can synthesize.
 * Based on reverse-engineering VBook's yv8 class which implements Vietnamese phonological rules.
 *
 * Pipeline: Text → Normalize → Split words → G2P per word → IPA phonemes → phoneme_id_map → int[]
 */
object AiTtsDict {
    private var phonemeIdMap: Map<String, Int> = emptyMap()
    private var isLoaded = false
    private var loadedModelId: String? = null

    // Special token IDs (loaded from phoneme_id_map, with defaults)
    private var BOS_ID = 1     // ^ (beginning of sentence)
    private var EOS_ID = 2     // $ (end of sentence)
    private var SEP_ID = 3     // # (word separator)
    private var SIL_ID = 51    // sil (silence / sentence boundary)
    private var SP_ID = 52     // sp (short pause / comma)

    // =====================================================================
    // Vietnamese Phonological Maps (matching VBook's yv8 static initializer)
    // =====================================================================

    /** Onset consonants (Northern dialect) — ordered longest-first for greedy matching */
    private val ONSETS_NORTH = linkedMapOf(
        "ngh" to "ŋ",
        "ng" to "ŋ",
        "nh" to "ɲ",
        "gh" to "ɣ",
        "ch" to "c",
        "th" to "tʰ",
        "tr" to "c",    // North: tr → c
        "ph" to "f",
        "kh" to "x",
        "đ" to "d",
        "b" to "b",
        "c" to "k",
        "d" to "z",     // North: d → z
        "g" to "ɣ",
        "h" to "h",
        "k" to "k",
        "l" to "l",
        "m" to "m",
        "n" to "n",
        "p" to "p",
        "q" to "k",
        "r" to "z",     // North: r → z
        "s" to "s",     // North: s → s
        "t" to "t",
        "v" to "v",
        "x" to "s"
    )

    /** Nucleus vowels — ordered longest-first for greedy matching */
    private val NUCLEI = linkedMapOf(
        "ươ" to "ɯə",
        "uô" to "uə",
        "iê" to "iə",
        "yê" to "iə",
        "ưa" to "ɯə",
        "ua" to "uə",
        "ia" to "iə",
        "ya" to "iə",
        "a" to "a",
        "ă" to "ɐ",
        "â" to "ɤ̆",
        "e" to "ɛ",
        "ê" to "e",
        "i" to "i",
        "o" to "ɔ",
        "ô" to "o",
        "ơ" to "ɤ",
        "u" to "u",
        "ư" to "ɯ",
        "y" to "i"
    )

    /** Coda consonants — ordered longest-first */
    private val CODAS = linkedMapOf(
        "ng" to "ŋ",
        "nh" to "ɲ",
        "ch" to "c",
        "c" to "k",
        "m" to "m",
        "n" to "n",
        "p" to "p",
        "t" to "t",
        "i" to "j",
        "y" to "j",
        "u" to "w",
        "o" to "w"
    )

    /** Map diacritical vowel characters to their tone (T1-T6) */
    private val TONE_MAP = buildMap<Char, String> {
        // à á ả ã ạ
        put('\u00E0', "T2"); put('\u00E1', "T3"); put('\u1EA3', "T4"); put('\u00E3', "T5"); put('\u1EA1', "T6")
        // ằ ắ ẳ ẵ ặ
        put('\u1EB1', "T2"); put('\u1EAF', "T3"); put('\u1EB3', "T4"); put('\u1EB5', "T5"); put('\u1EB7', "T6")
        // ầ ấ ẩ ẫ ậ
        put('\u1EA7', "T2"); put('\u1EA5', "T3"); put('\u1EA9', "T4"); put('\u1EAB', "T5"); put('\u1EAD', "T6")
        // è é ẻ ẽ ẹ
        put('\u00E8', "T2"); put('\u00E9', "T3"); put('\u1EBB', "T4"); put('\u1EBD', "T5"); put('\u1EB9', "T6")
        // ề ế ể ễ ệ
        put('\u1EC1', "T2"); put('\u1EBF', "T3"); put('\u1EC3', "T4"); put('\u1EC5', "T5"); put('\u1EC7', "T6")
        // ì í ỉ ĩ ị
        put('\u00EC', "T2"); put('\u00ED', "T3"); put('\u1EC9', "T4"); put('\u0129', "T5"); put('\u1ECB', "T6")
        // ò ó ỏ õ ọ
        put('\u00F2', "T2"); put('\u00F3', "T3"); put('\u1ECF', "T4"); put('\u00F5', "T5"); put('\u1ECD', "T6")
        // ồ ố ổ ỗ ộ
        put('\u1ED3', "T2"); put('\u1ED1', "T3"); put('\u1ED5', "T4"); put('\u1ED7', "T5"); put('\u1ED9', "T6")
        // ờ ớ ở ỡ ợ
        put('\u1EDD', "T2"); put('\u1EDB', "T3"); put('\u1EDF', "T4"); put('\u1EE1', "T5"); put('\u1EE3', "T6")
        // ù ú ủ ũ ụ
        put('\u00F9', "T2"); put('\u00FA', "T3"); put('\u1EE7', "T4"); put('\u0169', "T5"); put('\u1EE5', "T6")
        // ừ ứ ử ữ ự
        put('\u1EEB', "T2"); put('\u1EE9', "T3"); put('\u1EED', "T4"); put('\u1EEF', "T5"); put('\u1EF1', "T6")
        // ỳ ý ỷ ỹ ỵ
        put('\u1EF3', "T2"); put('\u00FD', "T3"); put('\u1EF7', "T4"); put('\u1EF9', "T5"); put('\u1EF5', "T6")
    }

    /** Map toned vowel characters to their base (untoned) character */
    private val DETONE_MAP = buildMap<Char, Char> {
        for (c in "àáảãạ") put(c, 'a')
        for (c in "ằắẳẵặ") put(c, 'ă')
        for (c in "ầấẩẫậ") put(c, 'â')
        for (c in "èéẻẽẹ") put(c, 'e')
        for (c in "ềếểễệ") put(c, 'ê')
        for (c in "ìíỉĩị") put(c, 'i')
        for (c in "òóỏõọ") put(c, 'o')
        for (c in "ồốổỗộ") put(c, 'ô')
        for (c in "ờớởỡợ") put(c, 'ơ')
        for (c in "ùúủũụ") put(c, 'u')
        for (c in "ừứửữự") put(c, 'ư')
        for (c in "ỳýỷỹỵ") put(c, 'y')
    }

    /** Set of base vowel characters (for checking if a char is a vowel) */
    private val VOWEL_CHARS = "aeiouyươâăêô"

    /** Punctuation that maps to sentence-boundary silence */
    private val SENTENCE_PUNCTS = ".!?"

    /** Punctuation that maps to short pause */
    private val PAUSE_PUNCTS = ",;:"

    // =====================================================================
    // Loading
    // =====================================================================

    @Synchronized
    fun load(context: Context, modelId: String) {
        if (isLoaded && loadedModelId == modelId) return
        try {
            val configFile = File(context.filesDir, "ai-tts/models/$modelId/config.json")
            if (!configFile.exists()) {
                AppLog.put("Config file not found for model: $modelId")
                return
            }

            val configJson = JSONObject(configFile.readText())
            val phonemeIdMapJson = configJson.optJSONObject("phoneme_id_map") ?: run {
                AppLog.put("phoneme_id_map not found in config.json for model: $modelId")
                return
            }

            // Parse phoneme_id_map: each key maps to a JSON array of ints (usually single element)
            val map = HashMap<String, Int>()
            val keys = phonemeIdMapJson.keys()
            while (keys.hasNext()) {
                val key = keys.next()
                val arr = phonemeIdMapJson.optJSONArray(key)
                if (arr != null && arr.length() > 0) {
                    map[key] = arr.getInt(0)
                }
            }
            phonemeIdMap = map

            // Load special token IDs
            BOS_ID = map["^"] ?: 1
            EOS_ID = map["$"] ?: 2
            SEP_ID = map["#"] ?: 3
            SIL_ID = map["sil"] ?: 51
            SP_ID = map["sp"] ?: 52

            isLoaded = true
            loadedModelId = modelId
            AppLog.put("Loaded phoneme_id_map for model $modelId: ${map.size} entries")
        } catch (e: Exception) {
            AppLog.put("Error loading phoneme_id_map: ${e.localizedMessage}", e)
        }
    }

    // =====================================================================
    // Vietnamese G2P
    // =====================================================================

    /**
     * Extract the tone from a Vietnamese word.
     * Returns the tone string (T1-T6) and the word with tones removed.
     */
    private fun extractTone(word: String): Pair<String, String> {
        var tone = "T1" // Default: level tone (thanh ngang)
        val sb = StringBuilder(word.length)
        for (ch in word) {
            val t = TONE_MAP[ch]
            if (t != null) {
                tone = t
                sb.append(DETONE_MAP[ch] ?: ch)
            } else {
                sb.append(ch)
            }
        }
        return Pair(tone, sb.toString())
    }

    /**
     * Find the onset consonant at the beginning of a word.
     * Returns (IPA string, number of characters consumed) or (null, 0) if no onset found.
     */
    private fun findOnset(word: String): Pair<String?, Int> {
        // Special case: "gi" prefix
        if (word.startsWith("gi")) {
            val rest = word.substring(2)
            return if (rest.startsWith("ê")) {
                // giê → onset = z (north), consume 2
                Pair("z", 2)
            } else if (rest.isNotEmpty() && rest[0] in VOWEL_CHARS) {
                // gi + vowel → onset = z, consume 2 (gi is the onset, i is NOT part of nucleus)
                Pair("z", 2)
            } else {
                // gi alone or gi + consonant → onset = z, consume 1 (treat as g+i)
                Pair("z", 1)
            }
        }

        // Special case: "qu" prefix
        if (word.startsWith("qu") && word.length > 2) {
            return Pair("k", 2) // qu → k onset, u is treated as glide
        }

        // General case: try longest match first
        for (len in minOf(3, word.length) downTo 1) {
            val candidate = word.substring(0, len)
            val ipa = ONSETS_NORTH[candidate]
            if (ipa != null) {
                return Pair(ipa, len)
            }
        }
        return Pair(null, 0)
    }

    /**
     * Decompose the remaining part of a word (after onset removal) into nucleus + coda.
     * Returns a Pair of (nucleus IPA, coda IPA) — either may be null.
     */
    private fun findNucleusAndCoda(remainder: String): Pair<String?, String?> {
        if (remainder.isEmpty()) return Pair(null, null)

        // Special cases: "ay" → ɐ + j, "au" → ɐ + w
        if (remainder == "ay") return Pair("ɐ", "j")
        if (remainder == "au") return Pair("ɐ", "w")

        // Try to find coda first (from the end), then nucleus is what's left
        for (codaLen in minOf(2, remainder.length) downTo 1) {
            val potentialCoda = remainder.substring(remainder.length - codaLen)
            val codaIpa = CODAS[potentialCoda]
            if (codaIpa != null) {
                val nucleusPart = remainder.substring(0, remainder.length - codaLen)
                if (nucleusPart.isNotEmpty()) {
                    // Try to match the nucleus
                    val nucleusIpa = findNucleus(nucleusPart)
                    if (nucleusIpa != null) {
                        return Pair(nucleusIpa, codaIpa)
                    }
                }
                // If nucleus part is empty but coda was found, continue trying shorter codas
            }
        }

        // No coda found — entire remainder is the nucleus
        val nucleusIpa = findNucleus(remainder)
        if (nucleusIpa != null) {
            return Pair(nucleusIpa, null)
        }

        // Try matching the first part as nucleus and the rest as coda
        for (nucLen in minOf(2, remainder.length) downTo 1) {
            val nucCandidate = remainder.substring(0, nucLen)
            val nucIpa = NUCLEI[nucCandidate]
            if (nucIpa != null) {
                val codaPart = remainder.substring(nucLen)
                if (codaPart.isEmpty()) {
                    return Pair(nucIpa, null)
                }
                val codaIpa = CODAS[codaPart] ?: codaPart // fallback: use raw string
                return Pair(nucIpa, codaIpa)
            }
        }

        // Complete fallback — treat the whole thing as a nucleus string
        return Pair(remainder, null)
    }

    private fun findNucleus(s: String): String? {
        // Try 2-char match first, then 1-char
        if (s.length >= 2) {
            val twoChar = NUCLEI[s.substring(0, 2)]
            if (twoChar != null && s.length == 2) return twoChar
        }
        if (s.length == 1) {
            return NUCLEI[s]
        }
        return null
    }

    /**
     * Convert a single Vietnamese word to a list of IPA phoneme strings.
     * Follows VBook's yv8 decomposition logic.
     */
    private fun wordToPhonemes(word: String): List<String> {
        if (word == "mắc") {
            return listOf("m", "ɐ", "t", "T3")
        }
        if (word.isEmpty()) return emptyList()

        val phonemes = ArrayList<String>()

        // 1. Extract tone
        val (tone, detoned) = extractTone(word)

        // Special override for "chieu" to avoid "chiu" pronunciation bug in the model
        if (detoned == "chieu") {
            phonemes.add("c")
            phonemes.add("i")
            phonemes.add("e")
            phonemes.add("w")
            phonemes.add(tone)
            return phonemes
        }

        // 2. Find onset
        val (onsetIpa, onsetLen) = findOnset(detoned)
        if (onsetIpa != null && onsetIpa.isNotEmpty()) {
            phonemes.add(onsetIpa)
        }

        // 3. Remainder after onset
        val remainder = detoned.substring(onsetLen)

        // 4. Handle glide "u" after "qu"
        if (word.startsWith("qu") && remainder.isNotEmpty()) {
            // After "qu" → onset = k, add "w" glide, then process rest
            phonemes.add("w")
            val (nucIpa, codaIpa) = findNucleusAndCoda(remainder)
            if (nucIpa != null) phonemes.add(nucIpa)
            if (codaIpa != null) phonemes.add(codaIpa)
        } else {
            // Check for glide before nucleus
            if (remainder.length > 1 && remainder[0] in VOWEL_CHARS && remainder[0] != 'i') {
                val firstChar = remainder[0]
                // Check if this could be a 2-char nucleus
                val hasTwoCharNucleus = remainder.length >= 2 && NUCLEI.containsKey(remainder.substring(0, 2))
                if (!hasTwoCharNucleus) {
                    if (firstChar == 'o' && remainder[1] in VOWEL_CHARS && remainder[1] != 'o' && remainder[1] != 'i') {
                        // "o" before another vowel → glide "w"
                        phonemes.add("w")
                        val afterGlide = remainder.substring(1)
                        val (nucIpa, codaIpa) = findNucleusAndCoda(afterGlide)
                        if (nucIpa != null) phonemes.add(nucIpa)
                        if (codaIpa != null) phonemes.add(codaIpa)
                    } else if (firstChar == 'u' && remainder[1] in VOWEL_CHARS && remainder[1] != 'i' && !hasTwoCharNucleus) {
                        phonemes.add("w")
                        val afterGlide = remainder.substring(1)
                        val (nucIpa, codaIpa) = findNucleusAndCoda(afterGlide)
                        if (nucIpa != null) phonemes.add(nucIpa)
                        if (codaIpa != null) phonemes.add(codaIpa)
                    } else {
                        val (nucIpa, codaIpa) = findNucleusAndCoda(remainder)
                        if (nucIpa != null) phonemes.add(nucIpa)
                        if (codaIpa != null) phonemes.add(codaIpa)
                    }
                } else {
                    val (nucIpa, codaIpa) = findNucleusAndCoda(remainder)
                    if (nucIpa != null) phonemes.add(nucIpa)
                    if (codaIpa != null) phonemes.add(codaIpa)
                }
            } else {
                val (nucIpa, codaIpa) = findNucleusAndCoda(remainder)
                if (nucIpa != null) phonemes.add(nucIpa)
                if (codaIpa != null) phonemes.add(codaIpa)
            }
        }

        // 5. Add tone
        phonemes.add(tone)

        return phonemes
    }

    /**
     * Look up a phoneme string in the phoneme_id_map.
     * Returns the phoneme ID or -1 if not found.
     */
    private fun lookupPhonemeId(phoneme: String): Int {
        return phonemeIdMap[phoneme] ?: -1
    }

    // =====================================================================
    // Public API
    // =====================================================================

    /**
     * Convert raw Vietnamese text to phoneme IDs for Piper model synthesis.
     *
     * Output format matches VBook's LITERAL encoding mode:
     * [BOS, phoneme1, SEP, phoneme2, SEP, ..., phonemeN, SEP, EOS]
     */
    fun textToPhonemeIds(context: Context, text: String, modelId: String = "vi_north"): IntArray {
        load(context, modelId)
        if (phonemeIdMap.isEmpty()) {
            AppLog.put("phoneme_id_map is empty, cannot convert text to phoneme IDs")
            return intArrayOf()
        }

        val ids = ArrayList<Int>()

        // Start with BOS token (^)
        ids.add(BOS_ID)

        // Convert numbers to words first
        val textWithWords = convertNumbersToWordsInText(text)

        // Normalize text: NFC form, lowercase
        val normalizedText = Normalizer.normalize(textWithWords.lowercase(), Normalizer.Form.NFC)

        // Split by whitespace into tokens
        val tokens = normalizedText.trim().split(Regex("\\s+"))

        for (token in tokens) {
            if (token.isEmpty()) continue

            var word = token
            // Strip leading punctuation from the word
            val leadingPuncts = StringBuilder()
            while (word.isNotEmpty() && !word.first().isLetterOrDigit()) {
                leadingPuncts.append(word.first())
                word = word.substring(1)
            }

            // Strip trailing punctuation from the word
            val trailingPuncts = StringBuilder()
            while (word.isNotEmpty() && !word.last().isLetterOrDigit()) {
                trailingPuncts.insert(0, word.last())
                word = word.substring(0, word.length - 1)
            }

            // Process leading punctuation
            for (ch in leadingPuncts) {
                addPunctuation(ids, ch)
            }

            // Process the word (if non-empty)
            if (word.isNotEmpty()) {
                // Check if it's a single punctuation character
                if (word.length == 1 && !word[0].isLetterOrDigit()) {
                    addPunctuation(ids, word[0])
                } else {
                    // Vietnamese G2P decomposition
                    val phonemes = wordToPhonemes(word)

                    // Look up each phoneme individually and add SEP after each
                    for (phoneme in phonemes) {
                        val pid = lookupPhonemeId(phoneme)
                        if (pid >= 0) {
                            ids.add(pid)
                            ids.add(SEP_ID) // SEP after EVERY phoneme (VBook LITERAL mode)
                        }
                    }
                }
            }

            // Process trailing punctuation
            for (ch in trailingPuncts) {
                addPunctuation(ids, ch)
            }
        }

        // EOS token ($) — no SIL in LITERAL mode
        ids.add(EOS_ID)

        val result = ids.toIntArray()
        // Debug: log first 50 IDs for troubleshooting
        val preview = result.take(50).joinToString(", ")
        AppLog.put("G2P: \"${text.take(40)}\" → ${result.size} IDs: [$preview${if (result.size > 50) "..." else ""}]")
        
        return result
    }

    private fun addPunctuation(ids: ArrayList<Int>, ch: Char) {
        val pid = lookupPhonemeId(ch.toString())
        if (pid >= 0) {
            ids.add(pid)
            ids.add(SEP_ID)
        }
    }

    private fun convertNumbersToWordsInText(text: String): String {
        val regex = Regex("\\d+")
        return regex.replace(text) { matchResult ->
            numberToVietnameseWords(matchResult.value)
        }
    }

    private fun numberToVietnameseWords(numStr: String): String {
        val number = numStr.toLongOrNull()
        if (number == null) {
            return numStr.map { digitToWord(it - '0') }.joinToString(" ")
        }
        if (number == 0L) return "không"
        return convertLongToWords(number)
    }

    private fun digitToWord(digit: Int): String {
        return when (digit) {
            0 -> "không"
            1 -> "một"
            2 -> "hai"
            3 -> "ba"
            4 -> "bốn"
            5 -> "năm"
            6 -> "sáu"
            7 -> "bảy"
            8 -> "tám"
            9 -> "chín"
            else -> ""
        }
    }

    private val UNITS = arrayOf("", " nghìn", " triệu", " tỷ")

    private fun convertLongToWords(n: Long): String {
        var number = n
        if (number == 0L) return ""
        var result = ""
        var unitIndex = 0
        
        while (number > 0) {
            val triplet = (number % 1000).toInt()
            if (triplet > 0) {
                val tripletStr = convertTripletToWords(triplet, number >= 1000)
                val unit = if (unitIndex < UNITS.size) UNITS[unitIndex] else " tỷ".repeat(unitIndex / 3 + 1)
                result = tripletStr + unit + (if (result.isNotEmpty()) " " else "") + result
            } else if (unitIndex == 3) {
                result = "tỷ " + result
            }
            number /= 1000
            unitIndex++
        }
        return result.trim().replace(Regex("\\s+"), " ")
    }

    private fun convertTripletToWords(n: Int, hasHigher: Boolean): String {
        val hundreds = n / 100
        val tens = (n % 100) / 10
        val ones = n % 10
        
        val sb = StringBuilder()
        
        if (hundreds > 0) {
            sb.append(digitToWord(hundreds)).append(" trăm")
        } else if (hasHigher) {
            sb.append("không trăm")
        }
        
        if (tens > 0) {
            if (sb.isNotEmpty()) sb.append(" ")
            if (tens == 1) {
                sb.append("mười")
            } else {
                sb.append(digitToWord(tens)).append(" mươi")
            }
        } else if (ones > 0 && (hundreds > 0 || hasHigher)) {
            if (sb.isNotEmpty()) sb.append(" ")
            sb.append("linh")
        }
        
        if (ones > 0) {
            if (sb.isNotEmpty()) sb.append(" ")
            if (ones == 1 && tens > 1) {
                sb.append("mốt")
            } else if (ones == 5 && tens > 0) {
                sb.append("lăm")
            } else if (ones == 4 && tens > 1) {
                sb.append("tư")
            } else {
                sb.append(digitToWord(ones))
            }
        }
        
        return sb.toString()
    }
}
