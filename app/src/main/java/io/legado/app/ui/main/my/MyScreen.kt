package io.legado.app.ui.main.my

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material.icons.automirrored.filled.HelpOutline
import androidx.compose.material.icons.automirrored.filled.LibraryBooks
import androidx.compose.material.icons.automirrored.filled.Rule
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.FindReplace
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.OpenInBrowser
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Source
import androidx.compose.material.icons.filled.Web
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.legado.app.ui.theme.LegadoTheme
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.border
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Search
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import io.legado.app.R
import io.legado.app.ui.book.bookmark.AllBookmarkActivity
import io.legado.app.ui.book.source.manage.BookSourceActivity
import io.legado.app.ui.book.toc.rule.TxtTocRuleActivity
import io.legado.app.ui.dict.rule.DictRuleActivity
import io.legado.app.ui.file.FileManageActivity
import io.legado.app.ui.replace.ReplaceRuleActivity
import io.legado.app.ui.theme.adaptiveContentPadding
import io.legado.app.ui.widget.components.AppScaffold
import io.legado.app.ui.widget.components.SplicedColumnGroup
import io.legado.app.ui.widget.components.button.series.SmallPlainButton
import io.legado.app.ui.widget.components.settingItem.ClickableSettingItem
import io.legado.app.ui.widget.components.settingItem.SwitchSettingItem
import io.legado.app.ui.widget.components.topbar.GlassMediumFlexibleTopAppBar
import io.legado.app.ui.widget.components.topbar.GlassTopAppBarDefaults
import io.legado.app.ui.widget.components.topbar.TopBarActionButton
import org.koin.androidx.compose.koinViewModel


@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun MyScreen(
    viewModel: MyViewModel = koinViewModel(),
    onOpenSettings: () -> Unit,
    onNavigate: (PrefClickEvent) -> Unit
) {

    val context = androidx.compose.ui.platform.LocalContext.current
    var showSupabaseMembersDialog by androidx.compose.runtime.remember { androidx.compose.runtime.mutableStateOf(false) }
    var serviceRoleKey by androidx.compose.runtime.remember {
        androidx.compose.runtime.mutableStateOf(io.legado.app.help.config.LocalConfig.supabaseServiceRoleKey ?: "")
    }
    var userList by androidx.compose.runtime.remember {
        androidx.compose.runtime.mutableStateOf<List<io.legado.app.help.SupabaseUser>>(emptyList())
    }
    var searchEmailQuery by androidx.compose.runtime.remember {
        androidx.compose.runtime.mutableStateOf("")
    }
    var isFetchingUsers by androidx.compose.runtime.remember {
        androidx.compose.runtime.mutableStateOf(false)
    }
    var editingProfile by androidx.compose.runtime.remember { androidx.compose.runtime.mutableStateOf<io.legado.app.help.SupabaseUser?>(null) }
    val scope = androidx.compose.runtime.rememberCoroutineScope()

    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    val scrollBehavior = GlassTopAppBarDefaults.defaultScrollBehavior()

    AppScaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        contentWindowInsets = WindowInsets.systemBars
            .only(WindowInsetsSides.Horizontal + WindowInsetsSides.Top),
        topBar = {
            GlassMediumFlexibleTopAppBar(
                title = stringResource(R.string.my),
                scrollBehavior = scrollBehavior
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(
                    adaptiveContentPadding(
                        top = padding.calculateTopPadding(),
                        bottom = 120.dp
                    )
                )
        ) {
            SplicedColumnGroup(
                title = ""
            ) {
                WebServiceSettingBlock(
                    uiState = uiState,
                    onToggleWebService = {
                        viewModel.onEvent(PrefClickEvent.ToggleWebService)
                    },
                    onNavigate = onNavigate
                )
            }

            SplicedColumnGroup(
                title = stringResource(R.string.rule_segment),
            ) {
                ClickableSettingItem(
                    title = stringResource(R.string.book_source_manage),
                    description = stringResource(R.string.book_source_manage_desc),
                    imageVector = Icons.Default.Source,
                    onClick = {
                        onNavigate(
                            PrefClickEvent.StartActivity(BookSourceActivity::class.java)
                        )
                    }
                )
                ClickableSettingItem(
                    title = stringResource(R.string.replace_purify),
                    imageVector = Icons.Default.FindReplace,
                    onClick = {
                        onNavigate(
                            PrefClickEvent.StartActivity(ReplaceRuleActivity::class.java)
                        )
                    }
                )
                ClickableSettingItem(
                    title = stringResource(R.string.txt_toc_rule),
                    imageVector = Icons.AutoMirrored.Filled.Rule,
                    onClick = {
                        onNavigate(
                            PrefClickEvent.StartActivity(TxtTocRuleActivity::class.java)
                        )
                    }
                )
                ClickableSettingItem(
                    title = stringResource(R.string.dict_rule),
                    imageVector = Icons.AutoMirrored.Filled.LibraryBooks,
                    onClick = {
                        onNavigate(
                            PrefClickEvent.StartActivity(DictRuleActivity::class.java)
                        )
                    }
                )
            }

            SplicedColumnGroup(
                title = stringResource(R.string.other)
            ) {
                ClickableSettingItem(
                    title = stringResource(R.string.setting),
                    imageVector = Icons.Default.Settings,
                    onClick = {
                        onOpenSettings()
                    }
                )
                ClickableSettingItem(
                    title = stringResource(R.string.bookmark),
                    imageVector = Icons.Default.Bookmark,
                    onClick = {
                        onNavigate(PrefClickEvent.StartActivity(AllBookmarkActivity::class.java))
                    }
                )
                ClickableSettingItem(
                    title = stringResource(R.string.read_record),
                    imageVector = Icons.Default.History,
                    onClick = {
                        onNavigate(PrefClickEvent.OpenReadRecord)
                    }
                )
                ClickableSettingItem(
                    title = stringResource(R.string.cache_management),
                    imageVector = Icons.Default.Download,
                    onClick = {
                        onNavigate(PrefClickEvent.OpenBookCacheManage)
                    }
                )
                ClickableSettingItem(
                    title = stringResource(R.string.file_manage),
                    imageVector = Icons.Default.Folder,
                    onClick = {
                        onNavigate(PrefClickEvent.StartActivity(FileManageActivity::class.java))
                    }
                )
                if (io.legado.app.help.config.LocalConfig.userEmail?.lowercase()?.trim() == "nthanhnam@gmail.com") {
                    ClickableSettingItem(
                        title = "Thành viên nội bộ",
                        description = if (io.legado.app.help.MemberManager.isVip) {
                            "Đang hoạt động (Còn ${io.legado.app.help.MemberManager.daysRemaining} ngày)"
                        } else {
                            "Tài khoản thường (Bản dùng thử)"
                        },
                        imageVector = Icons.Default.Bookmark,
                        onClick = {
                            showSupabaseMembersDialog = true
                        }
                    )
                }
                ClickableSettingItem(
                    title = stringResource(R.string.about),
                    imageVector = Icons.Default.Info,
                    onClick = {
                        onNavigate(PrefClickEvent.OpenAbout)
                    }
                )
                if (io.legado.app.help.config.LocalConfig.isLoggedIn) {
                    ClickableSettingItem(
                        title = "Đăng xuất",
                        imageVector = Icons.AutoMirrored.Filled.ExitToApp,
                        onClick = {
                            io.legado.app.help.config.LocalConfig.isLoggedIn = false
                            io.legado.app.help.config.LocalConfig.userEmail = null
                            io.legado.app.help.config.LocalConfig.accessToken = null
                            io.legado.app.help.config.LocalConfig.vipExpireFromServer = 0L
                            // Restart activity to welcome screen
                            val intent = android.content.Intent(context, io.legado.app.ui.welcome.WelcomeActivity::class.java)
                            intent.flags = android.content.Intent.FLAG_ACTIVITY_NEW_TASK or android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK
                            context.startActivity(intent)
                        }
                    )
                }
                ClickableSettingItem(
                    title = stringResource(R.string.exit),
                    imageVector = Icons.AutoMirrored.Filled.ExitToApp,
                    onClick = {
                        onNavigate(PrefClickEvent.ExitApp)
                    }
                )
            }
        }
    }

    SupabaseMembersDialog(
        show = showSupabaseMembersDialog,
        onDismissRequest = { showSupabaseMembersDialog = false },
        serviceRoleKey = serviceRoleKey,
        onServiceRoleKeyChange = {
            serviceRoleKey = it
            io.legado.app.help.config.LocalConfig.supabaseServiceRoleKey = it
        },
        isFetchingUsers = isFetchingUsers,
        onFetchUsers = {
            if (serviceRoleKey.isBlank()) {
                android.widget.Toast.makeText(context, "Vui lòng nhập Service Role Key!", android.widget.Toast.LENGTH_SHORT).show()
            } else {
                isFetchingUsers = true
                scope.launch(kotlinx.coroutines.Dispatchers.IO) {
                    val result = io.legado.app.help.MemberManager.fetchSupabaseUsers(serviceRoleKey.trim())
                    kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.Main) {
                        isFetchingUsers = false
                        result.fold(
                            onSuccess = {
                                userList = it
                                android.widget.Toast.makeText(context, "Tải thành công ${it.size} tài khoản!", android.widget.Toast.LENGTH_SHORT).show()
                            },
                            onFailure = {
                                android.widget.Toast.makeText(context, "Lỗi: ${it.localizedMessage}", android.widget.Toast.LENGTH_LONG).show()
                            }
                        )
                    }
                }
            }
        },
        userList = userList,
        searchEmailQuery = searchEmailQuery,
        onSearchEmailQueryChange = { searchEmailQuery = it },
        onUserClick = { editingProfile = it }
    )

    EditProfileDialog(
        user = editingProfile,
        onDismissRequest = { editingProfile = null },
        serviceRoleKey = serviceRoleKey,
        onUserUpdated = {
            scope.launch(kotlinx.coroutines.Dispatchers.IO) {
                val refresh = io.legado.app.help.MemberManager.fetchSupabaseUsers(serviceRoleKey.trim())
                if (refresh.isSuccess) {
                    kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.Main) {
                        userList = refresh.getOrThrow()
                        val updated = userList.find { it.id == editingProfile?.id }
                        if (updated != null) {
                            editingProfile = updated
                        }
                    }
                }
            }
        }
    )
}


@Composable
fun WebServiceSettingBlock(
    uiState: MyUiState,
    onToggleWebService: () -> Unit,
    onNavigate: (PrefClickEvent) -> Unit
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        SwitchSettingItem(
            title = stringResource(R.string.web_service),
            description = if (uiState.isWebServiceRun) {
                uiState.webServiceAddress
            } else {
                stringResource(R.string.web_service_desc)
            },
            imageVector = Icons.Default.Web,
            checked = uiState.isWebServiceRun,
            onCheckedChange = { onToggleWebService() }
        )

        AnimatedVisibility(
            visible = uiState.isWebServiceRun,
            enter = expandVertically(),
            exit = shrinkVertically()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, top = 12.dp, bottom = 12.dp),
                horizontalArrangement = Arrangement.End
            ) {
                SmallPlainButton(
                    onClick = {
                        onNavigate(PrefClickEvent.CopyUrl(uiState.webServiceAddress))
                    },
                    icon = Icons.Default.ContentCopy,
                    text = stringResource(R.string.copy_url)
                )

                Spacer(modifier = Modifier.width(12.dp))

                SmallPlainButton(
                    onClick = {
                        onNavigate(PrefClickEvent.OpenUrl(uiState.webServiceAddress))
                    },
                    icon = Icons.Default.OpenInBrowser,
                    text = stringResource(R.string.open_in_browser)
                )
            }
        }
    }
}


@Composable
fun SupabaseMembersDialog(
    show: Boolean,
    onDismissRequest: () -> Unit,
    serviceRoleKey: String,
    onServiceRoleKeyChange: (String) -> Unit,
    isFetchingUsers: Boolean,
    onFetchUsers: () -> Unit,
    userList: List<io.legado.app.help.SupabaseUser>,
    searchEmailQuery: String,
    onSearchEmailQueryChange: (String) -> Unit,
    onUserClick: (io.legado.app.help.SupabaseUser) -> Unit
) {
    if (!show) return
    androidx.compose.material3.AlertDialog(
        onDismissRequest = onDismissRequest,
        title = { androidx.compose.material3.Text(text = "Quản lý thành viên Supabase", fontWeight = androidx.compose.ui.text.font.FontWeight.Bold) },
        text = {
            androidx.compose.foundation.layout.Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(max = 500.dp),
                verticalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(12.dp)
            ) {
                androidx.compose.material3.OutlinedTextField(
                    value = serviceRoleKey,
                    onValueChange = onServiceRoleKeyChange,
                    label = { androidx.compose.material3.Text("Supabase Service Role Key") },
                    placeholder = { androidx.compose.material3.Text("Nhập key service_role bí mật...") },
                    modifier = Modifier.fillMaxWidth()
                )

                val context = androidx.compose.ui.platform.LocalContext.current
                androidx.compose.material3.Button(
                    onClick = onFetchUsers,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    if (isFetchingUsers) {
                        androidx.compose.material3.CircularProgressIndicator(
                            modifier = Modifier.size(18.dp),
                            color = LegadoTheme.colorScheme.onPrimary,
                            strokeWidth = 2.dp
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        androidx.compose.material3.Text("Đang tải...")
                    } else {
                        androidx.compose.material3.Text("Tải danh sách tài khoản Supabase")
                    }
                }

                if (userList.isNotEmpty()) {
                    androidx.compose.material3.OutlinedTextField(
                        value = searchEmailQuery,
                        onValueChange = onSearchEmailQueryChange,
                        placeholder = { androidx.compose.material3.Text("Tìm theo Gmail hoặc tên...") },
                        leadingIcon = { androidx.compose.material3.Icon(Icons.Default.Search, contentDescription = null) },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth()
                    )

                    androidx.compose.foundation.lazy.LazyColumn(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        verticalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(8.dp)
                    ) {
                        val filteredUsers = userList.filter {
                            searchEmailQuery.isBlank() ||
                                    it.email.contains(searchEmailQuery.trim(), ignoreCase = true) ||
                                    it.displayName.contains(searchEmailQuery.trim(), ignoreCase = true)
                        }

                        if (filteredUsers.isEmpty()) {
                            item {
                                androidx.compose.foundation.layout.Box(
                                    modifier = Modifier.fillMaxWidth().padding(16.dp),
                                    contentAlignment = androidx.compose.ui.Alignment.Center
                                ) {
                                    androidx.compose.material3.Text("Không tìm thấy kết quả phù hợp", color = LegadoTheme.colorScheme.onSurfaceVariant)
                                }
                            }
                        } else {
                            items(filteredUsers, key = { it.id }) { user ->
                                val isVip = user.vipExpire > System.currentTimeMillis()
                                val vipStatusText = if (isVip) {
                                    val diff = user.vipExpire - System.currentTimeMillis()
                                    val days = (diff / (1000 * 60 * 60 * 24)).coerceAtLeast(0) + 1
                                    "VIP còn $days ngày"
                                } else {
                                    "Thành viên thường"
                                }

                                io.legado.app.ui.widget.components.card.GlassCard(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable { onUserClick(user) },
                                    cornerRadius = 12.dp
                                ) {
                                    androidx.compose.foundation.layout.Row(
                                        modifier = Modifier.padding(12.dp),
                                        verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
                                    ) {
                                        // Avatar circle
                                        androidx.compose.foundation.layout.Box(
                                            modifier = Modifier
                                                .size(40.dp)
                                                .clip(CircleShape)
                                                .background(LegadoTheme.colorScheme.primary.copy(alpha = 0.1f))
                                                .border(
                                                    width = 1.dp,
                                                    color = if (isVip) androidx.compose.ui.graphics.Color(0xFFFFD700) else LegadoTheme.colorScheme.primary.copy(alpha = 0.2f),
                                                    shape = CircleShape
                                                ),
                                            contentAlignment = androidx.compose.ui.Alignment.Center
                                        ) {
                                            val initials = if (user.displayName.isNotBlank()) {
                                                user.displayName.take(2).uppercase()
                                            } else if (user.email.isNotBlank()) {
                                                user.email.take(2).uppercase()
                                            } else "U"
                                            androidx.compose.material3.Text(
                                                text = initials,
                                                color = LegadoTheme.colorScheme.primary,
                                                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                                                fontSize = 14.sp
                                            )
                                        }

                                        Spacer(modifier = Modifier.width(12.dp))

                                        androidx.compose.foundation.layout.Column(
                                            modifier = Modifier.weight(1f)
                                        ) {
                                            androidx.compose.foundation.layout.Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
                                                androidx.compose.material3.Text(
                                                    text = if (user.displayName.isNotBlank()) user.displayName else "Chưa đặt tên",
                                                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                                                    fontSize = 14.sp
                                                )
                                                if (isVip) {
                                                    Spacer(modifier = Modifier.width(6.dp))
                                                    androidx.compose.material3.Icon(
                                                        imageVector = Icons.Default.Star,
                                                        contentDescription = "VIP",
                                                        tint = androidx.compose.ui.graphics.Color(0xFFFFD700),
                                                        modifier = Modifier.size(16.dp)
                                                    )
                                                }
                                            }
                                            androidx.compose.material3.Text(
                                                text = user.email,
                                                fontSize = 11.sp,
                                                color = LegadoTheme.colorScheme.onSurfaceVariant
                                            )
                                        }

                                        Spacer(modifier = Modifier.width(8.dp))

                                        androidx.compose.foundation.layout.Column(
                                            horizontalAlignment = androidx.compose.ui.Alignment.End
                                        ) {
                                            androidx.compose.material3.Text(
                                                text = vipStatusText,
                                                fontSize = 11.sp,
                                                color = if (isVip) androidx.compose.ui.graphics.Color(0xFFE5A900) else LegadoTheme.colorScheme.onSurfaceVariant,
                                                fontWeight = if (isVip) androidx.compose.ui.text.font.FontWeight.Bold else androidx.compose.ui.text.font.FontWeight.Normal
                                            )
                                            Spacer(modifier = Modifier.height(4.dp))
                                            androidx.compose.material3.Icon(
                                                imageVector = Icons.Default.Edit,
                                                contentDescription = "Sửa",
                                                tint = LegadoTheme.colorScheme.onSurfaceVariant,
                                                modifier = Modifier.size(16.dp)
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        },
        confirmButton = {
            androidx.compose.material3.TextButton(onClick = onDismissRequest) {
                androidx.compose.material3.Text("Đóng")
            }
        }
    )
}

@Composable
fun EditProfileDialog(
    user: io.legado.app.help.SupabaseUser?,
    onDismissRequest: () -> Unit,
    serviceRoleKey: String,
    onUserUpdated: () -> Unit
) {
    if (user == null) return
    val context = androidx.compose.ui.platform.LocalContext.current
    val scope = androidx.compose.runtime.rememberCoroutineScope()
    var tempName by androidx.compose.runtime.remember(user) { androidx.compose.runtime.mutableStateOf(user.displayName) }
    var isVipActive by androidx.compose.runtime.remember(user) {
        androidx.compose.runtime.mutableStateOf(user.vipExpire > System.currentTimeMillis())
    }
    var vipUntilDate by androidx.compose.runtime.remember(user) {
        androidx.compose.runtime.mutableStateOf(
            if (user.vipExpire > System.currentTimeMillis()) {
                val sdf = java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.getDefault())
                sdf.format(java.util.Date(user.vipExpire))
            } else ""
        )
    }
    var isSaving by androidx.compose.runtime.remember { androidx.compose.runtime.mutableStateOf(false) }

    val handleGrantDays = { days: Int ->
        val calendar = java.util.Calendar.getInstance()
        calendar.add(java.util.Calendar.DAY_OF_YEAR, days)
        val newExpire = calendar.timeInMillis
        isSaving = true
        scope.launch(kotlinx.coroutines.Dispatchers.IO) {
            val result = io.legado.app.help.MemberManager.updateUserProfile(serviceRoleKey.trim(), user.id, tempName.trim(), newExpire)
            kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.Main) {
                isSaving = false
                result.fold(
                    onSuccess = {
                        android.widget.Toast.makeText(context, "Cấp VIP $days ngày thành công!", android.widget.Toast.LENGTH_SHORT).show()
                        onUserUpdated()
                        isVipActive = true
                        val sdf = java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.getDefault())
                        vipUntilDate = sdf.format(java.util.Date(newExpire))
                    },
                    onFailure = {
                        android.widget.Toast.makeText(context, "Lỗi: ${it.localizedMessage}", android.widget.Toast.LENGTH_SHORT).show()
                    }
                )
            }
        }
    }

    androidx.compose.material3.AlertDialog(
        onDismissRequest = { if (!isSaving) onDismissRequest() },
        title = {
            androidx.compose.foundation.layout.Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
                androidx.compose.material3.Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = null,
                    tint = LegadoTheme.colorScheme.primary,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                androidx.compose.material3.Text(
                    text = "Cấu hình thành viên",
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                    fontSize = 18.sp
                )
            }
        },
        text = {
            androidx.compose.foundation.layout.Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(16.dp)
            ) {
                androidx.compose.material3.Text(
                    text = "Cấu hình cho tài khoản: ${user.email}",
                    style = LegadoTheme.typography.bodySmall,
                    color = LegadoTheme.colorScheme.onSurfaceVariant
                )

                // Nickname field with save button
                androidx.compose.foundation.layout.Row(
                    verticalAlignment = androidx.compose.ui.Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    androidx.compose.material3.OutlinedTextField(
                        value = tempName,
                        onValueChange = { tempName = it },
                        label = { androidx.compose.material3.Text("Tên nhân vật (Nickname)") },
                        singleLine = true,
                        modifier = Modifier.weight(1f),
                        enabled = !isSaving
                    )
                    if (tempName.trim() != user.displayName) {
                        Spacer(modifier = Modifier.width(8.dp))
                        androidx.compose.material3.IconButton(
                            onClick = {
                                isSaving = true
                                scope.launch(kotlinx.coroutines.Dispatchers.IO) {
                                    val currentExpire = if (isVipActive) {
                                        if (vipUntilDate.isNotBlank()) {
                                            try {
                                                val sdf = java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.getDefault())
                                                sdf.parse(vipUntilDate)?.time ?: (System.currentTimeMillis() + 30L * 24 * 60 * 60 * 1000)
                                            } catch (_: Exception) {
                                                System.currentTimeMillis() + 30L * 24 * 60 * 60 * 1000
                                            }
                                        } else {
                                            System.currentTimeMillis() + 30L * 24 * 60 * 60 * 1000
                                        }
                                    } else null
                                    val result = io.legado.app.help.MemberManager.updateUserProfile(serviceRoleKey.trim(), user.id, tempName.trim(), currentExpire)
                                    kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.Main) {
                                        isSaving = false
                                        if (result.isSuccess) {
                                            android.widget.Toast.makeText(context, "Cập nhật tên thành công!", android.widget.Toast.LENGTH_SHORT).show()
                                            onUserUpdated()
                                        } else {
                                            android.widget.Toast.makeText(context, "Lỗi: ${result.exceptionOrNull()?.localizedMessage}", android.widget.Toast.LENGTH_SHORT).show()
                                        }
                                    }
                                }
                            },
                            enabled = !isSaving,
                            colors = androidx.compose.material3.IconButtonDefaults.iconButtonColors(contentColor = LegadoTheme.colorScheme.primary)
                        ) {
                            androidx.compose.material3.Icon(
                                imageVector = Icons.Default.Check,
                                contentDescription = "Lưu tên"
                            )
                        }
                    }
                }

                androidx.compose.material3.HorizontalDivider()

                // Switch VIP
                androidx.compose.foundation.layout.Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = androidx.compose.ui.Alignment.CenterVertically,
                    horizontalArrangement = androidx.compose.foundation.layout.Arrangement.SpaceBetween
                ) {
                    androidx.compose.foundation.layout.Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
                        androidx.compose.material3.Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = null,
                            tint = androidx.compose.ui.graphics.Color(0xFFFFD700),
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        androidx.compose.material3.Text(
                            text = "Kích hoạt VIP",
                            fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold,
                            fontSize = 14.sp
                        )
                    }
                    androidx.compose.material3.Switch(
                        checked = isVipActive,
                        onCheckedChange = { active ->
                            isSaving = true
                            scope.launch(kotlinx.coroutines.Dispatchers.IO) {
                                val newExpire = if (active) {
                                    val calendar = java.util.Calendar.getInstance()
                                    calendar.add(java.util.Calendar.DAY_OF_YEAR, 30)
                                    calendar.timeInMillis
                                } else null
                                val result = io.legado.app.help.MemberManager.updateUserProfile(serviceRoleKey.trim(), user.id, tempName.trim(), newExpire)
                                kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.Main) {
                                    isSaving = false
                                    if (result.isSuccess) {
                                        android.widget.Toast.makeText(context, if (active) "Đã kích hoạt VIP 30 ngày!" else "Đã hủy VIP!", android.widget.Toast.LENGTH_SHORT).show()
                                        onUserUpdated()
                                        isVipActive = active
                                        if (active) {
                                            val sdf = java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.getDefault())
                                            vipUntilDate = sdf.format(java.util.Date(System.currentTimeMillis() + 30L * 24 * 60 * 60 * 1000))
                                        } else {
                                            vipUntilDate = ""
                                        }
                                    } else {
                                        android.widget.Toast.makeText(context, "Lỗi: ${result.exceptionOrNull()?.localizedMessage}", android.widget.Toast.LENGTH_SHORT).show()
                                    }
                                }
                            }
                        },
                        enabled = !isSaving
                    )
                }

                if (isVipActive) {
                    androidx.compose.foundation.layout.Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(LegadoTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f), RoundedCornerShape(8.dp))
                            .border(1.dp, LegadoTheme.colorScheme.outline.copy(alpha = 0.1f), RoundedCornerShape(8.dp))
                            .padding(12.dp),
                        verticalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(10.dp)
                    ) {
                        androidx.compose.foundation.layout.Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = androidx.compose.ui.Alignment.CenterVertically,
                            horizontalArrangement = androidx.compose.foundation.layout.Arrangement.SpaceBetween
                        ) {
                            androidx.compose.material3.Text("Ngày hết hạn VIP:", fontSize = 13.sp)

                            val dateText = if (vipUntilDate.isNotBlank()) vipUntilDate else "Chọn ngày"
                            androidx.compose.material3.Text(
                                text = dateText,
                                color = LegadoTheme.colorScheme.primary,
                                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                                fontSize = 14.sp,
                                modifier = Modifier
                                    .clickable(enabled = !isSaving) {
                                        val calendar = java.util.Calendar.getInstance()
                                        if (vipUntilDate.isNotBlank()) {
                                            try {
                                                val sdf = java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.getDefault())
                                                val date = sdf.parse(vipUntilDate)
                                                if (date != null) calendar.time = date
                                            } catch (_: Exception) {}
                                        }
                                        android.app.DatePickerDialog(
                                            context,
                                            { _, year, month, dayOfMonth ->
                                                val formattedMonth = String.format("%02d", month + 1)
                                                val formattedDay = String.format("%02d", dayOfMonth)
                                                val newDateStr = "$year-$formattedMonth-$formattedDay"
                                                try {
                                                    val sdf = java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.getDefault())
                                                    val newExpire = sdf.parse(newDateStr)?.time ?: System.currentTimeMillis()
                                                    isSaving = true
                                                    scope.launch(kotlinx.coroutines.Dispatchers.IO) {
                                                        val result = io.legado.app.help.MemberManager.updateUserProfile(serviceRoleKey.trim(), user.id, tempName.trim(), newExpire)
                                                        kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.Main) {
                                                            isSaving = false
                                                            if (result.isSuccess) {
                                                                android.widget.Toast.makeText(context, "Đổi ngày hết hạn thành công!", android.widget.Toast.LENGTH_SHORT).show()
                                                                onUserUpdated()
                                                                vipUntilDate = newDateStr
                                                            } else {
                                                                android.widget.Toast.makeText(context, "Lỗi: ${result.exceptionOrNull()?.localizedMessage}", android.widget.Toast.LENGTH_SHORT).show()
                                                            }
                                                        }
                                                    }
                                                } catch (_: Exception) {}
                                            },
                                            calendar.get(java.util.Calendar.YEAR),
                                            calendar.get(java.util.Calendar.MONTH),
                                            calendar.get(java.util.Calendar.DAY_OF_MONTH)
                                        ).show()
                                    }
                                    .padding(vertical = 4.dp, horizontal = 8.dp)
                            )
                        }

                        // Quick days grant
                        androidx.compose.foundation.layout.Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(6.dp)
                        ) {
                            listOf("30 ngày" to 30, "90 ngày" to 90, "365 ngày" to 365).forEach { (label, days) ->
                                androidx.compose.foundation.layout.Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .background(LegadoTheme.colorScheme.surface, RoundedCornerShape(6.dp))
                                        .border(1.dp, LegadoTheme.colorScheme.outline.copy(alpha = 0.15f), RoundedCornerShape(6.dp))
                                        .clickable(enabled = !isSaving) { handleGrantDays(days) }
                                        .padding(vertical = 8.dp),
                                    contentAlignment = androidx.compose.ui.Alignment.Center
                                ) {
                                    androidx.compose.material3.Text(
                                        text = label,
                                        color = LegadoTheme.colorScheme.primary,
                                        fontSize = 11.sp,
                                        fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
                                    )
                                }
                            }
                        }
                    }
                }
            }
        },
        confirmButton = {
            androidx.compose.material3.TextButton(
                onClick = onDismissRequest,
                enabled = !isSaving
            ) {
                androidx.compose.material3.Text("Đóng")
            }
        }
    )
}


