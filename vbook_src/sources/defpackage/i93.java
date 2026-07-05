package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i93  reason: default package */
/* loaded from: classes3.dex */
public final class i93 {
    public final boolean a;
    public final l54 b;

    public i93(boolean z, l54 l54Var) {
        this.a = z;
        this.b = l54Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i93) {
                i93 i93Var = (i93) obj;
                if (this.a != i93Var.a || !c16.i(this.b, i93Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Boolean.hashCode(this.a) * 31;
        l54 l54Var = this.b;
        if (l54Var == null) {
            hashCode = 0;
        } else {
            hashCode = l54Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "DiscoveryState(isLoading=" + this.a + ", currentExtension=" + this.b + ")";
    }
}
