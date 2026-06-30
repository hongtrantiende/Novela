# AGENTS.md (Workspace Rules)

> Các rules tổng hợp đầy đủ nằm ở file gốc: [AGENTS.md](file:///c:/Users/Admin/Documents/NAM/legado/AGENTS.md)
> File này chứa workspace-specific overrides và quick reference.

---

## Quick Reference — Build & Deploy

```powershell
# Compile check nhanh (không tạo APK)
.\gradlew.bat :app:compileAppDebugKotlin

# Build debug APK
.\gradlew.bat assembleAppDebug

# Cài vào điện thoại
& "C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe" -s PNAUU475TOYPLV7H install -r -d "app/build/outputs/apk/app/debug/Novela-arm64-v8a-debug.apk"
```

---

## Workspace-Specific Constraints

1. **OS**: Windows 11 + PowerShell. Dùng `.\gradlew.bat`, KHÔNG dùng `./gradlew`.
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
