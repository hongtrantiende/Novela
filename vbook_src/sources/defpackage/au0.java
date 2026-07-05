package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: au0  reason: default package */
/* loaded from: classes.dex */
public final class au0 extends uq7 {
    public final dc b;
    public final boolean c;

    public au0(dc dcVar, boolean z) {
        this.b = dcVar;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, bu0] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        mq7Var.L = this.c;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        bu0 bu0Var = (bu0) mq7Var;
        bu0Var.K = this.b;
        bu0Var.L = this.c;
    }

    public final boolean equals(Object obj) {
        au0 au0Var;
        if (this != obj) {
            if (obj instanceof au0) {
                au0Var = (au0) obj;
            } else {
                au0Var = null;
            }
            if (au0Var != null && c16.i(this.b, au0Var.b) && this.c == au0Var.c) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
    }
}
