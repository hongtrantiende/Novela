package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t08  reason: default package */
/* loaded from: classes.dex */
public final class t08 extends zqa {
    public final xt4 e;
    public final zqa f;

    public t08(long j, cra craVar, xt4 xt4Var, zqa zqaVar) {
        super(j, craVar);
        this.e = xt4Var;
        this.f = zqaVar;
        zqaVar.k();
    }

    @Override // defpackage.zqa
    public final void c() {
        zqa zqaVar = this.f;
        if (!this.c) {
            if (this.b != zqaVar.g()) {
                a();
            }
            zqaVar.l();
            this.c = true;
            synchronized (dra.c) {
                o();
            }
        }
    }

    @Override // defpackage.zqa
    public final xt4 e() {
        return this.e;
    }

    @Override // defpackage.zqa
    public final boolean f() {
        return true;
    }

    @Override // defpackage.zqa
    public final xt4 i() {
        return null;
    }

    @Override // defpackage.zqa
    public final void k() {
        vve.o();
        throw null;
    }

    @Override // defpackage.zqa
    public final void l() {
        vve.o();
        throw null;
    }

    @Override // defpackage.zqa
    public final void n(iza izaVar) {
        eja ejaVar = dra.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.zqa
    public final zqa u(xt4 xt4Var) {
        return new t08(this.b, this.a, dra.k(xt4Var, this.e, true), this.f);
    }

    @Override // defpackage.zqa
    public final void m() {
    }
}
