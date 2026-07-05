package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.WeakHashMap;
import javax.crypto.Mac;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qre  reason: default package */
/* loaded from: classes.dex */
public abstract class qre implements s9f {
    public static final tu1 a = new tu1(new cv1(8), false, 1717749938);
    public static final tu1 b = new tu1(new cv1(9), false, -1235026487);
    public static final tu1 c = new tu1(new cv1(10), false, -366634771);

    public static final void a(int i, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        boolean z;
        String str2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1369888226);
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
            rv4Var2.e0(-438347688);
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
            ar5 c2 = rp5.c((wk3) jk3.d.getValue(), rv4Var2, 0);
            nq7 o = nc2.o(kq7Var);
            if ((i5 & 7168) == 2048) {
                z2 = true;
            }
            Object P = rv4Var2.P();
            if (z2 || P == ax1.a) {
                P = new pp1(26, vt4Var2);
                rv4Var2.o0(P);
            }
            kwe.d(c2, o, 0L, (vt4) P, rv4Var2, 0, 4);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new qp1(str, nq7Var, vt4Var, vt4Var2, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15, types: [int] */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean, int] */
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
        vt4 vt4Var2;
        boolean z3;
        boolean z4;
        boolean z5;
        kd4 kd4Var;
        aw7 aw7Var;
        int i10;
        aw7 aw7Var2;
        ?? r8;
        aw7 aw7Var3;
        kq7 kq7Var;
        aw7 aw7Var4;
        lh9 lh9Var;
        aw7 aw7Var5;
        boolean z6;
        kd4 kd4Var2;
        rv4 rv4Var2;
        rv4 rv4Var3;
        ?? r4;
        int i11;
        int i12;
        boolean z7;
        boolean z8;
        aw7 aw7Var6;
        kq7 kq7Var2;
        lh9 lh9Var2;
        int i13;
        rv4 rv4Var4;
        int i14;
        rv4 rv4Var5 = rv4Var;
        u22 u22Var = r0f.d;
        rv4Var5.g0(-2129918490);
        if (rv4Var5.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i15 = i | i2;
        if (rv4Var5.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i16 = i15 | i3;
        if (rv4Var5.f(str3)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i17 = i16 | i4;
        if (rv4Var5.f(str4)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i18 = i17 | i5;
        if (rv4Var5.f(nq7Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i19 = i18 | i6;
        if (rv4Var5.g(z)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i20 = i19 | i7;
        if (rv4Var5.h(nu4Var)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i21 = i20 | i8;
        if (rv4Var5.h(vt4Var)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i22 = i21 | i9;
        if ((i22 & 4793491) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var5.U(i22 & 1, z2)) {
            Object[] objArr = new Object[0];
            int i23 = i22 & Token.ASSIGN_MOD;
            if (i23 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P = rv4Var5.P();
            lh9 lh9Var3 = ax1.a;
            if (z3 || P == lh9Var3) {
                P = new op0(str2, 12);
                rv4Var5.o0(P);
            }
            aw7 aw7Var7 = (aw7) zpe.k(objArr, (vt4) P, rv4Var5, 0);
            Object[] objArr2 = new Object[0];
            if ((i22 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P2 = rv4Var5.P();
            if (z4 || P2 == lh9Var3) {
                P2 = new op0(str3, 10);
                rv4Var5.o0(P2);
            }
            aw7 aw7Var8 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var5, 0);
            Object[] objArr3 = new Object[0];
            if ((i22 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object P3 = rv4Var5.P();
            if (z5 || P3 == lh9Var3) {
                P3 = new op0(str4, 11);
                rv4Var5.o0(P3);
            }
            aw7 aw7Var9 = (aw7) zpe.k(objArr3, (vt4) P3, rv4Var5, 0);
            Object P4 = rv4Var5.P();
            String str5 = null;
            if (P4 == lh9Var3) {
                P4 = yae.z(null);
                rv4Var5.o0(P4);
            }
            aw7 aw7Var10 = (aw7) P4;
            Object P5 = rv4Var5.P();
            if (P5 == lh9Var3) {
                P5 = new as1(aw7Var10, 23);
                rv4Var5.o0(P5);
            }
            kd4 v = w92.v(av8.a, (xt4) P5, rv4Var5, 54);
            Object[] objArr4 = new Object[0];
            Object P6 = rv4Var5.P();
            if (P6 == lh9Var3) {
                kd4Var = v;
                P6 = new rj2(28);
                rv4Var5.o0(P6);
            } else {
                kd4Var = v;
            }
            aw7 aw7Var11 = (aw7) zpe.k(objArr4, (vt4) P6, rv4Var5, 48);
            nk0 nk0Var = kh5.a;
            b37 d = fu0.d(nk0Var, false);
            int hashCode = Long.hashCode(rv4Var5.T);
            xt8 l = rv4Var5.l();
            nq7 p = lye.p(rv4Var5, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var5.i0();
            if (rv4Var5.S) {
                rv4Var5.k(zx1Var);
            } else {
                rv4Var5.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var5, d);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var5, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var5, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var5);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var5, p);
            kq7 kq7Var3 = kq7.a;
            nq7 C = rte.C(q1d.l(pu0.a.a(pna.c(kq7Var3, 1.0f), kh5.b), rv4Var5, 0), rte.u(rv4Var5), 14);
            xn1 a2 = wn1.a(lz.c, kh5.J, rv4Var5, 48);
            int hashCode2 = Long.hashCode(rv4Var5.T);
            xt8 l2 = rv4Var5.l();
            nq7 p2 = lye.p(rv4Var5, C);
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
            xbe.i(rv4Var5, pna.h(kq7Var3, 44.0f));
            nq7 p3 = pna.p(kq7Var3, 120.0f, 180.0f);
            tza tzaVar = j27.a;
            nq7 k = tte.k(p3, ((h27) rv4Var5.j(tzaVar)).c.b);
            b37 d2 = fu0.d(nk0Var, false);
            int hashCode3 = Long.hashCode(rv4Var5.T);
            xt8 l3 = rv4Var5.l();
            nq7 p4 = lye.p(rv4Var5, k);
            rv4Var5.i0();
            if (rv4Var5.S) {
                rv4Var5.k(zx1Var);
            } else {
                rv4Var5.r0();
            }
            jce.F(npVar, rv4Var5, d2);
            jce.F(npVar2, rv4Var5, l3);
            s21.t(hashCode3, rv4Var5, npVar3, rv4Var5, kgVar);
            jce.F(npVar4, rv4Var5, p4);
            if (((f76) aw7Var10.getValue()) == null) {
                rv4Var5.e0(-951993215);
                aw7Var = aw7Var10;
                i10 = i22;
                aw7Var2 = aw7Var8;
                r8 = 1;
                do5.c(str, str2, "", "", u22Var, pna.c, rv4Var5, (i22 & 14) | 224640 | i23);
                rv4Var5.q(false);
                r4 = 0;
                kq7Var = kq7Var3;
                aw7Var5 = aw7Var7;
                aw7Var3 = aw7Var9;
                kd4Var2 = kd4Var;
                aw7Var4 = aw7Var11;
                rv4Var3 = rv4Var5;
                lh9Var = lh9Var3;
            } else {
                aw7Var = aw7Var10;
                i10 = i22;
                aw7Var2 = aw7Var8;
                r8 = 1;
                rv4Var5.e0(-951611295);
                f76 f76Var = (f76) aw7Var.getValue();
                if (f76Var == null) {
                    rv4Var5.e0(-951611296);
                    rv4Var5.q(false);
                    z6 = false;
                    kq7Var = kq7Var3;
                    aw7Var5 = aw7Var7;
                    aw7Var3 = aw7Var9;
                    kd4Var2 = kd4Var;
                    aw7Var4 = aw7Var11;
                    rv4Var2 = rv4Var5;
                    lh9Var = lh9Var3;
                } else {
                    rv4Var5.e0(-951611295);
                    aw7Var3 = aw7Var9;
                    kq7Var = kq7Var3;
                    aw7Var4 = aw7Var11;
                    lh9Var = lh9Var3;
                    aw7Var5 = aw7Var7;
                    z6 = false;
                    kd4Var2 = kd4Var;
                    do5.a(f76Var, u22Var, false, null, null, null, pna.c, null, rv4Var5, 12582960, 892);
                    rv4Var2 = rv4Var5;
                    rv4Var2.q(false);
                }
                rv4Var2.q(z6);
                r4 = z6;
                rv4Var3 = rv4Var2;
            }
            rs8.u(rv4Var3, r8, kq7Var, 8.0f, rv4Var3);
            ar5 c2 = rp5.c((wk3) jk3.P.getValue(), rv4Var3, r4);
            String A = yqe.A((y3b) f2b.W.getValue(), rv4Var3);
            boolean f = rv4Var3.f(kd4Var2);
            Object P7 = rv4Var3.P();
            if (f || P7 == lh9Var) {
                P7 = new fe1(kd4Var2, 4);
                rv4Var3.o0(P7);
            }
            z1d.f(c2, A, false, null, null, null, null, null, (vt4) P7, rv4Var, 0, 252);
            String str6 = (String) nk2.p(kq7Var, 12.0f, rv4Var, aw7Var5);
            v72 v72Var = ((h27) rv4Var.j(tzaVar)).c.b;
            nq7 A2 = zbe.A(pna.f(pna.u(kq7Var, nae.e, 420.0f, r8), 1.0f), 24.0f, nae.e, 2);
            boolean f2 = rv4Var.f(aw7Var5);
            Object P8 = rv4Var.P();
            if (f2 || P8 == lh9Var) {
                P8 = new as1(aw7Var5, 24);
                rv4Var.o0(P8);
            }
            uwe.h(str6, (xt4) P8, A2, false, false, null, hre.a, null, null, null, false, null, null, null, false, 0, 0, v72Var, null, rv4Var, 1573248, 0, 6291384);
            String str7 = (String) nk2.p(kq7Var, 12.0f, rv4Var, aw7Var2);
            v72 v72Var2 = ((h27) rv4Var.j(tzaVar)).c.b;
            int i24 = i10;
            nq7 A3 = zbe.A(pna.f(pna.u(kq7Var, nae.e, 420.0f, 1), 1.0f), 24.0f, nae.e, 2);
            boolean f3 = rv4Var.f(aw7Var2);
            Object P9 = rv4Var.P();
            if (f3 || P9 == lh9Var) {
                P9 = new as1(aw7Var2, 25);
                rv4Var.o0(P9);
            }
            uwe.h(str7, (xt4) P9, A3, false, false, null, hre.b, null, null, null, false, null, null, null, false, 0, 0, v72Var2, null, rv4Var, 1573248, 0, 6291384);
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
            boolean f5 = rv4Var.f(aw7Var4);
            Object P11 = rv4Var.P();
            if (!f5 && P11 != lh9Var) {
                i11 = 2;
            } else {
                i11 = 2;
                P11 = new ea3(aw7Var4, 2);
                rv4Var.o0(P11);
            }
            aw7 aw7Var12 = aw7Var3;
            nq7 A5 = zbe.A(pna.f(pna.u(kq7Var, nae.e, 420.0f, 1), 1.0f), 24.0f, nae.e, i11);
            lh9 lh9Var4 = lh9Var;
            kq7 kq7Var4 = kq7Var;
            aw7 aw7Var13 = aw7Var4;
            twe.e(3072, (vt4) P11, rv4Var, A5, str11, A4, null);
            xbe.i(rv4Var, pna.h(kq7Var4, 12.0f));
            if (z) {
                rv4Var.e0(780013910);
                eg0.f(pna.n(kq7Var4, 28.0f), ((h27) rv4Var.j(tzaVar)).a.d, null, rv4Var, 6, 4);
                i12 = 0;
                rv4Var.q(false);
                aw7Var6 = aw7Var12;
                kq7Var2 = kq7Var4;
                i13 = 8388608;
                rv4Var4 = rv4Var;
                lh9Var2 = lh9Var4;
            } else {
                i12 = 0;
                rv4Var.e0(780204746);
                ar5 c3 = rp5.c((wk3) ok3.j0.getValue(), rv4Var, 0);
                String A6 = yqe.A((y3b) s2b.E0.getValue(), rv4Var);
                if (((String) aw7Var5.getValue()).length() > 0 && ((String) aw7Var12.getValue()).length() > 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                nq7 A7 = zbe.A(pna.f(pna.u(kq7Var4, nae.e, 420.0f, 1), 1.0f), 24.0f, nae.e, 2);
                if ((i24 & 3670016) == 1048576) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean f6 = z8 | rv4Var.f(aw7Var5) | rv4Var.f(aw7Var2) | rv4Var.f(aw7Var12);
                Object P12 = rv4Var.P();
                if (!f6 && P12 != lh9Var4) {
                    aw7Var6 = aw7Var12;
                } else {
                    P12 = new mc3(nu4Var, aw7Var5, aw7Var2, aw7Var12, aw7Var, 0);
                    aw7Var6 = aw7Var12;
                    rv4Var.o0(P12);
                }
                kq7Var2 = kq7Var4;
                lh9Var2 = lh9Var4;
                boolean z9 = z7;
                i13 = 8388608;
                z1d.f(c3, A6, z9, null, A7, null, null, null, (vt4) P12, rv4Var, 24576, 232);
                rv4Var4 = rv4Var;
                rv4Var4.q(false);
            }
            rv4Var4.q(true);
            boolean booleanValue = ((Boolean) aw7Var13.getValue()).booleanValue();
            boolean f7 = rv4Var4.f(aw7Var13);
            Object P13 = rv4Var4.P();
            if (f7 || P13 == lh9Var2) {
                P13 = new as1(aw7Var13, 22);
                rv4Var4.o0(P13);
            }
            xt4 xt4Var = (xt4) P13;
            boolean f8 = rv4Var4.f(aw7Var6) | rv4Var4.f(aw7Var13);
            Object P14 = rv4Var4.P();
            if (f8 || P14 == lh9Var2) {
                P14 = new pr0(aw7Var6, aw7Var13, 6);
                rv4Var4.o0(P14);
            }
            am8.g(booleanValue, xt4Var, (xt4) P14, rv4Var4, i12);
            ar5 c4 = rp5.c((wk3) jk3.d.getValue(), rv4Var4, i12);
            if ((i24 & 29360128) == i13) {
                i14 = 1;
            } else {
                i14 = i12;
            }
            Object P15 = rv4Var4.P();
            if (i14 == 0 && P15 != lh9Var2) {
                vt4Var2 = vt4Var;
            } else {
                vt4Var2 = vt4Var;
                P15 = new pp1(24, vt4Var2);
                rv4Var4.o0(P15);
            }
            rv4 rv4Var6 = rv4Var4;
            kwe.d(c4, kq7Var2, 0L, (vt4) P15, rv4Var6, 48, 4);
            rv4Var5 = rv4Var6;
            rv4Var5.q(true);
        } else {
            vt4Var2 = vt4Var;
            rv4Var5.X();
        }
        ek9 u = rv4Var5.u();
        if (u != null) {
            u.d = new lc3(str, str2, str3, str4, nq7Var, z, nu4Var, vt4Var2, i, 0);
        }
    }

    public static final void d(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1084100934);
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
            ar5 c2 = rp5.c((wk3) jk3.d.getValue(), rv4Var, 0);
            nq7 o = nc2.o(kq7Var);
            if ((i5 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new pp1(25, vt4Var);
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
            u.d = new k31(str, nq7Var, vt4Var, i, 4);
        }
    }

    public static final void e(int i, rv4 rv4Var, nq7 nq7Var, cz7 cz7Var, String str) {
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
        rv4Var.g0(1786729460);
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
                P = new op0(str, 9);
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
                gi1 a4 = cm9.a(kc3.class);
                kc3 kc3Var = (kc3) ((fdd) voe.z(a4, a2.i(), eub.o(a4.f(), "-", str), pb2Var2, a3, vt4Var));
                boolean f = rv4Var.f(kc3Var);
                Object P2 = rv4Var.P();
                if (f || P2 == lh9Var) {
                    P2 = new cq2(kc3Var, 14);
                    rv4Var.o0(P2);
                }
                tte.d(kc3Var, null, (xt4) P2, rv4Var, 0);
                aw7 z4 = jsc.z(kc3Var.t0, rv4Var);
                aw7 z5 = jsc.z(kc3Var.i1, rv4Var);
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
                aw7 z7 = jsc.z(kc3Var.z0, rv4Var);
                WeakHashMap weakHashMap = yjd.w;
                ix5 o = w92.o(h88.n(rv4Var).b, rv4Var);
                boolean f3 = rv4Var.f((nnb) z4.getValue());
                Object P4 = rv4Var.P();
                if (f3 || P4 == lh9Var) {
                    th8 th8Var = new th8(((nnb) z4.getValue()).F, ((nnb) z4.getValue()).H, ((nnb) z4.getValue()).G, ((nnb) z4.getValue()).I);
                    rv4Var.o0(th8Var);
                    P4 = th8Var;
                }
                aw7 z8 = jsc.z(kc3Var.A0, rv4Var);
                dxe.l(((nnb) z4.getValue()).o, ((nnb) z4.getValue()).r, ((nnb) z4.getValue()).p, ((nnb) z4.getValue()).q, rv4Var, 0);
                rv4Var2 = rv4Var;
                pc2.f((e6c) aw7Var.getValue(), jce.E(-1076191324, new nc3(kc3Var, nq7Var, o, cz7Var2, str, (rh8) P4, aw7Var, z5, z7, z4, z8), rv4Var2), rv4Var2, 48);
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
            u.d = new j31(str, cz7Var, nq7Var, i, 2);
        }
    }

    public static final void f(l88 l88Var, dc dcVar, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        boolean h;
        int i5;
        rv4Var.g0(-1090171650);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var.f(l88Var);
            } else {
                h = rv4Var.h(l88Var);
            }
            if (h) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(dcVar)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(tu1Var)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        }
        boolean z3 = true;
        if ((i2 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            if ((i2 & Token.ASSIGN_MOD) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !rv4Var.f(l88Var))) {
                z3 = false;
            }
            boolean z4 = z2 | z3;
            Object P = rv4Var.P();
            if (z4 || P == ax1.a) {
                P = new i35(dcVar, l88Var);
                rv4Var.o0(P);
            }
            tk.a((i35) P, null, new m29(false, i4a.a, false), tu1Var, rv4Var, ((i2 << 3) & 7168) | 384, 2);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new va(l88Var, dcVar, tu1Var, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(nk6 nk6Var, boolean z, float f, rh8 rh8Var, float f2, long j, long j2, wea weaVar, h3a h3aVar, g3a g3aVar, int i, rv4 rv4Var, int i2, int i3) {
        int i4;
        int i5;
        boolean z2;
        yya yyaVar;
        yya yyaVar2;
        dm8 dm8Var;
        yya yyaVar3;
        float f3;
        yya yyaVar4;
        xt4 xt4Var;
        dm8 dm8Var2;
        lh9 lh9Var;
        int i6;
        yya yyaVar5;
        int i7;
        aw7 aw7Var;
        yya yyaVar6;
        int i8;
        nk6 nk6Var2;
        int i9;
        int i10;
        int ordinal;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        nk6Var.getClass();
        rh8Var.getClass();
        rv4Var.g0(-1720080850);
        if ((i2 & 6) == 0) {
            if (rv4Var.f(nk6Var)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i4 = i21 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f(kq7.a)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i4 |= i20;
        }
        int i22 = i2 & 384;
        int i23 = Token.CASE;
        if (i22 == 0) {
            if (rv4Var.g(z)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i4 |= i19;
        }
        int i24 = 2048;
        if ((i2 & 3072) == 0) {
            if (rv4Var.g(false)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i4 |= i18;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var.c(f)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i4 |= i17;
        }
        if ((i2 & 196608) == 0) {
            if (rv4Var.f(rh8Var)) {
                i16 = 131072;
            } else {
                i16 = Parser.ARGC_LIMIT;
            }
            i4 |= i16;
        }
        if ((i2 & 1572864) == 0) {
            if (rv4Var.c(f2)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i4 |= i15;
        }
        if ((i2 & 12582912) == 0) {
            if (rv4Var.e(j)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i4 |= i14;
        }
        if ((i2 & 100663296) == 0) {
            if (rv4Var.e(j2)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i4 |= i13;
        }
        if ((i2 & 805306368) == 0) {
            if (rv4Var.f(weaVar)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i4 |= i12;
        }
        int i25 = -1;
        if ((i3 & 6) == 0) {
            if (h3aVar == null) {
                ordinal = -1;
            } else {
                ordinal = h3aVar.ordinal();
            }
            if (rv4Var.d(ordinal)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i11 | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            if (g3aVar != null) {
                i25 = g3aVar.ordinal();
            }
            if (rv4Var.d(i25)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i5 |= i10;
        }
        if ((i3 & 384) == 0) {
            if (rv4Var.d(i)) {
                i23 = 256;
            }
            i5 |= i23;
        }
        if ((i3 & 3072) == 0) {
            if (!rv4Var.h(null)) {
                i24 = 1024;
            }
            i5 |= i24;
        }
        int i26 = i5;
        if ((306783379 & i4) == 306783378 && (i26 & 1171) == 1170) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var.U(i4 & 1, z2)) {
            rv4Var.Z();
            if ((i2 & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
            }
            rv4Var.r();
            Object P = rv4Var.P();
            lh9 lh9Var2 = ax1.a;
            if (P == lh9Var2) {
                P = yae.q(new wi6(nk6Var, 1));
                rv4Var.o0(P);
            }
            yya yyaVar7 = (yya) P;
            Object P2 = rv4Var.P();
            if (P2 == lh9Var2) {
                P2 = yte.s(rv4Var);
                rv4Var.o0(P2);
            }
            m82 m82Var = (m82) P2;
            int i27 = i4;
            Object P3 = rv4Var.P();
            if (P3 == lh9Var2) {
                P3 = yae.z(Boolean.FALSE);
                rv4Var.o0(P3);
            }
            aw7 aw7Var2 = (aw7) P3;
            Object P4 = rv4Var.P();
            if (P4 == lh9Var2) {
                P4 = hl5.g(nae.e, rv4Var);
            }
            dm8 dm8Var3 = (dm8) P4;
            Object P5 = rv4Var.P();
            if (P5 == lh9Var2) {
                yyaVar = yyaVar7;
                P5 = yae.q(new wi6(nk6Var, 2));
                rv4Var.o0(P5);
            } else {
                yyaVar = yyaVar7;
            }
            yya yyaVar8 = (yya) P5;
            Object P6 = rv4Var.P();
            if (P6 == lh9Var2) {
                P6 = yae.q(new wi6(nk6Var, 3));
                rv4Var.o0(P6);
            }
            yya yyaVar9 = (yya) P6;
            Object P7 = rv4Var.P();
            if (P7 == lh9Var2) {
                yyaVar2 = yyaVar9;
                P7 = yae.q(new mf6(6, nk6Var, yyaVar8));
                rv4Var.o0(P7);
            } else {
                yyaVar2 = yyaVar9;
            }
            yya yyaVar10 = (yya) P7;
            Object P8 = rv4Var.P();
            if (P8 == lh9Var2) {
                dm8Var = dm8Var3;
                yyaVar3 = yyaVar2;
                P8 = yae.q(new xw0(nk6Var, yyaVar8, yyaVar3, yyaVar10, 8));
                rv4Var.o0(P8);
            } else {
                dm8Var = dm8Var3;
                yyaVar3 = yyaVar2;
            }
            yya yyaVar11 = (yya) P8;
            Object P9 = rv4Var.P();
            if (P9 == lh9Var2) {
                f3 = f2;
                P9 = yae.q(new ef6(f3, yyaVar11, 2));
                rv4Var.o0(P9);
            } else {
                f3 = f2;
            }
            yya yyaVar12 = (yya) P9;
            Object P10 = rv4Var.P();
            if (P10 == lh9Var2) {
                P10 = yae.q(new ff6(nk6Var, yyaVar8, yyaVar3, f3, yyaVar11));
                rv4Var.o0(P10);
            }
            yya yyaVar13 = (yya) P10;
            Object P11 = rv4Var.P();
            if (P11 == lh9Var2) {
                P11 = new gf6(yyaVar12, dm8Var, 2);
                rv4Var.o0(P11);
            }
            xt4 xt4Var2 = (xt4) P11;
            Object P12 = rv4Var.P();
            if (P12 == lh9Var2) {
                yyaVar5 = yyaVar12;
                lh9Var = lh9Var2;
                yyaVar4 = yyaVar13;
                i7 = i27;
                aw7Var = aw7Var2;
                yyaVar6 = yyaVar;
                dm8 dm8Var4 = dm8Var;
                i6 = i26;
                wg6 wg6Var = new wg6(xt4Var2, nk6Var, m82Var, yyaVar3, dm8Var4, f2, yyaVar11, yyaVar8, 1);
                xt4Var = xt4Var2;
                nk6Var2 = nk6Var;
                dm8Var2 = dm8Var4;
                i8 = 1;
                rv4Var.o0(wg6Var);
                P12 = wg6Var;
            } else {
                yyaVar4 = yyaVar13;
                xt4Var = xt4Var2;
                dm8Var2 = dm8Var;
                lh9Var = lh9Var2;
                i6 = i26;
                yyaVar5 = yyaVar12;
                i7 = i27;
                aw7Var = aw7Var2;
                yyaVar6 = yyaVar;
                i8 = 1;
                nk6Var2 = nk6Var;
            }
            xt4 xt4Var3 = (xt4) P12;
            Object P13 = rv4Var.P();
            if (P13 == lh9Var) {
                P13 = new qp4(aw7Var, 25);
                rv4Var.o0(P13);
            }
            xt4 xt4Var4 = (xt4) P13;
            if (!nk6Var2.n.a() && !((Boolean) aw7Var.getValue()).booleanValue()) {
                i9 = 0;
            } else {
                i9 = i8;
            }
            Object P14 = rv4Var.P();
            if (P14 == lh9Var) {
                P14 = new jw0(yyaVar6, 29);
                rv4Var.o0(P14);
            }
            vt4 vt4Var = (vt4) P14;
            boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
            float h = dm8Var2.h();
            Object P15 = rv4Var.P();
            if (P15 == lh9Var) {
                P15 = new xk6(yyaVar5, 0);
                rv4Var.o0(P15);
            }
            vt4 vt4Var2 = (vt4) P15;
            Object P16 = rv4Var.P();
            if (P16 == lh9Var) {
                P16 = new xk6(yyaVar4, i8);
                rv4Var.o0(P16);
            }
            int i28 = i7;
            int i29 = i28 >> 3;
            i(rh8Var, z, i, weaVar, f, j, j2, g3aVar, h3aVar, vt4Var, booleanValue, h, vt4Var2, (vt4) P16, i9, xt4Var, xt4Var3, xt4Var4, rv4Var, ((i28 << 3) & 458752) | (i29 & 14) | ((i28 >> 12) & Token.ASSIGN_MOD) | (i28 & 896) | ((i6 << 3) & 7168) | ((i28 >> 15) & 57344) | (3670016 & i29) | (i29 & 29360128) | ((i6 << 21) & 234881024) | ((i6 << 27) & 1879048192), ((i6 >> 9) & 14) | 918773808);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lf6(nk6Var, z, f, rh8Var, f2, j, j2, weaVar, h3aVar, g3aVar, i, i2, i3);
        }
    }

    public static final void h(nk6 nk6Var, nq7 nq7Var, boolean z, float f, rh8 rh8Var, float f2, long j, long j2, wea weaVar, h3a h3aVar, g3a g3aVar, int i, boolean z2, tu1 tu1Var, rv4 rv4Var, int i2) {
        int i3;
        rh8 rh8Var2;
        long j3;
        boolean z3;
        rv4 rv4Var2;
        boolean z4;
        float f3;
        float f4;
        wea weaVar2;
        h3a h3aVar2;
        g3a g3aVar2;
        boolean z5;
        wea weaVar3;
        float f5;
        h3a h3aVar3;
        int i4;
        boolean z6;
        boolean z7;
        float f6;
        g3a g3aVar3;
        h3a h3aVar4;
        wea weaVar4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        nk6Var.getClass();
        rh8Var.getClass();
        rv4Var.g0(-1401568378);
        if ((i2 & 6) == 0) {
            if (rv4Var.f(nk6Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i2 | i9;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        int i10 = i3 | 28032;
        if ((i2 & 196608) == 0) {
            rh8Var2 = rh8Var;
            if (rv4Var.f(rh8Var2)) {
                i7 = 131072;
            } else {
                i7 = Parser.ARGC_LIMIT;
            }
            i10 |= i7;
        } else {
            rh8Var2 = rh8Var;
        }
        int i11 = i10 | 1572864;
        if ((i2 & 12582912) == 0) {
            if (rv4Var.e(j)) {
                i6 = 8388608;
            } else {
                i6 = 4194304;
            }
            i11 |= i6;
        }
        if ((i2 & 100663296) == 0) {
            j3 = j2;
            if (rv4Var.e(j3)) {
                i5 = 67108864;
            } else {
                i5 = 33554432;
            }
            i11 |= i5;
        } else {
            j3 = j2;
        }
        if ((i2 & 805306368) == 0) {
            i11 |= 268435456;
        }
        if ((306783379 & i11) == 306783378) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (rv4Var.U(i11 & 1, z3)) {
            rv4Var.Z();
            if ((i2 & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                f5 = f;
                f6 = f2;
                weaVar3 = weaVar;
                h3aVar3 = h3aVar;
                z7 = z2;
                i4 = i11 & (-1879048193);
                z6 = z;
                g3aVar3 = g3aVar;
            } else {
                weaVar3 = uu9.a;
                f5 = 3.0f;
                h3aVar3 = h3a.a;
                i4 = i11 & (-1879048193);
                z6 = true;
                z7 = true;
                f6 = 0.1f;
                g3aVar3 = g3a.a;
            }
            rv4Var.r();
            if (!z7) {
                rv4Var.e0(1549278243);
                tu1Var.invoke(rv4Var, 6);
                rv4Var.q(false);
                rv4Var2 = rv4Var;
                z4 = z6;
                f3 = f5;
                h3aVar4 = h3aVar3;
                weaVar4 = weaVar3;
            } else {
                rv4Var.e0(1549332586);
                b37 d = fu0.d(kh5.a, false);
                g3a g3aVar4 = g3aVar3;
                int hashCode = Long.hashCode(rv4Var.T);
                xt8 l = rv4Var.l();
                nq7 p = lye.p(rv4Var, nq7Var);
                rw1.k.getClass();
                zx1 zx1Var = qw1.b;
                rv4Var.i0();
                boolean z8 = z6;
                if (rv4Var.S) {
                    rv4Var.k(zx1Var);
                } else {
                    rv4Var.r0();
                }
                jce.F(qw1.f, rv4Var, d);
                jce.F(qw1.e, rv4Var, l);
                jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                jce.C(qw1.h, rv4Var);
                jce.F(qw1.d, rv4Var, p);
                tu1Var.invoke(rv4Var, 6);
                g3aVar3 = g3aVar4;
                z4 = z8;
                f3 = f5;
                h3aVar4 = h3aVar3;
                weaVar4 = weaVar3;
                g(nk6Var, z4, f3, rh8Var2, f6, j, j3, weaVar4, h3aVar4, g3aVar3, i, rv4Var, (i4 & 14) | 48 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4), 3510);
                rv4Var2 = rv4Var;
                rv4Var2.q(true);
                rv4Var2.q(false);
            }
            f4 = f6;
            weaVar2 = weaVar4;
            h3aVar2 = h3aVar4;
            g3aVar2 = g3aVar3;
            z5 = z7;
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
            z4 = z;
            f3 = f;
            f4 = f2;
            weaVar2 = weaVar;
            h3aVar2 = h3aVar;
            g3aVar2 = g3aVar;
            z5 = z2;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new df6(nk6Var, nq7Var, z4, f3, rh8Var, f4, j, j2, weaVar2, h3aVar2, g3aVar2, i, z5, tu1Var, i2, 1);
        }
    }

    public static final void i(final rh8 rh8Var, final boolean z, final int i, final wea weaVar, final float f, final long j, final long j2, final g3a g3aVar, final h3a h3aVar, final vt4 vt4Var, final boolean z2, final float f2, final vt4 vt4Var2, final vt4 vt4Var3, final boolean z3, final xt4 xt4Var, final xt4 xt4Var2, final xt4 xt4Var3, rv4 rv4Var, final int i2, final int i3) {
        int i4;
        boolean z4;
        int i5;
        int i6;
        boolean z5;
        float f3;
        rv4Var.g0(932687357);
        int i7 = i2 & 6;
        kq7 kq7Var = kq7.a;
        if (i7 == 0) {
            i4 = (rv4Var.f(kq7Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= rv4Var.f(rh8Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z4 = z;
            i4 |= rv4Var.g(z4) ? 256 : Token.CASE;
        } else {
            z4 = z;
        }
        if ((i2 & 3072) == 0) {
            i4 |= rv4Var.d(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= rv4Var.f(weaVar) ? 16384 : 8192;
        }
        int i8 = i2 & 196608;
        int i9 = Parser.ARGC_LIMIT;
        if (i8 == 0) {
            i4 |= rv4Var.c(f) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= rv4Var.e(j) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= rv4Var.e(j2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= rv4Var.d(g3aVar.ordinal()) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 = 805306368;
            i4 |= rv4Var.d(h3aVar.ordinal()) ? 536870912 : 268435456;
        } else {
            i5 = 805306368;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (rv4Var.h(null) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= rv4Var.h(vt4Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            z5 = z2;
            i6 |= rv4Var.g(z5) ? 256 : Token.CASE;
        } else {
            z5 = z2;
        }
        if ((i3 & 3072) == 0) {
            f3 = f2;
            i6 |= rv4Var.c(f3) ? 2048 : 1024;
        } else {
            f3 = f2;
        }
        int i10 = i4;
        if ((i3 & 24576) == 0) {
            i6 |= rv4Var.h(vt4Var2) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            if (rv4Var.h(vt4Var3)) {
                i9 = 131072;
            }
            i6 |= i9;
        }
        if ((i3 & 1572864) == 0) {
            i6 |= rv4Var.g(z3) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i6 |= rv4Var.h(xt4Var) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i6 |= rv4Var.h(xt4Var2) ? 67108864 : 33554432;
        }
        if ((i3 & i5) == 0) {
            i6 |= rv4Var.h(xt4Var3) ? 536870912 : 268435456;
        }
        if (rv4Var.U(i10 & 1, ((i10 & 306783379) == 306783378 && (i6 & 306783379) == 306783378) ? false : true)) {
            nq7 f4 = pna.f(kq7Var, 1.0f);
            int i11 = i10 & Token.ASSIGN_MOD;
            boolean z6 = i11 == 32;
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z6 || P == obj) {
                P = new rg3(rh8Var.d());
                rv4Var.o0(P);
            }
            float f5 = ((rg3) P).a;
            boolean z7 = i11 == 32;
            Object P2 = rv4Var.P();
            if (z7 || P2 == obj) {
                Object rg3Var = new rg3(rh8Var.a());
                rv4Var.o0(rg3Var);
                P2 = rg3Var;
            }
            final float f6 = f3;
            final boolean z8 = z4;
            final boolean z9 = z5;
            hc2.b(zbe.C(f4, nae.e, f5, nae.e, ((rg3) P2).a, 5), null, jce.E(672783335, new mu4(z8, z9, j2, j, i, weaVar, f, g3aVar, xt4Var2, f6, h3aVar, vt4Var2, vt4Var3, z3, vt4Var, xt4Var, xt4Var3) { // from class: uk6
                public final /* synthetic */ wea C;
                public final /* synthetic */ float D;
                public final /* synthetic */ g3a E;
                public final /* synthetic */ xt4 F;
                public final /* synthetic */ float G;
                public final /* synthetic */ h3a H;
                public final /* synthetic */ vt4 I;
                public final /* synthetic */ vt4 J;
                public final /* synthetic */ boolean K;
                public final /* synthetic */ xt4 L;
                public final /* synthetic */ xt4 M;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ int f;

                {
                    this.L = xt4Var;
                    this.M = xt4Var3;
                }

                @Override // defpackage.mu4
                public final Object c(Object obj2, Object obj3, Object obj4) {
                    boolean z10;
                    float o;
                    f3a f3aVar;
                    long j3;
                    boolean z11;
                    vt4 vt4Var4;
                    nq7 a2;
                    int i12;
                    su0 su0Var = (su0) obj2;
                    rv4 rv4Var2 = (rv4) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    su0Var.getClass();
                    if ((intValue & 6) == 0) {
                        if (rv4Var2.f(su0Var)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        intValue |= i12;
                    }
                    if ((intValue & 19) != 18) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z10)) {
                        final float h = x02.h(su0Var.b);
                        tc6 tc6Var = (tc6) rv4Var2.j(dy1.n);
                        rh8 rh8Var2 = rh8.this;
                        boolean f7 = rv4Var2.f(rh8Var2) | rv4Var2.d(tc6Var.ordinal());
                        Object P3 = rv4Var2.P();
                        boolean z12 = this.b;
                        lh9 lh9Var = ax1.a;
                        if (f7 || P3 == lh9Var) {
                            if (z12) {
                                o = zbe.n(rh8Var2, tc6Var);
                            } else {
                                o = zbe.o(rh8Var2, tc6Var);
                            }
                            P3 = new rg3(o);
                            rv4Var2.o0(P3);
                        }
                        float f8 = ((rg3) P3).a;
                        if (z12) {
                            f3aVar = f3a.b;
                        } else {
                            f3aVar = f3a.a;
                        }
                        f3a f3aVar2 = f3aVar;
                        final boolean z13 = this.c;
                        if (z13) {
                            j3 = this.d;
                        } else {
                            j3 = this.e;
                        }
                        int i13 = this.f;
                        wea weaVar2 = this.C;
                        boolean d = rv4Var2.d(i13) | rv4Var2.c(f8) | rv4Var2.f(weaVar2);
                        float f9 = this.D;
                        boolean c2 = d | rv4Var2.c(f9) | rv4Var2.e(j3) | rv4Var2.d(f3aVar2.ordinal());
                        g3a g3aVar2 = this.E;
                        boolean d2 = c2 | rv4Var2.d(g3aVar2.ordinal());
                        Object P4 = rv4Var2.P();
                        if (d2 || P4 == lh9Var) {
                            e3a e3aVar = new e3a(i13, f8, weaVar2, f9, j3, f3aVar2, g3aVar2);
                            rv4Var2.o0(e3aVar);
                            P4 = e3aVar;
                        }
                        e3a e3aVar2 = (e3a) P4;
                        boolean f10 = rv4Var2.f(null);
                        Object P5 = rv4Var2.P();
                        if (f10 || P5 == lh9Var) {
                            rv4Var2.o0(null);
                            P5 = null;
                        }
                        lu4 lu4Var = (lu4) P5;
                        boolean g = rv4Var2.g(z13);
                        final xt4 xt4Var4 = this.F;
                        boolean f11 = g | rv4Var2.f(xt4Var4);
                        final float f12 = this.G;
                        boolean c3 = f11 | rv4Var2.c(f12) | rv4Var2.c(h);
                        Object P6 = rv4Var2.P();
                        if (c3 || P6 == lh9Var) {
                            P6 = new xt4() { // from class: wk6
                                @Override // defpackage.xt4
                                public final Object invoke(Object obj5) {
                                    float floatValue = ((Float) obj5).floatValue();
                                    if (z13) {
                                        xt4Var4.invoke(Float.valueOf((floatValue / h) + f12));
                                    }
                                    return pvc.a;
                                }
                            };
                            rv4Var2.o0(P6);
                        }
                        qj3 b2 = nj3.b((xt4) P6, rv4Var2, 0);
                        h3a h3aVar2 = this.H;
                        boolean d3 = rv4Var2.d(h3aVar2.ordinal()) | rv4Var2.c(h) | rv4Var2.f(b2);
                        Object P7 = rv4Var2.P();
                        vt4 vt4Var5 = this.I;
                        vt4 vt4Var6 = this.J;
                        if (!d3 && P7 != lh9Var) {
                            a2 = P7;
                            vt4Var4 = vt4Var6;
                        } else {
                            if (h3aVar2 != h3a.b) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            vt4Var4 = vt4Var6;
                            xt4 xt4Var5 = this.L;
                            xt4 xt4Var6 = this.M;
                            a2 = nj3.a(kq7.a, b2, ff8.a, z11, null, true, new yk6(h, h3aVar2, vt4Var4, vt4Var5, xt4Var5, xt4Var4, xt4Var6, null), new pf6(2, null, xt4Var6), false, Token.WITH);
                            rv4Var2.o0(a2);
                        }
                        rse.c(vt4Var5, vt4Var4, this.K, e3aVar2, a2, lu4Var, rv4Var2, 0);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, 3072, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: vk6
                @Override // defpackage.lu4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int p = xoe.p(i2 | 1);
                    int p2 = xoe.p(i3);
                    qre.i(rh8.this, z, i, weaVar, f, j, j2, g3aVar, h3aVar, vt4Var, z2, f2, vt4Var2, vt4Var3, z3, xt4Var, xt4Var2, xt4Var3, (rv4) obj2, p, p2);
                    return pvc.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x0522, code lost:
        if (r46.f(r4) == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0547, code lost:
        if (r46.f(r9) == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0565, code lost:
        if (r46.f(r10) == false) goto L180;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x030f A[LOOP:2: B:159:0x0309->B:161:0x030f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0579 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x060e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x062d  */
    /* JADX WARN: Type inference failed for: r46v0, types: [rv4] */
    /* JADX WARN: Type inference failed for: r9v21, types: [fv7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v41, types: [m42] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(defpackage.c0a r39, defpackage.g08 r40, defpackage.nq7 r41, defpackage.dc r42, defpackage.xt4 r43, defpackage.xt4 r44, defpackage.lu4 r45, defpackage.rv4 r46, int r47) {
        /*
            Method dump skipped, instructions count: 1665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qre.j(c0a, g08, nq7, dc, xt4, xt4, lu4, rv4, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(ArrayList arrayList, nq7 nq7Var, dc dcVar, List list, List list2, xt4 xt4Var, xt4 xt4Var2, lu4 lu4Var, vt4 vt4Var, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        List list3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        rv4Var.g0(-1914095277);
        int i18 = 4;
        if ((i & 6) == 0) {
            if (rv4Var.h(arrayList)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i3 = i17 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i3 |= i16;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(dcVar)) {
                i15 = 256;
            } else {
                i15 = Token.CASE;
            }
            i3 |= i15;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(list)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i3 |= i14;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(list2)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i3 |= i13;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.f(null)) {
                i12 = 131072;
            } else {
                i12 = Parser.ARGC_LIMIT;
            }
            i3 |= i12;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.h(null)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i3 |= i11;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var.h(xt4Var)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i3 |= i10;
        }
        if ((100663296 & i) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i3 |= i9;
        }
        if ((805306368 & i) == 0) {
            if (rv4Var.h(lu4Var)) {
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i3 |= i8;
        }
        if ((i2 & 6) == 0) {
            if (!rv4Var.h(vt4Var)) {
                i18 = 2;
            }
            i4 = i2 | i18;
        } else {
            i4 = i2;
        }
        if ((306783379 & i3) == 306783378 && (i4 & 3) == 2) {
            z = false;
        } else {
            z = true;
        }
        if (rv4Var.U(i3 & 1, z)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
            }
            rv4Var.r();
            if (!arrayList.isEmpty()) {
                int i19 = i3 >> 6;
                int i20 = (i19 & 896) | (i3 & 14) | (i19 & Token.ASSIGN_MOD) | (i19 & 7168) | ((i4 << 12) & 57344);
                yae.D(vt4Var, rv4Var);
                rv4Var.e0(-984503628);
                rv4Var.q(false);
                ly1 ly1Var = b0a.a;
                Object P = rv4Var.P();
                Object obj = ax1.a;
                if (P == obj) {
                    i5 = i3;
                    qra qraVar = new qra();
                    i6 = i4;
                    i7 = i20;
                    P = new kz7(new ux9(qraVar, 1), new tu1(new pl7(qraVar, 7), true, -1714993007));
                    rv4Var.o0(P);
                } else {
                    i5 = i3;
                    i6 = i4;
                    i7 = i20;
                }
                char c2 = 3;
                ArrayList K = xbe.K(arrayList, b00.l0(new kz7[]{null, (a0a) P, new kz7(new bo7(12), jce.E(1077673004, new mr3(yae.D(arrayList, rv4Var), 2), rv4Var))}), rv4Var, i7 & 14);
                boolean f = rv4Var.f(sl1.C0(list)) | rv4Var.f(K);
                Object P2 = rv4Var.P();
                if (f || P2 == obj) {
                    ArrayList C = tl1.C(uwe.n(K, list, list2));
                    sl1.j0(C);
                    List Z = sl1.Z(C);
                    ArrayList arrayList2 = new ArrayList(Z.size());
                    int size = Z.size();
                    int i21 = 0;
                    while (i21 < size) {
                        wz9 wz9Var = (wz9) Z.get(i21);
                        wz9Var.getClass();
                        arrayList2.add((og8) wz9Var);
                        i21++;
                        c2 = c2;
                    }
                    wz9 wz9Var2 = (wz9) sl1.j0(C);
                    ArrayList C2 = tl1.C(sl1.c0(C));
                    do {
                        wz9 wz9Var3 = (wz9) sl1.e0(C2);
                        if (wz9Var3 != null) {
                            list3 = wz9Var3.a();
                        } else {
                            list3 = null;
                        }
                        if (list3 != null && !list3.isEmpty()) {
                            C2.add(0, uwe.n(list3, list, list2));
                        }
                        if (list3 == null) {
                            break;
                        }
                    } while (!list3.isEmpty());
                    C2.remove(wz9Var2);
                    Object c0aVar = new c0a(K, arrayList2, wz9Var2, C2);
                    rv4Var.o0(c0aVar);
                    P2 = c0aVar;
                }
                c0a c0aVar2 = (c0a) P2;
                g08 o = xpe.o(c0aVar2, rv4Var);
                hse.a(c0aVar2, o, null, vt4Var, rv4Var, (i6 << 9) & 7168);
                j(c0aVar2, o, nq7Var, dcVar, xt4Var, xt4Var2, lu4Var, rv4Var, (i19 & 29360128) | ((i5 << 3) & 8064) | (i19 & 57344) | (458752 & i19) | (3670016 & i19));
            } else {
                vs.m("NavDisplay entries cannot be empty");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new nm5(arrayList, nq7Var, dcVar, list, list2, xt4Var, xt4Var2, lu4Var, vt4Var, i, i2);
        }
    }

    public static final void l(List list, nq7 nq7Var, dc dcVar, vt4 vt4Var, List list2, List list3, List list4, xt4 xt4Var, xt4 xt4Var2, lu4 lu4Var, cq2 cq2Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        dc dcVar2;
        vt4 vt4Var2;
        List list5;
        List list6;
        int i7;
        ks3 ks3Var;
        vt4 vt4Var3;
        List list7;
        nk0 nk0Var;
        ArrayList arrayList;
        rv4Var.g0(1398581072);
        int i8 = 2;
        if (rv4Var.h(list)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2 | 1408;
        if (rv4Var.h(list2)) {
            i3 = 16384;
        } else {
            i3 = 8192;
        }
        int i10 = i9 | i3 | 114884608;
        if (rv4Var.h(xt4Var)) {
            i4 = 536870912;
        } else {
            i4 = 268435456;
        }
        int i11 = i10 | i4;
        if (rv4Var.h(xt4Var2)) {
            i8 = 4;
        }
        if (rv4Var.h(lu4Var)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i12 = i8 | i5;
        if (rv4Var.h(cq2Var)) {
            i6 = 256;
        } else {
            i6 = Token.CASE;
        }
        int i13 = i12 | i6;
        if ((306783379 & i11) == 306783378 && (i13 & Token.EXPR_VOID) == 146) {
            z = false;
        } else {
            z = true;
        }
        if (rv4Var.U(i11 & 1, z)) {
            rv4Var.Z();
            int i14 = i & 1;
            lh9 lh9Var = ax1.a;
            if (i14 != 0 && !rv4Var.B()) {
                rv4Var.X();
                i7 = i11 & (-465921);
                nk0Var = dcVar;
                vt4Var3 = vt4Var;
                list7 = list3;
                ks3Var = list4;
            } else {
                nk0 nk0Var2 = kh5.a;
                boolean h = rv4Var.h(list);
                Object P = rv4Var.P();
                if (h || P == lh9Var) {
                    P = new k71(7, list);
                    rv4Var.o0(P);
                }
                List A = tl1.A(new Object());
                i7 = i11 & (-465921);
                ks3Var = ks3.a;
                vt4Var3 = (vt4) P;
                list7 = A;
                nk0Var = nk0Var2;
            }
            rv4Var.r();
            if (!list.isEmpty()) {
                int i15 = (i7 & 14) | ((i7 >> 9) & Token.ASSIGN_MOD) | (i13 & 896);
                boolean f = rv4Var.f(sl1.C0(list));
                Object P2 = rv4Var.P();
                if (f || P2 == lh9Var) {
                    if (list instanceof RandomAccess) {
                        arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i16 = 0; i16 < size; i16++) {
                            arrayList.add((jz7) cq2Var.invoke(list.get(i16)));
                        }
                    } else {
                        arrayList = new ArrayList(tl1.s(list, 10));
                        for (Object obj : list) {
                            arrayList.add((jz7) cq2Var.invoke(obj));
                        }
                    }
                    P2 = arrayList;
                    rv4Var.o0(P2);
                }
                int i17 = i13 << 24;
                k(xbe.K((List) P2, list2, rv4Var, i15 & Token.ASSIGN_MOD), nq7Var, nk0Var, list7, ks3Var, xt4Var, xt4Var2, lu4Var, vt4Var3, rv4Var, ((i7 >> 6) & 29360128) | 1794480 | (234881024 & i17) | (i17 & 1879048192), 0);
                dcVar2 = nk0Var;
                list5 = list7;
                list6 = ks3Var;
                vt4Var2 = vt4Var3;
            } else {
                vs.m("NavDisplay backstack cannot be empty");
                return;
            }
        } else {
            rv4Var.X();
            dcVar2 = dcVar;
            vt4Var2 = vt4Var;
            list5 = list3;
            list6 = list4;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new jn7(list, nq7Var, dcVar2, vt4Var2, list2, list5, list6, xt4Var, xt4Var2, lu4Var, cq2Var, i);
        }
    }

    public static final void m(nq7 nq7Var, boolean z, float f, boolean z2, rv4 rv4Var, int i) {
        int i2;
        boolean z3;
        boolean z4;
        float f2;
        int i3;
        int i4;
        int i5;
        rv4Var.g0(298596817);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 432;
        if ((i & 3072) == 0) {
            if (rv4Var.g(z2)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i6 |= i4;
        }
        if ((i6 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i6 & 1, z3)) {
            f99 f99Var = j27.a;
            long j = ((h27) rv4Var.j(f99Var)).a.a;
            long j2 = ((h27) rv4Var.j(f99Var)).a.f;
            long j3 = ((h27) rv4Var.j(f99Var)).a.j;
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (P == obj) {
                P = yte.s(rv4Var);
                rv4Var.o0(P);
            }
            m82 m82Var = (m82) P;
            rl8 p = vte.p(((i6 >> 3) & 14) | 48, rv4Var, true);
            Object P2 = rv4Var.P();
            if (P2 == obj) {
                i3 = i6;
                P2 = tl1.B(new et9(0.2f, 0.2f, 0.3f, 0.25f, 9000, 8000, tl1.B(Float.valueOf(140.0f), Float.valueOf(190.0f), Float.valueOf(240.0f)), 0.8f), new et9(0.85f, 0.15f, 0.8f, 0.2f, 10000, 7500, tl1.B(Float.valueOf(130.0f), Float.valueOf(180.0f)), 0.6f), new et9(0.5f, 0.5f, 0.55f, 0.55f, 8500, 9500, tl1.B(Float.valueOf(110.0f), Float.valueOf(160.0f), Float.valueOf(210.0f)), 0.5f), new et9(0.15f, 0.75f, 0.2f, 0.8f, 7000, 8000, tl1.B(Float.valueOf(150.0f), Float.valueOf(200.0f)), 0.7f), new et9(0.8f, 0.85f, 0.85f, 0.8f, 8800, 7600, tl1.B(Float.valueOf(120.0f), Float.valueOf(170.0f), Float.valueOf(220.0f)), 0.6f), new et9(0.75f, 0.4f, 0.8f, 0.45f, 9200, 8400, tl1.B(Float.valueOf(135.0f), Float.valueOf(185.0f)), 0.4f));
                rv4Var.o0(P2);
            } else {
                i3 = i6;
            }
            List list = (List) P2;
            dm8 o = vte.o(1.0f, z2, rv4Var, (i3 >> 6) & Token.ELSE);
            Object P3 = rv4Var.P();
            if (P3 == obj) {
                P3 = tc4.a(nae.e, 0.01f);
                rv4Var.o0(P3);
            }
            lq lqVar = (lq) P3;
            boolean h = rv4Var.h(m82Var) | rv4Var.h(lqVar);
            Object P4 = rv4Var.P();
            if (h || P4 == obj) {
                P4 = new sh1(m82Var, lqVar, 4);
                rv4Var.o0(P4);
            }
            vte.b((vt4) P4, rv4Var, 6);
            nq7 a0 = nq7Var.a0(pna.c);
            boolean f3 = rv4Var.f(o) | rv4Var.h(p) | rv4Var.h(lqVar) | rv4Var.h(list) | rv4Var.e(j) | rv4Var.e(j2) | rv4Var.e(j3);
            Object P5 = rv4Var.P();
            if (f3 || P5 == obj) {
                Object z97Var = new z97(o, p, lqVar, list, j, j2, j3);
                rv4Var.o0(z97Var);
                P5 = z97Var;
            }
            bce.a(a0, (xt4) P5, rv4Var, 0);
            z4 = true;
            f2 = 1.0f;
        } else {
            rv4Var.X();
            z4 = z;
            f2 = f;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new uh1(nq7Var, z4, f2, z2, i, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d3, code lost:
        if (r22 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d7, code lost:
        if (r22 != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00de, code lost:
        if (r22 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e2, code lost:
        if (r22 != false) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final defpackage.l88 r19, final boolean r20, final defpackage.oq9 r21, final boolean r22, long r23, final float r25, final defpackage.nq7 r26, defpackage.rv4 r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qre.n(l88, boolean, oq9, boolean, long, float, nq7, rv4, int, int):void");
    }

    public static final void o(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, boolean z) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        rv4Var.g0(2111672474);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if (rv4Var.h(vt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i2 | i3;
        if (rv4Var.g(z)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i7 & 1, z2)) {
            k8a k8aVar = a7a.a;
            xbe.i(rv4Var, lye.j(pna.p(nq7Var, 25.0f, 25.0f), new bm(vt4Var, z)));
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new am(nq7Var, vt4Var, z, i);
        }
    }

    public static float p(float[] fArr) {
        if (fArr.length < 6) {
            return nae.e;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float c2 = nk2.c(f, f6, (((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3), 0.5f);
        if (c2 < nae.e) {
            return -c2;
        }
        return c2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r1 <= r6.getHeight()) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.nl5 q(defpackage.u41 r31, float r32) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qre.q(u41, float):nl5");
    }

    public static yb3 r(int i) {
        switch (i) {
            case 1:
                return new yb3("https://dns.google/dns-query", tl1.B("8.8.4.4", "8.8.8.8"));
            case 2:
                return new yb3("https://cloudflare-dns.com/dns-query", tl1.B("162.159.36.1", "162.159.46.1", "1.1.1.1", "1.0.0.1", "162.159.132.53"));
            case 3:
                return new yb3("https://dns-unfiltered.adguard.com/dns-query", tl1.B("94.140.14.140", "94.140.14.141"));
            case 4:
                return new yb3("https://dns.quad9.net/dns-query", tl1.B("9.9.9.9", "149.112.112.112"));
            case 5:
                return new yb3("https://dns.alidns.com/dns-query", tl1.B("223.5.5.5", "223.6.6.6"));
            case 6:
                return new yb3("https://doh.pub/dns-query", tl1.B("1.12.12.12", "120.53.53.53"));
            case 7:
                return new yb3("https://doh.360.cn/dns-query", tl1.B("101.226.4.6", "218.30.118.6", "123.125.81.6", "140.207.198.6", "180.163.249.75", "101.199.113.208", "36.99.170.86"));
            case 8:
                return new yb3("https://dns.twnic.tw/dns-query", tl1.A("101.101.101.101"));
            case 9:
                return new yb3("https://dns.mullvad.net/dns-query", tl1.A("194.242.2.2"));
            case 10:
                return new yb3("https://freedns.controld.com/p0", tl1.B("76.76.2.0", "76.76.10.0"));
            case 11:
                return new yb3("https://dns.njal.la/dns-query", tl1.A("95.215.19.53"));
            case 12:
                return new yb3("https://free.shecan.ir/dns-query", tl1.B("178.22.122.100", "185.51.200.2"));
            default:
                return null;
        }
    }

    public static final void s(cz7 cz7Var, String str) {
        cz7Var.getClass();
        str.getClass();
        cz7Var.a.c(new c91(str));
    }

    public static final void t(cz7 cz7Var, String str) {
        cz7Var.getClass();
        str.getClass();
        cz7Var.a.c(new yn3(str));
    }

    public static final int u(String str) {
        if (r4b.Q(str, "#", false)) {
            int length = str.length();
            if (length != 4) {
                if (length != 5) {
                    if (length != 7) {
                        if (length != 9) {
                            return -16777216;
                        }
                        return pbe.r(str.substring(1));
                    }
                    return pbe.r(str.substring(1)) | (-16777216);
                }
                int r = pbe.r(str.substring(1));
                return ((r & 15) * 17) | (((r >> 12) & 15) * 285212672) | (((r >> 8) & 15) * 1114112) | (((r >> 4) & 15) * 4352) | (-16777216);
            }
            int r2 = pbe.r(str.substring(1));
            return ((r2 & 15) * 17) | (((r2 >> 8) & 15) * 1114112) | (((r2 >> 4) & 15) * 4352) | (-16777216);
        }
        p1a.k("Invalid color value ".concat(str));
        return 0;
    }

    public static final float v(String str, r13 r13Var) {
        r13Var.getClass();
        if (str == null) {
            return nae.e;
        }
        if (r4b.I(str, "dp", false)) {
            return Float.parseFloat(k4b.u0(str, "dp"));
        }
        if (r4b.I(str, "px", false)) {
            return r13Var.B0(Float.parseFloat(k4b.u0(str, "px")));
        }
        xk5.q("value should ends with dp or px");
        return nae.e;
    }

    public static final int w(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1073910849) {
            if (hashCode != -436781190) {
                if (hashCode == 94742715 && str.equals("clamp")) {
                    return 0;
                }
            } else if (str.equals("repeated")) {
                return 1;
            }
        } else if (str.equals("mirror")) {
            return 2;
        }
        xk5.q("unknown tileMode: ".concat(str));
        return 0;
    }

    public static final o7b x(btd btdVar, rv4 rv4Var) {
        btdVar.getClass();
        xn6 k = ((un6) rv4Var.j(nu6.a)).k();
        boolean f = rv4Var.f(btdVar) | rv4Var.f(k);
        Object P = rv4Var.P();
        if (f || P == ax1.a) {
            P = new o7b(btdVar, k);
            rv4Var.o0(P);
        }
        return (o7b) P;
    }

    public static s9f y(o9f o9fVar) {
        xk9 xk9Var = o9fVar.g;
        v9f v9fVar = new v9f(((hlf) xk9Var.b).b());
        try {
            Provider C = cae.C();
            if (C != null) {
                Mac.getInstance("AESCMAC", C);
                return new hvc(28, v9fVar, new hvc(((hlf) xk9Var.b).b(), C));
            }
            throw new GeneralSecurityException("Conscrypt not available");
        } catch (GeneralSecurityException unused) {
            return v9fVar;
        }
    }
}
