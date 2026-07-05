package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vn8  reason: default package */
/* loaded from: classes.dex */
public final class vn8 extends fo8 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public vn8(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = z2;
        this.h = f4;
        this.i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn8)) {
            return false;
        }
        vn8 vn8Var = (vn8) obj;
        if (Float.compare(this.c, vn8Var.c) == 0 && Float.compare(this.d, vn8Var.d) == 0 && Float.compare(this.e, vn8Var.e) == 0 && this.f == vn8Var.f && this.g == vn8Var.g && Float.compare(this.h, vn8Var.h) == 0 && Float.compare(this.i, vn8Var.i) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + nk2.d(this.h, eub.k(eub.k(nk2.d(this.e, nk2.d(this.d, Float.hashCode(this.c) * 31, 31), 31), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder x = nk2.x("RelativeArcTo(horizontalEllipseRadius=", this.c, ", verticalEllipseRadius=", this.d, ", theta=");
        x.append(this.e);
        x.append(", isMoreThanHalf=");
        x.append(this.f);
        x.append(", isPositiveArc=");
        x.append(this.g);
        x.append(", arcStartDx=");
        x.append(this.h);
        x.append(", arcStartDy=");
        x.append(this.i);
        x.append(")");
        return x.toString();
    }
}
