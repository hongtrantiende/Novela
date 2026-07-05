package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gab  reason: default package */
/* loaded from: classes.dex */
public final class gab implements r13, m42 {
    public final /* synthetic */ hab a;
    public final f61 b;
    public f61 c;
    public s09 d = s09.b;
    public final gs3 e = gs3.a;
    public final /* synthetic */ hab f;

    public gab(hab habVar, f61 f61Var) {
        this.f = habVar;
        this.a = habVar;
        this.b = f61Var;
    }

    @Override // defpackage.r13
    public final float B0(float f) {
        return f / this.a.f();
    }

    @Override // defpackage.r13
    public final float G0() {
        return this.a.G0();
    }

    @Override // defpackage.r13
    public final float L0(float f) {
        return this.a.f() * f;
    }

    @Override // defpackage.r13
    public final long P(float f) {
        return this.a.P(f);
    }

    @Override // defpackage.r13
    public final long Q(long j) {
        return this.a.Q(j);
    }

    @Override // defpackage.r13
    public final int X0(float f) {
        return this.a.X0(f);
    }

    @Override // defpackage.r13
    public final float c0(long j) {
        return this.a.c0(j);
    }

    @Override // defpackage.r13
    public final float f() {
        return this.a.f();
    }

    @Override // defpackage.r13
    public final long f1(long j) {
        return this.a.f1(j);
    }

    @Override // defpackage.m42
    public final d82 getContext() {
        return this.e;
    }

    public final Object j(s09 s09Var, m42 m42Var) {
        f61 f61Var = new f61(1, w92.t(m42Var));
        f61Var.u();
        this.d = s09Var;
        this.c = f61Var;
        return f61Var.s();
    }

    @Override // defpackage.r13
    public final float k1(long j) {
        return this.a.k1(j);
    }

    public final long o() {
        hab habVar = this.f;
        long f1 = habVar.f1(voe.v(habVar).X.d());
        long j = habVar.U;
        return (Float.floatToRawIntBits(Math.max((float) nae.e, Float.intBitsToFloat((int) (f1 >> 32)) - ((int) (j >> 32))) / 2.0f) << 32) | (Float.floatToRawIntBits(Math.max((float) nae.e, Float.intBitsToFloat((int) (f1 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f) & 4294967295L);
    }

    public final ucd p() {
        return voe.v(this.f).X;
    }

    @Override // defpackage.r13
    public final long p0(int i) {
        return this.a.p0(i);
    }

    @Override // defpackage.r13
    public final long r0(float f) {
        return this.a.r0(f);
    }

    @Override // defpackage.m42
    public final void resumeWith(Object obj) {
        hab habVar = this.f;
        synchronized (habVar.R) {
            habVar.Q.j(this);
        }
        this.b.resumeWith(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Type inference failed for: r12v0, types: [lu4] */
    /* JADX WARN: Type inference failed for: r9v0, types: [gab, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [w26] */
    /* JADX WARN: Type inference failed for: r9v4, types: [w26] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(long r10, defpackage.lu4 r12, defpackage.hh0 r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.eab
            if (r0 == 0) goto L13
            r0 = r13
            eab r0 = (defpackage.eab) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            eab r0 = new eab
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L2a
            iya r9 = r0.a
            defpackage.hre.r(r13)     // Catch: java.lang.Throwable -> L27
            goto L6c
        L27:
            r0 = move-exception
            r10 = r0
            goto L72
        L2a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            r9 = 0
            return r9
        L31:
            defpackage.hre.r(r13)
            r3 = 0
            int r13 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r13 > 0) goto L4b
            f61 r13 = r9.c
            if (r13 == 0) goto L4b
            t09 r1 = new t09
            r1.<init>(r10)
            gs9 r3 = new gs9
            r3.<init>(r1)
            r13.resumeWith(r3)
        L4b:
            hab r13 = r9.f
            m82 r13 = r13.v1()
            ip r3 = new ip
            r8 = 5
            r7 = 0
            r6 = r9
            r4 = r10
            r3.<init>(r4, r6, r7, r8)
            r9 = 3
            iya r9 = defpackage.z87.v(r13, r7, r7, r3, r9)
            r0.a = r9     // Catch: java.lang.Throwable -> L27
            r0.d = r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r13 = r12.invoke(r6, r0)     // Catch: java.lang.Throwable -> L27
            n82 r10 = defpackage.n82.a
            if (r13 != r10) goto L6c
            return r10
        L6c:
            c61 r10 = defpackage.c61.b
            r9.cancel(r10)
            return r13
        L72:
            c61 r11 = defpackage.c61.b
            r9.cancel(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gab.t(long, lu4, hh0):java.lang.Object");
    }

    @Override // defpackage.r13
    public final float y0(int i) {
        return this.a.y0(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(long r5, defpackage.lu4 r7, defpackage.m42 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.fab
            if (r0 == 0) goto L13
            r0 = r8
            fab r0 = (defpackage.fab) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fab r0 = new fab
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.hre.r(r8)     // Catch: defpackage.t09 -> L3b
            return r8
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r2
        L2c:
            defpackage.hre.r(r8)
            r0.c = r3     // Catch: defpackage.t09 -> L3b
            java.lang.Object r4 = r4.t(r5, r7, r0)     // Catch: defpackage.t09 -> L3b
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L3a
            return r5
        L3a:
            return r4
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gab.z(long, lu4, m42):java.lang.Object");
    }
}
