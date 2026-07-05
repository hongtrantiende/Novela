package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s41  reason: default package */
/* loaded from: classes.dex */
public final class s41 extends mq7 implements r78, gz0, zj3 {
    public final u41 K;
    public boolean L;
    public xt4 M;

    public s41(u41 u41Var, xt4 xt4Var) {
        this.K = u41Var;
        this.M = xt4Var;
        u41Var.a = this;
    }

    @Override // defpackage.f03
    public final void A0() {
        H1();
    }

    @Override // defpackage.mq7
    public final void B1() {
        H1();
    }

    public final void H1() {
        this.L = false;
        this.K.b = null;
        hud.o(this);
    }

    @Override // defpackage.r78
    public final void S0() {
        H1();
    }

    @Override // defpackage.zj3
    public final void V0(qd6 qd6Var) {
        boolean z = this.L;
        u41 u41Var = this.K;
        if (!z) {
            u41Var.b = null;
            iue.R(this, new hg(4, this, u41Var));
            if (u41Var.b != null) {
                this.L = true;
            } else {
                throw a82.f("DrawResult not defined, did you forget to call onDraw?");
            }
        }
        fz4 fz4Var = u41Var.b;
        fz4Var.getClass();
        ((xt4) fz4Var.a).invoke(qd6Var);
    }

    @Override // defpackage.gz0
    public final long b() {
        return eg0.A(voe.s(this, 4).c);
    }

    @Override // defpackage.gz0
    public final r13 f() {
        return voe.v(this).V;
    }

    @Override // defpackage.gz0
    public final tc6 getLayoutDirection() {
        return voe.v(this).W;
    }

    @Override // defpackage.f03
    public final void p() {
        H1();
    }

    @Override // defpackage.zj3
    public final void v0() {
        H1();
    }

    @Override // defpackage.mq7
    public final void A1() {
    }
}
