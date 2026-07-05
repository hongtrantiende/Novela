package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: na7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class na7 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v72 b;
    public final /* synthetic */ da7 c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ xt4 e;
    public final /* synthetic */ db7 f;

    public /* synthetic */ na7(v72 v72Var, da7 da7Var, xt4 xt4Var, xt4 xt4Var2, db7 db7Var, int i) {
        this.a = i;
        this.b = v72Var;
        this.c = da7Var;
        this.d = xt4Var;
        this.e = xt4Var2;
        this.f = db7Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        int i2 = this.a;
        pvc pvcVar = pvc.a;
        kq7 kq7Var = kq7.a;
        boolean z2 = false;
        switch (i2) {
            case 0:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue & 17) != 16) {
                    z2 = true;
                }
                if (rv4Var.U(intValue & 1, z2)) {
                    hc2.b(zbe.C(pna.f(kq7Var, 1.0f), 6.0f, nae.e, nae.e, 3.0f, 6), null, jce.E(569941706, new na7(this.b, this.c, this.d, this.e, this.f, 1), rv4Var), rv4Var, 3078, 6);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                su0 su0Var = (su0) obj;
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                su0Var.getClass();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var2.f(su0Var)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue2 |= i;
                }
                if ((intValue2 & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    nq7 u = pna.u(kq7Var, nae.e, su0Var.d() * 0.8f, 1);
                    v72 v72Var = this.b;
                    nq7 k = tte.k(u, v72Var);
                    da7 da7Var = this.c;
                    nq7 v = uaf.v(k, da7Var.c, v72Var, rv4Var2);
                    long g = rm1.g(r0f.y(rv4Var2), 0.5f);
                    ba5 ba5Var = lre.g;
                    nq7 z3 = zbe.z(nmd.v(v, g, ba5Var), 8.0f, 4.0f);
                    xn1 a = wn1.a(lz.c, kh5.I, rv4Var2, 0);
                    int hashCode = Long.hashCode(rv4Var2.T);
                    xt8 l = rv4Var2.l();
                    nq7 p = lye.p(rv4Var2, z3);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var);
                    } else {
                        rv4Var2.r0();
                    }
                    jce.F(qw1.f, rv4Var2, a);
                    jce.F(qw1.e, rv4Var2, l);
                    jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var2);
                    jce.F(qw1.d, rv4Var2, p);
                    fa7 fa7Var = da7Var.d;
                    xt4 xt4Var = this.e;
                    if (fa7Var != null) {
                        s21.w(rv4Var2, -904515257, kq7Var, 4.0f, rv4Var2);
                        uaf.j(fa7Var, a82.g(rv4Var2, 2.0f, tte.k(kq7Var, r0f.z(rv4Var2).b), ba5Var), this.d, xt4Var, rv4Var2, 0);
                        hl5.w(kq7Var, 12.0f, rv4Var2, false);
                    } else {
                        rv4Var2.e0(-903905022);
                        rv4Var2.q(false);
                    }
                    uaf.m(da7Var.b, r0f.A(rv4Var2).j, zbe.A(kq7Var, nae.e, 4.0f, 1), xt4Var, rv4Var2, 384);
                    db7 db7Var = db7.d;
                    db7 db7Var2 = this.f;
                    if (db7Var2 != db7Var && db7Var2 != db7.c) {
                        rv4Var2.e0(-903166974);
                        rv4Var2.q(false);
                    } else {
                        rv4Var2.e0(-903451275);
                        tc4.l(da7Var.f, null, false, zl1.b(0.6f, r0f.y(rv4Var2).q), 0L, 0L, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).l, rv4Var2, 0, 0, 131062);
                        rv4Var2 = rv4Var2;
                        rv4Var2.q(false);
                    }
                    rv4Var2.q(true);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
