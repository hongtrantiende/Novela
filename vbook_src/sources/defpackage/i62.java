package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i62  reason: default package */
/* loaded from: classes.dex */
public abstract class i62 {
    public static final tza a = new f99(new cd1(20));

    public static final void a(vt4 vt4Var, rk9 rk9Var, xt4 xt4Var, boolean z, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        xt4 xt4Var3;
        boolean z2;
        rk9 rk9Var2;
        xt4 xt4Var4;
        vt4Var.getClass();
        rk9Var.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var.g0(1507002163);
        if (rv4Var.f(rk9Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i6 = i2 | i;
        if (rv4Var.h(xt4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i7 = i6 | i3;
        if (rv4Var.g(z)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(xt4Var2)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        if (((i8 | i5) & 9363) == 9362 && rv4Var.E()) {
            rv4Var.X();
            xt4Var3 = xt4Var2;
            z2 = z;
            xt4Var4 = xt4Var;
            rk9Var2 = rk9Var;
        } else {
            List list = ((ed2) rv4Var.j(fd2.b)).e;
            xt4Var3 = xt4Var2;
            obc obcVar = new obc(xt4Var3, z, list, rk9Var, xt4Var);
            z2 = z;
            rk9Var2 = rk9Var;
            xt4Var4 = xt4Var;
            o28.n(vt4Var, list.size() + 1, jce.E(1826395663, obcVar, rv4Var), rv4Var, 390);
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new b62(vt4Var, rk9Var2, xt4Var4, z2, xt4Var3, i);
        }
    }

    public static final void b(nq7 nq7Var, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        rv4Var.g0(280500352);
        if (rv4Var.f(nq7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 19) == 18 && rv4Var.E()) {
            rv4Var.X();
        } else {
            su9 su9Var = uu9.a;
            tza tzaVar = j27.a;
            v9b.a(nq7Var, su9Var, zl1.b(0.8f, ((h27) rv4Var.j(tzaVar)).a.p), rm1.b(((h27) rv4Var.j(tzaVar)).a.p, rv4Var), nae.e, 4.0f, null, jce.E(2051005467, new cg(tu1Var, 1), rv4Var), rv4Var, (i3 & 14) | 12779520, 80);
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new a62(nq7Var, tu1Var, i, 0);
        }
    }

    public static final void c(boolean z, zc2 zc2Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        zc2Var.getClass();
        rv4Var.g0(613399259);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(zc2Var)) {
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
        if ((i2 & Token.EXPR_VOID) == 146 && rv4Var.E()) {
            rv4Var.X();
        } else {
            pye.a(a.a(Boolean.valueOf(z)), jce.E(-190648805, new aw0(1, nq7Var, zc2Var), rv4Var), rv4Var, 56);
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new z52(i, 0, zc2Var, nq7Var, z);
        }
    }

    public static final void d(wc2 wc2Var, boolean z, vt4 vt4Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        long j;
        nq7 nq7Var2;
        wc2Var.getClass();
        vt4Var.getClass();
        rv4Var.g0(-988307538);
        if (rv4Var.f(wc2Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.g(z)) {
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
        int i7 = i6 | i4 | 3072;
        if ((i7 & 1171) == 1170 && rv4Var.E()) {
            rv4Var.X();
            nq7Var2 = nq7Var;
        } else {
            if (!z) {
                rv4Var.e0(-575764491);
                j = ((zl1) rv4Var.j(r12.a)).a;
                rv4Var.q(false);
            } else {
                rv4Var.e0(-575762986);
                j = ((h27) rv4Var.j(j27.a)).a.j;
                rv4Var.q(false);
            }
            nq7Var2 = kq7.a;
            mwe.a(vt4Var, nq7Var2, false, null, jce.E(-666678735, new aw0(2, wc2Var, wma.a(j, null, rv4Var, 0, 14)), rv4Var), rv4Var, ((i7 >> 6) & 14) | 196656, 28);
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new rd0(wc2Var, z, vt4Var, nq7Var2, i, 4);
        }
    }

    public static final void e(vt4 vt4Var, List list, wc2 wc2Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        vt4Var.getClass();
        wc2Var.getClass();
        xt4Var.getClass();
        rv4Var.g0(2098499478);
        if (rv4Var.h(list)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i5 = i2 | i;
        if (rv4Var.f(wc2Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i6 = i5 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        if (((i6 | i4) & 1171) == 1170 && rv4Var.E()) {
            rv4Var.X();
        } else {
            o28.n(vt4Var, list.size(), jce.E(-21915334, new h62(list, wc2Var, xt4Var), rv4Var), rv4Var, 390);
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new i31(vt4Var, list, wc2Var, xt4Var, i);
        }
    }
}
