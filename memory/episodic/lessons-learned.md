# Lessons Learned & Common Bugs

Nhật ký ghi nhận các bài học kinh nghiệm và lỗi thường gặp trong quá trình phát triển Novela.

---

## 1. KSP Multi-drive Compiling Bug
- **Hiện tượng**: Lỗi biên dịch `different roots` xảy ra trên hệ điều hành Windows khi dự án nằm ở ổ đĩa `C:` nhưng `GRADLE_USER_HOME` mặc định trỏ sang ổ đĩa khác (ví dụ: ổ `D:`).
- **Nguyên nhân**: KSP (Kotlin Symbol Processing) không thể phân giải đường dẫn giữa các ổ đĩa khác nhau khi tạo file trung gian.
- **Giải pháp**: Phải đặt biến môi trường trước khi chạy Gradle build:
  ```powershell
  $env:GRADLE_USER_HOME="$env:USERPROFILE\.gradle"
  ```

## 2. Dependency Pinning Constraints
- **Jsoup**: Giữ cố định phiên bản `Jsoup` ở mức `≤ 1.16.2`. Nâng cấp lên các bản cao hơn sẽ gây hỏng tính năng phân tích HTML của `AnalyzeByJSoup` và `JsoupXpath`.
- **Hutool**: Giữ cố định phiên bản `Hutool` ở mức `≤ 5.8.22` (được định nghĩa trong `libs.versions.toml`).

## 3. UI Transition Flash & Loading Z-Order
- **Hiện tượng**: Màn hình bị nhấp nháy (flash) nền sáng khi chuyển giữa các màn hình trong chế độ đọc sách (Reader).
- **Nguyên nhân**: Do background của loading overlay mặc định sử dụng màu nền hệ thống (`MaterialTheme.colorScheme.background`) thay vì màu tối đồng nhất.
- **Giải pháp**: Background của loading overlay bắt buộc phải là màu tối đồng nhất `Color(0xFF121212)`.
- **Native AndroidView Visibility**: Các thành phần giao diện gốc (Native Views) được lồng ghép thông qua `AndroidView` trong Compose phải bắt đầu với `visibility = View.INVISIBLE` tại block `factory` và chỉ đổi sang `VISIBLE` khi dữ liệu thực sự sẵn sàng.
