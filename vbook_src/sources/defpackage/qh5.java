package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qh5  reason: default package */
/* loaded from: classes3.dex */
public final class qh5 {
    public final isc a;
    public final Object b;

    public qh5(isc iscVar, Object obj) {
        iscVar.getClass();
        obj.getClass();
        this.a = iscVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh5)) {
            return false;
        }
        qh5 qh5Var = (qh5) obj;
        if (c16.i(this.a, qh5Var.a) && c16.i(this.b, qh5Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HttpResponseContainer(expectedType=" + this.a + ", response=" + this.b + ')';
    }
}
