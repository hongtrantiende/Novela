package defpackage;

import android.view.View;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vqe  reason: default package */
/* loaded from: classes.dex */
public abstract class vqe implements xs3 {
    public static final tu1 a = new tu1(new cv1(1), false, 620422077);
    public static final tu1 b = new tu1(new xu1(9), false, 853022986);
    public static final c46 c = new c46(2);

    public static final sqa A(int i, rv4 rv4Var, kj6 kj6Var) {
        boolean z;
        if ((((i & 14) ^ 6) > 4 && rv4Var.f(kj6Var)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        Object P = rv4Var.P();
        Object obj = ax1.a;
        if (z || P == obj) {
            P = new pj6(kj6Var, cne.G);
            rv4Var.o0(P);
        }
        pj6 pj6Var = (pj6) P;
        pq2 a2 = axa.a(rv4Var);
        boolean f = rv4Var.f((r13) rv4Var.j(dy1.h)) | rv4Var.f(pj6Var) | rv4Var.f(a2);
        Object P2 = rv4Var.P();
        if (f || P2 == obj) {
            P2 = new sqa(pj6Var, a2, tte.v(nae.e, 400.0f, 5, null));
            rv4Var.o0(P2);
        }
        return (sqa) P2;
    }

    public static final vo9 B(kj6 kj6Var, bkd bkdVar, nu4 nu4Var, rv4 rv4Var, int i) {
        rh8 rh8Var;
        co5 co5Var;
        kj6Var.getClass();
        nu4Var.getClass();
        rv4Var.e0(-645045624);
        if ((i & 2) != 0) {
            rh8Var = new th8(nae.e, nae.e, nae.e, nae.e);
        } else {
            rh8Var = bkdVar;
        }
        rv4Var.e0(1347434050);
        boolean f = rv4Var.f(kj6Var);
        Object P = rv4Var.P();
        Object obj = ax1.a;
        if (f || P == obj) {
            P = new to9(kj6Var, 0);
            rv4Var.o0(P);
        }
        rv4Var.q(false);
        o3a n = p17.n(kj6Var, (vt4) P, rv4Var, 0);
        r13 r13Var = (r13) rv4Var.j(dy1.h);
        float L0 = r13Var.L0(48.0f);
        Object P2 = rv4Var.P();
        if (P2 == obj) {
            Object ey1Var = new ey1(yte.s(rv4Var));
            rv4Var.o0(ey1Var);
            P2 = ey1Var;
        }
        m82 m82Var = ((ey1) P2).a;
        aw7 D = yae.D(nu4Var, rv4Var);
        tc6 tc6Var = (tc6) rv4Var.j(dy1.n);
        d0 d0Var = new d0(r13Var.L0(zbe.o(rh8Var, tc6Var)), r13Var.L0(zbe.n(rh8Var, tc6Var)), r13Var.L0(rh8Var.d()), r13Var.L0(rh8Var.a()));
        rv4Var.e0(1347465600);
        boolean f2 = rv4Var.f(kj6Var);
        Object P3 = rv4Var.P();
        if (f2 || P3 == obj) {
            P3 = new to9(kj6Var, 1);
            rv4Var.o0(P3);
        }
        rv4Var.q(false);
        h23 q = yae.q((vt4) P3);
        rv4Var.e0(1347468268);
        boolean c2 = rv4Var.c(48.0f);
        boolean f3 = rv4Var.f(rh8Var) | c2 | rv4Var.f(m82Var) | rv4Var.f(kj6Var) | rv4Var.f(n) | rv4Var.f((ff8) q.getValue());
        Object P4 = rv4Var.P();
        if (f3 || P4 == obj) {
            int ordinal = ((ff8) q.getValue()).ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    co5Var = co5.V;
                } else {
                    xk5.o();
                    return null;
                }
            } else {
                co5Var = co5.U;
            }
            co5 co5Var2 = co5Var;
            n.getClass();
            tc6Var.getClass();
            Object mo9Var = new mo9(new xk9(kj6Var, 1), m82Var, D, L0, d0Var, n, null, tc6Var, co5Var2, 320);
            rv4Var.o0(mo9Var);
            P4 = mo9Var;
        }
        vo9 vo9Var = (vo9) P4;
        rv4Var.q(false);
        rv4Var.q(false);
        return vo9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean C(defpackage.tt2 r12, boolean r13) {
        /*
            km8 r0 = new km8
            r1 = 16
            r0.<init>(r1)
            r2 = 1
            r3 = r2
        L9:
            r4 = 8
            r0.J(r4)
            byte[] r5 = r0.a
            r6 = 0
            boolean r5 = r12.f(r5, r6, r4, r2)
            if (r5 != 0) goto L18
            goto L65
        L18:
            long r7 = r0.B()
            int r5 = r0.m()
            r9 = 1
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 != 0) goto L35
            byte[] r7 = r0.a
            boolean r7 = r12.f(r7, r4, r4, r2)
            if (r7 != 0) goto L2f
            goto L65
        L2f:
            long r7 = r0.F()
            r9 = r1
            goto L36
        L35:
            r9 = r4
        L36:
            long r9 = (long) r9
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L3c
            goto L65
        L3c:
            long r7 = r7 - r9
            int r7 = (int) r7
            if (r3 == 0) goto L66
            r3 = 1718909296(0x66747970, float:2.8862439E23)
            if (r5 != r3) goto L65
            if (r7 >= r4) goto L48
            goto L65
        L48:
            r3 = 4
            r0.J(r3)
            byte[] r4 = r0.a
            r12.f(r4, r6, r3, r6)
            int r3 = r0.m()
            r4 = 1751476579(0x68656963, float:4.333464E24)
            if (r3 == r4) goto L5b
            goto L65
        L5b:
            if (r13 != 0) goto L5e
            goto L6b
        L5e:
            int r7 = r7 + (-4)
            r12.b(r7, r6)
            r3 = r6
            goto L9
        L65:
            return r6
        L66:
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r5 != r4) goto L6c
        L6b:
            return r2
        L6c:
            if (r7 == 0) goto L9
            r12.b(r7, r6)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqe.C(tt2, boolean):boolean");
    }

    public static int D(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static final void a(vt4 vt4Var, x53 x53Var, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        rv4Var.g0(826668973);
        if (rv4Var.h(vt4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var.f(x53Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        boolean z3 = false;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            View view = (View) rv4Var.j(gh.f);
            r13 r13Var = (r13) rv4Var.j(dy1.h);
            tc6 tc6Var = (tc6) rv4Var.j(dy1.n);
            pv4 m = p17.m(rv4Var);
            aw7 D = yae.D(tu1Var, rv4Var);
            Object[] objArr = new Object[0];
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (P == obj) {
                P = fh.C;
                rv4Var.o0(P);
            }
            UUID uuid = (UUID) zpe.k(objArr, (vt4) P, rv4Var, 48);
            boolean d = rv4Var.d(x53Var.g) | rv4Var.f(view) | rv4Var.f(r13Var) | rv4Var.f(null);
            Object P2 = rv4Var.P();
            if (d || P2 == obj) {
                z53 z53Var = new z53(vt4Var, x53Var, view, tc6Var, r13Var, uuid);
                tu1 tu1Var2 = new tu1(new y0(D, 3), true, -1338939603);
                w53 w53Var = z53Var.D;
                w53Var.setParentCompositionContext(m);
                w53Var.G.setValue(tu1Var2);
                w53Var.K = true;
                w53Var.d();
                rv4Var.o0(z53Var);
                P2 = z53Var;
            }
            z53 z53Var2 = (z53) P2;
            boolean h = rv4Var.h(z53Var2);
            Object P3 = rv4Var.P();
            if (h || P3 == obj) {
                P3 = new zh(z53Var2, 0);
                rv4Var.o0(P3);
            }
            yte.b(z53Var2, (xt4) P3, rv4Var);
            boolean h2 = rv4Var.h(z53Var2);
            if ((i5 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = h2 | z2;
            if ((i5 & Token.ASSIGN_MOD) == 32) {
                z3 = true;
            }
            boolean d2 = z4 | z3 | rv4Var.d(tc6Var.ordinal());
            Object P4 = rv4Var.P();
            if (d2 || P4 == obj) {
                Object s5Var = new s5(z53Var2, vt4Var, x53Var, tc6Var, 1);
                rv4Var.o0(s5Var);
                P4 = s5Var;
            }
            yte.k((vt4) P4, rv4Var);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ai(vt4Var, x53Var, tu1Var, i, 0);
        }
    }

    public static final void c(List list, rj8 rj8Var, boolean z, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        nq7 nq7Var2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean h;
        int i7;
        rv4Var.g0(1326504158);
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
            if (rv4Var.f(rj8Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (rv4Var.g(z)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            nq7Var2 = nq7Var;
            if (rv4Var.f(nq7Var2)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        } else {
            nq7Var2 = nq7Var;
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
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            int i8 = i2;
            int k = rj8Var.k();
            long j = zl1.h;
            d3a.c(k, nq7Var2, j, j, nae.e, jce.E(-1619403330, new os1(rj8Var, 1), rv4Var), a, jce.E(1322356670, new z52(k, xt4Var, list, z), rv4Var), rv4Var, ((i8 >> 6) & Token.ASSIGN_MOD) | 14380416, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new a83(list, rj8Var, z, nq7Var, xt4Var, i);
        }
    }

    public static final void d(String str, amc amcVar, l54 l54Var, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        String str2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean h;
        int i8;
        int i9;
        int i10;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-703451910);
        if ((i & 6) == 0) {
            if (rv4Var2.f(str)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.f(amcVar)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                h = rv4Var2.f(l54Var);
            } else {
                h = rv4Var2.h(l54Var);
            }
            if (h) {
                i8 = 256;
            } else {
                i8 = Token.CASE;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (rv4Var2.h(vt4Var2)) {
                i5 = 131072;
            } else {
                i5 = Parser.ARGC_LIMIT;
            }
            i2 |= i5;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var2.h(vt4Var3)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var2.h(vt4Var4)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        int i11 = i2;
        if ((i11 & 4793491) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i11 & 1, z)) {
            int i12 = i11 >> 9;
            nq7 h2 = q1d.h(rv4Var2, nq7Var);
            lk0 lk0Var = kh5.I;
            ez ezVar = lz.c;
            xn1 a2 = wn1.a(ezVar, lk0Var, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, h2);
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
            nq7 C = zbe.C(zbe.A(mwe.u(pna.f(kq7Var, 1.0f), false, 1), 12.0f, nae.e, 2), nae.e, 6.0f, nae.e, nae.e, 13);
            gv9 a3 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, C);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            nq7 C2 = zbe.C(pna.h(s21.f(rv4Var2, p2, npVar4, 1.0f, true), 40.0f), 12.0f, nae.e, nae.e, nae.e, 14);
            lk0 lk0Var2 = kh5.J;
            xn1 a4 = wn1.a(ezVar, lk0Var2, rv4Var2, 48);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, C2);
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
            String str3 = l54Var.b;
            tza tzaVar = j27.a;
            cvb.c(str3, pna.f(kq7Var, 1.0f), 0L, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 1, 0, null, ((h27) rv4Var2.j(tzaVar)).b.j, rv4Var, 48, 24960, 109564);
            cvb.c(l54Var.d, pna.f(kq7Var, 1.0f), zl1.b(0.5f, ((h27) rv4Var.j(tzaVar)).a.q), null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 1, 0, null, ((h27) rv4Var.j(tzaVar)).b.l, rv4Var, 48, 24960, 109560);
            rv4Var.q(true);
            int i13 = i11 >> 6;
            cae.m(amcVar, false, 0L, null, new th8(3.0f, 3.0f, 3.0f, 3.0f), vt4Var4, rv4Var, ((i11 >> 3) & 14) | 24576 | (i13 & 458752), 14);
            h(l54Var, zbe.A(kq7Var, nae.e, 6.0f, 1), vt4Var2, vt4Var3, rv4Var, (i12 & 7168) | 48 | (i13 & 14) | (i12 & 896));
            rv4Var.q(true);
            nq7 e = rs8.e(1.0f, pna.f(kq7Var, 1.0f), true);
            xn1 a5 = wn1.a(lz.e, lk0Var2, rv4Var, 54);
            int hashCode4 = Long.hashCode(rv4Var.T);
            xt8 l4 = rv4Var.l();
            nq7 p4 = lye.p(rv4Var, e);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a5);
            jce.F(npVar2, rv4Var, l4);
            s21.t(hashCode4, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p4);
            rv4Var.e0(-846717625);
            if (str.length() == 0) {
                str2 = yqe.A((y3b) s2b.a.getValue(), rv4Var);
            } else {
                str2 = str;
            }
            rv4Var.q(false);
            cvb.c(str2, null, 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.f, rv4Var, 0, 0, 130046);
            xbe.i(rv4Var, pna.h(kq7Var, 12.0f));
            z1d.f(rp5.c((wk3) ok3.g0.getValue(), rv4Var, 0), yqe.A((y3b) b3b.B.getValue(), rv4Var), false, null, null, null, null, null, vt4Var, rv4Var, (i11 << 12) & 234881024, 252);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ua(str, amcVar, l54Var, nq7Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(amc amcVar, l54 l54Var, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        th8 th8Var;
        float f;
        rv4 rv4Var2;
        kq7 kq7Var;
        boolean z2;
        int i3;
        float f2;
        f25 f25Var;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean h;
        int i8;
        int i9;
        rv4 rv4Var3 = rv4Var;
        mk0 mk0Var = kh5.F;
        mk0 mk0Var2 = kh5.G;
        rv4Var3.g0(333583375);
        if ((i & 6) == 0) {
            if (rv4Var3.f(amcVar)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                h = rv4Var3.f(l54Var);
            } else {
                h = rv4Var3.h(l54Var);
            }
            if (h) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (rv4Var3.f(nq7Var)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (rv4Var3.h(vt4Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (rv4Var3.h(vt4Var2)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (rv4Var3.h(vt4Var3)) {
                i4 = 131072;
            } else {
                i4 = Parser.ARGC_LIMIT;
            }
            i2 |= i4;
        }
        int i10 = i2;
        if ((i10 & 74899) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var3.U(i10 & 1, z)) {
            boolean a2 = ikd.a(rv4Var3);
            if (a2) {
                th8Var = new th8(12.0f, 8.0f, 12.0f, 92.0f);
            } else {
                th8Var = new th8(12.0f, 8.0f, 12.0f, 12.0f);
            }
            th8 th8Var2 = th8Var;
            nq7 h2 = q1d.h(rv4Var3, nq7Var);
            lk0 lk0Var = kh5.I;
            ez ezVar = lz.c;
            xn1 a3 = wn1.a(ezVar, lk0Var, rv4Var3, 0);
            int hashCode = Long.hashCode(rv4Var3.T);
            xt8 l = rv4Var3.l();
            nq7 p = lye.p(rv4Var3, h2);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var3.i0();
            if (rv4Var3.S) {
                rv4Var3.k(zx1Var);
            } else {
                rv4Var3.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var3, a3);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var3, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var3, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var3);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var3, p);
            kq7 kq7Var2 = kq7.a;
            dz dzVar = lz.a;
            if (a2) {
                rv4Var3.e0(229287985);
                nq7 C = zbe.C(zbe.A(mwe.u(pna.f(kq7Var2, 1.0f), false, 1), 12.0f, nae.e, 2), nae.e, 6.0f, nae.e, nae.e, 13);
                gv9 a4 = ev9.a(dzVar, mk0Var2, rv4Var3, 48);
                int hashCode2 = Long.hashCode(rv4Var3.T);
                xt8 l2 = rv4Var3.l();
                nq7 p2 = lye.p(rv4Var3, C);
                rv4Var3.i0();
                if (rv4Var3.S) {
                    rv4Var3.k(zx1Var);
                } else {
                    rv4Var3.r0();
                }
                jce.F(npVar, rv4Var3, a4);
                jce.F(npVar2, rv4Var3, l2);
                s21.t(hashCode2, rv4Var3, npVar3, rv4Var3, kgVar);
                nq7 C2 = zbe.C(pna.h(s21.f(rv4Var3, p2, npVar4, 1.0f, true), 40.0f), 12.0f, nae.e, nae.e, nae.e, 14);
                xn1 a5 = wn1.a(ezVar, kh5.J, rv4Var3, 48);
                int hashCode3 = Long.hashCode(rv4Var3.T);
                xt8 l3 = rv4Var3.l();
                nq7 p3 = lye.p(rv4Var3, C2);
                rv4Var3.i0();
                if (rv4Var3.S) {
                    rv4Var3.k(zx1Var);
                } else {
                    rv4Var3.r0();
                }
                jce.F(npVar, rv4Var3, a5);
                jce.F(npVar2, rv4Var3, l3);
                s21.t(hashCode3, rv4Var3, npVar3, rv4Var3, kgVar);
                jce.F(npVar4, rv4Var3, p3);
                String str = l54Var.b;
                tza tzaVar = j27.a;
                cvb.c(str, pna.f(kq7Var2, 1.0f), 0L, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 1, 0, null, ((h27) rv4Var3.j(tzaVar)).b.j, rv4Var, 48, 24960, 109564);
                cvb.c(l54Var.d, pna.f(kq7Var2, 1.0f), zl1.b(0.5f, ((h27) rv4Var.j(tzaVar)).a.q), null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 1, 0, null, ((h27) rv4Var.j(tzaVar)).b.l, rv4Var, 48, 24960, 109560);
                rv4Var.q(true);
                cae.m(amcVar, false, 0L, null, new th8(3.0f, 3.0f, 3.0f, 3.0f), vt4Var3, rv4Var, (i10 & 14) | 24576 | (i10 & 458752), 14);
                int i11 = i10 >> 3;
                h(l54Var, zbe.A(kq7Var2, nae.e, 6.0f, 1), vt4Var, vt4Var2, rv4Var, (i11 & 7168) | 48 | (i11 & 14) | (i11 & 896));
                rv4Var.q(true);
                nq7 A = zbe.A(pna.f(kq7Var2, 1.0f), 8.0f, nae.e, 2);
                gv9 a6 = ev9.a(dzVar, mk0Var, rv4Var, 0);
                int hashCode4 = Long.hashCode(rv4Var.T);
                xt8 l4 = rv4Var.l();
                nq7 p4 = lye.p(rv4Var, A);
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(zx1Var);
                } else {
                    rv4Var.r0();
                }
                jce.F(npVar, rv4Var, a6);
                jce.F(npVar2, rv4Var, l4);
                s21.t(hashCode4, rv4Var, npVar3, rv4Var, kgVar);
                jce.F(npVar4, rv4Var, p4);
                rv4Var.e0(-211470633);
                for (rg3 rg3Var : tl1.B(new rg3(84.0f), new rg3(68.0f), new rg3(96.0f), new rg3(74.0f))) {
                    dpe.g(tte.k(zbe.y(pna.s(pna.h(kq7Var2, 40.0f), rg3Var.a), 4.0f), uu9.a), null, rv4Var, 0, 2);
                }
                hl5.v(rv4Var, false, true, false);
                rv4Var2 = rv4Var;
                i3 = 2;
                kq7Var = kq7Var2;
                z2 = true;
                f = 1.0f;
                f2 = 8.0f;
            } else {
                rv4Var3.e0(231719532);
                nq7 A2 = zbe.A(mwe.u(pna.f(kq7Var2, 1.0f), false, 1), nae.e, 8.0f, 1);
                gv9 a7 = ev9.a(dzVar, mk0Var2, rv4Var3, 48);
                int hashCode5 = Long.hashCode(rv4Var3.T);
                xt8 l5 = rv4Var3.l();
                nq7 p5 = lye.p(rv4Var3, A2);
                rv4Var3.i0();
                if (rv4Var3.S) {
                    rv4Var3.k(zx1Var);
                } else {
                    rv4Var3.r0();
                }
                jce.F(npVar, rv4Var3, a7);
                jce.F(npVar2, rv4Var3, l5);
                s21.t(hashCode5, rv4Var3, npVar3, rv4Var3, kgVar);
                nq7 C3 = zbe.C(s21.f(rv4Var3, p5, npVar4, 1.0f, true), 8.0f, nae.e, nae.e, nae.e, 14);
                gv9 a8 = ev9.a(dzVar, mk0Var, rv4Var3, 0);
                int hashCode6 = Long.hashCode(rv4Var3.T);
                xt8 l6 = rv4Var3.l();
                nq7 p6 = lye.p(rv4Var3, C3);
                rv4Var3.i0();
                if (rv4Var3.S) {
                    rv4Var3.k(zx1Var);
                } else {
                    rv4Var3.r0();
                }
                jce.F(npVar, rv4Var3, a8);
                jce.F(npVar2, rv4Var3, l6);
                s21.t(hashCode6, rv4Var3, npVar3, rv4Var3, kgVar);
                jce.F(npVar4, rv4Var3, p6);
                rv4Var3.e0(591464237);
                for (rg3 rg3Var2 : tl1.B(new rg3(84.0f), new rg3(68.0f), new rg3(96.0f), new rg3(74.0f))) {
                    dpe.g(tte.k(zbe.y(pna.s(pna.h(kq7Var2, 40.0f), rg3Var2.a), 4.0f), uu9.a), null, rv4Var3, 0, 2);
                }
                rv4Var3.q(false);
                rv4Var3.q(true);
                xbe.i(rv4Var3, pna.s(kq7Var2, 6.0f));
                f = 1.0f;
                rv4Var2 = rv4Var3;
                cae.m(amcVar, false, 0L, null, new th8(3.0f, 3.0f, 3.0f, 3.0f), vt4Var3, rv4Var2, (i10 & 14) | 24576 | (i10 & 458752), 14);
                xbe.i(rv4Var2, pna.s(kq7Var2, 6.0f));
                kq7Var = kq7Var2;
                int i12 = i10 >> 3;
                z2 = true;
                i3 = 2;
                f2 = 8.0f;
                j(l54Var, zbe.C(kq7Var2, nae.e, nae.e, 12.0f, nae.e, 11), vt4Var, vt4Var2, rv4Var3, 48 | (i12 & 14) | (i12 & 896) | (i12 & 7168));
                rv4Var2.q(true);
                rv4Var2.q(false);
            }
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            if (a2) {
                f25Var = new Object();
            } else {
                f25Var = new f25(160.0f);
            }
            nq7 e = rs8.e(f, pna.f(kq7Var, f), z2);
            hz hzVar = new hz(f2, z2, new vs(i3));
            hz hzVar2 = new hz(f2, z2, new vs(i3));
            Object P = rv4Var2.P();
            if (P == ax1.a) {
                P = new bq2(27);
                rv4Var2.o0(P);
            }
            ade.e(f25Var, e, null, th8Var2, hzVar2, hzVar, null, false, null, (xt4) P, rv4Var, 102432768, 6, 660);
            rv4Var3 = rv4Var;
            rv4Var3.q(z2);
        } else {
            rv4Var3.X();
        }
        ek9 u = rv4Var3.u();
        if (u != null) {
            u.d = new ru1(amcVar, l54Var, nq7Var, vt4Var, vt4Var2, vt4Var3, i, 1);
        }
    }

    public static final void f(boolean z, l54 l54Var, cz7 cz7Var, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        l54 l54Var2;
        cz7 cz7Var2;
        pb2 pb2Var;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        l54Var.getClass();
        cz7Var.getClass();
        xt4Var.getClass();
        rv4Var.g0(-1452624334);
        if (rv4Var.f(l54Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i5 = i | i2;
        if (rv4Var.f(cz7Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i6 = i5 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 16384;
        } else {
            i4 = 8192;
        }
        int i7 = i6 | i4;
        if ((i7 & 9361) != 9360) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i7 & 1, z2)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                u73 u73Var = (u73) ((fdd) voe.z(cm9.a(u73.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                Object[] objArr = new Object[0];
                Object P = rv4Var.P();
                Object obj = ax1.a;
                if (P == obj) {
                    P = new rj2(19);
                    rv4Var.o0(P);
                }
                aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 48);
                Object[] objArr2 = new Object[0];
                Object P2 = rv4Var.P();
                if (P2 == obj) {
                    P2 = new rj2(20);
                    rv4Var.o0(P2);
                }
                aw7 aw7Var2 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var, 48);
                Object[] objArr3 = new Object[0];
                Object P3 = rv4Var.P();
                if (P3 == obj) {
                    P3 = new rj2(21);
                    rv4Var.o0(P3);
                }
                aw7 aw7Var3 = (aw7) zpe.k(objArr3, (vt4) P3, rv4Var, 48);
                aw7 z8 = jsc.z(u73Var.U, rv4Var);
                aw7 z9 = jsc.z(u73Var.d, rv4Var);
                boolean f = rv4Var.f(u73Var);
                Object P4 = rv4Var.P();
                if (f || P4 == obj) {
                    P4 = new cq2(u73Var, 7);
                    rv4Var.o0(P4);
                }
                tte.d(u73Var, null, (xt4) P4, rv4Var, 0);
                b37 d = fu0.d(kh5.a, false);
                int hashCode = Long.hashCode(rv4Var.T);
                xt8 l = rv4Var.l();
                nq7 p = lye.p(rv4Var, nq7Var);
                rw1.k.getClass();
                vt4 vt4Var = qw1.b;
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(vt4Var);
                } else {
                    rv4Var.r0();
                }
                jce.F(qw1.f, rv4Var, d);
                jce.F(qw1.e, rv4Var, l);
                jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                jce.C(qw1.h, rv4Var);
                jce.F(qw1.d, rv4Var, p);
                p73 p73Var = (p73) z8.getValue();
                amc amcVar = (amc) z9.getValue();
                ze4 ze4Var = pna.c;
                boolean f2 = rv4Var.f(u73Var);
                Object P5 = rv4Var.P();
                if (f2 || P5 == obj) {
                    P5 = new t42(u73Var, 7);
                    rv4Var.o0(P5);
                }
                vt4 vt4Var2 = (vt4) P5;
                boolean f3 = rv4Var.f(aw7Var);
                Object P6 = rv4Var.P();
                if (f3 || P6 == obj) {
                    P6 = new ae1(aw7Var, 23);
                    rv4Var.o0(P6);
                }
                vt4 vt4Var3 = (vt4) P6;
                boolean f4 = rv4Var.f(aw7Var2);
                Object P7 = rv4Var.P();
                if (f4 || P7 == obj) {
                    P7 = new ae1(aw7Var2, 24);
                    rv4Var.o0(P7);
                }
                vt4 vt4Var4 = (vt4) P7;
                boolean f5 = rv4Var.f(aw7Var3);
                Object P8 = rv4Var.P();
                if (f5 || P8 == obj) {
                    P8 = new ae1(aw7Var3, 25);
                    rv4Var.o0(P8);
                }
                g(l54Var, p73Var, amcVar, cz7Var, ze4Var, vt4Var2, vt4Var3, vt4Var4, (vt4) P8, rv4Var, 24576 | ((i7 >> 3) & 14) | ((i7 << 3) & 7168));
                l54Var2 = l54Var;
                cz7Var2 = cz7Var;
                rv4Var.q(true);
                boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
                boolean f6 = rv4Var.f(aw7Var);
                Object P9 = rv4Var.P();
                if (f6 || P9 == obj) {
                    P9 = new as1(aw7Var, 14);
                    rv4Var.o0(P9);
                }
                xt4 xt4Var2 = (xt4) P9;
                boolean f7 = rv4Var.f(aw7Var);
                if ((57344 & i7) == 16384) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z10 = f7 | z3;
                Object P10 = rv4Var.P();
                if (z10 || P10 == obj) {
                    P10 = new v73(0, xt4Var, aw7Var);
                    rv4Var.o0(P10);
                }
                xt4 xt4Var3 = (xt4) P10;
                boolean f8 = rv4Var.f(aw7Var);
                int i8 = i7 & 896;
                if (i8 == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z11 = f8 | z4;
                Object P11 = rv4Var.P();
                if (!z11 && P11 != obj) {
                    z5 = false;
                } else {
                    z5 = false;
                    P11 = new w73(cz7Var2, aw7Var, 0);
                    rv4Var.o0(P11);
                }
                y9e.e(booleanValue, xt4Var2, xt4Var3, (xt4) P11, rv4Var, 0);
                boolean booleanValue2 = ((Boolean) aw7Var2.getValue()).booleanValue();
                String B = yqe.B((y3b) b3b.Q.getValue(), new Object[]{l54Var2.b}, rv4Var);
                boolean f9 = rv4Var.f(aw7Var2);
                Object P12 = rv4Var.P();
                if (f9 || P12 == obj) {
                    P12 = new as1(aw7Var2, 15);
                    rv4Var.o0(P12);
                }
                xt4 xt4Var4 = (xt4) P12;
                boolean f10 = rv4Var.f(aw7Var2);
                if (i8 == 256) {
                    z6 = true;
                } else {
                    z6 = z5;
                }
                boolean z12 = f10 | z6;
                if ((i7 & Token.ASSIGN_MOD) != 32) {
                    z7 = z5;
                } else {
                    z7 = true;
                }
                boolean z13 = z12 | z7;
                Object P13 = rv4Var.P();
                if (z13 || P13 == obj) {
                    P13 = new r7(27, cz7Var2, l54Var2, aw7Var2);
                    rv4Var.o0(P13);
                }
                wq9.f(booleanValue2, "", B, xt4Var4, (xt4) P13, rv4Var, 48);
                boolean booleanValue3 = ((Boolean) aw7Var3.getValue()).booleanValue();
                String str = l54Var2.a;
                boolean f11 = rv4Var.f(aw7Var3);
                Object P14 = rv4Var.P();
                if (f11 || P14 == obj) {
                    P14 = new as1(aw7Var3, 16);
                    rv4Var.o0(P14);
                }
                xt4 xt4Var5 = (xt4) P14;
                boolean f12 = rv4Var.f(aw7Var3);
                if (i8 == 256) {
                    z5 = true;
                }
                boolean z14 = f12 | z5;
                Object P15 = rv4Var.P();
                if (z14 || P15 == obj) {
                    P15 = new rp0(cz7Var2, aw7Var3, 8);
                    rv4Var.o0(P15);
                }
                cae.g(booleanValue3, null, str, xt4Var5, (vt4) P15, rv4Var, 0);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            l54Var2 = l54Var;
            cz7Var2 = cz7Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new b62(z, l54Var2, cz7Var2, nq7Var, xt4Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0306  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(defpackage.l54 r27, defpackage.p73 r28, defpackage.amc r29, defpackage.cz7 r30, defpackage.nq7 r31, defpackage.vt4 r32, defpackage.vt4 r33, defpackage.vt4 r34, defpackage.vt4 r35, defpackage.rv4 r36, int r37) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqe.g(l54, p73, amc, cz7, nq7, vt4, vt4, vt4, vt4, rv4, int):void");
    }

    public static final void h(l54 l54Var, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean h;
        int i7;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1934240732);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var2.f(l54Var);
            } else {
                h = rv4Var2.h(l54Var);
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
            if (rv4Var2.f(nq7Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.h(vt4Var2)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        int i8 = i2;
        if ((i8 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i8 & 1, z)) {
            nq7 h2 = pna.h(nq7Var, 40.0f);
            gv9 a2 = ev9.a(lz.e, kh5.G, rv4Var2, 54);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, h2);
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
            xbe.i(rv4Var2, pna.s(kq7Var, 8.0f));
            nq7 n = pna.n(kq7Var, 40.0f);
            su9 su9Var = uu9.a;
            nq7 k = tte.k(n, su9Var);
            if ((i8 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new pp1(14, vt4Var2);
                rv4Var2.o0(P);
            }
            nk5.a(rp5.c((wk3) ok3.l0.getValue(), rv4Var2, 0), null, zbe.y(lbe.f(15, (vt4) P, k, null, false), 10.0f), 0L, rv4Var2, 48, 8);
            xbe.i(rv4Var2, pna.s(kq7Var, 4.0f));
            nq7 v = nmd.v(tte.k(zbe.y(pna.n(kq7Var, 40.0f), 6.0f), su9Var), ((h27) rv4Var2.j(j27.a)).a.p, lre.g);
            if ((i8 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P2 = rv4Var2.P();
            if (!z3 && P2 != lh9Var) {
                i3 = 15;
            } else {
                i3 = 15;
                P2 = new pp1(15, vt4Var);
                rv4Var2.o0(P2);
            }
            nq7 f = lbe.f(i3, (vt4) P2, v, null, false);
            b37 d = fu0.d(kh5.a, false);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, f);
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
            do5.a(new h54(l54Var.r, l54Var.a, l54Var.c), r0f.d, false, null, null, null, pna.c, null, rv4Var, 12582960, 892);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new z73(l54Var, nq7Var, vt4Var, vt4Var2, i, 0);
        }
    }

    public static final void i(final String str, rj8 rj8Var, final List list, final boolean z, final rh8 rh8Var, bkd bkdVar, cz7 cz7Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        Object obj;
        final cz7 cz7Var2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean h;
        int i8;
        int i9;
        int i10;
        rv4Var.g0(1171848939);
        if ((i & 6) == 0) {
            if (rv4Var.f(str)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(rj8Var)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                h = rv4Var.f(list);
            } else {
                h = rv4Var.h(list);
            }
            if (h) {
                i8 = 256;
            } else {
                i8 = Token.CASE;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.g(z)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(rh8Var)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            obj = bkdVar;
            if (rv4Var.f(obj)) {
                i5 = 131072;
            } else {
                i5 = Parser.ARGC_LIMIT;
            }
            i2 |= i5;
        } else {
            obj = bkdVar;
        }
        if ((1572864 & i) == 0) {
            cz7Var2 = cz7Var;
            if (rv4Var.f(cz7Var2)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        } else {
            cz7Var2 = cz7Var;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var.f(nq7Var)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        int i11 = i2;
        if ((4793491 & i11) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i11 & 1, z2)) {
            final bkd bkdVar2 = obj;
            kxe.c(rj8Var, nq7Var, null, null, 0, nae.e, null, null, false, null, null, null, null, jce.E(369140682, new nu4() { // from class: x73
                @Override // defpackage.nu4
                public final Object h(Object obj2, Object obj3, Object obj4, Object obj5) {
                    boolean z3;
                    rv4 rv4Var2;
                    int i12;
                    int intValue = ((Integer) obj3).intValue();
                    rv4 rv4Var3 = (rv4) obj4;
                    int intValue2 = ((Integer) obj5).intValue();
                    ((jj8) obj2).getClass();
                    if ((intValue2 & 48) == 0) {
                        if (rv4Var3.d(intValue)) {
                            i12 = 32;
                        } else {
                            i12 = 16;
                        }
                        intValue2 |= i12;
                    }
                    if ((intValue2 & Token.TARGET) != 144) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (rv4Var3.U(intValue2 & 1, z3)) {
                        boolean z4 = z;
                        String str2 = str;
                        cz7 cz7Var3 = cz7Var2;
                        rh8 rh8Var2 = rh8Var;
                        bkd bkdVar3 = bkdVar2;
                        List list2 = list;
                        if (z4) {
                            rv4Var3.e0(1953827785);
                            if (intValue == 0) {
                                rv4Var3.e0(1953840433);
                                rv4Var2 = rv4Var3;
                                yqe.b(str2, cz7Var3, rh8Var2, bkdVar3, pna.c, rv4Var2, 24576);
                                rv4Var2.q(false);
                            } else {
                                rv4Var3.e0(1954173435);
                                hma.f(str2, ((q81) list2.get(intValue - 1)).b, cz7Var3, rh8Var2, bkdVar3, pna.c, rv4Var3, 196608);
                                rv4Var2 = rv4Var3;
                                rv4Var2.q(false);
                            }
                            rv4Var2.q(false);
                        } else {
                            rv4Var3.e0(1954597639);
                            hma.f(str2, ((q81) list2.get(intValue)).b, cz7Var3, rh8Var2, bkdVar3, pna.c, rv4Var3, 196608);
                            rv4Var3.q(false);
                        }
                    } else {
                        rv4Var3.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, ((i11 >> 3) & 14) | ((i11 >> 18) & Token.ASSIGN_MOD), 24576, 16380);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new c01(str, rj8Var, list, z, rh8Var, bkdVar, cz7Var, nq7Var, i);
        }
    }

    public static final void j(l54 l54Var, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        boolean h;
        int i6;
        l54 l54Var2 = l54Var;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-2141768862);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var2.f(l54Var2);
            } else {
                h = rv4Var2.h(l54Var2);
            }
            if (h) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.h(vt4Var2)) {
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
            nq7 h2 = pna.h(nq7Var, 40.0f);
            gv9 a2 = ev9.a(lz.e, kh5.G, rv4Var2, 54);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, h2);
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
            nq7 n = pna.n(kq7Var, 40.0f);
            su9 su9Var = uu9.a;
            nq7 k = tte.k(n, su9Var);
            if ((i7 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new pp1(16, vt4Var2);
                rv4Var2.o0(P);
            }
            nk5.a(rp5.c((wk3) ok3.l0.getValue(), rv4Var2, 0), null, zbe.y(lbe.f(15, (vt4) P, k, null, false), 8.0f), 0L, rv4Var2, 48, 8);
            xbe.i(rv4Var2, pna.s(kq7Var, 8.0f));
            nq7 v = nmd.v(tte.k(zbe.y(pna.n(kq7Var, 40.0f), 6.0f), su9Var), ((h27) rv4Var2.j(j27.a)).a.p, lre.g);
            if ((i7 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P2 = rv4Var2.P();
            if (z3 || P2 == lh9Var) {
                P2 = new pp1(17, vt4Var);
                rv4Var2.o0(P2);
            }
            nq7 f = lbe.f(15, (vt4) P2, v, null, false);
            b37 d = fu0.d(kh5.a, false);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, f);
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
            l54Var2 = l54Var;
            do5.a(new h54(l54Var2.a), r0f.d, false, null, null, null, pna.c, null, rv4Var, 12582960, 892);
            rv4Var2 = rv4Var;
            s21.x(rv4Var2, true, kq7Var, 8.0f, rv4Var2);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new z73(l54Var2, nq7Var, vt4Var, vt4Var2, i, 1);
        }
    }

    public static final void k(amc amcVar, l54 l54Var, List list, rj8 rj8Var, boolean z, nq7 nq7Var, xt4 xt4Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean h;
        int i11;
        boolean h2;
        int i12;
        int i13;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(562286809);
        int i14 = 4;
        if ((i & 6) == 0) {
            if (rv4Var2.f(amcVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i3 = i13 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                h2 = rv4Var2.f(l54Var);
            } else {
                h2 = rv4Var2.h(l54Var);
            }
            if (h2) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i3 |= i12;
        }
        if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                h = rv4Var2.f(list);
            } else {
                h = rv4Var2.h(list);
            }
            if (h) {
                i11 = 256;
            } else {
                i11 = Token.CASE;
            }
            i3 |= i11;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.f(rj8Var)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i3 |= i10;
        }
        if ((i & 24576) == 0) {
            if (rv4Var2.g(z)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i3 |= i9;
        }
        if ((196608 & i) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i8 = 131072;
            } else {
                i8 = Parser.ARGC_LIMIT;
            }
            i3 |= i8;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i3 |= i7;
        }
        if ((100663296 & i) == 0) {
            if (rv4Var2.h(vt4Var2)) {
                i6 = 67108864;
            } else {
                i6 = 33554432;
            }
            i3 |= i6;
        }
        if ((805306368 & i) == 0) {
            if (rv4Var2.h(vt4Var3)) {
                i5 = 536870912;
            } else {
                i5 = 268435456;
            }
            i3 |= i5;
        }
        int i15 = i3;
        if ((i2 & 6) == 0) {
            if (!rv4Var2.h(vt4Var4)) {
                i14 = 2;
            }
            i4 = i2 | i14;
        } else {
            i4 = i2;
        }
        if ((i15 & 302589075) == 302589074 && (i4 & 3) == 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var2.U(i15 & 1, z2)) {
            nq7 h3 = q1d.h(rv4Var2, nq7Var);
            lk0 lk0Var = kh5.I;
            ez ezVar = lz.c;
            xn1 a2 = wn1.a(ezVar, lk0Var, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, h3);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            int i16 = i4;
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
            nq7 C = zbe.C(zbe.A(mwe.u(pna.f(kq7Var, 1.0f), false, 1), 12.0f, nae.e, 2), nae.e, 6.0f, nae.e, nae.e, 13);
            gv9 a3 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, C);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            int i17 = i15 >> 18;
            int i18 = i17 & 896;
            nq7 t = q1d.t(1, vt4Var2, rv4Var2, zbe.C(pna.h(s21.f(rv4Var2, p2, npVar4, 1.0f, true), 40.0f), 12.0f, nae.e, nae.e, nae.e, 14), false);
            xn1 a4 = wn1.a(ezVar, kh5.J, rv4Var2, 48);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, t);
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
            String str = l54Var.b;
            tza tzaVar = j27.a;
            cvb.c(str, pna.f(kq7Var, 1.0f), 0L, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 1, 0, null, ((h27) rv4Var2.j(tzaVar)).b.j, rv4Var2, 48, 24960, 109564);
            cvb.c(l54Var.d, pna.f(kq7Var, 1.0f), zl1.b(0.5f, ((h27) rv4Var2.j(tzaVar)).a.q), null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 1, 0, null, ((h27) rv4Var2.j(tzaVar)).b.l, rv4Var2, 48, 24960, 109560);
            rv4Var2.q(true);
            cae.m(amcVar, false, 0L, null, new th8(3.0f, 3.0f, 3.0f, 3.0f), vt4Var4, rv4Var2, (i15 & 14) | 24576 | (458752 & (i16 << 15)), 14);
            rv4Var2 = rv4Var;
            h(l54Var, zbe.A(kq7Var, nae.e, 6.0f, 1), vt4Var2, vt4Var3, rv4Var2, 48 | ((i15 >> 3) & 14) | i18 | (i17 & 7168));
            rv4Var2.q(true);
            if (!list.isEmpty()) {
                rv4Var2.e0(2001608942);
                c(list, rj8Var, z, zbe.C(pna.f(kq7Var, 1.0f), 12.0f, nae.e, 12.0f, 6.0f, 2), xt4Var, rv4Var2, (i15 >> 6) & 58366);
                rv4Var2 = rv4Var2;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(2001921267);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new y73(amcVar, l54Var, list, rj8Var, z, nq7Var, xt4Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, i, i2);
        }
    }

    public static final void l(amc amcVar, l54 l54Var, List list, rj8 rj8Var, boolean z, nq7 nq7Var, xt4 xt4Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, rv4 rv4Var, int i) {
        int i2;
        Object obj;
        boolean z2;
        boolean z3;
        int i3;
        float f;
        boolean z4;
        float f2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean h;
        int i11;
        boolean h2;
        int i12;
        int i13;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1729980783);
        if ((i & 6) == 0) {
            if (rv4Var2.f(amcVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i2 = i13 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                h2 = rv4Var2.f(l54Var);
            } else {
                h2 = rv4Var2.h(l54Var);
            }
            if (h2) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i2 |= i12;
        }
        if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                h = rv4Var2.f(list);
            } else {
                h = rv4Var2.h(list);
            }
            if (h) {
                i11 = 256;
            } else {
                i11 = Token.CASE;
            }
            i2 |= i11;
        }
        if ((i & 3072) == 0) {
            obj = rj8Var;
            if (rv4Var2.f(obj)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i2 |= i10;
        } else {
            obj = rj8Var;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            if (rv4Var2.g(z2)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i2 |= i9;
        } else {
            z2 = z;
        }
        if ((196608 & i) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i8 = 131072;
            } else {
                i8 = Parser.ARGC_LIMIT;
            }
            i2 |= i8;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i2 |= i7;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i6 = 8388608;
            } else {
                i6 = 4194304;
            }
            i2 |= i6;
        }
        if ((100663296 & i) == 0) {
            if (rv4Var2.h(vt4Var2)) {
                i5 = 67108864;
            } else {
                i5 = 33554432;
            }
            i2 |= i5;
        }
        if ((805306368 & i) == 0) {
            if (rv4Var2.h(vt4Var3)) {
                i4 = 536870912;
            } else {
                i4 = 268435456;
            }
            i2 |= i4;
        }
        int i14 = i2;
        if ((i14 & 306783379) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var2.U(i14 & 1, z3)) {
            int i15 = i14 >> 15;
            nq7 A = zbe.A(mwe.u(q1d.h(rv4Var2, nq7Var), false, 1), nae.e, 8.0f, 1);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
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
            if (!list.isEmpty()) {
                rv4Var2.e0(-1036080908);
                if (1.0f <= 0.0d) {
                    jv5.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f2 = Float.MAX_VALUE;
                } else {
                    f2 = 1.0f;
                }
                c(list, obj, z2, new we6(f2, true), xt4Var, rv4Var, (i14 >> 6) & 58366);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
                i3 = i15;
                z4 = true;
            } else {
                i3 = i15;
                rv4Var2.e0(-1035833745);
                if (1.0f <= 0.0d) {
                    jv5.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                } else {
                    f = 1.0f;
                }
                z4 = true;
                xbe.i(rv4Var2, new we6(f, true));
                rv4Var2.q(false);
            }
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var2, pna.s(kq7Var, 6.0f));
            cae.m(amcVar, false, 0L, null, new th8(3.0f, 3.0f, 3.0f, 3.0f), vt4Var3, rv4Var2, (i14 & 14) | 24576 | ((i14 >> 12) & 458752), 14);
            xbe.i(rv4Var2, pna.s(kq7Var, 6.0f));
            j(l54Var, zbe.C(kq7Var, nae.e, nae.e, 12.0f, nae.e, 11), vt4Var, vt4Var2, rv4Var2, 48 | ((i14 >> 3) & 14) | (i3 & 896) | (i3 & 7168));
            rv4Var2.q(z4);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new qg0(amcVar, l54Var, list, rj8Var, z, nq7Var, xt4Var, vt4Var, vt4Var2, vt4Var3, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(float r20, int r21, int r22, long r23, defpackage.rv4 r25, defpackage.nq7 r26) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqe.m(float, int, int, long, rv4, nq7):void");
    }

    public static final void n(nq7 nq7Var, kj6 kj6Var, rh8 rh8Var, jz jzVar, lk0 lk0Var, li4 li4Var, boolean z, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z2;
        rh8 rh8Var2;
        jz jzVar2;
        lk0 lk0Var2;
        li4 li4Var2;
        boolean z3;
        int i4;
        sqa sqaVar;
        boolean z4;
        lk0 lk0Var3;
        ez ezVar;
        xt4Var.getClass();
        rv4Var.g0(1520780510);
        if (rv4Var.f(kj6Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i5 = i | i2 | 13315456;
        if (rv4Var.h(xt4Var)) {
            i3 = 67108864;
        } else {
            i3 = 33554432;
        }
        int i6 = i5 | i3;
        if ((38347923 & i6) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i6 & 1, z2)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                i4 = i6 & (-3727361);
                ezVar = jzVar;
                lk0Var3 = lk0Var;
                sqaVar = li4Var;
                z4 = z;
            } else {
                rh8Var = new th8(nae.e, nae.e, nae.e, nae.e);
                lk0 lk0Var4 = kh5.I;
                sqa A = A((((-57345) & i6) >> 3) & 14, rv4Var, kj6Var);
                i4 = i6 & (-3727361);
                sqaVar = A;
                z4 = true;
                lk0Var3 = lk0Var4;
                ezVar = lz.c;
            }
            rh8 rh8Var3 = rh8Var;
            rv4Var.r();
            jce.d(nq7Var, kj6Var, rh8Var3, false, ezVar, lk0Var3, sqaVar, z4, null, xt4Var, rv4Var, (33554430 & i4) | ((i4 << 3) & 1879048192), 256);
            z3 = z4;
            li4Var2 = sqaVar;
            lk0Var2 = lk0Var3;
            jzVar2 = ezVar;
            rh8Var2 = rh8Var3;
        } else {
            rv4Var.X();
            rh8Var2 = rh8Var;
            jzVar2 = jzVar;
            lk0Var2 = lk0Var;
            li4Var2 = li4Var;
            z3 = z;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new va4(nq7Var, kj6Var, rh8Var2, jzVar2, lk0Var2, li4Var2, z3, xt4Var, i);
        }
    }

    public static final void o(final nq7 nq7Var, final kj6 kj6Var, rh8 rh8Var, boolean z, fz fzVar, mk0 mk0Var, li4 li4Var, final boolean z2, final xt4 xt4Var, rv4 rv4Var, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        int i5;
        int i6;
        boolean z4;
        final rh8 rh8Var2;
        final fz fzVar2;
        final mk0 mk0Var2;
        final li4 li4Var2;
        final boolean z5;
        dz dzVar;
        dz dzVar2;
        int i7;
        th8 th8Var;
        sqa A;
        boolean z6;
        mk0 mk0Var3;
        int i8;
        xt4Var.getClass();
        rv4Var.g0(-357087652);
        if (rv4Var.f(kj6Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i | i3;
        int i10 = i9 | 384;
        int i11 = i2 & 8;
        if (i11 != 0) {
            i5 = i9 | 3456;
            z3 = z;
        } else {
            z3 = z;
            if (rv4Var.g(z3)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i5 = i10 | i4;
        }
        int i12 = i5 | 729088;
        if ((i & 12582912) == 0) {
            if (rv4Var.g(z2)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i12 |= i8;
        }
        if (rv4Var.h(xt4Var)) {
            i6 = 67108864;
        } else {
            i6 = 33554432;
        }
        int i13 = i12 | i6;
        boolean z7 = false;
        if ((38347923 & i13) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (rv4Var.U(i13 & 1, z4)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                dzVar2 = fzVar;
                mk0Var3 = mk0Var;
                A = li4Var;
                z6 = z3;
                i7 = i13 & (-3727361);
                th8Var = rh8Var;
            } else {
                th8 th8Var2 = new th8(nae.e, nae.e, nae.e, nae.e);
                if (i11 == 0) {
                    z7 = z3;
                }
                if (!z7) {
                    dzVar = lz.a;
                } else {
                    dzVar = lz.b;
                }
                mk0 mk0Var4 = kh5.F;
                dzVar2 = dzVar;
                i7 = i13 & (-3727361);
                th8Var = th8Var2;
                boolean z8 = z7;
                A = A((((-57345) & i13) >> 3) & 14, rv4Var, kj6Var);
                z6 = z8;
                mk0Var3 = mk0Var4;
            }
            rv4Var.r();
            jce.e(nq7Var, kj6Var, th8Var, z6, dzVar2, mk0Var3, A, z2, null, xt4Var, rv4Var, (33554430 & i7) | ((i7 << 3) & 1879048192), 256);
            li4Var2 = A;
            mk0Var2 = mk0Var3;
            fzVar2 = dzVar2;
            z5 = z6;
            rh8Var2 = th8Var;
        } else {
            rv4Var.X();
            rh8Var2 = rh8Var;
            fzVar2 = fzVar;
            mk0Var2 = mk0Var;
            li4Var2 = li4Var;
            z5 = z3;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: oj6
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vqe.o(nq7.this, kj6Var, rh8Var2, z5, fzVar2, mk0Var2, li4Var2, z2, xt4Var, (rv4) obj, xoe.p(i | 1), i2);
                    return pvc.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(defpackage.xg6 r18, defpackage.vo9 r19, java.lang.Object r20, defpackage.nq7 r21, boolean r22, defpackage.nq7 r23, defpackage.tu1 r24, defpackage.rv4 r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqe.p(xg6, vo9, java.lang.Object, nq7, boolean, nq7, tu1, rv4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(float r20, int r21, int r22, long r23, defpackage.rv4 r25, defpackage.nq7 r26) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqe.q(float, int, int, long, rv4, nq7):void");
    }

    public static final void r(nq7 nq7Var, lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        rv4Var.g0(1090521195);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(lu4Var)) {
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
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = ci.b;
                rv4Var.o0(P);
            }
            b37 b37Var = (b37) P;
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            int i5 = (((((i2 << 3) & Token.ASSIGN_MOD) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, b37Var);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            lu4Var.invoke(rv4Var, Integer.valueOf((i5 >> 6) & 14));
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new di(nq7Var, lu4Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.gh5 s(defpackage.v18 r4, defpackage.n42 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.h2d
            if (r0 == 0) goto L13
            r0 = r5
            h2d r0 = (defpackage.h2d) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            h2d r0 = new h2d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            int r0 = r0.b
            if (r0 == 0) goto L36
            r4 = 1
            r1 = 0
            if (r0 != r4) goto L30
            defpackage.hre.r(r5)
            byte[] r5 = (byte[]) r5
            if (r5 == 0) goto L2f
            boolean r4 = r5 instanceof defpackage.rf8
            if (r4 == 0) goto L2e
            throw r1
        L2e:
            throw r1
        L2f:
            return r1
        L30:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r1
        L36:
            defpackage.hre.r(r5)
            gh5 r5 = new gh5
            r5.<init>()
            xtc r0 = r5.a
            java.lang.String r1 = r4.a
            defpackage.ytc.b(r0, r1)
            pg5 r0 = defpackage.pg5.b
            java.lang.String r0 = r4.b
            pg5 r0 = defpackage.tl1.E(r0)
            r5.b = r0
            s18 r4 = r4.c
            java.util.Map r4 = r4.a
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L5b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            o45 r2 = r5.c
            r2.d(r1, r0)
            goto L5b
        L79:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqe.s(v18, n42):gh5");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.oh5 r18, defpackage.n42 r19) {
        /*
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof defpackage.i2d
            if (r2 == 0) goto L17
            r2 = r1
            i2d r2 = (defpackage.i2d) r2
            int r3 = r2.C
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.C = r3
            goto L1c
        L17:
            i2d r2 = new i2d
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f
            int r3 = r2.C
            r4 = 1
            if (r3 == 0) goto L41
            if (r3 != r4) goto L3a
            long r3 = r2.e
            long r5 = r2.d
            int r0 = r2.c
            s18 r7 = r2.b
            oh5 r2 = r2.a
            defpackage.hre.r(r1)
            r10 = r0
            r17 = r2
            r13 = r3
            r15 = r7
        L37:
            r11 = r5
            goto Lb5
        L3a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r0)
            r0 = 0
            return r0
        L41:
            defpackage.hre.r(r1)
            ii5 r1 = r0.e()
            int r1 = r1.a
            jv4 r3 = r0.c()
            long r5 = r3.E
            jv4 r3 = r0.d()
            long r7 = r3.E
            n45 r3 = r0.a()
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            java.util.Set r3 = r3.a()
            java.util.Iterator r3 = r3.iterator()
        L67:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L90
            java.lang.Object r10 = r3.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r11 = r10.getKey()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r10.getValue()
            java.util.List r10 = (java.util.List) r10
            java.util.Locale r12 = java.util.Locale.ROOT
            java.lang.String r11 = r11.toLowerCase(r12)
            r11.getClass()
            java.util.ArrayList r10 = defpackage.sl1.E0(r10)
            r9.put(r11, r10)
            goto L67
        L90:
            s18 r3 = new s18
            java.util.Map r9 = defpackage.o17.y(r9)
            r3.<init>(r9)
            r2.a = r0
            r2.b = r3
            r2.c = r1
            r2.d = r5
            r2.e = r7
            r2.C = r4
            java.lang.Object r2 = defpackage.que.n(r0, r2)
            n82 r4 = defpackage.n82.a
            if (r2 != r4) goto Lae
            return r4
        Lae:
            r17 = r0
            r10 = r1
            r1 = r2
            r15 = r3
            r13 = r7
            goto L37
        Lb5:
            s11 r1 = (defpackage.s11) r1
            ta6 r0 = new ta6
            r0.<init>(r1)
            y18 r9 = new y18
            r16 = r0
            r9.<init>(r10, r11, r13, r15, r16, r17)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqe.t(oh5, n42):java.lang.Object");
    }

    public static final byte[] u(CharsetEncoder charsetEncoder, CharSequence charSequence, int i, int i2) {
        charsetEncoder.getClass();
        charSequence.getClass();
        if (charSequence instanceof String) {
            if (i == 0) {
                String str = (String) charSequence;
                if (i2 == str.length()) {
                    byte[] bytes = str.getBytes(charsetEncoder.charset());
                    bytes.getClass();
                    return bytes;
                }
            }
            byte[] bytes2 = ((String) charSequence).substring(i, i2).getBytes(charsetEncoder.charset());
            bytes2.getClass();
            return bytes2;
        }
        ByteBuffer encode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i, i2));
        byte[] bArr = null;
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            byte[] array = encode.array();
            if (array.length == encode.remaining()) {
                bArr = array;
            }
        }
        if (bArr == null) {
            byte[] bArr2 = new byte[encode.remaining()];
            encode.get(bArr2);
            return bArr2;
        }
        return bArr;
    }

    public static final int v(int i, List list) {
        int i2;
        char c2;
        int i3 = ((ll8) sl1.j0(list)).c;
        if (i > ((ll8) sl1.j0(list)).c) {
            mv5.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 <= size) {
                i2 = (i4 + size) >>> 1;
                ll8 ll8Var = (ll8) list.get(i2);
                if (ll8Var.b > i) {
                    c2 = 1;
                } else if (ll8Var.c <= i) {
                    c2 = 65535;
                } else {
                    c2 = 0;
                }
                if (c2 < 0) {
                    i4 = i2 + 1;
                } else if (c2 <= 0) {
                    break;
                } else {
                    size = i2 - 1;
                }
            } else {
                i2 = -(i4 + 1);
                break;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        int size2 = list.size();
        String a2 = er6.a(31, new bo7(6), null, list);
        StringBuilder r = hl5.r(i2, size2, "Found paragraph index ", " should be in range [0, ", ").\nDebug info: index=");
        r.append(i);
        r.append(", paragraphs=[");
        r.append(a2);
        r.append("]");
        mv5.a(r.toString());
        return i2;
    }

    public static final int w(int i, List list) {
        char c2;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            ll8 ll8Var = (ll8) list.get(i3);
            if (ll8Var.d > i) {
                c2 = 1;
            } else if (ll8Var.e <= i) {
                c2 = 65535;
            } else {
                c2 = 0;
            }
            if (c2 < 0) {
                i2 = i3 + 1;
            } else if (c2 > 0) {
                size = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final int x(ArrayList arrayList, float f) {
        char c2;
        if (f <= nae.e) {
            return 0;
        }
        if (f >= ((ll8) sl1.j0(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            ll8 ll8Var = (ll8) arrayList.get(i2);
            if (ll8Var.f > f) {
                c2 = 1;
            } else if (ll8Var.g <= f) {
                c2 = 65535;
            } else {
                c2 = 0;
            }
            if (c2 < 0) {
                i = i2 + 1;
            } else if (c2 > 0) {
                size = i2 - 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }

    public static final void y(ArrayList arrayList, long j, xt4 xt4Var) {
        int size = arrayList.size();
        for (int v = v(fxb.g(j), arrayList); v < size; v++) {
            ll8 ll8Var = (ll8) arrayList.get(v);
            if (ll8Var.b < fxb.f(j)) {
                if (ll8Var.b != ll8Var.c) {
                    xt4Var.invoke(ll8Var);
                }
            } else {
                return;
            }
        }
    }

    public static String z(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str2.length() + str.length());
            for (int i = 0; i < str.length(); i++) {
                sb.append(str.charAt(i));
                if (str2.length() > i) {
                    sb.append(str2.charAt(i));
                }
            }
            return sb.toString();
        }
        vs.m("Invalid input received");
        return null;
    }
}
