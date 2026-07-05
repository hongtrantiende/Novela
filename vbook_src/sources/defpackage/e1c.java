package defpackage;

import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e1c  reason: default package */
/* loaded from: classes3.dex */
public abstract class e1c {
    public static final tza a = new f99(new a1c(0));

    public static final void a(ar5 ar5Var, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        rv4Var.g0(-1934513338);
        if ((i & 6) == 0) {
            if (rv4Var.f(ar5Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.g(true)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(vt4Var)) {
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
        if (rv4Var.U(i2 & 1, z)) {
            nq7 h = pna.h(nq7Var, 52.0f);
            tza tzaVar = j27.a;
            nq7 v = nmd.v(tte.k(h, ((h27) rv4Var.j(tzaVar)).c.e), zl1.b(0.8f, rm1.g(((h27) rv4Var.j(tzaVar)).a, 4.0f)), lre.g);
            if ((i2 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new umb(29, vt4Var);
                rv4Var.o0(P);
            }
            nq7 y = zbe.y(lbe.f(14, (vt4) P, v, null, true), 8.0f);
            b37 d = fu0.d(kh5.e, false);
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
            jce.F(qw1.f, rv4Var, d);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            nk5.a(ar5Var, null, null, zl1.b(1.0f, ((h27) rv4Var.j(tzaVar)).a.q), rv4Var, (i2 & 14) | 48, 4);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new x0c(ar5Var, nq7Var, vt4Var, i, 0);
        }
    }

    public static final void b(boolean z, boolean z2, boolean z3, lha lhaVar, qr qrVar, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, vt4 vt4Var5, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z4;
        rv4 rv4Var2;
        vt4 vt4Var6;
        int i12;
        int i13;
        wk3 wk3Var;
        boolean z5;
        boolean z6;
        boolean z7;
        vt4 vt4Var7;
        vt4 vt4Var8 = vt4Var3;
        vt4 vt4Var9 = vt4Var5;
        ba5 ba5Var = lre.g;
        rv4Var.g0(-347815526);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i14 = i | i2;
        int i15 = 16;
        if (rv4Var.g(z2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i16 = i14 | i3;
        int i17 = 256;
        if (rv4Var.g(z3)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i18 = i16 | i4;
        if (rv4Var.g(true)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i19 = i18 | i5;
        if (rv4Var.g(true)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i20 = i19 | i6;
        if (rv4Var.f(lhaVar)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i21 = i20 | i7;
        if (rv4Var.f(qrVar)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i22 = i21 | i8;
        if (rv4Var.h(vt4Var)) {
            i9 = 67108864;
        } else {
            i9 = 33554432;
        }
        int i23 = i22 | i9;
        if (rv4Var.h(vt4Var2)) {
            i10 = 536870912;
        } else {
            i10 = 268435456;
        }
        int i24 = i23 | i10;
        if (rv4Var.h(vt4Var8)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        if (rv4Var.h(vt4Var4)) {
            i15 = 32;
        }
        int i25 = i11 | i15;
        if (!rv4Var.h(vt4Var9)) {
            i17 = 128;
        }
        int i26 = i25 | i17;
        if ((i24 & 306783379) == 306783378 && (i26 & Token.EXPR_VOID) == 146) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (rv4Var.U(i24 & 1, z4)) {
            nq7 f = pna.f(nq7Var, 1.0f);
            gv9 a2 = ev9.a(new hz(8.0f, true, new vs(2)), kh5.G, rv4Var, 54);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, f);
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
            ar5 c = rp5.c((wk3) jk3.Y.getValue(), rv4Var, 0);
            jv9 jv9Var = jv9.a;
            kq7 kq7Var = kq7.a;
            nq7 a3 = jv9Var.a(1.0f, kq7Var, true);
            int i27 = (i24 >> 9) & Token.ASSIGN_MOD;
            a(c, a3, vt4Var, rv4Var, ((i24 >> 15) & 7168) | i27);
            a(rp5.c((wk3) ok3.s0.getValue(), rv4Var, 0), jv9Var.a(1.0f, kq7Var, true), vt4Var2, rv4Var, i27 | ((i24 >> 18) & 7168));
            rv4Var.e0(328418086);
            nq7 n = pna.n(kq7Var, 72.0f);
            lhaVar.getClass();
            nq7 e = lha.e(lhaVar, n, lha.c("tts_play", rv4Var), qrVar);
            rv4Var.q(false);
            nk0 nk0Var = kh5.e;
            b37 d = fu0.d(nk0Var, false);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, e);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, d);
            jce.F(npVar2, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p2);
            pu0 pu0Var = pu0.a;
            if (z) {
                rv4Var.e0(1073879509);
                i12 = i26;
                i13 = 0;
                z6 = true;
                eg0.f(pu0Var.a(pna.n(kq7Var, 68.0f), nk0Var), ((h27) rv4Var.j(j27.a)).a.a, null, rv4Var, 0, 4);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
                vt4Var8 = vt4Var3;
            } else {
                rv4Var2 = rv4Var;
                i12 = i26;
                i13 = 0;
                lh9 lh9Var = ax1.a;
                if (z3) {
                    rv4Var2.e0(1074202312);
                    ar5 c2 = rp5.c((wk3) jk3.R.getValue(), rv4Var2, 0);
                    nq7 n2 = pna.n(pu0Var.a(kq7Var, nk0Var), 72.0f);
                    abf abfVar = f27.a;
                    nq7 k = tte.k(n2, aye.s(abf.s(), rv4Var2));
                    tza tzaVar = j27.a;
                    nq7 v = nmd.v(k, ((h27) rv4Var2.j(tzaVar)).a.a, ba5Var);
                    if ((i12 & 14) == 4) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    Object P = rv4Var2.P();
                    if (!z7 && P != lh9Var) {
                        vt4Var7 = vt4Var3;
                    } else {
                        vt4Var7 = vt4Var3;
                        P = new umb(27, vt4Var7);
                        rv4Var2.o0(P);
                    }
                    nk5.a(c2, null, zbe.y(lbe.f(15, (vt4) P, v, null, false), 14.0f), ((h27) rv4Var2.j(tzaVar)).a.b, rv4Var2, 48, 0);
                    rv4Var2.q(false);
                    vt4Var8 = vt4Var7;
                } else {
                    vt4Var8 = vt4Var3;
                    rv4Var2.e0(1074874578);
                    if (z2) {
                        wk3Var = (wk3) ok3.W.getValue();
                    } else {
                        wk3Var = (wk3) ok3.a0.getValue();
                    }
                    ar5 c3 = rp5.c(wk3Var, rv4Var2, 0);
                    nq7 n3 = pna.n(pu0Var.a(kq7Var, nk0Var), 72.0f);
                    abf abfVar2 = f27.a;
                    nq7 k2 = tte.k(n3, aye.s(abf.s(), rv4Var2));
                    tza tzaVar2 = j27.a;
                    nq7 v2 = nmd.v(k2, ((h27) rv4Var2.j(tzaVar2)).a.a, ba5Var);
                    if ((i12 & 14) == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    Object P2 = rv4Var2.P();
                    if (z5 || P2 == lh9Var) {
                        P2 = new umb(28, vt4Var8);
                        rv4Var2.o0(P2);
                    }
                    nk5.a(c3, null, zbe.y(lbe.f(15, (vt4) P2, v2, null, false), 14.0f), ((h27) rv4Var2.j(tzaVar2)).a.b, rv4Var2, 48, 0);
                    rv4Var2.q(false);
                }
                z6 = true;
            }
            rv4Var2.q(z6);
            ar5 c4 = rp5.c((wk3) ok3.r0.getValue(), rv4Var2, i13);
            nq7 a4 = jv9Var.a(1.0f, kq7Var, z6);
            int i28 = (i24 >> 6) & Token.ASSIGN_MOD;
            vt4Var6 = vt4Var4;
            a(c4, a4, vt4Var6, rv4Var2, ((i12 << 6) & 7168) | i28);
            vt4Var9 = vt4Var5;
            a(rp5.c((wk3) jk3.X.getValue(), rv4Var2, i13), jv9Var.a(1.0f, kq7Var, true), vt4Var9, rv4Var2, ((i12 << 3) & 7168) | i28);
            rv4Var2.q(true);
        } else {
            rv4Var2 = rv4Var;
            vt4Var6 = vt4Var4;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new cj7(z, z2, z3, lhaVar, qrVar, nq7Var, vt4Var, vt4Var2, vt4Var8, vt4Var6, vt4Var9, i);
        }
    }

    public static final void c(ar5 ar5Var, String str, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        Object obj;
        int i2;
        String str2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(2058851683);
        if ((i & 6) == 0) {
            obj = ar5Var;
            if (rv4Var2.f(obj)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            obj = ar5Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            if (rv4Var2.f(str2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        } else {
            str2 = str;
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
            if (rv4Var2.h(vt4Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        int i7 = i2;
        if ((i7 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i7 & 1, z)) {
            nq7 k = tte.k(nq7Var, r0f.z(rv4Var2).b);
            long j = r0f.y(rv4Var2).p;
            ba5 ba5Var = lre.g;
            nq7 A = zbe.A(lbe.f(15, vt4Var, a82.g(rv4Var2, 8.0f, nmd.v(k, j, ba5Var), ba5Var), null, false), nae.e, 8.0f, 1);
            xn1 a2 = wn1.a(lz.c, kh5.J, rv4Var2, 48);
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
            long j2 = r0f.y(rv4Var2).q;
            kq7 kq7Var = kq7.a;
            nk5.a(obj, str2, pna.n(kq7Var, 24.0f), j2, rv4Var2, (i7 & 14) | 384 | (i7 & Token.ASSIGN_MOD), 0);
            xbe.i(rv4Var2, pna.h(kq7Var, 4.0f));
            oyb oybVar = r0f.A(rv4Var2).A;
            cvb.c(str, l0e.u(pna.f(zbe.A(kq7Var, 4.0f, nae.e, 2), 1.0f)), r0f.y(rv4Var2).q, null, zr1.q(9), null, null, null, 0L, null, new tlb(3), 0L, 0, false, 1, 0, null, oybVar, rv4Var, ((i7 >> 3) & 14) | 24624, 24576, 113640);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new y34(ar5Var, str, nq7Var, vt4Var, i, 1);
        }
    }

    public static final void d(String str, String str2, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(386905372);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var2.f(str2)) {
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
        if (rv4Var2.U(i5 & 1, z)) {
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
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            tza tzaVar = j27.a;
            oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.h;
            kq7 kq7Var = kq7.a;
            cvb.c(str, l0e.u(pna.f(kq7Var, 1.0f)), ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 1, 0, null, oybVar, rv4Var2, (i5 & 14) | 48, 24576, 113656);
            xbe.i(rv4Var2, pna.h(kq7Var, 4.0f));
            cvb.c(str2, pna.f(kq7Var, 1.0f), zl1.b(0.8f, ((h27) rv4Var2.j(tzaVar)).a.q), null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.k, rv4Var2, ((i5 >> 3) & 14) | 48, 0, 130040);
            rv4Var2 = rv4Var2;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new gp7(str, str2, nq7Var, i, 1);
        }
    }

    public static final void e(final int i, final int i2, final vt4 vt4Var, rv4 rv4Var, final nq7 nq7Var, final boolean z, final boolean z2, final boolean z3) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z4;
        boolean z5;
        wk3 wk3Var;
        boolean z6;
        boolean z7;
        rv4 rv4Var2 = rv4Var;
        nk0 nk0Var = kh5.e;
        rv4Var2.g0(-1683850740);
        if (rv4Var2.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i2 | i3;
        if (rv4Var2.g(z2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i10 = i9 | i4;
        if (rv4Var2.g(z3)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i11 = i10 | i5;
        if (rv4Var2.d(i)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i12 = i11 | i6;
        if (rv4Var.f(nq7Var)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i13 = i12 | i7;
        if (rv4Var2.h(vt4Var)) {
            i8 = 131072;
        } else {
            i8 = Parser.ARGC_LIMIT;
        }
        int i14 = i13 | i8;
        if ((74899 & i14) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (rv4Var2.U(i14 & 1, z4)) {
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, d);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            kq7 kq7Var = kq7.a;
            pu0 pu0Var = pu0.a;
            if (z) {
                rv4Var2.e0(-266847079);
                eg0.f(pu0Var.a(pna.n(kq7Var, 34.0f), nk0Var), ((h27) rv4Var2.j(j27.a)).a.q, null, rv4Var, 0, 4);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                lh9 lh9Var = ax1.a;
                if (z3) {
                    rv4Var2.e0(-266559399);
                    ar5 c = rp5.c((wk3) jk3.R.getValue(), rv4Var2, 0);
                    nq7 k = tte.k(pna.n(kq7Var, 40.0f), uu9.a);
                    if ((i14 & 458752) == 131072) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    Object P = rv4Var2.P();
                    if (z7 || P == lh9Var) {
                        P = new umb(23, vt4Var);
                        rv4Var2.o0(P);
                    }
                    nk5.a(c, null, zbe.y(lbe.f(15, (vt4) P, k, null, false), 8.0f), ((h27) rv4Var2.j(j27.a)).a.q, rv4Var2, 48, 0);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.e0(-266067801);
                    nq7 a2 = pu0Var.a(pna.n(kq7Var, 34.0f), nk0Var);
                    tza tzaVar = j27.a;
                    long j = ((h27) rv4Var2.j(tzaVar)).a.q;
                    long b = zl1.b(0.2f, ((h27) rv4Var2.j(tzaVar)).a.q);
                    if ((i14 & 7168) == 2048) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    Object P2 = rv4Var2.P();
                    if (z5 || P2 == lh9Var) {
                        P2 = new rg6(i, 2);
                        rv4Var2.o0(P2);
                    }
                    r79.b((vt4) P2, a2, j, 2.0f, b, 1, nae.e, rv4Var, 3072, 64);
                    rv4Var2 = rv4Var;
                    if (z2) {
                        wk3Var = (wk3) ok3.W.getValue();
                    } else {
                        wk3Var = (wk3) ok3.a0.getValue();
                    }
                    ar5 c2 = rp5.c(wk3Var, rv4Var2, 0);
                    long j2 = ((h27) rv4Var2.j(tzaVar)).a.q;
                    nq7 k2 = tte.k(pna.n(kq7Var, 40.0f), uu9.a);
                    if ((i14 & 458752) == 131072) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    Object P3 = rv4Var2.P();
                    if (z6 || P3 == lh9Var) {
                        P3 = new umb(24, vt4Var);
                        rv4Var2.o0(P3);
                    }
                    nk5.a(c2, null, zbe.y(lbe.f(15, (vt4) P3, k2, null, false), 6.0f), j2, rv4Var2, 48, 0);
                    rv4Var2.q(false);
                }
            }
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4(i, i2, vt4Var, nq7Var, z, z2, z3) { // from class: t0c
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ int d;
                public final /* synthetic */ nq7 e;
                public final /* synthetic */ vt4 f;

                {
                    this.a = z;
                    this.b = z2;
                    this.c = z3;
                    this.e = nq7Var;
                    this.f = vt4Var;
                }

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p2 = xoe.p(1);
                    e1c.e(this.d, p2, this.f, (rv4) obj, this.e, this.a, this.b, this.c);
                    return pvc.a;
                }
            };
        }
    }

    public static final void f(boolean z, String str, int i, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        boolean z4;
        aw7 aw7Var;
        boolean z5;
        boolean z6;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(398837868);
        if (rv4Var2.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (rv4Var2.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (rv4Var2.d(i)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i9 = i8 | i5;
        if (rv4Var2.h(xt4Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i10 = i9 | i6;
        if ((i10 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i10 & 1, z2)) {
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yae.z(Boolean.FALSE);
                rv4Var2.o0(P);
            }
            aw7 aw7Var2 = (aw7) P;
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var) {
                P2 = yae.z(Float.valueOf(i));
                rv4Var2.o0(P2);
            }
            aw7 aw7Var3 = (aw7) P2;
            Integer valueOf = Integer.valueOf(i);
            if ((i10 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P3 = rv4Var2.P();
            if (z3 || P3 == lh9Var) {
                P3 = new aa0(i, aw7Var2, aw7Var3, (m42) null);
                rv4Var2.o0(P3);
            }
            yte.g((lu4) P3, rv4Var2, valueOf);
            yya b = nq.b(((Number) aw7Var3.getValue()).floatValue(), null, null, rv4Var2, 0, 30);
            kpa kpaVar = kpa.a;
            tza tzaVar = j27.a;
            gpa d = kpa.d(((h27) rv4Var2.j(tzaVar)).a.a, ((h27) rv4Var2.j(tzaVar)).a.a, zl1.b(0.3f, ((h27) rv4Var2.j(tzaVar)).a.q), rv4Var2, 1012);
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
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            float floatValue = ((Number) b.getValue()).floatValue();
            jk1 jk1Var = new jk1(nae.e, 100.0f);
            int i11 = i10 & 14;
            if (i11 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P4 = rv4Var2.P();
            if (!z4 && P4 != lh9Var) {
                aw7Var = aw7Var3;
            } else {
                aw7Var = aw7Var3;
                P4 = new lf0(z, aw7Var2, aw7Var);
                rv4Var2.o0(P4);
            }
            xt4 xt4Var2 = (xt4) P4;
            if (i11 == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((57344 & i10) == 16384) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z7 = z5 | z6;
            Object P5 = rv4Var2.P();
            if (z7 || P5 == lh9Var) {
                P5 = new v0c(z, xt4Var, aw7Var, aw7Var2);
                rv4Var2.o0(P5);
            }
            dae.d(floatValue, xt4Var2, null, false, (vt4) P5, null, null, 0, obe.b, jce.E(-182748839, new a1a(z, d, aw7Var, 7), rv4Var2), jk1Var, rv4Var, 905969664, 0, 236);
            cvb.c(str, pna.f(kq7.a, 1.0f), zl1.b(0.6f, ((h27) rv4Var.j(tzaVar)).a.q), null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 2, false, 1, 0, null, ((h27) rv4Var.j(tzaVar)).b.k, rv4Var, ((i10 >> 3) & 14) | 48, 24960, 109560);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new eh7(z, str, i, nq7Var, xt4Var, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    public static final void g(final boolean z, final long j, final nq7 nq7Var, final vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, final vt4 vt4Var4, final vt4 vt4Var5, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        jv9 jv9Var;
        ?? r13;
        String A;
        rv4Var.g0(-242869396);
        if (rv4Var.e(j)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i9 = i | i2;
        if (rv4Var.h(vt4Var)) {
            i3 = 2048;
        } else {
            i3 = 1024;
        }
        int i10 = i9 | i3;
        if (rv4Var.h(vt4Var2)) {
            i4 = 16384;
        } else {
            i4 = 8192;
        }
        int i11 = i10 | i4;
        if (rv4Var.h(vt4Var3)) {
            i5 = 131072;
        } else {
            i5 = Parser.ARGC_LIMIT;
        }
        int i12 = i11 | i5;
        if (rv4Var.h(vt4Var4)) {
            i6 = 1048576;
        } else {
            i6 = 524288;
        }
        int i13 = i12 | i6;
        if (rv4Var.h(vt4Var5)) {
            i7 = 8388608;
        } else {
            i7 = 4194304;
        }
        int i14 = i13 | i7;
        if ((4793491 & i14) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i14 & 1, z2)) {
            su9 su9Var = uu9.a;
            nq7 k = tte.k(zbe.y(nmd.v(tte.k(nq7Var, su9Var), zl1.b(0.8f, rm1.g(((h27) rv4Var.j(j27.a)).a, 4.0f)), lre.g), 10.0f), su9Var);
            gv9 a2 = ev9.a(new hz(4.0f, true, new vs(2)), kh5.F, rv4Var, 6);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, k);
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
            kq7 kq7Var = kq7.a;
            jv9 jv9Var2 = jv9.a;
            if (z) {
                rv4Var.e0(-282408496);
                int i15 = i14 & 7168;
                i8 = i14;
                jv9Var = jv9Var2;
                r13 = 0;
                c(rp5.c((wk3) ok3.b0.getValue(), rv4Var, 0), yqe.A((y3b) o3b.K.getValue(), rv4Var), jv9Var2.a(1.0f, kq7Var, true), vt4Var, rv4Var, i15);
                rv4Var.q(false);
            } else {
                i8 = i14;
                jv9Var = jv9Var2;
                r13 = 0;
                rv4Var.e0(-282129806);
                rv4Var.q(false);
            }
            ar5 c = rp5.c((wk3) ok3.t0.getValue(), rv4Var, r13);
            if (j > 0) {
                rv4Var.e0(-282000691);
                rv4Var.q(r13);
                A = tn3.r(j);
            } else {
                rv4Var.e0(-281926322);
                A = yqe.A((y3b) z1b.k0.getValue(), rv4Var);
                rv4Var.q(r13);
            }
            c(c, A, jv9Var.a(1.0f, kq7Var, true), vt4Var2, rv4Var, (i8 >> 3) & 7168);
            c(rp5.c((wk3) rk3.a.getValue(), rv4Var, r13), yqe.A((y3b) z1b.j0.getValue(), rv4Var), jv9Var.a(1.0f, kq7Var, true), vt4Var3, rv4Var, (i8 >> 6) & 7168);
            c(rp5.c((wk3) ok3.D.getValue(), rv4Var, 0), yqe.A((y3b) z1b.y.getValue(), rv4Var), jv9Var.a(1.0f, kq7Var, true), vt4Var4, rv4Var, (i8 >> 9) & 7168);
            c(rp5.c((wk3) ok3.p0.getValue(), rv4Var, 0), yqe.A((y3b) b3b.b0.getValue(), rv4Var), jv9Var.a(1.0f, kq7Var, true), vt4Var5, rv4Var, (i8 >> 12) & 7168);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4(z, j, nq7Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, i) { // from class: w0c
                public final /* synthetic */ vt4 C;
                public final /* synthetic */ vt4 D;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ long b;
                public final /* synthetic */ nq7 c;
                public final /* synthetic */ vt4 d;
                public final /* synthetic */ vt4 e;
                public final /* synthetic */ vt4 f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p2 = xoe.p(391);
                    e1c.g(this.a, this.b, this.c, this.d, this.e, this.f, this.C, this.D, (rv4) obj, p2);
                    return pvc.a;
                }
            };
        }
    }

    public static final void h(t2c t2cVar, lha lhaVar, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        Object obj;
        Object obj2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        rv4Var.g0(-1446868147);
        if ((i & 6) == 0) {
            if (rv4Var.f(t2cVar)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            obj = lhaVar;
            if (rv4Var.f(obj)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        } else {
            obj = lhaVar;
        }
        if ((i & 384) == 0) {
            obj2 = nq7Var;
            if (rv4Var.f(obj2)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        } else {
            obj2 = nq7Var;
        }
        if ((i2 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            aw7 z3 = jsc.z(t2cVar.F, rv4Var);
            int i6 = ((ozb) jsc.z(t2cVar.H, rv4Var).getValue()).h;
            Object[] objArr = new Object[0];
            Object P = rv4Var.P();
            Object obj3 = ax1.a;
            if (P == obj3) {
                P = new ekb(28);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 48);
            Object[] objArr2 = new Object[0];
            Object P2 = rv4Var.P();
            if (P2 == obj3) {
                P2 = new ekb(29);
                rv4Var.o0(P2);
            }
            aw7 aw7Var2 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var, 48);
            Object[] objArr3 = new Object[0];
            boolean f = rv4Var.f(aw7Var);
            Object P3 = rv4Var.P();
            if (f || P3 == obj3) {
                P3 = new p0c(aw7Var, 6);
                rv4Var.o0(P3);
            }
            aw7 aw7Var3 = (aw7) zpe.k(objArr3, (vt4) P3, rv4Var, 0);
            if (!((n1c) z3.getValue()).g && ((n1c) z3.getValue()).h) {
                z2 = true;
            } else {
                z2 = false;
            }
            rte.c(z2, null, zt3.g(null, 3), zt3.i(null, 3), null, jce.E(-1643010523, new b0c(obj2, aw7Var, aw7Var2, aw7Var3, t2cVar, obj, i6, z3), rv4Var), rv4Var, 200064, 18);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new va(t2cVar, lhaVar, nq7Var, i, 29);
        }
    }

    public static final long i(aw7 aw7Var) {
        return ((zy5) aw7Var.getValue()).a;
    }

    public static final float j(aw7 aw7Var) {
        return ((Number) aw7Var.getValue()).floatValue();
    }

    public static final void k(lzb lzbVar, cz7 cz7Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        pb2 pb2Var;
        lzbVar.getClass();
        cz7Var.getClass();
        rv4Var.g0(1961566808);
        if (rv4Var.f(lzbVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var.f(cz7Var)) {
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
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                t2c t2cVar = (t2c) ((fdd) voe.z(cm9.a(t2c.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                pm1 pm1Var = (pm1) lzbVar.a.getValue();
                if (pm1Var == null) {
                    rv4Var.e0(-424931229);
                    pm1Var = ((h27) rv4Var.j(j27.a)).a;
                } else {
                    rv4Var.e0(-424932655);
                }
                rv4Var.q(false);
                j27.b(pm1Var, null, null, jce.E(-192791292, new vg7(20, t2cVar, cz7Var, nq7Var), rv4Var), rv4Var, 3072, 6);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new vg7(lzbVar, cz7Var, nq7Var, i, 21);
        }
    }

    public static final void l(cz7 cz7Var, t2c t2cVar, lha lhaVar, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        rv4Var.g0(657346842);
        if ((i & 6) == 0) {
            if (rv4Var.f(cz7Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(t2cVar)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(lhaVar)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(nq7Var)) {
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
        int i8 = i2;
        if ((i8 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i8 & 1, z)) {
            hc2.b(nq7Var, null, jce.E(-1602882064, new l68(t2cVar, cz7Var, jsc.z(t2cVar.F, rv4Var), lhaVar, xt4Var, jsc.z(t2cVar.H, rv4Var), jsc.z(t2cVar.G, rv4Var), jsc.z(t2cVar.I, rv4Var), jsc.z(t2cVar.J, rv4Var)), rv4Var), rv4Var, ((i8 >> 9) & 14) | 3072, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ud1(cz7Var, t2cVar, lhaVar, nq7Var, xt4Var, i);
        }
    }

    public static final void m(final n1c n1cVar, final f1c f1cVar, ozb ozbVar, final z1c z1cVar, final lha lhaVar, final qr qrVar, nq7 nq7Var, vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, final vt4 vt4Var4, final vt4 vt4Var5, final vt4 vt4Var6, final vt4 vt4Var7, final vt4 vt4Var8, final vt4 vt4Var9, final vt4 vt4Var10, final vt4 vt4Var11, final vt4 vt4Var12, final vt4 vt4Var13, final xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        Object obj;
        rv4Var.g0(-1454897445);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? rv4Var.f(n1cVar) : rv4Var.h(n1cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? rv4Var.f(f1cVar) : rv4Var.h(f1cVar) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? rv4Var.f(z1cVar) : rv4Var.h(z1cVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= rv4Var.f(lhaVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? rv4Var.f(qrVar) : rv4Var.h(qrVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= rv4Var.f(nq7Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            obj = vt4Var;
            i2 |= rv4Var.h(obj) ? 8388608 : 4194304;
        } else {
            obj = vt4Var;
        }
        if ((i & 100663296) == 0) {
            i2 |= rv4Var.h(vt4Var2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= rv4Var.h(vt4Var3) ? 536870912 : 268435456;
        }
        if (rv4Var.U(i2 & 1, ((i2 & 306783251) == 306783250 && (306783379 & (((((((3462 | (rv4Var.h(vt4Var5) ? ' ' : (char) 16)) | (rv4Var.h(vt4Var8) ? 16384 : 8192)) | (rv4Var.h(vt4Var9) ? (char) 0 : (char) 0)) | (rv4Var.h(vt4Var10) ? (char) 0 : (char) 0)) | (rv4Var.h(vt4Var11) ? (char) 0 : (char) 0)) | (rv4Var.h(vt4Var12) ? (char) 0 : (char) 0)) | (rv4Var.h(vt4Var13) ? (char) 0 : (char) 0))) == 306783378 && ((rv4Var.h(xt4Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            lhaVar.getClass();
            final vt4 vt4Var14 = obj;
            v9b.a(lha.d(lhaVar, nq7Var, lha.c("tts_container", rv4Var), qrVar), null, 0L, 0L, nae.e, nae.e, null, jce.E(-460340170, new lu4() { // from class: s0c
                @Override // defpackage.lu4
                public final Object invoke(Object obj2, Object obj3) {
                    boolean z;
                    rv4 rv4Var2 = (rv4) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 3) != 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (rv4Var2.U(intValue & 1, z)) {
                        kq7 kq7Var = kq7.a;
                        nq7 A = zbe.A(mwe.u(q1d.h(rv4Var2, kq7Var), false, 15), 24.0f, nae.e, 2);
                        xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
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
                        nq7 A2 = zbe.A(pna.f(kq7Var, 1.0f), nae.e, 12.0f, 1);
                        gv9 a3 = ev9.a(lz.a, kh5.F, rv4Var2, 0);
                        int hashCode2 = Long.hashCode(rv4Var2.T);
                        xt8 l2 = rv4Var2.l();
                        nq7 p2 = lye.p(rv4Var2, A2);
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
                        kwe.d(rp5.c((wk3) ok3.t.getValue(), rv4Var2, 0), null, 0L, vt4Var14, rv4Var2, 0, 6);
                        xbe.i(rv4Var2, new we6(1.0f, true));
                        kwe.d(rp5.c((wk3) jk3.w.getValue(), rv4Var2, 0), null, 0L, vt4Var2, rv4Var2, 0, 6);
                        rv4Var2.q(true);
                        nq7 e = rs8.e(1.0f, pna.f(kq7Var, 1.0f), true);
                        b37 d = fu0.d(kh5.a, false);
                        int hashCode3 = Long.hashCode(rv4Var2.T);
                        xt8 l3 = rv4Var2.l();
                        nq7 p3 = lye.p(rv4Var2, e);
                        rv4Var2.i0();
                        if (rv4Var2.S) {
                            rv4Var2.k(zx1Var);
                        } else {
                            rv4Var2.r0();
                        }
                        jce.F(npVar, rv4Var2, d);
                        jce.F(npVar2, rv4Var2, l3);
                        s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
                        jce.F(npVar4, rv4Var2, p3);
                        rv4Var2.e0(-1337715595);
                        n1c n1cVar2 = n1c.this;
                        String str = n1cVar2.a;
                        String str2 = n1cVar2.b;
                        String str3 = n1cVar2.f;
                        String str4 = n1cVar2.e;
                        u22 u22Var = r0f.d;
                        nq7 a4 = pu0.a.a(zbe.y(pna.c, 24.0f), kh5.e);
                        lha lhaVar2 = lhaVar;
                        lhaVar2.getClass();
                        iha c = lha.c("tts_cover", rv4Var2);
                        qr qrVar2 = qrVar;
                        nq7 e2 = lha.e(lhaVar2, a4, c, qrVar2);
                        vt4 vt4Var15 = vt4Var3;
                        boolean f = rv4Var2.f(vt4Var15);
                        Object P = rv4Var2.P();
                        lh9 lh9Var = ax1.a;
                        if (f || P == lh9Var) {
                            P = new umb(25, vt4Var15);
                            rv4Var2.o0(P);
                        }
                        do5.c(str, str2, str3, str4, u22Var, st0.s(tte.k(q1d.b(e2, false, nae.e, (vt4) P, 3), ((h27) rv4Var2.j(j27.a)).c.c), 4.0f, null, 30), rv4Var2, 24576);
                        xbe.i(rv4Var2, hl5.e(rv4Var2, false, true, kq7Var, 12.0f));
                        e1c.d(str2, n1cVar2.c, pna.f(kq7Var, 1.0f), rv4Var2, 384);
                        xbe.i(rv4Var2, pna.h(kq7Var, 24.0f));
                        f1c f1cVar2 = f1cVar;
                        boolean z2 = f1cVar2.a;
                        String str5 = n1cVar2.d;
                        z1c z1cVar2 = z1cVar;
                        int i3 = z1cVar2.a;
                        nq7 A3 = zbe.A(pna.f(kq7Var, 1.0f), 12.0f, nae.e, 2);
                        xt4 xt4Var2 = xt4Var;
                        boolean f2 = rv4Var2.f(xt4Var2);
                        Object P2 = rv4Var2.P();
                        if (f2 || P2 == lh9Var) {
                            P2 = new u0c(0, xt4Var2);
                            rv4Var2.o0(P2);
                        }
                        e1c.f(z2, str5, i3, A3, (xt4) P2, rv4Var2, 3072);
                        xbe.i(rv4Var2, pna.h(kq7Var, 24.0f));
                        e1c.b(f1cVar2.a, f1cVar2.b, f1cVar2.c, lhaVar2, qrVar2, pna.f(zbe.A(kq7Var, 12.0f, nae.e, 2), 1.0f), vt4Var9, vt4Var10, vt4Var11, vt4Var12, vt4Var13, rv4Var2, 12582912);
                        xbe.i(rv4Var2, pna.h(kq7Var, 24.0f));
                        e1c.g(true, z1cVar2.b, pna.f(kq7Var, 1.0f), vt4Var4, vt4Var7, vt4Var5, vt4Var6, vt4Var8, rv4Var2, 390);
                        hl5.w(kq7Var, 12.0f, rv4Var2, true);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, 12582912, Token.ELSE);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new up7(n1cVar, f1cVar, ozbVar, z1cVar, lhaVar, qrVar, nq7Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, vt4Var7, vt4Var8, vt4Var9, vt4Var10, vt4Var11, vt4Var12, vt4Var13, xt4Var, i);
        }
    }

    public static final void n(final n1c n1cVar, final f1c f1cVar, final ozb ozbVar, final z1c z1cVar, final k2c k2cVar, final lha lhaVar, final qr qrVar, final nq7 nq7Var, final vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, final vt4 vt4Var4, final vt4 vt4Var5, final vt4 vt4Var6, final vt4 vt4Var7, final vt4 vt4Var8, final vt4 vt4Var9, final vt4 vt4Var10, final vt4 vt4Var11, final vt4 vt4Var12, final vt4 vt4Var13, final xt4 xt4Var, final lu4 lu4Var, rv4 rv4Var, final int i) {
        int i2;
        Object obj;
        Object obj2;
        rv4Var.g0(-1641169604);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? rv4Var.f(n1cVar) : rv4Var.h(n1cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? rv4Var.f(f1cVar) : rv4Var.h(f1cVar) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? rv4Var.f(z1cVar) : rv4Var.h(z1cVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            obj = k2cVar;
            i2 |= rv4Var.f(obj) ? 16384 : 8192;
        } else {
            obj = k2cVar;
        }
        if ((196608 & i) == 0) {
            i2 |= rv4Var.f(lhaVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? rv4Var.f(qrVar) : rv4Var.h(qrVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= rv4Var.f(nq7Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            obj2 = vt4Var;
            i2 |= rv4Var.h(obj2) ? 67108864 : 33554432;
        } else {
            obj2 = vt4Var;
        }
        if ((i & 805306368) == 0) {
            i2 |= rv4Var.h(vt4Var2) ? 536870912 : 268435456;
        }
        int i3 = i2;
        if (rv4Var.U(i3 & 1, ((i3 & 306783251) == 306783250 && (306783379 & (((((((27696 | (rv4Var.h(vt4Var3) ? (char) 4 : (char) 2)) | (rv4Var.h(vt4Var5) ? 256 : 128)) | (rv4Var.h(vt4Var8) ? (char) 0 : (char) 0)) | (rv4Var.h(vt4Var9) ? (char) 0 : (char) 0)) | (rv4Var.h(vt4Var10) ? (char) 0 : (char) 0)) | (rv4Var.h(vt4Var11) ? (char) 0 : (char) 0)) | (rv4Var.h(vt4Var12) ? (char) 0 : (char) 0))) == 306783378 && ((((rv4Var.h(vt4Var13) ? (char) 4 : (char) 2) | (rv4Var.h(xt4Var) ? ' ' : (char) 16)) | (rv4Var.h(lu4Var) ? (char) 256 : (char) 128)) & Token.EXPR_VOID) == 146) ? false : true)) {
            lhaVar.getClass();
            final k2c k2cVar2 = obj;
            final vt4 vt4Var14 = obj2;
            v9b.a(lha.d(lhaVar, nq7Var, lha.c("tts_container", rv4Var), qrVar), null, 0L, 0L, nae.e, nae.e, null, jce.E(-1648650025, new lu4() { // from class: q0c
                @Override // defpackage.lu4
                public final Object invoke(Object obj3, Object obj4) {
                    boolean z;
                    rv4 rv4Var2 = (rv4) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 3) != 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (rv4Var2.U(intValue & 1, z)) {
                        kq7 kq7Var = kq7.a;
                        nq7 y = zbe.y(mwe.u(q1d.h(rv4Var2, pna.f(kq7Var, 1.0f)), false, 15), 12.0f);
                        mk0 mk0Var = kh5.F;
                        dz dzVar = lz.a;
                        gv9 a2 = ev9.a(dzVar, mk0Var, rv4Var2, 0);
                        int hashCode = Long.hashCode(rv4Var2.T);
                        xt8 l = rv4Var2.l();
                        nq7 p = lye.p(rv4Var2, y);
                        rw1.k.getClass();
                        vt4 vt4Var15 = qw1.b;
                        rv4Var2.i0();
                        if (rv4Var2.S) {
                            rv4Var2.k(vt4Var15);
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
                        k2c k2cVar3 = k2c.this;
                        String str = k2cVar3.a;
                        List list = k2cVar3.b;
                        jv9 jv9Var = jv9.a;
                        s9e.k(str, list, null, pna.c(jv9Var.a(1.0f, kq7Var, true), 1.0f), lu4Var, rv4Var2, 0, 4);
                        xbe.i(rv4Var2, pna.s(kq7Var, 12.0f));
                        nq7 c = pna.c(jv9Var.a(1.0f, kq7Var, true), 1.0f);
                        xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
                        int hashCode2 = Long.hashCode(rv4Var2.T);
                        xt8 l2 = rv4Var2.l();
                        nq7 p2 = lye.p(rv4Var2, c);
                        rv4Var2.i0();
                        if (rv4Var2.S) {
                            rv4Var2.k(vt4Var15);
                        } else {
                            rv4Var2.r0();
                        }
                        jce.F(npVar, rv4Var2, a3);
                        jce.F(npVar2, rv4Var2, l2);
                        s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
                        jce.F(npVar4, rv4Var2, p2);
                        nq7 f = pna.f(kq7Var, 1.0f);
                        nk0 nk0Var = kh5.a;
                        b37 d = fu0.d(nk0Var, false);
                        int hashCode3 = Long.hashCode(rv4Var2.T);
                        xt8 l3 = rv4Var2.l();
                        nq7 p3 = lye.p(rv4Var2, f);
                        rv4Var2.i0();
                        if (rv4Var2.S) {
                            rv4Var2.k(vt4Var15);
                        } else {
                            rv4Var2.r0();
                        }
                        jce.F(npVar, rv4Var2, d);
                        jce.F(npVar2, rv4Var2, l3);
                        s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
                        jce.F(npVar4, rv4Var2, p3);
                        n1c n1cVar2 = n1cVar;
                        e1c.d(n1cVar2.b, n1cVar2.c, pna.f(zbe.A(kq7Var, 24.0f, nae.e, 2), 1.0f), rv4Var2, 384);
                        nq7 f2 = pna.f(kq7Var, 1.0f);
                        gv9 a4 = ev9.a(dzVar, mk0Var, rv4Var2, 0);
                        int hashCode4 = Long.hashCode(rv4Var2.T);
                        xt8 l4 = rv4Var2.l();
                        nq7 p4 = lye.p(rv4Var2, f2);
                        rv4Var2.i0();
                        if (rv4Var2.S) {
                            rv4Var2.k(vt4Var15);
                        } else {
                            rv4Var2.r0();
                        }
                        jce.F(npVar, rv4Var2, a4);
                        jce.F(npVar2, rv4Var2, l4);
                        s21.t(hashCode4, rv4Var2, npVar3, rv4Var2, kgVar);
                        jce.F(npVar4, rv4Var2, p4);
                        kwe.d(rp5.c((wk3) ok3.t.getValue(), rv4Var2, 0), null, 0L, vt4Var14, rv4Var2, 0, 6);
                        xbe.i(rv4Var2, jv9Var.a(1.0f, kq7Var, true));
                        kwe.d(rp5.c((wk3) jk3.w.getValue(), rv4Var2, 0), null, 0L, vt4Var2, rv4Var2, 0, 6);
                        rv4Var2.q(true);
                        rv4Var2.q(true);
                        nq7 l5 = tte.l(zbe.A(pna.f(kq7Var, 1.0f), 24.0f, nae.e, 2).a0(new we6(1.0f, false)));
                        b37 d2 = fu0.d(nk0Var, false);
                        int hashCode5 = Long.hashCode(rv4Var2.T);
                        xt8 l6 = rv4Var2.l();
                        nq7 p5 = lye.p(rv4Var2, l5);
                        rv4Var2.i0();
                        if (rv4Var2.S) {
                            rv4Var2.k(vt4Var15);
                        } else {
                            rv4Var2.r0();
                        }
                        jce.F(npVar, rv4Var2, d2);
                        jce.F(npVar2, rv4Var2, l6);
                        s21.t(hashCode5, rv4Var2, npVar3, rv4Var2, kgVar);
                        jce.F(npVar4, rv4Var2, p5);
                        rv4Var2.e0(-1275644893);
                        String str2 = n1cVar2.a;
                        String str3 = n1cVar2.b;
                        String str4 = n1cVar2.f;
                        String str5 = n1cVar2.e;
                        u22 u22Var = r0f.d;
                        nq7 a5 = pu0.a.a(tte.l(jsc.t(0.6666667f, zbe.A(pna.c(kq7Var, 1.0f), nae.e, 32.0f, 1), true)), kh5.e);
                        lha lhaVar2 = lhaVar;
                        lhaVar2.getClass();
                        iha c2 = lha.c("tts_cover", rv4Var2);
                        qr qrVar2 = qrVar;
                        nq7 e = lha.e(lhaVar2, a5, c2, qrVar2);
                        vt4 vt4Var16 = vt4Var3;
                        boolean f3 = rv4Var2.f(vt4Var16);
                        Object P = rv4Var2.P();
                        Object obj5 = ax1.a;
                        if (f3 || P == obj5) {
                            P = new umb(26, vt4Var16);
                            rv4Var2.o0(P);
                        }
                        do5.c(str2, str3, str4, str5, u22Var, st0.s(tte.k(q1d.b(e, false, nae.e, (vt4) P, 3), ((h27) rv4Var2.j(j27.a)).c.c), 4.0f, null, 30), rv4Var2, 24576);
                        rv4Var2.q(false);
                        rv4Var2.q(true);
                        f1c f1cVar2 = f1cVar;
                        boolean z2 = f1cVar2.a;
                        String str6 = n1cVar2.d;
                        z1c z1cVar2 = z1cVar;
                        int i4 = z1cVar2.a;
                        nq7 f4 = pna.f(kq7Var, 1.0f);
                        xt4 xt4Var2 = xt4Var;
                        boolean f5 = rv4Var2.f(xt4Var2);
                        Object P2 = rv4Var2.P();
                        if (f5 || P2 == obj5) {
                            P2 = new u0c(1, xt4Var2);
                            rv4Var2.o0(P2);
                        }
                        e1c.f(z2, str6, i4, f4, (xt4) P2, rv4Var2, 3072);
                        xbe.i(rv4Var2, pna.h(kq7Var, 24.0f));
                        e1c.b(f1cVar2.a, f1cVar2.b, f1cVar2.c, lhaVar2, qrVar2, pna.f(zbe.A(kq7Var, 12.0f, nae.e, 2), 1.0f), vt4Var9, vt4Var10, vt4Var11, vt4Var12, vt4Var13, rv4Var2, 12582912);
                        xbe.i(rv4Var2, pna.h(kq7Var, 24.0f));
                        e1c.g(false, z1cVar2.b, pna.f(kq7Var, 1.0f), vt4Var4, vt4Var6, vt4Var5, vt4Var7, vt4Var8, rv4Var2, 390);
                        rv4Var2.q(true);
                        rv4Var2.q(true);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, 12582912, Token.ELSE);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: r0c
                @Override // defpackage.lu4
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int p = xoe.p(i | 1);
                    e1c.n(n1c.this, f1cVar, ozbVar, z1cVar, k2cVar, lhaVar, qrVar, nq7Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, vt4Var7, vt4Var8, vt4Var9, vt4Var10, vt4Var11, vt4Var12, vt4Var13, xt4Var, lu4Var, (rv4) obj3, p);
                    return pvc.a;
                }
            };
        }
    }
}
