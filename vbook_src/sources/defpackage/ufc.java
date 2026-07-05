package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ufc  reason: default package */
/* loaded from: classes3.dex */
public final class ufc implements wfc {
    public final at9 a;

    public ufc(at9 at9Var) {
        at9Var.getClass();
        this.a = at9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ufc) && c16.i(this.a, ((ufc) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Default(config=" + this.a + ")";
    }
}
