package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s06  reason: default package */
/* loaded from: classes.dex */
public final class s06 extends uq7 {
    public final w06 b;

    public s06(w06 w06Var) {
        this.b = w06Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, t06, x06] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? x06Var = new x06(0);
        x06Var.L = this.b;
        x06Var.M = true;
        return x06Var;
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        t06 t06Var = (t06) mq7Var;
        t06Var.L = this.b;
        t06Var.M = true;
    }

    public final boolean equals(Object obj) {
        s06 s06Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof s06) {
            s06Var = (s06) obj;
        } else {
            s06Var = null;
        }
        if (s06Var != null && this.b == s06Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.b.hashCode() * 31);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
    }
}
