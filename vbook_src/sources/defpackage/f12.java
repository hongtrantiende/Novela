package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f12  reason: default package */
/* loaded from: classes.dex */
public final class f12 extends uq7 {
    public final xt4 b;

    public f12(xt4 xt4Var) {
        this.b = xt4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, ex5, g12] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? ex5Var = new ex5();
        ex5Var.M = this.b;
        return ex5Var;
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        g12 g12Var = (g12) mq7Var;
        xt4 xt4Var = g12Var.M;
        xt4 xt4Var2 = this.b;
        if (xt4Var2 != xt4Var) {
            g12Var.M = xt4Var2;
            g12Var.I1();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f12) && ((f12) obj).b == this.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
    }
}
