package j$.time.format;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class DateTimeFormatterBuilder {
    public static final j$.time.f h = new j$.time.f(5);
    public static final Map i;
    public DateTimeFormatterBuilder a;
    public final DateTimeFormatterBuilder b;
    public final List c;
    public final boolean d;
    public int e;
    public char f;
    public int g;

    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put('G', ChronoField.ERA);
        hashMap.put('y', ChronoField.YEAR_OF_ERA);
        hashMap.put('u', ChronoField.YEAR);
        j$.time.temporal.g gVar = j$.time.temporal.i.a;
        hashMap.put('Q', gVar);
        hashMap.put('q', gVar);
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        hashMap.put('M', chronoField);
        hashMap.put('L', chronoField);
        hashMap.put('D', ChronoField.DAY_OF_YEAR);
        hashMap.put('d', ChronoField.DAY_OF_MONTH);
        hashMap.put('F', ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        hashMap.put('E', chronoField2);
        hashMap.put('c', chronoField2);
        hashMap.put('e', chronoField2);
        hashMap.put('a', ChronoField.AMPM_OF_DAY);
        hashMap.put('H', ChronoField.HOUR_OF_DAY);
        hashMap.put('k', ChronoField.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', ChronoField.HOUR_OF_AMPM);
        hashMap.put('h', ChronoField.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', ChronoField.MINUTE_OF_HOUR);
        hashMap.put('s', ChronoField.SECOND_OF_MINUTE);
        ChronoField chronoField3 = ChronoField.NANO_OF_SECOND;
        hashMap.put('S', chronoField3);
        hashMap.put('A', ChronoField.MILLI_OF_DAY);
        hashMap.put('n', chronoField3);
        hashMap.put('N', ChronoField.NANO_OF_DAY);
        hashMap.put('g', j$.time.temporal.k.a);
    }

    public DateTimeFormatterBuilder() {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        c(dateTimeFormatter.b());
    }

    public DateTimeFormatterBuilder appendLiteral(char c) {
        c(new c(c));
        return this;
    }

    public DateTimeFormatterBuilder appendOffset(String str, String str2) {
        c(new k(str, str2));
        return this;
    }

    public DateTimeFormatterBuilder appendOffsetId() {
        c(k.e);
        return this;
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField, int i2, int i3, SignStyle signStyle) {
        if (i2 == i3 && signStyle == SignStyle.NOT_NEGATIVE) {
            return appendValue(temporalField, i3);
        }
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(signStyle, "signStyle");
        if (i2 >= 1 && i2 <= 19) {
            if (i3 >= 1 && i3 <= 19) {
                if (i3 >= i2) {
                    j(new j(temporalField, i2, i3, signStyle));
                    return this;
                }
                throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
            }
            j$.time.e.h("The maximum width must be from 1 to 19 inclusive but was ", i3);
            return null;
        }
        j$.time.e.h("The minimum width must be from 1 to 19 inclusive but was ", i2);
        return null;
    }

    public final void b(ChronoField chronoField, int i2, int i3, boolean z) {
        if (i2 == i3 && !z) {
            j(new f(chronoField, i2, i3, z));
        } else {
            c(new f(chronoField, i2, i3, z));
        }
    }

    public final int c(e eVar) {
        Objects.requireNonNull(eVar, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        int i2 = dateTimeFormatterBuilder.e;
        if (i2 > 0) {
            l lVar = new l(eVar, i2, dateTimeFormatterBuilder.f);
            dateTimeFormatterBuilder.e = 0;
            dateTimeFormatterBuilder.f = (char) 0;
            eVar = lVar;
        }
        ((ArrayList) dateTimeFormatterBuilder.c).add(eVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.a;
        dateTimeFormatterBuilder2.g = -1;
        return ((ArrayList) dateTimeFormatterBuilder2.c).size() - 1;
    }

    public final void d(String str) {
        Objects.requireNonNull(str, "literal");
        if (!str.isEmpty()) {
            if (str.length() == 1) {
                c(new c(str.charAt(0)));
            } else {
                c(new h(str, 1));
            }
        }
    }

    public final void e(FormatStyle formatStyle, FormatStyle formatStyle2) {
        if (formatStyle == null && formatStyle2 == null) {
            throw new IllegalArgumentException("Either the date or time style must be non-null");
        }
        c(new i(formatStyle, formatStyle2));
    }

    public final void f(e0 e0Var) {
        Objects.requireNonNull(e0Var, "style");
        if (e0Var != e0.FULL && e0Var != e0.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        c(new h(e0Var, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0382 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.g(java.lang.String):void");
    }

    public final void h(ChronoField chronoField, Map map) {
        Objects.requireNonNull(chronoField, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        e0 e0Var = e0.FULL;
        c(new r(chronoField, e0Var, new a(new z(Collections.singletonMap(e0Var, linkedHashMap)))));
    }

    public final void i(TemporalField temporalField, e0 e0Var) {
        Objects.requireNonNull(e0Var, "textStyle");
        c(new r(temporalField, e0Var, a0.c));
    }

    public final void j(j jVar) {
        j d;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        int i2 = dateTimeFormatterBuilder.g;
        if (i2 >= 0) {
            j jVar2 = (j) ((ArrayList) dateTimeFormatterBuilder.c).get(i2);
            int i3 = jVar.b;
            int i4 = jVar.c;
            if (i3 == i4 && jVar.d == SignStyle.NOT_NEGATIVE) {
                d = jVar2.e(i4);
                c(jVar.d());
                this.a.g = i2;
            } else {
                d = jVar2.d();
                this.a.g = c(jVar);
            }
            ((ArrayList) this.a.c).set(i2, d);
            return;
        }
        dateTimeFormatterBuilder.g = c(jVar);
    }

    public final void k(TemporalField temporalField) {
        j(new j(temporalField, 1, 19, SignStyle.NORMAL));
    }

    public final void l() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        if (dateTimeFormatterBuilder.b != null) {
            int size = ((ArrayList) dateTimeFormatterBuilder.c).size();
            DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.a;
            if (size > 0) {
                d dVar = new d(dateTimeFormatterBuilder2.c, dateTimeFormatterBuilder2.d);
                this.a = this.a.b;
                c(dVar);
                return;
            }
            this.a = dateTimeFormatterBuilder2.b;
            return;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    public final void m() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        dateTimeFormatterBuilder.g = -1;
        this.a = new DateTimeFormatterBuilder(dateTimeFormatterBuilder);
    }

    public final DateTimeFormatter n(d0 d0Var, j$.time.chrono.j jVar) {
        return o(Locale.getDefault(), d0Var, jVar);
    }

    public final DateTimeFormatter o(Locale locale, d0 d0Var, j$.time.chrono.j jVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.a.b != null) {
            l();
        }
        return new DateTimeFormatter(new d(this.c, false), locale, b0.a, d0Var, jVar);
    }

    public DateTimeFormatterBuilder parseCaseInsensitive() {
        c(q.INSENSITIVE);
        return this;
    }

    public DateTimeFormatter toFormatter() {
        return o(Locale.getDefault(), d0.SMART, null);
    }

    public DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder) {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = dateTimeFormatterBuilder;
        this.d = true;
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField, int i2) {
        Objects.requireNonNull(temporalField, "field");
        if (i2 >= 1 && i2 <= 19) {
            j(new j(temporalField, i2, i2, SignStyle.NOT_NEGATIVE));
            return this;
        }
        j$.time.e.h("The width must be from 1 to 19 inclusive but was ", i2);
        return null;
    }
}
