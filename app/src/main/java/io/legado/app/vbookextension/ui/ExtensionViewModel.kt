package io.legado.app.vbookextension.ui

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.legado.app.vbookextension.data.dao.ExtensionDao
import io.legado.app.vbookextension.data.dao.RepositoryDao
import io.legado.app.vbookextension.data.entity.ExtensionEntity
import io.legado.app.vbookextension.data.entity.RepositoryEntity
import io.legado.app.vbookextension.loader.ExtensionLoader
import io.legado.app.vbookextension.model.ExtensionInfo
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.Request
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.toRequestBody
import io.legado.app.help.http.okHttpClient

class ExtensionViewModel(
    private val appContext: Context,
    val extensionLoader: ExtensionLoader,
    private val extensionDao: ExtensionDao,
    private val repositoryDao: RepositoryDao,
) : ViewModel() {

    companion object {
        private const val TAG = "ExtVM"
    }

    // Selected extension details state
    private val _selectedCookie = MutableStateFlow("")
    val selectedCookie = _selectedCookie.asStateFlow()

    private val _selectedLocalStorage = MutableStateFlow<Map<String, String>>(emptyMap())
    val selectedLocalStorage = _selectedLocalStorage.asStateFlow()

    private val _selectedParallelConnections = MutableStateFlow(3)
    val selectedParallelConnections = _selectedParallelConnections.asStateFlow()

    private val _selectedConnectionInterval = MutableStateFlow(0)
    val selectedConnectionInterval = _selectedConnectionInterval.asStateFlow()

    private val _selectedIsPinned = MutableStateFlow(false)
    val selectedIsPinned = _selectedIsPinned.asStateFlow()

    fun loadExtensionDetails(extensionId: String) {
        val prefs = appContext.getSharedPreferences("novel_reader_prefs", Context.MODE_PRIVATE)
        _selectedCookie.value = prefs.getString("ext_cookies_$extensionId", "") ?: ""
        _selectedParallelConnections.value = prefs.getInt("ext_parallel_connections_$extensionId", 3)
        _selectedConnectionInterval.value = prefs.getInt("ext_connection_interval_$extensionId", 33)
        _selectedIsPinned.value = prefs.getBoolean("ext_pinned_$extensionId", false)

        val storagePrefs = appContext.getSharedPreferences("ext_storage_$extensionId", Context.MODE_PRIVATE)
        val result = mutableMapOf<String, String>()
        storagePrefs.all.forEach { (k, v) ->
            result[k] = v?.toString() ?: ""
        }
        _selectedLocalStorage.value = result
    }

    fun updateCookie(extensionId: String, cookie: String) {
        val prefs = appContext.getSharedPreferences("novel_reader_prefs", Context.MODE_PRIVATE)
        prefs.edit().putString("ext_cookies_$extensionId", cookie).apply()
        _selectedCookie.value = cookie
    }

    fun addLocalStorageItem(extensionId: String, key: String, value: String) {
        val prefs = appContext.getSharedPreferences("ext_storage_$extensionId", Context.MODE_PRIVATE)
        prefs.edit().putString(key, value).apply()
        loadExtensionDetails(extensionId)
    }

    fun removeLocalStorageItem(extensionId: String, key: String) {
        val prefs = appContext.getSharedPreferences("ext_storage_$extensionId", Context.MODE_PRIVATE)
        prefs.edit().remove(key).apply()
        loadExtensionDetails(extensionId)
    }

    fun updateParallelConnections(extensionId: String, count: Int) {
        val prefs = appContext.getSharedPreferences("novel_reader_prefs", Context.MODE_PRIVATE)
        prefs.edit().putInt("ext_parallel_connections_$extensionId", count).apply()
        _selectedParallelConnections.value = count
    }

    fun updateConnectionInterval(extensionId: String, intervalMs: Int) {
        val prefs = appContext.getSharedPreferences("novel_reader_prefs", Context.MODE_PRIVATE)
        prefs.edit().putInt("ext_connection_interval_$extensionId", intervalMs).apply()
        _selectedConnectionInterval.value = intervalMs
    }

    fun togglePinnedState(extensionId: String) {
        val prefs = appContext.getSharedPreferences("novel_reader_prefs", Context.MODE_PRIVATE)
        val current = prefs.getBoolean("ext_pinned_$extensionId", false)
        prefs.edit().putBoolean("ext_pinned_$extensionId", !current).apply()
        _selectedIsPinned.value = !current
    }

    val installedExtensions: Flow<List<ExtensionEntity>> = extensionDao.getInstalledExtensions()
    val repositories: Flow<List<RepositoryEntity>> = repositoryDao.getRepositories()

    private val _availableExtensions = MutableStateFlow<List<ExtensionInfo>>(emptyList())
    val availableExtensions: StateFlow<List<ExtensionInfo>> = _availableExtensions.asStateFlow()

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading.asStateFlow()

    private val _installingIds = MutableStateFlow<Set<String>>(emptySet())
    val installingIds: StateFlow<Set<String>> = _installingIds.asStateFlow()

    private val _error = MutableStateFlow<String?>(null)
    val error: StateFlow<String?> = _error.asStateFlow()

    init {
        viewModelScope.launch {
            extensionLoader.ensureDefaultRepository()
            extensionLoader.autoFixExtensionTypes()
            fetchAllExtensions(force = false)
        }
    }

    fun fetchAllExtensions(force: Boolean = false) {
        viewModelScope.launch {
            if (!force && ExtensionCache.availableExtensions != null && ExtensionCache.availableExtensions!!.isNotEmpty()) {
                _availableExtensions.value = ExtensionCache.availableExtensions!!
                return@launch
            }
            _isLoading.value = true
            _error.value = null
            try {
                val allExts = mutableListOf<ExtensionInfo>()
                
                // 1. Fetch built-in
                val builtIn = extensionLoader.fetchBuiltInExtensions()
                allExts.addAll(builtIn)
                
                // 2. Fetch enabled repos
                val repos = repositoryDao.getEnabledRepositories()
                for (repo in repos) {
                    if (repo.url != "file:///android_asset/plugin.json") {
                        try {
                            val repoExts = extensionLoader.fetchRepository(repo.url)
                            allExts.addAll(repoExts)
                        } catch (e: Exception) {
                            Log.e(TAG, "Failed to fetch repo: ${repo.url}", e)
                        }
                    }
                }
                
                // 3. De-duplicate by slug and version
                val distinctExts = allExts.groupBy { it.name.toSlug() }.map { (_, list) ->
                    list.maxByOrNull { it.version } ?: list.first()
                }
                
                ExtensionCache.availableExtensions = distinctExts
                _availableExtensions.value = distinctExts
            } catch (e: Exception) {
                _error.value = e.message
            } finally {
                _isLoading.value = false
            }
        }
    }

    fun installExtension(info: ExtensionInfo) {
        viewModelScope.launch {
            val slug = info.name.toSlug()
            _installingIds.update { it + slug }
            try {
                extensionLoader.installExtension(info)
            } catch (e: Exception) {
                Log.e(TAG, "Failed to install extension: ${info.name}", e)
            } finally {
                _installingIds.update { it - slug }
            }
        }
    }

    fun uninstallExtension(extensionId: String) {
        viewModelScope.launch {
            extensionLoader.uninstallExtension(extensionId)
        }
    }

    fun toggleExtensionEnabled(extensionId: String, enabled: Boolean) {
        viewModelScope.launch {
            extensionDao.setEnabled(extensionId, enabled)
        }
    }

    fun addRepository(url: String, name: String = "") {
        viewModelScope.launch {
            val finalUrl = if (url.trim().removeSuffix("/") == "https://www.vbookext.me") {
                ExtensionLoader.DEFAULT_REPO_URL
            } else {
                url.trim()
            }

            val repoName = name.ifBlank {
                if (finalUrl == ExtensionLoader.DEFAULT_REPO_URL) {
                    "Thư viện Tiện ích (GitHub)"
                } else {
                    finalUrl.substringAfterLast("/").substringBefore(".")
                        .ifBlank { "Repository" }
                }
            }
            repositoryDao.insert(
                RepositoryEntity(
                    url = finalUrl,
                    name = repoName,
                    addedAt = System.currentTimeMillis(),
                    isEnabled = true
                )
            )
            fetchAllExtensions(force = true)
        }
    }

    fun removeRepository(repo: RepositoryEntity) {
        viewModelScope.launch {
            repositoryDao.delete(repo)
            fetchAllExtensions(force = true)
        }
    }

    private fun String.toSlug(): String {
        val normalized = java.text.Normalizer.normalize(this, java.text.Normalizer.Form.NFD)
            .replace(Regex("[\\p{InCombiningDiacriticalMarks}]"), "")
        return normalized
            .lowercase()
            .replace("đ", "d").replace("Đ", "d")
            .replace(Regex("[^a-z0-9]"), "-")
            .replace(Regex("-+"), "-")
            .trim('-')
    }
    fun deleteExtensionFromGithub(info: ExtensionInfo, onSuccess: () -> Unit, onFailure: (String) -> Unit) {
        viewModelScope.launch {
            _isLoading.value = true
            _error.value = null
            try {
                withContext(Dispatchers.IO) {
                    val repoUrl = "https://api.github.com/repos/hongtrantiende/Extransion-TTC/contents/plugin.json"
                    
                    // 1. Fetch current content and SHA
                    val getRequest = Request.Builder()
                        .url(repoUrl)
                        .header("Authorization", "token ${io.legado.app.constant.AppConst.githubToken}")
                        .header("Accept", "application/vnd.github+json")
                        .get()
                        .build()
                        
                    okHttpClient.newCall(getRequest).execute().use { response ->
                        if (!response.isSuccessful) {
                            throw Exception("Failed to fetch GitHub metadata: HTTP ${response.code}")
                        }
                        val body = response.body.string() ?: throw Exception("Empty metadata response")
                        val jsonObj = org.json.JSONObject(body)
                        val sha = jsonObj.getString("sha")
                        val base64Content = jsonObj.getString("content").replace("\n", "").replace("\r", "")
                        val decodedBytes = android.util.Base64.decode(base64Content, android.util.Base64.DEFAULT)
                        val decodedString = String(decodedBytes, Charsets.UTF_8)
                        
                        // 2. Parse as dynamic JSON array inside the data object to safely filter
                        val rootObj = org.json.JSONObject(decodedString)
                        val jsonArray = rootObj.getJSONArray("data")
                        val newList = org.json.JSONArray()
                        var found = false
                        for (i in 0 until jsonArray.length()) {
                            val obj = jsonArray.getJSONObject(i)
                            val name = obj.optString("name", "")
                            if (name.equals(info.name, ignoreCase = true)) {
                                found = true
                            } else {
                                newList.put(obj)
                            }
                        }
                        
                        if (!found) {
                            throw Exception("Không tìm thấy tiện ích này trong danh sách GitHub")
                        }
                        
                        rootObj.put("data", newList)
                        
                        // 3. Serialize and encode base64
                        val updatedJson = rootObj.toString(2)
                        val updatedBytes = updatedJson.toByteArray(Charsets.UTF_8)
                        val updatedBase64 = android.util.Base64.encodeToString(updatedBytes, android.util.Base64.NO_WRAP)
                        
                        // 4. PUT updated file back to GitHub
                        val putBodyObj = org.json.JSONObject().apply {
                            put("message", "Delete extension via App: ${info.name}")
                            put("content", updatedBase64)
                            put("sha", sha)
                        }
                        val mediaType = "application/json; charset=utf-8".toMediaType()
                        val putRequestBody = putBodyObj.toString().toRequestBody(mediaType)
                        
                        val putRequest = Request.Builder()
                            .url(repoUrl)
                            .header("Authorization", "token ${io.legado.app.constant.AppConst.githubToken}")
                            .header("Accept", "application/vnd.github+json")
                            .put(putRequestBody)
                            .build()
                            
                        okHttpClient.newCall(putRequest).execute().use { putResponse ->
                            if (!putResponse.isSuccessful) {
                                throw Exception("GitHub Update Failed: HTTP ${putResponse.code}")
                            }
                            // 5. Reload data
                            fetchAllExtensions(force = true)
                            withContext(Dispatchers.Main) {
                                onSuccess()
                            }
                        }
                    }
                }
            } catch (e: Exception) {
                Log.e(TAG, "Error deleting extension from GitHub", e)
                withContext(Dispatchers.Main) {
                    onFailure(e.localizedMessage ?: e.message ?: "Lỗi chưa xác định")
                }
            } finally {
                _isLoading.value = false
            }
        }
    }
}
