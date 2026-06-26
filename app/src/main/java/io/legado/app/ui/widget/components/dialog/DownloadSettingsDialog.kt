package io.legado.app.ui.widget.components.dialog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.stringResource
import io.legado.app.help.book.BookDownloadConfig
import io.legado.app.ui.config.otherConfig.OtherConfig
import io.legado.app.ui.widget.components.AppTextField
import io.legado.app.ui.widget.components.alert.AppAlertDialog

@Composable
fun DownloadSettingsDialog(
    bookUrl: String? = null,
    onDismiss: () -> Unit,
    onConfirm: () -> Unit
) {
    var threadCount by remember {
        mutableStateOf(
            if (bookUrl != null) BookDownloadConfig.getThreadCount(bookUrl).toString()
            else OtherConfig.cacheBookThreadCount.toString()
        )
    }
    var downloadDelay by remember {
        mutableStateOf(
            if (bookUrl != null) BookDownloadConfig.getDelay(bookUrl).toString()
            else OtherConfig.downloadDelay.toString()
        )
    }

    AppAlertDialog(
        show = true,
        onDismissRequest = onDismiss,
        title = if (bookUrl != null) "Cài đặt tải truyện (Cá nhân)" else "Cài đặt tải truyện (Chung)",
        content = {
            Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                AppTextField(
                    value = threadCount,
                    onValueChange = { threadCount = it },
                    label = "Số luồng tải"
                )
                AppTextField(
                    value = downloadDelay,
                    onValueChange = { downloadDelay = it },
                    label = "Độ trễ tải (ms)"
                )
            }
        },
        confirmText = if (bookUrl != null) "Xác nhận" else "Bắt đầu tải",
        onConfirm = {
            val tc = threadCount.toIntOrNull() ?: 1
            val delayVal = downloadDelay.toLongOrNull() ?: 0L
            if (bookUrl != null) {
                BookDownloadConfig.setThreadCount(bookUrl, tc)
                BookDownloadConfig.setDelay(bookUrl, delayVal)
            } else {
                OtherConfig.cacheBookThreadCount = tc
                OtherConfig.downloadDelay = delayVal
            }
            onConfirm()
            onDismiss()
        },
        dismissText = stringResource(android.R.string.cancel),
        onDismiss = onDismiss
    )
}
