package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: za2  reason: default package */
/* loaded from: classes3.dex */
public final class za2 implements t10 {
    public final t10 a;
    public int b;

    public za2(t10 t10Var) {
        int[] iArr = q41.a;
        t10Var.getClass();
        this.a = t10Var;
        this.b = 0;
    }

    @Override // defpackage.y00
    public final Object a(n42 n42Var) {
        return this.a.a(n42Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    @Override // defpackage.t10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(byte[] r5, int r6, int r7, defpackage.n42 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.ya2
            if (r0 == 0) goto L13
            r0 = r8
            ya2 r0 = (defpackage.ya2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ya2 r0 = new ya2
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            int r6 = r0.b
            byte[] r5 = r0.a
            defpackage.hre.r(r8)
            goto L44
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L30:
            defpackage.hre.r(r8)
            r0.a = r5
            r0.b = r6
            r0.e = r2
            t10 r8 = r4.a
            java.lang.Object r8 = r8.g(r5, r6, r7, r0)
            n82 r7 = defpackage.n82.a
            if (r8 != r7) goto L44
            return r7
        L44:
            java.lang.Number r8 = (java.lang.Number) r8
            int r7 = r8.intValue()
            if (r7 <= 0) goto L6c
            int[] r8 = defpackage.q41.a
            int r8 = r4.b
            r5.getClass()
            int r8 = ~r8
            int[] r0 = defpackage.q41.a
            int r1 = r6 + r7
        L58:
            if (r6 >= r1) goto L69
            r2 = r5[r6]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 ^ r8
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r0[r2]
            int r8 = r8 >>> 8
            r8 = r8 ^ r2
            int r6 = r6 + 1
            goto L58
        L69:
            int r5 = ~r8
            r4.b = r5
        L6c:
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za2.g(byte[], int, int, n42):java.lang.Object");
    }
}
