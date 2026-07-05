package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: red  reason: default package */
/* loaded from: classes3.dex */
public final class red {
    public final int a;
    public final int b;
    public final int c;

    public red(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof red)) {
            return false;
        }
        red redVar = (red) obj;
        if (this.a == redVar.a && this.b == redVar.b && this.c == redVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + hl5.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return rs8.g(this.c, ")", hl5.r(this.a, this.b, "VisibleLazyListItemBounds(index=", ", offset=", ", size="));
    }
}
