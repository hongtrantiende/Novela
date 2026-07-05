package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: en2  reason: default package */
/* loaded from: classes3.dex */
public final class en2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final long l;

    public en2(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, int i5, int i6, long j) {
        s21.B(str, str2, str3, str4, str5);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.l = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en2)) {
            return false;
        }
        en2 en2Var = (en2) obj;
        if (c16.i(this.a, en2Var.a) && c16.i(this.b, en2Var.b) && c16.i(this.c, en2Var.c) && c16.i(this.d, en2Var.d) && c16.i(this.e, en2Var.e) && this.f == en2Var.f && this.g == en2Var.g && this.h == en2Var.h && this.i == en2Var.i && this.j == en2Var.j && this.k == en2Var.k && this.l == en2Var.l) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.l) + hl5.a(this.k, hl5.a(this.j, hl5.a(this.i, hl5.a(this.h, hl5.a(this.g, hl5.a(this.f, eub.j(eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("DbDownload(id=", this.a, ", bookId=", this.b, ", title=");
        nk2.C(y, this.c, ", image=", this.d, ", path=");
        a82.u(this.f, this.e, ", start=", ", end=", y);
        rs8.q(this.g, this.h, ", downloaded=", ", total=", y);
        rs8.q(this.i, this.j, ", type=", ", status=", y);
        y.append(this.k);
        y.append(", createAt=");
        y.append(this.l);
        y.append(")");
        return y.toString();
    }
}
