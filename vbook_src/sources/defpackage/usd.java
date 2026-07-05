package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: usd  reason: default package */
/* loaded from: classes3.dex */
public final class usd extends aab implements lu4 {
    public final /* synthetic */ float C;
    public final /* synthetic */ float D;
    public final /* synthetic */ long E;
    public float a;
    public long b;
    public int c;
    public final /* synthetic */ atd d;
    public final /* synthetic */ float e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usd(atd atdVar, float f, long j, float f2, float f3, long j2, m42 m42Var) {
        super(2, m42Var);
        this.d = atdVar;
        this.e = f;
        this.f = j;
        this.C = f2;
        this.D = f3;
        this.E = j2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new usd(this.d, this.e, this.f, this.C, this.D, this.E, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((usd) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
        if (r10.g(r9, r8) == r4) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
        if (r10.g(r9, r3) == r4) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
        return r4;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.c
            r1 = 2
            r2 = 1
            atd r3 = r9.d
            n82 r4 = defpackage.n82.a
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1a
            if (r0 != r1) goto L13
            defpackage.hre.r(r10)
            goto L89
        L13:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            r9 = 0
            return r9
        L1a:
            long r5 = r9.b
            float r0 = r9.a
            defpackage.hre.r(r10)
            goto L6a
        L22:
            defpackage.hre.r(r10)
            float r10 = r9.e
            r3.n(r10)
            r5 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            long r7 = r9.f
            boolean r0 = defpackage.y78.d(r7, r5)
            if (r0 != 0) goto L89
            r0 = 0
            float r5 = r9.C
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L42
            r10 = 1065353216(0x3f800000, float:1.0)
        L40:
            r0 = r10
            goto L47
        L42:
            float r0 = r9.D
            float r10 = r10 - r0
            float r10 = r10 / r5
            goto L40
        L47:
            long r5 = r9.E
            long r5 = defpackage.oue.E(r0, r5, r7)
            lq r10 = r3.i
            r7 = 32
            long r7 = r5 >> r7
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            r9.a = r0
            r9.b = r5
            r9.c = r2
            java.lang.Object r10 = r10.g(r9, r8)
            if (r10 != r4) goto L6a
            goto L88
        L6a:
            lq r10 = r3.j
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r5
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r2)
            r9.a = r0
            r9.b = r5
            r9.c = r1
            java.lang.Object r9 = r10.g(r9, r3)
            if (r9 != r4) goto L89
        L88:
            return r4
        L89:
            pvc r9 = defpackage.pvc.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
