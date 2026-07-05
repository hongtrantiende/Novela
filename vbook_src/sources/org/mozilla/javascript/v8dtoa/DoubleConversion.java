package org.mozilla.javascript.v8dtoa;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class DoubleConversion {
    private static final int kDenormalExponent = -1074;
    private static final int kExponentBias = 1075;
    private static final long kExponentMask = 9218868437227405312L;
    private static final long kHiddenBit = 4503599627370496L;
    private static final int kPhysicalSignificandSize = 52;
    private static final long kSignMask = Long.MIN_VALUE;
    private static final long kSignificandMask = 4503599627370495L;
    private static final int kSignificandSize = 53;

    private DoubleConversion() {
    }

    public static int doubleToInt32(double d) {
        long j;
        int i = (int) d;
        if (i == d) {
            return i;
        }
        long doubleToLongBits = Double.doubleToLongBits(d);
        int exponent = exponent(doubleToLongBits);
        if (exponent > -53 && exponent <= 31) {
            long significand = significand(doubleToLongBits);
            int sign = sign(doubleToLongBits);
            if (exponent < 0) {
                j = significand >> (-exponent);
            } else {
                j = significand << exponent;
            }
            return sign * ((int) j);
        }
        return 0;
    }

    private static int exponent(long j) {
        if (isDenormal(j)) {
            return kDenormalExponent;
        }
        return ((int) ((j & kExponentMask) >> 52)) - 1075;
    }

    private static boolean isDenormal(long j) {
        if ((j & kExponentMask) == 0) {
            return true;
        }
        return false;
    }

    private static int sign(long j) {
        if ((j & kSignMask) == 0) {
            return 1;
        }
        return -1;
    }

    private static long significand(long j) {
        long j2 = kSignificandMask & j;
        if (!isDenormal(j)) {
            return j2 + kHiddenBit;
        }
        return j2;
    }
}
