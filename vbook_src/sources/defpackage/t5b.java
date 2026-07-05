package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t5b  reason: default package */
/* loaded from: classes.dex */
public final class t5b extends mq7 implements fd6 {
    public w5b K;

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        float f;
        float f2;
        float f3;
        float f4;
        w5b w5bVar = this.K;
        w5bVar.getClass();
        x5b M1 = w5b.M1(w5bVar, 1);
        boolean v = M1.v((byte) 8);
        float f5 = nae.e;
        if (v) {
            f = M1.k;
        } else {
            f = 0.0f;
        }
        if (M1.v((byte) 0)) {
            f2 = M1.c;
        } else {
            f2 = 0.0f;
        }
        float f6 = f2 + f;
        if (M1.v((byte) 1)) {
            f3 = M1.d;
        } else {
            f3 = 0.0f;
        }
        float f7 = f3 + f;
        if (M1.v((byte) 2)) {
            f4 = M1.e;
        } else {
            f4 = 0.0f;
        }
        float f8 = f4 + f;
        if (M1.v((byte) 3)) {
            f5 = M1.f;
        }
        int round = Math.round(f7 + f6);
        int round2 = Math.round(f5 + f + f8);
        mw8 M = w27Var.M(y02.i(-round, j, -round2));
        return e37Var.q0(y02.g(M.a + round, j), y02.f(M.b + round2, j), ls3.a, new qd0(f6, f8, 1, M));
    }

    @Override // defpackage.mq7
    public final boolean w1() {
        return false;
    }

    @Override // defpackage.mq7
    public final void z1() {
        rnc l = dae.l(this, "StyleOuterNode");
        l.getClass();
        w5b w5bVar = (w5b) l;
        w5bVar.M = this;
        this.K = w5bVar;
        w5bVar.N1(true);
    }
}
