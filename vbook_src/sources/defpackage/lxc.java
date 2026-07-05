package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lxc  reason: default package */
/* loaded from: classes.dex */
public final class lxc extends mq7 implements fd6 {
    public float K;
    public float L;

    @Override // defpackage.fd6
    public final int H0(ry6 ry6Var, w27 w27Var, int i) {
        int i2;
        int j = w27Var.j(i);
        if (!Float.isNaN(this.L)) {
            i2 = ry6Var.X0(this.L);
        } else {
            i2 = 0;
        }
        if (j < i2) {
            return i2;
        }
        return j;
    }

    @Override // defpackage.fd6
    public final int P0(ry6 ry6Var, w27 w27Var, int i) {
        int i2;
        int n0 = w27Var.n0(i);
        if (!Float.isNaN(this.L)) {
            i2 = ry6Var.X0(this.L);
        } else {
            i2 = 0;
        }
        if (n0 < i2) {
            return i2;
        }
        return n0;
    }

    @Override // defpackage.fd6
    public final int a1(ry6 ry6Var, w27 w27Var, int i) {
        int i2;
        int F = w27Var.F(i);
        if (!Float.isNaN(this.K)) {
            i2 = ry6Var.X0(this.K);
        } else {
            i2 = 0;
        }
        if (F < i2) {
            return i2;
        }
        return F;
    }

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        int k;
        int j2;
        int i = 0;
        if (!Float.isNaN(this.K) && x02.k(j) == 0) {
            int X0 = e37Var.X0(this.K);
            k = x02.i(j);
            if (X0 < 0) {
                X0 = 0;
            }
            if (X0 <= k) {
                k = X0;
            }
        } else {
            k = x02.k(j);
        }
        int i2 = x02.i(j);
        if (!Float.isNaN(this.L) && x02.j(j) == 0) {
            int X02 = e37Var.X0(this.L);
            j2 = x02.h(j);
            if (X02 >= 0) {
                i = X02;
            }
            if (i <= j2) {
                j2 = i;
            }
        } else {
            j2 = x02.j(j);
        }
        mw8 M = w27Var.M(y02.a(k, i2, j2, x02.h(j)));
        return e37Var.q0(M.a, M.b, ls3.a, new a1(M, 20));
    }

    @Override // defpackage.fd6
    public final int z(ry6 ry6Var, w27 w27Var, int i) {
        int i2;
        int J = w27Var.J(i);
        if (!Float.isNaN(this.K)) {
            i2 = ry6Var.X0(this.K);
        } else {
            i2 = 0;
        }
        if (J < i2) {
            return i2;
        }
        return J;
    }
}
