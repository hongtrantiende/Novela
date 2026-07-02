package io.legado.app.service

import android.annotation.SuppressLint
import android.app.PendingIntent
import android.net.Uri
import androidx.core.net.toUri
import androidx.lifecycle.lifecycleScope
import androidx.media3.common.C
import androidx.media3.common.MediaItem
import androidx.media3.common.PlaybackException
import androidx.media3.common.PlaybackParameters
import androidx.media3.common.Player
import androidx.media3.common.Timeline
import androidx.media3.database.StandaloneDatabaseProvider
import androidx.media3.datasource.DataSource
import androidx.media3.datasource.cache.CacheDataSink
import androidx.media3.datasource.cache.CacheDataSource
import androidx.media3.datasource.cache.LeastRecentlyUsedCacheEvictor
import androidx.media3.datasource.cache.SimpleCache
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.exoplayer.offline.DefaultDownloaderFactory
import androidx.media3.exoplayer.offline.DownloadRequest
import androidx.media3.exoplayer.offline.Downloader
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory
import androidx.media3.exoplayer.source.MediaSource
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
import com.script.ScriptException
import io.legado.app.R
import io.legado.app.constant.AppLog
import io.legado.app.constant.AppPattern
import io.legado.app.data.appDb
import io.legado.app.data.entities.Book
import io.legado.app.data.entities.BookChapter
import io.legado.app.data.entities.HttpTTS
import io.legado.app.exception.NoStackTraceException
import io.legado.app.help.book.BookHelp
import io.legado.app.help.coroutine.Coroutine
import io.legado.app.help.exoplayer.InputStreamDataSource
import io.legado.app.help.http.okHttpClient
import io.legado.app.model.ReadAloud
import io.legado.app.model.ReadBook
import io.legado.app.model.analyzeRule.AnalyzeUrl
import io.legado.app.ui.book.read.page.entities.TextChapter
import io.legado.app.ui.config.readConfig.ReadConfig
import io.legado.app.utils.FileUtils
import io.legado.app.utils.MD5Utils
import io.legado.app.utils.printOnDebug
import io.legado.app.utils.servicePendingIntent
import io.legado.app.utils.toastOnUi
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.Job
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.delay
import kotlinx.coroutines.ensureActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import okhttp3.Response
import org.mozilla.javascript.WrappedException
import splitties.init.appCtx
import java.io.File
import java.io.InputStream
import java.net.ConnectException
import java.net.SocketTimeoutException

/**
 * 在线朗读
 */
@SuppressLint("UnsafeOptInUsageError")
class HttpReadAloudService : BaseReadAloudService(),
    Player.Listener {
    private val exoPlayer: ExoPlayer by lazy {
        ExoPlayer.Builder(this).build()
    }

    // 改为外部存储
    private val ttsFolderPath: String by lazy {
        val baseDir = externalCacheDir ?: cacheDir
        baseDir.absolutePath + File.separator + "httpTTS" + File.separator
    }

    private val cache by lazy {
        val baseDir = externalCacheDir ?: cacheDir
        SimpleCache(
            File(baseDir, "httpTTS_cache"),
            LeastRecentlyUsedCacheEvictor(128 * 1024 * 1024),
            StandaloneDatabaseProvider(appCtx)
        )
    }
    private val cacheDataSinkFactory by lazy {
        CacheDataSink.Factory()
            .setCache(cache)
    }
    private val loadErrorHandlingPolicy by lazy {
        CustomLoadErrorHandlingPolicy()
    }
    private var speechRate: Int = ReadConfig.speechRatePlay + 5
    private var downloadTask: Coroutine<*>? = null
    private var playIndexJob: Job? = null
    private var downloadErrorNo: Int = 0
    private var playErrorNo = 0
    private val downloadTaskActiveLock = Mutex()
    private val downloadingFiles = java.util.Collections.synchronizedSet(HashSet<String>())
    private var preDownloadWindowJob: Job? = null
    private var playNextJob: Job? = null
    private val cachedFiles = java.util.Collections.synchronizedSet(HashSet<String>())

    private fun initCachedFiles() {
        Coroutine.async {
            val files = FileUtils.listDirsAndFiles(ttsFolderPath)
            if (files != null) {
                for (file in files) {
                    if (file.isFile && file.name.endsWith(".mp3")) {
                        val nameWithoutExt = file.name.substringBeforeLast(".")
                        cachedFiles.add(nameWithoutExt)
                    }
                }
            }
        }
    }

    override fun onCreate() {
        super.onCreate()
        exoPlayer.addListener(this)
        initCachedFiles()
    }

    override fun isParagraphCached(index: Int): Boolean {
        if (index !in contentList.indices) return false
        var text = contentList[index]
        if (paragraphStartPos > 0 && index == nowSpeak) {
            text = text.substring(paragraphStartPos)
        }
        val fileName = md5SpeakFileName(text)
        return cachedFiles.contains(fileName) || hasSpeakFile(fileName)
    }

    override fun isParagraphDownloading(index: Int): Boolean {
        if (index !in contentList.indices) return false
        var text = contentList[index]
        if (paragraphStartPos > 0 && index == nowSpeak) {
            text = text.substring(paragraphStartPos)
        }
        val fileName = md5SpeakFileName(text)
        return downloadingFiles.contains(fileName)
    }

    override fun onDestroy() {
        super.onDestroy()
        downloadTask?.cancel()
        playNextJob?.cancel()
        preDownloadWindowJob?.cancel()
        exoPlayer.release()
        cache.release()
        Coroutine.async {
            removeCacheFile()
        }
    }

    override fun play() {
        pageChanged = false
        exoPlayer.stop()
        if (!requestFocus()) return
        if (contentList.isEmpty()) {
            AppLog.putDebug("Danh sách đọc trống")
            ReadBook.readAloud()
        } else {
            super.play()
            if (ReadConfig.streamReadAloudAudio) {
                downloadAndPlayAudiosStream()
            } else {
                downloadAndPlayAudios()
            }
            startPreDownloadWindow()
        }
    }

    override fun playStop() {
        exoPlayer.stop()
        playIndexJob?.cancel()
    }

    private fun updateNextPos() {
        readAloudNumber += contentList[nowSpeak].length + 1 - paragraphStartPos
        paragraphStartPos = 0
        if (nowSpeak < contentList.lastIndex) {
            nowSpeak++
            startPreDownloadWindow()
        } else {
            nextChapter()
        }
    }

    private fun downloadAndPlayAudios() {
        downloadTask?.cancel()
        downloadTask = execute {
            downloadTaskActiveLock.withLock {
                ensureActive()
                val httpTts = ReadAloud.httpTTS ?: throw NoStackTraceException("tts is null")
                
                val preloadCount = maxOf(1, minOf(ReadConfig.audioPreDownloadNum, contentList.size - nowSpeak))
                var preloadedNum = 0

                for (index in nowSpeak until contentList.size) {
                    ensureActive()
                    val content = contentList[index]
                    var text = content
                    if (paragraphStartPos > 0 && index == nowSpeak) {
                        text = text.substring(paragraphStartPos)
                    }
                    val fileName = md5SpeakFileName(text)
                    val speakText = text.replace(AppPattern.notReadAloudRegex, "")
                    if (speakText.isEmpty()) {
                        createSilentSound(fileName)
                    } else {
                        val success = downloadSpeakFile(httpTts, fileName, speakText, waitIfDownloading = true)
                        if (!success && !hasSpeakFile(fileName)) {
                            pauseReadAloud()
                            return@execute
                        }
                    }
                    
                    preloadedNum++
                    if (preloadedNum == preloadCount) {
                        launch(Main) {
                            playCurrentParagraph()
                        }
                    }
                }
                preDownloadAudios(httpTts)
            }
        }.onError {
            AppLog.put("Lỗi tải xuống đọc to\n${it.localizedMessage}", it, true)
        }
    }

    // 辅助方法：确保能读到文件
    private fun getChapterContent(book: Book, chapter: BookChapter): String? {
        return BookHelp.getContent(book, chapter)
    }

    private suspend fun downloadSpeakFile(
        httpTts: HttpTTS,
        fileName: String,
        speakText: String,
        waitIfDownloading: Boolean = true
    ): Boolean {
        if (hasSpeakFile(fileName)) return true
        if (downloadingFiles.contains(fileName)) {
            if (waitIfDownloading) {
                while (downloadingFiles.contains(fileName)) {
                    delay(50)
                }
                return hasSpeakFile(fileName)
            } else {
                return false
            }
        }
        if (!downloadingFiles.add(fileName)) {
            if (waitIfDownloading) {
                while (downloadingFiles.contains(fileName)) {
                    delay(50)
                }
                return hasSpeakFile(fileName)
            } else {
                return false
            }
        }
        try {
            if (hasSpeakFile(fileName)) return true
            val inputStream = getSpeakStream(httpTts, speakText)
            if (inputStream != null) {
                createSpeakFile(fileName, inputStream)
                return true
            } else {
                createSilentSound(fileName)
                return true
            }
        } catch (e: Exception) {
            AppLog.put("Lỗi tải xuống segment $fileName: ${e.localizedMessage}", e)
            return false
        } finally {
            downloadingFiles.remove(fileName)
        }
    }

    private fun startPreDownloadWindow() {
        preDownloadWindowJob?.cancel()
        val httpTts = ReadAloud.httpTTS ?: return
        preDownloadWindowJob = lifecycleScope.launch(Dispatchers.IO) {
            runCatching {
                val book = ReadBook.book ?: return@launch
                val currentChapterIdx = ReadBook.durChapterIndex
                val currentTextChapter = textChapter ?: return@launch
                val currentContentList = contentList.toList()
                val currentNowSpeak = nowSpeak
                
                val startIdx = currentNowSpeak
                val endIdx = currentNowSpeak + 5
                
                val jobs = mutableListOf<Job>()
                for (idx in startIdx..endIdx) {
                    val job = launch {
                        ensureActive()
                        if (idx in currentContentList.indices) {
                            val content = currentContentList[idx]
                            val fileName = md5SpeakFileName(content, currentTextChapter)
                            val speakText = content.replace(AppPattern.notReadAloudRegex, "")
                            
                            if (ReadConfig.streamReadAloudAudio) {
                                val dataSourceFactory = createDataSourceFactory(httpTts, speakText)
                                val downloader = createDownloader(dataSourceFactory, fileName)
                                runCatching {
                                    downloader.download(null)
                                }
                            } else {
                                downloadSpeakFile(httpTts, fileName, speakText, waitIfDownloading = false)
                            }
                        } else {
                            val nextChapterOffset = idx - currentContentList.size
                            val targetChapterIdx = currentChapterIdx + 1
                            val nextChapter = appDb.bookChapterDao.getChapter(book.bookUrl, targetChapterIdx) ?: return@launch
                            val nextChapterContent = getChapterContent(book, nextChapter)
                            if (!nextChapterContent.isNullOrEmpty()) {
                                val nextContentList = nextChapterContent.split("\n").filter { it.isNotEmpty() }
                                if (nextChapterOffset in nextContentList.indices) {
                                    val content = nextContentList[nextChapterOffset]
                                    val titleMd5 = MD5Utils.md5Encode16(nextChapter.title)
                                    val contentMd5 = MD5Utils.md5Encode16("${httpTts.url}-|-10-|-$content")
                                    val fileName = "${titleMd5}_${contentMd5}"
                                    val speakText = content.replace(AppPattern.notReadAloudRegex, "")
                                    
                                    if (ReadConfig.streamReadAloudAudio) {
                                        val dataSourceFactory = createDataSourceFactory(httpTts, speakText)
                                        val downloader = createDownloader(dataSourceFactory, fileName)
                                        runCatching {
                                            downloader.download(null)
                                        }
                                    } else {
                                        downloadSpeakFile(httpTts, fileName, speakText, waitIfDownloading = false)
                                    }
                                }
                            }
                        }
                    }
                    jobs.add(job)
                }
                jobs.forEach { it.join() }
            }
        }
    }

    private suspend fun preDownloadAudios(httpTts: HttpTTS) {
        val book = ReadBook.book ?: return
        val currentIdx = ReadBook.durChapterIndex
        
        try {
            currentCoroutineContext().ensureActive()
            
            val targetIndex = currentIdx + 1
            val chapter = appDb.bookChapterDao.getChapter(book.bookUrl, targetIndex) ?: return
            
            val contentString = getChapterContent(book, chapter)
            if (contentString.isNullOrEmpty()) return

            val contentList = contentString.split("\n").filter { it.isNotEmpty() }.take(10)

            contentList.forEach { content ->
                currentCoroutineContext().ensureActive()
                
                val titleMd5 = MD5Utils.md5Encode16(chapter.title)
                val contentMd5 = MD5Utils.md5Encode16("${ReadAloud.httpTTS?.url}-|-10-|-$content")
                val fileName = "${titleMd5}_${contentMd5}"
                
                val speakText = content.replace(AppPattern.notReadAloudRegex, "")
                if (speakText.isEmpty()) {
                    createSilentSound(fileName)
                } else {
                    downloadSpeakFile(httpTts, fileName, speakText, waitIfDownloading = false)
                }
            }
        } catch (e: Exception) {
            AppLog.put("Ngoại lệ tải xuống trước sách nói: ${e.localizedMessage}", e)
        }
    }

    private fun downloadAndPlayAudiosStream() {
        downloadTask?.cancel()
        downloadTask = execute {
            downloadTaskActiveLock.withLock {
                ensureActive()
                val httpTts = ReadAloud.httpTTS ?: throw NoStackTraceException("tts is null")
                val downloaderChannel = Channel<Downloader>()
                launch {
                    for (downloader in downloaderChannel) {
                        downloader.download(null)
                    }
                }

                val preloadCount = maxOf(1, minOf(ReadConfig.audioPreDownloadNum, contentList.size - nowSpeak))
                var preloadedNum = 0

                for (index in nowSpeak until contentList.size) {
                    ensureActive()
                    val content = contentList[index]
                    var text = content
                    if (paragraphStartPos > 0 && index == nowSpeak) {
                        text = text.substring(paragraphStartPos)
                    }
                    val speakText = text.replace(AppPattern.notReadAloudRegex, "")
                    if (speakText.isEmpty()) {
                        AppLog.put("Nội dung của đoạn đọc trống và âm thanh im lặng được sử dụng thay thế.\nNói văn bản: $speakText")
                    }
                    val fileName = md5SpeakFileName(text)
                    val dataSourceFactory = createDataSourceFactory(httpTts, speakText)
                    val downloader = createDownloader(dataSourceFactory, fileName)
                    
                    preloadedNum++
                    if (preloadedNum <= preloadCount) {
                        runCatching {
                            downloader.download(null)
                        }
                        if (preloadedNum == preloadCount) {
                            launch(Main) {
                                playCurrentParagraph()
                            }
                        }
                    } else {
                        downloaderChannel.send(downloader)
                    }
                }
                preDownloadAudiosStream(httpTts, downloaderChannel)
            }
        }.onError {
            AppLog.put("Lỗi tải xuống đọc to\n${it.localizedMessage}", it, true)
        }
    }

    private suspend fun preDownloadAudiosStream(
        httpTts: HttpTTS,
        downloaderChannel: Channel<Downloader>
    ) {
        val book = ReadBook.book ?: return
        val currentIdx = ReadBook.durChapterIndex
        
        try {
            currentCoroutineContext().ensureActive()
            val targetIndex = currentIdx + 1
            val chapter = appDb.bookChapterDao.getChapter(book.bookUrl, targetIndex) ?: return
            
            val contentString = getChapterContent(book, chapter)
            if (contentString.isNullOrEmpty()) return

            val contentList = contentString.split("\n").filter { it.isNotEmpty() }.take(10)
            
            contentList.forEach { content ->
                currentCoroutineContext().ensureActive()
                val titleMd5 = MD5Utils.md5Encode16(chapter.title)
                val contentMd5 = MD5Utils.md5Encode16("${ReadAloud.httpTTS?.url}-|-10-|-$content")
                val fileName = "${titleMd5}_${contentMd5}"
                
                val speakText = content.replace(AppPattern.notReadAloudRegex, "")
                val dataSourceFactory = createDataSourceFactory(httpTts, speakText)
                val downloader = createDownloader(dataSourceFactory, fileName)
                downloaderChannel.send(downloader)
            }
        } catch (e: Exception) {
            AppLog.put("Ngoại lệ tải xuống trước khi phát trực tuyến sách nói: ${e.localizedMessage}", e)
        }
    }

    private fun createDataSourceFactory(
        httpTts: HttpTTS,
        speakText: String
    ): CacheDataSource.Factory {
        val upstreamFactory = DataSource.Factory {
            InputStreamDataSource {
                if (speakText.isEmpty()) {
                    null
                } else {
                    kotlin.runCatching {
                        runBlocking(lifecycleScope.coroutineContext[Job]!!) {
                            getSpeakStream(httpTts, speakText)
                        }
                    }.onFailure {
                        when (it) {
                            is InterruptedException,
                            is CancellationException -> Unit

                            else -> pauseReadAloud()
                        }
                    }.getOrThrow()
                } ?: resources.openRawResource(R.raw.silent_sound)
            }
        }
        val factory = CacheDataSource.Factory()
            .setCache(cache)
            .setUpstreamDataSourceFactory(upstreamFactory)
            .setCacheWriteDataSinkFactory(cacheDataSinkFactory)
        return factory
    }

    private fun createDownloader(factory: CacheDataSource.Factory, fileName: String): Downloader {
        val uri = fileName.toUri()
        val request = DownloadRequest.Builder(fileName, uri).build()
        return DefaultDownloaderFactory(factory, okHttpClient.dispatcher.executorService)
            .createDownloader(request)
    }

    private fun createMediaSource(factory: DataSource.Factory, fileName: String): MediaSource {
        return DefaultMediaSourceFactory(this)
            .setDataSourceFactory(factory)
            .setLoadErrorHandlingPolicy(loadErrorHandlingPolicy)
            .createMediaSource(MediaItem.fromUri(fileName))
    }

    private suspend fun getSpeakStream(
        httpTts: HttpTTS,
        speakText: String
    ): InputStream? {
        while (true) {
            try {
                val analyzeUrl = AnalyzeUrl(
                    httpTts.url,
                    speakText = speakText,
                    speakSpeed = (httpTts.loginUrl?.toFloatOrNull()?.let { (it * 10).toInt() } ?: 10),
                    source = httpTts,
                    readTimeout = 300 * 1000L,
                    coroutineContext = currentCoroutineContext()
                )
                var response = analyzeUrl.getResponseAwait()
                currentCoroutineContext().ensureActive()
                val checkJs = httpTts.loginCheckJs
                if (checkJs?.isNotBlank() == true) {
                    response = analyzeUrl.evalJS(checkJs, response) as Response
                }
                response.headers["Content-Type"]?.let { contentType ->
                    val contentType = contentType.substringBefore(";")
                    val ct = httpTts.contentType
                    if (contentType == "application/json" || contentType.startsWith("text/")) {
                        throw NoStackTraceException(response.body.string())
                    } else if (ct?.isNotBlank() == true) {
                        if (!contentType.matches(ct.toRegex())) {
                            throw NoStackTraceException(
                                "Máy chủ TTS trả về lỗi:" + response.body.string()
                            )
                        }
                    }
                }
                currentCoroutineContext().ensureActive()
                response.body.byteStream().let { stream ->
                    downloadErrorNo = 0
                    return stream
                }
            } catch (e: Exception) {
                when (e) {
                    is CancellationException -> throw e
                    is ScriptException, is WrappedException -> {
                        AppLog.put("lỗi js\n${e.localizedMessage}", e, true)
                        e.printOnDebug()
                        throw e
                    }

                    is SocketTimeoutException, is ConnectException -> {
                        downloadErrorNo++
                        if (downloadErrorNo > 5) {
                            val msg = "tts hết thời gian chờ hoặc lỗi kết nối hơn 5 lần\n${e.localizedMessage}"
                            AppLog.put(msg, e, true)
                            throw e
                        }
                    }

                    else -> {
                        downloadErrorNo++
                        val msg = "lỗi tải xuống tts\n${e.localizedMessage}"
                        AppLog.put(msg, e)
                        e.printOnDebug()
                        if (downloadErrorNo > 5) {
                            val msg1 = "Máy chủ TTS đã nhận được 5 lỗi liên tiếp và việc đọc đã bị tạm dừng."
                            AppLog.put(msg1, e, true)
                            throw e
                        } else {
                            AppLog.put("Lỗi âm thanh tải xuống TTS, thay vào đó hãy sử dụng âm thanh im lặng.\nNói văn bản: $speakText")
                            break
                        }
                    }
                }
            }
        }
        return null
    }

    /**
     * 生成音频文件名
     */
    private fun md5SpeakFileName(content: String, textChapter: TextChapter? = this.textChapter): String {
        val titleToUse = textChapter?.chapter?.title ?: ""
        return MD5Utils.md5Encode16(titleToUse) + "_" +
                MD5Utils.md5Encode16("${ReadAloud.httpTTS?.url}-|-10-|-$content")
    }

    private fun createSilentSound(fileName: String) {
        val file = createSpeakFile(fileName)
        file.writeBytes(resources.openRawResource(R.raw.silent_sound).readBytes())
    }

    private fun hasSpeakFile(name: String): Boolean {
        return FileUtils.exist("${ttsFolderPath}$name.mp3")
    }

    private fun getSpeakFileAsMd5(name: String): File {
        return File("${ttsFolderPath}$name.mp3")
    }

    private fun createSpeakFile(name: String): File {
        cachedFiles.add(name)
        return FileUtils.createFileIfNotExist("${ttsFolderPath}$name.mp3")
    }

    private fun createSpeakFile(name: String, inputStream: InputStream) {
        cachedFiles.add(name)
        FileUtils.createFileIfNotExist("${ttsFolderPath}$name.mp3").outputStream().use { out ->
            inputStream.use {
                it.copyTo(out)
            }
        }
    }

    /**
     * 移除缓存文件
     * 如果时间设置为0，则不再保护当前章节，退出即全删。
     */
    private fun removeCacheFile() {
        val keepTime = ReadConfig.audioCacheCleanTime
        // 只有当时间大于0时，才需要保护当前章节。如果为0，说明用户想彻底不留缓存。
        val protectCurrentChapter = keepTime > 0
        val titleMd5 = if (protectCurrentChapter) MD5Utils.md5Encode16(this.textChapter?.chapter?.title ?: "") else ""

        FileUtils.listDirsAndFiles(ttsFolderPath)?.forEach {
            val isSilentSound = it.length() == 2160L

            // 判断逻辑：
            // 1. 如果是无声文件 -> 删
            // 2. 如果保留时间设为0 -> 删 (不管是不是当前章节)
            // 3. 如果保留时间>0 -> 保护当前章节，且只删过期的
            val shouldDelete = if (keepTime == 0L) {
                // 模式：即听即焚 (保留时间0)
                true
            } else {
                // 模式：保留一段时间
                // 条件：(不是当前章节) 且 (时间过期了)
                !it.name.startsWith(titleMd5) && (System.currentTimeMillis() - it.lastModified() > keepTime)
            }

            if (shouldDelete || isSilentSound) {
                FileUtils.delete(it.absolutePath)
                cachedFiles.remove(it.name.substringBeforeLast("."))
            }
        }
    }


    override fun pauseReadAloud(abandonFocus: Boolean) {
        super.pauseReadAloud(abandonFocus)
        kotlin.runCatching {
            playIndexJob?.cancel()
            playNextJob?.cancel()
            preDownloadWindowJob?.cancel()
            exoPlayer.pause()
        }
    }

    override fun resumeReadAloud() {
        super.resumeReadAloud()
        kotlin.runCatching {
            if (pageChanged) {
                play()
            } else {
                exoPlayer.play()
                upPlayPos()
                startPreDownloadWindow()
            }
        }
    }

    private fun upPlayPos() {
        playIndexJob?.cancel()
        val textChapter = textChapter ?: return
        playIndexJob = lifecycleScope.launch {
            upTtsProgress(readAloudNumber + 1)
            if (exoPlayer.duration <= 0) {
                return@launch
            }
            val speakTextLength = contentList[nowSpeak].length
            if (speakTextLength <= 0) {
                return@launch
            }
            val sleep = exoPlayer.duration / speakTextLength
            val start = speakTextLength * exoPlayer.currentPosition / exoPlayer.duration
            for (i in start..contentList[nowSpeak].length) {
                if (pageIndex + 1 < textChapter.pageSize
                    && readAloudNumber + i > textChapter.getReadLength(pageIndex + 1)
                ) {
                    pageIndex++
                    ReadBook.moveToNextPage()
                    upTtsProgress(readAloudNumber + i.toInt())
                }
                delay(sleep)
            }
        }
    }

    /**
     * 更新朗读速度
     */
    override fun upSpeechRate(reset: Boolean) {
        speechRate = ReadConfig.speechRatePlay + 5
        val speedMultiplier = speechRate.toFloat() / 10f
        val pitchMultiplier = getPitchMultiplier()
        exoPlayer.playbackParameters = PlaybackParameters(speedMultiplier, pitchMultiplier)
    }

    override fun onPlaybackStateChanged(playbackState: Int) {
        super.onPlaybackStateChanged(playbackState)
        when (playbackState) {
            Player.STATE_IDLE -> {
                // 空闲
            }

            Player.STATE_BUFFERING -> {
                // 缓冲中
            }

            Player.STATE_READY -> {
                // 准备好
                if (pause) return
                exoPlayer.play()
                upPlayPos()
            }

            Player.STATE_ENDED -> {
                // 结束
                playErrorNo = 0
                updateNextPos()
                playNextParagraph()
            }
        }
    }

    override fun onTimelineChanged(timeline: Timeline, reason: Int) {
        when (reason) {
            Player.TIMELINE_CHANGE_REASON_PLAYLIST_CHANGED -> {
                if (!timeline.isEmpty && exoPlayer.playbackState == Player.STATE_IDLE) {
                    exoPlayer.prepare()
                }
            }

            else -> {}
        }
    }

    override fun onMediaItemTransition(mediaItem: MediaItem?, reason: Int) {
        // No-op for single-item playback loop
    }

    override fun onPlayerError(error: PlaybackException) {
        super.onPlayerError(error)
        AppLog.put("Lỗi đọc\n${contentList[nowSpeak]}", error)
        deleteCurrentSpeakFile()
        playErrorNo++
        if (playErrorNo >= 5) {
            toastOnUi("Đọc 5 lỗi liên tiếp, mã lỗi cuối cùng (${error.localizedMessage})")
            AppLog.put("Đọc 5 lỗi liên tiếp, mã lỗi cuối cùng (${error.localizedMessage})", error)
            pauseReadAloud()
        } else {
            updateNextPos()
            playNextParagraph()
        }
    }

    private fun deleteCurrentSpeakFile() {
        if (ReadConfig.streamReadAloudAudio) {
            return
        }
        val mediaItem = exoPlayer.currentMediaItem ?: return
        val filePath = mediaItem.localConfiguration!!.uri.path!!
        val file = File(filePath)
        file.delete()
        cachedFiles.remove(file.name.substringBeforeLast("."))
    }

    override fun aloudServicePendingIntent(actionStr: String): PendingIntent? {
        return servicePendingIntent<HttpReadAloudService>(actionStr)
    }

    class CustomLoadErrorHandlingPolicy : DefaultLoadErrorHandlingPolicy(0) {
        override fun getRetryDelayMsFor(loadErrorInfo: LoadErrorHandlingPolicy.LoadErrorInfo): Long {
            return C.TIME_UNSET
        }
    }

    private fun playCurrentParagraph() {
        exoPlayer.stop()
        exoPlayer.clearMediaItems()
        
        val httpTts = ReadAloud.httpTTS ?: return
        val index = nowSpeak
        if (index !in contentList.indices) return
        
        val content = contentList[index]
        var text = content
        if (paragraphStartPos > 0 && index == nowSpeak) {
            text = text.substring(paragraphStartPos)
        }
        val fileName = md5SpeakFileName(text)
        val speakText = text.replace(AppPattern.notReadAloudRegex, "")
        
        val speedMultiplier = speechRate.toFloat() / 10f
        val pitchMultiplier = getPitchMultiplier()
        exoPlayer.playbackParameters = PlaybackParameters(speedMultiplier, pitchMultiplier)
        
        if (ReadConfig.streamReadAloudAudio) {
            val dataSourceFactory = createDataSourceFactory(httpTts, speakText)
            val mediaSource = createMediaSource(dataSourceFactory, fileName)
            exoPlayer.setMediaSource(mediaSource)
            exoPlayer.prepare()
        } else {
            execute {
                if (speakText.isEmpty()) {
                    createSilentSound(fileName)
                } else {
                    downloadSpeakFile(httpTts, fileName, speakText, waitIfDownloading = true)
                }
                
                val file = getSpeakFileAsMd5(fileName)
                val mediaItem = MediaItem.fromUri(Uri.fromFile(file))
                
                launch(Main) {
                    exoPlayer.setMediaItem(mediaItem)
                    exoPlayer.prepare()
                }
            }
        }
    }

    private fun playNextParagraph() {
        playNextJob?.cancel()
        playNextJob = lifecycleScope.launch {
            val interval = ReadConfig.readAloudParagraphInterval
            if (interval > 0) {
                delay(interval.toLong())
            }
            if (!pause) {
                if (nowSpeak in contentList.indices) {
                    playCurrentParagraph()
                } else {
                    nextChapter()
                }
            }
        }
    }

    override fun nextChapter() {
        val chapterTitle = this.textChapter?.chapter?.title ?: ""
        super.nextChapter()
        if (chapterTitle.isNotEmpty()) {
            Coroutine.async {
                val titleMd5 = MD5Utils.md5Encode16(chapterTitle)
                FileUtils.listDirsAndFiles(ttsFolderPath)?.forEach {
                    if (it.isFile && it.name.startsWith(titleMd5)) {
                        FileUtils.delete(it.absolutePath)
                        cachedFiles.remove(it.name.substringBeforeLast("."))
                    }
                }
            }
        }
    }

    private fun getPitchMultiplier(): Float {
        val httpTts = ReadAloud.httpTTS ?: return 1.0f
        val isChirp3Voice = httpTts.name.contains("Chirp3-HD", ignoreCase = true) || (httpTts.id in -138..-109)
        return if (isChirp3Voice) 0.92f else 1.0f
    }

}
