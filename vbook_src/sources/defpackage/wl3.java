package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wl3  reason: default package */
/* loaded from: classes3.dex */
public final class wl3 implements Comparable {
    public static final hq7 b = new Object();
    public static final long c = jue.F(4611686018427387903L);
    public static final long d = jue.F(-4611686018427387903L);
    public static final long e = 9223372036854759646L;
    public final long a;

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long C = jue.C(j, j3);
        if (-4611686018426L <= C && C < 4611686018427L) {
            return jue.H((C * 1000000) + (j2 - (j3 * 1000000)));
        }
        return jue.F(C);
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String r0 = k4b.r0(i3, String.valueOf(i2));
            int i4 = -1;
            int length = r0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (r0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (!z && i6 < 3) {
                sb.append((CharSequence) r0, 0, i6);
            } else {
                sb.append((CharSequence) r0, 0, ((i4 + 3) / 3) * 3);
            }
        }
        sb.append(str);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j) & 1) - (((int) j2) & 1);
            if (j < 0) {
                return -i;
            }
            return i;
        }
        return c16.m(j, j2);
    }

    public static final boolean d(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final long e(long j) {
        if ((((int) j) & 1) == 1 && !g(j)) {
            return j >> 1;
        }
        return i(j, am3.MILLISECONDS);
    }

    public static final int f(long j) {
        long j2;
        if (g(j)) {
            return 0;
        }
        if ((((int) j) & 1) == 1) {
            j2 = ((j >> 1) % 1000) * 1000000;
        } else {
            j2 = (j >> 1) % 1000000000;
        }
        return (int) j2;
    }

    public static final boolean g(long j) {
        if (j != c && j != d) {
            return false;
        }
        return true;
    }

    public static final long h(long j, long j2) {
        int i = ((int) j) & 1;
        if (i == (((int) j2) & 1)) {
            if (i == 0) {
                long j3 = (j >> 1) + (j2 >> 1);
                if (-4611686018426999999L <= j3 && j3 < 4611686018427000000L) {
                    return jue.H(j3);
                }
                return jue.F(j3 / 1000000);
            }
            long C = jue.C(j >> 1, j2 >> 1);
            if (C != 9223372036854759646L) {
                if (C != 4611686018427387903L && C != -4611686018427387903L) {
                    return jue.G(C);
                }
                return jue.F(C);
            }
            vs.m("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        } else if (i == 1) {
            return a(j >> 1, j2 >> 1);
        } else {
            return a(j2 >> 1, j >> 1);
        }
    }

    public static final long i(long j, am3 am3Var) {
        am3 am3Var2;
        if (j == c) {
            return Long.MAX_VALUE;
        }
        if (j == d) {
            return Long.MIN_VALUE;
        }
        long j2 = j >> 1;
        if ((((int) j) & 1) == 0) {
            am3Var2 = am3.NANOSECONDS;
        } else {
            am3Var2 = am3.MILLISECONDS;
        }
        return am3Var.a.convert(j2, am3Var2.a);
    }

    public static String j(long j) {
        boolean z;
        int i;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i4 == 0) {
            return "0s";
        }
        if (j == c) {
            return "Infinity";
        }
        if (j == d) {
            return "-Infinity";
        }
        int i5 = 0;
        if (i4 < 0) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (i4 < 0) {
            j = k(j);
        }
        long i6 = i(j, am3.DAYS);
        if (g(j)) {
            i = 0;
        } else {
            i = (int) (i(j, am3.HOURS) % 24);
        }
        if (g(j)) {
            i2 = 0;
        } else {
            i2 = (int) (i(j, am3.MINUTES) % 60);
        }
        if (g(j)) {
            i3 = 0;
        } else {
            i3 = (int) (i(j, am3.SECONDS) % 60);
        }
        int f = f(j);
        if (i6 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i2 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i3 == 0 && f == 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z2) {
            sb.append(i6);
            sb.append('d');
            i5 = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i7 = i5 + 1;
            if (i5 > 0) {
                sb.append(' ');
            }
            sb.append(i);
            sb.append('h');
            i5 = i7;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i8 = i5 + 1;
            if (i5 > 0) {
                sb.append(' ');
            }
            sb.append(i2);
            sb.append('m');
            i5 = i8;
        }
        if (z5) {
            int i9 = i5 + 1;
            if (i5 > 0) {
                sb.append(' ');
            }
            if (i3 == 0 && !z2 && !z3 && !z4) {
                if (f >= 1000000) {
                    b(sb, f / 1000000, f % 1000000, 6, "ms", false);
                } else if (f >= 1000) {
                    b(sb, f / 1000, f % 1000, 3, "us", false);
                } else {
                    sb.append(f);
                    sb.append("ns");
                }
            } else {
                b(sb, i3, f, 9, "s", false);
            }
            i5 = i9;
        }
        if (z && i5 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long k(long j) {
        long j2 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        int i = yl3.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.a, ((wl3) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wl3) {
            if (this.a != ((wl3) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return j(this.a);
    }
}
