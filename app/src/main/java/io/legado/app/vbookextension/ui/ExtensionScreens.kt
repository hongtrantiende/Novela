package io.legado.app.vbookextension.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.compose.material.icons.outlined.Language
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.PushPin
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import io.legado.app.ui.widget.components.topbar.GlassMediumFlexibleTopAppBar
import io.legado.app.ui.browser.WebViewActivity
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import io.legado.app.R
import io.legado.app.ui.theme.LegadoTheme
import io.legado.app.utils.toastOnUi
import io.legado.app.ui.widget.components.AppScaffold
import io.legado.app.ui.widget.components.alert.AppAlertDialog
import io.legado.app.ui.widget.components.card.GlassCard
import io.legado.app.ui.widget.components.divider.PillHeaderDivider
import io.legado.app.ui.widget.components.menuItem.MenuItemIcon
import io.legado.app.ui.widget.components.menuItem.RoundDropdownMenu
import io.legado.app.ui.widget.components.menuItem.RoundDropdownMenuItem
import io.legado.app.ui.widget.components.tabRow.AppTabRow
import io.legado.app.ui.widget.components.text.AppText
import io.legado.app.vbookextension.data.entity.ExtensionEntity
import io.legado.app.vbookextension.data.entity.RepositoryEntity
import io.legado.app.vbookextension.model.ExtensionInfo
import io.legado.app.ui.widget.components.image.sourceIcon.SourceIcon
import org.koin.androidx.compose.koinViewModel

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun ExtensionScreens(
    viewModel: ExtensionViewModel = koinViewModel()
) {
    val context = LocalContext.current
    val installed by viewModel.installedExtensions.collectAsStateWithLifecycle(initialValue = emptyList())
    val available by viewModel.availableExtensions.collectAsStateWithLifecycle()
    val repos by viewModel.repositories.collectAsStateWithLifecycle(initialValue = emptyList())
    val installingIds by viewModel.installingIds.collectAsStateWithLifecycle()
    val isLoading by viewModel.isLoading.collectAsStateWithLifecycle()
    val error by viewModel.error.collectAsStateWithLifecycle()

    val installedMap = remember(installed) { installed.associateBy { it.id } }

    val searchQuery by viewModel.searchQuery.collectAsStateWithLifecycle()
    val showAddRepoDialog by viewModel.showAddRepoDialog.collectAsStateWithLifecycle()
    val showManageReposDialog by viewModel.showManageReposDialog.collectAsStateWithLifecycle()
    var activeDetailExtension by remember { mutableStateOf<ExtensionEntity?>(null) }
    var showDeleteDialogFor by remember { mutableStateOf<ExtensionEntity?>(null) }
    var repoToDelete by remember { mutableStateOf<RepositoryEntity?>(null) }

    // Pre-calculate slugs for available extensions to avoid executing normalizer/regex inside item binder loop
    val availableSlugs = remember(available) {
        available.associateWith { it.name.toSlug() }
    }

    // Filter available extensions to get only those that are NOT installed
    val uninstalledExtensions = remember(available, installedMap, searchQuery, availableSlugs) {
        val list = available.filter { !installedMap.containsKey(availableSlugs[it]) }
        if (searchQuery.isBlank()) list else {
            list.filter {
                it.name.contains(searchQuery, ignoreCase = true) ||
                it.description.contains(searchQuery, ignoreCase = true) ||
                it.author.contains(searchQuery, ignoreCase = true)
            }
        }
    }

    // Pre-query pinned states to completely avoid calling getSharedPreferences during visible list binding
    val (filteredInstalled, pinnedExtIds) = remember(installed, searchQuery) {
        val prefs = context.getSharedPreferences("novel_reader_prefs", Context.MODE_PRIVATE)
        val pinnedIds = installed.filter { prefs.getBoolean("ext_pinned_${it.id}", false) }.map { it.id }.toSet()
        val sortedList = installed.sortedWith(compareByDescending<ExtensionEntity> {
            pinnedIds.contains(it.id)
        }.thenBy { it.name })
        
        val filteredList = if (searchQuery.isBlank()) sortedList else {
            sortedList.filter {
                it.name.contains(searchQuery, ignoreCase = true) ||
                it.description.contains(searchQuery, ignoreCase = true) ||
                it.author.contains(searchQuery, ignoreCase = true)
            }
        }
        filteredList to pinnedIds
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(LegadoTheme.colorScheme.background)
    ) {

        if (error != null) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .background(LegadoTheme.colorScheme.errorContainer, RoundedCornerShape(8.dp))
                    .padding(12.dp)
            ) {
                Text(
                    text = "Lỗi: ${error}",
                    color = LegadoTheme.colorScheme.onErrorContainer,
                    fontSize = 13.sp
                )
            }
        }
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            // Section 1: Cài đặt (Installed)
            if (filteredInstalled.isNotEmpty()) {
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 12.dp, bottom = 6.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        AppText(
                            text = "Cài đặt",
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            color = LegadoTheme.colorScheme.onSurface
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Surface(
                            shape = RoundedCornerShape(10.dp),
                            color = LegadoTheme.colorScheme.secondaryContainer
                        ) {
                            AppText(
                                text = "${filteredInstalled.size}",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = LegadoTheme.colorScheme.onSecondaryContainer,
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp)
                            )
                        }
                    }
                }
 
                items(filteredInstalled, key = { "inst_" + it.id }) { ext ->
                    val isPinned = pinnedExtIds.contains(ext.id)

                    GlassCard(
                        modifier = Modifier.fillMaxWidth(),
                        cornerRadius = 12.dp
                    ) {
                        Row(
                            modifier = Modifier
                                .combinedClickable(
                                    onClick = { activeDetailExtension = ext },
                                    onLongClick = { activeDetailExtension = ext }
                                )
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            SourceIcon(
                                path = ext.iconPath,
                                modifier = Modifier.size(40.dp)
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    AppText(
                                        text = ext.name,
                                        style = LegadoTheme.typography.titleMedium,
                                        color = LegadoTheme.colorScheme.onSurface,
                                        modifier = Modifier.weight(1f, fill = false)
                                    )
                                    if (isPinned) {
                                        Spacer(modifier = Modifier.width(6.dp))
                                        Icon(
                                            Icons.Filled.PushPin,
                                            contentDescription = "Đã ghim",
                                            tint = LegadoTheme.colorScheme.primary,
                                            modifier = Modifier.size(14.dp)
                                        )
                                    }
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Surface(
                                        shape = RoundedCornerShape(4.dp),
                                        color = LegadoTheme.colorScheme.secondaryContainer,
                                        modifier = Modifier.padding(vertical = 2.dp)
                                    ) {
                                        AppText(
                                            text = "v${ext.version}",
                                            fontSize = 11.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = LegadoTheme.colorScheme.onSecondaryContainer,
                                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                        )
                                    }
                                }
                                Spacer(modifier = Modifier.height(4.dp))
                                AppText(
                                    text = "Tác giả: ${ext.author}",
                                    style = LegadoTheme.typography.bodySmall,
                                    color = LegadoTheme.colorScheme.onSurfaceVariant
                                )
                                if (ext.description.isNotBlank()) {
                                    Spacer(modifier = Modifier.height(4.dp))
                                    AppText(
                                        text = ext.description,
                                        style = LegadoTheme.typography.bodySmall,
                                        maxLines = 2,
                                        overflow = TextOverflow.Ellipsis,
                                        color = LegadoTheme.colorScheme.onSurfaceVariant
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.width(16.dp))

                            IconButton(
                                onClick = { showDeleteDialogFor = ext },
                                modifier = Modifier
                                    .background(LegadoTheme.colorScheme.errorContainer.copy(alpha = 0.2f), CircleShape)
                                    .size(36.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Delete,
                                    contentDescription = "Gỡ cài đặt",
                                    tint = LegadoTheme.colorScheme.error,
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                        }
                    }
                }
            }

            // Section 2: Tất cả (Uninstalled Available)
            if (uninstalledExtensions.isNotEmpty()) {
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 12.dp, bottom = 6.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        AppText(
                            text = "Tất cả",
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            color = LegadoTheme.colorScheme.onSurface
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Surface(
                            shape = RoundedCornerShape(10.dp),
                            color = LegadoTheme.colorScheme.secondaryContainer
                        ) {
                            AppText(
                                text = "${uninstalledExtensions.size}",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = LegadoTheme.colorScheme.onSecondaryContainer,
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp)
                            )
                        }
                    }
                }

                items(uninstalledExtensions, key = { "avail_" + it.name + "_" + it.version }) { info ->
                    val slug = availableSlugs[info] ?: info.name.toSlug()
                    val isInstalling = installingIds.contains(slug)

                    GlassCard(
                        modifier = Modifier.fillMaxWidth(),
                        cornerRadius = 12.dp
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .combinedClickable(
                                    onClick = {
                                        if (!isInstalling) {
                                            viewModel.installExtension(info)
                                        }
                                    }
                                )
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            SourceIcon(
                                path = info.icon,
                                modifier = Modifier.size(40.dp)
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    AppText(
                                        text = info.name,
                                        style = LegadoTheme.typography.titleMedium,
                                        color = LegadoTheme.colorScheme.onSurface,
                                        modifier = Modifier.weight(1f, fill = false)
                                    )
                                    Spacer(modifier = Modifier.width(6.dp))
                                    Surface(
                                        shape = RoundedCornerShape(4.dp),
                                        color = LegadoTheme.colorScheme.secondaryContainer
                                    ) {
                                        AppText(
                                            text = "v${info.version}",
                                            fontSize = 11.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = LegadoTheme.colorScheme.onSecondaryContainer,
                                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                        )
                                    }
                                }
                                Spacer(modifier = Modifier.height(4.dp))
                                AppText(
                                    text = "Tác giả: ${info.author}",
                                    style = LegadoTheme.typography.bodySmall,
                                    color = LegadoTheme.colorScheme.onSurfaceVariant
                                )
                                if (info.description.isNotBlank()) {
                                    Spacer(modifier = Modifier.height(4.dp))
                                    AppText(
                                        text = info.description,
                                        style = LegadoTheme.typography.bodySmall,
                                        color = LegadoTheme.colorScheme.onSurfaceVariant,
                                        maxLines = 2,
                                        overflow = TextOverflow.Ellipsis
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.width(12.dp))

                            if (isInstalling) {
                                CircularProgressIndicator(
                                    modifier = Modifier.size(24.dp),
                                    strokeWidth = 2.dp,
                                    color = LegadoTheme.colorScheme.primary
                                )
                            } else {
                                IconButton(
                                    onClick = { viewModel.installExtension(info) },
                                    modifier = Modifier
                                        .background(LegadoTheme.colorScheme.secondaryContainer.copy(alpha = 0.4f), CircleShape)
                                        .size(36.dp)
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Download,
                                        contentDescription = "Cài đặt",
                                        tint = LegadoTheme.colorScheme.primary,
                                        modifier = Modifier.size(20.dp)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    // Dialog components
    activeDetailExtension?.let { ext ->
        val currentExt = installed.find { it.id == ext.id } ?: ext
        ExtensionDetailDialog(
            extension = currentExt,
            viewModel = viewModel,
            onDismissRequest = { activeDetailExtension = null },
            onUninstallClick = {
                showDeleteDialogFor = currentExt
                activeDetailExtension = null
            }
        )
    }

    showDeleteDialogFor?.let { ext ->
        AppAlertDialog(
            data = ext,
            onDismissRequest = { showDeleteDialogFor = null },
            title = "Gỡ cài đặt tiện ích?",
            text = "Bạn có chắc chắn muốn gỡ cài đặt tiện ích \"${ext.name}\" không?",
            confirmText = "Xác nhận",
            onConfirm = {
                viewModel.uninstallExtension(ext.id)
                showDeleteDialogFor = null
            },
            dismissText = "Hủy",
            onDismiss = { showDeleteDialogFor = null }
        )
    }

    if (showAddRepoDialog) {
        var repoUrl by remember { mutableStateOf("") }
        var repoName by remember { mutableStateOf("") }
 
        AlertDialog(
            onDismissRequest = { viewModel.showAddRepoDialog(false) },
            title = { Text("Thêm kho tiện ích mới") },
            text = {
                Column {
                    OutlinedTextField(
                        value = repoName,
                        onValueChange = { repoName = it },
                        label = { Text("Tên kho (tùy chọn)") },
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    OutlinedTextField(
                        value = repoUrl,
                        onValueChange = { repoUrl = it },
                        label = { Text("URL kho nguồn (plugin.json)") },
                        placeholder = { Text("https://example.com/plugin.json") },
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        if (repoUrl.isNotBlank()) {
                            viewModel.addRepository(repoUrl, repoName)
                            viewModel.showAddRepoDialog(false)
                        }
                    }
                ) {
                    Text("Thêm")
                }
            },
            dismissButton = {
                TextButton(onClick = { viewModel.showAddRepoDialog(false) }) {
                    Text("Hủy")
                }
            }
        )
    }

    if (showManageReposDialog) {
        AlertDialog(
            onDismissRequest = { viewModel.showManageReposDialog(false) },
            title = {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Quản lý kho nguồn", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                    IconButton(
                        onClick = { viewModel.showAddRepoDialog(true) }
                    ) {
                        Icon(Icons.Default.Add, contentDescription = "Thêm kho nguồn")
                    }
                }
            },
            text = {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(max = 300.dp)
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    if (repos.isEmpty()) {
                        Text("Chưa có kho nguồn nào", fontSize = 14.sp)
                    } else {
                        repos.forEach { repo ->
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 4.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Column(modifier = Modifier.weight(1f)) {
                                    AppText(
                                        text = repo.name.ifBlank { "Kho nguồn" },
                                        fontWeight = FontWeight.Medium,
                                        fontSize = 13.sp
                                    )
                                    val isDefaultRepo = repo.url.contains("Extransion-TTC", ignoreCase = true)
                                    if (!isDefaultRepo) {
                                        AppText(
                                            text = repo.url,
                                            fontSize = 11.sp,
                                            color = LegadoTheme.colorScheme.onSurfaceVariant,
                                            maxLines = 1,
                                            overflow = TextOverflow.Ellipsis
                                        )
                                    }
                                }
                                if (repo.url != "file:///android_asset/plugin.json") {
                                    IconButton(
                                        onClick = { repoToDelete = repo },
                                        modifier = Modifier.size(32.dp)
                                    ) {
                                        Icon(
                                            Icons.Default.Delete,
                                            contentDescription = "Xóa kho",
                                            tint = LegadoTheme.colorScheme.error,
                                            modifier = Modifier.size(18.dp)
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            },
            confirmButton = {
                TextButton(onClick = { viewModel.showManageReposDialog(false) }) {
                    Text("Đóng")
                }
            }
        )
    }

    repoToDelete?.let { repo ->
        AppAlertDialog(
            data = repo,
            onDismissRequest = { repoToDelete = null },
            title = "Xóa kho nguồn?",
            text = if (repo.url.contains("Extransion-TTC", ignoreCase = true)) {
                "Bạn có chắc chắn muốn xóa kho nguồn \"${repo.name}\" không?"
            } else {
                "Bạn có chắc chắn muốn xóa kho nguồn \"${repo.name}\" (${repo.url}) không?"
            },
            confirmText = "Xóa",
            onConfirm = {
                viewModel.removeRepository(repo)
                repoToDelete = null
            },
            dismissText = "Hủy",
            onDismiss = { repoToDelete = null }
        )
    }
}

private fun String.toSlug(): String {
    val normalized = java.text.Normalizer.normalize(this, java.text.Normalizer.Form.NFD)
        .replace(Regex("[\\p{InCombiningDiacriticalMarks}]"), "")
    return normalized
        .lowercase()
        .replace("đ", "d").replace("Đ", "d")
        .replace(Regex("[^a-z0-9]"), "-")
        .replace(Regex("-+"), "-")
        .trim('-')
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExtensionDetailDialog(
    extension: ExtensionEntity,
    viewModel: ExtensionViewModel,
    onDismissRequest: () -> Unit,
    onUninstallClick: () -> Unit,
) {
    val context = LocalContext.current

    LaunchedEffect(extension.id) {
        viewModel.loadExtensionDetails(extension.id)
    }

    val cookie by viewModel.selectedCookie.collectAsStateWithLifecycle()
    val localStorage by viewModel.selectedLocalStorage.collectAsStateWithLifecycle()
    val isPinned by viewModel.selectedIsPinned.collectAsStateWithLifecycle()

    var showEditCookieDialog by remember { mutableStateOf(false) }
    var showAddStorageDialog by remember { mutableStateOf(false) }

    Dialog(
        onDismissRequest = onDismissRequest,
        properties = DialogProperties(
            usePlatformDefaultWidth = false,
            decorFitsSystemWindows = false
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(LegadoTheme.colorScheme.background)
        ) {
            AppScaffold(
                topBar = {
                    GlassMediumFlexibleTopAppBar(
                        title = "Thông tin chi tiết",
                        navigationIcon = {
                            IconButton(onClick = onDismissRequest) {
                                Icon(Icons.Default.ArrowBack, contentDescription = "Quay lại")
                            }
                        }
                    )
                }
            ) { contentPadding ->
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(LegadoTheme.colorScheme.background)
                        .padding(contentPadding)
                        .padding(horizontal = 24.dp)
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Spacer(modifier = Modifier.height(8.dp))
                    GlassCard(
                        modifier = Modifier.fillMaxWidth(),
                        cornerRadius = 24.dp
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 24.dp, vertical = 32.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(96.dp)
                                    .clip(RoundedCornerShape(24.dp))
                                    .background(LegadoTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f))
                                    .border(
                                        width = 1.dp,
                                        color = LegadoTheme.colorScheme.outline.copy(alpha = 0.2f),
                                        shape = RoundedCornerShape(24.dp)
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                SourceIcon(
                                    path = extension.iconPath,
                                    modifier = Modifier.size(64.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(20.dp))

                            AppText(
                                text = extension.name,
                                style = LegadoTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                                color = LegadoTheme.colorScheme.onSurface,
                                textAlign = androidx.compose.ui.text.style.TextAlign.Center
                            )
                            Spacer(modifier = Modifier.height(6.dp))
                            AppText(
                                text = "Phiên bản ${extension.version}",
                                style = LegadoTheme.typography.bodyMedium,
                                color = LegadoTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.7f),
                                textAlign = androidx.compose.ui.text.style.TextAlign.Center
                            )

                            if (extension.source.isNotBlank()) {
                                Spacer(modifier = Modifier.height(12.dp))
                                AppText(
                                    text = extension.source,
                                    style = LegadoTheme.typography.bodySmall,
                                    color = LegadoTheme.colorScheme.primary,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(8.dp))
                                        .clickable {
                                            try {
                                                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(extension.source))
                                                context.startActivity(intent)
                                            } catch (e: Exception) {
                                                Toast.makeText(context, "Không thể mở trang web", Toast.LENGTH_SHORT).show()
                                            }
                                        }
                                        .padding(horizontal = 8.dp, vertical = 4.dp)
                                )
                            }

                            Spacer(modifier = Modifier.height(28.dp))

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceEvenly,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                DetailQuickAction(
                                    icon = Icons.Outlined.Language,
                                    label = "Trang nguồn",
                                    onClick = {
                                        if (extension.source.isNotBlank()) {
                                            try {
                                                val intent = Intent(context, WebViewActivity::class.java).apply {
                                                    putExtra("url", extension.source)
                                                    putExtra("title", extension.name)
                                                    putExtra("sourceName", extension.name)
                                                    putExtra("sourceOrigin", "ext_${extension.id}")
                                                    putExtra("sourceVerificationEnable", true)
                                                    putExtra("refetchAfterSuccess", false)
                                                }
                                                context.startActivity(intent)
                                            } catch (e: Exception) {
                                                Toast.makeText(context, "Lỗi mở URL", Toast.LENGTH_SHORT).show()
                                            }
                                        } else {
                                            Toast.makeText(context, "Nguồn không có URL", Toast.LENGTH_SHORT).show()
                                        }
                                    }
                                )
                                DetailQuickAction(
                                    icon = Icons.Outlined.Delete,
                                    label = "Gỡ",
                                    tint = LegadoTheme.colorScheme.error,
                                    onClick = onUninstallClick
                                )
                                DetailQuickAction(
                                    icon = Icons.Outlined.PushPin,
                                    label = if (isPinned) "Gỡ ghim" else "Ghim",
                                    tint = if (isPinned) LegadoTheme.colorScheme.primary else LegadoTheme.colorScheme.onSurface,
                                    onClick = { viewModel.togglePinnedState(extension.id) }
                                )
                            }
                        }
                    }

                    SectionCard(
                        title = "Cookie",
                        onAddClick = { showEditCookieDialog = true }
                    ) {
                        if (cookie.isBlank()) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 12.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                AppText(
                                    text = "Chưa có lịch sử cookie",
                                    style = LegadoTheme.typography.bodySmall,
                                    color = LegadoTheme.colorScheme.onSurfaceVariant
                                )
                            }
                        } else {
                            AppText(
                                text = cookie,
                                style = LegadoTheme.typography.bodySmall,
                                color = LegadoTheme.colorScheme.onSurface,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 4.dp, vertical = 6.dp)
                            )
                        }
                    }

                    SectionCard(
                        title = "Bộ nhớ cục bộ",
                        onAddClick = { showAddStorageDialog = true }
                    ) {
                        if (localStorage.isEmpty()) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 12.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                AppText(
                                    text = "Không có dữ liệu cục bộ",
                                    style = LegadoTheme.typography.bodySmall,
                                    color = LegadoTheme.colorScheme.onSurfaceVariant
                                )
                            }
                        } else {
                            Column(
                                modifier = Modifier.fillMaxWidth(),
                                verticalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                localStorage.forEach { (k, v) ->
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .background(LegadoTheme.colorScheme.surfaceVariant.copy(alpha = 0.2f), RoundedCornerShape(8.dp))
                                            .padding(horizontal = 10.dp, vertical = 6.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Column(modifier = Modifier.weight(1f)) {
                                            AppText(
                                                text = k,
                                                fontWeight = FontWeight.Bold,
                                                style = LegadoTheme.typography.bodySmall,
                                                color = LegadoTheme.colorScheme.primary
                                            )
                                            AppText(
                                                text = v,
                                                style = LegadoTheme.typography.bodySmall,
                                                color = LegadoTheme.colorScheme.onSurface
                                            )
                                        }
                                        IconButton(
                                            onClick = { viewModel.removeLocalStorageItem(extension.id, k) },
                                            modifier = Modifier.size(28.dp)
                                        ) {
                                            Icon(
                                                Icons.Default.Delete,
                                                contentDescription = "Xóa",
                                                tint = LegadoTheme.colorScheme.error,
                                                modifier = Modifier.size(16.dp)
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(24.dp))
                }
            }
        }
    }

    if (showEditCookieDialog) {
        var tempCookie by remember { mutableStateOf(cookie) }
        AlertDialog(
            onDismissRequest = { showEditCookieDialog = false },
            title = { Text("Cấu hình Cookie") },
            text = {
                OutlinedTextField(
                    value = tempCookie,
                    onValueChange = { tempCookie = it },
                    label = { Text("Giá trị Cookie") },
                    modifier = Modifier.fillMaxWidth()
                )
            },
            confirmButton = {
                TextButton(onClick = {
                    viewModel.updateCookie(extension.id, tempCookie)
                    showEditCookieDialog = false
                }) {
                    Text("Lưu")
                }
            },
            dismissButton = {
                TextButton(onClick = { showEditCookieDialog = false }) {
                    Text("Hủy")
                }
            }
        )
    }

    if (showAddStorageDialog) {
        var key by remember { mutableStateOf("") }
        var value by remember { mutableStateOf("") }
        AlertDialog(
            onDismissRequest = { showAddStorageDialog = false },
            title = { Text("Thêm Bộ nhớ cục bộ") },
            text = {
                Column {
                    OutlinedTextField(
                        value = key,
                        onValueChange = { key = it },
                        label = { Text("Khóa (Key)") },
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    OutlinedTextField(
                        value = value,
                        onValueChange = { value = it },
                        label = { Text("Giá trị (Value)") },
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            },
            confirmButton = {
                TextButton(onClick = {
                    if (key.isNotBlank()) {
                        viewModel.addLocalStorageItem(extension.id, key, value)
                        showAddStorageDialog = false
                    }
                }) {
                    Text("Thêm")
                }
            },
            dismissButton = {
                TextButton(onClick = { showAddStorageDialog = false }) {
                    Text("Hủy")
                }
            }
        )
    }
}

@Composable
fun Badge(text: String) {
    Surface(
        shape = RoundedCornerShape(4.dp),
        color = LegadoTheme.colorScheme.surfaceVariant,
        modifier = Modifier.padding(vertical = 2.dp)
    ) {
        AppText(
            text = text,
            fontSize = 10.sp,
            fontWeight = FontWeight.Bold,
            color = LegadoTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.padding(horizontal = 6.dp, vertical = 3.dp)
        )
    }
}

@Composable
fun DetailQuickAction(
    icon: ImageVector,
    label: String,
    tint: Color = LegadoTheme.colorScheme.onSurface,
    onClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .clickable(onClick = onClick)
            .padding(horizontal = 12.dp, vertical = 8.dp)
    ) {
        Icon(icon, contentDescription = label, tint = tint, modifier = Modifier.size(24.dp))
        Spacer(modifier = Modifier.height(4.dp))
        AppText(text = label, fontSize = 11.sp, color = tint)
    }
}

@Composable
fun SectionCard(
    title: String,
    showAddButton: Boolean = true,
    onAddClick: () -> Unit = {},
    content: @Composable () -> Unit
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            AppText(
                text = title,
                style = LegadoTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = LegadoTheme.colorScheme.primary
            )
            if (showAddButton) {
                TextButton(
                    onClick = onAddClick,
                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 2.dp)
                ) {
                    Icon(Icons.Default.Add, contentDescription = "Thêm", modifier = Modifier.size(16.dp))
                    Spacer(modifier = Modifier.width(4.dp))
                    Text("Thêm", fontSize = 13.sp)
                }
            }
        }
        Spacer(modifier = Modifier.height(6.dp))
        GlassCard(
            modifier = Modifier.fillMaxWidth(),
            cornerRadius = 12.dp,
            containerColor = LegadoTheme.colorScheme.surfaceContainerLow
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(14.dp)
            ) {
                content()
            }
        }
    }
}
