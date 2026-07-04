package io.legado.app.service

import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationCompat
import androidx.lifecycle.lifecycleScope
import io.legado.app.R
import io.legado.app.base.BaseService
import io.legado.app.constant.AppConst
import io.legado.app.constant.IntentAction
import io.legado.app.constant.NotificationId
import io.legado.app.data.appDb
import io.legado.app.help.book.BookHelp
import io.legado.app.model.ReadBook
import io.legado.app.model.translation.TranslationManager
import io.legado.app.utils.MD5Utils
import io.legado.app.utils.TranslateUtils
import io.legado.app.utils.getPrefInt
import io.legado.app.utils.putPrefInt
import io.legado.app.utils.servicePendingIntent
import io.legado.app.utils.startForegroundServiceCompat
import io.legado.app.utils.toastOnUi
import io.legado.app.vbookextension.util.QuickTranslateEngine
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import splitties.init.appCtx
import splitties.systemservices.notificationManager

class AiScanService : BaseService() {

    companion object {
        private const val EXTRA_BOOK_URL = "bookUrl"
        private const val EXTRA_FROM_INDEX = "fromIndex"

        val isScanningFlow = MutableStateFlow(false)
        val scanProgressFlow = MutableStateFlow("")
        val scanBookUrlFlow = MutableStateFlow<String?>(null)

        fun start(context: Context, bookUrl: String, fromIndex: Int) {
            val intent = Intent(context, AiScanService::class.java).apply {
                action = IntentAction.start
                putExtra(EXTRA_BOOK_URL, bookUrl)
                putExtra(EXTRA_FROM_INDEX, fromIndex)
            }
            context.startForegroundServiceCompat(intent)
        }

        fun stop(context: Context) {
            val intent = Intent(context, AiScanService::class.java).apply {
                action = IntentAction.stop
            }
            context.startService(intent)
        }
    }

    private var scanJob: Job? = null
    private var notificationMsg = appCtx.getString(R.string.service_starting)
    private var progressMax = 0
    private var progressCurrent = 0

    private val notificationBuilder by lazy {
        NotificationCompat.Builder(this, AppConst.channelIdDownload)
            .setSmallIcon(R.drawable.ic_download)
            .setOngoing(true)
            .setOnlyAlertOnce(true)
            .setContentTitle("Đang quét từ điển bằng AI...")
            .setContentText(notificationMsg)
            .addAction(
                R.drawable.ic_stop_black_24dp,
                getString(R.string.cancel),
                servicePendingIntent<AiScanService>(IntentAction.stop)
            )
            .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
    }

    override fun startForegroundNotification() {
        notificationBuilder.setContentText(notificationMsg)
        notificationBuilder.setProgress(progressMax, progressCurrent, false)
        startForeground(NotificationId.AiScanService, notificationBuilder.build())
    }

    private fun upNotification() {
        notificationBuilder.setContentText(notificationMsg)
        notificationBuilder.setProgress(progressMax, progressCurrent, false)
        notificationManager.notify(NotificationId.AiScanService, notificationBuilder.build())
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        when (intent?.action) {
            IntentAction.start -> {
                val bookUrl = intent.getStringExtra(EXTRA_BOOK_URL)
                val fromIndex = intent.getIntExtra(EXTRA_FROM_INDEX, -1)
                if (bookUrl != null) {
                    startScan(bookUrl, fromIndex)
                } else {
                    stopSelf()
                }
            }
            IntentAction.stop -> {
                stopScan()
            }
        }
        return super.onStartCommand(intent, flags, startId)
    }

    private fun startScan(bookUrl: String, fromIndex: Int) {
        scanJob?.cancel()
        scanBookUrlFlow.value = bookUrl
        isScanningFlow.value = true

        scanJob = lifecycleScope.launch(Dispatchers.IO) {
            try {
                val book = appDb.bookDao.getBook(bookUrl) ?: return@launch
                val bookKey = MD5Utils.md5Encode16(book.bookUrl)
                val allChapters = appDb.bookChapterDao.getChapterList(book.bookUrl)
                val downloadedChapters = allChapters.filter { BookHelp.hasContent(book, it) }

                val chaptersToScan = downloadedChapters.filter { it.index > fromIndex }
                if (chaptersToScan.isEmpty()) {
                    withContext(Dispatchers.Main) {
                        toastOnUi("Không có chương mới nào cần quét")
                    }
                    return@launch
                }

                progressMax = chaptersToScan.size
                progressCurrent = 0
                notificationMsg = "Bắt đầu quét..."
                upNotification()

                for ((index, chapter) in chaptersToScan.withIndex()) {
                    if (!isActive) break

                    progressCurrent = index + 1
                    val progressText = "Đang quét: $progressCurrent/$progressMax (${chapter.title})"
                    notificationMsg = progressText
                    scanProgressFlow.value = progressText
                    upNotification()

                    try {
                        // AI scanning function
                        TranslationManager.scanAndSaveNamesWithAi(book, chapter)
                        // Reload private dictionary into RAM
                        QuickTranslateEngine.initBookPrivateDict(appCtx, bookKey)
                        // Clear translation cache for this chapter
                        TranslationManager.deleteTranslationCache(book, chapter)

                        // Save the last successfully scanned chapter index
                        appCtx.putPrefInt("ai_scan_last_index_${bookKey}", chapter.index)

                        // Clear cache on main thread if chapter is current
                        withContext(Dispatchers.Main) {
                            TranslateUtils.clearCache()
                            if (chapter.index == ReadBook.durChapterIndex) {
                                ReadBook.loadContent(false)
                            }
                        }
                    } catch (e: Exception) {
                        // Skip error for specific chapter
                    }
                }

                // Delete old translations for book after completing scanning
                TranslationManager.clearBookTranslationCache(book)
                withContext(Dispatchers.Main) {
                    toastOnUi("Đã quét AI hoàn tất toàn bộ chương đã chọn!")
                }
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    toastOnUi("Lỗi quét AI: ${e.message}")
                }
            } finally {
                withContext(Dispatchers.Main) {
                    isScanningFlow.value = false
                    scanProgressFlow.value = ""
                    scanBookUrlFlow.value = null
                    stopSelf()
                }
            }
        }
    }

    private fun stopScan() {
        scanJob?.cancel()
        isScanningFlow.value = false
        scanProgressFlow.value = ""
        scanBookUrlFlow.value = null
        stopSelf()
    }

    override fun onDestroy() {
        super.onDestroy()
        scanJob?.cancel()
    }
}
