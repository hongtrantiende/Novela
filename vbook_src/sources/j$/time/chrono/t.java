package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class t extends a implements Serializable {
    public static final t c = new t();
    private static final long serialVersionUID = 459996390165777884L;

    private t() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.j
    public final k B(int i) {
        return w.q(i);
    }

    @Override // j$.time.chrono.j
    public final int C(k kVar, int i) {
        if (kVar instanceof w) {
            w wVar = (w) kVar;
            int year = (wVar.b.getYear() + i) - 1;
            if (i == 1 || (year >= -999999999 && year <= 999999999 && year >= wVar.b.getYear() && kVar == w.o(LocalDate.of(year, 1, 1)))) {
                return year;
            }
            j$.time.e.a("Invalid yearOfEra value");
            return 0;
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate G(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof v) {
            return (v) temporalAccessor;
        }
        return new v(LocalDate.F(temporalAccessor));
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate L() {
        return new v(LocalDate.F(LocalDate.Y(new j$.time.a(ZoneId.systemDefault()))));
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate O(int i, int i2, int i3) {
        return new v(LocalDate.of(i, i2, i3));
    }

    @Override // j$.time.chrono.a, j$.time.chrono.j
    public final ChronoLocalDate Q(Map map, j$.time.format.d0 d0Var) {
        return (v) super.Q(map, d0Var);
    }

    @Override // j$.time.chrono.j
    public final ChronoZonedDateTime R(Instant instant, ZoneId zoneId) {
        return i.F(this, instant, zoneId);
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate T(Map map, j$.time.format.d0 d0Var) {
        w wVar;
        int i;
        LocalDate Z;
        v W;
        ChronoField chronoField = ChronoField.ERA;
        Long l = (Long) map.get(chronoField);
        if (l != null) {
            wVar = w.q(y(chronoField).a(l.longValue(), chronoField));
        } else {
            wVar = null;
        }
        ChronoField chronoField2 = ChronoField.YEAR_OF_ERA;
        Long l2 = (Long) map.get(chronoField2);
        if (l2 != null) {
            i = y(chronoField2).a(l2.longValue(), chronoField2);
        } else {
            i = 0;
        }
        if (wVar == null && l2 != null && !map.containsKey(ChronoField.YEAR) && d0Var != j$.time.format.d0.STRICT) {
            w[] wVarArr = w.e;
            wVar = ((w[]) Arrays.copyOf(wVarArr, wVarArr.length))[((w[]) Arrays.copyOf(wVarArr, wVarArr.length)).length - 1];
        }
        if (l2 != null && wVar != null) {
            ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
            if (map.containsKey(chronoField3)) {
                ChronoField chronoField4 = ChronoField.DAY_OF_MONTH;
                if (map.containsKey(chronoField4)) {
                    map.remove(chronoField);
                    map.remove(chronoField2);
                    if (d0Var == j$.time.format.d0.LENIENT) {
                        return new v(LocalDate.of((wVar.b.getYear() + i) - 1, 1, 1)).N(Math.subtractExact(((Long) map.remove(chronoField3)).longValue(), 1L), j$.time.temporal.a.MONTHS).N(Math.subtractExact(((Long) map.remove(chronoField4)).longValue(), 1L), j$.time.temporal.a.DAYS);
                    }
                    int a = y(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    int a2 = y(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4);
                    if (d0Var == j$.time.format.d0.SMART) {
                        if (i >= 1) {
                            int year = (wVar.b.getYear() + i) - 1;
                            try {
                                W = new v(LocalDate.of(year, a, a2));
                            } catch (DateTimeException unused) {
                                W = new v(LocalDate.of(year, a, 1)).W(new j$.time.f(6));
                            }
                            if (W.b != wVar && W.h(ChronoField.YEAR_OF_ERA) > 1 && i > 1) {
                                throw new DateTimeException("Invalid YearOfEra for Era: " + wVar + " " + i);
                            }
                            return W;
                        }
                        j$.time.e.b("Invalid YearOfEra: ", i);
                        return null;
                    }
                    LocalDate localDate = v.d;
                    LocalDate of = LocalDate.of((wVar.b.getYear() + i) - 1, a, a2);
                    if (!of.T(wVar.b) && wVar == w.o(of)) {
                        return new v(wVar, i, of);
                    }
                    j$.time.e.a("year, month, and day not valid for Era");
                    return null;
                }
            }
            ChronoField chronoField5 = ChronoField.DAY_OF_YEAR;
            if (map.containsKey(chronoField5)) {
                map.remove(chronoField);
                map.remove(chronoField2);
                if (d0Var == j$.time.format.d0.LENIENT) {
                    return new v(LocalDate.Z((wVar.b.getYear() + i) - 1, 1)).N(Math.subtractExact(((Long) map.remove(chronoField5)).longValue(), 1L), j$.time.temporal.a.DAYS);
                }
                int a3 = y(chronoField5).a(((Long) map.remove(chronoField5)).longValue(), chronoField5);
                LocalDate localDate2 = v.d;
                LocalDate localDate3 = wVar.b;
                if (i == 1) {
                    Z = LocalDate.Z(localDate3.getYear(), (wVar.b.N() + a3) - 1);
                } else {
                    Z = LocalDate.Z((localDate3.getYear() + i) - 1, a3);
                }
                if (!Z.T(wVar.b) && wVar == w.o(Z)) {
                    return new v(wVar, i, Z);
                }
                j$.time.e.a("Invalid parameters");
            }
        }
        return null;
    }

    @Override // j$.time.chrono.j
    public final boolean U(long j) {
        return q.c.U(j);
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate o(long j) {
        return new v(LocalDate.ofEpochDay(j));
    }

    @Override // j$.time.chrono.j
    public final String p() {
        return "Japanese";
    }

    @Override // j$.time.chrono.j
    public final String s() {
        return "japanese";
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate t(int i, int i2) {
        return new v(LocalDate.Z(i, i2));
    }

    public Object writeReplace() {
        return new c0((byte) 1, this);
    }

    @Override // j$.time.chrono.j
    public final j$.time.temporal.s y(ChronoField chronoField) {
        w[] wVarArr;
        switch (s.a[chronoField.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                j$.time.e.d("Unsupported field: ", chronoField);
                return null;
            case 5:
                w[] wVarArr2 = w.e;
                int year = wVarArr2[wVarArr2.length - 1].b.getYear();
                int year2 = 1000000000 - wVarArr2[wVarArr2.length - 1].b.getYear();
                int year3 = wVarArr2[0].b.getYear();
                int i = 1;
                while (true) {
                    w[] wVarArr3 = w.e;
                    if (i < wVarArr3.length) {
                        w wVar = wVarArr3[i];
                        year2 = Math.min(year2, (wVar.b.getYear() - year3) + 1);
                        year3 = wVar.b.getYear();
                        i++;
                    } else {
                        return j$.time.temporal.s.g(1L, year2, 999999999 - year);
                    }
                }
            case 6:
                w wVar2 = w.d;
                long j = ChronoField.DAY_OF_YEAR.b.c;
                long j2 = j;
                for (w wVar3 : w.e) {
                    long min = Math.min(j2, (wVar3.b.S() - wVar3.b.N()) + 1);
                    if (wVar3.p() != null) {
                        j2 = Math.min(min, wVar3.p().b.N() - 1);
                    } else {
                        j2 = min;
                    }
                }
                return j$.time.temporal.s.g(1L, j2, ChronoField.DAY_OF_YEAR.b.d);
            case 7:
                return j$.time.temporal.s.f(v.d.getYear(), 999999999L);
            case 8:
                w[] wVarArr4 = w.e;
                return j$.time.temporal.s.f(w.d.a, wVarArr4[wVarArr4.length - 1].a);
            default:
                return chronoField.b;
        }
    }

    @Override // j$.time.chrono.j
    public final List z() {
        w[] wVarArr = w.e;
        return j$.time.b.c((w[]) Arrays.copyOf(wVarArr, wVarArr.length));
    }
}
