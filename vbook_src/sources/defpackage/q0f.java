package defpackage;

import java.util.logging.Level;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q0f  reason: default package */
/* loaded from: classes3.dex */
public abstract class q0f {
    public static o0f a;
    public static final tu1 b = new tu1(new lv1(20), false, 146661766);

    public static final void a(f7a f7aVar, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4Var.g0(-954926513);
        if (rv4Var.h(f7aVar)) {
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
            qwe.a(f7aVar, tu1Var, rv4Var, i3 & Token.ELSE);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oq1(f7aVar, tu1Var, i, 1);
        }
    }

    public static final void b(gtb gtbVar, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        rv4Var.g0(2080741862);
        if ((i & 6) == 0) {
            if (rv4Var.h(gtbVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(tu1Var)) {
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
            qwe.b(gtbVar, tu1Var, rv4Var, i2 & Token.ELSE);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new nq1(gtbVar, tu1Var, i, 1);
        }
    }

    public static final void c(ytb ytbVar, boolean z, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        rv4Var.g0(-579239002);
        if ((i & 6) == 0) {
            if (rv4Var.h(ytbVar)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.g(z)) {
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
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            qwe.c(ytbVar, z, tu1Var, rv4Var, i2 & 1022);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new pq1(ytbVar, z, tu1Var, i, 1);
        }
    }

    public static final yeb d(b50 b50Var) {
        return new yeb(new m97(b50Var));
    }

    public static final void e(boolean z, String str, String str2, int i, int i2, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, vt4 vt4Var5, vt4 vt4Var6, rv4 rv4Var, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        rv4 rv4Var2 = rv4Var;
        str.getClass();
        str2.getClass();
        vt4Var.getClass();
        vt4Var2.getClass();
        vt4Var3.getClass();
        vt4Var4.getClass();
        vt4Var5.getClass();
        vt4Var6.getClass();
        rv4Var2.g0(-1583713413);
        int i13 = 2;
        if ((i3 & 6) == 0) {
            if (rv4Var2.g(z)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i4 = i3 | i12;
        } else {
            i4 = i3;
        }
        int i14 = 16;
        if (rv4Var2.f(str)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i15 = i4 | i5;
        if (rv4Var2.f(str2)) {
            i6 = 256;
        } else {
            i6 = Token.CASE;
        }
        int i16 = i15 | i6;
        if (rv4Var2.d(i)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i17 = i16 | i7;
        if (rv4Var2.d(i2)) {
            i8 = 16384;
        } else {
            i8 = 8192;
        }
        int i18 = i17 | i8;
        if (rv4Var2.h(vt4Var)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i19 = i18 | i9;
        if (rv4Var2.h(vt4Var2)) {
            i10 = 8388608;
        } else {
            i10 = 4194304;
        }
        int i20 = i19 | i10;
        if (rv4Var2.h(vt4Var3)) {
            i11 = 67108864;
        } else {
            i11 = 33554432;
        }
        int i21 = i20 | i11;
        if (rv4Var2.h(vt4Var5)) {
            i13 = 4;
        }
        if (rv4Var2.h(vt4Var6)) {
            i14 = 32;
        }
        int i22 = i13 | i14;
        if ((i21 & 306783379) == 306783378 && (i22 & 19) == 18) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var2.U(i21 & 1, z2)) {
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
            nq7 f = pna.f(kq7Var, 1.0f);
            eu3 g = zt3.g(null, 3);
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new rg8(9);
                rv4Var2.o0(P);
            }
            eu3 a3 = g.a(zt3.t((xt4) P));
            lz3 i23 = zt3.i(null, 3);
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var) {
                P2 = new rg8(10);
                rv4Var2.o0(P2);
            }
            rte.e(z, f, a3, i23.a(zt3.x((xt4) P2)), null, jce.E(89092297, new cr0(vt4Var5, vt4Var, vt4Var2, vt4Var3, vt4Var4, str, str2, 6), rv4Var2), rv4Var2, ((i21 << 3) & Token.ASSIGN_MOD) | 1600902, 16);
            rv4Var2 = rv4Var2;
            nq7 f2 = pna.f(kq7Var, 1.0f);
            b37 d = fu0.d(kh5.a, false);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, f2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, d);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            int i24 = i21 >> 6;
            xxe.g(z, i, i2, pu0.a.a(kq7Var, kh5.c), vt4Var6, rv4Var2, (i21 & 14) | (i24 & Token.ASSIGN_MOD) | (i24 & 896) | (57344 & (i22 << 9)));
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new sf6(z, str, str2, i, i2, nq7Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, i3);
        }
    }

    public static final void f(final boolean z, final String str, final String str2, final int i, final int i2, final nq7 nq7Var, final vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, final vt4 vt4Var4, final vt4 vt4Var5, rv4 rv4Var, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        int i14;
        int i15;
        rv4 rv4Var2 = rv4Var;
        str.getClass();
        str2.getClass();
        vt4Var.getClass();
        vt4Var2.getClass();
        vt4Var3.getClass();
        vt4Var4.getClass();
        vt4Var5.getClass();
        rv4Var2.g0(1926236767);
        if ((i3 & 6) == 0) {
            if (rv4Var2.g(z)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i5 = i3 | i15;
        } else {
            i5 = i3;
        }
        if (rv4Var2.f(str)) {
            i6 = 32;
        } else {
            i6 = 16;
        }
        int i16 = i5 | i6;
        if (rv4Var2.f(str2)) {
            i7 = 256;
        } else {
            i7 = Token.CASE;
        }
        int i17 = i16 | i7;
        if (rv4Var2.d(i)) {
            i8 = 2048;
        } else {
            i8 = 1024;
        }
        int i18 = i17 | i8;
        if (rv4Var2.d(i2)) {
            i9 = 16384;
        } else {
            i9 = 8192;
        }
        int i19 = i18 | i9;
        if (rv4Var2.h(vt4Var)) {
            i10 = 1048576;
        } else {
            i10 = 524288;
        }
        int i20 = i19 | i10;
        if (rv4Var2.h(vt4Var2)) {
            i11 = 8388608;
        } else {
            i11 = 4194304;
        }
        int i21 = i20 | i11;
        if (rv4Var2.h(vt4Var3)) {
            i12 = 67108864;
        } else {
            i12 = 33554432;
        }
        int i22 = i21 | i12;
        if ((i4 & 6) == 0) {
            if (rv4Var2.h(vt4Var5)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i4 | i14;
        } else {
            i13 = i4;
        }
        if ((i22 & 306783379) == 306783378 && (i13 & 3) == 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var2.U(i22 & 1, z2)) {
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
            nq7 f = pna.f(kq7Var, 1.0f);
            eu3 g = zt3.g(null, 3);
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new rg8(11);
                rv4Var2.o0(P);
            }
            eu3 a3 = g.a(zt3.t((xt4) P));
            lz3 i23 = zt3.i(null, 3);
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var) {
                P2 = new rg8(12);
                rv4Var2.o0(P2);
            }
            rte.e(z, f, a3, i23.a(zt3.x((xt4) P2)), null, jce.E(-543903443, new tw5(vt4Var, vt4Var2, vt4Var3, vt4Var4, str, str2), rv4Var2), rv4Var2, ((i22 << 3) & Token.ASSIGN_MOD) | 1600902, 16);
            rv4Var2 = rv4Var2;
            nq7 f2 = pna.f(kq7Var, 1.0f);
            b37 d = fu0.d(kh5.a, false);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, f2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, d);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            int i24 = i22 >> 6;
            aze.j(z, i, i2, pu0.a.a(mwe.u(kq7Var, false, 4), kh5.c), vt4Var5, rv4Var2, (i22 & 14) | (i24 & Token.ASSIGN_MOD) | (i24 & 896) | (57344 & (i13 << 12)));
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4() { // from class: es8
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p3 = xoe.p(i3 | 1);
                    int p4 = xoe.p(i4);
                    q0f.f(z, str, str2, i, i2, nq7Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, (rv4) obj, p3, p4);
                    return pvc.a;
                }
            };
        }
    }

    public static final void g(String str, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        kq7 kq7Var;
        rv4Var.g0(934613237);
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
            kq7 kq7Var2 = kq7.a;
            nq7 z2 = zbe.z(kq7Var2, 16.0f, 12.0f);
            tza tzaVar = j27.a;
            cvb.c(str, z2, ((h27) rv4Var.j(tzaVar)).a.a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.h, rv4Var, i3 & 14, 0, 131064);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new o7(str, kq7Var, i, 16);
        }
    }

    public static final void h(boolean z, final String str, final int i, final int i2, nq7 nq7Var, final vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, final vt4 vt4Var4, rv4 rv4Var, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        str.getClass();
        vt4Var.getClass();
        vt4Var2.getClass();
        vt4Var3.getClass();
        vt4Var4.getClass();
        rv4Var.g0(-769320919);
        if (rv4Var.g(z)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i13 = i3 | i4;
        if (rv4Var.f(str)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i14 = i13 | i5;
        if (rv4Var.d(i)) {
            i6 = 256;
        } else {
            i6 = Token.CASE;
        }
        int i15 = i14 | i6;
        if (rv4Var.d(i2)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i16 = i15 | i7;
        if (rv4Var.f(nq7Var)) {
            i8 = 16384;
        } else {
            i8 = 8192;
        }
        int i17 = i16 | i8;
        if (rv4Var.h(vt4Var)) {
            i9 = 131072;
        } else {
            i9 = Parser.ARGC_LIMIT;
        }
        int i18 = i17 | i9;
        if (rv4Var.h(vt4Var2)) {
            i10 = 1048576;
        } else {
            i10 = 524288;
        }
        int i19 = i18 | i10;
        if (rv4Var.h(vt4Var3)) {
            i11 = 8388608;
        } else {
            i11 = 4194304;
        }
        int i20 = i19 | i11;
        if (rv4Var.h(vt4Var4)) {
            i12 = 67108864;
        } else {
            i12 = 33554432;
        }
        int i21 = i20 | i12;
        if ((38347923 & i21) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i21 & 1, z2)) {
            eu3 g = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new txb(0);
                rv4Var.o0(P);
            }
            eu3 a2 = g.a(zt3.t((xt4) P));
            lz3 i22 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new txb(1);
                rv4Var.o0(P2);
            }
            rte.c(z, nq7Var, a2, i22.a(zt3.x((xt4) P2)), null, jce.E(-1501208495, new mu4() { // from class: uxb
                /* JADX WARN: Code restructure failed: missing block: B:28:0x021e, code lost:
                    if (r15 == r9) goto L39;
                 */
                @Override // defpackage.mu4
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object c(java.lang.Object r38, java.lang.Object r39, java.lang.Object r40) {
                    /*
                        Method dump skipped, instructions count: 768
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.uxb.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, rv4Var), rv4Var, (i21 & 14) | 200064 | ((i21 >> 9) & Token.ASSIGN_MOD), 16);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new p85(z, str, i, i2, nq7Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, i3);
        }
    }

    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v46 */
    public static final void i(wqc wqcVar, rh8 rh8Var, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, xt4 xt4Var5, xt4 xt4Var6, xt4 xt4Var7, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        ?? r6;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean h;
        int i12;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1638616071);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var2.f(wqcVar);
            } else {
                h = rv4Var2.h(wqcVar);
            }
            if (h) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i2 = i12 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.f(rh8Var)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i10 = 256;
            } else {
                i10 = Token.CASE;
            }
            i2 |= i10;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i2 |= i9;
        }
        if ((i & 24576) == 0) {
            if (rv4Var2.h(xt4Var2)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i2 |= i8;
        }
        if ((196608 & i) == 0) {
            if (rv4Var2.h(xt4Var3)) {
                i7 = 131072;
            } else {
                i7 = Parser.ARGC_LIMIT;
            }
            i2 |= i7;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var2.h(xt4Var4)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i2 |= i6;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var2.h(xt4Var5)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i2 |= i5;
        }
        if ((100663296 & i) == 0) {
            if (rv4Var2.h(xt4Var6)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i2 |= i4;
        }
        if ((805306368 & i) == 0) {
            if (rv4Var2.h(xt4Var7)) {
                i3 = 536870912;
            } else {
                i3 = 268435456;
            }
            i2 |= i3;
        }
        if ((306783379 & i2) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i2 & 1, z)) {
            nq7 C = rte.C(c16.g(nq7Var.a0(pna.c), null, 3), rte.u(rv4Var2), 14);
            lk0 lk0Var = kh5.I;
            ez ezVar = lz.c;
            xn1 a2 = wn1.a(ezVar, lk0Var, rv4Var2, 0);
            int i13 = i2;
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, C);
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
            xbe.i(rv4Var2, zbe.x(kq7Var, rh8Var));
            g(yqe.A((y3b) f3b.K0.getValue(), rv4Var2), null, rv4Var2, 0);
            nq7 A = zbe.A(pna.f(kq7Var, 1.0f), 16.0f, nae.e, 2);
            tza tzaVar = j27.a;
            nq7 k = tte.k(A, ((h27) rv4Var2.j(tzaVar)).c.d);
            xn1 a3 = wn1.a(ezVar, lk0Var, rv4Var2, 0);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, k);
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
            int i14 = i13 << 3;
            l0e.j(yqe.A((y3b) f3b.y0.getValue(), rv4Var2), cqe.m((q3b) nz.s.getValue(), rv4Var2), wqcVar.a, q(rv4Var2, pna.f(kq7Var, 1.0f)), xt4Var, rv4Var2, i14 & 57344);
            if (wqcVar.a != 0) {
                s21.w(rv4Var2, -1700168991, kq7Var, 4.0f, rv4Var2);
                nmd.k(wqcVar.b, ((i13 >> 3) & 7168) | 384, xt4Var2, rv4Var2, pna.h(q(rv4Var2, pna.f(kq7Var, 1.0f)), 116.0f));
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-1699742307);
                rv4Var2.q(false);
            }
            xbe.i(rv4Var2, pna.h(kq7Var, 4.0f));
            rv4Var2 = rv4Var;
            l0e.n(null, yqe.A((y3b) f3b.L0.getValue(), rv4Var2), yqe.A((y3b) f3b.M0.getValue(), rv4Var2), q(rv4Var2, pna.f(kq7Var, 1.0f)), false, wqcVar.e, xt4Var3, rv4Var2, i14 & 3670016, 17);
            l53.d();
            rv4Var2.e0(-1699162793);
            xbe.i(rv4Var2, pna.h(kq7Var, 4.0f));
            l0e.n(null, yqe.A((y3b) f3b.P0.getValue(), rv4Var2), yqe.A((y3b) f3b.Q0.getValue(), rv4Var2), q(rv4Var2, pna.f(kq7Var, 1.0f)), false, wqcVar.c, xt4Var4, rv4Var2, i13 & 3670016, 17);
            if (wqcVar.c) {
                s21.w(rv4Var2, -1698600081, kq7Var, 4.0f, rv4Var2);
                l0e.n(null, yqe.A((y3b) f3b.m0.getValue(), rv4Var2), yqe.A((y3b) f3b.n0.getValue(), rv4Var2), q(rv4Var2, pna.f(kq7Var, 1.0f)), false, wqcVar.d, xt4Var5, rv4Var2, (i13 >> 3) & 3670016, 17);
                r6 = 0;
                rv4Var2.q(false);
            } else {
                r6 = 0;
                rv4Var2.e0(-1698002339);
                rv4Var2.q(false);
            }
            xbe.i(rv4Var2, hl5.e(rv4Var2, r6, true, kq7Var, 12.0f));
            g(yqe.A((y3b) f3b.J0.getValue(), rv4Var2), null, rv4Var2, r6);
            nq7 k2 = tte.k(zbe.A(pna.f(kq7Var, 1.0f), 16.0f, nae.e, 2), ((h27) rv4Var2.j(tzaVar)).c.d);
            xn1 a4 = wn1.a(ezVar, lk0Var, rv4Var2, r6);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, k2);
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
            boolean z2 = r6;
            l0e.n(null, yqe.A((y3b) f3b.G0.getValue(), rv4Var2), yqe.A((y3b) f3b.H0.getValue(), rv4Var2), q(rv4Var2, pna.f(kq7Var, 1.0f)), false, wqcVar.f, xt4Var6, rv4Var2, (i13 >> 6) & 3670016, 17);
            if (wqcVar.h) {
                s21.w(rv4Var2, 2048563906, kq7Var, 4.0f, rv4Var2);
                l0e.n(null, yqe.A((y3b) f3b.N0.getValue(), rv4Var2), yqe.A((y3b) f3b.O0.getValue(), rv4Var2), q(rv4Var2, pna.f(kq7Var, 1.0f)), false, wqcVar.g, xt4Var7, rv4Var2, (i13 >> 9) & 3670016, 17);
                rv4Var2.q(z2);
            } else {
                rv4Var2.e0(2049090534);
                rv4Var2.q(z2);
            }
            rv4Var2.q(true);
            xbe.i(rv4Var2, pna.h(mwe.u(kq7Var, z2, 14), 12.0f));
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ql7(wqcVar, rh8Var, nq7Var, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, xt4Var7, i);
        }
    }

    public static final void j(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4 rv4Var2;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(-123800108);
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
                zqc zqcVar = (zqc) ((fdd) voe.z(cm9.a(zqc.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                rv4Var2 = rv4Var;
                fxe.h(yqe.A((y3b) f3b.F0.getValue(), rv4Var), pna.c, false, jce.E(486180568, new ebc(cz7Var, 4), rv4Var), null, null, jce.E(606666857, new u32(7, zqcVar, jsc.z(zqcVar.e, rv4Var)), rv4Var), rv4Var2, 1575984, 52);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ebc(cz7Var, i, 5);
        }
    }

    public static final String k(int i) {
        String valueOf = String.valueOf(i);
        int length = 2 - valueOf.length();
        if (length < 0) {
            length = 0;
        }
        return nk2.u(r4b.M(length, "0"), valueOf);
    }

    public static final nq7 l(fh6 fh6Var, mce mceVar, boolean z, ff8 ff8Var) {
        return new bh6(fh6Var, mceVar, z, ff8Var);
    }

    public static final void m(cz7 cz7Var, String str) {
        cz7Var.getClass();
        str.getClass();
        cz7Var.a.c(new t34(str));
    }

    public static final void n(cz7 cz7Var, String str) {
        cz7Var.getClass();
        cz7Var.a.c(new l74(str));
    }

    public static yeb o(byte[] bArr) {
        bArr.getClass();
        return new yeb(new m97(new b50(bArr, 6)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
        if (r6 != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.s76 p(defpackage.wf2 r5, defpackage.t76 r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q0f.p(wf2, t76, boolean):s76");
    }

    public static final nq7 q(rv4 rv4Var, nq7 nq7Var) {
        tza tzaVar = j27.a;
        return zbe.y(nmd.v(tte.k(nq7Var, ((h27) rv4Var.j(tzaVar)).c.a), rm1.g(((h27) rv4Var.j(tzaVar)).a, 1.0f), lre.g), 16.0f);
    }

    public static final nq7 r(nq7 nq7Var, xl0 xl0Var, rv4 rv4Var) {
        int i;
        float f;
        nq7Var.getClass();
        xl0Var.getClass();
        rv4Var.e0(1446885031);
        hn0 hn0Var = xl0Var.b;
        if (!hn0Var.a()) {
            rv4Var.q(false);
            return nq7Var;
        }
        r71 r71Var = ((e81) rv4Var.j(jt6.a)).c;
        if (hn0Var.a()) {
            i = xl0Var.d.a;
        } else {
            i = 0;
        }
        if (i == 0) {
            f = nae.e;
        } else {
            f = i * 24.0f;
        }
        nq7 C = zbe.C(nq7Var, ((rg3) nq.a(f, tte.x(150, 0, qt5.a, 2), "BlockIndentation", rv4Var, 384, 8).getValue()).a, nae.e, nae.e, nae.e, 14);
        rv4Var.q(false);
        return C;
    }

    public static String s(String str) {
        if (str.length() > 23) {
            int i = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char charAt = str.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i = length;
                    break;
                }
            }
            str = str.substring(i + 1);
        }
        String concat = "".concat(str);
        return concat.substring(0, Math.min(concat.length(), 23));
    }

    public static int t(Level level) {
        int intValue = level.intValue();
        if (intValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (intValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (intValue >= Level.INFO.intValue()) {
            return 4;
        }
        if (intValue >= Level.FINE.intValue()) {
            return 3;
        }
        return 2;
    }
}
