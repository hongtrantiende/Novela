package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hr7  reason: default package */
/* loaded from: classes.dex */
public final class hr7 extends er7 implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public hr7(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        qoc qocVar = new qoc(Executors.callable(runnable, null));
        return new fr7(qocVar, this.b.schedule(qocVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        gr7 gr7Var = new gr7(runnable);
        return new fr7(gr7Var, this.b.scheduleAtFixedRate(gr7Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        gr7 gr7Var = new gr7(runnable);
        return new fr7(gr7Var, this.b.scheduleWithFixedDelay(gr7Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        qoc qocVar = new qoc(callable);
        return new fr7(qocVar, this.b.schedule(qocVar, j, timeUnit));
    }
}
