package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: epb  reason: default package */
/* loaded from: classes.dex */
public final class epb extends m03 implements wx1, oob {
    public sfc M;
    public xt4 N;
    public xt4 O;
    public xt4 P;
    public iya Q;
    public final h23 R = yae.q(new imb(this, 4));
    public rk9 S = rk9.e;

    public epb(sfc sfcVar, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3) {
        this.M = sfcVar;
        this.N = xt4Var;
        this.O = xt4Var2;
        this.P = xt4Var3;
    }

    @Override // defpackage.mq7
    public final void A1() {
        sfc sfcVar = this.M;
        sfcVar.b = rfc.b;
        sfcVar.a = null;
    }

    @Override // defpackage.oob
    public final long E(sc6 sc6Var) {
        return J(sc6Var).j();
    }

    @Override // defpackage.oob
    public final rk9 J(sc6 sc6Var) {
        if (!this.J) {
            return this.S;
        }
        rk9 rk9Var = (rk9) this.P.invoke(sc6Var);
        if (rk9Var == null) {
            return this.S;
        }
        this.S = rk9Var;
        return rk9Var;
    }

    @Override // defpackage.oob
    public final nob z0() {
        return (nob) this.R.getValue();
    }

    @Override // defpackage.mq7
    public final void z1() {
        sfc sfcVar = this.M;
        sfcVar.b = rfc.c;
        sfcVar.a = this;
    }
}
