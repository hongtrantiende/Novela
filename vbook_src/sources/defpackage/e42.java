package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e42  reason: default package */
/* loaded from: classes.dex */
public abstract class e42 {
    public static final n32 a;

    static {
        ly1 ly1Var = tk.a;
        long j = zl1.e;
        long j2 = zl1.b;
        a = new n32(j, j2, j2, zl1.b(0.38f, j2), zl1.b(0.38f, j2));
    }

    public static final void a(n32 n32Var, nq7 nq7Var, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        rv4Var.g0(-527864079);
        if ((i & 6) == 0) {
            if (rv4Var.f(n32Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
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
        if ((i2 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            mk0 mk0Var = b42.a;
            nq7 C = rte.C(zbe.A(zj0.m(nmd.v(st0.s(nq7Var, 3.0f, uu9.a(4.0f), 28), n32Var.a, lre.g), w06.b), nae.e, b42.d, 1), rte.u(rv4Var), 14);
            int i6 = (i2 << 3) & 7168;
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, C);
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
            tu1Var.c(zn1.a, rv4Var, Integer.valueOf(((i6 >> 6) & Token.ASSIGN_MOD) | 6));
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new va((Object) n32Var, nq7Var, (hu4) tu1Var, i, 10);
        }
    }

    public static final void b(nq7 nq7Var, n32 n32Var, xt4 xt4Var, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        rv4Var.g0(-625529233);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i4 = i | 6;
        } else {
            if (rv4Var.f(nq7Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i4 = i3 | i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i6 = i4 | 48;
        } else {
            if (rv4Var.f(n32Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i6 = i4 | i5;
        }
        if (rv4Var.h(xt4Var)) {
            i7 = 256;
        } else {
            i7 = Token.CASE;
        }
        int i10 = i6 | i7;
        if ((i10 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i10 & 1, z)) {
            if (i8 != 0) {
                nq7Var = kq7.a;
            }
            if (i9 != 0) {
                n32Var = a;
            }
            a(n32Var, nq7Var, jce.E(-250345048, new t81(16, xt4Var, n32Var), rv4Var), rv4Var, ((i10 << 3) & Token.ASSIGN_MOD) | ((i10 >> 3) & 14) | 384);
        } else {
            rv4Var.X();
        }
        nq7 nq7Var2 = nq7Var;
        n32 n32Var2 = n32Var;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new va(nq7Var2, n32Var2, xt4Var, i, i2);
        }
    }

    public static final void c(String str, boolean z, n32 n32Var, nq7 nq7Var, mu4 mu4Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        long j;
        long j2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        rv4Var.g0(-2001167027);
        if ((i & 6) == 0) {
            if (rv4Var.f(str)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.g(z)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(n32Var)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(nq7Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(mu4Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(vt4Var)) {
                i4 = 131072;
            } else {
                i4 = Parser.ARGC_LIMIT;
            }
            i2 |= i4;
        }
        if ((74899 & i2) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            mk0 mk0Var = b42.a;
            float f = b42.c;
            hz hzVar = new hz(f, true, new vs(2));
            if ((i2 & Token.ASSIGN_MOD) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((458752 & i2) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z5 = z3 | z4;
            Object P = rv4Var.P();
            if (z5 || P == ax1.a) {
                P = new d42(0, vt4Var, z);
                rv4Var.o0(P);
            }
            nq7 A = zbe.A(pna.q(pna.f(lbe.f(12, (vt4) P, nq7Var, str, z), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f), f, nae.e, 2);
            gv9 a2 = ev9.a(hzVar, mk0Var, rv4Var, 54);
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
            if (mu4Var == null) {
                rv4Var.e0(-1597947094);
                rv4Var.q(false);
                i3 = i2;
            } else {
                rv4Var.e0(-1597947093);
                float f2 = b42.e;
                nq7 m = pna.m(kq7.a, f2, nae.e, f2, f2, 2);
                b37 d = fu0.d(kh5.a, false);
                int hashCode2 = Long.hashCode(rv4Var.T);
                xt8 l2 = rv4Var.l();
                nq7 p2 = lye.p(rv4Var, m);
                rv4Var.i0();
                i3 = i2;
                if (rv4Var.S) {
                    rv4Var.k(zx1Var);
                } else {
                    rv4Var.r0();
                }
                jce.F(npVar, rv4Var, d);
                jce.F(npVar2, rv4Var, l2);
                s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
                jce.F(npVar4, rv4Var, p2);
                if (z) {
                    j = n32Var.c;
                } else {
                    j = n32Var.e;
                }
                mu4Var.c(new zl1(j), rv4Var, 0);
                rv4Var.q(true);
                rv4Var.q(false);
            }
            if (z) {
                j2 = n32Var.b;
            } else {
                j2 = n32Var.d;
            }
            long j3 = j2;
            qye.b(str, new we6(1.0f, true), new oyb(j3, b42.h, b42.i, null, null, b42.k, 0L, b42.b, 0, b42.j, null, null, 16613240), null, 0, false, 1, 0, null, rv4Var, (i3 & 14) | 1572864, 952);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sg1(str, z, n32Var, nq7Var, mu4Var, vt4Var, i);
        }
    }
}
