package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aze  reason: default package */
/* loaded from: classes3.dex */
public abstract class aze {
    public static final tu1 a = new tu1(new kv1(15), false, 459326741);
    public static final tu1 b = new tu1(new kv1(16), false, 1038120344);
    public static final tu1 c = new tu1(new lv1(15), false, 1283209244);
    public static final tu1 d = new tu1(new lv1(16), false, 631871696);
    public static final tu1 e = new tu1(new lv1(17), false, 747836242);

    public static sl0 a(nl5 nl5Var, int i) {
        int width = ((jj) nl5Var).a.getWidth();
        sl0 sl0Var = new sl0(nl5Var, (((jj) nl5Var).a.getHeight() & 4294967295L) | (width << 32));
        sl0Var.D = i;
        return sl0Var;
    }

    public static final void b(uv0 uv0Var, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-856387036);
        if (rv4Var2.f(uv0Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var2.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var2.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var2.h(vt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i9 & 1, z)) {
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
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
            we6 we6Var = new we6(1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, we6Var);
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
            String str = uv0Var.a;
            tza tzaVar = j27.a;
            oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.k;
            long j = ((h27) rv4Var2.j(tzaVar)).a.q;
            kq7 kq7Var = kq7.a;
            cvb.c(str, pna.f(kq7Var, 1.0f), j, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, oybVar, rv4Var, 48, 24960, 110584);
            xbe.i(rv4Var, pna.h(kq7Var, 8.0f));
            cvb.c(uv0Var.b, pna.f(kq7Var, 1.0f), ((h27) rv4Var.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((h27) rv4Var.j(tzaVar)).b.l, rv4Var, 48, 24960, 110584);
            rv4Var2 = rv4Var;
            s21.x(rv4Var2, true, kq7Var, 8.0f, rv4Var2);
            ar5 c2 = rp5.c((wk3) jk3.g.getValue(), rv4Var2, 0);
            mfb mfbVar = x2b.s;
            String A = yqe.A((y3b) mfbVar.getValue(), rv4Var2);
            nq7 n = pna.n(kq7Var, 24.0f);
            if ((i9 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new ge5(11, vt4Var);
                rv4Var2.o0(P);
            }
            nk5.a(c2, A, lbe.f(15, (vt4) P, n, null, false), 0L, rv4Var2, 0, 8);
            xbe.i(rv4Var2, pna.s(kq7Var, 12.0f));
            ar5 c3 = rp5.c((wk3) jk3.H.getValue(), rv4Var2, 0);
            String A2 = yqe.A((y3b) mfbVar.getValue(), rv4Var2);
            nq7 n2 = pna.n(kq7Var, 24.0f);
            if ((i9 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P2 = rv4Var2.P();
            if (z3 || P2 == lh9Var) {
                P2 = new ge5(12, vt4Var2);
                rv4Var2.o0(P2);
            }
            nk5.a(c3, A2, zbe.y(lbe.f(15, (vt4) P2, n2, null, false), 2.0f), 0L, rv4Var2, 0, 8);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new i31(uv0Var, nq7Var, vt4Var, vt4Var2, i, 22);
        }
    }

    public static final mh c(String str) {
        return new mh(fca.B(str));
    }

    public static final void d(boolean z, lhd lhdVar, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        xt4Var.getClass();
        xt4Var2.getClass();
        xt4Var3.getClass();
        rv4Var.g0(1455102847);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.h(lhdVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(xt4Var3)) {
            i5 = 131072;
        } else {
            i5 = Parser.ARGC_LIMIT;
        }
        int i9 = i8 | i5;
        if ((66707 & i9) != 66706) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i9 & 1, z2)) {
            rte.c(z, nq7Var, zt3.g(null, 3), zt3.i(null, 3), null, jce.E(-125670825, new ld1(20, lhdVar, xt4Var3, xt4Var), rv4Var), rv4Var, (i9 & 14) | 200112, 16);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ds1(z, (Object) lhdVar, nq7Var, (hu4) xt4Var, (hu4) xt4Var2, (hu4) xt4Var3, i, 2);
        }
    }

    public static final y59 e(String str, w59 w59Var) {
        if (!k4b.j0(str)) {
            z59.a(str);
            return new y59(str, w59Var);
        }
        vs.m("Blank serial names are prohibited");
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void f(String str, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        nq7 nq7Var2;
        rv4 rv4Var2;
        wk3 wk3Var;
        rv4Var.g0(-607136931);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (rv4Var.f(nq7Var)) {
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
        if (rv4Var.U(i5 & 1, z)) {
            switch (str.hashCode()) {
                case -1240244679:
                    if (str.equals("google")) {
                        wk3Var = (wk3) ok3.f.getValue();
                        break;
                    }
                    wk3Var = (wk3) rk3.v.getValue();
                    break;
                case 3023936:
                    if (str.equals("bing")) {
                        wk3Var = (wk3) jk3.k.getValue();
                        break;
                    }
                    wk3Var = (wk3) rk3.v.getValue();
                    break;
                case 93498907:
                    if (str.equals("baidu")) {
                        wk3Var = (wk3) jk3.j.getValue();
                        break;
                    }
                    wk3Var = (wk3) rk3.v.getValue();
                    break;
                case 696911194:
                    if (str.equals("duckduckgo")) {
                        wk3Var = (wk3) jk3.O.getValue();
                        break;
                    }
                    wk3Var = (wk3) rk3.v.getValue();
                    break;
                default:
                    wk3Var = (wk3) rk3.v.getValue();
                    break;
            }
            nq7Var2 = nq7Var;
            rv4Var2 = rv4Var;
            dxe.i(rp5.a(wk3Var, rv4Var, 0), null, nq7Var2, rv4Var2, ((i5 << 3) & 896) | 24624, 232);
        } else {
            nq7Var2 = nq7Var;
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new o7(str, nq7Var2, i, 7);
        }
    }

    public static final void g(int i, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-509916155);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var2.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var2.h(vt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i9 & 1, z)) {
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
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
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            ar5 c2 = rp5.c((wk3) ok3.i.getValue(), rv4Var2, 0);
            String A = yqe.A((y3b) s2b.v0.getValue(), rv4Var2);
            kq7 kq7Var = kq7.a;
            nq7 k = tte.k(pna.n(kq7Var, 28.0f), uu9.a);
            tza tzaVar = j27.a;
            nk5.a(c2, A, zbe.y(nmd.v(k, rm1.g(((h27) rv4Var2.j(tzaVar)).a, 6.0f), lre.g), 4.0f), 0L, rv4Var2, 0, 8);
            cvb.c(str, rs8.d(kq7Var, 12.0f, rv4Var2, 1.0f, true), 0L, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.k, rv4Var, i9 & 14, 0, 130044);
            rv4Var2 = rv4Var;
            xbe.i(rv4Var2, pna.s(kq7Var, 12.0f));
            ar5 c3 = rp5.c((wk3) jk3.g.getValue(), rv4Var2, 0);
            mfb mfbVar = x2b.s;
            String A2 = yqe.A((y3b) mfbVar.getValue(), rv4Var2);
            nq7 n = pna.n(kq7Var, 24.0f);
            if ((i9 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new ge5(13, vt4Var);
                rv4Var2.o0(P);
            }
            nk5.a(c3, A2, lbe.f(15, (vt4) P, n, null, false), 0L, rv4Var2, 0, 8);
            xbe.i(rv4Var2, pna.s(kq7Var, 12.0f));
            ar5 c4 = rp5.c((wk3) jk3.H.getValue(), rv4Var2, 0);
            String A3 = yqe.A((y3b) mfbVar.getValue(), rv4Var2);
            nq7 n2 = pna.n(kq7Var, 24.0f);
            if ((i9 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P2 = rv4Var2.P();
            if (z3 || P2 == lh9Var) {
                P2 = new ge5(14, vt4Var2);
                rv4Var2.o0(P2);
            }
            nk5.a(c4, A3, zbe.y(lbe.f(15, (vt4) P2, n2, null, false), 2.0f), 0L, rv4Var2, 0, 8);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new qp1(str, nq7Var, vt4Var, vt4Var2, i, 6);
        }
    }

    public static final void h(String str, List list, List list2, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, xt4 xt4Var5, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        rv4Var.g0(-1629771070);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (rv4Var.f(list)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (rv4Var.f(list2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i10 = i9 | i4;
        if (rv4Var.f(nq7Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        if (rv4Var.h(xt4Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i12 = i11 | i6;
        if (rv4Var.h(xt4Var2)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i13 = i12 | i7;
        boolean z6 = false;
        if ((4793491 & i13) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i13 & 1, z)) {
            if ((i13 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i13 & 896) != 256) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolean z7 = z2 | z3;
            if ((458752 & i13) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z8 = z7 | z4;
            if ((i13 & Token.ASSIGN_MOD) != 32) {
                z5 = false;
            } else {
                z5 = true;
            }
            boolean z9 = z8 | z5;
            if ((57344 & i13) == 16384) {
                z6 = true;
            }
            boolean z10 = z9 | z6;
            Object P = rv4Var.P();
            if (z10 || P == ax1.a) {
                h43 h43Var = new h43(str, list2, list, xt4Var2, xt4Var3, xt4Var4, xt4Var);
                rv4Var.o0(h43Var);
                P = h43Var;
            }
            jce.d(nq7Var, null, null, false, null, null, null, false, null, (xt4) P, rv4Var, (i13 >> 9) & 14, 510);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sw5(str, list, list2, nq7Var, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, i, 0);
        }
    }

    public static final snd i(String str, o9a o9aVar) {
        o9aVar.getClass();
        if (!k4b.j0(str)) {
            if (!str.equals(o9aVar.a())) {
                if (o9aVar.e() instanceof w59) {
                    z59.a(str);
                }
                return new snd(str, o9aVar);
            }
            StringBuilder o = a82.o("The name of the wrapped descriptor (", str, ") cannot be the same as the name of the original descriptor (");
            o.append(o9aVar.a());
            o.append(')');
            throw new IllegalArgumentException(o.toString().toString());
        }
        vs.m("Blank serial names are prohibited");
        return null;
    }

    public static final void j(boolean z, int i, int i2, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i3) {
        int i4;
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        vt4Var.getClass();
        rv4Var.g0(-959843914);
        if ((i3 & 6) == 0) {
            if (rv4Var.g(z)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i4 = i9 | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            if (rv4Var.d(i)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i4 |= i8;
        }
        if ((i3 & 384) == 0) {
            if (rv4Var.d(i2)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i4 |= i7;
        }
        if ((i3 & 3072) == 0) {
            if (rv4Var.f(nq7Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i4 |= i6;
        }
        if ((i3 & 24576) == 0) {
            if (rv4Var.h(vt4Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i4 |= i5;
        }
        if ((i4 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i4 & 1, z2)) {
            if (z && i2 > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            eu3 g = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new y4(7);
                rv4Var.o0(P);
            }
            eu3 a2 = g.a(zt3.s((xt4) P));
            lz3 i10 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new y4(7);
                rv4Var.o0(P2);
            }
            rte.c(z3, nq7Var, a2, i10.a(zt3.w((xt4) P2)), null, jce.E(-85105522, new uq5(vt4Var, i, i2, 1), rv4Var), rv4Var, ((i4 >> 6) & Token.ASSIGN_MOD) | 200064, 16);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new nq5(z, i, i2, nq7Var, vt4Var, i3, 1);
        }
    }

    public static final void k(bkd bkdVar, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4Var.g0(-306040127);
        if (rv4Var.f(bkdVar)) {
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
            ze4 ze4Var = pna.c;
            hz hzVar = new hz(14.0f, true, new vs(2));
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = new txb(15);
                rv4Var.o0(P);
            }
            jce.d(ze4Var, null, bkdVar, false, hzVar, null, null, false, null, (xt4) P, rv4Var, ((i3 << 6) & 896) | 805330944, 490);
            nq7Var = kq7.a;
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new f58(bkdVar, nq7Var, i, 27);
        }
    }

    public static final q9a l(String str, o9a[] o9aVarArr, xt4 xt4Var) {
        if (!k4b.j0(str)) {
            hi1 hi1Var = new hi1(str);
            xt4Var.invoke(hi1Var);
            return new q9a(str, a5b.f, hi1Var.c.size(), b00.D0(o9aVarArr), hi1Var);
        }
        vs.m("Blank serial names are prohibited");
        return null;
    }

    public static q9a m(String str, o9a[] o9aVarArr) {
        if (!k4b.j0(str)) {
            hi1 hi1Var = new hi1(str);
            return new q9a(str, a5b.f, hi1Var.c.size(), b00.D0(o9aVarArr), hi1Var);
        }
        vs.m("Blank serial names are prohibited");
        return null;
    }

    public static final q9a n(String str, bze bzeVar, o9a[] o9aVarArr, xt4 xt4Var) {
        if (!k4b.j0(str)) {
            if (!bzeVar.equals(a5b.f)) {
                hi1 hi1Var = new hi1(str);
                xt4Var.invoke(hi1Var);
                return new q9a(str, bzeVar, hi1Var.c.size(), b00.D0(o9aVarArr), hi1Var);
            }
            vs.m("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        vs.m("Blank serial names are prohibited");
        return null;
    }

    public static q9a o(String str, bze bzeVar, o9a[] o9aVarArr) {
        if (!k4b.j0(str)) {
            if (!bzeVar.equals(a5b.f)) {
                hi1 hi1Var = new hi1(str);
                return new q9a(str, bzeVar, hi1Var.c.size(), b00.D0(o9aVarArr), hi1Var);
            }
            vs.m("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        vs.m("Blank serial names are prohibited");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0083, code lost:
        if ((r16[r5] & 192) == 128) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e0, code lost:
        if ((r16[r5] & 192) == 128) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String p(byte[] r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aze.p(byte[], int, int):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0187, code lost:
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0134, code lost:
        r6 = r6 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x010c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x013a -> B:93:0x013b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.yv q(defpackage.ljc r16) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aze.q(ljc):yv");
    }

    public static yv r(ljc ljcVar) {
        int c2;
        yv yvVar = new yv(ljcVar);
        int i = ljcVar.a;
        int i2 = 0;
        int j = cne.j(ljcVar, Math.max(0, i - 2048), i);
        if (j < 0) {
            j = cne.j(ljcVar, 0, i);
        }
        int i3 = -1;
        if (j >= 0) {
            int i4 = j + 9;
            while (i4 < i && ((c2 = ljcVar.c(i4) & 255) == 9 || c2 == 10 || c2 == 13 || c2 == 32)) {
                i4++;
            }
            StringBuilder sb = new StringBuilder();
            while (i4 < i) {
                int c3 = ljcVar.c(i4) & 255;
                if (48 > c3 || c3 >= 58) {
                    break;
                }
                sb.append((char) c3);
                i4++;
            }
            Integer R = r4b.R(10, sb.toString());
            if (R != null) {
                i3 = R.intValue();
            }
        }
        if (i3 >= 0 && i3 < i) {
            HashSet hashSet = new HashSet();
            while (i3 >= 0 && i3 < ((ljc) yvVar.a).a) {
                int i5 = i2 + 1;
                if (i2 >= 100 || hashSet.contains(Integer.valueOf(i3))) {
                    break;
                }
                hashSet.add(Integer.valueOf(i3));
                eb5 z = yvVar.z(i3);
                if (z == null) {
                    break;
                }
                Integer num = (Integer) z.c;
                if (num != null && !hashSet.contains(num)) {
                    try {
                        yvVar.z(num.intValue());
                    } catch (Throwable unused) {
                    }
                    hashSet.add(num);
                }
                Integer num2 = (Integer) z.b;
                if (num2 == null) {
                    break;
                }
                i3 = num2.intValue();
                i2 = i5;
            }
            if (!((LinkedHashMap) yvVar.d).containsKey("Root") && ((HashMap) yvVar.b).isEmpty()) {
                vs.m("Failed requirement.");
                return null;
            }
            return yvVar;
        }
        vs.m("Failed requirement.");
        return null;
    }

    public static final String[] s(f32 f32Var) {
        f32Var.getClass();
        return (String[]) ((mh) f32Var).b.toArray(new String[0]);
    }

    public static final nq7 t(nq7 nq7Var, ec6 ec6Var) {
        nq7Var.getClass();
        ec6Var.getClass();
        return nq7Var.a0(new fc6(ec6Var));
    }

    public static final void u(cz7 cz7Var, String str) {
        cz7Var.getClass();
        str.getClass();
        cz7Var.a.c(new u24(str));
    }
}
