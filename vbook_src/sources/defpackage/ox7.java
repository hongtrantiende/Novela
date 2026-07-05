package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ox7  reason: default package */
/* loaded from: classes3.dex */
public final class ox7 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public ox7(String str, String str2, String str3, String str4, boolean z) {
        hl5.z(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox7)) {
            return false;
        }
        ox7 ox7Var = (ox7) obj;
        if (c16.i(this.a, ox7Var.a) && c16.i(this.b, ox7Var.b) && c16.i(this.c, ox7Var.c) && c16.i(this.d, ox7Var.d) && this.e == ox7Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder y = nk2.y("NameWord(id=", this.a, ", bookId=", this.b, ", word=");
        nk2.C(y, this.c, ", replace=", this.d, ", ignoreCase=");
        return rs8.m(")", y, this.e);
    }
}
