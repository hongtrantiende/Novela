package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cga  reason: default package */
/* loaded from: classes.dex */
public final class cga extends mq7 implements zj3, sq7, r78, wx1, fd6 {
    public rk9 K;
    public boolean L;
    public kga M;
    public final jma N;

    public cga(kga kgaVar) {
        this.M = kgaVar;
        jma jmaVar = new jma(ega.a);
        jmaVar.g.setValue(kgaVar);
        this.N = jmaVar;
    }

    @Override // defpackage.mq7
    public final void A1() {
        rk9 rk9Var;
        sc6 sc6Var = this.M.e().b.e;
        if (sc6Var != null) {
            if (sc6Var.t() && this.L) {
                rk9Var = npe.n(y78.i(voe.u(this).h0(0L), sc6Var.h0(0L)), eg0.A(voe.u(this).c));
            } else {
                rk9Var = null;
            }
            this.K = rk9Var;
        }
        J1(null);
        kga kgaVar = this.M;
        kgaVar.G = null;
        kgaVar.H = null;
        kgaVar.a.setValue(Boolean.FALSE);
        this.L = false;
    }

    @Override // defpackage.mq7
    public final void B1() {
        this.K = null;
        J1(null);
    }

    @Override // defpackage.sq7
    public final xpe E0() {
        return this.N;
    }

    public final c37 H1(uy uyVar, w27 w27Var, long j) {
        long j2;
        boolean z;
        rk9 c = this.M.d().c();
        if (c == null) {
            kl9 kl9Var = this.M.e().c;
            kl9Var.h();
            c = kl9Var.d().f((jga) kl9Var.c);
        }
        if (c != null) {
            long y = eg0.y(c.h());
            int i = (int) (y >> 32);
            int i2 = (int) (y & 4294967295L);
            if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
                boolean z2 = false;
                if (i < 0) {
                    i = 0;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (i2 >= 0) {
                    z2 = true;
                }
                if (!(z2 & z)) {
                    nv5.a("width and height must be >= 0");
                }
                j = y02.h(i, i, i2, i2);
            } else {
                cy7.g("Error: Infinite width/height is invalid. animated bounds: ", this.M.d().c(), ", current bounds: ", this.M.e().c.d().c());
                return null;
            }
        }
        mw8 M = w27Var.M(j);
        if (this.M.e().c.d().d()) {
            j2 = this.M.e().b.a.a(voe.u(this)).a();
            int i3 = M.a;
            int i4 = M.b;
            ((hha) this.M.f.getValue()).getClass();
        } else {
            j2 = (M.a << 32) | (M.b & 4294967295L);
        }
        return uyVar.q0((int) (j2 >> 32), (int) (j2 & 4294967295L), ls3.a, new bga(this, M));
    }

    public final sc6 I1() {
        sc6 sc6Var = this.M.e().b.e;
        if (sc6Var != null) {
            return sc6Var;
        }
        vs.m("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
        return null;
    }

    public final void J1(p15 p15Var) {
        p15 p15Var2 = (p15) this.M.I.getValue();
        if (!c16.i(p15Var, p15Var2)) {
            if (p15Var2 != null) {
                voe.t(this).a(p15Var2);
            }
            this.M.I.setValue(p15Var);
        }
    }

    public final void K1() {
        g99 g99Var = ega.a;
        kga kgaVar = this.M;
        ms3 ms3Var = ms3.f;
        jma jmaVar = this.N;
        if (jmaVar == ms3Var) {
            lv5.a("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!jmaVar.e(g99Var)) {
            lv5.a("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + g99Var + " was not found.");
        }
        if (g99Var != jmaVar.f) {
            lv5.c("Check failed.");
        }
        jmaVar.g.setValue(kgaVar);
        this.M.G = (kga) f0(g99Var);
        J1(null);
        this.L = false;
        this.M.H = this;
    }

    @Override // defpackage.r78
    public final void S0() {
        this.M.e().e();
        iue.R(this, this.M.e().i);
    }

    @Override // defpackage.zj3
    public final void V0(qd6 qd6Var) {
        iha ihaVar;
        rk9 c = this.M.e().c.d().c();
        boolean g = this.M.g();
        kga kgaVar = this.M;
        yj yjVar = null;
        if (!g) {
            kgaVar.F = null;
            J1(null);
            kga kgaVar2 = this.M;
            if (kgaVar2.e().c.d().d() && (kgaVar2.g() || !kgaVar2.f())) {
                return;
            }
            qd6Var.a();
            return;
        }
        if (c != null) {
            qd6Var.getLayoutDirection();
            r13 r13Var = voe.v(this).V;
            ((mha) kgaVar.D.getValue()).getClass();
            kga kgaVar3 = (kga) ((iha) this.M.E.getValue()).c.getValue();
            if (kgaVar3 != null) {
                kga kgaVar4 = kgaVar3.G;
                if (kgaVar4 != null) {
                    ihaVar = (iha) kgaVar4.E.getValue();
                } else {
                    ihaVar = null;
                }
                if (ihaVar != null) {
                    kga kgaVar5 = (kga) ihaVar.c.getValue();
                    if (kgaVar5 != null) {
                        yjVar = kgaVar5.F;
                    } else {
                        vs.m("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
                        return;
                    }
                }
            } else {
                vs.m("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
                return;
            }
        }
        kgaVar.F = yjVar;
        if (((p15) this.M.I.getValue()) == null) {
            J1(voe.t(this).c());
        }
        p15 p15Var = (p15) this.M.I.getValue();
        if (p15Var != null) {
            ak3.c1(qd6Var, p15Var, new ko9(qd6Var, c, this));
            kga kgaVar6 = this.M;
            if (kgaVar6.e().c.d().d() && (kgaVar6.g() || !kgaVar6.f())) {
                return;
            }
            npe.p(qd6Var, p15Var);
            return;
        }
        vs.k("Error: shared element does not have a layer for rendering in the overlay.");
    }

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        mw8 M = w27Var.M(j);
        return e37Var.q0(M.a, M.b, ls3.a, new bga(M, this));
    }

    @Override // defpackage.mq7
    public final void z1() {
        iue.R(this, this.M.e().i);
        K1();
        this.M.a.setValue(Boolean.TRUE);
    }
}
