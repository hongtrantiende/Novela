package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bt4  reason: default package */
/* loaded from: classes.dex */
public final class bt4 {
    public static final bt4 k;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;

    static {
        float[] fArr;
        float[] fArr2 = vae.c;
        float pow = (float) (((Math.pow(0.5689655172413793d, 3.0d) * 100.0d) * 63.66197723675813d) / 100.0d);
        float[][] fArr3 = vae.a;
        float f = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f2 = fArr2[1];
        float f3 = fArr4[1] * f2;
        float f4 = fArr2[2];
        float f5 = (fArr4[2] * f4) + f3 + (fArr4[0] * f);
        float[] fArr5 = fArr3[1];
        float f6 = (fArr5[2] * f4) + (fArr5[1] * f2) + (fArr5[0] * f);
        float[] fArr6 = fArr3[2];
        float f7 = (f4 * fArr6[2]) + (f2 * fArr6[1]) + (f * fArr6[0]);
        float c = nk2.c((float) Math.exp(((-pow) - 42.0f) / 92.0f), 0.2777778f, 1.0f, 1.0f);
        double d = c;
        if (d > 1.0d) {
            c = 1.0f;
        } else if (d < 0.0d) {
            c = nae.e;
        }
        float f8 = 1.0f / ((5.0f * pow) + 1.0f);
        float f9 = f8 * f8 * f8 * f8;
        float f10 = 1.0f - f9;
        float cbrt = (0.1f * f10 * f10 * ((float) Math.cbrt(pow * 5.0d))) + (f9 * pow);
        float pow2 = ((float) (Math.pow(0.5689655172413793d, 3.0d) * 100.0d)) / fArr2[1];
        double d2 = pow2;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow3 = 0.725f / ((float) Math.pow(d2, 0.20000000298023224d));
        float[] fArr7 = {(float) Math.pow(((fArr[0] * cbrt) * f5) / 100.0f, 0.41999998688697815d), (float) Math.pow(((fArr[1] * cbrt) * f6) / 100.0f, 0.41999998688697815d), (float) Math.pow(((fArr[2] * cbrt) * f7) / 100.0f, 0.41999998688697815d)};
        float f11 = fArr7[0];
        float f12 = (f11 * 400.0f) / (f11 + 27.13f);
        float f13 = fArr7[1];
        float f14 = (f13 * 400.0f) / (f13 + 27.13f);
        float f15 = fArr7[2];
        float[] fArr8 = {f12, f14, (400.0f * f15) / (f15 + 27.13f)};
        k = new bt4(pow2, a82.B(fArr8[2], 0.05f, (fArr8[0] * 2.0f) + fArr8[1], pow3), pow3, pow3, 0.69000006f, 1.0f, new float[]{(((100.0f / f5) * c) + 1.0f) - c, (((100.0f / f6) * c) + 1.0f) - c, (((100.0f / f7) * c) + 1.0f) - c}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public bt4(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = fArr;
        this.h = f7;
        this.i = f8;
        this.j = f9;
    }
}
