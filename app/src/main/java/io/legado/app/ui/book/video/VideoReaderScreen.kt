package io.legado.app.ui.book.video

import android.app.Activity
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebResourceResponse
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import kotlinx.coroutines.delay

import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.pager.PagerState
import androidx.compose.ui.platform.LocalConfiguration
import android.content.pm.ActivityInfo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.Uri
import android.os.Build
import android.view.ViewGroup
import android.view.GestureDetector
import android.view.MotionEvent
import android.webkit.WebView
import android.webkit.WebViewClient

import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.draw.paint
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.rememberTransformableState
import androidx.compose.foundation.gestures.transformable
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.BorderStroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.grid.*
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloat
import androidx.compose.ui.draw.shadow

// Media3 Player
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView
import androidx.media3.datasource.DefaultHttpDataSource
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory

import android.support.v4.media.session.MediaSessionCompat
import android.support.v4.media.session.PlaybackStateCompat
import android.support.v4.media.MediaMetadataCompat
import androidx.media.app.NotificationCompat.MediaStyle
import androidx.core.app.NotificationCompat
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent

import androidx.lifecycle.compose.collectAsStateWithLifecycle
import org.koin.androidx.compose.koinViewModel
import io.legado.app.R
import io.legado.app.data.entities.Book
import io.legado.app.data.entities.BookChapter
import io.legado.app.ui.theme.LegadoTheme
import io.legado.app.ui.widget.components.progressIndicator.AppContainedLoadingIndicator

private fun isEmbedPlayerUrl(url: String?): Boolean {
    if (url == null) return false
    
    val path = try { android.net.Uri.parse(url).path?.lowercase() ?: "" } catch (e: Exception) { "" }
    if (path.endsWith(".js") || path.endsWith(".css") || path.endsWith(".png") || 
        path.endsWith(".jpg") || path.endsWith(".jpeg") || path.endsWith(".gif") || 
        path.endsWith(".svg") || path.endsWith(".woff") || path.endsWith(".woff2") || 
        path.endsWith(".json") || path.endsWith(".webp") || path.endsWith(".ico")) {
        return false
    }

    val host = try { android.net.Uri.parse(url).host?.lowercase() ?: "" } catch (e: Exception) { "" }
    if (host.isBlank()) return false
    
    if (host.contains("amung.us") || host.contains("dtscout") || host.contains("google-analytics") || 
        host.contains("doubleclick") || host.contains("facebook") || host.contains("adnxs") || 
        host.contains("pubmatic") || host.contains("criteo") || host.contains("cloudflare")) {
        return false
    }

    val lowerHost = host
    val lowerUrl = url.lowercase()

    return lowerHost.contains("embed") 
        || lowerHost.contains("player") 
        || lowerHost.contains("hayip") 
        || lowerHost.contains("streamc") 
        || lowerHost.contains("streamfree") 
        || lowerHost.contains("playzone")
        || lowerHost.contains("ssplay")
        || lowerHost.contains("fdrive")
        || lowerHost.contains("opstream")
        || lowerHost.contains("iframe")
        || lowerHost.contains("streaming")
        || path.contains("/play")
        || path.contains("/embed/")
        || path.contains("watch")
        || path.contains("/v/")
}

private suspend fun probeIsVideoUrl(url: String): Boolean {
    return kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
        try {
            val connection = java.net.URL(url).openConnection() as java.net.HttpURLConnection
            connection.requestMethod = "HEAD"
            connection.connectTimeout = 3000
            connection.readTimeout = 3000
            connection.instanceFollowRedirects = true
            connection.setRequestProperty("User-Agent", 
                "Mozilla/5.0 (Linux; Android 12) AppleWebKit/537.36")
            connection.connect()
            
            val contentType = connection.contentType?.lowercase() ?: ""
            val isVideo = contentType.startsWith("video/")
                || contentType.contains("mpegurl")      // m3u8
                || contentType.contains("dash+xml")     // mpd
                || contentType.contains("octet-stream") // binary file
            connection.disconnect()
            isVideo
        } catch (e: Exception) { 
            false 
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VideoReaderScreen(
    extensionId: String,
    novelUrl: String,
    chapterUrl: String,
    onBackClick: () -> Unit,
    viewModel: VideoReaderViewModel = koinViewModel(),
) {
    val novel by viewModel.novel.collectAsStateWithLifecycle()
    val chapters by viewModel.chapters.collectAsStateWithLifecycle()
    val chapter by viewModel.chapter.collectAsStateWithLifecycle()
    val chapterContent by viewModel.chapterContent.collectAsStateWithLifecycle()
    val currentIndex by viewModel.currentIndex.collectAsStateWithLifecycle()
    val isLoading by viewModel.isLoading.collectAsStateWithLifecycle()
    val error by viewModel.error.collectAsStateWithLifecycle()

    val resolvedVideoUrl by viewModel.resolvedVideoUrl.collectAsStateWithLifecycle()
    val resolvedVideoAudio by viewModel.resolvedVideoAudio.collectAsStateWithLifecycle()
    val resolvedVideoHeaders by viewModel.resolvedVideoHeaders.collectAsStateWithLifecycle()
    val resolvedVideoType by viewModel.resolvedVideoType.collectAsStateWithLifecycle()
    val isResolvingTrack by viewModel.isResolvingTrack.collectAsStateWithLifecycle()

    val context = LocalContext.current
    val activity = context as? android.app.Activity
    val prefs = remember { context.getSharedPreferences("novel_reader_prefs", Context.MODE_PRIVATE) }

    // 1. Phân tách danh sách Server (Tracks) của tập phim từ JSON content
    val servers = remember(chapterContent) {
        try {
            val content = chapterContent ?: ""
            val jsonArray = if (content.startsWith("[")) {
                org.json.JSONArray(content)
            } else if (content.startsWith("{")) {
                val obj = org.json.JSONObject(content)
                if (obj.has("data") && obj.optJSONArray("data") != null) {
                    obj.getJSONArray("data")
                } else if (obj.has("code") && obj.optJSONArray("data") != null) {
                    obj.getJSONArray("data")
                } else {
                    null
                }
            } else {
                null
            }

            if (jsonArray != null) {
                val list = mutableListOf<Pair<String, String>>()
                for (i in 0 until jsonArray.length()) {
                    val obj = jsonArray.getJSONObject(i)
                    val title = obj.optString("title", obj.optString("name", "Server " + (i + 1)))
                    val data = obj.optString("data", obj.optString("url", obj.optString("link", "")))
                    list.add(Pair(title, data))
                }
                list
            } else {
                if (content.isNotBlank()) {
                    listOf(Pair("Mặc định", content))
                } else {
                    emptyList()
                }
            }
        } catch (e: Exception) {
            if (chapterContent?.isNotBlank() == true) {
                listOf(Pair("Mặc định", chapterContent!!))
            } else {
                emptyList()
            }
        }
    }

    var selectedServerIndex by remember(chapter, servers) {
        val defaultIdx = servers.indexOfFirst { it.first.contains("DASH", ignoreCase = true) }
        mutableStateOf(if (defaultIdx != -1) defaultIdx else 0)
    }

    // Tự động nạp dữ liệu phim
    LaunchedEffect(extensionId, novelUrl, chapterUrl) {
        viewModel.loadBookAndChapters(extensionId, novelUrl, chapterUrl)
    }

    // Tự động phân giải Link Video khi chọn server hoặc đổi tập
    LaunchedEffect(servers, selectedServerIndex) {
        if (servers.isNotEmpty() && selectedServerIndex < servers.size) {
            val serverUrl = servers[selectedServerIndex].second
            viewModel.resolveVideoUrl(extensionId, serverUrl)
        }
    }

    // Tải ảnh bìa truyện thành Bitmap bất đồng bộ để làm thumbnail MediaSession
    var coverBitmap by remember { mutableStateOf<android.graphics.Bitmap?>(null) }
    LaunchedEffect(novel?.coverUrl) {
        val coverUrl = novel?.coverUrl
        if (!coverUrl.isNullOrEmpty()) {
            coverBitmap = kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
                try {
                    val loader = coil.ImageLoader(context)
                    val request = coil.request.ImageRequest.Builder(context)
                        .data(coverUrl)
                        .allowHardware(false) // software bitmap cho MediaMetadata
                        .build()
                    val result = loader.execute(request)
                    if (result is coil.request.SuccessResult) {
                        (result.drawable as? android.graphics.drawable.BitmapDrawable)?.bitmap
                    } else null
                } catch (e: java.lang.Exception) {
                    null
                }
            }
        }
    }

    // Đặt cấu hình HttpDataSource động
    val httpDataSourceFactory = remember {
        DefaultHttpDataSource.Factory().apply {
            setUserAgent("Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Mobile Safari/537.36")
        }
    }

    // Trình phát ExoPlayer
    val exoPlayer = remember {
        val mediaSourceFactory = DefaultMediaSourceFactory(context)
            .setDataSourceFactory(httpDataSourceFactory)
        ExoPlayer.Builder(context)
            .setMediaSourceFactory(mediaSourceFactory)
            .build().apply {
                playWhenReady = prefs.getBoolean("video_auto_play", true)
            }
    }

    // Khởi tạo MediaSessionCompat cho Video để hệ thống Android hiển thị Widget phát Media
    val mediaSession = remember(exoPlayer) {
        MediaSessionCompat(context, "NovelReaderVideoSession").apply {
            setCallback(object : MediaSessionCompat.Callback() {
                override fun onPlay() {
                    exoPlayer.play()
                }
                override fun onPause() {
                    exoPlayer.pause()
                }
                override fun onSeekTo(pos: Long) {
                    exoPlayer.seekTo(pos)
                }
            })
            isActive = true
        }
    }

    // Broadcast Receiver để nhận sự kiện điều khiển từ Notification Widget
    DisposableEffect(exoPlayer) {
        val receiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                val action = intent?.action ?: return
                if (action.endsWith(".VIDEO_PLAY_PAUSE")) {
                    if (exoPlayer.isPlaying) {
                        exoPlayer.pause()
                    } else {
                        exoPlayer.play()
                    }
                } else if (action.endsWith(".VIDEO_STOP")) {
                    exoPlayer.pause()
                    cancelVideoNotification(context ?: return)
                    onBackClick()
                }
            }
        }
        val playPauseAction = "${context.packageName}.VIDEO_PLAY_PAUSE"
        val stopAction = "${context.packageName}.VIDEO_STOP"
        val filter = IntentFilter().apply {
            addAction(playPauseAction)
            addAction(stopAction)
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            context.registerReceiver(receiver, filter, Context.RECEIVER_NOT_EXPORTED)
        } else {
            context.registerReceiver(receiver, filter)
        }
        onDispose {
            try {
                context.unregisterReceiver(receiver)
            } catch (e: Exception) {
                // ignore
            }
        }
    }

    // Đồng bộ trạng thái ExoPlayer sang MediaSession và cập nhật Notification định kỳ
    LaunchedEffect(exoPlayer, mediaSession, chapter, coverBitmap) {
        val listener = object : androidx.media3.common.Player.Listener {
            override fun onEvents(player: androidx.media3.common.Player, events: androidx.media3.common.Player.Events) {
                val metadataBuilder = MediaMetadataCompat.Builder().apply {
                    putString(MediaMetadataCompat.METADATA_KEY_TITLE, chapter?.title ?: "Tập phim")
                    putString(MediaMetadataCompat.METADATA_KEY_ARTIST, "Thiên Thư Các (Video)")
                    putLong(MediaMetadataCompat.METADATA_KEY_DURATION, exoPlayer.duration.coerceAtLeast(0L))
                    coverBitmap?.let { bitmap ->
                        putBitmap(MediaMetadataCompat.METADATA_KEY_ART, bitmap)
                        putBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmap)
                    }
                }
                mediaSession.setMetadata(metadataBuilder.build())

                val state = when {
                    exoPlayer.playbackState == androidx.media3.common.Player.STATE_BUFFERING -> PlaybackStateCompat.STATE_BUFFERING
                    exoPlayer.isPlaying -> PlaybackStateCompat.STATE_PLAYING
                    else -> PlaybackStateCompat.STATE_PAUSED
                }
                val actions = PlaybackStateCompat.ACTION_PLAY or
                        PlaybackStateCompat.ACTION_PAUSE or
                        PlaybackStateCompat.ACTION_SEEK_TO
                
                val stateBuilder = PlaybackStateCompat.Builder()
                    .setState(state, exoPlayer.currentPosition, exoPlayer.playbackParameters.speed)
                    .setActions(actions)
                
                mediaSession.setPlaybackState(stateBuilder.build())

                // Cập nhật thông báo
                updateVideoNotification(
                    context = context,
                    chapter = chapter,
                    isPlaying = exoPlayer.isPlaying,
                    mediaSession = mediaSession,
                    coverBitmap = coverBitmap
                )
            }
        }
        exoPlayer.addListener(listener)
        
        try {
            while (true) {
                val state = when {
                    exoPlayer.playbackState == androidx.media3.common.Player.STATE_BUFFERING -> PlaybackStateCompat.STATE_BUFFERING
                    exoPlayer.isPlaying -> PlaybackStateCompat.STATE_PLAYING
                    else -> PlaybackStateCompat.STATE_PAUSED
                }
                val actions = PlaybackStateCompat.ACTION_PLAY or
                        PlaybackStateCompat.ACTION_PAUSE or
                        PlaybackStateCompat.ACTION_SEEK_TO

                val stateBuilder = PlaybackStateCompat.Builder()
                    .setState(state, exoPlayer.currentPosition, exoPlayer.playbackParameters.speed)
                    .setActions(actions)

                mediaSession.setPlaybackState(stateBuilder.build())

                // Cập nhật thông báo định kỳ để đồng bộ seekbar
                updateVideoNotification(
                    context = context,
                    chapter = chapter,
                    isPlaying = exoPlayer.isPlaying,
                    mediaSession = mediaSession,
                    coverBitmap = coverBitmap
                )
                kotlinx.coroutines.delay(1000)
            }
        } catch (e: Exception) {
            // ignore
        } finally {
            exoPlayer.removeListener(listener)
        }
    }

    // Đồng bộ tốc độ phát từ Preferences
    var playSpeed by remember { mutableStateOf(prefs.getFloat("video_play_speed", 1.0f)) }
    LaunchedEffect(playSpeed) {
        exoPlayer.setPlaybackSpeed(playSpeed)
    }

    // Xoay màn hình và Immersive Mode
    var isFullscreen by remember { mutableStateOf(false) }

    fun enterImmersive() {
        activity?.window?.let { window ->
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) {
                window.insetsController?.hide(android.view.WindowInsets.Type.statusBars() or android.view.WindowInsets.Type.navigationBars())
                window.insetsController?.systemBarsBehavior = android.view.WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
            } else {
                @Suppress("DEPRECATION")
                window.decorView.systemUiVisibility = (
                    android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
                    or android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    or android.view.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    or android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    or android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                )
            }
        }
        activity?.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        isFullscreen = true
    }

    fun exitImmersive() {
        activity?.window?.let { window ->
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) {
                window.insetsController?.show(android.view.WindowInsets.Type.statusBars() or android.view.WindowInsets.Type.navigationBars())
            } else {
                @Suppress("DEPRECATION")
                window.decorView.systemUiVisibility = android.view.View.SYSTEM_UI_FLAG_VISIBLE
            }
        }
        activity?.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED
        isFullscreen = false
    }

    DisposableEffect(exoPlayer) {
        onDispose {
            exoPlayer.release()
            mediaSession.isActive = false
            mediaSession.release()
            cancelVideoNotification(context)
            activity?.window?.let { window ->
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) {
                    window.insetsController?.show(android.view.WindowInsets.Type.statusBars() or android.view.WindowInsets.Type.navigationBars())
                }
            }
            activity?.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED
        }
    }

    androidx.activity.compose.BackHandler {
        if (isFullscreen) {
            exitImmersive()
        } else {
            onBackClick()
        }
    }

    // Cài đặt giữ màn hình sáng
    val keepScreenOn = prefs.getBoolean("video_keep_screen_on", true)
    DisposableEffect(keepScreenOn) {
        if (keepScreenOn) {
            activity?.window?.addFlags(android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        }
        onDispose {
            activity?.window?.clearFlags(android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        }
    }

    Box(modifier = Modifier.fillMaxSize().background(Color.Black)) {
        VideoContent(
            chapter = chapter,
            isLoading = isLoading,
            isResolvingTrack = isResolvingTrack,
            error = error,
            exoPlayer = exoPlayer,
            httpDataSourceFactory = httpDataSourceFactory,
            novelUrl = novelUrl,
            isFullscreen = isFullscreen,
            onFullscreenToggle = {
                if (isFullscreen) exitImmersive() else enterImmersive()
            },
            resolvedVideoUrl = resolvedVideoUrl,
            resolvedVideoAudio = resolvedVideoAudio,
            resolvedVideoHeaders = resolvedVideoHeaders,
            resolvedVideoType = resolvedVideoType,
            servers = servers,
            selectedServerIndex = selectedServerIndex,
            onServerChange = { selectedServerIndex = it },
            playSpeed = playSpeed,
            onPlaySpeedChange = { speed ->
                playSpeed = speed
                prefs.edit().putFloat("video_play_speed", speed).apply()
            },
            chapters = chapters,
            currentIndex = currentIndex,
            onChapterSelect = { targetUrl ->
                val idx = chapters.indexOfFirst { it.url == targetUrl }
                if (idx != -1) {
                    viewModel.loadChapterAtIndex(idx)
                    selectedServerIndex = 0
                }
            },
            onBackClick = {
                if (isFullscreen) exitImmersive() else onBackClick()
            }
        )
    }
}



private const val VIDEO_NOTIFICATION_ID = 2002
private const val VIDEO_CHANNEL_ID = "video_player_channel"

private fun createVideoNotificationChannel(context: Context) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        val channel = NotificationChannel(
            VIDEO_CHANNEL_ID,
            "Trình phát Video",
            NotificationManager.IMPORTANCE_LOW
        ).apply {
            description = "Hiển thị widget điều khiển khi xem phim"
        }
        val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manager.createNotificationChannel(channel)
    }
}

private fun updateVideoNotification(
    context: Context,
    chapter: BookChapter?,
    isPlaying: Boolean,
    mediaSession: MediaSessionCompat?,
    coverBitmap: android.graphics.Bitmap?
) {
    createVideoNotificationChannel(context)

    val playPauseIntent = Intent("${context.packageName}.VIDEO_PLAY_PAUSE").setPackage(context.packageName)
    val piPlayPause = PendingIntent.getBroadcast(
        context,
        10,
        playPauseIntent,
        PendingIntent.FLAG_UPDATE_CURRENT or (if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) PendingIntent.FLAG_IMMUTABLE else 0)
    )

    val stopIntent = Intent("${context.packageName}.VIDEO_STOP").setPackage(context.packageName)
    val piStop = PendingIntent.getBroadcast(
        context,
        11,
        stopIntent,
        PendingIntent.FLAG_UPDATE_CURRENT or (if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) PendingIntent.FLAG_IMMUTABLE else 0)
    )

    val openAppIntent = Intent(context, io.legado.app.ui.main.MainActivity::class.java)
    val piOpenApp = PendingIntent.getActivity(
        context,
        0,
        openAppIntent,
        PendingIntent.FLAG_UPDATE_CURRENT or (if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) PendingIntent.FLAG_IMMUTABLE else 0)
    )

    val actionIcon = if (isPlaying) R.drawable.ic_pause else R.drawable.ic_play
    val actionText = if (isPlaying) "Tạm dừng" else "Phát"

    val builder = NotificationCompat.Builder(context, VIDEO_CHANNEL_ID)
        .setContentTitle(chapter?.title ?: "Đang xem phim")
        .setContentText("Thiên Thư Các (Video)")
        .setSmallIcon(R.drawable.ic_volume_up)
        .setContentIntent(piOpenApp)
        .setOngoing(isPlaying)
        .setStyle(
            MediaStyle()
                .setMediaSession(mediaSession?.sessionToken)
                .setShowActionsInCompactView(0, 1)
        )
        .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
        .addAction(actionIcon, actionText, piPlayPause)
        .addAction(R.drawable.ic_stop_black_24dp, "Đóng", piStop)

    coverBitmap?.let {
        builder.setLargeIcon(it)
    }

    val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
    manager.notify(VIDEO_NOTIFICATION_ID, builder.build())
}

private fun cancelVideoNotification(context: Context) {
    val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
    manager.cancel(VIDEO_NOTIFICATION_ID)
}

private val mockDevToolsDetectorJS = """
    (function() {
        var noop = function() {};
        var detector = {
            addListener: function(cb) { try { cb(false); } catch(e) {} },
            removeListener: noop,
            launch: noop,
            stop: noop,
            isLaunch: function() { return false; },
            isOpen: false,
            setDetectDelay: noop
        };
        window.devtoolsDetector = detector;
        if (typeof module !== 'undefined' && module.exports) { module.exports = detector; }
        if (typeof define === 'function' && define.amd) { define(function() { return detector; }); }
    })();
""".trimIndent()


@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun VideoContent(
    chapter: BookChapter?,
    isLoading: Boolean,
    isResolvingTrack: Boolean,
    error: String?,
    exoPlayer: ExoPlayer,
    httpDataSourceFactory: DefaultHttpDataSource.Factory,
    novelUrl: String,
    isFullscreen: Boolean,
    onFullscreenToggle: () -> Unit,
    resolvedVideoUrl: String?,
    resolvedVideoAudio: String?,
    resolvedVideoHeaders: Map<String, String>?,
    resolvedVideoType: String?,
    servers: List<Pair<String, String>>,
    selectedServerIndex: Int,
    onServerChange: (Int) -> Unit,
    playSpeed: Float,
    onPlaySpeedChange: (Float) -> Unit,
    chapters: List<BookChapter>,
    currentIndex: Int,
    onChapterSelect: (String) -> Unit,
    onBackClick: () -> Unit
) {
    val context = LocalContext.current
    val prefs = remember { context.getSharedPreferences("novel_reader_prefs", Context.MODE_PRIVATE) }
    val theme = LegadoTheme.colorScheme

    var playbackError by remember { mutableStateOf<String?>(null) }
    LaunchedEffect(resolvedVideoUrl) {
        playbackError = null
    }

    val chromeUA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36"

    // Trạng thái dò link video ngầm (WebView Sniffing)
    var sniffedVideoUrl by remember(resolvedVideoUrl) { mutableStateOf<String?>(null) }
    var sniffingTimeout by remember(resolvedVideoUrl) { mutableStateOf(false) }

    // Lưu thực thể WebView để chủ động giải phóng
    var sniffingWebViewInstance by remember { mutableStateOf<WebView?>(null) }

    // Nhận diện link video stream trực tiếp hay trang nhúng
    val videoExts = remember { listOf(".mp4", ".m3u8", ".mkv", ".webm", ".ts", ".avi", ".mov", ".flv", ".dash") }
    val isDirectLink = remember(resolvedVideoUrl) {
        val lower = (resolvedVideoUrl ?: "").lowercase()
        val hasDirectExt = videoExts.any { lower.contains(it) }
        resolvedVideoUrl != null 
            && resolvedVideoUrl.startsWith("http") 
            && !resolvedVideoUrl.contains("<")
            && (hasDirectExt || !isEmbedPlayerUrl(resolvedVideoUrl))
    }

    LaunchedEffect(resolvedVideoUrl, isDirectLink) {
        if (resolvedVideoUrl != null) {
            if (isDirectLink) {
                sniffedVideoUrl = resolvedVideoUrl
                sniffingTimeout = false
            } else {
                sniffedVideoUrl = null
                sniffingTimeout = false
                val isStreamFree = resolvedVideoUrl.lowercase().contains("streamfree") || novelUrl.lowercase().contains("streamfree")
                val timeout = if (isStreamFree) 25000L else 12000L
                kotlinx.coroutines.delay(timeout)
                if (sniffedVideoUrl == null) {
                    sniffingTimeout = true
                }
            }
        }
    }

    // Clean up sniffing webview khi thoát
    DisposableEffect(Unit) {
        onDispose {
            try {
                sniffingWebViewInstance?.let { wv ->
                    wv.stopLoading()
                    wv.loadUrl("about:blank")
                    wv.destroy()
                }
            } catch (e: Exception) {
                android.util.Log.e("VideoReaderScreen", "Error destroying webview", e)
            }
        }
    }

    // Trạng thái khóa màn hình (Netflix Lock Screen)
    var isLocked by remember { mutableStateOf(false) }
    var showLockControl by remember { mutableStateOf(true) }

    LaunchedEffect(showLockControl) {
        if (showLockControl) {
            kotlinx.coroutines.delay(3000)
            showLockControl = false
        }
    }

    // Trạng thái tỷ lệ màn hình (Resize mode)
    var resizeMode by remember { mutableStateOf(androidx.media3.ui.AspectRatioFrameLayout.RESIZE_MODE_FIT) }

    // Nạp link video vào ExoPlayer với dynamic headers và hỗ trợ MergingMediaSource cho Bilibili
    val currentSniffedUrl = sniffedVideoUrl
    LaunchedEffect(currentSniffedUrl, resolvedVideoAudio, resolvedVideoHeaders) {
        if (!currentSniffedUrl.isNullOrBlank()) {
            val headersMap = mutableMapOf<String, String>()
            headersMap["User-Agent"] = "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Mobile Safari/537.36"
            
            resolvedVideoHeaders?.forEach { (key, value) ->
                val existingKey = headersMap.keys.firstOrNull { it.equals(key, ignoreCase = true) }
                if (existingKey != null) {
                    headersMap.remove(existingKey)
                }
                headersMap[key] = value
            }

            val lowerUrl = currentSniffedUrl.lowercase()
            
            // Set Origin dynamically
            val originMatch = "^(https?://[^/]+)".toRegex().find(currentSniffedUrl)
            val origin = originMatch?.groupValues?.get(1)
            if (!origin.isNullOrBlank()) {
                headersMap["Origin"] = origin
            }

            val referer = when {
                lowerUrl.contains("ssplay") -> {
                    headersMap["Origin"] = "https://ssplay.net"
                    "https://ssplay.net/"
                }
                lowerUrl.contains("bilibili") || lowerUrl.contains("bilivideo") || lowerUrl.contains("bstar") || lowerUrl.contains("akamaized.net") || lowerUrl.contains("upos-") || lowerUrl.contains("bilibilivideo") -> {
                    headersMap["Origin"] = "https://www.bilibili.tv"
                    headersMap["User-Agent"] = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36"
                    "https://www.bilibili.tv/"
                }
                else -> headersMap["Referer"] ?: novelUrl
            }
            headersMap["Referer"] = referer

            headersMap["Sec-Fetch-Dest"] = "video"
            headersMap["Sec-Fetch-Mode"] = "cors"
            headersMap["Sec-Fetch-Site"] = "cross-site"

            val cookieManager = android.webkit.CookieManager.getInstance()
            val cookies = mutableListOf<String>()
            cookieManager.getCookie(novelUrl)?.let { cookies.add(it) }
            cookieManager.getCookie(currentSniffedUrl)?.let { cookies.add(it) }
            
            val mergedCookie = cookies.flatMap { it.split("; ") }.filter { it.isNotBlank() }.distinct().joinToString("; ")
            if (mergedCookie.isNotBlank()) {
                headersMap["Cookie"] = mergedCookie
            }

            android.util.Log.d("VideoPlayerExo", "Playing sniffedVideoUrl: $currentSniffedUrl")
            httpDataSourceFactory.setDefaultRequestProperties(headersMap)
            
            val mimeType = when {
                lowerUrl.contains(".m3u8") || lowerUrl.contains("m3u8") || lowerUrl.contains("hls") -> androidx.media3.common.MimeTypes.APPLICATION_M3U8
                lowerUrl.contains(".mpd") -> androidx.media3.common.MimeTypes.APPLICATION_MPD
                lowerUrl.contains(".ts") || lowerUrl.contains("ts") -> androidx.media3.common.MimeTypes.VIDEO_MP2T
                else -> null
            }
            
            val videoMediaItem = MediaItem.Builder()
                .setUri(currentSniffedUrl)
                .apply {
                    if (mimeType != null) {
                        setMimeType(mimeType)
                    }
                }
                .build()
            
            val videoMediaSource = DefaultMediaSourceFactory(context)
                .setDataSourceFactory(httpDataSourceFactory)
                .createMediaSource(videoMediaItem)

            val mediaSource = if (!resolvedVideoAudio.isNullOrBlank()) {
                val audioMediaItem = MediaItem.Builder()
                    .setUri(resolvedVideoAudio)
                    .build()
                val audioMediaSource = DefaultMediaSourceFactory(context)
                    .setDataSourceFactory(httpDataSourceFactory)
                    .createMediaSource(audioMediaItem)
                androidx.media3.exoplayer.source.MergingMediaSource(videoMediaSource, audioMediaSource)
            } else {
                videoMediaSource
            }
                
            exoPlayer.setMediaSource(mediaSource)
            exoPlayer.prepare()
            
            val autoContinue = prefs.getBoolean("video_auto_continue", false)
            if (autoContinue && chapter != null) {
                val savedPos = prefs.getLong("video_pos_" + chapter.url, 0L)
                if (savedPos > 0) {
                    exoPlayer.seekTo(savedPos)
                }
            }
            
            exoPlayer.play()
        }
    }

    // Save vị trí phát lại khi dừng/thoát
    DisposableEffect(chapter) {
        onDispose {
            if (chapter != null && exoPlayer.duration > 0) {
                prefs.edit().putLong("video_pos_" + chapter.url, exoPlayer.currentPosition).apply()
            }
        }
    }

    // Tự động chuyển tập khi phát xong
    var playFinishedTriggered by remember(chapter) { mutableStateOf(false) }
    val autoNext = prefs.getBoolean("video_auto_next", true)
    LaunchedEffect(exoPlayer) {
        exoPlayer.addListener(object : androidx.media3.common.Player.Listener {
            override fun onPlaybackStateChanged(playbackState: Int) {
                if (playbackState == androidx.media3.common.Player.STATE_ENDED && autoNext && !playFinishedTriggered) {
                    playFinishedTriggered = true
                    val serverChapters = chapters.filter { !it.isVolume }
                    val currentChapInServerIdx = serverChapters.indexOfFirst { it.url == chapter?.url }
                    if (currentChapInServerIdx != -1 && currentChapInServerIdx < serverChapters.size - 1) {
                        onChapterSelect(serverChapters[currentChapInServerIdx + 1].url)
                    }
                }
            }
        })
    }

    // Trạng thái thanh công cụ điều khiển
    var showUI by remember { mutableStateOf(true) }
    LaunchedEffect(showUI) {
        if (showUI) {
            kotlinx.coroutines.delay(5000)
            showUI = false
        }
    }

    var showPlaylistBottomSheet by remember { mutableStateOf(false) }
    var showSettingsBottomSheet by remember { mutableStateOf(false) }

    Box(modifier = Modifier.fillMaxSize()) {
        if (isLoading) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    AppContainedLoadingIndicator()
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "Đang tải...",
                        color = Color.White.copy(alpha = 0.8f),
                        fontSize = 14.sp
                    )
                }
            }
        } else if (error != null || playbackError != null) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(theme.background),
                contentAlignment = Alignment.Center
            ) {
                Card(
                    colors = CardDefaults.cardColors(containerColor = theme.surfaceContainer),
                    shape = RoundedCornerShape(24.dp),
                    modifier = Modifier
                        .padding(32.dp)
                        .widthIn(max = 340.dp)
                        .shadow(16.dp, RoundedCornerShape(24.dp))
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(28.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Filled.ErrorOutline,
                            contentDescription = null,
                            tint = theme.error,
                            modifier = Modifier.size(54.dp)
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        Text(
                            text = "Lỗi tải video",
                            color = theme.onSurface,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = error ?: playbackError ?: "",
                            color = theme.onSurfaceVariant.copy(alpha = 0.8f),
                            fontSize = 13.sp,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(24.dp))
                        Button(
                            onClick = onBackClick,
                            colors = ButtonDefaults.buttonColors(containerColor = theme.primary)
                        ) {
                            Text("Quay lại", color = theme.onPrimary)
                        }
                    }
                }
            }
        } else if (resolvedVideoUrl.isNullOrBlank()) {
            if (isResolvingTrack) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        AppContainedLoadingIndicator()
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "Đang phân giải đường dẫn video...",
                            color = Color.White.copy(alpha = 0.8f),
                            fontSize = 14.sp
                        )
                    }
                }
            } else {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(theme.background),
                    contentAlignment = Alignment.Center
                ) {
                    Card(
                        colors = CardDefaults.cardColors(containerColor = theme.surfaceContainer),
                        shape = RoundedCornerShape(24.dp),
                        modifier = Modifier
                            .padding(32.dp)
                            .widthIn(max = 340.dp)
                            .shadow(16.dp, RoundedCornerShape(24.dp))
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(28.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Filled.WarningAmber,
                                contentDescription = null,
                                tint = theme.primary,
                                modifier = Modifier.size(54.dp)
                            )
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(
                                text = "Nguồn phát trống",
                                color = theme.onSurface,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                text = "Không tìm thấy đường dẫn video cho tập này.",
                                color = theme.onSurfaceVariant.copy(alpha = 0.8f),
                                fontSize = 13.sp,
                                textAlign = TextAlign.Center
                            )
                            Spacer(modifier = Modifier.height(24.dp))
                            Button(
                                onClick = onBackClick,
                                colors = ButtonDefaults.buttonColors(containerColor = theme.primary)
                            ) {
                                Text("Quay lại", color = theme.onPrimary)
                            }
                        }
                    }
                }
            }
        } else {
            // ExoPlayer Main Display
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black)
                    .pointerInput(Unit) {
                        detectTapGestures(
                            onTap = {
                                if (isLocked) {
                                    showLockControl = !showLockControl
                                } else {
                                    showUI = !showUI
                                }
                            }
                        )
                    }
            ) {
                var isBuffering by remember { mutableStateOf(false) }
                var duration by remember { mutableStateOf(0L) }
                DisposableEffect(exoPlayer) {
                    val listener = object : androidx.media3.common.Player.Listener {
                        override fun onPlaybackStateChanged(playbackState: Int) {
                            isBuffering = playbackState == androidx.media3.common.Player.STATE_BUFFERING
                            if (playbackState == androidx.media3.common.Player.STATE_READY) {
                                val d = exoPlayer.duration
                                duration = if (d > 0) d else 0L
                                if (d <= 0) {
                                    playbackError = "Không tìm thấy thời lượng hợp lệ cho video này (Có thể liên kết bị lỗi hoặc định dạng không được hỗ trợ)"
                                } else {
                                    playbackError = null
                                }
                            }
                        }
                        override fun onPlayerError(error: androidx.media3.common.PlaybackException) {
                            playbackError = "Lỗi phát video: " + (error.localizedMessage ?: error.message ?: "Mã lỗi ${error.errorCode}")
                        }
                    }
                    exoPlayer.addListener(listener)
                    isBuffering = exoPlayer.playbackState == androidx.media3.common.Player.STATE_BUFFERING
                    val d = exoPlayer.duration
                    duration = if (d > 0) d else 0L
                    onDispose {
                        exoPlayer.removeListener(listener)
                    }
                }

                val isPlayerReady = duration > 0

                val isSniffing = resolvedVideoUrl != null && !isDirectLink && sniffedVideoUrl == null && !sniffingTimeout
                if (isSniffing) {
                    key(resolvedVideoUrl) {
                        AndroidView(
                            factory = { ctx ->
                                WebView(ctx).apply {
                                    sniffingWebViewInstance = this
                                    visibility = android.view.View.INVISIBLE
                                    layoutParams = ViewGroup.LayoutParams(
                                        ViewGroup.LayoutParams.MATCH_PARENT,
                                        ViewGroup.LayoutParams.MATCH_PARENT
                                    )
                                    setBackgroundColor(android.graphics.Color.TRANSPARENT)
                                    settings.apply {
                                        javaScriptEnabled = true
                                        domStorageEnabled = true
                                        mediaPlaybackRequiresUserGesture = false
                                        userAgentString = chromeUA
                                        setSupportMultipleWindows(false)
                                        setJavaScriptCanOpenWindowsAutomatically(false)
                                        cacheMode = android.webkit.WebSettings.LOAD_NO_CACHE
                                    }
                                    clearCache(true)
                                    webChromeClient = object : WebChromeClient() {
                                        override fun onProgressChanged(view: WebView?, newProgress: Int) {
                                            super.onProgressChanged(view, newProgress)
                                            if (newProgress > 40) {
                                                view?.evaluateJavascript("""
                                                    (function() {
                                                        if (window.__sniff_injected) return;
                                                        window.__sniff_injected = true;
                                                        var autoPlayInterval = setInterval(function() {
                                                            var videos = document.getElementsByTagName('video');
                                                            for (var i = 0; i < videos.length; i++) {
                                                                videos[i].muted = true;
                                                                videos[i].play().catch(function(e) {});
                                                            }
                                                            var playSelectors = ['.play', '.btn-play', '.vjs-big-play-button', '[class*="play-button"]', '[id*="play-button"]', 'iframe'];
                                                            playSelectors.forEach(function(sel) {
                                                                var btn = document.querySelector(sel);
                                                                if (btn && (btn.offsetWidth > 0 || btn.offsetHeight > 0)) {
                                                                    btn.click();
                                                                }
                                                            });
                                                        }, 1000);
                                                        setTimeout(function() { clearInterval(autoPlayInterval); }, 15000);
                                                    })();
                                                """.trimIndent(), null)
                                            }
                                        }
                                        override fun onShowCustomView(view: android.view.View?, callback: CustomViewCallback?) {
                                            callback?.onCustomViewHidden()
                                        }
                                    }
                                    webViewClient = object : WebViewClient() {
                                        override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                                            val url = request?.url?.toString() ?: ""
                                            return if (url.startsWith("http://") || url.startsWith("https://")) {
                                                false
                                            } else {
                                                true
                                            }
                                        }
                                        override fun onPageStarted(view: WebView?, url: String?, favicon: android.graphics.Bitmap?) {
                                            super.onPageStarted(view, url, favicon)
                                            view?.evaluateJavascript("""
                                                (function() {
                                                    var style = document.createElement('style');
                                                    style.innerHTML = 'html, body { background: #000000 !important; color: #000000 !important; }';
                                                    var head = document.head || document.getElementsByTagName('head')[0] || document.documentElement;
                                                    if (head) head.appendChild(style);
                                                })();
                                            """.trimIndent(), null)
                                            view?.evaluateJavascript(mockDevToolsDetectorJS, null)
                                        }
                                        override fun shouldInterceptRequest(
                                            view: WebView?,
                                            request: WebResourceRequest?
                                        ): WebResourceResponse? {
                                            val reqUrl = request?.url?.toString() ?: ""
                                            val lowerUrl = reqUrl.lowercase()
                                            
                                            if (lowerUrl.contains("devtools-detector") || lowerUrl.contains("devtools_detector")) {
                                                return WebResourceResponse(
                                                    "application/javascript",
                                                    "UTF-8",
                                                    java.io.ByteArrayInputStream(mockDevToolsDetectorJS.toByteArray(Charsets.UTF_8))
                                                )
                                            }
                                            
                                            if (lowerUrl.contains(".m3u8") || lowerUrl.contains(".mp4") || lowerUrl.contains(".m4s") || lowerUrl.contains(".ts") || lowerUrl.contains(".mkv") || lowerUrl.contains(".webm") || lowerUrl.contains("googlevideo.com")) {
                                                val realVideoUrl = extractRealVideoUrl(reqUrl)
                                                if (isValidVideoUrl(realVideoUrl)) {
                                                    (view?.context as? Activity)?.runOnUiThread {
                                                        if (sniffedVideoUrl == null) {
                                                            android.util.Log.d("ReaderSniffing", "--> Bắt được link stream thật: $realVideoUrl")
                                                            sniffedVideoUrl = realVideoUrl
                                                        }
                                                    }
                                                }
                                            }
                                            
                                            if (request != null && !request.isForMainFrame) {
                                                val isEmbed = isEmbedPlayerUrl(reqUrl)
                                                if (isEmbed && resolvedVideoUrl != null && reqUrl != resolvedVideoUrl) {
                                                    (view?.context as? Activity)?.runOnUiThread {
                                                        val loadedUrl = view.tag as? String
                                                        if (loadedUrl != reqUrl) {
                                                            android.util.Log.d("ReaderSniffing", "--> Phát hiện iframe embed: $reqUrl, chuyển hướng WebView ngầm sang...")
                                                            view.tag = reqUrl
                                                            view.loadUrl(reqUrl)
                                                        }
                                                    }
                                                }
                                            }
                                            
                                            return super.shouldInterceptRequest(view, request)
                                        }
                                    }
                                }
                            },
                            update = { webView ->
                                val loadedUrl = webView.tag as? String
                                if (resolvedVideoUrl != null && loadedUrl == null) {
                                    webView.tag = resolvedVideoUrl
                                    if (resolvedVideoType == "webview" || resolvedVideoUrl.contains("<")) {
                                        android.util.Log.d("ReaderSniffing", "--> Bắt đầu load HTML thô vào WebView ngầm")
                                        webView.loadDataWithBaseURL(
                                            novelUrl,
                                            resolvedVideoUrl,
                                            "text/html",
                                            "utf-8",
                                            null
                                        )
                                    } else {
                                        android.util.Log.d("ReaderSniffing", "--> Bắt đầu load URL phim gốc: $resolvedVideoUrl")
                                        webView.loadUrl(resolvedVideoUrl, mapOf("Referer" to novelUrl))
                                    }
                                }
                            },
                            modifier = Modifier
                                .fillMaxSize()
                                .graphicsLayer(alpha = 0f, translationX = 9999f)
                        )
                    }
                }

                AndroidView(
                    factory = { ctx ->
                        PlayerView(ctx).apply {
                            player = exoPlayer
                            useController = false
                            layoutParams = ViewGroup.LayoutParams(
                                ViewGroup.LayoutParams.MATCH_PARENT,
                                ViewGroup.LayoutParams.MATCH_PARENT
                            )
                        }
                    },
                    update = { view ->
                        view.resizeMode = resizeMode
                    },
                    modifier = Modifier.fillMaxSize()
                )

                // Indication overlay for buffering or loading
                val isSniffingLoading = resolvedVideoUrl != null && !isDirectLink && sniffedVideoUrl == null && !sniffingTimeout
                if (isBuffering || !isPlayerReady || isSniffingLoading) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.Black.copy(alpha = 0.5f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            AppContainedLoadingIndicator()
                            Spacer(modifier = Modifier.height(16.dp))
                            Text(
                                text = if (isSniffingLoading) "Đang giải mã nguồn phim..." else "Đang tải luồng video...",
                                color = Color.White.copy(alpha = 0.85f),
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Medium
                            )
                        }
                    }
                }

                // 1. Controls Top Bar
                AnimatedVisibility(
                    visible = showUI && !isLocked && !isBuffering && isPlayerReady,
                    enter = fadeIn() + slideInVertically(initialOffsetY = { -it }),
                    exit = fadeOut() + slideOutVertically(targetOffsetY = { -it }),
                    modifier = Modifier.align(Alignment.TopCenter)
                ) {
                    VideoTopBar(
                        title = chapter?.title ?: "Xem phim",
                        servers = servers,
                        selectedServerIndex = selectedServerIndex,
                        onServerChange = onServerChange,
                        playSpeed = playSpeed,
                        onPlaySpeedChange = onPlaySpeedChange,
                        onSettingsClick = { showSettingsBottomSheet = true },
                        onBackClick = onBackClick,
                        sniffedVideoUrl = sniffedVideoUrl,
                        isPlayerReady = isPlayerReady
                    )
                }

                // 2. Center controls (Play/Pause & Seek)
                AnimatedVisibility(
                    visible = showUI && !isLocked && !isBuffering && isPlayerReady,
                    enter = fadeIn(),
                    exit = fadeOut(),
                    modifier = Modifier.align(Alignment.Center)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(36.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        val seekStep = prefs.getInt("video_seek_step", 10)
                        
                        var isPlaying by remember { mutableStateOf(exoPlayer.isPlaying) }
                        DisposableEffect(exoPlayer) {
                            val listener = object : androidx.media3.common.Player.Listener {
                                override fun onIsPlayingChanged(playing: Boolean) {
                                    isPlaying = playing
                                }
                            }
                            exoPlayer.addListener(listener)
                            isPlaying = exoPlayer.isPlaying
                            onDispose {
                                exoPlayer.removeListener(listener)
                            }
                        }

                        // Skip Backward
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .size(56.dp)
                                .background(Color.Black.copy(alpha = 0.45f), CircleShape)
                                .border(1.dp, Color.White.copy(alpha = 0.12f), CircleShape)
                                .bounceClick {
                                    val target = (exoPlayer.currentPosition - (seekStep * 1000)).coerceAtLeast(0L)
                                    exoPlayer.seekTo(target)
                                }
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Replay10,
                                contentDescription = "Tua lùi ${seekStep}s",
                                tint = Color.White,
                                modifier = Modifier.size(30.dp)
                            )
                        }

                        // Play/Pause
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .size(76.dp)
                                .background(Color.Black.copy(alpha = 0.55f), CircleShape)
                                .border(1.dp, Color.White.copy(alpha = 0.2f), CircleShape)
                                .bounceClick {
                                    if (isPlaying) {
                                        exoPlayer.pause()
                                    } else {
                                        exoPlayer.play()
                                    }
                                }
                        ) {
                            Icon(
                                imageVector = if (isPlaying) Icons.Filled.Pause else Icons.Filled.PlayArrow,
                                contentDescription = "Play/Pause",
                                tint = Color.White,
                                modifier = Modifier.size(44.dp)
                            )
                        }

                        // Skip Forward
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .size(56.dp)
                                .background(Color.Black.copy(alpha = 0.45f), CircleShape)
                                .border(1.dp, Color.White.copy(alpha = 0.12f), CircleShape)
                                .bounceClick {
                                    val target = (exoPlayer.currentPosition + (seekStep * 1000)).coerceAtMost(exoPlayer.duration)
                                    exoPlayer.seekTo(target)
                                }
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Forward10,
                                contentDescription = "Tua tới ${seekStep}s",
                                tint = Color.White,
                                modifier = Modifier.size(30.dp)
                            )
                        }
                    }
                }

                // 3. Netflix-style Screen Lock button
                AnimatedVisibility(
                    visible = ((showUI && !isLocked) || (isLocked && showLockControl)) && !isBuffering && isPlayerReady,
                    enter = fadeIn(),
                    exit = fadeOut(),
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(start = 24.dp)
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .size(50.dp)
                            .background(Color.Black.copy(alpha = 0.5f), CircleShape)
                            .border(1.dp, Color.White.copy(alpha = 0.15f), CircleShape)
                            .bounceClick {
                                isLocked = !isLocked
                                if (isLocked) {
                                    showUI = false
                                    showLockControl = true
                                } else {
                                    showUI = true
                                }
                            }
                    ) {
                        Icon(
                            imageVector = if (isLocked) Icons.Filled.Lock else Icons.Filled.LockOpen,
                            contentDescription = "Lock Screen",
                            tint = if (isLocked) theme.primary else Color.White,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }

                // 4. Controls Bottom Bar
                AnimatedVisibility(
                    visible = showUI && !isLocked && !isBuffering && isPlayerReady,
                    enter = fadeIn() + slideInVertically(initialOffsetY = { it }),
                    exit = fadeOut() + slideOutVertically(targetOffsetY = { it }),
                    modifier = Modifier.align(Alignment.BottomCenter)
                ) {
                    VideoBottomBar(
                        exoPlayer = exoPlayer,
                        chapters = chapters,
                        selectedServerIndex = selectedServerIndex,
                        currentChapterUrl = chapter?.url ?: "",
                        onChapterSelect = onChapterSelect,
                        onPlaylistClick = { showPlaylistBottomSheet = true },
                        onFullscreenToggle = onFullscreenToggle,
                        isFullscreen = isFullscreen,
                        resizeMode = resizeMode,
                        onResizeModeChange = {
                            resizeMode = when (resizeMode) {
                                androidx.media3.ui.AspectRatioFrameLayout.RESIZE_MODE_FIT -> androidx.media3.ui.AspectRatioFrameLayout.RESIZE_MODE_ZOOM
                                androidx.media3.ui.AspectRatioFrameLayout.RESIZE_MODE_ZOOM -> androidx.media3.ui.AspectRatioFrameLayout.RESIZE_MODE_FILL
                                else -> androidx.media3.ui.AspectRatioFrameLayout.RESIZE_MODE_FIT
                            }
                        }
                    )
                }
            }
        }
    }

    if (showPlaylistBottomSheet) {
        VideoPlaylistBottomSheet(
            chapters = chapters,
            currentChapterUrl = chapter?.url ?: "",
            selectedServerIndex = selectedServerIndex,
            onChapterClick = {
                onChapterSelect(it)
                showPlaylistBottomSheet = false
            },
            onDismiss = { showPlaylistBottomSheet = false }
        )
    }

    if (showSettingsBottomSheet) {
        VideoSettingsBottomSheet(
            onDismiss = { showSettingsBottomSheet = false }
        )
    }
}

@Composable
private fun VideoTopBar(
    title: String,
    servers: List<Pair<String, String>>,
    selectedServerIndex: Int,
    onServerChange: (Int) -> Unit,
    playSpeed: Float,
    onPlaySpeedChange: (Float) -> Unit,
    onSettingsClick: () -> Unit,
    onBackClick: () -> Unit,
    sniffedVideoUrl: String? = null,
    webUrl: String = "",
    isFallbackMode: Boolean = false,
    isCleanView: Boolean = true,
    onCleanViewToggle: () -> Unit = {},
    isPlayerReady: Boolean = false
) {
    var serverMenuExpanded by remember { mutableStateOf(false) }
    var speedMenuExpanded by remember { mutableStateOf(false) }
    var moreMenuExpanded by remember { mutableStateOf(false) }
    val context = LocalContext.current

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                androidx.compose.ui.graphics.Brush.verticalGradient(
                    colors = listOf(Color.Black.copy(alpha = 0.8f), Color.Transparent)
                )
            )
            .statusBarsPadding()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(40.dp)
                    .bounceClick { onBackClick() }
            ) {
                Icon(Icons.Filled.ArrowBack, "Back", tint = Color.White, modifier = Modifier.size(24.dp))
            }
            Text(
                text = title,
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.weight(1f)
            )

            if (isPlayerReady && servers.isNotEmpty()) {
                Box {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .height(32.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.White.copy(alpha = 0.15f))
                            .bounceClick(enabled = isPlayerReady) { serverMenuExpanded = true }
                            .padding(horizontal = 8.dp, vertical = 4.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = servers.getOrNull(selectedServerIndex)?.first ?: "Mặc định",
                                color = Color.White,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.width(2.dp))
                            Icon(Icons.Filled.KeyboardArrowDown, null, tint = Color.White, modifier = Modifier.size(16.dp))
                        }
                    }
                    DropdownMenu(
                        expanded = serverMenuExpanded,
                        onDismissRequest = { serverMenuExpanded = false }
                    ) {
                        servers.forEachIndexed { index, pair ->
                            DropdownMenuItem(
                                text = { Text(pair.first) },
                                onClick = {
                                    onServerChange(index)
                                    serverMenuExpanded = false
                                }
                            )
                        }
                    }
                }
            }

            if (isPlayerReady) {
                Spacer(modifier = Modifier.width(8.dp))

                Box {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .height(32.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.White.copy(alpha = 0.15f))
                            .bounceClick(enabled = isPlayerReady) { speedMenuExpanded = true }
                            .padding(horizontal = 8.dp, vertical = 4.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = if (playSpeed == 1.0f) "1x" else "${playSpeed}x",
                                color = Color.White,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.width(2.dp))
                            Icon(Icons.Filled.KeyboardArrowDown, null, tint = Color.White, modifier = Modifier.size(16.dp))
                        }
                    }
                    
                    DropdownMenu(
                        expanded = speedMenuExpanded,
                        onDismissRequest = { speedMenuExpanded = false }
                    ) {
                        listOf(0.25f, 0.5f, 1.0f, 1.5f, 2.0f, 2.5f, 3.0f).forEach { speed ->
                            DropdownMenuItem(
                                text = { Text("${speed}x") },
                                onClick = {
                                    onPlaySpeedChange(speed)
                                    speedMenuExpanded = false
                                }
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.width(8.dp))

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(40.dp)
                    .bounceClick { onSettingsClick() }
            ) {
                Icon(Icons.Filled.Settings, "Cài đặt", tint = Color.White, modifier = Modifier.size(24.dp))
            }

            Spacer(modifier = Modifier.width(4.dp))

            Box {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(40.dp)
                        .bounceClick { moreMenuExpanded = true }
                ) {
                    Icon(Icons.Filled.MoreVert, "Tùy chọn khác", tint = Color.White, modifier = Modifier.size(24.dp))
                }
                DropdownMenu(
                    expanded = moreMenuExpanded,
                    onDismissRequest = { moreMenuExpanded = false }
                ) {
                    if (webUrl.isNotBlank()) {
                        DropdownMenuItem(
                            text = { Text("Mở bằng trình duyệt") },
                            onClick = {
                                moreMenuExpanded = false
                                kotlin.runCatching {
                                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(webUrl))
                                    context.startActivity(intent)
                                }
                            }
                        )
                    }
                    
                    if (!sniffedVideoUrl.isNullOrBlank()) {
                        DropdownMenuItem(
                            text = { Text("Phát bằng trình phát ngoài") },
                            onClick = {
                                moreMenuExpanded = false
                                kotlin.runCatching {
                                    val intent = Intent(Intent.ACTION_VIEW).apply {
                                        setDataAndType(Uri.parse(sniffedVideoUrl), "video/*")
                                    }
                                    context.startActivity(intent)
                                }
                            }
                        )
                    }
                    
                    if (isFallbackMode) {
                        DropdownMenuItem(
                            text = { Text(if (isCleanView) "Chế độ Web gốc" else "Chế độ Rạp phim") },
                            onClick = {
                                moreMenuExpanded = false
                                onCleanViewToggle()
                            }
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun VideoBottomBar(
    exoPlayer: ExoPlayer,
    chapters: List<BookChapter>,
    selectedServerIndex: Int,
    currentChapterUrl: String,
    onChapterSelect: (String) -> Unit,
    onPlaylistClick: () -> Unit,
    onFullscreenToggle: () -> Unit,
    isFullscreen: Boolean,
    resizeMode: Int = 0,
    onResizeModeChange: () -> Unit = {}
) {
    var currentPos by remember { mutableStateOf(0L) }
    var duration by remember { mutableStateOf(0L) }

    LaunchedEffect(exoPlayer) {
        while (true) {
            currentPos = exoPlayer.currentPosition
            duration = exoPlayer.duration.coerceAtLeast(0L)
            kotlinx.coroutines.delay(1000)
        }
    }

    fun formatTime(ms: Long): String {
        if (ms <= 0) return "00:00"
        val totalSecs = ms / 1000
        val mins = totalSecs / 60
        val secs = totalSecs % 60
        return String.format(java.util.Locale.US, "%02d:%02d", mins, secs)
    }

    val serverChapters = remember(chapters) {
        chapters.filter { !it.isVolume }
    }

    val currentChapInServerIdx = serverChapters.indexOfFirst { it.url == currentChapterUrl }
    val hasPrev = currentChapInServerIdx > 0
    val hasNext = currentChapInServerIdx != -1 && currentChapInServerIdx < serverChapters.size - 1

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                androidx.compose.ui.graphics.Brush.verticalGradient(
                    colors = listOf(Color.Transparent, Color.Black.copy(alpha = 0.85f))
                )
            )
            .navigationBarsPadding()
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp, vertical = 16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                var draggingPos by remember { mutableStateOf<Long?>(null) }

                Text(
                    text = formatTime(draggingPos ?: currentPos),
                    color = Color.White.copy(alpha = 0.85f),
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Medium
                )
                
                val sliderValue = (draggingPos ?: currentPos).toFloat().coerceIn(0f, duration.toFloat().coerceAtLeast(1f))
                val rangeEnd = duration.toFloat().coerceAtLeast(1f)
                
                Slider(
                    value = sliderValue,
                    onValueChange = { value ->
                        draggingPos = value.toLong()
                    },
                    onValueChangeFinished = {
                        draggingPos?.let {
                            if (duration > 0) {
                                exoPlayer.seekTo(it)
                            }
                        }
                        draggingPos = null
                    },
                    valueRange = 0f..rangeEnd,
                    enabled = duration > 0,
                    colors = SliderDefaults.colors(
                        thumbColor = Color.White,
                        activeTrackColor = Color(0xFFD4A574),
                        inactiveTrackColor = Color.White.copy(alpha = 0.24f)
                    ),
                    modifier = Modifier.weight(1f)
                )
                Text(
                    text = if (duration > 0) formatTime(duration) else "--:--",
                    color = Color.White.copy(alpha = 0.85f),
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Medium
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .size(40.dp)
                            .bounceClick(enabled = hasPrev) {
                                onChapterSelect(serverChapters[currentChapInServerIdx - 1].url)
                            }
                    ) {
                        Icon(
                            imageVector = Icons.Filled.SkipPrevious,
                            contentDescription = "Tập trước",
                            tint = if (hasPrev) Color.White else Color.White.copy(alpha = 0.3f),
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .size(40.dp)
                            .bounceClick(enabled = hasNext) {
                                onChapterSelect(serverChapters[currentChapInServerIdx + 1].url)
                            }
                    ) {
                        Icon(
                            imageVector = Icons.Filled.SkipNext,
                            contentDescription = "Tập sau",
                            tint = if (hasNext) Color.White else Color.White.copy(alpha = 0.3f),
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }

                Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .size(40.dp)
                            .bounceClick { onPlaylistClick() }
                    ) {
                        Icon(
                            imageVector = Icons.Filled.QueuePlayNext,
                            contentDescription = "Danh sách tập",
                            tint = Color.White,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .size(40.dp)
                            .bounceClick { onResizeModeChange() }
                    ) {
                        Icon(
                            imageVector = Icons.Filled.AspectRatio,
                            contentDescription = "Tỷ lệ màn hình",
                            tint = Color.White,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .size(40.dp)
                            .bounceClick { onFullscreenToggle() }
                    ) {
                        Icon(
                            imageVector = if (isFullscreen) Icons.Filled.FullscreenExit else Icons.Filled.Fullscreen,
                            contentDescription = "Toàn màn hình",
                            tint = Color.White,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun VideoPlaylistBottomSheet(
    chapters: List<BookChapter>,
    currentChapterUrl: String,
    selectedServerIndex: Int,
    onChapterClick: (String) -> Unit,
    onDismiss: () -> Unit
) {
    val serverTabs = remember(chapters) {
        val list = mutableListOf<String>()
        chapters.forEach { ch ->
            if (ch.isVolume) {
                list.add(ch.title)
            }
        }
        if (list.isEmpty()) list.add("Mặc định")
        list
    }

    var selectedTabIdx by remember { mutableStateOf(0) }
    var searchQuery by remember { mutableStateOf("") }

    val filteredChapters = remember(chapters, selectedTabIdx, searchQuery) {
        val serverName = serverTabs.getOrNull(selectedTabIdx) ?: "Mặc định"
        val list = mutableListOf<BookChapter>()
        var currentServer = "Mặc định"
        
        chapters.forEach { ch ->
            if (ch.isVolume) {
                currentServer = ch.title
            } else {
                if (currentServer == serverName || serverTabs.size == 1) {
                    if (searchQuery.isBlank() || ch.title.contains(searchQuery, ignoreCase = true)) {
                        list.add(ch)
                    }
                }
            }
        }
        list
    }

    ModalBottomSheet(
        onDismissRequest = onDismiss,
        containerColor = Color(0xFF141210),
        tonalElevation = 8.dp
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Danh sách tập", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                IconButton(onClick = onDismiss) {
                    Icon(Icons.Filled.Close, "Đóng", tint = Color.White)
                }
            }

            if (serverTabs.size > 1) {
                ScrollableTabRow(
                    selectedTabIndex = selectedTabIdx,
                    containerColor = Color.Transparent,
                    contentColor = Color.White,
                    edgePadding = 0.dp,
                    indicator = { tabPositions ->
                        TabRowDefaults.SecondaryIndicator(
                            color = Color(0xFFD4A574),
                            modifier = Modifier.tabIndicatorOffset(tabPositions[selectedTabIdx])
                        )
                    }
                ) {
                    serverTabs.forEachIndexed { index, name ->
                        Tab(
                            selected = selectedTabIdx == index,
                            onClick = { selectedTabIdx = index },
                            text = { Text(name, fontSize = 13.sp, fontWeight = FontWeight.Bold, color = if (selectedTabIdx == index) Color(0xFFD4A574) else Color.White.copy(alpha = 0.6f)) }
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            OutlinedTextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                placeholder = { Text("Tìm kiếm tập phim...", color = Color.White.copy(alpha = 0.4f), fontSize = 13.sp) },
                singleLine = true,
                modifier = Modifier.fillMaxWidth().height(48.dp),
                shape = RoundedCornerShape(12.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFFD4A574),
                    unfocusedBorderColor = Color.White.copy(alpha = 0.2f),
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            LazyVerticalGrid(
                columns = GridCells.Fixed(4),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.fillMaxWidth().weight(1f, fill = false).defaultMinSize(minHeight = 200.dp)
            ) {
                items(filteredChapters) { ch ->
                    val isCurrent = ch.url == currentChapterUrl
                    val btnBg = if (isCurrent) Color(0xFFD4A574) else Color(0xFF26211D)
                    val textColor = if (isCurrent) Color(0xFF141210) else Color.White

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(44.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(btnBg)
                            .clickable { onChapterClick(ch.url) },
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = ch.title,
                            color = textColor,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun VideoSettingsBottomSheet(
    onDismiss: () -> Unit
) {
    val context = LocalContext.current
    val prefs = remember { context.getSharedPreferences("novel_reader_prefs", Context.MODE_PRIVATE) }

    var autoPlay by remember { mutableStateOf(prefs.getBoolean("video_auto_play", true)) }
    var autoNext by remember { mutableStateOf(prefs.getBoolean("video_auto_next", true)) }
    var autoContinue by remember { mutableStateOf(prefs.getBoolean("video_auto_continue", false)) }
    var seekStep by remember { mutableStateOf(prefs.getInt("video_seek_step", 10)) }
    var keepScreenOn by remember { mutableStateOf(prefs.getBoolean("video_keep_screen_on", true)) }

    ModalBottomSheet(
        onDismissRequest = onDismiss,
        containerColor = Color(0xFF141210)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Cài đặt phát video", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                IconButton(onClick = onDismiss) {
                    Icon(Icons.Filled.Close, "Đóng", tint = Color.White)
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(text = "Phát lại", color = Color(0xFFD4A574), fontSize = 12.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Tự động phát", color = Color.White, fontSize = 14.sp)
                Switch(
                    checked = autoPlay,
                    onCheckedChange = {
                        autoPlay = it
                        prefs.edit().putBoolean("video_auto_play", it).apply()
                    },
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Color(0xFFD4A574),
                        checkedTrackColor = Color(0xFFD4A574).copy(alpha = 0.5f)
                    )
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Tự động chuyển tập", color = Color.White, fontSize = 14.sp)
                Switch(
                    checked = autoNext,
                    onCheckedChange = {
                        autoNext = it
                        prefs.edit().putBoolean("video_auto_next", it).apply()
                    },
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Color(0xFFD4A574),
                        checkedTrackColor = Color(0xFFD4A574).copy(alpha = 0.5f)
                    )
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Tự động tiếp tục từ vị trí trước", color = Color.White, fontSize = 14.sp)
                Switch(
                    checked = autoContinue,
                    onCheckedChange = {
                        autoContinue = it
                        prefs.edit().putBoolean("video_auto_continue", it).apply()
                    },
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Color(0xFFD4A574),
                        checkedTrackColor = Color(0xFFD4A574).copy(alpha = 0.5f)
                    )
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(text = "Tua tới/Tua lùi", color = Color(0xFFD4A574), fontSize = 12.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                listOf(5, 10, 15, 30).forEach { secs ->
                    val isSelected = seekStep == secs
                    val bg = if (isSelected) Color(0xFFD4A574) else Color(0xFF26211D)
                    val textCol = if (isSelected) Color(0xFF141210) else Color.White
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(36.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(bg)
                            .clickable {
                                seekStep = secs
                                prefs.edit().putInt("video_seek_step", secs).apply()
                            },
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "${secs}s", color = textCol, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(text = "Hiển thị & Năng lượng", color = Color(0xFFD4A574), fontSize = 12.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Giữ màn hình luôn bật khi xem phim", color = Color.White, fontSize = 14.sp)
                Switch(
                    checked = keepScreenOn,
                    onCheckedChange = {
                        keepScreenOn = it
                        prefs.edit().putBoolean("video_keep_screen_on", it).apply()
                    },
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Color(0xFFD4A574),
                        checkedTrackColor = Color(0xFFD4A574).copy(alpha = 0.5f)
                    )
                )
            }

            Spacer(modifier = Modifier.height(32.dp))
        }
    }
}

@Composable
private fun Modifier.bounceClick(
    enabled: Boolean = true,
    onClick: () -> Unit
): Modifier {
    if (!enabled) return this
    var isPressed by remember { mutableStateOf(false) }
    val scale by animateFloatAsState(
        targetValue = if (isPressed) 0.82f else 1f,
        animationSpec = tween(durationMillis = 80),
        label = "bounceScale"
    )
    return this
        .graphicsLayer {
            scaleX = scale
            scaleY = scale
        }
        .pointerInput(onClick) {
            detectTapGestures(
                onPress = {
                    isPressed = true
                    tryAwaitRelease()
                    isPressed = false
                },
                onTap = { onClick() }
            )
        }
}

private fun extractRealVideoUrl(url: String): String {
    try {
        val uri = android.net.Uri.parse(url)
        for (paramName in uri.queryParameterNames) {
            val paramValue = uri.getQueryParameter(paramName) ?: continue
            if (paramValue.startsWith("http") && 
                (paramValue.contains(".m3u8", ignoreCase = true) || 
                 paramValue.contains(".mp4", ignoreCase = true) ||
                 paramValue.contains(".mpd", ignoreCase = true))) {
                return paramValue
            }
        }
    } catch (e: Exception) {
        // Ignore
    }
    return url
}

private fun isValidVideoUrl(url: String): Boolean {
    val lower = url.lowercase()
    if (lower.contains("ping.gif") || lower.contains("/ping") || lower.contains("analytics") || lower.contains("telemetry")) {
        return false
    }
    val path = try { android.net.Uri.parse(url).path?.lowercase() ?: "" } catch(e: Exception) { "" }
    val invalidExts = listOf(".gif", ".png", ".jpg", ".jpeg", ".webp", ".js", ".css", ".ico", ".woff", ".ttf")
    if (invalidExts.any { path.endsWith(it) }) {
        return false
    }
    return true
}

