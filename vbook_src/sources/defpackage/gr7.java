package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gr7  reason: default package */
/* loaded from: classes.dex */
public final class gr7 extends q1 implements Runnable {
    public final Runnable D;

    public gr7(Runnable runnable) {
        runnable.getClass();
        this.D = runnable;
    }

    @Override // defpackage.x1
    public final String j() {
        return "task=[" + this.D + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.D.run();
        } catch (Throwable th) {
            m(th);
            throw th;
        }
    }
}
