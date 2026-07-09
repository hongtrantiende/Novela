package io.legado.app.help.skin

import android.content.Context
import android.net.Uri
import io.legado.app.utils.FileUtils
import io.legado.app.utils.printOnDebug
import splitties.init.appCtx
import java.io.File
import java.io.FileOutputStream
import java.util.zip.ZipInputStream

/**
 * Manages skin pack installation, deletion, and activation.
 *
 * Skin packs are stored in: filesDir/skin_packs/{pack_name}/
 * Built-in packs are in: assets/skin_packs/{pack_name}/
 */
object SkinPackManager {

    private const val SKIN_PACKS_DIR = "skin_packs"
    private const val BUILT_IN_PACKS_DIR = "skin_packs"

    /**
     * Get the root directory for user-installed skin packs.
     */
    fun getSkinsDirectory(): File {
        val dir = File(appCtx.filesDir, SKIN_PACKS_DIR)
        if (!dir.exists()) dir.mkdirs()
        return dir
    }

    /**
     * Import a skin pack from a ZIP file URI.
     * @return The installed pack manifest, or null if import failed.
     */
    fun importPack(context: Context, uri: Uri): InstalledSkinPack? {
        return try {
            val tempDir = File(getSkinsDirectory(), "_temp_import")
            if (tempDir.exists()) tempDir.deleteRecursively()
            tempDir.mkdirs()

            // Extract ZIP
            context.contentResolver.openInputStream(uri)?.use { inputStream ->
                ZipInputStream(inputStream).use { zip ->
                    var entry = zip.nextEntry
                    while (entry != null) {
                        val outFile = File(tempDir, entry.name)
                        if (entry.isDirectory) {
                            outFile.mkdirs()
                        } else {
                            outFile.parentFile?.mkdirs()
                            FileOutputStream(outFile).use { fos ->
                                zip.copyTo(fos)
                            }
                        }
                        zip.closeEntry()
                        entry = zip.nextEntry
                    }
                }
            }

            // Parse manifest
            val manifest = SkinPackManifest.fromDirectory(tempDir)
            if (manifest == null || manifest.name.isBlank()) {
                tempDir.deleteRecursively()
                return null
            }

            // Move to final directory
            val finalDir = File(getSkinsDirectory(), sanitizeName(manifest.name))
            if (finalDir.exists()) finalDir.deleteRecursively()
            tempDir.renameTo(finalDir)

            InstalledSkinPack(
                manifest = manifest,
                directory = finalDir,
                isBuiltIn = false
            )
        } catch (e: Exception) {
            e.printOnDebug()
            null
        }
    }

    /**
     * Delete an installed skin pack.
     * Cannot delete built-in packs.
     */
    fun deletePack(name: String): Boolean {
        val dir = File(getSkinsDirectory(), sanitizeName(name))
        return if (dir.exists()) {
            dir.deleteRecursively()
        } else {
            false
        }
    }

    /**
     * Get all installed skin packs (user-installed + built-in).
     */
    fun getInstalledPacks(): List<InstalledSkinPack> {
        val packs = mutableListOf<InstalledSkinPack>()

        // Built-in packs from assets
        packs.addAll(getBuiltInPacks())

        // User-installed packs
        val skinsDir = getSkinsDirectory()
        skinsDir.listFiles()?.forEach { dir ->
            if (dir.isDirectory && dir.name != "_temp_import") {
                val manifest = SkinPackManifest.fromDirectory(dir)
                if (manifest != null) {
                    // Don't add if same name as built-in (user override)
                    val existingIndex = packs.indexOfFirst {
                        it.manifest.name == manifest.name
                    }
                    val pack = InstalledSkinPack(
                        manifest = manifest,
                        directory = dir,
                        isBuiltIn = false
                    )
                    if (existingIndex >= 0) {
                        packs[existingIndex] = pack // User override
                    } else {
                        packs.add(pack)
                    }
                }
            }
        }

        return packs
    }

    /**
     * Get a specific installed skin pack by name.
     */
    fun getPack(name: String): InstalledSkinPack? {
        if (name.isBlank()) return null

        // Check user-installed first (overrides built-in)
        val userDir = File(getSkinsDirectory(), sanitizeName(name))
        if (userDir.exists()) {
            val manifest = SkinPackManifest.fromDirectory(userDir)
            if (manifest != null) {
                return InstalledSkinPack(manifest, userDir, isBuiltIn = false)
            }
        }

        // Check built-in
        return getBuiltInPacks().firstOrNull { it.manifest.name == name }
    }

    /**
     * Get built-in skin packs from assets.
     * Built-in packs are extracted to a cache directory on first access.
     */
    private fun getBuiltInPacks(): List<InstalledSkinPack> {
        val packs = mutableListOf<InstalledSkinPack>()
        try {
            val builtInNames = appCtx.assets.list(BUILT_IN_PACKS_DIR) ?: return packs
            for (packName in builtInNames) {
                val cacheDir = File(appCtx.cacheDir, "$SKIN_PACKS_DIR/$packName")
                if (!cacheDir.exists()) {
                    // Extract from assets on first access
                    extractAssetPack(packName, cacheDir)
                }
                val manifest = SkinPackManifest.fromDirectory(cacheDir)
                if (manifest != null) {
                    packs.add(InstalledSkinPack(manifest, cacheDir, isBuiltIn = true))
                }
            }
        } catch (e: Exception) {
            e.printOnDebug()
        }
        return packs
    }

    /**
     * Extract a built-in skin pack from assets to a cache directory.
     */
    private fun extractAssetPack(packName: String, targetDir: File) {
        try {
            targetDir.mkdirs()
            val assetPath = "$BUILT_IN_PACKS_DIR/$packName"
            copyAssetDirectory(assetPath, targetDir)
        } catch (e: Exception) {
            e.printOnDebug()
        }
    }

    /**
     * Recursively copy an asset directory to a target directory.
     */
    private fun copyAssetDirectory(assetPath: String, targetDir: File) {
        val assets = appCtx.assets
        val entries = assets.list(assetPath) ?: return

        if (entries.isEmpty()) {
            // It's a file
            assets.open(assetPath).use { input ->
                File(targetDir.parentFile, targetDir.name).outputStream().use { output ->
                    input.copyTo(output)
                }
            }
        } else {
            // It's a directory
            targetDir.mkdirs()
            for (entry in entries) {
                val childAssetPath = "$assetPath/$entry"
                val childTarget = File(targetDir, entry)
                val childEntries = assets.list(childAssetPath)
                if (childEntries != null && childEntries.isNotEmpty()) {
                    copyAssetDirectory(childAssetPath, childTarget)
                } else {
                    // It's a file
                    assets.open(childAssetPath).use { input ->
                        childTarget.outputStream().use { output ->
                            input.copyTo(output)
                        }
                    }
                }
            }
        }
    }

    /**
     * Sanitize a skin pack name for use as a directory name.
     */
    private fun sanitizeName(name: String): String {
        return name.replace(Regex("[^a-zA-Z0-9_\\-\\s]"), "")
            .replace(" ", "_")
            .lowercase()
            .take(64)
    }
}
