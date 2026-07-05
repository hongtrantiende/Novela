package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qn4  reason: default package */
/* loaded from: classes3.dex */
public final class qn4 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final long i;

    public qn4(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, int i, long j) {
        hl5.z(str, str3, str4, str5);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = z2;
        this.h = i;
        this.i = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qn4) {
                qn4 qn4Var = (qn4) obj;
                if (!c16.i(this.a, qn4Var.a) || !this.b.equals(qn4Var.b) || !c16.i(this.c, qn4Var.c) || !c16.i(this.d, qn4Var.d) || !c16.i(this.e, qn4Var.e) || this.f != qn4Var.f || this.g != qn4Var.g || this.h != qn4Var.h || this.i != qn4Var.i) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.i) + hl5.a(this.h, eub.k(eub.k(eub.j(eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("FollowBook(id=", this.a, ", name=", this.b, ", cover=");
        nk2.C(y, this.c, ", source=", this.d, ", bookPath=");
        rs8.y(y, this.e, ", isNsfw=", this.f, ", isFollow=");
        y.append(this.g);
        y.append(", newUpdateCount=");
        y.append(this.h);
        y.append(", updateAt=");
        return hl5.q(y, this.i, ")");
    }
}
