package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p3a  reason: default package */
/* loaded from: classes.dex */
public final class p3a extends uq7 {
    public final k2a b;
    public final boolean c;

    public p3a(k2a k2aVar, boolean z) {
        this.b = k2aVar;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, e2a] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        mq7Var.L = this.c;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.b, "state");
        c00Var.b(Boolean.FALSE, "reverseScrolling");
        c00Var.b(Boolean.valueOf(this.c), "isVertical");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        e2a e2aVar = (e2a) mq7Var;
        e2aVar.K = this.b;
        e2aVar.L = this.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p3a) {
            p3a p3aVar = (p3a) obj;
            if (c16.i(this.b, p3aVar.b) && this.c == p3aVar.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + eub.k(this.b.hashCode() * 31, 31, false);
    }
}
