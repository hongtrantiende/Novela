package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k5d  reason: default package */
/* loaded from: classes.dex */
public final class k5d extends uq7 {
    public final mk0 b;

    public k5d(mk0 mk0Var) {
        this.b = mk0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, l5d] */
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
        ((l5d) mq7Var).K = this.b;
    }

    public final boolean equals(Object obj) {
        k5d k5dVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof k5d) {
            k5dVar = (k5d) obj;
        } else {
            k5dVar = null;
        }
        if (k5dVar == null) {
            return false;
        }
        return this.b.equals(k5dVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a);
    }
}
