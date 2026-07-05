package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cma  reason: default package */
/* loaded from: classes.dex */
public abstract class cma {
    public static final List a = tl1.B(new zl1(sve.b(1073741824)), new zl1(sve.b(0)));
    public static final float b = 18.0f;

    public static final void a(h2a h2aVar, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        rv4Var.g0(1573419969);
        if ((i & 6) == 0) {
            if (rv4Var.f(h2aVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        boolean z3 = false;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            fi8 f = h2aVar.f();
            if (f == fi8.b) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean d = rv4Var.d(f.ordinal()) | rv4Var.g(z2);
            if ((i2 & 14) == 4) {
                z3 = true;
            }
            boolean z4 = d | z3;
            Object P = rv4Var.P();
            if (z4 || P == ax1.a) {
                P = new lf0(f, z2, h2aVar);
                rv4Var.o0(P);
            }
            bce.a(nq7Var, (xt4) P, rv4Var, (i2 >> 3) & 14);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new z82(h2aVar, nq7Var, i, 5);
        }
    }
}
