package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e65  reason: default package */
/* loaded from: classes.dex */
public final class e65 extends uq7 {
    public final a52 b;
    public final vt4 c;

    public e65(a52 a52Var, vt4 vt4Var) {
        this.b = a52Var;
        this.c = vt4Var;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new f65(this.b, this.c);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.b, "shapeProvider");
        c00Var.b(this.c, "highlight");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        f65 f65Var = (f65) mq7Var;
        f65Var.getClass();
        f65Var.K = this.b;
        f65Var.L = this.c;
        hud.o(f65Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e65) {
                e65 e65Var = (e65) obj;
                if (this.b == e65Var.b && this.c.equals(e65Var.c)) {
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
