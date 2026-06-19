package io.legado.app.ui.replace.edit

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.ime
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Save
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.AssistChip
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.ExposedDropdownMenuAnchorType
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.animateFloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import io.legado.app.R
import io.legado.app.ui.widget.components.AppFloatingActionButton
import io.legado.app.ui.widget.components.AppScaffold
import io.legado.app.ui.widget.components.AppTextField
import io.legado.app.ui.widget.components.alert.AppAlertDialog
import io.legado.app.ui.widget.components.button.ToggleChip
import io.legado.app.ui.widget.components.button.series.MediumPlainButton
import io.legado.app.ui.widget.components.checkBox.CheckboxItem
import io.legado.app.ui.widget.components.menuItem.RoundDropdownMenu
import io.legado.app.ui.widget.components.menuItem.RoundDropdownMenuItem
import io.legado.app.ui.widget.components.text.AppText
import io.legado.app.ui.widget.components.topbar.GlassMediumFlexibleTopAppBar
import io.legado.app.ui.widget.components.topbar.GlassTopAppBarDefaults
import io.legado.app.ui.widget.components.topbar.TopBarActionButton
import io.legado.app.ui.widget.components.topbar.TopBarNavigationButton
import org.koin.androidx.compose.koinViewModel

@Composable
fun keyboardAsState(): State<Boolean> {
    val isImeVisible = WindowInsets.ime.getBottom(LocalDensity.current) > 0
    return rememberUpdatedState(isImeVisible)
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun ReplaceEditScreen(
    onBack: () -> Unit,
    onSaveSuccess: () -> Unit,
    viewModel: ReplaceEditViewModel = koinViewModel()
) {
    val state by viewModel.uiState.collectAsState()
    val scrollBehavior = GlassTopAppBarDefaults.defaultScrollBehavior()
    var showMenu by remember { mutableStateOf(false) }
    val isKeyboardVisible by keyboardAsState()

    AppScaffold(
        modifier = Modifier
            .nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            GlassMediumFlexibleTopAppBar(
                title = if (state.id > 0) "Sửa quy tắc thay thế" else "Thêm quy tắc thay thế",
                navigationIcon = {
                    TopBarNavigationButton(onClick = onBack)
                },
                actions = {
                    AnimatedVisibility(
                        visible = isKeyboardVisible,
                        enter = fadeIn(),
                        exit = fadeOut()
                    ) {
                        TopBarActionButton(
                            onClick = {
                                viewModel.save(onSaveSuccess)
                            },
                            imageVector = Icons.Default.Save,
                            contentDescription = "Lưu"
                        )
                    }
                    TopBarActionButton(
                        onClick = { showMenu = true },
                        imageVector = Icons.Default.MoreVert,
                        contentDescription = "Thêm thao tác"
                    )
                    RoundDropdownMenu(
                        expanded = showMenu,
                        onDismissRequest = { showMenu = false }
                    ) {
                        RoundDropdownMenuItem(
                            text = "Sao chép quy tắc",
                            onClick = {
                                showMenu = false
                                viewModel.copyRule()
                            }
                        )
                        RoundDropdownMenuItem(
                            text = "Dán quy tắc",
                            onClick = {
                                showMenu = false
                                viewModel.pasteRule(onSuccess = {})
                            }
                        )
                    }
                },
                scrollBehavior = scrollBehavior
            )
        },
        floatingActionButton = {
            AppFloatingActionButton(
                modifier = Modifier
                    .navigationBarsPadding()
                    .animateFloatingActionButton(
                        visible = !isKeyboardVisible,
                        alignment = Alignment.BottomEnd,
                    ),
                onClick = { viewModel.save(onSaveSuccess) },
                tooltipText = stringResource(R.string.action_save),
                icon = Icons.Default.Save
            )
        }, contentWindowInsets = WindowInsets(0, 0, 0, 0)
    ) { innerPadding ->
        Box(
            Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            AnimatedVisibility(
                visible = isKeyboardVisible,
                enter = slideInVertically(
                    initialOffsetY = { fullHeight -> fullHeight },
                ),
                exit = slideOutVertically(
                    targetOffsetY = { fullHeight -> fullHeight },
                ),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .zIndex(1f)
            ) {
                QuickInputBar(
                    onInsert = { text -> viewModel.insertTextAtCursor(text) }
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                AppTextField(
                    value = state.name,
                    onValueChange = viewModel::onNameChange,
                    label = "Tên quy tắc",
                    modifier = Modifier
                        .fillMaxWidth()
                        .onFocusChanged {
                            if (it.isFocused) viewModel.activeField =
                                ReplaceEditViewModel.ActiveField.Name
                        },
                    singleLine = true
                )

                GroupSelector(
                    currentGroup = state.group,
                    allGroups = state.allGroups,
                    onGroupChange = viewModel::onGroupChange,
                    onManageClick = { viewModel.toggleGroupDialog(true) }
                )

                AppTextField(
                    value = state.pattern,
                    onValueChange = viewModel::onPatternChange,
                    label = "Quy tắc khớp",
                    placeholder = { AppText("Nhập biểu thức chính quy hoặc từ khóa") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .onFocusChanged {
                            if (it.isFocused) viewModel.activeField =
                                ReplaceEditViewModel.ActiveField.Pattern
                        }
                )

                AppTextField(
                    value = state.replacement,
                    onValueChange = viewModel::onReplacementChange,
                    label = "Thay thế thành",
                    placeholder = { AppText("Nhập nội dung thay thế hoặc nhóm bắt") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .onFocusChanged {
                            if (it.isFocused) viewModel.activeField =
                                ReplaceEditViewModel.ActiveField.Replacement
                        }
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    ToggleChip(
                        label = "Tiêu đề",
                        selected = state.scopeTitle,
                        checkedContentDescription = "Đã chọn",
                        onToggle = { viewModel.onScopeTitleChange(!state.scopeTitle) }
                    )

                    Spacer(Modifier.width(8.dp))

                    ToggleChip(
                        label = "Nội dung",
                        selected = state.scopeContent,
                        checkedContentDescription = "Đã chọn",
                        onToggle = { viewModel.onScopeContentChange(!state.scopeContent) }
                    )

                    Spacer(Modifier.weight(1f))

                    ToggleChip(
                        label = "Dùng regex",
                        selected = state.isRegex,
                        checkedContentDescription = "Regex đã bật",
                        onToggle = { viewModel.onRegexChange(!state.isRegex) }
                    )

                }

                AppTextField(
                    value = state.scope,
                    onValueChange = viewModel::onScopeChange,
                    label = "Phạm vi chỉ định",
                    placeholder = { AppText("Chỉ định phạm vi áp dụng quy tắc") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .onFocusChanged {
                            if (it.isFocused) viewModel.activeField =
                                ReplaceEditViewModel.ActiveField.Scope
                        }
                )

                AppTextField(
                    value = state.excludeScope,
                    onValueChange = viewModel::onExcludeScopeChange,
                    label = "Phạm vi loại trừ",
                    placeholder = { AppText("Chỉ định phạm vi không áp dụng quy tắc") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .onFocusChanged {
                            if (it.isFocused) viewModel.activeField =
                                ReplaceEditViewModel.ActiveField.Exclude
                        }
                )

                AppTextField(
                    value = state.timeout,
                    onValueChange = viewModel::onTimeoutChange,
                    label = "Thời gian chờ (ms)",
                    placeholder = { AppText("3000") },
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(Modifier.height(120.dp))

            }

            ManageGroupDialog(
                show = state.showGroupDialog,
                groups = state.allGroups.filter { it != "Mặc định" && it != "默认" },
                onDismiss = { viewModel.toggleGroupDialog(false) },
                onDelete = { viewModel.deleteGroups(it) }
            )
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GroupSelector(
    currentGroup: String,
    allGroups: List<String>,
    onGroupChange: (String) -> Unit,
    onManageClick: () -> Unit
) {
    var expanded by remember { mutableStateOf(false) }

    Row(verticalAlignment = Alignment.CenterVertically) {
        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = { expanded = !expanded },
            modifier = Modifier.weight(1f)
        ) {
            AppTextField(
                value = currentGroup,
                onValueChange = onGroupChange,
                label = "Nhóm",
                placeholder = { AppText("Mặc định") },
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
                modifier = Modifier
                    .fillMaxWidth()
                    .menuAnchor(
                        ExposedDropdownMenuAnchorType.PrimaryEditable,
                        true
                    )
            )
            RoundDropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                allGroups.forEach { selectionOption ->
                    RoundDropdownMenuItem(
                        text = selectionOption,
                        onClick = {
                            onGroupChange(selectionOption)
                            expanded = false
                        }
                    )
                }
            }
        }
        MediumPlainButton(
            onClick = onManageClick,
            icon = Icons.Default.Settings
        )
    }
}

@Composable
fun ManageGroupDialog(
    show: Boolean,
    groups: List<String>,
    onDismiss: () -> Unit,
    onDelete: (List<String>) -> Unit
) {
    var selectedGroups by remember(show) { mutableStateOf(emptySet<String>()) }

    AppAlertDialog(
        show = show,
        onDismissRequest = onDismiss,
        title = "Quản lý nhóm",
        content = {
            if (groups.isEmpty()) {
                AppText("Không có nhóm nào khác")
            } else {
                Column(
                    modifier = Modifier.verticalScroll(rememberScrollState()),
                ) {
                    groups.forEach { group ->
                        val isSelected = selectedGroups.contains(group)

                        CheckboxItem(
                            title = group,
                            checked = isSelected,
                            onCheckedChange = { checked ->
                                selectedGroups = if (checked) {
                                    selectedGroups + group
                                } else {
                                    selectedGroups - group
                                }
                            }
                        )
                    }
                }
            }
        },
        confirmText = "Xóa đã chọn",
        onConfirm = {
            onDelete(selectedGroups.toList())
        },
        dismissText = "Đóng",
        onDismiss = onDismiss
    )
}

@Composable
fun QuickInputBar(
    onInsert: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val symbols = listOf(".*", "\\d+", "\\w+", "[]", "()", "^", "$", "|", "{}", "<>")

    BottomAppBar(
        modifier = modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState()),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        symbols.forEach { symbol ->
            AssistChip(
                onClick = { onInsert(symbol) },
                label = { AppText(symbol) },
                modifier = Modifier.padding(end = 8.dp)
            )
        }
    }
}
