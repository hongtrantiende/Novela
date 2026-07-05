package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t06  reason: default package */
/* loaded from: classes.dex */
public final class t06 extends x06 {
    public w06 L;
    public boolean M;

    @Override // defpackage.x06, defpackage.fd6
    public final int H0(ry6 ry6Var, w27 w27Var, int i) {
        if (this.L == w06.a) {
            return w27Var.n0(i);
        }
        return w27Var.j(i);
    }

    @Override // defpackage.x06
    public final long H1(w27 w27Var, long j) {
        int j2;
        if (this.L == w06.a) {
            j2 = w27Var.n0(x02.i(j));
        } else {
            j2 = w27Var.j(x02.i(j));
        }
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 < 0) {
            nv5.a("height must be >= 0");
        }
        return y02.h(0, Integer.MAX_VALUE, j2, j2);
    }

    @Override // defpackage.x06
    public final boolean I1() {
        return this.M;
    }

    @Override // defpackage.x06, defpackage.fd6
    public final int P0(ry6 ry6Var, w27 w27Var, int i) {
        if (this.L == w06.a) {
            return w27Var.n0(i);
        }
        return w27Var.j(i);
    }
}
