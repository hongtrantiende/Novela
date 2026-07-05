package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ia0  reason: default package */
/* loaded from: classes.dex */
public final class ia0 extends aab implements lu4 {
    public final /* synthetic */ vt4 C;
    public final /* synthetic */ vt4 D;
    public final /* synthetic */ float E;
    public final /* synthetic */ xt4 F;
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ vt4 c;
    public final /* synthetic */ kj6 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ vt4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia0(boolean z, vt4 vt4Var, kj6 kj6Var, float f, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, float f2, xt4 xt4Var, m42 m42Var) {
        super(2, m42Var);
        this.b = z;
        this.c = vt4Var;
        this.d = kj6Var;
        this.e = f;
        this.f = vt4Var2;
        this.C = vt4Var3;
        this.D = vt4Var4;
        this.E = f2;
        this.F = xt4Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new ia0(this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((ia0) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0026 -> B:15:0x0029). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.a
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 != r1) goto Lb
            defpackage.hre.r(r9)
            goto L29
        Lb:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            r8 = 0
            return r8
        L12:
            defpackage.hre.r(r9)
            boolean r9 = r8.b
            if (r9 != 0) goto L1c
            pvc r8 = defpackage.pvc.a
            return r8
        L1c:
            r8.a = r1
            r2 = 16
            java.lang.Object r9 = defpackage.ade.q(r2, r8)
            n82 r0 = defpackage.n82.a
            if (r9 != r0) goto L29
            return r0
        L29:
            vt4 r9 = r8.c
            java.lang.Object r9 = r9.invoke()
            java.lang.Number r9 = (java.lang.Number) r9
            float r3 = r9.floatValue()
            kj6 r9 = r8.d
            fj6 r0 = r9.j()
            long r4 = r0.i()
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            int r0 = (int) r4
            float r0 = (float) r0
            r2 = 1069547520(0x3fc00000, float:1.5)
            float r2 = r2 * r0
            r4 = 1098907648(0x41800000, float:16.0)
            float r2 = r2 * r4
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 / r4
            r4 = 0
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 <= 0) goto L7a
            float r5 = r8.e
            int r6 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r6 > 0) goto L5c
            goto L7a
        L5c:
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r6 >= 0) goto L6c
            float r0 = r5 - r3
            float r0 = r0 / r5
            float r0 = defpackage.dce.m(r0, r4, r7)
            float r2 = -r2
            float r2 = r2 * r0
            goto L7b
        L6c:
            float r0 = r0 - r5
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 <= 0) goto L7a
            float r0 = r3 - r0
            float r0 = r0 / r5
            float r0 = defpackage.dce.m(r0, r4, r7)
            float r2 = r2 * r0
            goto L7b
        L7a:
            r2 = r4
        L7b:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L80
            goto L1c
        L80:
            r9.d(r2)
            vt4 r0 = r8.f
            java.lang.Object r0 = r0.invoke()
            so3 r0 = (defpackage.so3) r0
            fj6 r2 = r9.j()
            vt4 r9 = r8.C
            java.lang.Object r9 = r9.invoke()
            r4 = r9
            vi3 r4 = (defpackage.vi3) r4
            cj3 r5 = r0.d
            vt4 r9 = r8.D
            java.lang.Object r9 = r9.invoke()
            java.lang.Number r9 = (java.lang.Number) r9
            float r6 = r9.floatValue()
            float r7 = r8.E
            wi3 r9 = defpackage.bue.q(r2, r3, r4, r5, r6, r7)
            xt4 r0 = r8.F
            r0.invoke(r9)
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ia0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
