package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ok5  reason: default package */
/* loaded from: classes3.dex */
public final class ok5 {
    public final long a;
    public final float b;
    public final af0 c;
    public final boolean d;

    public ok5(long j, float f, af0 af0Var, boolean z) {
        af0Var.getClass();
        this.a = j;
        this.b = f;
        this.c = af0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ok5) {
                ok5 ok5Var = (ok5) obj;
                if (!y78.d(this.a, ok5Var.a) || Float.compare(this.b, ok5Var.b) != 0 || this.c != ok5Var.c || this.d != ok5Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int d = nk2.d(this.b, Long.hashCode(this.a) * 31, 31);
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + d) * 31);
    }

    public final String toString() {
        String l = y78.l(this.a);
        return "IconState(position=" + l + ", progress=" + this.b + ", edge=" + this.c + ", isVisible=" + this.d + ")";
    }
}
