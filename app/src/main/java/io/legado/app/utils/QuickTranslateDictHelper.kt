package io.legado.app.utils

import android.content.Context
import io.legado.app.vbookextension.util.QuickTranslateEngine
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File

object QuickTranslateDictHelper {

    fun getDictFile(context: Context, fileName: String): File {
        val dictDir = File(context.filesDir, "dict")
        if (!dictDir.exists()) {
            dictDir.mkdirs()
        }
        return File(dictDir, fileName)
    }

    suspend fun loadDictEntries(context: Context, fileName: String): List<Pair<String, String>> = withContext(Dispatchers.IO) {
        val file = getDictFile(context, fileName)
        if (!file.exists()) return@withContext emptyList()
        val entries = ArrayList<Pair<String, String>>()
        try {
            file.bufferedReader().useLines { lines ->
                lines.forEach { line ->
                    if (line.isNotBlank() && line.contains("=")) {
                        val parts = line.split('=', limit = 2)
                        if (parts.size == 2) {
                            entries.add(Pair(parts[0].trim(), parts[1].trim()))
                        }
                    }
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        entries
    }

    suspend fun saveDictEntries(context: Context, fileName: String, entries: List<Pair<String, String>>) = withContext(Dispatchers.IO) {
        val file = getDictFile(context, fileName)
        try {
            file.bufferedWriter().use { writer ->
                entries.forEach { (key, value) ->
                    writer.write("$key=$value\n")
                }
            }
            if (fileName.contains("book_")) {
                val start = fileName.indexOf("book_") + 5
                val end = fileName.indexOf('_', start)
                if (end != -1) {
                    val bookKey = fileName.substring(start, end)
                    QuickTranslateEngine.initBookPrivateDict(context, bookKey)
                }
            } else {
                QuickTranslateEngine.init(context, force = true)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    suspend fun addOrUpdateEntry(context: Context, fileName: String, key: String, value: String) = withContext(Dispatchers.IO) {
        val entries = loadDictEntries(context, fileName).toMutableList()
        val index = entries.indexOfFirst { it.first == key }
        if (index != -1) {
            entries[index] = Pair(key, value)
        } else {
            entries.add(Pair(key, value))
        }
        saveDictEntries(context, fileName, entries)
    }

    suspend fun deleteEntry(context: Context, fileName: String, key: String) = withContext(Dispatchers.IO) {
        val entries = loadDictEntries(context, fileName).toMutableList()
        val removed = entries.removeAll { it.first == key }
        if (removed) {
            saveDictEntries(context, fileName, entries)
        }
    }

    suspend fun importDict(
        context: Context,
        fileName: String,
        inputStream: java.io.InputStream,
        mode: Int, // 0: Thay thế toàn bộ, 1: Gộp từ điển, 2: Chỉ thêm từ thiếu
        targetTag: String? = null
    ): Boolean = withContext(Dispatchers.IO) {
        try {
            val newEntries = ArrayList<Pair<String, String>>()
            inputStream.bufferedReader().useLines { lines ->
                lines.forEach { line ->
                    if (line.isNotBlank() && line.contains("=")) {
                        val parts = line.split('=', limit = 2)
                        if (parts.size == 2) {
                            val key = parts[0].trim()
                            var value = parts[1].trim()
                            if (targetTag != null) {
                                val lastSlashIndex = value.lastIndexOf('/')
                                val cleanValue = if (lastSlashIndex != -1) {
                                    val tag = value.substring(lastSlashIndex + 1).trim()
                                    if (tag == "PER" || tag == "LOC" || tag == "ORG" || tag == "PRON" || tag == "USER") {
                                        value.substring(0, lastSlashIndex).trim()
                                    } else {
                                        value
                                    }
                                } else {
                                    value
                                }
                                value = "$cleanValue/$targetTag"
                            }
                            newEntries.add(Pair(key, value))
                        }
                    }
                }
            }

            if (mode == 0) {
                // Thay thế toàn bộ
                saveDictEntries(context, fileName, newEntries)
            } else {
                val currentEntries = loadDictEntries(context, fileName).toMutableList()
                val currentKeys = currentEntries.map { it.first }.toSet()
                
                if (mode == 1) {
                    // Gộp từ điển (đè lên nếu trùng)
                    val newEntriesMap = newEntries.toMap()
                    for (i in currentEntries.indices) {
                        val key = currentEntries[i].first
                        if (newEntriesMap.containsKey(key)) {
                            currentEntries[i] = Pair(key, newEntriesMap[key]!!)
                        }
                    }
                    newEntries.forEach { (key, value) ->
                        if (!currentKeys.contains(key)) {
                            currentEntries.add(Pair(key, value))
                        }
                    }
                } else if (mode == 2) {
                    // Chỉ thêm từ thiếu (giữ nguyên nếu trùng)
                    newEntries.forEach { (key, value) ->
                        if (!currentKeys.contains(key)) {
                            currentEntries.add(Pair(key, value))
                        }
                    }
                }
                saveDictEntries(context, fileName, currentEntries)
            }
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    suspend fun deleteDictFile(context: Context, fileName: String): Boolean = withContext(Dispatchers.IO) {
        val file = getDictFile(context, fileName)
        if (file.exists()) {
            val success = file.delete()
            if (success) {
                QuickTranslateEngine.init(context, force = true)
            }
            success
        } else {
            false
        }
    }
}
