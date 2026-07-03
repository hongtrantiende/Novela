package io.legado.app.ui.book.read.sheet

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.platform.LocalContext
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material.icons.filled.Tune
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.legado.app.R
import io.legado.app.ui.book.read.ReadBookIntent
import io.legado.app.ui.book.read.ReadBookUiState
import io.legado.app.ui.widget.components.button.series.MediumTonalButton
import io.legado.app.ui.widget.components.image.cover.BookCoverImage
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import io.legado.app.ui.theme.LegadoTheme
import io.legado.app.ui.widget.components.AppSlider
import java.util.Locale
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.LaunchedEffect
import io.legado.app.service.BaseReadAloudService
import kotlinx.coroutines.delay

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ReadAloudContent(
    state: ReadBookUiState,
    onIntent: (ReadBookIntent) -> Unit,
    onDismissRequest: () -> Unit,
    onOpenChapterList: () -> Unit = {},
    onGoToBackground: () -> Unit,
    onShowReadAloudConfig: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    var showChapterList by remember { mutableStateOf(false) }

    // Load chapter list from DB
    val chapters = remember(state.book?.bookUrl) {
        state.book?.bookUrl?.let { bookUrl ->
            io.legado.app.data.appDb.bookChapterDao.getChapterList(bookUrl)
        } ?: emptyList()
    }

    val timerMinute = state.readAloudTtsTimer
    val httpTts = io.legado.app.model.ReadAloud.httpTTS
    val ttsSpeechRate = if (httpTts != null) {
        val currentSpeedValue = httpTts.loginUrl?.toFloatOrNull() ?: 1.0f
        (currentSpeedValue * 10f - 5f).toInt().coerceIn(5, 15)
    } else {
        state.readAloudTtsSpeechRate
    }

    var serviceState by remember { mutableStateOf(getServiceState()) }
    LaunchedEffect(Unit) {
        while (true) {
            serviceState = getServiceState()
            delay(500)
        }
    }

    var activeSlider by remember { mutableStateOf<String?>(null) }
    var localSpeechRate by remember(ttsSpeechRate) { mutableFloatStateOf(ttsSpeechRate.toFloat()) }

    // Warm play button color (cream/tan like image 3)
    val playButtonColor = Color(0xFFF0D9B5)

    // Use app theme background color — fully opaque, no see-through
    val appBgColor = LegadoTheme.colorScheme.surfaceContainerHigh

    // Full screen background
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(appBgColor)
            .windowInsetsPadding(WindowInsets.statusBars)
            .windowInsetsPadding(WindowInsets.navigationBars)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // ── Top Bar ──
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(36.dp)
                        .clip(CircleShape)
                        .background(Color.White.copy(alpha = 0.08f))
                        .clickable { onDismissRequest() },
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = "Hạ xuống",
                        tint = Color.White,
                        modifier = Modifier.size(22.dp)
                    )
                }

                Text(
                    text = "Đọc audio",
                    style = LegadoTheme.typography.titleMedium,
                    color = Color.White
                )

                Box(
                    modifier = Modifier
                        .size(36.dp)
                        .clip(CircleShape)
                        .background(Color.White.copy(alpha = 0.08f))
                        .clickable {
                            onIntent(ReadBookIntent.ReadAloudStop)
                            onDismissRequest()
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "Đóng",
                        tint = Color.White,
                        modifier = Modifier.size(18.dp)
                    )
                }
            }

            // ── Cover Art — chiếm ~60% màn hình ──
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(horizontal = 28.dp, vertical = 8.dp),
                contentAlignment = Alignment.Center
            ) {
                BookCoverImage(
                    name = state.book?.name ?: state.bookName,
                    author = state.book?.author,
                    path = state.book?.getDisplayCover(),
                    modifier = Modifier
                        .fillMaxSize()
                        .shadow(
                            elevation = 32.dp,
                            shape = RoundedCornerShape(16.dp),
                            ambientColor = Color.Black.copy(alpha = 0.4f),
                            spotColor = Color.Black.copy(alpha = 0.4f)
                        )
                        .clip(RoundedCornerShape(16.dp))
                )
            }

            Spacer(Modifier.height(12.dp))

            // ── Title & Chapter ──
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 28.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = state.book?.name ?: state.bookName,
                    style = MaterialTheme.typography.titleLarge,
                    color = Color.White,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                state.book?.author?.takeIf { it.isNotEmpty() }?.let { author ->
                    Spacer(Modifier.height(4.dp))
                    Text(
                        text = author,
                        style = MaterialTheme.typography.bodyMedium,
                        color = Color.White.copy(alpha = 0.6f),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
                Spacer(Modifier.height(6.dp))
                Text(
                    text = state.chapterName,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.White.copy(alpha = 0.5f),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Center
                )
            }

            Spacer(Modifier.height(16.dp))

            // ── Segmented Progress Bar ──
            if (serviceState.contentList.isNotEmpty()) {
                SegmentedProgressBar(state = serviceState)
                Spacer(Modifier.height(8.dp))
            }

            // ── Progress Slider ──
            val totalParagraphs = serviceState.contentList.size
            if (totalParagraphs > 0) {
                val nowSpeak = serviceState.nowSpeak
                val progress = if (nowSpeak >= 0) nowSpeak.toFloat() else 0f
                var localProgress by remember(progress) { mutableFloatStateOf(progress) }

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp)
                ) {
                    AppSlider(
                        value = localProgress,
                        onValueChange = { localProgress = it },
                        onValueChangeFinished = {
                            BaseReadAloudService.instance?.seekToParagraph(localProgress.toInt())
                        },
                        valueRange = 0f..(totalParagraphs - 1).toFloat().coerceAtLeast(1f),
                        steps = (totalParagraphs - 1).coerceAtLeast(1),
                        modifier = Modifier.fillMaxWidth()
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Đoạn ${localProgress.toInt() + 1}/$totalParagraphs",
                            style = MaterialTheme.typography.labelSmall,
                            color = Color.White.copy(alpha = 0.5f)
                        )
                        Text(
                            text = if (state.isReadAloudPaused) "Đang tạm dừng" else "Đang phát",
                            style = MaterialTheme.typography.labelSmall,
                            color = if (state.isReadAloudPaused) Color.White.copy(alpha = 0.5f) else playButtonColor
                        )
                    }
                }
            }

            Spacer(Modifier.height(16.dp))

            // ── Playback Controls (ảnh 3 style: pill buttons + cream play) ──
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                // Previous Chapter — pill shape
                PillControlButton(
                    onClick = { onIntent(ReadBookIntent.ReadAloudPrevChapter) },
                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_audio_previous),
                        contentDescription = stringResource(R.string.previous_chapter),
                        modifier = Modifier.size(22.dp),
                        colorFilter = ColorFilter.tint(Color.White)
                    )
                }

                // Previous Paragraph — pill shape
                PillControlButton(
                    onClick = { onIntent(ReadBookIntent.ReadAloudPrevParagraph) },
                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_audio_backward),
                        contentDescription = stringResource(R.string.prev_sentence),
                        modifier = Modifier.size(22.dp),
                        colorFilter = ColorFilter.tint(Color.White)
                    )
                }

                // Main Play/Pause — large cream circle (ảnh 3)
                Box(
                    modifier = Modifier
                        .size(68.dp)
                        .shadow(12.dp, CircleShape, ambientColor = playButtonColor.copy(alpha = 0.3f))
                        .clip(CircleShape)
                        .background(playButtonColor)
                        .combinedClickable(
                            onClick = { onIntent(ReadBookIntent.ReadAloudTogglePause) },
                            onLongClick = {
                                onIntent(ReadBookIntent.ReadAloudStop)
                                onDismissRequest()
                            }
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = if (state.isReadAloudPaused) Icons.Default.PlayArrow else Icons.Default.Pause,
                        contentDescription = stringResource(
                            if (state.isReadAloudPaused) R.string.audio_play else R.string.pause
                        ),
                        modifier = Modifier.size(32.dp),
                        tint = Color(0xFF2A2118)
                    )
                }

                // Next Paragraph — pill shape
                PillControlButton(
                    onClick = { onIntent(ReadBookIntent.ReadAloudNextParagraph) },
                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_audio_forward),
                        contentDescription = stringResource(R.string.next_sentence),
                        modifier = Modifier.size(22.dp),
                        colorFilter = ColorFilter.tint(Color.White)
                    )
                }

                // Next Chapter — pill shape
                PillControlButton(
                    onClick = { onIntent(ReadBookIntent.ReadAloudNextChapter) },
                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_audio_next),
                        contentDescription = stringResource(R.string.next_chapter),
                        modifier = Modifier.size(22.dp),
                        colorFilter = ColorFilter.tint(Color.White)
                    )
                }
            }

            Spacer(Modifier.height(12.dp))

            // ── Active Slider (Timer/Speed) ──
            if (activeSlider != null) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp, vertical = 4.dp)
                        .background(Color.White.copy(alpha = 0.06f), RoundedCornerShape(16.dp))
                        .padding(12.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = if (activeSlider == "timer") {
                                stringResource(R.string.set_timer)
                            } else {
                                stringResource(R.string.read_aloud_speed)
                            },
                            style = LegadoTheme.typography.titleSmallEmphasized,
                            color = Color.White,
                        )
                        Text(
                            text = if (activeSlider == "timer") {
                                stringResource(R.string.timer_m, timerMinute)
                            } else {
                                String.format(Locale.ROOT, "%.1fX", (localSpeechRate.toInt() + 5) / 10f)
                            },
                            style = LegadoTheme.typography.titleSmallEmphasized,
                            color = playButtonColor,
                        )
                    }
                    Spacer(Modifier.height(4.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        MediumTonalButton(
                            onClick = {
                                if (activeSlider == "timer") {
                                    onIntent(ReadBookIntent.SetReadAloudTtsTimer(0))
                                } else {
                                    onIntent(ReadBookIntent.SetReadAloudTtsFollowSys(true))
                                    onIntent(ReadBookIntent.SetReadAloudTtsSpeechRate(10))
                                }
                            },
                            icon = Icons.Default.Refresh,
                            contentDescription = stringResource(R.string.restore)
                        )
                        Spacer(Modifier.width(8.dp))
                        if (activeSlider == "timer") {
                            AppSlider(
                                value = timerMinute.toFloat(),
                                onValueChange = {
                                    onIntent(ReadBookIntent.SetReadAloudTtsTimer(it.toInt()))
                                },
                                valueRange = 0f..180f,
                                steps = 179,
                                modifier = Modifier.weight(1f)
                            )
                        } else {
                            AppSlider(
                                value = localSpeechRate.coerceIn(5f, 15f),
                                onValueChange = { localSpeechRate = it },
                                onValueChangeFinished = {
                                    onIntent(ReadBookIntent.SetReadAloudTtsFollowSys(false))
                                    onIntent(ReadBookIntent.SetReadAloudTtsSpeechRate(localSpeechRate.toInt()))
                                },
                                valueRange = 5f..15f,
                                steps = 9,
                                modifier = Modifier.weight(1f)
                            )
                        }
                    }
                }
            }

            Spacer(Modifier.height(8.dp))

            // ── Bottom Bar (ảnh 2 style: dark rounded container, pill icons) ──
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .padding(bottom = 8.dp)
                    .background(
                        Color.White.copy(alpha = 0.08f),
                        RoundedCornerShape(28.dp)
                    )
                    .padding(horizontal = 12.dp, vertical = 10.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                BottomBarItem(
                    icon = Icons.AutoMirrored.Filled.List,
                    label = "Mục lục",
                    selected = showChapterList,
                    onClick = { showChapterList = !showChapterList },
                )
                BottomBarItem(
                    icon = Icons.Default.AccessTime,
                    label = "Hẹn giờ",
                    selected = activeSlider == "timer",
                    onClick = {
                        activeSlider = if (activeSlider == "timer") null else "timer"
                    },
                )
                BottomBarItem(
                    icon = Icons.Default.Tune,
                    label = "Tốc độ",
                    selected = activeSlider == "speed",
                    onClick = {
                        activeSlider = if (activeSlider == "speed") null else "speed"
                    },
                )
                BottomBarItem(
                    icon = Icons.Default.Settings,
                    label = "Cài đặt",
                    selected = false,
                    onClick = onShowReadAloudConfig,
                )
            }
        }

        // ── Chapter List Overlay ──
        androidx.compose.animation.AnimatedVisibility(
            visible = showChapterList,
            enter = androidx.compose.animation.slideInVertically(initialOffsetY = { it }) + androidx.compose.animation.fadeIn(),
            exit = androidx.compose.animation.slideOutVertically(targetOffsetY = { it }) + androidx.compose.animation.fadeOut(),
        ) {
            AudioChapterListOverlay(
                chapters = chapters,
                currentChapterIndex = state.durChapterIndex,
                onChapterClick = { index ->
                    showChapterList = false
                    onIntent(ReadBookIntent.OpenChapter(index))
                },
                onDismiss = { showChapterList = false },
                bgColor = appBgColor,
            )
        }
    }
}

/**
 * Pill-shaped control button (ảnh 3 style)
 */
@Composable
private fun PillControlButton(
    onClick: () -> Unit,
    content: @Composable () -> Unit,
) {
    Box(
        modifier = Modifier
            .size(width = 56.dp, height = 44.dp)
            .clip(RoundedCornerShape(22.dp))
            .background(Color.White.copy(alpha = 0.10f))
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        content()
    }
}

/**
 * Bottom bar item (ảnh 2 style)
 */
@Composable
private fun BottomBarItem(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    label: String,
    selected: Boolean,
    onClick: () -> Unit,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.clickable { onClick() }
    ) {
        Box(
            modifier = Modifier
                .size(width = 48.dp, height = 36.dp)
                .clip(RoundedCornerShape(18.dp))
                .background(
                    if (selected) Color.White.copy(alpha = 0.18f)
                    else Color.White.copy(alpha = 0.06f)
                ),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = label,
                tint = if (selected) Color.White else Color.White.copy(alpha = 0.7f),
                modifier = Modifier.size(18.dp)
            )
        }
        Spacer(Modifier.height(3.dp))
        Text(
            text = label,
            fontSize = 10.sp,
            color = if (selected) Color.White else Color.White.copy(alpha = 0.5f)
        )
    }
}

// ── Helper data & functions ──

private data class AloudProgressState(
    val contentList: List<String> = emptyList(),
    val nowSpeak: Int = -1,
    val cachedIndices: Set<Int> = emptySet(),
    val downloadingIndices: Set<Int> = emptySet(),
)

private fun getServiceState(): AloudProgressState {
    val service = BaseReadAloudService.instance ?: return AloudProgressState()
    val contentList = service.contentList.toList()
    val nowSpeak = service.nowSpeak
    val cached = mutableSetOf<Int>()
    val downloading = mutableSetOf<Int>()
    contentList.indices.forEach { i ->
        if (service.isParagraphCached(i)) cached.add(i)
        if (service.isParagraphDownloading(i)) downloading.add(i)
    }
    return AloudProgressState(contentList, nowSpeak, cached, downloading)
}

@Composable
private fun SegmentedProgressBar(
    state: AloudProgressState,
    modifier: Modifier = Modifier
) {
    val total = state.contentList.size
    if (total == 0) return

    val nowSpeak = state.nowSpeak
    val cached = state.cachedIndices
    val downloading = state.downloadingIndices

    val infiniteTransition = rememberInfiniteTransition(label = "dl_pulse")
    val downloadingAlpha by infiniteTransition.animateFloat(
        initialValue = 0.3f,
        targetValue = 1.0f,
        animationSpec = infiniteRepeatable(
            animation = tween(800, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "alpha"
    )

    val primaryColor = LegadoTheme.colorScheme.primary
    val tertiaryColor = MaterialTheme.colorScheme.tertiary
    val secondaryColor = LegadoTheme.colorScheme.secondary
    val outlineColor = LegadoTheme.colorScheme.outline

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp)
    ) {
        androidx.compose.foundation.Canvas(
            modifier = Modifier
                .fillMaxWidth()
                .height(5.dp)
        ) {
            val width = size.width
            val height = size.height
            val gap = if (total > 100) 0.5f * density else 1.5f * density
            val totalGaps = (total - 1) * gap
            val segmentWidth = (width - totalGaps) / total
            val cornerRadiusPx = 2f * density

            for (i in 0 until total) {
                val startX = i * (segmentWidth + gap)
                val color = when {
                    i == nowSpeak -> primaryColor
                    i < nowSpeak -> primaryColor.copy(alpha = 0.4f)
                    downloading.contains(i) -> secondaryColor.copy(alpha = downloadingAlpha)
                    cached.contains(i) -> tertiaryColor.copy(alpha = 0.8f)
                    else -> outlineColor.copy(alpha = 0.2f)
                }
                drawRoundRect(
                    color = color,
                    topLeft = androidx.compose.ui.geometry.Offset(startX, 0f),
                    size = androidx.compose.ui.geometry.Size(segmentWidth, height),
                    cornerRadius = androidx.compose.ui.geometry.CornerRadius(cornerRadiusPx, cornerRadiusPx)
                )
            }
        }

        Spacer(Modifier.height(4.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            val statusText = buildString {
                append("Đã đọc: ${maxOf(0, nowSpeak)}/$total")
                if (cached.size > 0) append(" • Tải: ${cached.size}/$total")
                if (downloading.size > 0) append(" • Đang tải: ${downloading.size}")
            }
            Text(
                text = statusText,
                style = MaterialTheme.typography.labelSmall,
                color = Color.White.copy(alpha = 0.5f)
            )
            if (nowSpeak >= 0 && nowSpeak < total) {
                Text(
                    text = "Đoạn ${nowSpeak + 1}",
                    style = MaterialTheme.typography.labelSmall,
                    color = LegadoTheme.colorScheme.primary
                )
            }
        }
    }
}

/**
 * Chapter list overlay inside audio player
 */
@Composable
private fun AudioChapterListOverlay(
    chapters: List<io.legado.app.data.entities.BookChapter>,
    currentChapterIndex: Int,
    onChapterClick: (Int) -> Unit,
    onDismiss: () -> Unit,
    bgColor: Color,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(bgColor)
            .windowInsetsPadding(WindowInsets.statusBars)
            .windowInsetsPadding(WindowInsets.navigationBars)
    ) {
        // Header
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Danh sách chương (${chapters.size})",
                style = LegadoTheme.typography.titleMedium,
                color = LegadoTheme.colorScheme.onSurface
            )
            Box(
                modifier = Modifier
                    .size(36.dp)
                    .clip(CircleShape)
                    .background(LegadoTheme.colorScheme.onSurface.copy(alpha = 0.08f))
                    .clickable { onDismiss() },
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "Đóng",
                    tint = LegadoTheme.colorScheme.onSurface,
                    modifier = Modifier.size(18.dp)
                )
            }
        }

        // Chapter list
        val listState = androidx.compose.foundation.lazy.rememberLazyListState(
            initialFirstVisibleItemIndex = (currentChapterIndex - 3).coerceAtLeast(0)
        )
        androidx.compose.foundation.lazy.LazyColumn(
            state = listState,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            items(chapters.size) { index ->
                val chapter = chapters[index]
                val isCurrent = index == currentChapterIndex
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .then(
                            if (isCurrent) Modifier.background(
                                LegadoTheme.colorScheme.primary.copy(alpha = 0.12f)
                            ) else Modifier
                        )
                        .clickable { onChapterClick(index) }
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "${index + 1}",
                        style = MaterialTheme.typography.labelMedium,
                        color = if (isCurrent) LegadoTheme.colorScheme.primary
                            else LegadoTheme.colorScheme.onSurface.copy(alpha = 0.4f),
                        modifier = Modifier.width(36.dp)
                    )
                    Text(
                        text = chapter.getDisplayTitle(),
                        style = MaterialTheme.typography.bodyMedium,
                        color = if (isCurrent) LegadoTheme.colorScheme.primary
                            else LegadoTheme.colorScheme.onSurface,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.weight(1f)
                    )
                    if (isCurrent) {
                        Spacer(Modifier.width(8.dp))
                        Text(
                            text = "Đang phát",
                            style = MaterialTheme.typography.labelSmall,
                            color = LegadoTheme.colorScheme.primary
                        )
                    }
                }
            }
        }
    }
}
