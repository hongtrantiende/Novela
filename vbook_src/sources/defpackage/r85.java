package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r85  reason: default package */
/* loaded from: classes.dex */
public final class r85 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ rj8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r85(int i, m42 m42Var, rj8 rj8Var) {
        super(2, m42Var);
        this.a = i;
        this.c = rj8Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new r85(0, m42Var, this.c);
            case 1:
                return new r85(1, m42Var, this.c);
            case 2:
                return new r85(2, m42Var, this.c);
            default:
                return new r85(3, m42Var, this.c);
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
                return ((r85) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((r85) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((r85) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((r85) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
        r7 = r2.f(r2.k() + 1, defpackage.tte.v(defpackage.nae.e, defpackage.nae.e, 7, null), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
        r7 = r2.f(r2.k() - 1, defpackage.tte.v(defpackage.nae.e, defpackage.nae.e, 7, null), r7);
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.a
            pvc r1 = defpackage.pvc.a
            rj8 r2 = r7.c
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            n82 r5 = defpackage.n82.a
            r6 = 1
            switch(r0) {
                case 0: goto L8d;
                case 1: goto L5f;
                case 2: goto L2d;
                default: goto Lf;
            }
        Lf:
            int r0 = r7.b
            if (r0 == 0) goto L1e
            if (r0 != r6) goto L19
            defpackage.hre.r(r8)
            goto L2c
        L19:
            defpackage.vs.k(r4)
            r1 = r3
            goto L2c
        L1e:
            defpackage.hre.r(r8)
            r7.b = r6
            jw7 r8 = defpackage.jw7.a
            java.lang.Object r7 = defpackage.jxe.q(r2, r8, r7)
            if (r7 != r5) goto L2c
            r1 = r5
        L2c:
            return r1
        L2d:
            int r0 = r7.b
            if (r0 == 0) goto L3c
            if (r0 != r6) goto L37
            defpackage.hre.r(r8)
            goto L5e
        L37:
            defpackage.vs.k(r4)
            r1 = r3
            goto L5e
        L3c:
            defpackage.hre.r(r8)
            r7.b = r6
            tj8 r8 = defpackage.uj8.a
            int r8 = r2.k()
            int r8 = r8 + r6
            int r0 = r2.n()
            if (r8 >= r0) goto L5a
            int r8 = r2.k()
            int r8 = r8 + r6
            java.lang.Object r7 = defpackage.rj8.g(r8, r7, r2)
            if (r7 != r5) goto L5a
            goto L5b
        L5a:
            r7 = r1
        L5b:
            if (r7 != r5) goto L5e
            r1 = r5
        L5e:
            return r1
        L5f:
            int r0 = r7.b
            if (r0 == 0) goto L6e
            if (r0 != r6) goto L69
            defpackage.hre.r(r8)
            goto L8c
        L69:
            defpackage.vs.k(r4)
            r1 = r3
            goto L8c
        L6e:
            defpackage.hre.r(r8)
            r7.b = r6
            tj8 r8 = defpackage.uj8.a
            int r8 = r2.k()
            int r8 = r8 - r6
            if (r8 < 0) goto L88
            int r8 = r2.k()
            int r8 = r8 - r6
            java.lang.Object r7 = defpackage.rj8.g(r8, r7, r2)
            if (r7 != r5) goto L88
            goto L89
        L88:
            r7 = r1
        L89:
            if (r7 != r5) goto L8c
            r1 = r5
        L8c:
            return r1
        L8d:
            int r0 = r7.b
            if (r0 == 0) goto L9c
            if (r0 != r6) goto L97
            defpackage.hre.r(r8)
            goto La9
        L97:
            defpackage.vs.k(r4)
            r1 = r3
            goto La9
        L9c:
            defpackage.hre.r(r8)
            r7.b = r6
            r8 = 2
            java.lang.Object r7 = defpackage.rj8.g(r8, r7, r2)
            if (r7 != r5) goto La9
            r1 = r5
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r85.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
