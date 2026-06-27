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
                .url("https://arsnnqwcqzaqhndxemgz.supabase.co/auth/v1/admin/users?per_page=10000")
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
                    val displayName = userMetadata?.optString("display_name", userMetadata.optString("name", "")) ?: ""
                    list.add(SupabaseUser(id, email, vipExpire, displayName))
                }
                Result.success(list)
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    fun updateUserProfile(
        serviceRoleKey: String,
        userId: String,
        displayName: String,
        vipExpire: Long?
    ): Result<Boolean> {
        return try {
            val json = org.json.JSONObject()
            val meta = org.json.JSONObject()
            meta.put("display_name", displayName)
            if (vipExpire != null) {
                meta.put("vip_expire", vipExpire)
            } else {
                meta.put("vip_expire", org.json.JSONObject.NULL)
            }
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

    fun checkVipStatus(accessToken: String): Result<Long> {
        return try {
            val request = okhttp3.Request.Builder()
                .url("https://arsnnqwcqzaqhndxemgz.supabase.co/auth/v1/user")
                .header("apikey", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImFyc25ucXdjcXphcWhuZHhlbWd6Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3NzgzNDE3NTksImV4cCI6MjA5MzkxNzc1OX0.dvPw5jgvPGmDqqoHF5la_d7AAwxH5PhVLhVSP5ayWA8")
                .header("Authorization", "Bearer $accessToken")
                .get()
                .build()

            var vipExpire = 0L
            var userId = ""
            io.legado.app.help.http.okHttpClient.newCall(request).execute().use { response ->
                val responseBody = response.body?.string()
                if (response.isSuccessful && !responseBody.isNullOrBlank()) {
                    val jsonObject = org.json.JSONObject(responseBody)
                    userId = jsonObject.optString("id", "")
                    val userMetadata = jsonObject.optJSONObject("user_metadata")
                    vipExpire = userMetadata?.optLong("vip_expire", 0L) ?: 0L
                }
            }

            if (userId.isNotBlank()) {
                val profileRequest = okhttp3.Request.Builder()
                    .url("https://arsnnqwcqzaqhndxemgz.supabase.co/rest/v1/profiles?id=eq.$userId&select=vip_until")
                    .header("apikey", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImFyc25ucXdjcXphcWhuZHhlbWd6Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3NzgzNDE3NTksImV4cCI6MjA5MzkxNzc1OX0.dvPw5jgvPGmDqqoHF5la_d7AAwxH5PhVLhVSP5ayWA8")
                    .header("Authorization", "Bearer $accessToken")
                    .get()
                    .build()

                try {
                    io.legado.app.help.http.okHttpClient.newCall(profileRequest).execute().use { resp ->
                        val body = resp.body?.string()
                        if (resp.isSuccessful && !body.isNullOrBlank()) {
                            val arr = org.json.JSONArray(body)
                            if (arr.length() > 0) {
                                val item = arr.getJSONObject(0)
                                if (!item.isNull("vip_until")) {
                                    val vipUntilStr = item.optString("vip_until", "")
                                    if (vipUntilStr.isNotBlank()) {
                                        val dateStr = vipUntilStr.substringBefore("T")
                                        val formatter = java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.US)
                                        val date = formatter.parse(dateStr)
                                        if (date != null) {
                                            val profileVip = date.time + 24 * 60 * 60 * 1000L - 1000L
                                            if (profileVip > vipExpire) {
                                                vipExpire = profileVip
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }

            io.legado.app.help.config.LocalConfig.vipExpireFromServer = vipExpire
            Result.success(vipExpire)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}

data class SupabaseUser(
    val id: String,
    val email: String,
    val vipExpire: Long,
    val displayName: String
)
