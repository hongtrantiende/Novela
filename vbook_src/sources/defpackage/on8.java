package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: on8  reason: default package */
/* loaded from: classes.dex */
public final class on8 extends fo8 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public on8(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on8)) {
            return false;
        }
        on8 on8Var = (on8) obj;
        if (Float.compare(this.c, on8Var.c) == 0 && Float.compare(this.d, on8Var.d) == 0 && Float.compare(this.e, on8Var.e) == 0 && Float.compare(this.f, on8Var.f) == 0 && Float.compare(this.g, on8Var.g) == 0 && Float.compare(this.h, on8Var.h) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + nk2.d(this.g, nk2.d(this.f, nk2.d(this.e, nk2.d(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder x = nk2.x("CurveTo(x1=", this.c, ", y1=", this.d, ", x2=");
        s21.D(x, this.e, ", y2=", this.f, ", x3=");
        x.append(this.g);
        x.append(", y3=");
        x.append(this.h);
        x.append(")");
        return x.toString();
    }
}
