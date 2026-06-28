package io.legado.app.ui.widget.components.dialog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.RadioButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import io.legado.app.data.entities.Book
import io.legado.app.help.AppGoogleDrive
import io.legado.app.help.book.isImage
import io.legado.app.ui.theme.LegadoTheme
import io.legado.app.ui.widget.components.AppTextField
import io.legado.app.ui.widget.components.alert.AppAlertDialog
import io.legado.app.ui.widget.components.button.PrimaryButton
import io.legado.app.ui.widget.components.button.SecondaryButton
import io.legado.app.ui.widget.components.button.series.SmallTonalButton
import io.legado.app.ui.widget.components.text.AppText

@Composable
fun BookExportDialog(
    book: Book,
    cacheCount: Int,
    onDismiss: () -> Unit,
    onConfirm: (scope: String?, type: String, uploadToGd: Boolean) -> Unit
) {
    var exportAll by remember { mutableStateOf(true) }
    var scopeInput by remember { mutableStateOf("1-${book.totalChapterNum}") }
    val isImage = book.isImage
    var exportType by remember { mutableStateOf(if (isImage) "cbz" else "txt") }
    
    val context = LocalContext.current
    val isDriveLoggedIn = remember { io.legado.app.ui.config.backupConfig.BackupConfig.googleDriveEmail.isNotEmpty() }

    AppAlertDialog(
        show = true,
        onDismissRequest = onDismiss,
        title = "Xuất file: ${book.name}",
        onConfirm = null,
        onDismiss = null,
        content = {
            Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                // Cache status text
                AppText(
                    text = "Trạng thái: Đã tải $cacheCount / ${book.totalChapterNum} chương",
                    style = LegadoTheme.typography.bodyMedium,
                    color = LegadoTheme.colorScheme.onSurfaceVariant
                )

                // Export range options
                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(
                            selected = exportAll,
                            onClick = { exportAll = true }
                        )
                        AppText(
                            text = "Xuất tất cả các chương đã tải",
                            modifier = Modifier.padding(start = 8.dp),
                            style = LegadoTheme.typography.bodyMedium
                        )
                    }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(
                            selected = !exportAll,
                            onClick = { exportAll = false }
                        )
                        AppText(
                            text = "Chọn khoảng chương cần xuất",
                            modifier = Modifier.padding(start = 8.dp),
                            style = LegadoTheme.typography.bodyMedium
                        )
                    }
                }

                // Range input text field
                if (!exportAll) {
                    AppTextField(
                        value = scopeInput,
                        onValueChange = { scopeInput = it },
                        modifier = Modifier.fillMaxWidth(),
                        label = "Khoảng chương (Ví dụ: 1-100 hoặc 1-10,15-20)",
                        placeholder = { AppText("1-${book.totalChapterNum}") }
                    )
                }

                // Export type selection tabs (TXT, EPUB, ZIP)
                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    AppText(
                        text = "Định dạng xuất:",
                        style = LegadoTheme.typography.labelMedium,
                        color = LegadoTheme.colorScheme.primary
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        val types = if (isImage) {
                            listOf("cbz" to "CBZ", "webp+cbz" to "WEBP+CBZ")
                        } else {
                            listOf("txt" to "TXT", "epub" to "EPUB", "zip" to "ZIP")
                        }
                        types.forEach { (typeKey, typeLabel) ->
                            val isSelected = exportType == typeKey
                            SmallTonalButton(
                                onClick = { exportType = typeKey },
                                text = typeLabel,
                                modifier = Modifier.weight(1f),
                                contentColor = if (isSelected) LegadoTheme.colorScheme.onPrimary else LegadoTheme.colorScheme.onSurface,
                                containerColor = if (isSelected) LegadoTheme.colorScheme.primary else LegadoTheme.colorScheme.surfaceContainer
                            )
                        }
                    }
                }

                // Action Buttons (Hủy, Lưu máy, Lên Drive)
                Row(
                    modifier = Modifier.fillMaxWidth().padding(top = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    SecondaryButton(
                        onClick = onDismiss,
                        text = "Hủy",
                        modifier = Modifier.weight(1f)
                    )
                    
                    PrimaryButton(
                        onClick = {
                            val finalScope = if (exportAll) null else scopeInput.trim()
                            onConfirm(finalScope, exportType, false)
                            onDismiss()
                        },
                        text = "Lưu máy",
                        modifier = Modifier.weight(1f)
                    )
                    
                    if (isDriveLoggedIn) {
                        PrimaryButton(
                            onClick = {
                                val finalScope = if (exportAll) null else scopeInput.trim()
                                onConfirm(finalScope, exportType, true)
                                onDismiss()
                            },
                            text = "Lên Drive",
                            modifier = Modifier.weight(1f)
                        )
                    }
                }
            }
        }
    )
}
