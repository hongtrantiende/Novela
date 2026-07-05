package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: df1  reason: default package */
/* loaded from: classes3.dex */
public final class df1 implements ef1 {
    public final String a;

    public df1(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof df1) && c16.i(this.a, ((df1) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hl5.n("ViewLink(url=", this.a, ", isTrusted=false)");
    }
}
