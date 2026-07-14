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

    fun refreshAccessToken(): String? {
        val apikey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImFyc25ucXdjcXphcWhuZHhlbWd6Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3NzgzNDE3NTksImV4cCI6MjA5MzkxNzc1OX0.dvPw5jgvPGmDqqoHF5la_d7AAwxH5PhVLhVSP5ayWA8"
        val refreshToken = io.legado.app.help.config.LocalConfig.refreshToken
        if (refreshToken.isNullOrBlank()) return null
        
        val refreshJson = org.json.JSONObject()
        refreshJson.put("refresh_token", refreshToken)
        val mediaType = "application/json; charset=utf-8".toMediaType()
        val refreshBody = refreshJson.toString().toRequestBody(mediaType)
        
        val refreshRequest = okhttp3.Request.Builder()
            .url("https://arsnnqwcqzaqhndxemgz.supabase.co/auth/v1/token?grant_type=refresh_token")
            .header("apikey", apikey)
            .header("Authorization", "Bearer $apikey")
            .post(refreshBody)
            .build()
            
        return try {
            io.legado.app.help.http.okHttpClient.newCall(refreshRequest).execute().use { refreshResponse ->
                if (refreshResponse.isSuccessful) {
                    val refreshBodyStr = refreshResponse.body?.string()
                    if (!refreshBodyStr.isNullOrBlank()) {
                        val refreshJsonObj = org.json.JSONObject(refreshBodyStr)
                        val newAccessToken = refreshJsonObj.getString("access_token")
                        val newRefreshToken = refreshJsonObj.optString("refresh_token", "")
                        
                        io.legado.app.help.config.LocalConfig.accessToken = newAccessToken
                        if (newRefreshToken.isNotBlank()) {
                            io.legado.app.help.config.LocalConfig.refreshToken = newRefreshToken
                        }
                        newAccessToken
                    } else null
                } else {
                    if (refreshResponse.code == 400) {
                        io.legado.app.help.config.LocalConfig.accessToken = null
                        io.legado.app.help.config.LocalConfig.refreshToken = null
                        io.legado.app.help.config.LocalConfig.vipExpireFromServer = 0L
                    }
                    null
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    fun checkVipStatus(accessToken: String): Result<Long> {
        return try {
            val apikey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImFyc25ucXdjcXphcWhuZHhlbWd6Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3NzgzNDE3NTksImV4cCI6MjA5MzkxNzc1OX0.dvPw5jgvPGmDqqoHF5la_d7AAwxH5PhVLhVSP5ayWA8"
            var activeToken = accessToken
            
            var request = okhttp3.Request.Builder()
                .url("https://arsnnqwcqzaqhndxemgz.supabase.co/auth/v1/user")
                .header("apikey", apikey)
                .header("Authorization", "Bearer $activeToken")
                .get()
                .build()

            var responseCode = 0
            var responseBodyStr = ""
            var success = false
            
            io.legado.app.help.http.okHttpClient.newCall(request).execute().use { response ->
                responseCode = response.code
                responseBodyStr = response.body?.string() ?: ""
                success = response.isSuccessful
            }

            if (responseCode == 401) {
                val newAccessToken = refreshAccessToken()
                if (newAccessToken != null) {
                    activeToken = newAccessToken
                    request = okhttp3.Request.Builder()
                        .url("https://arsnnqwcqzaqhndxemgz.supabase.co/auth/v1/user")
                        .header("apikey", apikey)
                        .header("Authorization", "Bearer $activeToken")
                        .get()
                        .build()
                        
                    io.legado.app.help.http.okHttpClient.newCall(request).execute().use { retryResponse ->
                        responseCode = retryResponse.code
                        responseBodyStr = retryResponse.body?.string() ?: ""
                        success = retryResponse.isSuccessful
                    }
                }
            }

            if (success && responseBodyStr.isNotBlank()) {
                val jsonObject = org.json.JSONObject(responseBodyStr)
                val userId = jsonObject.optString("id", "")
                val userMetadata = jsonObject.optJSONObject("user_metadata")
                var vipExpire = userMetadata?.optLong("vip_expire", 0L) ?: 0L
                val displayName = userMetadata?.optString("display_name", userMetadata.optString("name", "")) ?: ""
                io.legado.app.help.config.LocalConfig.userDisplayName = displayName

                if (userId.isNotBlank()) {
                    val profileRequest = okhttp3.Request.Builder()
                        .url("https://arsnnqwcqzaqhndxemgz.supabase.co/rest/v1/profiles?id=eq.$userId&select=vip_until")
                        .header("apikey", apikey)
                        .header("Authorization", "Bearer $activeToken")
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
            } else {
                Result.success(io.legado.app.help.config.LocalConfig.vipExpireFromServer)
            }
        } catch (e: Exception) {
            Result.success(io.legado.app.help.config.LocalConfig.vipExpireFromServer)
        }
    }

    fun login(email: String, password: String): Result<String> {
        return try {
            io.legado.app.help.config.LocalConfig.vipExpireFromServer = 0L
            val apikey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImFyc25ucXdjcXphcWhuZHhlbWd6Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3NzgzNDE3NTksImV4cCI6MjA5MzkxNzc1OX0.dvPw5jgvPGmDqqoHF5la_d7AAwxH5PhVLhVSP5ayWA8"
            val json = org.json.JSONObject()
            json.put("email", email)
            json.put("password", password)
            val body = json.toString().toRequestBody("application/json; charset=utf-8".toMediaType())
            val request = okhttp3.Request.Builder()
                .url("https://arsnnqwcqzaqhndxemgz.supabase.co/auth/v1/token?grant_type=password")
                .header("apikey", apikey)
                .header("Authorization", "Bearer $apikey")
                .post(body)
                .build()

            io.legado.app.help.http.okHttpClient.newCall(request).execute().use { response ->
                val responseBody = response.body?.string()
                if (!response.isSuccessful) {
                    val errJson = org.json.JSONObject(responseBody ?: "{}")
                    val msg = errJson.optString("error_description", errJson.optString("msg", "Lỗi đăng nhập"))
                    return Result.failure(Exception(msg))
                }
                val jsonObject = org.json.JSONObject(responseBody!!)
                val accessToken = jsonObject.getString("access_token")
                val refreshToken = jsonObject.optString("refresh_token", "")
                val user = jsonObject.getJSONObject("user")
                val userEmail = user.getString("email").lowercase().trim()
                val userMetadata = user.optJSONObject("user_metadata")
                val displayName = userMetadata?.optString("display_name", userMetadata.optString("name", "")) ?: ""
                val avatar = userMetadata?.optString("avatar", "") ?: ""

                io.legado.app.help.config.LocalConfig.accessToken = accessToken
                if (refreshToken.isNotBlank()) {
                    io.legado.app.help.config.LocalConfig.refreshToken = refreshToken
                }
                io.legado.app.help.config.LocalConfig.userEmail = userEmail
                io.legado.app.help.config.LocalConfig.userDisplayName = displayName
                io.legado.app.help.config.LocalConfig.userAvatar = avatar.takeIf { it.isNotBlank() }
                io.legado.app.help.config.LocalConfig.isLoggedIn = true

                // Sync VIP status
                checkVipStatus(accessToken)
                
                Result.success("Đăng nhập thành công!")
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    fun signup(email: String, password: String): Result<String> {
        return try {
            val apikey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImFyc25ucXdjcXphcWhuZHhlbWd6Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3NzgzNDE3NTksImV4cCI6MjA5MzkxNzc1OX0.dvPw5jgvPGmDqqoHF5la_d7AAwxH5PhVLhVSP5ayWA8"
            val json = org.json.JSONObject()
            json.put("email", email)
            json.put("password", password)
            val body = json.toString().toRequestBody("application/json; charset=utf-8".toMediaType())
            val request = okhttp3.Request.Builder()
                .url("https://arsnnqwcqzaqhndxemgz.supabase.co/auth/v1/signup")
                .header("apikey", apikey)
                .header("Authorization", "Bearer $apikey")
                .post(body)
                .build()

            io.legado.app.help.http.okHttpClient.newCall(request).execute().use { response ->
                val responseBody = response.body?.string()
                if (!response.isSuccessful) {
                    val errJson = org.json.JSONObject(responseBody ?: "{}")
                    val msg = errJson.optString("error_description", errJson.optString("msg", "Lỗi đăng ký"))
                    return Result.failure(Exception(msg))
                }
                Result.success("Đăng ký tài khoản thành công! Vui lòng xác thực email của bạn.")
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    fun updateCurrentUserData(accessToken: String, displayName: String, avatarBase64: String? = null, password: String? = null): Result<Boolean> {
        return try {
            val apikey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImFyc25ucXdjcXphcWhuZHhlbWd6Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3NzgzNDE3NTksImV4cCI6MjA5MzkxNzc1OX0.dvPw5jgvPGmDqqoHF5la_d7AAwxH5PhVLhVSP5ayWA8"
            var activeToken = accessToken
            val json = org.json.JSONObject()
            val meta = org.json.JSONObject()
            meta.put("display_name", displayName)
            if (avatarBase64 != null) {
                meta.put("avatar", avatarBase64)
            }
            json.put("data", meta)
            
            if (!password.isNullOrBlank()) {
                json.put("password", password)
            }
            
            val mediaType = "application/json; charset=utf-8".toMediaType()
            val body = json.toString().toRequestBody(mediaType)
            
            var request = okhttp3.Request.Builder()
                .url("https://arsnnqwcqzaqhndxemgz.supabase.co/auth/v1/user")
                .header("apikey", apikey)
                .header("Authorization", "Bearer $activeToken")
                .put(body)
                .build()

            var responseCode = 0
            var responseBody = ""
            var success = false
            
            io.legado.app.help.http.okHttpClient.newCall(request).execute().use { response ->
                responseCode = response.code
                responseBody = response.body?.string() ?: ""
                success = response.isSuccessful
            }

            if (!success && (responseCode == 401 || responseCode == 400 || responseBody.contains("invalid JWT"))) {
                val newAccessToken = refreshAccessToken()
                if (newAccessToken != null) {
                    activeToken = newAccessToken
                    request = okhttp3.Request.Builder()
                        .url("https://arsnnqwcqzaqhndxemgz.supabase.co/auth/v1/user")
                        .header("apikey", apikey)
                        .header("Authorization", "Bearer $activeToken")
                        .put(body)
                        .build()
                        
                    io.legado.app.help.http.okHttpClient.newCall(request).execute().use { response ->
                        responseCode = response.code
                        responseBody = response.body?.string() ?: ""
                        success = response.isSuccessful
                    }
                }
            }

            if (!success) {
                val errJson = org.json.JSONObject(responseBody)
                val msg = errJson.optString("msg", errJson.optString("error_description", "Lỗi cập nhật"))
                return Result.failure(Exception(msg))
            }

            io.legado.app.help.config.LocalConfig.userDisplayName = displayName
            if (avatarBase64 != null) {
                io.legado.app.help.config.LocalConfig.userAvatar = avatarBase64
            }
            Result.success(true)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    fun updateCurrentUserPassword(accessToken: String, email: String, oldPass: String, newPass: String): Result<Boolean> {
        val loginResult = login(email, oldPass)
        if (loginResult.isFailure) {
            return Result.failure(Exception("Mật khẩu cũ không chính xác"))
        }
        
        val apikey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImFyc25ucXdjcXphcWhuZHhlbWd6Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3NzgzNDE3NTksImV4cCI6MjA5MzkxNzc1OX0.dvPw5jgvPGmDqqoHF5la_d7AAwxH5PhVLhVSP5ayWA8"
        return try {
            val json = org.json.JSONObject()
            json.put("password", newPass)
            
            val mediaType = "application/json; charset=utf-8".toMediaType()
            val body = json.toString().toRequestBody(mediaType)
            
            val request = okhttp3.Request.Builder()
                .url("https://arsnnqwcqzaqhndxemgz.supabase.co/auth/v1/user")
                .header("apikey", apikey)
                .header("Authorization", "Bearer $accessToken")
                .put(body)
                .build()

            io.legado.app.help.http.okHttpClient.newCall(request).execute().use { response ->
                val responseBody = response.body?.string()
                if (!response.isSuccessful) {
                    val errJson = org.json.JSONObject(responseBody ?: "{}")
                    val msg = errJson.optString("msg", errJson.optString("error_description", "Lỗi đổi mật khẩu"))
                    return Result.failure(Exception(msg))
                }
                Result.success(true)
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    fun compressUriToBase64(context: android.content.Context, uri: android.net.Uri): String? {
        return try {
            val inputStream = context.contentResolver.openInputStream(uri)
            val originalBitmap = android.graphics.BitmapFactory.decodeStream(inputStream)
            inputStream?.close()
            if (originalBitmap == null) return null

            val maxSize = 360
            val width = originalBitmap.width
            val height = originalBitmap.height
            val bitmap = if (width > maxSize || height > maxSize) {
                val ratio = width.toFloat() / height.toFloat()
                val (newWidth, newHeight) = if (ratio > 1) {
                    maxSize to (maxSize / ratio).toInt()
                } else {
                    (maxSize * ratio).toInt() to maxSize
                }
                android.graphics.Bitmap.createScaledBitmap(originalBitmap, newWidth, newHeight, true)
            } else {
                originalBitmap
            }

            val outputStream = java.io.ByteArrayOutputStream()
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, outputStream)
            val bytes = outputStream.toByteArray()
            android.util.Base64.encodeToString(bytes, android.util.Base64.NO_WRAP)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}

data class SupabaseUser(
    val id: String,
    val email: String,
    val vipExpire: Long,
    val displayName: String
)
