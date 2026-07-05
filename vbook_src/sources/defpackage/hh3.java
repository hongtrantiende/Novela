package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hh3  reason: default package */
/* loaded from: classes.dex */
public final class hh3 extends mq7 implements rnc, ih3, oc6 {
    public final xt4 K;
    public hh3 L;
    public ih3 M;
    public long N;

    public hh3(jk jkVar, int i) {
        this.K = (i & 2) != 0 ? null : jkVar;
        this.N = 0L;
    }

    @Override // defpackage.mq7
    public final void A1() {
        this.M = null;
        this.L = null;
    }

    @Override // defpackage.rnc
    public final Object M() {
        return zj1.d;
    }

    @Override // defpackage.ih3
    public final void M0(bh3 bh3Var) {
        ih3 ih3Var = this.M;
        if (ih3Var != null) {
            ih3Var.M0(bh3Var);
        }
        hh3 hh3Var = this.L;
        if (hh3Var != null) {
            hh3Var.M0(bh3Var);
        }
        this.L = null;
    }

    @Override // defpackage.ih3
    public final void S(bh3 bh3Var) {
        ih3 ih3Var = this.M;
        if (ih3Var == null) {
            hh3 hh3Var = this.L;
            if (hh3Var != null) {
                hh3Var.S(bh3Var);
                return;
            }
            return;
        }
        ih3Var.S(bh3Var);
    }

    @Override // defpackage.ih3
    public final void T0(bh3 bh3Var) {
        ih3 ih3Var = this.M;
        if (ih3Var == null) {
            hh3 hh3Var = this.L;
            if (hh3Var != null) {
                hh3Var.T0(bh3Var);
                return;
            }
            return;
        }
        ih3Var.T0(bh3Var);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [zl9, java.lang.Object] */
    @Override // defpackage.ih3
    public final void U0(bh3 bh3Var) {
        rnc rncVar;
        hh3 hh3Var;
        hh3 hh3Var2 = this.L;
        if (hh3Var2 != null && rte.j(hh3Var2, tte.p(bh3Var))) {
            hh3Var = hh3Var2;
        } else {
            if (!this.a.J) {
                rncVar = null;
            } else {
                ?? obj = new Object();
                dae.H(this, new gp(4, obj, this, bh3Var));
                rncVar = (rnc) obj.a;
            }
            hh3Var = (hh3) rncVar;
        }
        if (hh3Var != null && hh3Var2 == null) {
            hh3Var.S(bh3Var);
            hh3Var.U0(bh3Var);
            ih3 ih3Var = this.M;
            if (ih3Var != null) {
                ih3Var.M0(bh3Var);
            }
        } else if (hh3Var == null && hh3Var2 != null) {
            ih3 ih3Var2 = this.M;
            if (ih3Var2 != null) {
                ih3Var2.S(bh3Var);
                ih3Var2.U0(bh3Var);
            }
            hh3Var2.M0(bh3Var);
        } else if (!c16.i(hh3Var, hh3Var2)) {
            if (hh3Var != null) {
                hh3Var.S(bh3Var);
                hh3Var.U0(bh3Var);
            }
            if (hh3Var2 != null) {
                hh3Var2.M0(bh3Var);
            }
        } else if (hh3Var != null) {
            hh3Var.U0(bh3Var);
        } else {
            ih3 ih3Var3 = this.M;
            if (ih3Var3 != null) {
                ih3Var3.U0(bh3Var);
            }
        }
        this.L = hh3Var;
    }

    @Override // defpackage.ih3
    public final void d0(bh3 bh3Var) {
        jc jcVar = new jc(bh3Var, 17);
        if (jcVar.invoke(this) != qnc.a) {
            return;
        }
        dae.H(this, jcVar);
    }

    @Override // defpackage.oc6, defpackage.i37
    public final void g(long j) {
        this.N = j;
    }

    @Override // defpackage.ih3
    public final boolean q1(bh3 bh3Var) {
        hh3 hh3Var = this.L;
        if (hh3Var == null) {
            ih3 ih3Var = this.M;
            if (ih3Var != null) {
                return ih3Var.q1(bh3Var);
            }
            return false;
        }
        return hh3Var.q1(bh3Var);
    }
}
