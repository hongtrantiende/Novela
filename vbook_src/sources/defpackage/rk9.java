package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rk9  reason: default package */
/* loaded from: classes.dex */
public final class rk9 {
    public static final rk9 e = new rk9(nae.e, nae.e, nae.e, nae.e);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public rk9(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static rk9 b(rk9 rk9Var, float f, float f2, float f3, int i) {
        float f4;
        if ((i & 1) != 0) {
            f = rk9Var.a;
        }
        if ((i & 2) != 0) {
            f4 = rk9Var.b;
        } else {
            f4 = Float.NEGATIVE_INFINITY;
        }
        if ((i & 4) != 0) {
            f2 = rk9Var.c;
        }
        if ((i & 8) != 0) {
            f3 = rk9Var.d;
        }
        return new rk9(f, f4, f2, f3);
    }

    public final boolean a(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        boolean z4 = false;
        if (intBitsToFloat >= this.a) {
            z = true;
        } else {
            z = false;
        }
        if (intBitsToFloat < this.c) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (intBitsToFloat2 >= this.b) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (intBitsToFloat2 < this.d) {
            z4 = true;
        }
        return z6 & z4;
    }

    public final long c() {
        float f = this.c;
        float f2 = this.a;
        return (Float.floatToRawIntBits(a82.z(f, f2, 2.0f, f2)) << 32) | (Float.floatToRawIntBits(this.d) & 4294967295L);
    }

    public final long d() {
        return (Float.floatToRawIntBits(this.a) << 32) | (Float.floatToRawIntBits(this.d) & 4294967295L);
    }

    public final long e() {
        return (Float.floatToRawIntBits(this.c) << 32) | (Float.floatToRawIntBits(this.d) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk9)) {
            return false;
        }
        rk9 rk9Var = (rk9) obj;
        if (Float.compare(this.a, rk9Var.a) == 0 && Float.compare(this.b, rk9Var.b) == 0 && Float.compare(this.c, rk9Var.c) == 0 && Float.compare(this.d, rk9Var.d) == 0) {
            return true;
        }
        return false;
    }

    public final long f() {
        float f = this.c;
        float f2 = this.a;
        float z = a82.z(f, f2, 2.0f, f2);
        float f3 = this.b;
        return (Float.floatToRawIntBits(z) << 32) | (Float.floatToRawIntBits(a82.z(this.d, f3, 2.0f, f3)) & 4294967295L);
    }

    public final float g() {
        return Math.min(Math.abs(this.c - this.a), Math.abs(this.d - this.b));
    }

    public final long h() {
        float f = this.c - this.a;
        float f2 = this.d - this.b;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + nk2.d(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final long i() {
        float f = this.c;
        float f2 = this.a;
        return (Float.floatToRawIntBits(a82.z(f, f2, 2.0f, f2)) << 32) | (Float.floatToRawIntBits(this.b) & 4294967295L);
    }

    public final long j() {
        return (Float.floatToRawIntBits(this.a) << 32) | (Float.floatToRawIntBits(this.b) & 4294967295L);
    }

    public final rk9 k(rk9 rk9Var) {
        return new rk9(Math.max(this.a, rk9Var.a), Math.max(this.b, rk9Var.b), Math.min(this.c, rk9Var.c), Math.min(this.d, rk9Var.d));
    }

    public final boolean l() {
        boolean z;
        boolean z2 = false;
        if (this.a >= this.c) {
            z = true;
        } else {
            z = false;
        }
        if (this.b >= this.d) {
            z2 = true;
        }
        return z | z2;
    }

    public final boolean m(rk9 rk9Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (this.a < rk9Var.c) {
            z = true;
        } else {
            z = false;
        }
        if (rk9Var.a < this.c) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (this.b < rk9Var.d) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (rk9Var.b < this.d) {
            z4 = true;
        }
        return z6 & z4;
    }

    public final rk9 n(float f, float f2) {
        return new rk9(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final rk9 o(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new rk9(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        String E = dce.E(this.a);
        String E2 = dce.E(this.b);
        return nk2.w(nk2.y("Rect.fromLTRB(", E, ", ", E2, ", "), dce.E(this.c), ", ", dce.E(this.d), ")");
    }
}
