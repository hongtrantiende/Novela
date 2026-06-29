---
name: ai-coding-workflow
description: >
  Quy trình làm việc chuẩn cho AI khi xử lý task kỹ thuật, debug, code, hoặc bất kỳ
  vấn đề nào cần giải quyết có hệ thống. Dùng skill này BẤT CỨ KHI NÀO người dùng
  giao task code, báo lỗi, yêu cầu sửa bug, xây dựng tính năng, refactor, review code.
---

# AI Coding & Problem-Solving Workflow

> **Triết lý cốt lõi**: Đọc kỹ → Hiểu đúng → Plan rõ → Làm chắc → Kiểm tra sạch.
> Không bao giờ làm ẩu. Không bỏ sót chi tiết. Không giả định không có căn cứ.

## PHASE 0 — Đọc & Tiếp nhận vấn đề
- **Đọc toàn bộ, không skip**: Đọc lại yêu cầu ít nhất 2 lần, chú ý context xung quanh.
- **Tóm tắt lại vấn đề**: Xác định rõ Input, Output mong muốn, Constraints, và những gì chưa rõ.
- **Quyết định**: Hỏi ngay nếu thiếu thông tin quan trọng; nêu assumption rõ ràng và tiếp tục nếu chỉ thiếu chi tiết nhỏ.

## PHASE 1 — Lập Kế Hoạch (Plan)
- **Phân rã vấn đề**: Chia nhỏ bài toán thành các task độc lập.
- **Xác định thứ tự**: Ưu tiên blocking dependencies trước, core logic trước, UI/polish sau.
- **Viết Plan rõ ràng**: Trình bày mục tiêu, các bước thực hiện cụ thể, assumptions và risks.
- **Checkpoint với user**: Nhất là với các task lớn hoặc có nhiều unknowns.

## PHASE 2 — Thực thi (Execute)
- **Nguyên tắc**: Làm từng bước một, đánh dấu progress, không nhảy cóc hoặc làm song song.
- **Viết code**: Ưu tiên readable > clever, đặt tên biến/hàm rõ nghĩa, xử lý lỗi đầy đủ, giải thích lý do (WHY) thay vì giải thích code làm gì (WHAT).
- **Khi gặp blocker**: Dừng lại, phân tích tầng lỗi (logic, syntax, runtime, env) và sửa gốc rễ thay vì sửa ngọn.

## PHASE 3 — Đọc & Xử lý Lỗi (Debug)
- **Quy trình đọc lỗi**: Đọc toàn bộ stack trace để xác định chính xác File, Line và Root cause message.
- **Phân loại**: Syntax, Runtime, Logic, Environment, Data, Integration.
- **Xử lý gốc rễ**: Không dùng các biện pháp che giấu/bịt lỗi tạm thời. Sửa đổi và chạy kiểm thử sau mỗi lượt thay đổi.

## PHASE 4 — Kiểm tra & Verify
- **Checklist verify**: Xác thực output, kiểm tra edge cases (null, empty), tránh lỗi regression, đảm bảo code maintainable.
- **Mức độ**: Chạy test cases thủ công cho task trung bình, viết unit tests cho task lớn.

## PHASE 5 — Báo cáo Kết quả
- **Format**: Trình bày tóm tắt công việc đã hoàn thành, các thay đổi chính (file/component nào, tại sao), hướng dẫn kiểm thử và các lưu ý tiếp theo.
- **Nguyên tắc**: Trung thực, không nói chung chung, chỉ rõ next steps.
