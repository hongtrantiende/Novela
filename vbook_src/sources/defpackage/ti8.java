package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ti8  reason: default package */
/* loaded from: classes.dex */
public final class ti8 {
    public static final ti8 c = new ti8(si8.a, ri8.a);
    public final si8 a;
    public final ri8 b;

    public ti8(si8 si8Var, ri8 ri8Var) {
        this.a = si8Var;
        this.b = ri8Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ti8) {
                ti8 ti8Var = (ti8) obj;
                if (this.a != ti8Var.a || this.b != ti8Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PagerAlignment(vertical=" + this.a + ", horizontal=" + this.b + ")";
    }
}
