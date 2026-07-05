package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s15  reason: default package */
/* loaded from: classes.dex */
public final class s15 implements vg8 {
    public boolean C;
    public float[] E;
    public boolean F;
    public int J;
    public kwe L;
    public boolean M;
    public boolean N;
    public boolean P;
    public p15 a;
    public final m15 b;
    public final rg c;
    public lu4 d;
    public vt4 e;
    public long f = 9223372034707292159L;
    public final float[] D = l27.a();
    public r13 G = fpe.d();
    public tc6 H = tc6.a;
    public final n61 I = new n61();
    public long K = ckc.b;
    public boolean O = true;
    public final jc Q = new jc(this, 20);

    public s15(p15 p15Var, m15 m15Var, rg rgVar, lu4 lu4Var, vt4 vt4Var) {
        this.a = p15Var;
        this.b = m15Var;
        this.c = rgVar;
        this.d = lu4Var;
        this.e = vt4Var;
    }

    public final float[] a() {
        float[] fArr = this.E;
        if (fArr == null) {
            fArr = l27.a();
            this.E = fArr;
        }
        if (!this.N) {
            if (Float.isNaN(fArr[0])) {
                return null;
            }
        } else {
            this.N = false;
            float[] b = b();
            if (this.O) {
                return b;
            }
            if (!nc2.k(b, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        }
        return fArr;
    }

    public final float[] b() {
        boolean z = this.M;
        float[] fArr = this.D;
        if (z) {
            p15 p15Var = this.a;
            long j = p15Var.z;
            r15 r15Var = p15Var.a;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = sxd.j(eg0.A(this.f));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            float U = r15Var.U();
            float R = r15Var.R();
            float V = r15Var.V();
            float L = r15Var.L();
            float N = r15Var.N();
            float d = r15Var.d();
            float B = r15Var.B();
            double d2 = V * 0.017453292519943295d;
            float sin = (float) Math.sin(d2);
            float cos = (float) Math.cos(d2);
            float f = -sin;
            float f2 = (R * cos) - (nae.e * sin);
            float f3 = (nae.e * cos) + (R * sin);
            double d3 = L * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d3);
            float cos2 = (float) Math.cos(d3);
            float f4 = -sin2;
            float f5 = sin * sin2;
            float f6 = sin * cos2;
            float f7 = cos * sin2;
            float f8 = cos * cos2;
            float f9 = (f3 * sin2) + (U * cos2);
            float f10 = (f3 * cos2) + ((-U) * sin2);
            double d4 = N * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d4);
            float cos3 = (float) Math.cos(d4);
            float f11 = -sin3;
            float f12 = sin3 * cos;
            float f13 = ((f5 * sin3) + (cos2 * cos3)) * d;
            float f14 = f12 * d;
            float f15 = ((sin3 * f6) + (cos3 * f4)) * d;
            float f16 = ((cos3 * f5) + (f11 * cos2)) * B;
            float f17 = cos * cos3 * B;
            float f18 = ((cos3 * f6) + (f11 * f4)) * B;
            float f19 = f7 * 1.0f;
            float f20 = f * 1.0f;
            float f21 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f13;
                fArr[1] = f14;
                fArr[2] = f15;
                fArr[3] = 0.0f;
                fArr[4] = f16;
                fArr[5] = f17;
                fArr[6] = f18;
                fArr[7] = 0.0f;
                fArr[8] = f19;
                fArr[9] = f20;
                fArr[10] = f21;
                fArr[11] = 0.0f;
                float f22 = -intBitsToFloat;
                fArr[12] = ((f13 * f22) - (intBitsToFloat2 * f16)) + f9 + intBitsToFloat;
                fArr[13] = ((f14 * f22) - (intBitsToFloat2 * f17)) + f2 + intBitsToFloat2;
                fArr[14] = ((f22 * f15) - (intBitsToFloat2 * f18)) + f10;
                fArr[15] = 1.0f;
            }
            this.M = false;
            this.O = pye.n(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (!this.F && !this.C) {
            this.c.invalidate();
            f(true);
        }
    }

    public final void d(long j) {
        boolean m = rg.m();
        rg rgVar = this.c;
        if (m) {
            rgVar.S(-4.0f);
        }
        p15 p15Var = this.a;
        if (!py5.b(p15Var.t, j)) {
            p15Var.t = j;
            p15Var.a.H((int) (j >> 32), p15Var.u, (int) (j & 4294967295L));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ay5.p(rgVar);
        } else {
            rgVar.invalidate();
        }
    }

    public final void e(long j) {
        if (!zy5.b(j, this.f)) {
            if (rg.m()) {
                this.c.S(-4.0f);
            }
            this.f = j;
            c();
        }
    }

    public final void f(boolean z) {
        if (z != this.F) {
            this.F = z;
            rg rgVar = this.c;
            kv7 kv7Var = rgVar.V;
            boolean z2 = rgVar.a0;
            if (!z) {
                if (!z2) {
                    kv7Var.j(this);
                    kv7 kv7Var2 = rgVar.W;
                    if (kv7Var2 != null) {
                        kv7Var2.j(this);
                    }
                }
            } else if (!z2) {
                kv7Var.a(this);
            } else {
                kv7 kv7Var3 = rgVar.W;
                if (kv7Var3 == null) {
                    kv7Var3 = new kv7();
                    rgVar.W = kv7Var3;
                }
                kv7Var3.a(this);
            }
        }
    }

    public final void g() {
        rg.m();
        if (this.F) {
            if (!ckc.a(this.K, ckc.b) && !zy5.b(this.a.u, this.f)) {
                p15 p15Var = this.a;
                long floatToRawIntBits = (Float.floatToRawIntBits(ckc.c(this.K) * ((int) (this.f & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(ckc.b(this.K) * ((int) (this.f >> 32))) << 32);
                if (!y78.d(p15Var.z, floatToRawIntBits)) {
                    p15Var.z = floatToRawIntBits;
                    p15Var.a.O(floatToRawIntBits);
                }
            }
            this.a.f(this.G, this.H, this.f, this.Q);
            f(false);
        }
    }
}
