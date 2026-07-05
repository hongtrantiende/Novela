package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tk8  reason: default package */
/* loaded from: classes3.dex */
public final class tk8 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final int h;
    public final int i;

    public tk8(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = i;
        this.i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk8)) {
            return false;
        }
        tk8 tk8Var = (tk8) obj;
        if (Float.compare(this.a, tk8Var.a) == 0 && Float.compare(this.b, tk8Var.b) == 0 && Float.compare(this.c, tk8Var.c) == 0 && Float.compare(this.d, tk8Var.d) == 0 && Float.compare(this.e, tk8Var.e) == 0 && Float.compare(this.f, tk8Var.f) == 0 && Float.compare(this.g, tk8Var.g) == 0 && this.h == tk8Var.h && this.i == tk8Var.i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + hl5.a(this.h, nk2.d(this.g, nk2.d(this.f, nk2.d(this.e, nk2.d(this.d, nk2.d(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder x = nk2.x("PagerZoomInfo(zoom=", this.a, ", offsetX=", this.b, ", offsetY=");
        s21.D(x, this.c, ", fittedPageWidth=", this.d, ", fittedPageHeight=");
        s21.D(x, this.e, ", viewportWidth=", this.f, ", viewportHeight=");
        x.append(this.g);
        x.append(", nativePageWidth=");
        x.append(this.h);
        x.append(", nativePageHeight=");
        return rs8.g(this.i, ")", x);
    }
}
