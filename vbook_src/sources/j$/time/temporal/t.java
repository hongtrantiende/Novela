package j$.time.temporal;

import j$.time.chrono.ChronoLocalDate;
import j$.time.format.c0;
import j$.time.format.d0;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class t implements TemporalField {
    public static final s f = s.f(1, 7);
    public static final s g = s.g(0, 4, 6);
    public static final s h = s.g(0, 52, 54);
    public static final s i = s.g(1, 52, 53);
    public final String a;
    public final u b;
    public final q c;
    public final q d;
    public final s e;

    public t(String str, u uVar, q qVar, q qVar2, s sVar) {
        this.a = str;
        this.b = uVar;
        this.c = qVar;
        this.d = qVar2;
        this.e = sVar;
    }

    public static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    @Override // j$.time.temporal.TemporalField
    public final s A(TemporalAccessor temporalAccessor) {
        a aVar = a.WEEKS;
        q qVar = this.d;
        if (qVar == aVar) {
            return this.e;
        }
        if (qVar == a.MONTHS) {
            return f(temporalAccessor, ChronoField.DAY_OF_MONTH);
        }
        if (qVar == a.YEARS) {
            return f(temporalAccessor, ChronoField.DAY_OF_YEAR);
        }
        if (qVar == u.h) {
            return g(temporalAccessor);
        }
        if (qVar == a.FOREVER) {
            return ChronoField.YEAR.b;
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + qVar + ", this: " + this);
    }

    @Override // j$.time.temporal.TemporalField
    public final TemporalAccessor F(Map map, c0 c0Var, d0 d0Var) {
        long longValue;
        ChronoLocalDate chronoLocalDate;
        ChronoLocalDate chronoLocalDate2;
        ChronoLocalDate chronoLocalDate3;
        int intExact = Math.toIntExact(((Long) map.get(this)).longValue());
        q qVar = a.WEEKS;
        s sVar = this.e;
        u uVar = this.b;
        q qVar2 = this.d;
        if (qVar2 == qVar) {
            map.remove(this);
            map.put(ChronoField.DAY_OF_WEEK, Long.valueOf(Math.floorMod((sVar.a(longValue, this) - 1) + (uVar.a.getValue() - 1), 7) + 1));
            return null;
        }
        ChronoField chronoField = ChronoField.DAY_OF_WEEK;
        if (!map.containsKey(chronoField)) {
            return null;
        }
        int floorMod = Math.floorMod(chronoField.b.a(((Long) map.get(chronoField)).longValue(), chronoField) - uVar.a.getValue(), 7) + 1;
        j$.time.chrono.j q = j$.time.chrono.j.q(c0Var);
        ChronoField chronoField2 = ChronoField.YEAR;
        if (map.containsKey(chronoField2)) {
            int a = chronoField2.b.a(((Long) map.get(chronoField2)).longValue(), chronoField2);
            q qVar3 = a.MONTHS;
            if (qVar2 == qVar3) {
                ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
                if (map.containsKey(chronoField3)) {
                    long longValue2 = ((Long) map.get(chronoField3)).longValue();
                    long j = intExact;
                    if (d0Var == d0.LENIENT) {
                        ChronoLocalDate b = q.O(a, 1, 1).b(Math.subtractExact(longValue2, 1L), qVar3);
                        int b2 = b(b);
                        int h2 = b.h(ChronoField.DAY_OF_MONTH);
                        chronoLocalDate3 = b.b(Math.addExact(Math.multiplyExact(Math.subtractExact(j, a(h(h2, b2), h2)), 7L), floorMod - b(b)), a.DAYS);
                    } else {
                        ChronoLocalDate O = q.O(a, chronoField3.b.a(longValue2, chronoField3), 1);
                        int b3 = b(O);
                        int h3 = O.h(ChronoField.DAY_OF_MONTH);
                        ChronoLocalDate b4 = O.b((((int) (sVar.a(j, this) - a(h(h3, b3), h3))) * 7) + (floorMod - b(O)), a.DAYS);
                        if (d0Var == d0.STRICT && b4.k(chronoField3) != longValue2) {
                            j$.time.e.a("Strict mode rejected resolved date as it is in a different month");
                            return null;
                        }
                        chronoLocalDate3 = b4;
                    }
                    map.remove(this);
                    map.remove(chronoField2);
                    map.remove(chronoField3);
                    map.remove(chronoField);
                    return chronoLocalDate3;
                }
            }
            if (qVar2 != a.YEARS) {
                return null;
            }
            long j2 = intExact;
            ChronoLocalDate O2 = q.O(a, 1, 1);
            if (d0Var == d0.LENIENT) {
                int b5 = b(O2);
                int h4 = O2.h(ChronoField.DAY_OF_YEAR);
                chronoLocalDate2 = O2.b(Math.addExact(Math.multiplyExact(Math.subtractExact(j2, a(h(h4, b5), h4)), 7L), floorMod - b(O2)), a.DAYS);
            } else {
                int b6 = b(O2);
                int h5 = O2.h(ChronoField.DAY_OF_YEAR);
                ChronoLocalDate b7 = O2.b((((int) (sVar.a(j2, this) - a(h(h5, b6), h5))) * 7) + (floorMod - b(O2)), a.DAYS);
                if (d0Var == d0.STRICT && b7.k(chronoField2) != a) {
                    j$.time.e.a("Strict mode rejected resolved date as it is in a different year");
                    return null;
                }
                chronoLocalDate2 = b7;
            }
            map.remove(this);
            map.remove(chronoField2);
            map.remove(chronoField);
            return chronoLocalDate2;
        } else if ((qVar2 != u.h && qVar2 != a.FOREVER) || !map.containsKey(uVar.f) || !map.containsKey(uVar.e)) {
            return null;
        } else {
            t tVar = uVar.f;
            int a2 = tVar.e.a(((Long) map.get(tVar)).longValue(), uVar.f);
            if (d0Var == d0.LENIENT) {
                chronoLocalDate = e(q, a2, 1, floorMod).b(Math.subtractExact(((Long) map.get(uVar.e)).longValue(), 1L), qVar);
            } else {
                t tVar2 = uVar.e;
                ChronoLocalDate e = e(q, a2, tVar2.e.a(((Long) map.get(tVar2)).longValue(), uVar.e), floorMod);
                if (d0Var == d0.STRICT && c(e) != a2) {
                    j$.time.e.a("Strict mode rejected resolved date as it is in a different week-based-year");
                    return null;
                }
                chronoLocalDate = e;
            }
            map.remove(this);
            map.remove(uVar.f);
            map.remove(uVar.e);
            map.remove(chronoField);
            return chronoLocalDate;
        }
    }

    @Override // j$.time.temporal.TemporalField
    public final s I() {
        return this.e;
    }

    @Override // j$.time.temporal.TemporalField
    public final long N(TemporalAccessor temporalAccessor) {
        int c;
        a aVar = a.WEEKS;
        q qVar = this.d;
        if (qVar == aVar) {
            c = b(temporalAccessor);
        } else if (qVar == a.MONTHS) {
            int b = b(temporalAccessor);
            int h2 = temporalAccessor.h(ChronoField.DAY_OF_MONTH);
            c = a(h(h2, b), h2);
        } else if (qVar == a.YEARS) {
            int b2 = b(temporalAccessor);
            int h3 = temporalAccessor.h(ChronoField.DAY_OF_YEAR);
            c = a(h(h3, b2), h3);
        } else if (qVar == u.h) {
            c = d(temporalAccessor);
        } else if (qVar == a.FOREVER) {
            c = c(temporalAccessor);
        } else {
            throw new IllegalStateException("unreachable, rangeUnit: " + qVar + ", this: " + this);
        }
        return c;
    }

    @Override // j$.time.temporal.TemporalField
    public final l T(l lVar, long j) {
        int a = this.e.a(j, this);
        int h2 = lVar.h(this);
        if (a == h2) {
            return lVar;
        }
        if (this.d == a.FOREVER) {
            u uVar = this.b;
            int h3 = lVar.h(uVar.c);
            return e(j$.time.chrono.j.q(lVar), (int) j, lVar.h(uVar.e), h3);
        }
        return lVar.b(a - h2, this.c);
    }

    public final int b(TemporalAccessor temporalAccessor) {
        return Math.floorMod(temporalAccessor.h(ChronoField.DAY_OF_WEEK) - this.b.a.getValue(), 7) + 1;
    }

    public final int c(TemporalAccessor temporalAccessor) {
        int b = b(temporalAccessor);
        int h2 = temporalAccessor.h(ChronoField.YEAR);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int h3 = temporalAccessor.h(chronoField);
        int h4 = h(h3, b);
        int a = a(h4, h3);
        if (a == 0) {
            return h2 - 1;
        }
        if (a >= a(h4, ((int) temporalAccessor.l(chronoField).d) + this.b.b)) {
            return h2 + 1;
        }
        return h2;
    }

    public final int d(TemporalAccessor temporalAccessor) {
        int a;
        int b = b(temporalAccessor);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int h2 = temporalAccessor.h(chronoField);
        int h3 = h(h2, b);
        int a2 = a(h3, h2);
        if (a2 == 0) {
            return d(j$.time.chrono.j.q(temporalAccessor).G(temporalAccessor).c(h2, (q) a.DAYS));
        }
        if (a2 > 50 && a2 >= (a = a(h3, ((int) temporalAccessor.l(chronoField).d) + this.b.b))) {
            return (a2 - a) + 1;
        }
        return a2;
    }

    public final ChronoLocalDate e(j$.time.chrono.j jVar, int i2, int i3, int i4) {
        ChronoLocalDate O = jVar.O(i2, 1, 1);
        int h2 = h(1, b(O));
        int i5 = i4 - 1;
        return O.b(((Math.min(i3, a(h2, O.S() + this.b.b) - 1) - 1) * 7) + i5 + (-h2), (q) a.DAYS);
    }

    public final s f(TemporalAccessor temporalAccessor, ChronoField chronoField) {
        int h2 = h(temporalAccessor.h(chronoField), b(temporalAccessor));
        s l = temporalAccessor.l(chronoField);
        return s.f(a(h2, (int) l.a), a(h2, (int) l.d));
    }

    public final s g(TemporalAccessor temporalAccessor) {
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        if (!temporalAccessor.i(chronoField)) {
            return h;
        }
        int b = b(temporalAccessor);
        int h2 = temporalAccessor.h(chronoField);
        int h3 = h(h2, b);
        int a = a(h3, h2);
        if (a == 0) {
            return g(j$.time.chrono.j.q(temporalAccessor).G(temporalAccessor).c(h2 + 7, (q) a.DAYS));
        }
        int i2 = (int) temporalAccessor.l(chronoField).d;
        int a2 = a(h3, this.b.b + i2);
        if (a >= a2) {
            return g(j$.time.chrono.j.q(temporalAccessor).G(temporalAccessor).b((i2 - h2) + 8, (q) a.DAYS));
        }
        return s.f(1L, a2 - 1);
    }

    public final int h(int i2, int i3) {
        int floorMod = Math.floorMod(i2 - i3, 7);
        int i4 = -floorMod;
        if (floorMod + 1 > this.b.b) {
            return 7 - floorMod;
        }
        return i4;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    public final String toString() {
        String uVar = this.b.toString();
        return this.a + "[" + uVar + "]";
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean v(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.i(ChronoField.DAY_OF_WEEK)) {
            a aVar = a.WEEKS;
            q qVar = this.d;
            if (qVar == aVar) {
                return true;
            }
            if (qVar == a.MONTHS) {
                return temporalAccessor.i(ChronoField.DAY_OF_MONTH);
            }
            if (qVar == a.YEARS) {
                return temporalAccessor.i(ChronoField.DAY_OF_YEAR);
            }
            if (qVar == u.h) {
                return temporalAccessor.i(ChronoField.DAY_OF_YEAR);
            }
            if (qVar == a.FOREVER) {
                return temporalAccessor.i(ChronoField.YEAR);
            }
            return false;
        }
        return false;
    }
}
