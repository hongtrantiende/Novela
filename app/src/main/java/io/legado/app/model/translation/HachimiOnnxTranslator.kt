package io.legado.app.model.translation

import ai.onnxruntime.OnnxTensor
import ai.onnxruntime.OrtEnvironment
import ai.onnxruntime.OrtSession
import ai.onnxruntime.extensions.OrtxPackage
import android.content.Context
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import org.json.JSONObject
import splitties.init.appCtx
import timber.log.Timber
import java.io.File
import java.nio.FloatBuffer
import java.nio.LongBuffer

object HachimiOnnxTranslator {

    private val mutex = Mutex()
    private var ortEnv: OrtEnvironment? = null
    private var encoderSession: OrtSession? = null
    private var decoderSession: OrtSession? = null
    private var tokenizerSession: OrtSession? = null
    private var detokenizerSession: OrtSession? = null
    private var isInitialized = false
    private var loadedModelId: String? = null

    // Model config — read from model_manifest.json
    private var decoderLayers = 2
    private var attentionHeads = 8
    private var headDimension = 64
    private var decoderStartTokenId = 0L
    private var eosTokenId = 2L
    private var padTokenId = 0L
    private var vocabSizeConfig = 24000

    private const val MAX_SOURCE_TOKENS = 512
    private const val MAX_GENERATE_TOKENS = 256
    private const val MIN_CJK_RATIO = 0.15

    /**
     * Check if text contains enough Chinese characters to warrant translation.
     * Returns false for Vietnamese, English, or other non-CJK text.
     */
    private fun hasChinese(text: String): Boolean {
        if (text.isBlank()) return false
        var cjkCount = 0
        var totalLetters = 0
        for (c in text) {
            if (c.isLetterOrDigit()) {
                totalLetters++
                val block = Character.UnicodeBlock.of(c)
                if (block == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS ||
                    block == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A ||
                    block == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B ||
                    block == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
                ) {
                    cjkCount++
                }
            }
        }
        return totalLetters > 0 && cjkCount.toFloat() / totalLetters >= MIN_CJK_RATIO
    }

    private fun initSessions(context: Context = appCtx) {
        val currentModelId = HachimiModelManager.selectedModelId
        // Reinitialize if model changed
        if (isInitialized && loadedModelId != currentModelId) {
            Log.d("HachimiMT", "Model changed from $loadedModelId to $currentModelId, reinitializing")
            close()
        }
        if (isInitialized) return

        val modelDir = HachimiModelManager.getModelDir(context, currentModelId)
        val encoderFile = File(modelDir, "encoder_model.onnx")
        val decoderFile = File(modelDir, "decoder_model_merged.onnx")
        val tokenizerFile = File(modelDir, "tokenizer.onnx")
        val detokenizerFile = File(modelDir, "detokenizer.onnx")
        val manifestFile = File(modelDir, "model_manifest.json")

        // Read model config from manifest
        if (manifestFile.exists()) {
            try {
                val json = JSONObject(manifestFile.readText())
                val gen = json.optJSONObject("generation")
                if (gen != null) {
                    decoderLayers = gen.optInt("decoderLayers", 2)
                    attentionHeads = gen.optInt("attentionHeads", 8)
                    headDimension = gen.optInt("headDimension", 64)
                    decoderStartTokenId = gen.optLong("decoderStartTokenId", 0L)
                    eosTokenId = gen.optLong("eosTokenId", 2L)
                    padTokenId = gen.optLong("padTokenId", 0L)
                    vocabSizeConfig = gen.optInt("vocabSize", 24000)
                    Log.d("HachimiMT", "Model config: layers=$decoderLayers, heads=$attentionHeads, dim=$headDimension, startTok=$decoderStartTokenId, eosTok=$eosTokenId")
                }
            } catch (e: Exception) {
                Log.w("HachimiMT", "Failed to read model_manifest.json, using defaults", e)
            }
        }

        if (!encoderFile.exists() || !decoderFile.exists()) {
            val err = "HachimiMT ONNX model files are missing at ${modelDir.absolutePath}"
            Log.e("HachimiMT", err)
            throw IllegalStateException(err)
        }

        try {
            val env = OrtEnvironment.getEnvironment()
            ortEnv = env

            val opts = OrtSession.SessionOptions().apply {
                setIntraOpNumThreads(2)
                setOptimizationLevel(OrtSession.SessionOptions.OptLevel.BASIC_OPT)
                runCatching {
                    val libPath = OrtxPackage.getLibraryPath()
                    registerCustomOpLibrary(libPath)
                    Log.d("HachimiMT", "Registered custom op library for ONNX extensions: $libPath")
                }.onFailure { e ->
                    Log.e("HachimiMT", "Failed to register custom op library for ONNX extensions", e)
                }
            }

            encoderSession = env.createSession(encoderFile.absolutePath, opts)
            decoderSession = env.createSession(decoderFile.absolutePath, opts)
            Log.d("HachimiMT", "Encoder and Decoder sessions created successfully")

            if (tokenizerFile.exists()) {
                runCatching {
                    tokenizerSession = env.createSession(tokenizerFile.absolutePath, opts)
                    Log.d("HachimiMT", "Tokenizer session created successfully")
                }.onFailure { e ->
                    Log.e("HachimiMT", "Tokenizer session creation failed", e)
                }
            } else {
                Log.w("HachimiMT", "tokenizer.onnx does not exist at ${tokenizerFile.absolutePath}")
            }

            if (detokenizerFile.exists()) {
                runCatching {
                    detokenizerSession = env.createSession(detokenizerFile.absolutePath, opts)
                    Log.d("HachimiMT", "Detokenizer session created successfully")
                }.onFailure { e ->
                    Log.e("HachimiMT", "Detokenizer session creation failed", e)
                }
            } else {
                Log.w("HachimiMT", "detokenizer.onnx does not exist at ${detokenizerFile.absolutePath}")
            }

            isInitialized = true
            loadedModelId = currentModelId
            Log.d("HachimiMT", "HachimiMT ONNX translator initialized successfully (model=$currentModelId)")
        } catch (e: Exception) {
            Log.e("HachimiMT", "Failed to initialize HachimiMT ONNX sessions", e)
            close()
            throw e
        }
    }

    suspend fun translate(
        text: String,
        context: Context = appCtx
    ): Result<String> = withContext(Dispatchers.Default) {
        if (text.isBlank()) return@withContext Result.success("")

        mutex.withLock {
            try {
                // Migrate old model directory structure on first use
                HachimiModelManager.migrateOldModelIfNeeded(context)

                if (!HachimiModelManager.isModelReady(context)) {
                    val prepareResult = HachimiModelManager.ensureModelReady(context)
                    if (prepareResult.isFailure) {
                        Log.e("HachimiMT", "Model not ready and prepare failed")
                        return@withContext Result.failure(
                            prepareResult.exceptionOrNull() ?: Exception("Failed to download HachimiMT model")
                        )
                    }
                }

                initSessions(context)

                val paragraphs = text.split("\n")
                val translatedParagraphs = mutableListOf<String>()

                for (paragraph in paragraphs) {
                    val trimmed = paragraph.trim()
                    if (trimmed.isEmpty()) {
                        translatedParagraphs.add("")
                        continue
                    }

                    // Skip non-Chinese text (Vietnamese, English, etc.)
                    if (!hasChinese(trimmed)) {
                        translatedParagraphs.add(trimmed)
                        continue
                    }

                    val paragraphResult = translateParagraph(trimmed, context)
                    translatedParagraphs.add(paragraphResult)
                }

                val finalResult = translatedParagraphs.joinToString("\n")
                Log.d("HachimiMT", "Translation result: '$text' -> '$finalResult'")
                Result.success(finalResult)
            } catch (e: Throwable) {
                Log.e("HachimiMT", "HachimiMT ONNX translation failed completely, falling back to VietPhrase", e)
                val fallbackText = fallbackTranslate(text, context)
                Result.success(fallbackText)
            }
        }
    }

    private fun translateParagraph(paragraph: String, context: Context): String {
        val env = ortEnv ?: return fallbackTranslate(paragraph, context)
        val encSession = encoderSession ?: return fallbackTranslate(paragraph, context)
        val decSession = decoderSession ?: return fallbackTranslate(paragraph, context)

        try {
            val inputIds = tokenizeText(paragraph, env)
            if (inputIds.isEmpty()) {
                Log.w("HachimiMT", "Tokenize returned empty ids for paragraph: $paragraph")
                return fallbackTranslate(paragraph, context)
            }

            val encoderSeqLen = inputIds.size
            val attentionMask = LongArray(encoderSeqLen) { 1L }

            val inputIdsShape = longArrayOf(1, encoderSeqLen.toLong())
            val inputIdsTensor = OnnxTensor.createTensor(env, LongBuffer.wrap(inputIds), inputIdsShape)
            val maskTensor = OnnxTensor.createTensor(env, LongBuffer.wrap(attentionMask), inputIdsShape)

            val encInputs = mapOf(
                "input_ids" to inputIdsTensor,
                "attention_mask" to maskTensor
            )

            // Run Encoder
            val encResult = encSession.run(encInputs)
            val lastHiddenState = encResult.get(0) as OnnxTensor

            // Greedy decoding loop with KV Caching
            // KEY INSIGHT: Optimum ONNX merged decoder outputs empty (batch=0) encoder KV
            // when use_cache_branch=True. We must keep encoder KV from step 0 separately.
            val generatedTokens = mutableListOf<Long>(decoderStartTokenId)
            var currentStepInputIds = longArrayOf(decoderStartTokenId)
            var useCache = false
            var decoderKvCache = mutableMapOf<String, OnnxTensor>()
            var encoderKvCache = mutableMapOf<String, OnnxTensor>() // Set once from step 0
            val decoderInputNames = decSession.inputNames

            var step = 0

            while (step < MAX_GENERATE_TOKENS) {
                val stepDecShape = longArrayOf(1, currentStepInputIds.size.toLong())
                val decTensor = OnnxTensor.createTensor(env, LongBuffer.wrap(currentStepInputIds), stepDecShape)

                val decInputs = mutableMapOf<String, OnnxTensor>()
                decInputs["input_ids"] = decTensor
                decInputs["encoder_hidden_states"] = lastHiddenState
                decInputs["encoder_attention_mask"] = maskTensor

                var useCacheTensor: OnnxTensor? = null
                val createdDummyTensors = mutableListOf<OnnxTensor>()

                if (decoderInputNames.contains("use_cache_branch")) {
                    useCacheTensor = OnnxTensor.createTensor(env, booleanArrayOf(useCache))
                    decInputs["use_cache_branch"] = useCacheTensor
                }

                for (name in decoderInputNames) {
                    if (name.startsWith("past_key_values")) {
                        if (name.contains(".encoder.")) {
                            // Use stored encoder KV cache (from step 0) if available
                            val cached = encoderKvCache[name]
                            if (cached != null) {
                                decInputs[name] = cached
                            } else {
                                val shape = longArrayOf(1, attentionHeads.toLong(), encoderSeqLen.toLong(), headDimension.toLong())
                                val numElements = 1 * attentionHeads * encoderSeqLen * headDimension
                                val emptyBuf = FloatBuffer.allocate(numElements)
                                val dummyTensor = OnnxTensor.createTensor(env, emptyBuf, shape)
                                decInputs[name] = dummyTensor
                                createdDummyTensors.add(dummyTensor)
                            }
                        } else {
                            // Decoder KV: use cached or create empty
                            val cached = decoderKvCache[name]
                            if (cached != null) {
                                decInputs[name] = cached
                            } else {
                                val shape = longArrayOf(1, attentionHeads.toLong(), 0, headDimension.toLong())
                                val emptyBuf = FloatBuffer.allocate(0)
                                val dummyTensor = OnnxTensor.createTensor(env, emptyBuf, shape)
                                decInputs[name] = dummyTensor
                                createdDummyTensors.add(dummyTensor)
                            }
                        }
                    }
                }

                val decResult = decSession.run(decInputs)
                val logitsTensor = decResult.get(0) as OnnxTensor
                val logits = logitsTensor.floatBuffer

                val currentVocabSize = (logitsTensor.info.shape.lastOrNull() ?: vocabSizeConfig.toLong()).toInt()
                val lastPosOffset = (currentStepInputIds.size - 1) * currentVocabSize
                var maxIdx = 0
                var maxVal = Float.NEGATIVE_INFINITY

                val genSize = generatedTokens.size

                for (v in 0 until currentVocabSize) {
                    val idx = lastPosOffset + v
                    if (idx < logits.capacity()) {
                        var score = logits.get(idx)
                        val vLong = v.toLong()

                        // 1. General repetition penalty for tokens already generated
                        if (vLong != decoderStartTokenId && generatedTokens.contains(vLong)) {
                            score = if (score < 0) score * 1.25f else score / 1.25f
                        }

                        // 2. Consecutive repeat penalty (stop >= 2 consecutive repeats)
                        if (genSize >= 2 && generatedTokens[genSize - 1] == vLong && generatedTokens[genSize - 2] == vLong) {
                            score -= 10000f
                        }

                        // 3. No-repeat 3-gram penalty (stop phrase loops)
                        if (genSize >= 2) {
                            val t1 = generatedTokens[genSize - 2]
                            val t2 = generatedTokens[genSize - 1]
                            for (i in 1 until genSize - 1) {
                                if (generatedTokens[i - 1] == t1 && generatedTokens[i] == t2 && generatedTokens[i + 1] == vLong) {
                                    score -= 10000f
                                    break
                                }
                            }
                        }

                        if (score > maxVal) {
                            maxVal = score
                            maxIdx = v
                        }
                    }
                }

                decTensor.close()
                useCacheTensor?.close()
                createdDummyTensors.forEach { it.close() }

                val nextToken = maxIdx.toLong()
                if (nextToken == eosTokenId) {
                    decResult.close()
                    break
                }

                generatedTokens.add(nextToken)

                // Update KV caches from outputs
                val nextDecoderKv = mutableMapOf<String, OnnxTensor>()
                val decOutputNames = decSession.outputNames
                for (outName in decOutputNames) {
                    if (outName.startsWith("present.")) {
                        val inName = outName.replace("present.", "past_key_values.")
                        val tensorVal = decResult.get(outName).orElse(null) as? OnnxTensor
                        if (tensorVal != null) {
                            if (outName.contains(".encoder.")) {
                                // Only save encoder KV from step 0 (use_cache=false)
                                // When use_cache=true, output has batch_size=0 — ignore
                                if (!useCache && tensorVal.info.shape[0] > 0) {
                                    encoderKvCache[inName] = tensorVal
                                }
                            } else {
                                nextDecoderKv[inName] = tensorVal
                            }
                        }
                    }
                }

                decoderKvCache.values.forEach { runCatching { it.close() } }
                decoderKvCache = nextDecoderKv
                currentStepInputIds = longArrayOf(nextToken)
                useCache = true
                step++
            }

            decoderKvCache.values.forEach { runCatching { it.close() } }
            encoderKvCache.values.forEach { runCatching { it.close() } }
            inputIdsTensor.close()
            maskTensor.close()
            encResult.close()

            val tokensToDetokenize = generatedTokens.drop(1)
            if (tokensToDetokenize.isEmpty()) return fallbackTranslate(paragraph, context)

            return detokenizeTokens(tokensToDetokenize, env, paragraph, context)
        } catch (e: Throwable) {
            Log.e("HachimiMT", "ONNX inference error for paragraph '$paragraph'", e)
            return fallbackTranslate(paragraph, context)
        }
    }

    private fun tokenizeText(text: String, env: OrtEnvironment): LongArray {
        val tokSession = tokenizerSession
        if (tokSession != null) {
            try {
                val textTensor = OnnxTensor.createTensor(env, arrayOf(text))
                val tokResult = tokSession.run(mapOf("text" to textTensor))
                val idsTensor = tokResult.get(0) as OnnxTensor
                val value = idsTensor.value
                val ids = when (value) {
                    is Array<*> -> (value[0] as? LongArray) ?: LongArray(0)
                    is LongArray -> value
                    else -> LongArray(0)
                }
                textTensor.close()
                tokResult.close()
                if (ids.isNotEmpty()) {
                    Log.d("HachimiMT", "Tokenizer ONNX success, tokens (${ids.size}): ${ids.take(10).joinToString()}")
                    return ids.take(MAX_SOURCE_TOKENS).toLongArray()
                }
            } catch (e: Throwable) {
                Log.e("HachimiMT", "Tokenizer ONNX session run failed for text: '$text'", e)
            }
        } else {
            Log.w("HachimiMT", "tokenizerSession is null, cannot tokenize via ONNX")
        }

        // Fallback tokenization
        val tokens = mutableListOf<Long>()
        for (char in text) {
            val charCode = char.code.toLong() % 23000 + 10
            tokens.add(charCode)
        }
        if (tokens.isEmpty()) tokens.add(padTokenId)
        return tokens.take(MAX_SOURCE_TOKENS).toLongArray()
    }

    private fun detokenizeTokens(tokens: List<Long>, env: OrtEnvironment, originalText: String, context: Context): String {
        val detokSession = detokenizerSession
        if (detokSession != null && tokens.isNotEmpty()) {
            try {
                val tokenArray = tokens.toLongArray()
                // SentencepieceDecoder expects rank-1 input: shape [N], not [1, N]
                val shape = longArrayOf(tokenArray.size.toLong())
                val tensor = OnnxTensor.createTensor(env, LongBuffer.wrap(tokenArray), shape)
                val result = detokSession.run(mapOf("ids" to tensor))
                val stringTensor = result.get(0) as OnnxTensor
                val value = stringTensor.value
                val resultText = when (value) {
                    is Array<*> -> value.firstOrNull()?.toString() ?: ""
                    is String -> value
                    else -> ""
                }
                tensor.close()
                result.close()
                if (resultText.isNotBlank()) {
                    Log.d("HachimiMT", "Detokenizer ONNX success: '$resultText'")
                    return resultText
                }
            } catch (e: Throwable) {
                Log.e("HachimiMT", "Detokenizer ONNX session run failed for tokens: ${tokens.take(10)}", e)
            }
        } else {
            Log.w("HachimiMT", "detokSession is null or tokens empty")
        }

        return fallbackTranslate(originalText, context)
    }

    private fun fallbackTranslate(text: String, context: Context = appCtx): String {
        val translated = io.legado.app.vbookextension.util.QuickTranslateEngine.translate(context, text, "vi")
        return if (translated.isNotBlank()) translated else text
    }

    fun close() {
        runCatching { encoderSession?.close() }
        runCatching { decoderSession?.close() }
        runCatching { tokenizerSession?.close() }
        runCatching { detokenizerSession?.close() }
        runCatching { ortEnv?.close() }
        encoderSession = null
        decoderSession = null
        tokenizerSession = null
        detokenizerSession = null
        ortEnv = null
        isInitialized = false
        loadedModelId = null
    }
}
