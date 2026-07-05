package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v46  reason: default package */
/* loaded from: classes3.dex */
public abstract class v46 {
    public static final s46 a = wq9.d(new oi5(25));

    public static final t36 a(Collection collection) {
        collection.getClass();
        Collection<Object> collection2 = collection;
        ArrayList arrayList = new ArrayList(tl1.s(collection2, 10));
        for (Object obj : collection2) {
            arrayList.add(b(obj));
        }
        return new t36(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [ks3] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    public static final k46 b(Object obj) {
        if (obj == null) {
            return a56.INSTANCE;
        }
        if (obj instanceof Map) {
            return c((Map) obj);
        }
        if (obj instanceof Collection) {
            return a((Collection) obj);
        }
        if (obj instanceof byte[]) {
            return a(b00.y0((byte[]) obj));
        }
        boolean z = obj instanceof char[];
        ?? r1 = ks3.a;
        int i = 0;
        if (z) {
            char[] cArr = (char[]) obj;
            int length = cArr.length;
            if (length != 0) {
                if (length != 1) {
                    r1 = new ArrayList(cArr.length);
                    int length2 = cArr.length;
                    while (i < length2) {
                        r1.add(Character.valueOf(cArr[i]));
                        i++;
                    }
                } else {
                    r1 = tl1.A(Character.valueOf(cArr[0]));
                }
            }
            return a(r1);
        } else if (obj instanceof short[]) {
            return a(b00.E0((short[]) obj));
        } else {
            if (obj instanceof int[]) {
                return a(b00.B0((int[]) obj));
            }
            if (obj instanceof long[]) {
                return a(b00.C0((long[]) obj));
            }
            if (obj instanceof float[]) {
                return a(b00.A0((float[]) obj));
            }
            if (obj instanceof double[]) {
                return a(b00.z0((double[]) obj));
            }
            if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length3 = zArr.length;
                if (length3 != 0) {
                    if (length3 != 1) {
                        r1 = new ArrayList(zArr.length);
                        int length4 = zArr.length;
                        while (i < length4) {
                            r1.add(Boolean.valueOf(zArr[i]));
                            i++;
                        }
                    } else {
                        r1 = tl1.A(Boolean.valueOf(zArr[0]));
                    }
                }
                return a(r1);
            } else if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                ArrayList arrayList = new ArrayList(objArr.length);
                int length5 = objArr.length;
                while (i < length5) {
                    arrayList.add(b(objArr[i]));
                    i++;
                }
                return new t36(arrayList);
            } else if (obj instanceof Boolean) {
                hv5 hv5Var = l46.a;
                return new w46((Boolean) obj, false);
            } else if (obj instanceof Number) {
                hv5 hv5Var2 = l46.a;
                return new w46((Number) obj, false);
            } else if (obj instanceof String) {
                return l46.a((String) obj);
            } else {
                if (obj instanceof Enum) {
                    return l46.a(((Enum) obj).toString());
                }
                if (obj instanceof k46) {
                    return (k46) obj;
                }
                vs.k(rs8.i(obj, "Can't serialize unknown type: "));
                return null;
            }
        }
    }

    public static final d56 c(Map map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            key.getClass();
            String str = (String) key;
            linkedHashMap.put(key, b(value));
        }
        return new d56(linkedHashMap);
    }
}
