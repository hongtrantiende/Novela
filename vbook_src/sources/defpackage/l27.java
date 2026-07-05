package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l27  reason: default package */
/* loaded from: classes.dex */
public final class l27 {
    public final float[] a;

    public /* synthetic */ l27(float[] fArr) {
        this.a = fArr;
    }

    public static float[] a() {
        return new float[]{1.0f, nae.e, nae.e, nae.e, nae.e, 1.0f, nae.e, nae.e, nae.e, nae.e, 1.0f, nae.e, nae.e, nae.e, nae.e, 1.0f};
    }

    public static final void b(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 == nae.e) {
            return;
        }
        float f30 = 1.0f / f29;
        fArr[0] = a82.B(f8, f26, (f6 * f28) - (f7 * f27), f30);
        fArr[1] = nk2.c(f4, f26, (f3 * f27) + ((-f2) * f28), f30);
        fArr[2] = a82.B(f16, f20, (f14 * f22) - (f15 * f21), f30);
        fArr[3] = nk2.c(f12, f20, (f11 * f21) + ((-f10) * f22), f30);
        float f31 = -f5;
        fArr[4] = nk2.c(f8, f24, (f7 * f25) + (f31 * f28), f30);
        fArr[5] = a82.B(f4, f24, (f28 * f) - (f3 * f25), f30);
        float f32 = -f13;
        fArr[6] = nk2.c(f16, f18, (f15 * f19) + (f32 * f22), f30);
        fArr[7] = a82.B(f12, f18, (f9 * f22) - (f11 * f19), f30);
        fArr[8] = a82.B(f8, f23, (f5 * f27) - (f6 * f25), f30);
        fArr[9] = nk2.c(f4, f23, (f25 * f2) + ((-f) * f27), f30);
        fArr[10] = a82.B(f16, f17, (f13 * f21) - (f14 * f19), f30);
        fArr[11] = nk2.c(f12, f17, (f19 * f10) + ((-f9) * f21), f30);
        fArr[12] = nk2.c(f7, f23, (f6 * f24) + (f31 * f26), f30);
        fArr[13] = a82.B(f3, f23, (f * f26) - (f2 * f24), f30);
        fArr[14] = nk2.c(f15, f17, (f14 * f18) + (f32 * f20), f30);
        fArr[15] = a82.B(f11, f17, (f9 * f20) - (f10 * f18), f30);
    }

    public static final long c(long j, float[] fArr) {
        if (fArr.length < 16) {
            return j;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f10 = 1.0f / (((f6 * intBitsToFloat2) + (f3 * intBitsToFloat)) + f9);
        if ((Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) >= 2139095040) {
            f10 = nae.e;
        }
        return (Float.floatToRawIntBits((((f4 * intBitsToFloat2) + (f * intBitsToFloat)) + f7) * f10) << 32) | (Float.floatToRawIntBits(((f5 * intBitsToFloat2) + (f2 * intBitsToFloat) + f8) * f10) & 4294967295L);
    }

    public static final rk9 d(float[] fArr, rk9 rk9Var) {
        if (fArr.length < 16) {
            return rk9Var;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float f10 = rk9Var.a;
        float f11 = rk9Var.b;
        float f12 = rk9Var.c;
        float f13 = rk9Var.d;
        float f14 = f3 * f10;
        float f15 = f6 * f11;
        float f16 = 1.0f / ((f14 + f15) + f9);
        int floatToRawIntBits = Float.floatToRawIntBits(f16) & Integer.MAX_VALUE;
        float f17 = nae.e;
        if (floatToRawIntBits >= 2139095040) {
            f16 = 0.0f;
        }
        float f18 = f * f10;
        float f19 = f4 * f11;
        float f20 = (f18 + f19 + f7) * f16;
        float f21 = f10 * f2;
        float f22 = f11 * f5;
        float f23 = f16 * (f21 + f22 + f8);
        float f24 = f6 * f13;
        float f25 = 1.0f / ((f14 + f24) + f9);
        if ((Float.floatToRawIntBits(f25) & Integer.MAX_VALUE) >= 2139095040) {
            f25 = 0.0f;
        }
        float f26 = f4 * f13;
        float f27 = (f18 + f26 + f7) * f25;
        float f28 = f5 * f13;
        float f29 = (f21 + f28 + f8) * f25;
        float f30 = f3 * f12;
        float f31 = 1.0f / ((f15 + f30) + f9);
        if ((Float.floatToRawIntBits(f31) & Integer.MAX_VALUE) >= 2139095040) {
            f31 = 0.0f;
        }
        float f32 = f * f12;
        float f33 = (f32 + f19 + f7) * f31;
        float f34 = f2 * f12;
        float f35 = (f22 + f34 + f8) * f31;
        float f36 = 1.0f / ((f30 + f24) + f9);
        if ((Float.floatToRawIntBits(f36) & Integer.MAX_VALUE) < 2139095040) {
            f17 = f36;
        }
        float f37 = (f32 + f26 + f7) * f17;
        float f38 = (f34 + f28 + f8) * f17;
        return new rk9(Math.min(f20, Math.min(f27, Math.min(f33, f37))), Math.min(f23, Math.min(f29, Math.min(f35, f38))), Math.max(f20, Math.max(f27, Math.max(f33, f37))), Math.max(f23, Math.max(f29, Math.max(f35, f38))));
    }

    public static final void e(float[] fArr, sv7 sv7Var) {
        if (fArr.length < 16) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float f10 = sv7Var.b;
        float f11 = sv7Var.c;
        float f12 = sv7Var.d;
        float f13 = sv7Var.e;
        float f14 = f3 * f10;
        float f15 = f6 * f11;
        float f16 = 1.0f / ((f14 + f15) + f9);
        int floatToRawIntBits = Float.floatToRawIntBits(f16) & Integer.MAX_VALUE;
        float f17 = nae.e;
        if (floatToRawIntBits >= 2139095040) {
            f16 = 0.0f;
        }
        float f18 = f * f10;
        float f19 = f4 * f11;
        float f20 = (f18 + f19 + f7) * f16;
        float f21 = f10 * f2;
        float f22 = f11 * f5;
        float f23 = (f21 + f22 + f8) * f16;
        float f24 = f6 * f13;
        float f25 = 1.0f / ((f14 + f24) + f9);
        if ((Float.floatToRawIntBits(f25) & Integer.MAX_VALUE) >= 2139095040) {
            f25 = 0.0f;
        }
        float f26 = f4 * f13;
        float f27 = (f18 + f26 + f7) * f25;
        float f28 = f5 * f13;
        float f29 = (f21 + f28 + f8) * f25;
        float f30 = f3 * f12;
        float f31 = 1.0f / ((f15 + f30) + f9);
        if ((Float.floatToRawIntBits(f31) & Integer.MAX_VALUE) >= 2139095040) {
            f31 = 0.0f;
        }
        float f32 = f * f12;
        float f33 = (f32 + f19 + f7) * f31;
        float f34 = f12 * f2;
        float f35 = (f22 + f34 + f8) * f31;
        float f36 = 1.0f / ((f30 + f24) + f9);
        if ((Float.floatToRawIntBits(f36) & Integer.MAX_VALUE) < 2139095040) {
            f17 = f36;
        }
        float f37 = (f32 + f26 + f7) * f17;
        float f38 = (f34 + f28 + f8) * f17;
        sv7Var.b = Math.min(f20, Math.min(f27, Math.min(f33, f37)));
        sv7Var.c = Math.min(f23, Math.min(f29, Math.min(f35, f38)));
        sv7Var.d = Math.max(f20, Math.max(f27, Math.max(f33, f37)));
        sv7Var.e = Math.max(f23, Math.max(f29, Math.max(f35, f38)));
    }

    public static final void f(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final void g(float f, float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        double d = f * 0.017453292519943295d;
        float sin = (float) Math.sin(d);
        float cos = (float) Math.cos(d);
        float f2 = fArr[0];
        float f3 = fArr[4];
        float f4 = (sin * f3) + (cos * f2);
        float f5 = -sin;
        float f6 = f3 * cos;
        float f7 = fArr[1];
        float f8 = fArr[5];
        float f9 = (sin * f8) + (cos * f7);
        float f10 = f8 * cos;
        float f11 = fArr[2];
        float f12 = fArr[6];
        float f13 = (sin * f12) + (cos * f11);
        float f14 = f12 * cos;
        float f15 = fArr[3];
        float f16 = fArr[7];
        fArr[0] = f4;
        fArr[1] = f9;
        fArr[2] = f13;
        fArr[3] = (sin * f16) + (cos * f15);
        fArr[4] = f6 + (f2 * f5);
        fArr[5] = f10 + (f7 * f5);
        fArr[6] = f14 + (f11 * f5);
        fArr[7] = (cos * f16) + (f5 * f15);
    }

    public static final void h(float[] fArr, float f, float f2) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f2;
        fArr[5] = fArr[5] * f2;
        fArr[6] = fArr[6] * f2;
        fArr[7] = fArr[7] * f2;
        fArr[8] = fArr[8] * 1.0f;
        fArr[9] = fArr[9] * 1.0f;
        fArr[10] = fArr[10] * 1.0f;
        fArr[11] = fArr[11] * 1.0f;
    }

    public static final void i(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return;
        }
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        fArr[3] = fArr2[3];
        fArr[4] = fArr2[4];
        fArr[5] = fArr2[5];
        fArr[6] = fArr2[6];
        fArr[7] = fArr2[7];
        fArr[8] = fArr2[8];
        fArr[9] = fArr2[9];
        fArr[10] = fArr2[10];
        fArr[11] = fArr2[11];
        fArr[12] = fArr2[12];
        fArr[13] = fArr2[13];
        fArr[14] = fArr2[14];
        fArr[15] = fArr2[15];
    }

    public static final void j(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[1];
        float f4 = fArr2[4];
        float f5 = fArr[2];
        float f6 = fArr2[8];
        float f7 = f5 * f6;
        float f8 = fArr[3];
        float f9 = fArr2[12];
        float f10 = f8 * f9;
        float f11 = f10 + f7 + (f3 * f4) + (f * f2);
        float f12 = fArr2[1];
        float f13 = fArr2[5];
        float f14 = fArr2[9];
        float f15 = f5 * f14;
        float f16 = fArr2[13];
        float f17 = f8 * f16;
        float f18 = f17 + f15 + (f3 * f13) + (f * f12);
        float f19 = fArr2[2];
        float f20 = fArr2[6];
        float f21 = fArr2[10];
        float f22 = f5 * f21;
        float f23 = fArr2[14];
        float f24 = f8 * f23;
        float f25 = f24 + f22 + (f3 * f20) + (f * f19);
        float f26 = fArr2[3];
        float f27 = fArr2[7];
        float f28 = fArr2[11];
        float f29 = f5 * f28;
        float f30 = fArr2[15];
        float f31 = f8 * f30;
        float f32 = f31 + f29 + (f3 * f27) + (f * f26);
        float f33 = fArr[4];
        float f34 = fArr[5];
        float f35 = fArr[6];
        float f36 = (f35 * f6) + (f34 * f4) + (f33 * f2);
        float f37 = fArr[7];
        float f38 = (f37 * f9) + f36;
        float f39 = (f37 * f16) + (f35 * f14) + (f34 * f13) + (f33 * f12);
        float f40 = (f37 * f23) + (f35 * f21) + (f34 * f20) + (f33 * f19);
        float f41 = f35 * f28;
        float f42 = f37 * f30;
        float f43 = f42 + f41 + (f34 * f27) + (f33 * f26);
        float f44 = fArr[8];
        float f45 = fArr[9];
        float f46 = fArr[10];
        float f47 = (f46 * f6) + (f45 * f4) + (f44 * f2);
        float f48 = fArr[11];
        float f49 = (f48 * f9) + f47;
        float f50 = (f48 * f16) + (f46 * f14) + (f45 * f13) + (f44 * f12);
        float f51 = (f46 * f21) + (f45 * f20) + (f44 * f19);
        float f52 = f46 * f28;
        float f53 = f48 * f30;
        float f54 = f53 + f52 + (f45 * f27) + (f44 * f26);
        float f55 = fArr[12];
        float f56 = fArr[13];
        float f57 = (f4 * f56) + (f2 * f55);
        float f58 = fArr[14];
        float f59 = (f6 * f58) + f57;
        float f60 = fArr[15];
        float f61 = f13 * f56;
        float f62 = f14 * f58;
        float f63 = f16 * f60;
        float f64 = f20 * f56;
        float f65 = f21 * f58;
        float f66 = f23 * f60;
        float f67 = f58 * f28;
        float f68 = f60 * f30;
        fArr[0] = f11;
        fArr[1] = f18;
        fArr[2] = f25;
        fArr[3] = f32;
        fArr[4] = f38;
        fArr[5] = f39;
        fArr[6] = f40;
        fArr[7] = f43;
        fArr[8] = f49;
        fArr[9] = f50;
        fArr[10] = (f48 * f23) + f51;
        fArr[11] = f54;
        fArr[12] = (f9 * f60) + f59;
        fArr[13] = f63 + f62 + f61 + (f12 * f55);
        fArr[14] = f66 + f65 + f64 + (f19 * f55);
        fArr[15] = f68 + f67 + (f56 * f27) + (f55 * f26);
    }

    public static final void k(float[] fArr, float f, float f2) {
        if (fArr.length < 16) {
            return;
        }
        float f3 = (fArr[8] * nae.e) + (fArr[4] * f2) + (fArr[0] * f) + fArr[12];
        float f4 = (fArr[9] * nae.e) + (fArr[5] * f2) + (fArr[1] * f) + fArr[13];
        float f5 = (fArr[10] * nae.e) + (fArr[6] * f2) + (fArr[2] * f) + fArr[14];
        float f6 = fArr[3] * f;
        float f7 = fArr[11] * nae.e;
        fArr[12] = f3;
        fArr[13] = f4;
        fArr[14] = f5;
        fArr[15] = f7 + (fArr[7] * f2) + f6 + fArr[15];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l27) {
            if (!c16.i(this.a, ((l27) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        float[] fArr = this.a;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        StringBuilder x = nk2.x("\n            |", f, " ", f2, " ");
        s21.D(x, f3, " ", f4, "|\n            |");
        s21.D(x, f5, " ", f6, " ");
        s21.D(x, f7, " ", f8, "|\n            |");
        s21.D(x, f9, " ", f10, " ");
        s21.D(x, f11, " ", f12, "|\n            |");
        s21.D(x, f13, " ", f14, " ");
        x.append(f15);
        x.append(" ");
        x.append(f16);
        x.append("|\n        ");
        return l4b.y(x.toString());
    }
}
