package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tg9  reason: default package */
/* loaded from: classes3.dex */
public abstract class tg9 {
    public static final sg9 a = new Object();
    public static final e3 b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [sg9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [e3] */
    /* JADX WARN: Type inference failed for: r0v6 */
    static {
        sa4 sa4Var;
        Integer num = h26.a;
        if (num != null && num.intValue() < 34) {
            sa4Var = new sa4();
        } else {
            sa4Var = new Object();
        }
        b = sa4Var;
    }

    public abstract int a(int i);

    public double b() {
        return ((a(26) << 27) + a(27)) / 9.007199254740992E15d;
    }

    public double c(double d) {
        double b2;
        if (d > 0.0d) {
            double d2 = d - 0.0d;
            if (Double.isInfinite(d2) && Math.abs(0.0d) <= Double.MAX_VALUE && Math.abs(d) <= Double.MAX_VALUE) {
                double b3 = ((d / 2.0d) - 0.0d) * b();
                b2 = 0.0d + b3 + b3;
            } else {
                b2 = 0.0d + (b() * d2);
            }
            if (b2 >= d) {
                return Math.nextAfter(d, Double.NEGATIVE_INFINITY);
            }
            return b2;
        }
        p1a.k(bce.l(Double.valueOf(0.0d), Double.valueOf(d)));
        return 0.0d;
    }

    public abstract int d();

    public int e(int i) {
        return f(0, i);
    }

    public int f(int i, int i2) {
        int d;
        int i3;
        int i4;
        if (i2 > i) {
            int i5 = i2 - i;
            if (i5 > 0 || i5 == Integer.MIN_VALUE) {
                if (((-i5) & i5) == i5) {
                    i4 = a(31 - Integer.numberOfLeadingZeros(i5));
                } else {
                    do {
                        d = d() >>> 1;
                        i3 = d % i5;
                    } while ((i5 - 1) + (d - i3) < 0);
                    i4 = i3;
                }
                return i + i4;
            }
            while (true) {
                int d2 = d();
                if (i <= d2 && d2 < i2) {
                    return d2;
                }
            }
        } else {
            p1a.k(bce.l(Integer.valueOf(i), Integer.valueOf(i2)));
            return 0;
        }
    }

    public long g() {
        return (d() << 32) + d();
    }

    public long h(long j, long j2) {
        long g;
        long j3;
        long j4;
        int d;
        if (j2 > j) {
            long j5 = j2 - j;
            if (j5 > 0) {
                if (((-j5) & j5) == j5) {
                    int i = (int) j5;
                    int i2 = (int) (j5 >>> 32);
                    if (i != 0) {
                        d = a(31 - Integer.numberOfLeadingZeros(i));
                    } else if (i2 == 1) {
                        d = d();
                    } else {
                        j4 = (a(31 - Integer.numberOfLeadingZeros(i2)) << 32) + (d() & 4294967295L);
                    }
                    j4 = d & 4294967295L;
                } else {
                    do {
                        g = g() >>> 1;
                        j3 = g % j5;
                    } while ((j5 - 1) + (g - j3) < 0);
                    j4 = j3;
                }
                return j + j4;
            }
            while (true) {
                long g2 = g();
                if (j <= g2 && g2 < j2) {
                    return g2;
                }
            }
        } else {
            p1a.k(bce.l(Long.valueOf(j), Long.valueOf(j2)));
            return 0L;
        }
    }

    public long i() {
        return h(0L, 1000L);
    }
}
