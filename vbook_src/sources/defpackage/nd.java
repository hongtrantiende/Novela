package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nd  reason: default package */
/* loaded from: classes.dex */
public final class nd<T> extends uq7 {
    public final qe b;

    public nd(qe qeVar) {
        this.b = qeVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ce, mq7, ti3] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? ti3Var = new ti3(yd.a, true, null, ff8.b);
        ti3Var.f0 = this.b;
        return ti3Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.b, "state");
        c00Var.b(ff8.b, "orientation");
        c00Var.b(Boolean.TRUE, "enabled");
        c00Var.b(null, "reverseDirection");
        c00Var.b(null, "interactionSource");
        c00Var.b(null, "startDragImmediately");
        c00Var.b(null, "overscrollEffect");
        c00Var.b(null, "flingBehavior");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        boolean z;
        boolean z2;
        ce ceVar = (ce) mq7Var;
        ceVar.getClass();
        qe qeVar = ceVar.f0;
        qe qeVar2 = this.b;
        if (!c16.i(qeVar, qeVar2)) {
            ceVar.f0 = qeVar2;
            ceVar.e2();
            z = true;
        } else {
            z = false;
        }
        ff8 ff8Var = ceVar.M;
        ff8 ff8Var2 = ff8.b;
        if (ff8Var != ff8Var2) {
            ceVar.M = ff8Var2;
            z2 = true;
        } else {
            z2 = z;
        }
        ceVar.b2(ceVar.N, true, null, ff8Var2, z2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof nd)) {
                return false;
            }
            if (this.b != ((nd) obj).b) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return eub.k((ff8.b.hashCode() + (this.b.hashCode() * 31)) * 31, 28629151, true);
    }
}
