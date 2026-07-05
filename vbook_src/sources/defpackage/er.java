package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: er  reason: default package */
/* loaded from: classes.dex */
public final class er implements xq {
    public final tkc a;
    public dc b;
    public tc6 c;
    public final hm8 d = yae.z(new zy5(0));
    public final tv7 e;
    public okc f;

    public er(tkc tkcVar, dc dcVar, tc6 tc6Var) {
        this.a = tkcVar;
        this.b = dcVar;
        this.c = tc6Var;
        long[] jArr = tz9.a;
        this.e = new tv7();
    }

    public static final long g(er erVar) {
        okc okcVar = erVar.f;
        if (okcVar != null) {
            return ((zy5) okcVar.getValue()).a;
        }
        return ((zy5) erVar.d.getValue()).a;
    }

    @Override // defpackage.xq
    public final z22 a(z22 z22Var, xna xnaVar) {
        z22Var.d = xnaVar;
        return z22Var;
    }

    @Override // defpackage.xq
    public final eu3 b(int i, arc arcVar, txb txbVar) {
        if (i != 0) {
            tc6 tc6Var = tc6.a;
            if (i != 4 || this.c != tc6Var) {
                tc6 tc6Var2 = tc6.b;
                if (i != 5 || this.c != tc6Var2) {
                    if (i == 1 || ((i == 4 && this.c == tc6Var2) || (i == 5 && this.c == tc6Var))) {
                        return zt3.r(arcVar, new cr(txbVar, this, 1));
                    }
                    if (i == 2) {
                        return zt3.q(arcVar, new t41(2, new cr(txbVar, this, 2)));
                    }
                    if (i == 3) {
                        return zt3.q(arcVar, new t41(2, new cr(txbVar, this, 3)));
                    }
                    return eu3.b;
                }
            }
        }
        return zt3.r(arcVar, new cr(txbVar, this, 0));
    }

    @Override // defpackage.qkc
    public final Object d() {
        return this.a.f().d();
    }

    @Override // defpackage.xq
    public final lz3 e(int i, arc arcVar, xt4 xt4Var) {
        if (i != 0) {
            tc6 tc6Var = tc6.a;
            if (i != 4 || this.c != tc6Var) {
                tc6 tc6Var2 = tc6.b;
                if (i != 5 || this.c != tc6Var2) {
                    if (i == 1 || ((i == 4 && this.c == tc6Var2) || (i == 5 && this.c == tc6Var))) {
                        return zt3.v(arcVar, new dr(this, xt4Var, 1));
                    }
                    if (i == 2) {
                        return zt3.u(arcVar, new t41(4, new dr(this, xt4Var, 2)));
                    }
                    if (i == 3) {
                        return zt3.u(arcVar, new t41(4, new dr(this, xt4Var, 3)));
                    }
                    return lz3.b;
                }
            }
        }
        return zt3.v(arcVar, new dr(this, xt4Var, 0));
    }

    @Override // defpackage.qkc
    public final Object f() {
        return this.a.f().f();
    }
}
