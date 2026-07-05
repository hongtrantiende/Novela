package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k6b  reason: default package */
/* loaded from: classes.dex */
public abstract class k6b {
    public static final mp8 a = new mp8(4);
    public static final Object b = new Object();

    public static final void a(nq7 nq7Var, lu4 lu4Var, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        rv4Var.g0(-1298353104);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(lu4Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            if (i6 != 0) {
                nq7Var = kq7.a;
            }
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = new o6b(zj1.D);
                rv4Var.o0(P);
            }
            b((o6b) P, nq7Var, lu4Var, rv4Var, (i3 << 3) & 1008);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new i6b(nq7Var, lu4Var, i, i2);
        }
    }

    public static final void b(o6b o6bVar, nq7 nq7Var, lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        rv4Var.g0(-511989831);
        if ((i & 6) == 0) {
            if (rv4Var.h(o6bVar)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(lu4Var)) {
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
            int hashCode = Long.hashCode(rv4Var.T);
            pv4 m = p17.m(rv4Var);
            nq7 p = lye.p(rv4Var, nq7Var);
            xt8 l = rv4Var.l();
            zx1 zx1Var = zx1.Q;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(o6bVar.c, rv4Var, o6bVar);
            jce.F(o6bVar.d, rv4Var, m);
            jce.F(o6bVar.e, rv4Var, lu4Var);
            rw1.k.getClass();
            jce.F(qw1.e, rv4Var, l);
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            rv4Var.q(true);
            if (!rv4Var.E()) {
                rv4Var.e0(-1259245908);
                boolean h = rv4Var.h(o6bVar);
                Object P = rv4Var.P();
                if (h || P == ax1.a) {
                    P = new ik(o6bVar, 26);
                    rv4Var.o0(P);
                }
                yte.k((vt4) P, rv4Var);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1259187287);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new j6b(o6bVar, nq7Var, lu4Var, i);
        }
    }
}
