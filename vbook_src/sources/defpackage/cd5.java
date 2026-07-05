package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cd5  reason: default package */
/* loaded from: classes3.dex */
public final class cd5 {
    public final sa5 a;
    public final int b;

    public cd5(sa5 sa5Var, int i) {
        this.a = sa5Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cd5) {
                cd5 cd5Var = (cd5) obj;
                if (!this.a.equals(cd5Var.a) || this.b != cd5Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ParsedAttribute(attribute=" + this.a + ", nextIndex=" + this.b + ")";
    }
}
