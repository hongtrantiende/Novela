package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fma  reason: default package */
/* loaded from: classes.dex */
public final class fma {
    public final ljc A;
    public fi8 B;
    public float a;
    public float b;
    public float q;
    public float r;
    public final f7 t;
    public final float[] u;
    public boolean v;
    public float w;
    public final List x;
    public final List y;
    public final List z;
    public float c = 0.1f;
    public float d = 0.1f;
    public float e = 1.0f;
    public float f = 1.0f;
    public final yj g = dk.a();
    public final yj h = dk.a();
    public final ni4 i = new ni4();
    public final ni4 j = new ni4();
    public final ni4 k = new ni4();
    public ni4 l = new ni4();
    public final ni4 m = new ni4();
    public final ni4 n = new ni4();
    public final ni4 o = new ni4();
    public ni4 p = new ni4();
    public final im1 s = new im1(new float[]{1.0f, nae.e, nae.e, nae.e, nae.e, nae.e, 1.0f, nae.e, nae.e, nae.e, nae.e, nae.e, 1.0f, nae.e, nae.e, nae.e, nae.e, nae.e, 1.0f, nae.e});

    public fma() {
        float[] fArr = {nae.e, nae.e, nae.e, nae.e, nae.e, nae.e, nae.e, nae.e, 1.0f};
        f7 f7Var = new f7();
        f7Var.b = fArr;
        this.t = f7Var;
        this.u = new float[]{nae.e, nae.e, nae.e, nae.e, nae.e, nae.e, nae.e, nae.e, 1.0f};
        this.w = (float) Math.hypot(this.a, this.b);
        this.x = tl1.B(new zl1(sve.d(4279308561L)), new zl1(sve.b(1118481)));
        this.y = tl1.B(new zl1(sve.d(2148602129L)), new zl1(sve.b(1118481)));
        this.z = tl1.B(new zl1(sve.b(3355443)), new zl1(sve.b(1714631475)));
        this.A = lre.c();
        this.B = fi8.a;
    }

    public final void a(float f, float f2) {
        float f3;
        float f4;
        boolean z;
        float f5 = this.a;
        if (f <= f5 / 2.0f) {
            f3 = 0.0f;
        } else {
            f3 = f5;
        }
        this.e = f3;
        float f6 = this.b;
        if (f2 <= f6 / 2.0f) {
            f4 = 0.0f;
        } else {
            f4 = f6;
        }
        this.f = f4;
        if ((f3 == nae.e && f4 == f6) || (f4 == nae.e && f3 == f5)) {
            z = true;
        } else {
            z = false;
        }
        this.v = z;
    }

    public final void b(float f, float f2) {
        int i;
        if (f == this.c && f2 == this.d) {
            return;
        }
        this.c = f;
        this.d = f2;
        float f3 = this.e;
        float f4 = (f + f3) / 2.0f;
        float f5 = this.f;
        float f6 = (f2 + f5) / 2.0f;
        float f7 = f5 - f6;
        float f8 = f3 - f4;
        ni4 ni4Var = this.j;
        ni4Var.a = f4 - ((f7 * f7) / f8);
        ni4Var.b = f5;
        ni4 ni4Var2 = this.n;
        ni4Var2.a = f3;
        if (f7 == nae.e) {
            ni4Var2.b = f6 - ((f8 * f8) / 0.1f);
        } else {
            ni4Var2.b = f6 - ((f8 * f8) / f7);
        }
        float f9 = ni4Var.a;
        float f10 = f9 - ((f3 - f9) / 2.0f);
        ni4 ni4Var3 = this.i;
        ni4Var3.a = f10;
        ni4Var3.b = f5;
        if (f > nae.e) {
            float f11 = this.a;
            if (f < f11 && (f10 < nae.e || f10 > f11)) {
                if (i < 0) {
                    ni4Var3.a = f11 - f10;
                }
                float abs = Math.abs(f3 - f);
                float abs2 = Math.abs(this.e - ((this.a * abs) / ni4Var3.a));
                this.c = abs2;
                float abs3 = Math.abs(this.f - ((Math.abs(this.f - this.d) * Math.abs(this.e - abs2)) / abs));
                this.d = abs3;
                float f12 = this.c;
                float f13 = this.e;
                float f14 = (f12 + f13) / 2.0f;
                float f15 = this.f;
                float f16 = (abs3 + f15) / 2.0f;
                float f17 = f15 - f16;
                float f18 = f13 - f14;
                ni4Var.a = f14 - ((f17 * f17) / f18);
                ni4Var.b = f15;
                ni4Var2.a = f13;
                if (f17 == nae.e) {
                    ni4Var2.b = f16 - ((f18 * f18) / 0.1f);
                } else {
                    ni4Var2.b = f16 - ((f18 * f18) / f17);
                }
                float f19 = ni4Var.a;
                ni4Var3.a = f19 - ((f13 - f19) / 2.0f);
            }
        }
        float f20 = this.e;
        ni4 ni4Var4 = this.m;
        ni4Var4.a = f20;
        float f21 = ni4Var2.b;
        float f22 = this.f;
        ni4Var4.b = f21 - ((f22 - f21) / 2.0f);
        this.r = (float) Math.hypot(this.c - f20, this.d - f22);
        float f23 = this.c;
        float f24 = this.d;
        ni4 ni4Var5 = new ni4();
        float f25 = ni4Var.b;
        float f26 = ni4Var.a;
        float f27 = (f25 - f24) / (f26 - f23);
        float f28 = ((f25 * f23) - (f24 * f26)) / (f23 - f26);
        float f29 = ni4Var4.b;
        float f30 = ni4Var3.b;
        float f31 = ni4Var4.a;
        float f32 = ni4Var3.a;
        float f33 = ((((f29 * f32) - (f30 * f31)) / (f32 - f31)) - f28) / (f27 - ((f29 - f30) / (f31 - f32)));
        ni4Var5.a = f33;
        ni4Var5.b = (f27 * f33) + f28;
        this.l = ni4Var5;
        float f34 = this.c;
        float f35 = this.d;
        ni4 ni4Var6 = new ni4();
        float f36 = ni4Var2.b;
        float f37 = ni4Var2.a;
        float f38 = (f36 - f35) / (f37 - f34);
        float f39 = ((f36 * f34) - (f35 * f37)) / (f34 - f37);
        float f40 = ni4Var4.b;
        float f41 = ni4Var3.b;
        float f42 = ni4Var4.a;
        float f43 = ni4Var3.a;
        float f44 = ((((f40 * f43) - (f41 * f42)) / (f43 - f42)) - f39) / (f38 - ((f40 - f41) / (f42 - f43)));
        ni4Var6.a = f44;
        ni4Var6.b = (f38 * f44) + f39;
        this.p = ni4Var6;
        float f45 = (ni4Var.a * 2.0f) + ni4Var3.a;
        ni4 ni4Var7 = this.l;
        ni4 ni4Var8 = this.k;
        ni4Var8.a = (f45 + ni4Var7.a) / 4.0f;
        ni4Var8.b = (((ni4Var.b * 2.0f) + ni4Var3.b) + ni4Var7.b) / 4.0f;
        float f46 = ni4Var4.a;
        ni4 ni4Var9 = this.o;
        ni4Var9.a = (((ni4Var2.a * 2.0f) + f46) + ni4Var6.a) / 4.0f;
        ni4Var9.b = (((2.0f * ni4Var2.b) + ni4Var4.b) + ni4Var6.b) / 4.0f;
    }

    public final void c(k61 k61Var, uf ufVar) {
        int i;
        int i2;
        k61Var.getClass();
        if (ufVar == null) {
            return;
        }
        ni4 ni4Var = this.i;
        float f = ni4Var.a;
        ni4 ni4Var2 = this.j;
        float f2 = ni4Var2.a;
        float abs = Math.abs(((int) ((f + f2) / 2.0f)) - f2);
        float f3 = this.m.b;
        ni4 ni4Var3 = this.n;
        float f4 = ni4Var3.b;
        float min = Math.min(abs, Math.abs(((int) ((f3 + f4) / 2.0f)) - f4));
        yj yjVar = this.h;
        yjVar.l();
        ni4 ni4Var4 = this.o;
        yjVar.i(ni4Var4.a, ni4Var4.b);
        ni4 ni4Var5 = this.k;
        yjVar.h(ni4Var5.a, ni4Var5.b);
        ni4 ni4Var6 = this.l;
        yjVar.h(ni4Var6.a, ni4Var6.b);
        yjVar.h(this.c, this.d);
        ni4 ni4Var7 = this.p;
        yjVar.h(ni4Var7.a, ni4Var7.b);
        yjVar.e();
        k61Var.i();
        k61Var.f(this.g, 1);
        k61Var.f(yjVar, 1);
        im1 im1Var = this.s;
        ljc ljcVar = this.A;
        ljcVar.q(im1Var);
        float hypot = (float) Math.hypot(this.e - ni4Var2.a, ni4Var3.b - this.f);
        float f5 = (this.e - ni4Var2.a) / hypot;
        float f6 = (ni4Var3.b - this.f) / hypot;
        float[] fArr = this.u;
        fArr[0] = 1.0f - ((2.0f * f6) * f6);
        float f7 = 2.0f * f5;
        float f8 = f6 * f7;
        fArr[1] = f8;
        fArr[3] = f8;
        fArr[4] = 1.0f - (f7 * f5);
        f7 f7Var = this.t;
        f7Var.getClass();
        f7Var.b = fArr;
        f7Var.b(new float[]{1.0f, nae.e, -ni4Var2.a, nae.e, 1.0f, -ni4Var2.b, nae.e, nae.e, 1.0f}, false);
        f7Var.b(new float[]{1.0f, nae.e, ni4Var2.a, nae.e, 1.0f, ni4Var2.b, nae.e, nae.e, 1.0f}, true);
        nl5 nl5Var = ufVar.a;
        if (nl5Var != null) {
            ((jj) nl5Var).a.prepareToDraw();
            Canvas canvas = tf.a;
            Canvas canvas2 = ((sf) k61Var).a;
            Bitmap a = ay5.a(nl5Var);
            Matrix matrix = new Matrix();
            matrix.setValues(f7Var.b);
            canvas2.drawBitmap(a, matrix, (Paint) ljcVar.b);
        }
        ljcVar.q(null);
        zbe.H(k61Var, this.q, ni4Var.a, ni4Var.b);
        boolean z = this.v;
        float f9 = ni4Var.a;
        if (z) {
            i = (int) (f9 - 1.0f);
            i2 = (int) (f9 + min + 1.0f);
            ljcVar.t(eh.e(24, (Float.floatToRawIntBits(i) << 32) | (Float.floatToRawIntBits(nae.e) & 4294967295L), (Float.floatToRawIntBits(i2) << 32) | (4294967295L & Float.floatToRawIntBits(nae.e)), this.z, null));
        } else {
            i = (int) ((f9 - min) - 1.0f);
            i2 = (int) (f9 + 1.0f);
            ljcVar.t(eh.e(24, (Float.floatToRawIntBits(i2) << 32) | (4294967295L & Float.floatToRawIntBits(nae.e)), (Float.floatToRawIntBits(i) << 32) | (Float.floatToRawIntBits(nae.e) & 4294967295L), this.z, null));
        }
        float f10 = ni4Var.b;
        k61Var.g(i, f10, i2, this.w + f10, this.A);
        ljcVar.t(null);
        k61Var.q();
    }

    public final void d(k61 k61Var, uf ufVar) {
        k61Var.getClass();
        if (ufVar == null) {
            return;
        }
        yj yjVar = this.g;
        yjVar.l();
        ni4 ni4Var = this.i;
        yjVar.i(ni4Var.a, ni4Var.b);
        ni4 ni4Var2 = this.j;
        float f = ni4Var2.a;
        float f2 = ni4Var2.b;
        ni4 ni4Var3 = this.l;
        yjVar.k(f, f2, ni4Var3.a, ni4Var3.b);
        yjVar.h(this.c, this.d);
        ni4 ni4Var4 = this.p;
        yjVar.h(ni4Var4.a, ni4Var4.b);
        ni4 ni4Var5 = this.n;
        float f3 = ni4Var5.a;
        float f4 = ni4Var5.b;
        ni4 ni4Var6 = this.m;
        yjVar.k(f3, f4, ni4Var6.a, ni4Var6.b);
        yjVar.h(this.e, this.f);
        yjVar.e();
        k61Var.i();
        k61Var.f(yjVar, 0);
        ufVar.a(k61Var);
        k61Var.q();
    }

    public final void e(k61 k61Var) {
        double atan2;
        double d;
        float f;
        int i;
        int i2;
        ljc ljcVar;
        int i3;
        int i4;
        k61Var.getClass();
        boolean z = this.v;
        ni4 ni4Var = this.j;
        if (z) {
            atan2 = Math.atan2(ni4Var.b - this.d, this.c - ni4Var.a);
        } else {
            atan2 = Math.atan2(this.d - ni4Var.b, this.c - ni4Var.a);
        }
        double d2 = 0.7853981633974483d - ((float) atan2);
        double sin = Math.sin(d2) * 35.35d;
        float cos = (float) (this.c + (Math.cos(d2) * 35.35d));
        boolean z2 = this.v;
        float f2 = this.d;
        if (z2) {
            d = f2 + sin;
        } else {
            d = f2 - sin;
        }
        float f3 = (float) d;
        yj yjVar = this.h;
        yjVar.l();
        yjVar.i(cos, f3);
        yjVar.h(this.c, this.d);
        yjVar.h(ni4Var.a, ni4Var.b);
        ni4 ni4Var2 = this.i;
        yjVar.h(ni4Var2.a, ni4Var2.b);
        yjVar.e();
        k61Var.i();
        yj yjVar2 = this.g;
        k61Var.f(yjVar2, 0);
        k61Var.f(yjVar, 1);
        boolean z3 = this.v;
        float f4 = ni4Var.a;
        ljc ljcVar2 = this.A;
        if (z3) {
            int i5 = (int) f4;
            int i6 = (int) (f4 + 25.0f);
            f = 1.0f;
            ljcVar2.t(eh.e(24, (Float.floatToRawIntBits(i5) << 32) | (Float.floatToRawIntBits(nae.e) & 4294967295L), (Float.floatToRawIntBits(i6) << 32) | (Float.floatToRawIntBits(nae.e) & 4294967295L), this.x, null));
            i = i5;
            i2 = i6;
        } else {
            f = 1.0f;
            i = (int) (f4 - 25.0f);
            int i7 = (int) (f4 + 1.0f);
            ljcVar2.t(eh.e(24, (Float.floatToRawIntBits(i7) << 32) | (Float.floatToRawIntBits(nae.e) & 4294967295L), (Float.floatToRawIntBits(i) << 32) | (Float.floatToRawIntBits(nae.e) & 4294967295L), this.x, null));
            i2 = i7;
        }
        zbe.H(k61Var, (float) ((((float) Math.atan2(this.c - ni4Var.a, ni4Var.b - this.d)) * 180.0d) / 3.141592653589793d), ni4Var.a, ni4Var.b);
        float f5 = ni4Var.b;
        k61Var.g(i, f5 - this.w, i2, f5, this.A);
        k61Var.q();
        yjVar.l();
        yjVar.i(cos, f3);
        yjVar.h(this.c, this.d);
        ni4 ni4Var3 = this.n;
        yjVar.h(ni4Var3.a, ni4Var3.b);
        ni4 ni4Var4 = this.m;
        yjVar.h(ni4Var4.a, ni4Var4.b);
        yjVar.e();
        k61Var.i();
        k61Var.f(yjVar2, 0);
        k61Var.f(yjVar, 1);
        boolean z4 = this.v;
        float f6 = ni4Var3.b;
        if (z4) {
            i3 = (int) f6;
            i4 = (int) (f6 + 25.0f);
            ljcVar = ljcVar2;
            ljcVar.t(eh.e(24, (Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(i3) & 4294967295L), (Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(i4) & 4294967295L), this.y, null));
        } else {
            ljcVar = ljcVar2;
            i3 = (int) (f6 - 25.0f);
            i4 = (int) (f6 + f);
            ljcVar.t(eh.e(24, (Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(i4) & 4294967295L), (Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(i3) & 4294967295L), this.y, null));
        }
        zbe.H(k61Var, (float) ((((float) Math.atan2(ni4Var3.b - this.d, ni4Var3.a - this.c)) * 180.0d) / 3.141592653589793d), ni4Var3.a, ni4Var3.b);
        float f7 = ni4Var3.b;
        if (f7 < nae.e) {
            f7 -= this.b;
        }
        double hypot = Math.hypot(ni4Var3.a, f7);
        float f8 = this.w;
        int i8 = (hypot > f8 ? 1 : (hypot == f8 ? 0 : -1));
        float f9 = ni4Var3.a;
        if (i8 > 0) {
            k61Var.g((float) ((f9 - 25.0f) - hypot), i3, (float) ((f9 + f8) - hypot), i4, this.A);
        } else {
            k61Var.g(f9 - f8, i3, f9, i4, this.A);
        }
        ljcVar.t(null);
        k61Var.q();
    }

    public final void f(k61 k61Var, uf ufVar) {
        int i;
        int i2;
        k61Var.getClass();
        if (ufVar == null) {
            return;
        }
        yj yjVar = this.h;
        yjVar.l();
        ni4 ni4Var = this.i;
        yjVar.i(ni4Var.a, ni4Var.b);
        ni4 ni4Var2 = this.k;
        yjVar.h(ni4Var2.a, ni4Var2.b);
        ni4 ni4Var3 = this.o;
        yjVar.h(ni4Var3.a, ni4Var3.b);
        ni4 ni4Var4 = this.m;
        yjVar.h(ni4Var4.a, ni4Var4.b);
        yjVar.h(this.e, this.f);
        yjVar.e();
        this.q = (float) ((Math.atan2(this.j.a - this.e, this.n.b - this.f) * 180.0d) / 3.141592653589793d);
        boolean z = this.v;
        float f = ni4Var.a;
        ljc ljcVar = this.A;
        if (z) {
            i = (int) f;
            i2 = (int) ((this.r / 4.0f) + f);
            ljcVar.t(eh.e(24, (Float.floatToRawIntBits(i) << 32) | (Float.floatToRawIntBits(nae.e) & 4294967295L), (Float.floatToRawIntBits(i2) << 32) | (Float.floatToRawIntBits(nae.e) & 4294967295L), this.x, null));
        } else {
            i = (int) (f - (this.r / 4.0f));
            i2 = (int) f;
            ljcVar.t(eh.e(24, (Float.floatToRawIntBits(i2) << 32) | (Float.floatToRawIntBits(nae.e) & 4294967295L), (Float.floatToRawIntBits(i) << 32) | (Float.floatToRawIntBits(nae.e) & 4294967295L), this.x, null));
        }
        k61Var.i();
        k61Var.f(this.g, 1);
        k61Var.f(yjVar, 1);
        ufVar.a(k61Var);
        zbe.H(k61Var, this.q, ni4Var.a, ni4Var.b);
        ljcVar.q(null);
        float f2 = ni4Var.b;
        k61Var.g(i, f2, i2, this.w + f2, this.A);
        ljcVar.t(null);
        k61Var.q();
    }
}
