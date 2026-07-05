package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public interface ChronoZonedDateTime<D extends ChronoLocalDate> extends j$.time.temporal.l, Comparable<ChronoZonedDateTime<?>> {
    ChronoZonedDateTime D(ZoneId zoneId);

    ZoneId J();

    default long V() {
        return ((m().toEpochDay() * 86400) + toLocalTime().b0()) - n().b;
    }

    @Override // j$.time.temporal.l
    ChronoZonedDateTime a(long j, TemporalField temporalField);

    @Override // j$.time.temporal.l
    ChronoZonedDateTime b(long j, j$.time.temporal.q qVar);

    @Override // j$.time.temporal.l
    default ChronoZonedDateTime c(long j, j$.time.temporal.q qVar) {
        return i.v(g(), super.c(j, qVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object d(TemporalQuery temporalQuery) {
        if (temporalQuery != j$.time.temporal.p.e && temporalQuery != j$.time.temporal.p.a) {
            if (temporalQuery == j$.time.temporal.p.d) {
                return n();
            }
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
        return J();
    }

    default j g() {
        return m().g();
    }

    @Override // j$.time.temporal.TemporalAccessor
    default int h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = g.a[((ChronoField) temporalField).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return w().h(temporalField);
                }
                return n().b;
            }
            throw new DateTimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return super.h(temporalField);
    }

    @Override // j$.time.temporal.l
    /* renamed from: j */
    default ChronoZonedDateTime e(j$.time.temporal.m mVar) {
        return i.v(g(), mVar.f(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long k(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = g.a[((ChronoField) temporalField).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return w().k(temporalField);
                }
                return n().b;
            }
            return V();
        }
        return temporalField.N(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default j$.time.temporal.s l(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField != ChronoField.INSTANT_SECONDS && temporalField != ChronoField.OFFSET_SECONDS) {
                return w().l(temporalField);
            }
            return ((ChronoField) temporalField).b;
        }
        return temporalField.A(this);
    }

    default ChronoLocalDate m() {
        return w().m();
    }

    ZoneOffset n();

    @Override // java.lang.Comparable
    /* renamed from: r */
    default int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        int compare = Long.compare(V(), chronoZonedDateTime.V());
        if (compare == 0 && (compare = toLocalTime().d - chronoZonedDateTime.toLocalTime().d) == 0 && (compare = w().compareTo(chronoZonedDateTime.w())) == 0 && (compare = J().p().compareTo(chronoZonedDateTime.J().p())) == 0) {
            return ((a) g()).p().compareTo(chronoZonedDateTime.g().p());
        }
        return compare;
    }

    default Instant toInstant() {
        return Instant.ofEpochSecond(V(), toLocalTime().d);
    }

    default LocalTime toLocalTime() {
        return w().toLocalTime();
    }

    ChronoLocalDateTime w();
}
