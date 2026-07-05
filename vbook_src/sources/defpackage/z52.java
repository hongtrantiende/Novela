package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z52  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class z52 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z52(int i, xt4 xt4Var, List list, boolean z) {
        this.a = 1;
        this.b = z;
        this.c = i;
        this.d = xt4Var;
        this.e = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        pvc pvcVar;
        List list;
        nk0 nk0Var;
        pu0 pu0Var;
        Object obj3;
        int i;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        long j2;
        int i2 = this.a;
        pvc pvcVar2 = pvc.a;
        int i3 = this.c;
        Object obj4 = this.e;
        Object obj5 = this.d;
        boolean z5 = this.b;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                i62.c(z5, (zc2) obj5, (nq7) obj4, (rv4) obj, xoe.p(i3 | 1));
                return pvcVar2;
            case 1:
                xt4 xt4Var = (xt4) obj5;
                List list2 = (List) obj4;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                nk0 nk0Var2 = kh5.e;
                nk0 nk0Var3 = kh5.a;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    kq7 kq7Var = kq7.a;
                    pu0 pu0Var2 = pu0.a;
                    Object obj6 = ax1.a;
                    if (z5) {
                        rv4Var.e0(887570163);
                        if (i3 == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        nq7 k = tte.k(pna.h(kq7Var, 40.0f), uu9.a);
                        xt9 xt9Var = new xt9(4);
                        boolean f = rv4Var.f(xt4Var);
                        Object P = rv4Var.P();
                        if (f || P == obj6) {
                            P = new ux0(5, xt4Var);
                            rv4Var.o0(P);
                        }
                        nq7 y = zbe.y(vte.r(k, z4, xt9Var, (vt4) P), 12.0f);
                        b37 d = fu0.d(nk0Var3, false);
                        boolean z6 = z4;
                        int hashCode = Long.hashCode(rv4Var.T);
                        xt8 l = rv4Var.l();
                        nq7 p = lye.p(rv4Var, y);
                        rw1.k.getClass();
                        pvcVar = pvcVar2;
                        zx1 zx1Var = qw1.b;
                        rv4Var.i0();
                        list = list2;
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
                        ar5 c = rp5.c((wk3) jk3.t.getValue(), rv4Var, 0);
                        nq7 a = pu0Var2.a(kq7Var, nk0Var2);
                        if (z6) {
                            rv4Var.e0(-1444519950);
                            j2 = ((h27) rv4Var.j(j27.a)).a.a;
                            rv4Var.q(false);
                        } else {
                            rv4Var.e0(-1444433584);
                            j2 = ((h27) rv4Var.j(j27.a)).a.q;
                            rv4Var.q(false);
                        }
                        i = 0;
                        nk0Var = nk0Var3;
                        obj3 = obj6;
                        pu0Var = pu0Var2;
                        nk5.a(c, null, a, j2, rv4Var, 48, 0);
                        rv4Var.q(true);
                        rv4Var.q(false);
                    } else {
                        pvcVar = pvcVar2;
                        list = list2;
                        nk0Var = nk0Var3;
                        pu0Var = pu0Var2;
                        obj3 = obj6;
                        i = 0;
                        rv4Var.e0(888478308);
                        rv4Var.q(false);
                    }
                    int i4 = i;
                    boolean z7 = i;
                    for (Object obj7 : list) {
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            q81 q81Var = (q81) obj7;
                            if (!z5 ? i4 == i3 : i4 == i3 - 1) {
                                z2 = 1;
                            } else {
                                z2 = z7;
                            }
                            nq7 k2 = tte.k(pna.j(kq7Var, 40.0f, nae.e, 2), uu9.a);
                            xt9 xt9Var2 = new xt9(4);
                            boolean f2 = rv4Var.f(xt4Var) | rv4Var.g(z5) | rv4Var.d(i4);
                            Object P2 = rv4Var.P();
                            Object obj8 = obj3;
                            if (f2 || P2 == obj8) {
                                P2 = new b83(i4, xt4Var, z5);
                                rv4Var.o0(P2);
                            }
                            nq7 A = zbe.A(vte.r(k2, z2, xt9Var2, (vt4) P2), 16.0f, nae.e, 2);
                            b37 d2 = fu0.d(nk0Var, false);
                            int hashCode2 = Long.hashCode(rv4Var.T);
                            xt8 l2 = rv4Var.l();
                            nq7 p2 = lye.p(rv4Var, A);
                            rw1.k.getClass();
                            zx1 zx1Var2 = qw1.b;
                            rv4Var.i0();
                            nk0 nk0Var4 = nk0Var;
                            if (rv4Var.S) {
                                rv4Var.k(zx1Var2);
                            } else {
                                rv4Var.r0();
                            }
                            jce.F(qw1.f, rv4Var, d2);
                            jce.F(qw1.e, rv4Var, l2);
                            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode2));
                            jce.C(qw1.h, rv4Var);
                            jce.F(qw1.d, rv4Var, p2);
                            String str = q81Var.a;
                            if (z2 != 0) {
                                rv4Var.e0(107259972);
                                j = ((h27) rv4Var.j(j27.a)).a.a;
                                z3 = false;
                            } else {
                                z3 = false;
                                rv4Var.e0(107261222);
                                j = ((h27) rv4Var.j(j27.a)).a.q;
                            }
                            rv4Var.q(z3);
                            rv4 rv4Var2 = rv4Var;
                            cvb.c(str, pu0Var.a(kq7Var, nk0Var2), j, null, 0L, null, dq4.f, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((h27) rv4Var.j(j27.a)).b.i, rv4Var2, 1572864, 24576, 114616);
                            rv4Var = rv4Var2;
                            rv4Var.q(true);
                            obj3 = obj8;
                            nk0Var = nk0Var4;
                            nk0Var2 = nk0Var2;
                            z7 = z3;
                            i4 = i5;
                        } else {
                            tl1.M();
                            throw null;
                        }
                    }
                    return pvcVar;
                }
                rv4Var.X();
                return pvcVar2;
            case 2:
                ((Integer) obj2).intValue();
                jue.j(z5, (xt4) obj5, (vt4) obj4, (rv4) obj, xoe.p(1 | i3));
                return pvcVar2;
            case 3:
                ((Integer) obj2).intValue();
                yf2.k(z5, (xt4) obj5, (lu4) obj4, (rv4) obj, xoe.p(1 | i3));
                return pvcVar2;
            case 4:
                ((Integer) obj2).intValue();
                vae.b(z5, (xt4) obj5, (xt4) obj4, (rv4) obj, xoe.p(1 | i3));
                return pvcVar2;
            case 5:
                ((Integer) obj2).getClass();
                ube.i((List) obj5, z5, (nq7) obj4, (rv4) obj, xoe.p(1 | i3));
                return pvcVar2;
            case 6:
                ((Integer) obj2).intValue();
                xl7.g(z5, (String) obj5, (xt4) obj4, (rv4) obj, xoe.p(1 | i3));
                return pvcVar2;
            case 7:
                ((Integer) obj2).getClass();
                fpe.l(z5, (yxa) obj5, (nq7) obj4, (rv4) obj, xoe.p(1 | i3));
                return pvcVar2;
            default:
                ((Integer) obj2).getClass();
                nxe.m(z5, (oq9) obj5, (gtb) obj4, (rv4) obj, xoe.p(1 | i3));
                return pvcVar2;
        }
    }

    public /* synthetic */ z52(int i, int i2, Object obj, Object obj2, boolean z) {
        this.a = i2;
        this.b = z;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    public /* synthetic */ z52(List list, boolean z, nq7 nq7Var, int i) {
        this.a = 5;
        this.d = list;
        this.b = z;
        this.e = nq7Var;
        this.c = i;
    }
}
