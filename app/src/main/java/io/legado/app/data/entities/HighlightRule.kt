package io.legado.app.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "highlightRules")
data class HighlightRule(
    @PrimaryKey
    var id: String = UUID.randomUUID().toString(),
    var name: String = "",
    var pattern: String = "",
    var sampleText: String = "",
    var targetScope: Int = TARGET_ALL,
    var enabled: Boolean = true,
    var position: Int = 0,
    var textColor: Int? = null,
    var bgColor: Int? = null,
    var underlineMode: Int = 0,
    var underlineColor: Int? = null,
    var underlineWidth: Float = 1f,
    var underlineOffset: Float = 2f,
    var underlineSvgPath: String? = null,
    var bgImage: String? = null,
    var bgImageFit: Int = 0,
    var bgImageScale: Float = 1f,
    var configName: String? = null,
    var fontPath: String? = null,
) {

    fun styleSummary(): String {
        val parts = ArrayList<String>(4)
        parts.add(targetScopeLabel())
        textColor?.let {
            parts.add("Màu từ ${it.toHexColor()}")
        }
        bgColor?.let {
            parts.add("Màu nền ${it.toHexColor()}")
        }
        if (underlineMode != 0) {
            parts.add(
                when (underlineMode) {
                    1 -> "gạch chân liền nét"
                    2 -> "gạch chân nét đứt"
                    3 -> "gạch chân lượn sóng"
                    4 -> "gạch chân kép"
                    5 -> "SVG tùy chỉnh"
                    else -> "gạch chân"
                } + underlineColor?.let { " ${it.toHexColor()}" }.orEmpty()
            )
        }
        if (!bgImage.isNullOrBlank()) {
            parts.add(
                when (bgImageFit) {
                    1 -> "Hình nền (kéo dài)"
                    2 -> "Hình nền (đã cắt)"
                    else -> "Hình nền (lát gạch)"
                }
            )
        }
        if (!fontPath.isNullOrBlank()) {
            parts.add("Phông chữ tùy chỉnh")
        }
        if (parts.isEmpty()) {
            parts.add("Không có phong cách")
        }
        return parts.joinToString(" / ")
    }

    fun targetScopeLabel(): String {
        return when (targetScope) {
            TARGET_TITLE -> "Hành động theo tiêu đề"
            TARGET_BODY -> "Hành động trên văn bản"
            else -> "Áp dụng cho tất cả"
        }
    }

    fun displayPattern(): String {
        return pattern.ifBlank { ".*" }
    }

    fun normalizedSampleText(): String {
        return sampleText.ifBlank {
            "Cô nhẹ nhàng nói: “Tối nay chúng ta xuất phát nhé.”\nGần đây tôi đọc lại Trăm Năm Cô Đơn (bản kỷ niệm), nhịp độ vẫn rất đều đặn."
        }
    }

    fun copyWithNewId(): HighlightRule {
        return copy(id = UUID.randomUUID().toString())
    }

    companion object {
        const val TARGET_ALL = 0
        const val TARGET_TITLE = 1
        const val TARGET_BODY = 2

        fun Int.toHexColor(): String = String.format("#%08X", this)
    }
}
