package io.legado.app.service

import android.app.PendingIntent
import android.speech.tts.TextToSpeech
import android.speech.tts.UtteranceProgressListener
import io.legado.app.R
import io.legado.app.constant.AppConst
import io.legado.app.constant.AppLog
import io.legado.app.constant.AppPattern
import io.legado.app.exception.NoStackTraceException
import io.legado.app.help.MediaHelp
import io.legado.app.help.config.AppConfig
import io.legado.app.ui.config.readConfig.ReadConfig
import io.legado.app.help.coroutine.Coroutine
import io.legado.app.lib.dialogs.SelectItem
import io.legado.app.model.ReadAloud
import io.legado.app.model.ReadBook
import io.legado.app.utils.GSON
import io.legado.app.utils.LogUtils
import io.legado.app.utils.fromJsonObject
import io.legado.app.utils.servicePendingIntent
import io.legado.app.utils.toastOnUi
import kotlinx.coroutines.delay
import kotlinx.coroutines.ensureActive

/**
 * 本地朗读
 */
class TTSReadAloudService : BaseReadAloudService(), TextToSpeech.OnInitListener {

    private var textToSpeech: TextToSpeech? = null
    private var ttsInitFinish = false
    private val ttsUtteranceListener = TTSUtteranceListener()
    private var speakJob: Coroutine<*>? = null
    private val TAG = "TTSReadAloudService"

    override fun onCreate() {
        super.onCreate()
        initTts()
    }

    override fun onDestroy() {
        super.onDestroy()
        clearTTS()
    }

    @Synchronized
    private fun initTts() {
        ttsInitFinish = false
        val engine = GSON.fromJsonObject<SelectItem<String>>(ReadAloud.ttsEngine).getOrNull()?.value
        LogUtils.d(TAG, "initTts engine:$engine")
        textToSpeech = if (engine.isNullOrBlank()) {
            TextToSpeech(this, this)
        } else {
            TextToSpeech(this, this, engine)
        }
        upSpeechRate()
    }

    @Synchronized
    fun clearTTS() {
        textToSpeech?.runCatching {
            stop()
            shutdown()
        }
        textToSpeech = null
        ttsInitFinish = false
    }

    private fun setupLanguageAndVoice(tts: TextToSpeech, text: String) {
        try {
            val viLocale = java.util.Locale.forLanguageTag("vi-VN")
            if (isVietnamese(text)) {
                val isViAvailable = tts.isLanguageAvailable(viLocale)
                if (isViAvailable != TextToSpeech.LANG_MISSING_DATA && isViAvailable != TextToSpeech.LANG_NOT_SUPPORTED) {
                    tts.language = viLocale
                }
            } else {
                tts.language = java.util.Locale.getDefault()
            }
        } catch (e: Exception) {
            LogUtils.e(TAG, "Error in setupLanguageAndVoice: ${e.localizedMessage}")
        }
    }

    private fun isVietnamese(text: String): Boolean {
        val viChars = "đĐáàảãạấầẩẫậắằẳẵặéèẻẽẹếềểễệíìỉĩịóòỏõọốồổỗộớờởỡợúùủũụứừửữựýỳỷỹỵ"
        return text.any { viChars.contains(it) }
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            textToSpeech?.let { tts ->
                val sampleText = contentList.take(5).joinToString(" ")
                setupLanguageAndVoice(tts, sampleText)
                tts.setOnUtteranceProgressListener(ttsUtteranceListener)
                ttsInitFinish = true
                play()
            }
        } else {
            toastOnUi(R.string.tts_init_failed)
        }
    }

    @Synchronized
    override fun play() {
        if (!ttsInitFinish) return
        if (!requestFocus()) return
        if (contentList.isEmpty()) {
            AppLog.putDebug("Danh sách đọc trống")
            ReadBook.readAloud()
            return
        }
        super.play()
        MediaHelp.playSilentSound(this@TTSReadAloudService)
        speakJob?.cancel()
        speakJob = execute {
            LogUtils.d(TAG, "Đọc kích thước danh sách ${contentList.size}")
            LogUtils.d(TAG, "Đọc số trang ${textChapter?.pageSize}")
            val tts = textToSpeech ?: throw NoStackTraceException("tts is null")
            
            if (nowSpeak >= contentList.size) {
                playStop()
                delay(1000)
                nextChapter()
                return@execute
            }
            
            var text = contentList[nowSpeak]
            if (paragraphStartPos > 0) {
                text = text.substring(paragraphStartPos)
            }
            
            // Skip non-readable text
            while (text.matches(AppPattern.notReadAloudRegex)) {
                readAloudNumber += contentList[nowSpeak].length + 1 - paragraphStartPos
                paragraphStartPos = 0
                nowSpeak++
                if (nowSpeak >= contentList.size) {
                    playStop()
                    delay(1000)
                    nextChapter()
                    return@execute
                }
                text = contentList[nowSpeak]
            }

            val sampleText = contentList.take(5).joinToString(" ")
            setupLanguageAndVoice(tts, sampleText)

            val result = tts.runCatching {
                speak(text, TextToSpeech.QUEUE_FLUSH, null, AppConst.APP_TAG + nowSpeak)
            }.getOrElse {
                AppLog.put("lỗi tts\n${it.localizedMessage}", it, true)
                TextToSpeech.ERROR
            }
            if (result == TextToSpeech.ERROR) {
                AppLog.put("lỗi tts hãy thử khởi tạo lại")
                clearTTS()
                initTts()
            }
        }.onError {
            AppLog.put("lỗi đọc tts\n${it.localizedMessage}", it, true)
        }
    }

    private fun playNextWithDelay() {
        speakJob?.cancel()
        speakJob = execute {
            val interval = ReadConfig.readAloudParagraphInterval
            if (interval > 0) {
                delay(interval.toLong())
            }
            ensureActive()
            val tts = textToSpeech ?: throw NoStackTraceException("tts is null")
            if (nowSpeak >= contentList.size) {
                playStop()
                delay(1000)
                nextChapter()
                return@execute
            }
            var text = contentList[nowSpeak]
            if (paragraphStartPos > 0) {
                text = text.substring(paragraphStartPos)
            }
            val result = tts.runCatching {
                speak(text, TextToSpeech.QUEUE_FLUSH, null, AppConst.APP_TAG + nowSpeak)
            }.getOrElse {
                AppLog.put("lỗi tts\n${it.localizedMessage}", it, true)
                TextToSpeech.ERROR
            }
            if (result == TextToSpeech.ERROR) {
                AppLog.put("lỗi tts hãy thử khởi tạo lại")
                clearTTS()
                initTts()
            }
        }.onError {
            AppLog.put("lỗi đọc tts\n${it.localizedMessage}", it, true)
        }
    }

    override fun playStop() {
        speakJob?.cancel()
        textToSpeech?.runCatching {
            stop()
        }
    }

    /**
     * 更新朗读速度
     */
    override fun upSpeechRate(reset: Boolean) {
        if (ReadConfig.ttsFollowSys) {
            if (reset) {
                clearTTS()
                initTts()
            }
        } else {
            val speechRate = (ReadConfig.ttsSpeechRate + 5) / 10f
            textToSpeech?.setSpeechRate(speechRate)
        }
    }

    /**
     * 暂停朗读
     */
    override fun pauseReadAloud(abandonFocus: Boolean) {
        super.pauseReadAloud(abandonFocus)
        speakJob?.cancel()
        textToSpeech?.runCatching {
            stop()
        }
    }

    /**
     * 恢复朗读
     */
    override fun resumeReadAloud() {
        super.resumeReadAloud()
        play()
    }

    /**
     * 朗读监听
     */
    private inner class TTSUtteranceListener : UtteranceProgressListener() {

        private val TAG = "TTSUtteranceListener"

        override fun onStart(s: String) {
            if (s.startsWith("silent_")) return
            LogUtils.d(TAG, "onStart nowSpeak:$nowSpeak pageIndex:$pageIndex utteranceId:$s")
            textChapter?.let {
                if (contentList[nowSpeak].matches(AppPattern.notReadAloudRegex)) {
                    nextParagraph()
                }
                if (pageIndex + 1 < it.pageSize
                    && readAloudNumber + 1 > it.getReadLength(pageIndex + 1)
                ) {
                    pageIndex++
                    ReadBook.moveToNextPage()
                }
                upTtsProgress(readAloudNumber + 1)
                upMediaMetadata(showContent = true)
            }
        }

        override fun onDone(s: String) {
            if (s.startsWith("silent_")) return
            LogUtils.d(TAG, "onDone utteranceId:$s")
            nextParagraph()
        }

        override fun onRangeStart(utteranceId: String?, start: Int, end: Int, frame: Int) {
            if (utteranceId?.startsWith("silent_") == true) return
            super.onRangeStart(utteranceId, start, end, frame)
            val msg =
                "onRangeStart nowSpeak:$nowSpeak pageIndex:$pageIndex utteranceId:$utteranceId start:$start end:$end frame:$frame"
            LogUtils.d(TAG, msg)
            textChapter?.let {
                if (pageIndex + 1 < it.pageSize
                    && readAloudNumber + start > it.getReadLength(pageIndex + 1)
                ) {
                    pageIndex++
                    ReadBook.moveToNextPage()
                    upTtsProgress(readAloudNumber + start)
                }
            }
        }

        override fun onError(utteranceId: String?, errorCode: Int) {
            if (utteranceId?.startsWith("silent_") == true) return
            LogUtils.d(
                TAG,
                "onError nowSpeak:$nowSpeak pageIndex:$pageIndex utteranceId:$utteranceId errorCode:$errorCode"
            )
            nextParagraph()
        }

        private fun nextParagraph() {
            //跳过全标点段落
            do {
                readAloudNumber += contentList[nowSpeak].length + 1 - paragraphStartPos
                paragraphStartPos = 0
                nowSpeak++
                if (nowSpeak >= contentList.size) {
                    nextChapter()
                    return
                }
            } while (contentList[nowSpeak].matches(AppPattern.notReadAloudRegex))
            playNextWithDelay()
        }

        @Deprecated("Deprecated in Java")
        override fun onError(s: String) {
            if (s.startsWith("silent_")) return
            LogUtils.d(TAG, "onError nowSpeak:$nowSpeak pageIndex:$pageIndex s:$s")
            nextParagraph()
        }

    }

    override fun aloudServicePendingIntent(actionStr: String): PendingIntent? {
        return servicePendingIntent<TTSReadAloudService>(actionStr)
    }

}