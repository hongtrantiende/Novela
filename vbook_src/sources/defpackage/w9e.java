package defpackage;

import android.view.View;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w9e  reason: default package */
/* loaded from: classes3.dex */
public abstract class w9e {
    public static zg4 e;
    public static volatile e60 g;
    public static volatile e60 h;
    public static final tu1 a = new tu1(new ov1(15), false, 957296492);
    public static final tu1 b = new tu1(new ov1(16), false, -1416439420);
    public static final tu1 c = new tu1(new ov1(17), false, -1240111163);
    public static final zg4 d = new zg4(17, null, null, null);
    public static final Object f = new Object();

    public static final qd2 a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        return new qd2(new float[]{f2, f3, f4, f5, f6, f7, f8, f9});
    }

    public static final void b(l84 l84Var, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        rv4Var.g0(1712745999);
        if (rv4Var.f(l84Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (rv4Var.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i10 = i9 | i4;
        if (rv4Var.h(xt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        if (rv4Var.h(xt4Var3)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i12 = i11 | i6;
        if (rv4Var.h(xt4Var4)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i13 = i12 | i7;
        if ((74899 & i13) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i13 & 1, z)) {
            nq7 A = zbe.A(c16.g(rte.C(nq7Var, rte.u(rv4Var), 14), null, 3), 16.0f, nae.e, 2);
            xn1 a2 = wn1.a(new hz(12.0f, true, new vs(2)), kh5.I, rv4Var, 6);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, A);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, a2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            c(yqe.A((y3b) z1b.p0.getValue(), rv4Var), null, jce.E(534192588, new lg7(l84Var.c, xt4Var, l84Var.d, 3), rv4Var), rv4Var, 384, 2);
            c(yqe.A((y3b) x2b.I.getValue(), rv4Var), null, jce.E(-147739005, new lg7(l84Var.e, xt4Var2, l84Var.f, 4), rv4Var), rv4Var, 384, 2);
            c(yqe.A((y3b) v1b.h0.getValue(), rv4Var), null, jce.E(1118331780, new lg7(l84Var.g, xt4Var3, l84Var.h, 5), rv4Var), rv4Var, 384, 2);
            c(null, null, jce.E(-1910564731, new t81(24, l84Var, xt4Var4), rv4Var), rv4Var, 384, 3);
            hl5.w(kq7Var, 24.0f, rv4Var, true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new bn7(l84Var, nq7Var, xt4Var, xt4Var2, xt4Var3, xt4Var4, i);
        }
    }

    public static final void c(String str, nq7 nq7Var, tu1 tu1Var, rv4 rv4Var, int i, int i2) {
        Object obj;
        int i3;
        int i4;
        boolean z;
        tu1 tu1Var2;
        kq7 kq7Var;
        String str2;
        String str3;
        kq7 kq7Var2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1325172740);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i4 = i | 6;
            obj = str;
        } else {
            obj = str;
            if (rv4Var2.f(obj)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i4 = i | i3;
        }
        int i6 = i4 | 48;
        if ((i6 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i6 & 1, z)) {
            if (i5 != 0) {
                str3 = null;
            } else {
                str3 = obj;
            }
            kq7 kq7Var3 = kq7.a;
            nq7 f2 = pna.f(kq7Var3, 1.0f);
            tza tzaVar = j27.a;
            nq7 v = nmd.v(tte.k(f2, ((h27) rv4Var2.j(tzaVar)).c.d), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 2.0f), lre.g);
            xn1 a2 = wn1.a(new hz(6.0f, true, new vs(2)), kh5.I, rv4Var2, 6);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, v);
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
            if (str3 == null || str3.length() == 0) {
                kq7Var2 = kq7Var3;
                rv4Var2.e0(740660720);
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(740448339);
                kq7Var2 = kq7Var3;
                String str4 = str3;
                cvb.c(str4, zbe.A(zbe.C(kq7Var3, nae.e, 12.0f, nae.e, nae.e, 13), 14.0f, nae.e, 2), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.h, rv4Var, (i6 & 14) | 48, 0, 131068);
                str3 = str4;
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            }
            tu1Var2 = tu1Var;
            tu1Var2.c(zn1.a, rv4Var2, 54);
            rv4Var2.q(true);
            str2 = str3;
            kq7Var = kq7Var2;
        } else {
            tu1Var2 = tu1Var;
            rv4Var2.X();
            kq7Var = nq7Var;
            str2 = obj;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new a44(str2, kq7Var, tu1Var2, i, i2);
        }
    }

    public static final void d(boolean z, l84 l84Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, xt4 xt4Var5, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        l84Var.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        xt4Var3.getClass();
        xt4Var4.getClass();
        xt4Var5.getClass();
        rv4Var.g0(-418946123);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (rv4Var.f(l84Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i11 = i10 | i4;
        if (rv4Var.h(xt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (rv4Var.h(xt4Var3)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (rv4Var.h(xt4Var4)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i14 = i13 | i7;
        if (rv4Var.h(xt4Var5)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i15 = i14 | i8;
        if ((599187 & i15) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i15 & 1, z2)) {
            if (ikd.a(rv4Var)) {
                rv4Var.e0(351351242);
                e(z, l84Var, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, rv4Var, i15 & 4194302);
                rv4Var.q(false);
            } else {
                rv4Var.e0(351740943);
                f(z, l84Var, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, rv4Var, i15 & 4194302);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new kg7(z, l84Var, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, i, 0);
        }
    }

    public static final void e(boolean z, l84 l84Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, xt4 xt4Var5, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        rv4Var.g0(1320056281);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (rv4Var.f(l84Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i11 = i10 | i4;
        if (rv4Var.h(xt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (rv4Var.h(xt4Var3)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (rv4Var.h(xt4Var4)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i14 = i13 | i7;
        if (rv4Var.h(xt4Var5)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i15 = i14 | i8;
        if ((599187 & i15) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i15 & 1, z2)) {
            nmd.d(z, xt4Var, null, true, null, null, 0L, 0L, nae.e, 0L, null, jce.E(1913367093, new tw5(mwe.g(14, rv4Var), l84Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5), rv4Var), rv4Var, (i15 & 14) | 3072 | ((i15 >> 3) & Token.ASSIGN_MOD), 48, 2036);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new kg7(z, l84Var, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, i, 2);
        }
    }

    public static final void f(boolean z, l84 l84Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, xt4 xt4Var5, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        rv4Var.g0(-1024445306);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (rv4Var.f(l84Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i11 = i10 | i4;
        if (rv4Var.h(xt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (rv4Var.h(xt4Var3)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (rv4Var.h(xt4Var4)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i14 = i13 | i7;
        if (rv4Var.h(xt4Var5)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i15 = i14 | i8;
        if ((599187 & i15) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i15 & 1, z2)) {
            nmd.f(z, xt4Var, null, true, 0L, 0L, nae.e, 0L, nae.e, jce.E(405320309, new bn7(mwe.g(15, rv4Var), l84Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5), rv4Var), rv4Var, (i15 & 14) | 805309440 | ((i15 >> 3) & Token.ASSIGN_MOD), 500);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new kg7(z, l84Var, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, i, 1);
        }
    }

    public static final void g(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, wea weaVar, oyb oybVar, String str, boolean z) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        nq7 nq7Var2;
        wea weaVar2;
        oyb oybVar2;
        wea weaVar3;
        int i5;
        kq7 kq7Var;
        oyb oybVar3;
        long j;
        long g2;
        long b2;
        rv4Var.g0(1652411205);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3 | 9600;
        if (rv4Var.h(vt4Var)) {
            i4 = 131072;
        } else {
            i4 = Parser.ARGC_LIMIT;
        }
        int i8 = i7 | i4;
        boolean z3 = true;
        if ((74899 & i8) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i8 & 1, z2)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                weaVar3 = weaVar;
                oybVar3 = oybVar;
                i5 = i8 & (-64513);
                kq7Var = nq7Var;
            } else {
                tza tzaVar = j27.a;
                oyb oybVar4 = ((h27) rv4Var.j(tzaVar)).b.k;
                weaVar3 = ((h27) rv4Var.j(tzaVar)).c.c;
                i5 = i8 & (-64513);
                kq7Var = kq7.a;
                oybVar3 = oybVar4;
            }
            rv4Var.r();
            if (z) {
                rv4Var.e0(-1932617001);
                j = ((h27) rv4Var.j(j27.a)).a.i;
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1932541950);
                j = ((h27) rv4Var.j(j27.a)).a.q;
                rv4Var.q(false);
            }
            if ((458752 & i5) != 131072) {
                z3 = false;
            }
            Object P = rv4Var.P();
            if (z3 || P == ax1.a) {
                P = new ge5(26, vt4Var);
                rv4Var.o0(P);
            }
            nq7 k = tte.k(q1d.b(kq7Var, false, nae.e, (vt4) P, 3), weaVar3);
            if (z) {
                rv4Var.e0(-1932326903);
                g2 = ((h27) rv4Var.j(j27.a)).a.h;
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1932237282);
                g2 = rm1.g(((h27) rv4Var.j(j27.a)).a, 4.0f);
                rv4Var.q(false);
            }
            nq7 v = nmd.v(k, g2, weaVar3);
            if (z) {
                rv4Var.e0(-1932008471);
                b2 = ((h27) rv4Var.j(j27.a)).a.h;
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1931918850);
                b2 = zl1.b(0.08f, ((h27) rv4Var.j(j27.a)).a.q);
                rv4Var.q(false);
            }
            nq7 nq7Var3 = kq7Var;
            cvb.c(str, zbe.z(st0.d(v, 1.0f, b2, weaVar3), 12.0f, 6.0f), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar3, rv4Var, i5 & 14, 0, 131064);
            weaVar2 = weaVar3;
            oybVar2 = oybVar3;
            nq7Var2 = nq7Var3;
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
            weaVar2 = weaVar;
            oybVar2 = oybVar;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ds1(i, vt4Var, nq7Var2, weaVar2, oybVar2, str, z);
        }
    }

    public static final void h(ioa ioaVar, boolean z, vt4 vt4Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        kq7 kq7Var;
        long j;
        vt4Var.getClass();
        rv4Var.g0(488428243);
        if (rv4Var.f(ioaVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4 | 3072;
        if ((i7 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i7 & 1, z2)) {
            tza tzaVar = jt6.a;
            p71 p71Var = ((e81) rv4Var.j(tzaVar)).a;
            f81 f81Var = ((e81) rv4Var.j(tzaVar)).b;
            if (z) {
                j = p71Var.m;
            } else {
                j = zl1.h;
            }
            kq7 kq7Var2 = kq7.a;
            nq7 z3 = zbe.z(ote.x(1, vt4Var, rv4Var, nmd.v(pna.j(pna.f(kq7Var2, 1.0f), 32.0f, nae.e, 2), j, lre.g), false), 12.0f, 4.0f);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var, 48);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, z3);
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
            we6 f2 = s21.f(rv4Var, p, npVar4, 1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, f2);
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
            qye.b(ioaVar.b, null, oyb.a(f81Var.i, p71Var.h, 0L, null, null, null, 0L, null, 0, 0L, null, 16777214), null, 2, false, 1, 0, null, rv4Var, 1597440, 938);
            rv4Var.q(true);
            rv4Var.e0(1141324723);
            rv4Var.q(false);
            rv4Var.q(true);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new rd0(ioaVar, z, vt4Var, kq7Var, i, 18);
        }
    }

    public static final View i(mq7 mq7Var) {
        View view;
        wcd wcdVar = voe.v(mq7Var.a).L;
        if (wcdVar != null) {
            view = wcdVar.getInteropView();
        } else {
            view = null;
        }
        if (view != null) {
            return view;
        }
        vs.k("Could not fetch interop view");
        return null;
    }

    public static final float j(long j) {
        int i = (int) (j >> 32);
        if (Float.intBitsToFloat(i) == nae.e && Float.intBitsToFloat((int) (j & 4294967295L)) == nae.e) {
            return nae.e;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    public static final nq7 k(nq7 nq7Var, zu0 zu0Var) {
        return nq7Var.a0(new xu0(zu0Var));
    }

    public static final long l(r09 r09Var, boolean z) {
        long j;
        List list = r09Var.a;
        int size = list.size();
        long j2 = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            z09 z09Var = (z09) list.get(i2);
            if (z09Var.d && z09Var.h) {
                if (z) {
                    j = z09Var.c;
                } else {
                    j = z09Var.g;
                }
                j2 = y78.j(j2, j);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return y78.c(i, j2);
    }

    public static final float m(r09 r09Var, boolean z) {
        long j;
        long l = l(r09Var, z);
        boolean d2 = y78.d(l, 9205357640488583168L);
        float f2 = nae.e;
        if (d2) {
            return nae.e;
        }
        List list = r09Var.a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            z09 z09Var = (z09) list.get(i2);
            if (z09Var.d && z09Var.h) {
                if (z) {
                    j = z09Var.c;
                } else {
                    j = z09Var.g;
                }
                i++;
                f2 = y78.e(y78.i(j, l)) + f2;
            }
        }
        return f2 / i;
    }

    public static final long n(r09 r09Var) {
        long l = l(r09Var, true);
        if (y78.d(l, 9205357640488583168L)) {
            return 0L;
        }
        return y78.i(l, l(r09Var, false));
    }

    public static final float o(r09 r09Var) {
        List list = r09Var.a;
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            z09 z09Var = (z09) list.get(i);
            if (!z09Var.h || !z09Var.d) {
                i3 = 0;
            }
            i2 += i3;
            i++;
        }
        if (i2 >= 2) {
            long l = l(r09Var, true);
            long l2 = l(r09Var, false);
            int size2 = list.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i4 = 0; i4 < size2; i4++) {
                z09 z09Var2 = (z09) list.get(i4);
                if (z09Var2.d && z09Var2.h) {
                    long j = z09Var2.c;
                    long i5 = y78.i(z09Var2.g, l2);
                    long i6 = y78.i(j, l);
                    float j2 = j(i6) - j(i5);
                    float e2 = y78.e(y78.j(i6, i5)) / 2.0f;
                    if (j2 > 180.0f) {
                        j2 -= 360.0f;
                    } else if (j2 < -180.0f) {
                        j2 += 360.0f;
                    }
                    f3 += j2 * e2;
                    f2 += e2;
                }
            }
            if (f2 != nae.e) {
                return f3 / f2;
            }
        }
        return nae.e;
    }

    public static final float p(r09 r09Var) {
        float m = m(r09Var, true);
        float m2 = m(r09Var, false);
        if (m == nae.e || m2 == nae.e) {
            return 1.0f;
        }
        return m / m2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
        if (r9 == r7) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(defpackage.di2 r8, defpackage.n42 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.n49
            if (r0 == 0) goto L13
            r0 = r9
            n49 r0 = (defpackage.n49) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            n49 r0 = new n49
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.c
            r2 = 5
            pvc r3 = defpackage.pvc.a
            r4 = 0
            r5 = 2
            r6 = 1
            n82 r7 = defpackage.n82.a
            if (r1 == 0) goto L3a
            if (r1 == r6) goto L34
            if (r1 != r5) goto L2e
            defpackage.hre.r(r9)
            goto L7d
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r4
        L34:
            di2 r8 = r0.a
            defpackage.hre.r(r9)
            goto L5d
        L3a:
            defpackage.hre.r(r9)
            r0.a = r8
            r0.c = r6
            r8.getClass()
            e49 r9 = new e49
            java.lang.String r1 = "responseUri"
            r9.<init>(r1)
            ng2 r1 = r8.a
            iz7 r6 = new iz7
            r6.<init>(r9, r4, r2)
            java.lang.Object r9 = defpackage.y9e.o(r1, r6, r0)
            if (r9 != r7) goto L59
            goto L5a
        L59:
            r9 = r3
        L5a:
            if (r9 != r7) goto L5d
            goto L7c
        L5d:
            r0.a = r4
            r0.c = r5
            r8.getClass()
            e49 r9 = new e49
            java.lang.String r1 = "lastAuthRequest"
            r9.<init>(r1)
            ng2 r8 = r8.a
            iz7 r1 = new iz7
            r1.<init>(r9, r4, r2)
            java.lang.Object r8 = defpackage.y9e.o(r8, r1, r0)
            if (r8 != r7) goto L79
            goto L7a
        L79:
            r8 = r3
        L7a:
            if (r8 != r7) goto L7d
        L7c:
            return r7
        L7d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w9e.q(di2, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARN: Type inference failed for: r11v5, types: [yl9, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00db -> B:46:0x00df). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(defpackage.s11 r7, java.nio.channels.WritableByteChannel r8, long r9, defpackage.n42 r11) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w9e.r(s11, java.nio.channels.WritableByteChannel, long, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(defpackage.di2 r4, defpackage.n42 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.o49
            if (r0 == 0) goto L13
            r0 = r5
            o49 r0 = (defpackage.o49) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            o49 r0 = new o49
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.hre.r(r5)
            goto L51
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r3
        L2c:
            defpackage.hre.r(r5)
            r0.b = r2
            r4.getClass()
            e49 r5 = new e49
            java.lang.String r1 = "lastAuthRequest"
            r5.<init>(r1)
            ng2 r4 = r4.a
            sj4 r4 = r4.getData()
            ja r1 = new ja
            r2 = 15
            r1.<init>(r2, r4, r5)
            java.lang.Object r5 = defpackage.z1d.C(r1, r0)
            n82 r4 = defpackage.n82.a
            if (r5 != r4) goto L51
            return r4
        L51:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L74
            q36 r4 = defpackage.r36.d
            r4.getClass()     // Catch: java.lang.Exception -> L67
            x60 r0 = defpackage.y60.Companion     // Catch: java.lang.Exception -> L67
            s76 r0 = r0.serializer()     // Catch: java.lang.Exception -> L67
            s76 r0 = (defpackage.s76) r0     // Catch: java.lang.Exception -> L67
            java.lang.Object r3 = r4.a(r0, r5)     // Catch: java.lang.Exception -> L67
            goto L72
        L67:
            r4 = move-exception
            boolean r5 = r4 instanceof defpackage.v9a
            if (r5 != 0) goto L72
            boolean r5 = r4 instanceof java.lang.IllegalArgumentException
            if (r5 == 0) goto L71
            goto L72
        L71:
            throw r4
        L72:
            y60 r3 = (defpackage.y60) r3
        L74:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w9e.s(di2, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable t(defpackage.di2 r4, defpackage.n42 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.p49
            if (r0 == 0) goto L13
            r0 = r5
            p49 r0 = (defpackage.p49) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p49 r0 = new p49
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.hre.r(r5)
            goto L51
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r3
        L2c:
            defpackage.hre.r(r5)
            r0.b = r2
            r4.getClass()
            e49 r5 = new e49
            java.lang.String r1 = "responseUri"
            r5.<init>(r1)
            ng2 r4 = r4.a
            sj4 r4 = r4.getData()
            ja r1 = new ja
            r2 = 15
            r1.<init>(r2, r4, r5)
            java.lang.Object r5 = defpackage.z1d.C(r1, r0)
            n82 r4 = defpackage.n82.a
            if (r5 != r4) goto L51
            return r4
        L51:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L74
            q36 r4 = defpackage.r36.d
            r4.getClass()     // Catch: java.lang.Exception -> L67
            uyc r0 = defpackage.vyc.Companion     // Catch: java.lang.Exception -> L67
            s76 r0 = r0.serializer()     // Catch: java.lang.Exception -> L67
            s76 r0 = (defpackage.s76) r0     // Catch: java.lang.Exception -> L67
            java.lang.Object r3 = r4.a(r0, r5)     // Catch: java.lang.Exception -> L67
            goto L72
        L67:
            r4 = move-exception
            boolean r5 = r4 instanceof defpackage.v9a
            if (r5 != 0) goto L72
            boolean r5 = r4 instanceof java.lang.IllegalArgumentException
            if (r5 == 0) goto L71
            goto L72
        L71:
            throw r4
        L72:
            vyc r3 = (defpackage.vyc) r3
        L74:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w9e.t(di2, n42):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
        if (r6.c == 0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(defpackage.s11 r6, java.nio.ByteBuffer r7, defpackage.n42 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.m21
            if (r0 == 0) goto L13
            r0 = r8
            m21 r0 = (defpackage.m21) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            m21 r0 = new m21
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.d
            r2 = 0
            r3 = -1
            r4 = 1
            if (r1 == 0) goto L31
            if (r1 != r4) goto L2b
            java.nio.ByteBuffer r7 = r0.b
            s11 r6 = r0.a
            defpackage.hre.r(r8)
            goto L59
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r2
        L31:
            defpackage.hre.r(r8)
            boolean r8 = r6.i()
            if (r8 == 0) goto L40
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r3)
            return r6
        L40:
            ly0 r8 = r6.h()
            boolean r8 = r8.k()
            if (r8 == 0) goto L59
            r0.a = r6
            r0.b = r7
            r0.d = r4
            java.lang.Object r8 = r6.e(r4, r0)
            n82 r0 = defpackage.n82.a
            if (r8 != r0) goto L59
            return r0
        L59:
            boolean r8 = r6.i()
            if (r8 == 0) goto L65
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r3)
            return r6
        L65:
            ly0 r6 = r6.h()
            r6.getClass()
            r7.getClass()
            long r0 = r6.c
            r4 = 0
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 != 0) goto L83
            r0 = 8192(0x2000, double:4.0474E-320)
            r6.request(r0)
            long r0 = r6.c
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 != 0) goto L83
            goto Lc2
        L83:
            boolean r8 = r6.k()
            if (r8 == 0) goto L8a
            goto Lc2
        L8a:
            boolean r8 = r6.k()
            if (r8 != 0) goto Lc8
            d5a r8 = r6.a
            r8.getClass()
            byte[] r0 = r8.a
            int r1 = r8.b
            int r3 = r8.c
            int r4 = r7.remaining()
            int r3 = r3 - r1
            int r3 = java.lang.Math.min(r4, r3)
            r7.put(r0, r1, r3)
            if (r3 == 0) goto Lc2
            if (r3 < 0) goto Lbc
            int r7 = r8.b()
            if (r3 > r7) goto Lb6
            long r7 = (long) r3
            r6.skip(r7)
            goto Lc2
        Lb6:
            java.lang.String r6 = "Returned too many bytes"
            defpackage.vs.k(r6)
            return r2
        Lbc:
            java.lang.String r6 = "Returned negative read bytes count"
            defpackage.vs.k(r6)
            return r2
        Lc2:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r3)
            return r6
        Lc8:
            java.lang.String r6 = "Buffer is empty"
            defpackage.vs.m(r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w9e.u(s11, java.nio.ByteBuffer, n42):java.lang.Object");
    }

    public static fz4 v(Class cls) {
        return new fz4(new y67(cls, null, x67.a));
    }

    public static fz4 w(Object obj) {
        boolean z = obj instanceof gi1;
        x67 x67Var = x67.a;
        if (z) {
            return new fz4(new y67(nmd.B((gi1) obj), obj, x67Var));
        }
        if (obj instanceof Class) {
            return new fz4(new y67((Class) obj, obj, x67Var));
        }
        return new fz4(new y67(obj.getClass(), obj, x67Var));
    }

    public static final Object x(di2 di2Var, y60 y60Var, k49 k49Var) {
        q36 q36Var = r36.d;
        q36Var.getClass();
        String b2 = q36Var.b(y60.Companion.serializer(), y60Var);
        di2Var.getClass();
        Object o = y9e.o(di2Var.a, new ol((Object) new e49("lastAuthRequest"), b2, (m42) null, 19), k49Var);
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        if (o != n82Var) {
            o = pvcVar;
        }
        if (o == n82Var) {
            return o;
        }
        return pvcVar;
    }

    public static int y(int i) {
        int[] iArr = {1, 2, 3};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 != 0) {
                if (i4 == i) {
                    return i3;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }
}
