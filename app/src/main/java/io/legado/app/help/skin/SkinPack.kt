package io.legado.app.help.skin

import android.graphics.BitmapFactory
import androidx.annotation.Keep
import io.legado.app.utils.GSON
import io.legado.app.utils.fromJsonObject
import java.io.File

/**
 * Skin Pack data models.
 *
 * A skin pack is a directory containing:
 * - manifest.json — metadata and asset mapping
 * - Image files organized in subdirectories (nav/, icons/, characters/, etc.)
 */

@Keep
data class SkinPackManifest(
    val name: String = "",
    val version: String = "1.0",
    val author: String = "",
    val description: String = "",
    val colorScheme: SkinColorScheme? = null,
    val assets: Map<String, String> = emptyMap()
) {
    companion object {
        const val MANIFEST_FILE = "manifest.json"

        fun fromJson(json: String): SkinPackManifest? {
            return GSON.fromJsonObject<SkinPackManifest>(json).getOrNull()
        }

        fun fromDirectory(dir: File): SkinPackManifest? {
            val manifestFile = File(dir, MANIFEST_FILE)
            if (!manifestFile.exists()) return null
            return try {
                fromJson(manifestFile.readText())?.copy()
            } catch (e: Exception) {
                null
            }
        }
    }

    fun toJson(): String = GSON.toJson(this)
}

@Keep
data class SkinColorScheme(
    val primary: String? = null,
    val onPrimary: String? = null,
    val primaryContainer: String? = null,
    val onPrimaryContainer: String? = null,
    val secondary: String? = null,
    val onSecondary: String? = null,
    val secondaryContainer: String? = null,
    val onSecondaryContainer: String? = null,
    val background: String? = null,
    val onBackground: String? = null,
    val surface: String? = null,
    val onSurface: String? = null,
    val surfaceContainer: String? = null,
    val surfaceContainerHigh: String? = null,
    val surfaceContainerLow: String? = null,
    val outline: String? = null
)

/**
 * Represents an installed skin pack on disk.
 */
data class InstalledSkinPack(
    val manifest: SkinPackManifest,
    val directory: File,
    val isBuiltIn: Boolean = false
) {
    /**
     * Resolve an asset path from the manifest to an actual file.
     * Returns null if the asset key doesn't exist or the file is missing.
     */
    fun resolveAsset(key: String): File? {
        val relativePath = manifest.assets[key] ?: return null
        val file = File(directory, relativePath)
        return if (file.exists()) file else null
    }

    /**
     * Check if this skin pack has a specific asset.
     */
    fun hasAsset(key: String): Boolean {
        return resolveAsset(key) != null
    }

    /**
     * Get the background image file, if available.
     */
    fun getBackgroundFile(): File? = resolveAsset(SkinAssetKeys.BACKGROUND)

    /**
     * Get a navigation icon file.
     */
    fun getNavIconFile(tab: String): File? = resolveAsset("nav_$tab")

    /**
     * Get a character illustration file.
     */
    fun getCharacterFile(key: String): File? = resolveAsset("char_$key")

    /**
     * Get an icon file.
     */
    fun getIconFile(key: String): File? = resolveAsset("icon_$key")

    /**
     * Get a decoration file.
     */
    fun getDecorationFile(key: String): File? = resolveAsset("deco_$key")
}

/**
 * Standard asset key constants for skin packs.
 */
object SkinAssetKeys {
    // Background
    const val BACKGROUND = "background"

    // Navigation tabs
    const val NAV_HOME = "nav_home"
    const val NAV_BOOKSHELF = "nav_bookshelf"
    const val NAV_EXPLORE = "nav_explore"
    const val NAV_UPDATES = "nav_updates"
    const val NAV_MY = "nav_my"

    // Characters
    const val CHAR_HEADER_HOME = "char_header_home"
    const val CHAR_HEADER_EXPLORE = "char_header_explore"
    const val CHAR_READING_MASCOT = "char_reading_mascot"
    const val CHAR_BOOKINFO = "char_bookinfo"
    const val CHAR_EMPTY_STATE = "char_empty_state"

    // Section icons — "Của tôi" screen
    const val ICON_WEB_SERVICE = "icon_web_service"
    const val ICON_SOURCE_MANAGE = "icon_source_manage"
    const val ICON_REPLACE_FILTER = "icon_replace_filter"
    const val ICON_TXT_RULES = "icon_txt_rules"
    const val ICON_DICT_RULES = "icon_dict_rules"
    const val ICON_SETTINGS = "icon_settings"
    const val ICON_BOOKMARK = "icon_bookmark"
    const val ICON_READ_HISTORY = "icon_read_history"
    const val ICON_COUNTER_MANAGE = "icon_counter_manage"
    const val ICON_BACKUP = "icon_backup"
    const val ICON_RESTORE = "icon_restore"
    const val ICON_SHARE = "icon_share"
    const val ICON_ABOUT = "icon_about"

    // Book info
    const val ICON_ADD_BOOKSHELF = "icon_add_bookshelf"
    const val ICON_VIEW_CHAPTERS = "icon_view_chapters"
    const val ICON_OPEN_WEB = "icon_open_web"
    const val ICON_BOOK_HISTORY = "icon_book_history"
    const val ICON_READ_BUTTON = "icon_read_button"
    const val BG_READ_BUTTON = "bg_read_button"

    // Explore
    const val ICON_BACK = "icon_back"
    const val ICON_SEARCH = "icon_search"
    const val ICON_SORT = "icon_sort"
    const val ICON_VIEW_MODE = "icon_view_mode"

    // Reader
    const val ICON_READER_TOC = "icon_reader_toc"
    const val ICON_READER_BOOKMARK = "icon_reader_bookmark"
    const val ICON_READER_ALOUD = "icon_reader_aloud"
    const val ICON_READER_SETTINGS = "icon_reader_settings"
    const val ICON_READER_PREV = "icon_reader_prev"
    const val ICON_READER_NEXT = "icon_reader_next"

    // Audio player
    const val AUDIO_PLAY = "audio_play"
    const val AUDIO_PAUSE = "audio_pause"
    const val AUDIO_PREV = "audio_prev"
    const val AUDIO_NEXT = "audio_next"

    // Decorations
    const val DECO_STAR = "deco_star"
    const val DECO_SPARKLE = "deco_sparkle"
    const val DECO_HEART = "deco_heart"
    const val DECO_MOON = "deco_moon"
    const val DECO_SECTION_HEADER = "deco_section_header"

    // UI elements
    const val UI_CARD_BG = "ui_card_bg"
    const val UI_SECTION_HEADER_BG = "ui_section_header_bg"
    const val UI_TAG_BG = "ui_tag_bg"

    // Misc
    const val ICON_DOWNLOAD = "icon_download"
    const val ICON_DELETE = "icon_delete"
    const val ICON_EDIT = "icon_edit"
    const val ICON_REFRESH = "icon_refresh"
    const val ICON_CLOSE = "icon_close"

    /**
     * All known asset keys for validation.
     */
    val ALL_KEYS: Set<String> by lazy {
        SkinAssetKeys::class.java.declaredFields
            .filter { it.type == String::class.java && it.name != "INSTANCE" }
            .mapNotNull { field ->
                try {
                    field.isAccessible = true
                    field.get(null) as? String
                } catch (_: Exception) {
                    null
                }
            }
            .toSet()
    }
}
