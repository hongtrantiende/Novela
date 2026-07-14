package io.legado.app.ui.welcome

import android.app.Activity
import android.os.Bundle
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import com.google.android.gms.auth.api.signin.GoogleSignIn
import io.legado.app.R
import io.legado.app.base.BaseFragment
import io.legado.app.databinding.FragmentGoogleDriveBinding
import io.legado.app.help.AppGoogleDrive
import io.legado.app.utils.gone
import io.legado.app.utils.toastOnUi
import io.legado.app.utils.viewbindingdelegate.viewBinding
import io.legado.app.utils.visible

class GoogleDriveFragment : BaseFragment(R.layout.fragment_google_drive) {

    private val binding by viewBinding(FragmentGoogleDriveBinding::bind)

    private val signInLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val task = GoogleSignIn.getSignedInAccountFromIntent(result.data)
            try {
                val account = task.getResult(Exception::class.java)
                if (account != null) {
                    updateSignedInUi(account.email)
                    activity?.toastOnUi("Đăng nhập Google thành công!")
                }
            } catch (e: Exception) {
                activity?.toastOnUi("Đăng nhập thất bại: ${e.localizedMessage}")
            }
        }
    }

    override fun onFragmentCreated(view: View, savedInstanceState: Bundle?) {
        // Check if already signed in
        val existingAccount = AppGoogleDrive.getSignedInAccount(requireContext())
        if (existingAccount != null) {
            updateSignedInUi(existingAccount.email)
        }

        binding.btnSignIn.setOnClickListener {
            val client = AppGoogleDrive.getSignInClient(requireContext())
            signInLauncher.launch(client.signInIntent)
        }

        binding.btnRestore.setOnClickListener {
            activity?.toastOnUi("Khôi phục từ Google Drive sẽ được thực hiện trong phần Cài đặt.")
        }

        binding.btnBackup.setOnClickListener {
            activity?.toastOnUi("Sao lưu lên Google Drive sẽ được thực hiện trong phần Cài đặt.")
        }
    }

    private fun updateSignedInUi(email: String?) {
        binding.btnSignIn.gone()
        binding.layoutSignedIn.visible()
        binding.tvAccount.text = email ?: "Đã đăng nhập"
    }
}
