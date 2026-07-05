package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zna  reason: default package */
/* loaded from: classes.dex */
public final class zna extends uq7 {
    public final nz9 b;
    public final vt4 c;

    public zna(nz9 nz9Var, vt4 vt4Var) {
        this.b = nz9Var;
        this.c = vt4Var;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new coa(this.b, this.c);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.b, "scaleToBounds");
        c00Var.b(this.c, "isEnabled");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        coa coaVar = (coa) mq7Var;
        coaVar.K.setValue(this.b);
        coaVar.L.setValue(this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zna) {
            zna znaVar = (zna) obj;
            if (znaVar.c == this.c && znaVar.b == this.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.c.hashCode() * 31);
    }
}
