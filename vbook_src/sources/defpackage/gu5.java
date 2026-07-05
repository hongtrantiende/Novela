package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gu5  reason: default package */
/* loaded from: classes.dex */
public final class gu5 extends uq7 {
    public final gz5 b;
    public final iu5 c;

    public gu5(gz5 gz5Var, iu5 iu5Var) {
        this.b = gz5Var;
        this.c = iu5Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m03, mq7, hu5] */
    @Override // defpackage.uq7
    public final mq7 b() {
        f03 a = this.c.a(this.b);
        ?? m03Var = new m03();
        m03Var.M = a;
        m03Var.H1(a);
        return m03Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.b, "interactionSource");
        c00Var.b(this.c, "indication");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        hu5 hu5Var = (hu5) mq7Var;
        f03 a = this.c.a(this.b);
        hu5Var.I1(hu5Var.M);
        hu5Var.M = a;
        hu5Var.H1(a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu5)) {
            return false;
        }
        gu5 gu5Var = (gu5) obj;
        if (c16.i(this.b, gu5Var.b) && c16.i(this.c, gu5Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
