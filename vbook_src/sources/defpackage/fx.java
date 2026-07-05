package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fx  reason: default package */
/* loaded from: classes3.dex */
public final class fx extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ tx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fx(tx txVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = txVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        tx txVar = this.c;
        switch (i) {
            case 0:
                return new fx(txVar, m42Var, 0);
            case 1:
                return new fx(txVar, m42Var, 1);
            default:
                return new fx(txVar, m42Var, 2);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((fx) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((fx) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((fx) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b9, code lost:
        if (r1 == r5) goto L42;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.a
            pvc r1 = defpackage.pvc.a
            tx r2 = r11.c
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            n82 r5 = defpackage.n82.a
            r6 = 1
            switch(r0) {
                case 0: goto L62;
                case 1: goto L2f;
                default: goto Lf;
            }
        Lf:
            int r0 = r11.b
            if (r0 == 0) goto L1e
            if (r0 != r6) goto L19
            defpackage.hre.r(r12)
            goto L2e
        L19:
            defpackage.vs.k(r4)
            r1 = r3
            goto L2e
        L1e:
            defpackage.hre.r(r12)
            sw r12 = r2.c
            r11.b = r6
            uw r12 = (defpackage.uw) r12
            java.lang.Object r11 = r12.a(r11)
            if (r11 != r5) goto L2e
            r1 = r5
        L2e:
            return r1
        L2f:
            int r0 = r11.b
            if (r0 == 0) goto L3e
            if (r0 != r6) goto L39
            defpackage.hre.r(r12)
            goto L4f
        L39:
            defpackage.vs.k(r4)
            r1 = r3
            goto L61
        L3e:
            defpackage.hre.r(r12)
            wxc r12 = r2.D
            r11.b = r6
            yxc r12 = (defpackage.yxc) r12
            java.io.Serializable r12 = r12.b(r11)
            if (r12 != r5) goto L4f
            r1 = r5
            goto L61
        L4f:
            java.util.List r12 = (java.util.List) r12
            boolean r11 = r12.isEmpty()
            if (r11 != 0) goto L61
            s02 r11 = r2.I
            ww r0 = new ww
            r0.<init>(r12)
            r2.h(r11, r0)
        L61:
            return r1
        L62:
            int r0 = r11.b
            r7 = 2
            if (r0 == 0) goto L78
            if (r0 == r6) goto L74
            if (r0 != r7) goto L6f
            defpackage.hre.r(r12)
            goto Lc8
        L6f:
            defpackage.vs.k(r4)
            r1 = r3
            goto Lc8
        L74:
            defpackage.hre.r(r12)
            goto Lbc
        L78:
            defpackage.hre.r(r12)
            wl6 r12 = r2.d
            r11.b = r6
            bn6 r12 = (defpackage.bn6) r12
            r12.getClass()
            yj1 r0 = defpackage.by5.a
            zx5 r0 = r0.k()
            long r3 = r0.b()
            r8 = 5184000000(0x134fd9000, double:2.561236308E-314)
            long r3 = r3 - r8
            ii2 r12 = r12.a
            lm2 r12 = r12.R
            java.lang.Object r0 = r12.a
            mm r0 = (defpackage.mm) r0
            r6 = -2069378697(0xffffffff84a7c977, float:-3.9446528E-36)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            th r9 = new th
            r10 = 8
            r9.<init>(r3, r10)
            java.lang.String r3 = "DELETE FROM DbReadHistory\nWHERE createAt < ?"
            r0.q(r8, r3, r9)
            yo2 r0 = new yo2
            r3 = 15
            r0.<init>(r3)
            r12.C(r6, r0)
            if (r1 != r5) goto Lbc
            goto Lc7
        Lbc:
            wxc r12 = r2.D
            r11.b = r7
            yxc r12 = (defpackage.yxc) r12
            r12.a()
            if (r1 != r5) goto Lc8
        Lc7:
            r1 = r5
        Lc8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fx.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
