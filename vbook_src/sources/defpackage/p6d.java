package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p6d  reason: default package */
/* loaded from: classes3.dex */
public final class p6d {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    public p6d(String str, String str2, String str3, String str4, String str5, int i, String str6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        s21.B(str, str2, str3, str4, str5);
        str6.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = str6;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.o = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6d)) {
            return false;
        }
        p6d p6dVar = (p6d) obj;
        if (c16.i(this.a, p6dVar.a) && c16.i(this.b, p6dVar.b) && c16.i(this.c, p6dVar.c) && c16.i(this.d, p6dVar.d) && c16.i(this.e, p6dVar.e) && this.f == p6dVar.f && c16.i(this.g, p6dVar.g) && this.h == p6dVar.h && this.i == p6dVar.i && this.j == p6dVar.j && this.k == p6dVar.k && this.l == p6dVar.l && this.m == p6dVar.m && this.n == p6dVar.n && this.o == p6dVar.o) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.o) + eub.k(eub.k(eub.k(eub.k(eub.k(eub.k(eub.k(eub.j(hl5.a(this.f, eub.j(eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder y = nk2.y("VideoBookState(bookId=", this.a, ", name=", this.b, ", author=");
        nk2.C(y, this.c, ", cover=", this.d, ", path=");
        a82.u(this.f, this.e, ", type=", ", description=", y);
        rs8.y(y, this.g, ", isNfsw=", this.h, ", isOngoing=");
        rs8.z(y, this.i, ", isInShelf=", this.j, ", isFollow=");
        rs8.z(y, this.k, ", isSupportShowDetail=", this.l, ", isSupportDownload=");
        rs8.z(y, this.m, ", isSupportReload=", this.n, ", isSupportShowEpisodeName=");
        return rs8.m(")", y, this.o);
    }
}
