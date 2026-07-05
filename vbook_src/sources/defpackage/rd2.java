package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rd2  reason: default package */
/* loaded from: classes.dex */
public final class rd2 implements mn3 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public rd2(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) {
            StringBuilder x = nk2.x("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", f, ", ", f2, ", ");
            x.append(f3);
            x.append(", ");
            x.append(f4);
            x.append(".");
            g39.a(x.toString());
        }
        float[] fArr = new float[5];
        float f5 = (f2 - nae.e) * 3.0f;
        float f6 = (f4 - f2) * 3.0f;
        float f7 = (1.0f - f4) * 3.0f;
        int n = vye.n(f5, f6, f7, fArr);
        float f8 = (f6 - f5) * 2.0f;
        int t = vye.t((-f8) / (((f7 - f6) * 2.0f) - f8), fArr, n) + n;
        float min = Math.min((float) nae.e, 1.0f);
        float max = Math.max((float) nae.e, 1.0f);
        for (int i = 0; i < t; i++) {
            float l = vye.l(nae.e, f2, f4, 1.0f, fArr[i]);
            min = Math.min(min, l);
            max = Math.max(max, l);
        }
        long a = wi4.a(min, max);
        this.e = Float.intBitsToFloat((int) (a >> 32));
        this.f = Float.intBitsToFloat((int) (a & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rd2) {
            rd2 rd2Var = (rd2) obj;
            if (this.a == rd2Var.a && this.b == rd2Var.b && this.c == rd2Var.c && this.d == rd2Var.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.mn3
    public final float f(float f) {
        if (f > nae.e && f < 1.0f) {
            float max = Math.max(f, 1.1920929E-7f);
            float f2 = nae.e - max;
            float f3 = this.a;
            float f4 = this.c;
            float m = vye.m(f2, f3 - max, f4 - max, 1.0f - max);
            boolean isNaN = Float.isNaN(m);
            float f5 = this.d;
            float f6 = this.b;
            if (!isNaN) {
                float f7 = ((((((f6 - f5) + 0.33333334f) * m) + (f5 - (2.0f * f6))) * m) + f6) * 3.0f * m;
                float f8 = this.e;
                if (f7 < f8) {
                    f7 = f8;
                }
                float f9 = this.f;
                if (f7 > f9) {
                    return f9;
                }
                return f7;
            }
            StringBuilder x = nk2.x("The cubic curve with parameters (", f3, ", ", f6, ", ");
            s21.D(x, f4, ", ", f5, ") has no solution at ");
            x.append(f);
            throw new IllegalArgumentException(x.toString());
        }
        return f;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + nk2.d(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder x = nk2.x("CubicBezierEasing(a=", this.a, ", b=", this.b, ", c=");
        x.append(this.c);
        x.append(", d=");
        x.append(this.d);
        x.append(")");
        return x.toString();
    }
}
