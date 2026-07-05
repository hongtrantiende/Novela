package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n1  reason: default package */
/* loaded from: classes.dex */
public final class n1 implements Runnable {
    public final x1 a;
    public final ListenableFuture b;

    public n1(x1 x1Var, ListenableFuture listenableFuture) {
        this.a = x1Var;
        this.b = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a == this) {
            if (x1.f.c(this.a, this, x1.h(this.b))) {
                x1.e(this.a, false);
            }
        }
    }
}
