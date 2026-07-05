package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rsa  reason: default package */
/* loaded from: classes3.dex */
public final class rsa {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public rsa(String str, String str2, int i, String str3, boolean z, boolean z2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rsa) {
                rsa rsaVar = (rsa) obj;
                if (!this.a.equals(rsaVar.a) || !c16.i(this.b, rsaVar.b) || this.c != rsaVar.c || !this.d.equals(rsaVar.d) || this.e != rsaVar.e || this.f != rsaVar.f) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + eub.k(eub.j(hl5.a(this.c, eub.j(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder y = nk2.y("SourceChapter(name=", this.a, ", path=", this.b, ", type=");
        nk2.z(this.c, ", description=", this.d, ", isLock=", y);
        y.append(this.e);
        y.append(", isPay=");
        y.append(this.f);
        y.append(")");
        return y.toString();
    }
}
