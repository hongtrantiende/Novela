package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d0  reason: default package */
/* loaded from: classes.dex */
public final class d0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public d0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (Float.compare(this.a, d0Var.a) == 0 && Float.compare(this.b, d0Var.b) == 0 && Float.compare(this.c, d0Var.c) == 0 && Float.compare(this.d, d0Var.d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + nk2.d(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "AbsolutePixelPadding(start=" + this.a + ", end=" + this.b + ", top=" + this.c + ", bottom=" + this.d + ')';
    }
}
