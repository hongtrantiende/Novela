package defpackage;

import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xi9  reason: default package */
/* loaded from: classes3.dex */
public abstract class xi9 {
    public static final List a = sl1.C0(new ry5(0, 10, 1));

    public static final void a(int i, int i2, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var) {
        int i3;
        boolean z;
        xt4 xt4Var2;
        aw7 aw7Var;
        int i4;
        int i5;
        int i6;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1652030827);
        if ((i2 & 6) == 0) {
            if (rv4Var2.d(i)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i3 |= i4;
        }
        if ((i3 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i3 & 1, z)) {
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yae.z(Boolean.FALSE);
                rv4Var2.o0(P);
            }
            aw7 aw7Var2 = (aw7) P;
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var) {
                P2 = new ao7(aw7Var2, 23);
                rv4Var2.o0(P2);
            }
            kq7 kq7Var = kq7.a;
            nq7 a0 = lbe.f(15, (vt4) P2, kq7Var, null, false).a0(nq7Var);
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, a0);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, d);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, kq7Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a2);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            we6 f = s21.f(rv4Var2, p2, npVar4, 1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, f);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p3);
            String A = yqe.A((y3b) f3b.i0.getValue(), rv4Var2);
            nq7 f2 = pna.f(kq7Var, 1.0f);
            tza tzaVar = j27.a;
            cvb.c(A, f2, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, oyb.a(((h27) rv4Var2.j(tzaVar)).b.j, 0L, 0L, dq4.f, null, null, 0L, null, 0, 0L, null, 16777211), rv4Var, 48, 24576, 114684);
            cvb.c(d(i, rv4Var), null, zl1.b(0.5f, ((zl1) rv4Var.j(r12.a)).a), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.l, rv4Var, 0, 0, 131066);
            rv4Var2 = rv4Var;
            s21.x(rv4Var2, true, kq7Var, 8.0f, rv4Var2);
            nk5.a(rp5.c((wk3) ok3.u.getValue(), rv4Var2, 0), null, pna.n(kq7Var, 24.0f), 0L, rv4Var2, 432, 8);
            rv4Var2.q(true);
            boolean booleanValue = ((Boolean) aw7Var2.getValue()).booleanValue();
            Object P3 = rv4Var2.P();
            if (P3 == lh9Var) {
                aw7Var = aw7Var2;
                P3 = new ao7(aw7Var, 24);
                rv4Var2.o0(P3);
            } else {
                aw7Var = aw7Var2;
            }
            xt4Var2 = xt4Var;
            iue.e(booleanValue, null, 0L, null, nae.e, null, (vt4) P3, jce.E(21796367, new vi9(i, 0, xt4Var2, aw7Var), rv4Var2), rv4Var2, 14155776, 62);
            rv4Var2.q(true);
        } else {
            xt4Var2 = xt4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new wi9(i, nq7Var, xt4Var2, i2, 0);
        }
    }

    public static final void b(final yi9 yi9Var, final rh8 rh8Var, final nq7 nq7Var, final xt4 xt4Var, final xt4 xt4Var2, final xt4 xt4Var3, final xt4 xt4Var4, final vt4 vt4Var, final vt4 vt4Var2, xt4 xt4Var5, xt4 xt4Var6, final vt4 vt4Var3, final vt4 vt4Var4, final vt4 vt4Var5, final vt4 vt4Var6, final vt4 vt4Var7, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        np npVar;
        np npVar2;
        String str;
        final xt4 xt4Var7 = xt4Var5;
        final xt4 xt4Var8 = xt4Var6;
        rv4Var.g0(-931214779);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? rv4Var.f(yi9Var) : rv4Var.h(yi9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rv4Var.f(rh8Var) ? 32 : 16;
        }
        int i4 = i & 384;
        int i5 = Token.CASE;
        if (i4 == 0) {
            i2 |= rv4Var.f(nq7Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= rv4Var.h(xt4Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= rv4Var.h(xt4Var2) ? 16384 : 8192;
        }
        int i6 = i & 196608;
        int i7 = Parser.ARGC_LIMIT;
        if (i6 == 0) {
            i2 |= rv4Var.h(xt4Var3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= rv4Var.h(xt4Var4) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= rv4Var.h(vt4Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= rv4Var.h(vt4Var2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= rv4Var.h(xt4Var7) ? 536870912 : 268435456;
        }
        int i8 = (rv4Var.h(xt4Var8) ? 4 : 2) | (rv4Var.h(vt4Var3) ? 32 : 16);
        if (rv4Var.h(vt4Var4)) {
            i5 = 256;
        }
        int i9 = i8 | i5 | (rv4Var.h(vt4Var5) ? 2048 : 1024) | (rv4Var.h(vt4Var6) ? 16384 : 8192);
        if (rv4Var.h(vt4Var7)) {
            i7 = 131072;
        }
        int i10 = i9 | i7;
        int i11 = i2;
        if (rv4Var.U(i11 & 1, ((306783379 & i2) == 306783378 && (i10 & 74899) == 74898) ? false : true)) {
            Object[] objArr = new Object[0];
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (P == obj) {
                P = new pa9(5);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 48);
            nq7 C = rte.C(nq7Var.a0(pna.c), rte.u(rv4Var), 14);
            lk0 lk0Var = kh5.I;
            ez ezVar = lz.c;
            xn1 a2 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, C);
            rw1.k.getClass();
            vt4 vt4Var8 = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var8);
            } else {
                rv4Var.r0();
            }
            np npVar3 = qw1.f;
            jce.F(npVar3, rv4Var, a2);
            np npVar4 = qw1.e;
            jce.F(npVar4, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar5 = qw1.g;
            jce.F(npVar5, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar6 = qw1.d;
            jce.F(npVar6, rv4Var, p);
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var, zbe.x(kq7Var, rh8Var));
            cvb.c(yqe.A((y3b) k3b.k0.getValue(), rv4Var), zbe.y(kq7Var, 16.0f), r0f.y(rv4Var).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).h, rv4Var, 48, 0, 131064);
            nq7 k = tte.k(zbe.A(pna.f(kq7Var, 1.0f), 16.0f, nae.e, 2), r0f.z(rv4Var).d);
            xn1 a3 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, k);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var8);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar3, rv4Var, a3);
            jce.F(npVar4, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar5, rv4Var, kgVar);
            jce.F(npVar6, rv4Var, p2);
            boolean z = yi9Var.b;
            long j = yi9Var.f;
            String A = yqe.A((y3b) f3b.X.getValue(), rv4Var);
            String A2 = yqe.A((y3b) f3b.Y.getValue(), rv4Var);
            nq7 k2 = tte.k(kq7Var, r0f.z(rv4Var).a);
            long g = rm1.g(r0f.y(rv4Var), 1.0f);
            ba5 ba5Var = lre.g;
            l0e.n(null, A, A2, zbe.y(nmd.v(k2, g, ba5Var), 16.0f), false, z, xt4Var, rv4Var, (i11 << 9) & 3670016, 17);
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            l0e.n(null, yqe.A((y3b) f3b.o0.getValue(), rv4Var), yqe.A((y3b) f3b.p0.getValue(), rv4Var), nk2.g(rv4Var, 1.0f, tte.k(kq7Var, r0f.z(rv4Var).a), ba5Var, 16.0f), false, yi9Var.d, xt4Var3, rv4Var, (i11 << 3) & 3670016, 17);
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            l0e.n(null, yqe.A((y3b) f3b.V.getValue(), rv4Var), yqe.A((y3b) f3b.W.getValue(), rv4Var), nk2.g(rv4Var, 1.0f, tte.k(kq7Var, r0f.z(rv4Var).a), ba5Var, 16.0f), false, yi9Var.c, xt4Var2, rv4Var, (i11 << 6) & 3670016, 17);
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            l0e.n(null, yqe.A((y3b) f3b.s0.getValue(), rv4Var), yqe.A((y3b) f3b.t0.getValue(), rv4Var), nk2.g(rv4Var, 1.0f, tte.k(kq7Var, r0f.z(rv4Var).a), ba5Var, 16.0f), false, yi9Var.a, xt4Var4, rv4Var, i11 & 3670016, 17);
            rs8.u(rv4Var, true, kq7Var, 12.0f, rv4Var);
            cvb.c(yqe.A((y3b) k3b.m0.getValue(), rv4Var), zbe.y(kq7Var, 16.0f), r0f.y(rv4Var).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).h, rv4Var, 48, 0, 131064);
            nq7 k3 = tte.k(zbe.A(pna.f(kq7Var, 1.0f), 16.0f, nae.e, 2), r0f.z(rv4Var).d);
            xn1 a4 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, k3);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var8);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar3, rv4Var, a4);
            jce.F(npVar4, rv4Var, l3);
            s21.t(hashCode3, rv4Var, npVar5, rv4Var, kgVar);
            jce.F(npVar6, rv4Var, p3);
            l0e.l(null, yqe.A(f3b.h(), rv4Var), yqe.A((y3b) f3b.I0.getValue(), rv4Var), nk2.g(rv4Var, 1.0f, tte.k(kq7Var, r0f.z(rv4Var).a), ba5Var, 16.0f), vt4Var, rv4Var, (i11 >> 9) & 57344, 1);
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            l0e.l(null, yqe.A((y3b) f3b.b0.getValue(), rv4Var), yqe.A((y3b) f3b.c0.getValue(), rv4Var), nk2.g(rv4Var, 1.0f, tte.k(kq7Var, r0f.z(rv4Var).a), ba5Var, 16.0f), vt4Var2, rv4Var, (i11 >> 12) & 57344, 1);
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            l0e.l(null, yqe.A((y3b) z1b.e.getValue(), rv4Var), yqe.A((y3b) z1b.f.getValue(), rv4Var), nk2.g(rv4Var, 1.0f, tte.k(kq7Var, r0f.z(rv4Var).a), ba5Var, 16.0f), vt4Var7, rv4Var, (i10 >> 3) & 57344, 1);
            rs8.u(rv4Var, true, kq7Var, 12.0f, rv4Var);
            cvb.c(yqe.A((y3b) k3b.j0.getValue(), rv4Var), zbe.y(kq7Var, 16.0f), r0f.y(rv4Var).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).h, rv4Var, 48, 0, 131064);
            nq7 k4 = tte.k(zbe.A(pna.f(kq7Var, 1.0f), 16.0f, nae.e, 2), r0f.z(rv4Var).d);
            xn1 a5 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode4 = Long.hashCode(rv4Var.T);
            xt8 l4 = rv4Var.l();
            nq7 p4 = lye.p(rv4Var, k4);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var8);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar3, rv4Var, a5);
            jce.F(npVar4, rv4Var, l4);
            s21.t(hashCode4, rv4Var, npVar5, rv4Var, kgVar);
            jce.F(npVar6, rv4Var, p4);
            l0e.l(null, yqe.A(f3b.e(), rv4Var), yqe.A((y3b) f3b.x0.getValue(), rv4Var), nk2.g(rv4Var, 1.0f, tte.k(kq7Var, r0f.z(rv4Var).a), ba5Var, 16.0f), vt4Var3, rv4Var, (i10 << 9) & 57344, 1);
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            int i12 = i10 << 6;
            l0e.l(null, yqe.A(f3b.f(), rv4Var), yqe.A((y3b) f3b.A0.getValue(), rv4Var), nk2.g(rv4Var, 1.0f, tte.k(kq7Var, r0f.z(rv4Var).a), ba5Var, 16.0f), vt4Var4, rv4Var, i12 & 57344, 1);
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            List m = cqe.m((q3b) nz.o.getValue(), rv4Var);
            boolean e = rv4Var.e(j);
            Object P2 = rv4Var.P();
            if (e || P2 == obj) {
                i3 = i12;
                npVar = npVar6;
                npVar2 = npVar5;
                P2 = Integer.valueOf(b00.r0(Long.valueOf(j), new Long[]{0L, 1800L, 3600L, 5400L, 7200L}));
                rv4Var.o0(P2);
            } else {
                npVar2 = npVar5;
                i3 = i12;
                npVar = npVar6;
            }
            int intValue = ((Number) P2).intValue();
            String A3 = yqe.A((y3b) f3b.l0.getValue(), rv4Var);
            if (intValue >= 0) {
                rv4Var.e0(1266003258);
                rv4Var.q(false);
                str = (String) m.get(intValue);
            } else {
                rv4Var.e0(1266074372);
                str = (j / 60) + " " + yqe.A((y3b) x2b.h0.getValue(), rv4Var);
                rv4Var.q(false);
            }
            nq7 g2 = nk2.g(rv4Var, 1.0f, tte.k(kq7Var, r0f.z(rv4Var).a), ba5Var, 16.0f);
            boolean f = rv4Var.f(aw7Var);
            Object P3 = rv4Var.P();
            if (f || P3 == obj) {
                P3 = new ao7(aw7Var, 22);
                rv4Var.o0(P3);
            }
            l0e.l(null, A3, str, g2, (vt4) P3, rv4Var, 0, 1);
            rs8.u(rv4Var, true, kq7Var, 12.0f, rv4Var);
            cvb.c(yqe.A((y3b) k3b.l0.getValue(), rv4Var), zbe.y(kq7Var, 16.0f), r0f.y(rv4Var).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).h, rv4Var, 48, 0, 131064);
            nq7 k5 = tte.k(zbe.A(pna.f(kq7Var, 1.0f), 16.0f, nae.e, 2), r0f.z(rv4Var).d);
            xn1 a6 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode5 = Long.hashCode(rv4Var.T);
            xt8 l5 = rv4Var.l();
            nq7 p5 = lye.p(rv4Var, k5);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var8);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar3, rv4Var, a6);
            jce.F(npVar4, rv4Var, l5);
            s21.t(hashCode5, rv4Var, npVar2, rv4Var, kgVar);
            jce.F(npVar, rv4Var, p5);
            l0e.l(null, yqe.A((y3b) f3b.Z.getValue(), rv4Var), yqe.A((y3b) f3b.a0.getValue(), rv4Var), nk2.g(rv4Var, 1.0f, tte.k(kq7Var, r0f.z(rv4Var).a), ba5Var, 16.0f), vt4Var5, rv4Var, (i10 << 3) & 57344, 1);
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            l0e.l(null, yqe.A(f3b.b(), rv4Var), yqe.A((y3b) f3b.B.getValue(), rv4Var), nk2.g(rv4Var, 1.0f, tte.k(kq7Var, r0f.z(rv4Var).a), ba5Var, 16.0f), vt4Var6, rv4Var, i10 & 57344, 1);
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            xt4Var8 = xt4Var6;
            a(yi9Var.e, i3 & 896, xt4Var8, rv4Var, nk2.g(rv4Var, 1.0f, tte.k(kq7Var, r0f.z(rv4Var).a), ba5Var, 16.0f));
            rv4Var.q(true);
            xbe.i(rv4Var, mwe.u(zbe.C(kq7Var, nae.e, nae.e, nae.e, 12.0f, 7), false, 14));
            rv4Var.q(true);
            boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
            long j2 = yi9Var.f;
            boolean f2 = rv4Var.f(aw7Var);
            Object P4 = rv4Var.P();
            if (f2 || P4 == obj) {
                P4 = new qo7(aw7Var, 20);
                rv4Var.o0(P4);
            }
            xt4 xt4Var9 = (xt4) P4;
            boolean f3 = rv4Var.f(aw7Var) | ((i11 & 1879048192) == 536870912);
            Object P5 = rv4Var.P();
            if (f3 || P5 == obj) {
                xt4Var7 = xt4Var5;
                P5 = new v73(4, xt4Var7, aw7Var);
                rv4Var.o0(P5);
            } else {
                xt4Var7 = xt4Var5;
            }
            obe.c(booleanValue, j2, xt4Var9, (xt4) P5, rv4Var, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: ui9
                @Override // defpackage.lu4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int p6 = xoe.p(i | 1);
                    xi9.b(yi9.this, rh8Var, nq7Var, xt4Var, xt4Var2, xt4Var3, xt4Var4, vt4Var, vt4Var2, xt4Var7, xt4Var8, vt4Var3, vt4Var4, vt4Var5, vt4Var6, vt4Var7, (rv4) obj2, p6);
                    return pvc.a;
                }
            };
        }
    }

    public static final void c(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(-513038314);
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
                zi9 zi9Var = (zi9) ((fdd) voe.z(cm9.a(zi9.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                fxe.h(yqe.A((y3b) f3b.U.getValue(), rv4Var), pna.c, false, jce.E(1216493458, new ri9(cz7Var, 0), rv4Var), null, null, jce.E(656601121, new cs1(zi9Var, cz7Var, jsc.z(zi9Var.d, rv4Var), 11), rv4Var), rv4Var, 1575984, 52);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ri9(cz7Var, i, 1);
        }
    }

    public static final String d(int i, rv4 rv4Var) {
        if (i <= 0) {
            rv4Var.e0(2141279903);
            String A = yqe.A((y3b) f3b.k0.getValue(), rv4Var);
            rv4Var.q(false);
            return A;
        }
        rv4Var.e0(2141354582);
        String B = yqe.B((y3b) f3b.j0.getValue(), new Object[]{Integer.valueOf(i)}, rv4Var);
        rv4Var.q(false);
        return B;
    }
}
