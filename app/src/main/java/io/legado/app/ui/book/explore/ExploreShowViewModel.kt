package io.legado.app.ui.book.explore

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.legado.app.data.entities.SearchBook
import io.legado.app.data.entities.rule.ExploreKind
import io.legado.app.data.repository.ExploreRepository
import io.legado.app.domain.usecase.AddToBookshelfUseCase
import io.legado.app.domain.usecase.BookShelfKey
import io.legado.app.domain.usecase.ExploreBooksUseCase
import io.legado.app.domain.usecase.ResolveBookShelfStateUseCase
import io.legado.app.domain.usecase.SaveSearchBooksUseCase
import android.content.res.Configuration
import io.legado.app.data.local.preferences.LocalPreferencesKeys
import io.legado.app.data.local.preferences.LocalPreferencesRepository
import io.legado.app.utils.stackTraceStr
import kotlinx.collections.immutable.toImmutableList
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import splitties.init.appCtx
import io.legado.app.vbookextension.data.dao.ExtensionDao
import coil.ImageLoader
import coil.request.ImageRequest
import io.legado.app.vbookextension.data.entity.ExtensionEntity
import io.legado.app.data.entities.BookSource
import io.legado.app.data.appDb

private data class ExploreShowLoadState(
    val isLoading: Boolean = false,
    val isRefreshing: Boolean = false,
    val isEnd: Boolean = false,
    val errorMsg: String? = null,
)

private data class ExploreShowKindState(
    val kinds: List<ExploreKind> = emptyList(),
    val selectedKindTitle: String? = null,
    val homeKinds: List<ExploreKind> = emptyList(),
    val genreKinds: List<ExploreKind> = emptyList(),
)

private data class ExploreShowDisplayState(
    val sourceUrl: String? = null,
    val layoutState: Int,
    val gridCount: Int,
    val sheet: ExploreShowSheet = ExploreShowSheet.None,
)

class ExploreShowViewModel(
    private val repository: ExploreRepository,
    private val resolveBookShelfStateUseCase: ResolveBookShelfStateUseCase,
    private val exploreBooksUseCase: ExploreBooksUseCase,
    private val saveSearchBooksUseCase: SaveSearchBooksUseCase,
    private val addToBookshelfUseCase: AddToBookshelfUseCase,
    private val localPreferencesRepository: LocalPreferencesRepository,
    private val extensionDao: ExtensionDao,
    private val extensionLoader: io.legado.app.vbookextension.loader.ExtensionLoader,
    private val imageLoader: ImageLoader,
) : ViewModel() {

    private val _rawBooks = MutableStateFlow<List<SearchBook>>(emptyList())
    private val _bookshelf = MutableStateFlow<Set<BookShelfKey>>(emptySet())
    private val _loadState = MutableStateFlow(ExploreShowLoadState())
    private val _kindState = MutableStateFlow(ExploreShowKindState())
    private val _displayState = MutableStateFlow(
        ExploreShowDisplayState(
            layoutState = 1,
            gridCount = if (appCtx.resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) 7 else 3,
        )
    )
    private val _extension = MutableStateFlow<ExtensionEntity?>(null)
    private val _bookSource = MutableStateFlow<BookSource?>(null)
    private val _searchQuery = MutableStateFlow<String?>(null)
    private val _showSearchIcon = MutableStateFlow(false)

    private var sourceUrl: String? = null
    private var exploreUrl: String? = null
    private var initialized = false
    private var page = 1
    private var autoPageCount = 0
    private var loadJob: kotlinx.coroutines.Job? = null

    companion object {
        private const val MAX_AUTO_PAGES = 3
        private const val AUTO_PAGE_DELAY_MS = 500L
    }

    private val _uiState = MutableStateFlow(
        ExploreShowUiState(
            layoutState = _displayState.value.layoutState,
            gridCount = _displayState.value.gridCount,
        )
    )
    val uiState = _uiState.asStateFlow()

    private val _effects = MutableSharedFlow<ExploreShowEffect>(extraBufferCapacity = 16)
    val effects = _effects.asSharedFlow()

    init {
        observeBookshelf()
        combineUiState()
        loadLayoutMode()
        loadGridCount()
    }

    fun onIntent(intent: ExploreShowIntent) {
        when (intent) {
            is ExploreShowIntent.InitData -> initData(intent.sourceUrl, intent.exploreUrl)
            ExploreShowIntent.LoadMore -> loadMore()
            ExploreShowIntent.ForceLoadNext -> loadMore(forceLoad = true)
            ExploreShowIntent.Refresh -> loadMore(isRefresh = true)
            is ExploreShowIntent.SwitchKind -> switchKind(intent.kind)
            ExploreShowIntent.ToggleLayout -> toggleLayout()
            is ExploreShowIntent.SaveGridCount -> saveGridCount(intent.count)
            is ExploreShowIntent.ShowSheet -> _displayState.update { it.copy(sheet = intent.sheet) }
            ExploreShowIntent.DismissSheet -> _displayState.update { it.copy(sheet = ExploreShowSheet.None) }
            is ExploreShowIntent.OpenBook -> emitEffect(
                ExploreShowEffect.OpenBookInfo(
                    name = intent.book.name,
                    author = intent.book.author,
                    bookUrl = intent.book.bookUrl,
                    origin = intent.book.origin,
                    coverPath = intent.book.coverUrl,
                    sharedCoverKey = intent.sharedCoverKey,
                )
            )

            is ExploreShowIntent.AddToShelf -> viewModelScope.launch {
                addToBookshelfUseCase.execute(intent.book)
            }

            is ExploreShowIntent.Search -> {
                _searchQuery.value = intent.query
                page = 1
                autoPageCount = 0
                _rawBooks.value = emptyList()
                _loadState.update { it.copy(isEnd = false) }
                loadMore(isRefresh = true)
            }
        }
    }

    private fun observeBookshelf() {
        viewModelScope.launch {
            repository.getBookshelfItems().collect { list ->
                _bookshelf.value = list.map {
                    BookShelfKey(it.name, it.author, it.bookUrl)
                }.toSet()
            }
        }
    }

    private fun combineUiState() {
        viewModelScope.launch {
            combine(
                _rawBooks,
                _bookshelf,
                _loadState,
                _kindState,
                _displayState,
                _extension,
                _bookSource,
                _searchQuery,
                _showSearchIcon,
            ) { array ->
                val rawBooks = array[0] as List<SearchBook>
                val bookshelf = array[1] as Set<BookShelfKey>
                val loadState = array[2] as ExploreShowLoadState
                val kindState = array[3] as ExploreShowKindState
                val displayState = array[4] as ExploreShowDisplayState
                val extension = array[5] as ExtensionEntity?
                val bookSource = array[6] as BookSource?
                val searchQuery = array[7] as String?
                val showSearchIconExt = array[8] as Boolean

                val showSearchIcon = bookSource != null || (extension != null && showSearchIconExt)

                val books = rawBooks.map { item ->
                    ExploreBookItemUi(
                        book = item,
                        shelfState = resolveBookShelfStateUseCase.execute(
                            name = item.name,
                            author = item.author,
                            url = item.bookUrl,
                            shelf = bookshelf,
                        )
                    )
                }

                ExploreShowUiState(
                    sourceUrl = displayState.sourceUrl,
                    books = books.toImmutableList(),
                    kinds = kindState.kinds.toImmutableList(),
                    selectedKindTitle = kindState.selectedKindTitle,
                    homeKinds = kindState.homeKinds.toImmutableList(),
                    genreKinds = kindState.genreKinds.toImmutableList(),
                    layoutState = displayState.layoutState,
                    gridCount = displayState.gridCount,
                    isLoading = loadState.isLoading,
                    isRefreshing = loadState.isRefreshing,
                    isEnd = loadState.isEnd,
                    errorMsg = loadState.errorMsg,
                    sheet = displayState.sheet,
                    extension = extension,
                    bookSource = bookSource,
                    searchQuery = searchQuery,
                    showSearchIcon = showSearchIcon,
                )
            }.collect { newState ->
                _uiState.value = newState
            }
        }
    }

    private fun initData(incomingSourceUrl: String, incomingExploreUrl: String?) {
        if (initialized && sourceUrl == incomingSourceUrl && (incomingExploreUrl == null || exploreUrl == incomingExploreUrl)) {
            return
        }
        initialized = true
        sourceUrl = incomingSourceUrl

        if (incomingSourceUrl.startsWith("ext_")) {
            val extId = incomingSourceUrl.substringAfter("ext_")
            viewModelScope.launch {
                val extEntity = extensionDao.getExtensionById(extId)
                _extension.value = extEntity
                if (extEntity != null) {
                    val loaded = extensionLoader.loadExtension(extId)
                    _showSearchIcon.value = loaded?.pluginJson?.script?.containsKey(io.legado.app.vbookextension.model.ScriptType.SEARCH.key) == true
                } else {
                    _showSearchIcon.value = false
                }
            }
        } else {
            _extension.value = null
            _showSearchIcon.value = false
        }

        viewModelScope.launch(kotlinx.coroutines.Dispatchers.IO) {
            _bookSource.value = appDb.bookSourceDao.getBookSource(incomingSourceUrl)
        }

        _loadState.update { it.copy(isLoading = true, errorMsg = null) }

        viewModelScope.launch {
            val cacheKeyPrefix = incomingSourceUrl
            val isExtension = incomingSourceUrl.startsWith("ext_")
            
            var finalKinds: List<ExploreKind> = emptyList()
            var homeKinds: List<ExploreKind> = emptyList()
            var genreKinds: List<ExploreKind> = emptyList()

            val cachedKinds = ExploreShowCache.getKinds(cacheKeyPrefix)
            val cachedHome = if (isExtension) ExploreShowCache.getHomeKinds(cacheKeyPrefix) else null
            val cachedGenre = if (isExtension) ExploreShowCache.getGenreKinds(cacheKeyPrefix) else null

            if (cachedKinds != null && (!isExtension || (cachedHome != null && cachedGenre != null))) {
                finalKinds = cachedKinds
                homeKinds = cachedHome ?: emptyList()
                genreKinds = cachedGenre ?: emptyList()
                
                _kindState.update {
                    it.copy(
                        kinds = finalKinds,
                        homeKinds = homeKinds,
                        genreKinds = genreKinds
                    )
                }
                
                initializeBooksWithCache(incomingSourceUrl, incomingExploreUrl, finalKinds)
            } else {
                try {
                    if (isExtension) {
                        // 1. Fetch home kinds first and update UI
                        homeKinds = repository.getHomeKinds(incomingSourceUrl)
                        finalKinds = homeKinds
                        ExploreShowCache.putHomeKinds(cacheKeyPrefix, homeKinds)
                        ExploreShowCache.putKinds(cacheKeyPrefix, finalKinds)
                        
                        _kindState.update {
                            it.copy(
                                kinds = finalKinds,
                                homeKinds = homeKinds,
                                genreKinds = genreKinds
                            )
                        }

                        // Load books immediately
                        initializeBooksWithCache(incomingSourceUrl, incomingExploreUrl, finalKinds)
                        
                        // 2. Fetch genre kinds in background without blocking
                        viewModelScope.launch {
                            try {
                                val loadedGenres = repository.getGenreKinds(incomingSourceUrl)
                                if (loadedGenres.isNotEmpty()) {
                                    genreKinds = loadedGenres
                                    finalKinds = homeKinds + loadedGenres
                                    ExploreShowCache.putGenreKinds(cacheKeyPrefix, loadedGenres)
                                    ExploreShowCache.putKinds(cacheKeyPrefix, finalKinds)
                                    
                                    _kindState.update {
                                        it.copy(
                                            kinds = finalKinds,
                                            genreKinds = loadedGenres
                                        )
                                    }
                                }
                            } catch (e: Exception) {
                                e.printStackTrace()
                            }
                        }
                    } else {
                        finalKinds = repository.getSourceExploreKinds(incomingSourceUrl)
                        ExploreShowCache.putKinds(cacheKeyPrefix, finalKinds)
                        
                        _kindState.update {
                            it.copy(kinds = finalKinds)
                        }
                        
                        initializeBooksWithCache(incomingSourceUrl, incomingExploreUrl, finalKinds)
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                    _loadState.update { it.copy(errorMsg = "Lỗi tải phân loại: ${e.localizedMessage}") }
                }
            }
        }
    }

    private fun initializeBooksWithCache(incomingSourceUrl: String, incomingExploreUrl: String?, finalKinds: List<ExploreKind>) {
        var resolvedExploreUrl = incomingExploreUrl
        if (resolvedExploreUrl == null && finalKinds.isNotEmpty()) {
            resolvedExploreUrl = finalKinds.first().url
        }
        exploreUrl = resolvedExploreUrl

        _displayState.update {
            it.copy(
                sourceUrl = incomingSourceUrl,
                sheet = ExploreShowSheet.None,
            )
        }

        val cacheKey = "$incomingSourceUrl##$resolvedExploreUrl"
        val cachedBooks = ExploreShowCache.getBooks(cacheKey)
        if (cachedBooks != null) {
            _rawBooks.value = cachedBooks
            preloadBookCovers(cachedBooks)
            page = ExploreShowCache.getPage(cacheKey) ?: 1
            val cachedSelected = ExploreShowCache.getSelectedKind(cacheKey) ?: run {
                val matchedKind = finalKinds.find { 
                    it.url == resolvedExploreUrl || 
                    (it.url?.contains("||") == true && it.url.substringAfter("||") == resolvedExploreUrl) ||
                    (resolvedExploreUrl?.contains("||") == true && it.url == resolvedExploreUrl.substringAfter("||"))
                }
                matchedKind?.title
            }
            _kindState.update { it.copy(selectedKindTitle = cachedSelected) }
            val cachedIsEnd = ExploreShowCache.getIsEnd(cacheKey) ?: false
            _loadState.update { it.copy(isLoading = false, isEnd = cachedIsEnd) }
            // Silent refresh: load page 1 from network in background
            loadMore(isRefresh = true, forceLoad = false, keepList = true)
        } else {
            val matchedKind = finalKinds.find { 
                it.url == resolvedExploreUrl || 
                (it.url?.contains("||") == true && it.url.substringAfter("||") == resolvedExploreUrl) ||
                (resolvedExploreUrl?.contains("||") == true && it.url == resolvedExploreUrl.substringAfter("||"))
            }
            _kindState.update { it.copy(selectedKindTitle = matchedKind?.title) }
            page = 1
            autoPageCount = 0
            _rawBooks.value = emptyList()
            _loadState.update { it.copy(isLoading = false, isEnd = false, errorMsg = null) }
            loadMore(isRefresh = false, forceLoad = true)
        }
    }

    private fun switchKind(kind: ExploreKind) {
        loadJob?.cancel()
        _kindState.update { it.copy(selectedKindTitle = kind.title) }
        exploreUrl = kind.url
        autoPageCount = 0
        _searchQuery.value = null // Clear active search query when switching categories
        
        val source = sourceUrl
        val url = kind.url
        if (source != null) {
            val cacheKey = "$source##$url"
            val cachedBooks = ExploreShowCache.getBooks(cacheKey)
            if (cachedBooks != null) {
                _rawBooks.value = cachedBooks
                preloadBookCovers(cachedBooks)
                page = ExploreShowCache.getPage(cacheKey) ?: 1
                val cachedIsEnd = ExploreShowCache.getIsEnd(cacheKey) ?: false
                _loadState.update { it.copy(isLoading = false, isEnd = cachedIsEnd, errorMsg = null) }
                
                // Silent refresh: load page 1 from network in background without clearing current UI list
                loadMore(isRefresh = true, forceLoad = false, keepList = true)
            } else {
                page = 1
                _rawBooks.value = emptyList()
                _loadState.update { it.copy(isLoading = false, isEnd = false, errorMsg = null) }
                loadMore(isRefresh = false, forceLoad = true)
            }
        }
    }

    private fun toggleLayout() {
        _displayState.update {
            val layoutState = if (it.layoutState == 0) 1 else 0
            viewModelScope.launch {
                localPreferencesRepository.updatePreference(LocalPreferencesKeys.EXPLORE_LAYOUT_MODE, layoutState)
            }
            it.copy(layoutState = layoutState)
        }
    }

    private fun loadLayoutMode() {
        viewModelScope.launch {
            val mode = localPreferencesRepository.getPreference(LocalPreferencesKeys.EXPLORE_LAYOUT_MODE, 1).first()
            _displayState.update { it.copy(layoutState = mode) }
        }
    }

    private fun loadGridCount() {
        viewModelScope.launch {
            val isLandscape = appCtx.resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE
            val key = if (isLandscape) {
                LocalPreferencesKeys.EXPLORE_LAYOUT_GRID_LANDSCAPE
            } else {
                LocalPreferencesKeys.EXPLORE_LAYOUT_GRID_PORTRAIT
            }
            val default = if (isLandscape) 7 else 3
            val count = localPreferencesRepository.getPreference(key, default).first()
            _displayState.update { it.copy(gridCount = count) }
        }
    }

    private fun saveGridCount(count: Int) {
        val isLandscape = appCtx.resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE
        val key = if (isLandscape) {
            LocalPreferencesKeys.EXPLORE_LAYOUT_GRID_LANDSCAPE
        } else {
            LocalPreferencesKeys.EXPLORE_LAYOUT_GRID_PORTRAIT
        }
        viewModelScope.launch {
            localPreferencesRepository.updatePreference(key, count)
        }
        _displayState.update { it.copy(gridCount = count) }
    }

    private fun loadMore(isRefresh: Boolean = false, forceLoad: Boolean = false, keepList: Boolean = false) {
        val source = sourceUrl
        val url = exploreUrl
        val loadState = _loadState.value
        if (source == null || (loadState.isLoading && !isRefresh) || (loadState.isEnd && !isRefresh && !forceLoad)) return

        _loadState.update {
            it.copy(
                isLoading = true,
                isRefreshing = isRefresh && !keepList,
                isEnd = if (isRefresh || forceLoad) false else it.isEnd,
                errorMsg = null,
            )
        }

        loadJob?.cancel()
        loadJob = viewModelScope.launch {
            if (isRefresh) {
                page = 1
                autoPageCount = 0
                if (!keepList) {
                    _rawBooks.value = emptyList()
                }
                val query = _searchQuery.value
                val cacheKey = if (query != null) {
                    "$source##search##$query"
                } else {
                    "$source##$url"
                }
                ExploreShowCache.remove(cacheKey)
            }

            if (forceLoad) {
                autoPageCount = 0
            }

            fetchPage(source, url)
        }
    }

    private suspend fun fetchPage(sourceUrl: String, url: String?) {
        kotlin.runCatching {
            exploreBooksUseCase.execute(sourceUrl, url, args = null, page, key = _searchQuery.value)
        }.onSuccess { result ->
            if (url != exploreUrl) {
                return
            }
            // Offload distinct, filtering and saving to background thread
            val (uniqueNewBooks, newBooksList) = kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.Default) {
                val currentList = if (page == 1) emptyList() else _rawBooks.value
                val existingUrls = currentList.map { it.bookUrl }.toSet()
                val filtered = result.books
                    .filter { it.bookUrl !in existingUrls }
                    .distinctBy { it.bookUrl }
                
                if (result.books.isNotEmpty()) {
                    saveSearchBooksUseCase.save(result.books)
                }
                
                filtered to (currentList + filtered)
            }

            if (uniqueNewBooks.isEmpty()) {
                fetchNextAutoPageOrFinish(sourceUrl, url)
            } else {
                _rawBooks.value = newBooksList
                page++
                autoPageCount = 0
                _loadState.update { it.copy(isEnd = false) }
                preloadBookCovers(uniqueNewBooks)
                
                val query = _searchQuery.value
                val cacheKey = if (query != null) {
                    "$sourceUrl##search##$query"
                } else {
                    "$sourceUrl##$url"
                }
                ExploreShowCache.putBooks(cacheKey, newBooksList)
                ExploreShowCache.putPage(cacheKey, page)
                ExploreShowCache.putIsEnd(cacheKey, false)
                _kindState.value.selectedKindTitle?.let { ExploreShowCache.putSelectedKind(cacheKey, it) }
                
                finishLoading()
            }
        }.onFailure { throwable ->
            if (throwable !is kotlinx.coroutines.CancellationException) {
                _loadState.update { it.copy(errorMsg = throwable.stackTraceStr) }
                finishLoading()
            }
        }
    }

    private suspend fun fetchNextAutoPageOrFinish(sourceUrl: String, url: String?) {
        if (url != exploreUrl) return
        page++
        autoPageCount++
        if (autoPageCount >= MAX_AUTO_PAGES) {
            _loadState.update { it.copy(isEnd = true) }
            val query = _searchQuery.value
            val cacheKey = if (query != null) {
                "$sourceUrl##search##$query"
            } else {
                "$sourceUrl##$url"
            }
            ExploreShowCache.putPage(cacheKey, page)
            ExploreShowCache.putIsEnd(cacheKey, true)
            finishLoading()
        } else {
            delay(AUTO_PAGE_DELAY_MS)
            fetchPage(sourceUrl, url)
        }
    }

    private fun finishLoading() {
        _loadState.update {
            it.copy(
                isLoading = false,
                isRefreshing = false,
            )
        }
    }

    private fun emitEffect(effect: ExploreShowEffect) {
        _effects.tryEmit(effect)
    }

    private fun preloadBookCovers(books: List<SearchBook>) {
        viewModelScope.launch(kotlinx.coroutines.Dispatchers.IO) {
            books.take(12).forEach { book ->
                val coverUrl = book.coverUrl
                if (!coverUrl.isNullOrBlank()) {
                    val request = io.legado.app.ui.widget.components.image.cover.buildCoverImageRequest(
                        context = appCtx,
                        data = coverUrl,
                        sourceOrigin = book.origin,
                        loadOnlyWifi = io.legado.app.ui.config.coverConfig.CoverConfig.loadCoverOnlyWifi,
                        memoryCacheKey = coverUrl
                    )
                    imageLoader.enqueue(request)
                }
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        val source = sourceUrl
        if (source != null) {
            val url = exploreUrl
            val query = _searchQuery.value
            val kindsList = _kindState.value.kinds
            kotlinx.coroutines.CoroutineScope(kotlinx.coroutines.Dispatchers.IO).launch {
                ExploreShowCache.remove(source)
                if (url != null) {
                    ExploreShowCache.remove("$source##$url")
                }
                if (query != null) {
                    ExploreShowCache.remove("$source##search##$query")
                }
                kindsList.forEach { kind ->
                    kind.url?.let { kUrl ->
                        ExploreShowCache.remove("$source##$kUrl")
                    }
                }
            }
        }
    }
}
