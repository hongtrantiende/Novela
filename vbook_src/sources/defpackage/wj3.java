package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wj3  reason: default package */
/* loaded from: classes.dex */
public final class wj3 extends uq7 {
    public final xt4 b;

    public wj3(xt4 xt4Var) {
        this.b = xt4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, vj3] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        nx5Var.b.b(this.b, "onDraw");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        ((vj3) mq7Var).K = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj3)) {
            return false;
        }
        if (this.b == ((wj3) obj).b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
