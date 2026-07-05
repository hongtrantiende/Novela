package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rha  reason: default package */
/* loaded from: classes.dex */
public final class rha extends mq7 implements fd6, r78, zj3, wx1 {
    public lha K;

    @Override // defpackage.mq7
    public final void A1() {
        this.K.getClass();
    }

    @Override // defpackage.r78
    public final void S0() {
        this.K.f();
        iue.R(this, this.K.d);
    }

    @Override // defpackage.zj3
    public final void V0(qd6 qd6Var) {
        rk9 c;
        m15 m15Var;
        ij1 ij1Var;
        qd6Var.a();
        lha lhaVar = this.K;
        m15 t = voe.t(this);
        n61 n61Var = qd6Var.a;
        hm8 hm8Var = lhaVar.C;
        List u0 = sl1.u0((List) hm8Var.getValue(), kn4.c);
        int size = u0.size();
        int i = 0;
        while (i < size) {
            kga kgaVar = (kga) u0.get(i);
            boolean g = kgaVar.g();
            hm8 hm8Var2 = kgaVar.I;
            if (g && ((p15) hm8Var2.getValue()) == null) {
                hm8Var2.setValue(t.c());
            }
            p15 p15Var = (p15) hm8Var2.getValue();
            if (p15Var == null || (c = kgaVar.e().c.d().c()) == null || !kgaVar.g()) {
                m15Var = t;
            } else {
                long j = c.j();
                float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                yj yjVar = kgaVar.F;
                if (yjVar != null) {
                    ij1 ij1Var2 = n61Var.b;
                    ij1Var = n61Var.b;
                    long G = ij1Var2.G();
                    ij1Var2.w().i();
                    try {
                        m15Var = t;
                        ((ij1) ((mu9) ij1Var2.b).a).w().f(yjVar, 1);
                        ((mu9) ij1Var.b).D(intBitsToFloat, intBitsToFloat2);
                        npe.p(qd6Var, p15Var);
                    } finally {
                        rs8.r(ij1Var2, G);
                    }
                } else {
                    m15Var = t;
                    ij1 ij1Var3 = n61Var.b;
                    ij1Var = n61Var.b;
                    ((mu9) ij1Var3.b).D(intBitsToFloat, intBitsToFloat2);
                    try {
                        npe.p(qd6Var, p15Var);
                    } finally {
                        ((mu9) ij1Var.b).D(-intBitsToFloat, -intBitsToFloat2);
                    }
                }
            }
            i++;
            t = m15Var;
        }
        hm8Var.setValue(u0);
    }

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        mw8 M = w27Var.M(j);
        return e37Var.q0(M.a, M.b, ls3.a, new gp(9, e37Var, this, M));
    }

    @Override // defpackage.mq7
    public final void z1() {
        iue.R(this, this.K.d);
        this.K.getClass();
    }
}
