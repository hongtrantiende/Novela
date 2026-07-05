package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bs0  reason: default package */
/* loaded from: classes3.dex */
public final class bs0 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final int j;
    public final long k;

    public bs0(String str, String str2, int i, String str3, int i2, String str4, String str5, String str6, int i3, int i4, long j) {
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
        this.i = i3;
        this.j = i4;
        this.k = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs0)) {
            return false;
        }
        bs0 bs0Var = (bs0) obj;
        if (c16.i(this.a, bs0Var.a) && c16.i(this.b, bs0Var.b) && this.c == bs0Var.c && c16.i(this.d, bs0Var.d) && this.e == bs0Var.e && c16.i(this.f, bs0Var.f) && c16.i(this.g, bs0Var.g) && c16.i(this.h, bs0Var.h) && this.i == bs0Var.i && this.j == bs0Var.j && this.k == bs0Var.k) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + hl5.a(this.j, hl5.a(this.i, eub.j(eub.j(eub.j(hl5.a(this.e, eub.j(hl5.a(this.c, eub.j(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), 31), 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("Bookmark(id=", this.a, ", bookId=", this.b, ", chapterIndex=");
        nk2.z(this.c, ", chapterName=", this.d, ", type=", y);
        nk2.z(this.e, ", content=", this.f, ", color=", y);
        nk2.C(y, this.g, ", description=", this.h, ", startPosition=");
        rs8.q(this.i, this.j, ", endPosition=", ", createAt=", y);
        return hl5.q(y, this.k, ")");
    }
}
