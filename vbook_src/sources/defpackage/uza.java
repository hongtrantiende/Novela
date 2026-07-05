package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uza  reason: default package */
/* loaded from: classes.dex */
public final class uza implements z3d {
    public final Object a;

    public uza(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.z3d
    public final Object a(xt8 xt8Var) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof uza) && c16.i(this.a, ((uza) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.a + ")";
    }
}
