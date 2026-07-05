package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: um5  reason: default package */
/* loaded from: classes.dex */
public final class um5 implements lu4 {
    public final /* synthetic */ mu4 a;
    public final /* synthetic */ zc2 b;
    public final /* synthetic */ nu4 c;

    public um5(mu4 mu4Var, zc2 zc2Var, nu4 nu4Var) {
        this.a = mu4Var;
        this.b = zc2Var;
        this.c = nu4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        rv4 rv4Var = (rv4) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && rv4Var.E()) {
            rv4Var.X();
        } else {
            xn1 a = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int e = p17.e(rv4Var);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, kq7.a);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var, a);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var, l);
            np npVar3 = qw1.g;
            if (rv4Var.S || !c16.i(rv4Var.P(), Integer.valueOf(e))) {
                rv4Var.o0(Integer.valueOf(e));
                rv4Var.b(Integer.valueOf(e), npVar3);
            }
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var, p);
            mu4 mu4Var = this.a;
            zc2 zc2Var = this.b;
            mu4Var.c(zc2Var, rv4Var, 0);
            nq7 l2 = tte.l(new we6(1.0f, true));
            b37 d = fu0.d(kh5.a, false);
            int e2 = p17.e(rv4Var);
            xt8 l3 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, l2);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, d);
            jce.F(npVar2, rv4Var, l3);
            if (rv4Var.S || !c16.i(rv4Var.P(), Integer.valueOf(e2))) {
                rv4Var.o0(Integer.valueOf(e2));
                rv4Var.b(Integer.valueOf(e2), npVar3);
            }
            jce.F(npVar4, rv4Var, p2);
            z1d.e(zc2Var, pna.c, rv4Var, 48);
            this.c.h(pu0.a, zc2Var, rv4Var, 6);
            rv4Var.q(true);
            rv4Var.q(true);
        }
        return pvc.a;
    }
}
