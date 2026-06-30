package io.legado.app.model.localBook

import io.legado.app.data.entities.Book
import io.legado.app.data.entities.BookChapter
import io.legado.app.help.book.getLocalUri
import io.legado.app.utils.AlphanumComparator
import io.legado.app.utils.ArchiveUtils
import io.legado.app.utils.FileUtils
import io.legado.app.utils.compress.LibArchiveUtils
import io.legado.app.utils.printOnDebug
import java.io.ByteArrayInputStream
import java.io.File
import java.io.InputStream

class CbzFile(var book: Book) {
    companion object : BaseLocalBookParse {
        private var cFile: CbzFile? = null

        @Synchronized
        private fun getCFile(book: Book): CbzFile {
            if (cFile == null || cFile?.book?.bookUrl != book.bookUrl) {
                cFile = CbzFile(book)
                return cFile!!
            }
            cFile?.book = book
            return cFile!!
        }

        @Synchronized
        override fun upBookInfo(book: Book) {
            getCFile(book).upBookInfo()
        }

        @Synchronized
        override fun getChapterList(book: Book): ArrayList<BookChapter> {
            return getCFile(book).getChapterList()
        }

        @Synchronized
        override fun getContent(book: Book, chapter: BookChapter): String? {
            return getCFile(book).getContent(chapter)
        }

        @Synchronized
        override fun getImage(book: Book, href: String): InputStream? {
            return getCFile(book).getImage(href)
        }
    }

    init {
        upBookCover(true)
    }

    private val imageExtensions = setOf("jpg", "jpeg", "png", "webp", "gif", "bmp")

    private fun isImageFile(name: String): Boolean {
        val ext = name.substringAfterLast('.', "").lowercase()
        return ext in imageExtensions
    }

    private fun getSortedImageFiles(): List<String> {
        return try {
            val files = ArchiveUtils.getArchiveFilesName(book.getLocalUri()) { name ->
                isImageFile(name)
            }
            files.sortedWith(AlphanumComparator)
        } catch (e: Exception) {
            e.printOnDebug()
            emptyList()
        }
    }

    private fun getFileBytes(href: String): ByteArray? {
        val input = LocalBook.getBookInputStream(book) ?: return null
        return try {
            LibArchiveUtils.getByteArrayContent(input, href)
        } catch (e: Exception) {
            e.printOnDebug()
            null
        } finally {
            input.close()
        }
    }

    private fun getImage(href: String): InputStream? {
        val bytes = getFileBytes(href) ?: return null
        return ByteArrayInputStream(bytes)
    }

    private fun getContent(chapter: BookChapter): String? {
        val files = chapter.url.split(",")
        if (files.isEmpty()) return null
        return buildString {
            files.forEach { file ->
                append("<img src=\"").append(file).append("\">").append('\n')
            }
        }
    }

    private fun getChapterList(): ArrayList<BookChapter> {
        val chapterList = ArrayList<BookChapter>()
        val imageFiles = getSortedImageFiles()
        if (imageFiles.isEmpty()) return chapterList

        // Group files by parent directory path
        val groups = imageFiles.groupBy { it.substringBeforeLast('/', "") }

        if (groups.size <= 1) {
            val chapter = BookChapter()
            chapter.index = 0
            chapter.bookUrl = book.bookUrl
            chapter.title = book.name.ifEmpty { book.originName.substringBeforeLast('.') }
            chapter.url = imageFiles.joinToString(",")
            chapterList.add(chapter)
        } else {
            val sortedDirs = groups.keys.sortedWith(AlphanumComparator)
            sortedDirs.forEachIndexed { index, dir ->
                val filesInDir = groups[dir] ?: emptyList()
                if (filesInDir.isNotEmpty()) {
                    val chapter = BookChapter()
                    chapter.index = index
                    chapter.bookUrl = book.bookUrl
                    chapter.title = if (dir.isEmpty()) {
                        book.name.ifEmpty { book.originName.substringBeforeLast('.') }
                    } else {
                        dir.substringAfterLast('/')
                    }
                    chapter.url = filesInDir.joinToString(",")
                    chapterList.add(chapter)
                }
            }
        }
        return chapterList
    }

    private fun upBookCover(fastCheck: Boolean = false) {
        try {
            if (book.coverUrl.isNullOrEmpty()) {
                book.coverUrl = LocalBook.getCoverPath(book)
            }
            if (fastCheck && File(book.coverUrl!!).exists()) {
                return
            }
            val imageFiles = getSortedImageFiles()
            val firstImage = imageFiles.firstOrNull() ?: return
            val bytes = getFileBytes(firstImage) ?: return
            FileUtils.writeBytes(book.coverUrl!!, bytes)
        } catch (e: Exception) {
            e.printOnDebug()
        }
    }

    private fun upBookInfo() {
        upBookCover()
        if (book.name.isEmpty()) {
            book.name = book.originName.substringBeforeLast('.')
        }
    }
}
