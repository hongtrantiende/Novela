package io.legado.app.web.socket

import io.ktor.server.websocket.DefaultWebSocketServerSession
import io.ktor.websocket.CloseReason
import io.ktor.websocket.Frame
import io.ktor.websocket.close
import io.ktor.websocket.readText
import io.ktor.websocket.send
import io.legado.app.R
import io.legado.app.data.local.preferences.LocalPreferencesKeys
import io.legado.app.data.local.preferences.LocalPreferencesRepository
import io.legado.app.domain.model.BookSearchScope
import io.legado.app.domain.model.MatchMode
import io.legado.app.domain.usecase.BookSearchControl
import io.legado.app.domain.usecase.BookSearchRequest
import io.legado.app.domain.usecase.SearchBooksUseCase
import io.legado.app.domain.usecase.SearchRunEvent
import io.legado.app.ui.config.otherConfig.OtherConfig
import io.legado.app.utils.GSON
import io.legado.app.utils.fromJsonObject
import io.legado.app.utils.isJson
import io.legado.app.utils.printOnDebug
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import org.koin.core.context.GlobalContext
import splitties.init.appCtx

class BookSearchWebSocket(private val session: DefaultWebSocketServerSession) : CoroutineScope by session {

    private val searchBooksUseCase: SearchBooksUseCase by lazy { GlobalContext.get().get() }
    private val localPreferencesRepository: LocalPreferencesRepository by lazy {
        GlobalContext.get().get()
    }
    private val searchControl = BookSearchControl()
    private val sentBookUrls = linkedSetOf<String>()
    private var searchJob: Job? = null
    private val sendMutex = Mutex()

    private val SEARCH_FINISH = "Search finish"

    suspend fun handle() {
        try {
            for (frame in session.incoming) {
                if (frame is Frame.Text) {
                    val text = frame.readText()
                    if (!text.isJson()) {
                        sendMutex.withLock {
                            if (session.isActive) {
                                session.send("Dữ liệu phải ở định dạng Json")
                            }
                        }
                        sendMutex.withLock {
                            if (session.isActive) {
                                session.close(CloseReason(CloseReason.Codes.NORMAL, SEARCH_FINISH))
                            }
                        }
                        break
                    }
                    val searchMap = GSON.fromJsonObject<Map<String, String>>(text).getOrNull()
                    if (searchMap != null) {
                        val key = searchMap["key"]?.trim()
                        if (key.isNullOrBlank()) {
                            sendMutex.withLock {
                                if (session.isActive) {
                                    session.send(appCtx.getString(R.string.cannot_empty))
                                }
                            }
                            sendMutex.withLock {
                                if (session.isActive) {
                                    session.close(CloseReason(CloseReason.Codes.NORMAL, SEARCH_FINISH))
                                }
                            }
                            break
                        }
                        startSearch(key)
                    }
                }
            }
        } catch (e: Exception) {
            e.printOnDebug()
        } finally {
            searchJob?.cancel()
        }
    }

    private fun startSearch(key: String) {
        searchJob?.cancel()
        sentBookUrls.clear()
        searchControl.resume()
        searchJob = launch(Dispatchers.IO) {
            try {
                // 1. Search database sources
                val regularSearchJob = launch {
                    try {
                        searchBooksUseCase
                            .execute(
                                BookSearchRequest(
                                    keyword = key,
                                    page = 1,
                                    scope = BookSearchScope(
                                        localPreferencesRepository
                                            .getPreference(LocalPreferencesKeys.SEARCH_SCOPE, "")
                                            .first()
                                    ),
                                    matchMode = MatchMode.of(
                                        localPreferencesRepository
                                            .getPreference(
                                                LocalPreferencesKeys.MATCH_MODE,
                                                MatchMode.DEFAULT.value
                                            )
                                            .first()
                                    ),
                                    concurrency = OtherConfig.threadCount,
                                ),
                                searchControl
                            )
                            .collect { event ->
                                when (event) {
                                    SearchRunEvent.Started -> Unit
                                    is SearchRunEvent.Progress -> {
                                        val newBooks = event.upsertBooks.filter { sentBookUrls.add(it.bookUrl) }
                                        if (newBooks.isNotEmpty()) {
                                            sendMutex.withLock {
                                                if (session.isActive) {
                                                    session.send(GSON.toJson(newBooks))
                                                }
                                            }
                                        }
                                    }

                                    is SearchRunEvent.Finished -> Unit
                                }
                            }
                    } catch (e: Exception) {
                        e.printOnDebug()
                    }
                }

                // 2. Search extension sources in parallel
                val extensionSearchJob = launch {
                    if (!io.legado.app.help.MemberManager.isVip) return@launch
                    try {
                        val extensionDao: io.legado.app.vbookextension.data.dao.ExtensionDao =
                            org.koin.mp.KoinPlatformTools.defaultContext().get().get()
                        val extensionRepository: io.legado.app.vbookextension.data.repository.ExtensionRepository =
                            org.koin.mp.KoinPlatformTools.defaultContext().get().get()
                        val enabledExtensions = extensionDao.getEnabledExtensions()

                        enabledExtensions.map { ext ->
                            async {
                                try {
                                    val books = extensionRepository.searchBooks("ext_${ext.id}", key, 1)
                                    val newBooks = books.filter { sentBookUrls.add(it.bookUrl) }
                                    if (newBooks.isNotEmpty()) {
                                        sendMutex.withLock {
                                            if (session.isActive) {
                                                session.send(GSON.toJson(newBooks))
                                            }
                                        }
                                    }
                                } catch (e: Exception) {
                                    e.printOnDebug()
                                }
                            }
                        }.awaitAll()
                    } catch (e: Exception) {
                        e.printOnDebug()
                    }
                }

                regularSearchJob.join()
                extensionSearchJob.join()

                sendMutex.withLock {
                    if (session.isActive) {
                        session.close(CloseReason(CloseReason.Codes.NORMAL, SEARCH_FINISH))
                    }
                }
            } catch (exception: CancellationException) {
                throw exception
            } catch (exception: Throwable) {
                sendMutex.withLock {
                    if (session.isActive) {
                        session.close(CloseReason(CloseReason.Codes.INTERNAL_ERROR, exception.toString()))
                    }
                }
            }
        }
    }
}
