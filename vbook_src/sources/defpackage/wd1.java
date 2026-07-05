package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wd1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class wd1 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt4 b;
    public final /* synthetic */ vt4 c;

    public /* synthetic */ wd1(vt4 vt4Var, xt4 xt4Var) {
        this.a = 2;
        this.c = vt4Var;
        this.b = xt4Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        float f;
        boolean z;
        int i = this.a;
        vt4 vt4Var = this.c;
        boolean z2 = false;
        pvc pvcVar = pvc.a;
        lh9 lh9Var = ax1.a;
        xt4 xt4Var = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((xg6) obj).getClass();
                if ((intValue & 17) != 16) {
                    z2 = true;
                }
                if (rv4Var.U(intValue & 1, z2)) {
                    float f2 = 1.0f;
                    nq7 C = zbe.C(pna.f(kq7.a, 1.0f), nae.e, nae.e, nae.e, 4.0f, 7);
                    gv9 a = ev9.a(new hz(8.0f, true, new vs(2)), kh5.F, rv4Var, 6);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, C);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(qw1.f, rv4Var, a);
                    jce.F(qw1.e, rv4Var, l);
                    jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var);
                    jce.F(qw1.d, rv4Var, p);
                    String A = yqe.A((y3b) k2b.t.getValue(), rv4Var);
                    if (1.0f <= 0.0d) {
                        jv5.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    } else {
                        f = 1.0f;
                    }
                    we6 we6Var = new we6(f, true);
                    boolean f3 = rv4Var.f(xt4Var);
                    Object P = rv4Var.P();
                    if (f3 || P == lh9Var) {
                        P = new ux0(2, xt4Var);
                        rv4Var.o0(P);
                    }
                    fbe.l(A, false, we6Var, (vt4) P, rv4Var, 0);
                    String A2 = yqe.A((y3b) k2b.K.getValue(), rv4Var);
                    if (1.0f <= 0.0d) {
                        jv5.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f2 = Float.MAX_VALUE;
                    }
                    fbe.l(A2, false, new we6(f2, true), this.c, rv4Var, 48);
                    rv4Var.q(true);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    ar5 c = rp5.c((wk3) jk3.n0.getValue(), rv4Var2, 0);
                    boolean f4 = rv4Var2.f(xt4Var) | rv4Var2.f(vt4Var);
                    Object P2 = rv4Var2.P();
                    if (f4 || P2 == lh9Var) {
                        P2 = new o65(vt4Var, xt4Var);
                        rv4Var2.o0(P2);
                    }
                    kwe.d(c, null, 0L, (vt4) P2, rv4Var2, 0, 6);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                nq7 nq7Var = (nq7) obj;
                rv4 rv4Var3 = (rv4) obj2;
                ((Integer) obj3).getClass();
                rv4Var3.e0(759876635);
                Object P3 = rv4Var3.P();
                if (P3 == lh9Var) {
                    P3 = yae.q(vt4Var);
                    rv4Var3.o0(P3);
                }
                yya yyaVar = (yya) P3;
                Object P4 = rv4Var3.P();
                if (P4 == lh9Var) {
                    P4 = new lq(new y78(((y78) yyaVar.getValue()).a), d7a.b, new y78(d7a.c), 8);
                    rv4Var3.o0(P4);
                }
                lq lqVar = (lq) P4;
                boolean h = rv4Var3.h(lqVar);
                Object P5 = rv4Var3.P();
                if (h || P5 == lh9Var) {
                    P5 = new jk8(yyaVar, lqVar, (m42) null, 19);
                    rv4Var3.o0(P5);
                }
                yte.g((lu4) P5, rv4Var3, pvcVar);
                es esVar = lqVar.c;
                boolean f5 = rv4Var3.f(esVar);
                Object P6 = rv4Var3.P();
                if (f5 || P6 == lh9Var) {
                    P6 = new xk6(esVar, 9);
                    rv4Var3.o0(P6);
                }
                nq7 nq7Var2 = (nq7) xt4Var.invoke((vt4) P6);
                rv4Var3.q(false);
                return nq7Var2;
        }
    }

    public /* synthetic */ wd1(int i, vt4 vt4Var, xt4 xt4Var) {
        this.a = i;
        this.b = xt4Var;
        this.c = vt4Var;
    }
}
