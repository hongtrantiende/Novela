package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zm7  reason: default package */
/* loaded from: classes3.dex */
public final class zm7 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;
    public final /* synthetic */ xt4 d;

    public /* synthetic */ zm7(int i, xt4 xt4Var, String str, List list) {
        this.a = i;
        this.b = list;
        this.c = str;
        this.d = xt4Var;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        boolean z2;
        long v;
        long v2;
        rv4 rv4Var;
        wea weaVar;
        rv4 rv4Var2;
        long j;
        float f;
        rv4 rv4Var3;
        wea weaVar2;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        boolean z5;
        int i4;
        boolean z6;
        int i5;
        boolean z7;
        int i6;
        boolean z8;
        int i7;
        boolean z9;
        int i8;
        boolean z10;
        int i9 = this.a;
        kq7 kq7Var = kq7.a;
        String str = this.c;
        pvc pvcVar = pvc.a;
        Object obj5 = ax1.a;
        List list = this.b;
        int i10 = 16;
        xt4 xt4Var = this.d;
        int i11 = 2;
        int i12 = 4;
        switch (i9) {
            case 0:
                xg6 xg6Var = (xg6) obj;
                int intValue = ((Number) obj2).intValue();
                rv4 rv4Var4 = (rv4) obj3;
                int intValue2 = ((Number) obj4).intValue();
                nk0 nk0Var = kh5.e;
                if ((intValue2 & 6) == 0) {
                    if (rv4Var4.f(xg6Var)) {
                        i11 = 4;
                    }
                    i = intValue2 | i11;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (rv4Var4.d(intValue)) {
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
                if (rv4Var4.U(i & 1, z)) {
                    pn1 pn1Var = (pn1) list.get(intValue);
                    rv4Var4.e0(1524328114);
                    String str2 = pn1Var.a;
                    String str3 = pn1Var.c;
                    String str4 = pn1Var.b;
                    boolean i13 = c16.i(str2, str);
                    if (pn1Var.a.length() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean f2 = rv4Var4.f(str4);
                    Object P = rv4Var4.P();
                    if (f2 || P == obj5) {
                        if (str4.length() == 0) {
                            v = zl1.b;
                        } else {
                            v = kve.v(str4);
                        }
                        Object zl1Var = new zl1(v);
                        rv4Var4.o0(zl1Var);
                        P = zl1Var;
                    }
                    long j2 = ((zl1) P).a;
                    boolean f3 = rv4Var4.f(str3);
                    Object P2 = rv4Var4.P();
                    if (!f3 && P2 != obj5) {
                        rv4Var = rv4Var4;
                    } else {
                        if (str4.length() == 0) {
                            v2 = zl1.e;
                        } else {
                            v2 = kve.v(str3);
                        }
                        P2 = new zl1(v2);
                        rv4Var = rv4Var4;
                        rv4Var.o0(P2);
                    }
                    long j3 = ((zl1) P2).a;
                    nq7 n = pna.n(kq7Var, 40.0f);
                    if (i13) {
                        rv4Var.e0(-1613372475);
                        abf abfVar = f27.a;
                        weaVar = aye.s(abf.r(), rv4Var);
                        rv4Var.q(false);
                    } else {
                        rv4Var.e0(-1613371993);
                        rv4Var.q(false);
                        weaVar = uu9.a;
                    }
                    nq7 k = tte.k(n, weaVar);
                    if (i13) {
                        rv4Var2 = rv4Var;
                        j = j2;
                    } else {
                        rv4Var2 = rv4Var;
                        j = zl1.h;
                    }
                    nq7 v3 = nmd.v(k, j, lre.g);
                    if (i13) {
                        f = 3.0f;
                    } else {
                        f = 1.5f;
                    }
                    nq7 y = zbe.y(v3, f);
                    if (i13) {
                        rv4Var3 = rv4Var2;
                        rv4Var3.e0(-1613364315);
                        abf abfVar2 = f27.a;
                        weaVar2 = aye.s(abf.r(), rv4Var3);
                        rv4Var3.q(false);
                    } else {
                        rv4Var3 = rv4Var2;
                        rv4Var3.e0(-1613363833);
                        rv4Var3.q(false);
                        weaVar2 = uu9.a;
                    }
                    nq7 k2 = tte.k(y, weaVar2);
                    boolean f4 = rv4Var3.f(xt4Var) | rv4Var3.h(pn1Var);
                    Object P3 = rv4Var3.P();
                    if (!f4 && P3 != obj5) {
                        z3 = false;
                    } else {
                        z3 = false;
                        P3 = new ym7(xt4Var, pn1Var, 0);
                        rv4Var3.o0(P3);
                    }
                    nq7 f5 = lbe.f(15, (vt4) P3, k2, null, z3);
                    b37 d = fu0.d(kh5.a, z3);
                    int hashCode = Long.hashCode(rv4Var3.T);
                    xt8 l = rv4Var3.l();
                    nq7 p = lye.p(rv4Var3, f5);
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
                    rv4 rv4Var5 = rv4Var3;
                    fca.c(384, j3, rv4Var5, pna.c, pn1Var.d);
                    pu0 pu0Var = pu0.a;
                    if (z2) {
                        rv4Var5.e0(567276699);
                        nk5.a(rp5.c((wk3) jk3.p.getValue(), rv4Var5, 0), null, pu0Var.a(kq7Var, nk0Var), j2, rv4Var5, 48, 0);
                        rv4Var5.q(false);
                        z4 = false;
                    } else {
                        rv4Var5.e0(567619218);
                        cvb.c("Aa", pu0Var.a(kq7Var, nk0Var), j2, null, zr1.q(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rv4Var5, 24582, 0, 262120);
                        z4 = false;
                        rv4Var5.q(false);
                    }
                    rv4Var5.q(true);
                    rv4Var5.q(z4);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            case 1:
                xg6 xg6Var2 = (xg6) obj;
                int intValue3 = ((Number) obj2).intValue();
                rv4 rv4Var6 = (rv4) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (rv4Var6.f(xg6Var2)) {
                        i11 = 4;
                    }
                    i3 = intValue4 | i11;
                } else {
                    i3 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (rv4Var6.d(intValue3)) {
                        i10 = 32;
                    }
                    i3 |= i10;
                }
                if ((i3 & Token.EXPR_VOID) != 146) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (rv4Var6.U(i3 & 1, z5)) {
                    b84 b84Var = (b84) list.get(intValue3);
                    rv4Var6.e0(1866382100);
                    c16.i(b84Var.a, str);
                    boolean f6 = rv4Var6.f(xt4Var) | rv4Var6.h(b84Var);
                    Object P4 = rv4Var6.P();
                    if (f6 || P4 == obj5) {
                        P4 = new w7(11, xt4Var, b84Var);
                        rv4Var6.o0(P4);
                    }
                    nq7 y2 = zbe.y(lbe.f(15, (vt4) P4, kq7Var, null, false), 12.0f);
                    gv9 a = ev9.a(lz.a, kh5.F, rv4Var6, 0);
                    int hashCode2 = Long.hashCode(rv4Var6.T);
                    xt8 l2 = rv4Var6.l();
                    nq7 p2 = lye.p(rv4Var6, y2);
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
                    cvb.c(b84Var.a, new we6(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rv4Var6, 0, 0, 262140);
                    rv4Var6.q(true);
                    rv4Var6.q(false);
                } else {
                    rv4Var6.X();
                }
                return pvcVar;
            case 2:
                Object obj6 = (xg6) obj;
                int intValue5 = ((Number) obj2).intValue();
                rv4 rv4Var7 = (rv4) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    if (rv4Var7.f(obj6)) {
                        i11 = 4;
                    }
                    i4 = intValue6 | i11;
                } else {
                    i4 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    if (rv4Var7.d(intValue5)) {
                        i10 = 32;
                    }
                    i4 |= i10;
                }
                if ((i4 & Token.EXPR_VOID) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (rv4Var7.U(i4 & 1, z6)) {
                    oc9 oc9Var = (oc9) list.get(intValue5);
                    rv4Var7.e0(-1254134098);
                    String str5 = oc9Var.b;
                    boolean equals = oc9Var.a.equals(str);
                    boolean f7 = rv4Var7.f(xt4Var) | rv4Var7.h(oc9Var);
                    Object P5 = rv4Var7.P();
                    if (f7 || P5 == obj5) {
                        P5 = new w7(20, xt4Var, oc9Var);
                        rv4Var7.o0(P5);
                    }
                    ese.m(0, (vt4) P5, rv4Var7, null, null, null, str5, equals);
                    rv4Var7.q(false);
                } else {
                    rv4Var7.X();
                }
                return pvcVar;
            case 3:
                xg6 xg6Var3 = (xg6) obj;
                int intValue7 = ((Number) obj2).intValue();
                rv4 rv4Var8 = (rv4) obj3;
                int intValue8 = ((Number) obj4).intValue();
                if ((intValue8 & 6) == 0) {
                    if (rv4Var8.f(xg6Var3)) {
                        i11 = 4;
                    }
                    i5 = intValue8 | i11;
                } else {
                    i5 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    if (rv4Var8.d(intValue7)) {
                        i10 = 32;
                    }
                    i5 |= i10;
                }
                if ((i5 & Token.EXPR_VOID) != 146) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (rv4Var8.U(i5 & 1, z7)) {
                    pn1 pn1Var2 = (pn1) list.get(intValue7);
                    rv4Var8.e0(1710490839);
                    boolean i14 = c16.i(pn1Var2.a, str);
                    nq7 p3 = pna.p(zbe.y(kq7Var, 2.0f), 100.0f, 60.0f);
                    boolean f8 = rv4Var8.f(xt4Var) | rv4Var8.h(pn1Var2);
                    Object P6 = rv4Var8.P();
                    if (f8 || P6 == obj5) {
                        P6 = new ym7(xt4Var, pn1Var2, 1);
                        rv4Var8.o0(P6);
                    }
                    v9e.i(i14, pn1Var2, q1d.b(p3, false, nae.e, (vt4) P6, 3), rv4Var8, 0);
                    rv4Var8.q(false);
                } else {
                    rv4Var8.X();
                }
                return pvcVar;
            case 4:
                xg6 xg6Var4 = (xg6) obj;
                int intValue9 = ((Number) obj2).intValue();
                rv4 rv4Var9 = (rv4) obj3;
                int intValue10 = ((Number) obj4).intValue();
                if ((intValue10 & 6) == 0) {
                    if (!rv4Var9.f(xg6Var4)) {
                        i12 = 2;
                    }
                    i6 = intValue10 | i12;
                } else {
                    i6 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    if (rv4Var9.d(intValue9)) {
                        i10 = 32;
                    }
                    i6 |= i10;
                }
                if ((i6 & Token.EXPR_VOID) != 146) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (rv4Var9.U(i6 & 1, z8)) {
                    pn1 pn1Var3 = (pn1) list.get(intValue9);
                    rv4Var9.e0(1861702082);
                    boolean i15 = c16.i(pn1Var3.a, str);
                    nq7 p4 = pna.p(zbe.y(kq7Var, 2.0f), 100.0f, 60.0f);
                    boolean f9 = rv4Var9.f(xt4Var) | rv4Var9.h(pn1Var3);
                    Object P7 = rv4Var9.P();
                    if (f9 || P7 == obj5) {
                        P7 = new ym7(xt4Var, pn1Var3, 2);
                        rv4Var9.o0(P7);
                    }
                    v9e.i(i15, pn1Var3, q1d.b(p4, false, nae.e, (vt4) P7, 3), rv4Var9, 0);
                    rv4Var9.q(false);
                } else {
                    rv4Var9.X();
                }
                return pvcVar;
            case 5:
                xg6 xg6Var5 = (xg6) obj;
                int intValue11 = ((Number) obj2).intValue();
                rv4 rv4Var10 = (rv4) obj3;
                int intValue12 = ((Number) obj4).intValue();
                if ((intValue12 & 6) == 0) {
                    if (!rv4Var10.f(xg6Var5)) {
                        i12 = 2;
                    }
                    i7 = i12 | intValue12;
                } else {
                    i7 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    if (rv4Var10.d(intValue11)) {
                        i10 = 32;
                    }
                    i7 |= i10;
                }
                if ((i7 & Token.EXPR_VOID) != 146) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (rv4Var10.U(i7 & 1, z9)) {
                    ida idaVar = (ida) list.get(intValue11);
                    rv4Var10.e0(1150065243);
                    nq7 C = zbe.C(zbe.A(xg6.a(xg6Var5, pna.f(kq7Var, 1.0f)), 16.0f, nae.e, 2), nae.e, nae.e, nae.e, 4.0f, 7);
                    boolean f10 = rv4Var10.f(xt4Var) | rv4Var10.h(idaVar);
                    Object P8 = rv4Var10.P();
                    if (f10 || P8 == obj5) {
                        P8 = new w7(26, xt4Var, idaVar);
                        rv4Var10.o0(P8);
                    }
                    gue.g(idaVar, this.c, C, (vt4) P8, rv4Var10, 8);
                    rv4Var10.q(false);
                } else {
                    rv4Var10.X();
                }
                return pvcVar;
            default:
                yf6 yf6Var = (yf6) obj;
                int intValue13 = ((Number) obj2).intValue();
                rv4 rv4Var11 = (rv4) obj3;
                int intValue14 = ((Number) obj4).intValue();
                if ((intValue14 & 6) == 0) {
                    if (rv4Var11.f(yf6Var)) {
                        i11 = 4;
                    }
                    i8 = intValue14 | i11;
                } else {
                    i8 = intValue14;
                }
                if ((intValue14 & 48) == 0) {
                    if (rv4Var11.d(intValue13)) {
                        i10 = 32;
                    }
                    i8 |= i10;
                }
                if ((i8 & Token.EXPR_VOID) != 146) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (rv4Var11.U(i8 & 1, z10)) {
                    lbd lbdVar = (lbd) list.get(intValue13);
                    rv4Var11.e0(-1247608828);
                    boolean i16 = c16.i(str, lbdVar.a);
                    boolean f11 = rv4Var11.f(xt4Var) | rv4Var11.f(lbdVar);
                    Object P9 = rv4Var11.P();
                    if (f11 || P9 == obj5) {
                        P9 = new jua(xt4Var, lbdVar, 4);
                        rv4Var11.o0(P9);
                    }
                    eg0.d(i16, lbdVar, null, (vt4) P9, rv4Var11, 0);
                    rv4Var11.q(false);
                } else {
                    rv4Var11.X();
                }
                return pvcVar;
        }
    }
}
