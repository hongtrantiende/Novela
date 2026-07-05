package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a88  reason: default package */
/* loaded from: classes.dex */
public final class a88 extends uq7 {
    public final float b;
    public final hd c;

    public a88(float f, hd hdVar) {
        this.b = f;
        this.c = hdVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, k88] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        mq7Var.L = true;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        this.c.invoke(nx5Var);
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        k88 k88Var = (k88) mq7Var;
        float f = k88Var.K;
        float f2 = this.b;
        if (!rg3.b(f, f2) || !rg3.b(nae.e, nae.e) || !k88Var.L) {
            voe.v(k88Var).Z(false);
        }
        k88Var.K = f2;
        k88Var.L = true;
    }

    public final boolean equals(Object obj) {
        a88 a88Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof a88) {
            a88Var = (a88) obj;
        } else {
            a88Var = null;
        }
        if (a88Var != null && rg3.b(this.b, a88Var.b) && rg3.b(nae.e, nae.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + nk2.d(nae.e, Float.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        return hl5.o("OffsetModifierElement(x=", rg3.c(this.b), ", y=", rg3.c(nae.e), ", rtlAware=true)");
    }
}
