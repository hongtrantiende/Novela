package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vh  reason: default package */
/* loaded from: classes.dex */
public abstract class vh {
    public static final float a = (25.0f * 2.0f) / 2.4142137f;

    public static final void a(l88 l88Var, nq7 nq7Var, long j, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        rv4Var.g0(1776202187);
        if (rv4Var.f(l88Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i;
        if (rv4Var.f(nq7Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0 && rv4Var.e(j)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i7 |= i5;
        }
        boolean z2 = true;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                if ((i2 & 4) != 0) {
                    i7 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                i7 &= -897;
                j = 9205357640488583168L;
            }
            rv4Var.r();
            int i8 = i7 & 14;
            if (i8 != 4) {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new u0(l88Var, 3);
                rv4Var.o0(P);
            }
            qre.f(l88Var, kh5.b, jce.E(-1653527038, new qh(j, y7a.c(nq7Var, false, (xt4) P)), rv4Var), rv4Var, i8 | 432);
        } else {
            rv4Var.X();
        }
        long j2 = j;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new rh(l88Var, nq7Var, j2, i, i2);
        }
    }

    public static final void b(int i, int i2, rv4 rv4Var, nq7 nq7Var) {
        int i3;
        int i4;
        boolean z;
        rv4Var.g0(694251107);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i4 = i | 6;
        } else {
            if (rv4Var.f(nq7Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i4 = i3 | i;
        }
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i4 & 1, z)) {
            if (i5 != 0) {
                nq7Var = kq7.a;
            }
            xbe.i(rv4Var, ote.s(pna.p(nq7Var, a, 25.0f), new th(((wxb) rv4Var.j(xxb.a)).a, 0)));
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sh(nq7Var, i, i2);
        }
    }
}
