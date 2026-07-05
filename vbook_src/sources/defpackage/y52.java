package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y52  reason: default package */
/* loaded from: classes.dex */
public final class y52 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;

    public y52(double d, double d2, double d3, double d4) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public final double a(double d) {
        double d2;
        double d3;
        int i = (d > (-1.0d) ? 1 : (d == (-1.0d) ? 0 : -1));
        double d4 = this.a;
        if (i <= 0) {
            return d4;
        }
        int i2 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
        double d5 = this.b;
        if (i2 < 0) {
            double d6 = (d - (-1.0d)) / 1.0d;
            d2 = (1.0d - d6) * d4;
            d3 = d6 * d5;
        } else {
            int i3 = (d > 0.5d ? 1 : (d == 0.5d ? 0 : -1));
            double d7 = this.c;
            if (i3 < 0) {
                double d8 = (d - 0.0d) / 0.5d;
                d2 = (1.0d - d8) * d5;
                d3 = d8 * d7;
            } else {
                int i4 = (d > 1.0d ? 1 : (d == 1.0d ? 0 : -1));
                double d9 = this.d;
                if (i4 < 0) {
                    double d10 = (d - 0.5d) / 0.5d;
                    d2 = (1.0d - d10) * d7;
                    d3 = d10 * d9;
                } else {
                    return d9;
                }
            }
        }
        return d3 + d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y52)) {
            return false;
        }
        y52 y52Var = (y52) obj;
        if (Double.compare(this.a, y52Var.a) == 0 && Double.compare(this.b, y52Var.b) == 0 && Double.compare(this.c, y52Var.c) == 0 && Double.compare(this.d, y52Var.d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Double.hashCode(this.b);
        int hashCode2 = Double.hashCode(this.c);
        return Double.hashCode(this.d) + ((hashCode2 + ((hashCode + (Double.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ContrastCurve(low=" + this.a + ", normal=" + this.b + ", medium=" + this.c + ", high=" + this.d + ")";
    }
}
