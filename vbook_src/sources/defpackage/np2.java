package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: np2  reason: default package */
/* loaded from: classes3.dex */
public final class np2 {
    public final String a;
    public final long b;

    public np2(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np2)) {
            return false;
        }
        np2 np2Var = (np2) obj;
        if (c16.i(this.a, np2Var.a) && this.b == np2Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DbSearch(key=" + this.a + ", createAt=" + this.b + ")";
    }
}
