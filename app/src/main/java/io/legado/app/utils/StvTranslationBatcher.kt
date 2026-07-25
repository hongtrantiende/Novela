package io.legado.app.utils

import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlin.coroutines.cancellation.CancellationException

data class StvSingleResult(
    val text: String,
    val success: Boolean
)

object StvTranslationBatcher {

    private data class BatchRequest(
        val text: String,
        val isMeta: Boolean,
        val engine: String,
        val mode: String,
        val deferred: CompletableDeferred<StvSingleResult>
    )

    private data class BatchKey(
        val text: String,
        val isMeta: Boolean,
        val engine: String,
        val mode: String
    )

    private val batcherScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private val channel = Channel<BatchRequest>(Channel.UNLIMITED)
    private val lruCache = android.util.LruCache<BatchKey, String>(500)

    init {
        batcherScope.launch {
            while (isActive) {
                val firstRequest = channel.receiveCatching().getOrNull() ?: break
                val requests = mutableListOf(firstRequest)

                // Windowing / Debouncing: wait 25ms to gather requests from same frame/recomposition
                val windowEndTime = System.currentTimeMillis() + 25L
                while (System.currentTimeMillis() < windowEndTime) {
                    val pollResult = channel.tryReceive().getOrNull()
                    if (pollResult != null) {
                        requests.add(pollResult)
                    } else {
                        delay(5)
                    }
                }

                // Drain any remaining immediately available requests in channel
                while (true) {
                    val next = channel.tryReceive().getOrNull() ?: break
                    requests.add(next)
                }

                // Filter out requests where deferred is cancelled
                val validRequests = requests.filter { !it.deferred.isCancelled }
                if (validRequests.isEmpty()) continue

                // Group by (engine, mode)
                val groupedByEngine = validRequests.groupBy { Pair(it.engine, it.mode) }

                for ((engineMode, groupRequests) in groupedByEngine) {
                    val (engine, mode) = engineMode

                    val metaRequests = groupRequests.filter { it.isMeta }
                    val contentRequests = groupRequests.filter { !it.isMeta }

                    // Priority: Process Metadata first, Content second
                    if (metaRequests.isNotEmpty()) {
                        processGroup(metaRequests, engine, mode, isMeta = true)
                    }
                    if (contentRequests.isNotEmpty()) {
                        processGroup(contentRequests, engine, mode, isMeta = false)
                    }
                }
            }
        }
    }

    fun clearCache() {
        lruCache.evictAll()
    }

    suspend fun translateDetailed(
        text: String,
        isMeta: Boolean,
        engine: String,
        mode: String
    ): StvSingleResult {
        if (text.isBlank()) return StvSingleResult(text, success = true)

        val deferred = CompletableDeferred<StvSingleResult>()
        val request = BatchRequest(
            text = text,
            isMeta = isMeta,
            engine = engine,
            mode = mode,
            deferred = deferred
        )

        channel.send(request)

        return try {
            deferred.await()
        } catch (e: CancellationException) {
            deferred.cancel()
            throw e
        } catch (e: Throwable) {
            StvSingleResult(text, success = false)
        }
    }

    suspend fun translate(
        text: String,
        isMeta: Boolean,
        engine: String,
        mode: String
    ): String {
        return translateDetailed(text, isMeta, engine, mode).text
    }

    private suspend fun processGroup(
        group: List<BatchRequest>,
        engine: String,
        mode: String,
        isMeta: Boolean
    ) {
        val uncachedGroup = mutableListOf<BatchRequest>()

        for (req in group) {
            if (req.deferred.isCancelled) continue

            val key = BatchKey(req.text, isMeta, engine, mode)
            val cachedResult = lruCache.get(key)
            if (cachedResult != null) {
                req.deferred.complete(StvSingleResult(cachedResult, success = true))
            } else {
                uncachedGroup.add(req)
            }
        }

        if (uncachedGroup.isEmpty()) return

        val distinctTexts = mutableListOf<String>()
        val deferredsMap = mutableMapOf<String, MutableList<CompletableDeferred<StvSingleResult>>>()

        for (req in uncachedGroup) {
            if (req.deferred.isCancelled) continue
            if (!deferredsMap.containsKey(req.text)) {
                distinctTexts.add(req.text)
                deferredsMap[req.text] = mutableListOf(req.deferred)
            } else {
                deferredsMap[req.text]?.add(req.deferred)
            }
        }

        if (distinctTexts.isEmpty()) return

        val batches = chunkRequests(distinctTexts, maxItems = 200, maxChars = 24000)

        for (batchTexts in batches) {
            try {
                val batchResult = TranslateUtils.translateBatchWithEngineDetailed(
                    texts = batchTexts,
                    engine = engine,
                    mode = mode,
                    isMeta = isMeta
                )

                for (i in batchTexts.indices) {
                    val rawText = batchTexts[i]
                    val translatedText = batchResult.values.getOrElse(i) { rawText }

                    if (batchResult.success) {
                        val key = BatchKey(rawText, isMeta, engine, mode)
                        lruCache.put(key, translatedText)
                    }

                    val singleResult = StvSingleResult(translatedText, batchResult.success)
                    val list = deferredsMap[rawText].orEmpty()
                    for (def in list) {
                        if (!def.isCancelled && !def.isCompleted) {
                            def.complete(singleResult)
                        }
                    }
                }
            } catch (e: Throwable) {
                e.printStackTrace()
                for (rawText in batchTexts) {
                    val singleResult = StvSingleResult(rawText, success = false)
                    val list = deferredsMap[rawText].orEmpty()
                    for (def in list) {
                        if (!def.isCancelled && !def.isCompleted) {
                            def.complete(singleResult)
                        }
                    }
                }
            }
        }
    }

    private fun chunkRequests(
        texts: List<String>,
        maxItems: Int,
        maxChars: Int
    ): List<List<String>> {
        val result = mutableListOf<List<String>>()
        var currentBatch = mutableListOf<String>()
        var currentChars = 0

        for (text in texts) {
            if (currentBatch.size >= maxItems || (currentChars + text.length > maxChars && currentBatch.isNotEmpty())) {
                result.add(currentBatch)
                currentBatch = mutableListOf()
                currentChars = 0
            }
            currentBatch.add(text)
            currentChars += text.length
        }
        if (currentBatch.isNotEmpty()) {
            result.add(currentBatch)
        }
        return result
    }
}
