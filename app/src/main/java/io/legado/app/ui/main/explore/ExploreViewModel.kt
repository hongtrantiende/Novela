package io.legado.app.ui.main.explore

import android.app.Application
import android.content.Context
import io.legado.app.vbookextension.data.entity.ExtensionEntity
import androidx.lifecycle.viewModelScope
import io.legado.app.base.BaseViewModel
import io.legado.app.data.entities.BookSourcePart
import io.legado.app.data.entities.rule.ExploreKind
import io.legado.app.data.repository.ExploreRepository
import io.legado.app.domain.usecase.ExploreKindUiUseCase
import io.legado.app.help.source.clearExploreKindsCache
import io.legado.app.help.source.exploreKinds
import io.legado.app.vbookextension.data.dao.ExtensionDao
import io.legado.app.help.source.getExploreInfoMap
import io.legado.app.ui.widget.components.explore.calculateExploreKindRows
import io.legado.app.ui.widget.components.list.ListUiState
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.ImmutableMap
import kotlinx.collections.immutable.ImmutableSet
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.persistentMapOf
import kotlinx.collections.immutable.persistentSetOf
import kotlinx.collections.immutable.toImmutableList
import kotlinx.collections.immutable.toImmutableMap
import kotlinx.collections.immutable.toImmutableSet
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import io.legado.app.ui.config.prefDelegate
import io.legado.app.vbookextension.model.ExtensionInfo
import io.legado.app.vbookextension.ui.YckceoSourceItem
import io.legado.app.vbookextension.ui.ExtensionCache
import io.legado.app.data.appDb
import okhttp3.Request
import io.legado.app.help.http.okHttpClient
import io.legado.app.utils.GSON
import io.legado.app.utils.fromJsonArray

class ExploreViewModel(
    application: Application,
    private val exploreRepository: ExploreRepository,
    private val exploreKindUseCase: ExploreKindUiUseCase,
    private val extensionDao: ExtensionDao,
    private val extensionLoader: io.legado.app.vbookextension.loader.ExtensionLoader,
    private val repositoryDao: io.legado.app.vbookextension.data.dao.RepositoryDao,
) : BaseViewModel(application) {

    var hideUninstalled: Boolean by prefDelegate("explore_hide_uninstalled", false) { newVal ->
        _uiState.update { it.copy(hideUninstalled = newVal) }
        observeExplore()
    }

    private val _uiState = MutableStateFlow(ExploreUiState(hideUninstalled = hideUninstalled))
    val uiState: StateFlow<ExploreUiState> = _uiState
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), ExploreUiState(hideUninstalled = hideUninstalled))
    private val _effects = MutableSharedFlow<ExploreEffect>(extraBufferCapacity = 8)
    val effects = _effects.asSharedFlow()

    private var exploreJob: Job? = null
    private var kindsJob: Job? = null

    private val _onlineBookSources = MutableStateFlow<List<YckceoSourceItem>>(emptyList())
    private val _onlineExtensions = MutableStateFlow<List<ExtensionInfo>>(emptyList())
    private val _installingIds = MutableStateFlow<Set<String>>(emptySet())

    init {
        observeGroups()
        observeExplore()
        observeInstalledStates()
        fetchOnlineBookSources()
        fetchOnlineExtensions()
    }

    private fun observeGroups() {
        viewModelScope.launch {
            exploreRepository.getExploreGroups()
                .flowOn(IO)
                .collectLatest { groups ->
                    _uiState.update { it.copy(groups = groups.toImmutableList()) }
                }
        }
    }

    private fun observeInstalledStates() {
        viewModelScope.launch {
            appDb.bookSourceDao.flowAll()
                .flowOn(IO)
                .collectLatest { list ->
                    val urls = list.map { it.bookSourceUrl }.toSet()
                    _uiState.update { it.copy(installedBookSourceUrls = urls.toImmutableSet()) }
                }
        }
        viewModelScope.launch {
            extensionDao.getInstalledExtensions()
                .flowOn(IO)
                .collectLatest { list ->
                    val ids = list.map { it.id }.toSet()
                    _uiState.update { it.copy(installedExtensionIds = ids.toImmutableSet()) }
                }
        }
    }

    private fun fetchOnlineBookSources() {
        viewModelScope.launch {
            try {
                withContext(IO) {
                    val url = "https://raw.githubusercontent.com/hongtrantiende/Extransion-TTC/main/yckceo_sources.json?t=${System.currentTimeMillis()}"
                    val builder = Request.Builder().url(url)
                    if (url.contains("raw.githubusercontent.com/hongtrantiende/") || url.contains("githubusercontent.com/hongtrantiende/")) {
                        builder.header("Authorization", "token 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")
                    }
                    val request = builder.build()
                    okHttpClient.newCall(request).execute().use { response ->
                        if (response.isSuccessful) {
                            val body = response.body.string()
                            val list = GSON.fromJsonArray<YckceoSourceItem>(body).getOrThrow()
                            _onlineBookSources.value = list
                            observeExplore()
                        }
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    private fun fetchOnlineExtensions() {
        viewModelScope.launch {
            try {
                if (ExtensionCache.availableExtensions != null) {
                    _onlineExtensions.value = ExtensionCache.availableExtensions!!
                    observeExplore()
                    return@launch
                }
                val allExts = mutableListOf<ExtensionInfo>()
                withContext(IO) {
                    val builtIn = extensionLoader.fetchBuiltInExtensions()
                    allExts.addAll(builtIn)
                    val repos = repositoryDao.getEnabledRepositories()
                    for (repo in repos) {
                        if (repo.url != "file:///android_asset/plugin.json") {
                            try {
                                val repoExts = extensionLoader.fetchRepository(repo.url)
                                allExts.addAll(repoExts)
                            } catch (e: Exception) {
                                e.printStackTrace()
                            }
                        }
                    }
                }
                val distinctExts = allExts.groupBy { it.name.toSlug() }.map { (_, list) ->
                    list.maxByOrNull { it.version } ?: list.first()
                }
                ExtensionCache.availableExtensions = distinctExts
                _onlineExtensions.value = distinctExts
                observeExplore()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    fun installExtensionBySlug(slug: String) {
        val info = _onlineExtensions.value.find { it.name.toSlug() == slug } ?: return
        viewModelScope.launch {
            _installingIds.update { it + slug }
            _uiState.update { it.copy(installingIds = (it.installingIds + slug).toImmutableSet()) }
            try {
                extensionLoader.installExtension(info)
                observeExplore()
            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                _installingIds.update { it - slug }
                _uiState.update { it.copy(installingIds = (it.installingIds - slug).toImmutableSet()) }
            }
        }
    }

    fun search(key: String) {
        _uiState.update { it.copy(searchKey = key, expandedId = null) }
        observeExplore()
    }

    fun setGroup(group: String) {
        _uiState.update { it.copy(selectedGroup = group, expandedId = null) }
        observeExplore()
    }

    fun toggleSearchVisible(visible: Boolean) {
        _uiState.update { it.copy(isSearch = visible) }
        if (!visible) {
            search("")
        }
    }

    fun setExploreTab(tabIndex: Int) {
        _uiState.update { it.copy(exploreTab = tabIndex, expandedId = null) }
        observeExplore()
    }

    private fun observeExplore() {
        exploreJob?.cancel()
        exploreJob = viewModelScope.launch {
            val state = _uiState.value
            val query = state.searchKey
            val selectedGroup = state.selectedGroup
            val hideUninstalled = state.hideUninstalled

            if (state.exploreTab == 1) {
                combine(
                    extensionDao.getInstalledExtensions(),
                    _onlineExtensions
                ) { installedExts, onlineExts ->
                    val prefs = getApplication<Application>().getSharedPreferences("novel_reader_prefs", Context.MODE_PRIVATE)
                    val installedSlugs = installedExts.map { it.id }.toSet()
                    val items = mutableListOf<BookSourcePart>()
                    
                    val sortedExts = installedExts.sortedWith(compareByDescending<ExtensionEntity> {
                        prefs.getBoolean("ext_pinned_${it.id}", false)
                    }.thenBy { it.name })
                    
                    val installedItems = sortedExts.filter { it.isEnabled }.map { ext ->
                        BookSourcePart(
                            bookSourceUrl = "ext_${ext.id}",
                            bookSourceName = ext.name,
                            bookSourceGroup = "${ext.iconPath.orEmpty()}|${ext.type}|${ext.locale}",
                            customOrder = 0,
                            enabled = ext.isEnabled,
                            enabledExplore = ext.isEnabled,
                            hasLoginUrl = false,
                            lastUpdateTime = 0,
                            respondTime = 0,
                            weight = 0,
                            hasExploreUrl = true
                        )
                    }
                    items.addAll(installedItems)
                    
                    if (!hideUninstalled) {
                        val uninstalledOnline = onlineExts.filter { onlineItem ->
                            val slug = onlineItem.name.toSlug()
                            !installedSlugs.contains(slug) &&
                            (query.isBlank() || onlineItem.name.contains(query, ignoreCase = true) || onlineItem.description.contains(query, ignoreCase = true))
                        }.map { onlineItem ->
                            BookSourcePart(
                                bookSourceUrl = "ext_online_${onlineItem.name.toSlug()}",
                                bookSourceName = onlineItem.name,
                                bookSourceGroup = "${onlineItem.icon}|${onlineItem.type}|${onlineItem.locale}",
                                customOrder = 0,
                                enabled = false,
                                enabledExplore = false,
                                hasLoginUrl = false,
                                lastUpdateTime = 0,
                                respondTime = 0,
                                weight = 0,
                                hasExploreUrl = true
                            )
                        }
                        items.addAll(uninstalledOnline)
                    }
                    
                    items.filter {
                        query.isBlank() || it.bookSourceName.contains(query, ignoreCase = true)
                    }
                }.flowOn(IO)
                .collectLatest { mappedItems ->
                    _uiState.update { it.copy(items = mappedItems.toImmutableList()) }
                }
            } else {
                combine(
                    exploreRepository.getExploreSources(query, selectedGroup),
                    _onlineBookSources
                ) { installedSources, onlineSources ->
                    val installedUrls = installedSources.map { it.bookSourceUrl }.toSet()
                    val items = mutableListOf<BookSourcePart>()
                    
                    items.addAll(installedSources)
                    
                    if (!hideUninstalled) {
                        val uninstalledOnline = onlineSources.filter { onlineItem ->
                            (query.isBlank() || onlineItem.name.contains(query, ignoreCase = true) || onlineItem.url.contains(query, ignoreCase = true)) &&
                            !installedUrls.contains(onlineItem.url)
                        }.map { onlineItem ->
                            BookSourcePart(
                                bookSourceUrl = "online_yckceo_${onlineItem.id}_${onlineItem.url}",
                                bookSourceName = onlineItem.name,
                                bookSourceGroup = "Tác giả: " + onlineItem.author + (if (onlineItem.tags.isNotBlank()) " | " + onlineItem.tags else ""),
                                customOrder = 0,
                                enabled = false,
                                enabledExplore = false,
                                hasLoginUrl = false,
                                lastUpdateTime = 0,
                                respondTime = 0,
                                weight = 0,
                                hasExploreUrl = false
                            )
                        }
                        items.addAll(uninstalledOnline)
                    }
                    items.toList()
                }.flowOn(IO)
                .collectLatest { items ->
                    _uiState.update { it.copy(items = items.toImmutableList()) }
                }
            }
        }
    }

    fun toggleExpand(source: BookSourcePart) {
        val newExpandedId =
            if (_uiState.value.expandedId == source.bookSourceUrl) null else source.bookSourceUrl
        _uiState.update {
            it.copy(
                expandedId = newExpandedId,
                exploreKinds = persistentListOf(),
                kindDisplayNames = persistentMapOf(),
                kindValues = persistentMapOf(),
                loadingKinds = newExpandedId != null
            )
        }

        if (newExpandedId != null) {
            loadExploreKinds(source)
        }
    }

    private fun loadExploreKinds(source: BookSourcePart) {
        kindsJob?.cancel()
        kindsJob = viewModelScope.launch(IO) {
            try {
                val kinds = if (source.bookSourceUrl.startsWith("ext_")) {
                    exploreRepository.getSourceExploreKinds(source.bookSourceUrl)
                } else {
                    source.exploreKinds()
                }
                exploreKindUseCase.warmUp(source.bookSourceUrl)
                val infoMap = getExploreInfoMap(source.bookSourceUrl)
                val displayNames = kinds.associate { kind ->
                    val originalName = exploreKindUseCase.resolveDisplayName(
                        kind = kind,
                        sourceUrl = source.bookSourceUrl,
                        infoMap = infoMap
                    )
                    val translatedName = if (io.legado.app.ui.config.translation.TranslationConfig.isGlobalTranslateEnabled) {
                        io.legado.app.utils.TranslateUtils.translateMeta(originalName)
                    } else {
                        originalName
                    }
                    kind.title to translatedName
                }
                val values = buildKindValues(kinds, source.bookSourceUrl)
                _uiState.update {
                    if (it.expandedId == source.bookSourceUrl) {
                        it.copy(
                            exploreKinds = kinds.toImmutableList(),
                            kindDisplayNames = displayNames.toImmutableMap(),
                            kindValues = values.toImmutableMap(),
                            loadingKinds = false
                        )
                    } else it
                }
            } catch (e: Exception) {
                _uiState.update { it.copy(loadingKinds = false) }
            }
        }
    }

    fun refreshExploreKinds(source: BookSourcePart) {
        viewModelScope.launch(IO) {
            if (!source.bookSourceUrl.startsWith("ext_")) {
                source.clearExploreKindsCache()
            }
            if (_uiState.value.expandedId == source.bookSourceUrl) {
                loadExploreKinds(source)
            }
        }
    }

    fun topSource(bookSource: BookSourcePart) {
        execute {
            exploreRepository.topSource(bookSource)
        }
    }

    fun refreshExploreKinds(sourceUrl: String) {
        val source = _uiState.value.items.firstOrNull { it.bookSourceUrl == sourceUrl } ?: return
        refreshExploreKinds(source)
    }

    fun updateKindValue(sourceUrl: String, kind: ExploreKind, value: String) {
        _uiState.update { state ->
            state.copy(kindValues = (state.kindValues + (kind.title to value)).toImmutableMap())
        }
        viewModelScope.launch(IO) {
            getExploreInfoMap(sourceUrl).apply {
                this[kind.title] = value
                saveNow()
            }
        }
    }

    fun requestKindAction(sourceUrl: String, kind: ExploreKind) {
        _effects.tryEmit(ExploreEffect.ExecuteKindAction(sourceUrl, kind))
    }

    fun deleteSource(source: BookSourcePart) {
        execute {
            exploreRepository.deleteSource(source.bookSourceUrl)
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

    data class ExploreUiState(
        override val items: ImmutableList<BookSourcePart> = persistentListOf(),
        override val selectedIds: ImmutableSet<String> = persistentSetOf(),
        override val searchKey: String = "",
        override val isSearch: Boolean = false,
        override val isLoading: Boolean = false,
        val groups: ImmutableList<String> = persistentListOf(),
        val selectedGroup: String = "",
        val expandedId: String? = null,
        val exploreKinds: ImmutableList<ExploreKind> = persistentListOf(),
        val kindDisplayNames: ImmutableMap<String, String> = persistentMapOf(),
        val kindValues: ImmutableMap<String, String> = persistentMapOf(),
        val loadingKinds: Boolean = false,
        val exploreTab: Int = 0,
        val hideUninstalled: Boolean = false,
        val installedBookSourceUrls: ImmutableSet<String> = persistentSetOf(),
        val installedExtensionIds: ImmutableSet<String> = persistentSetOf(),
        val installingIds: ImmutableSet<String> = persistentSetOf()
    ) : ListUiState<BookSourcePart>

    fun buildExploreListItems(state: ExploreUiState): ImmutableList<ExploreListItem> {
        if (state.items.isEmpty()) return persistentListOf()
        val expandedId = state.expandedId
        val kindRows = if (expandedId != null) {
            calculateExploreKindRows(state.exploreKinds, 6)
        } else {
            emptyList()
        }
        return buildList {
            state.items.forEach { source ->
                add(ExploreListItem.Header(source))
                if (source.bookSourceUrl == expandedId) {
                    kindRows.forEachIndexed { index, row ->
                        add(
                            ExploreListItem.KindRow(
                                sourceUrl = source.bookSourceUrl,
                                rowIndex = index,
                                rowItems = row.toImmutableList()
                            )
                        )
                    }
                }
            }
        }.toImmutableList()
    }

    private fun buildKindValues(
        kinds: List<ExploreKind>,
        sourceUrl: String
    ): Map<String, String> {
        val infoMap = getExploreInfoMap(sourceUrl)
        var shouldSave = false
        val values = HashMap<String, String>()
        kinds.forEach { kind ->
            when (kind.type) {
                ExploreKind.Type.text -> {
                    values[kind.title] = infoMap[kind.title].orEmpty()
                }

                ExploreKind.Type.toggle,
                ExploreKind.Type.select -> {
                    val chars = kind.chars
                        ?.filterNotNull()
                        ?.takeIf { it.isNotEmpty() }
                        ?: listOf("chars", "is null")
                    val value = infoMap[kind.title]
                        ?.takeUnless { it.isEmpty() }
                        ?: (kind.default ?: chars.first()).also {
                            infoMap[kind.title] = it
                            shouldSave = true
                        }
                    values[kind.title] = value
                }
            }
        }
        if (shouldSave) {
            infoMap.saveNow()
        }
        return values
    }

}

sealed interface ExploreListItem {
    val key: String

    data class Header(val source: BookSourcePart) : ExploreListItem {
        override val key: String = source.bookSourceUrl
    }

    data class KindRow(
        val sourceUrl: String,
        val rowIndex: Int,
        val rowItems: ImmutableList<Pair<ExploreKind, Int>>
    ) : ExploreListItem {
        override val key: String = "${sourceUrl}_$rowIndex"
    }
}

sealed interface ExploreEffect {
    data class ExecuteKindAction(
        val sourceUrl: String,
        val kind: ExploreKind
    ) : ExploreEffect
}
