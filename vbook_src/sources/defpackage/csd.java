package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: csd  reason: default package */
/* loaded from: classes.dex */
public final class csd extends fs9 implements lu4 {
    public final /* synthetic */ int b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ t3c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ csd(t3c t3cVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.b = i;
        this.e = t3cVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.b;
        t3c t3cVar = this.e;
        switch (i) {
            case 0:
                csd csdVar = new csd(t3cVar, m42Var, 0);
                csdVar.d = obj;
                return csdVar;
            default:
                csd csdVar2 = new csd(t3cVar, m42Var, 1);
                csdVar2.d = obj;
                return csdVar2;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        pvc pvcVar = pvc.a;
        gab gabVar = (gab) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((csd) create(gabVar, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((csd) create(gabVar, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        if (r15 == r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
        if (r15 == r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
        if (r0.t(r11, r15, r14) == r4) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.b
            pvc r1 = defpackage.pvc.a
            t3c r2 = r14.e
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            n82 r4 = defpackage.n82.a
            r5 = 1
            r6 = 0
            switch(r0) {
                case 0: goto L9d;
                default: goto Lf;
            }
        Lf:
            java.lang.Object r0 = r14.d
            gab r0 = (defpackage.gab) r0
            int r7 = r14.c
            r8 = 0
            r9 = 3
            r10 = 4
            r11 = 2
            if (r7 == 0) goto L3a
            if (r7 == r5) goto L36
            if (r7 == r11) goto L32
            if (r7 == r9) goto L2e
            if (r7 != r10) goto L28
            defpackage.hre.r(r15)     // Catch: defpackage.t09 -> L9c
            goto L9c
        L28:
            defpackage.vs.k(r3)
            r1 = r6
            goto L9c
        L2e:
            defpackage.hre.r(r15)
            goto L80
        L32:
            defpackage.hre.r(r15)     // Catch: defpackage.t09 -> L65
            goto L62
        L36:
            defpackage.hre.r(r15)
            goto L48
        L3a:
            defpackage.hre.r(r15)
            r14.d = r0
            r14.c = r5
            java.lang.Object r15 = defpackage.ukb.b(r0, r8, r14, r9)
            if (r15 != r4) goto L48
            goto L9b
        L48:
            z09 r15 = (defpackage.z09) r15
            ucd r15 = r0.p()     // Catch: defpackage.t09 -> L65
            long r12 = r15.b()     // Catch: defpackage.t09 -> L65
            u29 r15 = new u29     // Catch: defpackage.t09 -> L65
            r15.<init>(r11, r5, r6)     // Catch: defpackage.t09 -> L65
            r14.d = r0     // Catch: defpackage.t09 -> L65
            r14.c = r11     // Catch: defpackage.t09 -> L65
            java.lang.Object r15 = r0.t(r12, r15, r14)     // Catch: defpackage.t09 -> L65
            if (r15 != r4) goto L62
            goto L9b
        L62:
            z09 r15 = (defpackage.z09) r15     // Catch: defpackage.t09 -> L65
            goto L66
        L65:
            r15 = r6
        L66:
            if (r15 == 0) goto L9c
            r14.d = r0
            r14.c = r9
            ucd r3 = r0.p()
            long r11 = r3.a()
            ix4 r3 = new ix4
            r3.<init>(r15, r6, r9)
            java.lang.Object r15 = r0.z(r11, r3, r14)
            if (r15 != r4) goto L80
            goto L9b
        L80:
            z09 r15 = (defpackage.z09) r15
            if (r15 == 0) goto L9c
            ucd r15 = r0.p()     // Catch: defpackage.t09 -> L9c
            long r11 = r15.b()     // Catch: defpackage.t09 -> L9c
            csd r15 = new csd     // Catch: defpackage.t09 -> L9c
            r15.<init>(r2, r6, r8)     // Catch: defpackage.t09 -> L9c
            r14.d = r6     // Catch: defpackage.t09 -> L9c
            r14.c = r10     // Catch: defpackage.t09 -> L9c
            java.lang.Object r14 = r0.t(r11, r15, r14)     // Catch: defpackage.t09 -> L9c
            if (r14 != r4) goto L9c
        L9b:
            r1 = r4
        L9c:
            return r1
        L9d:
            java.lang.Object r0 = r14.d
            gab r0 = (defpackage.gab) r0
            int r7 = r14.c
            if (r7 == 0) goto Lb0
            if (r7 != r5) goto Lab
            defpackage.hre.r(r15)
            goto Lc1
        Lab:
            defpackage.vs.k(r3)
            r1 = r6
            goto Lcf
        Lb0:
            defpackage.hre.r(r15)
            r14.d = r6
            r14.c = r5
            s09 r15 = defpackage.s09.b
            java.lang.Object r15 = defpackage.ukb.j(r0, r15, r14)
            if (r15 != r4) goto Lc1
            r1 = r4
            goto Lcf
        Lc1:
            z09 r15 = (defpackage.z09) r15
            if (r15 == 0) goto Lcf
            long r14 = r15.c
            y78 r0 = new y78
            r0.<init>(r14)
            r2.invoke(r0)
        Lcf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
