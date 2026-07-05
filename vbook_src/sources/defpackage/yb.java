package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yb  reason: default package */
/* loaded from: classes3.dex */
public abstract class yb {
    public static final tza a = new f99(new i(5));

    public static final void a(uxa uxaVar, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        uxaVar.getClass();
        rv4Var.g0(732710292);
        if (rv4Var.f(uxaVar)) {
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
            xoe.d(uxaVar, nq7Var, rv4Var, i5 & Token.ELSE);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ah7(uxaVar, nq7Var, i, 4);
        }
    }
}
