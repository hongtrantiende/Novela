package io.legado.app.help.tts

import io.legado.app.constant.AppLog
import io.legado.app.help.http.SSLHelper
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withTimeout
import okhttp3.ConnectionSpec
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.WebSocket
import okhttp3.WebSocketListener
import okio.ByteString
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.security.MessageDigest
import java.util.UUID
import java.util.concurrent.TimeUnit
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

/**
 * Microsoft Edge TTS client using OkHttp WebSocket.
 *
 * Implements the Edge Read Aloud protocol:
 * 1. Connect via WebSocket to speech.platform.bing.com
 * 2. Send output format config
 * 3. Send SSML with voice/rate/pitch
 * 4. Receive binary audio frames
 * 5. Return assembled audio as InputStream
 */
object EdgeTtsClient {
    private const val TAG = "EdgeTtsClient"

    private const val TRUSTED_CLIENT_TOKEN = "6A5AA1D4EAFF4E9FB37E23D68491D6F4"
    private const val BASE_URL =
        "speech.platform.bing.com/consumer/speech/synthesize/readaloud"
    private const val WSS_URL =
        "wss://$BASE_URL/edge/v1?TrustedClientToken=$TRUSTED_CLIENT_TOKEN"

    private const val CHROMIUM_FULL_VERSION = "143.0.3650.75"
    private const val CHROMIUM_MAJOR_VERSION = "143"
    private const val SEC_MS_GEC_VERSION = "1-$CHROMIUM_FULL_VERSION"

    // Windows epoch offset (seconds between 1601-01-01 and 1970-01-01)
    private const val WIN_EPOCH = 11644473600L
    private const val TICKS_PER_SECOND = 10_000_000L

    private const val OUTPUT_FORMAT = "audio-24khz-48kbitrate-mono-mp3"

    /**
     * Dedicated OkHttpClient for Edge TTS WebSocket connections.
     * Uses a clean client without app interceptors to avoid header conflicts.
     */
    private val wsClient: OkHttpClient by lazy {
        OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .pingInterval(20, TimeUnit.SECONDS)
            .sslSocketFactory(SSLHelper.unsafeSSLSocketFactory, SSLHelper.unsafeTrustManager)
            .hostnameVerifier(SSLHelper.unsafeHostnameVerifier)
            .connectionSpecs(
                listOf(
                    ConnectionSpec.MODERN_TLS,
                    ConnectionSpec.COMPATIBLE_TLS,
                    ConnectionSpec.CLEARTEXT
                )
            )
            .retryOnConnectionFailure(true)
            .build()
    }

    /**
     * Synthesize text to audio using Edge TTS.
     *
     * @param text The text to synthesize
     * @param voiceName The Edge TTS voice name (e.g. "vi-VN-HoaiMyNeural")
     * @param rate Speed adjustment: -100 to +200 (percent offset from normal)
     * @param pitch Pitch adjustment in Hz offset
     * @param volume Volume adjustment: -100 to +100 (percent offset from normal)
     * @return InputStream of MP3 audio data
     */
    suspend fun synthesize(
        text: String,
        voiceName: String = "vi-VN-HoaiMyNeural",
        rate: Int = 0,
        pitch: Int = 0,
        volume: Int = 0,
    ): InputStream = withTimeout(60_000L) {
        val requestId = UUID.randomUUID().toString().replace("-", "")

        val secMsGec = generateSecMsGec()
        val wssUrl = "$WSS_URL&Sec-MS-GEC=$secMsGec" +
                "&Sec-MS-GEC-Version=$SEC_MS_GEC_VERSION" +
                "&ConnectionId=$requestId"

        AppLog.put("EdgeTTS: connecting to endpoint, voice=$voiceName, rate=$rate")

        val request = Request.Builder()
            .url(wssUrl)
            .header(
                "User-Agent",
                "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36" +
                        " (KHTML, like Gecko) Chrome/$CHROMIUM_MAJOR_VERSION.0.0.0 Safari/537.36" +
                        " Edg/$CHROMIUM_MAJOR_VERSION.0.0.0"
            )
            .header("Origin", "chrome-extension://jdiccldimpdaibmpdkjnbmckianbfold")
            .header("Pragma", "no-cache")
            .header("Cache-Control", "no-cache")
            .header("Accept-Encoding", "gzip, deflate, br")
            .header("Accept-Language", "en-US,en;q=0.9")
            .build()

        val rateStr = if (rate >= 0) "+${rate}%" else "${rate}%"
        val pitchStr = if (pitch >= 0) "+${pitch}Hz" else "${pitch}Hz"
        val volumeStr = if (volume >= 0) "+${volume}%" else "${volume}%"

        val cleanText = text
            .replace("&", "&amp;")
            .replace("<", "&lt;")
            .replace(">", "&gt;")
            .replace("\"", "&quot;")
            .replace("'", "&apos;")
            // Remove control characters that Edge TTS doesn't support
            .replace(Regex("[\\x00-\\x08\\x0b\\x0c\\x0e-\\x1f]"), " ")

        val ssml = "<speak version=\"1.0\" xmlns=\"http://www.w3.org/2001/10/synthesis\" xml:lang=\"vi-VN\">" +
                "<voice name=\"$voiceName\">" +
                "<prosody rate=\"$rateStr\" pitch=\"$pitchStr\" volume=\"$volumeStr\">" +
                cleanText +
                "</prosody></voice></speak>"

        val configMessage = "Content-Type:application/json; charset=utf-8\r\n" +
                "Path:speech.config\r\n\r\n" +
                "{\"context\":{\"synthesis\":{\"audio\":{\"metadataoptions\":" +
                "{\"sentenceBoundaryEnabled\":\"false\",\"wordBoundaryEnabled\":\"false\"}," +
                "\"outputFormat\":\"$OUTPUT_FORMAT\"}}}}"

        val ssmlMessage = "X-RequestId:$requestId\r\n" +
                "Content-Type:application/ssml+xml\r\n" +
                "Path:ssml\r\n\r\n" + ssml

        suspendCancellableCoroutine { continuation ->
            val audioBuffer = ByteArrayOutputStream()
            var receivedAudio = false
            var completed = false

            val ws = wsClient.newWebSocket(request, object : WebSocketListener() {
                override fun onOpen(webSocket: WebSocket, response: Response) {
                    AppLog.put("EdgeTTS: WebSocket opened, sending config and SSML")
                    webSocket.send(configMessage)
                    webSocket.send(ssmlMessage)
                }

                override fun onMessage(webSocket: WebSocket, text: String) {
                    if (text.contains("Path:turn.end")) {
                        AppLog.put("EdgeTTS: turn.end received, audio size=${audioBuffer.size()}")
                        webSocket.close(1000, "Done")
                        if (!completed) {
                            completed = true
                            if (receivedAudio && audioBuffer.size() > 0) {
                                continuation.resume(ByteArrayInputStream(audioBuffer.toByteArray()))
                            } else {
                                continuation.resumeWithException(
                                    Exception("Edge TTS: No audio data received")
                                )
                            }
                        }
                    }
                }

                override fun onMessage(webSocket: WebSocket, bytes: ByteString) {
                    try {
                        val data = bytes.toByteArray()
                        if (data.size < 2) return

                        // First 2 bytes: header length (big-endian unsigned short)
                        val headerLen = ((data[0].toInt() and 0xFF) shl 8) or
                                (data[1].toInt() and 0xFF)

                        val audioStart = headerLen + 2
                        if (audioStart < data.size) {
                            val headerText = String(data, 2, headerLen, Charsets.UTF_8)
                            if (headerText.contains("Path:audio")) {
                                audioBuffer.write(data, audioStart, data.size - audioStart)
                                receivedAudio = true
                            }
                        }
                    } catch (e: Exception) {
                        AppLog.put("EdgeTTS: binary parse error: ${e.message}", e)
                    }
                }

                override fun onFailure(
                    webSocket: WebSocket,
                    t: Throwable,
                    response: Response?
                ) {
                    val responseBody = try {
                        response?.body?.string()?.take(200) ?: "no response body"
                    } catch (_: Exception) {
                        "could not read response body"
                    }
                    val msg = "EdgeTTS: WebSocket failure: ${t.javaClass.simpleName}: ${t.message}, " +
                            "response code=${response?.code}, body=$responseBody"
                    AppLog.put(msg, t)
                    if (!completed) {
                        completed = true
                        continuation.resumeWithException(Exception(msg, t))
                    }
                }

                override fun onClosing(webSocket: WebSocket, code: Int, reason: String) {
                    webSocket.close(code, reason)
                }

                override fun onClosed(webSocket: WebSocket, code: Int, reason: String) {
                    if (!completed) {
                        completed = true
                        if (receivedAudio && audioBuffer.size() > 0) {
                            continuation.resume(ByteArrayInputStream(audioBuffer.toByteArray()))
                        } else {
                            continuation.resumeWithException(
                                Exception("EdgeTTS: closed without audio (code=$code, reason=$reason)")
                            )
                        }
                    }
                }
            })

            continuation.invokeOnCancellation {
                ws.cancel()
            }
        }
    }

    /**
     * Generate the Sec-MS-GEC token required by Edge TTS.
     * SHA-256 hash of (ticks_str + trusted_client_token),
     * where ticks is Windows file time rounded down to nearest 5 minutes.
     */
    private fun generateSecMsGec(): String {
        val currentTimeSec = System.currentTimeMillis() / 1000L
        val ticks = (currentTimeSec + WIN_EPOCH) * TICKS_PER_SECOND
        // Round down to nearest 5 minutes (3_000_000_000 ticks = 300 seconds)
        val roundedTicks = ticks - (ticks % 3_000_000_000L)
        val input = "${roundedTicks}$TRUSTED_CLIENT_TOKEN"
        val digest = MessageDigest.getInstance("SHA-256")
        val hash = digest.digest(input.toByteArray(Charsets.UTF_8))
        return hash.joinToString("") { "%02X".format(it) }
    }

    /**
     * Check if a URL is an Edge TTS source.
     */
    fun isEdgeTtsUrl(url: String): Boolean {
        return url.startsWith("edge-tts://")
    }

    /**
     * Parse voice name from edge-tts:// URL.
     * Format: edge-tts://vi-VN-HoaiMyNeural
     */
    fun parseVoiceName(url: String): String {
        return url.removePrefix("edge-tts://")
    }
}
