package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: li6  reason: default package */
/* loaded from: classes.dex */
public final class li6 extends uq7 {
    public final vt4 b;
    public final ii6 c;
    public final ff8 d;
    public final boolean e;
    public final boolean f;

    public li6(vt4 vt4Var, ii6 ii6Var, ff8 ff8Var, boolean z, boolean z2) {
        this.b = vt4Var;
        this.c = ii6Var;
        this.d = ff8Var;
        this.e = z;
        this.f = z2;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new oi6(this.b, this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        oi6 oi6Var = (oi6) mq7Var;
        oi6Var.K = this.b;
        oi6Var.L = this.c;
        ff8 ff8Var = oi6Var.M;
        ff8 ff8Var2 = this.d;
        if (ff8Var != ff8Var2) {
            oi6Var.M = ff8Var2;
            ak0.t(oi6Var);
        }
        boolean z = oi6Var.N;
        boolean z2 = this.e;
        boolean z3 = this.f;
        if (z == z2 && oi6Var.O == z3) {
            return;
        }
        oi6Var.N = z2;
        oi6Var.O = z3;
        oi6Var.H1();
        ak0.t(oi6Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof li6) {
                li6 li6Var = (li6) obj;
                if (this.b != li6Var.b || !c16.i(this.c, li6Var.c) || this.d != li6Var.d || this.e != li6Var.e || this.f != li6Var.f) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        return Boolean.hashCode(this.f) + eub.k((this.d.hashCode() + ((hashCode + (this.b.hashCode() * 31)) * 31)) * 31, 31, this.e);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
    }
}
