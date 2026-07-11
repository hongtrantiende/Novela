package io.legado.app.utils

import android.app.ActivityManager
import android.os.Build
import splitties.init.appCtx

/**
 * Utility to detect device performance tier.
 * Used to automatically reduce UI complexity on weak devices
 * to prevent ANR/freeze caused by GPU overload.
 *
 * Detection criteria:
 * - ActivityManager.isLowRamDevice() (system-level flag)
 * - Total RAM < 4GB
 * - Known weak GPU chipsets (PowerVR GE8xxx on MediaTek Helio G/P series)
 */
object DevicePerformanceUtil {

    /**
     * Cached result — computed once on first access.
     * true = device is low-performance, should simplify UI.
     */
    val isLowPerformanceDevice: Boolean by lazy {
        checkIsLowPerformance()
    }

    private fun checkIsLowPerformance(): Boolean {
        val am = appCtx.getSystemService(ActivityManager::class.java)

        // Check 1: System flag
        if (am?.isLowRamDevice == true) return true

        // Check 2: Total RAM < 4GB
        val memInfo = ActivityManager.MemoryInfo()
        am?.getMemoryInfo(memInfo)
        val totalRamGB = memInfo.totalMem / (1024.0 * 1024.0 * 1024.0)
        if (totalRamGB < 4.0) return true

        // Check 3: Known weak chipsets (MediaTek Helio G35/P35/G37 etc.)
        val hardware = Build.HARDWARE.lowercase()
        val board = Build.BOARD.lowercase()
        val weakChipsets = listOf(
            "mt6765", // Helio G35 / P35
            "mt6762", // Helio P22 / A22
            "mt6761", // Helio A20
            "mt6739", // Budget MTK
            "mt6580", // Budget MTK
            "mt6737", // Budget MTK
        )
        if (weakChipsets.any { hardware.contains(it) || board.contains(it) }) return true

        return false
    }
}
