package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qbc  reason: default package */
/* loaded from: classes.dex */
public final class qbc extends zi1 {
    public boolean i0;
    public xt4 j0;
    public final imb k0;

    public qbc(boolean z, yu7 yu7Var, boolean z2, boolean z3, xt9 xt9Var, xt4 xt4Var) {
        super(yu7Var, null, z2, z3, null, xt9Var, new up0(24, xt4Var, z));
        this.i0 = z;
        this.j0 = xt4Var;
        this.k0 = new imb(this, 10);
    }

    @Override // defpackage.t0
    public final void K1(l8a l8aVar) {
        rbc rbcVar;
        if (this.i0) {
            rbcVar = rbc.a;
        } else {
            rbcVar = rbc.b;
        }
        j8a.k(l8aVar, rbcVar);
        j8a.d(l8aVar, ox9.e);
        bj j = h50.j(this.i0);
        if (j != null) {
            j8a.g(l8aVar, j);
        }
        j8a.b(l8aVar, new pbc(l8aVar, 0));
    }
}
