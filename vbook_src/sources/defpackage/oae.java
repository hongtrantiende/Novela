package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oae  reason: default package */
/* loaded from: classes.dex */
public final class oae extends Thread {
    public final WeakReference a;
    public final long b;
    public final CountDownLatch c = new CountDownLatch(1);
    public boolean d = false;

    public oae(t8 t8Var, long j) {
        this.a = new WeakReference(t8Var);
        this.b = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        t8 t8Var;
        WeakReference weakReference = this.a;
        try {
            if (!this.c.await(this.b, TimeUnit.MILLISECONDS) && (t8Var = (t8) weakReference.get()) != null) {
                t8Var.b();
                this.d = true;
            }
        } catch (InterruptedException unused) {
            t8 t8Var2 = (t8) weakReference.get();
            if (t8Var2 != null) {
                t8Var2.b();
                this.d = true;
            }
        }
    }
}
