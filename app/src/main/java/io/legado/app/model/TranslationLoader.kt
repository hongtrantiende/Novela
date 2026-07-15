package io.legado.app.model

import io.legado.app.utils.DictManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import splitties.init.appCtx
import java.io.BufferedReader
import java.io.DataInputStream
import java.io.DataOutputStream
import java.io.BufferedOutputStream
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.InputStream
import java.io.InputStreamReader

/**
 * Loads VietPhrase translation dictionaries into memory using DoubleArrayTrie structures
 * Supports both binary (.dat) and text (.txt) formats for backward compatibility
 */
object TranslationLoader {

    @Volatile
    private var translationData: TranslationData? = null

    @Volatile
    private var isLoading = false

    private val loadMutex = Mutex()

    private const val DEFAULT_BIN_DIR = "translate/binary"
    private const val PHONETIC_BIN_SUFFIX = ".bin"
    private const val PHONETIC_MAGIC = 0x50484D50
    private const val PHONETIC_VERSION = 1

    /**
     * Increment this when DoubleArrayTrie binary format or build logic changes.
     * On mismatch, all cached .dat files will be cleared and rebuilt.
     */
    private const val DICT_BINARY_VERSION = 4
    private const val PREF_DICT_BINARY_VERSION = "dict_binary_version"

    private fun invalidateCacheIfNeeded() {
        val prefs = appCtx.getSharedPreferences("translation_loader", android.content.Context.MODE_PRIVATE)
        val cachedVersion = prefs.getInt(PREF_DICT_BINARY_VERSION, 0)
        if (cachedVersion != DICT_BINARY_VERSION) {
            android.util.Log.i("TranslationLoader", "Binary version changed ($cachedVersion -> $DICT_BINARY_VERSION), clearing all binary caches")
            clearAllBinaryCache()
            prefs.edit().putInt(PREF_DICT_BINARY_VERSION, DICT_BINARY_VERSION).apply()
        }
    }

    /**
     * Load translation data (lazy loading, singleton pattern)
     * Priority: Binary files > Custom text files > Default text files
     */
    suspend fun loadTranslationData(): TranslationData? = withContext(Dispatchers.IO) {
        
        // Invalidate binary cache if app/dict binary version changed
        invalidateCacheIfNeeded()

        // Return cached data if available
        translationData?.let { 
            return@withContext it 
        }

        if (!loadMutex.tryLock()) {
            loadMutex.lock()
        }

        try {
            // Double-check after acquiring lock
            translationData?.let {
                return@withContext it
            }

            isLoading = true
            try {
                val assets = appCtx.assets

                // Load Names dictionary
                val namesTrie = try {
                    loadDictionary(
                        binaryAsset = "translate/vietphrase/Names.dat",
                        customType = DictManager.DictType.NAMES
                    )
                } catch (e: Exception) {
                    android.util.Log.e("TranslationLoader", "Failed to load Names dictionary", e)
                    throw e
                }

                // Load VietPhrase dictionary
                val vietPhraseTrie = try {
                    loadDictionary(
                        binaryAsset = "translate/vietphrase/VietPhrase.dat",
                        customType = DictManager.DictType.VIETPHRASE
                    )
                } catch (e: Exception) {
                    android.util.Log.e("TranslationLoader", "Failed to load VietPhrase dictionary", e)
                    throw e
                }

                // Load ChinesePhienAm dictionary (always HashMap for phonetic mapping)
                val chinesePhienAm = try {
                    loadPhoneticDictionary(
                        textAsset = "translate/vietphrase/ChinesePhienAmWords.txt",
                        customType = DictManager.DictType.PHIENAM
                    )
                } catch (e: Exception) {
                    android.util.Log.e("TranslationLoader", "Failed to load ChinesePhienAm dictionary", e)
                    throw e
                }

                // Load LuatNhan dictionary (template patterns, optional)
                val luatNhan = try {
                    loadDownloadedMapDict("LuatNhan.txt")
                } catch (e: Exception) {
                    android.util.Log.w("TranslationLoader", "Failed to load LuatNhan dictionary, skipping", e)
                    emptyMap()
                }

                // Load Pronouns dictionary (trie, optional)
                val pronounsTrie = try {
                    loadDownloadedTrieDict("Pronouns.txt")
                } catch (e: Exception) {
                    android.util.Log.w("TranslationLoader", "Failed to load Pronouns dictionary, skipping", e)
                    null
                }

                translationData = TranslationData(namesTrie, vietPhraseTrie, chinesePhienAm, luatNhan, pronounsTrie)
                translationData
            } catch (e: Throwable) {
                android.util.Log.e("TranslationLoader", "Error loading translation data", e)
                null
            } finally {
                isLoading = false
            }
        } finally {
            loadMutex.unlock()
        }
    }

    /**
     * Load dictionary with DoubleArrayTrie (Memory-Mapped)
     * Priority: Custom .dat > Custom .txt (build+save+mmap) > Default .dat from filesDir (mmap)
     */
    private suspend fun loadDictionary(
        binaryAsset: String,
        customType: DictManager.DictType
    ): DoubleArrayTrie = withContext(Dispatchers.IO) {
        val trie = DoubleArrayTrie()

        // 1. Try custom dictionary first
        if (DictManager.hasCustomDict(customType)) {
            val customFile = DictManager.getCustomDictFile(customType)
            val customBinaryFile = File(customFile.parent, "${customFile.nameWithoutExtension}.dat")
            if (loadDictionaryFromTextFile(customFile, customBinaryFile, trie)) {
                return@withContext trie
            }
        }

        // 2. Try downloaded dictionaries in filesDir/dict/
        val downloadedFileName = when (customType) {
            DictManager.DictType.NAMES -> "Name.txt"
            DictManager.DictType.VIETPHRASE -> "VietPhrase.txt"
            DictManager.DictType.PHIENAM -> "PhienAm.txt"
            DictManager.DictType.LUATNHAN -> "LuatNhan.txt"
            DictManager.DictType.PRONOUNS -> "Pronouns.txt"
        }
        val downloadedFile = File(appCtx.filesDir, "dict/$downloadedFileName")
        if (downloadedFile.exists()) {
            val downloadedBinaryFile = File(downloadedFile.parentFile, "${downloadedFile.nameWithoutExtension}.dat")
            if (loadDictionaryFromTextFile(downloadedFile, downloadedBinaryFile, trie)) {
                return@withContext trie
            }
        }

        // 3. Try default binary in filesDir
        val binDir = File(appCtx.filesDir, DEFAULT_BIN_DIR)
        val binFile = File(binDir, File(binaryAsset).name)
        if (binFile.exists()) {
            try {
                trie.loadMapped(binFile)
                android.util.Log.d("TranslationLoader", "Loaded default dict (mmap): ${binFile.path}")
                return@withContext trie
            } catch (e: Exception) {
                try { binFile.delete() } catch (_: Exception) {}
                android.util.Log.w("TranslationLoader", "Corrupted persistent binary, will re-copy", e)
            }
        }

        // Copy asset to filesDir, then memory-map (only if asset is present, else fails gracefully)
        try {
            binDir.mkdirs()
            val tmpFile = File(binDir, binFile.name + ".tmp")
            appCtx.assets.open(binaryAsset).use { input ->
                FileOutputStream(tmpFile).use { fos ->
                    input.copyTo(fos, 1024 * 1024)
                }
            }
            if (binFile.exists()) binFile.delete()
            if (tmpFile.renameTo(binFile)) {
                trie.loadMapped(binFile)
                android.util.Log.d("TranslationLoader", "Asset copied+mapped: ${binFile.path}")
                return@withContext trie
            }
        } catch (e: Exception) {
            android.util.Log.w("TranslationLoader", "Failed to load default asset dictionary: $binaryAsset")
        }

        trie
    }

    private suspend fun loadDictionaryFromTextFile(
        textFile: File,
        binaryFile: File,
        trie: DoubleArrayTrie
    ): Boolean = withContext(Dispatchers.IO) {
        if (!textFile.exists()) return@withContext false
        
        if (binaryFile.exists()) {
            try {
                trie.loadMapped(binaryFile)
                android.util.Log.d("TranslationLoader", "Loaded compiled dict (mmap): ${binaryFile.path}")
                return@withContext true
            } catch (e: Exception) {
                try { binaryFile.delete() } catch (_: Exception) {}
            }
        }
        
        try {
            FileInputStream(textFile).use { stream ->
                val entries = loadEntriesFromText(stream)
                val tmpFile = File(binaryFile.parentFile, binaryFile.name + ".tmp")
                try {
                    FileOutputStream(tmpFile).use { fos ->
                        BufferedOutputStream(fos, 1024 * 1024).use { bos ->
                            trie.save(bos, entries)
                        }
                    }
                    if (binaryFile.exists()) binaryFile.delete()
                    if (!tmpFile.renameTo(binaryFile)) {
                        throw IllegalStateException("Failed to rename temp cache")
                    }
                } catch (e: Throwable) {
                    try { tmpFile.delete() } catch (_: Throwable) {}
                    android.util.Log.e("TranslationLoader", "Failed to cache compiled trie", e)
                }
            }
            if (binaryFile.exists()) {
                trie.loadMapped(binaryFile)
                android.util.Log.d("TranslationLoader", "Compiled dict built+mapped: ${binaryFile.path}")
                return@withContext true
            }
        } catch (e: Throwable) {
            android.util.Log.e("TranslationLoader", "Error compiling text dictionary: ${textFile.path}", e)
        }
        return@withContext false
    }
    
    /**
     * Load phonetic dictionary as HashMap (kept as is for performance)
     */
    private suspend fun loadPhoneticDictionary(
        textAsset: String,
        customType: DictManager.DictType
    ): Map<String, String> = withContext(Dispatchers.IO) {
        // 1. Try custom dictionary first
        if (DictManager.hasCustomDict(customType)) {
            val customFile = DictManager.getCustomDictFile(customType)
            val customBin = File(customFile.parent, "${customFile.nameWithoutExtension}$PHONETIC_BIN_SUFFIX")

            if (customBin.exists()) {
                try {
                    android.util.Log.d("TranslationLoader", "Trying to load custom phonetic binary: ${customBin.path}")
                    return@withContext loadPhoneticBinary(customBin)
                } catch (e: Exception) {
                    try { customBin.delete() } catch (_: Exception) { }
                    android.util.Log.w("TranslationLoader", "Failed to load custom phonetic binary, fallback", e)
                }
            }

            if (customFile.exists()) {
                android.util.Log.d("TranslationLoader", "Loading custom phonetic file: ${customFile.path}")
                FileInputStream(customFile).use { stream ->
                    val map = loadMapFromStream(stream)
                    android.util.Log.d("TranslationLoader", "Custom phonetic entries loaded: ${map.size}")
                    try {
                        savePhoneticBinary(map, customBin)
                        android.util.Log.d("TranslationLoader", "Custom phonetic cached to: ${customBin.path}")
                    } catch (e: Exception) {
                        android.util.Log.w("TranslationLoader", "Failed to cache custom phonetic", e)
                    }
                    return@withContext map
                }
            }
        }

        // 2. Try downloaded dictionary in filesDir/dict/
        val downloadedFile = File(appCtx.filesDir, "dict/PhienAm.txt")
        if (downloadedFile.exists()) {
            val downloadedBin = File(downloadedFile.parentFile, "PhienAm$PHONETIC_BIN_SUFFIX")
            if (downloadedBin.exists()) {
                try {
                    android.util.Log.d("TranslationLoader", "Loaded downloaded phonetic binary: ${downloadedBin.path}")
                    return@withContext loadPhoneticBinary(downloadedBin)
                } catch (e: Exception) {
                    try { downloadedBin.delete() } catch (_: Exception) {}
                    android.util.Log.w("TranslationLoader", "Failed to load downloaded phonetic binary, fallback", e)
                }
            }

            if (downloadedFile.exists()) {
                android.util.Log.d("TranslationLoader", "Loading downloaded phonetic file: ${downloadedFile.path}")
                try {
                    FileInputStream(downloadedFile).use { stream ->
                        val map = loadMapFromStream(stream)
                        android.util.Log.d("TranslationLoader", "Downloaded phonetic entries loaded: ${map.size}")
                        try {
                            savePhoneticBinary(map, downloadedBin)
                            android.util.Log.d("TranslationLoader", "Downloaded phonetic cached to: ${downloadedBin.path}")
                        } catch (e: Exception) {
                            android.util.Log.w("TranslationLoader", "Failed to cache downloaded phonetic", e)
                        }
                        return@withContext map
                    }
                } catch (e: Exception) {
                    android.util.Log.e("TranslationLoader", "Failed to load downloaded phonetic file", e)
                }
            }
        }

        // 3. Try persistent default binary in filesDir
        val defaultBinDir = File(appCtx.filesDir, DEFAULT_BIN_DIR)
        val defaultBin = File(defaultBinDir, File(textAsset).nameWithoutExtension + PHONETIC_BIN_SUFFIX)
        if (defaultBin.exists()) {
            try {
                android.util.Log.d("TranslationLoader", "Trying to load default phonetic binary: ${defaultBin.path}")
                return@withContext loadPhoneticBinary(defaultBin)
            } catch (e: Exception) {
                try { defaultBin.delete() } catch (_: Exception) { }
                android.util.Log.w("TranslationLoader", "Failed to load default phonetic binary, fallback", e)
            }
        }
        
        // 4. Try copy default asset (fallback)
        try {
            android.util.Log.d("TranslationLoader", "Loading default phonetic file: $textAsset")
            appCtx.assets.open(textAsset).use { stream ->
                val map = loadMapFromStream(stream)
                android.util.Log.d("TranslationLoader", "Default phonetic entries loaded: ${map.size}")
                try {
                    defaultBinDir.mkdirs()
                    savePhoneticBinary(map, defaultBin)
                    android.util.Log.d("TranslationLoader", "Default phonetic cached to: ${defaultBin.path}")
                } catch (e: Exception) {
                    android.util.Log.w("TranslationLoader", "Failed to cache default phonetic", e)
                }
                return@withContext map
            }
        } catch (e: Exception) {
            android.util.Log.w("TranslationLoader", "Failed to load default asset phonetic: $textAsset")
        }

        emptyMap()
    }

    suspend fun prebuildAll() {
        prebuildType(DictManager.DictType.NAMES)
        prebuildType(DictManager.DictType.VIETPHRASE)
        prebuildType(DictManager.DictType.PHIENAM)
    }

    suspend fun prebuildType(type: DictManager.DictType) = withContext(Dispatchers.IO) {
        loadMutex.withLock {
            when (type) {
                DictManager.DictType.NAMES -> {
                    loadDictionary(
                        binaryAsset = "translate/vietphrase/Names.dat",
                        customType = DictManager.DictType.NAMES
                    )
                }
                DictManager.DictType.VIETPHRASE -> {
                    loadDictionary(
                        binaryAsset = "translate/vietphrase/VietPhrase.dat",
                        customType = DictManager.DictType.VIETPHRASE
                    )
                }
                DictManager.DictType.PHIENAM -> {
                    loadPhoneticDictionary(
                        textAsset = "translate/vietphrase/ChinesePhienAmWords.txt",
                        customType = DictManager.DictType.PHIENAM
                    )
                }
                DictManager.DictType.LUATNHAN -> {
                    loadDownloadedMapDict("LuatNhan.txt")
                }
                DictManager.DictType.PRONOUNS -> {
                    loadDownloadedTrieDict("Pronouns.txt")
                }
            }
        }
    }

    private fun loadPhoneticBinary(file: File): Map<String, String> {
        DataInputStream(FileInputStream(file)).use { dis ->
            val magic = dis.readInt()
            val version = dis.readInt()
            if (magic != PHONETIC_MAGIC || version != PHONETIC_VERSION) {
                throw IllegalStateException("Unsupported phonetic binary format")
            }
            val size = dis.readInt()
            val map = HashMap<String, String>(size)
            repeat(size) {
                val k = dis.readUTF()
                val v = dis.readUTF()
                map[k] = v
            }
            return map
        }
    }

    private fun savePhoneticBinary(map: Map<String, String>, file: File) {
        val tmp = File(file.parentFile, file.name + ".tmp")
        DataOutputStream(BufferedOutputStream(FileOutputStream(tmp), 256 * 1024)).use { dos ->
            dos.writeInt(PHONETIC_MAGIC)
            dos.writeInt(PHONETIC_VERSION)
            dos.writeInt(map.size)
            map.forEach { (k, v) ->
                dos.writeUTF(k)
                dos.writeUTF(v)
            }
        }
        if (file.exists()) file.delete()
        if (!tmp.renameTo(file)) {
            tmp.delete()
            throw IllegalStateException("Failed to finalize phonetic binary")
        }
    }

    /**
     * Load a downloaded map dictionary from filesDir/dict/
     * Used for LuatNhan.txt (template patterns)
     */
    private suspend fun loadDownloadedMapDict(fileName: String): Map<String, String> = withContext(Dispatchers.IO) {
        val downloadedFile = File(appCtx.filesDir, "dict/$fileName")
        if (!downloadedFile.exists()) {
            android.util.Log.d("TranslationLoader", "Downloaded dict not found: $fileName")
            return@withContext emptyMap()
        }
        android.util.Log.d("TranslationLoader", "Loading downloaded map dict: $fileName")
        FileInputStream(downloadedFile).use { stream ->
            val map = loadMapFromStream(stream)
            android.util.Log.d("TranslationLoader", "Loaded $fileName: ${map.size} entries")
            map
        }
    }

    /**
     * Load a downloaded trie dictionary from filesDir/dict/
     * Used for Pronouns.txt
     */
    private suspend fun loadDownloadedTrieDict(fileName: String): DoubleArrayTrie? = withContext(Dispatchers.IO) {
        val downloadedFile = File(appCtx.filesDir, "dict/$fileName")
        if (!downloadedFile.exists()) {
            android.util.Log.d("TranslationLoader", "Downloaded dict not found: $fileName")
            return@withContext null
        }
        val trie = DoubleArrayTrie()
        val binaryFile = File(downloadedFile.parentFile, "${downloadedFile.nameWithoutExtension}.dat")
        if (loadDictionaryFromTextFile(downloadedFile, binaryFile, trie)) {
            android.util.Log.d("TranslationLoader", "Loaded trie dict $fileName successfully")
            trie
        } else {
            android.util.Log.w("TranslationLoader", "Failed to load trie dict $fileName")
            null
        }
    }
    
    /**
     * Load entries from text file (key=value format)
     */
    private fun loadEntriesFromText(inputStream: InputStream): List<Pair<String, String>> {
        val entries = mutableListOf<Pair<String, String>>()
        var totalLines = 0
        var validEntries = 0
        var filteredEntries = 0
        
        inputStream.use { stream ->
            BufferedReader(InputStreamReader(stream, Charsets.UTF_8), 32768).use { reader ->
                var line: String?
                while (reader.readLine().also { line = it } != null) {
                    totalLines++
                    val currentLine = line!!
                    
                    if (currentLine.isNotBlank()) {
                        // Fast check for "=" before expensive operations
                        if (currentLine.contains('=')) {
                            // Only remove actual control characters, not legitimate content
                            val cleanLine = currentLine.replace("\u0000", "").replace("\u0001", "").replace("\u0004", "").trim()
                            
                            if (cleanLine.isNotEmpty() && cleanLine.contains("=")) {
                                val parts = cleanLine.split("=", limit = 2)
                                if (parts.size == 2) {
                                    // Strip surrounding quotes from key
                                    val key = parts[0].trim().removeSurrounding("\"")
                                    val rawValue = parts[1].trim()
                                    
                                    // Find first occurrence of '/' or '|'
                                    val slashIdx = rawValue.indexOf('/')
                                    val barIdx = rawValue.indexOf('|')
                                    val splitIdx = when {
                                        slashIdx != -1 && barIdx != -1 -> minOf(slashIdx, barIdx)
                                        slashIdx != -1 -> slashIdx
                                        barIdx != -1 -> barIdx
                                        else -> -1
                                    }
                                    
                                    val firstPart = if (splitIdx != -1) rawValue.substring(0, splitIdx).trim() else rawValue
                                    val value = firstPart.removeSurrounding("\"")
                                    
                                    // Simplified validation - only check for empty/null
                                    if (key.isNotEmpty() && value.isNotEmpty()) {
                                        entries.add(Pair(key, value))
                                        validEntries++
                                    } else {
                                        filteredEntries++
                                    }
                                }
                            }
                        }
                    }
                    
                    // Log progress every 5000 lines to avoid spam
                    if (totalLines % 5000 == 0) {
                        android.util.Log.d("TranslationLoader", "Processed $totalLines lines...")
                    }
                }
            }
        }
        android.util.Log.d("TranslationLoader", "Lines processed: $totalLines, Valid entries: $validEntries, Filtered: $filteredEntries")
        return entries
    }

    /**
     * Load a Map from input stream (key=value format)
     */
    private fun loadMapFromStream(inputStream: InputStream): Map<String, String> {
        val map = mutableMapOf<String, String>()
        var totalLines = 0
        
        inputStream.use { stream ->
            BufferedReader(InputStreamReader(stream, Charsets.UTF_8), 32768).use { reader ->
                var line: String?
                while (reader.readLine().also { line = it } != null) {
                    totalLines++
                    val currentLine = line!!
                    
                    if (currentLine.isNotBlank()) {
                        // Fast check for "=" before expensive operations
                        if (currentLine.contains('=')) {
                            // Only remove actual control characters, not legitimate content
                            val cleanLine = currentLine.replace("\u0000", "").replace("\u0001", "").replace("\u0004", "").trim()
                            
                            if (cleanLine.isNotEmpty() && cleanLine.contains("=")) {
                                val parts = cleanLine.split("=", limit = 2)
                                if (parts.size == 2) {
                                    val key = parts[0].trim().removeSurrounding("\"")
                                    val value = parts[1].trim().removeSurrounding("\"")
                                    // Simplified validation - only check for empty/null
                                    if (key.isNotEmpty() && value.isNotEmpty()) {
                                        map[key] = value
                                    }
                                }
                            }
                        }
                    }
                    
                    // Log progress every 5000 lines
                    if (totalLines % 5000 == 0) {
                        android.util.Log.d("TranslationLoader", "Phonetic processed $totalLines lines...")
                    }
                }
            }
        }
        android.util.Log.d("TranslationLoader", "Phonetic map loaded: ${map.size} entries from $totalLines lines")
        return map
    }

    /**
     * Clear cached data (called when custom dict is imported/reset)
     */
    fun clearCache() {
        translationData = null
    }
    
    /**
     * Clear all cached binary files (for debugging or reset)
     */
    fun clearAllBinaryCache() {
        try {
            // Clear app cache directory
            val cacheDir = File(appCtx.cacheDir, "dictionaries")
            if (cacheDir.exists()) {
                cacheDir.listFiles()?.forEach { file ->
                    if (file.name.endsWith(".dat")) {
                        file.delete()
                        android.util.Log.d("TranslationLoader", "Deleted cached binary: ${file.name}")
                    }
                }
            }
            
            // Clear custom binary files
            val customDir = DictManager.getCustomDictDir()
            customDir.listFiles()?.forEach { file ->
                if (file.name.endsWith(".dat")) {
                    file.delete()
                    android.util.Log.d("TranslationLoader", "Deleted custom binary: ${file.name}")
                }
            }

            // Clear downloaded dict binary files (filesDir/dict/)
            val dictDir = File(appCtx.filesDir, "dict")
            if (dictDir.exists()) {
                dictDir.listFiles()?.forEach { file ->
                    if (file.name.endsWith(".dat") || file.name.endsWith(PHONETIC_BIN_SUFFIX)) {
                        file.delete()
                        android.util.Log.d("TranslationLoader", "Deleted downloaded dict binary: ${file.name}")
                    }
                }
            }

            // Clear default binary files (filesDir/translate/binary/)
            val defaultBinDir = File(appCtx.filesDir, DEFAULT_BIN_DIR)
            if (defaultBinDir.exists()) {
                defaultBinDir.listFiles()?.forEach { file ->
                    if (file.name.endsWith(".dat") || file.name.endsWith(PHONETIC_BIN_SUFFIX)) {
                        file.delete()
                        android.util.Log.d("TranslationLoader", "Deleted default binary: ${file.name}")
                    }
                }
            }
        } catch (e: Exception) {
            android.util.Log.e("TranslationLoader", "Error clearing binary cache", e)
        }
    }

    /**
     * Reload specific dictionary type
     */
    suspend fun reloadType(type: DictManager.DictType) {
        clearCache()
        // Next call to loadTranslationData will reload all
    }
}
