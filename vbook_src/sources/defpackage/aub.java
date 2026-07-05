package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aub  reason: default package */
/* loaded from: classes.dex */
final class aub extends uq7 {
    public final oyb b;

    public aub(oyb oybVar) {
        this.b = oybVar;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new bub(this.b);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        nx5Var.b.b(this.b, "style");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        bub bubVar = (bub) mq7Var;
        bubVar.getClass();
        oyb z = uaf.z(this.b, voe.v(bubVar).W);
        bubVar.H1(z, (do4) nye.q(bubVar, dy1.k));
        a52 a52Var = bubVar.M;
        if (a52Var != null) {
            a52.f(a52Var, null, null, z, 23);
            ube.y(bubVar);
            return;
        }
        throw hl5.d("Min size state is not set.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aub)) {
            return false;
        }
        return c16.i(this.b, ((aub) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
