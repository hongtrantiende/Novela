package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bx0  reason: default package */
/* loaded from: classes3.dex */
public final class bx0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ lhd c;
    public final /* synthetic */ aw7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bx0(lhd lhdVar, aw7 aw7Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = lhdVar;
        this.d = aw7Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        aw7 aw7Var = this.d;
        lhd lhdVar = this.c;
        switch (i) {
            case 0:
                return new bx0(lhdVar, aw7Var, m42Var, 0);
            default:
                return new bx0(lhdVar, aw7Var, m42Var, 1);
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
                return ((bx0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((bx0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r3.p(r9) == r6) goto L35;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.a
            pvc r1 = defpackage.pvc.a
            aw7 r2 = r9.d
            lhd r3 = r9.c
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            n82 r6 = defpackage.n82.a
            r7 = 1
            switch(r0) {
                case 0: goto L5b;
                default: goto L11;
            }
        L11:
            int r0 = r9.b
            if (r0 == 0) goto L20
            if (r0 != r7) goto L1b
            defpackage.hre.r(r10)
            goto L5a
        L1b:
            defpackage.vs.k(r5)
            r1 = r4
            goto L5a
        L20:
            defpackage.hre.r(r10)
            java.lang.Object r10 = r2.getValue()
            lx0 r10 = (defpackage.lx0) r10
            boolean r10 = r10.c
            if (r10 == 0) goto L30
            java.lang.String r10 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36"
            goto L51
        L30:
            defpackage.l53.e()
            defpackage.l53.d()
            defpackage.l53.a()
            java.lang.String r10 = android.os.Build.VERSION.RELEASE
            r10.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Mozilla/5.0 (Linux; Android "
            r0.<init>(r2)
            r0.append(r10)
            java.lang.String r10 = "; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Mobile Safari/537.36"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
        L51:
            r9.b = r7
            java.lang.Object r9 = r3.c(r10, r9)
            if (r9 != r6) goto L5a
            r1 = r6
        L5a:
            return r1
        L5b:
            int r0 = r9.b
            r8 = 2
            if (r0 == 0) goto L71
            if (r0 == r7) goto L6d
            if (r0 != r8) goto L68
            defpackage.hre.r(r10)
            goto L95
        L68:
            defpackage.vs.k(r5)
            r1 = r4
            goto L9d
        L6d:
            defpackage.hre.r(r10)
            goto L9d
        L71:
            defpackage.hre.r(r10)
            hm8 r10 = r3.b
            java.lang.Object r10 = r10.getValue()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L8b
            r9.b = r7
            java.lang.Object r9 = r3.h(r9)
            if (r9 != r6) goto L9d
            goto L93
        L8b:
            r9.b = r8
            java.lang.Object r9 = r3.p(r9)
            if (r9 != r6) goto L95
        L93:
            r1 = r6
            goto L9d
        L95:
            r3.d()
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r2.setValue(r9)
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
