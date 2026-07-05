package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n9a  reason: default package */
/* loaded from: classes.dex */
public final class n9a implements Executor {
    public static final nj6 f = new nj6(n9a.class);
    public final Executor a;
    public final ArrayDeque b = new ArrayDeque();
    public int c = 1;
    public long d = 0;
    public final bv4 e = new bv4(this, 9);

    public n9a(Executor executor) {
        executor.getClass();
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.b) {
            int i = this.c;
            if (i != 4 && i != 3) {
                long j = this.d;
                uw9 uw9Var = new uw9(runnable, 2);
                this.b.add(uw9Var);
                this.c = 2;
                try {
                    this.a.execute(this.e);
                    if (this.c == 2) {
                        synchronized (this.b) {
                            try {
                                if (this.d == j && this.c == 2) {
                                    this.c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    synchronized (this.b) {
                        try {
                            int i2 = this.c;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.b.removeLastOccurrence(uw9Var)) {
                                z = false;
                            }
                            if ((th instanceof RejectedExecutionException) && !z) {
                                return;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
            }
            this.b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.a + "}";
    }
}
