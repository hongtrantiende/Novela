package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a16  reason: default package */
/* loaded from: classes.dex */
public final class a16 extends x06 {
    public w06 L;
    public boolean M;

    @Override // defpackage.x06
    public final long H1(w27 w27Var, long j) {
        int J;
        if (this.L == w06.a) {
            J = w27Var.F(x02.h(j));
        } else {
            J = w27Var.J(x02.h(j));
        }
        if (J < 0) {
            J = 0;
        }
        if (J < 0) {
            nv5.a("width must be >= 0");
        }
        return y02.h(J, J, 0, Integer.MAX_VALUE);
    }

    @Override // defpackage.x06
    public final boolean I1() {
        return this.M;
    }

    @Override // defpackage.x06, defpackage.fd6
    public final int a1(ry6 ry6Var, w27 w27Var, int i) {
        if (this.L == w06.a) {
            return w27Var.F(i);
        }
        return w27Var.J(i);
    }

    @Override // defpackage.x06, defpackage.fd6
    public final int z(ry6 ry6Var, w27 w27Var, int i) {
        if (this.L == w06.a) {
            return w27Var.F(i);
        }
        return w27Var.J(i);
    }
}
