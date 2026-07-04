package io.legado.app.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.withFrameNanos
import androidx.compose.ui.graphics.Color
import com.materialkolor.PaletteStyle
import com.materialkolor.dynamicColorScheme
import io.legado.app.ui.config.themeConfig.ThemeConfig

data class ThemeOverrideState(
    val seedColor: Color,
    val colorScheme: ColorScheme,
    val isDark: Boolean = false,
)

fun buildThemeOverrideState(
    seedColor: Color,
    isDark: Boolean,
    paletteStyle: PaletteStyle,
    colorSpec: ThemeColorSpec,
    usePureBlack: Boolean,
): ThemeOverrideState {
    var colorScheme = dynamicColorScheme(
        seedColor = seedColor,
        isDark = isDark,
        isAmoled = false,
        style = paletteStyle,
        contrastLevel = ThemeResolver.resolveContrastLevel(),
        specVersion = ThemeResolver.resolveColorSpecVersion(colorSpec)
    )

    if (isDark && usePureBlack) {
        colorScheme = colorScheme.copy(
            surface = Color.Black,
            background = Color.Black,
            surfaceContainerLow = Color(0xFF0A0A0A),
            surfaceContainer = Color(0xFF121212)
        )
    }

    return ThemeOverrideState(
        seedColor = seedColor,
        colorScheme = colorScheme,
        isDark = isDark,
    )
}

@Composable
fun ProvideThemeOverride(
    theme: ThemeOverrideState?,
    content: @Composable () -> Unit,
) {
    val defaultTheme = LocalLegadoThemeColors.current
    val targetColorScheme = theme?.colorScheme ?: defaultTheme.colorScheme
    val targetSeedColor = theme?.seedColor ?: defaultTheme.seedColor
    val targetIsDark = theme?.isDark ?: defaultTheme.isDark

    ProvideColorSchemeOverride(
        colorScheme = targetColorScheme,
        seedColor = targetSeedColor,
        overrideIsDark = targetIsDark,
        content = content
    )
}

@Composable
fun rememberThemeOverride(
    seedColor: Color?,
): ThemeOverrideState? {
    val isDark = LegadoTheme.isDark
    val paletteStyle = LegadoTheme.paletteStyle
    val colorSpec = ThemeResolver.resolveColorSpecFromMaterialVersion(ThemeConfig.materialVersion)
    val usePureBlack = ThemeConfig.isPureBlack

    return remember(seedColor, isDark, paletteStyle, colorSpec, usePureBlack) {
        if (seedColor == null || seedColor == Color.Unspecified) return@remember null
        
        buildThemeOverrideState(
            seedColor = seedColor,
            isDark = isDark,
            paletteStyle = paletteStyle,
            colorSpec = colorSpec,
            usePureBlack = usePureBlack
        )
    }
}
