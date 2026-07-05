package defpackage;

import java.util.Map;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jb2  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jb2 implements nu4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ yya b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jb2(lb2 lb2Var, aw7 aw7Var, kd4 kd4Var, aw7 aw7Var2, aw7 aw7Var3) {
        this.c = lb2Var;
        this.b = aw7Var;
        this.d = kd4Var;
        this.e = aw7Var2;
        this.f = aw7Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v23, types: [rv4] */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        np npVar;
        np npVar2;
        kg kgVar;
        zx1 zx1Var;
        ze4 ze4Var;
        np npVar3;
        np npVar4;
        aw7 aw7Var;
        aw7 aw7Var2;
        rv4 rv4Var;
        yya yyaVar;
        ze4 ze4Var2;
        boolean z2;
        np npVar5;
        np npVar6;
        rv4 rv4Var2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        rv4 rv4Var3;
        int i;
        int i2 = this.a;
        yya yyaVar2 = this.b;
        pvc pvcVar = pvc.a;
        Object obj5 = ax1.a;
        int i3 = 32;
        Object obj6 = this.f;
        Object obj7 = this.d;
        Object obj8 = this.c;
        Object obj9 = this.e;
        boolean z8 = false;
        switch (i2) {
            case 0:
                lb2 lb2Var = (lb2) obj8;
                kd4 kd4Var = (kd4) obj7;
                aw7 aw7Var3 = (aw7) obj9;
                aw7 aw7Var4 = (aw7) obj6;
                rh8 rh8Var = (rh8) obj2;
                rv4 rv4Var4 = (rv4) obj3;
                int intValue = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var.getClass();
                if ((intValue & 48) == 0) {
                    if (!rv4Var4.f(rh8Var)) {
                        i3 = 16;
                    }
                    intValue |= i3;
                }
                if ((intValue & Token.TARGET) != 144) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var4.U(intValue & 1, z)) {
                    ze4 ze4Var3 = pna.c;
                    nk0 nk0Var = kh5.a;
                    b37 d = fu0.d(nk0Var, false);
                    int hashCode = Long.hashCode(rv4Var4.T);
                    xt8 l = rv4Var4.l();
                    nq7 p = lye.p(rv4Var4, ze4Var3);
                    rw1.k.getClass();
                    zx1 zx1Var2 = qw1.b;
                    rv4Var4.i0();
                    if (rv4Var4.S) {
                        rv4Var4.k(zx1Var2);
                    } else {
                        rv4Var4.r0();
                    }
                    np npVar7 = qw1.f;
                    jce.F(npVar7, rv4Var4, d);
                    np npVar8 = qw1.e;
                    jce.F(npVar8, rv4Var4, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    np npVar9 = qw1.g;
                    jce.F(npVar9, rv4Var4, valueOf);
                    kg kgVar2 = qw1.h;
                    jce.C(kgVar2, rv4Var4);
                    np npVar10 = qw1.d;
                    jce.F(npVar10, rv4Var4, p);
                    yya yyaVar3 = this.b;
                    if (((kb2) yyaVar3.getValue()).b && ((kb2) yyaVar3.getValue()).i.isEmpty() && !((kb2) yyaVar3.getValue()).a) {
                        rv4Var4.e0(-1691523189);
                        ar5 c = rp5.c((wk3) ok3.a.getValue(), rv4Var4, 0);
                        String A = yqe.A((y3b) s2b.a.getValue(), rv4Var4);
                        String A2 = yqe.A((y3b) s2b.b.getValue(), rv4Var4);
                        String A3 = yqe.A((y3b) b3b.B.getValue(), rv4Var4);
                        nq7 y = zbe.y(ze4Var3, 12.0f);
                        boolean f = rv4Var4.f(lb2Var);
                        Object P = rv4Var4.P();
                        if (!f && P != obj5) {
                            zx1Var = zx1Var2;
                            npVar = npVar9;
                            npVar6 = npVar8;
                            npVar2 = npVar10;
                            kgVar = kgVar2;
                            npVar5 = npVar7;
                            rv4Var2 = rv4Var4;
                        } else {
                            npVar5 = npVar7;
                            npVar = npVar9;
                            kgVar = kgVar2;
                            npVar2 = npVar10;
                            zx1Var = zx1Var2;
                            npVar6 = npVar8;
                            rv4Var2 = rv4Var4;
                            v7 v7Var = new v7(0, lb2Var, lb2.class, "reload", "reload()V", 0, 15);
                            rv4Var2.o0(v7Var);
                            P = v7Var;
                        }
                        rv4 rv4Var5 = rv4Var2;
                        jxe.d(c, A, A2, y, A3, (vt4) ((i76) P), rv4Var5, 3072, 0);
                        rv4Var5.q(false);
                        yyaVar = yyaVar3;
                        ze4Var2 = ze4Var3;
                        npVar3 = npVar5;
                        npVar4 = npVar6;
                        rv4Var = rv4Var5;
                    } else {
                        npVar = npVar9;
                        npVar2 = npVar10;
                        kgVar = kgVar2;
                        zx1Var = zx1Var2;
                        rv4Var4.e0(-1690839794);
                        kj6 a = mj6.a(0, rv4Var4, 0, 3);
                        bkd r = mwe.r(mwe.r(rh8Var, mwe.g(14, rv4Var4)), zbe.j(nae.e, nae.e, nae.e, 8.0f, 7));
                        boolean f2 = rv4Var4.f(lb2Var);
                        Object P2 = rv4Var4.P();
                        if (!f2 && P2 != obj5) {
                            ze4Var = ze4Var3;
                            npVar3 = npVar7;
                            npVar4 = npVar8;
                            aw7Var = aw7Var3;
                            aw7Var2 = aw7Var4;
                            rv4Var = rv4Var4;
                        } else {
                            ze4Var = ze4Var3;
                            npVar3 = npVar7;
                            npVar4 = npVar8;
                            aw7Var = aw7Var3;
                            aw7Var2 = aw7Var4;
                            rv4Var = rv4Var4;
                            v7 v7Var2 = new v7(0, lb2Var, lb2.class, "loadMore", "loadMore()V", 0, 16);
                            rv4Var.o0(v7Var2);
                            P2 = v7Var2;
                        }
                        ej6.c(a, 0, (vt4) ((i76) P2), rv4Var, 0, 2);
                        bkd r2 = mwe.r(r, zbe.h(2, 16.0f));
                        hz hzVar = new hz(4.0f, true, new vs(2));
                        boolean f3 = rv4Var.f(yyaVar3) | rv4Var.f(lb2Var) | rv4Var.f(kd4Var) | rv4Var.f(aw7Var);
                        Object P3 = rv4Var.P();
                        if (!f3 && P3 != obj5) {
                            yyaVar = yyaVar3;
                        } else {
                            yyaVar = yyaVar3;
                            p6 p6Var = new p6((Object) lb2Var, (Object) kd4Var, (Object) yyaVar, aw7Var2, aw7Var, 6);
                            rv4Var.o0(p6Var);
                            P3 = p6Var;
                        }
                        jce.d(ze4Var, a, r2, false, hzVar, null, null, false, null, (xt4) P3, rv4Var, 24582, 488);
                        ze4Var2 = ze4Var;
                        rv4Var.q(false);
                    }
                    if (((kb2) yyaVar.getValue()).c) {
                        rv4Var.e0(-1685099183);
                        nq7 v = nmd.v(ze4Var2, zl1.b(0.18f, ((h27) rv4Var.j(j27.a)).a.C), lre.g);
                        b37 d2 = fu0.d(nk0Var, false);
                        int hashCode2 = Long.hashCode(rv4Var.T);
                        xt8 l2 = rv4Var.l();
                        nq7 p2 = lye.p(rv4Var, v);
                        rv4Var.i0();
                        if (rv4Var.S) {
                            rv4Var.k(zx1Var);
                        } else {
                            rv4Var.r0();
                        }
                        jce.F(npVar3, rv4Var, d2);
                        jce.F(npVar4, rv4Var, l2);
                        s21.t(hashCode2, rv4Var, npVar, rv4Var, kgVar);
                        jce.F(npVar2, rv4Var, p2);
                        r79.a(pu0.a.a(kq7.a, kh5.e), 0L, nae.e, 0L, 0, nae.e, rv4Var, 0, 62);
                        z2 = true;
                        rv4Var.q(true);
                        rv4Var.q(false);
                    } else {
                        z2 = true;
                        rv4Var.e0(-1684802234);
                        rv4Var.q(false);
                    }
                    rv4Var.q(z2);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            case 1:
                cz7 cz7Var = (cz7) obj8;
                e13 e13Var = (e13) obj7;
                i44 i44Var = (i44) obj9;
                fo3 fo3Var = (fo3) obj6;
                rh8 rh8Var2 = (rh8) obj2;
                rv4 rv4Var6 = (rv4) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var2.getClass();
                if ((intValue2 & 48) == 0) {
                    if (!rv4Var6.f(rh8Var2)) {
                        i3 = 16;
                    }
                    intValue2 |= i3;
                }
                if ((intValue2 & Token.TARGET) != 144) {
                    z8 = true;
                }
                if (rv4Var6.U(intValue2 & 1, z8)) {
                    ze4 ze4Var4 = pna.c;
                    bkd r3 = mwe.r(rh8Var2, new th8(16.0f, 16.0f, 16.0f, 16.0f));
                    hz hzVar2 = new hz(12.0f, true, new vs(2));
                    yya yyaVar4 = this.b;
                    boolean f4 = rv4Var6.f(yyaVar4) | rv4Var6.f(cz7Var) | rv4Var6.f(e13Var) | rv4Var6.f(i44Var) | rv4Var6.f(fo3Var);
                    Object P4 = rv4Var6.P();
                    if (f4 || P4 == obj5) {
                        p6 p6Var2 = new p6(yyaVar4, cz7Var, e13Var, i44Var, fo3Var, 9);
                        rv4Var6.o0(p6Var2);
                        P4 = p6Var2;
                    }
                    kqe.a(ze4Var4, null, r3, hzVar2, null, null, false, (xt4) P4, rv4Var6, 24582, 234);
                } else {
                    rv4Var6.X();
                }
                return pvcVar;
            case 2:
                cz7 cz7Var2 = (cz7) obj8;
                String str = (String) obj7;
                v84 v84Var = (v84) obj6;
                aw7 aw7Var5 = (aw7) obj9;
                rh8 rh8Var3 = (rh8) obj2;
                ?? r4 = (rv4) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var3.getClass();
                if ((intValue3 & 48) == 0) {
                    if (!r4.f(rh8Var3)) {
                        i3 = 16;
                    }
                    intValue3 |= i3;
                }
                if ((intValue3 & Token.TARGET) != 144) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (r4.U(intValue3 & 1, z3)) {
                    if (((l84) yyaVar2.getValue()).a && ((l84) yyaVar2.getValue()).h.isEmpty()) {
                        r4.e0(-2061132643);
                        r4.q(false);
                    } else if (!((l84) yyaVar2.getValue()).a && ((l84) yyaVar2.getValue()).h.isEmpty()) {
                        r4.e0(-2060996553);
                        ar5 G = owe.G(r4);
                        String A4 = yqe.A((y3b) o2b.u0.getValue(), r4);
                        String A5 = yqe.A((y3b) o2b.x0.getValue(), r4);
                        String A6 = yqe.A((y3b) v1b.o.getValue(), r4);
                        nq7 A7 = zbe.A(pna.c, 12.0f, nae.e, 2);
                        boolean f5 = r4.f(cz7Var2);
                        Object P5 = r4.P();
                        if (f5 || P5 == obj5) {
                            P5 = new oc3(cz7Var2, 13);
                            r4.o0(P5);
                        }
                        jxe.d(G, A4, A5, A7, A6, (vt4) P5, r4, 3072, 0);
                        r4.q(false);
                    } else {
                        r4.e0(-2060367532);
                        e13 y2 = k27.y(r4);
                        l84 l84Var = (l84) yyaVar2.getValue();
                        nq7 l3 = q1d.l(pna.c, r4, 6);
                        boolean f6 = r4.f(v84Var);
                        Object P6 = r4.P();
                        if (f6 || P6 == obj5) {
                            P6 = new t74(v84Var, 2);
                            r4.o0(P6);
                        }
                        xt4 xt4Var = (xt4) P6;
                        boolean f7 = r4.f(v84Var);
                        Object P7 = r4.P();
                        if (f7 || P7 == obj5) {
                            P7 = new t42(v84Var, 17);
                            r4.o0(P7);
                        }
                        vt4 vt4Var = (vt4) P7;
                        boolean f8 = r4.f(v84Var);
                        Object P8 = r4.P();
                        if (f8 || P8 == obj5) {
                            P8 = new t74(v84Var, 3);
                            r4.o0(P8);
                        }
                        xt4 xt4Var2 = (xt4) P8;
                        boolean f9 = r4.f(y2);
                        Object P9 = r4.P();
                        if (f9 || P9 == obj5) {
                            P9 = new u74(y2, 0);
                            r4.o0(P9);
                        }
                        xt4 xt4Var3 = (xt4) P9;
                        boolean f10 = r4.f(cz7Var2);
                        Object P10 = r4.P();
                        if (f10 || P10 == obj5) {
                            P10 = new ar0(cz7Var2, 6);
                            r4.o0(P10);
                        }
                        sue.b(str, l84Var, rh8Var3, l3, xt4Var, vt4Var, xt4Var2, xt4Var3, (xt4) P10, r4, (intValue3 << 3) & 896);
                        boolean booleanValue = ((Boolean) aw7Var5.getValue()).booleanValue();
                        l84 l84Var2 = (l84) yyaVar2.getValue();
                        boolean f11 = r4.f(aw7Var5);
                        Object P11 = r4.P();
                        if (f11 || P11 == obj5) {
                            P11 = new zn3(aw7Var5, 21);
                            r4.o0(P11);
                        }
                        xt4 xt4Var4 = (xt4) P11;
                        boolean f12 = r4.f(v84Var);
                        Object P12 = r4.P();
                        if (f12 || P12 == obj5) {
                            P12 = new t74(v84Var, 4);
                            r4.o0(P12);
                        }
                        xt4 xt4Var5 = (xt4) P12;
                        boolean f13 = r4.f(v84Var);
                        Object P13 = r4.P();
                        if (f13 || P13 == obj5) {
                            P13 = new t74(v84Var, 5);
                            r4.o0(P13);
                        }
                        xt4 xt4Var6 = (xt4) P13;
                        boolean f14 = r4.f(v84Var);
                        Object P14 = r4.P();
                        if (f14 || P14 == obj5) {
                            P14 = new t74(v84Var, 6);
                            r4.o0(P14);
                        }
                        xt4 xt4Var7 = (xt4) P14;
                        boolean f15 = r4.f(v84Var);
                        Object P15 = r4.P();
                        if (f15 || P15 == obj5) {
                            P15 = new t74(v84Var, 0);
                            r4.o0(P15);
                        }
                        w9e.d(booleanValue, l84Var2, xt4Var4, xt4Var5, xt4Var6, xt4Var7, (xt4) P15, r4, 0);
                        boolean f16 = r4.f(v84Var);
                        Object P16 = r4.P();
                        if (f16 || P16 == obj5) {
                            P16 = new t74(v84Var, 1);
                            r4.o0(P16);
                        }
                        k27.e(y2, (xt4) P16, r4, 0);
                        r4.q(false);
                    }
                } else {
                    r4.X();
                }
                return pvcVar;
            case 3:
                String str2 = (String) obj8;
                String str3 = (String) obj7;
                cz7 cz7Var3 = (cz7) obj9;
                br6 br6Var = (br6) obj6;
                rh8 rh8Var4 = (rh8) obj2;
                rv4 rv4Var7 = (rv4) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var4.getClass();
                if ((intValue4 & 48) == 0) {
                    if (!rv4Var7.f(rh8Var4)) {
                        i3 = 16;
                    }
                    intValue4 |= i3;
                }
                if ((intValue4 & Token.TARGET) != 144) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var7.U(intValue4 & 1, z4)) {
                    Object[] objArr = {eub.o(str2, "-", str3)};
                    yy9 yy9Var = qg6.w;
                    Object P17 = rv4Var7.P();
                    if (P17 == obj5) {
                        P17 = new v16(24);
                        rv4Var7.o0(P17);
                    }
                    qg6 qg6Var = (qg6) zpe.m(objArr, yy9Var, (vt4) P17, rv4Var7, 384);
                    bkd r5 = mwe.r(rh8Var4, mwe.f(14, rv4Var7, false));
                    xq6 xq6Var = (xq6) yyaVar2.getValue();
                    ze4 ze4Var5 = pna.c;
                    bkd r6 = mwe.r(r5, new th8(12.0f, 12.0f, 12.0f, 12.0f));
                    rh8 h = mwe.h(r5, 12.0f, 12.0f, 4.0f, 12.0f, rv4Var7, 28080, 0);
                    boolean f17 = rv4Var7.f(cz7Var3) | rv4Var7.f(str2);
                    Object P18 = rv4Var7.P();
                    if (f17 || P18 == obj5) {
                        P18 = new e83(cz7Var3, str2, 4);
                        rv4Var7.o0(P18);
                    }
                    xt4 xt4Var8 = (xt4) P18;
                    boolean f18 = rv4Var7.f(cz7Var3) | rv4Var7.f(yyaVar2);
                    Object P19 = rv4Var7.P();
                    if (f18 || P19 == obj5) {
                        P19 = new cx(cz7Var3, yyaVar2, 2);
                        rv4Var7.o0(P19);
                    }
                    vt4 vt4Var2 = (vt4) P19;
                    boolean f19 = rv4Var7.f(br6Var);
                    Object P20 = rv4Var7.P();
                    if (f19 || P20 == obj5) {
                        P20 = new j93(br6Var, 2);
                        rv4Var7.o0(P20);
                    }
                    vt4 vt4Var3 = (vt4) P20;
                    boolean f20 = rv4Var7.f(br6Var);
                    Object P21 = rv4Var7.P();
                    if (f20 || P21 == obj5) {
                        P21 = new j93(br6Var, 3);
                        rv4Var7.o0(P21);
                    }
                    jue.t(xq6Var, qg6Var, ze4Var5, r6, h, xt4Var8, vt4Var2, vt4Var3, (vt4) P21, rv4Var7, 384);
                } else {
                    rv4Var7.X();
                }
                return pvcVar;
            case 4:
                zm4 zm4Var = (zm4) obj8;
                aw7 aw7Var6 = (aw7) obj9;
                kda kdaVar = (kda) obj7;
                cz7 cz7Var4 = (cz7) obj6;
                rh8 rh8Var5 = (rh8) obj2;
                rv4 rv4Var8 = (rv4) obj3;
                int intValue5 = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var5.getClass();
                if ((intValue5 & 48) == 0) {
                    if (!rv4Var8.f(rh8Var5)) {
                        i3 = 16;
                    }
                    intValue5 |= i3;
                }
                if ((intValue5 & Token.TARGET) != 144) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (rv4Var8.U(intValue5 & 1, z5)) {
                    ze4 ze4Var6 = pna.c;
                    nq7 x = zbe.x(ze4Var6, rh8Var5);
                    xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var8, 0);
                    int hashCode3 = Long.hashCode(rv4Var8.T);
                    xt8 l4 = rv4Var8.l();
                    nq7 p3 = lye.p(rv4Var8, x);
                    rw1.k.getClass();
                    zx1 zx1Var3 = qw1.b;
                    rv4Var8.i0();
                    if (rv4Var8.S) {
                        rv4Var8.k(zx1Var3);
                    } else {
                        rv4Var8.r0();
                    }
                    jce.F(qw1.f, rv4Var8, a2);
                    jce.F(qw1.e, rv4Var8, l4);
                    jce.F(qw1.g, rv4Var8, Integer.valueOf(hashCode3));
                    jce.C(qw1.h, rv4Var8);
                    jce.F(qw1.d, rv4Var8, p3);
                    jub jubVar = (jub) aw7Var6.getValue();
                    String A8 = yqe.A((y3b) b3b.P.getValue(), rv4Var8);
                    long g = rm1.g(((h27) rv4Var8.j(j27.a)).a, 6.0f);
                    nq7 z9 = zbe.z(pna.f(kq7.a, 1.0f), 16.0f, 8.0f);
                    boolean f21 = rv4Var8.f(aw7Var6) | rv4Var8.f(kdaVar);
                    Object P22 = rv4Var8.P();
                    if (f21 || P22 == obj5) {
                        P22 = new cn9(12, kdaVar, aw7Var6);
                        rv4Var8.o0(P22);
                    }
                    xxe.m(jubVar, A8, 0L, g, null, zm4Var, z9, null, (xt4) P22, null, rv4Var8, 1769472, 660);
                    if (k4b.j0(((c4a) yyaVar2.getValue()).a)) {
                        rv4Var8.e0(1171373201);
                        gue.f(ze4Var6, rv4Var8, 6);
                        rv4Var8.q(false);
                    } else if (((c4a) yyaVar2.getValue()).b.isEmpty()) {
                        rv4Var8.e0(1171376335);
                        gue.e(ze4Var6, rv4Var8, 6);
                        rv4Var8.q(false);
                    } else {
                        rv4Var8.e0(1171378948);
                        Map map = ((c4a) yyaVar2.getValue()).b;
                        String str4 = ((c4a) yyaVar2.getValue()).a;
                        boolean f22 = rv4Var8.f(cz7Var4);
                        Object P23 = rv4Var8.P();
                        if (f22 || P23 == obj5) {
                            P23 = new ar0(cz7Var4, 13);
                            rv4Var8.o0(P23);
                        }
                        gue.h(map, str4, (xt4) P23, rv4Var8, 0);
                        rv4Var8.q(false);
                    }
                    rv4Var8.q(true);
                } else {
                    rv4Var8.X();
                }
                return pvcVar;
            default:
                aw7 aw7Var7 = (aw7) obj9;
                lia liaVar = (lia) obj8;
                cz7 cz7Var5 = (cz7) obj7;
                String str5 = (String) obj6;
                rh8 rh8Var6 = (rh8) obj2;
                rv4 rv4Var9 = (rv4) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var6.getClass();
                if ((intValue6 & 48) == 0) {
                    if (rv4Var9.f(rh8Var6)) {
                        i = 32;
                    } else {
                        i = 16;
                    }
                    intValue6 |= i;
                }
                int i4 = intValue6;
                if ((i4 & Token.TARGET) != 144) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (rv4Var9.U(i4 & 1, z6)) {
                    th8 f23 = mwe.f(14, rv4Var9, false);
                    if ((i4 & Token.ASSIGN_MOD) == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean f24 = z7 | rv4Var9.f(f23);
                    Object P24 = rv4Var9.P();
                    if (f24 || P24 == obj5) {
                        P24 = mwe.r(mwe.r(mwe.r(rh8Var6, f23), new th8(12.0f, 12.0f, 12.0f, 12.0f)), zbe.j(nae.e, nae.e, nae.e, 64.0f, 7));
                        rv4Var9.o0(P24);
                    }
                    rh8 rh8Var7 = (rh8) P24;
                    ze4 ze4Var7 = pna.c;
                    b37 d3 = fu0.d(kh5.a, false);
                    int hashCode4 = Long.hashCode(rv4Var9.T);
                    xt8 l5 = rv4Var9.l();
                    nq7 p4 = lye.p(rv4Var9, ze4Var7);
                    rw1.k.getClass();
                    zx1 zx1Var4 = qw1.b;
                    rv4Var9.i0();
                    if (rv4Var9.S) {
                        rv4Var9.k(zx1Var4);
                    } else {
                        rv4Var9.r0();
                    }
                    jce.F(qw1.f, rv4Var9, d3);
                    jce.F(qw1.e, rv4Var9, l5);
                    jce.F(qw1.g, rv4Var9, Integer.valueOf(hashCode4));
                    jce.C(qw1.h, rv4Var9);
                    jce.F(qw1.d, rv4Var9, p4);
                    if (((uja) yyaVar2.getValue()).a) {
                        rv4Var9.e0(599540581);
                        rv4Var9.q(false);
                    } else if (((uja) yyaVar2.getValue()).b.isEmpty()) {
                        rv4Var9.e0(599614330);
                        nq7 x2 = zbe.x(ze4Var7, rh8Var7);
                        boolean f25 = rv4Var9.f(aw7Var7);
                        Object P25 = rv4Var9.P();
                        if (f25 || P25 == obj5) {
                            P25 = new iia(aw7Var7, 1);
                            rv4Var9.o0(P25);
                        }
                        nq2.b(0, (vt4) P25, rv4Var9, x2);
                        rv4Var9.q(false);
                    } else {
                        rv4Var9.e0(599954834);
                        Object[] objArr2 = new Object[0];
                        Object P26 = rv4Var9.P();
                        if (P26 == obj5) {
                            P26 = new oca(27);
                            rv4Var9.o0(P26);
                        }
                        aw7 aw7Var8 = (aw7) zpe.k(objArr2, (vt4) P26, rv4Var9, 48);
                        Object[] objArr3 = new Object[0];
                        Object P27 = rv4Var9.P();
                        if (P27 == obj5) {
                            P27 = new oca(28);
                            rv4Var9.o0(P27);
                        }
                        aw7 aw7Var9 = (aw7) zpe.k(objArr3, (vt4) P27, rv4Var9, 48);
                        uja ujaVar = (uja) yyaVar2.getValue();
                        bkd q = mwe.q(rh8Var7, zbe.j(nae.e, nae.e, 8.0f, nae.e, 11));
                        boolean f26 = rv4Var9.f(liaVar);
                        Object P28 = rv4Var9.P();
                        if (f26 || P28 == obj5) {
                            P28 = new yw7(0, liaVar, lia.class, "loadMore", "loadMore()V", 0, 26);
                            rv4Var9.o0(P28);
                        }
                        i76 i76Var = (i76) P28;
                        boolean f27 = rv4Var9.f(cz7Var5);
                        Object P29 = rv4Var9.P();
                        if (f27 || P29 == obj5) {
                            P29 = new ar0(cz7Var5, 17);
                            rv4Var9.o0(P29);
                        }
                        xt4 xt4Var9 = P29;
                        boolean f28 = rv4Var9.f(aw7Var9) | rv4Var9.f(aw7Var8);
                        Object P30 = rv4Var9.P();
                        if (f28 || P30 == obj5) {
                            P30 = new pr0(aw7Var9, aw7Var8, 23);
                            rv4Var9.o0(P30);
                        }
                        tl1.h(ujaVar, rh8Var7, q, ze4Var7, xt4Var9, (xt4) P30, (vt4) i76Var, rv4Var9, 3072);
                        rv4Var3 = rv4Var9;
                        String str6 = (String) aw7Var9.getValue();
                        boolean booleanValue2 = ((Boolean) aw7Var8.getValue()).booleanValue();
                        boolean f29 = rv4Var3.f(aw7Var8);
                        Object P31 = rv4Var3.P();
                        if (f29 || P31 == obj5) {
                            P31 = new qo7(aw7Var8, 28);
                            rv4Var3.o0(P31);
                        }
                        xt4 xt4Var10 = (xt4) P31;
                        boolean f30 = rv4Var3.f(aw7Var8) | rv4Var3.f(cz7Var5);
                        Object P32 = rv4Var3.P();
                        if (f30 || P32 == obj5) {
                            P32 = new if3(cz7Var5, aw7Var8, 3);
                            rv4Var3.o0(P32);
                        }
                        lu4 lu4Var = (lu4) P32;
                        boolean f31 = rv4Var3.f(aw7Var8) | rv4Var3.f(cz7Var5);
                        Object P33 = rv4Var3.P();
                        if (f31 || P33 == obj5) {
                            P33 = new w73(cz7Var5, aw7Var8, 17);
                            rv4Var3.o0(P33);
                        }
                        xt4 xt4Var11 = (xt4) P33;
                        boolean f32 = rv4Var3.f(aw7Var8) | rv4Var3.f(cz7Var5);
                        Object P34 = rv4Var3.P();
                        if (f32 || P34 == obj5) {
                            P34 = new w73(cz7Var5, aw7Var8, 18);
                            rv4Var3.o0(P34);
                        }
                        xt4 xt4Var12 = (xt4) P34;
                        boolean f33 = rv4Var3.f(aw7Var8) | rv4Var3.f(cz7Var5);
                        Object P35 = rv4Var3.P();
                        if (f33 || P35 == obj5) {
                            P35 = new w73(cz7Var5, aw7Var8, 19);
                            rv4Var3.o0(P35);
                        }
                        xt4 xt4Var13 = (xt4) P35;
                        boolean f34 = rv4Var3.f(str5) | rv4Var3.f(aw7Var8) | rv4Var3.f(cz7Var5);
                        Object P36 = rv4Var3.P();
                        if (f34 || P36 == obj5) {
                            P36 = new r6a(2, str5, cz7Var5, aw7Var8);
                            rv4Var3.o0(P36);
                        }
                        xt4 xt4Var14 = (xt4) P36;
                        boolean f35 = rv4Var3.f(cz7Var5);
                        Object P37 = rv4Var3.P();
                        if (f35 || P37 == obj5) {
                            P37 = new ar0(cz7Var5, 16);
                            rv4Var3.o0(P37);
                        }
                        ube.e(booleanValue2, str6, xt4Var10, lu4Var, xt4Var11, xt4Var12, xt4Var13, xt4Var14, (xt4) P37, rv4Var3, 0);
                        rv4Var3.q(false);
                        rv4Var3.q(true);
                        return pvcVar;
                    }
                    rv4Var3 = rv4Var9;
                    rv4Var3.q(true);
                    return pvcVar;
                }
                rv4Var9.X();
                return pvcVar;
        }
    }

    public /* synthetic */ jb2(zm4 zm4Var, aw7 aw7Var, kda kdaVar, cz7 cz7Var, aw7 aw7Var2) {
        this.c = zm4Var;
        this.e = aw7Var;
        this.d = kdaVar;
        this.f = cz7Var;
        this.b = aw7Var2;
    }

    public /* synthetic */ jb2(aw7 aw7Var, cz7 cz7Var, e13 e13Var, i44 i44Var, fo3 fo3Var) {
        this.b = aw7Var;
        this.c = cz7Var;
        this.d = e13Var;
        this.e = i44Var;
        this.f = fo3Var;
    }

    public /* synthetic */ jb2(aw7 aw7Var, lia liaVar, cz7 cz7Var, String str, aw7 aw7Var2) {
        this.e = aw7Var;
        this.c = liaVar;
        this.d = cz7Var;
        this.f = str;
        this.b = aw7Var2;
    }

    public /* synthetic */ jb2(cz7 cz7Var, String str, v84 v84Var, aw7 aw7Var, aw7 aw7Var2) {
        this.c = cz7Var;
        this.d = str;
        this.f = v84Var;
        this.e = aw7Var;
        this.b = aw7Var2;
    }

    public /* synthetic */ jb2(String str, String str2, cz7 cz7Var, aw7 aw7Var, br6 br6Var) {
        this.c = str;
        this.d = str2;
        this.e = cz7Var;
        this.b = aw7Var;
        this.f = br6Var;
    }
}
