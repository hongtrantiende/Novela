package io.legado.app.utils

import com.github.liuyueyi.quick.transfer.ChineseUtils
import com.github.liuyueyi.quick.transfer.constants.TransType

object ChineseUtils {

    private var fixed = false

    fun s2t(content: String): String {
        return ChineseUtils.s2t(content)
    }

    fun t2s(content: String): String {
        if (!fixed) {
            fixT2sDict()
        }
        return ChineseUtils.t2s(content)
    }

    fun preLoad(async: Boolean, vararg transType: TransType) {
        ChineseUtils.preLoad(async, *transType)
    }

    fun unLoad(vararg transType: TransType) {
        ChineseUtils.unLoad(*transType)
    }

    fun fixT2sDict() {
        fixed = true
        val excludeList = listOf(
            "Chảo",
            "chèo thuyền", "Reagan", "Sydney", "kem", "nướng", "phô mai", "Phô mai", "Shafen", "nguyên âm",
            "nhạc trung quốc", "nhạc dân gian", "Tĩnh Nguyên", "bánh xốp", "hình ảnh", "Minh Phúc", "thông thoáng", "Xinli", "phép ẩn dụ mới",
            "thay đổi", "thay đổi nhỏ", "Ngoại tuyến", "Đĩa", "mô-đun", "bi-a", "Bàn làm việc", "đầu máy xe lửa", "Huyết tương",
            "quả dứa", "Chúa tể của những chiếc nhẫn", "Trọng tải", "phim ảnh", "Tích hợp", "biến", "Giải mã", "mất tiền", "chèn nước",
            "nhà ở", "giá nhà", "bộ nhớ đệm", "Taxi", "Thành lập", "lịch trình", "Sidan", "bụi cây", "bụi cây",
            "Baha", "Vĩ mô", "Trường học ban đêm", "vectơ", "hình nửa", "Gabon", "In", "chức năng", "hình dạng đầy đủ",
            "đĩa", "giao diện", "phô mai", "đắm tàu", "Viêng Chăn", "sự tiến hóa", "bơ", "tương thích", "Đĩa",
            "phim ảnh", "quy tắc", "enzim", "Reagan", "hộp cơm trưa",
            "Louis", "không đồng bộ", "Taxi", "Jay Chou", "khoai tây", "khoai tây", "người máy", "xe gắn máy",
            "Thang cuốn", "card âm thanh", "tay đua kéo", "Bản đồ bit", "mục tiêu", "mục tiêu", "Volvo", "bộ chip",
            "người svalbard", "Hẻm chéo", "tàu chiến", "mì ăn liền", "Hitler", "tàu con thoi", "Tuvalu", "Djibouti",
            "Djibouti", "Stalin", "Nam Đại Dương", "mạng khu vực", "Botswana", "Nghị quyết", "Kuromi", "Kinshasa",
            "Thời đại Warcraft", "bungee", "tàu Titanic", "chiến binh không gian", "nữ hoàng ai cập", "Kiribati", "tiện ích bổ sung",
            "Kẻ hủy diệt", "tập tin văn bản thuần túy", "Giai điệu ảo thuật kỳ ảo", "liechtenstein"
        )
        ChineseUtils.loadExcludeDict(TransType.TRADITIONAL_TO_SIMPLE, excludeList)
    }

}
