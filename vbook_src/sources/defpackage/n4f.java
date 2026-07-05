package defpackage;

import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n4f */
/* loaded from: classes3.dex */
public abstract class n4f {
    public static final tu1 a = new tu1(new lv1(21), false, -1619531248);
    public static final tu1 b = new tu1(new xu1(19), false, -2043363639);
    public static final tu1 c = new tu1(new kv1(21), false, -866039160);
    public static final tu1 d = new tu1(new kv1(22), false, -1012968025);
    public static final tu1 e = new tu1(new kv1(23), false, -1007807735);
    public static final tu1 f = new tu1(new lv1(22), false, 1352052534);
    public static final tu1 g = new tu1(new lv1(23), false, 719654614);
    public static final mh6[] h = new mh6[0];

    public static final void a(String str, String str2, nq7 nq7Var, lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        float f2;
        boolean z2;
        boolean z3;
        float f3;
        boolean z4;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1782487975);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var2.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var2.h(lu4Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i7 = i6 | i4;
        if ((i7 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i7 & 1, z)) {
            gv9 a2 = ev9.a(lz.a, kh5.F, rv4Var2, 0);
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
            v72 v72Var = ((h27) rv4Var2.j(tzaVar)).c.b;
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = 1.0f;
            }
            we6 we6Var = new we6(f2, true);
            int i8 = i7 & 7168;
            if (i8 == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i7 & Token.ASSIGN_MOD) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = z3 | z2;
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (z5 || P == lh9Var) {
                P = new od7(lu4Var, str2, 4);
                rv4Var2.o0(P);
            }
            int i9 = i7 & 14;
            uwe.h(str, (xt4) P, we6Var, false, false, null, null, null, null, null, false, null, null, null, true, 0, 0, v72Var, null, rv4Var, i9, 12582912, 6160376);
            xbe.i(rv4Var, pna.s(kq7.a, 12.0f));
            boolean z6 = false;
            t86 t86Var = new t86(3, 0, Token.EXPORT);
            v72 v72Var2 = ((h27) rv4Var.j(tzaVar)).c.b;
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f3 = Float.MAX_VALUE;
            } else {
                f3 = 1.0f;
            }
            we6 we6Var2 = new we6(f3, true);
            if (i8 == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i9 == 4) {
                z6 = true;
            }
            boolean z7 = z4 | z6;
            Object P2 = rv4Var.P();
            if (z7 || P2 == lh9Var) {
                P2 = new od7(lu4Var, str, 5);
                rv4Var.o0(P2);
            }
            uwe.h(str2, (xt4) P2, we6Var2, false, false, null, null, null, null, null, false, null, t86Var, null, true, 0, 0, v72Var2, null, rv4Var, (i7 >> 3) & 14, 12779520, 6127608);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new pd7(str, str2, nq7Var, lu4Var, i, 1);
        }
    }

    public static final void b(ic4 ic4Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(390836397);
        if (rv4Var2.f(ic4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i3 & 1, z)) {
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
            String str = ic4Var.a;
            tza tzaVar = j27.a;
            cvb.c(str, null, ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.j, rv4Var, 0, 0, 131066);
            xbe.i(rv4Var, pna.h(kq7.a, 6.0f));
            int i4 = ic4Var.b;
            cvb.c(rs8.k("Offset ", i4, ic4Var.c + i4, "->"), null, ((h27) rv4Var.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.k, rv4Var, 0, 0, 131066);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new f58(ic4Var, nq7Var, i, 28);
        }
    }

    public static final void c(ar5 ar5Var, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        ar5Var.getClass();
        vt4Var.getClass();
        rv4Var.g0(457740545);
        if (rv4Var.f(ar5Var)) {
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
        boolean z2 = true;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            nq7 k = tte.k(pna.h(nq7Var, 44.0f), uu9.a);
            if ((i7 & 896) != 256) {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new ge5(18, vt4Var);
                rv4Var.o0(P);
            }
            nk5.a(ar5Var, null, zbe.y(lbe.f(15, (vt4) P, k, null, false), 8.0f), ((h27) rv4Var.j(j27.a)).a.q, rv4Var, (i7 & 14) | 48, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ax(ar5Var, nq7Var, vt4Var, i, 24);
        }
    }

    public static final void d(nq7 nq7Var, dt8 dt8Var, float f2, boolean z, xt4 xt4Var, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        float f3;
        boolean z3;
        rv4Var.g0(1272955345);
        if (rv4Var.f(nq7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.f(dt8Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3 | 28032;
        if (rv4Var.h(xt4Var)) {
            i4 = 131072;
        } else {
            i4 = Parser.ARGC_LIMIT;
        }
        int i7 = i6 | i4;
        if ((599187 & i7) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i7 & 1, z2)) {
            hre.a(nq7Var, dt8Var, 8.0f, false, null, false, xt4Var, tu1Var, rv4Var, ((i7 << 6) & 29360128) | (i7 & 1022) | 1769472 | 100663296);
            f3 = 8.0f;
            z3 = true;
        } else {
            rv4Var.X();
            f3 = f2;
            z3 = z;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new fo7(nq7Var, dt8Var, f3, z3, xt4Var, tu1Var, i);
        }
    }

    public static final void e(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-944737754);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var2.h(vt4Var)) {
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
            nq7 A = zbe.A(mwe.u(nq7Var, false, 15), 24.0f, nae.e, 2);
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
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
            String str2 = null;
            if (str != null && !k4b.j0(str)) {
                str2 = str;
            }
            if (str2 == null) {
                rv4Var2.e0(-1325483075);
                str2 = yqe.A((y3b) s2b.c.getValue(), rv4Var2);
            } else {
                rv4Var2.e0(-1325484129);
            }
            rv4Var2.q(false);
            tza tzaVar = j27.a;
            cvb.c(str2, null, ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.h, rv4Var, 0, 0, 130042);
            rv4Var2 = rv4Var;
            xbe.i(rv4Var2, pna.h(kq7.a, 16.0f));
            z1d.f(rp5.c((wk3) ok3.g0.getValue(), rv4Var2, 0), yqe.A((y3b) b3b.B.getValue(), rv4Var2), false, null, null, null, null, null, vt4Var, rv4Var2, (i5 << 21) & 234881024, 252);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new k31(str, vt4Var, nq7Var, i, 13);
        }
    }

    public static final void f(int i, rv4 rv4Var, nq7 nq7Var, cz7 cz7Var, String str) {
        int i2;
        boolean z;
        pb2 pb2Var;
        int i3;
        int i4;
        int i5;
        str.getClass();
        cz7Var.getClass();
        rv4Var.g0(1151300524);
        if ((i & 6) == 0) {
            if (rv4Var.f(str)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(cz7Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        }
        boolean z2 = true;
        if ((i2 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            if ((i2 & 14) != 4) {
                z2 = false;
            }
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z2 || P == obj) {
                P = new v85(str, 15);
                rv4Var.o0(P);
            }
            vt4 vt4Var = (vt4) P;
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                pb2 pb2Var2 = pb2Var;
                q0a a3 = o96.a(rv4Var);
                gi1 a4 = cm9.a(iaa.class);
                iaa iaaVar = (iaa) ((fdd) voe.z(a4, a2.i(), eub.o(a4.f(), "-", str), pb2Var2, a3, vt4Var));
                boolean f2 = rv4Var.f(iaaVar);
                Object P2 = rv4Var.P();
                if (f2 || P2 == obj) {
                    P2 = new ux9(iaaVar, 8);
                    rv4Var.o0(P2);
                }
                tte.d(iaaVar, null, (xt4) P2, rv4Var, 0);
                vte.e((s6d) jsc.z(iaaVar.R, rv4Var).getValue(), jce.E(960594576, new i31(nq7Var, iaaVar, cz7Var, jsc.z(iaaVar.V, rv4Var)), rv4Var), rv4Var, 48);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new j31(str, cz7Var, nq7Var, i, 9);
        }
    }

    public static final void g(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        boolean z;
        vt4 vt4Var2;
        String str2;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1021514662);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var2.h(vt4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i5 = i4 | i3;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            b37 d2 = fu0.d(kh5.a, false);
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
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, d2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            ze4 ze4Var = pna.c;
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, ze4Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a2);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            rv4Var2.e0(22089876);
            if (k4b.j0(str)) {
                str2 = yqe.A((y3b) o2b.P0.getValue(), rv4Var2);
            } else {
                str2 = str;
            }
            rv4Var2.q(false);
            cvb.c(str2, null, 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, null, rv4Var, 0, 0, 261118);
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var, pna.h(kq7Var, 24.0f));
            vt4Var2 = vt4Var;
            z1d.f(rp5.c((wk3) jk3.w.getValue(), rv4Var, 0), yqe.A((y3b) f2b.q0.getValue(), rv4Var), false, null, null, null, null, null, vt4Var2, rv4Var, (i5 << 18) & 234881024, 252);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            ar5 c2 = rp5.c((wk3) jk3.d.getValue(), rv4Var2, 0);
            nq7 o = nc2.o(kq7Var);
            if ((i5 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var2.P();
            if (z2 || P == ax1.a) {
                P = new a3c(21, vt4Var2);
                rv4Var2.o0(P);
            }
            kwe.d(c2, o, 0L, (vt4) P, rv4Var2, 0, 4);
            rv4Var2.q(true);
        } else {
            vt4Var2 = vt4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new k31(str, nq7Var, vt4Var2, i, 15);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0430, code lost:
        if (r15 == r14) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0b9b, code lost:
        if (r67 > 0) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x0bd3, code lost:
        if (defpackage.k4b.j0((java.lang.String) r9.getValue()) == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x0bff, code lost:
        if (defpackage.k4b.j0((java.lang.String) r9.getValue()) == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x0c13, code lost:
        if (defpackage.k4b.j0((java.lang.String) r8.getValue()) == false) goto L253;
     */
    /* JADX WARN: Removed duplicated region for block: B:428:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x0f42  */
    /* JADX WARN: Removed duplicated region for block: B:730:0x0f4c  */
    /* JADX WARN: Removed duplicated region for block: B:735:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(java.lang.String r63, java.lang.String r64, java.lang.String r65, defpackage.nq7 r66, int r67, boolean r68, boolean r69, java.util.List r70, defpackage.xt4 r71, defpackage.ou4 r72, defpackage.vt4 r73, defpackage.vt4 r74, defpackage.rv4 r75, int r76) {
        /*
            Method dump skipped, instructions count: 3990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n4f.h(java.lang.String, java.lang.String, java.lang.String, nq7, int, boolean, boolean, java.util.List, xt4, ou4, vt4, vt4, rv4, int):void");
    }

    public static final void i(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-794557938);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var2.h(vt4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i5 = i4 | i3;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            b37 d2 = fu0.d(kh5.a, false);
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
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, d2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            ze4 ze4Var = pna.c;
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, ze4Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a2);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            tza tzaVar = j27.a;
            oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.g;
            long j = ((h27) rv4Var2.j(tzaVar)).a.q;
            kq7 kq7Var = kq7.a;
            cvb.c(str, zbe.y(kq7Var, 24.0f), j, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, oybVar, rv4Var, (i5 & 14) | 48, 0, 130040);
            eg0.f(pna.n(kq7Var, 48.0f), ((h27) rv4Var.j(tzaVar)).a.q, null, rv4Var, 6, 4);
            rv4Var.q(true);
            ar5 c2 = rp5.c((wk3) jk3.d.getValue(), rv4Var, 0);
            nq7 o = nc2.o(kq7Var);
            if ((i5 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new a3c(24, vt4Var);
                rv4Var.o0(P);
            }
            kwe.d(c2, o, 0L, (vt4) P, rv4Var, 0, 4);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new k31(str, nq7Var, vt4Var, i, 16);
        }
    }

    public static final void j(int i, rv4 rv4Var, nq7 nq7Var, cz7 cz7Var, String str) {
        int i2;
        cz7 cz7Var2;
        boolean z;
        rv4 rv4Var2;
        boolean z2;
        pb2 pb2Var;
        boolean z3;
        long v;
        long v2;
        int i3;
        int i4;
        int i5;
        str.getClass();
        cz7Var.getClass();
        rv4Var.g0(1613263548);
        if ((i & 6) == 0) {
            if (rv4Var.f(str)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            cz7Var2 = cz7Var;
            if (rv4Var.f(cz7Var2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        } else {
            cz7Var2 = cz7Var;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        }
        if ((i2 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            if ((i2 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new v85(str, 21);
                rv4Var.o0(P);
            }
            vt4 vt4Var = (vt4) P;
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                pb2 pb2Var2 = pb2Var;
                q0a a3 = o96.a(rv4Var);
                gi1 a4 = cm9.a(csc.class);
                csc cscVar = (csc) ((fdd) voe.z(a4, a2.i(), eub.o(a4.f(), "-", str), pb2Var2, a3, vt4Var));
                boolean f2 = rv4Var.f(cscVar);
                Object P2 = rv4Var.P();
                if (f2 || P2 == lh9Var) {
                    P2 = new zub(cscVar, 7);
                    rv4Var.o0(P2);
                }
                tte.d(cscVar, null, (xt4) P2, rv4Var, 0);
                aw7 z4 = jsc.z(cscVar.t0, rv4Var);
                aw7 z5 = jsc.z(cscVar.j1, rv4Var);
                pm1 pm1Var = ((h27) rv4Var.j(j27.a)).a;
                boolean f3 = rv4Var.f((nnb) z4.getValue()) | rv4Var.f(pm1Var);
                Object P3 = rv4Var.P();
                if (f3 || P3 == lh9Var) {
                    if (((nnb) z4.getValue()).a.length() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z6 = ((nnb) z4.getValue()).g;
                    if (z3) {
                        v = pm1Var.q;
                    } else {
                        v = kve.v(((nnb) z4.getValue()).d);
                    }
                    long j = v;
                    if (z3) {
                        v2 = pm1Var.p;
                    } else {
                        v2 = kve.v(((nnb) z4.getValue()).e);
                    }
                    P3 = yae.z(new e6c(z3, z6, j, v2, ((nnb) z4.getValue()).f, nae.n(((nnb) z4.getValue()).h)));
                    rv4Var.o0(P3);
                }
                aw7 aw7Var = (aw7) P3;
                aw7 z7 = jsc.z(cscVar.z0, rv4Var);
                WeakHashMap weakHashMap = yjd.w;
                ix5 o = w92.o(h88.n(rv4Var).b, rv4Var);
                boolean f4 = rv4Var.f((nnb) z4.getValue());
                Object P4 = rv4Var.P();
                if (f4 || P4 == lh9Var) {
                    th8 th8Var = new th8(((nnb) z4.getValue()).F, ((nnb) z4.getValue()).H, ((nnb) z4.getValue()).G, ((nnb) z4.getValue()).I);
                    rv4Var.o0(th8Var);
                    P4 = th8Var;
                }
                aw7 z8 = jsc.z(cscVar.A0, rv4Var);
                dxe.l(((nnb) z4.getValue()).o, ((nnb) z4.getValue()).r, ((nnb) z4.getValue()).p, ((nnb) z4.getValue()).q, rv4Var, 0);
                rv4Var2 = rv4Var;
                pc2.f((e6c) aw7Var.getValue(), jce.E(-1249657236, new dsc(cscVar, nq7Var, o, cz7Var2, (rh8) P4, aw7Var, z5, z7, z4, z8), rv4Var2), rv4Var2, 48);
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
            u.d = new j31(str, cz7Var, nq7Var, i, 10);
        }
    }

    public static final d56 k() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        i56 a2 = l46.a("object");
        a2.getClass();
        k46 k46Var = (k46) linkedHashMap.put("type", a2);
        e56 e56Var = new e56();
        s(e56Var);
        k46 k46Var2 = (k46) linkedHashMap.put("properties", e56Var.a());
        dw3 dw3Var = new dw3(22);
        u36 u36Var = new u36();
        dw3Var.invoke(u36Var);
        k46 k46Var3 = (k46) linkedHashMap.put("required", new t36(u36Var.a));
        return new d56(linkedHashMap);
    }

    public static final sed l(dub dubVar) {
        String obj = dubVar.d().d.toString();
        boolean Q = r4b.Q(obj, "\u200b", false);
        if (Q) {
            obj = obj.substring(1);
        }
        return new sed(obj, Q ? 1 : 0);
    }

    public static int m(int i, int i2) {
        boolean z;
        long j = i + i2;
        int i3 = (int) j;
        if (j == i3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return i3;
        }
        throw new ArithmeticException(hl5.i(i, i2, "overflow: checkedAdd(", ", ", ")"));
    }

    public static int n(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i2 != 0) {
            int i3 = i / i2;
            int i4 = i - (i2 * i3);
            if (i4 != 0) {
                boolean z = true;
                int i5 = ((i ^ i2) >> 31) | 1;
                switch (my5.a[roundingMode.ordinal()]) {
                    case 1:
                        if (i4 != 0) {
                            z = false;
                        }
                        dye.j(z);
                        return i3;
                    case 2:
                        return i3;
                    case 3:
                        if (i5 >= 0) {
                            return i3;
                        }
                        break;
                    case 4:
                        break;
                    case 5:
                        if (i5 <= 0) {
                            return i3;
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int abs = Math.abs(i4);
                        int abs2 = abs - (Math.abs(i2) - abs);
                        if (abs2 == 0) {
                            RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                            RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                            return i3;
                        } else if (abs2 <= 0) {
                            return i3;
                        }
                        break;
                    default:
                        cp8.i();
                        return 0;
                }
                return i3 + i5;
            }
            return i3;
        }
        throw new ArithmeticException("/ by zero");
    }

    public static b82 o(o42 o42Var, c82 c82Var) {
        c82Var.getClass();
        if (c82Var instanceof e82) {
            e82 e82Var = (e82) c82Var;
            c82 key = o42Var.getKey();
            key.getClass();
            if (key != e82Var && e82Var.b != key) {
                return null;
            }
            b82 b82Var = (b82) e82Var.a.invoke((c1) o42Var);
            if (b82Var != null) {
                return b82Var;
            }
        } else if (abf.d == c82Var) {
            return o42Var;
        }
        return null;
    }

    public static final long p(fvb fvbVar, int i, boolean z, boolean z2) {
        int max;
        it7 it7Var = fvbVar.b;
        long j = fvbVar.c;
        int d2 = it7Var.d(i);
        if (d2 >= it7Var.f) {
            return 9205357640488583168L;
        }
        boolean z3 = false;
        if ((z && !z2) || (!z && z2)) {
            max = i;
        } else {
            max = Math.max(i - 1, 0);
        }
        if (fvbVar.a(max) == it7Var.h(i)) {
            z3 = true;
        }
        float m = dce.m(fvbVar.f(i, z3), nae.e, (int) (j >> 32));
        float m2 = dce.m(it7Var.b(d2), nae.e, (int) (j & 4294967295L));
        return (Float.floatToRawIntBits(m) << 32) | (Float.floatToRawIntBits(m2) & 4294967295L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int q(int i) {
        boolean z;
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i > 0) {
            boolean z2 = true;
            switch (my5.a[roundingMode.ordinal()]) {
                case 1:
                    if (i > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (((i - 1) & i) != 0) {
                        z2 = false;
                    }
                    dye.j(z & z2);
                    break;
                case 2:
                case 3:
                    break;
                case 4:
                case 5:
                    return 32 - Integer.numberOfLeadingZeros(i - 1);
                case 6:
                case 7:
                case 8:
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                    return (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - i))) >>> 31);
                default:
                    cp8.i();
                    return 0;
            }
            return 31 - Integer.numberOfLeadingZeros(i);
        }
        vs.m(hl5.l("x (", ") must be > 0", i));
        return 0;
    }

    public static d82 r(o42 o42Var, c82 c82Var) {
        c82Var.getClass();
        if (c82Var instanceof e82) {
            e82 e82Var = (e82) c82Var;
            c82 key = o42Var.getKey();
            key.getClass();
            if (key != e82Var && e82Var.b != key) {
                return o42Var;
            }
            if (((b82) e82Var.a.invoke((c1) o42Var)) == null) {
                return o42Var;
            }
        } else if (abf.d != c82Var) {
            return o42Var;
        }
        return gs3.a;
    }

    public static final void s(e56 e56Var) {
        e56Var.getClass();
        e56 e56Var2 = new e56();
        z87.y(e56Var2, "type", "string");
        z87.y(e56Var2, "description", "plugin.json contents (metadata/script/config).");
        e56Var.b(e56Var2.a(), "plugin");
        e56 e56Var3 = new e56();
        z87.y(e56Var3, "type", "string");
        z87.y(e56Var3, "description", "Base64 PNG icon (optional).");
        e56Var.b(e56Var3.a(), "icon");
        e56 e56Var4 = new e56();
        z87.y(e56Var4, "type", "string");
        z87.y(e56Var4, "description", "JSON map of source file name -> file contents.");
        e56Var.b(e56Var4.a(), "src");
    }

    public static /* synthetic */ String t(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            default:
                return "END_DOCUMENT";
        }
    }
}
