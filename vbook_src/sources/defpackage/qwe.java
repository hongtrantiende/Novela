package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qwe  reason: default package */
/* loaded from: classes3.dex */
public abstract class qwe {
    public static final tu1 a = new tu1(new iv1(3), false, 1678465051);
    public static final tu1 b = new tu1(new iv1(4), false, 499468216);
    public static final tu1 c = new tu1(new ev1(23), false, -1496026752);
    public static final vg3 d = new Object();

    public static final void a(f7a f7aVar, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4Var.g0(-614342087);
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
            rv4Var.e0(-1009319487);
            st0.b(jye.v(aye.r(new ov9(f7aVar, (m42) null, 2)), f7aVar.C, new h21(f7aVar, null, 4), null, new m6a(f7aVar, 3)), tu1Var, rv4Var, 48);
            rv4Var.q(false);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oq1(f7aVar, tu1Var, i, 0);
        }
    }

    public static final void b(gtb gtbVar, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        nq7 v;
        int i3;
        int i4;
        rv4Var.g0(1533506138);
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
            rv4Var.e0(-885604480);
            if (!gtbVar.k()) {
                v = kq7.a;
            } else {
                v = jye.v(aye.r(new atb(gtbVar, null, 0)), gtbVar.y, new h21(gtbVar, null, 6), new btb(gtbVar, null, 0), new m72(gtbVar, 2));
            }
            st0.b(v, tu1Var, rv4Var, i2 & Token.ASSIGN_MOD);
            rv4Var.q(false);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new nq1(gtbVar, tu1Var, i, 0);
        }
    }

    public static final void c(ytb ytbVar, boolean z, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        nq7 nq7Var;
        int i3;
        int i4;
        int i5;
        rv4Var.g0(-1442752422);
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
            rv4Var.e0(-1299459355);
            if (z) {
                rv4Var.e0(-1299415211);
                boolean h = rv4Var.h(ytbVar);
                Object P = rv4Var.P();
                if (h || P == ax1.a) {
                    P = new qq1(ytbVar, null, 0);
                    rv4Var.o0(P);
                }
                nq7Var = aye.r((lu4) P);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1298836224);
                rv4Var.q(false);
                nq7Var = kq7.a;
            }
            st0.b(nq7Var, tu1Var, rv4Var, (i2 >> 3) & Token.ASSIGN_MOD);
            rv4Var.q(false);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new pq1(ytbVar, z, tu1Var, i, 0);
        }
    }

    public static final void d(qn4 qn4Var, nq7 nq7Var, vt4 vt4Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        qn4 qn4Var2;
        xt4 xt4Var2;
        boolean z2;
        int i6;
        boolean z3;
        np npVar;
        ba5 ba5Var;
        np npVar2;
        int i7;
        wk3 wk3Var;
        long b2;
        boolean z4;
        boolean z5;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1022179478);
        if (rv4Var2.f(qn4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (rv4Var2.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (rv4Var2.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i10 = i9 | i4;
        if (rv4Var2.h(xt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        if ((i11 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i11 & 1, z)) {
            nq7 k = tte.k(nq7Var, r0f.z(rv4Var2).d);
            long g = rm1.g(r0f.y(rv4Var2), 1.0f);
            ba5 ba5Var2 = lre.g;
            nq7 v = nmd.v(k, g, ba5Var2);
            if ((i11 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new jf3(16, vt4Var);
                rv4Var2.o0(P);
            }
            nq7 z6 = zbe.z(lbe.f(15, (vt4) P, v, null, false), 14.0f, 12.0f);
            mk0 mk0Var = kh5.G;
            dz dzVar = lz.a;
            gv9 a2 = ev9.a(dzVar, mk0Var, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, z6);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar3 = qw1.f;
            jce.F(npVar3, rv4Var2, a2);
            np npVar4 = qw1.e;
            jce.F(npVar4, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar5 = qw1.g;
            jce.F(npVar5, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar6 = qw1.d;
            jce.F(npVar6, rv4Var2, p);
            kq7 kq7Var = kq7.a;
            nq7 t = jsc.t(0.6666667f, tte.k(pna.s(kq7Var, 56.0f), r0f.z(rv4Var2).c), false);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, t);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar3, rv4Var2, d2);
            jce.F(npVar4, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar5, rv4Var2, kgVar);
            jce.F(npVar6, rv4Var2, p2);
            String str = qn4Var.a;
            String str2 = qn4Var.b;
            boolean z7 = qn4Var.g;
            do5.c(str, str2, qn4Var.c, qn4Var.e, r0f.d, pna.c, rv4Var, 221184);
            rv4 rv4Var3 = rv4Var;
            if (qn4Var.h > 0) {
                rv4Var3.e0(-647426071);
                i6 = i11;
                z3 = z7;
                npVar = npVar4;
                ba5Var = ba5Var2;
                npVar2 = npVar3;
                ctd.a(3072, 6, 0L, 0L, jce.E(1589172132, new qo4(qn4Var, 18), rv4Var3), rv4Var, pu0.a.a(zbe.y(kq7Var, 4.0f), kh5.c));
                rv4Var3 = rv4Var;
                i7 = 0;
                rv4Var3.q(false);
            } else {
                i6 = i11;
                z3 = z7;
                npVar = npVar4;
                ba5Var = ba5Var2;
                npVar2 = npVar3;
                i7 = 0;
                rv4Var3.e0(-647167562);
                rv4Var3.q(false);
            }
            rv4Var3.q(true);
            xbe.i(rv4Var3, pna.s(kq7Var, 12.0f));
            we6 we6Var = new we6(1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var3, i7);
            int hashCode3 = Long.hashCode(rv4Var3.T);
            xt8 l3 = rv4Var3.l();
            nq7 p3 = lye.p(rv4Var3, we6Var);
            rv4Var3.i0();
            if (rv4Var3.S) {
                rv4Var3.k(zx1Var);
            } else {
                rv4Var3.r0();
            }
            jce.F(npVar2, rv4Var3, a3);
            jce.F(npVar, rv4Var3, l3);
            s21.t(hashCode3, rv4Var3, npVar5, rv4Var3, kgVar);
            jce.F(npVar6, rv4Var3, p3);
            ba5 ba5Var3 = ba5Var;
            np npVar7 = npVar;
            cvb.c(str2, pna.f(kq7Var, 1.0f), 0L, null, 0L, null, dq4.f, null, 0L, null, new tlb(5), 0L, 2, false, 2, 0, null, r0f.A(rv4Var3).j, rv4Var, 1572912, 24960, 109500);
            cvb.c(qn4Var.d, pna.f(kq7Var, 1.0f), zl1.b(0.55f, r0f.y(rv4Var).q), null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 1, 0, null, r0f.A(rv4Var).l, rv4Var, 48, 24960, 109560);
            nq7 f = pna.f(kq7Var, 1.0f);
            gv9 a4 = ev9.a(dzVar, kh5.F, rv4Var, 0);
            int hashCode4 = Long.hashCode(rv4Var.T);
            xt8 l4 = rv4Var.l();
            nq7 p4 = lye.p(rv4Var, f);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar2, rv4Var, a4);
            jce.F(npVar7, rv4Var, l4);
            s21.t(hashCode4, rv4Var, npVar5, rv4Var, kgVar);
            jce.F(npVar6, rv4Var, p4);
            cvb.c(yqe.A((y3b) z1b.q0.getValue(), rv4Var), kq7Var, zl1.b(0.55f, r0f.y(rv4Var).q), null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 1, 0, null, r0f.A(rv4Var).l, rv4Var, 48, 24960, 109560);
            xbe.i(rv4Var, pna.s(kq7Var, 6.0f));
            qn4Var2 = qn4Var;
            tc4.l(qn4Var2.i, null, false, zl1.b(0.55f, r0f.y(rv4Var).q), 0L, 0L, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).l, rv4Var, 0, 0, 131062);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            rv4Var2.q(true);
            xbe.i(rv4Var2, pna.s(kq7Var, 12.0f));
            if (z3) {
                wk3Var = (wk3) ok3.S.getValue();
            } else {
                wk3Var = (wk3) ok3.T.getValue();
            }
            ar5 c2 = rp5.c(wk3Var, rv4Var2, 0);
            if (z3) {
                rv4Var2.e0(-1491589457);
                b2 = r0f.y(rv4Var2).a;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-1491518374);
                b2 = zl1.b(0.5f, r0f.y(rv4Var2).q);
                rv4Var2.q(false);
            }
            long j = b2;
            nq7 g2 = a82.g(rv4Var2, 6.0f, tte.k(pna.n(kq7Var, 40.0f), uu9.a), ba5Var3);
            int i12 = i6;
            if ((i12 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i12 & 14) != 4) {
                z5 = false;
            } else {
                z5 = true;
            }
            boolean z8 = z5 | z4;
            Object P2 = rv4Var2.P();
            if (!z8 && P2 != lh9Var) {
                xt4Var2 = xt4Var;
            } else {
                xt4Var2 = xt4Var;
                P2 = new u93(16, xt4Var2, qn4Var2);
                rv4Var2.o0(P2);
            }
            nk5.a(c2, null, zbe.y(lbe.f(15, (vt4) P2, g2, null, false), 8.0f), j, rv4Var2, 48, 0);
            rv4Var2.q(true);
        } else {
            qn4Var2 = qn4Var;
            xt4Var2 = xt4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new i31(qn4Var2, nq7Var, vt4Var, xt4Var2, i, 20);
        }
    }

    public static final void e(List list, bkd bkdVar, bkd bkdVar2, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        kq7 kq7Var;
        boolean z2;
        boolean z3;
        boolean z4;
        kq7 kq7Var2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1485185348);
        if (rv4Var2.f(list)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (rv4Var2.f(bkdVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (rv4Var2.f(bkdVar2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i10 = i9 | i4 | 3072;
        if (rv4Var2.h(xt4Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i11 = i10 | i5;
        if (rv4Var2.h(xt4Var2)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i12 = i11 | i6;
        if (rv4Var2.h(vt4Var)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i13 = i12 | i7;
        boolean z5 = true;
        if ((599187 & i13) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i13 & 1, z)) {
            boolean isEmpty = list.isEmpty();
            kq7 kq7Var3 = kq7.a;
            if (isEmpty) {
                rv4Var2.e0(1596687778);
                jxe.d(owe.F(rv4Var2), yqe.A((y3b) o2b.o0.getValue(), rv4Var2), yqe.A((y3b) o2b.p0.getValue(), rv4Var2), zbe.x(pna.c, bkdVar), yqe.A((y3b) o2b.T.getValue(), rv4Var2), vt4Var, rv4Var2, (i13 >> 3) & 458752, 0);
                rv4Var2.q(false);
                kq7Var2 = kq7Var3;
            } else {
                rv4Var2.e0(1597107642);
                f25 f25Var = new f25(360.0f);
                hz hzVar = new hz(8.0f, true, new vs(2));
                hz hzVar2 = new hz(8.0f, true, new vs(2));
                if ((i13 & 14) != 4) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if ((57344 & i13) == 16384) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z6 = z2 | z3;
                if ((i13 & 458752) != 131072) {
                    z5 = false;
                }
                boolean z7 = z6 | z5;
                Object P = rv4Var2.P();
                if (!z7 && P != ax1.a) {
                    z4 = false;
                } else {
                    z4 = false;
                    P = new sn4(list, xt4Var, xt4Var2, 0);
                    rv4Var2.o0(P);
                }
                kq7Var2 = kq7Var3;
                pc2.d(f25Var, kq7Var2, null, bkdVar, hzVar2, hzVar, null, false, 0L, 0L, bkdVar2, nae.e, (xt4) P, rv4Var, 1769520 | ((i13 << 6) & 7168), (i13 >> 3) & Token.ASSIGN_MOD, 6036);
                rv4Var2 = rv4Var;
                rv4Var2.q(z4);
            }
            kq7Var = kq7Var2;
        } else {
            rv4Var2.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new bx(list, bkdVar, bkdVar2, kq7Var, xt4Var, xt4Var2, vt4Var, i, 2);
        }
    }

    public static final void f(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, cz7 cz7Var, rh8 rh8Var, bkd bkdVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        pb2 pb2Var;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        cz7Var.getClass();
        vt4Var.getClass();
        rv4Var2.g0(-890189322);
        if (rv4Var2.f(cz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var2.f(rh8Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var2.f(bkdVar)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var2.h(vt4Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i9 = i8 | i5;
        if ((i9 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i9 & 1, z)) {
            sdd a2 = kv6.a(rv4Var2);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                final ao4 ao4Var = (ao4) ((fdd) voe.z(cm9.a(ao4.class), a2.i(), null, pb2Var, o96.a(rv4Var2), null));
                aw7 z3 = jsc.z(ao4Var.C, rv4Var2);
                sac sacVar = (sac) rv4Var2.j(uac.a);
                s02 s02Var = ao4Var.D;
                boolean f = rv4Var2.f(sacVar);
                Object P = rv4Var2.P();
                lh9 lh9Var = ax1.a;
                if (f || P == lh9Var) {
                    P = new wa(sacVar, (m42) null, 11);
                    rv4Var2.o0(P);
                }
                jye.b(s02Var, null, (mu4) P, rv4Var2, 0);
                if (((xn4) z3.getValue()).a) {
                    rv4Var2.e0(1793828170);
                    rv4Var2.q(false);
                } else if (((xn4) z3.getValue()).d.isEmpty() && ((xn4) z3.getValue()).e.isEmpty()) {
                    rv4Var2.e0(1793943304);
                    jxe.d(owe.F(rv4Var2), yqe.A((y3b) o2b.o0.getValue(), rv4Var2), yqe.A((y3b) o2b.p0.getValue(), rv4Var2), zbe.x(pna.c, rh8Var), yqe.A((y3b) o2b.T.getValue(), rv4Var2), vt4Var, rv4Var2, (i9 << 3) & 458752, 0);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.e0(1794393021);
                    xn4 xn4Var = (xn4) z3.getValue();
                    boolean f2 = rv4Var2.f(ao4Var);
                    Object P2 = rv4Var2.P();
                    if (f2 || P2 == lh9Var) {
                        P2 = new xt4() { // from class: rn4
                            @Override // defpackage.xt4
                            public final Object invoke(Object obj) {
                                int i10 = r2;
                                pvc pvcVar = pvc.a;
                                ao4 ao4Var2 = ao4Var;
                                switch (i10) {
                                    case 0:
                                        boolean booleanValue = ((Boolean) obj).booleanValue();
                                        hk1 a3 = jdd.a(ao4Var2);
                                        sw2 sw2Var = ab3.a;
                                        ao4Var2.f(a3, ru2.c, new gx(ao4Var2, booleanValue, (m42) null, 5));
                                        return pvcVar;
                                    default:
                                        String str = (String) obj;
                                        str.getClass();
                                        hk1 a4 = jdd.a(ao4Var2);
                                        sw2 sw2Var2 = ab3.a;
                                        ao4Var2.f(a4, ru2.c, new u(ao4Var2, str, null));
                                        return pvcVar;
                                }
                            }
                        };
                        rv4Var2.o0(P2);
                    }
                    xt4 xt4Var = (xt4) P2;
                    if ((i9 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Object P3 = rv4Var2.P();
                    if (z2 || P3 == lh9Var) {
                        P3 = new ar0(cz7Var, 7);
                        rv4Var2.o0(P3);
                    }
                    xt4 xt4Var2 = (xt4) P3;
                    boolean f3 = rv4Var2.f(ao4Var);
                    Object P4 = rv4Var2.P();
                    if (f3 || P4 == lh9Var) {
                        P4 = new xt4() { // from class: rn4
                            @Override // defpackage.xt4
                            public final Object invoke(Object obj) {
                                int i10 = r2;
                                pvc pvcVar = pvc.a;
                                ao4 ao4Var2 = ao4Var;
                                switch (i10) {
                                    case 0:
                                        boolean booleanValue = ((Boolean) obj).booleanValue();
                                        hk1 a3 = jdd.a(ao4Var2);
                                        sw2 sw2Var = ab3.a;
                                        ao4Var2.f(a3, ru2.c, new gx(ao4Var2, booleanValue, (m42) null, 5));
                                        return pvcVar;
                                    default:
                                        String str = (String) obj;
                                        str.getClass();
                                        hk1 a4 = jdd.a(ao4Var2);
                                        sw2 sw2Var2 = ab3.a;
                                        ao4Var2.f(a4, ru2.c, new u(ao4Var2, str, null));
                                        return pvcVar;
                                }
                            }
                        };
                        rv4Var2.o0(P4);
                    }
                    g(xn4Var, rh8Var, bkdVar, nq7Var, xt4Var, xt4Var2, (xt4) P4, vt4Var, rv4Var2, (i9 & 8176) | ((i9 << 9) & 29360128));
                    rv4Var2 = rv4Var2;
                    rv4Var2.q(false);
                }
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new nf3(cz7Var, rh8Var, bkdVar, nq7Var, vt4Var, i, 1);
        }
    }

    public static final void g(xn4 xn4Var, rh8 rh8Var, bkd bkdVar, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        xn4 xn4Var2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-558735564);
        if ((i & 6) == 0) {
            if (rv4Var2.f(xn4Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.f(rh8Var)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.f(bkdVar)) {
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
            if (rv4Var2.h(xt4Var)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (rv4Var2.h(xt4Var2)) {
                i5 = 131072;
            } else {
                i5 = Parser.ARGC_LIMIT;
            }
            i2 |= i5;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var2.h(xt4Var3)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        if ((4793491 & i2) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i2 & 1, z)) {
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yte.s(rv4Var2);
                rv4Var2.o0(P);
            }
            m82 m82Var = (m82) P;
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var) {
                P2 = new k24(14);
                rv4Var2.o0(P2);
            }
            int i11 = i2;
            iw2 b2 = uj8.b(0, (vt4) P2, rv4Var2, 384, 3);
            b37 d2 = fu0.d(kh5.a, false);
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
            jce.F(qw1.f, rv4Var2, d2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            ya9 b3 = ra9.b(rv4Var2);
            ze4 ze4Var = pna.c;
            boolean z3 = xn4Var.c;
            if ((i11 & 57344) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean f = z2 | rv4Var2.f(b2);
            Object P3 = rv4Var2.P();
            if (f || P3 == lh9Var) {
                P3 = new u93(17, xt4Var, b2);
                rv4Var2.o0(P3);
            }
            xn4Var2 = xn4Var;
            ra9.a(z3, (vt4) P3, ze4Var, b3, null, jce.E(1158647315, new ld1(19, b3, xn4Var, rh8Var), rv4Var2), false, nae.e, jce.E(-1588095978, new cr0(b2, xn4Var, rh8Var, bkdVar, xt4Var2, xt4Var3, vt4Var), rv4Var2), rv4Var, 100860288);
            rv4Var2 = rv4Var;
            int size = xn4Var2.d.size();
            int size2 = xn4Var2.e.size();
            nq7 x = zbe.x(pna.f(kq7.a, 1.0f), rh8Var);
            boolean h = rv4Var2.h(m82Var) | rv4Var2.f(b2);
            Object P4 = rv4Var2.P();
            if (h || P4 == lh9Var) {
                P4 = new bs1(4, m82Var, b2);
                rv4Var2.o0(P4);
            }
            h(b2, size, size2, x, (xt4) P4, rv4Var2, 0);
            rv4Var2.q(true);
        } else {
            xn4Var2 = xn4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ua(xn4Var2, rh8Var, bkdVar, nq7Var, xt4Var, xt4Var2, xt4Var3, vt4Var, i, 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0094, code lost:
        if (r5 == defpackage.ax1.a) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(defpackage.rj8 r15, int r16, int r17, defpackage.nq7 r18, defpackage.xt4 r19, defpackage.rv4 r20, int r21) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwe.h(rj8, int, int, nq7, xt4, rv4, int):void");
    }

    public static final void i(int i, rv4 rv4Var) {
        rv4Var.g0(1257244356);
        if (i == 0 && rv4Var.E()) {
            rv4Var.X();
        } else {
            int i2 = il5.a;
            rv4Var.f0(-1115894518);
            rv4Var.f0(1886828752);
            if (rv4Var.a instanceof my) {
                rv4Var.c0();
                if (rv4Var.S) {
                    rv4Var.k(new zx1(0, 29));
                } else {
                    rv4Var.r0();
                }
                hl5.v(rv4Var, true, false, false);
            } else {
                p17.h();
                throw null;
            }
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new kid(i, 1);
        }
    }

    public static final void j(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(-1303847715);
        if (rv4Var.f(cz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        boolean z2 = true;
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
                sx6 sx6Var = (sx6) ((fdd) voe.z(cm9.a(sx6.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z3 = jsc.z(sx6Var.d, rv4Var);
                kb kbVar = (kb) rv4Var.j(yb.a);
                s02 s02Var = sx6Var.e;
                boolean f = rv4Var.f(kbVar);
                if ((i3 & 14) != 4) {
                    z2 = false;
                }
                boolean z4 = f | z2;
                Object P = rv4Var.P();
                if (z4 || P == ax1.a) {
                    P = new we1(kbVar, cz7Var, (m42) null, 10);
                    rv4Var.o0(P);
                }
                jye.b(s02Var, null, (mu4) P, rv4Var, 0);
                fxe.h(yqe.A((y3b) b2b.x.getValue(), rv4Var), null, false, jce.E(927321945, new h64(cz7Var, 13), rv4Var), null, null, jce.E(1442356392, new cs1(sx6Var, cz7Var, z3, 6), rv4Var), rv4Var, 1575936, 54);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new h64(cz7Var, i, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean k(java.util.List r13, java.util.List r14, defpackage.rt5 r15) {
        /*
            r13.getClass()
            int r0 = r15.a
            boolean r1 = r13.isEmpty()
            r2 = 0
            if (r1 != 0) goto La9
            boolean r1 = r14.isEmpty()
            if (r1 == 0) goto L14
            goto La9
        L14:
            java.util.Iterator r1 = r14.iterator()
            r3 = -1
        L19:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L37
            java.lang.Object r4 = r1.next()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 < 0) goto La9
            int r5 = r13.size()
            if (r4 >= r5) goto La9
            if (r4 > r3) goto L35
            goto La9
        L35:
            r3 = r4
            goto L19
        L37:
            int r1 = r13.size()
            r3 = 0
            r4 = r2
            r5 = r4
            r7 = r5
            r8 = r7
            r6 = r3
        L41:
            if (r4 >= r1) goto La8
            java.lang.Object r9 = r13.get(r4)
            xl0 r9 = (defpackage.xl0) r9
            yl0 r10 = r9.d
            hn0 r9 = r9.b
            int r10 = r10.a
            if (r6 == 0) goto L5f
            boolean r11 = r9.a()
            if (r11 == 0) goto L5d
            int r11 = r6.intValue()
            if (r10 > r11) goto L5f
        L5d:
            r8 = r2
            r6 = r3
        L5f:
            int r11 = r14.size()
            r12 = 1
            if (r7 >= r11) goto L8d
            java.lang.Object r11 = r14.get(r7)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            if (r11 != r4) goto L8d
            int r11 = r15.ordinal()
            if (r11 == 0) goto L7e
            if (r11 != r12) goto L80
            if (r10 != 0) goto L7e
            r11 = r2
            goto L84
        L7e:
            r11 = r0
            goto L84
        L80:
            defpackage.xk5.o()
            return r2
        L84:
            int r7 = r7 + 1
            if (r11 == 0) goto L8d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            r8 = r11
        L8d:
            if (r8 == 0) goto L97
            boolean r11 = r9.a()
            if (r11 == 0) goto L97
            int r10 = r10 + r8
            r5 = r12
        L97:
            if (r10 < 0) goto La9
            r11 = 6
            if (r10 >= r11) goto La9
            boolean r9 = r9.a()
            if (r9 != 0) goto La5
            if (r10 == 0) goto La5
            goto La9
        La5:
            int r4 = r4 + 1
            goto L41
        La8:
            return r5
        La9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwe.k(java.util.List, java.util.List, rt5):boolean");
    }

    public static final int l(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static final rm0 m() {
        rm0 rm0Var = new rm0();
        List B = tl1.B("text", "p");
        nz0 nz0Var = nz0.a;
        em0 em0Var = new em0("paragraph", "Paragraph", "Plain text paragraph", B, new pz0(nz0Var), n8.f, 16);
        LinkedHashMap linkedHashMap = rm0Var.a;
        linkedHashMap.put("paragraph", em0Var);
        for (int i = 1; i < 7; i++) {
            String j = a82.j(i, "heading_");
            linkedHashMap.put(j, new em0(j, a82.j(i, "Heading "), a82.j(i, "Heading level "), tl1.B(a82.j(i, "h"), "heading", "title"), new pz0(nz0Var), new sm0(i), 16));
        }
        linkedHashMap.put("todo", new em0("todo", "To-do", "Task with checkbox", tl1.B("checkbox", "task", "check", "todo"), new pz0(nz0Var), n8.C, 16));
        linkedHashMap.put("bullet_list", new em0("bullet_list", "Bullet List", "Unordered list item", tl1.B("list", "bullet", "ul", "unordered"), new pz0(nz0Var), n8.D, 16));
        linkedHashMap.put("numbered_list", new em0("numbered_list", "Numbered List", "Ordered list item", tl1.B("list", "number", "ol", "ordered"), new pz0(nz0Var), n8.E, 16));
        linkedHashMap.put("quote", new em0("quote", "Quote", "Quoted text block", tl1.B("blockquote", "citation"), new pz0(nz0Var), n8.F, 16));
        linkedHashMap.put("code", new em0("code", "Code", "Plain code block", tl1.B("code", "snippet", "monospace"), new pz0(nz0Var, "ic_code"), n8.G, 16));
        linkedHashMap.put("divider", new em0("divider", "Divider", "Horizontal line separator", tl1.B("hr", "line", "separator", "horizontal"), new pz0(mz0.a), n8.H, 16));
        xvc xvcVar = new xvc(2);
        Iterator it = tl1.B("paragraph", "heading_1", "heading_2", "heading_3", "heading_4", "heading_5", "heading_6", "bullet_list", "numbered_list", "quote", "code").iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            LinkedHashMap linkedHashMap2 = rm0Var.b;
            if (hasNext) {
                String str = (String) it.next();
                str.getClass();
                linkedHashMap2.put(str, xvcVar);
            } else {
                linkedHashMap2.put("todo", new xvc(3));
                linkedHashMap2.put("divider", new xvc(1));
                return rm0Var;
            }
        }
    }

    public static final boolean n(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                xl0 xl0Var = (xl0) obj;
                int i2 = xl0Var.d.a;
                if (i2 < 0 || i2 >= 6 || (!xl0Var.b.a() && i2 != 0)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static final List o(List list) {
        ut5 ut5Var;
        int n;
        list.getClass();
        if (list.isEmpty()) {
            ut5Var = new ut5(list, ks3.a);
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    xl0 xl0Var = (xl0) obj;
                    int i3 = xl0Var.d.a;
                    if (!xl0Var.b.a()) {
                        n = 0;
                    } else {
                        n = dce.n(i3, 0, 5);
                    }
                    if (n == i3) {
                        arrayList.add(xl0Var);
                    } else {
                        arrayList2.add(Integer.valueOf(i));
                        xl0Var.d.getClass();
                        arrayList.add(xl0.a(xl0Var, null, null, new yl0(n), 7));
                    }
                    i = i2;
                } else {
                    tl1.M();
                    throw null;
                }
            }
            if (!arrayList2.isEmpty()) {
                list = arrayList;
            }
            ut5Var = new ut5(list, arrayList2);
        }
        return ut5Var.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
        if (r14 == r8) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(defpackage.v20 r11, long r12, defpackage.n42 r14) {
        /*
            boolean r0 = r14 instanceof defpackage.z20
            if (r0 == 0) goto L14
            r0 = r14
            z20 r0 = (defpackage.z20) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.e = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            z20 r0 = new z20
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.d
            int r0 = r6.e
            r7 = 3
            r1 = 2
            r2 = 1
            n82 r8 = defpackage.n82.a
            if (r0 == 0) goto L4a
            if (r0 == r2) goto L42
            if (r0 == r1) goto L38
            if (r0 != r7) goto L31
            v20 r11 = r6.a
            defpackage.hre.r(r14)
            return r11
        L31:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r11)
            r11 = 0
            return r11
        L38:
            long r11 = r6.c
            long r0 = r6.b
            v20 r13 = r6.a
            defpackage.hre.r(r14)
            goto L76
        L42:
            long r12 = r6.b
            v20 r11 = r6.a
            defpackage.hre.r(r14)
            goto L5a
        L4a:
            defpackage.hre.r(r14)
            r6.a = r11
            r6.b = r12
            r6.e = r2
            java.lang.Object r14 = r11.c(r6)
            if (r14 != r8) goto L5a
            goto L83
        L5a:
            java.lang.Number r14 = (java.lang.Number) r14
            long r2 = r14.longValue()
            r6.a = r11
            r6.b = r12
            r6.c = r2
            r6.e = r1
            long r4 = r2 + r12
            r1 = r11
            java.lang.Object r14 = v(r1, r2, r4, r6)
            if (r14 != r8) goto L72
            goto L83
        L72:
            r9 = r12
            r13 = r1
            r0 = r9
            r11 = r2
        L76:
            v20 r14 = (defpackage.v20) r14
            long r11 = r11 + r0
            r6.a = r14
            r6.e = r7
            r13.b = r11
            pvc r11 = defpackage.pvc.a
            if (r11 != r8) goto L84
        L83:
            return r8
        L84:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwe.p(v20, long, n42):java.lang.Object");
    }

    public static final List q(String str, List list, Set set) {
        list.getClass();
        int i = 0;
        if (!set.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    xl0 xl0Var = (xl0) obj;
                    if (set.contains(new pm0(xl0Var.a)) && xl0Var.b.a()) {
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            int i4 = 0;
                            while (i4 < size) {
                                Object obj2 = arrayList.get(i4);
                                i4++;
                                if (i2 < x(((Number) obj2).intValue(), list)) {
                                    break;
                                }
                            }
                        }
                        arrayList.add(Integer.valueOf(i2));
                    }
                    i2 = i3;
                } else {
                    tl1.M();
                    throw null;
                }
            }
            return arrayList;
        }
        if (str != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (c16.i(((xl0) it.next()).a, str)) {
                    break;
                }
                i++;
            }
        }
        i = -1;
        if (i != -1 && ((xl0) list.get(i)).b.a()) {
            return tl1.A(Integer.valueOf(i));
        }
        return ks3.a;
    }

    public static final nq7 r(nq7 nq7Var, float f, float f2) {
        if (f == 1.0f && f2 == 1.0f) {
            return nq7Var;
        }
        return axe.l(nq7Var, f, f2, nae.e, nae.e, nae.e, null, false, null, 1048572);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r4 == 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List s(java.util.List r7, java.lang.String r8, java.util.Set r9, defpackage.rt5 r10) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwe.s(java.util.List, java.lang.String, java.util.Set, rt5):java.util.List");
    }

    public static final boolean t(lp3 lp3Var) {
        ArrayList arrayList;
        if (lp3Var instanceof op3) {
            return true;
        }
        if ((lp3Var instanceof up3) && ((arrayList = ((up3) lp3Var).b) == null || !arrayList.isEmpty())) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (t((lp3) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (r11 == r7) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(defpackage.v20 r8, long r9, defpackage.n42 r11) {
        /*
            boolean r0 = r11 instanceof defpackage.a30
            if (r0 == 0) goto L14
            r0 = r11
            a30 r0 = (defpackage.a30) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            a30 r0 = new a30
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.c
            int r0 = r6.d
            r1 = 0
            r2 = 2
            r3 = 1
            n82 r7 = defpackage.n82.a
            if (r0 == 0) goto L3b
            if (r0 == r3) goto L33
            if (r0 != r2) goto L2d
            defpackage.hre.r(r11)
            return r11
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r1
        L33:
            long r9 = r6.b
            v20 r8 = r6.a
            defpackage.hre.r(r11)
            goto L4d
        L3b:
            defpackage.hre.r(r11)
            r6.a = r8
            r6.b = r9
            r6.d = r3
            w20 r11 = r8.a
            java.lang.Object r11 = r11.e(r6)
            if (r11 != r7) goto L4d
            goto L5f
        L4d:
            java.lang.Number r11 = (java.lang.Number) r11
            long r4 = r11.longValue()
            r6.a = r1
            r6.d = r2
            r1 = r8
            r2 = r9
            java.lang.Object r8 = v(r1, r2, r4, r6)
            if (r8 != r7) goto L60
        L5f:
            return r7
        L60:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwe.u(v20, long, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(defpackage.v20 r13, long r14, long r16, defpackage.n42 r18) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwe.v(v20, long, long, n42):java.lang.Object");
    }

    public static final nq7 w(nq7 nq7Var, boolean z, boolean z2, vt4 vt4Var) {
        if (z && e6b.a) {
            if (z2) {
                nq7Var = nq7Var.a0(new f6b(d));
            }
            return nq7Var.a0(new c6b(vt4Var));
        }
        return nq7Var;
    }

    public static final int x(int i, List list) {
        xl0 xl0Var;
        xl0 xl0Var2 = (xl0) list.get(i);
        if (!xl0Var2.b.a()) {
            return i + 1;
        }
        int i2 = xl0Var2.d.a;
        do {
            i++;
            if (i >= list.size()) {
                break;
            }
            xl0Var = (xl0) list.get(i);
            if (!xl0Var.b.a()) {
                break;
            }
        } while (xl0Var.d.a > i2);
        return i;
    }

    public static final List y(List list) {
        if (list.isEmpty()) {
            return ks3.a;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = ((Number) sl1.c0(list)).intValue();
        int size = list.size();
        int i = intValue;
        int i2 = 1;
        while (i2 < size) {
            int intValue2 = ((Number) list.get(i2)).intValue();
            if (intValue2 != i + 1) {
                arrayList.add(new ry5(intValue, i, 1));
                intValue = intValue2;
            }
            i2++;
            i = intValue2;
        }
        arrayList.add(new ry5(intValue, i, 1));
        return arrayList;
    }

    public static final jx5 z(cx5 cx5Var) {
        return new jx5(cx5Var.a, cx5Var.b, cx5Var.c, cx5Var.d);
    }
}
