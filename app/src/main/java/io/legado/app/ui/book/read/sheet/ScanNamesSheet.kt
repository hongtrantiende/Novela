package io.legado.app.ui.book.read.sheet

import android.content.Context
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.legado.app.data.entities.Book
import io.legado.app.data.entities.BookChapter
import io.legado.app.help.book.BookHelp
import io.legado.app.help.LacAnalyzerHelper
import io.legado.app.model.ReadBook
import io.legado.app.model.TranslationLoader
import io.legado.app.ui.book.read.ReadBookIntent
import io.legado.app.ui.book.read.ReadBookUiState
import io.legado.app.ui.widget.components.EmptyMessage
import io.legado.app.ui.widget.components.modalBottomSheet.AppModalBottomSheet
import io.legado.app.ui.widget.components.progressIndicator.AppCircularProgressIndicator
import io.legado.app.ui.widget.components.text.AppText
import io.legado.app.utils.DictManager
import io.legado.app.utils.TranslateUtils
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@Composable
fun ScanNamesSheet(
    show: Boolean,
    selectedText: String?,
    state: ReadBookUiState,
    onIntent: (ReadBookIntent) -> Unit,
    onDismissRequest: () -> Unit
) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    
    var isModelDownloaded by remember { mutableStateOf(false) }
    var isLoading by remember { mutableStateOf(false) }
    var nameList by remember { mutableStateOf<List<Pair<String, String>>>(emptyList()) }
    var editingNamePair by remember { mutableStateOf<Pair<String, String>?>(null) }

    // Download state flows
    val isDownloading by LacAnalyzerHelper.isDownloading.collectAsState()
    val downloadProgress by LacAnalyzerHelper.downloadProgress.collectAsState()

    LaunchedEffect(show) {
        if (show) {
            isModelDownloaded = LacAnalyzerHelper.isModelDownloaded(context)
        }
    }

    LaunchedEffect(show, isModelDownloaded, state.durChapterIndex, state.curTextChapter) {
        if (show && isModelDownloaded) {
            isLoading = true
            coroutineScope.launch {
                val textToScan = selectedText
                if (!textToScan.isNullOrBlank()) {
                    nameList = scanNamesFromContent(context, textToScan)
                } else {
                    val book = state.book
                    val chapter = state.curTextChapter?.chapter
                    if (book != null && chapter != null) {
                        val rawContent = withContext(Dispatchers.IO) {
                            BookHelp.getContent(book, chapter)
                        }
                        if (!rawContent.isNullOrBlank()) {
                            nameList = scanNamesFromContent(context, rawContent)
                        } else {
                            nameList = emptyList()
                        }
                    } else {
                        nameList = emptyList()
                    }
                }
                isLoading = false
            }
        }
    }

    AppModalBottomSheet(
        show = show,
        onDismissRequest = onDismissRequest,
        title = "Quét Name chương này (NER Offline)"
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.6f)
                .padding(bottom = 16.dp)
        ) {
            if (!isModelDownloaded) {
                // UI gợi ý tải model NER
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Tính năng quét Name offline sử dụng mô hình trí tuệ nhân tạo Baidu LAC để phân tích chính xác tên nhân vật, địa danh tiếng Trung.",
                        fontSize = 14.sp,
                        textAlign = TextAlign.Center,
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f),
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                    
                    if (isDownloading) {
                        AppCircularProgressIndicator()
                        Spacer(modifier = Modifier.height(12.dp))
                        Text(
                            text = downloadProgress,
                            fontSize = 14.sp,
                            color = MaterialTheme.colorScheme.primary,
                            fontWeight = FontWeight.Medium
                        )
                    } else {
                        Button(
                            onClick = {
                                coroutineScope.launch {
                                    val success = LacAnalyzerHelper.downloadAndExtractModel(context)
                                    if (success) {
                                        isModelDownloaded = true
                                    }
                                }
                            }
                        ) {
                            Text("Tải mô hình phân tích NER (3.2 MB)")
                        }
                    }
                }
            } else if (isLoading) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    AppCircularProgressIndicator()
                }
            } else if (nameList.isEmpty()) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    EmptyMessage(message = "Không phát hiện tên nhân vật/địa danh nào trong chương này.")
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(horizontal = 20.dp, vertical = 8.dp)
                ) {
                    items(nameList) { (chinese, translation) ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable { editingNamePair = Pair(chinese, translation) }
                                .padding(vertical = 12.dp, horizontal = 8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = chinese,
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(
                                    text = translation,
                                    fontSize = 14.sp,
                                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                                )
                            }
                            Text(
                                text = "Sửa",
                                fontSize = 14.sp,
                                color = MaterialTheme.colorScheme.primary,
                                fontWeight = FontWeight.Medium,
                                modifier = Modifier.padding(start = 16.dp)
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

    // Dialog chỉnh sửa nghĩa dịch của Name
    editingNamePair?.let { (chinese, currentTranslation) ->
        var editValue by remember { mutableStateOf(currentTranslation) }
        AlertDialog(
            onDismissRequest = { editingNamePair = null },
            title = { Text(text = "Sửa Name: $chinese") },
            text = {
                OutlinedTextField(
                    value = editValue,
                    onValueChange = { editValue = it },
                    label = { Text("Nghĩa Việt / Thay thế") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        val finalValue = editValue.trim()
                        if (finalValue.isNotEmpty()) {
                            coroutineScope.launch {
                                DictManager.addOrUpdateCustomName(chinese, finalValue)
                                // Cập nhật lại danh sách hiển thị
                                nameList = nameList.map {
                                    if (it.first == chinese) Pair(chinese, finalValue) else it
                                }
                                // Tải lại chương truyện để dịch lại màn hình đọc
                                onIntent(ReadBookIntent.RefreshCurrentChapter)
                            }
                        }
                        editingNamePair = null
                    }
                ) {
                    Text("Lưu")
                }
            },
            dismissButton = {
                TextButton(onClick = { editingNamePair = null }) {
                    Text("Hủy")
                }
            }
        )
    }
}

private suspend fun scanNamesFromContent(context: Context, rawContent: String): List<Pair<String, String>> = withContext(Dispatchers.Default) {
    if (!LacAnalyzerHelper.init(context)) return@withContext emptyList()
    
    val data = TranslationLoader.loadTranslationData() ?: return@withContext emptyList()
    val tokens = LacAnalyzerHelper.analyze(rawContent)
    
    val nameSet = mutableSetOf<String>()
    
    for (token in tokens) {
        // Lọc các tag: PER (Tên người), LOC (Địa danh), ORG (Tổ chức)
        if (token.tag == "PER" || token.tag == "LOC" || token.tag == "ORG") {
            val word = token.word.trim()
            // Chỉ lấy từ 2 đến 4 ký tự tiếng Trung thuần
            if (word.length in 2..4 && word.all { it.code in 0x4E00..0x9FFF }) {
                nameSet.add(word)
            }
        }
    }
    
    val nameList = ArrayList<Pair<String, String>>()
    for (name in nameSet) {
        var translation: String? = null
        data.names.findLongestMatch(name, 0)?.let { (len, value) -> 
            if (len == name.length) translation = value 
        }
        if (translation == null) {
            data.vietPhrase.findLongestMatch(name, 0)?.let { (len, value) -> 
                if (len == name.length) translation = value 
            }
        }
        
        val displayTranslation = if (translation != null) {
            if (translation.contains("/")) translation.split("/")[0] else translation
        } else {
            name.map { char -> data.chinesePhienAm[char.toString()] ?: char.toString() }
                .joinToString(" ") { it.trim().replaceFirstChar { c -> c.uppercase() } }
        }
        
        nameList.add(Pair(name, displayTranslation))
    }
    
    nameList.sortedBy { it.first }
}
