package defpackage;

import android.view.View;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vz6  reason: default package */
/* loaded from: classes.dex */
public final class vz6 extends uq7 {
    public final long C;
    public final float D;
    public final float E;
    public final boolean F;
    public final ix8 G;
    public final xt4 b;
    public final xt4 c;
    public final xt4 d;
    public final float e;
    public final boolean f;

    public vz6(xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, float f, boolean z, long j, float f2, float f3, boolean z2, ix8 ix8Var) {
        this.b = xt4Var;
        this.c = xt4Var2;
        this.d = xt4Var3;
        this.e = f;
        this.f = z;
        this.C = j;
        this.D = f2;
        this.E = f3;
        this.F = z2;
        this.G = ix8Var;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new xz6(this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.b, "sourceCenter");
        c00Var.b(this.c, "magnifierCenter");
        c00Var.b(Float.valueOf(this.e), "zoom");
        c00Var.b(new ug3(this.C), "size");
        c00Var.b(new rg3(this.D), "cornerRadius");
        c00Var.b(new rg3(this.E), "elevation");
        c00Var.b(Boolean.valueOf(this.F), "clippingEnabled");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        xz6 xz6Var = (xz6) mq7Var;
        float f = xz6Var.N;
        long j = xz6Var.P;
        float f2 = xz6Var.Q;
        boolean z = xz6Var.O;
        float f3 = xz6Var.R;
        boolean z2 = xz6Var.S;
        ix8 ix8Var = xz6Var.T;
        View view = xz6Var.U;
        r13 r13Var = xz6Var.V;
        xz6Var.K = this.b;
        xz6Var.L = this.c;
        float f4 = this.e;
        xz6Var.N = f4;
        boolean z3 = this.f;
        xz6Var.O = z3;
        long j2 = this.C;
        xz6Var.P = j2;
        float f5 = this.D;
        xz6Var.Q = f5;
        float f6 = this.E;
        xz6Var.R = f6;
        boolean z4 = this.F;
        xz6Var.S = z4;
        xz6Var.M = this.d;
        ix8 ix8Var2 = this.G;
        xz6Var.T = ix8Var2;
        View o = xoe.o(xz6Var);
        r13 r13Var2 = voe.v(xz6Var).V;
        if (xz6Var.W != null) {
            k8a k8aVar = yz6.a;
            if (((!Float.isNaN(f4) || !Float.isNaN(f)) && f4 != f && !ix8Var2.b()) || j2 != j || !rg3.b(f5, f2) || !rg3.b(f6, f3) || z3 != z || z4 != z2 || !ix8Var2.equals(ix8Var) || !o.equals(view) || !c16.i(r13Var2, r13Var)) {
                xz6Var.I1();
            }
        }
        xz6Var.J1();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vz6) {
                vz6 vz6Var = (vz6) obj;
                if (this.b == vz6Var.b && this.c == vz6Var.c && this.e == vz6Var.e && this.f == vz6Var.f && this.C == vz6Var.C && rg3.b(this.D, vz6Var.D) && rg3.b(this.E, vz6Var.E) && this.F == vz6Var.F && this.d == vz6Var.d && this.G.equals(vz6Var.G)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.b.hashCode() * 31;
        int i2 = 0;
        xt4 xt4Var = this.c;
        if (xt4Var != null) {
            i = xt4Var.hashCode();
        } else {
            i = 0;
        }
        int k = eub.k(nk2.d(this.E, nk2.d(this.D, hl5.c(eub.k(nk2.d(this.e, (hashCode + i) * 31, 31), 31, this.f), this.C, 31), 31), 31), 31, this.F);
        xt4 xt4Var2 = this.d;
        if (xt4Var2 != null) {
            i2 = xt4Var2.hashCode();
        }
        return this.G.hashCode() + ((k + i2) * 31);
    }
}
