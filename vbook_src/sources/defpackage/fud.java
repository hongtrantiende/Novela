package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fud  reason: default package */
/* loaded from: classes.dex */
public final class fud {
    public final float a;
    public final float b;
    public final float c;

    public fud(Double d, Double d2) {
        Double valueOf = Double.valueOf(1.0d);
        float floatValue = d.floatValue();
        float floatValue2 = d2.floatValue();
        float floatValue3 = valueOf.floatValue();
        this.a = floatValue;
        this.b = floatValue2;
        this.c = floatValue3;
    }

    public final float a() {
        float f = 1.0f - this.a;
        float f2 = this.b;
        return ((f - f2) * this.c) / f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fud)) {
            return false;
        }
        fud fudVar = (fud) obj;
        if (Float.compare(this.a, fudVar.a) == 0 && Float.compare(this.b, fudVar.b) == 0 && Float.compare(this.c, fudVar.c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + nk2.d(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "xyY(x=" + this.a + ", y=" + this.b + ", Y=" + this.c + ')';
    }
}
