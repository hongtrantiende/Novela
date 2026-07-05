package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: do8  reason: default package */
/* loaded from: classes.dex */
public final class do8 extends fo8 {
    public final float c;

    public do8(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof do8) && Float.compare(this.c, ((do8) obj).c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return a82.k("RelativeVerticalTo(dy=", this.c, ")");
    }
}
