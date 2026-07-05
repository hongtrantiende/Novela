package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o06  reason: default package */
/* loaded from: classes.dex */
public abstract class o06 extends AtomicReference implements Runnable {
    public static final t51 a = new t51(2);
    public static final t51 b = new t51(2);

    public abstract void a(Throwable th);

    public abstract void b(Object obj);

    public final void c() {
        t51 t51Var = b;
        t51 t51Var2 = a;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            n06 n06Var = new n06(this);
            n06.a(n06Var, Thread.currentThread());
            if (compareAndSet(runnable, n06Var)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(t51Var2)) == t51Var) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean d();

    public abstract Object e();

    public abstract String f();

    public final void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        n06 n06Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof n06;
            t51 t51Var = b;
            if (!z2 && runnable != t51Var) {
                break;
            }
            if (z2) {
                n06Var = (n06) runnable;
            }
            i++;
            if (i > 1000) {
                if (runnable == t51Var || compareAndSet(runnable, t51Var)) {
                    if (!Thread.interrupted() && !z) {
                        z = false;
                    } else {
                        z = true;
                    }
                    LockSupport.park(n06Var);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean d = d();
            t51 t51Var = a;
            if (!d) {
                try {
                    obj = e();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, t51Var)) {
                            g(currentThread);
                        }
                        if (!d) {
                            a(th);
                            return;
                        }
                        return;
                    } finally {
                        if (!compareAndSet(currentThread, t51Var)) {
                            g(currentThread);
                        }
                        if (!d) {
                            b(null);
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == a) {
            str = "running=[DONE]";
        } else if (runnable instanceof n06) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + f();
    }
}
