package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fa5  reason: default package */
/* loaded from: classes.dex */
public abstract class fa5 extends mq7 implements rnc, c19, wx1 {
    public vg3 K;
    public lk L;
    public boolean M;

    public fa5(lk lkVar, vg3 vg3Var) {
        this.K = vg3Var;
        this.L = lkVar;
    }

    @Override // defpackage.mq7
    public final void A1() {
        L1();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [zl9, java.lang.Object] */
    public final void H1() {
        lk lkVar;
        ?? obj = new Object();
        dae.F(this, new co9(obj));
        fa5 fa5Var = (fa5) obj.a;
        if (fa5Var == null || (lkVar = fa5Var.L) == null) {
            lkVar = this.L;
        }
        I1(lkVar);
    }

    public abstract void I1(w09 w09Var);

    /* JADX WARN: Type inference failed for: r0v0, types: [vl9, java.lang.Object] */
    public final void J1() {
        ?? obj = new Object();
        obj.a = true;
        dae.H(this, new jc((Object) obj, 22));
        if (obj.a) {
            H1();
        }
    }

    public abstract boolean K1(int i);

    /* JADX WARN: Type inference failed for: r0v3, types: [zl9, java.lang.Object] */
    public final void L1() {
        if (this.M) {
            this.M = false;
            if (this.J) {
                ?? obj = new Object();
                dae.F(this, new jg(1, obj));
                fa5 fa5Var = (fa5) obj.a;
                if (fa5Var != null) {
                    fa5Var.H1();
                } else {
                    I1(null);
                }
            }
        }
    }

    @Override // defpackage.c19
    public final long O() {
        if (this.K != null) {
            r13 r13Var = voe.v(this).V;
            int i = jic.b;
            return h88.r(r13Var.X0(10.0f), r13Var.X0(40.0f), r13Var.X0(10.0f), r13Var.X0(40.0f));
        }
        return jic.a;
    }

    @Override // defpackage.c19
    public final void b0(r09 r09Var, s09 s09Var, long j) {
        if (s09Var == s09.b) {
            List list = r09Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (K1(((z09) list.get(i)).i)) {
                    int i2 = r09Var.f;
                    if (i2 == 4) {
                        this.M = true;
                        J1();
                        return;
                    } else if (i2 == 5) {
                        L1();
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.c19
    public final void n0() {
        L1();
    }
}
