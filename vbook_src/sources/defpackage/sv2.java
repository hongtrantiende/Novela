package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sv2  reason: default package */
/* loaded from: classes.dex */
public final class sv2 {
    public static final sv2 a = new Object();

    public final void a(wz7 wz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4Var.g0(882141204);
        if (rv4Var.f(wz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            v9b.a(wz7Var.a, null, wz7Var.b, wz7Var.c, wz7Var.d, nae.e, null, jce.E(1991263321, new sj(wz7Var, 6), rv4Var), rv4Var, 12582912, 98);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ah7(this, wz7Var, i, 20);
        }
    }
}
