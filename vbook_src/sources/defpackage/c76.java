package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c76  reason: default package */
/* loaded from: classes.dex */
public final class c76 {
    public final int a;
    public final int b;

    public c76(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c76)) {
            return false;
        }
        c76 c76Var = (c76) obj;
        if (this.a == c76Var.a && this.b == c76Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hl5.i(this.a, this.b, "KF8Pos(fid=", ", offset=", ")");
    }
}
