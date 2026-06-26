package io.legado.app.help.book

import io.legado.app.ui.config.otherConfig.OtherConfig
import io.legado.app.utils.getPrefInt
import io.legado.app.utils.getPrefLong
import io.legado.app.utils.putPrefInt
import io.legado.app.utils.putPrefLong
import splitties.init.appCtx

object BookDownloadConfig {

    fun getThreadCount(bookUrl: String): Int {
        val key = "download_threads_$bookUrl"
        val count = appCtx.getPrefInt(key, -1)
        if (count == -1) {
            return OtherConfig.cacheBookThreadCount
        }
        return count
    }

    fun setThreadCount(bookUrl: String, threadCount: Int) {
        val key = "download_threads_$bookUrl"
        appCtx.putPrefInt(key, threadCount)
    }

    fun getDelay(bookUrl: String): Long {
        val key = "download_delay_$bookUrl"
        val delay = appCtx.getPrefLong(key, -1L)
        if (delay == -1L) {
            return OtherConfig.downloadDelay
        }
        return delay
    }

    fun setDelay(bookUrl: String, delay: Long) {
        val key = "download_delay_$bookUrl"
        appCtx.putPrefLong(key, delay)
    }
}
