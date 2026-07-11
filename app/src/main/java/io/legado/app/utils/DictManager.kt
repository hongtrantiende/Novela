package io.legado.app.utils

import android.content.Context
import android.net.Uri
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import io.legado.app.model.TranslationLoader
import splitties.init.appCtx
import java.io.BufferedReader
import java.io.File
import java.io.FileOutputStream
import java.io.InputStreamReader

object DictManager {

    private const val DICT_DIR = "translate/custom"
    
    // Define dictionary types and their filenames
    enum class DictType(val fileName: String) {
        NAMES("Names.txt"),
        VIETPHRASE("VietPhrase.txt"),
        PHIENAM("ChinesePhienAmWords.txt"),
        LUATNHAN("LuatNhan.txt"),
        PRONOUNS("Pronouns.txt")
    }

    /**
     * Get the directory where custom dictionaries are stored.
     */
    fun getCustomDictDir(): File {
        val dir = File(appCtx.filesDir, DICT_DIR)
        if (!dir.exists()) {
            dir.mkdirs()
        }
        return dir
    }

    /**
     * Get the file object for a specific dictionary type.
     */
    fun getCustomDictFile(type: DictType): File {
        return File(getCustomDictDir(), type.fileName)
    }

    /**
     * Check if a custom dictionary exists.
     */
    fun hasCustomDict(type: DictType): Boolean {
        return getCustomDictFile(type).exists()
    }

    /**
     * Import a dictionary file from a URI.
     * @param context Context
     * @param uri Source URI
     * @param type Dictionary Type
     * @return Boolean success
     */
    fun importDict(context: Context, uri: Uri, type: DictType): Boolean {
        return try {
            val inputStream = context.contentResolver.openInputStream(uri) ?: return false
            val destFile = getCustomDictFile(type)
            
            // Copy and filter the text file
            val result = filterAndCopyFile(inputStream, destFile)
            inputStream.close()

            if (result) {
                // Delete any existing binary cache for this custom dict.
                // The UI layer can trigger rebuilding via TranslationLoader.prebuildType(type)
                // so we don't block the main thread here.
                try {
                    val datFile = File(destFile.parent, "${destFile.nameWithoutExtension}.dat")
                    val binFile = File(destFile.parent, "${destFile.nameWithoutExtension}.bin")
                    if (datFile.exists()) datFile.delete()
                    if (binFile.exists()) binFile.delete()
                } catch (_: Exception) {
                }
                TranslationLoader.clearCache()
            }
            
            result
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    /**
     * Filter and copy dictionary file.
     * Rules:
     * 1. Keep only the first meaning after splitting by "/"
     * 2. Remove lines that contain numbers AND chapter keywords (Quyển, Chương, Tiết, Hồi...)
     */
    private fun filterAndCopyFile(inputStream: java.io.InputStream, outputFile: File): Boolean {
        try {
            val reader = java.io.BufferedReader(java.io.InputStreamReader(inputStream))
            val writer = java.io.BufferedWriter(java.io.FileWriter(outputFile))

            val noiseRegex = Regex(".*\\d.*")
            val chapterKeywords = Regex(".*(Quyển|Chương|Tiết|Hồi|卷|回|章|幕|集|节).*")

            var line: String? = reader.readLine()
            while (line != null) {
                if (line.isNotBlank()) {
                    // Rule 2: Remove noise
                    if (line.matches(noiseRegex) && line.matches(chapterKeywords)) {
                        line = reader.readLine()
                        continue
                    }

                    // Rule 1: Filter meanings
                    val processedLine = if (line.contains("=")) {
                        val parts = line.split("=", limit = 2)
                        if (parts.size == 2) {
                            val key = parts[0]
                            val rawValue = parts[1]
                            val slashIdx = rawValue.indexOf('/')
                            val barIdx = rawValue.indexOf('|')
                            val splitIdx = when {
                                slashIdx != -1 && barIdx != -1 -> minOf(slashIdx, barIdx)
                                slashIdx != -1 -> slashIdx
                                barIdx != -1 -> barIdx
                                else -> -1
                            }
                            val firstMeaning = if (splitIdx != -1) rawValue.substring(0, splitIdx).trim() else rawValue.trim()
                            "$key=$firstMeaning"
                        } else {
                            line
                        }
                    } else {
                        line
                    }

                    writer.write(processedLine)
                    writer.newLine()
                }
                line = reader.readLine()
            }

            writer.flush()
            writer.close()
            reader.close()
            return true
        } catch (e: Exception) {
            e.printStackTrace()
            return false
        }
    }

    /**
     * Delete a custom dictionary file.
     */
    fun deleteCustomDict(type: DictType): Boolean {
        val file = getCustomDictFile(type)
        return if (file.exists()) {
            val ok = file.delete()
            try {
                val datFile = File(file.parent, "${file.nameWithoutExtension}.dat")
                val binFile = File(file.parent, "${file.nameWithoutExtension}.bin")
                if (datFile.exists()) datFile.delete()
                if (binFile.exists()) binFile.delete()
            } catch (_: Exception) {
            }
            if (ok) TranslationLoader.clearCache()
            ok
        } else {
            false
        }
    }

    /**
     * Add or update a name entry in the custom Names.txt dictionary.
     * Automatically updates memory cache and triggers rebuild.
     */
    suspend fun addOrUpdateCustomName(key: String, value: String) = withContext(Dispatchers.IO) {
        val file = getCustomDictFile(DictType.NAMES)
        if (!file.exists()) {
            file.parentFile?.mkdirs()
            file.createNewFile()
        }
        
        val lines = file.readLines().toMutableList()
        var found = false
        for (i in lines.indices) {
            val line = lines[i].trim()
            if (line.startsWith("$key=")) {
                lines[i] = "$key=$value"
                found = true
                break
            }
        }
        if (!found) {
            lines.add("$key=$value")
        }
        
        file.writeText(lines.joinToString("\n"))
        
        // Clear memory caches and trigger binary rebuild in background
        TranslateUtils.clearCache()
        TranslationLoader.prebuildType(DictType.NAMES)
    }
}
