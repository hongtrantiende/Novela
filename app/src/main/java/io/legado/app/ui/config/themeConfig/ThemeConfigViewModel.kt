package io.legado.app.ui.config.themeConfig

import android.net.Uri
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.legado.app.constant.PreferKey
import io.legado.app.data.local.preferences.LocalPreferencesKeys
import io.legado.app.data.local.preferences.LocalPreferencesRepository
import io.legado.app.data.repository.ReadSettingsRepository
import io.legado.app.utils.FileDoc
import io.legado.app.utils.FileUtils
import io.legado.app.utils.MD5Utils
import io.legado.app.utils.externalFiles
import io.legado.app.utils.inputStream
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import splitties.init.appCtx
import java.io.File
import java.io.FileOutputStream
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.content.ContentValues
import android.os.Build
import android.os.Environment
import android.provider.MediaStore

class ThemeConfigViewModel(
    private val localPreferencesRepository: LocalPreferencesRepository,
    private val readSettingsRepository: ReadSettingsRepository
) : ViewModel() {

    val fontFolder = readSettingsRepository.preferences
        .map { it.fontFolder as String? }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), null)

    fun setFontFolder(path: String) {
        viewModelScope.launch {
            runCatching {
                readSettingsRepository.setFontFolder(path)
            }
        }
    }

    val showThemeRefactorTip = localPreferencesRepository
        .getPreference(LocalPreferencesKeys.SHOW_THEME_REFACTOR_TIP, true)
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), true)

    fun setShowThemeRefactorTip(show: Boolean) {
        viewModelScope.launch {
            localPreferencesRepository.updatePreference(
                LocalPreferencesKeys.SHOW_THEME_REFACTOR_TIP,
                show
            )
        }
    }

    /**
     * 设置背景图片
     */
    suspend fun setBackgroundFromUri(
        uri: Uri,
        isDarkTheme: Boolean
    ) = withContext(Dispatchers.IO) {
        kotlin.runCatching {
            val fileDoc = FileDoc.fromUri(uri, false)
            val suffix = fileDoc.name.substringAfterLast(".", "jpg")

            // 计算MD5作为文件名
            val md5 = uri.inputStream(appCtx).getOrThrow().use {
                MD5Utils.md5Encode(it)
            }
            val fileName = "$md5.$suffix"

            val preferenceKey = if (isDarkTheme) PreferKey.bgImageN else PreferKey.bgImage
            val folder = File(appCtx.externalFiles, preferenceKey)
            val file = File(folder, fileName)

            if (!file.exists()) {
                FileUtils.createFileIfNotExist(file.absolutePath)
                uri.inputStream(appCtx).getOrThrow().use { input ->
                    FileOutputStream(file).use { output ->
                        input.copyTo(output)
                    }
                }
            }

            updateBackgroundPath(isDarkTheme, file.absolutePath)
        }.onFailure {
            it.printStackTrace()
        }
    }

    fun removeBackground(isDarkTheme: Boolean) {
        updateBackgroundPath(isDarkTheme, null)
    }

    /**
     * 更新背景路径并清理旧文件
     */
    private fun updateBackgroundPath(isDarkTheme: Boolean, newPath: String?) {
        val oldPath = if (isDarkTheme) {
            ThemeConfig.bgImageDark
        } else {
            ThemeConfig.bgImageLight
        }

        if (oldPath != newPath && oldPath != null) {
            val oldFile = File(oldPath)
            if (oldFile.absolutePath.contains(appCtx.externalFiles.absolutePath)) {
                oldFile.delete()
            }
        }

        if (isDarkTheme) {
            ThemeConfig.bgImageDark = newPath
        } else {
            ThemeConfig.bgImageLight = newPath
        }
    }

    fun removeBookDetailBackground(isDarkTheme: Boolean) {
        updateBookDetailBackgroundPath(isDarkTheme, null)
    }

    private fun updateBookDetailBackgroundPath(isDarkTheme: Boolean, newPath: String?) {
        val oldPath = if (isDarkTheme) {
            ThemeConfig.bgImageBookDetailDark
        } else {
            ThemeConfig.bgImageBookDetailLight
        }

        if (oldPath != newPath && oldPath != null) {
            val oldFile = File(oldPath)
            if (oldFile.absolutePath.contains(appCtx.externalFiles.absolutePath)) {
                oldFile.delete()
            }
        }

        if (isDarkTheme) {
            ThemeConfig.bgImageBookDetailDark = newPath
        } else {
            ThemeConfig.bgImageBookDetailLight = newPath
        }
    }

    suspend fun setBookDetailBackgroundFromUri(
        uri: Uri,
        isDarkTheme: Boolean
    ) = withContext(Dispatchers.IO) {
        kotlin.runCatching {
            val fileDoc = FileDoc.fromUri(uri, false)
            val suffix = fileDoc.name.substringAfterLast(".", "jpg")

            val md5 = uri.inputStream(appCtx).getOrThrow().use {
                MD5Utils.md5Encode(it)
            }
            val fileName = "$md5.$suffix"

            val preferenceKey = if (isDarkTheme) PreferKey.bgImageBookDetailN else PreferKey.bgImageBookDetail
            val folder = File(appCtx.externalFiles, preferenceKey)
            val file = File(folder, fileName)

            if (!file.exists()) {
                FileUtils.createFileIfNotExist(file.absolutePath)
                uri.inputStream(appCtx).getOrThrow().use { input ->
                    FileOutputStream(file).use { output ->
                        input.copyTo(output)
                    }
                }
            }

            updateBookDetailBackgroundPath(isDarkTheme, file.absolutePath)
        }.onFailure {
            it.printStackTrace()
        }
    }

    fun removeBookDetailCardBackground(isDarkTheme: Boolean) {
        updateBookDetailCardBackgroundPath(isDarkTheme, null)
    }

    private fun updateBookDetailCardBackgroundPath(isDarkTheme: Boolean, newPath: String?) {
        val oldPath = if (isDarkTheme) {
            ThemeConfig.bgImageBookDetailCardDark
        } else {
            ThemeConfig.bgImageBookDetailCardLight
        }

        if (oldPath != newPath && oldPath != null) {
            val oldFile = File(oldPath)
            if (oldFile.absolutePath.contains(appCtx.externalFiles.absolutePath)) {
                oldFile.delete()
            }
        }

        if (isDarkTheme) {
            ThemeConfig.bgImageBookDetailCardDark = newPath
        } else {
            ThemeConfig.bgImageBookDetailCardLight = newPath
        }
    }

    suspend fun setBookDetailCardBackgroundFromUri(
        uri: Uri,
        isDarkTheme: Boolean
    ) = withContext(Dispatchers.IO) {
        kotlin.runCatching {
            val fileDoc = FileDoc.fromUri(uri, false)
            val suffix = fileDoc.name.substringAfterLast(".", "jpg")

            val md5 = uri.inputStream(appCtx).getOrThrow().use {
                MD5Utils.md5Encode(it)
            }
            val fileName = "$md5.$suffix"

            val preferenceKey = if (isDarkTheme) PreferKey.bgImageBookDetailCardN else PreferKey.bgImageBookDetailCard
            val folder = File(appCtx.externalFiles, preferenceKey)
            val file = File(folder, fileName)

            if (!file.exists()) {
                FileUtils.createFileIfNotExist(file.absolutePath)
                uri.inputStream(appCtx).getOrThrow().use { input ->
                    FileOutputStream(file).use { output ->
                        input.copyTo(output)
                    }
                }
            }

            updateBookDetailCardBackgroundPath(isDarkTheme, file.absolutePath)
        }.onFailure {
            it.printStackTrace()
        }
    }

    fun exportCardFrameTemplate(): String? {
        try {
            val width = 800
            val height = 400
            val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
            val canvas = Canvas(bitmap)
            
            // Draw background color
            val paint = Paint().apply {
                color = android.graphics.Color.parseColor("#F4ECD8")
                style = Paint.Style.FILL
            }
            canvas.drawRect(0f, 0f, width.toFloat(), height.toFloat(), paint)
            
            // Draw a nice border
            val borderPaint = Paint().apply {
                color = android.graphics.Color.parseColor("#D5C29D")
                style = Paint.Style.STROKE
                strokeWidth = 10f
            }
            canvas.drawRect(5f, 5f, width.toFloat() - 5f, height.toFloat() - 5f, borderPaint)
            
            // Draw a label text
            val textPaint = Paint().apply {
                color = android.graphics.Color.parseColor("#8C7247")
                textSize = 36f
                isAntiAlias = true
                textAlign = Paint.Align.CENTER
            }
            canvas.drawText("Mau khung chi tiet truyen (800x400)", (width / 2).toFloat(), (height / 2).toFloat(), textPaint)
            canvas.drawText("Ban co the thiet ke de len file nay", (width / 2).toFloat(), (height / 2).toFloat() + 50f, textPaint)

            // Save to public Downloads directory
            val fileName = "book_detail_card_template.png"
            val resolver = appCtx.contentResolver
            val contentValues = ContentValues().apply {
                put(MediaStore.MediaColumns.DISPLAY_NAME, fileName)
                put(MediaStore.MediaColumns.MIME_TYPE, "image/png")
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    put(MediaStore.MediaColumns.RELATIVE_PATH, Environment.DIRECTORY_DOWNLOADS)
                } else {
                    @Suppress("DEPRECATION")
                    val directory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                    put(MediaStore.MediaColumns.DATA, File(directory, fileName).absolutePath)
                }
            }
            val uri = resolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues)
            if (uri != null) {
                resolver.openOutputStream(uri)?.use { outputStream ->
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream)
                    return "Download/$fileName"
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return null
    }
}
