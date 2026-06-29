package io.legado.app.vbookextension.ui

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.legado.app.data.appDb
import io.legado.app.help.http.okHttpClient
import io.legado.app.utils.GSON
import io.legado.app.utils.fromJsonArray
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.Request
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.Serializable

data class YckceoSourceItem(
    val id: String = "",
    val name: String = "",
    val url: String = "",
    val version: String = "",
    val tags: String = "",
    val author: String = "",
    val downloads: Int = 0,
    val time: String = ""
) : Serializable

class LegadoStoreViewModel(
    private val appContext: Context
) : ViewModel() {

    companion object {
        private const val TAG = "LegadoStoreVM"
    }

    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()

    private val _error = MutableStateFlow<String?>(null)
    val error = _error.asStateFlow()

    private val _sources = MutableStateFlow<List<YckceoSourceItem>>(emptyList())
    val sources = _sources.asStateFlow()

    private val _searchQuery = MutableStateFlow("")
    val searchQuery = _searchQuery.asStateFlow()

    val installedUrls: StateFlow<Set<String>> = appDb.bookSourceDao.flowAll()
        .map { list -> list.map { it.bookSourceUrl }.toSet() }
        .flowOn(Dispatchers.IO)
        .stateIn(viewModelScope, SharingStarted.Lazily, emptySet())

    val filteredSources: StateFlow<List<YckceoSourceItem>> = combine(_sources, _searchQuery) { list, query ->
        if (query.isBlank()) {
            list
        } else {
            list.filter {
                it.name.contains(query, ignoreCase = true) ||
                it.url.contains(query, ignoreCase = true) ||
                it.author.contains(query, ignoreCase = true) ||
                it.tags.contains(query, ignoreCase = true)
            }
        }
    }.stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    init {
        fetchSources(force = false)
    }

    fun updateSearchQuery(query: String) {
        _searchQuery.value = query
    }

    fun fetchSources(force: Boolean = false) {
        viewModelScope.launch {
            if (!force && _sources.value.isNotEmpty()) return@launch
            _isLoading.value = true
            _error.value = null
            try {
                withContext(Dispatchers.IO) {
                    val url = "https://raw.githubusercontent.com/hongtrantiende/Extransion-TTC/main/yckceo_sources.json?t=${System.currentTimeMillis()}"
                    val builder = Request.Builder().url(url)
                    if (url.contains("/hongtrantiende/")) {
                        builder.header("Authorization", "token ${io.legado.app.constant.AppConst.githubToken}")
                    }
                    val request = builder.build()
                    okHttpClient.newCall(request).execute().use { response ->
                        if (!response.isSuccessful) {
                            throw Exception("Failed to fetch sources: HTTP ${response.code}")
                        }
                        val body = response.body.string()
                        if (body.isNullOrBlank()) {
                            throw Exception("Empty response body")
                        }
                        val list = GSON.fromJsonArray<YckceoSourceItem>(body).getOrThrow()
                        _sources.value = list
                    }
                }
            } catch (e: Exception) {
                Log.e(TAG, "Error fetching online sources", e)
                _error.value = e.localizedMessage ?: e.message ?: "Unknown error"
            } finally {
                _isLoading.value = false
            }
        }
    }
    fun deleteSourceFromGithub(item: YckceoSourceItem, onSuccess: () -> Unit, onFailure: (String) -> Unit) {
        viewModelScope.launch {
            _isLoading.value = true
            _error.value = null
            try {
                withContext(Dispatchers.IO) {
                    val repoUrl = "https://api.github.com/repos/hongtrantiende/Extransion-TTC/contents/yckceo_sources.json"
                    
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
                        
                        // 2. Parse and filter list
                        val list = GSON.fromJsonArray<YckceoSourceItem>(decodedString).getOrThrow().toMutableList()
                        val removed = list.removeAll { it.id == item.id }
                        if (!removed) {
                            throw Exception("Không tìm thấy tiện ích này trong danh sách GitHub")
                        }
                        
                        // 3. Serialize and encode base64
                        val updatedJson = GSON.toJson(list)
                        val updatedBytes = updatedJson.toByteArray(Charsets.UTF_8)
                        val updatedBase64 = android.util.Base64.encodeToString(updatedBytes, android.util.Base64.NO_WRAP)
                        
                        // 4. PUT updated file back to GitHub
                        val putBodyObj = org.json.JSONObject().apply {
                            put("message", "Delete extension via App: ${item.name}")
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
                            // 5. Update local state
                            _sources.value = list
                            withContext(Dispatchers.Main) {
                                onSuccess()
                            }
                        }
                    }
                }
            } catch (e: Exception) {
                Log.e(TAG, "Error deleting source from GitHub", e)
                withContext(Dispatchers.Main) {
                    onFailure(e.localizedMessage ?: e.message ?: "Lỗi chưa xác định")
                }
            } finally {
                _isLoading.value = false
            }
        }
    }
}
