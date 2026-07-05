package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x4b  reason: default package */
/* loaded from: classes.dex */
public final class x4b extends z4b {
    @Override // defpackage.ex3
    public final int a() {
        return this.a.a() + 2;
    }

    @Override // defpackage.z4b
    public final boolean g(cp3 cp3Var, y28 y28Var) {
        y28 y28Var2;
        cp3Var.getClass();
        y28Var.getClass();
        if (cp3Var == y28Var) {
            return false;
        }
        if (!this.b) {
            while (true) {
                y28Var = y28Var.B();
                if (y28Var != null) {
                    if (y28Var instanceof cp3) {
                        y28Var2 = (cp3) y28Var;
                        break;
                    }
                } else {
                    y28Var2 = null;
                    break;
                }
            }
        } else {
            y28Var2 = y28Var.B();
        }
        if (y28Var2 == null || !h(cp3Var, y28Var2)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.a + " + ";
    }
}
