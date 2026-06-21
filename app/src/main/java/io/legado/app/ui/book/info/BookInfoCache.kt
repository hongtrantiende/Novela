package io.legado.app.ui.book.info

import android.util.LruCache
import io.legado.app.data.entities.Book
import io.legado.app.data.entities.BookChapter
import io.legado.app.data.entities.BookSource

object BookInfoCache {
    private val books = LruCache<String, Book>(50)
    private val chapters = LruCache<String, List<BookChapter>>(50)
    private val sources = LruCache<String, BookSource>(50)
    private val kindLabels = LruCache<String, List<String>>(50)
    private val groupNames = LruCache<String, String>(50)
    private val hasCustomGroup = LruCache<String, Boolean>(50)
    
    fun getBook(url: String): Book? = books.get(url)
    fun putBook(url: String, book: Book) { books.put(url, book) }
    
    fun getChapters(url: String): List<BookChapter>? = chapters.get(url)
    fun putChapters(url: String, list: List<BookChapter>) { chapters.put(url, list) }
    
    fun getSource(origin: String): BookSource? = sources.get(origin)
    fun putSource(origin: String, source: BookSource) { sources.put(origin, source) }
    
    fun getKindLabels(url: String): List<String>? = kindLabels.get(url)
    fun putKindLabels(url: String, labels: List<String>) { kindLabels.put(url, labels) }
    
    fun getGroupNames(url: String): String? = groupNames.get(url)
    fun putGroupNames(url: String, name: String) { groupNames.put(url, name) }
    
    fun getHasCustomGroup(url: String): Boolean? = hasCustomGroup.get(url)
    fun putHasCustomGroup(url: String, value: Boolean) { hasCustomGroup.put(url, value) }
    
    fun remove(url: String) {
        books.remove(url)
        chapters.remove(url)
        kindLabels.remove(url)
        groupNames.remove(url)
        hasCustomGroup.remove(url)
    }

    fun clear() {
        books.evictAll()
        chapters.evictAll()
        sources.evictAll()
        kindLabels.evictAll()
        groupNames.evictAll()
        hasCustomGroup.evictAll()
    }
}
