package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: td0  reason: default package */
/* loaded from: classes3.dex */
public final class td0 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public td0(List list, aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3) {
        this.a = 7;
        this.b = list;
        this.c = aw7Var;
        this.d = aw7Var2;
        this.e = aw7Var3;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        yf6 yf6Var = (yf6) obj;
        int intValue = ((Number) obj2).intValue();
        rv4 rv4Var = (rv4) obj3;
        int intValue2 = ((Number) obj4).intValue();
        lu4 lu4Var = (lu4) this.c;
        if ((intValue2 & 6) == 0) {
            if (rv4Var.f(yf6Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue2;
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
            x8b x8bVar = (x8b) ((List) this.b).get(intValue);
            rv4Var.e0(502816960);
            String str = (String) this.d;
            String str2 = x8bVar.b;
            String str3 = x8bVar.c;
            nq7 A = zbe.A(zbe.C(pna.f(kq7.a, 1.0f), nae.e, 16.0f, nae.e, nae.e, 13), 16.0f, nae.e, 2);
            tza tzaVar = j27.a;
            nq7 A2 = zbe.A(zbe.C(nmd.v(tte.k(A, ((h27) rv4Var.j(tzaVar)).c.d), rm1.g(((h27) rv4Var.j(tzaVar)).a, 2.0f), lre.g), nae.e, 16.0f, nae.e, nae.e, 13), 16.0f, nae.e, 2);
            xt4 xt4Var = (xt4) this.e;
            boolean f = rv4Var.f(lu4Var) | rv4Var.h(x8bVar);
            Object P = rv4Var.P();
            if (f || P == ax1.a) {
                P = new jua(lu4Var, x8bVar, 0);
                rv4Var.o0(P);
            }
            obe.g(str, str2, str3, A2, xt4Var, (vt4) P, rv4Var, 0);
            rv4Var.q(false);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        Object obj5 = (xg6) obj;
        int intValue = ((Number) obj2).intValue();
        rv4 rv4Var = (rv4) obj3;
        int intValue2 = ((Number) obj4).intValue();
        xt4 xt4Var = (xt4) this.c;
        if ((intValue2 & 6) == 0) {
            if (rv4Var.f(obj5)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue2;
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
            vl6 vl6Var = (vl6) ((List) this.b).get(intValue);
            rv4Var.e0(1105576382);
            qq0 qq0Var = ((c0b) this.d).e;
            wza wzaVar = (wza) this.e;
            boolean f = rv4Var.f(xt4Var) | rv4Var.h(vl6Var);
            Object P = rv4Var.P();
            if (f || P == ax1.a) {
                P = new wfa(xt4Var, vl6Var, 2);
                rv4Var.o0(P);
            }
            owe.b(vl6Var, qq0Var, wzaVar, (vt4) P, rv4Var, 0);
            rv4Var.q(false);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        int i7;
        boolean z5;
        boolean z6;
        int i8;
        int i9;
        int i10;
        boolean z7;
        boolean z8;
        int i11;
        int i12;
        boolean z9;
        int i13;
        int i14;
        boolean z10;
        int i15;
        int i16;
        boolean z11;
        boolean z12;
        long g;
        boolean z13;
        int i17;
        int i18;
        int i19;
        boolean z14;
        boolean z15;
        int i20;
        int i21;
        int i22;
        boolean z16;
        int i23;
        int i24;
        boolean z17;
        int i25;
        int i26;
        boolean z18;
        int i27;
        int i28;
        boolean z19;
        int i29;
        int i30 = this.a;
        kq7 kq7Var = kq7.a;
        Object obj5 = ax1.a;
        pvc pvcVar = pvc.a;
        Object obj6 = this.c;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.b;
        int i31 = 2;
        switch (i30) {
            case 0:
                Object obj10 = (xg6) obj;
                int intValue = ((Number) obj2).intValue();
                rv4 rv4Var = (rv4) obj3;
                int intValue2 = ((Number) obj4).intValue();
                Object obj11 = (sk1) obj7;
                ud0 ud0Var = (ud0) obj8;
                if ((intValue2 & 6) == 0) {
                    if (rv4Var.f(obj10)) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                    i = intValue2 | i3;
                } else {
                    i = intValue2;
                }
                if ((48 & intValue2) == 0) {
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
                    ht1 ht1Var = (ht1) ((List) obj9).get(intValue);
                    rv4Var.e0(-502555362);
                    if (intValue == ud0Var.b.h()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    xo3 xo3Var = (xo3) ((aw7) obj6).getValue();
                    boolean f = rv4Var.f(obj11) | rv4Var.h(ht1Var) | rv4Var.h(ud0Var);
                    Object P = rv4Var.P();
                    if (!f && P != obj5) {
                        z3 = false;
                    } else {
                        z3 = false;
                        P = new sd0(0, obj11, ht1Var, ud0Var);
                        rv4Var.o0(P);
                    }
                    jxe.a(ht1Var, z2, xo3Var, (vt4) P, rv4Var, 0);
                    rv4Var.q(z3);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                xg6 xg6Var = (xg6) obj;
                int intValue3 = ((Number) obj2).intValue();
                rv4 rv4Var2 = (rv4) obj3;
                int intValue4 = ((Number) obj4).intValue();
                cg1 cg1Var = (cg1) obj8;
                if ((intValue4 & 6) == 0) {
                    if (rv4Var2.f(xg6Var)) {
                        i6 = 4;
                    } else {
                        i6 = 2;
                    }
                    i4 = intValue4 | i6;
                } else {
                    i4 = intValue4;
                }
                if ((48 & intValue4) == 0) {
                    if (rv4Var2.d(intValue3)) {
                        i5 = 32;
                    } else {
                        i5 = 16;
                    }
                    i4 |= i5;
                }
                if ((i4 & Token.EXPR_VOID) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var2.U(i4 & 1, z4)) {
                    o62 o62Var = (o62) ((List) obj9).get(intValue3);
                    rv4Var2.e0(-1208353851);
                    String str = cg1Var.g;
                    boolean z20 = cg1Var.p;
                    String str2 = cg1Var.q;
                    boolean equals = cg1Var.A.equals(o62Var.a.a);
                    boolean z21 = cg1Var.t;
                    boolean h = rv4Var2.h(o62Var);
                    Object P2 = rv4Var2.P();
                    if (h || P2 == obj5) {
                        P2 = new w7(4, o62Var, (aw7) obj6);
                        rv4Var2.o0(P2);
                    }
                    hma.d(o62Var, str, z20, str2, z21, equals, (vt4) P2, (xt4) obj7, rv4Var2, 8);
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
                aw7 aw7Var = (aw7) obj6;
                if ((intValue6 & 6) == 0) {
                    if (rv4Var3.f(xg6Var2)) {
                        i9 = 4;
                    } else {
                        i9 = 2;
                    }
                    i7 = intValue6 | i9;
                } else {
                    i7 = intValue6;
                }
                if ((48 & intValue6) == 0) {
                    if (rv4Var3.d(intValue5)) {
                        i8 = 32;
                    } else {
                        i8 = 16;
                    }
                    i7 |= i8;
                }
                if ((i7 & Token.EXPR_VOID) != 146) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (rv4Var3.U(i7 & 1, z5)) {
                    m32 m32Var = (m32) ((List) obj9).get(intValue5);
                    rv4Var3.e0(241903622);
                    if (intValue5 == tl1.x((List) aw7Var.getValue())) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    vqe.p(xg6Var2, (vo9) obj8, m32Var.a, null, false, null, jce.E(-1013362810, new z32(m32Var, z6, (xt4) obj7, aw7Var), rv4Var3), rv4Var3, (i7 & 14) | 1572864, 28);
                    rv4Var3.q(false);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 3:
                yj6 yj6Var = (yj6) obj;
                int intValue7 = ((Number) obj2).intValue();
                rv4 rv4Var4 = (rv4) obj3;
                int intValue8 = ((Number) obj4).intValue();
                xt4 xt4Var = (xt4) obj7;
                xt4 xt4Var2 = (xt4) obj8;
                if ((intValue8 & 6) == 0) {
                    if (rv4Var4.f(yj6Var)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i10 = intValue8 | i12;
                } else {
                    i10 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    if (rv4Var4.d(intValue7)) {
                        i11 = 32;
                    } else {
                        i11 = 16;
                    }
                    i10 |= i11;
                }
                if ((i10 & Token.EXPR_VOID) != 146) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (rv4Var4.U(i10 & 1, z7)) {
                    n93 n93Var = (n93) ((List) obj9).get(intValue7);
                    rv4Var4.e0(-1994672496);
                    nq7 f2 = pna.f(kq7Var, 1.0f);
                    tza tzaVar = j27.a;
                    nq7 v = nmd.v(tte.k(f2, ((h27) rv4Var4.j(tzaVar)).c.d), rm1.g(((h27) rv4Var4.j(tzaVar)).a, 2.0f), lre.g);
                    boolean f3 = rv4Var4.f(xt4Var2) | rv4Var4.h(n93Var);
                    Object P3 = rv4Var4.P();
                    if (!f3 && P3 != obj5) {
                        z8 = false;
                    } else {
                        z8 = false;
                        P3 = new s93(xt4Var2, n93Var, 0);
                        rv4Var4.o0(P3);
                    }
                    nq7 y = zbe.y(lbe.f(15, (vt4) P3, v, null, z8), 14.0f);
                    boolean f4 = rv4Var4.f(xt4Var) | rv4Var4.h(n93Var);
                    Object P4 = rv4Var4.P();
                    if (f4 || P4 == obj5) {
                        P4 = new s93(xt4Var, n93Var, 1);
                        rv4Var4.o0(P4);
                    }
                    fre.e(n93Var, y, (vt4) P4, (lu4) obj6, rv4Var4, 8);
                    rv4Var4.q(false);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            case 4:
                do9 do9Var = (do9) obj;
                ((Boolean) obj2).getClass();
                rv4 rv4Var5 = (rv4) obj3;
                int intValue9 = ((Number) obj4).intValue();
                lu4 lu4Var = (lu4) obj9;
                kd3 kd3Var = (kd3) obj8;
                do9Var.getClass();
                if ((intValue9 & 6) == 0) {
                    if (rv4Var5.f(do9Var)) {
                        i13 = 4;
                    } else {
                        i13 = 2;
                    }
                    intValue9 |= i13;
                }
                if ((intValue9 & Token.DO) != 130) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (rv4Var5.U(intValue9 & 1, z9)) {
                    nq7 f5 = pna.f(kq7Var, 1.0f);
                    boolean f6 = rv4Var5.f(lu4Var) | rv4Var5.h(kd3Var);
                    Object P5 = rv4Var5.P();
                    if (f6 || P5 == obj5) {
                        P5 = new w7(9, lu4Var, kd3Var);
                        rv4Var5.o0(P5);
                    }
                    nq7 z22 = zbe.z(lbe.f(15, (vt4) P5, f5, null, false), 12.0f, 8.0f);
                    xt4 xt4Var3 = (xt4) obj7;
                    aw7 aw7Var2 = (aw7) obj6;
                    gv9 a = ev9.a(lz.a, kh5.G, rv4Var5, 48);
                    int hashCode = Long.hashCode(rv4Var5.T);
                    xt8 l = rv4Var5.l();
                    nq7 p = lye.p(rv4Var5, z22);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var5.i0();
                    if (rv4Var5.S) {
                        rv4Var5.k(zx1Var);
                    } else {
                        rv4Var5.r0();
                    }
                    np npVar = qw1.f;
                    jce.F(npVar, rv4Var5, a);
                    np npVar2 = qw1.e;
                    jce.F(npVar2, rv4Var5, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    np npVar3 = qw1.g;
                    jce.F(npVar3, rv4Var5, valueOf);
                    kg kgVar = qw1.h;
                    jce.C(kgVar, rv4Var5);
                    np npVar4 = qw1.d;
                    jce.F(npVar4, rv4Var5, p);
                    ar5 c = rp5.c((wk3) jk3.N.getValue(), rv4Var5, 0);
                    nq7 n = pna.n(kq7Var, 40.0f);
                    boolean f7 = rv4Var5.f(xt4Var3) | rv4Var5.f(aw7Var2);
                    Object P6 = rv4Var5.P();
                    if (f7 || P6 == obj5) {
                        P6 = new y32(1, xt4Var3, aw7Var2);
                        rv4Var5.o0(P6);
                    }
                    nk5.a(c, null, zbe.y(kqe.i(do9Var, n, (vt4) P6, 23), 8.0f), 0L, rv4Var5, 48, 8);
                    we6 d = rs8.d(kq7Var, 8.0f, rv4Var5, 1.0f, true);
                    xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var5, 0);
                    int hashCode2 = Long.hashCode(rv4Var5.T);
                    xt8 l2 = rv4Var5.l();
                    nq7 p2 = lye.p(rv4Var5, d);
                    rv4Var5.i0();
                    if (rv4Var5.S) {
                        rv4Var5.k(zx1Var);
                    } else {
                        rv4Var5.r0();
                    }
                    jce.F(npVar, rv4Var5, a2);
                    jce.F(npVar2, rv4Var5, l2);
                    s21.t(hashCode2, rv4Var5, npVar3, rv4Var5, kgVar);
                    jce.F(npVar4, rv4Var5, p2);
                    String str3 = kd3Var.b;
                    tza tzaVar2 = j27.a;
                    cvb.c(str3, pna.f(kq7Var, 1.0f), ((h27) rv4Var5.j(tzaVar2)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var5.j(tzaVar2)).b.i, rv4Var5, 48, 0, 131064);
                    xbe.i(rv4Var5, pna.h(kq7Var, 4.0f));
                    cvb.c(kd3Var.c, pna.f(kq7Var, 1.0f), ((h27) rv4Var5.j(tzaVar2)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, ((h27) rv4Var5.j(tzaVar2)).b.j, rv4Var5, 48, 384, 126968);
                    s21.x(rv4Var5, true, kq7Var, 8.0f, rv4Var5);
                    ar5 c2 = rp5.c((wk3) jk3.H.getValue(), rv4Var5, 0);
                    long j = zl1.f;
                    nq7 v2 = nmd.v(tte.k(pna.n(kq7Var, 32.0f), uu9.a), rm1.g(((h27) rv4Var5.j(tzaVar2)).a, 2.0f), lre.g);
                    boolean f8 = rv4Var5.f(aw7Var2) | rv4Var5.h(kd3Var) | rv4Var5.f(xt4Var3);
                    Object P7 = rv4Var5.P();
                    if (f8 || P7 == obj5) {
                        P7 = new sd0(1, xt4Var3, aw7Var2, kd3Var);
                        rv4Var5.o0(P7);
                    }
                    nk5.a(c2, null, zbe.y(lbe.f(15, (vt4) P7, v2, null, false), 6.0f), j, rv4Var5, 3120, 0);
                    xbe.i(rv4Var5, pna.s(kq7Var, 8.0f));
                    boolean z23 = kd3Var.d;
                    boolean f9 = rv4Var5.f(aw7Var2) | rv4Var5.h(kd3Var) | rv4Var5.f(xt4Var3);
                    Object P8 = rv4Var5.P();
                    if (f9 || P8 == obj5) {
                        P8 = new sg0(xt4Var3, aw7Var2, kd3Var, 2);
                        rv4Var5.o0(P8);
                    }
                    tte.g(z23, false, null, (xt4) P8, rv4Var5, 0, 6);
                    rv4Var5.q(true);
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
            case 5:
                yf6 yf6Var = (yf6) obj;
                int intValue10 = ((Number) obj2).intValue();
                rv4 rv4Var6 = (rv4) obj3;
                int intValue11 = ((Number) obj4).intValue();
                if ((intValue11 & 6) == 0) {
                    if (rv4Var6.f(yf6Var)) {
                        i31 = 4;
                    }
                    i14 = intValue11 | i31;
                } else {
                    i14 = intValue11;
                }
                if ((intValue11 & 48) == 0) {
                    if (rv4Var6.d(intValue10)) {
                        i15 = 32;
                    } else {
                        i15 = 16;
                    }
                    i14 |= i15;
                }
                if ((i14 & Token.EXPR_VOID) != 146) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (rv4Var6.U(i14 & 1, z10)) {
                    cia ciaVar = (cia) ((List) obj9).get(intValue10);
                    rv4Var6.e0(726234526);
                    t65 t65Var = (t65) obj8;
                    tl1.c(ciaVar, t65Var.d, t65Var.e, t65Var.f, yf6.a(yf6Var, pna.f(kq7Var, 1.0f)), (xt4) obj7, (xt4) obj6, rv4Var6, 0);
                    rv4Var6.q(false);
                } else {
                    rv4Var6.X();
                }
                return pvcVar;
            case 6:
                xg6 xg6Var3 = (xg6) obj;
                int intValue12 = ((Number) obj2).intValue();
                rv4 rv4Var7 = (rv4) obj3;
                int intValue13 = ((Number) obj4).intValue();
                xt4 xt4Var4 = (xt4) obj7;
                if ((intValue13 & 6) == 0) {
                    if (rv4Var7.f(xg6Var3)) {
                        i18 = 4;
                    } else {
                        i18 = 2;
                    }
                    i16 = intValue13 | i18;
                } else {
                    i16 = intValue13;
                }
                if ((intValue13 & 48) == 0) {
                    if (rv4Var7.d(intValue12)) {
                        i17 = 32;
                    } else {
                        i17 = 16;
                    }
                    i16 |= i17;
                }
                if ((i16 & Token.EXPR_VOID) != 146) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (rv4Var7.U(i16 & 1, z11)) {
                    mv mvVar = (mv) ((List) obj9).get(intValue12);
                    rv4Var7.e0(1904876196);
                    if (mvVar == ((mv) obj8)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    nq7 k = tte.k(zbe.A(kq7Var, 24.0f, nae.e, 2), r0f.z(rv4Var7).c);
                    if (z12) {
                        rv4Var7.e0(1905118026);
                        g = r0f.y(rv4Var7).c;
                        rv4Var7.q(false);
                    } else {
                        rv4Var7.e0(1905229533);
                        g = rm1.g(r0f.y(rv4Var7), 2.0f);
                        rv4Var7.q(false);
                    }
                    nq7 v3 = nmd.v(k, g, lre.g);
                    boolean f10 = rv4Var7.f(xt4Var4) | rv4Var7.d(mvVar.ordinal());
                    Object P9 = rv4Var7.P();
                    if (f10 || P9 == obj5) {
                        P9 = new w7(17, xt4Var4, mvVar);
                        rv4Var7.o0(P9);
                    }
                    nq7 y2 = zbe.y(lbe.f(15, (vt4) P9, v3, null, false), 10.0f);
                    gv9 a3 = ev9.a(lz.a, kh5.G, rv4Var7, 48);
                    int hashCode3 = Long.hashCode(rv4Var7.T);
                    xt8 l3 = rv4Var7.l();
                    nq7 p3 = lye.p(rv4Var7, y2);
                    rw1.k.getClass();
                    zx1 zx1Var2 = qw1.b;
                    rv4Var7.i0();
                    if (rv4Var7.S) {
                        rv4Var7.k(zx1Var2);
                    } else {
                        rv4Var7.r0();
                    }
                    jce.F(qw1.f, rv4Var7, a3);
                    jce.F(qw1.e, rv4Var7, l3);
                    jce.F(qw1.g, rv4Var7, Integer.valueOf(hashCode3));
                    jce.C(qw1.h, rv4Var7);
                    jce.F(qw1.d, rv4Var7, p3);
                    c16.b(mvVar, (String) obj6, tte.k(pna.p(kq7Var, 84.0f, 56.0f), r0f.z(rv4Var7).b), rv4Var7, 0);
                    xbe.i(rv4Var7, pna.s(kq7Var, 12.0f));
                    cvb.c(c16.j(mvVar, rv4Var7), new we6(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var7).j, rv4Var7, 0, 0, 131068);
                    if (z12) {
                        rv4Var7.e0(953710859);
                        z13 = false;
                        nk5.a(rp5.c((wk3) jk3.v.getValue(), rv4Var7, 0), null, null, r0f.y(rv4Var7).d, rv4Var7, 48, 4);
                        rv4Var7.q(false);
                    } else {
                        z13 = false;
                        rv4Var7.e0(953992432);
                        rv4Var7.q(false);
                    }
                    rv4Var7.q(true);
                    rv4Var7.q(z13);
                } else {
                    rv4Var7.X();
                }
                return pvcVar;
            case 7:
                xg6 xg6Var4 = (xg6) obj;
                int intValue14 = ((Number) obj2).intValue();
                rv4 rv4Var8 = (rv4) obj3;
                int intValue15 = ((Number) obj4).intValue();
                aw7 aw7Var3 = (aw7) obj7;
                aw7 aw7Var4 = (aw7) obj8;
                aw7 aw7Var5 = (aw7) obj6;
                if ((intValue15 & 6) == 0) {
                    if (rv4Var8.f(xg6Var4)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i19 = intValue15 | i21;
                } else {
                    i19 = intValue15;
                }
                if ((intValue15 & 48) == 0) {
                    if (rv4Var8.d(intValue14)) {
                        i20 = 32;
                    } else {
                        i20 = 16;
                    }
                    i19 |= i20;
                }
                if ((i19 & Token.EXPR_VOID) != 146) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (rv4Var8.U(i19 & 1, z14)) {
                    String str4 = (String) ((List) obj9).get(intValue14);
                    rv4Var8.e0(368646903);
                    nq7 f11 = pna.f(kq7Var, 1.0f);
                    boolean f12 = rv4Var8.f(aw7Var5) | rv4Var8.f(str4);
                    Object P10 = rv4Var8.P();
                    if (!f12 && P10 != obj5) {
                        z15 = false;
                    } else {
                        z15 = false;
                        P10 = new gf7(str4, aw7Var5, 0);
                        rv4Var8.o0(P10);
                    }
                    nq7 z24 = zbe.z(lbe.f(15, (vt4) P10, f11, null, z15), 24.0f, 8.0f);
                    boolean f13 = rv4Var8.f(aw7Var4) | rv4Var8.f(str4);
                    Object P11 = rv4Var8.P();
                    if (f13 || P11 == obj5) {
                        P11 = new gf7(str4, aw7Var4, 1);
                        rv4Var8.o0(P11);
                    }
                    vt4 vt4Var = (vt4) P11;
                    boolean f14 = rv4Var8.f(aw7Var3) | rv4Var8.f(str4);
                    Object P12 = rv4Var8.P();
                    if (f14 || P12 == obj5) {
                        P12 = new gf7(str4, aw7Var3, 2);
                        rv4Var8.o0(P12);
                    }
                    wq9.m(0, vt4Var, (vt4) P12, rv4Var8, z24, str4);
                    rv4Var8.q(false);
                } else {
                    rv4Var8.X();
                }
                return pvcVar;
            case 8:
                yf6 yf6Var2 = (yf6) obj;
                int intValue16 = ((Number) obj2).intValue();
                rv4 rv4Var9 = (rv4) obj3;
                int intValue17 = ((Number) obj4).intValue();
                xt4 xt4Var5 = (xt4) obj6;
                xt4 xt4Var6 = (xt4) obj7;
                if ((intValue17 & 6) == 0) {
                    if (rv4Var9.f(yf6Var2)) {
                        i31 = 4;
                    }
                    i22 = intValue17 | i31;
                } else {
                    i22 = intValue17;
                }
                if ((intValue17 & 48) == 0) {
                    if (rv4Var9.d(intValue16)) {
                        i23 = 32;
                    } else {
                        i23 = 16;
                    }
                    i22 |= i23;
                }
                if ((i22 & Token.EXPR_VOID) != 146) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rv4Var9.U(i22 & 1, z16)) {
                    sl5 sl5Var = (sl5) ((List) obj9).get(intValue16);
                    rv4Var9.e0(1103989511);
                    ho5 ho5Var = (ho5) obj8;
                    boolean f15 = rv4Var9.f(xt4Var6) | rv4Var9.h(sl5Var);
                    Object P13 = rv4Var9.P();
                    if (f15 || P13 == obj5) {
                        P13 = new ji7(xt4Var6, sl5Var, 0);
                        rv4Var9.o0(P13);
                    }
                    vt4 vt4Var2 = (vt4) P13;
                    boolean f16 = rv4Var9.f(xt4Var5) | rv4Var9.h(sl5Var);
                    Object P14 = rv4Var9.P();
                    if (f16 || P14 == obj5) {
                        P14 = new ji7(xt4Var5, sl5Var, 1);
                        rv4Var9.o0(P14);
                    }
                    o28.d(sl5Var, ho5Var, null, vt4Var2, (vt4) P14, rv4Var9, 0);
                    rv4Var9.q(false);
                } else {
                    rv4Var9.X();
                }
                return pvcVar;
            case 9:
                yf6 yf6Var3 = (yf6) obj;
                int intValue18 = ((Number) obj2).intValue();
                rv4 rv4Var10 = (rv4) obj3;
                int intValue19 = ((Number) obj4).intValue();
                if ((intValue19 & 6) == 0) {
                    if (rv4Var10.f(yf6Var3)) {
                        i31 = 4;
                    }
                    i24 = intValue19 | i31;
                } else {
                    i24 = intValue19;
                }
                if ((intValue19 & 48) == 0) {
                    if (rv4Var10.d(intValue18)) {
                        i25 = 32;
                    } else {
                        i25 = 16;
                    }
                    i24 |= i25;
                }
                if ((i24 & Token.EXPR_VOID) != 146) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rv4Var10.U(i24 & 1, z17)) {
                    cia ciaVar2 = (cia) ((List) obj9).get(intValue18);
                    rv4Var10.e0(1571415543);
                    aia aiaVar = (aia) obj8;
                    tl1.c(ciaVar2, aiaVar.d, aiaVar.e, aiaVar.f, yf6.a(yf6Var3, zbe.C(zbe.y(pna.f(kq7Var, 1.0f), 4.0f), nae.e, nae.e, nae.e, 4.0f, 7)), (xt4) obj7, (xt4) obj6, rv4Var10, 0);
                    rv4Var10.q(false);
                } else {
                    rv4Var10.X();
                }
                return pvcVar;
            case 10:
                yf6 yf6Var4 = (yf6) obj;
                int intValue20 = ((Number) obj2).intValue();
                rv4 rv4Var11 = (rv4) obj3;
                int intValue21 = ((Number) obj4).intValue();
                lu4 lu4Var2 = (lu4) obj6;
                if ((intValue21 & 6) == 0) {
                    if (rv4Var11.f(yf6Var4)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i26 = intValue21 | i28;
                } else {
                    i26 = intValue21;
                }
                if ((intValue21 & 48) == 0) {
                    if (rv4Var11.d(intValue20)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i26 |= i27;
                }
                if ((i26 & Token.EXPR_VOID) != 146) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (rv4Var11.U(i26 & 1, z18)) {
                    lq1 lq1Var = (lq1) ((List) obj9).get(intValue20);
                    rv4Var11.e0(1198110484);
                    String str5 = (String) obj8;
                    String str6 = lq1Var.b;
                    String str7 = lq1Var.c;
                    nq7 A = zbe.A(zbe.C(pna.f(kq7Var, 1.0f), nae.e, 16.0f, nae.e, nae.e, 13), 16.0f, nae.e, 2);
                    tza tzaVar3 = j27.a;
                    nq7 y3 = zbe.y(nmd.v(tte.k(A, ((h27) rv4Var11.j(tzaVar3)).c.d), rm1.g(((h27) rv4Var11.j(tzaVar3)).a, 2.0f), lre.g), 16.0f);
                    vt4 vt4Var3 = (vt4) obj7;
                    boolean f17 = rv4Var11.f(lu4Var2) | rv4Var11.h(lq1Var);
                    Object P15 = rv4Var11.P();
                    if (f17 || P15 == obj5) {
                        P15 = new w7(28, lu4Var2, lq1Var);
                        rv4Var11.o0(P15);
                    }
                    fbe.r(str5, str6, str7, y3, vt4Var3, (vt4) P15, rv4Var11, 0);
                    rv4Var11.q(false);
                } else {
                    rv4Var11.X();
                }
                return pvcVar;
            case 11:
                return a(obj, obj2, obj3, obj4);
            case 12:
                return b(obj, obj2, obj3, obj4);
            default:
                do9 do9Var2 = (do9) obj;
                ((Boolean) obj2).getClass();
                rv4 rv4Var12 = (rv4) obj3;
                int intValue22 = ((Number) obj4).intValue();
                do9Var2.getClass();
                if ((intValue22 & 6) == 0) {
                    if (rv4Var12.f(do9Var2)) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    intValue22 |= i29;
                }
                int i32 = intValue22;
                if ((i32 & Token.DO) != 130) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (rv4Var12.U(i32 & 1, z19)) {
                    nq7 A2 = zbe.A(pna.f(kq7Var, 1.0f), 12.0f, nae.e, 2);
                    String str8 = (String) obj9;
                    xt4 xt4Var7 = (xt4) obj8;
                    xt4 xt4Var8 = (xt4) obj7;
                    aw7 aw7Var6 = (aw7) obj6;
                    gv9 a4 = ev9.a(lz.a, kh5.G, rv4Var12, 48);
                    int hashCode4 = Long.hashCode(rv4Var12.T);
                    xt8 l4 = rv4Var12.l();
                    nq7 p4 = lye.p(rv4Var12, A2);
                    rw1.k.getClass();
                    zx1 zx1Var3 = qw1.b;
                    rv4Var12.i0();
                    if (rv4Var12.S) {
                        rv4Var12.k(zx1Var3);
                    } else {
                        rv4Var12.r0();
                    }
                    jce.F(qw1.f, rv4Var12, a4);
                    jce.F(qw1.e, rv4Var12, l4);
                    jce.F(qw1.g, rv4Var12, Integer.valueOf(hashCode4));
                    jce.C(qw1.h, rv4Var12);
                    cvb.c(str8, s21.f(rv4Var12, p4, qw1.d, 1.0f, true), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rv4Var12, 0, 0, 262140);
                    ar5 c3 = rp5.c((wk3) jk3.H.getValue(), rv4Var12, 0);
                    long j2 = zl1.f;
                    nq7 v4 = nmd.v(tte.k(pna.n(kq7Var, 40.0f), uu9.a), rm1.g(((h27) rv4Var12.j(j27.a)).a, 2.0f), lre.g);
                    boolean f18 = rv4Var12.f(xt4Var7) | rv4Var12.f(str8);
                    Object P16 = rv4Var12.P();
                    if (f18 || P16 == obj5) {
                        P16 = new vw5(6, xt4Var7, str8);
                        rv4Var12.o0(P16);
                    }
                    nk5.a(c3, null, zbe.y(lbe.f(15, (vt4) P16, v4, null, false), 8.0f), j2, rv4Var12, 3120, 0);
                    ar5 c4 = rp5.c((wk3) jk3.N.getValue(), rv4Var12, 0);
                    nq7 n2 = pna.n(kq7Var, 40.0f);
                    boolean f19 = rv4Var12.f(xt4Var8) | rv4Var12.f(aw7Var6);
                    Object P17 = rv4Var12.P();
                    if (f19 || P17 == obj5) {
                        P17 = new y32(5, xt4Var8, aw7Var6);
                        rv4Var12.o0(P17);
                    }
                    nk5.a(c4, null, zbe.y(kqe.i(do9Var2, n2, (vt4) P17, 23), 8.0f), 0L, rv4Var12, 48, 8);
                    rv4Var12.q(true);
                } else {
                    rv4Var12.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ td0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = obj4;
    }

    public td0(List list, vo9 vo9Var, aw7 aw7Var, xt4 xt4Var) {
        this.a = 2;
        this.b = list;
        this.d = vo9Var;
        this.c = aw7Var;
        this.e = xt4Var;
    }
}
