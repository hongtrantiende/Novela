package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fh7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh7 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ xt4 d;

    public /* synthetic */ fh7(int i, int i2, xt4 xt4Var, List list) {
        this.a = i2;
        this.b = i;
        this.c = list;
        this.d = xt4Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        int i4 = this.a;
        pvc pvcVar = pvc.a;
        pu0 pu0Var = pu0.a;
        lh9 lh9Var = ax1.a;
        dz dzVar = lz.a;
        boolean z4 = true;
        float f = 1.0f;
        xt4 xt4Var = this.d;
        List list = this.c;
        int i5 = this.b;
        kq7 kq7Var = kq7.a;
        switch (i4) {
            case 0:
                su0 su0Var = (su0) obj;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                su0Var.getClass();
                if ((intValue & 6) == 0) {
                    if (rv4Var.f(su0Var)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    nq7 f2 = pna.f(kq7Var, 1.0f);
                    gv9 a = ev9.a(dzVar, kh5.F, rv4Var, 0);
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
                    rv4Var.e0(155854091);
                    Iterator it = list.iterator();
                    int i6 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i7 = i6 + 1;
                        if (i6 >= 0) {
                            String str = (String) next;
                            nq7 h = pna.h(new we6(1.0f, true), 36.0f);
                            tza tzaVar = j27.a;
                            nq7 k = tte.k(h, ((h27) rv4Var.j(tzaVar)).c.c);
                            boolean f3 = rv4Var.f(xt4Var) | rv4Var.d(i6);
                            Object P = rv4Var.P();
                            if (f3 || P == lh9Var) {
                                P = new tp0(xt4Var, i6, 5);
                                rv4Var.o0(P);
                            }
                            su0 su0Var2 = su0Var;
                            nq7 f4 = lbe.f(15, (vt4) P, k, null, false);
                            b37 d = fu0.d(kh5.a, false);
                            int hashCode2 = Long.hashCode(rv4Var.T);
                            xt8 l2 = rv4Var.l();
                            nq7 p2 = lye.p(rv4Var, f4);
                            rw1.k.getClass();
                            zx1 zx1Var2 = qw1.b;
                            rv4Var.i0();
                            Iterator it2 = it;
                            if (rv4Var.S) {
                                rv4Var.k(zx1Var2);
                            } else {
                                rv4Var.r0();
                            }
                            jce.F(qw1.f, rv4Var, d);
                            jce.F(qw1.e, rv4Var, l2);
                            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode2));
                            jce.C(qw1.h, rv4Var);
                            jce.F(qw1.d, rv4Var, p2);
                            rv4 rv4Var2 = rv4Var;
                            cvb.c(str, pu0Var.a(kq7Var, kh5.e), 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.k, rv4Var2, 0, 0, 130044);
                            rv4Var2.q(true);
                            it = it2;
                            rv4Var = rv4Var2;
                            i6 = i7;
                            su0Var = su0Var2;
                        } else {
                            tl1.M();
                            throw null;
                        }
                    }
                    su0 su0Var3 = su0Var;
                    rv4 rv4Var3 = rv4Var;
                    rv4Var3.q(false);
                    rv4Var3.q(true);
                    nq7 h2 = pna.h(pna.s(lbe.q(kq7Var, ((rg3) nq.a((su0Var3.d() * i5) / list.size(), null, null, rv4Var3, 0, 14).getValue()).a), su0Var3.d() / list.size()), 36.0f);
                    tza tzaVar2 = j27.a;
                    fu0.a(st0.d(nmd.v(h2, zl1.b(0.2f, ((h27) rv4Var3.j(tzaVar2)).a.a), ((h27) rv4Var3.j(tzaVar2)).c.c), 1.0f, zl1.b(0.6f, ((h27) rv4Var3.j(tzaVar2)).a.a), ((h27) rv4Var3.j(tzaVar2)).c.c), rv4Var3, 0);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                pvc pvcVar2 = pvcVar;
                su0 su0Var4 = (su0) obj;
                rv4 rv4Var4 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                su0Var4.getClass();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var4.f(su0Var4)) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    intValue2 |= i2;
                }
                if ((intValue2 & 19) != 18) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var4.U(intValue2 & 1, z2)) {
                    nq7 f5 = pna.f(kq7Var, 1.0f);
                    gv9 a2 = ev9.a(dzVar, kh5.F, rv4Var4, 0);
                    int hashCode3 = Long.hashCode(rv4Var4.T);
                    xt8 l3 = rv4Var4.l();
                    nq7 p3 = lye.p(rv4Var4, f5);
                    rw1.k.getClass();
                    zx1 zx1Var3 = qw1.b;
                    rv4Var4.i0();
                    if (rv4Var4.S) {
                        rv4Var4.k(zx1Var3);
                    } else {
                        rv4Var4.r0();
                    }
                    jce.F(qw1.f, rv4Var4, a2);
                    jce.F(qw1.e, rv4Var4, l3);
                    jce.F(qw1.g, rv4Var4, Integer.valueOf(hashCode3));
                    jce.C(qw1.h, rv4Var4);
                    jce.F(qw1.d, rv4Var4, p3);
                    rv4Var4.e0(-774003303);
                    Iterator it3 = list.iterator();
                    int i8 = 0;
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        int i9 = i8 + 1;
                        if (i8 >= 0) {
                            String str2 = (String) next2;
                            nq7 h3 = pna.h(new we6(1.0f, true), 36.0f);
                            tza tzaVar3 = j27.a;
                            nq7 k2 = tte.k(h3, ((h27) rv4Var4.j(tzaVar3)).c.c);
                            boolean f6 = rv4Var4.f(xt4Var) | rv4Var4.d(i8);
                            Object P2 = rv4Var4.P();
                            if (f6 || P2 == lh9Var) {
                                P2 = new tp0(xt4Var, i8, 7);
                                rv4Var4.o0(P2);
                            }
                            su0 su0Var5 = su0Var4;
                            nq7 f7 = lbe.f(15, (vt4) P2, k2, null, false);
                            b37 d2 = fu0.d(kh5.a, false);
                            pvc pvcVar3 = pvcVar2;
                            int hashCode4 = Long.hashCode(rv4Var4.T);
                            xt8 l4 = rv4Var4.l();
                            nq7 p4 = lye.p(rv4Var4, f7);
                            rw1.k.getClass();
                            zx1 zx1Var4 = qw1.b;
                            rv4Var4.i0();
                            Iterator it4 = it3;
                            if (rv4Var4.S) {
                                rv4Var4.k(zx1Var4);
                            } else {
                                rv4Var4.r0();
                            }
                            jce.F(qw1.f, rv4Var4, d2);
                            jce.F(qw1.e, rv4Var4, l4);
                            jce.F(qw1.g, rv4Var4, Integer.valueOf(hashCode4));
                            jce.C(qw1.h, rv4Var4);
                            jce.F(qw1.d, rv4Var4, p4);
                            rv4 rv4Var5 = rv4Var4;
                            cvb.c(str2, pu0Var.a(kq7Var, kh5.e), 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var4.j(tzaVar3)).b.k, rv4Var5, 0, 0, 130044);
                            rv4Var5.q(true);
                            it3 = it4;
                            rv4Var4 = rv4Var5;
                            pvcVar2 = pvcVar3;
                            i8 = i9;
                            su0Var4 = su0Var5;
                        } else {
                            tl1.M();
                            throw null;
                        }
                    }
                    su0 su0Var6 = su0Var4;
                    rv4 rv4Var6 = rv4Var4;
                    pvc pvcVar4 = pvcVar2;
                    rv4Var6.q(false);
                    rv4Var6.q(true);
                    nq7 h4 = pna.h(pna.s(lbe.q(kq7Var, ((rg3) nq.a((su0Var6.d() * i5) / list.size(), null, null, rv4Var6, 0, 14).getValue()).a), su0Var6.d() / list.size()), 36.0f);
                    tza tzaVar4 = j27.a;
                    fu0.a(st0.d(nmd.v(h4, zl1.b(0.2f, ((h27) rv4Var6.j(tzaVar4)).a.a), ((h27) rv4Var6.j(tzaVar4)).c.c), 1.0f, zl1.b(0.6f, ((h27) rv4Var6.j(tzaVar4)).a.a), ((h27) rv4Var6.j(tzaVar4)).c.c), rv4Var6, 0);
                    return pvcVar4;
                }
                rv4Var4.X();
                return pvcVar2;
            default:
                su0 su0Var7 = (su0) obj;
                rv4 rv4Var7 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                su0Var7.getClass();
                if ((intValue3 & 6) == 0) {
                    if (rv4Var7.f(su0Var7)) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                    intValue3 |= i3;
                }
                if ((intValue3 & 19) != 18) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var7.U(intValue3 & 1, z3)) {
                    nq7 f8 = pna.f(kq7Var, 1.0f);
                    gv9 a3 = ev9.a(dzVar, kh5.F, rv4Var7, 0);
                    xt4 xt4Var2 = xt4Var;
                    int hashCode5 = Long.hashCode(rv4Var7.T);
                    xt8 l5 = rv4Var7.l();
                    nq7 p5 = lye.p(rv4Var7, f8);
                    rw1.k.getClass();
                    zx1 zx1Var5 = qw1.b;
                    rv4Var7.i0();
                    if (rv4Var7.S) {
                        rv4Var7.k(zx1Var5);
                    } else {
                        rv4Var7.r0();
                    }
                    jce.F(qw1.f, rv4Var7, a3);
                    jce.F(qw1.e, rv4Var7, l5);
                    jce.F(qw1.g, rv4Var7, Integer.valueOf(hashCode5));
                    jce.C(qw1.h, rv4Var7);
                    jce.F(qw1.d, rv4Var7, p5);
                    rv4Var7.e0(-1471636799);
                    int i10 = 0;
                    for (Object obj4 : list) {
                        int i11 = i10 + 1;
                        if (i10 >= 0) {
                            String str3 = (String) obj4;
                            nq7 h5 = pna.h(new we6(f, z4), 36.0f);
                            tza tzaVar5 = j27.a;
                            nq7 k3 = tte.k(h5, ((h27) rv4Var7.j(tzaVar5)).c.c);
                            xt4 xt4Var3 = xt4Var2;
                            boolean f9 = rv4Var7.f(xt4Var3) | rv4Var7.d(i10);
                            Object P3 = rv4Var7.P();
                            if (f9 || P3 == lh9Var) {
                                P3 = new tp0(xt4Var3, i10, 13);
                                rv4Var7.o0(P3);
                            }
                            su0 su0Var8 = su0Var7;
                            nq7 f10 = lbe.f(15, (vt4) P3, k3, null, false);
                            b37 d3 = fu0.d(kh5.a, false);
                            pvc pvcVar5 = pvcVar;
                            List list2 = list;
                            int hashCode6 = Long.hashCode(rv4Var7.T);
                            xt8 l6 = rv4Var7.l();
                            nq7 p6 = lye.p(rv4Var7, f10);
                            rw1.k.getClass();
                            zx1 zx1Var6 = qw1.b;
                            rv4Var7.i0();
                            if (rv4Var7.S) {
                                rv4Var7.k(zx1Var6);
                            } else {
                                rv4Var7.r0();
                            }
                            jce.F(qw1.f, rv4Var7, d3);
                            jce.F(qw1.e, rv4Var7, l6);
                            jce.F(qw1.g, rv4Var7, Integer.valueOf(hashCode6));
                            jce.C(qw1.h, rv4Var7);
                            jce.F(qw1.d, rv4Var7, p6);
                            rv4 rv4Var8 = rv4Var7;
                            cvb.c(str3, pu0Var.a(kq7Var, kh5.e), 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var7.j(tzaVar5)).b.k, rv4Var8, 0, 0, 130044);
                            rv4Var8.q(true);
                            z4 = true;
                            pvcVar = pvcVar5;
                            rv4Var7 = rv4Var8;
                            i10 = i11;
                            xt4Var2 = xt4Var3;
                            list = list2;
                            f = 1.0f;
                            su0Var7 = su0Var8;
                        } else {
                            tl1.M();
                            throw null;
                        }
                    }
                    boolean z5 = z4;
                    pvc pvcVar6 = pvcVar;
                    su0 su0Var9 = su0Var7;
                    List list3 = list;
                    rv4 rv4Var9 = rv4Var7;
                    rv4Var9.q(false);
                    rv4Var9.q(z5);
                    nq7 h6 = pna.h(pna.s(lbe.q(kq7Var, ((rg3) nq.a((su0Var9.d() * i5) / list3.size(), null, null, rv4Var9, 0, 14).getValue()).a), su0Var9.d() / list3.size()), 36.0f);
                    tza tzaVar6 = j27.a;
                    fu0.a(st0.d(nmd.v(h6, zl1.b(0.2f, ((h27) rv4Var9.j(tzaVar6)).a.a), ((h27) rv4Var9.j(tzaVar6)).c.c), 1.0f, zl1.b(0.6f, ((h27) rv4Var9.j(tzaVar6)).a.a), ((h27) rv4Var9.j(tzaVar6)).c.c), rv4Var9, 0);
                    return pvcVar6;
                }
                rv4Var7.X();
                return pvcVar;
        }
    }
}
