package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nx3  reason: default package */
/* loaded from: classes3.dex */
public final class nx3 extends ox3 {
    public final Runnable c;

    public nx3(long j, Runnable runnable) {
        super(j);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // defpackage.ox3
    public final String toString() {
        return super.toString() + this.c;
    }
}
