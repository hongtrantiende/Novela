package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iy  reason: default package */
/* loaded from: classes.dex */
public final class iy extends uq7 implements x7a {
    public final boolean b;
    public final xt4 c;

    public iy(xt4 xt4Var, boolean z) {
        this.b = z;
        this.c = xt4Var;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new d72(this.b, false, this.c);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        nx5Var.b.b(Boolean.valueOf(this.b), "mergeDescendants");
        y7a.a(nx5Var, p1());
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        d72 d72Var = (d72) mq7Var;
        d72Var.K = this.b;
        d72Var.M = this.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof iy) {
                iy iyVar = (iy) obj;
                if (this.b != iyVar.b || this.c != iyVar.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }

    @Override // defpackage.x7a
    public final u7a p1() {
        u7a u7aVar = new u7a();
        u7aVar.c = this.b;
        this.c.invoke(u7aVar);
        return u7aVar;
    }
}
