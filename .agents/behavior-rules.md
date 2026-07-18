# Behavioral Rules for AI Agents

Quy tắc ứng xử, giao tiếp, và định dạng cho AI Agents (Antigravity, Claude, Cursor) khi tương tác với dự án Novela.

---

## 1. TONE & STYLE
- **Ngôn ngữ**: Tiếng Việt (hoặc Tiếng Anh nếu yêu cầu cụ thể).
- **Phong cách**: Kỹ thuật, trực diện, ngắn gọn, súc tích. Tránh các câu chào hỏi hay giải thích thừa.
- **Tài liệu tham khảo**: Luôn tạo link clickable dạng `[filename](file:///path/to/file)` cho mọi file và code symbol (lớp, hàm, biến) được đề cập.

## 2. MEMORY LOAD PROTOCOL (BẮT BUỘC)
Khi bắt đầu một phiên làm việc mới hoặc tiếp nhận yêu cầu, agent **BẮT BUỘC** tự động load các tài liệu sau theo thứ tự:
1. `AGENTS.md` — Quy tắc và thông tin dự án tổng quan.
2. `.agents/behavior-rules.md` (file này) — Quy tắc ứng xử và memory loading.
3. `rules.md` — Quy chuẩn code và thiết kế hệ thống.
4. `memory/episodic/lessons-learned.md` — Bài học kinh nghiệm từ bugs cũ.
5. `memory/episodic/decisions-log.md` — Nhật ký quyết định thiết kế/kiến trúc.
6. `memory/semantic/architecture-map.md` — Bản đồ kiến trúc.

## 3. CODE EDITING & SAFETY RULES
- **Surgical Changes**: Chỉ sửa đúng những dòng cần thiết. Không format lại file hoặc thay đổi code lân cận không liên quan.
- **Double Check Imports**: Loại bỏ mọi package imports không dùng tới do quá trình sửa đổi code gây ra.
- **Compile Check**: Luôn chạy lệnh Gradle compile check trước khi bàn giao cho người dùng:
  ```powershell
  $env:GRADLE_USER_HOME="$env:USERPROFILE\.gradle"; .\gradlew.bat :app:compileAppDebugKotlin
  ```
- **Error Handling**: Sử dụng Exception cụ thể, tránh dùng catch `Throwable` hoặc generic `Exception` trừ trường hợp bắt buộc. Dùng `runCatching` của Kotlin một cách cẩn thận.
- **No Placeholders**: Không viết code giả định hoặc comment `// TODO: Implement later`. Mọi code bổ sung phải hoàn chỉnh và hoạt động được.
