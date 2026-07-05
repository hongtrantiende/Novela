package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cp2  reason: default package */
/* loaded from: classes3.dex */
public final class cp2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final long g;
    public final long h;

    public cp2(String str, String str2, String str3, String str4, int i, int i2, long j, long j2) {
        hl5.z(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = i2;
        this.g = j;
        this.h = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp2)) {
            return false;
        }
        cp2 cp2Var = (cp2) obj;
        if (c16.i(this.a, cp2Var.a) && c16.i(this.b, cp2Var.b) && c16.i(this.c, cp2Var.c) && c16.i(this.d, cp2Var.d) && this.e == cp2Var.e && this.f == cp2Var.f && this.g == cp2Var.g && this.h == cp2Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + hl5.c(hl5.a(this.f, hl5.a(this.e, eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("DbQtWord(id=", this.a, ", bookId=", this.b, ", word=");
        nk2.C(y, this.c, ", trans=", this.d, ", type=");
        rs8.q(this.e, this.f, ", mode=", ", createAt=", y);
        y.append(this.g);
        return a82.n(y, ", updateAt=", this.h, ")");
    }
}
