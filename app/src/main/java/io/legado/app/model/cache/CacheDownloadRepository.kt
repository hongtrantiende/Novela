package io.legado.app.model.cache

import io.legado.app.data.appDb
import io.legado.app.data.entities.Book
import io.legado.app.data.entities.BookChapter
import io.legado.app.data.entities.BookSource
import io.legado.app.help.book.BookHelp
import io.legado.app.help.book.isImage
import io.legado.app.help.coroutine.Coroutine
import io.legado.app.model.webBook.WebBook
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.sync.Semaphore
import kotlin.coroutines.CoroutineContext

class CacheDownloadRepository {

    fun getChapter(bookUrl: String, index: Int): BookChapter? {
        return appDb.bookChapterDao.getChapter(bookUrl, index)
    }

    fun hasImageContent(book: Book, chapter: BookChapter): Boolean {
        return BookHelp.hasImageContent(book, chapter)
    }

    fun hasContent(book: Book, chapter: BookChapter): Boolean {
        return BookHelp.hasContent(book, chapter)
    }

    fun saveCachedImagesTask(
        scope: CoroutineScope,
        context: CoroutineContext,
        bookSource: BookSource,
        book: Book,
        chapter: BookChapter,
        start: CoroutineStart = CoroutineStart.LAZY,
    ): Coroutine<Unit> {
        return Coroutine.async(scope, context, start = start, executeContext = context) {
            BookHelp.getContent(book, chapter)?.let {
                BookHelp.saveImages(bookSource, book, chapter, it, 1)
            }
        }
    }

    fun downloadContentTask(
        scope: CoroutineScope,
        bookSource: BookSource,
        book: Book,
        chapter: BookChapter,
        context: CoroutineContext,
        start: CoroutineStart = CoroutineStart.LAZY,
        executeContext: CoroutineContext = context,
        semaphore: Semaphore? = null,
    ): Coroutine<String> {
        return WebBook.getContent(
            scope = scope,
            bookSource = bookSource,
            book = book,
            bookChapter = chapter,
            context = context,
            start = start,
            executeContext = executeContext,
            semaphore = semaphore,
        )
    }

    fun cacheContentTask(
        scope: CoroutineScope,
        bookSource: BookSource,
        book: Book,
        chapter: BookChapter,
        context: CoroutineContext,
        start: CoroutineStart = CoroutineStart.LAZY,
        executeContext: CoroutineContext = context,
    ): Coroutine<String> {
        return Coroutine.async(
            scope = scope,
            context = context,
            start = start,
            executeContext = executeContext,
        ) {
            val content = WebBook.getContentAwait(bookSource, book, chapter)
            if (book.isImage && content.isNotBlank()) {
                BookHelp.saveImages(bookSource, book, chapter, content, 1)
            }
            content
        }
    }

    suspend fun downloadContentAwait(
        bookSource: BookSource,
        book: Book,
        chapter: BookChapter,
    ): String {
        val content = WebBook.getContentAwait(bookSource, book, chapter)
        if (book.isImage && content.isNotBlank()) {
            BookHelp.saveImages(bookSource, book, chapter, content, 1)
        }
        return content
    }
}
