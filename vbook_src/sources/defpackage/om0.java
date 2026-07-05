package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: om0  reason: default package */
/* loaded from: classes.dex */
public final class om0 extends mq7 implements fd6, z7a {
    public xt4 K;

    public om0(xt4 xt4Var) {
        this.K = xt4Var;
    }

    @Override // defpackage.z7a
    public final boolean F() {
        return false;
    }

    @Override // defpackage.z7a
    public final void m1(l8a l8aVar) {
        wea weaVar;
        boolean z;
        xt4 xt4Var;
        i38 s = voe.s(this, 2);
        if (!s.h0) {
            qs9 qs9Var = axe.b;
            if (qs9Var == null) {
                axe.b = new qs9();
            } else {
                qs9Var.a();
            }
            qs9 qs9Var2 = axe.b;
            qs9Var2.getClass();
            qs9Var2.P = s.O.V;
            qs9Var2.N = eg0.A(s.c);
            zqa f = pae.f();
            if (f != null) {
                xt4Var = f.e();
            } else {
                xt4Var = null;
            }
            zqa h = pae.h(f);
            try {
                this.K.invoke(qs9Var2);
                pae.n(f, h, xt4Var);
                weaVar = qs9Var2.K;
                z = qs9Var2.L;
            } catch (Throwable th) {
                pae.n(f, h, xt4Var);
                throw th;
            }
        } else {
            weaVar = s.f0;
            z = s.g0;
        }
        if (!z) {
            return;
        }
        j8a.j(l8aVar, weaVar);
    }

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        mw8 M = w27Var.M(j);
        return e37Var.q0(M.a, M.b, ls3.a, new jk(7, M, this));
    }

    public final String toString() {
        xt4 xt4Var = this.K;
        return "BlockGraphicsLayerModifier(block=" + xt4Var + ")";
    }

    @Override // defpackage.mq7
    public final boolean w1() {
        return false;
    }
}
