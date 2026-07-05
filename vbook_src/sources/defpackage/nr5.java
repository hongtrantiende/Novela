package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nr5  reason: default package */
/* loaded from: classes3.dex */
public final class nr5 extends aab implements lu4 {
    public int a;
    public int b;
    public final /* synthetic */ ur5 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr5(float f, int i, m42 m42Var, ur5 ur5Var) {
        super(2, m42Var);
        this.c = ur5Var;
        this.d = i;
        this.e = f;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new nr5(this.e, this.d, m42Var, this.c);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((nr5) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r13 == r9) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
        if (r8.r(r4, false, r12) != r9) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
        if (r13 == r9) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[LOOP:2: B:21:0x0068->B:22:0x007f, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.b
            r1 = 6
            r2 = 0
            r3 = 0
            int r4 = r12.d
            r5 = 3
            r6 = 1
            r7 = 2
            ur5 r8 = r12.c
            n82 r9 = defpackage.n82.a
            if (r0 == 0) goto L2b
            if (r0 == r6) goto L27
            if (r0 == r7) goto L21
            if (r0 != r5) goto L1b
            defpackage.hre.r(r13)
            goto La0
        L1b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r12)
            return r2
        L21:
            int r0 = r12.a
            defpackage.hre.r(r13)
            goto L8c
        L27:
            defpackage.hre.r(r13)
            goto L41
        L2b:
            defpackage.hre.r(r13)
            r8.x()
            int r13 = r8.S
            tr0 r0 = new tr0
            r0.<init>(r4, r1)
            r12.b = r6
            java.io.Serializable r13 = r8.o(r13, r0, r12)
            if (r13 != r9) goto L41
            goto L9f
        L41:
            yk8 r13 = (defpackage.yk8) r13
            java.lang.Object r0 = r13.a
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Object r13 = r13.b
            java.util.List r13 = (java.util.List) r13
            cza r6 = r8.Z
            if (r6 == 0) goto L64
        L53:
            java.lang.Object r10 = r6.getValue()
            r11 = r10
            am5 r11 = (defpackage.am5) r11
            am5 r11 = defpackage.am5.a(r11, r4, r2, r3, r1)
            boolean r10 = r6.l(r10, r11)
            if (r10 == 0) goto L53
        L64:
            cza r1 = r8.b0
            if (r1 == 0) goto L81
        L68:
            java.lang.Object r2 = r1.getValue()
            r6 = r2
            sm5 r6 = (defpackage.sm5) r6
            kj6 r10 = new kj6
            r10.<init>(r0, r7, r3)
            r6.getClass()
            sm5 r6 = defpackage.sm5.a(r10, r13)
            boolean r2 = r1.l(r2, r6)
            if (r2 == 0) goto L68
        L81:
            r12.a = r0
            r12.b = r7
            java.lang.Object r13 = r8.r(r4, r3, r12)
            if (r13 != r9) goto L8c
            goto L9f
        L8c:
            int r13 = r8.S
            mr5 r1 = new mr5
            float r2 = r12.e
            r1.<init>(r2, r4, r3)
            r12.a = r0
            r12.b = r5
            java.io.Serializable r13 = r8.o(r13, r1, r12)
            if (r13 != r9) goto La0
        L9f:
            return r9
        La0:
            yk8 r13 = (defpackage.yk8) r13
            java.lang.Object r12 = r13.a
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            java.lang.Object r13 = r13.b
            java.util.List r13 = (java.util.List) r13
            cza r0 = r8.b0
            if (r0 == 0) goto Lcb
        Lb2:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            sm5 r2 = (defpackage.sm5) r2
            kj6 r4 = new kj6
            r4.<init>(r12, r7, r3)
            r2.getClass()
            sm5 r2 = defpackage.sm5.a(r4, r13)
            boolean r1 = r0.l(r1, r2)
            if (r1 == 0) goto Lb2
        Lcb:
            int r12 = r8.S
            r8.s(r12)
            pvc r12 = defpackage.pvc.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nr5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
