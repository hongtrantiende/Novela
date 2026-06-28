package io.legado.app.help

import android.content.Context
import android.net.Uri
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.Scope
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential
import com.google.api.client.http.InputStreamContent
import com.google.api.client.http.javanet.NetHttpTransport
import com.google.api.client.json.gson.GsonFactory
import com.google.api.services.drive.Drive
import com.google.api.services.drive.DriveScopes
import com.google.api.services.drive.model.File
import io.legado.app.constant.AppLog
import io.legado.app.ui.config.backupConfig.BackupConfig
import io.legado.app.utils.NetworkUtils
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import splitties.init.appCtx
import java.io.InputStream
import java.util.Collections

object AppGoogleDrive {
    private const val FOLDER_MIME_TYPE = "application/vnd.google-apps.folder"
    private const val APP_FOLDER_NAME = "Novela"

    private var googleSignInClient: GoogleSignInClient? = null

    init {
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .requestScopes(Scope(DriveScopes.DRIVE_FILE))
            .build()
        googleSignInClient = GoogleSignIn.getClient(appCtx, gso)
    }

    fun getSignInClient(context: Context): GoogleSignInClient {
        if (googleSignInClient == null) {
            val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .requestScopes(Scope(DriveScopes.DRIVE_FILE))
                .build()
            googleSignInClient = GoogleSignIn.getClient(context.applicationContext, gso)
        }
        return googleSignInClient!!
    }

    fun getSignedInAccount(context: Context): GoogleSignInAccount? {
        val account = GoogleSignIn.getLastSignedInAccount(context)
        val hasScope = GoogleSignIn.hasPermissions(account, Scope(DriveScopes.DRIVE_FILE))
        return if (hasScope) account else null
    }

    private fun getDriveService(context: Context): Drive? {
        val account = getSignedInAccount(context) ?: return null
        val credential = GoogleAccountCredential.usingOAuth2(
            context,
            Collections.singleton(DriveScopes.DRIVE_FILE)
        ).setSelectedAccount(account.account)

        return Drive.Builder(
            NetHttpTransport(),
            GsonFactory.getDefaultInstance(),
            credential
        ).setApplicationName("Novela").build()
    }

    /**
     * Lấy hoặc tạo thư mục Thiên Thư Các trên Drive
     */
    private fun getOrCreateFolder(driveService: Drive): String? {
        try {
            // Tìm kiếm thư mục có sẵn
            val query = "mimeType = '$FOLDER_MIME_TYPE' and name = '$APP_FOLDER_NAME' and trashed = false"
            val result = driveService.files().list()
                .setQ(query)
                .setSpaces("drive")
                .setFields("files(id)")
                .execute()
            
            val files = result.files
            if (!files.isNullOrEmpty()) {
                return files[0].id
            }

            // Tạo thư mục mới nếu chưa có
            val folderMetadata = File().apply {
                name = APP_FOLDER_NAME
                mimeType = FOLDER_MIME_TYPE
            }
            val folder = driveService.files().create(folderMetadata)
                .setFields("id")
                .execute()
            return folder.id
        } catch (e: Exception) {
            AppLog.put("Không thể tạo thư mục Google Drive: ${e.localizedMessage}", e)
        }
        return null
    }

    /**
     * Đẩy file lên Google Drive
     */
    suspend fun uploadFile(uri: Uri, fileName: String, mimeType: String = "application/octet-stream") = withContext(Dispatchers.IO) {
        if (!NetworkUtils.isAvailable()) {
            throw Exception("Không có kết nối mạng")
        }
        val account = getSignedInAccount(appCtx)
        if (account == null) {
            val errMsg = "Google Drive chưa đăng nhập hoặc thiếu quyền"
            AppLog.put(errMsg, null)
            throw Exception(errMsg)
        }
        
        try {
            val driveService = getDriveService(appCtx) 
                ?: throw Exception("Không thể khởi tạo dịch vụ Google Drive")
            val folderId = getOrCreateFolder(driveService)
            
            // Xóa file trùng tên cũ trong thư mục Thiên Thư Các
            val parentQuery = if (folderId != null) "'$folderId' in parents and " else ""
            val query = "${parentQuery}name = '$fileName' and trashed = false"
            val searchResult = driveService.files().list()
                .setQ(query)
                .setSpaces("drive")
                .setFields("files(id)")
                .execute()
            
            val existingFiles = searchResult.files
            if (!existingFiles.isNullOrEmpty()) {
                for (existingFile in existingFiles) {
                    try {
                        driveService.files().delete(existingFile.id).execute()
                    } catch (e: Exception) {
                        // Bỏ qua lỗi xóa nếu không có quyền
                    }
                }
            }

            // Tạo metadata cho file mới
            val fileMetadata = File().apply {
                name = fileName
                if (folderId != null) {
                    parents = listOf(folderId)
                }
            }

            val inputStream: InputStream = if (uri.scheme == "file") {
                val file = java.io.File(uri.path!!)
                if (!file.exists()) {
                    throw Exception("Tập tin tạm không tồn tại: ${file.absolutePath}")
                }
                java.io.FileInputStream(file)
            } else {
                appCtx.contentResolver.openInputStream(uri) 
                    ?: throw Exception("Không thể mở tệp từ Uri: $uri")
            }

            val mediaContent = InputStreamContent(mimeType, inputStream)
            val file = driveService.files().create(fileMetadata, mediaContent)
                .setFields("id")
                .execute()
            
            AppLog.put("Tải lên Google Drive thành công: $fileName (ID: ${file.id})", null)
        } catch (e: Exception) {
            AppLog.put("Lỗi khi tải file lên Google Drive: ${e.localizedMessage}", e)
            throw e
        }
    }
}
