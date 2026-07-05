package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ni1  reason: default package */
/* loaded from: classes.dex */
public final class ni1 {
    public static final ni1 c = new ni1();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, mi1 mi1Var, jn6 jn6Var, Class cls) {
        jn6 jn6Var2 = (jn6) hashMap.get(mi1Var);
        if (jn6Var2 != null && jn6Var != jn6Var2) {
            String name = mi1Var.b.getName();
            String name2 = cls.getName();
            vs.m(nk2.v(nk2.y("Method ", name, " in ", name2, " already declared with different @OnLifecycleEvent value: previous value "), String.valueOf(jn6Var2), ", new value ", String.valueOf(jn6Var)));
        } else if (jn6Var2 == null) {
            hashMap.put(mi1Var, jn6Var);
        }
    }

    public final li1 a(Class cls, Method[] methodArr) {
        Class<?>[] interfaces;
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            li1 li1Var = (li1) hashMap2.get(superclass);
            if (li1Var == null) {
                li1Var = a(superclass, null);
            }
            hashMap.putAll(li1Var.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            li1 li1Var2 = (li1) hashMap2.get(cls2);
            if (li1Var2 == null) {
                li1Var2 = a(cls2, null);
            }
            for (Map.Entry entry : li1Var2.b.entrySet()) {
                b(hashMap, (mi1) entry.getKey(), (jn6) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            zb8 zb8Var = (zb8) method.getAnnotation(zb8.class);
            if (zb8Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (un6.class.isAssignableFrom(parameterTypes[0])) {
                        i = 1;
                    } else {
                        vs.m("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                } else {
                    i = 0;
                }
                jn6 value = zb8Var.value();
                if (parameterTypes.length > 1) {
                    if (jn6.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == jn6.ON_ANY) {
                            i = 2;
                        } else {
                            vs.m("Second arg is supported only for ON_ANY value");
                            return null;
                        }
                    } else {
                        vs.m("invalid parameter type. second arg must be an event");
                        return null;
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new mi1(i, method), value, cls);
                    z = true;
                } else {
                    vs.m("cannot have more than 2 params");
                    return null;
                }
            }
        }
        li1 li1Var3 = new li1(hashMap);
        hashMap2.put(cls, li1Var3);
        this.b.put(cls, Boolean.valueOf(z));
        return li1Var3;
    }
}
