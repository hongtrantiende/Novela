package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oea  reason: default package */
/* loaded from: classes.dex */
public final class oea extends uq7 {
    public final a52 b;
    public final vt4 c;

    public oea(a52 a52Var, vt4 vt4Var) {
        this.b = a52Var;
        this.c = vt4Var;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new sea(this.b, this.c);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.b, "shapeProvider");
        c00Var.b(this.c, "shadow");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        sea seaVar = (sea) mq7Var;
        seaVar.getClass();
        seaVar.K = this.b;
        seaVar.L = this.c;
        hud.o(seaVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof oea) {
                oea oeaVar = (oea) obj;
                if (this.b == oeaVar.b && this.c.equals(oeaVar.c)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
