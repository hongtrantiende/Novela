package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sq5  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class sq5 implements mu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ sq5(String str, xt4 xt4Var, lu4 lu4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, xt4 xt4Var5, xt4 xt4Var6) {
        this.a = 1;
        this.b = str;
        this.c = xt4Var;
        this.d = lu4Var;
        this.e = xt4Var2;
        this.f = xt4Var3;
        this.C = xt4Var4;
        this.D = xt4Var5;
        this.E = xt4Var6;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        float f;
        float f2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.a;
        lh9 lh9Var = ax1.a;
        kq7 kq7Var = kq7.a;
        pvc pvcVar = pvc.a;
        Object obj4 = this.E;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        Object obj8 = this.D;
        Object obj9 = this.C;
        Object obj10 = this.f;
        Object obj11 = this.b;
        switch (i) {
            case 0:
                vt4 vt4Var = (vt4) obj7;
                vt4 vt4Var2 = (vt4) obj6;
                vt4 vt4Var3 = (vt4) obj5;
                vt4 vt4Var4 = (vt4) obj10;
                vt4 vt4Var5 = (vt4) obj9;
                vt4 vt4Var6 = (vt4) obj8;
                String str = (String) obj11;
                String str2 = (String) obj4;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((qr) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    nq7 f3 = pna.f(kq7Var, 1.0f);
                    lk0 lk0Var = kh5.I;
                    ez ezVar = lz.c;
                    xn1 a = wn1.a(ezVar, lk0Var, rv4Var, 0);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, f3);
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
                    Integer valueOf = Integer.valueOf(hashCode);
                    np npVar3 = qw1.g;
                    jce.F(npVar3, rv4Var, valueOf);
                    kg kgVar = qw1.h;
                    jce.C(kgVar, rv4Var);
                    np npVar4 = qw1.d;
                    jce.F(npVar4, rv4Var, p);
                    nq7 h = q1d.h(rv4Var, pna.f(kq7Var, 1.0f));
                    tza tzaVar = j27.a;
                    nq7 y = zbe.y(mwe.u(nmd.v(h, zl1.b(0.95f, rm1.g(((h27) rv4Var.j(tzaVar)).a, 4.0f)), lre.g), false, 7), 12.0f);
                    xn1 a2 = wn1.a(ezVar, lk0Var, rv4Var, 0);
                    int hashCode2 = Long.hashCode(rv4Var.T);
                    xt8 l2 = rv4Var.l();
                    nq7 p2 = lye.p(rv4Var, y);
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(npVar, rv4Var, a2);
                    jce.F(npVar2, rv4Var, l2);
                    s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
                    jce.F(npVar4, rv4Var, p2);
                    nq7 f4 = pna.f(kq7Var, 1.0f);
                    mk0 mk0Var = kh5.F;
                    dz dzVar = lz.a;
                    gv9 a3 = ev9.a(dzVar, mk0Var, rv4Var, 0);
                    int hashCode3 = Long.hashCode(rv4Var.T);
                    xt8 l3 = rv4Var.l();
                    nq7 p3 = lye.p(rv4Var, f4);
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(npVar, rv4Var, a3);
                    jce.F(npVar2, rv4Var, l3);
                    s21.t(hashCode3, rv4Var, npVar3, rv4Var, kgVar);
                    jce.F(npVar4, rv4Var, p3);
                    pc2.a(rp5.c((wk3) jk3.w.getValue(), rv4Var, 0), null, vt4Var2, rv4Var, 0, 2);
                    if (1.0f <= 0.0d) {
                        jv5.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    } else {
                        f = 1.0f;
                    }
                    xbe.i(rv4Var, new we6(f, true));
                    pc2.a(rp5.c((wk3) ok3.g0.getValue(), rv4Var, 0), null, vt4Var3, rv4Var, 0, 2);
                    xbe.i(rv4Var, pna.s(kq7Var, 12.0f));
                    pc2.a(rp5.c((wk3) rk3.f.getValue(), rv4Var, 0), null, vt4Var4, rv4Var, 0, 2);
                    xbe.i(rv4Var, pna.s(kq7Var, 12.0f));
                    xxe.j(0, vt4Var5, vt4Var6, rv4Var, null);
                    rs8.u(rv4Var, true, kq7Var, 12.0f, rv4Var);
                    nq7 f5 = pna.f(kq7Var, 1.0f);
                    boolean f6 = rv4Var.f(vt4Var);
                    Object P = rv4Var.P();
                    if (f6 || P == lh9Var) {
                        P = new ge5(7, vt4Var);
                        rv4Var.o0(P);
                    }
                    nq7 t = q1d.t(1, (vt4) P, rv4Var, f5, false);
                    xn1 a4 = wn1.a(ezVar, lk0Var, rv4Var, 0);
                    int hashCode4 = Long.hashCode(rv4Var.T);
                    xt8 l4 = rv4Var.l();
                    nq7 p4 = lye.p(rv4Var, t);
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(npVar, rv4Var, a4);
                    jce.F(npVar2, rv4Var, l4);
                    s21.t(hashCode4, rv4Var, npVar3, rv4Var, kgVar);
                    jce.F(npVar4, rv4Var, p4);
                    cvb.c(str, null, ((h27) rv4Var.j(tzaVar)).a.q, null, zr1.q(16), null, dq4.D, null, 0L, null, null, 0L, 2, false, 2, 0, null, null, rv4Var, 1597440, 24960, 241578);
                    nq7 f7 = pna.f(kq7Var, 1.0f);
                    gv9 a5 = ev9.a(dzVar, kh5.G, rv4Var, 48);
                    int hashCode5 = Long.hashCode(rv4Var.T);
                    xt8 l5 = rv4Var.l();
                    nq7 p5 = lye.p(rv4Var, f7);
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(npVar, rv4Var, a5);
                    jce.F(npVar2, rv4Var, l5);
                    s21.t(hashCode5, rv4Var, npVar3, rv4Var, kgVar);
                    jce.F(npVar4, rv4Var, p5);
                    long q = zr1.q(14);
                    long j = ((h27) rv4Var.j(tzaVar)).a.q;
                    if (1.0f <= 0.0d) {
                        jv5.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f2 = Float.MAX_VALUE;
                    } else {
                        f2 = 1.0f;
                    }
                    cvb.c(str2, new we6(f2, false), j, null, q, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 1, 0, null, null, rv4Var, 24576, 24960, 240616);
                    nk5.a(rp5.c((wk3) ok3.t.getValue(), rv4Var, 0), null, pna.n(kq7Var, 16.0f), ((h27) rv4Var.j(tzaVar)).a.q, rv4Var, 432, 0);
                    hl5.v(rv4Var, true, true, true);
                    vqe.m(nae.e, 6, 2, rm1.g(((h27) rv4Var.j(tzaVar)).a, 4.0f), rv4Var, pna.f(kq7Var, 1.0f));
                    rv4Var.q(true);
                    return pvcVar;
                }
                rv4Var.X();
                return pvcVar;
            case 1:
                String str3 = (String) obj11;
                xt4 xt4Var = (xt4) obj7;
                lu4 lu4Var = (lu4) obj6;
                xt4 xt4Var2 = (xt4) obj5;
                xt4 xt4Var3 = (xt4) obj10;
                xt4 xt4Var4 = (xt4) obj9;
                xt4 xt4Var5 = (xt4) obj8;
                xt4 xt4Var6 = (xt4) obj4;
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    nq7 u = mwe.u(zbe.A(pna.f(kq7Var, 1.0f), 16.0f, nae.e, 2), false, 14);
                    boolean f8 = rv4Var2.f(xt4Var);
                    Object P2 = rv4Var2.P();
                    if (f8 || P2 == lh9Var) {
                        P2 = new hg7(24, xt4Var);
                        rv4Var2.o0(P2);
                    }
                    vt4 vt4Var7 = (vt4) P2;
                    boolean f9 = rv4Var2.f(xt4Var);
                    Object P3 = rv4Var2.P();
                    if (f9 || P3 == lh9Var) {
                        P3 = new hg7(25, xt4Var);
                        rv4Var2.o0(P3);
                    }
                    ube.l(str3, u, vt4Var7, lu4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, (vt4) P3, rv4Var2, 0);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                e33 e33Var = (e33) obj7;
                shc shcVar = (shc) obj6;
                cz7 cz7Var = (cz7) obj5;
                w43 w43Var = (w43) obj10;
                g13 g13Var = (g13) obj9;
                yya yyaVar = (yya) obj8;
                aw7 aw7Var = (aw7) obj11;
                aw7 aw7Var2 = (aw7) obj4;
                rv4 rv4Var3 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((xg6) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var3.U(intValue3 & 1, z3)) {
                    dye.a(jce.E(-1926450068, new f07(e33Var, shcVar, cz7Var, w43Var, g13Var, yyaVar, aw7Var, aw7Var2), rv4Var3), rv4Var3, 6);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            default:
                String str4 = (String) obj11;
                List list = (List) obj10;
                p6d p6dVar = (p6d) obj9;
                xt4 xt4Var7 = (xt4) obj8;
                vt4 vt4Var8 = (vt4) obj7;
                vt4 vt4Var9 = (vt4) obj6;
                vt4 vt4Var10 = (vt4) obj5;
                xt4 xt4Var8 = (xt4) obj4;
                rv4 rv4Var4 = (rv4) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var4.U(intValue4 & 1, z4)) {
                    eg0.l(str4, list, p6dVar, xt4Var7, pna.f(kq7Var, 1.0f), null, null, vt4Var8, vt4Var9, vt4Var10, xt4Var8, rv4Var4, 24576);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ sq5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.C = obj5;
        this.D = obj6;
        this.b = obj7;
        this.E = obj8;
    }

    public /* synthetic */ sq5(String str, List list, p6d p6dVar, xt4 xt4Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, xt4 xt4Var2) {
        this.a = 3;
        this.b = str;
        this.f = list;
        this.C = p6dVar;
        this.D = xt4Var;
        this.c = vt4Var;
        this.d = vt4Var2;
        this.e = vt4Var3;
        this.E = xt4Var2;
    }
}
