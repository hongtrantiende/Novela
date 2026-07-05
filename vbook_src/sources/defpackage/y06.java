package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y06  reason: default package */
/* loaded from: classes.dex */
public final class y06 extends uq7 {
    public final w06 b;

    public y06(w06 w06Var) {
        this.b = w06Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, a16, x06] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? x06Var = new x06(0);
        x06Var.L = this.b;
        x06Var.M = true;
        return x06Var;
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        a16 a16Var = (a16) mq7Var;
        a16Var.L = this.b;
        a16Var.M = true;
    }

    public final boolean equals(Object obj) {
        y06 y06Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof y06) {
            y06Var = (y06) obj;
        } else {
            y06Var = null;
        }
        if (y06Var != null && this.b == y06Var.b) {
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
