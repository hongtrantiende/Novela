package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f07  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class f07 implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f07(cg1 cg1Var, j62 j62Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, xt4 xt4Var, aw7 aw7Var) {
        this.a = 2;
        this.b = cg1Var;
        this.c = j62Var;
        this.e = vt4Var;
        this.f = vt4Var2;
        this.C = vt4Var3;
        this.D = vt4Var4;
        this.E = xt4Var;
        this.d = aw7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean, int] */
    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        float f;
        Object obj3;
        boolean z3;
        ?? r12;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        boolean z6;
        boolean z7;
        int i3 = this.a;
        kq7 kq7Var = kq7.a;
        Object obj4 = ax1.a;
        pvc pvcVar = pvc.a;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.E;
        Object obj8 = this.D;
        Object obj9 = this.C;
        Object obj10 = this.f;
        Object obj11 = this.c;
        Object obj12 = this.b;
        switch (i3) {
            case 0:
                final iw2 iw2Var = (iw2) obj12;
                final m82 m82Var = (m82) obj11;
                aw7 aw7Var = (aw7) obj6;
                aw7 aw7Var2 = (aw7) obj5;
                cz7 cz7Var = (cz7) obj10;
                at5 at5Var = (at5) obj9;
                rj8 rj8Var = (rj8) obj8;
                yya yyaVar = (yya) obj7;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    kxe.c(iw2Var, zf0.b((dc6) rv4Var.j(zf0.a), rv4Var).a0(pna.c), null, null, 0, nae.e, null, null, false, null, null, null, null, jce.E(-1114892966, new q7(cz7Var, m82Var, iw2Var, rj8Var), rv4Var), rv4Var, 100663296, 24576, 16124);
                    boolean a = ikd.a(rv4Var);
                    if (iw2Var.k() != 0 && (iw2Var.k() != 2 || !((y0d) yyaVar.getValue()).i)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    nk0 nk0Var = kh5.E;
                    pu0 pu0Var = pu0.a;
                    nq7 u = mwe.u(pu0Var.a(kq7Var, nk0Var), false, 15);
                    if (a) {
                        f = 80.0f;
                    } else {
                        f = 0.0f;
                    }
                    rte.c(z2, zbe.y(zbe.C(u, nae.e, nae.e, nae.e, f, 7), 12.0f), zt3.k(null, nae.e, 0L, 7), zt3.m(nae.e, 0L, 7), null, jce.E(1798833969, new g83(iw2Var, rj8Var, cz7Var, aw7Var, 13), rv4Var), rv4Var, 200064, 16);
                    if (a) {
                        rv4Var.e0(1490833486);
                        int k = iw2Var.k();
                        nq7 a2 = pu0Var.a(kq7Var, kh5.D);
                        boolean h = rv4Var.h(m82Var) | rv4Var.f(iw2Var);
                        Object P = rv4Var.P();
                        if (!h && P != obj4) {
                            r12 = 0;
                        } else {
                            r12 = 0;
                            P = new xt4() { // from class: b07
                                @Override // defpackage.xt4
                                public final Object invoke(Object obj13) {
                                    int i4 = r3;
                                    pvc pvcVar2 = pvc.a;
                                    iw2 iw2Var2 = iw2Var;
                                    m82 m82Var2 = m82Var;
                                    int intValue2 = ((Integer) obj13).intValue();
                                    switch (i4) {
                                        case 0:
                                            z87.v(m82Var2, null, null, new ed3(iw2Var2, intValue2, null, 1), 3);
                                            return pvcVar2;
                                        default:
                                            z87.v(m82Var2, null, null, new ed3(iw2Var2, intValue2, null, 2), 3);
                                            return pvcVar2;
                                    }
                                }
                            };
                            rv4Var.o0(P);
                        }
                        jue.c(k, r12, (xt4) P, rv4Var, a2);
                        rv4Var.q(r12);
                        obj3 = obj4;
                    } else {
                        rv4Var.e0(1491252141);
                        nq7 c = pna.c(kq7Var, 1.0f);
                        b37 d = fu0.d(kh5.a, false);
                        obj3 = obj4;
                        int hashCode = Long.hashCode(rv4Var.T);
                        xt8 l = rv4Var.l();
                        nq7 p = lye.p(rv4Var, c);
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
                        int k2 = iw2Var.k();
                        nq7 a3 = pu0Var.a(pna.c(kq7Var, 1.0f), kh5.e);
                        boolean h2 = rv4Var.h(m82Var) | rv4Var.f(iw2Var);
                        Object P2 = rv4Var.P();
                        if (!h2 && P2 != obj3) {
                            z3 = true;
                        } else {
                            z3 = true;
                            P2 = new xt4() { // from class: b07
                                @Override // defpackage.xt4
                                public final Object invoke(Object obj13) {
                                    int i4 = r3;
                                    pvc pvcVar2 = pvc.a;
                                    iw2 iw2Var2 = iw2Var;
                                    m82 m82Var2 = m82Var;
                                    int intValue2 = ((Integer) obj13).intValue();
                                    switch (i4) {
                                        case 0:
                                            z87.v(m82Var2, null, null, new ed3(iw2Var2, intValue2, null, 1), 3);
                                            return pvcVar2;
                                        default:
                                            z87.v(m82Var2, null, null, new ed3(iw2Var2, intValue2, null, 2), 3);
                                            return pvcVar2;
                                    }
                                }
                            };
                            rv4Var.o0(P2);
                        }
                        jue.w(k2, 0, (xt4) P2, rv4Var, a3);
                        rv4Var.q(z3);
                        rv4Var.q(false);
                    }
                    Object P3 = rv4Var.P();
                    if (P3 == obj3) {
                        P3 = new zu8(null);
                        rv4Var.o0(P3);
                    }
                    zu8 zu8Var = (zu8) P3;
                    Object P4 = rv4Var.P();
                    if (P4 == obj3) {
                        P4 = new c07(at5Var, 0);
                        rv4Var.o0(P4);
                    }
                    kd4 u2 = w92.u(zu8Var, (xt4) P4, rv4Var, 56);
                    boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
                    boolean f2 = rv4Var.f(aw7Var);
                    Object P5 = rv4Var.P();
                    if (f2 || P5 == obj3) {
                        P5 = new qp4(aw7Var, 29);
                        rv4Var.o0(P5);
                    }
                    xt4 xt4Var = (xt4) P5;
                    boolean f3 = rv4Var.f(u2) | rv4Var.f(aw7Var);
                    Object P6 = rv4Var.P();
                    if (f3 || P6 == obj3) {
                        P6 = new fe3(u2, aw7Var, 2);
                        rv4Var.o0(P6);
                    }
                    vt4 vt4Var = (vt4) P6;
                    boolean f4 = rv4Var.f(aw7Var) | rv4Var.f(aw7Var2);
                    Object P7 = rv4Var.P();
                    if (f4 || P7 == obj3) {
                        P7 = new he1(aw7Var, aw7Var2, 10);
                        rv4Var.o0(P7);
                    }
                    vt4 vt4Var2 = (vt4) P7;
                    boolean f5 = rv4Var.f(aw7Var) | rv4Var.f(cz7Var);
                    Object P8 = rv4Var.P();
                    if (f5 || P8 == obj3) {
                        P8 = new rp0(cz7Var, aw7Var, 20);
                        rv4Var.o0(P8);
                    }
                    pbe.a(booleanValue, xt4Var, vt4Var, vt4Var2, (vt4) P8, rv4Var, 0);
                    boolean booleanValue2 = ((Boolean) aw7Var2.getValue()).booleanValue();
                    boolean f6 = rv4Var.f(aw7Var2);
                    Object P9 = rv4Var.P();
                    if (f6 || P9 == obj3) {
                        P9 = new d07(aw7Var2, 0);
                        rv4Var.o0(P9);
                    }
                    xt4 xt4Var2 = (xt4) P9;
                    boolean f7 = rv4Var.f(aw7Var2);
                    Object P10 = rv4Var.P();
                    if (f7 || P10 == obj3) {
                        P10 = new d07(aw7Var2, 1);
                        rv4Var.o0(P10);
                    }
                    nc2.a(booleanValue2, xt4Var2, (xt4) P10, rv4Var, 0);
                    boolean f8 = rv4Var.f(cz7Var);
                    Object P11 = rv4Var.P();
                    if (f8 || P11 == obj3) {
                        P11 = new ar0(cz7Var, 11);
                        rv4Var.o0(P11);
                    }
                    pae.b(at5Var, (xt4) P11, rv4Var, 6);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                String str = (String) obj12;
                List list = (List) obj11;
                p6d p6dVar = (p6d) obj6;
                xt4 xt4Var3 = (xt4) obj5;
                vt4 vt4Var3 = (vt4) obj10;
                vt4 vt4Var4 = (vt4) obj9;
                vt4 vt4Var5 = (vt4) obj8;
                xt4 xt4Var4 = (xt4) obj7;
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var2.U(1 & intValue2, z4)) {
                    eg0.l(str, list, p6dVar, xt4Var3, mwe.u(pna.c, false, 3), null, null, vt4Var3, vt4Var4, vt4Var5, xt4Var4, rv4Var2, 0);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                cg1 cg1Var = (cg1) obj12;
                j62 j62Var = (j62) obj11;
                vt4 vt4Var6 = (vt4) obj5;
                vt4 vt4Var7 = (vt4) obj10;
                vt4 vt4Var8 = (vt4) obj9;
                vt4 vt4Var9 = (vt4) obj8;
                xt4 xt4Var5 = (xt4) obj7;
                aw7 aw7Var3 = (aw7) obj6;
                rv4 rv4Var3 = (rv4) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (rv4Var3.U(intValue3 & 1, z5)) {
                    nq7 z8 = zbe.z(mwe.x(pna.f(kq7Var, 1.0f), 13), 16.0f, 8.0f);
                    xn1 a4 = wn1.a(new hz(8.0f, true, new vs(2)), kh5.I, rv4Var3, 6);
                    int hashCode2 = Long.hashCode(rv4Var3.T);
                    xt8 l2 = rv4Var3.l();
                    nq7 p2 = lye.p(rv4Var3, z8);
                    rw1.k.getClass();
                    zx1 zx1Var2 = qw1.b;
                    rv4Var3.i0();
                    if (rv4Var3.S) {
                        rv4Var3.k(zx1Var2);
                    } else {
                        rv4Var3.r0();
                    }
                    jce.F(qw1.f, rv4Var3, a4);
                    jce.F(qw1.e, rv4Var3, l2);
                    jce.F(qw1.g, rv4Var3, Integer.valueOf(hashCode2));
                    jce.C(qw1.h, rv4Var3);
                    jce.F(qw1.d, rv4Var3, p2);
                    hma.p(jce.E(-615725766, new t81(15, j62Var, cg1Var), rv4Var3), rv4Var3, 6);
                    if (cg1Var.s || cg1Var.u || cg1Var.r) {
                        i = 0;
                        rv4Var3.e0(-1682022366);
                        i2 = 6;
                        hma.p(jce.E(390056703, new w81(cg1Var, vt4Var6, vt4Var7, vt4Var8, vt4Var9), rv4Var3), rv4Var3, 6);
                        rv4Var3.q(false);
                    } else {
                        rv4Var3.e0(-1680727899);
                        i = 0;
                        rv4Var3.q(false);
                        i2 = 6;
                    }
                    hma.p(jce.E(1983858595, new ld1(i, cg1Var, xt4Var5, aw7Var3), rv4Var3), rv4Var3, i2);
                    rv4Var3.q(true);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 3:
                ((Integer) obj2).getClass();
                jue.e((n24) obj12, (vt4) obj11, (xt4) obj6, (xt4) obj5, (xt4) obj10, (xt4) obj9, (xt4) obj8, (vt4) obj7, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 4:
                String str2 = (String) obj12;
                xt4 xt4Var6 = (xt4) obj11;
                lu4 lu4Var = (lu4) obj6;
                xt4 xt4Var7 = (xt4) obj5;
                xt4 xt4Var8 = (xt4) obj10;
                xt4 xt4Var9 = (xt4) obj9;
                xt4 xt4Var10 = (xt4) obj8;
                xt4 xt4Var11 = (xt4) obj7;
                rv4 rv4Var4 = (rv4) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (rv4Var4.U(intValue4 & 1, z6)) {
                    nq7 y = zbe.y(pna.f(kq7Var, 1.0f), 8.0f);
                    boolean f9 = rv4Var4.f(xt4Var6);
                    Object P12 = rv4Var4.P();
                    if (f9 || P12 == obj4) {
                        P12 = new hg7(22, xt4Var6);
                        rv4Var4.o0(P12);
                    }
                    vt4 vt4Var10 = (vt4) P12;
                    boolean f10 = rv4Var4.f(xt4Var6);
                    Object P13 = rv4Var4.P();
                    if (f10 || P13 == obj4) {
                        P13 = new hg7(23, xt4Var6);
                        rv4Var4.o0(P13);
                    }
                    ube.l(str2, y, vt4Var10, lu4Var, xt4Var7, xt4Var8, xt4Var9, xt4Var10, xt4Var11, (vt4) P13, rv4Var4, 48);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            case 5:
                ((Integer) obj2).getClass();
                kwe.f((cz7) obj10, (y5c) obj12, (kub) obj11, (nnb) obj6, (e6c) obj5, (j2c) obj9, (rh8) obj8, (nq7) obj7, (rv4) obj, xoe.p(12582913));
                return pvcVar;
            default:
                e33 e33Var = (e33) obj12;
                shc shcVar = (shc) obj11;
                cz7 cz7Var2 = (cz7) obj10;
                w43 w43Var = (w43) obj9;
                g13 g13Var = (g13) obj8;
                yya yyaVar2 = (yya) obj7;
                aw7 aw7Var4 = (aw7) obj6;
                aw7 aw7Var5 = (aw7) obj5;
                rv4 rv4Var5 = (rv4) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (rv4Var5.U(intValue5 & 1, z7)) {
                    String str3 = ((y0d) yyaVar2.getValue()).b;
                    int i4 = ((y0d) yyaVar2.getValue()).g;
                    boolean f11 = rv4Var5.f(shcVar) | rv4Var5.h(e33Var);
                    Object P14 = rv4Var5.P();
                    if (f11 || P14 == obj4) {
                        P14 = new fhc(shcVar, e33Var, 1);
                        rv4Var5.o0(P14);
                    }
                    vt4 vt4Var11 = (vt4) P14;
                    Object P15 = rv4Var5.P();
                    if (P15 == obj4) {
                        P15 = new ghc(aw7Var4, aw7Var5, 1);
                        rv4Var5.o0(P15);
                    }
                    xt4 xt4Var12 = (xt4) P15;
                    boolean f12 = rv4Var5.f(cz7Var2) | rv4Var5.h(w43Var) | rv4Var5.h(e33Var);
                    Object P16 = rv4Var5.P();
                    if (f12 || P16 == obj4) {
                        P16 = new hhc(cz7Var2, w43Var, e33Var, 1);
                        rv4Var5.o0(P16);
                    }
                    vt4 vt4Var12 = (vt4) P16;
                    boolean f13 = rv4Var5.f(g13Var) | rv4Var5.h(e33Var);
                    Object P17 = rv4Var5.P();
                    if (f13 || P17 == obj4) {
                        P17 = new ihc(g13Var, e33Var, 1);
                        rv4Var5.o0(P17);
                    }
                    rgc.h(e33Var, str3, i4, null, vt4Var11, xt4Var12, vt4Var12, (vt4) P17, rv4Var5, 196616);
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ f07(e33 e33Var, shc shcVar, cz7 cz7Var, w43 w43Var, g13 g13Var, yya yyaVar, aw7 aw7Var, aw7 aw7Var2) {
        this.a = 6;
        this.b = e33Var;
        this.c = shcVar;
        this.f = cz7Var;
        this.C = w43Var;
        this.D = g13Var;
        this.E = yyaVar;
        this.d = aw7Var;
        this.e = aw7Var2;
    }

    public /* synthetic */ f07(n24 n24Var, vt4 vt4Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, xt4 xt4Var5, vt4 vt4Var2, int i) {
        this.a = 3;
        this.b = n24Var;
        this.c = vt4Var;
        this.d = xt4Var;
        this.e = xt4Var2;
        this.f = xt4Var3;
        this.C = xt4Var4;
        this.D = xt4Var5;
        this.E = vt4Var2;
    }

    public /* synthetic */ f07(cz7 cz7Var, y5c y5cVar, kub kubVar, nnb nnbVar, e6c e6cVar, j2c j2cVar, rh8 rh8Var, nq7 nq7Var, int i) {
        this.a = 5;
        this.f = cz7Var;
        this.b = y5cVar;
        this.c = kubVar;
        this.d = nnbVar;
        this.e = e6cVar;
        this.C = j2cVar;
        this.D = rh8Var;
        this.E = nq7Var;
    }

    public /* synthetic */ f07(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.C = obj6;
        this.D = obj7;
        this.E = obj8;
    }
}
