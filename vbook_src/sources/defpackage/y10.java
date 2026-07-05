package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y10  reason: default package */
/* loaded from: classes3.dex */
public final class y10 implements t10, e10, f10 {
    public final /* synthetic */ t10 a;
    public final /* synthetic */ t10 b;
    public final /* synthetic */ yl9 c;
    public final /* synthetic */ long d;

    public y10(t10 t10Var, yl9 yl9Var, long j) {
        this.b = t10Var;
        this.c = yl9Var;
        this.d = j;
        this.a = t10Var;
    }

    @Override // defpackage.y00
    public final Object a(n42 n42Var) {
        return this.a.a(n42Var);
    }

    @Override // defpackage.f10
    public final Object c(m42 m42Var) {
        return new Long(this.c.a);
    }

    @Override // defpackage.e10
    public final Object e(n42 n42Var) {
        return new Long(this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    @Override // defpackage.t10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(byte[] r5, int r6, int r7, defpackage.n42 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.x10
            if (r0 == 0) goto L13
            r0 = r8
            x10 r0 = (defpackage.x10) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            x10 r0 = new x10
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            y10 r4 = r0.a
            defpackage.hre.r(r8)
            goto L40
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r8)
            r0.a = r4
            r0.d = r2
            t10 r8 = r4.b
            java.lang.Object r8 = r8.g(r5, r6, r7, r0)
            n82 r5 = defpackage.n82.a
            if (r8 != r5) goto L40
            return r5
        L40:
            java.lang.Number r8 = (java.lang.Number) r8
            int r5 = r8.intValue()
            if (r5 < 0) goto L50
            yl9 r4 = r4.c
            long r6 = r4.a
            long r0 = (long) r5
            long r6 = r6 + r0
            r4.a = r6
        L50:
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y10.g(byte[], int, int, n42):java.lang.Object");
    }

    @Override // defpackage.e10
    public final Object h(n42 n42Var) {
        return vve.h(this, n42Var);
    }
}
