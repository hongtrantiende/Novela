package io.legado.app.ui.config.translation.ai

import androidx.compose.runtime.Stable
import io.legado.app.domain.model.TranslationConstants

@Stable
sealed interface TranslationAiConfigDialog {
    @Stable
    data class EditPrompt(val currentPrompt: String) : TranslationAiConfigDialog
}

@Stable
data class TranslationAiConfigUiState(
    val loading: Boolean = true,
    val promptTemplate: String = TranslationConstants.DEFAULT_PROMPT,
    val temperature: Float = TranslationConstants.DEFAULT_TEMPERATURE,
    val maxOutputTokens: Int = 0,
    val defaultPrompt: String = TranslationConstants.DEFAULT_PROMPT,
    val initialized: Boolean = false,
    val activeDialog: TranslationAiConfigDialog? = null
)

sealed interface TranslationAiConfigIntent {
    data class UpdatePrompt(val prompt: String) : TranslationAiConfigIntent
    data class OpenPromptDialog(val currentPrompt: String) : TranslationAiConfigIntent
    data class UpdateDialogPrompt(val prompt: String) : TranslationAiConfigIntent
    data object CloseDialog : TranslationAiConfigIntent
    data class UpdateTemperature(val temperature: Float) : TranslationAiConfigIntent
    data class UpdateMaxOutputTokens(val tokens: Int) : TranslationAiConfigIntent
    data object ResetPrompt : TranslationAiConfigIntent
    data object Save : TranslationAiConfigIntent
}

sealed interface TranslationAiConfigEffect {
    data class ShowMessage(val message: String) : TranslationAiConfigEffect
    data object NavigateBack : TranslationAiConfigEffect
}
