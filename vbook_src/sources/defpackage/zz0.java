package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zz0  reason: default package */
/* loaded from: classes.dex */
public final class zz0 extends aab implements lu4 {
    public int a;
    public final /* synthetic */ lq b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ a01 e;
    public final /* synthetic */ ez5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz0(lq lqVar, float f, boolean z, a01 a01Var, ez5 ez5Var, m42 m42Var) {
        super(2, m42Var);
        this.b = lqVar;
        this.c = f;
        this.d = z;
        this.e = a01Var;
        this.f = ez5Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new zz0(this.b, this.c, this.d, this.e, this.f, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((zz0) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r9.g(r8, r0) == r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
        if (defpackage.ip3.a(r9, r4, r1, r8.f, r8) == r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
        return r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.a
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L16
            if (r0 == r3) goto L12
            if (r0 != r2) goto Lc
            goto L12
        Lc:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r1
        L12:
            defpackage.hre.r(r9)
            goto L80
        L16:
            defpackage.hre.r(r9)
            lq r9 = r8.b
            hm8 r0 = r9.e
            java.lang.Object r0 = r0.getValue()
            rg3 r0 = (defpackage.rg3) r0
            float r0 = r0.a
            float r4 = r8.c
            boolean r0 = defpackage.rg3.b(r0, r4)
            if (r0 != 0) goto L80
            boolean r0 = r8.d
            n82 r5 = defpackage.n82.a
            if (r0 != 0) goto L41
            rg3 r0 = new rg3
            r0.<init>(r4)
            r8.a = r3
            java.lang.Object r8 = r9.g(r8, r0)
            if (r8 != r5) goto L80
            goto L7f
        L41:
            hm8 r0 = r9.e
            java.lang.Object r0 = r0.getValue()
            rg3 r0 = (defpackage.rg3) r0
            float r0 = r0.a
            r3 = 0
            boolean r6 = defpackage.rg3.b(r0, r3)
            if (r6 == 0) goto L5a
            l59 r1 = new l59
            r6 = 0
            r1.<init>(r6)
            goto L75
        L5a:
            a01 r6 = r8.e
            float r6 = r6.a
            boolean r6 = defpackage.rg3.b(r0, r6)
            if (r6 == 0) goto L6a
            ga5 r1 = new ga5
            r1.<init>()
            goto L75
        L6a:
            boolean r0 = defpackage.rg3.b(r0, r3)
            if (r0 == 0) goto L75
            jm4 r1 = new jm4
            r1.<init>()
        L75:
            r8.a = r2
            ez5 r0 = r8.f
            java.lang.Object r8 = defpackage.ip3.a(r9, r4, r1, r0, r8)
            if (r8 != r5) goto L80
        L7f:
            return r5
        L80:
            pvc r8 = defpackage.pvc.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
