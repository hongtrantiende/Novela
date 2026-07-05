package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nm0  reason: default package */
/* loaded from: classes.dex */
public final class nm0 extends uq7 {
    public final xt4 b;

    public nm0(xt4 xt4Var) {
        this.b = xt4Var;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new om0(this.b);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        nx5Var.b.b(this.b, "block");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        om0 om0Var = (om0) mq7Var;
        xt4 xt4Var = this.b;
        om0Var.K = xt4Var;
        ube.F(om0Var, xt4Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm0)) {
            return false;
        }
        if (this.b == ((nm0) obj).b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
