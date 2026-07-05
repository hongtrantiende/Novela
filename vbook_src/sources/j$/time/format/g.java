package j$.time.format;

import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class g implements e {
    @Override // j$.time.format.e
    public final int A(v vVar, CharSequence charSequence, int i) {
        int i2;
        int i3;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.a(DateTimeFormatter.ISO_LOCAL_DATE);
        DateTimeFormatterBuilder appendLiteral = dateTimeFormatterBuilder.appendLiteral('T');
        ChronoField chronoField = ChronoField.HOUR_OF_DAY;
        DateTimeFormatterBuilder appendLiteral2 = appendLiteral.appendValue(chronoField, 2).appendLiteral(':');
        ChronoField chronoField2 = ChronoField.MINUTE_OF_HOUR;
        DateTimeFormatterBuilder appendLiteral3 = appendLiteral2.appendValue(chronoField2, 2).appendLiteral(':');
        ChronoField chronoField3 = ChronoField.SECOND_OF_MINUTE;
        DateTimeFormatterBuilder appendValue = appendLiteral3.appendValue(chronoField3, 2);
        ChronoField chronoField4 = ChronoField.NANO_OF_SECOND;
        int i4 = 1;
        appendValue.b(chronoField4, 0, 9, true);
        d b = appendValue.appendLiteral('Z').toFormatter().b();
        v vVar2 = new v(vVar.a);
        vVar2.b = vVar.b;
        vVar2.c = vVar.c;
        int A = b.A(vVar2, charSequence, i);
        if (A < 0) {
            return A;
        }
        long longValue = vVar2.e(ChronoField.YEAR).longValue();
        int intValue = vVar2.e(ChronoField.MONTH_OF_YEAR).intValue();
        int intValue2 = vVar2.e(ChronoField.DAY_OF_MONTH).intValue();
        int intValue3 = vVar2.e(chronoField).intValue();
        int intValue4 = vVar2.e(chronoField2).intValue();
        Long e = vVar2.e(chronoField3);
        Long e2 = vVar2.e(chronoField4);
        if (e != null) {
            i2 = e.intValue();
        } else {
            i2 = 0;
        }
        if (e2 != null) {
            i3 = e2.intValue();
        } else {
            i3 = 0;
        }
        if (intValue3 == 24 && intValue4 == 0 && i2 == 0 && i3 == 0) {
            intValue3 = 0;
        } else if (intValue3 == 23 && intValue4 == 59 && i2 == 60) {
            vVar.c().d = true;
            i4 = 0;
            i2 = 59;
        } else {
            i4 = 0;
        }
        int i5 = ((int) longValue) % 10000;
        try {
            LocalDateTime localDateTime = LocalDateTime.MIN;
            LocalDate of = LocalDate.of(i5, intValue, intValue2);
            LocalTime of2 = LocalTime.of(intValue3, intValue4, i2, 0);
            return vVar.g(chronoField4, i3, i, vVar.g(ChronoField.INSTANT_SECONDS, new LocalDateTime(of, of2).Y(of.plusDays(i4), of2).u(ZoneOffset.UTC) + Math.multiplyExact(longValue / 10000, 315569520000L), i, A));
        } catch (RuntimeException unused) {
            return ~i;
        }
    }

    public final String toString() {
        return "Instant()";
    }

    @Override // j$.time.format.e
    public final boolean v(x xVar, StringBuilder sb) {
        Long l;
        long j;
        Long a = xVar.a(ChronoField.INSTANT_SECONDS);
        TemporalAccessor temporalAccessor = xVar.a;
        ChronoField chronoField = ChronoField.NANO_OF_SECOND;
        if (temporalAccessor.i(chronoField)) {
            l = Long.valueOf(temporalAccessor.k(chronoField));
        } else {
            l = null;
        }
        int i = 0;
        if (a == null) {
            return false;
        }
        long longValue = a.longValue();
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        int a2 = chronoField.b.a(j, chronoField);
        if (longValue >= -62167219200L) {
            long j2 = longValue - 253402300800L;
            long floorDiv = Math.floorDiv(j2, 315569520000L) + 1;
            LocalDateTime I = LocalDateTime.I(Math.floorMod(j2, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (floorDiv > 0) {
                sb.append('+');
                sb.append(floorDiv);
            }
            sb.append(I);
            if (I.b.c == 0) {
                sb.append(":00");
            }
        } else {
            long j3 = longValue + 62167219200L;
            long j4 = j3 / 315569520000L;
            long j5 = j3 % 315569520000L;
            LocalDateTime I2 = LocalDateTime.I(j5 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(I2);
            if (I2.b.c == 0) {
                sb.append(":00");
            }
            if (j4 < 0) {
                if (I2.getYear() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j4 - 1));
                } else if (j5 == 0) {
                    sb.insert(length, j4);
                } else {
                    sb.insert(length + 1, Math.abs(j4));
                }
            }
        }
        if (a2 > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (a2 <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = a2 / i2;
                sb.append((char) (i3 + 48));
                a2 -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return true;
    }
}
