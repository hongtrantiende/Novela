package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gi8  reason: default package */
/* loaded from: classes3.dex */
public final class gi8 {
    public final int a;
    public final float b;

    public gi8(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi8)) {
            return false;
        }
        gi8 gi8Var = (gi8) obj;
        if (this.a == gi8Var.a && Float.compare(this.b, gi8Var.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PageInfo(currentPageIndex=" + this.a + ", currentScrollFraction=" + this.b + ")";
    }
}
