package org.mozilla.javascript.dtoa;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class DoubleFormatter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int BQ_MASK = 2047;
    private static final long C_MIN = 4503599627370496L;
    static final long C_TINY = 3;
    static final int E_MAX = 309;
    static final int E_MIN = -323;
    static final int H = 17;
    private static final long MASK_63 = Long.MAX_VALUE;
    static final int P = 53;
    static final int Q_MAX = 971;
    static final int Q_MIN = -1074;
    private static final long T_MASK = 4503599627370495L;
    private static final int W = 11;

    private static long rop(long j, long j2, long j3) {
        long j4 = j2 & 4294967295L;
        long j5 = j2 >> 32;
        long j6 = j3 & 4294967295L;
        long j7 = j3 >> 32;
        long j8 = (j5 * j6) + ((j4 * j6) >>> 32);
        long j9 = (j5 * j7) + (j8 >> 32);
        long j10 = j9 + (((j4 * j7) + (j8 & 4294967295L)) >> 32);
        long j11 = j & 4294967295L;
        long j12 = j >> 32;
        long j13 = (j6 * j12) + ((j11 * j6) >>> 32);
        long j14 = (j12 * j7) + (j13 >> 32);
        long j15 = j14 + (((j11 * j7) + (4294967295L & j13)) >> 32);
        long j16 = ((j * j3) >>> 1) + j10;
        return (((j16 & MASK_63) + MASK_63) >>> 63) | (j15 + (j16 >>> 63));
    }

    public static Decimal toDecimal(double d) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        return toDecimalImpl(doubleToRawLongBits, T_MASK & doubleToRawLongBits, ((int) (doubleToRawLongBits >>> 52)) & BQ_MASK);
    }

    private static Decimal toDecimalFull(int i, long j, int i2, boolean z) {
        long j2;
        int flog10pow2;
        char c;
        char c2;
        char c3;
        char c4;
        boolean z2;
        long j3;
        int i3 = ((int) j) & 1;
        long j4 = j << 2;
        long j5 = j4 + 2;
        if (j == C_MIN && i != Q_MIN) {
            j2 = j4 - 1;
            flog10pow2 = MathUtils.flog10threeQuartersPow2(i);
        } else {
            j2 = j4 - 2;
            flog10pow2 = MathUtils.flog10pow2(i);
        }
        int flog2pow10 = i + MathUtils.flog2pow10(-flog10pow2) + 2;
        long g1 = MathUtils.g1(flog10pow2);
        long g0 = MathUtils.g0(flog10pow2);
        long rop = rop(g1, g0, j4 << flog2pow10);
        long rop2 = rop(g1, g0, j2 << flog2pow10);
        long rop3 = rop(g1, g0, j5 << flog2pow10);
        long j6 = rop >> 2;
        if (j6 >= 100) {
            long j7 = j6 & 4294967295L;
            long j8 = rop >> 34;
            long j9 = (2576980384L * j8) + ((j7 * 2576980384L) >>> 32);
            long j10 = ((j8 * 429496729) + (j9 >> 32) + (((j7 * 429496729) + (j9 & 4294967295L)) >> 32)) * 10;
            long j11 = j10 + 10;
            boolean z3 = true;
            c2 = 2;
            long j12 = i3;
            c = 1;
            if (rop2 + j12 > (j10 << 2)) {
                z3 = false;
            }
            if ((j11 << 2) + j12 <= rop3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 != z2) {
                if (z3) {
                    j3 = j10;
                } else {
                    j3 = j11;
                }
                return new Decimal(j3, flog10pow2, z);
            }
        } else {
            c = 1;
            c2 = 2;
        }
        long j13 = j6 + 1;
        long j14 = i3;
        if (rop2 + j14 <= (j6 << c2)) {
            c3 = c;
        } else {
            c3 = 0;
        }
        if ((j13 << c2) + j14 <= rop3) {
            c4 = c;
        } else {
            c4 = 0;
        }
        if (c3 != c4) {
            if (c3 != 0) {
                j13 = j6;
            }
            return new Decimal(j13, flog10pow2 + i2, z);
        }
        int i4 = ((rop - ((j6 + j13) << c)) > 0L ? 1 : ((rop - ((j6 + j13) << c)) == 0L ? 0 : -1));
        if (i4 < 0 || (i4 == 0 && (j6 & 1) == 0)) {
            j13 = j6;
        }
        return new Decimal(j13, flog10pow2 + i2, z);
    }

    private static Decimal toDecimalImpl(long j, long j2, int i) {
        boolean z;
        if (j < 0) {
            z = true;
        } else {
            z = false;
        }
        if (i != 0) {
            int i2 = 1075 - i;
            long j3 = j2 | C_MIN;
            if (i2 > 0 && i2 < 53) {
                long j4 = j3 >> i2;
                if ((j4 << i2) == j3) {
                    return new Decimal(j4, 0, z);
                }
            }
            return toDecimalFull(-i2, j3, 0, z);
        } else if (j2 != 0) {
            if (j2 < C_TINY) {
                return toDecimalFull(Q_MIN, j2 * 10, -1, z);
            }
            return toDecimalFull(Q_MIN, j2, 0, z);
        } else {
            return new Decimal(0L, 1, false);
        }
    }

    public static String toString(double d) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        long j = T_MASK & doubleToRawLongBits;
        int i = ((int) (doubleToRawLongBits >>> 52)) & BQ_MASK;
        if (i < BQ_MASK) {
            if (i == 0 && j == 0) {
                return "0";
            }
            return toDecimalImpl(doubleToRawLongBits, j, i).toString();
        } else if (j != 0) {
            return "NaN";
        } else {
            if (doubleToRawLongBits > 0) {
                return "Infinity";
            }
            return "-Infinity";
        }
    }
}
