package io.legado.app.ui.main.explore

import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Login
import androidx.compose.material.icons.automirrored.outlined.Label
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.Translate
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Group
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Save
import androidx.compose.material.icons.filled.VerticalAlignTop
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import io.legado.app.R
import io.legado.app.data.entities.BookSourcePart
import io.legado.app.domain.usecase.ExploreKindUiUseCase
import io.legado.app.ui.widget.components.image.sourceIcon.SourceIcon
import io.legado.app.help.source.getExploreInfoMap
import io.legado.app.ui.book.search.SearchActivity
import io.legado.app.ui.book.search.SearchScope
import io.legado.app.ui.book.source.edit.BookSourceEditActivity
import io.legado.app.ui.login.SourceLoginActivity
import io.legado.app.ui.theme.LegadoTheme
import io.legado.app.ui.theme.LegadoTheme.composeEngine
import io.legado.app.ui.theme.ThemeResolver
import io.legado.app.ui.theme.adaptiveContentPadding
import io.legado.app.ui.widget.components.EmptyMessage
import io.legado.app.ui.widget.components.alert.AppAlertDialog
import io.legado.app.ui.widget.components.card.GlassCard
import io.legado.app.ui.widget.components.card.TextCard
import io.legado.app.ui.widget.components.divider.PillHeaderDivider
import io.legado.app.ui.widget.components.explore.ExploreKindMultiTypeItem
import io.legado.app.ui.widget.components.lazylist.FastScrollLazyColumn
import io.legado.app.ui.widget.components.list.ListScaffold
import io.legado.app.ui.widget.components.list.TopFloatingStickyItem
import io.legado.app.ui.widget.components.menuItem.MenuItemIcon
import io.legado.app.ui.widget.components.menuItem.RoundDropdownMenu
import io.legado.app.ui.widget.components.menuItem.RoundDropdownMenuItem
import io.legado.app.ui.widget.components.progressIndicator.AppContainedLoadingIndicator
import io.legado.app.ui.widget.components.text.AppText
import io.legado.app.ui.widget.components.tabRow.AppTabRow
import io.legado.app.utils.startActivity
import kotlinx.coroutines.launch
import org.koin.androidx.compose.koinViewModel
import org.koin.compose.koinInject
import top.yukonga.miuix.kmp.theme.MiuixTheme

import io.legado.app.ui.association.ImportBookSourceDialog
import io.legado.app.utils.showDialogFragment
import androidx.compose.material3.RadioButton
import io.legado.app.ui.config.translation.TranslationConfig
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.Switch
import androidx.compose.material3.Surface
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.material3.OutlinedTextField
import io.legado.app.ui.widget.components.progressIndicator.AppCircularProgressIndicator
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.IconButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.foundation.background
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Wifi
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.icons.filled.Settings

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun ExploreScreen(
    viewModel: ExploreViewModel = koinViewModel(),
    onOpenExploreShow: (title: String?, sourceUrl: String, exploreUrl: String?) -> Unit,
    onNavigateToTranslationSettings: () -> Unit = {}
) {
    val context = LocalContext.current
    val activity = context as? AppCompatActivity
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    var showAiConfigDialog by remember { mutableStateOf(false) }
    var showTranslateSourceDialog by remember { mutableStateOf(false) }
    val translationMode = when {
        TranslationConfig.isGlobalTranslateEnabled -> 1
        TranslationConfig.llmTranslateEnabled && TranslationConfig.llmProvider == "sangtacviet" -> 2
        else -> 0
    }
    val listItems by remember(uiState.items, uiState.expandedId, uiState.exploreKinds) {
        derivedStateOf { viewModel.buildExploreListItems(uiState) }
    }
    val isVip = io.legado.app.help.MemberManager.isVip
    val currentExploreTab = if (isVip) uiState.exploreTab else 0

    LaunchedEffect(isVip) {
        if (!isVip && uiState.exploreTab != 0) {
            viewModel.setExploreTab(0)
        }
    }

    val filteredListItems by remember(listItems, isVip) {
        derivedStateOf {
            if (isVip) {
                listItems
            } else {
                listItems.filter { listItem ->
                    when (listItem) {
                        is ExploreListItem.Header -> {
                            val item = listItem.source
                            val isAllowed = !item.bookSourceUrl.startsWith("ext_") && !item.bookSourceUrl.startsWith("online_yckceo_")
                            isAllowed
                        }
                        is ExploreListItem.KindRow -> {
                            val sourceUrl = listItem.sourceUrl
                            val isAllowed = !sourceUrl.startsWith("ext_") && !sourceUrl.startsWith("online_yckceo_")
                            isAllowed
                        }
                    }
                }
            }
        }
    }
    var sourceToDeleteUrl by rememberSaveable { mutableStateOf<String?>(null) }
    val sourceToDelete = remember(sourceToDeleteUrl, uiState.items) {
        uiState.items.firstOrNull { it.bookSourceUrl == sourceToDeleteUrl }
    }
    val listState = rememberLazyListState()
    val scope = rememberCoroutineScope()
    val exploreKindUseCase: ExploreKindUiUseCase = koinInject()

    LaunchedEffect(viewModel, activity, exploreKindUseCase) {
        viewModel.effects.collect { effect ->
            when (effect) {
                is ExploreEffect.ExecuteKindAction -> {
                    val infoMap = getExploreInfoMap(effect.sourceUrl)
                    exploreKindUseCase.executeAction(
                        action = effect.kind.action,
                        title = effect.kind.title,
                        sourceUrl = effect.sourceUrl,
                        infoMap = infoMap,
                        activity = activity,
                        onRefreshKinds = { viewModel.refreshExploreKinds(effect.sourceUrl) }
                    )
                }
            }
        }
    }

    val stickyHeaderSource by remember(listItems, uiState.items) {
        derivedStateOf {
            val firstIndex = listState.firstVisibleItemIndex
            val item = listItems.getOrNull(firstIndex)
            if (item is ExploreListItem.KindRow) {
                uiState.items.find { it.bookSourceUrl == item.sourceUrl }
            } else {
                null
            }
        }
    }

    val composeEngine = ThemeResolver.isMiuixEngine(composeEngine)

    ListScaffold(
        title = stringResource(R.string.discovery),
        state = uiState,
        subtitle = uiState.selectedGroup.ifEmpty { stringResource(R.string.all) },
        onSearchQueryChange = { viewModel.search(it) },
        onSearchToggle = { viewModel.toggleSearchVisible(it) },
        searchPlaceholder = stringResource(R.string.search),
        topBarActions = {
            io.legado.app.ui.widget.components.topbar.TopBarActionButton(
                onClick = { showTranslateSourceDialog = true },
                imageVector = androidx.compose.material.icons.Icons.Default.Translate,
                contentDescription = "Dịch"
            )
        },
        dropDownMenuContent = { dismiss ->
            RoundDropdownMenuItem(
                leadingIcon = { MenuItemIcon(Icons.Default.Group) },
                text = stringResource(R.string.all),
                onClick = { viewModel.setGroup(""); dismiss() }
            )
            uiState.groups.forEach { group ->
                RoundDropdownMenuItem(
                    leadingIcon = { MenuItemIcon(Icons.AutoMirrored.Outlined.Label) },
                    text = group,
                    onClick = { viewModel.setGroup(group); dismiss() }
                )
            }
        },
        contentWindowInsets = WindowInsets(0)
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = paddingValues.calculateTopPadding())
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                if (isVip) {
                    AppTabRow(
                        tabTitles = listOf("Nguồn sách", "Nguồn Extension"),
                        selectedTabIndex = currentExploreTab,
                        onTabSelected = { viewModel.setExploreTab(it) },
                        isScrollable = false,
                        modifier = Modifier.fillMaxWidth()
                    )
                }

                if (isVip && currentExploreTab == 1) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .horizontalScroll(rememberScrollState())
                            .padding(horizontal = 16.dp, vertical = 6.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        val subTabs = listOf("Tất cả", "Truyện chữ Việt", "Truyện chữ Trung", "Truyện tranh", "Phim")
                        subTabs.forEachIndexed { index, title ->
                            val isSelected = uiState.extSubTab == index
                            Surface(
                                onClick = { viewModel.setExtSubTab(index) },
                                shape = RoundedCornerShape(20.dp),
                                color = if (isSelected) LegadoTheme.colorScheme.primaryContainer else LegadoTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f),
                                border = if (isSelected) null else androidx.compose.foundation.BorderStroke(0.5.dp, LegadoTheme.colorScheme.outlineVariant.copy(alpha = 0.5f))
                            ) {
                                AppText(
                                    text = title,
                                    fontSize = 11.sp,
                                    fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                                    color = if (isSelected) LegadoTheme.colorScheme.onPrimaryContainer else LegadoTheme.colorScheme.onSurfaceVariant,
                                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                                )
                            }
                        }
                    }
                }



                if (io.legado.app.help.MemberManager.isVip) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { viewModel.hideUninstalled = !uiState.hideUninstalled }
                            .padding(horizontal = 16.dp, vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        AppText(
                            text = "Ẩn chưa cài",
                            style = LegadoTheme.typography.bodyMedium,
                            color = LegadoTheme.colorScheme.onSurface
                        )
                        Switch(
                            checked = uiState.hideUninstalled,
                            onCheckedChange = { viewModel.hideUninstalled = it }
                        )
                    }
                }

                Box(modifier = Modifier.weight(1f)) {
                    if (uiState.items.isEmpty()) {
                        EmptyMessage(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(bottom = paddingValues.calculateBottomPadding()),
                            messageResId = R.string.explore_empty
                        )
                    } else {
                        FastScrollLazyColumn(
                            state = listState,
                            modifier = Modifier.fillMaxSize(),
                            contentPadding = adaptiveContentPadding(
                                top = 8.dp,
                                bottom = 120.dp
                            )
                        ) {
                items(
                    items = filteredListItems,
                    key = { it.key }
                ) { listItem ->
                    when (listItem) {
                        is ExploreListItem.Header -> {
                            val item = listItem.source
                            val isExpanded = uiState.expandedId == item.bookSourceUrl
                            val isInstalled = !item.bookSourceUrl.startsWith("ext_online_") && !item.bookSourceUrl.startsWith("online_yckceo_")
                            val isInstalling = uiState.installingIds.contains(item.bookSourceUrl.substringAfter("ext_online_"))
                        ExploreSourceHeader(
                            modifier = Modifier.animateItem(),
                            item = item,
                            isExpanded = isExpanded,
                            isInstalled = isInstalled,
                            isInstalling = isInstalling,
                            loadingKinds = if (isExpanded) uiState.loadingKinds else false,
                            installedSearchUrls = uiState.installedSearchUrls,
                            installedSourceTypes = uiState.installedSourceTypes,
                            onClick = {
                                if (item.bookSourceUrl.startsWith("ext_")) {
                                    onOpenExploreShow(item.bookSourceName, item.bookSourceUrl, null)
                                } else {
                                    viewModel.toggleExpand(item)
                                }
                            },
                            onInstall = {
                                if (item.bookSourceUrl.startsWith("ext_online_")) {
                                    viewModel.installExtensionBySlug(item.bookSourceUrl.substringAfter("ext_online_"))
                                } else if (item.bookSourceUrl.startsWith("online_yckceo_")) {
                                    val id = item.bookSourceUrl.substringAfter("online_yckceo_").substringBefore("_")
                                    val jsonUrl = "https://www.yckceo.com/yuedu/shuyuan/json/id/${id}.json"
                                    (context as? AppCompatActivity)?.showDialogFragment(ImportBookSourceDialog(jsonUrl))
                                }
                            },
                            onTop = { viewModel.topSource(item) },
                            onEdit = {
                                context.startActivity<BookSourceEditActivity> {
                                    putExtra("sourceUrl", item.bookSourceUrl)
                                }
                            },
                            onSearch = {
                                context.startActivity<SearchActivity> {
                                    putExtra("searchScope", SearchScope(item).toString())
                                }
                            },
                            onLogin = {
                                context.startActivity<SourceLoginActivity> {
                                    putExtra("type", "bookSource")
                                    putExtra("key", item.bookSourceUrl)
                                }
                            },
                            onRefresh = { viewModel.refreshExploreKinds(item) },
                            onDelete = { sourceToDeleteUrl = item.bookSourceUrl },
                            onGenerateExtension = { viewModel.startGeneration(item.bookSourceUrl) },
                            isMiuix = composeEngine
                        )
                        }

                        is ExploreListItem.KindRow -> {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .animateItem()
                                    .padding(vertical = 4.dp),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                listItem.rowItems.forEach { (kind, span) ->
                                    ExploreKindMultiTypeItem(
                                        kind = kind,
                                        sourceUrl = listItem.sourceUrl,
                                        onOpenUrl = { url ->
                                            onOpenExploreShow(kind.title, listItem.sourceUrl, url)
                                        },
                                        modifier = Modifier.weight(span.toFloat()),
                                        isMiuix = composeEngine,
                                        displayNameOverride = uiState.kindDisplayNames[kind.title],
                                        valueOverride = uiState.kindValues[kind.title],
                                        onValueChange = { value ->
                                            viewModel.updateKindValue(listItem.sourceUrl, kind, value)
                                        },
                                        onRunAction = {
                                            viewModel.requestKindAction(listItem.sourceUrl, kind)
                                        }
                                    )
                                }

                                val totalSpan = listItem.rowItems.sumOf { it.second }
                                if (totalSpan < 6) {
                                    Spacer(
                                        modifier = Modifier.weight((6 - totalSpan).toFloat())
                                    )
                                }
                            }
                        }
                    }
                }
            }

                        TopFloatingStickyItem(
                            item = stickyHeaderSource,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .padding(top = 4.dp, start = 8.dp)
                        ) { item ->
                            val displayName = if (item.bookSourceUrl.startsWith("ext_")) {
                                item.bookSourceName
                            } else if (item.bookSourceUrl.startsWith("online_yckceo_")) {
                                item.bookSourceUrl.substringAfter("online_yckceo_").substringAfter("_")
                            } else {
                                io.legado.app.utils.NetworkUtils.getDomain(item.bookSourceUrl)
                            }
                            TextCard(
                                text = displayName,
                                textStyle = LegadoTheme.typography.labelMediumEmphasized,
                                cornerRadius = 12.dp,
                                horizontalPadding = 12.dp,
                                verticalPadding = 8.dp,
                                onClick = {
                                    scope.launch {
                                        val index = listItems.indexOfFirst {
                                            it is ExploreListItem.Header && it.source.bookSourceUrl == item.bookSourceUrl
                                        }
                                        if (index >= 0) listState.animateScrollToItem(index)
                                    }
                                }
                            )
                        }
                    }
                }
            }
        }
    }


    AppAlertDialog(
        data = sourceToDelete,
        onDismissRequest = { sourceToDeleteUrl = null },
        title = stringResource(R.string.sure_del),
        confirmText = stringResource(android.R.string.ok),
        onConfirm = { source ->
            viewModel.deleteSource(source)
            sourceToDeleteUrl = null
        },
        dismissText = stringResource(android.R.string.cancel),
        onDismiss = { sourceToDeleteUrl = null },
    )

    if (showAiConfigDialog) {
        AiConfigDialog(
            viewModel = viewModel,
            uiState = uiState,
            onDismiss = { showAiConfigDialog = false }
        )
    }

    if (showTranslateSourceDialog) {
        val expandedId = uiState.expandedId
        io.legado.app.ui.widget.dialog.TranslationSettingsDialog(
            onDismissRequest = { showTranslateSourceDialog = false },
            onSettingsClick = onNavigateToTranslationSettings,
            onSave = { _, _, _, _ ->
                if (expandedId != null) {
                    viewModel.refreshExploreKinds(expandedId)
                }
            }
        )
    }

    if (uiState.isWorkspaceOpen && uiState.generatingSourceUrl != null) {
        AiExtensionWorkspaceDialog(
            viewModel = viewModel,
            uiState = uiState
        )
    }
}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ExploreSourceHeader(
    modifier: Modifier = Modifier,
    item: BookSourcePart,
    isExpanded: Boolean,
    isInstalled: Boolean = true,
    isInstalling: Boolean = false,
    loadingKinds: Boolean,
    installedSearchUrls: Map<String, Boolean> = emptyMap(),
    installedSourceTypes: Map<String, Int> = emptyMap(),
    onClick: () -> Unit,
    onInstall: () -> Unit = {},
    onTop: () -> Unit,
    onEdit: () -> Unit,
    onSearch: () -> Unit,
    onLogin: () -> Unit,
    onRefresh: () -> Unit,
    onDelete: () -> Unit,
    onGenerateExtension: () -> Unit = {},
    isMiuix: Boolean,
) {
    var showMenu by remember { mutableStateOf(false) }
    val rotation by animateFloatAsState(if (isExpanded) 90f else 0f, label = "rotation")

    val containerColor by animateColorAsState(
        targetValue = if (isExpanded)
            if (isMiuix) MiuixTheme.colorScheme.secondaryContainer else LegadoTheme.colorScheme.secondaryContainer
        else
            if (isMiuix) MiuixTheme.colorScheme.surfaceContainer else LegadoTheme.colorScheme.surfaceContainerLow,
        animationSpec = tween(durationMillis = 200, easing = FastOutSlowInEasing),
        label = "CardColor"
    )

    val contentColor by animateColorAsState(
        targetValue = if (isExpanded)
            if (isMiuix) MiuixTheme.colorScheme.primary else LegadoTheme.colorScheme.primary
        else
            if (isMiuix) MiuixTheme.colorScheme.onSurface else LegadoTheme.colorScheme.onSurface,
        animationSpec = tween(durationMillis = 200, easing = FastOutSlowInEasing),
        label = "CardColor"
    )

    val isLegado = !item.bookSourceUrl.startsWith("ext_") && !item.bookSourceUrl.startsWith("ext_online_")
    val isOnlineExtension = item.bookSourceUrl.startsWith("ext_online_")
    val isExtension = isExtensionNameUrl(item.bookSourceUrl)

    val finalIconPath = if (isExtension && item.bookSourceGroup != null) {
        item.bookSourceGroup!!.substringBefore("|")
    } else {
        item.bookSourceGroup
    }

    val displayGroup = if (isExtension && item.bookSourceGroup != null && item.bookSourceGroup!!.contains("|")) {
        val parts = item.bookSourceGroup!!.split("|")
        val type = parts.getOrNull(1).orEmpty()
        val locale = parts.getOrNull(2).orEmpty()
        val typeStr = when (type.lowercase()) {
            "novel" -> "Truyện chữ"
            "comic" -> "Truyện tranh"
            "movie", "video" -> "Phim"
            "audio" -> "Sách nói"
            else -> "Tiện ích"
        }
        val localeStr = when {
            locale.contains("vi", ignoreCase = true) -> "Tiếng Việt 🇻🇳"
            locale.contains("zh", ignoreCase = true) || locale.contains("cn", ignoreCase = true) -> "Trung Quốc 🇨🇳"
            locale.contains("en", ignoreCase = true) -> "Tiếng Anh 🇺🇸"
            else -> "Quốc tế 🌐"
        }
        "$typeStr · $localeStr"
    } else if (isOnlineExtension) {
        "Extension trực tuyến"
    } else if (item.bookSourceUrl.startsWith("online_yckceo_")) {
        "Nguồn Legado trực tuyến"
    } else {
        item.bookSourceGroup
    }

    GlassCard(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        cornerRadius = 12.dp,
        containerColor = containerColor,
    ) {
        ListItem(
            modifier = Modifier
                .combinedClickable(
                    onClick = onClick,
                    onLongClick = { if (isInstalled && !item.bookSourceUrl.startsWith("ext_")) showMenu = true }
                )
                .fillMaxWidth(),
            colors = ListItemDefaults.colors(
                containerColor = Color.Transparent
            ),
            leadingContent = if (item.bookSourceUrl.startsWith("ext_")) {
                {
                    SourceIcon(
                        path = finalIconPath,
                        modifier = Modifier.size(40.dp)
                    )
                }
            } else null,
            headlineContent = {
                val displayName = if (isExtensionNameUrl(item.bookSourceUrl)) {
                    item.bookSourceName
                } else if (item.bookSourceUrl.startsWith("online_yckceo_")) {
                    item.bookSourceUrl.substringAfter("online_yckceo_").substringAfter("_")
                } else {
                    io.legado.app.utils.NetworkUtils.getDomain(item.bookSourceUrl)
                }
                AppText(
                    text = displayName,
                    style = LegadoTheme.typography.titleMedium,
                    color = contentColor
                )
            },
            supportingContent = {
                Column {
                    if (!isExtensionNameUrl(item.bookSourceUrl)) {
                        AppText(
                            text = item.bookSourceName,
                            style = LegadoTheme.typography.bodySmall,
                            color = LegadoTheme.colorScheme.onSurfaceVariant
                        )
                        if (isLegado) {
                            Spacer(modifier = Modifier.height(4.dp))
                            if (item.bookSourceUrl.startsWith("online_yckceo_")) {
                                val groupParts = item.bookSourceGroup?.split("|").orEmpty()
                                val author = groupParts.getOrNull(1).orEmpty()
                                val tags = groupParts.getOrNull(2).orEmpty()
                                val downloadsVal = groupParts.getOrNull(3)?.toIntOrNull() ?: 0
                                val time = groupParts.getOrNull(4).orEmpty()
                                
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    tags.split(" ").forEach { tag ->
                                        if (tag.isNotBlank()) {
                                            CapabilityBadge(tag)
                                        }
                                    }
                                    if (author.isNotBlank()) {
                                        AppText(
                                            text = "Tác giả: $author",
                                            style = LegadoTheme.typography.bodySmall,
                                            color = LegadoTheme.colorScheme.onSurfaceVariant,
                                            maxLines = 1,
                                            overflow = TextOverflow.Ellipsis
                                        )
                                    }
                                }
                                
                                Spacer(modifier = Modifier.height(2.dp))
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                                ) {
                                    AppText(
                                        text = "Tải: ${formatDownloads(downloadsVal)}",
                                        fontSize = 11.sp,
                                        color = LegadoTheme.colorScheme.onSurfaceVariant
                                    )
                                    AppText(
                                        text = "Cập nhật: $time",
                                        fontSize = 11.sp,
                                        color = LegadoTheme.colorScheme.onSurfaceVariant
                                    )
                                }
                            } else {
                                val hasSearch = installedSearchUrls[item.bookSourceUrl] == true
                                val hasExplore = item.hasExploreUrl
                                val sourceType = installedSourceTypes[item.bookSourceUrl] ?: 0
                                val isComic = sourceType == 2
                                val isAudio = sourceType == 1
                                
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    if (hasExplore) {
                                        CapabilityBadge("发")
                                    }
                                    if (hasSearch) {
                                        CapabilityBadge("搜")
                                    }
                                    if (isComic) {
                                        CapabilityBadge("图")
                                    }
                                    if (isAudio) {
                                        CapabilityBadge("声")
                                    }
                                    
                                    val groupName = item.bookSourceGroup
                                    if (!groupName.isNullOrBlank()) {
                                        AppText(
                                            text = "Nhóm: $groupName",
                                            style = LegadoTheme.typography.bodySmall,
                                            color = LegadoTheme.colorScheme.onSurfaceVariant,
                                            maxLines = 1,
                                            overflow = TextOverflow.Ellipsis
                                        )
                                    }
                                }
                            }
                        }
                    } else if (!displayGroup.isNullOrBlank()) {
                        AppText(
                            text = displayGroup,
                            style = LegadoTheme.typography.bodySmall,
                            color = LegadoTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.8f)
                        )
                    }
                }
            },
            trailingContent = {
                if (!isInstalled) {
                    Button(
                        onClick = onInstall,
                        enabled = !isInstalling,
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = LegadoTheme.colorScheme.primaryContainer,
                            contentColor = LegadoTheme.colorScheme.onPrimaryContainer
                        ),
                        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp),
                        modifier = Modifier.height(36.dp)
                    ) {
                        Text(
                            text = if (isInstalling) "Đang cài..." else "Cài đặt",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                } else {
                    AnimatedContent(
                        targetState = loadingKinds,
                        label = "LoadingSwitch"
                    ) { loading ->
                        if (loading) {
                            AppContainedLoadingIndicator(
                                modifier = Modifier.size(18.dp)
                            )
                        } else {
                            Icon(
                                imageVector = Icons.Default.ChevronRight,
                                contentDescription = null,
                                modifier = Modifier
                                    .rotate(rotation)
                                    .size(20.dp),
                                tint = LegadoTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                }
                if (isInstalled) {
                    RoundDropdownMenu(expanded = showMenu, onDismissRequest = { showMenu = false }) {
                        val menuTitle = if (item.bookSourceUrl.startsWith("ext_")) {
                            item.bookSourceName
                        } else if (item.bookSourceUrl.startsWith("online_yckceo_")) {
                            item.bookSourceUrl.substringAfter("online_yckceo_").substringAfter("_")
                        } else {
                            io.legado.app.utils.NetworkUtils.getDomain(item.bookSourceUrl)
                        }
                        PillHeaderDivider(title = menuTitle)
                        RoundDropdownMenuItem(
                            leadingIcon = { MenuItemIcon(Icons.Default.VerticalAlignTop) },
                            text = stringResource(R.string.to_top),
                            onClick = { onTop(); showMenu = false }
                        )
                        RoundDropdownMenuItem(
                            leadingIcon = { MenuItemIcon(Icons.Default.Edit) },
                            text = stringResource(R.string.edit),
                            onClick = { onEdit(); showMenu = false }
                        )
                        RoundDropdownMenuItem(
                            leadingIcon = { MenuItemIcon(Icons.Default.Search) },
                            text = stringResource(R.string.search),
                            onClick = { onSearch(); showMenu = false }
                        )
                        if (item.hasLoginUrl) {
                            RoundDropdownMenuItem(
                                leadingIcon = { MenuItemIcon(Icons.AutoMirrored.Filled.Login) },
                                text = stringResource(R.string.login),
                                onClick = { onLogin(); showMenu = false }
                            )
                        }
                        RoundDropdownMenuItem(
                            leadingIcon = { MenuItemIcon(Icons.Default.Refresh) },
                            text = stringResource(R.string.refresh),
                            onClick = { onRefresh(); showMenu = false }
                        )
                        RoundDropdownMenuItem(
                            leadingIcon = {
                                MenuItemIcon(
                                    Icons.Default.Delete,
                                    tint = LegadoTheme.colorScheme.error
                                )
                            },
                            text = stringResource(R.string.delete),
                            color = LegadoTheme.colorScheme.error,
                            onClick = { onDelete(); showMenu = false }
                        )
                    }
                }
            }
        )
    }
}

private fun isExtensionNameUrl(url: String): Boolean {
    return url.startsWith("ext_") || url.startsWith("ext_online_")
}

@Composable
private fun CapabilityBadge(tag: String) {
    val (color, text) = when (tag.trim()) {
        "搜" -> Color(0xFFE67E22) to "Tìm kiếm"
        "发" -> Color(0xFF2ECC71) to "Khám phá"
        "图" -> Color(0xFF9B59B6) to "Truyện tranh"
        "声" -> Color(0xFF3498DB) to "Truyện nói"
        else -> Color(0xFF7F8C8D) to tag
    }
    Surface(
        shape = RoundedCornerShape(4.dp),
        color = color.copy(alpha = 0.15f),
        border = androidx.compose.foundation.BorderStroke(0.5.dp, color.copy(alpha = 0.5f))
    ) {
        Text(
            text = text,
            fontSize = 9.sp,
            fontWeight = FontWeight.Bold,
            color = color,
            modifier = Modifier.padding(horizontal = 4.dp, vertical = 1.dp)
        )
    }
}

private fun formatDownloads(count: Int): String {
    return when {
        count >= 10000 -> String.format("%.1f vạn", count / 10000.0)
        count >= 1000 -> String.format("%.1f k", count / 1000.0)
        else -> count.toString()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AiConfigDialog(
    viewModel: ExploreViewModel,
    uiState: ExploreViewModel.ExploreUiState,
    onDismiss: () -> Unit
) {
    var baseUrlInput by remember(uiState.aiBaseUrl) { mutableStateOf(uiState.aiBaseUrl) }
    var apiKeyInput by remember(uiState.aiApiKey) { mutableStateOf(uiState.aiApiKey) }
    var modelInput by remember(uiState.aiSelectedModel) { mutableStateOf(uiState.aiSelectedModel) }
    
    val isScanning by viewModel.isScanningModels.collectAsStateWithLifecycle()
    val scannedModels by viewModel.aiModelsList.collectAsStateWithLifecycle()
    val scanError by viewModel.scanModelsError.collectAsStateWithLifecycle()
    
    var dropdownExpanded by remember { mutableStateOf(false) }

    Dialog(onDismissRequest = onDismiss) {
        Surface(
            shape = RoundedCornerShape(16.dp),
            color = LegadoTheme.colorScheme.surface,
            tonalElevation = 6.dp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(20.dp)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    text = "Cấu hình AI Model",
                    style = LegadoTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = LegadoTheme.colorScheme.primary
                )

                OutlinedTextField(
                    value = baseUrlInput,
                    onValueChange = { baseUrlInput = it },
                    label = { Text("Base URL", fontSize = 12.sp) },
                    placeholder = { Text("https://api.openai.com/v1") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = LegadoTheme.colorScheme.primary,
                        unfocusedBorderColor = LegadoTheme.colorScheme.outline.copy(alpha = 0.5f)
                    )
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(modifier = Modifier.weight(1f)) {
                        OutlinedTextField(
                            value = modelInput,
                            onValueChange = { modelInput = it },
                            label = { Text("Model AI", fontSize = 12.sp) },
                            singleLine = true,
                            modifier = Modifier.fillMaxWidth(),
                            trailingIcon = {
                                if (scannedModels.isNotEmpty()) {
                                    IconButton(onClick = { dropdownExpanded = true }) {
                                        Icon(Icons.Default.ChevronRight, contentDescription = "Chọn Model")
                                    }
                                }
                            },
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = LegadoTheme.colorScheme.primary,
                                unfocusedBorderColor = LegadoTheme.colorScheme.outline.copy(alpha = 0.5f)
                            )
                        )
                        
                        DropdownMenu(
                            expanded = dropdownExpanded,
                            onDismissRequest = { dropdownExpanded = false }
                        ) {
                            scannedModels.forEach { modelName ->
                                DropdownMenuItem(
                                    text = { Text(modelName) },
                                    onClick = {
                                        modelInput = modelName
                                        dropdownExpanded = false
                                    }
                                )
                            }
                        }
                    }
                    
                    Button(
                        onClick = {
                            viewModel.updateAiSettings(baseUrlInput, apiKeyInput, modelInput)
                            viewModel.scanModels()
                        },
                        enabled = !isScanning,
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = LegadoTheme.colorScheme.secondaryContainer,
                            contentColor = LegadoTheme.colorScheme.onSecondaryContainer
                        ),
                        modifier = Modifier.height(54.dp)
                    ) {
                        if (isScanning) {
                            AppCircularProgressIndicator(modifier = Modifier.size(20.dp))
                        } else {
                            Text("Quét", fontSize = 11.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                }
                
                scanError?.let {
                    Text(
                        text = it,
                        style = LegadoTheme.typography.bodySmall,
                        color = LegadoTheme.colorScheme.error
                    )
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.End)
                ) {
                    androidx.compose.material3.TextButton(onClick = onDismiss) {
                        Text("Hủy")
                    }
                    Button(
                        onClick = {
                            viewModel.updateAiSettings(baseUrlInput, apiKeyInput, modelInput)
                            onDismiss()
                        },
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text("Lưu cấu hình", fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }
}

@Composable
fun AiExtensionWorkspaceDialog(
    viewModel: ExploreViewModel,
    uiState: ExploreViewModel.ExploreUiState
) {
    val context = LocalContext.current
    var selectedTab by remember { mutableStateOf(0) }
    
    Dialog(
        onDismissRequest = { 
            if (!uiState.isGenerating) {
                viewModel.cancelGeneration()
            }
        },
        properties = androidx.compose.ui.window.DialogProperties(
            usePlatformDefaultWidth = false
        )
    ) {
        Surface(
            shape = RoundedCornerShape(16.dp),
            color = LegadoTheme.colorScheme.surface,
            tonalElevation = 6.dp,
            modifier = Modifier
                .fillMaxWidth(0.95f)
                .fillMaxHeight(0.9f)
                .padding(vertical = 16.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    AppText(
                        text = "Bảng làm việc: Sinh Extension",
                        style = LegadoTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = LegadoTheme.colorScheme.secondary
                    )
                    IconButton(
                        onClick = { viewModel.cancelGeneration() },
                        enabled = !uiState.isGenerating,
                        modifier = Modifier.size(36.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Đóng",
                            tint = LegadoTheme.colorScheme.error
                        )
                    }
                }
                
                AppTabRow(
                    tabTitles = listOf("Bảng điều khiển", "Trình sửa code"),
                    selectedTabIndex = selectedTab,
                    onTabSelected = { selectedTab = it },
                    isScrollable = false,
                    modifier = Modifier.fillMaxWidth()
                )
                
                Spacer(modifier = Modifier.height(4.dp))
                
                if (selectedTab == 0) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .verticalScroll(rememberScrollState()),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        OutlinedTextField(
                            value = uiState.generatedExtName.orEmpty(),
                            onValueChange = { viewModel.updateGeneratedExtName(it) },
                            label = { Text("Tên Extension (Tránh ghi đè)", fontSize = 12.sp) },
                            singleLine = true,
                            modifier = Modifier.fillMaxWidth(),
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = LegadoTheme.colorScheme.primary,
                                unfocusedBorderColor = LegadoTheme.colorScheme.outline.copy(alpha = 0.5f)
                            )
                        )
                        
                        OutlinedTextField(
                            value = uiState.referenceUrl,
                            onValueChange = { viewModel.updateReferenceUrl(it) },
                            label = { Text("Link xem/tham khảo (URL mẫu) để AI phân tích", fontSize = 12.sp) },
                            singleLine = true,
                            modifier = Modifier.fillMaxWidth(),
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = LegadoTheme.colorScheme.primary,
                                unfocusedBorderColor = LegadoTheme.colorScheme.outline.copy(alpha = 0.5f)
                            )
                        )
                        
                        OutlinedTextField(
                            value = uiState.customRequirement,
                            onValueChange = { viewModel.updateCustomRequirement(it) },
                            label = { Text("Yêu cầu tinh chỉnh thêm gửi cho AI", fontSize = 12.sp) },
                            modifier = Modifier.fillMaxWidth(),
                            maxLines = 3,
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = LegadoTheme.colorScheme.primary,
                                unfocusedBorderColor = LegadoTheme.colorScheme.outline.copy(alpha = 0.5f)
                            )
                        )
                        
                        Text(
                            text = "Trạng thái AI Generator:",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = LegadoTheme.colorScheme.onSurfaceVariant
                        )
                        
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(110.dp)
                                .border(0.5.dp, LegadoTheme.colorScheme.outline.copy(alpha = 0.5f), RoundedCornerShape(8.dp))
                                .background(Color.Black.copy(alpha = 0.05f), RoundedCornerShape(8.dp))
                                .padding(8.dp)
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .verticalScroll(rememberScrollState()),
                                verticalArrangement = Arrangement.spacedBy(4.dp)
                            ) {
                                Text(
                                    text = uiState.generationStatus,
                                    fontFamily = androidx.compose.ui.text.font.FontFamily.Monospace,
                                    fontSize = 11.sp,
                                    color = if (uiState.generationStatus.contains("Lỗi")) LegadoTheme.colorScheme.error else LegadoTheme.colorScheme.onSurface
                                )
                            }
                        }
                        
                        Spacer(modifier = Modifier.height(6.dp))
                        
                        Column(
                            verticalArrangement = Arrangement.spacedBy(10.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            // --- BƯỚC 1 ---
                            Card(
                                colors = CardDefaults.cardColors(
                                    containerColor = LegadoTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f)
                                ),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Column(
                                    modifier = Modifier.padding(8.dp),
                                    verticalArrangement = Arrangement.spacedBy(6.dp)
                                ) {
                                    Text(
                                        text = "Bước 1: Cấu hình chung & Menu (config, home, gen)",
                                        fontSize = 11.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = LegadoTheme.colorScheme.onSurfaceVariant
                                    )
                                    Row(
                                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                                        modifier = Modifier.fillMaxWidth()
                                    ) {
                                        Button(
                                            onClick = { viewModel.generateStep1(isRetry = false) },
                                            enabled = !uiState.isGenerating,
                                            modifier = Modifier.weight(1f).height(38.dp),
                                            shape = RoundedCornerShape(6.dp),
                                            contentPadding = PaddingValues(horizontal = 4.dp)
                                        ) {
                                            Text(if (uiState.step1Files != null) "Tạo lại" else "Tạo B1", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                                        }
                                        
                                        Button(
                                            onClick = { viewModel.installStep1() },
                                            enabled = uiState.step1Files != null && !uiState.isGenerating,
                                            modifier = Modifier.weight(1.2f).height(38.dp),
                                            shape = RoundedCornerShape(6.dp),
                                            colors = ButtonDefaults.buttonColors(
                                                containerColor = if (uiState.isStep1Installed) LegadoTheme.colorScheme.secondary else LegadoTheme.colorScheme.primary
                                            ),
                                            contentPadding = PaddingValues(horizontal = 4.dp)
                                        ) {
                                            Text(if (uiState.isStep1Installed) "Đã cài test ✓" else "Cài test thử", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                                        }
                                        
                                        Button(
                                            onClick = { viewModel.generateStep1(isRetry = true) },
                                            enabled = uiState.step1Files != null && uiState.customRequirement.isNotEmpty() && !uiState.isGenerating,
                                            modifier = Modifier.weight(1f).height(38.dp),
                                            shape = RoundedCornerShape(6.dp),
                                            colors = ButtonDefaults.buttonColors(
                                                containerColor = LegadoTheme.colorScheme.tertiary
                                            ),
                                            contentPadding = PaddingValues(horizontal = 4.dp)
                                        ) {
                                            Text("Thử lại B1", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                                        }
                                    }
                                }
                            }

                            // --- BƯỚC 2 ---
                            Card(
                                colors = CardDefaults.cardColors(
                                    containerColor = LegadoTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f)
                                ),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Column(
                                    modifier = Modifier.padding(8.dp),
                                    verticalArrangement = Arrangement.spacedBy(6.dp)
                                ) {
                                    Text(
                                        text = "Bước 2: Chi tiết truyện (detail.js)",
                                        fontSize = 11.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = LegadoTheme.colorScheme.onSurfaceVariant
                                    )
                                    Row(
                                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                                        modifier = Modifier.fillMaxWidth()
                                    ) {
                                        Button(
                                            onClick = { viewModel.generateStep2(isRetry = false) },
                                            enabled = uiState.generationStep >= 1 && !uiState.isGenerating,
                                            modifier = Modifier.weight(1f).height(38.dp),
                                            shape = RoundedCornerShape(6.dp),
                                            contentPadding = PaddingValues(horizontal = 4.dp)
                                        ) {
                                            Text(if (uiState.step2File != null) "Tạo lại" else "Tạo B2", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                                        }
                                        
                                        Button(
                                            onClick = { viewModel.installStep2() },
                                            enabled = uiState.step2File != null && !uiState.isGenerating,
                                            modifier = Modifier.weight(1.2f).height(38.dp),
                                            shape = RoundedCornerShape(6.dp),
                                            colors = ButtonDefaults.buttonColors(
                                                containerColor = if (uiState.isStep2Installed) LegadoTheme.colorScheme.secondary else LegadoTheme.colorScheme.primary
                                            ),
                                            contentPadding = PaddingValues(horizontal = 4.dp)
                                        ) {
                                            Text(if (uiState.isStep2Installed) "Đã thêm ✓" else "Thêm vào", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                                        }
                                        
                                        Button(
                                            onClick = { viewModel.generateStep2(isRetry = true) },
                                            enabled = uiState.step2File != null && uiState.customRequirement.isNotEmpty() && !uiState.isGenerating,
                                            modifier = Modifier.weight(1f).height(38.dp),
                                            shape = RoundedCornerShape(6.dp),
                                            colors = ButtonDefaults.buttonColors(
                                                containerColor = LegadoTheme.colorScheme.tertiary
                                            ),
                                            contentPadding = PaddingValues(horizontal = 4.dp)
                                        ) {
                                            Text("Thử lại B2", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                                        }
                                    }
                                }
                            }

                            // --- BƯỚC 3 ---
                            Card(
                                colors = CardDefaults.cardColors(
                                    containerColor = LegadoTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f)
                                ),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Column(
                                    modifier = Modifier.padding(8.dp),
                                    verticalArrangement = Arrangement.spacedBy(6.dp)
                                ) {
                                    Text(
                                        text = "Bước 3: Mục lục & Nội dung (toc, chap, search)",
                                        fontSize = 11.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = LegadoTheme.colorScheme.onSurfaceVariant
                                    )
                                    Row(
                                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                                        modifier = Modifier.fillMaxWidth()
                                    ) {
                                        Button(
                                            onClick = { viewModel.generateStep3(isRetry = false) },
                                            enabled = uiState.generationStep >= 2 && !uiState.isGenerating,
                                            modifier = Modifier.weight(1f).height(38.dp),
                                            shape = RoundedCornerShape(6.dp),
                                            contentPadding = PaddingValues(horizontal = 4.dp)
                                        ) {
                                            Text(if (uiState.step3Files != null) "Tạo lại" else "Tạo B3", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                                        }
                                        
                                        Button(
                                            onClick = { viewModel.installStep3() },
                                            enabled = uiState.step3Files != null && !uiState.isGenerating,
                                            modifier = Modifier.weight(1.2f).height(38.dp),
                                            shape = RoundedCornerShape(6.dp),
                                            colors = ButtonDefaults.buttonColors(
                                                containerColor = if (uiState.isStep3Installed) LegadoTheme.colorScheme.secondary else LegadoTheme.colorScheme.primary
                                            ),
                                            contentPadding = PaddingValues(horizontal = 4.dp)
                                        ) {
                                            Text(if (uiState.isStep3Installed) "Đã thêm ✓" else "Thêm vào", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                                        }
                                        
                                        Button(
                                            onClick = { viewModel.generateStep3(isRetry = true) },
                                            enabled = uiState.step3Files != null && uiState.customRequirement.isNotEmpty() && !uiState.isGenerating,
                                            modifier = Modifier.weight(1f).height(38.dp),
                                            shape = RoundedCornerShape(6.dp),
                                            colors = ButtonDefaults.buttonColors(
                                                containerColor = LegadoTheme.colorScheme.tertiary
                                            ),
                                            contentPadding = PaddingValues(horizontal = 4.dp)
                                        ) {
                                            Text("Thử lại B3", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                                        }
                                    }
                                }
                            }
                            
                            val isZipEnabled = uiState.step1Files != null
                            if (isZipEnabled) {
                                Spacer(modifier = Modifier.height(10.dp))
                                Button(
                                    onClick = { viewModel.exportExtensionZip(context) },
                                    enabled = !uiState.isGenerating,
                                    modifier = Modifier.fillMaxWidth().height(44.dp),
                                    shape = RoundedCornerShape(8.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = LegadoTheme.colorScheme.primaryContainer,
                                        contentColor = LegadoTheme.colorScheme.onPrimaryContainer
                                    )
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Save,
                                        contentDescription = null,
                                        modifier = Modifier.size(18.dp)
                                    )
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text("Xuất ZIP", fontWeight = FontWeight.Bold)
                                }
                            }
                        }
                    }
                } else {
                    // TAB 1: CODE EDITOR
                    val fileList = remember(uiState.step1Files, uiState.step2File, uiState.step3Files) {
                        buildList {
                            uiState.step1Files?.forEach { (name, content) ->
                                add(CodeFileItem(step = 1, name = name, content = content))
                            }
                            uiState.step2File?.let { content ->
                                add(CodeFileItem(step = 2, name = "detail.js", content = content))
                            }
                            uiState.step3Files?.forEach { (name, content) ->
                                add(CodeFileItem(step = 3, name = name, content = content))
                            }
                        }
                    }
                    
                    if (fileList.isEmpty()) {
                        Box(modifier = Modifier.fillMaxSize().weight(1f), contentAlignment = Alignment.Center) {
                            Text("Chưa có mã nguồn nào được sinh ra.\nHãy tạo Bước 1, Bước 2 hoặc Bước 3 trước.", style = LegadoTheme.typography.bodyMedium, color = LegadoTheme.colorScheme.onSurfaceVariant)
                        }
                    } else {
                        var selectedFile by remember(fileList) { mutableStateOf(fileList.firstOrNull()) }
                        var editedCode by remember(selectedFile) { mutableStateOf(selectedFile?.content.orEmpty()) }
                        
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(1f),
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            // File tabs list
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .horizontalScroll(rememberScrollState())
                                    .padding(vertical = 4.dp),
                                horizontalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                fileList.forEach { fileItem ->
                                    val isSelected = selectedFile?.name == fileItem.name && selectedFile?.step == fileItem.step
                                    Button(
                                        onClick = { selectedFile = fileItem },
                                        colors = ButtonDefaults.buttonColors(
                                            containerColor = if (isSelected) LegadoTheme.colorScheme.primary else LegadoTheme.colorScheme.secondaryContainer,
                                            contentColor = if (isSelected) LegadoTheme.colorScheme.onPrimary else LegadoTheme.colorScheme.onSecondaryContainer
                                        ),
                                        shape = RoundedCornerShape(8.dp),
                                        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 4.dp),
                                        modifier = Modifier.height(32.dp)
                                    ) {
                                        Text(fileItem.name, fontSize = 11.sp, fontWeight = FontWeight.Bold)
                                    }
                                }
                            }
                            
                            // Editor text area
                            OutlinedTextField(
                                value = editedCode,
                                onValueChange = { editedCode = it },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .weight(1f)
                                    .border(0.5.dp, LegadoTheme.colorScheme.outline.copy(alpha = 0.5f), RoundedCornerShape(8.dp)),
                                textStyle = androidx.compose.ui.text.TextStyle(
                                    fontFamily = androidx.compose.ui.text.font.FontFamily.Monospace,
                                    fontSize = 11.sp
                                ),
                                colors = OutlinedTextFieldDefaults.colors(
                                    focusedBorderColor = LegadoTheme.colorScheme.primary,
                                    unfocusedBorderColor = Color.Transparent
                                )
                            )
                            
                            // Save button
                            Button(
                                onClick = {
                                    val file = selectedFile
                                    if (file != null) {
                                        when (file.step) {
                                            1 -> viewModel.updateStep1File(file.name, editedCode)
                                            2 -> viewModel.updateStep2File(editedCode)
                                            3 -> viewModel.updateStep3File(file.name, editedCode)
                                        }
                                        android.widget.Toast.makeText(context, "Đã lưu thay đổi vào bộ nhớ tạm!", android.widget.Toast.LENGTH_SHORT).show()
                                    }
                                },
                                modifier = Modifier.fillMaxWidth().height(42.dp),
                                shape = RoundedCornerShape(8.dp)
                            ) {
                                Text("Lưu thay đổi code ✓", fontWeight = FontWeight.Bold)
                            }
                        }
                    }
                }
            }
        }
    }
}

private data class CodeFileItem(
    val step: Int,
    val name: String,
    val content: String
)

// Option card removed, using shared TranslationSettingsDialog instead.
