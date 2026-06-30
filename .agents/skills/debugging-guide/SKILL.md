---
name: debugging-guide
description: >
  Hướng dẫn chi tiết quy trình debug có hệ thống cho dự án Legado Android,
  bao gồm phân loại lỗi, cách đọc stack trace, và xử lý lỗi UI/UX.
---

# Debugging Guide

## Mindset Debug đúng
Debug không phải đoán mò — là điều tra có hệ thống.

## Framework 5 câu hỏi
1. **WHAT**: Lỗi gì? (mô tả chính xác triệu chứng — crash? flash? sai UI?)
2. **WHERE**: Lỗi ở đâu? (file, function, line)
3. **WHEN**: Khi nào xảy ra? (action nào trigger, điều kiện gì)
4. **WHY**: Tại sao xảy ra? (root cause — state bounce? z-order? lifecycle?)
5. **FIX**: Fix đúng chỗ hay đang patch symptom?

## Debug theo loại lỗi

### Compile Error (Kotlin)
- Đọc lỗi từ cuối output Gradle: `2>&1 | Select-Object -Last 20`
- Kiểm tra: import thiếu, type mismatch, override signature sai
- Quick compile: `.\gradlew.bat :app:compileAppDebugKotlin`

### UI Flash/Flicker
- **Nguyên nhân thường gặp**:
  1. `AndroidView` native view visible trước khi Compose overlay render
  2. `MaterialTheme.colorScheme.background` sáng/vàng dùng cho loading state
  3. State bouncing: `showLoadingOverlay` toggle true→false→true nhanh
- **Fix pattern**:
  - Native view: `visibility = View.INVISIBLE` trong `factory` block
  - Loading background: `Color(0xFF121212)` thay MaterialTheme
  - State stability: `hasShownContent` cờ one-directional

### State/Lifecycle
- Compose: kiểm tra `collectAsStateWithLifecycle()`, `LaunchedEffect` key
- ReadBook singleton: `ReadBook.msg`, `ReadBook.curTextChapter` thay đổi từ background thread
- ViewModel sync: `syncFromReadBook()` gọi nhiều lần qua callbacks

### Runtime Crash
- Đọc stack trace từ trên xuống, tìm file `io.legado.app`
- NPE: kiểm tra nullable access, `?.` vs `!!`
- ANR: kiểm tra blocking call trên Main thread

### Build/Environment
- Gradle: Configuration cache lỗi → xóa `.gradle/configuration-cache/`
- ADB: Device not found → kiểm tra USB debugging, `adb devices -l`
- JDK: Phải dùng JDK 21, kiểm tra `JAVA_HOME`
