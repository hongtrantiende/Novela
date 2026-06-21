package io.legado.app.help.http

import io.legado.app.constant.AppLog

object OkhttpUncaughtExceptionHandler : Thread.UncaughtExceptionHandler {

    override fun uncaughtException(t: Thread, e: Throwable) {
        AppLog.put("Lỗi thực thi luồng trong Okhttp Dispatcher\n${e.localizedMessage}", e)
    }

}
