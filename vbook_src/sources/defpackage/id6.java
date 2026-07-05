package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: id6  reason: default package */
/* loaded from: classes.dex */
public final class id6 extends i38 {
    public static final ljc y0;
    public fd6 u0;
    public x02 v0;
    public gd6 w0;
    public wy x0;

    static {
        ljc c = lre.c();
        int i = zl1.j;
        c.p(zl1.g);
        c.w(1.0f);
        c.x(1);
        y0 = c;
    }

    public id6(od6 od6Var, fd6 fd6Var) {
        super(od6Var);
        gd6 gd6Var;
        this.u0 = fd6Var;
        if (od6Var.E != null) {
            gd6Var = new gd6(this);
        } else {
            gd6Var = null;
        }
        this.w0 = gd6Var;
        this.x0 = (((mq7) fd6Var).a.c & 512) != 0 ? new wy(this, (cga) fd6Var) : null;
    }

    @Override // defpackage.i38
    public final ty6 C1() {
        return this.w0;
    }

    @Override // defpackage.i38
    public final mq7 E1() {
        return ((mq7) this.u0).a;
    }

    @Override // defpackage.w27
    public final int F(int i) {
        wy wyVar = this.x0;
        if (wyVar != null) {
            cga cgaVar = wyVar.b;
            i38 i38Var = this.R;
            i38Var.getClass();
            i38 i38Var2 = cgaVar.a.D;
            i38Var2.getClass();
            ty6 C1 = i38Var2.C1();
            C1.getClass();
            if (C1.T0()) {
                return cgaVar.H1(new ty(wyVar, wyVar.getLayoutDirection()), new qu2(i38Var, q38.a, r38.a, 2), y02.b(0, 0, 0, i, 7)).e();
            }
            return i38Var.F(i);
        }
        fd6 fd6Var = this.u0;
        i38 i38Var3 = this.R;
        i38Var3.getClass();
        return fd6Var.a1(this, i38Var3, i);
    }

    @Override // defpackage.w27
    public final int J(int i) {
        wy wyVar = this.x0;
        if (wyVar != null) {
            cga cgaVar = wyVar.b;
            i38 i38Var = this.R;
            i38Var.getClass();
            i38 i38Var2 = cgaVar.a.D;
            i38Var2.getClass();
            ty6 C1 = i38Var2.C1();
            C1.getClass();
            if (C1.T0()) {
                return cgaVar.H1(new ty(wyVar, wyVar.getLayoutDirection()), new qu2(i38Var, q38.b, r38.a, 2), y02.b(0, 0, 0, i, 7)).e();
            }
            return i38Var.J(i);
        }
        fd6 fd6Var = this.u0;
        i38 i38Var3 = this.R;
        i38Var3.getClass();
        return fd6Var.z(this, i38Var3, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
        if (r10 == r2.b) goto L25;
     */
    @Override // defpackage.w27
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.mw8 M(long r9) {
        /*
            r8 = this;
            boolean r0 = r8.Q
            r1 = 0
            if (r0 == 0) goto L12
            x02 r9 = r8.v0
            if (r9 == 0) goto Lc
            long r9 = r9.a
            goto L12
        Lc:
            java.lang.String r8 = "Lookahead constraints cannot be null in approach pass."
            defpackage.vs.m(r8)
            return r1
        L12:
            r8.E0(r9)
            wy r0 = r8.x0
            if (r0 == 0) goto Lc5
            cga r2 = r0.b
            id6 r3 = r0.a
            gd6 r3 = r3.w0
            r3.getClass()
            c37 r3 = r3.V0()
            r3.e()
            r3.d()
            kga r3 = r2.M
            boolean r3 = r3.h()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L51
            kga r3 = r2.M
            jga r3 = r3.e()
            boolean r3 = r3.a()
            if (r3 == 0) goto L51
            kga r3 = r2.M
            jga r3 = r3.e()
            lha r3 = r3.b
            boolean r3 = r3.b()
            if (r3 == 0) goto L51
            goto L5c
        L51:
            x02 r3 = r8.v0
            if (r3 != 0) goto L56
            goto L5c
        L56:
            long r6 = r3.a
            int r3 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r3 == 0) goto L5e
        L5c:
            r3 = r4
            goto L5f
        L5e:
            r3 = r5
        L5f:
            r0.c = r3
            if (r3 != 0) goto L6a
            i38 r3 = r8.R
            r3.getClass()
            r3.Q = r4
        L6a:
            i38 r3 = r8.R
            r3.getClass()
            c37 r9 = r2.H1(r0, r3, r9)
            i38 r10 = r8.R
            r10.getClass()
            r10.Q = r5
            int r10 = r9.e()
            gd6 r2 = r8.w0
            r2.getClass()
            int r2 = r2.a
            if (r10 != r2) goto L95
            int r10 = r9.d()
            gd6 r2 = r8.w0
            r2.getClass()
            int r2 = r2.b
            if (r10 != r2) goto L95
            goto L96
        L95:
            r4 = r5
        L96:
            boolean r10 = r0.c
            if (r10 != 0) goto Ld0
            i38 r10 = r8.R
            r10.getClass()
            long r2 = r10.c
            i38 r10 = r8.R
            r10.getClass()
            ty6 r10 = r10.C1()
            if (r10 == 0) goto Lb6
            long r0 = r10.q1()
            zy5 r10 = new zy5
            r10.<init>(r0)
            r1 = r10
        Lb6:
            boolean r10 = defpackage.zy5.a(r1, r2)
            if (r10 == 0) goto Ld0
            if (r4 != 0) goto Ld0
            hd6 r10 = new hd6
            r10.<init>(r9, r8)
            r9 = r10
            goto Ld0
        Lc5:
            fd6 r0 = r8.u0
            i38 r1 = r8.R
            r1.getClass()
            c37 r9 = r0.n(r8, r1, r9)
        Ld0:
            r8.X1(r9)
            r8.O1()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.id6.M(long):mw8");
    }

    @Override // defpackage.ry6
    public final int M0(ec ecVar) {
        gd6 gd6Var = this.w0;
        if (gd6Var != null) {
            gv7 gv7Var = gd6Var.T;
            int d = gv7Var.d(ecVar);
            if (d >= 0) {
                return gv7Var.c[d];
            }
            return Integer.MIN_VALUE;
        }
        return pbe.d(this, ecVar);
    }

    @Override // defpackage.i38
    public final void T1(k61 k61Var, p15 p15Var) {
        i38 i38Var;
        i38 i38Var2 = this.R;
        i38Var2.getClass();
        i38Var2.x1(k61Var, p15Var);
        if (((rg) rd6.a(this.O)).getShowLayoutBounds() && (i38Var = this.R) != null) {
            if (!zy5.b(this.c, i38Var.c) || !py5.b(i38Var.b0, 0L)) {
                long j = this.c;
                k61Var.g(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, y0);
            }
        }
    }

    public final void g2() {
        boolean z;
        zy5 zy5Var;
        if (this.J) {
            return;
        }
        P1();
        i38 i38Var = this.R;
        i38Var.getClass();
        wy wyVar = this.x0;
        if (wyVar != null) {
            this.w0.getClass();
            if (!wyVar.c) {
                long j = this.c;
                gd6 gd6Var = this.w0;
                zy5 zy5Var2 = null;
                if (gd6Var != null) {
                    zy5Var = new zy5(gd6Var.q1());
                } else {
                    zy5Var = null;
                }
                if (zy5.a(zy5Var, j)) {
                    long j2 = i38Var.c;
                    ty6 C1 = i38Var.C1();
                    if (C1 != null) {
                        zy5Var2 = new zy5(C1.q1());
                    }
                    if (zy5.a(zy5Var2, j2)) {
                        z = true;
                        i38Var.P = z;
                    }
                }
            }
            z = false;
            i38Var.P = z;
        }
        boolean z2 = i38Var.K;
        i38Var.K = this.K;
        V0().a();
        i38Var.K = z2;
        i38Var.P = false;
    }

    public final void h2(fd6 fd6Var) {
        if (!fd6Var.equals(this.u0)) {
            if ((((mq7) fd6Var).a.c & 512) != 0) {
                cga cgaVar = (cga) fd6Var;
                wy wyVar = this.x0;
                if (wyVar != null) {
                    wyVar.b = cgaVar;
                } else {
                    wyVar = new wy(this, cgaVar);
                }
                this.x0 = wyVar;
            } else {
                this.x0 = null;
            }
        }
        this.u0 = fd6Var;
    }

    @Override // defpackage.w27
    public final int j(int i) {
        wy wyVar = this.x0;
        if (wyVar != null) {
            cga cgaVar = wyVar.b;
            i38 i38Var = this.R;
            i38Var.getClass();
            i38 i38Var2 = cgaVar.a.D;
            i38Var2.getClass();
            ty6 C1 = i38Var2.C1();
            C1.getClass();
            if (C1.T0()) {
                return cgaVar.H1(new ty(wyVar, wyVar.getLayoutDirection()), new qu2(i38Var, q38.b, r38.b, 2), y02.b(0, i, 0, 0, 13)).d();
            }
            return i38Var.j(i);
        }
        fd6 fd6Var = this.u0;
        i38 i38Var3 = this.R;
        i38Var3.getClass();
        return fd6Var.H0(this, i38Var3, i);
    }

    @Override // defpackage.w27
    public final int n0(int i) {
        wy wyVar = this.x0;
        if (wyVar != null) {
            cga cgaVar = wyVar.b;
            i38 i38Var = this.R;
            i38Var.getClass();
            i38 i38Var2 = cgaVar.a.D;
            i38Var2.getClass();
            ty6 C1 = i38Var2.C1();
            C1.getClass();
            if (C1.T0()) {
                return cgaVar.H1(new ty(wyVar, wyVar.getLayoutDirection()), new qu2(i38Var, q38.a, r38.b, 2), y02.b(0, i, 0, 0, 13)).d();
            }
            return i38Var.n0(i);
        }
        fd6 fd6Var = this.u0;
        i38 i38Var3 = this.R;
        i38Var3.getClass();
        return fd6Var.P0(this, i38Var3, i);
    }

    @Override // defpackage.mw8
    public final void x0(long j, float f, xt4 xt4Var) {
        if (this.P) {
            ty6 C1 = C1();
            C1.getClass();
            U1(C1.P, f, xt4Var, null);
        } else {
            U1(j, f, xt4Var, null);
        }
        g2();
    }

    @Override // defpackage.i38, defpackage.mw8
    public final void z0(long j, float f, p15 p15Var) {
        id6 id6Var;
        if (this.P) {
            ty6 C1 = C1();
            C1.getClass();
            id6Var = this;
            id6Var.U1(C1.P, f, null, p15Var);
        } else {
            id6Var = this;
            id6Var.U1(j, f, null, p15Var);
        }
        id6Var.g2();
    }

    @Override // defpackage.i38
    public final void z1() {
        if (this.w0 == null) {
            this.w0 = new gd6(this);
        }
    }
}
