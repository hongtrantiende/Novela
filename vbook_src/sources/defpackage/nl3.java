package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nl3  reason: default package */
/* loaded from: classes.dex */
public final class nl3 extends uq7 {
    public final xt4 b;
    public final ih3 c;

    public nl3(xt4 xt4Var, ih3 ih3Var) {
        this.b = xt4Var;
        this.c = ih3Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m03, mq7, jh3] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? m03Var = new m03();
        m03Var.M = this.b;
        m03Var.N = this.c;
        return m03Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.c, "target");
        c00Var.b(this.b, "shouldStartDragAndDrop");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        jh3 jh3Var = (jh3) mq7Var;
        jh3Var.M = this.b;
        ih3 ih3Var = jh3Var.N;
        ih3 ih3Var2 = this.c;
        if (!c16.i(ih3Var2, ih3Var)) {
            hh3 hh3Var = jh3Var.O;
            if (hh3Var != null) {
                jh3Var.I1(hh3Var);
            }
            jh3Var.N = ih3Var2;
            hh3 hh3Var2 = new hh3(new jk(9, new cq2(jh3Var, 15), ih3Var2), 1);
            jh3Var.H1(hh3Var2);
            jh3Var.O = hh3Var2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl3)) {
            return false;
        }
        nl3 nl3Var = (nl3) obj;
        if (c16.i(this.c, nl3Var.c) && this.b == nl3Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.c.hashCode() * 31);
    }
}
