package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
/* renamed from: o17  reason: default package */
/* loaded from: classes3.dex */
public abstract class o17 extends p17 {
    public static Object p(Object obj, Map map) {
        map.getClass();
        if (map instanceof i17) {
            return ((i17) map).C();
        }
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            throw new NoSuchElementException("Key " + obj + " is missing in the map.");
        }
        return obj2;
    }

    public static HashMap q(yk8... yk8VarArr) {
        HashMap hashMap = new HashMap(p17.k(yk8VarArr.length));
        v(hashMap, yk8VarArr);
        return hashMap;
    }

    public static LinkedHashMap r(yk8... yk8VarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(p17.k(yk8VarArr.length));
        v(linkedHashMap, yk8VarArr);
        return linkedHashMap;
    }

    public static Map s(yk8... yk8VarArr) {
        yk8VarArr.getClass();
        if (yk8VarArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(p17.k(yk8VarArr.length));
            v(linkedHashMap, yk8VarArr);
            return linkedHashMap;
        }
        return ls3.a;
    }

    public static LinkedHashMap t(yk8... yk8VarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(p17.k(yk8VarArr.length));
        v(linkedHashMap, yk8VarArr);
        return linkedHashMap;
    }

    public static LinkedHashMap u(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final void v(HashMap hashMap, yk8[] yk8VarArr) {
        yk8VarArr.getClass();
        for (yk8 yk8Var : yk8VarArr) {
            hashMap.put(yk8Var.a, yk8Var.b);
        }
    }

    public static List w(Map map) {
        map.getClass();
        int size = map.size();
        ks3 ks3Var = ks3.a;
        if (size == 0) {
            return ks3Var;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return ks3Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return tl1.A(new yk8(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new yk8(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new yk8(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static Map x(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            int i = 0;
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(p17.k(arrayList.size()));
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj = arrayList.get(i);
                    i++;
                    yk8 yk8Var = (yk8) obj;
                    linkedHashMap.put(yk8Var.a, yk8Var.b);
                }
                return linkedHashMap;
            }
            yk8 yk8Var2 = (yk8) arrayList.get(0);
            yk8Var2.getClass();
            Map singletonMap = Collections.singletonMap(yk8Var2.a, yk8Var2.b);
            singletonMap.getClass();
            return singletonMap;
        }
        return ls3.a;
    }

    public static Map y(Map map) {
        map.getClass();
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return new LinkedHashMap(map);
            }
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            singletonMap.getClass();
            return singletonMap;
        }
        return ls3.a;
    }

    public static LinkedHashMap z(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }
}
