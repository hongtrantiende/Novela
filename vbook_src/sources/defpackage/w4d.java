package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w4d  reason: default package */
/* loaded from: classes.dex */
public final class w4d extends uq7 {
    public final tkc b;
    public final pkc c;
    public final eu3 d;
    public final lz3 e;
    public final sga f;

    public w4d(tkc tkcVar, pkc pkcVar, eu3 eu3Var, lz3 lz3Var, sga sgaVar) {
        this.b = tkcVar;
        this.c = pkcVar;
        this.d = eu3Var;
        this.e = lz3Var;
        this.f = sgaVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, y4d] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.c;
        mq7Var.L = this.d;
        mq7Var.M = this.e;
        mq7Var.N = this.f;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.b, "transition");
        c00Var.b(this.c, "veilAnimation");
        c00Var.b(this.d, "enter");
        c00Var.b(this.e, "exit");
        c00Var.b(this.f, "mutableTransformState");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        y4d y4dVar = (y4d) mq7Var;
        y4dVar.getClass();
        y4dVar.K = this.c;
        y4dVar.L = this.d;
        y4dVar.M = this.e;
        y4dVar.N = this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w4d) {
            w4d w4dVar = (w4d) obj;
            if (c16.i(this.b, w4dVar.b) && c16.i(this.c, w4dVar.c) && this.d.equals(w4dVar.d) && c16.i(this.e, w4dVar.e) && this.f == w4dVar.f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        int hashCode2 = this.d.a.hashCode();
        int hashCode3 = this.e.a.hashCode();
        return this.f.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (this.b.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VeilModifierElement(transition=" + this.b + ", veilAnimation=" + this.c + ", enter=" + this.d + ", exit=" + this.e + ", mutableTransformState=" + this.f + ")";
    }
}
