package io.legado.app.ui.book.info

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.Crossfade
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.unit.Dp
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.ui.graphics.asImageBitmap
import io.legado.app.ui.widget.components.card.NormalCard
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.outlined.FormatListBulleted
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.BookmarkAdd
import androidx.compose.material.icons.filled.Code
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Timeline
import androidx.compose.material.icons.outlined.Book
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MediumFlexibleTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInRoot
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.platform.LocalContext
import android.content.Intent
import androidx.compose.material.icons.filled.Language
import io.legado.app.ui.browser.WebViewActivity
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.ImageLoader
import coil.size.Size
import io.legado.app.R
import io.legado.app.constant.BookType
import io.legado.app.data.entities.SearchBook
import io.legado.app.help.config.AppConfig
import android.view.WindowManager
import io.legado.app.help.config.ThemeConfigStore
import io.legado.app.utils.windowSize
import io.legado.app.ui.config.themeConfig.ThemeConfig
import io.legado.app.ui.config.coverConfig.CoverConfig
import io.legado.app.ui.main.homepage.modules.BannerModule
import io.legado.app.ui.theme.LegadoTheme
import io.legado.app.ui.theme.LocalHazeState
import io.legado.app.ui.theme.ProvideThemeOverride
import io.legado.app.ui.theme.ThemeOverrideState
import io.legado.app.ui.theme.ThemeResolver
import io.legado.app.ui.theme.fadingEdge
import io.legado.app.ui.theme.rememberImageSeedColor
import io.legado.app.ui.theme.rememberThemeOverride
import io.legado.app.ui.theme.responsiveHazeEffectFixedStyle
import io.legado.app.ui.widget.components.AppPullToRefresh
import io.legado.app.ui.widget.components.AppScaffold
import io.legado.app.ui.widget.components.AppTextField
import io.legado.app.ui.widget.components.alert.AppAlertDialog
import io.legado.app.ui.widget.components.button.series.SmallTonalButton
import io.legado.app.ui.widget.components.card.GlassCard
import io.legado.app.ui.widget.components.card.TextCard
import io.legado.app.ui.widget.components.changeSource.ChangeSourceSheet
import io.legado.app.ui.widget.components.icon.AppIcon
import io.legado.app.ui.widget.components.image.cover.BookCoverImage
import io.legado.app.ui.widget.components.image.cover.CoilBookCover
import io.legado.app.ui.widget.components.log.AppLogSheet
import io.legado.app.ui.widget.components.menuItem.RoundDropdownMenu
import io.legado.app.ui.widget.components.menuItem.RoundDropdownMenuItem
import io.legado.app.ui.widget.components.progressIndicator.AppCircularProgressIndicator
import io.legado.app.ui.widget.components.text.AnimatedTextLine
import io.legado.app.ui.widget.components.text.AppText
import io.legado.app.ui.widget.components.topbar.GlassTopAppBarDefaults
import io.legado.app.ui.widget.components.topbar.GlassTopAppBarScrollBehavior
import io.legado.app.ui.widget.components.topbar.M3GlassScrollBehavior
import io.legado.app.ui.widget.components.topbar.MiuixGlassScrollBehavior
import io.legado.app.ui.widget.components.topbar.TopBarActionButton
import io.legado.app.ui.widget.components.topbar.TopBarNavigationButton
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList
import kotlinx.coroutines.delay
import org.koin.compose.koinInject
import top.yukonga.miuix.kmp.basic.MiuixScrollBehavior
import top.yukonga.miuix.kmp.basic.TopAppBar as MiuixTopAppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookInfoScreen(
    state: BookInfoUiState,
    onIntent: (BookInfoIntent) -> Unit,
    onBack: () -> Unit,
    sharedTransitionScope: SharedTransitionScope? = null,
    animatedVisibilityScope: AnimatedVisibilityScope? = null,
    sharedCoverKey: String? = null,
) {
    val bookColorTheme = rememberBookInfoColorTheme(state.book)

    BookInfoScreenContent(
        state = state,
        onIntent = onIntent,
        onBack = onBack,
        sharedTransitionScope = sharedTransitionScope,
        animatedVisibilityScope = animatedVisibilityScope,
        sharedCoverKey = sharedCoverKey,
        bookColorTheme = bookColorTheme,
    )
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalSharedTransitionApi::class,
    ExperimentalMaterial3ExpressiveApi::class
)
@Composable
private fun BookInfoScreenContent(
    state: BookInfoUiState,
    onIntent: (BookInfoIntent) -> Unit,
    onBack: () -> Unit,
    sharedTransitionScope: SharedTransitionScope?,
    animatedVisibilityScope: AnimatedVisibilityScope?,
    sharedCoverKey: String?,
    bookColorTheme: ThemeOverrideState?,
) {
    val isMiuix = ThemeResolver.isMiuixEngine(LegadoTheme.composeEngine)
    val scrollBehavior = if (isMiuix) {
        MiuixGlassScrollBehavior(MiuixScrollBehavior())
    } else {
        M3GlassScrollBehavior(TopAppBarDefaults.exitUntilCollapsedScrollBehavior())
    }
    val listState = rememberLazyListState()
    var showMenu by rememberSaveable { mutableStateOf(false) }
    val systemSurfaceColor = LegadoTheme.colorScheme.surface
    val context = LocalContext.current
    val windowManager = remember(context) { context.getSystemService(android.content.Context.WINDOW_SERVICE) as WindowManager }
    val hasBgImage = remember(context) {
        ThemeConfigStore.getBookDetailBgImage(context, windowManager.windowSize) != null ||
        ThemeConfigStore.getBgImage(context, windowManager.windowSize) != null
    }
    val useTransparentBg = hasBgImage && ThemeConfig.bookDetailHeaderStyle != "3"
    val isFixedHeader = ThemeConfig.bookDetailHeaderStyle == "1" || ThemeConfig.bookDetailHeaderStyle == "2"

    AppScaffold(
        modifier = Modifier
            .fillMaxSize()
            .then(
                if (isFixedHeader) Modifier
                else Modifier.nestedScroll(scrollBehavior.nestedScrollConnection)
            ),
        topBar = {
            BookInfoColorTheme(theme = bookColorTheme) {
                BookInfoTransparentTopAppBar(
                    state = state,
                    showMenu = showMenu,
                    onShowMenuChange = { showMenu = it },
                    onMenuAction = { onIntent(BookInfoIntent.MenuAction(it)) },
                    onBackPressed = onBack,
                    scrollBehavior = scrollBehavior,
                )
            }
        },
        floatingActionButton = {
            ExtendedFloatingActionButton(
                onClick = { onIntent(BookInfoIntent.ReadClick) },
                containerColor = LegadoTheme.colorScheme.primaryContainer,
                contentColor = LegadoTheme.colorScheme.onPrimaryContainer,
                icon = { Icon(Icons.Default.Book, null) },
                text = { Text(stringResource(R.string.reading)) },
            )
        },
        alwaysDrawBehindBars = true,
    ) { paddingValues ->
        val book = state.book
        if (book == null || (state.isTocLoading && !state.hasChapters)) {
            BookInfoSkeleton(paddingValues = paddingValues)
        } else {
            Box(modifier = Modifier.fillMaxSize()) {
                BookInfoColorTheme(theme = bookColorTheme) {
                    BookInfoBackdrop(
                        book = book,
                        systemSurfaceColor = systemSurfaceColor,
                    )
                }
                AppPullToRefresh(
                    modifier = Modifier.fillMaxSize(),
                    isRefreshing = state.isTocLoading,
                    onRefresh = { onIntent(BookInfoIntent.MenuAction(BookInfoMenuAction.Refresh)) },
                    topPadding = paddingValues.calculateTopPadding()
                ) {
                    val style = ThemeConfig.bookDetailHeaderStyle
                    val isFixedHeader = style == "1" || style == "2"
                    Column(modifier = Modifier.fillMaxSize()) {
                        if (isFixedHeader) {
                            Box(modifier = Modifier.padding(top = paddingValues.calculateTopPadding() - 65.dp)) {
                                BookInfoColorTheme(theme = bookColorTheme) {
                                    BookInfoHeader(
                                        book = book,
                                        kindLabels = state.kindLabels,
                                        groupNames = state.groupNames,
                                        systemSurfaceColor = systemSurfaceColor,
                                        onCoverClick = { onIntent(BookInfoIntent.CoverClick) },
                                        onCoverLongClick = { onIntent(BookInfoIntent.CoverLongClick) },
                                        onAuthorClick = { onIntent(BookInfoIntent.AuthorClick(it)) },
                                        onBookNameClick = { onIntent(BookInfoIntent.BookNameClick(it)) },
                                        onOriginClick = { onIntent(BookInfoIntent.OriginClick) },
                                        onKindClick = { onIntent(BookInfoIntent.KindClick(it)) },
                                        sharedTransitionScope = sharedTransitionScope,
                                        animatedVisibilityScope = animatedVisibilityScope,
                                        sharedCoverKey = sharedCoverKey,
                                        topPadding = 65.dp,
                                    )
                                }
                            }
                        }
                        LazyColumn(
                            state = listState,
                            modifier = Modifier.weight(1f),
                            contentPadding = PaddingValues(
                                top = if (isFixedHeader) 8.dp else (paddingValues.calculateTopPadding() + 8.dp),
                                bottom = paddingValues.calculateBottomPadding() + 88.dp,
                            ),
                        ) {
                            if (!isFixedHeader) {
                                item {
                                    BookInfoColorTheme(theme = bookColorTheme) {
                                        BookInfoHeader(
                                            book = book,
                                            kindLabels = state.kindLabels,
                                            groupNames = state.groupNames,
                                            systemSurfaceColor = systemSurfaceColor,
                                            onCoverClick = { onIntent(BookInfoIntent.CoverClick) },
                                            onCoverLongClick = { onIntent(BookInfoIntent.CoverLongClick) },
                                            onAuthorClick = { onIntent(BookInfoIntent.AuthorClick(it)) },
                                            onBookNameClick = { onIntent(BookInfoIntent.BookNameClick(it)) },
                                            onOriginClick = { onIntent(BookInfoIntent.OriginClick) },
                                            onKindClick = { onIntent(BookInfoIntent.KindClick(it)) },
                                            sharedTransitionScope = sharedTransitionScope,
                                            animatedVisibilityScope = animatedVisibilityScope,
                                            sharedCoverKey = sharedCoverKey,
                                        )
                                    }
                                }
                            }
                        item {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(
                                        color = if (useTransparentBg) Color.Transparent else LegadoTheme.colorScheme.surface
                                    )
                                    .padding(bottom = 24.dp)
                            ) {
                                BookInfoActions(
                                    inBookshelf = state.inBookshelf,
                                    showSource = book.origin.startsWith("ext_").not(),
                                    bookUrl = book.bookUrl,
                                    bookName = book.name,
                                    bookOrigin = book.origin,
                                    onShelfClick = { onIntent(BookInfoIntent.ShelfClick) },
                                    onTocClick = { onIntent(BookInfoIntent.TocClick) },
                                    onGroupClick = { onIntent(BookInfoIntent.GroupClick) },
                                    onSourceClick = { onIntent(BookInfoIntent.ChangeSourceClick) },
                                    onReadRecordClick = { onIntent(BookInfoIntent.ReadRecordClick) },
                                )
                                state.relatedBooks.forEach { module ->
                                    RelatedBooksBanner(
                                        title = module.title,
                                        books = module.books,
                                        onBookClick = { book, _ ->
                                            onIntent(BookInfoIntent.RelatedBookClick(book))
                                        },
                                        onMoreClick = {
                                            onIntent(BookInfoIntent.RelatedBooksMore(module.title, module.resolvedUrl))
                                        },
                                    )
                                }
                                BookInfoSummary(
                                    book = book,
                                    hasChapters = state.hasChapters,
                                    onRemarkClick = { onIntent(BookInfoIntent.RemarkClick) },
                                )
                            }
                        }
                    }
                }
            }
        }
        }
    }

    val currentSheet = state.sheet
    var renderedSheet by remember { mutableStateOf<BookInfoSheet>(BookInfoSheet.None) }

    LaunchedEffect(currentSheet) {
        if (currentSheet == BookInfoSheet.None) {
            delay(300)
            renderedSheet = BookInfoSheet.None
        } else {
            renderedSheet = currentSheet
        }
    }

    when (val sheet = renderedSheet) {
        BookInfoSheet.None -> Unit
        BookInfoSheet.CoverPicker -> ChangeCoverSheet(
            show = currentSheet == BookInfoSheet.CoverPicker,
            name = state.book?.name.orEmpty(),
            author = state.book?.author.orEmpty(),
            onDismissRequest = { onIntent(BookInfoIntent.DismissSheet) },
            onSelect = { onIntent(BookInfoIntent.SelectCover(it)) },
        )
        BookInfoSheet.GroupPicker -> {
            val groups by koinInject<io.legado.app.data.repository.BookGroupRepository>().flowSelect().collectAsStateWithLifecycle(initialValue = emptyList())
            GroupSelectSheet(
                show = currentSheet == BookInfoSheet.GroupPicker,
                groups = groups,
                currentGroupId = state.book?.group ?: 0L,
                onDismissRequest = { onIntent(BookInfoIntent.DismissSheet) },
                onConfirm = { onIntent(BookInfoIntent.SelectGroup(it)) },
            )
        }
        is BookInfoSheet.SourcePicker -> {
            ChangeSourceSheet(
                show = currentSheet is BookInfoSheet.SourcePicker,
                oldBook = sheet.oldBook,
                onDismissRequest = { onIntent(BookInfoIntent.DismissSheet) },
                onReplace = { source, newBook, toc, options ->
                    onIntent(BookInfoIntent.ReplaceWithSource(source, newBook, toc, options))
                },
                onAddAsNew = { newBook, toc ->
                    onIntent(BookInfoIntent.AddSourceAsNewBook(newBook, toc))
                },
            )
        }
        BookInfoSheet.ReadRecord -> BookReadRecordSheet(
            show = currentSheet == BookInfoSheet.ReadRecord,
            totalReadTime = state.readRecordTotalTime,
            timelineDays = state.readRecordTimelineDays,
            onDismissRequest = { onIntent(BookInfoIntent.DismissSheet) },
        )
        is BookInfoSheet.WebFiles -> WebFileSheet(
            show = currentSheet is BookInfoSheet.WebFiles,
            files = state.webFiles,
            title = stringResource(R.string.download_and_import_file),
            onDismissRequest = { onIntent(BookInfoIntent.DismissSheet) },
            onSelect = { onIntent(BookInfoIntent.SelectWebFile(it, sheet.openAfterImport)) },
        )
        is BookInfoSheet.ArchiveEntries -> WebFileSheet(
            show = currentSheet is BookInfoSheet.ArchiveEntries,
            files = sheet.entries.map { BookInfoWebFile(it, it) },
            title = stringResource(R.string.import_select_book),
            onDismissRequest = { onIntent(BookInfoIntent.DismissSheet) },
            onSelect = {
                onIntent(
                    BookInfoIntent.SelectArchiveEntry(
                        archiveUri = sheet.archiveUri,
                        entryName = it.name,
                        openAfterImport = sheet.openAfterImport,
                    )
                )
            },
        )
    }

    BookInfoDialogs(state = state, onIntent = onIntent)
}

@Composable
private fun BookInfoColorTheme(
    theme: ThemeOverrideState?,
    content: @Composable () -> Unit,
) {
    ProvideThemeOverride(theme = theme, content = content)
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class)
@Composable
private fun BookInfoTransparentTopAppBar(
    state: BookInfoUiState,
    showMenu: Boolean,
    onShowMenuChange: (Boolean) -> Unit,
    onMenuAction: (BookInfoMenuAction) -> Unit,
    onBackPressed: () -> Unit,
    scrollBehavior: GlassTopAppBarScrollBehavior,
) {
    val isMiuix = ThemeResolver.isMiuixEngine(LegadoTheme.composeEngine)
    val resolvedColor = Color.Transparent
    val topBarColors = TopAppBarDefaults.topAppBarColors(
        containerColor = resolvedColor,
        scrolledContainerColor = resolvedColor,
    )
    val modifier = Modifier

    if (isMiuix) {
        MiuixTopAppBar(
            modifier = modifier,
            title = "",
            subtitle = "",
            navigationIcon = {
                TopBarNavigationButton(onClick = onBackPressed)
            },
            actions = {
                BookInfoTopBarActions(
                    state = state,
                    showMenu = showMenu,
                    onShowMenuChange = onShowMenuChange,
                    onMenuAction = onMenuAction,
                )
            },
            color = resolvedColor,
            scrollBehavior = (scrollBehavior as? MiuixGlassScrollBehavior)?.miuixBehavior,
        )
    } else {
        MediumFlexibleTopAppBar(
            modifier = modifier,
            title = { Text(text = "", maxLines = 1) },
            navigationIcon = {
                TopBarNavigationButton(onClick = onBackPressed)
            },
            actions = {
                Box(modifier = Modifier.padding(end = 12.dp)) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        BookInfoTopBarActions(
                            state = state,
                            showMenu = showMenu,
                            onShowMenuChange = onShowMenuChange,
                            onMenuAction = onMenuAction,
                        )
                    }
                }
            },
            scrollBehavior = (scrollBehavior as? M3GlassScrollBehavior)?.m3Behavior,
            colors = topBarColors,
        )
    }
}

@Composable
private fun rememberBookInfoColorTheme(book: BookInfoBookUi?): ThemeOverrideState? {
    if (!ThemeConfig.enableBookInfoCoverTheme) return null
    val useDefaultCover = AppConfig.useDefaultCover || book?.coverPath == "use_default_cover"
    if (useDefaultCover) return null

    val imageLoader = koinInject<ImageLoader>()
    val coverPath = book?.coverPath
    val sourceOrigin = book?.origin
    val loadOnlyWifi = CoverConfig.loadCoverOnlyWifi
    val requestKey = remember(coverPath, sourceOrigin, loadOnlyWifi) {
        listOf(coverPath, sourceOrigin, loadOnlyWifi)
    }

    val seedColor = rememberImageSeedColor(
        imageLoader = imageLoader,
        data = coverPath,
        requestKey = requestKey,
    ) {
        setParameter("sourceOrigin", sourceOrigin)
        setParameter("loadOnlyWifi", loadOnlyWifi)
    }

    return rememberThemeOverride(seedColor)
}

@Composable
private fun BookInfoTopBarActions(
    state: BookInfoUiState,
    showMenu: Boolean,
    onShowMenuChange: (Boolean) -> Unit,
    onMenuAction: (BookInfoMenuAction) -> Unit,
) {
    if (state.inBookshelf) {
        TopBarActionButton(
            onClick = { onMenuAction(BookInfoMenuAction.Edit) },
            imageVector = Icons.Default.Edit,
            contentDescription = "biên tập"
        )
    }
    TopBarActionButton(
        onClick = { onMenuAction(BookInfoMenuAction.Share) },
        imageVector = Icons.Default.Share,
        contentDescription = "chia sẻ"
    )
    TopBarActionButton(
        onClick = { onShowMenuChange(true) },
        imageVector = Icons.Default.MoreVert,
        contentDescription = "Hơn"
    )
    BookInfoOverflowMenu(
        expanded = showMenu,
        onDismissRequest = { onShowMenuChange(false) },
        state = state,
        onMenuAction = {
            onShowMenuChange(false)
            onMenuAction(it)
        }
    )
}

@Composable
private fun BookInfoBackdrop(
    book: BookInfoBookUi,
    systemSurfaceColor: Color,
) {
    if (ThemeConfig.bookDetailHeaderStyle != "3") {
        return
    }

    val backdropState = remember(
        book.name,
        book.author,
        book.coverPath,
        book.origin,
    ) {
        BookInfoBackdropState(
            name = book.name,
            author = book.author,
            coverPath = book.coverPath,
            sourceOrigin = book.origin,
        )
    }
    val seedOverlay = lerp(
        LegadoTheme.colorScheme.secondaryContainer,
        LegadoTheme.seedColor,
        0.42f
    )
    Box(modifier = Modifier.fillMaxSize()) {
        Crossfade(
            targetState = backdropState,
            animationSpec = tween(800),
            label = "BackdropCrossfade"
        ) { currentBook ->
            BookCoverImage(
                name = currentBook.name,
                author = currentBook.author,
                path = currentBook.coverPath,
                sourceOrigin = currentBook.sourceOrigin,
                memoryCacheKey = currentBook.coverPath?.let { "$it#book-info-backdrop" },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(480.dp)
                    .blur(24.dp),
                contentScale = ContentScale.Crop,
                showLoadingPlaceholder = false,
                requestBuilder = {
                    size(Size(384, 384))
                }
            )
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(seedOverlay.copy(alpha = 0.34f))
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colorStops = arrayOf(
                            0f to Color.Transparent,
                            0.20f to seedOverlay.copy(alpha = 0.10f),
                            0.40f to seedOverlay.copy(alpha = 0.18f),
                            0.60f to systemSurfaceColor.copy(alpha = 0.85f),
                            0.80f to systemSurfaceColor,
                            1f to systemSurfaceColor,
                        )
                    )
                )
        )
    }
}

private data class BookInfoBackdropState(
    val name: String,
    val author: String,
    val coverPath: String?,
    val sourceOrigin: String?,
)

@Composable
private fun BookInfoOverflowMenu(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    state: BookInfoUiState,
    onMenuAction: (BookInfoMenuAction) -> Unit,
) {
    val book = state.book
    RoundDropdownMenu(expanded = expanded, onDismissRequest = onDismissRequest) {
        if (state.inBookshelf) {
            RoundDropdownMenuItem(
                text = stringResource(R.string.edit),
                onClick = { onMenuAction(BookInfoMenuAction.Edit) }
            )
        }
        RoundDropdownMenuItem(
            text = stringResource(R.string.refresh),
            onClick = { onMenuAction(BookInfoMenuAction.Refresh) }
        )
        RoundDropdownMenuItem(
            text = stringResource(R.string.read_record),
            onClick = { onMenuAction(BookInfoMenuAction.ReadRecord) }
        )

        if (state.bookSource?.hasLogin == true) {
            RoundDropdownMenuItem(
                text = stringResource(R.string.login),
                onClick = { onMenuAction(BookInfoMenuAction.Login) }
            )
        }
        if (state.bookSource != null) {
            RoundDropdownMenuItem(
                text = stringResource(R.string.set_source_variable),
                onClick = { onMenuAction(BookInfoMenuAction.SetSourceVariable) }
            )
            RoundDropdownMenuItem(
                text = stringResource(R.string.set_book_variable),
                onClick = { onMenuAction(BookInfoMenuAction.SetBookVariable) }
            )
            RoundDropdownMenuItem(
                text = stringResource(R.string.copy_book_url),
                onClick = { onMenuAction(BookInfoMenuAction.CopyBookUrl) }
            )
            RoundDropdownMenuItem(
                text = stringResource(R.string.copy_toc_url),
                onClick = { onMenuAction(BookInfoMenuAction.CopyTocUrl) }
            )
        }
        RoundDropdownMenuItem(
            text = stringResource(R.string.to_top),
            onClick = { onMenuAction(BookInfoMenuAction.Top) }
        )
        if (book?.isLocal == false ){
            RoundDropdownMenuItem(
                text = stringResource(R.string.allow_update),
                onClick = { onMenuAction(BookInfoMenuAction.ToggleCanUpdate) },
                isSelected = book.canUpdate
            )
        }
        if (book?.isLocal == true && book.type and BookType.text > 0) {
            RoundDropdownMenuItem(
                text = stringResource(R.string.split_long_chapter),
                onClick = { onMenuAction(BookInfoMenuAction.ToggleSplitLongChapter) },
                isSelected = book.splitLongChapter
            )
        }
        RoundDropdownMenuItem(
            text = stringResource(R.string.delete_alert),
            onClick = { onMenuAction(BookInfoMenuAction.ToggleDeleteAlert) },
            isSelected = state.deleteAlertEnabled
        )
        RoundDropdownMenuItem(
            text = stringResource(R.string.clear_cache),
            onClick = { onMenuAction(BookInfoMenuAction.ClearCache) }
        )
        RoundDropdownMenuItem(
            text = stringResource(R.string.log),
            onClick = { onMenuAction(BookInfoMenuAction.ShowLog) }
        )
    }
}

@Composable
private fun BookInfoHeaderContent(
    book: BookInfoBookUi,
    kindLabels: List<String>,
    groupNames: String?,
    onCoverClick: () -> Unit,
    onCoverLongClick: () -> Unit,
    onAuthorClick: (Boolean) -> Unit,
    onBookNameClick: (Boolean) -> Unit,
    onOriginClick: () -> Unit,
    onKindClick: (String) -> Unit,
    sharedTransitionScope: SharedTransitionScope?,
    animatedVisibilityScope: AnimatedVisibilityScope?,
    sharedCoverKey: String?,
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.Top,
        ) {
            Box(
                modifier = Modifier
                    .width(112.dp)
                    .combinedClickable(onClick = onCoverClick, onLongClick = onCoverLongClick)
            ) {
                CoilBookCover(
                    name = book.name,
                    author = book.author,
                    path = book.coverPath,
                    sourceOrigin = book.origin,
                    modifier = Modifier
                        .width(112.dp)
                        .aspectRatio(5f / 7f),
                    showLoadingPlaceholder = sharedCoverKey == null,
                    sharedTransitionScope = sharedTransitionScope,
                    animatedVisibilityScope = animatedVisibilityScope,
                    sharedCoverKey = sharedCoverKey
                )
            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterVertically)
                    .padding(top = 8.dp, bottom = 8.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                var showTitleMenu by remember { mutableStateOf(false) }
                var isTitleExpanded by rememberSaveable { mutableStateOf(false) }
                val translatedBookName by io.legado.app.utils.translateAsState(book.name)
                Box {
                    AppText(
                        text = translatedBookName,
                        style = LegadoTheme.typography.headlineSmall,
                        fontWeight = FontWeight.Bold,
                        maxLines = if (isTitleExpanded) Int.MAX_VALUE else 2,
                        modifier = Modifier.combinedClickable(
                            onClick = { onBookNameClick(false) },
                            onLongClick = { showTitleMenu = true }
                        )
                    )
                    RoundDropdownMenu(
                        expanded = showTitleMenu,
                        onDismissRequest = { showTitleMenu = false }
                    ) {
                        RoundDropdownMenuItem(
                            text = stringResource(R.string.search),
                            onClick = {
                                showTitleMenu = false
                                onBookNameClick(true)
                            }
                        )
                        RoundDropdownMenuItem(
                            text = stringResource(if (isTitleExpanded) R.string.collapse else R.string.expand),
                            onClick = {
                                showTitleMenu = false
                                isTitleExpanded = !isTitleExpanded
                            }
                        )
                    }
                }
                val translatedAuthor by io.legado.app.utils.translateAsState(book.realAuthor)
                AppText(
                    text = stringResource(R.string.author_show, translatedAuthor),
                    style = LegadoTheme.typography.bodyLarge,
                    color = LegadoTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.combinedClickable(
                        onClick = { onAuthorClick(false) },
                        onLongClick = { onAuthorClick(true) }
                    )
                )
                AppText(
                    text = stringResource(R.string.origin_show, book.originName),
                    style = LegadoTheme.typography.labelMedium,
                    color = LegadoTheme.colorScheme.primary,
                    modifier = Modifier.clickable(onClick = onOriginClick)
                )
            }
        }
        if (kindLabels.isNotEmpty() || !groupNames.isNullOrBlank()) {
            val kindListState = rememberLazyListState()
            LazyRow(
                state = kindListState,
                modifier = Modifier
                    .fillMaxWidth()
                    .fadingEdge(kindListState),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                groupNames?.takeIf { it.isNotBlank() }?.let {
                    item(key = "group-$it") {
                        val translatedGroupName by io.legado.app.utils.translateAsState(it)
                        TextCard(
                            text = stringResource(R.string.group_s, translatedGroupName),
                            textStyle = LegadoTheme.typography.labelLargeEmphasized,
                            backgroundColor = LegadoTheme.colorScheme.surfaceContainer,
                            contentColor = LegadoTheme.colorScheme.onSurface,
                        )
                    }
                }
                itemsIndexed(
                    items = kindLabels,
                    key = { index, label -> "kind-$index-$label" }
                ) { _, label ->
                    val translatedLabel by io.legado.app.utils.translateAsState(label)
                    TextCard(
                        text = translatedLabel,
                        textStyle = LegadoTheme.typography.labelLargeEmphasized,
                        backgroundColor = LegadoTheme.colorScheme.surfaceContainer,
                        contentColor = LegadoTheme.colorScheme.onSurface,
                        onClick = { onKindClick(label) }
                    )
                }
            }
        }
    }
}

@Composable
private fun BookInfoHeader(
    book: BookInfoBookUi,
    kindLabels: List<String>,
    groupNames: String?,
    systemSurfaceColor: Color,
    onCoverClick: () -> Unit,
    onCoverLongClick: () -> Unit,
    onAuthorClick: (Boolean) -> Unit,
    onBookNameClick: (Boolean) -> Unit,
    onOriginClick: () -> Unit,
    onKindClick: (String) -> Unit,
    sharedTransitionScope: SharedTransitionScope?,
    animatedVisibilityScope: AnimatedVisibilityScope?,
    sharedCoverKey: String?,
    topPadding: androidx.compose.ui.unit.Dp = 0.dp,
) {
    val context = LocalContext.current
    val windowManager = remember(context) { context.getSystemService(android.content.Context.WINDOW_SERVICE) as WindowManager }
    val hasBgImage = remember(context) {
        ThemeConfigStore.getBookDetailBgImage(context, windowManager.windowSize) != null ||
        ThemeConfigStore.getBgImage(context, windowManager.windowSize) != null
    }

    val style = ThemeConfig.bookDetailHeaderStyle

    when (style) {
        "1" -> {
            // Option 1: Transparent (trong suốt lấy ảnh bìa nền làm chủ, như ảnh số 1)
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = topPadding + 16.dp, bottom = 8.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Column(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    BookInfoHeaderContent(
                        book = book,
                        kindLabels = kindLabels,
                        groupNames = groupNames,
                        onCoverClick = onCoverClick,
                        onCoverLongClick = onCoverLongClick,
                        onAuthorClick = onAuthorClick,
                        onBookNameClick = onBookNameClick,
                        onOriginClick = onOriginClick,
                        onKindClick = onKindClick,
                        sharedTransitionScope = sharedTransitionScope,
                        animatedVisibilityScope = animatedVisibilityScope,
                        sharedCoverKey = sharedCoverKey
                    )
                }
            }
        }
        "2" -> {
            // Option 2: Card frame container (thêm nền cho khung bìa truyện như ảnh số 2)
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, bottom = 8.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                val isDark = LegadoTheme.isDark
                val cardBgPath = if (isDark) ThemeConfig.bgImageBookDetailCardDark
                                 else ThemeConfig.bgImageBookDetailCardLight
                val cardBgBitmap = remember(cardBgPath) {
                    if (!cardBgPath.isNullOrBlank()) {
                        try {
                            android.graphics.BitmapFactory.decodeFile(cardBgPath)
                        } catch (e: Exception) {
                            null
                        }
                    } else null
                }

                NormalCard(
                    modifier = Modifier.fillMaxWidth().heightIn(min = 220.dp + topPadding),
                    cornerRadius = 16.dp,
                    containerColor = if (cardBgBitmap != null) Color.Transparent
                                     else (if (isDark) LegadoTheme.colorScheme.surfaceContainerHigh
                                           else Color.White.copy(alpha = 0.85f)),
                    border = if (cardBgBitmap != null) null
                             else BorderStroke(
                                 width = 1.dp,
                                 color = LegadoTheme.colorScheme.outlineVariant.copy(alpha = 0.35f)
                             )
                ) {
                    Box(modifier = Modifier.fillMaxWidth().heightIn(min = 220.dp + topPadding)) {
                        if (cardBgBitmap != null) {
                            androidx.compose.foundation.Image(
                                bitmap = cardBgBitmap.asImageBitmap(),
                                contentDescription = null,
                                modifier = Modifier.matchParentSize(),
                                contentScale = androidx.compose.ui.layout.ContentScale.FillBounds
                            )
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(
                                    top = topPadding + 20.dp,
                                    bottom = 20.dp,
                                    start = 20.dp,
                                    end = 20.dp
                                ),
                            horizontalArrangement = Arrangement.spacedBy(20.dp),
                            verticalAlignment = Alignment.Top,
                        ) {
                            Box(
                                modifier = Modifier
                                    .width(132.dp)
                                    .combinedClickable(onClick = onCoverClick, onLongClick = onCoverLongClick)
                            ) {
                                CoilBookCover(
                                    name = book.name,
                                    author = book.author,
                                    path = book.coverPath,
                                    sourceOrigin = book.origin,
                                    modifier = Modifier
                                        .width(132.dp)
                                        .aspectRatio(5f / 7f),
                                    showLoadingPlaceholder = sharedCoverKey == null,
                                    sharedTransitionScope = sharedTransitionScope,
                                    animatedVisibilityScope = animatedVisibilityScope,
                                    sharedCoverKey = sharedCoverKey
                                )
                            }
                            Column(
                                modifier = Modifier
                                    .weight(1f)
                                    .align(Alignment.CenterVertically)
                                    .padding(top = 12.dp, bottom = 12.dp),
                                verticalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                var showTitleMenu by remember { mutableStateOf(false) }
                                var isTitleExpanded by rememberSaveable { mutableStateOf(false) }
                                val translatedBookName by io.legado.app.utils.translateAsState(book.name)
                                Box {
                                    AppText(
                                        text = translatedBookName,
                                        style = LegadoTheme.typography.headlineSmall,
                                        fontWeight = FontWeight.Bold,
                                        maxLines = if (isTitleExpanded) Int.MAX_VALUE else 2,
                                        modifier = Modifier.combinedClickable(
                                            onClick = { onBookNameClick(false) },
                                            onLongClick = { showTitleMenu = true }
                                        )
                                    )
                                    RoundDropdownMenu(
                                        expanded = showTitleMenu,
                                        onDismissRequest = { showTitleMenu = false }
                                    ) {
                                        RoundDropdownMenuItem(
                                            text = stringResource(R.string.search),
                                            onClick = {
                                                showTitleMenu = false
                                                onBookNameClick(true)
                                            }
                                        )
                                        RoundDropdownMenuItem(
                                            text = stringResource(if (isTitleExpanded) R.string.collapse else R.string.expand),
                                            onClick = {
                                                showTitleMenu = false
                                                isTitleExpanded = !isTitleExpanded
                                            }
                                        )
                                    }
                                }
                                val translatedAuthor by io.legado.app.utils.translateAsState(book.realAuthor)
                                AppText(
                                    text = stringResource(R.string.author_show, translatedAuthor),
                                    style = LegadoTheme.typography.bodyLarge,
                                    color = LegadoTheme.colorScheme.onSurfaceVariant,
                                    modifier = Modifier.combinedClickable(
                                        onClick = { onAuthorClick(false) },
                                        onLongClick = { onAuthorClick(true) }
                                    )
                                )
                                AppText(
                                    text = stringResource(R.string.origin_show, book.originName),
                                    style = LegadoTheme.typography.labelMedium,
                                    color = LegadoTheme.colorScheme.primary,
                                    modifier = Modifier.clickable(onClick = onOriginClick)
                                )
                            }
                        }
                    }
                }

                // Tags go outside card
                if (kindLabels.isNotEmpty() || !groupNames.isNullOrBlank()) {
                    val kindListState = rememberLazyListState()
                    LazyRow(
                        state = kindListState,
                        modifier = Modifier
                            .fillMaxWidth()
                            .fadingEdge(kindListState),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                        groupNames?.takeIf { it.isNotBlank() }?.let {
                            item(key = "group-$it") {
                                val translatedGroupName by io.legado.app.utils.translateAsState(it)
                                TextCard(
                                    text = stringResource(R.string.group_s, translatedGroupName),
                                    textStyle = LegadoTheme.typography.labelLargeEmphasized,
                                    backgroundColor = MaterialTheme.colorScheme.surfaceVariant,
                                    contentColor = MaterialTheme.colorScheme.onSurfaceVariant,
                                )
                            }
                        }
                        itemsIndexed(
                            items = kindLabels,
                            key = { index, label -> "kind-$index-$label" }
                        ) { _, label ->
                            val translatedLabel by io.legado.app.utils.translateAsState(label)
                            TextCard(
                                text = translatedLabel,
                                textStyle = LegadoTheme.typography.labelLargeEmphasized,
                                backgroundColor = MaterialTheme.colorScheme.surfaceVariant,
                                contentColor = MaterialTheme.colorScheme.onSurfaceVariant,
                                onClick = { onKindClick(label) }
                            )
                        }
                    }
                }
            }
        }
        else -> {
            // Option 3: Default (Mặc định lúc như cũ nhé)
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                lerp(systemSurfaceColor, LegadoTheme.seedColor, 0.08f)
                                    .copy(alpha = 0.5f),
                                systemSurfaceColor,
                            )
                        )
                    )
                    .padding(top = 16.dp, bottom = 8.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Column(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    BookInfoHeaderContent(
                        book = book,
                        kindLabels = kindLabels,
                        groupNames = groupNames,
                        onCoverClick = onCoverClick,
                        onCoverLongClick = onCoverLongClick,
                        onAuthorClick = onAuthorClick,
                        onBookNameClick = onBookNameClick,
                        onOriginClick = onOriginClick,
                        onKindClick = onKindClick,
                        sharedTransitionScope = sharedTransitionScope,
                        animatedVisibilityScope = animatedVisibilityScope,
                        sharedCoverKey = sharedCoverKey
                    )
                }
            }
        }
    }
}

@Composable
private fun BookInfoActions(
    inBookshelf: Boolean,
    showSource: Boolean = true,
    bookUrl: String = "",
    bookName: String = "",
    bookOrigin: String = "",
    onShelfClick: () -> Unit,
    onTocClick: () -> Unit,
    onGroupClick: () -> Unit,
    onSourceClick: () -> Unit,
    onReadRecordClick: () -> Unit,
) {
    var awaitingShelfAddition by rememberSaveable { mutableStateOf(false) }
    var showShelfRemoveHint by rememberSaveable { mutableStateOf(false) }
    var showLongPressGroupHint by rememberSaveable { mutableStateOf(false) }

    LaunchedEffect(inBookshelf) {
        if (awaitingShelfAddition && inBookshelf) {
            awaitingShelfAddition = false
            showShelfRemoveHint = true
            delay(1000)
            showShelfRemoveHint = false
            showLongPressGroupHint = true
            delay(1000)
            showLongPressGroupHint = false
        } else if (!inBookshelf) {
            awaitingShelfAddition = false
            showShelfRemoveHint = false
            showLongPressGroupHint = false
        }
    }

    val shelfLabel = when {
        showShelfRemoveHint -> stringResource(R.string.click_to_remove)
        showLongPressGroupHint -> stringResource(R.string.long_press_group)
        inBookshelf -> stringResource(R.string.already_in_bookshelf)
        else -> stringResource(R.string.add_to_bookshelf)
    }

    val context = LocalContext.current
    val windowManager = remember(context) { context.getSystemService(android.content.Context.WINDOW_SERVICE) as WindowManager }
    val hasBgImage = remember(context) {
        ThemeConfigStore.getBookDetailBgImage(context, windowManager.windowSize) != null ||
        ThemeConfigStore.getBgImage(context, windowManager.windowSize) != null
    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(if (hasBgImage) Color.Transparent else LegadoTheme.colorScheme.surface)
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        BookInfoActionCard(
            modifier = Modifier.weight(1f),
            icon = if (inBookshelf) Icons.Outlined.Book else Icons.Default.BookmarkAdd,
            label = shelfLabel,
            onLongClick = onGroupClick,
            onClick = {
                if (!inBookshelf) {
                    awaitingShelfAddition = true
                } else {
                    awaitingShelfAddition = false
                    showShelfRemoveHint = false
                    showLongPressGroupHint = false
                }
                onShelfClick()
            },
        )
        BookInfoActionCard(
            modifier = Modifier.weight(1f),
            icon = Icons.AutoMirrored.Outlined.FormatListBulleted,
            label = stringResource(R.string.view_toc),
            onClick = onTocClick
        )
        if (showSource) {
            BookInfoActionCard(
                modifier = Modifier.weight(1f),
                icon = Icons.Default.Code,
                label = stringResource(R.string.book_source),
                onClick = onSourceClick
            )
        } else {
            val context = LocalContext.current
            BookInfoActionCard(
                modifier = Modifier.weight(1f),
                icon = Icons.Default.Language,
                label = "Mở trang web",
                onClick = {
                    if (bookUrl.isNotBlank()) {
                        try {
                            val intent = Intent(context, WebViewActivity::class.java).apply {
                                putExtra("url", bookUrl)
                                putExtra("title", bookName)
                                putExtra("sourceName", bookName)
                                putExtra("sourceOrigin", bookOrigin)
                            }
                            context.startActivity(intent)
                        } catch (e: Exception) {
                            // ignore
                        }
                    }
                }
            )
        }
        BookInfoActionCard(
            modifier = Modifier.weight(1f),
            icon = Icons.Default.Timeline,
            label = stringResource(R.string.read_record),
            onClick = onReadRecordClick
        )
    }
}

@Composable
private fun BookInfoActionCard(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    label: String,
    onLongClick: (() -> Unit)? = null,
    onClick: () -> Unit
) {
    GlassCard(
        modifier = modifier,
        onLongClick = onLongClick,
        onClick = onClick,
        containerColor = LegadoTheme.colorScheme.surfaceContainerLow,
        contentColor = LegadoTheme.colorScheme.onSurface,
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 12.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            AppIcon(icon, null)
            AnimatedTextLine(
                text = label,
                style = LegadoTheme.typography.bodySmall,
                maxLines = 2,
            )
        }
    }
}

@Composable
private fun BookInfoSummary(
    book: BookInfoBookUi,
    hasChapters: Boolean,
    onRemarkClick: () -> Unit,
) {
    val context = LocalContext.current
    val windowManager = remember(context) { context.getSystemService(android.content.Context.WINDOW_SERVICE) as WindowManager }
    val hasBgImage = remember(context) {
        ThemeConfigStore.getBookDetailBgImage(context, windowManager.windowSize) != null ||
        ThemeConfigStore.getBgImage(context, windowManager.windowSize) != null
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(if (hasBgImage) Color.Transparent else LegadoTheme.colorScheme.surface)
            .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 120.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        AnimatedTextLine(
            text = stringResource(R.string.toc_s, book.durChapterTitle ?: stringResource(R.string.loading)),
            style = LegadoTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
        )
        AnimatedTextLine(
            text = stringResource(R.string.lasted_show, book.latestChapterTitle ?: ""),
            style = LegadoTheme.typography.bodyMedium,
            color = LegadoTheme.colorScheme.onSurfaceVariant,
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            AnimatedTextLine(
                text = stringResource(R.string.read_chapter_total, book.totalChapterNum),
                style = LegadoTheme.typography.labelMedium,
                color = LegadoTheme.colorScheme.primary,
                fontWeight = FontWeight.Bold,
            )
            AppText(
                text = "|",
                color = LegadoTheme.colorScheme.secondary
            )
            AnimatedTextLine(
                text = if (book.durChapterIndex + 1 == book.totalChapterNum && book.totalChapterNum > 0) "Đọc" else stringResource(R.string.read_chapter_index, book.durChapterIndex + 1),
                style = LegadoTheme.typography.labelMedium,
                color = LegadoTheme.colorScheme.secondary,
            )
            if (!hasChapters) {
                AppText(
                    text = " · ",
                    color = LegadoTheme.colorScheme.secondary
                )
                AnimatedTextLine(
                    text = stringResource(R.string.error_load_toc),
                    style = LegadoTheme.typography.labelMedium,
                    color = LegadoTheme.colorScheme.error
                )
            }
        }
        Spacer(modifier = Modifier.height(4.dp))
        book.remark?.takeIf { it.isNotBlank() }?.let { remark ->
            GlassCard(
                modifier = Modifier.fillMaxWidth(),
                onClick = onRemarkClick,
                containerColor = LegadoTheme.colorScheme.surfaceContainerLow,
            ) {
                Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    AnimatedTextLine(
                        text = remark,
                        style = LegadoTheme.typography.labelMediumEmphasized
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        AppText(
            text = stringResource(R.string.book_intro),
            style = LegadoTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = LegadoTheme.colorScheme.onSurface
        )

        val translatedIntro by io.legado.app.utils.translateAsState(book.displayIntro.orEmpty())
        val introText = translatedIntro.ifBlank { stringResource(R.string.intro_show_null) }
        var isIntroExpanded by remember { mutableStateOf(false) }

        GlassCard(
            modifier = Modifier.fillMaxWidth(),
            containerColor = LegadoTheme.colorScheme.surfaceContainerLow,
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                AppText(
                    text = introText,
                    style = LegadoTheme.typography.bodyMedium,
                    color = LegadoTheme.colorScheme.onSurfaceVariant,
                    maxLines = if (isIntroExpanded) Int.MAX_VALUE else 4,
                    overflow = androidx.compose.ui.text.style.TextOverflow.Ellipsis,
                    lineHeight = 22.sp
                )

                if (introText.length > 150) {
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { isIntroExpanded = !isIntroExpanded },
                        horizontalArrangement = Arrangement.End
                    ) {
                        AppText(
                            text = if (isIntroExpanded) "Thu gọn" else "Xem thêm",
                            style = LegadoTheme.typography.labelMedium,
                            color = LegadoTheme.colorScheme.primary,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}
@Composable
private fun BookInfoDialogs(
    state: BookInfoUiState,
    onIntent: (BookInfoIntent) -> Unit,
) {
    val dialog = state.dialog
    var deleteOriginal by remember(dialog, state.deleteOriginal) { mutableStateOf(state.deleteOriginal) }
    var remarkText by remember(dialog) { mutableStateOf((dialog as? BookInfoDialog.EditRemark)?.remark.orEmpty()) }

    AppAlertDialog(
        data = dialog as? BookInfoDialog.DeleteBook,
        onDismissRequest = { onIntent(BookInfoIntent.DismissDialog) },
        title = stringResource(R.string.draw),
        text = stringResource(R.string.sure_del),
        confirmText = stringResource(android.R.string.ok),
        onConfirm = {
            onIntent(BookInfoIntent.ConfirmDelete(deleteOriginal))
        },
        dismissText = stringResource(android.R.string.cancel),
        onDismiss = { onIntent(BookInfoIntent.DismissDialog) },
        content = { d ->
            if (d.isLocal) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    androidx.compose.material3.Checkbox(
                        checked = deleteOriginal,
                        onCheckedChange = { deleteOriginal = it },
                        colors = androidx.compose.material3.CheckboxDefaults.colors(
                            checkedColor = LegadoTheme.colorScheme.primary,
                            checkmarkColor = LegadoTheme.colorScheme.onPrimary,
                            uncheckedColor = LegadoTheme.colorScheme.onSurfaceVariant,
                        )
                    )
                    Text(text = stringResource(R.string.delete_book_file))
                }
            }
        }
    )

    AppAlertDialog(
        data = dialog as? BookInfoDialog.EditRemark,
        onDismissRequest = { onIntent(BookInfoIntent.DismissDialog) },
        title = stringResource(R.string.edit_remark),
        confirmText = stringResource(android.R.string.ok),
        onConfirm = { onIntent(BookInfoIntent.UpdateRemark(remarkText)) },
        dismissText = stringResource(android.R.string.cancel),
        onDismiss = { onIntent(BookInfoIntent.DismissDialog) },
        content = {
            AppTextField(
                value = remarkText,
                onValueChange = { remarkText = it },
                label = stringResource(R.string.book_remark),
                modifier = Modifier.fillMaxWidth(),
            )
        }
    )

    val unsupportedWebFile = dialog as? BookInfoDialog.UnsupportedWebFile
    AppAlertDialog(
        data = unsupportedWebFile,
        onDismissRequest = { onIntent(BookInfoIntent.DismissDialog) },
        title = stringResource(R.string.draw),
        text = unsupportedWebFile?.let {
            stringResource(
                R.string.file_not_supported,
                it.webFile.name
            )
        },
        confirmText = stringResource(R.string.open_fun),
        onConfirm = { onIntent(BookInfoIntent.OpenUnsupportedWebFile(it.webFile)) },
        dismissText = stringResource(android.R.string.cancel),
        onDismiss = { onIntent(BookInfoIntent.DismissDialog) },
    )

    AppAlertDialog(
        data = dialog as? BookInfoDialog.PhotoPreview,
        onDismissRequest = { onIntent(BookInfoIntent.DismissDialog) },
        title = stringResource(R.string.img_cover),
        confirmText = "Lưu vào album",
        onConfirm = { d ->
            onIntent(BookInfoIntent.SaveCover(d.path))
            onIntent(BookInfoIntent.DismissDialog)
        },
        dismissText = stringResource(android.R.string.cancel),
        onDismiss = { onIntent(BookInfoIntent.DismissDialog) },
        content = { d ->
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                CoilBookCover(
                    name = state.book?.name,
                    author = state.book?.author,
                    path = d.path,
                    sourceOrigin = state.book?.origin,
                    ignoreUseDefaultCover = true,
                    modifier = Modifier
                        .heightIn(max = 420.dp)
                        .fillMaxWidth(0.6f)
                )
            }
        }
    )

    AppAlertDialog(
        show = state.isBusy,
        onDismissRequest = {},
        content = {
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                AppCircularProgressIndicator()
            }
        }
    )

    AppLogSheet(show = state.showAppLogSheet, onDismissRequest = { onIntent(BookInfoIntent.DismissAppLogSheet) })
}

@Composable
private fun RelatedBooksBanner(
    title: String,
    books: ImmutableList<SearchBook>,
    onBookClick: (SearchBook, String?) -> Unit,
    onMoreClick: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp)
    ) {
        if (title.isNotBlank()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                AppText(
                    text = title,
                    style = LegadoTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(1f),
                )
                SmallTonalButton(
                    onClick = onMoreClick,
                    icon = Icons.AutoMirrored.Filled.ArrowForward,
                    contentDescription = "more",
                )
            }
        }
        BannerModule(
            books = books.map { io.legado.app.ui.main.homepage.HomepageBookItemUi(book = it) }
                .toImmutableList(),
            onClick = onBookClick,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
        )
    }
}

@Composable
private fun rememberShimmerOffset(): Float {
    val infiniteTransition = rememberInfiniteTransition(label = "shimmer")
    val offset by infiniteTransition.animateFloat(
        initialValue = -1f,
        targetValue = 2f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 2000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart,
        ),
        label = "shimmerOffset",
    )
    return offset
}

@Composable
private fun SkeletonBox(
    modifier: Modifier = Modifier,
    cornerRadius: Dp = 8.dp,
    shimmerOffset: Float,
) {
    val colorScheme = LegadoTheme.colorScheme
    val colors = remember(colorScheme) {
        listOf(
            colorScheme.surfaceContainerHighest,
            colorScheme.surfaceContainerHigh,
            colorScheme.surfaceContainerHighest,
        )
    }

    var positionInRoot by remember { mutableStateOf(Offset.Zero) }

    val brush = remember(shimmerOffset, positionInRoot, colors) {
        val globalOffset = shimmerOffset * 2000f
        Brush.linearGradient(
            colors = colors,
            start = Offset(globalOffset - positionInRoot.x, globalOffset - positionInRoot.y),
            end = Offset(globalOffset + 400f - positionInRoot.x, globalOffset + 400f - positionInRoot.y),
        )
    }

    Box(
        modifier = modifier
            .onGloballyPositioned { coordinates ->
                positionInRoot = coordinates.positionInRoot()
            }
            .clip(RoundedCornerShape(cornerRadius))
            .background(brush)
    )
}

@Composable
private fun BookInfoSkeleton(
    paddingValues: PaddingValues,
) {
    val shimmerOffset = rememberShimmerOffset()
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = paddingValues.calculateTopPadding(), bottom = paddingValues.calculateBottomPadding())
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        
        // 1. Centered Cover Placeholder
        SkeletonBox(
            modifier = Modifier
                .width(140.dp)
                .aspectRatio(5f / 7f),
            cornerRadius = 16.dp,
            shimmerOffset = shimmerOffset
        )
        
        // 2. Title Placeholder
        SkeletonBox(
            modifier = Modifier
                .width(180.dp)
                .height(24.dp),
            cornerRadius = 6.dp,
            shimmerOffset = shimmerOffset
        )
        
        // 3. Author Placeholder
        SkeletonBox(
            modifier = Modifier
                .width(100.dp)
                .height(16.dp),
            cornerRadius = 4.dp,
            shimmerOffset = shimmerOffset
        )
        
        // 4. Source/Pill Placeholder
        SkeletonBox(
            modifier = Modifier
                .width(120.dp)
                .height(20.dp),
            cornerRadius = 10.dp,
            shimmerOffset = shimmerOffset
        )
        
        // 5. Tags/Pills Row
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            repeat(3) {
                SkeletonBox(
                    modifier = Modifier
                        .width(70.dp)
                        .height(24.dp),
                    cornerRadius = 12.dp,
                    shimmerOffset = shimmerOffset
                )
            }
        }
        
        Spacer(modifier = Modifier.height(8.dp))
        
        // 6. Action Buttons Row (5 circles)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            repeat(5) {
                SkeletonBox(
                    modifier = Modifier
                        .size(48.dp),
                    cornerRadius = 24.dp,
                    shimmerOffset = shimmerOffset
                )
            }
        }
        
        Spacer(modifier = Modifier.height(16.dp))
        
        // 7. Introduction Block
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            SkeletonBox(
                modifier = Modifier
                    .width(80.dp)
                    .height(20.dp),
                cornerRadius = 4.dp,
                shimmerOffset = shimmerOffset
            )
            
            // Description card skeleton background
            GlassCard(
                modifier = Modifier.fillMaxWidth(),
                containerColor = LegadoTheme.colorScheme.surfaceContainerLow,
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    SkeletonBox(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(14.dp),
                        cornerRadius = 4.dp,
                        shimmerOffset = shimmerOffset
                    )
                    SkeletonBox(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(14.dp),
                        cornerRadius = 4.dp,
                        shimmerOffset = shimmerOffset
                    )
                    SkeletonBox(
                        modifier = Modifier
                            .fillMaxWidth(0.9f)
                            .height(14.dp),
                        cornerRadius = 4.dp,
                        shimmerOffset = shimmerOffset
                    )
                    SkeletonBox(
                        modifier = Modifier
                            .fillMaxWidth(0.6f)
                            .height(14.dp),
                        cornerRadius = 4.dp,
                        shimmerOffset = shimmerOffset
                    )
                }
            }
        }
    }
}

