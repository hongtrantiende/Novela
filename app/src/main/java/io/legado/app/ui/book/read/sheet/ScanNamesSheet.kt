package io.legado.app.ui.book.read.sheet

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.legado.app.data.entities.Book
import io.legado.app.data.entities.BookChapter
import io.legado.app.help.book.BookHelp
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
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@Composable
fun ScanNamesSheet(
    show: Boolean,
    state: ReadBookUiState,
    onIntent: (ReadBookIntent) -> Unit,
    onDismissRequest: () -> Unit
) {
    val coroutineScope = rememberCoroutineScope()
    var isLoading by remember { mutableStateOf(false) }
    var nameList by remember { mutableStateOf<List<Pair<String, String>>>(emptyList()) }
    var editingNamePair by remember { mutableStateOf<Pair<String, String>?>(null) }

    LaunchedEffect(show, state.durChapterIndex, state.curTextChapter) {
        if (show) {
            isLoading = true
            coroutineScope.launch {
                val book = state.book
                val chapter = state.curTextChapter?.chapter
                if (book != null && chapter != null) {
                    val rawContent = withContext(Dispatchers.IO) {
                        BookHelp.getContent(book, chapter)
                    }
                    if (!rawContent.isNullOrBlank()) {
                        nameList = scanNamesFromContent(rawContent)
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
        title = "Quét Name chương này"
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.6f)
                .padding(bottom = 16.dp)
        ) {
            if (isLoading) {
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
                    EmptyMessage(message = "Không phát hiện Name tiếng Trung nào trong chương này.")
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

private suspend fun scanNamesFromContent(rawContent: String): List<Pair<String, String>> = withContext(Dispatchers.Default) {
    val data = TranslationLoader.loadTranslationData() ?: return@withContext emptyList()
    val tokens = TranslateUtils.tokenize(rawContent, data)
    val nameSet = mutableSetOf<String>()
    
    val chineseLastNames = setOf(
        '张', '王', '李', '刘', '陈', '杨', '赵', '黄', '周', '吴', '徐', '孙', '胡', '朱', '高', '林', '何', '郭', '马', 
        '罗', '梁', '宋', '郑', '谢', '韩', '唐', '冯', '于', '董', '萧', '程', '曹', '袁', '邓', '许', '傅', '沈', '曾', 
        '彭', '吕', '苏', '卢', '蒋', '蔡', '贾', '丁', '魏', '薛', '叶', '阎', '余', '潘', '杜', '戴', '夏', '锺', '汪', 
        '田', '任', '姜', '范', '方', '石', '廖', '邹', '熊', '金', '陆', '郝', '孔', '白', '崔', '康', '毛', '邱', '秦', 
        '江', '史', '顾', '侯', '邵', '孟', '龙', '万', '段', '雷', '钱', '汤', '尹', '黎', '易', '常', '武', '乔', '贺', 
        '赖', '龚', '文'
    )
    
    for (token in tokens) {
        if (token.length in 2..4) {
            val isKnownName = data.names.findLongestMatch(token, 0)?.let { (len, _) -> len == token.length } ?: false
            if (isKnownName) {
                nameSet.add(token)
                continue
            }
            
            val firstChar = token[0]
            if (firstChar in chineseLastNames) {
                val isAllChinese = token.all { it.code in 0x4E00..0x9FFF }
                if (isAllChinese) {
                    nameSet.add(token)
                }
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
