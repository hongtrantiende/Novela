package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ipe  reason: default package */
/* loaded from: classes.dex */
public abstract class ipe {
    public static final tu1 a = new tu1(new xu1(8), false, -708279179);
    public static final int[] b = new int[0];
    public static final long[] c = new long[0];
    public static final Object[] d = new Object[0];
    public static final StackTraceElement[] e = new StackTraceElement[0];
    public static final float f = 0.38f;

    public static final ok0 A(ok0 ok0Var, Boolean bool) {
        ok0 ok0Var2 = hq7.E;
        ok0 ok0Var3 = hq7.f;
        ok0 ok0Var4 = hq7.c;
        ok0Var.getClass();
        if (bool.booleanValue()) {
            ok0 ok0Var5 = hq7.a;
            if (ok0Var.equals(ok0Var5)) {
                return ok0Var4;
            }
            ok0 ok0Var6 = hq7.b;
            if (ok0Var.equals(ok0Var6)) {
                return ok0Var6;
            }
            if (ok0Var.equals(ok0Var4)) {
                return ok0Var5;
            }
            ok0 ok0Var7 = hq7.d;
            if (ok0Var.equals(ok0Var7)) {
                return ok0Var3;
            }
            ok0 ok0Var8 = hq7.e;
            if (ok0Var.equals(ok0Var8)) {
                return ok0Var8;
            }
            if (ok0Var.equals(ok0Var3)) {
                return ok0Var7;
            }
            ok0 ok0Var9 = hq7.C;
            if (ok0Var.equals(ok0Var9)) {
                return ok0Var2;
            }
            ok0 ok0Var10 = hq7.D;
            if (ok0Var.equals(ok0Var10)) {
                return ok0Var10;
            }
            if (ok0Var.equals(ok0Var2)) {
                return ok0Var9;
            }
        }
        return ok0Var;
    }

    public static final Rect B(uy5 uy5Var) {
        return new Rect(uy5Var.a, uy5Var.b, uy5Var.c, uy5Var.d);
    }

    public static final RectF C(rk9 rk9Var) {
        return new RectF(rk9Var.a, rk9Var.b, rk9Var.c, rk9Var.d);
    }

    public static final rk9 D(Rect rect) {
        return new rk9(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final rk9 E(RectF rectF) {
        return new rk9(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static byte[] F(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i = 0; i < 16; i++) {
                byte b2 = (byte) ((bArr[i] << 1) & 254);
                bArr2[i] = b2;
                if (i < 15) {
                    bArr2[i] = (byte) (((byte) ((bArr[i + 1] >> 7) & 1)) | b2);
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & Token.VAR)) ^ bArr2[15]);
            return bArr2;
        }
        vs.m("value must be a block.");
        return null;
    }

    public static final void a(int i, rv4 rv4Var, nq7 nq7Var, rh8 rh8Var) {
        int i2;
        boolean z;
        int i3;
        int i4;
        rh8Var.getClass();
        rv4Var.g0(-1445795308);
        if ((i & 6) == 0) {
            if (rv4Var.f(rh8Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            if (ikd.a(rv4Var)) {
                rv4Var.e0(-1755846851);
                c(i2 & Token.ELSE, rv4Var, nq7Var, rh8Var);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1755760547);
                d(i2 & Token.ELSE, rv4Var, nq7Var, rh8Var);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new d33(rh8Var, nq7Var, i, 0);
        }
    }

    public static final void b(nq7 nq7Var, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        rv4Var.g0(-1085744195);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            tza tzaVar = j27.a;
            nq7 y = zbe.y(nmd.v(tte.k(nq7Var, ((h27) rv4Var.j(tzaVar)).c.d), rm1.g(((h27) rv4Var.j(tzaVar)).a, 1.0f), lre.g), 16.0f);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
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
            jce.F(qw1.f, rv4Var, a2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            tu1Var.c(zn1.a, rv4Var, 54);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new dn(nq7Var, tu1Var, i, 3);
        }
    }

    public static final void c(int i, rv4 rv4Var, nq7 nq7Var, rh8 rh8Var) {
        int i2;
        boolean z;
        int i3;
        int i4;
        rv4Var.g0(-597884298);
        if ((i & 6) == 0) {
            if (rv4Var.f(rh8Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
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
            jce.F(qw1.f, rv4Var, a2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            f(i2 & 14, rv4Var, null, rh8Var);
            kq7 kq7Var = kq7.a;
            e(zbe.C(zbe.A(pna.f(kq7Var, 1.0f), 16.0f, nae.e, 2), nae.e, nae.e, nae.e, 8.0f, 7), rv4Var, 6);
            b(zbe.A(zbe.C(pna.f(kq7Var, 1.0f), nae.e, 16.0f, nae.e, nae.e, 13), 16.0f, nae.e, 2), nqe.a, rv4Var, 54);
            b(zbe.A(zbe.C(pna.f(kq7Var, 1.0f), nae.e, 40.0f, nae.e, nae.e, 13), 16.0f, nae.e, 2), nqe.b, rv4Var, 54);
            b(zbe.A(zbe.C(pna.f(kq7Var, 1.0f), nae.e, 16.0f, nae.e, nae.e, 13), 16.0f, nae.e, 2), nqe.c, rv4Var, 54);
            hl5.w(kq7Var, 16.0f, rv4Var, true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new d33(rh8Var, nq7Var, i, 1);
        }
    }

    public static final void d(int i, rv4 rv4Var, nq7 nq7Var, rh8 rh8Var) {
        int i2;
        boolean z;
        float f2;
        float f3;
        int i3;
        int i4;
        rv4Var.g0(-390722674);
        if ((i & 6) == 0) {
            if (rv4Var.f(rh8Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
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
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = 1.0f;
            }
            we6 we6Var = new we6(f2, true);
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
            f(i2 & 14, rv4Var, null, rh8Var);
            kq7 kq7Var = kq7.a;
            e(zbe.C(zbe.A(pna.f(kq7Var, 1.0f), 16.0f, nae.e, 2), nae.e, nae.e, nae.e, 8.0f, 7), rv4Var, 6);
            b(zbe.A(zbe.C(pna.f(kq7Var, 1.0f), nae.e, 16.0f, nae.e, nae.e, 13), 16.0f, nae.e, 2), nqe.d, rv4Var, 54);
            b(zbe.A(zbe.C(pna.f(kq7Var, 1.0f), nae.e, 16.0f, nae.e, nae.e, 13), 16.0f, nae.e, 2), nqe.e, rv4Var, 54);
            rv4Var.q(true);
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f3 = Float.MAX_VALUE;
            } else {
                f3 = 1.0f;
            }
            b(zbe.C(zbe.C(mwe.u(new we6(f3, true), false, 9), nae.e, 60.0f, nae.e, nae.e, 13), 16.0f, nae.e, 16.0f, nae.e, 10), nqe.f, rv4Var, 48);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new d33(rh8Var, nq7Var, i, 2);
        }
    }

    public static final void e(nq7 nq7Var, rv4 rv4Var, int i) {
        boolean z;
        nq7 nq7Var2;
        rv4 rv4Var2;
        rv4Var.g0(518138390);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            tu1 tu1Var = nqe.g;
            lh9 lh9Var = lz.e;
            nq7Var2 = nq7Var;
            rv4Var2 = rv4Var;
            s9e.f(nq7Var2, lh9Var, lh9Var, null, 0, 0, tu1Var, rv4Var2, 1573302);
        } else {
            nq7Var2 = nq7Var;
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new oa(nq7Var2, i, 4);
        }
    }

    public static final void f(int i, rv4 rv4Var, nq7 nq7Var, rh8 rh8Var) {
        int i2;
        boolean z;
        kq7 kq7Var;
        int i3;
        rv4Var.g0(992685889);
        if ((i & 6) == 0) {
            if (rv4Var.f(rh8Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i4 & 1, z)) {
            kq7 kq7Var2 = kq7.a;
            nq7 B = zbe.B(zbe.x(pna.f(kq7Var2, 1.0f), rh8Var), 28.0f, 12.0f, 28.0f, 12.0f);
            xn1 a2 = wn1.a(lz.c, kh5.J, rv4Var, 48);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, B);
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
            dpe.g(jsc.t(0.6666667f, pna.s(kq7Var2, 150.0f), false), ((h27) rv4Var.j(j27.a)).c.d, rv4Var, 6, 0);
            dpe.g(pna.h(zbe.A(hl5.f(kq7Var2, 12.0f, rv4Var, kq7Var2, 1.0f), 16.0f, nae.e, 2), 32.0f), null, rv4Var, 6, 2);
            xbe.i(rv4Var, pna.h(kq7Var2, 8.0f));
            dpe.g(pna.h(pna.s(kq7Var2, 160.0f), 20.0f), null, rv4Var, 6, 2);
            xbe.i(rv4Var, pna.h(kq7Var2, 8.0f));
            dpe.g(pna.h(pna.s(kq7Var2, 120.0f), 20.0f), null, rv4Var, 6, 2);
            rv4Var.q(true);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new d33(rh8Var, kq7Var, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final java.lang.String r64, defpackage.nq7 r65, final java.util.List r66, long r67, long r69, defpackage.tlb r71, long r72, int r74, boolean r75, final int r76, int r77, final defpackage.oyb r78, defpackage.rv4 r79, final int r80, final int r81, final int r82) {
        /*
            Method dump skipped, instructions count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipe.g(java.lang.String, nq7, java.util.List, long, long, tlb, long, int, boolean, int, int, oyb, rv4, int, int, int):void");
    }

    public static final void h(boolean z, q3c q3cVar, xt4 xt4Var, xt4 xt4Var2, lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        q3cVar.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        lu4Var.getClass();
        rv4Var.g0(-1812139921);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var.f(q3cVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var.h(xt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(lu4Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((i11 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i11 & 1, z2)) {
            if (ikd.a(rv4Var)) {
                rv4Var.e0(-2016191303);
                i(z, q3cVar, xt4Var, xt4Var2, lu4Var, rv4Var, i11 & 65534);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-2015937382);
                j(z, q3cVar, xt4Var, xt4Var2, lu4Var, rv4Var, i11 & 65534);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new fp7(z, q3cVar, xt4Var, xt4Var2, lu4Var, i, 0);
        }
    }

    public static final void i(boolean z, q3c q3cVar, xt4 xt4Var, xt4 xt4Var2, lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        rv4Var.g0(994052868);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var.f(q3cVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var.h(xt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(lu4Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((i11 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i11 & 1, z2)) {
            nk0 nk0Var = kh5.D;
            nq7 y = zbe.y(mwe.x(pna.f(kq7.a, 1.0f), 15), 24.0f);
            long b2 = zl1.b(0.1f, zl1.b);
            eu3 g = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new bo7(2);
                rv4Var.o0(P);
            }
            eu3 a2 = g.a(zt3.t((xt4) P));
            lz3 i12 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new bo7(3);
                rv4Var.o0(P2);
            }
            z87.a(z, xt4Var, a2, i12.a(zt3.x((xt4) P2)), nk0Var, b2, false, false, y, jce.E(101380838, new jp7(q3cVar, xt4Var, xt4Var2, lu4Var, 0), rv4Var), rv4Var, ((i11 >> 3) & Token.ASSIGN_MOD) | (i11 & 14) | 805531008, 192);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new fp7(z, q3cVar, xt4Var, xt4Var2, lu4Var, i, 1);
        }
    }

    public static final void j(boolean z, q3c q3cVar, xt4 xt4Var, xt4 xt4Var2, lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        rv4Var.g0(-689527833);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var.f(q3cVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var.h(xt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(lu4Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((i11 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i11 & 1, z2)) {
            nk0 nk0Var = kh5.e;
            nq7 y = zbe.y(mwe.x(pna.u(kq7.a, nae.e, 600.0f, 1), 15), 24.0f);
            z87.a(z, xt4Var, zkc.a, zkc.b, nk0Var, zl1.b(0.1f, zl1.b), false, false, y, jce.E(1359886277, new jp7(q3cVar, xt4Var, xt4Var2, lu4Var, 1), rv4Var), rv4Var, ((i11 >> 3) & Token.ASSIGN_MOD) | (i11 & 14) | 805527552, 192);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new fp7(z, q3cVar, xt4Var, xt4Var2, lu4Var, i, 2);
        }
    }

    public static final void k(q3c q3cVar, nq7 nq7Var, vt4 vt4Var, xt4 xt4Var, lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        q3c q3cVar2 = q3cVar;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1005692654);
        if (rv4Var2.f(q3cVar2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var2.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var2.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var2.h(xt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (rv4Var2.h(lu4Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((i11 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i11 & 1, z)) {
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            kq7 kq7Var = kq7.a;
            nq7 C = zbe.C(zbe.A(pna.f(kq7Var, 1.0f), 12.0f, nae.e, 2), nae.e, 8.0f, nae.e, nae.e, 13);
            gv9 a3 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, C);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            String A = yqe.A((y3b) o3b.W.getValue(), rv4Var2);
            tza tzaVar = j27.a;
            cvb.c(A, new we6(1.0f, true), ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.h, rv4Var, 0, 0, 131064);
            ar5 c2 = rp5.c((wk3) jk3.w.getValue(), rv4Var, 0);
            long j = ((h27) rv4Var.j(tzaVar)).a.q;
            nq7 n = pna.n(kq7Var, 32.0f);
            su9 su9Var = uu9.a;
            nq7 k = tte.k(n, su9Var);
            if ((i11 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new on7(10, vt4Var);
                rv4Var.o0(P);
            }
            nk5.a(c2, null, zbe.y(lbe.f(15, (vt4) P, k, null, false), 6.0f), j, rv4Var, 48, 0);
            rs8.u(rv4Var, true, kq7Var, 8.0f, rv4Var);
            String str = q3cVar.d;
            String str2 = q3cVar.e;
            String str3 = q3cVar.c;
            Map map = q3cVar.b;
            q3cVar2 = q3cVar;
            n(str, str2, q3cVar.f, q3cVar.g, pna.f(kq7Var, 1.0f), lu4Var, rv4Var, ((i11 << 3) & 458752) | 24576);
            String str4 = q3cVar2.a;
            boolean f2 = rv4Var.f(map) | rv4Var.f(str3) | rv4Var.f(str) | rv4Var.f(str2);
            Object P2 = rv4Var.P();
            if (f2 || P2 == lh9Var) {
                P2 = (String) map.get(str3 + "-" + str + "-" + str2);
                rv4Var.o0(P2);
            }
            o(str4, (String) P2, zbe.y(c16.g(pna.f(kq7Var, 1.0f), null, 3), 12.0f), rv4Var, 0);
            l(q3cVar2.c, q3cVar2.h, zbe.y(nmd.v(tte.k(zbe.y(kq7Var, 12.0f), su9Var), rm1.g(((h27) rv4Var.j(tzaVar)).a, 10.0f), lre.g), 4.0f), xt4Var, rv4Var, i11 & 7168);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new wp0(q3cVar2, nq7Var, vt4Var, xt4Var, lu4Var, i, 22);
        }
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public static final void l(String str, List list, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        Object obj;
        String str2;
        aw7 aw7Var;
        lh9 lh9Var;
        kq7 kq7Var;
        ?? r6;
        String str3;
        int i3;
        int i4;
        boolean h;
        int i5;
        int i6;
        rv4 rv4Var2 = rv4Var;
        u22 u22Var = r0f.d;
        rv4Var2.g0(597993371);
        if ((i & 6) == 0) {
            if (rv4Var2.f(str)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                h = rv4Var2.f(list);
            } else {
                h = rv4Var2.h(list);
            }
            if (h) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i2 & 1, z)) {
            Object P = rv4Var2.P();
            lh9 lh9Var2 = ax1.a;
            if (P == lh9Var2) {
                P = yae.z(Boolean.FALSE);
                rv4Var2.o0(P);
            }
            aw7 aw7Var2 = (aw7) P;
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var2) {
                P2 = new ao7(aw7Var2, 6);
                rv4Var2.o0(P2);
            }
            nq7 t = q1d.t(1, (vt4) P2, rv4Var2, nq7Var, false);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, t);
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
            if ((i2 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i2 & Token.ASSIGN_MOD) != 32 && ((i2 & 64) == 0 || !rv4Var2.f(list))) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolean z4 = z3 | z2;
            Object P3 = rv4Var2.P();
            String str4 = null;
            if (z4 || P3 == lh9Var2) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (c16.i(str, ((tmc) obj).a)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                P3 = (tmc) obj;
                rv4Var2.o0(P3);
            }
            tmc tmcVar = (tmc) P3;
            if (tmcVar != null) {
                str2 = tmcVar.a;
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            boolean equals = str2.equals("qt");
            kq7 kq7Var2 = kq7.a;
            if (equals) {
                rv4Var2.e0(-985301835);
                aw7Var = aw7Var2;
                dxe.i(rp5.a((wk3) ok3.C.getValue(), rv4Var2, 0), null, tte.k(pna.n(kq7Var2, 24.0f), uu9.a), rv4Var2, 24624, 232);
                rv4Var2.q(false);
                kq7Var = kq7Var2;
                r6 = 0;
                lh9Var = lh9Var2;
            } else {
                aw7Var = aw7Var2;
                rv4Var2.e0(-985004731);
                lh9Var = lh9Var2;
                kq7Var = kq7Var2;
                r6 = 0;
                do5.a(new h54(str), u22Var, false, null, null, null, tte.k(pna.n(kq7Var2, 24.0f), uu9.a), null, rv4Var, 805306416, 380);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            }
            xbe.i(rv4Var2, pna.s(kq7Var, 8.0f));
            if (tmcVar != null) {
                str4 = tmcVar.b;
            }
            if (str4 == null) {
                str3 = "";
            } else {
                str3 = str4;
            }
            tza tzaVar = j27.a;
            cvb.c(str3, l0e.u(new we6(1.0f, r6)), ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((h27) rv4Var2.j(tzaVar)).b.j, rv4Var, 0, 24576, 114680);
            xbe.i(rv4Var, pna.s(kq7Var, 4.0f));
            nk5.a(rp5.c((wk3) ok3.t.getValue(), rv4Var, r6), null, pna.n(kq7Var, 16.0f), ((h27) rv4Var.j(tzaVar)).a.q, rv4Var, 432, 0);
            xbe.i(rv4Var, pna.s(kq7Var, 4.0f));
            boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
            nk0 nk0Var = kh5.a;
            Object P4 = rv4Var.P();
            if (P4 == lh9Var) {
                P4 = new ao7(aw7Var, 7);
                rv4Var.o0(P4);
            }
            iue.e(booleanValue, nk0Var, 0L, kq7Var, nae.e, null, (vt4) P4, jce.E(1118827123, new ox0(list, str, xt4Var, aw7Var, 3), rv4Var), rv4Var, 14158896, 52);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new hp7(i, 0, xt4Var, nq7Var, str, list);
        }
    }

    public static final void m(String str, List list, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        String str2;
        Object obj;
        int i3;
        int i4;
        boolean h;
        int i5;
        int i6;
        rv4 rv4Var2 = rv4Var;
        nk0 nk0Var = kh5.a;
        rv4Var2.g0(565651924);
        if ((i & 6) == 0) {
            if (rv4Var2.f(str)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                h = rv4Var2.f(list);
            } else {
                h = rv4Var2.h(list);
            }
            if (h) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i2 & 1, z)) {
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yae.z(Boolean.FALSE);
                rv4Var2.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var) {
                P2 = new ao7(aw7Var, 8);
                rv4Var2.o0(P2);
            }
            nq7 t = q1d.t(1, (vt4) P2, rv4Var2, nq7Var, false);
            b37 d2 = fu0.d(nk0Var, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, t);
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
            pu0 pu0Var = pu0.a;
            nk0 nk0Var2 = kh5.e;
            kq7 kq7Var = kq7.a;
            nq7 a2 = pu0Var.a(kq7Var, nk0Var2);
            int i7 = i2;
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, a2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            if ((i7 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i7 & Token.ASSIGN_MOD) != 32 && ((i7 & 64) == 0 || !rv4Var2.f(list))) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolean z4 = z3 | z2;
            String P3 = rv4Var2.P();
            if (z4 || P3 == lh9Var) {
                Iterator it = list.iterator();
                while (true) {
                    str2 = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (c16.i(str, ((vmc) obj).a)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                vmc vmcVar = (vmc) obj;
                if (vmcVar != null) {
                    str2 = vmcVar.b;
                }
                if (str2 == null) {
                    P3 = "";
                } else {
                    P3 = str2;
                }
                rv4Var2.o0(P3);
            }
            String str3 = (String) P3;
            nq7 m = zj0.m(kq7Var, w06.b);
            gv9 a4 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, m);
            rw1.k.getClass();
            zx1 zx1Var2 = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var2);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a4);
            jce.F(qw1.e, rv4Var2, l3);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode3));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p3);
            rv4Var2.e0(706752799);
            if (str3.length() == 0) {
                str3 = yqe.A((y3b) v1b.j0.getValue(), rv4Var2);
            }
            rv4Var2.q(false);
            tza tzaVar = j27.a;
            cvb.c(str3, l0e.u(new we6(1.0f, true)), ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 1, 0, null, ((h27) rv4Var2.j(tzaVar)).b.k, rv4Var, 0, 24576, 113656);
            xbe.i(rv4Var, pna.s(kq7Var, 4.0f));
            nk5.a(rp5.c((wk3) ok3.t.getValue(), rv4Var, 0), null, pna.n(kq7Var, 16.0f), ((h27) rv4Var.j(tzaVar)).a.q, rv4Var, 432, 0);
            xbe.i(rv4Var, pna.s(kq7Var, 4.0f));
            rv4Var.q(true);
            rv4Var.q(true);
            boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
            Object P4 = rv4Var.P();
            if (P4 == lh9Var) {
                P4 = new ao7(aw7Var, 9);
                rv4Var.o0(P4);
            }
            iue.e(booleanValue, nk0Var, 0L, kq7Var, nae.e, null, (vt4) P4, jce.E(1353441306, new ox0(list, str, xt4Var, aw7Var, 4), rv4Var), rv4Var, 14158896, 52);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new hp7(i, 1, xt4Var, nq7Var, str, list);
        }
    }

    public static final void n(String str, String str2, List list, List list2, nq7 nq7Var, lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        float f2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        boolean h;
        int i5;
        boolean h2;
        int i6;
        int i7;
        int i8;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(479207647);
        if ((i & 6) == 0) {
            if (rv4Var2.f(str)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.f(str2)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                h2 = rv4Var2.f(list);
            } else {
                h2 = rv4Var2.h(list);
            }
            if (h2) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if ((i & 4096) == 0) {
                h = rv4Var2.f(list2);
            } else {
                h = rv4Var2.h(list2);
            }
            if (h) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (rv4Var2.h(lu4Var)) {
                i3 = 131072;
            } else {
                i3 = Parser.ARGC_LIMIT;
            }
            i2 |= i3;
        }
        int i9 = i2;
        if ((i9 & 74899) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i9 & 1, z)) {
            nq7 A = zbe.A(nq7Var, 12.0f, nae.e, 2);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, A);
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
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = 1.0f;
            }
            we6 we6Var = new we6(f2, true);
            su9 su9Var = uu9.a;
            nq7 k = tte.k(we6Var, su9Var);
            tza tzaVar = j27.a;
            long g = rm1.g(((h27) rv4Var2.j(tzaVar)).a, 10.0f);
            ba5 ba5Var = lre.g;
            nq7 A2 = zbe.A(nmd.v(k, g, ba5Var), nae.e, 8.0f, 1);
            int i10 = i9 & 458752;
            if (i10 == 131072) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i9 & Token.ASSIGN_MOD) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = z2 | z3;
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (z5 || P == lh9Var) {
                P = new od7(lu4Var, str2, 2);
                rv4Var2.o0(P);
            }
            int i11 = i9 & 14;
            int i12 = i9 >> 3;
            m(str, list, A2, (xt4) P, rv4Var2, i11 | (i12 & Token.ASSIGN_MOD));
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var2, pna.s(kq7Var, 4.0f));
            boolean z6 = false;
            nk5.a(rp5.c((wk3) jk3.f.getValue(), rv4Var2, 0), null, zbe.A(kq7Var, 6.0f, nae.e, 2), ((h27) rv4Var2.j(tzaVar)).a.q, rv4Var2, 432, 0);
            xbe.i(rv4Var2, pna.s(kq7Var, 4.0f));
            float f3 = 1.0f;
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f3 = Float.MAX_VALUE;
            }
            nq7 A3 = zbe.A(nmd.v(tte.k(new we6(f3, true), su9Var), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 10.0f), ba5Var), nae.e, 8.0f, 1);
            if (i10 == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i11 == 4) {
                z6 = true;
            }
            boolean z7 = z4 | z6;
            Object P2 = rv4Var2.P();
            if (z7 || P2 == lh9Var) {
                P2 = new od7(lu4Var, str, 3);
                rv4Var2.o0(P2);
            }
            rv4Var2 = rv4Var2;
            m(str2, list2, A3, (xt4) P2, rv4Var2, (i12 & 14) | ((i9 >> 6) & Token.ASSIGN_MOD));
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ru1(str, str2, list, list2, nq7Var, lu4Var, i, 5);
        }
    }

    public static final void o(String str, String str2, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        rv4Var.g0(-1915889488);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.f(nq7Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
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
            jce.F(qw1.f, rv4Var, a2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            dye.b(null, jce.E(1752277193, new jd1(str, 24), rv4Var), rv4Var, 48, 1);
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var, pna.h(kq7Var, 12.0f));
            vqe.m(nae.e, 0, 7, 0L, rv4Var, null);
            xbe.i(rv4Var, pna.h(kq7Var, 12.0f));
            if (str2 == null) {
                rv4Var.e0(-704542606);
                dpe.g(pna.h(pna.f(kq7Var, 1.0f), 20.0f), null, rv4Var, 6, 2);
                dpe.g(pna.h(hl5.f(kq7Var, 4.0f, rv4Var, kq7Var, 0.4f), 20.0f), null, rv4Var, 6, 2);
                rv4Var.q(false);
                z2 = true;
            } else {
                rv4Var.e0(-704208271);
                z2 = true;
                dye.b(null, jce.E(-1479917971, new jd1(str2, 25), rv4Var), rv4Var, 48, 1);
                rv4Var.q(false);
            }
            rv4Var.q(z2);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new gp7(str, str2, nq7Var, i, 0);
        }
    }

    public static final int p(int[] iArr, int i, int i2) {
        iArr.getClass();
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 > i2) {
                i3 = i5 - 1;
            } else {
                return i5;
            }
        }
        return ~i4;
    }

    public static final int q(long[] jArr, int i, long j) {
        jArr.getClass();
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = (jArr[i4] > j ? 1 : (jArr[i4] == j ? 0 : -1));
            if (i5 < 0) {
                i3 = i4 + 1;
            } else if (i5 > 0) {
                i2 = i4 - 1;
            } else {
                return i4;
            }
        }
        return ~i3;
    }

    public static final String r(ok0 ok0Var) {
        ok0Var.getClass();
        if (ok0Var.equals(hq7.a)) {
            return "TopStart";
        }
        if (ok0Var.equals(hq7.b)) {
            return "TopCenter";
        }
        if (ok0Var.equals(hq7.c)) {
            return "TopEnd";
        }
        if (ok0Var.equals(hq7.d)) {
            return "CenterStart";
        }
        if (ok0Var.equals(hq7.e)) {
            return "Center";
        }
        if (ok0Var.equals(hq7.f)) {
            return "CenterEnd";
        }
        if (ok0Var.equals(hq7.C)) {
            return "BottomStart";
        }
        if (ok0Var.equals(hq7.D)) {
            return "BottomCenter";
        }
        if (ok0Var.equals(hq7.E)) {
            return "BottomEnd";
        }
        return "Unknown AlignmentCompat: " + ok0Var;
    }

    public static final boolean s(ok0 ok0Var) {
        if (!ok0Var.equals(hq7.C) && !ok0Var.equals(hq7.D) && !ok0Var.equals(hq7.E)) {
            return false;
        }
        return true;
    }

    public static final boolean t(ok0 ok0Var) {
        if (!ok0Var.equals(hq7.c) && !ok0Var.equals(hq7.f) && !ok0Var.equals(hq7.E)) {
            return false;
        }
        return true;
    }

    public static boolean u(byte b2) {
        if (b2 > -65) {
            return true;
        }
        return false;
    }

    public static final boolean v(ok0 ok0Var) {
        if (!ok0Var.equals(hq7.a) && !ok0Var.equals(hq7.d) && !ok0Var.equals(hq7.C)) {
            return false;
        }
        return true;
    }

    public static final boolean w(ok0 ok0Var) {
        if (!ok0Var.equals(hq7.a) && !ok0Var.equals(hq7.b) && !ok0Var.equals(hq7.c)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, xw9, ye6] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, ye6, rwc] */
    public static ye6 x(sk6 sk6Var, vt4 vt4Var) {
        p40 p40Var = p40.J;
        int ordinal = sk6Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    ?? obj = new Object();
                    obj.a = vt4Var;
                    obj.b = p40Var;
                    return obj;
                }
                xk5.o();
                return null;
            }
            ?? obj2 = new Object();
            obj2.a = vt4Var;
            obj2.b = p40Var;
            return obj2;
        }
        return new mfb(vt4Var);
    }

    public static mfb y(vt4 vt4Var) {
        vt4Var.getClass();
        return new mfb(vt4Var);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, r71] */
    public static e81 z() {
        return new e81(fpe.r(), new f81(new oyb(0L, zr1.q(16), null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777213), new oyb(0L, zr1.q(32), null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777213), new oyb(0L, zr1.q(28), null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777213), new oyb(0L, zr1.q(24), null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777213), new oyb(0L, zr1.q(20), null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777213), new oyb(0L, zr1.q(18), null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777213), new oyb(0L, zr1.q(16), null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777213), new oyb(0L, zr1.q(14), null, null, eo4.d, 0L, 0L, 0, 0, 0L, null, null, 16777181), new oyb(0L, zr1.q(12), null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777213), new oyb(0L, zr1.q(14), null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777213), new oyb(0L, zr1.q(16), dq4.f, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777209)), new Object());
    }
}
