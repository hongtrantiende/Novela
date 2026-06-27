package io.legado.app.help

import cn.hutool.crypto.symmetric.AES
import io.legado.app.constant.AppConst
import io.legado.app.utils.getPrefLong
import io.legado.app.utils.getPrefString
import io.legado.app.utils.putPrefLong
import io.legado.app.utils.putPrefString
import splitties.init.appCtx
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.toRequestBody

object MemberManager {
    private const val SECRET_KEY = "NovelaSecretKey!" // 16 bytes
    private const val PREF_MEMBER_KEY = "member_activation_key"
    private const val PREF_MEMBER_EXPIRE = "member_expire_time"

    val isVip: Boolean
        get() {
            if (io.legado.app.help.config.LocalConfig.userEmail?.lowercase()?.trim() == "nthanhnam@gmail.com") {
                return true
            }
            if (io.legado.app.help.config.LocalConfig.vipExpireFromServer > System.currentTimeMillis()) {
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
            if (io.legado.app.help.config.LocalConfig.userEmail?.lowercase()?.trim() == "nthanhnam@gmail.com") {
                return 9999
            }
            if (io.legado.app.help.config.LocalConfig.vipExpireFromServer > System.currentTimeMillis()) {
                val diff = io.legado.app.help.config.LocalConfig.vipExpireFromServer - System.currentTimeMillis()
                return diff / (24 * 60 * 60 * 1000)
            }
            val expireTime = appCtx.getPrefLong(PREF_MEMBER_EXPIRE, 0L)
            val diff = expireTime - System.currentTimeMillis()
            return if (diff <= 0) 0 else diff / (24 * 60 * 60 * 1000)
        }

    val expireDateString: String
        get() {
            if (io.legado.app.help.config.LocalConfig.userEmail?.lowercase()?.trim() == "nthanhnam@gmail.com") {
                return "Vô hạn (Admin)"
            }
            if (io.legado.app.help.config.LocalConfig.vipExpireFromServer > System.currentTimeMillis()) {
                val sdf = java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.getDefault())
                return sdf.format(java.util.Date(io.legado.app.help.config.LocalConfig.vipExpireFromServer))
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

    fun fetchSupabaseUsers(serviceRoleKey: String): Result<List<SupabaseUser>> {
        return try {
            val request = okhttp3.Request.Builder()
                .url("https://arsnnqwcqzaqhndxemgz.supabase.co/auth/v1/admin/users")
                .header("apikey", serviceRoleKey)
                .header("Authorization", "Bearer $serviceRoleKey")
                .get()
                .build()

            io.legado.app.help.http.okHttpClient.newCall(request).execute().use { response ->
                val responseBody = response.body?.string()
                if (!response.isSuccessful) {
                    val json = org.json.JSONObject(responseBody ?: "{}")
                    val msg = json.optString("msg", json.optString("error_description", "Lỗi API"))
                    return Result.failure(Exception(msg))
                }
                val jsonObject = org.json.JSONObject(responseBody!!)
                val usersArray = jsonObject.getJSONArray("users")
                val list = mutableListOf<SupabaseUser>()
                for (i in 0 until usersArray.length()) {
                    val userObj = usersArray.getJSONObject(i)
                    val id = userObj.getString("id")
                    val email = userObj.optString("email", "")
                    val userMetadata = userObj.optJSONObject("user_metadata")
                    val vipExpire = userMetadata?.optLong("vip_expire", 0L) ?: 0L
                    list.add(SupabaseUser(id, email, vipExpire))
                }
                Result.success(list)
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    fun updateUserVipExpire(serviceRoleKey: String, userId: String, expireTimestamp: Long): Result<Boolean> {
        return try {
            val json = org.json.JSONObject()
            val meta = org.json.JSONObject()
            meta.put("vip_expire", expireTimestamp)
            json.put("user_metadata", meta)
            
            val mediaType = "application/json; charset=utf-8".toMediaType()
            val body = json.toString().toRequestBody(mediaType)
            
            val request = okhttp3.Request.Builder()
                .url("https://arsnnqwcqzaqhndxemgz.supabase.co/auth/v1/admin/users/$userId")
                .header("apikey", serviceRoleKey)
                .header("Authorization", "Bearer $serviceRoleKey")
                .put(body)
                .build()

            io.legado.app.help.http.okHttpClient.newCall(request).execute().use { response ->
                val responseBody = response.body?.string()
                if (!response.isSuccessful) {
                    val errJson = org.json.JSONObject(responseBody ?: "{}")
                    val msg = errJson.optString("msg", errJson.optString("error_description", "Lỗi cập nhật"))
                    return Result.failure(Exception(msg))
                }
                Result.success(true)
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}

data class SupabaseUser(
    val id: String,
    val email: String,
    val vipExpire: Long
)
