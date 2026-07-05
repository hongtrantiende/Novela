package defpackage;

import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ii1  reason: default package */
/* loaded from: classes.dex */
public abstract class ii1 {
    public static final /* synthetic */ int a = 0;

    static {
        new ConcurrentHashMap();
    }

    public static final Class a(ClassLoader classLoader, String str) {
        Class<?> cls;
        if (classLoader == null) {
            classLoader = null;
        }
        if (classLoader != null) {
            cls = Class.forName(str, false, classLoader);
        } else {
            cls = Class.forName(str);
        }
        if (cls != null) {
            return cls;
        }
        xk5.p(str, "JVM class not resolved: ");
        return null;
    }

    public static Class b(String str, ClassLoader classLoader, int i) {
        Object gs9Var;
        Object obj = null;
        if ((i & 1) != 0) {
            classLoader = null;
        }
        try {
            gs9Var = a(classLoader, str);
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        if (!(gs9Var instanceof gs9)) {
            obj = gs9Var;
        }
        return (Class) obj;
    }
}
