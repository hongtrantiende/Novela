package io.legado.app.ui.welcome


import android.os.Bundle
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
        PrivacyFragment(),
        WebDavFragment(),
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

        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                binding.btnNext.text = when (position) {
                    0 -> "Đọc và đồng ý" // PrivacyFragment
                    pages.lastIndex -> "Hoàn thành"
                    else -> "Bước tiếp theo"
                }
                binding.tvTitle.text = when (position) {
                    0 -> "Chào mừng!" // PrivacyFragment
                    1 -> "Sao lưu và phục hồi"
                    2 -> "thư mục sách"
                    else -> "phong cách chủ đề"
                }
                binding.tvSummary.text = when (position) {
                    0 -> "Vui lòng đọc điều khoản dịch vụ và thỏa thuận người dùng của ứng dụng trước."
                    1 -> "Tại đây bạn có thể thiết lập đồng bộ hóa đám mây và khôi phục bản sao lưu ứng dụng."
                    2 -> "Vui lòng chọn một thư mục để lưu sách địa phương."
                    else -> "Đặt phong cách yêu thích của bạn ở đây."
                }
                updateProgress(position)
            }
        })

        // 初始化按钮文字
        binding.btnNext.text = "Đọc và đồng ý"

        binding.btnNext.setOnClickListener {
            val current = binding.viewPager.currentItem
            when (current) {
                0 -> {
                    LocalConfig.privacyPolicyOk = true
                    binding.viewPager.currentItem = 1
                }

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

    private fun finishSetup() {
        startActivity(MainActivity.createHomeIntent(this))
        finish()
    }
}
