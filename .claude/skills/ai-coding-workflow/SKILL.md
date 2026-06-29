---
name: ai-coding-workflow
description: >
  Quy trinh lam viec chuan cho AI khi xu ly task ky thuat, debug, code, hoac bat ky
  van de nao can giai quyet co he thong.
---

# AI Coding & Problem-Solving Workflow

## PHASE 0 - Doc & Tiep nhan van de
- Doc ky yeu cau it nhat 2 lan, chu y context xung quanh.
- Xac dinh ro: Input / Output mong muon / Constraints / Unknowns.

## PHASE 1 - Lap Ke Hoach (Plan)
- Phan ra bai toan thanh cac task nho doc lap, uu tien blocking dependencies truoc.
- Checkpoint voi user neu la task lon.

## PHASE 2 - Thuc thi (Execute)
- Lam tung buoc mot, danh dau progress, khong nhay coc.
- Viet code: Readable > Clever, dat ten tu giai thich, xu ly edge cases day du.

## PHASE 3 - Debug he thong
- Framework 5 cau hoi: WHAT -> WHERE -> WHEN -> WHY -> FIX (sua goc re).
- Doc toan bo stack trace tu tren xuong, tim file cua minh, trace nguoc data flow.

## PHASE 4 - Kiem tra & Bao cao
- Verify output, test edge cases (null, empty, bounds) truoc khi ban giao.
- Bao cao: Da lam gi, Thay doi files nao, Cach test, Luu y.
