package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zp2  reason: default package */
/* loaded from: classes3.dex */
public final class zp2 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final long f;
    public final long g;

    public zp2(int i, long j, long j2, String str, String str2, String str3, boolean z) {
        rs8.w(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = z;
        this.f = j;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp2)) {
            return false;
        }
        zp2 zp2Var = (zp2) obj;
        if (c16.i(this.a, zp2Var.a) && c16.i(this.b, zp2Var.b) && c16.i(this.c, zp2Var.c) && this.d == zp2Var.d && this.e == zp2Var.e && this.f == zp2Var.f && this.g == zp2Var.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + hl5.c(eub.k(hl5.a(this.d, eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), this.f, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("DbTrash(id=", this.a, ", bookId=", this.b, ", word=");
        a82.u(this.d, this.c, ", type=", ", regex=", y);
        y.append(this.e);
        y.append(", createAt=");
        y.append(this.f);
        return a82.n(y, ", updateAt=", this.g, ")");
    }
}
