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
}
