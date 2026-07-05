package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z46  reason: default package */
/* loaded from: classes3.dex */
public abstract class z46 {
    public static final j55 a = new j55(23);

    public static final int a(o9a o9aVar, r36 r36Var, String str) {
        Object obj;
        o9aVar.getClass();
        r36Var.getClass();
        str.getClass();
        d(r36Var, o9aVar);
        int d = o9aVar.d(str);
        if (d != -3 || !r36Var.a.j) {
            return d;
        }
        j23 j23Var = r36Var.c;
        u93 u93Var = new u93(29, o9aVar, r36Var);
        j23Var.getClass();
        ConcurrentHashMap concurrentHashMap = j23Var.a;
        Map map = (Map) concurrentHashMap.get(o9aVar);
        j55 j55Var = a;
        Object obj2 = null;
        if (map != null) {
            obj = map.get(j55Var);
        } else {
            obj = null;
        }
        if (obj != null) {
            obj2 = obj;
        }
        if (obj2 == null) {
            obj2 = u93Var.invoke();
            Object obj3 = concurrentHashMap.get(o9aVar);
            if (obj3 == null) {
                obj3 = new ConcurrentHashMap(2);
                concurrentHashMap.put(o9aVar, obj3);
            }
            ((Map) obj3).put(j55Var, obj2);
        }
        Integer num = (Integer) ((Map) obj2).get(str);
        if (num == null) {
            return -3;
        }
        return num.intValue();
    }

    public static final int b(o9a o9aVar, r36 r36Var, String str, String str2) {
        o9aVar.getClass();
        r36Var.getClass();
        str.getClass();
        int a2 = a(o9aVar, r36Var, str);
        if (a2 != -3) {
            return a2;
        }
        String a3 = o9aVar.a();
        throw new IllegalArgumentException(a3 + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final boolean c(r36 r36Var, o9a o9aVar) {
        o9aVar.getClass();
        r36Var.getClass();
        if (!r36Var.a.b) {
            List<Annotation> annotations = o9aVar.getAnnotations();
            if (annotations == null || !annotations.isEmpty()) {
                for (Annotation annotation : annotations) {
                    if (annotation instanceof r46) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static final void d(r36 r36Var, o9a o9aVar) {
        o9aVar.getClass();
        r36Var.getClass();
        c16.i(o9aVar.e(), a5b.f);
    }
}
