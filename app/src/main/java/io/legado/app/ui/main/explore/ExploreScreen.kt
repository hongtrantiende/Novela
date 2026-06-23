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
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.Switch

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun ExploreScreen(
    viewModel: ExploreViewModel = koinViewModel(),
    onOpenExploreShow: (title: String?, sourceUrl: String, exploreUrl: String?) -> Unit
) {
    val context = LocalContext.current
    val activity = context as? AppCompatActivity
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    val listItems by remember(uiState.items, uiState.expandedId, uiState.exploreKinds) {
        derivedStateOf { viewModel.buildExploreListItems(uiState) }
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
            var isGlobalTranslateEnabled by remember { mutableStateOf(io.legado.app.ui.config.translation.TranslationConfig.isGlobalTranslateEnabled) }
            io.legado.app.ui.widget.components.topbar.TopBarActionButton(
                onClick = { 
                    io.legado.app.ui.config.translation.TranslationConfig.isGlobalTranslateEnabled = !isGlobalTranslateEnabled
                    isGlobalTranslateEnabled = !isGlobalTranslateEnabled
                    val msg = if (isGlobalTranslateEnabled) "Đã bật dịch toàn cục" else "Đã tắt dịch toàn cục"
                    android.widget.Toast.makeText(context, msg, android.widget.Toast.LENGTH_SHORT).show()
                },
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
                AppTabRow(
                    tabTitles = listOf("Nguồn sách", "Nguồn Extension"),
                    selectedTabIndex = uiState.exploreTab,
                    onTabSelected = { viewModel.setExploreTab(it) },
                    isScrollable = false,
                    modifier = Modifier.fillMaxWidth()
                )

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
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Switch(
                        checked = uiState.hideUninstalled,
                        onCheckedChange = { viewModel.hideUninstalled = it }
                    )
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
                    items = listItems,
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
    onClick: () -> Unit,
    onInstall: () -> Unit = {},
    onTop: () -> Unit,
    onEdit: () -> Unit,
    onSearch: () -> Unit,
    onLogin: () -> Unit,
    onRefresh: () -> Unit,
    onDelete: () -> Unit,
    isMiuix: Boolean,
) {
    var showMenu by remember { mutableStateOf(false) }
    val rotation by animateFloatAsState(if (isExpanded) 90f else 0f, label = "rotation")

    val containerColor by animateColorAsState(
        targetValue = if (isExpanded)
            if (isMiuix) MiuixTheme.colorScheme.secondaryContainer else MaterialTheme.colorScheme.secondaryContainer
        else
            if (isMiuix) MiuixTheme.colorScheme.surfaceContainer else MaterialTheme.colorScheme.surfaceContainerLow,
        animationSpec = tween(durationMillis = 200, easing = FastOutSlowInEasing),
        label = "CardColor"
    )

    val contentColor by animateColorAsState(
        targetValue = if (isExpanded)
            if (isMiuix) MiuixTheme.colorScheme.primary else MaterialTheme.colorScheme.primary
        else
            if (isMiuix) MiuixTheme.colorScheme.onSurface else MaterialTheme.colorScheme.onSurface,
        animationSpec = tween(durationMillis = 200, easing = FastOutSlowInEasing),
        label = "CardColor"
    )

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
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    } else if (!displayGroup.isNullOrBlank()) {
                        AppText(
                            text = displayGroup,
                            style = LegadoTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.8f)
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
                            containerColor = MaterialTheme.colorScheme.primaryContainer,
                            contentColor = MaterialTheme.colorScheme.onPrimaryContainer
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
                                tint = MaterialTheme.colorScheme.onSurfaceVariant
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
                                    tint = MaterialTheme.colorScheme.error
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
