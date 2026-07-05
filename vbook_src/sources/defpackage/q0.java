package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q0  reason: default package */
/* loaded from: classes.dex */
public final class q0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ yu7 c;
    public final /* synthetic */ l59 d;
    public final /* synthetic */ t0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(yu7 yu7Var, l59 l59Var, t0 t0Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = yu7Var;
        this.d = l59Var;
        this.e = t0Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new q0(this.c, this.d, this.e, m42Var, 0);
            default:
                return new q0(this.c, this.d, this.e, m42Var, 1);
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
                return ((q0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((q0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (defpackage.ade.q(r4, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r3.b(r9, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        if (defpackage.ade.q(r4, r10) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
        if (r3.b(r9, r10) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
        return r6;
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
            t0 r2 = r10.e
            yu7 r3 = r10.c
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            n82 r6 = defpackage.n82.a
            r7 = 1
            r8 = 2
            l59 r9 = r10.d
            switch(r0) {
                case 0: goto L44;
                default: goto L14;
            }
        L14:
            int r0 = r10.b
            if (r0 == 0) goto L29
            if (r0 == r7) goto L25
            if (r0 != r8) goto L20
            defpackage.hre.r(r11)
            goto L41
        L20:
            defpackage.vs.k(r5)
            r1 = r4
            goto L43
        L25:
            defpackage.hre.r(r11)
            goto L37
        L29:
            defpackage.hre.r(r11)
            long r4 = defpackage.aj1.a
            r10.b = r7
            java.lang.Object r11 = defpackage.ade.q(r4, r10)
            if (r11 != r6) goto L37
            goto L3f
        L37:
            r10.b = r8
            java.lang.Object r10 = r3.b(r9, r10)
            if (r10 != r6) goto L41
        L3f:
            r1 = r6
            goto L43
        L41:
            r2.Y = r9
        L43:
            return r1
        L44:
            int r0 = r10.b
            if (r0 == 0) goto L59
            if (r0 == r7) goto L55
            if (r0 != r8) goto L50
            defpackage.hre.r(r11)
            goto L71
        L50:
            defpackage.vs.k(r5)
            r1 = r4
            goto L73
        L55:
            defpackage.hre.r(r11)
            goto L67
        L59:
            defpackage.hre.r(r11)
            long r4 = defpackage.aj1.a
            r10.b = r7
            java.lang.Object r11 = defpackage.ade.q(r4, r10)
            if (r11 != r6) goto L67
            goto L6f
        L67:
            r10.b = r8
            java.lang.Object r10 = r3.b(r9, r10)
            if (r10 != r6) goto L71
        L6f:
            r1 = r6
            goto L73
        L71:
            r2.c0 = r9
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
