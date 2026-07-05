package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eb3  reason: default package */
/* loaded from: classes.dex */
public final class eb3 extends uq7 {
    public final qh6 b;

    public eb3(qh6 qh6Var) {
        this.b = qh6Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, fb3] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        fb3 fb3Var = (fb3) mq7Var;
        qh6 qh6Var = fb3Var.K;
        qh6 qh6Var2 = this.b;
        if (!c16.i(qh6Var, qh6Var2) && fb3Var.a.J) {
            qh6 qh6Var3 = fb3Var.K;
            qh6Var3.e();
            qh6Var3.b = null;
            qh6Var3.c = -1;
            qh6Var2.j = fb3Var;
            fb3Var.K = qh6Var2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof eb3) && c16.i(this.b, ((eb3) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.b + ")";
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
    }
}
