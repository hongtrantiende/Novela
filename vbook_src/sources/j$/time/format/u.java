package j$.time.format;

import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class u extends t {
    public static final Map i = new ConcurrentHashMap();
    public final e0 e;
    public final boolean f;
    public final Map g;
    public final Map h;

    public u(e0 e0Var, boolean z) {
        super(j$.time.temporal.p.e, "ZoneText(" + e0Var + ")");
        this.g = new HashMap();
        this.h = new HashMap();
        Objects.requireNonNull(e0Var, "textStyle");
        this.e = e0Var;
        this.f = z;
    }

    @Override // j$.time.format.t
    public final n a(v vVar) {
        Map map;
        n nVar;
        String[][] zoneStrings;
        int i2;
        n nVar2;
        if (this.e == e0.NARROW) {
            return super.a(vVar);
        }
        Locale locale = vVar.a.b;
        boolean z = vVar.b;
        Set set = j$.time.zone.h.d;
        int size = set.size();
        if (z) {
            map = this.g;
        } else {
            map = this.h;
        }
        Map.Entry entry = (Map.Entry) map.get(locale);
        if (entry != null && ((Integer) entry.getKey()).intValue() == size && (nVar2 = (n) ((SoftReference) entry.getValue()).get()) != null) {
            return nVar2;
        }
        if (vVar.b) {
            nVar = new n("", null, null);
        } else {
            nVar = new n("", null, null);
        }
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (set.contains(str)) {
                nVar.a(str, str);
                HashMap hashMap = (HashMap) f0.d;
                String str2 = (String) hashMap.get(str);
                if (str2 == null) {
                    HashMap hashMap2 = (HashMap) f0.g;
                    if (hashMap2.containsKey(str)) {
                        str = (String) hashMap2.get(str);
                        str2 = (String) hashMap.get(str);
                    }
                }
                if (str2 != null) {
                    Map map2 = (Map) ((HashMap) f0.f).get(str2);
                    if (map2 != null && map2.containsKey(locale.getCountry())) {
                        str = (String) map2.get(locale.getCountry());
                    } else {
                        str = (String) ((HashMap) f0.e).get(str2);
                    }
                }
                HashMap hashMap3 = (HashMap) f0.g;
                if (hashMap3.containsKey(str)) {
                    str = (String) hashMap3.get(str);
                }
                if (this.e == e0.FULL) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                while (i2 < strArr.length) {
                    nVar.a(strArr[i2], str);
                    i2 += 2;
                }
            }
        }
        map.put(locale, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(nVar)));
        return nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8  */
    @Override // j$.time.format.t, j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(j$.time.format.x r13, java.lang.StringBuilder r14) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.u.v(j$.time.format.x, java.lang.StringBuilder):boolean");
    }
}
