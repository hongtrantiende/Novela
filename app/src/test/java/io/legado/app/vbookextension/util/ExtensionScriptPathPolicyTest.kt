package io.legado.app.vbookextension.util

import java.io.File
import kotlin.io.path.createTempDirectory
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertThrows
import org.junit.Test

class ExtensionScriptPathPolicyTest {

    @Test
    fun `accepts plugin manifest and safe script paths`() {
        assertEquals("plugin.json", ExtensionScriptPathPolicy.normalizeLogicalPath("plugin.json"))
        assertEquals("search.js", ExtensionScriptPathPolicy.normalizeLogicalPath("search.js"))
        assertEquals("src/helper/config.js", ExtensionScriptPathPolicy.normalizeLogicalPath("src\\helper\\config.js"))
    }

    @Test
    fun `rejects traversal absolute empty nul and unsupported paths`() {
        val invalidPaths = listOf(
            "",
            " ",
            "../outside.js",
            "src/../../outside.js",
            "src//search.js",
            "/data/local/tmp/a.js",
            "\\\\server\\share\\a.js",
            "C:\\temp\\a.js",
            "src/\u0000bad.js",
            "other/search.js",
            ".hidden.js",
            "src/.hidden/search.js",
            "src/search.exe"
        )

        invalidPaths.forEach { path ->
            assertNull("Expected rejection for: $path", ExtensionScriptPathPolicy.normalizeLogicalPath(path))
        }
    }

    @Test
    fun `resolves safe file only below managed extension root`() {
        val filesDir = createTempDirectory("extension-path-policy").toFile()
        val extensionDir = File(filesDir, "extensions/demo").apply { mkdirs() }

        val resolvedRoot = ExtensionScriptPathPolicy.resolveManagedExtensionDir(
            filesDir = filesDir,
            extensionId = "demo",
            storedLocalPath = extensionDir.absolutePath
        )
        val resolvedFile = ExtensionScriptPathPolicy.resolveScriptFile(
            extensionDir = resolvedRoot,
            logicalPath = "src/search.js"
        )

        assertEquals(File(extensionDir, "src/search.js").canonicalFile, resolvedFile)
    }

    @Test
    fun `rejects stored local path outside managed extension root`() {
        val filesDir = createTempDirectory("extension-path-policy").toFile()
        val outsideDir = File(filesDir, "outside/demo").apply { mkdirs() }

        assertThrows(IllegalArgumentException::class.java) {
            ExtensionScriptPathPolicy.resolveManagedExtensionDir(
                filesDir = filesDir,
                extensionId = "demo",
                storedLocalPath = outsideDir.absolutePath
            )
        }
    }
}
