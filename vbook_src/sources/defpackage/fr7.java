package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fr7  reason: default package */
/* loaded from: classes.dex */
public final class fr7 extends jbe implements ScheduledFuture, ListenableFuture, Future {
    public final x1 C;
    public final ScheduledFuture D;

    public fr7(x1 x1Var, ScheduledFuture scheduledFuture) {
        super(7);
        this.C = x1Var;
        this.D = scheduledFuture;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable, Executor executor) {
        this.C.a(runnable, executor);
    }

    public final boolean a0(boolean z) {
        return this.C.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean a0 = a0(z);
        if (a0) {
            this.D.cancel(z);
        }
        return a0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.D.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.C.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.D.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.C.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.C.isDone();
    }

    @Override // defpackage.jbe
    public final Object m() {
        return this.C;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.C.get(j, timeUnit);
    }
}
