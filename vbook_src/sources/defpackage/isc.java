package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: isc  reason: default package */
/* loaded from: classes3.dex */
public final class isc {
    public final gi1 a;
    public final t76 b;

    public isc(gi1 gi1Var, t76 t76Var) {
        this.a = gi1Var;
        this.b = t76Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isc)) {
            return false;
        }
        t76 t76Var = this.b;
        if (t76Var == null) {
            isc iscVar = (isc) obj;
            if (iscVar.b == null) {
                return this.a.equals(iscVar.a);
            }
        }
        return c16.i(t76Var, ((isc) obj).b);
    }

    public final int hashCode() {
        t76 t76Var = this.b;
        if (t76Var != null) {
            return t76Var.hashCode();
        }
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeInfo(");
        Object obj = this.b;
        if (obj == null) {
            obj = this.a;
        }
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }
}
