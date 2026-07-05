package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public interface ChronoLocalDateTime<D extends ChronoLocalDate> extends j$.time.temporal.l, j$.time.temporal.m, Comparable<ChronoLocalDateTime<?>> {
    ChronoZonedDateTime E(ZoneId zoneId);

    @Override // j$.time.temporal.l
    ChronoLocalDateTime a(long j, TemporalField temporalField);

    @Override // j$.time.temporal.l
    ChronoLocalDateTime b(long j, j$.time.temporal.q qVar);

    @Override // j$.time.temporal.l
    default ChronoLocalDateTime c(long j, j$.time.temporal.q qVar) {
        return e.v(g(), super.c(j, qVar));
    }

    @Override // java.lang.Comparable
    default int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        int compareTo = m().compareTo(chronoLocalDateTime.m());
        if (compareTo == 0 && (compareTo = toLocalTime().compareTo(chronoLocalDateTime.toLocalTime())) == 0) {
            return ((a) g()).p().compareTo(chronoLocalDateTime.g().p());
        }
        return compareTo;
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object d(TemporalQuery temporalQuery) {
        if (temporalQuery != j$.time.temporal.p.a && temporalQuery != j$.time.temporal.p.e && temporalQuery != j$.time.temporal.p.d) {
            if (temporalQuery == j$.time.temporal.p.g) {
                return toLocalTime();
            }
            if (temporalQuery == j$.time.temporal.p.b) {
                return g();
            }
            if (temporalQuery == j$.time.temporal.p.c) {
                return j$.time.temporal.a.NANOS;
            }
            return temporalQuery.queryFrom(this);
        }
        return null;
    }

    @Override // j$.time.temporal.m
    default j$.time.temporal.l f(j$.time.temporal.l lVar) {
        return lVar.a(m().toEpochDay(), ChronoField.EPOCH_DAY).a(toLocalTime().a0(), ChronoField.NANO_OF_DAY);
    }

    default j g() {
        return m().g();
    }

    @Override // j$.time.temporal.l
    /* renamed from: j */
    default ChronoLocalDateTime e(j$.time.temporal.m mVar) {
        return e.v(g(), mVar.f(this));
    }

    ChronoLocalDate m();

    LocalTime toLocalTime();

    default long u(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((m().toEpochDay() * 86400) + toLocalTime().b0()) - zoneOffset.b;
    }
}
