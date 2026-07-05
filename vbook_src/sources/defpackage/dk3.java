package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dk3  reason: default package */
/* loaded from: classes.dex */
public final class dk3 extends uq7 {
    public final xt4 b;

    public dk3(xt4 xt4Var) {
        this.b = xt4Var;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new s41(new u41(), this.b);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        nx5Var.b.b(this.b, "onBuildDrawCache");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        s41 s41Var = (s41) mq7Var;
        s41Var.M = this.b;
        s41Var.H1();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk3)) {
            return false;
        }
        if (this.b == ((dk3) obj).b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
