package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ki8  reason: default package */
/* loaded from: classes.dex */
public abstract class ki8 {
    public static final ly1 a = new ly1(new sc8(10));
    public static final ly1 b = new ly1(new sc8(11));
    public static final ly1 c = new ly1(new sc8(12));
    public static final im1 d = new im1(new float[]{-1.0f, nae.e, nae.e, nae.e, 255.0f, nae.e, -1.0f, nae.e, nae.e, 255.0f, nae.e, nae.e, -1.0f, nae.e, 255.0f, nae.e, nae.e, nae.e, 1.0f, nae.e});
    public static final im1 e = new im1(new float[]{0.393f, 0.769f, 0.189f, nae.e, nae.e, 0.349f, 0.686f, 0.168f, nae.e, nae.e, 0.272f, 0.534f, 0.131f, nae.e, nae.e, nae.e, nae.e, nae.e, 1.0f, nae.e});
    public static final tza f = new f99(new sc8(13));

    public static final void a(xh8 xh8Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        rv4Var.g0(957723704);
        if ((i & 6) == 0) {
            if (rv4Var.f(xh8Var)) {
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
        boolean z3 = false;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            int i5 = i2 & 14;
            if (i5 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z2 || P == obj) {
                P = xh8Var.f.r;
                rv4Var.o0(P);
            }
            aza azaVar = (aza) P;
            if (i5 == 4) {
                z3 = true;
            }
            Object P2 = rv4Var.P();
            if (z3 || P2 == obj) {
                P2 = xh8Var.e;
                rv4Var.o0(P2);
            }
            aw7 z4 = jsc.z(azaVar, rv4Var);
            aw7 z5 = jsc.z((aza) P2, rv4Var);
            em1 em1Var = (em1) rv4Var.j(c);
            boolean booleanValue = ((Boolean) rv4Var.j(b)).booleanValue();
            boolean f2 = rv4Var.f(z4) | rv4Var.f(z5) | rv4Var.f(em1Var) | rv4Var.g(booleanValue);
            Object P3 = rv4Var.P();
            if (f2 || P3 == obj) {
                Object ji8Var = new ji8(em1Var, booleanValue, z4, z5, 1);
                rv4Var.o0(ji8Var);
                P3 = ji8Var;
            }
            bce.a(nq7Var, (xt4) P3, rv4Var, (i2 >> 3) & 14);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ii8(xh8Var, nq7Var, i, 2);
        }
    }

    public static final void b(xh8 xh8Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        rv4Var.g0(-818058145);
        if ((i & 6) == 0) {
            if (rv4Var.f(xh8Var)) {
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
            int i5 = i2 & Token.ELSE;
            a(xh8Var, nq7Var, rv4Var, i5);
            d(xh8Var, nq7Var, rv4Var, i5);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ii8(xh8Var, nq7Var, i, 0);
        }
    }

    public static final void c(xh8 xh8Var, nq7 nq7Var, nu4 nu4Var, rv4 rv4Var, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        int i5;
        int i6;
        boolean z;
        nq7 nq7Var2;
        nq7 nq7Var3;
        long j;
        rv4Var.g0(1748247881);
        if (rv4Var.f(xh8Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i | i3;
        int i8 = i2 & 2;
        if (i8 != 0) {
            i5 = i7 | 48;
            obj = nq7Var;
        } else {
            obj = nq7Var;
            if (rv4Var.f(obj)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i5 = i7 | i4;
        }
        if (rv4Var.h(nu4Var)) {
            i6 = 256;
        } else {
            i6 = Token.CASE;
        }
        int i9 = i5 | i6;
        if ((i9 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i9 & 1, z)) {
            if (i8 != 0) {
                nq7Var3 = kq7.a;
            } else {
                nq7Var3 = obj;
            }
            zh8 zh8Var = (zh8) rv4Var.j(a);
            aw7 z2 = jsc.z(xh8Var.f.t, rv4Var);
            aw7 z3 = jsc.z(xh8Var.e, rv4Var);
            zn9 zn9Var = (zn9) z2.getValue();
            zn9Var.getClass();
            zn9 zn9Var2 = zn9.a;
            if (zn9Var == zn9Var2 || zh8Var.c) {
                j = zh8Var.a;
            } else {
                j = zl1.h;
            }
            nq7 o = bze.o(nmd.v(nq7Var3, j, lre.g), Integer.valueOf(xh8Var.b));
            boolean f2 = rv4Var.f(z3);
            Object P = rv4Var.P();
            if (f2 || P == ax1.a) {
                P = new eq6(z3, 1);
                rv4Var.o0(P);
            }
            b37 b37Var = (b37) P;
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, o);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var, b37Var);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var, p);
            ze4 ze4Var = pna.c;
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 nq7Var4 = nq7Var3;
            nq7 p2 = lye.p(rv4Var, ze4Var);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, d2);
            jce.F(npVar2, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p2);
            zn9 zn9Var3 = (zn9) z2.getValue();
            zn9Var3.getClass();
            if (zn9Var3 == zn9Var2) {
                rv4Var.e0(-673164650);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-673305514);
                b(xh8Var, ze4Var, rv4Var, (i9 & 14) | 48);
                rv4Var.q(false);
            }
            nu4Var.h(pu0.a, xh8Var, rv4Var, Integer.valueOf((i9 & 896) | ((i9 << 3) & Token.ASSIGN_MOD) | 6));
            rv4Var.q(true);
            rv4Var.q(true);
            nq7Var2 = nq7Var4;
        } else {
            rv4Var.X();
            nq7Var2 = obj;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new va(xh8Var, nq7Var2, nu4Var, i, i2);
        }
    }

    public static final void d(xh8 xh8Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        rv4Var.g0(-693285080);
        if ((i & 6) == 0) {
            if (rv4Var.f(xh8Var)) {
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
        boolean z3 = false;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            int i5 = i2 & 14;
            if (i5 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z2 || P == obj) {
                P = xh8Var.f.s;
                rv4Var.o0(P);
            }
            aza azaVar = (aza) P;
            if (i5 == 4) {
                z3 = true;
            }
            Object P2 = rv4Var.P();
            if (z3 || P2 == obj) {
                P2 = xh8Var.e;
                rv4Var.o0(P2);
            }
            aw7 z4 = jsc.z(azaVar, rv4Var);
            aw7 z5 = jsc.z((aza) P2, rv4Var);
            em1 em1Var = (em1) rv4Var.j(c);
            boolean booleanValue = ((Boolean) rv4Var.j(b)).booleanValue();
            boolean f2 = rv4Var.f(z4) | rv4Var.f(em1Var) | rv4Var.g(booleanValue) | rv4Var.f(z5);
            Object P3 = rv4Var.P();
            if (f2 || P3 == obj) {
                Object ji8Var = new ji8(em1Var, booleanValue, z4, z5, 0);
                rv4Var.o0(ji8Var);
                P3 = ji8Var;
            }
            bce.a(nq7Var, (xt4) P3, rv4Var, (i2 >> 3) & 14);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ii8(xh8Var, nq7Var, i, 1);
        }
    }

    public static final void e(ak3 ak3Var, pi8 pi8Var, long j, em1 em1Var) {
        float f2;
        float f3;
        int i;
        int i2;
        long j2 = pi8Var.d;
        long j3 = pi8Var.c;
        int i3 = (int) (j2 >> 32);
        if (i3 > 0 && (i = (int) (j2 & 4294967295L)) > 0 && (i3 != (i2 = (int) (j >> 32)) || i != ((int) (j & 4294967295L)))) {
            f2 = i2 / i3;
            f3 = ((int) (j & 4294967295L)) / i;
        } else {
            f2 = 1.0f;
            f3 = 1.0f;
        }
        long j4 = pi8Var.b;
        float f4 = ((int) (j4 >> 32)) * f2;
        float f5 = ((int) (j4 & 4294967295L)) * f3;
        if (f2 != 1.0f || f3 != 1.0f) {
            int i4 = (int) (((int) (j3 >> 32)) * f2);
            int i5 = 1;
            if (i4 < 1) {
                i4 = 1;
            }
            int i6 = (int) (((int) (j3 & 4294967295L)) * f3);
            if (i6 >= 1) {
                i5 = i6;
            }
            j3 = (i4 << 32) | (i5 & 4294967295L);
        }
        long j5 = j3;
        ((mu9) ak3Var.Q0().b).D(f4, f5);
        try {
            ak3.g1(ak3Var, pi8Var.a, 0L, 0L, j5, nae.e, em1Var, 0, 878);
        } finally {
            ((mu9) ak3Var.Q0().b).D(-f4, -f5);
        }
    }
}
