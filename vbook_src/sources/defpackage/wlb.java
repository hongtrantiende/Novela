package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wlb  reason: default package */
/* loaded from: classes.dex */
public final class wlb extends uq7 {
    public final boolean C;
    public final int D;
    public final int E;
    public final List F;
    public final xt4 G;
    public final qa0 H;
    public final xt4 I;
    public final ps b;
    public final oyb c;
    public final do4 d;
    public final xt4 e;
    public final int f;

    public wlb(ps psVar, oyb oybVar, do4 do4Var, xt4 xt4Var, int i, boolean z, int i2, int i3, List list, xt4 xt4Var2, qa0 qa0Var, xt4 xt4Var3) {
        this.b = psVar;
        this.c = oybVar;
        this.d = do4Var;
        this.e = xt4Var;
        this.f = i;
        this.C = z;
        this.D = i2;
        this.E = i3;
        this.F = list;
        this.G = xt4Var2;
        this.H = qa0Var;
        this.I = xt4Var3;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new zlb(this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, null, this.H, this.I);
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        boolean z;
        zlb zlbVar = (zlb) mq7Var;
        oyb oybVar = zlbVar.L;
        oyb oybVar2 = this.c;
        if (oybVar2 != oybVar) {
            if (!oybVar2.a.c(oybVar.a)) {
                z = true;
                zlbVar.H1(z, zlbVar.M1(this.b), zlbVar.L1(this.c, this.F, this.E, this.D, this.C, this.d, this.f, this.H), zlbVar.K1(this.e, this.G, null, this.I));
            }
        } else {
            oybVar2.getClass();
        }
        z = false;
        zlbVar.H1(z, zlbVar.M1(this.b), zlbVar.L1(this.c, this.F, this.E, this.D, this.C, this.d, this.f, this.H), zlbVar.K1(this.e, this.G, null, this.I));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wlb) {
                wlb wlbVar = (wlb) obj;
                if (c16.i(this.b, wlbVar.b) && c16.i(this.c, wlbVar.c) && c16.i(this.F, wlbVar.F) && c16.i(this.d, wlbVar.d) && this.e == wlbVar.e && this.I == wlbVar.I && this.f == wlbVar.f && this.C == wlbVar.C && this.D == wlbVar.D && this.E == wlbVar.E && this.G == wlbVar.G) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (this.d.hashCode() + eub.m(this.c, this.b.hashCode() * 31, 31)) * 31;
        int i4 = 0;
        xt4 xt4Var = this.e;
        if (xt4Var != null) {
            i = xt4Var.hashCode();
        } else {
            i = 0;
        }
        int k = (((eub.k(hl5.a(this.f, (hashCode + i) * 31, 31), 31, this.C) + this.D) * 31) + this.E) * 31;
        List list = this.F;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (k + i2) * 31;
        xt4 xt4Var2 = this.G;
        if (xt4Var2 != null) {
            i3 = xt4Var2.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 29791;
        xt4 xt4Var3 = this.I;
        if (xt4Var3 != null) {
            i4 = xt4Var3.hashCode();
        }
        return i6 + i4;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
    }
}
