package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vae  reason: default package */
/* loaded from: classes3.dex */
public abstract class vae {
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final double[][] d = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    public static final double[][] e = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};
    public static final tu1 f = new tu1(new rv1(2), false, -1675108716);
    public static ar5 g;

    public static final void a(final jub jubVar, final ps psVar, final xt4 xt4Var, final int i, final int i2, final xo3 xo3Var, final int i3, final boolean z, final boolean z2, final k2a k2aVar, rv4 rv4Var, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        lu4 q08Var;
        zm4 zm4Var;
        lh9 lh9Var;
        boolean z8;
        kg kgVar;
        np npVar;
        np npVar2;
        np npVar3;
        np npVar4;
        zm4 zm4Var2;
        rv4 rv4Var2;
        long j;
        xo3 xo3Var2;
        zx1 zx1Var;
        rv4 rv4Var3 = rv4Var;
        ba5 ba5Var = lre.g;
        rv4Var3.g0(-1348332882);
        if (rv4Var3.f(jubVar)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i15 = i4 | i5;
        if (rv4Var3.f(psVar)) {
            i6 = 32;
        } else {
            i6 = 16;
        }
        int i16 = i15 | i6;
        if (rv4Var3.h(xt4Var)) {
            i7 = 256;
        } else {
            i7 = Token.CASE;
        }
        int i17 = i16 | i7;
        if (rv4Var3.d(i)) {
            i8 = 2048;
        } else {
            i8 = 1024;
        }
        int i18 = i17 | i8;
        if (rv4Var3.d(i2)) {
            i9 = 16384;
        } else {
            i9 = 8192;
        }
        int i19 = i18 | i9;
        if (rv4Var3.f(xo3Var)) {
            i10 = 131072;
        } else {
            i10 = Parser.ARGC_LIMIT;
        }
        int i20 = i19 | i10;
        if (rv4Var3.d(i3)) {
            i11 = 1048576;
        } else {
            i11 = 524288;
        }
        int i21 = i20 | i11;
        if (rv4Var3.g(z)) {
            i12 = 8388608;
        } else {
            i12 = 4194304;
        }
        int i22 = i21 | i12;
        if (rv4Var3.g(z2)) {
            i13 = 67108864;
        } else {
            i13 = 33554432;
        }
        int i23 = i22 | i13;
        if (rv4Var3.f(k2aVar)) {
            i14 = 536870912;
        } else {
            i14 = 268435456;
        }
        int i24 = i23 | i14;
        if ((306783379 & i24) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var3.U(i24 & 1, z3)) {
            final k2a u = rte.u(rv4Var3);
            Object P = rv4Var3.P();
            lh9 lh9Var2 = ax1.a;
            if (P == lh9Var2) {
                P = yte.s(rv4Var3);
                rv4Var3.o0(P);
            }
            m82 m82Var = (m82) P;
            Object P2 = rv4Var3.P();
            if (P2 == lh9Var2) {
                P2 = s21.e(rv4Var3);
            }
            zm4 zm4Var3 = (zm4) P2;
            long q = zr1.q(i3);
            final long x = zr1.x(i3 * 1.5f, 4294967296L);
            r13 r13Var = (r13) rv4Var3.j(dy1.h);
            WeakHashMap weakHashMap = yjd.w;
            if (h88.n(rv4Var3).c.e().d > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            Integer valueOf = Integer.valueOf(i2);
            Boolean valueOf2 = Boolean.valueOf(z4);
            boolean g2 = rv4Var3.g(z4);
            if ((i24 & 3670016) == 1048576) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean f2 = g2 | z5 | rv4Var3.f(r13Var);
            if ((i24 & 57344) == 16384) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean h = f2 | z6 | rv4Var3.h(m82Var);
            if ((i24 & 1879048192) == 536870912) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z9 = h | z7;
            Object P3 = rv4Var3.P();
            if (!z9 && P3 != lh9Var2) {
                q08Var = P3;
                zm4Var = zm4Var3;
                lh9Var = lh9Var2;
                z8 = false;
            } else {
                zm4Var = zm4Var3;
                lh9Var = lh9Var2;
                z8 = false;
                q08Var = new q08(z4, i3, r13Var, i2, m82Var, k2aVar, null);
                rv4Var3.o0(q08Var);
            }
            yte.h(valueOf, valueOf2, q08Var, rv4Var3);
            Object P4 = rv4Var3.P();
            if (P4 == lh9Var) {
                P4 = new l24(zm4Var, null, 8);
                rv4Var3.o0(P4);
            }
            yte.g((lu4) P4, rv4Var3, pvc.a);
            ze4 ze4Var = pna.c;
            gv9 a2 = ev9.a(lz.a, kh5.F, rv4Var3, z8 ? 1 : 0);
            int hashCode = Long.hashCode(rv4Var3.T);
            xt8 l = rv4Var3.l();
            nq7 p = lye.p(rv4Var3, ze4Var);
            rw1.k.getClass();
            zx1 zx1Var2 = qw1.b;
            rv4Var3.i0();
            if (rv4Var3.S) {
                rv4Var3.k(zx1Var2);
            } else {
                rv4Var3.r0();
            }
            np npVar5 = qw1.f;
            jce.F(npVar5, rv4Var3, a2);
            np npVar6 = qw1.e;
            jce.F(npVar6, rv4Var3, l);
            Integer valueOf3 = Integer.valueOf(hashCode);
            np npVar7 = qw1.g;
            jce.F(npVar7, rv4Var3, valueOf3);
            kg kgVar2 = qw1.h;
            jce.C(kgVar2, rv4Var3);
            np npVar8 = qw1.d;
            jce.F(npVar8, rv4Var3, p);
            if (z) {
                rv4Var3.e0(2055328035);
                long d2 = sve.d(xo3Var.i);
                nq7 C = zbe.C(nmd.v(pna.c(zj0.m(kq7.a, w06.a), 1.0f), sve.d(xo3Var.i), ba5Var), nae.e, 4.0f, nae.e, nae.e, 13);
                kgVar = kgVar2;
                npVar = npVar8;
                j = q;
                tu1 E = jce.E(192481876, new os6(k2aVar, u, i, xo3Var, q, x), rv4Var3);
                npVar4 = npVar7;
                npVar3 = npVar6;
                npVar2 = npVar5;
                xo3Var2 = xo3Var;
                zm4Var2 = zm4Var;
                zx1Var = zx1Var2;
                v9b.a(C, null, d2, 0L, nae.e, nae.e, null, E, rv4Var3, 12582912, Token.FUNCTION);
                rv4Var2 = rv4Var3;
                z8 = false;
                rv4Var2.q(false);
            } else {
                kgVar = kgVar2;
                npVar = npVar8;
                npVar2 = npVar5;
                npVar3 = npVar6;
                npVar4 = npVar7;
                zm4Var2 = zm4Var;
                rv4Var2 = rv4Var3;
                j = q;
                xo3Var2 = xo3Var;
                zx1Var = zx1Var2;
                rv4Var2.e0(2056526712);
                rv4Var2.q(z8);
            }
            nq7 C2 = zbe.C(nmd.v(pna.c(new we6(1.0f, true), 1.0f), sve.d(xo3Var2.c), ba5Var), nae.e, 4.0f, nae.e, nae.e, 13);
            b37 d3 = fu0.d(kh5.a, z8);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, C2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar2, rv4Var2, d3);
            jce.F(npVar3, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar4, rv4Var2, kgVar);
            jce.F(npVar, rv4Var2, p2);
            i99 a3 = xxb.a.a(new wxb(sve.d(xo3Var2.j.a), zl1.b(0.4f, sve.d(4282210944L))));
            final xo3 xo3Var3 = xo3Var2;
            final zm4 zm4Var4 = zm4Var2;
            final long j2 = j;
            rv4Var3 = rv4Var;
            pye.a(a3, jce.E(720557252, new lu4() { // from class: n08
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    boolean z10;
                    rv4 rv4Var4 = (rv4) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (rv4Var4.U(intValue & 1, z10)) {
                        long j3 = zl1.h;
                        final long j4 = j2;
                        uw4 uw4Var = eo4.d;
                        final long j5 = x;
                        oyb oybVar = new oyb(j3, j4, null, null, uw4Var, 0L, 0L, 0, 0, j5, null, null, 16646108);
                        final xo3 xo3Var4 = xo3Var3;
                        esa esaVar = new esa(sve.d(xo3Var4.j.a));
                        nq7 n = mwe.n(zbe.A(rte.q(rte.C(pna.c, k2aVar, 14), u, 14), 4.0f, nae.e, 2), zm4Var4);
                        final jub jubVar2 = jubVar;
                        final boolean z11 = z2;
                        final ps psVar2 = psVar;
                        hj0.b(jubVar2, xt4Var, n, false, z11, oybVar, null, null, false, 0, 0, null, null, null, esaVar, jce.E(-1120108825, new mu4() { // from class: p08
                            @Override // defpackage.mu4
                            public final Object c(Object obj3, Object obj4, Object obj5) {
                                boolean z12;
                                lu4 lu4Var;
                                np npVar9;
                                kg kgVar3;
                                np npVar10;
                                kq7 kq7Var;
                                zx1 zx1Var3;
                                np npVar11;
                                np npVar12;
                                boolean z13;
                                nk0 nk0Var;
                                rv4 rv4Var5;
                                String str;
                                int i25;
                                lu4 lu4Var2 = (lu4) obj3;
                                rv4 rv4Var6 = (rv4) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                lu4Var2.getClass();
                                if ((intValue2 & 6) == 0) {
                                    if (rv4Var6.h(lu4Var2)) {
                                        i25 = 4;
                                    } else {
                                        i25 = 2;
                                    }
                                    intValue2 |= i25;
                                }
                                int i26 = intValue2;
                                if ((i26 & 19) != 18) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (rv4Var6.U(i26 & 1, z12)) {
                                    nk0 nk0Var2 = kh5.a;
                                    b37 d4 = fu0.d(nk0Var2, false);
                                    int hashCode3 = Long.hashCode(rv4Var6.T);
                                    xt8 l3 = rv4Var6.l();
                                    kq7 kq7Var2 = kq7.a;
                                    nq7 p3 = lye.p(rv4Var6, kq7Var2);
                                    rw1.k.getClass();
                                    zx1 zx1Var4 = qw1.b;
                                    rv4Var6.i0();
                                    if (rv4Var6.S) {
                                        rv4Var6.k(zx1Var4);
                                    } else {
                                        rv4Var6.r0();
                                    }
                                    np npVar13 = qw1.f;
                                    jce.F(npVar13, rv4Var6, d4);
                                    np npVar14 = qw1.e;
                                    jce.F(npVar14, rv4Var6, l3);
                                    Integer valueOf4 = Integer.valueOf(hashCode3);
                                    np npVar15 = qw1.g;
                                    jce.F(npVar15, rv4Var6, valueOf4);
                                    kg kgVar4 = qw1.h;
                                    jce.C(kgVar4, rv4Var6);
                                    np npVar16 = qw1.d;
                                    jce.F(npVar16, rv4Var6, p3);
                                    int length = jub.this.a.b.length();
                                    long j6 = j4;
                                    long j7 = j5;
                                    uw4 uw4Var2 = eo4.d;
                                    if (length == 0) {
                                        rv4Var6.e0(-450454979);
                                        if (z11) {
                                            str = "";
                                        } else {
                                            str = "Start typing...";
                                        }
                                        npVar9 = npVar14;
                                        lu4Var = lu4Var2;
                                        npVar10 = npVar15;
                                        npVar12 = npVar16;
                                        kgVar3 = kgVar4;
                                        kq7Var = kq7Var2;
                                        zx1Var3 = zx1Var4;
                                        npVar11 = npVar13;
                                        z13 = false;
                                        nk0Var = nk0Var2;
                                        cvb.c(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new oyb(sve.d(xo3Var4.g), j6, null, null, uw4Var2, 0L, 0L, 0, 0, j7, null, null, 16646108), rv4Var6, 0, 0, 131070);
                                        rv4Var5 = rv4Var6;
                                        rv4Var5.q(false);
                                    } else {
                                        lu4Var = lu4Var2;
                                        npVar9 = npVar14;
                                        kgVar3 = kgVar4;
                                        npVar10 = npVar15;
                                        kq7Var = kq7Var2;
                                        zx1Var3 = zx1Var4;
                                        npVar11 = npVar13;
                                        npVar12 = npVar16;
                                        z13 = false;
                                        rv4Var6.e0(-449872861);
                                        nk0Var = nk0Var2;
                                        cvb.d(psVar2, null, 0L, 0L, 0L, null, 0L, 0, false, Integer.MAX_VALUE, 0, null, null, new oyb(0L, j6, null, null, uw4Var2, 0L, 0L, 0, 0, j7, null, null, 16646109), rv4Var6, 0, 27648, 237566);
                                        rv4Var5 = rv4Var6;
                                        rv4Var5.q(false);
                                    }
                                    nq7 m = lpe.m(kq7Var, 1.0f);
                                    b37 d5 = fu0.d(nk0Var, z13);
                                    int hashCode4 = Long.hashCode(rv4Var5.T);
                                    xt8 l4 = rv4Var5.l();
                                    nq7 p4 = lye.p(rv4Var5, m);
                                    rv4Var5.i0();
                                    if (rv4Var5.S) {
                                        rv4Var5.k(zx1Var3);
                                    } else {
                                        rv4Var5.r0();
                                    }
                                    jce.F(npVar11, rv4Var5, d5);
                                    jce.F(npVar9, rv4Var5, l4);
                                    s21.t(hashCode4, rv4Var5, npVar10, rv4Var5, kgVar3);
                                    jce.F(npVar12, rv4Var5, p4);
                                    hl5.u(i26 & 14, lu4Var, rv4Var5, true, true);
                                } else {
                                    rv4Var6.X();
                                }
                                return pvc.a;
                            }
                        }, rv4Var4), rv4Var4, 0, 196608, 16328);
                    } else {
                        rv4Var4.X();
                    }
                    return pvc.a;
                }
            }, rv4Var3), rv4Var3, 56);
            rv4Var3.q(true);
            rv4Var3.q(true);
        } else {
            rv4Var3.X();
        }
        ek9 u2 = rv4Var3.u();
        if (u2 != null) {
            u2.d = new lu4(psVar, xt4Var, i, i2, xo3Var, i3, z, z2, k2aVar, i4) { // from class: o08
                public final /* synthetic */ int C;
                public final /* synthetic */ boolean D;
                public final /* synthetic */ boolean E;
                public final /* synthetic */ k2a F;
                public final /* synthetic */ ps b;
                public final /* synthetic */ xt4 c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ xo3 f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p3 = xoe.p(1);
                    vae.a(jub.this, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, (rv4) obj, p3);
                    return pvc.a;
                }
            };
        }
    }

    public static final void b(boolean z, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var.g0(-222440764);
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
            if (rv4Var.h(xt4Var2)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        }
        boolean z3 = true;
        if ((i2 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            int i6 = i2 & 14;
            if (i6 != 4) {
                z3 = false;
            }
            Object P = rv4Var.P();
            if (z3 || P == ax1.a) {
                P = yae.z("");
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            xb.d(z, xt4Var, jce.E(511484440, new h24(4, xt4Var2, xt4Var, aw7Var), rv4Var), null, mwe.x(kq7.a, 14), jce.E(1090278043, new id1(xt4Var, 17, (byte) 0), rv4Var), aze.c, null, 0L, 0L, nae.e, false, false, jce.E(1310492272, new sp0(aw7Var, 13), rv4Var), rv4Var, i6 | 1769856 | (i2 & Token.ASSIGN_MOD), 8072);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new z52(i, 4, xt4Var, xt4Var2, z);
        }
    }

    public static final void c(sk1 sk1Var, ro3 ro3Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        qcc qccVar;
        int i5;
        qcc qccVar2;
        aw7 aw7Var;
        d90 d90Var;
        long d2;
        dq4 dq4Var;
        wp4 wp4Var;
        int length;
        d90 d90Var2;
        int i6;
        int i7;
        int i8;
        char c2;
        int i9;
        int i10;
        int i11;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        rv4 rv4Var2 = rv4Var;
        sk1Var.getClass();
        rv4Var2.g0(-115769775);
        if (rv4Var2.f(sk1Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i12 = i | i2;
        if (rv4Var2.f(ro3Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i13 = i12 | i3;
        if (rv4Var2.f(nq7Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i14 = i13 | i4;
        if ((i14 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i14 & 1, z)) {
            rv4Var2.Z();
            if ((i & 1) != 0 && !rv4Var2.B()) {
                rv4Var2.X();
            }
            rv4Var2.r();
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = ro3Var.h;
                rv4Var2.o0(P);
            }
            aw7 aw7Var2 = (aw7) P;
            boolean d3 = rv4Var2.d(3);
            Object P2 = rv4Var2.P();
            if (d3 || P2 == lh9Var) {
                P2 = new w96();
                rv4Var2.o0(P2);
            }
            w96 w96Var = (w96) P2;
            boolean d4 = rv4Var2.d(3);
            Object P3 = rv4Var2.P();
            if (d4 || P3 == lh9Var) {
                rv4Var2.o0(null);
                P3 = null;
            }
            lw3 lw3Var = (lw3) P3;
            boolean d5 = rv4Var2.d(3);
            int i15 = (i14 & Token.ASSIGN_MOD) ^ 48;
            if ((i15 > 32 && rv4Var2.f(ro3Var)) || (i14 & 48) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z7 = z2 | d5;
            Object P4 = rv4Var2.P();
            if (z7 || P4 == lh9Var) {
                ro3Var.getClass();
                P4 = new d90(ro3Var);
                rv4Var2.o0(P4);
            }
            d90 d90Var3 = (d90) P4;
            boolean f2 = rv4Var2.f((xo3) aw7Var2.getValue()) | rv4Var2.f(w96Var) | rv4Var2.f(lw3Var);
            Object P5 = rv4Var2.P();
            if (f2 || P5 == lh9Var) {
                P5 = new qfb(w96Var, lw3Var, (xo3) aw7Var2.getValue());
                rv4Var2.o0(P5);
            }
            qfb qfbVar = (qfb) P5;
            boolean f3 = rv4Var2.f(sk1Var.a()) | rv4Var2.f((xo3) aw7Var2.getValue());
            Object P6 = rv4Var2.P();
            if (!f3 && P6 != lh9Var) {
                i5 = i14;
                aw7Var = aw7Var2;
                d90Var = d90Var3;
            } else {
                String a2 = sk1Var.a();
                qfbVar.getClass();
                a2.getClass();
                w96 w96Var2 = qfbVar.a;
                w96Var2.getClass();
                ArrayList arrayList = new ArrayList();
                int i16 = 0;
                while (true) {
                    int length2 = a2.length();
                    qccVar = qcc.a;
                    i5 = i14;
                    qccVar2 = qcc.c;
                    if (i16 >= length2) {
                        break;
                    }
                    aw7 aw7Var3 = aw7Var2;
                    if (r4b.P(i16, a2, "//", false)) {
                        int f0 = k4b.f0(a2, '\n', i16, 4);
                        Integer valueOf = Integer.valueOf(f0);
                        if (f0 == -1) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            length = valueOf.intValue();
                        } else {
                            length = a2.length();
                        }
                        arrayList.add(new ccc(a2.substring(i16, length), qccVar2, i16, length));
                        i16 = length;
                        i14 = i5;
                        aw7Var2 = aw7Var3;
                    } else {
                        if (r4b.P(i16, a2, "/*", false)) {
                            d90Var2 = d90Var3;
                            int g0 = k4b.g0(a2, "*/", i16 + 2, false, 4);
                            Integer valueOf2 = Integer.valueOf(g0);
                            if (g0 == -1) {
                                valueOf2 = null;
                            }
                            if (valueOf2 != null) {
                                i10 = valueOf2.intValue() + 2;
                            } else {
                                i10 = a2.length();
                            }
                            arrayList.add(new ccc(a2.substring(i16, i10), qccVar2, i16, i10));
                        } else {
                            d90Var2 = d90Var3;
                            boolean P7 = r4b.P(i16, a2, "\"\"\"", false);
                            qcc qccVar3 = qcc.b;
                            if (P7) {
                                int g02 = k4b.g0(a2, "\"\"\"", i16 + 3, false, 4);
                                Integer valueOf3 = Integer.valueOf(g02);
                                if (g02 == -1) {
                                    valueOf3 = null;
                                }
                                if (valueOf3 != null) {
                                    i9 = valueOf3.intValue() + 3;
                                } else {
                                    i9 = a2.length();
                                }
                                arrayList.add(new ccc(a2.substring(i16, i9), qccVar3, i16, i9));
                            } else if (a2.charAt(i16) == '\"') {
                                i9 = ((Number) w96Var2.a(a2, i16, '\"').a).intValue();
                                arrayList.add(new ccc(a2.substring(i16, i9), qccVar3, i16, i9));
                            } else if (a2.charAt(i16) == '\'') {
                                i9 = ((Number) w96Var2.a(a2, i16, '\'').a).intValue();
                                arrayList.add(new ccc(a2.substring(i16, i9), qccVar3, i16, i9));
                            } else {
                                char c3 = '.';
                                if (!Character.isDigit(a2.charAt(i16)) && (a2.charAt(i16) != '.' || (i11 = i16 + 1) >= a2.length() || !Character.isDigit(a2.charAt(i11)))) {
                                    char charAt = a2.charAt(i16);
                                    qcc qccVar4 = qcc.f;
                                    if (charAt == '@' && (i9 = i16 + 1) < a2.length() && Character.isLetter(a2.charAt(i9))) {
                                        while (i9 < a2.length() && (Character.isLetterOrDigit(a2.charAt(i9)) || a2.charAt(i9) == '_')) {
                                            i9++;
                                        }
                                        arrayList.add(new ccc(a2.substring(i16, i9), qccVar4, i16, i9));
                                    } else if (!Character.isLetter(a2.charAt(i16)) && a2.charAt(i16) != '_' && a2.charAt(i16) != '`') {
                                        if (k4b.W("+-*/%=<>!&|^~(){}[].,;:?", a2.charAt(i16))) {
                                            Set F0 = b00.F0(new String[]{"++", "--", "&&", "||", "==", "!=", "<=", ">=", "===", "!==", "+=", "-=", "*=", "/=", "%=", "->", "..", "?:", "!!", "?."});
                                            i10 = i16 + 3;
                                            if ((i10 > a2.length() || !F0.contains(a2.substring(i16, i10))) && ((i10 = i16 + 2) > a2.length() || !F0.contains(a2.substring(i16, i10)))) {
                                                i10 = i16 + 1;
                                            }
                                            arrayList.add(new ccc(a2.substring(i16, i10), qcc.D, i16, i10));
                                        } else if (nqe.y(a2.charAt(i16))) {
                                            i9 = i16;
                                            while (i9 < a2.length() && nqe.y(a2.charAt(i9))) {
                                                i9++;
                                            }
                                            arrayList.add(new ccc(a2.substring(i16, i9), qcc.E, i16, i9));
                                        } else {
                                            i16++;
                                            i14 = i5;
                                            aw7Var2 = aw7Var3;
                                            d90Var3 = d90Var2;
                                        }
                                    } else {
                                        if (a2.charAt(i16) == '`') {
                                            int i17 = i16 + 1;
                                            while (i17 < a2.length() && a2.charAt(i17) != '`') {
                                                i17++;
                                            }
                                            if (i17 < a2.length()) {
                                                i17++;
                                            }
                                            i6 = i17;
                                            c2 = '`';
                                        } else {
                                            c2 = '`';
                                            int i18 = i16;
                                            while (i18 < a2.length() && (Character.isLetterOrDigit(a2.charAt(i18)) || a2.charAt(i18) == '_')) {
                                                i18++;
                                            }
                                            i6 = i18;
                                        }
                                        String O0 = k4b.O0(a2.substring(i16, i6), c2);
                                        if (!w96Var2.a.contains(O0)) {
                                            if (w96Var2.b.contains(O0) || Character.isUpperCase(O0.charAt(0))) {
                                                qccVar = qccVar4;
                                            } else {
                                                int i19 = i6;
                                                while (i19 < a2.length() && nqe.y(a2.charAt(i19))) {
                                                    i19++;
                                                }
                                                if (i19 < a2.length() && a2.charAt(i19) == '(') {
                                                    qccVar = qcc.e;
                                                } else {
                                                    qccVar = qcc.C;
                                                }
                                            }
                                        }
                                        arrayList.add(new ccc(a2.substring(i16, i6), qccVar, i16, i6));
                                    }
                                } else {
                                    if (i16 < a2.length() - 1 && a2.charAt(i16) == '0') {
                                        int i20 = i16 + 1;
                                        if (a2.charAt(i20) != 'x' && a2.charAt(i20) != 'X') {
                                            if (a2.charAt(i20) == 'b' || a2.charAt(i20) == 'B') {
                                                i8 = i16 + 2;
                                                while (i8 < a2.length() && k4b.W("01", a2.charAt(i8))) {
                                                    i8++;
                                                }
                                            }
                                        } else {
                                            i8 = i16 + 2;
                                            while (i8 < a2.length() && (Character.isDigit(a2.charAt(i8)) || k4b.W("abcdefABCDEF", a2.charAt(i8)))) {
                                                i8++;
                                            }
                                        }
                                        i6 = i8;
                                        arrayList.add(new ccc(a2.substring(i16, i6), qcc.d, i16, i6));
                                    }
                                    int i21 = i16;
                                    boolean z8 = false;
                                    boolean z9 = false;
                                    while (true) {
                                        if (i21 >= a2.length()) {
                                            break;
                                        } else if (Character.isDigit(a2.charAt(i21))) {
                                            i21++;
                                        } else {
                                            if (a2.charAt(i21) == c3 && !z8 && (i7 = i21 + 1) < a2.length() && Character.isDigit(a2.charAt(i7))) {
                                                i21 = i7;
                                                z8 = true;
                                            } else if (k4b.W("eE", a2.charAt(i21)) && !z9) {
                                                int i22 = i21 + 1;
                                                if (i22 < a2.length() && k4b.W("+-", a2.charAt(i22))) {
                                                    i21 += 2;
                                                } else {
                                                    i21 = i22;
                                                }
                                                c3 = '.';
                                                z9 = true;
                                            } else if (k4b.W("fFdDlL", a2.charAt(i21))) {
                                                i21++;
                                                break;
                                            } else if (a2.charAt(i21) != '_') {
                                                break;
                                            } else {
                                                i21++;
                                            }
                                            c3 = '.';
                                        }
                                    }
                                    i6 = i21;
                                    arrayList.add(new ccc(a2.substring(i16, i6), qcc.d, i16, i6));
                                }
                                i16 = i6;
                                i14 = i5;
                                aw7Var2 = aw7Var3;
                                d90Var3 = d90Var2;
                            }
                            i16 = i9;
                            i14 = i5;
                            aw7Var2 = aw7Var3;
                            d90Var3 = d90Var2;
                        }
                        i16 = i10;
                        i14 = i5;
                        aw7Var2 = aw7Var3;
                        d90Var3 = d90Var2;
                    }
                }
                aw7Var = aw7Var2;
                d90Var = d90Var3;
                ns nsVar = new ns();
                nsVar.f(a2);
                int size = arrayList.size();
                int i23 = 0;
                while (i23 < size) {
                    Object obj = arrayList.get(i23);
                    i23++;
                    ccc cccVar = (ccc) obj;
                    qcc qccVar5 = cccVar.b;
                    xo3 xo3Var = qfbVar.b;
                    switch (qccVar5.ordinal()) {
                        case 0:
                            d2 = sve.d(xo3Var.j.a);
                            break;
                        case 1:
                            d2 = sve.d(xo3Var.j.b);
                            break;
                        case 2:
                            d2 = sve.d(xo3Var.j.c);
                            break;
                        case 3:
                            d2 = sve.d(xo3Var.j.d);
                            break;
                        case 4:
                            d2 = sve.d(xo3Var.j.e);
                            break;
                        case 5:
                            d2 = sve.d(xo3Var.j.f);
                            break;
                        case 6:
                            d2 = sve.d(xo3Var.j.g);
                            break;
                        case 7:
                            d2 = sve.d(xo3Var.j.h);
                            break;
                        case 8:
                            d2 = sve.d(xo3Var.d);
                            break;
                        case 9:
                            d2 = sve.d(xo3Var.d);
                            break;
                        default:
                            xk5.o();
                            return;
                    }
                    long j = d2;
                    qcc qccVar6 = cccVar.b;
                    if (qccVar6 == qccVar) {
                        dq4Var = dq4.D;
                    } else {
                        dq4Var = null;
                    }
                    if (qccVar6 == qccVar2) {
                        wp4Var = new wp4(1);
                    } else {
                        wp4Var = null;
                    }
                    nsVar.b(cccVar.c, cccVar.d, new uva(j, 0L, dq4Var, wp4Var, null, null, null, 0L, null, null, null, 0L, null, null, 65522));
                }
                P6 = nsVar.k();
                rv4Var2.o0(P6);
            }
            ps psVar = (ps) P6;
            k2a u = rte.u(rv4Var2);
            Object P8 = rv4Var2.P();
            if (P8 == lh9Var) {
                P8 = new ud0();
                rv4Var2.o0(P8);
            }
            ud0 ud0Var = (ud0) P8;
            if ((i15 > 32 && rv4Var2.h(ro3Var)) || (i5 & 48) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P9 = rv4Var2.P();
            if (z3 || P9 == lh9Var) {
                P9 = new vi(ro3Var, 7);
                rv4Var2.o0(P9);
            }
            nq7 b2 = dab.b(nq7Var, pvc.a, (PointerInputEventHandler) P9);
            boolean h = rv4Var2.h(ud0Var);
            int i24 = i5 & 14;
            if (i24 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z10 = h | z4;
            Object P10 = rv4Var2.P();
            if (z10 || P10 == lh9Var) {
                P10 = new oj7(7, ud0Var, sk1Var);
                rv4Var2.o0(P10);
            }
            nq7 m = tye.m(b2, (xt4) P10);
            b37 d6 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, m);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, d6);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            jub jubVar = (jub) sk1Var.b.getValue();
            xo3 xo3Var2 = (xo3) aw7Var.getValue();
            int intValue = ((Number) sk1Var.d.getValue()).intValue();
            int intValue2 = ((Number) sk1Var.e.getValue()).intValue() - 1;
            int intValue3 = ((Number) ro3Var.l.getValue()).intValue();
            boolean booleanValue = ((Boolean) ro3Var.k.getValue()).booleanValue();
            boolean booleanValue2 = ((Boolean) ro3Var.o.getValue()).booleanValue();
            if ((i15 > 32 && rv4Var2.h(ro3Var)) || (i5 & 48) == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (i24 == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z11 = z5 | z6;
            d90 d90Var4 = d90Var;
            boolean h2 = z11 | rv4Var2.h(d90Var4);
            Object P11 = rv4Var2.P();
            if (h2 || P11 == lh9Var) {
                P11 = new nq3(20, ro3Var, sk1Var, d90Var4);
                rv4Var2.o0(P11);
            }
            a(jubVar, psVar, (xt4) P11, intValue, intValue2, xo3Var2, intValue3, booleanValue, booleanValue2, u, rv4Var2, 0);
            rv4Var2 = rv4Var;
            jxe.b(sk1Var, ro3Var, u.a.h(), ud0Var, rv4Var2, (i5 & Token.ELSE) | 4096);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u2 = rv4Var2.u();
        if (u2 != null) {
            u2.d = new vg7(sk1Var, ro3Var, nq7Var, i, 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0086 -> B:25:0x0066). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0089 -> B:25:0x0066). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(java.util.List r7, defpackage.sg2 r8, defpackage.n42 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.bg2
            if (r0 == 0) goto L13
            r0 = r9
            bg2 r0 = (defpackage.bg2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bg2 r0 = new bg2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L43
            if (r1 == r4) goto L3b
            if (r1 != r3) goto L35
            java.util.Iterator r7 = r0.b
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.io.Serializable r8 = r0.a
            zl9 r8 = (defpackage.zl9) r8
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L33
            goto L66
        L33:
            r9 = move-exception
            goto L82
        L35:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r2
        L3b:
            java.io.Serializable r7 = r0.a
            java.util.List r7 = (java.util.List) r7
            defpackage.hre.r(r9)
            goto L5d
        L43:
            defpackage.hre.r(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            da r1 = new da
            r6 = 5
            r1.<init>(r7, r9, r2, r6)
            r0.a = r9
            r0.d = r4
            java.lang.Object r7 = r8.a(r1, r0)
            if (r7 != r5) goto L5c
            goto L97
        L5c:
            r7 = r9
        L5d:
            zl9 r8 = new zl9
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L66:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L8f
            java.lang.Object r9 = r7.next()
            xt4 r9 = (defpackage.xt4) r9
            r0.a = r8     // Catch: java.lang.Throwable -> L33
            r1 = r7
            java.util.Iterator r1 = (java.util.Iterator) r1     // Catch: java.lang.Throwable -> L33
            r0.b = r1     // Catch: java.lang.Throwable -> L33
            r0.d = r3     // Catch: java.lang.Throwable -> L33
            java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L33
            if (r9 != r5) goto L66
            goto L97
        L82:
            java.lang.Object r1 = r8.a
            if (r1 != 0) goto L89
            r8.a = r9
            goto L66
        L89:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            defpackage.pye.e(r1, r9)
            goto L66
        L8f:
            java.lang.Object r7 = r8.a
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 != 0) goto L98
            pvc r5 = defpackage.pvc.a
        L97:
            return r5
        L98:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vae.d(java.util.List, sg2, n42):java.lang.Object");
    }

    public static int e(double d2) {
        double d3;
        boolean z;
        double d4;
        double d5 = (d2 + 16.0d) / 116.0d;
        if (d2 > 8.0d) {
            d3 = d5 * d5 * d5;
        } else {
            d3 = d2 / 903.2962962962963d;
        }
        double d6 = d5 * d5 * d5;
        if (d6 > 0.008856451679035631d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            d4 = d6;
        } else {
            d4 = d2 / 903.2962962962963d;
        }
        if (!z) {
            d6 = d2 / 903.2962962962963d;
        }
        float[] fArr = c;
        double d7 = d4 * fArr[0];
        double d8 = d3 * fArr[1];
        double d9 = d6 * fArr[2];
        double[][] dArr = e;
        double[] dArr2 = dArr[0];
        double d10 = (dArr2[2] * d9) + (dArr2[1] * d8) + (dArr2[0] * d7);
        double[] dArr3 = dArr[1];
        double d11 = (dArr3[2] * d9) + (dArr3[1] * d8) + (dArr3[0] * d7);
        double[] dArr4 = dArr[2];
        return ((i(d10) & 255) << 16) | (-16777216) | ((i(d11) & 255) << 8) | (i((dArr4[2] * d9) + (dArr4[1] * d8) + (dArr4[0] * d7)) & 255);
    }

    public static final int f(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            int i3 = (j > jArr[i2] ? 1 : (j == jArr[i2] ? 0 : -1));
            if (i3 > 0) {
                i = i2 + 1;
            } else if (i3 < 0) {
                length = i2 - 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6 A[Catch: all -> 0x00ee, TRY_LEAVE, TryCatch #2 {all -> 0x00ee, blocks: (B:43:0x00c0, B:45:0x00c6), top: B:65:0x00c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0119 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.c9a r19, defpackage.pe4 r20, defpackage.rz r21, defpackage.hn8 r22, boolean r23, defpackage.hh0 r24) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vae.g(c9a, pe4, rz, hn8, boolean, hh0):java.lang.Object");
    }

    public static final String h(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder(i2 / 2);
        int i3 = i2 + i;
        while (true) {
            int i4 = i + 1;
            if (i4 < i3) {
                sb.append((char) (((bArr[i4] & 255) << 8) | (bArr[i] & 255)));
                i += 2;
            } else {
                return sb.toString();
            }
        }
    }

    public static int i(double d2) {
        double pow;
        double d3 = d2 / 100.0d;
        if (d3 <= 0.0031308d) {
            pow = d3 * 12.92d;
        } else {
            pow = (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d;
        }
        int round = (int) Math.round(pow * 255.0d);
        if (round < 0) {
            return 0;
        }
        if (round > 255) {
            return 255;
        }
        return round;
    }

    public static final int j(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else if (i3 < 0) {
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        } else {
            vs.m("Step is zero.");
            return 0;
        }
        return i2;
    }

    public static int k(float f2) {
        float f3;
        boolean z;
        float f4;
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f5 = (f2 + 16.0f) / 116.0f;
        if (f2 > 8.0f) {
            f3 = f5 * f5 * f5;
        } else {
            f3 = f2 / 903.2963f;
        }
        float f6 = f5 * f5 * f5;
        if (f6 > 0.008856452f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f4 = f6;
        } else {
            f4 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z) {
            f6 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return tn1.a(f4 * fArr[0], f3 * fArr[1], f6 * fArr[2]);
    }

    public static float l(int i) {
        float pow;
        float f2 = i / 255.0f;
        if (f2 <= 0.04045f) {
            pow = f2 / 12.92f;
        } else {
            pow = (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static final List m(long j, byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 4 && j >= 0) {
            int i4 = (int) j;
            if (i4 + i <= bArr.length && (i3 = (i - 4) / (i2 + 4)) > 0) {
                ArrayList arrayList = new ArrayList(i3 + 1);
                if (i3 >= 0) {
                    int i5 = 0;
                    while (true) {
                        arrayList.add(Integer.valueOf((int) yae.J(bArr, (i5 * 4) + i4)));
                        if (i5 == i3) {
                            break;
                        }
                        i5++;
                    }
                }
                return arrayList;
            }
        }
        return ks3.a;
    }

    public static final yk8 n(Object obj, Object obj2) {
        return new yk8(obj, obj2);
    }

    public static final int o(byte[] bArr, int i) {
        bArr.getClass();
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    public static final long p(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static byte[] q(byte[]... bArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= bArr.length) {
                break;
            }
            i2 += bArr[i].length;
            i++;
        }
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (byte[] bArr3 : bArr) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i3, length);
            i3 += length;
        }
        return bArr2;
    }
}
