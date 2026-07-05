package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qu2  reason: default package */
/* loaded from: classes.dex */
public final class qu2 implements w27 {
    public final /* synthetic */ int a;
    public final w27 b;
    public final Enum c;
    public final Enum d;

    public /* synthetic */ qu2(w27 w27Var, Enum r2, Enum r3, int i) {
        this.a = i;
        this.b = w27Var;
        this.c = r2;
        this.d = r3;
    }

    @Override // defpackage.w27
    public final int F(int i) {
        switch (this.a) {
            case 0:
                return this.b.F(i);
            case 1:
                return this.b.F(i);
            default:
                return this.b.F(i);
        }
    }

    @Override // defpackage.w27
    public final int J(int i) {
        switch (this.a) {
            case 0:
                return this.b.J(i);
            case 1:
                return this.b.J(i);
            default:
                return this.b.J(i);
        }
    }

    @Override // defpackage.w27
    public final mw8 M(long j) {
        int n0;
        int F;
        int n02;
        int F2;
        int n03;
        int F3;
        int i = this.a;
        Enum r1 = this.c;
        Enum r2 = this.d;
        w27 w27Var = this.b;
        int i2 = 32767;
        switch (i) {
            case 0:
                z06 z06Var = (z06) r2;
                v06 v06Var = (v06) r1;
                v06 v06Var2 = v06.b;
                if (z06Var == z06.a) {
                    if (v06Var == v06Var2) {
                        F = w27Var.J(x02.h(j));
                    } else {
                        F = w27Var.F(x02.h(j));
                    }
                    if (x02.d(j)) {
                        i2 = x02.h(j);
                    }
                    return new sh4(F, i2, 0);
                }
                if (v06Var == v06Var2) {
                    n0 = w27Var.j(x02.i(j));
                } else {
                    n0 = w27Var.n0(x02.i(j));
                }
                if (x02.e(j)) {
                    i2 = x02.i(j);
                }
                return new sh4(i2, n0, 0);
            case 1:
                n37 n37Var = (n37) r2;
                m37 m37Var = (m37) r1;
                m37 m37Var2 = m37.b;
                if (n37Var == n37.a) {
                    if (m37Var == m37Var2) {
                        F2 = w27Var.J(x02.h(j));
                    } else {
                        F2 = w27Var.F(x02.h(j));
                    }
                    if (x02.d(j)) {
                        i2 = x02.h(j);
                    }
                    return new sh4(F2, i2, 1);
                }
                if (m37Var == m37Var2) {
                    n02 = w27Var.j(x02.i(j));
                } else {
                    n02 = w27Var.n0(x02.i(j));
                }
                if (x02.e(j)) {
                    i2 = x02.i(j);
                }
                return new sh4(i2, n02, 1);
            default:
                r38 r38Var = (r38) r2;
                q38 q38Var = (q38) r1;
                q38 q38Var2 = q38.b;
                if (r38Var == r38.a) {
                    if (q38Var == q38Var2) {
                        F3 = w27Var.J(x02.h(j));
                    } else {
                        F3 = w27Var.F(x02.h(j));
                    }
                    if (x02.d(j)) {
                        i2 = x02.h(j);
                    }
                    return new sh4(F3, i2, 2);
                }
                if (q38Var == q38Var2) {
                    n03 = w27Var.j(x02.i(j));
                } else {
                    n03 = w27Var.n0(x02.i(j));
                }
                if (x02.e(j)) {
                    i2 = x02.i(j);
                }
                return new sh4(i2, n03, 2);
        }
    }

    @Override // defpackage.w27
    public final Object S() {
        switch (this.a) {
            case 0:
                return this.b.S();
            case 1:
                return this.b.S();
            default:
                return this.b.S();
        }
    }

    @Override // defpackage.w27
    public final int j(int i) {
        switch (this.a) {
            case 0:
                return this.b.j(i);
            case 1:
                return this.b.j(i);
            default:
                return this.b.j(i);
        }
    }

    @Override // defpackage.w27
    public final int n0(int i) {
        switch (this.a) {
            case 0:
                return this.b.n0(i);
            case 1:
                return this.b.n0(i);
            default:
                return this.b.n0(i);
        }
    }
}
