package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qp2  reason: default package */
/* loaded from: classes3.dex */
public final class qp2 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final long e;
    public final long f;

    public qp2(String str, String str2, String str3, boolean z, long j, long j2) {
        rs8.w(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp2)) {
            return false;
        }
        qp2 qp2Var = (qp2) obj;
        if (c16.i(this.a, qp2Var.a) && c16.i(this.b, qp2Var.b) && c16.i(this.c, qp2Var.c) && this.d == qp2Var.d && this.e == qp2Var.e && this.f == qp2Var.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + hl5.c(eub.k(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), this.e, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("DbTTSWord(id=", this.a, ", word=", this.b, ", replace=");
        rs8.y(y, this.c, ", ignoreCase=", this.d, ", createAt=");
        y.append(this.e);
        return a82.n(y, ", updateAt=", this.f, ")");
    }
}
