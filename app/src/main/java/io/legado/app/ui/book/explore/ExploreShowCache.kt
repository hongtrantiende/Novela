package io.legado.app.ui.book.explore

import android.util.LruCache
import io.legado.app.data.entities.SearchBook
import io.legado.app.data.entities.rule.ExploreKind

object ExploreShowCache {
    private val books = LruCache<String, List<SearchBook>>(30)
    private val pages = LruCache<String, Int>(30)
    private val kinds = LruCache<String, List<ExploreKind>>(30)
    private val selectedKind = LruCache<String, String?>(30)
    private val isEnd = LruCache<String, Boolean>(30)

    fun getBooks(key: String): List<SearchBook>? = books.get(key)
    fun putBooks(key: String, list: List<SearchBook>) { books.put(key, list) }

    fun getPage(key: String): Int? = pages.get(key)
    fun putPage(key: String, page: Int) { pages.put(key, page) }

    fun getKinds(key: String): List<ExploreKind>? = kinds.get(key)
    fun putKinds(key: String, list: List<ExploreKind>) { kinds.put(key, list) }

    fun getSelectedKind(key: String): String? = selectedKind.get(key)
    fun putSelectedKind(key: String, kindTitle: String?) { selectedKind.put(key, kindTitle) }

    fun getIsEnd(key: String): Boolean? = isEnd.get(key)
    fun putIsEnd(key: String, end: Boolean) { isEnd.put(key, end) }

    fun remove(key: String) {
        books.remove(key)
        pages.remove(key)
        kinds.remove(key)
        selectedKind.remove(key)
        isEnd.remove(key)
    }

    fun clear() {
        books.evictAll()
        pages.evictAll()
        kinds.evictAll()
        selectedKind.evictAll()
        isEnd.evictAll()
    }
}
