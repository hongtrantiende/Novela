package io.legado.app.ui.main.bookshelf

import android.app.Application
import android.content.Context
import androidx.lifecycle.viewModelScope
import io.legado.app.base.BaseViewModel
import io.legado.app.constant.AppLog
import io.legado.app.data.appDb
import io.legado.app.data.entities.BookChapter
import io.legado.app.model.CacheBook
import io.legado.app.utils.startActivityForBook
import io.legado.app.utils.toastOnUi
import io.legado.app.utils.fromJsonObject
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.time.LocalDate
import java.time.format.DateTimeFormatter

enum class ChapterReadStatus {
    UNREAD,
    CURRENT,
    READ
}

data class ChapterUpdateItem(
    val book: BookShelfItem,
    val chapter: BookChapter,
    val updateTime: Long,
    val status: ChapterReadStatus,
    val progressText: String?
)

object ChapterUpdateTimeManager {
    private val file = splitties.init.appCtx.filesDir.resolve("chapter_update_times.json")
    private val atomicFile = android.util.AtomicFile(file)
    private val timeMap = java.util.concurrent.ConcurrentHashMap<String, Long>()
    private val saveLock = Any()

    init {
        load()
    }

    fun get(bookUrl: String, chapterIndex: Int): Long? {
        val key = "${bookUrl}_$chapterIndex"
        return timeMap[key]
    }

    fun putAll(entries: Map<String, Long>) {
        timeMap.putAll(entries)
    }

    fun saveToDisk() {
        synchronized(saveLock) {
            val limit = System.currentTimeMillis() - 90L * 24 * 60 * 60 * 1000
            val keysToRemove = timeMap.keys.filter { key ->
                val value = timeMap[key]
                value != null && value < limit
            }
            keysToRemove.forEach { key ->
                timeMap.remove(key)
            }
            val json = io.legado.app.utils.GSON.toJson(timeMap)
            var stream: java.io.FileOutputStream? = null
            try {
                stream = atomicFile.startWrite()
                stream.write(json.toByteArray(Charsets.UTF_8))
                atomicFile.finishWrite(stream)
            } catch (e: Exception) {
                stream?.let {
                    runCatching { atomicFile.failWrite(it) }
                }
                AppLog.put("ChapterUpdateTimeManager save error", e)
            }
        }
    }

    private fun load() {
        try {
            if (file.exists()) {
                val json = atomicFile.openRead().bufferedReader(Charsets.UTF_8).use { it.readText() }
                val map = io.legado.app.utils.GSON.fromJsonObject<Map<String, Double>>(json).getOrNull()
                map?.forEach { (k, v) ->
                    timeMap[k] = v.toLong()
                }
            }
        } catch (e: Exception) {
            AppLog.put("ChapterUpdateTimeManager load error", e)
        }
    }
}

class BookUpdatesViewModel(application: Application) : BaseViewModel(application) {

    private val _selectedDate = MutableStateFlow<LocalDate?>(null)
    val selectedDate = _selectedDate.asStateFlow()

    private val _dailyUpdateCounts = MutableStateFlow<Map<LocalDate, Int>>(emptyMap())
    val dailyUpdateCounts = _dailyUpdateCounts.asStateFlow()

    fun setSelectedDate(date: LocalDate?) {
        _selectedDate.value = date
    }

    val updatesList = combine(
        appDb.bookDao.flowBookShelfUpdates(System.currentTimeMillis() - 90L * 24 * 60 * 60 * 1000),
        _selectedDate
    ) { books, selectedDate ->
        val items = mutableListOf<ChapterUpdateItem>()
        val limitTime = System.currentTimeMillis() - 90L * 24 * 60 * 60 * 1000
        val pendingTimestamps = mutableMapOf<String, Long>()

        books.forEach { book ->
            val chapters = appDb.bookChapterDao.getChapterList(book.bookUrl)

            chapters.forEach { chapter ->
                val shouldDisplay = if (book.lastCheckCount > 0) {
                    chapter.index >= book.totalChapterNum - book.lastCheckCount ||
                    chapter.index == book.totalChapterNum - book.lastCheckCount - 1
                } else {
                    book.totalChapterNum > 0 && chapter.index == book.totalChapterNum - 1
                }

                if (shouldDisplay) {
                    var chapterTime = ChapterUpdateTimeManager.get(book.bookUrl, chapter.index)
                    if (chapterTime == null) {
                        val isEligible = if (book.lastCheckCount > 0) {
                            chapter.index >= book.totalChapterNum - book.lastCheckCount
                        } else {
                            book.totalChapterNum > 0 && chapter.index == book.totalChapterNum - 1
                        }
                        if (isEligible) {
                            val timeToSave = if (book.latestChapterTime > 0) book.latestChapterTime else System.currentTimeMillis()
                            chapterTime = timeToSave
                            val key = "${book.bookUrl}_${chapter.index}"
                            pendingTimestamps[key] = timeToSave
                        }
                    }

                    if (chapterTime != null && chapterTime >= limitTime) {
                        val isBookUnread = book.durChapterIndex == 0 && book.durChapterPos == 0
                        val status = when {
                            isBookUnread -> ChapterReadStatus.UNREAD
                            chapter.index < book.durChapterIndex -> ChapterReadStatus.READ
                            chapter.index == book.durChapterIndex -> ChapterReadStatus.CURRENT
                            else -> ChapterReadStatus.UNREAD
                        }

                        val progressText = if (status == ChapterReadStatus.CURRENT && book.durChapterPos > 0 && book.isImage) {
                            "Trang: ${book.durChapterPos}"
                        } else {
                            null
                        }

                        items.add(
                            ChapterUpdateItem(
                                book = book,
                                chapter = chapter,
                                updateTime = chapterTime,
                                status = status,
                                progressText = progressText
                            )
                        )
                    }
                }
            }
        }

        // Batch save all pending timestamps at once
        if (pendingTimestamps.isNotEmpty()) {
            ChapterUpdateTimeManager.putAll(pendingTimestamps)
            ChapterUpdateTimeManager.saveToDisk()
        }

        // Calculate daily counts for the heatmap from all computed items in 90 days
        val dailyCounts = items.groupBy { cn.hutool.core.date.DateUtil.format(java.util.Date(it.updateTime), "yyyy-MM-dd") }
            .mapKeys { LocalDate.parse(it.key, DateTimeFormatter.ISO_LOCAL_DATE) }
            .mapValues { it.value.size }
        _dailyUpdateCounts.value = dailyCounts

        // Now filter the items to show based on selectedDate
        val filteredItems = if (selectedDate != null) {
            val dateStr = selectedDate.format(DateTimeFormatter.ISO_LOCAL_DATE)
            items.filter { cn.hutool.core.date.DateUtil.format(java.util.Date(it.updateTime), "yyyy-MM-dd") == dateStr }
        } else {
            // Default lookback of 5 days
            val limitTime5 = System.currentTimeMillis() - 5L * 24 * 60 * 60 * 1000
            items.filter { it.updateTime >= limitTime5 }
        }

        filteredItems.sortedWith(
            compareByDescending<ChapterUpdateItem> { it.updateTime }
                .thenBy { it.book.name }
                .thenByDescending { it.chapter.index }
        ).toImmutableList()
    }
    .flowOn(Dispatchers.IO)
    .stateIn(
        viewModelScope,
        SharingStarted.WhileSubscribed(5000),
        emptyList<ChapterUpdateItem>().toImmutableList()
    )

    fun openChapter(context: Context, bookShelfItem: BookShelfItem, chapterIndex: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            val book = appDb.bookDao.getBook(bookShelfItem.bookUrl) ?: return@launch
            val chapterTitle = appDb.bookChapterDao.getChapterTitleByUrlAndIndex(book.bookUrl, chapterIndex)

            book.durChapterIndex = chapterIndex
            book.durChapterPos = 0
            if (chapterTitle != null) {
                book.durChapterTitle = chapterTitle
            }
            book.lastCheckCount = 0

            appDb.bookDao.update(book)

            withContext(Dispatchers.Main) {
                context.startActivityForBook(book)
            }
        }
    }

    fun downloadChapter(context: Context, bookShelfItem: BookShelfItem, chapterIndex: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            val book = appDb.bookDao.getBook(bookShelfItem.bookUrl) ?: return@launch
            CacheBook.start(context, book, chapterIndex, chapterIndex)
            withContext(Dispatchers.Main) {
                context.toastOnUi(io.legado.app.R.string.start_downloading_chapter)
            }
        }
    }
}
