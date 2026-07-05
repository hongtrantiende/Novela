package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r32  reason: default package */
/* loaded from: classes3.dex */
public final class r32 {
    public final ora a = new ora();

    public static void b(r32 r32Var, lu4 lu4Var, tu1 tu1Var, vt4 vt4Var, int i) {
        if ((i & 8) != 0) {
            tu1Var = null;
        }
        r32Var.a.add(new tu1(new g83(lu4Var, r32Var, tu1Var, vt4Var), true, -1789283891));
    }

    public final void a(n32 n32Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        rv4Var.g0(-798501095);
        if (rv4Var.f(n32Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (rv4Var.f(this)) {
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
            ora oraVar = this.a;
            int size = oraVar.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((mu4) oraVar.get(i6)).c(n32Var, rv4Var, Integer.valueOf(i5 & 14));
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ah7(this, n32Var, i, 16);
        }
    }
}
