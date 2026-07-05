package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pea  reason: default package */
/* loaded from: classes.dex */
public final class pea extends uq7 {
    public final float b;
    public final wea c;
    public final boolean d;
    public final long e;
    public final long f;

    public pea(float f, wea weaVar, boolean z, long j, long j2) {
        this.b = f;
        this.c = weaVar;
        this.d = z;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new om0(new ko9(this, 4));
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(new rg3(this.b), "elevation");
        c00Var.b(this.c, "shape");
        c00Var.b(Boolean.valueOf(this.d), "clip");
        c00Var.b(new zl1(this.e), "ambientColor");
        c00Var.b(new zl1(this.f), "spotColor");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        om0 om0Var = (om0) mq7Var;
        ko9 ko9Var = new ko9(this, 4);
        om0Var.K = ko9Var;
        ube.F(om0Var, ko9Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pea) {
                pea peaVar = (pea) obj;
                if (!rg3.b(this.b, peaVar.b) || !c16.i(this.c, peaVar.c) || this.d != peaVar.d || !zl1.c(this.e, peaVar.e) || !zl1.c(this.f, peaVar.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int k = eub.k((this.c.hashCode() + (Float.hashCode(this.b) * 31)) * 31, 31, this.d);
        int i = zl1.j;
        return Long.hashCode(this.f) + hl5.c(k, this.e, 31);
    }

    public final String toString() {
        String c = rg3.c(this.b);
        String i = zl1.i(this.e);
        String i2 = zl1.i(this.f);
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append(c);
        sb.append(", shape=");
        sb.append(this.c);
        sb.append(", clip=");
        sb.append(this.d);
        sb.append(", ambientColor=");
        sb.append(i);
        sb.append(", spotColor=");
        return s21.q(sb, i2, ")");
    }
}
