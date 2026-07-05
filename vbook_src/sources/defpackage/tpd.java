package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tpd  reason: default package */
/* loaded from: classes.dex */
public final class tpd extends uq7 {
    public final float b;

    public tpd(float f) {
        this.b = f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, upd] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        nx5Var.b.b(Float.valueOf(this.b), "zIndex");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        ((upd) mq7Var).K = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof tpd) && Float.compare(this.b, ((tpd) obj).b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b);
    }

    public final String toString() {
        return a82.k("ZIndexElement(zIndex=", this.b, ")");
    }
}
