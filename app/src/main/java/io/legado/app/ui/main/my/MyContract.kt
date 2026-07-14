package io.legado.app.ui.main.my

import androidx.compose.runtime.Stable
import io.legado.app.help.SupabaseUser
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

@Stable
data class MyUiState(
    val isWebServiceRun: Boolean = false,
    val webServiceAddress: String = "",
    // User status
    val isLoggedIn: Boolean = false,
    val userEmail: String? = null,
    val isVip: Boolean = false,
    val vipExpireDays: Long = 0,
    
    // Supabase member management
    val showSupabaseMembersDialog: Boolean = false,
    val serviceRoleKey: String = "",
    val userList: ImmutableList<SupabaseUser> = persistentListOf(),
    val searchEmailQuery: String = "",
    val isFetchingUsers: Boolean = false,
    val editingProfile: SupabaseUser? = null,
    val isSavingProfile: Boolean = false,
    val vipUntilDate: String = "",
    val isAuthenticating: Boolean = false,
)

sealed interface MyIntent {
    data object ToggleWebService : MyIntent
    data object Logout : MyIntent
    data object RefreshUserStatus : MyIntent
    data class Login(val email: String, val pass: String) : MyIntent
    data class Register(val email: String, val pass: String) : MyIntent
    
    // Supabase member management
    data object OpenSupabaseMembers : MyIntent
    data object CloseSupabaseMembers : MyIntent
    data class UpdateServiceRoleKey(val key: String) : MyIntent
    data object FetchUsers : MyIntent
    data class UpdateSearchEmailQuery(val query: String) : MyIntent
    data class StartEditingProfile(val user: SupabaseUser) : MyIntent
    data object StopEditingProfile : MyIntent
    data class UpdateProfileName(val name: String) : MyIntent
    data class ToggleVip(val active: Boolean) : MyIntent
    data class GrantVipDays(val days: Int) : MyIntent
    data class ChangeVipExpirationDate(val dateStr: String) : MyIntent
}

sealed interface MyEffect {
    data class ShowToast(val message: String) : MyEffect
    data object NavigateToWelcome : MyEffect
}
