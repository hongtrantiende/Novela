package defpackage;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tc4  reason: default package */
/* loaded from: classes3.dex */
public abstract class tc4 {
    public static final fs a = new fs(Float.POSITIVE_INFINITY);
    public static final gs b = new gs(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final hs c = new hs(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final is d = new is(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final fs e = new fs(Float.NEGATIVE_INFINITY);
    public static final gs f = new gs(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final hs g = new hs(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final is h = new is(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final tu1 i = new tu1(new mv1(19), false, 265761641);
    public static final tu1 j = new tu1(new mv1(20), false, 1272717951);
    public static final tu1 k = new tu1(new mv1(21), false, 1461791208);
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static int A(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static int B(byte[] bArr, int i2, lzd lzdVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            lzdVar.a = b2;
            return i3;
        }
        return v(b2, bArr, i3, lzdVar);
    }

    public static int C(byte[] bArr, int i2, lzd lzdVar) {
        byte b2;
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            lzdVar.b = j2;
            return i3;
        }
        int i4 = i2 + 2;
        byte b3 = bArr[i3];
        long j3 = (j2 & 127) | ((b3 & Byte.MAX_VALUE) << 7);
        int i5 = 7;
        while (b3 < 0) {
            int i6 = i4 + 1;
            i5 += 7;
            j3 |= (b2 & Byte.MAX_VALUE) << i5;
            b3 = bArr[i4];
            i4 = i6;
        }
        lzdVar.b = j3;
        return i4;
    }

    public static long D(byte[] bArr, int i2) {
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    public static final lq a(float f2, float f3) {
        return new lq(Float.valueOf(f2), fca.f, Float.valueOf(f3), 8);
    }

    public static final void b(vl6 vl6Var, boolean z, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        kq7 kq7Var;
        float f2;
        long j2;
        kq7 kq7Var2;
        boolean z3;
        rv4 rv4Var2 = rv4Var;
        Map map = vl6Var.b;
        rv4Var2.g0(611433330);
        if (rv4Var2.f(vl6Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (rv4Var2.g(z)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4 | 384;
        if (rv4Var2.h(vt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i8 = i7 | i5;
        if ((i8 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i8 & 1, z2)) {
            boolean f3 = rv4Var2.f(map);
            Object P = rv4Var2.P();
            if (f3 || P == ax1.a) {
                String str = (String) sl1.d0(map.values());
                if (str == null) {
                    str = "";
                }
                P = str;
                rv4Var2.o0(P);
            }
            String str2 = (String) P;
            if (z) {
                f2 = 0.85f;
            } else {
                f2 = 1.0f;
            }
            yya b2 = nq.b(f2, tte.x(Context.VERSION_ES6, 0, null, 6), null, rv4Var2, 48, 28);
            if (z) {
                rv4Var2.e0(-823074311);
                j2 = ((h27) rv4Var2.j(j27.a)).a.a;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-823073699);
                rv4Var2.q(false);
                j2 = zl1.h;
            }
            yya a2 = wma.a(j2, tte.x(Context.VERSION_ES6, 0, null, 6), rv4Var2, 48, 12);
            kq7 kq7Var3 = kq7.a;
            nq7 f4 = lbe.f(15, vt4Var, kq7Var3, null, false);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, f4);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, a3);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            nq7 k2 = tte.k(jsc.t(0.6666667f, pna.f(kq7Var3, 1.0f), false), r0f.z(rv4Var2).b);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, k2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, d2);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            String str3 = vl6Var.a;
            String str4 = vl6Var.d;
            String str5 = vl6Var.j;
            u22 u22Var = r0f.d;
            ze4 ze4Var = pna.c;
            float floatValue = ((Number) b2.getValue()).floatValue();
            do5.c(str3, str2, str4, str5, u22Var, st0.d(tte.k(qwe.r(ze4Var, floatValue, floatValue), r0f.z(rv4Var).b), 3.0f, ((zl1) a2.getValue()).a, r0f.z(rv4Var).b), rv4Var, 24576);
            rv4 rv4Var3 = rv4Var;
            if (z) {
                rv4Var3.e0(2054278791);
                kq7Var2 = kq7Var3;
                nq7 v = nmd.v(tte.k(pna.n(zbe.y(pu0.a.a(kq7Var2, kh5.c), 6.0f), 24.0f), uu9.a), r0f.y(rv4Var3).a, lre.g);
                b37 d3 = fu0.d(kh5.e, false);
                int hashCode3 = Long.hashCode(rv4Var3.T);
                xt8 l4 = rv4Var3.l();
                nq7 p3 = lye.p(rv4Var3, v);
                rv4Var3.i0();
                if (rv4Var3.S) {
                    rv4Var3.k(zx1Var);
                } else {
                    rv4Var3.r0();
                }
                jce.F(npVar, rv4Var3, d3);
                jce.F(npVar2, rv4Var3, l4);
                s21.t(hashCode3, rv4Var3, npVar3, rv4Var3, kgVar);
                jce.F(npVar4, rv4Var3, p3);
                nk5.a(rp5.c((wk3) jk3.v.getValue(), rv4Var3, 0), null, pna.n(kq7Var2, 16.0f), r0f.y(rv4Var3).b, rv4Var3, 432, 0);
                rv4Var3 = rv4Var3;
                z3 = true;
                rv4Var3.q(true);
                rv4Var3.q(false);
            } else {
                kq7Var2 = kq7Var3;
                z3 = true;
                rv4Var3.e0(2054960140);
                rv4Var3.q(false);
            }
            rs8.u(rv4Var3, z3, kq7Var2, 4.0f, rv4Var3);
            kq7Var = kq7Var2;
            cvb.c(str2, pna.f(kq7Var2, 1.0f), 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 2, false, 2, 0, null, r0f.A(rv4Var3).l, rv4Var, 48, 24960, 109564);
            rv4Var2 = rv4Var;
            rv4Var2.q(z3);
        } else {
            rv4Var2.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new rd0(vl6Var, z, kq7Var, vt4Var, i2, 9);
        }
    }

    public static final void c(int i2, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, String str, boolean z) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        Object gs9Var;
        rv4Var.g0(1106478229);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (rv4Var.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (rv4Var.h(xt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i8 = i5 | i7;
        if ((i8 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i8 & 1, z2)) {
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                int length = str.length();
                P = yae.z(new jub(upperCase, sze.a(length, length), 4));
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            boolean f2 = rv4Var.f(((jub) aw7Var.getValue()).a.b);
            Object P2 = rv4Var.P();
            if (f2 || P2 == lh9Var) {
                try {
                    gs9Var = new zl1(kve.v(((jub) aw7Var.getValue()).a.b));
                } catch (Throwable th) {
                    gs9Var = new gs9(th);
                }
                P2 = Boolean.valueOf(gs9Var instanceof gs9);
                rv4Var.o0(P2);
            }
            boolean booleanValue = ((Boolean) P2).booleanValue();
            xb.d(z, xt4Var, jce.E(-1911644223, new me7(booleanValue, xt4Var2, aw7Var, 1), rv4Var), null, mwe.x(kq7.a, 14), jce.E(-1148911714, new id1(xt4Var, 13, (byte) 0), rv4Var), hxe.c, null, 0L, 0L, nae.e, false, false, jce.E(1382762089, new ne7(booleanValue, aw7Var, 1), rv4Var), rv4Var, (i8 & 14) | 1769904, 8072);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new i24(z, str, xt4Var, xt4Var2, i2, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x031e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(int r46, defpackage.xt4 r47, defpackage.rv4 r48, defpackage.nq7 r49, java.lang.String r50) {
        /*
            Method dump skipped, instructions count: 1271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tc4.d(int, xt4, rv4, nq7, java.lang.String):void");
    }

    public static final void e(String str, String str2, boolean z, nq7 nq7Var, xt4 xt4Var, lu4 lu4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        kq7 kq7Var;
        str.getClass();
        str2.getClass();
        xt4Var.getClass();
        lu4Var.getClass();
        rv4Var.g0(-926713272);
        if (rv4Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (rv4Var.f(str2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (rv4Var.g(z)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i10 = i9 | i5 | 3072;
        if (rv4Var.h(xt4Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if (rv4Var.h(lu4Var)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i12 = i11 | i7;
        if ((74899 & i12) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i12 & 1, z2)) {
            eu3 g2 = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new ww6(23);
                rv4Var.o0(P);
            }
            eu3 a2 = g2.a(zt3.t((xt4) P));
            lz3 i13 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new ww6(24);
                rv4Var.o0(P2);
            }
            z87.a(z, xt4Var, a2, i13.a(zt3.x((xt4) P2)), null, 0L, false, false, null, jce.E(-88283354, new g83(str, str2, xt4Var, lu4Var), rv4Var), rv4Var, ((i12 >> 6) & 14) | 805309824 | ((i12 >> 9) & Token.ASSIGN_MOD), 496);
            kq7Var = kq7.a;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ds1(str, str2, z, kq7Var, xt4Var, lu4Var, i2);
        }
    }

    public static final void f(int i2, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, String str, boolean z) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        rv4Var.g0(420601488);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (rv4Var.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (rv4Var.h(xt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i8 = i7 | i5;
        if ((i8 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i8 & 1, z2)) {
            nmd.d(z, xt4Var, null, true, null, null, 0L, 0L, nae.e, 0L, null, jce.E(-580506388, new pe7(1, xt4Var2, str), rv4Var), rv4Var, (i8 & 14) | 3120, 48, 2036);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new i24(z, str, xt4Var, xt4Var2, i2, 5);
        }
    }

    public static final void g(int i2, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, String str, boolean z) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        rv4Var.g0(1719696648);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (rv4Var.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (rv4Var.h(xt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i8 = i7 | i5;
        if ((i8 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i8 & 1, z2)) {
            xb.d(z, xt4Var, null, null, null, null, null, null, 0L, 0L, nae.e, false, false, jce.E(-76102476, new ke7(1, xt4Var2, str), rv4Var), rv4Var, (i8 & 14) | 48, 8188);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new i24(z, str, xt4Var, xt4Var2, i2, 4);
        }
    }

    public static final void h(int i2, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, String str, boolean z) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        str.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var.g0(749574948);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i2;
        if (rv4Var.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (rv4Var.h(xt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i8 = i7 | i5;
        if ((i8 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i8 & 1, z2)) {
            if (ikd.a(rv4Var)) {
                rv4Var.e0(1052506179);
                f(i8 & 8190, xt4Var, xt4Var2, rv4Var, str, z);
                rv4Var.q(false);
            } else {
                rv4Var.e0(1052665736);
                g(i8 & 8190, xt4Var, xt4Var2, rv4Var, str, z);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new i24(z, str, xt4Var, xt4Var2, i2, 3);
        }
    }

    public static final void i(int i2, int i3, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, boolean z) {
        int i4;
        int i5;
        int i6;
        boolean z2;
        kq7 kq7Var;
        rv4Var.g0(-1650943869);
        if (rv4Var.d(i2)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i7 = i3 | i4;
        if (rv4Var.g(z)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i8 = i7 | i5 | 384;
        if (rv4Var.h(vt4Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i9 = i8 | i6;
        if ((i9 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i9 & 1, z2)) {
            v72 v72Var = ((h27) rv4Var.j(j27.a)).c.c;
            kq7 kq7Var2 = kq7.a;
            nmd.a(vt4Var, zbe.z(pna.f(kq7Var2, 1.0f), 16.0f, 12.0f), z, v72Var, null, null, null, null, jce.E(-87324013, new zj7(i2, 8), rv4Var), rv4Var, ((i9 >> 9) & 14) | 805306368 | ((i9 << 3) & 896), 496);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new am(i2, z, kq7Var, vt4Var, i3);
        }
    }

    public static final void j(int i2, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, cz7 cz7Var, rh8 rh8Var, bkd bkdVar) {
        int i3;
        int i4;
        int i5;
        int i6;
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
        rv4Var.g0(940315608);
        if (rv4Var.f(cz7Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (rv4Var.f(rh8Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var.f(bkdVar)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if (rv4Var.h(vt4Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i10 = i9 | i6;
        if ((i10 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i10 & 1, z)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                nia niaVar = (nia) ((fdd) voe.z(cm9.a(nia.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
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
                    aw7 z10 = jsc.z(niaVar.e, rv4Var);
                    Object[] objArr = new Object[0];
                    Object P = rv4Var.P();
                    Object obj = ax1.a;
                    if (P == obj) {
                        P = new mia(0);
                        rv4Var.o0(P);
                    }
                    aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 48);
                    Object[] objArr2 = new Object[0];
                    Object P2 = rv4Var.P();
                    if (P2 == obj) {
                        P2 = new mia(1);
                        rv4Var.o0(P2);
                    }
                    aw7 aw7Var2 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var, 48);
                    uja ujaVar = (uja) z10.getValue();
                    boolean z11 = ((y0d) z9.getValue()).i;
                    boolean f2 = rv4Var.f(niaVar);
                    Object P3 = rv4Var.P();
                    if (f2 || P3 == obj) {
                        P3 = new yw7(0, niaVar, nia.class, "loadMore", "loadMore()V", 0, 27);
                        rv4Var.o0(P3);
                    }
                    i76 i76Var = (i76) P3;
                    int i11 = i10 & 14;
                    if (i11 == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Object P4 = rv4Var.P();
                    if (z2 || P4 == obj) {
                        P4 = new ar0(cz7Var, 19);
                        rv4Var.o0(P4);
                    }
                    xt4 xt4Var = (xt4) P4;
                    boolean f3 = rv4Var.f(aw7Var2) | rv4Var.f(aw7Var);
                    Object P5 = rv4Var.P();
                    if (f3 || P5 == obj) {
                        P5 = new pr0(aw7Var2, aw7Var, 24);
                        rv4Var.o0(P5);
                    }
                    tl1.k(ujaVar, z11, rh8Var, bkdVar, nq7Var, xt4Var, (xt4) P5, vt4Var, (vt4) i76Var, rv4Var, ((i10 << 9) & 29360128) | (i10 & 8064) | 24576);
                    String str = (String) aw7Var2.getValue();
                    boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
                    boolean f4 = rv4Var.f(aw7Var);
                    Object P6 = rv4Var.P();
                    if (f4 || P6 == obj) {
                        P6 = new jia(aw7Var, 2);
                        rv4Var.o0(P6);
                    }
                    xt4 xt4Var2 = (xt4) P6;
                    boolean f5 = rv4Var.f(aw7Var);
                    if (i11 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z12 = f5 | z3;
                    Object P7 = rv4Var.P();
                    if (z12 || P7 == obj) {
                        P7 = new if3(cz7Var, aw7Var, 4);
                        rv4Var.o0(P7);
                    }
                    lu4 lu4Var = (lu4) P7;
                    boolean f6 = rv4Var.f(aw7Var);
                    if (i11 == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z13 = z4 | f6;
                    Object P8 = rv4Var.P();
                    if (z13 || P8 == obj) {
                        P8 = new w73(cz7Var, aw7Var, 22);
                        rv4Var.o0(P8);
                    }
                    xt4 xt4Var3 = (xt4) P8;
                    boolean f7 = rv4Var.f(aw7Var);
                    if (i11 == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean z14 = f7 | z5;
                    Object P9 = rv4Var.P();
                    if (z14 || P9 == obj) {
                        P9 = new w73(cz7Var, aw7Var, 23);
                        rv4Var.o0(P9);
                    }
                    xt4 xt4Var4 = (xt4) P9;
                    boolean f8 = rv4Var.f(aw7Var);
                    if (i11 == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean z15 = f8 | z6;
                    Object P10 = rv4Var.P();
                    if (z15 || P10 == obj) {
                        P10 = new w73(cz7Var, aw7Var, 20);
                        rv4Var.o0(P10);
                    }
                    xt4 xt4Var5 = (xt4) P10;
                    boolean f9 = rv4Var.f(aw7Var);
                    if (i11 == 4) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean z16 = f9 | z7;
                    Object P11 = rv4Var.P();
                    if (z16 || P11 == obj) {
                        P11 = new w73(cz7Var, aw7Var, 21);
                        rv4Var.o0(P11);
                    }
                    xt4 xt4Var6 = (xt4) P11;
                    if (i11 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    Object P12 = rv4Var.P();
                    if (z8 || P12 == obj) {
                        P12 = new ar0(cz7Var, 18);
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
            u.d = new nf3(cz7Var, nq7Var, rh8Var, bkdVar, vt4Var, i2, 4);
        }
    }

    public static final void k(aw7 aw7Var, boolean z) {
        aw7Var.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final long r29, defpackage.nq7 r31, boolean r32, final long r33, long r35, long r37, long r39, int r41, boolean r42, int r43, int r44, defpackage.xt4 r45, final defpackage.oyb r46, defpackage.rv4 r47, final int r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tc4.l(long, nq7, boolean, long, long, long, long, int, boolean, int, int, xt4, oyb, rv4, int, int, int):void");
    }

    public static final void m(long j2, long j3, long j4) {
        if (j3 >= 0 && j4 <= j2) {
            if (j3 <= j4) {
                return;
            }
            StringBuilder o = rs8.o(j3, "startIndex (", ") > endIndex (");
            o.append(j4);
            o.append(')');
            throw new IllegalArgumentException(o.toString());
        }
        StringBuilder o2 = rs8.o(j3, "startIndex (", ") and endIndex (");
        o2.append(j4);
        cy7.k(a82.n(o2, ") are not within the range [0..size(", j2, "))"));
    }

    public static final void n(long j2, long j3) {
        if (0 <= j2 && j2 >= j3 && j3 >= 0) {
            return;
        }
        vs.m(hl5.q(rs8.o(j3, "offset (0) and byteCount (", ") are not within the range [0..size("), j2, "))"));
    }

    public static final String o(r36 r36Var, o9a o9aVar) {
        o9aVar.getClass();
        r36Var.getClass();
        for (Annotation annotation : o9aVar.getAnnotations()) {
            if (annotation instanceof z36) {
                return ((z36) annotation).discriminator();
            }
        }
        return r36Var.a.h;
    }

    public static void p(String str) {
        String str2 = hn8.b;
        hn8 d2 = fn8.d(str, false);
        m66 m66Var = pe4.a;
        if (!m66Var.j0(d2)) {
            return;
        }
        if (m66Var.y0(d2).b) {
            ArrayList arrayList = (ArrayList) m66Var.m0(d2);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                p(((hn8) obj).a.t());
            }
        }
        m66 m66Var2 = pe4.a;
        m66Var2.getClass();
        m66Var2.V(d2, false);
    }

    public static final d82 q(d82 d82Var, d82 d82Var2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) d82Var.fold(bool, new tv1(26))).booleanValue();
        boolean booleanValue2 = ((Boolean) d82Var2.fold(bool, new tv1(26))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return d82Var.plus(d82Var2);
        }
        tv1 tv1Var = new tv1(27);
        gs3 gs3Var = gs3.a;
        d82 d82Var3 = (d82) d82Var.fold(gs3Var, tv1Var);
        d82 d82Var4 = d82Var2;
        if (booleanValue2) {
            d82Var4 = d82Var2.fold(gs3Var, new tv1(28));
        }
        return d82Var3.plus(d82Var4);
    }

    public static final void r(cz7 cz7Var, String str) {
        cz7Var.getClass();
        str.getClass();
        cz7Var.a.c(new tw0(str));
    }

    public static final d82 s(m82 m82Var, d82 d82Var) {
        d82 q = q(m82Var.q(), d82Var, true);
        sw2 sw2Var = ab3.a;
        if (q != sw2Var && q.get(abf.d) == null) {
            return q.plus(sw2Var);
        }
        return q;
    }

    public static final gvc t(m42 m42Var, d82 d82Var, Object obj) {
        gvc gvcVar = null;
        if ((m42Var instanceof o82) && d82Var.get(j61.c) != null) {
            o82 o82Var = (o82) m42Var;
            while (true) {
                if (!(o82Var instanceof va3) && (o82Var = o82Var.getCallerFrame()) != null) {
                    if (o82Var instanceof gvc) {
                        gvcVar = (gvc) o82Var;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (gvcVar != null) {
                gvcVar.v0(d82Var, obj);
            }
        }
        return gvcVar;
    }

    public static int u(int i2, byte[] bArr, int i3, int i4, x8e x8eVar, lzd lzdVar) {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 == 5) {
                                x8eVar.c(i2, Integer.valueOf(A(bArr, i3)));
                                return i3 + 4;
                            }
                            throw w7e.b();
                        }
                        x8e e2 = x8e.e();
                        int i6 = (i2 & (-8)) | 4;
                        int i7 = lzdVar.d + 1;
                        lzdVar.d = i7;
                        if (i7 < 100) {
                            int i8 = 0;
                            while (true) {
                                if (i3 >= i4) {
                                    break;
                                }
                                int B = B(bArr, i3, lzdVar);
                                i8 = lzdVar.a;
                                if (i8 != i6) {
                                    i3 = u(i8, bArr, B, i4, e2, lzdVar);
                                } else {
                                    i3 = B;
                                    break;
                                }
                            }
                            lzdVar.d--;
                            if (i3 <= i4 && i8 == i6) {
                                x8eVar.c(i2, e2);
                                return i3;
                            }
                            throw w7e.f();
                        }
                        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
                    int B2 = B(bArr, i3, lzdVar);
                    int i9 = lzdVar.a;
                    if (i9 >= 0) {
                        if (i9 <= bArr.length - B2) {
                            if (i9 == 0) {
                                x8eVar.c(i2, s6e.b);
                            } else {
                                x8eVar.c(i2, s6e.e(bArr, B2, i9));
                            }
                            return B2 + i9;
                        }
                        throw w7e.g();
                    }
                    throw w7e.e();
                }
                x8eVar.c(i2, Long.valueOf(D(bArr, i3)));
                return i3 + 8;
            }
            int C = C(bArr, i3, lzdVar);
            x8eVar.c(i2, Long.valueOf(lzdVar.b));
            return C;
        }
        throw w7e.b();
    }

    public static int v(int i2, byte[] bArr, int i3, lzd lzdVar) {
        int i4 = i2 & Token.SWITCH;
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            lzdVar.a = i4 | (b2 << 7);
            return i5;
        }
        int i6 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i7 = i3 + 2;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            lzdVar.a = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & Byte.MAX_VALUE) << 14);
        int i9 = i3 + 3;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            lzdVar.a = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & Byte.MAX_VALUE) << 21);
        int i11 = i3 + 4;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            lzdVar.a = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                lzdVar.a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static int w(Object obj, o8e o8eVar, byte[] bArr, int i2, int i3, int i4, lzd lzdVar) {
        h8e h8eVar = (h8e) o8eVar;
        int i5 = lzdVar.d + 1;
        lzdVar.d = i5;
        if (i5 < 100) {
            int k2 = h8eVar.k(obj, bArr, i2, i3, i4, lzdVar);
            lzdVar.d--;
            lzdVar.c = obj;
            return k2;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static int x(Object obj, o8e o8eVar, byte[] bArr, int i2, int i3, lzd lzdVar) {
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            i4 = v(i5, bArr, i4, lzdVar);
            i5 = lzdVar.a;
        }
        int i6 = i4;
        if (i5 >= 0 && i5 <= i3 - i6) {
            int i7 = lzdVar.d + 1;
            lzdVar.d = i7;
            if (i7 < 100) {
                int i8 = i6 + i5;
                o8eVar.g(obj, bArr, i6, i8, lzdVar);
                lzdVar.d--;
                lzdVar.c = obj;
                return i8;
            }
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        throw w7e.g();
    }

    public static int y(byte[] bArr, int i2, lzd lzdVar) {
        int B = B(bArr, i2, lzdVar);
        int i3 = lzdVar.a;
        if (i3 >= 0) {
            if (i3 <= bArr.length - B) {
                if (i3 == 0) {
                    lzdVar.c = s6e.b;
                    return B;
                }
                lzdVar.c = s6e.e(bArr, B, i3);
                return B + i3;
            }
            throw w7e.g();
        }
        throw w7e.e();
    }

    public static int z(o8e o8eVar, int i2, byte[] bArr, int i3, int i4, v7e v7eVar, lzd lzdVar) {
        m7e zza = o8eVar.zza();
        o8e o8eVar2 = o8eVar;
        byte[] bArr2 = bArr;
        int i5 = i4;
        lzd lzdVar2 = lzdVar;
        int x = x(zza, o8eVar2, bArr2, i3, i5, lzdVar2);
        o8eVar2.d(zza);
        lzdVar2.c = zza;
        l8e l8eVar = (l8e) v7eVar;
        l8eVar.add(zza);
        while (x < i5) {
            lzd lzdVar3 = lzdVar2;
            int i6 = i5;
            int B = B(bArr2, x, lzdVar3);
            if (i2 != lzdVar3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            o8e o8eVar3 = o8eVar2;
            m7e zza2 = o8eVar3.zza();
            x = x(zza2, o8eVar3, bArr3, B, i6, lzdVar3);
            o8eVar2 = o8eVar3;
            bArr2 = bArr3;
            i5 = i6;
            lzdVar2 = lzdVar3;
            o8eVar2.d(zza2);
            lzdVar2.c = zza2;
            l8eVar.add(zza2);
        }
        return x;
    }
}
