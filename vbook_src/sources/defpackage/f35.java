package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f35  reason: default package */
/* loaded from: classes.dex */
public final class f35 implements yl1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    static {
        float f;
        p40 p40Var = tm1.a;
        jq6 t = tl1.t();
        for (int i = 0; i < 3; i++) {
            char charAt = "HSV".charAt(i);
            String valueOf = String.valueOf(charAt);
            if (charAt == 'H') {
                f = 360.0f;
            } else {
                f = 1.0f;
            }
            t.add(new p40(valueOf, f));
        }
        t.add(tm1.a);
        tl1.r(t);
    }

    public f35(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static final float c(double d, double d2, double d3, int i) {
        double d4 = (i + d) % 6.0d;
        double d5 = d3 * d2;
        double min = Math.min(d4, Math.min(4.0d - d4, 1.0d));
        if (min < 0.0d) {
            min = 0.0d;
        }
        return (float) (d2 - (d5 * min));
    }

    @Override // defpackage.yl1
    public final iod a() {
        return b().a();
    }

    @Override // defpackage.yl1
    public final ig9 b() {
        float f;
        boolean isNaN = Float.isNaN(this.a);
        float f2 = this.d;
        float f3 = this.c;
        if (!isNaN) {
            float f4 = this.b;
            if (!Float.isNaN(f4)) {
                double d = f4;
                if (d >= 1.0E-7d) {
                    double d2 = f3;
                    double d3 = (((f % 360.0f) + 360.0f) % 360.0f) / 60.0d;
                    return jw9.b.c(c(d3, d2, d, 5), c(d3, d2, d, 3), c(d3, d2, d, 1), f2);
                }
            }
        }
        return ig9.f.c(f3, f3, f3, f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f35)) {
            return false;
        }
        f35 f35Var = (f35) obj;
        if (Float.compare(this.a, f35Var.a) == 0 && Float.compare(this.b, f35Var.b) == 0 && Float.compare(this.c, f35Var.c) == 0 && Float.compare(this.d, f35Var.d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + nk2.d(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "HSV(h=" + this.a + ", s=" + this.b + ", v=" + this.c + ", alpha=" + this.d + ')';
    }
}
