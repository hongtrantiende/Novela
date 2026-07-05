package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.Month;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class q extends a implements Serializable {
    public static final q c = new q();
    private static final long serialVersionUID = -1440403870442975015L;

    private q() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.j
    public final k B(int i) {
        if (i != 0) {
            if (i == 1) {
                return r.CE;
            }
            j$.time.e.b("Invalid era: ", i);
            return null;
        }
        return r.BCE;
    }

    @Override // j$.time.chrono.j
    public final int C(k kVar, int i) {
        if (kVar instanceof r) {
            if (kVar == r.CE) {
                return i;
            }
            return 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate G(TemporalAccessor temporalAccessor) {
        return LocalDate.F(temporalAccessor);
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDateTime H(LocalDateTime localDateTime) {
        return LocalDateTime.A(localDateTime);
    }

    @Override // j$.time.chrono.a
    public final void I(Map map, j$.time.format.d0 d0Var) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (d0Var != j$.time.format.d0.LENIENT) {
                chronoField.W(l.longValue());
            }
            a.v(map, ChronoField.MONTH_OF_YEAR, ((int) Math.floorMod(l.longValue(), 12L)) + 1);
            a.v(map, ChronoField.YEAR, Math.floorDiv(l.longValue(), 12L));
        }
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate L() {
        return LocalDate.F(LocalDate.Y(new j$.time.a(ZoneId.systemDefault())));
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate N(Map map, j$.time.format.d0 d0Var) {
        ChronoField chronoField = ChronoField.YEAR;
        int a = chronoField.b.a(((Long) map.remove(chronoField)).longValue(), chronoField);
        boolean z = true;
        if (d0Var == j$.time.format.d0.LENIENT) {
            return LocalDate.of(a, 1, 1).plusMonths(Math.subtractExact(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L)).plusDays(Math.subtractExact(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L));
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int a2 = chronoField2.b.a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int a3 = chronoField3.b.a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        if (d0Var == j$.time.format.d0.SMART) {
            if (a2 != 4 && a2 != 6 && a2 != 9 && a2 != 11) {
                if (a2 == 2) {
                    Month month = Month.FEBRUARY;
                    long j = a;
                    int i = j$.time.r.b;
                    if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                        z = false;
                    }
                    a3 = Math.min(a3, month.A(z));
                }
            } else {
                a3 = Math.min(a3, 30);
            }
        }
        return LocalDate.of(a, a2, a3);
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate O(int i, int i2, int i3) {
        return LocalDate.of(i, i2, i3);
    }

    @Override // j$.time.chrono.a, j$.time.chrono.j
    public final ChronoLocalDate Q(Map map, j$.time.format.d0 d0Var) {
        return (LocalDate) super.Q(map, d0Var);
    }

    @Override // j$.time.chrono.j
    public final ChronoZonedDateTime R(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return ZonedDateTime.v(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate T(Map map, j$.time.format.d0 d0Var) {
        long longValue;
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (d0Var != j$.time.format.d0.LENIENT) {
                chronoField.W(l.longValue());
            }
            Long l2 = (Long) map.remove(ChronoField.ERA);
            if (l2 == null) {
                ChronoField chronoField2 = ChronoField.YEAR;
                Long l3 = (Long) map.get(chronoField2);
                if (d0Var == j$.time.format.d0.STRICT) {
                    if (l3 != null) {
                        int i = (l3.longValue() > 0L ? 1 : (l3.longValue() == 0L ? 0 : -1));
                        long longValue2 = l.longValue();
                        if (i <= 0) {
                            longValue2 = Math.subtractExact(1L, longValue2);
                        }
                        a.v(map, chronoField2, longValue2);
                    } else {
                        map.put(chronoField, l);
                    }
                } else {
                    if (l3 != null && l3.longValue() <= 0) {
                        longValue = Math.subtractExact(1L, l.longValue());
                    } else {
                        longValue = l.longValue();
                    }
                    a.v(map, chronoField2, longValue);
                }
            } else if (l2.longValue() == 1) {
                a.v(map, ChronoField.YEAR, l.longValue());
            } else if (l2.longValue() == 0) {
                a.v(map, ChronoField.YEAR, Math.subtractExact(1L, l.longValue()));
            } else {
                j$.time.e.i("Invalid value for era: ", l2);
                return null;
            }
        } else {
            ChronoField chronoField3 = ChronoField.ERA;
            if (map.containsKey(chronoField3)) {
                chronoField3.W(((Long) map.get(chronoField3)).longValue());
            }
        }
        return null;
    }

    @Override // j$.time.chrono.j
    public final boolean U(long j) {
        if ((3 & j) == 0) {
            if (j % 100 != 0 || j % 400 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate o(long j) {
        return LocalDate.ofEpochDay(j);
    }

    @Override // j$.time.chrono.j
    public final String p() {
        return "ISO";
    }

    @Override // j$.time.chrono.j
    public final String s() {
        return "iso8601";
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate t(int i, int i2) {
        return LocalDate.Z(i, i2);
    }

    public Object writeReplace() {
        return new c0((byte) 1, this);
    }

    @Override // j$.time.chrono.j
    public final j$.time.temporal.s y(ChronoField chronoField) {
        return chronoField.b;
    }

    @Override // j$.time.chrono.j
    public final List z() {
        return j$.time.b.c(r.values());
    }
}
