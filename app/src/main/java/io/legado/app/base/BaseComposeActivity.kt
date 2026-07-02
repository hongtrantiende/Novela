package io.legado.app.base

import android.os.Bundle
import android.os.Build
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.core.graphics.drawable.toDrawable
import androidx.core.view.WindowCompat
import io.legado.app.constant.EventBus
import io.legado.app.constant.Theme
import io.legado.app.help.config.AppConfig
import io.legado.app.help.config.ThemeConfigStore
import io.legado.app.ui.theme.AppTheme
import io.legado.app.utils.disableAutoFill
import io.legado.app.utils.fullScreen
import io.legado.app.utils.observeEvent
import io.legado.app.utils.setStatusBarColorAuto
import io.legado.app.utils.themeColor
import io.legado.app.utils.toggleSystemBar
import io.legado.app.utils.windowSize

abstract class BaseComposeActivity(
    val fullScreen: Boolean = true,
    private val toolBarTheme: Theme = Theme.Auto,
    private val transparent: Boolean = false,
    private val imageBg: Boolean = true
) : AppCompatActivity() {

    @Composable
    protected abstract fun Content()

    override fun onCreate(savedInstanceState: Bundle?) {
        window.decorView.disableAutoFill()
        AppContextWrapper.applyLocaleAndFont(this)

        super.onCreate(savedInstanceState)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val display = windowManager.defaultDisplay
            val modes = display.supportedModes
            if (modes.isNotEmpty()) {
                val maxMode = modes.maxByOrNull { it.refreshRate }
                if (maxMode != null) {
                    val lp = window.attributes
                    lp.preferredDisplayModeId = maxMode.modeId
                    window.attributes = lp
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                        try {
                            val userFps = io.legado.app.ui.config.otherConfig.OtherConfig.preferredDisplayFps
                            val targetFps = if (userFps > 0) userFps.toFloat() else maxMode.refreshRate
                            val setFrameRateMethod = window.decorView.javaClass.getMethod(
                                "setFrameRate",
                                java.lang.Float.TYPE,
                                java.lang.Integer.TYPE
                            )
                            setFrameRateMethod.invoke(window.decorView, targetFps, 0)
                        } catch (e: Throwable) {
                            e.printStackTrace()
                        }
                    }
                }
            }
        }
        enableEdgeToEdge()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            window.isNavigationBarContrastEnforced = false
        }

        setupSystemBar()
        // Compose 入口
        setContent {
            AppTheme {
                Content()
            }
        }

        if (imageBg) {
            upBackgroundImage()
        }

        observeLiveBus()
    }

    open fun setupSystemBar() {
        WindowCompat.setDecorFitsSystemWindows(window, false)

        if (fullScreen) fullScreen()

        setStatusBarColorAuto(
            themeColor(com.google.android.material.R.attr.colorSurface),
            true,
            fullScreen
        )

        toggleSystemBar(AppConfig.showStatusBar)
    }

    open fun upBackgroundImage() {
        try {
            ThemeConfigStore.getBgImage(this, windowManager.windowSize)?.let {
                window.setBackgroundDrawable(it.toDrawable(resources))
            }
        } catch (_: Exception) {}
    }

    open fun observeLiveBus() {
        observeEvent<String>(EventBus.RECREATE) {
            recreate()
        }
        observeEvent<Boolean>(EventBus.NOTIFY_MAIN) {
            setupSystemBar()
        }
    }

}
