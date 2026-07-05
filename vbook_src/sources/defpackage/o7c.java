package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o7c  reason: default package */
/* loaded from: classes.dex */
public final class o7c extends mq7 implements fd6 {
    public gz5 K;
    public boolean L;
    public lf4 M;
    public boolean N;
    public lq O;
    public lq P;
    public float Q;
    public float R;

    @Override // defpackage.mq7
    public final void B1() {
        this.O = null;
        this.P = null;
        this.R = Float.NaN;
        this.Q = Float.NaN;
    }

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        boolean z;
        float f;
        float f2;
        boolean z2;
        boolean z3;
        Float f3;
        Float f4;
        float f5 = xwe.w;
        if (w27Var.j(x02.i(j)) != 0 && w27Var.J(x02.h(j)) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.N) {
            f = xwe.p;
        } else if (!z && !this.L) {
            f = pab.b;
        } else {
            f = pab.a;
        }
        float L0 = e37Var.L0(f);
        lq lqVar = this.P;
        if (lqVar != null) {
            f2 = ((Number) lqVar.e()).floatValue();
        } else {
            f2 = L0;
        }
        int i = (int) f2;
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!(z2 & z3)) {
            nv5.a("width and height must be >= 0");
        }
        mw8 M = w27Var.M(y02.h(i, i, i, i));
        float L02 = e37Var.L0((pab.d - e37Var.B0(L0)) / 2.0f);
        float L03 = e37Var.L0((pab.c - pab.a) - pab.e);
        boolean z4 = this.N;
        if (z4 && this.L) {
            L02 = L03 - e37Var.L0(f5);
        } else if (z4 && !this.L) {
            L02 = e37Var.L0(f5);
        } else if (this.L) {
            L02 = L03;
        }
        lq lqVar2 = this.P;
        if (lqVar2 != null) {
            f3 = (Float) lqVar2.e.getValue();
        } else {
            f3 = null;
        }
        if (f3 == null || f3.floatValue() != L0) {
            z87.v(v1(), null, null, new n7c(this, L0, null, 0), 3);
        }
        lq lqVar3 = this.O;
        if (lqVar3 != null) {
            f4 = (Float) lqVar3.e.getValue();
        } else {
            f4 = null;
        }
        if (f4 == null || f4.floatValue() != L02) {
            z87.v(v1(), null, null, new n7c(this, L02, null, 1), 3);
        }
        if (Float.isNaN(this.R) && Float.isNaN(this.Q)) {
            this.R = L0;
            this.Q = L02;
        }
        return e37Var.q0(i, i, ls3.a, new uh(M, this, L02));
    }

    @Override // defpackage.mq7
    public final boolean w1() {
        return false;
    }

    @Override // defpackage.mq7
    public final void z1() {
        z87.v(v1(), null, null, new ov9(this, (m42) null, 23), 3);
    }
}
