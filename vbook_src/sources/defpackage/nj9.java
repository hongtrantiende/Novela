package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nj9  reason: default package */
/* loaded from: classes.dex */
public final class nj9 implements AutoCloseable {
    public final pa3 a;

    public nj9(pa3 pa3Var) {
        this.a = pa3Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final k57 o() {
        o40 q;
        pa3 pa3Var = this.a;
        ra3 ra3Var = pa3Var.c;
        synchronized (ra3Var.D) {
            pa3Var.close();
            q = ra3Var.q(pa3Var.a.a);
        }
        if (q != null) {
            return new k57(q, 4);
        }
        return null;
    }

    public final hn8 q() {
        pa3 pa3Var = this.a;
        if (!pa3Var.b) {
            return (hn8) pa3Var.a.c.get(1);
        }
        vs.k("snapshot is closed");
        return null;
    }
}
