# AGENTS.md (Workspace Rules)

Hướng dẫn tổng hợp cho AI agents (Antigravity, Codex, Claude) khi làm việc với repository Legado (Novela fork).

---

## 0. MEMORY LOADING PROTOCOL

**BẮT BUỘC:** Khi bắt đầu mỗi conversation hoặc nhận yêu cầu mới, agent PHẢI tự động load theo thứ tự:

1. [AGENTS.md](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/AGENTS.md) — Master hub, identity, project overview
2. [.agents/behavior-rules.md](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/behavior-rules.md) — **BẮT BUỘC**: Behavioral rules (tone, formatting, skills manifest, memory protocol, code editing rules) — adapted từ Claude Fable 5. Áp dụng cho mọi agent (Antigravity, Claude, Cursor).
3. [rules.md](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/rules.md) — Coding standards và conventions cụ thể cho dự án
4. [lessons-learned.md](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/memory/episodic/lessons-learned.md) — Bài học kinh nghiệm, bugs đã gặp
5. [decisions-log.md](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/memory/episodic/decisions-log.md) — Log quyết định kiến trúc
6. [architecture-map.md](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/memory/semantic/architecture-map.md) — Bản đồ kiến trúc nhanh
7. [.agents/skills/](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/) — Tất cả skills (đọc `SKILL.md` khi cần — trigger descriptions có trong `behavior-rules.md`)

**KHÔNG BAO GIỜ** hỏi "Tôi có nên đọc không?" — Hãy tự động load. `.agents/behavior-rules.md` là mandatory cho MỌI session.

---

## 1. AGENT WORKFLOW & COMMUNICATION

### Mô hình 3 Agents Chuẩn (Triad Architecture)
> **MÔ HÌNH BẮT BUỘC CHO CHAT AGY**: Chat AGY (AI 1) đóng vai trò Trưởng nhóm (Planner Agent), tự động hóa việc phân tích và điều phối 2 Subagent ngầm (AI 2: Worker & AI 3: Reviewer/QA).

- **Bước 1 - Tiếp nhận & Lập kế hoạch (AI 1: Lead / Planner Agent)**:
  - Tiếp nhận lệnh từ người dùng, làm rõ yêu cầu (`interview-me`), kiểm tra mã nguồn và lập kế hoạch thực thi chi tiết (`planning-and-task-breakdown`).
- **Bước 2 - Giao việc cho Worker Subagent (AI 2: Senior Developer)**:
  - Khởi tạo AI 2 ngầm (`invoke_subagent`, Role: `Senior Developer`) để sửa code, viết hàm, refactor theo kế hoạch (`safe-edit`, `code-simplification`).
- **Bước 3 - Kiểm tra đối kháng & Đề phòng lỗi (AI 3: Reviewer & QA Subagent)**:
  - Khởi tạo AI 3 ngầm (`invoke_subagent`, Role: `QA & Reviewer`) để kiểm tra đối kháng (`doubt-driven-development` & `code-review-and-quality`).
  - **Cơ chế Đề phòng (Failsafe Check)**: AI 3 soi kỹ git diff của AI 2 xem có **xóa nhầm code lân cận**, **viết thiếu trường hợp/edge case**, hay **gây lỗi tiềm ẩn** hay không.
  - **Vòng lặp Phản hồi (Feedback Loop)**: Nếu AI 3 phát hiện bất kỳ lỗi/xóa nhầm nào, AI 3 sẽ báo cáo lại ngay cho AI 1 (Trưởng nhóm). AI 1 sẽ nhắc nhở và giao lại yêu cầu sửa bổ sung cho AI 2 khắc phục tới khi đạt 100% PASS.
  - Chạy lệnh biên dịch (`.\gradlew.bat :app:compileAppDebugKotlin` / `assembleAppDebug`) và cài đặt APK qua ADB vào thiết bị.
- **Bước 4 - Tổng hợp & Báo cáo (AI 1: Lead Agent)**:
  - Trưởng nhóm tổng hợp kết quả thực thi hoàn chỉnh từ các Subagent và báo cáo kết quả cho người dùng.

### Giao tiếp
- Ngắn gọn khi yêu cầu rõ. Gom câu hỏi lại hỏi 1 lần nếu chưa rõ.
- Dừng ngay nếu cách tiếp cận sai, đề xuất phương án thay thế kèm trade-off.
- Báo cáo: Đã làm gì / Files thay đổi / Cách test / Lưu ý.




---

## 2. CODING STANDARDS

- **Understand Principles & Rationale First (BẮT BUỘC)**: Trước khi viết hoặc sửa code, AI **BẮT BUỘC** phải đọc kỹ để hiểu rõ nguyên lý hoạt động của mã nguồn hiện tại, phân tích lý do **tại sao nên sửa như thế này** và **tại sao viết theo cách này** là giải pháp tối ưu nhất (về hiệu năng, kiến trúc Clean Architecture, độ an toàn coroutine). Tuyệt đối không sửa mù quáng hay sửa triệu chứng bề ngoài.
- **Readable > Clever**: Code viết cho người đọc tiếp theo.
- **Clean Naming**: Boolean→`is/has/can/should`, Function→verb, Array→plural, Constant→`UPPER_SNAKE_CASE`.
- **SRP**: Mỗi function/class làm đúng 1 việc.
- **Guard Clauses**: Kiểm tra lỗi và return sớm ở đầu hàm.
- **Constants**: Dùng hằng số thay magic numbers/strings.
- **Surgical Changes**: Không sửa code lân cận không liên quan. Match style hiện có. Xóa import/var do edit của mình gây unused, không xóa dead code có sẵn.
- **Design System**: Khi tạo hoặc sửa bất kỳ giao diện nào, **BẮT BUỘC** đọc và tuân thủ [DESIGN_SYSTEM.md](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/DESIGN_SYSTEM.md). Không được tự sáng tạo style, màu sắc, component mới. Chỉ dùng component có sẵn trong `ui/widget/components/`.


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

---

## 9. AVAILABLE AGENT SKILLS

Workspace đã tích hợp đầy đủ các kỹ năng tùy biến cho Agent (tự động nạp từ `.agents/skills/`). Khi thực hiện các tác vụ tương ứng, Agent **BẮT BUỘC** đọc file `SKILL.md` của kỹ năng đó trước:

* **Xác định & Thiết kế (Define & Design)**:
  - [interview-me](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/interview-me/SKILL.md) — Phỏng vấn làm rõ yêu cầu 1 câu hỏi/lần.
  - [idea-refine](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/idea-refine/SKILL.md) — Tinh chỉnh ý tưởng thô thành kế hoạch khả thi.
  - [spec-driven-development](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/spec-driven-development/SKILL.md) — Lập trình hướng đặc tả (Spec trước Code).
  - [api-and-interface-design](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/api-and-interface-design/SKILL.md) — Thiết kế API và giao thức giao tiếp giữa các module.
* **Lập kế hoạch & Thực thi (Plan & Build)**:
  - [planning-and-task-breakdown](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/planning-and-task-breakdown/SKILL.md) — Chia nhỏ tác vụ thành các bước thực thi cụ thể.
  - [incremental-implementation](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/incremental-implementation/SKILL.md) — Triển khai thay đổi theo từng bước nhỏ an toàn.
  - [test-driven-development](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/test-driven-development/SKILL.md) — Lập trình hướng kiểm thử (Red-Green-Refactor).
  - [source-driven-development](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/source-driven-development/SKILL.md) — Code dựa trên tài liệu chính thức.
  - [frontend-ui-engineering](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/frontend-ui-engineering/SKILL.md) — Xây dựng giao diện UI chuẩn production.
  - [frontend-design](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/frontend-design/SKILL.md) — Thiết kế visual UI ấn tượng, mượt mà.
* **Tái cấu trúc & Sửa mã nguồn (Refactor & Code Edit)**:
  - [safe-edit](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/safe-edit/SKILL.md) — Kiểm tra ảnh hưởng trước khi sửa code.
  - [plan-refactor](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/plan-refactor/SKILL.md) — Lập kế hoạch refactor an toàn theo từng bước.
  - [rename-symbol](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/rename-symbol/SKILL.md) — Đổi tên biểu tượng (hàm/biến/lớp) an toàn trên toàn workspace.
  - [code-simplification](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/code-simplification/SKILL.md) — Tối ưu hóa và làm gọn code thừa.
* **Đánh giá & Kiểm soát Chất lượng (Review & QA)**:
  - [code-review-and-quality](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/code-review-and-quality/SKILL.md) — Đánh giá mã nguồn đa trục trước khi merge.
  - [doubt-driven-development](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/doubt-driven-development/SKILL.md) — Review đối kháng phản biện trước khi chốt giải pháp.
  - [pre-commit-check](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/pre-commit-check/SKILL.md) — Đánh giá tác động trước khi commit code.
  - [validate-business-rules](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/validate-business-rules/SKILL.md) — Kiểm tra các quy tắc nghiệp vụ trong ứng dụng.
* **Điều tra & Debug**:
  - [explore-codebase](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/explore-codebase/SKILL.md) — Tìm hiểu cấu trúc mã nguồn dự án mới nhanh chóng.
  - [investigate-bug](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/investigate-bug/SKILL.md) — Điều tra nguyên nhân lỗi bằng stack trace.
  - [debugging-and-error-recovery](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/debugging-and-error-recovery/SKILL.md) — Quy trình khắc phục lỗi có hệ thống.
  - [debugging-guide](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/debugging-guide/SKILL.md) — Hướng dẫn debug dành riêng cho dự án Legado.
  - [trace-request](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/trace-request/SKILL.md) — Truy vết luồng dữ liệu từ API đến DB.
* **Tối ưu & Bảo mật & Release**:
  - [performance-optimization](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/performance-optimization/SKILL.md) — Tối ưu hiệu năng UI và truy vấn.
  - [security-and-hardening](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/security-and-hardening/SKILL.md) — Gia cố bảo mật và kiểm tra dữ liệu untrusted.
  - [shipping-and-launch](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/shipping-and-launch/SKILL.md) — Kiểm tra danh mục trước khi phát hành release.
  - [git-workflow-and-versioning](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/git-workflow-and-versioning/SKILL.md) — Quy chuẩn Git workflow và đánh phiên bản.
  - [ci-cd-and-automation](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/ci-cd-and-automation/SKILL.md) — Tự động hóa pipeline và build test.
  - [documentation-and-adrs](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/documentation-and-adrs/SKILL.md) — Ghi chép quyết định kiến trúc ADR.
  - [context-engineering](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/context-engineering/SKILL.md) — Tối ưu ngữ cảnh làm việc cho AI agent.
* **Legado Specialization**:
  - [legado-compose-migration](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/legado-compose-migration/SKILL.md) — Quy chuẩn di chuyển XML sang Jetpack Compose.
  - [legado-compose-review](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/.agents/skills/legado-compose-review/SKILL.md) — Review mã nguồn Compose cho Legado.

