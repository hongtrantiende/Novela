package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cw5  reason: default package */
/* loaded from: classes.dex */
public final class cw5 extends mq7 implements zj3 {
    public a52 K;
    public vt4 L;
    public p15 M;
    public yj O;
    public final ljc N = lre.c();
    public float P = Float.NaN;

    public cw5(a52 a52Var, vt4 vt4Var) {
        this.K = a52Var;
        this.L = vt4Var;
    }

    @Override // defpackage.mq7
    public final void A1() {
        m15 t = voe.t(this);
        p15 p15Var = this.M;
        if (p15Var != null) {
            t.a(p15Var);
            this.M = null;
        }
    }

    @Override // defpackage.zj3
    public final void V0(qd6 qd6Var) {
        yv5 yv5Var;
        yj yjVar;
        n61 n61Var = qd6Var.a;
        qd6Var.a();
        if (Build.VERSION.SDK_INT >= 31 && (yv5Var = (yv5) this.L.invoke()) != null) {
            long j = yv5Var.b;
            p15 p15Var = this.M;
            if (p15Var != null) {
                r15 r15Var = p15Var.a;
                long b = n61Var.b();
                tc6 layoutDirection = qd6Var.getLayoutDirection();
                float L0 = qd6Var.L0(yv5Var.a);
                final float L02 = qd6Var.L0(tg3.a(j));
                final float L03 = qd6Var.L0(tg3.b(j));
                final kwe a = ((jfa) this.K.g).a(b, layoutDirection, qd6Var);
                tn0 tn0Var = null;
                if (a instanceof uf8) {
                    yjVar = this.O;
                    if (yjVar == null) {
                        yjVar = dk.a();
                        this.O = yjVar;
                    }
                } else {
                    yjVar = null;
                }
                this.N.p(yv5Var.c);
                p15Var.g(yv5Var.d);
                int i = yv5Var.e;
                if (r15Var.D() != i) {
                    r15Var.k(i);
                }
                if (this.P != L0) {
                    if (L0 > nae.e) {
                        tn0Var = new tn0(null, L0, L0, 3);
                    }
                    if (!c16.i(r15Var.E(), tn0Var)) {
                        r15Var.r(tn0Var);
                    }
                    this.P = L0;
                }
                final yj yjVar2 = yjVar;
                ak3.c1(qd6Var, p15Var, new xt4() { // from class: bw5
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj) {
                        ak3 ak3Var = (ak3) obj;
                        ak3Var.getClass();
                        k61 w = ak3Var.Q0().w();
                        w.i();
                        kwe kweVar = kwe.this;
                        mwe.i(w, kweVar, yjVar2);
                        owe.v(w, kweVar, this.N);
                        float f = L02;
                        float f2 = L03;
                        w.p(f, f2);
                        owe.v(w, kweVar, aw5.a);
                        w.p(-f, -f2);
                        w.q();
                        return pvc.a;
                    }
                });
                k61 w = n61Var.b.w();
                w.i();
                mwe.i(w, a, yjVar2);
                npe.p(qd6Var, p15Var);
                w.q();
            }
        }
    }

    @Override // defpackage.mq7
    public final boolean w1() {
        return false;
    }

    @Override // defpackage.mq7
    public final void z1() {
        p15 c = voe.t(this).c();
        c.h(1);
        this.M = c;
    }
}
