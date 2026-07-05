package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dj  reason: default package */
/* loaded from: classes.dex */
public abstract class dj {
    public static final float[] a;

    static {
        float f;
        float z;
        float f2;
        float f3;
        float f4;
        float f5;
        float z2;
        float f6;
        float f7;
        float f8;
        float[] fArr = new float[101];
        a = fArr;
        float[] fArr2 = new float[101];
        float f9 = nae.e;
        int i = 0;
        float f10 = 0.0f;
        while (true) {
            float f11 = 1.0f;
            if (i < 100) {
                float f12 = i / 100.0f;
                float f13 = 1.0f;
                while (true) {
                    f = 2.0f;
                    z = a82.z(f13, f9, 2.0f, f9);
                    f2 = f11 - z;
                    f3 = z * 3.0f * f2;
                    f4 = z * z * z;
                    float B = a82.B(z, 0.35000002f, f2 * 0.175f, f3) + f4;
                    f5 = f11;
                    if (Math.abs(B - f12) < 1.0E-5d) {
                        break;
                    }
                    if (B > f12) {
                        f13 = z;
                    } else {
                        f9 = z;
                    }
                    f11 = f5;
                }
                float f14 = 0.5f;
                fArr[i] = (((f2 * 0.5f) + z) * f3) + f4;
                float f15 = f5;
                while (true) {
                    z2 = a82.z(f15, f10, f, f10);
                    f6 = f5 - z2;
                    f7 = z2 * 3.0f * f6;
                    f8 = z2 * z2 * z2;
                    float B2 = a82.B(f6, f14, z2, f7) + f8;
                    if (Math.abs(B2 - f12) >= 1.0E-5d) {
                        if (B2 > f12) {
                            f15 = z2;
                        } else {
                            f10 = z2;
                        }
                        f14 = 0.5f;
                        f = 2.0f;
                    }
                }
                fArr2[i] = (((z2 * 0.35000002f) + (f6 * 0.175f)) * f7) + f8;
                i++;
            } else {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
        }
    }

    public static cj a(float f) {
        float f2 = nae.e;
        float f3 = 1.0f;
        float m = dce.m(f, nae.e, 1.0f);
        int i = (int) (100.0f * m);
        if (i < 100) {
            float f4 = i / 100.0f;
            int i2 = i + 1;
            float[] fArr = a;
            float f5 = fArr[i];
            float f6 = (fArr[i2] - f5) / ((i2 / 100.0f) - f4);
            float c = a82.c(m, f4, f6, f5);
            f2 = f6;
            f3 = c;
        }
        return new cj(f3, f2);
    }
}
