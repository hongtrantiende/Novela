package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ena  reason: default package */
/* loaded from: classes.dex */
public final class ena extends uq7 {
    public final lf4 b;

    public ena(lf4 lf4Var) {
        this.b = lf4Var;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new hna(this.b);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.b, "animationSpec");
        c00Var.b(kh5.a, "alignment");
        c00Var.b(null, "finishedListener");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        ((hna) mq7Var).L = this.b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ena) && c16.i(((ena) obj).b, this.b)) {
            nk0 nk0Var = kh5.a;
            if (nk0Var.equals(nk0Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.hashCode(-1.0f) + (Float.hashCode(-1.0f) * 31) + (this.b.hashCode() * 31)) * 31;
    }
}
