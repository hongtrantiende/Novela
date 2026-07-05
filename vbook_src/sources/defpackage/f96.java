package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f96  reason: default package */
/* loaded from: classes.dex */
public final class f96 {
    public final float a;
    public final float b;
    public final float c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final float g;

    public f96(float f, float f2, float f3, boolean z, boolean z2, boolean z3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f96)) {
            return false;
        }
        f96 f96Var = (f96) obj;
        if (Float.compare(this.a, f96Var.a) == 0 && Float.compare(this.b, f96Var.b) == 0 && Float.compare(this.c, f96Var.c) == 0 && this.d == f96Var.d && this.e == f96Var.e && this.f == f96Var.f && Float.compare(this.g, f96Var.g) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + eub.k(eub.k(eub.k(nk2.d(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder x = nk2.x("Keyline(size=", this.a, ", offset=", this.b, ", unadjustedOffset=");
        x.append(this.c);
        x.append(", isFocal=");
        x.append(this.d);
        x.append(", isAnchor=");
        rs8.z(x, this.e, ", isPivot=", this.f, ", cutoff=");
        x.append(this.g);
        x.append(")");
        return x.toString();
    }
}
