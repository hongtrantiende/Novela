package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.Spanned;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fce  reason: default package */
/* loaded from: classes.dex */
public abstract class fce {
    public static final tu1 a = new tu1(new tv1(11), false, -2089265179);
    public static final tu1 b = new tu1(new tv1(12), false, -820667161);
    public static final tu1 c = new tu1(new tv1(13), false, -23345330);
    public static final tu1 d = new tu1(new tv1(14), false, -671362096);
    public static final tu1 e = new tu1(new sv1(11), false, -443426462);

    public static final void a(String str, int i, vt4 vt4Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        String str2;
        boolean z2;
        kq7 kq7Var;
        int i4;
        int i5;
        int i6;
        int i7;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1160995565);
        if ((i2 & 6) == 0) {
            if (rv4Var2.f(str)) {
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
            if (rv4Var2.h(vt4Var)) {
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
        if (rv4Var2.U(i3 & 1, z)) {
            kq7 kq7Var2 = kq7.a;
            nq7 n = pna.n(kq7Var2, 40.0f);
            nk0 nk0Var = kh5.a;
            b37 d2 = fu0.d(nk0Var, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, n);
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
            nq7 v = nmd.v(tte.k(zbe.y(ze4Var, 6.0f), uu9.a), ((h27) rv4Var2.j(j27.a)).a.a, lre.g);
            if ((i3 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var2.P();
            if (z2 || P == ax1.a) {
                P = new pp1(3, vt4Var);
                rv4Var2.o0(P);
            }
            int i8 = i3;
            nq7 f = lbe.f(15, (vt4) P, v, null, false);
            b37 d3 = fu0.d(nk0Var, false);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, f);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, d3);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            if (str.length() > 0) {
                rv4Var2.e0(-259432588);
                kq7Var = kq7Var2;
                i4 = 3;
                do5.a(str, r0f.d, false, null, null, null, ze4Var, null, rv4Var, (i8 & 14) | 12582960, 892);
                str2 = str;
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                kq7Var = kq7Var2;
                i4 = 3;
                str2 = str;
                rv4Var2.e0(-259235583);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
            if (i > 0) {
                rv4Var2.e0(-1430397395);
                ctd.a(3072, 6, 0L, 0L, jce.E(-928158113, new zj7(i, i4), rv4Var2), rv4Var2, pu0.a.a(kq7Var, kh5.c));
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-1430260933);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
        } else {
            str2 = str;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ns1(str2, i, vt4Var, i2);
        }
    }

    public static final void b(rj8 rj8Var, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        nq7 nq7Var2;
        boolean z;
        int i3;
        int i4;
        int i5;
        rv4Var.g0(-734202561);
        if ((i & 6) == 0) {
            if (rv4Var.f(rj8Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            nq7Var2 = nq7Var;
            if (rv4Var.f(nq7Var2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        } else {
            nq7Var2 = nq7Var;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(xt4Var)) {
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
            int k = rj8Var.k();
            List v0 = sl1.v0(cqe.m((q3b) nz.a.getValue(), rv4Var), 2);
            long j = zl1.h;
            d3a.c(k, nq7Var2, j, j, nae.e, jce.E(71748703, new os1(rj8Var, 0), rv4Var), zpe.a, jce.E(985750111, new ps1(xt4Var, v0, k), rv4Var), rv4Var, (i2 & Token.ASSIGN_MOD) | 14380416, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new va((Object) rj8Var, nq7Var, (hu4) xt4Var, i, 7);
        }
    }

    public static final void c(int i, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, nq7 nq7Var, boolean z) {
        int i2;
        boolean z2;
        vt4 vt4Var3;
        kq7 kq7Var;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        int i4;
        int i5;
        int i6;
        rv4Var.g0(-1211871949);
        if ((i & 6) == 0) {
            if (rv4Var.d(0)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.g(z)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        int i7 = i2 | 384;
        if ((i & 3072) == 0) {
            if (rv4Var.h(vt4Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i7 |= i4;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(vt4Var2)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i7 |= i3;
        }
        if ((i7 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i7 & 1, z2)) {
            kq7 kq7Var2 = kq7.a;
            nq7 h = pna.h(kq7Var2, 40.0f);
            gv9 a2 = ev9.a(lz.e, kh5.G, rv4Var, 54);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, h);
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
            nq7 n = pna.n(kq7Var2, 40.0f);
            su9 su9Var = uu9.a;
            nq7 k = tte.k(n, su9Var);
            if ((i7 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P = rv4Var.P();
            boolean z6 = z3;
            lh9 lh9Var = ax1.a;
            if (z6 || P == lh9Var) {
                P = new pp1(1, vt4Var);
                rv4Var.o0(P);
            }
            int i8 = i7;
            kq7 kq7Var3 = kq7Var2;
            nk5.a(rp5.c((wk3) ok3.l0.getValue(), rv4Var, 0), null, zbe.y(lbe.f(15, (vt4) P, k, null, false), 8.0f), 0L, rv4Var, 48, 8);
            if (z) {
                rs8.s(rv4Var, -18941791, kq7Var3, 8.0f, rv4Var);
                b37 d2 = fu0.d(kh5.a, false);
                int hashCode2 = Long.hashCode(rv4Var.T);
                xt8 l2 = rv4Var.l();
                nq7 p2 = lye.p(rv4Var, kq7Var3);
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(zx1Var);
                } else {
                    rv4Var.r0();
                }
                jce.F(npVar, rv4Var, d2);
                jce.F(npVar2, rv4Var, l2);
                s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
                jce.F(npVar4, rv4Var, p2);
                nq7 k2 = tte.k(pna.n(kq7Var3, 40.0f), su9Var);
                if ((i8 & 57344) == 16384) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Object P2 = rv4Var.P();
                if (!z5 && P2 != lh9Var) {
                    vt4Var3 = vt4Var2;
                } else {
                    vt4Var3 = vt4Var2;
                    P2 = new pp1(2, vt4Var3);
                    rv4Var.o0(P2);
                }
                nk5.a(rp5.c((wk3) ok3.a.getValue(), rv4Var, 0), null, zbe.y(lbe.f(15, (vt4) P2, k2, null, false), 8.0f), 0L, rv4Var, 48, 8);
                rv4Var.e0(231158154);
                rv4Var.q(false);
                z4 = true;
                rv4Var.q(true);
                rv4Var.q(false);
            } else {
                vt4Var3 = vt4Var2;
                z4 = true;
                rv4Var.e0(-18286389);
                rv4Var.q(false);
            }
            rv4Var.q(z4);
            kq7Var = kq7Var3;
        } else {
            vt4Var3 = vt4Var2;
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ms1(z, kq7Var, vt4Var, vt4Var3, i, 0);
        }
    }

    public static final void d(String str, int i, boolean z, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, rv4 rv4Var, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        nk0 nk0Var;
        np npVar;
        np npVar2;
        np npVar3;
        kg kgVar;
        np npVar4;
        su9 su9Var;
        lh9 lh9Var;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        lh9 lh9Var2;
        np npVar5;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = i;
        rv4 rv4Var2 = rv4Var;
        nk0 nk0Var2 = kh5.c;
        nk0 nk0Var3 = kh5.a;
        rv4Var2.g0(187395681);
        if ((i2 & 6) == 0) {
            if (rv4Var2.f(str)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i3 = i11 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var2.d(i12)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i3 |= i10;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var2.d(0)) {
                i9 = 256;
            } else {
                i9 = Token.CASE;
            }
            i3 |= i9;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var2.g(z)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        if ((196608 & i2) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i6 = 131072;
            } else {
                i6 = Parser.ARGC_LIMIT;
            }
            i3 |= i6;
        }
        if ((1572864 & i2) == 0) {
            if (rv4Var2.h(vt4Var2)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i3 |= i5;
        }
        if ((12582912 & i2) == 0) {
            if (rv4Var2.h(vt4Var3)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i3 |= i4;
        }
        int i13 = i3;
        if ((i13 & 4793491) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i13 & 1, z2)) {
            nq7 h = pna.h(nq7Var, 40.0f);
            gv9 a2 = ev9.a(lz.e, kh5.G, rv4Var2, 54);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, h);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar6 = qw1.f;
            jce.F(npVar6, rv4Var2, a2);
            np npVar7 = qw1.e;
            jce.F(npVar7, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar8 = qw1.g;
            jce.F(npVar8, rv4Var2, valueOf);
            kg kgVar2 = qw1.h;
            jce.C(kgVar2, rv4Var2);
            np npVar9 = qw1.d;
            jce.F(npVar9, rv4Var2, p);
            kq7 kq7Var = kq7.a;
            nq7 n = pna.n(kq7Var, 40.0f);
            su9 su9Var2 = uu9.a;
            nq7 k = tte.k(n, su9Var2);
            if ((i13 & 458752) == 131072) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P = rv4Var2.P();
            lh9 lh9Var3 = ax1.a;
            if (z3 || P == lh9Var3) {
                P = new pp1(4, vt4Var);
                rv4Var2.o0(P);
            }
            nk5.a(rp5.c((wk3) ok3.l0.getValue(), rv4Var2, 0), null, zbe.y(lbe.f(15, (vt4) P, k, null, false), 8.0f), 0L, rv4Var2, 48, 8);
            if (z) {
                rs8.s(rv4Var2, -1470163173, kq7Var, 8.0f, rv4Var2);
                b37 d2 = fu0.d(nk0Var3, false);
                int hashCode2 = Long.hashCode(rv4Var2.T);
                xt8 l2 = rv4Var2.l();
                nq7 p2 = lye.p(rv4Var2, kq7Var);
                rv4Var2.i0();
                if (rv4Var2.S) {
                    rv4Var2.k(zx1Var);
                } else {
                    rv4Var2.r0();
                }
                jce.F(npVar6, rv4Var2, d2);
                jce.F(npVar7, rv4Var2, l2);
                s21.t(hashCode2, rv4Var2, npVar8, rv4Var2, kgVar2);
                jce.F(npVar9, rv4Var2, p2);
                nq7 k2 = tte.k(pna.n(kq7Var, 40.0f), su9Var2);
                if ((i13 & 3670016) == 1048576) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                Object P2 = rv4Var2.P();
                if (!z8) {
                    lh9Var2 = lh9Var3;
                    if (P2 != lh9Var2) {
                        npVar5 = npVar9;
                        nk0Var = nk0Var2;
                        lh9Var = lh9Var2;
                        z4 = false;
                        npVar2 = npVar7;
                        npVar3 = npVar8;
                        su9Var = su9Var2;
                        kgVar = kgVar2;
                        npVar = npVar6;
                        npVar4 = npVar5;
                        nk5.a(rp5.c((wk3) ok3.a.getValue(), rv4Var2, 0), null, zbe.y(lbe.f(15, (vt4) P2, k2, null, false), 8.0f), 0L, rv4Var2, 48, 8);
                        rv4Var2.e0(-352424314);
                        rv4Var2.q(false);
                        z5 = true;
                        rv4Var2.q(true);
                        rv4Var2.q(false);
                    }
                } else {
                    lh9Var2 = lh9Var3;
                }
                npVar5 = npVar9;
                P2 = new pp1(5, vt4Var2);
                rv4Var2.o0(P2);
                nk0Var = nk0Var2;
                lh9Var = lh9Var2;
                z4 = false;
                npVar2 = npVar7;
                npVar3 = npVar8;
                su9Var = su9Var2;
                kgVar = kgVar2;
                npVar = npVar6;
                npVar4 = npVar5;
                nk5.a(rp5.c((wk3) ok3.a.getValue(), rv4Var2, 0), null, zbe.y(lbe.f(15, (vt4) P2, k2, null, false), 8.0f), 0L, rv4Var2, 48, 8);
                rv4Var2.e0(-352424314);
                rv4Var2.q(false);
                z5 = true;
                rv4Var2.q(true);
                rv4Var2.q(false);
            } else {
                nk0Var = nk0Var2;
                npVar = npVar6;
                npVar2 = npVar7;
                npVar3 = npVar8;
                kgVar = kgVar2;
                npVar4 = npVar9;
                su9Var = su9Var2;
                lh9Var = lh9Var3;
                z4 = false;
                z5 = true;
                rv4Var2.e0(-1469507771);
                rv4Var2.q(false);
            }
            xbe.i(rv4Var2, pna.s(kq7Var, 8.0f));
            nq7 n2 = pna.n(kq7Var, 40.0f);
            b37 d3 = fu0.d(nk0Var3, z4);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, n2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, d3);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
            np npVar10 = npVar4;
            jce.F(npVar10, rv4Var2, p3);
            ze4 ze4Var = pna.c;
            nq7 v = nmd.v(tte.k(zbe.y(ze4Var, 6.0f), su9Var), ((h27) rv4Var2.j(j27.a)).a.a, lre.g);
            if ((i13 & 29360128) == 8388608) {
                z6 = z5;
            } else {
                z6 = false;
            }
            Object P3 = rv4Var2.P();
            if (z6 || P3 == lh9Var) {
                P3 = new pp1(6, vt4Var3);
                rv4Var2.o0(P3);
            }
            nq7 f = lbe.f(15, (vt4) P3, v, null, false);
            b37 d4 = fu0.d(nk0Var3, false);
            int hashCode4 = Long.hashCode(rv4Var2.T);
            xt8 l4 = rv4Var2.l();
            nq7 p4 = lye.p(rv4Var2, f);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, d4);
            jce.F(npVar2, rv4Var2, l4);
            s21.t(hashCode4, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar10, rv4Var2, p4);
            if (str.length() > 0) {
                rv4Var2.e0(-1793519796);
                z7 = true;
                do5.a(str, r0f.d, false, null, null, null, ze4Var, null, rv4Var, (i13 & 14) | 12582960, 892);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                z7 = true;
                rv4Var2.e0(-1793299727);
                rv4Var2.q(false);
            }
            rv4Var2.q(z7);
            if (i > 0) {
                rv4Var2.e0(-63610937);
                i12 = i;
                ctd.a(3072, 6, 0L, 0L, jce.E(545740143, new zj7(i12, 4), rv4Var2), rv4Var, pu0.a.a(kq7Var, nk0Var));
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                i12 = i;
                rv4Var2.e0(-63453333);
                rv4Var2.q(false);
            }
            s21.x(rv4Var2, z7, kq7Var, 8.0f, rv4Var2);
            rv4Var2.q(z7);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new qs1(str, i12, z, nq7Var, vt4Var, vt4Var2, vt4Var3, i2);
        }
    }

    public static final void e(String str, int i, boolean z, rj8 rj8Var, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, xt4 xt4Var, vt4 vt4Var3, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        rj8 rj8Var2;
        xt4 xt4Var2;
        float f;
        np npVar;
        int i11;
        boolean z3;
        rv4 rv4Var2 = rv4Var;
        rj8Var.getClass();
        vt4Var.getClass();
        vt4Var2.getClass();
        xt4Var.getClass();
        vt4Var3.getClass();
        rv4Var2.g0(1375190978);
        if (rv4Var2.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i12 = i2 | i3;
        if (rv4Var2.d(i)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i13 = i12 | i4;
        if (rv4Var2.g(z)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i14 = i13 | i5;
        if (rv4Var2.f(rj8Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i15 = i14 | i6;
        if (rv4Var2.h(vt4Var)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i16 = i15 | i7;
        if (rv4Var2.h(vt4Var2)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i17 = i16 | i8;
        if (rv4Var2.h(xt4Var)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i18 = i17 | i9;
        if (rv4Var2.h(vt4Var3)) {
            i10 = 67108864;
        } else {
            i10 = 33554432;
        }
        int i19 = i18 | i10;
        if ((38347923 & i19) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i19 & 1, z2)) {
            nq7 h = q1d.h(rv4Var2, pna.f(nq7Var, 1.0f));
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, h);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar2 = qw1.f;
            jce.F(npVar2, rv4Var2, a2);
            np npVar3 = qw1.e;
            jce.F(npVar3, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar4 = qw1.g;
            jce.F(npVar4, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar5 = qw1.d;
            jce.F(npVar5, rv4Var2, p);
            kq7 kq7Var = kq7.a;
            nq7 C = zbe.C(zbe.A(mwe.u(pna.f(kq7Var, 1.0f), false, 1), 12.0f, nae.e, 2), nae.e, 12.0f, nae.e, 8.0f, 5);
            mk0 mk0Var = kh5.G;
            gv9 a3 = ev9.a(lz.a, mk0Var, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, C);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar2, rv4Var2, a3);
            jce.F(npVar3, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar4, rv4Var2, kgVar);
            jce.F(npVar5, rv4Var2, p2);
            String A = yqe.A((y3b) k2b.f.getValue(), rv4Var2);
            oyb oybVar = ((h27) rv4Var2.j(j27.a)).b.g;
            nq7 C2 = zbe.C(kq7Var, 12.0f, nae.e, nae.e, nae.e, 14);
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            } else {
                f = 1.0f;
            }
            cvb.c(A, C2.a0(new we6(f, true)), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, oybVar, rv4Var, 0, 24576, 114684);
            rv4Var2 = rv4Var;
            if (!z) {
                rv4Var2.e0(-1959863979);
                int i20 = i19 >> 6;
                npVar = npVar5;
                i11 = 54;
                c((i20 & 57344) | (i20 & 7168) | 54, vt4Var, vt4Var2, rv4Var2, null, false);
                rs8.v(kq7Var, 8.0f, rv4Var2, false);
            } else {
                npVar = npVar5;
                i11 = 54;
                rv4Var2.e0(-1959582406);
                rv4Var2.q(false);
            }
            a(str, i, vt4Var3, rv4Var2, (i19 & Token.ELSE) | ((i19 >> 18) & 896));
            rv4Var2.q(true);
            if (z) {
                rv4Var2.e0(-1483572486);
                nq7 C3 = zbe.C(zbe.A(pna.f(kq7Var, 1.0f), 12.0f, nae.e, 2), nae.e, nae.e, nae.e, 6.0f, 7);
                gv9 a4 = ev9.a(new hz(8.0f, true, new vs(2)), mk0Var, rv4Var2, i11);
                int hashCode3 = Long.hashCode(rv4Var2.T);
                xt8 l3 = rv4Var2.l();
                nq7 p3 = lye.p(rv4Var2, C3);
                rv4Var2.i0();
                if (rv4Var2.S) {
                    rv4Var2.k(zx1Var);
                } else {
                    rv4Var2.r0();
                }
                jce.F(npVar2, rv4Var2, a4);
                jce.F(npVar3, rv4Var2, l3);
                s21.t(hashCode3, rv4Var2, npVar4, rv4Var2, kgVar);
                jce.F(npVar, rv4Var2, p3);
                float f2 = 1.0f;
                if (1.0f <= 0.0d) {
                    jv5.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f2 = Float.MAX_VALUE;
                }
                rj8Var2 = rj8Var;
                xt4Var2 = xt4Var;
                b(rj8Var2, new we6(f2, true), xt4Var2, rv4Var2, ((i19 >> 9) & 14) | ((i19 >> 15) & 896));
                int i21 = i19 >> 6;
                z3 = true;
                c(i11 | (i21 & 7168) | (i21 & 57344), vt4Var, vt4Var2, rv4Var2, null, true);
                rv4Var2.q(true);
                rv4Var2.q(false);
            } else {
                rj8Var2 = rj8Var;
                xt4Var2 = xt4Var;
                z3 = true;
                rv4Var2.e0(-1482859114);
                rv4Var2.q(false);
            }
            rv4Var2.q(z3);
        } else {
            rj8Var2 = rj8Var;
            xt4Var2 = xt4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ls1(str, i, z, rj8Var2, nq7Var, vt4Var, vt4Var2, xt4Var2, vt4Var3, i2, 1);
        }
    }

    public static final void f(String str, int i, boolean z, rj8 rj8Var, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, xt4 xt4Var, vt4 vt4Var3, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        boolean z3;
        rj8Var.getClass();
        vt4Var.getClass();
        vt4Var2.getClass();
        xt4Var.getClass();
        vt4Var3.getClass();
        rv4Var.g0(2098877310);
        if (rv4Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i12 = i2 | i3;
        if (rv4Var.d(i)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i13 = i12 | i4;
        if (rv4Var.g(z)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i14 = i13 | i5;
        if (rv4Var.f(rj8Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i15 = i14 | i6;
        if (rv4Var.h(vt4Var)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i16 = i15 | i7;
        if (rv4Var.h(vt4Var2)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i17 = i16 | i8;
        if (rv4Var.h(xt4Var)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i18 = i17 | i9;
        if (rv4Var.h(vt4Var3)) {
            i10 = 67108864;
        } else {
            i10 = 33554432;
        }
        int i19 = i18 | i10;
        if ((38347923 & i19) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i19 & 1, z2)) {
            nq7 A = zbe.A(mwe.u(q1d.h(rv4Var, nq7Var), false, 1), nae.e, 8.0f, 1);
            gv9 a2 = ev9.a(lz.e, kh5.G, rv4Var, 54);
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
            float f = 1.0f;
            if (z) {
                rv4Var.e0(264339617);
                i11 = i19;
                if (1.0f <= 0.0d) {
                    jv5.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                }
                b(rj8Var, new we6(f, true), xt4Var, rv4Var, ((i11 >> 9) & 14) | ((i11 >> 15) & 896));
                rv4Var.q(false);
                z3 = true;
            } else {
                i11 = i19;
                rv4Var.e0(264536653);
                String A2 = yqe.A((y3b) k2b.f.getValue(), rv4Var);
                oyb oybVar = ((h27) rv4Var.j(j27.a)).b.g;
                if (1.0f <= 0.0d) {
                    jv5.a("invalid weight; must be greater than zero");
                }
                float f2 = 1.0f;
                if (1.0f > Float.MAX_VALUE) {
                    f2 = Float.MAX_VALUE;
                }
                z3 = true;
                cvb.c(A2, new we6(f2, true), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, oybVar, rv4Var, 0, 24576, 114684);
                rv4Var.q(false);
            }
            d(str, i, z, zbe.A(kq7.a, 12.0f, nae.e, 2), vt4Var, vt4Var2, vt4Var3, rv4Var, (i11 & 14) | 24960 | (i11 & Token.ASSIGN_MOD) | ((i11 << 3) & 7168) | (i11 & 458752) | (i11 & 3670016) | (29360128 & (i11 >> 3)));
            rv4Var.q(z3);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ls1(str, i, z, rj8Var, nq7Var, vt4Var, vt4Var2, xt4Var, vt4Var3, i2, 0);
        }
    }

    public static final void g(final List list, final kj6 kj6Var, final boolean z, nq7 nq7Var, lu4 lu4Var, lu4 lu4Var2, mu4 mu4Var, vt4 vt4Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        final lu4 lu4Var3;
        final lu4 lu4Var4;
        final mu4 mu4Var2;
        final vt4 vt4Var2;
        final xt4 xt4Var3;
        final xt4 xt4Var4;
        boolean z2;
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
        rv4Var.g0(1743768917);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var.f(list);
            } else {
                h = rv4Var.h(list);
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
            if (rv4Var.f(kj6Var)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        }
        if ((i & 384) == 0) {
            if (rv4Var.g(z)) {
                i10 = 256;
            } else {
                i10 = Token.CASE;
            }
            i2 |= i10;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(nq7Var)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i2 |= i9;
        }
        if ((i & 24576) == 0) {
            lu4Var3 = lu4Var;
            if (rv4Var.h(lu4Var3)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i2 |= i8;
        } else {
            lu4Var3 = lu4Var;
        }
        if ((196608 & i) == 0) {
            lu4Var4 = lu4Var2;
            if (rv4Var.h(lu4Var4)) {
                i7 = 131072;
            } else {
                i7 = Parser.ARGC_LIMIT;
            }
            i2 |= i7;
        } else {
            lu4Var4 = lu4Var2;
        }
        if ((1572864 & i) == 0) {
            mu4Var2 = mu4Var;
            if (rv4Var.h(mu4Var2)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i2 |= i6;
        } else {
            mu4Var2 = mu4Var;
        }
        if ((12582912 & i) == 0) {
            vt4Var2 = vt4Var;
            if (rv4Var.h(vt4Var2)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i2 |= i5;
        } else {
            vt4Var2 = vt4Var;
        }
        if ((100663296 & i) == 0) {
            xt4Var3 = xt4Var;
            if (rv4Var.h(xt4Var3)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i2 |= i4;
        } else {
            xt4Var3 = xt4Var;
        }
        if ((805306368 & i) == 0) {
            xt4Var4 = xt4Var2;
            if (rv4Var.h(xt4Var4)) {
                i3 = 536870912;
            } else {
                i3 = 268435456;
            }
            i2 |= i3;
        } else {
            xt4Var4 = xt4Var2;
        }
        int i13 = i2;
        if ((306783379 & i13) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i13 & 1, z2)) {
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yae.z(Boolean.FALSE);
                rv4Var.o0(P);
            }
            final aw7 aw7Var = (aw7) P;
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = yae.q(new ne1(kj6Var, 11));
                rv4Var.o0(P2);
            }
            final yya yyaVar = (yya) P2;
            Integer valueOf = Integer.valueOf(((Number) yyaVar.getValue()).intValue());
            Object P3 = rv4Var.P();
            if (P3 == lh9Var) {
                P3 = new cd2(aw7Var, null, 3);
                rv4Var.o0(P3);
            }
            yte.g((lu4) P3, rv4Var, valueOf);
            hc2.b(nq7Var, null, jce.E(-1940410561, new mu4() { // from class: yj8
                @Override // defpackage.mu4
                public final Object c(Object obj, Object obj2, Object obj3) {
                    boolean z3;
                    int i14;
                    su0 su0Var = (su0) obj;
                    rv4 rv4Var2 = (rv4) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    su0Var.getClass();
                    if ((intValue & 6) == 0) {
                        if (rv4Var2.f(su0Var)) {
                            i14 = 4;
                        } else {
                            i14 = 2;
                        }
                        intValue |= i14;
                    }
                    boolean z4 = false;
                    if ((intValue & 19) != 18) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z3)) {
                        ze4 ze4Var = pna.c;
                        aw7 aw7Var2 = aw7Var;
                        boolean z5 = !((Boolean) aw7Var2.getValue()).booleanValue();
                        List list2 = list;
                        boolean h2 = rv4Var2.h(list2);
                        if ((intValue & 14) == 4) {
                            z4 = true;
                        }
                        lu4 lu4Var5 = lu4Var3;
                        boolean f = h2 | z4 | rv4Var2.f(lu4Var5);
                        lu4 lu4Var6 = lu4Var4;
                        boolean f2 = f | rv4Var2.f(lu4Var6);
                        mu4 mu4Var3 = mu4Var2;
                        boolean f3 = f2 | rv4Var2.f(mu4Var3);
                        vt4 vt4Var3 = vt4Var2;
                        boolean f4 = f3 | rv4Var2.f(vt4Var3);
                        xt4 xt4Var5 = xt4Var3;
                        boolean f5 = f4 | rv4Var2.f(xt4Var5);
                        xt4 xt4Var6 = xt4Var4;
                        boolean f6 = f5 | rv4Var2.f(xt4Var6);
                        Object P4 = rv4Var2.P();
                        if (f6 || P4 == ax1.a) {
                            bk8 bk8Var = new bk8(list2, su0Var, lu4Var5, lu4Var6, mu4Var3, vt4Var3, xt4Var5, xt4Var6, yyaVar, aw7Var2, 1);
                            rv4Var2.o0(bk8Var);
                            P4 = bk8Var;
                        }
                        vqe.o(ze4Var, kj6.this, null, z, null, null, null, z5, (xt4) P4, rv4Var2, 6, Token.COLON);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, ((i13 >> 9) & 14) | 3072, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qg0(list, kj6Var, z, nq7Var, lu4Var, lu4Var2, mu4Var, vt4Var, xt4Var, xt4Var2, i);
        }
    }

    public static final void h(kj6 kj6Var, boolean z, float f, rh8 rh8Var, float f2, long j, long j2, wea weaVar, h3a h3aVar, g3a g3aVar, int i, rv4 rv4Var, int i2, int i3) {
        int i4;
        int i5;
        boolean z2;
        yya yyaVar;
        aw7 aw7Var;
        yya yyaVar2;
        lh9 lh9Var;
        yya yyaVar3;
        int i6;
        yya yyaVar4;
        aw7 aw7Var2;
        int i7;
        dm8 dm8Var;
        boolean z3;
        boolean z4;
        yya yyaVar5;
        dm8 dm8Var2;
        boolean z5;
        kj6 kj6Var2;
        xt4 xt4Var;
        boolean z6;
        int i8;
        int i9;
        int ordinal;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        kj6Var.getClass();
        rh8Var.getClass();
        rv4Var.g0(-300893296);
        if ((i2 & 6) == 0) {
            if (rv4Var.f(kj6Var)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i4 = i20 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f(kq7.a)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i4 |= i19;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.g(z)) {
                i18 = 256;
            } else {
                i18 = Token.CASE;
            }
            i4 |= i18;
        }
        int i21 = 2048;
        if ((i2 & 3072) == 0) {
            if (rv4Var.g(false)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i4 |= i17;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var.c(f)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i4 |= i16;
        }
        if ((i2 & 196608) == 0) {
            if (rv4Var.f(rh8Var)) {
                i15 = 131072;
            } else {
                i15 = Parser.ARGC_LIMIT;
            }
            i4 |= i15;
        }
        if ((i2 & 1572864) == 0) {
            if (rv4Var.c(f2)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i4 |= i14;
        }
        if ((i2 & 12582912) == 0) {
            if (rv4Var.e(j)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i4 |= i13;
        }
        if ((i2 & 100663296) == 0) {
            if (rv4Var.e(j2)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i4 |= i12;
        }
        if ((i2 & 805306368) == 0) {
            if (rv4Var.f(weaVar)) {
                i11 = 536870912;
            } else {
                i11 = 268435456;
            }
            i4 |= i11;
        }
        int i22 = -1;
        if ((i3 & 6) == 0) {
            if (h3aVar == null) {
                ordinal = -1;
            } else {
                ordinal = h3aVar.ordinal();
            }
            if (rv4Var.d(ordinal)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i5 = i10 | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            if (g3aVar != null) {
                i22 = g3aVar.ordinal();
            }
            if (rv4Var.d(i22)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i5 |= i9;
        }
        if ((i3 & 384) == 0) {
            if (rv4Var.d(i)) {
                i8 = 256;
            } else {
                i8 = Token.CASE;
            }
            i5 |= i8;
        }
        if ((i3 & 3072) == 0) {
            if (!rv4Var.h(null)) {
                i21 = 1024;
            }
            i5 |= i21;
        }
        int i23 = i4;
        if ((306783379 & i4) == 306783378 && (i5 & 1171) == 1170) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var.U(i23 & 1, z2)) {
            rv4Var.Z();
            if ((i2 & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
            }
            rv4Var.r();
            Object P = rv4Var.P();
            lh9 lh9Var2 = ax1.a;
            if (P == lh9Var2) {
                P = yae.q(new ne1(kj6Var, 2));
                rv4Var.o0(P);
            }
            yya yyaVar6 = (yya) P;
            Object P2 = rv4Var.P();
            if (P2 == lh9Var2) {
                P2 = yte.s(rv4Var);
                rv4Var.o0(P2);
            }
            m82 m82Var = (m82) P2;
            Object P3 = rv4Var.P();
            if (P3 == lh9Var2) {
                P3 = yae.z(Boolean.FALSE);
                rv4Var.o0(P3);
            }
            aw7 aw7Var3 = (aw7) P3;
            Object P4 = rv4Var.P();
            if (P4 == lh9Var2) {
                P4 = hl5.g(nae.e, rv4Var);
            }
            dm8 dm8Var3 = (dm8) P4;
            Object P5 = rv4Var.P();
            if (P5 == lh9Var2) {
                P5 = yae.q(new ne1(kj6Var, 3));
                rv4Var.o0(P5);
            }
            yya yyaVar7 = (yya) P5;
            Object P6 = rv4Var.P();
            if (P6 == lh9Var2) {
                yyaVar = yyaVar7;
                P6 = yae.q(new ne1(kj6Var, 4));
                rv4Var.o0(P6);
            } else {
                yyaVar = yyaVar7;
            }
            yya yyaVar8 = (yya) P6;
            Object P7 = rv4Var.P();
            if (P7 == lh9Var2) {
                aw7Var = aw7Var3;
                P7 = yae.q(new mf6(0, kj6Var, yyaVar8));
                rv4Var.o0(P7);
            } else {
                aw7Var = aw7Var3;
            }
            yya yyaVar9 = (yya) P7;
            Object P8 = rv4Var.P();
            if (P8 == lh9Var2) {
                P8 = yae.q(new se0(16, kj6Var, yyaVar8, yyaVar9));
                rv4Var.o0(P8);
            }
            yya yyaVar10 = (yya) P8;
            Object P9 = rv4Var.P();
            if (P9 == lh9Var2) {
                P9 = yae.q(new ef6(f2, yyaVar10, 0));
                rv4Var.o0(P9);
            }
            yya yyaVar11 = (yya) P9;
            Object P10 = rv4Var.P();
            if (P10 == lh9Var2) {
                lh9Var = lh9Var2;
                i6 = i23;
                yyaVar4 = yyaVar6;
                yyaVar2 = yyaVar11;
                aw7Var2 = aw7Var;
                i7 = i5;
                dm8Var = dm8Var3;
                yyaVar3 = yyaVar8;
                P10 = yae.q(new ff6(kj6Var, yyaVar8, f2, yyaVar10, yyaVar));
                rv4Var.o0(P10);
            } else {
                yyaVar2 = yyaVar11;
                lh9Var = lh9Var2;
                yyaVar3 = yyaVar8;
                i6 = i23;
                yyaVar4 = yyaVar6;
                aw7Var2 = aw7Var;
                i7 = i5;
                dm8Var = dm8Var3;
            }
            yya yyaVar12 = (yya) P10;
            Object P11 = rv4Var.P();
            if (P11 == lh9Var) {
                z3 = false;
                P11 = new gf6(yyaVar2, dm8Var, 0);
                rv4Var.o0(P11);
            } else {
                z3 = false;
            }
            xt4 xt4Var2 = (xt4) P11;
            Object P12 = rv4Var.P();
            if (P12 == lh9Var) {
                z4 = z3;
                dm8Var2 = dm8Var;
                yyaVar5 = yyaVar12;
                hf6 hf6Var = new hf6(xt4Var2, kj6Var, m82Var, dm8Var2, f2, yyaVar10, yyaVar3);
                xt4Var = xt4Var2;
                kj6Var2 = kj6Var;
                z5 = true;
                rv4Var.o0(hf6Var);
                P12 = hf6Var;
            } else {
                z4 = z3;
                yyaVar5 = yyaVar12;
                dm8Var2 = dm8Var;
                z5 = true;
                kj6Var2 = kj6Var;
                xt4Var = xt4Var2;
            }
            xt4 xt4Var3 = (xt4) P12;
            Object P13 = rv4Var.P();
            if (P13 == lh9Var) {
                P13 = new qp4(aw7Var2, 23);
                rv4Var.o0(P13);
            }
            xt4 xt4Var4 = (xt4) P13;
            if (!kj6Var2.j.a() && !((Boolean) aw7Var2.getValue()).booleanValue()) {
                z6 = z4;
            } else {
                z6 = z5;
            }
            Object P14 = rv4Var.P();
            if (P14 == lh9Var) {
                P14 = new jw0(yyaVar4, 19);
                rv4Var.o0(P14);
            }
            vt4 vt4Var = (vt4) P14;
            boolean booleanValue = ((Boolean) aw7Var2.getValue()).booleanValue();
            float h = dm8Var2.h();
            boolean booleanValue2 = ((Boolean) yyaVar.getValue()).booleanValue();
            Object P15 = rv4Var.P();
            if (P15 == lh9Var) {
                P15 = new jw0(yyaVar2, 20);
                rv4Var.o0(P15);
            }
            vt4 vt4Var2 = (vt4) P15;
            Object P16 = rv4Var.P();
            if (P16 == lh9Var) {
                P16 = new jw0(yyaVar5, 21);
                rv4Var.o0(P16);
            }
            int i24 = i6 >> 3;
            j(rh8Var, z, i, weaVar, f, j, j2, g3aVar, h3aVar, vt4Var, booleanValue, h, booleanValue2, vt4Var2, (vt4) P16, z6, xt4Var, xt4Var3, xt4Var4, rv4Var, (i24 & 29360128) | ((i6 << 3) & 458752) | (i24 & 14) | ((i6 >> 12) & Token.ASSIGN_MOD) | (i6 & 896) | ((i7 << 3) & 7168) | ((i6 >> 15) & 57344) | (3670016 & i24) | ((i7 << 21) & 234881024) | ((i7 << 27) & 1879048192), ((i7 >> 9) & 14) | 907739184);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lf6(kj6Var, z, f, rh8Var, f2, j, j2, weaVar, h3aVar, g3aVar, i, i2, i3);
        }
    }

    public static final void i(kj6 kj6Var, nq7 nq7Var, boolean z, float f, rh8 rh8Var, float f2, long j, long j2, wea weaVar, h3a h3aVar, g3a g3aVar, int i, boolean z2, tu1 tu1Var, rv4 rv4Var, int i2) {
        int i3;
        Object obj;
        long j3;
        boolean z3;
        rv4 rv4Var2;
        boolean z4;
        float f3;
        wea weaVar2;
        h3a h3aVar2;
        g3a g3aVar2;
        boolean z5;
        int i4;
        su9 su9Var;
        float f4;
        h3a h3aVar3;
        g3a g3aVar3;
        boolean z6;
        boolean z7;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        kj6Var.getClass();
        rh8Var.getClass();
        rv4Var.g0(-1786953928);
        if ((i2 & 6) == 0) {
            if (rv4Var.f(kj6Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i3 = i10 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i3 |= i9;
        }
        int i11 = i3 | 3456;
        if ((i2 & 24576) == 0) {
            if (rv4Var.c(f)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i11 |= i8;
        }
        if ((196608 & i2) == 0) {
            obj = rh8Var;
            if (rv4Var.f(obj)) {
                i7 = 131072;
            } else {
                i7 = Parser.ARGC_LIMIT;
            }
            i11 |= i7;
        } else {
            obj = rh8Var;
        }
        int i12 = i11 | 1572864;
        if ((12582912 & i2) == 0) {
            j3 = j;
            if (rv4Var.e(j3)) {
                i6 = 8388608;
            } else {
                i6 = 4194304;
            }
            i12 |= i6;
        } else {
            j3 = j;
        }
        if ((100663296 & i2) == 0) {
            if (rv4Var.e(j2)) {
                i5 = 67108864;
            } else {
                i5 = 33554432;
            }
            i12 |= i5;
        }
        if ((805306368 & i2) == 0) {
            i12 |= 268435456;
        }
        if ((306783379 & i12) == 306783378) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (rv4Var.U(i12 & 1, z3)) {
            rv4Var.Z();
            if ((i2 & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                f4 = f2;
                su9Var = weaVar;
                h3aVar3 = h3aVar;
                g3aVar3 = g3aVar;
                z7 = z2;
                i4 = i12 & (-1879048193);
                z6 = z;
            } else {
                i4 = i12 & (-1879048193);
                su9Var = uu9.a;
                f4 = 0.1f;
                h3aVar3 = h3a.a;
                g3aVar3 = g3a.a;
                z6 = true;
                z7 = true;
            }
            rv4Var.r();
            if (!z7) {
                rv4Var.e0(975920561);
                tu1Var.invoke(rv4Var, 6);
                rv4Var.q(false);
                rv4Var2 = rv4Var;
                z4 = z6;
            } else {
                rv4Var.e0(975974563);
                b37 d2 = fu0.d(kh5.a, false);
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
                jce.F(qw1.f, rv4Var, d2);
                jce.F(qw1.e, rv4Var, l);
                jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                jce.C(qw1.h, rv4Var);
                jce.F(qw1.d, rv4Var, p);
                tu1Var.invoke(rv4Var, 6);
                z4 = z6;
                h(kj6Var, z4, f, obj, f4, j3, j2, su9Var, h3aVar3, g3aVar3, i, rv4Var, (i4 & 14) | 48 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4), 3510);
                rv4Var2 = rv4Var;
                rv4Var2.q(true);
                rv4Var2.q(false);
            }
            f3 = f4;
            weaVar2 = su9Var;
            h3aVar2 = h3aVar3;
            g3aVar2 = g3aVar3;
            z5 = z7;
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
            z4 = z;
            f3 = f2;
            weaVar2 = weaVar;
            h3aVar2 = h3aVar;
            g3aVar2 = g3aVar;
            z5 = z2;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new df6(kj6Var, nq7Var, z4, f, rh8Var, f3, j, j2, weaVar2, h3aVar2, g3aVar2, i, z5, tu1Var, i2, 0);
        }
    }

    public static final void j(rh8 rh8Var, boolean z, int i, wea weaVar, float f, long j, long j2, g3a g3aVar, h3a h3aVar, vt4 vt4Var, boolean z2, float f2, boolean z3, vt4 vt4Var2, vt4 vt4Var3, boolean z4, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, rv4 rv4Var, int i2, int i3) {
        int i4;
        boolean z5;
        int i5;
        int i6;
        boolean z6;
        float f3;
        rv4Var.g0(949902905);
        int i7 = i2 & 6;
        kq7 kq7Var = kq7.a;
        if (i7 == 0) {
            i4 = (rv4Var.f(kq7Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= rv4Var.f(rh8Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z5 = z;
            i4 |= rv4Var.g(z5) ? 256 : Token.CASE;
        } else {
            z5 = z;
        }
        if ((i2 & 3072) == 0) {
            i4 |= rv4Var.d(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= rv4Var.f(weaVar) ? 16384 : 8192;
        }
        int i8 = i2 & 196608;
        int i9 = Parser.ARGC_LIMIT;
        if (i8 == 0) {
            i4 |= rv4Var.c(f) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= rv4Var.e(j) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= rv4Var.e(j2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= rv4Var.d(g3aVar.ordinal()) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 = 805306368;
            i4 |= rv4Var.d(h3aVar.ordinal()) ? 536870912 : 268435456;
        } else {
            i5 = 805306368;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (rv4Var.h(null) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= rv4Var.h(vt4Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            z6 = z2;
            i6 |= rv4Var.g(z6) ? 256 : Token.CASE;
        } else {
            z6 = z2;
        }
        if ((i3 & 3072) == 0) {
            f3 = f2;
            i6 |= rv4Var.c(f3) ? 2048 : 1024;
        } else {
            f3 = f2;
        }
        int i10 = i4;
        if ((i3 & 24576) == 0) {
            i6 |= rv4Var.g(z3) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            if (rv4Var.h(vt4Var2)) {
                i9 = 131072;
            }
            i6 |= i9;
        }
        if ((i3 & 1572864) == 0) {
            i6 |= rv4Var.h(vt4Var3) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i6 |= rv4Var.g(z4) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i6 |= rv4Var.h(xt4Var) ? 67108864 : 33554432;
        }
        if ((i3 & i5) == 0) {
            i6 |= rv4Var.h(xt4Var2) ? 536870912 : 268435456;
        }
        if (rv4Var.U(i10 & 1, ((i10 & 306783379) == 306783378 && (i6 & 306783379) == 306783378) ? false : true)) {
            nq7 f4 = pna.f(kq7Var, 1.0f);
            int i11 = i10 & Token.ASSIGN_MOD;
            boolean z7 = i11 == 32;
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z7 || P == obj) {
                P = new rg3(rh8Var.d());
                rv4Var.o0(P);
            }
            float f5 = ((rg3) P).a;
            boolean z8 = i11 == 32;
            Object P2 = rv4Var.P();
            if (z8 || P2 == obj) {
                Object rg3Var = new rg3(rh8Var.a());
                rv4Var.o0(rg3Var);
                P2 = rg3Var;
            }
            hc2.b(zbe.C(f4, nae.e, f5, nae.e, ((rg3) P2).a, 5), null, jce.E(-1947740253, new if6(rh8Var, z5, z6, j2, j, i, weaVar, f, g3aVar, z3, xt4Var2, f3, h3aVar, vt4Var2, vt4Var3, z4, vt4Var, xt4Var, xt4Var3, 0), rv4Var), rv4Var, 3072, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new jf6(rh8Var, z, i, weaVar, f, j, j2, g3aVar, h3aVar, vt4Var, z2, f2, z3, vt4Var2, vt4Var3, z4, xt4Var, xt4Var2, xt4Var3, i2, i3, 0);
        }
    }

    public static final void k(ywb ywbVar, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        ywbVar.getClass();
        xt4Var.getClass();
        rv4Var.g0(-2113972799);
        if (rv4Var.f(ywbVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (rv4Var.h(xt4Var)) {
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
            boolean booleanValue = ((Boolean) ywbVar.a.getValue()).booleanValue();
            eu3 g = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new y4(7);
                rv4Var.o0(P);
            }
            eu3 a2 = g.a(zt3.t((xt4) P));
            lz3 i6 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new y4(7);
                rv4Var.o0(P2);
            }
            z87.a(booleanValue, xt4Var, a2, i6.a(zt3.x((xt4) P2)), kh5.D, zl1.b(0.1f, zl1.b), false, false, null, jce.E(-2123726689, new t81(4, ywbVar, xt4Var), rv4Var), rv4Var, (i5 & Token.ASSIGN_MOD) | 805531008, 448);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sv4(ywbVar, xt4Var, i, 23);
        }
    }

    public static final void l(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var) {
        int i2;
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-434439478);
        if (rv4Var2.h(vt4Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i3 = i | i2;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i3 & 1, z)) {
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
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
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var2, pna.h(kq7Var, 56.0f));
            ar5 c2 = rp5.c((wk3) jk3.K.getValue(), rv4Var2, 0);
            tza tzaVar = j27.a;
            nk5.a(c2, null, pna.n(kq7Var, 40.0f), ((h27) rv4Var2.j(tzaVar)).a.q, rv4Var2, 432, 0);
            xbe.i(rv4Var2, pna.h(kq7Var, 24.0f));
            cvb.c(yqe.A((y3b) o2b.E0.getValue(), rv4Var2), zbe.A(kq7Var, 24.0f, nae.e, 2), ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.g, rv4Var2, 48, 0, 130040);
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            z1d.f(rp5.c((wk3) ok3.g0.getValue(), rv4Var2, 0), yqe.A((y3b) f2b.l0.getValue(), rv4Var2), false, null, null, null, null, null, vt4Var, rv4Var, (i3 << 21) & 234881024, 252);
            rv4Var2 = rv4Var;
            hl5.w(kq7Var, 56.0f, rv4Var2, true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new u81(nq7Var, vt4Var, i, 4);
        }
    }

    public static final void m(f4a f4aVar, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-973627364);
        if (rv4Var2.f(f4aVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var2.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var2.h(vt4Var)) {
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
        if (rv4Var2.U(i7 & 1, z)) {
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
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
            ar5 c2 = rp5.c((wk3) jk3.K.getValue(), rv4Var2, 0);
            long j = r0f.y(rv4Var2).q;
            kq7 kq7Var = kq7.a;
            nk5.a(c2, null, pna.n(kq7Var, 40.0f), j, rv4Var2, 432, 0);
            xbe.i(rv4Var2, pna.h(kq7Var, 24.0f));
            if (f4aVar.d != null) {
                rv4Var2.e0(-778170678);
                cvb.c(yqe.A((y3b) o2b.D0.getValue(), rv4Var2), zbe.A(kq7Var, 24.0f, nae.e, 2), r0f.y(rv4Var2).q, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).h, rv4Var, 48, 0, 130040);
                xbe.i(rv4Var, pna.h(kq7Var, 8.0f));
                cvb.c(f4aVar.c, zbe.A(kq7Var, 24.0f, nae.e, 2), r0f.y(rv4Var).q, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, r0f.A(rv4Var).k, rv4Var, 48, 0, 130040);
                xbe.i(rv4Var, pna.h(kq7Var, 24.0f));
                cvb.c(yqe.A((y3b) x2b.o0.getValue(), rv4Var), zbe.A(kq7Var, 24.0f, nae.e, 2), r0f.y(rv4Var).q, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, r0f.A(rv4Var).h, rv4Var, 48, 0, 130040);
                xbe.i(rv4Var, pna.h(kq7Var, 8.0f));
                cvb.c(f4aVar.d, zbe.A(kq7Var, 24.0f, nae.e, 2), r0f.y(rv4Var).q, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, r0f.A(rv4Var).k, rv4Var, 48, 0, 130040);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
                z2 = true;
            } else {
                rv4Var2.e0(-776755931);
                cvb.c(yqe.A((y3b) o2b.E0.getValue(), rv4Var2), zbe.A(kq7Var, 24.0f, nae.e, 2), r0f.y(rv4Var2).q, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).h, rv4Var, 48, 0, 130040);
                rv4Var2 = rv4Var;
                xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
                z1d.f(rp5.c((wk3) ok3.g0.getValue(), rv4Var2, 0), yqe.A((y3b) f2b.l0.getValue(), rv4Var2), false, null, null, null, null, null, vt4Var, rv4Var2, (i7 << 18) & 234881024, 252);
                rv4Var2.q(false);
                z2 = true;
            }
            rv4Var2.q(z2);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new m52(f4aVar, nq7Var, vt4Var, i, 1);
        }
    }

    public static final void n(k0b k0bVar, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(2029407252);
        if (rv4Var2.f(k0bVar)) {
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
        if (rv4Var2.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var2.h(xt4Var2)) {
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
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
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
            String str = k0bVar.c;
            tza tzaVar = j27.a;
            oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.j;
            long j = ((h27) rv4Var2.j(tzaVar)).a.q;
            long q = zr1.q(20);
            kq7 kq7Var = kq7.a;
            boolean z6 = true;
            cvb.c(str, zbe.y(kq7Var, 24.0f), j, null, q, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, oybVar, rv4Var, 24624, 0, 130024);
            rv4Var2 = rv4Var;
            if (k0bVar.f) {
                rv4Var2.e0(1734229868);
                eg0.f(pna.n(zbe.A(kq7Var, nae.e, 12.0f, 1), 32.0f), 0L, null, rv4Var2, 6, 6);
                rv4Var2.q(false);
            } else {
                if (k0bVar.g) {
                    rv4Var2.e0(1734448356);
                    rv4Var2.e0(-913879325);
                    String str2 = k0bVar.h;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (str2.length() == 0) {
                        str2 = yqe.A((y3b) s2b.a.getValue(), rv4Var2);
                    }
                    rv4Var2.q(false);
                    String str3 = str2;
                    cvb.c(str3, zbe.y(kq7Var, 24.0f), ((h27) rv4Var2.j(tzaVar)).a.q, null, zr1.q(20), null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.j, rv4Var, 24624, 0, 130024);
                    rv4Var2 = rv4Var;
                    ar5 c2 = rp5.c((wk3) ok3.g0.getValue(), rv4Var2, 0);
                    String A = yqe.A((y3b) b3b.B.getValue(), rv4Var2);
                    if ((i9 & 896) == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i10 = i9 & 14;
                    if (i10 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z7 = z3 | z2;
                    Object P = rv4Var2.P();
                    lh9 lh9Var = ax1.a;
                    if (z7 || P == lh9Var) {
                        P = new j52(xt4Var, k0bVar, 2);
                        rv4Var2.o0(P);
                    }
                    z1d.f(c2, A, false, null, null, null, null, null, (vt4) P, rv4Var2, 0, 252);
                    xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
                    ar5 c3 = rp5.c((wk3) ok3.F.getValue(), rv4Var2, 0);
                    String A2 = yqe.A((y3b) b3b.e.getValue(), rv4Var2);
                    if ((i9 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (i10 == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean z8 = z5 | z4;
                    Object P2 = rv4Var2.P();
                    if (z8 || P2 == lh9Var) {
                        P2 = new j52(xt4Var2, k0bVar, 3);
                        rv4Var2.o0(P2);
                    }
                    z1d.f(c3, A2, false, null, null, null, null, null, (vt4) P2, rv4Var2, 0, 252);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.e0(1735359384);
                    rv4Var2.q(false);
                }
                z6 = true;
            }
            rv4Var2.q(z6);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new k52(k0bVar, nq7Var, xt4Var, xt4Var2, i, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x042b, code lost:
        if (r11 == r10) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x029d, code lost:
        if (r4 == r5) goto L121;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(defpackage.po5 r47, final float r48, final defpackage.li8 r49, final defpackage.nq7 r50, defpackage.xt4 r51, final defpackage.xt4 r52, final defpackage.mu4 r53, final defpackage.xt4 r54, defpackage.rv4 r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fce.o(po5, float, li8, nq7, xt4, xt4, mu4, xt4, rv4, int):void");
    }

    public static final void p(int i, List list, kj6 kj6Var, nq7 nq7Var, lu4 lu4Var, lu4 lu4Var2, mu4 mu4Var, vt4 vt4Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i2) {
        int i3;
        nq7 nq7Var2;
        lu4 lu4Var3;
        lu4 lu4Var4;
        mu4 mu4Var2;
        Object obj;
        Object obj2;
        Object obj3;
        boolean z;
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
        int i13;
        rv4 rv4Var2 = rv4Var;
        list.getClass();
        kj6Var.getClass();
        lu4Var.getClass();
        lu4Var2.getClass();
        mu4Var.getClass();
        vt4Var.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var2.g0(-2029279950);
        if ((i2 & 6) == 0) {
            if (rv4Var2.d(i)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i3 = i13 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i2 & 64) == 0) {
                h = rv4Var2.f(list);
            } else {
                h = rv4Var2.h(list);
            }
            if (h) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i3 |= i12;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var2.f(kj6Var)) {
                i11 = 256;
            } else {
                i11 = Token.CASE;
            }
            i3 |= i11;
        }
        if ((i2 & 3072) == 0) {
            nq7Var2 = nq7Var;
            if (rv4Var2.f(nq7Var2)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i3 |= i10;
        } else {
            nq7Var2 = nq7Var;
        }
        if ((i2 & 24576) == 0) {
            lu4Var3 = lu4Var;
            if (rv4Var2.h(lu4Var3)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i3 |= i9;
        } else {
            lu4Var3 = lu4Var;
        }
        if ((196608 & i2) == 0) {
            lu4Var4 = lu4Var2;
            if (rv4Var2.h(lu4Var4)) {
                i8 = 131072;
            } else {
                i8 = Parser.ARGC_LIMIT;
            }
            i3 |= i8;
        } else {
            lu4Var4 = lu4Var2;
        }
        if ((1572864 & i2) == 0) {
            mu4Var2 = mu4Var;
            if (rv4Var2.h(mu4Var2)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i3 |= i7;
        } else {
            mu4Var2 = mu4Var;
        }
        if ((12582912 & i2) == 0) {
            obj = vt4Var;
            if (rv4Var2.h(obj)) {
                i6 = 8388608;
            } else {
                i6 = 4194304;
            }
            i3 |= i6;
        } else {
            obj = vt4Var;
        }
        if ((100663296 & i2) == 0) {
            obj2 = xt4Var;
            if (rv4Var2.h(obj2)) {
                i5 = 67108864;
            } else {
                i5 = 33554432;
            }
            i3 |= i5;
        } else {
            obj2 = xt4Var;
        }
        if ((805306368 & i2) == 0) {
            obj3 = xt4Var2;
            if (rv4Var2.h(obj3)) {
                i4 = 536870912;
            } else {
                i4 = 268435456;
            }
            i3 |= i4;
        } else {
            obj3 = xt4Var2;
        }
        if ((306783379 & i3) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i3 & 1, z)) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        rv4Var2.e0(1682583600);
                        rv4Var2.q(false);
                    } else {
                        rv4Var2.e0(1681625483);
                        int i14 = i3 >> 3;
                        vt4 vt4Var2 = obj;
                        xt4 xt4Var3 = obj2;
                        g(list, kj6Var, true, nq7Var2, lu4Var3, lu4Var4, mu4Var2, vt4Var2, xt4Var3, obj3, rv4Var2, (i3 & 1879048192) | (i14 & 14) | 384 | (i14 & Token.ASSIGN_MOD) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024));
                        rv4Var2.q(false);
                    }
                } else {
                    rv4Var2.e0(1681103722);
                    int i15 = i3 >> 3;
                    g(list, kj6Var, false, nq7Var, lu4Var, lu4Var2, mu4Var, vt4Var, xt4Var, xt4Var2, rv4Var2, (i15 & Token.ASSIGN_MOD) | (i15 & 14) | 384 | (i3 & 7168) | (i3 & 57344) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192));
                    rv4Var2.q(false);
                }
            } else {
                rv4Var2.e0(1682150003);
                r(list, kj6Var, nq7Var, lu4Var, lu4Var2, mu4Var, vt4Var, xt4Var, xt4Var2, rv4Var2, (i3 >> 3) & 268435454);
                rv4Var2 = rv4Var2;
                rv4Var2.q(false);
            }
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new nm5(i, i2, vt4Var, xt4Var, xt4Var2, lu4Var, lu4Var2, mu4Var, kj6Var, nq7Var, list);
        }
    }

    public static final uh9 q(r36 r36Var, f06 f06Var, char[] cArr) {
        r36Var.getClass();
        return new uh9(f06Var, cArr, r36Var.a);
    }

    public static final void r(List list, kj6 kj6Var, nq7 nq7Var, lu4 lu4Var, lu4 lu4Var2, mu4 mu4Var, vt4 vt4Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        aw7 aw7Var;
        lu4 jk8Var;
        int i3;
        lh9 lh9Var;
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
        rv4Var.g0(-157989557);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var.f(list);
            } else {
                h = rv4Var.h(list);
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
            if (rv4Var.f(kj6Var)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i10 = 256;
            } else {
                i10 = Token.CASE;
            }
            i2 |= i10;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(lu4Var)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i2 |= i9;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(lu4Var2)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i2 |= i8;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(mu4Var)) {
                i7 = 131072;
            } else {
                i7 = Parser.ARGC_LIMIT;
            }
            i2 |= i7;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.h(vt4Var)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i2 |= i6;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var.h(xt4Var)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i2 |= i5;
        }
        if ((100663296 & i) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i2 |= i4;
        }
        int i13 = i2;
        boolean z4 = false;
        if ((i13 & 38347923) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i13 & 1, z)) {
            Object P = rv4Var.P();
            lh9 lh9Var2 = ax1.a;
            if (P == lh9Var2) {
                P = yae.z(fi8.a);
                rv4Var.o0(P);
            }
            aw7 aw7Var2 = (aw7) P;
            int i14 = i13 & Token.ASSIGN_MOD;
            if (i14 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i13 & 14) != 4 && ((i13 & 8) == 0 || !rv4Var.h(list))) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolean z5 = z2 | z3;
            Object P2 = rv4Var.P();
            if (z5 || P2 == lh9Var2) {
                aw7Var = aw7Var2;
                i3 = i14;
                lh9Var = lh9Var2;
                jk8Var = new jk8(kj6Var, list, aw7Var, null, 0);
                rv4Var.o0(jk8Var);
            } else {
                aw7Var = aw7Var2;
                lh9Var = lh9Var2;
                jk8Var = P2;
                i3 = i14;
            }
            yte.h(kj6Var, list, jk8Var, rv4Var);
            if (i3 == 32) {
                z4 = true;
            }
            Object P3 = rv4Var.P();
            if (z4 || P3 == lh9Var) {
                P3 = yae.q(new ne1(kj6Var, 12));
                rv4Var.o0(P3);
            }
            hc2.b(nq7Var, null, jce.E(-429349963, new d52(kj6Var, list, (yya) P3, lu4Var, lu4Var2, mu4Var, vt4Var, xt4Var, xt4Var2, aw7Var), rv4Var), rv4Var, ((i13 >> 6) & 14) | 3072, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new h52(i, 1, vt4Var, xt4Var, xt4Var2, lu4Var, lu4Var2, mu4Var, kj6Var, nq7Var, list);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(5:5|6|7|(1:(1:10)(2:18|19))(7:20|21|22|23|24|25|(1:27))|(3:12|13|14)(2:16|17)))|31|6|7|(0)(0)|(0)(0)) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d A[Catch: Exception -> 0x0059, TRY_ENTER, TryCatch #0 {Exception -> 0x0059, blocks: (B:11:0x0024, B:25:0x004d, B:26:0x0051, B:27:0x0058, B:16:0x0031, B:20:0x003b), top: B:31:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051 A[Catch: Exception -> 0x0059, TryCatch #0 {Exception -> 0x0059, blocks: (B:11:0x0024, B:25:0x004d, B:26:0x0051, B:27:0x0058, B:16:0x0031, B:20:0x003b), top: B:31:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(defpackage.te5 r5, defpackage.n42 r6) {
        /*
            java.lang.Class<sw3> r0 = defpackage.sw3.class
            boolean r1 = r6 instanceof defpackage.gw2
            if (r1 == 0) goto L15
            r1 = r6
            gw2 r1 = (defpackage.gw2) r1
            int r2 = r1.b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.b = r2
            goto L1a
        L15:
            gw2 r1 = new gw2
            r1.<init>(r6)
        L1a:
            java.lang.Object r6 = r1.a
            int r2 = r1.b
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L28
            defpackage.hre.r(r6)     // Catch: java.lang.Exception -> L59
            goto L4b
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r4
        L2e:
            defpackage.hre.r(r6)
            gi1 r6 = defpackage.cm9.a(r0)     // Catch: java.lang.Exception -> L59
            nsc r0 = defpackage.cm9.d(r0)     // Catch: java.lang.Throwable -> L3a
            goto L3b
        L3a:
            r0 = r4
        L3b:
            isc r2 = new isc     // Catch: java.lang.Exception -> L59
            r2.<init>(r6, r0)     // Catch: java.lang.Exception -> L59
            r1.b = r3     // Catch: java.lang.Exception -> L59
            java.lang.Object r6 = r5.a(r2, r1)     // Catch: java.lang.Exception -> L59
            n82 r5 = defpackage.n82.a
            if (r6 != r5) goto L4b
            goto L5a
        L4b:
            if (r6 == 0) goto L51
            sw3 r6 = (defpackage.sw3) r6     // Catch: java.lang.Exception -> L59
            r4 = r6
            goto L59
        L51:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L59
            java.lang.String r6 = "null cannot be cast to non-null type org.publicvalue.multiplatform.oidc.types.remote.ErrorResponse"
            r5.<init>(r6)     // Catch: java.lang.Exception -> L59
            throw r5     // Catch: java.lang.Exception -> L59
        L59:
            r5 = r4
        L5a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fce.s(te5, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
        r13.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
        if (r13.c == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
        if (r12.a.size() <= 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
        r13.c = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
        r8 = defpackage.y78.j(r13.b, defpackage.w9e.n(r12));
        r13.b = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bd, code lost:
        if (defpackage.y78.e(r8) <= r13.a) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c1, code lost:
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c2, code lost:
        r13.c = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c4, code lost:
        r15 = r13.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d4, code lost:
        if (((java.lang.Boolean) r14.invoke(r12, java.lang.Boolean.valueOf(r15))).booleanValue() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d7, code lost:
        if (r15 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dc, code lost:
        r0.a = r7;
        r0.b = r1;
        r0.c = r14;
        r0.d = r13;
        r0.e = r12;
        r0.C = 2;
        r15 = r7.j(defpackage.s09.c, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ee, code lost:
        if (r15 != r6) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0108, code lost:
        r1.invoke();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0095 A[EDGE_INSN: B:65:0x0095->B:27:0x0095 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00d7 -> B:43:0x00d9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ee -> B:47:0x00f1). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.gab r12, defpackage.vt4 r13, defpackage.lu4 r14, defpackage.hh0 r15) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fce.t(gab, vt4, lu4, hh0):java.lang.Object");
    }

    public static Intent u(Context context, Class cls, int i, r5 r5Var) {
        Intent putExtra = new Intent(context, ActionCallbackBroadcastReceiver.class).setPackage(context.getPackageName()).putExtra("ActionCallbackBroadcastReceiver:callbackClass", cls.getCanonicalName()).putExtra("ActionCallbackBroadcastReceiver:appWidgetId", i);
        Map unmodifiableMap = Collections.unmodifiableMap(((pu7) r5Var).a);
        ArrayList arrayList = new ArrayList(unmodifiableMap.size());
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            arrayList.add(new yk8(((p5) entry.getKey()).a, entry.getValue()));
        }
        yk8[] yk8VarArr = (yk8[]) arrayList.toArray(new yk8[0]);
        putExtra.putExtra("ActionCallbackBroadcastReceiver:parameters", jsc.v((yk8[]) Arrays.copyOf(yk8VarArr, yk8VarArr.length)));
        return putExtra;
    }

    public static Object v(d19 d19Var, nu4 nu4Var, vt4 vt4Var, vt4 vt4Var2, xt4 xt4Var, xt4 xt4Var2, m42 m42Var) {
        return yae.h(d19Var, new kx4(vt4Var, xt4Var, xt4Var2, vt4Var2, nu4Var, null), m42Var);
    }

    public static final boolean w(Spanned spanned, Class cls) {
        if (spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length()) {
            return true;
        }
        return false;
    }

    public static final double x(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static u5e y(c70 c70Var, String str) {
        am8.s(c70Var);
        if (c70Var instanceof zz4) {
            zz4 zz4Var = (zz4) c70Var;
            return new u5e(zz4Var.a, zz4Var.b, "google.com", null, null, str, null, null);
        } else if (c70Var instanceof ma4) {
            return new u5e(null, ((ma4) c70Var).a, "facebook.com", null, null, str, null, null);
        } else {
            if (c70Var instanceof brc) {
                brc brcVar = (brc) c70Var;
                return new u5e(null, brcVar.a, "twitter.com", brcVar.b, null, str, null, null);
            } else if (c70Var instanceof iy4) {
                return new u5e(null, ((iy4) c70Var).a, "github.com", null, null, str, null, null);
            } else {
                if (c70Var instanceof ky8) {
                    return new u5e(null, null, "playgames.google.com", null, ((ky8) c70Var).a, str, null, null);
                }
                if (c70Var instanceof hde) {
                    hde hdeVar = (hde) c70Var;
                    u5e u5eVar = hdeVar.d;
                    if (u5eVar != null) {
                        return u5eVar;
                    }
                    return new u5e(hdeVar.b, hdeVar.c, hdeVar.a, hdeVar.f, null, str, hdeVar.e, hdeVar.C);
                }
                vs.m("Unsupported credential type.");
                return null;
            }
        }
    }
}
