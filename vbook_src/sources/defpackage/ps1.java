package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ps1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ps1 implements lu4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ xt4 d;

    public /* synthetic */ ps1(int i, int i2, xt4 xt4Var, List list) {
        this.b = list;
        this.c = i;
        this.d = xt4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        int i = this.a;
        pvc pvcVar = pvc.a;
        xt4 xt4Var = this.d;
        int i2 = this.c;
        List list = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = 2;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    int i4 = 0;
                    for (Object obj3 : list) {
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            String str = (String) obj3;
                            if (i4 == i2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            kq7 kq7Var = kq7.a;
                            nq7 k = tte.k(pna.j(kq7Var, 40.0f, nae.e, i3), uu9.a);
                            xt9 xt9Var = new xt9(4);
                            boolean f = rv4Var.f(xt4Var) | rv4Var.d(i4);
                            Object P = rv4Var.P();
                            if (f || P == ax1.a) {
                                P = new tp0(xt4Var, i4, 1);
                                rv4Var.o0(P);
                            }
                            nq7 A = zbe.A(vte.r(k, z2, xt9Var, (vt4) P), 16.0f, nae.e, i3);
                            b37 d = fu0.d(kh5.a, false);
                            int hashCode = Long.hashCode(rv4Var.T);
                            xt8 l = rv4Var.l();
                            nq7 p = lye.p(rv4Var, A);
                            rw1.k.getClass();
                            zx1 zx1Var = qw1.b;
                            rv4Var.i0();
                            if (rv4Var.S) {
                                rv4Var.k(zx1Var);
                            } else {
                                rv4Var.r0();
                            }
                            jce.F(qw1.f, rv4Var, d);
                            jce.F(qw1.e, rv4Var, l);
                            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                            jce.C(qw1.h, rv4Var);
                            jce.F(qw1.d, rv4Var, p);
                            if (z2) {
                                rv4Var.e0(1684997882);
                                j = ((h27) rv4Var.j(j27.a)).a.a;
                                z3 = false;
                            } else {
                                z3 = false;
                                rv4Var.e0(1684999132);
                                j = ((h27) rv4Var.j(j27.a)).a.q;
                            }
                            rv4Var.q(z3);
                            rv4 rv4Var2 = rv4Var;
                            cvb.c(str, pu0.a.a(kq7Var, kh5.e), j, null, 0L, null, dq4.f, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((h27) rv4Var.j(j27.a)).b.i, rv4Var2, 1572864, 24576, 114616);
                            rv4Var2.q(true);
                            i3 = i3;
                            rv4Var = rv4Var2;
                            i4 = i5;
                        } else {
                            tl1.M();
                            throw null;
                        }
                    }
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                xl7.f(list, i2, xt4Var, (rv4) obj, xoe.p(1));
                return pvcVar;
        }
    }

    public /* synthetic */ ps1(xt4 xt4Var, List list, int i) {
        this.b = list;
        this.c = i;
        this.d = xt4Var;
    }
}
