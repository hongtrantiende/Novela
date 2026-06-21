package io.legado.app.utils

import kotlin.math.abs

fun Long.toTimeAgo(): String {
    val curTime = System.currentTimeMillis()
    val time = this
    val seconds = abs(System.currentTimeMillis() - time) / 1000f
    val end = if (time < curTime) "phía trước" else "mặt sau"

    val start = when {
        seconds < 60 -> "${seconds.toInt()} giây"
        seconds < 3600 -> {
            val minutes = seconds / 60f
            "${minutes.toInt()} phút"
        }
        seconds < 86400 -> {
            val hours = seconds / 3600f
            "${hours.toInt()} giờ"
        }
        seconds < 604800 -> {
            val days = seconds / 86400f
            "${days.toInt()} ngày"
        }
        seconds < 2_628_000 -> {
            val weeks = seconds / 604800f
            "${weeks.toInt()}tuần"
        }
        seconds < 31_536_000 -> {
            val months = seconds / 2_628_000f
            "${months.toInt()}tháng"
        }
        else -> {
            val years = seconds / 31_536_000f
            "${years.toInt()}năm"
        }
    }
    return start + end
}