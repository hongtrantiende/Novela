package io.legado.app.ui.welcome

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import io.legado.app.R
import io.legado.app.base.BaseFragment
import io.legado.app.databinding.FragmentLoginBinding
import io.legado.app.help.config.LocalConfig
import io.legado.app.help.http.okHttpClient
import io.legado.app.utils.GSON
import io.legado.app.utils.viewbindingdelegate.viewBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import android.transition.TransitionManager
import android.view.ViewGroup
import android.view.animation.DecelerateInterpolator
import org.json.JSONObject

class LoginFragment : BaseFragment(R.layout.fragment_login) {

    private val binding by viewBinding(FragmentLoginBinding::bind)

    private enum class AuthMode {
        LOGIN, REGISTER, RECOVER
    }

    private var currentMode = AuthMode.LOGIN

    private val supabaseUrl = "https://arsnnqwcqzaqhndxemgz.supabase.co"
    private val supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImFyc25ucXdjcXphcWhuZHhlbWd6Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3NzgzNDE3NTksImV4cCI6MjA5MzkxNzc1OX0.dvPw5jgvPGmDqqoHF5la_d7AAwxH5PhVLhVSP5ayWA8"

    override fun onFragmentCreated(view: View, savedInstanceState: Bundle?) {
        updateUiMode(AuthMode.LOGIN)

        // Smooth entrance animation for the login container
        view.alpha = 0f
        view.translationY = 80f
        view.animate()
            .alpha(1f)
            .translationY(0f)
            .setDuration(600)
            .setInterpolator(DecelerateInterpolator())
            .start()

        binding.btnAction.setOnClickListener {
            handleAction()
        }

        binding.tvToggleSignup.setOnClickListener {
            when (currentMode) {
                AuthMode.LOGIN -> updateUiMode(AuthMode.REGISTER)
                AuthMode.REGISTER, AuthMode.RECOVER -> updateUiMode(AuthMode.LOGIN)
            }
        }

        binding.tvForgotPassword.setOnClickListener {
            if (currentMode == AuthMode.RECOVER) {
                updateUiMode(AuthMode.LOGIN)
            } else {
                updateUiMode(AuthMode.RECOVER)
            }
        }
    }

    private fun updateUiMode(mode: AuthMode) {
        currentMode = mode

        // Smooth transition animation when switching modes
        (binding.root as? ViewGroup)?.let {
            TransitionManager.beginDelayedTransition(it)
        }

        // Adjust tilPassword margin bottom dynamically to maintain consistent spacing to the button
        val density = resources.displayMetrics.density
        val marginDp = if (mode == AuthMode.REGISTER) 16 else 24
        (binding.tilPassword.layoutParams as? ViewGroup.MarginLayoutParams)?.apply {
            bottomMargin = (marginDp * density).toInt()
            binding.tilPassword.layoutParams = this
        }

        when (mode) {
            AuthMode.LOGIN -> {
                binding.tvModeTitle.text = "Chào mừng trở lại"
                binding.tvModeSummary.text = "Đăng nhập tài khoản của bạn để tiếp tục sử dụng ứng dụng"
                binding.tvModeSummary.visibility = View.VISIBLE
                binding.tilPassword.visibility = View.VISIBLE
                binding.tvLabelConfirmPassword.visibility = View.GONE
                binding.tilConfirmPassword.visibility = View.GONE
                binding.btnAction.text = "Đăng nhập"
                binding.tvToggleSignup.text = "Chưa có tài khoản? Đăng ký ngay"
                binding.tvForgotPassword.visibility = View.VISIBLE
                binding.tvForgotPassword.text = "Quên mật khẩu?"
            }
            AuthMode.REGISTER -> {
                binding.tvModeTitle.text = "Tạo tài khoản"
                binding.tvModeSummary.text = "Đăng ký tài khoản mới để trải nghiệm đầy đủ tính năng"
                binding.tvModeSummary.visibility = View.VISIBLE
                binding.tilPassword.visibility = View.VISIBLE
                binding.tvLabelConfirmPassword.visibility = View.VISIBLE
                binding.tilConfirmPassword.visibility = View.VISIBLE
                binding.btnAction.text = "Đăng ký"
                binding.tvToggleSignup.text = "Đã có tài khoản? Đăng nhập"
                binding.tvForgotPassword.visibility = View.GONE
            }
            AuthMode.RECOVER -> {
                binding.tvModeTitle.text = "Khôi phục mật khẩu"
                binding.tvModeSummary.text = "Nhập email của bạn để nhận liên kết đặt lại mật khẩu"
                binding.tvModeSummary.visibility = View.VISIBLE
                binding.tilPassword.visibility = View.GONE
                binding.tvLabelConfirmPassword.visibility = View.GONE
                binding.tilConfirmPassword.visibility = View.GONE
                binding.btnAction.text = "Gửi link khôi phục"
                binding.tvToggleSignup.text = "Quay lại đăng nhập"
                binding.tvForgotPassword.visibility = View.GONE
            }
        }
    }

    private fun handleAction() {
        val email = binding.etEmail.text.toString().trim()
        val password = binding.etPassword.text.toString().trim()
        val confirmPassword = binding.etConfirmPassword.text.toString().trim()

        if (email.isEmpty()) {
            Toast.makeText(requireContext(), "Vui lòng nhập Email", Toast.LENGTH_SHORT).show()
            return
        }

        if (currentMode != AuthMode.RECOVER && password.isEmpty()) {
            Toast.makeText(requireContext(), "Vui lòng nhập Mật khẩu", Toast.LENGTH_SHORT).show()
            return
        }

        if (currentMode == AuthMode.REGISTER) {
            if (confirmPassword.isEmpty()) {
                Toast.makeText(requireContext(), "Vui lòng nhập lại Mật khẩu", Toast.LENGTH_SHORT).show()
                return
            }
            if (password != confirmPassword) {
                Toast.makeText(requireContext(), "Mật khẩu nhập lại không khớp", Toast.LENGTH_SHORT).show()
                return
            }
        }

        setLoading(true)

        lifecycleScope.launch(Dispatchers.Main) {
            val result = withContext(Dispatchers.IO) {
                try {
                    when (currentMode) {
                        AuthMode.LOGIN -> performLogin(email, password)
                        AuthMode.REGISTER -> performRegister(email, password)
                        AuthMode.RECOVER -> performRecover(email)
                    }
                } catch (e: Exception) {
                    Result.failure(e)
                }
            }

            setLoading(false)

            result.fold(
                onSuccess = { successMessage ->
                    Toast.makeText(requireContext(), successMessage, Toast.LENGTH_LONG).show()
                    if (currentMode == AuthMode.LOGIN || currentMode == AuthMode.REGISTER) {
                        LocalConfig.isLoggedIn = true
                        (activity as? WelcomeActivity)?.nextPage()
                    } else {
                        updateUiMode(AuthMode.LOGIN)
                    }
                },
                onFailure = { error ->
                    val displayError = error.localizedMessage ?: "Lỗi không xác định"
                    Toast.makeText(requireContext(), "Thao tác thất bại: $displayError", Toast.LENGTH_LONG).show()
                }
            )
        }
    }

    private fun setLoading(loading: Boolean) {
        (binding.root as? ViewGroup)?.let {
            TransitionManager.beginDelayedTransition(it)
        }
        binding.btnAction.isEnabled = !loading
        binding.tvToggleSignup.isEnabled = !loading
        binding.tvForgotPassword.isEnabled = !loading
        binding.pbLoading.visibility = if (loading) View.VISIBLE else View.GONE
    }

    private fun performLogin(email: String, password: String): Result<String> {
        val json = GSON.toJson(mapOf("email" to email, "password" to password))
        val body = json.toRequestBody("application/json; charset=utf-8".toMediaType())
        val request = Request.Builder()
            .url("$supabaseUrl/auth/v1/token?grant_type=password")
            .header("apikey", supabaseKey)
            .header("Authorization", "Bearer $supabaseKey")
            .post(body)
            .build()

        okHttpClient.newCall(request).execute().use { response ->
            val responseBody = response.body?.string()
            if (!response.isSuccessful) {
                val errorMsg = parseErrorMessage(responseBody)
                return Result.failure(Exception(errorMsg))
            }
            return Result.success("Đăng nhập thành công!")
        }
    }

    private fun performRegister(email: String, password: String): Result<String> {
        val json = GSON.toJson(mapOf("email" to email, "password" to password))
        val body = json.toRequestBody("application/json; charset=utf-8".toMediaType())
        val request = Request.Builder()
            .url("$supabaseUrl/auth/v1/signup")
            .header("apikey", supabaseKey)
            .header("Authorization", "Bearer $supabaseKey")
            .post(body)
            .build()

        okHttpClient.newCall(request).execute().use { response ->
            val responseBody = response.body?.string()
            if (!response.isSuccessful) {
                val errorMsg = parseErrorMessage(responseBody)
                return Result.failure(Exception(errorMsg))
            }
            return Result.success("Đăng ký tài khoản thành công! Vui lòng xác thực email của bạn.")
        }
    }

    private fun performRecover(email: String): Result<String> {
        val json = GSON.toJson(mapOf("email" to email))
        val body = json.toRequestBody("application/json; charset=utf-8".toMediaType())
        val request = Request.Builder()
            .url("$supabaseUrl/auth/v1/recover")
            .header("apikey", supabaseKey)
            .header("Authorization", "Bearer $supabaseKey")
            .post(body)
            .build()

        okHttpClient.newCall(request).execute().use { response ->
            val responseBody = response.body?.string()
            if (!response.isSuccessful) {
                val errorMsg = parseErrorMessage(responseBody)
                return Result.failure(Exception(errorMsg))
            }
            return Result.success("Đã gửi link khôi phục mật khẩu vào email của bạn!")
        }
    }

    private fun parseErrorMessage(jsonBody: String?): String {
        if (jsonBody.isNullOrBlank()) return "Lỗi hệ thống"
        return try {
            val json = JSONObject(jsonBody)
            json.optString("error_description", json.optString("msg", "Yêu cầu thất bại"))
        } catch (e: Exception) {
            "Lỗi phản hồi từ máy chủ"
        }
    }
}
