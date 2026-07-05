package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dw5  reason: default package */
/* loaded from: classes.dex */
public final class dw5 extends vk8 {
    public final lea C;
    public final ij1 D;
    public float E = 1.0f;
    public em1 F;
    public final wea f;

    public dw5(wea weaVar, lea leaVar, ij1 ij1Var) {
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
        ew5 ew5Var;
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
            emVar.e = leaVar;
            tv7 tv7Var = (tv7) ij1Var.c;
            if (tv7Var == null) {
                tv7Var = new tv7();
                ij1Var.c = tv7Var;
            }
            ew5 ew5Var2 = (ew5) tv7Var.g(emVar);
            if (ew5Var2 == null) {
                ew5Var2 = new ew5(leaVar, weaVar.a(b, layoutDirection, ak3Var));
                tv7 tv7Var2 = (tv7) ij1Var.c;
                if (tv7Var2 == null) {
                    tv7Var2 = new tv7();
                    ij1Var.c = tv7Var2;
                }
                tv7Var2.n(em.a(emVar), ew5Var2);
            }
            ew5Var = ew5Var2;
        }
        em1 em1Var = this.F;
        long b2 = ak3Var.b();
        lea leaVar2 = this.C;
        ew5Var.b(ak3Var, em1Var, b2, leaVar2.e, leaVar2.f, dce.m(this.E * leaVar2.g, nae.e, 1.0f), this.C.d);
    }

    @Override // defpackage.vk8
    public final void f(tc6 tc6Var) {
    }
}
