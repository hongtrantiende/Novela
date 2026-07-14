package io.legado.app.ui.welcome

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.view.animation.DecelerateInterpolator
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.lifecycle.lifecycleScope
import androidx.transition.AutoTransition
import androidx.transition.TransitionManager
import io.legado.app.R
import io.legado.app.base.BaseActivity
import io.legado.app.databinding.FragmentLoginBinding
import io.legado.app.help.MemberManager
import io.legado.app.utils.viewbindingdelegate.viewBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class LoginActivity : BaseActivity<FragmentLoginBinding>() {

    override val binding by viewBinding(FragmentLoginBinding::inflate)

    companion object {
        private const val EXTRA_MODE = "mode"
        const val MODE_LOGIN = "login"
        const val MODE_REGISTER = "register"

        fun start(context: Context, mode: String = MODE_LOGIN) {
            val intent = Intent(context, LoginActivity::class.java)
            intent.putExtra(EXTRA_MODE, mode)
            context.startActivity(intent)
            // Slide up animation when opening
            if (context is android.app.Activity) {
                @Suppress("DEPRECATION")
                context.overridePendingTransition(R.anim.slide_up_in, 0)
            }
        }
    }

    private var isLoginMode = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val mode = intent.getStringExtra(EXTRA_MODE) ?: MODE_LOGIN
        isLoginMode = mode == MODE_LOGIN

        setupBackButton()
        updateUiMode(animate = false)
        setupActions()
    }

    private fun setupBackButton() {
        onBackPressedDispatcher.addCallback(this,
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    finish()
                    @Suppress("DEPRECATION")
                    overridePendingTransition(0, R.anim.slide_down_out)
                }
            }
        )
    }

    override fun finish() {
        super.finish()
        @Suppress("DEPRECATION")
        overridePendingTransition(0, R.anim.slide_down_out)
    }

    private fun updateUiMode(animate: Boolean = true) {
        if (animate) {
            val transition = AutoTransition().apply {
                duration = 300
                interpolator = DecelerateInterpolator(1.2f)
            }
            TransitionManager.beginDelayedTransition(
                binding.root,
                transition
            )
        }

        if (isLoginMode) {
            binding.tvModeTitle.text = "Chào mừng trở lại"
            binding.btnAction.text = ""
            binding.tilConfirmPassword.visibility = View.GONE
            binding.tvForgotPassword.visibility = View.VISIBLE
            binding.tvToggleSignup.text = "Chưa có tài khoản? Đăng ký ngay"
        } else {
            binding.tvModeTitle.text = "Tạo tài khoản mới"
            binding.btnAction.text = ""
            binding.tilConfirmPassword.visibility = View.VISIBLE
            binding.tilConfirmPassword.post {
                binding.tilConfirmPassword.hint = "Nhập lại mật khẩu"
                binding.tilConfirmPassword.requestLayout()
            }
            binding.tvForgotPassword.visibility = View.GONE
            binding.tvToggleSignup.text = "Đã có tài khoản? Đăng nhập"
        }

        // Animate title and button text change
        if (animate) {
            binding.tvModeTitle.alpha = 0f
            binding.tvModeTitle.animate()
                ?.alpha(1f)
                ?.setDuration(250)
                ?.setInterpolator(DecelerateInterpolator())
                ?.start()

            binding.btnAction.alpha = 0f
            binding.btnAction.animate()
                ?.alpha(1f)
                ?.setDuration(250)
                ?.setStartDelay(50)
                ?.start()
        }
    }

    private fun setupActions() {
        binding.btnBack.setOnClickListener {
            finish()
        }

        binding.btnAction.setOnClickListener {
            val email = binding.etEmail.text?.toString()?.trim() ?: ""
            val password = binding.etPassword.text?.toString() ?: ""

            if (email.isBlank()) {
                binding.etEmail.error = "Vui lòng nhập email"
                return@setOnClickListener
            }
            if (password.length < 6) {
                binding.etPassword.error = "Mật khẩu phải từ 6 ký tự"
                return@setOnClickListener
            }
            if (!isLoginMode) {
                val confirmPassword = binding.etConfirmPassword.text?.toString() ?: ""
                if (password != confirmPassword) {
                    binding.etConfirmPassword.error = "Mật khẩu không khớp"
                    return@setOnClickListener
                }
            }

            binding.btnAction.isEnabled = false
            binding.pbLoading.visibility = View.VISIBLE

            lifecycleScope.launch(Dispatchers.IO) {
                try {
                    val result = if (isLoginMode) {
                        MemberManager.login(email, password)
                    } else {
                        MemberManager.signup(email, password)
                    }
                    
                    withContext(Dispatchers.Main) {
                        result.fold(
                            onSuccess = { msg ->
                                Toast.makeText(this@LoginActivity, msg, Toast.LENGTH_SHORT).show()
                                finish()
                            },
                            onFailure = { error ->
                                Toast.makeText(this@LoginActivity, error.localizedMessage ?: "Thao tác thất bại", Toast.LENGTH_LONG).show()
                            }
                        )
                    }
                } catch (e: Exception) {
                    withContext(Dispatchers.Main) {
                        Toast.makeText(
                            this@LoginActivity,
                            e.localizedMessage ?: "Đã xảy ra lỗi",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                } finally {
                    withContext(Dispatchers.Main) {
                        binding.btnAction.isEnabled = true
                        binding.pbLoading.visibility = View.GONE
                    }
                }
            }
        }

        binding.tvToggleSignup.setOnClickListener {
            isLoginMode = !isLoginMode
            updateUiMode(animate = true)
        }

        binding.tvForgotPassword.setOnClickListener {
            Toast.makeText(this, "Tính năng đang phát triển", Toast.LENGTH_SHORT).show()
        }

        binding.llDiscordCommunity.setOnClickListener {
            try {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://discord.gg/2E4p4sAgVj"))
                startActivity(intent)
            } catch (_: Exception) {
            }
        }
    }
}
