package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sf0  reason: default package */
/* loaded from: classes3.dex */
public abstract class sf0 {
    public static final tza a = new f99(new mf0(1));

    public static final void a(boolean z, vt4 vt4Var, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        vt4Var.getClass();
        rv4Var.g0(-1457805704);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i4 = i | 6;
        } else {
            if (rv4Var.g(z)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i4 = i3 | i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(vt4Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        boolean z3 = true;
        if ((i4 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i4 & 1, z2)) {
            if (i6 != 0) {
                z = true;
            }
            Object obj = (ws2) rv4Var.j(a);
            Object D = yae.D(vt4Var, rv4Var);
            Boolean valueOf = Boolean.valueOf(z);
            if ((i4 & 14) != 4) {
                z3 = false;
            }
            boolean f = z3 | rv4Var.f(D) | rv4Var.h(obj);
            Object P = rv4Var.P();
            Object obj2 = ax1.a;
            if (f || P == obj2) {
                P = new lf0(z, obj, D, 0);
                rv4Var.o0(P);
            }
            yte.c(valueOf, obj, (xt4) P, rv4Var);
            Object[] objArr = new Object[0];
            Object P2 = rv4Var.P();
            if (P2 == obj2) {
                P2 = new mf0(0);
                rv4Var.o0(P2);
            }
            aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P2, rv4Var, 48);
            boolean f2 = rv4Var.f(aw7Var);
            Object P3 = rv4Var.P();
            if (f2 || P3 == obj2) {
                P3 = new s7(aw7Var, 4);
                rv4Var.o0(P3);
            }
            tte.d(pvc.a, null, (xt4) P3, rv4Var, 6);
            if (((Boolean) aw7Var.getValue()).booleanValue()) {
                rv4Var.e0(1220253336);
                zxe.e(z, vt4Var, rv4Var, i4 & Token.ELSE);
                rv4Var.q(false);
            } else {
                rv4Var.e0(1220301386);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        boolean z4 = z;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new of0(z4, vt4Var, i, i2, 0);
        }
    }
}
