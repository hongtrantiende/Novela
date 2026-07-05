package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public interface ChronoLocalDate extends j$.time.temporal.l, j$.time.temporal.m, Comparable<ChronoLocalDate> {
    default ChronoLocalDateTime K(LocalTime localTime) {
        return new e(this, localTime);
    }

    default k M() {
        return g().B(h(ChronoField.ERA));
    }

    default ChronoLocalDate P(j$.time.temporal.o oVar) {
        return c.v(g(), oVar.v(this));
    }

    default int S() {
        if (x()) {
            return 366;
        }
        return 365;
    }

    @Override // j$.time.temporal.l
    default ChronoLocalDate a(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return c.v(g(), temporalField.T(this, j));
        }
        throw new DateTimeException(j$.time.c.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.l
    default ChronoLocalDate b(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return c.v(g(), qVar.v(this, j));
        }
        j$.time.e.d("Unsupported unit: ", qVar);
        return null;
    }

    @Override // j$.time.temporal.l
    default ChronoLocalDate c(long j, j$.time.temporal.q qVar) {
        return c.v(g(), super.c(j, qVar));
    }

    @Override // java.lang.Comparable
    default int compareTo(ChronoLocalDate chronoLocalDate) {
        int compare = Long.compare(toEpochDay(), chronoLocalDate.toEpochDay());
        if (compare == 0) {
            return ((a) g()).p().compareTo(chronoLocalDate.g().p());
        }
        return compare;
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object d(TemporalQuery temporalQuery) {
        if (temporalQuery != j$.time.temporal.p.a && temporalQuery != j$.time.temporal.p.e && temporalQuery != j$.time.temporal.p.d && temporalQuery != j$.time.temporal.p.g) {
            if (temporalQuery == j$.time.temporal.p.b) {
                return g();
            }
            if (temporalQuery == j$.time.temporal.p.c) {
                return j$.time.temporal.a.DAYS;
            }
            return temporalQuery.queryFrom(this);
        }
        return null;
    }

    boolean equals(Object obj);

    @Override // j$.time.temporal.m
    default j$.time.temporal.l f(j$.time.temporal.l lVar) {
        return lVar.a(toEpochDay(), ChronoField.EPOCH_DAY);
    }

    j g();

    int hashCode();

    @Override // j$.time.temporal.TemporalAccessor
    default boolean i(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).isDateBased();
        }
        if (temporalField != null && temporalField.v(this)) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.l
    /* renamed from: j */
    default ChronoLocalDate e(j$.time.temporal.m mVar) {
        return c.v(g(), mVar.f(this));
    }

    default long toEpochDay() {
        return k(ChronoField.EPOCH_DAY);
    }

    String toString();

    default boolean x() {
        return g().U(k(ChronoField.YEAR));
    }
}
