package j$.time;

import j$.time.chrono.ChronoLocalDate;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigInteger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class Duration implements j$.time.temporal.o, Comparable<Duration>, Serializable {
    public static final Duration c = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;
    public final long a;
    public final int b;

    static {
        BigInteger.valueOf(1000000000L);
    }

    public Duration(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static Duration A(long j, int i) {
        if ((i | j) == 0) {
            return c;
        }
        return new Duration(j, i);
    }

    public static Duration F(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (i + 1000000000);
            j2--;
        }
        return A(j2, i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new p((byte) 1, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        Duration duration2 = duration;
        int compare = Long.compare(this.a, duration2.a);
        if (compare != 0) {
            return compare;
        }
        return this.b - duration2.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.a == duration.a && this.b == duration.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public long toMillis() {
        long j = this.a;
        long j2 = this.b;
        if (j < 0) {
            j++;
            j2 -= 1000000000;
        }
        return Math.addExact(Math.multiplyExact(j, 1000L), j2 / 1000000);
    }

    public long toSeconds() {
        return this.a;
    }

    public final String toString() {
        if (this == c) {
            return "PT0S";
        }
        long j = this.a;
        if (j < 0 && this.b > 0) {
            j++;
        }
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        if (i2 == 0 && this.b == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (this.a < 0 && this.b > 0) {
            if (i2 == 0) {
                sb.append("-0");
            } else {
                sb.append(i2);
            }
        } else {
            sb.append(i2);
        }
        if (this.b > 0) {
            int length = sb.length();
            int i3 = (this.a > 0L ? 1 : (this.a == 0L ? 0 : -1));
            int i4 = this.b;
            if (i3 < 0) {
                sb.append(2000000000 - i4);
            } else {
                sb.append(i4 + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.l v(ChronoLocalDate chronoLocalDate) {
        long j = this.a;
        j$.time.temporal.l lVar = chronoLocalDate;
        if (j != 0) {
            lVar = chronoLocalDate.b(j, (j$.time.temporal.q) j$.time.temporal.a.SECONDS);
        }
        int i = this.b;
        if (i != 0) {
            return lVar.b(i, j$.time.temporal.a.NANOS);
        }
        return lVar;
    }
}
