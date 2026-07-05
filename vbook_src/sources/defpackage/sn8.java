package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sn8  reason: default package */
/* loaded from: classes.dex */
public final class sn8 extends fo8 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public sn8(float f, float f2, float f3, float f4) {
        super(1);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn8)) {
            return false;
        }
        sn8 sn8Var = (sn8) obj;
        if (Float.compare(this.c, sn8Var.c) == 0 && Float.compare(this.d, sn8Var.d) == 0 && Float.compare(this.e, sn8Var.e) == 0 && Float.compare(this.f, sn8Var.f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + nk2.d(this.e, nk2.d(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder x = nk2.x("QuadTo(x1=", this.c, ", y1=", this.d, ", x2=");
        x.append(this.e);
        x.append(", y2=");
        x.append(this.f);
        x.append(")");
        return x.toString();
    }
}
