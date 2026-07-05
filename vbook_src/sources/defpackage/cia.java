package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cia  reason: default package */
/* loaded from: classes3.dex */
public final class cia {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final String k;

    public cia(String str, String str2, String str3, String str4, String str5, boolean z, int i, int i2, int i3, long j, String str6) {
        s21.B(str, str3, str4, str5, str6);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = j;
        this.k = str6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cia) {
                cia ciaVar = (cia) obj;
                if (!c16.i(this.a, ciaVar.a) || !this.b.equals(ciaVar.b) || !c16.i(this.c, ciaVar.c) || !c16.i(this.d, ciaVar.d) || !c16.i(this.e, ciaVar.e) || this.f != ciaVar.f || this.g != ciaVar.g || this.h != ciaVar.h || this.i != ciaVar.i || this.j != ciaVar.j || !c16.i(this.k, ciaVar.k)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.k.hashCode() + hl5.c(hl5.a(this.i, hl5.a(this.h, hl5.a(this.g, eub.k(eub.j(eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31), 31), this.j, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("ShelfBook(id=", this.a, ", name=", this.b, ", cover=");
        nk2.C(y, this.c, ", source=", this.d, ", bookPath=");
        rs8.y(y, this.e, ", isNsfw=", this.f, ", totalChapter=");
        rs8.q(this.g, this.h, ", newChapterCount=", ", readPercent=", y);
        y.append(this.i);
        y.append(", lastReadTime=");
        y.append(this.j);
        return nk2.v(y, ", lastReadChapter=", this.k, ")");
    }
}
