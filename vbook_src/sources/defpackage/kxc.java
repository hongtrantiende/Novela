package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kxc  reason: default package */
/* loaded from: classes.dex */
public final class kxc extends uq7 {
    public final float b;
    public final float c;

    public kxc(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, lxc] */
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
        c00Var.b(new rg3(this.b), "minWidth");
        c00Var.b(new rg3(this.c), "minHeight");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        lxc lxcVar = (lxc) mq7Var;
        lxcVar.K = this.b;
        lxcVar.L = this.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kxc) {
            kxc kxcVar = (kxc) obj;
            if (rg3.b(this.b, kxcVar.b) && rg3.b(this.c, kxcVar.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }
}
