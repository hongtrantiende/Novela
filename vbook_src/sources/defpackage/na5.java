package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: na5  reason: default package */
/* loaded from: classes.dex */
public final class na5 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public na5(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static na5 a(na5 na5Var, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = na5Var.a;
        }
        if ((i & 2) != 0) {
            f2 = na5Var.b;
        }
        if ((i & 4) != 0) {
            f3 = na5Var.c;
        }
        if ((i & 8) != 0) {
            f4 = na5Var.d;
        }
        na5Var.getClass();
        return new na5(f, f2, f3, f4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na5)) {
            return false;
        }
        na5 na5Var = (na5) obj;
        if (Float.compare(this.a, na5Var.a) == 0 && Float.compare(this.b, na5Var.b) == 0 && Float.compare(this.c, na5Var.c) == 0 && Float.compare(this.d, na5Var.d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + nk2.d(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder x = nk2.x("HsvColor(hue=", this.a, ", saturation=", this.b, ", value=");
        x.append(this.c);
        x.append(", alpha=");
        x.append(this.d);
        x.append(")");
        return x.toString();
    }
}
