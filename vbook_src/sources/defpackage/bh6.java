package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bh6  reason: default package */
/* loaded from: classes.dex */
public final class bh6 extends uq7 {
    public final fh6 b;
    public final mce c;
    public final boolean d;
    public final ff8 e;

    public bh6(fh6 fh6Var, mce mceVar, boolean z, ff8 ff8Var) {
        this.b = fh6Var;
        this.c = mceVar;
        this.d = z;
        this.e = ff8Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, eh6] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        mq7Var.L = this.c;
        mq7Var.M = this.d;
        mq7Var.N = this.e;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        eh6 eh6Var = (eh6) mq7Var;
        eh6Var.K = this.b;
        eh6Var.L = this.c;
        eh6Var.M = this.d;
        eh6Var.N = this.e;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bh6) {
                bh6 bh6Var = (bh6) obj;
                if (!c16.i(this.b, bh6Var.b) || !c16.i(this.c, bh6Var.c) || this.d != bh6Var.d || this.e != bh6Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + eub.k((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
    }
}
