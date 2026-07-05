package j$.time.format;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class c0 implements TemporalAccessor {
    public ZoneId b;
    public j$.time.chrono.j c;
    public boolean d;
    public d0 e;
    public ChronoLocalDate f;
    public LocalTime g;
    public final Map a = new HashMap();
    public j$.time.o h = j$.time.o.d;

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.p.a) {
            return this.b;
        }
        if (temporalQuery == j$.time.temporal.p.b) {
            return this.c;
        }
        if (temporalQuery == j$.time.temporal.p.f) {
            ChronoLocalDate chronoLocalDate = this.f;
            if (chronoLocalDate != null) {
                return LocalDate.F(chronoLocalDate);
            }
            return null;
        } else if (temporalQuery == j$.time.temporal.p.g) {
            return this.g;
        } else {
            if (temporalQuery == j$.time.temporal.p.d) {
                Long l = (Long) ((HashMap) this.a).get(ChronoField.OFFSET_SECONDS);
                if (l != null) {
                    return ZoneOffset.ofTotalSeconds(l.intValue());
                }
                ZoneId zoneId = this.b;
                if (zoneId instanceof ZoneOffset) {
                    return zoneId;
                }
                return temporalQuery.queryFrom(this);
            } else if (temporalQuery == j$.time.temporal.p.e) {
                return temporalQuery.queryFrom(this);
            } else {
                if (temporalQuery == j$.time.temporal.p.c) {
                    return null;
                }
                return temporalQuery.queryFrom(this);
            }
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean i(TemporalField temporalField) {
        if (!((HashMap) this.a).containsKey(temporalField)) {
            ChronoLocalDate chronoLocalDate = this.f;
            if (chronoLocalDate == null || !chronoLocalDate.i(temporalField)) {
                LocalTime localTime = this.g;
                if (localTime == null || !localTime.i(temporalField)) {
                    if (temporalField == null || (temporalField instanceof ChronoField) || !temporalField.v(this)) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(TemporalField temporalField) {
        Objects.requireNonNull(temporalField, "field");
        Long l = (Long) ((HashMap) this.a).get(temporalField);
        if (l != null) {
            return l.longValue();
        }
        ChronoLocalDate chronoLocalDate = this.f;
        if (chronoLocalDate != null && chronoLocalDate.i(temporalField)) {
            return this.f.k(temporalField);
        }
        LocalTime localTime = this.g;
        if (localTime != null && localTime.i(temporalField)) {
            return this.g.k(temporalField);
        }
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.N(this);
        }
        throw new DateTimeException(j$.time.c.a("Unsupported field: ", temporalField));
    }

    public final void o(TemporalAccessor temporalAccessor) {
        Iterator it = ((HashMap) this.a).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            TemporalField temporalField = (TemporalField) entry.getKey();
            if (temporalAccessor.i(temporalField)) {
                try {
                    long k = temporalAccessor.k(temporalField);
                    long longValue = ((Long) entry.getValue()).longValue();
                    if (k == longValue) {
                        it.remove();
                    } else {
                        throw new DateTimeException("Conflict found: Field " + temporalField + " " + k + " differs from " + temporalField + " " + longValue + " derived from " + temporalAccessor);
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    public final void p() {
        if (((HashMap) this.a).containsKey(ChronoField.INSTANT_SECONDS)) {
            ZoneId zoneId = this.b;
            if (zoneId != null) {
                q(zoneId);
                return;
            }
            Long l = (Long) ((HashMap) this.a).get(ChronoField.OFFSET_SECONDS);
            if (l != null) {
                q(ZoneOffset.ofTotalSeconds(l.intValue()));
            }
        }
    }

    public final void q(ZoneId zoneId) {
        Map map = this.a;
        ChronoField chronoField = ChronoField.INSTANT_SECONDS;
        ChronoZonedDateTime R = this.c.R(Instant.v(((Long) ((HashMap) map).remove(chronoField)).longValue(), 0), zoneId);
        y(R.m());
        z(chronoField, ChronoField.SECOND_OF_DAY, Long.valueOf(R.toLocalTime().b0()));
    }

    public final void s(long j, long j2, long j3, long j4) {
        if (this.e == d0.LENIENT) {
            long addExact = Math.addExact(Math.addExact(Math.addExact(Math.multiplyExact(j, 3600000000000L), Math.multiplyExact(j2, 60000000000L)), Math.multiplyExact(j3, 1000000000L)), j4);
            v(LocalTime.I(Math.floorMod(addExact, 86400000000000L)), j$.time.o.a(0, 0, (int) Math.floorDiv(addExact, 86400000000000L)));
            return;
        }
        ChronoField chronoField = ChronoField.MINUTE_OF_HOUR;
        int a = chronoField.b.a(j2, chronoField);
        ChronoField chronoField2 = ChronoField.NANO_OF_SECOND;
        int a2 = chronoField2.b.a(j4, chronoField2);
        if (this.e == d0.SMART && j == 24 && a == 0 && j3 == 0 && a2 == 0) {
            v(LocalTime.e, j$.time.o.a(0, 0, 1));
            return;
        }
        ChronoField chronoField3 = ChronoField.HOUR_OF_DAY;
        int a3 = chronoField3.b.a(j, chronoField3);
        ChronoField chronoField4 = ChronoField.SECOND_OF_MINUTE;
        v(LocalTime.of(a3, a, chronoField4.b.a(j3, chronoField4), a2), j$.time.o.d);
    }

    public final void t() {
        Map map = this.a;
        ChronoField chronoField = ChronoField.CLOCK_HOUR_OF_DAY;
        if (((HashMap) map).containsKey(chronoField)) {
            long longValue = ((Long) ((HashMap) this.a).remove(chronoField)).longValue();
            d0 d0Var = this.e;
            if (d0Var == d0.STRICT || (d0Var == d0.SMART && longValue != 0)) {
                chronoField.W(longValue);
            }
            ChronoField chronoField2 = ChronoField.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            z(chronoField, chronoField2, Long.valueOf(longValue));
        }
        Map map2 = this.a;
        ChronoField chronoField3 = ChronoField.CLOCK_HOUR_OF_AMPM;
        if (((HashMap) map2).containsKey(chronoField3)) {
            long longValue2 = ((Long) ((HashMap) this.a).remove(chronoField3)).longValue();
            d0 d0Var2 = this.e;
            if (d0Var2 == d0.STRICT || (d0Var2 == d0.SMART && longValue2 != 0)) {
                chronoField3.W(longValue2);
            }
            z(chronoField3, ChronoField.HOUR_OF_AMPM, Long.valueOf(longValue2 != 12 ? longValue2 : 0L));
        }
        Map map3 = this.a;
        ChronoField chronoField4 = ChronoField.AMPM_OF_DAY;
        if (((HashMap) map3).containsKey(chronoField4)) {
            Map map4 = this.a;
            ChronoField chronoField5 = ChronoField.HOUR_OF_AMPM;
            if (((HashMap) map4).containsKey(chronoField5)) {
                long longValue3 = ((Long) ((HashMap) this.a).remove(chronoField4)).longValue();
                long longValue4 = ((Long) ((HashMap) this.a).remove(chronoField5)).longValue();
                if (this.e == d0.LENIENT) {
                    z(chronoField4, ChronoField.HOUR_OF_DAY, Long.valueOf(Math.addExact(Math.multiplyExact(longValue3, 12L), longValue4)));
                } else {
                    chronoField4.W(longValue3);
                    chronoField5.W(longValue3);
                    z(chronoField4, ChronoField.HOUR_OF_DAY, Long.valueOf((longValue3 * 12) + longValue4));
                }
            }
        }
        Map map5 = this.a;
        ChronoField chronoField6 = ChronoField.NANO_OF_DAY;
        if (((HashMap) map5).containsKey(chronoField6)) {
            long longValue5 = ((Long) ((HashMap) this.a).remove(chronoField6)).longValue();
            if (this.e != d0.LENIENT) {
                chronoField6.W(longValue5);
            }
            z(chronoField6, ChronoField.HOUR_OF_DAY, Long.valueOf(longValue5 / 3600000000000L));
            z(chronoField6, ChronoField.MINUTE_OF_HOUR, Long.valueOf((longValue5 / 60000000000L) % 60));
            z(chronoField6, ChronoField.SECOND_OF_MINUTE, Long.valueOf((longValue5 / 1000000000) % 60));
            z(chronoField6, ChronoField.NANO_OF_SECOND, Long.valueOf(longValue5 % 1000000000));
        }
        Map map6 = this.a;
        ChronoField chronoField7 = ChronoField.MICRO_OF_DAY;
        if (((HashMap) map6).containsKey(chronoField7)) {
            long longValue6 = ((Long) ((HashMap) this.a).remove(chronoField7)).longValue();
            if (this.e != d0.LENIENT) {
                chronoField7.W(longValue6);
            }
            z(chronoField7, ChronoField.SECOND_OF_DAY, Long.valueOf(longValue6 / 1000000));
            z(chronoField7, ChronoField.MICRO_OF_SECOND, Long.valueOf(longValue6 % 1000000));
        }
        Map map7 = this.a;
        ChronoField chronoField8 = ChronoField.MILLI_OF_DAY;
        if (((HashMap) map7).containsKey(chronoField8)) {
            long longValue7 = ((Long) ((HashMap) this.a).remove(chronoField8)).longValue();
            if (this.e != d0.LENIENT) {
                chronoField8.W(longValue7);
            }
            z(chronoField8, ChronoField.SECOND_OF_DAY, Long.valueOf(longValue7 / 1000));
            z(chronoField8, ChronoField.MILLI_OF_SECOND, Long.valueOf(longValue7 % 1000));
        }
        Map map8 = this.a;
        ChronoField chronoField9 = ChronoField.SECOND_OF_DAY;
        if (((HashMap) map8).containsKey(chronoField9)) {
            long longValue8 = ((Long) ((HashMap) this.a).remove(chronoField9)).longValue();
            if (this.e != d0.LENIENT) {
                chronoField9.W(longValue8);
            }
            z(chronoField9, ChronoField.HOUR_OF_DAY, Long.valueOf(longValue8 / 3600));
            z(chronoField9, ChronoField.MINUTE_OF_HOUR, Long.valueOf((longValue8 / 60) % 60));
            z(chronoField9, ChronoField.SECOND_OF_MINUTE, Long.valueOf(longValue8 % 60));
        }
        Map map9 = this.a;
        ChronoField chronoField10 = ChronoField.MINUTE_OF_DAY;
        if (((HashMap) map9).containsKey(chronoField10)) {
            long longValue9 = ((Long) ((HashMap) this.a).remove(chronoField10)).longValue();
            if (this.e != d0.LENIENT) {
                chronoField10.W(longValue9);
            }
            z(chronoField10, ChronoField.HOUR_OF_DAY, Long.valueOf(longValue9 / 60));
            z(chronoField10, ChronoField.MINUTE_OF_HOUR, Long.valueOf(longValue9 % 60));
        }
        Map map10 = this.a;
        ChronoField chronoField11 = ChronoField.NANO_OF_SECOND;
        if (((HashMap) map10).containsKey(chronoField11)) {
            long longValue10 = ((Long) ((HashMap) this.a).get(chronoField11)).longValue();
            d0 d0Var3 = this.e;
            d0 d0Var4 = d0.LENIENT;
            if (d0Var3 != d0Var4) {
                chronoField11.W(longValue10);
            }
            Map map11 = this.a;
            ChronoField chronoField12 = ChronoField.MICRO_OF_SECOND;
            if (((HashMap) map11).containsKey(chronoField12)) {
                long longValue11 = ((Long) ((HashMap) this.a).remove(chronoField12)).longValue();
                if (this.e != d0Var4) {
                    chronoField12.W(longValue11);
                }
                longValue10 = (longValue10 % 1000) + (longValue11 * 1000);
                z(chronoField12, chronoField11, Long.valueOf(longValue10));
            }
            Map map12 = this.a;
            ChronoField chronoField13 = ChronoField.MILLI_OF_SECOND;
            if (((HashMap) map12).containsKey(chronoField13)) {
                long longValue12 = ((Long) ((HashMap) this.a).remove(chronoField13)).longValue();
                if (this.e != d0Var4) {
                    chronoField13.W(longValue12);
                }
                z(chronoField13, chronoField11, Long.valueOf((longValue10 % 1000000) + (longValue12 * 1000000)));
            }
        }
        Map map13 = this.a;
        ChronoField chronoField14 = ChronoField.HOUR_OF_DAY;
        if (((HashMap) map13).containsKey(chronoField14)) {
            Map map14 = this.a;
            ChronoField chronoField15 = ChronoField.MINUTE_OF_HOUR;
            if (((HashMap) map14).containsKey(chronoField15)) {
                Map map15 = this.a;
                ChronoField chronoField16 = ChronoField.SECOND_OF_MINUTE;
                if (((HashMap) map15).containsKey(chronoField16) && ((HashMap) this.a).containsKey(chronoField11)) {
                    s(((Long) ((HashMap) this.a).remove(chronoField14)).longValue(), ((Long) ((HashMap) this.a).remove(chronoField15)).longValue(), ((Long) ((HashMap) this.a).remove(chronoField16)).longValue(), ((Long) ((HashMap) this.a).remove(chronoField11)).longValue());
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.a);
        sb.append(',');
        sb.append(this.c);
        if (this.b != null) {
            sb.append(',');
            sb.append(this.b);
        }
        if (this.f != null || this.g != null) {
            sb.append(" resolved to ");
            ChronoLocalDate chronoLocalDate = this.f;
            if (chronoLocalDate != null) {
                sb.append(chronoLocalDate);
                if (this.g != null) {
                    sb.append('T');
                    sb.append(this.g);
                }
            } else {
                sb.append(this.g);
            }
        }
        return sb.toString();
    }

    public final void v(LocalTime localTime, j$.time.o oVar) {
        LocalTime localTime2 = this.g;
        if (localTime2 != null) {
            if (localTime2.equals(localTime)) {
                j$.time.o oVar2 = this.h;
                oVar2.getClass();
                j$.time.o oVar3 = j$.time.o.d;
                if (oVar2 == oVar3 || oVar == oVar3 || this.h.equals(oVar)) {
                    this.h = oVar;
                    return;
                } else {
                    j$.time.e.f("Conflict found: Fields resolved to different excess periods: ", this.h, " ", oVar);
                    return;
                }
            }
            j$.time.e.f("Conflict found: Fields resolved to different times: ", this.g, " ", localTime);
            return;
        }
        this.g = localTime;
        this.h = oVar;
    }

    public final void y(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDate2 = this.f;
        if (chronoLocalDate2 != null) {
            if (chronoLocalDate != null && !chronoLocalDate2.equals(chronoLocalDate)) {
                j$.time.e.f("Conflict found: Fields resolved to two different dates: ", this.f, " ", chronoLocalDate);
            }
        } else if (chronoLocalDate != null) {
            if (this.c.equals(chronoLocalDate.g())) {
                this.f = chronoLocalDate;
                return;
            }
            j$.time.chrono.j jVar = this.c;
            throw new DateTimeException("ChronoLocalDate must use the effective parsed chronology: " + jVar);
        }
    }

    public final void z(TemporalField temporalField, ChronoField chronoField, Long l) {
        Long l2 = (Long) ((HashMap) this.a).put(chronoField, l);
        if (l2 != null && l2.longValue() != l.longValue()) {
            throw new DateTimeException("Conflict found: " + chronoField + " " + l2 + " differs from " + chronoField + " " + l + " while resolving  " + temporalField);
        }
    }
}
