package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nub  reason: default package */
/* loaded from: classes.dex */
public final class nub {
    public static final nub c = new nub(1.0f, nae.e);
    public final float a;
    public final float b;

    public nub(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nub)) {
            return false;
        }
        nub nubVar = (nub) obj;
        if (this.a == nubVar.a && this.b == nubVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return a82.l("TextGeometricTransform(scaleX=", this.a, ", skewX=", this.b, ")");
    }
}
