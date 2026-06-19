package io.legado.app.vbookextension.runtime

import android.content.Context
import android.util.Log
import io.legado.app.vbookextension.model.ExtensionResult
import io.legado.app.vbookextension.model.LoadedExtension
import io.legado.app.vbookextension.model.ScriptType
import io.legado.app.vbookextension.runtime.api.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import org.mozilla.javascript.Context as RhinoContext
import org.mozilla.javascript.Script
import org.mozilla.javascript.ScriptableObject
import java.util.concurrent.ConcurrentHashMap

class VBookJsExtensionRunner(
    private val appContext: Context,
    private val httpClient: OkHttpClient,
) {
    companion object {
        private const val TAG = "ExtRunner"
        private const val SECURE_WORKER_URL = "https://winter-leaf-92bf.vipg.workers.dev"
        private const val VITE_KEY_BI_MAT = "namdepgai"
    }

    private val compiledScripts = ConcurrentHashMap<String, Script>()
    private var cachedKeyBiMat: String? = null

    private fun fetchSecureKeyFromCloudflare(): String {
        cachedKeyBiMat?.let { return it }
        val prefs = appContext.getSharedPreferences("novel_reader_prefs", Context.MODE_PRIVATE)
        val workerUrl = prefs.getString("secure_worker_url", SECURE_WORKER_URL) ?: SECURE_WORKER_URL
        try {
            val request = okhttp3.Request.Builder()
                .url(workerUrl)
                .addHeader("x-app-token", "mat_khau_bao_mat_ttc_999")
                .build()
            httpClient.newCall(request).execute().use { response ->
                if (response.isSuccessful) {
                    val body = response.body?.string()
                    if (!body.isNullOrBlank()) {
                        val json = org.json.JSONObject(body)
                        val key = json.optString("key_bi_mat", "namdepgai")
                        cachedKeyBiMat = key
                        Log.d(TAG, "Successfully fetched secure key from Cloudflare: $key")
                        return key
                    }
                }
            }
        } catch (e: Exception) {
            Log.e(TAG, "Failed to fetch secure key from Cloudflare: ${e.message}")
        }
        return VITE_KEY_BI_MAT
    }

    fun clearCache(extensionId: String) {
        val keysToRemove = compiledScripts.keys().asSequence().filter { it.startsWith("${extensionId}_") }.toList()
        keysToRemove.forEach { compiledScripts.remove(it) }
        Log.d(TAG, "Cleared compiled scripts cache for extension: $extensionId")
    }

    suspend fun execute(
        extension: LoadedExtension,
        scriptType: ScriptType,
        vararg args: String,
        logCollector: MutableList<String>? = null
    ): ExtensionResult {
        val scriptFileName = extension.pluginJson.script[scriptType.key]
            ?: return ExtensionResult.Error(
                "Script type '${scriptType.key}' not found in plugin.json"
            )
        return execute(extension, scriptFileName, *args, logCollector = logCollector)
    }

    suspend fun execute(
        extension: LoadedExtension,
        scriptFileName: String,
        vararg args: String,
        logCollector: MutableList<String>? = null
    ): ExtensionResult = withContext(Dispatchers.IO) {
        Log.d(TAG, "execute scriptFileName: $scriptFileName with args: ${args.toList()}")
        val rhinoCtx = RhinoContext.enter()
        if (rhinoCtx is com.script.rhino.RhinoContext) {
            rhinoCtx.allowScriptRun = true
        }
        var bridge: JSBridge? = null
        try {
            rhinoCtx.optimizationLevel = -1
            rhinoCtx.languageVersion = RhinoContext.VERSION_ES6
            rhinoCtx.wrapFactory.isJavaPrimitiveWrap = false

            val scope = rhinoCtx.initStandardObjects()

            val coreScript = compiledScripts.getOrPut("core.js") {
                val coreJs = appContext.assets.open("core.js").bufferedReader().use { it.readText() }
                rhinoCtx.compileString(coreJs, "core.js", 1, null)
            }
            coreScript.exec(rhinoCtx, scope)

            var resolvedConfigUrl: String? = null

            val prefs = appContext.getSharedPreferences("novel_reader_prefs", Context.MODE_PRIVATE)
            val customConfigUrl = prefs.getString("ext_config_${extension.id}_CONFIG_URL", null)
            if (!customConfigUrl.isNullOrBlank()) {
                resolvedConfigUrl = customConfigUrl.trim().trimEnd('/')
            }

            if (resolvedConfigUrl == null) {
                val firstArg = args.firstOrNull()
                if (firstArg != null && (firstArg.startsWith("http://") || firstArg.startsWith("https://"))) {
                    try {
                        val uri = java.net.URI(firstArg)
                        resolvedConfigUrl = "${uri.scheme}://${uri.host}"
                    } catch (e: Exception) {
                        // ignore
                    }
                }
            }

            if (resolvedConfigUrl == null) {
                val defaultSource = extension.pluginJson.metadata.source
                if (!defaultSource.isNullOrBlank()) {
                    try {
                        val uri = java.net.URI(defaultSource)
                        resolvedConfigUrl = "${uri.scheme}://${uri.host}"
                    } catch (e: Exception) {
                        resolvedConfigUrl = defaultSource.trim().trimEnd('/')
                    }
                }
            }

            if (resolvedConfigUrl != null) {
                var configUrlToInject = resolvedConfigUrl
                if (extension.id.contains("khotruyenchu") || extension.id.contains("kho-truyen-chu")) {
                    configUrlToInject = configUrlToInject.replace(Regex("^https?://"), "").trimEnd('/')
                }
                ScriptableObject.putProperty(scope, "CONFIG_URL", configUrlToInject)
                Log.d(TAG, "Injected CONFIG_URL: $configUrlToInject for extension ${extension.id}")
            }

            val viteObject = rhinoCtx.newObject(scope)
            val secureKey = fetchSecureKeyFromCloudflare()
            ScriptableObject.putProperty(viteObject, "key_bi_mat", secureKey)
            ScriptableObject.putProperty(scope, "vite", viteObject)
            Log.d(TAG, "Injected secure vite object for extension ${extension.id}")

            bridge = JSBridge(rhinoCtx, scope, httpClient, extension.id, appContext, extension, logCollector)
            val bridgeJs = RhinoContext.javaToJS(bridge, scope)
            ScriptableObject.putProperty(scope, "JSBridge", bridgeJs)

            val loadFn = object : org.mozilla.javascript.BaseFunction() {
                override fun call(cx: RhinoContext, s: org.mozilla.javascript.Scriptable, t: org.mozilla.javascript.Scriptable, loadArgs: Array<out Any?>): Any {
                    val fileName = RhinoContext.toString(loadArgs.getOrNull(0) ?: "")
                    if (fileName.isBlank()) return org.mozilla.javascript.Undefined.instance
                    
                    val backupExecute = s.get("execute", s)
                    
                    val cacheKey = "${extension.id}_$fileName"
                    val subScript = compiledScripts.getOrPut(cacheKey) {
                        val content = extension.getScriptContent(fileName)
                        cx.compileString(content, fileName, 1, null)
                    }
                    subScript.exec(cx, s)
                    
                    if (backupExecute != org.mozilla.javascript.Scriptable.NOT_FOUND && backupExecute != null) {
                        s.put("execute", s, backupExecute)
                    }
                    
                    return org.mozilla.javascript.Undefined.instance
                }
            }
            ScriptableObject.putProperty(scope, "load", loadFn)

            JSFetchFunction.inject(rhinoCtx, scope, httpClient, extension.id, extension.pluginJson.metadata.name, appContext)

            val extCacheKey = "${extension.id}_$scriptFileName"
            val extScript = compiledScripts.getOrPut(extCacheKey) {
                val scriptContent = extension.getScriptContent(scriptFileName)
                rhinoCtx.compileString(scriptContent, scriptFileName, 1, null)
            }
            extScript.exec(rhinoCtx, scope)

            val executeCall = buildExecuteCall(args)
            val wrappedCall = """
                (function() {
                    try {
                        var __result = $executeCall;
                        if (__result === null || __result === undefined) {
                            return Response.error("Extension trả về kết quả rỗng");
                        }
                        return __result;
                    } catch(__e) {
                        return Response.error("Lỗi JS: " + __e.message);
                    }
                })()
            """.trimIndent()
            val evalResult = rhinoCtx.evaluateString(scope, wrappedCall, "invoke", 1, null)

            if (evalResult == null || evalResult == org.mozilla.javascript.Undefined.instance) {
                Log.w(TAG, "execute scriptFileName: $scriptFileName returned undefined or null")
                ExtensionResult.Success("{\"code\":1,\"data\":\"Extension không trả kết quả\"}")
            } else {
                val resStr = RhinoContext.toString(evalResult)
                Log.d(TAG, "execute scriptFileName: $scriptFileName success, data length: ${resStr.length}")
                ExtensionResult.Success(resStr)
            }

        } catch (e: Throwable) {
            Log.e(TAG, "Extension execution failed: ${e.message}", e)
            ExtensionResult.Error(e.message ?: "Unknown JS execution error")
        } finally {
            bridge?.release()
            if (rhinoCtx is com.script.rhino.RhinoContext) {
                rhinoCtx.allowScriptRun = false
            }
            RhinoContext.exit()
        }
    }

    private fun buildExecuteCall(args: Array<out String>): String {
        if (args.isEmpty()) return "execute()"
        val escapedArgs = args.joinToString(",") { "\"${escapeJs(it)}\"" }
        return "execute($escapedArgs)"
    }

    private fun escapeJs(s: String): String = s
        .replace("\\", "\\\\")
        .replace("\"", "\\\"")
        .replace("\n", "\\n")
        .replace("\r", "\\r")
        .replace("\t", "\\t")
}
