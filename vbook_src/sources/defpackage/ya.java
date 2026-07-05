package defpackage;

import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ya  reason: default package */
/* loaded from: classes3.dex */
public final class ya implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public ya(List list, xt4 xt4Var, aw7 aw7Var) {
        this.a = 3;
        this.b = list;
        this.d = xt4Var;
        this.c = aw7Var;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        boolean z3;
        int i7;
        int i8;
        boolean z4;
        long g;
        int i9;
        int i10;
        boolean z5;
        boolean z6;
        boolean z7;
        v72 d;
        long g2;
        int i11;
        int i12;
        boolean z8;
        int i13;
        int i14;
        int i15;
        boolean z9;
        Object gs9Var;
        mv6 mv6Var;
        Object obj5;
        int i16;
        int i17;
        boolean z10;
        boolean contains;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z11;
        long j;
        int i22;
        int i23;
        boolean z12;
        int i24;
        int i25;
        boolean z13;
        int i26;
        int i27;
        boolean z14;
        boolean equals;
        int i28;
        int i29 = this.a;
        String str = null;
        kq7 kq7Var = kq7.a;
        Object obj6 = ax1.a;
        pvc pvcVar = pvc.a;
        Object obj7 = this.c;
        List list = this.b;
        Object obj8 = this.d;
        int i30 = 2;
        boolean z15 = true;
        switch (i29) {
            case 0:
                xg6 xg6Var = (xg6) obj;
                int intValue = ((Number) obj2).intValue();
                rv4 rv4Var = (rv4) obj3;
                int intValue2 = ((Number) obj4).intValue();
                Object obj9 = (xt4) obj8;
                if ((intValue2 & 6) == 0) {
                    if (rv4Var.f(xg6Var)) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                    i = intValue2 | i3;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (rv4Var.d(intValue)) {
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
                if (rv4Var.U(i & 1, z)) {
                    fb fbVar = (fb) list.get(intValue);
                    rv4Var.e0(-1835778261);
                    String str2 = fbVar.b;
                    String str3 = fbVar.c;
                    m9 m9Var = fbVar.j;
                    long j2 = fbVar.d;
                    String str4 = fbVar.l;
                    String str5 = fbVar.k.a;
                    l9 l9Var = (l9) ((Map) obj7).get(fbVar.a);
                    if (l9Var == null) {
                        l9Var = i9.a;
                    }
                    l9 l9Var2 = l9Var;
                    nq7 a = xg6.a(xg6Var, kq7Var);
                    f99 f99Var = j27.a;
                    nq7 z16 = zbe.z(nmd.v(tte.k(a, ((h27) rv4Var.j(f99Var)).c.a), rm1.g(((h27) rv4Var.j(f99Var)).a, 1.0f), lre.g), 16.0f, 8.0f);
                    boolean f = rv4Var.f(obj9) | rv4Var.h(fbVar);
                    Object P = rv4Var.P();
                    if (f || P == obj6) {
                        P = new w7(2, obj9, fbVar);
                        rv4Var.o0(P);
                    }
                    w92.j(str2, str3, m9Var, j2, str4, str5, l9Var2, (vt4) P, z16, rv4Var, 0);
                    rv4Var.q(false);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                yf6 yf6Var = (yf6) obj;
                int intValue3 = ((Number) obj2).intValue();
                rv4 rv4Var2 = (rv4) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (rv4Var2.f(yf6Var)) {
                        i30 = 4;
                    }
                    i4 = intValue4 | i30;
                } else {
                    i4 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (rv4Var2.d(intValue3)) {
                        i5 = 32;
                    } else {
                        i5 = 16;
                    }
                    i4 |= i5;
                }
                if ((i4 & Token.EXPR_VOID) != 146) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(i4 & 1, z2)) {
                    s81 s81Var = (s81) list.get(intValue3);
                    rv4Var2.e0(-910459820);
                    rqe.b(yf6Var, (qo9) obj7, s81Var.a, null, false, null, jce.E(-387397620, new z7(1, s81Var, (aw7) obj8), rv4Var2), rv4Var2, (i4 & 14) | 1572864);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                xg6 xg6Var2 = (xg6) obj;
                int intValue5 = ((Number) obj2).intValue();
                rv4 rv4Var3 = (rv4) obj3;
                int intValue6 = ((Number) obj4).intValue();
                xt4 xt4Var = (xt4) obj8;
                if ((intValue6 & 6) == 0) {
                    if (rv4Var3.f(xg6Var2)) {
                        i30 = 4;
                    }
                    i6 = intValue6 | i30;
                } else {
                    i6 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    if (rv4Var3.d(intValue5)) {
                        i7 = 32;
                    } else {
                        i7 = 16;
                    }
                    i6 |= i7;
                }
                if ((i6 & Token.EXPR_VOID) != 146) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var3.U(i6 & 1, z3)) {
                    bzc bzcVar = (bzc) list.get(intValue5);
                    rv4Var3.e0(1272874570);
                    boolean contains2 = ((cg1) obj7).z.contains(bzcVar.a);
                    boolean f2 = rv4Var3.f(xt4Var) | rv4Var3.h(bzcVar);
                    Object P2 = rv4Var3.P();
                    if (f2 || P2 == obj6) {
                        P2 = new w7(5, xt4Var, bzcVar);
                        rv4Var3.o0(P2);
                    }
                    hma.i(bzcVar, contains2, (vt4) P2, rv4Var3, 8);
                    rv4Var3.q(false);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 3:
                xg6 xg6Var3 = (xg6) obj;
                int intValue7 = ((Number) obj2).intValue();
                rv4 rv4Var4 = (rv4) obj3;
                int intValue8 = ((Number) obj4).intValue();
                xt4 xt4Var2 = (xt4) obj8;
                if ((intValue8 & 6) == 0) {
                    if (rv4Var4.f(xg6Var3)) {
                        i30 = 4;
                    }
                    i8 = intValue8 | i30;
                } else {
                    i8 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    if (rv4Var4.d(intValue7)) {
                        i9 = 32;
                    } else {
                        i9 = 16;
                    }
                    i8 |= i9;
                }
                if ((i8 & Token.EXPR_VOID) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var4.U(i8 & 1, z4)) {
                    j62 j62Var = (j62) list.get(intValue7);
                    rv4Var4.e0(810538563);
                    boolean equals2 = "".equals(String.valueOf(j62Var.a));
                    nq7 k = tte.k(pna.f(kq7Var, 1.0f), fbe.x(intValue7, ((ce1) ((aw7) obj7).getValue()).g.size(), rv4Var4));
                    if ("".equals(String.valueOf(j62Var.a))) {
                        rv4Var4.e0(811159895);
                        g = zl1.b(0.65f, ((h27) rv4Var4.j(j27.a)).a.h);
                        rv4Var4.q(false);
                    } else {
                        rv4Var4.e0(811308416);
                        g = rm1.g(((h27) rv4Var4.j(j27.a)).a, 1.0f);
                        rv4Var4.q(false);
                    }
                    nq7 v = nmd.v(k, g, lre.g);
                    boolean f3 = rv4Var4.f(xt4Var2) | rv4Var4.h(j62Var);
                    Object P3 = rv4Var4.P();
                    if (f3 || P3 == obj6) {
                        P3 = new w7(6, xt4Var2, j62Var);
                        rv4Var4.o0(P3);
                    }
                    fbe.g(j62Var, equals2, v, (vt4) P3, rv4Var4, 8);
                    rv4Var4.q(false);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            case 4:
                xg6 xg6Var4 = (xg6) obj;
                int intValue9 = ((Number) obj2).intValue();
                rv4 rv4Var5 = (rv4) obj3;
                int intValue10 = ((Number) obj4).intValue();
                lb2 lb2Var = (lb2) obj7;
                yya yyaVar = (yya) obj8;
                if ((intValue10 & 6) == 0) {
                    if (rv4Var5.f(xg6Var4)) {
                        i30 = 4;
                    }
                    i10 = intValue10 | i30;
                } else {
                    i10 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    if (rv4Var5.d(intValue9)) {
                        i11 = 32;
                    } else {
                        i11 = 16;
                    }
                    i10 |= i11;
                }
                if ((i10 & Token.EXPR_VOID) != 146) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (rv4Var5.U(i10 & 1, z5)) {
                    bzc bzcVar2 = (bzc) list.get(intValue9);
                    rv4Var5.e0(-1615193887);
                    if (intValue9 == 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (intValue9 == tl1.x(((kb2) yyaVar.getValue()).i)) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean contains3 = ((kb2) yyaVar.getValue()).h.contains(bzcVar2.a);
                    nq7 f4 = pna.f(kq7Var, 1.0f);
                    if (!z6 && !z7) {
                        rv4Var5.e0(-1437561895);
                        d = ((h27) rv4Var5.j(j27.a)).c.a;
                        rv4Var5.q(false);
                    } else if (z6 && z7) {
                        rv4Var5.e0(-1437558764);
                        d = ((h27) rv4Var5.j(j27.a)).c.d;
                        rv4Var5.q(false);
                    } else if (z6) {
                        rv4Var5.e0(-1614554482);
                        tza tzaVar = j27.a;
                        d = v72.d(((h27) rv4Var5.j(tzaVar)).c.d, null, null, ((h27) rv4Var5.j(tzaVar)).c.a.c, ((h27) rv4Var5.j(tzaVar)).c.a.d, 3);
                        rv4Var5.q(false);
                    } else {
                        rv4Var5.e0(-1437544792);
                        tza tzaVar2 = j27.a;
                        d = v72.d(((h27) rv4Var5.j(tzaVar2)).c.d, ((h27) rv4Var5.j(tzaVar2)).c.a.a, ((h27) rv4Var5.j(tzaVar2)).c.a.b, null, null, 12);
                        rv4Var5.q(false);
                    }
                    nq7 k2 = tte.k(f4, d);
                    if (((kb2) yyaVar.getValue()).h.contains(bzcVar2.a)) {
                        rv4Var5.e0(-1613764261);
                        g2 = zl1.b(0.65f, ((h27) rv4Var5.j(j27.a)).a.h);
                        rv4Var5.q(false);
                    } else {
                        rv4Var5.e0(-1613607804);
                        g2 = rm1.g(((h27) rv4Var5.j(j27.a)).a, 1.0f);
                        rv4Var5.q(false);
                    }
                    nq7 v2 = nmd.v(k2, g2, lre.g);
                    boolean f5 = rv4Var5.f(lb2Var) | rv4Var5.h(bzcVar2);
                    Object P4 = rv4Var5.P();
                    if (f5 || P4 == obj6) {
                        P4 = new w7(7, lb2Var, bzcVar2);
                        rv4Var5.o0(P4);
                    }
                    r1d.c(bzcVar2, contains3, zbe.z(lbe.f(15, (vt4) P4, v2, null, false), 16.0f, 10.0f), rv4Var5, 8);
                    rv4Var5.q(false);
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
            case 5:
                xg6 xg6Var5 = (xg6) obj;
                int intValue11 = ((Number) obj2).intValue();
                rv4 rv4Var6 = (rv4) obj3;
                int intValue12 = ((Number) obj4).intValue();
                xt4 xt4Var3 = (xt4) obj8;
                if ((intValue12 & 6) == 0) {
                    if (rv4Var6.f(xg6Var5)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = intValue12 | i14;
                } else {
                    i12 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    if (rv4Var6.d(intValue11)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i12 |= i13;
                }
                if ((i12 & Token.EXPR_VOID) != 146) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (rv4Var6.U(i12 & 1, z8)) {
                    ju6 ju6Var = (ju6) list.get(intValue11);
                    rv4Var6.e0(468565588);
                    boolean equals3 = ju6Var.b.equals(((sp4) obj7).b);
                    nq7 s = pna.s(zbe.A(kq7Var, 6.0f, nae.e, 2), 68.0f);
                    boolean f6 = rv4Var6.f(xt4Var3) | rv4Var6.h(ju6Var);
                    Object P5 = rv4Var6.P();
                    if (f6 || P5 == obj6) {
                        P5 = new w7(14, xt4Var3, ju6Var);
                        rv4Var6.o0(P5);
                    }
                    uwe.c(ju6Var, equals3, s, (vt4) P5, rv4Var6, 384);
                    rv4Var6.q(false);
                } else {
                    rv4Var6.X();
                }
                return pvcVar;
            case 6:
                yf6 yf6Var2 = (yf6) obj;
                int intValue13 = ((Number) obj2).intValue();
                rv4 rv4Var7 = (rv4) obj3;
                int intValue14 = ((Number) obj4).intValue();
                xt4 xt4Var4 = (xt4) obj8;
                if ((intValue14 & 6) == 0) {
                    if (rv4Var7.f(yf6Var2)) {
                        i30 = 4;
                    }
                    i15 = intValue14 | i30;
                } else {
                    i15 = intValue14;
                }
                if ((intValue14 & 48) == 0) {
                    if (rv4Var7.d(intValue13)) {
                        i16 = 32;
                    } else {
                        i16 = 16;
                    }
                    i15 |= i16;
                }
                if ((i15 & Token.EXPR_VOID) != 146) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (rv4Var7.U(i15 & 1, z9)) {
                    kb6 kb6Var = (kb6) list.get(intValue13);
                    rv4Var7.e0(1113038230);
                    String str6 = kb6Var.a;
                    String str7 = kb6Var.b;
                    boolean f7 = rv4Var7.f(kb6Var);
                    Object P6 = rv4Var7.P();
                    if (f7 || P6 == obj6) {
                        String j3 = rs8.j(str7, '_', '-');
                        if (j3.length() == 0 || j3.equalsIgnoreCase("und")) {
                            j3 = null;
                        }
                        if (j3 == null) {
                            mv6Var = null;
                        } else {
                            try {
                                gs9Var = new mv6(xve.c(j3));
                            } catch (Throwable th) {
                                gs9Var = new gs9(th);
                            }
                            if (gs9Var instanceof gs9) {
                                gs9Var = null;
                            }
                            mv6Var = (mv6) gs9Var;
                        }
                        if (mv6Var != null) {
                            obj5 = mv6Var.b();
                        } else {
                            obj5 = null;
                        }
                        if (obj5 == null) {
                            obj5 = "";
                        }
                        P6 = obj5;
                        rv4Var7.o0(P6);
                    }
                    String str8 = (String) P6;
                    kb6 kb6Var2 = ((wb6) obj7).a;
                    if (kb6Var2 != null) {
                        str = kb6Var2.b;
                    }
                    boolean equals4 = str7.equals(str);
                    nq7 r = vye.r(rv4Var7, yf6.a(yf6Var2, pna.f(kq7Var, 1.0f)));
                    boolean f8 = rv4Var7.f(xt4Var4) | rv4Var7.h(kb6Var);
                    Object P7 = rv4Var7.P();
                    if (f8 || P7 == obj6) {
                        P7 = new y74(11, xt4Var4, kb6Var);
                        rv4Var7.o0(P7);
                    }
                    l0e.m(str6, str8, r, false, equals4, (xt4) P7, rv4Var7, 0, 8);
                    rv4Var7.q(false);
                } else {
                    rv4Var7.X();
                }
                return pvcVar;
            case 7:
                yf6 yf6Var3 = (yf6) obj;
                int intValue15 = ((Number) obj2).intValue();
                rv4 rv4Var8 = (rv4) obj3;
                int intValue16 = ((Number) obj4).intValue();
                qra qraVar = (qra) obj7;
                String str9 = (String) obj8;
                if ((intValue16 & 6) == 0) {
                    if (rv4Var8.f(yf6Var3)) {
                        i30 = 4;
                    }
                    i17 = intValue16 | i30;
                } else {
                    i17 = intValue16;
                }
                if ((intValue16 & 48) == 0) {
                    if (rv4Var8.d(intValue15)) {
                        i18 = 32;
                    } else {
                        i18 = 16;
                    }
                    i17 |= i18;
                }
                if ((i17 & Token.EXPR_VOID) != 146) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (rv4Var8.U(i17 & 1, z10)) {
                    vl6 vl6Var = (vl6) list.get(intValue15);
                    rv4Var8.e0(-1642569530);
                    Boolean bool = (Boolean) qraVar.get(vl6Var.a);
                    if (bool != null) {
                        contains = bool.booleanValue();
                    } else {
                        contains = vl6Var.g.contains(str9);
                    }
                    boolean h = rv4Var8.h(vl6Var) | rv4Var8.f(str9) | rv4Var8.g(contains);
                    Object P8 = rv4Var8.P();
                    if (h || P8 == obj6) {
                        P8 = new xd7(vl6Var, str9, contains, qraVar);
                        rv4Var8.o0(P8);
                    }
                    tc4.b(vl6Var, contains, null, (vt4) P8, rv4Var8, 0);
                    rv4Var8.q(false);
                } else {
                    rv4Var8.X();
                }
                return pvcVar;
            case 8:
                xg6 xg6Var6 = (xg6) obj;
                int intValue17 = ((Number) obj2).intValue();
                rv4 rv4Var9 = (rv4) obj3;
                int intValue18 = ((Number) obj4).intValue();
                if ((intValue18 & 6) == 0) {
                    if (rv4Var9.f(xg6Var6)) {
                        i30 = 4;
                    }
                    i19 = intValue18 | i30;
                } else {
                    i19 = intValue18;
                }
                if ((intValue18 & 48) == 0) {
                    if (rv4Var9.d(intValue17)) {
                        i20 = 32;
                    } else {
                        i20 = 16;
                    }
                    i19 |= i20;
                }
                if ((i19 & Token.EXPR_VOID) == 146) {
                    z15 = false;
                }
                if (rv4Var9.U(i19 & 1, z15)) {
                    nc9 nc9Var = (nc9) list.get(intValue17);
                    rv4Var9.e0(-1035466022);
                    vqe.p(xg6Var6, (vo9) obj7, Long.valueOf(nc9Var.a), null, false, null, jce.E(1883130891, new ck7(nc9Var, (eo3) obj8, intValue17), rv4Var9), rv4Var9, (i19 & 14) | 1572864, 28);
                    rv4Var9.q(false);
                } else {
                    rv4Var9.X();
                }
                return pvcVar;
            case 9:
                xg6 xg6Var7 = (xg6) obj;
                int intValue19 = ((Number) obj2).intValue();
                rv4 rv4Var10 = (rv4) obj3;
                int intValue20 = ((Number) obj4).intValue();
                lu4 lu4Var = (lu4) obj8;
                if ((intValue20 & 6) == 0) {
                    if (rv4Var10.f(xg6Var7)) {
                        i30 = 4;
                    }
                    i21 = intValue20 | i30;
                } else {
                    i21 = intValue20;
                }
                if ((intValue20 & 48) == 0) {
                    if (rv4Var10.d(intValue19)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i21 |= i22;
                }
                if ((i21 & Token.EXPR_VOID) != 146) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (rv4Var10.U(i21 & 1, z11)) {
                    u2c u2cVar = (u2c) list.get(intValue19);
                    rv4Var10.e0(-186558587);
                    boolean equals5 = ((String) obj7).equals(u2cVar.a);
                    nq7 f9 = pna.f(kq7Var, 1.0f);
                    boolean f10 = rv4Var10.f(lu4Var) | rv4Var10.h(u2cVar);
                    Object P9 = rv4Var10.P();
                    if (f10 || P9 == obj6) {
                        P9 = new do7(lu4Var, u2cVar, 1);
                        rv4Var10.o0(P9);
                    }
                    nq7 f11 = lbe.f(15, (vt4) P9, f9, null, false);
                    if (equals5) {
                        rv4Var10.e0(-186191052);
                        j = rm1.g(((h27) rv4Var10.j(j27.a)).a, 1.0f);
                        rv4Var10.q(false);
                    } else {
                        rv4Var10.e0(-185999999);
                        rv4Var10.q(false);
                        j = zl1.h;
                    }
                    s9e.b(equals5, u2cVar, zbe.z(nmd.v(f11, j, lre.g), 24.0f, 4.0f), rv4Var10, 0);
                    rv4Var10.q(false);
                } else {
                    rv4Var10.X();
                }
                return pvcVar;
            case 10:
                xg6 xg6Var8 = (xg6) obj;
                int intValue21 = ((Number) obj2).intValue();
                rv4 rv4Var11 = (rv4) obj3;
                int intValue22 = ((Number) obj4).intValue();
                cz7 cz7Var = (cz7) obj8;
                t58 t58Var = (t58) obj7;
                if ((intValue22 & 6) == 0) {
                    if (rv4Var11.f(xg6Var8)) {
                        i30 = 4;
                    }
                    i23 = intValue22 | i30;
                } else {
                    i23 = intValue22;
                }
                if ((intValue22 & 48) == 0) {
                    if (rv4Var11.d(intValue21)) {
                        i24 = 32;
                    } else {
                        i24 = 16;
                    }
                    i23 |= i24;
                }
                if ((i23 & Token.EXPR_VOID) != 146) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (rv4Var11.U(i23 & 1, z12)) {
                    j48 j48Var = (j48) list.get(intValue21);
                    rv4Var11.e0(-47295265);
                    boolean h2 = rv4Var11.h(j48Var) | rv4Var11.f(t58Var) | rv4Var11.f(cz7Var);
                    Object P10 = rv4Var11.P();
                    if (h2 || P10 == obj6) {
                        P10 = new sd0(4, j48Var, t58Var, cz7Var);
                        rv4Var11.o0(P10);
                    }
                    cbe.c(j48Var, (vt4) P10, rv4Var11, 8);
                    rv4Var11.q(false);
                } else {
                    rv4Var11.X();
                }
                return pvcVar;
            case 11:
                xg6 xg6Var9 = (xg6) obj;
                int intValue23 = ((Number) obj2).intValue();
                rv4 rv4Var12 = (rv4) obj3;
                int intValue24 = ((Number) obj4).intValue();
                cz7 cz7Var2 = (cz7) obj7;
                if ((intValue24 & 6) == 0) {
                    if (rv4Var12.f(xg6Var9)) {
                        i30 = 4;
                    }
                    i25 = intValue24 | i30;
                } else {
                    i25 = intValue24;
                }
                if ((intValue24 & 48) == 0) {
                    if (rv4Var12.d(intValue23)) {
                        i26 = 32;
                    } else {
                        i26 = 16;
                    }
                    i25 |= i26;
                }
                if ((i25 & Token.EXPR_VOID) != 146) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (rv4Var12.U(i25 & 1, z13)) {
                    j62 j62Var2 = (j62) list.get(intValue23);
                    rv4Var12.e0(2072388366);
                    nq7 v3 = nmd.v(tte.k(pna.f(kq7Var, 1.0f), fbe.x(intValue23, ((u99) ((aw7) obj8).getValue()).f.size(), rv4Var12)), rm1.g(((h27) rv4Var12.j(j27.a)).a, 1.0f), lre.g);
                    boolean f12 = rv4Var12.f(cz7Var2) | rv4Var12.h(j62Var2);
                    Object P11 = rv4Var12.P();
                    if (f12 || P11 == obj6) {
                        P11 = new w7(24, cz7Var2, j62Var2);
                        rv4Var12.o0(P11);
                    }
                    jbe.e(j62Var2, v3, (vt4) P11, rv4Var12, 8);
                    rv4Var12.q(false);
                } else {
                    rv4Var12.X();
                }
                return pvcVar;
            default:
                xg6 xg6Var10 = (xg6) obj;
                int intValue25 = ((Number) obj2).intValue();
                rv4 rv4Var13 = (rv4) obj3;
                int intValue26 = ((Number) obj4).intValue();
                loa loaVar = (loa) obj8;
                if ((intValue26 & 6) == 0) {
                    if (rv4Var13.f(xg6Var10)) {
                        i30 = 4;
                    }
                    i27 = intValue26 | i30;
                } else {
                    i27 = intValue26;
                }
                if ((intValue26 & 48) == 0) {
                    if (rv4Var13.d(intValue25)) {
                        i28 = 32;
                    } else {
                        i28 = 16;
                    }
                    i27 |= i28;
                }
                if ((i27 & Token.EXPR_VOID) != 146) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (rv4Var13.U(i27 & 1, z14)) {
                    ioa ioaVar = (ioa) list.get(intValue25);
                    rv4Var13.e0(925150275);
                    String str10 = ioaVar.a;
                    String str11 = ((xoa) obj7).e;
                    if (str11 == null) {
                        equals = false;
                    } else {
                        equals = str10.equals(str11);
                    }
                    boolean h3 = rv4Var13.h(ioaVar) | rv4Var13.h(loaVar);
                    Object P12 = rv4Var13.P();
                    if (h3 || P12 == obj6) {
                        P12 = new w7(27, ioaVar, loaVar);
                        rv4Var13.o0(P12);
                    }
                    w9e.h(ioaVar, equals, (vt4) P12, null, rv4Var13, 0);
                    rv4Var13.q(false);
                } else {
                    rv4Var13.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ ya(List list, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = list;
        this.c = obj;
        this.d = obj2;
    }
}
