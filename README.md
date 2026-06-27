# 📱 Novela - Trình Đọc Sách Tùy Biến (Material 3)

Novela là dự án trình đọc sách hiệu năng cao trên hệ điều hành Android, được phát triển dựa trên việc kế thừa và tùy biến từ dự án mã nguồn mở **Legado with MD3**. Phiên bản này được tối ưu hóa giao diện Material Design 3, tích hợp dịch thuật tiếng Việt, bản dịch quy tắc sử dụng và hệ thống cập nhật bảo mật nội bộ.

---

## 🚀 Tính Năng Chính

* **Thiết kế Material Design 3**: Trải nghiệm giao diện hiện đại, tối giản và mượt mà.
* **Đa nguồn đọc tự định nghĩa**: Tương thích hoàn toàn với các tệp cấu hình nguồn sách (Book Source) dạng JSON của Legado và VBook.
* **Tối ưu hóa hiển thị**: Tự do điều chỉnh phông chữ ngoài, cỡ chữ, khoảng cách dòng, lề và hiệu ứng lật trang.
* **Chế độ đọc đa dạng**: Hỗ trợ Chế độ Tối (Dark Mode) tự động và chế độ E-Ink chuyên dụng cho các thiết bị màn hình giấy điện tử.
* **Lưu trữ cục bộ**: Sao lưu dữ liệu tủ sách, nguồn sách tự động hoặc thủ công ra bộ nhớ cục bộ thiết bị.
* **Tự động cập nhật nội bộ**: Tích hợp kiểm tra phiên bản mới từ máy chủ lưu trữ bản phát hành công khai khi mở ứng dụng.

---

## 🛠️ Các Điểm Tùy Biến Trọng Tâm

Nhằm phục vụ nhu cầu cá nhân hóa và bảo mật dự án, các thành phần sau đã được sửa đổi so với bản gốc:
1. **Rebranding thương hiệu**: Toàn bộ nhãn hiển thị và tên ứng dụng đã được thay đổi từ *Legado* sang **Novela**.
2. **Bảo mật mã nguồn gốc**: Loại bỏ các nút liên kết trực tiếp tới Repository GitHub trên giao diện Giới thiệu (About Screen) để ẩn hoàn toàn thông tin dự án Private.
3. **Dịch thuật tài liệu**: Chuyển đổi toàn bộ nội dung hướng dẫn lưu trữ, chính sách bảo mật và điều khoản miễn trừ trách nhiệm sang Tiếng Việt.
4. **Phân tách cơ chế cập nhật**: Ứng dụng kiểm tra và tải file APK tự động từ kho lưu trữ phát hành công khai riêng biệt (`Novela-Releases`).

---

## 💻 Hướng Dẫn Phát Triển & Biên Dịch (Build)

### Yêu cầu hệ thống:
* **Java Development Kit (JDK)**: Phiên bản 21 trở lên.
* **Android SDK**: Phiên bản 37.

### Các lệnh biên dịch Gradle:
* **Biên dịch bản Debug (Dùng thử & Gỡ lỗi)**:
  ```bash
  ./gradlew assembleAppDebug
  ```
  *Đầu ra file APK:* `app/build/outputs/apk/app/debug/Novela-arm64-v8a-debug.apk`

* **Biên dịch bản Release (Bản phát hành tối ưu)**:
  ```bash
  ./gradlew assembleAppRelease
  ```
  *Đầu ra file APK:* `app/build/outputs/apk/app/release/app-app-arm64-v8a-release.apk`
