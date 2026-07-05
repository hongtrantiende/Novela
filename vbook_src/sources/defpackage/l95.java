package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l95  reason: default package */
/* loaded from: classes.dex */
public final class l95 extends uq7 {
    public final lk0 b;

    public l95(lk0 lk0Var) {
        this.b = lk0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, m95] */
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
        ((m95) mq7Var).K = this.b;
    }

    public final boolean equals(Object obj) {
        l95 l95Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof l95) {
            l95Var = (l95) obj;
        } else {
            l95Var = null;
        }
        if (l95Var == null) {
            return false;
        }
        return this.b.equals(l95Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a);
    }
}
