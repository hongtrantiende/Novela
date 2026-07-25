package io.legado.app.help.book

import io.legado.app.constant.BookType

enum class BookCompletionStatus {
    UNKNOWN,
    ONGOING,
    COMPLETED
}

fun Int.getCompletionStatus(): BookCompletionStatus {
    if (this and BookType.completionKnown == 0) {
        return BookCompletionStatus.UNKNOWN
    }
    return if (this and BookType.completed > 0) {
        BookCompletionStatus.COMPLETED
    } else {
        BookCompletionStatus.ONGOING
    }
}

fun Int.withCompletionStatus(status: BookCompletionStatus): Int {
    return when (status) {
        BookCompletionStatus.COMPLETED -> (this or BookType.completionKnown) or BookType.completed
        BookCompletionStatus.ONGOING -> (this or BookType.completionKnown) and BookType.completed.inv()
        BookCompletionStatus.UNKNOWN -> this
    }
}

fun resolveExtensionCompletionStatus(
    explicitStatus: String?,
    boolCompletedRaw: Any?,
    kind: String?
): BookCompletionStatus {
    val boolCompletedStatus = when (boolCompletedRaw) {
        is Boolean -> if (boolCompletedRaw) BookCompletionStatus.COMPLETED else BookCompletionStatus.ONGOING
        is Number -> if (boolCompletedRaw.toInt() == 1) BookCompletionStatus.COMPLETED else if (boolCompletedRaw.toInt() == 0) BookCompletionStatus.ONGOING else BookCompletionStatus.UNKNOWN
        is String -> {
            val str = boolCompletedRaw.lowercase().trim()
            if (str == "true" || str == "1") BookCompletionStatus.COMPLETED
            else if (str == "false" || str == "0") BookCompletionStatus.ONGOING
            else BookCompletionStatus.UNKNOWN
        }
        else -> BookCompletionStatus.UNKNOWN
    }

    val explicitStringStatus = resolveBookCompletionStatus(explicitStatus, null)
    return when {
        explicitStringStatus != BookCompletionStatus.UNKNOWN -> explicitStringStatus
        boolCompletedStatus != BookCompletionStatus.UNKNOWN -> boolCompletedStatus
        else -> resolveBookCompletionStatus(null, kind)
    }
}

fun resolveBookCompletionStatus(
    explicitStatus: String?,
    kind: String?
): BookCompletionStatus {
    val explicitClean = normalizeStatusString(explicitStatus)
    if (explicitClean.isNotEmpty()) {
        val status = matchSingleStatusTag(explicitClean)
        if (status != BookCompletionStatus.UNKNOWN) {
            return status
        }
    }

    if (!kind.isNullOrBlank()) {
        // Split kind ONLY by comma, semicolon, slash, pipe, or newline. DO NOT split by space!
        val tags = kind.split(',', ';', '/', '|', '\n')
            .map { normalizeStatusString(it) }
            .filter { it.isNotEmpty() }
        for (tag in tags) {
            val status = matchSingleStatusTag(tag)
            if (status != BookCompletionStatus.UNKNOWN) {
                return status
            }
        }
    }

    return BookCompletionStatus.UNKNOWN
}

private fun normalizeStatusString(input: String?): String {
    if (input.isNullOrBlank()) return ""
    return input.lowercase().trim()
}

private fun matchSingleStatusTag(tag: String): BookCompletionStatus {
    if (tag.isEmpty()) return BookCompletionStatus.UNKNOWN

    // 1. Check ONGOING / Negative phrases FIRST
    val ongoingExactOrPhrases = listOf(
        "chưa hoàn thành",
        "đang ra",
        "đang cập nhật",
        "ongoing",
        "serializing",
        "serial",
        "updating",
        "连载",
        "连载中"
    )

    if (tag in ongoingExactOrPhrases) return BookCompletionStatus.ONGOING
    for (phrase in ongoingExactOrPhrases) {
        if (tag.contains(phrase)) return BookCompletionStatus.ONGOING
    }

    // 2. Check COMPLETED phrases (exact match or Chinese/Vietnamese contains check)
    val chineseCompleted = listOf("完结", "已完结", "完本", "全本")
    for (cn in chineseCompleted) {
        if (tag.contains(cn)) return BookCompletionStatus.COMPLETED
    }

    val vnCompleted = listOf("hoàn thành", "đã hoàn thành", "trọn bộ", "đã full")
    for (vn in vnCompleted) {
        if (tag.contains(vn)) return BookCompletionStatus.COMPLETED
    }

    // English exact match (do not match "full color", "full hd", "fullmetal", "full moon")
    val enCompletedExact = setOf("completed", "complete", "finished", "finish", "ended", "full")
    if (tag in enCompletedExact) return BookCompletionStatus.COMPLETED

    return BookCompletionStatus.UNKNOWN
}
