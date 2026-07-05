package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yw4  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class yw4 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ lu4 c;

    public /* synthetic */ yw4(List list, lu4 lu4Var, int i) {
        this.a = i;
        this.b = list;
        this.c = lu4Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = 2;
        float f = nae.e;
        kq7 kq7Var = kq7.a;
        boolean z4 = false;
        lu4 lu4Var = this.c;
        List list = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((yf6) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    nq7 f2 = pna.f(kq7Var, 1.0f);
                    xn1 a = wn1.a(lz.c, kh5.I, rv4Var, 0);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, f2);
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
                    bce.c(list, zbe.C(zbe.A(pna.f(kq7Var, 1.0f), 16.0f, nae.e, 2), nae.e, nae.e, nae.e, 8.0f, 7), lu4Var, rv4Var, 48);
                    rv4Var.q(true);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((wl4) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    int size = list.size();
                    int i3 = 0;
                    while (i3 < size) {
                        xw4 xw4Var = (xw4) list.get(i3);
                        nq7 y = zbe.y(kq7Var, 3.0f);
                        if (xw4Var.b.length() > 0) {
                            z3 = true;
                        } else {
                            z3 = z4;
                        }
                        boolean f3 = rv4Var2.f(lu4Var) | rv4Var2.h(xw4Var);
                        Object P = rv4Var2.P();
                        if (f3 || P == ax1.a) {
                            P = new u93(20, lu4Var, xw4Var);
                            rv4Var2.o0(P);
                        }
                        nq7 k = tte.k(q1d.b(y, z3, f, (vt4) P, i2), uu9.a);
                        tza tzaVar = j27.a;
                        nq7 z5 = zbe.z(nmd.v(k, rm1.g(((h27) rv4Var2.j(tzaVar)).a, 6.0f), lre.g), 12.0f, 4.0f);
                        b37 d = fu0.d(kh5.a, z4);
                        int hashCode2 = Long.hashCode(rv4Var2.T);
                        xt8 l2 = rv4Var2.l();
                        nq7 p2 = lye.p(rv4Var2, z5);
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
                        rv4 rv4Var3 = rv4Var2;
                        cvb.c(xw4Var.a, null, ((h27) rv4Var2.j(tzaVar)).a.s, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.n, rv4Var3, 0, 0, 131066);
                        rv4Var3.q(true);
                        i3++;
                        rv4Var2 = rv4Var3;
                        i2 = 2;
                        f = nae.e;
                        z4 = false;
                    }
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
