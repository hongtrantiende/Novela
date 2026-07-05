package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rt2  reason: default package */
/* loaded from: classes3.dex */
public final class rt2 extends qx3 implements Runnable {
    public static final rt2 H;
    public static final long I;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX WARN: Type inference failed for: r0v0, types: [f82, rt2, lx3] */
    static {
        Long l;
        ?? f82Var = new f82();
        H = f82Var;
        f82Var.V0(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        I = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.qx3
    public final void n1(Runnable runnable) {
        if (debugStatus != 4) {
            super.n1(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.c03
    public final kb3 o(long j, Runnable runnable, d82 d82Var) {
        long j2 = 0;
        if (j > 0) {
            if (j >= 9223372036854L) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = 1000000 * j;
            }
        }
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            nx3 nx3Var = new nx3(j2 + nanoTime, runnable);
            w1(nanoTime, nx3Var);
            return nx3Var;
        }
        return w38.a;
    }

    @Override // defpackage.qx3
    public final Thread r1() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(H.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
            return thread;
        }
        return thread2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        boolean s1;
        c7c.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i != 2 && i != 3) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if (!s1) {
                        return;
                    }
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long g1 = g1();
                    if (g1 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = I + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            z1();
                            if (!s1()) {
                                r1();
                                return;
                            }
                            return;
                        } else if (g1 > j2) {
                            g1 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (g1 > 0) {
                        int i2 = debugStatus;
                        if (i2 != 2 && i2 != 3) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            _thread = null;
                            z1();
                            if (!s1()) {
                                r1();
                                return;
                            }
                            return;
                        }
                        LockSupport.parkNanos(this, g1);
                    }
                }
            }
        } finally {
            _thread = null;
            z1();
            if (!s1()) {
                r1();
            }
        }
    }

    @Override // defpackage.qx3, defpackage.lx3
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.qx3
    public final void t1(long j, ox3 ox3Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.f82
    public final String toString() {
        return "DefaultExecutor";
    }

    public final synchronized void z1() {
        boolean z;
        int i = debugStatus;
        if (i != 2 && i != 3) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return;
        }
        debugStatus = 3;
        v1();
        notifyAll();
    }
}
