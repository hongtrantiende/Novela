package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: que  reason: default package */
/* loaded from: classes3.dex */
public abstract class que {
    public static final tu1 a = new tu1(new wu1(13), false, -1870705579);
    public static final tu1 b = new tu1(new wu1(14), false, 1155591638);
    public static final tu1 c = new tu1(new wu1(15), false, 229482722);

    public static final void a(l64 l64Var, bkd bkdVar, nq7 nq7Var, vt4 vt4Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        nq7 nq7Var2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(989528650);
        if (rv4Var2.h(l64Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var2.f(bkdVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var2.h(vt4Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if (rv4Var2.h(xt4Var)) {
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
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7Var2 = nq7Var;
            nq7 p = lye.p(rv4Var2, nq7Var2);
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
            if (l64Var.a) {
                rv4Var2.e0(1098148371);
            } else {
                rv4Var2.e0(1098209627);
                if (l64Var.b.isEmpty()) {
                    rv4Var2.e0(1098260095);
                    jxe.d(owe.D(rv4Var2), yqe.A((y3b) o2b.w0.getValue(), rv4Var2), yqe.A((y3b) o2b.x0.getValue(), rv4Var2), zbe.A(pna.c, 12.0f, nae.e, 2), yqe.A((y3b) v1b.o.getValue(), rv4Var2), vt4Var, rv4Var2, ((i9 << 6) & 458752) | 3072, 0);
                    rv4Var2 = rv4Var2;
                    rv4Var2.q(false);
                } else {
                    rv4Var2.e0(1098736906);
                    b(l64Var.b, bkdVar, pna.c, xt4Var, rv4Var2, (i9 & Token.ASSIGN_MOD) | 384 | ((i9 >> 3) & 7168));
                    rv4Var2.q(false);
                }
            }
            rv4Var2.q(false);
            rv4Var2.q(true);
        } else {
            nq7Var2 = nq7Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new wp0(l64Var, bkdVar, nq7Var2, vt4Var, xt4Var, i);
        }
    }

    public static final void b(List list, bkd bkdVar, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        boolean h;
        int i6;
        rv4Var.g0(1051269577);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var.f(list);
            } else {
                h = rv4Var.h(list);
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
            if (rv4Var.f(bkdVar)) {
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
            if (rv4Var.h(xt4Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        boolean z3 = false;
        if ((i2 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            bkd r = mwe.r(bkdVar, zbe.h(2, 16.0f));
            bkd r2 = mwe.r(bkdVar, zbe.j(nae.e, nae.e, 4.0f, nae.e, 11));
            hz hzVar = new hz(4.0f, true, new vs(2));
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !rv4Var.h(list))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((i2 & 7168) == 2048) {
                z3 = true;
            }
            boolean z4 = z2 | z3;
            Object P = rv4Var.P();
            if (z4 || P == ax1.a) {
                P = new yv0(list, xt4Var, 2);
                rv4Var.o0(P);
            }
            pc2.c(nq7Var, null, r, hzVar, null, null, false, r2, 0L, 0L, nae.e, (xt4) P, rv4Var, ((i2 >> 6) & 14) | 24576, 0, 3818);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new x90(list, bkdVar, nq7Var, xt4Var, i, 3);
        }
    }

    public static final void c(boolean z, cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z2;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(1584079506);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (rv4Var.f(cz7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        boolean z3 = true;
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i5 & 1, z2)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                m64 m64Var = (m64) ((fdd) voe.z(cm9.a(m64.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z4 = jsc.z(m64Var.e, rv4Var);
                Object[] objArr = new Object[0];
                if ((i5 & 14) != 4) {
                    z3 = false;
                }
                Object P = rv4Var.P();
                Object obj = ax1.a;
                if (z3 || P == obj) {
                    P = new g64(0, z);
                    rv4Var.o0(P);
                }
                aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 0);
                Object obj2 = (kb) rv4Var.j(yb.a);
                boolean f = rv4Var.f(m64Var) | rv4Var.f(obj2);
                Object P2 = rv4Var.P();
                if (f || P2 == obj) {
                    P2 = new ol(m64Var, obj2, (m42) null, 10);
                    rv4Var.o0(P2);
                }
                yte.g((lu4) P2, rv4Var, m64Var);
                fxe.h(yqe.A((y3b) x2b.V.getValue(), rv4Var), null, false, jce.E(1520989710, new h64(cz7Var, 0), rv4Var), null, jce.E(14893843, new i64(z4, aw7Var), rv4Var), jce.E(-1689571427, new cs1(4, aw7Var, m64Var, z4), rv4Var), rv4Var, 1772544, 22);
                boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
                boolean f2 = rv4Var.f(aw7Var);
                Object P3 = rv4Var.P();
                if (f2 || P3 == obj) {
                    P3 = new zn3(aw7Var, 20);
                    rv4Var.o0(P3);
                }
                xt4 xt4Var = (xt4) P3;
                boolean f3 = rv4Var.f(m64Var);
                Object P4 = rv4Var.P();
                if (f3 || P4 == obj) {
                    P4 = new j64(m64Var, 0);
                    rv4Var.o0(P4);
                }
                e(booleanValue, xt4Var, (xt4) P4, rv4Var, 0);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new g72(z, cz7Var, i);
        }
    }

    public static fkb d() {
        return new fkb((fkb) fkb.d.getValue(), null);
    }

    public static final void e(boolean z, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        rv4Var.g0(367620054);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.h(xt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.h(xt4Var2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i7 & 1, z2)) {
            Object[] objArr = new Object[0];
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = new k24(4);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 48);
            xb.d(z, xt4Var, jce.E(1915315714, new h24(xt4Var, xt4Var2, aw7Var), rv4Var), null, mwe.x(kq7.a, 14), jce.E(1518344479, new id1(xt4Var, 4, (byte) 0), rv4Var), bue.d, null, 0L, 0L, nae.e, false, false, jce.E(-414214486, new sp0(aw7Var, 5), rv4Var), rv4Var, (i7 & 14) | 1769856 | (i7 & Token.ASSIGN_MOD), 8072);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new kr3(z, xt4Var, xt4Var2, i, 1);
        }
    }

    public static final void f(f84 f84Var, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        rv4 rv4Var2;
        boolean z2;
        rv4Var.g0(1717998731);
        if (rv4Var.f(f84Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
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
            String str = f84Var.b;
            oyb oybVar = r0f.A(rv4Var).i;
            kq7 kq7Var = kq7.a;
            cvb.c(str, pna.f(kq7Var, 1.0f), 0L, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 0, false, 0, 0, null, oybVar, rv4Var, 48, 0, 130044);
            nq7 f = hl5.f(kq7Var, 8.0f, rv4Var, kq7Var, 1.0f);
            gv9 a3 = ev9.a(lz.a, kh5.G, rv4Var, 48);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, f);
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
            cvb.c(f84Var.a, null, r0f.y(rv4Var).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).h, rv4Var, 0, 0, 131066);
            xbe.i(rv4Var, new we6(1.0f, true));
            nq7 v = nmd.v(tte.k(pna.j(pna.u(kq7Var, 50.0f, nae.e, 2), 32.0f, nae.e, 2), r0f.z(rv4Var).d), rm1.g(r0f.y(rv4Var), 3.0f), lre.g);
            if ((i7 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new jf3(11, vt4Var);
                rv4Var.o0(P);
            }
            nq7 z3 = zbe.z(lbe.f(15, (vt4) P, v, null, false), 10.0f, 6.0f);
            b37 d = fu0.d(kh5.a, false);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, z3);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, d);
            jce.F(npVar2, rv4Var, l3);
            s21.t(hashCode3, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p3);
            nq7 a4 = pu0.a.a(kq7Var, kh5.e);
            String upperCase = yqe.A((y3b) o2b.y.getValue(), rv4Var).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            cvb.c(upperCase, a4, zl1.f, null, 0L, null, dq4.D, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).n, rv4Var, 1573248, 0, 131000);
            rv4Var2 = rv4Var;
            hl5.v(rv4Var2, true, true, true);
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ax(f84Var, nq7Var, vt4Var, i, 18);
        }
    }

    public static final void g(int i, rv4 rv4Var, nq7 nq7Var, boolean z) {
        int i2;
        int i3;
        boolean z2;
        long g;
        long b2;
        lk0 lk0Var = kh5.I;
        rv4Var.g0(425816388);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i5 & 1, z2)) {
            nq7 t = jsc.t(0.6666667f, nq7Var, false);
            if (z) {
                rv4Var.e0(-1837135147);
                g = ((h27) rv4Var.j(j27.a)).a.a;
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1837056066);
                g = rm1.g(((h27) rv4Var.j(j27.a)).a, 10.0f);
                rv4Var.q(false);
            }
            tza tzaVar = j27.a;
            nq7 k = tte.k(zbe.y(st0.d(t, 2.0f, g, ((h27) rv4Var.j(tzaVar)).c.b), 4.0f), ((h27) rv4Var.j(tzaVar)).c.b);
            b37 d = fu0.d(kh5.a, false);
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
            np npVar = qw1.f;
            jce.F(npVar, rv4Var, d);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var, p);
            if (z) {
                rv4Var.e0(643870520);
                b2 = zl1.b(0.5f, ((h27) rv4Var.j(tzaVar)).a.a);
                rv4Var.q(false);
            } else {
                rv4Var.e0(643952143);
                b2 = zl1.b(0.5f, ((h27) rv4Var.j(tzaVar)).a.c);
                rv4Var.q(false);
            }
            nq7 C = rte.C(pna.c, rte.u(rv4Var), 12);
            ez ezVar = lz.c;
            xn1 a2 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, C);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a2);
            jce.F(npVar2, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p2);
            rv4Var.e0(1650076082);
            for (int i6 = 0; i6 < 4; i6++) {
                kq7 kq7Var = kq7.a;
                float f = 1.0f;
                nq7 f2 = pna.f(kq7Var, 1.0f);
                gv9 a3 = ev9.a(lz.a, kh5.F, rv4Var, 0);
                int hashCode3 = Long.hashCode(rv4Var.T);
                xt8 l3 = rv4Var.l();
                nq7 p3 = lye.p(rv4Var, f2);
                rw1.k.getClass();
                zx1 zx1Var2 = qw1.b;
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(zx1Var2);
                } else {
                    rv4Var.r0();
                }
                jce.F(qw1.f, rv4Var, a3);
                jce.F(qw1.e, rv4Var, l3);
                jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode3));
                jce.C(qw1.h, rv4Var);
                jce.F(qw1.d, rv4Var, p3);
                rv4Var.e0(-939450900);
                int i7 = 0;
                while (i7 < 3) {
                    nq7 y = zbe.y(new we6(f, true), 4.0f);
                    xn1 a4 = wn1.a(ezVar, lk0Var, rv4Var, 0);
                    int hashCode4 = Long.hashCode(rv4Var.T);
                    xt8 l4 = rv4Var.l();
                    nq7 p4 = lye.p(rv4Var, y);
                    rw1.k.getClass();
                    zx1 zx1Var3 = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var3);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(qw1.f, rv4Var, a4);
                    jce.F(qw1.e, rv4Var, l4);
                    jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode4));
                    jce.C(qw1.h, rv4Var);
                    jce.F(qw1.d, rv4Var, p4);
                    nq7 f3 = pna.f(kq7Var, f);
                    tza tzaVar2 = j27.a;
                    nq7 k2 = tte.k(f3, ((h27) rv4Var.j(tzaVar2)).c.a);
                    ba5 ba5Var = lre.g;
                    fu0.a(jsc.t(0.6666667f, nmd.v(k2, b2, ba5Var), false), rv4Var, 0);
                    fu0.a(nmd.v(tte.k(pna.h(hl5.f(kq7Var, 2.0f, rv4Var, kq7Var, f), 2.0f), ((h27) rv4Var.j(tzaVar2)).c.a), b2, ba5Var), rv4Var, 0);
                    fu0.a(nmd.v(tte.k(pna.h(zbe.A(hl5.f(kq7Var, f, rv4Var, kq7Var, f), 4.0f, nae.e, 2), 2.0f), ((h27) rv4Var.j(tzaVar2)).c.b), b2, ba5Var), rv4Var, 0);
                    rv4Var.q(true);
                    i7++;
                    f = 1.0f;
                }
                rv4Var.q(false);
                rv4Var.q(true);
            }
            hl5.v(rv4Var, false, true, true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new uq0(z, nq7Var, i, 4);
        }
    }

    public static final void h(int i, rv4 rv4Var, nq7 nq7Var, boolean z) {
        int i2;
        int i3;
        boolean z2;
        long g;
        long b2;
        lk0 lk0Var = kh5.I;
        rv4Var.g0(-2014805371);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i5 & 1, z2)) {
            nq7 t = jsc.t(0.6666667f, nq7Var, false);
            if (z) {
                rv4Var.e0(-898603532);
                g = ((h27) rv4Var.j(j27.a)).a.a;
                rv4Var.q(false);
            } else {
                rv4Var.e0(-898524451);
                g = rm1.g(((h27) rv4Var.j(j27.a)).a, 10.0f);
                rv4Var.q(false);
            }
            tza tzaVar = j27.a;
            nq7 k = tte.k(zbe.y(st0.d(t, 2.0f, g, ((h27) rv4Var.j(tzaVar)).c.b), 4.0f), ((h27) rv4Var.j(tzaVar)).c.b);
            b37 d = fu0.d(kh5.a, false);
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
            np npVar = qw1.f;
            jce.F(npVar, rv4Var, d);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var, p);
            if (z) {
                rv4Var.e0(1582402135);
                b2 = zl1.b(0.5f, ((h27) rv4Var.j(tzaVar)).a.a);
                rv4Var.q(false);
            } else {
                rv4Var.e0(1582483758);
                b2 = zl1.b(0.5f, ((h27) rv4Var.j(tzaVar)).a.c);
                rv4Var.q(false);
            }
            nq7 C = rte.C(pna.c, rte.u(rv4Var), 12);
            ez ezVar = lz.c;
            xn1 a2 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, C);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a2);
            jce.F(npVar2, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p2);
            rv4Var.e0(1264708442);
            for (int i6 = 0; i6 < 4; i6++) {
                kq7 kq7Var = kq7.a;
                nq7 f = pna.f(kq7Var, 1.0f);
                gv9 a3 = ev9.a(lz.a, kh5.F, rv4Var, 0);
                int hashCode3 = Long.hashCode(rv4Var.T);
                xt8 l3 = rv4Var.l();
                nq7 p3 = lye.p(rv4Var, f);
                rw1.k.getClass();
                zx1 zx1Var2 = qw1.b;
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(zx1Var2);
                } else {
                    rv4Var.r0();
                }
                jce.F(qw1.f, rv4Var, a3);
                jce.F(qw1.e, rv4Var, l3);
                jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode3));
                jce.C(qw1.h, rv4Var);
                jce.F(qw1.d, rv4Var, p3);
                rv4Var.e0(-1324818540);
                for (int i7 = 0; i7 < 3; i7++) {
                    nq7 y = zbe.y(new we6(1.0f, true), 4.0f);
                    xn1 a4 = wn1.a(ezVar, lk0Var, rv4Var, 0);
                    int hashCode4 = Long.hashCode(rv4Var.T);
                    xt8 l4 = rv4Var.l();
                    nq7 p4 = lye.p(rv4Var, y);
                    rw1.k.getClass();
                    zx1 zx1Var3 = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var3);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(qw1.f, rv4Var, a4);
                    jce.F(qw1.e, rv4Var, l4);
                    jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode4));
                    jce.C(qw1.h, rv4Var);
                    jce.F(qw1.d, rv4Var, p4);
                    fu0.a(jsc.t(0.6666667f, nmd.v(tte.k(pna.f(kq7Var, 1.0f), ((h27) rv4Var.j(j27.a)).c.a), b2, lre.g), false), rv4Var, 0);
                    rv4Var.q(true);
                }
                rv4Var.q(false);
                rv4Var.q(true);
            }
            hl5.v(rv4Var, false, true, true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new uq0(z, nq7Var, i, 3);
        }
    }

    public static final void i(int i, rv4 rv4Var, nq7 nq7Var, boolean z) {
        int i2;
        int i3;
        boolean z2;
        long g;
        np npVar;
        long b2;
        lk0 lk0Var = kh5.I;
        rv4Var.g0(1086163180);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i5 & 1, z2)) {
            nq7 t = jsc.t(0.6666667f, nq7Var, false);
            if (z) {
                rv4Var.e0(-396070355);
                g = ((h27) rv4Var.j(j27.a)).a.a;
                rv4Var.q(false);
            } else {
                rv4Var.e0(-395991274);
                g = rm1.g(((h27) rv4Var.j(j27.a)).a, 10.0f);
                rv4Var.q(false);
            }
            tza tzaVar = j27.a;
            nq7 k = tte.k(zbe.y(st0.d(t, 2.0f, g, ((h27) rv4Var.j(tzaVar)).c.b), 4.0f), ((h27) rv4Var.j(tzaVar)).c.b);
            b37 d = fu0.d(kh5.a, false);
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
            np npVar2 = qw1.f;
            jce.F(npVar2, rv4Var, d);
            np npVar3 = qw1.e;
            jce.F(npVar3, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar4 = qw1.g;
            jce.F(npVar4, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar5 = qw1.d;
            jce.F(npVar5, rv4Var, p);
            if (z) {
                rv4Var.e0(2084935312);
                npVar = npVar4;
                b2 = zl1.b(0.5f, ((h27) rv4Var.j(tzaVar)).a.a);
                rv4Var.q(false);
            } else {
                npVar = npVar4;
                rv4Var.e0(2085016935);
                b2 = zl1.b(0.5f, ((h27) rv4Var.j(tzaVar)).a.c);
                rv4Var.q(false);
            }
            nq7 C = rte.C(pna.c, rte.u(rv4Var), 12);
            ez ezVar = lz.c;
            xn1 a2 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, C);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar2, rv4Var, a2);
            jce.F(npVar3, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar, rv4Var, kgVar);
            jce.F(npVar5, rv4Var, p2);
            rv4Var.e0(588182970);
            int i6 = 0;
            while (i6 < 10) {
                kq7 kq7Var = kq7.a;
                nq7 y = zbe.y(pna.f(kq7Var, 1.0f), 2.0f);
                gv9 a3 = ev9.a(lz.a, kh5.F, rv4Var, 0);
                int hashCode3 = Long.hashCode(rv4Var.T);
                xt8 l3 = rv4Var.l();
                nq7 p3 = lye.p(rv4Var, y);
                rw1.k.getClass();
                zx1 zx1Var2 = qw1.b;
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(zx1Var2);
                } else {
                    rv4Var.r0();
                }
                np npVar6 = qw1.f;
                jce.F(npVar6, rv4Var, a3);
                np npVar7 = qw1.e;
                jce.F(npVar7, rv4Var, l3);
                Integer valueOf2 = Integer.valueOf(hashCode3);
                np npVar8 = qw1.g;
                jce.F(npVar8, rv4Var, valueOf2);
                kg kgVar2 = qw1.h;
                jce.C(kgVar2, rv4Var);
                np npVar9 = qw1.d;
                jce.F(npVar9, rv4Var, p3);
                int i7 = i6;
                nq7 p4 = pna.p(kq7Var, 14.0f, 21.0f);
                ba5 ba5Var = lre.g;
                fu0.a(nmd.v(p4, b2, ba5Var), rv4Var, 0);
                nq7 y2 = zbe.y(new we6(1.0f, true), 4.0f);
                xn1 a4 = wn1.a(ezVar, lk0Var, rv4Var, 0);
                lk0 lk0Var2 = lk0Var;
                int hashCode4 = Long.hashCode(rv4Var.T);
                xt8 l4 = rv4Var.l();
                nq7 p5 = lye.p(rv4Var, y2);
                rv4Var.i0();
                ez ezVar2 = ezVar;
                if (rv4Var.S) {
                    rv4Var.k(zx1Var2);
                } else {
                    rv4Var.r0();
                }
                jce.F(npVar6, rv4Var, a4);
                jce.F(npVar7, rv4Var, l4);
                s21.t(hashCode4, rv4Var, npVar8, rv4Var, kgVar2);
                jce.F(npVar9, rv4Var, p5);
                nq7 h = pna.h(pna.f(kq7Var, 1.0f), 5.0f);
                tza tzaVar2 = j27.a;
                fu0.a(nmd.v(tte.k(h, ((h27) rv4Var.j(tzaVar2)).c.a), b2, ba5Var), rv4Var, 0);
                fu0.a(nmd.v(tte.k(pna.h(zbe.C(hl5.f(kq7Var, 3.0f, rv4Var, kq7Var, 1.0f), nae.e, nae.e, 10.0f, nae.e, 11), 5.0f), ((h27) rv4Var.j(tzaVar2)).c.b), b2, ba5Var), rv4Var, 0);
                rv4Var.q(true);
                rv4Var.q(true);
                i6 = i7 + 1;
                lk0Var = lk0Var2;
                ezVar = ezVar2;
            }
            hl5.v(rv4Var, false, true, true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new uq0(z, nq7Var, i, 5);
        }
    }

    public static final void j(int i, rv4 rv4Var, nq7 nq7Var, boolean z) {
        int i2;
        int i3;
        boolean z2;
        long b2;
        long g;
        lk0 lk0Var = kh5.I;
        rv4Var.g0(-1354458579);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i5 & 1, z2)) {
            if (z) {
                rv4Var.e0(542335121);
                b2 = zl1.b(0.5f, ((h27) rv4Var.j(j27.a)).a.a);
                rv4Var.q(false);
            } else {
                rv4Var.e0(542408808);
                b2 = zl1.b(0.5f, ((h27) rv4Var.j(j27.a)).a.c);
                rv4Var.q(false);
            }
            nq7 t = jsc.t(0.6666667f, nq7Var, false);
            if (z) {
                rv4Var.e0(542643788);
                g = ((h27) rv4Var.j(j27.a)).a.a;
                rv4Var.q(false);
            } else {
                rv4Var.e0(542722869);
                g = rm1.g(((h27) rv4Var.j(j27.a)).a, 10.0f);
                rv4Var.q(false);
            }
            tza tzaVar = j27.a;
            nq7 k = tte.k(zbe.y(st0.d(t, 2.0f, g, ((h27) rv4Var.j(tzaVar)).c.b), 4.0f), ((h27) rv4Var.j(tzaVar)).c.b);
            b37 d = fu0.d(kh5.a, false);
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
            np npVar = qw1.f;
            jce.F(npVar, rv4Var, d);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var, p);
            nq7 C = rte.C(pna.c, rte.u(rv4Var), 12);
            ez ezVar = lz.c;
            xn1 a2 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, C);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a2);
            jce.F(npVar2, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p2);
            rv4Var.e0(202816067);
            for (int i6 = 0; i6 < 10; i6++) {
                kq7 kq7Var = kq7.a;
                nq7 f = pna.f(kq7Var, 1.0f);
                gv9 a3 = ev9.a(lz.a, kh5.F, rv4Var, 0);
                int hashCode3 = Long.hashCode(rv4Var.T);
                xt8 l3 = rv4Var.l();
                nq7 p3 = lye.p(rv4Var, f);
                rw1.k.getClass();
                zx1 zx1Var2 = qw1.b;
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(zx1Var2);
                } else {
                    rv4Var.r0();
                }
                jce.F(qw1.f, rv4Var, a3);
                jce.F(qw1.e, rv4Var, l3);
                jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode3));
                jce.C(qw1.h, rv4Var);
                jce.F(qw1.d, rv4Var, p3);
                rv4Var.e0(1908256380);
                for (int i7 = 0; i7 < 2; i7++) {
                    nq7 y = zbe.y(new we6(1.0f, true), 4.0f);
                    xn1 a4 = wn1.a(ezVar, lk0Var, rv4Var, 0);
                    int hashCode4 = Long.hashCode(rv4Var.T);
                    xt8 l4 = rv4Var.l();
                    nq7 p4 = lye.p(rv4Var, y);
                    rw1.k.getClass();
                    zx1 zx1Var3 = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var3);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(qw1.f, rv4Var, a4);
                    jce.F(qw1.e, rv4Var, l4);
                    jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode4));
                    jce.C(qw1.h, rv4Var);
                    jce.F(qw1.d, rv4Var, p4);
                    nq7 h = pna.h(pna.f(kq7Var, 1.0f), 5.0f);
                    tza tzaVar2 = j27.a;
                    nq7 k2 = tte.k(h, ((h27) rv4Var.j(tzaVar2)).c.a);
                    ba5 ba5Var = lre.g;
                    fu0.a(nmd.v(k2, b2, ba5Var), rv4Var, 0);
                    fu0.a(nmd.v(tte.k(pna.h(zbe.C(hl5.f(kq7Var, 3.0f, rv4Var, kq7Var, 1.0f), nae.e, nae.e, 10.0f, nae.e, 11), 5.0f), ((h27) rv4Var.j(tzaVar2)).c.b), b2, ba5Var), rv4Var, 0);
                    rv4Var.q(true);
                }
                rv4Var.q(false);
                rv4Var.q(true);
            }
            hl5.v(rv4Var, false, true, true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new uq0(z, nq7Var, i, 6);
        }
    }

    public static final void k(int i, int i2, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var) {
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        xt4Var.getClass();
        rv4Var.g0(1610131543);
        if (rv4Var.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i6 = i5 | i4;
        if ((i6 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i6 & 1, z)) {
            gv9 a2 = ev9.a(lz.a, kh5.F, rv4Var, 0);
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
            jv9 jv9Var = jv9.a;
            kq7 kq7Var = kq7.a;
            nq7 y = zbe.y(jv9Var.a(1.0f, kq7Var, true), 4.0f);
            int i7 = i6 & 896;
            if (i7 == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new in7(24, xt4Var);
                rv4Var.o0(P);
            }
            nq7 b2 = q1d.b(y, false, nae.e, (vt4) P, 3);
            if (i == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            g(0, rv4Var, b2, z3);
            nq7 y2 = zbe.y(jv9Var.a(1.0f, kq7Var, true), 4.0f);
            if (i7 == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P2 = rv4Var.P();
            if (z4 || P2 == lh9Var) {
                P2 = new in7(25, xt4Var);
                rv4Var.o0(P2);
            }
            nq7 b3 = q1d.b(y2, false, nae.e, (vt4) P2, 3);
            if (i == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            h(0, rv4Var, b3, z5);
            nq7 y3 = zbe.y(jv9Var.a(1.0f, kq7Var, true), 4.0f);
            if (i7 == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            Object P3 = rv4Var.P();
            if (z6 || P3 == lh9Var) {
                P3 = new in7(26, xt4Var);
                rv4Var.o0(P3);
            }
            nq7 b4 = q1d.b(y3, false, nae.e, (vt4) P3, 3);
            if (i == 2) {
                z7 = true;
            } else {
                z7 = false;
            }
            i(0, rv4Var, b4, z7);
            nq7 y4 = zbe.y(jv9Var.a(1.0f, kq7Var, true), 4.0f);
            if (i7 == 256) {
                z8 = true;
            } else {
                z8 = false;
            }
            Object P4 = rv4Var.P();
            if (z8 || P4 == lh9Var) {
                P4 = new in7(27, xt4Var);
                rv4Var.o0(P4);
            }
            nq7 b5 = q1d.b(y4, false, nae.e, (vt4) P4, 3);
            if (i == 3) {
                z9 = true;
            } else {
                z9 = false;
            }
            j(0, rv4Var, b5, z9);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new p61(i, nq7Var, xt4Var, i2, 7);
        }
    }

    public static final void l(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        b00.U(i2, i, i3 + i, bArr, bArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Type inference failed for: r6v8, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable m(defpackage.oh5 r5, defpackage.n42 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.sh5
            if (r0 == 0) goto L13
            r0 = r6
            sh5 r0 = (defpackage.sh5) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            sh5 r0 = new sh5
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.hre.r(r6)
            goto L4f
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r3
        L2c:
            defpackage.hre.r(r6)
            te5 r5 = r5.y0()
            java.lang.Class<byte[]> r6 = byte[].class
            gi1 r1 = defpackage.cm9.a(r6)
            nsc r6 = defpackage.cm9.d(r6)     // Catch: java.lang.Throwable -> L3e
            goto L3f
        L3e:
            r6 = r3
        L3f:
            isc r4 = new isc
            r4.<init>(r1, r6)
            r0.b = r2
            java.lang.Object r6 = r5.a(r4, r0)
            n82 r5 = defpackage.n82.a
            if (r6 != r5) goto L4f
            return r5
        L4f:
            if (r6 == 0) goto L54
            byte[] r6 = (byte[]) r6
            return r6
        L54:
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.ByteArray"
            defpackage.xk5.k(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.que.m(oh5, n42):java.io.Serializable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n(defpackage.oh5 r5, defpackage.n42 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.th5
            if (r0 == 0) goto L13
            r0 = r6
            th5 r0 = (defpackage.th5) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            th5 r0 = new th5
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.hre.r(r6)
            goto L4f
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r3
        L2c:
            defpackage.hre.r(r6)
            te5 r5 = r5.y0()
            java.lang.Class<s11> r6 = defpackage.s11.class
            gi1 r1 = defpackage.cm9.a(r6)
            nsc r6 = defpackage.cm9.d(r6)     // Catch: java.lang.Throwable -> L3e
            goto L3f
        L3e:
            r6 = r3
        L3f:
            isc r4 = new isc
            r4.<init>(r1, r6)
            r0.b = r2
            java.lang.Object r6 = r5.a(r4, r0)
            n82 r5 = defpackage.n82.a
            if (r6 != r5) goto L4f
            return r5
        L4f:
            if (r6 == 0) goto L54
            s11 r6 = (defpackage.s11) r6
            return r6
        L54:
            java.lang.String r5 = "null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel"
            defpackage.xk5.k(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.que.n(oh5, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(defpackage.oh5 r5, java.nio.charset.Charset r6, defpackage.n42 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.uh5
            if (r0 == 0) goto L13
            r0 = r7
            uh5 r0 = (defpackage.uh5) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            uh5 r0 = new uh5
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            java.nio.charset.CharsetDecoder r5 = r0.a
            defpackage.hre.r(r7)
            goto L6b
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r3
        L2e:
            defpackage.hre.r(r7)
            r5.getClass()
            e32 r7 = defpackage.oue.z(r5)
            if (r7 == 0) goto L3f
            java.nio.charset.Charset r7 = defpackage.h32.a(r7)
            goto L40
        L3f:
            r7 = r3
        L40:
            if (r7 != 0) goto L43
            goto L44
        L43:
            r6 = r7
        L44:
            java.nio.charset.CharsetDecoder r6 = r6.newDecoder()
            te5 r5 = r5.y0()
            java.lang.Class<psa> r7 = defpackage.psa.class
            gi1 r1 = defpackage.cm9.a(r7)
            nsc r7 = defpackage.cm9.d(r7)     // Catch: java.lang.Throwable -> L57
            goto L58
        L57:
            r7 = r3
        L58:
            isc r4 = new isc
            r4.<init>(r1, r7)
            r0.a = r6
            r0.c = r2
            java.lang.Object r7 = r5.a(r4, r0)
            n82 r5 = defpackage.n82.a
            if (r7 != r5) goto L6a
            return r5
        L6a:
            r5 = r6
        L6b:
            if (r7 == 0) goto L77
            psa r7 = (defpackage.psa) r7
            r5.getClass()
            java.lang.String r5 = defpackage.p17.b(r5, r7)
            return r5
        L77:
            java.lang.String r5 = "null cannot be cast to non-null type kotlinx.io.Source"
            defpackage.xk5.k(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.que.o(oh5, java.nio.charset.Charset, n42):java.lang.Object");
    }

    public static final void p(xt4 xt4Var, Object obj, d82 d82Var) {
        gt1 q = q(xt4Var, obj, null);
        if (q != null) {
            c16.p(d82Var, q);
        }
    }

    public static final gt1 q(xt4 xt4Var, Object obj, gt1 gt1Var) {
        try {
            xt4Var.invoke(obj);
            return gt1Var;
        } catch (Throwable th) {
            if (gt1Var != null && gt1Var.getCause() != th) {
                pye.e(gt1Var, th);
                return gt1Var;
            }
            return new gt1(10, rs8.i(obj, "Exception in undelivered element handler for "), th);
        }
    }

    public static final int r(iw9 iw9Var, String str) {
        iw9Var.getClass();
        int columnCount = iw9Var.getColumnCount();
        int i = 0;
        while (true) {
            if (i < columnCount) {
                if (str.equals(iw9Var.getColumnName(i))) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            return i;
        }
        String n = eub.n('`', "`", str);
        int columnCount2 = iw9Var.getColumnCount();
        int i2 = 0;
        while (true) {
            if (i2 < columnCount2) {
                if (n.equals(iw9Var.getColumnName(i2))) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = iw9Var.getColumnCount();
            String concat = ".".concat(str);
            String n2 = eub.n('`', ".", str);
            for (int i3 = 0; i3 < columnCount3; i3++) {
                String columnName = iw9Var.getColumnName(i3);
                if (columnName.length() >= str.length() + 2 && (r4b.I(columnName, concat, false) || (columnName.charAt(0) == '`' && r4b.I(columnName, n2, false)))) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static final xy0 s(sa1 sa1Var, va1 va1Var) {
        sa1Var.getClass();
        va1Var.getClass();
        int i = va1Var.a;
        if (i == Integer.MAX_VALUE) {
            return xpe.a(Integer.MAX_VALUE, 6, null);
        }
        return xpe.a(i, 4, py0.a);
    }

    public static final int t(iw9 iw9Var, String str) {
        iw9Var.getClass();
        int r = r(iw9Var, str);
        if (r >= 0) {
            return r;
        }
        int columnCount = iw9Var.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(iw9Var.getColumnName(i));
        }
        String i0 = sl1.i0(arrayList, null, null, null, null, 63);
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + i0 + ']');
    }

    public static double u(i45 i45Var, double[] dArr, double[] dArr2) {
        double d;
        int min = Math.min(dArr.length - 1, dArr2.length);
        double d2 = i45Var.b;
        int i = 0;
        while (true) {
            if (i < min) {
                if (d2 >= dArr[i] && d2 < dArr[i + 1]) {
                    d = dArr2[i] % 360.0d;
                    if (d < 0.0d) {
                        d += 360.0d;
                    }
                } else {
                    i++;
                }
            } else {
                d = d2;
                break;
            }
        }
        if (Math.min(dArr.length - 1, dArr2.length) <= 0) {
            d = 0.0d;
        }
        double d3 = (d2 + d) % 360.0d;
        if (d3 < 0.0d) {
            return d3 + 360.0d;
        }
        return d3;
    }

    public static s51 v(d82 d82Var, lu4 lu4Var) {
        d82Var.getClass();
        return jbe.S(new ua2(4, d82Var, p82.a, lu4Var));
    }

    public static final List w(List list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableList(new ArrayList(list));
            }
            return Collections.singletonList(sl1.c0(list));
        }
        return ks3.a;
    }

    public static final Map x(Map map) {
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableMap(new LinkedHashMap(map));
            }
            Map.Entry entry = (Map.Entry) sl1.b0(map.entrySet());
            return Collections.singletonMap(entry.getKey(), entry.getValue());
        }
        return ls3.a;
    }
}
