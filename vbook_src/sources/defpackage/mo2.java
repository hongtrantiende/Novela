package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mo2  reason: default package */
/* loaded from: classes3.dex */
public final class mo2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;

    public mo2(String str, String str2, String str3, String str4, long j) {
        hl5.z(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo2)) {
            return false;
        }
        mo2 mo2Var = (mo2) obj;
        if (c16.i(this.a, mo2Var.a) && c16.i(this.b, mo2Var.b) && c16.i(this.c, mo2Var.c) && c16.i(this.d, mo2Var.d) && this.e == mo2Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder y = nk2.y("DbExtensionSource(id=", this.a, ", path=", this.b, ", author=");
        nk2.C(y, this.c, ", description=", this.d, ", createAt=");
        return hl5.q(y, this.e, ")");
    }
}
