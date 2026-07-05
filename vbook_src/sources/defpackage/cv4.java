package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cv4  reason: default package */
/* loaded from: classes.dex */
public final class cv4 extends q1 implements Runnable {
    public ListenableFuture D;

    @Override // defpackage.x1
    public final void c() {
        this.D = null;
    }

    @Override // defpackage.x1
    public final String j() {
        ListenableFuture listenableFuture = this.D;
        if (listenableFuture != null) {
            return "delegate=[" + listenableFuture + "]";
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.D;
        if (listenableFuture != null) {
            n(listenableFuture);
        }
    }
}
