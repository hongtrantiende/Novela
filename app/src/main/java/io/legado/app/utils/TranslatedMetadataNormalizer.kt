package io.legado.app.utils

internal fun normalizeTranslatedMetadata(text: String): String {
    return text
        .trim()
        .replace(Regex("""(?:\\r\\n|\\n|\\r|[\r\n])+"""), " ")
        .replace(Regex("""[ \t]{2,}"""), " ")
        .trim()
}
