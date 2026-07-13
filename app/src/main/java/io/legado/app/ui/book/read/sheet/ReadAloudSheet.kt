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
import androidx.compose.foundation.layout.RowScope
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
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material.icons.filled.VolumeUp
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
import io.legado.app.ui.book.read.ReadBookSheet
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
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Size
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.rounded.LocationOn
import androidx.compose.material3.Surface
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.animation.animateColorAsState
import io.legado.app.ui.widget.components.progressIndicator.AppContainedLoadingIndicator
import io.legado.app.service.BaseReadAloudService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext


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

    // Đợi transition Bottom Sheet chạy xong mượt mà, sau đó mới load các logic nặng chạy ngầm
    var isUiReady by remember { mutableStateOf(false) }
    LaunchedEffect(Unit) {
        delay(400)
        isUiReady = true
    }

    // Load chapter list from DB asynchronously only when needed
    var chapters by remember { mutableStateOf<List<io.legado.app.data.entities.BookChapter>>(emptyList()) }
    LaunchedEffect(showChapterList, state.book?.bookUrl, isUiReady) {
        if (!isUiReady) return@LaunchedEffect
        if (showChapterList && chapters.isEmpty()) {
            state.book?.bookUrl?.let { bookUrl ->
                kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
                    chapters = io.legado.app.data.appDb.bookChapterDao.getChapterList(bookUrl)
                }
            }
        }
    }

    val timerMinute = state.readAloudTtsTimer
    val httpTts = io.legado.app.model.ReadAloud.httpTTS
    val ttsSpeechRate = state.readAloudTtsSpeechRate

    var serviceState by remember { mutableStateOf(AloudProgressState()) }
    LaunchedEffect(isUiReady) {
        if (!isUiReady) return@LaunchedEffect
        while (true) {
            serviceState = withContext(Dispatchers.IO) { getServiceState() }
            delay(1000)
        }
    }

    var activeSlider by remember { mutableStateOf<String?>(null) }
    var localSpeechRate by remember(ttsSpeechRate) { mutableFloatStateOf(ttsSpeechRate.toFloat()) }

    var fallbackContentList by remember { mutableStateOf<List<String>>(emptyList()) }
    LaunchedEffect(state.curTextChapter, state.readAloudByPage, isUiReady) {
        if (!isUiReady) return@LaunchedEffect
        fallbackContentList = withContext(Dispatchers.Default) {
            state.curTextChapter?.getNeedReadAloud(0, state.readAloudByPage, 0)
                ?.split("\n")?.filter { it.isNotEmpty() } ?: emptyList()
        }
    }

    var initialNowSpeak by remember { mutableStateOf(0) }
    LaunchedEffect(state.curTextChapter, state.durChapterPos, state.readAloudByPage) {
        initialNowSpeak = withContext(Dispatchers.Default) {
            state.curTextChapter?.let { textChapter ->
                val pNum = textChapter.getParagraphNum(state.durChapterPos + 1, state.readAloudByPage)
                if (pNum >= 1) pNum - 1 else 0
            } ?: 0
        }
    }

    val contentList = remember(serviceState.contentList, fallbackContentList) {
        if (serviceState.contentList.isNotEmpty()) {
            serviceState.contentList
        } else {
            fallbackContentList
        }
    }

    val nowSpeak = remember(serviceState.nowSpeak, serviceState.contentList, initialNowSpeak) {
        if (serviceState.nowSpeak >= 0 && serviceState.contentList.isNotEmpty()) {
            serviceState.nowSpeak
        } else {
            initialNowSpeak
        }
    }

    // Warm play button color - resolved to theme primary color
    val playButtonColor = LegadoTheme.colorScheme.primary

    // Use app theme background color — fully opaque, no see-through
    val appBgColor = LegadoTheme.colorScheme.surfaceContainerHigh.copy(alpha = 1f)

    if (!isUiReady) {
        Box(
            modifier = modifier
                .fillMaxSize()
                .background(appBgColor),
            contentAlignment = Alignment.Center
        ) {
            AppContainedLoadingIndicator()
        }
        return
    }

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
                        .background(LegadoTheme.colorScheme.onSurface.copy(alpha = 0.08f))
                        .clickable { onDismissRequest() },
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = "Hạ xuống",
                        tint = LegadoTheme.colorScheme.onSurface,
                        modifier = Modifier.size(22.dp)
                    )
                }

                Text(
                    text = "Đọc audio",
                    style = LegadoTheme.typography.titleMedium,
                    color = LegadoTheme.colorScheme.onSurface
                )

                Box(
                    modifier = Modifier
                        .size(36.dp)
                        .clip(CircleShape)
                        .background(LegadoTheme.colorScheme.onSurface.copy(alpha = 0.08f))
                        .clickable {
                            onIntent(ReadBookIntent.ReadAloudStop)
                            onDismissRequest()
                        },
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
                    style = LegadoTheme.typography.titleLarge,
                    color = LegadoTheme.colorScheme.onSurface,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                state.book?.author?.takeIf { it.isNotEmpty() }?.let { author ->
                    Spacer(Modifier.height(4.dp))
                    Text(
                        text = author,
                        style = LegadoTheme.typography.bodyMedium,
                        color = LegadoTheme.colorScheme.onSurfaceVariant,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
                Spacer(Modifier.height(6.dp))
                Text(
                    text = state.chapterName,
                    style = LegadoTheme.typography.bodySmall,
                    color = LegadoTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.7f),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Center
                )
            }

            Spacer(Modifier.height(16.dp))

            // ── Progress Slider ──
            val totalParagraphs = contentList.size
            if (totalParagraphs > 0) {
                val progress = if (nowSpeak >= 0) nowSpeak.toFloat() else 0f
                var localProgress by remember(progress) { mutableFloatStateOf(progress) }

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp)
                ) {
                    AppSlider(
                        value = localProgress.coerceIn(0f, (totalParagraphs - 1).toFloat().coerceAtLeast(1f)),
                        onValueChange = { localProgress = it },
                        onValueChangeFinished = {
                            if (BaseReadAloudService.instance != null) {
                                BaseReadAloudService.instance?.seekToParagraph(localProgress.toInt())
                            } else {
                                val targetPos = state.curTextChapter?.getParagraphs(state.readAloudByPage)
                                    ?.getOrNull(localProgress.toInt())?.chapterPosition ?: 0
                                onIntent(ReadBookIntent.OpenChapter(state.durChapterIndex, targetPos))
                            }
                        },
                        valueRange = 0f..(totalParagraphs - 1).toFloat().coerceAtLeast(1f),
                        modifier = Modifier.fillMaxWidth()
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        val statusText = buildString {
                            append("Đã đọc: ${localProgress.toInt()}/$totalParagraphs")
                            if (serviceState.cachedIndices.isNotEmpty()) {
                                append(" • Tải: ${serviceState.cachedIndices.size}/$totalParagraphs")
                            }
                            if (serviceState.downloadingIndices.isNotEmpty()) {
                                append(" • Đang tải: ${serviceState.downloadingIndices.size}")
                            }
                        }
                        Text(
                            text = statusText,
                            style = LegadoTheme.typography.labelSmall,
                            color = LegadoTheme.colorScheme.onSurfaceVariant
                        )
                        Text(
                            text = buildString {
                                append("Đoạn ${localProgress.toInt() + 1}")
                                append(" • ")
                                append(if (state.isReadAloudPaused) "Tạm dừng" else "Đang phát")
                            },
                            style = LegadoTheme.typography.labelSmall,
                            color = if (state.isReadAloudPaused) LegadoTheme.colorScheme.onSurfaceVariant else playButtonColor
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
                        colorFilter = ColorFilter.tint(LegadoTheme.colorScheme.onSurface)
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
                        colorFilter = ColorFilter.tint(LegadoTheme.colorScheme.onSurface)
                    )
                }

                // Bông hoa 10 cánh cho nút Play/Pause (giống hệt ContainedLoadingIndicator)
                val density = androidx.compose.ui.platform.LocalDensity.current
                val rInnerDiff = remember(density) { with(density) { 3.5.dp.toPx() } }
                val ctrlDiff = remember(density) { with(density) { 2.dp.toPx() } }

                val flowerShape = remember(Unit) {
                    androidx.compose.foundation.shape.GenericShape { size, _ ->
                        val center = size.width / 2f
                        val rOuter = size.width / 2f
                        val rInner = rOuter - rInnerDiff
                        val numPetals = 10
                        val angleStep = 360f / numPetals
                        
                        moveTo(center + rInner, center)
                        for (i in 0 until numPetals) {
                            val nextAngle = (i + 1) * angleStep
                            val midAngle = i * angleStep + angleStep / 2f
                            
                            val ctrlAngleRad = Math.toRadians(midAngle.toDouble())
                            val endAngleRad = Math.toRadians(nextAngle.toDouble())
                            
                            val ctrlX = center + (rOuter + ctrlDiff) * Math.cos(ctrlAngleRad).toFloat()
                            val ctrlY = center + (rOuter + ctrlDiff) * Math.sin(ctrlAngleRad).toFloat()
                            
                            val endX = center + rInner * Math.cos(endAngleRad).toFloat()
                            val endY = center + rInner * Math.sin(endAngleRad).toFloat()
                            
                            quadraticTo(ctrlX, ctrlY, endX, endY)
                        }
                        close()
                    }
                }

                val showPlayIcon = !state.isReadAloudRunning || state.isReadAloudPaused
                var renderPlayIcon by remember { mutableStateOf(showPlayIcon) }
                val playRotation = remember { androidx.compose.animation.core.Animatable(0f) }

                LaunchedEffect(showPlayIcon) {
                    if (playRotation.value > 0f || state.isReadAloudRunning) {
                        playRotation.animateTo(
                            targetValue = playRotation.value + 180f,
                            animationSpec = androidx.compose.animation.core.tween(
                                durationMillis = 200,
                                easing = androidx.compose.animation.core.LinearOutSlowInEasing
                            )
                        )
                        renderPlayIcon = showPlayIcon
                        playRotation.animateTo(
                            targetValue = playRotation.value + 180f,
                            animationSpec = androidx.compose.animation.core.tween(
                                durationMillis = 200,
                                easing = androidx.compose.animation.core.LinearOutSlowInEasing
                            )
                        )
                    } else {
                        renderPlayIcon = showPlayIcon
                    }
                }

                // Main Play/Pause — large cream flower shape (đã khôi phục và tối ưu hóa shadow)
                Box(
                    modifier = Modifier
                        .size(68.dp)
                        .graphicsLayer { rotationZ = playRotation.value }
                        .shadow(12.dp, androidx.compose.foundation.shape.CircleShape, ambientColor = playButtonColor.copy(alpha = 0.3f))
                        .clip(flowerShape)
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
                        imageVector = if (renderPlayIcon) Icons.Default.PlayArrow else Icons.Default.Pause,
                        contentDescription = stringResource(
                            if (renderPlayIcon) R.string.audio_play else R.string.pause
                        ),
                        modifier = Modifier.size(32.dp),
                        tint = LegadoTheme.colorScheme.onPrimary
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
                        colorFilter = ColorFilter.tint(LegadoTheme.colorScheme.onSurface)
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
                        colorFilter = ColorFilter.tint(LegadoTheme.colorScheme.onSurface)
                    )
                }
            }

            Spacer(Modifier.height(12.dp))

            // ── Active Slider (Timer/Speed) ──
            androidx.compose.animation.AnimatedVisibility(
                visible = activeSlider != null,
                enter = androidx.compose.animation.expandVertically(
                    expandFrom = Alignment.Bottom,
                    animationSpec = androidx.compose.animation.core.tween(durationMillis = 300)
                ) + androidx.compose.animation.fadeIn(
                    animationSpec = androidx.compose.animation.core.tween(durationMillis = 300)
                ),
                exit = androidx.compose.animation.shrinkVertically(
                    shrinkTowards = Alignment.Bottom,
                    animationSpec = androidx.compose.animation.core.tween(durationMillis = 250)
                ) + androidx.compose.animation.fadeOut(
                    animationSpec = androidx.compose.animation.core.tween(durationMillis = 200)
                ),
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp, vertical = 4.dp)
                        .background(LegadoTheme.colorScheme.onSurface.copy(alpha = 0.06f), RoundedCornerShape(16.dp))
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
                            color = LegadoTheme.colorScheme.onSurface,
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
                        LegadoTheme.colorScheme.onSurface.copy(alpha = 0.06f),
                        RoundedCornerShape(24.dp)
                    )
                    .padding(horizontal = 8.dp, vertical = 6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                BottomBarItem(
                    icon = Icons.AutoMirrored.Filled.List,
                    label = "Mục lục",
                    selected = showChapterList,
                    onClick = { showChapterList = !showChapterList },
                    modifier = Modifier.weight(1f)
                )
                BottomBarItem(
                    icon = Icons.Default.AccessTime,
                    label = "Hẹn giờ",
                    selected = activeSlider == "timer",
                    onClick = {
                        activeSlider = if (activeSlider == "timer") null else "timer"
                    },
                    modifier = Modifier.weight(1f)
                )
                BottomBarItem(
                    icon = Icons.Default.Tune,
                    label = "Tốc độ",
                    selected = activeSlider == "speed",
                    onClick = {
                        activeSlider = if (activeSlider == "speed") null else "speed"
                    },
                    modifier = Modifier.weight(1f)
                )
                BottomBarItem(
                    icon = Icons.Default.Settings,
                    label = "Cài đặt",
                    selected = false,
                    onClick = onShowReadAloudConfig,
                    modifier = Modifier.weight(1f)
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
                book = state.book,
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
            .background(LegadoTheme.colorScheme.onSurface.copy(alpha = 0.08f))
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
private fun RowScope.BottomBarItem(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    label: String,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val activeColor = LegadoTheme.colorScheme.primary
    val inactiveColor = LegadoTheme.colorScheme.onSurfaceVariant

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .clip(RoundedCornerShape(16.dp))
            .clickable { onClick() }
            .padding(vertical = 6.dp)
    ) {
        Box(
            modifier = Modifier
                .size(width = 44.dp, height = 28.dp)
                .clip(CircleShape)
                .background(
                    if (selected) LegadoTheme.colorScheme.onSurface.copy(alpha = 0.12f)
                    else Color.Transparent
                ),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = label,
                tint = if (selected) activeColor else inactiveColor,
                modifier = Modifier.size(20.dp)
            )
        }
        Spacer(Modifier.height(4.dp))
        Text(
            text = label,
            fontSize = 10.sp,
            fontWeight = if (selected) androidx.compose.ui.text.font.FontWeight.Medium else androidx.compose.ui.text.font.FontWeight.Normal,
            color = if (selected) activeColor else inactiveColor,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
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
    try {
        val service = BaseReadAloudService.instance ?: return AloudProgressState()
        val contentList = service.contentList.toList()
        val nowSpeak = service.nowSpeak
        val cached = mutableSetOf<Int>()
        val downloading = mutableSetOf<Int>()
        
        if (service.javaClass.name.contains("HttpReadAloudService")) {
            val start = (nowSpeak - 5).coerceAtLeast(0)
            val end = (nowSpeak + 20).coerceAtLeast(0).coerceAtMost(contentList.lastIndex)
            if (start <= end && end < contentList.size) {
                for (i in start..end) {
                    if (service.isParagraphCached(i)) cached.add(i)
                    if (service.isParagraphDownloading(i)) downloading.add(i)
                }
            }
        }
        return AloudProgressState(contentList, nowSpeak, cached, downloading)
    } catch (e: Exception) {
        return AloudProgressState()
    }
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
    val tertiaryColor = LegadoTheme.colorScheme.tertiary
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
                style = LegadoTheme.typography.labelSmall,
                color = Color.White.copy(alpha = 0.5f)
            )
            if (nowSpeak >= 0 && nowSpeak < total) {
                Text(
                    text = "Đoạn ${nowSpeak + 1}",
                    style = LegadoTheme.typography.labelSmall,
                    color = LegadoTheme.colorScheme.primary
                )
            }
        }
    }
}

@Composable
private fun ChapterListItem(
    modifier: Modifier = Modifier,
    title: String,
    isCurrent: Boolean,
    isVip: Boolean,
    isPay: Boolean,
    tag: String?,
    wordCount: String?,
    isDownloaded: Boolean,
    onClick: () -> Unit,
) {
    val backgroundColor by animateColorAsState(
        targetValue = when {
            isCurrent -> LegadoTheme.colorScheme.secondaryContainer.copy(alpha = 0.3f)
            else -> Color.Transparent
        }, label = "BgColor"
    )

    val textColor by animateColorAsState(
        targetValue = when {
            isCurrent -> LegadoTheme.colorScheme.primary
            else -> LegadoTheme.colorScheme.onSurface
        }, label = "TextColor"
    )

    val detailColor by animateColorAsState(
        targetValue = when {
            isCurrent -> LegadoTheme.colorScheme.primary
            else -> LegadoTheme.colorScheme.onSurfaceVariant
        }, label = "DetailColor"
    )

    Surface(
        modifier = modifier
            .fillMaxWidth()
            .clickable { onClick() },
        color = backgroundColor
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    if (isVip && !isPay) {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = null,
                            tint = LegadoTheme.colorScheme.error,
                            modifier = Modifier
                                .size(14.dp)
                                .padding(end = 4.dp)
                        )
                    }

                    Text(
                        text = title,
                        style = LegadoTheme.typography.bodyMediumEmphasized.copy(fontWeight = FontWeight.Medium),
                        color = textColor,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                }

                if (!tag.isNullOrEmpty()) {
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = tag,
                        style = LegadoTheme.typography.labelSmallEmphasized,
                        color = detailColor.copy(alpha = 0.8f),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }

            // Right side: Word Count Card & Status Indicator
            val showStatus = isCurrent || isDownloaded || !wordCount.isNullOrEmpty()
            if (showStatus) {
                Row(
                    modifier = Modifier.padding(start = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if (!wordCount.isNullOrEmpty() && isDownloaded) {
                        Surface(
                            shape = MaterialTheme.shapes.extraSmall,
                            color = if (isCurrent) LegadoTheme.colorScheme.primaryContainer else LegadoTheme.colorScheme.surfaceContainer,
                            modifier = Modifier.padding(end = 6.dp)
                        ) {
                            Text(
                                modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp),
                                text = wordCount,
                                style = LegadoTheme.typography.labelSmall.copy(fontSize = 9.sp),
                                color = if (isCurrent) LegadoTheme.colorScheme.onPrimaryContainer else LegadoTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                    
                    if (isCurrent) {
                        Icon(
                            imageVector = Icons.Rounded.LocationOn,
                            contentDescription = null,
                            modifier = Modifier.size(18.dp),
                            tint = LegadoTheme.colorScheme.secondary
                        )
                    } else if (isDownloaded) {
                        Icon(
                            imageVector = Icons.Default.CheckCircle,
                            contentDescription = null,
                            modifier = Modifier.size(18.dp),
                            tint = LegadoTheme.colorScheme.secondary
                        )
                    }
                }
            }
        }
    }
}

/**
 * Chapter list overlay inside audio player
 */
@Composable
private fun AudioChapterListOverlay(
    book: io.legado.app.data.entities.Book?,
    chapters: List<io.legado.app.data.entities.BookChapter>,
    currentChapterIndex: Int,
    onChapterClick: (Int) -> Unit,
    onDismiss: () -> Unit,
    bgColor: Color,
) {
    var cachedFiles by remember { mutableStateOf<Set<String>>(emptySet()) }
    LaunchedEffect(chapters, book) {
        cachedFiles = withContext(Dispatchers.IO) {
            if (book != null) {
                io.legado.app.help.book.BookHelp.getChapterFiles(book).toSet()
            } else {
                emptySet()
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(bgColor)
            .windowInsetsPadding(WindowInsets.statusBars)
            .windowInsetsPadding(WindowInsets.navigationBars)
    ) {
        // Premium Book Header with Cover and Title
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            io.legado.app.ui.widget.components.image.cover.BookCoverImage(
                name = book?.name,
                author = book?.author,
                path = book?.getDisplayCover(),
                modifier = Modifier
                    .size(width = 44.dp, height = 60.dp)
                    .clip(androidx.compose.foundation.shape.RoundedCornerShape(6.dp))
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = book?.name ?: "",
                    style = LegadoTheme.typography.titleMedium,
                    color = LegadoTheme.colorScheme.onSurface,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "Danh sách chương (${chapters.size})",
                    style = LegadoTheme.typography.bodySmall,
                    color = LegadoTheme.colorScheme.onSurfaceVariant
                )
            }
            // Close button
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
                val isDownloaded = remember(chapter.index, cachedFiles) {
                    chapter.getFileName() in cachedFiles
                }
                ChapterListItem(
                    title = chapter.getDisplayTitle(),
                    isCurrent = isCurrent,
                    isVip = chapter.isVip,
                    isPay = chapter.isPay,
                    tag = chapter.tag,
                    wordCount = chapter.wordCount,
                    isDownloaded = isDownloaded,
                    onClick = { onChapterClick(index) }
                )
            }
        }
    }
}


