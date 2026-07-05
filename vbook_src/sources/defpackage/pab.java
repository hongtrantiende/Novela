package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pab  reason: default package */
/* loaded from: classes.dex */
public abstract class pab {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final yqa f;

    static {
        float f2 = xwe.r;
        a = f2;
        b = xwe.B;
        c = xwe.y;
        float f3 = xwe.v;
        d = f3;
        e = (f3 - f2) / 2.0f;
        f = new yqa(0);
    }

    public static final void a(boolean z, xt4 xt4Var, nq7 nq7Var, lu4 lu4Var, kab kabVar, rv4 rv4Var, int i) {
        int i2;
        kab kabVar2;
        int i3;
        kab kabVar3;
        int i4;
        kab kabVar4;
        nq7 nq7Var2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        rv4Var.g0(-263339167);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(xt4Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(lu4Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        boolean z2 = true;
        if ((i & 24576) == 0) {
            if (rv4Var.g(true)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            i2 |= Parser.ARGC_LIMIT;
        }
        int i10 = i2 | 1572864;
        if ((599187 & i10) == 599186) {
            z2 = false;
        }
        if (rv4Var.U(i10 & 1, z2)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                i4 = i10 & (-458753);
                kabVar4 = kabVar;
            } else {
                pm1 pm1Var = ((h27) rv4Var.j(j27.a)).a;
                kab kabVar5 = pm1Var.i0;
                long j = pm1Var.p;
                if (kabVar5 == null) {
                    long d2 = rm1.d(pm1Var, xwe.q);
                    long d3 = rm1.d(pm1Var, xwe.t);
                    long j2 = zl1.h;
                    long d4 = rm1.d(pm1Var, xwe.s);
                    long d5 = rm1.d(pm1Var, xwe.A);
                    long d6 = rm1.d(pm1Var, xwe.D);
                    long d7 = rm1.d(pm1Var, xwe.z);
                    long d8 = rm1.d(pm1Var, xwe.C);
                    long l = sve.l(zl1.b(xwe.d, rm1.d(pm1Var, xwe.c)), j);
                    long d9 = rm1.d(pm1Var, xwe.g);
                    float f2 = xwe.h;
                    i3 = -458753;
                    kabVar3 = new kab(d2, d3, j2, d4, d5, d6, d7, d8, l, sve.l(zl1.b(f2, d9), j), j2, sve.l(zl1.b(xwe.f, rm1.d(pm1Var, xwe.e)), j), sve.l(zl1.b(xwe.j, rm1.d(pm1Var, xwe.i)), j), sve.l(zl1.b(f2, rm1.d(pm1Var, xwe.m)), j), sve.l(zl1.b(f2, rm1.d(pm1Var, xwe.n)), j), sve.l(zl1.b(xwe.l, rm1.d(pm1Var, xwe.k)), j));
                    pm1Var.i0 = kabVar3;
                } else {
                    i3 = -458753;
                    kabVar3 = kabVar5;
                }
                i4 = i10 & i3;
                kabVar4 = kabVar3;
            }
            rv4Var.r();
            rv4Var.e0(1768510810);
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = s21.g(rv4Var);
            }
            yu7 yu7Var = (yu7) P;
            rv4Var.q(false);
            if (xt4Var != null) {
                n95 n95Var = jz5.a;
                nq7Var2 = h9a.Y(z, yu7Var, new xt9(2), xt4Var);
            } else {
                nq7Var2 = kq7.a;
            }
            int i11 = i4 << 3;
            b(pna.l(pna.w(nq7Var.a0(nq7Var2), kh5.e, false), c, d), z, kabVar4, lu4Var, yu7Var, pfa.a(xwe.o, rv4Var), rv4Var, (i11 & 57344) | ((i4 >> 6) & 896) | (i11 & Token.ASSIGN_MOD));
            kabVar2 = kabVar4;
        } else {
            rv4Var.X();
            kabVar2 = kabVar;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new a83(z, xt4Var, nq7Var, lu4Var, kabVar2, i);
        }
    }

    public static final void b(nq7 nq7Var, boolean z, kab kabVar, lu4 lu4Var, gz5 gz5Var, wea weaVar, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        long j;
        long j2;
        long j3;
        long j4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        kab kabVar2 = kabVar;
        lu4 lu4Var2 = lu4Var;
        rv4Var.g0(-670917213);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
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
            if (rv4Var.g(true)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(kabVar2)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(lu4Var2)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.f(gz5Var)) {
                i4 = 131072;
            } else {
                i4 = Parser.ARGC_LIMIT;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.f(weaVar)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        if ((599187 & i2) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            if (z) {
                j = kabVar2.b;
            } else {
                j = kabVar2.f;
            }
            if (z) {
                j2 = kabVar2.a;
            } else {
                j2 = kabVar2.e;
            }
            wea a2 = pfa.a(xwe.x, rv4Var);
            ly1 ly1Var = jt9.a;
            vt9 vt9Var = ((wt9) rv4Var.j(ly1Var)).a;
            float f2 = xwe.w;
            int i10 = i2;
            if (z) {
                j3 = kabVar2.c;
            } else {
                j3 = kabVar2.g;
            }
            nq7 v = nmd.v(st0.d(nq7Var, f2, j3, a2), j, a2);
            kq7 kq7Var = kq7.a;
            nq7 a0 = v.a0(kq7Var);
            b37 d2 = fu0.d(kh5.a, false);
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
            jce.F(npVar, rv4Var, d2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var, p);
            nq7 a02 = pu0.a.a(kq7Var, kh5.d).a0(new m7c(gz5Var, z, kqe.y(ur7.b, rv4Var)));
            vt9 vt9Var2 = ((wt9) rv4Var.j(ly1Var)).a;
            nq7 v2 = nmd.v(fu5.a(a02, gz5Var, jt9.a(xwe.u / 2.0f, 0L, null, 220)), j2, weaVar);
            b37 d3 = fu0.d(kh5.e, false);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, v2);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, d3);
            jce.F(npVar2, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p2);
            if (lu4Var != null) {
                rv4Var.e0(1235836927);
                kabVar2 = kabVar;
                if (z) {
                    j4 = kabVar2.d;
                } else {
                    j4 = kabVar2.h;
                }
                lu4Var2 = lu4Var;
                pye.a(r12.a.a(new zl1(j4)), lu4Var2, rv4Var, ((i10 >> 9) & Token.ASSIGN_MOD) | 8);
                rv4Var.q(false);
            } else {
                kabVar2 = kabVar;
                lu4Var2 = lu4Var;
                rv4Var.e0(1236071411);
                rv4Var.q(false);
            }
            rv4Var.q(true);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sg1(nq7Var, z, kabVar2, lu4Var2, gz5Var, weaVar, i);
        }
    }
}
