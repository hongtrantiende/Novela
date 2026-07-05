package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yv5  reason: default package */
/* loaded from: classes.dex */
public final class yv5 {
    public final float a;
    public final long b;
    public final long c;
    public final float d;
    public final int e;

    static {
        new yv5(nae.e, nae.e, 31);
    }

    public yv5(float f, float f2, int i) {
        f = (i & 1) != 0 ? 24.0f : f;
        long floatToRawIntBits = (Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
        long b = zl1.b(0.15f, zl1.b);
        f2 = (i & 8) != 0 ? 1.0f : f2;
        this.a = f;
        this.b = floatToRawIntBits;
        this.c = b;
        this.d = f2;
        this.e = 3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yv5) {
                yv5 yv5Var = (yv5) obj;
                if (rg3.b(this.a, yv5Var.a) && this.b == yv5Var.b && zl1.c(this.c, yv5Var.c) && Float.compare(this.d, yv5Var.d) == 0 && this.e == yv5Var.e) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int c = hl5.c(Float.hashCode(this.a) * 31, this.b, 31);
        int i = zl1.j;
        return Integer.hashCode(this.e) + nk2.d(this.d, hl5.c(c, this.c, 31), 31);
    }

    public final String toString() {
        String c = rg3.c(this.a);
        String c2 = tg3.c(this.b);
        String i = zl1.i(this.c);
        String a = vl0.a(this.e);
        StringBuilder y = nk2.y("InnerShadow(radius=", c, ", offset=", c2, ", color=");
        y.append(i);
        y.append(", alpha=");
        y.append(this.d);
        y.append(", blendMode=");
        return s21.q(y, a, ")");
    }
}
