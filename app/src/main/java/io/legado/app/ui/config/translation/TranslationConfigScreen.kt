package io.legado.app.ui.config.translation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import kotlinx.coroutines.launch
import io.legado.app.R
import io.legado.app.ui.theme.adaptiveContentPadding
import io.legado.app.ui.widget.components.AppScaffold
import io.legado.app.ui.widget.components.SplicedColumnGroup
import io.legado.app.ui.widget.components.settingItem.ClickableSettingItem
import io.legado.app.ui.widget.components.settingItem.DropdownListSettingItem
import io.legado.app.ui.widget.components.settingItem.SliderSettingItem
import io.legado.app.ui.widget.components.topbar.GlassMediumFlexibleTopAppBar
import io.legado.app.ui.widget.components.topbar.GlassTopAppBarDefaults
import io.legado.app.ui.widget.components.topbar.TopBarNavigationButton

@SuppressLint("RememberReturnType")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TranslationConfigScreen(
    onBackClick: () -> Unit,
    onNavigateToQuickTranslate: () -> Unit,
    onNavigateToAi: () -> Unit
) {
    val scrollBehavior = GlassTopAppBarDefaults.defaultScrollBehavior()

    AppScaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            GlassMediumFlexibleTopAppBar(
                title = stringResource(R.string.translation_config),
                scrollBehavior = scrollBehavior,
                navigationIcon = {
                    TopBarNavigationButton(onClick = onBackClick)
                }
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = adaptiveContentPadding(
                top = paddingValues.calculateTopPadding(),
                bottom = 120.dp
            )
        ) {
            item {
                SplicedColumnGroup(title = "Dịch từ điển") {
                    ClickableSettingItem(
                        title = "Quick Translate (Từ điển)",
                        description = "Cấu hình ưu tiên dịch, luật nhân và quản lý từ điển",
                        onClick = onNavigateToQuickTranslate
                    )
                }
            }

            item {
                SplicedColumnGroup(title = stringResource(R.string.translation_provider)) {
                    DropdownListSettingItem(
                        title = stringResource(R.string.llm_provider),
                        selectedValue = TranslationConfig.llmProvider,
                        displayEntries = TranslationConfig.providerDisplayNames.toTypedArray(),
                        entryValues = TranslationConfig.providerValues.toTypedArray(),
                        onValueChange = { TranslationConfig.llmProvider = it }
                    )
                }
            }

            item {
                SplicedColumnGroup(title = stringResource(R.string.translation_options)) {
                    val languageEntries = TranslationConfig.targetLanguages.map { it.second }.toTypedArray()
                    val languageValues = TranslationConfig.targetLanguages.map { it.first }.toTypedArray()
                    DropdownListSettingItem(
                        title = stringResource(R.string.llm_target_language),
                        selectedValue = TranslationConfig.llmTargetLanguage,
                        displayEntries = languageEntries,
                        entryValues = languageValues,
                        onValueChange = { TranslationConfig.llmTargetLanguage = it }
                    )

                    SliderSettingItem(
                        title = stringResource(R.string.llm_max_chars_per_chunk),
                        value = TranslationConfig.llmMaxCharsPerChunk.toFloat(),
                        defaultValue = 10000f,
                        valueRange = 1000f..10000f,
                        steps = 17,
                        onValueChange = { TranslationConfig.llmMaxCharsPerChunk = it.toInt() }
                    )
                }
            }

            if (TranslationConfig.llmProvider == TranslationConfig.PROVIDER_HACHIMI_MT) {
                item {
                    val context = androidx.compose.ui.platform.LocalContext.current
                    val scope = androidx.compose.runtime.rememberCoroutineScope()
                    val downloadState by io.legado.app.model.translation.HachimiModelManager.state.collectAsStateWithLifecycle()
                    val selectedId by io.legado.app.model.translation.HachimiModelManager.selectedModelIdFlow.collectAsStateWithLifecycle()
                    val allModels = remember(downloadState, selectedId) {
                        io.legado.app.model.translation.HachimiModelManager.getAllInstalledModelIds(context)
                    }

                    // File picker launcher
                    val zipPickerLauncher = androidx.activity.compose.rememberLauncherForActivityResult(
                        contract = androidx.activity.result.contract.ActivityResultContracts.OpenDocument()
                    ) { uri ->
                        if (uri != null) {
                            scope.launch(kotlinx.coroutines.Dispatchers.IO) {
                                io.legado.app.model.translation.HachimiModelManager.importLocalZip(context, uri)
                            }
                        }
                    }

                    SplicedColumnGroup(title = "Mô hình dịch ONNX") {
                        // Default model (download)
                        val defaultModel = io.legado.app.domain.model.TranslationConstants.AVAILABLE_ONNX_MODELS.first()
                        val isDefaultInstalled = allModels.any { it.first == defaultModel.id }
                        val isDefaultSelected = selectedId == defaultModel.id

                        val defaultStatus = when {
                            isDefaultSelected && downloadState is io.legado.app.model.translation.HachimiModelManager.DownloadState.Downloading ->
                                "Đang tải... ${((downloadState as io.legado.app.model.translation.HachimiModelManager.DownloadState.Downloading).progress * 100).toInt()}%"
                            isDefaultSelected && downloadState is io.legado.app.model.translation.HachimiModelManager.DownloadState.Extracting ->
                                "Đang giải nén..."
                            isDefaultInstalled && isDefaultSelected -> "Đang sử dụng"
                            isDefaultInstalled -> "Đã tải · Nhấn để chọn"
                            else -> "${defaultModel.sizeDescription} · Nhấn để tải"
                        }

                        ClickableSettingItem(
                            title = (if (isDefaultSelected) "● " else "○ ") + defaultModel.displayName,
                            description = "${defaultModel.description}\n$defaultStatus",
                            onClick = {
                                scope.launch(kotlinx.coroutines.Dispatchers.IO) {
                                    if (isDefaultInstalled) {
                                        io.legado.app.model.translation.HachimiModelManager.switchModel(defaultModel.id, context)
                                    } else {
                                        io.legado.app.model.translation.HachimiModelManager.switchModel(defaultModel.id, context)
                                        io.legado.app.model.translation.HachimiModelManager.ensureModelReady(context, defaultModel)
                                    }
                                }
                            },
                            onLongClick = {
                                if (isDefaultInstalled) {
                                    scope.launch(kotlinx.coroutines.Dispatchers.IO) {
                                        io.legado.app.model.translation.HachimiModelManager.deleteModel(context, defaultModel.id)
                                    }
                                }
                            }
                        )

                        // Show imported models (not in AVAILABLE_ONNX_MODELS)
                        val knownIds = io.legado.app.domain.model.TranslationConstants.AVAILABLE_ONNX_MODELS.map { it.id }.toSet()
                        val importedModels = allModels.filter { it.first !in knownIds }
                        importedModels.forEach { (modelId, displayName) ->
                            val isSelected = selectedId == modelId
                            ClickableSettingItem(
                                title = (if (isSelected) "● " else "○ ") + displayName,
                                description = if (isSelected) "Đang sử dụng (nhập cục bộ)" else "Nhấn để chọn · Giữ để xóa",
                                onClick = {
                                    scope.launch(kotlinx.coroutines.Dispatchers.IO) {
                                        io.legado.app.model.translation.HachimiModelManager.switchModel(modelId, context)
                                    }
                                },
                                onLongClick = {
                                    scope.launch(kotlinx.coroutines.Dispatchers.IO) {
                                        io.legado.app.model.translation.HachimiModelManager.deleteModel(context, modelId)
                                    }
                                }
                            )
                        }

                        // Import button
                        val importStatus = when (val state = downloadState) {
                            is io.legado.app.model.translation.HachimiModelManager.DownloadState.Extracting ->
                                "Đang giải nén..."
                            is io.legado.app.model.translation.HachimiModelManager.DownloadState.Error ->
                                "Lỗi: ${state.message}"
                            else -> "Chọn file ZIP chứa model ONNX"
                        }

                        ClickableSettingItem(
                            title = "Nhập mô hình ONNX cục bộ",
                            description = importStatus,
                            onClick = {
                                zipPickerLauncher.launch(arrayOf("application/zip", "application/x-zip-compressed", "application/octet-stream"))
                            }
                        )
                    }
                }
            }

            if (TranslationConfig.llmProvider == TranslationConfig.PROVIDER_APP_AI) {
                item {
                    SplicedColumnGroup(title = stringResource(R.string.ai_config)) {
                        ClickableSettingItem(
                            title = stringResource(R.string.translation_app_ai_provider),
                            description = stringResource(R.string.translation_app_ai_provider_summary),
                            onClick = onNavigateToAi
                        )
                    }
                }
            }
        }
    }
}
