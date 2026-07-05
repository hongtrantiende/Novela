package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: avc  reason: default package */
/* loaded from: classes.dex */
public final class avc {
    public byte a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof avc) {
                avc avcVar = (avc) obj;
                if (this.a != avcVar.a || !this.b.equals(avcVar.b) || !this.c.equals(avcVar.c) || !this.d.equals(avcVar.d) || !this.e.equals(avcVar.e) || !this.f.equals(avcVar.f) || !this.g.equals(avcVar.g) || !this.h.equals(avcVar.h) || !this.i.equals(avcVar.i)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.i.hashCode() + eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(Byte.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        byte b = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        String str6 = this.g;
        String str7 = this.h;
        String str8 = this.i;
        StringBuilder r = s21.r("UmdHeader(umdType=", b, ", title=", str, ", author=");
        nk2.C(r, str2, ", year=", str3, ", month=");
        nk2.C(r, str4, ", day=", str5, ", bookType=");
        nk2.C(r, str6, ", bookMan=", str7, ", shopKeeper=");
        return s21.q(r, str8, ")");
    }
}
