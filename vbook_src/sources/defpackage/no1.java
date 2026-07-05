package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: no1  reason: default package */
/* loaded from: classes.dex */
public final class no1 implements nq7 {
    public final nq7 a;
    public final nq7 b;

    public no1(nq7 nq7Var, nq7 nq7Var2) {
        this.a = nq7Var;
        this.b = nq7Var2;
    }

    @Override // defpackage.nq7
    public final Object a(Object obj, lu4 lu4Var) {
        return this.b.a(this.a.a(obj, lu4Var), lu4Var);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof no1) {
            no1 no1Var = (no1) obj;
            if (this.a.equals(no1Var.a) && c16.i(this.b, no1Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.nq7
    public final boolean m(xt4 xt4Var) {
        if (this.a.m(xt4Var) && this.b.m(xt4Var)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        Object a = a("", np.O);
        return "[" + a + "]";
    }
}
