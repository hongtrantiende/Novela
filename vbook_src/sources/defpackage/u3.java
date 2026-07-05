package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u3  reason: default package */
/* loaded from: classes.dex */
public abstract class u3 extends yl4 implements Runnable {
    public static final /* synthetic */ int G = 0;
    public ListenableFuture E;
    public Object F;

    public u3(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.E = listenableFuture;
        obj.getClass();
        this.F = obj;
    }

    @Override // defpackage.x1
    public final void c() {
        boolean z;
        ListenableFuture listenableFuture = this.E;
        if (listenableFuture != null) {
            z = true;
        } else {
            z = false;
        }
        if (z & (this.a instanceof i1)) {
            listenableFuture.cancel(p());
        }
        this.E = null;
        this.F = null;
    }

    @Override // defpackage.x1
    public final String j() {
        String str;
        ListenableFuture listenableFuture = this.E;
        Object obj = this.F;
        String j = super.j();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (obj != null) {
            return str + "function=[" + obj + "]";
        } else if (j != null) {
            return str.concat(j);
        } else {
            return null;
        }
    }

    public abstract Object q(Object obj, Object obj2);

    public abstract void r(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ListenableFuture listenableFuture = this.E;
        Object obj = this.F;
        boolean z2 = this.a instanceof i1;
        boolean z3 = true;
        if (listenableFuture == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = z2 | z;
        if (obj != null) {
            z3 = false;
        }
        if (z4 | z3) {
            return;
        }
        this.E = null;
        if (listenableFuture.isCancelled()) {
            n(listenableFuture);
            return;
        }
        try {
            try {
                Object q = q(obj, dv4.b(listenableFuture));
                this.F = null;
                r(q);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    m(th);
                } finally {
                    this.F = null;
                }
            }
        } catch (Error e) {
            m(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            m(e2.getCause());
        } catch (Exception e3) {
            m(e3);
        }
    }
}
