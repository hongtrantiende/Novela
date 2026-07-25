package io.legado.app.vbookextension.ui

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import io.legado.app.ui.theme.LegadoTheme
import io.legado.app.ui.widget.components.AppScaffold
import io.legado.app.ui.widget.components.progressIndicator.AppCircularProgressIndicator
import io.legado.app.ui.widget.components.text.AppText
import io.legado.app.ui.widget.components.topbar.GlassMediumFlexibleTopAppBar
import io.legado.app.ui.widget.components.topbar.TopBarNavigationButton
import io.legado.app.vbookextension.data.repository.ExtensionRepository
import io.legado.app.vbookextension.model.ExtensionDebugMode
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import org.koin.compose.koinInject

data class ExtensionDebugLogItem(
    val state: Int,
    val text: String
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExtensionDebugDialog(
    sourceUrl: String,
    onDismissRequest: () -> Unit,
    repository: ExtensionRepository = koinInject()
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val clipboardManager = LocalClipboardManager.current

    val slug = remember(sourceUrl) { ExtensionRepository.getSlugFromId(sourceUrl) }

    var selectedMode by rememberSaveable { mutableStateOf(ExtensionDebugMode.FULL) }
    var lastBookUrl by rememberSaveable { mutableStateOf("") }
    var lastChapterUrl by rememberSaveable { mutableStateOf("") }
    var displayedChapterContent by remember { mutableStateOf<String?>(null) }
    var activeTab by rememberSaveable { mutableStateOf(0) } // 0 = Nhật ký, 1 = Nội dung

    var fullInput by rememberSaveable { mutableStateOf("của tôi") }
    var searchInput by rememberSaveable { mutableStateOf("của tôi") }
    var exploreInput by rememberSaveable { mutableStateOf("") }
    var detailInput by rememberSaveable { mutableStateOf("") }
    var tocInput by rememberSaveable { mutableStateOf("") }
    var contentInput by rememberSaveable { mutableStateOf("") }

    fun getCurrentInput(): String = when (selectedMode) {
        ExtensionDebugMode.FULL -> fullInput
        ExtensionDebugMode.SEARCH -> searchInput
        ExtensionDebugMode.EXPLORE -> exploreInput
        ExtensionDebugMode.DETAIL -> detailInput
        ExtensionDebugMode.TOC -> tocInput
        ExtensionDebugMode.CONTENT -> contentInput
    }

    fun updateCurrentInput(newValue: String) {
        when (selectedMode) {
            ExtensionDebugMode.FULL -> fullInput = newValue
            ExtensionDebugMode.SEARCH -> searchInput = newValue
            ExtensionDebugMode.EXPLORE -> exploreInput = newValue
            ExtensionDebugMode.DETAIL -> detailInput = newValue
            ExtensionDebugMode.TOC -> tocInput = newValue
            ExtensionDebugMode.CONTENT -> contentInput = newValue
        }
    }

    val logs = remember { mutableStateListOf<ExtensionDebugLogItem>() }
    var isDebugging by remember { mutableStateOf(false) }
    var debugJob by remember { mutableStateOf<Job?>(null) }

    val listState = rememberLazyListState()

    val suggestions = listOf("của tôi", "hệ thống")

    val modes = remember {
        listOf(
            ExtensionDebugMode.FULL to "Toàn bộ",
            ExtensionDebugMode.SEARCH to "Tìm kiếm",
            ExtensionDebugMode.EXPLORE to "Khám phá",
            ExtensionDebugMode.DETAIL to "Chi tiết",
            ExtensionDebugMode.TOC to "Mục lục",
            ExtensionDebugMode.CONTENT to "Nội dung"
        )
    }

    val placeholderText = when (selectedMode) {
        ExtensionDebugMode.FULL -> "Từ khóa hoặc URL sách"
        ExtensionDebugMode.SEARCH -> "Từ khóa tìm kiếm"
        ExtensionDebugMode.EXPLORE -> "Đầu vào khám phá, có thể để trống"
        ExtensionDebugMode.DETAIL -> "URL sách"
        ExtensionDebugMode.TOC -> "URL sách"
        ExtensionDebugMode.CONTENT -> "URL chương"
    }

    fun stopDebug() {
        debugJob?.cancel()
        debugJob = null
        isDebugging = false
    }

    fun runDebug(keyToRun: String? = null) {
        if (isDebugging) return

        var targetInput = keyToRun ?: getCurrentInput()

        if (targetInput.isBlank()) {
            if (selectedMode == ExtensionDebugMode.DETAIL || selectedMode == ExtensionDebugMode.TOC) {
                if (lastBookUrl.isNotBlank()) {
                    targetInput = lastBookUrl
                    updateCurrentInput(lastBookUrl)
                } else {
                    logs.clear()
                    logs.add(ExtensionDebugLogItem(-1, "≡Chưa có URL truyện. Hãy chạy Tìm kiếm/Khám phá trước hoặc nhập URL thủ công."))
                    return
                }
            } else if (selectedMode == ExtensionDebugMode.CONTENT) {
                if (lastChapterUrl.isNotBlank()) {
                    targetInput = lastChapterUrl
                    updateCurrentInput(lastChapterUrl)
                } else {
                    logs.clear()
                    logs.add(ExtensionDebugLogItem(-1, "≡Chưa có URL chương. Hãy chạy Mục lục trước hoặc nhập URL chương thủ công."))
                    return
                }
            }
        }

        isDebugging = true
        logs.clear()
        displayedChapterContent = null
        activeTab = 0

        debugJob = scope.launch {
            try {
                val result = repository.debugExtension(
                    sourceUrl = sourceUrl,
                    mode = selectedMode,
                    input = targetInput
                ) { state, log ->
                    logs.add(ExtensionDebugLogItem(state, log))
                }

                result.bookUrl?.takeIf { it.isNotBlank() }?.let { url ->
                    lastBookUrl = url
                    detailInput = url
                    tocInput = url
                }

                result.chapterUrl?.takeIf { it.isNotBlank() }?.let { url ->
                    lastChapterUrl = url
                    contentInput = url
                }

                result.chapterContent?.takeIf { it.isNotBlank() }?.let { content ->
                    displayedChapterContent = content
                }
            } catch (e: CancellationException) {
                logs.add(ExtensionDebugLogItem(-1, "Đã hủy tiến trình gỡ lỗi."))
            } catch (e: Exception) {
                logs.add(ExtensionDebugLogItem(-1, "Lỗi ngoài ý muốn: ${e.message}"))
            } finally {
                isDebugging = false
                debugJob = null
            }
        }
    }

    val isAtBottom by remember {
        derivedStateOf {
            val layoutInfo = listState.layoutInfo
            val totalItems = layoutInfo.totalItemsCount
            if (totalItems == 0) true
            else {
                val lastVisible = layoutInfo.visibleItemsInfo.lastOrNull()?.index ?: 0
                lastVisible >= totalItems - 3
            }
        }
    }

    LaunchedEffect(logs.size) {
        if (logs.isNotEmpty() && isAtBottom) {
            listState.animateScrollToItem(logs.size - 1)
        }
    }

    DisposableEffect(Unit) {
        onDispose {
            stopDebug()
        }
    }

    Dialog(
        onDismissRequest = {
            stopDebug()
            onDismissRequest()
        },
        properties = DialogProperties(
            usePlatformDefaultWidth = false,
            decorFitsSystemWindows = false
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(LegadoTheme.colorScheme.surface)
        ) {
            AppScaffold(
                topBar = {
                    GlassMediumFlexibleTopAppBar(
                        title = "Gỡ lỗi nguồn",
                        subtitle = slug,
                        navigationIcon = {
                            TopBarNavigationButton(
                                onClick = {
                                    stopDebug()
                                    onDismissRequest()
                                }
                            )
                        },
                        actions = {
                            IconButton(
                                onClick = {
                                    logs.clear()
                                    displayedChapterContent = null
                                    activeTab = 0
                                }
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Delete,
                                    contentDescription = "Xóa log",
                                    tint = LegadoTheme.colorScheme.onSurface
                                )
                            }
                            IconButton(
                                onClick = {
                                    if (activeTab == 1 && !displayedChapterContent.isNullOrBlank()) {
                                        clipboardManager.setText(AnnotatedString(displayedChapterContent!!))
                                        Toast.makeText(context, "Đã sao chép toàn bộ nội dung chương", Toast.LENGTH_SHORT).show()
                                    } else if (logs.isNotEmpty()) {
                                        val fullText = logs.joinToString("\n") { it.text }
                                        clipboardManager.setText(AnnotatedString(fullText))
                                        Toast.makeText(context, "Đã sao chép toàn bộ log", Toast.LENGTH_SHORT).show()
                                    }
                                }
                            ) {
                                Icon(
                                    imageVector = Icons.Default.ContentCopy,
                                    contentDescription = "Sao chép log/nội dung",
                                    tint = LegadoTheme.colorScheme.onSurface
                                )
                            }
                        }
                    )
                }
            ) { contentPadding ->
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(contentPadding)
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                ) {
                    // Mode Chips Row
                    LazyRow(
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        items(modes) { (modeEnum, label) ->
                            FilterChip(
                                selected = selectedMode == modeEnum,
                                onClick = {
                                    if (selectedMode != modeEnum) {
                                        selectedMode = modeEnum
                                        if (modeEnum == ExtensionDebugMode.DETAIL && detailInput.isBlank() && lastBookUrl.isNotBlank()) {
                                            detailInput = lastBookUrl
                                        } else if (modeEnum == ExtensionDebugMode.TOC && tocInput.isBlank() && lastBookUrl.isNotBlank()) {
                                            tocInput = lastBookUrl
                                        } else if (modeEnum == ExtensionDebugMode.CONTENT && contentInput.isBlank() && lastChapterUrl.isNotBlank()) {
                                            contentInput = lastChapterUrl
                                        }
                                    }
                                },
                                label = { Text(label, fontSize = 12.sp, fontWeight = if (selectedMode == modeEnum) FontWeight.Bold else FontWeight.Normal) }
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    // Input & Run Row
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        OutlinedTextField(
                            value = getCurrentInput(),
                            onValueChange = { updateCurrentInput(it) },
                            modifier = Modifier.weight(1f),
                            label = { Text(placeholderText) },
                            singleLine = true,
                            shape = RoundedCornerShape(12.dp)
                        )

                        Spacer(modifier = Modifier.width(8.dp))

                        Button(
                            onClick = { runDebug() },
                            enabled = !isDebugging,
                            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 14.dp),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            if (isDebugging) {
                                AppCircularProgressIndicator(
                                    modifier = Modifier.size(18.dp)
                                )
                            } else {
                                Icon(
                                    imageVector = Icons.Default.PlayArrow,
                                    contentDescription = "Chạy"
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text("Chạy")
                            }
                        }
                    }

                    if (selectedMode == ExtensionDebugMode.FULL || selectedMode == ExtensionDebugMode.SEARCH) {
                        Spacer(modifier = Modifier.height(6.dp))
                        LazyRow(
                            horizontalArrangement = Arrangement.spacedBy(6.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            items(suggestions) { item ->
                                SuggestionChip(
                                    onClick = {
                                        updateCurrentInput(item)
                                        runDebug(item)
                                    },
                                    label = { Text(item, fontSize = 12.sp) }
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    // Tab selector when chapter content is available
                    if (displayedChapterContent != null) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 6.dp)
                        ) {
                            FilterChip(
                                selected = activeTab == 0,
                                onClick = { activeTab = 0 },
                                label = { Text("Nhật ký", fontSize = 12.sp, fontWeight = if (activeTab == 0) FontWeight.Bold else FontWeight.Normal) }
                            )
                            FilterChip(
                                selected = activeTab == 1,
                                onClick = { activeTab = 1 },
                                label = { Text("Nội dung (${displayedChapterContent?.length ?: 0} ký tự)", fontSize = 12.sp, fontWeight = if (activeTab == 1) FontWeight.Bold else FontWeight.Normal) }
                            )
                        }
                    }

                    // Log / Content Container
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth()
                            .background(
                                color = LegadoTheme.colorScheme.surfaceContainerLow,
                                shape = RoundedCornerShape(16.dp)
                            )
                            .padding(12.dp)
                    ) {
                        if (activeTab == 1 && displayedChapterContent != null) {
                            val contentLines = remember(displayedChapterContent) {
                                displayedChapterContent?.split("\n") ?: emptyList()
                            }
                            Column(modifier = Modifier.fillMaxSize()) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(bottom = 6.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    AppText(
                                        text = "Toàn bộ nội dung chương (${displayedChapterContent?.length ?: 0} ký tự):",
                                        color = LegadoTheme.colorScheme.primary,
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                    IconButton(
                                        onClick = {
                                            displayedChapterContent?.let { content ->
                                                clipboardManager.setText(AnnotatedString(content))
                                                Toast.makeText(context, "Đã sao chép toàn bộ nội dung chương", Toast.LENGTH_SHORT).show()
                                            }
                                        },
                                        modifier = Modifier.size(28.dp)
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.ContentCopy,
                                            contentDescription = "Sao chép toàn bộ nội dung",
                                            tint = LegadoTheme.colorScheme.onSurface
                                        )
                                    }
                                }
                                SelectionContainer(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxWidth()
                                ) {
                                    LazyColumn(
                                        modifier = Modifier.fillMaxSize(),
                                        verticalArrangement = Arrangement.spacedBy(4.dp)
                                    ) {
                                        items(contentLines) { line ->
                                            Text(
                                                text = line,
                                                color = LegadoTheme.colorScheme.onSurface,
                                                fontFamily = FontFamily.Monospace,
                                                fontSize = 12.sp,
                                                lineHeight = 17.sp
                                            )
                                        }
                                    }
                                }
                            }
                        } else if (logs.isEmpty()) {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                AppText(
                                    text = "Bấm nút \"Chạy\" để bắt đầu gỡ lỗi nguồn...",
                                    color = LegadoTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.7f),
                                    fontFamily = FontFamily.Monospace,
                                    fontSize = 13.sp
                                )
                            }
                        } else {
                            LazyColumn(
                                state = listState,
                                modifier = Modifier.fillMaxSize(),
                                verticalArrangement = Arrangement.spacedBy(4.dp)
                            ) {
                                items(logs) { log ->
                                    val textColor = when (log.state) {
                                        -1 -> LegadoTheme.colorScheme.error
                                        2 -> LegadoTheme.colorScheme.primary
                                        else -> when {
                                            log.text.contains("⇒") -> LegadoTheme.colorScheme.tertiary
                                            log.text.contains("┌") || log.text.contains("└") -> LegadoTheme.colorScheme.secondary
                                            log.text.contains("≈") || log.text.contains("◇") -> LegadoTheme.colorScheme.primary
                                            else -> LegadoTheme.colorScheme.onSurface
                                        }
                                    }

                                    Text(
                                        text = log.text,
                                        color = textColor,
                                        fontFamily = FontFamily.Monospace,
                                        fontSize = 12.sp,
                                        lineHeight = 16.sp
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
