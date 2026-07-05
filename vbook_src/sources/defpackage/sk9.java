package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sk9  reason: default package */
/* loaded from: classes.dex */
public final class sk9 {
    public static final sk9 e = new sk9(nae.e, nae.e, nae.e, nae.e);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public sk9(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk9)) {
            return false;
        }
        sk9 sk9Var = (sk9) obj;
        if (Float.compare(this.a, sk9Var.a) == 0 && Float.compare(this.b, sk9Var.b) == 0 && Float.compare(this.c, sk9Var.c) == 0 && Float.compare(this.d, sk9Var.d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + nk2.d(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "RectCompat.fromLTRB(" + yz1.A(this.a) + ", " + yz1.A(this.b) + ", " + yz1.A(this.c) + ", " + yz1.A(this.d) + ')';
    }
}
