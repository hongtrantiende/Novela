package defpackage;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebView;
import java.lang.reflect.Field;
import org.mozilla.javascript.Token;
import org.publicvalue.multiplatform.oidc.appsupport.HandleRedirectActivity;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xu1 implements nu4 {
    public final /* synthetic */ int a;

    public /* synthetic */ xu1(int i) {
        this.a = i;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        boolean z5;
        int i3;
        boolean z6;
        int i4;
        boolean z7;
        boolean z8;
        int i5;
        boolean z9;
        boolean z10;
        int i6;
        boolean z11;
        boolean z12;
        boolean z13;
        int i7;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        float f;
        int i8;
        int i9 = this.a;
        kq7 kq7Var = kq7.a;
        pvc pvcVar = pvc.a;
        switch (i9) {
            case 0:
                rh8 rh8Var = (rh8) obj2;
                rv4 rv4Var = (rv4) obj3;
                int intValue = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var.getClass();
                if ((intValue & 48) == 0) {
                    if (rv4Var.f(rh8Var)) {
                        i = 32;
                    } else {
                        i = 16;
                    }
                    intValue |= i;
                }
                if ((intValue & Token.TARGET) != 144) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    fu0.a(zbe.x(pna.c, rh8Var), rv4Var, 0);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                rv4 rv4Var2 = (rv4) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((yf6) obj).getClass();
                if ((intValue2 & Token.DEFAULT) != 128) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    dpe.g(zbe.y(pna.h(pna.c, 80.0f), 4.0f), ((h27) rv4Var2.j(j27.a)).c.c, rv4Var2, 6, 0);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                rh8 rh8Var2 = (rh8) obj2;
                rv4 rv4Var3 = (rv4) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var2.getClass();
                if ((intValue3 & 48) == 0) {
                    if (rv4Var3.f(rh8Var2)) {
                        i2 = 32;
                    } else {
                        i2 = 16;
                    }
                    intValue3 |= i2;
                }
                if ((intValue3 & Token.TARGET) != 144) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var3.U(intValue3 & 1, z3)) {
                    fa3.d(zbe.x(pna.c, rh8Var2), rv4Var3, 0);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 3:
                n10 n10Var = (n10) obj2;
                rv4 rv4Var4 = (rv4) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                n10Var.getClass();
                if ((intValue4 & 48) == 0) {
                    if (rv4Var4.f(n10Var)) {
                        i3 = 32;
                    } else {
                        i3 = 16;
                    }
                    intValue4 |= i3;
                }
                if ((intValue4 & Token.TARGET) != 144) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var4.U(intValue4 & 1, z4)) {
                    ze4 ze4Var = pna.c;
                    tza tzaVar = j27.a;
                    nq7 v = nmd.v(ze4Var, rm1.g(((h27) rv4Var4.j(tzaVar)).a, 1.0f), lre.g);
                    xn1 a = wn1.a(lz.e, kh5.J, rv4Var4, 54);
                    int hashCode = Long.hashCode(rv4Var4.T);
                    xt8 l = rv4Var4.l();
                    nq7 p = lye.p(rv4Var4, v);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var4.i0();
                    if (rv4Var4.S) {
                        rv4Var4.k(zx1Var);
                    } else {
                        rv4Var4.r0();
                    }
                    jce.F(qw1.f, rv4Var4, a);
                    jce.F(qw1.e, rv4Var4, l);
                    jce.F(qw1.g, rv4Var4, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var4);
                    jce.F(qw1.d, rv4Var4, p);
                    cvb.c(yqe.A((y3b) s2b.d.getValue(), rv4Var4), zbe.y(kq7Var, 24.0f), ((h27) rv4Var4.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var4.j(tzaVar)).b.j, rv4Var4, 48, 0, 130040);
                    ar5 c = rp5.c((wk3) ok3.g0.getValue(), rv4Var4, 0);
                    String A = yqe.A((y3b) b3b.B.getValue(), rv4Var4);
                    if ((intValue4 & Token.ASSIGN_MOD) == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    Object P = rv4Var4.P();
                    if (z5 || P == ax1.a) {
                        P = new ve(n10Var, 26);
                        rv4Var4.o0(P);
                    }
                    z1d.f(c, A, false, null, null, null, null, null, (vt4) P, rv4Var4, 0, 252);
                    rv4Var4.q(true);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            case 4:
                rh8 rh8Var3 = (rh8) obj2;
                rv4 rv4Var5 = (rv4) obj3;
                int intValue5 = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var3.getClass();
                if ((intValue5 & 48) == 0) {
                    if (rv4Var5.f(rh8Var3)) {
                        i4 = 32;
                    } else {
                        i4 = 16;
                    }
                    intValue5 |= i4;
                }
                if ((intValue5 & Token.TARGET) != 144) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (rv4Var5.U(intValue5 & 1, z6)) {
                    nq7 y = zbe.y(zbe.x(pna.c, rh8Var3), 24.0f);
                    xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var5, 54);
                    int hashCode2 = Long.hashCode(rv4Var5.T);
                    xt8 l2 = rv4Var5.l();
                    nq7 p2 = lye.p(rv4Var5, y);
                    rw1.k.getClass();
                    zx1 zx1Var2 = qw1.b;
                    rv4Var5.i0();
                    if (rv4Var5.S) {
                        rv4Var5.k(zx1Var2);
                    } else {
                        rv4Var5.r0();
                    }
                    jce.F(qw1.f, rv4Var5, a2);
                    jce.F(qw1.e, rv4Var5, l2);
                    jce.F(qw1.g, rv4Var5, Integer.valueOf(hashCode2));
                    jce.C(qw1.h, rv4Var5);
                    jce.F(qw1.d, rv4Var5, p2);
                    String A2 = yqe.A((y3b) o2b.P0.getValue(), rv4Var5);
                    tza tzaVar2 = j27.a;
                    cvb.c(A2, null, ((h27) rv4Var5.j(tzaVar2)).a.q, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var5.j(tzaVar2)).b.h, rv4Var5, 0, 0, 130042);
                    rv4Var5.q(true);
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
            case 5:
                ((Integer) obj2).getClass();
                rv4 rv4Var6 = (rv4) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                ((xg6) obj).getClass();
                if ((intValue6 & Token.DEFAULT) != 128) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (rv4Var6.U(intValue6 & 1, z7)) {
                    tza tzaVar3 = j27.a;
                    w92.k(zbe.z(nmd.v(tte.k(kq7Var, ((h27) rv4Var6.j(tzaVar3)).c.a), rm1.g(((h27) rv4Var6.j(tzaVar3)).a, 1.0f), lre.g), 16.0f, 8.0f), rv4Var6, 0);
                } else {
                    rv4Var6.X();
                }
                return pvcVar;
            case 6:
                float floatValue = ((Float) obj).floatValue();
                rv4 rv4Var7 = (rv4) obj3;
                int intValue7 = ((Integer) obj4).intValue();
                ((xe0) obj2).getClass();
                if ((intValue7 & 6) == 0) {
                    if (rv4Var7.c(floatValue)) {
                        i5 = 4;
                    } else {
                        i5 = 2;
                    }
                    intValue7 |= i5;
                }
                if ((intValue7 & Token.DO) != 130) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (rv4Var7.U(intValue7 & 1, z8)) {
                    z1d.l(rp5.c((wk3) jk3.d.getValue(), rv4Var7, 0), floatValue, 0L, 0L, rv4Var7, (intValue7 << 3) & Token.ASSIGN_MOD);
                } else {
                    rv4Var7.X();
                }
                return pvcVar;
            case 7:
                ((Integer) obj2).getClass();
                rv4 rv4Var8 = (rv4) obj3;
                int intValue8 = ((Integer) obj4).intValue();
                ((xg6) obj).getClass();
                if ((intValue8 & Token.DEFAULT) != 128) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (rv4Var8.U(intValue8 & 1, z9)) {
                    nye.e(pna.v(pna.s(kq7Var, 120.0f)), rv4Var8, 6);
                } else {
                    rv4Var8.X();
                }
                return pvcVar;
            case 8:
                int intValue9 = ((Integer) obj2).intValue();
                rv4 rv4Var9 = (rv4) obj3;
                int intValue10 = ((Integer) obj4).intValue();
                ((yj6) obj).getClass();
                if ((intValue10 & 48) == 0) {
                    if (rv4Var9.d(intValue9)) {
                        i6 = 32;
                    } else {
                        i6 = 16;
                    }
                    intValue10 |= i6;
                }
                if ((intValue10 & Token.TARGET) != 144) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (rv4Var9.U(intValue10 & 1, z10)) {
                    nq7 f2 = pna.f(kq7Var, 1.0f);
                    tza tzaVar4 = j27.a;
                    v9e.g(intValue9 % 3, 0, rv4Var9, zbe.y(nmd.v(tte.k(f2, ((h27) rv4Var9.j(tzaVar4)).c.d), rm1.g(((h27) rv4Var9.j(tzaVar4)).a, 2.0f), lre.g), 14.0f));
                } else {
                    rv4Var9.X();
                }
                return pvcVar;
            case 9:
                ((Integer) obj2).getClass();
                rv4 rv4Var10 = (rv4) obj3;
                int intValue11 = ((Integer) obj4).intValue();
                ((yf6) obj).getClass();
                if ((intValue11 & Token.DEFAULT) != 128) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (rv4Var10.U(intValue11 & 1, z11)) {
                    nye.e(pna.f(kq7Var, 1.0f), rv4Var10, 6);
                } else {
                    rv4Var10.X();
                }
                return pvcVar;
            case 10:
                ((Integer) obj2).getClass();
                rv4 rv4Var11 = (rv4) obj3;
                int intValue12 = ((Integer) obj4).intValue();
                ((yf6) obj).getClass();
                if ((intValue12 & Token.DEFAULT) != 128) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (rv4Var11.U(intValue12 & 1, z12)) {
                    nye.e(pna.f(kq7Var, 1.0f), rv4Var11, 6);
                } else {
                    rv4Var11.X();
                }
                return pvcVar;
            case 11:
                int intValue13 = ((Integer) obj2).intValue();
                rv4 rv4Var12 = (rv4) obj3;
                int intValue14 = ((Integer) obj4).intValue();
                ((yj6) obj).getClass();
                if ((intValue14 & 48) == 0) {
                    if (rv4Var12.d(intValue13)) {
                        i7 = 32;
                    } else {
                        i7 = 16;
                    }
                    intValue14 |= i7;
                }
                if ((intValue14 & Token.TARGET) != 144) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (rv4Var12.U(intValue14 & 1, z13)) {
                    nq7 f3 = pna.f(kq7Var, 1.0f);
                    tza tzaVar5 = j27.a;
                    fre.h(intValue13 % 3, 0, rv4Var12, zbe.y(nmd.v(tte.k(f3, ((h27) rv4Var12.j(tzaVar5)).c.d), rm1.g(((h27) rv4Var12.j(tzaVar5)).a, 2.0f), lre.g), 14.0f));
                } else {
                    rv4Var12.X();
                }
                return pvcVar;
            case 12:
                ((Integer) obj2).getClass();
                rv4 rv4Var13 = (rv4) obj3;
                int intValue15 = ((Integer) obj4).intValue();
                ((yf6) obj).getClass();
                if ((intValue15 & Token.DEFAULT) != 128) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (rv4Var13.U(intValue15 & 1, z14)) {
                    sue.c(zbe.z(pna.f(kq7Var, 1.0f), 16.0f, 6.0f), rv4Var13, 0);
                } else {
                    rv4Var13.X();
                }
                return pvcVar;
            case 13:
                ((Integer) obj2).getClass();
                rv4 rv4Var14 = (rv4) obj3;
                int intValue16 = ((Integer) obj4).intValue();
                ((xg6) obj).getClass();
                if ((intValue16 & Token.DEFAULT) != 128) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rv4Var14.U(intValue16 & 1, z15)) {
                    nye.e(pna.v(pna.s(kq7Var, 120.0f)), rv4Var14, 6);
                } else {
                    rv4Var14.X();
                }
                return pvcVar;
            case 14:
                rv4 rv4Var15 = (rv4) obj3;
                int intValue17 = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                ((n10) obj2).getClass();
                if ((intValue17 & Token.DEFAULT) != 128) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (!rv4Var15.U(intValue17 & 1, z16)) {
                    rv4Var15.X();
                }
                return pvcVar;
            case 15:
                ((Integer) obj2).getClass();
                rv4 rv4Var16 = (rv4) obj3;
                int intValue18 = ((Integer) obj4).intValue();
                ((yf6) obj).getClass();
                if ((intValue18 & Token.DEFAULT) != 128) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rv4Var16.U(intValue18 & 1, z17)) {
                    nye.e(pna.f(kq7Var, 1.0f), rv4Var16, 6);
                } else {
                    rv4Var16.X();
                }
                return pvcVar;
            case 16:
                ((Integer) obj2).getClass();
                rv4 rv4Var17 = (rv4) obj3;
                int intValue19 = ((Integer) obj4).intValue();
                ((yf6) obj).getClass();
                if ((intValue19 & Token.DEFAULT) != 128) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (rv4Var17.U(intValue19 & 1, z18)) {
                    nye.g(pna.f(kq7Var, 1.0f), rv4Var17, 6);
                } else {
                    rv4Var17.X();
                }
                return pvcVar;
            case 17:
                ((Integer) obj2).getClass();
                rv4 rv4Var18 = (rv4) obj3;
                int intValue20 = ((Integer) obj4).intValue();
                ((yf6) obj).getClass();
                if ((intValue20 & Token.DEFAULT) != 128) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (rv4Var18.U(intValue20 & 1, z19)) {
                    nye.i(pna.f(kq7Var, 1.0f), rv4Var18, 6);
                } else {
                    rv4Var18.X();
                }
                return pvcVar;
            case 18:
                ((Integer) obj2).getClass();
                rv4 rv4Var19 = (rv4) obj3;
                int intValue21 = ((Integer) obj4).intValue();
                ((yf6) obj).getClass();
                if ((intValue21 & Token.DEFAULT) != 128) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                if (rv4Var19.U(intValue21 & 1, z20)) {
                    nye.k(pna.f(kq7Var, 1.0f), rv4Var19, 6);
                } else {
                    rv4Var19.X();
                }
                return pvcVar;
            case 19:
                ((Integer) obj2).getClass();
                rv4 rv4Var20 = (rv4) obj3;
                int intValue22 = ((Integer) obj4).intValue();
                ((xg6) obj).getClass();
                if ((intValue22 & Token.DEFAULT) != 128) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                if (rv4Var20.U(intValue22 & 1, z21)) {
                    hbe.T(zbe.z(pna.f(kq7Var, 1.0f), 8.0f, 6.0f), rv4Var20, 6);
                } else {
                    rv4Var20.X();
                }
                return pvcVar;
            case 20:
                ((Integer) obj2).getClass();
                rv4 rv4Var21 = (rv4) obj3;
                int intValue23 = ((Integer) obj4).intValue();
                ((xg6) obj).getClass();
                if ((intValue23 & Token.DEFAULT) != 128) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                if (rv4Var21.U(intValue23 & 1, z22)) {
                    nye.e(pna.v(pna.s(kq7Var, 100.0f)), rv4Var21, 6);
                } else {
                    rv4Var21.X();
                }
                return pvcVar;
            case 21:
                int intValue24 = ((Integer) obj2).intValue();
                rv4 rv4Var22 = (rv4) obj3;
                int intValue25 = ((Integer) obj4).intValue();
                mk0 mk0Var = kh5.F;
                ((xg6) obj).getClass();
                if ((intValue25 & 48) == 0) {
                    if (rv4Var22.d(intValue24)) {
                        i8 = 32;
                    } else {
                        i8 = 16;
                    }
                    intValue25 |= i8;
                }
                int i10 = intValue25;
                if ((i10 & Token.TARGET) != 144) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                if (rv4Var22.U(i10 & 1, z23)) {
                    nq7 f4 = pna.f(kq7Var, 1.0f);
                    tza tzaVar6 = j27.a;
                    nq7 k = tte.k(f4, ((h27) rv4Var22.j(tzaVar6)).c.d);
                    long g = rm1.g(((h27) rv4Var22.j(tzaVar6)).a, 2.0f);
                    ba5 ba5Var = lre.g;
                    nq7 y2 = zbe.y(nmd.v(k, g, ba5Var), 12.0f);
                    lk0 lk0Var = kh5.I;
                    ez ezVar = lz.c;
                    xn1 a3 = wn1.a(ezVar, lk0Var, rv4Var22, 0);
                    int hashCode3 = Long.hashCode(rv4Var22.T);
                    xt8 l3 = rv4Var22.l();
                    nq7 p3 = lye.p(rv4Var22, y2);
                    rw1.k.getClass();
                    zx1 zx1Var3 = qw1.b;
                    rv4Var22.i0();
                    if (rv4Var22.S) {
                        rv4Var22.k(zx1Var3);
                    } else {
                        rv4Var22.r0();
                    }
                    np npVar = qw1.f;
                    jce.F(npVar, rv4Var22, a3);
                    np npVar2 = qw1.e;
                    jce.F(npVar2, rv4Var22, l3);
                    Integer valueOf = Integer.valueOf(hashCode3);
                    np npVar3 = qw1.g;
                    jce.F(npVar3, rv4Var22, valueOf);
                    kg kgVar = qw1.h;
                    jce.C(kgVar, rv4Var22);
                    np npVar4 = qw1.d;
                    jce.F(npVar4, rv4Var22, p3);
                    mk0 mk0Var2 = kh5.G;
                    dz dzVar = lz.a;
                    gv9 a4 = ev9.a(dzVar, mk0Var2, rv4Var22, 48);
                    int hashCode4 = Long.hashCode(rv4Var22.T);
                    xt8 l4 = rv4Var22.l();
                    nq7 p4 = lye.p(rv4Var22, kq7Var);
                    rv4Var22.i0();
                    if (rv4Var22.S) {
                        rv4Var22.k(zx1Var3);
                    } else {
                        rv4Var22.r0();
                    }
                    jce.F(npVar, rv4Var22, a4);
                    jce.F(npVar2, rv4Var22, l4);
                    s21.t(hashCode4, rv4Var22, npVar3, rv4Var22, kgVar);
                    jce.F(npVar4, rv4Var22, p4);
                    nq7 n = pna.n(kq7Var, 38.0f);
                    su9 su9Var = uu9.a;
                    dpe.f(null, tte.k(n, su9Var), rv4Var22, 0, 1);
                    xbe.i(rv4Var22, pna.s(kq7Var, 10.0f));
                    xn1 a5 = wn1.a(ezVar, lk0Var, rv4Var22, 0);
                    int hashCode5 = Long.hashCode(rv4Var22.T);
                    xt8 l5 = rv4Var22.l();
                    nq7 p5 = lye.p(rv4Var22, kq7Var);
                    rv4Var22.i0();
                    if (rv4Var22.S) {
                        rv4Var22.k(zx1Var3);
                    } else {
                        rv4Var22.r0();
                    }
                    jce.F(npVar, rv4Var22, a5);
                    jce.F(npVar2, rv4Var22, l5);
                    s21.t(hashCode5, rv4Var22, npVar3, rv4Var22, kgVar);
                    jce.F(npVar4, rv4Var22, p5);
                    dpe.g(pna.h(pna.s(kq7Var, 110.0f), 18.0f), null, rv4Var22, 6, 2);
                    xbe.i(rv4Var22, pna.h(kq7Var, 6.0f));
                    dpe.g(pna.h(pna.s(kq7Var, 56.0f), 12.0f), null, rv4Var22, 6, 2);
                    xbe.i(rv4Var22, hl5.e(rv4Var22, true, true, kq7Var, 12.0f));
                    if (intValue24 == 0) {
                        rv4Var22.e0(929609808);
                        nq7 y3 = zbe.y(nmd.v(tte.k(pna.f(kq7Var, 1.0f), ((h27) rv4Var22.j(tzaVar6)).c.d), rm1.g(((h27) rv4Var22.j(tzaVar6)).a, 7.0f), ba5Var), 12.0f);
                        gv9 a6 = ev9.a(dzVar, mk0Var, rv4Var22, 0);
                        int hashCode6 = Long.hashCode(rv4Var22.T);
                        xt8 l6 = rv4Var22.l();
                        nq7 p6 = lye.p(rv4Var22, y3);
                        rv4Var22.i0();
                        if (rv4Var22.S) {
                            rv4Var22.k(zx1Var3);
                        } else {
                            rv4Var22.r0();
                        }
                        jce.F(npVar, rv4Var22, a6);
                        jce.F(npVar2, rv4Var22, l6);
                        s21.t(hashCode6, rv4Var22, npVar3, rv4Var22, kgVar);
                        jce.F(npVar4, rv4Var22, p6);
                        fu0.a(nmd.v(tte.k(pna.h(pna.s(kq7Var, 3.0f), 48.0f), su9Var), zl1.b(0.18f, ((h27) rv4Var22.j(tzaVar6)).a.a), ba5Var), rv4Var22, 0);
                        we6 d = rs8.d(kq7Var, 10.0f, rv4Var22, 1.0f, true);
                        xn1 a7 = wn1.a(ezVar, lk0Var, rv4Var22, 0);
                        int hashCode7 = Long.hashCode(rv4Var22.T);
                        xt8 l7 = rv4Var22.l();
                        nq7 p7 = lye.p(rv4Var22, d);
                        rv4Var22.i0();
                        if (rv4Var22.S) {
                            rv4Var22.k(zx1Var3);
                        } else {
                            rv4Var22.r0();
                        }
                        jce.F(npVar, rv4Var22, a7);
                        jce.F(npVar2, rv4Var22, l7);
                        s21.t(hashCode7, rv4Var22, npVar3, rv4Var22, kgVar);
                        jce.F(npVar4, rv4Var22, p7);
                        dpe.g(pna.h(pna.f(kq7Var, 0.38f), 14.0f), null, rv4Var22, 6, 2);
                        dpe.g(pna.h(hl5.f(kq7Var, 8.0f, rv4Var22, kq7Var, 1.0f), 12.0f), null, rv4Var22, 6, 2);
                        dpe.g(pna.h(hl5.f(kq7Var, 6.0f, rv4Var22, kq7Var, 0.7f), 12.0f), null, rv4Var22, 6, 2);
                        xbe.i(rv4Var22, hl5.e(rv4Var22, true, true, kq7Var, 10.0f));
                        rv4Var22.q(false);
                    } else {
                        rv4Var22.e0(931329037);
                        rv4Var22.q(false);
                    }
                    rv4Var22.e0(999875125);
                    for (int i11 = 0; i11 < 3; i11++) {
                        if (i11 == 2) {
                            f = 0.74f;
                        } else {
                            f = 1.0f;
                        }
                        dpe.g(pna.h(pna.f(kq7Var, f), 12.0f), null, rv4Var22, 0, 2);
                        if (i11 != 2) {
                            s21.w(rv4Var22, 1978684037, kq7Var, 6.0f, rv4Var22);
                            rv4Var22.q(false);
                        } else {
                            rv4Var22.e0(1978768605);
                            rv4Var22.q(false);
                        }
                    }
                    rv4Var22.q(false);
                    xbe.i(rv4Var22, pna.h(kq7Var, 12.0f));
                    gv9 a8 = ev9.a(new hz(8.0f, true, new vs(2)), mk0Var, rv4Var22, 6);
                    int hashCode8 = Long.hashCode(rv4Var22.T);
                    xt8 l8 = rv4Var22.l();
                    nq7 p8 = lye.p(rv4Var22, kq7Var);
                    rw1.k.getClass();
                    zx1 zx1Var4 = qw1.b;
                    rv4Var22.i0();
                    if (rv4Var22.S) {
                        rv4Var22.k(zx1Var4);
                    } else {
                        rv4Var22.r0();
                    }
                    jce.F(qw1.f, rv4Var22, a8);
                    jce.F(qw1.e, rv4Var22, l8);
                    jce.F(qw1.g, rv4Var22, Integer.valueOf(hashCode8));
                    jce.C(qw1.h, rv4Var22);
                    jce.F(qw1.d, rv4Var22, p8);
                    su9 su9Var2 = uu9.a;
                    dpe.g(pna.h(pna.s(kq7Var, 62.0f), 30.0f), su9Var2, rv4Var22, 6, 0);
                    dpe.g(pna.h(pna.s(kq7Var, 36.0f), 30.0f), su9Var2, rv4Var22, 6, 0);
                    xbe.i(rv4Var22, new we6(1.0f, true));
                    dpe.g(pna.h(pna.s(kq7Var, 88.0f), 14.0f), null, rv4Var22, 6, 2);
                    rv4Var22.q(true);
                    rv4Var22.q(true);
                } else {
                    rv4Var22.X();
                }
                return pvcVar;
            case 22:
                bu1 bu1Var = (bu1) obj;
                String str = (String) obj2;
                boolean booleanValue = ((Boolean) obj4).booleanValue();
                tn4 tn4Var = HandleRedirectActivity.R;
                bu1Var.getClass();
                str.getClass();
                WebView webView = (WebView) HandleRedirectActivity.T.invoke(bu1Var, (String) obj3);
                fb4 fb4Var = new fb4(24);
                Field field = rcd.a;
                kcd.b(webView, fb4Var);
                if (booleanValue) {
                    CookieManager.getInstance().removeAllCookies(null);
                    webView.clearHistory();
                    webView.clearCache(true);
                }
                bu1Var.setContentView(webView);
                webView.loadUrl(str);
                return pvcVar;
            default:
                return new xx8((d82) obj, (Context) obj2, (e6a) obj3, (ov6) obj4);
        }
    }
}
