package j$.time.format;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter RFC_1123_DATE_TIME;
    public static final DateTimeFormatter f;
    public static final DateTimeFormatter g;
    public static final DateTimeFormatter h;
    public final d a;
    public final Locale b;
    public final b0 c;
    public final d0 d;
    public final j$.time.chrono.j e;

    /* JADX WARN: Type inference failed for: r3v11, types: [j$.time.format.e, java.lang.Object] */
    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        ChronoField chronoField = ChronoField.YEAR;
        SignStyle signStyle = SignStyle.EXCEEDS_PAD;
        DateTimeFormatterBuilder appendLiteral = dateTimeFormatterBuilder.appendValue(chronoField, 4, 10, signStyle).appendLiteral('-');
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        DateTimeFormatterBuilder appendLiteral2 = appendLiteral.appendValue(chronoField2, 2).appendLiteral('-');
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        DateTimeFormatterBuilder appendValue = appendLiteral2.appendValue(chronoField3, 2);
        d0 d0Var = d0.STRICT;
        j$.time.chrono.q qVar = j$.time.chrono.q.c;
        DateTimeFormatter n = appendValue.n(d0Var, qVar);
        ISO_LOCAL_DATE = n;
        DateTimeFormatterBuilder parseCaseInsensitive = new DateTimeFormatterBuilder().parseCaseInsensitive();
        parseCaseInsensitive.a(n);
        parseCaseInsensitive.appendOffsetId().n(d0Var, qVar);
        DateTimeFormatterBuilder parseCaseInsensitive2 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        parseCaseInsensitive2.a(n);
        parseCaseInsensitive2.m();
        parseCaseInsensitive2.appendOffsetId().n(d0Var, qVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        ChronoField chronoField4 = ChronoField.HOUR_OF_DAY;
        DateTimeFormatterBuilder appendLiteral3 = dateTimeFormatterBuilder2.appendValue(chronoField4, 2).appendLiteral(':');
        ChronoField chronoField5 = ChronoField.MINUTE_OF_HOUR;
        DateTimeFormatterBuilder appendValue2 = appendLiteral3.appendValue(chronoField5, 2);
        appendValue2.m();
        DateTimeFormatterBuilder appendLiteral4 = appendValue2.appendLiteral(':');
        ChronoField chronoField6 = ChronoField.SECOND_OF_MINUTE;
        DateTimeFormatterBuilder appendValue3 = appendLiteral4.appendValue(chronoField6, 2);
        appendValue3.m();
        appendValue3.b(ChronoField.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter n2 = appendValue3.n(d0Var, null);
        f = n2;
        DateTimeFormatterBuilder parseCaseInsensitive3 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        parseCaseInsensitive3.a(n2);
        parseCaseInsensitive3.appendOffsetId().n(d0Var, null);
        DateTimeFormatterBuilder parseCaseInsensitive4 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        parseCaseInsensitive4.a(n2);
        parseCaseInsensitive4.m();
        parseCaseInsensitive4.appendOffsetId().n(d0Var, null);
        DateTimeFormatterBuilder parseCaseInsensitive5 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        parseCaseInsensitive5.a(n);
        DateTimeFormatterBuilder appendLiteral5 = parseCaseInsensitive5.appendLiteral('T');
        appendLiteral5.a(n2);
        DateTimeFormatter n3 = appendLiteral5.n(d0Var, qVar);
        g = n3;
        DateTimeFormatterBuilder parseCaseInsensitive6 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        parseCaseInsensitive6.a(n3);
        q qVar2 = q.LENIENT;
        parseCaseInsensitive6.c(qVar2);
        DateTimeFormatterBuilder appendOffsetId = parseCaseInsensitive6.appendOffsetId();
        q qVar3 = q.STRICT;
        appendOffsetId.c(qVar3);
        DateTimeFormatter n4 = appendOffsetId.n(d0Var, qVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.a(n4);
        dateTimeFormatterBuilder3.m();
        DateTimeFormatterBuilder appendLiteral6 = dateTimeFormatterBuilder3.appendLiteral('[');
        q qVar4 = q.SENSITIVE;
        appendLiteral6.c(qVar4);
        j$.time.f fVar = DateTimeFormatterBuilder.h;
        appendLiteral6.c(new t(fVar, "ZoneRegionId()"));
        appendLiteral6.appendLiteral(']').n(d0Var, qVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder4.a(n3);
        dateTimeFormatterBuilder4.m();
        DateTimeFormatterBuilder appendOffsetId2 = dateTimeFormatterBuilder4.appendOffsetId();
        appendOffsetId2.m();
        DateTimeFormatterBuilder appendLiteral7 = appendOffsetId2.appendLiteral('[');
        appendLiteral7.c(qVar4);
        appendLiteral7.c(new t(fVar, "ZoneRegionId()"));
        appendLiteral7.appendLiteral(']').n(d0Var, qVar);
        DateTimeFormatterBuilder appendValue4 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(chronoField, 4, 10, signStyle).appendLiteral('-').appendValue(ChronoField.DAY_OF_YEAR, 3);
        appendValue4.m();
        appendValue4.appendOffsetId().n(d0Var, qVar);
        DateTimeFormatterBuilder appendValue5 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(j$.time.temporal.i.c, 4, 10, signStyle);
        appendValue5.d("-W");
        DateTimeFormatterBuilder appendLiteral8 = appendValue5.appendValue(j$.time.temporal.i.b, 2).appendLiteral('-');
        ChronoField chronoField7 = ChronoField.DAY_OF_WEEK;
        DateTimeFormatterBuilder appendValue6 = appendLiteral8.appendValue(chronoField7, 1);
        appendValue6.m();
        appendValue6.appendOffsetId().n(d0Var, qVar);
        DateTimeFormatterBuilder parseCaseInsensitive7 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        parseCaseInsensitive7.getClass();
        parseCaseInsensitive7.c(new Object());
        h = parseCaseInsensitive7.n(d0Var, null);
        DateTimeFormatterBuilder appendValue7 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(chronoField, 4).appendValue(chronoField2, 2).appendValue(chronoField3, 2);
        appendValue7.m();
        appendValue7.c(qVar2);
        DateTimeFormatterBuilder appendOffset = appendValue7.appendOffset("+HHMMss", "Z");
        appendOffset.c(qVar3);
        appendOffset.n(d0Var, qVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        DateTimeFormatterBuilder parseCaseInsensitive8 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        parseCaseInsensitive8.c(qVar2);
        parseCaseInsensitive8.m();
        parseCaseInsensitive8.h(chronoField7, hashMap);
        parseCaseInsensitive8.d(", ");
        parseCaseInsensitive8.l();
        DateTimeFormatterBuilder appendLiteral9 = parseCaseInsensitive8.appendValue(chronoField3, 1, 2, SignStyle.NOT_NEGATIVE).appendLiteral(' ');
        appendLiteral9.h(chronoField2, hashMap2);
        DateTimeFormatterBuilder appendValue8 = appendLiteral9.appendLiteral(' ').appendValue(chronoField, 4).appendLiteral(' ').appendValue(chronoField4, 2).appendLiteral(':').appendValue(chronoField5, 2);
        appendValue8.m();
        DateTimeFormatterBuilder appendValue9 = appendValue8.appendLiteral(':').appendValue(chronoField6, 2);
        appendValue9.l();
        RFC_1123_DATE_TIME = appendValue9.appendLiteral(' ').appendOffset("+HHMM", "GMT").n(d0.SMART, qVar);
    }

    public DateTimeFormatter(d dVar, Locale locale, b0 b0Var, d0 d0Var, j$.time.chrono.j jVar) {
        Objects.requireNonNull(dVar, "printerParser");
        this.a = dVar;
        Objects.requireNonNull(locale, "locale");
        this.b = locale;
        Objects.requireNonNull(b0Var, "decimalStyle");
        this.c = b0Var;
        Objects.requireNonNull(d0Var, "resolverStyle");
        this.d = d0Var;
        this.e = jVar;
    }

    public static DateTimeFormatter ofLocalizedDate(FormatStyle formatStyle) {
        Objects.requireNonNull(formatStyle, "dateStyle");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.e(formatStyle, null);
        return dateTimeFormatterBuilder.n(d0.SMART, j$.time.chrono.q.c);
    }

    public static DateTimeFormatter ofLocalizedDateTime(FormatStyle formatStyle) {
        Objects.requireNonNull(formatStyle, "dateTimeStyle");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.e(formatStyle, formatStyle);
        return dateTimeFormatterBuilder.n(d0.SMART, j$.time.chrono.q.c);
    }

    public static DateTimeFormatter ofLocalizedTime(FormatStyle formatStyle) {
        Objects.requireNonNull(formatStyle, "timeStyle");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.e(null, formatStyle);
        return dateTimeFormatterBuilder.n(d0.SMART, j$.time.chrono.q.c);
    }

    public static DateTimeFormatter ofPattern(String str) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.g(str);
        return dateTimeFormatterBuilder.toFormatter();
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x030a, code lost:
        if (((java.util.HashMap) r8.a).containsKey(j$.time.temporal.ChronoField.SECOND_OF_MINUTE) != false) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0275  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.format.c0 a(java.lang.CharSequence r24) {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatter.a(java.lang.CharSequence):j$.time.format.c0");
    }

    public final d b() {
        d dVar = this.a;
        if (!dVar.b) {
            return dVar;
        }
        return new d(dVar.a, false);
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        d dVar = this.a;
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            dVar.v(new x(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public <T> T parse(CharSequence charSequence, TemporalQuery<T> temporalQuery) {
        String charSequence2;
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(temporalQuery, "query");
        try {
            return (T) a(charSequence).d(temporalQuery);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            if (charSequence.length() > 64) {
                charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                charSequence2 = charSequence.toString();
            }
            RuntimeException runtimeException = new RuntimeException("Text '" + charSequence2 + "' could not be parsed: " + e2.getMessage(), e2);
            charSequence.toString();
            throw runtimeException;
        }
    }

    public final String toString() {
        String dVar = this.a.toString();
        if (dVar.startsWith("[")) {
            return dVar;
        }
        return dVar.substring(1, dVar.length() - 1);
    }

    public DateTimeFormatter withLocale(Locale locale) {
        if (this.b.equals(locale)) {
            return this;
        }
        return new DateTimeFormatter(this.a, locale, this.c, this.d, this.e);
    }
}
