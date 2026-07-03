package io.legado.app.ui.replace

import android.content.Context
import androidx.annotation.Keep
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
    var aiUrlBase by remember { mutableStateOf("") }
    var aiApiKey by remember { mutableStateOf("") }
    var aiModel by remember { mutableStateOf("") }
    val sharedPrefs: SharedPreferences = remember { appCtx.getSharedPreferences("ai_config", Context.MODE_PRIVATE) }
    
    // NER Model states
    var isModelDownloaded by remember { mutableStateOf(false) }
    var showDownloadModelDialog by remember { mutableStateOf(false) }
    val isDownloading by LacAnalyzerHelper.isDownloading.collectAsState()
    val downloadProgress by LacAnalyzerHelper.downloadProgress.collectAsState()

    val loadAiConfig = {
        aiUrlBase = sharedPrefs.getString("url_base", "https://api.openai.com/v1") ?: "https://api.openai.com/v1"
        aiApiKey = sharedPrefs.getString("api_key", "") ?: ""
        aiModel = sharedPrefs.getString("model", "gpt-4o-mini") ?: "gpt-4o-mini"
    }
    
    val saveAiConfig = { url: String, key: String, modelStr: String ->
        sharedPrefs.edit()
            .putString("url_base", url.trim())
            .putString("api_key", key.trim())
            .putString("model", modelStr.trim())
            .apply()
    }
    
    LaunchedEffect(show) {
        if (show) {
            loadAiConfig()
            isModelDownloaded = LacAnalyzerHelper.isModelDownloaded(context)
        }
    }
    
    if (showAiConfigDialog) {
        var tempUrl by remember { mutableStateOf(aiUrlBase) }
        var tempKey by remember { mutableStateOf(aiApiKey) }
        var tempModel by remember { mutableStateOf(aiModel) }
        
        AppAlertDialog(
            show = showAiConfigDialog,
            title = "Cấu hình API AI",
            content = {
                Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp)) {
                    OutlinedTextField(
                        value = tempUrl,
                        onValueChange = { tempUrl = it },
                        label = { Text("API URL Base") },
                        placeholder = { Text("https://api.openai.com/v1") },
                        modifier = Modifier.fillMaxWidth(),
                        singleLine = true
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    OutlinedTextField(
                        value = tempKey,
                        onValueChange = { tempKey = it },
                        label = { Text("API Key") },
                        placeholder = { Text("Nhập API Key") },
                        modifier = Modifier.fillMaxWidth(),
                        singleLine = true
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    OutlinedTextField(
                        value = tempModel,
                        onValueChange = { tempModel = it },
                        label = { Text("Model") },
                        placeholder = { Text("gpt-4o-mini") },
                        modifier = Modifier.fillMaxWidth(),
                        singleLine = true
                    )
                }
            },
            confirmText = "Lưu",
            onConfirm = {
                saveAiConfig(tempUrl, tempKey, tempModel)
                loadAiConfig()
                showAiConfigDialog = false
            },
            dismissText = "Hủy",
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
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
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
        if (show) {
            AlertDialog(
                onDismissRequest = onDismissRequest,
                title = { Text("Không tìm thấy sách") },
                text = { Text("Bạn cần mở một cuốn sách truyện chữ trước khi sử dụng tính năng quét name này.") },
                confirmButton = {
                    TextButton(onClick = onDismissRequest) { Text("OK") }
                }
            )
        }
        return
    }

    AppModalBottomSheet(
        show = show,
        onDismissRequest = onDismissRequest,
        title = "Bộ công cụ Quét Name"
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
                                val apiKey = sharedPrefs.getString("api_key", "") ?: ""
                                if (apiKey.isBlank()) {
                                    showAiConfigDialog = true
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
                                            val url = sharedPrefs.getString("url_base", "https://api.openai.com/v1") ?: "https://api.openai.com/v1"
                                            val key = sharedPrefs.getString("api_key", "") ?: ""
                                            val model = sharedPrefs.getString("model", "gpt-4o-mini") ?: "gpt-4o-mini"
                                            
                                            val names = scanNamesWithAi(book, targetChapters, url, key, model) { scanned, total ->
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
                                loadAiConfig()
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
                                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f)
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
                                textStyle = MaterialTheme.typography.bodyMedium.copy(fontSize = 13.sp)
                            )
                        }
                        HorizontalDivider(
                            color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f),
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
        // Quét tên viết hoa tiếng Việt
        val nameSet = mutableSetOf<String>()
        val nameRegex = Regex("""(?U)\b\p{Lu}\p{Ll}*(?:\s+\p{Lu}\p{Ll}*){1,3}\b""")
        
        chapters.forEachIndexed { index, chapter ->
            val content = withContext(Dispatchers.IO) {
                BookHelp.getContent(book, chapter)
            }
            if (!content.isNullOrBlank()) {
                val sentences = content.split(Regex("(?<=[.!?\\n])\\s+"))
                sentences.forEach { sentence ->
                    val trimmed = sentence.trim()
                    if (trimmed.isEmpty()) return@forEach
                    
                    val matches = nameRegex.findAll(trimmed).toList()
                    matches.forEachIndexed { i, match ->
                        if (i == 0 && match.range.first == 0) {
                            return@forEachIndexed
                        }
                        val word = match.value.trim()
                        val wordCount = word.split(Regex("\\s+")).size
                        if (wordCount in 2..4) {
                            nameSet.add(word)
                        }
                    }
                }
            }
            onProgress(index + 1, chapters.size)
        }
        return@withContext nameSet.map { Pair(it, it) }.sortedBy { it.first }
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
                name
            }
            nameList.add(Pair(name, displayTranslation))
        }
        nameList.sortedBy { it.second }
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
                
                val chars = cleanSentence.filter { it.code in 0x4E00..0x9FFF }.map { it.toString() }
                if (chars.size < 2) return@forEach
                
                for (len in 2..4) {
                    for (start in 0..chars.size - len) {
                        val word = chars.subList(start, start + len).joinToString("")
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
            name
        }
        nameList.add(Pair(name, displayTranslation))
    }
    
    nameList.sortedBy { it.second }
}

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
