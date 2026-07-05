package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ug2  reason: default package */
/* loaded from: classes3.dex */
public final class ug2 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ gh2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ug2(gh2 gh2Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = gh2Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        gh2 gh2Var = this.c;
        switch (i) {
            case 0:
                return new ug2(gh2Var, m42Var, 0);
            case 1:
                return new ug2(gh2Var, m42Var, 1);
            default:
                return new ug2(gh2Var, m42Var, 2);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((ug2) create((tj4) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((ug2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((ug2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (defpackage.gh2.e(r7, r9) == r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r10 == r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
        if (r10 == r6) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
        return r6;
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
            r2 = -1
            r3 = 2
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            n82 r6 = defpackage.n82.a
            gh2 r7 = r9.c
            r8 = 1
            switch(r0) {
                case 0: goto L9f;
                case 1: goto L57;
                default: goto L11;
            }
        L11:
            fz4 r0 = r7.h
            int r1 = r9.b
            if (r1 == 0) goto L29
            if (r1 == r8) goto L23
            if (r1 != r3) goto L1f
            defpackage.hre.r(r10)
            goto L4d
        L1f:
            defpackage.vs.k(r5)
            goto L56
        L23:
            defpackage.hre.r(r10)     // Catch: java.lang.Throwable -> L27
            goto L42
        L27:
            r9 = move-exception
            goto L51
        L29:
            defpackage.hre.r(r10)
            xya r10 = r0.D()
            boolean r10 = r10 instanceof defpackage.gf4
            if (r10 == 0) goto L39
            xya r4 = r0.D()
            goto L56
        L39:
            r9.b = r8     // Catch: java.lang.Throwable -> L27
            java.lang.Object r10 = defpackage.gh2.e(r7, r9)     // Catch: java.lang.Throwable -> L27
            if (r10 != r6) goto L42
            goto L4b
        L42:
            r9.b = r3
            r10 = 0
            java.lang.Object r10 = defpackage.gh2.f(r7, r10, r9)
            if (r10 != r6) goto L4d
        L4b:
            r4 = r6
            goto L56
        L4d:
            r4 = r10
            xya r4 = (defpackage.xya) r4
            goto L56
        L51:
            mh9 r4 = new mh9
            r4.<init>(r2, r9)
        L56:
            return r4
        L57:
            int r0 = r9.b
            if (r0 == 0) goto L6c
            if (r0 == r8) goto L68
            if (r0 != r3) goto L63
            defpackage.hre.r(r10)
            goto L9e
        L63:
            defpackage.vs.k(r5)
            r1 = r4
            goto L9e
        L68:
            defpackage.hre.r(r10)
            goto L82
        L6c:
            defpackage.hre.r(r10)
            oaa r10 = r7.i
            r9.b = r8
            java.lang.Object r10 = r10.c
            bt1 r10 = (defpackage.bt1) r10
            java.lang.Object r10 = r10.r(r9)
            if (r10 != r6) goto L7e
            goto L7f
        L7e:
            r10 = r1
        L7f:
            if (r10 != r6) goto L82
            goto L9d
        L82:
            dz5 r10 = r7.h()
            sj4 r10 = r10.e()
            sj4 r10 = defpackage.z1d.r(r10, r2)
            bb r0 = new bb
            r2 = 12
            r0.<init>(r7, r2)
            r9.b = r3
            java.lang.Object r9 = r10.a(r0, r9)
            if (r9 != r6) goto L9e
        L9d:
            r1 = r6
        L9e:
            return r1
        L9f:
            int r0 = r9.b
            if (r0 == 0) goto Lae
            if (r0 != r8) goto La9
            defpackage.hre.r(r10)
            goto Lba
        La9:
            defpackage.vs.k(r5)
            r1 = r4
            goto Lba
        Lae:
            defpackage.hre.r(r10)
            r9.b = r8
            java.lang.Object r9 = defpackage.gh2.d(r7, r9)
            if (r9 != r6) goto Lba
            r1 = r6
        Lba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ug2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
