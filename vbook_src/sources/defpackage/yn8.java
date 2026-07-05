package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yn8  reason: default package */
/* loaded from: classes.dex */
public final class yn8 extends fo8 {
    public final float c;
    public final float d;

    public yn8(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn8)) {
            return false;
        }
        yn8 yn8Var = (yn8) obj;
        if (Float.compare(this.c, yn8Var.c) == 0 && Float.compare(this.d, yn8Var.d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return a82.l("RelativeLineTo(dx=", this.c, ", dy=", this.d, ")");
    }
}
