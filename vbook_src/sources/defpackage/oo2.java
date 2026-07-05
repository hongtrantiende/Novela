package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oo2  reason: default package */
/* loaded from: classes3.dex */
public final class oo2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final long f;

    public oo2(String str, String str2, String str3, String str4, boolean z, long j) {
        hl5.z(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo2)) {
            return false;
        }
        oo2 oo2Var = (oo2) obj;
        if (c16.i(this.a, oo2Var.a) && c16.i(this.b, oo2Var.b) && c16.i(this.c, oo2Var.c) && c16.i(this.d, oo2Var.d) && this.e == oo2Var.e && this.f == oo2Var.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + eub.k(eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder y = nk2.y("DbName(id=", this.a, ", bookId=", this.b, ", word=");
        nk2.C(y, this.c, ", replace=", this.d, ", ignoreCase=");
        y.append(this.e);
        y.append(", createAt=");
        y.append(this.f);
        y.append(")");
        return y.toString();
    }
}
