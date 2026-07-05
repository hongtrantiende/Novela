package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lbd  reason: default package */
/* loaded from: classes3.dex */
public final class lbd {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final long i;

    public lbd(String str, String str2, int i, String str3, int i2, boolean z, boolean z2, boolean z3, long j) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = i2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lbd) {
                lbd lbdVar = (lbd) obj;
                if (!c16.i(this.a, lbdVar.a) || !this.b.equals(lbdVar.b) || this.c != lbdVar.c || !c16.i(this.d, lbdVar.d) || this.e != lbdVar.e || this.f != lbdVar.f || this.g != lbdVar.g || this.h != lbdVar.h || this.i != lbdVar.i) {
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
        int a = hl5.a(this.c, eub.j(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Long.hashCode(this.i) + eub.k(eub.k(eub.k(hl5.a(this.e, hl5.a(0, (a + hashCode) * 31, 31), 31), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder y = nk2.y("VideoTocLink(id=", this.a, ", title=", this.b, ", episodeIndex=");
        nk2.z(this.c, ", parentId=", this.d, ", level=0, count=", y);
        eub.w(y, this.e, ", downloaded=", this.f, ", locked=");
        rs8.z(y, this.g, ", pay=", this.h, ", lastRead=");
        return hl5.q(y, this.i, ")");
    }
}
