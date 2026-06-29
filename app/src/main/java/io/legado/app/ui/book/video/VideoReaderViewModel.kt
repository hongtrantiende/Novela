package io.legado.app.ui.book.video

import android.app.Application
import android.util.Log
import androidx.lifecycle.viewModelScope
import io.legado.app.base.BaseViewModel
import io.legado.app.data.appDb
import io.legado.app.data.entities.Book
import io.legado.app.data.entities.BookChapter
import io.legado.app.data.repository.BookRepository
import io.legado.app.vbookextension.data.repository.ExtensionRepository
import io.legado.app.vbookextension.model.ExtensionResult
import io.legado.app.vbookextension.model.ScriptType
import io.legado.app.help.book.BookHelp
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.coroutines.Dispatchers

data class TrackInfo(
    val url: String?,
    val type: String?,
    val headers: Map<String, String>?,
    val audio: String? = null
)

class VideoReaderViewModel(
    application: Application,
    private val bookRepository: BookRepository,
    private val extensionRepository: ExtensionRepository
) : BaseViewModel(application) {

    private val _novel = MutableStateFlow<Book?>(null)
    val novel = _novel.asStateFlow()

    private val _chapters = MutableStateFlow<List<BookChapter>>(emptyList())
    val chapters = _chapters.asStateFlow()

    private val _chapter = MutableStateFlow<BookChapter?>(null)
    val chapter = _chapter.asStateFlow()

    private val _chapterContent = MutableStateFlow<String?>(null)
    val chapterContent = _chapterContent.asStateFlow()

    private val _currentIndex = MutableStateFlow(0)
    val currentIndex = _currentIndex.asStateFlow()

    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()

    private val _error = MutableStateFlow<String?>(null)
    val error = _error.asStateFlow()

    // Resolving states
    private val _resolvedVideoUrl = MutableStateFlow<String?>(null)
    val resolvedVideoUrl = _resolvedVideoUrl.asStateFlow()

    private val _resolvedVideoAudio = MutableStateFlow<String?>(null)
    val resolvedVideoAudio = _resolvedVideoAudio.asStateFlow()

    private val _resolvedVideoHeaders = MutableStateFlow<Map<String, String>?>(null)
    val resolvedVideoHeaders = _resolvedVideoHeaders.asStateFlow()

    private val _resolvedVideoType = MutableStateFlow<String?>(null)
    val resolvedVideoType = _resolvedVideoType.asStateFlow()

    private val _isResolvingTrack = MutableStateFlow(false)
    val isResolvingTrack = _isResolvingTrack.asStateFlow()

    fun loadBookAndChapters(extensionId: String, bookUrl: String, initialChapterUrl: String) {
        viewModelScope.launch {
            _isLoading.value = true
            _error.value = null
            try {
                // 1. Get Book
                val book = withContext(Dispatchers.IO) {
                    bookRepository.getBook(bookUrl)
                }
                _novel.value = book
                if (book == null) {
                    _error.value = "Không tìm thấy phim trong tủ truyện."
                    _isLoading.value = false
                    return@launch
                }

                // 2. Load TOC
                var chapterList = withContext(Dispatchers.IO) {
                    appDb.bookChapterDao.getChapterList(bookUrl)
                }

                if (chapterList.isEmpty()) {
                    val toc = extensionRepository.getTableOfContents(book.origin, bookUrl)
                    if (toc.isNotEmpty()) {
                        withContext(Dispatchers.IO) {
                            bookRepository.insertChapters(*toc.toTypedArray())
                            chapterList = appDb.bookChapterDao.getChapterList(bookUrl)
                        }
                    }
                }
                _chapters.value = chapterList

                if (chapterList.isEmpty()) {
                    _error.value = "Danh sách tập phim trống."
                    _isLoading.value = false
                    return@launch
                }

                // 3. Find current index
                var targetIdx = chapterList.indexOfFirst { it.url == initialChapterUrl }
                if (targetIdx == -1) {
                    targetIdx = book.durChapterIndex.coerceIn(0, chapterList.size - 1)
                }
                _currentIndex.value = targetIdx

                // 4. Load chapter content
                suspendLoadChapterAtIndex(targetIdx)

            } catch (e: Exception) {
                Log.e("VideoReaderVM", "loadBookAndChapters failed: ${e.message}", e)
                _error.value = e.message ?: "Lỗi tải thông tin phim."
            } finally {
                _isLoading.value = false
            }
        }
    }

    private suspend fun suspendLoadChapterAtIndex(index: Int) {
        val book = _novel.value ?: return
        val chapterList = _chapters.value
        if (index !in chapterList.indices) return

        _isLoading.value = true
        _error.value = null
        _currentIndex.value = index
        val currentChap = chapterList[index]
        _chapter.value = currentChap

        try {
            // Clear resolved values and set isResolvingTrack to true early to prevent UI frame flashes
            _resolvedVideoUrl.value = null
            _resolvedVideoHeaders.value = null
            _resolvedVideoType.value = null
            _isResolvingTrack.value = true

            // Try reading from cache
            var content = withContext(Dispatchers.IO) {
                BookHelp.getContent(book, currentChap)
            }

            if (content.isNullOrBlank()) {
                content = extensionRepository.getChapterContent(book.origin, currentChap.url)
                if (!content.isNullOrBlank()) {
                    withContext(Dispatchers.IO) {
                        BookHelp.saveText(book, currentChap, content)
                    }
                }
            }

            _chapterContent.value = content
            if (content.isNullOrBlank()) {
                _isResolvingTrack.value = false
            }

            // Update Progress in Database
            book.durChapterIndex = index
            book.durChapterTitle = currentChap.title
            book.durChapterTime = System.currentTimeMillis()
            withContext(Dispatchers.IO) {
                bookRepository.update(book)
            }

        } catch (e: Exception) {
            Log.e("VideoReaderVM", "loadChapterAtIndex failed: ${e.message}", e)
            _error.value = e.message ?: "Lỗi tải tập phim."
            _isResolvingTrack.value = false
        } finally {
            _isLoading.value = false
        }
    }

    fun loadChapterAtIndex(index: Int) {
        viewModelScope.launch {
            suspendLoadChapterAtIndex(index)
        }
    }

    fun resolveVideoUrl(extensionId: String, serverUrl: String) {
        viewModelScope.launch {
            _isResolvingTrack.value = true
            _error.value = null
            try {
                val videoExts = listOf(".mp4", ".m3u8", ".mpd", ".m4s", ".webm", ".mkv", ".ts", ".avi", ".mov", ".flv", ".dash", ".wmv", ".mpg", ".mpeg", ".3gp", ".m4v", ".f4v", ".rmvb", ".vob", ".asf", "/hls/", "/dash/", "googlevideo.com", "videoplayback", "playurl", "/stream", "/video")
                
                val realUrl = if (serverUrl.trim().startsWith("{")) {
                    try {
                        org.json.JSONObject(serverUrl).optString("url", org.json.JSONObject(serverUrl).optString("link", serverUrl))
                    } catch (e: Exception) {
                        serverUrl
                    }
                } else {
                    serverUrl
                }

                val lowerUrl = realUrl.lowercase()
                val isDirect = realUrl.startsWith("http") 
                    && !realUrl.contains("<")
                    && videoExts.any { lowerUrl.contains(it) }

                 if (isDirect) {
                    _resolvedVideoUrl.value = realUrl
                    _resolvedVideoAudio.value = null
                    _resolvedVideoHeaders.value = null
                    _resolvedVideoType.value = "native"
                } else {
                    val extension = extensionRepository.getExtension(extensionId)
                    if (extension?.pluginJson?.script?.containsKey("track") == true) {
                        val trackResult = extensionRepository.executeExtension(extensionId, ScriptType.TRACK, serverUrl)
                        if (trackResult is ExtensionResult.Success) {
                            val parsed = parseTrackResult(trackResult.data)
                            if (parsed != null && !parsed.url.isNullOrBlank()) {
                                _resolvedVideoUrl.value = parsed.url
                                _resolvedVideoAudio.value = parsed.audio
                                _resolvedVideoHeaders.value = parsed.headers
                                _resolvedVideoType.value = parsed.type
                            } else {
                                throw Exception("Không thể phân giải luồng video. Vui lòng kiểm tra lại cấu hình hoặc kết nối mạng.")
                            }
                        } else {
                            val msg = (trackResult as? ExtensionResult.Error)?.message ?: "Lỗi chạy script phân giải nguồn"
                            throw Exception(msg)
                        }
                    } else {
                        _resolvedVideoUrl.value = realUrl
                        _resolvedVideoAudio.value = null
                        _resolvedVideoHeaders.value = null
                        _resolvedVideoType.value = null
                    }
                }
            } catch (e: Exception) {
                Log.e("VideoReaderVM", "resolveVideoUrl failed: ${e.message}", e)
                _error.value = e.message ?: "Lỗi phân giải nguồn video"
                _resolvedVideoUrl.value = null
                _resolvedVideoAudio.value = null
                _resolvedVideoHeaders.value = null
                _resolvedVideoType.value = null
            } finally {
                _isResolvingTrack.value = false
            }
        }
    }

    private fun parseTrackResult(jsonStr: String): TrackInfo? {
        return try {
            val root = org.json.JSONObject(jsonStr)
            
            // Check for error code returned from JS script execution
            if (root.has("code") && root.optInt("code", 0) != 0) {
                val errorMsg = root.optString("data", root.optString("msg", "Lỗi phân giải từ tiện ích"))
                throw Exception(errorMsg)
            }

            val dataObj = if (root.has("data")) {
                val d = root.get("data")
                if (d is org.json.JSONObject) d else root
            } else {
                root
            }
            
            var url = dataObj.optString("url", "")
            if (url.isEmpty()) {
                url = dataObj.optString("data", "")
            }
            if (url.isEmpty()) {
                url = root.optString("url", root.optString("data", ""))
            }
            
            var type = dataObj.optString("type", "")
            if (type.isEmpty()) {
                type = root.optString("type", "")
            }

            var audio = dataObj.optString("audio", "")
            if (audio.isEmpty()) {
                audio = root.optString("audio", "")
            }
            
            val headersMap = mutableMapOf<String, String>()
            val headersObj = if (dataObj.has("headers")) {
                dataObj.optJSONObject("headers")
            } else if (root.has("headers")) {
                root.optJSONObject("headers")
            } else {
                null
            }
            
            headersObj?.let {
                val keys = it.keys()
                while (keys.hasNext()) {
                    val key = keys.next()
                    val value = it.optString(key)
                    if (!value.isNullOrEmpty()) {
                        headersMap[key] = value
                    }
                }
            }
            
            TrackInfo(
                url = if (url.isNotEmpty()) url else null,
                type = if (type.isNotEmpty()) type else null,
                headers = if (headersMap.isNotEmpty()) headersMap else null,
                audio = if (audio.isNotEmpty()) audio else null
            )
        } catch (e: Exception) {
            Log.e("VideoReaderVM", "parseTrackResult failed: ${e.message}")
            null
        }
    }
}
