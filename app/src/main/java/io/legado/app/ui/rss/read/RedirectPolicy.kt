package io.legado.app.ui.rss.read

enum class RedirectPolicy {
    ALLOW_ALL,
    ASK_ALWAYS,
    ASK_CROSS_ORIGIN,
    BLOCK_CROSS_ORIGIN,
    BLOCK_ALL,
    ASK_SAME_DOMAIN_BLOCK_CROSS;

    companion object {
        fun fromString(value: String?): RedirectPolicy {
            return entries.find { it.name.equals(value, ignoreCase = true) } ?: ALLOW_ALL
        }
    }
}

fun RedirectPolicy.title(): String {
    return when (this) {
        RedirectPolicy.ALLOW_ALL -> "Cho phép tất cả các bước nhảy"
        RedirectPolicy.ASK_ALWAYS -> "luôn hỏi"
        RedirectPolicy.ASK_CROSS_ORIGIN -> "Truy vấn tên miền chéo"
        RedirectPolicy.ASK_SAME_DOMAIN_BLOCK_CROSS -> "Truy vấn cùng tên miền, chặn tên miền chéo"
        RedirectPolicy.BLOCK_CROSS_ORIGIN -> "Chặn tên miền chéo"
        RedirectPolicy.BLOCK_ALL -> "chặn tất cả"
    }
}
