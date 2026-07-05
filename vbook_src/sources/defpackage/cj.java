package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cj  reason: default package */
/* loaded from: classes.dex */
public final class cj {
    public final float a;
    public final float b;

    public cj(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj)) {
            return false;
        }
        cj cjVar = (cj) obj;
        if (Float.compare(this.a, cjVar.a) == 0 && Float.compare(this.b, cjVar.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return a82.l("FlingResult(distanceCoefficient=", this.a, ", velocityCoefficient=", this.b, ")");
    }
}
