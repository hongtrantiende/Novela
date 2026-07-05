package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: em2  reason: default package */
/* loaded from: classes3.dex */
public final class em2 {
    public final String a;
    public final String b;
    public final long c;

    public em2(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em2)) {
            return false;
        }
        em2 em2Var = (em2) obj;
        if (c16.i(this.a, em2Var.a) && c16.i(this.b, em2Var.b) && this.c == em2Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return hl5.q(nk2.y("DbBrowserHistory(url=", this.a, ", title=", this.b, ", createAt="), this.c, ")");
    }
}
