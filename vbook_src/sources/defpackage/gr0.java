package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gr0  reason: default package */
/* loaded from: classes3.dex */
public final class gr0 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ xt4 e;

    public /* synthetic */ gr0(List list, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, int i) {
        this.a = i;
        this.b = list;
        this.c = xt4Var;
        this.d = xt4Var2;
        this.e = xt4Var3;
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
        boolean z5;
        int i9;
        int i10;
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14;
        boolean z7;
        int i15;
        int i16;
        int i17;
        boolean z8;
        rv4 rv4Var;
        int i18;
        int i19;
        int i20 = this.a;
        pvc pvcVar = pvc.a;
        List list = this.b;
        Object obj5 = ax1.a;
        xt4 xt4Var = this.c;
        xt4 xt4Var2 = this.d;
        xt4 xt4Var3 = this.e;
        kq7 kq7Var = kq7.a;
        switch (i20) {
            case 0:
                Object obj6 = (yj6) obj;
                int intValue = ((Number) obj2).intValue();
                rv4 rv4Var2 = (rv4) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var2.f(obj6)) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                    i = intValue2 | i3;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
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
                    tq0 tq0Var = (tq0) list.get(intValue);
                    rv4Var2.e0(-32777665);
                    nq7 f = pna.f(kq7Var, 1.0f);
                    f99 f99Var = j27.a;
                    nq7 k = tte.k(f, ((h27) rv4Var2.j(f99Var)).c.d);
                    boolean f2 = rv4Var2.f(xt4Var) | rv4Var2.h(tq0Var);
                    Object P = rv4Var2.P();
                    if (f2 || P == obj5) {
                        P = new fr0(xt4Var, tq0Var, 0);
                        rv4Var2.o0(P);
                    }
                    nq7 y = zbe.y(nmd.v(lbe.f(15, (vt4) P, k, null, false), rm1.g(((h27) rv4Var2.j(f99Var)).a, 2.0f), lre.g), 14.0f);
                    boolean f3 = rv4Var2.f(xt4Var2) | rv4Var2.h(tq0Var);
                    Object P2 = rv4Var2.P();
                    if (f3 || P2 == obj5) {
                        P2 = new fr0(xt4Var2, tq0Var, 1);
                        rv4Var2.o0(P2);
                    }
                    vt4 vt4Var = (vt4) P2;
                    boolean f4 = rv4Var2.f(xt4Var3) | rv4Var2.h(tq0Var);
                    Object P3 = rv4Var2.P();
                    if (f4 || P3 == obj5) {
                        P3 = new fr0(xt4Var3, tq0Var, 2);
                        rv4Var2.o0(P3);
                    }
                    v9e.d(tq0Var, y, vt4Var, (vt4) P3, rv4Var2, 8);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 1:
                int i21 = 4;
                xg6 xg6Var = (xg6) obj;
                int intValue3 = ((Number) obj2).intValue();
                rv4 rv4Var3 = (rv4) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (!rv4Var3.f(xg6Var)) {
                        i21 = 2;
                    }
                    i4 = intValue4 | i21;
                } else {
                    i4 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (rv4Var3.d(intValue3)) {
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
                if (rv4Var3.U(i4 & 1, z2)) {
                    String str = (String) list.get(intValue3);
                    rv4Var3.e0(1458690951);
                    nq7 f5 = pna.f(kq7Var, 1.0f);
                    boolean f6 = rv4Var3.f(xt4Var) | rv4Var3.f(str);
                    Object P4 = rv4Var3.P();
                    if (f6 || P4 == obj5) {
                        P4 = new vw5(0, xt4Var, str);
                        rv4Var3.o0(P4);
                    }
                    nq7 z9 = zbe.z(lbe.f(15, (vt4) P4, f5, null, false), 24.0f, 8.0f);
                    boolean f7 = rv4Var3.f(xt4Var2) | rv4Var3.f(str);
                    Object P5 = rv4Var3.P();
                    if (f7 || P5 == obj5) {
                        P5 = new vw5(1, xt4Var2, str);
                        rv4Var3.o0(P5);
                    }
                    vt4 vt4Var2 = (vt4) P5;
                    boolean f8 = rv4Var3.f(xt4Var3) | rv4Var3.f(str);
                    Object P6 = rv4Var3.P();
                    if (f8 || P6 == obj5) {
                        P6 = new vw5(2, xt4Var3, str);
                        rv4Var3.o0(P6);
                    }
                    aze.g(0, vt4Var2, (vt4) P6, rv4Var3, z9, str);
                    rv4Var3.q(false);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 2:
                int i22 = 4;
                xg6 xg6Var2 = (xg6) obj;
                int intValue5 = ((Number) obj2).intValue();
                rv4 rv4Var4 = (rv4) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    if (!rv4Var4.f(xg6Var2)) {
                        i22 = 2;
                    }
                    i6 = intValue6 | i22;
                } else {
                    i6 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    if (rv4Var4.d(intValue5)) {
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
                if (rv4Var4.U(i6 & 1, z3)) {
                    uv0 uv0Var = (uv0) list.get(intValue5);
                    rv4Var4.e0(-2132820669);
                    nq7 f9 = pna.f(kq7Var, 1.0f);
                    boolean f10 = rv4Var4.f(xt4Var) | rv4Var4.h(uv0Var);
                    Object P7 = rv4Var4.P();
                    if (f10 || P7 == obj5) {
                        P7 = new zv0(xt4Var, uv0Var, 1);
                        rv4Var4.o0(P7);
                    }
                    nq7 z10 = zbe.z(lbe.f(15, (vt4) P7, f9, null, false), 24.0f, 8.0f);
                    boolean f11 = rv4Var4.f(xt4Var2) | rv4Var4.h(uv0Var);
                    Object P8 = rv4Var4.P();
                    if (f11 || P8 == obj5) {
                        P8 = new zv0(xt4Var2, uv0Var, 2);
                        rv4Var4.o0(P8);
                    }
                    vt4 vt4Var3 = (vt4) P8;
                    boolean f12 = rv4Var4.f(xt4Var3) | rv4Var4.h(uv0Var);
                    Object P9 = rv4Var4.P();
                    if (f12 || P9 == obj5) {
                        P9 = new zv0(xt4Var3, uv0Var, 3);
                        rv4Var4.o0(P9);
                    }
                    aze.b(uv0Var, z10, vt4Var3, (vt4) P9, rv4Var4, 0);
                    rv4Var4.q(false);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            case 3:
                xg6 xg6Var3 = (xg6) obj;
                int intValue7 = ((Number) obj2).intValue();
                rv4 rv4Var5 = (rv4) obj3;
                int intValue8 = ((Number) obj4).intValue();
                if ((intValue8 & 6) == 0) {
                    if (rv4Var5.f(xg6Var3)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    i8 = intValue8 | i10;
                } else {
                    i8 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    if (rv4Var5.d(intValue7)) {
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
                if (rv4Var5.U(i8 & 1, z4)) {
                    l54 l54Var = (l54) list.get(intValue7);
                    rv4Var5.e0(-718473785);
                    if (intValue7 == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    nq7 a = xg6.a(xg6Var3, pna.f(kq7Var, 1.0f));
                    boolean f13 = rv4Var5.f(xt4Var) | rv4Var5.h(l54Var);
                    Object P10 = rv4Var5.P();
                    if (f13 || P10 == obj5) {
                        P10 = new bw0(xt4Var, l54Var, 7);
                        rv4Var5.o0(P10);
                    }
                    vt4 vt4Var4 = (vt4) P10;
                    boolean f14 = rv4Var5.f(xt4Var2) | rv4Var5.h(l54Var);
                    Object P11 = rv4Var5.P();
                    if (f14 || P11 == obj5) {
                        P11 = new bw0(xt4Var2, l54Var, 8);
                        rv4Var5.o0(P11);
                    }
                    vt4 vt4Var5 = (vt4) P11;
                    boolean f15 = rv4Var5.f(xt4Var3) | rv4Var5.h(l54Var);
                    Object P12 = rv4Var5.P();
                    if (f15 || P12 == obj5) {
                        P12 = new bw0(xt4Var3, l54Var, 9);
                        rv4Var5.o0(P12);
                    }
                    y9e.b(z5, l54Var, a, vt4Var4, vt4Var5, (vt4) P12, rv4Var5, 0);
                    rv4Var5.q(false);
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
            case 4:
                xg6 xg6Var4 = (xg6) obj;
                int intValue9 = ((Number) obj2).intValue();
                rv4 rv4Var6 = (rv4) obj3;
                int intValue10 = ((Number) obj4).intValue();
                if ((intValue10 & 6) == 0) {
                    if (rv4Var6.f(xg6Var4)) {
                        i13 = 4;
                    } else {
                        i13 = 2;
                    }
                    i11 = intValue10 | i13;
                } else {
                    i11 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    if (rv4Var6.d(intValue9)) {
                        i12 = 32;
                    } else {
                        i12 = 16;
                    }
                    i11 |= i12;
                }
                if ((i11 & Token.EXPR_VOID) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (rv4Var6.U(i11 & 1, z6)) {
                    String str2 = (String) list.get(intValue9);
                    rv4Var6.e0(-656991884);
                    nq7 f16 = pna.f(kq7Var, 1.0f);
                    boolean f17 = rv4Var6.f(xt4Var) | rv4Var6.f(str2);
                    Object P13 = rv4Var6.P();
                    if (f17 || P13 == obj5) {
                        P13 = new vw5(3, xt4Var, str2);
                        rv4Var6.o0(P13);
                    }
                    nq7 z11 = zbe.z(lbe.f(15, (vt4) P13, f16, null, false), 24.0f, 8.0f);
                    boolean f18 = rv4Var6.f(xt4Var2) | rv4Var6.f(str2);
                    Object P14 = rv4Var6.P();
                    if (f18 || P14 == obj5) {
                        P14 = new vw5(4, xt4Var2, str2);
                        rv4Var6.o0(P14);
                    }
                    vt4 vt4Var6 = (vt4) P14;
                    boolean f19 = rv4Var6.f(xt4Var3) | rv4Var6.f(str2);
                    Object P15 = rv4Var6.P();
                    if (f19 || P15 == obj5) {
                        P15 = new vw5(5, xt4Var3, str2);
                        rv4Var6.o0(P15);
                    }
                    wq9.m(0, vt4Var6, (vt4) P15, rv4Var6, z11, str2);
                    rv4Var6.q(false);
                } else {
                    rv4Var6.X();
                }
                return pvcVar;
            case 5:
                xg6 xg6Var5 = (xg6) obj;
                int intValue11 = ((Number) obj2).intValue();
                rv4 rv4Var7 = (rv4) obj3;
                int intValue12 = ((Number) obj4).intValue();
                if ((intValue12 & 6) == 0) {
                    if (rv4Var7.f(xg6Var5)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i14 = intValue12 | i16;
                } else {
                    i14 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    if (rv4Var7.d(intValue11)) {
                        i15 = 32;
                    } else {
                        i15 = 16;
                    }
                    i14 |= i15;
                }
                int i23 = i14;
                if ((i23 & Token.EXPR_VOID) != 146) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (rv4Var7.U(i23 & 1, z7)) {
                    pc9 pc9Var = (pc9) list.get(intValue11);
                    rv4Var7.e0(-822868043);
                    nq7 z12 = zbe.z(xg6.a(xg6Var5, pna.f(kq7Var, 1.0f)), 8.0f, 4.0f);
                    boolean f20 = rv4Var7.f(xt4Var) | rv4Var7.h(pc9Var);
                    Object P16 = rv4Var7.P();
                    if (f20 || P16 == obj5) {
                        P16 = new nj7(xt4Var, pc9Var, 0);
                        rv4Var7.o0(P16);
                    }
                    vt4 vt4Var7 = (vt4) P16;
                    boolean f21 = rv4Var7.f(xt4Var2) | rv4Var7.h(pc9Var);
                    Object P17 = rv4Var7.P();
                    if (f21 || P17 == obj5) {
                        P17 = new nj7(xt4Var2, pc9Var, 1);
                        rv4Var7.o0(P17);
                    }
                    vt4 vt4Var8 = (vt4) P17;
                    boolean f22 = rv4Var7.f(xt4Var3) | rv4Var7.h(pc9Var);
                    Object P18 = rv4Var7.P();
                    if (f22 || P18 == obj5) {
                        P18 = new nj7(xt4Var3, pc9Var, 2);
                        rv4Var7.o0(P18);
                    }
                    hbe.Z(pc9Var, z12, vt4Var7, vt4Var8, (vt4) P18, rv4Var7, 8);
                    rv4Var7.q(false);
                } else {
                    rv4Var7.X();
                }
                return pvcVar;
            default:
                xg6 xg6Var6 = (xg6) obj;
                int intValue13 = ((Number) obj2).intValue();
                rv4 rv4Var8 = (rv4) obj3;
                int intValue14 = ((Number) obj4).intValue();
                if ((intValue14 & 6) == 0) {
                    if (rv4Var8.f(xg6Var6)) {
                        i19 = 4;
                    } else {
                        i19 = 2;
                    }
                    i17 = intValue14 | i19;
                } else {
                    i17 = intValue14;
                }
                if ((intValue14 & 48) == 0) {
                    if (rv4Var8.d(intValue13)) {
                        i18 = 32;
                    } else {
                        i18 = 16;
                    }
                    i17 |= i18;
                }
                int i24 = i17;
                if ((i24 & Token.EXPR_VOID) != 146) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (rv4Var8.U(i24 & 1, z8)) {
                    pmb pmbVar = (pmb) list.get(intValue13);
                    rv4Var8.e0(-1868770680);
                    if (pmbVar.e == 0) {
                        rv4Var8.e0(-1868753724);
                        nq7 z13 = zbe.z(xg6.a(xg6Var6, pna.f(kq7Var, 1.0f)), 20.0f, 4.0f);
                        boolean f23 = rv4Var8.f(xt4Var) | rv4Var8.h(pmbVar);
                        Object P19 = rv4Var8.P();
                        if (f23 || P19 == obj5) {
                            P19 = new xmb(xt4Var, pmbVar, 0);
                            rv4Var8.o0(P19);
                        }
                        vt4 vt4Var9 = (vt4) P19;
                        boolean f24 = rv4Var8.f(xt4Var2) | rv4Var8.h(pmbVar);
                        Object P20 = rv4Var8.P();
                        if (f24 || P20 == obj5) {
                            P20 = new xmb(xt4Var2, pmbVar, 1);
                            rv4Var8.o0(P20);
                        }
                        xxe.c(pmbVar, z13, vt4Var9, (vt4) P20, rv4Var8, 0);
                        rv4Var = rv4Var8;
                        rv4Var.q(false);
                    } else {
                        rv4Var = rv4Var8;
                        rv4Var.e0(-1868176783);
                        nq7 z14 = zbe.z(xg6.a(xg6Var6, pna.f(kq7Var, 1.0f)), 20.0f, 4.0f);
                        boolean f25 = rv4Var.f(xt4Var) | rv4Var.h(pmbVar);
                        Object P21 = rv4Var.P();
                        if (f25 || P21 == obj5) {
                            P21 = new xmb(xt4Var, pmbVar, 2);
                            rv4Var.o0(P21);
                        }
                        vt4 vt4Var10 = (vt4) P21;
                        boolean f26 = rv4Var.f(xt4Var3) | rv4Var.h(pmbVar);
                        Object P22 = rv4Var.P();
                        if (f26 || P22 == obj5) {
                            P22 = new xmb(xt4Var3, pmbVar, 3);
                            rv4Var.o0(P22);
                        }
                        vt4 vt4Var11 = (vt4) P22;
                        boolean f27 = rv4Var.f(xt4Var2) | rv4Var.h(pmbVar);
                        Object P23 = rv4Var.P();
                        if (f27 || P23 == obj5) {
                            P23 = new xmb(xt4Var2, pmbVar, 4);
                            rv4Var.o0(P23);
                        }
                        xxe.k(pmbVar, z14, vt4Var10, vt4Var11, (vt4) P23, rv4Var, 0);
                        rv4Var.q(false);
                    }
                    rv4Var.q(false);
                } else {
                    rv4Var8.X();
                }
                return pvcVar;
        }
    }
}
