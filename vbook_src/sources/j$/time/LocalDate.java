package j$.time;

import j$.time.chrono.ChronoLocalDate;
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
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class LocalDate implements j$.time.temporal.l, j$.time.temporal.m, ChronoLocalDate, Serializable {
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;
    public static final LocalDate MIN = of(-999999999, 1, 1);
    public static final LocalDate MAX = of(999999999, 12, 31);

    static {
        of(1970, 1, 1);
    }

    public LocalDate(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    public static LocalDate A(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                if (i2 != 4 && i2 != 6 && i2 != 9 && i2 != 11) {
                    i4 = 31;
                } else {
                    i4 = 30;
                }
            } else if (j$.time.chrono.q.c.U(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    e.c("Invalid date 'February 29' as '", i, "' is not a leap year");
                    return null;
                }
                throw new DateTimeException("Invalid date '" + Month.I(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate F(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.d(j$.time.temporal.p.f);
        if (localDate != null) {
            return localDate;
        }
        e.f("Unable to obtain LocalDate from TemporalAccessor: ", temporalAccessor, " of type ", temporalAccessor.getClass().getName());
        return null;
    }

    public static LocalDate Y(a aVar) {
        Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        ZoneId zoneId = aVar.a;
        Objects.requireNonNull(ofEpochMilli, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return ofEpochDay(Math.floorDiv(ofEpochMilli.getEpochSecond() + zoneId.getRules().getOffset(ofEpochMilli).b, 86400L));
    }

    public static LocalDate Z(int i, int i2) {
        long j = i;
        ChronoField.YEAR.W(j);
        ChronoField.DAY_OF_YEAR.W(i2);
        boolean U = j$.time.chrono.q.c.U(j);
        if (i2 == 366 && !U) {
            e.c("Invalid date 'DayOfYear 366' as '", i, "' is not a leap year");
            return null;
        }
        Month I = Month.I(((i2 - 1) / 31) + 1);
        if (i2 > (I.A(U) + I.v(U)) - 1) {
            I = Month.a[(I.ordinal() + 13) % 12];
        }
        return new LocalDate(i, I.getValue(), (i2 - I.v(U)) + 1);
    }

    public static LocalDate d0(int i, int i2, int i3) {
        int i4;
        if (i2 != 2) {
            if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
                i3 = Math.min(i3, 30);
            }
        } else {
            if (j$.time.chrono.q.c.U(i)) {
                i4 = 29;
            } else {
                i4 = 28;
            }
            i3 = Math.min(i3, i4);
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate of(int i, int i2, int i3) {
        ChronoField.YEAR.W(i);
        ChronoField.MONTH_OF_YEAR.W(i2);
        ChronoField.DAY_OF_MONTH.W(i3);
        return A(i, i2, i3);
    }

    public static LocalDate ofEpochDay(long j) {
        long j2;
        ChronoField.EPOCH_DAY.W(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / Token.SETPROP_OP;
        long j7 = j5 + j2 + (i2 / 10);
        ChronoField chronoField = ChronoField.YEAR;
        return new LocalDate(chronoField.b.a(j7, chronoField), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    public static LocalDate parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.parse(charSequence, new f(0));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new p((byte) 3, this);
    }

    public final int I(TemporalField temporalField) {
        switch (g.a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.c;
            case 2:
                return N();
            case 3:
                return ((this.c - 1) / 7) + 1;
            case 4:
                int i = this.a;
                if (i >= 1) {
                    return i;
                }
                return 1 - i;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                return ((this.c - 1) % 7) + 1;
            case 7:
                return ((N() - 1) % 7) + 1;
            case 8:
                throw new DateTimeException("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((N() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new DateTimeException("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.a;
            case 13:
                if (this.a >= 1) {
                    return 1;
                }
                return 0;
            default:
                throw new DateTimeException(c.a("Unsupported field: ", temporalField));
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime K(LocalTime localTime) {
        return LocalDateTime.of(this, localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.k M() {
        if (getYear() >= 1) {
            return j$.time.chrono.r.CE;
        }
        return j$.time.chrono.r.BCE;
    }

    public final int N() {
        return (getMonth().v(x()) + this.c) - 1;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate P(j$.time.temporal.o oVar) {
        if (oVar != null) {
            o oVar2 = (o) oVar;
            return plusMonths((oVar2.a * 12) + oVar2.b).plusDays(oVar2.c);
        }
        Objects.requireNonNull(oVar, "amountToAdd");
        return (LocalDate) ((o) oVar).v(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int S() {
        if (x()) {
            return 366;
        }
        return 365;
    }

    public final boolean T(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            if (v((LocalDate) chronoLocalDate) >= 0) {
                return false;
            }
            return true;
        } else if (toEpochDay() >= chronoLocalDate.toEpochDay()) {
            return false;
        } else {
            return true;
        }
    }

    public final int W() {
        short s = this.b;
        if (s != 2) {
            if (s != 4 && s != 6 && s != 9 && s != 11) {
                return 31;
            }
            return 30;
        } else if (x()) {
            return 29;
        } else {
            return 28;
        }
    }

    @Override // j$.time.temporal.l
    /* renamed from: X */
    public final LocalDate c(long j, j$.time.temporal.q qVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, qVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, qVar);
    }

    @Override // j$.time.temporal.l
    /* renamed from: a0 */
    public final LocalDate b(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            switch (g.b[((j$.time.temporal.a) qVar).ordinal()]) {
                case 1:
                    return plusDays(j);
                case 2:
                    return b0(j);
                case 3:
                    return plusMonths(j);
                case 4:
                    return c0(j);
                case 5:
                    return c0(Math.multiplyExact(j, 10L));
                case 6:
                    return c0(Math.multiplyExact(j, 100L));
                case 7:
                    return c0(Math.multiplyExact(j, 1000L));
                case 8:
                    ChronoField chronoField = ChronoField.ERA;
                    return a(Math.addExact(k(chronoField), j), chronoField);
                default:
                    e.d("Unsupported unit: ", qVar);
                    return null;
            }
        }
        return (LocalDate) qVar.v(this, j);
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId) {
        j$.time.zone.b bVar;
        Objects.requireNonNull(zoneId, "zone");
        LocalDateTime of = LocalDateTime.of(this, LocalTime.e);
        if (!(zoneId instanceof ZoneOffset)) {
            Object d = zoneId.getRules().d(of);
            if (d instanceof j$.time.zone.b) {
                bVar = (j$.time.zone.b) d;
            } else {
                bVar = null;
            }
            if (bVar != null && bVar.v()) {
                of = bVar.b.T(bVar.d.b - bVar.c.b);
            }
        }
        return ZonedDateTime.ofLocal(of, zoneId, null);
    }

    public final LocalDate b0(long j) {
        return plusDays(Math.multiplyExact(j, 7L));
    }

    public final LocalDate c0(long j) {
        if (j == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return d0(chronoField.b.a(this.a + j, chronoField), this.b, this.c);
    }

    @Override // j$.time.chrono.ChronoLocalDate, java.lang.Comparable
    public int compareTo(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            return v((LocalDate) chronoLocalDate);
        }
        return super.compareTo(chronoLocalDate);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.p.f) {
            return this;
        }
        return super.d(temporalQuery);
    }

    @Override // j$.time.temporal.l
    /* renamed from: e0 */
    public final LocalDate a(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            chronoField.W(j);
            switch (g.a[chronoField.ordinal()]) {
                case 1:
                    int i = (int) j;
                    if (this.c != i) {
                        return of(this.a, this.b, i);
                    }
                    break;
                case 2:
                    int i2 = (int) j;
                    if (N() != i2) {
                        return Z(this.a, i2);
                    }
                    break;
                case 3:
                    return b0(j - k(ChronoField.ALIGNED_WEEK_OF_MONTH));
                case 4:
                    if (this.a < 1) {
                        j = 1 - j;
                    }
                    return g0((int) j);
                case 5:
                    return plusDays(j - getDayOfWeek().getValue());
                case 6:
                    return plusDays(j - k(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 7:
                    return plusDays(j - k(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case 8:
                    return ofEpochDay(j);
                case 9:
                    return b0(j - k(ChronoField.ALIGNED_WEEK_OF_YEAR));
                case 10:
                    int i3 = (int) j;
                    if (this.b != i3) {
                        ChronoField.MONTH_OF_YEAR.W(i3);
                        return d0(this.a, i3, this.c);
                    }
                    break;
                case 11:
                    return plusMonths(j - (((this.a * 12) + this.b) - 1));
                case 12:
                    return g0((int) j);
                case 13:
                    if (k(ChronoField.ERA) != j) {
                        return g0(1 - this.a);
                    }
                    break;
                default:
                    throw new DateTimeException(c.a("Unsupported field: ", temporalField));
            }
            return this;
        }
        return (LocalDate) temporalField.T(this, j);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof LocalDate) && v((LocalDate) obj) == 0) {
            return true;
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: f0 */
    public final LocalDate j(j$.time.temporal.m mVar) {
        if (mVar instanceof LocalDate) {
            return (LocalDate) mVar;
        }
        return (LocalDate) mVar.f(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.j g() {
        return j$.time.chrono.q.c;
    }

    public final LocalDate g0(int i) {
        if (this.a == i) {
            return this;
        }
        ChronoField.YEAR.W(i);
        return d0(i, this.b, this.c);
    }

    public int getDayOfMonth() {
        return this.c;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.v(((int) Math.floorMod(toEpochDay() + 3, 7L)) + 1);
    }

    public Month getMonth() {
        return Month.I(this.b);
    }

    public int getYear() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return I(temporalField);
        }
        return super.h(temporalField);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        int i = this.a;
        return (i & (-2048)) ^ (((i << 11) + (this.b << 6)) + this.c);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.EPOCH_DAY) {
                return toEpochDay();
            }
            if (temporalField == ChronoField.PROLEPTIC_MONTH) {
                return ((this.a * 12) + this.b) - 1;
            }
            return I(temporalField);
        }
        return temporalField.N(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        long j;
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            if (chronoField.isDateBased()) {
                int i = g.a[chronoField.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return chronoField.b;
                            }
                            if (getYear() <= 0) {
                                return j$.time.temporal.s.f(1L, 1000000000L);
                            }
                            return j$.time.temporal.s.f(1L, 999999999L);
                        }
                        if (getMonth() == Month.FEBRUARY && !x()) {
                            j = 4;
                        } else {
                            j = 5;
                        }
                        return j$.time.temporal.s.f(1L, j);
                    }
                    return j$.time.temporal.s.f(1L, S());
                }
                return j$.time.temporal.s.f(1L, W());
            }
            throw new DateTimeException(c.a("Unsupported field: ", temporalField));
        }
        return temporalField.A(this);
    }

    public LocalDate plusDays(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.c + j;
        if (j2 > 0) {
            if (j2 <= 28) {
                return new LocalDate(this.a, this.b, (int) j2);
            }
            if (j2 <= 59) {
                long W = W();
                if (j2 <= W) {
                    return new LocalDate(this.a, this.b, (int) j2);
                }
                short s = this.b;
                if (s < 12) {
                    return new LocalDate(this.a, s + 1, (int) (j2 - W));
                }
                ChronoField.YEAR.W(this.a + 1);
                return new LocalDate(this.a + 1, 1, (int) (j2 - W));
            }
        }
        return ofEpochDay(Math.addExact(toEpochDay(), j));
    }

    public LocalDate plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        ChronoField chronoField = ChronoField.YEAR;
        return d0(chronoField.b.a(Math.floorDiv(j2, 12L), chronoField), ((int) Math.floorMod(j2, 12L)) + 1, this.c);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        long j;
        long j2 = this.a;
        long j3 = this.b;
        long j4 = 365 * j2;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + (this.c - 1);
        if (j3 > 2) {
            long j6 = j5 - 1;
            if (!x()) {
                j5 -= 2;
            } else {
                j5 = j6;
            }
        }
        return j5 - 719528;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public String toString() {
        String str;
        int i = this.a;
        short s = this.b;
        short s2 = this.c;
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (abs < 1000) {
            if (i < 0) {
                sb.append(i - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        }
        String str2 = "-";
        if (s >= 10) {
            str = "-";
        } else {
            str = "-0";
        }
        sb.append(str);
        sb.append((int) s);
        if (s2 < 10) {
            str2 = "-0";
        }
        sb.append(str2);
        sb.append((int) s2);
        return sb.toString();
    }

    public final int v(LocalDate localDate) {
        int i = this.a - localDate.a;
        if (i == 0 && (i = this.b - localDate.b) == 0) {
            return this.c - localDate.c;
        }
        return i;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean x() {
        return j$.time.chrono.q.c.U(this.a);
    }
}
