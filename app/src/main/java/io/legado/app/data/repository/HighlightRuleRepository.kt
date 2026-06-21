package io.legado.app.data.repository

import android.content.Context
import io.legado.app.constant.PreferKey
import io.legado.app.data.appDb
import io.legado.app.data.dao.HighlightRuleDao
import io.legado.app.data.entities.HighlightRule
import io.legado.app.utils.GSON
import io.legado.app.utils.fromJsonArray
import io.legado.app.utils.getPrefBoolean
import io.legado.app.utils.putPrefBoolean
import splitties.init.appCtx
import java.io.File

class HighlightRuleRepository(
    private val dao: HighlightRuleDao = appDb.highlightRuleDao,
    private val context: Context = appCtx,
) {

    companion object {
        const val backupFileName = "highlightRule.json"
    }

    data class BackupData(
        val rules: List<HighlightRule> = emptyList(),
        val dialogEnabled: Boolean = true,
        val bookTitleEnabled: Boolean = true,
        val bracketNoteEnabled: Boolean = true,
    )

    fun load(configName: String): List<HighlightRule> {
        return dao.getAll().filter { it.matchesConfig(configName) }
    }

    fun loadEnabled(configName: String): List<HighlightRule> {
        return dao.getEnabled().filter { it.matchesConfig(configName) }
    }

    /**
     * 保存指定排版的规则。
     * 仅替换当前排版绑定的规则，不影响其他排版的规则。
     */
    fun save(configName: String, rules: List<HighlightRule>) {
        saveForConfig(rules, configName.ifBlank { null })
    }

    fun saveForConfig(rules: List<HighlightRule>, configName: String?) {
        val sanitized = rules.mapIndexed { index, rule ->
            sanitizeRule(rule).copy(position = index)
        }
        if (configName.isNullOrBlank()) {
            // 全局规则：只替换 configName 为 null 的规则
            dao.replaceGlobal(sanitized)
        } else {
            // 按排版保存：只处理绑定到当前排版的规则，不动全局规则
            val allRules = dao.getAll()
            // 旧的绑定到当前排版的规则（不含全局规则）
            val oldBound = allRules.filter {
                !it.configName.isNullOrBlank() && it.matchesConfig(configName)
            }
            val newIds = sanitized.map { it.id }.toSet()
            // 被移除的旧规则：从 configName 列表中去掉当前排版
            // 未绑定任何排版时删除，避免留下无法在管理界面看到的规则
            for (old in oldBound) {
                if (old.id !in newIds) {
                    val remaining =
                        old.configName.orEmpty().configNames().filter { it != configName }
                    if (remaining.isEmpty()) {
                        dao.delete(old)
                    } else {
                        dao.update(old.copy(configName = remaining.toJsonArray()))
                    }
                }
            }
            // 插入所有规则（全局规则也一起，否则会被 replaceGlobal 删掉）
            dao.insertAll(sanitized)
        }
        cleanupUnusedBgImages()
    }

    fun delete(rule: HighlightRule) {
        dao.delete(rule)
        cleanupUnusedBgImages()
    }

    fun removeConfigBinding(configName: String) {
        if (configName.isBlank()) return
        dao.getAll().forEach { rule ->
            val names = rule.configName.orEmpty().configNames()
            if (configName in names) {
                val remaining = names.filter { it != configName }
                val updatedConfigName = remaining.takeIf { it.isNotEmpty() }?.toJsonArray()
                dao.update(rule.copy(configName = updatedConfigName))
            }
        }
    }

    fun reset(configName: String): List<HighlightRule> {
        val defaults = createDefaultRules()
        val rules = if (configName.isBlank()) {
            defaults
        } else {
            defaults.map {
                it.copyWithNewId().copy(configName = listOf(configName).toJsonArray())
            }
        }
        if (configName.isBlank()) {
            dao.replaceGlobal(rules)
        } else {
            saveForConfig(rules, configName)
        }
        return rules
    }

    fun createBackupData(configName: String): BackupData {
        return BackupData(
            rules = load(configName),
            dialogEnabled = context.getPrefBoolean(PreferKey.highlightRuleDialog, true),
            bookTitleEnabled = context.getPrefBoolean(PreferKey.highlightRuleBookTitle, true),
            bracketNoteEnabled = context.getPrefBoolean(PreferKey.highlightRuleBracketNote, true),
        )
    }

    fun restoreBackupData(backupData: BackupData, backupRootPath: String? = null) {
        val rules = backupData.rules.map { rule ->
            val safeRule = sanitizeRule(rule)
            val restoredBgImage = restoreRuleBgImage(backupRootPath, safeRule.bgImage)
            safeRule.copy(bgImage = restoredBgImage)
        }
        // 备份恢复是全量替换
        dao.replaceAll(rules)
        cleanupUnusedBgImages()
        context.putPrefBoolean(PreferKey.highlightRuleDialog, backupData.dialogEnabled)
        context.putPrefBoolean(PreferKey.highlightRuleBookTitle, backupData.bookTitleEnabled)
        context.putPrefBoolean(PreferKey.highlightRuleBracketNote, backupData.bracketNoteEnabled)
    }

    fun sanitizeRule(rule: HighlightRule): HighlightRule {
        val name = runCatching { rule.name }.getOrNull().orEmpty()
        val pattern = runCatching { rule.pattern }.getOrNull().orEmpty()
        val sampleText = runCatching { rule.sampleText }.getOrNull().orEmpty()
        val id = runCatching { rule.id }.getOrNull().orEmpty().ifBlank {
            "${System.currentTimeMillis()}_${
                listOf(name, pattern).joinToString("|").hashCode().toUInt().toString(16)
            }"
        }
        return HighlightRule(
            id = id,
            name = name,
            pattern = pattern,
            sampleText = sampleText,
            targetScope = normalizeTargetScope(
                runCatching { rule.targetScope }.getOrDefault(
                    HighlightRule.TARGET_ALL
                )
            ),
            enabled = runCatching { rule.enabled }.getOrDefault(true),
            position = runCatching { rule.position }.getOrDefault(0),
            textColor = runCatching { rule.textColor }.getOrNull(),
            bgColor = runCatching { rule.bgColor }.getOrNull(),
            underlineMode = runCatching { rule.underlineMode }.getOrDefault(0).coerceIn(0, 5),
            underlineColor = runCatching { rule.underlineColor }.getOrNull(),
            underlineWidth = runCatching { rule.underlineWidth }.getOrDefault(1f)
                .coerceIn(0.1f, 10f),
            underlineOffset = runCatching { rule.underlineOffset }.getOrDefault(2f)
                .coerceIn(0f, 20f),
            underlineSvgPath = runCatching { rule.underlineSvgPath }.getOrNull(),
            bgImage = runCatching { rule.bgImage }.getOrNull()?.takeIf { it.isNotBlank() },
            bgImageFit = runCatching { rule.bgImageFit }.getOrDefault(0).coerceIn(0, 2),
            bgImageScale = runCatching { rule.bgImageScale }.getOrDefault(1f).coerceIn(0.1f, 5f),
            configName = runCatching { rule.configName }.getOrNull()?.takeIf { it.isNotBlank() },
            fontPath = runCatching { rule.fontPath }.getOrNull()?.takeIf { it.isNotBlank() },
        )
    }

    private fun normalizeTargetScope(value: Int, fallback: Int = HighlightRule.TARGET_ALL): Int {
        return when (value) {
            HighlightRule.TARGET_ALL,
            HighlightRule.TARGET_TITLE,
            HighlightRule.TARGET_BODY -> value

            else -> fallback
        }
    }

    fun createDefaultRules(): List<HighlightRule> {
        val ctx = context
        return listOf(
            HighlightRule(
                id = "dialog_default",
                name = "làm nổi bật đoạn hội thoại",
                pattern = "“[^\\u201d\\n]{1,120}\\u201d|\"[^\"\\n]{1,120}\"|「[^」\\n]{1,120}」|『[^』\\n]{1,120}』",
                sampleText = "Cô nhẹ nhàng nói: “Tối nay chúng ta xuất phát nhé.”",
                position = 0,
                enabled = ctx.getPrefBoolean(PreferKey.highlightRuleDialog, true),
                textColor = 0xFFFF8C00.toInt()
            ),
            HighlightRule(
                id = "book_title_default",
                name = "Số tên sách được đánh dấu",
                pattern = "《[^》\\n]{1,80}》",
                sampleText = "Gần đây tôi đã đọc lại Trăm Năm Cô Đơn và tốc độ vẫn rất ổn định.",
                position = 1,
                enabled = ctx.getPrefBoolean(PreferKey.highlightRuleBookTitle, true),
                underlineMode = 3,
                underlineWidth = 0.5f,
                underlineColor = 0xFF63C37D.toInt()
            ),
            HighlightRule(
                id = "bracket_note_default",
                name = "Làm nổi bật chú thích trong khung",
                pattern = "（[^（）\\n]{1,80}）|\\([^()\\n]{1,80}\\)|【[^】\\n]{1,80}】|\\[[^\\]\\n]{1,80}]",
                sampleText = "Anh ấy dừng lại một lúc (như thể chợt nhớ ra điều gì đó).",
                position = 2,
                enabled = ctx.getPrefBoolean(PreferKey.highlightRuleBracketNote, true),
                textColor = 0xFF8F959E.toInt(),
                underlineMode = 2,
                underlineWidth = 0.5f,
                underlineColor = 0xFF5A8DEE.toInt()
            ),
            HighlightRule(
                id = "title_emphasis_default",
                name = "Nhấn mạnh tiêu đề",
                pattern = "(?m)^\\s{0,2}(?:[0-9 Zero Zero One Two Two Three Four Five Six Seven Eight Nine Hundred Million IVXLCDMivxlcdm]{1,12}[Chapter Volume Episode Episode]|Prologue|Wedge|Introduction|Chương cuối|Phần kết|Phần tái bút|Thêm)[^\\n]{0,40}$",
                sampleText = "Chương 1 Vị khách trong đêm mưa",
                targetScope = HighlightRule.TARGET_TITLE,
                position = 3,
                enabled = true,
                textColor = 0xFF333333.toInt(),
                underlineMode = 4,
                underlineColor = 0xFF7C5634.toInt()
            ),
            HighlightRule(
                id = "thought_default",
                name = "hoạt động tinh thần",
                pattern = "([^)\\n]{0,40}(?:Suy nghĩ|Con đường bí mật|Con tim|Suy nghĩ|Suy nghĩ|Suy ngẫm|Mutting)[^)\\n]{0,40})",
                sampleText = "Tim cô thắt lại (cô thầm nghĩ có gì đó không ổn, chắc chắn có gì đó không ổn ở đây).",
                position = 4,
                enabled = false,
                textColor = 0xFF9370DB.toInt(),
                underlineMode = 1,
                underlineWidth = 0.5f,
                underlineColor = 0xFF9370DB.toInt()
            ),
            HighlightRule(
                id = "narrator_default",
                name = "Người kể chuyện",
                pattern = "(?: Còn tiếp | Còn tiếp | Được liệt kê bên dưới | Nhấn: ? | Lưu ý: ?)[^\\n]{0,40}| ((?: Lưu ý | Tường thuật | Tác giả có điều muốn nói)[::][^)\\n]{0,40})",
                sampleText = "(Lưu ý: Dòng thời gian ở đây được đồng bộ với bài viết trước)",
                position = 5,
                enabled = false,
                textColor = 0xFF708090.toInt()
            ),
            HighlightRule(
                id = "emphasis_default",
                name = "sự nhấn mạnh",
                pattern = "(?:\\*\\*|__)[^\\n*_]{1,40}(?:\\*\\*|__)|(?:!!!|！？|\\?!)[^\\n]{0,20}",
                sampleText = "**Đây là nội dung quan trọng** và cần đặc biệt chú ý.",
                position = 6,
                enabled = false,
                textColor = 0xFFDC143C.toInt(),
                underlineMode = 1,
                underlineColor = 0xFFDC143C.toInt()
            ),
            HighlightRule(
                id = "poetry_default",
                name = "trích dẫn thơ",
                pattern = "(?m)^[\\p{IsHan}，。！？；：、]{5,24}$",
                sampleText = "Ánh trăng soi sáng trước giường,\nNghi ngờ có sương giá trên mặt đất.",
                position = 7,
                enabled = false,
                textColor = 0xFF2F4F4F.toInt(),
                underlineMode = 3,
                underlineWidth = 0.5f,
                underlineColor = 0xFF2F4F4F.toInt()
            ),
            HighlightRule(
                id = "ellipsis_default",
                name = "bỏ qua việc tạm dừng",
                pattern = "…{2,}|\\.{3,}|—{2,}|-{3,}",
                sampleText = "Anh ấy im lặng một lúc lâu…và cuối cùng gật đầu.",
                position = 8,
                enabled = false,
                textColor = 0xFF8B8B8B.toInt()
            ),
            HighlightRule(
                id = "number_default",
                name = "Số tiền",
                pattern = "(?:¥|￥)?\\d+(?:\\.\\d+)?(?:Yuan|Khối|Mười nghìn|Nghìn|Trăm|Tỷ|%|%)|[không một hai hai ba bốn năm sáu bảy tám Chín trăm triệu tỷ]+(?:Yuan|Khối|Mười nghìn|Nghìn|Trăm|Tỷ)",
                sampleText = "Giá ban đầu là 100 tệ, nhưng bây giờ chỉ còn 50 tệ.",
                position = 9,
                enabled = false,
                textColor = 0xFF4169E1.toInt()
            ),
            HighlightRule(
                id = "english_default",
                name = "từ tiếng anh",
                pattern = "\\b[A-Za-z]{2,}[A-Za-z0-9'-]*\\b",
                sampleText = "Xin chào thế giới, xin chào thế giới.",
                position = 10,
                enabled = false,
                textColor = 0xFF4169E1.toInt()
            ),
            HighlightRule(
                id = "date_time_default",
                name = "ngày giờ",
                pattern = "(?:\\d{2,4}|[0012234567890]{2,4}) năm (?:\\d{1,2}|[正一二三四五六七八九十]) tháng (?:\\d{1,2}|[ Một, hai, ba, bốn, năm, sáu, bảy, tám, chín, hai mươi ba])?[Số ngày]?|\\b\\d{1,2}:\\d{2}\\b|(?:[0-1]?\\d|2[0-3]) điểm (?:[0-5]?\\dphút?)?",
                sampleText = "Khởi hành lúc 10h30 ngày 12/8/2024.",
                position = 11,
                enabled = false,
                textColor = 0xFF20B2AA.toInt()
            )
        )
    }

    private fun cleanupUnusedBgImages() {
        val allRules = dao.getAll()
        val usedPaths = allRules.mapNotNull { it.bgImage }
            .filter { it.isNotBlank() && !it.startsWith("assets://") }
            .toSet()
        val dir = File(context.filesDir, "bg_images")
        if (!dir.exists()) return
        dir.listFiles()?.forEach { file ->
            if (file.absolutePath !in usedPaths) {
                runCatching { file.delete() }
            }
        }
    }

    private fun restoreRuleBgImage(backupRootPath: String?, bgImage: String?): String? {
        val path = bgImage ?: return null
        if (path.isBlank() || path.startsWith("assets://")) return path
        val rootPath = backupRootPath ?: return path
        val backupFile = File(rootPath, "highlightRuleBg${File.separator}${File(path).name}")
            .takeIf { it.exists() && it.isFile }
            ?: return path
        val dir = File(context.filesDir, "bg_images")
        if (!dir.exists()) dir.mkdirs()
        val targetFile = File(dir, backupFile.name)
        if (!targetFile.exists() || targetFile.length() != backupFile.length()) {
            backupFile.copyTo(targetFile, overwrite = true)
        }
        return targetFile.absolutePath
    }

    // region configName helpers

    /**
     * 判断规则是否适用于指定排版。
     * configName 为 null 表示全局规则（适用于所有排版）。
     * configName 为 JSON 数组字符串，如 '["日间","夜间"]'。
     */
    private fun HighlightRule.matchesConfig(configName: String): Boolean {
        val cn = this.configName
        if (cn.isNullOrBlank()) return true // 全局规则
        return cn.configNames().contains(configName)
    }

    /**
     * 解析 configName JSON 数组为列表。
     */
    // endregion
}

fun String.configNames(): List<String> {
    return runCatching {
        GSON.fromJsonArray<String>(this).getOrNull() ?: emptyList()
    }.getOrElse { emptyList() }
}

fun List<String>.toJsonArray(): String {
    return GSON.toJson(this)
}
