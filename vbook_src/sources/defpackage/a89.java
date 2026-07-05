package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a89  reason: default package */
/* loaded from: classes.dex */
public final class a89 {
    public final int a;
    public final boolean b;

    public a89(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && a89.class == obj.getClass()) {
                a89 a89Var = (a89) obj;
                if (this.a == a89Var.a && this.b == a89Var.b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
