package io.legado.app.ui.config.translation.ai

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.legado.app.R
import io.legado.app.domain.gateway.AiProfileGateway
import io.legado.app.domain.model.AiTaskType
import io.legado.app.domain.model.TranslationConstants
import io.legado.app.utils.toastOnUi
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import splitties.init.appCtx

class TranslationAiConfigViewModel(
    private val aiProfileGateway: AiProfileGateway
) : ViewModel() {

    private val _uiState = MutableStateFlow(TranslationAiConfigUiState())
    val uiState = _uiState.asStateFlow()

    private val _effects = MutableSharedFlow<TranslationAiConfigEffect>(extraBufferCapacity = 16)
    val effects = _effects.asSharedFlow()

    init {
        viewModelScope.launch {
            runCatching {
                val config = aiProfileGateway.getTaskPreset(AiTaskType.TRANSLATE_CHAPTER)
                _uiState.update { current ->
                    current.copy(
                        loading = false,
                        promptTemplate = config?.promptTemplate ?: TranslationConstants.DEFAULT_PROMPT,
                        temperature = config?.params?.temperature ?: TranslationConstants.DEFAULT_TEMPERATURE,
                        maxOutputTokens = config?.params?.maxOutputTokens ?: 0,
                        defaultPrompt = TranslationConstants.DEFAULT_PROMPT,
                        initialized = true
                    )
                }
            }.onFailure { error ->
                _uiState.update { current ->
                    current.copy(
                        loading = false,
                        promptTemplate = TranslationConstants.DEFAULT_PROMPT,
                        temperature = TranslationConstants.DEFAULT_TEMPERATURE,
                        maxOutputTokens = 0,
                        defaultPrompt = TranslationConstants.DEFAULT_PROMPT,
                        initialized = true
                    )
                }
                appCtx.toastOnUi("Tải cấu hình dịch AI thất bại: ${error.localizedMessage ?: "sử dụng mặc định"}")
            }
        }
    }

    fun onIntent(intent: TranslationAiConfigIntent) {
        when (intent) {
            is TranslationAiConfigIntent.UpdatePrompt -> {
                _uiState.update { it.copy(promptTemplate = intent.prompt, activeDialog = null) }
            }
            is TranslationAiConfigIntent.OpenPromptDialog -> {
                _uiState.update { it.copy(activeDialog = TranslationAiConfigDialog.EditPrompt(intent.currentPrompt)) }
            }
            is TranslationAiConfigIntent.UpdateDialogPrompt -> {
                val currentDialog = _uiState.value.activeDialog as? TranslationAiConfigDialog.EditPrompt
                if (currentDialog != null) {
                    _uiState.update { it.copy(activeDialog = currentDialog.copy(currentPrompt = intent.prompt)) }
                }
            }
            is TranslationAiConfigIntent.CloseDialog -> {
                _uiState.update { it.copy(activeDialog = null) }
            }
            is TranslationAiConfigIntent.UpdateTemperature -> {
                _uiState.update { it.copy(temperature = intent.temperature) }
            }
            is TranslationAiConfigIntent.UpdateMaxOutputTokens -> {
                _uiState.update { it.copy(maxOutputTokens = intent.tokens) }
            }
            is TranslationAiConfigIntent.ResetPrompt -> {
                _uiState.update { it.copy(promptTemplate = TranslationConstants.DEFAULT_PROMPT) }
                _effects.tryEmit(TranslationAiConfigEffect.ShowMessage(appCtx.getString(R.string.ai_prompt_reset_success)))
            }
            is TranslationAiConfigIntent.Save -> save()
        }
    }

    private fun save() {
        viewModelScope.launch {
            runCatching {
                val state = _uiState.value
                val savedConfig = aiProfileGateway.saveTaskPreset(
                    taskType = AiTaskType.TRANSLATE_CHAPTER,
                    promptTemplate = state.promptTemplate,
                    temperature = state.temperature,
                    maxOutputTokens = state.maxOutputTokens
                )
                _uiState.update { current ->
                    current.copy(
                        promptTemplate = savedConfig.promptTemplate,
                        temperature = savedConfig.params.temperature ?: TranslationConstants.DEFAULT_TEMPERATURE,
                        maxOutputTokens = savedConfig.params.maxOutputTokens ?: 0
                    )
                }
            }.onSuccess {
                appCtx.toastOnUi(R.string.ai_config_saved_success)
                _effects.tryEmit(TranslationAiConfigEffect.NavigateBack)
            }.onFailure { error ->
                _effects.tryEmit(
                    TranslationAiConfigEffect.ShowMessage(
                        error.message ?: appCtx.getString(R.string.ai_config_save_failed)
                    )
                )
            }
        }
    }
}
