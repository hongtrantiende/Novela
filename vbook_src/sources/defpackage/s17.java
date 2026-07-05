package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s17  reason: default package */
/* loaded from: classes.dex */
public final class s17 extends mq7 implements fd6, zj3, fm4 {
    public int K;
    public float L;
    public w26 P;
    public p15 Q;
    public final hm8 R;
    public final h23 U;
    public final em8 M = new em8(0);
    public final em8 N = new em8(0);
    public final hm8 O = yae.z(Boolean.FALSE);
    public final hm8 S = yae.z(new Object());
    public final lq T = tc4.a(nae.e, 0.01f);

    public s17(int i, xk5 xk5Var, float f) {
        this.K = i;
        this.L = f;
        this.R = yae.z(xk5Var);
        this.U = yae.q(new mf6(7, xk5Var, this));
    }

    @Override // defpackage.mq7
    public final void A1() {
        w26 w26Var = this.P;
        if (w26Var != null) {
            w26Var.cancel(null);
        }
        this.P = null;
        p15 p15Var = this.Q;
        if (p15Var != null) {
            voe.t(this).a(p15Var);
            this.Q = null;
        }
    }

    @Override // defpackage.fd6
    public final int H0(ry6 ry6Var, w27 w27Var, int i) {
        return w27Var.j(Integer.MAX_VALUE);
    }

    public final int H1() {
        return ((Number) this.U.getValue()).intValue();
    }

    public final void I1() {
        w26 w26Var = this.P;
        if (w26Var != null) {
            w26Var.cancel(null);
        }
        if (this.J) {
            this.P = z87.v(v1(), null, null, new c95(w26Var, this, (m42) null, 19), 3);
        }
    }

    @Override // defpackage.fd6
    public final int P0(ry6 ry6Var, w27 w27Var, int i) {
        return w27Var.n0(Integer.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0156  */
    @Override // defpackage.zj3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V0(defpackage.qd6 r24) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s17.V0(qd6):void");
    }

    @Override // defpackage.fd6
    public final int a1(ry6 ry6Var, w27 w27Var, int i) {
        return 0;
    }

    @Override // defpackage.fm4
    public final void h0(dn4 dn4Var) {
        this.O.setValue(Boolean.valueOf(dn4Var.a()));
    }

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        mw8 M = w27Var.M(x02.b(j, 0, Integer.MAX_VALUE, 0, 0, 13));
        int g = y02.g(M.a, j);
        em8 em8Var = this.N;
        em8Var.i(g);
        this.M.i(M.a);
        return e37Var.q0(em8Var.h(), M.b, ls3.a, new a1(M, 11));
    }

    @Override // defpackage.fd6
    public final int z(ry6 ry6Var, w27 w27Var, int i) {
        return w27Var.J(i);
    }

    @Override // defpackage.mq7
    public final void z1() {
        p15 p15Var = this.Q;
        m15 t = voe.t(this);
        if (p15Var != null) {
            t.a(p15Var);
        }
        this.Q = t.c();
        I1();
    }
}
