package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r13  reason: default package */
/* loaded from: classes.dex */
public interface r13 {
    default float B0(float f) {
        return f / f();
    }

    float G0();

    default float L0(float f) {
        return f() * f;
    }

    default long P(float f) {
        float G0;
        float[] fArr = op4.a;
        if (G0() >= 1.03f) {
            np4 a = op4.a(G0());
            if (a != null) {
                G0 = a.a(f);
            } else {
                G0 = f / G0();
            }
            return zr1.x(G0, 4294967296L);
        }
        return zr1.x(f / G0(), 4294967296L);
    }

    default long Q(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        return ote.a(B0(Float.intBitsToFloat((int) (j >> 32))), B0(Float.intBitsToFloat((int) (j & 4294967295L))));
    }

    default int X0(float f) {
        float L0 = L0(f);
        if (Float.isInfinite(L0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(L0);
    }

    default float c0(long j) {
        if (!f4c.a(e4c.b(j), 4294967296L)) {
            nv5.b("Only Sp can convert to Px");
        }
        float[] fArr = op4.a;
        if (G0() >= 1.03f) {
            np4 a = op4.a(G0());
            if (a == null) {
                return G0() * e4c.c(j);
            }
            return a.b(e4c.c(j));
        }
        return G0() * e4c.c(j);
    }

    float f();

    default long f1(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        return (Float.floatToRawIntBits(L0(ug3.b(j))) << 32) | (Float.floatToRawIntBits(L0(ug3.a(j))) & 4294967295L);
    }

    default float k1(long j) {
        if (!f4c.a(e4c.b(j), 4294967296L)) {
            nv5.b("Only Sp can convert to Px");
        }
        return L0(c0(j));
    }

    default long p0(int i) {
        return P(y0(i));
    }

    default long r0(float f) {
        return P(B0(f));
    }

    default float y0(int i) {
        return i / f();
    }
}
