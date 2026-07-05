package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gx5  reason: default package */
/* loaded from: classes.dex */
public final class gx5 extends uq7 {
    public final qid b;

    public gx5(qid qidVar) {
        this.b = qidVar;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new hx5(this.b);
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        hx5 hx5Var = (hx5) mq7Var;
        qid qidVar = hx5Var.M;
        qid qidVar2 = this.b;
        if (!c16.i(qidVar2, qidVar)) {
            hx5Var.M = qidVar2;
            hx5Var.I1();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx5)) {
            return false;
        }
        return c16.i(((gx5) obj).b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
    }
}
