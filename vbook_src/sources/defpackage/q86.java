package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q86  reason: default package */
/* loaded from: classes.dex */
public final class q86 {
    public static final q86 c = new q86(null, null, 63);
    public final xt4 a;
    public final xt4 b;

    public q86(xt4 xt4Var, xt4 xt4Var2, int i) {
        xt4Var = (i & 4) != 0 ? null : xt4Var;
        xt4Var2 = (i & 16) != 0 ? null : xt4Var2;
        this.a = xt4Var;
        this.b = xt4Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q86) {
            q86 q86Var = (q86) obj;
            if (this.a == q86Var.a && this.b == q86Var.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        xt4 xt4Var = this.a;
        if (xt4Var != null) {
            i = xt4Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 961;
        xt4 xt4Var2 = this.b;
        if (xt4Var2 != null) {
            i2 = xt4Var2.hashCode();
        }
        return (i3 + i2) * 31;
    }
}
