package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: coa  reason: default package */
/* loaded from: classes.dex */
public final class coa extends mq7 implements fd6 {
    public final hm8 K;
    public final hm8 L;
    public x02 M;
    public long N = -9223372034707292160L;

    public coa(nz9 nz9Var, vt4 vt4Var) {
        this.K = yae.z(nz9Var);
        this.L = yae.z(vt4Var);
    }

    @Override // defpackage.fd6
    public final int H0(ry6 ry6Var, w27 w27Var, int i) {
        if (!ry6Var.I0() && c16.q(this.N)) {
            return (int) (this.N & 4294967295L);
        }
        return w27Var.j(i);
    }

    @Override // defpackage.fd6
    public final int P0(ry6 ry6Var, w27 w27Var, int i) {
        if (!ry6Var.I0() && c16.q(this.N)) {
            return (int) (this.N & 4294967295L);
        }
        return w27Var.n0(i);
    }

    @Override // defpackage.fd6
    public final int a1(ry6 ry6Var, w27 w27Var, int i) {
        if (!ry6Var.I0() && c16.q(this.N)) {
            return (int) (this.N >> 32);
        }
        return w27Var.F(i);
    }

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        mw8 M;
        if (e37Var.I0()) {
            this.M = new x02(j);
        }
        boolean booleanValue = ((Boolean) ((vt4) this.L.getValue()).invoke()).booleanValue();
        ls3 ls3Var = ls3.a;
        if (!booleanValue) {
            mw8 M2 = w27Var.M(j);
            return e37Var.q0(M2.a, M2.b, ls3Var, new dg(M2, 7));
        }
        if (e37Var.I0()) {
            M = w27Var.M(j);
            this.N = (M.a << 32) | (M.b & 4294967295L);
        } else {
            x02 x02Var = this.M;
            x02Var.getClass();
            M = w27Var.M(x02Var.a);
        }
        mw8 mw8Var = M;
        long d = y02.d(j, this.N);
        return e37Var.q0((int) (d >> 32), (int) (d & 4294967295L), ls3Var, new boa(this, mw8Var, d, e37Var));
    }

    @Override // defpackage.fd6
    public final int z(ry6 ry6Var, w27 w27Var, int i) {
        if (!ry6Var.I0() && c16.q(this.N)) {
            return (int) (this.N >> 32);
        }
        return w27Var.J(i);
    }
}
