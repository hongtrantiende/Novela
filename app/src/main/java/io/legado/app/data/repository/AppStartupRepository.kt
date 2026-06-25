package io.legado.app.data.repository

import io.legado.app.data.AppDatabase
import io.legado.app.domain.gateway.AppStartupGateway
import io.legado.app.help.DefaultData

class AppStartupRepository(
    private val appDatabase: AppDatabase
) : AppStartupGateway {

    override suspend fun deleteNotShelfBooks() {
        appDatabase.bookDao.deleteNotShelfBook()
    }

    override suspend fun ensureDefaultHttpTts() {
        // Delete Baidu and Alibaba Cloud engines if they exist
        appDatabase.httpTTSDao.get(-100L)?.let { appDatabase.httpTTSDao.delete(it) }
        appDatabase.httpTTSDao.get(-29L)?.let { appDatabase.httpTTSDao.delete(it) }

        if (appDatabase.httpTTSDao.count == 0) {
            appDatabase.httpTTSDao.insert(*DefaultData.httpTTS.toTypedArray())
        } else {
            DefaultData.httpTTS.forEach { defaultTts ->
                if (defaultTts.id in -138..-101 || appDatabase.httpTTSDao.get(defaultTts.id) == null) {
                    appDatabase.httpTTSDao.insert(defaultTts)
                }
            }
        }
    }
}
