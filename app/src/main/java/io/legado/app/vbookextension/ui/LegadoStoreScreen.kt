package io.legado.app.vbookextension.ui

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import io.legado.app.ui.association.ImportBookSourceDialog
import io.legado.app.utils.toastOnUi
import io.legado.app.ui.theme.LegadoTheme
import io.legado.app.ui.widget.components.card.GlassCard
import io.legado.app.ui.widget.components.text.AppText
import io.legado.app.utils.showDialogFragment
import org.koin.androidx.compose.koinViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LegadoStoreScreen(
    viewModel: LegadoStoreViewModel = koinViewModel()
) {
    val sources by viewModel.filteredSources.collectAsStateWithLifecycle()
    val installedUrls by viewModel.installedUrls.collectAsStateWithLifecycle()
    val isLoading by viewModel.isLoading.collectAsStateWithLifecycle()
    val error by viewModel.error.collectAsStateWithLifecycle()
    val searchQuery by viewModel.searchQuery.collectAsStateWithLifecycle()
    
    val context = LocalContext.current
    
    val sharedPrefs = remember { context.getSharedPreferences("novel_reader_prefs", Context.MODE_PRIVATE) }
    var hideInstalled by remember {
        mutableStateOf(sharedPrefs.getBoolean("store_hide_installed", true))
    }
    var hideUninstalled by remember {
        mutableStateOf(sharedPrefs.getBoolean("store_hide_uninstalled", false))
    }

    val displaySources = remember(sources, installedUrls, hideInstalled, hideUninstalled) {
        sources.filter { item ->
            val isInstalled = installedUrls.contains(item.url)
            val keep = when {
                isInstalled && hideInstalled -> false
                !isInstalled && hideUninstalled -> false
                else -> true
            }
            keep
        }
    }
    
    var showMenu by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(LegadoTheme.colorScheme.background)
    ) {
        // Toolbar controls
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            OutlinedTextField(
                value = searchQuery,
                onValueChange = { viewModel.updateSearchQuery(it) },
                placeholder = { Text("Tìm kiếm nguồn sách Legado...") },
                leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
                modifier = Modifier
                    .weight(1f)
                    .height(52.dp),
                shape = RoundedCornerShape(12.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = LegadoTheme.colorScheme.primary,
                    unfocusedBorderColor = LegadoTheme.colorScheme.outlineVariant
                )
            )

            Spacer(modifier = Modifier.width(8.dp))

            IconButton(
                onClick = { viewModel.fetchSources(force = true) },
                modifier = Modifier.background(LegadoTheme.colorScheme.secondaryContainer, RoundedCornerShape(12.dp))
            ) {
                if (isLoading) {
                    CircularProgressIndicator(modifier = Modifier.size(24.dp), strokeWidth = 2.dp)
                } else {
                    Icon(Icons.Default.Refresh, contentDescription = "Làm mới")
                }
            }

            Spacer(modifier = Modifier.width(8.dp))

            Box {
                IconButton(
                    onClick = { showMenu = true },
                    modifier = Modifier.background(LegadoTheme.colorScheme.secondaryContainer, RoundedCornerShape(12.dp))
                ) {
                    Icon(Icons.Default.MoreVert, contentDescription = "Menu")
                }
                DropdownMenu(
                    expanded = showMenu,
                    onDismissRequest = { showMenu = false }
                ) {
                    DropdownMenuItem(
                        text = {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Checkbox(
                                    checked = hideInstalled,
                                    onCheckedChange = {
                                        hideInstalled = it
                                        sharedPrefs.edit().putBoolean("store_hide_installed", it).apply()
                                        showMenu = false
                                    }
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text("Ẩn nguồn đã cài")
                            }
                        },
                        onClick = {
                            val newValue = !hideInstalled
                            hideInstalled = newValue
                            sharedPrefs.edit().putBoolean("store_hide_installed", newValue).apply()
                            showMenu = false
                        }
                    )
                    DropdownMenuItem(
                        text = {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Checkbox(
                                    checked = hideUninstalled,
                                    onCheckedChange = {
                                        hideUninstalled = it
                                        sharedPrefs.edit().putBoolean("store_hide_uninstalled", it).apply()
                                        showMenu = false
                                    }
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text("Ẩn nguồn chưa cài")
                            }
                        },
                        onClick = {
                            val newValue = !hideUninstalled
                            hideUninstalled = newValue
                            sharedPrefs.edit().putBoolean("store_hide_uninstalled", newValue).apply()
                            showMenu = false
                        }
                    )
                }
            }
        }

        if (error != null) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .background(LegadoTheme.colorScheme.errorContainer, RoundedCornerShape(8.dp))
                    .padding(12.dp)
            ) {
                Text(
                    text = "Lỗi: $error",
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
            item {
                Spacer(modifier = Modifier.height(4.dp))
                AppText(
                    text = "Nguồn khả dụng trên Legado (${displaySources.size})",
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp
                )
            }

            if (displaySources.isEmpty() && !isLoading) {
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 32.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        AppText(
                            text = "Không tìm thấy nguồn sách nào",
                            color = LegadoTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            } else {
                items(displaySources, key = { it.id }) { item ->
                    val isInstalled = installedUrls.contains(item.url)
                    
                    GlassCard(
                        modifier = Modifier.fillMaxWidth(),
                        cornerRadius = 12.dp
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    val domain = io.legado.app.utils.NetworkUtils.getDomain(item.url)
                                    AppText(
                                        text = domain,
                                        style = LegadoTheme.typography.titleMedium,
                                        color = LegadoTheme.colorScheme.onSurface,
                                        maxLines = 1,
                                        overflow = TextOverflow.Ellipsis,
                                        modifier = Modifier.weight(1f, fill = false)
                                    )
                                    Spacer(modifier = Modifier.width(6.dp))
                                    if (item.version.isNotBlank()) {
                                        Surface(
                                            shape = RoundedCornerShape(4.dp),
                                            color = LegadoTheme.colorScheme.secondaryContainer,
                                            modifier = Modifier.padding(vertical = 2.dp)
                                        ) {
                                            AppText(
                                                text = item.version,
                                                fontSize = 10.sp,
                                                fontWeight = FontWeight.Bold,
                                                color = LegadoTheme.colorScheme.onSecondaryContainer,
                                                modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                            )
                                        }
                                    }
                                }
                                
                                if (item.name.isNotBlank()) {
                                    Spacer(modifier = Modifier.height(2.dp))
                                    AppText(
                                        text = item.name,
                                        style = LegadoTheme.typography.bodySmall,
                                        color = LegadoTheme.colorScheme.onSurfaceVariant,
                                        maxLines = 1,
                                        overflow = TextOverflow.Ellipsis
                                    )
                                }

                                Spacer(modifier = Modifier.height(4.dp))
                                
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                                ) {
                                    // Capabilities chips
                                    if (item.tags.isNotBlank()) {
                                        item.tags.split(" ").forEach { tag ->
                                            if (tag.isNotBlank()) {
                                                CapabilityBadge(tag)
                                            }
                                        }
                                    }
                                    
                                    AppText(
                                        text = "Tác giả: ${item.author.ifBlank { "Ẩn danh" }}",
                                        style = LegadoTheme.typography.bodySmall,
                                        color = LegadoTheme.colorScheme.onSurfaceVariant,
                                        maxLines = 1,
                                        overflow = TextOverflow.Ellipsis
                                    )
                                }

                                Spacer(modifier = Modifier.height(2.dp))

                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                                ) {
                                    AppText(
                                        text = "Tải: ${formatDownloads(item.downloads)}",
                                        fontSize = 11.sp,
                                        color = LegadoTheme.colorScheme.onSurfaceVariant
                                    )
                                    AppText(
                                        text = "Cập nhật: ${item.time}",
                                        fontSize = 11.sp,
                                        color = LegadoTheme.colorScheme.onSurfaceVariant
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.width(12.dp))

                            Button(
                                onClick = {
                                    val jsonUrl = "https://www.yckceo.com/yuedu/shuyuan/json/id/${item.id}.json"
                                    (context as? AppCompatActivity)?.showDialogFragment(ImportBookSourceDialog(jsonUrl))
                                },
                                shape = RoundedCornerShape(8.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = if (isInstalled) LegadoTheme.colorScheme.secondaryContainer else LegadoTheme.colorScheme.primaryContainer,
                                    contentColor = if (isInstalled) LegadoTheme.colorScheme.onSecondaryContainer else LegadoTheme.colorScheme.onPrimaryContainer
                                ),
                                contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp),
                                modifier = Modifier.height(36.dp)
                            ) {
                                Text(
                                    text = if (isInstalled) "Đã cài" else "Cài đặt",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun CapabilityBadge(tag: String) {
    val (color, text) = when (tag.trim()) {
        "搜" -> Color(0xFFE67E22) to "Tìm kiếm"
        "发" -> Color(0xFF2ECC71) to "Khám phá"
        "图" -> Color(0xFF9B59B6) to "Truyện tranh"
        "声" -> Color(0xFF3498DB) to "Truyện nói"
        else -> Color(0xFF7F8C8D) to tag
    }
    Surface(
        shape = RoundedCornerShape(4.dp),
        color = color.copy(alpha = 0.15f),
        border = androidx.compose.foundation.BorderStroke(0.5.dp, color.copy(alpha = 0.5f))
    ) {
        Text(
            text = text,
            fontSize = 9.sp,
            fontWeight = FontWeight.Bold,
            color = color,
            modifier = Modifier.padding(horizontal = 4.dp, vertical = 1.dp)
        )
    }
}

fun formatDownloads(count: Int): String {
    return when {
        count >= 10000 -> String.format("%.1f vạn", count / 10000.0)
        count >= 1000 -> String.format("%.1f k", count / 1000.0)
        else -> count.toString()
    }
}

@androidx.compose.runtime.Immutable
data class BookSourceStoreUi(
    val item: YckceoSourceItem,
    val domain: String,
    val tags: List<String>,
    val authorText: String,
    val downloadsText: String,
    val timeText: String,
    val isInstalled: Boolean
)

@Composable
fun LegadoStoreFooterSection(
    viewModel: LegadoStoreViewModel
) {
    val sources by viewModel.filteredSources.collectAsStateWithLifecycle()
    val installedUrls by viewModel.installedUrls.collectAsStateWithLifecycle()
    val isLoading by viewModel.isLoading.collectAsStateWithLifecycle()
    val context = LocalContext.current

    // Filter out book sources that are already installed
    val uninstalledStoreSources = remember(sources, installedUrls) {
        sources.filter { !installedUrls.contains(it.url) }
    }

    // Pre-calculate/cache all string operations, formatting, and domain lookups to speed up rendering
    val uiItems = remember(uninstalledStoreSources, installedUrls) {
        uninstalledStoreSources.map { item ->
            val domain = io.legado.app.utils.NetworkUtils.getDomain(item.url)
            val tags = if (item.tags.isNotBlank()) {
                item.tags.split(" ").filter { it.isNotBlank() }
            } else emptyList()
            val authorText = "Tác giả: ${item.author.ifBlank { "Ẩn danh" }}"
            val downloadsText = "Tải: ${formatDownloads(item.downloads)}"
            val timeText = "Cập nhật: ${item.time}"
            val isInstalled = installedUrls.contains(item.url)
            
            BookSourceStoreUi(
                item = item,
                domain = domain,
                tags = tags,
                authorText = authorText,
                downloadsText = downloadsText,
                timeText = timeText,
                isInstalled = isInstalled
            )
        }
    }

    var visibleLimit by remember { mutableStateOf(8) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        // Section Header
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
                    text = "${uninstalledStoreSources.size}",
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold,
                    color = LegadoTheme.colorScheme.onSecondaryContainer,
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp)
                )
            }
        }

        if (isLoading && uninstalledStoreSources.isEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator(
                    modifier = Modifier.size(36.dp),
                    color = LegadoTheme.colorScheme.primary
                )
            }
        } else if (uninstalledStoreSources.isEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                contentAlignment = Alignment.Center
            ) {
                AppText(
                    text = "Không tìm thấy nguồn sách nào",
                    color = LegadoTheme.colorScheme.onSurfaceVariant
                )
            }
        } else {
            // Eager Column of store cards: load incrementally to ensure RecyclerView layout manager stability
            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                val itemsToShow = uiItems.take(visibleLimit)
                itemsToShow.forEach { uiItem ->
                    val item = uiItem.item
                    val isInstalled = uiItem.isInstalled
                    
                    GlassCard(
                        modifier = Modifier.fillMaxWidth(),
                        cornerRadius = 12.dp
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    AppText(
                                        text = uiItem.domain,
                                        style = LegadoTheme.typography.titleMedium,
                                        color = LegadoTheme.colorScheme.onSurface,
                                        maxLines = 1,
                                        overflow = TextOverflow.Ellipsis,
                                        modifier = Modifier.weight(1f, fill = false)
                                    )
                                    Spacer(modifier = Modifier.width(6.dp))
                                    if (item.version.isNotBlank()) {
                                        Surface(
                                            shape = RoundedCornerShape(4.dp),
                                            color = LegadoTheme.colorScheme.secondaryContainer,
                                            modifier = Modifier.padding(vertical = 2.dp)
                                        ) {
                                            AppText(
                                                text = item.version,
                                                fontSize = 10.sp,
                                                fontWeight = FontWeight.Bold,
                                                color = LegadoTheme.colorScheme.onSecondaryContainer,
                                                modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                            )
                                        }
                                    }
                                }
                                
                                if (item.name.isNotBlank()) {
                                    Spacer(modifier = Modifier.height(2.dp))
                                    AppText(
                                        text = item.name,
                                        style = LegadoTheme.typography.bodySmall,
                                        color = LegadoTheme.colorScheme.onSurfaceVariant,
                                        maxLines = 1,
                                        overflow = TextOverflow.Ellipsis
                                    )
                                }

                                Spacer(modifier = Modifier.height(4.dp))
                                
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                                ) {
                                    uiItem.tags.forEach { tag ->
                                        CapabilityBadge(tag)
                                    }
                                    
                                    AppText(
                                        text = uiItem.authorText,
                                        style = LegadoTheme.typography.bodySmall,
                                        color = LegadoTheme.colorScheme.onSurfaceVariant,
                                        maxLines = 1,
                                        overflow = TextOverflow.Ellipsis
                                    )
                                }

                                Spacer(modifier = Modifier.height(2.dp))

                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                                ) {
                                    AppText(
                                        text = uiItem.downloadsText,
                                        fontSize = 11.sp,
                                        color = LegadoTheme.colorScheme.onSurfaceVariant
                                    )
                                    AppText(
                                        text = uiItem.timeText,
                                        fontSize = 11.sp,
                                        color = LegadoTheme.colorScheme.onSurfaceVariant
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.width(12.dp))

                            IconButton(
                                onClick = {
                                    val jsonUrl = "https://www.yckceo.com/yuedu/shuyuan/json/id/${item.id}.json"
                                    (context as? AppCompatActivity)?.showDialogFragment(ImportBookSourceDialog(jsonUrl))
                                },
                                modifier = Modifier
                                    .background(
                                        if (isInstalled) LegadoTheme.colorScheme.secondaryContainer.copy(alpha = 0.4f) 
                                        else LegadoTheme.colorScheme.primaryContainer.copy(alpha = 0.4f),
                                        CircleShape
                                    )
                                    .size(36.dp)
                            ) {
                                Icon(
                                    imageVector = if (isInstalled) Icons.Default.Check else Icons.Default.Download,
                                    contentDescription = "Cài đặt",
                                    tint = if (isInstalled) LegadoTheme.colorScheme.secondary else LegadoTheme.colorScheme.primary,
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                        }
                    }
                }
            }

            if (visibleLimit < uiItems.size) {
                Button(
                    onClick = {
                        visibleLimit = (visibleLimit + 100).coerceAtMost(uiItems.size)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 12.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = LegadoTheme.colorScheme.primaryContainer,
                        contentColor = LegadoTheme.colorScheme.onPrimaryContainer
                    )
                ) {
                    val remaining = uiItems.size - visibleLimit
                    Text(
                        text = "Xem thêm (Còn $remaining nguồn)...",
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp
                    )
                }
            } else if (visibleLimit > 8) {
                TextButton(
                    onClick = { visibleLimit = 8 },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                ) {
                    Text(
                        text = "Thu gọn danh sách",
                        fontWeight = FontWeight.Medium,
                        fontSize = 13.sp,
                        color = LegadoTheme.colorScheme.primary
                    )
                }
            }
        }
    }
}
