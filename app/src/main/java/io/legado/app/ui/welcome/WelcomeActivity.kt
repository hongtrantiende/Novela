package io.legado.app.ui.welcome


import android.os.Bundle
import android.view.View
import androidx.activity.addCallback
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import io.legado.app.base.BaseActivity
import io.legado.app.databinding.ActivityWelcomeBinding
import io.legado.app.help.config.LocalConfig
import io.legado.app.ui.main.MainActivity
import io.legado.app.utils.viewbindingdelegate.viewBinding

class WelcomeActivity : BaseActivity<ActivityWelcomeBinding>() {

    override val binding by viewBinding(ActivityWelcomeBinding::inflate)

    private val pages = listOf(
        LoginFragment(),
        BookFolderFragment(),
        ThemeFragment()
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        onBackPressedDispatcher.addCallback(this) {
            val current = binding.viewPager.currentItem
            if (current > 0) {
                binding.viewPager.currentItem = current - 1
            } else {
                finish()
            }
        }

        updateProgress(0)

        binding.viewPager.adapter = object : FragmentStateAdapter(this) {
            override fun getItemCount() = pages.size
            override fun createFragment(position: Int) = pages[position]
        }

        binding.viewPager.isUserInputEnabled = false

        if (LocalConfig.isLoggedIn) {
            binding.viewPager.currentItem = 1
        }

        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                binding.btnNext.visibility = if (position == 0) View.GONE else View.VISIBLE
                binding.btnNext.text = when (position) {
                    pages.lastIndex -> "Hoàn thành"
                    else -> "Bước tiếp theo"
                }
                binding.tvTitle.text = when (pages[position]) {
                    is LoginFragment -> "Đăng nhập"
                    is BookFolderFragment -> "thư mục sách"
                    is ThemeFragment -> "phong cách chủ đề"
                    else -> ""
                }
                binding.tvSummary.text = when (pages[position]) {
                    is LoginFragment -> "Đăng nhập tài khoản của bạn để tiếp tục sử dụng ứng dụng."
                    is BookFolderFragment -> "Vui lòng chọn một thư mục để lưu sách địa phương."
                    is ThemeFragment -> "Đặt phong cách yêu thích của bạn ở đây."
                    else -> ""
                }
                binding.llInfo.visibility = if (position == 0) View.GONE else View.VISIBLE
                updateProgress(position)
            }
        })

        // 初始化按钮文字
        binding.btnNext.text = "Bước tiếp theo"

        binding.btnNext.setOnClickListener {
            val current = binding.viewPager.currentItem
            when (current) {
                pages.lastIndex -> {
                    updateProgress(2)
                    finishSetup()
                }

                else -> {
                    binding.viewPager.currentItem = current + 1
                }
            }
        }
    }

    private fun updateProgress(position: Int) {
        val progressMax = pages.size
        val progress = (position * 100 / progressMax)
        binding.progressBar.setProgress(progress, true)
    }

    fun nextPage() {
        val nextItem = binding.viewPager.currentItem + 1
        if (nextItem < pages.size) {
            binding.viewPager.currentItem = nextItem
        }
    }

    private fun finishSetup() {
        LocalConfig.isLoggedIn = true
        LocalConfig.privacyPolicyOk = true
        startActivity(MainActivity.createHomeIntent(this))
        finish()
    }
}
