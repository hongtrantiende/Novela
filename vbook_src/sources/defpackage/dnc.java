package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dnc  reason: default package */
/* loaded from: classes.dex */
public final class dnc extends zqa {
    public final zqa e;
    public final boolean f;
    public final boolean g;
    public xt4 h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnc(zqa zqaVar, xt4 xt4Var, boolean z, boolean z2) {
        super(0L, cra.e);
        xt4 xt4Var2;
        eja ejaVar = dra.a;
        this.e = zqaVar;
        this.f = z;
        this.g = z2;
        this.h = dra.k(xt4Var, (zqaVar == null || (xt4Var2 = zqaVar.e()) == null) ? dra.j.e : xt4Var2, z);
        this.i = hc2.i();
    }

    @Override // defpackage.zqa
    public final void c() {
        zqa zqaVar;
        this.c = true;
        if (this.g && (zqaVar = this.e) != null) {
            zqaVar.c();
        }
    }

    @Override // defpackage.zqa
    public final cra d() {
        return v().d();
    }

    @Override // defpackage.zqa
    public final xt4 e() {
        return this.h;
    }

    @Override // defpackage.zqa
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.zqa
    public final long g() {
        return v().g();
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
    public final void m() {
        v().m();
    }

    @Override // defpackage.zqa
    public final void n(iza izaVar) {
        v().n(izaVar);
    }

    @Override // defpackage.zqa
    public final zqa u(xt4 xt4Var) {
        xt4 k = dra.k(xt4Var, this.h, true);
        if (!this.f) {
            return dra.g(v().u(null), k, true);
        }
        return v().u(k);
    }

    public final zqa v() {
        zqa zqaVar = this.e;
        if (zqaVar == null) {
            return dra.j;
        }
        return zqaVar;
    }
}
