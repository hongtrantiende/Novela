package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yr9  reason: default package */
/* loaded from: classes3.dex */
public final class yr9 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ lu4 d;
    public final /* synthetic */ oh5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yr9(lu4 lu4Var, oh5 oh5Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = lu4Var;
        this.e = oh5Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                yr9 yr9Var = new yr9(this.d, this.e, m42Var, 0);
                yr9Var.c = obj;
                return yr9Var;
            default:
                yr9 yr9Var2 = new yr9(this.d, this.e, m42Var, 1);
                yr9Var2.c = obj;
                return yr9Var2;
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
                return ((yr9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((yr9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r2.invoke(r6, r10) == r4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r11 == r4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        return r4;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.a
            pvc r1 = defpackage.pvc.a
            lu4 r2 = r10.d
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            n82 r4 = defpackage.n82.a
            r5 = 1
            oh5 r6 = r10.e
            r7 = 0
            switch(r0) {
                case 0: goto L5a;
                default: goto L11;
            }
        L11:
            java.lang.Object r0 = r10.c
            m82 r0 = (defpackage.m82) r0
            int r8 = r10.b
            r9 = 2
            if (r8 == 0) goto L2b
            if (r8 == r5) goto L27
            if (r8 != r9) goto L22
            defpackage.hre.r(r11)     // Catch: java.lang.Throwable -> L59
            goto L4e
        L22:
            defpackage.vs.k(r3)
            r1 = r7
            goto L59
        L27:
            defpackage.hre.r(r11)     // Catch: java.lang.Throwable -> L39
            goto L39
        L2b:
            defpackage.hre.r(r11)
            r10.c = r0     // Catch: java.lang.Throwable -> L39
            r10.b = r5     // Catch: java.lang.Throwable -> L39
            java.lang.Object r11 = r2.invoke(r6, r10)     // Catch: java.lang.Throwable -> L39
            if (r11 != r4) goto L39
            goto L4c
        L39:
            s11 r11 = r6.b()     // Catch: java.lang.Throwable -> L59
            r10.c = r7     // Catch: java.lang.Throwable -> L59
            r10.b = r9     // Catch: java.lang.Throwable -> L59
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r11 = defpackage.v9e.t(r11, r2, r10)     // Catch: java.lang.Throwable -> L59
            if (r11 != r4) goto L4e
        L4c:
            r1 = r4
            goto L59
        L4e:
            java.lang.Number r11 = (java.lang.Number) r11     // Catch: java.lang.Throwable -> L59
            long r10 = r11.longValue()     // Catch: java.lang.Throwable -> L59
            java.lang.Long r0 = new java.lang.Long     // Catch: java.lang.Throwable -> L59
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L59
        L59:
            return r1
        L5a:
            java.lang.Object r0 = r10.c
            m82 r0 = (defpackage.m82) r0
            int r0 = r10.b
            if (r0 == 0) goto L6d
            if (r0 != r5) goto L68
            defpackage.hre.r(r11)     // Catch: java.lang.Throwable -> L7b
            goto L81
        L68:
            defpackage.vs.k(r3)
            r4 = r7
            goto L86
        L6d:
            defpackage.hre.r(r11)
            r10.c = r7     // Catch: java.lang.Throwable -> L7b
            r10.b = r5     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r10 = r2.invoke(r6, r10)     // Catch: java.lang.Throwable -> L7b
            if (r10 != r4) goto L81
            goto L86
        L7b:
            r10 = move-exception
            gs9 r1 = new gs9
            r1.<init>(r10)
        L81:
            hs9 r4 = new hs9
            r4.<init>(r1)
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yr9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
