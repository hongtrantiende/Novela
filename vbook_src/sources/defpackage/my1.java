package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: my1  reason: default package */
/* loaded from: classes.dex */
public final class my1 implements z3d {
    public final xt4 a;

    public my1(xt4 xt4Var) {
        this.a = xt4Var;
    }

    @Override // defpackage.z3d
    public final Object a(xt8 xt8Var) {
        return this.a.invoke(xt8Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof my1) && c16.i(this.a, ((my1) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ")";
    }
}
