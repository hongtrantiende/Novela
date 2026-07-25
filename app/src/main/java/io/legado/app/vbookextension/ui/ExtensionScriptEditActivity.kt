package io.legado.app.vbookextension.ui

import android.content.Context
import android.net.Uri
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.BugReport
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Save
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.legado.app.base.BaseComposeActivity
import io.legado.app.ui.theme.LegadoTheme
import io.legado.app.ui.widget.components.AppScaffold
import io.legado.app.ui.widget.components.alert.AppAlertDialog
import io.legado.app.ui.widget.components.image.sourceIcon.SourceIcon
import io.legado.app.ui.widget.components.menuItem.RoundDropdownMenu
import io.legado.app.ui.widget.components.menuItem.RoundDropdownMenuItem
import io.legado.app.ui.widget.components.text.AppText
import io.legado.app.ui.widget.components.topbar.GlassMediumFlexibleTopAppBar
import io.legado.app.ui.widget.components.topbar.TopBarActionButton
import io.legado.app.ui.widget.components.topbar.TopBarNavigationButton
import io.legado.app.vbookextension.data.dao.ExtensionDao
import io.legado.app.vbookextension.data.entity.ExtensionEntity
import io.legado.app.vbookextension.data.repository.ExtensionRepository
import io.legado.app.vbookextension.loader.ExtensionLoader
import io.legado.app.vbookextension.model.PluginJson
import io.legado.app.vbookextension.runtime.VBookJsExtensionRunner
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json
import org.koin.compose.koinInject
import java.io.File

private const val ICON_TAB_KEY = "icon.png"

class ExtensionScriptEditActivity : BaseComposeActivity() {

    @Composable
    override fun Content() {
        val sourceUrl = remember { intent.getStringExtra("sourceUrl") ?: "" }
        val autoOpenDebug = remember { intent.getBooleanExtra("openDebug", false) }

        ExtensionScriptEditScreen(
            sourceUrl = sourceUrl,
            autoOpenDebug = autoOpenDebug,
            onBack = { finish() }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun ExtensionScriptEditScreen(
    sourceUrl: String,
    autoOpenDebug: Boolean,
    onBack: () -> Unit,
    extensionDao: ExtensionDao = koinInject(),
    extensionLoader: ExtensionLoader = koinInject(),
    extensionRunner: VBookJsExtensionRunner = koinInject()
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val json = remember { Json { ignoreUnknownKeys = true; isLenient = true } }

    var extensionEntity by remember { mutableStateOf<ExtensionEntity?>(null) }
    var extDir by remember { mutableStateOf<File?>(null) }

    val filesMap = remember { mutableStateMapOf<String, String>() }
    val deletedFilesSet = remember { mutableStateSetOf<String>() }
    var selectedTabKey by remember { mutableStateOf("plugin.json") }

    var isEnabled by remember { mutableStateOf(true) }
    var hasExplore by remember { mutableStateOf(false) }
    var isPinned by remember { mutableStateOf(false) }
    var showTypeDropdown by remember { mutableStateOf(false) }
    var selectedType by remember { mutableStateOf("JS (Rhino)") }

    var iconFile by remember { mutableStateOf<File?>(null) }
    var newIconBytes by remember { mutableStateOf<ByteArray?>(null) }
    var isIconDeleted by remember { mutableStateOf(false) }

    var isSaving by remember { mutableStateOf(false) }
    var showDebugDialog by remember { mutableStateOf(autoOpenDebug) }
    var showOverflowMenu by remember { mutableStateOf(false) }
    var showAddFileDialog by remember { mutableStateOf(false) }
    var newFilePathInput by remember { mutableStateOf("") }
    var showDeleteConfirmPath by remember { mutableStateOf<String?>(null) }

    val iconPickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri: Uri? ->
        uri?.let {
            try {
                context.contentResolver.openInputStream(it)?.use { input ->
                    newIconBytes = input.readBytes()
                    isIconDeleted = false
                }
            } catch (e: Exception) {
                Toast.makeText(context, "Không thể đọc file ảnh: ${e.message}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    val slug = remember(sourceUrl) { ExtensionRepository.getSlugFromId(sourceUrl) }

    LaunchedEffect(slug) {
        withContext(Dispatchers.IO) {
            val entity = extensionDao.getExtensionById(slug)
            extensionEntity = entity
            isEnabled = entity?.isEnabled ?: true
            val prefs = context.getSharedPreferences("novel_reader_prefs", Context.MODE_PRIVATE)
            isPinned = prefs.getBoolean("ext_pinned_$slug", false)

            val dir = entity?.localPath?.let { File(it) }
            extDir = dir

            if (dir != null && dir.exists()) {
                filesMap.clear()
                deletedFilesSet.clear()

                val existingIcon = File(dir, "icon.png")
                iconFile = if (existingIcon.exists()) existingIcon else null

                val pluginJsonFile = File(dir, "plugin.json")
                if (pluginJsonFile.exists()) {
                    filesMap["plugin.json"] = pluginJsonFile.readText()
                }

                if (dir.isDirectory) {
                    dir.walkTopDown().forEach { file ->
                        if (file.isFile) {
                            val relPath = file.relativeTo(dir).path.replace('\\', '/')
                            if (relPath != "icon.png" && relPath != "plugin.json") {
                                val ext = file.extension.lowercase()
                                if (ext in listOf("js", "json", "txt", "md", "ts", "html", "css")) {
                                    try {
                                        filesMap[relPath] = file.readText()
                                    } catch (_: Exception) {}
                                }
                            }
                        }
                    }
                }
            }
            hasExplore = filesMap.containsKey("src/home.js") || filesMap.containsKey("src/genre.js")
        }
    }

    val sortedTabKeys = remember(filesMap.keys.toList(), isIconDeleted, iconFile, newIconBytes) {
        val keys = filesMap.keys.toMutableList()
        val defaultOrder = listOf("plugin.json", "src/home.js", "src/genre.js", "src/detail.js", "src/search.js", "src/chap.js", "src/toc.js")

        keys.sortWith { a, b ->
            val idxA = defaultOrder.indexOf(a)
            val idxB = defaultOrder.indexOf(b)
            when {
                idxA != -1 && idxB != -1 -> idxA.compareTo(idxB)
                idxA != -1 -> -1
                idxB != -1 -> 1
                else -> a.compareTo(b)
            }
        }

        if (!isIconDeleted && (iconFile != null || newIconBytes != null)) {
            if (!keys.contains(ICON_TAB_KEY)) {
                keys.add(ICON_TAB_KEY)
            }
        }
        keys
    }

    fun saveChanges(onSuccess: (() -> Unit)? = null) {
        val dir = extDir ?: return
        if (isSaving) return
        isSaving = true

        // Create immutable snapshots on Main thread
        if (hasExplore && !filesMap.containsKey("src/genre.js") && !filesMap.containsKey("src/home.js")) {
            filesMap["src/genre.js"] = "// Explore script\n"
        }
        val filesSnapshot = filesMap.toMap()
        val deletedFilesSnapshot = deletedFilesSet.toSet()
        val iconBytesSnapshot = newIconBytes?.copyOf()
        val iconDeletedSnapshot = isIconDeleted
        val enabledSnapshot = isEnabled
        val pinnedSnapshot = isPinned
        val entitySnapshot = extensionEntity

        scope.launch(Dispatchers.IO) {
            var saveSucceeded = false
            var updatedEntity: ExtensionEntity? = null

            try {
                if (!dir.exists()) dir.mkdirs()

                // Save pin preference
                context.getSharedPreferences("novel_reader_prefs", Context.MODE_PRIVATE)
                    .edit()
                    .putBoolean("ext_pinned_$slug", pinnedSnapshot)
                    .apply()

                // Delete removed files from disk
                deletedFilesSnapshot.forEach { relPath ->
                    val fileToDelete = File(dir, relPath)
                    if (fileToDelete.exists()) {
                        fileToDelete.delete()
                    }
                }

                // Delete or write icon file
                if (iconDeletedSnapshot) {
                    val iconFileOnDisk = File(dir, "icon.png")
                    if (iconFileOnDisk.exists()) iconFileOnDisk.delete()
                } else if (iconBytesSnapshot != null) {
                    File(dir, "icon.png").writeBytes(iconBytesSnapshot)
                }

                // Write edited files using snapshot
                filesSnapshot.forEach { (relPath, content) ->
                    val targetFile = File(dir, relPath)
                    targetFile.parentFile?.mkdirs()
                    targetFile.writeText(content)
                }

                // Reload plugin.json and update entity using snapshot
                val pluginJsonText = filesSnapshot["plugin.json"]
                if (!pluginJsonText.isNullOrBlank()) {
                    val parsed = json.decodeFromString(PluginJson.serializer(), pluginJsonText)
                    if (entitySnapshot != null) {
                        updatedEntity = entitySnapshot.copy(
                            name = parsed.metadata.name,
                            author = parsed.metadata.author,
                            version = parsed.metadata.version.toInt(),
                            source = parsed.metadata.source.ifBlank { entitySnapshot.source },
                            type = parsed.metadata.type,
                            description = parsed.metadata.description.ifBlank { entitySnapshot.description },
                            iconPath = if (!iconDeletedSnapshot && File(dir, "icon.png").exists()) File(dir, "icon.png").absolutePath else null,
                            isEnabled = enabledSnapshot
                        )
                        extensionDao.insert(updatedEntity)
                    }
                } else if (entitySnapshot != null) {
                    updatedEntity = entitySnapshot.copy(isEnabled = enabledSnapshot)
                    extensionDao.insert(updatedEntity)
                }

                // Clear runner cache
                extensionRunner.clearCache(slug)
                saveSucceeded = true
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    Toast.makeText(context, "Lỗi khi lưu: ${e.message}", Toast.LENGTH_LONG).show()
                }
            } finally {
                withContext(Dispatchers.Main) {
                    isSaving = false
                    if (saveSucceeded) {
                        if (updatedEntity != null) {
                            extensionEntity = updatedEntity
                        }
                        if (onSuccess != null) {
                            onSuccess()
                        } else {
                            Toast.makeText(context, "Đã lưu nguồn Extension thành công!", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        }
    }

    AppScaffold(
        topBar = {
            GlassMediumFlexibleTopAppBar(
                title = "Sửa nguồn Extension",
                subtitle = extensionEntity?.let { "${it.name} v${it.version}" },
                navigationIcon = {
                    TopBarNavigationButton(onClick = onBack)
                },
                actions = {
                    TopBarActionButton(
                        onClick = { saveChanges() },
                        imageVector = Icons.Default.Save,
                        contentDescription = "Lưu"
                    )
                    TopBarActionButton(
                        onClick = {
                            saveChanges {
                                showDebugDialog = true
                            }
                        },
                        imageVector = Icons.Default.BugReport,
                        contentDescription = "Gỡ lỗi"
                    )
                    Box {
                        IconButton(onClick = { showOverflowMenu = true }) {
                            Icon(
                                imageVector = Icons.Default.MoreVert,
                                contentDescription = "Xem thêm",
                                tint = LegadoTheme.colorScheme.onSurface
                            )
                        }
                        RoundDropdownMenu(
                            expanded = showOverflowMenu,
                            onDismissRequest = { showOverflowMenu = false }
                        ) {
                            RoundDropdownMenuItem(
                                text = "Thêm file script",
                                onClick = {
                                    newFilePathInput = "src/"
                                    showAddFileDialog = true
                                    showOverflowMenu = false
                                }
                            )
                            RoundDropdownMenuItem(
                                text = "Xem Cấu hình",
                                onClick = {
                                    selectedTabKey = "plugin.json"
                                    showOverflowMenu = false
                                }
                            )
                            RoundDropdownMenuItem(
                                text = "Sửa bằng AI",
                                onClick = {
                                    Toast.makeText(context, "Tính năng Sửa bằng AI đang được kết nối", Toast.LENGTH_SHORT).show()
                                    showOverflowMenu = false
                                }
                            )
                            if (selectedTabKey != "plugin.json" && selectedTabKey != ICON_TAB_KEY) {
                                RoundDropdownMenuItem(
                                    text = "Xóa file script này",
                                    onClick = {
                                        showDeleteConfirmPath = selectedTabKey
                                        showOverflowMenu = false
                                    }
                                )
                            }
                        }
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(LegadoTheme.colorScheme.surface)
        ) {
            // Header Controls Row
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(LegadoTheme.colorScheme.surface)
                    .padding(horizontal = 16.dp, vertical = 6.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Box {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .clickable { showTypeDropdown = true }
                            .padding(vertical = 4.dp)
                    ) {
                        Text(
                            text = "Loại: $selectedType",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Medium,
                            color = LegadoTheme.colorScheme.primary
                        )
                        Icon(
                            imageVector = Icons.Default.ArrowDropDown,
                            contentDescription = null,
                            tint = LegadoTheme.colorScheme.primary,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                    RoundDropdownMenu(
                        expanded = showTypeDropdown,
                        onDismissRequest = { showTypeDropdown = false }
                    ) {
                        RoundDropdownMenuItem(
                            text = "JS (Rhino)",
                            onClick = {
                                selectedType = "JS (Rhino)"
                                showTypeDropdown = false
                            }
                        )
                    }
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.clickable { isEnabled = !isEnabled }
                    ) {
                        Checkbox(
                            checked = isEnabled,
                            onCheckedChange = { isEnabled = it },
                            colors = CheckboxDefaults.colors(
                                checkedColor = LegadoTheme.colorScheme.primary
                            ),
                            modifier = Modifier.scale(0.85f)
                        )
                        Text(
                            text = "Kích hoạt",
                            fontSize = 12.sp,
                            color = LegadoTheme.colorScheme.onSurface
                        )
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.clickable {
                            val newValue = !hasExplore
                            hasExplore = newValue
                            if (newValue && !filesMap.containsKey("src/home.js") && !filesMap.containsKey("src/genre.js")) {
                                filesMap["src/genre.js"] = "// Explore script\n"
                                selectedTabKey = "src/genre.js"
                            }
                        }
                    ) {
                        Checkbox(
                            checked = hasExplore,
                            onCheckedChange = { checked ->
                                hasExplore = checked
                                if (checked && !filesMap.containsKey("src/home.js") && !filesMap.containsKey("src/genre.js")) {
                                    filesMap["src/genre.js"] = "// Explore script\n"
                                    selectedTabKey = "src/genre.js"
                                }
                            },
                            colors = CheckboxDefaults.colors(
                                checkedColor = LegadoTheme.colorScheme.primary
                            ),
                            modifier = Modifier.scale(0.85f)
                        )
                        Text(
                            text = "Khám phá",
                            fontSize = 12.sp,
                            color = LegadoTheme.colorScheme.onSurface
                        )
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.clickable { isPinned = !isPinned }
                    ) {
                        Checkbox(
                            checked = isPinned,
                            onCheckedChange = { isPinned = it },
                            colors = CheckboxDefaults.colors(
                                checkedColor = LegadoTheme.colorScheme.primary
                            ),
                            modifier = Modifier.scale(0.85f)
                        )
                        Text(
                            text = "Ghim",
                            fontSize = 12.sp,
                            color = LegadoTheme.colorScheme.onSurface
                        )
                    }
                }
            }

            HorizontalDivider(color = LegadoTheme.colorScheme.outlineVariant.copy(alpha = 0.2f))

            // Horizontal Pill Tab Bar
            val tabScrollState = rememberScrollState()
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(tabScrollState)
                    .background(LegadoTheme.colorScheme.surface)
                    .padding(horizontal = 8.dp, vertical = 6.dp),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                sortedTabKeys.forEach { tabKey ->
                    val isSelected = selectedTabKey == tabKey
                    Surface(
                        selected = isSelected,
                        onClick = { selectedTabKey = tabKey },
                        shape = RoundedCornerShape(8.dp),
                        color = if (isSelected) LegadoTheme.colorScheme.primaryContainer else Color.Transparent,
                        contentColor = if (isSelected) LegadoTheme.colorScheme.onPrimaryContainer else LegadoTheme.colorScheme.onSurfaceVariant
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                        ) {
                            if (tabKey == ICON_TAB_KEY) {
                                Icon(
                                    imageVector = Icons.Default.Image,
                                    contentDescription = null,
                                    modifier = Modifier.size(14.dp)
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                            }
                            Text(
                                text = tabKey,
                                fontSize = 13.sp,
                                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal
                            )
                            if (tabKey != "plugin.json" && tabKey != ICON_TAB_KEY) {
                                Spacer(modifier = Modifier.width(6.dp))
                                Box(
                                    modifier = Modifier
                                        .size(16.dp)
                                        .clip(CircleShape)
                                        .clickable { showDeleteConfirmPath = tabKey },
                                    contentAlignment = Alignment.Center
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Close,
                                        contentDescription = "Xóa file",
                                        modifier = Modifier.size(12.dp),
                                        tint = if (isSelected) LegadoTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.7f) else LegadoTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.7f)
                                    )
                                }
                            }
                        }
                    }
                }

                IconButton(
                    onClick = {
                        newFilePathInput = "src/"
                        showAddFileDialog = true
                    },
                    modifier = Modifier.size(32.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Thêm file mới",
                        tint = LegadoTheme.colorScheme.onSurfaceVariant
                    )
                }
            }

            HorizontalDivider(color = LegadoTheme.colorScheme.outlineVariant.copy(alpha = 0.3f))

            // Code / Content Editor Area
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .background(LegadoTheme.colorScheme.surface)
            ) {
                if (selectedTabKey == ICON_TAB_KEY) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(24.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        val iconPath = iconFile?.absolutePath
                        SourceIcon(
                            path = iconPath,
                            modifier = Modifier.size(96.dp)
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            Button(onClick = { iconPickerLauncher.launch("image/*") }) {
                                Icon(Icons.Default.Image, contentDescription = null)
                                Spacer(modifier = Modifier.width(6.dp))
                                Text("Đổi Icon")
                            }

                            OutlinedButton(
                                onClick = {
                                    isIconDeleted = true
                                    newIconBytes = null
                                    selectedTabKey = "plugin.json"
                                }
                            ) {
                                Icon(Icons.Default.Delete, contentDescription = null, tint = MaterialTheme.colorScheme.error)
                                Spacer(modifier = Modifier.width(6.dp))
                                Text("Xóa Icon", color = MaterialTheme.colorScheme.error)
                            }
                        }
                    }
                } else {
                    val codeText = filesMap[selectedTabKey] ?: ""
                    OutlinedTextField(
                        value = codeText,
                        onValueChange = { filesMap[selectedTabKey] = it },
                        modifier = Modifier
                            .fillMaxSize()
                            .imePadding(),
                        textStyle = TextStyle(
                            fontFamily = FontFamily.Monospace,
                            fontSize = 13.sp,
                            color = LegadoTheme.colorScheme.onSurface
                        ),
                        shape = RoundedCornerShape(0.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedContainerColor = LegadoTheme.colorScheme.surface,
                            unfocusedContainerColor = LegadoTheme.colorScheme.surface,
                            disabledContainerColor = LegadoTheme.colorScheme.surface,
                            focusedBorderColor = Color.Transparent,
                            unfocusedBorderColor = Color.Transparent,
                            focusedTextColor = LegadoTheme.colorScheme.onSurface,
                            unfocusedTextColor = LegadoTheme.colorScheme.onSurface
                        )
                    )
                }
            }
        }
    }

    // Add File Dialog
    if (showAddFileDialog) {
        AppAlertDialog(
            show = true,
            onDismissRequest = { showAddFileDialog = false },
            title = "Thêm file script mới",
            content = {
                OutlinedTextField(
                    value = newFilePathInput,
                    onValueChange = { newFilePathInput = it },
                    label = { Text("Đường dẫn file (ví dụ: src/extra.js)") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )
            },
            confirmText = "Tạo file",
            onConfirm = {
                val path = newFilePathInput.trim()
                if (path.isNotBlank()) {
                    filesMap[path] = "// Script $path\n"
                    selectedTabKey = path
                }
                showAddFileDialog = false
            },
            dismissText = "Hủy",
            onDismiss = { showAddFileDialog = false }
        )
    }

    // Delete File Confirm Dialog
    showDeleteConfirmPath?.let { pathToDelete ->
        AppAlertDialog(
            show = true,
            onDismissRequest = { showDeleteConfirmPath = null },
            title = "Xác nhận xóa file",
            content = {
                AppText("Bạn có chắc chắn muốn xóa file '$pathToDelete' không?")
            },
            confirmText = "Xóa",
            onConfirm = {
                filesMap.remove(pathToDelete)
                deletedFilesSet.add(pathToDelete)
                if (selectedTabKey == pathToDelete) {
                    selectedTabKey = "plugin.json"
                }
                showDeleteConfirmPath = null
            },
            dismissText = "Hủy",
            onDismiss = { showDeleteConfirmPath = null }
        )
    }

    // Extension Debug Dialog
    if (showDebugDialog) {
        ExtensionDebugDialog(
            sourceUrl = sourceUrl,
            onDismissRequest = { showDebugDialog = false }
        )
    }
}
