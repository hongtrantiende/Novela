package j$.time;

import j$.time.chrono.ChronoLocalDate;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class o implements j$.time.temporal.o, Serializable {
    public static final o d = new o(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;
    public final int a;
    public final int b;
    public final int c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        b.c(new Object[]{j$.time.temporal.a.YEARS, j$.time.temporal.a.MONTHS, j$.time.temporal.a.DAYS});
    }

    public o(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static o a(int i, int i2, int i3) {
        if ((i | i2 | i3) == 0) {
            return d;
        }
        return new o(i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new p((byte) 14, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.a == oVar.a && this.b == oVar.b && this.c == oVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        return Integer.rotateLeft(this.c, 16) + Integer.rotateLeft(this.b, 8) + i;
    }

    public final String toString() {
        if (this == d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.l v(ChronoLocalDate chronoLocalDate) {
        j$.time.chrono.j jVar = (j$.time.chrono.j) chronoLocalDate.d(j$.time.temporal.p.b);
        if (jVar != null && !j$.time.chrono.q.c.equals(jVar)) {
            String p = jVar.p();
            throw new DateTimeException("Chronology mismatch, expected: ISO, actual: " + p);
        }
        int i = this.b;
        int i2 = this.a;
        j$.time.temporal.l lVar = chronoLocalDate;
        if (i == 0) {
            if (i2 != 0) {
                lVar = chronoLocalDate.b(i2, (j$.time.temporal.q) j$.time.temporal.a.YEARS);
            }
        } else {
            long j = (i2 * 12) + i;
            lVar = chronoLocalDate;
            if (j != 0) {
                lVar = chronoLocalDate.b(j, (j$.time.temporal.q) j$.time.temporal.a.MONTHS);
            }
        }
        int i3 = this.c;
        if (i3 != 0) {
            return lVar.b(i3, j$.time.temporal.a.DAYS);
        }
        return lVar;
    }
}
