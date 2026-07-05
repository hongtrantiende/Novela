package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ik7  reason: default package */
/* loaded from: classes3.dex */
public final class ik7 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ atd c;
    public final /* synthetic */ aw7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ik7(atd atdVar, aw7 aw7Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = atdVar;
        this.d = aw7Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        aw7 aw7Var = this.d;
        atd atdVar = this.c;
        switch (i) {
            case 0:
                return new ik7(atdVar, aw7Var, m42Var, 0);
            default:
                return new ik7(atdVar, aw7Var, m42Var, 1);
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
                return ((ik7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((ik7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
        if (r6.c(r12) == r5) goto L20;
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
            aw7 r2 = r12.d
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            n82 r5 = defpackage.n82.a
            atd r6 = r12.c
            r7 = 1
            switch(r0) {
                case 0: goto L8d;
                default: goto L11;
            }
        L11:
            int r0 = r12.b
            r8 = 3
            r9 = 2
            if (r0 == 0) goto L2a
            if (r0 == r7) goto L26
            if (r0 == r9) goto L26
            if (r0 != r8) goto L21
            defpackage.hre.r(r13)
            goto L6a
        L21:
            defpackage.vs.k(r4)
            r1 = r3
            goto L8c
        L26:
            defpackage.hre.r(r13)
            goto L8c
        L2a:
            defpackage.hre.r(r13)
            boolean r13 = r6.k()
            if (r13 == 0) goto L45
            r12.b = r7
            c5d r13 = r6.g
            long r2 = r13.b()
            r13.d()
            java.lang.Object r12 = r6.d(r2, r12)
            if (r12 != r5) goto L8c
            goto L8b
        L45:
            float r13 = r6.e()
            float r13 = java.lang.Math.abs(r13)
            long r3 = r6.j()
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r10
            int r0 = (int) r3
            float r0 = (float) r0
            r3 = 1041865114(0x3e19999a, float:0.15)
            float r0 = r0 * r3
            int r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r13 <= 0) goto L74
            r12.b = r8
            java.lang.Object r12 = r6.c(r12)
            if (r12 != r5) goto L6a
            goto L8b
        L6a:
            java.lang.Object r12 = r2.getValue()
            vt4 r12 = (defpackage.vt4) r12
            r12.invoke()
            goto L8c
        L74:
            r12.b = r9
            r0 = r6
            float r6 = r0.e()
            ssd r9 = new ssd
            r9.<init>(r0, r7)
            r11 = 12
            r7 = 0
            r8 = 0
            r10 = r12
            java.lang.Object r12 = defpackage.ote.l(r6, r7, r8, r9, r10, r11)
            if (r12 != r5) goto L8c
        L8b:
            r1 = r5
        L8c:
            return r1
        L8d:
            r10 = r12
            r0 = r6
            int r12 = r10.b
            if (r12 == 0) goto L9e
            if (r12 != r7) goto L99
            defpackage.hre.r(r13)
            goto Lba
        L99:
            defpackage.vs.k(r4)
            r1 = r3
            goto Lba
        L9e:
            defpackage.hre.r(r13)
            hk7 r12 = new hk7
            r13 = 0
            r12.<init>(r0, r13)
            s02 r12 = defpackage.yae.G(r12)
            zr2 r13 = new zr2
            r0 = 6
            r13.<init>(r2, r0)
            r10.b = r7
            java.lang.Object r12 = r12.a(r13, r10)
            if (r12 != r5) goto Lba
            r1 = r5
        Lba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
