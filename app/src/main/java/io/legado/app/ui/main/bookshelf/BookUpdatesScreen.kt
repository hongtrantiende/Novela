package io.legado.app.ui.main.bookshelf

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDownward
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.LaunchedEffect
import io.legado.app.ui.widget.components.modalBottomSheet.AppModalBottomSheet
import io.legado.app.ui.widget.components.heatmap.HEATMAP_CALENDAR_TITLE
import io.legado.app.ui.widget.components.heatmap.HeatmapCalendarEndAction
import io.legado.app.ui.widget.components.heatmap.HeatmapCalendarStartAction
import io.legado.app.ui.book.readRecord.HeatmapCalendarSection
import io.legado.app.ui.widget.components.heatmap.HeatmapConfig
import io.legado.app.ui.widget.components.heatmap.HeatmapMode
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalContext
import io.legado.app.ui.widget.components.CollapsibleHeader
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import io.legado.app.R
import io.legado.app.ui.config.themeConfig.ThemeConfig
import io.legado.app.ui.theme.LegadoTheme
import io.legado.app.ui.widget.components.AppPullToRefresh
import io.legado.app.ui.widget.components.AppScaffold
import io.legado.app.ui.widget.components.EmptyMessage
import io.legado.app.ui.widget.components.image.cover.CoilBookCover
import io.legado.app.ui.widget.components.topbar.GlassMediumFlexibleTopAppBar
import io.legado.app.ui.widget.components.topbar.GlassTopAppBarDefaults
import io.legado.app.ui.widget.components.topbar.TopBarActionButton
import org.koin.androidx.compose.koinViewModel
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale
import kotlin.math.abs

fun formatUpdateGroupHeader(timestamp: Long): String {
    val curTime = Calendar.getInstance()
    val updateTime = Calendar.getInstance().apply { timeInMillis = timestamp }
    
    val curDate = Calendar.getInstance().apply {
        set(Calendar.HOUR_OF_DAY, 0)
        set(Calendar.MINUTE, 0)
        set(Calendar.SECOND, 0)
        set(Calendar.MILLISECOND, 0)
    }
    val updateDate = Calendar.getInstance().apply {
        timeInMillis = timestamp
        set(Calendar.HOUR_OF_DAY, 0)
        set(Calendar.MINUTE, 0)
        set(Calendar.SECOND, 0)
        set(Calendar.MILLISECOND, 0)
    }
    
    val diffMillis = curDate.timeInMillis - updateDate.timeInMillis
    val diffDays = diffMillis / (24 * 60 * 60 * 1000)
    
    return when {
        diffDays == 0L -> "Hôm nay"
        diffDays == 1L -> "Hôm qua"
        diffDays in 2L..7L -> "$diffDays ngày trước"
        diffDays < 0L -> "Mới"
        else -> {
            val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
            sdf.format(Date(timestamp))
        }
    }
}

@Composable
fun DateHeaderItem(title: String) {
    CollapsibleHeader(
        showIcon = false,
        isCollapsed = false,
        onToggle = { },
        title = "",
        titleContent = {
            Text(
                text = title,
                style = LegadoTheme.typography.bodyMediumEmphasized,
                color = LegadoTheme.colorScheme.primary
            )
        }
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ChapterUpdateRow(
    item: ChapterUpdateItem,
    onClick: () -> Unit,
    onLongClick: (() -> Unit)?,
    onDownloadClick: () -> Unit
) {
    val book = item.book
    val chapter = item.chapter
    val status = item.status
    val progressText = item.progressText

    val isFaded = status == ChapterReadStatus.READ

    val nodeRadius = 4.dp
    val lineWidth = 2.dp
    val timelineX = 24.dp
    val contentPaddingStart = 32.dp

    val lineColor = LegadoTheme.colorScheme.surfaceContainerHigh
    val nodeColor = if (status == ChapterReadStatus.UNREAD || status == ChapterReadStatus.CURRENT) {
        LegadoTheme.colorScheme.primary
    } else {
        LegadoTheme.colorScheme.outlineVariant.copy(alpha = 0.5f)
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .combinedClickable(
                onClick = onClick,
                onLongClick = onLongClick
            )
            .drawBehind {
                val x = timelineX.toPx()
                val h = size.height
                val cy = h / 2f

                drawLine(
                    color = lineColor,
                    start = Offset(x, 0f),
                    end = Offset(x, h),
                    strokeWidth = lineWidth.toPx()
                )

                drawCircle(
                    color = nodeColor,
                    radius = nodeRadius.toPx(),
                    center = Offset(x, cy)
                )
            }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = contentPaddingStart, end = 16.dp, top = 8.dp, bottom = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            val timeFormat = remember { SimpleDateFormat("HH:mm", Locale.getDefault()) }
            val timeStr = remember(item.updateTime) { timeFormat.format(Date(item.updateTime)) }
            Column(
                modifier = Modifier.width(48.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = timeStr,
                    style = LegadoTheme.typography.bodySmall,
                    color = if (isFaded) {
                        LegadoTheme.colorScheme.onSurface.copy(alpha = 0.35f)
                    } else {
                        LegadoTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                    }
                )
            }

            CoilBookCover(
                name = book.name,
                author = book.author,
                path = book.getDisplayCover(),
                modifier = Modifier.width(44.dp),
                radius = 4.dp
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = book.name,
                    style = LegadoTheme.typography.bodyLargeEmphasized.copy(
                        fontWeight = FontWeight.Medium,
                        fontSize = 15.sp
                    ),
                    color = if (isFaded) {
                        LegadoTheme.colorScheme.onSurface.copy(alpha = 0.5f)
                    } else {
                        LegadoTheme.colorScheme.onSurface
                    },
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                Spacer(modifier = Modifier.height(2.dp))

                val primaryColor = LegadoTheme.colorScheme.primary
                val chapterText = remember(chapter.title, progressText, status, primaryColor) {
                    buildAnnotatedString {
                        if (status == ChapterReadStatus.UNREAD || status == ChapterReadStatus.CURRENT) {
                            withStyle(SpanStyle(color = primaryColor, fontWeight = FontWeight.Bold)) {
                                append("• ")
                            }
                        }
                        append(chapter.title)
                        if (!progressText.isNullOrBlank()) {
                            append(" • ")
                            append(progressText)
                        }
                    }
                }

                Text(
                    text = chapterText,
                    style = LegadoTheme.typography.bodyMedium,
                    color = if (isFaded) {
                        LegadoTheme.colorScheme.onSurface.copy(alpha = 0.35f)
                    } else {
                        LegadoTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                    },
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            Box(
                modifier = Modifier
                    .size(32.dp)
                    .border(1.dp, LegadoTheme.colorScheme.outlineVariant.copy(alpha = 0.5f), CircleShape)
                    .clip(CircleShape)
                    .clickable { onDownloadClick() },
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowDownward,
                    contentDescription = "Tải xuống",
                    tint = LegadoTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.7f),
                    modifier = Modifier.size(16.dp)
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class, ExperimentalFoundationApi::class)
@Composable
fun BookUpdatesScreen(
    viewModel: BookUpdatesViewModel = koinViewModel(),
    onBookClick: (BookShelfItem) -> Unit,
    onBookLongClick: (BookShelfItem) -> Unit
) {
    val updatesList by viewModel.updatesList.collectAsStateWithLifecycle()
    val isRefreshing by viewModel.isRefreshing.collectAsStateWithLifecycle()
    val scrollBehavior = GlassTopAppBarDefaults.defaultScrollBehavior()
    val listState = rememberLazyListState()
    val context = LocalContext.current

    val selectedDate by viewModel.selectedDate.collectAsStateWithLifecycle()
    val dailyUpdateCounts by viewModel.dailyUpdateCounts.collectAsStateWithLifecycle()
    val dailyUpdateTimes = remember(dailyUpdateCounts) {
        dailyUpdateCounts.mapValues { it.value.toLong() }
    }
    var showCalendar by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        viewModel.refresh(force = false)
    }

    AppScaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        contentWindowInsets = WindowInsets.systemBars
            .only(WindowInsetsSides.Horizontal + WindowInsetsSides.Top),
        topBar = {
            val subTitle = selectedDate?.let { "Cập nhật ngày ${it.dayOfMonth}/${it.monthValue}" } ?: "Dòng thời gian"
            GlassMediumFlexibleTopAppBar(
                title = "Lịch sử cập nhật",
                subtitle = subTitle,
                actions = {
                    TopBarActionButton(
                        onClick = { viewModel.refresh(force = true) },
                        imageVector = Icons.Default.Refresh,
                        contentDescription = stringResource(R.string.refresh)
                    )
                    TopBarActionButton(
                        onClick = { showCalendar = !showCalendar },
                        imageVector = Icons.Default.CalendarMonth,
                        contentDescription = "Lịch cập nhật"
                    )
                },
                scrollBehavior = scrollBehavior
            )
        }
    ) { paddingValues ->
        AppModalBottomSheet(
            show = showCalendar,
            onDismissRequest = { showCalendar = false },
            title = HEATMAP_CALENDAR_TITLE,
            startAction = {},
            endAction = {
                HeatmapCalendarEndAction(
                    onClearDate = {
                        viewModel.setSelectedDate(null)
                        showCalendar = false
                    }
                )
            }
        ) {
            HeatmapCalendarSection(
                dailyReadCounts = dailyUpdateCounts,
                dailyReadTimes = dailyUpdateTimes,
                currentMode = HeatmapMode.COUNT,
                selectedDate = selectedDate,
                onDateSelected = { date ->
                    viewModel.setSelectedDate(date)
                    showCalendar = false
                }
            )
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = paddingValues.calculateTopPadding())
        ) {
            Box(modifier = Modifier.fillMaxSize()) {
                AppPullToRefresh(
                    isRefreshing = isRefreshing,
                    onRefresh = { viewModel.refresh(force = true) },
                    enabled = true,
                    topPadding = 0.dp
                ) {
                    if (updatesList.isEmpty()) {
                        EmptyMessage(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(bottom = 120.dp),
                            message = "Không có truyện nào có chương mới"
                        )
                    } else {
                        LazyColumn(
                            state = listState,
                            modifier = Modifier.fillMaxSize(),
                            contentPadding = PaddingValues(
                                top = 0.dp,
                                bottom = if (ThemeConfig.useFloatingBottomBar || ThemeConfig.enableBlur) 120.dp else 8.dp,
                                start = 0.dp,
                                end = 0.dp
                            ),
                            verticalArrangement = Arrangement.spacedBy(0.dp)
                        ) {
                            val grouped = updatesList.groupBy { formatUpdateGroupHeader(it.updateTime) }
                            
                            grouped.forEach { (dateHeader, itemsInGroup) ->
                                stickyHeader {
                                    DateHeaderItem(dateHeader)
                                }
                                
                                items(itemsInGroup, key = { "${it.book.bookUrl}_${it.chapter.index}" }) { item ->
                                    ChapterUpdateRow(
                                        item = item,
                                        onClick = { viewModel.openChapter(context, item.book, item.chapter.index) },
                                        onLongClick = { onBookLongClick(item.book) },
                                        onDownloadClick = { viewModel.downloadChapter(context, item.book, item.chapter.index) }
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
