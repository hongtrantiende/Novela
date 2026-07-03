package io.legado.app.ui.book.read.sheet

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Save
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import io.legado.app.R
import io.legado.app.data.entities.HttpTTS
import io.legado.app.ui.book.read.ReadBookIntent
import io.legado.app.ui.book.read.ReadBookUiState
import io.legado.app.ui.widget.components.AppTextField
import io.legado.app.ui.widget.components.alert.AppAlertDialog
import io.legado.app.ui.widget.components.button.series.SmallTonalButton
import io.legado.app.ui.widget.components.filePicker.FilePickerSheet
import io.legado.app.ui.widget.components.importComponents.BatchImportDialog
import io.legado.app.ui.widget.components.importComponents.SourceInputDialog
import io.legado.app.ui.widget.components.menuItem.RoundDropdownMenu
import io.legado.app.ui.widget.components.menuItem.RoundDropdownMenuItem
import io.legado.app.ui.widget.components.modalBottomSheet.AppModalBottomSheet
import io.legado.app.ui.widget.components.settingItem.SliderSettingItem
import io.legado.app.ui.widget.components.settingItem.TinyClickableSettingItem
import io.legado.app.ui.widget.components.settingItem.TinySwitchSettingItem
import io.legado.app.utils.GSON
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay

import io.legado.app.ui.config.readConfig.ReadConfig

@Composable
fun ReadAloudConfigSheet(
    show: Boolean,
    state: ReadBookUiState,
    onIntent: (ReadBookIntent) -> Unit,
    onDismissRequest: () -> Unit,
) {
    AppModalBottomSheet(
        show = show,
        onDismissRequest = onDismissRequest,
        title = stringResource(R.string.aloud_config),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .verticalScroll(rememberScrollState()),
        ) {

            TinyClickableSettingItem(
                title = stringResource(R.string.speak_engine),
                description = state.speakEngineName.ifEmpty {
                    stringResource(R.string.system_tts)
                },
                onClick = { onIntent(ReadBookIntent.SelectSpeakEngine) },
            )
            TinyClickableSettingItem(
                title = stringResource(R.string.sys_tts_config),
                onClick = { onIntent(ReadBookIntent.OpenSystemTtsSettings) },
            )
            TinyClickableSettingItem(
                title = stringResource(R.string.read_aloud_preload),
                onClick = { onIntent(ReadBookIntent.OpenPreDownloadNumPicker) },
            )
            TinyClickableSettingItem(
                title = stringResource(R.string.audio_cache_clean_time),
                onClick = { onIntent(ReadBookIntent.OpenCacheCleanTimePicker) },
            )
            TinyClickableSettingItem(
                title = stringResource(R.string.read_aloud_paragraph_interval),
                description = stringResource(R.string.read_aloud_paragraph_interval_summary, ReadConfig.readAloudParagraphInterval),
                onClick = { onIntent(ReadBookIntent.OpenParagraphIntervalPicker) },
            )
            TinyClickableSettingItem(
                title = stringResource(R.string.clear_cache),
                onClick = { onIntent(ReadBookIntent.ClearTtsCache) },
            )
        }
    }
}

@Composable
fun SpeakEngineConfigSheet(
    show: Boolean,
    state: ReadBookUiState,
    onIntent: (ReadBookIntent) -> Unit,
    onDismissRequest: () -> Unit,
) {
    val items = state.ttsEngineItems
    val selectedValue = state.selectedTtsEngine
    var pendingEngineSelection by remember { mutableStateOf<PendingSpeakEngineSelection?>(null) }
    var showImportSheet by remember { mutableStateOf(false) }
    var showUrlInput by remember { mutableStateOf(false) }
    var selectedTabIndex by remember { mutableStateOf(0) }

    // Split items into 4 tabs:
    // Tab 0 "Thế hệ 1": System TTS + custom (id >= 0 or null) + Wavenet (id -101 to -106)
    // Tab 1 "Thế hệ 2": Neural2 (id -107 to -108)
    // Tab 2 "Thế hệ 3": Chirp3-HD (id -109 to -138)
    // Tab 3 "Edge TTS": Edge TTS (id <= -200)
    val gen1Items = remember(items) {
        items.filter { item ->
            val id = item.value?.toLongOrNull()
            id == null || id >= 0 || (id in -106L..-101L)
        }
    }
    val gen2Items = remember(items) {
        items.filter { item ->
            val id = item.value?.toLongOrNull()
            id != null && id in -108L..-107L
        }
    }
    val gen3Items = remember(items) {
        items.filter { item ->
            val id = item.value?.toLongOrNull()
            id != null && id in -138L..-109L
        }
    }
    val edgeItems = remember(items) {
        items.filter { item ->
            val id = item.value?.toLongOrNull()
            id != null && id <= -200
        }
    }

    AppAlertDialog(
        show = pendingEngineSelection != null,
        onDismissRequest = { pendingEngineSelection = null },
        title = stringResource(R.string.speak_engine),
        text = stringResource(R.string.speak_engine_apply_scope),
        confirmText = stringResource(R.string.general),
        onConfirm = {
            onIntent(ReadBookIntent.ApplySpeakEngine(pendingEngineSelection?.value))
            pendingEngineSelection = null
        },
        dismissText = stringResource(R.string.book),
        onDismiss = {
            onIntent(ReadBookIntent.ApplySpeakEnginePerBook(pendingEngineSelection?.value))
            pendingEngineSelection = null
        },
    )
    SourceInputDialog(
        show = showUrlInput,
        title = stringResource(R.string.import_on_line),
        onDismissRequest = { showUrlInput = false },
        onConfirm = {
            showUrlInput = false
            onIntent(ReadBookIntent.ImportHttpTtsSource(it))
        },
    )
    FilePickerSheet(
        show = showImportSheet,
        onDismissRequest = { showImportSheet = false },
        title = stringResource(R.string.import_tts),
        onSelectSysFile = {
            showImportSheet = false
            onIntent(ReadBookIntent.ImportHttpTtsFile)
        },
        onManualInput = {
            showImportSheet = false
            showUrlInput = true
        },
        allowExtensions = arrayOf("json", "txt"),
    )
    BatchImportDialog(
        title = stringResource(R.string.import_tts),
        importState = state.httpTtsImportState,
        onDismissRequest = { onIntent(ReadBookIntent.CancelHttpTtsImport) },
        onToggleItem = { onIntent(ReadBookIntent.ToggleHttpTtsImportSelection(it)) },
        onToggleAll = { onIntent(ReadBookIntent.ToggleHttpTtsImportAll(it)) },
        onUpdateItem = { index, httpTTS ->
            onIntent(ReadBookIntent.UpdateHttpTtsImportItem(index, httpTTS))
        },
        onConfirm = { onIntent(ReadBookIntent.SaveImportedHttpTts) },
        itemTitle = { it.name },
        itemSubtitle = { it.url },
    )

    AppModalBottomSheet(
        show = show,
        onDismissRequest = onDismissRequest,
        title = stringResource(R.string.speak_engine),
        startAction = {
            if (selectedTabIndex == 0) {
                SmallTonalButton(
                    onClick = { onIntent(ReadBookIntent.EditHttpTts()) },
                    icon = Icons.Default.Add
                )
            }
        },
        endAction = {
            if (selectedTabIndex == 0) {
                var expanded by remember { mutableStateOf(false) }
                val selectedId = selectedValue?.toLongOrNull()
                val isPremiumSelected = selectedId != null && selectedId <= -108 && selectedId >= -138
                Box {
                    SmallTonalButton(
                        onClick = { expanded = true },
                        icon = Icons.Default.MoreVert
                    )
                    RoundDropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
                        RoundDropdownMenuItem(
                            text = stringResource(R.string.import_tts),
                            onClick = {
                                expanded = false
                                showImportSheet = true
                            },
                        )
                        if (!isPremiumSelected) {
                            RoundDropdownMenuItem(
                                text = stringResource(R.string.export),
                                onClick = {
                                    expanded = false
                                    onIntent(ReadBookIntent.ExportAllHttpTts)
                                },
                            )
                            RoundDropdownMenuItem(
                                text = stringResource(R.string.copy_url),
                                onClick = {
                                    expanded = false
                                    onIntent(ReadBookIntent.ExportAllHttpTtsAsUrl)
                                },
                            )
                        }
                        RoundDropdownMenuItem(
                            text = stringResource(R.string.clear_cache),
                            onClick = {
                                expanded = false
                                onIntent(ReadBookIntent.ClearTtsCache)
                            },
                        )
                    }
                }
            }
        },
    ) {
        // 4 tabs: Gen1 (Wavenet), Gen2 (Neural2), Gen3 (Chirp3-HD), Edge TTS
        val tabTitles = listOf("Thế hệ 1", "Thế hệ 2", "Thế hệ 3", "Edge TTS")
        androidx.compose.material3.ScrollableTabRow(
            selectedTabIndex = selectedTabIndex,
            modifier = Modifier.fillMaxWidth(),
            edgePadding = 8.dp,
        ) {
            tabTitles.forEachIndexed { index, title ->
                androidx.compose.material3.Tab(
                    selected = selectedTabIndex == index,
                    onClick = { selectedTabIndex = index },
                    text = {
                        androidx.compose.material3.Text(
                            text = title,
                            maxLines = 1,
                        )
                    },
                )
            }
        }

        Spacer(Modifier.height(8.dp))

        val displayItems = when (selectedTabIndex) {
            0 -> gen1Items
            1 -> gen2Items
            2 -> gen3Items
            3 -> edgeItems
            else -> gen1Items
        }

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f, fill = false)
                .padding(bottom = 8.dp),
        ) {
            items(displayItems) { item ->
                val httpTtsId = item.value?.toLongOrNull()
                val isSelected = item.value == selectedValue
                TinyClickableSettingItem(
                    title = item.title,
                    description = if (isSelected) {
                        stringResource(R.string.default_version)
                    } else {
                        null
                    },
                    onClick = { pendingEngineSelection = PendingSpeakEngineSelection(item.value) },
                    onLongClick = if (httpTtsId != null) {
                        { onIntent(ReadBookIntent.EditHttpTts(httpTtsId)) }
                    } else null,
                    trailingContent = if (httpTtsId != null && httpTtsId >= 0) {
                        {
                            Row(horizontalArrangement = Arrangement.spacedBy(2.dp)) {
                                SmallTonalButton(
                                    onClick = { onIntent(ReadBookIntent.EditHttpTts(httpTtsId)) },
                                    icon = Icons.Default.Edit,
                                )
                                SmallTonalButton(
                                    onClick = { onIntent(ReadBookIntent.DeleteHttpTts(httpTtsId)) },
                                    icon = Icons.Default.Delete,
                                )
                            }
                        }
                    } else null,
                )
            }
        }
    }
}

private data class PendingSpeakEngineSelection(val value: String?)

@Composable
fun HttpTtsEditSheet(
    show: Boolean,
    httpTTS: HttpTTS?,
    onIntent: (ReadBookIntent) -> Unit,
    onDismissRequest: () -> Unit,
) {
    val tts = httpTTS ?: return
    val clipboardManager = LocalClipboardManager.current
    val coroutineScope = rememberCoroutineScope()
    var name by remember(httpTTS) { mutableStateOf(tts.name) }
    var url by remember(httpTTS) { mutableStateOf(tts.url) }
    var contentType by remember(httpTTS) { mutableStateOf(tts.contentType ?: "") }
    var concurrentRate by remember(httpTTS) { mutableStateOf(tts.concurrentRate ?: "0") }
    var header by remember(httpTTS) { mutableStateOf(tts.header ?: "") }
    var loginUrl by remember(httpTTS) { mutableStateOf(tts.loginUrl ?: "") }
    var configJson by remember(httpTTS) { mutableStateOf(tts.loginUi ?: "") }
    val configObj = try {
        org.json.JSONObject(configJson)
    } catch (e: Exception) {
        null
    }
    var pitch by remember(configJson) {
        mutableStateOf(configObj?.optString("pitch", "0.0") ?: "0.0")
    }
    var volumeGain by remember(configJson) {
        mutableStateOf(configObj?.optString("volumeGain", "0.0") ?: "0.0")
    }
    var effectsProfile by remember(configJson) {
        mutableStateOf(configObj?.optString("effectsProfile", "") ?: "")
    }
    var audioEncoding by remember(configJson) {
        mutableStateOf(configObj?.optString("audioEncoding", "MP3") ?: "MP3")
    }
    var sampleRate by remember(configJson) {
        mutableStateOf(configObj?.optString("sampleRate", "") ?: "")
    }
    var ttsSpeechRate by remember(httpTTS) {
        mutableStateOf(ReadConfig.ttsSpeechRate.toFloat())
    }
    var loginCheckJs by remember(httpTTS) { mutableStateOf(tts.loginCheckJs ?: "") }
    var jsLib by remember(httpTTS) { mutableStateOf(tts.jsLib ?: "") }

    AppModalBottomSheet(
        show = show,
        onDismissRequest = onDismissRequest,
        title = stringResource(R.string.speak_engine),
        startAction = {
            var expanded by remember { mutableStateOf(false) }
            Box {
                SmallTonalButton(
                    onClick = { expanded = true },
                    icon = Icons.Default.MoreVert
                )
                RoundDropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
                    RoundDropdownMenuItem(
                        text = stringResource(R.string.copy_text),
                        onClick = {
                            expanded = false
                            val map = mutableMapOf<String, Any>()
                            pitch.replace(",", ".").toDoubleOrNull()?.let { map["pitch"] = it }
                            volumeGain.replace(",", ".").toDoubleOrNull()?.let { map["volumeGain"] = it }
                            if (effectsProfile.isNotBlank()) map["effectsProfile"] = effectsProfile
                            if (audioEncoding.isNotBlank()) map["audioEncoding"] = audioEncoding
                            if (sampleRate.isNotBlank()) map["sampleRate"] = sampleRate
                            val serializedLoginUi = GSON.toJson(map)
                            val json = GSON.toJson(
                                tts.copy(
                                    name = name, url = url, contentType = contentType.ifBlank { null },
                                    concurrentRate = concurrentRate, header = header.ifBlank { null },
                                    loginUrl = String.format(java.util.Locale.US, "%.1f", (ttsSpeechRate.toInt() + 5) / 10f), loginUi = serializedLoginUi.ifBlank { null },
                                    loginCheckJs = loginCheckJs.ifBlank { null }, jsLib = jsLib.ifBlank { null },
                                )
                            )
                            clipboardManager.setText(AnnotatedString(json))
                        },
                    )
                    RoundDropdownMenuItem(
                        text = stringResource(R.string.paste_source),
                        onClick = {
                            expanded = false
                            clipboardManager.getText()?.text?.let { text ->
                                HttpTTS.fromJson(text).getOrNull()?.let { imported ->
                                    name = imported.name
                                    url = imported.url
                                    contentType = imported.contentType ?: ""
                                    concurrentRate = imported.concurrentRate ?: "0"
                                    header = imported.header ?: ""
                                    loginUrl = imported.loginUrl ?: ""
                                    configJson = imported.loginUi ?: ""
                                    loginCheckJs = imported.loginCheckJs ?: ""
                                    jsLib = imported.jsLib ?: ""
                                }
                            }
                        },
                    )
                }
            }
        },
        endAction = {
            SmallTonalButton(
                icon = Icons.Default.Save,
                onClick = {
                    val map = mutableMapOf<String, Any>()
                    pitch.replace(",", ".").toDoubleOrNull()?.let { map["pitch"] = it }
                    volumeGain.replace(",", ".").toDoubleOrNull()?.let { map["volumeGain"] = it }
                    if (effectsProfile.isNotBlank()) map["effectsProfile"] = effectsProfile
                    if (audioEncoding.isNotBlank()) map["audioEncoding"] = audioEncoding
                    if (sampleRate.isNotBlank()) map["sampleRate"] = sampleRate
                    val serializedLoginUi = GSON.toJson(map)
                    
                    // Save reading speed globally
                    ReadConfig.ttsSpeechRate = Math.round(ttsSpeechRate)
                    io.legado.app.model.ReadAloud.upTtsSpeechRate(splitties.init.appCtx)
                    
                    // Clear TTS cache files to force download of fresh configs outside
                    try {
                        val baseDir = splitties.init.appCtx.externalCacheDir ?: splitties.init.appCtx.cacheDir
                        val ttsFolder = java.io.File(baseDir, "httpTTS")
                        val cacheFolder = java.io.File(baseDir, "httpTTS_cache")
                        io.legado.app.utils.FileUtils.delete(ttsFolder.absolutePath)
                        io.legado.app.utils.FileUtils.delete(cacheFolder.absolutePath)
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                    
                    onIntent(
                        ReadBookIntent.SaveHttpTts(
                            tts.copy(
                                name = name, url = url,
                                contentType = contentType.ifBlank { null },
                                concurrentRate = concurrentRate,
                                header = header.ifBlank { null },
                                loginUrl = loginUrl.ifBlank { null },
                                loginUi = serializedLoginUi.ifBlank { null },
                                loginCheckJs = loginCheckJs.ifBlank { null },
                                jsLib = jsLib.ifBlank { null },
                            )
                        )
                    )
                },
            )
        },
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            val isDefaultVoice = tts.id < 0
            val isEdgeTtsVoice = io.legado.app.help.tts.EdgeTtsClient.isEdgeTtsUrl(tts.url)
            val isChirp3Voice = tts.id in -138L..-109L

            if (!isDefaultVoice) {
                item {
                    AppTextField(
                        value = name,
                        onValueChange = { name = it },
                        label = stringResource(R.string.name),
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth(),
                    )
                }
                item {
                    AppTextField(
                        value = url,
                        onValueChange = { url = it },
                        label = "URL",
                        minLines = 2,
                        modifier = Modifier.fillMaxWidth(),
                    )
                }
                item {
                    AppTextField(
                        value = contentType,
                        onValueChange = { contentType = it },
                        label = "Content-Type",
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth(),
                    )
                }
                item {
                    AppTextField(
                        value = concurrentRate,
                        onValueChange = { concurrentRate = it },
                        label = stringResource(R.string.concurrent_rate),
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth(),
                    )
                }
                item {
                    AppTextField(
                        value = header,
                        onValueChange = { header = it },
                        label = stringResource(R.string.source_http_header),
                        minLines = 2,
                        modifier = Modifier.fillMaxWidth(),
                    )
                }
            }
            item {
                SliderSettingItem(
                    title = "Tốc độ đọc tải",
                    description = "Tốc độ đọc khi tải từ server (Mặc định: 1.0x, Hiện tại: ${loginUrl.replace(",", ".").toFloatOrNull() ?: 1.0f}x)",
                    value = loginUrl.replace(",", ".").toFloatOrNull() ?: 1.0f,
                    defaultValue = 1.0f,
                    valueRange = 0.5f..3.0f,
                    onValueChange = { loginUrl = String.format(java.util.Locale.US, "%.1f", it) }
                )
            }
            item {
                SliderSettingItem(
                    title = "Tốc độ đọc",
                    description = "Tốc độ phát của trình phát (Hiện tại: ${String.format(java.util.Locale.US, "%.1fx", (ttsSpeechRate.toInt() + 5) / 10f)})",
                    value = ttsSpeechRate,
                    defaultValue = 5.0f,
                    valueRange = 0.0f..25.0f,
                    onValueChange = { ttsSpeechRate = it }
                )
            }
            // Chirp3-HD does NOT support pitch/volume (Google API limitation)
            if (!isChirp3Voice) {
                item {
                    SliderSettingItem(
                        title = "Độ cao giọng (Pitch)",
                        description = "Trầm (-10) đến Cao (+10) (Mặc định: 0.0, Hiện tại: ${pitch.replace(",", ".").toFloatOrNull() ?: 0.0f})",
                        value = pitch.replace(",", ".").toFloatOrNull() ?: 0.0f,
                        defaultValue = 0.0f,
                        valueRange = -10.0f..10.0f,
                        onValueChange = { pitch = String.format(java.util.Locale.US, "%.1f", it) }
                    )
                }
                item {
                    SliderSettingItem(
                        title = "Âm lượng tăng cường (dB)",
                        description = "Nhỏ (-20) đến To (+16) (Mặc định: 0.0, Hiện tại: ${volumeGain.replace(",", ".").toFloatOrNull() ?: 0.0f} dB)",
                        value = volumeGain.replace(",", ".").toFloatOrNull() ?: 0.0f,
                        defaultValue = 0.0f,
                        valueRange = -20.0f..16.0f,
                        onValueChange = { volumeGain = String.format(java.util.Locale.US, "%.1f", it) }
                    )
                }
            }
            // Google-specific audio config fields
            if (!isEdgeTtsVoice && !isChirp3Voice) {
                item {
                    AppTextField(
                        value = effectsProfile,
                        onValueChange = { effectsProfile = it },
                        label = "Tối ưu thiết bị (VD: headphone-class-device)",
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth(),
                    )
                }
                item {
                    AppTextField(
                        value = audioEncoding,
                        onValueChange = { audioEncoding = it },
                        label = "Mã hóa âm thanh (VD: MP3 hoặc OGG_OPUS)",
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth(),
                    )
                }
                item {
                    AppTextField(
                        value = sampleRate,
                        onValueChange = { sampleRate = it },
                        label = "Tần số lấy mẫu (Chỉ hỗ trợ: 8000, 16000, 24000, 32000, 44100, 48000)",
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth(),
                    )
                }
            }
            if (!isDefaultVoice) {
                item {
                    AppTextField(
                        value = loginCheckJs,
                        onValueChange = { loginCheckJs = it },
                        label = stringResource(R.string.login_check_js),
                        minLines = 2,
                        modifier = Modifier.fillMaxWidth(),
                    )
                }
                item {
                    AppTextField(
                        value = jsLib,
                        onValueChange = { jsLib = it },
                        label = "jsLib",
                        minLines = 2,
                        modifier = Modifier.fillMaxWidth(),
                    )
                }
            }
            item {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(top = 8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    androidx.compose.material3.Button(
                        onClick = {
                            coroutineScope.launch {
                                // Save reading speed globally so it is picked up by player
                                ReadConfig.ttsSpeechRate = Math.round(ttsSpeechRate)
                                io.legado.app.model.ReadAloud.upTtsSpeechRate(splitties.init.appCtx)
                                
                                // If the service is running, stop it and wait until it stops to reload config
                                if (io.legado.app.service.BaseReadAloudService.isRun) {
                                    io.legado.app.model.ReadAloud.stop(splitties.init.appCtx)
                                    for (i in 1..20) {
                                        if (!io.legado.app.service.BaseReadAloudService.isRun) break
                                        delay(50)
                                    }
                                }

                                val tempMap = org.json.JSONObject()
                                pitch.replace(",", ".").toDoubleOrNull()?.let { tempMap.put("pitch", it) }
                                volumeGain.replace(",", ".").toDoubleOrNull()?.let { tempMap.put("volumeGain", it) }
                                if (effectsProfile.isNotBlank()) tempMap.put("effectsProfile", effectsProfile)
                                if (audioEncoding.isNotBlank()) tempMap.put("audioEncoding", audioEncoding)
                                if (sampleRate.isNotBlank()) tempMap.put("sampleRate", sampleRate)
                                val serializedLoginUi = tempMap.toString()
                                
                                val tempTts = tts.copy(
                                    name = name, url = url,
                                    contentType = contentType.ifBlank { null },
                                    concurrentRate = concurrentRate,
                                    header = header.ifBlank { null },
                                    loginUrl = loginUrl.ifBlank { null },
                                    loginUi = serializedLoginUi.ifBlank { null },
                                    loginCheckJs = loginCheckJs.ifBlank { null },
                                    jsLib = jsLib.ifBlank { null },
                                )
                                
                                // Clear TTS cache files to bypass cache and force download
                                try {
                                    val baseDir = splitties.init.appCtx.externalCacheDir ?: splitties.init.appCtx.cacheDir
                                    val ttsFolder = java.io.File(baseDir, "httpTTS")
                                    val cacheFolder = java.io.File(baseDir, "httpTTS_cache")
                                    io.legado.app.utils.FileUtils.delete(ttsFolder.absolutePath)
                                    io.legado.app.utils.FileUtils.delete(cacheFolder.absolutePath)
                                } catch (e: Exception) {
                                    e.printStackTrace()
                                }
                                
                                ReadConfig.ttsEngine = tempTts.id.toString()
                                io.legado.app.model.ReadBook.book?.setTtsEngine(tempTts.id.toString())
                                io.legado.app.model.ReadAloud.upReadAloudClass()
                                // MUST SET httpTTS AFTER upReadAloudClass to avoid database override!
                                io.legado.app.model.ReadAloud.httpTTS = tempTts
                                io.legado.app.model.ReadBook.readAloud(play = true)
                            }
                        },
                        modifier = Modifier.weight(1f)
                    ) {
                        androidx.compose.material3.Text("Nghe thử")
                    }
                    androidx.compose.material3.OutlinedButton(
                        onClick = {
                            io.legado.app.model.ReadAloud.stop(splitties.init.appCtx)
                        },
                        modifier = Modifier.weight(1f)
                    ) {
                        androidx.compose.material3.Text("Dừng nghe")
                    }
                }
            }
            item { Spacer(Modifier.height(16.dp)) }
        }
    }
}

@Composable
fun ReadAloudNumberConfigSheet(
    show: Boolean,
    title: String,
    description: String,
    value: Int,
    defaultValue: Int,
    valueRange: ClosedFloatingPointRange<Float>,
    onValueChange: (Int) -> Unit,
    onDismissRequest: () -> Unit,
) {
    AppModalBottomSheet(
        show = show,
        onDismissRequest = onDismissRequest,
        title = title,
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        ) {
            SliderSettingItem(
                title = title,
                description = description,
                value = value.toFloat(),
                defaultValue = defaultValue.toFloat(),
                valueRange = valueRange,
                onValueChange = { onValueChange(it.toInt()) },
            )
        }
    }
}
