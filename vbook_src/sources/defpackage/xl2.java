package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xl2  reason: default package */
/* loaded from: classes3.dex */
public final class xl2 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;
    public final long j;
    public final long k;

    public xl2(String str, String str2, int i, String str3, int i2, String str4, String str5, String str6, long j, long j2, long j3) {
        s21.B(str, str2, str3, str4, str5);
        str6.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = i2;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = j;
        this.j = j2;
        this.k = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl2)) {
            return false;
        }
        xl2 xl2Var = (xl2) obj;
        if (c16.i(this.a, xl2Var.a) && c16.i(this.b, xl2Var.b) && this.c == xl2Var.c && c16.i(this.d, xl2Var.d) && this.e == xl2Var.e && c16.i(this.f, xl2Var.f) && c16.i(this.g, xl2Var.g) && c16.i(this.h, xl2Var.h) && this.i == xl2Var.i && this.j == xl2Var.j && this.k == xl2Var.k) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + hl5.c(hl5.c(eub.j(eub.j(eub.j(hl5.a(this.e, eub.j(hl5.a(this.c, eub.j(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), this.i, 31), this.j, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("DbBookmark(id=", this.a, ", bookId=", this.b, ", chapterIndex=");
        nk2.z(this.c, ", chapterName=", this.d, ", type=", y);
        nk2.z(this.e, ", content=", this.f, ", description=", y);
        nk2.C(y, this.g, ", color=", this.h, ", startPosition=");
        y.append(this.i);
        rs8.x(y, ", endPosition=", this.j, ", createAt=");
        return hl5.q(y, this.k, ")");
    }
}
