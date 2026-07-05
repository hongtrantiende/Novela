package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x17  reason: default package */
/* loaded from: classes.dex */
public final class x17 {
    public final String a;
    public final ty5 b;

    public x17(String str, ty5 ty5Var) {
        this.a = str;
        this.b = ty5Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof x17) {
                x17 x17Var = (x17) obj;
                if (!this.a.equals(x17Var.a) || !this.b.equals(x17Var.b)) {
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
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
