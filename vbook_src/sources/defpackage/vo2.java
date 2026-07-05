package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vo2  reason: default package */
/* loaded from: classes3.dex */
public final class vo2 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final long e;
    public final long f;

    public vo2(String str, String str2, int i, String str3, long j, long j2) {
        rs8.w(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo2)) {
            return false;
        }
        vo2 vo2Var = (vo2) obj;
        if (c16.i(this.a, vo2Var.a) && c16.i(this.b, vo2Var.b) && this.c == vo2Var.c && c16.i(this.d, vo2Var.d) && this.e == vo2Var.e && this.f == vo2Var.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + hl5.c(eub.j(hl5.a(this.c, eub.j(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), this.e, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("DbPage(id=", this.a, ", bookId=", this.b, ", position=");
        nk2.z(this.c, ", path=", this.d, ", createAt=", y);
        y.append(this.e);
        return a82.n(y, ", updateAt=", this.f, ")");
    }
}
