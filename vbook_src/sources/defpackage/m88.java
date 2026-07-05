package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m88  reason: default package */
/* loaded from: classes.dex */
public final class m88 extends uq7 {
    public final xt4 b;
    public final im c;

    public m88(xt4 xt4Var, im imVar) {
        this.b = xt4Var;
        this.c = imVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, n88] */
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
        n88 n88Var = (n88) mq7Var;
        xt4 xt4Var = n88Var.K;
        xt4 xt4Var2 = this.b;
        if (xt4Var != xt4Var2 || !n88Var.L) {
            voe.v(n88Var).Z(false);
        }
        n88Var.K = xt4Var2;
        n88Var.L = true;
    }

    public final boolean equals(Object obj) {
        m88 m88Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof m88) {
            m88Var = (m88) obj;
        } else {
            m88Var = null;
        }
        if (m88Var != null && this.b == m88Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.b + ", rtlAware=true)";
    }
}
