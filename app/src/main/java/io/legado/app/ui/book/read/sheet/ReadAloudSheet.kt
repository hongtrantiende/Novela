package io.legado.app.ui.book.read.sheet

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.SkipNext
import androidx.compose.material.icons.filled.SkipPrevious
import androidx.compose.material.icons.filled.Stop
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import io.legado.app.R
import io.legado.app.ui.book.read.ReadBookIntent
import io.legado.app.ui.book.read.ReadBookUiState
import io.legado.app.ui.widget.components.button.series.MediumTonalButton
import io.legado.app.ui.widget.components.settingItem.TinySliderSettingItem
import io.legado.app.ui.widget.components.settingItem.TinySwitchSettingItem
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.foundation.layout.padding
import io.legado.app.ui.theme.LegadoTheme
import io.legado.app.ui.widget.components.AppSlider
import io.legado.app.ui.widget.components.text.AppText
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

@Composable
fun ReadAloudContent(
    state: ReadBookUiState,
    onIntent: (ReadBookIntent) -> Unit,
    onDismissRequest: () -> Unit,
    onOpenChapterList: () -> Unit,
    onGoToBackground: () -> Unit,
    onShowReadAloudConfig: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val timerMinute = state.readAloudTtsTimer
    val ttsSpeechRate = state.readAloudTtsSpeechRate

    var serviceState by remember { mutableStateOf(getServiceState()) }
    LaunchedEffect(Unit) {
        while (true) {
            serviceState = getServiceState()
            delay(500)
        }
    }

    Column(
        modifier = modifier.fillMaxWidth(),
    ) {
        // Media controls
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            MediumTonalButton(
                onClick = { onIntent(ReadBookIntent.ReadAloudPrevParagraph) },
                icon = Icons.Default.SkipPrevious,
                contentDescription = stringResource(R.string.prev_sentence),
            )
            Spacer(Modifier.width(6.dp))
            MediumTonalButton(
                onClick = { onIntent(ReadBookIntent.ReadAloudTogglePause) },
                icon = if (state.isReadAloudPaused) Icons.Default.PlayArrow else Icons.Default.Pause,
                contentDescription = stringResource(
                    if (state.isReadAloudPaused) R.string.audio_play else R.string.pause
                ),
            )
            Spacer(Modifier.width(6.dp))
            MediumTonalButton(
                onClick = {
                    onIntent(ReadBookIntent.ReadAloudStop)
                    onDismissRequest()
                },
                icon = Icons.Default.Stop,
                contentDescription = stringResource(R.string.stop),
            )
            Spacer(Modifier.width(6.dp))
            MediumTonalButton(
                onClick = { onIntent(ReadBookIntent.ReadAloudNextParagraph) },
                icon = Icons.Default.SkipNext,
                text = stringResource(R.string.next_sentence),
            )
        }

        Spacer(Modifier.height(8.dp))

        if (serviceState.contentList.isNotEmpty()) {
            SegmentedProgressBar(state = serviceState)
            Spacer(Modifier.height(12.dp))
        }

        TinySliderSettingItem(
            title = stringResource(R.string.set_timer),
            description = stringResource(R.string.timer_m, timerMinute),
            value = timerMinute.toFloat(),
            valueRange = 0f..180f,
            steps = 179,
            onValueChange = {
                onIntent(ReadBookIntent.SetReadAloudTtsTimer(it.toInt()))
            },
        )

        Spacer(Modifier.height(8.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            MediumTonalButton(
                onClick = { onIntent(ReadBookIntent.ReadAloudPrevChapter) },
                text = stringResource(R.string.previous_chapter),
                modifier = Modifier.weight(1f),
            )
            MediumTonalButton(
                onClick = { onIntent(ReadBookIntent.SaveReadAloudTtsTimer(timerMinute)) },
                text = stringResource(R.string.save_tts_timer),
                modifier = Modifier.weight(1f),
            )
            MediumTonalButton(
                onClick = { onIntent(ReadBookIntent.ReadAloudNextChapter) },
                text = stringResource(R.string.next_chapter),
                modifier = Modifier.weight(1f),
            )
        }

        Spacer(Modifier.height(12.dp))

        val isSystemTts = io.legado.app.model.ReadAloud.httpTTS == null
        if (isSystemTts) {
            var localSpeechRate by remember(ttsSpeechRate) { mutableFloatStateOf(ttsSpeechRate.toFloat()) }
            
            Column(
                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp, horizontal = 12.dp),
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    AppText(
                        text = stringResource(R.string.read_aloud_speed),
                        style = LegadoTheme.typography.titleSmallEmphasized,
                        color = LegadoTheme.colorScheme.onSurface,
                    )
                    AppText(
                        text = String.format(Locale.ROOT, "%.1fX", (localSpeechRate.toInt() + 5) / 10f),
                        style = LegadoTheme.typography.titleSmallEmphasized,
                        color = LegadoTheme.colorScheme.primary,
                    )
                }
                Spacer(Modifier.height(4.dp))
                AppSlider(
                    value = localSpeechRate.coerceIn(5f, 15f),
                    onValueChange = {
                        localSpeechRate = it
                    },
                    onValueChangeFinished = {
                        onIntent(ReadBookIntent.SetReadAloudTtsFollowSys(false))
                        onIntent(ReadBookIntent.SetReadAloudTtsSpeechRate(localSpeechRate.toInt()))
                    },
                    valueRange = 5f..15f,
                    steps = 9,
                    modifier = Modifier.fillMaxWidth(),
                )
            }
        }

        Spacer(Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            ActionButton(
                icon = Icons.AutoMirrored.Filled.List,
                label = stringResource(R.string.chapter_list),
                onClick = onOpenChapterList,
            )
            ActionButton(
                icon = Icons.Default.VisibilityOff,
                label = stringResource(R.string.to_backstage),
                onClick = onGoToBackground,
            )
            ActionButton(
                icon = Icons.Default.Settings,
                label = stringResource(R.string.setting),
                onClick = onShowReadAloudConfig,
            )
        }
    }
}

@Composable
private fun ActionButton(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    label: String,
    onClick: () -> Unit,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        MediumTonalButton(
            onClick = onClick,
            icon = icon,
            contentDescription = label,
        )
        Spacer(Modifier.height(4.dp))
        Text(
            text = label,
            style = MaterialTheme.typography.labelSmall,
        )
    }
}

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
        if (service.isParagraphCached(i)) {
            cached.add(i)
        }
        if (service.isParagraphDownloading(i)) {
            downloading.add(i)
        }
    }
    return AloudProgressState(contentList, nowSpeak, cached, downloading)
}

@Composable
private fun SegmentedProgressBar(
    state: AloudProgressState,
    modifier: Modifier = Modifier
) {
    val paragraphs = state.contentList
    val total = paragraphs.size
    if (total == 0) return

    val nowSpeak = state.nowSpeak
    val cached = state.cachedIndices
    val downloading = state.downloadingIndices

    val infiniteTransition = androidx.compose.animation.core.rememberInfiniteTransition(label = "downloading_pulsing")
    val downloadingAlpha by infiniteTransition.animateFloat(
        initialValue = 0.3f,
        targetValue = 1.0f,
        animationSpec = androidx.compose.animation.core.infiniteRepeatable(
            animation = androidx.compose.animation.core.tween(800, easing = androidx.compose.animation.core.LinearEasing),
            repeatMode = androidx.compose.animation.core.RepeatMode.Reverse
        ),
        label = "alpha"
    )

    val primaryColor = LegadoTheme.colorScheme.primary
    val tertiaryColor = MaterialTheme.colorScheme.tertiary
    val secondaryColor = LegadoTheme.colorScheme.secondary
    val outlineColor = LegadoTheme.colorScheme.outline

    Column(
        modifier = modifier.fillMaxWidth().padding(horizontal = 12.dp)
    ) {
        androidx.compose.foundation.Canvas(
            modifier = Modifier
                .fillMaxWidth()
                .height(8.dp)
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
            val downloadedCount = cached.size
            val downloadingCount = downloading.size
            
            val statusText = buildString {
                append("Đã đọc: ${maxOf(0, nowSpeak)}/$total đoạn")
                if (downloadedCount > 0) {
                    append(" • Đã tải: $downloadedCount/$total")
                }
                if (downloadingCount > 0) {
                    append(" • Đang tải: $downloadingCount")
                }
            }
            Text(
                text = statusText,
                style = MaterialTheme.typography.labelSmall,
                color = LegadoTheme.colorScheme.onSurface.copy(alpha = 0.6f)
            )

            if (nowSpeak >= 0 && nowSpeak < total) {
                Text(
                    text = "Đang đọc đoạn ${nowSpeak + 1}",
                    style = MaterialTheme.typography.labelSmall,
                    color = LegadoTheme.colorScheme.primary
                )
            }
        }
    }
}
