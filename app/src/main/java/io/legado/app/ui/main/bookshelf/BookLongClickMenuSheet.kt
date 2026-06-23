package io.legado.app.ui.main.bookshelf

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.UploadFile
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.legado.app.ui.theme.LegadoTheme
import io.legado.app.ui.widget.components.modalBottomSheet.AppModalBottomSheet
import io.legado.app.ui.widget.components.text.AppText

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookLongClickMenuSheet(
    show: Boolean,
    book: BookShelfItem,
    onDismissRequest: () -> Unit,
    onExport: () -> Unit,
    onDownload: () -> Unit,
    onShare: () -> Unit,
    onDelete: () -> Unit
) {
    AppModalBottomSheet(
        show = show,
        onDismissRequest = onDismissRequest,
        title = book.name
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            MenuItem(
                title = "Xuất file",
                icon = Icons.Default.UploadFile,
                onClick = {
                    onExport()
                    onDismissRequest()
                }
            )
            MenuItem(
                title = "Tải truyện",
                icon = Icons.Default.Download,
                onClick = {
                    onDownload()
                    onDismissRequest()
                }
            )
            MenuItem(
                title = "Chia sẻ truyện",
                icon = Icons.Default.Share,
                onClick = {
                    onShare()
                    onDismissRequest()
                }
            )
            MenuItem(
                title = "Xóa truyện",
                icon = Icons.Default.Delete,
                onClick = {
                    onDelete()
                    onDismissRequest()
                }
            )
        }
    }
}

@Composable
private fun MenuItem(
    title: String,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(horizontal = 20.dp, vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = title,
            tint = LegadoTheme.colorScheme.onSurface
        )
        AppText(
            text = title,
            modifier = Modifier.padding(start = 16.dp),
            style = LegadoTheme.typography.bodyLarge
        )
    }
}
