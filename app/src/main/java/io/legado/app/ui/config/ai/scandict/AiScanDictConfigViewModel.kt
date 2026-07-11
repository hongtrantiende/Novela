package io.legado.app.ui.config.ai.scandict

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.legado.app.R
import io.legado.app.domain.gateway.AiProfileGateway
import io.legado.app.domain.model.AiTaskType
import io.legado.app.domain.model.AiPromptTemplate
import io.legado.app.domain.model.TranslationConstants
import io.legado.app.utils.toastOnUi
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import splitties.init.appCtx

class AiScanDictConfigViewModel(
    private val aiProfileGateway: AiProfileGateway
) : ViewModel() {

    private val _uiState = MutableStateFlow(AiScanDictConfigUiState())
    val uiState = _uiState.asStateFlow()

    private val _effects = MutableSharedFlow<AiScanDictConfigEffect>(extraBufferCapacity = 16)
    val effects = _effects.asSharedFlow()

    init {
        viewModelScope.launch {
            runCatching {
                val config = aiProfileGateway.getTaskPreset(AiTaskType.SCAN_DICT)
                _uiState.update { current ->
                    current.copy(
                        loading = false,
                        promptTemplate = config?.promptTemplate ?: AiPromptTemplate.DEFAULT_SCAN_DICT,
                        temperature = config?.params?.temperature ?: 0.1f,
                        maxOutputTokens = config?.params?.maxOutputTokens ?: 4096,
                        defaultPrompt = AiPromptTemplate.DEFAULT_SCAN_DICT,
                        initialized = true
                    )
                }
            }.onFailure { error ->
                _uiState.update { current ->
                    current.copy(
                        loading = false,
                        promptTemplate = AiPromptTemplate.DEFAULT_SCAN_DICT,
                        temperature = 0.1f,
                        maxOutputTokens = 4096,
                        defaultPrompt = AiPromptTemplate.DEFAULT_SCAN_DICT,
                        initialized = true
                    )
                }
                appCtx.toastOnUi("Tải cấu hình quét từ điển thất bại: ${error.localizedMessage ?: "sử dụng mặc định"}")
            }
        }
    }

    fun onIntent(intent: AiScanDictConfigIntent) {
        when (intent) {
            is AiScanDictConfigIntent.UpdatePrompt -> {
                _uiState.update { it.copy(promptTemplate = intent.prompt, activeDialog = null) }
            }
            is AiScanDictConfigIntent.OpenPromptDialog -> {
                _uiState.update { it.copy(activeDialog = AiScanDictConfigDialog.EditPrompt(intent.currentPrompt)) }
            }
            is AiScanDictConfigIntent.UpdateDialogPrompt -> {
                val currentDialog = _uiState.value.activeDialog as? AiScanDictConfigDialog.EditPrompt
                if (currentDialog != null) {
                    _uiState.update { it.copy(activeDialog = currentDialog.copy(currentPrompt = intent.prompt)) }
                }
            }
            is AiScanDictConfigIntent.CloseDialog -> {
                _uiState.update { it.copy(activeDialog = null) }
            }
            is AiScanDictConfigIntent.UpdateTemperature -> {
                _uiState.update { it.copy(temperature = intent.temperature) }
            }
            is AiScanDictConfigIntent.UpdateMaxOutputTokens -> {
                _uiState.update { it.copy(maxOutputTokens = intent.tokens) }
            }
            is AiScanDictConfigIntent.ResetPrompt -> {
                _uiState.update { it.copy(promptTemplate = AiPromptTemplate.DEFAULT_SCAN_DICT) }
                _effects.tryEmit(AiScanDictConfigEffect.ShowMessage(appCtx.getString(R.string.ai_prompt_reset_success)))
            }
            is AiScanDictConfigIntent.Save -> save()
        }
    }

    private fun save() {
        viewModelScope.launch {
            runCatching {
                val state = _uiState.value
                val savedConfig = aiProfileGateway.saveTaskPreset(
                    taskType = AiTaskType.SCAN_DICT,
                    promptTemplate = state.promptTemplate,
                    temperature = state.temperature,
                    maxOutputTokens = state.maxOutputTokens
                )
                _uiState.update { current ->
                    current.copy(
                        promptTemplate = savedConfig.promptTemplate,
                        temperature = savedConfig.params.temperature ?: 0.1f,
                        maxOutputTokens = savedConfig.params.maxOutputTokens ?: 4096
                    )
                }
            }.onSuccess {
                appCtx.toastOnUi(R.string.ai_config_saved_success)
                _effects.tryEmit(AiScanDictConfigEffect.NavigateBack)
            }.onFailure { error ->
                _effects.tryEmit(
                    AiScanDictConfigEffect.ShowMessage(
                        error.message ?: appCtx.getString(R.string.ai_config_save_failed)
                    )
                )
            }
        }
    }
}
