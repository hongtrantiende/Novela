package io.legado.app.vbookextension.ui

import android.net.Uri
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.Save
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import io.legado.app.ui.theme.LegadoTheme
import io.legado.app.ui.widget.components.alert.AppAlertDialog
import io.legado.app.ui.widget.components.image.sourceIcon.SourceIcon
import io.legado.app.ui.widget.components.text.AppText
import io.legado.app.vbookextension.data.dao.ExtensionDao
import io.legado.app.vbookextension.data.entity.ExtensionEntity
import io.legado.app.vbookextension.loader.ExtensionLoader
import io.legado.app.vbookextension.model.PluginJson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json
import org.koin.compose.koinInject
import java.io.File

private const val ICON_TAB_KEY = "__ICON_TAB__"

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExtensionScriptEditDialog(
    extension: ExtensionEntity,
    onDismissRequest: () -> Unit,
    onSaveSuccess: () -> Unit,
    extensionDao: ExtensionDao = koinInject(),
    extensionLoader: ExtensionLoader = koinInject()
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val extDir = remember(extension.localPath) { File(extension.localPath) }

    val filesMap = remember { mutableStateMapOf<String, String>() }
    val deletedFilesSet = remember { mutableStateSetOf<String>() }
    var selectedTabKey by remember { mutableStateOf("plugin.json") }

    var iconFile by remember { mutableStateOf<File?>(null) }
    var newIconBytes by remember { mutableStateOf<ByteArray?>(null) }
    var isIconDeleted by remember { mutableStateOf(false) }

    var isSaving by remember { mutableStateOf(false) }
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

    LaunchedEffect(extDir) {
        withContext(Dispatchers.IO) {
            filesMap.clear()
            deletedFilesSet.clear()

            val existingIcon = File(extDir, "icon.png")
            iconFile = if (existingIcon.exists()) existingIcon else null

            val pluginJsonFile = File(extDir, "plugin.json")
            if (pluginJsonFile.exists()) {
                filesMap["plugin.json"] = pluginJsonFile.readText()
            }

            if (extDir.exists() && extDir.isDirectory) {
                extDir.walkTopDown().forEach { file ->
                    if (file.isFile) {
                        val relPath = file.relativeTo(extDir).path.replace('\\', '/')
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

            val sortedKeys = filesMap.keys.sortedWith(Comparator { a, b ->
                if (a == "plugin.json") -1 else if (b == "plugin.json") 1 else a.compareTo(b)
            })
            if (sortedKeys.isNotEmpty() && !filesMap.containsKey(selectedTabKey)) {
                selectedTabKey = sortedKeys.first()
            }
        }
    }

    Dialog(
        onDismissRequest = onDismissRequest,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Surface(
            shape = RoundedCornerShape(16.dp),
            color = LegadoTheme.colorScheme.surface,
            tonalElevation = 6.dp,
            modifier = Modifier
                .fillMaxWidth(0.95f)
                .fillMaxHeight(0.92f)
                .padding(vertical = 16.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                // Dialog Header
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        AppText(
                            text = "Sửa mã nguồn: ${extension.name}",
                            style = LegadoTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = LegadoTheme.colorScheme.primary
                        )
                        AppText(
                            text = extension.localPath,
                            style = LegadoTheme.typography.bodySmall,
                            color = LegadoTheme.colorScheme.onSurfaceVariant,
                            maxLines = 1
                        )
                    }

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button(
                            onClick = {
                                if (isSaving) return@Button
                                isSaving = true
                                scope.launch(Dispatchers.IO) {
                                    try {
                                        deletedFilesSet.forEach { relPath ->
                                            File(extDir, relPath).delete()
                                        }

                                        filesMap.forEach { (relPath, content) ->
                                            val targetFile = File(extDir, relPath)
                                            targetFile.parentFile?.mkdirs()
                                            targetFile.writeText(content)
                                        }

                                        if (isIconDeleted) {
                                            File(extDir, "icon.png").delete()
                                        } else if (newIconBytes != null) {
                                            File(extDir, "icon.png").writeBytes(newIconBytes!!)
                                        }

                                        val pluginJsonFile = File(extDir, "plugin.json")
                                        if (pluginJsonFile.exists()) {
                                            try {
                                                val jsonStr = pluginJsonFile.readText().replace("\uFEFF", "")
                                                val json = Json { ignoreUnknownKeys = true; isLenient = true }
                                                val pluginJson = json.decodeFromString<PluginJson>(jsonStr)
                                                val meta = pluginJson.metadata
                                                val hasIcon = File(extDir, "icon.png").exists()
                                                val updatedIconPath = if (hasIcon) File(extDir, "icon.png").absolutePath else null

                                                val updatedEntity = extension.copy(
                                                    name = meta.name,
                                                    version = meta.version.toInt(),
                                                    author = meta.author,
                                                    description = meta.description,
                                                    type = meta.type,
                                                    locale = meta.locale,
                                                    iconPath = updatedIconPath
                                                )
                                                extensionDao.insert(updatedEntity)
                                            } catch (e: Exception) {
                                                android.util.Log.e("ScriptEdit", "Error updating DB from plugin.json", e)
                                            }
                                        }

                                        extensionLoader.clearCache(extension.id)

                                        withContext(Dispatchers.Main) {
                                            isSaving = false
                                            Toast.makeText(context, "Đã lưu thay đổi mã nguồn thành công!", Toast.LENGTH_SHORT).show()
                                            onSaveSuccess()
                                        }
                                    } catch (e: Exception) {
                                        withContext(Dispatchers.Main) {
                                            isSaving = false
                                            Toast.makeText(context, "Lỗi khi lưu: ${e.message}", Toast.LENGTH_LONG).show()
                                        }
                                    }
                                }
                            },
                            enabled = !isSaving,
                            shape = RoundedCornerShape(8.dp),
                            contentPadding = PaddingValues(horizontal = 14.dp, vertical = 6.dp)
                        ) {
                            Icon(Icons.Default.Save, contentDescription = null, modifier = Modifier.size(18.dp))
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(if (isSaving) "Đang lưu..." else "Lưu", fontWeight = FontWeight.Bold)
                        }

                        IconButton(
                            onClick = onDismissRequest,
                            modifier = Modifier.size(36.dp)
                        ) {
                            Icon(Icons.Default.Close, contentDescription = "Đóng", tint = LegadoTheme.colorScheme.onSurfaceVariant)
                        }
                    }
                }

                HorizontalDivider(modifier = Modifier.padding(vertical = 2.dp))

                // Scrollable File Tabs + Add File button
                val sortedFileKeys = remember(filesMap.keys.toList()) {
                    filesMap.keys.sortedWith(Comparator { a, b ->
                        if (a == "plugin.json") -1 else if (b == "plugin.json") 1 else a.compareTo(b)
                    })
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .horizontalScroll(rememberScrollState()),
                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    sortedFileKeys.forEach { relPath ->
                        val isSelected = selectedTabKey == relPath
                        Button(
                            onClick = { selectedTabKey = relPath },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = if (isSelected) LegadoTheme.colorScheme.primary else LegadoTheme.colorScheme.surfaceVariant.copy(alpha = 0.6f),
                                contentColor = if (isSelected) LegadoTheme.colorScheme.onPrimary else LegadoTheme.colorScheme.onSurfaceVariant
                            ),
                            shape = RoundedCornerShape(8.dp),
                            contentPadding = PaddingValues(horizontal = 10.dp, vertical = 4.dp),
                            modifier = Modifier.height(34.dp)
                        ) {
                            Text(relPath, fontSize = 11.sp, fontWeight = FontWeight.Bold)
                        }
                    }

                    // Icon tab
                    val isIconTabSelected = selectedTabKey == ICON_TAB_KEY
                    Button(
                        onClick = { selectedTabKey = ICON_TAB_KEY },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (isIconTabSelected) LegadoTheme.colorScheme.primary else LegadoTheme.colorScheme.surfaceVariant.copy(alpha = 0.6f),
                            contentColor = if (isIconTabSelected) LegadoTheme.colorScheme.onPrimary else LegadoTheme.colorScheme.onSurfaceVariant
                        ),
                        shape = RoundedCornerShape(8.dp),
                        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 4.dp),
                        modifier = Modifier.height(34.dp)
                    ) {
                        Icon(Icons.Default.Image, contentDescription = null, modifier = Modifier.size(14.dp))
                        Spacer(modifier = Modifier.width(4.dp))
                        Text("icon.png", fontSize = 11.sp, fontWeight = FontWeight.Bold)
                    }

                    // Add File button
                    IconButton(
                        onClick = {
                            newFilePathInput = "src/"
                            showAddFileDialog = true
                        },
                        modifier = Modifier.size(34.dp)
                    ) {
                        Icon(
                            Icons.Default.Add,
                            contentDescription = "Thêm file mới",
                            tint = LegadoTheme.colorScheme.primary
                        )
                    }
                }

                // Tab Content Area
                if (selectedTabKey == ICON_TAB_KEY) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .padding(top = 8.dp)
                            .verticalScroll(rememberScrollState()),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        Text(
                            text = "Quản lý Icon Extension (icon.png)",
                            style = LegadoTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold
                        )

                        val currentIconPath: Any? = when {
                            newIconBytes != null -> newIconBytes
                            !isIconDeleted && iconFile != null -> iconFile
                            else -> null
                        }

                        Card(
                            shape = RoundedCornerShape(12.dp),
                            modifier = Modifier.size(100.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = LegadoTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f)
                            )
                        ) {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                SourceIcon(
                                    path = currentIconPath,
                                    modifier = Modifier.size(80.dp)
                                )
                            }
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            Button(
                                onClick = { iconPickerLauncher.launch("image/*") },
                                shape = RoundedCornerShape(8.dp)
                            ) {
                                Icon(Icons.Default.Image, contentDescription = null, modifier = Modifier.size(18.dp))
                                Spacer(modifier = Modifier.width(6.dp))
                                Text("Chọn ảnh icon mới")
                            }

                            if (currentIconPath != null) {
                                Button(
                                    onClick = {
                                        newIconBytes = null
                                        isIconDeleted = true
                                    },
                                    shape = RoundedCornerShape(8.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = LegadoTheme.colorScheme.errorContainer,
                                        contentColor = LegadoTheme.colorScheme.onErrorContainer
                                    )
                                ) {
                                    Icon(Icons.Default.Delete, contentDescription = null, modifier = Modifier.size(18.dp))
                                    Spacer(modifier = Modifier.width(6.dp))
                                    Text("Xóa Icon")
                                }
                            }
                        }
                    }
                } else {
                    val fileContent = filesMap[selectedTabKey] ?: ""
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f),
                        verticalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = selectedTabKey,
                                style = LegadoTheme.typography.labelMediumEmphasized,
                                color = LegadoTheme.colorScheme.primary
                            )

                            if (selectedTabKey != "plugin.json") {
                                TextButton(
                                    onClick = { showDeleteConfirmPath = selectedTabKey },
                                    colors = ButtonDefaults.textButtonColors(
                                        contentColor = LegadoTheme.colorScheme.error
                                    )
                                ) {
                                    Icon(Icons.Default.Delete, contentDescription = null, modifier = Modifier.size(16.dp))
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text("Xóa file này", fontSize = 12.sp)
                                }
                            }
                        }

                        OutlinedTextField(
                            value = fileContent,
                            onValueChange = { filesMap[selectedTabKey] = it },
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f)
                                .border(0.5.dp, LegadoTheme.colorScheme.outline.copy(alpha = 0.5f), RoundedCornerShape(8.dp)),
                            textStyle = TextStyle(
                                fontFamily = FontFamily.Monospace,
                                fontSize = 12.sp,
                                color = LegadoTheme.colorScheme.onSurface
                            ),
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = LegadoTheme.colorScheme.primary,
                                unfocusedBorderColor = Color.Transparent
                            )
                        )
                    }
                }
            }
        }
    }

    // Add File Dialog
    if (showAddFileDialog) {
        AlertDialog(
            onDismissRequest = { showAddFileDialog = false },
            title = { Text("Thêm file script mới") },
            text = {
                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text("Nhập đường dẫn tương đối của file script (ví dụ: src/custom.js):", fontSize = 12.sp)
                    OutlinedTextField(
                        value = newFilePathInput,
                        onValueChange = { newFilePathInput = it },
                        singleLine = true,
                        placeholder = { Text("src/custom.js") },
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        var path = newFilePathInput.trim()
                        if (path.isNotBlank()) {
                            if (!path.startsWith("src/") && path != "plugin.json" && !path.contains("/")) {
                                path = "src/$path"
                            }
                            filesMap[path] = "// Script file: $path\n"
                            deletedFilesSet.remove(path)
                            selectedTabKey = path
                            showAddFileDialog = false
                        }
                    }
                ) {
                    Text("Tạo file")
                }
            },
            dismissButton = {
                TextButton(onClick = { showAddFileDialog = false }) {
                    Text("Hủy")
                }
            }
        )
    }

    // Delete File Confirm Dialog
    showDeleteConfirmPath?.let { targetPath ->
        AppAlertDialog(
            show = true,
            onDismissRequest = { showDeleteConfirmPath = null },
            title = "Xóa file script",
            text = "Bạn có chắc chắn muốn xóa file '$targetPath' khỏi tiện ích không?",
            confirmText = "Xóa",
            onConfirm = {
                filesMap.remove(targetPath)
                deletedFilesSet.add(targetPath)
                val remainingKeys = filesMap.keys.sortedWith(Comparator { a, b ->
                    if (a == "plugin.json") -1 else if (b == "plugin.json") 1 else a.compareTo(b)
                })
                selectedTabKey = remainingKeys.firstOrNull() ?: ICON_TAB_KEY
                showDeleteConfirmPath = null
            },
            dismissText = "Hủy",
            onDismiss = { showDeleteConfirmPath = null }
        )
    }
}
