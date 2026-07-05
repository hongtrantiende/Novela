package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y3c  reason: default package */
/* loaded from: classes3.dex */
public final class y3c implements z3c {
    public final String a;

    public y3c(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof y3c) && c16.i(this.a, ((y3c) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hl5.n("ImportSuccess(name=", this.a, ")");
    }
}
