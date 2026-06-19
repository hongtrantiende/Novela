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
        "未读" -> "Chưa đọc"
        "在读" -> "Đang đọc"
        "小说" -> "Tiểu thuyết"
        "全部" -> "Tất cả"
        "网络未分组" -> "Chưa phân loại mạng"
        "本地未分组" -> "Chưa phân loại cục bộ"
        "音频" -> "Âm thanh"
        else -> groupName
    },
    cover = cover,
    order = order,
    enableRefresh = enableRefresh,
    show = show,
    bookSort = bookSort,
    isPrivate = isPrivate
)
