package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ete  reason: default package */
/* loaded from: classes.dex */
public final class ete extends qve {
    public static final AtomicLong G = new AtomicLong(Long.MIN_VALUE);
    public final vse C;
    public final vse D;
    public final Object E;
    public final Semaphore F;
    public bte c;
    public bte d;
    public final PriorityBlockingQueue e;
    public final LinkedBlockingQueue f;

    public ete(lte lteVar) {
        super(lteVar);
        this.E = new Object();
        this.F = new Semaphore(2);
        this.e = new PriorityBlockingQueue();
        this.f = new LinkedBlockingQueue();
        this.C = new vse(this, "Thread death: Uncaught exception on worker thread");
        this.D = new vse(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // defpackage.c3e
    public final void W() {
        if (Thread.currentThread() == this.c) {
            return;
        }
        vs.k("Call expected from worker thread");
    }

    @Override // defpackage.qve
    public final boolean Y() {
        return false;
    }

    public final void b0() {
        if (Thread.currentThread() == this.d) {
            return;
        }
        vs.k("Call expected from network thread");
    }

    public final void c0() {
        if (Thread.currentThread() != this.c) {
            return;
        }
        vs.k("Call not expected from worker thread");
    }

    public final boolean d0() {
        if (Thread.currentThread() == this.c) {
            return true;
        }
        return false;
    }

    public final yse e0(Callable callable) {
        Z();
        yse yseVar = new yse(this, callable, false);
        if (Thread.currentThread() == this.c) {
            if (!this.e.isEmpty()) {
                ppe ppeVar = ((lte) this.a).f;
                lte.m(ppeVar);
                ppeVar.E.e("Callable skipped the worker queue.");
            }
            yseVar.run();
            return yseVar;
        }
        k0(yseVar);
        return yseVar;
    }

    public final yse f0(Callable callable) {
        Z();
        yse yseVar = new yse(this, callable, true);
        if (Thread.currentThread() == this.c) {
            yseVar.run();
            return yseVar;
        }
        k0(yseVar);
        return yseVar;
    }

    public final void g0(Runnable runnable) {
        Z();
        am8.s(runnable);
        k0(new yse(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object h0(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            ete eteVar = ((lte) this.a).C;
            lte.m(eteVar);
            eteVar.g0(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                ppe ppeVar = ((lte) this.a).f;
                lte.m(ppeVar);
                s56 s56Var = ppeVar.E;
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                s56Var.e(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            ppe ppeVar2 = ((lte) this.a).f;
            lte.m(ppeVar2);
            ppeVar2.E.e("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void i0(Runnable runnable) {
        Z();
        k0(new yse(this, runnable, true, "Task exception on worker thread"));
    }

    public final void j0(Runnable runnable) {
        Z();
        yse yseVar = new yse(this, runnable, false, "Task exception on network thread");
        synchronized (this.E) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.f;
                linkedBlockingQueue.add(yseVar);
                bte bteVar = this.d;
                if (bteVar == null) {
                    bte bteVar2 = new bte(this, "Measurement Network", linkedBlockingQueue);
                    this.d = bteVar2;
                    bteVar2.setUncaughtExceptionHandler(this.D);
                    this.d.start();
                } else {
                    Object obj = bteVar.a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k0(yse yseVar) {
        synchronized (this.E) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.e;
                priorityBlockingQueue.add(yseVar);
                bte bteVar = this.c;
                if (bteVar == null) {
                    bte bteVar2 = new bte(this, "Measurement Worker", priorityBlockingQueue);
                    this.c = bteVar2;
                    bteVar2.setUncaughtExceptionHandler(this.C);
                    this.c.start();
                } else {
                    Object obj = bteVar.a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
