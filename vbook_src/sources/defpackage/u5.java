package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u5  reason: default package */
/* loaded from: classes.dex */
public final class u5 extends sha {
    public final oaa a;
    public final hm8 b;
    public final hm8 c;

    public u5(oaa oaaVar, cga cgaVar, rk9 rk9Var) {
        this.a = oaaVar;
        this.b = yae.z(cgaVar);
        this.c = yae.z(rk9Var);
    }

    @Override // defpackage.sha
    public final sha a(jga jgaVar, cga cgaVar, long j, long j2, long j3) {
        hm8 hm8Var = this.b;
        hc2.e(this.a, j, j2, j3, !c16.i((cga) hm8Var.getValue(), cgaVar));
        hm8Var.setValue(cgaVar);
        return this;
    }

    @Override // defpackage.sha
    public final rk9 c() {
        return (rk9) this.c.getValue();
    }

    @Override // defpackage.sha
    public final boolean d() {
        return true;
    }

    @Override // defpackage.sha
    public final oaa e() {
        return this.a;
    }

    @Override // defpackage.sha
    public final sha h() {
        oaa oaaVar = this.a;
        npe.n(y78.j(((y78) ((hm8) oaaVar.e).getValue()).a, ((y78) ((hm8) oaaVar.d).getValue()).a), ((dna) ((hm8) oaaVar.b).getValue()).a);
        kga kgaVar = ((cga) this.b.getValue()).M;
        hm8 hm8Var = kgaVar.E;
        fha fhaVar = (fha) ((iha) hm8Var.getValue()).b.getValue();
        iha ihaVar = (iha) hm8Var.getValue();
        sc6 sc6Var = kgaVar.e().b.f;
        if (sc6Var != null) {
            eg0.A(sc6Var.a());
            fhaVar.getClass();
            return t28.a;
        }
        vs.m("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
        return null;
    }

    @Override // defpackage.sha
    public final void i(rk9 rk9Var) {
        this.c.setValue(rk9Var);
    }

    @Override // defpackage.sha
    public final sha g(cga cgaVar) {
        return this;
    }
}
