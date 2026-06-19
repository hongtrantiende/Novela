package io.legado.app.vbookextension.util

import android.content.Context
import android.webkit.WebSettings
import io.legado.app.help.config.AppConfig

object UserAgentUtils {
    fun getCleanUserAgent(context: Context): String {
        val appUa = try {
            AppConfig.userAgent
        } catch (e: Exception) {
            ""
        }
        if (!appUa.isNullOrBlank()) {
            return appUa
        }
        
        val ua = try {
            WebSettings.getDefaultUserAgent(context)
        } catch (e: Exception) {
            "Mozilla/5.0 (Linux; Android 13; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Mobile Safari/537.36"
        }
        return ua
    }
}
