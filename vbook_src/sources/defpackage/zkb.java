package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zkb  reason: default package */
/* loaded from: classes3.dex */
public final class zkb extends ykb {
    public final Runnable c;

    public zkb(Runnable runnable, long j, boolean z) {
        super(z, j);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(nq2.y(runnable));
        sb.append(", ");
        sb.append(this.a);
        sb.append(", ");
        if (this.b) {
            str = "Blocking";
        } else {
            str = "Non-blocking";
        }
        return s21.p(sb, str, ']');
    }
}
