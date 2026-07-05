package defpackage;

import java.math.RoundingMode;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: we3  reason: default package */
/* loaded from: classes.dex */
public abstract class we3 {
    public static final /* synthetic */ int a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d) {
        if (hse.h(d)) {
            if (d == 0.0d || 52 - Long.numberOfTrailingZeros(hse.g(d)) <= Math.getExponent(d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean b(double d) {
        if (d > 0.0d && hse.h(d)) {
            long g = hse.g(d);
            if ((g & (g - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    public static int c(double d) {
        boolean z;
        boolean b;
        RoundingMode roundingMode = RoundingMode.CEILING;
        boolean z2 = false;
        if (d > 0.0d && hse.h(d)) {
            z = true;
        } else {
            z = false;
        }
        wq9.r("x must be positive and finite", z);
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) >= -1022) {
            switch (ve3.a[roundingMode.ordinal()]) {
                case 1:
                    dye.j(b(d));
                    break;
                case 2:
                    break;
                case 3:
                    z2 = !b(d);
                    break;
                case 4:
                    if (exponent < 0) {
                        z2 = true;
                    }
                    b = b(d);
                    z2 &= !b;
                    break;
                case 5:
                    if (exponent >= 0) {
                        z2 = true;
                    }
                    b = b(d);
                    z2 &= !b;
                    break;
                case 6:
                case 7:
                case 8:
                    double longBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                    if (longBitsToDouble * longBitsToDouble > 2.0d) {
                        z2 = true;
                        break;
                    }
                    break;
                default:
                    cp8.i();
                    return 0;
            }
            if (z2) {
                return exponent + 1;
            }
            return exponent;
        }
        return c(d * 4.503599627370496E15d) - 52;
    }
}
