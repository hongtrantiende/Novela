package defpackage;

import org.mozilla.javascript.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tl3  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class tl3 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tl3(float f, int i, Object obj) {
        this.a = i;
        this.b = f;
        this.c = obj;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        kq7 kq7Var = kq7.a;
        float f = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                tu1 tu1Var = (tu1) obj4;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((qr) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    tza tzaVar = j27.a;
                    nq7 C = rte.C(zbe.A(nmd.v(zj0.m(tte.k(kq7Var, ((h27) rv4Var.j(tzaVar)).c.d), w06.b), rm1.g(((h27) rv4Var.j(tzaVar)).a, f), lre.g), nae.e, 4.0f, 1), rte.u(rv4Var), 14);
                    xn1 a = wn1.a(lz.c, kh5.I, rv4Var, 0);
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
                    tu1Var.c(zn1.a, rv4Var, 6);
                    rv4Var.q(true);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                vt4 vt4Var = (vt4) obj4;
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((xg6) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    nq7 y = zbe.y(pna.n(kq7Var, f), 2.0f);
                    abf abfVar = f27.a;
                    nq7 k = tte.k(y, aye.s(abf.s(), rv4Var2));
                    boolean f2 = rv4Var2.f(vt4Var);
                    Object P = rv4Var2.P();
                    if (f2 || P == ax1.a) {
                        P = new on7(11, vt4Var);
                        rv4Var2.o0(P);
                    }
                    nq7 f3 = lbe.f(15, (vt4) P, k, null, false);
                    tza tzaVar2 = j27.a;
                    long g = rm1.g(((h27) rv4Var2.j(tzaVar2)).a, 2.0f);
                    ba5 ba5Var = lre.g;
                    nq7 v = nmd.v(tte.k(zbe.y(nmd.v(f3, g, ba5Var), 6.0f), aye.s(abf.s(), rv4Var2)), ((h27) rv4Var2.j(tzaVar2)).a.a, ba5Var);
                    b37 d = fu0.d(kh5.a, false);
                    int hashCode2 = Long.hashCode(rv4Var2.T);
                    xt8 l2 = rv4Var2.l();
                    nq7 p2 = lye.p(rv4Var2, v);
                    rw1.k.getClass();
                    zx1 zx1Var2 = qw1.b;
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var2);
                    } else {
                        rv4Var2.r0();
                    }
                    jce.F(qw1.f, rv4Var2, d);
                    jce.F(qw1.e, rv4Var2, l2);
                    jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode2));
                    jce.C(qw1.h, rv4Var2);
                    jce.F(qw1.d, rv4Var2, p2);
                    nk5.a(rp5.c((wk3) jk3.a.getValue(), rv4Var2, 0), null, pu0.a.a(pna.n(kq7Var, 24.0f), kh5.e), zl1.e, rv4Var2, 3120, 0);
                    rv4Var2.q(true);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                kjb kjbVar = (kjb) obj4;
                nq7 nq7Var = (nq7) obj;
                rv4 rv4Var3 = (rv4) obj2;
                ((Integer) obj3).getClass();
                nq7Var.getClass();
                rv4Var3.e0(1438532053);
                rd2 rd2Var = on3.a;
                arc x = tte.x(Context.VERSION_ECMASCRIPT, 0, rd2Var, 2);
                float f4 = this.b;
                yya a2 = nq.a(f4, x, null, rv4Var3, 0, 12);
                float f5 = kjbVar.a;
                nq7 s = pna.s(lbe.q(pna.w(pna.f(nq7Var, 1.0f), kh5.C, false), ((rg3) nq.a((((kjbVar.b + f5) + f5) - f4) / 2.0f, tte.x(Context.VERSION_ECMASCRIPT, 0, rd2Var, 2), null, rv4Var3, 0, 12).getValue()).a), ((rg3) a2.getValue()).a);
                rv4Var3.q(false);
                return s;
        }
    }
}
