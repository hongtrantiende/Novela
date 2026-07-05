package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.format.c0;
import j$.time.format.d0;
import java.util.Map;
import org.mozilla.javascript.Token;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public abstract class g implements TemporalField {
    public static final g DAY_OF_QUARTER;
    public static final g QUARTER_OF_YEAR;
    public static final g WEEK_BASED_YEAR;
    public static final g WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ g[] b;

    static {
        g gVar = new g() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.TemporalField
            public final s A(TemporalAccessor temporalAccessor) {
                if (v(temporalAccessor)) {
                    long k = temporalAccessor.k(g.QUARTER_OF_YEAR);
                    if (k == 1) {
                        if (j$.time.chrono.q.c.U(temporalAccessor.k(ChronoField.YEAR))) {
                            return s.f(1L, 91L);
                        }
                        return s.f(1L, 90L);
                    } else if (k == 2) {
                        return s.f(1L, 91L);
                    } else {
                        if (k != 3 && k != 4) {
                            return I();
                        }
                        return s.f(1L, 92L);
                    }
                }
                throw new DateTimeException("Unsupported field: DayOfQuarter");
            }

            @Override // j$.time.temporal.TemporalField
            public final TemporalAccessor F(Map map, c0 c0Var, d0 d0Var) {
                LocalDate of;
                long j;
                ChronoField chronoField = ChronoField.YEAR;
                Long l = (Long) map.get(chronoField);
                TemporalField temporalField = g.QUARTER_OF_YEAR;
                Long l2 = (Long) map.get(temporalField);
                if (l != null && l2 != null) {
                    int a2 = chronoField.b.a(l.longValue(), chronoField);
                    long longValue = ((Long) map.get(g.DAY_OF_QUARTER)).longValue();
                    g gVar2 = i.a;
                    if (j$.time.chrono.j.q(c0Var).equals(j$.time.chrono.q.c)) {
                        if (d0Var == d0.LENIENT) {
                            of = LocalDate.of(a2, 1, 1).plusMonths(Math.multiplyExact(Math.subtractExact(l2.longValue(), 1L), 3L));
                            j = Math.subtractExact(longValue, 1L);
                        } else {
                            of = LocalDate.of(a2, ((temporalField.I().a(l2.longValue(), temporalField) - 1) * 3) + 1, 1);
                            if (longValue < 1 || longValue > 90) {
                                if (d0Var == d0.STRICT) {
                                    A(of).b(longValue, this);
                                } else {
                                    I().b(longValue, this);
                                }
                            }
                            j = longValue - 1;
                        }
                        map.remove(this);
                        map.remove(chronoField);
                        map.remove(temporalField);
                        return of.plusDays(j);
                    }
                    j$.time.e.a("Resolve requires IsoChronology");
                }
                return null;
            }

            @Override // j$.time.temporal.TemporalField
            public final s I() {
                return s.g(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.TemporalField
            public final long N(TemporalAccessor temporalAccessor) {
                int i;
                if (v(temporalAccessor)) {
                    int h = temporalAccessor.h(ChronoField.DAY_OF_YEAR);
                    int h2 = temporalAccessor.h(ChronoField.MONTH_OF_YEAR);
                    int i2 = (h2 - 1) / 3;
                    if (j$.time.chrono.q.c.U(temporalAccessor.k(ChronoField.YEAR))) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                    return h - g.a[i2 + i];
                }
                throw new DateTimeException("Unsupported field: DayOfQuarter");
            }

            @Override // j$.time.temporal.TemporalField
            public final l T(l lVar, long j) {
                long N = N(lVar);
                I().b(j, this);
                ChronoField chronoField = ChronoField.DAY_OF_YEAR;
                return lVar.a((j - N) + lVar.k(chronoField), chronoField);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean v(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.i(ChronoField.DAY_OF_YEAR) && temporalAccessor.i(ChronoField.MONTH_OF_YEAR) && temporalAccessor.i(ChronoField.YEAR)) {
                    g gVar2 = i.a;
                    if (j$.time.chrono.j.q(temporalAccessor).equals(j$.time.chrono.q.c)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        };
        DAY_OF_QUARTER = gVar;
        g gVar2 = new g() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.TemporalField
            public final s A(TemporalAccessor temporalAccessor) {
                if (v(temporalAccessor)) {
                    return I();
                }
                throw new DateTimeException("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final s I() {
                return s.f(1L, 4L);
            }

            @Override // j$.time.temporal.TemporalField
            public final long N(TemporalAccessor temporalAccessor) {
                if (v(temporalAccessor)) {
                    return (temporalAccessor.k(ChronoField.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new DateTimeException("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final l T(l lVar, long j) {
                long N = N(lVar);
                I().b(j, this);
                ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
                return lVar.a(((j - N) * 3) + lVar.k(chronoField), chronoField);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean v(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.i(ChronoField.MONTH_OF_YEAR)) {
                    g gVar3 = i.a;
                    if (j$.time.chrono.j.q(temporalAccessor).equals(j$.time.chrono.q.c)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        };
        QUARTER_OF_YEAR = gVar2;
        g gVar3 = new g() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.TemporalField
            public final s A(TemporalAccessor temporalAccessor) {
                if (v(temporalAccessor)) {
                    return g.Z(LocalDate.F(temporalAccessor));
                }
                throw new DateTimeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final TemporalAccessor F(Map map, c0 c0Var, d0 d0Var) {
                LocalDate a2;
                long j;
                TemporalField temporalField = g.WEEK_BASED_YEAR;
                Long l = (Long) map.get(temporalField);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                Long l2 = (Long) map.get(chronoField);
                if (l != null && l2 != null) {
                    int a3 = temporalField.I().a(l.longValue(), temporalField);
                    long longValue = ((Long) map.get(g.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                    g gVar4 = i.a;
                    if (j$.time.chrono.j.q(c0Var).equals(j$.time.chrono.q.c)) {
                        LocalDate of = LocalDate.of(a3, 1, 4);
                        if (d0Var == d0.LENIENT) {
                            long longValue2 = l2.longValue();
                            if (longValue2 > 7) {
                                long j2 = longValue2 - 1;
                                of = of.b0(j2 / 7);
                                j = j2 % 7;
                            } else {
                                if (longValue2 < 1) {
                                    of = of.b0(Math.subtractExact(longValue2, 7L) / 7);
                                    j = (longValue2 + 6) % 7;
                                }
                                a2 = of.b0(Math.subtractExact(longValue, 1L)).a(longValue2, chronoField);
                            }
                            longValue2 = j + 1;
                            a2 = of.b0(Math.subtractExact(longValue, 1L)).a(longValue2, chronoField);
                        } else {
                            int a4 = chronoField.b.a(l2.longValue(), chronoField);
                            if (longValue < 1 || longValue > 52) {
                                if (d0Var == d0.STRICT) {
                                    g.Z(of).b(longValue, this);
                                } else {
                                    I().b(longValue, this);
                                }
                            }
                            a2 = of.b0(longValue - 1).a(a4, chronoField);
                        }
                        map.remove(this);
                        map.remove(temporalField);
                        map.remove(chronoField);
                        return a2;
                    }
                    j$.time.e.a("Resolve requires IsoChronology");
                }
                return null;
            }

            @Override // j$.time.temporal.TemporalField
            public final s I() {
                return s.g(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.TemporalField
            public final long N(TemporalAccessor temporalAccessor) {
                if (v(temporalAccessor)) {
                    return g.W(LocalDate.F(temporalAccessor));
                }
                throw new DateTimeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final l T(l lVar, long j) {
                I().b(j, this);
                return lVar.b(Math.subtractExact(j, N(lVar)), a.WEEKS);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean v(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.i(ChronoField.EPOCH_DAY)) {
                    g gVar4 = i.a;
                    if (j$.time.chrono.j.q(temporalAccessor).equals(j$.time.chrono.q.c)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = gVar3;
        g gVar4 = new g() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.TemporalField
            public final s A(TemporalAccessor temporalAccessor) {
                if (v(temporalAccessor)) {
                    return ChronoField.YEAR.b;
                }
                throw new DateTimeException("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final s I() {
                return ChronoField.YEAR.b;
            }

            @Override // j$.time.temporal.TemporalField
            public final long N(TemporalAccessor temporalAccessor) {
                if (v(temporalAccessor)) {
                    return g.X(LocalDate.F(temporalAccessor));
                }
                throw new DateTimeException("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final l T(l lVar, long j) {
                ChronoField chronoField;
                LocalDate of;
                if (v(lVar)) {
                    int a2 = ChronoField.YEAR.b.a(j, g.WEEK_BASED_YEAR);
                    LocalDate F = LocalDate.F(lVar);
                    int h = F.h(ChronoField.DAY_OF_WEEK);
                    int W = g.W(F);
                    if (W == 53 && g.Y(a2) == 52) {
                        W = 52;
                    }
                    return lVar.e(LocalDate.of(a2, 1, 4).plusDays(((W - 1) * 7) + (h - of.h(chronoField))));
                }
                throw new DateTimeException("Unsupported field: WeekBasedYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean v(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.i(ChronoField.EPOCH_DAY)) {
                    g gVar5 = i.a;
                    if (j$.time.chrono.j.q(temporalAccessor).equals(j$.time.chrono.q.c)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        };
        WEEK_BASED_YEAR = gVar4;
        b = new g[]{gVar, gVar2, gVar3, gVar4};
        a = new int[]{0, 90, Token.TEMPLATE_CHARS, 273, 0, 91, Token.TEMPLATE_LITERAL_SUBST, 274};
    }

    public static int W(LocalDate localDate) {
        int ordinal = localDate.getDayOfWeek().ordinal();
        int N = localDate.N() - 1;
        int i = (3 - ordinal) + N;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (N < i3) {
            if (localDate.N() != 180) {
                localDate = LocalDate.Z(localDate.a, 180);
            }
            return (int) Z(localDate.c0(-1L)).d;
        }
        int i4 = ((N - i3) / 7) + 1;
        if (i4 == 53 && i3 != -3 && (i3 != -2 || !localDate.x())) {
            return 1;
        }
        return i4;
    }

    public static int X(LocalDate localDate) {
        int year = localDate.getYear();
        int N = localDate.N();
        if (N <= 3) {
            if (N - localDate.getDayOfWeek().ordinal() < -2) {
                return year - 1;
            }
            return year;
        } else if (N >= 363) {
            if (((N - 363) - (localDate.x() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0) {
                return year + 1;
            }
            return year;
        } else {
            return year;
        }
    }

    public static int Y(int i) {
        LocalDate of = LocalDate.of(i, 1, 1);
        if (of.getDayOfWeek() != DayOfWeek.THURSDAY) {
            if (of.getDayOfWeek() != DayOfWeek.WEDNESDAY || !of.x()) {
                return 52;
            }
            return 53;
        }
        return 53;
    }

    public static s Z(LocalDate localDate) {
        return s.f(1L, Y(X(localDate)));
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) b.clone();
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }
}
