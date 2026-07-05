package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ap2  reason: default package */
/* loaded from: classes3.dex */
public final class ap2 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;

    public ap2(long j, long j2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap2)) {
            return false;
        }
        ap2 ap2Var = (ap2) obj;
        if (c16.i(this.a, ap2Var.a) && c16.i(this.b, ap2Var.b) && this.c == ap2Var.c && this.d == ap2Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + hl5.c(eub.j(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("DbQtNameSkip(id=", this.a, ", word=", this.b, ", createAt=");
        y.append(this.c);
        return a82.n(y, ", updateAt=", this.d, ")");
    }
}
