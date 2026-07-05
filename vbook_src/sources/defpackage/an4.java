package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: an4  reason: default package */
/* loaded from: classes.dex */
public final class an4 extends uq7 {
    public final zm4 b;

    public an4(zm4 zm4Var) {
        this.b = zm4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, cn4] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        nx5Var.b.b(this.b, "focusRequester");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        cn4 cn4Var = (cn4) mq7Var;
        cn4Var.K.a.j(cn4Var);
        zm4 zm4Var = this.b;
        cn4Var.K = zm4Var;
        zm4Var.a.b(cn4Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof an4) && c16.i(this.b, ((an4) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.b + ")";
    }
}
