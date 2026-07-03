# DESIGN_SYSTEM.md — Novela (Legado Fork)

> **QUY TẮC BẮT BUỘC**: Mọi màn hình, component, dialog, sheet mới hoặc sửa đổi **PHẢI** tuân thủ tuyệt đối tài liệu này.
> **KHÔNG ĐƯỢC** tự sáng tạo style mới, tự chọn màu, font, khoảng cách, bo góc.
> Nếu không tìm thấy component phù hợp, **HỎI** trước khi tạo mới.

---

## 1. KIẾN TRÚC THEME

### 1.1 Dual Theme Engine
App hỗ trợ 2 engine giao diện, **PHẢI** xử lý cả hai:

| Engine | Khi nào | Cách kiểm tra |
|--------|---------|----------------|
| **Material 3 Expressive** | Mặc định | `!ThemeResolver.isMiuixEngine(composeEngine)` |
| **Miuix** | Khi user chọn theme Xiaomi | `ThemeResolver.isMiuixEngine(LegadoTheme.composeEngine)` |

```kotlin
// Trong mọi composable cần phân biệt engine:
val isMiuix = ThemeResolver.isMiuixEngine(LegadoTheme.composeEngine)
if (isMiuix) {
    // Dùng MiuixTheme.colorScheme, Miuix components
} else {
    // Dùng MaterialTheme.colorScheme hoặc LegadoTheme.colorScheme
}
```

### 1.2 Color Tokens — LUÔN lấy từ theme

#### LegadoColorScheme (Custom tokens)
| Token | Dùng cho |
|-------|----------|
| `LegadoTheme.colorScheme.background` | Nền chính màn hình |
| `LegadoTheme.colorScheme.surface` | Nền card/surface |
| `LegadoTheme.colorScheme.primary` | Màu chính (accent) |
| `LegadoTheme.colorScheme.onPrimary` | Text trên nền primary |
| `LegadoTheme.colorScheme.onSurface` | Text trên surface |
| `LegadoTheme.colorScheme.onBackground` | Text trên background |
| `LegadoTheme.colorScheme.cardContainer` | Nền card |
| `LegadoTheme.colorScheme.onCardContainer` | Text trong card |
| `LegadoTheme.colorScheme.onSheetContent` | Text trong bottom sheet |
| `LegadoTheme.colorScheme.cardPrimaryContainer` | Card nổi bật |
| `LegadoTheme.colorScheme.primaryContainer` | Container primary |
| `LegadoTheme.colorScheme.onPrimaryContainer` | Text trên primary container |
| `LegadoTheme.colorScheme.secondaryContainer` | Container secondary |
| `LegadoTheme.colorScheme.onSecondaryContainer` | Text trên secondary container |
| `LegadoTheme.colorScheme.tertiaryContainer` | Container tertiary |
| `LegadoTheme.colorScheme.outline` | Viền chính |
| `LegadoTheme.colorScheme.outlineVariant` | Viền nhạt |
| `LegadoTheme.colorScheme.error` | Màu lỗi |
| `LegadoTheme.colorScheme.surfaceContainer` | Container cấp trung |
| `LegadoTheme.colorScheme.surfaceContainerHigh` | Container cấp cao |
| `LegadoTheme.colorScheme.surfaceContainerLow` | Container cấp thấp |

#### Các token đặc biệt thêm (Miuix)
```kotlin
MiuixTheme.colorScheme.surface           // Nền Miuix
MiuixTheme.colorScheme.primaryContainer  // Container Miuix
MiuixTheme.colorScheme.onPrimary         // Text trên primary Miuix
MiuixTheme.colorScheme.surfaceContainer  // Surface container Miuix
```

### 1.3 Background Image Support
App hỗ trợ ảnh nền tùy chỉnh. **PHẢI** kiểm tra trước khi set background color:
```kotlin
val isDark = LegadoTheme.isDark
val hasImageBg = ThemeConfig.hasImageBg(isDark)

val containerColor = if (hasImageBg) Color.Transparent
                     else LegadoTheme.colorScheme.background
```

### 1.4 Secondary Color (Deep Personalization)
```kotlin
// Kiểm tra user có set secondary color không:
GlassDefaults.secondaryColorOr { fallbackColor }
```

---

## 2. TYPOGRAPHY

### 2.1 Hệ thống font — `LegadoTypography`
Truy cập qua `LegadoTheme.typography`:

| Style | Variant | Dùng cho |
|-------|---------|----------|
| `headlineLarge` | `headlineLargeEmphasized` | Tiêu đề trang lớn, splash |
| `headlineMedium` | `headlineMediumEmphasized` | Tiêu đề section lớn |
| `headlineSmall` | `headlineSmallEmphasized` | Tiêu đề section nhỏ |
| `titleLarge` | `titleLargeEmphasized` | TopBar title, dialog title |
| `titleMedium` | `titleMediumEmphasized` | Section title, card title |
| `titleSmall` | `titleSmallEmphasized` | Sub-section title |
| `bodyLarge` | `bodyLargeEmphasized` | Nội dung chính |
| `bodyMedium` | `bodyMediumEmphasized` | Nội dung chuẩn |
| `bodySmall` | `bodySmallEmphasized` | Mô tả phụ, timestamp |
| `labelLarge` | `labelLargeEmphasized` | Label lớn, chip text |
| `labelMedium` | `labelMediumEmphasized` | Label chuẩn, section header nhỏ |
| `labelSmall` | `labelSmallEmphasized` | Badge, tag, caption |

### 2.2 Quy tắc
```kotlin
// ✅ ĐÚNG — Dùng AppText + LegadoTheme.typography
AppText(text = "Tiêu đề", style = LegadoTheme.typography.titleMediumEmphasized)

// ❌ SAI — Không dùng Text() trực tiếp hoặc fontSize thủ công
Text(text = "Tiêu đề")
Text(text = "Tiêu đề", fontSize = 18.sp, fontWeight = FontWeight.Bold)
```

---

## 3. SPACING & LAYOUT

### 3.1 Spacing Scale (dp)
```
4dp   — micro: icon-to-text gap, dense list item spacing
8dp   — small: giữa phần tử nhỏ trong cùng group, chip gap
12dp  — medium-small: giữa items trong form, row spacing
16dp  — medium: padding ngang content mặc định, section gap
20dp  — medium-large: padding ngang button full-width
24dp  — large: padding dọc giữa groups lớn
32dp  — extra-large: khoảng cách giữa sections chính
```

### 3.2 Corner Radius Scale
| Radius | Dùng cho | Shape |
|--------|----------|-------|
| `8.dp` | Tag, badge, chip nhỏ | `RoundedCornerShape(8.dp)` |
| `12.dp` | Button, TextField, card nhỏ | `RoundedCornerShape(12.dp)` |
| `16.dp` | Card trung bình, list item | `RoundedCornerShape(16.dp)` |
| `20.dp` | Card lớn, dialog | `RoundedCornerShape(20.dp)` |
| `24.dp` | BottomSheet, card hero | `RoundedCornerShape(24.dp)` |
| `999.dp` | Pill chip, FAB | `RoundedCornerShape(999.dp)` |

### 3.3 Edge-to-Edge — BẮT BUỘC
```kotlin
// Mọi màn hình PHẢI hỗ trợ edge-to-edge:
AppScaffold(
    contentWindowInsets = WindowInsets(0.dp), // Nếu cần custom
    content = { paddingValues ->
        LazyColumn(
            contentPadding = paddingValues,
            // Thêm navigation bar padding cho item cuối:
            modifier = Modifier.navigationBarsPadding()
        ) { ... }
    }
)
```

### 3.4 Adaptive Padding
```kotlin
// Dùng AdaptivePadding cho responsive layout:
import io.legado.app.ui.theme.AdaptivePadding
```

---

## 4. COMPONENT LIBRARY

> **NGUYÊN TẮC**: Chỉ dùng component có sẵn. Không tạo component mới.
> Package: `io.legado.app.ui.widget.components`

### 4.1 AppScaffold — Scaffold chính
```kotlin
AppScaffold(
    topBar = { hazeState ->
        GlassMediumFlexibleTopAppBar(
            title = "Tiêu đề",
            hazeState = hazeState,
            navigationIcon = { TopBarNavigationButton(onClick = onBack) },
            actions = { /* action buttons */ }
        )
    },
    bottomBar = { FloatingBottomBar(...) },
    floatingActionButton = { AppFloatingActionButton(...) },
    content = { paddingValues ->
        // Main content
    }
)
```

### 4.2 TopBar
| Component | File | Dùng cho |
|-----------|------|----------|
| `GlassMediumFlexibleTopAppBar` | `topbar/` | TopBar chính, co giãn + blur |
| `GlassTopAppBar` | `topbar/` | TopBar cố định + blur |
| `DynamicTopAppBar` | `topbar/` | TopBar adaptive |
| `TopBarNavigationButton` | `topbar/TopBarButton.kt` | Nút back |
| `TopBarActionButton` | `topbar/TopBarButton.kt` | Nút action (search, more) |

```kotlin
// Ví dụ TopBar chuẩn:
GlassMediumFlexibleTopAppBar(
    title = "Cài đặt",
    hazeState = hazeState,
    scrollBehavior = scrollBehavior,
    navigationIcon = { TopBarNavigationButton(onClick = onBack) },
    actions = {
        TopBarActionButton(
            imageVector = AppIcons.MoreVert,
            contentDescription = "Menu",
            onClick = { showMenu = true }
        )
    }
)
```

### 4.3 Bottom Sheet
```kotlin
AppModalBottomSheet(
    show = showSheet,
    onDismissRequest = { showSheet = false }
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.9f)
            .navigationBarsPadding()
    ) {
        // Header row
        // Content (scrollable)
        // Footer (action buttons)
    }
}
```

### 4.4 Dialog
```kotlin
AppAlertDialog(
    onDismissRequest = { ... },
    title = "Xác nhận xóa",
    text = "Bạn có chắc muốn xóa?",
    confirmButton = {
        AppButton(text = "Xóa", onClick = { ... })
    },
    dismissButton = {
        AppButton(text = "Hủy", onClick = { ... })
    }
)
```

### 4.5 Text & Icon
```kotlin
// Text:
AppText(text = "...", style = LegadoTheme.typography.bodyMedium)

// Icon:
AppIcon(imageVector = AppIcons.Search, contentDescription = "Tìm kiếm")

// Animated text:
AnimatedTextLine(text = "...", style = LegadoTheme.typography.labelLarge)
```

### 4.6 Buttons

| Component | File | Dùng cho |
|-----------|------|----------|
| `AppButton` | `button/AppButton.kt` | Button chuẩn |
| `AppIconButton` | `button/AppIconButton.kt` | Icon button |
| `ToggleChip` | `button/ToggleChip.kt` | Filter chip on/off |
| `ConfirmDismissButtonsRow` | `button/` | Cặp nút Confirm/Dismiss |
| `SmallTonalButton` | `button/series/` | Button nhỏ, tone color |
| `SmallOutlinedButton` | `button/series/` | Button nhỏ, outlined |
| `SmallPlainButton` | `button/series/` | Button nhỏ, plain |
| `SmallToggleButton` | `button/series/` | Toggle button nhỏ |
| `SmallAnimatedButton` | `button/series/` | Button nhỏ có animation |
| `MediumTonalButton` | `button/series/` | Button trung, tone color |
| `MediumOutlinedButton` | `button/series/` | Button trung, outlined |
| `MediumPlainButton` | `button/series/` | Button trung, plain |
| `MediumToggleButton` | `button/series/` | Toggle button trung |
| `MediumAnimatedButton` | `button/series/` | Button trung có animation |
| `SeriesIconButton` | `button/series/` | Icon button chuỗi |

```kotlin
// ✅ ĐÚNG — Dùng ToggleChip cho filter
ToggleChip(
    label = "PER (Người)",
    selected = selectPer,
    onToggle = { selectPer = !selectPer }
)

// ✅ ĐÚNG — Dùng SmallTonalButton cho action
SmallTonalButton(
    onClick = { ... },
    text = "Tìm kiếm",
    icon = AppIcons.Search
)
```

### 4.7 TextField
```kotlin
AppTextField(
    value = text,
    onValueChange = { text = it },
    label = "Nhập từ khóa...",
    modifier = Modifier.fillMaxWidth()
)
```

### 4.8 Cards
```kotlin
// Dùng Surface + theme color:
Surface(
    shape = RoundedCornerShape(16.dp),
    color = LegadoTheme.colorScheme.cardContainer,
    contentColor = LegadoTheme.colorScheme.onCardContainer
) {
    // Card content
}
```

### 4.9 Settings Items
| Component | File | Dùng cho |
|-----------|------|----------|
| `SettingItem` | `settingItem/SettingItem.kt` | Setting item chuẩn |
| `ClickableSettingItem` | `settingItem/` | Setting item clickable |
| `SwitchSettingItem` | `settingItem/` | Toggle on/off |
| `SliderSettingItem` | `settingItem/` | Slider điều chỉnh |
| `InputSettingItem` | `settingItem/` | Input text |
| `ListSettingItem` | `settingItem/` | Chọn từ danh sách |
| `CompactSettingItems` | `settingItem/` | Setting items compact |
| `TinySettingItems` | `settingItem/` | Setting items nhỏ nhất |

### 4.10 Các component khác

| Component | File | Dùng cho |
|-----------|------|----------|
| `AppSearchBar` | `AppSearchBar.kt` | Search bar |
| `AppFloatingActionButton` | `AppFloatingActionButton.kt` | FAB |
| `AppSlider` | `AppSlider.kt` | Slider |
| `AppRadioButton` | `AppRadioButtom.kt` | Radio button |
| `AppPullToRefresh` | `AppPullToRefresh.kt` | Pull-to-refresh wrapper |
| `EmptyMessage` | `EmptyMessage.kt` | Empty state |
| `SectionTitle` | `SectionTitle.kt` | Section header |
| `CollapsibleHeader` | `CollapsibleHeader.kt` | Collapsible section |
| `FloatingBottomBar` | `FloatingBottomBar.kt` | Bottom navigation |
| `SelectionBottomBar` | `SelectionBottomBar.kt` | Multi-select bottom bar |
| `SplicedColumnGroup` | `SplicedColumnGroup.kt` | Grouped columns |
| `ValueStepper` | `ValueStepper.kt` | +/- stepper |
| `IconSwitch` | `IconSwitch.kt` | Icon toggle switch |
| `AppContainedLoadingIndicator` | `progressIndicator/` | Loading spinner |
| `LoadMoreFooter` | `LoadMoreFooter.kt` | Load more pagination |

---

## 5. GLASSMORPHISM & BLUR

### 5.1 GlassDefaults
```kotlin
object GlassDefaults {
    val DefaultBlurAlpha = 0.36f    // TopBar, BottomBar
    val ThickBlurAlpha = 0.72f      // Overlay dày
    val TransparentAlpha = 0f       // Hoàn toàn trong suốt

    fun glassColor(noBlurColor: Color, blurAlpha: Float): Color
    fun secondaryColorOr(fallback: @Composable () -> Color): Color
}
```

### 5.2 Haze Integration
```kotlin
// Content phải là hazeSource:
Box(
    modifier = Modifier
        .fillMaxSize()
        .responsiveHazeSource(hazeState)  // Hoặc .hazeSource(hazeState)
) {
    LazyColumn { ... }
}

// TopBar/BottomBar là hazeTarget (qua AppScaffold tự động xử lý)
```

### 5.3 Quy tắc Blur
- AppScaffold đã tự xử lý blur cho TopBar
- Kiểm tra `ThemeConfig.enableBlur` trước khi áp dụng thêm blur
- Kiểm tra `ThemeConfig.enableProgressiveBlur` cho progressive blur

---

## 6. LOADING & TRANSITION STATES

### 6.1 Loading Overlay — BẮT BUỘC
```kotlin
// Loading screen PHẢI dùng nền tối cố định:
Box(
    modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF121212)),    // ← Duy nhất chỗ hardcode màu
    contentAlignment = Alignment.Center
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        AppContainedLoadingIndicator()
        Spacer(modifier = Modifier.height(16.dp))
        AppText(
            text = "Đang tải...",
            color = Color.White.copy(alpha = 0.8f),    // ← Duy nhất chỗ hardcode
            style = LegadoTheme.typography.bodyMedium
        )
    }
}
```

### 6.2 Quy tắc Loading — TUYỆT ĐỐI TUÂN THỦ
1. ❌ **KHÔNG** dùng `MaterialTheme.colorScheme.background` cho loading
2. ❌ **KHÔNG** để flash nền sáng/vàng/trắng giữa transitions
3. ✅ **One-directional**: Khi content hiện rồi → loading KHÔNG hiện lại (`hasShownContent` flag)
4. ✅ **AndroidView**: Bắt đầu `visibility = View.INVISIBLE`, chỉ `VISIBLE` khi data sẵn sàng
5. ✅ **Fade transition**: `Modifier.graphicsLayer { alpha = animatedAlpha }`

### 6.3 Empty State
```kotlin
// Dùng EmptyMessage cho trạng thái trống:
EmptyMessage(
    message = "Chưa có dữ liệu",
    isLoading = isLoading,
    buttonText = "Tìm kiếm",
    onButtonClick = { ... }
)
```

---

## 7. ANIMATION & INTERACTION

### 7.1 Transition Standards
```kotlin
// Fade + Slide cho visibility transitions:
AnimatedVisibility(
    visible = isVisible,
    enter = fadeIn(tween(300)) + slideInVertically { it / 4 },
    exit = fadeOut(tween(200)) + slideOutVertically { it / 4 }
)

// Content switch:
AnimatedContent(targetState = state, label = "ContentSwitch") { ... }

// Crossfade giữa 2 states:
Crossfade(targetState = currentTab, label = "TabSwitch") { ... }
```

### 7.2 Duration Scale
| Duration | Dùng cho |
|----------|----------|
| `150ms` | Feedback nhanh: ripple, press, toggle |
| `300ms` | Transition trung bình: fade content, expand |
| `500ms` | Transition chậm: page change, bottom sheet, splash |

### 7.3 Predictive Back
```kotlin
// BẮT BUỘC cho confirmation states:
BackHandler(enabled = hasUnsavedChanges) {
    showDiscardDialog = true
}
```

---

## 8. SCREEN TEMPLATE — Copy & Paste

### 8.1 Full Screen Template (MVI)
```kotlin
// Contract:
@Stable
data class XxxUiState(
    val loading: Boolean = false,
    val items: ImmutableList<ItemUi> = persistentListOf(),
    val activeSheet: XxxSheet? = null,
    val activeDialog: XxxDialog? = null,
)
sealed interface XxxIntent { ... }
sealed interface XxxEffect { ... }

// ViewModel:
class XxxViewModel(...) : ViewModel() {
    private val _uiState = MutableStateFlow(XxxUiState())
    val uiState = _uiState.asStateFlow()
    private val _effects = MutableSharedFlow<XxxEffect>(extraBufferCapacity = 16)
    val effects = _effects.asSharedFlow()
    fun onIntent(intent: XxxIntent) { ... }
}

// Screen:
@Composable
fun XxxScreen(
    state: XxxUiState,
    onIntent: (XxxIntent) -> Unit,
    effects: SharedFlow<XxxEffect>,
    onBack: () -> Unit,
) {
    LaunchedEffect(Unit) { effects.collectLatest { /* handle */ } }

    AppScaffold(
        topBar = { hazeState ->
            GlassMediumFlexibleTopAppBar(
                title = "Tiêu đề",
                hazeState = hazeState,
                navigationIcon = { TopBarNavigationButton(onClick = onBack) }
            )
        }
    ) { paddingValues ->
        if (state.loading) {
            Box(Modifier.fillMaxSize().background(Color(0xFF121212)),
                contentAlignment = Alignment.Center
            ) { AppContainedLoadingIndicator() }
        } else {
            LazyColumn(contentPadding = paddingValues) { ... }
        }
    }
}
```

### 8.2 Bottom Sheet Template
```kotlin
@Composable
fun XxxSheet(
    show: Boolean,
    onDismissRequest: () -> Unit,
    // ... data params
) {
    AppModalBottomSheet(show = show, onDismissRequest = onDismissRequest) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.9f)
                .navigationBarsPadding()
        ) {
            // ─── Header ───
            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                AppText(
                    text = "Tiêu đề Sheet",
                    style = LegadoTheme.typography.titleMediumEmphasized,
                    modifier = Modifier.weight(1f)
                )
                AppIconButton(
                    imageVector = AppIcons.Close,
                    contentDescription = "Đóng",
                    onClick = onDismissRequest
                )
            }

            // ─── Filter Row ───
            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                ToggleChip(label = "Filter 1", selected = f1, onToggle = { f1 = !f1 })
                ToggleChip(label = "Filter 2", selected = f2, onToggle = { f2 = !f2 })
            }

            Spacer(modifier = Modifier.height(8.dp))

            // ─── Content ───
            Box(modifier = Modifier.fillMaxWidth().weight(1f).padding(horizontal = 16.dp)) {
                LazyColumn { ... }
            }

            // ─── Footer ───
            Row(
                modifier = Modifier.fillMaxWidth().padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                SmallTonalButton(text = "Action", icon = AppIcons.Check, onClick = { ... })
            }
        }
    }
}
```

---

## 9. ANTI-PATTERNS — TUYỆT ĐỐI KHÔNG LÀM

### ❌ Màu sắc
```kotlin
// ❌ KHÔNG hardcode màu (ngoại trừ loading overlay)
Color(0xFF1A1A1A)
Color.White
Color.Black
Color(0xFFE6C5A0)

// ✅ Dùng theme tokens
LegadoTheme.colorScheme.surface
LegadoTheme.colorScheme.onSurface
LegadoTheme.colorScheme.primary
```

### ❌ Typography
```kotlin
// ❌ KHÔNG dùng fontSize/fontWeight trực tiếp
Text(text = "...", fontSize = 18.sp, fontWeight = FontWeight.Bold)

// ✅ Dùng LegadoTheme.typography
AppText(text = "...", style = LegadoTheme.typography.titleMediumEmphasized)
```

### ❌ Components
```kotlin
// ❌ KHÔNG dùng Material components trực tiếp
Scaffold(...)           // → Dùng AppScaffold(...)
TopAppBar(...)          // → Dùng GlassMediumFlexibleTopAppBar(...)
BottomSheet(...)        // → Dùng AppModalBottomSheet(...)
AlertDialog(...)        // → Dùng AppAlertDialog(...)
Text(...)               // → Dùng AppText(...)
Icon(...)               // → Dùng AppIcon(...)
CircularProgressIndicator() // → Dùng AppContainedLoadingIndicator()
```

### ❌ Layout
```kotlin
// ❌ KHÔNG dùng khoảng cách ngoài scale (4/8/12/16/20/24/32)
padding(13.dp)   // → 12.dp hoặc 16.dp
padding(18.dp)   // → 16.dp hoặc 20.dp
padding(30.dp)   // → 32.dp

// ❌ KHÔNG dùng bo góc ngoài scale (8/12/16/20/24/999)
RoundedCornerShape(10.dp)  // → 8.dp hoặc 12.dp
RoundedCornerShape(15.dp)  // → 16.dp
```

### ❌ Architecture
```kotlin
// ❌ KHÔNG kế thừa BaseViewModel
class XxxViewModel : BaseViewModel(app) { ... }

// ✅ Kế thừa ViewModel() trực tiếp
class XxxViewModel(...) : ViewModel() { ... }

// ❌ KHÔNG truy cập navigator trong Screen
navController.navigate(...)

// ✅ Nhận navigation lambda
onBack: () -> Unit
onNavigateToXxx: () -> Unit
```

---

## 10. CHECKLIST TRƯỚC KHI COMMIT UI

- [ ] Không có màu hardcode (ngoại trừ loading `Color(0xFF121212)`)
- [ ] Dùng đúng component có sẵn (AppScaffold, AppText, AppIcon, ...)
- [ ] Font từ `LegadoTheme.typography` (không fontSize thủ công)
- [ ] Hỗ trợ dual theme (Material 3 + Miuix) nếu component chưa tự xử lý
- [ ] Edge-to-edge (navigationBarsPadding, safeDrawing)
- [ ] Loading state đúng chuẩn (nền tối, spinner, text trắng)
- [ ] Khoảng cách đúng scale (4/8/12/16/20/24/32 dp)
- [ ] Bo góc đúng scale (8/12/16/20/24/999 dp)
- [ ] Predictive back (BackHandler cho confirmation)
- [ ] Animation nhất quán (fade+slide, 150/300/500ms)
- [ ] `@Stable` trên data classes, `ImmutableList` thay `List`
- [ ] `collectAsStateWithLifecycle()` để collect state
- [ ] Empty state dùng `EmptyMessage`
- [ ] Background image compatible (kiểm tra `hasImageBg`)

---

*Cập nhật lần cuối: 2026-07-04*
