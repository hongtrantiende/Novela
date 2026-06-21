package io.legado.app.ui.book.changesource

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import io.legado.app.R
import io.legado.app.domain.usecase.ChangeSourceMigrationOptions
import io.legado.app.ui.theme.LegadoTheme
import io.legado.app.ui.widget.components.button.ConfirmDismissButtonsRow
import io.legado.app.ui.widget.components.checkBox.CheckboxItem
import io.legado.app.ui.widget.components.modalBottomSheet.AppModalBottomSheet
import io.legado.app.ui.widget.components.text.AppText

@Composable
fun ChangeSourceMigrationOptionsSheet(
    show: Boolean,
    title: String,
    subtitle: String? = null,
    onDismissRequest: () -> Unit,
    onConfirm: (ChangeSourceMigrationOptions) -> Unit,
) {
    var migrateReadingProgress by rememberSaveable(show) {
        mutableStateOf(ChangeSourceConfig.migrateReadingProgress)
    }
    var migrateGroup by rememberSaveable(show) {
        mutableStateOf(ChangeSourceConfig.migrateGroup)
    }
    var migrateCover by rememberSaveable(show) {
        mutableStateOf(ChangeSourceConfig.migrateCover)
    }
    var migrateCategory by rememberSaveable(show) {
        mutableStateOf(ChangeSourceConfig.migrateCategory)
    }
    var migrateRemark by rememberSaveable(show) {
        mutableStateOf(ChangeSourceConfig.migrateRemark)
    }
    var migrateReadConfig by rememberSaveable(show) {
        mutableStateOf(ChangeSourceConfig.migrateReadConfig)
    }
    var deleteDownloadedChapters by rememberSaveable(show) {
        mutableStateOf(ChangeSourceConfig.deleteDownloadedChapters)
    }

    AppModalBottomSheet(
        show = show,
        onDismissRequest = onDismissRequest,
        title = title,
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            subtitle?.takeIf { it.isNotBlank() }?.let {
                AppText(
                    text = it,
                    style = LegadoTheme.typography.bodySmall,
                    color = LegadoTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
            }
            CheckboxItem("tiến độ đọc", checked = migrateReadingProgress) {
                migrateReadingProgress = it
            }
            if (migrateReadingProgress) {
                AppText(
                    text = "Nếu tổng số chương trong Tân Nguyên ít hơn tiến độ thì tiến độ đọc sẽ được điều chỉnh về chương cuối cùng.",
                    style = LegadoTheme.typography.bodySmall,
                    color = LegadoTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.padding(horizontal = 12.dp)
                )
            }
            CheckboxItem("Nhóm và sắp xếp", checked = migrateGroup) { migrateGroup = it }
            CheckboxItem("Bìa tùy chỉnh", checked = migrateCover) { migrateCover = it }
            CheckboxItem("Phân loại và thẻ", checked = migrateCategory) { migrateCategory = it }
            CheckboxItem("Ghi chú và giới thiệu tùy chỉnh", checked = migrateRemark) { migrateRemark = it }
            CheckboxItem("Cài đặt đọc", checked = migrateReadConfig) { migrateReadConfig = it }
            CheckboxItem("Xóa các chương đã tải xuống", checked = deleteDownloadedChapters) {
                deleteDownloadedChapters = it
            }
            Spacer(modifier = Modifier.height(8.dp))
            ConfirmDismissButtonsRow(
                onDismiss = onDismissRequest,
                onConfirm = {
                    onConfirm(
                        ChangeSourceMigrationOptions(
                            migrateChapters = true,
                            migrateReadingProgress = migrateReadingProgress,
                            migrateGroup = migrateGroup,
                            migrateCover = migrateCover,
                            migrateCategory = migrateCategory,
                            migrateRemark = migrateRemark,
                            migrateReadConfig = migrateReadConfig,
                            deleteDownloadedChapters = deleteDownloadedChapters,
                        )
                    )
                },
                dismissText = stringResource(R.string.cancel),
                confirmText = stringResource(android.R.string.ok),
            )
            Spacer(modifier = Modifier.height(12.dp))
        }
    }
}
