package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f82  reason: default package */
/* loaded from: classes3.dex */
public abstract class f82 extends c1 implements o42 {
    public static final e82 b = new e82(abf.d, new ln1(16));

    public f82() {
        super(abf.d);
    }

    public abstract void C(d82 d82Var, Runnable runnable);

    @Override // defpackage.o42
    public final m42 G(n42 n42Var) {
        return new ta3(this, n42Var);
    }

    public void Q(d82 d82Var, Runnable runnable) {
        ua3.b(this, d82Var, runnable);
    }

    public boolean V(d82 d82Var) {
        return !(this instanceof dvc);
    }

    @Override // defpackage.o42
    public final void b1(m42 m42Var) {
        m42Var.getClass();
        ta3 ta3Var = (ta3) m42Var;
        ta3Var.j();
        f61 l = ta3Var.l();
        if (l != null) {
            l.o();
        }
    }

    @Override // defpackage.c1, defpackage.d82
    public final /* bridge */ b82 get(c82 c82Var) {
        return n4f.o(this, c82Var);
    }

    public f82 j0(int i) {
        yte.p(i);
        return new lo6(this, i);
    }

    @Override // defpackage.c1, defpackage.d82
    public final /* bridge */ d82 minusKey(c82 c82Var) {
        return n4f.r(this, c82Var);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + nq2.y(this);
    }
}
