package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.RuntimeShader;
import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f65  reason: default package */
/* loaded from: classes.dex */
public final class f65 extends mq7 implements zj3 {
    public a52 K;
    public vt4 L;
    public p15 M;
    public final ljc N;
    public yj O;
    public final sf2 P;

    public f65(a52 a52Var, vt4 vt4Var) {
        this.K = a52Var;
        this.L = vt4Var;
        ljc c = lre.c();
        c.x(1);
        this.N = c;
        this.P = new sf2(1);
    }

    @Override // defpackage.mq7
    public final void A1() {
        m15 t = voe.t(this);
        p15 p15Var = this.M;
        if (p15Var != null) {
            t.a(p15Var);
            this.M = null;
        }
        this.O = null;
        this.P.a.clear();
    }

    @Override // defpackage.zj3
    public final void V0(qd6 qd6Var) {
        yj yjVar;
        BlurMaskFilter blurMaskFilter;
        RuntimeShader runtimeShader;
        n61 n61Var = qd6Var.a;
        c65 c65Var = (c65) this.L.invoke();
        if (c65Var != null) {
            float f = c65Var.a;
            l65 l65Var = c65Var.d;
            if (f > nae.e) {
                qd6Var.a();
                p15 p15Var = this.M;
                if (p15Var != null) {
                    long b = n61Var.b();
                    tc6 layoutDirection = qd6Var.getLayoutDirection();
                    long ceil = ((((int) Math.ceil(Float.intBitsToFloat((int) (b >> 32)))) + 2) << 32) | ((((int) Math.ceil(Float.intBitsToFloat((int) (b & 4294967295L)))) + 2) & 4294967295L);
                    kwe a = ((jfa) this.K.g).a(b, layoutDirection, qd6Var);
                    if (a instanceof uf8) {
                        yjVar = this.O;
                        if (yjVar == null) {
                            yjVar = dk.a();
                            this.O = yjVar;
                        }
                    } else {
                        yjVar = null;
                    }
                    long a2 = l65Var.a();
                    ljc ljcVar = this.N;
                    ljcVar.p(a2);
                    Paint paint = (Paint) ljcVar.b;
                    float L0 = qd6Var.L0(f);
                    float c = dna.c(n61Var.b()) / 2.0f;
                    if (L0 > c) {
                        L0 = c;
                    }
                    ljcVar.w(((float) Math.ceil(L0)) * 2.0f);
                    float L02 = qd6Var.L0(c65Var.b);
                    if (L02 > nae.e) {
                        blurMaskFilter = new BlurMaskFilter(L02, BlurMaskFilter.Blur.NORMAL);
                    } else {
                        blurMaskFilter = null;
                    }
                    paint.setMaskFilter(blurMaskFilter);
                    if (Build.VERSION.SDK_INT >= 33) {
                        sv9 b2 = l65Var.b(qd6Var, (jfa) this.K.g, this.P);
                        if (b2 != null) {
                            runtimeShader = ((sl) b2).a;
                        } else {
                            runtimeShader = null;
                        }
                        paint.setShader(runtimeShader);
                    }
                    p15Var.g(c65Var.c);
                    int D = l65Var.D();
                    r15 r15Var = p15Var.a;
                    if (r15Var.D() != D) {
                        r15Var.k(D);
                    }
                    qd6Var.R(ceil, new nq3(5, a, yjVar, this), p15Var);
                    ((mu9) n61Var.b.b).D(-1.0f, -1.0f);
                    try {
                        npe.p(qd6Var, p15Var);
                        return;
                    } finally {
                        ((mu9) n61Var.b.b).D(1.0f, 1.0f);
                    }
                }
                return;
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
        this.M = voe.t(this).c();
    }
}
