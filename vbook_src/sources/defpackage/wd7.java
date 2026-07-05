package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wd7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class wd7 implements mu4 {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ wd7(String str, xt4 xt4Var, List list, boolean z, xt4 xt4Var2) {
        this.e = str;
        this.c = xt4Var;
        this.d = list;
        this.b = z;
        this.f = xt4Var2;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i = this.a;
        int i2 = 4;
        lh9 lh9Var = ax1.a;
        kq7 kq7Var = kq7.a;
        pvc pvcVar = pvc.a;
        boolean z2 = false;
        Object obj4 = this.f;
        Object obj5 = this.d;
        Object obj6 = this.e;
        switch (i) {
            case 0:
                List list = (List) obj5;
                lu4 lu4Var = (lu4) obj6;
                qra qraVar = (qra) obj4;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((qr) obj).getClass();
                if ((intValue & 17) != 16) {
                    z2 = true;
                }
                if (rv4Var.U(intValue & 1, z2)) {
                    int size = list.size();
                    boolean f = rv4Var.f(lu4Var);
                    xt4 xt4Var = this.c;
                    boolean f2 = f | rv4Var.f(xt4Var);
                    Object P = rv4Var.P();
                    if (f2 || P == lh9Var) {
                        P = new se0(18, qraVar, lu4Var, xt4Var);
                        rv4Var.o0(P);
                    }
                    tc4.i(size, 0, (vt4) P, rv4Var, null, this.b);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                mv mvVar = (mv) obj5;
                String str = (String) obj6;
                xt4 xt4Var2 = (xt4) obj4;
                su0 su0Var = (su0) obj;
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                su0Var.getClass();
                if ((intValue2 & 6) == 0) {
                    if (!rv4Var2.f(su0Var)) {
                        i2 = 2;
                    }
                    intValue2 |= i2;
                }
                if ((intValue2 & 19) != 18) {
                    z2 = true;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    nq7 h = pna.h(kq7Var, (su0Var.c() * 8.0f) / 9.0f);
                    xt4 xt4Var3 = this.c;
                    nmd.d(this.b, xt4Var3, h, true, null, null, 0L, 0L, nae.e, 0L, null, jce.E(1258939351, new g83(17, xt4Var2, mvVar, str, xt4Var3), rv4Var2), rv4Var2, 3072, 48, 2032);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                String str2 = (String) obj4;
                List list2 = (List) obj5;
                lu4 lu4Var2 = (lu4) obj6;
                su0 su0Var2 = (su0) obj;
                rv4 rv4Var3 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                su0Var2.getClass();
                if ((intValue3 & 6) == 0) {
                    if (!rv4Var3.f(su0Var2)) {
                        i2 = 2;
                    }
                    intValue3 |= i2;
                }
                if ((intValue3 & 19) != 18) {
                    z2 = true;
                }
                if (rv4Var3.U(intValue3 & 1, z2)) {
                    nmd.d(this.b, this.c, null, true, null, null, 0L, 0L, nae.e, 0L, null, jce.E(1332563083, new g83(su0Var2, str2, list2, lu4Var2, 19), rv4Var3), rv4Var3, 3072, 48, 2036);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            default:
                String str3 = (String) obj6;
                List list3 = (List) obj5;
                xt4 xt4Var4 = (xt4) obj4;
                rv4 rv4Var4 = (rv4) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var4.U(intValue4 & 1, z)) {
                    tza tzaVar = j27.a;
                    uwe.h(str3, this.c, zbe.A(pna.f(kq7Var, 1.0f), 16.0f, nae.e, 2), false, false, null, null, w9e.b, w9e.c, null, false, null, null, null, true, 0, 0, ((h27) rv4Var4.j(tzaVar)).c.c, null, rv4Var4, 113246592, 12582912, 6159992);
                    xbe.i(rv4Var4, pna.h(kq7Var, 8.0f));
                    float y0 = (((r13) rv4Var4.j(dy1.h)).y0((int) (((zk6) ((oid) rv4Var4.j(dy1.u))).b() & 4294967295L)) * 7.0f) / 9.0f;
                    if (list3.isEmpty() && !this.b) {
                        rv4Var4.e0(434434408);
                        nq7 h2 = pna.h(pna.f(kq7Var, 1.0f), y0);
                        b37 d = fu0.d(kh5.e, false);
                        int hashCode = Long.hashCode(rv4Var4.T);
                        xt8 l = rv4Var4.l();
                        nq7 p = lye.p(rv4Var4, h2);
                        rw1.k.getClass();
                        zx1 zx1Var = qw1.b;
                        rv4Var4.i0();
                        if (rv4Var4.S) {
                            rv4Var4.k(zx1Var);
                        } else {
                            rv4Var4.r0();
                        }
                        jce.F(qw1.f, rv4Var4, d);
                        jce.F(qw1.e, rv4Var4, l);
                        jce.F(qw1.g, rv4Var4, Integer.valueOf(hashCode));
                        jce.C(qw1.h, rv4Var4);
                        jce.F(qw1.d, rv4Var4, p);
                        cvb.c(yqe.A((y3b) o2b.l.getValue(), rv4Var4), null, ((h27) rv4Var4.j(tzaVar)).a.s, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var4.j(tzaVar)).b.k, rv4Var4, 0, 0, 131066);
                        rv4Var4.q(true);
                        rv4Var4.q(false);
                    } else {
                        rv4Var4.e0(434912769);
                        nq7 h3 = pna.h(pna.f(kq7Var, 1.0f), y0);
                        th8 th8Var = new th8(16.0f, 16.0f, 16.0f, 16.0f);
                        hz hzVar = new hz(8.0f, true, new vs(2));
                        boolean h4 = rv4Var4.h(list3) | rv4Var4.f(xt4Var4);
                        Object P2 = rv4Var4.P();
                        if (h4 || P2 == lh9Var) {
                            P2 = new yv0(list3, xt4Var4, 9);
                            rv4Var4.o0(P2);
                        }
                        jce.d(h3, null, th8Var, false, hzVar, null, null, false, null, (xt4) P2, rv4Var4, 24960, 490);
                        rv4Var4.q(false);
                    }
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ wd7(List list, boolean z, lu4 lu4Var, xt4 xt4Var, qra qraVar) {
        this.d = list;
        this.b = z;
        this.e = lu4Var;
        this.c = xt4Var;
        this.f = qraVar;
    }

    public /* synthetic */ wd7(boolean z, xt4 xt4Var, mv mvVar, String str, xt4 xt4Var2) {
        this.b = z;
        this.c = xt4Var;
        this.d = mvVar;
        this.e = str;
        this.f = xt4Var2;
    }

    public /* synthetic */ wd7(boolean z, xt4 xt4Var, String str, List list, lu4 lu4Var) {
        this.b = z;
        this.c = xt4Var;
        this.f = str;
        this.d = list;
        this.e = lu4Var;
    }
}
