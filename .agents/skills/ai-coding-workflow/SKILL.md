---
name: ai-coding-workflow
description: >
  Quy trinh lam viec chuan cho AI khi xu ly task ky thuat, debug, code, hoac bat ky
  van de nao can giai quyet co he thong. Dac biet cho du an Legado (Novela) Android.
---

# AI Coding & Problem-Solving Workflow

## PHASE 0 - Đọc & Tiếp nhận vấn đề
- Đọc kỹ yêu cầu ít nhất 2 lần, chú ý context xung quanh.
- Xác định rõ: Input / Output mong muốn / Constraints / Unknowns.
- Kiểm tra xem yêu cầu liên quan đến Compose UI, native View, hay logic backend.

## PHASE 1 - Lập Kế Hoạch (Plan)
- Phân ra bài toán thành các task nhỏ độc lập, ưu tiên blocking dependencies trước.
- Checkpoint với user nếu là task lớn hoặc ảnh hưởng nhiều file.
- Xác định build variant cần dùng:
  - Code change nhỏ → `.\gradlew.bat :app:compileAppDebugKotlin`
  - Cần test trên máy → `.\gradlew.bat assembleAppDebug` + ADB install

## PHASE 2 - Thực thi (Execute)
- Làm từng bước một, đánh dấu progress, không nhảy cóc.
- Viết code: Readable > Clever, đặt tên tự giải thích, xử lý edge cases đầy đủ.
- **UI/UX**: Đảm bảo đồng bộ theme, loading, transition (xem Section 6 của AGENTS.md).
- Khi sửa Compose: tuân thủ MVI/UDF pattern, @Stable annotations, ImmutableList.
- Khi sửa native View: cẩn thận z-order với AndroidView, visibility timing.

## PHASE 3 - Debug hệ thống
- Framework 5 câu hỏi: WHAT → WHERE → WHEN → WHY → FIX (sửa gốc rễ).
- Đọc toàn bộ stack trace từ trên xuống, tìm file của mình, trace ngược data flow.
- Phân loại lỗi:
  - **Compile Error**: Đọc lỗi Kotlin, kiểm tra import, type mismatch.
  - **Runtime/UI**: Kiểm tra lifecycle, state flow, AndroidView timing, visibility.
  - **Theme Flash**: Kiểm tra z-order, initial visibility, background colors.

## PHASE 4 - Kiểm tra & Báo cáo
- Build: `.\gradlew.bat :app:compileAppDebugKotlin` (nhanh) hoặc `.\gradlew.bat assembleAppDebug` (full)
- Deploy test: ADB install lên device Redmi Note 13 Pro+
- Báo cáo: Đã làm gì / Thay đổi files nào / Cách test / Lưu ý.
