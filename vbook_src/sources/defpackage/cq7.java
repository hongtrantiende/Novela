package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cq7  reason: default package */
/* loaded from: classes3.dex */
public abstract class cq7 {
    public static final List a = tl1.B(4294967295L, 4294961979L, 4278248959L, 4294934699L, 4287349578L, 4294944550L);
    public static final List b = tl1.B(0L, 4278190080L, 4282532418L, 4294967295L);

    public static final void a(int i, int i2, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var, List list) {
        int i3;
        boolean z;
        xt4 xt4Var2;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        int i6;
        boolean h;
        int i7;
        rv4 rv4Var2 = rv4Var;
        ba5 ba5Var = lre.g;
        rv4Var2.g0(784395300);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                h = rv4Var2.f(list);
            } else {
                h = rv4Var2.h(list);
            }
            if (h) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var2.d(i)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i3 & 1, z)) {
            tza tzaVar = j27.a;
            nq7 y = zbe.y(nmd.v(tte.k(nq7Var, ((h27) rv4Var2.j(tzaVar)).c.c), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 3.0f), ba5Var), 12.0f);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
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
            int i8 = i3;
            cvb.c(yqe.A((y3b) z1b.A0.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.h, rv4Var, 0, 0, 131070);
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var, pna.h(kq7Var, 12.0f));
            cvb.c(yqe.A((y3b) z1b.C0.getValue(), rv4Var), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.j, rv4Var, 0, 0, 131070);
            rv4Var2 = rv4Var;
            xbe.i(rv4Var2, pna.h(kq7Var, 8.0f));
            String A = yqe.A((y3b) z1b.B0.getValue(), rv4Var2);
            if ((i8 & 14) != 4 && ((i8 & 8) == 0 || !rv4Var2.f(list))) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean f = rv4Var2.f(A) | z2;
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (f || P == lh9Var) {
                jq6 t = tl1.t();
                t.add(A);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    t.add(((o6d) it.next()).c);
                }
                P = tl1.r(t);
                rv4Var2.o0(P);
            }
            List list2 = (List) P;
            int n = dce.n(i + 1, 0, tl1.x(list2));
            if ((i8 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P2 = rv4Var2.P();
            if (!z3 && P2 != lh9Var) {
                xt4Var2 = xt4Var;
            } else {
                xt4Var2 = xt4Var;
                P2 = new im(21, xt4Var2);
                rv4Var2.o0(P2);
            }
            nq7 f2 = pna.f(kq7Var, 1.0f);
            tza tzaVar2 = j27.a;
            pye.d(n, 0, (xt4) P2, rv4Var2, nmd.v(tte.k(f2, ((h27) rv4Var2.j(tzaVar2)).c.c), rm1.g(((h27) rv4Var2.j(tzaVar2)).a, 6.0f), ba5Var), list2);
            rv4Var2.q(true);
        } else {
            xt4Var2 = xt4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new gh7(i, i2, xt4Var2, nq7Var, list);
        }
    }

    public static final void b(final boolean z, final float f, final boolean z2, final float f2, final nq7 nq7Var, final xt4 xt4Var, final xt4 xt4Var2, final xt4 xt4Var3, final xt4 xt4Var4, rv4 rv4Var, final int i) {
        int i2;
        boolean z3;
        float f3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1400756653);
        if ((i & 6) == 0) {
            if (rv4Var2.g(z)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.c(f)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.g(z2)) {
                i9 = 256;
            } else {
                i9 = Token.CASE;
            }
            i2 |= i9;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.c(f2)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        if ((i & 24576) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        }
        if ((i & 196608) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i6 = 131072;
            } else {
                i6 = Parser.ARGC_LIMIT;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var2.h(xt4Var2)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var2.h(xt4Var3)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        }
        if ((100663296 & i) == 0) {
            if (rv4Var2.h(xt4Var4)) {
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i2 |= i3;
        }
        int i12 = i2;
        if ((i12 & 38347923) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var2.U(i12 & 1, z3)) {
            tza tzaVar = j27.a;
            nq7 y = zbe.y(c16.g(nmd.v(tte.k(nq7Var, ((h27) rv4Var2.j(tzaVar)).c.c), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 3.0f), lre.g), null, 3), 12.0f);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
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
            cvb.c(yqe.A((y3b) z1b.I0.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.h, rv4Var2, 0, 0, 131070);
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            int i13 = i12 >> 6;
            k((i12 & 14) | 384 | (i13 & 7168), xt4Var, rv4Var2, pna.f(kq7Var, 1.0f), yqe.A((y3b) z1b.D0.getValue(), rv4Var2), z);
            if (!z) {
                rv4Var2.e0(783897130);
                f3 = 0.0f;
                g(yqe.A((y3b) z1b.H0.getValue(), rv4Var2), f, new jk1(nae.e, 1.0f), yqe.B((y3b) b3b.i.getValue(), new Object[]{Integer.valueOf((int) (f * 100.0f))}, rv4Var2), xt4Var2, pna.f(kq7Var, 1.0f), rv4Var2, (i12 & Token.ASSIGN_MOD) | 196608 | (i13 & 57344));
                rv4Var2 = rv4Var2;
                rv4Var2.q(false);
            } else {
                f3 = 0.0f;
                rv4Var2.e0(784280569);
                rv4Var2.q(false);
            }
            xbe.i(rv4Var2, pna.h(kq7Var, 8.0f));
            int i14 = i12 >> 12;
            k((i13 & 14) | 384 | (i14 & 7168), xt4Var3, rv4Var2, pna.f(kq7Var, 1.0f), yqe.A((y3b) b2b.b.getValue(), rv4Var2), z2);
            if (!z2) {
                rv4Var2.e0(784587314);
                String A = yqe.A((y3b) z1b.K0.getValue(), rv4Var2);
                jk1 jk1Var = new jk1(f3, 1.0f);
                String B = yqe.B((y3b) b3b.i.getValue(), new Object[]{Integer.valueOf((int) (f2 * 100.0f))}, rv4Var2);
                nq7 f4 = pna.f(kq7Var, 1.0f);
                int i15 = (i13 & Token.ASSIGN_MOD) | 196608 | (i14 & 57344);
                rv4 rv4Var3 = rv4Var2;
                g(A, f2, jk1Var, B, xt4Var4, f4, rv4Var3, i15);
                rv4Var2 = rv4Var3;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(784963065);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4() { // from class: vp7
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cq7.b(z, f, z2, f2, nq7Var, xt4Var, xt4Var2, xt4Var3, xt4Var4, (rv4) obj, xoe.p(i | 1));
                    return pvc.a;
                }
            };
        }
    }

    public static final void c(List list, long j, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        float f;
        long b2;
        boolean z3;
        boolean z4;
        rv4Var.g0(-1544580551);
        if (rv4Var.f(list)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.e(j)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        boolean z5 = true;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            kq7 kq7Var = kq7.a;
            nq7 f2 = pna.f(kq7Var, 1.0f);
            gv9 a2 = ev9.a(new hz(10.0f, true, new vs(2)), kh5.F, rv4Var, 6);
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
            jce.F(qw1.f, rv4Var, a2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            rv4Var.e0(-1393361874);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                if (longValue == j) {
                    z2 = z5;
                } else {
                    z2 = false;
                }
                long b3 = sve.b((int) longValue);
                nq7 n = pna.n(kq7Var, 32.0f);
                su9 su9Var = uu9.a;
                nq7 v = nmd.v(tte.k(n, su9Var), b3, lre.g);
                if (z2) {
                    f = 2.0f;
                } else {
                    f = 1.0f;
                }
                if (z2) {
                    rv4Var.e0(-1198005713);
                    b2 = ((h27) rv4Var.j(j27.a)).a.a;
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(-1197910822);
                    b2 = zl1.b(0.3f, ((h27) rv4Var.j(j27.a)).a.q);
                    rv4Var.q(false);
                }
                nq7 d = st0.d(v, f, b2, su9Var);
                if ((i7 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean e = z3 | rv4Var.e(longValue);
                Object P = rv4Var.P();
                if (!e && P != ax1.a) {
                    z4 = true;
                } else {
                    z4 = true;
                    P = new rl7(xt4Var, longValue, 1);
                    rv4Var.o0(P);
                }
                fu0.a(lbe.f(15, (vt4) P, d, null, false), rv4Var, 0);
                z5 = z4;
            }
            rv4Var.q(false);
            rv4Var.q(z5);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sl7(list, j, xt4Var, i, 1);
        }
    }

    public static final void d(final s6d s6dVar, final List list, final int i, final nq7 nq7Var, final xt4 xt4Var, final xt4 xt4Var2, final xt4 xt4Var3, final xt4 xt4Var4, final xt4 xt4Var5, final xt4 xt4Var6, final xt4 xt4Var7, final xt4 xt4Var8, final xt4 xt4Var9, final xt4 xt4Var10, final xt4 xt4Var11, final xt4 xt4Var12, final xt4 xt4Var13, final xt4 xt4Var14, final xt4 xt4Var15, final xt4 xt4Var16, final xt4 xt4Var17, final xt4 xt4Var18, final xt4 xt4Var19, rv4 rv4Var, final int i2) {
        rv4 rv4Var2;
        rv4Var.g0(-1149285901);
        int i3 = i2 | (rv4Var.f(s6dVar) ? 4 : 2) | (rv4Var.f(list) ? 32 : 16) | (rv4Var.d(i) ? 256 : Token.CASE) | (rv4Var.f(nq7Var) ? 2048 : 1024) | (rv4Var.h(xt4Var) ? 16384 : 8192);
        boolean h = rv4Var.h(xt4Var2);
        int i4 = Parser.ARGC_LIMIT;
        int i5 = i3 | (h ? 131072 : 65536) | (rv4Var.h(xt4Var3) ? 1048576 : 524288) | (rv4Var.h(xt4Var4) ? 8388608 : 4194304) | (rv4Var.h(xt4Var5) ? 67108864 : 33554432) | (rv4Var.h(xt4Var6) ? 536870912 : 268435456);
        int i6 = (rv4Var.h(xt4Var7) ? 4 : 2) | (rv4Var.h(xt4Var8) ? 32 : 16) | (rv4Var.h(xt4Var9) ? 256 : Token.CASE) | (rv4Var.h(xt4Var10) ? 2048 : 1024) | (rv4Var.h(xt4Var11) ? 16384 : 8192);
        if (rv4Var.h(xt4Var12)) {
            i4 = 131072;
        }
        int i7 = i6 | i4 | (rv4Var.h(xt4Var13) ? 1048576 : 524288) | (rv4Var.h(xt4Var14) ? 8388608 : 4194304) | (rv4Var.h(xt4Var15) ? 67108864 : 33554432) | (rv4Var.h(xt4Var16) ? 536870912 : 268435456);
        int i8 = (rv4Var.h(xt4Var17) ? 4 : 2) | (rv4Var.h(xt4Var18) ? 32 : 16) | (rv4Var.h(xt4Var19) ? 256 : Token.CASE);
        if (rv4Var.U(i5 & 1, ((i5 & 306783379) == 306783378 && (i7 & 306783379) == 306783378 && (i8 & Token.EXPR_VOID) == 146) ? false : true)) {
            nq7 A = zbe.A(nq7Var, 12.0f, nae.e, 2);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
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
            jce.F(qw1.f, rv4Var, a2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            boolean z = s6dVar.d;
            boolean z2 = s6dVar.e;
            boolean z3 = s6dVar.f;
            int i9 = s6dVar.q;
            int i10 = s6dVar.r;
            kq7 kq7Var = kq7.a;
            int i11 = i5 << 6;
            i(z, z2, z3, i9, i10, pna.f(kq7Var, 1.0f), xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, rv4Var, (i11 & 3670016) | 196608 | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), (i5 >> 24) & 14);
            xbe.i(rv4Var, pna.h(kq7Var, 12.0f));
            f(s6dVar.a, s6dVar.s, pna.f(kq7Var, 1.0f), xt4Var6, xt4Var7, rv4Var, ((i5 >> 18) & 7168) | 384 | ((i7 << 12) & 57344));
            xbe.i(rv4Var, pna.h(kq7Var, 12.0f));
            b(s6dVar.t, s6dVar.u, s6dVar.n, s6dVar.o, pna.f(kq7Var, 1.0f), xt4Var16, xt4Var17, xt4Var19, xt4Var18, rv4Var, ((i7 >> 12) & 458752) | 24576 | ((i8 << 18) & 3670016) | ((i8 << 15) & 29360128) | ((i8 << 21) & 234881024));
            int i12 = i7 << 3;
            j(s6dVar, hl5.f(kq7Var, 12.0f, rv4Var, kq7Var, 1.0f), xt4Var8, xt4Var9, xt4Var10, xt4Var11, xt4Var12, xt4Var13, xt4Var14, rv4Var, (458752 & i12) | (i5 & 14) | 48 | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
            rv4Var2 = rv4Var;
            if (!list.isEmpty()) {
                s21.w(rv4Var2, 774806412, kq7Var, 12.0f, rv4Var2);
                int i13 = i5 >> 3;
                a(i, ((i7 >> 15) & 7168) | (i13 & Token.ASSIGN_MOD) | (i13 & 14) | 384, xt4Var15, rv4Var2, pna.f(kq7Var, 1.0f), list);
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(775107205);
                rv4Var2.q(false);
            }
            hl5.w(kq7Var, 12.0f, rv4Var2, true);
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4(list, i, nq7Var, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, xt4Var7, xt4Var8, xt4Var9, xt4Var10, xt4Var11, xt4Var12, xt4Var13, xt4Var14, xt4Var15, xt4Var16, xt4Var17, xt4Var18, xt4Var19, i2) { // from class: zp7
                public final /* synthetic */ xt4 C;
                public final /* synthetic */ xt4 D;
                public final /* synthetic */ xt4 E;
                public final /* synthetic */ xt4 F;
                public final /* synthetic */ xt4 G;
                public final /* synthetic */ xt4 H;
                public final /* synthetic */ xt4 I;
                public final /* synthetic */ xt4 J;
                public final /* synthetic */ xt4 K;
                public final /* synthetic */ xt4 L;
                public final /* synthetic */ xt4 M;
                public final /* synthetic */ xt4 N;
                public final /* synthetic */ xt4 O;
                public final /* synthetic */ xt4 P;
                public final /* synthetic */ xt4 Q;
                public final /* synthetic */ xt4 R;
                public final /* synthetic */ xt4 S;
                public final /* synthetic */ List b;
                public final /* synthetic */ int c;
                public final /* synthetic */ nq7 d;
                public final /* synthetic */ xt4 e;
                public final /* synthetic */ xt4 f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p2 = xoe.p(1);
                    cq7.d(s6d.this, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, (rv4) obj, p2);
                    return pvc.a;
                }
            };
        }
    }

    public static final void e(int i, rv4 rv4Var) {
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1132566466);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i & 1, z)) {
            nq7 y = zbe.y(pna.f(kq7.a, 1.0f), 12.0f);
            gv9 a2 = ev9.a(lz.a, kh5.F, rv4Var2, 0);
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
            cvb.c(yqe.A((y3b) b3b.b0.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.f, rv4Var, 0, 0, 131070);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new j35(i, 20);
        }
    }

    public static final void f(int i, boolean z, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i2) {
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(949116663);
        if ((i2 & 6) == 0) {
            if (rv4Var2.d(i)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var2.g(z)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i3 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var2.h(xt4Var2)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((i3 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i3 & 1, z2)) {
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = tl1.B(0, 2, 1);
                rv4Var2.o0(P);
            }
            List list = (List) P;
            List B = tl1.B(yqe.A((y3b) v1b.j0.getValue(), rv4Var2), yqe.A((y3b) b3b.a.getValue(), rv4Var2), yqe.A((y3b) x2b.L0.getValue(), rv4Var2));
            nq7 k = tte.k(nq7Var, r0f.z(rv4Var2).c);
            long g = rm1.g(r0f.y(rv4Var2), 3.0f);
            ba5 ba5Var = lre.g;
            nq7 y = zbe.y(nmd.v(k, g, ba5Var), 12.0f);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
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
            int i10 = i3;
            cvb.c(yqe.A((y3b) b2b.a.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).h, rv4Var, 0, 0, 131070);
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var, pna.h(kq7Var, 12.0f));
            cvb.c(yqe.A((y3b) z1b.J0.getValue(), rv4Var), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).j, rv4Var, 0, 0, 131070);
            xbe.i(rv4Var, pna.h(kq7Var, 8.0f));
            int indexOf = list.indexOf(Integer.valueOf(i));
            if (indexOf < 0) {
                i4 = 0;
            } else {
                i4 = indexOf;
            }
            if ((i10 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean h = rv4Var.h(list) | z3;
            Object P2 = rv4Var.P();
            if (h || P2 == lh9Var) {
                P2 = new yv0(xt4Var, list, 8);
                rv4Var.o0(P2);
            }
            pye.d(i4, 0, (xt4) P2, rv4Var, a82.g(rv4Var, 6.0f, tte.k(pna.f(kq7Var, 1.0f), r0f.z(rv4Var).c), ba5Var), B);
            rv4Var2 = rv4Var;
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            int i11 = i10 >> 3;
            k((i11 & 14) | 384 | (i11 & 7168), xt4Var2, rv4Var2, pna.f(kq7Var, 1.0f), yqe.A((y3b) z1b.z0.getValue(), rv4Var2), z);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new x24(i, z, nq7Var, xt4Var, xt4Var2, i2);
        }
    }

    public static final void g(final String str, final float f, final jk1 jk1Var, final String str2, final xt4 xt4Var, final nq7 nq7Var, rv4 rv4Var, final int i) {
        int i2;
        Object obj;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1288047156);
        if ((i & 6) == 0) {
            if (rv4Var2.f(str)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.c(f)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.f(jk1Var)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            obj = str2;
            if (rv4Var2.f(obj)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        } else {
            obj = str2;
        }
        if ((i & 24576) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (rv4Var2.f(nq7Var)) {
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
        if (rv4Var2.U(i2 & 1, z)) {
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
            gv9 a3 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int i9 = i2;
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            kq7 kq7Var = kq7.a;
            nq7 p2 = lye.p(rv4Var2, kq7Var);
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
            tza tzaVar = j27.a;
            cvb.c(str, new we6(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.j, rv4Var, i9 & 14, 0, 131068);
            int i10 = i9 >> 9;
            cvb.c(obj, null, zl1.b(0.7f, ((h27) rv4Var.j(tzaVar)).a.q), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.k, rv4Var, i10 & 14, 0, 131066);
            rv4Var.q(true);
            kpa kpaVar = kpa.a;
            dae.d(f, xt4Var, pna.f(kq7Var, 1.0f), false, null, kpa.d(0L, 0L, zl1.b(0.2f, ((h27) rv4Var.j(tzaVar)).a.a), rv4Var, 1015), null, 0, null, null, jk1Var, rv4Var, ((i9 >> 3) & 14) | 384 | (i10 & Token.ASSIGN_MOD), (i9 >> 6) & 14, 984);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4() { // from class: wp7
                @Override // defpackage.lu4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    cq7.g(str, f, jk1Var, str2, xt4Var, nq7Var, (rv4) obj2, xoe.p(i | 1));
                    return pvc.a;
                }
            };
        }
    }

    public static final void h(final boolean z, final boolean z2, final s6d s6dVar, final List list, final int i, final xt4 xt4Var, final xt4 xt4Var2, final xt4 xt4Var3, final xt4 xt4Var4, final xt4 xt4Var5, final xt4 xt4Var6, final xt4 xt4Var7, final xt4 xt4Var8, final xt4 xt4Var9, final xt4 xt4Var10, final xt4 xt4Var11, final xt4 xt4Var12, final xt4 xt4Var13, final xt4 xt4Var14, final xt4 xt4Var15, final xt4 xt4Var16, final xt4 xt4Var17, final xt4 xt4Var18, final xt4 xt4Var19, final xt4 xt4Var20, final xt4 xt4Var21, final xt4 xt4Var22, final xt4 xt4Var23, rv4 rv4Var, final int i2) {
        rv4 rv4Var2 = rv4Var;
        s6dVar.getClass();
        list.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        xt4Var3.getClass();
        xt4Var4.getClass();
        xt4Var5.getClass();
        xt4Var6.getClass();
        xt4Var7.getClass();
        xt4Var8.getClass();
        xt4Var9.getClass();
        xt4Var10.getClass();
        xt4Var11.getClass();
        xt4Var12.getClass();
        xt4Var13.getClass();
        xt4Var14.getClass();
        xt4Var15.getClass();
        xt4Var16.getClass();
        xt4Var17.getClass();
        xt4Var18.getClass();
        xt4Var19.getClass();
        xt4Var20.getClass();
        xt4Var21.getClass();
        xt4Var22.getClass();
        xt4Var23.getClass();
        rv4Var2.g0(880827131);
        int i3 = i2 | (rv4Var2.g(z) ? 4 : 2) | (rv4Var2.g(z2) ? 32 : 16) | (rv4Var2.f(s6dVar) ? 256 : Token.CASE) | (rv4Var2.f(list) ? 2048 : 1024) | (rv4Var2.d(i) ? 16384 : 8192) | (rv4Var2.h(xt4Var) ? 131072 : 65536) | (rv4Var2.h(xt4Var2) ? 1048576 : 524288) | (rv4Var2.h(xt4Var3) ? 8388608 : 4194304) | (rv4Var2.h(xt4Var4) ? 67108864 : 33554432) | (rv4Var2.h(xt4Var5) ? 536870912 : 268435456);
        boolean z3 = true;
        if (rv4Var2.U(i3 & 1, ((i3 & 306783379) == 306783378 && (((((((((rv4Var2.h(xt4Var6) ? (char) 4 : (char) 2) | (rv4Var2.h(xt4Var8) ? (char) 256 : (char) 128)) | (rv4Var2.h(xt4Var10) ? 16384 : 8192)) | (rv4Var2.h(xt4Var11) ? 131072 : 65536)) | (rv4Var2.h(xt4Var12) ? 1048576 : 524288)) | (rv4Var2.h(xt4Var13) ? (char) 0 : (char) 0)) | (rv4Var2.h(xt4Var14) ? (char) 0 : (char) 0)) | (rv4Var2.h(xt4Var15) ? (char) 0 : (char) 0)) & 306782339) == 306782338 && ((((((((rv4Var2.h(xt4Var16) ? (char) 4 : (char) 2) | (rv4Var2.h(xt4Var17) ? ' ' : (char) 16)) | (rv4Var2.h(xt4Var18) ? 256 : Token.CASE)) | (rv4Var2.h(xt4Var19) ? 2048 : 1024)) | (rv4Var2.h(xt4Var20) ? (char) 16384 : (char) 8192)) | (rv4Var2.h(xt4Var21) ? (char) 0 : (char) 0)) | (rv4Var2.h(xt4Var22) ? (char) 0 : (char) 0)) & 599187) == 599186) ? false : true)) {
            if (z2) {
                rv4Var2.e0(-1527884342);
            } else {
                rv4Var2.e0(366355833);
                z3 = !ikd.a(rv4Var2);
            }
            rv4Var2.q(false);
            if (z3) {
                rv4Var2.e0(-1527777660);
                nmd.f(z, xt4Var, null, true, 0L, 0L, nae.e, 0L, nae.e, jce.E(621297031, new up7(s6dVar, list, i, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, xt4Var8, xt4Var10, xt4Var11, xt4Var12, xt4Var13, xt4Var14, xt4Var15, xt4Var16, xt4Var17, xt4Var18, xt4Var19, xt4Var20, xt4Var21, xt4Var22), rv4Var2), rv4Var, (i3 & 14) | 805309440 | ((i3 >> 12) & Token.ASSIGN_MOD), 500);
                rv4Var.q(false);
                rv4Var2 = rv4Var;
            } else {
                rv4Var2.e0(-1525753918);
                ze4 ze4Var = pna.c;
                tu1 E = jce.E(-586329611, new mu4() { // from class: xp7
                    @Override // defpackage.mu4
                    public final Object c(Object obj, Object obj2, Object obj3) {
                        boolean z4;
                        int i4;
                        su0 su0Var = (su0) obj;
                        rv4 rv4Var3 = (rv4) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        su0Var.getClass();
                        if ((intValue & 6) == 0) {
                            if (rv4Var3.f(su0Var)) {
                                i4 = 4;
                            } else {
                                i4 = 2;
                            }
                            intValue |= i4;
                        }
                        if ((intValue & 19) != 18) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (rv4Var3.U(intValue & 1, z4)) {
                            nq7 h = pna.h(kq7.a, (su0Var.c() * 2.0f) / 3.0f);
                            long j = ((h27) rv4Var3.j(j27.a)).a.p;
                            tu1 tu1Var = k27.b;
                            final s6d s6dVar2 = s6dVar;
                            final List list2 = list;
                            final int i5 = i;
                            final xt4 xt4Var24 = xt4Var2;
                            final xt4 xt4Var25 = xt4Var3;
                            final xt4 xt4Var26 = xt4Var4;
                            final xt4 xt4Var27 = xt4Var5;
                            final xt4 xt4Var28 = xt4Var6;
                            final xt4 xt4Var29 = xt4Var8;
                            final xt4 xt4Var30 = xt4Var10;
                            final xt4 xt4Var31 = xt4Var11;
                            final xt4 xt4Var32 = xt4Var12;
                            final xt4 xt4Var33 = xt4Var13;
                            final xt4 xt4Var34 = xt4Var14;
                            final xt4 xt4Var35 = xt4Var15;
                            final xt4 xt4Var36 = xt4Var16;
                            final xt4 xt4Var37 = xt4Var17;
                            final xt4 xt4Var38 = xt4Var18;
                            final xt4 xt4Var39 = xt4Var19;
                            final xt4 xt4Var40 = xt4Var20;
                            final xt4 xt4Var41 = xt4Var21;
                            final xt4 xt4Var42 = xt4Var22;
                            nmd.d(z, xt4Var, h, true, null, null, j, 0L, nae.e, 0L, tu1Var, jce.E(-720952239, new mu4() { // from class: aq7
                                @Override // defpackage.mu4
                                public final Object c(Object obj4, Object obj5, Object obj6) {
                                    boolean z5;
                                    rv4 rv4Var4 = (rv4) obj5;
                                    int intValue2 = ((Integer) obj6).intValue();
                                    ((zn1) obj4).getClass();
                                    if ((intValue2 & 17) != 16) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (rv4Var4.U(intValue2 & 1, z5)) {
                                        kq7 kq7Var = kq7.a;
                                        nq7 C = rte.C(pna.f(kq7Var, 1.0f), rte.u(rv4Var4), 14);
                                        xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var4, 0);
                                        int hashCode = Long.hashCode(rv4Var4.T);
                                        xt8 l = rv4Var4.l();
                                        nq7 p = lye.p(rv4Var4, C);
                                        rw1.k.getClass();
                                        zx1 zx1Var = qw1.b;
                                        rv4Var4.i0();
                                        if (rv4Var4.S) {
                                            rv4Var4.k(zx1Var);
                                        } else {
                                            rv4Var4.r0();
                                        }
                                        jce.F(qw1.f, rv4Var4, a2);
                                        jce.F(qw1.e, rv4Var4, l);
                                        jce.F(qw1.g, rv4Var4, Integer.valueOf(hashCode));
                                        jce.C(qw1.h, rv4Var4);
                                        jce.F(qw1.d, rv4Var4, p);
                                        cq7.d(s6d.this, list2, i5, zbe.x(pna.f(kq7Var, 1.0f), mwe.f(6, rv4Var4, false)), xt4Var24, xt4Var25, xt4Var26, xt4Var27, xt4Var28, xt4Var29, xt4Var30, xt4Var31, xt4Var32, xt4Var33, xt4Var34, xt4Var35, xt4Var36, xt4Var37, xt4Var38, xt4Var39, xt4Var40, xt4Var41, xt4Var42, rv4Var4, 0);
                                        xbe.i(rv4Var4, pna.h(kq7Var, mwe.s(rv4Var4) + 8.0f));
                                        rv4Var4.q(true);
                                    } else {
                                        rv4Var4.X();
                                    }
                                    return pvc.a;
                                }
                            }, rv4Var3), rv4Var3, 3072, 54, 944);
                        } else {
                            rv4Var3.X();
                        }
                        return pvc.a;
                    }
                }, rv4Var2);
                rv4Var2 = rv4Var2;
                hc2.b(ze4Var, null, E, rv4Var2, 3078, 6);
                rv4Var2.q(false);
            }
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4(z, z2, s6dVar, list, i, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, xt4Var7, xt4Var8, xt4Var9, xt4Var10, xt4Var11, xt4Var12, xt4Var13, xt4Var14, xt4Var15, xt4Var16, xt4Var17, xt4Var18, xt4Var19, xt4Var20, xt4Var21, xt4Var22, xt4Var23, i2) { // from class: yp7
                public final /* synthetic */ xt4 C;
                public final /* synthetic */ xt4 D;
                public final /* synthetic */ xt4 E;
                public final /* synthetic */ xt4 F;
                public final /* synthetic */ xt4 G;
                public final /* synthetic */ xt4 H;
                public final /* synthetic */ xt4 I;
                public final /* synthetic */ xt4 J;
                public final /* synthetic */ xt4 K;
                public final /* synthetic */ xt4 L;
                public final /* synthetic */ xt4 M;
                public final /* synthetic */ xt4 N;
                public final /* synthetic */ xt4 O;
                public final /* synthetic */ xt4 P;
                public final /* synthetic */ xt4 Q;
                public final /* synthetic */ xt4 R;
                public final /* synthetic */ xt4 S;
                public final /* synthetic */ xt4 T;
                public final /* synthetic */ xt4 U;
                public final /* synthetic */ xt4 V;
                public final /* synthetic */ xt4 W;
                public final /* synthetic */ xt4 X;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ s6d c;
                public final /* synthetic */ List d;
                public final /* synthetic */ int e;
                public final /* synthetic */ xt4 f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(1);
                    cq7.h(this.a, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, (rv4) obj, p);
                    return pvc.a;
                }
            };
        }
    }

    public static final void i(final boolean z, final boolean z2, final boolean z3, final int i, final int i2, final nq7 nq7Var, final xt4 xt4Var, final xt4 xt4Var2, final xt4 xt4Var3, final xt4 xt4Var4, final xt4 xt4Var5, rv4 rv4Var, final int i3, final int i4) {
        int i5;
        int i6;
        boolean z4;
        boolean z5;
        int i7;
        boolean z6;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(580543438);
        if ((i3 & 6) == 0) {
            if (rv4Var2.g(z)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i5 = i18 | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            if (rv4Var2.g(z2)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i5 |= i17;
        }
        if ((i3 & 384) == 0) {
            if (rv4Var2.g(z3)) {
                i16 = 256;
            } else {
                i16 = Token.CASE;
            }
            i5 |= i16;
        }
        if ((i3 & 3072) == 0) {
            if (rv4Var2.d(i)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i5 |= i15;
        }
        if ((i3 & 24576) == 0) {
            if (rv4Var2.d(i2)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i5 |= i14;
        }
        if ((196608 & i3) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i13 = 131072;
            } else {
                i13 = Parser.ARGC_LIMIT;
            }
            i5 |= i13;
        }
        if ((1572864 & i3) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i5 |= i12;
        }
        if ((12582912 & i3) == 0) {
            if (rv4Var2.h(xt4Var2)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i5 |= i11;
        }
        if ((100663296 & i3) == 0) {
            if (rv4Var2.h(xt4Var3)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i5 |= i10;
        }
        if ((i3 & 805306368) == 0) {
            if (rv4Var2.h(xt4Var4)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i5 |= i9;
        }
        int i19 = i5;
        if ((i4 & 6) == 0) {
            if (rv4Var2.h(xt4Var5)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i6 = i4 | i8;
        } else {
            i6 = i4;
        }
        if ((i19 & 306783379) == 306783378 && (i6 & 3) == 2) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (rv4Var2.U(i19 & 1, z4)) {
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = tl1.B(5, 10, 15, 30);
                rv4Var2.o0(P);
            }
            List<Number> list = (List) P;
            rv4Var2.e0(-443487126);
            ArrayList arrayList = new ArrayList(tl1.s(list, 10));
            for (Number number : list) {
                arrayList.add(yqe.B((y3b) b2b.e.getValue(), new Object[]{Integer.valueOf(number.intValue())}, rv4Var2));
                list = list;
            }
            List list2 = list;
            rv4Var2.q(false);
            nq7 k = tte.k(nq7Var, r0f.z(rv4Var2).c);
            long g = rm1.g(r0f.y(rv4Var2), 3.0f);
            ba5 ba5Var = lre.g;
            nq7 y = zbe.y(nmd.v(k, g, ba5Var), 12.0f);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
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
            cvb.c(yqe.A((y3b) b2b.c.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).h, rv4Var2, 0, 0, 131070);
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            k((i19 & 14) | 384 | ((i19 >> 9) & 7168), xt4Var, rv4Var2, pna.f(kq7Var, 1.0f), yqe.A((y3b) z1b.F0.getValue(), rv4Var2), z);
            k(((i19 >> 3) & 14) | 384 | ((i19 >> 12) & 7168), xt4Var2, rv4Var2, pna.f(kq7Var, 1.0f), yqe.A((y3b) z1b.E0.getValue(), rv4Var2), z2);
            k(((i19 >> 6) & 14) | 384 | ((i19 >> 15) & 7168), xt4Var3, rv4Var2, pna.f(kq7Var, 1.0f), yqe.A((y3b) z1b.G0.getValue(), rv4Var2), z3);
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            cvb.c(yqe.A((y3b) b2b.g.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).j, rv4Var2, 0, 0, 131070);
            xbe.i(rv4Var2, pna.h(kq7Var, 8.0f));
            int indexOf = list2.indexOf(Integer.valueOf(i));
            if (indexOf < 0) {
                indexOf = 0;
            }
            if ((i19 & 1879048192) == 536870912) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean h = z5 | rv4Var2.h(list2);
            Object P2 = rv4Var2.P();
            if (h || P2 == lh9Var) {
                P2 = new yv0(xt4Var4, list2, 6);
                rv4Var2.o0(P2);
            }
            pye.d(indexOf, 0, (xt4) P2, rv4Var2, a82.g(rv4Var2, 6.0f, tte.k(pna.f(kq7Var, 1.0f), r0f.z(rv4Var2).c), ba5Var), arrayList);
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            cvb.c(yqe.A((y3b) b2b.f.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).j, rv4Var2, 0, 0, 131070);
            xbe.i(rv4Var2, pna.h(kq7Var, 8.0f));
            int indexOf2 = list2.indexOf(Integer.valueOf(i2));
            if (indexOf2 < 0) {
                i7 = 0;
            } else {
                i7 = indexOf2;
            }
            if ((i6 & 14) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean h2 = z6 | rv4Var2.h(list2);
            Object P3 = rv4Var2.P();
            if (h2 || P3 == lh9Var) {
                P3 = new yv0(xt4Var5, list2, 7);
                rv4Var2.o0(P3);
            }
            pye.d(i7, 0, (xt4) P3, rv4Var2, a82.g(rv4Var2, 6.0f, tte.k(pna.f(kq7Var, 1.0f), r0f.z(rv4Var2).c), ba5Var), arrayList);
            rv4Var2 = rv4Var2;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4() { // from class: bq7
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p2 = xoe.p(i3 | 1);
                    int p3 = xoe.p(i4);
                    cq7.i(z, z2, z3, i, i2, nq7Var, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, (rv4) obj, p2, p3);
                    return pvc.a;
                }
            };
        }
    }

    public static final void j(s6d s6dVar, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, xt4 xt4Var5, xt4 xt4Var6, xt4 xt4Var7, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-327933443);
        if ((i & 6) == 0) {
            if (rv4Var2.f(s6dVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i9 = 256;
            } else {
                i9 = Token.CASE;
            }
            i2 |= i9;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.h(xt4Var2)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        if ((i & 24576) == 0) {
            if (rv4Var2.h(xt4Var3)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        }
        if ((196608 & i) == 0) {
            if (rv4Var2.h(xt4Var4)) {
                i6 = 131072;
            } else {
                i6 = Parser.ARGC_LIMIT;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var2.h(xt4Var5)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var2.h(xt4Var6)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        }
        if ((100663296 & i) == 0) {
            if (rv4Var2.h(xt4Var7)) {
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i2 |= i3;
        }
        if ((38347923 & i2) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i2 & 1, z)) {
            tza tzaVar = j27.a;
            nq7 y = zbe.y(c16.g(nmd.v(tte.k(nq7Var, ((h27) rv4Var2.j(tzaVar)).c.c), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 3.0f), lre.g), null, 3), 12.0f);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, y);
            rw1.k.getClass();
            int i12 = i2;
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
            cvb.c(yqe.A((y3b) b2b.j.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.h, rv4Var, 0, 0, 131070);
            rv4Var2 = rv4Var;
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            boolean z2 = s6dVar.g;
            int i13 = ((i12 << 3) & 7168) | 384;
            k(i13, xt4Var, rv4Var2, pna.f(kq7Var, 1.0f), yqe.A((y3b) b2b.h.getValue(), rv4Var2), z2);
            rte.e(s6dVar.g, null, zt3.g(null, 3).a(zt3.e(15)), zt3.i(null, 3).a(zt3.p(15)), null, jce.E(-126925457, new cr0(s6dVar, xt4Var4, xt4Var5, xt4Var6, xt4Var2, xt4Var3, xt4Var7), rv4Var2), rv4Var2, 1600518, 18);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new dr0(s6dVar, nq7Var, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, xt4Var7, i);
        }
    }

    public static final void k(int i, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var, String str, boolean z) {
        int i2;
        String str2;
        boolean z2;
        nq7 nq7Var2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1054914281);
        if ((i & 6) == 0) {
            if (rv4Var2.g(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
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
            if (rv4Var.f(nq7Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i2 & 1, z2)) {
            if ((i2 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i2 & 14) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z5 = z4 | z3;
            Object P = rv4Var2.P();
            if (z5 || P == ax1.a) {
                P = new up0(16, xt4Var, z);
                rv4Var2.o0(P);
            }
            nq7Var2 = nq7Var;
            nq7 t = q1d.t(1, (vt4) P, rv4Var2, nq7Var2, false);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, t);
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
            cvb.c(str2, new we6(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.j, rv4Var, (i2 >> 3) & 14, 0, 131068);
            rv4Var2 = rv4Var;
            tte.g(z, false, null, xt4Var, rv4Var2, i2 & 7182, 6);
            rv4Var2.q(true);
        } else {
            nq7Var2 = nq7Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new eh7(z, str, nq7Var2, xt4Var, i, 3);
        }
    }
}
