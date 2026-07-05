package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o13  reason: default package */
/* loaded from: classes3.dex */
public final class o13 implements Iterator, j76 {
    public int a = -1;
    public int b;
    public int c;
    public ty5 d;
    public int e;
    public final /* synthetic */ p13 f;

    public o13(p13 p13Var) {
        this.f = p13Var;
        int n = dce.n(0, 0, p13Var.a.length());
        this.b = n;
        this.c = n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r7 < r4) goto L13;
     */
    /* JADX WARN: Type inference failed for: r0v7, types: [ty5, ry5] */
    /* JADX WARN: Type inference failed for: r0v8, types: [ty5, ry5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r8 = this;
            p13 r0 = r8.f
            java.lang.CharSequence r1 = r0.a
            int r2 = r8.c
            r3 = 0
            if (r2 >= 0) goto Lf
            r8.a = r3
            r0 = 0
            r8.d = r0
            return
        Lf:
            int r4 = r0.b
            r5 = -1
            r6 = 1
            if (r4 <= 0) goto L1c
            int r7 = r8.e
            int r7 = r7 + r6
            r8.e = r7
            if (r7 >= r4) goto L22
        L1c:
            int r4 = r1.length()
            if (r2 <= r4) goto L32
        L22:
            ty5 r0 = new ty5
            int r2 = r8.b
            int r1 = defpackage.k4b.b0(r1)
            r0.<init>(r2, r1, r6)
            r8.d = r0
            r8.c = r5
            goto L73
        L32:
            lu4 r0 = r0.c
            int r2 = r8.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.invoke(r1, r2)
            yk8 r0 = (defpackage.yk8) r0
            if (r0 != 0) goto L52
            ty5 r0 = new ty5
            int r2 = r8.b
            int r1 = defpackage.k4b.b0(r1)
            r0.<init>(r2, r1, r6)
            r8.d = r0
            r8.c = r5
            goto L73
        L52:
            java.lang.Object r1 = r0.a
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.b
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r2 = r8.b
            ty5 r2 = defpackage.dce.F(r2, r1)
            r8.d = r2
            int r1 = r1 + r0
            r8.b = r1
            if (r0 != 0) goto L70
            r3 = r6
        L70:
            int r1 = r1 + r3
            r8.c = r1
        L73:
            r8.a = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o13.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a == -1) {
            a();
        }
        if (this.a == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a == -1) {
            a();
        }
        if (this.a != 0) {
            ty5 ty5Var = this.d;
            ty5Var.getClass();
            this.d = null;
            this.a = -1;
            return ty5Var;
        }
        xk5.g();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
