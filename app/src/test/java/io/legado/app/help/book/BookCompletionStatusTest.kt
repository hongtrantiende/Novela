package io.legado.app.help.book

import io.legado.app.constant.BookType
import io.legado.app.data.entities.Book
import io.legado.app.data.entities.SearchBook
import io.legado.app.help.book.updateTo
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class BookCompletionStatusTest {

    @Test
    fun testExtensionStatusCompleted() {
        assertEquals(
            BookCompletionStatus.COMPLETED,
            resolveExtensionCompletionStatus("completed", null, null)
        )
    }

    @Test
    fun testExtensionBookStatusOngoing() {
        assertEquals(
            BookCompletionStatus.ONGOING,
            resolveExtensionCompletionStatus("ongoing", null, null)
        )
    }

    @Test
    fun testExtensionIsCompletedTrue() {
        assertEquals(
            BookCompletionStatus.COMPLETED,
            resolveExtensionCompletionStatus(null, true, null)
        )
    }

    @Test
    fun testExtensionCompletedFalseOverridesKind() {
        assertEquals(
            BookCompletionStatus.ONGOING,
            resolveExtensionCompletionStatus(null, false, "完结")
        )
    }

    @Test
    fun testExtensionKindFallbackCompleted() {
        assertEquals(
            BookCompletionStatus.COMPLETED,
            resolveExtensionCompletionStatus(null, null, "完结")
        )
    }

    @Test
    fun testExtensionNoSignalsIsUnknown() {
        assertEquals(
            BookCompletionStatus.UNKNOWN,
            resolveExtensionCompletionStatus(null, null, null)
        )
    }

    @Test
    fun testFullMoonIsUnknown() {
        assertEquals(
            BookCompletionStatus.UNKNOWN,
            resolveBookCompletionStatus(null, "full moon")
        )
    }

    @Test
    fun testMultiWordTagNotIncorrectlySplit() {
        assertEquals(
            BookCompletionStatus.COMPLETED,
            resolveBookCompletionStatus(null, "Tiên hiệp, Hoàn thành, Huyền huyễn")
        )
    }

    @Test
    fun testChuaHoanThanhIsOngoing() {
        assertEquals(
            BookCompletionStatus.ONGOING,
            resolveBookCompletionStatus(null, "chưa hoàn thành")
        )
    }

    @Test
    fun testFullColorIsUnknown() {
        assertEquals(
            BookCompletionStatus.UNKNOWN,
            resolveBookCompletionStatus(null, "Full Color")
        )
    }

    @Test
    fun testBookUpdateToPreservesCompletedWhenNewIsUnknown() {
        val oldBook = Book().apply {
            type = BookType.text.withCompletionStatus(BookCompletionStatus.COMPLETED)
        }
        val newBook = Book().apply {
            type = BookType.text
        }
        oldBook.updateTo(newBook)
        assertEquals(BookCompletionStatus.COMPLETED, newBook.type.getCompletionStatus())
    }

    @Test
    fun testBookUpdateToClearsCompletedWhenNewIsOngoing() {
        val oldBook = Book().apply {
            type = BookType.text.withCompletionStatus(BookCompletionStatus.COMPLETED)
        }
        val newBook = Book().apply {
            type = BookType.text.withCompletionStatus(BookCompletionStatus.ONGOING)
        }
        oldBook.updateTo(newBook)
        assertEquals(BookCompletionStatus.ONGOING, newBook.type.getCompletionStatus())
    }

    @Test
    fun testSameBookTypeLocalWithCompletionStatus() {
        val searchBookTextCompleted = SearchBook(
            type = BookType.text.withCompletionStatus(BookCompletionStatus.COMPLETED)
        )
        val searchBookAudioCompleted = SearchBook(
            type = BookType.audio.withCompletionStatus(BookCompletionStatus.COMPLETED)
        )

        assertTrue(searchBookTextCompleted.sameBookTypeLocal(BookType.text))
        assertTrue(searchBookAudioCompleted.sameBookTypeLocal(BookType.audio))
        assertFalse(searchBookTextCompleted.sameBookTypeLocal(BookType.audio))
    }
}
