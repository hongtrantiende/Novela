package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qnd  reason: default package */
/* loaded from: classes.dex */
public final class qnd extends mq7 implements fd6 {
    public j73 K;
    public boolean L;
    public lu4 M;

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        int k;
        int i;
        j73 j73Var = this.K;
        int i2 = 0;
        j73 j73Var2 = j73.a;
        if (j73Var != j73Var2) {
            k = 0;
        } else {
            k = x02.k(j);
        }
        j73 j73Var3 = this.K;
        j73 j73Var4 = j73.b;
        if (j73Var3 == j73Var4) {
            i2 = x02.j(j);
        }
        int i3 = Integer.MAX_VALUE;
        if (this.K != j73Var2 && this.L) {
            i = Integer.MAX_VALUE;
        } else {
            i = x02.i(j);
        }
        if (this.K == j73Var4 || !this.L) {
            i3 = x02.h(j);
        }
        mw8 M = w27Var.M(y02.a(k, i, i2, i3));
        int n = dce.n(M.a, x02.k(j), x02.i(j));
        int n2 = dce.n(M.b, x02.j(j), x02.h(j));
        return e37Var.q0(n, n2, ls3.a, new fv9(this, n, M, n2, e37Var));
    }
}
