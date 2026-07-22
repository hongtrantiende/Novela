package io.legado.app.help

import android.content.Context
import android.util.Log
import io.legado.app.help.http.okHttpClient
import io.legado.app.model.TranslationLoader
import io.legado.app.vbookextension.util.QuickTranslateEngine
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONArray
import splitties.init.appCtx

object LtpNerClient {

    private const val TAG = "LtpNerClient"
    const val DEFAULT_SERVER_URL = "https://vietphrase.app/api/ner"

    data class NerEntity(
        val text: String,
        val tag: String, // "Nh" (Person), "Ns" (Location), "Ni" (Organization)
        val translation: String = ""
    )

    /**
     * Transliterate Chinese word to Hán-Việt title-cased string.
     * Example: "方远" -> "Phương Viễn", "落云宗" -> "Lạc Vân Tông"
     */
    suspend fun toHanViet(zhText: String, context: Context = appCtx): String = withContext(Dispatchers.IO) {
        if (zhText.isBlank()) return@withContext zhText

        // 1. Try TranslationLoader.loadTranslationData()?.chinesePhienAm
        try {
            val data = TranslationLoader.loadTranslationData()
            if (data != null && data.chinesePhienAm.isNotEmpty()) {
                val sb = StringBuilder()
                var hasTranslation = false
                for (char in zhText) {
                    val sChar = char.toString()
                    val phienAm = data.chinesePhienAm[sChar]
                    if (phienAm != null) {
                        hasTranslation = true
                        val firstReading = phienAm.substringBefore('/').substringBefore('|').substringBefore(' ').trim()
                        sb.append(firstReading).append(' ')
                    } else {
                        sb.append(sChar).append(' ')
                    }
                }
                if (hasTranslation) {
                    val raw = sb.toString().trim()
                    if (raw.isNotBlank() && !raw.any { it.code in 0x4E00..0x9FFF }) {
                        return@withContext raw.split(" ").joinToString(" ") { word ->
                            word.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
                        }
                    }
                }
            }
        } catch (e: Exception) {
            Log.w(TAG, "Error looking up chinesePhienAm: ${e.message}")
        }

        // 2. Try QuickTranslateEngine
        try {
            QuickTranslateEngine.init(context)
            val qtTrans = QuickTranslateEngine.translate(context, zhText, "vi")
            if (qtTrans.isNotBlank() && qtTrans != zhText && !qtTrans.any { it.code in 0x4E00..0x9FFF }) {
                return@withContext qtTrans.split(" ").joinToString(" ") { word ->
                    word.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
                }
            }
        } catch (e: Exception) {
            Log.w(TAG, "Error in QuickTranslateEngine: ${e.message}")
        }

        return@withContext zhText
    }

    /**
     * Fetch NER entities from server (vietphrase.app /api/ner or custom endpoint).
     */
    suspend fun fetchEntities(
        text: String,
        context: Context = appCtx,
        serverUrl: String = DEFAULT_SERVER_URL
    ): List<NerEntity> = withContext(Dispatchers.IO) {
        if (text.isBlank()) return@withContext emptyList()
        val cjkCount = text.count { it.code in 0x4E00..0x9FFF }
        if (cjkCount < 2) return@withContext emptyList()

        try {
            val body = text.toRequestBody("text/plain; charset=utf-8".toMediaType())
            val request = Request.Builder()
                .url(serverUrl)
                .post(body)
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36")
                .build()

            val response = okHttpClient.newCall(request).execute()
            if (!response.isSuccessful) {
                Log.w(TAG, "LTP NER server returned HTTP ${response.code}")
                return@withContext emptyList()
            }

            val responseText = response.body?.string() ?: return@withContext emptyList()
            val jsonArray = JSONArray(responseText)
            val resultList = mutableListOf<NerEntity>()
            val seen = mutableSetOf<String>()

            for (i in 0 until jsonArray.length()) {
                val obj = jsonArray.getJSONObject(i)
                val entityText = obj.optString("text", "").trim()
                val tag = obj.optString("tag", "")

                // Skip single-char or invalid entities (matches vietphrase.app rule)
                if (entityText.length >= 2 && entityText.all { it.code in 0x4E00..0x9FFF } && seen.add(entityText)) {
                    val formattedVi = toHanViet(entityText, context)
                    resultList.add(NerEntity(entityText, tag, formattedVi))
                }
            }

            Log.d(TAG, "LTP NER fetched ${resultList.size} entities from $serverUrl")
            resultList
        } catch (e: Exception) {
            Log.e(TAG, "LTP NER request failed", e)
            emptyList()
        }
    }
}
