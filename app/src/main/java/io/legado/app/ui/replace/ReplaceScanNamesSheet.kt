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
        title = "Quét Name: ${book.name}"
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.85f)
                .padding(bottom = 16.dp)
        ) {
            // Chế độ quét & thông tin
            if (scannedNames.isEmpty() && !isScanning) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp, vertical = 8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Chọn chế độ quét",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 12.dp)
                    )
                    
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.clickable { scanMode = 0 }
                        ) {
                            RadioButton(selected = scanMode == 0, onClick = { scanMode = 0 })
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Chương hiện tại")
                        }
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.clickable { scanMode = 1 }
                        ) {
                            RadioButton(selected = scanMode == 1, onClick = { scanMode = 1 })
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Tất cả chương đã tải")
                        }
                    }
                    
                    Spacer(modifier = Modifier.height(24.dp))
                    
                    Row(
                        modifier = Modifier.fillMaxWidth(0.9f),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button(
                            onClick = {
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
                                        val names = scanNamesFromChapters(book, targetChapters) { scanned, total ->
                                            progressText = "Đang quét chương $scanned / $total..."
                                        }
                                        scannedNames = names.map { ScanNameItem(it.first, it.second, "") }
                                    } else {
                                        scannedNames = emptyList()
                                    }
                                    isScanning = false
                                }
                            },
                            modifier = Modifier.weight(1f)
                        ) {
                            Text("Quét thường", maxLines = 1)
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
                                    // Reset chương hiện tại để làm mới giao diện đọc ngay lập tức
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
    book: Book,
    chapters: List<BookChapter>,
    onProgress: (scanned: Int, total: Int) -> Unit
): List<Pair<String, String>> = withContext(Dispatchers.Default) {
    val data = TranslationLoader.loadTranslationData() ?: return@withContext emptyList()
    val nameMap = mutableMapOf<String, String>() // Tiếng Việt -> Tiếng Trung
    
    val chineseLastNames = setOf(
        '张', '張', '王', '李', '刘', '劉', '陈', '陳', '杨', '楊', '赵', '趙', '黄', '黃', '周', '吴', '吳', '徐', 
        '孙', '孫', '胡', '朱', '高', '林', '何', '郭', '马', '馬', '罗', '羅', '梁', '宋', '郑', '鄭', '谢', '謝', 
        '韩', '韓', '唐', '冯', '馮', '于', '董', '萧', '蕭', '程', '曹', '袁', '邓', '鄧', '许', '許', '傅', '沈', 
        '曾', '彭', '吕', '呂', '苏', '蘇', '卢', '盧', '蒋', '蔣', '蔡', '贾', '賈', '丁', '魏', '薛', '叶', '葉', 
        '阎', '閻', '余', '潘', '杜', '戴', '夏', '锺', '鍾', '汪', '田', '任', '姜', '范', '方', '石', '廖', '邹', 
        '鄒', '熊', '金', '陆', '陸', '郝', '孔', '白', '崔', '康', '毛', '邱', '秦', '江', '史', '顾', '顧', '侯', 
        '邵', '孟', '龙', '龍', '万', '萬', '段', '雷', '钱', '錢', '汤', '湯', '尹', '黎', '易', '常', '武', '乔', 
        '喬', '贺', '賀', '赖', '賴', '龚', '龔', '文'
    )
    
    val vietnameseLastNames = setOf(
        "vương", "lý", "lâm", "trần", "tô", "triệu", "diệp", "tiêu", "thạch", "bạch", "tần", "cổ", "la", "lục", 
        "sở", "hạ", "mộ", "nạp", "độc", "hàn", "đường", "tống", "trịnh", "tạ", "phương", "kim", "long", "đông", 
        "tây", "nam", "bắc", "mộ dung", "âu dương", "gia cát", "thượng quan", "nạp lan", "độc cô", "thẩm", "tăng", 
        "bành", "lữ", "lư", "tưởng", "sái", "giả", "đinh", "ngụy", "tiết", "diêm", "dư", "phan", "đỗ", "đái", 
        "uông", "điền", "nhậm", "khương", "phạm", "liêu", "trâu", "hùng", "hác", "khổng", "thôi", "khang", "mao", 
        "khâu", "giang", "sử", "cố", "hầu", "mạnh", "vạn", "đoạn", "lôi", "tiền", "thang", "doãn", "lê", "dịch", 
        "thường", "vũ", "kiều", "lại", "cung", "văn", "út", "lâu", "tiểu", "mạc", "hỉ", "hỷ", "nhan", "bùi", 
        "tư mã", "công dương", "đàm", "tào", "liễu", "phong", "vân", "thích", "hoa", "cảnh", "hạng", "cát", "tích", 
        "mộc", "hoàng", "chu", "ngô", "từ", "tôn", "hồ", "cao", "hà", "quách", "mã", "lương", "phùng", "viên"
    )
    
    val vietnameseCommonWords = setOf(
        "nói", "cười", "đi", "đến", "vào", "ra", "lên", "xuống", "chạy", "nhìn", "nghe", "thấy", "nghĩ", "muốn", 
        "cần", "phải", "được", "bị", "là", "thì", "mà", "ở", "tại", "trong", "ngoài", "trên", "dưới", "của", "cho", 
        "để", "với", "như", "nhưng", "tuy", "vì", "bởi", "nên", "và", "hoặc", "cũng", "đều", "đã", "đang", "sẽ", 
        "rồi", "mới", "vừa", "lại", "qua", "lại", "ra", "vào", "có", "không", "chưa", "chẳng", "không", "này", 
        "kia", "đó", "ấy", "đây", "nào", "gì", "sao", "thế", "vậy", "quá", "rất", "lắm", "hơn", "nhất", "tự", 
        "nhau", "mình", "người", "nhà", "tay", "chân", "mắt", "mũi", "miệng", "đầu", "lưng", "lực", "thần", "sắc", 
        "khí", "tâm", "thế", "đạo", "pháp", "trời", "đất", "sơn", "hải", "gió", "mưa", "lôi", "điện", "hỏa", "thủy",
        "kiếm", "đao", "thương", "tiễn", "phù", "trận", "đan", "dược", "thú", "yêu", "ma", "quỷ", "tiên", "phật",
        "đại", "tiểu", "lão", "trung", "thanh", "bạch", "hắc", "hồng", "tử", "kim", "ngân", "đồng", "thiết", "thạch",
        "bản", "chương", "truyện", "sách", "chữ", "nghĩa", "từ", "câu", "đoạn", "trang", "hàng", "lớp", "bậc", "cấp",
        "châm", "túi", "giáp", "đỉnh", "tháp", "chuông", "kính", "gương", "cung", "bạt", "băng", "hoàn", "dịch",
        "thược", "chìa", "khóa", "dây", "xích", "giấy", "hộp", "rương", "bình", "lọ", "chén", "bát", "quyết", "kinh",
        "điển", "lục", "đồ", "bản", "tại", "nơi", "chỗ", "phương", "hướng", "phía", "bên", "vùng", "miền", "đất"
    )

    chapters.forEachIndexed { index, chapter ->
        val content = withContext(Dispatchers.IO) {
            BookHelp.getContent(book, chapter)
        }
        if (!content.isNullOrBlank()) {
            // 1. Quét chữ Hán tiếng Trung thô (nếu có chữ Hán trong chương)
            val isChinese = content.any { it.code in 0x4E00..0x9FFF }
            if (isChinese) {
                val tokens = TranslateUtils.tokenize(content, data)
                for (token in tokens) {
                    if (token.length in 2..4) {
                        val isKnownName = data.names.findLongestMatch(token, 0)?.let { (len, _) -> len == token.length } ?: false
                        val firstChar = token[0]
                        val isPotentialName = firstChar in chineseLastNames && token.all { it.code in 0x4E00..0x9FFF }
                        
                        if (isKnownName || isPotentialName) {
                            var translation: String? = null
                            data.names.findLongestMatch(token, 0)?.let { (len, value) -> 
                                if (len == token.length) translation = value 
                            }
                            if (translation == null) {
                                data.vietPhrase.findLongestMatch(token, 0)?.let { (len, value) -> 
                                    if (len == token.length) translation = value 
                                }
                            }
                            
                            val displayTranslation = if (translation != null) {
                                if (translation.contains("/")) translation.split("/")[0] else translation
                            } else {
                                token.map { char -> data.chinesePhienAm[char.toString()] ?: char.toString() }
                                    .joinToString(" ") { it.trim().replaceFirstChar { c -> c.uppercase() } }
                            }
                            val cleanTranslation = displayTranslation.trim()
                            val normalizedName = cleanTranslation.split(Regex("\\s+"))
                                .joinToString(" ") { it.lowercase().replaceFirstChar { c -> c.uppercase() } }
                            val lastWord = normalizedName.split(" ").lastOrNull()?.lowercase()
                            
                            if (lastWord != null && vietnameseCommonWords.contains(lastWord)) {
                                continue
                            }
                            if (normalizedName.isNotEmpty()) {
                                nameMap[normalizedName] = token
                            }
                        }
                    }
                }
            }
            
            // 2. Quét văn bản tiếng Việt dịch stv (quét song song cho mọi nội dung)
            val rawWords = content.split(Regex("\\s+")).filter { it.isNotEmpty() }
            var i = 0
            val size = rawWords.size
            while (i < size) {
                val cleanWord = rawWords[i].trim { !it.isLetter() }.lowercase()
                if (vietnameseLastNames.contains(cleanWord)) {
                    val hasPunct = rawWords[i].any { !it.isLetter() }
                    if (!hasPunct) {
                        for (len in 2..3) {
                            if (i + len - 1 < size) {
                                val subList = rawWords.subList(i, i + len)
                                var hasSeparator = false
                                for (j in 0 until subList.size - 1) {
                                    if (subList[j].any { !it.isLetter() }) {
                                        hasSeparator = true
                                        break
                                    }
                                }
                                if (!hasSeparator) {
                                    val cleanWords = subList.map { it.trim { c -> !c.isLetter() } }
                                    val lastClean = cleanWords.last().lowercase()
                                    
                                    val isAllValid = cleanWords.all { it.isNotEmpty() && it.all { c -> c.isLetter() } }
                                            && cleanWords.drop(1).none { vietnameseCommonWords.contains(it.lowercase()) }
                                            
                                    if (isAllValid) {
                                        val nameText = cleanWords.joinToString(" ") { 
                                            it.lowercase().replaceFirstChar { c -> c.uppercase() } 
                                        }
                                        if (!nameMap.containsKey(nameText)) {
                                            nameMap[nameText] = ""
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i++
            }
        }
        onProgress(index + 1, chapters.size)
    }
    
    val nameList = ArrayList<Pair<String, String>>()
    nameMap.forEach { (vietnamese, chinese) ->
        nameList.add(Pair(chinese, vietnamese))
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
    
    // Ghép nội dung tối đa 3 chương để gửi lên AI phân tích
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
