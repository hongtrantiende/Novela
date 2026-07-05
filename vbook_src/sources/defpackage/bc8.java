package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bc8  reason: default package */
/* loaded from: classes.dex */
public final class bc8 extends uq7 {
    public final xt4 b;

    public bc8(xt4 xt4Var) {
        this.b = xt4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, cc8] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        mq7Var.L = -9223372034707292160L;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        nx5Var.b.b(this.b, "onSizeChanged");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        cc8 cc8Var = (cc8) mq7Var;
        cc8Var.K = this.b;
        cc8Var.L = -9223372034707292160L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc8)) {
            return false;
        }
        if (this.b == ((bc8) obj).b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
