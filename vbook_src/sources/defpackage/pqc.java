package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pqc  reason: default package */
/* loaded from: classes3.dex */
public final class pqc extends aab implements lu4 {
    public long a;
    public long b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ tqc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqc(tqc tqcVar, m42 m42Var) {
        super(2, m42Var);
        this.f = tqcVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        pqc pqcVar = new pqc(this.f, m42Var);
        pqcVar.e = obj;
        return pqcVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((pqc) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
        if (defpackage.ade.r(r14, r19) == r9) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0068 -> B:17:0x006b). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            tqc r1 = r0.f
            a2c r2 = r1.e
            java.lang.Object r3 = r0.e
            m82 r3 = (defpackage.m82) r3
            int r4 = r0.d
            r5 = 0
            pvc r6 = defpackage.pvc.a
            r7 = 2
            r8 = 1
            n82 r9 = defpackage.n82.a
            if (r4 == 0) goto L2d
            if (r4 == r8) goto L23
            if (r4 != r7) goto L1d
            defpackage.hre.r(r20)
            return r6
        L1d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r0)
            return r5
        L23:
            long r10 = r0.b
            int r4 = r0.c
            long r12 = r0.a
            defpackage.hre.r(r20)
            goto L6b
        L2d:
            defpackage.hre.r(r20)
            yj1 r4 = defpackage.by5.a
            zx5 r4 = r4.k()
            long r10 = r4.b()
            r4 = r8
            r12 = r10
        L3c:
            boolean r10 = defpackage.k27.v(r3)
            if (r10 == 0) goto Lc2
            long r10 = (long) r4
            r14 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r14
            long r10 = r10 + r12
            yj1 r14 = defpackage.by5.a
            zx5 r14 = r14.k()
            long r14 = r14.b()
            long r10 = r10 - r14
            hq7 r14 = defpackage.wl3.b
            am3 r14 = defpackage.am3.MILLISECONDS
            long r14 = defpackage.jue.P(r10, r14)
            r0.e = r3
            r0.a = r12
            r0.c = r4
            r0.b = r10
            r0.d = r8
            java.lang.Object r14 = defpackage.ade.r(r14, r0)
            if (r14 != r9) goto L6b
            goto Lb8
        L6b:
            long r14 = r1.B
            r16 = -1
            long r14 = r14 + r16
            r1.B = r14
            npc r8 = r1.i
            cza r8 = r8.c
        L77:
            java.lang.Object r7 = r8.getValue()
            r18 = r7
            mpc r18 = (defpackage.mpc) r18
            r18.getClass()
            mpc r5 = new mpc
            r5.<init>(r14)
            boolean r5 = r8.l(r7, r5)
            if (r5 == 0) goto Lc0
            long r7 = r1.B
            r14 = 0
            int r5 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r5 != 0) goto Lb9
            r3 = r2
            i2c r3 = (defpackage.i2c) r3
            boolean r3 = r3.u()
            if (r3 == 0) goto La6
            i2c r2 = (defpackage.i2c) r2
            long r2 = r2.d()
            r1.B = r2
        La6:
            r5 = 0
            r0.e = r5
            r0.a = r12
            r0.c = r4
            r0.b = r10
            r7 = 2
            r0.d = r7
            java.lang.Object r0 = r1.l(r0)
            if (r0 != r9) goto Lc2
        Lb8:
            return r9
        Lb9:
            r5 = 0
            r7 = 2
            int r4 = r4 + 1
            r8 = 1
            goto L3c
        Lc0:
            r5 = 0
            goto L77
        Lc2:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
