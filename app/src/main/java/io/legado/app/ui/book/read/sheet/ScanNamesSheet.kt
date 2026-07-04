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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import io.legado.app.ui.theme.LegadoTheme
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
import io.legado.app.ui.widget.components.alert.AppAlertDialog
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

    LaunchedEffect(show, state.durChapterIndex, state.curTextChapter) {
        if (show) {
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
        title = "Quét Name chương này (NER Offline)",
        endAction = {
            IconButton(onClick = onDismissRequest) {
                Icon(Icons.Default.Close, contentDescription = "Đóng")
            }
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.6f)
                .padding(bottom = 16.dp)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                if (!isModelDownloaded) {
                    androidx.compose.material3.Surface(
                        color = LegadoTheme.colorScheme.primaryContainer.copy(alpha = 0.3f),
                        modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp, vertical = 8.dp),
                        shape = androidx.compose.foundation.shape.RoundedCornerShape(8.dp)
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = if (isDownloading) "Đang tải mô hình NER: $downloadProgress" else "Chưa tải mô hình NER AI. Đang quét bằng từ điển.",
                                fontSize = 12.sp,
                                color = LegadoTheme.colorScheme.onPrimaryContainer,
                                modifier = Modifier.weight(1f)
                            )
                            if (!isDownloading) {
                                TextButton(
                                    onClick = {
                                        coroutineScope.launch {
                                            val success = LacAnalyzerHelper.downloadAndExtractModel(context)
                                            if (success) {
                                                isModelDownloaded = true
                                            }
                                        }
                                    },
                                    contentPadding = PaddingValues(horizontal = 8.dp, vertical = 4.dp)
                                ) {
                                    Text("Tải AI (3.2MB)", fontSize = 12.sp)
                                }
                            } else {
                                AppCircularProgressIndicator(modifier = Modifier.size(16.dp))
                            }
                        }
                    }
                }

                if (isLoading) {
                    Box(
                        modifier = Modifier.fillMaxSize().weight(1f),
                        contentAlignment = Alignment.Center
                    ) {
                        AppCircularProgressIndicator()
                    }
                } else if (nameList.isEmpty()) {
                    Box(
                        modifier = Modifier.fillMaxSize().weight(1f),
                        contentAlignment = Alignment.Center
                    ) {
                        EmptyMessage(message = "Không phát hiện tên nhân vật/địa danh nào trong chương này.")
                    }
                } else {
                    LazyColumn(
                        modifier = Modifier.fillMaxSize().weight(1f),
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
                                        color = LegadoTheme.colorScheme.onSurface
                                    )
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Text(
                                        text = translation,
                                        fontSize = 14.sp,
                                        color = LegadoTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                                    )
                                }
                                Text(
                                    text = "Sửa",
                                    fontSize = 14.sp,
                                    color = LegadoTheme.colorScheme.primary,
                                    fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding(start = 16.dp)
                                )
                            }
                            HorizontalDivider(
                                color = LegadoTheme.colorScheme.outlineVariant.copy(alpha = 0.5f)
                            )
                        }
                    }
                }
            }
        }
    }

    // Dialog chỉnh sửa nghĩa dịch của Name
    editingNamePair?.let { (chinese, currentTranslation) ->
        var editValue by remember { mutableStateOf(currentTranslation) }
        AppAlertDialog(
            show = true,
            onDismissRequest = { editingNamePair = null },
            title = "Sửa Name: $chinese",
            content = {
                OutlinedTextField(
                    value = editValue,
                    onValueChange = { editValue = it },
                    label = { Text("Nghĩa Việt / Thay thế") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )
            },
            confirmText = "Lưu",
            onConfirm = {
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
            },
            dismissText = "Hủy",
            onDismiss = { editingNamePair = null }
        )
    }
}

private suspend fun scanNamesFromContent(context: Context, rawContent: String): List<Pair<String, String>> = withContext(Dispatchers.Default) {
    if (rawContent.isBlank()) return@withContext emptyList()
    
    val hasChinese = rawContent.any { it.code in 0x4E00..0x9FFF }
    if (!hasChinese) {
        // Quét tên viết hoa tiếng Việt
        val nameSet = mutableSetOf<String>()
        val sentences = rawContent.split(Regex("(?<=[.!?\\n])\\s+"))
        val nameRegex = Regex("""(?U)\b\p{Lu}\p{Ll}*(?:\s+\p{Lu}\p{Ll}*){1,3}\b""")
        
        sentences.forEach { sentence ->
            val trimmed = sentence.trim()
            if (trimmed.isEmpty()) return@forEach
            
            val matches = nameRegex.findAll(trimmed).toList()
            matches.forEachIndexed { index, match ->
                if (index == 0 && match.range.first == 0) {
                    return@forEachIndexed
                }
                val word = match.value.trim()
                val wordCount = word.split(Regex("\\s+")).size
                if (wordCount in 2..4) {
                    nameSet.add(word)
                }
            }
        }
        return@withContext nameSet.map { Pair(it, it) }.sortedBy { it.first }
    }

    // Nếu là tiếng Trung, kiểm tra xem model LAC đã tải và khởi tạo được chưa
    val isModelAvailable = LacAnalyzerHelper.isModelDownloaded(context)
    if (isModelAvailable && LacAnalyzerHelper.init(context)) {
        val data = TranslationLoader.loadTranslationData() ?: return@withContext emptyList()
        val tokens = LacAnalyzerHelper.analyze(rawContent)
        
        val nameSet = mutableSetOf<String>()
        for (token in tokens) {
            // Lọc các tag: PER/nr (Tên người), LOC/ns (Địa danh), ORG/nt (Tổ chức)
            if (token.tag == "PER" || token.tag == "nr" || token.tag == "LOC" || token.tag == "ns" || token.tag == "ORG" || token.tag == "nt") {
                val word = token.word.trim()
                if (word.length in 2..4 && word.all { it.code in 0x4E00..0x9FFF }) {
                    nameSet.add(word)
                }
            }
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
        nameList.sortedBy { it.first }
    } else {
        // Fallback quét bằng từ điển có sẵn
        scanNamesByDict(context, rawContent)
    }
}

private suspend fun scanNamesByDict(context: Context, rawContent: String): List<Pair<String, String>> = withContext(Dispatchers.Default) {
    val data = TranslationLoader.loadTranslationData() ?: return@withContext emptyList()
    val nameSet = mutableSetOf<String>()
    
    val sentences = rawContent.split(Regex("(?<=[。！？\\n])\\s*"))
    sentences.forEach { sentence ->
        val cleanSentence = sentence.trim()
        if (cleanSentence.isEmpty()) return@forEach
        
        // Lấy danh sách chữ Hán liên tiếp
        val chars = cleanSentence.filter { it.code in 0x4E00..0x9FFF }.map { it.toString() }
        if (chars.size < 2) return@forEach
        
        for (len in 2..4) {
            for (start in 0..chars.size - len) {
                val word = chars.subList(start, start + len).joinToString("")
                
                // Kiểm tra xem có phải là từ thông dụng trong VietPhrase không
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
    nameList.sortedBy { it.first }
}
