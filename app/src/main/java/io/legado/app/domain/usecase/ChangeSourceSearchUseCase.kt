package io.legado.app.domain.usecase

import io.legado.app.data.entities.Book
import io.legado.app.data.entities.BookChapter
import io.legado.app.data.entities.BookSource
import io.legado.app.data.entities.BookSourcePart
import io.legado.app.data.entities.SearchBook
import io.legado.app.domain.gateway.BookSearchGateway
import io.legado.app.help.book.BookHelp
import io.legado.app.help.book.ContentProcessor
import io.legado.app.help.book.primaryStr
import io.legado.app.help.book.releaseHtmlData
import io.legado.app.ui.book.changesource.ChangeSourceConfig
import io.legado.app.help.source.SourceHelp
import io.legado.app.model.webBook.WebBook
import io.legado.app.ui.book.changesource.ObservableSourceConfig
import io.legado.app.ui.config.otherConfig.OtherConfig
import io.legado.app.utils.internString
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.ensureActive
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flatMapMerge
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.mapNotNull
import kotlinx.coroutines.withTimeout
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicInteger

sealed interface ChangeSourceSearchEvent {
    data class Started(val totalSources: Int) : ChangeSourceSearchEvent
    data class Progress(
        val processedSources: Int,
        val totalSources: Int,
        val resultCount: Int,
        val sourceName: String,
    ) : ChangeSourceSearchEvent

    data class Result(val searchBook: SearchBook) : ChangeSourceSearchEvent
    data class Finished(val isEmpty: Boolean) : ChangeSourceSearchEvent
}

class ChangeSourceSearchUseCase(
    private val gateway: BookSearchGateway,
    private val extensionRepository: io.legado.app.vbookextension.data.repository.ExtensionRepository,
) {
    private val threadCount = OtherConfig.threadCount

    // Shared state for TOC cache
    private val tocMap = ConcurrentHashMap<String, List<BookChapter>>()
    private val bookMap = ConcurrentHashMap<String, Book>()
    private val tocMapChapterCount = AtomicInteger(0)

    private data class ChangeSourceSearchable(
        val part: BookSourcePart,
        val source: BookSource?,
    )

    private data class ChangeSourceResult(
        val part: BookSourcePart,
        val source: BookSource?,
        val books: List<SearchBook>,
    )

    @OptIn(ExperimentalCoroutinesApi::class)
    fun search(
        name: String,
        author: String,
        scope: io.legado.app.ui.book.search.SearchScope,
        oldBook: Book,
        fromReadBookActivity: Boolean,
    ): Flow<ChangeSourceSearchEvent> = flow {
        val contentProcessor = ContentProcessor.get(oldBook)
        val bookSourceParts = scope.getBookSourceParts()
        if (bookSourceParts.isEmpty()) {
            throw io.legado.app.exception.NoStackTraceException("Bật nguồn sách trống")
        }

        tocMap.clear()
        bookMap.clear()
        tocMapChapterCount.set(0)

        val totalSources = bookSourceParts.size
        emit(ChangeSourceSearchEvent.Started(totalSources))

        var processedSources = 0
        var resultCount = 0
        val concurrency = threadCount.coerceAtLeast(1)

        bookSourceParts.asFlow()
            .mapNotNull { part ->
                val isExt = part.bookSourceUrl.startsWith("ext_")
                if (isExt) {
                    ChangeSourceSearchable(part, null)
                } else {
                    val source = part.getBookSource() ?: return@mapNotNull null
                    ChangeSourceSearchable(part, source)
                }
            }
            .flatMapMerge(concurrency) { searchable ->
                flow {
                    val books = try {
                        withTimeout(60000L) {
                            searchSource(
                                searchable, name, author, oldBook, fromReadBookActivity,
                                contentProcessor
                            )
                        }
                    } catch (_: Throwable) {
                        currentCoroutineContext().ensureActive()
                        emptyList()
                    }
                    emit(ChangeSourceResult(searchable.part, searchable.source, books))
                }.flowOn(Dispatchers.IO)
            }
            .collect { result ->
                currentCoroutineContext().ensureActive()
                result.books.forEach { searchBook ->
                    resultCount++
                    emit(ChangeSourceSearchEvent.Result(searchBook))
                }
                processedSources++
                emit(
                    ChangeSourceSearchEvent.Progress(
                        processedSources = processedSources,
                        totalSources = totalSources,
                        resultCount = resultCount,
                        sourceName = result.part.bookSourceName,
                    )
                )
            }

        emit(ChangeSourceSearchEvent.Finished(isEmpty = resultCount == 0))
    }.flowOn(Dispatchers.IO)

    private suspend fun searchSource(
        searchable: ChangeSourceSearchable,
        name: String,
        author: String,
        oldBook: Book,
        fromReadBookActivity: Boolean,
        contentProcessor: ContentProcessor,
    ): List<SearchBook> {
        val checkAuthor = ChangeSourceConfig.checkAuthor
        val loadInfo = ChangeSourceConfig.loadInfo
        val loadToc = ChangeSourceConfig.loadToc
        val loadWordCount = ChangeSourceConfig.loadWordCount

        val isExt = searchable.part.bookSourceUrl.startsWith("ext_")
        val searchKeyword = io.legado.app.utils.TranslateUtils.translateMeta(name)
        val keywords = if (searchKeyword != name) listOf(name, searchKeyword) else listOf(name)
        val allResults = mutableListOf<SearchBook>()

        if (isExt) {
            for (kw in keywords) {
                try {
                    allResults.addAll(extensionRepository.searchBooks(searchable.part.bookSourceUrl, kw, 1))
                } catch (_: Throwable) {}
            }
        } else {
            val source = searchable.source!!
            for (kw in keywords) {
                try {
                    allResults.addAll(WebBook.searchBookAwait(source, kw))
                } catch (_: Throwable) {}
            }
        }

        val resultBooks = allResults.distinctBy { it.bookUrl }.filter {
            val normExtBookName = io.legado.app.utils.TranslateUtils.translateMeta(it.name)
                .lowercase().replace(Regex("[\\p{Punct}\\s]"), "")
            val normTargetName = io.legado.app.utils.TranslateUtils.translateMeta(name)
                .lowercase().replace(Regex("[\\p{Punct}\\s]"), "")

            val normExtAuthor = io.legado.app.utils.TranslateUtils.translateMeta(it.author)
                .lowercase().replace(Regex("[\\p{Punct}\\s]"), "")
            val normTargetAuthor = io.legado.app.utils.TranslateUtils.translateMeta(author)
                .lowercase().replace(Regex("[\\p{Punct}\\s]"), "")

            normExtBookName == normTargetName && (!checkAuthor || normExtAuthor.contains(normTargetAuthor) || normTargetAuthor.contains(normExtAuthor))
        }

        val processedBooks = mutableListOf<SearchBook>()
        for (searchBook in resultBooks) {
            currentCoroutineContext().ensureActive()
            when {
                loadInfo || loadToc || loadWordCount -> {
                    val book = searchBook.toBook()
                    val wordCountSearchBook = loadBookInfo(
                        searchable,
                        book,
                        loadToc,
                        loadWordCount,
                        oldBook,
                        fromReadBookActivity,
                        contentProcessor
                    )
                    processedBooks.add(wordCountSearchBook ?: book.toSearchBook())
                }

                else -> {
                    processedBooks.add(searchBook)
                }
            }
        }
        return processedBooks
    }

    private suspend fun loadBookInfo(
        searchable: ChangeSourceSearchable,
        book: Book,
        loadToc: Boolean,
        loadWordCount: Boolean,
        oldBook: Book,
        fromReadBookActivity: Boolean,
        contentProcessor: ContentProcessor,
    ): SearchBook? {
        val isExt = searchable.part.bookSourceUrl.startsWith("ext_")
        if (book.tocUrl.isEmpty()) {
            if (isExt) {
                val detail = extensionRepository.getBookDetail(searchable.part.bookSourceUrl, book.bookUrl)
                if (detail != null) {
                    book.tocUrl = detail.tocUrl
                    book.intro = detail.intro
                    book.coverUrl = detail.coverUrl
                }
            } else {
                WebBook.getBookInfoAwait(searchable.source!!, book)
            }
        }
        if (loadToc || loadWordCount) {
            return loadBookToc(
                searchable,
                book,
                loadWordCount,
                oldBook,
                fromReadBookActivity,
                contentProcessor
            )
        }
        return null
    }

    private suspend fun loadBookToc(
        searchable: ChangeSourceSearchable,
        book: Book,
        loadWordCount: Boolean,
        oldBook: Book,
        fromReadBookActivity: Boolean,
        contentProcessor: ContentProcessor,
    ): SearchBook? {
        val isExt = searchable.part.bookSourceUrl.startsWith("ext_")
        val chapters = if (isExt) {
            extensionRepository.getTableOfContents(searchable.part.bookSourceUrl, book.bookUrl)
        } else {
            WebBook.getChapterListAwait(searchable.source!!, book).getOrThrow()
        }
        for (chapter in chapters) {
            chapter.internString()
        }
        if (tocMapChapterCount.get() < 30000) {
            tocMapChapterCount.addAndGet(chapters.size)
            tocMap[book.primaryStr()] = chapters
        }
        bookMap[book.primaryStr()] = book
        book.releaseHtmlData()
        if (loadWordCount) {
            return loadBookWordCount(
                searchable,
                book,
                chapters,
                oldBook,
                fromReadBookActivity,
                contentProcessor
            )
        }
        return book.toSearchBook().apply {
            chapterWordCountText = "Tổng số chương: ${chapters.size}"
        }
    }

    private suspend fun loadBookWordCount(
        searchable: ChangeSourceSearchable,
        book: Book,
        chapters: List<BookChapter>,
        oldBook: Book,
        fromReadBookActivity: Boolean,
        contentProcessor: ContentProcessor,
    ): SearchBook? {
        if (chapters.isEmpty()) return null
        val chapterIndex = if (fromReadBookActivity) {
            BookHelp.getDurChapter(oldBook, chapters)
        } else {
            chapters.lastIndex
        }
        if (chapterIndex !in chapters.indices) return null
        val bookChapter = chapters[chapterIndex]
        var title = bookChapter.title.trim()
        if (title.length > 20) {
            title = title.substring(0, 20) + "…"
        }
        val startTime = System.currentTimeMillis()
        val isExt = searchable.part.bookSourceUrl.startsWith("ext_")
        return try {
            var content = if (isExt) {
                extensionRepository.getChapterContent(searchable.part.bookSourceUrl, bookChapter.url)
                    ?: throw io.legado.app.exception.NoStackTraceException("Nội dung chương trống")
            } else {
                val nextChapterUrl = chapters.getOrNull(chapterIndex + 1)?.url
                WebBook.getContentAwait(searchable.source!!, book, bookChapter, nextChapterUrl, false)
            }
            content = contentProcessor.getContent(oldBook, bookChapter, content, false).toString()
            val len = content.length
            val endTime = System.currentTimeMillis()
            book.toSearchBook().apply {
                chapterWordCountText = "[${chapterIndex + 1}] ${title}\nSố từ: ${len}"
                chapterWordCount = len
                respondTime = (endTime - startTime).toInt()
            }
        } catch (t: Throwable) {
            if (t is CancellationException) throw t
            val endTime = System.currentTimeMillis()
            book.toSearchBook().apply {
                chapterWordCountText =
                    "[${chapterIndex + 1}] ${title}\nKhông đếm được số từ: ${t.localizedMessage}"
                chapterWordCount = -1
                respondTime = (endTime - startTime).toInt()
            }
        }
    }

    // Source management
    fun topSource(searchBook: SearchBook) {
        ObservableSourceConfig.setBookScore(searchBook, 1)
    }

    fun bottomSource(searchBook: SearchBook) {
        ObservableSourceConfig.setBookScore(searchBook, 0)
    }

    fun disableSource(searchBook: SearchBook) {
        if (searchBook.origin.startsWith("ext_")) {
            val extId = searchBook.origin.removePrefix("ext_")
            kotlinx.coroutines.runBlocking {
                io.legado.app.data.appDb.extensionDao.setEnabled(extId, false)
            }
        } else {
            io.legado.app.data.appDb.bookSourceDao.getBookSource(searchBook.origin)?.let { source ->
                source.enabled = false
                io.legado.app.data.appDb.bookSourceDao.update(source)
            }
        }
    }

    fun deleteSource(searchBook: SearchBook) {
        if (searchBook.origin.startsWith("ext_")) {
            val extId = searchBook.origin.removePrefix("ext_")
            kotlinx.coroutines.runBlocking {
                io.legado.app.data.appDb.extensionDao.getExtensionById(extId)?.let { ext ->
                    io.legado.app.data.appDb.extensionDao.delete(ext)
                }
            }
        } else {
            SourceHelp.deleteBookSource(searchBook.origin)
        }
        io.legado.app.data.appDb.searchBookDao.delete(searchBook)
    }
}
