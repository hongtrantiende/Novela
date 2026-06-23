package io.legado.app.ui.theme

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import io.legado.app.ui.config.themeConfig.ThemeConfig
import org.koin.compose.koinInject

@Composable
fun AppBackground(
    darkTheme: Boolean,
    content: @Composable () -> Unit
) {
    val hasImageBg = ThemeConfig.hasImageBg(darkTheme)
    val bgImagePath = if (darkTheme) ThemeConfig.bgImageDark else ThemeConfig.bgImageLight
    val blur = if (darkTheme) {
        ThemeConfig.bgImageNBlurring
    } else {
        ThemeConfig.bgImageBlurring
    }

    Box(modifier = Modifier.fillMaxSize()) {

        if (hasImageBg && !bgImagePath.isNullOrBlank()) {
            AsyncImage(
                model = bgImagePath,
                contentDescription = null,
                imageLoader = koinInject(),
                modifier = Modifier
                    .fillMaxSize()
                    .blur(blur.dp),
                contentScale = ContentScale.Crop
            )
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

        content()
    }
}