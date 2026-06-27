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
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
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
    var showMemberDialog by androidx.compose.runtime.remember { androidx.compose.runtime.mutableStateOf(false) }

    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    val scrollBehavior = GlassTopAppBarDefaults.defaultScrollBehavior()

    AppScaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        contentWindowInsets = WindowInsets.systemBars
            .only(WindowInsetsSides.Horizontal + WindowInsetsSides.Top),
        topBar = {
            GlassMediumFlexibleTopAppBar(
                title = stringResource(R.string.my),
                actions = {
                    TopBarActionButton(
                        onClick = {
                            onNavigate(
                                PrefClickEvent.ShowMd(
                                    title = "",
                                    path = "appHelp"
                                )
                            )
                        },
                        imageVector = Icons.AutoMirrored.Filled.HelpOutline,
                        contentDescription = null
                    )
                },
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
                            showMemberDialog = true
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

    if (showMemberDialog) {
        var activationKeyInput by androidx.compose.runtime.remember { androidx.compose.runtime.mutableStateOf("") }
        val showAdminPanel = activationKeyInput.trim() == "novela@admin" || io.legado.app.help.config.LocalConfig.userEmail?.lowercase()?.trim() == "nthanhnam@gmail.com"
        var targetDeviceId by androidx.compose.runtime.remember { androidx.compose.runtime.mutableStateOf("") }
        var targetVipDays by androidx.compose.runtime.remember { androidx.compose.runtime.mutableStateOf("30") }
        var generatedKey by androidx.compose.runtime.remember { androidx.compose.runtime.mutableStateOf("") }

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
        val scope = androidx.compose.runtime.rememberCoroutineScope()

        androidx.compose.material3.AlertDialog(
            onDismissRequest = { showMemberDialog = false },
            title = { androidx.compose.material3.Text(text = "Kích hoạt Thành viên nội bộ", fontWeight = androidx.compose.ui.text.font.FontWeight.Bold) },
            text = {
                androidx.compose.foundation.lazy.LazyColumn(
                    modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
                    verticalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(12.dp)
                ) {
                    item {
                        androidx.compose.material3.Text(
                            text = "Trạng thái: " + if (io.legado.app.help.MemberManager.isVip) {
                                "Đang hoạt động (Hạn dùng: ${io.legado.app.help.MemberManager.expireDateString})"
                            } else {
                                "Tài khoản thường (Bản dùng thử)"
                            },
                            style = androidx.compose.material3.MaterialTheme.typography.bodyMedium
                        )
                    }
                    item {
                        val deviceId = io.legado.app.constant.AppConst.androidId
                        androidx.compose.material3.OutlinedTextField(
                            value = deviceId,
                            onValueChange = {},
                            readOnly = true,
                            label = { androidx.compose.material3.Text("Mã Thiết Bị (Device ID)") },
                            trailingIcon = {
                                androidx.compose.material3.IconButton(onClick = {
                                    val clipboard = context.getSystemService(android.content.Context.CLIPBOARD_SERVICE) as android.content.ClipboardManager
                                    val clip = android.content.ClipData.newPlainText("Device ID", deviceId)
                                    clipboard.setPrimaryClip(clip)
                                    android.widget.Toast.makeText(context, "Đã sao chép Mã Thiết Bị!", android.widget.Toast.LENGTH_SHORT).show()
                                }) {
                                    androidx.compose.material3.Icon(
                                        imageVector = androidx.compose.material.icons.Icons.Default.ContentCopy,
                                        contentDescription = "Sao chép"
                                    )
                                }
                            },
                            modifier = androidx.compose.ui.Modifier.fillMaxWidth()
                        )
                    }
                    item {
                        androidx.compose.material3.OutlinedTextField(
                            value = activationKeyInput,
                            onValueChange = { activationKeyInput = it },
                            label = { androidx.compose.material3.Text("Mã Kích Hoạt / Mật khẩu Admin") },
                            placeholder = { androidx.compose.material3.Text("Dán mã kích hoạt tại đây...") },
                            modifier = androidx.compose.ui.Modifier.fillMaxWidth()
                        )
                    }

                    if (showAdminPanel) {
                        item {
                            androidx.compose.material3.HorizontalDivider(modifier = androidx.compose.ui.Modifier.padding(vertical = 8.dp))
                            androidx.compose.material3.Text(
                                text = "🛠️ BẢNG ĐIỀU KHIỂN ADMIN",
                                style = androidx.compose.material3.MaterialTheme.typography.titleSmall,
                                color = androidx.compose.material3.MaterialTheme.colorScheme.primary,
                                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
                            )
                        }
                        item {
                            androidx.compose.material3.OutlinedTextField(
                                value = targetDeviceId,
                                onValueChange = { targetDeviceId = it },
                                label = { androidx.compose.material3.Text("Device ID Khách Hàng") },
                                placeholder = { androidx.compose.material3.Text("Nhập Android ID của máy khách...") },
                                modifier = androidx.compose.ui.Modifier.fillMaxWidth()
                            )
                        }
                        item {
                            androidx.compose.material3.OutlinedTextField(
                                value = targetVipDays,
                                onValueChange = { targetVipDays = it },
                                label = { androidx.compose.material3.Text("Số ngày cấp VIP") },
                                placeholder = { androidx.compose.material3.Text("Ví dụ: 30, 90, 365...") },
                                modifier = androidx.compose.ui.Modifier.fillMaxWidth()
                            )
                        }
                        item {
                            androidx.compose.material3.Button(
                                onClick = {
                                    val days = targetVipDays.toIntOrNull() ?: 30
                                    if (targetDeviceId.isBlank()) {
                                        android.widget.Toast.makeText(context, "Vui lòng nhập Device ID khách hàng!", android.widget.Toast.LENGTH_SHORT).show()
                                    } else {
                                        generatedKey = io.legado.app.help.MemberManager.generateKey(targetDeviceId.trim(), days)
                                        android.widget.Toast.makeText(context, "Đã tạo mã kích hoạt thành công!", android.widget.Toast.LENGTH_SHORT).show()
                                    }
                                },
                                modifier = androidx.compose.ui.Modifier.fillMaxWidth()
                            ) {
                                androidx.compose.material3.Text("Tạo Mã Kích Hoạt")
                            }
                        }
                        if (generatedKey.isNotEmpty()) {
                            item {
                                androidx.compose.material3.OutlinedTextField(
                                    value = generatedKey,
                                    onValueChange = {},
                                    readOnly = true,
                                    label = { androidx.compose.material3.Text("Mã Kích Hoạt Đã Tạo") },
                                    trailingIcon = {
                                        androidx.compose.material3.IconButton(onClick = {
                                            val clipboard = context.getSystemService(android.content.Context.CLIPBOARD_SERVICE) as android.content.ClipboardManager
                                            val clip = android.content.ClipData.newPlainText("Activation Key", generatedKey)
                                            clipboard.setPrimaryClip(clip)
                                            android.widget.Toast.makeText(context, "Đã sao chép mã kích hoạt!", android.widget.Toast.LENGTH_SHORT).show()
                                        }) {
                                            androidx.compose.material3.Icon(
                                                imageVector = androidx.compose.material.icons.Icons.Default.ContentCopy,
                                                contentDescription = "Sao chép"
                                            )
                                        }
                                    },
                                    modifier = androidx.compose.ui.Modifier.fillMaxWidth()
                                )
                            }
                        }

                        item {
                            androidx.compose.material3.HorizontalDivider(modifier = androidx.compose.ui.Modifier.padding(vertical = 8.dp))
                            androidx.compose.material3.Text(
                                text = "👥 QUẢN LÝ TÀI KHOẢN NGƯỜI DÙNG",
                                style = androidx.compose.material3.MaterialTheme.typography.titleSmall,
                                color = androidx.compose.material3.MaterialTheme.colorScheme.primary,
                                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
                            )
                        }

                        item {
                            androidx.compose.material3.OutlinedTextField(
                                value = serviceRoleKey,
                                onValueChange = {
                                    serviceRoleKey = it
                                    io.legado.app.help.config.LocalConfig.supabaseServiceRoleKey = it
                                },
                                label = { androidx.compose.material3.Text("Supabase Service Role Key") },
                                placeholder = { androidx.compose.material3.Text("Nhập key service_role bí mật...") },
                                modifier = androidx.compose.ui.Modifier.fillMaxWidth()
                            )
                        }

                        item {
                            androidx.compose.material3.Button(
                                onClick = {
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
                                modifier = androidx.compose.ui.Modifier.fillMaxWidth()
                            ) {
                                if (isFetchingUsers) {
                                    androidx.compose.material3.CircularProgressIndicator(
                                        modifier = androidx.compose.ui.Modifier.size(18.dp),
                                        color = androidx.compose.material3.MaterialTheme.colorScheme.onPrimary,
                                        strokeWidth = 2.dp
                                    )
                                    androidx.compose.foundation.layout.Spacer(modifier = androidx.compose.ui.Modifier.width(8.dp))
                                    androidx.compose.material3.Text("Đang tải...")
                                } else {
                                    androidx.compose.material3.Text("Tải danh sách tài khoản Supabase")
                                }
                            }
                        }

                        if (userList.isNotEmpty()) {
                            item {
                                androidx.compose.material3.OutlinedTextField(
                                    value = searchEmailQuery,
                                    onValueChange = { searchEmailQuery = it },
                                    label = { androidx.compose.material3.Text("Tìm kiếm Gmail tài khoản") },
                                    placeholder = { androidx.compose.material3.Text("Nhập email cần tìm...") },
                                    modifier = androidx.compose.ui.Modifier.fillMaxWidth()
                                )
                            }

                            val filteredUsers = userList.filter {
                                searchEmailQuery.isBlank() || it.email.contains(searchEmailQuery.trim(), ignoreCase = true)
                            }

                            filteredUsers.forEach { user ->
                                item(key = user.id) {
                                    io.legado.app.ui.widget.components.card.GlassCard(
                                        modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
                                        cornerRadius = 8.dp
                                    ) {
                                        androidx.compose.foundation.layout.Column(
                                            modifier = androidx.compose.ui.Modifier.padding(12.dp)
                                        ) {
                                            androidx.compose.material3.Text(
                                                text = user.email,
                                                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                                                style = androidx.compose.material3.MaterialTheme.typography.bodyMedium
                                            )

                                            val expireText = if (user.vipExpire > System.currentTimeMillis()) {
                                                val sdf = java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.getDefault())
                                                "VIP hết hạn: " + sdf.format(java.util.Date(user.vipExpire))
                                            } else {
                                                "Tài khoản thường"
                                            }

                                            androidx.compose.material3.Text(
                                                text = expireText,
                                                style = androidx.compose.material3.MaterialTheme.typography.bodySmall,
                                                color = if (user.vipExpire > System.currentTimeMillis()) androidx.compose.material3.MaterialTheme.colorScheme.primary else androidx.compose.material3.MaterialTheme.colorScheme.onSurfaceVariant
                                            )

                                            androidx.compose.foundation.layout.Spacer(modifier = androidx.compose.ui.Modifier.height(8.dp))

                                            androidx.compose.foundation.layout.Row(
                                                horizontalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(8.dp),
                                                modifier = androidx.compose.ui.Modifier.fillMaxWidth()
                                            ) {
                                                listOf(30, 90, 365).forEach { days ->
                                                    androidx.compose.material3.Button(
                                                        onClick = {
                                                            scope.launch(kotlinx.coroutines.Dispatchers.IO) {
                                                                val newExpire = System.currentTimeMillis() + days.toLong() * 24 * 60 * 60 * 1000
                                                                val result = io.legado.app.help.MemberManager.updateUserVipExpire(serviceRoleKey.trim(), user.id, newExpire)
                                                                kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.Main) {
                                                                    result.fold(
                                                                        onSuccess = {
                                                                            android.widget.Toast.makeText(context, "Cấp VIP ${days} ngày thành công!", android.widget.Toast.LENGTH_SHORT).show()
                                                                            // Reload
                                                                            scope.launch(kotlinx.coroutines.Dispatchers.IO) {
                                                                                val refresh = io.legado.app.help.MemberManager.fetchSupabaseUsers(serviceRoleKey.trim())
                                                                                if (refresh.isSuccess) {
                                                                                    userList = refresh.getOrThrow()
                                                                                }
                                                                            }
                                                                        },
                                                                        onFailure = {
                                                                            android.widget.Toast.makeText(context, "Lỗi: ${it.localizedMessage}", android.widget.Toast.LENGTH_SHORT).show()
                                                                        }
                                                                    )
                                                                }
                                                            }
                                                        },
                                                        contentPadding = androidx.compose.foundation.layout.PaddingValues(horizontal = 8.dp, vertical = 4.dp),
                                                        modifier = androidx.compose.ui.Modifier.weight(1f)
                                                    ) {
                                                        androidx.compose.material3.Text("+${days}d", fontSize = 10.sp)
                                                    }
                                                }

                                                androidx.compose.material3.Button(
                                                    onClick = {
                                                        scope.launch(kotlinx.coroutines.Dispatchers.IO) {
                                                            val result = io.legado.app.help.MemberManager.updateUserVipExpire(serviceRoleKey.trim(), user.id, 0L)
                                                            kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.Main) {
                                                                result.fold(
                                                                    onSuccess = {
                                                                        android.widget.Toast.makeText(context, "Khóa VIP thành công!", android.widget.Toast.LENGTH_SHORT).show()
                                                                        // Reload
                                                                        scope.launch(kotlinx.coroutines.Dispatchers.IO) {
                                                                            val refresh = io.legado.app.help.MemberManager.fetchSupabaseUsers(serviceRoleKey.trim())
                                                                            if (refresh.isSuccess) {
                                                                                userList = refresh.getOrThrow()
                                                                            }
                                                                        }
                                                                    },
                                                                    onFailure = {
                                                                        android.widget.Toast.makeText(context, "Lỗi: ${it.localizedMessage}", android.widget.Toast.LENGTH_SHORT).show()
                                                                    }
                                                                )
                                                            }
                                                        }
                                                    },
                                                    colors = androidx.compose.material3.ButtonDefaults.buttonColors(
                                                        containerColor = androidx.compose.material3.MaterialTheme.colorScheme.errorContainer,
                                                        contentColor = androidx.compose.material3.MaterialTheme.colorScheme.onErrorContainer
                                                    ),
                                                    contentPadding = androidx.compose.foundation.layout.PaddingValues(horizontal = 8.dp, vertical = 4.dp),
                                                    modifier = androidx.compose.ui.Modifier.weight(1f)
                                                ) {
                                                    androidx.compose.material3.Text("Khóa", fontSize = 10.sp)
                                                }
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
                if (!showAdminPanel) {
                    androidx.compose.material3.Button(onClick = {
                        if (activationKeyInput.isBlank()) {
                            android.widget.Toast.makeText(context, "Vui lòng nhập mã kích hoạt!", android.widget.Toast.LENGTH_SHORT).show()
                        } else {
                            val success = io.legado.app.help.MemberManager.activate(activationKeyInput.trim())
                            if (success) {
                                android.widget.Toast.makeText(context, "Kích hoạt Thành viên nội bộ thành công!", android.widget.Toast.LENGTH_LONG).show()
                                showMemberDialog = false
                            } else {
                                android.widget.Toast.makeText(context, "Mã kích hoạt không hợp lệ hoặc đã hết hạn!", android.widget.Toast.LENGTH_SHORT).show()
                            }
                        }
                    }) {
                        androidx.compose.material3.Text("Kích hoạt")
                    }
                }
            },
            dismissButton = {
                androidx.compose.material3.TextButton(onClick = { showMemberDialog = false }) {
                    androidx.compose.material3.Text("Hủy")
                }
            }
        )
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

