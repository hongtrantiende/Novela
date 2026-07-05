package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ax  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ax implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ax(tx txVar, om3 om3Var, yya yyaVar, aw7 aw7Var) {
        this.a = 0;
        this.b = txVar;
        this.c = om3Var;
        this.d = yyaVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        pb2 pb2Var;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        dl8 dl8Var;
        boolean z10;
        boolean z11;
        int i = this.a;
        ez ezVar = lz.c;
        kq7 kq7Var = kq7.a;
        Object obj3 = ax1.a;
        pvc pvcVar = pvc.a;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                tx txVar = (tx) obj6;
                om3 om3Var = (om3) obj5;
                yya yyaVar = (yya) obj4;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    ze4 ze4Var = pna.c;
                    xn1 a = wn1.a(ezVar, kh5.I, rv4Var, 0);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, ze4Var);
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
                    rv4Var.e0(-751213135);
                    rv4Var.q(false);
                    am8.b(txVar, (x6c) yyaVar.getValue(), om3Var, rv4Var, 0);
                    rv4Var.q(true);
                    rv4Var.e0(727143588);
                    rv4Var.q(false);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                o34 o34Var = (o34) obj6;
                aw7 aw7Var = (aw7) obj5;
                aw7 aw7Var2 = (aw7) obj4;
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    String str = ((n34) aw7Var2.getValue()).a;
                    List list = ((n34) aw7Var2.getValue()).b;
                    ze4 ze4Var2 = pna.c;
                    boolean f = rv4Var2.f(o34Var) | rv4Var2.f(aw7Var);
                    Object P = rv4Var2.P();
                    if (f || P == obj3) {
                        P = new j34(0, o34Var, aw7Var);
                        rv4Var2.o0(P);
                    }
                    mue.c(str, list, ze4Var2, (xt4) P, rv4Var2, 384);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                xt4 xt4Var = (xt4) obj6;
                xt4 xt4Var2 = (xt4) obj5;
                xt4 xt4Var3 = (xt4) obj4;
                rv4 rv4Var3 = (rv4) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var3.U(intValue3 & 1, z3)) {
                    ze4 ze4Var3 = pna.c;
                    nq7 l2 = q1d.l(mwe.x(ze4Var3, 13), rv4Var3, 0);
                    xn1 a2 = wn1.a(ezVar, kh5.I, rv4Var3, 0);
                    int hashCode2 = Long.hashCode(rv4Var3.T);
                    xt8 l3 = rv4Var3.l();
                    nq7 p2 = lye.p(rv4Var3, l2);
                    rw1.k.getClass();
                    vt4 vt4Var = qw1.b;
                    rv4Var3.i0();
                    if (rv4Var3.S) {
                        rv4Var3.k(vt4Var);
                    } else {
                        rv4Var3.r0();
                    }
                    np npVar = qw1.f;
                    jce.F(npVar, rv4Var3, a2);
                    np npVar2 = qw1.e;
                    jce.F(npVar2, rv4Var3, l3);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    np npVar3 = qw1.g;
                    jce.F(npVar3, rv4Var3, valueOf);
                    kg kgVar = qw1.h;
                    jce.C(kgVar, rv4Var3);
                    np npVar4 = qw1.d;
                    jce.F(npVar4, rv4Var3, p2);
                    gv9 a3 = ev9.a(lz.a, kh5.G, rv4Var3, 48);
                    int hashCode3 = Long.hashCode(rv4Var3.T);
                    xt8 l4 = rv4Var3.l();
                    nq7 p3 = lye.p(rv4Var3, kq7Var);
                    rv4Var3.i0();
                    if (rv4Var3.S) {
                        rv4Var3.k(vt4Var);
                    } else {
                        rv4Var3.r0();
                    }
                    jce.F(npVar, rv4Var3, a3);
                    jce.F(npVar2, rv4Var3, l4);
                    s21.t(hashCode3, rv4Var3, npVar3, rv4Var3, kgVar);
                    jce.F(npVar4, rv4Var3, p3);
                    ar5 c = rp5.c((wk3) jk3.w.getValue(), rv4Var3, 0);
                    boolean f2 = rv4Var3.f(xt4Var3);
                    Object P2 = rv4Var3.P();
                    if (f2 || P2 == obj3) {
                        P2 = new hg7(4, xt4Var3);
                        rv4Var3.o0(P2);
                    }
                    kwe.d(c, null, 0L, (vt4) P2, rv4Var3, 0, 6);
                    cvb.c(yqe.A((y3b) f3b.C.getValue(), rv4Var3), new we6(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var3.j(j27.a)).b.g, rv4Var3, 0, 0, 131068);
                    rv4Var3.q(true);
                    sdd a4 = kv6.a(rv4Var3);
                    if (a4 != null) {
                        if (a4 instanceof y35) {
                            pb2Var = ((y35) a4).f();
                        } else {
                            pb2Var = ob2.b;
                        }
                        p54 p54Var = (p54) ((fdd) voe.z(cm9.a(p54.class), a4.i(), null, pb2Var, o96.a(rv4Var3), null));
                        m54 m54Var = (m54) jsc.z(p54Var.d, rv4Var3).getValue();
                        boolean f3 = rv4Var3.f(p54Var);
                        Object P3 = rv4Var3.P();
                        if (f3 || P3 == obj3) {
                            P3 = new fo4(p54Var, 29);
                            rv4Var3.o0(P3);
                        }
                        y9e.d(m54Var, ze4Var3, xt4Var, (xt4) P3, xt4Var2, rv4Var3, 48);
                        rv4Var3.q(true);
                        return pvcVar;
                    }
                    vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                rv4Var3.X();
                return pvcVar;
            case 3:
                vxb vxbVar = (vxb) obj6;
                xt4 xt4Var4 = (xt4) obj5;
                xt4 xt4Var5 = (xt4) obj4;
                rv4 rv4Var4 = (rv4) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var4.U(intValue4 & 1, z4)) {
                    bsa bsaVar = (bsa) rv4Var4.j(dy1.q);
                    boolean f4 = rv4Var4.f(vxbVar.c);
                    Object P4 = rv4Var4.P();
                    if (f4 || P4 == obj3) {
                        String str2 = vxbVar.c;
                        int length = str2.length();
                        P4 = yae.z(new jub(str2, sze.a(length, length), 4));
                        rv4Var4.o0(P4);
                    }
                    aw7 aw7Var3 = (aw7) P4;
                    nq7 C = zbe.C(zbe.x(pna.c, mwe.g(9, rv4Var4)), nae.e, 6.0f, nae.e, nae.e, 13);
                    xn1 a5 = wn1.a(ezVar, kh5.I, rv4Var4, 0);
                    int hashCode4 = Long.hashCode(rv4Var4.T);
                    xt8 l5 = rv4Var4.l();
                    nq7 p4 = lye.p(rv4Var4, C);
                    rw1.k.getClass();
                    zx1 zx1Var2 = qw1.b;
                    rv4Var4.i0();
                    if (rv4Var4.S) {
                        rv4Var4.k(zx1Var2);
                    } else {
                        rv4Var4.r0();
                    }
                    jce.F(qw1.f, rv4Var4, a5);
                    jce.F(qw1.e, rv4Var4, l5);
                    jce.F(qw1.g, rv4Var4, Integer.valueOf(hashCode4));
                    jce.C(qw1.h, rv4Var4);
                    jce.F(qw1.d, rv4Var4, p4);
                    jub jubVar = (jub) aw7Var3.getValue();
                    String A = yqe.A((y3b) b3b.P.getValue(), rv4Var4);
                    nq7 z12 = zbe.z(pna.f(kq7Var, 1.0f), 12.0f, 6.0f);
                    tu1 E = jce.E(-279322612, new zn7(vxbVar, 1), rv4Var4);
                    boolean f5 = rv4Var4.f(aw7Var3);
                    Object P5 = rv4Var4.P();
                    if (f5 || P5 == obj3) {
                        P5 = new dk7(aw7Var3, 25);
                        rv4Var4.o0(P5);
                    }
                    xt4 xt4Var6 = (xt4) P5;
                    boolean f6 = rv4Var4.f(bsaVar) | rv4Var4.f(xt4Var4) | rv4Var4.f(aw7Var3);
                    Object P6 = rv4Var4.P();
                    if (f6 || P6 == obj3) {
                        P6 = new yn7(bsaVar, xt4Var4, aw7Var3, 0);
                        rv4Var4.o0(P6);
                    }
                    xxe.m(jubVar, A, 0L, 0L, E, null, z12, null, xt4Var6, (vt4) P6, rv4Var4, 1597440, Token.LETEXPR);
                    voe.e(vxbVar, null, zn1.b(zn1.b(kq7Var, 1.0f), 1.0f), xt4Var5, rv4Var4, 0, 2);
                    rv4Var4.q(true);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            case 4:
                cz7 cz7Var = (cz7) obj6;
                String str3 = (String) obj5;
                yya yyaVar2 = (yya) obj4;
                rv4 rv4Var5 = (rv4) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (rv4Var5.U(intValue5 & 1, z5)) {
                    if (((aj9) yyaVar2.getValue()).a) {
                        rv4Var5.e0(-458102414);
                        nq7 y = zbe.y(pna.c, 24.0f);
                        xn1 a6 = wn1.a(lz.e, kh5.J, rv4Var5, 54);
                        int hashCode5 = Long.hashCode(rv4Var5.T);
                        xt8 l6 = rv4Var5.l();
                        nq7 p5 = lye.p(rv4Var5, y);
                        rw1.k.getClass();
                        zx1 zx1Var3 = qw1.b;
                        rv4Var5.i0();
                        if (rv4Var5.S) {
                            rv4Var5.k(zx1Var3);
                        } else {
                            rv4Var5.r0();
                        }
                        jce.F(qw1.f, rv4Var5, a6);
                        jce.F(qw1.e, rv4Var5, l6);
                        jce.F(qw1.g, rv4Var5, Integer.valueOf(hashCode5));
                        jce.C(qw1.h, rv4Var5);
                        jce.F(qw1.d, rv4Var5, p5);
                        String str4 = ((aj9) yyaVar2.getValue()).c;
                        tza tzaVar = j27.a;
                        cvb.c(str4, zbe.y(kq7Var, 24.0f), ((h27) rv4Var5.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var5.j(tzaVar)).b.g, rv4Var5, 48, 0, 130040);
                        eg0.f(pna.n(kq7Var, 48.0f), ((h27) rv4Var5.j(tzaVar)).a.q, null, rv4Var5, 6, 4);
                        rv4Var5.q(true);
                        rv4Var5.q(false);
                    } else if (((aj9) yyaVar2.getValue()).f) {
                        rv4Var5.e0(-457218914);
                        ze4 ze4Var4 = pna.c;
                        boolean f7 = rv4Var5.f(cz7Var);
                        Object P7 = rv4Var5.P();
                        if (f7 || P7 == obj3) {
                            P7 = new px6(cz7Var, 24);
                            rv4Var5.o0(P7);
                        }
                        hre.c(6, (vt4) P7, rv4Var5, ze4Var4);
                        rv4Var5.q(false);
                    } else {
                        rv4Var5.e0(-456974262);
                        hre.e(((aj9) yyaVar2.getValue()).d, ((aj9) yyaVar2.getValue()).e, 24576, rv4Var5, pna.c, cz7Var, str3);
                        rv4Var5.q(false);
                    }
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
            case 5:
                nq7 nq7Var = (nq7) obj6;
                aw7 aw7Var4 = (aw7) obj5;
                tu1 tu1Var = (tu1) obj4;
                rv4 rv4Var6 = (rv4) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (rv4Var6.U(intValue6 & 1, z6)) {
                    Object P8 = rv4Var6.P();
                    if (P8 == obj3) {
                        P8 = new s7(aw7Var4, 2);
                        rv4Var6.o0(P8);
                    }
                    nq7 y2 = obe.y(nq7Var, (xt4) P8);
                    b37 d = fu0.d(kh5.a, true);
                    int hashCode6 = Long.hashCode(rv4Var6.T);
                    xt8 l7 = rv4Var6.l();
                    nq7 p6 = lye.p(rv4Var6, y2);
                    rw1.k.getClass();
                    zx1 zx1Var4 = qw1.b;
                    rv4Var6.i0();
                    if (rv4Var6.S) {
                        rv4Var6.k(zx1Var4);
                    } else {
                        rv4Var6.r0();
                    }
                    jce.F(qw1.f, rv4Var6, d);
                    jce.F(qw1.e, rv4Var6, l7);
                    jce.F(qw1.g, rv4Var6, Integer.valueOf(hashCode6));
                    jce.C(qw1.h, rv4Var6);
                    jce.F(qw1.d, rv4Var6, p6);
                    tu1Var.invoke(rv4Var6, 0);
                    rv4Var6.q(true);
                } else {
                    rv4Var6.X();
                }
                return pvcVar;
            case 6:
                yya yyaVar3 = (yya) obj4;
                tx txVar2 = (tx) obj6;
                aw7 aw7Var5 = (aw7) obj5;
                rv4 rv4Var7 = (rv4) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (rv4Var7.U(intValue7 & 1, z7)) {
                    x6c x6cVar = (x6c) yyaVar3.getValue();
                    boolean p7 = nae.p(rv4Var7);
                    Object P9 = rv4Var7.P();
                    dl8 dl8Var2 = dl8.d;
                    dl8 dl8Var3 = dl8.a;
                    Object obj7 = P9;
                    if (P9 == obj3) {
                        dl8[] dl8VarArr = {dl8Var3, dl8.b, dl8.c, dl8Var2, dl8.e, dl8.f, dl8.C, dl8.D, dl8.E};
                        rv4Var7.o0(dl8VarArr);
                        obj7 = dl8VarArr;
                    }
                    dl8[] dl8VarArr2 = (dl8[]) obj7;
                    Object P10 = rv4Var7.P();
                    if (P10 == obj3) {
                        long j = x6cVar.a;
                        mv mvVar = x6cVar.b;
                        dl8 dl8Var4 = (dl8) b00.q0(x6cVar.h, dl8VarArr2);
                        if (dl8Var4 == null) {
                            dl8Var = dl8Var3;
                        } else {
                            dl8Var = dl8Var4;
                        }
                        double d2 = x6cVar.i;
                        boolean z13 = x6cVar.g;
                        z8 = false;
                        boolean z14 = x6cVar.e;
                        boolean z15 = x6cVar.d;
                        boolean z16 = x6cVar.f;
                        int i2 = x6cVar.c;
                        if (i2 != 0) {
                            z10 = z16;
                            if (i2 != 1) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                        } else {
                            z10 = z16;
                            z11 = p7;
                        }
                        P10 = new om3(j, mvVar, z11, z15, z14, z13, z10, dl8Var, d2, x6cVar.j, x6cVar.k, x6cVar.l);
                        rv4Var7.o0(P10);
                    } else {
                        z8 = false;
                    }
                    om3 om3Var2 = (om3) P10;
                    om3Var2.a.setValue(new zl1(x6cVar.a));
                    mv mvVar2 = x6cVar.b;
                    mvVar2.getClass();
                    om3Var2.b.setValue(mvVar2);
                    dl8 dl8Var5 = (dl8) b00.q0(x6cVar.h, dl8VarArr2);
                    if (dl8Var5 == null) {
                        dl8Var5 = dl8Var2;
                    }
                    om3Var2.k.setValue(dl8Var5);
                    om3Var2.l.setValue(Double.valueOf(x6cVar.i));
                    om3Var2.f.setValue(Boolean.valueOf(x6cVar.g));
                    om3Var2.e.setValue(Boolean.valueOf(x6cVar.e));
                    om3Var2.d.setValue(Boolean.valueOf(x6cVar.d));
                    om3Var2.g.setValue(Boolean.valueOf(x6cVar.f));
                    int i3 = x6cVar.c;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            z9 = z8;
                        } else {
                            z9 = true;
                        }
                    } else {
                        z9 = p7;
                    }
                    om3Var2.c.setValue(Boolean.valueOf(z9));
                    eo4 eo4Var = x6cVar.l;
                    eo4Var.getClass();
                    om3Var2.h.setValue(eo4Var);
                    om3Var2.i.setValue(Float.valueOf(x6cVar.j));
                    om3Var2.j.setValue(Float.valueOf(x6cVar.k));
                    nm3.a(om3Var2, ofa.a, false, null, jce.E(1824927742, new ax(txVar2, om3Var2, yyaVar3, aw7Var5), rv4Var7), rv4Var7, 24576, 12);
                } else {
                    rv4Var7.X();
                }
                return pvcVar;
            case 7:
                ((Integer) obj2).getClass();
                am8.b((tx) obj6, (x6c) obj4, (om3) obj5, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 8:
                ((Integer) obj2).getClass();
                z1d.a((ja0) obj6, (nq7) obj5, (xt4) obj4, (rv4) obj, xoe.p(49));
                return pvcVar;
            case 9:
                ((Integer) obj2).getClass();
                ctd.b((tu1) obj6, (nq7) obj5, (tu1) obj4, (rv4) obj, xoe.p(391));
                return pvcVar;
            case 10:
                ((Integer) obj2).getClass();
                yf2.f(xoe.p(1), (xt4) obj5, (rv4) obj, (nq7) obj4, (List) obj6);
                return pvcVar;
            case 11:
                ((Integer) obj2).getClass();
                cae.a(xoe.p(1), (rv4) obj, (nq7) obj5, (cz7) obj6, (String) obj4);
                return pvcVar;
            case 12:
                ((Integer) obj2).getClass();
                bbe.d((s81) obj6, (nq7) obj5, (vt4) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 13:
                ((Integer) obj2).getClass();
                ch0.d((nq7) obj6, (gtb) obj5, (tu1) obj4, (rv4) obj, xoe.p(385));
                return pvcVar;
            case 14:
                ((Integer) obj2).getClass();
                cqe.a((String) obj6, (String) obj5, (cz7) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 15:
                ((Integer) obj2).getClass();
                jye.b((sj4) obj6, (kn6) obj5, (mu4) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 16:
                ((Integer) obj2).getClass();
                iue.m((r14) obj6, (nq7) obj5, (vt4) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 17:
                ((Integer) obj2).getClass();
                jue.h((ArrayList) obj6, (e24) obj5, (xt4) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 18:
                ((Integer) obj2).getClass();
                que.f((f84) obj6, (nq7) obj5, (vt4) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 19:
                ((Integer) obj2).getClass();
                bce.c((List) obj6, (nq7) obj5, (lu4) obj4, (rv4) obj, xoe.p(49));
                return pvcVar;
            case 20:
                ((Integer) obj2).getClass();
                jye.c((ur5) obj6, (cz7) obj5, (nq7) obj4, (rv4) obj, xoe.p(385));
                return pvcVar;
            case 21:
                rh8 rh8Var = (rh8) obj6;
                bya byaVar = (bya) obj5;
                fz fzVar = (fz) obj4;
                r13 r13Var = (r13) obj;
                x02 x02Var = (x02) obj2;
                if (x02.i(x02Var.a) == Integer.MAX_VALUE) {
                    ov5.a("LazyVerticalStaggeredGrid's width should be bound by parent.");
                }
                tc6 tc6Var = tc6.a;
                int i4 = x02.i(x02Var.a) - r13Var.X0(zbe.n(rh8Var, tc6Var) + zbe.o(rh8Var, tc6Var));
                int X0 = r13Var.X0(fzVar.b());
                int[] g = hu7.g(i4, Math.max((i4 + X0) / (r13Var.X0(byaVar.a) + X0), 1), X0);
                int[] iArr = new int[g.length];
                fzVar.f(r13Var, i4, g, tc6Var, iArr);
                return new lk6(iArr, g);
            case 22:
                ((Integer) obj2).getClass();
                tte.a((shc) obj6, (un6) obj5, (xt4) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 23:
                ((Integer) obj2).getClass();
                eh.f((rp6) obj6, (np6) obj5, (nq7) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 24:
                ((Integer) obj2).getClass();
                n4f.c((ar5) obj6, (nq7) obj5, (vt4) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 25:
                ((Integer) obj2).getClass();
                uaf.s((bzc) obj6, (nq7) obj5, (vt4) obj4, (rv4) obj, xoe.p(57));
                return pvcVar;
            case 26:
                ((Integer) obj2).getClass();
                hc2.c((d8) obj6, (lu4) obj5, (xt4) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 27:
                ((Integer) obj2).getClass();
                b16.a((pn1) obj6, (nq7) obj5, (mu4) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 28:
                ((Integer) obj2).getClass();
                ie2.b((m9) obj6, (xt4) obj5, (nq7) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                c16.b((mv) obj6, (String) obj5, (nq7) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
        }
    }

    public /* synthetic */ ax(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ ax(tx txVar, x6c x6cVar, om3 om3Var, int i) {
        this.a = 7;
        this.b = txVar;
        this.d = x6cVar;
        this.c = om3Var;
    }

    public /* synthetic */ ax(aw7 aw7Var, tx txVar, aw7 aw7Var2) {
        this.a = 6;
        this.d = aw7Var;
        this.b = txVar;
        this.c = aw7Var2;
    }

    public /* synthetic */ ax(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
