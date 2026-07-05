package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xa9  reason: default package */
/* loaded from: classes.dex */
public final class xa9 extends m03 implements u08 {
    public boolean M;
    public vt4 N;
    public boolean O;
    public ya9 P;
    public float Q;
    public final b18 R = new b18(this, null);
    public final dm8 S = new dm8(nae.e);
    public final dm8 T = new dm8(nae.e);

    public xa9(boolean z, vt4 vt4Var, boolean z2, ya9 ya9Var, float f) {
        this.M = z;
        this.N = vt4Var;
        this.O = z2;
        this.P = ya9Var;
        this.Q = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K1(defpackage.xa9 r9, defpackage.n42 r10) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof defpackage.ta9
            if (r0 == 0) goto L17
            r0 = r10
            ta9 r0 = (defpackage.ta9) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.c = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            ta9 r0 = new ta9
            r0.<init>(r9, r10)
            goto L15
        L1d:
            java.lang.Object r10 = r6.a
            int r0 = r6.c
            pvc r8 = defpackage.pvc.a
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 != r1) goto L2f
            defpackage.hre.r(r10)     // Catch: java.lang.Throwable -> L2c
            goto L58
        L2c:
            r0 = move-exception
            r10 = r0
            goto L6d
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            r9 = 0
            return r9
        L36:
            defpackage.hre.r(r10)
            ya9 r10 = r9.P     // Catch: java.lang.Throwable -> L2c
            r6.c = r1     // Catch: java.lang.Throwable -> L2c
            lq r1 = r10.a     // Catch: java.lang.Throwable -> L2c
            java.lang.Float r2 = new java.lang.Float     // Catch: java.lang.Throwable -> L2c
            r10 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L2c
            r5 = 0
            r7 = 14
            r3 = 0
            r4 = 0
            java.lang.Object r10 = defpackage.lq.c(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2c
            n82 r0 = defpackage.n82.a
            if (r10 != r0) goto L54
            goto L55
        L54:
            r10 = r8
        L55:
            if (r10 != r0) goto L58
            return r0
        L58:
            boolean r10 = r9.J
            if (r10 == 0) goto L6c
            int r10 = r9.N1()
            float r10 = (float) r10
            r9.P1(r10)
            int r10 = r9.N1()
            float r10 = (float) r10
            r9.Q1(r10)
        L6c:
            return r8
        L6d:
            boolean r0 = r9.J
            if (r0 == 0) goto L81
            int r0 = r9.N1()
            float r0 = (float) r0
            r9.P1(r0)
            int r0 = r9.N1()
            float r0 = (float) r0
            r9.Q1(r0)
        L81:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa9.K1(xa9, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L1(defpackage.n42 r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.sa9
            if (r0 == 0) goto L14
            r0 = r11
            sa9 r0 = (defpackage.sa9) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            sa9 r0 = new sa9
            r0.<init>(r10, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.a
            int r0 = r6.c
            pvc r8 = defpackage.pvc.a
            r1 = 1
            r9 = 0
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2d
            defpackage.hre.r(r11)     // Catch: java.lang.Throwable -> L2a
            goto L54
        L2a:
            r0 = move-exception
            r11 = r0
            goto L5b
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            r10 = 0
            return r10
        L34:
            defpackage.hre.r(r11)
            ya9 r11 = r10.P     // Catch: java.lang.Throwable -> L2a
            r6.c = r1     // Catch: java.lang.Throwable -> L2a
            lq r1 = r11.a     // Catch: java.lang.Throwable -> L2a
            java.lang.Float r2 = new java.lang.Float     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L2a
            r5 = 0
            r7 = 14
            r3 = 0
            r4 = 0
            java.lang.Object r11 = defpackage.lq.c(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2a
            n82 r0 = defpackage.n82.a
            if (r11 != r0) goto L50
            goto L51
        L50:
            r11 = r8
        L51:
            if (r11 != r0) goto L54
            return r0
        L54:
            r10.P1(r9)
            r10.Q1(r9)
            return r8
        L5b:
            r10.P1(r9)
            r10.Q1(r9)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa9.L1(n42):java.lang.Object");
    }

    public final long M1(long j) {
        float h;
        float N1;
        if (this.M) {
            h = 0.0f;
        } else {
            dm8 dm8Var = this.T;
            float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) + dm8Var.h();
            if (intBitsToFloat < nae.e) {
                intBitsToFloat = 0.0f;
            }
            h = intBitsToFloat - dm8Var.h();
            P1(intBitsToFloat);
            if (dm8Var.h() * 0.5f <= N1()) {
                N1 = dm8Var.h() * 0.5f;
            } else {
                float m = dce.m(Math.abs((dm8Var.h() * 0.5f) / N1()) - 1.0f, nae.e, 2.0f);
                N1 = N1() + (N1() * (m - (((float) Math.pow(m, 2.0d)) / 4.0f)));
            }
            Q1(N1);
        }
        return (Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(h) & 4294967295L);
    }

    public final int N1() {
        return voe.v(this).V.X0(this.Q);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O1(float r6, defpackage.n42 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.wa9
            if (r0 == 0) goto L13
            r0 = r7
            wa9 r0 = (defpackage.wa9) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            wa9 r0 = new wa9
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L28
            float r6 = r0.a
            defpackage.hre.r(r7)
            goto L6f
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L2f:
            defpackage.hre.r(r7)
            boolean r7 = r5.M
            if (r7 == 0) goto L3c
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r3)
            return r5
        L3c:
            dm8 r7 = r5.T
            float r1 = r7.h()
            r4 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r4
            int r4 = r5.N1()
            float r4 = (float) r4
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L53
            vt4 r1 = r5.N
            r1.invoke()
        L53:
            float r7 = r7.h()
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 != 0) goto L5d
        L5b:
            r6 = r3
            goto L62
        L5d:
            int r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r7 >= 0) goto L62
            goto L5b
        L62:
            r0.a = r6
            r0.d = r2
            java.lang.Object r7 = r5.L1(r0)
            n82 r0 = defpackage.n82.a
            if (r7 != r0) goto L6f
            return r0
        L6f:
            r5.P1(r3)
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa9.O1(float, n42):java.lang.Object");
    }

    public final void P1(float f) {
        this.T.i(f);
    }

    public final void Q1(float f) {
        this.S.i(f);
    }

    @Override // defpackage.u08
    public final long i1(long j, long j2, int i) {
        if (!this.P.a.f() && this.O && i == 1) {
            long M1 = M1(j2);
            z87.v(v1(), null, null, new ua9(this, null, 1), 3);
            return M1;
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    @Override // defpackage.u08
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m0(long r5, defpackage.m42 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.va9
            if (r0 == 0) goto L13
            r0 = r7
            va9 r0 = (defpackage.va9) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            va9 r0 = new va9
            n42 r7 = (defpackage.n42) r7
            r0.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.hre.r(r7)
            goto L40
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r7)
            float r5 = defpackage.z4d.c(r5)
            r0.c = r2
            java.lang.Object r7 = r4.O1(r5, r0)
            n82 r4 = defpackage.n82.a
            if (r7 != r4) goto L40
            return r4
        L40:
            java.lang.Number r7 = (java.lang.Number) r7
            float r4 = r7.floatValue()
            r5 = 0
            long r4 = defpackage.ese.q(r5, r4)
            z4d r6 = new z4d
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa9.m0(long, m42):java.lang.Object");
    }

    @Override // defpackage.u08
    public final long u0(int i, long j) {
        if (!this.P.a.f() && this.O && i == 1 && Float.intBitsToFloat((int) (4294967295L & j)) < nae.e) {
            return M1(j);
        }
        return 0L;
    }

    @Override // defpackage.mq7
    public final boolean w1() {
        return false;
    }

    @Override // defpackage.mq7
    public final void z1() {
        float f;
        H1(this.R);
        z87.v(v1(), null, null, new ua9(this, null, 0), 3);
        if (this.M) {
            f = N1();
        } else {
            f = nae.e;
        }
        Q1(f);
    }
}
