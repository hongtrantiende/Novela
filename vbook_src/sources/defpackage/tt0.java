package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tt0  reason: default package */
/* loaded from: classes.dex */
public final class tt0 {
    public static final tt0 c = new tt0(nae.e, nae.e);
    public final float a;
    public final float b;

    public tt0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt0)) {
            return false;
        }
        tt0 tt0Var = (tt0) obj;
        if (Float.compare(this.a, tt0Var.a) == 0 && Float.compare(this.b, tt0Var.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return a82.l("Bounds(min=", this.a, ", max=", this.b, ")");
    }
}
