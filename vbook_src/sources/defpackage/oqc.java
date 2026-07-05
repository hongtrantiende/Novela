package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oqc  reason: default package */
/* loaded from: classes3.dex */
public final class oqc extends aab implements lu4 {
    public final /* synthetic */ int a;
    public tqc b;
    public int c;
    public final /* synthetic */ tqc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oqc(tqc tqcVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = tqcVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        tqc tqcVar = this.d;
        switch (i) {
            case 0:
                return new oqc(tqcVar, m42Var, 0);
            default:
                return new oqc(tqcVar, m42Var, 1);
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
                return ((oqc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((oqc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r10 == r6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ac, code lost:
        if (r10 == r6) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072 A[LOOP:0: B:26:0x006c->B:28:0x0072, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
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
            ks3 r2 = defpackage.ks3.a
            tqc r3 = r9.d
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            n82 r6 = defpackage.n82.a
            r7 = 1
            r8 = 2
            switch(r0) {
                case 0: goto L82;
                default: goto L12;
            }
        L12:
            int r0 = r9.c
            if (r0 == 0) goto L2b
            if (r0 == r7) goto L25
            if (r0 != r8) goto L20
            tqc r9 = r9.b
            defpackage.hre.r(r10)
            goto L4e
        L20:
            defpackage.vs.k(r5)
            r1 = r4
            goto L81
        L25:
            tqc r3 = r9.b
            defpackage.hre.r(r10)
            goto L3f
        L2b:
            defpackage.hre.r(r10)
            ixb r10 = r3.c
            java.lang.String r0 = r3.a
            r9.b = r3
            r9.c = r7
            pxb r10 = (defpackage.pxb) r10
            hs0 r10 = r10.b(r0)
            if (r10 != r6) goto L3f
            goto L4b
        L3f:
            sj4 r10 = (defpackage.sj4) r10
            r9.b = r3
            r9.c = r8
            java.lang.Object r10 = defpackage.z1d.E(r10, r9)
            if (r10 != r6) goto L4d
        L4b:
            r1 = r6
            goto L81
        L4d:
            r9 = r3
        L4e:
            java.util.List r10 = (java.util.List) r10
            if (r10 != 0) goto L53
            goto L54
        L53:
            r2 = r10
        L54:
            r10 = 10
            int r10 = defpackage.tl1.s(r2, r10)
            int r10 = defpackage.p17.k(r10)
            r0 = 16
            if (r10 >= r0) goto L63
            r10 = r0
        L63:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r10)
            java.util.Iterator r10 = r2.iterator()
        L6c:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L7f
            java.lang.Object r2 = r10.next()
            r3 = r2
            vac r3 = (defpackage.vac) r3
            java.lang.String r3 = r3.d
            r0.put(r3, r2)
            goto L6c
        L7f:
            r9.s = r0
        L81:
            return r1
        L82:
            int r0 = r9.c
            if (r0 == 0) goto L9b
            if (r0 == r7) goto L95
            if (r0 != r8) goto L90
            tqc r9 = r9.b
            defpackage.hre.r(r10)
            goto Lbe
        L90:
            defpackage.vs.k(r5)
            r1 = r4
            goto Lc6
        L95:
            tqc r3 = r9.b
            defpackage.hre.r(r10)
            goto Laf
        L9b:
            defpackage.hre.r(r10)
            ixb r10 = r3.c
            java.lang.String r0 = r3.a
            r9.b = r3
            r9.c = r7
            pxb r10 = (defpackage.pxb) r10
            hs0 r10 = r10.a(r0)
            if (r10 != r6) goto Laf
            goto Lbb
        Laf:
            sj4 r10 = (defpackage.sj4) r10
            r9.b = r3
            r9.c = r8
            java.lang.Object r10 = defpackage.z1d.E(r10, r9)
            if (r10 != r6) goto Lbd
        Lbb:
            r1 = r6
            goto Lc6
        Lbd:
            r9 = r3
        Lbe:
            java.util.List r10 = (java.util.List) r10
            if (r10 != 0) goto Lc3
            goto Lc4
        Lc3:
            r2 = r10
        Lc4:
            r9.r = r2
        Lc6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oqc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
