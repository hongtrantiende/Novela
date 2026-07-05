package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vz7  reason: default package */
/* loaded from: classes.dex */
public abstract class vz7 {
    public static final float a = gae.E;
    public static final float b = 8.0f;
    public static final float c = 4.0f;
    public static final float d = 16.0f;
    public static final float e = 4.0f;
    public static final float f = 12.0f;
    public static final float g = 44.0f;
    public static final ly1 h = new ly1(new rh7(23));

    public static final void a(final nq7 nq7Var, final long j, long j2, final float f2, final qid qidVar, final tu1 tu1Var, rv4 rv4Var, final int i) {
        int i2;
        boolean z;
        final long j3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        rv4Var.g0(1054099326);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.e(j)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            i2 |= Token.CASE;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.c(f2)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(qidVar)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(tu1Var)) {
                i3 = 131072;
            } else {
                i3 = Parser.ARGC_LIMIT;
            }
            i2 |= i3;
        }
        if ((74899 & i2) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                j3 = j2;
            } else {
                j3 = rm1.a(((h27) rv4Var.j(j27.a)).a, j);
            }
            rv4Var.r();
            ((sv2) rv4Var.j(h)).a(new wz7(nq7Var, j, j3, f2, qidVar, tu1Var), rv4Var, 0);
        } else {
            rv4Var.X();
            j3 = j2;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: tz7
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vz7.a(nq7.this, j, j3, f2, qidVar, tu1Var, (rv4) obj, xoe.p(i | 1));
                    return pvc.a;
                }
            };
        }
    }

    public static final void b(hv9 hv9Var, boolean z, vt4 vt4Var, tu1 tu1Var, nq7 nq7Var, lu4 lu4Var, boolean z2, oz7 oz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z3;
        rv4 rv4Var2;
        nq7 nq7Var2;
        boolean z4;
        oz7 oz7Var2;
        int i3;
        int i4;
        kq7 kq7Var;
        oz7 oz7Var3;
        boolean z5;
        tu1 E;
        float f2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        rv4Var.g0(974293026);
        if ((i & 6) == 0) {
            if (rv4Var.f(hv9Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.g(z)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(vt4Var)) {
                i8 = 256;
            } else {
                i8 = Token.CASE;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(tu1Var)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        int i11 = i2 | 24576;
        if ((196608 & i) == 0) {
            if (rv4Var.g(true)) {
                i6 = 131072;
            } else {
                i6 = Parser.ARGC_LIMIT;
            }
            i11 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.h(lu4Var)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i11 |= i5;
        }
        int i12 = 12582912 | i11;
        if ((100663296 & i) == 0) {
            i12 = 46137344 | i11;
        }
        int i13 = 805306368 | i12;
        if ((306783379 & i13) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i13 & 1, z3)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                kq7Var = nq7Var;
                z5 = z2;
                i4 = i13 & (-234881025);
                oz7Var3 = oz7Var;
            } else {
                pm1 pm1Var = ((h27) rv4Var.j(j27.a)).a;
                oz7 oz7Var4 = pm1Var.e0;
                if (oz7Var4 == null) {
                    long d2 = rm1.d(pm1Var, gae.c);
                    long d3 = rm1.d(pm1Var, gae.f);
                    long d4 = rm1.d(pm1Var, gae.d);
                    qm1 qm1Var = gae.C;
                    long d5 = rm1.d(pm1Var, qm1Var);
                    i3 = -234881025;
                    qm1 qm1Var2 = gae.D;
                    oz7 oz7Var5 = new oz7(d2, d3, d4, d5, rm1.d(pm1Var, qm1Var2), zl1.b(0.38f, rm1.d(pm1Var, qm1Var)), zl1.b(0.38f, rm1.d(pm1Var, qm1Var2)));
                    pm1Var.e0 = oz7Var5;
                    oz7Var4 = oz7Var5;
                } else {
                    i3 = -234881025;
                }
                i4 = i13 & i3;
                kq7Var = kq7.a;
                oz7Var3 = oz7Var4;
                z5 = true;
            }
            rv4Var.r();
            rv4Var.e0(-224975399);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = s21.g(rv4Var);
            }
            yu7 yu7Var = (yu7) P;
            rv4Var.q(false);
            ur7 ur7Var = ur7.c;
            lf4 y = kqe.y(ur7Var, rv4Var);
            oz7 oz7Var6 = oz7Var3;
            boolean z6 = z5;
            tu1 E2 = jce.E(-876637252, new fw0(oz7Var3, z, y, lu4Var, z5, tu1Var), rv4Var);
            if (lu4Var == null) {
                rv4Var.e0(-224048562);
                rv4Var.q(false);
                E = null;
            } else {
                rv4Var.e0(-224048561);
                E = jce.E(802208206, new rd0(oz7Var6, z, y, lu4Var), rv4Var);
                rv4Var.q(false);
            }
            tu1 tu1Var2 = E;
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new em8(0);
                rv4Var.o0(P2);
            }
            em8 em8Var = (em8) P2;
            nq7 nq7Var3 = kq7Var;
            nq7 q = vte.q(nq7Var3, z, yu7Var, null, true, new xt9(4), vt4Var);
            nq7Var2 = nq7Var3;
            float f3 = a;
            float f4 = nae.e;
            nq7 a2 = hv9Var.a(1.0f, pna.b(q, nae.e, f3, 1), true);
            Object P3 = rv4Var.P();
            if (P3 == lh9Var) {
                P3 = new cl7(em8Var, 7);
                rv4Var.o0(P3);
            }
            nq7 l = pbe.l(a2, (xt4) P3);
            b37 d6 = fu0.d(kh5.e, true);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p = lye.p(rv4Var, l);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d6);
            jce.F(qw1.e, rv4Var, l2);
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
                f4 = 1.0f;
            }
            yya b3 = nq.b(f4, kqe.y(ur7.b, rv4Var), null, rv4Var, 0, 28);
            r13 r13Var = (r13) rv4Var.j(dy1.h);
            boolean f5 = rv4Var.f(r13Var);
            Object P4 = rv4Var.P();
            if (f5 || P4 == lh9Var) {
                P4 = new mm7(8, r13Var, em8Var);
                rv4Var.o0(P4);
            }
            vt4 vt4Var2 = (vt4) P4;
            boolean f6 = rv4Var.f(yu7Var) | rv4Var.f(vt4Var2);
            Object P5 = rv4Var.P();
            if (f6 || P5 == lh9Var) {
                P5 = new l17(yu7Var, vt4Var2);
                rv4Var.o0(P5);
            }
            tu1 E3 = jce.E(-2082182507, new el7((l17) P5, 5), rv4Var);
            tu1 E4 = jce.E(-799524251, new sv4(28, b2, oz7Var6), rv4Var);
            boolean f7 = rv4Var.f(b2);
            Object P6 = rv4Var.P();
            if (f7 || P6 == lh9Var) {
                P6 = new xk6(b2, 5);
                rv4Var.o0(P6);
            }
            vt4 vt4Var3 = (vt4) P6;
            boolean f8 = rv4Var.f(b3);
            Object P7 = rv4Var.P();
            if (f8 || P7 == lh9Var) {
                P7 = new xk6(b3, 4);
                rv4Var.o0(P7);
            }
            c(E3, E4, E2, tu1Var2, z6, vt4Var3, (vt4) P7, rv4Var, ((i4 >> 9) & 57344) | 438);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            z4 = z6;
            oz7Var2 = oz7Var6;
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
            nq7Var2 = nq7Var;
            z4 = z2;
            oz7Var2 = oz7Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new x32(hv9Var, z, vt4Var, tu1Var, nq7Var2, lu4Var, z4, oz7Var2, i);
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
        boolean z10;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        lu4 lu4Var2 = lu4Var;
        vt4 vt4Var3 = vt4Var;
        rv4Var.g0(-1019541078);
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
            boolean z11 = z5 | z4;
            int i10 = 57344 & i2;
            if (i10 == 16384) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z12 = z11 | z6;
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z12 || P == lh9Var) {
                P = new uz7(vt4Var2, lu4Var2, z, 0);
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
                rv4Var.e0(-660471321);
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
                boolean z13 = z8 | z9;
                Object P2 = rv4Var.P();
                if (!z13 && P2 != lh9Var) {
                    z3 = z;
                    vt4Var3 = vt4Var;
                    z10 = false;
                } else {
                    z3 = z;
                    vt4Var3 = vt4Var;
                    z10 = false;
                    P2 = new pz7(0, vt4Var3, z3);
                    rv4Var.o0(P2);
                }
                nq7 k = axe.k(o2, (xt4) P2);
                b37 d3 = fu0.d(nk0Var, z10);
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
                rv4Var.e0(-660200319);
                rv4Var.q(false);
            }
            rv4Var.q(z7);
        } else {
            z3 = z;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qz7(tu1Var, tu1Var2, tu1Var3, lu4Var2, z3, vt4Var3, vt4Var2, i, 0);
        }
    }
}
