---
name: coding-standards
description: Tiêu chuẩn viết code sạch, dễ đọc và dễ bảo trì cho các dự án phát triển phần mềm.
---

# Coding Standards

## Nguyên tắc cốt lõi
1. **Readable > Clever**: Code viết cho người đọc tiếp theo, ưu tiên dễ hiểu hơn là ngắn gọn mà phức tạp.
2. **Tên có ý nghĩa**:
   - *Boolean*: prefix `is`, `has`, `can`, `should`.
   - *Function*: động từ (verb).
   - *Array*: danh từ số nhiều (plural).
   - *Constant*: UPPER_SNAKE_CASE.
3. **Single Responsibility (SRP)**: Mỗi function làm đúng 1 việc. Tách biệt các tác vụ độc lập.
4. **Error handling**: Luôn kiểm tra tham số đầu vào và xử lý ngoại lệ đầy đủ.
5. **Comment giải thích WHY, không phải WHAT**: Giải thích lý do thiết kế thay vì giải thích cú pháp dòng lệnh.

## Cấu trúc Code
- **Function signature**: Rõ ràng về kiểu dữ liệu (types).
- **Guard clauses (Early return)**: Đưa các kiểm tra lỗi và return lên đầu hàm, tránh nested `if` lồng nhau.
- **Constants**: Sử dụng hằng số thay thế cho magic numbers/strings.
