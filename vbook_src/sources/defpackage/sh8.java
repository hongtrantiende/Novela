package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sh8  reason: default package */
/* loaded from: classes.dex */
public final class sh8 extends uq7 {
    public final rh8 b;
    public final cl7 c;

    public sh8(rh8 rh8Var, cl7 cl7Var) {
        this.b = rh8Var;
        this.c = cl7Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, uh8] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        this.c.invoke(nx5Var);
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        ((uh8) mq7Var).K = this.b;
    }

    public final boolean equals(Object obj) {
        sh8 sh8Var;
        if (obj instanceof sh8) {
            sh8Var = (sh8) obj;
        } else {
            sh8Var = null;
        }
        if (sh8Var == null) {
            return false;
        }
        return c16.i(this.b, sh8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
