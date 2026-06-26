package io.legado.app.ui.browser

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.net.Uri
import android.net.http.SslError
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.webkit.CookieManager
import android.webkit.SslErrorHandler
import android.webkit.URLUtil
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.addCallback
import androidx.activity.viewModels
import androidx.core.view.size
import io.legado.app.R
import io.legado.app.base.VMBaseActivity
import io.legado.app.constant.AppConst
import io.legado.app.databinding.ActivityWebViewBinding
import io.legado.app.help.config.AppConfig
import io.legado.app.help.http.CookieStore
import io.legado.app.help.source.SourceVerificationHelp
import io.legado.app.lib.dialogs.SelectItem
import io.legado.app.lib.dialogs.alert
import io.legado.app.lib.dialogs.selector
//import io.legado.app.lib.theme.accentColor
import io.legado.app.model.Download
import io.legado.app.ui.association.OnLineImportActivity
import io.legado.app.utils.gone
import io.legado.app.utils.invisible
import io.legado.app.utils.keepScreenOn
import io.legado.app.utils.longSnackbar
import io.legado.app.utils.openUrl
import io.legado.app.utils.sendToClip
import io.legado.app.utils.setDarkeningAllowed
import io.legado.app.utils.startActivity
import io.legado.app.utils.toggleSystemBar
import io.legado.app.utils.viewbindingdelegate.viewBinding
import io.legado.app.utils.visible
import java.net.URLDecoder
import io.legado.app.help.http.CookieManager as AppCookieManager
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class WebViewActivity : VMBaseActivity<ActivityWebViewBinding, WebViewModel>() {

    override val binding by viewBinding(ActivityWebViewBinding::inflate)
    override val viewModel by viewModels<WebViewModel>()
    private var customWebViewCallback: WebChromeClient.CustomViewCallback? = null
    private var webPic: String? = null
    private var isCloudflareChallenge = false
    private var isFullScreen = false
    private var extensionEntity: io.legado.app.vbookextension.data.entity.ExtensionEntity? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.titleBar.title = intent.getStringExtra("title") ?: getString(R.string.loading)
        binding.titleBar.subtitle = intent.getStringExtra("sourceName")
        viewModel.initData(intent) {
            val url = viewModel.baseUrl
            val headerMap = viewModel.headerMap
            initWebView(url, headerMap)
            val html = viewModel.html
            if (html.isNullOrEmpty()) {
                binding.webView.loadUrl(url, headerMap)
            } else {
                binding.webView.loadDataWithBaseURL(url, html, "text/html", "utf-8", url)
            }
            if (viewModel.sourceOrigin.startsWith("ext_")) {
                val extId = viewModel.sourceOrigin.substringAfter("ext_")
                lifecycleScope.launch(Dispatchers.IO) {
                    try {
                        extensionEntity = io.legado.app.data.appDb.extensionDao.getExtensionById(extId)
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
            }
        }
        onBackPressedDispatcher.addCallback(this) {
            if (binding.customWebView.size > 0) {
                customWebViewCallback?.onCustomViewHidden()
                return@addCallback
            } else if (binding.webView.canGoBack()
                && binding.webView.copyBackForwardList().size > 1
            ) {
                binding.webView.goBack()
                return@addCallback
            }
            if (isFullScreen) {
                toggleFullScreen()
                return@addCallback
            }
            finish()
        }
    }

    override fun onCompatCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.web_view, menu)
        return super.onCompatCreateOptionsMenu(menu)
    }

    override fun onPrepareOptionsMenu(menu: Menu): Boolean {
        if (viewModel.sourceOrigin.isNotEmpty()) {
            menu.findItem(R.id.menu_disable_source)?.isVisible = true
            menu.findItem(R.id.menu_delete_source)?.isVisible = true
        }
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onCompatOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_open_in_browser -> openUrl(viewModel.baseUrl)
            R.id.menu_copy_url -> sendToClip(viewModel.baseUrl)
            R.id.menu_ok -> {
                saveExtensionCookiesAndLocalStorage {
                    saveStandardCookies()
                    if (viewModel.sourceVerificationEnable) {
                        viewModel.saveVerificationResult(binding.webView) {
                            finish()
                        }
                    } else {
                        finish()
                    }
                }
            }

            R.id.menu_full_screen -> toggleFullScreen()
            R.id.menu_disable_source -> {
                viewModel.disableSource {
                    finish()
                }
            }

            R.id.menu_delete_source -> {
                alert(R.string.draw) {
                    setMessage(getString(R.string.sure_del) + "\n" + viewModel.sourceName)
                    noButton()
                    yesButton {
                        viewModel.deleteSource {
                            finish()
                        }
                    }
                }
            }
        }
        return super.onCompatOptionsItemSelected(item)
    }

    //实现starBrowser调起页面全屏
    private fun toggleFullScreen() {
        isFullScreen = !isFullScreen

        toggleSystemBar(!isFullScreen)

        if (isFullScreen) {
            supportActionBar?.hide()
        } else {
            supportActionBar?.show()
        }
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun initWebView(url: String, headerMap: HashMap<String, String>) {
        //binding.progressBar.fontColor = accentColor
        binding.webView.webChromeClient = CustomWebChromeClient()
        binding.webView.webViewClient = CustomWebViewClient()
        binding.webView.settings.apply {
            setDarkeningAllowed(AppConfig.isNightTheme)
            mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
            domStorageEnabled = true
            allowContentAccess = true
            useWideViewPort = true
            loadWithOverviewMode = true
            javaScriptEnabled = true
            builtInZoomControls = true
            displayZoomControls = false
            headerMap[AppConst.UA_NAME]?.let {
                userAgentString = it
            }
        }
        AppCookieManager.applyToWebView(url)
        if (viewModel.sourceOrigin.startsWith("ext_")) {
            val extId = viewModel.sourceOrigin.substringAfter("ext_")
            val prefs = getSharedPreferences("novel_reader_prefs", MODE_PRIVATE)
            val cookie = prefs.getString("ext_cookies_$extId", "") ?: ""
            if (cookie.isNotBlank()) {
                val cookieManager = CookieManager.getInstance()
                val uri = Uri.parse(url)
                val domain = uri.host ?: ""
                cookie.split(";").forEach { pair ->
                    cookieManager.setCookie(domain, pair.trim())
                }
                cookieManager.flush()
            }
        }
        binding.webView.setOnLongClickListener {
            val hitTestResult = binding.webView.hitTestResult
            if (hitTestResult.type == WebView.HitTestResult.IMAGE_TYPE ||
                hitTestResult.type == WebView.HitTestResult.SRC_IMAGE_ANCHOR_TYPE
            ) {
                hitTestResult.extra?.let { webPic ->
                    selector(
                        arrayListOf(
                            SelectItem(getString(R.string.action_save), "save"),
                        )
                    ) { _, charSequence, _ ->
                        when (charSequence.value) {
                            "save" -> saveImage(webPic)
                        }
                    }
                    return@setOnLongClickListener false
                }
            }
            return@setOnLongClickListener false
        }
        binding.webView.setDownloadListener { downloadUrl, _, contentDisposition, _, _ ->
            var fileName = URLUtil.guessFileName(downloadUrl, contentDisposition, null)
            fileName = URLDecoder.decode(fileName, "UTF-8")
            binding.llView.longSnackbar(fileName, getString(R.string.action_download)) {
                Download.start(this, downloadUrl, fileName)
            }
        }
    }

    private fun saveImage(webPic: String) {
        this.webPic = webPic
        viewModel.saveImage(webPic)
    }

    override fun finish() {
        saveExtensionCookies()
        saveStandardCookies()
        SourceVerificationHelp.checkResult(viewModel.sourceOrigin)
        super.finish()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding.webView.destroy()
    }

    inner class CustomWebChromeClient : WebChromeClient() {

        override fun onProgressChanged(view: WebView?, newProgress: Int) {
            super.onProgressChanged(view, newProgress)
            binding.progressBar.setProgress(newProgress)
            binding.progressBar.gone(newProgress == 100)
        }

        override fun onShowCustomView(view: View?, callback: CustomViewCallback?) {
            requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR
            binding.llView.invisible()
            binding.customWebView.addView(view)
            customWebViewCallback = callback
            keepScreenOn(true)
            toggleSystemBar(false)
        }

        override fun onHideCustomView() {
            binding.customWebView.removeAllViews()
            binding.llView.visible()
            requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED
            keepScreenOn(false)
            toggleSystemBar(true)
        }
    }

    inner class CustomWebViewClient : WebViewClient() {
        override fun shouldOverrideUrlLoading(
            view: WebView?,
            request: WebResourceRequest?
        ): Boolean {
            request?.let {
                return shouldOverrideUrlLoading(it.url)
            }
            return true
        }

        @Suppress("DEPRECATION", "OVERRIDE_DEPRECATION", "KotlinRedundantDiagnosticSuppress")
        override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
            url?.let {
                return shouldOverrideUrlLoading(Uri.parse(it))
            }
            return true
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            val cookieManager = CookieManager.getInstance()
            url?.let {
                val cookie = cookieManager.getCookie(it)
                CookieStore.setCookie(it, cookie)
                if (viewModel.sourceOrigin.startsWith("ext_")) {
                    val extId = viewModel.sourceOrigin.substringAfter("ext_")
                    val prefs = getSharedPreferences("novel_reader_prefs", MODE_PRIVATE)
                    val oldCookie = prefs.getString("ext_cookies_$extId", null)
                    val mergedCookie = mergeCookies(oldCookie, cookie ?: "")
                    prefs.edit().putString("ext_cookies_$extId", mergedCookie).apply()

                }
            }
            view?.title?.let { title ->
                if (title != url && title != view.url && title.isNotBlank()) {
                    binding.titleBar.title = title
                } else {
                    binding.titleBar.title = intent.getStringExtra("title")
                }
                view.evaluateJavascript("!!window._cf_chl_opt") {
                    if (it == "true") {
                        isCloudflareChallenge = true
                    } else if (isCloudflareChallenge && viewModel.sourceVerificationEnable) {
                        viewModel.saveVerificationResult(binding.webView) {
                            finish()
                        }
                    }
                }
            }
        }

        private fun shouldOverrideUrlLoading(url: Uri): Boolean {
            when (url.scheme) {
                "http", "https" -> {
                    return false
                }

                "legado", "yuedu" -> {
                    startActivity<OnLineImportActivity> {
                        data = url
                    }
                    return true
                }

                else -> {
                    binding.root.longSnackbar(R.string.jump_to_another_app, R.string.confirm) {
                        openUrl(url)
                    }
                    return true
                }
            }
        }

        @SuppressLint("WebViewClientOnReceivedSslError")
        override fun onReceivedSslError(
            view: WebView?,
            handler: SslErrorHandler?,
            error: SslError?
        ) {
            handler?.proceed()
        }

    }

    private fun saveExtensionCookies() {
        if (viewModel.sourceOrigin.startsWith("ext_")) {
            val extId = viewModel.sourceOrigin.substringAfter("ext_")
            try {
                val currentUrl = binding.webView.url ?: viewModel.baseUrl
                val extBaseUrl = extensionEntity?.source?.let { src ->
                    val secure = if (src.startsWith("http://")) src.replaceFirst("http://", "https://") else src
                    val host = try { java.net.URI(secure).host } catch (_: Exception) { null }
                    if (host != null) "https://$host" else secure
                }
                
                CookieManager.getInstance().flush()
                val cookieStr = getCookiesForExtension(
                    CookieManager.getInstance(),
                    currentUrl,
                    extBaseUrl
                )
                val prefs = getSharedPreferences("novel_reader_prefs", MODE_PRIVATE)
                val oldCookie = prefs.getString("ext_cookies_$extId", null)
                val mergedCookie = mergeCookies(oldCookie, cookieStr)
                
                if (mergedCookie.isNotBlank()) {
                    val userAgentStr = binding.webView.settings.userAgentString
                    val editor = prefs.edit().putString("ext_cookies_$extId", mergedCookie)
                    if (!userAgentStr.isNullOrBlank()) {
                        editor.putString("ext_user_agent_$extId", userAgentStr)
                    }
                    editor.apply()
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    private fun saveStandardCookies() {
        if (!viewModel.sourceOrigin.startsWith("ext_") && viewModel.sourceOrigin.isNotEmpty()) {
            try {
                val currentUrl = binding.webView.url ?: viewModel.baseUrl
                CookieManager.getInstance().flush()
                val cookieStr = CookieManager.getInstance().getCookie(currentUrl)
                if (!cookieStr.isNullOrBlank()) {
                    CookieStore.setCookie(currentUrl, cookieStr)
                }
                if (viewModel.baseUrl != currentUrl) {
                    val baseCookieStr = CookieManager.getInstance().getCookie(viewModel.baseUrl)
                    if (!baseCookieStr.isNullOrBlank()) {
                        CookieStore.setCookie(viewModel.baseUrl, baseCookieStr)
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    private fun getCookiesForExtension(
        cookieManager: CookieManager,
        currentUrl: String,
        extBaseUrl: String?
    ): String {
        val cookies = mutableListOf<String>()

        val currentBaseUrl = try {
            val secure = if (currentUrl.startsWith("http://")) {
                currentUrl.replaceFirst("http://", "https://")
            } else {
                currentUrl
            }
            val host = java.net.URI(secure).host
            if (host != null) "https://$host" else secure
        } catch (e: Exception) {
            currentUrl
        }

        val currentCookies = cookieManager.getCookie(currentBaseUrl)
        if (!currentCookies.isNullOrBlank()) {
            cookies.add(currentCookies)
        }

        if (extBaseUrl != null && extBaseUrl != currentBaseUrl) {
            val extCookies = cookieManager.getCookie(extBaseUrl)
            if (!extCookies.isNullOrBlank()) {
                cookies.add(extCookies)
            }
        }

        var merged = ""
        cookies.forEach { c ->
            merged = mergeCookies(merged, c)
        }
        return merged
    }

    private fun mergeCookies(oldCookie: String?, newCookie: String?): String {
        val cookieMap = mutableMapOf<String, String>()
        if (!oldCookie.isNullOrBlank()) {
            oldCookie.split(";").forEach { part ->
                val pair = part.trim().split("=", limit = 2)
                if (pair.size == 2) {
                    cookieMap[pair[0].trim()] = pair[1].trim()
                }
            }
        }
        if (!newCookie.isNullOrBlank()) {
            newCookie.split(";").forEach { part ->
                val pair = part.trim().split("=", limit = 2)
                if (pair.size == 2) {
                    cookieMap[pair[0].trim()] = pair[1].trim()
                }
            }
        }
        return cookieMap.map { "${it.key}=${it.value}" }.joinToString("; ")
    }

    private fun saveExtensionCookiesAndLocalStorage(onComplete: () -> Unit) {
        if (viewModel.sourceOrigin.startsWith("ext_")) {
            val extId = viewModel.sourceOrigin.substringAfter("ext_")
            val currentUrl = binding.webView.url ?: viewModel.baseUrl
            val extBaseUrl = extensionEntity?.source?.let { src ->
                val secure = if (src.startsWith("http://")) src.replaceFirst("http://", "https://") else src
                val host = try { java.net.URI(secure).host } catch (_: Exception) { null }
                if (host != null) "https://$host" else secure
            }

            try {
                CookieManager.getInstance().flush()
                val cookieStr = getCookiesForExtension(
                    CookieManager.getInstance(),
                    currentUrl,
                    extBaseUrl
                )
                val prefs = getSharedPreferences("novel_reader_prefs", MODE_PRIVATE)
                val oldCookie = prefs.getString("ext_cookies_$extId", null)
                val mergedCookie = mergeCookies(oldCookie, cookieStr)
                
                if (mergedCookie.isNotBlank()) {
                    val userAgentStr = binding.webView.settings.userAgentString
                    val editor = prefs.edit().putString("ext_cookies_$extId", mergedCookie)
                    if (!userAgentStr.isNullOrBlank()) {
                        editor.putString("ext_user_agent_$extId", userAgentStr)
                    }
                    editor.apply()
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
            onComplete()
        } else {
            onComplete()
        }
    }

    private fun unescapeJsonString(jsonStr: String): String {
        if (jsonStr == "null" || jsonStr == "undefined") return ""
        if (jsonStr.length < 2 || !jsonStr.startsWith("\"") || !jsonStr.endsWith("\"")) return jsonStr
        
        val sb = java.lang.StringBuilder(jsonStr.length - 2)
        var i = 1
        val len = jsonStr.length - 1
        while (i < len) {
            val c = jsonStr[i]
            if (c == '\\') {
                i++
                if (i >= len) break
                val next = jsonStr[i]
                when (next) {
                    '\"' -> sb.append('\"')
                    '\\' -> sb.append('\\')
                    '/' -> sb.append('/')
                    'b' -> sb.append('\b')
                    'f' -> sb.append('\u000C')
                    'n' -> sb.append('\n')
                    'r' -> sb.append('\r')
                    't' -> sb.append('\t')
                    'u' -> {
                        if (i + 4 < len) {
                            val hex = jsonStr.substring(i + 1, i + 5)
                            try {
                                sb.append(hex.toInt(16).toChar())
                            } catch (e: Exception) {
                                sb.append("\\u").append(hex)
                            }
                            i += 4
                        } else {
                            sb.append("\\u")
                        }
                    }
                    else -> sb.append('\\').append(next)
                }
            } else {
                sb.append(c)
            }
            i++
        }
        return sb.toString()
    }

}