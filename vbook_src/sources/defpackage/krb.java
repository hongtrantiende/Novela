package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: krb  reason: default package */
/* loaded from: classes.dex */
public final class krb extends aab implements lu4 {
    public final /* synthetic */ rk9 C;
    public float a;
    public int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ lrb d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krb(float f, lrb lrbVar, boolean z, long j, rk9 rk9Var, m42 m42Var) {
        super(2, m42Var);
        this.c = f;
        this.d = lrbVar;
        this.e = z;
        this.f = j;
        this.C = rk9Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new krb(this.c, this.d, this.e, this.f, this.C, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((krb) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r9 == r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
        if (r9.a(r6, r8) == r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0090, code lost:
        return r5;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.b
            lrb r1 = r8.d
            r2 = 0
            r3 = 2
            r4 = 1
            n82 r5 = defpackage.n82.a
            if (r0 == 0) goto L21
            if (r0 == r4) goto L1b
            if (r0 != r3) goto L14
            defpackage.hre.r(r9)
            goto L91
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            r8 = 0
            return r8
        L1b:
            float r0 = r8.a
            defpackage.hre.r(r9)
            goto L52
        L21:
            defpackage.hre.r(r9)
            float r9 = r8.c
            boolean r0 = java.lang.Float.isNaN(r9)
            if (r0 != 0) goto L3d
            boolean r0 = java.lang.Float.isInfinite(r9)
            if (r0 == 0) goto L33
            goto L3d
        L33:
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 <= 0) goto L3f
            double r6 = (double) r9
            double r6 = java.lang.Math.ceil(r6)
        L3c:
            float r9 = (float) r6
        L3d:
            r0 = r9
            goto L45
        L3f:
            double r6 = (double) r9
            double r6 = java.lang.Math.floor(r6)
            goto L3c
        L45:
            k2a r9 = r1.T
            r8.a = r0
            r8.b = r4
            java.lang.Object r9 = defpackage.jxe.p(r9, r0, r8)
            if (r9 != r5) goto L52
            goto L90
        L52:
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            boolean r4 = r8.e
            if (r4 == 0) goto L91
            long r6 = r8.f
            boolean r4 = defpackage.fxb.d(r6)
            rk9 r6 = r8.C
            if (r4 == 0) goto L84
            float r4 = r6.c
            float r7 = r6.a
            float r4 = r4 - r7
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 > 0) goto L84
            float r0 = r0 - r9
            float r9 = java.lang.Math.abs(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 >= 0) goto L7b
            goto L84
        L7b:
            float r9 = r6.c
            float r9 = r9 + r0
            r0 = 11
            rk9 r6 = defpackage.rk9.b(r6, r2, r9, r2, r0)
        L84:
            hvb r9 = r1.O
            zu0 r9 = r9.h
            r8.b = r3
            java.lang.Object r8 = r9.a(r6, r8)
            if (r8 != r5) goto L91
        L90:
            return r5
        L91:
            pvc r8 = defpackage.pvc.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.krb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
