package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nu3  reason: default package */
/* loaded from: classes.dex */
public final class nu3 {
    public final gi1 a;
    public final xt4 b;
    public final xt4 c;
    public final tu1 d;

    public nu3(gi1 gi1Var, xt4 xt4Var, xt4 xt4Var2, tu1 tu1Var) {
        this.a = gi1Var;
        this.b = xt4Var;
        this.c = xt4Var2;
        this.d = tu1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nu3) {
            nu3 nu3Var = (nu3) obj;
            if (this.a.equals(nu3Var.a) && c16.i(this.b, nu3Var.b) && this.c.equals(nu3Var.c) && this.d == nu3Var.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EntryClassProvider(clazz=" + this.a + ", clazzContentKey=" + this.b + ", metadata=" + this.c + ", content=" + this.d + ")";
    }
}
