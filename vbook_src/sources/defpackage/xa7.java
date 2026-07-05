package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xa7  reason: default package */
/* loaded from: classes3.dex */
public final class xa7 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ lq c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xa7(lq lqVar, float f, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = lqVar;
        this.d = f;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new xa7(this.c, this.d, m42Var, 0);
            default:
                return new xa7(this.c, this.d, m42Var, 1);
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
                return ((xa7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((xa7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
        if (defpackage.lq.c(r11.c, r0, r2, null, null, r11, 12) == r8) goto L15;
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
            pvc r7 = defpackage.pvc.a
            float r1 = r11.d
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            n82 r8 = defpackage.n82.a
            r3 = 1
            r9 = 0
            switch(r0) {
                case 0: goto L64;
                default: goto Lf;
            }
        Lf:
            int r0 = r11.b
            r10 = 2
            if (r0 == 0) goto L25
            if (r0 == r3) goto L21
            if (r0 != r10) goto L1c
            defpackage.hre.r(r12)
            goto L63
        L1c:
            defpackage.vs.k(r2)
            r7 = r9
            goto L63
        L21:
            defpackage.hre.r(r12)
            goto L44
        L25:
            defpackage.hre.r(r12)
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r1)
            r1 = 6
            r2 = 0
            arc r2 = defpackage.tte.x(r2, r2, r9, r1)
            r11.b = r3
            r1 = r0
            lq r0 = r11.c
            r3 = 0
            r4 = 0
            r6 = 12
            r5 = r11
            java.lang.Object r0 = defpackage.lq.c(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto L44
            goto L62
        L44:
            java.lang.Float r1 = new java.lang.Float
            r0 = 0
            r1.<init>(r0)
            r0 = 1128792064(0x43480000, float:200.0)
            r2 = 4
            r3 = 1056964608(0x3f000000, float:0.5)
            gxa r2 = defpackage.tte.v(r3, r0, r2, r9)
            r11.b = r10
            lq r0 = r11.c
            r3 = 0
            r4 = 0
            r6 = 12
            r5 = r11
            java.lang.Object r0 = defpackage.lq.c(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto L63
        L62:
            r7 = r8
        L63:
            return r7
        L64:
            int r0 = r11.b
            if (r0 == 0) goto L73
            if (r0 != r3) goto L6e
            defpackage.hre.r(r12)
            goto L86
        L6e:
            defpackage.vs.k(r2)
            r7 = r9
            goto L86
        L73:
            defpackage.hre.r(r12)
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r1)
            r11.b = r3
            lq r1 = r11.c
            java.lang.Object r0 = r1.g(r11, r0)
            if (r0 != r8) goto L86
            r7 = r8
        L86:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
