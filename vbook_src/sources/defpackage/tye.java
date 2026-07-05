package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tye  reason: default package */
/* loaded from: classes.dex */
public abstract class tye {
    public static final tu1 a = new tu1(new lv1(11), false, -1515151547);

    public static final void a(boolean z, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        rv4Var.g0(268484140);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var.h(vt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var.h(vt4Var2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var.h(vt4Var3)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(vt4Var4)) {
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
            iue.e(z, null, 0L, null, nae.e, new th8(12.0f, 12.0f, 12.0f, 12.0f), vt4Var, jce.E(-213936736, new y33(vt4Var3, vt4Var2, vt4Var4, 7), rv4Var), rv4Var, (i11 & 14) | 12779520 | ((i11 << 15) & 3670016), 30);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new z33(z, vt4Var, vt4Var2, vt4Var3, vt4Var4, i, 5);
        }
    }

    public static final void b(final String str, nq7 nq7Var, final oyb oybVar, final long j, final boolean z, final int i, final tu1 tu1Var, lu4 lu4Var, rv4 rv4Var, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        final int i9;
        boolean z2;
        final nq7 nq7Var2;
        final lu4 lu4Var2;
        nq7 nq7Var3;
        final tu1 tu1Var2;
        int i10;
        str.getClass();
        rv4Var.g0(-536332434);
        if (rv4Var.f(str)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i11 = i2 | i4;
        int i12 = i3 & 2;
        if (i12 != 0) {
            i11 |= 48;
        } else if ((i2 & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i11 |= i5;
        }
        if (rv4Var.f(oybVar)) {
            i6 = 256;
        } else {
            i6 = Token.CASE;
        }
        int i13 = i11 | i6;
        if (rv4Var.e(j)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i14 = i13 | i7;
        if (rv4Var.g(z)) {
            i8 = 16384;
        } else {
            i8 = 8192;
        }
        int i15 = i14 | i8;
        if ((i2 & 196608) == 0) {
            i9 = i;
            if (rv4Var.d(i9)) {
                i10 = 131072;
            } else {
                i10 = Parser.ARGC_LIMIT;
            }
            i15 |= i10;
        } else {
            i9 = i;
        }
        int i16 = i15 | 12582912;
        if ((4793491 & i16) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i16 & 1, z2)) {
            rv4Var.Z();
            if ((i2 & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                nq7Var3 = nq7Var;
                tu1Var2 = lu4Var;
            } else {
                if (i12 != 0) {
                    nq7Var3 = kq7.a;
                } else {
                    nq7Var3 = nq7Var;
                }
                tu1Var2 = ote.a;
            }
            rv4Var.r();
            final uvb o = qye.o(rv4Var);
            int i17 = ((i16 >> 3) & 14) | 3072;
            nq7 nq7Var4 = nq7Var3;
            hc2.b(nq7Var4, null, jce.E(-467681832, new mu4() { // from class: d14
                @Override // defpackage.mu4
                public final Object c(Object obj, Object obj2, Object obj3) {
                    boolean z3;
                    int i18;
                    int i19;
                    boolean z4;
                    int i20;
                    su0 su0Var = (su0) obj;
                    rv4 rv4Var2 = (rv4) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    su0Var.getClass();
                    if ((intValue & 6) == 0) {
                        if (rv4Var2.f(su0Var)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                        intValue |= i20;
                    }
                    if ((intValue & 19) != 18) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z3)) {
                        int i21 = x02.i(su0Var.b);
                        kq7 kq7Var = kq7.a;
                        nq7 g = c16.g(pna.f(kq7Var, 1.0f), tte.x(0, 0, null, 7), 2);
                        xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
                        int hashCode = Long.hashCode(rv4Var2.T);
                        xt8 l = rv4Var2.l();
                        nq7 p = lye.p(rv4Var2, g);
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
                        if (i21 > 0) {
                            rv4Var2.e0(-2029979502);
                            String str2 = str;
                            boolean f = rv4Var2.f(str2) | rv4Var2.d(i21);
                            Object P = rv4Var2.P();
                            oyb oybVar2 = oybVar;
                            if (!f && P != ax1.a) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                if (i21 < 0) {
                                    nv5.a("width must be >= 0");
                                }
                                long h = y02.h(i21, i21, 0, Integer.MAX_VALUE);
                                i18 = Integer.MAX_VALUE;
                                P = Integer.valueOf(uvb.a(o, str2, oybVar2, h, 988).b.f);
                                rv4Var2.o0(P);
                            }
                            int intValue2 = ((Number) P).intValue();
                            nq7 f2 = pna.f(kq7Var, 1.0f);
                            boolean z5 = z;
                            int i22 = i9;
                            if (z5) {
                                i19 = i18;
                            } else {
                                i19 = i22;
                            }
                            cvb.c(str2, f2, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, i19, 0, null, oybVar2, rv4Var2, 48, 0, 114680);
                            rv4Var2 = rv4Var2;
                            if (i22 < intValue2) {
                                rv4Var2.e0(-2029391804);
                                if (z5) {
                                    rv4Var2.e0(-2029359905);
                                    tu1Var2.invoke(rv4Var2, 0);
                                    z4 = false;
                                    rv4Var2.q(false);
                                } else {
                                    z4 = false;
                                    rv4Var2.e0(-2029289535);
                                    tu1Var.invoke(rv4Var2, 0);
                                    rv4Var2.q(false);
                                }
                                rv4Var2.q(z4);
                            } else {
                                z4 = false;
                                rv4Var2.e0(-2029211136);
                                rv4Var2.q(false);
                            }
                            rv4Var2.q(z4);
                        } else {
                            rv4Var2.e0(-2029197248);
                            rv4Var2.q(false);
                        }
                        rv4Var2.q(true);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, i17, 6);
            nq7Var2 = nq7Var4;
            lu4Var2 = tu1Var2;
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
            lu4Var2 = lu4Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: e14
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    tye.b(str, nq7Var2, oybVar, j, z, i, tu1Var, lu4Var2, (rv4) obj, xoe.p(i2 | 1), i3);
                    return pvc.a;
                }
            };
        }
    }

    public static final hv5 c(s76 s76Var, String str) {
        return new hv5(str, new iv5(s76Var));
    }

    public static final void d(final boolean z, final int i, final int i2, final int i3, final nq7 nq7Var, final vt4 vt4Var, final vt4 vt4Var2, final xt4 xt4Var, final vt4 vt4Var3, final vt4 vt4Var4, final vt4 vt4Var5, final vt4 vt4Var6, rv4 rv4Var, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        vt4Var.getClass();
        vt4Var2.getClass();
        xt4Var.getClass();
        vt4Var3.getClass();
        vt4Var4.getClass();
        vt4Var5.getClass();
        vt4Var6.getClass();
        rv4Var.g0(782650133);
        if ((i4 & 6) == 0) {
            if (rv4Var.g(z)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i6 = i21 | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 = i;
            if (rv4Var.d(i7)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i6 |= i20;
        } else {
            i7 = i;
        }
        if ((i4 & 384) == 0) {
            i8 = i2;
            if (rv4Var.d(i8)) {
                i19 = 256;
            } else {
                i19 = Token.CASE;
            }
            i6 |= i19;
        } else {
            i8 = i2;
        }
        if ((i4 & 3072) == 0) {
            if (rv4Var.d(i3)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i6 |= i18;
        }
        if ((i4 & 24576) == 0) {
            if (rv4Var.f(nq7Var)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i6 |= i17;
        }
        if ((196608 & i4) == 0) {
            if (rv4Var.h(vt4Var)) {
                i16 = 131072;
            } else {
                i16 = Parser.ARGC_LIMIT;
            }
            i6 |= i16;
        }
        if ((1572864 & i4) == 0) {
            if (rv4Var.h(vt4Var2)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i6 |= i15;
        }
        if ((12582912 & i4) == 0) {
            if (rv4Var.h(xt4Var)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i6 |= i14;
        }
        if ((100663296 & i4) == 0) {
            if (rv4Var.h(vt4Var3)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i6 |= i13;
        }
        if ((i4 & 805306368) == 0) {
            if (rv4Var.h(vt4Var4)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i6 |= i12;
        }
        if ((i5 & 6) == 0) {
            if (rv4Var.h(vt4Var5)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i9 = i5 | i11;
        } else {
            i9 = i5;
        }
        if ((i5 & 48) == 0) {
            if (rv4Var.h(vt4Var6)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
        }
        if ((306783379 & i6) == 306783378 && (i9 & 19) == 18) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var.U(i6 & 1, z2)) {
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
            nq7 f = pna.f(kq7.a, 1.0f);
            eu3 g = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new rg8(7);
                rv4Var.o0(P);
            }
            eu3 a3 = g.a(zt3.t((xt4) P));
            lz3 i22 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new rg8(8);
                rv4Var.o0(P2);
            }
            final int i23 = i7;
            final int i24 = i8;
            rte.e(z, f, a3, i22.a(zt3.x((xt4) P2)), null, jce.E(-1576036893, new mu4() { // from class: yo8
                /* JADX WARN: Code restructure failed: missing block: B:63:0x03bd, code lost:
                    if (r6 == r5) goto L77;
                 */
                @Override // defpackage.mu4
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object c(java.lang.Object r54, java.lang.Object r55, java.lang.Object r56) {
                    /*
                        Method dump skipped, instructions count: 1282
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.yo8.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, rv4Var), rv4Var, 1600902 | ((i6 << 3) & Token.ASSIGN_MOD), 16);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: zo8
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p2 = xoe.p(i4 | 1);
                    int p3 = xoe.p(i5);
                    tye.d(z, i, i2, i3, nq7Var, vt4Var, vt4Var2, xt4Var, vt4Var3, vt4Var4, vt4Var5, vt4Var6, (rv4) obj, p2, p3);
                    return pvc.a;
                }
            };
        }
    }

    public static final void e(final boolean z, final int i, final int i2, final int i3, final nq7 nq7Var, final vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, final vt4 vt4Var4, final xt4 xt4Var, rv4 rv4Var, final int i4) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        vt4Var.getClass();
        vt4Var2.getClass();
        vt4Var3.getClass();
        vt4Var4.getClass();
        xt4Var.getClass();
        rv4Var.g0(1956479973);
        if ((i4 & 6) == 0) {
            z2 = z;
            if (rv4Var.g(z2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i5 = i4 | i15;
        } else {
            z2 = z;
            i5 = i4;
        }
        if (rv4Var.d(i)) {
            i6 = 32;
        } else {
            i6 = 16;
        }
        int i16 = i5 | i6;
        if (rv4Var.d(i2)) {
            i7 = 256;
        } else {
            i7 = Token.CASE;
        }
        int i17 = i16 | i7;
        if (rv4Var.d(i3)) {
            i8 = 2048;
        } else {
            i8 = 1024;
        }
        int i18 = i17 | i8;
        if (rv4Var.f(nq7Var)) {
            i9 = 16384;
        } else {
            i9 = 8192;
        }
        int i19 = i18 | i9;
        if (rv4Var.h(vt4Var)) {
            i10 = 131072;
        } else {
            i10 = Parser.ARGC_LIMIT;
        }
        int i20 = i19 | i10;
        if ((i4 & 1572864) == 0) {
            if (rv4Var.h(vt4Var2)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i20 |= i14;
        }
        if ((i4 & 12582912) == 0) {
            if (rv4Var.h(vt4Var3)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i20 |= i13;
        }
        if ((i4 & 100663296) == 0) {
            if (rv4Var.h(vt4Var4)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i20 |= i12;
        }
        if ((i4 & 805306368) == 0) {
            if (rv4Var.h(xt4Var)) {
                i11 = 536870912;
            } else {
                i11 = 268435456;
            }
            i20 |= i11;
        }
        if ((306783379 & i20) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i20 & 1, z3)) {
            eu3 g = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new rg8(5);
                rv4Var.o0(P);
            }
            eu3 a2 = g.a(zt3.t((xt4) P));
            lz3 i21 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new rg8(6);
                rv4Var.o0(P2);
            }
            rte.c(z2, nq7Var, a2, i21.a(zt3.x((xt4) P2)), null, jce.E(-1669359939, new km7(vt4Var4, vt4Var2, i2, i3, xt4Var, i, vt4Var, vt4Var3), rv4Var), rv4Var, (i20 & 14) | 200064 | ((i20 >> 9) & Token.ASSIGN_MOD), 16);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: xo8
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    tye.e(z, i, i2, i3, nq7Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, xt4Var, (rv4) obj, xoe.p(i4 | 1));
                    return pvc.a;
                }
            };
        }
    }

    public static final void f(List list, rh8 rh8Var, nq7 nq7Var, nu4 nu4Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean h;
        int i7;
        rv4Var.g0(-986341378);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var.f(list);
            } else {
                h = rv4Var.h(list);
            }
            if (h) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(rh8Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(nu4Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(xt4Var)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !rv4Var.f(list))) {
                z2 = false;
            } else {
                z2 = true;
            }
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z2 || P == obj) {
                P = yae.z(list);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            bkd r = mwe.r(mwe.r(rh8Var, mwe.g(14, rv4Var)), zbe.j(nae.e, nae.e, nae.e, 80.0f, 7));
            kj6 a2 = mj6.a(0, rv4Var, 0, 3);
            boolean f = rv4Var.f(aw7Var);
            Object P2 = rv4Var.P();
            if (f || P2 == obj) {
                P2 = new a42(aw7Var, null, 4);
                rv4Var.o0(P2);
            }
            vo9 B = vqe.B(a2, r, (nu4) P2, rv4Var, 12);
            bkd r2 = mwe.r(r, zbe.j(16.0f, nae.e, 16.0f, nae.e, 10));
            bkd r3 = mwe.r(r, zbe.j(nae.e, nae.e, 4.0f, nae.e, 11));
            hz hzVar = new hz(4.0f, true, new vs(2));
            boolean f2 = rv4Var.f(aw7Var) | rv4Var.f(B);
            if ((i2 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = f2 | z3;
            if ((57344 & i2) == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z6 = z5 | z4;
            Object P3 = rv4Var.P();
            if (z6 || P3 == obj) {
                P3 = new aob(aw7Var, B, nu4Var, xt4Var);
                rv4Var.o0(P3);
            }
            pc2.c(nq7Var, a2, r2, hzVar, null, null, false, r3, 0L, 0L, nae.e, (xt4) P3, rv4Var, ((i2 >> 6) & 14) | 24576, 0, 3816);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ud1((Object) list, (Object) rh8Var, nq7Var, (hu4) nu4Var, xt4Var, i, 14);
        }
    }

    public static final void g(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var) {
        int i2;
        int i3;
        boolean z;
        nq7 nq7Var2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-58720256);
        if (rv4Var.f(nq7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (rv4Var2.h(vt4Var)) {
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
            nq7 y = zbe.y(nq7Var, 24.0f);
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
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
            cvb.c(yqe.A((y3b) o3b.T.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.f, rv4Var2, 0, 0, 130046);
            rv4Var2 = rv4Var2;
            xbe.i(rv4Var2, pna.h(kq7.a, 24.0f));
            nq7Var2 = nq7Var;
            z1d.f(rp5.c((wk3) jk3.a.getValue(), rv4Var2, 0), yqe.A((y3b) v1b.f.getValue(), rv4Var2), false, null, null, null, null, null, vt4Var, rv4Var2, (i5 << 21) & 234881024, 252);
            rv4Var2.q(true);
        } else {
            nq7Var2 = nq7Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new u81(nq7Var2, vt4Var, i, 15);
        }
    }

    public static final void h(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        pb2 pb2Var;
        boolean z2;
        String str;
        aw7 aw7Var;
        cz7Var.getClass();
        rv4Var.g0(1383915280);
        if (rv4Var.f(cz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                gbc gbcVar = (gbc) ((fdd) voe.z(cm9.a(gbc.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z3 = jsc.z(gbcVar.d, rv4Var);
                Object[] objArr = new Object[0];
                yy9 yy9Var = ho3.g;
                Object P = rv4Var.P();
                Object obj = ax1.a;
                if (P == obj) {
                    P = new qx6(26);
                    rv4Var.o0(P);
                }
                ho3 ho3Var = (ho3) zpe.m(objArr, yy9Var, (vt4) P, rv4Var, 384);
                Object[] objArr2 = new Object[0];
                Object P2 = rv4Var.P();
                if (P2 == obj) {
                    P2 = new a1c(9);
                    rv4Var.o0(P2);
                }
                aw7 aw7Var2 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var, 48);
                Object P3 = rv4Var.P();
                if (P3 == obj) {
                    P3 = yae.z(null);
                    rv4Var.o0(P3);
                }
                aw7 aw7Var3 = (aw7) P3;
                zu8 zu8Var = new zu8(tl1.A("json"));
                Object P4 = rv4Var.P();
                if (P4 == obj) {
                    P4 = new g0c(aw7Var3, 13);
                    rv4Var.o0(P4);
                }
                kd4 v = w92.v(zu8Var, (xt4) P4, rv4Var, 56);
                Object obj2 = (sac) rv4Var.j(uac.a);
                s02 s02Var = gbcVar.e;
                boolean f = rv4Var.f(obj2);
                Object P5 = rv4Var.P();
                if (f || P5 == obj) {
                    P5 = new wa(obj2, (m42) null, 25);
                    rv4Var.o0(P5);
                }
                jye.b(s02Var, null, (mu4) P5, rv4Var, 0);
                fxe.h(yqe.A((y3b) f3b.Z.getValue(), rv4Var), pna.c, false, jce.E(-1083659636, new ri9(cz7Var, 29), rv4Var), jce.E(1007625589, new ob9(aw7Var2, gbcVar, v, 5), rv4Var), jce.E(706748817, new t81(12, z3, ho3Var), rv4Var), jce.E(1031168539, new cs1(23, ho3Var, gbcVar, z3), rv4Var), rv4Var, 1797168, 4);
                boolean f2 = rv4Var.f(gbcVar);
                Object P6 = rv4Var.P();
                if (f2 || P6 == obj) {
                    P6 = new zd1(gbcVar, 12);
                    rv4Var.o0(P6);
                }
                sxd.a(ho3Var, (nu4) P6, rv4Var, 0);
                if (((f76) aw7Var3.getValue()) != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                f76 f76Var = (f76) aw7Var3.getValue();
                if (f76Var != null) {
                    str = f76Var.getName();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                Object P7 = rv4Var.P();
                if (P7 == obj) {
                    aw7Var = aw7Var3;
                    P7 = new g0c(aw7Var, 14);
                    rv4Var.o0(P7);
                } else {
                    aw7Var = aw7Var3;
                }
                xt4 xt4Var = (xt4) P7;
                boolean f3 = rv4Var.f(gbcVar);
                Object P8 = rv4Var.P();
                if (f3 || P8 == obj) {
                    P8 = new t3c(3, aw7Var, gbcVar);
                    rv4Var.o0(P8);
                }
                rae.b(z2, str2, null, xt4Var, (xt4) P8, rv4Var, 3072);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ebc(cz7Var, i, 0);
        }
    }

    public static final String i(y22 y22Var) {
        y22Var.getClass();
        if (y22Var.equals(x22.d)) {
            return "FillWidth";
        }
        if (y22Var.equals(x22.c)) {
            return "FillHeight";
        }
        if (y22Var.equals(x22.g)) {
            return "FillBounds";
        }
        if (y22Var.equals(x22.b)) {
            return "Fit";
        }
        if (y22Var.equals(x22.a)) {
            return "Crop";
        }
        if (y22Var.equals(x22.e)) {
            return "Inside";
        }
        if (y22Var.equals(x22.f)) {
            return "None";
        }
        return "Unknown ContentScaleCompat: " + y22Var;
    }

    public static final fvb j(u7a u7aVar) {
        xt4 xt4Var;
        ArrayList arrayList = new ArrayList();
        Object g = u7aVar.a.g(s7a.a);
        if (g == null) {
            g = null;
        }
        g4 g4Var = (g4) g;
        if (g4Var == null || (xt4Var = (xt4) g4Var.b) == null || !((Boolean) xt4Var.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (fvb) arrayList.get(0);
    }

    public static boolean k(StringBuilder sb) {
        sb.getClass();
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ') {
            return true;
        }
        return false;
    }

    public static final nq7 l(nq7 nq7Var, xt4 xt4Var) {
        return nq7Var.a0(new k86(xt4Var, null));
    }

    public static final nq7 m(nq7 nq7Var, xt4 xt4Var) {
        return nq7Var.a0(new k86(null, xt4Var));
    }

    public static final btd n(qw6 qw6Var, rv4 rv4Var, int i) {
        if ((i & 1) != 0) {
            qw6Var = kwe.L(0, 7, rv4Var);
        }
        boolean f = rv4Var.f(qw6Var);
        Object P = rv4Var.P();
        if (f || P == ax1.a) {
            P = new btd(qw6Var);
            rv4Var.o0(P);
        }
        return (btd) P;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [zl9, java.lang.Object] */
    public static final Object o(hn4 hn4Var, int i, xt4 xt4Var) {
        int i2;
        int i3;
        Object obj;
        hn4 hn4Var2;
        eh6 L1;
        int e;
        kn knVar;
        if (!hn4Var.a.J) {
            lv5.c("visitAncestors called on an unattached node");
        }
        mq7 mq7Var = hn4Var.a.e;
        od6 v = voe.v(hn4Var);
        loop0: while (true) {
            i2 = 0;
            i3 = 1;
            obj = null;
            if (v != null) {
                if ((((mq7) v.c0.C).d & 1024) != 0) {
                    while (mq7Var != null) {
                        if ((mq7Var.c & 1024) != 0) {
                            hn4Var2 = mq7Var;
                            gw7 gw7Var = null;
                            while (hn4Var2 != null) {
                                if (hn4Var2 instanceof hn4) {
                                    break loop0;
                                }
                                if ((hn4Var2.c & 1024) != 0 && (hn4Var2 instanceof m03)) {
                                    int i4 = 0;
                                    for (mq7 mq7Var2 = ((m03) hn4Var2).L; mq7Var2 != null; mq7Var2 = mq7Var2.f) {
                                        if ((mq7Var2.c & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                hn4Var2 = mq7Var2;
                                            } else {
                                                if (gw7Var == null) {
                                                    gw7Var = new gw7(new mq7[16], 0);
                                                }
                                                if (hn4Var2 != null) {
                                                    gw7Var.b(hn4Var2);
                                                    hn4Var2 = null;
                                                }
                                                gw7Var.b(mq7Var2);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                hn4Var2 = voe.h(gw7Var);
                            }
                            continue;
                        }
                        mq7Var = mq7Var.e;
                    }
                }
                v = v.v();
                if (v != null && (knVar = v.c0) != null) {
                    mq7Var = (hkb) knVar.f;
                } else {
                    mq7Var = null;
                }
            } else {
                hn4Var2 = null;
                break;
            }
        }
        hn4 hn4Var3 = hn4Var2;
        if ((hn4Var3 == null || !c16.i(hn4Var3.L1(), hn4Var.L1())) && (L1 = hn4Var.L1()) != null) {
            int i5 = 5;
            if (i != 5) {
                i5 = 6;
                if (i != 6) {
                    i5 = 3;
                    if (i != 3) {
                        i5 = 4;
                        if (i != 4) {
                            if (i == 1) {
                                i3 = 2;
                            } else if (i != 2) {
                                vs.k("Unsupported direction for beyond bounds layout");
                            }
                            if (L1.K.a() <= 0 && L1.K.d() && L1.J) {
                                boolean I1 = L1.I1(i3);
                                fh6 fh6Var = L1.K;
                                if (I1) {
                                    e = fh6Var.b();
                                } else {
                                    e = fh6Var.e();
                                }
                                ?? obj2 = new Object();
                                mce mceVar = L1.L;
                                mceVar.getClass();
                                ah6 ah6Var = new ah6(e, e);
                                ((gw7) mceVar.a).b(ah6Var);
                                obj2.a = ah6Var;
                                int c = L1.K.c() * 2;
                                int a2 = L1.K.a();
                                if (c > a2) {
                                    c = a2;
                                }
                                while (obj == null && L1.H1((ah6) obj2.a, i3) && i2 < c) {
                                    ah6 ah6Var2 = (ah6) obj2.a;
                                    int i6 = ah6Var2.a;
                                    int i7 = ah6Var2.b;
                                    if (L1.I1(i3)) {
                                        i7++;
                                    } else {
                                        i6--;
                                    }
                                    mce mceVar2 = L1.L;
                                    mceVar2.getClass();
                                    ah6 ah6Var3 = new ah6(i6, i7);
                                    ((gw7) mceVar2.a).b(ah6Var3);
                                    ((gw7) L1.L.a).j((ah6) obj2.a);
                                    obj2.a = ah6Var3;
                                    i2++;
                                    voe.v(L1).l();
                                    obj = xt4Var.invoke(new dh6(L1, obj2, i3));
                                }
                                ((gw7) L1.L.a).j((ah6) obj2.a);
                                voe.v(L1).l();
                                return obj;
                            }
                            return xt4Var.invoke(eh6.O);
                        }
                    }
                }
            }
            i3 = i5;
            if (L1.K.a() <= 0) {
            }
            return xt4Var.invoke(eh6.O);
        }
        return null;
    }

    public static final kp p(qp qpVar, int i) {
        Object obj;
        Iterator<T> it = qpVar.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((od6) ((Map.Entry) obj).getKey()).b == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (kp) entry.getValue();
    }

    public static final String q(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
