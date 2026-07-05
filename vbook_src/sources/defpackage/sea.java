package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sea  reason: default package */
/* loaded from: classes.dex */
public final class sea extends mq7 implements zj3 {
    public a52 K;
    public vt4 L;
    public p15 M;
    public final ljc N = lre.c();

    public sea(a52 a52Var, vt4 vt4Var) {
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
        BlurMaskFilter blurMaskFilter;
        n61 n61Var = qd6Var.a;
        mea meaVar = (mea) this.L.invoke();
        if (meaVar == null) {
            qd6Var.a();
            return;
        }
        long j = meaVar.b;
        float f = meaVar.a;
        p15 p15Var = this.M;
        if (p15Var != null) {
            long b = n61Var.b();
            tc6 layoutDirection = qd6Var.getLayoutDirection();
            final float L0 = qd6Var.L0(f);
            final float L02 = qd6Var.L0(tg3.a(j));
            final float L03 = qd6Var.L0(tg3.b(j));
            float f2 = 4.0f * L0;
            long ceil = (((int) Math.ceil((Float.intBitsToFloat((int) (b >> 32)) + f2) + L02)) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (b & 4294967295L)) + f2 + L03)) & 4294967295L);
            final kwe a = ((jfa) this.K.g).a(b, layoutDirection, qd6Var);
            long j2 = meaVar.c;
            ljc ljcVar = this.N;
            ljcVar.p(j2);
            float L04 = qd6Var.L0(f);
            Paint paint = (Paint) ljcVar.b;
            if (L04 > nae.e) {
                blurMaskFilter = new BlurMaskFilter(L04, BlurMaskFilter.Blur.NORMAL);
            } else {
                blurMaskFilter = null;
            }
            paint.setMaskFilter(blurMaskFilter);
            p15Var.g(meaVar.d);
            int i = meaVar.e;
            r15 r15Var = p15Var.a;
            if (r15Var.D() != i) {
                r15Var.k(i);
            }
            qd6Var.R(ceil, new xt4() { // from class: rea
                @Override // defpackage.xt4
                public final Object invoke(Object obj) {
                    kwe kweVar = a;
                    sea seaVar = this;
                    ak3 ak3Var = (ak3) obj;
                    ak3Var.getClass();
                    float f3 = L0 * 2.0f;
                    float f4 = L02;
                    float f5 = f3 + f4;
                    float f6 = L03;
                    float f7 = f3 + f6;
                    ((mu9) ak3Var.Q0().b).D(f5, f7);
                    try {
                        k61 w = ak3Var.Q0().w();
                        owe.v(w, kweVar, seaVar.N);
                        w.p(-f4, -f6);
                        owe.v(w, kweVar, qea.a);
                        w.p(f4, f6);
                        ((mu9) ak3Var.Q0().b).D(-f5, -f7);
                        return pvc.a;
                    } catch (Throwable th) {
                        ((mu9) ak3Var.Q0().b).D(-f5, -f7);
                        throw th;
                    }
                }
            }, p15Var);
            float f3 = 2.0f * (-L0);
            ((mu9) n61Var.b.b).D(f3, f3);
            try {
                npe.p(qd6Var, p15Var);
            } finally {
                float f4 = -f3;
                ((mu9) n61Var.b.b).D(f4, f4);
            }
        }
        qd6Var.a();
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
