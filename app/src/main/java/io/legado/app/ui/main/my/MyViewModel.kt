package io.legado.app.ui.main.my

import android.app.Application
import androidx.lifecycle.viewModelScope
import io.legado.app.base.BaseViewModel
import io.legado.app.constant.EventBus
import io.legado.app.help.MemberManager
import io.legado.app.help.SupabaseUser
import io.legado.app.help.config.LocalConfig
import io.legado.app.service.WebService
import io.legado.app.utils.eventBus.FlowEventBus
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toImmutableList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

class MyViewModel(
    application: Application
) : BaseViewModel(application) {

    private val _uiState = MutableStateFlow(
        MyUiState(
            isWebServiceRun = WebService.isRun,
            webServiceAddress = WebService.hostAddress,
            isLoggedIn = LocalConfig.isLoggedIn,
            userEmail = LocalConfig.userEmail,
            userDisplayName = LocalConfig.userDisplayName,
            isVip = MemberManager.isVip,
            vipExpireDays = MemberManager.daysRemaining,
            serviceRoleKey = LocalConfig.supabaseServiceRoleKey ?: ""
        )
    )
    val uiState: StateFlow<MyUiState> = _uiState.asStateFlow()

    private val _effects = MutableSharedFlow<MyEffect>(extraBufferCapacity = 16)
    val effects = _effects.asSharedFlow()

    init {
        viewModelScope.launch {
            FlowEventBus.with<String>(EventBus.WEB_SERVICE)
                .collect { address ->
                    _uiState.update { state ->
                        state.copy(
                            isWebServiceRun = address.isNotEmpty(),
                            webServiceAddress = address
                        )
                    }
                }
        }
    }

    fun onIntent(intent: MyIntent) {
        when (intent) {
            MyIntent.ToggleWebService -> {
                val currentIsRun = _uiState.value.isWebServiceRun
                if (!currentIsRun) {
                    WebService.start(context)
                } else {
                    WebService.stop(context)
                    _uiState.update { it.copy(isWebServiceRun = false, webServiceAddress = "") }
                }
            }
            MyIntent.Logout -> {
                LocalConfig.isLoggedIn = false
                LocalConfig.userEmail = null
                LocalConfig.accessToken = null
                LocalConfig.vipExpireFromServer = 0L
                LocalConfig.userAvatar = null
                _uiState.update {
                    it.copy(
                        isLoggedIn = false,
                        userEmail = null,
                        userDisplayName = null,
                        userAvatar = null,
                        isVip = false,
                        vipExpireDays = 0
                    )
                }
                _effects.tryEmit(MyEffect.NavigateToWelcome)
            }
            MyIntent.RefreshUserStatus -> {
                _uiState.update {
                    it.copy(
                        isLoggedIn = LocalConfig.isLoggedIn,
                        userEmail = LocalConfig.userEmail,
                        userDisplayName = LocalConfig.userDisplayName,
                        userAvatar = LocalConfig.userAvatar,
                        isVip = MemberManager.isVip,
                        vipExpireDays = MemberManager.daysRemaining
                    )
                }
            }
            is MyIntent.Login -> {
                _uiState.update { it.copy(isAuthenticating = true) }
                viewModelScope.launch(Dispatchers.IO) {
                    val result = MemberManager.login(intent.email, intent.pass)
                    withContext(Dispatchers.Main) {
                        _uiState.update { it.copy(isAuthenticating = false) }
                        result.fold(
                            onSuccess = { msg ->
                                _effects.tryEmit(MyEffect.ShowToast(msg))
                                onIntent(MyIntent.RefreshUserStatus)
                            },
                            onFailure = { error ->
                                _effects.tryEmit(MyEffect.ShowToast(error.localizedMessage ?: "Đăng nhập thất bại"))
                            }
                        )
                    }
                }
            }
            is MyIntent.Register -> {
                _uiState.update { it.copy(isAuthenticating = true) }
                viewModelScope.launch(Dispatchers.IO) {
                    val result = MemberManager.signup(intent.email, intent.pass)
                    withContext(Dispatchers.Main) {
                        _uiState.update { it.copy(isAuthenticating = false) }
                        result.fold(
                            onSuccess = { msg ->
                                _effects.tryEmit(MyEffect.ShowToast(msg))
                            },
                            onFailure = { error ->
                                _effects.tryEmit(MyEffect.ShowToast(error.localizedMessage ?: "Đăng ký thất bại"))
                            }
                        )
                    }
                }
            }
            is MyIntent.UpdateCurrentUserProfile -> {
                val token = LocalConfig.accessToken
                val email = LocalConfig.userEmail
                if (token.isNullOrBlank() || email.isNullOrBlank()) {
                    _effects.tryEmit(MyEffect.ShowToast("Bạn chưa đăng nhập!"))
                    return
                }
                _uiState.update { it.copy(isSavingProfile = true) }
                viewModelScope.launch(Dispatchers.IO) {
                    val nameResult = MemberManager.updateCurrentUserData(token, intent.displayName.trim(), intent.avatarBase64)
                    if (nameResult.isFailure) {
                        withContext(Dispatchers.Main) {
                            _uiState.update { it.copy(isSavingProfile = false) }
                            _effects.tryEmit(MyEffect.ShowToast("Lỗi: ${nameResult.exceptionOrNull()?.localizedMessage}"))
                        }
                        return@launch
                    }
                    
                    if (!intent.oldPassword.isNullOrBlank() && !intent.newPassword.isNullOrBlank()) {
                        val passResult = MemberManager.updateCurrentUserPassword(token, email, intent.oldPassword, intent.newPassword)
                        withContext(Dispatchers.Main) {
                            _uiState.update { it.copy(isSavingProfile = false) }
                            passResult.fold(
                                onSuccess = {
                                    _effects.tryEmit(MyEffect.ShowToast("Cập nhật biệt danh và đổi mật khẩu thành công!"))
                                    onIntent(MyIntent.RefreshUserStatus)
                                },
                                onFailure = { error ->
                                    _effects.tryEmit(MyEffect.ShowToast("Lỗi đổi mật khẩu: ${error.localizedMessage}"))
                                }
                            )
                        }
                    } else {
                        withContext(Dispatchers.Main) {
                            _uiState.update { it.copy(isSavingProfile = false) }
                            _effects.tryEmit(MyEffect.ShowToast("Cập nhật thông tin thành công!"))
                            onIntent(MyIntent.RefreshUserStatus)
                        }
                    }
                }
            }
            MyIntent.OpenSupabaseMembers -> {
                _uiState.update {
                    it.copy(
                        showSupabaseMembersDialog = true,
                        serviceRoleKey = LocalConfig.supabaseServiceRoleKey ?: ""
                    )
                }
            }
            MyIntent.CloseSupabaseMembers -> {
                _uiState.update {
                    it.copy(
                        showSupabaseMembersDialog = false,
                        userList = persistentListOf(),
                        searchEmailQuery = ""
                    )
                }
            }
            is MyIntent.UpdateServiceRoleKey -> {
                LocalConfig.supabaseServiceRoleKey = intent.key
                _uiState.update { it.copy(serviceRoleKey = intent.key) }
            }
            MyIntent.FetchUsers -> {
                val key = _uiState.value.serviceRoleKey
                if (key.isBlank()) {
                    _effects.tryEmit(MyEffect.ShowToast("Vui lòng nhập Service Role Key!"))
                    return
                }
                _uiState.update { it.copy(isFetchingUsers = true) }
                viewModelScope.launch(Dispatchers.IO) {
                    val result = MemberManager.fetchSupabaseUsers(key.trim())
                    withContext(Dispatchers.Main) {
                        _uiState.update { it.copy(isFetchingUsers = false) }
                        result.fold(
                            onSuccess = { list ->
                                _uiState.update { it.copy(userList = list.toImmutableList()) }
                                _effects.tryEmit(MyEffect.ShowToast("Tải thành công ${list.size} tài khoản!"))
                            },
                            onFailure = { error ->
                                _effects.tryEmit(MyEffect.ShowToast("Lỗi: ${error.localizedMessage}"))
                            }
                        )
                    }
                }
            }
            is MyIntent.UpdateSearchEmailQuery -> {
                _uiState.update { it.copy(searchEmailQuery = intent.query) }
            }
            is MyIntent.StartEditingProfile -> {
                val user = intent.user
                val vipUntil = if (user.vipExpire > System.currentTimeMillis()) {
                    val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
                    sdf.format(Date(user.vipExpire))
                } else ""
                _uiState.update {
                    it.copy(
                        editingProfile = user,
                        vipUntilDate = vipUntil
                    )
                }
            }
            MyIntent.StopEditingProfile -> {
                _uiState.update {
                    it.copy(
                        editingProfile = null,
                        isSavingProfile = false
                    )
                }
            }
            is MyIntent.UpdateProfileName -> {
                _uiState.update { state ->
                    state.copy(
                        editingProfile = state.editingProfile?.copy(displayName = intent.name)
                    )
                }
            }
            is MyIntent.ToggleVip -> {
                val user = _uiState.value.editingProfile ?: return
                val active = intent.active
                val key = _uiState.value.serviceRoleKey
                _uiState.update { it.copy(isSavingProfile = true) }
                viewModelScope.launch(Dispatchers.IO) {
                    val newExpire = if (active) {
                        val calendar = Calendar.getInstance()
                        calendar.add(Calendar.DAY_OF_YEAR, 30)
                        calendar.timeInMillis
                    } else null
                    val result = MemberManager.updateUserProfile(key.trim(), user.id, user.displayName.trim(), newExpire)
                    withContext(Dispatchers.Main) {
                        _uiState.update { it.copy(isSavingProfile = false) }
                        if (result.isSuccess) {
                            _effects.tryEmit(MyEffect.ShowToast(if (active) "Đã kích hoạt VIP 30 ngày!" else "Đã hủy VIP!"))
                            val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
                            _uiState.update {
                                it.copy(
                                    vipUntilDate = if (active) sdf.format(Date(System.currentTimeMillis() + 30L * 24 * 60 * 60 * 1000)) else ""
                                )
                            }
                            refreshUserListAndActiveProfile(user.id)
                        } else {
                            _effects.tryEmit(MyEffect.ShowToast("Lỗi: ${result.exceptionOrNull()?.localizedMessage}"))
                        }
                    }
                }
            }
            is MyIntent.GrantVipDays -> {
                val user = _uiState.value.editingProfile ?: return
                val days = intent.days
                val key = _uiState.value.serviceRoleKey
                _uiState.update { it.copy(isSavingProfile = true) }
                viewModelScope.launch(Dispatchers.IO) {
                    val calendar = Calendar.getInstance()
                    calendar.add(Calendar.DAY_OF_YEAR, days)
                    val newExpire = calendar.timeInMillis
                    val result = MemberManager.updateUserProfile(key.trim(), user.id, user.displayName.trim(), newExpire)
                    withContext(Dispatchers.Main) {
                        _uiState.update { it.copy(isSavingProfile = false) }
                        result.fold(
                            onSuccess = {
                                _effects.tryEmit(MyEffect.ShowToast("Cấp VIP $days ngày thành công!"))
                                val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
                                _uiState.update { it.copy(vipUntilDate = sdf.format(Date(newExpire))) }
                                refreshUserListAndActiveProfile(user.id)
                            },
                            onFailure = { error ->
                                _effects.tryEmit(MyEffect.ShowToast("Lỗi: ${error.localizedMessage}"))
                            }
                        )
                    }
                }
            }
            is MyIntent.ChangeVipExpirationDate -> {
                val user = _uiState.value.editingProfile ?: return
                val dateStr = intent.dateStr
                val key = _uiState.value.serviceRoleKey
                _uiState.update { it.copy(isSavingProfile = true) }
                viewModelScope.launch(Dispatchers.IO) {
                    try {
                        val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
                        val newExpire = sdf.parse(dateStr)?.time ?: System.currentTimeMillis()
                        val result = MemberManager.updateUserProfile(key.trim(), user.id, user.displayName.trim(), newExpire)
                        withContext(Dispatchers.Main) {
                            _uiState.update { it.copy(isSavingProfile = false) }
                            if (result.isSuccess) {
                                _effects.tryEmit(MyEffect.ShowToast("Đổi ngày hết hạn thành công!"))
                                _uiState.update { it.copy(vipUntilDate = dateStr) }
                                refreshUserListAndActiveProfile(user.id)
                            } else {
                                _effects.tryEmit(MyEffect.ShowToast("Lỗi: ${result.exceptionOrNull()?.localizedMessage}"))
                            }
                        }
                    } catch (e: Exception) {
                        withContext(Dispatchers.Main) {
                            _uiState.update { it.copy(isSavingProfile = false) }
                            _effects.tryEmit(MyEffect.ShowToast("Lỗi định dạng ngày!"))
                        }
                    }
                }
            }
        }
    }

    private fun refreshUserListAndActiveProfile(userId: String) {
        val key = _uiState.value.serviceRoleKey
        viewModelScope.launch(Dispatchers.IO) {
            val refresh = MemberManager.fetchSupabaseUsers(key.trim())
            if (refresh.isSuccess) {
                withContext(Dispatchers.Main) {
                    val list = refresh.getOrThrow().toImmutableList()
                    _uiState.update { state ->
                        state.copy(
                            userList = list,
                            editingProfile = list.find { it.id == userId } ?: state.editingProfile
                        )
                    }
                }
            }
        }
    }

    fun onEvent(event: PrefClickEvent) {
        if (event == PrefClickEvent.ToggleWebService) {
            onIntent(MyIntent.ToggleWebService)
        }
    }
}

sealed class PrefClickEvent {
    data class OpenUrl(val url: String) : PrefClickEvent()
    data class CopyUrl(val url: String) : PrefClickEvent()
    data class ShowMd(val title: String, val path: String) : PrefClickEvent()
    data class StartActivity(val destination: Class<*>, val configTag: String? = null) : PrefClickEvent()
    object OpenReadRecord : PrefClickEvent()
    object OpenBookCacheManage : PrefClickEvent()
    object OpenAbout : PrefClickEvent()
    object ToggleWebService : PrefClickEvent()
    object ExitApp : PrefClickEvent()
}
