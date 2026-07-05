package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oa9  reason: default package */
/* loaded from: classes.dex */
public final class oa9 extends uq7 {
    public final boolean b;
    public final vt4 c;
    public final boolean d;
    public final ya9 e;
    public final float f;

    public oa9(boolean z, vt4 vt4Var, boolean z2, ya9 ya9Var, float f) {
        this.b = z;
        this.c = vt4Var;
        this.d = z2;
        this.e = ya9Var;
        this.f = f;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new xa9(this.b, this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(Boolean.valueOf(this.b), "isRefreshing");
        c00Var.b(this.c, "onRefresh");
        c00Var.b(Boolean.valueOf(this.d), "enabled");
        c00Var.b(this.e, "state");
        c00Var.b(new rg3(this.f), "threshold");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        xa9 xa9Var = (xa9) mq7Var;
        xa9Var.N = this.c;
        xa9Var.O = this.d;
        xa9Var.P = this.e;
        xa9Var.Q = this.f;
        boolean z = xa9Var.M;
        boolean z2 = this.b;
        if (z != z2) {
            xa9Var.M = z2;
            z87.v(xa9Var.v1(), null, null, new ua9(xa9Var, null, 2), 3);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof oa9) {
                oa9 oa9Var = (oa9) obj;
                if (this.b != oa9Var.b || this.d != oa9Var.d || this.c != oa9Var.c || !c16.i(this.e, oa9Var.e) || !rg3.b(this.f, oa9Var.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int k = eub.k(Boolean.hashCode(this.b) * 31, 31, this.d);
        int hashCode = this.e.hashCode();
        return Float.hashCode(this.f) + ((hashCode + ((this.c.hashCode() + k) * 31)) * 31);
    }
}
