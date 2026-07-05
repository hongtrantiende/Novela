package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rj3  reason: default package */
/* loaded from: classes.dex */
public final class rj3 extends uq7 {
    public final xt4 C;
    public final yf0 b;
    public final a52 c;
    public final xt4 d;
    public final xt4 e;
    public final lu4 f;

    public rj3(yf0 yf0Var, a52 a52Var, xt4 xt4Var, xt4 xt4Var2, lu4 lu4Var, xt4 xt4Var3) {
        yf0Var.getClass();
        xt4Var.getClass();
        this.b = yf0Var;
        this.c = a52Var;
        this.d = xt4Var;
        this.e = xt4Var2;
        this.f = lu4Var;
        this.C = xt4Var3;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new uj3(this.b, this.c, this.d, this.e, this.f, this.C);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.b, "backdrop");
        c00Var.b(this.c, "shapeProvider");
        c00Var.b(this.d, "effects");
        c00Var.b(this.e, "layerBlock");
        c00Var.b(null, "exportedBackdrop");
        c00Var.b(null, "onDrawBehind");
        c00Var.b(this.f, "onDrawBackdrop");
        c00Var.b(this.C, "onDrawSurface");
        c00Var.b(null, "onDrawFront");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        uj3 uj3Var = (uj3) mq7Var;
        uj3Var.getClass();
        yf0 yf0Var = this.b;
        yf0Var.getClass();
        uj3Var.K = yf0Var;
        uj3Var.L = this.c;
        xt4 xt4Var = this.d;
        xt4Var.getClass();
        uj3Var.M = xt4Var;
        uj3Var.N = this.e;
        uj3Var.O = this.f;
        uj3Var.P = this.C;
        iue.R(uj3Var, new t42(uj3Var, 12));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rj3) {
                rj3 rj3Var = (rj3) obj;
                if (c16.i(this.b, rj3Var.b) && this.c == rj3Var.c && c16.i(this.d, rj3Var.d) && c16.i(this.e, rj3Var.e) && this.f.equals(rj3Var.f) && c16.i(this.C, rj3Var.C)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31;
        int i2 = 0;
        xt4 xt4Var = this.e;
        if (xt4Var != null) {
            i = xt4Var.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (this.f.hashCode() + ((hashCode + i) * 29791)) * 31;
        xt4 xt4Var2 = this.C;
        if (xt4Var2 != null) {
            i2 = xt4Var2.hashCode();
        }
        return (hashCode2 + i2) * 31;
    }
}
