package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i45  reason: default package */
/* loaded from: classes.dex */
public final class i45 {
    public final int a;
    public final double b;
    public final double c;
    public final double d;

    public i45(int i) {
        int i2;
        double d;
        int i3;
        double d2;
        this.a = i;
        ked kedVar = ked.k;
        kedVar.getClass();
        int i4 = i & 255;
        double H = xbe.H((16711680 & i) >> 16);
        double H2 = xbe.H((65280 & i) >> 8);
        double H3 = xbe.H(i4);
        double d3 = (0.18051042d * H3) + (0.35762064d * H2) + (0.41233895d * H);
        double d4 = (0.0722d * H3) + (0.7152d * H2) + (0.2126d * H);
        double d5 = (H3 * 0.95034478d) + (H2 * 0.11916382d) + (H * 0.01932141d);
        double d6 = kedVar.i;
        double d7 = kedVar.e;
        double d8 = kedVar.b;
        double[][] dArr = pae.a;
        double[] dArr2 = dArr[0];
        double d9 = (dArr2[2] * d5) + (dArr2[1] * d4) + (dArr2[0] * d3);
        double[] dArr3 = dArr[1];
        double d10 = (dArr3[2] * d5) + (dArr3[1] * d4) + (dArr3[0] * d3);
        double[] dArr4 = dArr[2];
        double d11 = (d4 * dArr4[1]) + (d3 * dArr4[0]);
        double[] dArr5 = kedVar.g;
        double d12 = dArr5[0] * d9;
        double d13 = dArr5[1] * d10;
        double d14 = dArr5[2] * ((d5 * dArr4[2]) + d11);
        double d15 = kedVar.h;
        double pow = Math.pow((Math.abs(d12) * d15) / 100.0d, 0.42d);
        double pow2 = Math.pow((Math.abs(d13) * d15) / 100.0d, 0.42d);
        double pow3 = Math.pow((Math.abs(d14) * d15) / 100.0d, 0.42d);
        int i5 = (d12 > 0.0d ? 1 : (d12 == 0.0d ? 0 : -1));
        int i6 = -1;
        if (i5 < 0) {
            i2 = -1;
        } else if (i5 == 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        double d16 = ((i2 * 400.0d) * pow) / (pow + 27.13d);
        int i7 = (d13 > 0.0d ? 1 : (d13 == 0.0d ? 0 : -1));
        if (i7 < 0) {
            d = 0.0d;
            i3 = -1;
        } else if (i7 == 0) {
            d = 0.0d;
            i3 = 0;
        } else {
            d = 0.0d;
            i3 = 1;
        }
        double d17 = ((i3 * 400.0d) * pow2) / (pow2 + 27.13d);
        int i8 = (d14 > d ? 1 : (d14 == d ? 0 : -1));
        if (i8 >= 0) {
            if (i8 == 0) {
                i6 = 0;
            } else {
                i6 = 1;
            }
        }
        double d18 = ((i6 * 400.0d) * pow3) / (pow3 + 27.13d);
        double d19 = ((((-12.0d) * d17) + (d16 * 11.0d)) + d18) / 11.0d;
        double b = nk2.b(d18, 2.0d, d16 + d17, 9.0d);
        double d20 = d17 * 20.0d;
        double d21 = ((21.0d * d18) + ((d16 * 20.0d) + d20)) / 20.0d;
        double d22 = (((d16 * 40.0d) + d20) + d18) / 20.0d;
        double atan2 = (Math.atan2(b, d19) * 57.29577951308232d) % 360.0d;
        atan2 = atan2 < d ? atan2 + 360.0d : atan2;
        double d23 = atan2 * 0.017453292519943295d;
        double pow4 = (Math.pow((d22 * kedVar.c) / d8, kedVar.j * d7) * 100.0d) / 100.0d;
        Math.sqrt(pow4);
        double d24 = d8 + 4.0d;
        if (atan2 < 20.14d) {
            d2 = atan2 + 360.0d;
        } else {
            d2 = atan2;
        }
        double pow5 = Math.pow((Math.hypot(d19, b) * (((((Math.cos((d2 * 0.017453292519943295d) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * kedVar.f) * kedVar.d)) / (d21 + 0.305d), 0.9d) * Math.pow(1.64d - Math.pow(0.29d, kedVar.a), 0.73d);
        double sqrt = Math.sqrt(pow4) * pow5;
        Math.sqrt((pow5 * d7) / d24);
        Math.log1p(sqrt * d6 * 0.0228d);
        Math.cos(d23);
        Math.sin(d23);
        this.b = atan2;
        this.c = sqrt;
        this.d = (xbe.G(jye.p(new double[]{xbe.H((i >> 16) & 255), xbe.H((i >> 8) & 255), xbe.H(i4)}, xbe.a)[1] / 100.0d) * 116.0d) - 16.0d;
    }

    public final boolean a() {
        double d = this.b;
        if (d >= 170.0d && d < 207.0d) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        double d = this.b;
        if (d >= 105.0d && d < 125.0d) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i45) && this.a == ((i45) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return hl5.l("Hct(argb=", ")", this.a);
    }
}
