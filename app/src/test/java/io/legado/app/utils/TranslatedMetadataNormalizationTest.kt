package io.legado.app.utils

import org.junit.Assert.assertEquals
import org.junit.Test

class TranslatedMetadataNormalizationTest {

    @Test
    fun `normalizes actual line breaks in translated metadata`() {
        assertEquals(
            "FQ nam nổi bật",
            normalizeTranslatedMetadata("  FQ nam\r\nnổi bật\n  ")
        )
    }

    @Test
    fun `normalizes escaped line break markers returned by translation service`() {
        assertEquals(
            "Thứ 1 trang",
            normalizeTranslatedMetadata("Thứ 1\\ntrang\\r\\n")
        )
    }

    @Test
    fun `keeps ordinary single line metadata unchanged`() {
        assertEquals(
            "Rảnh rỗi mấy phần",
            normalizeTranslatedMetadata("Rảnh rỗi mấy phần")
        )
    }
}
