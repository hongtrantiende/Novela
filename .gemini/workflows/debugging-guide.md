---
name: debugging-guide
description: Hướng dẫn chi tiết quy trình debug có hệ thống, phân loại lỗi và cách đọc stack trace hiệu quả.
---

# Debugging Guide

## Mindset Debug đúng
Debug không phải là đoán mò — là điều tra có hệ thống. Mỗi lần debug là cơ hội hiểu sâu hơn về hệ thống.

## Framework 5 câu hỏi
1. **WHAT**: Lỗi gì? (mô tả chính xác triệu chứng)
2. **WHERE**: Lỗi ở đâu? (file, function, line)
3. **WHEN**: Khi nào xảy ra? (action nào trigger, điều kiện gì)
4. **WHY**: Tại sao xảy ra? (root cause)
5. **FIX**: Fix đúng chỗ hay đang patch symptom?

## Debug theo loại lỗi
- **Syntax Error**: Kiểm tra dấu ngoặc, dấu phẩy, dùng linter.
- **Runtime Error**: Đọc stack trace từ trên xuống, tìm file của mình, trace ngược dữ liệu.
- **Logic Error**: So sánh Expected vs Actual. Sử dụng binary search trên data flow và log từng bước.
- **Environment Error**: Kiểm tra version, dependencies, file permissions, port conflict.
- **Integration/API Error**: Kiểm tra Auth token, URL, Headers, và log Request/Response chi tiết.
