package io.legado.app.ui.book.changesource

import android.app.Application
import android.os.Bundle
import androidx.annotation.CallSuper
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import io.legado.app.base.BaseViewModel
import io.legado.app.constant.AppLog
import io.legado.app.constant.AppPattern
import io.legado.app.data.appDb
import io.legado.app.data.entities.Book
import io.legado.app.data.entities.BookChapter
import io.legado.app.data.entities.BookSource
import io.legado.app.data.entities.BookSourcePart
import io.legado.app.data.entities.SearchBook
import io.legado.app.exception.NoStackTraceException
import io.legado.app.help.book.BookHelp
import io.legado.app.help.book.ContentProcessor
import io.legado.app.help.book.primaryStr
import io.legado.app.help.book.releaseHtmlData
import io.legado.app.help.config.SourceConfig
import io.legado.app.help.coroutine.Coroutine
import io.legado.app.help.source.SourceHelp
import io.legado.app.model.webBook.WebBook
import io.legado.app.ui.config.otherConfig.OtherConfig
import io.legado.app.utils.internString
import io.legado.app.utils.mapParallel
import io.legado.app.utils.mapParallelSafe
import io.legado.app.utils.onEachIndexed
import io.legado.app.utils.toastOnUi
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.ExecutorCoroutineDispatcher
import kotlinx.coroutines.Job
import kotlinx.coroutines.asCoroutineDispatcher
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.ensureActive
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.withTimeout
import java.util.Collections
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.Executors

import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

@Suppress("MemberVisibilityCanBePrivate")
open class ChangeBookSourceViewModel(application: Application) : BaseViewModel(application), KoinComponent {
    private val extensionRepository: io.legado.app.vbookextension.data.repository.ExtensionRepository by inject()
    private val extensionDao: io.legado.app.vbookextension.data.dao.ExtensionDao by inject()
    private val threadCount = OtherConfig.threadCount
    private var searchPool: ExecutorCoroutineDispatcher? = null
    val searchStateData = MutableLiveData<Boolean>()
    private val _isSearching = MutableStateFlow(false)
    val isSearching = _isSearching.asStateFlow()
    var searchFinishCallback: ((isEmpty: Boolean) -> Unit)? = null
    var name: String = ""
    var author: String = ""
    private var fromReadBookActivity = false
    private var oldBook: Book? = null
    private var screenKey: String = ""
    private var bookSourceParts = arrayListOf<BookSourcePart>()
    val totalSourceCount: Int
        get() = bookSourceParts.size
    private var searchBookList = arrayListOf<SearchBook>()
    private val searchBooks = Collections.synchronizedList(arrayListOf<SearchBook>())
    private val tocMap = ConcurrentHashMap<String, List<BookChapter>>()
    private val _changeSourceProgress = MutableStateFlow(0 to "")
    val changeSourceProgress = _changeSourceProgress.asStateFlow()
    private var tocMapChapterCount = 0
    private val contentProcessor by lazy {
        ContentProcessor.get(oldBook!!)
    }
    private var searchCallback: SourceCallback? = null
    private val chapterNumRegex = "^\\[(\\d+)]".toRegex()
    private val comparatorBase by lazy {
        compareByDescending<SearchBook> { getBookScore(it) }
            .thenByDescending { SourceConfig.getSourceScore(it.origin) }
    }
    private val defaultComparator by lazy {
        comparatorBase.thenBy { it.originOrder }
    }
    private val wordCountComparator by lazy {
        comparatorBase.thenByDescending { it.chapterWordCount > 1000 }
            .thenByDescending { getChapterNum(it.chapterWordCountText) }
            .thenByDescending { it.chapterWordCount }
            .thenBy { it.originOrder }
    }
    private var task: Job? = null
    private var isPaused = false
    private var wasSearching = false
    val bookMap = ConcurrentHashMap<String, Book>()
    val searchDataFlow = callbackFlow {

        searchCallback = object : SourceCallback {

            override fun searchSuccess(searchBook: SearchBook) {
                searchBook.releaseHtmlData()
                if (!searchBook.origin.startsWith("ext_")) {
                    appDb.searchBookDao.insert(searchBook)
                }
                when {
                    screenKey.isEmpty() -> searchBooks.add(searchBook)
                    searchBook.name.contains(screenKey) -> searchBooks.add(searchBook)
                    else -> return
                }
                trySend(arrayOf(searchBooks))
            }

            override fun upAdapter() {
                trySend(arrayOf(searchBooks))
            }

        }

        if (searchBooks.isEmpty()) {
            getDbSearchBooks().let {
                searchBooks.addAll(it)
            }
        }
        trySend(arrayOf(searchBooks))

        if (!_isSearching.value) {
            startSearch()
        }

        awaitClose {
            searchCallback = null
        }
    }.map {
        kotlin.runCatching {
            val comparator = if (ChangeSourceConfig.loadWordCount) {
                wordCountComparator
            } else {
                defaultComparator
            }
            searchBooks.sortedWith(comparator)
        }.onFailure {
            AppLog.put("Lỗi sắp xếp thay đổi nguồn\n${it.localizedMessage}", it)
        }.getOrDefault(searchBooks)
    }.flowOn(IO)

    override fun onCleared() {
        super.onCleared()
        searchPool?.close()
    }

    @CallSuper
    open fun initData(arguments: Bundle?, book: Book?, fromReadBookActivity: Boolean) {
        arguments?.let { bundle ->
            bundle.getString("name")?.let {
                name = it
            }
            bundle.getString("author")?.let {
                author = it.replace(AppPattern.authorRegex, "")
            }
            this.fromReadBookActivity = fromReadBookActivity
            oldBook = book
        }
    }

    @CallSuper
    open fun initData(
        name: String,
        author: String,
        book: Book?,
        fromReadBookActivity: Boolean
    ) {
        this.name = name
        this.author = author.replace(AppPattern.authorRegex, "")
        this.fromReadBookActivity = fromReadBookActivity
        oldBook = book
    }

    private fun initSearchPool() {
        searchPool = Executors
            .newFixedThreadPool(threadCount).asCoroutineDispatcher()
    }

    fun refresh(): Boolean {
        getDbSearchBooks().let {
            searchBooks.clear()
            searchBooks.addAll(it)
            searchCallback?.upAdapter()
        }
        return searchBooks.isEmpty()
    }

    /**
     * 搜索书籍
     */
    fun startSearch() {
        execute {
            stopSearch()
            if (searchBooks.isNotEmpty()) {
                appDb.searchBookDao.delete(*searchBooks.toTypedArray())
                searchBooks.clear()
            }
            searchCallback?.upAdapter()
            bookSourceParts.clear()
            tocMap.clear()
            bookMap.clear()
            tocMapChapterCount = 0
            _changeSourceProgress.value = 0 to ""
            bookSourceParts.addAll(io.legado.app.ui.book.search.SearchScope(ChangeSourceConfig.searchScope).getBookSourceParts())
            
            // Add enabled VBook Extensions to search
            val enabledExts = extensionDao.getEnabledExtensions()
            val extParts = enabledExts.map { ext ->
                BookSourcePart(
                    bookSourceUrl = "ext_${ext.id}",
                    bookSourceName = ext.name,
                    bookSourceGroup = "${ext.iconPath.orEmpty()}|${ext.type}|${ext.locale}",
                    customOrder = 0,
                    enabled = ext.isEnabled,
                    enabledExplore = ext.isEnabled,
                    hasLoginUrl = false,
                    lastUpdateTime = 0,
                    respondTime = 0,
                    weight = 0,
                    hasExploreUrl = true
                )
            }
            bookSourceParts.addAll(extParts)

            initSearchPool()
            search()
        }
    }

    fun startSearch(origin: String) {
        execute {
            stopSearch()
            bookSourceParts.clear()
            tocMap.clear()
            bookMap.clear()
            tocMapChapterCount = 0
            if (origin.startsWith("ext_")) {
                val extId = origin.removePrefix("ext_")
                val ext = extensionDao.getExtensionById(extId)
                if (ext != null) {
                    bookSourceParts.add(
                        BookSourcePart(
                            bookSourceUrl = "ext_${ext.id}",
                            bookSourceName = ext.name,
                            bookSourceGroup = "${ext.iconPath.orEmpty()}|${ext.type}|${ext.locale}",
                            customOrder = 0,
                            enabled = ext.isEnabled,
                            enabledExplore = ext.isEnabled,
                            hasLoginUrl = false,
                            lastUpdateTime = 0,
                            respondTime = 0,
                            weight = 0,
                            hasExploreUrl = true
                        )
                    )
                }
            } else {
                appDb.bookSourceDao.getBookSourcePart(origin)?.let {
                    bookSourceParts.add(it)
                }
            }
            searchBooks.removeIf { it.origin == origin }
            initSearchPool()
            search()
        }
    }

    private fun search() {
        task = viewModelScope.launch(searchPool!!) {
            flow {
                for (bs in bookSourceParts) {
                    emit(bs)
                }
            }.onStart {
                searchStateData.postValue(true)
                _isSearching.value = true
            }.mapParallel(threadCount) {
                while (isPaused) {
                    kotlinx.coroutines.delay(100)
                }
                try {
                    withTimeout(60000L) {
                        search(it)
                    }
                } catch (_: Throwable) {
                    currentCoroutineContext().ensureActive()
                }
                it
            }.onEachIndexed { index, value ->
                _changeSourceProgress.update { _ ->
                    index + 1 to value.bookSourceName
                }
            }.onCompletion {
                ensureActive()
                searchStateData.postValue(false)
                _isSearching.value = false
                searchFinishCallback?.invoke(searchBooks.isEmpty())
            }.catch {
                AppLog.put("Lỗi tìm kiếm thay đổi nguồn\n${it.localizedMessage}", it)
            }.collect()
        }
    }

    private suspend fun search(part: BookSourcePart) {
        val checkAuthor = ChangeSourceConfig.checkAuthor
        val loadInfo = ChangeSourceConfig.loadInfo
        val loadToc = ChangeSourceConfig.loadToc
        val loadWordCount = ChangeSourceConfig.loadWordCount

        val isExt = part.bookSourceUrl.startsWith("ext_")
        val searchKeyword = io.legado.app.utils.TranslateUtils.translateMeta(name)
        val keywords = if (searchKeyword != name) listOf(name, searchKeyword) else listOf(name)
        val allResults = mutableListOf<SearchBook>()

        if (isExt) {
            for (kw in keywords) {
                try {
                    allResults.addAll(extensionRepository.searchBooks(part.bookSourceUrl, kw, 1))
                } catch (_: Throwable) {}
            }
        } else {
            val source = part.getBookSource() ?: return
            for (kw in keywords) {
                try {
                    allResults.addAll(WebBook.searchBookAwait(source, kw))
                } catch (_: Throwable) {}
            }
        }

        val resultBooks = allResults.distinctBy { it.bookUrl }.filter {
            val normExtBookName = io.legado.app.utils.TranslateUtils.translateMeta(it.name)
                .lowercase().replace(Regex("[\\p{Punct}\\s]"), "")
            val normTargetName = io.legado.app.utils.TranslateUtils.translateMeta(name)
                .lowercase().replace(Regex("[\\p{Punct}\\s]"), "")

            val normExtAuthor = io.legado.app.utils.TranslateUtils.translateMeta(it.author)
                .lowercase().replace(Regex("[\\p{Punct}\\s]"), "")
            val normTargetAuthor = io.legado.app.utils.TranslateUtils.translateMeta(author)
                .lowercase().replace(Regex("[\\p{Punct}\\s]"), "")

            normExtBookName == normTargetName && (!checkAuthor || normExtAuthor.contains(normTargetAuthor) || normTargetAuthor.contains(normExtAuthor))
        }

        resultBooks.forEach { searchBook ->
            when {
                loadInfo || loadToc || loadWordCount -> {
                    loadBookInfo(part, searchBook.toBook())
                }

                else -> {
                    searchCallback?.searchSuccess(searchBook)
                }
            }
        }
    }

    private suspend fun loadBookInfo(part: BookSourcePart, book: Book) {
        val isExt = part.bookSourceUrl.startsWith("ext_")
        if (book.tocUrl.isEmpty()) {
            if (isExt) {
                val detail = extensionRepository.getBookDetail(part.bookSourceUrl, book.bookUrl)
                if (detail != null) {
                    book.tocUrl = detail.tocUrl
                    book.intro = detail.intro
                    book.coverUrl = detail.coverUrl
                }
            } else {
                WebBook.getBookInfoAwait(part.getBookSource()!!, book)
            }
        }
        if (ChangeSourceConfig.loadToc || ChangeSourceConfig.loadWordCount) {
            loadBookToc(part, book)
        } else {
            val searchBook = book.toSearchBook()
            searchCallback?.searchSuccess(searchBook)
        }
    }

    private suspend fun loadBookToc(part: BookSourcePart, book: Book) {
        val isExt = part.bookSourceUrl.startsWith("ext_")
        val chapters = if (isExt) {
            extensionRepository.getTableOfContents(part.bookSourceUrl, book.bookUrl)
        } else {
            WebBook.getChapterListAwait(part.getBookSource()!!, book).getOrThrow()
        }
        for (chapter in chapters) {
            chapter.internString()
        }
        if (tocMapChapterCount < 30000) {
            tocMapChapterCount += chapters.size
            tocMap[book.primaryStr()] = chapters
        }
        bookMap[book.primaryStr()] = book
        book.releaseHtmlData()
        if (ChangeSourceConfig.loadWordCount) {
            loadBookWordCount(part, book, chapters)
        } else {
            val searchBook = book.toSearchBook()
            searchCallback?.searchSuccess(searchBook)
        }
    }

    private suspend fun loadBookWordCount(
        part: BookSourcePart,
        book: Book,
        chapters: List<BookChapter>
    ) = coroutineScope {
        val chapterIndex = if (fromReadBookActivity) {
            BookHelp.getDurChapter(oldBook!!, chapters)
        } else {
            chapters.lastIndex
        }
        val bookChapter = chapters[chapterIndex]
        var title = bookChapter.title.trim()
        if (title.length > 20) {
            title = title.substring(0, 20) + "…"
        }
        val startTime = System.currentTimeMillis()
        val isExt = part.bookSourceUrl.startsWith("ext_")
        val pair = try {
            var content = if (isExt) {
                extensionRepository.getChapterContent(part.bookSourceUrl, bookChapter.url)
                    ?: throw NoStackTraceException("Nội dung chương trống")
            } else {
                val nextChapterUrl = chapters.getOrNull(chapterIndex + 1)?.url
                WebBook.getContentAwait(part.getBookSource()!!, book, bookChapter, nextChapterUrl, false)
            }
            content = contentProcessor.getContent(oldBook!!, bookChapter, content, false).toString()
            val len = content.length
            len to "[${chapterIndex + 1}] ${title}\nSố từ: ${len}"
        } catch (t: Throwable) {
            if (t is CancellationException) throw t
            -1 to "[${chapterIndex + 1}] ${title}\nKhông đếm được số từ: ${t.localizedMessage}"
        }
        val endTime = System.currentTimeMillis()
        val searchBook = book.toSearchBook().apply {
            chapterWordCountText = pair.second
            chapterWordCount = pair.first
            respondTime = (endTime - startTime).toInt()
        }
        searchCallback?.searchSuccess(searchBook)
    }

    fun onLoadWordCountChecked(isChecked: Boolean) {
        if (isChecked) {
            startRefreshList(true)
        }
    }

    /**
     * 刷新列表
     */
    fun startRefreshList(onlyRefreshNoWordCountBook: Boolean = false) {
        execute {
            stopSearch()
            searchBookList.clear()
            if (onlyRefreshNoWordCountBook) {
                searchBooks.filterTo(searchBookList) {
                    it.chapterWordCountText == null
                }
                searchBooks.removeIf { it.chapterWordCountText == null }
            } else {
                searchBookList.addAll(searchBooks)
                searchBooks.clear()
            }
            searchCallback?.upAdapter()
            initSearchPool()
            refreshList()
        }
    }

    private fun refreshList() {
        task = viewModelScope.launch(searchPool!!) {
            flow {
                for (searchBook in searchBookList) {
                    emit(searchBook)
                }
            }.onStart {
                searchStateData.postValue(true)
                _isSearching.value = true
            }.mapParallelSafe(threadCount) {
                val isExt = it.origin.startsWith("ext_")
                val part = if (isExt) {
                    BookSourcePart(bookSourceUrl = it.origin, bookSourceName = it.originName)
                } else {
                    appDb.bookSourceDao.getBookSourcePart(it.origin)!!
                }
                withTimeout(60000L) {
                    loadBookInfo(part, it.toBook())
                }
            }.onCompletion {
                searchStateData.postValue(false)
                _isSearching.value = false
            }.catch {
                AppLog.put("Lỗi khi thay đổi nguồn và làm mới danh sách\n${it.localizedMessage}", it)
            }.collect()
        }
    }

    private fun getDbSearchBooks(): List<SearchBook> {
        val searchScope = io.legado.app.ui.book.search.SearchScope(
            ChangeSourceConfig.searchScope
        )
        val group = when {
            searchScope.isAll() || searchScope.isSource() -> ""
            else -> searchScope.displayNames.firstOrNull() ?: ""
        }
        return if (screenKey.isEmpty()) {
            if (ChangeSourceConfig.checkAuthor) {
                appDb.searchBookDao.changeSourceByGroup(name, author, group)
            } else {
                appDb.searchBookDao.changeSourceByGroup(name, "", group)
            }
        } else {
            if (ChangeSourceConfig.checkAuthor) {
                appDb.searchBookDao.changeSourceSearch(name, author, screenKey, group)
            } else {
                appDb.searchBookDao.changeSourceSearch(name, "", screenKey, group)
            }
        }
    }

    /**
     * 筛选
     */
    fun screen(key: String?) {
        screenKey = key?.trim() ?: ""
        execute {
            getDbSearchBooks().let {
                searchBooks.clear()
                searchBooks.addAll(it)
                searchCallback?.upAdapter()
            }
        }
    }

    fun startOrStopSearch() {
        if (task == null || !task!!.isActive) {
            startSearch()
        } else {
            stopSearch()
        }
    }

    fun stopSearch() {
        task?.cancel()
        searchPool?.close()
        searchStateData.postValue(false)
        _isSearching.value = false
        wasSearching = false
    }

    fun pause() {
        isPaused = true
        wasSearching = _isSearching.value
    }

    fun resume() {
        isPaused = false
        wasSearching = false
    }

    fun getToc(
        book: Book,
        onSuccess: (toc: List<BookChapter>, source: BookSource) -> Unit,
        onError: (e: Throwable) -> Unit
    ): Coroutine<Pair<List<BookChapter>, BookSource>> {
        return execute {
            val toc = tocMap[book.primaryStr()]
            if (toc != null) {
                val source = if (book.origin.startsWith("ext_")) {
                    BookSource().apply {
                        bookSourceUrl = book.origin
                        bookSourceName = book.originName
                    }
                } else {
                    appDb.bookSourceDao.getBookSource(book.origin)
                }
                return@execute Pair(toc, source!!)
            }
            val result = getToc(book).getOrThrow()
            tocMap[book.primaryStr()] = result.first
            return@execute result
        }.onSuccess {
            onSuccess.invoke(it.first, it.second)
        }.onError {
            onError.invoke(it)
        }
    }

    suspend fun getToc(book: Book): Result<Pair<List<BookChapter>, BookSource>> {
        return kotlin.runCatching {
            val source = if (book.origin.startsWith("ext_")) {
                BookSource().apply {
                    bookSourceUrl = book.origin
                    bookSourceName = book.originName
                }
            } else {
                appDb.bookSourceDao.getBookSource(book.origin)
                    ?: throw NoStackTraceException("Nguồn sách không tồn tại")
            }
            val toc = if (book.origin.startsWith("ext_")) {
                if (book.tocUrl.isEmpty()) {
                    val detail = extensionRepository.getBookDetail(book.origin, book.bookUrl)
                    if (detail != null) {
                        book.tocUrl = detail.tocUrl
                        book.intro = detail.intro
                        book.coverUrl = detail.coverUrl
                    }
                }
                extensionRepository.getTableOfContents(book.origin, book.bookUrl)
            } else {
                if (book.tocUrl.isEmpty()) {
                    WebBook.getBookInfoAwait(source, book)
                }
                WebBook.getChapterListAwait(source, book).getOrThrow()
            }
            Pair(toc, source)
        }
    }

    fun disableSource(searchBook: SearchBook) {
        execute {
            appDb.bookSourceDao.getBookSource(searchBook.origin)?.let { source ->
                source.enabled = false
                appDb.bookSourceDao.update(source)
            }
            searchBooks.remove(searchBook)
            searchCallback?.upAdapter()
        }
    }

    fun topSource(searchBook: SearchBook) {
        execute {
            appDb.bookSourceDao.getBookSource(searchBook.origin)?.let { source ->
                val minOrder = appDb.bookSourceDao.minOrder - 1
                source.customOrder = minOrder
                searchBook.originOrder = source.customOrder
                appDb.bookSourceDao.update(source)
                updateSource(searchBook)
            }
            searchCallback?.upAdapter()
        }
    }

    fun bottomSource(searchBook: SearchBook) {
        execute {
            appDb.bookSourceDao.getBookSource(searchBook.origin)?.let { source ->
                val maxOrder = appDb.bookSourceDao.maxOrder + 1
                source.customOrder = maxOrder
                searchBook.originOrder = source.customOrder
                appDb.bookSourceDao.update(source)
                updateSource(searchBook)
            }
            searchCallback?.upAdapter()
        }
    }

    fun updateSource(searchBook: SearchBook) {
        appDb.searchBookDao.update(searchBook)
    }

    fun del(searchBook: SearchBook) {
        execute {
            SourceHelp.deleteBookSource(searchBook.origin)
            appDb.searchBookDao.delete(searchBook)
        }
        searchBooks.remove(searchBook)
        searchCallback?.upAdapter()
    }

    fun autoChangeSource(
        bookType: Int?,
        onSuccess: (book: Book, toc: List<BookChapter>, source: BookSource) -> Unit
    ) {
        execute {
            searchBooks.forEach {
                if (bookType != null && it.sameBookTypeLocal(bookType)) {
                    val book = it.toBook()
                    val result = getToc(book).getOrNull()
                    if (result != null) {
                        return@execute Triple(book, result.first, result.second)
                    }
                }
            }
            throw NoStackTraceException("không có nguồn hợp lệ")
        }.onSuccess {
            onSuccess.invoke(it.first, it.second, it.third)
        }.onError {
            context.toastOnUi("Thay đổi nguồn tự động không thành công\n${it.localizedMessage}")
        }
    }

    fun setBookScore(searchBook: SearchBook, score: Int) {
        SourceConfig.setBookScore(searchBook.origin, searchBook.name, searchBook.author, score)
        searchCallback?.upAdapter()
    }

    fun getBookScore(searchBook: SearchBook): Int {
        return SourceConfig.getBookScore(searchBook.origin, searchBook.name, searchBook.author)
    }

    private fun getChapterNum(wordCountText: String?): Int {
        wordCountText ?: return -1
        return chapterNumRegex.find(wordCountText)?.groupValues?.get(1)?.toIntOrNull() ?: -1
    }

    interface SourceCallback {

        fun searchSuccess(searchBook: SearchBook)

        fun upAdapter()

    }

}
