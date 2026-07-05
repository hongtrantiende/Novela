package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tn8  reason: default package */
/* loaded from: classes.dex */
public final class tn8 extends fo8 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public tn8(float f, float f2, float f3, float f4) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn8)) {
            return false;
        }
        tn8 tn8Var = (tn8) obj;
        if (Float.compare(this.c, tn8Var.c) == 0 && Float.compare(this.d, tn8Var.d) == 0 && Float.compare(this.e, tn8Var.e) == 0 && Float.compare(this.f, tn8Var.f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + nk2.d(this.e, nk2.d(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder x = nk2.x("ReflectiveCurveTo(x1=", this.c, ", y1=", this.d, ", x2=");
        x.append(this.e);
        x.append(", y2=");
        x.append(this.f);
        x.append(")");
        return x.toString();
    }
}
