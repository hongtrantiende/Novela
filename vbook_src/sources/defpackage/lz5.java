package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lz5  reason: default package */
/* loaded from: classes.dex */
public final class lz5 implements xq7 {
    public final m82 a;
    public final vo b = new vo(new ik(this, 14));
    public final Object c = new Object();
    public int d = 5;
    public long e;
    public f61 f;

    public lz5(jac jacVar) {
        this.a = jacVar;
    }

    public final void a() {
        synchronized (this.c) {
            f61 f61Var = this.f;
            if (f61Var != null) {
                f61Var.a(null);
            }
        }
    }

    @Override // defpackage.d82
    public final Object fold(Object obj, lu4 lu4Var) {
        return lu4Var.invoke(obj, this);
    }

    @Override // defpackage.d82
    public final b82 get(c82 c82Var) {
        return nq2.x(this, c82Var);
    }

    @Override // defpackage.xq7
    public final Object m0(xt4 xt4Var, m42 m42Var) {
        return this.b.m0(xt4Var, m42Var);
    }

    @Override // defpackage.d82
    public final d82 minusKey(c82 c82Var) {
        return nq2.B(this, c82Var);
    }

    @Override // defpackage.d82
    public final d82 plus(d82 d82Var) {
        return nq2.C(this, d82Var);
    }
}
