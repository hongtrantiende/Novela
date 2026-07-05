package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mr4  reason: default package */
/* loaded from: classes3.dex */
public final class mr4 extends w68 {
    public final int c;
    public final int d;
    public final o89 e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public mr4(int r3, int r4, defpackage.o89 r5, java.lang.String r6) {
        /*
            r2 = this;
            r5.getClass()
            r6.getClass()
            r0 = 0
            if (r3 != r4) goto Le
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            goto Lf
        Le:
            r1 = r0
        Lf:
            r2.<init>(r1, r6)
            r2.c = r3
            r2.d = r4
            r2.e = r5
            r2 = 1
            java.lang.String r5 = " for field "
            if (r2 > r3) goto L38
            r2 = 10
            if (r3 >= r2) goto L38
            if (r3 > r4) goto L26
            if (r4 >= r2) goto L26
            return
        L26:
            java.lang.String r2 = "Invalid maximum length "
            java.lang.String r1 = ": expected "
            java.lang.StringBuilder r2 = defpackage.s21.r(r2, r4, r5, r6, r1)
            java.lang.String r4 = "..9"
            java.lang.String r2 = defpackage.rs8.g(r3, r4, r2)
            defpackage.p1a.k(r2)
            throw r0
        L38:
            java.lang.String r2 = "Invalid minimum length "
            java.lang.String r4 = ": expected 1..9"
            defpackage.vm1.f(r2, r3, r5, r6, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mr4.<init>(int, int, o89, java.lang.String):void");
    }

    @Override // defpackage.w68
    public final x68 a(int i, String str, Object obj, int i2) {
        int i3 = i2 - i;
        int i4 = this.c;
        if (i3 < i4) {
            return new r95(i4, 4);
        }
        int i5 = this.d;
        if (i3 > i5) {
            return new r95(i5, 5);
        }
        int i6 = 0;
        while (i < i2) {
            i6 = (i6 * 10) + (str.charAt(i) - '0');
            i++;
        }
        Object b = this.e.b(obj, new qq2(i6, i3));
        if (b == null) {
            return null;
        }
        return new fz5(b);
    }
}
