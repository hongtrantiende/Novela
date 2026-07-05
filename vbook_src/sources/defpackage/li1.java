package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: li1  reason: default package */
/* loaded from: classes.dex */
public final class li1 {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public li1(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            jn6 jn6Var = (jn6) entry.getValue();
            List list = (List) this.a.get(jn6Var);
            if (list == null) {
                list = new ArrayList();
                this.a.put(jn6Var, list);
            }
            list.add((mi1) entry.getKey());
        }
    }

    public static void a(List list, un6 un6Var, jn6 jn6Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                mi1 mi1Var = (mi1) list.get(size);
                Method method = mi1Var.b;
                try {
                    int i = mi1Var.a;
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                method.invoke(obj, un6Var, jn6Var);
                            }
                        } else {
                            method.invoke(obj, un6Var);
                        }
                    } else {
                        method.invoke(obj, null);
                    }
                } catch (IllegalAccessException e) {
                    fb4.l(e);
                    return;
                } catch (InvocationTargetException e2) {
                    cp8.p("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
