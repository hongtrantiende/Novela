package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
import org.w3c.dom.Node;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zxe  reason: default package */
/* loaded from: classes.dex */
public abstract class zxe {
    public static final tu1 a = new tu1(new iv1(24), false, -1621457085);
    public static final tu1 b = new tu1(new iv1(25), false, 1224012102);
    public static final tu1 c = new tu1(new jv1(16), false, -708930102);
    public static final tu1 d = new tu1(new jv1(17), false, -624218594);
    public static final qm1 e = qm1.f;
    public static final float f = 0.38f;

    public static final void a(int i, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        boolean z;
        String str2;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-2057220715);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var2.h(vt4Var2)) {
            i3 = 2048;
        } else {
            i3 = 1024;
        }
        int i5 = i4 | i3;
        if ((i5 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, d2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            ze4 ze4Var = pna.c;
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, ze4Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a2);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            rv4Var2.e0(-253473145);
            if (k4b.j0(str)) {
                str2 = yqe.A((y3b) o2b.P0.getValue(), rv4Var2);
            } else {
                str2 = str;
            }
            rv4Var2.q(false);
            cvb.c(str2, null, 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, null, rv4Var, 0, 0, 261118);
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var, pna.h(kq7Var, 24.0f));
            z1d.f(rp5.c((wk3) ok3.g0.getValue(), rv4Var, 0), yqe.A((y3b) b3b.B.getValue(), rv4Var), false, null, null, null, null, null, vt4Var, rv4Var, 100663296, 252);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            ar5 c2 = rp5.c((wk3) jk3.d.getValue(), rv4Var2, 0);
            nq7 o = nc2.o(kq7Var);
            if ((i5 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var2.P();
            if (z2 || P == ax1.a) {
                P = new ge5(0, vt4Var2);
                rv4Var2.o0(P);
            }
            kwe.d(c2, o, 0L, (vt4) P, rv4Var2, 0, 4);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new qp1(str, nq7Var, vt4Var, vt4Var2, i, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v23, types: [int] */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v69 */
    public static final void b(String str, String str2, String str3, String str4, nq7 nq7Var, boolean z, nu4 nu4Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        kd4 kd4Var;
        aw7 aw7Var;
        aw7 aw7Var2;
        int i10;
        boolean z6;
        aw7 aw7Var3;
        boolean z7;
        aw7 aw7Var4;
        kd4 kd4Var2;
        lh9 lh9Var;
        kq7 kq7Var;
        aw7 aw7Var5;
        rv4 rv4Var2;
        rv4 rv4Var3;
        ?? r4;
        boolean z8;
        boolean z9;
        lh9 lh9Var2;
        aw7 aw7Var6;
        int i11;
        int i12;
        kq7 kq7Var2;
        aw7 aw7Var7;
        int i13;
        rv4 rv4Var4 = rv4Var;
        u22 u22Var = r0f.d;
        rv4Var4.g0(-669477987);
        if (rv4Var4.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i14 = i | i2;
        if (rv4Var4.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i15 = i14 | i3;
        if (rv4Var4.f(str3)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i16 = i15 | i4;
        if (rv4Var4.f(str4)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i17 = i16 | i5;
        if (rv4Var4.f(nq7Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i18 = i17 | i6;
        if (rv4Var4.g(z)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i19 = i18 | i7;
        if (rv4Var4.h(nu4Var)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i20 = i19 | i8;
        if (rv4Var4.h(vt4Var)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i21 = i20 | i9;
        if ((i21 & 4793491) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var4.U(i21 & 1, z2)) {
            Object[] objArr = new Object[0];
            int i22 = i21 & Token.ASSIGN_MOD;
            if (i22 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P = rv4Var4.P();
            lh9 lh9Var3 = ax1.a;
            if (z3 || P == lh9Var3) {
                P = new v85(str2, 2);
                rv4Var4.o0(P);
            }
            aw7 aw7Var8 = (aw7) zpe.k(objArr, (vt4) P, rv4Var4, 0);
            Object[] objArr2 = new Object[0];
            if ((i21 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P2 = rv4Var4.P();
            if (z4 || P2 == lh9Var3) {
                P2 = new v85(str3, 3);
                rv4Var4.o0(P2);
            }
            aw7 aw7Var9 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var4, 0);
            Object[] objArr3 = new Object[0];
            if ((i21 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object P3 = rv4Var4.P();
            if (z5 || P3 == lh9Var3) {
                P3 = new v85(str4, 4);
                rv4Var4.o0(P3);
            }
            aw7 aw7Var10 = (aw7) zpe.k(objArr3, (vt4) P3, rv4Var4, 0);
            Object P4 = rv4Var4.P();
            String str5 = null;
            if (P4 == lh9Var3) {
                P4 = yae.z(null);
                rv4Var4.o0(P4);
            }
            aw7 aw7Var11 = (aw7) P4;
            Object P5 = rv4Var4.P();
            if (P5 == lh9Var3) {
                P5 = new qp4(aw7Var11, 11);
                rv4Var4.o0(P5);
            }
            kd4 v = w92.v(av8.a, (xt4) P5, rv4Var4, 54);
            Object[] objArr4 = new Object[0];
            Object P6 = rv4Var4.P();
            if (P6 == lh9Var3) {
                kd4Var = v;
                P6 = new k85(6);
                rv4Var4.o0(P6);
            } else {
                kd4Var = v;
            }
            aw7 aw7Var12 = (aw7) zpe.k(objArr4, (vt4) P6, rv4Var4, 48);
            nk0 nk0Var = kh5.a;
            b37 d2 = fu0.d(nk0Var, false);
            int hashCode = Long.hashCode(rv4Var4.T);
            xt8 l = rv4Var4.l();
            nq7 p = lye.p(rv4Var4, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var4.i0();
            if (rv4Var4.S) {
                rv4Var4.k(zx1Var);
            } else {
                rv4Var4.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var4, d2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var4, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var4, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var4);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var4, p);
            kq7 kq7Var3 = kq7.a;
            nq7 C = rte.C(q1d.l(pu0.a.a(pna.c(kq7Var3, 1.0f), kh5.b), rv4Var4, 0), rte.u(rv4Var4), 14);
            xn1 a2 = wn1.a(lz.c, kh5.J, rv4Var4, 48);
            int hashCode2 = Long.hashCode(rv4Var4.T);
            xt8 l2 = rv4Var4.l();
            nq7 p2 = lye.p(rv4Var4, C);
            rv4Var4.i0();
            if (rv4Var4.S) {
                rv4Var4.k(zx1Var);
            } else {
                rv4Var4.r0();
            }
            jce.F(npVar, rv4Var4, a2);
            jce.F(npVar2, rv4Var4, l2);
            s21.t(hashCode2, rv4Var4, npVar3, rv4Var4, kgVar);
            jce.F(npVar4, rv4Var4, p2);
            xbe.i(rv4Var4, pna.h(kq7Var3, 44.0f));
            nq7 p3 = pna.p(kq7Var3, 120.0f, 180.0f);
            tza tzaVar = j27.a;
            nq7 k = tte.k(p3, ((h27) rv4Var4.j(tzaVar)).c.b);
            b37 d3 = fu0.d(nk0Var, false);
            int hashCode3 = Long.hashCode(rv4Var4.T);
            xt8 l3 = rv4Var4.l();
            nq7 p4 = lye.p(rv4Var4, k);
            rv4Var4.i0();
            if (rv4Var4.S) {
                rv4Var4.k(zx1Var);
            } else {
                rv4Var4.r0();
            }
            jce.F(npVar, rv4Var4, d3);
            jce.F(npVar2, rv4Var4, l3);
            s21.t(hashCode3, rv4Var4, npVar3, rv4Var4, kgVar);
            jce.F(npVar4, rv4Var4, p4);
            if (((f76) aw7Var11.getValue()) == null) {
                rv4Var4.e0(626340390);
                z6 = true;
                aw7Var = aw7Var11;
                aw7Var2 = aw7Var8;
                i10 = i21;
                do5.c(str, str2, "", "", u22Var, pna.c, rv4Var4, (i21 & 14) | 224640 | i22);
                rv4Var4.q(false);
                r4 = 0;
                kq7Var = kq7Var3;
                aw7Var3 = aw7Var9;
                aw7Var4 = aw7Var10;
                kd4Var2 = kd4Var;
                aw7Var5 = aw7Var12;
                rv4Var3 = rv4Var4;
                lh9Var = lh9Var3;
            } else {
                aw7Var = aw7Var11;
                aw7Var2 = aw7Var8;
                i10 = i21;
                z6 = true;
                rv4Var4.e0(626722310);
                f76 f76Var = (f76) aw7Var.getValue();
                if (f76Var == null) {
                    rv4Var4.e0(626722309);
                    rv4Var4.q(false);
                    z7 = false;
                    kq7Var = kq7Var3;
                    aw7Var3 = aw7Var9;
                    aw7Var4 = aw7Var10;
                    kd4Var2 = kd4Var;
                    aw7Var5 = aw7Var12;
                    rv4Var2 = rv4Var4;
                    lh9Var = lh9Var3;
                } else {
                    rv4Var4.e0(626722310);
                    aw7Var3 = aw7Var9;
                    z7 = false;
                    aw7Var4 = aw7Var10;
                    kd4Var2 = kd4Var;
                    lh9Var = lh9Var3;
                    kq7Var = kq7Var3;
                    aw7Var5 = aw7Var12;
                    do5.a(f76Var, u22Var, false, null, null, null, pna.c, null, rv4Var4, 12582960, 892);
                    rv4Var2 = rv4Var4;
                    rv4Var2.q(false);
                }
                rv4Var2.q(z7);
                r4 = z7;
                rv4Var3 = rv4Var2;
            }
            rs8.u(rv4Var3, z6, kq7Var, 8.0f, rv4Var3);
            ar5 c2 = rp5.c((wk3) jk3.P.getValue(), rv4Var3, r4);
            String A = yqe.A((y3b) f2b.W.getValue(), rv4Var3);
            boolean f2 = rv4Var3.f(kd4Var2);
            Object P7 = rv4Var3.P();
            if (f2 || P7 == lh9Var) {
                P7 = new fe1(kd4Var2, 10);
                rv4Var3.o0(P7);
            }
            z1d.f(c2, A, false, null, null, null, null, null, (vt4) P7, rv4Var, 0, 252);
            String str6 = (String) nk2.p(kq7Var, 12.0f, rv4Var, aw7Var2);
            v72 v72Var = ((h27) rv4Var.j(tzaVar)).c.b;
            nq7 A2 = zbe.A(pna.f(pna.u(kq7Var, nae.e, 420.0f, 1), 1.0f), 24.0f, nae.e, 2);
            boolean f3 = rv4Var.f(aw7Var2);
            Object P8 = rv4Var.P();
            if (f3 || P8 == lh9Var) {
                P8 = new qp4(aw7Var2, 12);
                rv4Var.o0(P8);
            }
            uwe.h(str6, (xt4) P8, A2, false, false, null, sue.a, null, null, null, false, null, null, null, false, 0, 0, v72Var, null, rv4Var, 1573248, 0, 6291384);
            String str7 = (String) nk2.p(kq7Var, 12.0f, rv4Var, aw7Var3);
            v72 v72Var2 = ((h27) rv4Var.j(tzaVar)).c.b;
            nq7 A3 = zbe.A(pna.f(pna.u(kq7Var, nae.e, 420.0f, 1), 1.0f), 24.0f, nae.e, 2);
            boolean f4 = rv4Var.f(aw7Var3);
            Object P9 = rv4Var.P();
            if (f4 || P9 == lh9Var) {
                P9 = new qp4(aw7Var3, 13);
                rv4Var.o0(P9);
            }
            uwe.h(str7, (xt4) P9, A3, false, false, null, sue.b, null, null, null, false, null, null, null, false, 0, 0, v72Var2, null, rv4Var, 1573248, 0, 6291384);
            boolean f5 = rv4Var.f((String) nk2.p(kq7Var, 12.0f, rv4Var, aw7Var4));
            Object P10 = rv4Var.P();
            String str8 = P10;
            if (f5 || P10 == lh9Var) {
                String str9 = "";
                String str10 = str9;
                if (((String) aw7Var4.getValue()).length() != 0) {
                    mv6 e2 = vve.e((String) aw7Var4.getValue());
                    if (e2 != null) {
                        str5 = e2.c(vve.f());
                    }
                    if (str5 != null) {
                        str9 = str5;
                    }
                    str10 = rs8.l(str9, " (", (String) aw7Var4.getValue(), ")");
                }
                rv4Var.o0(str10);
                str8 = str10;
            }
            String str11 = (String) str8;
            String A4 = yqe.A((y3b) x2b.I.getValue(), rv4Var);
            boolean f6 = rv4Var.f(aw7Var5);
            Object P11 = rv4Var.P();
            if (f6 || P11 == lh9Var) {
                P11 = new ea4(aw7Var5, 11);
                rv4Var.o0(P11);
            }
            aw7 aw7Var13 = aw7Var4;
            lh9 lh9Var4 = lh9Var;
            kq7 kq7Var4 = kq7Var;
            aw7 aw7Var14 = aw7Var5;
            twe.e(3072, (vt4) P11, rv4Var, zbe.A(pna.f(pna.u(kq7Var, nae.e, 420.0f, 1), 1.0f), 24.0f, nae.e, 2), str11, A4, null);
            rv4 rv4Var5 = rv4Var;
            xbe.i(rv4Var5, pna.h(kq7Var4, 12.0f));
            if (z) {
                rv4Var5.e0(864628935);
                eg0.f(pna.n(kq7Var4, 28.0f), ((h27) rv4Var5.j(tzaVar)).a.d, null, rv4Var, 6, 4);
                rv4Var5 = rv4Var;
                rv4Var5.q(false);
                aw7Var6 = aw7Var13;
                i12 = 0;
                kq7Var2 = kq7Var4;
                aw7Var7 = aw7Var14;
                lh9Var2 = lh9Var4;
                i11 = 13;
            } else {
                rv4Var5.e0(864819771);
                ar5 c3 = rp5.c((wk3) ok3.j0.getValue(), rv4Var5, 0);
                String A5 = yqe.A((y3b) s2b.E0.getValue(), rv4Var5);
                if (((String) aw7Var2.getValue()).length() > 0 && ((String) aw7Var13.getValue()).length() > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                nq7 A6 = zbe.A(pna.f(pna.u(kq7Var4, nae.e, 420.0f, 1), 1.0f), 24.0f, nae.e, 2);
                if ((3670016 & i10) == 1048576) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean f7 = z9 | rv4Var5.f(aw7Var2) | rv4Var5.f(aw7Var3) | rv4Var5.f(aw7Var13);
                Object P12 = rv4Var5.P();
                if (!f7) {
                    lh9Var2 = lh9Var4;
                    if (P12 != lh9Var2) {
                        aw7Var6 = aw7Var13;
                        i11 = 13;
                        i12 = 0;
                        kq7Var2 = kq7Var4;
                        boolean z10 = z8;
                        aw7Var7 = aw7Var14;
                        z1d.f(c3, A5, z10, null, A6, null, null, null, (vt4) P12, rv4Var5, 24576, 232);
                        rv4Var5.q(false);
                    }
                } else {
                    lh9Var2 = lh9Var4;
                }
                P12 = new mc3(nu4Var, aw7Var2, aw7Var3, aw7Var13, aw7Var, 4);
                aw7Var6 = aw7Var13;
                rv4Var5.o0(P12);
                i11 = 13;
                i12 = 0;
                kq7Var2 = kq7Var4;
                boolean z102 = z8;
                aw7Var7 = aw7Var14;
                z1d.f(c3, A5, z102, null, A6, null, null, null, (vt4) P12, rv4Var5, 24576, 232);
                rv4Var5.q(false);
            }
            rv4Var5.q(true);
            boolean booleanValue = ((Boolean) aw7Var7.getValue()).booleanValue();
            boolean f8 = rv4Var5.f(aw7Var7);
            Object P13 = rv4Var5.P();
            if (f8 || P13 == lh9Var2) {
                P13 = new qp4(aw7Var7, 10);
                rv4Var5.o0(P13);
            }
            xt4 xt4Var = (xt4) P13;
            boolean f9 = rv4Var5.f(aw7Var6) | rv4Var5.f(aw7Var7);
            Object P14 = rv4Var5.P();
            if (f9 || P14 == lh9Var2) {
                P14 = new pr0(aw7Var6, aw7Var7, i11);
                rv4Var5.o0(P14);
            }
            am8.g(booleanValue, xt4Var, (xt4) P14, rv4Var5, i12);
            ar5 c4 = rp5.c((wk3) jk3.d.getValue(), rv4Var5, i12);
            if ((29360128 & i10) == 8388608) {
                i13 = 1;
            } else {
                i13 = i12;
            }
            Object P15 = rv4Var5.P();
            if (i13 != 0 || P15 == lh9Var2) {
                P15 = new jf3(29, vt4Var);
                rv4Var5.o0(P15);
            }
            kwe.d(c4, kq7Var2, 0L, (vt4) P15, rv4Var, 48, 4);
            rv4Var4 = rv4Var;
            rv4Var4.q(true);
        } else {
            rv4Var4.X();
        }
        ek9 u = rv4Var4.u();
        if (u != null) {
            u.d = new lc3(str, str2, str3, str4, nq7Var, z, nu4Var, vt4Var, i, 3);
        }
    }

    public static final void c(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(829320125);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var2.h(vt4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i5 = i4 | i3;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, d2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            ze4 ze4Var = pna.c;
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, ze4Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a2);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            tza tzaVar = j27.a;
            oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.g;
            long j = ((h27) rv4Var2.j(tzaVar)).a.q;
            kq7 kq7Var = kq7.a;
            cvb.c(str, zbe.y(kq7Var, 24.0f), j, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, oybVar, rv4Var, (i5 & 14) | 48, 0, 130040);
            eg0.f(pna.n(kq7Var, 48.0f), ((h27) rv4Var.j(tzaVar)).a.q, null, rv4Var, 6, 4);
            rv4Var.q(true);
            ar5 c2 = rp5.c((wk3) jk3.d.getValue(), rv4Var, 0);
            nq7 o = nc2.o(kq7Var);
            if ((i5 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new jf3(28, vt4Var);
                rv4Var.o0(P);
            }
            kwe.d(c2, o, 0L, (vt4) P, rv4Var, 0, 4);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new k31(str, nq7Var, vt4Var, i, 8);
        }
    }

    public static final void d(int i, rv4 rv4Var, nq7 nq7Var, cz7 cz7Var, String str) {
        int i2;
        cz7 cz7Var2;
        boolean z;
        rv4 rv4Var2;
        boolean z2;
        pb2 pb2Var;
        boolean z3;
        long v;
        long v2;
        int i3;
        int i4;
        int i5;
        str.getClass();
        cz7Var.getClass();
        rv4Var.g0(1121700523);
        if ((i & 6) == 0) {
            if (rv4Var.f(str)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            cz7Var2 = cz7Var;
            if (rv4Var.f(cz7Var2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        } else {
            cz7Var2 = cz7Var;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        }
        if ((i2 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            if ((i2 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new v85(str, 1);
                rv4Var.o0(P);
            }
            vt4 vt4Var = (vt4) P;
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                pb2 pb2Var2 = pb2Var;
                q0a a3 = o96.a(rv4Var);
                gi1 a4 = cm9.a(ee5.class);
                ee5 ee5Var = (ee5) ((fdd) voe.z(a4, a2.i(), eub.o(a4.f(), "-", str), pb2Var2, a3, vt4Var));
                boolean f2 = rv4Var.f(ee5Var);
                Object P2 = rv4Var.P();
                if (f2 || P2 == lh9Var) {
                    P2 = new fo4(ee5Var, 3);
                    rv4Var.o0(P2);
                }
                tte.d(ee5Var, null, (xt4) P2, rv4Var, 0);
                aw7 z4 = jsc.z(ee5Var.t0, rv4Var);
                aw7 z5 = jsc.z(ee5Var.i1, rv4Var);
                pm1 pm1Var = ((h27) rv4Var.j(j27.a)).a;
                boolean f3 = rv4Var.f((nnb) z4.getValue()) | rv4Var.f(pm1Var);
                Object P3 = rv4Var.P();
                if (f3 || P3 == lh9Var) {
                    if (((nnb) z4.getValue()).a.length() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z6 = ((nnb) z4.getValue()).g;
                    if (z3) {
                        v = pm1Var.q;
                    } else {
                        v = kve.v(((nnb) z4.getValue()).d);
                    }
                    long j = v;
                    if (z3) {
                        v2 = pm1Var.p;
                    } else {
                        v2 = kve.v(((nnb) z4.getValue()).e);
                    }
                    P3 = yae.z(new e6c(z3, z6, j, v2, ((nnb) z4.getValue()).f, nae.n(((nnb) z4.getValue()).h)));
                    rv4Var.o0(P3);
                }
                aw7 aw7Var = (aw7) P3;
                aw7 z7 = jsc.z(ee5Var.z0, rv4Var);
                WeakHashMap weakHashMap = yjd.w;
                ix5 o = w92.o(h88.n(rv4Var).b, rv4Var);
                boolean f4 = rv4Var.f((nnb) z4.getValue());
                Object P4 = rv4Var.P();
                if (f4 || P4 == lh9Var) {
                    th8 th8Var = new th8(((nnb) z4.getValue()).F, ((nnb) z4.getValue()).H, ((nnb) z4.getValue()).G, ((nnb) z4.getValue()).I);
                    rv4Var.o0(th8Var);
                    P4 = th8Var;
                }
                aw7 z8 = jsc.z(ee5Var.A0, rv4Var);
                dxe.l(((nnb) z4.getValue()).o, ((nnb) z4.getValue()).r, ((nnb) z4.getValue()).p, ((nnb) z4.getValue()).q, rv4Var, 0);
                rv4Var2 = rv4Var;
                pc2.f((e6c) aw7Var.getValue(), jce.E(1309188347, new fe5(ee5Var, nq7Var, o, cz7Var2, str, (rh8) P4, aw7Var, z5, z7, z4, z8), rv4Var2), rv4Var2, 48);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new j31(str, cz7Var, nq7Var, i, 5);
        }
    }

    public static final void e(boolean z, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        vt4Var.getClass();
        rv4Var.g0(-1462233880);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(vt4Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            xxe.a(z, vt4Var, rv4Var, i2 & Token.ELSE);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new pf0(z, vt4Var, i, 1);
        }
    }

    public static final dp3 f(dp3 dp3Var, String str) {
        String lookupPrefix = ((Node) dp3Var.a).lookupPrefix("http://schemas.android.com/apk/res/android");
        lookupPrefix.getClass();
        dp3 dp3Var2 = null;
        ef4 ef4Var = new ef4(new ff4(new c00(new dpd(dp3Var, null), 2), true, dda.T));
        while (true) {
            if (!ef4Var.hasNext()) {
                break;
            }
            Object next = ef4Var.next();
            dp3 dp3Var3 = (dp3) next;
            String namespaceURI = ((Node) dp3Var3.a).getNamespaceURI();
            namespaceURI.getClass();
            if (namespaceURI.equals("http://schemas.android.com/aapt")) {
                String localName = ((Node) dp3Var3.a).getLocalName();
                localName.getClass();
                if (localName.equals("attr")) {
                    String attribute = dp3Var3.D.getAttribute("name");
                    attribute.getClass();
                    if (attribute.equals(lookupPrefix + ":" + str)) {
                        dp3Var2 = next;
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return dp3Var2;
    }

    public static final String g(dp3 dp3Var, String str) {
        dp3Var.getClass();
        String attributeNS = dp3Var.D.getAttributeNS("http://schemas.android.com/apk/res/android", str);
        attributeNS.getClass();
        if (!k4b.j0(attributeNS)) {
            return attributeNS;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, nc2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, nc2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nc2] */
    public static nc2 h(int i) {
        if (i != 0) {
            if (i != 1) {
                return new Object();
            }
            return new Object();
        }
        return new Object();
    }

    public static final jj i(byte[] bArr) {
        bArr.getClass();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        decodeByteArray.getClass();
        return new jj(decodeByteArray);
    }

    public static final float j(rj8 rj8Var) {
        if (rj8Var.m().e == ff8.b) {
            return Float.intBitsToFloat((int) (rj8Var.q() >> 32));
        }
        return Float.intBitsToFloat((int) (rj8Var.q() & 4294967295L));
    }

    public static final byte[] k(nl5 nl5Var, int i) {
        nl5Var.getClass();
        return l(ay5.a(nl5Var), i);
    }

    public static final byte[] l(Bitmap bitmap, int i) {
        Bitmap.CompressFormat compressFormat;
        bitmap.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (vr5.a[0] == 1) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        } else {
            compressFormat = Bitmap.CompressFormat.PNG;
        }
        bitmap.compress(compressFormat, i, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        bitmap.recycle();
        byteArray.getClass();
        return byteArray;
    }

    public static final ps m(jub jubVar) {
        ps psVar = jubVar.a;
        long j = jubVar.b;
        psVar.getClass();
        return psVar.subSequence(fxb.g(j), fxb.f(j));
    }

    public static final ps n(jub jubVar, int i) {
        ps psVar = jubVar.a;
        ps psVar2 = jubVar.a;
        long j = jubVar.b;
        int f2 = fxb.f(j);
        int f3 = fxb.f(j);
        int i2 = f3 + i;
        if (((i ^ i2) & (f3 ^ i2)) < 0) {
            i2 = psVar2.b.length();
        }
        return psVar.subSequence(f2, Math.min(i2, psVar2.b.length()));
    }

    public static final ps o(jub jubVar, int i) {
        ps psVar = jubVar.a;
        long j = jubVar.b;
        int g = fxb.g(j);
        int i2 = g - i;
        if (((g ^ i2) & (i ^ g)) < 0) {
            i2 = 0;
        }
        return psVar.subSequence(Math.max(0, i2), fxb.g(j));
    }

    public static final int p(d5a d5aVar, byte b2, int i, int i2) {
        if (i >= 0 && i < d5aVar.b()) {
            if (i <= i2 && i2 <= d5aVar.b()) {
                int i3 = d5aVar.b;
                byte[] bArr = d5aVar.a;
                while (i < i2) {
                    if (bArr[i3 + i] == b2) {
                        return i;
                    }
                    i++;
                }
                return -1;
            }
            p1a.k(String.valueOf(i2));
            return 0;
        }
        p1a.k(String.valueOf(i));
        return 0;
    }

    public static final boolean q(d5a d5aVar) {
        d5aVar.getClass();
        if (d5aVar.b() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean r(rj8 rj8Var, float f2) {
        float j;
        boolean z;
        rj8Var.m().getClass();
        if (rj8Var.r()) {
            j = -f2;
        } else {
            j = j(rj8Var);
        }
        if (j > nae.e) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return true;
    }

    public static final yk8[] s(dp3 dp3Var) {
        Integer num;
        Integer num2;
        yk8 yk8Var;
        Integer num3 = null;
        List e0 = g9a.e0(new ff4(new ff4(new c00(new dpd(dp3Var, null), 2), true, dda.U), true, new x8d(21)));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : e0) {
            int i2 = i + 1;
            if (i >= 0) {
                dp3 dp3Var2 = (dp3) obj;
                float f2 = i;
                int size = e0.size() - 1;
                if (size < 1) {
                    size = 1;
                }
                float f3 = f2 / size;
                String g = g(dp3Var2, "offset");
                if (g != null) {
                    f3 = Float.parseFloat(g);
                }
                String g2 = g(dp3Var2, "color");
                if (g2 != null) {
                    yk8Var = new yk8(Float.valueOf(f3), new zl1(sve.b(qre.u(g2))));
                } else {
                    yk8Var = null;
                }
                if (yk8Var != null) {
                    arrayList.add(yk8Var);
                }
                i = i2;
            } else {
                tl1.M();
                throw null;
            }
        }
        if (arrayList.isEmpty()) {
            String g3 = g(dp3Var, "startColor");
            if (g3 != null) {
                num = Integer.valueOf(qre.u(g3));
            } else {
                num = null;
            }
            String g4 = g(dp3Var, "centerColor");
            if (g4 != null) {
                num2 = Integer.valueOf(qre.u(g4));
            } else {
                num2 = null;
            }
            String g5 = g(dp3Var, "endColor");
            if (g5 != null) {
                num3 = Integer.valueOf(qre.u(g5));
            }
            if (num != null) {
                arrayList.add(new yk8(Float.valueOf((float) nae.e), new zl1(sve.b(num.intValue()))));
            }
            if (num2 != null) {
                arrayList.add(new yk8(Float.valueOf(0.5f), new zl1(sve.b(num2.intValue()))));
            }
            if (num3 != null) {
                arrayList.add(new yk8(Float.valueOf(1.0f), new zl1(sve.b(num3.intValue()))));
            }
        }
        return (yk8[]) arrayList.toArray(new yk8[0]);
    }

    public static final jea t(dp3 dp3Var) {
        Object obj;
        String g;
        float f2;
        float f3;
        float f4;
        int i;
        float f5;
        float f6;
        int i2;
        float f7;
        ef4 ef4Var = new ef4(new ff4(new c00(new dpd(dp3Var, null), 2), true, dda.V));
        while (true) {
            if (ef4Var.hasNext()) {
                obj = ef4Var.next();
                String nodeName = ((Node) ((dp3) obj).a).getNodeName();
                nodeName.getClass();
                if (nodeName.equals("gradient")) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        dp3 dp3Var2 = (dp3) obj;
        if (dp3Var2 != null && (g = g(dp3Var2, "type")) != null) {
            int hashCode = g.hashCode();
            int i3 = 0;
            float f8 = nae.e;
            if (hashCode != -1102672091) {
                if (hashCode != -938579425) {
                    if (hashCode == 109850348 && g.equals("sweep")) {
                        yk8[] s = s(dp3Var2);
                        yk8[] yk8VarArr = (yk8[]) Arrays.copyOf(s, s.length);
                        String g2 = g(dp3Var2, "centerX");
                        if (g2 != null) {
                            f7 = Float.parseFloat(g2);
                        } else {
                            f7 = 0.0f;
                        }
                        String g3 = g(dp3Var2, "centerY");
                        if (g3 != null) {
                            f8 = Float.parseFloat(g3);
                        }
                        long floatToRawIntBits = (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L);
                        ArrayList arrayList = new ArrayList(yk8VarArr.length);
                        for (yk8 yk8Var : yk8VarArr) {
                            arrayList.add(new zl1(((zl1) yk8Var.b).a));
                        }
                        int length = yk8VarArr.length;
                        ArrayList arrayList2 = new ArrayList(length);
                        while (i3 < length) {
                            arrayList2.add(Float.valueOf(((Number) yk8VarArr[i3].a).floatValue()));
                            i3++;
                        }
                        return new iab(floatToRawIntBits, arrayList, arrayList2);
                    }
                } else if (g.equals("radial")) {
                    yk8[] s2 = s(dp3Var2);
                    yk8[] yk8VarArr2 = (yk8[]) Arrays.copyOf(s2, s2.length);
                    String g4 = g(dp3Var2, "centerX");
                    if (g4 != null) {
                        f5 = Float.parseFloat(g4);
                    } else {
                        f5 = 0.0f;
                    }
                    String g5 = g(dp3Var2, "centerY");
                    if (g5 != null) {
                        f6 = Float.parseFloat(g5);
                    } else {
                        f6 = 0.0f;
                    }
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
                    String g6 = g(dp3Var2, "gradientRadius");
                    if (g6 != null) {
                        f8 = Float.parseFloat(g6);
                    }
                    float f9 = f8;
                    String g7 = g(dp3Var2, "tileMode");
                    if (g7 != null) {
                        i2 = qre.w(g7);
                    } else {
                        i2 = 0;
                    }
                    ArrayList arrayList3 = new ArrayList(yk8VarArr2.length);
                    for (yk8 yk8Var2 : yk8VarArr2) {
                        arrayList3.add(new zl1(((zl1) yk8Var2.b).a));
                    }
                    int length2 = yk8VarArr2.length;
                    ArrayList arrayList4 = new ArrayList(length2);
                    while (i3 < length2) {
                        arrayList4.add(Float.valueOf(((Number) yk8VarArr2[i3].a).floatValue()));
                        i3++;
                    }
                    return new qg9(arrayList3, arrayList4, floatToRawIntBits2, f9, i2);
                }
            } else if (g.equals("linear")) {
                yk8[] s3 = s(dp3Var2);
                yk8[] yk8VarArr3 = (yk8[]) Arrays.copyOf(s3, s3.length);
                String g8 = g(dp3Var2, "startX");
                if (g8 != null) {
                    f2 = Float.parseFloat(g8);
                } else {
                    f2 = 0.0f;
                }
                String g9 = g(dp3Var2, "startY");
                if (g9 != null) {
                    f3 = Float.parseFloat(g9);
                } else {
                    f3 = 0.0f;
                }
                long floatToRawIntBits3 = (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                String g10 = g(dp3Var2, "endX");
                if (g10 != null) {
                    f4 = Float.parseFloat(g10);
                } else {
                    f4 = 0.0f;
                }
                String g11 = g(dp3Var2, "endY");
                if (g11 != null) {
                    f8 = Float.parseFloat(g11);
                }
                long floatToRawIntBits4 = (Float.floatToRawIntBits(f4) << 32) | (4294967295L & Float.floatToRawIntBits(f8));
                String g12 = g(dp3Var2, "tileMode");
                if (g12 != null) {
                    i = qre.w(g12);
                } else {
                    i = 0;
                }
                ArrayList arrayList5 = new ArrayList(yk8VarArr3.length);
                for (yk8 yk8Var3 : yk8VarArr3) {
                    arrayList5.add(new zl1(((zl1) yk8Var3.b).a));
                }
                int length3 = yk8VarArr3.length;
                ArrayList arrayList6 = new ArrayList(length3);
                while (i3 < length3) {
                    arrayList6.add(Float.valueOf(((Number) yk8VarArr3[i3].a).floatValue()));
                    i3++;
                }
                return new vo6(i, floatToRawIntBits3, floatToRawIntBits4, arrayList5, arrayList6);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0297  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void u(defpackage.dp3 r22, defpackage.zq5 r23, defpackage.fz0 r24) {
        /*
            Method dump skipped, instructions count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zxe.u(dp3, zq5, fz0):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r3.getConfig() == r4) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.jj v(defpackage.t8b r6) {
        /*
            ml5 r6 = r6.a
            r0 = 0
            if (r6 == 0) goto L4e
            int r1 = r6.e()
            int r2 = r6.d()
            boolean r3 = r6 instanceof defpackage.ql0
            if (r3 == 0) goto L1b
            r4 = r6
            ql0 r4 = (defpackage.ql0) r4
            android.graphics.Bitmap r4 = r4.a
            android.graphics.Bitmap$Config r4 = r4.getConfig()
            goto L1c
        L1b:
            r4 = r0
        L1c:
            if (r4 != 0) goto L20
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
        L20:
            if (r3 == 0) goto L3a
            r3 = r6
            ql0 r3 = (defpackage.ql0) r3
            android.graphics.Bitmap r3 = r3.a
            int r5 = r3.getWidth()
            if (r5 != r1) goto L3a
            int r5 = r3.getHeight()
            if (r5 != r2) goto L3a
            android.graphics.Bitmap$Config r5 = r3.getConfig()
            if (r5 != r4) goto L3a
            goto L46
        L3a:
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r1, r2, r4)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r3)
            r6.h(r1)
        L46:
            if (r3 == 0) goto L4e
            jj r6 = new jj
            r6.<init>(r3)
            return r6
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zxe.v(t8b):jj");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.kt3 w(defpackage.kt3 r17, defpackage.jp5 r18, defpackage.xe8 r19, defpackage.ox9 r20, defpackage.n42 r21) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zxe.w(kt3, jp5, xe8, ox9, n42):kt3");
    }

    public static final boolean x(Throwable th, vt4 vt4Var) {
        List asList;
        Object invoke;
        th.getClass();
        Integer num = g26.a;
        p53 p53Var = null;
        if (num != null && num.intValue() < 19) {
            Method method = ex8.b;
            if (method != null && (invoke = method.invoke(th, null)) != null) {
                asList = Arrays.asList((Throwable[]) invoke);
                asList.getClass();
            } else {
                asList = ks3.a;
            }
        } else {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            asList = Arrays.asList(suppressed);
            asList.getClass();
        }
        int size = asList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) asList.get(i)) instanceof p53) {
                return false;
            }
        }
        try {
            nw1 nw1Var = (nw1) vt4Var.invoke();
            if (nw1Var != null) {
                boolean z2 = nw1Var.b;
                List list = nw1Var.a;
                if (z2) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((ow1) list.get(i2)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                nw1Var.getClass();
                p53Var = new p53(nw1Var);
            }
        } catch (Throwable th2) {
            p53Var = th2;
        }
        if (p53Var != null) {
            pye.e(th, p53Var);
        }
        return z;
    }
}
