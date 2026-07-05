package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t38  reason: default package */
/* loaded from: classes.dex */
public interface t38 {
    default void u(y28 y28Var) {
        int i;
        y28Var.getClass();
        y28 y28Var2 = y28Var;
        int i2 = 0;
        while (y28Var2 != null) {
            y28 y28Var3 = y28Var2.a;
            if (y28Var3 != null) {
                i = y28Var3.g();
            } else {
                i = 0;
            }
            y28 t = y28Var2.t();
            v(y28Var2, i2);
            if (y28Var3 != null && y28Var2.a == null) {
                if (i == y28Var3.g()) {
                    y28Var2 = (y28) ((ap3) y28Var3.l()).get(y28Var2.G());
                } else if (t == null) {
                    while (true) {
                        i2--;
                        a(y28Var3, i2);
                        if (y28Var3 != y28Var) {
                            if (y28Var3.t() != null) {
                                y28Var3 = y28Var3.t();
                                break;
                            }
                            y28Var3 = y28Var3.a;
                            if (y28Var3 == null) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (y28Var3 != y28Var && y28Var3 != null) {
                        y28Var2 = y28Var3;
                    } else {
                        return;
                    }
                } else {
                    y28Var2 = t;
                }
            } else if (y28Var2.g() > 0) {
                y28Var2 = (y28) y28Var2.l().get(0);
                i2++;
            } else {
                while (y28Var2 != null) {
                    if (y28Var2.t() == null && i2 > 0) {
                        a(y28Var2, i2);
                        y28Var2 = y28Var2.a;
                        i2--;
                    } else {
                        a(y28Var2, i2);
                        if (y28Var2 == y28Var) {
                            return;
                        }
                        y28Var2 = y28Var2.t();
                    }
                }
                throw new Exception("as depth > 0, will have parent");
            }
        }
    }

    void v(y28 y28Var, int i);

    default void a(y28 y28Var, int i) {
    }
}
