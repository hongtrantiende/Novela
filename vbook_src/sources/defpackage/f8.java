package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f8  reason: default package */
/* loaded from: classes.dex */
public final class f8 extends uq7 {
    public final lu4 b;

    public f8(lu4 lu4Var) {
        this.b = lu4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m03, g8, mq7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [mq7, e8, f03] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? m03Var = new m03();
        m03Var.M = this.b;
        u0 u0Var = new u0(m03Var, 2);
        ?? mq7Var = new mq7();
        mq7Var.K = u0Var;
        m03Var.H1(mq7Var);
        return m03Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        nx5Var.b.b(this.b, "builder");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        ((g8) mq7Var).M = this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f8) {
                if (this.b != ((f8) obj).b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
