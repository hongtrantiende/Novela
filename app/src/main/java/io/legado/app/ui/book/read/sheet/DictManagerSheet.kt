package io.legado.app.ui.book.read.sheet

import android.content.Context
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
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
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Search
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
import io.legado.app.ui.theme.LegadoTheme
import io.legado.app.ui.book.read.ReadBookUiState
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.material.icons.filled.CloudDownload
import androidx.compose.material.icons.filled.CloudUpload
import io.legado.app.ui.config.translation.TranslationConfig
import io.legado.app.ui.widget.components.modalBottomSheet.AppModalBottomSheet
import io.legado.app.ui.widget.components.text.AppText
import io.legado.app.ui.widget.components.alert.AppAlertDialog
import io.legado.app.utils.QuickTranslateDictHelper
import io.legado.app.vbookextension.util.QuickTranslateEngine
import io.legado.app.utils.MD5Utils
import io.legado.app.utils.getPrefInt
import io.legado.app.utils.putPrefInt
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.coroutines.isActive

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
    val bookName = remember(state.book) {
        state.book?.name ?: "Không rõ tên"
    }

    val privateNameFile = "book/book_${bookKey}_name.txt"

    var selectedTabIndex by remember { mutableIntStateOf(0) }
    var searchQuery by remember { mutableStateOf("") }
    
    var rawEntries by remember { mutableStateOf<List<Pair<String, String>>>(emptyList()) }
    var refreshListTrigger by remember { mutableStateOf(0) }

    // AI settings state
    var showAiSettingsDialog by remember { mutableStateOf(false) }
    var tempLlmBaseUrl by remember { mutableStateOf(TranslationConfig.llmBaseUrl) }
    var tempLlmApiKey by remember { mutableStateOf(TranslationConfig.llmApiKey) }
    var tempLlmModel by remember { mutableStateOf(TranslationConfig.llmModel) }
    var modelMenuExpanded by remember { mutableStateOf(false) }
    var fetchedModels by remember { mutableStateOf<List<String>>(emptyList()) }
    var isFetchingModels by remember { mutableStateOf(false) }
    
    val isScanningFlowState = io.legado.app.service.AiScanService.isScanningFlow.collectAsState()
    val scanProgressFlowState = io.legado.app.service.AiScanService.scanProgressFlow.collectAsState()
    val scanBookUrlFlowState = io.legado.app.service.AiScanService.scanBookUrlFlow.collectAsState()

    val isScanningAi = isScanningFlowState.value && scanBookUrlFlowState.value == state.book?.bookUrl
    val scanProgressText = if (isScanningAi) scanProgressFlowState.value else ""
    
    var showResumeDialog by remember { mutableStateOf(false) }
    var resumeSavedIndex by remember { mutableStateOf(-1) }

    var showImportBookModeDialog by remember { mutableStateOf(false) }
    var importedUriBook by remember { mutableStateOf<android.net.Uri?>(null) }

    val bookImportLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri ->
        if (uri != null) {
            importedUriBook = uri
            showImportBookModeDialog = true
        }
    }

    val bookExportLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.CreateDocument("text/plain")
    ) { uri ->
        if (uri != null) {
            scope.launch(Dispatchers.IO) {
                try {
                    context.contentResolver.openOutputStream(uri)?.use { output ->
                        val file = QuickTranslateDictHelper.getDictFile(context, privateNameFile)
                        if (file.exists()) {
                            file.inputStream().use { input ->
                                input.copyTo(output)
                            }
                            withContext(Dispatchers.Main) {
                                Toast.makeText(context, "Xuất từ điển thành công!", Toast.LENGTH_SHORT).show()
                            }
                        } else {
                            withContext(Dispatchers.Main) {
                                Toast.makeText(context, "Từ điển trống, không có gì để xuất!", Toast.LENGTH_SHORT).show()
                            }
                        }
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                    withContext(Dispatchers.Main) {
                        Toast.makeText(context, "Lỗi xuất từ điển: ${e.message}", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }

    val downloadedChapters = remember(state.book) {
        state.book?.let { io.legado.app.help.book.BookHelp.getChapterFiles(it).size } ?: 0
    }

    // Dialog state
    var showAddWordDialog by remember { mutableStateOf(false) }
    var wordToEdit by remember { mutableStateOf<Pair<String, String>?>(null) }
    var entryToDelete by remember { mutableStateOf<Pair<String, String>?>(null) }
    var showDeleteAllConfirmDialog by remember { mutableStateOf(false) }

    // Input fields for Dialogs
    var inputKey by remember { mutableStateOf("") }
    var inputValue by remember { mutableStateOf("") }

    // Load data from file
    LaunchedEffect(refreshListTrigger, state.book, isScanningAi, scanProgressText) {
        withContext(Dispatchers.IO) {
            rawEntries = QuickTranslateDictHelper.loadDictEntries(context, privateNameFile)
        }
    }

    // Filter and categorize entries
    val categorizedEntries = remember(searchQuery, rawEntries, selectedTabIndex) {
        val filtered = if (searchQuery.isBlank()) {
            rawEntries
        } else {
            rawEntries.filter {
                it.first.contains(searchQuery, ignoreCase = true) ||
                        it.second.contains(searchQuery, ignoreCase = true)
            }
        }
        
        val targetTag = when (selectedTabIndex) {
            0 -> "PER"
            1 -> "LOC"
            2 -> "ORG"
            3 -> "PRON"
            4 -> "USER"
            else -> "PER"
        }
        
        filtered.filter { entry ->
            val tag = entry.second.substringAfter('/', "PER").trim()
            tag.equals(targetTag, ignoreCase = true)
        }.map { entry ->
            val trans = entry.second.substringBefore('/')
            Pair(entry.first, trans)
        }
    }

    AppModalBottomSheet(
        show = show,
        onDismissRequest = onDismissRequest,
        animateSize = false
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
                Column(modifier = Modifier.weight(1f)) {
                    AppText(
                        text = "Từ điển truyện",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    AppText(
                        text = "$bookName | Đã tải: $downloadedChapters chương",
                        fontSize = 13.sp,
                        color = LegadoTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                    )
                }
                IconButton(onClick = {
                    val book = state.book
                    if (book != null) {
                        val modelName = TranslationConfig.llmModel.ifBlank { "AI" }
                        val rawFileName = "Từ điển - ${book.name} - ${downloadedChapters} chương - ${modelName}.txt"
                        val exportFileName = rawFileName.replace(Regex("[\\\\/:*?\"<>|]"), "_")
                        bookExportLauncher.launch(exportFileName)
                    }
                }) {
                    Icon(Icons.Default.CloudDownload, contentDescription = "Xuất file TXT")
                }
                IconButton(onClick = {
                    bookImportLauncher.launch("*/*")
                }) {
                    Icon(Icons.Default.CloudUpload, contentDescription = "Nhập file TXT")
                }
                IconButton(onClick = {
                    tempLlmBaseUrl = TranslationConfig.llmBaseUrl
                    tempLlmApiKey = TranslationConfig.llmApiKey
                    tempLlmModel = TranslationConfig.llmModel
                    showAiSettingsDialog = true
                }) {
                    Icon(Icons.Default.Settings, contentDescription = "Cấu hình AI")
                }
                IconButton(onClick = {
                    showDeleteAllConfirmDialog = true
                }) {
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = "Xóa tất cả",
                        tint = LegadoTheme.colorScheme.error
                    )
                }
                IconButton(onClick = onDismissRequest) {
                    Icon(Icons.Default.Close, contentDescription = "Đóng")
                }
            }

            // Tab Row
            ScrollableTabRow(
                selectedTabIndex = selectedTabIndex,
                containerColor = Color.Transparent,
                contentColor = LegadoTheme.colorScheme.primary,
                edgePadding = 0.dp,
                modifier = Modifier.padding(horizontal = 8.dp)
            ) {
                val tabs = listOf("Tên nhân vật", "Tên địa danh", "Tên tổ chức", "Xưng hô", "Từ điển riêng")
                tabs.forEachIndexed { index, title ->
                    Tab(
                        selected = selectedTabIndex == index,
                        onClick = { selectedTabIndex = index },
                        text = { Text(title, fontWeight = if (selectedTabIndex == index) FontWeight.Bold else FontWeight.Normal) }
                    )
                }
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

            // Auto Scan with AI
            if (isScanningAi) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 6.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        modifier = Modifier.weight(1f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CircularProgressIndicator(modifier = Modifier.size(16.dp), strokeWidth = 2.dp)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = scanProgressText,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Medium,
                            color = LegadoTheme.colorScheme.onSurface
                        )
                    }
                    Button(
                        onClick = {
                            io.legado.app.service.AiScanService.stop(context)
                            Toast.makeText(context, "Đã gửi yêu cầu dừng quét AI", Toast.LENGTH_SHORT).show()
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = LegadoTheme.colorScheme.error,
                            contentColor = LegadoTheme.colorScheme.onError
                        ),
                        shape = RoundedCornerShape(8.dp),
                        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp)
                    ) {
                        Text("Dừng", fontSize = 12.sp, fontWeight = FontWeight.Bold)
                    }
                }
            } else {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 4.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    OutlinedButton(
                        onClick = {
                            val book = state.book ?: return@OutlinedButton
                            if (TranslationConfig.llmBaseUrl.isBlank() || TranslationConfig.llmApiKey.isBlank()) {
                                Toast.makeText(context, "Vui lòng cấu hình API AI trước", Toast.LENGTH_SHORT).show()
                                return@OutlinedButton
                            }
                            
                            val startAiScan: (Int) -> Unit = { fromIndex ->
                                io.legado.app.service.AiScanService.start(context, book.bookUrl, fromIndex)
                            }

                            val savedIndex = context.getPrefInt("ai_scan_last_index_${bookKey}", -1)
                            if (savedIndex >= 0) {
                                resumeSavedIndex = savedIndex
                                showResumeDialog = true
                            } else {
                                startAiScan(-1)
                            }
                        },
                        modifier = Modifier.weight(1f),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Bolt,
                            contentDescription = null,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text("Tự động quét bằng AI (Tất cả chương đã tải)", fontSize = 13.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }

            // Word List
            Box(modifier = Modifier.fillMaxWidth().weight(1f)) {
                if (categorizedEntries.isEmpty()) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        AppText(
                            text = "Không có từ khóa nào",
                            color = LegadoTheme.colorScheme.onSurface.copy(alpha = 0.5f),
                            fontSize = 14.sp
                        )
                    }
                } else {
                    LazyColumn(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .padding(horizontal = 16.dp)
                    ) {
                        val displayList = categorizedEntries.take(200)
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
                                            color = LegadoTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                                        )
                                    }
                                    IconButton(onClick = { entryToDelete = entry }) {
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
                        }

                        if (categorizedEntries.size >= 200) {
                            item {
                                Text(
                                    text = "Hiển thị tối đa 200 kết quả đầu tiên. Hãy gõ tìm kiếm để thu hẹp phạm vi.",
                                    fontSize = 12.sp,
                                    color = LegadoTheme.colorScheme.onSurface.copy(alpha = 0.5f),
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(vertical = 16.dp),
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                    }
                }

                // FAB
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
                    containerColor = LegadoTheme.colorScheme.primaryContainer
                ) {
                    Icon(Icons.Default.Add, contentDescription = "Thêm từ")
                }
            }
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
                        val targetTag = when (selectedTabIndex) {
                            0 -> "PER"
                            1 -> "LOC"
                            2 -> "ORG"
                            3 -> "PRON"
                            4 -> "USER"
                            else -> "PER"
                        }
                        scope.launch(Dispatchers.IO) {
                            QuickTranslateDictHelper.addOrUpdateEntry(
                                context,
                                privateNameFile,
                                inputKey.trim(),
                                "${inputValue.trim()}/$targetTag"
                            )
                            val book = state.book
                            if (book != null) {
                                io.legado.app.model.translation.TranslationManager.clearBookTranslationCache(book)
                            }
                            withContext(Dispatchers.Main) {
                                Toast.makeText(context, "Đã thêm từ thành công", Toast.LENGTH_SHORT).show()
                                io.legado.app.utils.TranslateUtils.clearCache()
                                io.legado.app.model.ReadBook.loadContent(false)
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
                            enabled = false,
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
                        val targetTag = when (selectedTabIndex) {
                            0 -> "PER"
                            1 -> "LOC"
                            2 -> "ORG"
                            3 -> "PRON"
                            4 -> "USER"
                            else -> "PER"
                        }
                        scope.launch(Dispatchers.IO) {
                            QuickTranslateDictHelper.addOrUpdateEntry(
                                context,
                                privateNameFile,
                                inputKey.trim(),
                                "${inputValue.trim()}/$targetTag"
                            )
                            val book = state.book
                            if (book != null) {
                                io.legado.app.model.translation.TranslationManager.clearBookTranslationCache(book)
                            }
                            withContext(Dispatchers.Main) {
                                Toast.makeText(context, "Cập nhật thành công", Toast.LENGTH_SHORT).show()
                                io.legado.app.utils.TranslateUtils.clearCache()
                                io.legado.app.model.ReadBook.loadContent(false)
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

        if (showAiSettingsDialog) {
            AppAlertDialog(
                show = true,
                onDismissRequest = { showAiSettingsDialog = false },
                title = "Cấu hình AI Quét Từ Điển",
                content = {
                    Column(
                        modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        OutlinedTextField(
                            value = tempLlmBaseUrl,
                            onValueChange = { tempLlmBaseUrl = it },
                            label = { Text("Base URL") },
                            placeholder = { Text("https://api.openai.com/v1") },
                            singleLine = true,
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(8.dp)
                        )
                        OutlinedTextField(
                            value = tempLlmApiKey,
                            onValueChange = { tempLlmApiKey = it },
                            label = { Text("API Key") },
                            placeholder = { Text("sk-...") },
                            singleLine = true,
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(8.dp)
                        )
                        Box(modifier = Modifier.fillMaxWidth()) {
                            OutlinedTextField(
                                value = tempLlmModel,
                                onValueChange = { tempLlmModel = it },
                                label = { Text("Model") },
                                placeholder = { Text("gpt-3.5-turbo") },
                                trailingIcon = {
                                    if (isFetchingModels) {
                                        CircularProgressIndicator(modifier = Modifier.size(16.dp), strokeWidth = 2.dp)
                                    } else {
                                        Text(
                                            text = "Quét",
                                            color = LegadoTheme.colorScheme.primary,
                                            fontSize = 12.sp,
                                            fontWeight = FontWeight.Bold,
                                            modifier = Modifier
                                                .clickable {
                                                    if (tempLlmBaseUrl.isBlank()) {
                                                        Toast.makeText(context, "Vui lòng nhập Base URL", Toast.LENGTH_SHORT).show()
                                                        return@clickable
                                                    }
                                                    scope.launch(Dispatchers.IO) {
                                                        isFetchingModels = true
                                                        try {
                                                            val url = if (tempLlmBaseUrl.endsWith("/")) {
                                                                tempLlmBaseUrl + "models"
                                                            } else {
                                                                tempLlmBaseUrl + "/models"
                                                            }
                                                            val requestBuilder = okhttp3.Request.Builder().url(url)
                                                            if (tempLlmApiKey.isNotBlank()) {
                                                                requestBuilder.addHeader("Authorization", "Bearer $tempLlmApiKey")
                                                            }
                                                            val request = requestBuilder.build()
                                                            val response = io.legado.app.help.http.okHttpClient.newCall(request).execute()
                                                            try {
                                                                if (response.isSuccessful) {
                                                                    val bodyStr = response.body?.string() ?: ""
                                                                    val json = org.json.JSONObject(bodyStr)
                                                                    val dataArr = json.optJSONArray("data")
                                                                    val modelsList = ArrayList<String>()
                                                                    if (dataArr != null) {
                                                                        for (i in 0 until dataArr.length()) {
                                                                            val modelObj = dataArr.getJSONObject(i)
                                                                            val id = modelObj.optString("id")
                                                                            if (!id.isNullOrBlank()) {
                                                                                modelsList.add(id)
                                                                            }
                                                                        }
                                                                    }
                                                                    withContext(Dispatchers.Main) {
                                                                        if (modelsList.isNotEmpty()) {
                                                                            fetchedModels = modelsList.sorted()
                                                                            modelMenuExpanded = true
                                                                        } else {
                                                                            Toast.makeText(context, "Không tìm thấy model nào", Toast.LENGTH_SHORT).show()
                                                                        }
                                                                    }
                                                                } else {
                                                                    withContext(Dispatchers.Main) {
                                                                        Toast.makeText(context, "Lỗi HTTP: ${response.code}", Toast.LENGTH_SHORT).show()
                                                                    }
                                                                }
                                                            } finally {
                                                                response.close()
                                                            }
                                                        } catch (e: Exception) {
                                                            withContext(Dispatchers.Main) {
                                                                Toast.makeText(context, "Lỗi kết nối: ${e.message}", Toast.LENGTH_SHORT).show()
                                                            }
                                                        } finally {
                                                            isFetchingModels = false
                                                        }
                                                    }
                                                }
                                                .padding(8.dp)
                                        )
                                    }
                                },
                                singleLine = true,
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(8.dp)
                            )
                            DropdownMenu(
                                expanded = modelMenuExpanded,
                                onDismissRequest = { modelMenuExpanded = false },
                                modifier = Modifier.fillMaxWidth().heightIn(max = 200.dp)
                            ) {
                                fetchedModels.forEach { modelName ->
                                    DropdownMenuItem(
                                        text = { Text(modelName, fontSize = 13.sp) },
                                        onClick = {
                                            tempLlmModel = modelName
                                            modelMenuExpanded = false
                                        }
                                    )
                                }
                            }
                        }
                    }
                },
                confirmText = "Lưu",
                onConfirm = {
                    TranslationConfig.llmBaseUrl = tempLlmBaseUrl
                    TranslationConfig.llmApiKey = tempLlmApiKey
                    TranslationConfig.llmModel = tempLlmModel
                    Toast.makeText(context, "Đã lưu cấu hình AI", Toast.LENGTH_SHORT).show()
                    showAiSettingsDialog = false
                },
                dismissText = "Hủy",
                onDismiss = { showAiSettingsDialog = false }
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
                            privateNameFile,
                            entryToDelete!!.first
                        )
                        val book = state.book
                        if (book != null) {
                            io.legado.app.model.translation.TranslationManager.clearBookTranslationCache(book)
                        }
                        withContext(Dispatchers.Main) {
                            Toast.makeText(context, "Đã xóa từ thành công", Toast.LENGTH_SHORT).show()
                            io.legado.app.utils.TranslateUtils.clearCache()
                            io.legado.app.model.ReadBook.loadContent(false)
                            entryToDelete = null
                            refreshListTrigger++
                        }
                    }
                },
                dismissText = "Hủy",
                onDismiss = { entryToDelete = null }
            )
        }

        if (showDeleteAllConfirmDialog) {
            AppAlertDialog(
                show = true,
                onDismissRequest = { showDeleteAllConfirmDialog = false },
                title = "Xác nhận xóa tất cả",
                text = "Bạn có chắc chắn muốn xóa toàn bộ từ trong từ điển truyện không? Hành động này không thể hoàn tác.",
                confirmText = "Xóa tất cả",
                onConfirm = {
                    scope.launch(Dispatchers.IO) {
                        QuickTranslateDictHelper.deleteDictFile(context, privateNameFile)
                        val book = state.book
                        if (book != null) {
                            io.legado.app.model.translation.TranslationManager.clearBookTranslationCache(book)
                        }
                        withContext(Dispatchers.Main) {
                            Toast.makeText(context, "Đã xóa toàn bộ từ điển", Toast.LENGTH_SHORT).show()
                            io.legado.app.utils.TranslateUtils.clearCache()
                            io.legado.app.model.ReadBook.loadContent(false)
                            showDeleteAllConfirmDialog = false
                            refreshListTrigger++
                        }
                    }
                },
                dismissText = "Hủy",
                onDismiss = { showDeleteAllConfirmDialog = false }
            )
        }

        if (showResumeDialog) {
            val book = state.book
            val bookKeyStr = bookKey
            AppAlertDialog(
                show = true,
                onDismissRequest = { showResumeDialog = false },
                title = "Tiếp tục quét từ điển",
                text = "Đã tìm thấy tiến độ quét trước đó. Bạn có muốn tiếp tục quét từ chương tiếp theo hay quét lại từ đầu?",
                confirmText = "Tiếp tục",
                onConfirm = {
                    showResumeDialog = false
                    if (book != null) {
                        io.legado.app.service.AiScanService.start(context, book.bookUrl, resumeSavedIndex)
                    }
                },
                dismissText = "Quét lại từ đầu",
                onDismiss = {
                    showResumeDialog = false
                    context.putPrefInt("ai_scan_last_index_${bookKeyStr}", -1)
                    if (book != null) {
                        io.legado.app.service.AiScanService.start(context, book.bookUrl, -1)
                    }
                }
            )
        }

        if (showImportBookModeDialog && importedUriBook != null) {
            val book = state.book
            var importMode by remember { mutableIntStateOf(1) } // 0: Thay thế, 1: Gộp, 2: Chỉ thêm thiếu
            AppAlertDialog(
                show = true,
                onDismissRequest = {
                    showImportBookModeDialog = false
                    importedUriBook = null
                },
                title = "Chọn chế độ nhập từ điển",
                content = {
                    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable { importMode = 0 }
                                .padding(vertical = 8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RadioButton(selected = importMode == 0, onClick = { importMode = 0 })
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("Thay thế toàn bộ từ điển hiện tại")
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable { importMode = 1 }
                                .padding(vertical = 8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RadioButton(selected = importMode == 1, onClick = { importMode = 1 })
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("Gộp (ghi đè các từ trùng lặp)")
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable { importMode = 2 }
                                .padding(vertical = 8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RadioButton(selected = importMode == 2, onClick = { importMode = 2 })
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("Chỉ thêm từ mới (giữ nguyên từ trùng)")
                        }
                    }
                },
                confirmText = "Nhập",
                onConfirm = {
                    showImportBookModeDialog = false
                    val uri = importedUriBook
                    if (uri != null) {
                        scope.launch(Dispatchers.IO) {
                            try {
                                context.contentResolver.openInputStream(uri)?.use { stream ->
                                    val success = QuickTranslateDictHelper.importDict(
                                        context,
                                        privateNameFile,
                                        stream,
                                        importMode,
                                        targetTag = "USER"
                                    )
                                    withContext(Dispatchers.Main) {
                                        if (success) {
                                            Toast.makeText(context, "Nhập từ điển thành công!", Toast.LENGTH_SHORT).show()
                                            // Reload dict in RAM
                                            QuickTranslateEngine.initBookPrivateDict(context, bookKey)
                                            // Clear translate cache
                                            if (book != null) {
                                                io.legado.app.model.translation.TranslationManager.clearBookTranslationCache(book)
                                            }
                                            // Reload list
                                            refreshListTrigger++
                                            // Reload content if current chapter is active
                                            io.legado.app.utils.TranslateUtils.clearCache()
                                            io.legado.app.model.ReadBook.loadContent(false)
                                        } else {
                                            Toast.makeText(context, "Lỗi phân tích cú pháp từ điển!", Toast.LENGTH_SHORT).show()
                                        }
                                    }
                                }
                            } catch (e: Exception) {
                                e.printStackTrace()
                                withContext(Dispatchers.Main) {
                                    Toast.makeText(context, "Lỗi nhập file: ${e.message}", Toast.LENGTH_SHORT).show()
                                }
                            } finally {
                                importedUriBook = null
                            }
                        }
                    }
                },
                dismissText = "Hủy",
                onDismiss = {
                    showImportBookModeDialog = false
                    importedUriBook = null
                }
            )
        }
    }
}
