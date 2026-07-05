package defpackage;

import android.view.View;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xz6  reason: default package */
/* loaded from: classes.dex */
public final class xz6 extends mq7 implements hz4, zj3, z7a, r78 {
    public xt4 K;
    public xt4 L;
    public xt4 M;
    public float N;
    public boolean O;
    public long P;
    public float Q;
    public float R;
    public boolean S;
    public ix8 T;
    public View U;
    public r13 V;
    public hx8 W;
    public h23 Y;
    public zy5 a0;
    public xy0 b0;
    public final hm8 X = new hm8(null, r0f.J);
    public long Z = 9205357640488583168L;

    public xz6(xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, float f, boolean z, long j, float f2, float f3, boolean z2, ix8 ix8Var) {
        this.K = xt4Var;
        this.L = xt4Var2;
        this.M = xt4Var3;
        this.N = f;
        this.O = z;
        this.P = j;
        this.Q = f2;
        this.R = f3;
        this.S = z2;
        this.T = ix8Var;
    }

    @Override // defpackage.mq7
    public final void A1() {
        hx8 hx8Var = this.W;
        if (hx8Var != null) {
            ((jx8) hx8Var).b();
        }
        this.W = null;
    }

    public final long H1() {
        if (this.Y == null) {
            this.Y = yae.q(new wz6(this, 2));
        }
        h23 h23Var = this.Y;
        if (h23Var != null) {
            return ((y78) h23Var.getValue()).a;
        }
        return 9205357640488583168L;
    }

    public final void I1() {
        hx8 hx8Var = this.W;
        if (hx8Var != null) {
            ((jx8) hx8Var).b();
        }
        View view = this.U;
        if (view == null) {
            view = xoe.o(this);
        }
        View view2 = view;
        this.U = view2;
        r13 r13Var = this.V;
        if (r13Var == null) {
            r13Var = voe.v(this).V;
        }
        r13 r13Var2 = r13Var;
        this.V = r13Var2;
        this.W = this.T.c(view2, this.O, this.P, this.Q, this.R, this.S, r13Var2, this.N);
        K1();
    }

    public final void J1() {
        r13 r13Var = this.V;
        if (r13Var == null) {
            r13Var = voe.v(this).V;
            this.V = r13Var;
        }
        long j = ((y78) this.K.invoke(r13Var)).a;
        long j2 = 9205357640488583168L;
        if ((j & 9223372034707292159L) != 9205357640488583168L && (H1() & 9223372034707292159L) != 9205357640488583168L) {
            this.Z = y78.j(H1(), j);
            xt4 xt4Var = this.L;
            if (xt4Var != null) {
                long j3 = ((y78) xt4Var.invoke(r13Var)).a;
                y78 y78Var = new y78(j3);
                if ((j3 & 9223372034707292159L) == 9205357640488583168L) {
                    y78Var = null;
                }
                if (y78Var != null) {
                    j2 = y78.j(H1(), y78Var.a);
                }
            }
            long j4 = j2;
            if (this.W == null) {
                I1();
            }
            hx8 hx8Var = this.W;
            if (hx8Var != null) {
                hx8Var.a(this.N, this.Z, j4);
            }
            K1();
            return;
        }
        this.Z = 9205357640488583168L;
        hx8 hx8Var2 = this.W;
        if (hx8Var2 != null) {
            ((jx8) hx8Var2).b();
        }
    }

    public final void K1() {
        r13 r13Var;
        hx8 hx8Var = this.W;
        if (hx8Var != null && (r13Var = this.V) != null) {
            jx8 jx8Var = (jx8) hx8Var;
            if (!zy5.a(this.a0, jx8Var.c())) {
                xt4 xt4Var = this.M;
                if (xt4Var != null) {
                    xt4Var.invoke(new ug3(r13Var.Q(eg0.A(jx8Var.c()))));
                }
                this.a0 = new zy5(jx8Var.c());
            }
        }
    }

    @Override // defpackage.r78
    public final void S0() {
        iue.R(this, new wz6(this, 0));
    }

    @Override // defpackage.zj3
    public final void V0(qd6 qd6Var) {
        qd6Var.a();
        xy0 xy0Var = this.b0;
        if (xy0Var != null) {
            xy0Var.j(pvc.a);
        }
    }

    @Override // defpackage.z7a
    public final void m1(l8a l8aVar) {
        l8aVar.a(yz6.a, new wz6(this, 1));
    }

    @Override // defpackage.hz4
    public final void t(i38 i38Var) {
        this.X.setValue(i38Var);
    }

    @Override // defpackage.mq7
    public final void z1() {
        S0();
        this.b0 = xpe.a(0, 7, null);
        z87.v(v1(), null, p82.d, new o54(this, (m42) null, 18), 1);
    }
}
