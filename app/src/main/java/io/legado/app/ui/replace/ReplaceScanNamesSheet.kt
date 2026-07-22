package io.legado.app.ui.replace

import android.content.Context
import androidx.annotation.Keep
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.legado.app.ui.theme.LegadoTheme
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import android.content.SharedPreferences
import splitties.init.appCtx
import io.legado.app.data.appDb
import io.legado.app.data.entities.Book
import io.legado.app.data.entities.BookChapter
import io.legado.app.data.entities.ReplaceRule
import io.legado.app.help.book.BookHelp
import io.legado.app.help.LacAnalyzerHelper
import io.legado.app.help.http.okHttpClient
import io.legado.app.model.ReadBook
import io.legado.app.model.TranslationLoader
import io.legado.app.ui.widget.components.EmptyMessage
import io.legado.app.ui.widget.components.alert.AppAlertDialog
import io.legado.app.ui.widget.components.modalBottomSheet.AppModalBottomSheet
import io.legado.app.ui.widget.components.progressIndicator.AppCircularProgressIndicator
import io.legado.app.utils.TranslateUtils
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody

@Composable
fun ReplaceScanNamesSheet(
    show: Boolean,
    onDismissRequest: () -> Unit,
    onRulesAdded: () -> Unit
) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val book = remember { ReadBook.book }
    
    // UI states
    var scanMode by remember { mutableIntStateOf(0) } // 0: Chương hiện tại, 1: Tất cả chương đã tải
    var isScanning by remember { mutableStateOf(false) }
    var progressText by remember { mutableStateOf("") }
    
    // Data states
    var scannedNames by remember { mutableStateOf<List<ScanNameItem>>(emptyList()) }
    
    // AI Config States
    var showAiConfigDialog by remember { mutableStateOf(false) }
    val sharedPrefs: SharedPreferences = remember { appCtx.getSharedPreferences("ai_config", Context.MODE_PRIVATE) }
    val providers by remember { appDb.aiProfileDao.observeProviders() }.collectAsState(initial = emptyList())
    val models by remember { appDb.aiProfileDao.observeModels() }.collectAsState(initial = emptyList())
    var selectedModelProfileId by remember { mutableStateOf("") }
    
    // NER Model states
    var isModelDownloaded by remember { mutableStateOf(false) }
    var showDownloadModelDialog by remember { mutableStateOf(false) }
    val isDownloading by LacAnalyzerHelper.isDownloading.collectAsState()
    val downloadProgress by LacAnalyzerHelper.downloadProgress.collectAsState()

    LaunchedEffect(show, models) {
        if (show) {
            isModelDownloaded = LacAnalyzerHelper.isModelDownloaded(context)
            val savedId = sharedPrefs.getString("selected_model_profile_id", "") ?: ""
            selectedModelProfileId = if (savedId.isNotEmpty() && models.any { it.id == savedId }) {
                savedId
            } else {
                models.firstOrNull()?.id ?: ""
            }
        }
    }
    
    if (showAiConfigDialog) {
        AppAlertDialog(
            show = showAiConfigDialog,
            title = "Chọn model quét từ điển",
            content = {
                LazyColumn(modifier = Modifier.fillMaxWidth().heightIn(max = 300.dp)) {
                    if (models.isEmpty()) {
                        item {
                            Text("Chưa cấu hình model nào trong Cài đặt AI", modifier = Modifier.padding(16.dp))
                        }
                    } else {
                        itemsIndexed(models) { _, model ->
                            val provider = providers.find { it.id == model.providerId }
                            val providerName = provider?.name ?: "Không rõ"
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable {
                                        selectedModelProfileId = model.id
                                        sharedPrefs.edit().putString("selected_model_profile_id", model.id).apply()
                                        showAiConfigDialog = false
                                    }
                                    .padding(vertical = 12.dp, horizontal = 16.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(text = model.displayName, fontWeight = FontWeight.Bold, fontSize = 15.sp, color = LegadoTheme.colorScheme.onSurface)
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Text(text = "${providerName} / ${model.modelId}", fontSize = 12.sp, color = LegadoTheme.colorScheme.onSurfaceVariant)
                                }
                                if (model.id == selectedModelProfileId) {
                                    Icon(
                                        imageVector = Icons.Default.Check,
                                        contentDescription = "Selected",
                                        tint = LegadoTheme.colorScheme.primary,
                                        modifier = Modifier.size(20.dp)
                                    )
                                }
                            }
                        }
                    }
                }
            },
            onConfirm = null,
            dismissText = "Đóng",
            onDismiss = { showAiConfigDialog = false },
            onDismissRequest = { showAiConfigDialog = false }
        )
    }

    if (showDownloadModelDialog) {
        AppAlertDialog(
            show = showDownloadModelDialog,
            title = "Tải model NER offline",
            content = {
                Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp)) {
                    Text(
                        text = "Để quét Name offline bằng công cụ Baidu LAC, bạn cần tải mô hình ngôn ngữ (khoảng 3.2 MB).",
                        fontSize = 14.sp,
                        color = LegadoTheme.colorScheme.onSurface.copy(alpha = 0.7f)
                    )
                    if (isDownloading) {
                        Spacer(modifier = Modifier.height(16.dp))
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            AppCircularProgressIndicator(modifier = Modifier.size(24.dp))
                            Spacer(modifier = Modifier.width(12.dp))
                            Text(text = downloadProgress, fontSize = 14.sp)
                        }
                    }
                }
            },
            confirmText = "Tải ngay",
            onConfirm = if (isDownloading) null else {
                {
                    coroutineScope.launch {
                        val success = LacAnalyzerHelper.downloadAndExtractModel(context)
                        if (success) {
                            isModelDownloaded = true
                            showDownloadModelDialog = false
                        }
                    }
                }
            },
            dismissText = "Hủy",
            onDismiss = if (isDownloading) null else { { showDownloadModelDialog = false } },
            onDismissRequest = { if (!isDownloading) showDownloadModelDialog = false }
        )
    }

    // Nếu không có sách đang đọc
    if (book == null) {
        AppAlertDialog(
            show = show,
            onDismissRequest = onDismissRequest,
            title = "Không tìm thấy sách",
            text = "Bạn cần mở một cuốn sách truyện chữ trước khi sử dụng tính năng quét name này.",
            confirmText = "OK",
            onConfirm = onDismissRequest
        )
        return
    }

    AppModalBottomSheet(
        show = show,
        onDismissRequest = onDismissRequest,
        title = "Bộ công cụ Quét Name",
        endAction = {
            IconButton(onClick = onDismissRequest) {
                Icon(Icons.Default.Close, contentDescription = "Đóng")
            }
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.85f)
                .padding(bottom = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (scannedNames.isEmpty() && !isScanning) {
                // UI Lựa chọn quét ban đầu
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(horizontal = 24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Phạm vi quét",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 12.dp)
                    )
                    
                    Row(
                        modifier = Modifier.fillMaxWidth(0.9f),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        RadioButton(
                            selected = scanMode == 0,
                            onClick = { scanMode = 0 }
                        )
                        Text(
                            "Chương hiện tại",
                            modifier = Modifier
                                .clickable { scanMode = 0 }
                                .padding(start = 4.dp, end = 24.dp)
                                .align(Alignment.CenterVertically),
                            fontSize = 14.sp
                        )
                        
                        RadioButton(
                            selected = scanMode == 1,
                            onClick = { scanMode = 1 }
                        )
                        Text(
                            "Tất cả chương đã tải",
                            modifier = Modifier
                                .clickable { scanMode = 1 }
                                .padding(start = 4.dp)
                                .align(Alignment.CenterVertically),
                            fontSize = 14.sp
                        )
                    }
                    
                    Spacer(modifier = Modifier.height(32.dp))
                    
                    Row(
                        modifier = Modifier.fillMaxWidth(0.9f),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button(
                            onClick = {
                                if (!isModelDownloaded) {
                                    showDownloadModelDialog = true
                                    return@Button
                                }
                                isScanning = true
                                coroutineScope.launch {
                                    val targetChapters = withContext(Dispatchers.IO) {
                                        val all = appDb.bookChapterDao.getChapterList(book.bookUrl)
                                        if (scanMode == 0) {
                                            val curIndex = ReadBook.durChapterIndex
                                            all.filter { it.index == curIndex }
                                        } else {
                                            all.filter { chapter ->
                                                BookHelp.hasContent(book, chapter)
                                            }
                                        }
                                    }
                                    
                                    if (targetChapters.isNotEmpty()) {
                                        val names = scanNamesFromChapters(context, book, targetChapters) { scanned, total ->
                                            progressText = "Đang quét NER chương $scanned / $total..."
                                        }
                                        scannedNames = names.map { ScanNameItem(it.first, it.second, "") }
                                    } else {
                                        scannedNames = emptyList()
                                    }
                                    isScanning = false
                                }
                            },
                            modifier = Modifier.weight(1.3f)
                        ) {
                            Text("Quét NER Offline", maxLines = 1)
                        }
                        
                        Button(
                            onClick = {
                                val selectedModel = models.find { it.id == selectedModelProfileId }
                                val selectedProvider = selectedModel?.let { model -> providers.find { it.id == model.providerId } }
                                if (selectedModel == null || selectedProvider == null) {
                                    showAiConfigDialog = true
                                    return@Button
                                }
                                if (selectedProvider.apiKey.isBlank()) {
                                    android.widget.Toast.makeText(context, "API Key của model này trống, vui lòng cấu hình trong Cài đặt AI", android.widget.Toast.LENGTH_SHORT).show()
                                    return@Button
                                }
                                
                                isScanning = true
                                progressText = "AI đang phân tích và quét Name..."
                                coroutineScope.launch {
                                    try {
                                        val targetChapters = withContext(Dispatchers.IO) {
                                            val all = appDb.bookChapterDao.getChapterList(book.bookUrl)
                                            if (scanMode == 0) {
                                                val curIndex = ReadBook.durChapterIndex
                                                all.filter { it.index == curIndex }
                                            } else {
                                                all.filter { chapter ->
                                                    BookHelp.hasContent(book, chapter)
                                                }
                                            }
                                        }
                                        
                                        if (targetChapters.isNotEmpty()) {
                                            val names = scanNamesWithAi(
                                                book, 
                                                targetChapters, 
                                                selectedProvider.baseUrl, 
                                                selectedProvider.apiKey, 
                                                selectedModel.modelId
                                            ) { scanned, total ->
                                                progressText = "AI đang đọc chương $scanned / $total..."
                                            }
                                            scannedNames = names.map { ScanNameItem(it.first, it.second, "") }
                                        } else {
                                            scannedNames = emptyList()
                                        }
                                    } catch (e: Exception) {
                                        e.printStackTrace()
                                        withContext(Dispatchers.Main) {
                                            android.widget.Toast.makeText(appCtx, "Lỗi: ${e.message}", android.widget.Toast.LENGTH_LONG).show()
                                        }
                                    } finally {
                                        isScanning = false
                                    }
                                }
                            },
                            modifier = Modifier.weight(1f)
                        ) {
                            Text("Nhờ AI quét", maxLines = 1)
                        }
                        
                        IconButton(
                            onClick = {
                                showAiConfigDialog = true
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Default.Settings,
                                contentDescription = "Cấu hình AI"
                            )
                        }
                    }
                }
            } else if (isScanning) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        AppCircularProgressIndicator()
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(text = progressText, fontSize = 14.sp)
                    }
                }
            } else {
                // Hiển thị danh sách Name quét được
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp, vertical = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Tìm thấy ${scannedNames.size} Name",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                    )
                    TextButton(onClick = { scannedNames = emptyList() }) {
                        Text("Quét lại")
                    }
                }
                
                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    contentPadding = PaddingValues(horizontal = 20.dp, vertical = 8.dp)
                ) {
                    itemsIndexed(scannedNames) { index, item ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column(modifier = Modifier.weight(0.45f)) {
                                Text(
                                    text = item.chinese,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(
                                    text = item.originalTranslation,
                                    fontSize = 13.sp,
                                    color = LegadoTheme.colorScheme.onSurface.copy(alpha = 0.5f)
                                )
                            }
                            
                            Spacer(modifier = Modifier.width(8.dp))
                            
                            OutlinedTextField(
                                value = item.replacement,
                                onValueChange = { newValue ->
                                    scannedNames = scannedNames.toMutableList().apply {
                                        this[index] = item.copy(replacement = newValue)
                                    }
                                },
                                label = { Text("Sửa thành", fontSize = 11.sp) },
                                singleLine = true,
                                placeholder = { Text("Để trống", fontSize = 11.sp) },
                                modifier = Modifier
                                    .weight(0.55f)
                                    .height(52.dp),
                                textStyle = LegadoTheme.typography.bodyMedium.copy(fontSize = 13.sp)
                            )
                        }
                        HorizontalDivider(
                            color = LegadoTheme.colorScheme.outlineVariant.copy(alpha = 0.4f),
                            modifier = Modifier.padding(vertical = 4.dp)
                        )
                    }
                }
                
                Spacer(modifier = Modifier.height(8.dp))
                
                Button(
                    onClick = {
                        val rulesToSave = scannedNames.filter { it.replacement.trim().isNotEmpty() }
                        if (rulesToSave.isNotEmpty()) {
                            coroutineScope.launch(Dispatchers.IO) {
                                val newRules = rulesToSave.mapIndexed { i, item ->
                                    val nameCap = item.originalTranslation.split(" ").joinToString(" ") { it.replaceFirstChar { c -> c.uppercase() } }
                                    val nameLower = item.originalTranslation.lowercase()
                                    val nameFirstCap = item.originalTranslation.lowercase().replaceFirstChar { it.uppercase() }
                                    
                                    val patternList = mutableListOf<String>()
                                    if (item.chinese.isNotEmpty()) {
                                        patternList.add(Regex.escape(item.chinese))
                                    }
                                    patternList.add(Regex.escape(nameCap))
                                    if (nameFirstCap != nameCap) {
                                        patternList.add(Regex.escape(nameFirstCap))
                                    }
                                    if (nameLower != nameFirstCap && nameLower != nameCap) {
                                        patternList.add(Regex.escape(nameLower))
                                    }
                                    
                                    val pattern = patternList.joinToString("|")
                                    
                                    ReplaceRule(
                                        id = System.currentTimeMillis() + i,
                                        name = "Sửa Name: $nameCap",
                                        group = "Quét Name",
                                        pattern = pattern,
                                        replacement = item.replacement.trim(),
                                        isRegex = true,
                                        isEnabled = true,
                                        scope = book.name
                                    )
                                }
                                appDb.replaceRuleDao.insert(*newRules.toTypedArray())
                                
                                withContext(Dispatchers.Main) {
                                    TranslateUtils.clearCache()
                                    ReadBook.curTextChapter = null
                                    onRulesAdded()
                                    onDismissRequest()
                                }
                            }
                        } else {
                            onDismissRequest()
                        }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp, vertical = 8.dp)
                ) {
                    Text("Áp dụng và lưu thay đổi")
                }
            }
        }
    }
}

private data class ScanNameItem(
    val chinese: String,
    val originalTranslation: String,
    val replacement: String
)

private suspend fun scanNamesFromChapters(
    context: Context,
    book: Book,
    chapters: List<BookChapter>,
    onProgress: (scanned: Int, total: Int) -> Unit
): List<Pair<String, String>> = withContext(Dispatchers.Default) {
    // Sơ quét xem có chứa tiếng Trung hay không
    var hasChinese = false
    for (chapter in chapters) {
        val testContent = withContext(Dispatchers.IO) {
            BookHelp.getContent(book, chapter)
        }
        if (!testContent.isNullOrBlank()) {
            if (testContent.any { it.code in 0x4E00..0x9FFF }) {
                hasChinese = true
                break
            }
        }
    }

    if (!hasChinese) {
        // Quét tên tiếng Việt hỗ trợ cả chữ hoa và chữ thường
        val nameSet = mutableSetOf<String>()
        
        chapters.forEachIndexed { index, chapter ->
            val content = withContext(Dispatchers.IO) {
                BookHelp.getContent(book, chapter)
            }
            if (!content.isNullOrBlank()) {
                val sentences = content.split(Regex("(?<=[.!?\\n])\\s+"))
                sentences.forEach { sentence ->
                    val trimmed = sentence.trim()
                    if (trimmed.isEmpty()) return@forEach
                    
                    // Làm sạch dấu câu, chỉ giữ lại chữ cái và khoảng trắng
                    val cleanSentence = trimmed.replace(Regex("[^\\p{L}\\s]"), " ")
                    val words = cleanSentence.split(Regex("\\s+")).filter { it.isNotBlank() }
                    
                    var i = 0
                    while (i < words.size) {
                        var matchedSurname: String? = null
                        var isCompound = false
                        
                        // 1. Kiểm tra họ kép trước
                        if (i + 1 < words.size) {
                            val twoWords = "${words[i]} ${words[i+1]}"
                            if (COMPOUND_SURNAMES.any { it.equals(twoWords, ignoreCase = true) }) {
                                matchedSurname = twoWords
                                isCompound = true
                            }
                        }
                        
                        // 2. Kiểm tra họ đơn
                        if (matchedSurname == null) {
                            val oneWord = words[i]
                            if (COMMON_SURNAMES.any { it.equals(oneWord, ignoreCase = true) }) {
                                matchedSurname = oneWord
                                isCompound = false
                            }
                        }
                        
                        if (matchedSurname != null) {
                            // Trích xuất ứng cử viên tên từ 2 đến 4 từ
                            for (len in 2..4) {
                                if (i + len <= words.size) {
                                    val nameWords = words.subList(i, i + len)
                                    val nameCandidate = nameWords.joinToString(" ")
                                    // Loại bỏ các từ kết thúc bằng địa danh hoặc tổ chức để lọc bớt
                                    val isLocOrOrg = nameCandidate.endsWith("Thành", ignoreCase = true) || 
                                                     nameCandidate.endsWith("Thôn", ignoreCase = true) || 
                                                     nameCandidate.endsWith("Trấn", ignoreCase = true) || 
                                                     nameCandidate.endsWith("Sơn", ignoreCase = true) || 
                                                     nameCandidate.endsWith("Động", ignoreCase = true) || 
                                                     nameCandidate.endsWith("Giang", ignoreCase = true) || 
                                                     nameCandidate.endsWith("Hải", ignoreCase = true) || 
                                                     nameCandidate.endsWith("Cốc", ignoreCase = true) || 
                                                     nameCandidate.endsWith("Điện", ignoreCase = true) ||
                                                     nameCandidate.endsWith("Quốc", ignoreCase = true) || 
                                                     nameCandidate.endsWith("Khư", ignoreCase = true) || 
                                                     nameCandidate.endsWith("Mộ", ignoreCase = true) ||
                                                     nameCandidate.endsWith("Tinh", ignoreCase = true) || 
                                                     nameCandidate.endsWith("Tinh Cầu", ignoreCase = true) || 
                                                     nameCandidate.endsWith("Đại Lục", ignoreCase = true) ||
                                                     nameCandidate.endsWith("Môn", ignoreCase = true) || 
                                                     nameCandidate.endsWith("Phái", ignoreCase = true) || 
                                                     nameCandidate.endsWith("Tông", ignoreCase = true) || 
                                                     nameCandidate.endsWith("Hội", ignoreCase = true) || 
                                                     nameCandidate.endsWith("Gia", ignoreCase = true) || 
                                                     nameCandidate.endsWith("Viện", ignoreCase = true) ||
                                                     nameCandidate.endsWith("Đường", ignoreCase = true) || 
                                                     nameCandidate.endsWith("Các", ignoreCase = true) || 
                                                     nameCandidate.endsWith("Cung", ignoreCase = true) ||
                                                     nameCandidate.endsWith("Lâu", ignoreCase = true) || 
                                                     nameCandidate.endsWith("Liên Minh", ignoreCase = true)
                                                     
                                    if (!isLocOrOrg) {
                                        nameSet.add(nameCandidate)
                                    }
                                }
                            }
                            i += if (isCompound) 2 else 1
                        } else {
                            i++
                        }
                    }
                }
            }
            onProgress(index + 1, chapters.size)
        }
        return@withContext nameSet.map {
            val capitalized = it.split(" ").joinToString(" ") { word -> 
                word.replaceFirstChar { char -> if (char.isLowerCase()) char.titlecase() else char.toString() } 
            }
            Pair(capitalized, capitalized)
        }.sortedBy { it.first }
    }

    // Nếu là tiếng Trung, kiểm tra xem model LAC đã tải và khởi tạo được chưa
    val isModelAvailable = LacAnalyzerHelper.isModelDownloaded(context)
    if (isModelAvailable && LacAnalyzerHelper.init(context)) {
        val data = TranslationLoader.loadTranslationData() ?: return@withContext emptyList()
        val nameSet = mutableSetOf<String>()
        
        chapters.forEachIndexed { index, chapter ->
            val content = withContext(Dispatchers.IO) {
                BookHelp.getContent(book, chapter)
            }
            if (!content.isNullOrBlank()) {
                val tokens = LacAnalyzerHelper.analyze(content)
                for (token in tokens) {
                    // Lọc Tên người (PER/nr), Địa danh (LOC/ns), Tổ chức (ORG/nt)
                    if (token.tag == "PER" || token.tag == "nr" || token.tag == "LOC" || token.tag == "ns" || token.tag == "ORG" || token.tag == "nt") {
                        val word = token.word.trim()
                        if (word.length in 2..4 && word.all { it.code in 0x4E00..0x9FFF }) {
                            nameSet.add(word)
                        }
                    }
                }
            }
            onProgress(index + 1, chapters.size)
        }
        
        val targetMode = if (io.legado.app.ui.config.translation.TranslationConfig.translationTarget == "Hán Việt") "hanviet" else "vi"
        val nameList = ArrayList<Pair<String, String>>()
        for (name in nameSet) {
            val displayTranslation = if (name.any { it.code in 0x4E00..0x9FFF }) {
                io.legado.app.vbookextension.util.QuickTranslateEngine.translate(context, name, targetMode)
            } else {
                name.split(" ").joinToString(" ") { it.replaceFirstChar { char -> if (char.isLowerCase()) char.titlecase() else char.toString() } }
            }
            nameList.add(Pair(name, displayTranslation))
        }
        nameList.filter { item ->
            val nameToCheck = item.second.trim()
            val startsWithCompound = COMPOUND_SURNAMES.any { nameToCheck.startsWith(it, ignoreCase = true) }
            val startsWithSingle = COMMON_SURNAMES.any { surname ->
                nameToCheck.startsWith(surname + " ", ignoreCase = true) || nameToCheck.equals(surname, ignoreCase = true)
            }
            startsWithCompound || startsWithSingle
        }.sortedBy { it.second }
    } else {
        // Fallback quét bằng từ điển có sẵn
        scanNamesByDict(context, book, chapters, onProgress)
    }
}

private suspend fun scanNamesByDict(
    context: Context,
    book: Book,
    chapters: List<BookChapter>,
    onProgress: (scanned: Int, total: Int) -> Unit
): List<Pair<String, String>> = withContext(Dispatchers.Default) {
    val data = TranslationLoader.loadTranslationData() ?: return@withContext emptyList()
    val nameSet = mutableSetOf<String>()
    
    chapters.forEachIndexed { index, chapter ->
        val content = withContext(Dispatchers.IO) {
            BookHelp.getContent(book, chapter)
        }
        if (!content.isNullOrBlank()) {
            val sentences = content.split(Regex("(?<=[。！？\\n])\\s*"))
            sentences.forEach { sentence ->
                val cleanSentence = sentence.trim()
                if (cleanSentence.isEmpty()) return@forEach
                
                val chars = cleanSentence.filter { it.code in 0x4E00..0x9FFF }
                if (chars.length < 2) return@forEach
                
                for (len in 2..4) {
                    for (start in 0..chars.length - len) {
                        val word = chars.substring(start, start + len)
                        var isCommon = false
                        data.vietPhrase.findLongestMatch(word, 0)?.let { (matchLen, value) ->
                            if (matchLen == word.length && value.isNotEmpty() && value.first().isLowerCase()) {
                                isCommon = true
                            }
                        }
                        if (!isCommon) {
                            nameSet.add(word)
                        }
                    }
                }
            }
        }
        onProgress(index + 1, chapters.size)
    }
    
    val targetMode = if (io.legado.app.ui.config.translation.TranslationConfig.translationTarget == "Hán Việt") "hanviet" else "vi"
    val nameList = ArrayList<Pair<String, String>>()
    for (name in nameSet) {
        val displayTranslation = if (name.any { it.code in 0x4E00..0x9FFF }) {
            io.legado.app.vbookextension.util.QuickTranslateEngine.translate(context, name, targetMode)
        } else {
            name.split(" ").joinToString(" ") { it.replaceFirstChar { char -> if (char.isLowerCase()) char.titlecase() else char.toString() } }
        }
        nameList.add(Pair(name, displayTranslation))
    }
    
    nameList.filter { item ->
        val nameToCheck = item.second.trim()
        val startsWithCompound = COMPOUND_SURNAMES.any { nameToCheck.startsWith(it, ignoreCase = true) }
        val startsWithSingle = COMMON_SURNAMES.any { surname ->
            nameToCheck.startsWith(surname + " ", ignoreCase = true) || nameToCheck.equals(surname, ignoreCase = true)
        }
        startsWithCompound || startsWithSingle
    }.sortedBy { it.second }
}

private val COMMON_SURNAMES = setOf(
    "An", "Anh", "Ao", "Ân", "Ẩn", "Âu", "Ất",
    "Ba", "Bạc", "Bạch", "Bàn", "Bao", "Báo", "Bạt", "Băng", "Bì", "Bỉ", "Bính", "Bình", "Bí", "Biện", "Bồ", "Bùi",
    "Ca", "Cáp", "Cát", "Cao", "Càn", "Cầm", "Chử", "Chúc", "Chung", "Chương", "Cố", "Cổ", "Cung", "Cự", "Cơ", "Cảnh", "Cấn", "Cù",
    "Danh", "Diêm", "Diệp", "Doãn", "Dư", "Dương", "Dịch", "Dã",
    "Đàm", "Đào", "Đắc", "Đặc", "Đăng", "Đặng", "Địch", "Đinh", "Điền", "Đoàn", "Đỗ", "Đồng", "Đổng", "Đới", "Đường",
    "Giả", "Giang", "Giao", "Giáp",
    "Hà", "Hạ", "Hác", "Hải", "Hàn", "Hằng", "Hầu", "Hình", "Hy", "Hoa", "Hoài", "Hoàn", "Hoàng", "Huỳnh", "Hồng", "Hộ", "Hứa", "Hùng", "Hướng",
    "Kha", "Khang", "Khâu", "Khương", "Khổng", "Khuất", "Khúc", "Khôi", "Kiều", "Kim", "Kỷ",
    "La", "Lã", "Lại", "Lạc", "Lâm", "Lăng", "Lãnh", "Lê", "Liên", "Liễu", "Lô", "Lộ", "Lục", "Lôi", "Long", "Lư", "Lương", "Lưu", "Lý",
    "Ma", "Mai", "Man", "Mạc", "Mạnh", "Mao", "Mễ", "Miêu", "Minh", "Mông", "Mộ", "Mục", "Mặc",
    "Nam", "Nha", "Nhạc", "Nhan", "Nhâm", "Nhượng", "Niết", "Ninh", "Nông",
    "Ô", "Ôn", "Uất",
    "Phá", "Phán", "Phạm", "Phan", "Phó", "Phù", "Phùng", "Phương", "Phượng",
    "Quản", "Quang", "Quách", "Quân",
    "Sài", "Sách", "Sầm",
    "Tạ", "Tào", "Tăng", "Tân", "Tấn", "Tất", "Tề", "Tiết", "Tiêu", "Tiên", "Tông", "Tần", "Tổ", "Tô", "Tống", "Tơ", "Tư", "Tuyên",
    "Thạch", "Thái", "Thang", "Thanh", "Thành", "Thảo", "Thầm", "Thẩm", "Thân", "Thần", "Thập", "Thế", "Thị", "Thích", "Thiên", "Thiện", "Thiệu", "Thủ", "Thục", "Thương", "Thư", "Thừa", "Thôi", "Thường", "Trang", "Trình", "Trác", "Trì", "Triệu", "Trương", "Trịnh", "Trầm",
    "Uông", "Ung", "Uất", "Uyển",
    "Vạn", "Văn", "Vân", "Vĩ", "Vi", "Vệ", "Viên", "Vưu", "Vũ", "Võ", "Vương",
    "Xa", "Xà", "Xương",
    "Y", "Yên"
)

private val COMPOUND_SURNAMES = setOf(
    "Nam Cung", "Đông Phương", "Độc Cô", "Mộ Dung", "Hoàng Phủ", "Thượng Quan", "Gia Cát", "Tư Mã", "Âu Dương", "Uất Trì", "Tư Đồ"
)

private suspend fun scanNamesWithAi(
    book: Book,
    chapters: List<BookChapter>,
    urlBase: String,
    apiKey: String,
    model: String,
    onProgress: (scanned: Int, total: Int) -> Unit
): List<Pair<String, String>> = withContext(Dispatchers.IO) {
    if (apiKey.isBlank()) {
        throw Exception("API Key không được để trống!")
    }
    
    val chaptersToScan = chapters.take(3)
    val contentBuilder = StringBuilder()
    chaptersToScan.forEachIndexed { idx, ch ->
        val text = BookHelp.getContent(book, ch)
        if (!text.isNullOrBlank()) {
            contentBuilder.append("--- Chương ").append(idx + 1).append(" ---\n")
            contentBuilder.append(text).append("\n")
        }
        onProgress(idx + 1, chaptersToScan.size)
    }
    
    val fullContent = contentBuilder.toString()
    if (fullContent.isBlank()) {
        return@withContext emptyList()
    }
    
    val cleanedUrl = if (urlBase.endsWith("/")) urlBase.substring(0, urlBase.length - 1) else urlBase
    val requestUrl = "$cleanedUrl/chat/completions"
    
    val prompt = "Bạn là trợ lý dịch thuật truyện. Hãy tìm tất cả các tên nhân vật (chỉ tên nhân vật người, không lấy đồ vật, địa danh, môn phái) xuất hiện trong văn bản chương truyện sau. Trả về kết quả là một mảng JSON các đối tượng có thuộc tính 'vietnamese' (tên tiếng Việt dịch chuẩn Hán Việt, viết hoa chữ cái đầu, ví dụ: 'Vương Lâm', 'Lý Mộ Uyển') và 'chinese' (tên tiếng Trung tương ứng nếu có trong truyện hoặc dịch phiên âm gốc tương ứng, ví dụ: '王林', '李慕婉', nếu không tìm thấy hãy để trống ''). Lưu ý: Cực kỳ quan trọng, hãy phân tích toàn bộ văn bản để không bỏ sót bất kỳ tên nhân vật nào. Chỉ trả về nội dung JSON thô (không có ```json hay giải thích nào khác)."
    
    val payload = mapOf(
        "model" to model,
        "messages" to listOf(
            mapOf("role" to "system", "content" to prompt),
            mapOf("role" to "user", "content" to fullContent)
        ),
        "temperature" to 0.2
    )
    
    val jsonPayload = Gson().toJson(payload)
    val request = Request.Builder()
        .url(requestUrl)
        .header("Authorization", "Bearer $apiKey")
        .header("Content-Type", "application/json")
        .post(jsonPayload.toRequestBody("application/json; charset=utf-8".toMediaType()))
        .build()
        
    val response = okHttpClient.newCall(request).execute()
    if (!response.isSuccessful) {
        val errorMsg = response.body.string()
        throw Exception("Lỗi API AI: ${response.code} ${response.message}\n$errorMsg")
    }
    
    val responseBody = response.body.string()
    val responseMap = Gson().fromJson<Map<String, Any>>(responseBody, object : TypeToken<Map<String, Any>>() {}.type)
    val choices = responseMap["choices"] as? List<*> ?: throw Exception("Định dạng phản hồi API không hợp lệ")
    if (choices.isEmpty()) {
        throw Exception("Không tìm thấy kết quả từ AI")
    }
    
    val firstChoice = choices[0] as? Map<*, *> ?: throw Exception("Định dạng phản hồi API không hợp lệ")
    val message = firstChoice["message"] as? Map<*, *> ?: throw Exception("Định dạng phản hồi API không hợp lệ")
    var contentText = message["content"] as? String ?: throw Exception("Nội dung phản hồi từ AI trống")
    
    contentText = contentText.trim()
    if (contentText.startsWith("```")) {
        val lines = contentText.lines()
        val filteredLines = lines.filterIndexed { index, line -> 
            index != 0 && index != lines.lastIndex 
        }
        contentText = filteredLines.joinToString("\n").trim()
    }
    
    val listType = object : TypeToken<List<Map<String, String>>>() {}.type
    val resultsList: List<Map<String, String>> = Gson().fromJson(contentText, listType)
    
    val nameList = ArrayList<Pair<String, String>>()
    resultsList.forEach { item ->
        val vietnamese = item["vietnamese"]?.trim() ?: ""
        val chinese = item["chinese"]?.trim() ?: ""
        
        if (vietnamese.isNotEmpty()) {
            val normalizedName = vietnamese.split(Regex("\\s+"))
                .joinToString(" ") { it.lowercase().replaceFirstChar { c -> c.uppercase() } }
            nameList.add(Pair(chinese, normalizedName))
        }
    }
    
    nameList.sortedBy { it.second }
}


