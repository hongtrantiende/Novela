package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: olb  reason: default package */
/* loaded from: classes.dex */
public final class olb extends uq7 {
    public final String b;

    public olb(String str) {
        this.b = str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, plb] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        nx5Var.b.b(this.b, "tag");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        ((plb) mq7Var).K = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olb)) {
            return false;
        }
        return this.b.equals(((olb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
