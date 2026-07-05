package defpackage;

import android.content.BroadcastReceiver;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yf2  reason: default package */
/* loaded from: classes.dex */
public abstract class yf2 {
    public static final lp a = new Object();
    public static final tu1 b = new tu1(new nv1(10), false, -1075803061);
    public static final tu1 c = new tu1(new mv1(15), false, 1749505095);

    public static final void a(List list, List list2, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        list.getClass();
        list2.getClass();
        rv4Var.g0(-249984206);
        if (rv4Var.f(list)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.f(list2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i7 = i6 | i4;
        boolean z4 = false;
        if ((i7 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            f25 f25Var = new f25(64.0f);
            th8 h = zbe.h(2, 20.0f);
            th8 j = zbe.j(nae.e, nae.e, 12.0f, nae.e, 11);
            if ((i7 & 14) != 4) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((i7 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = z2 | z3;
            if ((i7 & Token.ASSIGN_MOD) == 32) {
                z4 = true;
            }
            boolean z6 = z5 | z4;
            Object P = rv4Var.P();
            if (z6 || P == ax1.a) {
                P = new r7(7, list, list2, xt4Var);
                rv4Var.o0(P);
            }
            pc2.d(f25Var, nq7Var, null, h, null, null, null, false, 0L, 0L, j, nae.e, (xt4) P, rv4Var, 3120, 48, 6132);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new i31(list, list2, nq7Var, xt4Var, i, 13);
        }
    }

    public static final void b(String str, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4Var.g0(579110396);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            tza tzaVar = j27.a;
            cvb.c(str, zbe.z(nmd.v(tte.k(pna.f(nq7Var, 1.0f), ((h27) rv4Var.j(tzaVar)).c.d), rm1.g(((h27) rv4Var.j(tzaVar)).a, 1.0f), lre.g), 16.0f, 12.0f), ((h27) rv4Var.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.h, rv4Var, i3 & 14, 0, 130040);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new o7(str, nq7Var, i, 1);
        }
    }

    public static final void c(int i, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        boolean z;
        String str2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1373451509);
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
            rv4Var2.e0(1714228967);
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
                P = new oqd(1, vt4Var2);
                rv4Var2.o0(P);
            }
            kwe.d(c2, o, 0L, (vt4) P, rv4Var2, 0, 4);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new qp1(str, nq7Var, vt4Var, vt4Var2, i, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v35, types: [int] */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARN: Type inference failed for: r3v91 */
    /* JADX WARN: Type inference failed for: r7v28, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v46 */
    public static final void d(String str, String str2, String str3, String str4, nq7 nq7Var, boolean z, nu4 nu4Var, vt4 vt4Var, rv4 rv4Var, int i) {
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
        lh9 lh9Var;
        boolean z7;
        aw7 aw7Var5;
        kq7 kq7Var;
        kd4 kd4Var;
        rv4 rv4Var2;
        rv4 rv4Var3;
        ?? r7;
        ?? r3;
        boolean z8;
        boolean z9;
        lh9 lh9Var2;
        kq7 kq7Var2;
        int i11;
        aw7 aw7Var6;
        int i12;
        int i13;
        rv4 rv4Var4 = rv4Var;
        u22 u22Var = r0f.d;
        rv4Var4.g0(2052199869);
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
        if ((4793491 & i21) != 4793490) {
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
                P = new v85(str2, 29);
                rv4Var4.o0(P);
            }
            aw7 aw7Var7 = (aw7) zpe.k(objArr, (vt4) P, rv4Var4, 0);
            Object[] objArr2 = new Object[0];
            if ((i21 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P2 = rv4Var4.P();
            if (z4 || P2 == lh9Var3) {
                P2 = new v85(str3, 27);
                rv4Var4.o0(P2);
            }
            aw7 aw7Var8 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var4, 0);
            Object[] objArr3 = new Object[0];
            if ((i21 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object P3 = rv4Var4.P();
            if (z5 || P3 == lh9Var3) {
                P3 = new v85(str4, 28);
                rv4Var4.o0(P3);
            }
            aw7 aw7Var9 = (aw7) zpe.k(objArr3, (vt4) P3, rv4Var4, 0);
            Object P4 = rv4Var4.P();
            String str5 = null;
            if (P4 == lh9Var3) {
                P4 = yae.z(null);
                rv4Var4.o0(P4);
            }
            aw7 aw7Var10 = (aw7) P4;
            Object P5 = rv4Var4.P();
            if (P5 == lh9Var3) {
                P5 = new ozc(aw7Var10, 18);
                rv4Var4.o0(P5);
            }
            kd4 v = w92.v(av8.a, (xt4) P5, rv4Var4, 54);
            Object[] objArr4 = new Object[0];
            Object P6 = rv4Var4.P();
            if (P6 == lh9Var3) {
                P6 = new u6d(15);
                rv4Var4.o0(P6);
            }
            aw7 aw7Var11 = (aw7) zpe.k(objArr4, (vt4) P6, rv4Var4, 48);
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
            if (((f76) aw7Var10.getValue()) == null) {
                rv4Var4.e0(1559921798);
                aw7Var = aw7Var10;
                i10 = i21;
                aw7Var2 = aw7Var7;
                aw7Var3 = aw7Var9;
                do5.c(str, str2, "", "", u22Var, pna.c, rv4Var4, (i21 & 14) | 224640 | i22);
                rv4Var4.q(false);
                r3 = 0;
                kq7Var = kq7Var3;
                aw7Var5 = aw7Var8;
                aw7Var4 = aw7Var11;
                kd4Var = v;
                r7 = 1;
                rv4Var3 = rv4Var4;
                lh9Var = lh9Var3;
            } else {
                aw7Var = aw7Var10;
                i10 = i21;
                aw7Var2 = aw7Var7;
                aw7Var3 = aw7Var9;
                rv4Var4.e0(1560303718);
                f76 f76Var = (f76) aw7Var.getValue();
                if (f76Var == null) {
                    rv4Var4.e0(1560303717);
                    rv4Var4.q(false);
                    z6 = false;
                    kq7Var = kq7Var3;
                    aw7Var5 = aw7Var8;
                    aw7Var4 = aw7Var11;
                    kd4Var = v;
                    z7 = true;
                    rv4Var2 = rv4Var4;
                    lh9Var = lh9Var3;
                } else {
                    rv4Var4.e0(1560303718);
                    z6 = false;
                    aw7Var4 = aw7Var11;
                    lh9Var = lh9Var3;
                    z7 = true;
                    aw7Var5 = aw7Var8;
                    kq7Var = kq7Var3;
                    kd4Var = v;
                    do5.a(f76Var, u22Var, false, null, null, null, pna.c, null, rv4Var4, 12582960, 892);
                    rv4Var2 = rv4Var4;
                    rv4Var2.q(false);
                }
                rv4Var2.q(z6);
                r3 = z6;
                r7 = z7;
                rv4Var3 = rv4Var2;
            }
            rs8.u(rv4Var3, r7, kq7Var, 8.0f, rv4Var3);
            ar5 c2 = rp5.c((wk3) jk3.P.getValue(), rv4Var3, r3);
            String A = yqe.A((y3b) f2b.W.getValue(), rv4Var3);
            boolean f = rv4Var3.f(kd4Var);
            Object P7 = rv4Var3.P();
            if (f || P7 == lh9Var) {
                P7 = new fe1(kd4Var, 23);
                rv4Var3.o0(P7);
            }
            z1d.f(c2, A, false, null, null, null, null, null, (vt4) P7, rv4Var, 0, 252);
            String str6 = (String) nk2.p(kq7Var, 12.0f, rv4Var, aw7Var2);
            v72 v72Var = ((h27) rv4Var.j(tzaVar)).c.b;
            nq7 A2 = zbe.A(pna.f(pna.u(kq7Var, nae.e, 420.0f, r7), 1.0f), 24.0f, nae.e, 2);
            boolean f2 = rv4Var.f(aw7Var2);
            Object P8 = rv4Var.P();
            if (f2 || P8 == lh9Var) {
                P8 = new ozc(aw7Var2, 19);
                rv4Var.o0(P8);
            }
            uwe.h(str6, (xt4) P8, A2, false, false, null, ape.b, null, null, null, false, null, null, null, false, 0, 0, v72Var, null, rv4Var, 1573248, 0, 6291384);
            String str7 = (String) nk2.p(kq7Var, 12.0f, rv4Var, aw7Var5);
            v72 v72Var2 = ((h27) rv4Var.j(tzaVar)).c.b;
            nq7 A3 = zbe.A(pna.f(pna.u(kq7Var, nae.e, 420.0f, 1), 1.0f), 24.0f, nae.e, 2);
            boolean f3 = rv4Var.f(aw7Var5);
            Object P9 = rv4Var.P();
            if (f3 || P9 == lh9Var) {
                P9 = new ozc(aw7Var5, 20);
                rv4Var.o0(P9);
            }
            uwe.h(str7, (xt4) P9, A3, false, false, null, ape.c, null, null, null, false, null, null, null, false, 0, 0, v72Var2, null, rv4Var, 1573248, 0, 6291384);
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
            if (f5 || P11 == lh9Var) {
                P11 = new clc(aw7Var4, 18);
                rv4Var.o0(P11);
            }
            lh9 lh9Var4 = lh9Var;
            aw7 aw7Var12 = aw7Var5;
            aw7 aw7Var13 = aw7Var4;
            kq7 kq7Var4 = kq7Var;
            twe.e(3072, (vt4) P11, rv4Var, zbe.A(pna.f(pna.u(kq7Var, nae.e, 420.0f, 1), 1.0f), 24.0f, nae.e, 2), str11, A4, null);
            rv4 rv4Var5 = rv4Var;
            xbe.i(rv4Var5, pna.h(kq7Var4, 12.0f));
            if (z) {
                rv4Var5.e0(349138776);
                eg0.f(pna.n(kq7Var4, 28.0f), 0L, null, rv4Var, 6, 6);
                rv4Var5 = rv4Var;
                rv4Var5.q(false);
                i11 = 0;
                kq7Var2 = kq7Var4;
                lh9Var2 = lh9Var4;
                aw7Var6 = aw7Var13;
                i12 = 8388608;
            } else {
                rv4Var5.e0(349324249);
                ar5 c3 = rp5.c((wk3) ok3.j0.getValue(), rv4Var5, 0);
                String A5 = yqe.A((y3b) s2b.E0.getValue(), rv4Var5);
                nq7 A6 = zbe.A(pna.f(pna.u(kq7Var4, nae.e, 420.0f, 1), 1.0f), 24.0f, nae.e, 2);
                if (((String) aw7Var2.getValue()).length() > 0 && ((String) aw7Var3.getValue()).length() > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if ((3670016 & i10) == 1048576) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean f6 = z9 | rv4Var5.f(aw7Var2) | rv4Var5.f(aw7Var12) | rv4Var5.f(aw7Var3);
                Object P12 = rv4Var5.P();
                if (!f6 && P12 != lh9Var4) {
                    lh9Var2 = lh9Var4;
                } else {
                    lh9Var2 = lh9Var4;
                    mc3 mc3Var = new mc3(nu4Var, aw7Var2, aw7Var12, aw7Var3, aw7Var, 8);
                    rv4Var5.o0(mc3Var);
                    P12 = mc3Var;
                }
                kq7Var2 = kq7Var4;
                i11 = 0;
                aw7Var6 = aw7Var13;
                i12 = 8388608;
                z1d.f(c3, A5, z8, null, A6, null, null, null, (vt4) P12, rv4Var5, 24576, 232);
                rv4Var5.q(false);
            }
            rv4Var5.q(true);
            boolean booleanValue = ((Boolean) aw7Var6.getValue()).booleanValue();
            boolean f7 = rv4Var5.f(aw7Var6);
            Object P13 = rv4Var5.P();
            if (f7 || P13 == lh9Var2) {
                P13 = new ozc(aw7Var6, 17);
                rv4Var5.o0(P13);
            }
            xt4 xt4Var = (xt4) P13;
            boolean f8 = rv4Var5.f(aw7Var3) | rv4Var5.f(aw7Var6);
            Object P14 = rv4Var5.P();
            if (f8 || P14 == lh9Var2) {
                P14 = new ghc(aw7Var3, aw7Var6, 6);
                rv4Var5.o0(P14);
            }
            am8.g(booleanValue, xt4Var, (xt4) P14, rv4Var5, i11);
            ar5 c4 = rp5.c((wk3) jk3.d.getValue(), rv4Var5, i11);
            if ((29360128 & i10) == i12) {
                i13 = 1;
            } else {
                i13 = i11;
            }
            Object P15 = rv4Var5.P();
            if (i13 != 0 || P15 == lh9Var2) {
                P15 = new oqd(i11, vt4Var);
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
            u.d = new lc3(str, str2, str3, str4, nq7Var, z, nu4Var, vt4Var, i, 5);
        }
    }

    public static final void e(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        boolean z;
        vt4 vt4Var2;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1041060835);
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
            if (!z2 && P != ax1.a) {
                vt4Var2 = vt4Var;
            } else {
                vt4Var2 = vt4Var;
                P = new oqd(2, vt4Var2);
                rv4Var.o0(P);
            }
            kwe.d(c2, o, 0L, (vt4) P, rv4Var, 0, 4);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            vt4Var2 = vt4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new k31(str, nq7Var, vt4Var2, i, 17);
        }
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, g25] */
    public static final void f(int i, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var, List list) {
        int i2;
        int i3;
        boolean z;
        kq7 kq7Var;
        boolean z2;
        boolean z3;
        rv4Var.g0(-1560375925);
        if (rv4Var.f(list)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var.h(xt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3 | 384;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            qg6 a2 = tg6.a(0, 3, rv4Var);
            kq7 kq7Var2 = kq7.a;
            nq7 f = pna.f(kq7Var2, 1.0f);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, f);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, a3);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            b(yqe.A((y3b) f2b.a.getValue(), rv4Var), zbe.z(kq7Var2, 8.0f, 6.0f), rv4Var, 48);
            ?? obj = new Object();
            nq7 h = pna.h(pna.f(kq7Var2, 1.0f), 320.0f);
            th8 th8Var = new th8(8.0f, 4.0f, 8.0f, 4.0f);
            hz hzVar = new hz(8.0f, true, new vs(2));
            hz hzVar2 = new hz(8.0f, true, new vs(2));
            if ((i5 & 14) != 4) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((i5 & Token.ASSIGN_MOD) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z4 = z3 | z2;
            Object P = rv4Var.P();
            if (z4 || P == ax1.a) {
                P = new yv0(list, xt4Var, 0);
                rv4Var.o0(P);
            }
            ade.d(obj, h, a2, th8Var, hzVar, hzVar2, null, false, null, (xt4) P, rv4Var, 1772592);
            l(a2, zbe.C(new l95(kh5.J), nae.e, 8.0f, nae.e, nae.e, 13), rv4Var, 0);
            rv4Var.q(true);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ax(list, xt4Var, kq7Var, i, 10);
        }
    }

    public static final void g(l54 l54Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(610210596);
        if (rv4Var2.f(l54Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var2.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            tza tzaVar = j27.a;
            nq7 z2 = zbe.z(nmd.v(tte.k(nq7Var, ((h27) rv4Var2.j(tzaVar)).c.c), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 1.0f), lre.g), 10.0f, 12.0f);
            xn1 a2 = wn1.a(lz.c, kh5.J, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, z2);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            h54 h54Var = new h54(l54Var.r, l54Var.a, l54Var.c);
            u22 u22Var = r0f.d;
            kq7 kq7Var = kq7.a;
            do5.a(h54Var, u22Var, false, null, null, lpe.b, tte.k(pna.n(kq7Var, 48.0f), ((h27) rv4Var2.j(tzaVar)).c.c), null, rv4Var2, 1572912, 828);
            xbe.i(rv4Var2, pna.h(kq7Var, 8.0f));
            cvb.c(l54Var.b, pna.f(kq7Var, 1.0f), zl1.b(0.8f, ((h27) rv4Var2.j(tzaVar)).a.q), null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 2, false, 2, 0, null, ((h27) rv4Var2.j(tzaVar)).b.l, rv4Var, 48, 24960, 109560);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ah7(l54Var, nq7Var, i, 10);
        }
    }

    public static final void h(uv0 uv0Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        kq7 kq7Var;
        uv0 uv0Var2 = uv0Var;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-2140621194);
        if (rv4Var2.f(uv0Var2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var2.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            nq7 y = zbe.y(nmd.v(tte.k(nq7Var, r0f.z(rv4Var2).c), rm1.g(r0f.y(rv4Var2), 1.0f), lre.g), 16.0f);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, y);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            int length = uv0Var2.a.length();
            kq7 kq7Var2 = kq7.a;
            if (length > 0) {
                rv4Var2.e0(797704543);
                kq7Var = kq7Var2;
                cvb.c(uv0Var2.a, pna.f(kq7Var2, 1.0f), r0f.y(rv4Var).q, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, r0f.A(rv4Var).j, rv4Var, 48, 24960, 110584);
                hl5.w(kq7Var, 8.0f, rv4Var, false);
            } else {
                kq7Var = kq7Var2;
                rv4Var2.e0(798076450);
                rv4Var2.q(false);
            }
            uv0Var2 = uv0Var;
            cvb.c(uv0Var2.b, pna.f(kq7Var, 1.0f), r0f.y(rv4Var).s, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, r0f.A(rv4Var).l, rv4Var, 48, 24960, 110584);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ah7(uv0Var2, nq7Var, i, 11);
        }
    }

    public static final void i(nq7 nq7Var, tu1 tu1Var, rv4 rv4Var, int i) {
        boolean z;
        rv4Var.g0(1047718606);
        if ((i & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            gv9 a2 = ev9.a(lz.a, kh5.F, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
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
            kq7 kq7Var = kq7.a;
            dpe.g(pna.n(kq7Var, 30.0f), uu9.a, rv4Var, 6, 0);
            nq7 A = zbe.A(pna.f(kq7Var, 1.0f), 6.0f, nae.e, 2);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, A);
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
            dpe.g(pna.p(kq7Var, 100.0f, 16.0f), ((h27) rv4Var.j(j27.a)).c.a, rv4Var, 6, 0);
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            tu1Var.invoke(rv4Var, 6);
            rv4Var.q(true);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new a62(nq7Var, tu1Var, i, 3);
        }
    }

    public static final void j(nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4Var.g0(219609586);
        if (rv4Var.f(nq7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            ze4 ze4Var = pna.c;
            nq7 a0 = nq7Var.a0(ze4Var);
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, a0);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var, d);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var, p);
            kq7 kq7Var = kq7.a;
            nq7 a02 = mwe.x(pna.f(kq7Var, 1.0f), 14).a0(ze4Var);
            th8 j = zbe.j(nae.e, nae.e, nae.e, 72.0f, 7);
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = new ww6(8);
                rv4Var.o0(P);
            }
            jce.d(a02, null, j, true, null, null, null, false, null, (xt4) P, rv4Var, 817892736, 370);
            nq7 x = mwe.x(zbe.z(pna.f(pu0.a.a(kq7Var, kh5.D), 1.0f), 12.0f, 10.0f), 14);
            su9 su9Var = uu9.a;
            nq7 k = tte.k(st0.s(x, 10.0f, su9Var, 28), su9Var);
            tza tzaVar = j27.a;
            nq7 z2 = zbe.z(st0.d(nmd.v(k, zl1.b(0.98f, ((h27) rv4Var.j(tzaVar)).a.p), lre.g), 1.0f, zl1.b(0.08f, ((h27) rv4Var.j(tzaVar)).a.a), su9Var), 12.0f, 10.0f);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var, 48);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, z2);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a2);
            jce.F(npVar2, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p2);
            dpe.g(pna.n(kq7Var, 34.0f), su9Var, rv4Var, 6, 0);
            dpe.g(pna.h(rs8.d(kq7Var, 10.0f, rv4Var, 1.0f, true), 42.0f), su9Var, rv4Var, 0, 0);
            xbe.i(rv4Var, pna.s(kq7Var, 10.0f));
            dpe.g(pna.n(kq7Var, 40.0f), su9Var, rv4Var, 6, 0);
            rv4Var.q(true);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oa(nq7Var, i, 14);
        }
    }

    public static final void k(boolean z, xt4 xt4Var, lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        xt4Var.getClass();
        lu4Var.getClass();
        rv4Var.g0(-1502577515);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(xt4Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(lu4Var)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        }
        boolean z4 = true;
        if ((i2 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            int i6 = i2 & 14;
            if (i6 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z3 || P == lh9Var) {
                P = yae.z("");
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            if (i6 != 4) {
                z4 = false;
            }
            Object P2 = rv4Var.P();
            if (z4 || P2 == lh9Var) {
                P2 = yae.z("");
                rv4Var.o0(P2);
            }
            aw7 aw7Var2 = (aw7) P2;
            Object[] objArr = new Object[0];
            Object P3 = rv4Var.P();
            if (P3 == lh9Var) {
                P3 = new qx6(16);
                rv4Var.o0(P3);
            }
            aw7 aw7Var3 = (aw7) zpe.k(objArr, (vt4) P3, rv4Var, 48);
            Object[] objArr2 = new Object[0];
            Object P4 = rv4Var.P();
            if (P4 == lh9Var) {
                P4 = new qx6(17);
                rv4Var.o0(P4);
            }
            aw7 aw7Var4 = (aw7) zpe.k(objArr2, (vt4) P4, rv4Var, 48);
            Object P5 = rv4Var.P();
            if (P5 == lh9Var) {
                P5 = s21.e(rv4Var);
            }
            xb.d(z, xt4Var, jce.E(-575093015, new td7(lu4Var, aw7Var, aw7Var2, xt4Var), rv4Var), null, mwe.x(kq7.a, 14), jce.E(1594778284, new id1(xt4Var, 11, (byte) 0), rv4Var), dxe.c, null, 0L, 0L, nae.e, false, false, jce.E(-1527712447, new wp0((zm4) P5, aw7Var, aw7Var2, aw7Var3, aw7Var4, 11), rv4Var), rv4Var, 1769856 | i6 | (i2 & Token.ASSIGN_MOD), 8072);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new z52(i, 3, xt4Var, lu4Var, z);
        }
    }

    public static final void l(final qg6 qg6Var, final nq7 nq7Var, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        boolean z;
        final int i4;
        rv4Var.g0(1917891605);
        if (rv4Var.f(qg6Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (rv4Var.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i6 & 1, z)) {
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = yae.q(new vv0(qg6Var, 0));
                rv4Var.o0(P);
            }
            yya yyaVar = (yya) P;
            float floatValue = ((Number) ((yk8) yyaVar.getValue()).a).floatValue();
            float floatValue2 = ((Number) ((yk8) yyaVar.getValue()).b).floatValue();
            if (floatValue2 >= 1.0f) {
                ek9 u = rv4Var.u();
                if (u != null) {
                    u.d = new lu4(qg6Var, nq7Var, i, 0) { // from class: wv0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ qg6 b;
                        public final /* synthetic */ nq7 c;

                        {
                            this.a = r4;
                        }

                        @Override // defpackage.lu4
                        public final Object invoke(Object obj, Object obj2) {
                            int i7 = this.a;
                            pvc pvcVar = pvc.a;
                            nq7 nq7Var2 = this.c;
                            qg6 qg6Var2 = this.b;
                            rv4 rv4Var2 = (rv4) obj;
                            ((Integer) obj2).getClass();
                            switch (i7) {
                                case 0:
                                    yf2.l(qg6Var2, nq7Var2, rv4Var2, xoe.p(1));
                                    return pvcVar;
                                default:
                                    yf2.l(qg6Var2, nq7Var2, rv4Var2, xoe.p(1));
                                    return pvcVar;
                            }
                        }
                    };
                    return;
                }
                return;
            }
            float f = 1.0f - floatValue2;
            if (f < 1.0E-4f) {
                f = 1.0E-4f;
            }
            yya b2 = nq.b(dce.m(((floatValue / f) * 2.0f) - 1.0f, -1.0f, 1.0f), null, null, rv4Var, 0, 30);
            tza tzaVar = j27.a;
            long b3 = zl1.b(0.12f, ((h27) rv4Var.j(tzaVar)).a.q);
            long j = ((h27) rv4Var.j(tzaVar)).a.a;
            nq7 h = pna.h(pna.s(nq7Var, 64.0f), 4.0f);
            su9 su9Var = uu9.a;
            nq7 k = tte.k(h, su9Var);
            ba5 ba5Var = lre.g;
            nq7 v = nmd.v(k, b3, ba5Var);
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, v);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
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
            fu0.a(nmd.v(tte.k(pu0.a.a(pna.c(pna.f(kq7.a, floatValue2), 1.0f), new nk0(((Number) b2.getValue()).floatValue(), nae.e)), su9Var), j, ba5Var), rv4Var, 0);
            i4 = 1;
            rv4Var.q(true);
        } else {
            i4 = 1;
            rv4Var.X();
        }
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new lu4(qg6Var, nq7Var, i, i4) { // from class: wv0
                public final /* synthetic */ int a;
                public final /* synthetic */ qg6 b;
                public final /* synthetic */ nq7 c;

                {
                    this.a = i4;
                }

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = this.a;
                    pvc pvcVar = pvc.a;
                    nq7 nq7Var2 = this.c;
                    qg6 qg6Var2 = this.b;
                    rv4 rv4Var2 = (rv4) obj;
                    ((Integer) obj2).getClass();
                    switch (i7) {
                        case 0:
                            yf2.l(qg6Var2, nq7Var2, rv4Var2, xoe.p(1));
                            return pvcVar;
                        default:
                            yf2.l(qg6Var2, nq7Var2, rv4Var2, xoe.p(1));
                            return pvcVar;
                    }
                }
            };
        }
    }

    public static final void m(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, cz7 cz7Var, rh8 rh8Var, bkd bkdVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        pb2 pb2Var;
        pb2 pb2Var2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        cz7Var.getClass();
        vt4Var.getClass();
        rv4Var.g0(-1898322198);
        if (rv4Var.f(cz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.f(rh8Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i7 = i6 | i3;
        if (rv4Var.f(bkdVar)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(vt4Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i9 = i8 | i5;
        if ((i9 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i9 & 1, z)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                bia biaVar = (bia) ((fdd) voe.z(cm9.a(bia.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                sdd sddVar = (sdd) rv4Var.j(idd.b);
                if (sddVar == null) {
                    rv4Var.e0(1368428688);
                    sddVar = kv6.a(rv4Var);
                } else {
                    rv4Var.e0(1368426673);
                }
                rv4Var.q(false);
                if (sddVar != null) {
                    if (sddVar instanceof y35) {
                        pb2Var2 = ((y35) sddVar).f();
                    } else {
                        pb2Var2 = ob2.b;
                    }
                    aw7 z9 = jsc.z(((d1d) ((fdd) voe.z(cm9.a(d1d.class), sddVar.i(), null, pb2Var2, o96.a(rv4Var), null))).f, rv4Var);
                    aw7 z10 = jsc.z(biaVar.e, rv4Var);
                    Object[] objArr = new Object[0];
                    Object P = rv4Var.P();
                    Object obj = ax1.a;
                    if (P == obj) {
                        P = new oca(21);
                        rv4Var.o0(P);
                    }
                    aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 48);
                    Object[] objArr2 = new Object[0];
                    Object P2 = rv4Var.P();
                    if (P2 == obj) {
                        P2 = new oca(22);
                        rv4Var.o0(P2);
                    }
                    aw7 aw7Var2 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var, 48);
                    uja ujaVar = (uja) z10.getValue();
                    boolean z11 = ((y0d) z9.getValue()).i;
                    boolean f = rv4Var.f(biaVar);
                    Object P3 = rv4Var.P();
                    if (f || P3 == obj) {
                        P3 = new yw7(0, biaVar, bia.class, "loadMore", "loadMore()V", 0, 25);
                        rv4Var.o0(P3);
                    }
                    i76 i76Var = (i76) P3;
                    int i10 = i9 & 14;
                    if (i10 == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Object P4 = rv4Var.P();
                    if (z2 || P4 == obj) {
                        P4 = new ar0(cz7Var, 15);
                        rv4Var.o0(P4);
                    }
                    xt4 xt4Var = (xt4) P4;
                    boolean f2 = rv4Var.f(aw7Var2) | rv4Var.f(aw7Var);
                    Object P5 = rv4Var.P();
                    if (f2 || P5 == obj) {
                        P5 = new pr0(aw7Var2, aw7Var, 22);
                        rv4Var.o0(P5);
                    }
                    tl1.k(ujaVar, z11, rh8Var, bkdVar, nq7Var, xt4Var, (xt4) P5, vt4Var, (vt4) i76Var, rv4Var, ((i9 << 9) & 29360128) | (i9 & 8064) | 24576);
                    String str = (String) aw7Var2.getValue();
                    boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
                    boolean f3 = rv4Var.f(aw7Var);
                    Object P6 = rv4Var.P();
                    if (f3 || P6 == obj) {
                        P6 = new qo7(aw7Var, 26);
                        rv4Var.o0(P6);
                    }
                    xt4 xt4Var2 = (xt4) P6;
                    boolean f4 = rv4Var.f(aw7Var);
                    if (i10 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z12 = f4 | z3;
                    Object P7 = rv4Var.P();
                    if (z12 || P7 == obj) {
                        P7 = new if3(cz7Var, aw7Var, 2);
                        rv4Var.o0(P7);
                    }
                    lu4 lu4Var = (lu4) P7;
                    boolean f5 = rv4Var.f(aw7Var);
                    if (i10 == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z13 = f5 | z4;
                    Object P8 = rv4Var.P();
                    if (z13 || P8 == obj) {
                        P8 = new w73(cz7Var, aw7Var, 15);
                        rv4Var.o0(P8);
                    }
                    xt4 xt4Var3 = (xt4) P8;
                    boolean f6 = rv4Var.f(aw7Var);
                    if (i10 == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean z14 = f6 | z5;
                    Object P9 = rv4Var.P();
                    if (z14 || P9 == obj) {
                        P9 = new w73(cz7Var, aw7Var, 16);
                        rv4Var.o0(P9);
                    }
                    xt4 xt4Var4 = (xt4) P9;
                    boolean f7 = rv4Var.f(aw7Var);
                    if (i10 == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean z15 = f7 | z6;
                    Object P10 = rv4Var.P();
                    if (z15 || P10 == obj) {
                        P10 = new w73(cz7Var, aw7Var, 13);
                        rv4Var.o0(P10);
                    }
                    xt4 xt4Var5 = (xt4) P10;
                    boolean f8 = rv4Var.f(aw7Var);
                    if (i10 == 4) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean z16 = f8 | z7;
                    Object P11 = rv4Var.P();
                    if (z16 || P11 == obj) {
                        P11 = new w73(cz7Var, aw7Var, 14);
                        rv4Var.o0(P11);
                    }
                    xt4 xt4Var6 = (xt4) P11;
                    if (i10 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    Object P12 = rv4Var.P();
                    if (z8 || P12 == obj) {
                        P12 = new ar0(cz7Var, 14);
                        rv4Var.o0(P12);
                    }
                    ube.e(booleanValue, str, xt4Var2, lu4Var, xt4Var3, xt4Var4, xt4Var5, xt4Var6, (xt4) P12, rv4Var, 0);
                } else {
                    vs.k("No ViewModelStoreOwner was provided via LocalRootViewModelStoreOwner or LocalViewModelStoreOwner");
                    return;
                }
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new nf3(cz7Var, nq7Var, rh8Var, bkdVar, vt4Var, i, 3);
        }
    }

    public static final void n(aw7 aw7Var, boolean z) {
        aw7Var.setValue(Boolean.valueOf(z));
    }

    public static final void o(int i, rv4 rv4Var, nq7 nq7Var, cz7 cz7Var, String str) {
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
        rv4Var.g0(-2009509711);
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
                P = new v85(str, 26);
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
                gi1 a4 = cm9.a(nqd.class);
                nqd nqdVar = (nqd) ((fdd) voe.z(a4, a2.i(), eub.o(a4.f(), "-", str), pb2Var2, a3, vt4Var));
                boolean f = rv4Var.f(nqdVar);
                Object P2 = rv4Var.P();
                if (f || P2 == lh9Var) {
                    P2 = new zub(nqdVar, 14);
                    rv4Var.o0(P2);
                }
                tte.d(nqdVar, null, (xt4) P2, rv4Var, 0);
                aw7 z4 = jsc.z(nqdVar.t0, rv4Var);
                aw7 z5 = jsc.z(nqdVar.i1, rv4Var);
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
                aw7 z7 = jsc.z(nqdVar.z0, rv4Var);
                WeakHashMap weakHashMap = yjd.w;
                ix5 o = w92.o(h88.n(rv4Var).b, rv4Var);
                boolean f3 = rv4Var.f((nnb) z4.getValue());
                Object P4 = rv4Var.P();
                if (f3 || P4 == lh9Var) {
                    th8 th8Var = new th8(((nnb) z4.getValue()).F, ((nnb) z4.getValue()).H, ((nnb) z4.getValue()).G, ((nnb) z4.getValue()).I);
                    rv4Var.o0(th8Var);
                    P4 = th8Var;
                }
                aw7 z8 = jsc.z(nqdVar.A0, rv4Var);
                dxe.l(((nnb) z4.getValue()).o, ((nnb) z4.getValue()).r, ((nnb) z4.getValue()).p, ((nnb) z4.getValue()).q, rv4Var, 0);
                rv4Var2 = rv4Var;
                pc2.f((e6c) aw7Var.getValue(), jce.E(1311108193, new pqd(nqdVar, nq7Var, o, cz7Var2, str, (rh8) P4, aw7Var, z5, z7, z4, z8), rv4Var2), rv4Var2, 48);
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
            u.d = new j31(str, cz7Var, nq7Var, i, 11);
        }
    }

    public static final void p(wcd wcdVar, od6 od6Var) {
        long h0 = ((wv5) od6Var.c0.d).h0(0L);
        int round = Math.round(Float.intBitsToFloat((int) (h0 >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (h0 & 4294967295L)));
        wcdVar.layout(round, round2, wcdVar.getMeasuredWidth() + round, wcdVar.getMeasuredHeight() + round2);
    }

    public static void q(pe4 pe4Var, hn8 hn8Var) {
        if (!pe4Var.j0(hn8Var)) {
            try {
                pe4Var.g1(hn8Var, false).close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static final void r(pe4 pe4Var, hn8 hn8Var) {
        try {
            IOException iOException = null;
            for (hn8 hn8Var2 : pe4Var.m0(hn8Var)) {
                try {
                    if (pe4Var.y0(hn8Var2).b) {
                        r(pe4Var, hn8Var2);
                    }
                    pe4Var.V(hn8Var2, false);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException == null) {
                return;
            }
            throw iOException;
        } catch (FileNotFoundException unused) {
        }
    }

    public static Object s(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return str;
    }

    public static Object t(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(list.size() - 1);
            }
            xk5.g();
            return null;
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static final void u(BroadcastReceiver broadcastReceiver, d82 d82Var, lu4 lu4Var) {
        m41 a2 = k27.a(nq2.C(rse.b(), d82Var));
        z87.v(a2, null, null, new l(lu4Var, a2, broadcastReceiver.goAsync(), (m42) null, 16), 3);
    }

    public static nq7 v(nq7 nq7Var, lk lkVar) {
        return nq7Var.a0(new u09(lkVar));
    }

    public static void w(List list, i39 i39Var, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (i39Var.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static String x(int i) {
        if (i == 0) {
            return "Clamp";
        }
        if (i == 1) {
            return "Repeated";
        }
        if (i == 2) {
            return "Mirror";
        }
        if (i == 3) {
            return "Decal";
        }
        return "Unknown";
    }

    public static int y(int i, int i2) {
        if (i2 >= 0) {
            if (i2 <= i) {
                return i;
            }
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                i3 = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (i3 < 0) {
                return Integer.MAX_VALUE;
            }
            return i3;
        }
        vs.m("cannot store more than Integer.MAX_VALUE elements");
        return 0;
    }
}
