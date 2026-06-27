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
import java.io.File
import java.io.FileOutputStream
import java.util.zip.ZipOutputStream
import java.util.zip.ZipEntry
import android.os.Build
import io.legado.app.utils.share
import io.legado.app.utils.toastOnUi
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.toRequestBody

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

    var aiBaseUrl: String by prefDelegate("ai_extension_base_url", "https://api.openai.com/v1") { newVal ->
        _uiState.update { it.copy(aiBaseUrl = newVal) }
    }
    var aiApiKey: String by prefDelegate("ai_extension_api_key", "") { newVal ->
        _uiState.update { it.copy(aiApiKey = newVal) }
    }
    var aiSelectedModel: String by prefDelegate("ai_extension_model", "gpt-4o-mini") { newVal ->
        _uiState.update { it.copy(aiSelectedModel = newVal) }
    }

    val aiModelsList = MutableStateFlow<List<String>>(emptyList())
    val isScanningModels = MutableStateFlow(false)
    val scanModelsError = MutableStateFlow<String?>(null)

    private val _uiState = MutableStateFlow(ExploreUiState(
        hideUninstalled = hideUninstalled,
        aiBaseUrl = aiBaseUrl,
        aiApiKey = aiApiKey,
        aiSelectedModel = aiSelectedModel,
        isAiConfigExpanded = aiApiKey.isEmpty()
    ))
    val uiState: StateFlow<ExploreUiState> = _uiState
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), ExploreUiState(hideUninstalled = hideUninstalled, isAiConfigExpanded = aiApiKey.isEmpty()))
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
                    val fullSources = withContext(IO) {
                        appDb.bookSourceDao.all
                    }
                    val searchUrls = fullSources.associate { it.bookSourceUrl to (!it.searchUrl.isNullOrBlank()) }
                    val sourceTypes = fullSources.associate { it.bookSourceUrl to it.bookSourceType }
                    _uiState.update {
                        it.copy(
                            installedBookSourceUrls = urls.toImmutableSet(),
                            installedSearchUrls = searchUrls.toImmutableMap(),
                            installedSourceTypes = sourceTypes.toImmutableMap()
                        )
                    }
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
                    if (url.contains("/hongtrantiende/")) {
                        builder.header("Authorization", "token ${io.legado.app.constant.AppConst.githubToken}")
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
                extensionLoader.ensureDefaultRepository()
                if (ExtensionCache.availableExtensions != null && ExtensionCache.availableExtensions!!.isNotEmpty()) {
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
                                bookSourceGroup = "online_yckceo|${onlineItem.author}|${onlineItem.tags}|${onlineItem.downloads}|${onlineItem.time}",
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
                    val translatedName = if (io.legado.app.utils.TranslateUtils.isTranslateEnabled()) {
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
        val installingIds: ImmutableSet<String> = persistentSetOf(),
        val installedSearchUrls: ImmutableMap<String, Boolean> = persistentMapOf(),
        val installedSourceTypes: ImmutableMap<String, Int> = persistentMapOf(),
        val aiBaseUrl: String = "",
        val aiApiKey: String = "",
        val aiSelectedModel: String = "",
        val isAiConfigExpanded: Boolean = false,
        val generatingSourceUrl: String? = null,
        val isWorkspaceOpen: Boolean = false,
        val generationStep: Int = 0,
        val generationStatus: String = "",
        val isGenerating: Boolean = false,
        val generatedExtName: String? = null,
        val generatedExtSlug: String? = null,
        val customRequirement: String = "",
        val referenceUrl: String = "",
        val step1Files: Map<String, String>? = null,
        val step2File: String? = null,
        val step3Files: Map<String, String>? = null,
        val lastStep1Response: String? = null,
        val lastStep2Response: String? = null,
        val lastStep3Response: String? = null,
        val isStep1Installed: Boolean = false,
        val isStep2Installed: Boolean = false,
        val isStep3Installed: Boolean = false
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

    fun updateAiSettings(baseUrl: String, apiKey: String, model: String) {
        aiBaseUrl = baseUrl
        aiApiKey = apiKey
        aiSelectedModel = model
        _uiState.update {
            it.copy(
                aiBaseUrl = baseUrl,
                aiApiKey = apiKey,
                aiSelectedModel = model
            )
        }
    }

    fun scanModels() {
        val baseUrl = aiBaseUrl.trim()
        val apiKey = aiApiKey.trim()
        
        isScanningModels.value = true
        scanModelsError.value = null
        
        viewModelScope.launch(IO) {
            val client = io.legado.app.help.http.okHttpClient
            val url = if (baseUrl.endsWith("/models") || baseUrl.endsWith("/models/")) {
                baseUrl
            } else {
                baseUrl.trimEnd('/') + "/models"
            }
            
            val requestBuilder = okhttp3.Request.Builder().url(url)
            if (apiKey.isNotEmpty()) {
                requestBuilder.header("Authorization", "Bearer $apiKey")
            }
            
            try {
                client.newCall(requestBuilder.build()).execute().use { response ->
                    if (response.isSuccessful) {
                        val body = response.body?.string() ?: ""
                        parseAndSetModels(body)
                    } else {
                        if (!url.contains("/v1/")) {
                            val fallbackUrl = baseUrl.trimEnd('/') + "/v1/models"
                            val fallbackRequest = okhttp3.Request.Builder().url(fallbackUrl).apply {
                                if (apiKey.isNotEmpty()) {
                                    header("Authorization", "Bearer $apiKey")
                                }
                            }.build()
                            client.newCall(fallbackRequest).execute().use { fbResponse ->
                                if (fbResponse.isSuccessful) {
                                    parseAndSetModels(fbResponse.body?.string() ?: "")
                                } else {
                                    scanModelsError.value = "Lỗi ${fbResponse.code}: ${fbResponse.body?.string()?.take(150)}"
                                    isScanningModels.value = false
                                }
                            }
                        } else {
                            scanModelsError.value = "Lỗi ${response.code}: ${response.body?.string()?.take(150)}"
                            isScanningModels.value = false
                        }
                    }
                }
            } catch (e: Exception) {
                if (!url.contains("/v1/")) {
                    try {
                        val fallbackUrl = baseUrl.trimEnd('/') + "/v1/models"
                        val fallbackRequest = okhttp3.Request.Builder().url(fallbackUrl).apply {
                            if (apiKey.isNotEmpty()) {
                                header("Authorization", "Bearer $apiKey")
                            }
                        }.build()
                        client.newCall(fallbackRequest).execute().use { fbResponse ->
                            if (fbResponse.isSuccessful) {
                                parseAndSetModels(fbResponse.body?.string() ?: "")
                            } else {
                                scanModelsError.value = "Lỗi ${fbResponse.code}: ${fbResponse.body?.string()?.take(150)}"
                                isScanningModels.value = false
                            }
                        }
                    } catch (e2: Exception) {
                        scanModelsError.value = "Lỗi kết nối: ${e2.localizedMessage ?: e.localizedMessage}"
                        isScanningModels.value = false
                    }
                } else {
                    scanModelsError.value = "Lỗi kết nối: ${e.localizedMessage}"
                    isScanningModels.value = false
                }
            }
        }
    }

    private fun parseAndSetModels(body: String) {
        try {
            val list = mutableListOf<String>()
            val jsonObject = org.json.JSONObject(body)
            if (jsonObject.has("data")) {
                val dataArray = jsonObject.getJSONArray("data")
                for (i in 0 until dataArray.length()) {
                    val obj = dataArray.getJSONObject(i)
                    if (obj.has("id")) {
                        list.add(obj.getString("id"))
                    }
                }
            } else if (jsonObject.has("models")) {
                val modelsArray = jsonObject.getJSONArray("models")
                for (i in 0 until modelsArray.length()) {
                    val obj = modelsArray.getJSONObject(i)
                    if (obj.has("id")) {
                        list.add(obj.getString("id"))
                    } else if (obj.has("name")) {
                        list.add(obj.getString("name"))
                    }
                }
            }
            if (list.isEmpty()) {
                try {
                    val jsonArray = org.json.JSONArray(body)
                    for (i in 0 until jsonArray.length()) {
                        val obj = jsonArray.getJSONObject(i)
                        if (obj.has("id")) {
                            list.add(obj.getString("id"))
                        } else if (obj.has("name")) {
                            list.add(obj.getString("name"))
                        }
                    }
                } catch (e: Exception) {
                    // Ignore
                }
            }
            
            if (list.isNotEmpty()) {
                aiModelsList.value = list.sorted()
                if (aiSelectedModel.isEmpty() || !list.contains(aiSelectedModel)) {
                    val defaultModel = list.firstOrNull { it.contains("gpt-4") || it.contains("gemini") || it.contains("deepseek") } ?: list.first()
                    updateAiSettings(aiBaseUrl, aiApiKey, defaultModel)
                }
                scanModelsError.value = null
            } else {
                scanModelsError.value = "Không tìm thấy model nào trong phản hồi."
            }
        } catch (e: Exception) {
            scanModelsError.value = "Lỗi phân tích JSON: ${e.localizedMessage}"
        } finally {
            isScanningModels.value = false
        }
    }

    private suspend fun callOpenAiApi(prompt: String, systemPrompt: String): String = withContext(IO) {
        val client = io.legado.app.help.http.okHttpClient
        val baseUrl = aiBaseUrl.trim()
        val apiKey = aiApiKey.trim()
        val model = aiSelectedModel.trim()
        
        val chatUrl = if (baseUrl.endsWith("/chat/completions") || baseUrl.endsWith("/chat/completions/")) {
            baseUrl
        } else {
            baseUrl.trimEnd('/') + "/chat/completions"
        }
        
        val escapedPrompt = GSON.toJson(prompt)
        val escapedSystemPrompt = GSON.toJson(systemPrompt)
        
        val requestBody = """
            {
              "model": "$model",
              "messages": [
                {
                  "role": "system",
                  "content": $escapedSystemPrompt
                },
                {
                  "role": "user",
                  "content": $escapedPrompt
                }
              ],
              "response_format": { "type": "json_object" }
            }
        """.trimIndent()
        
        val mediaType = "application/json".toMediaType()
        val body = requestBody.toRequestBody(mediaType)
        
        val request = okhttp3.Request.Builder()
            .url(chatUrl)
            .apply {
                if (apiKey.isNotEmpty()) {
                    header("Authorization", "Bearer $apiKey")
                }
            }
            .post(body)
            .build()
            
        client.newCall(request).execute().use { response ->
            val resBody = response.body?.string() ?: ""
            if (!response.isSuccessful) {
                throw Exception("Lỗi API (${response.code}): $resBody")
            }
            
            try {
                val jsonRes = org.json.JSONObject(resBody)
                val choices = jsonRes.getJSONArray("choices")
                val choice = choices.getJSONObject(0)
                val message = choice.getJSONObject("message")
                message.getString("content")
            } catch (e: Exception) {
                throw Exception("Không thể phân tích phản hồi từ AI: ${e.localizedMessage}\nRaw: ${resBody.take(300)}")
            }
        }
    }

    private fun cleanHtml(html: String): String {
        return try {
            val doc = org.jsoup.Jsoup.parse(html)
            doc.select("script").remove()
            doc.select("style").remove()
            doc.select("svg").remove()
            doc.select("head").remove()
            doc.select("link").remove()
            doc.select("iframe").remove()
            var text = doc.body()?.html() ?: html
            if (text.length > 15000) {
                text = text.take(15000) + "... [HTML TRUNCATED]"
            }
            text
        } catch (e: Exception) {
            html.take(12000)
        }
    }

    fun setAiConfigExpanded(expanded: Boolean) {
        _uiState.update { it.copy(isAiConfigExpanded = expanded) }
    }

    fun startGeneration(sourceUrl: String) {
        viewModelScope.launch(IO) {
            val currentState = _uiState.value
            if (currentState.generatingSourceUrl == sourceUrl) {
                _uiState.update { it.copy(isWorkspaceOpen = true) }
                return@launch
            }
            val fullSource = appDb.bookSourceDao.getBookSource(sourceUrl) ?: return@launch
            _uiState.update {
                it.copy(
                    generatingSourceUrl = sourceUrl,
                    isWorkspaceOpen = true,
                    generationStep = 0,
                    generationStatus = "Đã chọn nguồn: ${fullSource.bookSourceName}. Cấu hình AI đã sẵn sàng. Hãy bấm 'Tạo Bước 1 (Menu)' để bắt đầu.",
                    isGenerating = false,
                    generatedExtName = fullSource.bookSourceName,
                    generatedExtSlug = fullSource.bookSourceName.toSlug(),
                    isAiConfigExpanded = false,
                    customRequirement = "",
                    referenceUrl = "",
                    step1Files = null,
                    step2File = null,
                    step3Files = null,
                    lastStep1Response = null,
                    lastStep2Response = null,
                    lastStep3Response = null,
                    isStep1Installed = false,
                    isStep2Installed = false,
                    isStep3Installed = false
                )
            }
        }
    }

    fun cancelGeneration() {
        _uiState.update {
            it.copy(
                isWorkspaceOpen = false
            )
        }
    }

    fun updateCustomRequirement(req: String) {
        _uiState.update { it.copy(customRequirement = req) }
    }

    fun updateReferenceUrl(url: String) {
        _uiState.update { it.copy(referenceUrl = url) }
    }

    fun updateGeneratedExtName(name: String) {
        _uiState.update { it.copy(generatedExtName = name, generatedExtSlug = name.toSlug()) }
    }

    private suspend fun fetchReferenceHtml(url: String): String = withContext(IO) {
        if (url.isBlank()) return@withContext ""
        try {
            val client = io.legado.app.help.http.okHttpClient
            val request = okhttp3.Request.Builder()
                .url(url)
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36")
                .build()
            client.newCall(request).execute().use { response ->
                if (!response.isSuccessful) return@withContext "Không thể tải URL ($url), mã lỗi: ${response.code}"
                val html = response.body?.string() ?: ""
                cleanHtml(html)
            }
        } catch (e: Exception) {
            "Lỗi kết nối tải URL: ${e.localizedMessage ?: e.toString()}"
        }
    }

    fun updateStep1File(fileName: String, content: String) {
        val currentFiles = _uiState.value.step1Files ?: return
        val updated = currentFiles.toMutableMap()
        updated[fileName] = content
        _uiState.update { it.copy(step1Files = updated.toImmutableMap()) }
    }

    fun updateStep2File(content: String) {
        _uiState.update { it.copy(step2File = content) }
    }

    fun updateStep3File(fileName: String, content: String) {
        val currentFiles = _uiState.value.step3Files ?: return
        val updated = currentFiles.toMutableMap()
        updated[fileName] = content
        _uiState.update { it.copy(step3Files = updated.toImmutableMap()) }
    }

    fun generateStep1(isRetry: Boolean = false) {
        val sourceUrl = _uiState.value.generatingSourceUrl ?: return
        val refUrl = _uiState.value.referenceUrl.trim()
        val customReq = _uiState.value.customRequirement.trim()
        val lastResponse = _uiState.value.lastStep1Response

        _uiState.update {
            it.copy(
                isGenerating = true,
                generationStatus = if (isRetry) "Đang gửi yêu cầu tinh chỉnh Bước 1..." else "Đang tải trang explore mẫu để phân tích danh mục..."
            )
        }
        
        viewModelScope.launch(IO) {
            try {
                val source = appDb.bookSourceDao.getBookSource(sourceUrl) ?: throw Exception("Không tìm thấy nguồn sách")
                val exploreUrl = source.exploreUrl?.split("::")?.first()?.split("&&")?.first() ?: source.bookSourceUrl
                
                var htmlRaw = ""
                try {
                    val client = io.legado.app.help.http.okHttpClient
                    val request = okhttp3.Request.Builder()
                        .url(exploreUrl)
                        .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36")
                        .build()
                    client.newCall(request).execute().use { response ->
                        htmlRaw = response.body?.string() ?: ""
                    }
                } catch (e: Exception) {
                    htmlRaw = ""
                }
                
                val cleanedHtml = cleanHtml(htmlRaw)
                val refHtml = if (refUrl.isNotEmpty()) fetchReferenceHtml(refUrl) else ""
                
                _uiState.update { it.copy(generationStatus = "Đang gửi yêu cầu phân tích & sinh danh mục cho AI...") }
                
                val sourceType = if (source.bookSourceType == 2) "comic" else if (source.bookSourceType == 4) "movie" else "novel"
                val systemPrompt = """
                    Bạn là chuyên gia viết VBook Extension (tiện ích cào truyện JS cho ứng dụng VBook đọc sách Android).
                    Nhiệm vụ: Chuyển đổi cấu hình Nguồn Sách Legado sang VBook JS Extension. Đây là BƯỚC 1: tạo menu & danh mục.

                    === RUNTIME API CỦA VBOOK (BẮT BUỘC DÙNG ĐÚNG) ===
                    - fetch(url, options?) → response object
                    - response.ok → boolean
                    - response.html() → Jsoup Document (dùng .select())
                    - response.text() → string
                    - response.json() → object
                    - doc.select(cssSelector) → elements (có .forEach(), .first(), .size(), .map(), .get(i))
                    - element.text() → string
                    - element.attr("name") → string
                    - element.html() → raw HTML string
                    - Response.success(data) hoặc Response.success(data, nextPageMarker)
                    - Response.error(message)
                    - load('filename.js') → load script khác trong src/
                    - Html.parse(text) → parse raw HTML string thành document
                    - Log.log(message) → ghi log debug
                    
                    === CẤU TRÚC THƯ MỤC EXTENSION ===
                    extension/
                    ├── plugin.json
                    └── src/
                        ├── config.js
                        ├── home.js
                        ├── gen.js
                        ├── detail.js (bước 2)
                        ├── toc.js (bước 3)
                        ├── chap.js (bước 3)
                        └── search.js (bước 3)

                    === CÁCH ĐỌC LEGADO exploreUrl ===
                    Legado dùng format: "TênDanhMục::URL\nTênDanhMục2::URL2"
                    hoặc JSON array: [{"title":"...", "url":"..."}]
                    Bạn cần parse ra danh sách {title, url} để tạo home.js.

                    === YÊU CẦU BƯỚC 1 ===
                    Tạo 4 file: plugin.json, config.js, home.js, gen.js

                    1) plugin.json: 
                    {
                      "metadata": {
                        "name": "<tên nguồn>",
                        "author": "Novel Studio AI",
                        "version": 1,
                        "source": "${source.bookSourceUrl.trimEnd('/')}",
                        "description": "Tiện ích tự sinh từ nguồn Legado",
                        "locale": "vi_VN",
                        "type": "$sourceType",
                        "language": "javascript",
                        "encrypt": false
                      },
                      "script": {
                        "home": "home.js",
                        "genre": "genre.js",
                        "detail": "detail.js",
                        "search": "search.js",
                        "toc": "toc.js",
                        "chap": "chap.js"
                      }
                    }

                    2) config.js — MẪU THỰC TẾ:
                    ```
                    let BASE_URL = "${source.bookSourceUrl.trimEnd('/')}";
                    try { if (CONFIG_URL) BASE_URL = CONFIG_URL; } catch(e) {}
                    ```

                    3) home.js — MẪU THỰC TẾ (từ extension Truyện Full đang hoạt động):
                    ```
                    load('config.js');
                    function execute() {
                        return Response.success([
                            {title: "Truyện mới cập nhật", input: BASE_URL + "/danh-sach/truyen-moi/", script: "gen.js"},
                            {title: "Truyện Hot", input: BASE_URL + "/danh-sach/truyen-hot/", script: "gen.js"},
                            {title: "Truyện Full", input: BASE_URL + "/danh-sach/truyen-full/", script: "gen.js"}
                        ]);
                    }
                    ```
                    → Lấy TẤT CẢ danh mục từ exploreUrl của Legado. Mỗi item: {title: "...", input: "URL đầy đủ", script: "gen.js"}

                    4) gen.js — MẪU THỰC TẾ (từ extension Truyện Full đang hoạt động):
                    ```
                    load('config.js');
                    function execute(url, page) {
                        if (!page) page = '1';
                        // Xử lý phân trang tùy theo cấu trúc URL của trang web
                        var fetchUrl = url;
                        if (page !== '1') {
                            // Thêm /trang-N hoặc ?page=N tùy trang web
                            fetchUrl = url.replace(/\/$/, '') + "/trang-" + page;
                        }
                        var response = fetch(fetchUrl, {
                            headers: { "Referer": BASE_URL + "/" }
                        });
                        if (!response.ok) return Response.success([]);
                        var doc = response.html();
                        if (!doc) return Response.success([]);
                        var data = [];
                        // Dùng CSS selector phù hợp với HTML của trang web
                        doc.select("ITEM_SELECTOR").forEach(function(e) {
                            var nameEl = e.select("NAME_SELECTOR").first();
                            var linkEl = e.select("LINK_SELECTOR").first();
                            if (!nameEl || !linkEl) return;
                            var link = linkEl.attr("href") || "";
                            if (link && link.indexOf("http") < 0) link = BASE_URL + link;
                            var coverEl = e.select("IMG_SELECTOR").first();
                            var cover = "";
                            if (coverEl) cover = coverEl.attr("data-src") || coverEl.attr("src") || "";
                            data.push({
                                name: nameEl.text().trim(),
                                link: link,
                                cover: cover,
                                description: "",
                                host: BASE_URL
                            });
                        });
                        if (data.length === 0) return Response.success([]);
                        var next = doc.select(".pagination > li.active + li").first();
                        var nextPage = next ? next.text().trim() : "";
                        return Response.success(data, nextPage);
                    }
                    ```

                    === QUY TẮC CHUYỂN ĐỔI LEGADO RULE → CSS SELECTOR ===
                    - Legado "@css:" → dùng trực tiếp CSS selector, ví dụ: "@css:.book-title" → ".book-title"
                    - Legado "class.xxx" → ".xxx"
                    - Legado "id.xxx" → "#xxx"
                    - Legado "tag.xxx" → "xxx"
                    - Legado "a" → "a"
                    - Legado "@href" → .attr("href")
                    - Legado "@src" → .attr("src")
                    - Legado "@text" → .text()
                    - Legado "ruleExplore.bookList" chứa selector cho mỗi item truyện
                    - Legado "ruleExplore.name" → selector lấy tên truyện trong item
                    - Legado "ruleExplore.bookUrl" → selector lấy URL truyện
                    - Legado "ruleExplore.coverUrl" → selector lấy ảnh bìa
                    - Legado "ruleExplore.intro" → selector lấy mô tả ngắn
                    - Nếu rule bắt đầu bằng "//": đó là XPath, cần chuyển sang CSS selector tương đương
                    - Nếu rule bắt đầu bằng "$." hoặc "$[": đó là JSONPath cho API, dùng response.json() thay vì response.html()
                    - Nếu rule chứa "{{page}}" hoặc "{page}": thay thế bằng biến page trong JS
                    
                    === LƯU Ý QUAN TRỌNG ===
                    - LUÔN dùng function thông thường (function(){}) KHÔNG dùng arrow function (=>) vì Rhino engine không hỗ trợ đầy đủ ES6
                    - LUÔN check null: if (!response.ok), if (!doc), if (!element) trước khi dùng
                    - LUÔN thêm host: BASE_URL trong mỗi item truyện
                    - Link truyện phải là URL tuyệt đối (bắt đầu bằng http). Nếu tương đối, nối với BASE_URL
                    - Nếu trang web Trung Quốc: dùng thêm header Accept-Language: zh-CN
                    - gen.js trả về Response.success(data, nextPage) — nextPage là chuỗi số trang tiếp theo hoặc chuỗi rỗng nếu hết
                    
                    === ĐẦU RA BẮT BUỘC ===
                    Trả về 1 JSON Object duy nhất (KHÔNG bọc markdown, KHÔNG chứa ký tự escape thừa):
                    {
                      "plugin.json": "nội dung plugin.json dạng chuỗi JSON",
                      "config.js": "mã nguồn config.js",
                      "home.js": "mã nguồn home.js",
                      "gen.js": "mã nguồn gen.js"
                    }
                """.trimIndent()
                
                val userPrompt = if (isRetry && lastResponse != null && customReq.isNotEmpty()) {
                    """
                        Nguồn Sách Legado:
                        Tên: ${source.bookSourceName}
                        URL gốc: ${source.bookSourceUrl}
                        Explore URL: ${source.exploreUrl}
                        Explore Rule: ${source.ruleExplore?.let { GSON.toJson(it) } ?: "null"}
                        
                        MÃ NGUỒN ĐÃ TẠO Ở LƯỢT TRƯỚC:
                        $lastResponse
                        
                        YÊU CẦU ĐIỀU CHỈNH CỦA NGƯỜI DÙNG:
                        $customReq
                        
                        ${if (refHtml.isNotEmpty()) "HTML TRANG THAM KHẢO THÊM:\n$refHtml" else ""}
                        
                        Hãy điều chỉnh lại mã nguồn đã tạo ở lượt trước dựa theo yêu cầu trên. Trả về định dạng JSON đúng cấu trúc yêu cầu của Bước 1 (plugin.json, config.js, home.js, gen.js).
                    """.trimIndent()
                } else {
                    """
                        Nguồn Sách Legado:
                        Tên: ${source.bookSourceName}
                        URL gốc: ${source.bookSourceUrl}
                        Explore URL: ${source.exploreUrl}
                        Explore Rule: ${source.ruleExplore?.let { GSON.toJson(it) } ?: "null"}
                        Homepage Modules: ${source.homepageModules ?: "null"}
                        
                        HTML trang explore:
                        $cleanedHtml
                        
                        ${if (refHtml.isNotEmpty()) "HTML TRANG THAM KHẢO THÊM:\n$refHtml" else ""}
                    """.trimIndent()
                }
                
                val aiResponse = callOpenAiApi(userPrompt, systemPrompt)
                
                _uiState.update { it.copy(generationStatus = "AI đã phản hồi. Đang ghi các tệp tin và cài đặt tạm...") }
                
                val cleanedJson = aiResponse.trim()
                    .replace(Regex("^```json"), "")
                    .replace(Regex("^```"), "")
                    .replace(Regex("```$"), "")
                    .trim()
                
                val jsonObj = kotlinx.serialization.json.Json { ignoreUnknownKeys = true }.decodeFromString<kotlinx.serialization.json.JsonObject>(cleanedJson)
                val pluginJsonStr = jsonObj["plugin.json"]?.let {
                    if (it is kotlinx.serialization.json.JsonPrimitive) it.content else it.toString()
                } ?: throw Exception("Không tìm thấy plugin.json trong phản hồi")
                
                val configJs = jsonObj["config.js"]?.let { if (it is kotlinx.serialization.json.JsonPrimitive) it.content else it.toString() } ?: ""
                val homeJs = jsonObj["home.js"]?.let { if (it is kotlinx.serialization.json.JsonPrimitive) it.content else it.toString() } ?: ""
                val genJs = jsonObj["gen.js"]?.let { if (it is kotlinx.serialization.json.JsonPrimitive) it.content else it.toString() } ?: ""
                
                val filesMap = mutableMapOf(
                    "plugin.json" to pluginJsonStr,
                    "config.js" to configJs,
                    "home.js" to homeJs,
                    "gen.js" to genJs
                )
                
                jsonObj.keys.forEach { key ->
                    if (key != "plugin.json" && key != "config.js" && key != "home.js" && key != "gen.js" && key.endsWith(".js")) {
                        val content = jsonObj[key]?.let { if (it is kotlinx.serialization.json.JsonPrimitive) it.content else it.toString() } ?: ""
                        filesMap[key] = content
                    }
                }
                
                _uiState.update {
                    it.copy(
                        isGenerating = false,
                        generationStep = 1,
                        step1Files = filesMap,
                        lastStep1Response = aiResponse,
                        isStep1Installed = false,
                        generationStatus = "Đã sinh Bước 1 thành công!\nMã nguồn đã được lưu tạm trong bộ nhớ.\n\nHãy bấm nút 'Cài test thử' bên dưới để ghi file và cài đặt thử nghiệm.\nBạn cũng có thể nhập yêu cầu sửa đổi bên dưới và bấm 'Thử lại' nếu chưa ưng ý."
                    )
                }
            } catch (e: Exception) {
                e.printStackTrace()
                _uiState.update {
                    it.copy(
                        isGenerating = false,
                        generationStatus = "Lỗi Bước 1: ${e.localizedMessage}"
                    )
                }
            }
        }
    }

    fun generateStep2(isRetry: Boolean = false) {
        val sourceUrl = _uiState.value.generatingSourceUrl ?: return
        val refUrl = _uiState.value.referenceUrl.trim()
        val customReq = _uiState.value.customRequirement.trim()
        val lastResponse = _uiState.value.lastStep2Response

        _uiState.update {
            it.copy(
                isGenerating = true,
                generationStatus = if (isRetry) "Đang gửi yêu cầu tinh chỉnh Bước 2..." else "Đang gửi yêu cầu sinh chi tiết truyện (detail.js) cho AI..."
            )
        }
        
        viewModelScope.launch(IO) {
            try {
                val source = appDb.bookSourceDao.getBookSource(sourceUrl) ?: throw Exception("Không tìm thấy nguồn sách")
                val refHtml = if (refUrl.isNotEmpty()) fetchReferenceHtml(refUrl) else ""
                
                _uiState.update { it.copy(generationStatus = "Đang gửi yêu cầu cho AI...") }
                
                val sourceType = if (source.bookSourceType == 2) "comic" else if (source.bookSourceType == 4) "movie" else "novel"
                val systemPrompt = """
                    Bạn là chuyên gia viết VBook Extension. Nhiệm vụ: tạo detail.js (BƯỚC 2).
                    
                    === RUNTIME API ===
                    - fetch(url, options?) → response (response.ok, response.html(), response.text(), response.json())
                    - doc.select(cssSelector) → elements (.first(), .forEach(), .text(), .attr("name"), .html(), .size())
                    - Response.success(data), Response.error(message)
                    - load('config.js') — nạp BASE_URL
                    - Html.parse(text) → parse raw HTML
                    
                    === MẪU THỰC TẾ detail.js (từ extension Truyện Full ĐANG HOẠT ĐỘNG) ===
                    ```
                    load('config.js');
                    function execute(url) {
                        url = url.replace(/^(?:https?:\/\/)?(?:[^@\n]+@)?(?:www\.)?([^:\/\n?]+)/img, BASE_URL);
                        var response = fetch(url, {
                            headers: { "Referer": BASE_URL + "/" }
                        });
                        if (!response.ok) return Response.error("Không thể tải trang chi tiết");
                        var doc = response.html();
                        if (!doc) return Response.error("Không thể parse HTML");
                        
                        var nameEl = doc.select("h3.title, h1.title, h1").first();
                        var name = nameEl ? nameEl.text().trim() : "";
                        
                        var coverEl = doc.select("div.book img, .cover img").first();
                        var cover = "";
                        if (coverEl) cover = coverEl.attr("data-src") || coverEl.attr("src") || "";
                        
                        var authorEl = doc.select("a[itemprop=author], .author a").first();
                        var author = authorEl ? authorEl.text().trim() : "Chưa rõ";
                        
                        var descEl = doc.select("div.desc-text, .description, .intro").first();
                        var description = descEl ? descEl.html() : "";
                        
                        var infoHtml = doc.select("div.info, .book-info").first();
                        var ongoing = true;
                        if (infoHtml) {
                            var infoText = infoHtml.html();
                            ongoing = infoText.indexOf("Đang ra") > 0 || infoText.indexOf("连载") > 0;
                        }
                        
                        var genres = [];
                        doc.select(".info a[itemprop=genre], .genre a, .tag a").forEach(function(e) {
                            genres.push({
                                title: e.text().trim(),
                                input: e.attr("href") || "",
                                script: "gen.js"
                            });
                        });
                        
                        return Response.success({
                            name: name,
                            cover: cover,
                            author: author,
                            description: description,
                            detail: "",
                            ongoing: ongoing,
                            genres: genres,
                            host: BASE_URL
                        });
                    }
                    ```

                    === CẤU TRÚC OBJECT TRẢ VỀ (BẮT BUỘC) ===
                    Response.success({
                        name: "Tên truyện",              // BẮT BUỘC - string
                        cover: "URL ảnh bìa",            // string, có thể rỗng
                        author: "Tên tác giả",           // string, mặc định "Chưa rõ"
                        description: "Mô tả/giới thiệu", // string hoặc HTML
                        detail: "Thông tin phụ",          // string, có thể chứa <br>
                        ongoing: true/false,              // boolean
                        genres: [{title, input, script:"gen.js"}],
                        host: BASE_URL                    // BẮT BUỘC
                    })

                    === QUY TẮC CHUYỂN ĐỔI LEGADO ruleBookInfo → detail.js ===
                    - ruleBookInfo.name → selector lấy tên truyện
                    - ruleBookInfo.coverUrl → selector lấy ảnh bìa (chú ý @src, data-src)
                    - ruleBookInfo.author → selector lấy tác giả
                    - ruleBookInfo.intro → selector lấy giới thiệu
                    - ruleBookInfo.kind → selector lấy thể loại
                    - Legado "@css:" → CSS selector trực tiếp
                    - Legado "@text" → .text(), "@href" → .attr("href"), "@src" → .attr("src")
                    - Legado "##regex" → .replace(regex, "") để loại bỏ text
                    - Nếu rule bắt đầu bằng "//": XPath, chuyển sang CSS selector
                    - Nếu rule bắt đầu bằng "$.": JSONPath, dùng response.json()
                    
                    === LƯU Ý ===
                    - DÙNG function(){} KHÔNG dùng arrow function =>
                    - LUÔN check null trước khi .text() hoặc .attr()
                    - URL ảnh: thử data-src, data-original, src theo thứ tự
                    - URL tương đối → nối với BASE_URL
                    - Loại truyện: "$sourceType"
                    
                    === ĐẦU RA BẮT BUỘC ===
                    JSON Object (KHÔNG bọc markdown):
                    {
                      "detail.js": "mã nguồn detail.js hoàn chỉnh"
                    }
                """.trimIndent()
                
                val userPrompt = if (isRetry && lastResponse != null && customReq.isNotEmpty()) {
                    """
                        Nguồn Sách Legado:
                        Tên: ${source.bookSourceName}
                        URL gốc: ${source.bookSourceUrl}
                        Quy tắc chi tiết truyện (ruleBookInfo): ${source.ruleBookInfo?.let { GSON.toJson(it) } ?: "null"}
                        
                        MÃ NGUỒN detail.js ĐÃ TẠO Ở LƯỢT TRƯỚC:
                        $lastResponse
                        
                        YÊU CẦU ĐIỀU CHỈNH CỦA NGƯỜI DÙNG:
                        $customReq
                        
                        ${if (refHtml.isNotEmpty()) "HTML TRANG CHI TIẾT TRUYỆN MẪU THAM KHẢO:\n$refHtml" else ""}
                        
                        Hãy điều chỉnh lại mã nguồn detail.js đã tạo ở lượt trước dựa theo yêu cầu trên. Trả về định dạng JSON đúng cấu trúc yêu cầu của Bước 2.
                    """.trimIndent()
                } else {
                    """
                        Nguồn Sách Legado:
                        Tên: ${source.bookSourceName}
                        URL gốc: ${source.bookSourceUrl}
                        Quy tắc chi tiết truyện (ruleBookInfo): ${source.ruleBookInfo?.let { GSON.toJson(it) } ?: "null"}
                        
                        ${if (refHtml.isNotEmpty()) "HTML TRANG CHI TIẾT TRUYỆN MẪU THAM KHẢO:\n$refHtml" else ""}
                    """.trimIndent()
                }
                
                val aiResponse = callOpenAiApi(userPrompt, systemPrompt)
                
                _uiState.update { it.copy(generationStatus = "AI đã phản hồi. Đang lưu kết quả tạm...") }
                
                val cleanedJson = aiResponse.trim()
                    .replace(Regex("^```json"), "")
                    .replace(Regex("^```"), "")
                    .replace(Regex("```$"), "")
                    .trim()
                
                val jsonObj = kotlinx.serialization.json.Json { ignoreUnknownKeys = true }.decodeFromString<kotlinx.serialization.json.JsonObject>(cleanedJson)
                val detailJs = jsonObj["detail.js"]?.let { if (it is kotlinx.serialization.json.JsonPrimitive) it.content else it.toString() } ?: throw Exception("Không tìm thấy detail.js")
                
                _uiState.update {
                    it.copy(
                        isGenerating = false,
                        generationStep = 2,
                        step2File = detailJs,
                        lastStep2Response = aiResponse,
                        isStep2Installed = false,
                        generationStatus = "Đã sinh Bước 2 (detail.js) thành công!\nMã nguồn đã được lưu tạm trong bộ nhớ.\n\nHãy bấm nút 'Thêm vào' để ghi file.\nBạn cũng có thể nhập yêu cầu sửa đổi bên dưới và bấm 'Thử lại' nếu chưa ưng ý."
                    )
                }
            } catch (e: Exception) {
                e.printStackTrace()
                _uiState.update {
                    it.copy(
                        isGenerating = false,
                        generationStatus = "Lỗi Bước 2: ${e.localizedMessage}"
                    )
                }
            }
        }
    }

    fun generateStep3(isRetry: Boolean = false) {
        val sourceUrl = _uiState.value.generatingSourceUrl ?: return
        val refUrl = _uiState.value.referenceUrl.trim()
        val customReq = _uiState.value.customRequirement.trim()
        val lastResponse = _uiState.value.lastStep3Response

        _uiState.update {
            it.copy(
                isGenerating = true,
                generationStatus = if (isRetry) "Đang gửi yêu cầu tinh chỉnh Bước 3..." else "Đang gửi yêu cầu sinh mục lục & nội dung chương (toc.js, chap.js, search.js) cho AI..."
            )
        }
        
        viewModelScope.launch(IO) {
            try {
                val source = appDb.bookSourceDao.getBookSource(sourceUrl) ?: throw Exception("Không tìm thấy nguồn sách")
                val refHtml = if (refUrl.isNotEmpty()) fetchReferenceHtml(refUrl) else ""
                
                _uiState.update { it.copy(generationStatus = "Đang gửi yêu cầu cho AI...") }
                
                val sourceType = if (source.bookSourceType == 2) "comic" else if (source.bookSourceType == 4) "movie" else "novel"
                val systemPrompt = """
                    Bạn là chuyên gia viết VBook Extension. Nhiệm vụ: tạo toc.js, chap.js, search.js (BƯỚC 3).
                    
                    === RUNTIME API ===
                    - fetch(url, options?) → response (response.ok, response.html(), response.text(), response.json())
                    - doc.select(cssSelector) → elements (.first(), .forEach(), .text(), .attr("name"), .html(), .size(), .get(i), .map())
                    - Response.success(data), Response.success(data, nextPage), Response.error(message)
                    - load('config.js') — nạp BASE_URL
                    - Html.parse(text) → parse raw HTML string thành document
                    
                    === 1) toc.js — MẪU THỰC TẾ (từ extension Truyện Full) ===
                    Hàm execute(url) trả về Response.success([{name, url, host}])
                    ```
                    load('config.js');
                    function execute(url) {
                        url = url.replace(/^(?:https?:\/\/)?(?:[^@\n]+@)?(?:www\.)?([^:\/\n?]+)/img, BASE_URL);
                        var response = fetch(url, {
                            headers: { "Referer": BASE_URL + "/" }
                        });
                        if (!response.ok) return Response.success([]);
                        var doc = response.html();
                        if (!doc) return Response.success([]);
                        var list = [];
                        // Duyệt tất cả link chương
                        doc.select("TOC_ITEM_SELECTOR a").forEach(function(a) {
                            var chapUrl = a.attr("href") || "";
                            var chapName = a.text().trim() || a.attr("title") || "";
                            if (!chapUrl || !chapName) return;
                            if (chapUrl.indexOf("http") < 0) chapUrl = BASE_URL + chapUrl;
                            list.push({
                                name: chapName,
                                url: chapUrl,
                                host: BASE_URL
                            });
                        });
                        return Response.success(list);
                    }
                    ```
                    LƯU Ý toc.js:
                    - Mỗi item: {name: "Tên chương", url: "URL chương (tuyệt đối)", host: BASE_URL}
                    - Nếu có phân trang mục lục: tải tất cả trang và gộp lại
                    - URL chương PHẢI là tuyệt đối (bắt đầu bằng http)
                    - Nếu có section/volume: thêm {name: "Tên volume", type: "section"} trước các chương của volume đó

                    === 2) chap.js — MẪU THỰC TẾ ===
                    Hàm execute(url) trả về Response.success("HTML content string")
                    ```
                    load('config.js');
                    function execute(url) {
                        url = url.replace(/^(?:https?:\/\/)?(?:[^@\n]+@)?(?:www\.)?([^:\/\n?]+)/img, BASE_URL);
                        var response = fetch(url, {
                            headers: { "Referer": BASE_URL + "/" }
                        });
                        if (!response.ok) return Response.error("Không thể tải nội dung chương");
                        var doc = response.html();
                        if (!doc) return Response.error("Không thể parse HTML");
                        
                        // Lấy tiêu đề chương
                        var titleEl = doc.select("CHAPTER_TITLE_SELECTOR, h1, h2").first();
                        var title = titleEl ? titleEl.text().trim() : "";
                        
                        // Lấy nội dung chương - QUAN TRỌNG: dùng .html() để giữ định dạng
                        var contentEl = doc.select("CONTENT_SELECTOR").first();
                        if (!contentEl) return Response.error("Không tìm thấy nội dung chương");
                        
                        // Xóa quảng cáo và rác trong nội dung
                        contentEl.select("script, style, ins, .ads, .ad, iframe, .quangcao").remove();
                        
                        var content = contentEl.html();
                        // Dọn dẹp HTML: loại bỏ link quảng cáo, giữ <p>, <br>
                        content = content
                            .replace(/<a[^>]*>.*?<\/a>/gi, '')
                            .replace(/<div[^>]*class="[^"]*ads[^"]*"[^>]*>.*?<\/div>/gi, '')
                            .trim();
                        
                        if (!content || content.length < 20) return Response.error("Nội dung chương rỗng");
                        
                        var result = "";
                        if (title) result += "<h2>" + title + "</h2>\n";
                        result += content;
                        return Response.success(result);
                    }
                    ```
                    LƯU Ý chap.js:
                    - Trả về chuỗi HTML (KHÔNG phải object)
                    - Giữ lại <p>, <br>, <h2> cho format
                    - Loại bỏ script, style, quảng cáo, link spam
                    - Nếu truyện tranh (comic): trả về danh sách ảnh dạng <img src="..."> hoặc dùng page.js
                    - Nếu nội dung chứa ký tự bị kiểm duyệt (ch*t, gi*t...): tự động thay thế về từ gốc

                    === 3) search.js — MẪU THỰC TẾ ===
                    Hàm execute(keyword, page) trả về Response.success([{name, link, cover, description, host}])
                    ```
                    load('config.js');
                    function execute(key, page) {
                        if (!page) page = '1';
                        // Tùy trang web: dùng GET query hoặc POST
                        var searchUrl = BASE_URL + "/tim-kiem/?keyword=" + encodeURIComponent(key);
                        if (page !== '1') searchUrl += "&page=" + page;
                        
                        var response = fetch(searchUrl, {
                            headers: { "Referer": BASE_URL + "/" }
                        });
                        if (!response.ok) return Response.success([]);
                        var doc = response.html();
                        if (!doc) return Response.success([]);
                        
                        var data = [];
                        doc.select("SEARCH_ITEM_SELECTOR").forEach(function(e) {
                            var nameEl = e.select("NAME_SELECTOR").first();
                            var linkEl = e.select("LINK_SELECTOR").first();
                            if (!nameEl || !linkEl) return;
                            var link = linkEl.attr("href") || "";
                            if (link && link.indexOf("http") < 0) link = BASE_URL + link;
                            var coverEl = e.select("img").first();
                            var cover = "";
                            if (coverEl) cover = coverEl.attr("data-src") || coverEl.attr("src") || "";
                            data.push({
                                name: nameEl.text().trim(),
                                link: link,
                                cover: cover,
                                description: "",
                                host: BASE_URL
                            });
                        });
                        return Response.success(data);
                    }
                    ```

                    === QUY TẮC CHUYỂN ĐỔI LEGADO → CSS SELECTOR ===
                    - ruleToc.chapterList → selector cho danh sách chương
                    - ruleToc.chapterName → selector tên chương
                    - ruleToc.chapterUrl → selector URL chương
                    - ruleContent.content → selector nội dung chương
                    - ruleSearch.bookList → selector danh sách kết quả
                    - ruleSearch.name → selector tên truyện
                    - ruleSearch.bookUrl → selector URL truyện
                    - ruleSearch.coverUrl → selector ảnh bìa
                    - ruleSearch.searchUrl chứa URL search (có thể chứa {{key}} và {{page}})
                    - Legado "@css:" → CSS selector trực tiếp
                    - Legado "@text" → .text(), "@href" → .attr("href")
                    - Legado "//": XPath → chuyển CSS selector
                    - Legado "$.": JSONPath → dùng response.json()
                    
                    === LƯU Ý QUAN TRỌNG ===
                    - DÙNG function(){} KHÔNG dùng arrow function =>
                    - LUÔN check null: if (!response.ok), if (!doc), if (!element)
                    - URL PHẢI tuyệt đối (bắt đầu bằng http)
                    - host: BASE_URL bắt buộc trong mỗi item
                    - Loại truyện: "$sourceType"
                    
                    === ĐẦU RA BẮT BUỘC ===
                    JSON Object (KHÔNG bọc markdown):
                    {
                      "toc.js": "mã nguồn toc.js",
                      "chap.js": "mã nguồn chap.js",
                      "search.js": "mã nguồn search.js"
                    }
                """.trimIndent()
                
                val userPrompt = if (isRetry && lastResponse != null && customReq.isNotEmpty()) {
                    """
                        Nguồn Sách Legado:
                        Tên: ${source.bookSourceName}
                        URL gốc: ${source.bookSourceUrl}
                        Quy tắc Mục lục (ruleToc): ${source.ruleToc?.let { GSON.toJson(it) } ?: "null"}
                        Quy tắc Nội dung (ruleContent): ${source.ruleContent?.let { GSON.toJson(it) } ?: "null"}
                        Quy tắc Tìm kiếm (ruleSearch): ${source.ruleSearch?.let { GSON.toJson(it) } ?: "null"}
                        
                        MÃ NGUỒN toc.js, chap.js, search.js ĐÃ TẠO Ở LƯỢT TRƯỚC:
                        $lastResponse
                        
                        YÊU CẦU ĐIỀU CHỈNH CỦA NGƯỜI DÙNG:
                        $customReq
                        
                        ${if (refHtml.isNotEmpty()) "HTML TRANG THAM KHẢO THÊM (TRANG MỤC LỤC/NỘI DUNG CHƯƠNG):\n$refHtml" else ""}
                        
                        Hãy điều chỉnh lại mã nguồn đã tạo ở lượt trước dựa theo yêu cầu trên. Trả về định dạng JSON đúng cấu trúc yêu cầu của Bước 3 (toc.js, chap.js, search.js).
                    """.trimIndent()
                } else {
                    """
                        Nguồn Sách Legado:
                        Tên: ${source.bookSourceName}
                        URL gốc: ${source.bookSourceUrl}
                        Quy tắc Mục lục (ruleToc): ${source.ruleToc?.let { GSON.toJson(it) } ?: "null"}
                        Quy tắc Nội dung (ruleContent): ${source.ruleContent?.let { GSON.toJson(it) } ?: "null"}
                        Quy tắc Tìm kiếm (ruleSearch): ${source.ruleSearch?.let { GSON.toJson(it) } ?: "null"}
                        
                        ${if (refHtml.isNotEmpty()) "HTML TRANG THAM KHẢO THÊM (TRANG MỤC LỤC/NỘI DUNG CHƯƠNG):\n$refHtml" else ""}
                    """.trimIndent()
                }
                
                val aiResponse = callOpenAiApi(userPrompt, systemPrompt)
                
                _uiState.update { it.copy(generationStatus = "AI đã phản hồi. Đang phân tích kết quả...") }
                
                val cleanedJson = aiResponse.trim()
                    .replace(Regex("^```json"), "")
                    .replace(Regex("^```"), "")
                    .replace(Regex("```$"), "")
                    .trim()
                
                val jsonObj = kotlinx.serialization.json.Json { ignoreUnknownKeys = true }.decodeFromString<kotlinx.serialization.json.JsonObject>(cleanedJson)
                val tocJs = jsonObj["toc.js"]?.let { if (it is kotlinx.serialization.json.JsonPrimitive) it.content else it.toString() } ?: throw Exception("Không tìm thấy toc.js")
                val chapJs = jsonObj["chap.js"]?.let { if (it is kotlinx.serialization.json.JsonPrimitive) it.content else it.toString() } ?: throw Exception("Không tìm thấy chap.js")
                val searchJs = jsonObj["search.js"]?.let { if (it is kotlinx.serialization.json.JsonPrimitive) it.content else it.toString() } ?: throw Exception("Không tìm thấy search.js")
                
                val filesMap = mapOf(
                    "toc.js" to tocJs,
                    "chap.js" to chapJs,
                    "search.js" to searchJs
                )
                
                _uiState.update {
                    it.copy(
                        isGenerating = false,
                        generationStep = 3,
                        step3Files = filesMap,
                        lastStep3Response = aiResponse,
                        isStep3Installed = false,
                        generationStatus = "Đã sinh Bước 3 (toc.js, chap.js, search.js) thành công!\nMã nguồn đã được lưu tạm trong bộ nhớ.\n\nHãy bấm nút 'Thêm vào' để ghi file hoàn thiện extension.\nBạn cũng có thể nhập yêu cầu sửa đổi bên dưới và bấm 'Thử lại' nếu chưa ưng ý."
                    )
                }
            } catch (e: Exception) {
                e.printStackTrace()
                _uiState.update {
                    it.copy(
                        isGenerating = false,
                        generationStatus = "Lỗi Bước 3: ${e.localizedMessage}"
                    )
                }
            }
        }
    }

    fun installStep1() {
        val sourceUrl = _uiState.value.generatingSourceUrl ?: return
        val files = _uiState.value.step1Files ?: return
        val extName = _uiState.value.generatedExtName ?: return
        val extSlug = _uiState.value.generatedExtSlug ?: extName.toSlug()
        
        _uiState.update {
            it.copy(
                isGenerating = true,
                generationStatus = "Đang thực hiện cài đặt extension Bước 1..."
            )
        }
        
        viewModelScope.launch(IO) {
            try {
                val source = appDb.bookSourceDao.getBookSource(sourceUrl) ?: throw Exception("Không tìm thấy nguồn sách")
                val extDir = File(getApplication<Application>().filesDir, "extensions/$extSlug")
                extDir.deleteRecursively()
                extDir.mkdirs()
                val srcDir = File(extDir, "src")
                srcDir.mkdirs()
                
                files.forEach { (name, content) ->
                    if (name == "plugin.json") {
                        File(extDir, name).writeText(content)
                    } else {
                        File(srcDir, name).writeText(content)
                    }
                }
                
                val extEntity = ExtensionEntity(
                    id = extSlug,
                    name = extName,
                    author = "Novel Studio AI",
                    version = 1,
                    source = source.bookSourceUrl,
                    type = if (source.bookSourceType == 2) "comic" else if (source.bookSourceType == 4) "movie" else "novel",
                    locale = "vi_VN",
                    description = "Tiện ích tạo tự động bằng AI từ nguồn ${source.bookSourceName}",
                    localPath = extDir.absolutePath,
                    iconPath = null,
                    isInstalled = true,
                    isEnabled = true
                )
                
                extensionDao.insert(extEntity)
                extensionLoader.clearCache(extSlug)
                
                _uiState.update {
                    it.copy(
                        isGenerating = false,
                        isStep1Installed = true,
                        generationStatus = "Đã cài đặt thử nghiệm Bước 1 thành công cho extension '$extName'!\n\nBạn có thể kiểm tra danh mục trên tab 'Nguồn Extension'.\nHãy tiếp tục tạo Bước 2 (Chi tiết) hoặc sửa lại nếu cần."
                    )
                }
            } catch (e: Exception) {
                e.printStackTrace()
                _uiState.update {
                    it.copy(
                        isGenerating = false,
                        generationStatus = "Lỗi cài đặt Bước 1: ${e.localizedMessage}"
                    )
                }
            }
        }
    }

    fun installStep2() {
        val sourceUrl = _uiState.value.generatingSourceUrl ?: return
        val detailJs = _uiState.value.step2File ?: return
        val extName = _uiState.value.generatedExtName ?: return
        val extSlug = _uiState.value.generatedExtSlug ?: extName.toSlug()
        
        _uiState.update {
            it.copy(
                isGenerating = true,
                generationStatus = "Đang ghi đè chi tiết (detail.js)..."
            )
        }
        
        viewModelScope.launch(IO) {
            try {
                val extDir = File(getApplication<Application>().filesDir, "extensions/$extSlug")
                val srcDir = File(extDir, "src")
                if (!srcDir.exists()) srcDir.mkdirs()
                
                File(srcDir, "detail.js").writeText(detailJs)
                extensionLoader.clearCache(extSlug)
                
                _uiState.update {
                    it.copy(
                        isGenerating = false,
                        isStep2Installed = true,
                        generationStatus = "Đã thêm file detail.js thành công vào extension '$extName'!\n\nHãy mở extension lên và thử bấm vào một truyện để kiểm tra.\nSau đó tiếp tục tạo Bước 3 (Chương) hoặc sửa lại nếu cần."
                    )
                }
            } catch (e: Exception) {
                e.printStackTrace()
                _uiState.update {
                    it.copy(
                        isGenerating = false,
                        generationStatus = "Lỗi thêm detail.js: ${e.localizedMessage}"
                    )
                }
            }
        }
    }

    fun installStep3() {
        val sourceUrl = _uiState.value.generatingSourceUrl ?: return
        val files = _uiState.value.step3Files ?: return
        val extName = _uiState.value.generatedExtName ?: return
        val extSlug = _uiState.value.generatedExtSlug ?: extName.toSlug()
        
        _uiState.update {
            it.copy(
                isGenerating = true,
                generationStatus = "Đang ghi các tệp tin hoàn tất..."
            )
        }
        
        viewModelScope.launch(IO) {
            try {
                val extDir = File(getApplication<Application>().filesDir, "extensions/$extSlug")
                val srcDir = File(extDir, "src")
                if (!srcDir.exists()) srcDir.mkdirs()
                
                files.forEach { (name, content) ->
                    File(srcDir, name).writeText(content)
                }
                extensionLoader.clearCache(extSlug)
                
                _uiState.update {
                    it.copy(
                        isGenerating = false,
                        isStep3Installed = true,
                        generationStatus = "Đã thêm hoàn tất các file Bước 3 thành công cho extension '$extName'!\n\nTính năng đã hoàn tất! Hãy mở extension ra, thử tải danh mục chương, đọc nội dung chương truyện hoặc dùng tính năng Tìm kiếm để kiểm tra toàn diện."
                    )
                }
            } catch (e: Exception) {
                e.printStackTrace()
                _uiState.update {
                    it.copy(
                        isGenerating = false,
                        generationStatus = "Lỗi hoàn tất: ${e.localizedMessage}"
                    )
                }
            }
        }
    }

    fun exportExtensionZip(context: Context) {
        val currentState = _uiState.value
        val extName = currentState.generatedExtName ?: return
        val extSlug = currentState.generatedExtSlug ?: extName.toSlug()
        
        viewModelScope.launch(IO) {
            try {
                val zipFile = File(context.externalCacheDir ?: context.cacheDir, "$extSlug.zip")
                if (zipFile.exists()) zipFile.delete()
                
                ZipOutputStream(FileOutputStream(zipFile)).use { zos ->
                    // 1. plugin.json
                    val pluginJsonContent = currentState.step1Files?.get("plugin.json")
                    if (pluginJsonContent != null) {
                        zos.putNextEntry(ZipEntry("plugin.json"))
                        zos.write(pluginJsonContent.toByteArray())
                        zos.closeEntry()
                    }
                    
                    // 2. icon.png
                    val extDir = File(getApplication<Application>().filesDir, "extensions/$extSlug")
                    val localIcon = File(extDir, "icon.png")
                    val iconBytes = if (localIcon.exists()) {
                        localIcon.readBytes()
                    } else {
                        try {
                            val drawable = androidx.core.content.ContextCompat.getDrawable(context, io.legado.app.R.mipmap.ic_launcher)
                            val bitmap = if (drawable is android.graphics.drawable.BitmapDrawable) {
                                drawable.bitmap
                            } else {
                                val bmp = android.graphics.Bitmap.createBitmap(drawable?.intrinsicWidth ?: 100, drawable?.intrinsicHeight ?: 100, android.graphics.Bitmap.Config.ARGB_8888)
                                val canvas = android.graphics.Canvas(bmp)
                                drawable?.setBounds(0, 0, canvas.width, canvas.height)
                                drawable?.draw(canvas)
                                bmp
                            }
                            val stream = java.io.ByteArrayOutputStream()
                            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, stream)
                            stream.toByteArray()
                        } catch (e: Exception) {
                            null
                        }
                    }
                    if (iconBytes != null) {
                        zos.putNextEntry(ZipEntry("icon.png"))
                        zos.write(iconBytes)
                        zos.closeEntry()
                    }
                    
                    // 3. src/ config.js, home.js, gen.js, detail.js, toc.js, chap.js, search.js etc.
                    currentState.step1Files?.forEach { (name, content) ->
                        if (name != "plugin.json") {
                            zos.putNextEntry(ZipEntry("src/$name"))
                            zos.write(content.toByteArray())
                            zos.closeEntry()
                        }
                    }
                    
                    currentState.step2File?.let { content ->
                        zos.putNextEntry(ZipEntry("src/detail.js"))
                        zos.write(content.toByteArray())
                        zos.closeEntry()
                    }
                    
                    currentState.step3Files?.forEach { (name, content) ->
                        zos.putNextEntry(ZipEntry("src/$name"))
                        zos.write(content.toByteArray())
                        zos.closeEntry()
                    }
                }
                
                // Copy to public Downloads directory
                try {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        val resolver = context.contentResolver
                        val contentValues = android.content.ContentValues().apply {
                            put(android.provider.MediaStore.MediaColumns.DISPLAY_NAME, "$extSlug.zip")
                            put(android.provider.MediaStore.MediaColumns.MIME_TYPE, "application/zip")
                            put(android.provider.MediaStore.MediaColumns.RELATIVE_PATH, android.os.Environment.DIRECTORY_DOWNLOADS)
                        }
                        val uri = resolver.insert(android.provider.MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues)
                        if (uri != null) {
                            resolver.openOutputStream(uri)?.use { out ->
                                zipFile.inputStream().use { input ->
                                    input.copyTo(out)
                                }
                            }
                        }
                    } else {
                        val downloadsDir = android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOWNLOADS)
                        if (!downloadsDir.exists()) downloadsDir.mkdirs()
                        val destFile = File(downloadsDir, "$extSlug.zip")
                        zipFile.copyTo(destFile, overwrite = true)
                    }
                    withContext(kotlinx.coroutines.Dispatchers.Main) {
                        context.toastOnUi("Đã xuất ZIP và lưu vào mục Tải xuống (Downloads)!")
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
                
                // Trigger sharing sheet
                withContext(kotlinx.coroutines.Dispatchers.Main) {
                    context.share(zipFile, "application/zip")
                }
                
            } catch (e: Exception) {
                e.printStackTrace()
                withContext(kotlinx.coroutines.Dispatchers.Main) {
                    context.toastOnUi("Lỗi xuất file ZIP: ${e.localizedMessage}")
                }
            }
        }
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
