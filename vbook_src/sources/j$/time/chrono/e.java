package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class e implements ChronoLocalDateTime, j$.time.temporal.l, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    public final transient ChronoLocalDate a;
    public final transient LocalTime b;

    public e(ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.requireNonNull(localTime, "time");
        this.a = chronoLocalDate;
        this.b = localTime;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static e v(j jVar, j$.time.temporal.l lVar) {
        e eVar = (e) lVar;
        if (jVar.equals(eVar.g())) {
            return eVar;
        }
        j$.time.e.e("Chronology mismatch, required: ", jVar.p(), eVar.g().p());
        return null;
    }

    private Object writeReplace() {
        return new c0((byte) 2, this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, j$.time.temporal.l
    /* renamed from: A */
    public final e b(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            switch (d.a[((j$.time.temporal.a) qVar).ordinal()]) {
                case 1:
                    return F(this.a, 0L, 0L, 0L, j);
                case 2:
                    e N = N(this.a.b(j / 86400000000L, (j$.time.temporal.q) j$.time.temporal.a.DAYS), this.b);
                    return N.F(N.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
                case 3:
                    e N2 = N(this.a.b(j / 86400000, (j$.time.temporal.q) j$.time.temporal.a.DAYS), this.b);
                    return N2.F(N2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
                case 4:
                    return F(this.a, 0L, 0L, j, 0L);
                case 5:
                    return F(this.a, 0L, j, 0L, 0L);
                case 6:
                    return F(this.a, j, 0L, 0L, 0L);
                case 7:
                    e N3 = N(this.a.b(j / 256, (j$.time.temporal.q) j$.time.temporal.a.DAYS), this.b);
                    return N3.F(N3.a, (j % 256) * 12, 0L, 0L, 0L);
                default:
                    return N(this.a.b(j, qVar), this.b);
            }
        }
        return v(this.a.g(), qVar.v(this, j));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime E(ZoneId zoneId) {
        return i.A(zoneId, null, this);
    }

    public final e F(ChronoLocalDate chronoLocalDate, long j, long j2, long j3, long j4) {
        LocalTime I;
        int i = ((j | j2 | j3 | j4) > 0L ? 1 : ((j | j2 | j3 | j4) == 0L ? 0 : -1));
        LocalTime localTime = this.b;
        if (i == 0) {
            return N(chronoLocalDate, localTime);
        }
        long j5 = j2 / 1440;
        long j6 = j / 24;
        long j7 = (j2 % 1440) * 60000000000L;
        long a0 = localTime.a0();
        long j8 = ((j % 24) * 3600000000000L) + j7 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L) + a0;
        long floorDiv = Math.floorDiv(j8, 86400000000000L) + j6 + j5 + (j3 / 86400) + (j4 / 86400000000000L);
        long floorMod = Math.floorMod(j8, 86400000000000L);
        if (floorMod == a0) {
            I = this.b;
        } else {
            I = LocalTime.I(floorMod);
        }
        return N(chronoLocalDate.b(floorDiv, (j$.time.temporal.q) j$.time.temporal.a.DAYS), I);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, j$.time.temporal.l
    /* renamed from: I */
    public final e a(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            boolean X = ((ChronoField) temporalField).X();
            ChronoLocalDate chronoLocalDate = this.a;
            if (X) {
                return N(chronoLocalDate, this.b.a(j, temporalField));
            }
            return N(chronoLocalDate.a(j, temporalField), this.b);
        }
        return v(this.a.g(), temporalField.T(this, j));
    }

    public final e N(j$.time.temporal.l lVar, LocalTime localTime) {
        ChronoLocalDate chronoLocalDate = this.a;
        if (chronoLocalDate == lVar && this.b == localTime) {
            return this;
        }
        return new e(c.v(chronoLocalDate.g(), lVar), localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: T */
    public final e j(j$.time.temporal.m mVar) {
        if (mVar instanceof ChronoLocalDate) {
            return N((ChronoLocalDate) mVar, this.b);
        }
        boolean z = mVar instanceof LocalTime;
        ChronoLocalDate chronoLocalDate = this.a;
        if (z) {
            return N(chronoLocalDate, (LocalTime) mVar);
        }
        if (mVar instanceof e) {
            return v(chronoLocalDate.g(), (e) mVar);
        }
        return v(chronoLocalDate.g(), (e) mVar.f(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ChronoLocalDateTime) && compareTo((ChronoLocalDateTime) obj) == 0) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).X()) {
                return this.b.h(temporalField);
            }
            return this.a.h(temporalField);
        }
        return l(temporalField).a(k(temporalField), temporalField);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean i(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            if (chronoField.isDateBased() || chronoField.X()) {
                return true;
            }
            return false;
        } else if (temporalField != null && temporalField.v(this)) {
            return true;
        } else {
            return false;
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).X()) {
                return this.b.k(temporalField);
            }
            return this.a.k(temporalField);
        }
        return temporalField.N(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        TemporalAccessor temporalAccessor;
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).X()) {
                temporalAccessor = this.b;
            } else {
                temporalAccessor = this.a;
            }
            return temporalAccessor.l(temporalField);
        }
        return temporalField.A(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoLocalDate m() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final LocalTime toLocalTime() {
        return this.b;
    }

    public final String toString() {
        String chronoLocalDate = this.a.toString();
        String localTime = this.b.toString();
        return chronoLocalDate + "T" + localTime;
    }
}
