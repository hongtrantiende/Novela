package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r73  reason: default package */
/* loaded from: classes3.dex */
public final class r73 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ u73 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r73(u73 u73Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = u73Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        u73 u73Var = this.c;
        switch (i) {
            case 0:
                return new r73(u73Var, m42Var, 0);
            default:
                return new r73(u73Var, m42Var, 1);
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
                return ((r73) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((r73) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.a
            pvc r1 = defpackage.pvc.a
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            n82 r3 = defpackage.n82.a
            r4 = 1
            u73 r5 = r13.c
            r6 = 0
            switch(r0) {
                case 0: goto L51;
                default: goto Lf;
            }
        Lf:
            int r0 = r13.b
            if (r0 == 0) goto L1e
            if (r0 != r4) goto L19
            defpackage.hre.r(r14)
            goto L50
        L19:
            defpackage.vs.k(r2)
            r1 = r6
            goto L50
        L1e:
            defpackage.hre.r(r14)
            cza r14 = r5.W
            java.lang.Object r14 = r14.getValue()
            f34 r14 = (defpackage.f34) r14
            if (r14 == 0) goto L50
            cza r0 = r5.U
            if (r0 == 0) goto L47
        L2f:
            java.lang.Object r2 = r0.getValue()
            r6 = r2
            p73 r6 = (defpackage.p73) r6
            r11 = 0
            r12 = 62
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            p73 r6 = defpackage.p73.a(r6, r7, r8, r9, r10, r11, r12)
            boolean r2 = r0.l(r2, r6)
            if (r2 == 0) goto L2f
        L47:
            r13.b = r4
            java.lang.Object r13 = defpackage.u73.D(r5, r14, r13)
            if (r13 != r3) goto L50
            r1 = r3
        L50:
            return r1
        L51:
            int r0 = r13.b
            if (r0 == 0) goto L60
            if (r0 != r4) goto L5b
            defpackage.hre.r(r14)
            goto L88
        L5b:
            defpackage.vs.k(r2)
            r1 = r6
            goto L88
        L60:
            defpackage.hre.r(r14)
            n64 r14 = r5.R
            c74 r14 = (defpackage.c74) r14
            cza r14 = r14.e
            mx r0 = new mx
            r2 = 4
            r0.<init>(r14, r2)
            wa r14 = new wa
            r14.<init>(r6, r5, r2)
            eb1 r14 = defpackage.z1d.N(r0, r14)
            bb r0 = new bb
            r2 = 13
            r0.<init>(r5, r2)
            r13.b = r4
            java.lang.Object r13 = r14.a(r0, r13)
            if (r13 != r3) goto L88
            r1 = r3
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r73.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
