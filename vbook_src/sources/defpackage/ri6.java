package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ri6 */
/* loaded from: classes.dex */
public final class ri6 extends npe {
    public final kj g = new kj(8, false);
    public vu7 h;

    public ri6(xt4 xt4Var) {
        xt4Var.invoke(this);
    }

    public static /* synthetic */ void A(ri6 ri6Var, int i, xt4 xt4Var, tu1 tu1Var, int i2) {
        if ((i2 & 2) != 0) {
            xt4Var = null;
        }
        ri6Var.z(i, xt4Var, m74.G, tu1Var);
    }

    public static void B(ri6 ri6Var, Object obj, tu1 tu1Var) {
        kj kjVar = ri6Var.g;
        vu7 vu7Var = ri6Var.h;
        if (vu7Var == null) {
            vu7Var = new vu7();
            ri6Var.h = vu7Var;
        }
        vu7Var.a(kjVar.a);
        ri6Var.x(obj, null, new tu1(new qe1(tu1Var, kjVar.a, 1), true, -1588696110));
    }

    public static /* synthetic */ void y(ri6 ri6Var, String str, mu4 mu4Var, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        ri6Var.x(str, null, mu4Var);
    }

    @Override // defpackage.npe
    public final kj r() {
        return this.g;
    }

    public final void x(Object obj, String str, mu4 mu4Var) {
        fo4 fo4Var;
        if (obj != null) {
            fo4Var = new fo4(obj, 17);
        } else {
            fo4Var = null;
        }
        this.g.b(1, new qi6(fo4Var, new fo4(str, 17), new tu1(new uf6(mu4Var, 1), true, -857469575)));
    }

    public final void z(int i, xt4 xt4Var, xt4 xt4Var2, tu1 tu1Var) {
        this.g.b(i, new qi6(xt4Var, xt4Var2, tu1Var));
    }
}
