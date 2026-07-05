package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p98  reason: default package */
/* loaded from: classes.dex */
public final class p98 extends sm1 {
    public static final float[] d;
    public static final float[] e;
    public static final float[] f;
    public static final float[] g;

    static {
        float[] p = cwe.p(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, cwe.e(f7.c.b, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        d = p;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        e = fArr;
        f = cwe.l(p);
        g = cwe.l(fArr);
    }

    @Override // defpackage.sm1
    public final float a(int i) {
        if (i == 0) {
            return 1.0f;
        }
        return 0.5f;
    }

    @Override // defpackage.sm1
    public final float b(int i) {
        if (i == 0) {
            return nae.e;
        }
        return -0.5f;
    }

    @Override // defpackage.sm1
    public final long d(float f2, float f3, float f4) {
        float f5;
        if (f2 < nae.e) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f6 = 0.5f;
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        if (f4 <= 0.5f) {
            f6 = f4;
        }
        float[] fArr = g;
        float f7 = (fArr[6] * f6) + (fArr[3] * f3) + (fArr[0] * f2);
        float f8 = (fArr[7] * f6) + (fArr[4] * f3) + (fArr[1] * f2);
        float f9 = (fArr[8] * f6) + (fArr[5] * f3) + (fArr[2] * f2);
        float f10 = f7 * f7 * f7;
        float f11 = f9 * f9 * f9;
        float[] fArr2 = f;
        float f12 = (fArr2[3] * f8 * f8 * f8) + (fArr2[0] * f10);
        float f13 = fArr2[1] * f10;
        return (Float.floatToRawIntBits((fArr2[6] * f11) + f12) << 32) | (4294967295L & Float.floatToRawIntBits((fArr2[7] * f11) + (fArr2[4] * f5) + f13));
    }

    @Override // defpackage.sm1
    public final float e(float f2, float f3, float f4) {
        if (f2 < nae.e) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f5 = 0.5f;
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        if (f4 <= 0.5f) {
            f5 = f4;
        }
        float[] fArr = g;
        float f6 = (fArr[6] * f5) + (fArr[3] * f3) + (fArr[0] * f2);
        float f7 = (fArr[7] * f5) + (fArr[4] * f3) + (fArr[1] * f2);
        float f8 = (fArr[8] * f5) + (fArr[5] * f3) + (fArr[2] * f2);
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float f11 = f8 * f8 * f8;
        float[] fArr2 = f;
        return (fArr2[8] * f11) + (fArr2[5] * f10) + (fArr2[2] * f9);
    }

    @Override // defpackage.sm1
    public final long f(float f2, float f3, float f4, float f5, sm1 sm1Var) {
        float[] fArr = d;
        float f6 = fArr[3] * f3;
        float f7 = fArr[6] * f4;
        float f8 = fArr[4] * f3;
        float f9 = fArr[7] * f4;
        float f10 = fArr[5] * f3;
        float f11 = fArr[8] * f4;
        float j = b23.j(f7 + f6 + (fArr[0] * f2));
        float j2 = b23.j(f9 + f8 + (fArr[1] * f2));
        float j3 = b23.j(f11 + f10 + (fArr[2] * f2));
        float[] fArr2 = e;
        float f12 = (fArr2[6] * j3) + (fArr2[3] * j2) + (fArr2[0] * j);
        float f13 = (fArr2[4] * j2) + (fArr2[1] * j);
        float f14 = fArr2[5] * j2;
        return sve.a(f12, (fArr2[7] * j3) + f13, (fArr2[8] * j3) + f14 + (fArr2[2] * j), f5, sm1Var);
    }
}
