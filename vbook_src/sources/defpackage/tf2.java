package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tf2  reason: default package */
/* loaded from: classes.dex */
public final class tf2 {
    public static final tf2 b;
    public final HashMap a;

    static {
        tf2 tf2Var = new tf2(new LinkedHashMap());
        rae.l(tf2Var);
        b = tf2Var;
    }

    public tf2(tf2 tf2Var) {
        tf2Var.getClass();
        this.a = new HashMap(tf2Var.a);
    }

    public final boolean a(String str) {
        Object obj = this.a.get(str);
        if (obj != null && String.class.isAssignableFrom(obj.getClass())) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj != null && tf2.class.equals(obj.getClass())) {
                HashMap hashMap = ((tf2) obj).a;
                HashMap hashMap2 = this.a;
                Set<String> keySet = hashMap2.keySet();
                if (c16.i(keySet, hashMap.keySet())) {
                    for (String str : keySet) {
                        Object obj2 = hashMap2.get(str);
                        Object obj3 = hashMap.get(str);
                        if (obj2 != null && obj3 != null) {
                            if (obj2 instanceof Object[]) {
                                Object[] objArr = (Object[]) obj2;
                                if (obj3 instanceof Object[]) {
                                    z = b00.T(objArr, (Object[]) obj3);
                                    continue;
                                }
                            }
                            z = obj2.equals(obj3);
                            continue;
                        } else if (obj2 == obj3) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (!z) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Object[]) {
                hashCode = Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value);
            } else {
                hashCode = entry.hashCode();
            }
            i += hashCode;
        }
        return i * 31;
    }

    public final String toString() {
        return s21.q(new StringBuilder("Data {"), sl1.i0(this.a.entrySet(), null, null, null, new ln1(17), 31), "}");
    }

    public tf2(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        this.a = new HashMap(linkedHashMap);
    }
}
