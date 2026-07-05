package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wn8  reason: default package */
/* loaded from: classes.dex */
public final class wn8 extends fo8 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public wn8(float f, float f2, float f3, float f4, float f5, float f6) {
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
        if (!(obj instanceof wn8)) {
            return false;
        }
        wn8 wn8Var = (wn8) obj;
        if (Float.compare(this.c, wn8Var.c) == 0 && Float.compare(this.d, wn8Var.d) == 0 && Float.compare(this.e, wn8Var.e) == 0 && Float.compare(this.f, wn8Var.f) == 0 && Float.compare(this.g, wn8Var.g) == 0 && Float.compare(this.h, wn8Var.h) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + nk2.d(this.g, nk2.d(this.f, nk2.d(this.e, nk2.d(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder x = nk2.x("RelativeCurveTo(dx1=", this.c, ", dy1=", this.d, ", dx2=");
        s21.D(x, this.e, ", dy2=", this.f, ", dx3=");
        x.append(this.g);
        x.append(", dy3=");
        x.append(this.h);
        x.append(")");
        return x.toString();
    }
}
