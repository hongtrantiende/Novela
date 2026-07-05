package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oed  reason: default package */
/* loaded from: classes.dex */
public final class oed extends mq7 implements fd6, z7a {
    public boolean K;
    public final k8a L = new k8a("Visible");

    public oed(boolean z) {
        this.K = z;
    }

    @Override // defpackage.z7a
    public final void m1(l8a l8aVar) {
        l8aVar.a(this.L, Boolean.valueOf(this.K));
        if (!this.K) {
            r76[] r76VarArr = j8a.a;
            k8a k8aVar = h8a.l;
            r76 r76Var = j8a.a[4];
            l8aVar.a(k8aVar, Boolean.FALSE);
        }
    }

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        mw8 M = w27Var.M(j);
        return e37Var.q0(M.a, M.b, ls3.a, new t3c(18, this, M));
    }
}
