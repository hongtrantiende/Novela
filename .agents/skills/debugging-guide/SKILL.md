---
name: debugging-guide
description: Huong dan chi tiet quy trinh debug co he thong, phan loai loi va cach doc stack trace hieu qua.
---
# Debugging Guide
## Mindset Debug dung
Debug khong phai la doan mo - la dieu tra co he thong.
## Framework 5 cau hoi
1. WHAT: Loi gi? (mo ta chinh xac trieu chung)
2. WHERE: Loi o dau? (file, function, line)
3. WHEN: Khi nao xay ra? (action nao trigger, dieu kien gi)
4. WHY: Tai sao xay ra? (root cause)
5. FIX: Fix dung cho hay dang patch symptom?
## Debug theo loai loi
- Syntax Error: Kiem tra dau ngoac, dau phay, dung linter.
- Runtime Error: Doc stack trace tu tren xuong, tim file cua minh, trace nguoc du lieu.
- Logic Error: So sanh Expected vs Actual. Su dung binary search tren data flow.
- Environment Error: Kiem tra version, dependencies, file permissions, port conflict.
- Integration/API Error: Kiem tra Auth token, URL, Headers, va log Request/Response.
