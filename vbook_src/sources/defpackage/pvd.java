package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pvd  reason: default package */
/* loaded from: classes.dex */
public final class pvd {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ BasePendingResult b;
    public final /* synthetic */ Object c;

    public pvd(rwa rwaVar, BasePendingResult basePendingResult) {
        this.b = basePendingResult;
        Objects.requireNonNull(rwaVar);
        this.c = rwaVar;
    }

    public final void a(Status status) {
        is9 is9Var;
        switch (this.a) {
            case 0:
                if (status.c()) {
                    BasePendingResult basePendingResult = this.b;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    am8.u("Result has already been consumed.", !basePendingResult.g);
                    try {
                        if (!basePendingResult.b.await(0L, timeUnit)) {
                            basePendingResult.c(Status.D);
                        }
                    } catch (InterruptedException unused) {
                        basePendingResult.c(Status.f);
                    }
                    am8.u("Result is not ready.", basePendingResult.d());
                    synchronized (basePendingResult.a) {
                        am8.u("Result has already been consumed.", !basePendingResult.g);
                        am8.u("Result is not ready.", basePendingResult.d());
                        is9Var = basePendingResult.e;
                        basePendingResult.e = null;
                        basePendingResult.g = true;
                    }
                    if (basePendingResult.d.getAndSet(null) == null) {
                        am8.s(is9Var);
                        ((TaskCompletionSource) this.c).setResult(null);
                        return;
                    }
                    vm1.h();
                    return;
                }
                ((TaskCompletionSource) this.c).setException(gue.p(status));
                return;
            default:
                ((Map) ((rwa) this.c).b).remove(this.b);
                return;
        }
    }

    public pvd(BasePendingResult basePendingResult, TaskCompletionSource taskCompletionSource, mp8 mp8Var) {
        this.b = basePendingResult;
        this.c = taskCompletionSource;
    }
}
