# AGENTS.md

Hướng dẫn tổng hợp cho AI agents (Antigravity, Codex, Claude) khi làm việc với repository Legado (Novela fork).

---

## 1. AGENT WORKFLOW & COMMUNICATION

### Quy trình làm việc chuẩn
- **Phase 0 - Tiếp nhận**: Đọc yêu cầu 2 lần. Xác định rõ Input / Output / Constraints / Unknowns. Nếu không rõ thì hỏi.
- **Phase 1 - Lập kế hoạch**: Chia nhỏ task, ưu tiên blocking dependencies, trình plan cho user duyệt.
- **Phase 2 - Thực thi**: Làm tuần tự, đánh dấu progress. Readable > Clever, xử lý edge cases.
- **Phase 3 - Debug**: Framework 5 câu hỏi: WHAT → WHERE → WHEN → WHY → FIX (sửa gốc rễ, không patch triệu chứng).
- **Phase 4 - Xác minh**: Build/compile, test edge cases, báo cáo rõ ràng.

### Giao tiếp
- Ngắn gọn khi yêu cầu rõ. Gom câu hỏi lại hỏi 1 lần nếu chưa rõ.
- Dừng ngay nếu cách tiếp cận sai, đề xuất phương án thay thế kèm trade-off.
- Báo cáo: Đã làm gì / Files thay đổi / Cách test / Lưu ý.

---

## 2. CODING STANDARDS

- **Readable > Clever**: Code viết cho người đọc tiếp theo.
- **Clean Naming**: Boolean→`is/has/can/should`, Function→verb, Array→plural, Constant→`UPPER_SNAKE_CASE`.
- **SRP**: Mỗi function/class làm đúng 1 việc.
- **Guard Clauses**: Kiểm tra lỗi và return sớm ở đầu hàm.
- **Constants**: Dùng hằng số thay magic numbers/strings.
- **Surgical Changes**: Không sửa code lân cận không liên quan. Match style hiện có. Xóa import/var do edit của mình gây unused, không xóa dead code có sẵn.

---

## 3. BUILD / TEST / DEPLOY (Windows PowerShell)

> **QUAN TRỌNG**: Hệ điều hành Windows, Shell PowerShell. Luôn dùng `.\gradlew.bat` thay cho `./gradlew`.
> - **KSP Multi-drive Bug**: Do dự án nằm ở ổ `C:` nhưng `GRADLE_USER_HOME` mặc định của hệ thống trỏ về ổ `D:`, KSP sẽ lỗi biên dịch (`different roots`). **BẮT BUỘC** chạy lệnh `$env:GRADLE_USER_HOME="$env:USERPROFILE\.gradle"` trước khi thực hiện các lệnh Gradle dưới đây.

### Build Commands
```powershell
# Quick compile check (Kotlin only — nhanh nhất, chỉ kiểm tra code compile)
.\gradlew.bat :app:compileAppDebugKotlin

# Build debug APK (tạo file APK để cài test)
.\gradlew.bat assembleAppDebug

# Build release APK (có R8 minify/shrink)
.\gradlew.bat assembleAppRelease

# Run unit tests
.\gradlew.bat test

# Run single test class
.\gradlew.bat test --tests "io.legado.app.model.cache.CacheDownloadQueueTest"

# Lint
.\gradlew.bat lint
```

### APK Output Paths
```
# Debug APKs — Flavor "app", ABI splits:
app/build/outputs/apk/app/debug/Novela-arm64-v8a-debug.apk      ← Dùng file này cho điện thoại
app/build/outputs/apk/app/debug/Novela-armeabi-v7a-debug.apk
app/build/outputs/apk/app/debug/Novela-universal-debug.apk

# Release APKs:
app/build/outputs/apk/app/release/Novela-arm64-v8a-release.apk
```

### Deploy to Device (ADB)
```powershell
# Kiểm tra thiết bị kết nối
& "$env:LOCALAPPDATA\Android\Sdk\platform-tools\adb.exe" devices -l

# Cài debug APK vào điện thoại (Redmi Note 13 Pro+, device ID: PNAUU475TOYPLV7H)
& "$env:LOCALAPPDATA\Android\Sdk\platform-tools\adb.exe" -s PNAUU475TOYPLV7H install -r -d "app/build/outputs/apk/app/debug/Novela-arm64-v8a-debug.apk"
```


### Gradle Tips
- Lọc output dài: thêm `2>&1 | Select-Object -Last 15` cuối lệnh.
- Configuration cache đã bật sẵn → build lần 2+ nhanh hơn nhiều.
- Chỉ chạy compile check khi sửa code nhỏ, assembleAppDebug khi cần test trên máy.

### Environment
- **JDK**: 21 (local dev), 17 (CI)
- **SDK**: Compile 37, Target 37, Min 26
- **Gradle Heap**: 8 GB
- **APK Splits**: `armeabi-v7a`, `arm64-v8a`, universal
- **App Name**: Novela (APK filename), nhưng `applicationId = "io.legato.kazusa"`, `namespace = "io.legado.app"`
- **Debug suffix**: `.debug` (applicationId = `io.legato.kazusa.debug`)

### Pinned Dependencies — KHÔNG CẬP NHẬT
- **Jsoup**: Giữ ≤ `1.16.2` (phiên bản mới phá vỡ `AnalyzeByJSoup` và JsoupXpath)
- **Hutool**: Giữ ≤ `5.8.22` (pinned trong `libs.versions.toml`)

---

## 4. ARCHITECTURE & DI

### Clean Architecture
```
app/src/main/java/io/legado/app/
├── data/        # Room DB (v85, ~22 DAOs, ~25 entities), repository implementations
├── domain/      # Gateway interfaces, use cases (14), domain models (no framework deps)
├── ui/          # Compose screens, Navigation 3 routes, ViewModels
├── help/        # HTTP (OkHttp+Cronet), book processing, backup/WebDAV, JS engine, config
├── model/       # Runtime state: ReadBook, AudioPlay, CacheBook, BookCover
├── service/     # Foreground/background services
├── web/         # Embedded HTTP server (Ktor)
├── lib/         # Third-party wrappers (MOBI, WebDAV, cronet)
├── base/        # Abstract Activity/Fragment/ViewModel base classes
└── utils/       # Extension functions (~70 files)
```

### Modules
- `:app` — Main Android app
- `:modules:book` — EPUB/TXT parsing (namespace `me.ag2s`)
- `:modules:rhino` — Rhino JS wrapper (namespace `com.script`)
- `modules/web/` — Vue 3 + TypeScript + Vite web frontend (pnpm, tách biệt Android build)

### Dependency Injection (Koin)
- 2 modules: `appDatabaseModule` (DB + 22 DAOs) + `appModule` (repos, use cases, ViewModels)
- Register ViewModel: `viewModelOf(::XxxViewModel)` hoặc `viewModel { XxxViewModel(...) }`
- Bind gateway → repo: `single<LocalBookGateway> { LocalBookRepository(get()) }`

### Navigation
- **Jetpack Navigation 3** (`androidx.navigation3`) với `@Serializable` sealed interfaces
- `MainActivity` → `NavDisplay` + `entryProvider { ... }` chứa tất cả route
- Routes: `MainRoute` sealed interface trong `MainNavKey.kt`
- **Screens KHÔNG truy cập navigator trực tiếp** — nhận `onBack`, `onNavigateToXxx` lambdas

---

## 5. JETPACK COMPOSE REQUIREMENTS

### MVI/UDF Architecture
```
ui/{feature}/
├── XxxContract.kt      // UiState, Intent, Effect (Sheet/Dialog)
├── XxxViewModel.kt     // ViewModel
├── XxxScreen.kt        // Stateless screen composable
└── XxxRouteScreen.kt   // Outer wrapper (optional)
```

### Contract
```kotlin
@Stable
data class XxxUiState(
    val loading: Boolean = false,
    val items: ImmutableList<ItemUi> = persistentListOf(),
    val activeSheet: XxxSheet? = null,
    val activeDialog: XxxDialog? = null,
)

sealed interface XxxIntent { ... }
sealed interface XxxEffect { ... }
```

### ViewModel
- Kế thừa `ViewModel()` trực tiếp (KHÔNG dùng `BaseViewModel`)
- `_uiState`: `MutableStateFlow`, expose `.asStateFlow()`
- `_effects`: `MutableSharedFlow(extraBufferCapacity = 16)`, expose `.asSharedFlow()`
- Entry point duy nhất: `onIntent()`

### Screen Composable
- **Stateless**: Nhận `state`, `onIntent`, `effects`
- Collect state: `collectAsStateWithLifecycle()` ở route/entry
- Collect effects: `LaunchedEffect(Unit) { effects.collectLatest { ... } }`
- **@Stable** trên tất cả UiState, UI model. `ImmutableList` thay `List`.
- Dùng widget dự án: `AppScaffold`, `AppText`, `AppIcon`, `AppAlertDialog`, `AppModalBottomSheet`, `GlassMediumFlexibleTopAppBar`, `TopBarNavigationButton`

### Theme & Layout
- Dual theme: Material 3 Expressive (default) + Miuix
- Branch: `ThemeResolver.isMiuixEngine(LegadoTheme.composeEngine)`
- **Edge-to-Edge**: `Scaffold` insets hoặc `WindowInsets.safeDrawing` padding
- **Predictive Back**: `BackHandler` cho confirmation states

---

## 6. UI/UX CONSISTENCY RULES — BẮT BUỘC

> Tất cả loading state, transitions, và theme PHẢI đồng bộ qua toàn bộ ứng dụng.

### Loading & Transition Standards
- **Loading overlay chung**: Nền `Color(0xFF121212)` + `AppContainedLoadingIndicator()` + text trắng
- **KHÔNG BAO GIỜ** để `MaterialTheme.colorScheme.background` hoặc theme sáng làm background cho loading states khi chuyển sang reader hoặc content screen
- **Transition rule**: Khi chuyển route, nếu cần loading thì background PHẢI tối đồng nhất, tránh flash nền sáng/vàng/trắng
- **One-directional loading**: Một khi content đã hiện thì loading overlay KHÔNG được hiện lại (dùng cờ `hasShownContent` pattern)
- **AndroidView z-order**: Native views trong `AndroidView` phải bắt đầu `visibility = View.INVISIBLE` trong `factory` block, chỉ `VISIBLE` khi dữ liệu sẵn sàng
- **Animation**: Dùng `Modifier.graphicsLayer { alpha = ... }` cho fade transitions, kết hợp với native view visibility

### Color Token Standards
- Loading background: `Color(0xFF121212)` — dark neutral
- Loading text: `Color.White.copy(alpha = 0.8f)` — semi-transparent white
- Loading indicator: `AppContainedLoadingIndicator()` — project standard widget
- Error states: Giữ nguyên `MaterialTheme.colorScheme.error`

### Reader-Specific
- `ReadBookRouteScreen` loading: Dark overlay + spinner + "Đang tải..." text
- `MainNavGraph` isVideoBook check: `Color(0xFF121212)` background (KHÔNG dùng MaterialTheme)
- Native `ReadView` (PageView): bắt đầu INVISIBLE, chỉ VISIBLE khi chapter loaded

---

## 7. BACKEND ENGINE CONSTRAINTS

### Rhino JavaScript Engine
- Book/RSS sources và HTTP TTS dùng JavaScript rules
- `initRhino()` trong `App.kt` đăng ký `NativeBaseSource` wrappers
- Rule parsing: `help/source/` và `model/analyzeRule/`

### Web Frontend
```bash
cd modules/web
pnpm install
pnpm dev       # dev server
pnpm build     # production build
```
- Set `VITE_API` trong `.env.development` thành IP web service của app

---

## 8. DEVICE INFO

| Field | Value |
|-------|-------|
| Device | Redmi Note 13 Pro+ (Xiaomi 2311DRK48C, codename duchamp) |
| ADB Serial | PNAUU475TOYPLV7H |
| Architecture | arm64-v8a |
| APK file | `Novela-arm64-v8a-debug.apk` |
| ADB path | `C:\Users\bac5a\AppData\Local\Android\Sdk\platform-tools\adb.exe` |
