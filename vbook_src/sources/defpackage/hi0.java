package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hi0  reason: default package */
/* loaded from: classes.dex */
public final class hi0 {
    public final uy5 a;
    public final float b;
    public final int c;

    public hi0(uy5 uy5Var, float f, int i) {
        uy5Var.getClass();
        this.a = uy5Var;
        this.b = f;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi0)) {
            return false;
        }
        hi0 hi0Var = (hi0) obj;
        if (c16.i(this.a, hi0Var.a) && Float.compare(this.b, hi0Var.b) == 0 && this.c == hi0Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + nk2.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseTileKey(rect=");
        sb.append(this.a);
        sb.append(", renderScale=");
        sb.append(this.b);
        sb.append(", generation=");
        return rs8.g(this.c, ")", sb);
    }
}
