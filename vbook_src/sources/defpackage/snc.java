package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: snc  reason: default package */
/* loaded from: classes3.dex */
final class snc extends uq7 {
    public final ei6 b;

    public snc(ei6 ei6Var) {
        this.b = ei6Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, tnc] */
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
        ((tnc) mq7Var).K = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof snc) && c16.i(this.b, ((snc) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.b + ")";
    }
}
