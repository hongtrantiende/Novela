package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gr4  reason: default package */
/* loaded from: classes.dex */
public final class gr4 extends zl4 {
    public final ListenableFuture E;

    public gr4(ListenableFuture listenableFuture) {
        this.E = listenableFuture;
    }

    @Override // defpackage.x1, com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable, Executor executor) {
        this.E.a(runnable, executor);
    }

    @Override // defpackage.x1, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.E.cancel(z);
    }

    @Override // defpackage.x1, java.util.concurrent.Future
    public final Object get() {
        return this.E.get();
    }

    @Override // defpackage.x1, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.E.isCancelled();
    }

    @Override // defpackage.x1, java.util.concurrent.Future
    public final boolean isDone() {
        return this.E.isDone();
    }

    @Override // defpackage.x1
    public final String toString() {
        return this.E.toString();
    }

    @Override // defpackage.x1, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.E.get(j, timeUnit);
    }
}
