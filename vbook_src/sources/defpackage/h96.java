package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h96  reason: default package */
/* loaded from: classes.dex */
public final class h96 {
    public final float a;
    public final boolean b;

    public h96(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h96)) {
            return false;
        }
        h96 h96Var = (h96) obj;
        if (Float.compare(this.a, h96Var.a) == 0 && this.b == h96Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TmpKeyline(size=" + this.a + ", isAnchor=" + this.b + ")";
    }
}
