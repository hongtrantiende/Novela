package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vy3  reason: default package */
/* loaded from: classes3.dex */
public final class vy3 extends uy3 implements c03 {
    public final Executor c;

    public vy3(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.c = executor;
        Method method2 = ry1.a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = ry1.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.f82
    public final void C(d82 d82Var, Runnable runnable) {
        try {
            this.c.execute(runnable);
        } catch (RejectedExecutionException e) {
            k27.m(d82Var, nye.b("The task was rejected", e));
            sw2 sw2Var = ab3.a;
            ru2.c.C(d82Var, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.c;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof vy3) && ((vy3) obj).c == this.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // defpackage.c03
    public final kb3 o(long j, Runnable runnable, d82 d82Var) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                k27.m(d82Var, nye.b("The task was rejected", e));
            }
        }
        if (scheduledFuture != null) {
            return new jb3(scheduledFuture);
        }
        return rt2.H.o(j, runnable, d82Var);
    }

    @Override // defpackage.c03
    public final void q(long j, f61 f61Var) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            bv4 bv4Var = new bv4(7, this, f61Var);
            d82 d82Var = f61Var.e;
            try {
                scheduledFuture = scheduledExecutorService.schedule(bv4Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                k27.m(d82Var, nye.b("The task was rejected", e));
            }
        }
        if (scheduledFuture != null) {
            f61Var.x(new z51(scheduledFuture, 0));
        } else {
            rt2.H.q(j, f61Var);
        }
    }

    @Override // defpackage.f82
    public final String toString() {
        return this.c.toString();
    }
}
