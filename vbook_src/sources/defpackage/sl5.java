package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sl5  reason: default package */
/* loaded from: classes3.dex */
public final class sl5 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final long i;

    public sl5(String str, String str2, int i, String str3, String str4, String str5, int i2, int i3, long j) {
        hl5.z(str, str2, str4, str5);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = i2;
        this.h = i3;
        this.i = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sl5) {
                sl5 sl5Var = (sl5) obj;
                if (!c16.i(this.a, sl5Var.a) || !c16.i(this.b, sl5Var.b) || this.c != sl5Var.c || !this.d.equals(sl5Var.d) || !c16.i(this.e, sl5Var.e) || !c16.i(this.f, sl5Var.f) || this.g != sl5Var.g || this.h != sl5Var.h || this.i != sl5Var.i) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.i) + hl5.a(this.h, hl5.a(this.g, eub.j(eub.j(eub.j(hl5.a(this.c, eub.j(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31), 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("ImageBookmark(id=", this.a, ", bookId=", this.b, ", chapterIndex=");
        nk2.z(this.c, ", chapterName=", this.d, ", content=", y);
        nk2.C(y, this.e, ", description=", this.f, ", startPosition=");
        rs8.q(this.g, this.h, ", endPosition=", ", createAt=", y);
        return hl5.q(y, this.i, ")");
    }
}
