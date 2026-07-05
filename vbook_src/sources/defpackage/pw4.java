package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pw4  reason: default package */
/* loaded from: classes.dex */
public abstract class pw4 {
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public int a = 0;
    public int b = -1;
    public awc c = awc.e;

    public static pw4 b(Class cls) {
        ConcurrentHashMap concurrentHashMap = d;
        pw4 pw4Var = (pw4) concurrentHashMap.get(cls);
        if (pw4Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                pw4Var = (pw4) concurrentHashMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (pw4Var == null) {
            pw4 pw4Var2 = (pw4) ((pw4) fxc.b(cls)).a(6);
            if (pw4Var2 != null) {
                concurrentHashMap.put(cls, pw4Var2);
                return pw4Var2;
            }
            vm1.d();
            return null;
        }
        return pw4Var;
    }

    public static Object c(Method method, pw4 pw4Var, Object... objArr) {
        try {
            return method.invoke(pw4Var, objArr);
        } catch (IllegalAccessException e) {
            cp8.p("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (!(cause instanceof Error)) {
                    cp8.p("Unexpected exception thrown by generated accessor method.", cause);
                    return null;
                }
                throw ((Error) cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static final boolean d(pw4 pw4Var, boolean z) {
        byte byteValue = ((Byte) pw4Var.a(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        y89 y89Var = y89.c;
        y89Var.getClass();
        boolean c = y89Var.a(pw4Var.getClass()).c(pw4Var);
        if (z) {
            pw4Var.a(2);
        }
        return c;
    }

    public abstract Object a(int i);

    public final boolean e() {
        if ((this.b & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y89 y89Var = y89.c;
        y89Var.getClass();
        return y89Var.a(getClass()).f(this, (pw4) obj);
    }

    public final pw4 f() {
        return (pw4) a(4);
    }

    public final int hashCode() {
        if (e()) {
            y89 y89Var = y89.c;
            y89Var.getClass();
            return y89Var.a(getClass()).g(this);
        }
        if (this.a == 0) {
            y89 y89Var2 = y89.c;
            y89Var2.getClass();
            this.a = y89Var2.a(getClass()).g(this);
        }
        return this.a;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = bb7.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        bb7.c(this, sb, 0);
        return sb.toString();
    }
}
