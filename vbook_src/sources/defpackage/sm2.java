package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sm2  reason: default package */
/* loaded from: classes3.dex */
public final class sm2 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final long k;
    public final long l;

    public sm2(String str, String str2, String str3, int i, String str4, int i2, boolean z, boolean z2, boolean z3, long j, long j2, long j3) {
        hl5.z(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = i2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = j;
        this.k = j2;
        this.l = j3;
    }

    public final int a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm2)) {
            return false;
        }
        sm2 sm2Var = (sm2) obj;
        if (c16.i(this.a, sm2Var.a) && c16.i(this.b, sm2Var.b) && c16.i(this.c, sm2Var.c) && this.d == sm2Var.d && c16.i(this.e, sm2Var.e) && this.f == sm2Var.f && this.g == sm2Var.g && this.h == sm2Var.h && this.i == sm2Var.i && this.j == sm2Var.j && this.k == sm2Var.k && this.l == sm2Var.l) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.l) + hl5.c(hl5.c(eub.k(eub.k(eub.k(hl5.a(this.f, eub.j(hl5.a(this.d, eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i), this.j, 31), this.k, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("DbChapter(id=", this.a, ", bookId=", this.b, ", pathId=");
        a82.u(this.d, this.c, ", position=", ", path=", y);
        a82.u(this.f, this.e, ", count=", ", downloaded=", y);
        rs8.z(y, this.g, ", pay=", this.h, ", lock=");
        y.append(this.i);
        y.append(", lastRead=");
        y.append(this.j);
        rs8.x(y, ", createAt=", this.k, ", updateAt=");
        return hl5.q(y, this.l, ")");
    }
}
