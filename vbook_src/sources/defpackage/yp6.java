package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yp6  reason: default package */
/* loaded from: classes.dex */
public final class yp6 {
    public final boolean a;
    public final a6b b;

    public yp6(boolean z, a6b a6bVar) {
        this.a = z;
        this.b = a6bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yp6) {
                yp6 yp6Var = (yp6) obj;
                if (this.a != yp6Var.a || this.b != yp6Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "LinkToolbarButtonPresentation(enabled=" + this.a + ", status=" + this.b + ")";
    }
}
