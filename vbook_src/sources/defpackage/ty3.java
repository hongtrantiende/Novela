package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ty3  reason: default package */
/* loaded from: classes.dex */
public final class ty3 extends AtomicReference implements Executor, Runnable {
    public static final /* synthetic */ int e = 0;
    public s6f a;
    public Executor b;
    public Runnable c;
    public Thread d;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        boolean z;
        if (get() == sy3.b) {
            this.b = null;
            this.a = null;
            return;
        }
        this.d = Thread.currentThread();
        try {
            s6f s6fVar = this.a;
            Objects.requireNonNull(s6fVar);
            ij1 ij1Var = (ij1) s6fVar.b;
            if (((Thread) ij1Var.b) == this.d) {
                this.a = null;
                if (((Runnable) ij1Var.c) == null) {
                    z = true;
                } else {
                    z = false;
                }
                wq9.D(z);
                ij1Var.c = runnable;
                Executor executor = this.b;
                Objects.requireNonNull(executor);
                ij1Var.d = executor;
                this.b = null;
            } else {
                Executor executor2 = this.b;
                Objects.requireNonNull(executor2);
                this.b = null;
                this.c = runnable;
                executor2.execute(this);
            }
            this.d = null;
        } catch (Throwable th) {
            this.d = null;
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        Thread currentThread = Thread.currentThread();
        if (currentThread != this.d) {
            Runnable runnable = this.c;
            Objects.requireNonNull(runnable);
            this.c = null;
            runnable.run();
            return;
        }
        ij1 ij1Var = new ij1(27, false);
        ij1Var.b = currentThread;
        s6f s6fVar = this.a;
        Objects.requireNonNull(s6fVar);
        s6fVar.b = ij1Var;
        this.a = null;
        try {
            Runnable runnable2 = this.c;
            Objects.requireNonNull(runnable2);
            this.c = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = (Runnable) ij1Var.c;
                if (runnable3 == null || (executor = (Executor) ij1Var.d) == null) {
                    break;
                }
                ij1Var.c = null;
                ij1Var.d = null;
                executor.execute(runnable3);
            }
        } finally {
            ij1Var.b = null;
        }
    }
}
