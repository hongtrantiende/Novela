package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f7c  reason: default package */
/* loaded from: classes3.dex */
public class f7c {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(f7c.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public ox3[] a;

    public final void a(ox3 ox3Var) {
        ox3Var.d((px3) this);
        ox3[] ox3VarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (ox3VarArr == null) {
            ox3VarArr = new ox3[4];
            this.a = ox3VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= ox3VarArr.length) {
            ox3VarArr = (ox3[]) Arrays.copyOf(ox3VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.a = ox3VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        ox3VarArr[i] = ox3Var;
        ox3Var.b = i;
        c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
        if (r6.compareTo(r7) < 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ox3 b(int r9) {
        /*
            r8 = this;
            ox3[] r0 = r8.a
            r0.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.f7c.b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            r4.getClass()
            r5 = r0[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            ox3[] r5 = r8.a
            r5.getClass()
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            r6.getClass()
            r7 = r5[r4]
            r7.getClass()
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            r4.getClass()
            r5 = r5[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            r9.getClass()
            r2 = 0
            r9.d(r2)
            r9.b = r3
            int r8 = r1.get(r8)
            r0[r8] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f7c.b(int):ox3");
    }

    public final void c(int i) {
        while (i > 0) {
            ox3[] ox3VarArr = this.a;
            ox3VarArr.getClass();
            int i2 = (i - 1) / 2;
            ox3 ox3Var = ox3VarArr[i2];
            ox3Var.getClass();
            ox3 ox3Var2 = ox3VarArr[i];
            ox3Var2.getClass();
            if (ox3Var.compareTo(ox3Var2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        ox3[] ox3VarArr = this.a;
        ox3VarArr.getClass();
        ox3 ox3Var = ox3VarArr[i2];
        ox3Var.getClass();
        ox3 ox3Var2 = ox3VarArr[i];
        ox3Var2.getClass();
        ox3VarArr[i] = ox3Var;
        ox3VarArr[i2] = ox3Var2;
        ox3Var.b = i;
        ox3Var2.b = i2;
    }
}
