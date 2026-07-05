package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rh1  reason: default package */
/* loaded from: classes3.dex */
public final class rh1 {
    public final float a;
    public final float b;
    public final float c;
    public final long d;
    public final float e;
    public final float f;

    public rh1(float f, float f2, float f3, long j, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = j;
        this.e = f4;
        this.f = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh1)) {
            return false;
        }
        rh1 rh1Var = (rh1) obj;
        if (Float.compare(this.a, rh1Var.a) == 0 && Float.compare(this.b, rh1Var.b) == 0 && Float.compare(this.c, rh1Var.c) == 0 && zl1.c(this.d, rh1Var.d) && Float.compare(this.e, rh1Var.e) == 0 && Float.compare(this.f, rh1Var.f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int d = nk2.d(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
        int i = zl1.j;
        return Float.hashCode(this.f) + nk2.d(this.e, hl5.c(d, this.d, 31), 31);
    }

    public final String toString() {
        String i = zl1.i(this.d);
        StringBuilder x = nk2.x("CircleData(x=", this.a, ", y=", this.b, ", radius=");
        x.append(this.c);
        x.append(", color=");
        x.append(i);
        x.append(", alpha=");
        x.append(this.e);
        x.append(", depth=");
        x.append(this.f);
        x.append(")");
        return x.toString();
    }
}
