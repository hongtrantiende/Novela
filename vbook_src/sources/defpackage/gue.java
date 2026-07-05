package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.common.api.Status;
import com.vbook.android.R;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gue  reason: default package */
/* loaded from: classes3.dex */
public abstract class gue {
    public static final tu1 a = new tu1(new cv1(27), false, 500214464);
    public static final tu1 b = new tu1(new cv1(28), false, -1012572361);

    public static int A(int i, int i2, String str) {
        int i3;
        if ((i2 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = 2097150;
        }
        return (int) z(str, i, 1L, i3);
    }

    public static final void a(int i, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        boolean z;
        String str2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-517431602);
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
            b37 d = fu0.d(kh5.a, false);
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
            jce.F(npVar, rv4Var2, d);
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
            rv4Var2.e0(2015114624);
            if (k4b.j0(str)) {
                str2 = yqe.A((y3b) o2b.P0.getValue(), rv4Var2);
            } else {
                str2 = str;
            }
            rv4Var2.q(false);
            boolean z2 = false;
            cvb.c(str2, null, 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, null, rv4Var, 0, 0, 261118);
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var, pna.h(kq7Var, 24.0f));
            z1d.f(rp5.c((wk3) ok3.g0.getValue(), rv4Var, 0), yqe.A((y3b) b3b.B.getValue(), rv4Var), false, null, null, null, null, null, vt4Var, rv4Var, 100663296, 252);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            ar5 c = rp5.c((wk3) jk3.d.getValue(), rv4Var2, 0);
            nq7 o = nc2.o(kq7Var);
            if ((i5 & 7168) == 2048) {
                z2 = true;
            }
            Object P = rv4Var2.P();
            if (z2 || P == ax1.a) {
                P = new jf3(7, vt4Var2);
                rv4Var2.o0(P);
            }
            kwe.d(c, o, 0L, (vt4) P, rv4Var2, 0, 4);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new qp1(str, nq7Var, vt4Var, vt4Var2, i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v16, types: [int] */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r7v28, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v38 */
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
        aw7 aw7Var;
        int i10;
        aw7 aw7Var2;
        aw7 aw7Var3;
        boolean z6;
        aw7 aw7Var4;
        boolean z7;
        kq7 kq7Var;
        aw7 aw7Var5;
        lh9 lh9Var;
        kd4 kd4Var;
        rv4 rv4Var2;
        rv4 rv4Var3;
        ?? r7;
        ?? r4;
        boolean z8;
        boolean z9;
        lh9 lh9Var2;
        kq7 kq7Var2;
        int i11;
        boolean z10;
        rv4 rv4Var4 = rv4Var;
        u22 u22Var = r0f.d;
        rv4Var4.g0(24056214);
        if (rv4Var4.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i12 = i | i2;
        if (rv4Var4.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i13 = i12 | i3;
        if (rv4Var4.f(str3)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i14 = i13 | i4;
        if (rv4Var4.f(str4)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i15 = i14 | i5;
        if (rv4Var4.f(nq7Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i16 = i15 | i6;
        if (rv4Var4.g(z)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i17 = i16 | i7;
        if (rv4Var4.h(nu4Var)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i18 = i17 | i8;
        if (rv4Var4.h(vt4Var)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i19 = i18 | i9;
        if ((4793491 & i19) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var4.U(i19 & 1, z2)) {
            Object[] objArr = new Object[0];
            int i20 = i19 & Token.ASSIGN_MOD;
            if (i20 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P = rv4Var4.P();
            lh9 lh9Var3 = ax1.a;
            if (z3 || P == lh9Var3) {
                P = new op0(str2, 20);
                rv4Var4.o0(P);
            }
            aw7 aw7Var6 = (aw7) zpe.k(objArr, (vt4) P, rv4Var4, 0);
            Object[] objArr2 = new Object[0];
            if ((i19 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P2 = rv4Var4.P();
            if (z4 || P2 == lh9Var3) {
                P2 = new op0(str3, 18);
                rv4Var4.o0(P2);
            }
            aw7 aw7Var7 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var4, 0);
            Object[] objArr3 = new Object[0];
            if ((i19 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object P3 = rv4Var4.P();
            if (z5 || P3 == lh9Var3) {
                P3 = new op0(str4, 19);
                rv4Var4.o0(P3);
            }
            aw7 aw7Var8 = (aw7) zpe.k(objArr3, (vt4) P3, rv4Var4, 0);
            Object P4 = rv4Var4.P();
            String str5 = null;
            if (P4 == lh9Var3) {
                P4 = yae.z(null);
                rv4Var4.o0(P4);
            }
            aw7 aw7Var9 = (aw7) P4;
            Object P5 = rv4Var4.P();
            if (P5 == lh9Var3) {
                P5 = new zn3(aw7Var9, 6);
                rv4Var4.o0(P5);
            }
            kd4 v = w92.v(av8.a, (xt4) P5, rv4Var4, 54);
            Object[] objArr4 = new Object[0];
            Object P6 = rv4Var4.P();
            if (P6 == lh9Var3) {
                P6 = new qk3(23);
                rv4Var4.o0(P6);
            }
            aw7 aw7Var10 = (aw7) zpe.k(objArr4, (vt4) P6, rv4Var4, 48);
            nk0 nk0Var = kh5.a;
            b37 d = fu0.d(nk0Var, false);
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
            jce.F(npVar, rv4Var4, d);
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
            b37 d2 = fu0.d(nk0Var, false);
            int hashCode3 = Long.hashCode(rv4Var4.T);
            xt8 l3 = rv4Var4.l();
            nq7 p4 = lye.p(rv4Var4, k);
            rv4Var4.i0();
            if (rv4Var4.S) {
                rv4Var4.k(zx1Var);
            } else {
                rv4Var4.r0();
            }
            jce.F(npVar, rv4Var4, d2);
            jce.F(npVar2, rv4Var4, l3);
            s21.t(hashCode3, rv4Var4, npVar3, rv4Var4, kgVar);
            jce.F(npVar4, rv4Var4, p4);
            if (((f76) aw7Var9.getValue()) == null) {
                rv4Var4.e0(-1383938675);
                aw7Var = aw7Var9;
                i10 = i19;
                aw7Var2 = aw7Var6;
                aw7Var3 = aw7Var8;
                do5.c(str, str2, "", "", u22Var, pna.c, rv4Var4, (i19 & 14) | 224640 | i20);
                rv4Var4.q(false);
                r4 = 0;
                kq7Var = kq7Var3;
                aw7Var4 = aw7Var7;
                aw7Var5 = aw7Var10;
                kd4Var = v;
                r7 = 1;
                rv4Var3 = rv4Var4;
                lh9Var = lh9Var3;
            } else {
                aw7Var = aw7Var9;
                i10 = i19;
                aw7Var2 = aw7Var6;
                aw7Var3 = aw7Var8;
                rv4Var4.e0(-1383556755);
                f76 f76Var = (f76) aw7Var.getValue();
                if (f76Var == null) {
                    rv4Var4.e0(-1383556756);
                    rv4Var4.q(false);
                    z7 = false;
                    kq7Var = kq7Var3;
                    aw7Var4 = aw7Var7;
                    aw7Var5 = aw7Var10;
                    kd4Var = v;
                    z6 = true;
                    rv4Var2 = rv4Var4;
                    lh9Var = lh9Var3;
                } else {
                    rv4Var4.e0(-1383556755);
                    z6 = true;
                    aw7Var4 = aw7Var7;
                    z7 = false;
                    kq7Var = kq7Var3;
                    aw7Var5 = aw7Var10;
                    lh9Var = lh9Var3;
                    kd4Var = v;
                    do5.a(f76Var, u22Var, false, null, null, null, pna.c, null, rv4Var4, 12582960, 892);
                    rv4Var2 = rv4Var4;
                    rv4Var2.q(false);
                }
                rv4Var2.q(z7);
                r4 = z7;
                r7 = z6;
                rv4Var3 = rv4Var2;
            }
            rs8.u(rv4Var3, r7, kq7Var, 8.0f, rv4Var3);
            ar5 c = rp5.c((wk3) jk3.P.getValue(), rv4Var3, r4);
            String A = yqe.A((y3b) f2b.W.getValue(), rv4Var3);
            boolean f = rv4Var3.f(kd4Var);
            Object P7 = rv4Var3.P();
            if (f || P7 == lh9Var) {
                P7 = new fe1(kd4Var, 6);
                rv4Var3.o0(P7);
            }
            z1d.f(c, A, false, null, null, null, null, null, (vt4) P7, rv4Var, 0, 252);
            String str6 = (String) nk2.p(kq7Var, 12.0f, rv4Var, aw7Var2);
            v72 v72Var = ((h27) rv4Var.j(tzaVar)).c.b;
            nq7 A2 = zbe.A(pna.f(pna.u(kq7Var, nae.e, 420.0f, r7), 1.0f), 24.0f, nae.e, 2);
            boolean f2 = rv4Var.f(aw7Var2);
            Object P8 = rv4Var.P();
            if (f2 || P8 == lh9Var) {
                P8 = new zn3(aw7Var2, 7);
                rv4Var.o0(P8);
            }
            uwe.h(str6, (xt4) P8, A2, false, false, null, kte.a, null, null, null, false, null, null, null, false, 0, 0, v72Var, null, rv4Var, 1573248, 0, 6291384);
            String str7 = (String) nk2.p(kq7Var, 12.0f, rv4Var, aw7Var4);
            v72 v72Var2 = ((h27) rv4Var.j(tzaVar)).c.b;
            int i21 = i10;
            nq7 A3 = zbe.A(pna.f(pna.u(kq7Var, nae.e, 420.0f, 1), 1.0f), 24.0f, nae.e, 2);
            boolean f3 = rv4Var.f(aw7Var4);
            Object P9 = rv4Var.P();
            if (f3 || P9 == lh9Var) {
                P9 = new zn3(aw7Var4, 8);
                rv4Var.o0(P9);
            }
            uwe.h(str7, (xt4) P9, A3, false, false, null, kte.b, null, null, null, false, null, null, null, false, 0, 0, v72Var2, null, rv4Var, 1573248, 0, 6291384);
            boolean f4 = rv4Var.f((String) nk2.p(kq7Var, 12.0f, rv4Var, aw7Var3));
            Object P10 = rv4Var.P();
            String str8 = P10;
            if (f4 || P10 == lh9Var) {
                String str9 = "";
                String str10 = str9;
                if (((String) aw7Var3.getValue()).length() != 0) {
                    mv6 e = vve.e((String) aw7Var3.getValue());
                    if (e != null) {
                        str5 = e.c(vve.f());
                    }
                    if (str5 != null) {
                        str9 = str5;
                    }
                    str10 = rs8.l(str9, " (", (String) aw7Var3.getValue(), ")");
                }
                rv4Var.o0(str10);
                str8 = str10;
            }
            String str11 = (String) str8;
            String A4 = yqe.A((y3b) x2b.I.getValue(), rv4Var);
            boolean f5 = rv4Var.f(aw7Var5);
            Object P11 = rv4Var.P();
            if (f5 || P11 == lh9Var) {
                P11 = new ea3(aw7Var5, 12);
                rv4Var.o0(P11);
            }
            lh9 lh9Var4 = lh9Var;
            aw7 aw7Var11 = aw7Var4;
            kq7 kq7Var4 = kq7Var;
            aw7 aw7Var12 = aw7Var5;
            twe.e(3072, (vt4) P11, rv4Var, zbe.A(pna.f(pna.u(kq7Var, nae.e, 420.0f, 1), 1.0f), 24.0f, nae.e, 2), str11, A4, null);
            rv4 rv4Var5 = rv4Var;
            xbe.i(rv4Var5, pna.h(kq7Var4, 12.0f));
            if (z) {
                rv4Var5.e0(-1145140769);
                eg0.f(pna.n(kq7Var4, 28.0f), 0L, null, rv4Var, 6, 6);
                rv4Var5 = rv4Var;
                rv4Var5.q(false);
                kq7Var2 = kq7Var4;
                lh9Var2 = lh9Var4;
                i11 = 8388608;
            } else {
                rv4Var5.e0(-1144955296);
                ar5 c2 = rp5.c((wk3) ok3.j0.getValue(), rv4Var5, 0);
                String A5 = yqe.A((y3b) s2b.E0.getValue(), rv4Var5);
                nq7 A6 = zbe.A(pna.f(pna.u(kq7Var4, nae.e, 420.0f, 1), 1.0f), 24.0f, nae.e, 2);
                if (((String) aw7Var2.getValue()).length() > 0 && ((String) aw7Var3.getValue()).length() > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if ((i21 & 3670016) == 1048576) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean f6 = z9 | rv4Var5.f(aw7Var2) | rv4Var5.f(aw7Var11) | rv4Var5.f(aw7Var3);
                Object P12 = rv4Var5.P();
                if (!f6 && P12 != lh9Var4) {
                    lh9Var2 = lh9Var4;
                } else {
                    lh9Var2 = lh9Var4;
                    mc3 mc3Var = new mc3(nu4Var, aw7Var2, aw7Var11, aw7Var3, aw7Var, 2);
                    rv4Var5.o0(mc3Var);
                    P12 = mc3Var;
                }
                kq7Var2 = kq7Var4;
                i11 = 8388608;
                z1d.f(c2, A5, z8, null, A6, null, null, null, (vt4) P12, rv4Var5, 24576, 232);
                rv4Var5.q(false);
            }
            rv4Var5.q(true);
            boolean booleanValue = ((Boolean) aw7Var12.getValue()).booleanValue();
            boolean f7 = rv4Var5.f(aw7Var12);
            Object P13 = rv4Var5.P();
            if (f7 || P13 == lh9Var2) {
                P13 = new zn3(aw7Var12, 5);
                rv4Var5.o0(P13);
            }
            xt4 xt4Var = (xt4) P13;
            boolean f8 = rv4Var5.f(aw7Var3) | rv4Var5.f(aw7Var12);
            Object P14 = rv4Var5.P();
            if (f8 || P14 == lh9Var2) {
                P14 = new pr0(aw7Var3, aw7Var12, 9);
                rv4Var5.o0(P14);
            }
            am8.g(booleanValue, xt4Var, (xt4) P14, rv4Var5, 0);
            ar5 c3 = rp5.c((wk3) jk3.d.getValue(), rv4Var5, 0);
            if ((i21 & 29360128) == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object P15 = rv4Var5.P();
            if (z10 || P15 == lh9Var2) {
                P15 = new jf3(5, vt4Var);
                rv4Var5.o0(P15);
            }
            kwe.d(c3, kq7Var2, 0L, (vt4) P15, rv4Var, 48, 4);
            rv4Var4 = rv4Var;
            rv4Var4.q(true);
        } else {
            rv4Var4.X();
        }
        ek9 u = rv4Var4.u();
        if (u != null) {
            u.d = new lc3(str, str2, str3, str4, nq7Var, z, nu4Var, vt4Var, i, 1);
        }
    }

    public static final void c(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1661059062);
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
            b37 d = fu0.d(kh5.a, false);
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
            jce.F(npVar, rv4Var2, d);
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
            ar5 c = rp5.c((wk3) jk3.d.getValue(), rv4Var, 0);
            nq7 o = nc2.o(kq7Var);
            if ((i5 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new jf3(6, vt4Var);
                rv4Var.o0(P);
            }
            kwe.d(c, o, 0L, (vt4) P, rv4Var, 0, 4);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new k31(str, nq7Var, vt4Var, i, 5);
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
        rv4Var.g0(-925805020);
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
                P = new op0(str, 17);
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
                gi1 a4 = cm9.a(bw3.class);
                bw3 bw3Var = (bw3) ((fdd) voe.z(a4, a2.i(), eub.o(a4.f(), "-", str), pb2Var2, a3, vt4Var));
                boolean f = rv4Var.f(bw3Var);
                Object P2 = rv4Var.P();
                if (f || P2 == lh9Var) {
                    P2 = new cq2(bw3Var, 20);
                    rv4Var.o0(P2);
                }
                tte.d(bw3Var, null, (xt4) P2, rv4Var, 0);
                aw7 z4 = jsc.z(bw3Var.t0, rv4Var);
                aw7 z5 = jsc.z(bw3Var.i1, rv4Var);
                pm1 pm1Var = ((h27) rv4Var.j(j27.a)).a;
                boolean f2 = rv4Var.f((nnb) z4.getValue()) | rv4Var.f(pm1Var);
                Object P3 = rv4Var.P();
                if (f2 || P3 == lh9Var) {
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
                aw7 z7 = jsc.z(bw3Var.z0, rv4Var);
                WeakHashMap weakHashMap = yjd.w;
                ix5 o = w92.o(h88.n(rv4Var).b, rv4Var);
                boolean f3 = rv4Var.f((nnb) z4.getValue());
                Object P4 = rv4Var.P();
                if (f3 || P4 == lh9Var) {
                    th8 th8Var = new th8(((nnb) z4.getValue()).F, ((nnb) z4.getValue()).H, ((nnb) z4.getValue()).G, ((nnb) z4.getValue()).I);
                    rv4Var.o0(th8Var);
                    P4 = th8Var;
                }
                aw7 z8 = jsc.z(bw3Var.A0, rv4Var);
                dxe.l(((nnb) z4.getValue()).o, ((nnb) z4.getValue()).r, ((nnb) z4.getValue()).p, ((nnb) z4.getValue()).q, rv4Var, 0);
                rv4Var2 = rv4Var;
                pc2.f((e6c) aw7Var.getValue(), jce.E(-738317196, new cw3(bw3Var, nq7Var, o, cz7Var2, str, (rh8) P4, aw7Var, z5, z7, z4, z8), rv4Var2), rv4Var2, 48);
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
            u.d = new j31(str, cz7Var, nq7Var, i, 3);
        }
    }

    public static final void e(nq7 nq7Var, rv4 rv4Var, int i) {
        boolean z;
        nq7 nq7Var2;
        rv4 rv4Var2;
        rv4Var.g0(-962476506);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            nq7Var2 = nq7Var;
            rv4Var2 = rv4Var;
            jxe.d(owe.G(rv4Var), yqe.A((y3b) k3b.i.getValue(), rv4Var), yqe.A((y3b) o2b.N0.getValue(), rv4Var), nq7Var2, null, null, rv4Var2, 3072, 48);
        } else {
            nq7Var2 = nq7Var;
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new oa(nq7Var2, i, 23);
        }
    }

    public static final void f(nq7 nq7Var, rv4 rv4Var, int i) {
        boolean z;
        nq7 nq7Var2;
        rv4 rv4Var2;
        rv4Var.g0(321455183);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            nq7Var2 = nq7Var;
            rv4Var2 = rv4Var;
            jxe.d(owe.G(rv4Var), yqe.A((y3b) k3b.j.getValue(), rv4Var), null, nq7Var2, null, null, rv4Var2, 3072, 52);
        } else {
            nq7Var2 = nq7Var;
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new oa(nq7Var2, i, 24);
        }
    }

    public static final void g(ida idaVar, String str, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        rv4 rv4Var2;
        rv4Var.g0(1316945862);
        if (rv4Var.h(idaVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.f(str)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.f(nq7Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(vt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i9 & 1, z)) {
            long j = r0f.y(rv4Var).a;
            nq7 y = zbe.y(lbe.f(15, vt4Var, nmd.v(tte.k(nq7Var, r0f.z(rv4Var).d), rm1.g(r0f.y(rv4Var), 1.0f), lre.g), null, false), 16.0f);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var, 48);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, y);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var, p);
            we6 we6Var = new we6(1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, we6Var);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a3);
            jce.F(npVar2, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p2);
            String str2 = idaVar.a;
            String str3 = idaVar.b;
            dq4 dq4Var = dq4.D;
            cvb.d(t(str2, str, new uva(j, 0L, dq4Var, null, null, null, null, 0L, null, null, null, 0L, null, null, 65530)), null, 0L, 0L, 0L, null, 0L, 2, false, 1, 0, null, null, r0f.A(rv4Var).j, rv4Var, 0, 24960, 241662);
            rv4Var2 = rv4Var;
            if (str3.length() > 0) {
                rv4Var2.e0(-98824717);
                xbe.i(rv4Var2, pna.h(kq7.a, 2.0f));
                cvb.d(t(str3, str, new uva(j, 0L, dq4Var, null, null, null, null, 0L, null, null, null, 0L, null, null, 65530)), null, r0f.y(rv4Var2).s, 0L, 0L, null, 0L, 2, false, 2, 0, null, null, r0f.A(rv4Var2).l, rv4Var2, 0, 24960, 241658);
                rv4Var2 = rv4Var2;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-98379774);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new rj7(idaVar, str, nq7Var, vt4Var, i, 5);
        }
    }

    public static final void h(Map map, String str, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        rv4Var.g0(593178342);
        if (rv4Var.f(map)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.f(str)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        boolean z4 = false;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            ze4 ze4Var = pna.c;
            th8 j = zbe.j(nae.e, nae.e, nae.e, 16.0f, 7);
            if ((i7 & 14) != 4) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((i7 & Token.ASSIGN_MOD) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = z2 | z3;
            if ((i7 & 896) == 256) {
                z4 = true;
            }
            boolean z6 = z5 | z4;
            Object P = rv4Var.P();
            if (z6 || P == ax1.a) {
                P = new r6a(1, map, str, xt4Var);
                rv4Var.o0(P);
            }
            jce.d(ze4Var, null, j, false, null, null, null, false, null, (xt4) P, rv4Var, 390, 506);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new vg7(map, str, xt4Var, i);
        }
    }

    public static final void i(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        cz7 cz7Var2;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(345650139);
        if (rv4Var.f(cz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                kda kdaVar = (kda) ((fdd) voe.z(cm9.a(kda.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z2 = jsc.z(kdaVar.d, rv4Var);
                Object[] objArr = new Object[0];
                Object P = rv4Var.P();
                lh9 lh9Var = ax1.a;
                if (P == lh9Var) {
                    P = new oca(7);
                    rv4Var.o0(P);
                }
                aw7 j = zpe.j(objArr, (vt4) P, rv4Var, 384);
                Object P2 = rv4Var.P();
                if (P2 == lh9Var) {
                    P2 = s21.e(rv4Var);
                }
                zm4 zm4Var = (zm4) P2;
                Object P3 = rv4Var.P();
                if (P3 == lh9Var) {
                    P3 = new l24(zm4Var, null, 9);
                    rv4Var.o0(P3);
                }
                yte.g((lu4) P3, rv4Var, pvc.a);
                cz7Var2 = cz7Var;
                fxe.h(yqe.A((y3b) b3b.b0.getValue(), rv4Var), null, false, jce.E(2075181911, new ri9(cz7Var, 3), rv4Var), null, null, jce.E(1515289574, new jb2(zm4Var, j, kdaVar, cz7Var, z2), rv4Var), rv4Var, 1575936, 54);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            cz7Var2 = cz7Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ri9(cz7Var2, i, 4);
        }
    }

    public static final String j(Object[] objArr, int i, int i2, a3 a3Var) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == a3Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void k(int i, int i2, String str, ArrayList arrayList) {
        if (i >= i2) {
            return;
        }
        arrayList.add(new ad5(o(str.substring(i, i2)), i, i2));
    }

    public static aw7 l() {
        return new hm8(pvc.a, r0f.J);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(defpackage.fw2 r7, defpackage.y60 r8, defpackage.b70 r9, defpackage.xt4 r10, defpackage.n42 r11) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gue.m(fw2, y60, b70, xt4, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        if (r2 == 1.0d) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap n(android.graphics.drawable.Drawable r16, android.graphics.Bitmap.Config r17, defpackage.cna r18, defpackage.hz9 r19, defpackage.cna r20, boolean r21) {
        /*
            r0 = r16
            r1 = r18
            r4 = r19
            r5 = r20
            boolean r2 = r0 instanceof android.graphics.drawable.BitmapDrawable
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r10 = 32
            if (r2 == 0) goto L5d
            r2 = r0
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
            android.graphics.Bitmap r11 = r2.getBitmap()
            android.graphics.Bitmap$Config r2 = r11.getConfig()
            if (r17 == 0) goto L2a
            boolean r3 = defpackage.h50.s(r17)
            if (r3 == 0) goto L27
            goto L2a
        L27:
            r3 = r17
            goto L2c
        L2a:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
        L2c:
            if (r2 != r3) goto L5d
            if (r21 == 0) goto L31
            goto L5c
        L31:
            int r2 = r11.getWidth()
            int r3 = r11.getHeight()
            long r2 = defpackage.ube.u(r2, r3, r1, r4, r5)
            long r6 = r2 >> r10
            int r6 = (int) r6
            long r2 = r2 & r8
            int r2 = (int) r2
            r5 = r2
            int r2 = r11.getWidth()
            int r3 = r11.getHeight()
            r7 = r6
            r6 = r4
            r4 = r7
            r7 = r20
            double r2 = defpackage.ube.v(r2, r3, r4, r5, r6, r7)
            r4 = r6
            r5 = r7
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L5d
        L5c:
            return r11
        L5d:
            android.graphics.drawable.Drawable r6 = r0.mutate()
            int r0 = defpackage.n2d.b(r6)
            r2 = 512(0x200, float:7.17E-43)
            if (r0 <= 0) goto L6a
            goto L6b
        L6a:
            r0 = r2
        L6b:
            int r3 = defpackage.n2d.a(r6)
            if (r3 <= 0) goto L72
            r2 = r3
        L72:
            long r11 = defpackage.ube.u(r0, r2, r1, r4, r5)
            long r13 = r11 >> r10
            int r1 = (int) r13
            long r7 = r11 & r8
            int r3 = (int) r7
            r15 = r2
            r2 = r1
            r1 = r15
            double r2 = defpackage.ube.v(r0, r1, r2, r3, r4, r5)
            double r4 = (double) r0
            double r4 = r4 * r2
            int r0 = defpackage.k27.z(r4)
            double r4 = (double) r1
            double r2 = r2 * r4
            int r1 = defpackage.k27.z(r2)
            if (r17 == 0) goto L9b
            boolean r2 = defpackage.h50.s(r17)
            if (r2 == 0) goto L98
            goto L9b
        L98:
            r2 = r17
            goto L9d
        L9b:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L9d:
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Rect r3 = r6.getBounds()
            int r4 = r3.left
            int r5 = r3.top
            int r7 = r3.right
            int r3 = r3.bottom
            r8 = 0
            r6.setBounds(r8, r8, r0, r1)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r2)
            r6.draw(r0)
            r6.setBounds(r4, r5, r7, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gue.n(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, cna, hz9, cna, boolean):android.graphics.Bitmap");
    }

    public static String o(String str) {
        Object obj = iu3.a;
        ju3 ju3Var = ju3.a;
        if (!ju3Var.equals(obj)) {
            if (ju3Var.equals(ju3Var)) {
                Map map = pb5.a;
                int i = 0;
                if (k4b.f0(str, '&', 0, 6) >= 0) {
                    StringBuilder sb = new StringBuilder(str.length());
                    while (i < str.length()) {
                        char charAt = str.charAt(i);
                        if (charAt != '&') {
                            sb.append(charAt);
                            i++;
                        } else {
                            int i2 = i + 1;
                            int b2 = pb5.b(i2, str);
                            if (b2 < 0) {
                                sb.append(charAt);
                                i = i2;
                            } else {
                                String a2 = pb5.a(str.substring(i2, b2));
                                if (a2 == null) {
                                    sb.append(str.substring(i, b2 + 1));
                                } else {
                                    sb.append(a2);
                                }
                                i = b2 + 1;
                            }
                        }
                    }
                    return sb.toString();
                }
            } else {
                xk5.o();
                return null;
            }
        }
        return str;
    }

    public static fv p(Status status) {
        if (status.c != null) {
            return new fv(status);
        }
        return new fv(status);
    }

    public static final ViewParent q(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final cv9 r(w27 w27Var) {
        Object S = w27Var.S();
        if (S instanceof cv9) {
            return (cv9) S;
        }
        return null;
    }

    public static final float s(cv9 cv9Var) {
        if (cv9Var != null) {
            return cv9Var.a;
        }
        return nae.e;
    }

    public static final ps t(String str, String str2, uva uvaVar) {
        ns nsVar = new ns();
        if (k4b.j0(str2)) {
            nsVar.f(str);
        } else {
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            String lowerCase2 = k4b.N0(str2).toString().toLowerCase(locale);
            lowerCase2.getClass();
            int i = 0;
            while (true) {
                if (i >= str.length()) {
                    break;
                }
                int g0 = k4b.g0(lowerCase, lowerCase2, i, false, 4);
                if (g0 < 0) {
                    nsVar.f(str.substring(i));
                    break;
                }
                nsVar.f(str.substring(i, g0));
                int j = nsVar.j(uvaVar);
                try {
                    nsVar.f(str.substring(g0, lowerCase2.length() + g0));
                    nsVar.h(j);
                    i = lowerCase2.length() + g0;
                } catch (Throwable th) {
                    nsVar.h(j);
                    throw th;
                }
            }
        }
        return nsVar.k();
    }

    public static final void u(aw7 aw7Var) {
        aw7Var.setValue(pvc.a);
    }

    public static boolean v(char c) {
        if (!w(c)) {
            if (('0' > c || c >= ':') && c != '-' && c != '_' && c != ':' && c != '.') {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean w(char c) {
        if ('A' > c || c >= '[') {
            if ('a' <= c && c < '{') {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final void x(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static int y(int i, String str) {
        while (i < str.length() && nqe.y(str.charAt(i))) {
            i++;
        }
        return i;
    }

    public static final long z(String str, long j, long j2, long j3) {
        String str2;
        int i = ogb.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long T = r4b.T(10, str2);
        if (T != null) {
            long longValue = T.longValue();
            if (j2 <= longValue && longValue <= j3) {
                return longValue;
            }
            StringBuilder sb = new StringBuilder("System property '");
            sb.append(str);
            sb.append("' should be in range ");
            sb.append(j2);
            rs8.x(sb, "..", j3, ", but is '");
            sb.append(longValue);
            sb.append('\'');
            throw new IllegalStateException(sb.toString().toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
    }
}
