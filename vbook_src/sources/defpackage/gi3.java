package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gi3  reason: default package */
/* loaded from: classes3.dex */
public final class gi3 extends fs9 implements lu4 {
    public final /* synthetic */ lu4 C;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ kj3 d;
    public final /* synthetic */ lj3 e;
    public final /* synthetic */ lj3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi3(kj3 kj3Var, lj3 lj3Var, lj3 lj3Var2, lu4 lu4Var, m42 m42Var) {
        super(2, m42Var);
        this.d = kj3Var;
        this.e = lj3Var;
        this.f = lj3Var2;
        this.C = lu4Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        gi3 gi3Var = new gi3(this.d, this.e, this.f, this.C, m42Var);
        gi3Var.c = obj;
        return gi3Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((gi3) create((gab) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
        if (r15 == r7) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b A[Catch: CancellationException -> 0x001c, TryCatch #0 {CancellationException -> 0x001c, blocks: (B:8:0x0017, B:32:0x00a0, B:34:0x00a8, B:36:0x00b4, B:38:0x00c0, B:39:0x00c3, B:40:0x00c6, B:41:0x00cc, B:15:0x0029, B:27:0x0057, B:29:0x005b, B:18:0x0031, B:24:0x0048, B:21:0x003d), top: B:46:0x000b }] */
    /* JADX WARN: Type inference failed for: r11v1, types: [yi3, java.lang.Object] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.b
            r1 = 0
            r2 = 0
            lj3 r3 = r14.f
            r4 = 3
            r5 = 2
            r6 = 1
            n82 r7 = defpackage.n82.a
            if (r0 == 0) goto L35
            if (r0 == r6) goto L2d
            if (r0 == r5) goto L25
            if (r0 != r4) goto L1f
            java.lang.Object r0 = r14.c
            gab r0 = (defpackage.gab) r0
            defpackage.hre.r(r15)     // Catch: java.util.concurrent.CancellationException -> L1c
            goto La0
        L1c:
            r14 = move-exception
            goto Ld2
        L1f:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r14)
            return r1
        L25:
            java.lang.Object r0 = r14.c
            gab r0 = (defpackage.gab) r0
            defpackage.hre.r(r15)     // Catch: java.util.concurrent.CancellationException -> L1c
            goto L57
        L2d:
            java.lang.Object r0 = r14.c
            gab r0 = (defpackage.gab) r0
            defpackage.hre.r(r15)     // Catch: java.util.concurrent.CancellationException -> L1c
            goto L48
        L35:
            defpackage.hre.r(r15)
            java.lang.Object r15 = r14.c
            r0 = r15
            gab r0 = (defpackage.gab) r0
            r14.c = r0     // Catch: java.util.concurrent.CancellationException -> L1c
            r14.b = r6     // Catch: java.util.concurrent.CancellationException -> L1c
            java.lang.Object r15 = defpackage.ukb.b(r0, r2, r14, r5)     // Catch: java.util.concurrent.CancellationException -> L1c
            if (r15 != r7) goto L48
            goto L9f
        L48:
            z09 r15 = (defpackage.z09) r15     // Catch: java.util.concurrent.CancellationException -> L1c
            long r8 = r15.a     // Catch: java.util.concurrent.CancellationException -> L1c
            r14.c = r0     // Catch: java.util.concurrent.CancellationException -> L1c
            r14.b = r5     // Catch: java.util.concurrent.CancellationException -> L1c
            java.lang.Object r15 = defpackage.mi3.d(r0, r8, r14)     // Catch: java.util.concurrent.CancellationException -> L1c
            if (r15 != r7) goto L57
            goto L9f
        L57:
            z09 r15 = (defpackage.z09) r15     // Catch: java.util.concurrent.CancellationException -> L1c
            if (r15 == 0) goto Lcf
            kj3 r5 = r14.d     // Catch: java.util.concurrent.CancellationException -> L1c
            long r8 = r15.c     // Catch: java.util.concurrent.CancellationException -> L1c
            java.lang.Object r10 = r5.b     // Catch: java.util.concurrent.CancellationException -> L1c
            aw7 r10 = (defpackage.aw7) r10     // Catch: java.util.concurrent.CancellationException -> L1c
            java.lang.Boolean r11 = java.lang.Boolean.TRUE     // Catch: java.util.concurrent.CancellationException -> L1c
            r10.setValue(r11)     // Catch: java.util.concurrent.CancellationException -> L1c
            java.lang.Object r10 = r5.d     // Catch: java.util.concurrent.CancellationException -> L1c
            aw7 r10 = (defpackage.aw7) r10     // Catch: java.util.concurrent.CancellationException -> L1c
            yi3 r11 = new yi3     // Catch: java.util.concurrent.CancellationException -> L1c
            r11.<init>()     // Catch: java.util.concurrent.CancellationException -> L1c
            java.lang.Object r12 = r5.c     // Catch: java.util.concurrent.CancellationException -> L1c
            m82 r12 = (defpackage.m82) r12     // Catch: java.util.concurrent.CancellationException -> L1c
            jj3 r13 = new jj3     // Catch: java.util.concurrent.CancellationException -> L1c
            r13.<init>(r11, r1, r6)     // Catch: java.util.concurrent.CancellationException -> L1c
            defpackage.z87.v(r12, r1, r1, r13, r4)     // Catch: java.util.concurrent.CancellationException -> L1c
            r10.setValue(r11)     // Catch: java.util.concurrent.CancellationException -> L1c
            java.lang.Object r1 = r5.e     // Catch: java.util.concurrent.CancellationException -> L1c
            xt4 r1 = (defpackage.xt4) r1     // Catch: java.util.concurrent.CancellationException -> L1c
            y78 r5 = new y78     // Catch: java.util.concurrent.CancellationException -> L1c
            r5.<init>(r8)     // Catch: java.util.concurrent.CancellationException -> L1c
            r1.invoke(r5)     // Catch: java.util.concurrent.CancellationException -> L1c
            long r5 = r15.a     // Catch: java.util.concurrent.CancellationException -> L1c
            lu4 r15 = r14.C     // Catch: java.util.concurrent.CancellationException -> L1c
            fi3 r1 = new fi3     // Catch: java.util.concurrent.CancellationException -> L1c
            r1.<init>(r2, r15)     // Catch: java.util.concurrent.CancellationException -> L1c
            r14.c = r0     // Catch: java.util.concurrent.CancellationException -> L1c
            r14.b = r4     // Catch: java.util.concurrent.CancellationException -> L1c
            java.lang.Object r15 = defpackage.mi3.j(r0, r5, r1, r14)     // Catch: java.util.concurrent.CancellationException -> L1c
            if (r15 != r7) goto La0
        L9f:
            return r7
        La0:
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch: java.util.concurrent.CancellationException -> L1c
            boolean r15 = r15.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L1c
            if (r15 == 0) goto Lcc
            hab r15 = r0.f     // Catch: java.util.concurrent.CancellationException -> L1c
            r09 r15 = r15.P     // Catch: java.util.concurrent.CancellationException -> L1c
            java.util.List r15 = r15.a     // Catch: java.util.concurrent.CancellationException -> L1c
            int r0 = r15.size()     // Catch: java.util.concurrent.CancellationException -> L1c
        Lb2:
            if (r2 >= r0) goto Lc6
            java.lang.Object r1 = r15.get(r2)     // Catch: java.util.concurrent.CancellationException -> L1c
            z09 r1 = (defpackage.z09) r1     // Catch: java.util.concurrent.CancellationException -> L1c
            boolean r4 = defpackage.ie2.l(r1)     // Catch: java.util.concurrent.CancellationException -> L1c
            if (r4 == 0) goto Lc3
            r1.a()     // Catch: java.util.concurrent.CancellationException -> L1c
        Lc3:
            int r2 = r2 + 1
            goto Lb2
        Lc6:
            lj3 r14 = r14.e     // Catch: java.util.concurrent.CancellationException -> L1c
            r14.invoke()     // Catch: java.util.concurrent.CancellationException -> L1c
            goto Lcf
        Lcc:
            r3.invoke()     // Catch: java.util.concurrent.CancellationException -> L1c
        Lcf:
            pvc r14 = defpackage.pvc.a
            return r14
        Ld2:
            r3.invoke()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
