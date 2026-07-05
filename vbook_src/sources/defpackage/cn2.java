package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cn2  reason: default package */
/* loaded from: classes3.dex */
public final class cn2 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;

    public cn2(String str, String str2, String str3, boolean z, long j, long j2, long j3) {
        rs8.w(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = j;
        this.f = j2;
        this.g = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn2)) {
            return false;
        }
        cn2 cn2Var = (cn2) obj;
        if (c16.i(this.a, cn2Var.a) && c16.i(this.b, cn2Var.b) && c16.i(this.c, cn2Var.c) && this.d == cn2Var.d && this.e == cn2Var.e && this.f == cn2Var.f && this.g == cn2Var.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + hl5.c(hl5.c(eub.k(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), this.e, 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("DbDomain(id=", this.a, ", domain=", this.b, ", replace=");
        rs8.y(y, this.c, ", enabled=", this.d, ", position=");
        y.append(this.e);
        rs8.x(y, ", createAt=", this.f, ", updateAt=");
        return hl5.q(y, this.g, ")");
    }
}
