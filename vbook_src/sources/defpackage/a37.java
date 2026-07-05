package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a37  reason: default package */
/* loaded from: classes.dex */
public final class a37 extends mw8 implements w27, kc, qr7 {
    public boolean C;
    public boolean F;
    public boolean G;
    public boolean I;
    public xt4 K;
    public p15 L;
    public float M;
    public Object O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean X;
    public float b0;
    public boolean c0;
    public xt4 d0;
    public p15 e0;
    public final sd6 f;
    public float g0;
    public boolean i0;
    public int D = Integer.MAX_VALUE;
    public int E = Integer.MAX_VALUE;
    public md6 H = md6.c;
    public long J = 0;
    public boolean N = true;
    public final pd6 U = new pd6(this, 0);
    public final gw7 V = new gw7(new a37[16], 0);
    public boolean W = true;
    public long Y = y02.b(0, 0, 0, 0, 15);
    public final z27 Z = new z27(this, 1);
    public final z27 a0 = new z27(this, 0);
    public long f0 = 0;
    public final z27 h0 = new z27(this, 2);

    public a37(sd6 sd6Var) {
        this.f = sd6Var;
    }

    @Override // defpackage.w27
    public final int F(int i) {
        sd6 sd6Var = this.f;
        if (xbe.F(sd6Var.a)) {
            xy6 xy6Var = sd6Var.q;
            xy6Var.getClass();
            return xy6Var.F(i);
        }
        O0();
        return sd6Var.a().F(i);
    }

    @Override // defpackage.kc
    public final int H() {
        return this.E;
    }

    public final List H0() {
        sd6 sd6Var = this.f;
        sd6Var.a.k0();
        boolean z = this.W;
        gw7 gw7Var = this.V;
        if (!z) {
            return gw7Var.f();
        }
        od6 od6Var = sd6Var.a;
        gw7 z2 = od6Var.z();
        Object[] objArr = z2.a;
        int i = z2.c;
        for (int i2 = 0; i2 < i; i2++) {
            od6 od6Var2 = (od6) objArr[i2];
            if (gw7Var.c <= i2) {
                gw7Var.b(od6Var2.d0.p);
            } else {
                a37 a37Var = od6Var2.d0.p;
                Object[] objArr2 = gw7Var.a;
                Object obj = objArr2[i2];
                objArr2[i2] = a37Var;
            }
        }
        gw7Var.l(((gw7) ((iv7) od6Var.o()).b).c, gw7Var.c);
        this.W = false;
        return gw7Var.f();
    }

    @Override // defpackage.w27
    public final int J(int i) {
        sd6 sd6Var = this.f;
        if (xbe.F(sd6Var.a)) {
            xy6 xy6Var = sd6Var.q;
            xy6Var.getClass();
            return xy6Var.J(i);
        }
        O0();
        return sd6Var.a().J(i);
    }

    @Override // defpackage.w27
    public final mw8 M(long j) {
        md6 md6Var;
        sd6 sd6Var = this.f;
        od6 od6Var = sd6Var.a;
        od6 od6Var2 = sd6Var.a;
        md6 md6Var2 = od6Var.Z;
        md6 md6Var3 = md6.c;
        if (md6Var2 == md6Var3) {
            od6Var.e();
        }
        if (xbe.F(od6Var2)) {
            xy6 xy6Var = sd6Var.q;
            xy6Var.getClass();
            xy6Var.F = md6Var3;
            xy6Var.M(j);
        }
        od6 v = od6Var2.v();
        if (v != null) {
            sd6 sd6Var2 = v.d0;
            if (this.H != md6Var3 && !od6Var2.b0) {
                lv5.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = sd6Var2.d.ordinal();
            if (ordinal != 0) {
                if (ordinal == 2) {
                    md6Var = md6.b;
                } else {
                    xk5.j(sd6Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
            } else {
                md6Var = md6.a;
            }
            this.H = md6Var;
        } else {
            this.H = md6Var3;
        }
        U0(j);
        return this;
    }

    public final void M0() {
        boolean z = this.P;
        this.P = true;
        sd6 sd6Var = this.f;
        od6 od6Var = sd6Var.a;
        kn knVar = od6Var.c0;
        if (!z) {
            ((wv5) knVar.d).P1();
            ((rg) rd6.a(od6Var)).getRectManager().h(sd6Var.a);
            if (od6Var.r()) {
                od6.a0(od6Var, true, 6);
            } else if (od6Var.d0.e) {
                od6.Y(od6Var, true, 6);
            }
        }
        i38 i38Var = ((wv5) knVar.d).R;
        for (i38 i38Var2 = (i38) knVar.e; !c16.i(i38Var2, i38Var) && i38Var2 != null; i38Var2 = i38Var2.R) {
            if (i38Var2.m0) {
                i38Var2.L1();
            }
        }
        gw7 z2 = od6Var.z();
        Object[] objArr = z2.a;
        int i = z2.c;
        for (int i2 = 0; i2 < i; i2++) {
            od6 od6Var2 = (od6) objArr[i2];
            if (od6Var2.w() != Integer.MAX_VALUE) {
                od6Var2.d0.p.M0();
                od6.b0(od6Var2);
            }
        }
    }

    public final void N0() {
        if (this.P) {
            this.P = false;
            sd6 sd6Var = this.f;
            od6 od6Var = sd6Var.a;
            od6 od6Var2 = sd6Var.a;
            ((rg) rd6.a(od6Var)).getRectManager().i(od6Var2);
            kn knVar = od6Var2.c0;
            i38 i38Var = ((wv5) knVar.d).R;
            for (i38 i38Var2 = (i38) knVar.e; !c16.i(i38Var2, i38Var) && i38Var2 != null; i38Var2 = i38Var2.R) {
                i38Var2.R1();
                i38Var2.W1();
            }
            gw7 z = od6Var2.z();
            Object[] objArr = z.a;
            int i = z.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((od6) objArr[i2]).d0.p.N0();
            }
        }
    }

    public final void O0() {
        md6 md6Var;
        sd6 sd6Var = this.f;
        od6.a0(sd6Var.a, false, 7);
        od6 od6Var = sd6Var.a;
        od6 v = od6Var.v();
        if (v != null && od6Var.Z == md6.c) {
            int ordinal = v.d0.d.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    md6Var = v.Z;
                } else {
                    md6Var = md6.b;
                }
            } else {
                md6Var = md6.a;
            }
            od6Var.Z = md6Var;
        }
    }

    public final void P0() {
        this.c0 = true;
        sd6 sd6Var = this.f;
        od6 v = sd6Var.a.v();
        float f = n().c0;
        od6 od6Var = sd6Var.a;
        kn knVar = od6Var.c0;
        i38 i38Var = (i38) knVar.e;
        wv5 wv5Var = (wv5) knVar.d;
        while (i38Var != wv5Var) {
            i38Var.getClass();
            id6 id6Var = (id6) i38Var;
            f += id6Var.c0;
            i38Var = id6Var.R;
        }
        if (f != this.b0) {
            this.b0 = f;
            if (v != null) {
                v.Q();
            }
            if (v != null) {
                v.D();
            }
        }
        if (!n().K) {
            boolean z = this.P;
            if (!z || this.U.d()) {
                M0();
            }
            if (!z) {
                if (v != null) {
                    v.D();
                }
                if (this.C && v != null) {
                    v.Z(false);
                }
            } else {
                ((wv5) od6Var.c0.d).P1();
            }
        }
        if (v != null) {
            sd6 sd6Var2 = v.d0;
            if (!this.C && sd6Var2.d == kd6.c) {
                if (this.E != Integer.MAX_VALUE) {
                    lv5.c("Place was called on a node which was placed already");
                }
                int i = sd6Var2.i;
                this.E = i;
                sd6Var2.i = i + 1;
            }
        } else {
            this.E = 0;
        }
        d0();
    }

    @Override // defpackage.mw8, defpackage.w27
    public final Object S() {
        return this.O;
    }

    public final void S0(long j, float f, xt4 xt4Var, p15 p15Var) {
        sd6 sd6Var = this.f;
        od6 od6Var = sd6Var.a;
        od6 od6Var2 = sd6Var.a;
        if (od6Var.n0) {
            lv5.a("place is called on a deactivated node");
        }
        sd6Var.d = kd6.c;
        this.J = j;
        this.M = f;
        this.K = xt4Var;
        this.L = p15Var;
        this.c0 = false;
        wg8 a = rd6.a(od6Var2);
        if (!this.S && this.P) {
            i38 a2 = sd6Var.a();
            a2.U1(py5.d(j, a2.e), f, xt4Var, p15Var);
            P0();
        } else {
            this.U.g = false;
            sd6Var.f(false);
            this.d0 = xt4Var;
            this.f0 = j;
            this.g0 = f;
            this.e0 = p15Var;
            yg8 snapshotObserver = ((rg) a).getSnapshotObserver();
            snapshotObserver.a.d(od6Var2, snapshotObserver.f, this.h0);
        }
        sd6Var.d = kd6.e;
        if (sd6Var.a().K && (sd6Var.k || sd6Var.j)) {
            requestLayout();
        }
        this.G = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:19:0x002f, B:21:0x0033, B:23:0x003b, B:26:0x0044, B:27:0x0046, B:29:0x004a, B:31:0x0050, B:33:0x0058, B:36:0x0066, B:38:0x0071, B:39:0x0075, B:35:0x005c, B:40:0x0089, B:42:0x008d, B:44:0x0091, B:45:0x0096, B:12:0x001f, B:14:0x0023, B:16:0x0027, B:18:0x002b), top: B:49:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:19:0x002f, B:21:0x0033, B:23:0x003b, B:26:0x0044, B:27:0x0046, B:29:0x004a, B:31:0x0050, B:33:0x0058, B:36:0x0066, B:38:0x0071, B:39:0x0075, B:35:0x005c, B:40:0x0089, B:42:0x008d, B:44:0x0091, B:45:0x0096, B:12:0x001f, B:14:0x0023, B:16:0x0027, B:18:0x002b), top: B:49:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T0(long r9, float r11, defpackage.xt4 r12, defpackage.p15 r13) {
        /*
            r8 = this;
            sd6 r0 = r8.f
            od6 r1 = r0.a
            od6 r2 = r0.a
            r3 = 1
            r8.Q = r3     // Catch: java.lang.Throwable -> L1b
            long r4 = r8.J     // Catch: java.lang.Throwable -> L1b
            boolean r4 = defpackage.py5.b(r9, r4)     // Catch: java.lang.Throwable -> L1b
            r5 = 0
            if (r4 == 0) goto L1f
            xt4 r4 = r8.K     // Catch: java.lang.Throwable -> L1b
            if (r12 != r4) goto L1f
            boolean r4 = r8.i0     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L2f
            goto L1f
        L1b:
            r0 = move-exception
            r8 = r0
            goto L9f
        L1f:
            boolean r4 = r0.k     // Catch: java.lang.Throwable -> L1b
            if (r4 != 0) goto L2b
            boolean r4 = r0.j     // Catch: java.lang.Throwable -> L1b
            if (r4 != 0) goto L2b
            boolean r4 = r8.i0     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L2f
        L2b:
            r8.S = r3     // Catch: java.lang.Throwable -> L1b
            r8.i0 = r5     // Catch: java.lang.Throwable -> L1b
        L2f:
            xy6 r4 = r0.q     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L46
            sd6 r6 = r4.f     // Catch: java.lang.Throwable -> L1b
            vy6 r4 = r4.N     // Catch: java.lang.Throwable -> L1b
            vy6 r7 = defpackage.vy6.c     // Catch: java.lang.Throwable -> L1b
            if (r4 != r7) goto L46
            od6 r4 = r6.a     // Catch: java.lang.Throwable -> L1b
            boolean r4 = defpackage.xbe.F(r4)     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L44
            goto L46
        L44:
            r6.c = r3     // Catch: java.lang.Throwable -> L1b
        L46:
            xy6 r4 = r0.q     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L89
            boolean r4 = r4.H0()     // Catch: java.lang.Throwable -> L1b
            if (r4 != r3) goto L89
            i38 r3 = r0.a()     // Catch: java.lang.Throwable -> L1b
            i38 r3 = r3.S     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L5c
            sy6 r3 = r3.L     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto L66
        L5c:
            wg8 r3 = defpackage.rd6.a(r2)     // Catch: java.lang.Throwable -> L1b
            rg r3 = (defpackage.rg) r3     // Catch: java.lang.Throwable -> L1b
            lw8 r3 = r3.getPlacementScope()     // Catch: java.lang.Throwable -> L1b
        L66:
            xy6 r4 = r0.q     // Catch: java.lang.Throwable -> L1b
            r4.getClass()     // Catch: java.lang.Throwable -> L1b
            od6 r2 = r2.v()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L75
            sd6 r2 = r2.d0     // Catch: java.lang.Throwable -> L1b
            r2.h = r5     // Catch: java.lang.Throwable -> L1b
        L75:
            r2 = 2147483647(0x7fffffff, float:NaN)
            r4.E = r2     // Catch: java.lang.Throwable -> L1b
            r2 = 32
            long r5 = r9 >> r2
            int r2 = (int) r5     // Catch: java.lang.Throwable -> L1b
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r9
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L1b
            defpackage.lw8.p(r3, r4, r2, r5)     // Catch: java.lang.Throwable -> L1b
        L89:
            xy6 r0 = r0.q     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L96
            boolean r0 = r0.H     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L96
            java.lang.String r0 = "Error: Placement happened before lookahead."
            defpackage.lv5.c(r0)     // Catch: java.lang.Throwable -> L1b
        L96:
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            r2.S0(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L1b
            return
        L9f:
            r1.d0(r8)
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a37.T0(long, float, xt4, p15):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054 A[Catch: all -> 0x0010, LOOP:0: B:24:0x0052->B:25:0x0054, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:8:0x0013, B:11:0x0023, B:16:0x002b, B:18:0x0033, B:21:0x003c, B:23:0x0045, B:25:0x0054, B:26:0x0063, B:30:0x007a, B:32:0x0099, B:33:0x009f, B:35:0x00ab, B:37:0x00b5, B:41:0x00c1, B:29:0x0075), top: B:45:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:8:0x0013, B:11:0x0023, B:16:0x002b, B:18:0x0033, B:21:0x003c, B:23:0x0045, B:25:0x0054, B:26:0x0063, B:30:0x007a, B:32:0x0099, B:33:0x009f, B:35:0x00ab, B:37:0x00b5, B:41:0x00c1, B:29:0x0075), top: B:45:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:8:0x0013, B:11:0x0023, B:16:0x002b, B:18:0x0033, B:21:0x003c, B:23:0x0045, B:25:0x0054, B:26:0x0063, B:30:0x007a, B:32:0x0099, B:33:0x009f, B:35:0x00ab, B:37:0x00b5, B:41:0x00c1, B:29:0x0075), top: B:45:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean U0(long r11) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a37.U0(long):boolean");
    }

    public final void V0() {
        sd6 sd6Var = this.f;
        od6 od6Var = sd6Var.a;
        od6 od6Var2 = sd6Var.a;
        if (od6Var.K() && sd6Var.l > 0) {
            sd6 sd6Var2 = od6Var2.d0;
            if ((sd6Var2.j || sd6Var2.k) && !sd6Var2.p.S) {
                od6Var2.Z(false);
            }
            gw7 z = od6Var2.z();
            Object[] objArr = z.a;
            int i = z.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((od6) objArr[i2]).d0.p.V0();
            }
        }
    }

    @Override // defpackage.kc
    public final void a0(jc jcVar) {
        gw7 z = this.f.a.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            jcVar.invoke(((od6) objArr[i2]).d0.p);
        }
    }

    @Override // defpackage.qr7
    public final void b0(boolean z) {
        sd6 sd6Var = this.f;
        if (z != sd6Var.a().H) {
            sd6Var.a().H = z;
            this.i0 = true;
        }
    }

    @Override // defpackage.kc
    public final void d0() {
        this.X = true;
        pd6 pd6Var = this.U;
        pd6Var.h();
        boolean z = this.S;
        sd6 sd6Var = this.f;
        if (z) {
            gw7 z2 = sd6Var.a.z();
            Object[] objArr = z2.a;
            int i = z2.c;
            for (int i2 = 0; i2 < i; i2++) {
                od6 od6Var = (od6) objArr[i2];
                if (od6Var.r() && od6Var.s() == md6.a && od6.S(od6Var)) {
                    od6.a0(sd6Var.a, false, 7);
                }
            }
        }
        if (this.T || (!this.I && !n().K && this.S)) {
            this.S = false;
            kd6 kd6Var = sd6Var.d;
            sd6Var.d = kd6.c;
            sd6Var.g(false);
            od6 od6Var2 = sd6Var.a;
            yg8 snapshotObserver = ((rg) rd6.a(od6Var2)).getSnapshotObserver();
            snapshotObserver.a.d(od6Var2, snapshotObserver.e, this.a0);
            sd6Var.d = kd6Var;
            this.T = false;
        }
        if (pd6Var.d) {
            pd6Var.e = true;
        }
        if (pd6Var.b && pd6Var.e()) {
            pd6Var.g();
        }
        this.X = false;
    }

    @Override // defpackage.kc
    public final pd6 g() {
        return this.U;
    }

    @Override // defpackage.w27
    public final int j(int i) {
        sd6 sd6Var = this.f;
        if (xbe.F(sd6Var.a)) {
            xy6 xy6Var = sd6Var.q;
            xy6Var.getClass();
            return xy6Var.j(i);
        }
        O0();
        return sd6Var.a().j(i);
    }

    @Override // defpackage.kc
    public final void m0() {
        od6.a0(this.f.a, false, 7);
    }

    @Override // defpackage.kc
    public final wv5 n() {
        return (wv5) this.f.a.c0.d;
    }

    @Override // defpackage.w27
    public final int n0(int i) {
        sd6 sd6Var = this.f;
        if (xbe.F(sd6Var.a)) {
            xy6 xy6Var = sd6Var.q;
            xy6Var.getClass();
            return xy6Var.n0(i);
        }
        O0();
        return sd6Var.a().n0(i);
    }

    @Override // defpackage.mw8
    public final int o0(ec ecVar) {
        kd6 kd6Var;
        sd6 sd6Var = this.f;
        od6 v = sd6Var.a.v();
        kd6 kd6Var2 = null;
        if (v != null) {
            kd6Var = v.d0.d;
        } else {
            kd6Var = null;
        }
        kd6 kd6Var3 = kd6.a;
        pd6 pd6Var = this.U;
        if (kd6Var == kd6Var3) {
            pd6Var.c = true;
        } else {
            od6 v2 = sd6Var.a.v();
            if (v2 != null) {
                kd6Var2 = v2.d0.d;
            }
            if (kd6Var2 == kd6.c) {
                pd6Var.d = true;
            }
        }
        this.I = true;
        int o0 = sd6Var.a().o0(ecVar);
        this.I = false;
        return o0;
    }

    @Override // defpackage.kc
    public final kc p() {
        sd6 sd6Var;
        od6 v = this.f.a.v();
        if (v != null && (sd6Var = v.d0) != null) {
            return sd6Var.p;
        }
        return null;
    }

    @Override // defpackage.kc
    public final void requestLayout() {
        this.f.a.Z(false);
    }

    @Override // defpackage.mw8
    public final int u0() {
        return this.f.a().u0();
    }

    @Override // defpackage.mw8
    public final int v0() {
        return this.f.a().v0();
    }

    @Override // defpackage.mw8
    public final void x0(long j, float f, xt4 xt4Var) {
        T0(j, f, xt4Var, null);
    }

    @Override // defpackage.mw8
    public final void z0(long j, float f, p15 p15Var) {
        T0(j, f, null, p15Var);
    }
}
