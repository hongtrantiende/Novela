package j$.time.format;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalQuery;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public class t implements e {
    public static volatile Map.Entry c;
    public static volatile Map.Entry d;
    public final TemporalQuery a;
    public final String b;

    public t(TemporalQuery temporalQuery, String str) {
        this.a = temporalQuery;
        this.b = str;
    }

    public static int b(v vVar, CharSequence charSequence, int i, int i2, k kVar) {
        String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
        if (i2 >= charSequence.length()) {
            vVar.f(ZoneId.of(upperCase));
            return i2;
        } else if (charSequence.charAt(i2) != '0' && !vVar.a(charSequence.charAt(i2), 'Z')) {
            v vVar2 = new v(vVar.a);
            vVar2.b = vVar.b;
            vVar2.c = vVar.c;
            int A = kVar.A(vVar2, charSequence, i2);
            try {
                if (A < 0) {
                    if (kVar == k.e) {
                        return ~i;
                    }
                    vVar.f(ZoneId.of(upperCase));
                    return i2;
                }
                vVar.f(ZoneId.F(upperCase, ZoneOffset.ofTotalSeconds((int) vVar2.e(ChronoField.OFFSET_SECONDS).longValue())));
                return A;
            } catch (DateTimeException unused) {
                return ~i;
            }
        } else {
            vVar.f(ZoneId.of(upperCase));
            return i2;
        }
    }

    @Override // j$.time.format.e
    public final int A(v vVar, CharSequence charSequence, int i) {
        int i2;
        int length = charSequence.length();
        if (i <= length) {
            if (i == length) {
                return ~i;
            }
            char charAt = charSequence.charAt(i);
            if (charAt != '+' && charAt != '-') {
                int i3 = i + 2;
                if (length >= i3) {
                    char charAt2 = charSequence.charAt(i + 1);
                    if (vVar.a(charAt, 'U') && vVar.a(charAt2, 'T')) {
                        int i4 = i + 3;
                        if (length >= i4 && vVar.a(charSequence.charAt(i3), 'C')) {
                            return b(vVar, charSequence, i, i4, k.f);
                        }
                        return b(vVar, charSequence, i, i3, k.f);
                    } else if (vVar.a(charAt, 'G') && length >= (i2 = i + 3) && vVar.a(charAt2, 'M') && vVar.a(charSequence.charAt(i3), 'T')) {
                        int i5 = i + 4;
                        if (length >= i5 && vVar.a(charSequence.charAt(i2), '0')) {
                            vVar.f(ZoneId.of("GMT0"));
                            return i5;
                        }
                        return b(vVar, charSequence, i, i2, k.f);
                    }
                }
                n a = a(vVar);
                ParsePosition parsePosition = new ParsePosition(i);
                String c2 = a.c(charSequence, parsePosition);
                if (c2 == null) {
                    if (vVar.a(charAt, 'Z')) {
                        vVar.f(ZoneOffset.UTC);
                        return i + 1;
                    }
                    return ~i;
                }
                vVar.f(ZoneId.of(c2));
                return parsePosition.getIndex();
            }
            return b(vVar, charSequence, i, i, k.e);
        }
        throw new IndexOutOfBoundsException();
    }

    public n a(v vVar) {
        Map.Entry entry;
        n nVar;
        Set<String> set = j$.time.zone.h.d;
        int size = set.size();
        if (vVar.b) {
            entry = c;
        } else {
            entry = d;
        }
        if (entry == null || ((Integer) entry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    if (vVar.b) {
                        entry = c;
                    } else {
                        entry = d;
                    }
                    if (entry == null || ((Integer) entry.getKey()).intValue() != size) {
                        Integer valueOf = Integer.valueOf(size);
                        if (vVar.b) {
                            nVar = new n("", null, null);
                        } else {
                            nVar = new n("", null, null);
                        }
                        for (String str : set) {
                            nVar.a(str, str);
                        }
                        entry = new AbstractMap.SimpleImmutableEntry(valueOf, nVar);
                        if (vVar.b) {
                            c = entry;
                        } else {
                            d = entry;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (n) entry.getValue();
    }

    public final String toString() {
        return this.b;
    }

    @Override // j$.time.format.e
    public boolean v(x xVar, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) xVar.b(this.a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.p());
        return true;
    }
}
