package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gvb  reason: default package */
/* loaded from: classes.dex */
public final class gvb {
    public final fvb a;
    public sc6 b = null;
    public sc6 c;

    public gvb(fvb fvbVar, sc6 sc6Var) {
        this.a = fvbVar;
        this.c = sc6Var;
    }

    public final long a(long j) {
        rk9 rk9Var;
        sc6 sc6Var = this.b;
        rk9 rk9Var2 = rk9.e;
        if (sc6Var != null) {
            if (sc6Var.t()) {
                sc6 sc6Var2 = this.c;
                if (sc6Var2 != null) {
                    rk9Var = sc6Var2.g0(sc6Var, true);
                } else {
                    rk9Var = null;
                }
            } else {
                rk9Var = rk9Var2;
            }
            if (rk9Var != null) {
                rk9Var2 = rk9Var;
            }
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        float f = rk9Var2.a;
        if (intBitsToFloat >= f) {
            float intBitsToFloat2 = Float.intBitsToFloat(i);
            f = rk9Var2.c;
            if (intBitsToFloat2 <= f) {
                f = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat3 = Float.intBitsToFloat(i2);
        float f2 = rk9Var2.b;
        if (intBitsToFloat3 >= f2) {
            float intBitsToFloat4 = Float.intBitsToFloat(i2);
            f2 = rk9Var2.d;
            if (intBitsToFloat4 <= f2) {
                f2 = Float.intBitsToFloat(i2);
            }
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public final int b(boolean z, long j) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    public final boolean c(long j) {
        long d = d(a(j));
        float intBitsToFloat = Float.intBitsToFloat((int) (4294967295L & d));
        fvb fvbVar = this.a;
        int e = fvbVar.b.e(intBitsToFloat);
        int i = (int) (d >> 32);
        if (Float.intBitsToFloat(i) >= fvbVar.g(e) && Float.intBitsToFloat(i) <= fvbVar.h(e)) {
            return true;
        }
        return false;
    }

    public final long d(long j) {
        sc6 sc6Var;
        sc6 sc6Var2 = this.b;
        if (sc6Var2 != null) {
            sc6 sc6Var3 = null;
            if (!sc6Var2.t()) {
                sc6Var2 = null;
            }
            if (sc6Var2 != null && (sc6Var = this.c) != null) {
                if (sc6Var.t()) {
                    sc6Var3 = sc6Var;
                }
                if (sc6Var3 != null) {
                    return sc6Var2.e0(sc6Var3, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        sc6 sc6Var;
        sc6 sc6Var2 = this.b;
        if (sc6Var2 != null) {
            sc6 sc6Var3 = null;
            if (!sc6Var2.t()) {
                sc6Var2 = null;
            }
            if (sc6Var2 != null && (sc6Var = this.c) != null) {
                if (sc6Var.t()) {
                    sc6Var3 = sc6Var;
                }
                if (sc6Var3 != null) {
                    return sc6Var3.e0(sc6Var2, j);
                }
            }
        }
        return j;
    }
}
