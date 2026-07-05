package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.Headers;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h98  reason: default package */
/* loaded from: classes3.dex */
public final class h98 implements n45 {
    public final /* synthetic */ Headers c;

    public h98(Headers headers) {
        this.c = headers;
    }

    @Override // defpackage.g4b
    public final Set a() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeMap treeMap = new TreeMap(comparator);
        Headers headers = this.c;
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String b = headers.b(i);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = b.toLowerCase(locale);
            lowerCase.getClass();
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(headers.d(i));
        }
        return treeMap.entrySet();
    }

    @Override // defpackage.g4b
    public final boolean d() {
        return true;
    }

    @Override // defpackage.g4b
    public final List e(String str) {
        str.getClass();
        List e = this.c.e(str);
        if (!e.isEmpty()) {
            return e;
        }
        return null;
    }

    @Override // defpackage.g4b
    public final Set names() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeSet treeSet = new TreeSet(comparator);
        Headers headers = this.c;
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            treeSet.add(headers.b(i));
        }
        Set unmodifiableSet = Collections.unmodifiableSet(treeSet);
        unmodifiableSet.getClass();
        return unmodifiableSet;
    }
}
