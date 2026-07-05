package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bub  reason: default package */
/* loaded from: classes.dex */
public final class bub extends mq7 implements wx1, fd6 {
    public final oyb K;
    public ctc L;
    public a52 M;

    public bub(oyb oybVar) {
        this.K = oybVar;
    }

    @Override // defpackage.f03
    public final void A0() {
        a52 a52Var = this.M;
        if (a52Var != null) {
            a52.f(a52Var, voe.v(this).W, null, null, 30);
        }
        ube.y(this);
    }

    @Override // defpackage.mq7
    public final void A1() {
        this.L = null;
        this.M = null;
    }

    public final void H1(oyb oybVar, do4 do4Var) {
        int i;
        int i2;
        uva uvaVar = oybVar.a;
        eo4 eo4Var = uvaVar.f;
        dq4 dq4Var = uvaVar.c;
        if (dq4Var == null) {
            dq4Var = dq4.e;
        }
        wp4 wp4Var = uvaVar.d;
        if (wp4Var != null) {
            i = wp4Var.a;
        } else {
            i = 0;
        }
        xp4 xp4Var = uvaVar.e;
        if (xp4Var != null) {
            i2 = xp4Var.a;
        } else {
            i2 = 65535;
        }
        this.L = ((go4) do4Var).b(eo4Var, dq4Var, i, i2);
        ube.y(this);
    }

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        a52 a52Var = this.M;
        if (a52Var != null) {
            hm8 hm8Var = (hm8) a52Var.g;
            ctc ctcVar = this.L;
            if (ctcVar != null) {
                Object value = ctcVar.getValue();
                if (!c16.i(value, a52Var.f)) {
                    a52Var.f = value;
                    hm8Var.setValue(Boolean.TRUE);
                }
                if (((Boolean) hm8Var.getValue()).booleanValue()) {
                    a52Var.a = urb.a((oyb) a52Var.e, (r13) a52Var.c, (do4) a52Var.d);
                    hm8Var.setValue(Boolean.FALSE);
                }
                long j2 = a52Var.a;
                mw8 M = w27Var.M(y02.e(j, y02.b((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
                return e37Var.q0(M.a, M.b, ls3.a, new a1(M, 17));
            }
            throw hl5.d("Font resolution state is not set.");
        }
        throw hl5.d("Min size state is not set.");
    }

    @Override // defpackage.f03
    public final void p() {
        a52 a52Var = this.M;
        if (a52Var != null) {
            a52.f(a52Var, null, voe.v(this).V, null, 29);
        }
        ube.y(this);
    }

    @Override // defpackage.mq7
    public final boolean w1() {
        return false;
    }

    @Override // defpackage.mq7
    public final void z1() {
        oyb z = uaf.z(this.K, voe.v(this).W);
        do4 do4Var = (do4) nye.q(this, dy1.k);
        H1(z, do4Var);
        tc6 tc6Var = voe.v(this).W;
        r13 r13Var = voe.v(this).V;
        ctc ctcVar = this.L;
        if (ctcVar != null) {
            this.M = new a52(tc6Var, r13Var, do4Var, z, ctcVar.getValue());
            return;
        }
        throw hl5.d("Font resolution state is not set.");
    }
}
