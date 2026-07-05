package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u2c  reason: default package */
/* loaded from: classes3.dex */
public final class u2c {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final long j;

    public u2c(String str, String str2, int i, String str3, int i2, boolean z, boolean z2, boolean z3, int i3, long j) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = i2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = i3;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u2c) {
                u2c u2cVar = (u2c) obj;
                if (!c16.i(this.a, u2cVar.a) || !this.b.equals(u2cVar.b) || this.c != u2cVar.c || Float.compare(nae.e, nae.e) != 0 || !c16.i(this.d, u2cVar.d) || this.e != u2cVar.e || this.f != u2cVar.f || this.g != u2cVar.g || this.h != u2cVar.h || this.i != u2cVar.i || this.j != u2cVar.j) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int d = nk2.d(nae.e, hl5.a(this.c, eub.j(this.a.hashCode() * 31, 31, this.b), 31), 31);
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Long.hashCode(this.j) + hl5.a(this.i, eub.k(eub.k(eub.k(hl5.a(this.e, (d + hashCode) * 31, 31), 31, this.f), 31, this.g), 31, this.h), 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("TextTocLink(id=", this.a, ", title=", this.b, ", chapterIndex=");
        nk2.z(this.c, ", chapterPosition=0.0, parentId=", this.d, ", level=", y);
        eub.w(y, this.e, ", downloaded=", this.f, ", locked=");
        rs8.z(y, this.g, ", pay=", this.h, ", count=");
        y.append(this.i);
        y.append(", lastRead=");
        y.append(this.j);
        y.append(")");
        return y.toString();
    }
}
