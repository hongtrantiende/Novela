package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rz9  reason: default package */
/* loaded from: classes.dex */
public final class rz9 {
    public final float a;
    public final float b;
    public final float c;

    public rz9(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz9)) {
            return false;
        }
        rz9 rz9Var = (rz9) obj;
        if (Float.compare(this.a, rz9Var.a) == 0 && Float.compare(this.b, rz9Var.b) == 0 && Float.compare(this.c, rz9Var.c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + nk2.d(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "Result(minScale=" + yz1.k(2, this.a) + ", mediumScale=" + yz1.k(2, this.b) + ", maxScale=" + yz1.k(2, this.c) + ')';
    }
}
