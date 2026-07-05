package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lg0  reason: default package */
/* loaded from: classes.dex */
public final class lg0 extends mq7 implements zj3, r78, z7a {
    public long K;
    public hy0 L;
    public float M;
    public wea N;
    public long O;
    public tc6 P;
    public kwe Q;
    public wea R;
    public kwe S;

    @Override // defpackage.z7a
    public final boolean F() {
        return false;
    }

    @Override // defpackage.r78
    public final void S0() {
        this.O = 9205357640488583168L;
        this.P = null;
        this.Q = null;
        this.R = null;
        hud.o(this);
    }

    @Override // defpackage.zj3
    public final void V0(qd6 qd6Var) {
        kwe kweVar;
        n61 n61Var = qd6Var.a;
        if (this.N == lre.g) {
            if (!zl1.c(this.K, zl1.i)) {
                ak3.R0(qd6Var, this.K, 0L, 0L, nae.e, null, 0, Token.ELSE);
            }
            hy0 hy0Var = this.L;
            if (hy0Var != null) {
                ak3.h1(qd6Var, hy0Var, 0L, 0L, this.M, null, null, 0, Token.AND);
            }
        } else {
            if (dna.a(n61Var.b(), this.O) && qd6Var.getLayoutDirection() == this.P && c16.i(this.R, this.N)) {
                kweVar = this.Q;
                kweVar.getClass();
            } else {
                iue.R(this, new t7(10, this, qd6Var));
                kweVar = this.S;
                this.S = null;
            }
            this.Q = kweVar;
            this.O = n61Var.b();
            this.P = qd6Var.getLayoutDirection();
            this.R = this.N;
            kweVar.getClass();
            if (!zl1.c(this.K, zl1.i)) {
                owe.x(qd6Var, kweVar, this.K);
            }
            hy0 hy0Var2 = this.L;
            if (hy0Var2 != null) {
                owe.w(qd6Var, kweVar, hy0Var2, this.M, 56);
            }
        }
        qd6Var.a();
    }

    @Override // defpackage.z7a
    public final void m1(l8a l8aVar) {
        j8a.j(l8aVar, this.N);
    }
}
