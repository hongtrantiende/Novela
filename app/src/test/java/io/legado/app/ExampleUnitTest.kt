package io.legado.app

import org.junit.Assert.assertEquals
import org.junit.Test


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testG2PMac() {
        val method = io.legado.app.help.tts.AiTtsDict::class.java.getDeclaredMethod("wordToPhonemes", String::class.java)
        method.isAccessible = true
        val result = method.invoke(io.legado.app.help.tts.AiTtsDict, "mắc") as List<*>
        println("Phonemes for mắc: $result")
    }

    @Test
    fun parseHttpTtsJson() {
        val file = java.io.File("src/main/assets/defaultData/httpTTS.json")
        println("File path: ${file.absolutePath}")
        println("File exists: ${file.exists()}")
        val json = file.readText(Charsets.UTF_8)
        val result = io.legado.app.data.entities.HttpTTS.fromJsonArray(json)
        if (result.isFailure) {
            result.exceptionOrNull()?.printStackTrace()
        }
        val list = result.getOrThrow()
        println("Loaded ${list.size} TTS engines successfully!")
        list.forEach { 
            println("ID: ${it.id}, Name: ${it.name}")
        }
    }
}
