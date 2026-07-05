package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uj3  reason: default package */
/* loaded from: classes.dex */
public final class uj3 extends mq7 implements fd6, zj3, hz4, r78 {
    public yf0 K;
    public a52 L;
    public xt4 M;
    public xt4 N;
    public lu4 O;
    public xt4 P;
    public final tj3 Q;
    public p15 R;
    public final sj3 S;
    public final hm8 T;
    public final dm8 U;
    public final sj3 V;
    public final sj3 W;

    public uj3(yf0 yf0Var, a52 a52Var, xt4 xt4Var, xt4 xt4Var2, lu4 lu4Var, xt4 xt4Var3) {
        yf0Var.getClass();
        xt4Var.getClass();
        this.K = yf0Var;
        this.L = a52Var;
        this.M = xt4Var;
        this.N = xt4Var2;
        this.O = lu4Var;
        this.P = xt4Var3;
        this.Q = new tj3(this);
        this.S = new sj3(this, 0);
        this.T = new hm8(null, r0f.J);
        this.U = new dm8(nae.e);
        this.V = new sj3(this, 1);
        this.W = new sj3(this, 2);
    }

    @Override // defpackage.mq7
    public final void A1() {
        m15 t = voe.t(this);
        p15 p15Var = this.R;
        if (p15Var != null) {
            t.a(p15Var);
            this.R = null;
        }
        tj3 tj3Var = this.Q;
        tj3Var.a = 1.0f;
        tj3Var.b = 1.0f;
        tj3Var.c = 9205357640488583168L;
        tj3Var.d = tc6.a;
        tj3Var.e = nae.e;
        tj3Var.f = null;
        tj3Var.C.a.clear();
        this.T.setValue(null);
    }

    public final void H1() {
        if (Build.VERSION.SDK_INT >= 31) {
            xt4 xt4Var = this.M;
            tj3 tj3Var = this.Q;
            tj3Var.getClass();
            xt4Var.getClass();
            tj3Var.e = nae.e;
            tj3Var.f = null;
            xt4Var.invoke(tj3Var);
            p15 p15Var = this.R;
            if (p15Var != null) {
                c3e c3eVar = tj3Var.f;
                r15 r15Var = p15Var.a;
                if (!c16.i(r15Var.E(), c3eVar)) {
                    r15Var.r(c3eVar);
                }
            }
            this.U.i(tj3Var.e);
        }
    }

    @Override // defpackage.r78
    public final void S0() {
        iue.R(this, new t42(this, 12));
    }

    @Override // defpackage.zj3
    public final void V0(qd6 qd6Var) {
        boolean z;
        tj3 tj3Var = this.Q;
        tj3Var.getClass();
        n61 n61Var = qd6Var.a;
        float f = n61Var.f();
        float G0 = n61Var.G0();
        long b = n61Var.b();
        tc6 layoutDirection = qd6Var.getLayoutDirection();
        if (f == tj3Var.a && G0 == tj3Var.b && dna.a(b, tj3Var.c) && layoutDirection == tj3Var.d) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            tj3Var.a = f;
            tj3Var.b = G0;
            tj3Var.c = b;
            layoutDirection.getClass();
            tj3Var.d = layoutDirection;
        }
        if (z) {
            H1();
        }
        this.W.invoke(qd6Var);
        xt4 xt4Var = this.P;
        if (xt4Var != null) {
            xt4Var.invoke(qd6Var);
        }
        qd6Var.a();
    }

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        w27Var.getClass();
        mw8 M = w27Var.M(j);
        return e37Var.q0(M.a, M.b, ls3.a, new qk2(23, M, this));
    }

    @Override // defpackage.hz4
    public final void t(i38 i38Var) {
        if (i38Var.E1().J) {
            boolean a = this.K.a();
            hm8 hm8Var = this.T;
            if (a) {
                hm8Var.setValue(i38Var);
            } else if (((sc6) hm8Var.getValue()) != null) {
                hm8Var.setValue(null);
            }
        }
    }

    @Override // defpackage.mq7
    public final void z1() {
        this.R = voe.t(this).c();
        iue.R(this, new t42(this, 12));
    }
}
