package io.legado.app.ui.book.explore

import android.annotation.SuppressLint
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.Crossfade
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.FormatListBulleted
import androidx.compose.material.icons.filled.Category
import androidx.compose.material.icons.filled.GridView
import androidx.compose.material.icons.outlined.FilterAlt
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.ui.draw.clip
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import dev.chrisbanes.haze.HazeState
import dev.chrisbanes.haze.materials.ExperimentalHazeMaterialsApi
import io.legado.app.data.entities.SearchBook
import io.legado.app.domain.model.BookShelfState
import io.legado.app.ui.config.coverConfig.CoverConfig
import io.legado.app.ui.main.bookCoverSharedElementKey
import io.legado.app.ui.theme.LegadoTheme
import io.legado.app.ui.theme.responsiveHazeEffect
import io.legado.app.ui.theme.responsiveHazeSource
import io.legado.app.ui.widget.components.AppPullToRefresh
import io.legado.app.ui.widget.components.AppScaffold
import io.legado.app.ui.widget.components.AppSlider
import io.legado.app.ui.widget.components.LoadMoreFooter
import io.legado.app.ui.widget.components.book.SearchBookGridItem
import io.legado.app.ui.widget.components.book.SearchBookListItem
import io.legado.app.ui.widget.components.book.SearchBookPreviewSheet
import io.legado.app.ui.widget.components.card.TextCard
import io.legado.app.ui.widget.components.explore.ExploreKindSelectSheet
import io.legado.app.ui.widget.components.modalBottomSheet.AppModalBottomSheet
import io.legado.app.ui.widget.components.text.AppText
import io.legado.app.ui.widget.components.topbar.GlassMediumFlexibleTopAppBar
import io.legado.app.ui.widget.components.topbar.GlassTopAppBarDefaults
import io.legado.app.ui.widget.components.topbar.TopBarActionButton
import io.legado.app.ui.widget.components.topbar.TopBarNavigationButton
import org.koin.androidx.compose.koinViewModel
import io.legado.app.vbookextension.ui.ExtensionDetailDialog
import io.legado.app.vbookextension.ui.ExtensionViewModel
import io.legado.app.vbookextension.data.entity.ExtensionEntity
import io.legado.app.ui.widget.components.alert.AppAlertDialog
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Translate
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.ui.platform.LocalContext
import io.legado.app.ui.book.search.SearchActivity
import io.legado.app.ui.book.search.SearchScope
import androidx.activity.compose.BackHandler
import androidx.compose.runtime.saveable.rememberSaveable
import io.legado.app.ui.widget.components.SearchBar
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.text.style.TextOverflow
import android.content.Context

private enum class BookFilterState(val id: Int) {
    SHOW_ALL(0),
    HIDE_IN_SHELF(1),
    HIDE_SAME_NAME_AUTHOR(2),
    SHOW_NOT_IN_SHELF_ONLY(3);

    companion object {
        fun fromId(id: Int) = entries.getOrElse(id) { SHOW_ALL }
    }
}

@SuppressLint("LocalContextConfigurationRead", "ConfigurationScreenWidthHeight")
@OptIn(
    ExperimentalMaterial3Api::class, ExperimentalHazeMaterialsApi::class,
    ExperimentalMaterial3ExpressiveApi::class, ExperimentalSharedTransitionApi::class
)
@Composable
fun ExploreShowScreen(
    viewModel: ExploreShowViewModel = koinViewModel(),
    title: String = "",
    onBack: () -> Unit,
    onBookClick: (SearchBook, String?) -> Unit,
    onNavigateToTranslationSettings: () -> Unit = {},
    sharedTransitionScope: SharedTransitionScope? = null,
    animatedVisibilityScope: AnimatedVisibilityScope? = null,
) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    val context = LocalContext.current

    val extId = remember(state.sourceUrl) {
        val sUrl = state.sourceUrl
        if (sUrl?.startsWith("ext_") == true) {
            sUrl.substringAfter("ext_")
        } else {
            ""
        }
    }
    var translationMode by remember(extId) {
        mutableStateOf(if (extId.isNotEmpty()) context.getSharedPreferences("novel_reader_prefs", Context.MODE_PRIVATE).getString("ext_translation_mode_$extId", "Gốc") ?: "Gốc" else "Gốc")
    }
    var showTranslationDialog by remember { mutableStateOf(false) }

    var isSearchMode by rememberSaveable { mutableStateOf(false) }
    var queryInput by rememberSaveable { mutableStateOf("") }

    BackHandler(isSearchMode) {
        isSearchMode = false
        queryInput = ""
        viewModel.onIntent(ExploreShowIntent.Search(null))
    }

    LaunchedEffect(viewModel) {
        viewModel.effects.collect { effect ->
            when (effect) {
                is ExploreShowEffect.OpenBookInfo -> onBookClick(
                    SearchBook(
                        name = effect.name,
                        author = effect.author,
                        bookUrl = effect.bookUrl,
                        origin = effect.origin ?: "",
                        coverUrl = effect.coverPath,
                    ),
                    effect.sharedCoverKey,
                )

                is ExploreShowEffect.ShowMessage -> {}
            }
        }
    }

    var previewBook by remember { mutableStateOf<SearchBook?>(null) }
    var previewSharedCoverKey by remember { mutableStateOf<String?>(null) }
    var activeDetailExtension by remember { mutableStateOf<ExtensionEntity?>(null) }
    var showDeleteDialogFor by remember { mutableStateOf<ExtensionEntity?>(null) }

    val filterStateId = CoverConfig.exploreFilterState
    val books = remember(state.books, filterStateId) {
        val filter = BookFilterState.fromId(filterStateId)
        when (filter) {
            BookFilterState.SHOW_ALL -> state.books
            BookFilterState.HIDE_IN_SHELF -> state.books.filter { it.shelfState != BookShelfState.IN_SHELF }
            BookFilterState.HIDE_SAME_NAME_AUTHOR -> state.books.filter { it.shelfState != BookShelfState.SAME_NAME_AUTHOR }
            BookFilterState.SHOW_NOT_IN_SHELF_ONLY -> state.books.filter { it.shelfState == BookShelfState.NOT_IN_SHELF }
        }
    }
    val listState = rememberLazyListState()
    val gridState = rememberLazyGridState()
    val scrollBehavior = GlassTopAppBarDefaults.defaultScrollBehavior()
    val isGridMode = state.layoutState == 1
    val hazeState = remember { HazeState() }
    val showLoadMoreFooter = !state.isRefreshing &&
        (state.isLoading || state.errorMsg != null || state.isEnd)
    val canLoadMore = state.books.isNotEmpty() &&
        !state.isLoading &&
        !state.isRefreshing &&
        !state.isEnd &&
        state.errorMsg == null
    val shouldLoadMore by remember(isGridMode) {
        derivedStateOf {
            if (isGridMode) {
                val total = gridState.layoutInfo.totalItemsCount
                val last = gridState.layoutInfo.visibleItemsInfo.lastOrNull()?.index ?: 0
                total > 0 && last >= total - 1
            } else {
                val total = listState.layoutInfo.totalItemsCount
                val last = listState.layoutInfo.visibleItemsInfo.lastOrNull()?.index ?: 0
                total > 0 && last >= total - 3
            }
        }
    }

    LaunchedEffect(
        shouldLoadMore,
        isGridMode,
        canLoadMore,
        state.books.size,
    ) {
        if (shouldLoadMore && canLoadMore) {
            viewModel.onIntent(ExploreShowIntent.LoadMore)
        }
    }

    // Auto-load next page when filter removes all books on the current page
    // but the ViewModel hasn't reached the end of data yet.
    LaunchedEffect(books.isEmpty(), state.isLoading, state.isEnd, state.books.size) {
        if (books.isEmpty() && !state.isLoading && !state.isEnd && state.books.isNotEmpty()) {
            viewModel.onIntent(ExploreShowIntent.ForceLoadNext)
        }
    }

    LaunchedEffect(isGridMode) {
        if (isGridMode) {
            if (listState.firstVisibleItemIndex > 0) {
                gridState.scrollToItem(listState.firstVisibleItemIndex)
            }
        } else {
            if (gridState.firstVisibleItemIndex > 0) {
                listState.scrollToItem(gridState.firstVisibleItemIndex)
            }
        }
    }

    AppModalBottomSheet(
        show = state.sheet == ExploreShowSheet.GridCount,
        onDismissRequest = { viewModel.onIntent(ExploreShowIntent.DismissSheet) }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 32.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            AppText(
                text = "Số cột bố cục",
                style = LegadoTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
            )
            Spacer(modifier = Modifier.width(12.dp))
            TextCard(
                text = "cột ${state.gridCount}",
                textStyle = LegadoTheme.typography.titleSmall,
                backgroundColor = LegadoTheme.colorScheme.onSheetContent,
                verticalPadding = 4.dp,
                horizontalPadding = 12.dp,
                cornerRadius = 12.dp
            )
        }

        AppSlider(
            value = state.gridCount.toFloat(),
            onValueChange = {
                viewModel.onIntent(ExploreShowIntent.SaveGridCount(it.toInt().coerceIn(1, 10)))
            },
            valueRange = 1f..10f,
            steps = 8,
            modifier = Modifier.padding(horizontal = 20.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

    }

    ExploreKindSelectSheet(
        show = state.sheet == ExploreShowSheet.KindSelect,
        onDismissRequest = { viewModel.onIntent(ExploreShowIntent.DismissSheet) },
        sourceUrl = state.sourceUrl,
        onSelected = { selectedKinds ->
            selectedKinds.firstOrNull()?.let { kind ->
                viewModel.onIntent(ExploreShowIntent.SwitchKind(kind))
            }
        }
    )

    AppScaffold(
        modifier = Modifier
            .nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            val rawTitle = state.selectedKindTitle ?: title
            val translatedTitle by io.legado.app.utils.translateAsState(rawTitle, extId = extId.takeIf { it.isNotEmpty() })
            GlassMediumFlexibleTopAppBar(
                modifier = Modifier.responsiveHazeEffect(state = hazeState),
                title = if (isSearchMode) "Tìm kiếm" else translatedTitle,
                navigationIcon = {
                    TopBarNavigationButton(onClick = {
                        if (isSearchMode) {
                            isSearchMode = false
                            queryInput = ""
                            viewModel.onIntent(ExploreShowIntent.Search(null))
                        } else {
                            onBack()
                        }
                    })
                },
                actions = {
                    if (!isSearchMode) {
                        if (extId.isNotEmpty()) {
                            Box(
                                modifier = Modifier
                                    .padding(end = 8.dp)
                                    .clip(CircleShape)
                                    .background(io.legado.app.ui.theme.LegadoTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f))
                                    .border(
                                        width = 1.dp,
                                        color = io.legado.app.ui.theme.LegadoTheme.colorScheme.outline.copy(alpha = 0.2f),
                                        shape = CircleShape
                                    )
                                    .clickable { showTranslationDialog = true }
                                    .padding(horizontal = 12.dp, vertical = 6.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.Center
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Translate,
                                        contentDescription = null,
                                        tint = io.legado.app.ui.theme.LegadoTheme.colorScheme.primary,
                                        modifier = Modifier.size(16.dp)
                                    )
                                    Spacer(modifier = Modifier.width(6.dp))
                                    AppText(
                                        text = if (translationMode == "Gốc") "Gốc" else "Dịch",
                                        fontSize = 13.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = io.legado.app.ui.theme.LegadoTheme.colorScheme.onSurface
                                    )
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Icon(
                                        imageVector = Icons.Default.KeyboardArrowDown,
                                        contentDescription = null,
                                        tint = io.legado.app.ui.theme.LegadoTheme.colorScheme.onSurfaceVariant,
                                        modifier = Modifier.size(14.dp)
                                    )
                                }
                            }
                        }

                        if (state.showSearchIcon) {
                            TopBarActionButton(
                                onClick = {
                                    val isExtension = state.sourceUrl?.startsWith("ext_") == true
                                    if (isExtension) {
                                        isSearchMode = true
                                    } else {
                                        state.bookSource?.let { bookSource ->
                                            SearchActivity.start(context, null, SearchScope(bookSource).toString())
                                        }
                                    }
                                },
                                imageVector = Icons.Default.Search,
                                contentDescription = "Tìm kiếm"
                            )
                        }

                        AnimatedVisibility(
                            visible = isGridMode,
                            enter = fadeIn(tween(300)),
                            exit = fadeOut(tween(300))
                        ) {
                            TopBarActionButton(
                                onClick = {
                                    viewModel.onIntent(
                                        ExploreShowIntent.ShowSheet(
                                            ExploreShowSheet.GridCount
                                        )
                                    )
                                },
                                imageVector = Icons.AutoMirrored.Outlined.FormatListBulleted,
                                contentDescription = "Cài đặt số cột"
                            )
                        }

                        TopBarActionButton(
                            onClick = { viewModel.onIntent(ExploreShowIntent.ShowSheet(ExploreShowSheet.KindSelect)) },
                            imageVector = Icons.Outlined.FilterAlt,
                            contentDescription = "Phân loại"
                        )

                        TopBarActionButton(
                            onClick = { viewModel.onIntent(ExploreShowIntent.ToggleLayout) },
                            imageVector = if (!isGridMode) Icons.AutoMirrored.Outlined.FormatListBulleted else Icons.Default.GridView,
                            contentDescription = "Chuyển đổi bố cục"
                        )

                        if (state.sourceUrl?.startsWith("ext_") == true && state.extension != null) {
                            TopBarActionButton(
                                onClick = { activeDetailExtension = state.extension },
                                imageVector = Icons.Default.Settings,
                                contentDescription = "Cài đặt nguồn"
                            )
                        }
                    }
                },
                bottomContent = if (isSearchMode) {
                    {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp, vertical = 8.dp)
                        ) {
                            SearchBar(
                                query = queryInput,
                                onQueryChange = { queryInput = it },
                                onSearch = { q ->
                                    if (q.trim().isNotBlank()) {
                                        viewModel.onIntent(ExploreShowIntent.Search(q.trim()))
                                    }
                                },
                                placeholder = "Tìm kiếm truyện...",
                                autoFocus = true,
                                trailingIcon = {
                                    if (queryInput.isNotEmpty()) {
                                        IconButton(onClick = { queryInput = "" }) {
                                            Icon(
                                                imageVector = Icons.Default.Close,
                                                contentDescription = "Xóa"
                                            )
                                        }
                                    }
                                }
                            )
                        }
                    }
                } else null,
                scrollBehavior = scrollBehavior
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = paddingValues.calculateTopPadding())
        ) {
            if (state.sourceUrl?.startsWith("ext_") == true && state.homeKinds.isNotEmpty() && !isSearchMode && state.searchQuery == null) {
                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(LegadoTheme.colorScheme.background)
                        .padding(vertical = 8.dp),
                    contentPadding = PaddingValues(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(state.homeKinds.size) { index ->
                        val kind = state.homeKinds[index]
                        val selected = state.selectedKindTitle == kind.title
                        ExploreCategoryChip(
                            name = kind.title,
                            selected = selected,
                            extId = extId.takeIf { it.isNotEmpty() },
                            onClick = {
                                viewModel.onIntent(ExploreShowIntent.SwitchKind(kind))
                            }
                        )
                    }
                }
            }

            AppPullToRefresh(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f),
                isRefreshing = state.isRefreshing,
                onRefresh = { viewModel.onIntent(ExploreShowIntent.Refresh) },
                topPadding = 0.dp
            ) {
                Crossfade(
                    targetState = isGridMode,
                    animationSpec = tween(250),
                    label = "LayoutCrossfade"
                ) { isGrid ->
                    if (isGrid) {
                        LazyVerticalGrid(
                            state = gridState,
                            modifier = Modifier
                                .fillMaxSize()
                                .responsiveHazeSource(hazeState),
                            columns = GridCells.Fixed(state.gridCount),
                            contentPadding = PaddingValues(
                                top = 12.dp,
                                bottom = paddingValues.calculateBottomPadding() + 12.dp,
                                start = 12.dp,
                                end = 12.dp
                            ),
                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            itemsIndexed(
                                items = books,
                                key = { index, item -> "${item.book.bookUrl}:$index" }
                            ) { index, item ->
                                val sharedCoverKey = bookCoverSharedElementKey(
                                    item.book.bookUrl,
                                    "explore:grid:$index"
                                )
                                ExploreBookGridItem(
                                    book = item.book,
                                    shelfState = item.shelfState,
                                    onClick = {
                                        viewModel.onIntent(
                                            ExploreShowIntent.OpenBook(
                                                item.book,
                                                sharedCoverKey
                                            )
                                        )
                                    },
                                    onLongClick = { book, coverKey ->
                                        previewBook = book
                                        previewSharedCoverKey = coverKey
                                    },
                                    modifier = Modifier.animateItem(),
                                    sharedTransitionScope = sharedTransitionScope,
                                    animatedVisibilityScope = animatedVisibilityScope,
                                    sharedCoverKey = sharedCoverKey,
                                )
                            }

                            if (showLoadMoreFooter) {
                                item(span = { GridItemSpan(maxLineSpan) }) {
                                    ExploreShowLoadMoreFooter(
                                        state = state,
                                        onRetry = { viewModel.onIntent(ExploreShowIntent.LoadMore) },
                                        onLoadMore = { viewModel.onIntent(ExploreShowIntent.ForceLoadNext) },
                                    )
                                }
                            }
                        }
                    } else {
                        LazyColumn(
                            modifier = Modifier
                                .fillMaxSize()
                                .responsiveHazeSource(hazeState),
                            state = listState,
                            contentPadding = PaddingValues(
                                top = 8.dp,
                                bottom = paddingValues.calculateBottomPadding() + 16.dp
                            )
                        ) {
                            itemsIndexed(
                                items = books,
                                key = { index, item -> "${item.book.bookUrl}:$index" }
                            ) { index, item ->
                                val sharedCoverKey = bookCoverSharedElementKey(
                                    item.book.bookUrl,
                                    "explore:list:$index"
                                )
                                ExploreBookItem(
                                    book = item.book,
                                    shelfState = item.shelfState,
                                    onClick = {
                                        viewModel.onIntent(
                                            ExploreShowIntent.OpenBook(
                                                item.book,
                                                sharedCoverKey
                                            )
                                        )
                                    },
                                    onLongClick = { book, coverKey ->
                                        previewBook = book
                                        previewSharedCoverKey = coverKey
                                    },
                                    modifier = Modifier.animateItem(),
                                    sharedTransitionScope = sharedTransitionScope,
                                    animatedVisibilityScope = animatedVisibilityScope,
                                    sharedCoverKey = sharedCoverKey,
                                )
                            }

                            if (showLoadMoreFooter) {
                                item {
                                    ExploreShowLoadMoreFooter(
                                        state = state,
                                        onRetry = { viewModel.onIntent(ExploreShowIntent.LoadMore) },
                                        onLoadMore = { viewModel.onIntent(ExploreShowIntent.ForceLoadNext) },
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    val previewShelfState = previewBook?.let { book ->
        books.find { it.book.bookUrl == book.bookUrl }?.shelfState
            ?: BookShelfState.NOT_IN_SHELF
    }
    SearchBookPreviewSheet(
        data = previewBook,
        shelfState = previewShelfState,
        sharedCoverKey = previewSharedCoverKey,
        onDismissRequest = { previewBook = null },
        onOpenDetail = { book, sharedCoverKey ->
            previewBook = null
            onBookClick(book, sharedCoverKey)
        },
        onAddToShelf = { book ->
            viewModel.onIntent(ExploreShowIntent.AddToShelf(book))
        },
    )

    val extViewModel: ExtensionViewModel = koinViewModel()

    activeDetailExtension?.let { ext ->
        ExtensionDetailDialog(
            extension = ext,
            viewModel = extViewModel,
            onDismissRequest = { activeDetailExtension = null },
            onUninstallClick = {
                showDeleteDialogFor = ext
                activeDetailExtension = null
            }
        )
    }

    showDeleteDialogFor?.let { ext ->
        AppAlertDialog(
            data = ext,
            onDismissRequest = { showDeleteDialogFor = null },
            title = "Gỡ cài đặt tiện ích?",
            text = "Bạn có chắc chắn muốn gỡ cài đặt tiện ích \"${ext.name}\" không?",
            confirmText = "Xác nhận",
            onConfirm = {
                extViewModel.uninstallExtension(ext.id)
                showDeleteDialogFor = null
                onBack()
            },
            dismissText = "Hủy",
            onDismiss = { showDeleteDialogFor = null }
        )
    }

    if (showTranslationDialog && extId.isNotEmpty()) {
        val prefs = remember(extId) { context.getSharedPreferences("novel_reader_prefs", Context.MODE_PRIVATE) }
        var tempSource by remember(extId, showTranslationDialog) {
            mutableStateOf(prefs.getString("ext_translate_source_$extId", "Tiếng Trung") ?: "Tiếng Trung")
        }
        var tempTarget by remember(extId, showTranslationDialog) {
            mutableStateOf(prefs.getString("ext_translate_target_$extId", "Việt (VP)") ?: "Việt (VP)")
        }
        var tempEngine by remember(extId, showTranslationDialog) {
            mutableStateOf(prefs.getString("ext_translate_engine_$extId", "QT") ?: "QT")
        }
        var tempScope by remember(extId, showTranslationDialog) {
            mutableStateOf(prefs.getString("ext_translate_scope_$extId", "Tất cả") ?: "Tất cả")
        }
        var tempEnabled by remember(extId, showTranslationDialog) {
            mutableStateOf(translationMode != "Gốc")
        }

        var sourceMenuExpanded by remember { mutableStateOf(false) }
        var targetMenuExpanded by remember { mutableStateOf(false) }
        var engineMenuExpanded by remember { mutableStateOf(false) }
        var scopeMenuExpanded by remember { mutableStateOf(false) }

        Dialog(
            onDismissRequest = { showTranslationDialog = false },
            properties = DialogProperties(usePlatformDefaultWidth = false)
        ) {
            Box(
                modifier = Modifier
                    .width(360.dp)
                    .clip(RoundedCornerShape(28.dp))
                    .background(LegadoTheme.colorScheme.surfaceContainerHigh)
                    .border(1.dp, LegadoTheme.colorScheme.outline.copy(alpha = 0.15f), RoundedCornerShape(28.dp))
                    .padding(20.dp)
            ) {
                Column {
                    // Header Row
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconButton(onClick = { showTranslationDialog = false }) {
                            Icon(
                                imageVector = Icons.Default.Close,
                                contentDescription = "Close",
                                tint = LegadoTheme.colorScheme.onSurface
                            )
                        }
                        AppText(
                            text = "Dịch",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = LegadoTheme.colorScheme.onSurface
                        )
                        IconButton(onClick = {
                            showTranslationDialog = false
                            onNavigateToTranslationSettings()
                        }) {
                            Icon(
                                imageVector = Icons.Default.Settings,
                                contentDescription = "Settings",
                                tint = LegadoTheme.colorScheme.onSurface
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    // Row 1: Source Language -> Switch -> Target Language
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Source Dropdown
                        Box(modifier = Modifier.weight(1f)) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(16.dp))
                                    .background(LegadoTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f))
                                    .clickable { sourceMenuExpanded = true }
                                    .padding(horizontal = 12.dp, vertical = 10.dp),
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                AppText(
                                    text = tempSource,
                                    color = LegadoTheme.colorScheme.onSurface,
                                    fontSize = 14.sp,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Icon(
                                    imageVector = Icons.Default.KeyboardArrowDown,
                                    contentDescription = null,
                                    tint = LegadoTheme.colorScheme.onSurfaceVariant,
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                            DropdownMenu(
                                expanded = sourceMenuExpanded,
                                onDismissRequest = { sourceMenuExpanded = false }
                            ) {
                                listOf("Tiếng Trung", "Tự động nhận diện", "Tiếng Anh", "Tiếng Nhật", "Tiếng Hàn").forEach { lang ->
                                    DropdownMenuItem(
                                        text = { AppText(lang) },
                                        onClick = {
                                            tempSource = lang
                                            sourceMenuExpanded = false
                                        }
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.width(8.dp))

                        // Toggle Switch
                        Switch(
                            checked = tempEnabled,
                            onCheckedChange = { tempEnabled = it },
                            colors = SwitchDefaults.colors(
                                checkedThumbColor = LegadoTheme.colorScheme.primary,
                                checkedTrackColor = LegadoTheme.colorScheme.primaryContainer,
                                uncheckedThumbColor = LegadoTheme.colorScheme.outline,
                                uncheckedTrackColor = LegadoTheme.colorScheme.surfaceVariant
                            )
                        )

                        Spacer(modifier = Modifier.width(8.dp))

                        // Target Dropdown
                        Box(modifier = Modifier.weight(1f)) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(16.dp))
                                    .background(LegadoTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f))
                                    .clickable { targetMenuExpanded = true }
                                    .padding(horizontal = 12.dp, vertical = 10.dp),
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                AppText(
                                    text = tempTarget,
                                    color = LegadoTheme.colorScheme.onSurface,
                                    fontSize = 14.sp,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Icon(
                                    imageVector = Icons.Default.KeyboardArrowDown,
                                    contentDescription = null,
                                    tint = LegadoTheme.colorScheme.onSurfaceVariant,
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                            DropdownMenu(
                                expanded = targetMenuExpanded,
                                onDismissRequest = { targetMenuExpanded = false }
                            ) {
                                listOf("Việt (VP)", "Hán Việt", "Việt (Dịch)").forEach { lang ->
                                    DropdownMenuItem(
                                        text = { AppText(lang) },
                                        onClick = {
                                            tempTarget = lang
                                            targetMenuExpanded = false
                                        }
                                    )
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    // Row 2: Engine Selector -> Scope Selector + Save Button
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Engine Selector
                        Box(modifier = Modifier.weight(1.1f)) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(16.dp))
                                    .background(LegadoTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f))
                                    .clickable { engineMenuExpanded = true }
                                    .padding(horizontal = 10.dp, vertical = 10.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(20.dp)
                                        .background(LegadoTheme.colorScheme.primary.copy(alpha = 0.2f), CircleShape),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Book,
                                        contentDescription = null,
                                        tint = LegadoTheme.colorScheme.primary,
                                        modifier = Modifier.size(12.dp)
                                    )
                                }
                                Spacer(modifier = Modifier.width(6.dp))
                                AppText(
                                    text = tempEngine,
                                    color = LegadoTheme.colorScheme.onSurface,
                                    fontSize = 14.sp,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                    modifier = Modifier.weight(1f)
                                )
                                Icon(
                                    imageVector = Icons.Default.KeyboardArrowDown,
                                    contentDescription = null,
                                    tint = LegadoTheme.colorScheme.onSurfaceVariant,
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                            DropdownMenu(
                                expanded = engineMenuExpanded,
                                onDismissRequest = { engineMenuExpanded = false }
                            ) {
                                listOf("QT", "Google", "Bắc Cực Tinh", "GGChan").forEach { eng ->
                                    DropdownMenuItem(
                                        text = { AppText(eng) },
                                        onClick = {
                                            tempEngine = eng
                                            engineMenuExpanded = false
                                        }
                                    )
                                }
                            }
                        }

                        // Scope Dropdown
                        Box(modifier = Modifier.weight(1f)) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(16.dp))
                                    .background(LegadoTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f))
                                    .clickable { scopeMenuExpanded = true }
                                    .padding(horizontal = 8.dp, vertical = 10.dp),
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                AppText(
                                    text = tempScope,
                                    color = LegadoTheme.colorScheme.onSurface,
                                    fontSize = 13.sp,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                                Spacer(modifier = Modifier.width(2.dp))
                                Icon(
                                    imageVector = Icons.Default.KeyboardArrowDown,
                                    contentDescription = null,
                                    tint = LegadoTheme.colorScheme.onSurfaceVariant,
                                    modifier = Modifier.size(14.dp)
                                )
                            }
                            DropdownMenu(
                                expanded = scopeMenuExpanded,
                                onDismissRequest = { scopeMenuExpanded = false }
                            ) {
                                listOf("Tất cả", "Tên truyện", "Nội dung").forEach { scp ->
                                    DropdownMenuItem(
                                        text = { AppText(scp) },
                                        onClick = {
                                            tempScope = scp
                                            scopeMenuExpanded = false
                                        }
                                    )
                                }
                            }
                        }

                        // Save button
                        Button(
                            onClick = {
                                val finalMode = if (tempEnabled) tempTarget else "Gốc"
                                prefs.edit().apply {
                                    putString("ext_translation_mode_$extId", finalMode)
                                    putString("ext_translate_source_$extId", tempSource)
                                    putString("ext_translate_target_$extId", tempTarget)
                                    putString("ext_translate_engine_$extId", tempEngine)
                                    putString("ext_translate_scope_$extId", tempScope)
                                }.apply()
                                translationMode = finalMode
                                showTranslationDialog = false
                                viewModel.onIntent(ExploreShowIntent.Refresh)
                            },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = LegadoTheme.colorScheme.primary,
                                contentColor = LegadoTheme.colorScheme.onPrimary
                            ),
                            shape = RoundedCornerShape(12.dp),
                            contentPadding = PaddingValues(horizontal = 14.dp, vertical = 10.dp)
                        ) {
                            AppText("Lưu", fontSize = 14.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun ExploreShowLoadMoreFooter(
    state: ExploreShowUiState,
    onRetry: () -> Unit,
    onLoadMore: () -> Unit,
) {
    LoadMoreFooter(
        isLoading = state.isLoading,
        errorMsg = state.errorMsg,
        isEnd = state.isEnd,
        onRetry = onRetry,
        onLoadMore = onLoadMore,
        autoLoad = false,
    )
}

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun ExploreBookItem(
    book: SearchBook,
    shelfState: BookShelfState,
    onClick: () -> Unit,
    onLongClick: ((SearchBook, String?) -> Unit)? = null,
    modifier: Modifier = Modifier,
    sharedTransitionScope: SharedTransitionScope? = null,
    animatedVisibilityScope: AnimatedVisibilityScope? = null,
    sharedCoverKey: String? = null,
) {
    SearchBookListItem(
        book = book,
        shelfState = shelfState,
        onClick = onClick,
        onLongClick = onLongClick,
        modifier = modifier,
        sharedTransitionScope = sharedTransitionScope,
        animatedVisibilityScope = animatedVisibilityScope,
        sharedCoverKey = sharedCoverKey
    )
}

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun ExploreBookGridItem(
    book: SearchBook,
    onClick: () -> Unit,
    shelfState: BookShelfState,
    onLongClick: ((SearchBook, String?) -> Unit)? = null,
    modifier: Modifier = Modifier,
    sharedTransitionScope: SharedTransitionScope? = null,
    animatedVisibilityScope: AnimatedVisibilityScope? = null,
    sharedCoverKey: String? = null,
) {
    SearchBookGridItem(
        book = book,
        shelfState = shelfState,
        onClick = onClick,
        onLongClick = onLongClick,
        modifier = modifier.padding(4.dp),
        sharedTransitionScope = sharedTransitionScope,
        animatedVisibilityScope = animatedVisibilityScope,
        sharedCoverKey = sharedCoverKey
    )
}

@Composable
fun ExploreCategoryChip(
    name: String,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    extId: String? = null,
) {
    val translatedName by io.legado.app.utils.translateAsState(name, extId = extId)
    val containerColor = if (selected) LegadoTheme.colorScheme.primaryContainer
                         else LegadoTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
    val contentColor = if (selected) LegadoTheme.colorScheme.onPrimaryContainer
                       else LegadoTheme.colorScheme.onSurface
    val borderStrokeColor = if (selected) LegadoTheme.colorScheme.primary
                            else LegadoTheme.colorScheme.outline.copy(alpha = 0.3f)
    
    Box(
        modifier = modifier
            .clip(CircleShape)
            .background(containerColor)
            .border(
                width = 1.dp,
                color = borderStrokeColor,
                shape = CircleShape
            )
            .clickable(onClick = onClick)
            .padding(horizontal = 14.dp, vertical = 6.dp),
        contentAlignment = androidx.compose.ui.Alignment.Center
    ) {
        AppText(
            text = translatedName,
            fontSize = 13.sp,
            fontWeight = if (selected) FontWeight.Bold else FontWeight.Normal,
            color = contentColor,
            maxLines = 1
        )
    }
}
