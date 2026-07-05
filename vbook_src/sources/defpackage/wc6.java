package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wc6  reason: default package */
/* loaded from: classes.dex */
public final class wc6 extends uq7 {
    public final Object b;

    public wc6(Object obj) {
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, xc6] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        nx5Var.a = this.b;
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        ((xc6) mq7Var).K = this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof wc6) || !this.b.equals(((wc6) obj).b)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.b + ")";
    }
}
