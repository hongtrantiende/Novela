package io.legado.app.ui.config.ai.scandict

import androidx.compose.runtime.Stable
import io.legado.app.domain.model.AiPromptTemplate
import io.legado.app.domain.model.TranslationConstants

@Stable
sealed interface AiScanDictConfigDialog {
    @Stable
    data class EditPrompt(val currentPrompt: String) : AiScanDictConfigDialog
}

@Stable
data class AiScanDictConfigUiState(
    val loading: Boolean = true,
    val promptTemplate: String = AiPromptTemplate.DEFAULT_SCAN_DICT,
    val temperature: Float = 0.1f,
    val maxOutputTokens: Int = 4096,
    val defaultPrompt: String = AiPromptTemplate.DEFAULT_SCAN_DICT,
    val initialized: Boolean = false,
    val activeDialog: AiScanDictConfigDialog? = null
)

sealed interface AiScanDictConfigIntent {
    data class UpdatePrompt(val prompt: String) : AiScanDictConfigIntent
    data class OpenPromptDialog(val currentPrompt: String) : AiScanDictConfigIntent
    data class UpdateDialogPrompt(val prompt: String) : AiScanDictConfigIntent
    data object CloseDialog : AiScanDictConfigIntent
    data class UpdateTemperature(val temperature: Float) : AiScanDictConfigIntent
    data class UpdateMaxOutputTokens(val tokens: Int) : AiScanDictConfigIntent
    data object ResetPrompt : AiScanDictConfigIntent
    data object Save : AiScanDictConfigIntent
}

sealed interface AiScanDictConfigEffect {
    data class ShowMessage(val message: String) : AiScanDictConfigEffect
    data object NavigateBack : AiScanDictConfigEffect
}
