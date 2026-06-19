package io.legado.app.vbookextension.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Locale

@Entity(tableName = "extensions")
data class ExtensionEntity(
    @PrimaryKey val id: String,
    val name: String,
    val author: String = "Unknown",
    val version: Int = 1,
    val source: String = "",
    val type: String = "novel",
    val locale: String = "vi_VN",
    val description: String = "",
    val localPath: String = "",
    val iconPath: String? = null,
    val isInstalled: Boolean = false,
    val isEnabled: Boolean = true,
    val repositoryUrl: String? = null,
)

@Entity(tableName = "repositories")
data class RepositoryEntity(
    @PrimaryKey val url: String,
    val name: String = "",
    val addedAt: Long = System.currentTimeMillis(),
    val isEnabled: Boolean = true,
)

val ExtensionEntity.cleanName: String
    get() {
        var clean = name
        // 1. Loại bỏ các phần trong ngoặc tròn/vuông chứa "Đăng Nhập", "Login", "VPN", "🔑", "🌐"
        val bracketKeywordsRegex = Regex("""[(\[][^()\n\[\]]*(đăng nhập|login|vpn|🔑|🌐)[^()\n\[\]]*[)\]]""", RegexOption.IGNORE_CASE)
        clean = bracketKeywordsRegex.replace(clean, "")

        // 2. Loại bỏ các từ khóa đăng nhập, vpn riêng lẻ nếu có
        val standaloneKeywordsRegex = Regex("\\b(đăng nhập|login|vpn)\\b", RegexOption.IGNORE_CASE)
        clean = standaloneKeywordsRegex.replace(clean, "")
        clean = clean.replace("🔑", "").replace("🌐", "")

        // 3. Loại bỏ hoàn toàn ký tự đóng mở ngoặc nhưng giữ chữ bên trong
        clean = clean.replace("(", "").replace(")", "").replace("[", "").replace("]", "")

        // 4. Loại bỏ khoảng trắng thừa
        clean = clean.replace(Regex("\\s+"), " ").trim()

        return clean
    }
