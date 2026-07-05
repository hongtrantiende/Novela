package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r33  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class r33 implements mu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r33(boolean z, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, aw7 aw7Var) {
        this.a = 3;
        this.b = z;
        this.c = vt4Var;
        this.d = vt4Var2;
        this.f = vt4Var3;
        this.C = vt4Var4;
        this.e = aw7Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        kq7 kq7Var;
        int i;
        boolean z4;
        pvc pvcVar;
        rv4 rv4Var;
        float f;
        fa7 fa7Var;
        xt4 xt4Var;
        int i2;
        boolean z5;
        rv4 rv4Var2;
        int i3 = this.a;
        pu0 pu0Var = pu0.a;
        lh9 lh9Var = ax1.a;
        pvc pvcVar2 = pvc.a;
        Object obj4 = this.e;
        Object obj5 = this.C;
        Object obj6 = this.f;
        Object obj7 = this.d;
        Object obj8 = this.c;
        boolean z6 = this.b;
        switch (i3) {
            case 0:
                final yya yyaVar = (yya) obj8;
                aw7 aw7Var = (aw7) obj4;
                yya yyaVar2 = (yya) obj7;
                final aw7 aw7Var2 = (aw7) obj6;
                final cz7 cz7Var = (cz7) obj5;
                rv4 rv4Var3 = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var3.U(intValue & 1, z)) {
                    boolean z7 = ((v43) yyaVar.getValue()).a;
                    kq7 kq7Var2 = kq7.a;
                    if (!z7) {
                        rv4Var3.e0(-1656887757);
                        kwe.c(null, jce.E(-1644131738, new i64(1, aw7Var, yyaVar2), rv4Var3), rv4Var3, 48);
                        z2 = false;
                        rs8.v(kq7Var2, 6.0f, rv4Var3, false);
                    } else {
                        z2 = false;
                        rv4Var3.e0(-1656290976);
                        rv4Var3.q(false);
                    }
                    if (!z6 && ((v43) yyaVar.getValue()).i != null) {
                        rv4Var3.e0(-1656110804);
                        b37 d = fu0.d(kh5.a, z2);
                        int hashCode = Long.hashCode(rv4Var3.T);
                        xt8 l = rv4Var3.l();
                        nq7 p = lye.p(rv4Var3, kq7Var2);
                        rw1.k.getClass();
                        zx1 zx1Var = qw1.b;
                        rv4Var3.i0();
                        if (rv4Var3.S) {
                            rv4Var3.k(zx1Var);
                        } else {
                            rv4Var3.r0();
                        }
                        jce.F(qw1.f, rv4Var3, d);
                        jce.F(qw1.e, rv4Var3, l);
                        jce.F(qw1.g, rv4Var3, Integer.valueOf(hashCode));
                        jce.C(qw1.h, rv4Var3);
                        jce.F(qw1.d, rv4Var3, p);
                        ar5 c = rp5.c((wk3) ok3.M.getValue(), rv4Var3, 0);
                        boolean f2 = rv4Var3.f(aw7Var2);
                        Object P = rv4Var3.P();
                        if (f2 || P == lh9Var) {
                            P = new ae1(aw7Var2, 16);
                            rv4Var3.o0(P);
                        }
                        kwe.d(c, null, 0L, (vt4) P, rv4Var3, 0, 6);
                        boolean booleanValue = ((Boolean) aw7Var2.getValue()).booleanValue();
                        boolean f3 = rv4Var3.f(aw7Var2) | rv4Var3.f(yyaVar) | rv4Var3.f(cz7Var);
                        Object P2 = rv4Var3.P();
                        if (f3 || P2 == lh9Var) {
                            P2 = new vt4() { // from class: t33
                                @Override // defpackage.vt4
                                public final Object invoke() {
                                    String str;
                                    int i4 = r4;
                                    pvc pvcVar3 = pvc.a;
                                    cz7 cz7Var2 = cz7Var;
                                    yya yyaVar3 = yyaVar;
                                    aw7 aw7Var3 = aw7Var2;
                                    switch (i4) {
                                        case 0:
                                            aw7Var3.setValue(Boolean.FALSE);
                                            k23 k23Var = ((v43) yyaVar3.getValue()).i;
                                            if (k23Var != null && (str = k23Var.c) != null) {
                                                tc4.r(cz7Var2, str);
                                            }
                                            return pvcVar3;
                                        default:
                                            aw7Var3.setValue(Boolean.FALSE);
                                            k23 k23Var2 = ((v43) yyaVar3.getValue()).i;
                                            if (k23Var2 != null) {
                                                String str2 = k23Var2.a;
                                                cz7Var2.getClass();
                                                cz7Var2.a.c(new u85(str2));
                                            }
                                            return pvcVar3;
                                    }
                                }
                            };
                            rv4Var3.o0(P2);
                        }
                        vt4 vt4Var = (vt4) P2;
                        Object P3 = rv4Var3.P();
                        if (P3 == lh9Var) {
                            P3 = new cd1(15);
                            rv4Var3.o0(P3);
                        }
                        vt4 vt4Var2 = (vt4) P3;
                        boolean f4 = rv4Var3.f(aw7Var2) | rv4Var3.f(yyaVar) | rv4Var3.f(cz7Var);
                        Object P4 = rv4Var3.P();
                        if (f4 || P4 == lh9Var) {
                            P4 = new vt4() { // from class: t33
                                @Override // defpackage.vt4
                                public final Object invoke() {
                                    String str;
                                    int i4 = r4;
                                    pvc pvcVar3 = pvc.a;
                                    cz7 cz7Var2 = cz7Var;
                                    yya yyaVar3 = yyaVar;
                                    aw7 aw7Var3 = aw7Var2;
                                    switch (i4) {
                                        case 0:
                                            aw7Var3.setValue(Boolean.FALSE);
                                            k23 k23Var = ((v43) yyaVar3.getValue()).i;
                                            if (k23Var != null && (str = k23Var.c) != null) {
                                                tc4.r(cz7Var2, str);
                                            }
                                            return pvcVar3;
                                        default:
                                            aw7Var3.setValue(Boolean.FALSE);
                                            k23 k23Var2 = ((v43) yyaVar3.getValue()).i;
                                            if (k23Var2 != null) {
                                                String str2 = k23Var2.a;
                                                cz7Var2.getClass();
                                                cz7Var2.a.c(new u85(str2));
                                            }
                                            return pvcVar3;
                                    }
                                }
                            };
                            rv4Var3.o0(P4);
                        }
                        vt4 vt4Var3 = (vt4) P4;
                        boolean f5 = rv4Var3.f(aw7Var2);
                        Object P5 = rv4Var3.P();
                        if (f5 || P5 == lh9Var) {
                            P5 = new ae1(aw7Var2, 17);
                            rv4Var3.o0(P5);
                        }
                        nqe.g(booleanValue, vt4Var, vt4Var2, vt4Var3, (vt4) P5, rv4Var3, 384);
                        rv4Var3.q(true);
                        rv4Var3.q(false);
                    } else {
                        rv4Var3.e0(-1655076768);
                        rv4Var3.q(z2);
                    }
                } else {
                    rv4Var3.X();
                }
                return pvcVar2;
            case 1:
                v72 v72Var = (v72) obj8;
                da7 da7Var = (da7) obj7;
                xt4 xt4Var2 = (xt4) obj4;
                xt4 xt4Var3 = (xt4) obj6;
                db7 db7Var = (db7) obj5;
                su0 su0Var = (su0) obj;
                rv4 rv4Var4 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                su0Var.getClass();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var4.f(su0Var)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue2 |= i;
                }
                if ((intValue2 & 19) != 18) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var4.U(intValue2 & 1, z3)) {
                    float d2 = su0Var.d() * 0.8f;
                    nk0 nk0Var = kh5.c;
                    kq7 kq7Var3 = kq7.a;
                    nq7 a = pu0Var.a(kq7Var3, nk0Var);
                    gv9 a2 = ev9.a(lz.a, kh5.F, rv4Var4, 0);
                    int hashCode2 = Long.hashCode(rv4Var4.T);
                    xt8 l2 = rv4Var4.l();
                    nq7 p2 = lye.p(rv4Var4, a);
                    rw1.k.getClass();
                    zx1 zx1Var2 = qw1.b;
                    rv4Var4.i0();
                    if (rv4Var4.S) {
                        rv4Var4.k(zx1Var2);
                    } else {
                        rv4Var4.r0();
                    }
                    np npVar = qw1.f;
                    jce.F(npVar, rv4Var4, a2);
                    np npVar2 = qw1.e;
                    jce.F(npVar2, rv4Var4, l2);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    np npVar3 = qw1.g;
                    jce.F(npVar3, rv4Var4, valueOf);
                    kg kgVar = qw1.h;
                    jce.C(kgVar, rv4Var4);
                    np npVar4 = qw1.d;
                    jce.F(npVar4, rv4Var4, p2);
                    if (z6) {
                        rv4Var4.e0(1229900932);
                        ts6.a(1.5f, 48, 1, 0L, rv4Var4, pna.n(kq7Var3, 10.0f).a0(new k5d(kh5.H)));
                        rv4Var4.q(false);
                    } else {
                        rv4Var4.e0(1230674103);
                        rv4Var4.q(false);
                    }
                    nq7 v = uaf.v(tte.k(pna.u(kq7Var3, nae.e, d2, 1), v72Var), da7Var.c, v72Var, rv4Var4);
                    long g = rm1.g(r0f.y(rv4Var4), 0.2f);
                    ba5 ba5Var = lre.g;
                    nq7 z8 = zbe.z(nmd.v(v, g, ba5Var), 8.0f, 4.0f);
                    xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var4, 0);
                    int hashCode3 = Long.hashCode(rv4Var4.T);
                    xt8 l3 = rv4Var4.l();
                    nq7 p3 = lye.p(rv4Var4, z8);
                    rv4Var4.i0();
                    if (rv4Var4.S) {
                        rv4Var4.k(zx1Var2);
                    } else {
                        rv4Var4.r0();
                    }
                    jce.F(npVar, rv4Var4, a3);
                    jce.F(npVar2, rv4Var4, l3);
                    s21.t(hashCode3, rv4Var4, npVar3, rv4Var4, kgVar);
                    jce.F(npVar4, rv4Var4, p3);
                    fa7 fa7Var2 = da7Var.d;
                    if (fa7Var2 != null) {
                        kq7Var = kq7Var3;
                        s21.w(rv4Var4, -1238518158, kq7Var, 4.0f, rv4Var4);
                        uaf.j(fa7Var2, a82.g(rv4Var4, 2.0f, tte.k(kq7Var, r0f.z(rv4Var4).b), ba5Var), xt4Var2, xt4Var3, rv4Var4, 0);
                        hl5.w(kq7Var, 12.0f, rv4Var4, false);
                    } else {
                        kq7Var = kq7Var3;
                        rv4Var4.e0(-1237950207);
                        rv4Var4.q(false);
                    }
                    uaf.m(da7Var.b, r0f.A(rv4Var4).j, zbe.A(kq7Var, nae.e, 4.0f, 1), xt4Var3, rv4Var4, 384);
                    if (db7Var != db7.d && db7Var != db7.c) {
                        rv4Var4.e0(-1237263743);
                        rv4Var4.q(false);
                    } else {
                        rv4Var4.e0(-1237528700);
                        tc4.l(da7Var.f, null, false, zl1.b(0.6f, r0f.y(rv4Var4).q), 0L, 0L, 0L, 0, false, 0, 0, null, r0f.A(rv4Var4).l, rv4Var4, 0, 0, 131062);
                        rv4Var4.q(false);
                    }
                    rv4Var4.q(true);
                    rv4Var4.q(true);
                } else {
                    rv4Var4.X();
                }
                return pvcVar2;
            case 2:
                ba5 ba5Var2 = lre.g;
                v72 v72Var2 = (v72) obj8;
                db7 db7Var2 = (db7) obj7;
                ba7 ba7Var = (ba7) obj4;
                xt4 xt4Var4 = (xt4) obj6;
                xt4 xt4Var5 = (xt4) obj5;
                su0 su0Var2 = (su0) obj;
                rv4 rv4Var5 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                su0Var2.getClass();
                if ((intValue3 & 6) == 0) {
                    if (rv4Var5.f(su0Var2)) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    intValue3 |= i2;
                }
                if ((intValue3 & 19) != 18) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var5.U(intValue3 & 1, z4)) {
                    float d3 = su0Var2.d() * 0.8f;
                    nk0 nk0Var2 = kh5.c;
                    kq7 kq7Var4 = kq7.a;
                    nq7 a4 = pu0Var.a(kq7Var4, nk0Var2);
                    gv9 a5 = ev9.a(lz.a, kh5.F, rv4Var5, 0);
                    int hashCode4 = Long.hashCode(rv4Var5.T);
                    xt8 l4 = rv4Var5.l();
                    nq7 p4 = lye.p(rv4Var5, a4);
                    rw1.k.getClass();
                    zx1 zx1Var3 = qw1.b;
                    rv4Var5.i0();
                    if (rv4Var5.S) {
                        rv4Var5.k(zx1Var3);
                    } else {
                        rv4Var5.r0();
                    }
                    np npVar5 = qw1.f;
                    jce.F(npVar5, rv4Var5, a5);
                    np npVar6 = qw1.e;
                    jce.F(npVar6, rv4Var5, l4);
                    Integer valueOf2 = Integer.valueOf(hashCode4);
                    np npVar7 = qw1.g;
                    jce.F(npVar7, rv4Var5, valueOf2);
                    kg kgVar2 = qw1.h;
                    jce.C(kgVar2, rv4Var5);
                    np npVar8 = qw1.d;
                    jce.F(npVar8, rv4Var5, p4);
                    if (z6) {
                        rv4Var5.e0(-440737576);
                        pvcVar = pvcVar2;
                        ts6.a(1.5f, 48, 1, 0L, rv4Var5, pna.n(kq7Var4, 18.0f).a0(new k5d(kh5.H)));
                        rv4Var = rv4Var5;
                        rv4Var.q(false);
                    } else {
                        pvcVar = pvcVar2;
                        rv4Var = rv4Var5;
                        rv4Var.e0(-439964405);
                        rv4Var.q(false);
                    }
                    nq7 u = pna.u(kq7Var4, nae.e, d3 * 0.8f, 1);
                    b37 d4 = fu0.d(kh5.a, false);
                    int hashCode5 = Long.hashCode(rv4Var.T);
                    xt8 l5 = rv4Var.l();
                    nq7 p5 = lye.p(rv4Var, u);
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var3);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(npVar5, rv4Var, d4);
                    jce.F(npVar6, rv4Var, l5);
                    s21.t(hashCode5, rv4Var, npVar7, rv4Var, kgVar2);
                    jce.F(npVar8, rv4Var, p5);
                    nq7 k = tte.k(kq7Var4, v72Var2);
                    xn1 a6 = wn1.a(lz.c, kh5.I, rv4Var, 0);
                    int hashCode6 = Long.hashCode(rv4Var.T);
                    xt8 l6 = rv4Var.l();
                    nq7 p6 = lye.p(rv4Var, k);
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var3);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(npVar5, rv4Var, a6);
                    jce.F(npVar6, rv4Var, l6);
                    s21.t(hashCode6, rv4Var, npVar7, rv4Var, kgVar2);
                    jce.F(npVar8, rv4Var, p6);
                    fa7 fa7Var3 = ba7Var.f;
                    if (fa7Var3 != null && !(fa7Var3 instanceof ca7)) {
                        fa7Var = fa7Var3;
                        f = 4.0f;
                    } else {
                        f = 4.0f;
                        fa7Var = null;
                    }
                    if (fa7Var != null) {
                        s21.w(rv4Var, -1361603660, kq7Var4, f, rv4Var);
                        tza tzaVar = j27.a;
                        uaf.j(fa7Var, nmd.v(tte.k(kq7Var4, ((h27) rv4Var.j(tzaVar)).c.b), rm1.g(((h27) rv4Var.j(tzaVar)).a, 2.0f), ba5Var2), xt4Var4, xt4Var5, rv4Var, 0);
                        xt4Var = xt4Var4;
                        hl5.w(kq7Var4, 12.0f, rv4Var, false);
                    } else {
                        xt4Var = xt4Var4;
                        rv4Var.e0(-1360993425);
                        rv4Var.q(false);
                    }
                    String str = ba7Var.b;
                    int i4 = ba7Var.c;
                    int i5 = ba7Var.d;
                    nq7 k2 = tte.k(zbe.C(kq7Var4, 12.0f, nae.e, nae.e, 3.0f, 6), v72Var2);
                    boolean f6 = rv4Var.f(xt4Var) | rv4Var.f(ba7Var);
                    Object P6 = rv4Var.P();
                    if (f6 || P6 == lh9Var) {
                        P6 = new oa7(xt4Var, ba7Var, 3);
                        rv4Var.o0(P6);
                    }
                    uaf.b(i4, i5, 0, rv4Var, lbe.f(15, (vt4) P6, k2, null, false), str);
                    rv4Var.q(true);
                    if (db7Var2 != db7.d && db7Var2 != db7.c) {
                        rv4Var.e0(1047507429);
                        rv4Var.q(false);
                    } else {
                        rv4Var.e0(1046946484);
                        tc4.l(ba7Var.h, zbe.z(nmd.v(tte.k(zbe.C(pu0Var.a(kq7Var4, kh5.E), 10.0f, nae.e, nae.e, 6.0f, 6), uu9.a), zl1.b(0.5f, zl1.b), ba5Var2), 6.0f, 2.0f), false, zl1.e, 0L, 0L, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(j27.a)).b.l, rv4Var, 3072, 0, 131060);
                        rv4Var.q(false);
                    }
                    rv4Var.q(true);
                    rv4Var.q(true);
                    return pvcVar;
                }
                rv4Var5.X();
                return pvcVar2;
            default:
                vt4 vt4Var4 = (vt4) obj8;
                vt4 vt4Var5 = (vt4) obj7;
                vt4 vt4Var6 = (vt4) obj6;
                vt4 vt4Var7 = (vt4) obj5;
                aw7 aw7Var3 = (aw7) obj4;
                rv4 rv4Var6 = (rv4) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (rv4Var6.U(intValue4 & 1, z5)) {
                    if (z6) {
                        rv4Var6.e0(1984687624);
                        String A = yqe.A((y3b) o2b.a0.getValue(), rv4Var6);
                        tu1 tu1Var = nmd.a;
                        boolean f7 = rv4Var6.f(vt4Var4);
                        Object P7 = rv4Var6.P();
                        if (f7 || P7 == lh9Var) {
                            P7 = new kf3(vt4Var4, aw7Var3, 8);
                            rv4Var6.o0(P7);
                        }
                        iue.g(A, null, tu1Var, null, null, (vt4) P7, rv4Var6, 384, 26);
                        rv4Var2 = rv4Var6;
                        rv4Var2.q(false);
                    } else {
                        rv4Var2 = rv4Var6;
                        rv4Var2.e0(1985229628);
                        rv4Var2.q(false);
                    }
                    String A2 = yqe.A((y3b) o3b.s0.getValue(), rv4Var2);
                    tu1 tu1Var2 = nmd.b;
                    boolean f8 = rv4Var2.f(vt4Var5);
                    Object P8 = rv4Var2.P();
                    if (f8 || P8 == lh9Var) {
                        P8 = new kf3(vt4Var5, aw7Var3, 9);
                        rv4Var2.o0(P8);
                    }
                    iue.g(A2, null, tu1Var2, null, null, (vt4) P8, rv4Var2, 384, 26);
                    String A3 = yqe.A((y3b) o3b.r0.getValue(), rv4Var2);
                    tu1 tu1Var3 = nmd.c;
                    boolean f9 = rv4Var2.f(vt4Var6);
                    Object P9 = rv4Var2.P();
                    if (f9 || P9 == lh9Var) {
                        P9 = new kf3(vt4Var6, aw7Var3, 10);
                        rv4Var2.o0(P9);
                    }
                    iue.g(A3, null, tu1Var3, null, null, (vt4) P9, rv4Var2, 384, 26);
                    long j = ((h27) rv4Var2.j(j27.a)).a.w;
                    tu1 E = jce.E(130305550, new ke9(j, 0), rv4Var2);
                    tu1 E2 = jce.E(18397328, new ke9(j, 1), rv4Var2);
                    boolean f10 = rv4Var2.f(vt4Var7);
                    Object P10 = rv4Var2.P();
                    if (f10 || P10 == lh9Var) {
                        P10 = new kf3(vt4Var7, aw7Var3, 11);
                        rv4Var2.o0(P10);
                    }
                    iue.f(E, E2, null, (vt4) P10, rv4Var2, 390, 26);
                } else {
                    rv4Var6.X();
                }
                return pvcVar2;
        }
    }

    public /* synthetic */ r33(boolean z, v72 v72Var, Object obj, Object obj2, xt4 xt4Var, Object obj3, int i) {
        this.a = i;
        this.b = z;
        this.c = v72Var;
        this.d = obj;
        this.e = obj2;
        this.f = xt4Var;
        this.C = obj3;
    }

    public /* synthetic */ r33(boolean z, aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3, aw7 aw7Var4, cz7 cz7Var) {
        this.a = 0;
        this.b = z;
        this.c = aw7Var;
        this.e = aw7Var2;
        this.d = aw7Var3;
        this.f = aw7Var4;
        this.C = cz7Var;
    }
}
