package io.legado.app.ui.book.read.sheet

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.legado.app.data.appDb
import io.legado.app.data.entities.BookChapter
import io.legado.app.help.book.BookHelp
import io.legado.app.help.LacAnalyzerHelper
import io.legado.app.ui.book.read.ReadBookUiState
import io.legado.app.ui.widget.components.modalBottomSheet.AppModalBottomSheet
import io.legado.app.ui.widget.components.progressIndicator.AppCircularProgressIndicator
import io.legado.app.ui.widget.components.text.AppText
import io.legado.app.ui.widget.components.alert.AppAlertDialog
import io.legado.app.ui.widget.components.card.GlassCard
import io.legado.app.utils.QuickTranslateDictHelper
import io.legado.app.utils.TranslateUtils
import io.legado.app.utils.MD5Utils
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NerAnalyzeSheet(
    show: Boolean,
    state: ReadBookUiState,
    onDismissRequest: () -> Unit
) {
    if (!show) return

    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    // Config states
    val currentChapNum = (state.durChapterIndex + 1).toString()
    var chapterRange by remember { mutableStateOf(currentChapNum) }
    var wordLenRange by remember { mutableStateOf("2-4") }
    var minFrequency by remember { mutableStateOf("2") }

    // Tag selections
    var selectPer by remember { mutableStateOf(true) }
    var selectLoc by remember { mutableStateOf(false) }
    var selectOrg by remember { mutableStateOf(false) }

    var selectLac by remember { mutableStateOf(true) }
    var selectTexsmart by remember { mutableStateOf(false) }
    var selectIbm by remember { mutableStateOf(false) }

    // Quét states
    var scanStatus by remember { mutableStateOf("") }
    var isScanning by remember { mutableStateOf(false) }
    var scanResult by remember { mutableStateOf<List<NerResultItem>>(emptyList()) }

    // Dialog state for adding word to dict
    var wordToSave by remember { mutableStateOf<NerResultItem?>(null) }
    var selectedDictType by remember { mutableStateOf("Từ điển riêng (Name)") }
    var translationValue by remember { mutableStateOf("") }

    // MD5 Key cho từ điển riêng
    val bookKey = remember(state.book) {
        state.book?.let { MD5Utils.md5Encode16(it.bookUrl) } ?: "default"
    }

    AppModalBottomSheet(
        show = show,
        onDismissRequest = onDismissRequest
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.9f)
                .navigationBarsPadding()
        ) {
            // Header
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                AppText(
                    text = "Phân tích NER",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(1f)
                )
                IconButton(onClick = onDismissRequest) {
                    Icon(Icons.Default.Close, contentDescription = "Đóng")
                }
            }

            // Body content area (LazyColumn list of items or status message)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(horizontal = 16.dp)
            ) {
                if (isScanning) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        AppCircularProgressIndicator()
                        Spacer(modifier = Modifier.height(16.dp))
                        AppText(
                            text = scanStatus,
                            fontSize = 14.sp,
                            textAlign = TextAlign.Center,
                            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.8f)
                        )
                    }
                } else if (scanResult.isEmpty()) {
                    // Màn hình sẵn sàng (giống ảnh 2)
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(24.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.3f),
                            modifier = Modifier.size(64.dp)
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        AppText(
                            text = "Sẵn sàng phân tích NER",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        AppText(
                            text = "Chọn phạm vi chương, số từ và công cụ rồi bắt đầu phân tích.",
                            fontSize = 12.sp,
                            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f),
                            textAlign = TextAlign.Center
                        )
                    }
                } else {
                    // Hiển thị danh sách kết quả quét
                    LazyColumn(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        items(scanResult) { item ->
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable {
                                        wordToSave = item
                                        translationValue = item.trans
                                    }
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(vertical = 12.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Column(modifier = Modifier.weight(1f)) {
                                        AppText(
                                            text = item.word,
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.Bold
                                        )
                                        Spacer(modifier = Modifier.height(2.dp))
                                        AppText(
                                            text = "${item.tag} - Hán Việt: ${item.trans}",
                                            fontSize = 13.sp,
                                            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                                        )
                                    }
                                    AppText(
                                        text = "${item.count} lần",
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.SemiBold,
                                        color = MaterialTheme.colorScheme.primary
                                    )
                                }
                                HorizontalDivider(
                                    color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f)
                                )
                            }
                        }
                    }
                }
            }

            // bottom configurations (Bottom panel)
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.4f)
                )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp)
                ) {
                    // Row 1: Inputs
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        OutlinedTextField(
                            value = chapterRange,
                            onValueChange = { chapterRange = it },
                            label = { Text("Số chương") },
                            modifier = Modifier.weight(1.2f),
                            singleLine = true,
                            shape = RoundedCornerShape(8.dp)
                        )
                        OutlinedTextField(
                            value = wordLenRange,
                            onValueChange = { wordLenRange = it },
                            label = { Text("Số từ") },
                            modifier = Modifier.weight(0.9f),
                            singleLine = true,
                            shape = RoundedCornerShape(8.dp)
                        )
                        OutlinedTextField(
                            value = minFrequency,
                            onValueChange = { minFrequency = it },
                            label = { Text("Tần suất") },
                            modifier = Modifier.weight(0.9f),
                            singleLine = true,
                            shape = RoundedCornerShape(8.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    // Row 2: Loại
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        AppText(
                            text = "Loại",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.width(60.dp)
                        )
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            SelectableTagButton(
                                text = "Nhân danh",
                                isSelected = selectPer,
                                onClick = { selectPer = !selectPer }
                            )
                            SelectableTagButton(
                                text = "Địa danh",
                                isSelected = selectLoc,
                                onClick = { selectLoc = !selectLoc }
                            )
                            SelectableTagButton(
                                text = "Tổ chức",
                                isSelected = selectOrg,
                                onClick = { selectOrg = !selectOrg }
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    // Row 3: Công cụ
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        AppText(
                            text = "Công cụ",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.width(60.dp)
                        )
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            SelectableTagButton(
                                text = "LAC (Off)",
                                isSelected = selectLac,
                                onClick = { selectLac = !selectLac }
                            )
                            SelectableTagButton(
                                text = "Texsmart (On)",
                                isSelected = selectTexsmart,
                                onClick = {
                                    selectTexsmart = !selectTexsmart
                                    if (selectTexsmart) {
                                        Toast.makeText(context, "Chế độ offline chỉ hỗ trợ LAC", Toast.LENGTH_SHORT).show()
                                        selectTexsmart = false
                                    }
                                }
                            )
                            SelectableTagButton(
                                text = "IBM (On)",
                                isSelected = selectIbm,
                                onClick = {
                                    selectIbm = !selectIbm
                                    if (selectIbm) {
                                        Toast.makeText(context, "Chế độ offline chỉ hỗ trợ LAC", Toast.LENGTH_SHORT).show()
                                        selectIbm = false
                                    }
                                }
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    // Row 4: Action button
                    Button(
                        onClick = {
                            if (!selectPer && !selectLoc && !selectOrg) {
                                Toast.makeText(context, "Hãy chọn ít nhất một Loại phân tích", Toast.LENGTH_SHORT).show()
                                return@Button
                            }
                            if (!selectLac) {
                                Toast.makeText(context, "Hãy bật công cụ LAC", Toast.LENGTH_SHORT).show()
                                return@Button
                            }
                            isScanning = true
                            scanResult = emptyList()
                            scope.launch(Dispatchers.IO) {
                                performNerAnalyze(
                                    context = context,
                                    chapterRangeStr = chapterRange,
                                    wordLenRangeStr = wordLenRange,
                                    minFreqStr = minFrequency,
                                    selectPer = selectPer,
                                    selectLoc = selectLoc,
                                    selectOrg = selectOrg,
                                    state = state,
                                    onStatusChange = { scanStatus = it },
                                    onComplete = { result ->
                                        scanResult = result
                                        isScanning = false
                                        if (result.isEmpty()) {
                                            scanStatus = "Không tìm thấy thực thể nào khớp"
                                        }
                                    }
                                )
                            }
                        },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = MaterialTheme.colorScheme.primary
                        )
                    ) {
                        Icon(Icons.Default.Search, contentDescription = null)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("Tìm kiếm", fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }

    // Dialog for adding name directly to Dict
    if (wordToSave != null) {
        val dictOptions = listOf(
            "Từ điển riêng (Name)",
            "Từ điển riêng (VietPhrase)",
            "Từ điển chung (Name)",
            "Từ điển chung (VietPhrase)"
        )
        AppAlertDialog(
            show = true,
            onDismissRequest = { wordToSave = null },
            title = "Lưu từ vào từ điển",
            content = {
                Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp)) {
                    AppText(text = "Từ gốc: ${wordToSave!!.word}", fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.height(12.dp))
                    OutlinedTextField(
                        value = translationValue,
                        onValueChange = { translationValue = it },
                        label = { Text("Bản dịch") },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    AppText(text = "Lưu vào từ điển:", fontSize = 12.sp, color = MaterialTheme.colorScheme.primary)
                    Spacer(modifier = Modifier.height(4.dp))
                    
                    // Simple Dropdown-like Selector
                    var expanded by remember { mutableStateOf(false) }
                    Box(modifier = Modifier.fillMaxWidth()) {
                        OutlinedButton(
                            onClick = { expanded = true },
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(selectedDictType)
                        }
                        DropdownMenu(
                            expanded = expanded,
                            onDismissRequest = { expanded = false },
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            dictOptions.forEach { opt ->
                                DropdownMenuItem(
                                    text = { Text(opt) },
                                    onClick = {
                                        selectedDictType = opt
                                        expanded = false
                                    }
                                )
                            }
                        }
                    }
                }
            },
            confirmText = "Lưu lại",
            onConfirm = {
                if (translationValue.isNotBlank()) {
                    scope.launch(Dispatchers.IO) {
                        val fileName = when (selectedDictType) {
                            "Từ điển riêng (Name)" -> "book/book_${bookKey}_name.txt"
                            "Từ điển riêng (VietPhrase)" -> "book/book_${bookKey}_vp.txt"
                            "Từ điển chung (Name)" -> "Name.txt"
                            else -> "VietPhrase.txt"
                        }
                        QuickTranslateDictHelper.addOrUpdateEntry(
                            context,
                            fileName,
                            wordToSave!!.word.trim(),
                            translationValue.trim()
                        )
                        withContext(Dispatchers.Main) {
                            Toast.makeText(context, "Lưu từ thành công", Toast.LENGTH_SHORT).show()
                            wordToSave = null
                        }
                    }
                }
            },
            dismissText = "Hủy",
            onDismiss = { wordToSave = null }
        )
    }
}

@Composable
fun SelectableTagButton(
    text: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    Surface(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .clickable(onClick = onClick),
        color = if (isSelected) MaterialTheme.colorScheme.primaryContainer else MaterialTheme.colorScheme.surface,
        border = if (isSelected) null else BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f))
    ) {
        AppText(
            text = text,
            fontSize = 12.sp,
            color = if (isSelected) MaterialTheme.colorScheme.onPrimaryContainer else MaterialTheme.colorScheme.onSurface,
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
        )
    }
}

data class NerResultItem(
    val word: String,
    val tag: String,
    val trans: String,
    val count: Int
)

// Thực hiện quét NER trên dải chương
private suspend fun performNerAnalyze(
    context: Context,
    chapterRangeStr: String,
    wordLenRangeStr: String,
    minFreqStr: String,
    selectPer: Boolean,
    selectLoc: Boolean,
    selectOrg: Boolean,
    state: ReadBookUiState,
    onStatusChange: (String) -> Unit,
    onComplete: (List<NerResultItem>) -> Unit
) {
    val book = state.book
    if (book == null) {
        onComplete(emptyList())
        return
    }

    onStatusChange("Đang đọc danh sách chương...")
    val chapters = withContext(Dispatchers.IO) {
        appDb.bookChapterDao.getChapterList(book.bookUrl)
    }

    // 1. Phân tích dải chương
    val targetChapterIndexes = mutableListOf<Int>()
    val cleanRange = chapterRangeStr.trim()
    try {
        if (cleanRange.contains("-")) {
            val parts = cleanRange.split("-")
            val start = parts[0].trim().toInt() - 1
            val end = parts[1].trim().toInt() - 1
            for (idx in start..end) {
                if (idx in chapters.indices) {
                    targetChapterIndexes.add(idx)
                }
            }
        } else {
            val idx = cleanRange.toInt() - 1
            if (idx in chapters.indices) {
                targetChapterIndexes.add(idx)
            }
        }
    } catch (e: Exception) {
        // Fallback chương hiện tại
        targetChapterIndexes.add(state.durChapterIndex)
    }

    if (targetChapterIndexes.isEmpty()) {
        onComplete(emptyList())
        return
    }

    // 2. Phân tích dải số từ (độ dài)
    var minLen = 2
    var maxLen = 4
    try {
        if (wordLenRangeStr.contains("-")) {
            val parts = wordLenRangeStr.split("-")
            minLen = parts[0].trim().toInt()
            maxLen = parts[1].trim().toInt()
        } else {
            minLen = wordLenRangeStr.trim().toInt()
            maxLen = minLen
        }
    } catch (_: Exception) {}

    // 3. Tần suất tối thiểu
    val minFreq = minFreqStr.trim().toIntOrNull() ?: 2

    // 4. Kiểm tra nạp Model
    onStatusChange("Đang kiểm tra mô hình NER...")
    if (!LacAnalyzerHelper.isModelDownloaded(context)) {
        onStatusChange("Đang tải xuống mô hình (3.2 MB)...")
        val downloadSuccess = LacAnalyzerHelper.downloadAndExtractModel(context)
        if (!downloadSuccess) {
            onStatusChange("Lỗi tải xuống mô hình.")
            onComplete(emptyList())
            return
        }
    }

    onStatusChange("Đang khởi tạo bộ phân tích LAC...")
    var initSuccess = false
    try {
        initSuccess = LacAnalyzerHelper.init(context)
    } catch (e: Exception) {
        e.printStackTrace()
    }

    if (!initSuccess) {
        onStatusChange("Lỗi khởi tạo thư viện JNI LAC")
        onComplete(emptyList())
        return
    }

    // 5. Đọc text từ các chương và phân tích
    val frequencyMap = HashMap<String, Pair<String, Int>>() // key: word, value: Pair(tag, count)
    var loadedChaps = 0

    try {
        targetChapterIndexes.forEachIndexed { i, idx ->
            onStatusChange("Đang quét chương ${idx + 1}... (${i + 1}/${targetChapterIndexes.size})")
            val content = BookHelp.getContent(book, chapters[idx])
            if (!content.isNullOrBlank()) {
                loadedChaps++
                // Chia nhỏ chương thành các câu ngắn để mô hình LAC phân tích chính xác nhất
                val sentences = content.split('\n', '。', '？', '！', '，', '、', ',', ';')
                sentences.forEach { sentence ->
                    val cleanSentence = sentence.trim()
                    if (cleanSentence.length >= minLen) {
                        // Cắt thành các chuỗi tối đa 100 ký tự để an toàn bộ nhớ JNI LAC
                        val chunks = cleanSentence.chunked(100)
                        chunks.forEach { chunk ->
                            val tokens = LacAnalyzerHelper.analyze(chunk)
                            tokens.forEach { token ->
                                val tag = token.tag
                                val word = token.word
                                
                                // Lọc theo tag được chọn
                                val isTagMatch = (selectPer && tag == "PER") ||
                                        (selectLoc && tag == "LOC") ||
                                        (selectOrg && tag == "ORG")
                                
                                // Lọc theo độ dài tiếng Trung
                                val isLenMatch = word.length in minLen..maxLen
                                
                                if (isTagMatch && isLenMatch) {
                                    val current = frequencyMap[word]
                                    if (current != null) {
                                        frequencyMap[word] = Pair(tag, current.second + 1)
                                    } else {
                                        frequencyMap[word] = Pair(tag, 1)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    } catch (e: Exception) {
        e.printStackTrace()
    } finally {
        LacAnalyzerHelper.destroy()
    }

    if (loadedChaps == 0) {
        onStatusChange("Không có nội dung chương nào được tải xuống (offline).")
        onComplete(emptyList())
        return
    }

    // 7. Sắp xếp kết quả và dịch Hán Việt tạm thời
    onStatusChange("Đang hoàn thành danh sách bản dịch...")
    val result = frequencyMap.entries
        .filter { it.value.second >= minFreq }
        .map { entry ->
            val word = entry.key
            val tag = when (entry.value.first) {
                "PER" -> "Nhân danh"
                "LOC" -> "Địa danh"
                "ORG" -> "Tổ chức"
                else -> entry.value.first
            }
            // Dịch Hán Việt tạm thời
            val trans = TranslateUtils.translatePhienAm(word)
            NerResultItem(
                word = word,
                tag = tag,
                trans = trans,
                count = entry.value.second
            )
        }
        .sortedByDescending { it.count }

    onComplete(result)
}
