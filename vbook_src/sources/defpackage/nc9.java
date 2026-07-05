package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nc9  reason: default package */
/* loaded from: classes3.dex */
public final class nc9 {
    public final long a;
    public final String b;

    public nc9(long j, String str) {
        str.getClass();
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc9)) {
            return false;
        }
        nc9 nc9Var = (nc9) obj;
        if (this.a == nc9Var.a && c16.i(this.b, nc9Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "QtMeaning(id=" + this.a + ", text=" + this.b + ")";
    }
}
