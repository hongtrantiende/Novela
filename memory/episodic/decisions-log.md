# Architecture Decisions Log (ADR)

Nhật ký ghi nhận các quyết định kiến trúc quan trọng của dự án Novela.

---

## 1. Lựa chọn Jetpack Compose và MVI làm UI Standard
- **Quyết định**: Di chuyển dần các màn hình từ XML/View truyền thống sang Jetpack Compose. Sử dụng mô hình MVI (Model-View-Intent) kết hợp với UDF (Unidirectional Data Flow) làm kiến trúc giao diện chuẩn.
- **Lý do**:
  - Tăng tốc độ phát triển và tái sử dụng thành phần giao diện.
  - Phù hợp với xu thế phát triển giao diện Android hiện đại.
  - Kiểm soát trạng thái giao diện tốt hơn thông qua UDF, giảm thiểu các bug về state không đồng bộ.

## 2. Sử dụng Jetpack Navigation 3 làm Cơ Chế Điều Hướng
- **Quyết định**: Áp dụng `androidx.navigation3` thay thế cho các thư viện điều hướng cũ hoặc chuyển Activity/Fragment thủ công.
- **Lý do**:
  - Hỗ trợ định tuyến an toàn kiểu dữ liệu (type-safe) thông qua `@Serializable` sealed interfaces.
  - Tích hợp mượt mà với Jetpack Compose.

## 3. Lựa chọn Koin làm Framework Dependency Injection
- **Quyết định**: Sử dụng Koin làm giải pháp DI chính của dự án.
- **Lý do**:
  - Cấu hình đơn giản, gọn nhẹ bằng DSL Kotlin thuần túy.
  - Thời gian build nhanh hơn so với Dagger/Hilt do không dựa quá nhiều vào sinh code (annotation processing).
  - Tích hợp rất tốt với Compose và ViewModel.
