package io.legado.app.vbookextension.util

import android.content.Context
import android.net.Uri
import android.util.Log
import android.webkit.WebResourceResponse
import java.io.BufferedReader
import java.io.ByteArrayInputStream
import java.io.InputStreamReader
import java.util.Locale
import java.util.concurrent.ConcurrentHashMap

object AdBlocker {
    private const val TAG = "AdBlocker"

    private val BLOCKED_EXTENSIONS = setOf(
        "jpg", "jpeg", "png", "gif", "webp", "svg", "ico",
        "css", "woff", "woff2", "ttf", "otf", "eot"
    )

    private val VIDEO_EXTENSIONS = setOf(
        "m3u8", "m3u", "mpd", "mp4", "m4v", "webm", "mkv", "mov", "ts"
    )

    private val AD_KEYWORD_IN_PATH = listOf(
        "/ads/", "/ad/", "/advert", "/banner", "/popunder", "/popup", "?ad=", "&ad="
    )

    private val DEFAULT_AD_HOSTS = setOf(
        "googleads.g.doubleclick.net",
        "pagead2.googlesyndication.com",
        "adservice.google.com",
        "adservice.google.com.vn",
        "securepubads.g.doubleclick.net",
        "www.google-analytics.com",
        "ssl.google-analytics.com",
        "analytics.tiktok.com",
        "connect.facebook.net",
        "www.facebook.com",
        "ads.twitter.com",
        "syndication.twitter.com",
        "static.criteo.net",
        "bidder.criteo.com",
        "cdn.taboola.com",
        "trc.taboola.com",
        "popads.net",
        "serve.popads.net",
        "popcash.net",
        "propellerads.com",
        "onclickads.net",
        "exoclick.com",
        "realsrv.com",
        "mgid.com",
        "jsc.mgid.com",
        "outbrain.com",
        "widgets.outbrain.com",
        "ad.directrev.com",
        "a.medyanetads.com",
        "ads.pubmatic.com",
        "c.amazon-adsystem.com",
        "s.amazon-adsystem.com",
        "aax.amazon-adsystem.com",
        "admicro.vn",
        "cpx.admicro.vn",
        "ssp.admicro.vn",
        "ants.vn",
        "e.ants.vn"
    )

    private val adHosts = ConcurrentHashMap.newKeySet<String>().apply {
        addAll(DEFAULT_AD_HOSTS)
    }

    private var isInitialized = false

    fun init(context: Context) {
        if (isInitialized) return
        synchronized(this) {
            if (isInitialized) return
            try {
                // Try reading adblock.txt from assets if present
                context.assets.open("adblock.txt").use { inputStream ->
                    BufferedReader(InputStreamReader(inputStream)).use { reader ->
                        var line: String?
                        var count = 0
                        while (reader.readLine().also { line = it } != null) {
                            val cleanLine = line!!.trim()
                            if (cleanLine.isEmpty() || cleanLine.startsWith("#")) continue
                            
                            val parts = cleanLine.split(Regex("\\s+"))
                            val domain = if (parts.size > 1) parts[1] else parts[0]
                            val cleanDomain = domain.lowercase(Locale.ROOT).trim()
                            if (cleanDomain.isNotEmpty()) {
                                adHosts.add(cleanDomain)
                                count++
                            }
                        }
                        Log.d(TAG, "Loaded $count domain rules from adblock.txt")
                    }
                }
            } catch (e: Exception) {
                Log.e(TAG, "Failed to load adblock.txt from assets, using fallback rules", e)
            }
            isInitialized = true
        }
    }

    private fun getFileExtension(url: String): String {
        try {
            val cleanUrl = url.substringBefore('?').substringBefore('#')
            val lastDotIndex = cleanUrl.lastIndexOf('.')
            if (lastDotIndex != -1 && lastDotIndex < cleanUrl.length - 1) {
                val slashIndex = cleanUrl.lastIndexOf('/')
                if (slashIndex < lastDotIndex) {
                    return cleanUrl.substring(lastDotIndex + 1).lowercase(Locale.ROOT)
                }
            }
        } catch (e: Exception) {
            // ignore
        }
        return ""
    }

    fun isAd(url: String, checkStaticResources: Boolean = true): Boolean {
        try {
            val lowerUrl = url.lowercase(Locale.ROOT)
            
            if (checkStaticResources) {
                val ext = getFileExtension(lowerUrl)
                if (ext.isNotEmpty()) {
                    if (BLOCKED_EXTENSIONS.contains(ext)) {
                        return true
                    }
                    if (VIDEO_EXTENSIONS.contains(ext)) {
                        return true
                    }
                }
            }

            val uri = Uri.parse(url)
            val host = uri.host?.lowercase(Locale.ROOT)
            if (host != null) {
                if (adHosts.contains(host)) return true
                if (adHosts.any { host.endsWith(".$it") }) return true
            }

            if (AD_KEYWORD_IN_PATH.any { lowerUrl.contains(it) }) {
                return true
            }

        } catch (e: Exception) {
            // ignore
        }
        return false
    }

    fun createEmptyResource(): WebResourceResponse {
        return WebResourceResponse(
            "text/plain",
            "UTF-8",
            ByteArrayInputStream(ByteArray(0))
        )
    }
}
