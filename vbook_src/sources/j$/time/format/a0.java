package j$.time.format;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public class a0 {
    public static final ConcurrentMap a = new ConcurrentHashMap(16, 0.75f, 2);
    public static final y b = new Object();
    public static final a0 c = new Object();

    public static Object a(TemporalField temporalField, Locale locale) {
        Object obj;
        boolean z;
        String substring;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(temporalField, locale);
        Object obj2 = ((ConcurrentHashMap) a).get(simpleImmutableEntry);
        if (obj2 == null) {
            HashMap hashMap = new HashMap();
            if (temporalField == ChronoField.ERA) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                String[] eras = dateFormatSymbols.getEras();
                for (int i = 0; i < eras.length; i++) {
                    if (!eras[i].isEmpty()) {
                        long j = i;
                        hashMap2.put(Long.valueOf(j), eras[i]);
                        Long valueOf = Long.valueOf(j);
                        String str = eras[i];
                        hashMap3.put(valueOf, str.substring(0, Character.charCount(str.codePointAt(0))));
                    }
                }
                if (!hashMap2.isEmpty()) {
                    hashMap.put(e0.FULL, hashMap2);
                    hashMap.put(e0.SHORT, hashMap2);
                    hashMap.put(e0.NARROW, hashMap3);
                }
                obj = new z(hashMap);
            } else if (temporalField == ChronoField.MONTH_OF_YEAR) {
                int length = DateFormatSymbols.getInstance(locale).getMonths().length;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (long j2 = 1; j2 <= length; j2++) {
                    String b2 = j$.time.b.b(j2, "LLLL", locale);
                    linkedHashMap.put(Long.valueOf(j2), b2);
                    linkedHashMap2.put(Long.valueOf(j2), b2.substring(0, Character.charCount(b2.codePointAt(0))));
                    linkedHashMap3.put(Long.valueOf(j2), j$.time.b.b(j2, "LLL", locale));
                }
                if (length > 0) {
                    hashMap.put(e0.FULL_STANDALONE, linkedHashMap);
                    hashMap.put(e0.NARROW_STANDALONE, linkedHashMap2);
                    hashMap.put(e0.SHORT_STANDALONE, linkedHashMap3);
                    hashMap.put(e0.FULL, linkedHashMap);
                    hashMap.put(e0.NARROW, linkedHashMap2);
                    hashMap.put(e0.SHORT, linkedHashMap3);
                }
                obj = new z(hashMap);
            } else if (temporalField == ChronoField.DAY_OF_WEEK) {
                int length2 = DateFormatSymbols.getInstance(locale).getWeekdays().length;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                if (locale != Locale.SIMPLIFIED_CHINESE && locale != Locale.TRADITIONAL_CHINESE) {
                    z = false;
                } else {
                    z = true;
                }
                for (long j3 = 1; j3 <= length2; j3++) {
                    String a2 = j$.time.b.a(j3, "cccc", locale);
                    linkedHashMap4.put(Long.valueOf(j3), a2);
                    Long valueOf2 = Long.valueOf(j3);
                    if (z) {
                        substring = new StringBuilder().appendCodePoint(a2.codePointBefore(a2.length())).toString();
                    } else {
                        substring = a2.substring(0, Character.charCount(a2.codePointAt(0)));
                    }
                    linkedHashMap5.put(valueOf2, substring);
                    linkedHashMap6.put(Long.valueOf(j3), j$.time.b.a(j3, "ccc", locale));
                }
                if (length2 > 0) {
                    hashMap.put(e0.FULL_STANDALONE, linkedHashMap4);
                    hashMap.put(e0.NARROW_STANDALONE, linkedHashMap5);
                    hashMap.put(e0.SHORT_STANDALONE, linkedHashMap6);
                    hashMap.put(e0.FULL, linkedHashMap4);
                    hashMap.put(e0.NARROW, linkedHashMap5);
                    hashMap.put(e0.SHORT, linkedHashMap6);
                }
                obj = new z(hashMap);
            } else if (temporalField == ChronoField.AMPM_OF_DAY) {
                DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap4 = new HashMap();
                HashMap hashMap5 = new HashMap();
                String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
                for (int i2 = 0; i2 < amPmStrings.length; i2++) {
                    if (!amPmStrings[i2].isEmpty()) {
                        long j4 = i2;
                        hashMap4.put(Long.valueOf(j4), amPmStrings[i2]);
                        Long valueOf3 = Long.valueOf(j4);
                        String str2 = amPmStrings[i2];
                        hashMap5.put(valueOf3, str2.substring(0, Character.charCount(str2.codePointAt(0))));
                    }
                }
                if (!hashMap4.isEmpty()) {
                    hashMap.put(e0.FULL, hashMap4);
                    hashMap.put(e0.SHORT, hashMap4);
                    hashMap.put(e0.NARROW, hashMap5);
                }
                obj = new z(hashMap);
            } else {
                obj = "";
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) a;
            concurrentHashMap.putIfAbsent(simpleImmutableEntry, obj);
            return concurrentHashMap.get(simpleImmutableEntry);
        }
        return obj2;
    }

    public String b(j$.time.chrono.j jVar, TemporalField temporalField, long j, e0 e0Var, Locale locale) {
        if (jVar != j$.time.chrono.q.c && (temporalField instanceof ChronoField)) {
            return null;
        }
        return c(temporalField, j, e0Var, locale);
    }

    public String c(TemporalField temporalField, long j, e0 e0Var, Locale locale) {
        Object a2 = a(temporalField, locale);
        if (a2 instanceof z) {
            return ((z) a2).a(j, e0Var);
        }
        return null;
    }

    public Iterator d(j$.time.chrono.j jVar, TemporalField temporalField, e0 e0Var, Locale locale) {
        if (jVar != j$.time.chrono.q.c && (temporalField instanceof ChronoField)) {
            return null;
        }
        return e(temporalField, e0Var, locale);
    }

    public Iterator e(TemporalField temporalField, e0 e0Var, Locale locale) {
        List list;
        Object a2 = a(temporalField, locale);
        if (!(a2 instanceof z) || (list = (List) ((HashMap) ((z) a2).b).get(e0Var)) == null) {
            return null;
        }
        return list.iterator();
    }
}
