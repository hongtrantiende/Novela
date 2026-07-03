package io.legado.app.ui.book.read.sheet

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
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
import io.legado.app.ui.book.read.ReadBookUiState
import io.legado.app.ui.widget.components.modalBottomSheet.AppModalBottomSheet
import io.legado.app.ui.widget.components.text.AppText
import io.legado.app.ui.widget.components.card.GlassCard
import io.legado.app.ui.widget.components.alert.AppAlertDialog
import io.legado.app.utils.QuickTranslateDictHelper
import io.legado.app.vbookextension.util.QuickTranslateEngine
import io.legado.app.utils.MD5Utils
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.File

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun DictManagerSheet(
    show: Boolean,
    state: ReadBookUiState,
    onDismissRequest: () -> Unit
) {
    if (!show) return

    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    val bookKey = remember(state.book) {
        state.book?.let { MD5Utils.md5Encode16(it.bookUrl) } ?: "default"
    }

    // Tên file của từ điển riêng và chung
    val privateNameFile = "book/book_${bookKey}_name.txt"
    val privateVpFile = "book/book_${bookKey}_vp.txt"
    val publicNameFile = "Name.txt"
    val publicVpFile = "VietPhrase.txt"

    // Đếm số từ
    var privateNameWordCount by remember { mutableStateOf("0 từ") }
    var privateVpWordCount by remember { mutableStateOf("0 từ") }
    var publicNameWordCount by remember { mutableStateOf("0 từ") }
    var publicVpWordCount by remember { mutableStateOf("0 từ") }

    var refreshTrigger by remember { mutableStateOf(0) }

    // Load số từ động
    LaunchedEffect(refreshTrigger, state.book) {
        withContext(Dispatchers.IO) {
            privateNameWordCount = "${QuickTranslateEngine.getWordCount(context, privateNameFile)} từ"
            privateVpWordCount = "${QuickTranslateEngine.getWordCount(context, privateVpFile)} từ"
            publicNameWordCount = "${QuickTranslateEngine.getWordCount(context, publicNameFile)} từ"
            publicVpWordCount = "${QuickTranslateEngine.getWordCount(context, publicVpFile)} từ"
        }
    }

    // Quản lý trạng thái đang sửa từ điển nào
    var editingDictFile by remember { mutableStateOf<String?>(null) }
    var editingDictTitle by remember { mutableStateOf("") }

    AppModalBottomSheet(
        show = show,
        onDismissRequest = {
            if (editingDictFile != null) {
                editingDictFile = null
            } else {
                onDismissRequest()
            }
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.9f)
                .navigationBarsPadding()
        ) {
            if (editingDictFile == null) {
                // Màn hình chính: Danh sách 4 từ điển (giống ảnh 1)
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    // Header
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        AppText(
                            text = "Quản lý từ điển",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.weight(1f)
                        )
                        IconButton(onClick = onDismissRequest) {
                            Icon(Icons.Default.Close, contentDescription = "Đóng")
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    // Phần 1: Từ điển riêng
                    AppText(
                        text = "Từ điển riêng",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )

                    DictCard(
                        title = "Name",
                        wordCount = privateNameWordCount,
                        onClick = {
                            editingDictFile = privateNameFile
                            editingDictTitle = "Từ điển riêng - Name"
                        }
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    DictCard(
                        title = "VietPhrase",
                        wordCount = privateVpWordCount,
                        onClick = {
                            editingDictFile = privateVpFile
                            editingDictTitle = "Từ điển riêng - VietPhrase"
                        }
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    // Phần 2: Từ điển chung
                    AppText(
                        text = "Từ điển chung",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )

                    DictCard(
                        title = "Name",
                        wordCount = publicNameWordCount,
                        onClick = {
                            editingDictFile = publicNameFile
                            editingDictTitle = "Từ điển chung - Name"
                        }
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    DictCard(
                        title = "VietPhrase",
                        wordCount = publicVpWordCount,
                        onClick = {
                            editingDictFile = publicVpFile
                            editingDictTitle = "Từ điển chung - VietPhrase"
                        }
                    )
                }
            } else {
                // Màn hình chỉnh sửa từ điển lồng trực tiếp bên trong (giống QuickTranslateEditScreen)
                DictEditorContent(
                    title = editingDictTitle,
                    fileName = editingDictFile!!,
                    onBack = {
                        editingDictFile = null
                        refreshTrigger++
                    }
                )
            }
        }
    }
}

@Composable
fun DictCard(
    title: String,
    wordCount: String,
    onClick: () -> Unit
) {
    GlassCard(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        cornerRadius = 12.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                AppText(
                    text = title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(4.dp))
                AppText(
                    text = wordCount,
                    fontSize = 12.sp,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f)
                )
            }
            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = "Chỉnh sửa",
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(20.dp)
            )
        }
    }
}

@Composable
fun DictEditorContent(
    title: String,
    fileName: String,
    onBack: () -> Unit
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    var searchQuery by remember { mutableStateOf("") }
    var rawEntries by remember { mutableStateOf<List<Pair<String, String>>>(emptyList()) }
    var filteredEntries by remember { mutableStateOf<List<Pair<String, String>>>(emptyList()) }

    var refreshListTrigger by remember { mutableStateOf(0) }

    // Dialog state
    var showAddWordDialog by remember { mutableStateOf(false) }
    var wordToEdit by remember { mutableStateOf<Pair<String, String>?>(null) }
    var entryToDelete by remember { mutableStateOf<Pair<String, String>?>(null) }

    // Input fields for Dialogs
    var inputKey by remember { mutableStateOf("") }
    var inputValue by remember { mutableStateOf("") }

    // Load data from file
    LaunchedEffect(refreshListTrigger) {
        withContext(Dispatchers.IO) {
            rawEntries = QuickTranslateDictHelper.loadDictEntries(context, fileName)
        }
    }

    // Filter list ngầm mượt mà
    LaunchedEffect(searchQuery, rawEntries) {
        withContext(Dispatchers.Default) {
            filteredEntries = if (searchQuery.isBlank()) {
                rawEntries
            } else {
                rawEntries.filter {
                    it.first.contains(searchQuery, ignoreCase = true) ||
                            it.second.contains(searchQuery, ignoreCase = true)
                }
            }
        }
    }

    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            // Header
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = onBack) {
                    Icon(Icons.Default.ArrowBack, contentDescription = "Quay lại")
                }
                AppText(
                    text = title,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(1f)
                )
            }

            // Search Bar
            OutlinedTextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                placeholder = { Text("Tìm kiếm từ khóa...") },
                leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
                trailingIcon = {
                    if (searchQuery.isNotEmpty()) {
                        IconButton(onClick = { searchQuery = "" }) {
                            Icon(Icons.Default.Close, contentDescription = "Clear")
                        }
                    }
                },
                singleLine = true,
                shape = RoundedCornerShape(12.dp)
            )

            // Danh sách từ
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(horizontal = 16.dp)
            ) {
                // Show maximum 200 items to avoid lag
                val displayList = filteredEntries.take(200)

                items(displayList) { entry ->
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable {
                                wordToEdit = entry
                                inputKey = entry.first
                                inputValue = entry.second
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
                                    text = entry.first,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.height(2.dp))
                                AppText(
                                    text = entry.second,
                                    fontSize = 14.sp,
                                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                                )
                            }
                            IconButton(onClick = { entryToDelete = entry }) {
                                Icon(
                                    imageVector = Icons.Default.Delete,
                                    contentDescription = "Xóa",
                                    tint = MaterialTheme.colorScheme.error.copy(alpha = 0.8f)
                                )
                            }
                        }
                        HorizontalDivider(
                            color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f)
                        )
                    }
                }

                if (filteredEntries.size >= 200) {
                    item {
                        Text(
                            text = "Hiển thị tối đa 200 kết quả đầu tiên. Hãy gõ tìm kiếm để thu hẹp phạm vi.",
                            fontSize = 12.sp,
                            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 16.dp),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }

        // Floating Action Button
        FloatingActionButton(
            onClick = {
                inputKey = ""
                inputValue = ""
                showAddWordDialog = true
            },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(24.dp),
            shape = CircleShape,
            containerColor = MaterialTheme.colorScheme.primaryContainer
        ) {
            Icon(Icons.Default.Add, contentDescription = "Thêm từ")
        }

        // Dialogs
        if (showAddWordDialog) {
            AppAlertDialog(
                show = true,
                onDismissRequest = { showAddWordDialog = false },
                title = "Thêm từ mới",
                content = {
                    Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp)) {
                        OutlinedTextField(
                            value = inputKey,
                            onValueChange = { inputKey = it },
                            label = { Text("Từ gốc (tiếng Trung)") },
                            singleLine = true,
                            modifier = Modifier.fillMaxWidth()
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        OutlinedTextField(
                            value = inputValue,
                            onValueChange = { inputValue = it },
                            label = { Text("Bản dịch (tiếng Việt)") },
                            singleLine = true,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                },
                confirmText = "Xác nhận",
                onConfirm = {
                    if (inputKey.isNotBlank() && inputValue.isNotBlank()) {
                        scope.launch(Dispatchers.IO) {
                            QuickTranslateDictHelper.addOrUpdateEntry(
                                context,
                                fileName,
                                inputKey.trim(),
                                inputValue.trim()
                            )
                            withContext(Dispatchers.Main) {
                                Toast.makeText(context, "Đã thêm từ thành công", Toast.LENGTH_SHORT).show()
                                showAddWordDialog = false
                                refreshListTrigger++
                            }
                        }
                    }
                },
                dismissText = "Hủy bỏ",
                onDismiss = { showAddWordDialog = false }
            )
        }

        if (wordToEdit != null) {
            AppAlertDialog(
                show = true,
                onDismissRequest = { wordToEdit = null },
                title = "Chỉnh sửa từ",
                content = {
                    Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp)) {
                        OutlinedTextField(
                            value = inputKey,
                            onValueChange = { inputKey = it },
                            label = { Text("Từ gốc (tiếng Trung)") },
                            singleLine = true,
                            enabled = false, // Không cho sửa key gốc
                            modifier = Modifier.fillMaxWidth()
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        OutlinedTextField(
                            value = inputValue,
                            onValueChange = { inputValue = it },
                            label = { Text("Bản dịch (tiếng Việt)") },
                            singleLine = true,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                },
                confirmText = "Cập nhật",
                onConfirm = {
                    if (inputValue.isNotBlank()) {
                        scope.launch(Dispatchers.IO) {
                            QuickTranslateDictHelper.addOrUpdateEntry(
                                context,
                                fileName,
                                inputKey.trim(),
                                inputValue.trim()
                            )
                            withContext(Dispatchers.Main) {
                                Toast.makeText(context, "Cập nhật thành công", Toast.LENGTH_SHORT).show()
                                wordToEdit = null
                                refreshListTrigger++
                            }
                        }
                    }
                },
                dismissText = "Hủy",
                onDismiss = { wordToEdit = null }
            )
        }

        if (entryToDelete != null) {
            AppAlertDialog(
                show = true,
                onDismissRequest = { entryToDelete = null },
                title = "Xác nhận xóa",
                text = "Bạn có chắc chắn muốn xóa từ '${entryToDelete!!.first}' không?",
                confirmText = "Xóa",
                onConfirm = {
                    scope.launch(Dispatchers.IO) {
                        QuickTranslateDictHelper.deleteEntry(
                            context,
                            fileName,
                            entryToDelete!!.first
                        )
                        withContext(Dispatchers.Main) {
                            Toast.makeText(context, "Đã xóa từ thành công", Toast.LENGTH_SHORT).show()
                            entryToDelete = null
                            refreshListTrigger++
                        }
                    }
                },
                dismissText = "Hủy",
                onDismiss = { entryToDelete = null }
            )
        }
    }
}
