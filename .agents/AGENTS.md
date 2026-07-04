# AGENTS.md (Workspace Rules)

> Các rules tổng hợp đầy đủ nằm ở file gốc: [AGENTS.md](file:///c:/Users/bac5a/OneDrive/Máy tính/Nam/Novela/AGENTS.md)
> File này chứa workspace-specific overrides và quick reference.

---

## Quick Reference — Build & Deploy

```powershell
# Compile check nhanh (không tạo APK)
.\gradlew.bat :app:compileAppDebugKotlin

# Build debug APK
.\gradlew.bat assembleAppDebug

# Cài vào điện thoại
& "C:\Users\bac5a\AppData\Local\Android\Sdk\platform-tools\adb.exe" -s PNAUU475TOYPLV7H install -r -d "app/build/outputs/apk/app/debug/Novela-arm64-v8a-debug.apk"
```

---

## Workspace-Specific Constraints

1. **OS**: Windows 11 + PowerShell. Dùng `.\gradlew.bat`, KHÔNG dùng `./gradlew`.
   - **KSP Multi-drive Bug**: Do dự án nằm ở ổ `C:` nhưng `GRADLE_USER_HOME` mặc định của hệ thống trỏ về ổ `D:`, KSP sẽ lỗi biên dịch (`different roots`). **BẮT BUỘC** chạy `$env:GRADLE_USER_HOME="C:\Users\bac5a\.gradle"` trước khi chạy lệnh gradle.
2. **Device**: Redmi Note 13 Pro+ (arm64-v8a), serial `PNAUU475TOYPLV7H`.
3. **UI/UX đồng bộ**: Mọi loading state, transition, theme PHẢI đồng bộ qua toàn app.
   - Loading background: `Color(0xFF121212)`
   - Loading text: `Color.White.copy(alpha = 0.8f)`
   - Loading indicator: `AppContainedLoadingIndicator()`
   - KHÔNG dùng `MaterialTheme.colorScheme.background` cho loading states
   - Native `AndroidView` bắt đầu `INVISIBLE`, chỉ `VISIBLE` khi data sẵn sàng
   - One-directional loading: dùng `hasShownContent` pattern
4. **Pinned libraries**: Jsoup ≤ 1.16.2, Hutool ≤ 5.8.22
5. **Package names**: namespace `io.legado.app`, applicationId `io.legato.kazusa`
6. **Design System**: Khi tạo hoặc sửa bất kỳ giao diện nào, **BẮT BUỘC** đọc và tuân thủ [DESIGN_SYSTEM.md](.agents/DESIGN_SYSTEM.md). Không được tự sáng tạo style, màu sắc, component mới. Chỉ dùng component có sẵn trong `ui/widget/components/`.
