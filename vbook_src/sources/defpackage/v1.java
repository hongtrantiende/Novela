package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v1  reason: default package */
/* loaded from: classes.dex */
public final class v1 extends lbe {
    public static final Unsafe d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction<Object>) new Object());
            }
            try {
                f = unsafe.objectFieldOffset(x1.class.getDeclaredField("c"));
                e = unsafe.objectFieldOffset(x1.class.getDeclaredField("b"));
                g = unsafe.objectFieldOffset(x1.class.getDeclaredField("a"));
                h = unsafe.objectFieldOffset(w1.class.getDeclaredField("a"));
                i = unsafe.objectFieldOffset(w1.class.getDeclaredField("b"));
                d = unsafe;
            } catch (NoSuchFieldException e2) {
                fb4.l(e2);
            }
        } catch (PrivilegedActionException e3) {
            cp8.p("Could not initialize intrinsics", e3.getCause());
        }
    }

    @Override // defpackage.lbe
    public final boolean b(x1 x1Var, l1 l1Var, l1 l1Var2) {
        return s1.a(d, x1Var, e, l1Var, l1Var2);
    }

    @Override // defpackage.lbe
    public final boolean c(x1 x1Var, Object obj, Object obj2) {
        return t1.a(d, x1Var, g, obj, obj2);
    }

    @Override // defpackage.lbe
    public final boolean d(x1 x1Var, w1 w1Var, w1 w1Var2) {
        return r1.a(d, x1Var, f, w1Var, w1Var2);
    }

    @Override // defpackage.lbe
    public final l1 l(x1 x1Var) {
        l1 l1Var;
        l1 l1Var2 = l1.d;
        do {
            l1Var = x1Var.b;
            if (l1Var2 == l1Var) {
                break;
            }
        } while (!b(x1Var, l1Var, l1Var2));
        return l1Var;
    }

    @Override // defpackage.lbe
    public final w1 m(x1 x1Var) {
        w1 w1Var;
        w1 w1Var2 = w1.c;
        do {
            w1Var = x1Var.c;
            if (w1Var2 == w1Var) {
                break;
            }
        } while (!d(x1Var, w1Var, w1Var2));
        return w1Var;
    }

    @Override // defpackage.lbe
    public final void r(w1 w1Var, w1 w1Var2) {
        d.putObject(w1Var, i, w1Var2);
    }

    @Override // defpackage.lbe
    public final void s(w1 w1Var, Thread thread) {
        d.putObject(w1Var, h, thread);
    }
}
