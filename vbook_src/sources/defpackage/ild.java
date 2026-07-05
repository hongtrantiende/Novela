package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ild  reason: default package */
/* loaded from: classes.dex */
public final class ild extends uq7 {
    public final ec b;

    public ild(ec ecVar) {
        this.b = ecVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, tka] */
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
        ((tka) mq7Var).K = this.b;
    }

    public final boolean equals(Object obj) {
        ild ildVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ild) {
            ildVar = (ild) obj;
        } else {
            ildVar = null;
        }
        if (ildVar == null) {
            return false;
        }
        return c16.i(this.b, ildVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
