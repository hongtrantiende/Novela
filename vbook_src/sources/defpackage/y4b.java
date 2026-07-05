package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y4b  reason: default package */
/* loaded from: classes.dex */
public final class y4b extends z4b {
    @Override // defpackage.ex3
    public final int a() {
        return this.a.a() * 3;
    }

    @Override // defpackage.z4b
    public final boolean g(cp3 cp3Var, y28 y28Var) {
        y28 y28Var2;
        cp3Var.getClass();
        y28Var.getClass();
        if (cp3Var == y28Var) {
            return false;
        }
        cp3 cp3Var2 = y28Var.a;
        if (cp3Var2 != null) {
            y28Var2 = cp3Var2.m();
        } else {
            y28Var2 = y28Var;
        }
        while (y28Var2 != null && y28Var2 != y28Var) {
            if (h(cp3Var, y28Var2)) {
                return true;
            }
            y28Var2 = y28Var2.s();
        }
        return false;
    }

    public final String toString() {
        return this.a + " ~ ";
    }
}
