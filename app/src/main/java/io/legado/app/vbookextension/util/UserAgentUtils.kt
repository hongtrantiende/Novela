package io.legado.app.vbookextension.util

import android.content.Context
import android.webkit.WebSettings

object UserAgentUtils {
    private var cleanUserAgent: String? = null

    fun getCleanUserAgent(context: Context): String {
        cleanUserAgent?.let { return it }
        val ua = try {
            WebSettings.getDefaultUserAgent(context)
        } catch (e: Exception) {
            "Mozilla/5.0 (Linux; Android 13; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Mobile Safari/537.36"
        }
        cleanUserAgent = ua
        return ua
    }
}
