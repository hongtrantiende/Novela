package j$.time.format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class i implements e {
    public static final ConcurrentMap c = new ConcurrentHashMap(16, 0.75f, 2);
    public final FormatStyle a;
    public final FormatStyle b;

    public i(FormatStyle formatStyle, FormatStyle formatStyle2) {
        this.a = formatStyle;
        this.b = formatStyle2;
    }

    @Override // j$.time.format.e
    public final int A(v vVar, CharSequence charSequence, int i) {
        return a(vVar.a.b, vVar.d()).b().A(vVar, charSequence, i);
    }

    public final DateTimeFormatter a(Locale locale, j$.time.chrono.j jVar) {
        DateFormat dateTimeInstance;
        boolean z;
        boolean z2;
        String p = jVar.p();
        String locale2 = locale.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(p);
        sb.append("|");
        sb.append(locale2);
        sb.append("|");
        FormatStyle formatStyle = this.a;
        sb.append(formatStyle);
        FormatStyle formatStyle2 = this.b;
        sb.append(formatStyle2);
        String sb2 = sb.toString();
        DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) ((ConcurrentHashMap) c).get(sb2);
        if (dateTimeFormatter == null) {
            j$.time.f fVar = DateTimeFormatterBuilder.h;
            if (formatStyle == null && formatStyle2 == null) {
                throw new IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
            }
            if (formatStyle2 == null) {
                dateTimeInstance = DateFormat.getDateInstance(formatStyle.ordinal(), locale);
            } else if (formatStyle == null) {
                dateTimeInstance = DateFormat.getTimeInstance(formatStyle2.ordinal(), locale);
            } else {
                dateTimeInstance = DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), locale);
            }
            if (dateTimeInstance instanceof SimpleDateFormat) {
                String pattern = ((SimpleDateFormat) dateTimeInstance).toPattern();
                if (pattern == null) {
                    pattern = null;
                } else {
                    int i = 0;
                    if (pattern.indexOf(66) != -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (pattern.indexOf(98) != -1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z || z2) {
                        StringBuilder sb3 = new StringBuilder(pattern.length());
                        char c2 = ' ';
                        while (i < pattern.length()) {
                            char charAt = pattern.charAt(i);
                            if (charAt != ' ') {
                                if (charAt != 'B' && charAt != 'b') {
                                    sb3.append(charAt);
                                }
                            } else if (i == 0 || (c2 != 'B' && c2 != 'b')) {
                                sb3.append(charAt);
                            }
                            i++;
                            c2 = charAt;
                        }
                        int length = sb3.length() - 1;
                        if (length >= 0 && sb3.charAt(length) == ' ') {
                            sb3.deleteCharAt(length);
                        }
                        pattern = sb3.toString();
                    }
                }
                DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
                dateTimeFormatterBuilder.g(pattern);
                DateTimeFormatter o = dateTimeFormatterBuilder.o(locale, d0.SMART, null);
                DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) ((ConcurrentHashMap) c).putIfAbsent(sb2, o);
                if (dateTimeFormatter2 != null) {
                    return dateTimeFormatter2;
                }
                return o;
            }
            throw new UnsupportedOperationException("Can't determine pattern from " + dateTimeInstance);
        }
        return dateTimeFormatter;
    }

    public final String toString() {
        Object obj = "";
        FormatStyle formatStyle = this.a;
        if (formatStyle == null) {
            formatStyle = "";
        }
        Object obj2 = this.b;
        if (obj2 != null) {
            obj = obj2;
        }
        return "Localized(" + formatStyle + "," + obj + ")";
    }

    @Override // j$.time.format.e
    public final boolean v(x xVar, StringBuilder sb) {
        a(xVar.b.b, j$.time.chrono.j.q(xVar.a)).b().v(xVar, sb);
        return true;
    }
}
