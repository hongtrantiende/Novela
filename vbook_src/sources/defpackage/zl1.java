package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zl1  reason: default package */
/* loaded from: classes.dex */
public final class zl1 {
    public static final long b = sve.d(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final /* synthetic */ int j = 0;
    public final long a;

    static {
        sve.d(4282664004L);
        c = sve.d(4287137928L);
        d = sve.d(4291611852L);
        e = sve.d(4294967295L);
        f = sve.d(4294901760L);
        sve.d(4278255360L);
        g = sve.d(4278190335L);
        sve.d(4294967040L);
        sve.d(4278255615L);
        sve.d(4294902015L);
        h = sve.b(0);
        float[] fArr = wm1.a;
        i = sve.a(nae.e, nae.e, nae.e, nae.e, wm1.u);
    }

    public /* synthetic */ zl1(long j2) {
        this.a = j2;
    }

    public static final long a(long j2, sm1 sm1Var) {
        b02 b02Var;
        sm1 f2 = f(j2);
        int i2 = f2.c;
        int i3 = sm1Var.c;
        if ((i2 | i3) < 0) {
            b02Var = cwe.g(f2, sm1Var);
        } else {
            wu7 wu7Var = c02.a;
            int i4 = i2 | (i3 << 6);
            Object b2 = wu7Var.b(i4);
            if (b2 == null) {
                b2 = cwe.g(f2, sm1Var);
                wu7Var.i(i4, b2);
            }
            b02Var = (b02) b2;
        }
        return b02Var.a(j2);
    }

    public static long b(float f2, long j2) {
        return sve.a(h(j2), g(j2), e(j2), f2, f(j2));
    }

    public static final boolean c(long j2, long j3) {
        if (j2 == j3) {
            return true;
        }
        return false;
    }

    public static final float d(long j2) {
        float x;
        float f2;
        if ((63 & j2) == 0) {
            x = (float) fce.x((j2 >>> 56) & 255);
            f2 = 255.0f;
        } else {
            x = (float) fce.x((j2 >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return x / f2;
    }

    public static final float e(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) fce.x((j2 >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 16) & 65535);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 == 0) {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - qi4.a;
                if (i5 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        } else {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + Token.ASSIGN_MOD;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final sm1 f(long j2) {
        float[] fArr = wm1.a;
        return wm1.y[(int) (j2 & 63)];
    }

    public static final float g(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) fce.x((j2 >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 32) & 65535);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 == 0) {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - qi4.a;
                if (i5 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        } else {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + Token.ASSIGN_MOD;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final float h(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) fce.x((j2 >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 48) & 65535);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 == 0) {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - qi4.a;
                if (i5 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        } else {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + Token.ASSIGN_MOD;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static String i(long j2) {
        float h2 = h(j2);
        float g2 = g(j2);
        float e2 = e(j2);
        float d2 = d(j2);
        String str = f(j2).a;
        StringBuilder x = nk2.x("Color(", h2, ", ", g2, ", ");
        s21.D(x, e2, ", ", d2, ", ");
        return s21.q(x, str, ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zl1) {
            if (this.a != ((zl1) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final /* synthetic */ long j() {
        return this.a;
    }

    public final String toString() {
        return i(this.a);
    }
}
