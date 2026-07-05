package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ia5  reason: default package */
/* loaded from: classes.dex */
public final class ia5 extends uq7 {
    public final yu7 b;

    public ia5(yu7 yu7Var) {
        this.b = yu7Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ma5, mq7] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.b, "interactionSource");
        c00Var.b(Boolean.TRUE, "enabled");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        ma5 ma5Var = (ma5) mq7Var;
        yu7 yu7Var = ma5Var.K;
        yu7 yu7Var2 = this.b;
        if (!c16.i(yu7Var, yu7Var2)) {
            ma5Var.J1();
            ma5Var.K = yu7Var2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ia5) && c16.i(((ia5) obj).b, this.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() * 31;
    }
}
