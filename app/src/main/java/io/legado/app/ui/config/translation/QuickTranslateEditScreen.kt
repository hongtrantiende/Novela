package io.legado.app.ui.config.translation

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import io.legado.app.ui.theme.LegadoTheme
import io.legado.app.ui.widget.components.AppScaffold
import io.legado.app.ui.widget.components.EmptyMessage
import io.legado.app.ui.widget.components.alert.AppAlertDialog
import io.legado.app.ui.widget.components.progressIndicator.AppCircularProgressIndicator
import io.legado.app.ui.widget.components.text.AppText
import io.legado.app.ui.widget.components.topbar.GlassMediumFlexibleTopAppBar
import io.legado.app.ui.widget.components.topbar.TopBarNavigationButton
import io.legado.app.utils.QuickTranslateDictHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuickTranslateEditScreen(
    fileName: String,
    onBackClick: () -> Unit
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    var isLoading by remember { mutableStateOf(true) }
    var allEntries by remember { mutableStateOf<List<Pair<String, String>>>(emptyList()) }
    var filteredEntries by remember { mutableStateOf<List<Pair<String, String>>>(emptyList()) }
    var searchQuery by remember { mutableStateOf("") }

    // Dialog States
    var showAddDialog by remember { mutableStateOf(false) }
    var editingEntry by remember { mutableStateOf<Pair<String, String>?>(null) }
    var entryToDelete by remember { mutableStateOf<Pair<String, String>?>(null) }

    // Load entries on start
    LaunchedEffect(fileName) {
        isLoading = true
        allEntries = QuickTranslateDictHelper.loadDictEntries(context, fileName)
        isLoading = false
    }

    // Search and filter with debounce/background logic
    LaunchedEffect(searchQuery, allEntries) {
        withContext(Dispatchers.Default) {
            val query = searchQuery.trim().lowercase()
            val filtered = if (query.isEmpty()) {
                allEntries
            } else {
                allEntries.filter {
                    it.first.lowercase().contains(query) || it.second.lowercase().contains(query)
                }
            }
            // Limit to 200 items for butter-smooth UI rendering
            filteredEntries = filtered.take(200)
        }
    }

    AppScaffold(
        topBar = {
            GlassMediumFlexibleTopAppBar(
                title = fileName,
                navigationIcon = {
                    TopBarNavigationButton(onClick = onBackClick)
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { showAddDialog = true },
                containerColor = LegadoTheme.colorScheme.primary,
                contentColor = LegadoTheme.colorScheme.onPrimary
            ) {
                Icon(Icons.Default.Add, contentDescription = "Thêm từ mới")
            }
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            // Search Bar
            OutlinedTextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                label = { AppText("Tìm kiếm từ / nghĩa dịch") },
                leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            )

            if (isLoading) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    contentAlignment = Alignment.Center
                ) {
                    AppCircularProgressIndicator()
                }
            } else if (allEntries.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    contentAlignment = Alignment.Center
                ) {
                    EmptyMessage(message = "Từ điển trống. Nhấn nút + để thêm từ mới.")
                }
            } else {
                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
                ) {
                    items(filteredEntries, key = { it.first }) { entry ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable { editingEntry = entry }
                                .padding(vertical = 12.dp, horizontal = 8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = entry.first,
                                    style = LegadoTheme.typography.bodyLargeEmphasized,
                                    color = LegadoTheme.colorScheme.onSurface
                                )
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(
                                    text = entry.second,
                                    style = LegadoTheme.typography.bodySmall,
                                    color = LegadoTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                                )
                            }
                            
                            IconButton(
                                onClick = { entryToDelete = entry }
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Delete,
                                    contentDescription = "Xóa",
                                    tint = LegadoTheme.colorScheme.error.copy(alpha = 0.8f)
                                )
                            }
                        }
                        HorizontalDivider(
                            color = LegadoTheme.colorScheme.outlineVariant.copy(alpha = 0.5f)
                        )
                    }
                    
                    if (filteredEntries.size >= 200) {
                        item {
                            AppText(
                                text = "Hiển thị tối đa 200 kết quả đầu tiên. Hãy gõ tìm kiếm để thu hẹp phạm vi.",
                                style = LegadoTheme.typography.bodySmall,
                                color = LegadoTheme.colorScheme.onSurface.copy(alpha = 0.5f),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 16.dp),
                                textAlign = androidx.compose.ui.text.style.TextAlign.Center
                            )
                        }
                    }
                }
            }
        }
    }

    // Add Entry Dialog
    if (showAddDialog) {
        var chineseKey by remember { mutableStateOf("") }
        var vietVal by remember { mutableStateOf("") }
        
        AppAlertDialog(
            show = showAddDialog,
            title = "Thêm từ mới",
            content = {
                Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp)) {
                    OutlinedTextField(
                        value = chineseKey,
                        onValueChange = { chineseKey = it },
                        label = { AppText("Từ tiếng Trung / Gốc") },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    OutlinedTextField(
                        value = vietVal,
                        onValueChange = { vietVal = it },
                        label = { AppText("Nghĩa Việt / Thay thế") },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            },
            confirmText = "Lưu",
            onConfirm = {
                val key = chineseKey.trim()
                val value = vietVal.trim()
                if (key.isNotEmpty() && value.isNotEmpty()) {
                    scope.launch {
                        QuickTranslateDictHelper.addOrUpdateEntry(context, fileName, key, value)
                        allEntries = QuickTranslateDictHelper.loadDictEntries(context, fileName)
                        showAddDialog = false
                        Toast.makeText(context, "Đã thêm từ mới!", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(context, "Không được để trống!", Toast.LENGTH_SHORT).show()
                }
            },
            dismissText = "Hủy",
            onDismiss = { showAddDialog = false },
            onDismissRequest = { showAddDialog = false }
        )
    }

    // Edit Entry Dialog
    editingEntry?.let { entry ->
        var editVal by remember { mutableStateOf(entry.second) }
        
        AppAlertDialog(
            show = true,
            title = "Chỉnh sửa từ: ${entry.first}",
            content = {
                Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp)) {
                    OutlinedTextField(
                        value = editVal,
                        onValueChange = { editVal = it },
                        label = { AppText("Nghĩa Việt / Thay thế") },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            },
            confirmText = "Lưu",
            onConfirm = {
                val value = editVal.trim()
                if (value.isNotEmpty()) {
                    scope.launch {
                        QuickTranslateDictHelper.addOrUpdateEntry(context, fileName, entry.first, value)
                        allEntries = QuickTranslateDictHelper.loadDictEntries(context, fileName)
                        editingEntry = null
                        Toast.makeText(context, "Đã cập nhật từ!", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(context, "Không được để trống!", Toast.LENGTH_SHORT).show()
                }
            },
            dismissText = "Hủy",
            onDismiss = { editingEntry = null },
            onDismissRequest = { editingEntry = null }
        )
    }

    // Delete Confirmation Dialog
    entryToDelete?.let { entry ->
        AppAlertDialog(
            show = true,
            title = "Xác nhận xóa từ",
            text = "Bạn có chắc chắn muốn xóa từ \"${entry.first}\" khỏi từ điển?",
            confirmText = "Xóa",
            onConfirm = {
                scope.launch {
                    QuickTranslateDictHelper.deleteEntry(context, fileName, entry.first)
                    allEntries = QuickTranslateDictHelper.loadDictEntries(context, fileName)
                    entryToDelete = null
                    Toast.makeText(context, "Đã xóa từ!", Toast.LENGTH_SHORT).show()
                }
            },
            dismissText = "Hủy",
            onDismiss = { entryToDelete = null },
            onDismissRequest = { entryToDelete = null }
        )
    }
}
