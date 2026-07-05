package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ch1  reason: default package */
/* loaded from: classes.dex */
public final class ch1 extends uq7 {
    public final bo7 b;

    public ch1(bo7 bo7Var) {
        this.b = bo7Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, bh1] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        nx5Var.b.b(this.b, "properties");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        bh1 bh1Var = (bh1) mq7Var;
        bh1Var.K = this.b;
        ak0.t(bh1Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ch1) {
                if (this.b == ((ch1) obj).b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
