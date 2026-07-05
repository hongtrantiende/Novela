package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lrb  reason: default package */
/* loaded from: classes.dex */
public final class lrb extends m03 implements fd6, zj3, wx1, hz4, z7a {
    public boolean M;
    public boolean N;
    public hvb O;
    public mkc P;
    public ytb Q;
    public hy0 R;
    public boolean S;
    public k2a T;
    public ff8 U;
    public sfc V;
    public sx8 W;
    public ee2 X;
    public iya Y;
    public fxb Z;
    public rk9 a0 = new rk9(-1.0f, -1.0f, -1.0f, -1.0f);
    public int b0;
    public int c0;
    public final qsb d0;
    public final epb e0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [m03, java.lang.Object, lrb] */
    /* JADX WARN: Type inference failed for: r2v3, types: [qsb, f03] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public lrb(boolean z, boolean z2, boolean z3, hvb hvbVar, mkc mkcVar, ytb ytbVar, hy0 hy0Var, boolean z4, k2a k2aVar, ff8 ff8Var, sfc sfcVar, sx8 sx8Var) {
        boolean z5;
        ssb ssbVar;
        this.M = z;
        this.N = z2;
        this.O = hvbVar;
        this.P = mkcVar;
        this.Q = ytbVar;
        this.R = hy0Var;
        this.S = z4;
        this.T = k2aVar;
        this.U = ff8Var;
        this.V = sfcVar;
        this.W = sx8Var;
        if (!z && !z2 && !z3) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (yz6.a()) {
            ssbVar = new ssb(mkcVar, ytbVar, hvbVar, z5);
        } else {
            ssbVar = new m03();
        }
        H1(ssbVar);
        this.d0 = ssbVar;
        epb epbVar = new epb(this.V, new h21(this, null, 5), new kq(this, null, 4), new ux9((Object) this, 27));
        H1(epbVar);
        this.e0 = epbVar;
    }

    public final boolean K1() {
        if (this.S) {
            if (this.M || this.N) {
                hy0 hy0Var = this.R;
                if (!(hy0Var instanceof esa) || ((esa) hy0Var).a != 16) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void L1() {
        if (this.X == null) {
            this.X = new ee2(((Boolean) nye.q(this, dy1.y)).booleanValue());
            hud.o(this);
        }
        this.Y = z87.v(v1(), null, null, new ov9(this, (m42) null, 14), 3);
    }

    public final void M1(lw8 lw8Var, int i, int i2, long j, tc6 tc6Var) {
        int i3;
        fvb c;
        boolean z;
        float f;
        boolean z2;
        float f2;
        float f3;
        int i4;
        float f4;
        boolean z3 = false;
        Integer num = 0;
        this.T.b.i(i);
        this.T.f(i2 - i);
        fxb fxbVar = this.Z;
        if (fxbVar != null) {
            int i5 = fxb.c;
            int i6 = (int) (j & 4294967295L);
            long j2 = fxbVar.a;
            if (i6 == ((int) (j2 & 4294967295L))) {
                i3 = (int) (j >> 32);
                if (i3 == ((int) (j2 >> 32)) && i2 == this.b0 && i == this.c0) {
                    i3 = -1;
                }
                if (i3 < 0 && K1() && (c = this.O.c()) != null) {
                    ry5 ry5Var = new ry5(0, c.a.a.b.length(), 1);
                    if (!ry5Var.isEmpty()) {
                        if (i3 < num.intValue()) {
                            i3 = num.intValue();
                        } else {
                            int i7 = ry5Var.b;
                            if (i3 > Integer.valueOf(i7).intValue()) {
                                i3 = Integer.valueOf(i7).intValue();
                            }
                        }
                        rk9 c2 = c.c(i3);
                        float f5 = c2.a;
                        float f6 = c2.c;
                        if (tc6Var == tc6.b) {
                            z = true;
                        } else {
                            z = false;
                        }
                        int X0 = lw8Var.X0(2.0f);
                        if (z) {
                            f = i2 - f6;
                        } else {
                            f = f5;
                        }
                        if (z) {
                            f5 = i2 - f6;
                        }
                        float f7 = f5 + X0;
                        float f8 = i2;
                        if (f7 > f8) {
                            f7 = f8;
                        }
                        rk9 b = rk9.b(c2, f, f7, nae.e, 10);
                        float f9 = b.b;
                        float f10 = b.a;
                        rk9 rk9Var = this.a0;
                        if (f10 == rk9Var.a && f9 == rk9Var.b && i2 == this.b0) {
                            z2 = false;
                        } else {
                            z2 = false;
                            z3 = true;
                        }
                        if (z3 || i != this.c0) {
                            if (this.U == ff8.a) {
                                z2 = true;
                            }
                            if (!z2) {
                                f9 = f10;
                            }
                            if (z2) {
                                f2 = b.d;
                            } else {
                                f2 = b.c;
                            }
                            int h = this.T.a.h();
                            float f11 = h + i;
                            if (f2 > f11 || (f9 < h && f2 - f9 > i)) {
                                f4 = f2 - f11;
                            } else if (i4 < 0 && f2 - f9 <= i) {
                                f4 = f9 - f3;
                            } else {
                                f4 = nae.e;
                            }
                            this.Z = new fxb(j);
                            this.a0 = b;
                            this.c0 = i;
                            this.b0 = i2;
                            z87.v(v1(), null, p82.d, new krb(f4, this, z3, j, c2, null), 1);
                            return;
                        }
                        return;
                    }
                    cp8.n(ry5Var, "Cannot coerce value to an empty range: ");
                    return;
                }
                return;
            }
        }
        int i8 = fxb.c;
        i3 = (int) (j & 4294967295L);
        if (i3 < 0) {
        }
    }

    @Override // defpackage.zj3
    public final void V0(qd6 qd6Var) {
        int g;
        int f;
        float f2;
        n61 n61Var = qd6Var.a;
        qd6Var.a();
        grb f3 = this.P.f();
        fvb c = this.O.c();
        if (c == null) {
            return;
        }
        yk8 yk8Var = f3.C;
        yk8 yk8Var2 = f3.C;
        long j = f3.e;
        if (yk8Var != null) {
            int i = ((oub) yk8Var.a).a;
            long j2 = ((fxb) yk8Var.b).a;
            if (!fxb.d(j2)) {
                yj j3 = c.j(fxb.g(j2), fxb.f(j2));
                oyb oybVar = c.a.b;
                if (i == 1) {
                    hy0 b = oybVar.b();
                    if (b != null) {
                        ak3.N(qd6Var, j3, b, 0.2f, null, null, 0, 56);
                    } else {
                        long c2 = oybVar.c();
                        if (c2 == 16) {
                            c2 = zl1.b;
                        }
                        ak3.t1(qd6Var, j3, zl1.b(zl1.d(c2) * 0.2f, c2), nae.e, null, 60);
                    }
                } else {
                    ak3.t1(qd6Var, j3, ((wxb) nye.q(this, xxb.a)).b, nae.e, null, 60);
                }
            }
        }
        if (fxb.d(j)) {
            bze.p(n61Var.b.w(), c);
            if (yk8Var2 == null) {
                hy0 hy0Var = this.R;
                boolean K1 = K1();
                ee2 ee2Var = this.X;
                ytb ytbVar = this.Q;
                if (ee2Var != null) {
                    f2 = ee2Var.c.h();
                } else {
                    f2 = 0.0f;
                }
                if (f2 != nae.e && K1) {
                    rk9 k = ytbVar.k();
                    ak3.u1(qd6Var, hy0Var, k.i(), k.c(), k.c - k.a, f2, 432);
                }
            }
        } else {
            if (yk8Var2 == null && (g = fxb.g(j)) != (f = fxb.f(j))) {
                ak3.t1(qd6Var, c.j(g, f), ((wxb) nye.q(this, xxb.a)).b, nae.e, null, 60);
            }
            bze.p(n61Var.b.w(), c);
        }
        this.d0.V0(qd6Var);
    }

    @Override // defpackage.z7a
    public final void m1(l8a l8aVar) {
        this.d0.m1(l8aVar);
    }

    @Override // defpackage.fd6
    public final c37 n(final e37 e37Var, w27 w27Var, long j) {
        ff8 ff8Var = this.U;
        ff8 ff8Var2 = ff8.a;
        ls3 ls3Var = ls3.a;
        if (ff8Var == ff8Var2) {
            final mw8 M = w27Var.M(x02.b(j, 0, 0, 0, Integer.MAX_VALUE, 7));
            final int min = Math.min(M.b, x02.h(j));
            return e37Var.q0(M.a, min, ls3Var, new xt4(this) { // from class: jrb
                public final /* synthetic */ lrb b;

                {
                    this.b = this;
                }

                @Override // defpackage.xt4
                public final Object invoke(Object obj) {
                    int i = r5;
                    pvc pvcVar = pvc.a;
                    e37 e37Var2 = e37Var;
                    mw8 mw8Var = M;
                    switch (i) {
                        case 0:
                            lw8 lw8Var = (lw8) obj;
                            int i2 = mw8Var.a;
                            lrb lrbVar = this.b;
                            lrbVar.M1(lw8Var, min, i2, lrbVar.P.f().e, e37Var2.getLayoutDirection());
                            lw8.z(lw8Var, mw8Var, -lrbVar.T.a.h(), 0);
                            return pvcVar;
                        default:
                            lw8 lw8Var2 = (lw8) obj;
                            int i3 = mw8Var.b;
                            lrb lrbVar2 = this.b;
                            lrbVar2.M1(lw8Var2, min, i3, lrbVar2.P.f().e, e37Var2.getLayoutDirection());
                            lw8.z(lw8Var2, mw8Var, 0, -lrbVar2.T.a.h());
                            return pvcVar;
                    }
                }
            });
        }
        final mw8 M2 = w27Var.M(x02.b(j, 0, Integer.MAX_VALUE, 0, 0, 13));
        final int min2 = Math.min(M2.a, x02.i(j));
        return e37Var.q0(min2, M2.b, ls3Var, new xt4(this) { // from class: jrb
            public final /* synthetic */ lrb b;

            {
                this.b = this;
            }

            @Override // defpackage.xt4
            public final Object invoke(Object obj) {
                int i = r5;
                pvc pvcVar = pvc.a;
                e37 e37Var2 = e37Var;
                mw8 mw8Var = M2;
                switch (i) {
                    case 0:
                        lw8 lw8Var = (lw8) obj;
                        int i2 = mw8Var.a;
                        lrb lrbVar = this.b;
                        lrbVar.M1(lw8Var, min2, i2, lrbVar.P.f().e, e37Var2.getLayoutDirection());
                        lw8.z(lw8Var, mw8Var, -lrbVar.T.a.h(), 0);
                        return pvcVar;
                    default:
                        lw8 lw8Var2 = (lw8) obj;
                        int i3 = mw8Var.b;
                        lrb lrbVar2 = this.b;
                        lrbVar2.M1(lw8Var2, min2, i3, lrbVar2.P.f().e, e37Var2.getLayoutDirection());
                        lw8.z(lw8Var2, mw8Var, 0, -lrbVar2.T.a.h());
                        return pvcVar;
                }
            }
        });
    }

    @Override // defpackage.hz4
    public final void t(i38 i38Var) {
        this.O.e.setValue(i38Var);
        this.d0.t(i38Var);
    }

    @Override // defpackage.mq7
    public final void z1() {
        ytb ytbVar = this.Q;
        boolean z = this.M;
        ytbVar.h = z;
        if (z && K1()) {
            L1();
        }
    }
}
