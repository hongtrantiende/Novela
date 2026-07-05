package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mvb  reason: default package */
/* loaded from: classes3.dex */
public final class mvb {
    public final String a;
    public final String b;
    public final String c;

    public mvb(String str, String str2, String str3) {
        rs8.w(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvb)) {
            return false;
        }
        mvb mvbVar = (mvb) obj;
        if (c16.i(this.a, mvbVar.a) && c16.i(this.b, mvbVar.b) && c16.i(this.c, mvbVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return s21.q(nk2.y("TextLookup(id=", this.a, ", name=", this.b, ", url="), this.c, ")");
    }
}
