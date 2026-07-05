package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pha  reason: default package */
/* loaded from: classes.dex */
public abstract class pha {
    public static final gxa a = tte.v(nae.e, 400.0f, 1, qed.a);
    public static final mha b = new Object();
    public static final tv7 c = new tv7();

    public static final void a(nq7 nq7Var, tu1 tu1Var, rv4 rv4Var, int i) {
        boolean z;
        rv4Var.g0(646379026);
        int i2 = i | 6;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            b(jce.E(1948801580, new nha(tu1Var), rv4Var), rv4Var, 6);
            nq7Var = kq7.a;
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new jh(i, 5, tu1Var, nq7Var);
        }
    }

    public static final void b(tu1 tu1Var, rv4 rv4Var, int i) {
        boolean z;
        rv4Var.g0(1908320054);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            fxe.g(jce.E(2062852661, new oha(tu1Var, 0), rv4Var), rv4Var, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new az6(i, 1, tu1Var);
        }
    }
}
