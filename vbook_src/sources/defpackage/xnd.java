package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xnd  reason: default package */
/* loaded from: classes.dex */
public abstract class xnd extends jx1 {
    public final ci0 k;

    public xnd(ci0 ci0Var) {
        this.k = ci0Var;
    }

    public final void A() {
        x(null, this.k);
    }

    public void B() {
        A();
    }

    @Override // defpackage.ci0
    public final aac g() {
        return this.k.g();
    }

    @Override // defpackage.ci0
    public final f57 h() {
        return this.k.h();
    }

    @Override // defpackage.ci0
    public final boolean i() {
        return this.k.i();
    }

    @Override // defpackage.ci0
    public final void l(ys2 ys2Var) {
        this.j = ys2Var;
        this.i = a2d.p(null);
        B();
    }

    @Override // defpackage.ci0
    public void s(f57 f57Var) {
        this.k.s(f57Var);
    }

    @Override // defpackage.jx1
    public final e67 t(Object obj, e67 e67Var) {
        Void r1 = (Void) obj;
        return y(e67Var);
    }

    @Override // defpackage.jx1
    public final long u(Object obj, long j) {
        Void r1 = (Void) obj;
        return j;
    }

    @Override // defpackage.jx1
    public final int v(int i, Object obj) {
        Void r2 = (Void) obj;
        return i;
    }

    @Override // defpackage.jx1
    public final void w(Object obj, ci0 ci0Var, aac aacVar) {
        Void r1 = (Void) obj;
        z(aacVar);
    }

    public abstract void z(aac aacVar);

    public e67 y(e67 e67Var) {
        return e67Var;
    }
}
