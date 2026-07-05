package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rgc  reason: default package */
/* loaded from: classes3.dex */
public abstract class rgc {
    public static final jva a;
    public static final iva b;
    public static final List c;

    static {
        jva jvaVar = new jva(4294961979L);
        a = jvaVar;
        iva ivaVar = new iva(4278190080L);
        b = ivaVar;
        c = tl1.B(hva.a, ova.a, rva.a, qva.a, jvaVar, ivaVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
        if (r4 == defpackage.ax1.a) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.bzc r30, long r31, boolean r33, defpackage.nq7 r34, java.lang.String r35, defpackage.rv4 r36, int r37) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgc.a(bzc, long, boolean, nq7, java.lang.String, rv4, int):void");
    }

    public static final void b(final long j, final long j2, final vt4 vt4Var, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        boolean z;
        long j3;
        long j4;
        rv4Var.g0(736940493);
        if (rv4Var.e(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (rv4Var.e(j2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            nq7 n = pna.n(kq7.a, 32.0f);
            su9 su9Var = uu9.a;
            nq7 k = tte.k(n, su9Var);
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = new a3c(14, vt4Var);
                rv4Var.o0(P);
            }
            nq7 y = zbe.y(lbe.f(15, (vt4) P, k, null, false), 6.0f);
            if (j == 16) {
                rv4Var.e0(-1678223798);
                j3 = ((h27) rv4Var.j(j27.a)).a.q;
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1678144252);
                rv4Var.q(false);
                j3 = j;
            }
            nq7 d = st0.d(y, 2.0f, j3, su9Var);
            if (j2 == 16) {
                rv4Var.e0(-1677958996);
                j4 = ((h27) rv4Var.j(j27.a)).a.p;
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1677881186);
                rv4Var.q(false);
                j4 = j2;
            }
            fu0.a(nmd.v(d, j4, su9Var), rv4Var, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4(j, j2, vt4Var, i) { // from class: pgc
                public final /* synthetic */ long a;
                public final /* synthetic */ long b;
                public final /* synthetic */ vt4 c;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(385);
                    rgc.b(this.a, this.b, this.c, (rv4) obj, p);
                    return pvc.a;
                }
            };
        }
    }

    public static final void c(k81 k81Var, xl0 xl0Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        kq7 kq7Var;
        k81Var.getClass();
        xl0Var.getClass();
        rv4Var.g0(1618611300);
        if (rv4Var.f(k81Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var.f(xl0Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3 | 384;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            kq7 kq7Var2 = kq7.a;
            nq7 A = zbe.A(nmd.v(pna.f(kq7Var2, 1.0f), rm1.g(((h27) rv4Var.j(j27.a)).a, 2.0f), lre.g), 12.0f, nae.e, 2);
            b37 d = fu0.d(kh5.a, false);
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
            jce.F(qw1.f, rv4Var, d);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            npe.a(k81Var, xl0Var, zbe.A(kq7Var2, nae.e, 2.0f, 1), rv4Var, (i5 & Token.ASSIGN_MOD) | (i5 & 14) | 384);
            rv4Var.q(true);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new vg7(k81Var, xl0Var, kq7Var, i, 25);
        }
    }

    public static final void d(nq7 nq7Var, tu1 tu1Var, rv4 rv4Var, int i) {
        boolean z;
        rv4Var.g0(626671014);
        int i2 = i | 6;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            kq7 kq7Var = kq7.a;
            nq7 A = zbe.A(nmd.v(pna.f(kq7Var, 1.0f), rm1.g(((h27) rv4Var.j(j27.a)).a, 2.0f), lre.g), 12.0f, nae.e, 2);
            b37 d = fu0.d(kh5.a, false);
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
            jce.F(qw1.f, rv4Var, d);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            tu1Var.invoke(rv4Var, 6);
            rv4Var.q(true);
            nq7Var = kq7Var;
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new a62(nq7Var, tu1Var, i, 7);
        }
    }

    public static final void e(nq7 nq7Var, final float f, final tu1 tu1Var, rv4 rv4Var, final int i, final int i2) {
        kq7 kq7Var;
        int i3;
        int i4;
        boolean z;
        final nq7 nq7Var2;
        int i5;
        int i6;
        rv4Var.g0(-402166041);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            kq7Var = nq7Var;
        } else if ((i & 6) == 0) {
            kq7Var = nq7Var;
            if (rv4Var.f(kq7Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            kq7Var = nq7Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.c(f)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(tu1Var)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i3 |= i5;
        }
        if ((i3 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            kq7 kq7Var2 = kq7.a;
            if (i7 != 0) {
                kq7Var = kq7Var2;
            }
            nq7 C = zbe.C(pna.f(kq7Var, 1.0f), nae.e, nae.e, nae.e, 14.0f, 7);
            lk0 lk0Var = kh5.I;
            ez ezVar = lz.c;
            xn1 a2 = wn1.a(ezVar, lk0Var, rv4Var, 0);
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
            nq7 nq7Var3 = kq7Var;
            int i8 = i3;
            nq7 C2 = zbe.C(zbe.A(nmd.v(tte.k(pna.f(kq7Var2, 1.0f), uu9.b(3)), rm1.g(((h27) rv4Var.j(j27.a)).a, 2.0f), lre.g), 12.0f, nae.e, 2), nae.e, nae.e, nae.e, 12.0f, 7);
            xn1 a3 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, C2);
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
            xbe.i(rv4Var, pna.h(kq7Var2, f));
            tu1Var.invoke(rv4Var, Integer.valueOf((i8 >> 6) & 14));
            rv4Var.q(true);
            rv4Var.q(true);
            nq7Var2 = nq7Var3;
        } else {
            rv4Var.X();
            nq7Var2 = kq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: ogc
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rgc.e(nq7.this, f, tu1Var, (rv4) obj, xoe.p(i | 1), i2);
                    return pvc.a;
                }
            };
        }
    }

    public static final void f(nq7 nq7Var, float f, lu4 lu4Var, tu1 tu1Var, rv4 rv4Var, int i) {
        boolean z;
        tu1 tu1Var2;
        kq7 kq7Var;
        int i2;
        rv4Var.g0(-622534760);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            if (rv4Var.c(f)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i3 |= i2;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            kq7 kq7Var2 = kq7.a;
            nq7 C = zbe.C(zbe.A(nmd.v(tte.k(pna.f(kq7Var2, 1.0f), uu9.b(12)), rm1.g(((h27) rv4Var.j(j27.a)).a, 2.0f), lre.g), 12.0f, nae.e, 2), nae.e, 12.0f, nae.e, nae.e, 13);
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
            tu1Var2 = tu1Var;
            tu1Var2.invoke(rv4Var, 6);
            lu4Var.invoke(rv4Var, 6);
            hl5.w(kq7Var2, f, rv4Var, true);
            kq7Var = kq7Var2;
        } else {
            tu1Var2 = tu1Var;
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new om7(kq7Var, f, lu4Var, tu1Var2, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r3 == defpackage.ax1.a) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(defpackage.f33 r34, defpackage.nq7 r35, defpackage.rv4 r36, int r37) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgc.g(f33, nq7, rv4, int):void");
    }

    public static final void h(e33 e33Var, String str, int i, nq7 nq7Var, vt4 vt4Var, xt4 xt4Var, vt4 vt4Var2, vt4 vt4Var3, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        kq7 kq7Var;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        long j = e33Var.i;
        String str2 = e33Var.c.a;
        long j2 = e33Var.a;
        rv4Var.g0(-2019022148);
        if (rv4Var.h(e33Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i2 | i3;
        if (rv4Var.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i10 = i9 | i4;
        if (rv4Var.d(i)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i11 = i10 | i5 | 3072;
        if (rv4Var.h(vt4Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i12 = i11 | i6;
        if (rv4Var.h(vt4Var2)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i13 = i12 | i7;
        if (rv4Var.h(vt4Var3)) {
            i8 = 8388608;
        } else {
            i8 = 4194304;
        }
        int i14 = i13 | i8;
        boolean z7 = false;
        if ((4793491 & i14) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i14 & 1, z)) {
            boolean e = rv4Var.e(j2);
            int i15 = i14 & Token.ASSIGN_MOD;
            if (i15 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z8 = e | z2;
            if ((i14 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z9 = z3 | z8;
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z9 || P == lh9Var) {
                if (i == 3) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((!c16.i(str2, str) && !z4) || (!z4 && by5.a.k().b() - j >= 720000)) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                P = Boolean.valueOf(z5);
                rv4Var.o0(P);
            }
            boolean booleanValue = ((Boolean) P).booleanValue();
            boolean e2 = rv4Var.e(j2);
            if (i15 == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z10 = e2 | z6;
            Object P2 = rv4Var.P();
            if (z10 || P2 == lh9Var) {
                if (c16.i(str2, str) && by5.a.k().b() - j < 720000) {
                    z7 = true;
                }
                P2 = Boolean.valueOf(z7);
                rv4Var.o0(P2);
            }
            tu1 E = jce.E(652035746, new ih7(e33Var, vt4Var, ((Boolean) P2).booleanValue(), booleanValue, xt4Var, vt4Var2, vt4Var3), rv4Var);
            kq7 kq7Var2 = kq7.a;
            e(kq7Var2, 12.0f, E, rv4Var, 438, 0);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new i81(e33Var, str, i, kq7Var, vt4Var, xt4Var, vt4Var2, vt4Var3, i2);
        }
    }

    public static final void i(final String str, final String str2, final z86 z86Var, final h81 h81Var, final boolean z, final boolean z2, final f33 f33Var, final List list, final nq7 nq7Var, String str3, boolean z3, final xt4 xt4Var, final vt4 vt4Var, final vt4 vt4Var2, final xt4 xt4Var2, final xt4 xt4Var3, final xt4 xt4Var4, vt4 vt4Var3, final vt4 vt4Var4, rv4 rv4Var, final int i, final int i2, final int i3) {
        Object obj;
        int i4;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z4;
        Object obj5;
        boolean z5;
        int i5;
        final vt4 vt4Var5;
        final String str4;
        final vt4 vt4Var6;
        String str5;
        z86Var.getClass();
        h81Var.getClass();
        list.getClass();
        rv4Var.g0(1337576020);
        if ((i & 6) == 0) {
            obj = str;
            i4 = (rv4Var.f(obj) ? 4 : 2) | i;
        } else {
            obj = str;
            i4 = i;
        }
        if ((i & 48) == 0) {
            obj2 = str2;
            i4 |= rv4Var.f(obj2) ? 32 : 16;
        } else {
            obj2 = str2;
        }
        if ((i & 384) == 0) {
            obj3 = z86Var;
            i4 |= rv4Var.f(obj3) ? 256 : Token.CASE;
        } else {
            obj3 = z86Var;
        }
        if ((i & 3072) == 0) {
            obj4 = h81Var;
            i4 |= rv4Var.f(obj4) ? 2048 : 1024;
        } else {
            obj4 = h81Var;
        }
        if ((i & 24576) == 0) {
            z4 = z;
            i4 |= rv4Var.g(z4) ? 16384 : 8192;
        } else {
            z4 = z;
        }
        int i6 = i & 196608;
        int i7 = Parser.ARGC_LIMIT;
        if (i6 == 0) {
            i4 |= rv4Var.g(z2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= (i & 2097152) == 0 ? rv4Var.f(f33Var) : rv4Var.h(f33Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= (i & 16777216) == 0 ? rv4Var.f(list) : rv4Var.h(list) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= rv4Var.f(nq7Var) ? 67108864 : 33554432;
        }
        int i8 = i3 & 512;
        if (i8 != 0) {
            i4 |= 805306368;
            obj5 = str3;
        } else {
            obj5 = str3;
            if ((i & 805306368) == 0) {
                i4 |= rv4Var.f(obj5) ? 536870912 : 268435456;
            }
        }
        int i9 = i4;
        int i10 = i3 & 1024;
        if (i10 != 0) {
            i5 = i2 | 6;
            z5 = z3;
        } else {
            z5 = z3;
            if ((i2 & 6) == 0) {
                i5 = i2 | (rv4Var.g(z5) ? 4 : 2);
            } else {
                i5 = i2;
            }
        }
        if ((i2 & 48) == 0) {
            i5 |= rv4Var.h(xt4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= rv4Var.h(vt4Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i5 |= rv4Var.h(vt4Var2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= rv4Var.h(xt4Var2) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            if (rv4Var.h(xt4Var3)) {
                i7 = 131072;
            }
            i5 |= i7;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= rv4Var.h(xt4Var4) ? 1048576 : 524288;
        }
        int i11 = i3 & 131072;
        if (i11 != 0) {
            i5 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i5 |= rv4Var.h(vt4Var3) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= rv4Var.h(vt4Var4) ? 67108864 : 33554432;
        }
        if (rv4Var.U(i9 & 1, ((i9 & 306783379) == 306783378 && (i5 & 38347923) == 38347922) ? false : true)) {
            String str6 = i8 != 0 ? null : obj5;
            final boolean z6 = i10 != 0 ? false : z5;
            lh9 lh9Var = ax1.a;
            if (i11 != 0) {
                Object P = rv4Var.P();
                if (P == lh9Var) {
                    P = new a1c(12);
                    rv4Var.o0(P);
                }
                vt4Var6 = (vt4) P;
            } else {
                vt4Var6 = vt4Var3;
            }
            if (str6 == null) {
                rv4Var.e0(1215356362);
                str5 = yqe.A((y3b) k2b.h0.getValue(), rv4Var);
                rv4Var.q(false);
            } else {
                rv4Var.e0(1215356114);
                rv4Var.q(false);
                str5 = str6;
            }
            Boolean valueOf = Boolean.valueOf(z4);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new txb(14);
                rv4Var.o0(P2);
            }
            final String str7 = obj;
            final h81 h81Var2 = obj4;
            final z86 z86Var2 = obj3;
            final String str8 = str5;
            final String str9 = obj2;
            z5 = z6;
            b16.c(valueOf, nq7Var, (xt4) P2, null, "reply_composer_state", null, jce.E(2007162583, new nu4() { // from class: kgc
                @Override // defpackage.nu4
                public final Object h(Object obj6, Object obj7, Object obj8, Object obj9) {
                    boolean z7;
                    boolean z8;
                    int i12;
                    boolean booleanValue = ((Boolean) obj7).booleanValue();
                    rv4 rv4Var2 = (rv4) obj8;
                    int intValue = ((Integer) obj9).intValue();
                    ((wq) obj6).getClass();
                    if ((intValue & 48) == 0) {
                        if (rv4Var2.g(booleanValue)) {
                            i12 = 32;
                        } else {
                            i12 = 16;
                        }
                        intValue |= i12;
                    }
                    if ((intValue & Token.TARGET) != 144) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z7)) {
                        String str10 = str7;
                        String str11 = str9;
                        String str12 = str8;
                        xt4 xt4Var5 = xt4Var;
                        Object obj10 = ax1.a;
                        if (!booleanValue) {
                            rv4Var2.e0(845930160);
                            kq7 kq7Var = kq7.a;
                            nq7 x = mwe.x(kq7Var, 14);
                            su9 su9Var = uu9.a;
                            nq7 k = tte.k(st0.s(x, 10.0f, su9Var, 28), su9Var);
                            long b2 = zl1.b(0.98f, r0f.y(rv4Var2).p);
                            ba5 ba5Var = lre.g;
                            nq7 z9 = zbe.z(st0.d(nmd.v(k, b2, ba5Var), 1.0f, zl1.b(0.08f, r0f.y(rv4Var2).a), su9Var), 12.0f, 10.0f);
                            mk0 mk0Var = kh5.G;
                            dz dzVar = lz.a;
                            gv9 a2 = ev9.a(dzVar, mk0Var, rv4Var2, 48);
                            int hashCode = Long.hashCode(rv4Var2.T);
                            xt8 l = rv4Var2.l();
                            nq7 p = lye.p(rv4Var2, z9);
                            rw1.k.getClass();
                            vt4 vt4Var7 = qw1.b;
                            rv4Var2.i0();
                            if (rv4Var2.S) {
                                rv4Var2.k(vt4Var7);
                            } else {
                                rv4Var2.r0();
                            }
                            np npVar = qw1.f;
                            jce.F(npVar, rv4Var2, a2);
                            np npVar2 = qw1.e;
                            jce.F(npVar2, rv4Var2, l);
                            Integer valueOf2 = Integer.valueOf(hashCode);
                            np npVar3 = qw1.g;
                            jce.F(npVar3, rv4Var2, valueOf2);
                            kg kgVar = qw1.h;
                            jce.C(kgVar, rv4Var2);
                            np npVar4 = qw1.d;
                            jce.F(npVar4, rv4Var2, p);
                            ape.o(str10, str11, pna.n(kq7Var, 34.0f), null, rv4Var2, 384, 8);
                            nq7 v = nmd.v(tte.k(rs8.d(kq7Var, 10.0f, rv4Var2, 1.0f, true), su9Var), zl1.b(0.06f, r0f.y(rv4Var2).a), ba5Var);
                            boolean f = rv4Var2.f(xt4Var5);
                            Object P3 = rv4Var2.P();
                            if (!f && P3 != obj10) {
                                z8 = false;
                            } else {
                                z8 = false;
                                P3 = new ngc(0, xt4Var5);
                                rv4Var2.o0(P3);
                            }
                            nq7 z10 = zbe.z(lbe.f(15, (vt4) P3, v, null, z8), 16.0f, 12.0f);
                            gv9 a3 = ev9.a(dzVar, mk0Var, rv4Var2, 48);
                            int hashCode2 = Long.hashCode(rv4Var2.T);
                            xt8 l2 = rv4Var2.l();
                            nq7 p2 = lye.p(rv4Var2, z10);
                            rv4Var2.i0();
                            if (rv4Var2.S) {
                                rv4Var2.k(vt4Var7);
                            } else {
                                rv4Var2.r0();
                            }
                            jce.F(npVar, rv4Var2, a3);
                            jce.F(npVar2, rv4Var2, l2);
                            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
                            jce.F(npVar4, rv4Var2, p2);
                            cvb.c(str12, null, r0f.y(rv4Var2).s, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, r0f.A(rv4Var2).k, rv4Var2, 0, 24576, 114682);
                            s21.x(rv4Var2, true, kq7Var, 10.0f, rv4Var2);
                            ar5 c2 = rp5.c((wk3) ok3.n0.getValue(), rv4Var2, 0);
                            long j = r0f.y(rv4Var2).b;
                            nq7 a0 = pna.n(kq7Var, 40.0f).a0(new k5d(kh5.H));
                            abf abfVar = f27.a;
                            nq7 t = tte.t(tte.k(a0, aye.s(abf.s(), rv4Var2)), -35.0f);
                            boolean f2 = rv4Var2.f(xt4Var5);
                            Object P4 = rv4Var2.P();
                            if (f2 || P4 == obj10) {
                                P4 = new ngc(1, xt4Var5);
                                rv4Var2.o0(P4);
                            }
                            nk5.a(c2, null, zbe.C(nmd.v(lbe.f(15, (vt4) P4, t, null, false), r0f.y(rv4Var2).a, ba5Var), 6.0f, nae.e, 2.0f, nae.e, 10), j, rv4Var2, 48, 0);
                            rv4Var2.q(true);
                            rv4Var2.q(false);
                        } else {
                            rv4Var2.e0(848263654);
                            boolean f3 = rv4Var2.f(xt4Var5);
                            Object P5 = rv4Var2.P();
                            if (f3 || P5 == obj10) {
                                P5 = new ngc(2, xt4Var5);
                                rv4Var2.o0(P5);
                            }
                            rgc.r(str10, str11, z86Var2, h81Var2, f33Var, list, null, str12, z2, z6, (vt4) P5, vt4Var, vt4Var2, xt4Var2, xt4Var3, xt4Var4, vt4Var6, vt4Var4, rv4Var2, 32768);
                            rv4Var2.q(false);
                        }
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, ((i9 >> 12) & 14) | 1597824 | ((i9 >> 21) & Token.ASSIGN_MOD), 40);
            str4 = str6;
            vt4Var5 = vt4Var6;
        } else {
            rv4Var.X();
            vt4Var5 = vt4Var3;
            str4 = obj5;
        }
        final boolean z7 = z5;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: ggc
                @Override // defpackage.lu4
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    int p = xoe.p(i | 1);
                    int p2 = xoe.p(i2);
                    rgc.i(str, str2, z86Var, h81Var, z, z2, f33Var, list, nq7Var, str4, z7, xt4Var, vt4Var, vt4Var2, xt4Var2, xt4Var3, xt4Var4, vt4Var5, vt4Var4, (rv4) obj6, p, p2, i3);
                    return pvc.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v26 */
    public static final void j(final yya yyaVar, final yt2 yt2Var, final uo3 uo3Var, final z86 z86Var, final List list, nq7 nq7Var, final boolean z, final boolean z2, final vt4 vt4Var, xt4 xt4Var, final vt4 vt4Var2, final xt4 xt4Var2, final vt4 vt4Var3, final xt4 xt4Var3, final vt4 vt4Var4, rv4 rv4Var, final int i) {
        int i2;
        char c2;
        char c3;
        boolean z3;
        xt4 xt4Var4;
        final kq7 kq7Var;
        hn0 hn0Var;
        aw7 aw7Var;
        wk3 wk3Var;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        yt2 yt2Var2;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        np npVar;
        aw7 aw7Var2;
        long j;
        aw7 aw7Var3;
        boolean z17;
        boolean z18;
        aw7 aw7Var4;
        aw7 aw7Var5;
        boolean z19;
        boolean z20;
        boolean z21;
        kq7 kq7Var2;
        long j2;
        kq7 kq7Var3;
        aw7 aw7Var6;
        float f;
        Object obj;
        long j3;
        aw7 aw7Var7;
        rv4 rv4Var2;
        rv4 rv4Var3;
        Object obj2;
        boolean z22;
        aw7 aw7Var8;
        boolean z23;
        boolean z24;
        boolean z25;
        aw7 aw7Var9;
        int i3;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        xl0 c4;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean h;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ba5 ba5Var = lre.g;
        rv4Var.g0(-693222901);
        if ((i & 6) == 0) {
            if (rv4Var.f(yyaVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i2 = i | i12;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(yt2Var)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(uo3Var)) {
                i10 = 256;
            } else {
                i10 = Token.CASE;
            }
            i2 |= i10;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(z86Var)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i2 |= i9;
        }
        char c5 = 8192;
        if ((i & 24576) == 0) {
            if ((32768 & i) == 0) {
                h = rv4Var.f(list);
            } else {
                h = rv4Var.h(list);
            }
            if (h) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i2 |= i8;
        }
        int i13 = i2 | 196608;
        if ((i & 1572864) == 0) {
            if (rv4Var.g(z)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i13 |= i7;
        }
        if ((i & 12582912) == 0) {
            if (rv4Var.g(z2)) {
                i6 = 8388608;
            } else {
                i6 = 4194304;
            }
            i13 |= i6;
        }
        if ((i & 100663296) == 0) {
            if (rv4Var.h(vt4Var)) {
                i5 = 67108864;
            } else {
                i5 = 33554432;
            }
            i13 |= i5;
        }
        if ((i & 805306368) == 0) {
            if (rv4Var.h(xt4Var)) {
                i4 = 536870912;
            } else {
                i4 = 268435456;
            }
            i13 |= i4;
        }
        if (rv4Var.h(vt4Var2)) {
            c2 = 4;
        } else {
            c2 = 2;
        }
        if (rv4Var.h(xt4Var2)) {
            c3 = ' ';
        } else {
            c3 = 16;
        }
        int i14 = c2 | c3;
        if (rv4Var.h(vt4Var4)) {
            c5 = 16384;
        }
        int i15 = i14 | c5;
        if ((i13 & 306783379) == 306783378 && (i15 & 8211) == 8210) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (rv4Var.U(i13 & 1, z3)) {
            ar4 ar4Var = (ar4) yyaVar.getValue();
            String str = ar4Var.c;
            if (str != null && (c4 = uo3Var.e().c(str)) != null) {
                hn0Var = c4.b;
            } else {
                hn0Var = null;
            }
            boolean z31 = hn0Var instanceof cn0;
            Object P = rv4Var.P();
            Object obj3 = ax1.a;
            if (P == obj3) {
                P = yae.z(Boolean.FALSE);
                rv4Var.o0(P);
            }
            aw7 aw7Var10 = (aw7) P;
            Object P2 = rv4Var.P();
            if (P2 == obj3) {
                P2 = yae.z(Boolean.FALSE);
                rv4Var.o0(P2);
            }
            aw7 aw7Var11 = (aw7) P2;
            Object P3 = rv4Var.P();
            if (P3 == obj3) {
                int i16 = zl1.j;
                aw7Var = aw7Var10;
                P3 = yae.z(new zl1(zl1.i));
                rv4Var.o0(P3);
            } else {
                aw7Var = aw7Var10;
            }
            aw7 aw7Var12 = (aw7) P3;
            Object P4 = rv4Var.P();
            if (P4 == obj3) {
                int i17 = zl1.j;
                P4 = yae.z(new zl1(zl1.i));
                rv4Var.o0(P4);
            }
            aw7 aw7Var13 = (aw7) P4;
            kq7 kq7Var4 = kq7.a;
            nq7 C = zbe.C(kq7Var4, nae.e, 10.0f, nae.e, nae.e, 13);
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
            np npVar2 = qw1.f;
            jce.F(npVar2, rv4Var, a2);
            np npVar3 = qw1.e;
            jce.F(npVar3, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar4 = qw1.g;
            jce.F(npVar4, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar5 = qw1.d;
            jce.F(npVar5, rv4Var, p);
            nq7 f2 = pna.f(kq7Var4, 1.0f);
            mk0 mk0Var = kh5.G;
            gv9 a3 = ev9.a(lz.a, mk0Var, rv4Var, 48);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, f2);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar2, rv4Var, a3);
            jce.F(npVar3, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar4, rv4Var, kgVar);
            nq7 z32 = zbe.z(rte.q(a82.g(rv4Var, 7.0f, tte.k(s21.f(rv4Var, p2, npVar5, 1.0f, true), r0f.z(rv4Var).d), ba5Var), rte.u(rv4Var), 14), 8.0f, 6.0f);
            gv9 a4 = ev9.a(new hz(4.0f, true, new vs(2)), mk0Var, rv4Var, 54);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, z32);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar2, rv4Var, a4);
            jce.F(npVar3, rv4Var, l3);
            s21.t(hashCode3, rv4Var, npVar4, rv4Var, kgVar);
            jce.F(npVar5, rv4Var, p3);
            n(rp5.c((wk3) ok3.o.getValue(), rv4Var, 0), false, false, vt4Var, rv4Var, (i13 >> 15) & 7168, 6);
            q(0, rv4Var);
            if (z86Var.e()) {
                wk3Var = (wk3) ok3.y.getValue();
            } else {
                wk3Var = (wk3) ok3.o0.getValue();
            }
            ar5 c6 = rp5.c(wk3Var, rv4Var, 0);
            boolean e = z86Var.e();
            if ((i13 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i15 & Token.ASSIGN_MOD) == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z33 = z4 | z5;
            if ((i15 & 14) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z34 = z33 | z6;
            Object P5 = rv4Var.P();
            if (z34 || P5 == obj3) {
                P5 = new x8c(1, z86Var, xt4Var2, vt4Var2);
                rv4Var.o0(P5);
            }
            n(c6, e, false, P5, rv4Var, 0, 4);
            q(0, rv4Var);
            ar5 c7 = rp5.c((wk3) jk3.h0.getValue(), rv4Var, 0);
            a6b a5 = ar4Var.a(hva.a);
            a6b a6bVar = a6b.a;
            if (a5 == a6bVar) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z35 = ar4Var.b;
            int i18 = i13 & Token.ASSIGN_MOD;
            if (i18 == 32) {
                z8 = true;
            } else {
                z8 = false;
            }
            Object P6 = rv4Var.P();
            if (!z8 && P6 != obj3) {
                yt2Var2 = yt2Var;
            } else {
                yt2Var2 = yt2Var;
                P6 = new w93(yt2Var2, 7);
                rv4Var.o0(P6);
            }
            n(c7, z7, z35, (vt4) P6, rv4Var, 0, 0);
            ar5 c8 = rp5.c((wk3) jk3.m0.getValue(), rv4Var, 0);
            if (ar4Var.a(ova.a) == a6bVar) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z36 = ar4Var.b;
            if (i18 == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object P7 = rv4Var.P();
            if (z10 || P7 == obj3) {
                P7 = new w93(yt2Var2, 8);
                rv4Var.o0(P7);
            }
            n(c8, z9, z36, (vt4) P7, rv4Var, 0, 0);
            ar5 c9 = rp5.c((wk3) jk3.p0.getValue(), rv4Var, 0);
            if (ar4Var.a(rva.a) == a6bVar) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z37 = ar4Var.b;
            if (i18 == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            Object P8 = rv4Var.P();
            if (z12 || P8 == obj3) {
                P8 = new w93(yt2Var2, 5);
                rv4Var.o0(P8);
            }
            n(c9, z11, z37, (vt4) P8, rv4Var, 0, 0);
            ar5 c10 = rp5.c((wk3) rk3.b.getValue(), rv4Var, 0);
            if (ar4Var.a(qva.a) == a6bVar) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z38 = ar4Var.b;
            if (i18 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            Object P9 = rv4Var.P();
            if (z14 || P9 == obj3) {
                P9 = new w93(yt2Var2, 6);
                rv4Var.o0(P9);
            }
            n(c10, z13, z38, (vt4) P9, rv4Var, 0, 0);
            q(0, rv4Var);
            ar5 c11 = rp5.c((wk3) jk3.l0.getValue(), rv4Var, 0);
            if (ar4Var.c != null) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean f3 = rv4Var.f(ar4Var) | rv4Var.g(z31);
            int i19 = i13;
            if ((i13 & 896) == 256) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z39 = z16 | f3;
            Object P10 = rv4Var.P();
            if (z39 || P10 == obj3) {
                P10 = new as(ar4Var, z31, uo3Var);
                rv4Var.o0(P10);
            }
            n(c11, z31, z15, (vt4) P10, rv4Var, 0, 0);
            q(0, rv4Var);
            long j4 = ((zl1) aw7Var12.getValue()).a;
            Object P11 = rv4Var.P();
            if (P11 == obj3) {
                npVar = npVar4;
                aw7Var2 = aw7Var;
                P11 = new p0c(aw7Var2, 17);
                rv4Var.o0(P11);
            } else {
                npVar = npVar4;
                aw7Var2 = aw7Var;
            }
            o(j4, (vt4) P11, rv4Var, 48);
            long j5 = ((zl1) aw7Var12.getValue()).a;
            long j6 = ((zl1) aw7Var13.getValue()).a;
            Object P12 = rv4Var.P();
            if (P12 == obj3) {
                j = j6;
                aw7Var3 = aw7Var11;
                P12 = new p0c(aw7Var3, 18);
                rv4Var.o0(P12);
            } else {
                j = j6;
                aw7Var3 = aw7Var11;
            }
            b(j5, j, (vt4) P12, rv4Var, 384);
            q(0, rv4Var);
            ar5 c12 = rp5.c((wk3) jk3.i0.getValue(), rv4Var, 0);
            boolean z40 = ar4Var.b;
            if (i18 == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            Object P13 = rv4Var.P();
            if (!z17 && P13 != obj3) {
                z18 = z40;
                aw7Var4 = aw7Var13;
                aw7Var5 = aw7Var12;
                z19 = true;
            } else {
                z18 = z40;
                aw7Var4 = aw7Var13;
                aw7Var5 = aw7Var12;
                z19 = true;
                P13 = new y93(yt2Var2, aw7Var5, aw7Var4, 1);
                rv4Var.o0(P13);
            }
            n(c12, false, z18, (vt4) P13, rv4Var, 0, 2);
            aw7 aw7Var14 = aw7Var5;
            s21.x(rv4Var, z19, kq7Var4, 10.0f, rv4Var);
            nq7 n = pna.n(kq7Var4, 42.0f);
            abf abfVar = f27.a;
            nq7 k = tte.k(n, aye.s(abf.s(), rv4Var));
            aw7 aw7Var15 = aw7Var3;
            if ((i15 & 57344) == 16384) {
                z20 = true;
            } else {
                z20 = false;
            }
            Object P14 = rv4Var.P();
            if (z20 || P14 == obj3) {
                P14 = new a3c(11, vt4Var4);
                rv4Var.o0(P14);
            }
            nq7 f4 = lbe.f(14, (vt4) P14, k, null, z);
            if (z2 || z) {
                z21 = false;
                rv4Var.e0(1452913028);
                kq7Var2 = kq7Var4;
                j2 = r0f.y(rv4Var).a;
                rv4Var.q(false);
            } else {
                rv4Var.e0(1453007950);
                long g = rm1.g(r0f.y(rv4Var), 4.0f);
                z21 = false;
                rv4Var.q(false);
                kq7Var2 = kq7Var4;
                j2 = g;
            }
            nq7 v = nmd.v(f4, j2, ba5Var);
            b37 d = fu0.d(kh5.e, z21);
            int hashCode4 = Long.hashCode(rv4Var.T);
            xt8 l4 = rv4Var.l();
            nq7 p4 = lye.p(rv4Var, v);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar2, rv4Var, d);
            jce.F(npVar3, rv4Var, l4);
            np npVar6 = npVar;
            s21.t(hashCode4, rv4Var, npVar6, rv4Var, kgVar);
            jce.F(npVar5, rv4Var, p4);
            pu0 pu0Var = pu0.a;
            if (z2) {
                rv4Var.e0(623638141);
                kq7Var3 = kq7Var2;
                aw7Var6 = aw7Var2;
                r79.a(pna.n(kq7Var3, 18.0f), r0f.y(rv4Var).b, 2.0f, 0L, 0, nae.e, rv4Var, 390, 56);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
                obj = obj3;
                aw7Var7 = aw7Var4;
            } else {
                kq7Var3 = kq7Var2;
                aw7Var6 = aw7Var2;
                rv4Var.e0(623893922);
                if (z) {
                    f = -35.0f;
                } else {
                    f = nae.e;
                }
                yya b2 = nq.b(f, null, null, rv4Var, 0, 30);
                ar5 c13 = rp5.c((wk3) ok3.n0.getValue(), rv4Var, 0);
                if (z) {
                    rv4Var.e0(624157980);
                    obj = obj3;
                    j3 = r0f.y(rv4Var).b;
                    rv4Var.q(false);
                } else {
                    obj = obj3;
                    rv4Var.e0(624254421);
                    j3 = r0f.y(rv4Var).s;
                    rv4Var.q(false);
                }
                aw7Var7 = aw7Var4;
                nk5.a(c13, null, tte.t(zbe.C(pu0Var.b(), 6.0f, nae.e, 2.0f, nae.e, 10), ((Number) b2.getValue()).floatValue()), j3, rv4Var, 48, 0);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
            rv4Var2.q(true);
            if (!list.isEmpty()) {
                s21.w(rv4Var2, 1478948272, kq7Var3, 10.0f, rv4Var2);
                nq7 q = rte.q(pna.f(kq7Var3, 1.0f), rte.u(rv4Var2), 14);
                gv9 a6 = ev9.a(new hz(8.0f, true, new vs(2)), kh5.F, rv4Var2, 6);
                int hashCode5 = Long.hashCode(rv4Var2.T);
                xt8 l5 = rv4Var2.l();
                nq7 p5 = lye.p(rv4Var2, q);
                rv4Var2.i0();
                if (rv4Var2.S) {
                    rv4Var2.k(zx1Var);
                } else {
                    rv4Var2.r0();
                }
                jce.F(npVar2, rv4Var2, a6);
                jce.F(npVar3, rv4Var2, l5);
                s21.t(hashCode5, rv4Var2, npVar6, rv4Var2, kgVar);
                jce.F(npVar5, rv4Var2, p5);
                rv4Var2.e0(-1051883689);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    f76 f76Var = (f76) it.next();
                    nq7 n2 = pna.n(kq7Var3, 88.0f);
                    tza tzaVar = j27.a;
                    nq7 v2 = nmd.v(tte.k(n2, ((h27) rv4Var2.j(tzaVar)).c.c), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 4.0f), ba5Var);
                    b37 d2 = fu0.d(kh5.a, false);
                    int hashCode6 = Long.hashCode(rv4Var2.T);
                    xt8 l6 = rv4Var2.l();
                    nq7 p6 = lye.p(rv4Var2, v2);
                    rw1.k.getClass();
                    zx1 zx1Var2 = qw1.b;
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var2);
                    } else {
                        rv4Var2.r0();
                    }
                    jce.F(qw1.f, rv4Var2, d2);
                    jce.F(qw1.e, rv4Var2, l6);
                    jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode6));
                    jce.C(qw1.h, rv4Var2);
                    jce.F(qw1.d, rv4Var2, p6);
                    do5.a(f76Var, null, false, null, null, null, tte.k(pna.c, ((h27) rv4Var2.j(tzaVar)).c.c), null, rv4Var2, 0, 894);
                    ar5 c14 = rp5.c((wk3) jk3.w.getValue(), rv4Var2, 0);
                    nq7 v3 = nmd.v(tte.k(pna.n(zbe.y(pu0Var.a(kq7Var3, kh5.c), 6.0f), 24.0f), uu9.a), zl1.b(0.9f, ((h27) rv4Var2.j(tzaVar)).a.p), ba5Var);
                    if ((i19 & 1879048192) == 536870912) {
                        z30 = true;
                    } else {
                        z30 = false;
                    }
                    boolean f5 = z30 | rv4Var2.f(f76Var);
                    Object P15 = rv4Var2.P();
                    Object obj4 = obj;
                    if (f5 || P15 == obj4) {
                        P15 = new a0b(17, xt4Var, f76Var);
                        rv4Var2.o0(P15);
                    }
                    rv4 rv4Var4 = rv4Var2;
                    nk5.a(c14, null, zbe.y(lbe.f(15, (vt4) P15, v3, null, false), 4.0f), 0L, rv4Var4, 48, 8);
                    rv4Var4.q(true);
                    rv4Var2 = rv4Var4;
                    obj = obj4;
                }
                xt4Var4 = xt4Var;
                rv4Var3 = rv4Var2;
                obj2 = obj;
                z22 = true;
                hl5.v(rv4Var3, false, true, false);
            } else {
                xt4Var4 = xt4Var;
                rv4Var3 = rv4Var2;
                obj2 = obj;
                z22 = true;
                rv4Var3.e0(1480502209);
                rv4Var3.q(false);
            }
            rv4Var3.q(z22);
            boolean booleanValue = ((Boolean) aw7Var6.getValue()).booleanValue();
            boolean e2 = rv4Var3.e(((zl1) aw7Var14.getValue()).a);
            Object P16 = rv4Var3.P();
            if (e2 || P16 == obj2) {
                P16 = kve.A(((zl1) aw7Var14.getValue()).a, true, false);
                rv4Var3.o0(P16);
            }
            String str2 = (String) P16;
            Object P17 = rv4Var3.P();
            if (P17 == obj2) {
                aw7Var8 = aw7Var6;
                P17 = new g0c(aw7Var8, 15);
                rv4Var3.o0(P17);
            } else {
                aw7Var8 = aw7Var6;
            }
            xt4 xt4Var5 = (xt4) P17;
            if (i18 == 32) {
                z23 = true;
            } else {
                z23 = false;
            }
            int i20 = i19 & 14;
            if (i20 == 4) {
                z24 = true;
            } else {
                z24 = false;
            }
            boolean z41 = z23 | z24;
            Object P18 = rv4Var3.P();
            if (!z41 && P18 != obj2) {
                z25 = booleanValue;
                aw7Var9 = aw7Var15;
                i3 = 16;
            } else {
                z25 = booleanValue;
                aw7Var9 = aw7Var15;
                i3 = 16;
                v93 v93Var = new v93(yt2Var, yyaVar, aw7Var8, aw7Var14, 2);
                rv4Var3.o0(v93Var);
                P18 = v93Var;
            }
            tc4.h(384, xt4Var5, (xt4) P18, rv4Var3, str2, z25);
            boolean booleanValue2 = ((Boolean) aw7Var9.getValue()).booleanValue();
            boolean e3 = rv4Var3.e(((zl1) aw7Var7.getValue()).a);
            Object P19 = rv4Var3.P();
            if (!e3 && P19 != obj2) {
                z26 = true;
                z27 = false;
            } else {
                z26 = true;
                z27 = false;
                P19 = kve.A(((zl1) aw7Var7.getValue()).a, true, false);
                rv4Var3.o0(P19);
            }
            String str3 = (String) P19;
            Object P20 = rv4Var3.P();
            if (P20 == obj2) {
                P20 = new g0c(aw7Var9, i3);
                rv4Var3.o0(P20);
            }
            xt4 xt4Var6 = (xt4) P20;
            if (i18 == 32) {
                z28 = z26;
            } else {
                z28 = z27;
            }
            if (i20 == 4) {
                z29 = z26;
            } else {
                z29 = z27;
            }
            boolean z42 = z28 | z29;
            Object P21 = rv4Var3.P();
            if (z42 || P21 == obj2) {
                v93 v93Var2 = new v93(yt2Var, yyaVar, aw7Var9, aw7Var7, 3);
                rv4Var3.o0(v93Var2);
                P21 = v93Var2;
            }
            tc4.h(384, xt4Var6, (xt4) P21, rv4Var3, str3, booleanValue2);
            kq7Var = kq7Var3;
        } else {
            xt4Var4 = xt4Var;
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            final xt4 xt4Var7 = xt4Var4;
            u.d = new lu4() { // from class: jgc
                @Override // defpackage.lu4
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int p7 = xoe.p(i | 1);
                    rgc.j(yya.this, yt2Var, uo3Var, z86Var, list, kq7Var, z, z2, vt4Var, xt4Var7, vt4Var2, xt4Var2, vt4Var3, xt4Var3, vt4Var4, (rv4) obj5, p7);
                    return pvc.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b4  */
    /* JADX WARN: Type inference failed for: r15v35, types: [int] */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final defpackage.e33 r29, final defpackage.vt4 r30, final defpackage.nq7 r31, final java.util.List r32, final java.lang.String r33, final int r34, final defpackage.xt4 r35, final defpackage.lu4 r36, final defpackage.xt4 r37, final defpackage.vt4 r38, final defpackage.vt4 r39, defpackage.rv4 r40, final int r41) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgc.k(e33, vt4, nq7, java.util.List, java.lang.String, int, xt4, lu4, xt4, vt4, vt4, rv4, int):void");
    }

    public static final void l(ArrayList arrayList, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        nq7 nq7Var2;
        rv4Var.g0(1442134145);
        if (rv4Var.f(arrayList)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i | 48;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            nq7Var2 = kq7.a;
            nq7 s = pna.s(nq7Var2, (arrayList.size() * 18) + 18);
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, s);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            rv4Var.e0(1633253415);
            int size = arrayList.size();
            int i4 = 0;
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                int i6 = i5 + 1;
                int i7 = i4 + 1;
                if (i4 >= 0) {
                    bzc bzcVar = (bzc) obj;
                    ape.o(bzcVar.c, bzcVar.b, st0.d(pna.n(zbe.C(nq7Var2, i4 * 16, nae.e, nae.e, nae.e, 14), 28.0f), 2.0f, ((h27) rv4Var.j(j27.a)).a.p, uu9.a), null, rv4Var, 0, 8);
                    size = size;
                    i5 = i6;
                    i4 = i7;
                } else {
                    tl1.M();
                    throw null;
                }
            }
            rv4Var.q(false);
            rv4Var.q(true);
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new f58(arrayList, nq7Var2, i, 25);
        }
    }

    public static final void m(f33 f33Var, vt4 vt4Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        vt4 vt4Var2;
        kq7 kq7Var;
        boolean z2;
        int i3;
        boolean h;
        int i4;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1105899667);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var2.f(f33Var);
            } else {
                h = rv4Var2.h(f33Var);
            }
            if (h) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i5 = i2 | 384;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            nid f = gwe.f(rv4Var2);
            bzc bzcVar = f33Var.a;
            boolean f2 = rv4Var2.f(bzcVar.f);
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            ArrayList arrayList = P;
            if (f2 || P == lh9Var) {
                List<String> list = bzcVar.f;
                ArrayList arrayList2 = new ArrayList(tl1.s(list, 10));
                for (String str : list) {
                    arrayList2.add(new zl1(kve.v(str)));
                }
                rv4Var2.o0(arrayList2);
                arrayList = arrayList2;
            }
            List list2 = (List) arrayList;
            kq7 kq7Var2 = kq7.a;
            nq7 k = tte.k(pna.f(kq7Var2, 1.0f), r0f.z(rv4Var2).d);
            long g = rm1.g(r0f.y(rv4Var2), 7.0f);
            ba5 ba5Var = lre.g;
            nq7 y = zbe.y(zj0.i(nmd.v(k, g, ba5Var), w06.a), 12.0f);
            mk0 mk0Var = kh5.G;
            dz dzVar = lz.a;
            gv9 a2 = ev9.a(dzVar, mk0Var, rv4Var2, 48);
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
            nq7 c2 = pna.c(pna.s(kq7Var2, 3.0f), 1.0f);
            su9 su9Var = uu9.a;
            fu0.a(nmd.v(tte.k(c2, su9Var), zl1.b(0.32f, r0f.y(rv4Var2).a), ba5Var), rv4Var2, 0);
            we6 d = rs8.d(kq7Var2, 10.0f, rv4Var2, 1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, d);
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
            gv9 a4 = ev9.a(dzVar, mk0Var, rv4Var2, 48);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, kq7Var2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a4);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p3);
            kq7 kq7Var3 = kq7Var2;
            ape.o(bzcVar.c, bzcVar.b, pna.n(kq7Var2, 20.0f), null, rv4Var2, 384, 8);
            xbe.i(rv4Var2, pna.s(kq7Var3, 8.0f));
            String str2 = bzcVar.b;
            rv4Var2.e0(1988870340);
            if (list2.isEmpty()) {
                list2 = tl1.A(new zl1(r0f.y(rv4Var2).a));
            }
            rv4Var2.q(false);
            ipe.g(str2, null, list2, 0L, 0L, null, 0L, 0, false, 1, 0, r0f.A(rv4Var2).m, rv4Var, 0, 3072, 57338);
            rv4Var2 = rv4Var;
            rs8.u(rv4Var2, true, kq7Var3, 6.0f, rv4Var2);
            hud.d(f33Var.b, false, oyb.a(r0f.A(rv4Var2).k, zl1.b(0.84f, r0f.y(rv4Var2).q), 0L, null, null, null, 0L, null, 0, e4c.c, null, 16646142), 0, 0, 2, 2, pna.f(kq7Var3, 1.0f), f.a * 0.65f, null, null, null, rv4Var2, 14352384, 3610);
            s21.x(rv4Var2, true, kq7Var3, 8.0f, rv4Var2);
            ar5 c3 = rp5.c((wk3) jk3.w.getValue(), rv4Var2, 0);
            long j = r0f.y(rv4Var2).s;
            nq7 k2 = tte.k(pna.n(kq7Var3, 28.0f), su9Var);
            if ((i5 & Token.ASSIGN_MOD) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P2 = rv4Var2.P();
            if (!z2 && P2 != lh9Var) {
                vt4Var2 = vt4Var;
            } else {
                vt4Var2 = vt4Var;
                P2 = new a3c(10, vt4Var2);
                rv4Var2.o0(P2);
            }
            nk5.a(c3, null, zbe.y(lbe.f(15, (vt4) P2, k2, null, false), 6.0f), j, rv4Var2, 48, 0);
            rv4Var2.q(true);
            kq7Var = kq7Var3;
        } else {
            vt4Var2 = vt4Var;
            rv4Var2.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new igc(f33Var, vt4Var2, kq7Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(defpackage.ar5 r16, boolean r17, boolean r18, defpackage.vt4 r19, defpackage.rv4 r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgc.n(ar5, boolean, boolean, vt4, rv4, int, int):void");
    }

    public static final void o(long j, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        long j2;
        rv4Var.g0(518454167);
        if (rv4Var.e(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            kq7 kq7Var = kq7.a;
            nq7 n = pna.n(kq7Var, 32.0f);
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, n);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            ar5 c2 = rp5.c((wk3) jk3.A.getValue(), rv4Var, 0);
            tza tzaVar = j27.a;
            long j3 = ((h27) rv4Var.j(tzaVar)).a.q;
            nk0 nk0Var = kh5.e;
            pu0 pu0Var = pu0.a;
            nq7 k = tte.k(pna.n(pu0Var.a(kq7Var, nk0Var), 32.0f), uu9.a);
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = new a3c(13, vt4Var);
                rv4Var.o0(P);
            }
            nk5.a(c2, null, zbe.y(lbe.f(15, (vt4) P, k, null, false), 6.0f), j3, rv4Var, 48, 0);
            if (j == 16) {
                rv4Var.e0(2048976450);
                long j4 = ((h27) rv4Var.j(tzaVar)).a.q;
                rv4Var.q(false);
                j2 = j4;
            } else {
                rv4Var.e0(2049047936);
                rv4Var.q(false);
                j2 = j;
            }
            vqe.m(2.0f, 48, 0, j2, rv4Var, zbe.C(zbe.A(pu0Var.a(kq7Var, kh5.D), 6.0f, nae.e, 2), nae.e, nae.e, nae.e, 4.0f, 7));
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new mk7(j, vt4Var, i);
        }
    }

    public static final void p(w43 w43Var, List list, boolean z, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        y3b y3bVar;
        rv4 rv4Var2 = rv4Var;
        w43Var.getClass();
        list.getClass();
        rv4Var2.g0(780936322);
        if (rv4Var2.h(w43Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var2.f(list)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var2.g(z)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var2.h(xt4Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i9 = i8 | i5;
        if ((i9 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i9 & 1, z2)) {
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yae.z(Boolean.FALSE);
                rv4Var2.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            nq7 f = pna.f(nq7Var, 1.0f);
            tza tzaVar = j27.a;
            nq7 z3 = zbe.z(nmd.v(tte.k(f, ((h27) rv4Var2.j(tzaVar)).c.d), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 2.0f), lre.g), 12.0f, 9.0f);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, z3);
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
            List<e33> v0 = sl1.v0(list, 3);
            ArrayList arrayList = new ArrayList(tl1.s(v0, 10));
            for (e33 e33Var : v0) {
                arrayList.add(e33Var.c);
            }
            l(arrayList, null, rv4Var2, 0);
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var2, pna.s(kq7Var, 10.0f));
            String B = yqe.B((y3b) k2b.f0.getValue(), new Object[]{Integer.valueOf(w43Var.k)}, rv4Var2);
            tza tzaVar2 = j27.a;
            cvb.c(B, null, ((h27) rv4Var2.j(tzaVar2)).a.s, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar2)).b.m, rv4Var, 0, 0, 131066);
            xbe.i(rv4Var, new we6(1.0f, true));
            b37 d = fu0.d(kh5.a, false);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, kq7Var);
            rw1.k.getClass();
            zx1 zx1Var2 = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var2);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d);
            jce.F(qw1.e, rv4Var, l2);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode2));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p2);
            if (z) {
                y3bVar = (y3b) k2b.i0.getValue();
            } else {
                y3bVar = (y3b) k2b.j0.getValue();
            }
            String A = yqe.A(y3bVar, rv4Var);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new p0c(aw7Var, 19);
                rv4Var.o0(P2);
            }
            jsc.q(A, false, lbe.f(15, (vt4) P2, kq7Var, null, false), rv4Var, 48, 0);
            boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
            Object P3 = rv4Var.P();
            if (P3 == lh9Var) {
                P3 = new p0c(aw7Var, 20);
                rv4Var.o0(P3);
            }
            iue.e(booleanValue, null, 0L, null, nae.e, null, (vt4) P3, jce.E(1278567652, new a1a(z, xt4Var, aw7Var, 8), rv4Var), rv4Var, 14155776, 62);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new b62(w43Var, list, z, nq7Var, xt4Var, i);
        }
    }

    public static final void q(int i, rv4 rv4Var) {
        boolean z;
        rv4Var.g0(612025650);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            fu0.a(nmd.v(pna.s(pna.h(kq7.a, 24.0f), 1.0f), sve.d(4281940797L), lre.g), rv4Var, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new tsa(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x07d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(final java.lang.String r60, final java.lang.String r61, final defpackage.z86 r62, final defpackage.h81 r63, final defpackage.f33 r64, final java.util.List r65, defpackage.nq7 r66, final java.lang.String r67, final boolean r68, final boolean r69, final defpackage.vt4 r70, final defpackage.vt4 r71, final defpackage.vt4 r72, final defpackage.xt4 r73, final defpackage.xt4 r74, final defpackage.xt4 r75, final defpackage.vt4 r76, final defpackage.vt4 r77, defpackage.rv4 r78, final int r79) {
        /*
            Method dump skipped, instructions count: 2096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgc.r(java.lang.String, java.lang.String, z86, h81, f33, java.util.List, nq7, java.lang.String, boolean, boolean, vt4, vt4, vt4, xt4, xt4, xt4, vt4, vt4, rv4, int):void");
    }

    public static final void s(String str, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        nq7 nq7Var2;
        str.getClass();
        rv4Var.g0(809098903);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2 | 48;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            oyb oybVar = ((h27) rv4Var.j(j27.a)).b.f;
            nq7Var2 = kq7.a;
            cvb.c(str, nq7Var2, 0L, null, 0L, null, dq4.C, null, 0L, null, null, zr1.o(1.15d), 0, false, 0, 0, null, oybVar, rv4Var, (i3 & 14) | 1572912, 48, 128956);
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new o7(str, nq7Var2, i, 15);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
        if (defpackage.k4b.j0(r9) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
        r11 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
        if (defpackage.k4b.j0(r9) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
        if (defpackage.k4b.j0(r9) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
        if (defpackage.k4b.j0(r9) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009a, code lost:
        if (r11 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009c, code lost:
        r10 = defpackage.k4b.N0(r11).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a4, code lost:
        if (r10 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a7, code lost:
        r5 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a8, code lost:
        r8 = new defpackage.ps(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0092, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009a A[EDGE_INSN: B:68:0x009a->B:50:0x009a ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.cp9 t(defpackage.e33 r13) {
        /*
            cp9 r0 = new cp9
            long r1 = r13.a
            int r3 = r13.d
            java.util.List r4 = r13.j
            java.lang.String r5 = ""
            m23 r6 = defpackage.m23.a
            r7 = 2
            if (r3 == r7) goto Lae
            java.lang.Object r8 = defpackage.sl1.s0(r4)
            boolean r8 = defpackage.c16.i(r8, r6)
            if (r8 == 0) goto L1b
            goto Lae
        L1b:
            java.util.Iterator r8 = r4.iterator()
        L1f:
            boolean r9 = r8.hasNext()
            r10 = 0
            if (r9 == 0) goto L99
            java.lang.Object r9 = r8.next()
            s23 r9 = (defpackage.s23) r9
            boolean r11 = r9 instanceof defpackage.r23
            if (r11 == 0) goto L36
            r23 r9 = (defpackage.r23) r9
            ps r5 = r9.a
            goto Lb4
        L36:
            boolean r11 = r9 instanceof defpackage.l23
            if (r11 == 0) goto L4d
            l23 r9 = (defpackage.l23) r9
            java.lang.String r11 = r9.f
            boolean r12 = defpackage.k4b.j0(r11)
            if (r12 == 0) goto L46
            java.lang.String r11 = r9.a
        L46:
            boolean r9 = defpackage.k4b.j0(r11)
            if (r9 != 0) goto L91
            goto L92
        L4d:
            boolean r11 = r9 instanceof defpackage.q23
            if (r11 == 0) goto L5e
            q23 r9 = (defpackage.q23) r9
            java.lang.String r9 = r9.a
            boolean r11 = defpackage.k4b.j0(r9)
            if (r11 == 0) goto L5c
            goto L91
        L5c:
            r11 = r9
            goto L92
        L5e:
            boolean r11 = r9 instanceof defpackage.n23
            if (r11 == 0) goto L6d
            n23 r9 = (defpackage.n23) r9
            java.lang.String r9 = r9.a
            boolean r11 = defpackage.k4b.j0(r9)
            if (r11 == 0) goto L5c
            goto L91
        L6d:
            boolean r11 = r9 instanceof defpackage.o23
            if (r11 == 0) goto L7c
            o23 r9 = (defpackage.o23) r9
            java.lang.String r9 = r9.a
            boolean r11 = defpackage.k4b.j0(r9)
            if (r11 == 0) goto L5c
            goto L91
        L7c:
            boolean r11 = r9 instanceof defpackage.p23
            if (r11 == 0) goto L8b
            p23 r9 = (defpackage.p23) r9
            java.lang.String r9 = r9.c
            boolean r11 = defpackage.k4b.j0(r9)
            if (r11 == 0) goto L5c
            goto L91
        L8b:
            boolean r9 = defpackage.c16.i(r9, r6)
            if (r9 == 0) goto L95
        L91:
            r11 = r10
        L92:
            if (r11 == 0) goto L1f
            goto L9a
        L95:
            defpackage.xk5.o()
            return r10
        L99:
            r11 = r10
        L9a:
            if (r11 == 0) goto La4
            java.lang.CharSequence r8 = defpackage.k4b.N0(r11)
            java.lang.String r10 = r8.toString()
        La4:
            if (r10 != 0) goto La7
            goto La8
        La7:
            r5 = r10
        La8:
            ps r8 = new ps
            r8.<init>(r5)
            goto Lb3
        Lae:
            ps r8 = new ps
            r8.<init>(r5)
        Lb3:
            r5 = r8
        Lb4:
            f33 r8 = new f33
            bzc r13 = r13.c
            if (r3 == r7) goto Lc7
            java.lang.Object r3 = defpackage.sl1.s0(r4)
            boolean r3 = defpackage.c16.i(r3, r6)
            if (r3 == 0) goto Lc5
            goto Lc7
        Lc5:
            r3 = 0
            goto Lc8
        Lc7:
            r3 = 1
        Lc8:
            r8.<init>(r13, r5, r3)
            r0.<init>(r1, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgc.t(e33):cp9");
    }
}
