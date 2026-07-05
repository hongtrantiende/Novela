package j$.time.chrono;

import j$.time.temporal.ChronoField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class f implements j$.time.temporal.o, Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    public final j a;
    public final int b;
    public final int c;
    public final int d;

    static {
        j$.time.b.c(new Object[]{j$.time.temporal.a.YEARS, j$.time.temporal.a.MONTHS, j$.time.temporal.a.DAYS});
    }

    public f(j jVar, int i, int i2, int i3) {
        this.a = jVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.b == fVar.b && this.c == fVar.c && this.d == fVar.d && this.a.equals(fVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int rotateLeft = Integer.rotateLeft(this.c, 8) + this.b;
        return this.a.hashCode() ^ (Integer.rotateLeft(this.d, 16) + rotateLeft);
    }

    public final String toString() {
        if (this.b == 0 && this.c == 0 && this.d == 0) {
            String jVar = this.a.toString();
            return jVar + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.toString());
        sb.append(" P");
        int i = this.b;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.c;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.d;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.l v(ChronoLocalDate chronoLocalDate) {
        long j;
        j$.time.temporal.l lVar;
        j jVar = (j) chronoLocalDate.d(j$.time.temporal.p.b);
        if (jVar != null && !this.a.equals(jVar)) {
            j$.time.e.f("Chronology mismatch, expected: ", this.a.p(), ", actual: ", jVar.p());
            return null;
        }
        if (this.c == 0) {
            int i = this.b;
            lVar = chronoLocalDate;
            if (i != 0) {
                lVar = chronoLocalDate.b(i, (j$.time.temporal.q) j$.time.temporal.a.YEARS);
            }
        } else {
            j$.time.temporal.s y = this.a.y(ChronoField.MONTH_OF_YEAR);
            if (y.a == y.b && y.c == y.d && y.d()) {
                j = (y.d - y.a) + 1;
            } else {
                j = -1;
            }
            int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            int i3 = this.b;
            j$.time.temporal.l lVar2 = chronoLocalDate;
            if (i2 > 0) {
                lVar = chronoLocalDate.b((i3 * j) + this.c, (j$.time.temporal.q) j$.time.temporal.a.MONTHS);
            } else {
                if (i3 != 0) {
                    lVar2 = chronoLocalDate.b(i3, (j$.time.temporal.q) j$.time.temporal.a.YEARS);
                }
                lVar = lVar2.b(this.c, j$.time.temporal.a.MONTHS);
            }
        }
        int i4 = this.d;
        if (i4 != 0) {
            return lVar.b(i4, j$.time.temporal.a.DAYS);
        }
        return lVar;
    }

    public Object writeReplace() {
        return new c0((byte) 9, this);
    }
}
