package io.legado.app.domain.model

object TranslationConstants {

    const val PROVIDER_OPENAI = "openai"
    const val PROVIDER_GOOGLE = "google"
    const val PROVIDER_APP_AI = "app_ai"
    const val PROVIDER_VIETPHRASE = "vietphrase"
    const val PROVIDER_SANGTACVIET = "sangtacviet"
    const val PROVIDER_HACHIMI_MT = "hachimi_mt"
    const val MIN_TEMPERATURE = 0f
    const val MAX_TEMPERATURE = 2f
    const val DEFAULT_TEMPERATURE = 1.3f

    /**
     * Registry of available ONNX translation models (zh → vi).
     * Each model is a MarianMT encoder-decoder, packaged as ONNX INT8.
     */
    data class OnnxModelInfo(
        val id: String,
        val displayName: String,
        val description: String,
        val downloadUrl: String,
        val zipFilename: String,
        val sizeDescription: String,
        val isLocalImport: Boolean = false,
    )

    const val DEFAULT_ONNX_MODEL_ID = "hachimi-mt60"

    val AVAILABLE_ONNX_MODELS = listOf(
        OnnxModelInfo(
            id = "hachimi-mt60",
            displayName = "HachimiMT-60",
            description = "Dịch truyện convert cơ bản, nhẹ và nhanh",
            downloadUrl = "https://raw.githubusercontent.com/hongtrantiende/Novela/main/legado-hachimi-onnx-arm64-20260721.zip",
            zipFilename = "legado-hachimi-onnx-arm64-20260721.zip",
            sizeDescription = "~70MB",
        ),
    )

    /** Backward compat — resolve current model zip filename */
    val HACHIMI_MODEL_ZIP_FILENAME: String
        get() = AVAILABLE_ONNX_MODELS.first().zipFilename
    val HACHIMI_MODEL_DOWNLOAD_URL: String
        get() = AVAILABLE_ONNX_MODELS.first().downloadUrl

    val providerDisplayNames = listOf("Dịch API Sáng Tác Việt", "Từ điển VietPhrase", "Dịch AI Offline HachimiMT (ONNX)", "Nhà cung cấp dịch AI")
    val providerValues = listOf(PROVIDER_SANGTACVIET, PROVIDER_VIETPHRASE, PROVIDER_HACHIMI_MT, PROVIDER_APP_AI)

    val targetLanguages = listOf(
        "vi" to "Tiếng Việt",
        "zh" to "Tiếng Trung giản thể",
        "en" to "English",
        "ja" to "tiếng Nhật",
        "ko" to "한국어",
        "fr" to "Français",
        "de" to "Deutsch",
        "es" to "Español",
        "ru" to "Русский",
        "ar" to "العربية"
    )

    const val DEFAULT_PROMPT =
        """You are a professional literary translator, please translate according to the following requirements:

1. Keep the original paragraph count and order unchanged
2. Maintain the literary style and tone of the original text
3. Do not summarize, condense, or omit any content
4. Only output the translation result, do not add comments or explanations
5. Keep name consistency across abbreviations/nicknames (e.g., Alexander → Alex → same name). Add nickname mapping to dictionary.

"""

    const val OUTPUT_FORMAT = """Output is divided into two parts:

**New** proper nouns, place names that need to be recorded for context, and the translation result.

Only select the most common and important terms (max 10) to include in the dictionary.

Output format as follows, IMPORTANT, **dictionary** part must begin with english word **[dictionary]**, MUST NOT start with any other words. **result** part must begin with english word **[result]**,  MUST NOT start with any other words:
<example>
[dictionary]
Jack -> 杰克
Harry Port -> 哈利波特

[result]
...
</example>
    """
}
