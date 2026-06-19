package io.legado.app.vbookextension.util

import android.content.Context
import android.util.Log
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.Semaphore

object ExtensionRequestRateLimiter {
    private const val TAG = "ExtRateLimiter"
    private val semaphores = ConcurrentHashMap<String, Semaphore>()
    private val threadCounts = ConcurrentHashMap<String, Int>()

    fun acquire(extensionId: String, context: Context) {
        val prefs = context.getSharedPreferences("novel_reader_prefs", Context.MODE_PRIVATE)

        // 1. Connection Interval (delay in milliseconds)
        val delayMs = prefs.getInt("ext_connection_interval_$extensionId", 0)
        if (delayMs > 0) {
            try {
                Thread.sleep(delayMs.toLong())
            } catch (e: InterruptedException) {
                Thread.currentThread().interrupt()
            }
        }

        // 2. Parallel Connection Thread Count (default: 3)
        val threadCount = prefs.getInt("ext_parallel_connections_$extensionId", 3).coerceIn(1, 32)
        
        var semaphore = semaphores.getOrPut(extensionId) {
            threadCounts[extensionId] = threadCount
            Semaphore(threadCount, true)
        }

        // If the configured thread limit changed, recreate the semaphore dynamically
        val lastCount = threadCounts[extensionId] ?: threadCount
        if (lastCount != threadCount) {
            synchronized(this) {
                val currentSem = semaphores[extensionId]
                if (currentSem != null) {
                    // Re-create the semaphore with the new thread count
                    val newSem = Semaphore(threadCount, true)
                    semaphores[extensionId] = newSem
                    threadCounts[extensionId] = threadCount
                    semaphore = newSem
                }
            }
        }

        try {
            semaphore.acquire()
        } catch (e: InterruptedException) {
            Thread.currentThread().interrupt()
        }
    }

    fun release(extensionId: String) {
        semaphores[extensionId]?.release()
    }
}
