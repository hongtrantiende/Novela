package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pi7  reason: default package */
/* loaded from: classes3.dex */
public final class pi7 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ kj6 c;
    public final /* synthetic */ aw7 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ aw7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pi7(kj6 kj6Var, aw7 aw7Var, String str, aw7 aw7Var2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = kj6Var;
        this.d = aw7Var;
        this.e = str;
        this.f = aw7Var2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new pi7(this.c, this.d, this.e, this.f, m42Var, 0);
            default:
                return new pi7(this.c, this.d, this.e, this.f, m42Var, 1);
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
                return ((pi7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((pi7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r13 == r8) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (r13 == r8) goto L36;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.a
            pvc r1 = defpackage.pvc.a
            kj6 r2 = r12.c
            r3 = -1
            aw7 r4 = r12.f
            java.lang.String r5 = r12.e
            aw7 r6 = r12.d
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            n82 r8 = defpackage.n82.a
            r9 = 2
            r10 = 1
            r11 = 0
            switch(r0) {
                case 0: goto L58;
                default: goto L17;
            }
        L17:
            int r0 = r12.b
            if (r0 == 0) goto L2c
            if (r0 == r10) goto L28
            if (r0 != r9) goto L23
            defpackage.hre.r(r13)
            goto L57
        L23:
            defpackage.vs.k(r7)
            r1 = r11
            goto L57
        L28:
            defpackage.hre.r(r13)
            goto L3f
        L2c:
            defpackage.hre.r(r13)
            sw2 r13 = defpackage.ab3.a
            oi7 r0 = new oi7
            r0.<init>(r6, r5, r11, r10)
            r12.b = r10
            java.lang.Object r13 = defpackage.z87.E(r13, r0, r12)
            if (r13 != r8) goto L3f
            goto L56
        L3f:
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r4.setValue(r0)
            if (r13 == r3) goto L57
            r12.b = r9
            java.lang.Object r12 = defpackage.kqe.x(r2, r13, r12)
            if (r12 != r8) goto L57
        L56:
            r1 = r8
        L57:
            return r1
        L58:
            int r0 = r12.b
            if (r0 == 0) goto L6d
            if (r0 == r10) goto L69
            if (r0 != r9) goto L64
            defpackage.hre.r(r13)
            goto L99
        L64:
            defpackage.vs.k(r7)
            r1 = r11
            goto L99
        L69:
            defpackage.hre.r(r13)
            goto L81
        L6d:
            defpackage.hre.r(r13)
            sw2 r13 = defpackage.ab3.a
            oi7 r0 = new oi7
            r7 = 0
            r0.<init>(r6, r5, r11, r7)
            r12.b = r10
            java.lang.Object r13 = defpackage.z87.E(r13, r0, r12)
            if (r13 != r8) goto L81
            goto L98
        L81:
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r4.setValue(r0)
            if (r13 == r3) goto L99
            r12.b = r9
            java.lang.Object r12 = defpackage.kqe.x(r2, r13, r12)
            if (r12 != r8) goto L99
        L98:
            r1 = r8
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
