package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ij9  reason: default package */
/* loaded from: classes.dex */
public final class ij9 extends zqa {
    public final xt4 e;
    public int f;

    public ij9(long j, cra craVar, xt4 xt4Var) {
        super(j, craVar);
        this.e = xt4Var;
        this.f = 1;
    }

    @Override // defpackage.zqa
    public final void c() {
        if (!this.c) {
            l();
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
        this.f++;
    }

    @Override // defpackage.zqa
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // defpackage.zqa
    public final void n(iza izaVar) {
        eja ejaVar = dra.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.zqa
    public final zqa u(xt4 xt4Var) {
        dra.c(this);
        return new t08(this.b, this.a, dra.k(xt4Var, this.e, true), this);
    }

    @Override // defpackage.zqa
    public final void m() {
    }
}
