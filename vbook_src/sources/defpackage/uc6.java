package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uc6  reason: default package */
/* loaded from: classes.dex */
public final class uc6 extends uq7 {
    public final mu4 b;

    public uc6(mu4 mu4Var) {
        this.b = mu4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, ed6] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        nx5Var.b.b(this.b, "measure");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        ((ed6) mq7Var).K = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc6)) {
            return false;
        }
        if (this.b == ((uc6) obj).b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
