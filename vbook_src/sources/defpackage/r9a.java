package defpackage;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r9a  reason: default package */
/* loaded from: classes.dex */
public final class r9a implements Executor {
    public final /* synthetic */ int a;
    public final Executor b;
    public final Object c;
    public Object d;
    public final Object e;

    public r9a(Executor executor, int i) {
        this.a = i;
        switch (i) {
            case 1:
                executor.getClass();
                this.b = executor;
                this.c = new ArrayDeque();
                this.e = new Object();
                return;
            default:
                this.b = executor;
                this.c = new ArrayDeque();
                this.e = new Object();
                return;
        }
    }

    public void a() {
        switch (this.a) {
            case 0:
                Runnable runnable = (Runnable) ((ArrayDeque) this.c).poll();
                this.d = runnable;
                if (runnable != null) {
                    this.b.execute(runnable);
                    return;
                }
                return;
            default:
                synchronized (this.e) {
                    Object poll = ((ArrayDeque) this.c).poll();
                    Runnable runnable2 = (Runnable) poll;
                    this.d = runnable2;
                    if (poll != null) {
                        this.b.execute(runnable2);
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                synchronized (this.e) {
                    try {
                        ((ArrayDeque) this.c).add(new bv4(10, this, runnable));
                        if (((Runnable) this.d) == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                runnable.getClass();
                synchronized (this.e) {
                    ((ArrayDeque) this.c).offer(new ex2(27, runnable, this));
                    if (((Runnable) this.d) == null) {
                        a();
                    }
                }
                return;
            default:
                try {
                    this.b.execute(runnable);
                    return;
                } catch (RuntimeException e) {
                    if (((CancellationToken) this.c).isCancellationRequested()) {
                        ((CancellationTokenSource) this.d).cancel();
                    } else {
                        ((TaskCompletionSource) this.e).setException(e);
                    }
                    throw e;
                }
        }
    }

    public /* synthetic */ r9a(Executor executor, CancellationToken cancellationToken, CancellationTokenSource cancellationTokenSource, TaskCompletionSource taskCompletionSource) {
        this.a = 2;
        this.b = executor;
        this.c = cancellationToken;
        this.d = cancellationTokenSource;
        this.e = taskCompletionSource;
    }
}
