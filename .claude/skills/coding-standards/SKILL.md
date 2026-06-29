---
name: coding-standards
description: Tieu chuan viet code sach, de doc va de bao tri cho cac du an phat trien phan mem.
---
# Coding Standards
## Nguyen tac cot loi
1. Readable > Clever: Code viet cho nguoi doc tiep theo.
2. Ten co y nghia: Boolean->is/has/can/should, Function->verb, Array->plural, Constant->UPPER_SNAKE_CASE.
3. Single Responsibility (SRP): Moi function lam dung 1 viec.
4. Error handling: Luon kiem tra tham so dau vao va xu ly ngoai le day du.
5. Comment giai thich WHY, khong phai WHAT.
## Cau truc Code
- Function signature: Ro rang ve kieu du lieu (types).
- Guard clauses (Early return): Dua cac kiem tra loi va return len dau ham.
- Constants: Su dung hang so thay the cho magic numbers/strings.
