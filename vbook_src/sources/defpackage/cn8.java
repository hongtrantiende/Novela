package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cn8  reason: default package */
/* loaded from: classes3.dex */
public final class cn8 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;

    public cn8(float f, float f2, float f3, float f4, float f5, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn8)) {
            return false;
        }
        cn8 cn8Var = (cn8) obj;
        if (Float.compare(this.a, cn8Var.a) == 0 && Float.compare(this.b, cn8Var.b) == 0 && Float.compare(this.c, cn8Var.c) == 0 && Float.compare(this.d, cn8Var.d) == 0 && Float.compare(this.e, cn8Var.e) == 0 && this.f == cn8Var.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + nk2.d(this.e, nk2.d(this.d, nk2.d(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder x = nk2.x("Particle(x=", this.a, ", y=", this.b, ", vx=");
        s21.D(x, this.c, ", vy=", this.d, ", radius=");
        x.append(this.e);
        x.append(", colorIndex=");
        x.append(this.f);
        x.append(")");
        return x.toString();
    }
}
