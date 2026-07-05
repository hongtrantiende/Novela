package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class LocalDateTime implements j$.time.temporal.l, j$.time.temporal.m, ChronoLocalDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = 6207766400415563566L;
    public final LocalDate a;
    public final LocalTime b;
    public static final LocalDateTime MIN = of(LocalDate.MIN, LocalTime.MIN);
    public static final LocalDateTime MAX = of(LocalDate.MAX, LocalTime.MAX);

    public LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.a = localDate;
        this.b = localTime;
    }

    public static LocalDateTime A(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).a;
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.F(temporalAccessor), LocalTime.A(temporalAccessor));
        } catch (DateTimeException e) {
            e.g("Unable to obtain LocalDateTime from TemporalAccessor: ", temporalAccessor, temporalAccessor.getClass().getName(), e);
            return null;
        }
    }

    public static LocalDateTime I(long j, int i, ZoneOffset zoneOffset) {
        long j2;
        Objects.requireNonNull(zoneOffset, "offset");
        long j3 = i;
        ChronoField.NANO_OF_SECOND.W(j3);
        return new LocalDateTime(LocalDate.ofEpochDay(Math.floorDiv(j + zoneOffset.b, 86400L)), LocalTime.I((((int) Math.floorMod(j2, 86400L)) * 1000000000) + j3));
    }

    public static LocalDateTime of(LocalDate localDate, LocalTime localTime) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return I(instant.getEpochSecond(), instant.getNano(), zoneId.getRules().getOffset(instant));
    }

    public static LocalDateTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.g;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDateTime) dateTimeFormatter.parse(charSequence, new f(1));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new p((byte) 5, this);
    }

    public final boolean F(ChronoLocalDateTime chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            if (v((LocalDateTime) chronoLocalDateTime) >= 0) {
                return false;
            }
            return true;
        }
        int i = (m().toEpochDay() > chronoLocalDateTime.m().toEpochDay() ? 1 : (m().toEpochDay() == chronoLocalDateTime.m().toEpochDay() ? 0 : -1));
        if (i >= 0 && (i != 0 || toLocalTime().a0() >= chronoLocalDateTime.toLocalTime().a0())) {
            return false;
        }
        return true;
    }

    @Override // j$.time.temporal.l
    /* renamed from: N */
    public final LocalDateTime b(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            switch (h.a[((j$.time.temporal.a) qVar).ordinal()]) {
                case 1:
                    return W(this.a, 0L, 0L, 0L, j);
                case 2:
                    LocalDateTime Y = Y(this.a.plusDays(j / 86400000000L), this.b);
                    return Y.W(Y.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
                case 3:
                    LocalDateTime Y2 = Y(this.a.plusDays(j / 86400000), this.b);
                    return Y2.W(Y2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
                case 4:
                    return T(j);
                case 5:
                    return W(this.a, 0L, j, 0L, 0L);
                case 6:
                    return W(this.a, j, 0L, 0L, 0L);
                case 7:
                    LocalDateTime Y3 = Y(this.a.plusDays(j / 256), this.b);
                    return Y3.W(Y3.a, (j % 256) * 12, 0L, 0L, 0L);
                default:
                    return Y(this.a.b(j, qVar), this.b);
            }
        }
        return (LocalDateTime) qVar.v(this, j);
    }

    public final LocalDateTime T(long j) {
        return W(this.a, 0L, 0L, j, 0L);
    }

    public final LocalDateTime W(LocalDate localDate, long j, long j2, long j3, long j4) {
        LocalTime I;
        int i = ((j | j2 | j3 | j4) > 0L ? 1 : ((j | j2 | j3 | j4) == 0L ? 0 : -1));
        LocalTime localTime = this.b;
        if (i == 0) {
            return Y(localDate, localTime);
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
        return Y(localDate.plusDays(floorDiv), I);
    }

    @Override // j$.time.temporal.l
    /* renamed from: X */
    public final LocalDateTime a(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            boolean X = ((ChronoField) temporalField).X();
            LocalDate localDate = this.a;
            if (X) {
                return Y(localDate, this.b.a(j, temporalField));
            }
            return Y(localDate.a(j, temporalField), this.b);
        }
        return (LocalDateTime) temporalField.T(this, j);
    }

    public final LocalDateTime Y(LocalDate localDate, LocalTime localTime) {
        if (this.a == localDate && this.b == localTime) {
            return this;
        }
        return new LocalDateTime(localDate, localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: Z */
    public final LocalDateTime j(j$.time.temporal.m mVar) {
        if (mVar instanceof LocalDate) {
            return Y((LocalDate) mVar, this.b);
        }
        if (mVar instanceof LocalTime) {
            return Y(this.a, (LocalTime) mVar);
        }
        if (mVar instanceof LocalDateTime) {
            return (LocalDateTime) mVar;
        }
        return (LocalDateTime) mVar.f(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: atZone */
    public ZonedDateTime E(ZoneId zoneId) {
        return ZonedDateTime.ofLocal(this, zoneId, null);
    }

    @Override // j$.time.temporal.l
    public final ChronoLocalDateTime c(long j, j$.time.temporal.q qVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, qVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, qVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, java.lang.Comparable
    public int compareTo(ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return v((LocalDateTime) chronoLocalDateTime);
        }
        return super.compareTo((ChronoLocalDateTime) chronoLocalDateTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.p.f) {
            return this.a;
        }
        return super.d(temporalQuery);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public int getDayOfYear() {
        return this.a.N();
    }

    public int getHour() {
        return this.b.a;
    }

    public int getMinute() {
        return this.b.b;
    }

    public Month getMonth() {
        return this.a.getMonth();
    }

    public int getYear() {
        return this.a.getYear();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).X()) {
                return this.b.h(temporalField);
            }
            return this.a.h(temporalField);
        }
        return super.h(temporalField);
    }

    public int hashCode() {
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
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).X()) {
                return this.b.l(temporalField);
            }
            return this.a.l(temporalField);
        }
        return temporalField.A(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: toLocalDate */
    public LocalDate m() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public LocalTime toLocalTime() {
        return this.b;
    }

    public String toString() {
        String localDate = this.a.toString();
        String localTime = this.b.toString();
        return localDate + "T" + localTime;
    }

    public final int v(LocalDateTime localDateTime) {
        int v = this.a.v(localDateTime.m());
        if (v == 0) {
            return this.b.compareTo(localDateTime.toLocalTime());
        }
        return v;
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
