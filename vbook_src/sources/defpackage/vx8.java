package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vx8  reason: default package */
/* loaded from: classes.dex */
public final class vx8 extends aab implements lu4 {
    public qw7 a;
    public xx8 b;
    public int c;
    public final /* synthetic */ xx8 d;
    public final /* synthetic */ lu4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx8(xx8 xx8Var, lu4 lu4Var, m42 m42Var) {
        super(2, m42Var);
        this.d = xx8Var;
        this.e = lu4Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new vx8(this.d, this.e, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((vx8) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r12.o(r11) == r6) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v11, types: [qw7] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v6, types: [qw7] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r4v7, types: [qw7] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.c
            am3 r1 = defpackage.am3.MILLISECONDS
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            n82 r6 = defpackage.n82.a
            if (r0 == 0) goto L2e
            if (r0 == r4) goto L25
            if (r0 == r3) goto L1c
            if (r0 != r2) goto L16
            defpackage.hre.r(r12)
            return r12
        L16:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r11)
            return r5
        L1c:
            qw7 r0 = r11.a
            defpackage.hre.r(r12)     // Catch: java.lang.Throwable -> L22
            goto L6f
        L22:
            r11 = move-exception
            goto L95
        L25:
            xx8 r0 = r11.b
            qw7 r4 = r11.a
            defpackage.hre.r(r12)
            r12 = r4
            goto L42
        L2e:
            defpackage.hre.r(r12)
            xx8 r0 = r11.d
            sw7 r12 = r0.e
            r11.a = r12
            r11.b = r0
            r11.c = r4
            java.lang.Object r4 = r12.o(r11)
            if (r4 != r6) goto L42
            goto L93
        L42:
            android.view.textclassifier.TextClassifier r4 = r0.f     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L50
            boolean r7 = r4.isDestroyed()     // Catch: java.lang.Throwable -> L4d
            if (r7 == 0) goto L74
            goto L50
        L4d:
            r11 = move-exception
            r0 = r12
            goto L95
        L50:
            hq7 r4 = defpackage.wl3.b     // Catch: java.lang.Throwable -> L4d
            r7 = 300(0x12c, double:1.48E-321)
            long r7 = defpackage.jue.P(r7, r1)     // Catch: java.lang.Throwable -> L4d
            rg0 r4 = new rg0     // Catch: java.lang.Throwable -> L4d
            r9 = 18
            r4.<init>(r0, r5, r9)     // Catch: java.lang.Throwable -> L4d
            r11.a = r12     // Catch: java.lang.Throwable -> L4d
            r11.b = r5     // Catch: java.lang.Throwable -> L4d
            r11.c = r3     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = defpackage.k27.G(r7, r4, r11)     // Catch: java.lang.Throwable -> L4d
            if (r0 != r6) goto L6c
            goto L93
        L6c:
            r10 = r0
            r0 = r12
            r12 = r10
        L6f:
            android.view.textclassifier.TextClassifier r4 = defpackage.cp8.h(r12)     // Catch: java.lang.Throwable -> L22
            r12 = r0
        L74:
            r12.q(r5)
            hq7 r12 = defpackage.wl3.b
            r7 = 200(0xc8, double:9.9E-322)
            long r0 = defpackage.jue.P(r7, r1)
            z38 r12 = new z38
            lu4 r3 = r11.e
            r7 = 6
            r12.<init>(r4, r3, r5, r7)
            r11.a = r5
            r11.b = r5
            r11.c = r2
            java.lang.Object r11 = defpackage.k27.G(r0, r12, r11)
            if (r11 != r6) goto L94
        L93:
            return r6
        L94:
            return r11
        L95:
            r0.q(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vx8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
