package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kl3  reason: default package */
/* loaded from: classes.dex */
public final class kl3 extends vk8 {
    public final lea C;
    public final ij1 D;
    public float E = 1.0f;
    public em1 F;
    public final wea f;

    public kl3(wea weaVar, lea leaVar, ij1 ij1Var) {
        this.f = weaVar;
        this.C = leaVar;
        this.D = ij1Var;
    }

    @Override // defpackage.vk8
    public final boolean d(float f) {
        this.E = f;
        return true;
    }

    @Override // defpackage.vk8
    public final boolean e(em1 em1Var) {
        this.F = em1Var;
        return true;
    }

    @Override // defpackage.vk8
    public final long h() {
        return 9205357640488583168L;
    }

    @Override // defpackage.vk8
    public final void i(ak3 ak3Var) {
        ll3 ll3Var;
        ij1 ij1Var = this.D;
        wea weaVar = this.f;
        long b = ak3Var.b();
        tc6 layoutDirection = ak3Var.getLayoutDirection();
        lea leaVar = this.C;
        synchronized (ij1Var) {
            em emVar = (em) ij1Var.d;
            if (emVar == null) {
                em emVar2 = new em(lre.g, 0L, tc6.a, 1.0f, null);
                ij1Var.d = emVar2;
                emVar = emVar2;
            }
            emVar.a = weaVar;
            emVar.b = b;
            emVar.c = layoutDirection;
            emVar.d = ak3Var.f();
            emVar.e = new lea(leaVar.a, leaVar.b, 0L, leaVar.e, leaVar.f, leaVar.g, leaVar.d);
            tv7 tv7Var = (tv7) ij1Var.b;
            if (tv7Var == null) {
                tv7Var = new tv7();
                ij1Var.b = tv7Var;
            }
            ll3Var = (ll3) tv7Var.g(emVar);
            if (ll3Var == null) {
                ll3Var = new ll3(leaVar, weaVar.a(b, layoutDirection, ak3Var));
                tv7 tv7Var2 = (tv7) ij1Var.b;
                if (tv7Var2 == null) {
                    tv7Var2 = new tv7();
                    ij1Var.b = tv7Var2;
                }
                tv7Var2.n(em.a(emVar), ll3Var);
            }
        }
        float L0 = ak3Var.L0(tg3.a(this.C.c));
        float L02 = ak3Var.L0(tg3.b(this.C.c));
        ((mu9) ak3Var.Q0().b).D(L0, L02);
        try {
            em1 em1Var = this.F;
            long b2 = ak3Var.b();
            lea leaVar2 = ll3Var.i;
            ll3Var.b(ak3Var, em1Var, b2, leaVar2.e, leaVar2.f, dce.m(this.E * leaVar2.g, nae.e, 1.0f), ll3Var.i.d);
        } finally {
            ((mu9) ak3Var.Q0().b).D(-L0, -L02);
        }
    }
}
