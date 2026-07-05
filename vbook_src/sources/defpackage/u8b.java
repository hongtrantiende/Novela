package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u8b  reason: default package */
/* loaded from: classes3.dex */
public final class u8b {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public u8b(String str, String str2, String str3, String str4, String str5) {
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u8b) {
                u8b u8bVar = (u8b) obj;
                if (!this.a.equals(u8bVar.a) || !this.b.equals(u8bVar.b) || !c16.i(this.c, u8bVar.c) || !this.d.equals(u8bVar.d) || !this.e.equals(u8bVar.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder y = nk2.y("Suggest(name=", this.a, ", cover=", this.b, ", path=");
        nk2.C(y, this.c, ", description=", this.d, ", tag=");
        return s21.q(y, this.e, ")");
    }
}
