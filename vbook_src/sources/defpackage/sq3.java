package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sq3  reason: default package */
/* loaded from: classes3.dex */
public final class sq3 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public sq3(List list, xt4 xt4Var, vt4 vt4Var, aw7 aw7Var, yya yyaVar) {
        this.a = 4;
        this.b = list;
        this.c = xt4Var;
        this.d = vt4Var;
        this.f = aw7Var;
        this.e = yyaVar;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        long j;
        int i2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        int i6;
        int i7;
        boolean z4;
        int i8;
        int i9;
        boolean z5;
        boolean z6;
        rv4 rv4Var;
        float f;
        boolean z7;
        int i10;
        int i11;
        boolean z8;
        boolean z9;
        boolean z10;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        boolean z13;
        int i14;
        int i15 = this.a;
        kq7 kq7Var = kq7.a;
        Object obj5 = ax1.a;
        pvc pvcVar = pvc.a;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        List list = this.b;
        int i16 = 4;
        Object obj9 = this.f;
        switch (i15) {
            case 0:
                xg6 xg6Var = (xg6) obj;
                int intValue = ((Number) obj2).intValue();
                rv4 rv4Var2 = (rv4) obj3;
                int intValue2 = ((Number) obj4).intValue();
                qg6 qg6Var = (qg6) obj7;
                m82 m82Var = (m82) obj8;
                if ((intValue2 & 6) == 0) {
                    if (!rv4Var2.f(xg6Var)) {
                        i16 = 2;
                    }
                    i = intValue2 | i16;
                } else {
                    i = intValue2;
                }
                if ((48 & intValue2) == 0) {
                    if (rv4Var2.d(intValue)) {
                        i2 = 32;
                    } else {
                        i2 = 16;
                    }
                    i |= i2;
                }
                if ((i & Token.EXPR_VOID) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var2.U(i & 1, z)) {
                    wp3 wp3Var = (wp3) list.get(intValue);
                    rv4Var2.e0(935007347);
                    boolean i17 = c16.i((String) ((yya) obj6).getValue(), wp3Var.a);
                    nq7 k = tte.k(zbe.y(pna.n(kq7Var, 40.0f), 2.0f), aye.s(f27.a.p(), rv4Var2));
                    if (i17) {
                        rv4Var2.e0(935278007);
                        j = rm1.g(((h27) rv4Var2.j(j27.a)).a, 4.0f);
                        rv4Var2.q(false);
                    } else {
                        rv4Var2.e0(935400829);
                        rv4Var2.q(false);
                        j = zl1.h;
                    }
                    nq7 v = nmd.v(k, j, lre.g);
                    boolean h = rv4Var2.h(m82Var) | rv4Var2.f(qg6Var) | rv4Var2.h(wp3Var);
                    Object P = rv4Var2.P();
                    if (h || P == obj5) {
                        P = new qq3(wp3Var, m82Var, qg6Var, (aw7) obj9);
                        rv4Var2.o0(P);
                    }
                    nq7 y = zbe.y(lbe.f(15, (vt4) P, v, null, false), 6.0f);
                    b37 d = fu0.d(kh5.a, false);
                    int hashCode = Long.hashCode(rv4Var2.T);
                    xt8 l = rv4Var2.l();
                    nq7 p = lye.p(rv4Var2, y);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var);
                    } else {
                        rv4Var2.r0();
                    }
                    jce.F(qw1.f, rv4Var2, d);
                    jce.F(qw1.e, rv4Var2, l);
                    jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var2);
                    jce.F(qw1.d, rv4Var2, p);
                    do5.a(wp3Var.b, r0f.e, false, null, null, hse.a, pna.c, null, rv4Var2, 14155824, 828);
                    rv4Var2.q(true);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 1:
                xg6 xg6Var2 = (xg6) obj;
                int intValue3 = ((Number) obj2).intValue();
                rv4 rv4Var3 = (rv4) obj3;
                int intValue4 = ((Number) obj4).intValue();
                lu4 lu4Var = (lu4) obj9;
                lu4 lu4Var2 = (lu4) obj6;
                xt4 xt4Var = (xt4) obj7;
                xt4 xt4Var2 = (xt4) obj8;
                if ((intValue4 & 6) == 0) {
                    if (!rv4Var3.f(xg6Var2)) {
                        i16 = 2;
                    }
                    i3 = intValue4 | i16;
                } else {
                    i3 = intValue4;
                }
                if ((48 & intValue4) == 0) {
                    if (rv4Var3.d(intValue3)) {
                        i4 = 32;
                    } else {
                        i4 = 16;
                    }
                    i3 |= i4;
                }
                if ((i3 & Token.EXPR_VOID) != 146) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var3.U(i3 & 1, z2)) {
                    h34 h34Var = (h34) list.get(intValue3);
                    rv4Var3.e0(1147795316);
                    String str = h34Var.e.a;
                    boolean f2 = rv4Var3.f(xt4Var2) | rv4Var3.h(h34Var);
                    Object P2 = rv4Var3.P();
                    if (f2 || P2 == obj5) {
                        P2 = new cq0(xt4Var2, h34Var, null, 0);
                        rv4Var3.o0(P2);
                    }
                    yte.g((lu4) P2, rv4Var3, str);
                    nq7 A = zbe.A(zbe.C(xg6.a(xg6Var2, pna.f(kq7Var, 1.0f)), nae.e, nae.e, nae.e, 12.0f, 7), 16.0f, nae.e, 2);
                    boolean f3 = rv4Var3.f(xt4Var) | rv4Var3.h(h34Var);
                    Object P3 = rv4Var3.P();
                    if (f3 || P3 == obj5) {
                        P3 = new dq0(xt4Var, h34Var, 0);
                        rv4Var3.o0(P3);
                    }
                    vt4 vt4Var = (vt4) P3;
                    boolean f4 = rv4Var3.f(lu4Var2) | rv4Var3.h(h34Var);
                    Object P4 = rv4Var3.P();
                    if (f4 || P4 == obj5) {
                        P4 = new eq0(lu4Var2, h34Var, 0);
                        rv4Var3.o0(P4);
                    }
                    xt4 xt4Var3 = (xt4) P4;
                    boolean f5 = rv4Var3.f(lu4Var) | rv4Var3.h(h34Var);
                    Object P5 = rv4Var3.P();
                    if (f5 || P5 == obj5) {
                        P5 = new eq0(lu4Var, h34Var, 1);
                        rv4Var3.o0(P5);
                    }
                    s9e.d(h34Var, A, vt4Var, xt4Var3, (xt4) P5, rv4Var3, 0);
                    rv4Var3.q(false);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 2:
                xg6 xg6Var3 = (xg6) obj;
                int intValue5 = ((Number) obj2).intValue();
                rv4 rv4Var4 = (rv4) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    if (!rv4Var4.f(xg6Var3)) {
                        i16 = 2;
                    }
                    i5 = intValue6 | i16;
                } else {
                    i5 = intValue6;
                }
                if ((48 & intValue6) == 0) {
                    if (rv4Var4.d(intValue5)) {
                        i6 = 32;
                    } else {
                        i6 = 16;
                    }
                    i5 |= i6;
                }
                if ((i5 & Token.EXPR_VOID) != 146) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var4.U(i5 & 1, z3)) {
                    kd3 kd3Var = (kd3) list.get(intValue5);
                    rv4Var4.e0(-343104461);
                    vqe.p(xg6Var3, (vo9) obj8, kd3Var.a, null, false, null, jce.E(-1531813331, new td0((lu4) obj7, kd3Var, (xt4) obj6, (aw7) obj9, 4), rv4Var4), rv4Var4, (i5 & 14) | 1572864, 28);
                    rv4Var4.q(false);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            case 3:
                xg6 xg6Var4 = (xg6) obj;
                int intValue7 = ((Number) obj2).intValue();
                rv4 rv4Var5 = (rv4) obj3;
                int intValue8 = ((Number) obj4).intValue();
                xt4 xt4Var4 = (xt4) obj9;
                lu4 lu4Var3 = (lu4) obj6;
                xt4 xt4Var5 = (xt4) obj7;
                xt4 xt4Var6 = (xt4) obj8;
                if ((intValue8 & 6) == 0) {
                    if (!rv4Var5.f(xg6Var4)) {
                        i16 = 2;
                    }
                    i7 = intValue8 | i16;
                } else {
                    i7 = intValue8;
                }
                if ((48 & intValue8) == 0) {
                    if (rv4Var5.d(intValue7)) {
                        i8 = 32;
                    } else {
                        i8 = 16;
                    }
                    i7 |= i8;
                }
                if ((i7 & Token.EXPR_VOID) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var5.U(i7 & 1, z4)) {
                    h34 h34Var2 = (h34) list.get(intValue7);
                    rv4Var5.e0(62273147);
                    String str2 = h34Var2.e.a;
                    boolean f6 = rv4Var5.f(xt4Var6) | rv4Var5.h(h34Var2);
                    Object P6 = rv4Var5.P();
                    if (f6 || P6 == obj5) {
                        P6 = new cq0(xt4Var6, h34Var2, null, 1);
                        rv4Var5.o0(P6);
                    }
                    yte.g((lu4) P6, rv4Var5, str2);
                    nq7 A2 = zbe.A(zbe.C(xg6.a(xg6Var4, pna.f(kq7Var, 1.0f)), nae.e, nae.e, nae.e, 12.0f, 7), 16.0f, nae.e, 2);
                    boolean f7 = rv4Var5.f(xt4Var5) | rv4Var5.h(h34Var2);
                    Object P7 = rv4Var5.P();
                    if (f7 || P7 == obj5) {
                        P7 = new dq0(xt4Var5, h34Var2, 1);
                        rv4Var5.o0(P7);
                    }
                    vt4 vt4Var2 = (vt4) P7;
                    boolean f8 = rv4Var5.f(lu4Var3) | rv4Var5.h(h34Var2);
                    Object P8 = rv4Var5.P();
                    if (f8 || P8 == obj5) {
                        P8 = new eq0(lu4Var3, h34Var2, 2);
                        rv4Var5.o0(P8);
                    }
                    xt4 xt4Var7 = (xt4) P8;
                    boolean f9 = rv4Var5.f(xt4Var4) | rv4Var5.h(h34Var2);
                    Object P9 = rv4Var5.P();
                    if (f9 || P9 == obj5) {
                        P9 = new dq0(xt4Var4, h34Var2, 2);
                        rv4Var5.o0(P9);
                    }
                    ase.h(h34Var2, A2, vt4Var2, xt4Var7, (vt4) P9, rv4Var5, 0);
                    rv4Var5.q(false);
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
            case 4:
                xg6 xg6Var5 = (xg6) obj;
                int intValue9 = ((Number) obj2).intValue();
                rv4 rv4Var6 = (rv4) obj3;
                int intValue10 = ((Number) obj4).intValue();
                vt4 vt4Var3 = (vt4) obj7;
                xt4 xt4Var8 = (xt4) obj8;
                aw7 aw7Var = (aw7) obj9;
                yya yyaVar = (yya) obj6;
                if ((intValue10 & 6) == 0) {
                    if (!rv4Var6.f(xg6Var5)) {
                        i16 = 2;
                    }
                    i9 = intValue10 | i16;
                } else {
                    i9 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    if (rv4Var6.d(intValue9)) {
                        i10 = 32;
                    } else {
                        i10 = 16;
                    }
                    i9 |= i10;
                }
                if ((i9 & Token.EXPR_VOID) != 146) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (rv4Var6.U(i9 & 1, z5)) {
                    f76 f76Var = (f76) list.get(intValue9);
                    rv4Var6.e0(1787623097);
                    nq7 A3 = zbe.A(pna.f(kq7Var, 1.0f), 12.0f, nae.e, 2);
                    gv9 a = ev9.a(lz.a, kh5.G, rv4Var6, 48);
                    int hashCode2 = Long.hashCode(rv4Var6.T);
                    xt8 l2 = rv4Var6.l();
                    nq7 p2 = lye.p(rv4Var6, A3);
                    rw1.k.getClass();
                    zx1 zx1Var2 = qw1.b;
                    rv4Var6.i0();
                    if (rv4Var6.S) {
                        rv4Var6.k(zx1Var2);
                    } else {
                        rv4Var6.r0();
                    }
                    jce.F(qw1.f, rv4Var6, a);
                    jce.F(qw1.e, rv4Var6, l2);
                    jce.F(qw1.g, rv4Var6, Integer.valueOf(hashCode2));
                    jce.C(qw1.h, rv4Var6);
                    jce.F(qw1.d, rv4Var6, p2);
                    boolean f10 = rv4Var6.f((List) aw7Var.getValue()) | rv4Var6.f(f76Var);
                    Object P10 = rv4Var6.P();
                    if (f10 || P10 == obj5) {
                        List<f76> list2 = (List) aw7Var.getValue();
                        if (list2 == null || !list2.isEmpty()) {
                            for (f76 f76Var2 : list2) {
                                if (c16.i(f76Var2.b(), f76Var.b())) {
                                    z6 = true;
                                    P10 = Boolean.valueOf(z6);
                                    rv4Var6.o0(P10);
                                }
                            }
                        }
                        z6 = false;
                        P10 = Boolean.valueOf(z6);
                        rv4Var6.o0(P10);
                    }
                    boolean booleanValue = ((Boolean) P10).booleanValue();
                    boolean f11 = rv4Var6.f(((et5) yyaVar.getValue()).a) | rv4Var6.f(f76Var);
                    Object P11 = rv4Var6.P();
                    if (f11 || P11 == obj5) {
                        P11 = Boolean.valueOf(((et5) yyaVar.getValue()).a.contains(f76Var.b()));
                        rv4Var6.o0(P11);
                    }
                    boolean booleanValue2 = ((Boolean) P11).booleanValue();
                    boolean f12 = rv4Var6.f(((et5) yyaVar.getValue()).b) | rv4Var6.f(f76Var);
                    Object P12 = rv4Var6.P();
                    if (f12 || P12 == obj5) {
                        P12 = Boolean.valueOf(((et5) yyaVar.getValue()).b.contains(f76Var.b()));
                        rv4Var6.o0(P12);
                    }
                    boolean booleanValue3 = ((Boolean) P12).booleanValue();
                    boolean f13 = rv4Var6.f(((et5) yyaVar.getValue()).c) | rv4Var6.f(f76Var);
                    Object P13 = rv4Var6.P();
                    if (f13 || P13 == obj5) {
                        P13 = Boolean.valueOf(((et5) yyaVar.getValue()).c.contains(f76Var.b()));
                        rv4Var6.o0(P13);
                    }
                    boolean booleanValue4 = ((Boolean) P13).booleanValue();
                    boolean f14 = rv4Var6.f(((et5) yyaVar.getValue()).d) | rv4Var6.f(f76Var);
                    Object P14 = rv4Var6.P();
                    if (f14 || P14 == obj5) {
                        P14 = (String) ((et5) yyaVar.getValue()).d.get(f76Var.b());
                        rv4Var6.o0(P14);
                    }
                    String str3 = (String) P14;
                    if (!booleanValue4) {
                        rv4Var6.e0(66228510);
                        boolean f15 = rv4Var6.f(f76Var);
                        Object P15 = rv4Var6.P();
                        if (f15 || P15 == obj5) {
                            P15 = new y74(27, f76Var, aw7Var);
                            rv4Var6.o0(P15);
                        }
                        ase.b(booleanValue, (xt4) P15, null, false, null, rv4Var6, 0);
                        rv4Var = rv4Var6;
                        rv4Var.q(false);
                    } else {
                        rv4Var = rv4Var6;
                        rv4Var.e0(66694595);
                        rv4Var.q(false);
                    }
                    String name = f76Var.getName();
                    tza tzaVar = j27.a;
                    oyb oybVar = ((h27) rv4Var.j(tzaVar)).b.j;
                    long j2 = ((h27) rv4Var.j(tzaVar)).a.q;
                    rv4 rv4Var7 = rv4Var;
                    we6 we6Var = new we6(1.0f, true);
                    if (booleanValue4) {
                        f = nae.e;
                    } else {
                        f = 12.0f;
                    }
                    cvb.c(name, zbe.B(we6Var, f, 8.0f, 12.0f, 8.0f), j2, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, oybVar, rv4Var7, 0, 24960, 110584);
                    if (booleanValue2) {
                        rv4Var7.e0(67394699);
                        eg0.f(pna.n(kq7Var, 24.0f), 0L, null, rv4Var7, 6, 6);
                        z7 = false;
                        rv4Var7.q(false);
                    } else if (booleanValue4) {
                        rv4Var7.e0(67604724);
                        if (str3 != null) {
                            rv4Var7.e0(67644249);
                            boolean f16 = rv4Var7.f(xt4Var8) | rv4Var7.f(str3) | rv4Var7.f(vt4Var3);
                            Object P16 = rv4Var7.P();
                            if (f16 || P16 == obj5) {
                                P16 = new sd0(3, xt4Var8, str3, vt4Var3);
                                rv4Var7.o0(P16);
                            }
                            nmd.b((vt4) P16, pna.h(kq7Var, 32.0f), false, null, null, null, null, rv4Var7, 805306416);
                            z7 = false;
                            rv4Var7.q(false);
                        } else {
                            z7 = false;
                            rv4Var7.e0(68406632);
                            nk5.a(rp5.c((wk3) jk3.v.getValue(), rv4Var7, 0), null, pna.n(kq7Var, 24.0f), ((h27) rv4Var7.j(tzaVar)).a.a, rv4Var7, 432, 0);
                            rv4Var7.q(false);
                        }
                        rv4Var7.q(z7);
                    } else {
                        z7 = false;
                        if (booleanValue3) {
                            rv4Var7.e0(68816638);
                            nk5.a(rp5.c((wk3) jk3.R.getValue(), rv4Var7, 0), null, pna.n(kq7Var, 24.0f), ((h27) rv4Var7.j(tzaVar)).a.w, rv4Var7, 432, 0);
                            rv4Var7.q(false);
                        } else {
                            rv4Var7.e0(69120035);
                            rv4Var7.q(false);
                        }
                    }
                    rv4Var7.q(true);
                    rv4Var7.q(z7);
                } else {
                    rv4Var6.X();
                }
                return pvcVar;
            case 5:
                yf6 yf6Var = (yf6) obj;
                int intValue11 = ((Number) obj2).intValue();
                rv4 rv4Var8 = (rv4) obj3;
                int intValue12 = ((Number) obj4).intValue();
                xt4 xt4Var9 = (xt4) obj9;
                xt4 xt4Var10 = (xt4) obj6;
                xt4 xt4Var11 = (xt4) obj7;
                wb9 wb9Var = (wb9) obj8;
                if ((intValue12 & 6) == 0) {
                    if (!rv4Var8.f(yf6Var)) {
                        i16 = 2;
                    }
                    i11 = intValue12 | i16;
                } else {
                    i11 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    if (rv4Var8.d(intValue11)) {
                        i12 = 32;
                    } else {
                        i12 = 16;
                    }
                    i11 |= i12;
                }
                int i18 = i11;
                if ((i18 & Token.EXPR_VOID) != 146) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (rv4Var8.U(i18 & 1, z8)) {
                    ac9 ac9Var = (ac9) list.get(intValue11);
                    rv4Var8.e0(-646251780);
                    if (intValue11 == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (intValue11 == tl1.x(wb9Var.a)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z14 = wb9Var.j;
                    boolean contains = wb9Var.i.contains(ac9Var.a);
                    boolean f17 = rv4Var8.f(xt4Var11) | rv4Var8.f(ac9Var);
                    Object P17 = rv4Var8.P();
                    if (f17 || P17 == obj5) {
                        P17 = new ub9(xt4Var11, ac9Var, 0);
                        rv4Var8.o0(P17);
                    }
                    vt4 vt4Var4 = (vt4) P17;
                    boolean f18 = rv4Var8.f(xt4Var10) | rv4Var8.f(ac9Var);
                    Object P18 = rv4Var8.P();
                    if (f18 || P18 == obj5) {
                        P18 = new ub9(xt4Var10, ac9Var, 1);
                        rv4Var8.o0(P18);
                    }
                    vt4 vt4Var5 = (vt4) P18;
                    boolean f19 = rv4Var8.f(xt4Var9) | rv4Var8.f(ac9Var);
                    Object P19 = rv4Var8.P();
                    if (f19 || P19 == obj5) {
                        P19 = new ub9(xt4Var9, ac9Var, 2);
                        rv4Var8.o0(P19);
                    }
                    yqe.l(ac9Var, z9, z10, z14, contains, vt4Var4, vt4Var5, (vt4) P19, yf6.a(yf6Var, kq7Var), rv4Var8, 0);
                    rv4Var8.q(false);
                } else {
                    rv4Var8.X();
                }
                return pvcVar;
            default:
                xg6 xg6Var6 = (xg6) obj;
                int intValue13 = ((Number) obj2).intValue();
                rv4 rv4Var9 = (rv4) obj3;
                int intValue14 = ((Number) obj4).intValue();
                if ((intValue14 & 6) == 0) {
                    if (!rv4Var9.f(xg6Var6)) {
                        i16 = 2;
                    }
                    i13 = intValue14 | i16;
                } else {
                    i13 = intValue14;
                }
                if ((48 & intValue14) == 0) {
                    if (rv4Var9.d(intValue13)) {
                        i14 = 32;
                    } else {
                        i14 = 16;
                    }
                    i13 |= i14;
                }
                if ((i13 & Token.EXPR_VOID) != 146) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (rv4Var9.U(i13 & 1, z11)) {
                    orc orcVar = (orc) list.get(intValue13);
                    rv4Var9.e0(-912276151);
                    if (intValue13 == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (intValue13 == tl1.x((List) ((aw7) obj9).getValue())) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    vqe.p(xg6Var6, (vo9) obj8, orcVar.a, null, false, null, jce.E(-1686838816, new pr3(z12, z13, (nu4) obj7, orcVar, (xt4) obj6, (aw7) obj9, 3), rv4Var9), rv4Var9, (i13 & 14) | 1572864, 28);
                    rv4Var9.q(false);
                } else {
                    rv4Var9.X();
                }
                return pvcVar;
        }
    }

    public sq3(List list, vo9 vo9Var, aw7 aw7Var, nu4 nu4Var, xt4 xt4Var) {
        this.a = 6;
        this.b = list;
        this.c = vo9Var;
        this.f = aw7Var;
        this.d = nu4Var;
        this.e = xt4Var;
    }

    public /* synthetic */ sq3(List list, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = list;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }
}
