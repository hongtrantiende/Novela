package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t55  reason: default package */
/* loaded from: classes.dex */
public final class t55 extends mq7 implements wx1, fd6, r78 {
    public oyb K;
    public int L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public oyb Q;
    public ctc R;

    @Override // defpackage.f03
    public final void A0() {
        this.Q = uaf.z(this.K, voe.v(this).W);
        this.N = true;
        ube.y(this);
    }

    @Override // defpackage.mq7
    public final void A1() {
        this.Q = null;
        this.R = null;
        this.N = false;
    }

    @Override // defpackage.fd6
    public final int H0(ry6 ry6Var, w27 w27Var, int i) {
        I1(ry6Var);
        int i2 = this.O;
        int i3 = this.P;
        if (i2 == i3) {
            return i3;
        }
        int j = w27Var.j(i);
        int i4 = this.O;
        int i5 = this.P;
        if (j < i4) {
            j = i4;
        }
        if (j > i5) {
            return i5;
        }
        return j;
    }

    public final void H1(e37 e37Var, oyb oybVar, do4 do4Var) {
        dvb dvbVar = urb.b(oybVar, e37Var, do4Var, 3).d;
        float h = dvbVar.h(0);
        float h2 = dvbVar.h(1);
        float h3 = dvbVar.h(2);
        this.O = yqe.s(h, h2, h3, this.L, 1);
        this.P = yqe.s(h, h2, h3, this.M, Integer.MAX_VALUE);
    }

    public final void I1(ry6 ry6Var) {
        int i = 0;
        if (this.N) {
            H1(ry6Var, J1(), (do4) nye.q(this, dy1.k));
            this.N = false;
        }
        int i2 = this.O;
        if (i2 >= 0) {
            i = i2;
        }
        this.O = i;
        int i3 = this.P;
        if (i3 == -1) {
            i3 = Integer.MAX_VALUE;
        }
        this.P = i3;
    }

    public final oyb J1() {
        oyb oybVar = this.Q;
        if (oybVar != null) {
            return oybVar;
        }
        throw hl5.d("Resolved style is not set.");
    }

    @Override // defpackage.fd6
    public final int P0(ry6 ry6Var, w27 w27Var, int i) {
        I1(ry6Var);
        int i2 = this.O;
        if (i2 == this.P) {
            return i2;
        }
        int n0 = w27Var.n0(i);
        int i3 = this.O;
        int i4 = this.P;
        if (n0 < i3) {
            n0 = i3;
        }
        if (n0 > i4) {
            return i4;
        }
        return n0;
    }

    @Override // defpackage.r78
    public final void S0() {
        if (this.R != null) {
            iue.R(this, new s55(this, 1));
        }
        this.N = true;
        ube.y(this);
    }

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        int j2;
        int h;
        if (this.N) {
            H1(e37Var, J1(), (do4) nye.q(this, dy1.k));
            this.N = false;
        }
        int i = this.O;
        if (i != -1) {
            j2 = dce.n(i, x02.j(j), x02.h(j));
        } else {
            j2 = x02.j(j);
        }
        int i2 = j2;
        int i3 = this.P;
        if (i3 != -1) {
            h = dce.n(i3, x02.j(j), x02.h(j));
        } else {
            h = x02.h(j);
        }
        mw8 M = w27Var.M(x02.b(j, 0, 0, i2, h, 3));
        return e37Var.q0(M.a, M.b, ls3.a, new a1(M, 8));
    }

    @Override // defpackage.f03
    public final void p() {
        this.N = true;
        ube.y(this);
    }

    @Override // defpackage.mq7
    public final boolean w1() {
        return false;
    }

    @Override // defpackage.mq7
    public final void z1() {
        int i;
        int i2;
        do4 do4Var = (do4) nye.q(this, dy1.k);
        this.Q = uaf.z(this.K, voe.v(this).W);
        eo4 eo4Var = J1().a.f;
        dq4 dq4Var = J1().a.c;
        if (dq4Var == null) {
            dq4Var = dq4.e;
        }
        wp4 wp4Var = J1().a.d;
        if (wp4Var != null) {
            i = wp4Var.a;
        } else {
            i = 0;
        }
        xp4 xp4Var = J1().a.e;
        if (xp4Var != null) {
            i2 = xp4Var.a;
        } else {
            i2 = 65535;
        }
        this.R = ((go4) do4Var).b(eo4Var, dq4Var, i, i2);
        iue.R(this, new s55(this, 0));
        this.N = true;
    }
}
