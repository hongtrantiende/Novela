package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dr7  reason: default package */
/* loaded from: classes.dex */
public final class dr7 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dr7(Executor executor, Object obj, int i) {
        this.a = i;
        this.b = executor;
        this.c = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Executor executor = this.b;
        switch (i) {
            case 0:
                try {
                    executor.execute(runnable);
                    return;
                } catch (RejectedExecutionException e) {
                    ((yl4) this.c).m(e);
                    return;
                }
            default:
                executor.execute(runnable);
                return;
        }
    }
}
