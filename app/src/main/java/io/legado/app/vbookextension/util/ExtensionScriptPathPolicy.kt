package io.legado.app.vbookextension.util

import java.io.File

object ExtensionScriptPathPolicy {

    private const val MANAGED_DIRECTORY_NAME = "extensions"
    private const val MAX_LOGICAL_PATH_LENGTH = 240
    private val safeSegment = Regex("[A-Za-z0-9][A-Za-z0-9._-]*")
    private val allowedTextExtensions = setOf("js", "json", "txt", "md", "ts", "html", "css")

    fun normalizeLogicalPath(rawPath: String): String? {
        if (rawPath.isBlank() || rawPath.length > MAX_LOGICAL_PATH_LENGTH || '\u0000' in rawPath) {
            return null
        }
        if (rawPath.startsWith('/') ||
            rawPath.startsWith('\\') ||
            rawPath.startsWith("//") ||
            rawPath.startsWith("\\\\") ||
            DRIVE_PREFIX.matchesAt(rawPath, 0)
        ) {
            return null
        }

        val normalized = rawPath.replace('\\', '/')
        val segments = normalized.split('/')
        if (segments.any { it.isEmpty() || it == "." || it == ".." || !safeSegment.matches(it) }) {
            return null
        }

        val isAllowedRootFile = segments.size == 1
        val isAllowedSourceFile = segments.size >= 2 && segments.first() == "src"
        if (!isAllowedRootFile && !isAllowedSourceFile) return null

        val fileName = segments.last()
        if (fileName == "icon.png" || fileName == "plugin.json") {
            return normalized.takeIf { segments.size == 1 }
        }
        val extension = fileName.substringAfterLast('.', missingDelimiterValue = "").lowercase()
        return normalized.takeIf { extension in allowedTextExtensions }
    }

    fun resolveManagedExtensionDir(
        filesDir: File,
        extensionId: String,
        storedLocalPath: String
    ): File {
        require(safeSegment.matches(extensionId)) { "Mã Extension không hợp lệ." }
        require(storedLocalPath.isNotBlank() && '\u0000' !in storedLocalPath) {
            "Thư mục Extension không hợp lệ."
        }

        val managedRoot = File(filesDir, MANAGED_DIRECTORY_NAME).canonicalFile
        val expectedDirectory = File(managedRoot, extensionId)
        val candidateDirectory = File(storedLocalPath)
        val expectedCanonical = expectedDirectory.canonicalFile
        val candidateCanonical = candidateDirectory.canonicalFile

        require(isContained(managedRoot, expectedCanonical)) {
            "Thư mục Extension nằm ngoài vùng lưu trữ được quản lý."
        }
        require(expectedDirectory.absoluteFile.path == expectedCanonical.path) {
            "Không cho phép liên kết tượng trưng trong đường dẫn Extension."
        }
        require(candidateDirectory.absoluteFile.path == candidateCanonical.path) {
            "Đường dẫn Extension phải là đường dẫn chuẩn."
        }
        require(candidateCanonical == expectedCanonical) {
            "Đường dẫn Extension không khớp với Extension đang sửa."
        }
        return expectedCanonical
    }

    fun resolveScriptFile(extensionDir: File, logicalPath: String): File {
        val normalized = normalizeLogicalPath(logicalPath)
            ?: throw IllegalArgumentException("Đường dẫn file Extension không hợp lệ.")
        val rootCanonical = extensionDir.canonicalFile
        val target = File(rootCanonical, normalized)
        val targetCanonical = target.canonicalFile

        require(isContained(rootCanonical, targetCanonical)) {
            "File Extension nằm ngoài thư mục được phép."
        }
        require(target.absoluteFile.path == targetCanonical.path) {
            "Không cho phép liên kết tượng trưng trong đường dẫn file Extension."
        }
        return targetCanonical
    }

    private fun isContained(root: File, target: File): Boolean {
        return target.path == root.path || target.path.startsWith(root.path + File.separator)
    }

    private val DRIVE_PREFIX = Regex("^[A-Za-z]:")
}
