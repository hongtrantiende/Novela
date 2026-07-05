package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jc5  reason: default package */
/* loaded from: classes3.dex */
public final class jc5 implements kc5 {
    public final dc5 a;

    public jc5(dc5 dc5Var) {
        dc5Var.getClass();
        this.a = dc5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jc5) && c16.i(this.a, ((jc5) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Node(node=" + this.a + ")";
    }
}
