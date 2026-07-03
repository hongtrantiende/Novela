# 📋 KẾ HOẠCH NÂNG CẤP & ĐỒNG BỘ GIAO DIỆN — NOVELA APP

> **Mục tiêu**: Giữ nguyên phong cách hiện tại, polish và đồng bộ toàn bộ UI cho premium, nhất quán.
> **Phương pháp**: Làm tuần tự Phase 1→6, mỗi phase build 1 lần, test trên máy.
> **Tài liệu tham chiếu**: `.agents/DESIGN_SYSTEM.md` — BẮT BUỘC đọc trước khi sửa bất kỳ UI nào.

---

## ✅ Phase 1: DESIGN_SYSTEM.md + Fix Anti-Patterns (ĐÃ HOÀN THÀNH)

**Trạng thái**: ✅ DONE — Đã merge vào `main`

### Đã làm:
- [x] Tạo `DESIGN_SYSTEM.md` — 10 sections, 662 dòng (color tokens, typography, spacing, component catalog, anti-patterns, screen/sheet templates)
- [x] Cập nhật `AGENTS.md` — thêm rule bắt buộc đọc DESIGN_SYSTEM.md
- [x] Fix `MainNavGraph.kt` — `CircularProgressIndicator` → `AppContainedLoadingIndicator`
- [x] Fix `ExploreScreen.kt` — `CircularProgressIndicator` → `AppCircularProgressIndicator`
- [x] Fix `FontSelectGrid.kt` — `CircularProgressIndicator` → `AppCircularProgressIndicator`
- [x] Fix `QuickTranslateSettingsScreen.kt` — `CircularProgressIndicator` → `AppCircularProgressIndicator`
- [x] Fix `.gitignore` — cho phép track `.agents/`
- [x] Build APK thành công, không lỗi compile

---

## 📦 Phase 2: Bottom Sheets — NER, ScanNames, ReplaceScanNames

**Mục tiêu**: 3 bottom sheet NER hiện có giao diện không nhất quán. Cần đồng bộ theo cùng 1 pattern chuẩn.

### 2.1 Phân tích hiện trạng

| Sheet | File | Size | Vấn đề |
|-------|------|------|--------|
| NER Analyze | `ui/book/read/sheet/NerAnalyzeSheet.kt` | 39KB | Lớn nhất, phức tạp, dùng `AlertDialog` trực tiếp |
| Scan Names | `ui/book/read/sheet/ScanNamesSheet.kt` | 15KB | Dùng `AlertDialog` trực tiếp |
| Replace Scan Names | `ui/replace/ReplaceScanNamesSheet.kt` | ~10KB | Dùng `AlertDialog` trực tiếp |

### 2.2 Thay đổi cụ thể cho cả 3 sheet

#### A. Header & Layout
- [ ] **Header bar**: Thống nhất dùng `Row` với `AppText(title)` + `IconButton(close)` + height `56.dp`
- [ ] **Padding**: Đồng nhất `horizontalPadding = 16.dp`, `verticalSpacing = 8.dp`
- [ ] **Shape**: Tất cả dùng `RoundedCornerShape(topStart = 28.dp, topEnd = 28.dp)` (Material 3 standard)

#### B. Dialog → AppAlertDialog
- [ ] **NerAnalyzeSheet.kt**: Thay `AlertDialog(` → `AppAlertDialog(`
- [ ] **ScanNamesSheet.kt**: Thay `AlertDialog(` → `AppAlertDialog(`
- [ ] **ReplaceScanNamesSheet.kt**: Thay `AlertDialog(` → `AppAlertDialog(`

#### C. Loading States
- [ ] Đảm bảo loading dùng `AppCircularProgressIndicator()` (không dùng Material3 trực tiếp)
- [ ] Loading overlay: nền `Color(0xFF121212)` + text `Color.White.copy(alpha = 0.8f)`

#### D. Filter/Config Row
- [ ] Thống nhất layout filter chips: dùng `FlowRow` + `FilterChip` style đồng bộ
- [ ] Toggle switches dùng `SwitchSettingItem` từ widget library

#### E. Result List Items
- [ ] Mỗi item: `Card` với `GlassCard` style hoặc `Surface` đồng nhất
- [ ] Text: Tên gốc (Trung) → Tên dịch, loại entity, tần suất xuất hiện
- [ ] Checkbox/selection state nhất quán

#### F. Action Buttons
- [ ] Bottom row: `TextButton("Hủy")` + `FilledTonalButton("Áp dụng"/"Xuất")` cùng style
- [ ] Spacing: `Arrangement.spacedBy(12.dp, Alignment.End)`

### 2.3 Files cần sửa
```
app/src/main/java/io/legado/app/ui/book/read/sheet/NerAnalyzeSheet.kt
app/src/main/java/io/legado/app/ui/book/read/sheet/ScanNamesSheet.kt
app/src/main/java/io/legado/app/ui/replace/ReplaceScanNamesSheet.kt
```

### 2.4 Verification
```powershell
.\gradlew.bat :app:compileAppDebugKotlin
.\gradlew.bat assembleAppDebug
```
- Test: Mở reader → menu → NER Analyze, Scan Names
- Test: Mở Replace rules → Scan Names

---

## ⚙️ Phase 3: Config/Settings Screens

**Mục tiêu**: Đồng bộ 14 settings screens theo cùng 1 template chuẩn.

### 3.1 Template chuẩn cho Settings Screen
```kotlin
AppScaffold(
    topBar = {
        GlassMediumFlexibleTopAppBar(
            title = { AppText("Tiêu đề") },
            navigationIcon = { TopBarNavigationButton(onBack) }
        )
    }
) { padding ->
    LazyColumn(Modifier.padding(padding)) {
        // SplicedColumnGroup cho mỗi nhóm settings
        // SwitchSettingItem, DropdownListSettingItem, InputSettingItem
    }
}
```

### 3.2 Danh sách screens cần audit & sửa

| # | Screen | File | Kiểm tra |
|---|--------|------|----------|
| 1 | Menu Settings | `config/ConfigNavScreen.kt` | AppScaffold, TopBar, navigation items |
| 2 | Đọc sách | `config/readConfig/ReadConfigScreen.kt` | Settings items, spacing |
| 3 | Sao lưu | `config/backupConfig/BackupConfigScreen.kt` | Settings items, spacing |
| 4 | Giao diện | `config/themeConfig/ThemeConfigScreen.kt` | Color picker, font picker |
| 5 | Khác | `config/otherConfig/OtherConfigScreen.kt` | Settings items |
| 6 | Dịch nhanh | `config/translation/QuickTranslateSettingsScreen.kt` | ✅ Đã fix loading |
| 7 | Dịch | `config/translation/TranslationConfigScreen.kt` | Settings items |
| 8 | Lab | `config/labConfig/LabConfigScreen.kt` | Experimental flags |
| 9 | Bìa sách | `config/coverConfig/CoverConfigScreen.kt` | Cover settings |
| 10 | Cache/Download | `config/downloadCacheConfig/DownloadCacheConfigScreen.kt` | Cache settings |
| 11 | Tùy chỉnh theme | `config/customTheme/` | Theme editor |
| 12 | Quản lý theme | `config/themeManage/` | Theme list |
| 13 | Tủ sách config | `config/bookshelfConfig/` | Bookshelf layout |
| 14 | Import sách | `config/importBookConfig/` | Import settings |
| 15 | Đọc manga | `config/readMangaConfig/` | Manga reader config |

### 3.3 Checklist cho mỗi screen
- [ ] Dùng `AppScaffold` (không `Scaffold` trực tiếp)
- [ ] TopBar: `GlassMediumFlexibleTopAppBar` + `TopBarNavigationButton`
- [ ] Settings groups: `SplicedColumnGroup`
- [ ] Toggle: `SwitchSettingItem`
- [ ] Dropdown: `DropdownListSettingItem`
- [ ] Input: `InputSettingItem`
- [ ] Padding: 16dp horizontal, 8dp vertical spacing
- [ ] Loading: `AppCircularProgressIndicator` hoặc `AppContainedLoadingIndicator`
- [ ] Dialog: `AppAlertDialog` (không `AlertDialog` trực tiếp)

### 3.4 Verification
```powershell
.\gradlew.bat :app:compileAppDebugKotlin
.\gradlew.bat assembleAppDebug
```
- Test: Mở Settings → vào từng sub-screen → kiểm tra visual consistency

---

## 🏠 Phase 4: Main Screens — Bookshelf, Homepage, My, Explore

**Mục tiêu**: Polish 5 tab chính (+ RSS) cho premium, đồng bộ transitions và card styles.

### 4.1 Danh sách screens

| # | Tab | Files chính | Kiểm tra trọng tâm |
|---|-----|------------|---------------------|
| 1 | Tủ sách | `main/bookshelf/BookshelfScreen.kt` | Book grid/list cards, empty state, search bar |
| 2 | Trang chủ | `main/homepage/HomepageScreen.kt` | Section headers, horizontal scroll, cards |
| 3 | Khám phá | `main/explore/ExploreScreen.kt` | Source cards, search, filter chips |
| 4 | Cá nhân | `main/my/MyScreen.kt` | Profile section, menu items, stats |
| 5 | RSS | `main/rss/` | RSS feed cards, read status |

### 4.2 Kiểm tra & sửa

#### A. Navigation Bar
- [ ] `MainScreen.kt` — kiểm tra `AppNavigationBar` vs `WideNavigationRail` consistency
- [ ] Animation chuyển tab: smooth fade/slide
- [ ] Badge counts đúng vị trí

#### B. Book Cards
- [ ] Grid mode: Cover + title + author, aspect ratio nhất quán
- [ ] List mode: Cover thumbnail + title + author + progress
- [ ] `BookCover` component dùng đúng (không tự render cover)
- [ ] Shadow/elevation đồng nhất

#### C. Empty States
- [ ] Tủ sách trống: `EmptyMessage` component + illustration
- [ ] Explore không tìm thấy: `EmptyMessage`
- [ ] RSS trống: `EmptyMessage`

#### D. Pull-to-Refresh
- [ ] Mỗi tab có pull-to-refresh nhất quán
- [ ] Indicator style đồng bộ

#### E. Search Bars
- [ ] Search bar style đồng nhất giữa các tab
- [ ] Clear button, focus state

### 4.3 MyScreen.kt — Đặc biệt
- [ ] Fix Supabase admin section (dùng fully-qualified Material3 imports → dùng App* wrappers)
- [ ] Profile card polish
- [ ] Menu items dùng `SplicedColumnGroup` + `SettingItem` pattern

### 4.4 Verification
```powershell
.\gradlew.bat :app:compileAppDebugKotlin
.\gradlew.bat assembleAppDebug
```
- Test: Chuyển qua lại 5 tab → kiểm tra animation, card styles
- Test: Pull-to-refresh mỗi tab
- Test: Search trong Bookshelf và Explore
- Test: Empty states (xóa hết sách test)

---

## 📖 Phase 5: Book Detail & Reader Screens

**Mục tiêu**: Polish màn hình chi tiết sách, reader, và tất cả reader sheets.

### 5.1 Book Info & Detail

| # | Screen | File/Dir | Kiểm tra |
|---|--------|----------|----------|
| 1 | Chi tiết sách | `book/info/` | Cover blur background, info layout, action buttons |
| 2 | Mục lục | `book/toc/` | Chapter list, current chapter highlight, scroll |
| 3 | Tìm nội dung | `book/searchContent/` | Search results, highlight matching text |
| 4 | Đổi nguồn | `book/changesource/` | Source list, speed indicators, current source |
| 5 | Đổi bìa | `book/changecover/` | Cover grid, selection state |
| 6 | Tìm kiếm | `book/search/` | Search bar, results, history |
| 7 | Bookmark | `book/bookmark/` | Bookmark list, edit/delete |
| 8 | Import | `book/import/` | File browser, import progress |
| 9 | Nhóm | `book/group/` | Group management |
| 10 | Quản lý | `book/manage/` | Batch operations |

### 5.2 Reader Sheets (30 sheets!)

Đây là phần lớn nhất — có 30 bottom sheet trong reader. Chia thành 3 nhóm:

#### Nhóm A: UI/Config Sheets (ưu tiên cao — user dùng nhiều)
| Sheet | File | Size | Công việc |
|-------|------|------|-----------|
| ReadAloud Config | `ReadAloudConfigSheet.kt` | 34KB | Audit TTS settings |
| ReadAloud Player | `ReadAloudSheet.kt` | 46KB | Audit player controls |
| System Menu | `SystemMenuPage.kt` | 38KB | Audit menu layout |
| BgText Config | `BgTextConfigSheet.kt` | 19KB | Audit background/text settings |
| Header Footer | `HeaderFooterPage.kt` | 30KB | Audit header/footer config |
| Text Title | `TextTitleSheet.kt` | 24KB | Audit title settings |
| Dict Manager | `DictManagerSheet.kt` | 21KB | Audit dictionary UI |

#### Nhóm B: Config Sheets (ưu tiên trung bình)
| Sheet | File | Size |
|-------|------|------|
| Change Source | `ChangeChapterSourceSheet.kt` | 14KB |
| Click Action | `ClickActionConfigSheet.kt` | 9KB |
| Content Edit | `ContentEditSheet.kt` | 7KB |
| Effective Replaces | `EffectiveReplacesSheet.kt` | 7KB |
| Read Style | `ReadStyleSheet.kt` | 7KB |
| More Config | `MoreConfigSheet.kt` | 15KB |
| Highlight Rules | `HighlightRuleConfigSheet.kt` + `HighlightRuleEditSheet.kt` | 33KB |
| TitleBar Icon | `TitleBarIconSheet.kt` | 11KB |
| Underline Config | `UnderlineConfigSheet.kt` | 6KB |
| Global Theme | `GlobalThemePage.kt` | 19KB |

#### Nhóm C: Small Sheets (ưu tiên thấp — ít phức tạp)
| Sheet | File | Size |
|-------|------|------|
| Auto Read | `AutoReadSheet.kt` | 5KB |
| Charset Config | `CharsetConfigSheet.kt` | 2KB |
| Download | `DownloadSheet.kt` | 3KB |
| Page Anim Config | `PageAnimConfigSheet.kt` | 1.5KB |
| Page Key Config | `PageKeyConfigSheet.kt` | 5KB |
| Padding Config | `PaddingConfigSheet.kt` | 3KB |
| Photo | `PhotoSheet.kt` | 4KB |
| Shadow Set | `ShadowSetSheet.kt` | 4KB |
| Simulated Reading | `SimulatedReadingSheet.kt` | 6KB |
| Tool Button Config | `ToolButtonConfigSheet.kt` | 0.6KB |

### 5.3 Checklist cho mỗi sheet
- [ ] Dùng `AppModalBottomSheet` (nếu chưa)
- [ ] Header: `AppText(title)` + close icon
- [ ] Loading: `AppCircularProgressIndicator`
- [ ] Dialog: `AppAlertDialog` (không `AlertDialog`)
- [ ] Colors: Theo theme (không hardcode)
- [ ] Spacing: 16dp padding, 8dp gaps

### 5.4 Verification
```powershell
.\gradlew.bat :app:compileAppDebugKotlin
.\gradlew.bat assembleAppDebug
```
- Test: Mở reader → mở từng sheet → kiểm tra visual
- Test: TTS controls
- Test: Theme/style settings in reader

---

## 🧩 Phase 6: Screens Phụ & Extension

**Mục tiêu**: Polish tất cả screens còn lại.

### 6.1 Danh sách screens

| # | Screen | File/Dir | Kiểm tra |
|---|--------|----------|----------|
| 1 | Giới thiệu | `about/` | About page, version info, credits |
| 2 | Giới thiệu Miuix | `about/MiuixAboutScreen.kt` | ⚠️ Dùng `Scaffold` trực tiếp |
| 3 | Chào mừng | `welcome/` | Onboarding flow, permissions |
| 4 | Thay thế rules | `replace/` | Replace rule list, edit, test |
| 5 | RSS Reader | `rss/` | Article list, read view |
| 6 | Lịch sử đọc | `book/readRecord/` | Read history, stats |
| 7 | Cache/Download | `book/cache/` | Download queue, progress |
| 8 | Manga Reader | `book/manga/` | Manga-specific reader UI |
| 9 | Video Player | `book/video/` | Video player UI |
| 10 | Audio Player | `book/audio/` | Audio player UI |
| 11 | Source Editor | `book/source/` | Source management |
| 12 | Book Explore | `book/explore/` | Explore within source |
| 13 | Browser | `browser/` | In-app browser |
| 14 | Login | `login/` | Login screen |
| 15 | QR Code | `qrcode/` | QR scanner |
| 16 | File picker | `file/` | File browser |
| 17 | Dict | `dict/` | Dictionary lookup |
| 18 | Animation | `animation/` | Lottie/animations |
| 19 | Association | `association/` | File association handler |
| 20 | Extension | `vbookextension/ui/ExtensionScreens.kt` | Extension store, management |

### 6.2 Ưu tiên sửa trong Phase 6

**Cao** (user dùng nhiều):
- [ ] `replace/` — Replace rules
- [ ] `rss/` — RSS reader
- [ ] `book/cache/` — Download manager
- [ ] `book/source/` — Source editor

**Trung bình**:
- [ ] `about/MiuixAboutScreen.kt` — Fix `Scaffold` → `AppScaffold`
- [ ] `welcome/` — Onboarding
- [ ] `book/readRecord/` — Read history

**Thấp** (ít dùng):
- [ ] `browser/`, `login/`, `qrcode/`, `file/`, `dict/`, `animation/`, `association/`

### 6.3 Verification
```powershell
.\gradlew.bat :app:compileAppDebugKotlin
.\gradlew.bat assembleAppDebug
```
- Test: Mở từng screen phụ → kiểm tra visual
- Test: Full flow: search → detail → read → NER → replace

---

## 📊 Tổng kết

| Phase | Screens | Ước tính | Trạng thái |
|-------|---------|----------|------------|
| 1 | DESIGN_SYSTEM + 4 files | 1-2h | ✅ DONE |
| 2 | 3 NER sheets | 2-3h | ⬜ TODO |
| 3 | 15 config screens | 3-4h | ⬜ TODO |
| 4 | 5 main tabs | 3-4h | ⬜ TODO |
| 5 | 10 book screens + 30 sheets | 6-8h | ⬜ TODO |
| 6 | 20 screens phụ | 4-6h | ⬜ TODO |
| **Tổng** | **~83 screens/sheets** | **~20-27h** | |

### Quy tắc khi làm
1. **BẮT BUỘC** đọc `.agents/DESIGN_SYSTEM.md` trước khi sửa
2. **Compile check** sau mỗi file: `.\gradlew.bat :app:compileAppDebugKotlin`
3. **Build APK** sau mỗi phase: `.\gradlew.bat assembleAppDebug`
4. **Không sửa** code logic/business — chỉ sửa UI/UX
5. **Giữ nguyên** phong cách hiện tại — chỉ polish, không redesign
6. **Surgical changes** — không sửa code lân cận không liên quan
