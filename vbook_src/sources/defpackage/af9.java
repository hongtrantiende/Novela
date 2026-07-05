package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: af9  reason: default package */
/* loaded from: classes3.dex */
public final class af9 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;

    public af9(String str, String str2, String str3, String str4, int i, int i2) {
        hl5.z(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af9)) {
            return false;
        }
        af9 af9Var = (af9) obj;
        if (c16.i(this.a, af9Var.a) && c16.i(this.b, af9Var.b) && c16.i(this.c, af9Var.c) && c16.i(this.d, af9Var.d) && this.e == af9Var.e && this.f == af9Var.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + hl5.a(this.e, eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("QtWord(id=", this.a, ", bookId=", this.b, ", word=");
        nk2.C(y, this.c, ", trans=", this.d, ", type=");
        return hl5.j(this.e, this.f, ", mode=", ")", y);
    }
}
