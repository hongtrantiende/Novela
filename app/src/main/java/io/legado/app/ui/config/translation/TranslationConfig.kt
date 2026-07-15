package io.legado.app.ui.config.translation

import io.legado.app.constant.PreferKey
import io.legado.app.domain.model.TranslationConstants
import io.legado.app.ui.config.prefDelegate

object TranslationConfig {

    var isGlobalTranslateEnabled by prefDelegate(
        PreferKey.globalTranslateEnabled,
        false
    )

    var llmTranslateEnabled by prefDelegate(
        PreferKey.llmTranslateEnabled,
        false
    )

    var llmProvider by prefDelegate(
        PreferKey.llmProvider,
        "google"
    )

    var llmBaseUrl by prefDelegate(
        PreferKey.llmBaseUrl,
        ""
    )

    var llmApiKey by prefDelegate(
        PreferKey.llmApiKey,
        ""
    )

    var llmModel by prefDelegate(
        PreferKey.llmModel,
        ""
    )

    var llmTargetLanguage by prefDelegate(
        PreferKey.llmTargetLanguage,
        "zh"
    )

    var llmMaxCharsPerChunk by prefDelegate(
        PreferKey.llmMaxCharsPerChunk,
        10000
    )

    var llmConcurrentChunks by prefDelegate(
        PreferKey.llmConcurrentChunks,
        1
    )

    var llmRetryCount by prefDelegate(
        PreferKey.llmRetryCount,
        2
    )

    var llmScanAdvanced by prefDelegate(
        "llmScanAdvanced",
        false
    )

    private var storedLlmTemperature by prefDelegate(
        PreferKey.llmTemperature,
        TranslationConstants.DEFAULT_TEMPERATURE
    )

    var llmTemperature: Float
        get() = storedLlmTemperature.coerceIn(MIN_TEMPERATURE, MAX_TEMPERATURE)
        set(value) {
            storedLlmTemperature = value.coerceIn(MIN_TEMPERATURE, MAX_TEMPERATURE)
        }

    var llmPrompt by prefDelegate(
        PreferKey.llmPrompt,
        TranslationConstants.DEFAULT_PROMPT
    )

    var translationEnabled by prefDelegate(
        "translationEnabled",
        false
    )

    var translationTarget by prefDelegate(
        "translationTarget",
        "Việt (VP)"
    )

    var translationEngine by prefDelegate(
        "translationEngine",
        "VP"
    )

    var translationScope by prefDelegate(
        "translationScope",
        "Tất cả"
    )

    fun applySettings(enabled: Boolean, target: String, engine: String, scope: String) {
        translationEnabled = enabled
        translationTarget = target
        translationEngine = engine
        translationScope = scope
        
        if (enabled) {
            when (engine) {
                "STV" -> {
                    isGlobalTranslateEnabled = false
                    llmTranslateEnabled = true
                    llmProvider = PROVIDER_SANGTACVIET
                }
                "VP" -> {
                    isGlobalTranslateEnabled = false
                    llmTranslateEnabled = true
                    llmProvider = PROVIDER_VIETPHRASE
                }
                "AI" -> {
                    isGlobalTranslateEnabled = false
                    llmTranslateEnabled = true
                    llmProvider = PROVIDER_APP_AI
                }
                else -> {
                    isGlobalTranslateEnabled = true
                    llmTranslateEnabled = false
                }
            }
        } else {
            isGlobalTranslateEnabled = false
            llmTranslateEnabled = false
        }
        
        io.legado.app.utils.TranslateUtils.clearCache()
    }

    // Delegate constants to domain layer
    const val PROVIDER_OPENAI = TranslationConstants.PROVIDER_OPENAI
    const val PROVIDER_APP_AI = TranslationConstants.PROVIDER_APP_AI
    const val PROVIDER_GOOGLE = TranslationConstants.PROVIDER_GOOGLE
    const val PROVIDER_SANGTACVIET = TranslationConstants.PROVIDER_SANGTACVIET
    const val PROVIDER_VIETPHRASE = TranslationConstants.PROVIDER_VIETPHRASE
    val providerDisplayNames get() = TranslationConstants.providerDisplayNames
    val providerValues get() = TranslationConstants.providerValues
    val targetLanguages get() = TranslationConstants.targetLanguages
    const val MIN_TEMPERATURE = TranslationConstants.MIN_TEMPERATURE
    const val MAX_TEMPERATURE = TranslationConstants.MAX_TEMPERATURE
    const val DEFAULT_TEMPERATURE = TranslationConstants.DEFAULT_TEMPERATURE
    const val DEFAULT_PROMPT = TranslationConstants.DEFAULT_PROMPT
    const val OUTPUT_FORMAT = TranslationConstants.OUTPUT_FORMAT
}
