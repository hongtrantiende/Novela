package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xy6  reason: default package */
/* loaded from: classes.dex */
public final class xy6 extends mw8 implements w27, kc, qr7 {
    public boolean C;
    public boolean G;
    public boolean H;
    public boolean I;
    public x02 J;
    public xt4 L;
    public p15 M;
    public boolean R;
    public Object U;
    public boolean Y;
    public final sd6 f;
    public int D = Integer.MAX_VALUE;
    public int E = Integer.MAX_VALUE;
    public md6 F = md6.c;
    public long K = 0;
    public vy6 N = vy6.c;
    public final pd6 O = new pd6(this, 1);
    public final gw7 P = new gw7(new xy6[16], 0);
    public boolean Q = true;
    public final wy6 S = new wy6(this, 0);
    public boolean T = true;
    public long V = y02.b(0, 0, 0, 0, 15);
    public final wy6 W = new wy6(this, 2);
    public final wy6 X = new wy6(this, 1);

    public xy6(sd6 sd6Var) {
        this.f = sd6Var;
        this.U = sd6Var.p.O;
    }

    @Override // defpackage.w27
    public final int F(int i) {
        P0();
        ty6 C1 = this.f.a().C1();
        C1.getClass();
        return C1.F(i);
    }

    @Override // defpackage.kc
    public final int H() {
        return this.E;
    }

    public final boolean H0() {
        sd6 sd6Var = this.f;
        if (!xbe.F(sd6Var.a) && !sd6Var.c) {
            return false;
        }
        return true;
    }

    @Override // defpackage.w27
    public final int J(int i) {
        P0();
        ty6 C1 = this.f.a().C1();
        C1.getClass();
        return C1.J(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r1 == defpackage.kd6.d) goto L39;
     */
    @Override // defpackage.w27
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.mw8 M(long r7) {
        /*
            r6 = this;
            sd6 r0 = r6.f
            od6 r1 = r0.a
            od6 r2 = r0.a
            od6 r1 = r1.v()
            r3 = 0
            if (r1 == 0) goto L12
            sd6 r1 = r1.d0
            kd6 r1 = r1.d
            goto L13
        L12:
            r1 = r3
        L13:
            kd6 r4 = defpackage.kd6.b
            if (r1 == r4) goto L27
            od6 r1 = r2.v()
            if (r1 == 0) goto L22
            sd6 r1 = r1.d0
            kd6 r1 = r1.d
            goto L23
        L22:
            r1 = r3
        L23:
            kd6 r4 = defpackage.kd6.d
            if (r1 != r4) goto L2a
        L27:
            r1 = 0
            r0.b = r1
        L2a:
            od6 r0 = r2.v()
            md6 r1 = defpackage.md6.c
            if (r0 == 0) goto L64
            sd6 r0 = r0.d0
            md6 r4 = r6.F
            if (r4 == r1) goto L42
            boolean r4 = r2.b0
            if (r4 == 0) goto L3d
            goto L42
        L3d:
            java.lang.String r4 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            defpackage.lv5.c(r4)
        L42:
            kd6 r4 = r0.d
            int r4 = r4.ordinal()
            if (r4 == 0) goto L5f
            r5 = 1
            if (r4 == r5) goto L5f
            r5 = 2
            if (r4 == r5) goto L5c
            r5 = 3
            if (r4 != r5) goto L54
            goto L5c
        L54:
            kd6 r6 = r0.d
            java.lang.String r7 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            defpackage.xk5.j(r6, r7)
            return r3
        L5c:
            md6 r0 = defpackage.md6.b
            goto L61
        L5f:
            md6 r0 = defpackage.md6.a
        L61:
            r6.F = r0
            goto L66
        L64:
            r6.F = r1
        L66:
            md6 r0 = r2.Z
            if (r0 != r1) goto L6d
            r2.e()
        L6d:
            r6.U0(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy6.M(long):mw8");
    }

    public final void M0(boolean z) {
        if (!z || !H0()) {
            if (z || H0()) {
                this.N = vy6.c;
                gw7 z2 = this.f.a.z();
                Object[] objArr = z2.a;
                int i = z2.c;
                for (int i2 = 0; i2 < i; i2++) {
                    xy6 xy6Var = ((od6) objArr[i2]).d0.q;
                    xy6Var.getClass();
                    xy6Var.M0(true);
                }
            }
        }
    }

    public final void N0() {
        vy6 vy6Var = this.N;
        sd6 sd6Var = this.f;
        boolean z = sd6Var.c;
        od6 od6Var = sd6Var.a;
        vy6 vy6Var2 = vy6.a;
        if (z) {
            this.N = vy6.b;
        } else {
            this.N = vy6Var2;
        }
        if (vy6Var != vy6Var2 && sd6Var.e) {
            od6.Y(od6Var, true, 6);
        }
        gw7 z2 = od6Var.z();
        Object[] objArr = z2.a;
        int i = z2.c;
        for (int i2 = 0; i2 < i; i2++) {
            od6 od6Var2 = (od6) objArr[i2];
            xy6 xy6Var = od6Var2.d0.q;
            if (xy6Var != null) {
                if (xy6Var.E != Integer.MAX_VALUE) {
                    xy6Var.N0();
                    od6.b0(od6Var2);
                }
            } else {
                vs.m("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
        }
    }

    public final void O0() {
        sd6 sd6Var = this.f;
        if (sd6Var.o > 0) {
            gw7 z = sd6Var.a.z();
            Object[] objArr = z.a;
            int i = z.c;
            for (int i2 = 0; i2 < i; i2++) {
                od6 od6Var = (od6) objArr[i2];
                sd6 sd6Var2 = od6Var.d0;
                if ((sd6Var2.m || sd6Var2.n) && !sd6Var2.f) {
                    od6Var.X(false);
                }
                xy6 xy6Var = sd6Var2.q;
                if (xy6Var != null) {
                    xy6Var.O0();
                }
            }
        }
    }

    public final void P0() {
        md6 md6Var;
        sd6 sd6Var = this.f;
        od6.Y(sd6Var.a, false, 7);
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

    @Override // defpackage.mw8, defpackage.w27
    public final Object S() {
        return this.U;
    }

    public final void S0() {
        kd6 kd6Var;
        this.Y = true;
        sd6 sd6Var = this.f;
        od6 v = sd6Var.a.v();
        vy6 vy6Var = this.N;
        if ((vy6Var != vy6.a && !sd6Var.c) || (vy6Var != vy6.b && sd6Var.c)) {
            N0();
            if (this.C && v != null) {
                v.X(false);
            }
        }
        if (v != null) {
            sd6 sd6Var2 = v.d0;
            if (!this.C && ((kd6Var = sd6Var2.d) == kd6.c || kd6Var == kd6.d)) {
                if (this.E != Integer.MAX_VALUE) {
                    lv5.c("Place was called on a node which was placed already");
                }
                int i = sd6Var2.h;
                this.E = i;
                sd6Var2.h = i + 1;
            }
        } else {
            this.E = 0;
        }
        d0();
    }

    public final void T0(long j, xt4 xt4Var, p15 p15Var) {
        kd6 kd6Var;
        sd6 sd6Var = this.f;
        od6 od6Var = sd6Var.a;
        od6 od6Var2 = sd6Var.a;
        try {
            od6 v = od6Var.v();
            if (v != null) {
                kd6Var = v.d0.d;
            } else {
                kd6Var = null;
            }
            kd6 kd6Var2 = kd6.d;
            if (kd6Var == kd6Var2) {
                sd6Var.c = false;
            }
            if (od6Var2.n0) {
                lv5.a("place is called on a deactivated node");
            }
            sd6Var.d = kd6Var2;
            boolean z = true;
            this.H = true;
            this.Y = false;
            if (!py5.b(j, this.K)) {
                if (sd6Var.n || sd6Var.m) {
                    sd6Var.f = true;
                }
                O0();
            }
            wg8 a = rd6.a(od6Var2);
            this.K = j;
            if (!sd6Var.f) {
                if (this.N == vy6.c) {
                    z = false;
                }
                if (z) {
                    ty6 C1 = sd6Var.a().C1();
                    C1.getClass();
                    C1.w1(py5.d(j, C1.e));
                    S0();
                    this.L = xt4Var;
                    this.M = p15Var;
                    sd6Var.d = kd6.e;
                }
            }
            sd6Var.h(false);
            this.O.g = false;
            yg8 snapshotObserver = ((rg) a).getSnapshotObserver();
            snapshotObserver.a.d(od6Var2, snapshotObserver.g, this.X);
            this.L = xt4Var;
            this.M = p15Var;
            sd6Var.d = kd6.e;
        } catch (Throwable th) {
            od6Var.d0(th);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:8:0x0013, B:11:0x001f, B:16:0x0027, B:18:0x002f, B:24:0x003e, B:26:0x0042, B:27:0x0047, B:21:0x0035, B:29:0x004b, B:31:0x0064, B:32:0x0076, B:34:0x007a, B:36:0x0082, B:40:0x0094, B:42:0x00b1, B:39:0x008f), top: B:49:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064 A[Catch: all -> 0x0010, LOOP:0: B:30:0x0062->B:31:0x0064, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:8:0x0013, B:11:0x001f, B:16:0x0027, B:18:0x002f, B:24:0x003e, B:26:0x0042, B:27:0x0047, B:21:0x0035, B:29:0x004b, B:31:0x0064, B:32:0x0076, B:34:0x007a, B:36:0x0082, B:40:0x0094, B:42:0x00b1, B:39:0x008f), top: B:49:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:8:0x0013, B:11:0x001f, B:16:0x0027, B:18:0x002f, B:24:0x003e, B:26:0x0042, B:27:0x0047, B:21:0x0035, B:29:0x004b, B:31:0x0064, B:32:0x0076, B:34:0x007a, B:36:0x0082, B:40:0x0094, B:42:0x00b1, B:39:0x008f), top: B:49:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:8:0x0013, B:11:0x001f, B:16:0x0027, B:18:0x002f, B:24:0x003e, B:26:0x0042, B:27:0x0047, B:21:0x0035, B:29:0x004b, B:31:0x0064, B:32:0x0076, B:34:0x007a, B:36:0x0082, B:40:0x0094, B:42:0x00b1, B:39:0x008f), top: B:49:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean U0(long r14) {
        /*
            r13 = this;
            sd6 r0 = r13.f
            od6 r1 = r0.a
            od6 r2 = r0.a
            boolean r3 = r1.n0     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L13
            java.lang.String r3 = "measure is called on a deactivated node"
            defpackage.lv5.a(r3)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r13 = move-exception
            goto Lbb
        L13:
            od6 r3 = r2.v()     // Catch: java.lang.Throwable -> L10
            boolean r4 = r2.b0     // Catch: java.lang.Throwable -> L10
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L26
            if (r3 == 0) goto L24
            boolean r3 = r3.b0     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L24
            goto L26
        L24:
            r3 = r6
            goto L27
        L26:
            r3 = r5
        L27:
            r2.b0 = r3     // Catch: java.lang.Throwable -> L10
            sd6 r3 = r2.d0     // Catch: java.lang.Throwable -> L10
            boolean r3 = r3.e     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L4b
            x02 r3 = r13.J     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L35
            r3 = r6
            goto L3b
        L35:
            long r3 = r3.a     // Catch: java.lang.Throwable -> L10
            boolean r3 = defpackage.x02.c(r3, r14)     // Catch: java.lang.Throwable -> L10
        L3b:
            if (r3 != 0) goto L3e
            goto L4b
        L3e:
            wg8 r13 = r2.K     // Catch: java.lang.Throwable -> L10
            if (r13 == 0) goto L47
            rg r13 = (defpackage.rg) r13     // Catch: java.lang.Throwable -> L10
            r13.i(r2, r5)     // Catch: java.lang.Throwable -> L10
        L47:
            r2.c0()     // Catch: java.lang.Throwable -> L10
            return r6
        L4b:
            x02 r3 = new x02     // Catch: java.lang.Throwable -> L10
            r3.<init>(r14)     // Catch: java.lang.Throwable -> L10
            r13.J = r3     // Catch: java.lang.Throwable -> L10
            r13.E0(r14)     // Catch: java.lang.Throwable -> L10
            pd6 r3 = r13.O     // Catch: java.lang.Throwable -> L10
            r3.f = r6     // Catch: java.lang.Throwable -> L10
            gw7 r2 = r2.z()     // Catch: java.lang.Throwable -> L10
            java.lang.Object[] r3 = r2.a     // Catch: java.lang.Throwable -> L10
            int r2 = r2.c     // Catch: java.lang.Throwable -> L10
            r4 = r6
        L62:
            if (r4 >= r2) goto L76
            r7 = r3[r4]     // Catch: java.lang.Throwable -> L10
            od6 r7 = (defpackage.od6) r7     // Catch: java.lang.Throwable -> L10
            sd6 r7 = r7.d0     // Catch: java.lang.Throwable -> L10
            xy6 r7 = r7.q     // Catch: java.lang.Throwable -> L10
            r7.getClass()     // Catch: java.lang.Throwable -> L10
            pd6 r7 = r7.O     // Catch: java.lang.Throwable -> L10
            r7.c = r6     // Catch: java.lang.Throwable -> L10
            int r4 = r4 + 1
            goto L62
        L76:
            boolean r2 = r13.I     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L7d
            long r2 = r13.c     // Catch: java.lang.Throwable -> L10
            goto L82
        L7d:
            r2 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
        L82:
            r13.I = r5     // Catch: java.lang.Throwable -> L10
            i38 r4 = r0.a()     // Catch: java.lang.Throwable -> L10
            ty6 r4 = r4.C1()     // Catch: java.lang.Throwable -> L10
            if (r4 == 0) goto L8f
            goto L94
        L8f:
            java.lang.String r7 = "Lookahead result from lookaheadRemeasure cannot be null"
            defpackage.lv5.c(r7)     // Catch: java.lang.Throwable -> L10
        L94:
            r0.c(r14)     // Catch: java.lang.Throwable -> L10
            int r14 = r4.a     // Catch: java.lang.Throwable -> L10
            int r15 = r4.b     // Catch: java.lang.Throwable -> L10
            long r7 = (long) r14     // Catch: java.lang.Throwable -> L10
            r14 = 32
            long r7 = r7 << r14
            long r9 = (long) r15     // Catch: java.lang.Throwable -> L10
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r11
            long r7 = r7 | r9
            r13.A0(r7)     // Catch: java.lang.Throwable -> L10
            long r13 = r2 >> r14
            int r13 = (int) r13     // Catch: java.lang.Throwable -> L10
            int r14 = r4.a     // Catch: java.lang.Throwable -> L10
            if (r13 != r14) goto Lba
            long r13 = r2 & r11
            int r13 = (int) r13     // Catch: java.lang.Throwable -> L10
            int r14 = r4.b     // Catch: java.lang.Throwable -> L10
            if (r13 == r14) goto Lb9
            goto Lba
        Lb9:
            return r6
        Lba:
            return r5
        Lbb:
            r1.d0(r13)
            r13 = 0
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy6.U0(long):boolean");
    }

    @Override // defpackage.kc
    public final void a0(jc jcVar) {
        gw7 z = this.f.a.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            xy6 xy6Var = ((od6) objArr[i2]).d0.q;
            xy6Var.getClass();
            jcVar.invoke(xy6Var);
        }
    }

    @Override // defpackage.qr7
    public final void b0(boolean z) {
        Boolean bool;
        ty6 C1;
        sd6 sd6Var = this.f;
        ty6 C12 = sd6Var.a().C1();
        if (C12 != null) {
            bool = Boolean.valueOf(C12.H);
        } else {
            bool = null;
        }
        if (!Boolean.valueOf(z).equals(bool) && (C1 = sd6Var.a().C1()) != null) {
            C1.H = z;
        }
    }

    @Override // defpackage.kc
    public final void d0() {
        x02 x02Var;
        this.R = true;
        pd6 pd6Var = this.O;
        pd6Var.h();
        sd6 sd6Var = this.f;
        boolean z = sd6Var.f;
        od6 od6Var = sd6Var.a;
        if (z) {
            gw7 z2 = od6Var.z();
            Object[] objArr = z2.a;
            int i = z2.c;
            for (int i2 = 0; i2 < i; i2++) {
                od6 od6Var2 = (od6) objArr[i2];
                sd6 sd6Var2 = od6Var2.d0;
                if (sd6Var2.e && od6Var2.t() == md6.a) {
                    xy6 xy6Var = sd6Var2.q;
                    xy6Var.getClass();
                    xy6 xy6Var2 = sd6Var2.q;
                    if (xy6Var2 != null) {
                        x02Var = xy6Var2.J;
                    } else {
                        x02Var = null;
                    }
                    x02Var.getClass();
                    if (xy6Var.U0(x02Var.a)) {
                        od6.Y(od6Var, false, 7);
                    }
                }
            }
        }
        vv5 vv5Var = n().v0;
        vv5Var.getClass();
        if (sd6Var.g || (!this.G && !vv5Var.K && sd6Var.f)) {
            sd6Var.f = false;
            kd6 kd6Var = sd6Var.d;
            sd6Var.d = kd6.d;
            sd6Var.i(false);
            yg8 snapshotObserver = ((rg) rd6.a(od6Var)).getSnapshotObserver();
            snapshotObserver.a.d(od6Var, snapshotObserver.h, this.S);
            sd6Var.d = kd6Var;
            if (sd6Var.m && vv5Var.K) {
                requestLayout();
            }
            sd6Var.g = false;
        }
        if (pd6Var.d) {
            pd6Var.e = true;
        }
        if (pd6Var.b && pd6Var.e()) {
            pd6Var.g();
        }
        this.R = false;
    }

    @Override // defpackage.kc
    public final pd6 g() {
        return this.O;
    }

    @Override // defpackage.w27
    public final int j(int i) {
        P0();
        ty6 C1 = this.f.a().C1();
        C1.getClass();
        return C1.j(i);
    }

    @Override // defpackage.kc
    public final void m0() {
        od6.Y(this.f.a, false, 7);
    }

    @Override // defpackage.kc
    public final wv5 n() {
        return (wv5) this.f.a.c0.d;
    }

    @Override // defpackage.w27
    public final int n0(int i) {
        P0();
        ty6 C1 = this.f.a().C1();
        C1.getClass();
        return C1.n0(i);
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
        kd6 kd6Var3 = kd6.b;
        pd6 pd6Var = this.O;
        if (kd6Var == kd6Var3) {
            pd6Var.c = true;
        } else {
            od6 v2 = sd6Var.a.v();
            if (v2 != null) {
                kd6Var2 = v2.d0.d;
            }
            if (kd6Var2 == kd6.d) {
                pd6Var.d = true;
            }
        }
        this.G = true;
        ty6 C1 = sd6Var.a().C1();
        C1.getClass();
        int o0 = C1.o0(ecVar);
        this.G = false;
        return o0;
    }

    @Override // defpackage.kc
    public final kc p() {
        sd6 sd6Var;
        od6 v = this.f.a.v();
        if (v != null && (sd6Var = v.d0) != null) {
            return sd6Var.q;
        }
        return null;
    }

    @Override // defpackage.kc
    public final void requestLayout() {
        this.f.a.X(false);
    }

    @Override // defpackage.mw8
    public final int u0() {
        ty6 C1 = this.f.a().C1();
        C1.getClass();
        return C1.u0();
    }

    @Override // defpackage.mw8
    public final int v0() {
        ty6 C1 = this.f.a().C1();
        C1.getClass();
        return C1.v0();
    }

    @Override // defpackage.mw8
    public final void x0(long j, float f, xt4 xt4Var) {
        T0(j, xt4Var, null);
    }

    @Override // defpackage.mw8
    public final void z0(long j, float f, p15 p15Var) {
        T0(j, null, p15Var);
    }
}
