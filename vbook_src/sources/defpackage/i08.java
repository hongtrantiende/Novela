package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i08  reason: default package */
/* loaded from: classes.dex */
public final class i08 extends j08 {
    public final xz7 a;
    public final int b;

    public i08(xz7 xz7Var, int i) {
        xz7Var.getClass();
        this.a = xz7Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && i08.class == obj.getClass()) {
                i08 i08Var = (i08) obj;
                if (this.b == i08Var.b && c16.i(this.a, i08Var.a)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InProgress(latestEvent=");
        sb.append(this.a);
        sb.append(", direction=");
        return hl5.p(sb, this.b, ')');
    }
}
