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
import io.legado.app.ui.config.otherConfig.OtherConfig
import io.legado.app.ui.widget.components.AppTextField
import io.legado.app.ui.widget.components.alert.AppAlertDialog

@Composable
fun DownloadSettingsDialog(
    onDismiss: () -> Unit,
    onConfirm: () -> Unit
) {
    var threadCount by remember { mutableStateOf(OtherConfig.cacheBookThreadCount.toString()) }
    var downloadDelay by remember { mutableStateOf(OtherConfig.downloadDelay.toString()) }

    AppAlertDialog(
        show = true,
        onDismissRequest = onDismiss,
        title = "Cài đặt tải truyện",
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
        confirmText = "Bắt đầu tải",
        onConfirm = {
            OtherConfig.cacheBookThreadCount = threadCount.toIntOrNull() ?: 1
            OtherConfig.downloadDelay = downloadDelay.toLongOrNull() ?: 0L
            onConfirm()
            onDismiss()
        },
        dismissText = stringResource(android.R.string.cancel),
        onDismiss = onDismiss
    )
}
