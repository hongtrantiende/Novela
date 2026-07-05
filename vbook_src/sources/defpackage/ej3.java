package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ej3  reason: default package */
/* loaded from: classes3.dex */
final class ej3<T> extends uq7 {
    public final pe b;
    public final lu4 c;
    public final ff8 d;

    public ej3(pe peVar, lu4 lu4Var, ff8 ff8Var) {
        peVar.getClass();
        lu4Var.getClass();
        this.b = peVar;
        this.c = lu4Var;
        this.d = ff8Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, fj3] */
    @Override // defpackage.uq7
    public final mq7 b() {
        pe peVar = this.b;
        peVar.getClass();
        lu4 lu4Var = this.c;
        lu4Var.getClass();
        ?? mq7Var = new mq7();
        mq7Var.K = peVar;
        mq7Var.L = lu4Var;
        mq7Var.M = this.d;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        fj3 fj3Var = (fj3) mq7Var;
        fj3Var.getClass();
        pe peVar = this.b;
        peVar.getClass();
        fj3Var.K = peVar;
        lu4 lu4Var = this.c;
        lu4Var.getClass();
        fj3Var.L = lu4Var;
        fj3Var.M = this.d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ej3) {
                ej3 ej3Var = (ej3) obj;
                if (!c16.i(this.b, ej3Var.b) || this.c != ej3Var.c || this.d != ej3Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        return this.d.hashCode() + ((hashCode + (this.b.hashCode() * 31)) * 31);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
    }
}
