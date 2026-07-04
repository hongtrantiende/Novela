package io.legado.app.ui.config.translation

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CloudDownload
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import io.legado.app.ui.theme.LegadoTheme
import androidx.compose.ui.unit.dp

import androidx.compose.ui.window.Dialog
import io.legado.app.ui.widget.components.AppScaffold
import io.legado.app.ui.widget.components.SplicedColumnGroup
import io.legado.app.ui.widget.components.card.GlassCard
import io.legado.app.ui.widget.components.settingItem.DropdownListSettingItem
import io.legado.app.ui.widget.components.settingItem.InputSettingItem
import io.legado.app.ui.widget.components.settingItem.SwitchSettingItem
import io.legado.app.ui.widget.components.text.AppText
import io.legado.app.ui.widget.components.topbar.GlassMediumFlexibleTopAppBar
import io.legado.app.ui.widget.components.topbar.TopBarNavigationButton
import io.legado.app.ui.widget.components.alert.AppAlertDialog
import io.legado.app.ui.widget.components.progressIndicator.AppCircularProgressIndicator
import io.legado.app.vbookextension.util.QuickTranslateEngine
import io.legado.app.utils.QuickTranslateDictHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun QuickTranslateSettingsScreen(
    onBackClick: () -> Unit
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val prefs = remember { context.getSharedPreferences("novel_reader_prefs", Context.MODE_PRIVATE) }
    var refreshTrigger by remember { mutableStateOf(0) }
    
    var editingDictFile by remember { mutableStateOf<String?>(null) }

    LaunchedEffect(Unit) {
        withContext(Dispatchers.IO) {
            QuickTranslateEngine.copyDictFromAssetsIfNeed(context)
        }
        refreshTrigger++
    }

    // Dictionary word count states
    var vietPhraseCount by remember { mutableStateOf("...") }
    var nameCount by remember { mutableStateOf("...") }
    var phienAmCount by remember { mutableStateOf("...") }
    var pronounsCount by remember { mutableStateOf("...") }
    var luatNhanCount by remember { mutableStateOf("...") }

    LaunchedEffect(refreshTrigger) {
        withContext(Dispatchers.IO) {
            val vp = QuickTranslateEngine.getWordCount(context, "VietPhrase.txt")
            val nm = QuickTranslateEngine.getWordCount(context, "Name.txt")
            val pa = QuickTranslateEngine.getWordCount(context, "PhienAm.txt")
            val pr = QuickTranslateEngine.getWordCount(context, "Pronouns.txt")
            val ln = QuickTranslateEngine.getWordCount(context, "LuatNhan.txt")
            withContext(Dispatchers.Main) {
                vietPhraseCount = vp
                nameCount = nm
                phienAmCount = pa
                pronounsCount = pr
                luatNhanCount = ln
            }
        }
    }

    // Download / Unzip States
    var isDownloading by remember { mutableStateOf(false) }
    var downloadProgressText by remember { mutableStateOf("Đang giải nén...") }
    var downloadUrl by remember(refreshTrigger) {
        mutableStateOf(prefs.getString("qt_dict_download_url", "https://raw.githubusercontent.com/hongtrantiende/Extransion-TTC/main/dict.zip") ?: "https://raw.githubusercontent.com/hongtrantiende/Extransion-TTC/main/dict.zip")
    }

    // Preference states
    var nameVpPriority by remember(refreshTrigger) {
        mutableStateOf(prefs.getString("qt_dict_priority_name_vp", "Name > VP") ?: "Name > VP")
    }
    var privatePublicPriority by remember(refreshTrigger) {
        mutableStateOf(prefs.getString("qt_dict_priority_private_public", "Riêng > Chung") ?: "Riêng > Chung")
    }
    var maxPhraseLength by remember(refreshTrigger) {
        mutableStateOf(prefs.getInt("qt_max_phrase_length", 12))
    }
    var vpLengthPriority by remember(refreshTrigger) {
        mutableStateOf(prefs.getString("qt_vp_length_priority", "Dài > Ngắn") ?: "Dài > Ngắn")
    }
    var luatNhan by remember(refreshTrigger) {
        mutableStateOf(prefs.getString("qt_luat_nhan", "Không nhân") ?: "Không nhân")
    }
    var segmentMode by remember(refreshTrigger) {
        mutableStateOf(prefs.getString("qt_segment_mode", "Theo đoạn văn") ?: "Theo đoạn văn")
    }
    var wordLookupTool by remember(refreshTrigger) {
        mutableStateOf(prefs.getString("qt_word_lookup_tool", "Cài đặt công cụ tra cứu bản dịch từ trên web.") ?: "Cài đặt công cụ tra cứu bản dịch từ trên web.")
    }
    var convertTraditionalSimplified by remember(refreshTrigger) {
        mutableStateOf(prefs.getBoolean("qt_convert_traditional_simplified", true))
    }
    var italicizeDialogue by remember(refreshTrigger) {
        mutableStateOf(prefs.getBoolean("qt_italicize_dialogue", true))
    }

    // Dropdown / Import / Export States
    var expandedMenuIndex by remember { mutableStateOf(-1) }
    var importingDictFile by remember { mutableStateOf<String?>(null) }
    var importingUri by remember { mutableStateOf<android.net.Uri?>(null) }
    var showImportModeDialog by remember { mutableStateOf(false) }
    var showDeleteConfirmDialog by remember { mutableStateOf<String?>(null) }
    var exportingDictFile by remember { mutableStateOf<String?>(null) }

    // Launcher for file picker
    val importLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri ->
        if (uri != null && importingDictFile != null) {
            importingUri = uri
            showImportModeDialog = true
        }
    }

    // Launcher for exporting document
    val exportLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.CreateDocument("text/plain")
    ) { uri ->
        if (uri != null && exportingDictFile != null) {
            scope.launch(Dispatchers.IO) {
                try {
                    context.contentResolver.openOutputStream(uri)?.use { output ->
                        val file = QuickTranslateDictHelper.getDictFile(context, exportingDictFile!!)
                        if (file.exists()) {
                            file.inputStream().use { input ->
                                input.copyTo(output)
                            }
                            withContext(Dispatchers.Main) {
                                Toast.makeText(context, "Xuất từ điển thành công!", Toast.LENGTH_SHORT).show()
                            }
                        }
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                    withContext(Dispatchers.Main) {
                        Toast.makeText(context, "Lỗi xuất từ điển: ${e.message}", Toast.LENGTH_SHORT).show()
                    }
                } finally {
                    exportingDictFile = null
                }
            }
        }
    }

    if (editingDictFile != null) {
        QuickTranslateEditScreen(fileName = editingDictFile!!) {
            editingDictFile = null
            refreshTrigger++
        }
    } else {
        AppScaffold(
            topBar = {
                GlassMediumFlexibleTopAppBar(
                    title = "Quick Translate (Từ điển)",
                    navigationIcon = {
                        TopBarNavigationButton(onClick = onBackClick)
                    }
                )
            }
        ) { padding ->
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
            ) {
                // Section 1: Từ điển chung
                item {
                    Column(modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth().padding(bottom = 12.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            AppText(
                                text = "Từ điển chung",
                                style = LegadoTheme.typography.titleMediumEmphasized,
                                color = LegadoTheme.colorScheme.primary
                            )
                            if (io.legado.app.help.MemberManager.isVip) {
                                Button(
                                    onClick = {
                                        isDownloading = true
                                        downloadProgressText = "Đang kết nối..."
                                        scope.launch(Dispatchers.IO) {
                                            var success = QuickTranslateEngine.downloadAndUnzipDict(context, downloadUrl) { progress ->
                                                downloadProgressText = progress
                                            }
                                            if (!success) {
                                                withContext(Dispatchers.Main) {
                                                    downloadProgressText = "Đang giải nén từ điển mặc định..."
                                                }
                                                success = QuickTranslateEngine.unzipDictFromAssets(context)
                                            }
                                            withContext(Dispatchers.Main) {
                                                isDownloading = false
                                                refreshTrigger++
                                                if (success) {
                                                    Toast.makeText(context, "Tải từ điển hoàn thành!", Toast.LENGTH_SHORT).show()
                                                } else {
                                                    Toast.makeText(context, "Lỗi tải từ điển!", Toast.LENGTH_SHORT).show()
                                                }
                                            }
                                        }
                                    },
                                    shape = RoundedCornerShape(8.dp),
                                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp)
                                ) {
                                    Icon(
                                        Icons.Default.CloudDownload,
                                        contentDescription = null,
                                        modifier = Modifier.size(16.dp)
                                    )
                                    Spacer(modifier = Modifier.width(4.dp))
                                    AppText("Tải từ điển mặc định", style = LegadoTheme.typography.labelSmall)
                                }
                            }
                        }

                        if (!io.legado.app.help.MemberManager.isVip) {
                            GlassCard(
                                modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
                                cornerRadius = 12.dp
                            ) {
                                Column(modifier = Modifier.padding(16.dp)) {
                                    AppText(
                                        text = "🔒 Tính năng tải từ điển chung yêu cầu kích hoạt Thành viên nội bộ.",
                                        style = LegadoTheme.typography.bodyMediumEmphasized,
                                        color = LegadoTheme.colorScheme.error
                                    )
                                }
                            }
                        } else {
                            // Grid of 5 dictionary files
                            val dicts = listOf(
                                Triple("VietPhrase.txt", vietPhraseCount, "VP"),
                                Triple("Name.txt", nameCount, "Name"),
                                Triple("PhienAm.txt", phienAmCount, "Phiên Âm"),
                                Triple("Pronouns.txt", pronounsCount, "Nhân Xưng"),
                                Triple("LuatNhan.txt", luatNhanCount, "Luật Nhân")
                            )

                            // 3 items in first row
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                for (i in 0..2) {
                                    Box(
                                        modifier = Modifier.weight(1f)
                                    ) {
                                        GlassCard(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .combinedClickable(onClick = { expandedMenuIndex = i }, onLongClick = { expandedMenuIndex = i }),
                                            cornerRadius = 12.dp
                                        ) {
                                            Column(modifier = Modifier.padding(12.dp)) {
                                                AppText(
                                                    text = dicts[i].first,
                                                    style = LegadoTheme.typography.bodyMediumEmphasized,
                                                    maxLines = 1
                                                )
                                                Spacer(modifier = Modifier.height(4.dp))
                                                AppText(
                                                    text = dicts[i].second,
                                                    style = LegadoTheme.typography.bodySmall,
                                                    color = LegadoTheme.colorScheme.primary,
                                                    maxLines = 1
                                                )
                                            }
                                        }

                                        DropdownMenu(
                                            expanded = expandedMenuIndex == i,
                                            onDismissRequest = { expandedMenuIndex = -1 }
                                        ) {
                                            DropdownMenuItem(
                                                text = { AppText("Sửa") },
                                                onClick = {
                                                    expandedMenuIndex = -1
                                                    editingDictFile = dicts[i].first
                                                }
                                            )
                                            DropdownMenuItem(
                                                text = { AppText("Nhập") },
                                                onClick = {
                                                    expandedMenuIndex = -1
                                                    importingDictFile = dicts[i].first
                                                    importLauncher.launch("*/*")
                                                }
                                            )
                                            DropdownMenuItem(
                                                text = { Text("Xuất") },
                                                onClick = {
                                                    expandedMenuIndex = -1
                                                    exportingDictFile = dicts[i].first
                                                    exportLauncher.launch(dicts[i].first)
                                                }
                                            )
                                            DropdownMenuItem(
                                                text = { Text("Xóa") },
                                                onClick = {
                                                    expandedMenuIndex = -1
                                                    showDeleteConfirmDialog = dicts[i].first
                                                }
                                            )
                                        }
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(8.dp))

                            // 2 items in second row
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                for (i in 3..4) {
                                    Box(
                                        modifier = Modifier.weight(1f)
                                    ) {
                                        GlassCard(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .combinedClickable(onClick = { expandedMenuIndex = i }, onLongClick = { expandedMenuIndex = i }),
                                            cornerRadius = 12.dp
                                        ) {
                                            Column(modifier = Modifier.padding(12.dp)) {
                                                AppText(
                                                    text = dicts[i].first,
                                                    style = LegadoTheme.typography.bodyMediumEmphasized,
                                                    maxLines = 1
                                                )
                                                Spacer(modifier = Modifier.height(4.dp))
                                                AppText(
                                                    text = dicts[i].second,
                                                    style = LegadoTheme.typography.bodySmall,
                                                    color = LegadoTheme.colorScheme.primary,
                                                    maxLines = 1
                                                )
                                            }
                                        }

                                        DropdownMenu(
                                            expanded = expandedMenuIndex == i,
                                            onDismissRequest = { expandedMenuIndex = -1 }
                                        ) {
                                            DropdownMenuItem(
                                                text = { AppText("Sửa") },
                                                onClick = {
                                                    expandedMenuIndex = -1
                                                    editingDictFile = dicts[i].first
                                                }
                                            )
                                            DropdownMenuItem(
                                                text = { AppText("Nhập") },
                                                onClick = {
                                                    expandedMenuIndex = -1
                                                    importingDictFile = dicts[i].first
                                                    importLauncher.launch("*/*")
                                                }
                                            )
                                            DropdownMenuItem(
                                                text = { AppText("Xuất") },
                                                onClick = {
                                                    expandedMenuIndex = -1
                                                    exportingDictFile = dicts[i].first
                                                    exportLauncher.launch(dicts[i].first)
                                                }
                                            )
                                            DropdownMenuItem(
                                                text = { AppText("Xóa") },
                                                onClick = {
                                                    expandedMenuIndex = -1
                                                    showDeleteConfirmDialog = dicts[i].first
                                                }
                                            )
                                        }
                                    }
                                }
                                // Empty spacer to occupy the 3rd column space
                                Box(modifier = Modifier.weight(1f))
                            }
                        }
                    }
                }

                // Section 2: Cài đặt dịch
                item {
                    SplicedColumnGroup(title = "Cài đặt dịch") {
                        DropdownListSettingItem(
                            title = "Ưu tiên từ điển name - VP",
                            selectedValue = nameVpPriority,
                            displayEntries = arrayOf("Name > VP", "VP > Name"),
                            entryValues = arrayOf("Name > VP", "VP > Name"),
                            onValueChange = { value ->
                                prefs.edit().putString("qt_dict_priority_name_vp", value).apply()
                                nameVpPriority = value
                                QuickTranslateEngine.init(context, force = true)
                                refreshTrigger++
                            }
                        )

                        DropdownListSettingItem(
                            title = "Ưu tiên từ điển riêng - chung",
                            selectedValue = privatePublicPriority,
                            displayEntries = arrayOf("Riêng > Chung", "Chung > Riêng"),
                            entryValues = arrayOf("Riêng > Chung", "Chung > Riêng"),
                            onValueChange = { value ->
                                prefs.edit().putString("qt_dict_priority_private_public", value).apply()
                                privatePublicPriority = value
                                QuickTranslateEngine.init(context, force = true)
                                refreshTrigger++
                            }
                        )

                        DropdownListSettingItem(
                            title = "Cụm từ dài nhất",
                            selectedValue = maxPhraseLength.toString(),
                            displayEntries = arrayOf("10", "11", "12", "13", "14", "15", "16"),
                            entryValues = arrayOf("10", "11", "12", "13", "14", "15", "16"),
                            onValueChange = { value ->
                                val intVal = value.toIntOrNull() ?: 12
                                prefs.edit().putInt("qt_max_phrase_length", intVal).apply()
                                maxPhraseLength = intVal
                                refreshTrigger++
                            }
                        )

                        DropdownListSettingItem(
                            title = "Ưu tiên độ dài VP",
                            selectedValue = vpLengthPriority,
                            displayEntries = arrayOf("Dài > Ngắn", "Ngắn > Dài"),
                            entryValues = arrayOf("Dài > Ngắn", "Ngắn > Dài"),
                            onValueChange = { value ->
                                prefs.edit().putString("qt_vp_length_priority", value).apply()
                                vpLengthPriority = value
                                refreshTrigger++
                            }
                        )

                        DropdownListSettingItem(
                            title = "Luật nhân",
                            selectedValue = luatNhan,
                            displayEntries = arrayOf("Không nhân", "Luật nhân 1", "Luật nhân 2"),
                            entryValues = arrayOf("Không nhân", "Luật nhân 1", "Luật nhân 2"),
                            onValueChange = { value ->
                                prefs.edit().putString("qt_luat_nhan", value).apply()
                                luatNhan = value
                                QuickTranslateEngine.init(context, force = true)
                                refreshTrigger++
                            }
                        )

                        DropdownListSettingItem(
                            title = "Phân đoạn dịch",
                            selectedValue = segmentMode,
                            displayEntries = arrayOf("Theo đoạn văn", "Theo dòng", "Theo câu"),
                            entryValues = arrayOf("Theo đoạn văn", "Theo dòng", "Theo câu"),
                            onValueChange = { value ->
                                prefs.edit().putString("qt_segment_mode", value).apply()
                                segmentMode = value
                                refreshTrigger++
                            }
                        )

                        InputSettingItem(
                            title = "Công cụ tra cứu từ",
                            value = wordLookupTool,
                            defaultValue = "Cài đặt công cụ tra cứu bản dịch từ trên web.",
                            onConfirm = { value ->
                                prefs.edit().putString("qt_word_lookup_tool", value.trim()).apply()
                                wordLookupTool = value.trim()
                                refreshTrigger++
                            }
                        )

                        SwitchSettingItem(
                            title = "Chuyển phồn thể sang giản thể",
                            description = "Tự động chuyển đổi văn bản từ chữ phồn thể sang chữ giản thể.",
                            checked = convertTraditionalSimplified,
                            onCheckedChange = { checked ->
                                prefs.edit().putBoolean("qt_convert_traditional_simplified", checked).apply()
                                convertTraditionalSimplified = checked
                                refreshTrigger++
                            }
                        )

                        SwitchSettingItem(
                            title = "In nghiêng câu thoại",
                            description = "Tự động in nghiêng câu thoại nằm giữa 2 dấu nháy kép.",
                            checked = italicizeDialogue,
                            onCheckedChange = { checked ->
                                prefs.edit().putBoolean("qt_italicize_dialogue", checked).apply()
                                italicizeDialogue = checked
                                refreshTrigger++
                            }
                        )
                    }
                }
            }
        }
    }

    // Import Mode Dialog
    if (showImportModeDialog && importingDictFile != null && importingUri != null) {
        var importMode by remember { mutableIntStateOf(1) } // 0: Thay thế, 1: Gộp, 2: Chỉ thêm thiếu
        
        AppAlertDialog(
            show = showImportModeDialog,
            title = "Nhập từ điển: $importingDictFile",
            content = {
                Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp)) {
                    AppText(text = "Chọn chế độ nhập từ điển:", style = LegadoTheme.typography.bodyMediumEmphasized)
                    Spacer(modifier = Modifier.height(12.dp))
                    
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { importMode = 0 }
                            .padding(vertical = 4.dp)
                    ) {
                        RadioButton(selected = importMode == 0, onClick = { importMode = 0 })
                        Spacer(modifier = Modifier.width(8.dp))
                        Column {
                            AppText("Thay thế toàn bộ", style = LegadoTheme.typography.bodyMediumEmphasized)
                            AppText("Xóa từ điển hiện tại và thay bằng từ điển mới", style = LegadoTheme.typography.bodySmall, color = LegadoTheme.colorScheme.onSurface.copy(alpha = 0.6f))
                        }
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { importMode = 1 }
                            .padding(vertical = 4.dp)
                    ) {
                        RadioButton(selected = importMode == 1, onClick = { importMode = 1 })
                        Spacer(modifier = Modifier.width(8.dp))
                        Column {
                            AppText("Gộp từ điển", style = LegadoTheme.typography.bodyMediumEmphasized)
                            AppText("Thêm từ mới, ghi đè bản dịch khi trùng từ", style = LegadoTheme.typography.bodySmall, color = LegadoTheme.colorScheme.onSurface.copy(alpha = 0.6f))
                        }
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { importMode = 2 }
                            .padding(vertical = 4.dp)
                    ) {
                        RadioButton(selected = importMode == 2, onClick = { importMode = 2 })
                        Spacer(modifier = Modifier.width(8.dp))
                        Column {
                            AppText("Chỉ thêm từ thiếu", style = LegadoTheme.typography.bodyMediumEmphasized)
                            AppText("Chỉ thêm từ chưa có, giữ nguyên bản dịch hiện tại", style = LegadoTheme.typography.bodySmall, color = LegadoTheme.colorScheme.onSurface.copy(alpha = 0.6f))
                        }
                    }
                }
            },
            confirmText = "Nhập",
            onConfirm = {
                val uri = importingUri!!
                val file = importingDictFile!!
                scope.launch {
                    try {
                        context.contentResolver.openInputStream(uri)?.use { stream ->
                            val success = QuickTranslateDictHelper.importDict(context, file, stream, importMode)
                            if (success) {
                                Toast.makeText(context, "Nhập từ điển thành công!", Toast.LENGTH_SHORT).show()
                                refreshTrigger++
                            } else {
                                Toast.makeText(context, "Lỗi nhập từ điển!", Toast.LENGTH_SHORT).show()
                            }
                        }
                    } catch (e: Exception) {
                        e.printStackTrace()
                        Toast.makeText(context, "Lỗi: ${e.message}", Toast.LENGTH_SHORT).show()
                    } finally {
                        showImportModeDialog = false
                        importingDictFile = null
                        importingUri = null
                    }
                }
            },
            dismissText = "Hủy",
            onDismiss = {
                showImportModeDialog = false
                importingDictFile = null
                importingUri = null
            },
            onDismissRequest = {
                showImportModeDialog = false
                importingDictFile = null
                importingUri = null
            }
        )
    }

    // Delete Confirmation Dialog
    showDeleteConfirmDialog?.let { fileToDelete ->
        AppAlertDialog(
            show = true,
            title = "Xác nhận xóa từ điển",
            text = "Bạn có chắc chắn muốn xóa file từ điển \"$fileToDelete\"? Hành động này sẽ xóa toàn bộ từ trong file.",
            confirmText = "Xóa",
            onConfirm = {
                scope.launch {
                    val success = QuickTranslateDictHelper.deleteDictFile(context, fileToDelete)
                    if (success) {
                        Toast.makeText(context, "Đã xóa từ điển!", Toast.LENGTH_SHORT).show()
                        refreshTrigger++
                    } else {
                        Toast.makeText(context, "Không thể xóa từ điển!", Toast.LENGTH_SHORT).show()
                    }
                    showDeleteConfirmDialog = null
                }
            },
            dismissText = "Hủy",
            onDismiss = { showDeleteConfirmDialog = null },
            onDismissRequest = { showDeleteConfirmDialog = null }
        )
    }

    // Downloading Dialog
    if (isDownloading) {
        Dialog(onDismissRequest = {}) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .background(LegadoTheme.colorScheme.surfaceContainer)
                    .padding(24.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AppCircularProgressIndicator()
                    Spacer(modifier = Modifier.height(16.dp))
                    AppText(text = downloadProgressText, style = LegadoTheme.typography.bodyMedium)
                }
            }
        }
    }
}
