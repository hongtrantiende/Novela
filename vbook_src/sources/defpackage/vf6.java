package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vf6 */
/* loaded from: classes.dex */
public final class vf6 extends npe {
    public static final j35 j = new j35(7);
    public final mg6 g = new mg6(this);
    public final kj h = new kj(8, false);
    public boolean i;

    public vf6(xt4 xt4Var) {
        xt4Var.invoke(this);
    }

    public static /* synthetic */ void A(vf6 vf6Var, int i, xt4 xt4Var, xt4 xt4Var2, tu1 tu1Var, int i2) {
        if ((i2 & 2) != 0) {
            xt4Var = null;
        }
        xt4 xt4Var3 = xt4Var;
        if ((i2 & 8) != 0) {
            xt4Var2 = m74.E;
        }
        vf6Var.z(i, xt4Var3, null, xt4Var2, tu1Var);
    }

    public static /* synthetic */ void y(vf6 vf6Var, Object obj, xt4 xt4Var, mu4 mu4Var, int i) {
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            xt4Var = null;
        }
        vf6Var.x(obj, xt4Var, null, mu4Var);
    }

    @Override // defpackage.npe
    public final kj r() {
        return this.h;
    }

    public final void x(Object obj, xt4 xt4Var, String str, mu4 mu4Var) {
        fo4 fo4Var;
        lu4 lu4Var;
        if (obj != null) {
            fo4Var = new fo4(obj, 17);
        } else {
            fo4Var = null;
        }
        if (xt4Var != null) {
            lu4Var = new id1(xt4Var, 6, (byte) 0);
        } else {
            lu4Var = j;
        }
        this.h.b(1, new tf6(fo4Var, lu4Var, new fo4(str, 17), new tu1(new uf6(mu4Var, 0), true, -291643851)));
        if (xt4Var != null) {
            this.i = true;
        }
    }

    public final void z(int i, xt4 xt4Var, lu4 lu4Var, xt4 xt4Var2, tu1 tu1Var) {
        lu4 lu4Var2;
        if (lu4Var == null) {
            lu4Var2 = j;
        } else {
            lu4Var2 = lu4Var;
        }
        this.h.b(i, new tf6(xt4Var, lu4Var2, xt4Var2, tu1Var));
        if (lu4Var != null) {
            this.i = true;
        }
    }
}
