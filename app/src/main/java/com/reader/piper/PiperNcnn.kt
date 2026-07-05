package com.reader.piper

object PiperNcnn {
    init {
        try {
            System.loadLibrary("ncnn")
            System.loadLibrary("piperncnn")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    external fun loadModelEncrypted(
        modelPath: String,
        configPath: String,
        noiseScale: Float,
        noiseW: Float,
        numSpeakers: Int
    ): Boolean

    external fun synthesizeFromIds(
        ids: IntArray,
        speakerId: Int,
        speed: Double
    ): ShortArray?

    external fun stop()
}
