package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v8b  reason: default package */
/* loaded from: classes3.dex */
public final class v8b {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public v8b(String str, String str2, String str3, String str4, String str5, boolean z) {
        hl5.z(str, str3, str4, str5);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v8b) {
                v8b v8bVar = (v8b) obj;
                if (!c16.i(this.a, v8bVar.a) || !this.b.equals(v8bVar.b) || !c16.i(this.c, v8bVar.c) || !c16.i(this.d, v8bVar.d) || !c16.i(this.e, v8bVar.e) || this.f != v8bVar.f) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + eub.j(eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder y = nk2.y("SuggestBook(id=", this.a, ", name=", this.b, ", cover=");
        nk2.C(y, this.c, ", source=", this.d, ", path=");
        y.append(this.e);
        y.append(", isNsfw=");
        y.append(this.f);
        y.append(")");
        return y.toString();
    }
}
