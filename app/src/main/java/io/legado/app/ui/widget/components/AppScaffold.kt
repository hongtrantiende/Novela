package io.legado.app.ui.widget.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScaffoldDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import dev.chrisbanes.haze.HazeState
import dev.chrisbanes.haze.hazeSource
import io.legado.app.ui.config.themeConfig.ThemeConfig
import io.legado.app.ui.theme.LegadoTheme
import io.legado.app.ui.theme.LocalHazeState
import io.legado.app.ui.theme.ThemeResolver
import io.legado.app.ui.theme.responsiveHazeSource
import top.yukonga.miuix.kmp.theme.MiuixTheme
import top.yukonga.miuix.kmp.basic.FabPosition as MiuixFabPosition
import top.yukonga.miuix.kmp.basic.Scaffold as MiuixScaffold

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppScaffold(
    modifier: Modifier = Modifier,
    topBar: @Composable (HazeState) -> Unit = {},
    bottomBar: @Composable () -> Unit = {},
    snackbarHost: @Composable () -> Unit = {},
    floatingActionButton: @Composable () -> Unit = {},
    floatingActionButtonPosition: FabPosition = FabPosition.End,
    contentColor: Color = contentColorFor(MiuixTheme.colorScheme.surface),
    contentWindowInsets: WindowInsets = ScaffoldDefaults.contentWindowInsets,
    alwaysDrawBehindBars: Boolean = false,
    disableHazeSource: Boolean = false,
    content: @Composable (PaddingValues) -> Unit
) {
    val isDark = LegadoTheme.isDark
    val hasImageBg = ThemeConfig.hasImageBg(isDark)
    val hazeState = remember { HazeState() }
    val composeEngine = LegadoTheme.composeEngine
    val contentDrawsBehindBars =
        alwaysDrawBehindBars || ThemeConfig.enableBlur || ThemeConfig.enableProgressiveBlur

    val containerColor = Color.Transparent

    val miuixContainerColor = Color.Transparent

    CompositionLocalProvider(
        LocalHazeState provides if (ThemeConfig.enableBlur) hazeState else null
    ) {
        when {
            ThemeResolver.isMiuixEngine(composeEngine) -> {
                val miuixFabPosition = when (floatingActionButtonPosition) {
                    FabPosition.End -> MiuixFabPosition.End
                    FabPosition.Center -> MiuixFabPosition.Center
                    else -> MiuixFabPosition.End
                }
                Box(modifier = modifier.fillMaxSize()) {
                    BackgroundImageContent(isDark = isDark, hazeState = hazeState)
                    MiuixScaffold(
                        modifier = Modifier.fillMaxSize(),
                        topBar = {
                            topBar(hazeState)
                        },
                        bottomBar = bottomBar,
                        snackbarHost = snackbarHost,
                        floatingActionButton = floatingActionButton,
                        floatingActionButtonPosition = miuixFabPosition,
                        containerColor = miuixContainerColor,
                        contentWindowInsets = contentWindowInsets
                    ) { paddingValues ->
                        val scaffoldPadding = if (ThemeConfig.useFloatingBottomBar) {
                            PaddingValues(top = paddingValues.calculateTopPadding())
                        } else {
                            paddingValues
                        }
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .then(
                                    if (!disableHazeSource) Modifier.responsiveHazeSource(hazeState)
                                    else Modifier
                                )
                                .then(
                                    if (contentDrawsBehindBars) Modifier
                                    else Modifier.padding(scaffoldPadding)
                                )
                        ) {
                            content(
                                if (contentDrawsBehindBars) scaffoldPadding
                                else PaddingValues(0.dp)
                            )
                        }
                    }
                }
            }

            else -> {
                Box(modifier = modifier.fillMaxSize()) {
                    BackgroundImageContent(isDark = isDark, hazeState = hazeState)
                    Scaffold(
                        modifier = Modifier.fillMaxSize(),
                        topBar = {
                            topBar(hazeState)
                        },
                        bottomBar = bottomBar,
                        snackbarHost = snackbarHost,
                        floatingActionButton = floatingActionButton,
                        floatingActionButtonPosition = floatingActionButtonPosition,
                        containerColor = containerColor,
                        contentColor = contentColor,
                        contentWindowInsets = contentWindowInsets
                    ) { paddingValues ->
                        val scaffoldPadding = if (ThemeConfig.useFloatingBottomBar) {
                            PaddingValues(top = paddingValues.calculateTopPadding())
                        } else {
                            paddingValues
                        }
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .then(
                                    if (!disableHazeSource) Modifier.responsiveHazeSource(hazeState)
                                    else Modifier
                                )
                                .then(
                                    if (contentDrawsBehindBars) Modifier
                                    else Modifier.padding(scaffoldPadding)
                                )
                        ) {
                            content(
                                if (contentDrawsBehindBars) scaffoldPadding
                                else PaddingValues(0.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}


@Composable
private fun BackgroundImageContent(
    isDark: Boolean,
    hazeState: HazeState
) {
    val hasImageBg = ThemeConfig.hasImageBg(isDark)
    val bgImagePath = if (isDark) ThemeConfig.bgImageDark else ThemeConfig.bgImageLight
    val blur = if (isDark) {
        ThemeConfig.bgImageNBlurring
    } else {
        ThemeConfig.bgImageBlurring
    }

    if (hasImageBg && !bgImagePath.isNullOrBlank()) {
        if (ThemeConfig.enableBlur) {
            AsyncImage(
                model = bgImagePath,
                contentDescription = null,
                imageLoader = org.koin.compose.koinInject(),
                modifier = Modifier
                    .fillMaxSize()
                    .hazeSource(hazeState),
                contentScale = ContentScale.Crop
            )
        } else {
            AsyncImage(
                model = bgImagePath,
                contentDescription = null,
                imageLoader = org.koin.compose.koinInject(),
                modifier = Modifier
                    .fillMaxSize()
                    .blur(blur.dp),
                contentScale = ContentScale.Crop
            )
        }
    } else {
        androidx.compose.foundation.Canvas(modifier = Modifier.fillMaxSize()) {
            // Base background color #12100E
            drawRect(color = androidx.compose.ui.graphics.Color(0xFF12100E))
            
            // Top-right radial glow centered at (width, 0)
            drawCircle(
                brush = androidx.compose.ui.graphics.Brush.radialGradient(
                    colors = listOf(androidx.compose.ui.graphics.Color(0x26D29C6C), androidx.compose.ui.graphics.Color(0x00D29C6C)),
                    center = androidx.compose.ui.geometry.Offset(size.width, 0f),
                    radius = size.minDimension * 0.7f
                ),
                radius = size.minDimension * 0.7f,
                center = androidx.compose.ui.geometry.Offset(size.width, 0f)
            )

            // Bottom-left radial glow centered at (0, height)
            drawCircle(
                brush = androidx.compose.ui.graphics.Brush.radialGradient(
                    colors = listOf(androidx.compose.ui.graphics.Color(0x20D29C6C), androidx.compose.ui.graphics.Color(0x00D29C6C)),
                    center = androidx.compose.ui.geometry.Offset(0f, size.height),
                    radius = size.minDimension * 0.7f
                ),
                radius = size.minDimension * 0.7f,
                center = androidx.compose.ui.geometry.Offset(0f, size.height)
            )
        }
    }
}