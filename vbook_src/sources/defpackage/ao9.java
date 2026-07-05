package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ao9  reason: default package */
/* loaded from: classes.dex */
public final class ao9 {
    public static final ao9 c = new ao9(0, false);
    public final int a;
    public final boolean b;

    public ao9(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ao9.class == obj.getClass()) {
                ao9 ao9Var = (ao9) obj;
                if (this.a == ao9Var.a && this.b == ao9Var.b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
