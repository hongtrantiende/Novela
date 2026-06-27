package io.legado.app.help

import cn.hutool.crypto.symmetric.AES
import io.legado.app.constant.AppConst
import io.legado.app.utils.getPrefLong
import io.legado.app.utils.getPrefString
import io.legado.app.utils.putPrefLong
import io.legado.app.utils.putPrefString
import splitties.init.appCtx

object MemberManager {
    private const val SECRET_KEY = "NovelaSecretKey!" // 16 bytes
    private const val PREF_MEMBER_KEY = "member_activation_key"
    private const val PREF_MEMBER_EXPIRE = "member_expire_time"

    val isVip: Boolean
        get() {
            if (io.legado.app.help.config.LocalConfig.userEmail == "nthanhnam@gmail.com") {
                return true
            }
            val expireTime = appCtx.getPrefLong(PREF_MEMBER_EXPIRE, 0L)
            if (expireTime <= System.currentTimeMillis()) {
                return false
            }
            val key = appCtx.getPrefString(PREF_MEMBER_KEY) ?: return false
            return validateKey(key, AppConst.androidId)
        }

    val daysRemaining: Long
        get() {
            if (io.legado.app.help.config.LocalConfig.userEmail == "nthanhnam@gmail.com") {
                return 9999
            }
            val expireTime = appCtx.getPrefLong(PREF_MEMBER_EXPIRE, 0L)
            val diff = expireTime - System.currentTimeMillis()
            return if (diff <= 0) 0 else diff / (24 * 60 * 60 * 1000)
        }

    val expireDateString: String
        get() {
            if (io.legado.app.help.config.LocalConfig.userEmail == "nthanhnam@gmail.com") {
                return "Vô hạn (Admin)"
            }
            val expireTime = appCtx.getPrefLong(PREF_MEMBER_EXPIRE, 0L)
            if (expireTime <= 0) return "Chưa kích hoạt"
            val sdf = java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.getDefault())
            return sdf.format(java.util.Date(expireTime))
        }

    fun validateKey(key: String, deviceId: String): Boolean {
        return try {
            val aes = AES(SECRET_KEY.encodeToByteArray(0, 16))
            val decrypted = aes.decryptStr(key)
            val parts = decrypted.split("|")
            if (parts.size == 2) {
                val decodedDeviceId = parts[0]
                val expireTimestamp = parts[1].toLong()
                decodedDeviceId == deviceId && expireTimestamp > System.currentTimeMillis()
            } else {
                false
            }
        } catch (e: Exception) {
            false
        }
    }

    fun activate(key: String): Boolean {
        val deviceId = AppConst.androidId
        if (validateKey(key, deviceId)) {
            try {
                val aes = AES(SECRET_KEY.encodeToByteArray(0, 16))
                val decrypted = aes.decryptStr(key)
                val parts = decrypted.split("|")
                val expireTimestamp = parts[1].toLong()
                appCtx.putPrefString(PREF_MEMBER_KEY, key)
                appCtx.putPrefLong(PREF_MEMBER_EXPIRE, expireTimestamp)
                return true
            } catch (e: Exception) {
                // Ignore
            }
        }
        return false
    }

    fun generateKey(targetDeviceId: String, days: Int): String {
        val expireTimestamp = System.currentTimeMillis() + days.toLong() * 24 * 60 * 60 * 1000
        val plainText = "$targetDeviceId|$expireTimestamp"
        val aes = AES(SECRET_KEY.encodeToByteArray(0, 16))
        return aes.encryptHex(plainText)
    }
}
