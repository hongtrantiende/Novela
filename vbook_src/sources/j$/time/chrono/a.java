package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public abstract class a implements j {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        new Locale("ja", "JP", "JP");
    }

    public static j A(j jVar, String str) {
        String s;
        j jVar2 = (j) a.putIfAbsent(str, jVar);
        if (jVar2 == null && (s = jVar.s()) != null) {
            b.putIfAbsent(s, jVar);
        }
        return jVar2;
    }

    public static ChronoLocalDate F(ChronoLocalDate chronoLocalDate, long j, long j2, long j3) {
        long j4;
        ChronoLocalDate b2 = chronoLocalDate.b(j, (j$.time.temporal.q) j$.time.temporal.a.MONTHS);
        j$.time.temporal.a aVar = j$.time.temporal.a.WEEKS;
        ChronoLocalDate b3 = b2.b(j2, (j$.time.temporal.q) aVar);
        if (j3 > 7) {
            long j5 = j3 - 1;
            b3 = b3.b(j5 / 7, (j$.time.temporal.q) aVar);
            j4 = j5 % 7;
        } else {
            if (j3 < 1) {
                b3 = b3.b(Math.subtractExact(j3, 7L) / 7, (j$.time.temporal.q) aVar);
                j4 = (j3 + 6) % 7;
            }
            return b3.e(new j$.time.temporal.n(DayOfWeek.v((int) j3).getValue(), 0));
        }
        j3 = j4 + 1;
        return b3.e(new j$.time.temporal.n(DayOfWeek.v((int) j3).getValue(), 0));
    }

    public static void v(Map map, ChronoField chronoField, long j) {
        Long l = (Long) map.get(chronoField);
        if (l != null && l.longValue() != j) {
            throw new DateTimeException("Conflict found: " + chronoField + " " + l + " differs from " + chronoField + " " + j);
        }
        map.put(chronoField, Long.valueOf(j));
    }

    public void I(Map map, j$.time.format.d0 d0Var) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (d0Var != j$.time.format.d0.LENIENT) {
                chronoField.W(l.longValue());
            }
            ChronoLocalDate a2 = L().a(1L, (TemporalField) ChronoField.DAY_OF_MONTH).a(l.longValue(), (TemporalField) chronoField);
            ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
            v(map, chronoField2, a2.h(chronoField2));
            ChronoField chronoField3 = ChronoField.YEAR;
            v(map, chronoField3, a2.h(chronoField3));
        }
    }

    public ChronoLocalDate N(Map map, j$.time.format.d0 d0Var) {
        ChronoField chronoField = ChronoField.YEAR;
        int a2 = y(chronoField).a(((Long) map.remove(chronoField)).longValue(), chronoField);
        if (d0Var == j$.time.format.d0.LENIENT) {
            long subtractExact = Math.subtractExact(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L);
            return O(a2, 1, 1).b(subtractExact, (j$.time.temporal.q) j$.time.temporal.a.MONTHS).b(Math.subtractExact(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L), (j$.time.temporal.q) j$.time.temporal.a.DAYS);
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int a3 = y(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int a4 = y(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        if (d0Var == j$.time.format.d0.SMART) {
            try {
                return O(a2, a3, a4);
            } catch (DateTimeException unused) {
                return this.O(a2, a3, 1).e(new j$.time.f(6));
            }
        }
        return O(a2, a3, a4);
    }

    @Override // j$.time.chrono.j
    public ChronoLocalDate Q(Map map, j$.time.format.d0 d0Var) {
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        if (map.containsKey(chronoField)) {
            return o(((Long) map.remove(chronoField)).longValue());
        }
        I(map, d0Var);
        ChronoLocalDate T = T(map, d0Var);
        if (T != null) {
            return T;
        }
        ChronoField chronoField2 = ChronoField.YEAR;
        if (map.containsKey(chronoField2)) {
            ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
            if (map.containsKey(chronoField3)) {
                if (map.containsKey(ChronoField.DAY_OF_MONTH)) {
                    return N(map, d0Var);
                }
                ChronoField chronoField4 = ChronoField.ALIGNED_WEEK_OF_MONTH;
                if (map.containsKey(chronoField4)) {
                    ChronoField chronoField5 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                    if (map.containsKey(chronoField5)) {
                        int a2 = y(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                        if (d0Var == j$.time.format.d0.LENIENT) {
                            long subtractExact = Math.subtractExact(((Long) map.remove(chronoField3)).longValue(), 1L);
                            long subtractExact2 = Math.subtractExact(((Long) map.remove(chronoField4)).longValue(), 1L);
                            return O(a2, 1, 1).b(subtractExact, (j$.time.temporal.q) j$.time.temporal.a.MONTHS).b(subtractExact2, (j$.time.temporal.q) j$.time.temporal.a.WEEKS).b(Math.subtractExact(((Long) map.remove(chronoField5)).longValue(), 1L), (j$.time.temporal.q) j$.time.temporal.a.DAYS);
                        }
                        int a3 = y(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                        int a4 = y(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4);
                        ChronoLocalDate b2 = O(a2, a3, 1).b((y(chronoField5).a(((Long) map.remove(chronoField5)).longValue(), chronoField5) - 1) + ((a4 - 1) * 7), (j$.time.temporal.q) j$.time.temporal.a.DAYS);
                        if (d0Var == j$.time.format.d0.STRICT && b2.h(chronoField3) != a3) {
                            j$.time.e.a("Strict mode rejected resolved date as it is in a different month");
                            return null;
                        }
                        return b2;
                    }
                    ChronoField chronoField6 = ChronoField.DAY_OF_WEEK;
                    if (map.containsKey(chronoField6)) {
                        int a5 = y(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                        if (d0Var == j$.time.format.d0.LENIENT) {
                            return F(O(a5, 1, 1), Math.subtractExact(((Long) map.remove(chronoField3)).longValue(), 1L), Math.subtractExact(((Long) map.remove(chronoField4)).longValue(), 1L), Math.subtractExact(((Long) map.remove(chronoField6)).longValue(), 1L));
                        }
                        int a6 = y(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                        ChronoLocalDate e = O(a5, a6, 1).b((y(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4) - 1) * 7, (j$.time.temporal.q) j$.time.temporal.a.DAYS).e(new j$.time.temporal.n(DayOfWeek.v(y(chronoField6).a(((Long) map.remove(chronoField6)).longValue(), chronoField6)).getValue(), 0));
                        if (d0Var == j$.time.format.d0.STRICT && e.h(chronoField3) != a6) {
                            j$.time.e.a("Strict mode rejected resolved date as it is in a different month");
                            return null;
                        }
                        return e;
                    }
                }
            }
            ChronoField chronoField7 = ChronoField.DAY_OF_YEAR;
            if (map.containsKey(chronoField7)) {
                int a7 = y(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                if (d0Var == j$.time.format.d0.LENIENT) {
                    return t(a7, 1).b(Math.subtractExact(((Long) map.remove(chronoField7)).longValue(), 1L), (j$.time.temporal.q) j$.time.temporal.a.DAYS);
                }
                return t(a7, y(chronoField7).a(((Long) map.remove(chronoField7)).longValue(), chronoField7));
            }
            ChronoField chronoField8 = ChronoField.ALIGNED_WEEK_OF_YEAR;
            if (map.containsKey(chronoField8)) {
                ChronoField chronoField9 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
                if (map.containsKey(chronoField9)) {
                    int a8 = y(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                    if (d0Var == j$.time.format.d0.LENIENT) {
                        long subtractExact3 = Math.subtractExact(((Long) map.remove(chronoField8)).longValue(), 1L);
                        return t(a8, 1).b(subtractExact3, (j$.time.temporal.q) j$.time.temporal.a.WEEKS).b(Math.subtractExact(((Long) map.remove(chronoField9)).longValue(), 1L), (j$.time.temporal.q) j$.time.temporal.a.DAYS);
                    }
                    int a9 = y(chronoField8).a(((Long) map.remove(chronoField8)).longValue(), chronoField8);
                    ChronoLocalDate b3 = t(a8, 1).b((y(chronoField9).a(((Long) map.remove(chronoField9)).longValue(), chronoField9) - 1) + ((a9 - 1) * 7), (j$.time.temporal.q) j$.time.temporal.a.DAYS);
                    if (d0Var == j$.time.format.d0.STRICT && b3.h(chronoField2) != a8) {
                        j$.time.e.a("Strict mode rejected resolved date as it is in a different year");
                        return null;
                    }
                    return b3;
                }
                ChronoField chronoField10 = ChronoField.DAY_OF_WEEK;
                if (map.containsKey(chronoField10)) {
                    int a10 = y(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                    if (d0Var == j$.time.format.d0.LENIENT) {
                        return F(t(a10, 1), 0L, Math.subtractExact(((Long) map.remove(chronoField8)).longValue(), 1L), Math.subtractExact(((Long) map.remove(chronoField10)).longValue(), 1L));
                    }
                    ChronoLocalDate e2 = t(a10, 1).b((y(chronoField8).a(((Long) map.remove(chronoField8)).longValue(), chronoField8) - 1) * 7, (j$.time.temporal.q) j$.time.temporal.a.DAYS).e(new j$.time.temporal.n(DayOfWeek.v(y(chronoField10).a(((Long) map.remove(chronoField10)).longValue(), chronoField10)).getValue(), 0));
                    if (d0Var == j$.time.format.d0.STRICT && e2.h(chronoField2) != a10) {
                        j$.time.e.a("Strict mode rejected resolved date as it is in a different year");
                        return null;
                    }
                    return e2;
                }
            }
        }
        return null;
    }

    public ChronoLocalDate T(Map map, j$.time.format.d0 d0Var) {
        int intExact;
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            ChronoField chronoField2 = ChronoField.ERA;
            Long l2 = (Long) map.remove(chronoField2);
            if (d0Var != j$.time.format.d0.LENIENT) {
                intExact = y(chronoField).a(l.longValue(), chronoField);
            } else {
                intExact = Math.toIntExact(l.longValue());
            }
            if (l2 != null) {
                v(map, ChronoField.YEAR, C(B(y(chronoField2).a(l2.longValue(), chronoField2)), intExact));
                return null;
            }
            ChronoField chronoField3 = ChronoField.YEAR;
            if (map.containsKey(chronoField3)) {
                v(map, chronoField3, C(t(y(chronoField3).a(((Long) map.get(chronoField3)).longValue(), chronoField3), 1).M(), intExact));
                return null;
            } else if (d0Var == j$.time.format.d0.STRICT) {
                map.put(chronoField, l);
                return null;
            } else {
                List z = z();
                if (z.isEmpty()) {
                    v(map, chronoField3, intExact);
                    return null;
                }
                v(map, chronoField3, C((k) z.get(z.size() - 1), intExact));
                return null;
            }
        }
        ChronoField chronoField4 = ChronoField.ERA;
        if (map.containsKey(chronoField4)) {
            y(chronoField4).b(((Long) map.get(chronoField4)).longValue(), chronoField4);
            return null;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return p().compareTo(((j) obj).p());
    }

    @Override // j$.time.chrono.j
    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof a) && p().compareTo(((a) obj).p()) == 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // j$.time.chrono.j
    public final int hashCode() {
        return p().hashCode() ^ getClass().hashCode();
    }

    @Override // j$.time.chrono.j
    public final String toString() {
        return p();
    }
}
