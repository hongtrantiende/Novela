# Project Rules & Coding Standards

Tài liệu hướng dẫn quy chuẩn lập trình chi tiết cho dự án Novela (Legado Fork).

---

## 1. ARCHITECTURE & DI
- **Architecture**: Clean Architecture với các lớp `data/`, `domain/`, `ui/`, `help/`, `model/`, `service/`, `web/`.
- **Dependency Injection**: Sử dụng Koin để khởi tạo và tiêm phụ thuộc.
  - Đăng ký ViewModel qua `viewModelOf(::XxxViewModel)` hoặc `viewModel { XxxViewModel(...) }`
  - Đăng ký các Repository/Gateway: `single<LocalBookGateway> { LocalBookRepository(get()) }`
- **Navigation**: Jetpack Navigation 3 sử dụng các route được định nghĩa bằng `@Serializable` sealed interfaces.

## 2. JETPACK COMPOSE REQUIREMENTS
- **MVI (Model-View-Intent) & UDF (Unidirectional Data Flow)**:
  - Phải tách biệt rõ ràng giữa `Contract` (`UiState`, `Intent`, `Effect`), `ViewModel`, và `Screen Composable` (stateless).
- **Stability**: Sử dụng `@Stable` hoặc `@Immutable` cho các lớp dữ liệu UI. Luôn sử dụng `ImmutableList` (từ `kotlinx.collections.immutable`) thay cho `List` trong `UiState`.
- **Component Reusability**: Chỉ dùng các component chuẩn được thiết kế trong `ui/widget/components/` (như `AppScaffold`, `AppText`, `AppIcon`, `AppAlertDialog`, `AppModalBottomSheet`, `GlassMediumFlexibleTopAppBar`, `TopBarNavigationButton`). Xem chi tiết tại [DESIGN_SYSTEM.md](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/DESIGN_SYSTEM.md).
- **Edge-to-edge Layout**: Sử dụng insets phù hợp thông qua `WindowInsets.safeDrawing` để tránh chồng lấp với thanh trạng thái và thanh điều hướng hệ thống.

## 3. UI/UX CONSISTENCY RULES
- **Loading Overlay**: Sử dụng background `Color(0xFF121212)` + `AppContainedLoadingIndicator()` + text trắng khi hiển thị trạng thái tải toàn màn hình.
- **One-directional Loading**: Khi dữ liệu đã load xong và hiển thị nội dung, không cho phép overlay loading hiển thị đè lại (sử dụng cờ trạng thái như `hasShownContent`).
- **Smooth Transitions**: Sử dụng `Modifier.graphicsLayer { alpha = ... }` cho hiệu ứng chuyển động mượt mà.

## 4. KOTLIN BEST PRACTICES
- **SRP (Single Responsibility Principle)**: Mỗi function, class chỉ làm duy nhất một việc.
- **Clean Naming**:
  - Biến Boolean bắt đầu với `is/has/can/should`.
  - Tên hàm bắt đầu với động từ.
  - Biến dạng mảng/danh sách dùng số nhiều.
  - Hằng số dùng `UPPER_SNAKE_CASE`.
- **Guard Clauses**: Luôn kiểm tra điều kiện lỗi và thoát sớm bằng `return` hoặc `throw` ở đầu hàm.
- **Constants**: Tuyệt đối không hardcode magic numbers hoặc magic strings. Khai báo chúng dưới dạng hằng số ở đầu file hoặc trong một object chuyên dụng.
