package defpackage;

import java.lang.reflect.InvocationTargetException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bs4  reason: default package */
/* loaded from: classes.dex */
public final class bs4 {
    public static final jla b = new jla(0);
    public final /* synthetic */ hs4 a;

    public bs4(hs4 hs4Var) {
        this.a = hs4Var;
    }

    public static Class b(ClassLoader classLoader, String str) {
        jla jlaVar = b;
        jla jlaVar2 = (jla) jlaVar.get(classLoader);
        if (jlaVar2 == null) {
            jlaVar2 = new jla(0);
            jlaVar.put(classLoader, jlaVar2);
        }
        Class cls = (Class) jlaVar2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            jlaVar2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new gt1(4, hl5.n("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new gt1(4, hl5.n("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final rr4 a(String str) {
        try {
            return (rr4) c(this.a.w.d.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new gt1(4, hl5.n("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new gt1(4, hl5.n("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new gt1(4, hl5.n("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new gt1(4, hl5.n("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
