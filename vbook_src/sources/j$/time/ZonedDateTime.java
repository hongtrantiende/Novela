package j$.time;

import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.time.zone.ZoneRules;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class ZonedDateTime implements j$.time.temporal.l, ChronoZonedDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    public final LocalDateTime a;
    public final ZoneOffset b;
    public final ZoneId c;

    public ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    public static ZonedDateTime ofLocal(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        j$.time.zone.b bVar;
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        ZoneRules rules = zoneId.getRules();
        List e = rules.e(localDateTime);
        if (e.size() == 1) {
            zoneOffset = (ZoneOffset) e.get(0);
        } else if (e.size() == 0) {
            Object d = rules.d(localDateTime);
            if (d instanceof j$.time.zone.b) {
                bVar = (j$.time.zone.b) d;
            } else {
                bVar = null;
            }
            localDateTime = localDateTime.T(Duration.A(bVar.d.b - bVar.c.b, 0).a);
            zoneOffset = bVar.d;
        } else if (zoneOffset == null || !e.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) e.get(0);
            Objects.requireNonNull(zoneOffset, "offset");
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (ZonedDateTime) dateTimeFormatter.parse(charSequence, new f(4));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static ZonedDateTime v(long j, int i, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(Instant.ofEpochSecond(j, i));
        return new ZonedDateTime(LocalDateTime.I(j, i, offset), zoneId, offset);
    }

    private Object writeReplace() {
        return new p((byte) 6, this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: A */
    public final ZonedDateTime b(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            if (aVar.compareTo(j$.time.temporal.a.DAYS) >= 0 && aVar != j$.time.temporal.a.FOREVER) {
                return ofLocal(this.a.b(j, qVar), this.c, this.b);
            }
            LocalDateTime b = this.a.b(j, qVar);
            ZoneOffset zoneOffset = this.b;
            ZoneId zoneId = this.c;
            Objects.requireNonNull(b, "localDateTime");
            Objects.requireNonNull(zoneOffset, "offset");
            Objects.requireNonNull(zoneId, "zone");
            if (zoneId.getRules().g(b, zoneOffset)) {
                return new ZonedDateTime(b, zoneId, zoneOffset);
            }
            return v(b.u(zoneOffset), b.b.d, zoneId);
        }
        return (ZonedDateTime) qVar.v(this, j);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime D(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        return ofLocal(this.a, zoneId, this.b);
    }

    public final ZonedDateTime F(ZoneOffset zoneOffset) {
        if (!zoneOffset.equals(this.b) && this.c.getRules().g(this.a, zoneOffset)) {
            return new ZonedDateTime(this.a, this.c, zoneOffset);
        }
        return this;
    }

    @Override // j$.time.temporal.l
    /* renamed from: I */
    public final ZonedDateTime a(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i = u.a[chronoField.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return ofLocal(this.a.a(j, temporalField), this.c, this.b);
                }
                return F(ZoneOffset.ofTotalSeconds(chronoField.b.a(j, chronoField)));
            }
            return v(j, this.a.b.d, this.c);
        }
        return (ZonedDateTime) temporalField.T(this, j);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId J() {
        return this.c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: N */
    public final ZonedDateTime j(j$.time.temporal.m mVar) {
        if (mVar instanceof LocalDate) {
            return ofLocal(LocalDateTime.of((LocalDate) mVar, this.a.toLocalTime()), this.c, this.b);
        }
        if (mVar instanceof LocalTime) {
            return ofLocal(LocalDateTime.of(this.a.m(), (LocalTime) mVar), this.c, this.b);
        }
        if (mVar instanceof LocalDateTime) {
            return ofLocal((LocalDateTime) mVar, this.c, this.b);
        }
        if (mVar instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) mVar;
            return ofLocal(offsetDateTime.toLocalDateTime(), this.c, offsetDateTime.b);
        } else if (mVar instanceof Instant) {
            Instant instant = (Instant) mVar;
            return v(instant.getEpochSecond(), instant.getNano(), this.c);
        } else if (mVar instanceof ZoneOffset) {
            return F((ZoneOffset) mVar);
        } else {
            return (ZonedDateTime) mVar.f(this);
        }
    }

    @Override // j$.time.temporal.l
    public final ChronoZonedDateTime c(long j, j$.time.temporal.q qVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, qVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.p.f) {
            return this.a.m();
        }
        return super.d(temporalQuery);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ZonedDateTime) {
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                if (this.a.equals(zonedDateTime.a) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = u.a[((ChronoField) temporalField).ordinal()];
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
        return Integer.rotateLeft(this.c.hashCode(), 3) ^ (this.a.hashCode() ^ this.b.hashCode());
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
            int i = u.a[((ChronoField) temporalField).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return this.a.k(temporalField);
                }
                return this.b.b;
            }
            return V();
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

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDate m() {
        return this.a.m();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset n() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final LocalTime toLocalTime() {
        return this.a.toLocalTime();
    }

    public final String toString() {
        String str = this.a.toString() + this.b.toString();
        ZoneOffset zoneOffset = this.b;
        ZoneId zoneId = this.c;
        if (zoneOffset != zoneId) {
            return str + "[" + zoneId.toString() + "]";
        }
        return str;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime w() {
        return this.a;
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
}
