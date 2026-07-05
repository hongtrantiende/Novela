package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j50  reason: default package */
/* loaded from: classes.dex */
public final class j50 {
    public static final j50 d = new Object().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public j50(i50 i50Var) {
        this.a = i50Var.a;
        this.b = i50Var.b;
        this.c = i50Var.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && j50.class == obj.getClass()) {
                j50 j50Var = (j50) obj;
                if (this.a == j50Var.a && this.b == j50Var.b && this.c == j50Var.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
