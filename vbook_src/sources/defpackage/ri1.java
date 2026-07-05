package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ri1  reason: default package */
/* loaded from: classes.dex */
public final class ri1 extends uq7 implements x7a {
    public final xt4 b;

    public ri1(xt4 xt4Var) {
        this.b = xt4Var;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new d72(false, true, this.b);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        y7a.a(nx5Var, p1());
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        ((d72) mq7Var).M = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri1)) {
            return false;
        }
        if (this.b == ((ri1) obj).b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.x7a
    public final u7a p1() {
        u7a u7aVar = new u7a();
        u7aVar.c = false;
        u7aVar.d = true;
        this.b.invoke(u7aVar);
        return u7aVar;
    }
}
