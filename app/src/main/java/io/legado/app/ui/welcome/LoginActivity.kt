package io.legado.app.ui.welcome

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.view.animation.DecelerateInterpolator
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.transition.AutoTransition
import androidx.transition.TransitionManager
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import io.legado.app.R
import io.legado.app.help.MemberManager
import kotlinx.coroutines.launch

class LoginActivity : AppCompatActivity() {

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
        setContentView(R.layout.fragment_login)

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
        val tvModeTitle = findViewById<TextView>(R.id.tv_mode_title)
        val btnAction = findViewById<MaterialButton>(R.id.btn_action)
        val tilConfirmPassword = findViewById<TextInputLayout>(R.id.til_confirm_password)
        val tvForgotPassword = findViewById<TextView>(R.id.tv_forgot_password)
        val tvToggleSignup = findViewById<TextView>(R.id.tv_toggle_signup)
        val rootLayout = findViewById<View>(android.R.id.content)

        if (animate) {
            val transition = AutoTransition().apply {
                duration = 300
                interpolator = DecelerateInterpolator(1.2f)
            }
            TransitionManager.beginDelayedTransition(
                rootLayout as android.view.ViewGroup,
                transition
            )
        }

        if (isLoginMode) {
            tvModeTitle?.text = "Chào mừng trở lại"
            btnAction?.text = "Đăng nhập"
            tilConfirmPassword?.visibility = View.GONE
            tvForgotPassword?.visibility = View.VISIBLE
            tvToggleSignup?.text = "Chưa có tài khoản? Đăng ký ngay"
        } else {
            tvModeTitle?.text = "Tạo tài khoản mới"
            btnAction?.text = "Đăng ký"
            tilConfirmPassword?.visibility = View.VISIBLE
            tvForgotPassword?.visibility = View.GONE
            tvToggleSignup?.text = "Đã có tài khoản? Đăng nhập"
        }

        // Animate title and button text change
        if (animate) {
            tvModeTitle?.alpha = 0f
            tvModeTitle?.animate()
                ?.alpha(1f)
                ?.setDuration(250)
                ?.setInterpolator(DecelerateInterpolator())
                ?.start()

            btnAction?.alpha = 0f
            btnAction?.animate()
                ?.alpha(1f)
                ?.setDuration(250)
                ?.setStartDelay(50)
                ?.start()
        }
    }

    private fun setupActions() {
        val etEmail = findViewById<TextInputEditText>(R.id.et_email)
        val etPassword = findViewById<TextInputEditText>(R.id.et_password)
        val etConfirmPassword = findViewById<TextInputEditText>(R.id.et_confirm_password)
        val btnAction = findViewById<MaterialButton>(R.id.btn_action)
        val pbLoading = findViewById<ProgressBar>(R.id.pb_loading)
        val tvToggleSignup = findViewById<TextView>(R.id.tv_toggle_signup)
        val tvForgotPassword = findViewById<TextView>(R.id.tv_forgot_password)
        val llDiscord = findViewById<LinearLayout>(R.id.ll_discord_community)

        btnAction?.setOnClickListener {
            val email = etEmail?.text?.toString()?.trim() ?: ""
            val password = etPassword?.text?.toString() ?: ""

            if (email.isBlank()) {
                etEmail?.error = "Vui lòng nhập email"
                return@setOnClickListener
            }
            if (password.length < 6) {
                etPassword?.error = "Mật khẩu phải từ 6 ký tự"
                return@setOnClickListener
            }
            if (!isLoginMode) {
                val confirmPassword = etConfirmPassword?.text?.toString() ?: ""
                if (password != confirmPassword) {
                    etConfirmPassword?.error = "Mật khẩu không khớp"
                    return@setOnClickListener
                }
            }

            btnAction.isEnabled = false
            pbLoading?.visibility = View.VISIBLE

            lifecycleScope.launch {
                try {
                    if (isLoginMode) {
                        MemberManager.login(email, password)
                    } else {
                        MemberManager.signup(email, password)
                    }
                    Toast.makeText(
                        this@LoginActivity,
                        if (isLoginMode) "Đăng nhập thành công!" else "Đăng ký thành công!",
                        Toast.LENGTH_SHORT
                    ).show()
                    finish()
                } catch (e: Exception) {
                    Toast.makeText(
                        this@LoginActivity,
                        e.localizedMessage ?: "Đã xảy ra lỗi",
                        Toast.LENGTH_LONG
                    ).show()
                } finally {
                    btnAction.isEnabled = true
                    pbLoading?.visibility = View.GONE
                }
            }
        }

        tvToggleSignup?.setOnClickListener {
            isLoginMode = !isLoginMode
            updateUiMode(animate = true)
        }

        tvForgotPassword?.setOnClickListener {
            Toast.makeText(this, "Tính năng đang phát triển", Toast.LENGTH_SHORT).show()
        }

        llDiscord?.setOnClickListener {
            try {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://discord.gg/2E4p4sAgVj"))
                startActivity(intent)
            } catch (_: Exception) {
            }
        }
    }
}
