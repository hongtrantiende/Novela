package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l08  reason: default package */
/* loaded from: classes.dex */
public abstract class l08 {
    public static final float a = pae.k;
    public static final float b = 56.0f;
    public static final float c = 4.0f;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final ly1 g;

    static {
        float f2 = nae.e;
        float f3 = (56.0f - f2) / 2.0f;
        d = f3;
        e = (32.0f - f2) / 2.0f;
        f = f3;
        g = new ly1(new rh7(24));
    }

    public static final void a(nq7 nq7Var, long j, long j2, qid qidVar, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        rv4Var.g0(331386280);
        if (rv4Var.f(nq7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.e(j2)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i6 = i5 | i3 | 3072;
        if (rv4Var.f(qidVar)) {
            i4 = 16384;
        } else {
            i4 = 8192;
        }
        int i7 = i6 | i4;
        if ((74899 & i7) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
            }
            rv4Var.r();
            ((tv2) rv4Var.j(g)).a(new m08(nq7Var, j, j2, qidVar, tu1Var), rv4Var, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new rb(nq7Var, j, j2, qidVar, tu1Var, i);
        }
    }

    public static final void b(boolean z, vt4 vt4Var, tu1 tu1Var, nq7 nq7Var, boolean z2, boolean z3, k08 k08Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z4;
        rv4 rv4Var2;
        nq7 nq7Var2;
        boolean z5;
        boolean z6;
        k08 k08Var2;
        k08 k08Var3;
        boolean z7;
        boolean z8;
        k08 k08Var4;
        kq7 kq7Var;
        float f2;
        float f3;
        rv4Var.g0(-1620317701);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var.h(vt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3 | 106654720;
        if ((38347923 & i5) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (rv4Var.U(i5 & 1, z4)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                kq7Var = nq7Var;
                z7 = z2;
                z8 = z3;
                k08Var4 = k08Var;
            } else {
                pm1 pm1Var = ((h27) rv4Var.j(j27.a)).a;
                k08 k08Var5 = pm1Var.f0;
                if (k08Var5 == null) {
                    long d2 = rm1.d(pm1Var, rae.p);
                    long d3 = rm1.d(pm1Var, rae.r);
                    long d4 = rm1.d(pm1Var, rae.q);
                    qm1 qm1Var = rae.s;
                    long d5 = rm1.d(pm1Var, qm1Var);
                    qm1 qm1Var2 = rae.t;
                    k08Var3 = new k08(d2, d3, d4, d5, rm1.d(pm1Var, qm1Var2), zl1.b(0.38f, rm1.d(pm1Var, qm1Var)), zl1.b(0.38f, rm1.d(pm1Var, qm1Var2)));
                    pm1Var.f0 = k08Var3;
                } else {
                    k08Var3 = k08Var5;
                }
                z7 = true;
                z8 = true;
                k08Var4 = k08Var3;
                kq7Var = kq7.a;
            }
            rv4Var.r();
            rv4Var.e0(253276704);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = s21.g(rv4Var);
            }
            yu7 yu7Var = (yu7) P;
            rv4Var.q(false);
            ur7 ur7Var = ur7.c;
            boolean z9 = z8;
            tu1 E = jce.E(206057749, new ii7(k08Var4, z, z7, kqe.y(ur7Var, rv4Var), z9, tu1Var), rv4Var);
            rv4Var.e0(254203944);
            rv4Var.q(false);
            boolean z10 = z7;
            nq7 nq7Var3 = kq7Var;
            k08 k08Var6 = k08Var4;
            nq7 u = pna.u(pna.b(vte.q(nq7Var3, z, yu7Var, null, z10, new xt9(4), vt4Var), nae.e, b, 1), a, nae.e, 2);
            b37 d6 = fu0.d(kh5.e, true);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, u);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d6);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            yya b2 = nq.b(f2, kqe.y(ur7Var, rv4Var), null, rv4Var, 0, 28);
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            yya b3 = nq.b(f3, kqe.y(ur7.b, rv4Var), null, rv4Var, 0, 28);
            r13 r13Var = (r13) rv4Var.j(dy1.h);
            boolean f4 = rv4Var.f(r13Var);
            Object P2 = rv4Var.P();
            if (f4 || P2 == lh9Var) {
                P2 = new od(r13Var, 1);
                rv4Var.o0(P2);
            }
            vt4 vt4Var2 = (vt4) P2;
            boolean f5 = rv4Var.f(yu7Var) | rv4Var.f(vt4Var2);
            Object P3 = rv4Var.P();
            if (f5 || P3 == lh9Var) {
                P3 = new l17(yu7Var, vt4Var2);
                rv4Var.o0(P3);
            }
            rv4Var.e0(-1825440690);
            wea a2 = pfa.a(afa.c, rv4Var);
            rv4Var.q(false);
            tu1 E2 = jce.E(455696046, new sv4(29, a2, (l17) P3), rv4Var);
            tu1 E3 = jce.E(2137606782, new vg7(7, b2, k08Var6, a2), rv4Var);
            boolean f6 = rv4Var.f(b2);
            Object P4 = rv4Var.P();
            if (f6 || P4 == lh9Var) {
                P4 = new xk6(b2, 6);
                rv4Var.o0(P4);
            }
            vt4 vt4Var3 = (vt4) P4;
            boolean f7 = rv4Var.f(b3);
            Object P5 = rv4Var.P();
            if (f7 || P5 == lh9Var) {
                P5 = new xk6(b3, 7);
                rv4Var.o0(P5);
            }
            c(E2, E3, E, null, z9, vt4Var3, (vt4) P5, rv4Var, 25014);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            z6 = z9;
            z5 = z10;
            nq7Var2 = nq7Var3;
            k08Var2 = k08Var6;
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
            nq7Var2 = nq7Var;
            z5 = z2;
            z6 = z3;
            k08Var2 = k08Var;
        }
        ek9 u2 = rv4Var2.u();
        if (u2 != null) {
            u2.d = new uj7(z, vt4Var, tu1Var, nq7Var2, z5, z6, k08Var2, i);
        }
    }

    public static final void c(tu1 tu1Var, tu1 tu1Var2, tu1 tu1Var3, lu4 lu4Var, boolean z, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        lu4 lu4Var2 = lu4Var;
        vt4 vt4Var3 = vt4Var;
        rv4Var.g0(-759267492);
        if ((i & 6) == 0) {
            if (rv4Var.h(tu1Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(tu1Var2)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(tu1Var3)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(lu4Var2)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.g(z)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(vt4Var3)) {
                i4 = 131072;
            } else {
                i4 = Parser.ARGC_LIMIT;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.h(vt4Var2)) {
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
            wu1 wu1Var = new wu1(27);
            kq7 kq7Var = kq7.a;
            nq7 f2 = sze.f(kq7Var, wu1Var);
            if ((i2 & 3670016) == 1048576) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i2 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z10 = z5 | z4;
            int i10 = 57344 & i2;
            if (i10 == 16384) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z11 = z10 | z6;
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z11 || P == lh9Var) {
                P = new uz7(vt4Var2, lu4Var2, z, 1);
                rv4Var.o0(P);
            }
            b37 b37Var = (b37) P;
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, f2);
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
            int i11 = i2;
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var, p);
            tu1Var.invoke(rv4Var, Integer.valueOf(i11 & 14));
            tu1Var2.invoke(rv4Var, Integer.valueOf((i11 >> 3) & 14));
            nq7 o = bze.o(kq7Var, "icon");
            nk0 nk0Var = kh5.a;
            b37 d2 = fu0.d(nk0Var, false);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, o);
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
            tu1Var3.invoke(rv4Var, Integer.valueOf((i11 >> 6) & 14));
            rv4Var.q(true);
            if (lu4Var != null) {
                rv4Var.e0(773116085);
                nq7 o2 = bze.o(kq7Var, "label");
                if (i10 == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if ((i11 & 458752) == 131072) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z12 = z8 | z9;
                Object P2 = rv4Var.P();
                if (!z12 && P2 != lh9Var) {
                    z3 = z;
                    vt4Var3 = vt4Var;
                } else {
                    z3 = z;
                    vt4Var3 = vt4Var;
                    P2 = new pz7(1, vt4Var3, z3);
                    rv4Var.o0(P2);
                }
                nq7 k = axe.k(o2, (xt4) P2);
                b37 d3 = fu0.d(nk0Var, false);
                int hashCode3 = Long.hashCode(rv4Var.T);
                xt8 l3 = rv4Var.l();
                nq7 p3 = lye.p(rv4Var, k);
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(zx1Var);
                } else {
                    rv4Var.r0();
                }
                jce.F(npVar, rv4Var, d3);
                jce.F(npVar2, rv4Var, l3);
                s21.t(hashCode3, rv4Var, npVar3, rv4Var, kgVar);
                jce.F(npVar4, rv4Var, p3);
                lu4Var2 = lu4Var;
                z7 = true;
                hl5.u((i11 >> 9) & 14, lu4Var2, rv4Var, true, false);
            } else {
                lu4Var2 = lu4Var;
                z3 = z;
                vt4Var3 = vt4Var;
                z7 = true;
                rv4Var.e0(773387087);
                rv4Var.q(false);
            }
            rv4Var.q(z7);
        } else {
            z3 = z;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qz7(tu1Var, tu1Var2, tu1Var3, lu4Var2, z3, vt4Var3, vt4Var2, i, 1);
        }
    }
}
