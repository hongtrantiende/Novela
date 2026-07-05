package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xn8  reason: default package */
/* loaded from: classes.dex */
public final class xn8 extends fo8 {
    public final float c;

    public xn8(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xn8) && Float.compare(this.c, ((xn8) obj).c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return a82.k("RelativeHorizontalTo(dx=", this.c, ")");
    }
}
