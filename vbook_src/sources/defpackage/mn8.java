package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mn8  reason: default package */
/* loaded from: classes.dex */
public final class mn8 extends fo8 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public mn8(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
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
        if (!(obj instanceof mn8)) {
            return false;
        }
        mn8 mn8Var = (mn8) obj;
        if (Float.compare(this.c, mn8Var.c) == 0 && Float.compare(this.d, mn8Var.d) == 0 && Float.compare(this.e, mn8Var.e) == 0 && this.f == mn8Var.f && this.g == mn8Var.g && Float.compare(this.h, mn8Var.h) == 0 && Float.compare(this.i, mn8Var.i) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + nk2.d(this.h, eub.k(eub.k(nk2.d(this.e, nk2.d(this.d, Float.hashCode(this.c) * 31, 31), 31), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder x = nk2.x("ArcTo(horizontalEllipseRadius=", this.c, ", verticalEllipseRadius=", this.d, ", theta=");
        x.append(this.e);
        x.append(", isMoreThanHalf=");
        x.append(this.f);
        x.append(", isPositiveArc=");
        x.append(this.g);
        x.append(", arcStartX=");
        x.append(this.h);
        x.append(", arcStartY=");
        x.append(this.i);
        x.append(")");
        return x.toString();
    }
}
