package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qha  reason: default package */
/* loaded from: classes.dex */
public final class qha extends uq7 {
    public final lha b;

    public qha(lha lhaVar) {
        this.b = lhaVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, rha] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        nx5Var.b.b(this.b, "sharedTransitionScope");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        rha rhaVar = (rha) mq7Var;
        lha lhaVar = rhaVar.K;
        lha lhaVar2 = this.b;
        if (!c16.i(lhaVar2, lhaVar)) {
            iue.R(rhaVar, lhaVar2.d);
        }
        rhaVar.K = lhaVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof qha) && c16.i(this.b, ((qha) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SharedTransitionScopeRootModifierElement(sharedTransitionScope=" + this.b + ")";
    }
}
