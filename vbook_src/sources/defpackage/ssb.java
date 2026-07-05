package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ssb  reason: default package */
/* loaded from: classes.dex */
public final class ssb extends qsb implements wx1 {
    public mkc M;
    public ytb N;
    public hvb O;
    public boolean P;
    public final hm8 Q;
    public final lq R;
    public final xz6 S;
    public iya T;

    public ssb(mkc mkcVar, ytb ytbVar, hvb hvbVar, boolean z) {
        ix8 ix8Var;
        this.M = mkcVar;
        this.N = ytbVar;
        this.O = hvbVar;
        this.P = z;
        hm8 z2 = yae.z(new zy5(0L));
        this.Q = z2;
        this.R = new lq(new y78(jxe.n(this.M, this.N, this.O, ((zy5) z2.getValue()).a)), d7a.b, new y78(d7a.c), 8);
        xt4 xt4Var = new xt4(this) { // from class: rsb
            public final /* synthetic */ ssb b;

            {
                this.b = this;
            }

            @Override // defpackage.xt4
            public final Object invoke(Object obj) {
                int i = r2;
                ssb ssbVar = this.b;
                switch (i) {
                    case 0:
                        r13 r13Var = (r13) obj;
                        return (y78) ssbVar.R.e();
                    default:
                        ug3 ug3Var = (ug3) obj;
                        r13 r13Var2 = (r13) nye.q(ssbVar, dy1.h);
                        ssbVar.Q.setValue(new zy5((r13Var2.X0(ug3.b(ug3Var.a)) << 32) | (r13Var2.X0(ug3.a(ug3Var.a)) & 4294967295L)));
                        return pvc.a;
                }
            }
        };
        xt4 xt4Var2 = new xt4(this) { // from class: rsb
            public final /* synthetic */ ssb b;

            {
                this.b = this;
            }

            @Override // defpackage.xt4
            public final Object invoke(Object obj) {
                int i = r2;
                ssb ssbVar = this.b;
                switch (i) {
                    case 0:
                        r13 r13Var = (r13) obj;
                        return (y78) ssbVar.R.e();
                    default:
                        ug3 ug3Var = (ug3) obj;
                        r13 r13Var2 = (r13) nye.q(ssbVar, dy1.h);
                        ssbVar.Q.setValue(new zy5((r13Var2.X0(ug3.b(ug3Var.a)) << 32) | (r13Var2.X0(ug3.a(ug3Var.a)) & 4294967295L)));
                        return pvc.a;
                }
            }
        };
        if (yz6.a()) {
            if (Build.VERSION.SDK_INT == 28) {
                ix8Var = nc6.b;
            } else {
                ix8Var = lx8.a;
            }
            xz6 xz6Var = new xz6(xt4Var, null, xt4Var2, Float.NaN, true, 9205357640488583168L, Float.NaN, Float.NaN, true, ix8Var);
            H1(xz6Var);
            this.S = xz6Var;
            return;
        }
        xk5.q("Magnifier is only supported on API level 28 and higher.");
        throw null;
    }

    @Override // defpackage.qsb
    public final void K1(mkc mkcVar, ytb ytbVar, hvb hvbVar, boolean z) {
        mkc mkcVar2 = this.M;
        ytb ytbVar2 = this.N;
        hvb hvbVar2 = this.O;
        boolean z2 = this.P;
        this.M = mkcVar;
        this.N = ytbVar;
        this.O = hvbVar;
        this.P = z;
        if (c16.i(mkcVar, mkcVar2) && ytbVar == ytbVar2 && c16.i(hvbVar, hvbVar2) && z == z2) {
            return;
        }
        L1();
    }

    public final void L1() {
        iya iyaVar = this.T;
        if (iyaVar != null) {
            iyaVar.cancel(null);
        }
        this.T = null;
        if (!yz6.a()) {
            return;
        }
        if (!this.P && (((y78) this.R.e()).a & 9223372034707292159L) != 9205357640488583168L) {
            z87.v(v1(), null, p82.d, new ov9(this, (m42) null, 16), 1);
        }
        this.T = z87.v(v1(), null, null, new koa(this, null, 20), 3);
    }

    @Override // defpackage.qsb, defpackage.zj3
    public final void V0(qd6 qd6Var) {
        qd6Var.a();
        this.S.V0(qd6Var);
    }

    @Override // defpackage.qsb, defpackage.z7a
    public final void m1(l8a l8aVar) {
        this.S.m1(l8aVar);
    }

    @Override // defpackage.qsb, defpackage.xb8
    public final void t(i38 i38Var) {
        this.S.t(i38Var);
    }

    @Override // defpackage.mq7
    public final void z1() {
        L1();
    }
}
