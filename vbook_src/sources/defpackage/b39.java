package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b39  reason: default package */
/* loaded from: classes3.dex */
public abstract class b39 {
    public static final /* synthetic */ int a = 0;

    static {
        new f99(new sc8(27));
    }

    public static final void a(tu1 tu1Var, rv4 rv4Var, int i) {
        boolean z;
        rv4Var.g0(442516910);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            rv4Var.e0(1766838549);
            rv4Var.q(false);
            rv4Var.e0(1767392772);
            tu1Var.invoke(rv4Var, 6);
            rv4Var.q(false);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new x0a(i, 14, tu1Var);
        }
    }
}
