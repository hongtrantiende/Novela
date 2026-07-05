package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pac  reason: default package */
/* loaded from: classes.dex */
public final class pac implements Runnable {
    public final /* synthetic */ int a;
    public final ListenableFuture b;
    public final f61 c;

    public /* synthetic */ pac(ListenableFuture listenableFuture, f61 f61Var, int i) {
        this.a = i;
        this.b = listenableFuture;
        this.c = f61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        f61 f61Var = this.c;
        ListenableFuture listenableFuture = this.b;
        switch (i) {
            case 0:
                if (listenableFuture.isCancelled()) {
                    f61Var.a(null);
                    return;
                }
                boolean z = false;
                while (true) {
                    try {
                        try {
                            Object obj = listenableFuture.get();
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            f61Var.resumeWith(obj);
                            return;
                        } catch (InterruptedException unused) {
                            z = true;
                        }
                    } catch (ExecutionException e) {
                        Throwable cause = e.getCause();
                        cause.getClass();
                        f61Var.resumeWith(new gs9(cause));
                        return;
                    }
                }
            default:
                if (listenableFuture.isCancelled()) {
                    f61Var.a(null);
                    return;
                }
                try {
                    f61Var.resumeWith(n3.g(listenableFuture));
                    return;
                } catch (ExecutionException e2) {
                    Throwable cause2 = e2.getCause();
                    if (cause2 != null) {
                        f61Var.resumeWith(new gs9(cause2));
                        return;
                    }
                    NullPointerException nullPointerException = new NullPointerException();
                    c16.v(nullPointerException, c16.class.getName());
                    throw nullPointerException;
                }
        }
    }
}
