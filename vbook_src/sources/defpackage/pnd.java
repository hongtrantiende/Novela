package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pnd  reason: default package */
/* loaded from: classes.dex */
public final class pnd extends uq7 {
    public final j73 b;
    public final boolean c;
    public final lu4 d;
    public final Object e;

    public pnd(j73 j73Var, boolean z, lu4 lu4Var, Object obj, String str) {
        this.b = j73Var;
        this.c = z;
        this.d = lu4Var;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, qnd] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        mq7Var.L = this.c;
        mq7Var.M = this.d;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.e, "align");
        c00Var.b(Boolean.valueOf(this.c), "unbounded");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        qnd qndVar = (qnd) mq7Var;
        qndVar.K = this.b;
        qndVar.L = this.c;
        qndVar.M = this.d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && pnd.class == obj.getClass()) {
                pnd pndVar = (pnd) obj;
                if (this.b != pndVar.b || this.c != pndVar.c || !this.e.equals(pndVar.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + eub.k(this.b.hashCode() * 31, 31, this.c);
    }
}
