package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class OffsetDateTime implements j$.time.temporal.l, j$.time.temporal.m, Comparable<OffsetDateTime>, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 2287754244819255394L;
    public final LocalDateTime a;
    public final ZoneOffset b;

    static {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.MAX;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.a = localDateTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static OffsetDateTime v(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        return new OffsetDateTime(LocalDateTime.I(instant.getEpochSecond(), instant.getNano(), offset), offset);
    }

    private Object writeReplace() {
        return new p((byte) 10, this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: A */
    public final OffsetDateTime b(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return F(this.a.b(j, qVar), this.b);
        }
        return (OffsetDateTime) qVar.v(this, j);
    }

    public final OffsetDateTime F(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        if (this.a == localDateTime && this.b.equals(zoneOffset)) {
            return this;
        }
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i = m.a[chronoField.ordinal()];
            LocalDateTime localDateTime = this.a;
            if (i != 1) {
                if (i != 2) {
                    return F(localDateTime.a(j, temporalField), this.b);
                }
                return F(localDateTime, ZoneOffset.ofTotalSeconds(chronoField.b.a(j, chronoField)));
            }
            return v(Instant.ofEpochSecond(j, localDateTime.b.d), this.b);
        }
        return (OffsetDateTime) temporalField.T(this, j);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(long j, j$.time.temporal.q qVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, qVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, qVar);
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int compare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.b.equals(offsetDateTime2.b)) {
            compare = toLocalDateTime().compareTo((ChronoLocalDateTime<?>) offsetDateTime2.toLocalDateTime());
        } else {
            compare = Long.compare(this.a.u(this.b), offsetDateTime2.a.u(offsetDateTime2.b));
            if (compare == 0) {
                compare = this.a.toLocalTime().d - offsetDateTime2.a.toLocalTime().d;
            }
        }
        if (compare == 0) {
            return toLocalDateTime().compareTo((ChronoLocalDateTime<?>) offsetDateTime2.toLocalDateTime());
        }
        return compare;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery != j$.time.temporal.p.d && temporalQuery != j$.time.temporal.p.e) {
            if (temporalQuery == j$.time.temporal.p.a) {
                return null;
            }
            if (temporalQuery == j$.time.temporal.p.f) {
                return this.a.m();
            }
            if (temporalQuery == j$.time.temporal.p.g) {
                return this.a.toLocalTime();
            }
            if (temporalQuery == j$.time.temporal.p.b) {
                return j$.time.chrono.q.c;
            }
            if (temporalQuery == j$.time.temporal.p.c) {
                return j$.time.temporal.a.NANOS;
            }
            return temporalQuery.queryFrom(this);
        }
        return this.b;
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l e(LocalDate localDate) {
        if (localDate == null) {
            return (OffsetDateTime) localDate.f(this);
        }
        return F(this.a.j(localDate), this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.a.equals(offsetDateTime.a) && this.b.equals(offsetDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l f(j$.time.temporal.l lVar) {
        return lVar.a(this.a.m().toEpochDay(), ChronoField.EPOCH_DAY).a(this.a.toLocalTime().a0(), ChronoField.NANO_OF_DAY).a(this.b.b, ChronoField.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = m.a[((ChronoField) temporalField).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return this.a.h(temporalField);
                }
                return this.b.b;
            }
            throw new DateTimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return super.h(temporalField);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean i(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            if (temporalField == null || !temporalField.v(this)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = m.a[((ChronoField) temporalField).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return this.a.k(temporalField);
                }
                return this.b.b;
            }
            return this.a.u(this.b);
        }
        return temporalField.N(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField != ChronoField.INSTANT_SECONDS && temporalField != ChronoField.OFFSET_SECONDS) {
                return this.a.l(temporalField);
            }
            return ((ChronoField) temporalField).b;
        }
        return temporalField.A(this);
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    public final String toString() {
        String localDateTime = this.a.toString();
        String zoneOffset = this.b.toString();
        return localDateTime + zoneOffset;
    }
}
