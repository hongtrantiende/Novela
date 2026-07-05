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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import io.legado.app.R
import io.legado.app.data.entities.HttpTTS
import io.legado.app.ui.book.read.ReadBookIntent
import io.legado.app.ui.book.read.ReadBookTtsVoiceItem
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
fun SpeakEnginePickerSheet(
    show: Boolean,
    onDismissRequest: () -> Unit,
    onSelectEngine: (String) -> Unit,
) {
    AppAlertDialog(
        show = show,
        onDismissRequest = onDismissRequest,
        title = "Chọn công cụ đọc",
        dismissText = "Đóng",
        onDismiss = onDismissRequest,
        content = {
        val engines = listOf(
            Pair("TTS hệ thống", "system_tts"),
            Pair("Google V1 (Wavenet)", "google_v1"),
            Pair("Google V2 (Neural2)", "google_v2"),
            Pair("AI (ONNX)", "ai_tts_onnx"),
        )
        Column(
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
        ) {
            engines.forEach { (title, key) ->
                TinyClickableSettingItem(
                    title = title,
                    onClick = {
                        onSelectEngine(key)
                        onDismissRequest()
                    }
                )
            }
        }
        }
    )
}

@Composable
fun VoicePickerSheet(
    show: Boolean,
    engineKey: String,
    state: ReadBookUiState,
    onDismissRequest: () -> Unit,
    onIntent: (ReadBookIntent) -> Unit,
    onDownloadAiTtsModel: ((String, (Int) -> Unit, (Boolean) -> Unit) -> Unit)? = null,
) {
    val coroutineScope = rememberCoroutineScope()
    AppAlertDialog(
        show = show,
        onDismissRequest = onDismissRequest,
        title = "Chọn giọng đọc",
        dismissText = "Đóng",
        onDismiss = onDismissRequest,
        content = {
        val items = state.ttsEngineItems
        Column(
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
        ) {
            when (engineKey) {
                "system_tts" -> {
                    state.systemTtsVoiceItems.forEach { voice ->
                        val isSelected = state.selectedTtsEngine.isNullOrBlank() && state.selectedTtsVoiceName == voice.name
                        TinyClickableSettingItem(
                            title = voice.title,
                            description = if (voice.isNetwork) "Cần kết nối mạng" else "Offline",
                            trailingContent = if (isSelected) {
                                {
                                    androidx.compose.material3.Icon(
                                        imageVector = Icons.Default.Save,
                                        contentDescription = "Đã chọn",
                                        tint = androidx.compose.material3.MaterialTheme.colorScheme.primary,
                                        modifier = Modifier.height(18.dp)
                                    )
                                }
                            } else null,
                            onClick = {
                                onIntent(ReadBookIntent.ApplySpeakEngine(null))
                                onIntent(ReadBookIntent.ApplyTtsVoice(voice.name))
                                onDismissRequest()
                            }
                        )
                    }
                }
                "google_v1" -> {
                    val filtered = items.filter { it.value?.toLongOrNull()?.let { id -> id in -106L..-101L } == true }
                    filtered.forEach { item ->
                        val isSelected = state.selectedTtsEngine == item.value
                        TinyClickableSettingItem(
                            title = item.title,
                            description = if (isSelected) "Đang chọn" else null,
                            onClick = {
                                onIntent(ReadBookIntent.ApplySpeakEngine(item.value))
                                onDismissRequest()
                            }
                        )
                    }
                }
                "google_v2" -> {
                    val filtered = items.filter { it.value?.toLongOrNull()?.let { id -> id in -108L..-107L } == true }
                    filtered.forEach { item ->
                        val isSelected = state.selectedTtsEngine == item.value
                        TinyClickableSettingItem(
                            title = item.title,
                            description = if (isSelected) "Đang chọn" else null,
                            onClick = {
                                onIntent(ReadBookIntent.ApplySpeakEngine(item.value))
                                onDismissRequest()
                            }
                        )
                    }
                }
                "google_v3" -> {
                    val filtered = items.filter { it.value?.toLongOrNull()?.let { id -> id in -138L..-109L } == true }
                    filtered.forEach { item ->
                        val isSelected = state.selectedTtsEngine == item.value
                        TinyClickableSettingItem(
                            title = item.title,
                            description = if (isSelected) "Đang chọn" else null,
                            onClick = {
                                onIntent(ReadBookIntent.ApplySpeakEngine(item.value))
                                onDismissRequest()
                            }
                        )
                    }
                }
                "edge_tts" -> {
                    val filtered = items.filter { 
                        it.title.contains("edge", ignoreCase = true) || 
                        it.value?.toLongOrNull()?.let { id -> id <= -200 } == true 
                    }
                    filtered.forEach { item ->
                        val isSelected = state.selectedTtsEngine == item.value
                        TinyClickableSettingItem(
                            title = item.title,
                            description = if (isSelected) "Đang chọn" else null,
                            onClick = {
                                onIntent(ReadBookIntent.ApplySpeakEngine(item.value))
                                onDismissRequest()
                            }
                        )
                    }
                }
                "ai_tts_onnx" -> {
                    state.aiTtsVoiceItems.forEach { voice ->
                        val isSelected = state.selectedTtsEngine == "ai_tts_onnx" && state.selectedTtsVoiceName == voice.name
                        var downloadProgress by remember(voice.name) { mutableStateOf<Int?>(null) }
                        
                        TinyClickableSettingItem(
                            title = voice.title + (if (downloadProgress != null) " (Đang tải ${downloadProgress}%)" else ""),
                            description = if (voice.isNetwork) {
                                if (downloadProgress != null) "Đang tải xuống..." else "Chưa tải về · Nhấp để tải ngoại tuyến"
                            } else "Offline (Sẵn sàng)",
                            trailingContent = if (isSelected) {
                                {
                                    androidx.compose.material3.Icon(
                                        imageVector = Icons.Default.Save,
                                        contentDescription = "Đã chọn",
                                        tint = androidx.compose.material3.MaterialTheme.colorScheme.primary,
                                        modifier = Modifier.height(18.dp)
                                    )
                                }
                            } else null,
                            onClick = {
                                if (voice.isNetwork) {
                                    if (downloadProgress == null && onDownloadAiTtsModel != null) {
                                        val modelId = voice.name.split(":").firstOrNull() ?: ""
                                        coroutineScope.launch {
                                            onDownloadAiTtsModel(modelId,
                                                { progress -> downloadProgress = progress },
                                                { success -> downloadProgress = null }
                                            )
                                        }
                                    }
                                } else {
                                    onIntent(ReadBookIntent.ApplySpeakEngine("ai_tts_onnx"))
                                    onIntent(ReadBookIntent.ApplyTtsVoice(voice.name))
                                    onDismissRequest()
                                }
                            }
                        )
                    }
                }
            }
        }
        }
    )
}

@Composable
fun ReadAloudConfigSheet(
    show: Boolean,
    state: ReadBookUiState,
    onIntent: (ReadBookIntent) -> Unit,
    onDismissRequest: () -> Unit,
    onDownloadAiTtsModel: ((String, (Int) -> Unit, (Boolean) -> Unit) -> Unit)? = null,
) {
    if (!show) return

    val coroutineScope = rememberCoroutineScope()
    var showEnginePicker by remember { mutableStateOf(false) }
    var showVoicePicker by remember { mutableStateOf(false) }

    val currentEngine = state.selectedTtsEngine
    val engineKey = remember(currentEngine) {
        when {
            currentEngine == "ai_tts_onnx" -> "ai_tts_onnx"
            currentEngine != null && currentEngine.toLongOrNull() != null -> {
                val id = currentEngine.toLongOrNull() ?: 0L
                when {
                    id in -108L..-107L -> "google_v2"
                    id in -106L..-101L -> "google_v1"
                    else -> "system_tts"
                }
            }
            else -> "system_tts"
        }
    }
    val engineDisplayName = when (engineKey) {
        "system_tts" -> "TTS hệ thống"
        "google_v1" -> "Google V1 (Wavenet)"
        "google_v2" -> "Google V2 (Neural2)"
        "ai_tts_onnx" -> "AI (ONNX)"
        else -> "TTS hệ thống"
    }

    val voiceDisplayName = if (currentEngine == "ai_tts_onnx" || currentEngine.isNullOrBlank() || currentEngine.toLongOrNull() == null) {
        state.selectedTtsVoiceName?.takeIf { it.isNotBlank() } ?: "Mặc định (tự động)"
    } else {
        state.speakEngineName.ifEmpty { "Mặc định" }
    }

    val currentHttpTtsId = currentEngine?.toLongOrNull()
    val showEditTts = engineKey != "system_tts" && engineKey != "ai_tts_onnx" && currentHttpTtsId != null

    SpeakEnginePickerSheet(
        show = showEnginePicker,
        onDismissRequest = { showEnginePicker = false },
        onSelectEngine = { key ->
            when (key) {
                "system_tts" -> {
                    onIntent(ReadBookIntent.ApplySpeakEngine(null))
                    onIntent(ReadBookIntent.ApplyTtsVoice(""))
                }
                "ai_tts_onnx" -> {
                    onIntent(ReadBookIntent.ApplySpeakEngine("ai_tts_onnx"))
                    val firstVoice = state.aiTtsVoiceItems.firstOrNull { !it.isNetwork }
                    if (firstVoice != null) {
                        onIntent(ReadBookIntent.ApplyTtsVoice(firstVoice.name))
                    }
                }
                else -> {
                    val items = state.ttsEngineItems
                    val targetValue = when (key) {
                        "google_v1" -> items.firstOrNull { it.value?.toLongOrNull()?.let { id -> id in -106L..-101L } == true }?.value ?: "-101"
                        "google_v2" -> items.firstOrNull { it.value?.toLongOrNull()?.let { id -> id in -108L..-107L } == true }?.value ?: "-107"
                        else -> null
                    }
                    if (targetValue != null) {
                        onIntent(ReadBookIntent.ApplySpeakEngine(targetValue))
                    }
                }
            }
        }
    )

    VoicePickerSheet(
        show = showVoicePicker,
        engineKey = engineKey,
        state = state,
        onDismissRequest = { showVoicePicker = false },
        onIntent = onIntent,
        onDownloadAiTtsModel = onDownloadAiTtsModel,
    )

    AppModalBottomSheet(
        show = show,
        onDismissRequest = onDismissRequest,
        title = "Điều chỉnh giọng đọc",
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .verticalScroll(rememberScrollState()),
        ) {
            TinyClickableSettingItem(
                title = "Chọn công cụ đọc",
                description = engineDisplayName,
                onClick = { showEnginePicker = true }
            )

            TinyClickableSettingItem(
                title = "Chọn giọng đọc",
                description = voiceDisplayName,
                onClick = { showVoicePicker = true }
            )

            if (showEditTts) {
                TinyClickableSettingItem(
                    title = "Điều chỉnh giọng đọc",
                    onClick = {
                        onIntent(ReadBookIntent.EditHttpTts(currentHttpTtsId))
                    }
                )
            }

            if (engineKey == "system_tts") {
                TinyClickableSettingItem(
                    title = stringResource(R.string.sys_tts_config),
                    onClick = { onIntent(ReadBookIntent.OpenSystemTtsSettings) },
                )
            }

            TinyClickableSettingItem(
                title = stringResource(R.string.read_aloud_paragraph_interval),
                description = stringResource(R.string.read_aloud_paragraph_interval_summary, ReadConfig.readAloudParagraphInterval),
                onClick = { onIntent(ReadBookIntent.OpenParagraphIntervalPicker) },
            )

            TinyClickableSettingItem(
                title = stringResource(R.string.clear_cache),
                onClick = { onIntent(ReadBookIntent.ClearTtsCache) },
            )

            Spacer(Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                io.legado.app.ui.widget.components.button.series.MediumTonalButton(
                    onClick = {
                        coroutineScope.launch {
                            if (io.legado.app.service.BaseReadAloudService.isRun) {
                                io.legado.app.model.ReadAloud.stop(splitties.init.appCtx)
                                for (i in 1..20) {
                                    if (!io.legado.app.service.BaseReadAloudService.isRun) break
                                    delay(50)
                                }
                            }
                            ReadConfig.ttsEngine = currentEngine
                            io.legado.app.model.ReadBook.book?.setTtsEngine(currentEngine)
                            io.legado.app.model.ReadAloud.upReadAloudClass()
                            io.legado.app.model.ReadBook.readAloud(play = true)
                        }
                    },
                    modifier = Modifier.weight(1f),
                    text = "Nghe thử"
                )
                io.legado.app.ui.widget.components.button.series.MediumOutlinedButton(
                    onClick = {
                        io.legado.app.model.ReadAloud.stop(splitties.init.appCtx)
                    },
                    modifier = Modifier.weight(1f),
                    text = "Dừng nghe"
                )
            }
        }
    }
}

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
        mutableStateOf(configObj?.optString("sampleRate", "16000") ?: "16000")
    }

    LaunchedEffect(pitch, volumeGain, effectsProfile, audioEncoding, sampleRate) {
        kotlinx.coroutines.delay(500)
        val tempMap = org.json.JSONObject()
        pitch.replace(",", ".").toDoubleOrNull()?.let { tempMap.put("pitch", it) }
        volumeGain.replace(",", ".").toDoubleOrNull()?.let { tempMap.put("volumeGain", it) }
        if (effectsProfile.isNotBlank()) tempMap.put("effectsProfile", effectsProfile)
        if (audioEncoding.isNotBlank()) tempMap.put("audioEncoding", audioEncoding)
        if (sampleRate.isNotBlank()) tempMap.put("sampleRate", sampleRate)
        val serializedLoginUi = tempMap.toString()
        val tempTts = tts.copy(
            loginUi = serializedLoginUi.ifBlank { null }
        )
        kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
            io.legado.app.data.appDb.httpTTSDao.update(tempTts)
        }
        if (ReadConfig.ttsEngine == tempTts.id.toString()) {
            io.legado.app.model.ReadAloud.httpTTS = tempTts
        }
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
                    io.legado.app.ui.widget.components.button.series.MediumTonalButton(
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
                                
                                kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
                                    io.legado.app.data.appDb.httpTTSDao.update(tempTts)
                                }
                                ReadConfig.ttsEngine = tempTts.id.toString()
                                io.legado.app.model.ReadBook.book?.setTtsEngine(tempTts.id.toString())
                                io.legado.app.model.ReadAloud.upReadAloudClass()
                                // MUST SET httpTTS AFTER upReadAloudClass to avoid database override!
                                io.legado.app.model.ReadAloud.httpTTS = tempTts
                                io.legado.app.model.ReadBook.readAloud(play = true)
                            }
                        },
                        modifier = Modifier.weight(1f),
                        text = "Nghe thử"
                    )
                    io.legado.app.ui.widget.components.button.series.MediumOutlinedButton(
                        onClick = {
                            io.legado.app.model.ReadAloud.stop(splitties.init.appCtx)
                        },
                        modifier = Modifier.weight(1f),
                        text = "Dừng nghe"
                    )
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
