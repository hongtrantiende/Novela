package defpackage;

import android.view.View;
import com.vbook.android.R;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.zone.ZoneRules;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c16  reason: default package */
/* loaded from: classes3.dex */
public abstract class c16 {
    public static final tu1 a = new tu1(new nv1(11), false, 1464024338);
    public static final tu1 b = new tu1(new mv1(24), false, 771255958);
    public static final tu1 c = new tu1(new mv1(25), false, -1341217741);
    public static final tu1 d = new tu1(new nv1(12), false, -1613168713);
    public static final mb4 e;
    public static final mb4 f;
    public static final mb4[] g;

    static {
        mb4 mb4Var = new mb4("CLIENT_TELEMETRY", 1L);
        e = mb4Var;
        mb4 mb4Var2 = new mb4("CLIENT_NOTIFICATION_TELEMETRY", 1L);
        f = mb4Var2;
        g = new mb4[]{mb4Var, mb4Var2};
    }

    public static a8e A(Object obj, Object obj2) {
        a8e a8eVar = (a8e) obj;
        a8e a8eVar2 = (a8e) obj2;
        if (!a8eVar2.isEmpty()) {
            if (!a8eVar.a) {
                a8eVar = a8eVar.b();
            }
            a8eVar.c();
            if (!a8eVar2.isEmpty()) {
                a8eVar.putAll(a8eVar2);
            }
        }
        return a8eVar;
    }

    public static void B(Object obj) {
        a8e a8eVar = (a8e) obj;
    }

    public static final void a(mv mvVar, String str, xt4 xt4Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-54012614);
        if (rv4Var2.d(mvVar.ordinal())) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var2.f(str)) {
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
        if (rv4Var2.f(nq7Var)) {
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
            String A = yqe.A((y3b) b3b.f0.getValue(), rv4Var2);
            oyb oybVar = ((h27) rv4Var2.j(j27.a)).b.h;
            kq7 kq7Var = kq7.a;
            cvb.c(A, zbe.z(kq7Var, 24.0f, 12.0f), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, 48, 0, 131068);
            rv4Var2 = rv4Var;
            nq7 f2 = pna.f(kq7Var, 1.0f);
            hz hzVar = new hz(8.0f, true, new vs(2));
            qu3 qu3Var = mv.f;
            boolean h = rv4Var2.h(qu3Var);
            if ((i9 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z5 = h | z2;
            if ((i9 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z6 = z5 | z3;
            if ((i9 & Token.ASSIGN_MOD) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z7 = z6 | z4;
            Object P = rv4Var2.P();
            if (z7 || P == ax1.a) {
                hq hqVar = new hq(qu3Var, mvVar, xt4Var, str, 15);
                rv4Var2.o0(hqVar);
                P = hqVar;
            }
            jce.d(f2, null, null, false, hzVar, null, null, false, null, (xt4) P, rv4Var2, 24582, 494);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new i31(mvVar, str, xt4Var, nq7Var, i, 26);
        }
    }

    public static final void b(mv mvVar, String str, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-906593016);
        if (rv4Var2.d(mvVar.ordinal())) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var2.f(str)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var2.f(nq7Var)) {
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
            tza tzaVar = j27.a;
            long j = ((h27) rv4Var2.j(tzaVar)).a.p;
            ba5 ba5Var = lre.g;
            nq7 v = nmd.v(nq7Var, j, ba5Var);
            nk0 nk0Var = kh5.a;
            b37 d2 = fu0.d(nk0Var, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, v);
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
            switch (mvVar.ordinal()) {
                case 0:
                    rv4Var2.e0(-2107183182);
                    fu0.a(nmd.v(pna.c, ((h27) rv4Var2.j(tzaVar)).a.r, ba5Var), rv4Var2, 0);
                    rv4Var2.q(false);
                    break;
                case 1:
                    rv4Var2.e0(-897944140);
                    if (!k4b.j0(str)) {
                        rv4Var2.e0(-897921603);
                        do5.a(new zq9(str), r0f.d, false, null, null, null, pna.c, null, rv4Var, 12582960, 892);
                        rv4Var2 = rv4Var;
                        rv4Var2.q(false);
                        z2 = false;
                    } else {
                        z2 = false;
                        rv4Var2.e0(-897657235);
                        nq7 v2 = nmd.v(pna.c, ((h27) rv4Var2.j(tzaVar)).a.r, ba5Var);
                        b37 d3 = fu0.d(nk0Var, false);
                        int hashCode2 = Long.hashCode(rv4Var2.T);
                        xt8 l2 = rv4Var2.l();
                        nq7 p2 = lye.p(rv4Var2, v2);
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
                        nk5.a(rp5.c((wk3) ok3.o.getValue(), rv4Var2, 0), null, pna.n(pu0.a.a(kq7.a, kh5.e), 18.0f), ((h27) rv4Var2.j(tzaVar)).a.s, rv4Var2, 48, 0);
                        rv4Var2 = rv4Var2;
                        rv4Var2.q(true);
                        rv4Var2.q(false);
                    }
                    rv4Var2.q(z2);
                    break;
                case 2:
                    rv4Var2.e0(-2107143869);
                    c(pna.c, rv4Var2, 6);
                    rv4Var2.q(false);
                    break;
                case 3:
                    rv4Var2.e0(-2107140977);
                    dxe.f(pna.c, false, 0.8f, false, rv4Var2, 438, 8);
                    rv4Var2.q(false);
                    break;
                case 4:
                    rv4Var2.e0(-2107136721);
                    ie2.d(pna.c, false, 0.8f, false, rv4Var2, 438, 8);
                    rv4Var2.q(false);
                    break;
                case 5:
                    rv4Var2.e0(-2107132300);
                    ade.i(pna.c, false, 0.8f, false, rv4Var2, 438, 8);
                    rv4Var2.q(false);
                    break;
                case 6:
                    rv4Var2.e0(-2107127903);
                    d(pna.c, rv4Var2, 6);
                    rv4Var2.q(false);
                    break;
                case 7:
                    rv4Var2.e0(-2107125007);
                    iue.C(pna.c, false, 0.8f, false, rv4Var2, 438, 8);
                    rv4Var2.q(false);
                    break;
                case 8:
                    rv4Var2.e0(-2107120689);
                    gwe.b(pna.c, false, 0.8f, false, rv4Var2, 438, 8);
                    rv4Var2.q(false);
                    break;
                case 9:
                    rv4Var2.e0(-2107116400);
                    kwe.e(pna.c, false, 0.8f, false, rv4Var2, 438, 8);
                    rv4Var2.q(false);
                    break;
                default:
                    throw rs8.b(-2107182823, rv4Var2, false);
            }
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ax(mvVar, str, nq7Var, i, 29);
        }
    }

    public static final void c(nq7 nq7Var, rv4 rv4Var, int i) {
        boolean z;
        rv4Var.g0(-1134043616);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            tza tzaVar = j27.a;
            long j = ((h27) rv4Var.j(tzaVar)).a.a;
            long j2 = ((h27) rv4Var.j(tzaVar)).a.f;
            long j3 = ((h27) rv4Var.j(tzaVar)).a.j;
            boolean e2 = rv4Var.e(j) | rv4Var.e(j3) | rv4Var.e(j2);
            Object P = rv4Var.P();
            if (e2 || P == ax1.a) {
                ie7 ie7Var = new ie7(0, j, j3, j2);
                rv4Var.o0(ie7Var);
                P = ie7Var;
            }
            bce.a(nq7Var, (xt4) P, rv4Var, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oa(nq7Var, i, 16);
        }
    }

    public static final void d(nq7 nq7Var, rv4 rv4Var, int i) {
        boolean z;
        rv4Var.g0(-1339619456);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            tza tzaVar = j27.a;
            long j = ((h27) rv4Var.j(tzaVar)).a.a;
            long j2 = ((h27) rv4Var.j(tzaVar)).a.f;
            long j3 = ((h27) rv4Var.j(tzaVar)).a.j;
            boolean e2 = rv4Var.e(j) | rv4Var.e(j2) | rv4Var.e(j3);
            Object P = rv4Var.P();
            if (e2 || P == ax1.a) {
                ie7 ie7Var = new ie7(1, j, j2, j3);
                rv4Var.o0(ie7Var);
                P = ie7Var;
            }
            bce.a(nq7Var, (xt4) P, rv4Var, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oa(nq7Var, i, 15);
        }
    }

    public static final void e(boolean z, mv mvVar, String str, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        mvVar.getClass();
        str.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var.g0(-638739068);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var.d(mvVar.ordinal())) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var.f(str)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var.h(xt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(xt4Var2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((i11 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i11 & 1, z2)) {
            if (ikd.a(rv4Var)) {
                rv4Var.e0(-1970208420);
                hc2.b(pna.c, null, jce.E(-639612749, new wd7(z, xt4Var, mvVar, str, xt4Var2), rv4Var), rv4Var, 3078, 6);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1969445138);
                nmd.f(z, xt4Var, null, true, 0L, 0L, nae.e, 0L, nae.e, jce.E(1164280399, new i31(mvVar, str, xt4Var2, xt4Var, 25), rv4Var), rv4Var, (i11 & 14) | 805309440 | ((i11 >> 6) & Token.ASSIGN_MOD), 500);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new b62(z, mvVar, str, xt4Var, xt4Var2, i, 3);
        }
    }

    public static final void f(boolean z, int i, boolean z2, xt4 xt4Var, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, int i2) {
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        xt4Var.getClass();
        vt4Var.getClass();
        vt4Var2.getClass();
        rv4Var.g0(-899915257);
        if ((i2 & 6) == 0) {
            z3 = z;
            if (rv4Var.g(z3)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i2;
        } else {
            z3 = z;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.d(i)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.g(z2)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i3 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var.h(xt4Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var.h(vt4Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((196608 & i2) == 0) {
            if (rv4Var.h(vt4Var2)) {
                i4 = 131072;
            } else {
                i4 = Parser.ARGC_LIMIT;
            }
            i3 |= i4;
        }
        if ((74899 & i3) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (rv4Var.U(i3 & 1, z4)) {
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = new rg8(14);
                rv4Var.o0(P);
            }
            xb.a(z3, (xt4) P, jce.E(862456094, new zr(5, vt4Var2), rv4Var), null, null, jce.E(1570965563, new zr(6, vt4Var), rv4Var), kxe.c, null, 0L, 0L, nae.e, null, null, null, false, false, jce.E(-1013147421, new pf0(i, xt4Var, z2), rv4Var), rv4Var, (i3 & 14) | 1769904, 1794048, 16280);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ud7(z, i, z2, xt4Var, vt4Var, vt4Var2, i2);
        }
    }

    public static nq7 g(nq7 nq7Var, arc arcVar, int i) {
        lf4 lf4Var = arcVar;
        if ((i & 1) != 0) {
            rk9 rk9Var = qed.a;
            lf4Var = tte.v(nae.e, 400.0f, 1, new zy5(4294967297L));
        }
        return tte.l(nq7Var).a0(new ena(lf4Var));
    }

    public static boolean h(float f2, Float f3) {
        if (f3 != null && f2 == f3.floatValue()) {
            return true;
        }
        return false;
    }

    public static boolean i(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static final String j(mv mvVar, rv4 rv4Var) {
        mvVar.getClass();
        switch (mvVar.ordinal()) {
            case 0:
                rv4Var.e0(257197487);
                String A = yqe.A((y3b) b3b.k0.getValue(), rv4Var);
                rv4Var.q(false);
                return A;
            case 1:
                rv4Var.e0(257199976);
                String A2 = yqe.A((y3b) v1b.m0.getValue(), rv4Var);
                rv4Var.q(false);
                return A2;
            case 2:
                rv4Var.e0(257202322);
                String A3 = yqe.A((y3b) b3b.g0.getValue(), rv4Var);
                rv4Var.q(false);
                return A3;
            case 3:
                rv4Var.e0(257204879);
                String A4 = yqe.A((y3b) b3b.h0.getValue(), rv4Var);
                rv4Var.q(false);
                return A4;
            case 4:
                rv4Var.e0(257207343);
                String A5 = yqe.A((y3b) b3b.j0.getValue(), rv4Var);
                rv4Var.q(false);
                return A5;
            case 5:
                rv4Var.e0(257209972);
                String A6 = yqe.A((y3b) b3b.l0.getValue(), rv4Var);
                rv4Var.q(false);
                return A6;
            case 6:
                rv4Var.e0(257212624);
                String A7 = yqe.A((y3b) b3b.m0.getValue(), rv4Var);
                rv4Var.q(false);
                return A7;
            case 7:
                rv4Var.e0(257215185);
                String A8 = yqe.A((y3b) b3b.n0.getValue(), rv4Var);
                rv4Var.q(false);
                return A8;
            case 8:
                rv4Var.e0(257217711);
                String A9 = yqe.A((y3b) b3b.o0.getValue(), rv4Var);
                rv4Var.q(false);
                return A9;
            case 9:
                rv4Var.e0(257220208);
                String A10 = yqe.A((y3b) b3b.p0.getValue(), rv4Var);
                rv4Var.q(false);
                return A10;
            default:
                throw rs8.b(257196774, rv4Var, false);
        }
    }

    public static final void k(View view) {
        view.getClass();
        c9a O = h9a.O(new ui(view, null, 4));
        while (O.hasNext()) {
            ArrayList arrayList = o((View) O.next()).a;
            for (int x = tl1.x(arrayList); -1 < x; x--) {
                ((scd) arrayList.get(x)).a.e();
            }
        }
    }

    public static int l(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        if (i == i2) {
            return 0;
        }
        return 1;
    }

    public static int m(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        return 1;
    }

    public static final Object n(pv7 pv7Var, e49 e49Var, Serializable serializable) {
        pv7Var.getClass();
        e49Var.getClass();
        Object c2 = pv7Var.c(e49Var);
        if (c2 == null) {
            return serializable;
        }
        return c2;
    }

    public static final y19 o(View view) {
        y19 y19Var = (y19) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (y19Var == null) {
            y19 y19Var2 = new y19();
            view.setTag(R.id.pooling_container_listener_holder_tag, y19Var2);
            return y19Var2;
        }
        return y19Var;
    }

    public static final void p(d82 d82Var, Throwable th) {
        if (th instanceof sa3) {
            th = ((sa3) th).a;
        }
        try {
            g82 g82Var = (g82) d82Var.get(p40.d);
            if (g82Var != null) {
                g82Var.S(d82Var, th);
            } else {
                b16.P(d82Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                pye.e(runtimeException, th);
                th = runtimeException;
            }
            b16.P(d82Var, th);
        }
    }

    public static final boolean q(long j) {
        return !zy5.b(j, -9223372034707292160L);
    }

    public static final ArrayList r(List list, List list2, float f2) {
        int max = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(max);
        for (int i = 0; i < max; i++) {
            arrayList.add(new zl1(sve.q(f2, ((zl1) list.get(Math.min(i, list.size() - 1))).a, ((zl1) list2.get(Math.min(i, list2.size() - 1))).a)));
        }
        return arrayList;
    }

    public static final ArrayList s(List list, List list2, float f2) {
        if (list2 != null && list != null) {
            int max = Math.max(list.size(), list2.size());
            ArrayList arrayList = new ArrayList(max);
            for (int i = 0; i < max; i++) {
                arrayList.add(Float.valueOf(b23.o(((Number) list.get(Math.min(i, list.size() - 1))).floatValue(), ((Number) list2.get(Math.min(i, list2.size() - 1))).floatValue(), f2)));
            }
            return arrayList;
        }
        return null;
    }

    public static final long t(float f2, long j, long j2) {
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 && (((9187343241974906880L ^ (j2 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) {
            return oue.E(f2, j, j2);
        }
        if (f2 < 0.5f) {
            return j;
        }
        return j2;
    }

    public static final f1d u(zx5 zx5Var, w9c w9cVar) {
        zx5Var.getClass();
        ZoneRules rules = w9cVar.a.getRules();
        Instant ofEpochSecond = Instant.ofEpochSecond(zx5Var.a, zx5Var.b);
        ofEpochSecond.getClass();
        return new f1d(rules.getOffset(ofEpochSecond));
    }

    public static void v(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static void w(String str) {
        gt1 gt1Var = new gt1(hl5.n("lateinit property ", str, " has not been initialized"), 11);
        v(gt1Var, c16.class.getName());
        throw gt1Var;
    }

    public static final xt6 x(zx5 zx5Var, w9c w9cVar) {
        zx5Var.getClass();
        try {
            Instant ofEpochSecond = Instant.ofEpochSecond(zx5Var.a, zx5Var.b);
            ofEpochSecond.getClass();
            return new xt6(LocalDateTime.ofInstant(ofEpochSecond, w9cVar.a));
        } catch (DateTimeException e2) {
            throw new gt1(1, e2);
        }
    }

    public static final jea y(hy0 hy0Var) {
        if (hy0Var instanceof jea) {
            return (jea) hy0Var;
        }
        if (hy0Var instanceof esa) {
            long j = ((esa) hy0Var).a;
            return ox9.B(tl1.B(new zl1(j), new zl1(j)), nae.e, 14);
        }
        xk5.o();
        return null;
    }

    public static final cia z(vl6 vl6Var, String str) {
        String str2 = vl6Var.q;
        return new cia(vl6Var.a, str, vl6Var.d, vl6Var.l, vl6Var.j, vl6Var.p, vl6Var.u, vl6Var.D, (int) kte.g(vl6Var), vl6Var.G, str2);
    }
}
