package io.legado.app.ui.main.my

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.compose.material3.Surface
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material.icons.automirrored.filled.LibraryBooks
import androidx.compose.material.icons.automirrored.filled.Rule
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.FindReplace
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.OpenInBrowser
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Source
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Web
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.LocalRippleConfiguration
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Switch
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import io.legado.app.R
import io.legado.app.help.SupabaseUser
import io.legado.app.help.MemberManager
import io.legado.app.ui.widget.components.dialog.TextListInputDialog
import androidx.compose.material3.OutlinedButton
import io.legado.app.ui.book.bookmark.AllBookmarkActivity
import io.legado.app.ui.book.source.manage.BookSourceActivity
import io.legado.app.ui.book.toc.rule.TxtTocRuleActivity
import io.legado.app.ui.dict.rule.DictRuleActivity
import io.legado.app.ui.file.FileManageActivity
import io.legado.app.ui.replace.ReplaceRuleActivity
import io.legado.app.ui.theme.LegadoTheme
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import io.legado.app.ui.theme.adaptiveContentPadding
import androidx.compose.ui.graphics.asImageBitmap
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import io.legado.app.ui.widget.components.AppScaffold
import io.legado.app.ui.widget.components.SplicedColumnGroup
import io.legado.app.ui.widget.components.button.series.SmallPlainButton
import io.legado.app.ui.widget.components.card.GlassCard
import io.legado.app.ui.widget.components.settingItem.ClickableSettingItem
import io.legado.app.ui.widget.components.settingItem.SwitchSettingItem
import io.legado.app.ui.widget.components.topbar.GlassMediumFlexibleTopAppBar
import io.legado.app.ui.widget.components.topbar.GlassTopAppBarDefaults
import org.koin.androidx.compose.koinViewModel
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun MyScreen(
    viewModel: MyViewModel = koinViewModel(),
    onOpenSettings: () -> Unit,
    onNavigateToChat: () -> Unit,
    onNavigate: (PrefClickEvent) -> Unit
) {
    val context = LocalContext.current
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    val scrollBehavior = GlassTopAppBarDefaults.defaultScrollBehavior()


    var showAuthDialog by remember { mutableStateOf(false) }
    var authDialogMode by remember { mutableStateOf(MyAuthMode.LOGIN) }
    var showEditNameDialog by remember { mutableStateOf(false) }
    var showVipManagement by remember { mutableStateOf(false) }

    val lifecycleOwner = androidx.lifecycle.compose.LocalLifecycleOwner.current
    androidx.compose.runtime.DisposableEffect(lifecycleOwner) {
        val observer = androidx.lifecycle.LifecycleEventObserver { _, event ->
            if (event == androidx.lifecycle.Lifecycle.Event.ON_RESUME) {
                viewModel.onIntent(MyIntent.RefreshUserStatus)
            }
        }
        lifecycleOwner.lifecycle.addObserver(observer)
        onDispose {
            lifecycleOwner.lifecycle.removeObserver(observer)
        }
    }

    LaunchedEffect(uiState.isLoggedIn) {
        if (uiState.isLoggedIn) {
            showAuthDialog = false
        }
    }

    LaunchedEffect(viewModel) {
        viewModel.onIntent(MyIntent.RefreshUserStatus)
        viewModel.effects.collect { effect ->
            when (effect) {
                is MyEffect.ShowToast -> {
                    android.widget.Toast.makeText(context, effect.message, android.widget.Toast.LENGTH_SHORT).show()
                }
                MyEffect.NavigateToWelcome -> {
                    val intent = android.content.Intent(context, io.legado.app.ui.welcome.WelcomeActivity::class.java)
                    intent.flags = android.content.Intent.FLAG_ACTIVITY_NEW_TASK or android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK
                    context.startActivity(intent)
                }
            }
        }
    }

    CompositionLocalProvider(LocalRippleConfiguration provides null) {
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
            ProfileHeader(
                uiState = uiState,
                onLoginClick = {
                    io.legado.app.ui.welcome.LoginActivity.start(context, io.legado.app.ui.welcome.LoginActivity.MODE_LOGIN)
                },
                onRegisterClick = {
                    io.legado.app.ui.welcome.LoginActivity.start(context, io.legado.app.ui.welcome.LoginActivity.MODE_REGISTER)
                },
                onLogoutClick = {
                    viewModel.onIntent(MyIntent.Logout)
                },
                onEditProfileClick = {
                    showEditNameDialog = true
                }
            )

            Spacer(modifier = Modifier.height(8.dp))

            SplicedColumnGroup(
                title = ""
            ) {
                WebServiceSettingBlock(
                    uiState = uiState,
                    onToggleWebService = {
                        viewModel.onIntent(MyIntent.ToggleWebService)
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
                    title = stringResource(R.string.ai_chat),
                    imageVector = Icons.Default.AutoAwesome,
                    onClick = onNavigateToChat
                )
                ClickableSettingItem(
                    title = stringResource(R.string.setting),
                    imageVector = Icons.Default.Settings,
                    onClick = onOpenSettings
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

                ClickableSettingItem(
                    title = stringResource(R.string.about),
                    imageVector = Icons.Default.Info,
                    onClick = {
                        onNavigate(PrefClickEvent.OpenAbout)
                    }
                )
                if (uiState.isLoggedIn) {
                    ClickableSettingItem(
                        title = "Đăng xuất",
                        imageVector = Icons.AutoMirrored.Filled.ExitToApp,
                        onClick = {
                            viewModel.onIntent(MyIntent.Logout)
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

    EditUserProfileDialog(
        show = showEditNameDialog,
        initialDisplayName = uiState.userDisplayName ?: uiState.userEmail?.substringBefore("@") ?: "",
        initialAvatar = uiState.userAvatar,
        isSaving = uiState.isSavingProfile,
        onDismissRequest = { showEditNameDialog = false },
        onConfirm = { newName, oldPassword, newPassword, avatarBase64 ->
            viewModel.onIntent(MyIntent.UpdateCurrentUserProfile(newName, oldPassword, newPassword, avatarBase64))
            showEditNameDialog = false
        },
        isAdmin = uiState.userEmail?.lowercase()?.trim() == "nthanhnam@gmail.com",
        onTabSelected = { index ->
            if (index == 1) {
                showEditNameDialog = false
                showVipManagement = true
            }
        }
    )

    VipManagementFullScreenDialog(
        show = showVipManagement,
        onDismissRequest = { showVipManagement = false },
        serviceRoleKey = uiState.serviceRoleKey,
        onServiceRoleKeyChange = { viewModel.onIntent(MyIntent.UpdateServiceRoleKey(it)) },
        isFetchingUsers = uiState.isFetchingUsers,
        onFetchUsers = { viewModel.onIntent(MyIntent.FetchUsers) },
        userList = uiState.userList,
        searchEmailQuery = uiState.searchEmailQuery,
        onSearchEmailQueryChange = { viewModel.onIntent(MyIntent.UpdateSearchEmailQuery(it)) },
        onUserClick = { viewModel.onIntent(MyIntent.StartEditingProfile(it)) },
        onBackToProfile = {
            showVipManagement = false
            showEditNameDialog = true
        }
    )

    EditProfileDialog(
        user = uiState.editingProfile,
        isSaving = uiState.isSavingProfile,
        vipUntilDate = uiState.vipUntilDate,
        onDismissRequest = { viewModel.onIntent(MyIntent.StopEditingProfile) },
        onSaveName = { viewModel.onIntent(MyIntent.UpdateProfileName(it)) },
        onToggleVip = { viewModel.onIntent(MyIntent.ToggleVip(it)) },
        onGrantDays = { viewModel.onIntent(MyIntent.GrantVipDays(it)) },
        onChangeExpirationDate = { viewModel.onIntent(MyIntent.ChangeVipExpirationDate(it)) }
    )

    if (showAuthDialog) {
        AuthDialog(
            mode = authDialogMode,
            isAuthenticating = uiState.isAuthenticating,
            onDismiss = { showAuthDialog = false },
            onSubmit = { email, password ->
                if (authDialogMode == MyAuthMode.LOGIN) {
                    viewModel.onIntent(MyIntent.Login(email, password))
                } else {
                    viewModel.onIntent(MyIntent.Register(email, password))
                }
            }
        )
    }
    }
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
    userList: List<SupabaseUser>,
    searchEmailQuery: String,
    onSearchEmailQueryChange: (String) -> Unit,
    onUserClick: (SupabaseUser) -> Unit
) {
    if (!show) return
    AlertDialog(
        onDismissRequest = onDismissRequest,
        title = { Text(text = "Quản lý thành viên Supabase", fontWeight = FontWeight.Bold) },
        text = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(max = 500.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                OutlinedTextField(
                    value = serviceRoleKey,
                    onValueChange = onServiceRoleKeyChange,
                    label = { Text("Supabase Service Role Key") },
                    placeholder = { Text("Nhập key service_role bí mật...") },
                    modifier = Modifier.fillMaxWidth()
                )

                Button(
                    onClick = onFetchUsers,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    if (isFetchingUsers) {
                        CircularProgressIndicator(
                            modifier = Modifier.size(18.dp),
                            color = LegadoTheme.colorScheme.onPrimary,
                            strokeWidth = 2.dp
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("Đang tải...")
                    } else {
                        Text("Tải danh sách tài khoản Supabase")
                    }
                }

                if (userList.isNotEmpty()) {
                    OutlinedTextField(
                        value = searchEmailQuery,
                        onValueChange = onSearchEmailQueryChange,
                        placeholder = { Text("Tìm theo Gmail hoặc tên...") },
                        leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth()
                    )

                    LazyColumn(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        val filteredUsers = userList.filter {
                            searchEmailQuery.isBlank() ||
                                    it.email.contains(searchEmailQuery.trim(), ignoreCase = true) ||
                                    it.displayName.contains(searchEmailQuery.trim(), ignoreCase = true)
                        }

                        if (filteredUsers.isEmpty()) {
                            item {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(16.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text("Không tìm thấy kết quả phù hợp", color = LegadoTheme.colorScheme.onSurfaceVariant)
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

                                GlassCard(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable { onUserClick(user) },
                                    cornerRadius = 12.dp
                                ) {
                                    Row(
                                        modifier = Modifier.padding(12.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .size(40.dp)
                                                .clip(CircleShape)
                                                .background(LegadoTheme.colorScheme.primary.copy(alpha = 0.1f))
                                                .border(
                                                    width = 1.dp,
                                                    color = if (isVip) Color(0xFFFFD700) else LegadoTheme.colorScheme.primary.copy(alpha = 0.2f),
                                                    shape = CircleShape
                                                ),
                                            contentAlignment = Alignment.Center
                                        ) {
                                            val initials = if (user.displayName.isNotBlank()) {
                                                user.displayName.take(2).uppercase()
                                            } else if (user.email.isNotBlank()) {
                                                user.email.take(2).uppercase()
                                            } else "U"
                                            Text(
                                                text = initials,
                                                color = LegadoTheme.colorScheme.primary,
                                                fontWeight = FontWeight.Bold,
                                                fontSize = 14.sp
                                            )
                                        }

                                        Spacer(modifier = Modifier.width(12.dp))

                                        Column(
                                            modifier = Modifier.weight(1f)
                                        ) {
                                            Row(verticalAlignment = Alignment.CenterVertically) {
                                                Text(
                                                    text = if (user.displayName.isNotBlank()) user.displayName else "Chưa đặt tên",
                                                    fontWeight = FontWeight.Bold,
                                                    fontSize = 14.sp
                                                )
                                                if (isVip) {
                                                    Spacer(modifier = Modifier.width(6.dp))
                                                    Icon(
                                                        imageVector = Icons.Default.Star,
                                                        contentDescription = "VIP",
                                                        tint = Color(0xFFFFD700),
                                                        modifier = Modifier.size(16.dp)
                                                    )
                                                }
                                            }
                                            Text(
                                                text = user.email,
                                                fontSize = 11.sp,
                                                color = LegadoTheme.colorScheme.onSurfaceVariant
                                            )
                                        }

                                        Spacer(modifier = Modifier.width(8.dp))

                                        Column(
                                            horizontalAlignment = Alignment.End
                                        ) {
                                            Text(
                                                text = vipStatusText,
                                                fontSize = 11.sp,
                                                color = if (isVip) Color(0xFFE5A900) else LegadoTheme.colorScheme.onSurfaceVariant,
                                                fontWeight = if (isVip) FontWeight.Bold else FontWeight.Normal
                                            )
                                            Spacer(modifier = Modifier.height(4.dp))
                                            Icon(
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
            TextButton(onClick = onDismissRequest) {
                Text("Đóng")
            }
        }
    )
}

@Composable
fun EditProfileDialog(
    user: SupabaseUser?,
    isSaving: Boolean,
    vipUntilDate: String,
    onDismissRequest: () -> Unit,
    onSaveName: (String) -> Unit,
    onToggleVip: (Boolean) -> Unit,
    onGrantDays: (Int) -> Unit,
    onChangeExpirationDate: (String) -> Unit
) {
    if (user == null) return
    val context = LocalContext.current
    var tempName by remember(user) { mutableStateOf(user.displayName) }
    val isVipActive = user.vipExpire > System.currentTimeMillis()

    AlertDialog(
        onDismissRequest = { if (!isSaving) onDismissRequest() },
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = null,
                    tint = LegadoTheme.colorScheme.primary,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Cấu hình thành viên",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            }
        },
        text = {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Text(
                    text = "Cấu hình cho tài khoản: ${user.email}",
                    style = LegadoTheme.typography.bodySmall,
                    color = LegadoTheme.colorScheme.onSurfaceVariant
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    OutlinedTextField(
                        value = tempName,
                        onValueChange = { tempName = it },
                        label = { Text("Tên nhân vật (Nickname)") },
                        singleLine = true,
                        modifier = Modifier.weight(1f),
                        enabled = !isSaving
                    )
                    if (tempName.trim() != user.displayName) {
                        Spacer(modifier = Modifier.width(8.dp))
                        IconButton(
                            onClick = { onSaveName(tempName.trim()) },
                            enabled = !isSaving,
                            colors = IconButtonDefaults.iconButtonColors(contentColor = LegadoTheme.colorScheme.primary)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Check,
                                contentDescription = "Lưu tên"
                            )
                        }
                    }
                }

                HorizontalDivider()

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = null,
                            tint = Color(0xFFFFD700),
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Kích hoạt VIP",
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 14.sp
                        )
                    }
                    Switch(
                        checked = isVipActive,
                        onCheckedChange = { active -> onToggleVip(active) },
                        enabled = !isSaving
                    )
                }

                if (isVipActive) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(LegadoTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f), RoundedCornerShape(8.dp))
                            .border(1.dp, LegadoTheme.colorScheme.outline.copy(alpha = 0.1f), RoundedCornerShape(8.dp))
                            .padding(12.dp),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text("Ngày hết hạn VIP:", fontSize = 13.sp)

                            val dateText = if (vipUntilDate.isNotBlank()) vipUntilDate else "Chọn ngày"
                            Text(
                                text = dateText,
                                color = LegadoTheme.colorScheme.primary,
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,
                                modifier = Modifier
                                    .clickable(enabled = !isSaving) {
                                        val calendar = Calendar.getInstance()
                                        if (vipUntilDate.isNotBlank()) {
                                            try {
                                                val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
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
                                                onChangeExpirationDate(newDateStr)
                                            },
                                            calendar.get(Calendar.YEAR),
                                            calendar.get(Calendar.MONTH),
                                            calendar.get(Calendar.DAY_OF_MONTH)
                                        ).show()
                                    }
                                    .padding(vertical = 4.dp, horizontal = 8.dp)
                            )
                        }

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            listOf("30 ngày" to 30, "90 ngày" to 90, "365 ngày" to 365).forEach { (label, days) ->
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .background(LegadoTheme.colorScheme.surface, RoundedCornerShape(6.dp))
                                        .border(1.dp, LegadoTheme.colorScheme.outline.copy(alpha = 0.15f), RoundedCornerShape(6.dp))
                                        .clickable(enabled = !isSaving) { onGrantDays(days) }
                                        .padding(vertical = 8.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = label,
                                        color = LegadoTheme.colorScheme.primary,
                                        fontSize = 11.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                            }
                        }
                    }
                }
            }
        },
        confirmButton = {
            TextButton(
                onClick = onDismissRequest,
                enabled = !isSaving
            ) {
                Text("Đóng")
            }
        }
    )
}

@Composable
private fun VipBadge(
    modifier: Modifier = Modifier,
    days: Long,
    email: String? = null
) {
    val isLaoTo = (email?.lowercase()?.trim() == "nthanhnam@gmail.com") || (days > 200)
    val rankText = if (isLaoTo) "Lão Tổ" else "Trưởng Lão"

    Box(
        modifier = modifier
            .background(
                brush = androidx.compose.ui.graphics.Brush.horizontalGradient(
                    colors = listOf(Color(0xFFD4AF37), Color(0xFFF3E5AB))
                ),
                shape = RoundedCornerShape(4.dp)
            )
            .border(
                width = 0.5.dp,
                color = Color(0xFFAA7C11),
                shape = RoundedCornerShape(4.dp)
            )
            .padding(horizontal = 6.dp, vertical = 2.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "$rankText $days ngày",
            color = Color(0xFF5C3A00),
            fontSize = 10.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.02.sp
        )
    }
}

@Composable
private fun rememberBitmapFromBase64(base64Str: String?): androidx.compose.ui.graphics.ImageBitmap? {
    if (base64Str.isNullOrBlank()) return null
    return remember(base64Str) {
        try {
            val decodedBytes = android.util.Base64.decode(base64Str, android.util.Base64.DEFAULT)
            val bitmap = android.graphics.BitmapFactory.decodeByteArray(decodedBytes, 0, decodedBytes.size)
            bitmap?.asImageBitmap()
        } catch (e: Exception) {
            null
        }
    }
}

private enum class MyAuthMode {
    LOGIN, REGISTER
}

@Composable
private fun ProfileHeader(
    uiState: MyUiState,
    onLoginClick: () -> Unit,
    onRegisterClick: () -> Unit,
    onLogoutClick: () -> Unit,
    onEditProfileClick: () -> Unit
) {
    if (!uiState.isLoggedIn) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            androidx.compose.foundation.Image(
                painter = painterResource(id = R.drawable.ic_launcher3),
                contentDescription = null,
                modifier = Modifier
                    .size(96.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Button(
                    onClick = onLoginClick,
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(12.dp),
                    colors = androidx.compose.material3.ButtonDefaults.buttonColors(
                        containerColor = LegadoTheme.colorScheme.primary,
                        contentColor = LegadoTheme.colorScheme.onPrimary
                    )
                ) {
                    Text("Đăng nhập", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                }

                Button(
                    onClick = onRegisterClick,
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(12.dp),
                    colors = androidx.compose.material3.ButtonDefaults.buttonColors(
                        containerColor = LegadoTheme.colorScheme.primary.copy(alpha = 0.15f),
                        contentColor = LegadoTheme.colorScheme.primary
                    )
                ) {
                    Text("Đăng ký", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                }
            }
        }
    } else {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val customAvatar = rememberBitmapFromBase64(uiState.userAvatar)
            Box(
                modifier = Modifier
                    .size(96.dp)
                    .clip(CircleShape)
                    .background(LegadoTheme.colorScheme.primary.copy(alpha = 0.1f))
                    .border(
                        width = 1.5.dp,
                        color = if (uiState.isVip) Color(0xFFFFD700) else Color.Transparent,
                        shape = CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {
                if (customAvatar != null) {
                    androidx.compose.foundation.Image(
                        bitmap = customAvatar,
                        contentDescription = "Ảnh đại diện",
                        contentScale = androidx.compose.ui.layout.ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                } else {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = null,
                        tint = LegadoTheme.colorScheme.primary,
                        modifier = Modifier.size(48.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            val displayName = uiState.userDisplayName?.takeIf { it.isNotBlank() } ?: uiState.userEmail?.substringBefore("@") ?: "Tài khoản"
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = displayName,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = LegadoTheme.colorScheme.onSurface
                )
                if (uiState.isVip) {
                    VipBadge(days = uiState.vipExpireDays, email = uiState.userEmail)
                }
            }

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = uiState.userEmail ?: "",
                fontSize = 13.sp,
                color = LegadoTheme.colorScheme.onSurfaceVariant
            )

            Spacer(modifier = Modifier.height(12.dp))

            OutlinedButton(
                onClick = onEditProfileClick,
                shape = RoundedCornerShape(16.dp),
                border = androidx.compose.foundation.BorderStroke(1.dp, LegadoTheme.colorScheme.outline.copy(alpha = 0.5f)),
                colors = androidx.compose.material3.ButtonDefaults.outlinedButtonColors(
                    contentColor = LegadoTheme.colorScheme.onSurface
                ),
                contentPadding = androidx.compose.foundation.layout.PaddingValues(horizontal = 16.dp, vertical = 4.dp),
                modifier = Modifier.height(32.dp)
            ) {
                Text(
                    text = "Chỉnh sửa hồ sơ",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun AuthDialog(
    mode: MyAuthMode,
    isAuthenticating: Boolean,
    onDismiss: () -> Unit,
    onSubmit: (String, String) -> Unit
) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var emailError by remember { mutableStateOf<String?>(null) }
    var passwordError by remember { mutableStateOf<String?>(null) }

    AlertDialog(
        onDismissRequest = { if (!isAuthenticating) onDismiss() },
        title = {
            Text(
                text = if (mode == MyAuthMode.LOGIN) "Đăng nhập" else "Đăng ký",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = LegadoTheme.colorScheme.onSurface
            )
        },
        text = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                OutlinedTextField(
                    value = email,
                    onValueChange = {
                        email = it
                        emailError = null
                    },
                    label = { Text("Email") },
                    placeholder = { Text("example@gmail.com") },
                    singleLine = true,
                    isError = emailError != null,
                    supportingText = emailError?.let { { Text(it) } },
                    enabled = !isAuthenticating,
                    modifier = Modifier.fillMaxWidth()
                )

                OutlinedTextField(
                    value = password,
                    onValueChange = {
                        password = it
                        passwordError = null
                    },
                    label = { Text("Mật khẩu") },
                    singleLine = true,
                    visualTransformation = PasswordVisualTransformation(),
                    isError = passwordError != null,
                    supportingText = passwordError?.let { { Text(it) } },
                    enabled = !isAuthenticating,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        },
        confirmButton = {
            TextButton(
                enabled = !isAuthenticating,
                onClick = {
                    var hasError = false
                    if (email.isBlank()) {
                        emailError = "Vui lòng nhập email"
                        hasError = true
                    }
                    if (password.length < 6) {
                        passwordError = "Mật khẩu phải từ 6 ký tự"
                        hasError = true
                    }
                    if (!hasError) {
                        onSubmit(email.trim(), password)
                    }
                }
            ) {
                if (isAuthenticating) {
                    CircularProgressIndicator(
                        modifier = Modifier.size(24.dp),
                        strokeWidth = 2.dp,
                        color = LegadoTheme.colorScheme.primary
                    )
                } else {
                    Text(if (mode == MyAuthMode.LOGIN) "Đăng nhập" else "Đăng ký")
                }
            }
        },
        dismissButton = {
            TextButton(
                enabled = !isAuthenticating,
                onClick = onDismiss
            ) {
                Text("Hủy")
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun EditUserProfileDialog(
    show: Boolean,
    initialDisplayName: String,
    initialAvatar: String?,
    isSaving: Boolean,
    onDismissRequest: () -> Unit,
    onConfirm: (displayName: String, oldPassword: String?, newPassword: String?, avatarBase64: String?) -> Unit,
    isAdmin: Boolean = false,
    onTabSelected: (Int) -> Unit = {}
) {
    if (!show) return
    val context = LocalContext.current
    var displayName by remember(initialDisplayName) { mutableStateOf(initialDisplayName) }
    var avatarBase64 by remember(show) { mutableStateOf(initialAvatar) }
    var isChangingPassword by remember { mutableStateOf(false) }
    var oldPassword by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    
    var displayNameError by remember { mutableStateOf<String?>(null) }
    var oldPasswordError by remember { mutableStateOf<String?>(null) }
    var passwordError by remember { mutableStateOf<String?>(null) }
    var confirmPasswordError by remember { mutableStateOf<String?>(null) }

    val imagePickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri ->
        uri?.let {
            val base64 = MemberManager.compressUriToBase64(context, it)
            if (base64 != null) {
                avatarBase64 = base64
            }
        }
    }

    AlertDialog(
        onDismissRequest = { if (!isSaving) onDismissRequest() },
        properties = androidx.compose.ui.window.DialogProperties(
            usePlatformDefaultWidth = true
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp),
        title = {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "Chỉnh sửa hồ sơ",
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    color = LegadoTheme.colorScheme.onSurface
                )
                if (isAdmin) {
                    Spacer(modifier = Modifier.height(12.dp))
                    TabRow(selectedTabIndex = 0) {
                        Tab(
                            selected = true,
                            onClick = { onTabSelected(0) },
                            text = { Text("Hồ sơ") }
                        )
                        Tab(
                            selected = false,
                            onClick = { onTabSelected(1) },
                            text = { Text("Quản lý VIP") }
                        )
                    }
                } else {
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "Cập nhật biệt danh hoặc thay đổi mật khẩu",
                        fontSize = 12.sp,
                        color = LegadoTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        },
        text = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    val bitmap = rememberBitmapFromBase64(avatarBase64)
                    Box(
                        modifier = Modifier
                            .size(90.dp)
                            .clip(CircleShape)
                            .background(LegadoTheme.colorScheme.primary.copy(alpha = 0.1f))
                            .clickable(enabled = !isSaving) {
                                imagePickerLauncher.launch("image/*")
                            }
                            .border(
                                width = 1.dp,
                                color = LegadoTheme.colorScheme.primary.copy(alpha = 0.3f),
                                shape = CircleShape
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        if (bitmap != null) {
                            androidx.compose.foundation.Image(
                                bitmap = bitmap,
                                contentDescription = "Chọn ảnh đại diện",
                                contentScale = androidx.compose.ui.layout.ContentScale.Crop,
                                modifier = Modifier.fillMaxSize()
                            )
                        } else {
                            Icon(
                                imageVector = Icons.Default.Person,
                                contentDescription = null,
                                tint = LegadoTheme.colorScheme.primary,
                                modifier = Modifier.size(40.dp)
                            )
                        }
                        
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(26.dp)
                                .align(Alignment.BottomCenter)
                                .background(Color.Black.copy(alpha = 0.5f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "ĐỔI",
                                color = Color.White,
                                fontSize = 9.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(4.dp))

                OutlinedTextField(
                    value = displayName,
                    onValueChange = {
                        displayName = it
                        displayNameError = null
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = null,
                            tint = LegadoTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.7f)
                        )
                    },
                    label = { Text("Biệt danh (Nickname)") },
                    singleLine = true,
                    isError = displayNameError != null,
                    supportingText = displayNameError?.let { { Text(it) } },
                    enabled = !isSaving,
                    modifier = Modifier.fillMaxWidth()
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable(enabled = !isSaving) { isChangingPassword = !isChangingPassword }
                        .padding(vertical = 4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    androidx.compose.material3.Checkbox(
                        checked = isChangingPassword,
                        onCheckedChange = { isChangingPassword = it },
                        enabled = !isSaving
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "Đổi mật khẩu tài khoản",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = LegadoTheme.colorScheme.onSurface
                    )
                }

                AnimatedVisibility(
                    visible = isChangingPassword,
                    enter = androidx.compose.animation.expandVertically(),
                    exit = androidx.compose.animation.shrinkVertically()
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        OutlinedTextField(
                            value = oldPassword,
                            onValueChange = {
                                oldPassword = it
                                oldPasswordError = null
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Lock,
                                    contentDescription = null,
                                    tint = LegadoTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.7f)
                                )
                            },
                            label = { Text("Mật khẩu hiện tại (Cũ)") },
                            singleLine = true,
                            visualTransformation = PasswordVisualTransformation(),
                            isError = oldPasswordError != null,
                            supportingText = oldPasswordError?.let { { Text(it) } },
                            enabled = !isSaving,
                            modifier = Modifier.fillMaxWidth()
                        )

                        OutlinedTextField(
                            value = password,
                            onValueChange = {
                                password = it
                                passwordError = null
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Lock,
                                    contentDescription = null,
                                    tint = LegadoTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.7f)
                                )
                            },
                            label = { Text("Mật khẩu mới") },
                            singleLine = true,
                            visualTransformation = PasswordVisualTransformation(),
                            isError = passwordError != null,
                            supportingText = passwordError?.let { { Text(it) } },
                            enabled = !isSaving,
                            modifier = Modifier.fillMaxWidth()
                        )

                        OutlinedTextField(
                            value = confirmPassword,
                            onValueChange = {
                                confirmPassword = it
                                confirmPasswordError = null
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Lock,
                                    contentDescription = null,
                                    tint = LegadoTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.7f)
                                )
                            },
                            label = { Text("Xác nhận mật khẩu mới") },
                            singleLine = true,
                            visualTransformation = PasswordVisualTransformation(),
                            isError = confirmPasswordError != null,
                            supportingText = confirmPasswordError?.let { { Text(it) } },
                            enabled = !isSaving,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }
            }
        },
        confirmButton = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                TextButton(
                    enabled = !isSaving,
                    onClick = onDismissRequest
                ) {
                    Text("Hủy")
                }

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.size(56.dp)
                ) {
                    if (isSaving) {
                        CircularProgressIndicator(
                            modifier = Modifier.size(24.dp),
                            strokeWidth = 2.dp,
                            color = LegadoTheme.colorScheme.primary
                        )
                    } else {
                        androidx.compose.material3.FilledIconButton(
                            onClick = {
                                var hasError = false
                                if (displayName.isBlank()) {
                                    displayNameError = "Vui lòng nhập tên hiển thị"
                                    hasError = true
                                }
                                if (isChangingPassword) {
                                    if (oldPassword.isBlank()) {
                                        oldPasswordError = "Vui lòng nhập mật khẩu cũ"
                                        hasError = true
                                    }
                                    if (password.length < 6) {
                                        passwordError = "Mật khẩu mới phải từ 6 ký tự"
                                        hasError = true
                                    }
                                    if (password != confirmPassword) {
                                        confirmPasswordError = "Mật khẩu xác nhận không khớp"
                                        hasError = true
                                    }
                                }
                                if (!hasError) {
                                    onConfirm(
                                        displayName.trim(),
                                        oldPassword.takeIf { isChangingPassword },
                                        password.takeIf { isChangingPassword },
                                        avatarBase64
                                    )
                                }
                            },
                            modifier = Modifier.size(56.dp),
                            colors = androidx.compose.material3.IconButtonDefaults.filledIconButtonColors(
                                containerColor = LegadoTheme.colorScheme.primary,
                                contentColor = LegadoTheme.colorScheme.onPrimary
                            )
                        ) {
                            Icon(
                                imageVector = Icons.Default.Check,
                                contentDescription = "Lưu thay đổi",
                                modifier = Modifier.size(24.dp)
                            )
                        }
                    }
                }
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun VipManagementFullScreenDialog(
    show: Boolean,
    onDismissRequest: () -> Unit,
    serviceRoleKey: String,
    onServiceRoleKeyChange: (String) -> Unit,
    isFetchingUsers: Boolean,
    onFetchUsers: () -> Unit,
    userList: List<SupabaseUser>,
    searchEmailQuery: String,
    onSearchEmailQueryChange: (String) -> Unit,
    onUserClick: (SupabaseUser) -> Unit,
    onBackToProfile: () -> Unit
) {
    if (!show) return
    var showKeyInput by remember { mutableStateOf(serviceRoleKey.isBlank() || userList.isEmpty()) }

    Dialog(
        onDismissRequest = onDismissRequest,
        properties = DialogProperties(
            usePlatformDefaultWidth = false
        )
    ) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = LegadoTheme.colorScheme.background
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(WindowInsets.safeDrawing.asPaddingValues())
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = onBackToProfile) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Quay lại"
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Quản lý thành viên VIP",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = LegadoTheme.colorScheme.onBackground,
                        modifier = Modifier.weight(1f)
                    )
                    
                    if (userList.isNotEmpty()) {
                        TextButton(onClick = { showKeyInput = !showKeyInput }) {
                            Text(if (showKeyInput) "Ẩn cấu hình" else "Đổi Key")
                        }
                    }
                }

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(horizontal = 16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    if (showKeyInput) {
                        OutlinedTextField(
                            value = serviceRoleKey,
                            onValueChange = onServiceRoleKeyChange,
                            label = { Text("Supabase Service Role Key") },
                            placeholder = { Text("Nhập key service_role bí mật...") },
                            modifier = Modifier.fillMaxWidth()
                        )

                        Button(
                            onClick = onFetchUsers,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            if (isFetchingUsers) {
                                CircularProgressIndicator(
                                    modifier = Modifier.size(18.dp),
                                    color = LegadoTheme.colorScheme.onPrimary,
                                    strokeWidth = 2.dp
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text("Đang tải...")
                            } else {
                                Text("Tải danh sách tài khoản Supabase")
                            }
                        }
                    }

                    LaunchedEffect(userList.isNotEmpty(), isFetchingUsers) {
                        if (userList.isNotEmpty() && !isFetchingUsers) {
                            showKeyInput = false
                        }
                    }

                    if (userList.isNotEmpty()) {
                        OutlinedTextField(
                            value = searchEmailQuery,
                            onValueChange = onSearchEmailQueryChange,
                            placeholder = { Text("Tìm theo Gmail hoặc tên...") },
                            leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
                            singleLine = true,
                            modifier = Modifier.fillMaxWidth()
                        )

                        LazyColumn(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f),
                            verticalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            val filteredUsers = userList.filter {
                                searchEmailQuery.isBlank() ||
                                        it.email.contains(searchEmailQuery.trim(), ignoreCase = true) ||
                                        it.displayName.contains(searchEmailQuery.trim(), ignoreCase = true)
                            }

                            if (filteredUsers.isEmpty()) {
                                item {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(32.dp),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Text("Không tìm thấy kết quả phù hợp", color = LegadoTheme.colorScheme.onSurfaceVariant)
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

                                    GlassCard(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .clickable { onUserClick(user) },
                                        cornerRadius = 14.dp
                                    ) {
                                        Row(
                                            modifier = Modifier.padding(16.dp),
                                            verticalAlignment = Alignment.CenterVertically
                                        ) {
                                            Box(
                                                modifier = Modifier
                                                    .size(44.dp)
                                                    .clip(CircleShape)
                                                    .background(LegadoTheme.colorScheme.primary.copy(alpha = 0.1f))
                                                    .border(
                                                        width = 1.dp,
                                                        color = if (isVip) Color(0xFFFFD700) else LegadoTheme.colorScheme.primary.copy(alpha = 0.2f),
                                                        shape = CircleShape
                                                    ),
                                                contentAlignment = Alignment.Center
                                            ) {
                                                val initials = if (user.displayName.isNotBlank()) {
                                                    user.displayName.take(2).uppercase()
                                                } else if (user.email.isNotBlank()) {
                                                    user.email.take(2).uppercase()
                                                } else "U"
                                                Text(
                                                    text = initials,
                                                    color = LegadoTheme.colorScheme.primary,
                                                    fontWeight = FontWeight.Bold,
                                                    fontSize = 15.sp
                                                )
                                            }

                                            Spacer(modifier = Modifier.width(14.dp))

                                            Column(
                                                modifier = Modifier.weight(1f)
                                            ) {
                                                Row(verticalAlignment = Alignment.CenterVertically) {
                                                    Text(
                                                        text = if (user.displayName.isNotBlank()) user.displayName else "Chưa đặt tên",
                                                        fontWeight = FontWeight.Bold,
                                                        fontSize = 15.sp,
                                                        color = LegadoTheme.colorScheme.onSurface
                                                    )
                                                    if (isVip) {
                                                        Spacer(modifier = Modifier.width(8.dp))
                                                        val diff = user.vipExpire - System.currentTimeMillis()
                                                        val days = (diff / (1000 * 60 * 60 * 24)).coerceAtLeast(0) + 1
                                                        VipBadge(days = days, email = user.email)
                                                    }
                                                }
                                                Text(
                                                    text = user.email,
                                                    fontSize = 12.sp,
                                                    color = LegadoTheme.colorScheme.onSurfaceVariant
                                                )
                                            }

                                            Spacer(modifier = Modifier.width(8.dp))

                                            Column(
                                                horizontalAlignment = Alignment.End
                                            ) {
                                                if (!isVip) {
                                                    Text(
                                                        text = "Thành viên",
                                                        fontSize = 12.sp,
                                                        color = LegadoTheme.colorScheme.onSurfaceVariant
                                                    )
                                                }
                                                Spacer(modifier = Modifier.height(4.dp))
                                                Icon(
                                                    imageVector = Icons.Default.Edit,
                                                    contentDescription = "Sửa",
                                                    tint = LegadoTheme.colorScheme.onSurfaceVariant,
                                                    modifier = Modifier.size(18.dp)
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
        }
    }
}
