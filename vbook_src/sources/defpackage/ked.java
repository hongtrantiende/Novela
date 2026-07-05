package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ked  reason: default package */
/* loaded from: classes.dex */
public final class ked {
    public static final ked k;
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double[] g;
    public final double h;
    public final double i;
    public final double j;

    static {
        double[] dArr = xbe.b;
        double max = Math.max(0.1d, 50.0d);
        double[][] dArr2 = pae.a;
        double d = dArr[0];
        double[] dArr3 = dArr2[0];
        double d2 = dArr[1];
        double d3 = dArr3[1] * d2;
        double d4 = dArr[2];
        double d5 = (dArr3[2] * d4) + d3 + (dArr3[0] * d);
        double[] dArr4 = dArr2[1];
        double d6 = (dArr4[2] * d4) + (dArr4[1] * d2) + (dArr4[0] * d);
        double[] dArr5 = dArr2[2];
        double d7 = (d4 * dArr5[2]) + (d2 * dArr5[1]) + (d * dArr5[0]);
        double l = dce.l((1.0d - (Math.exp(-0.5839747603136626d) * 0.2777777777777778d)) * 1.0d, 0.0d, 1.0d);
        double[] dArr6 = {(((100.0d / d5) * l) + 1.0d) - l, (((100.0d / d6) * l) + 1.0d) - l, (((100.0d / d7) * l) + 1.0d) - l};
        double cbrt = (Math.cbrt(58.62838974428476d) * 0.09999998417959298d) + 9.275250255162799E-7d;
        double d8 = (max + 16.0d) / 116.0d;
        double d9 = d8 * d8 * d8;
        if (d9 <= 0.008856451679035631d) {
            d9 = ((116.0d * d8) - 16.0d) / 903.2962962962963d;
        }
        double d10 = (d9 * 100.0d) / dArr[1];
        double pow = 0.725d / Math.pow(d10, 0.2d);
        double[] dArr7 = {Math.pow(((dArr6[0] * cbrt) * d5) / 100.0d, 0.42d), Math.pow(((dArr6[1] * cbrt) * d6) / 100.0d, 0.42d), Math.pow(((dArr6[2] * cbrt) * d7) / 100.0d, 0.42d)};
        double d11 = dArr7[0];
        double d12 = (d11 * 400.0d) / (d11 + 27.13d);
        double d13 = dArr7[1];
        double d14 = (d13 * 400.0d) / (d13 + 27.13d);
        double d15 = dArr7[2];
        double[] dArr8 = {d12, d14, (400.0d * d15) / (d15 + 27.13d)};
        k = new ked(d10, ((dArr8[2] * 0.05d) + (dArr8[0] * 2.0d) + dArr8[1]) * pow, pow, pow, 0.69d, 1.0d, dArr6, cbrt, Math.pow(cbrt, 0.25d), Math.sqrt(d10) + 1.48d);
    }

    public ked(double d, double d2, double d3, double d4, double d5, double d6, double[] dArr, double d7, double d8, double d9) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = d6;
        this.g = dArr;
        this.h = d7;
        this.i = d8;
        this.j = d9;
    }
}
