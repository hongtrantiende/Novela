package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j5c  reason: default package */
/* loaded from: classes3.dex */
public final class j5c extends aab implements lu4 {
    public int a;
    public final /* synthetic */ y5c b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5c(float f, int i, m42 m42Var, y5c y5cVar) {
        super(2, m42Var);
        this.b = y5cVar;
        this.c = i;
        this.d = f;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new j5c(this.d, this.c, m42Var, this.b);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((j5c) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r7.F0(r3, false, r11) != r8) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (r12 == r8) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
        if (defpackage.y5c.L(r7, r0, r0, r11) != r8) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
        return r8;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.a
            r1 = 0
            r2 = 0
            int r3 = r11.c
            r4 = 3
            r5 = 1
            r6 = 2
            y5c r7 = r11.b
            n82 r8 = defpackage.n82.a
            if (r0 == 0) goto L28
            if (r0 == r5) goto L24
            if (r0 == r6) goto L20
            if (r0 != r4) goto L1a
            defpackage.hre.r(r12)
            goto L93
        L1a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r11)
            return r1
        L20:
            defpackage.hre.r(r12)
            goto L5f
        L24:
            defpackage.hre.r(r12)
            goto L4d
        L28:
            defpackage.hre.r(r12)
            defpackage.y5c.R(r7)
            cza r12 = r7.v0
            if (r12 == 0) goto L44
        L32:
            java.lang.Object r0 = r12.getValue()
            r9 = r0
            cnb r9 = (defpackage.cnb) r9
            r10 = 6
            cnb r9 = defpackage.cnb.a(r9, r3, r1, r2, r10)
            boolean r0 = r12.l(r0, r9)
            if (r0 == 0) goto L32
        L44:
            r11.a = r5
            java.lang.Object r12 = r7.F0(r3, r2, r11)
            if (r12 != r8) goto L4d
            goto L92
        L4d:
            int r12 = r7.V0
            mr5 r0 = new mr5
            float r1 = r11.d
            r0.<init>(r1, r3, r5)
            r11.a = r6
            java.io.Serializable r12 = r7.j0(r12, r0, r11)
            if (r12 != r8) goto L5f
            goto L92
        L5f:
            yk8 r12 = (defpackage.yk8) r12
            java.lang.Object r0 = r12.a
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Object r12 = r12.b
            java.util.List r12 = (java.util.List) r12
            cza r1 = r7.x0
            if (r1 == 0) goto L8a
        L71:
            java.lang.Object r3 = r1.getValue()
            r5 = r3
            kob r5 = (defpackage.kob) r5
            kj6 r9 = new kj6
            r9.<init>(r0, r6, r2)
            r5.getClass()
            kob r5 = defpackage.kob.a(r9, r12)
            boolean r3 = r1.l(r3, r5)
            if (r3 == 0) goto L71
        L8a:
            r11.a = r4
            java.lang.Object r11 = defpackage.y5c.L(r7, r0, r0, r11)
            if (r11 != r8) goto L93
        L92:
            return r8
        L93:
            pvc r11 = defpackage.pvc.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j5c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
