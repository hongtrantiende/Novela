package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y08  reason: default package */
/* loaded from: classes.dex */
public final class y08 extends uq7 {
    public final u08 b;
    public final x08 c;

    public y08(u08 u08Var, x08 x08Var) {
        this.b = u08Var;
        this.c = x08Var;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new b18(this.b, this.c);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.b, "connection");
        c00Var.b(this.c, "dispatcher");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        b18 b18Var = (b18) mq7Var;
        b18Var.K = this.b;
        x08 x08Var = b18Var.L;
        if (x08Var.a == b18Var) {
            x08Var.a = null;
        }
        x08 x08Var2 = this.c;
        if (x08Var2 == null) {
            b18Var.L = new x08();
        } else if (x08Var2 != x08Var) {
            b18Var.L = x08Var2;
        }
        if (b18Var.J) {
            x08 x08Var3 = b18Var.L;
            x08Var3.a = b18Var;
            x08Var3.b = null;
            b18Var.M = null;
            x08Var3.c = new ik(b18Var, 19);
            x08Var3.d = b18Var.v1();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y08)) {
            return false;
        }
        y08 y08Var = (y08) obj;
        if (!c16.i(y08Var.b, this.b) || !c16.i(y08Var.c, this.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.b.hashCode() * 31;
        x08 x08Var = this.c;
        if (x08Var != null) {
            i = x08Var.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
