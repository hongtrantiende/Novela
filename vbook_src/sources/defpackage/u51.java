package defpackage;

import android.graphics.Color;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u51  reason: default package */
/* loaded from: classes.dex */
public final class u51 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public /* synthetic */ u51(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public static u51 a(int i) {
        float f;
        float pow;
        led ledVar = led.k;
        float i2 = rae.i(Color.red(i));
        float i3 = rae.i(Color.green(i));
        float i4 = rae.i(Color.blue(i));
        float[][] fArr = rae.d;
        float[] fArr2 = fArr[0];
        float f2 = (fArr2[2] * i4) + (fArr2[1] * i3) + (fArr2[0] * i2);
        float[] fArr3 = fArr[1];
        float f3 = (fArr3[2] * i4) + (fArr3[1] * i3) + (fArr3[0] * i2);
        float[] fArr4 = fArr[2];
        float f4 = (i4 * fArr4[2]) + (i3 * fArr4[1]) + (i2 * fArr4[0]);
        float[][] fArr5 = rae.a;
        float[] fArr6 = fArr5[0];
        float f5 = (fArr6[2] * f4) + (fArr6[1] * f3) + (fArr6[0] * f2);
        float[] fArr7 = fArr5[1];
        float f6 = fArr7[1] * f3;
        float f7 = fArr7[2] * f4;
        float[] fArr8 = fArr5[2];
        float f8 = (f4 * fArr8[2]) + (f3 * fArr8[1]) + (f2 * fArr8[0]);
        float[] fArr9 = ledVar.g;
        float f9 = ledVar.i;
        float f10 = ledVar.d;
        float f11 = ledVar.a;
        float f12 = fArr9[0] * f5;
        float f13 = fArr9[1] * (f7 + f6 + (fArr7[0] * f2));
        float f14 = fArr9[2] * f8;
        float f15 = ledVar.h;
        float pow2 = (float) Math.pow((Math.abs(f12) * f15) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f13) * f15) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((Math.abs(f14) * f15) / 100.0d, 0.42d);
        float signum = ((Math.signum(f12) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f13) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f14) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d = signum3;
        float f16 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f17 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f18 = signum2 * 20.0f;
        float f19 = ((21.0f * signum3) + ((signum * 20.0f) + f18)) / 20.0f;
        float f20 = (((signum * 40.0f) + f18) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f17, f16)) * 180.0f) / 3.1415927f;
        if (atan2 < nae.e) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f21 = (3.1415927f * atan2) / 180.0f;
        float pow5 = ((float) Math.pow((f20 * ledVar.b) / f11, ledVar.j * f10)) * 100.0f;
        Math.sqrt(pow5 / 100.0f);
        float f22 = f11 + 4.0f;
        if (atan2 < 20.14d) {
            f = 360.0f + atan2;
        } else {
            f = atan2;
        }
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, ledVar.f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * ledVar.e) * ledVar.c) * ((float) Math.sqrt((f17 * f17) + (f16 * f16)))) / (f19 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        Math.sqrt((pow * f10) / f22);
        float f23 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((f9 * pow6 * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f21;
        return new u51(atan2, pow6, pow5, f23, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public static u51 b(float f, float f2, float f3) {
        led ledVar;
        double d;
        float f4 = led.k.d;
        Math.sqrt(f / 100.0d);
        Math.sqrt(((f2 / ((float) Math.sqrt(d))) * ledVar.d) / (ledVar.a + 4.0f));
        float f5 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((ledVar.i * f2 * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new u51(f3, f2, f, f5, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public int c(bt4 bt4Var) {
        float f;
        float f2;
        float[] fArr;
        float f3 = this.b;
        int i = (f3 > nae.e ? 1 : (f3 == nae.e ? 0 : -1));
        float f4 = this.c;
        if (i == 0 || f4 == nae.e) {
            f = 0.0f;
        } else {
            f = f3 / ((float) Math.sqrt(f4 / 100.0f));
        }
        float f5 = bt4Var.a;
        float f6 = bt4Var.h;
        float pow = f / ((float) Math.pow(1.64f - ((float) Math.pow((float) Math.pow(0.28999999165534973d, f5), 0.7300000190734863d)), 1.1111111640930176d));
        float f7 = (this.a * 3.1415927f) / 180.0f;
        float pow2 = bt4Var.b * ((float) Math.pow(f4 / 100.0f, (1.0f / bt4Var.e) / bt4Var.j));
        float cos = (((float) Math.cos(2.0f + f7)) + 3.8f) * 0.25f * 3846.1538f * bt4Var.f * bt4Var.d;
        float f8 = pow2 / bt4Var.c;
        double d = f7;
        float sin = (float) Math.sin(d);
        float cos2 = (float) Math.cos(d);
        float f9 = (((0.305f + f8) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (cos * 23.0f)));
        float f10 = cos2 * f9;
        float f11 = f9 * sin;
        float f12 = f8 * 460.0f;
        float f13 = ((288.0f * f11) + ((451.0f * f10) + f12)) / 1403.0f;
        float f14 = ((f12 - (891.0f * f10)) - (261.0f * f11)) / 1403.0f;
        float f15 = 100.0f / f6;
        float signum = Math.signum(f13) * f15 * ((float) Math.pow(Math.max((float) nae.e, (Math.abs(f13) * 27.13f) / (400.0f - Math.abs(f13))), 2.3809523582458496d));
        float signum2 = Math.signum(f14) * f15 * ((float) Math.pow(Math.max((float) nae.e, (Math.abs(f14) * 27.13f) / (400.0f - Math.abs(f14))), 2.3809523582458496d));
        float signum3 = Math.signum(((f12 - (f10 * 220.0f)) - (f11 * 6300.0f)) / 1403.0f) * f15 * ((float) Math.pow(Math.max((float) nae.e, (Math.abs(f2) * 27.13f) / (400.0f - Math.abs(f2))), 2.3809523582458496d));
        float[] fArr2 = bt4Var.g;
        float f16 = signum / fArr2[0];
        float f17 = signum2 / fArr2[1];
        float f18 = signum3 / fArr2[2];
        float[][] fArr3 = vae.b;
        float[] fArr4 = fArr3[0];
        float f19 = (fArr4[2] * f18) + (fArr4[1] * f17) + (fArr4[0] * f16);
        float[] fArr5 = fArr3[1];
        float f20 = fArr5[1] * f17;
        float f21 = fArr5[2] * f18;
        float f22 = f16 * fArr3[2][0];
        return tn1.a(f19, f21 + f20 + (fArr5[0] * f16), (f18 * fArr[2]) + (f17 * fArr[1]) + f22);
    }

    public int d(led ledVar) {
        float f;
        float[] fArr;
        float f2 = this.b;
        int i = (f2 > 0.0d ? 1 : (f2 == 0.0d ? 0 : -1));
        float f3 = this.c;
        if (i != 0) {
            double d = f3;
            if (d != 0.0d) {
                f = f2 / ((float) Math.sqrt(d / 100.0d));
                float f4 = ledVar.f;
                float f5 = ledVar.h;
                float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, f4), 0.73d), 1.1111111111111112d);
                double d2 = (this.a * 3.1415927f) / 180.0f;
                float pow2 = ledVar.a * ((float) Math.pow(f3 / 100.0d, (1.0d / ledVar.d) / ledVar.j));
                float cos = ((float) (Math.cos(2.0d + d2) + 3.8d)) * 0.25f * 3846.1538f * ledVar.e * ledVar.c;
                float f6 = pow2 / ledVar.b;
                float sin = (float) Math.sin(d2);
                float cos2 = (float) Math.cos(d2);
                float f7 = (((0.305f + f6) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (cos * 23.0f)));
                float f8 = cos2 * f7;
                float f9 = f7 * sin;
                float f10 = f6 * 460.0f;
                float f11 = ((288.0f * f9) + ((451.0f * f8) + f10)) / 1403.0f;
                float f12 = ((f10 - (891.0f * f8)) - (261.0f * f9)) / 1403.0f;
                float f13 = ((f10 - (f8 * 220.0f)) - (f9 * 6300.0f)) / 1403.0f;
                float f14 = 100.0f / f5;
                float signum = Math.signum(f11) * f14 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f11) * 27.13d) / (400.0d - Math.abs(f11))), 2.380952380952381d));
                float signum2 = Math.signum(f12) * f14 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f12) * 27.13d) / (400.0d - Math.abs(f12))), 2.380952380952381d));
                float signum3 = Math.signum(f13) * f14 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f13) * 27.13d) / (400.0d - Math.abs(f13))), 2.380952380952381d));
                float[] fArr2 = ledVar.g;
                float f15 = signum / fArr2[0];
                float f16 = signum2 / fArr2[1];
                float f17 = signum3 / fArr2[2];
                float[][] fArr3 = rae.b;
                float[] fArr4 = fArr3[0];
                float f18 = (fArr4[2] * f17) + (fArr4[1] * f16) + (fArr4[0] * f15);
                float[] fArr5 = fArr3[1];
                float f19 = fArr5[1] * f16;
                float f20 = fArr5[2] * f17;
                float f21 = f15 * fArr3[2][0];
                return tn1.a(f18, f20 + f19 + (fArr5[0] * f15), (f17 * fArr[2]) + (f16 * fArr[1]) + f21);
            }
        }
        f = nae.e;
        float f42 = ledVar.f;
        float f52 = ledVar.h;
        float pow3 = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, f42), 0.73d), 1.1111111111111112d);
        double d22 = (this.a * 3.1415927f) / 180.0f;
        float pow22 = ledVar.a * ((float) Math.pow(f3 / 100.0d, (1.0d / ledVar.d) / ledVar.j));
        float cos3 = ((float) (Math.cos(2.0d + d22) + 3.8d)) * 0.25f * 3846.1538f * ledVar.e * ledVar.c;
        float f62 = pow22 / ledVar.b;
        float sin2 = (float) Math.sin(d22);
        float cos22 = (float) Math.cos(d22);
        float f72 = (((0.305f + f62) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + (((11.0f * pow3) * cos22) + (cos3 * 23.0f)));
        float f82 = cos22 * f72;
        float f92 = f72 * sin2;
        float f102 = f62 * 460.0f;
        float f112 = ((288.0f * f92) + ((451.0f * f82) + f102)) / 1403.0f;
        float f122 = ((f102 - (891.0f * f82)) - (261.0f * f92)) / 1403.0f;
        float f132 = ((f102 - (f82 * 220.0f)) - (f92 * 6300.0f)) / 1403.0f;
        float f142 = 100.0f / f52;
        float signum4 = Math.signum(f112) * f142 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f112) * 27.13d) / (400.0d - Math.abs(f112))), 2.380952380952381d));
        float signum22 = Math.signum(f122) * f142 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f122) * 27.13d) / (400.0d - Math.abs(f122))), 2.380952380952381d));
        float signum32 = Math.signum(f132) * f142 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f132) * 27.13d) / (400.0d - Math.abs(f132))), 2.380952380952381d));
        float[] fArr22 = ledVar.g;
        float f152 = signum4 / fArr22[0];
        float f162 = signum22 / fArr22[1];
        float f172 = signum32 / fArr22[2];
        float[][] fArr32 = rae.b;
        float[] fArr42 = fArr32[0];
        float f182 = (fArr42[2] * f172) + (fArr42[1] * f162) + (fArr42[0] * f152);
        float[] fArr52 = fArr32[1];
        float f192 = fArr52[1] * f162;
        float f202 = fArr52[2] * f172;
        float f212 = f152 * fArr32[2][0];
        return tn1.a(f182, f202 + f192 + (fArr52[0] * f152), (f172 * fArr[2]) + (f162 * fArr[1]) + f212);
    }
}
