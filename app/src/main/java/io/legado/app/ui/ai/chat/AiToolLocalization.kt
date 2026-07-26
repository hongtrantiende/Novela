package io.legado.app.ui.ai.chat

import android.content.Context
import androidx.annotation.StringRes
import io.legado.app.R

@StringRes
internal fun aiToolDisplayNameRes(toolName: String): Int? {
    return when (toolName) {
        "search_books" -> R.string.ai_tool_search_books
        "get_book_detail" -> R.string.ai_tool_get_book_detail
        "list_book_chapters" -> R.string.ai_tool_list_book_chapters
        "get_chapter_content" -> R.string.ai_tool_get_chapter_content
        "search_bookmarks" -> R.string.ai_tool_search_bookmarks
        "get_reading_stats" -> R.string.ai_tool_get_reading_stats
        "get_ai_artifacts" -> R.string.ai_tool_get_ai_artifacts
        "save_ai_artifact" -> R.string.ai_tool_save_ai_artifact
        "save_memory" -> R.string.ai_tool_save_memory
        "recall_memory" -> R.string.ai_tool_recall_memory
        "delete_memory" -> R.string.ai_tool_delete_memory
        else -> null
    }
}

internal fun aiToolDisplayName(context: Context, toolName: String): String {
    return aiToolDisplayNameRes(toolName)?.let(context::getString) ?: toolName
}

internal fun localizeToolNames(context: Context, toolNames: String): String {
    return toolNames.split(',')
        .joinToString(", ") { aiToolDisplayName(context, it.trim()) }
}

internal fun localizeToolTrace(context: Context, trace: String): String {
    val toolPrefix = context.getString(R.string.ai_tool_label)
    val idPrefix = context.getString(R.string.ai_tool_id)
    val resultPrefix = context.getString(R.string.ai_tool_result)
    return trace.lineSequence().joinToString("\n") { line ->
        when {
            line.startsWith("Tool: ") -> {
                "$toolPrefix ${aiToolDisplayName(context, line.removePrefix("Tool: ").trim())}"
            }

            line.startsWith("ID: ") -> "$idPrefix ${line.removePrefix("ID: ")}"
            line.startsWith("Result: ") -> "$resultPrefix ${line.removePrefix("Result: ")}"
            else -> line
        }
    }
}
