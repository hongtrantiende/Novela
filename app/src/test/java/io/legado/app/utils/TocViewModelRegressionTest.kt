package io.legado.app.utils

import io.legado.app.data.entities.BookChapter
import org.junit.Assert.assertEquals
import org.junit.Test

class TocViewModelRegressionTest {

    @Test
    fun getDisplayTitle_translateFalse_returnsOriginalTitle() {
        val originalTitle = "Chương 1: Mở đầu"
        val chapter = BookChapter(
            url = "http://example.com/chapter1",
            title = originalTitle,
            index = 0
        )

        val displayTitleNoTranslate = chapter.getDisplayTitle(
            replaceRules = null,
            useReplace = false,
            chineseConvert = false,
            translate = false
        )
        // With translate = false, it should return the title without running runBlocking
        assertEquals(originalTitle, displayTitleNoTranslate)
    }
}