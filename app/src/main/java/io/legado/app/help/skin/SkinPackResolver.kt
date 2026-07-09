package io.legado.app.help.skin

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import io.legado.app.ui.config.themeConfig.ThemeConfig
import java.io.File

/**
 * CompositionLocal providing the active skin pack to the Compose tree.
 */
val LocalSkinPack = compositionLocalOf<InstalledSkinPack?> { null }

/**
 * Provides the active skin pack to the composable tree.
 * Wraps content with CompositionLocalProvider for LocalSkinPack.
 */
@Composable
fun SkinPackProvider(
    content: @Composable () -> Unit
) {
    val activeSkinName = ThemeConfig.activeSkinPack
    val activePack = remember(activeSkinName) {
        if (activeSkinName.isNotBlank()) {
            SkinPackManager.getPack(activeSkinName)
        } else {
            null
        }
    }

    CompositionLocalProvider(
        LocalSkinPack provides activePack,
        content = content
    )
}

/**
 * Utility composable functions for resolving skin pack assets.
 */
object SkinPackResolver {

    /**
     * Get a Painter for a skin asset, or null if not available.
     */
    @Composable
    fun rememberSkinImage(key: String): Painter? {
        val pack = LocalSkinPack.current ?: return null
        val file = pack.resolveAsset(key) ?: return null
        return rememberSkinFilePainter(file)
    }

    /**
     * Get the background image painter from the active skin.
     */
    @Composable
    fun rememberBackgroundPainter(): Painter? {
        val pack = LocalSkinPack.current ?: return null
        val file = pack.getBackgroundFile() ?: return null
        return rememberSkinFilePainter(file)
    }

    /**
     * Get a navigation icon painter for a specific tab.
     */
    @Composable
    fun rememberNavIconPainter(tab: String): Painter? {
        val pack = LocalSkinPack.current ?: return null
        val file = pack.getNavIconFile(tab) ?: return null
        return rememberSkinFilePainter(file)
    }

    /**
     * Get a character illustration painter.
     */
    @Composable
    fun rememberCharacterPainter(key: String): Painter? {
        val pack = LocalSkinPack.current ?: return null
        val file = pack.getCharacterFile(key) ?: return null
        return rememberSkinFilePainter(file)
    }

    /**
     * Get an icon painter from the active skin.
     */
    @Composable
    fun rememberIconPainter(key: String): Painter? {
        val pack = LocalSkinPack.current ?: return null
        val file = pack.getIconFile(key) ?: return null
        return rememberSkinFilePainter(file)
    }

    /**
     * Get a decoration painter from the active skin.
     */
    @Composable
    fun rememberDecorationPainter(key: String): Painter? {
        val pack = LocalSkinPack.current ?: return null
        val file = pack.getDecorationFile(key) ?: return null
        return rememberSkinFilePainter(file)
    }

    /**
     * Check if a skin pack is currently active.
     */
    @Composable
    fun isSkinActive(): Boolean {
        return LocalSkinPack.current != null
    }

    /**
     * Create an AsyncImagePainter for a skin asset file.
     */
    @Composable
    private fun rememberSkinFilePainter(file: File): Painter {
        val context = LocalContext.current
        return rememberAsyncImagePainter(
            model = ImageRequest.Builder(context)
                .data(file)
                .crossfade(false)
                .build()
        )
    }
}
