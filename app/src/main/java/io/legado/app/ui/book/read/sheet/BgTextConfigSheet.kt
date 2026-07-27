package io.legado.app.ui.book.read.sheet

import androidx.compose.foundation.background
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import coil.compose.AsyncImage
import io.legado.app.help.config.ReadStyleResolver
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.layout.ContentScale
import androidx.compose.material.icons.filled.Check
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Upload
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.core.graphics.toColorInt
import io.legado.app.R
import io.legado.app.help.DefaultData
import io.legado.app.ui.book.read.ConfigUpdate
import io.legado.app.ui.book.read.ReadBookIntent
import io.legado.app.ui.book.read.ReadBookStyleConfig
import io.legado.app.ui.config.readConfig.ReadConfig
import io.legado.app.ui.theme.LegadoTheme
import io.legado.app.ui.widget.components.alert.AppAlertDialog
import io.legado.app.ui.widget.components.button.series.SmallTonalButton
import io.legado.app.ui.widget.components.card.NormalCard
import io.legado.app.ui.widget.components.dialog.ColorPickerSheet
import io.legado.app.ui.widget.components.dialog.TextListInputDialog
import io.legado.app.ui.widget.components.modalBottomSheet.AppModalBottomSheet
import io.legado.app.ui.widget.components.settingItem.TinyBgImageModeSettingItem
import io.legado.app.ui.widget.components.settingItem.TinyColorModeSettingItem
import io.legado.app.ui.widget.components.settingItem.TinySliderSettingItem
import io.legado.app.ui.widget.components.settingItem.TinySwitchSettingItem
import io.legado.app.ui.widget.components.text.AppText
import io.legado.app.utils.hexString

@Composable
fun BgTextConfigSheet(
    show: Boolean,
    onDismissRequest: () -> Unit,
    onIntent: (ReadBookIntent) -> Unit,
    onSelectImage: () -> Unit,
    onSelectImageForMode: (isNight: Boolean) -> Unit,
    onImportConfig: () -> Unit,
    onExportConfig: () -> Unit,
    styleConfig: ReadBookStyleConfig = ReadBookStyleConfig(),
) {
    // Derive values directly from styleConfig (reactive state)
    val styleName = styleConfig.styleName
    val darkStatusIcon = styleConfig.darkStatusIcon
    val bgAlpha = styleConfig.bgAlpha
    val dayBgColor = if (styleConfig.bgType == 0) {
        runCatching { styleConfig.bgStr.toColorInt() }.getOrDefault(0xFFEEEEEE.toInt())
    } else 0
    val nightBgColor = if (styleConfig.bgTypeNight == 0) {
        runCatching { styleConfig.bgStrNight.toColorInt() }.getOrDefault(0xFF000000.toInt())
    } else 0
    val dayBgImage = if (styleConfig.bgType != 0) {
        if (styleConfig.bgType == 1) "file:///android_asset/bg/${styleConfig.bgStr}" else styleConfig.bgStr
    } else null
    val nightBgImage = if (styleConfig.bgTypeNight != 0) {
        if (styleConfig.bgTypeNight == 1) "file:///android_asset/bg/${styleConfig.bgStrNight}" else styleConfig.bgStrNight
    } else null

    var showColorPicker by remember { mutableStateOf(false) }
    var colorPickerIsNight by remember { mutableStateOf(false) }
    var showEditNameDialog by remember { mutableStateOf(false) }
    var showPresetDialog by remember { mutableStateOf(false) }

    AppModalBottomSheet(
        show = show,
        onDismissRequest = {
            onIntent(ReadBookIntent.SaveReadStyleConfig)
            onDismissRequest()
        },
        title = styleName,
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .verticalScroll(rememberScrollState()),
        ) {
            // Action buttons row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(4.dp),
            ) {
                ActionCard(
                    title = stringResource(R.string.edit),
                    imageVector = Icons.Default.Edit,
                    modifier = Modifier.weight(1f),
                    onClick = { showEditNameDialog = true },
                )
                ActionCard(
                    title = stringResource(R.string.delete),
                    imageVector = Icons.Default.Delete,
                    modifier = Modifier.weight(1f),
                    onClick = { onIntent(ReadBookIntent.DeleteCurrentReadStyleConfig) },
                )
                ActionCard(
                    title = stringResource(R.string.restore),
                    imageVector = Icons.Default.Refresh,
                    modifier = Modifier.weight(1f),
                    onClick = { showPresetDialog = true },
                )
                ActionCard(
                    title = stringResource(R.string.import_str),
                    imageVector = Icons.Default.Download,
                    modifier = Modifier.weight(1f),
                    onClick = onImportConfig,
                )
                ActionCard(
                    title = stringResource(R.string.export_str),
                    imageVector = Icons.Default.Upload,
                    modifier = Modifier.weight(1f),
                    onClick = onExportConfig,
                )
            }

            Spacer(Modifier.height(12.dp))

            TinySwitchSettingItem(
                title = stringResource(R.string.dark_status_icon),
                checked = darkStatusIcon,
                onCheckedChange = {
                    onIntent(ReadBookIntent.UpdateConfig(ConfigUpdate.StatusIconDark(it)))
                },
            )

            // Background mode switch: color vs image
            val isDayBgImage = styleConfig.isDayBgImage
            val isNightBgImage = styleConfig.isNightBgImage
            val useBgImage = isDayBgImage || isNightBgImage

            TinySwitchSettingItem(
                title = stringResource(R.string.use_bg_image),
                checked = useBgImage,
                onCheckedChange = { useImage ->
                    if (useImage) {
                        // Switch to image mode: set bgType to 1 (assets image) with empty path
                        // This will show the image picker UI
                        onIntent(ReadBookIntent.UpdateConfig(ConfigUpdate.BgType(1)))
                        onIntent(ReadBookIntent.UpdateConfig(ConfigUpdate.BgStr("")))
                        onIntent(ReadBookIntent.UpdateConfig(ConfigUpdate.BgTypeNight(1)))
                        onIntent(ReadBookIntent.UpdateConfig(ConfigUpdate.BgStrNight("")))
                    } else {
                        // Switch to color mode: reset both day and night to color
                        onIntent(ReadBookIntent.UpdateConfig(ConfigUpdate.BgType(0)))
                        onIntent(ReadBookIntent.UpdateConfig(ConfigUpdate.BgStr("#EEEEEE")))
                        onIntent(ReadBookIntent.UpdateConfig(ConfigUpdate.BgTypeNight(0)))
                        onIntent(ReadBookIntent.UpdateConfig(ConfigUpdate.BgStrNight("#000000")))
                    }
                },
            )

            if (!useBgImage) {
                // Color mode
                TinyColorModeSettingItem(
                    title = stringResource(R.string.bg_color),
                    dayColor = dayBgColor,
                    nightColor = nightBgColor,
                    onClickColor = { isNight ->
                        colorPickerIsNight = isNight
                        showColorPicker = true
                    },
                )
            } else {
                // Image mode
                TinyBgImageModeSettingItem(
                    title = stringResource(R.string.bg_image),
                    dayBgImage = dayBgImage,
                    nightBgImage = nightBgImage,
                    onClickImage = { isNight ->
                        onSelectImageForMode(isNight)
                    },
                    onClearImage = { isNight ->
                        if (isNight) {
                            onIntent(ReadBookIntent.UpdateConfig(ConfigUpdate.BgTypeNight(0)))
                            onIntent(ReadBookIntent.UpdateConfig(ConfigUpdate.BgStrNight("#000000")))
                        } else {
                            onIntent(ReadBookIntent.UpdateConfig(ConfigUpdate.BgType(0)))
                            onIntent(ReadBookIntent.UpdateConfig(ConfigUpdate.BgStr("#EEEEEE")))
                        }
                    },
                )
            }

            TinySliderSettingItem(
                title = stringResource(R.string.bg_alpha),
                value = bgAlpha,
                valueRange = 0f..100f,
                steps = 99,
                onValueChange = {
                    onIntent(ReadBookIntent.UpdateConfig(ConfigUpdate.BgAlpha(it.toInt())))
                },
            )

            Spacer(Modifier.height(8.dp))
            AppText(
                text = "Danh sách ảnh nền mặc định",
                style = LegadoTheme.typography.titleSmallEmphasized,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp)
            )

            // Selector for Day/Night target
            val isReadNight = ReadConfig.isNightTheme
            var targetIsNight by remember { mutableStateOf(isReadNight) }
            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 12.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                SmallTonalButton(
                    onClick = { targetIsNight = false },
                    text = stringResource(R.string.day),
                    selected = !targetIsNight
                )
                SmallTonalButton(
                    onClick = { targetIsNight = true },
                    text = stringResource(R.string.night),
                    selected = targetIsNight
                )
            }

            Spacer(Modifier.height(8.dp))

            // LazyRow of all background images
            val bgImages = listOf(
                "bg7.webp", "bg6.webp", "bg6_d.webp", "bg5.webp",
                "bg4.webp", "bg3.webp", "bg1.webp",
                "宁静夜色.webp", "午后沙滩.webp", "山水墨影.webp", "山水画.webp",
                "护眼漫绿.webp", "新羊皮纸.webp", "明媚倾城.webp", "深宫魅影.webp",
                "清新时光.webp", "羊皮纸1.webp", "羊皮纸2.webp", "羊皮纸3.webp", "羊皮纸4.webp",
                "边彩画布.webp"
            )


            LazyRow(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 12.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                itemsIndexed(bgImages) { _, bgName ->
                    val bgPath = "file:///android_asset/bg/$bgName"
                    val isSelected = if (targetIsNight) {
                        styleConfig.bgTypeNight == 1 && styleConfig.bgStrNight == bgName
                    } else {
                        styleConfig.bgType == 1 && styleConfig.bgStr == bgName
                    }

                    NormalCard(
                        onClick = {
                            if (targetIsNight) {
                                onIntent(ReadBookIntent.UpdateConfig(ConfigUpdate.BgTypeNight(1)))
                                onIntent(ReadBookIntent.UpdateConfig(ConfigUpdate.BgStrNight(bgName)))
                            } else {
                                onIntent(ReadBookIntent.UpdateConfig(ConfigUpdate.BgType(1)))
                                onIntent(ReadBookIntent.UpdateConfig(ConfigUpdate.BgStr(bgName)))
                            }
                        },
                        modifier = Modifier.size(60.dp, 80.dp),
                        cornerRadius = 8.dp,
                        border = if (isSelected) {
                            BorderStroke(2.dp, LegadoTheme.colorScheme.primary)
                        } else {
                            BorderStroke(1.dp, LegadoTheme.colorScheme.outlineVariant)
                        }
                    ) {
                        Box(modifier = Modifier.fillMaxSize()) {
                            AsyncImage(
                                model = bgPath,
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.fillMaxSize()
                            )
                            if (isSelected) {
                                Box(
                                    modifier = Modifier
                                        .align(Alignment.Center)
                                        .size(20.dp)
                                        .background(Color.Black.copy(alpha = 0.5f), CircleShape),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Check,
                                        contentDescription = null,
                                        tint = Color.White,
                                        modifier = Modifier.size(12.dp)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    run {
        val initialColor = if (colorPickerIsNight) nightBgColor else dayBgColor
        ColorPickerSheet(
            show = showColorPicker,
            initialColor = if (initialColor != 0) initialColor else if (colorPickerIsNight) 0xFF000000.toInt() else 0xFFEEEEEE.toInt(),
            onDismissRequest = { showColorPicker = false },
            onColorSelected = { color ->
                if (colorPickerIsNight) {
                    onIntent(ReadBookIntent.UpdateConfig(ConfigUpdate.BgStrNight("#${color.hexString}")))
                    onIntent(ReadBookIntent.UpdateConfig(ConfigUpdate.BgTypeNight(0)))
                } else {
                    onIntent(ReadBookIntent.UpdateConfig(ConfigUpdate.BgStr("#${color.hexString}")))
                    onIntent(ReadBookIntent.UpdateConfig(ConfigUpdate.BgType(0)))
                }
                showColorPicker = false
            },
        )
    }


    TextListInputDialog(
        show = showEditNameDialog,
        title = stringResource(R.string.style_name),
        hint = stringResource(R.string.style_name),
        initialValue = styleName,
        onDismissRequest = { showEditNameDialog = false },
        onConfirm = { newName ->
            onIntent(ReadBookIntent.UpdateConfig(ConfigUpdate.StyleName(newName)))
            showEditNameDialog = false
        },
    )

    val presets = DefaultData.readConfigs
    AppAlertDialog(
        show = showPresetDialog,
        onDismissRequest = { showPresetDialog = false },
        title = stringResource(R.string.restore),
        content = {
            presets.forEachIndexed { index, preset ->
                val bgColor = runCatching { preset.bgStr.toColorInt() }
                    .getOrDefault(0xFFEEEEEE.toInt())
                val textColor = runCatching { preset.curTextColor() }
                    .getOrDefault(0xFF000000.toInt())
                NormalCard(
                    onClick = {
                        onIntent(ReadBookIntent.ApplyPresetTheme(index))
                        showPresetDialog = false
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp),
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 12.dp),
                    ) {
                        Box(
                            modifier = Modifier
                                .size(24.dp)
                                .clip(CircleShape)
                                .background(Color(bgColor))
                        )
                        Spacer(Modifier.width(8.dp))
                        Box(
                            modifier = Modifier
                                .size(24.dp)
                                .clip(CircleShape)
                                .background(Color(textColor))
                        )
                        Spacer(Modifier.width(12.dp))
                        AppText(
                            text = preset.name.ifBlank { "${index} mặc định" },
                            style = LegadoTheme.typography.labelMediumEmphasized
                        )
                    }
                }
            }
        },
    )
}

@Composable
private fun ActionCard(
    title: String,
    imageVector: ImageVector,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    NormalCard(
        onClick = onClick,
        modifier = modifier,
        containerColor = LegadoTheme.colorScheme.surfaceContainerLow,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
        ) {
            Icon(
                imageVector = imageVector,
                contentDescription = null,
                tint = LegadoTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.size(20.dp),
            )
            Spacer(Modifier.height(4.dp))
            Text(
                text = title,
                style = LegadoTheme.typography.labelSmall,
                color = LegadoTheme.colorScheme.onSurfaceVariant,
            )
        }
    }
}
