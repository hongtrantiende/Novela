package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ond  reason: default package */
/* loaded from: classes.dex */
public abstract class ond {
    public static final String a = r95.r("WorkerWrapper");

    public static final Object a(ListenableFuture listenableFuture, lr6 lr6Var, aab aabVar) {
        Object obj;
        try {
            boolean z = false;
            if (listenableFuture.isDone()) {
                while (true) {
                    try {
                        obj = listenableFuture.get();
                        break;
                    } catch (InterruptedException unused) {
                        z = true;
                    } catch (Throwable th) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
                return obj;
            }
            f61 f61Var = new f61(1, w92.t(aabVar));
            f61Var.u();
            listenableFuture.a(new pac(listenableFuture, f61Var, 0), d73.a);
            f61Var.w(new poa(19, lr6Var, listenableFuture));
            return f61Var.s();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }
}
