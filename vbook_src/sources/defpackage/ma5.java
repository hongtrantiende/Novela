package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ma5  reason: default package */
/* loaded from: classes.dex */
public final class ma5 extends mq7 implements c19 {
    public yu7 K;
    public ga5 L;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Type inference failed for: r5v3, types: [ez5, java.lang.Object, ga5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H1(defpackage.ma5 r4, defpackage.n42 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.ja5
            if (r0 == 0) goto L13
            r0 = r5
            ja5 r0 = (defpackage.ja5) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ja5 r0 = new ja5
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            ga5 r0 = r0.a
            defpackage.hre.r(r5)
            goto L4a
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r5)
            ga5 r5 = r4.L
            if (r5 != 0) goto L4c
            ga5 r5 = new ga5
            r5.<init>()
            yu7 r1 = r4.K
            r0.a = r5
            r0.d = r2
            java.lang.Object r0 = r1.b(r5, r0)
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto L49
            return r1
        L49:
            r0 = r5
        L4a:
            r4.L = r0
        L4c:
            pvc r4 = defpackage.pvc.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ma5.H1(ma5, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I1(defpackage.ma5 r4, defpackage.n42 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.ka5
            if (r0 == 0) goto L13
            r0 = r5
            ka5 r0 = (defpackage.ka5) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ka5 r0 = new ka5
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.hre.r(r5)
            goto L45
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r2
        L2c:
            defpackage.hre.r(r5)
            ga5 r5 = r4.L
            if (r5 == 0) goto L47
            ha5 r1 = new ha5
            r1.<init>(r5)
            yu7 r5 = r4.K
            r0.c = r3
            java.lang.Object r5 = r5.b(r1, r0)
            n82 r0 = defpackage.n82.a
            if (r5 != r0) goto L45
            return r0
        L45:
            r4.L = r2
        L47:
            pvc r4 = defpackage.pvc.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ma5.I1(ma5, n42):java.lang.Object");
    }

    @Override // defpackage.mq7
    public final void A1() {
        J1();
    }

    public final void J1() {
        ga5 ga5Var = this.L;
        if (ga5Var != null) {
            this.K.c(new ha5(ga5Var));
            this.L = null;
        }
    }

    @Override // defpackage.c19
    public final void b0(r09 r09Var, s09 s09Var, long j) {
        if (s09Var == s09.b) {
            int i = r09Var.f;
            if (i == 4) {
                z87.v(v1(), null, null, new la5(this, null, 0), 3);
            } else if (i == 5) {
                z87.v(v1(), null, null, new la5(this, null, 1), 3);
            }
        }
    }

    @Override // defpackage.c19
    public final void n0() {
        J1();
    }
}
