package io.legado.app.ui.main.bookshelf

import androidx.compose.runtime.Stable
import io.legado.app.data.entities.BookGroup

@Stable
data class BookGroupUi(
    val groupId: Long,
    val groupName: String,
    val cover: String?,
    val order: Int,
    val enableRefresh: Boolean,
    val show: Boolean,
    val bookSort: Int,
    val isPrivate: Boolean
)

fun BookGroup.toBookGroupUi() = BookGroupUi(
    groupId = groupId,
    groupName = when (groupName) {
        "chưa đọc" -> "Chưa đọc"
        "Đọc" -> "Đang đọc"
        "cuốn tiểu thuyết" -> "Tiểu thuyết"
        "tất cả" -> "Tất cả"
        "Mạng không được nhóm" -> "Chưa phân loại mạng"
        "Đã tách nhóm cục bộ" -> "Chưa phân loại cục bộ"
        "Âm thanh" -> "Âm thanh"
        else -> groupName
    },
    cover = cover,
    order = order,
    enableRefresh = enableRefresh,
    show = show,
    bookSort = bookSort,
    isPrivate = isPrivate
)
