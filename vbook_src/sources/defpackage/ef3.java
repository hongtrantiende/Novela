package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ef3  reason: default package */
/* loaded from: classes3.dex */
public final class ef3 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;

    public ef3(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, long j) {
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
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef3)) {
            return false;
        }
        ef3 ef3Var = (ef3) obj;
        if (c16.i(this.a, ef3Var.a) && c16.i(this.b, ef3Var.b) && c16.i(this.c, ef3Var.c) && c16.i(this.d, ef3Var.d) && c16.i(this.e, ef3Var.e) && this.f == ef3Var.f && this.g == ef3Var.g && this.h == ef3Var.h && this.i == ef3Var.i && this.j == ef3Var.j) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + hl5.a(this.i, hl5.a(this.h, hl5.a(this.g, hl5.a(this.f, eub.j(eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("Download(id=", this.a, ", bookId=", this.b, ", title=");
        nk2.C(y, this.c, ", image=", this.d, ", path=");
        a82.u(this.f, this.e, ", downloaded=", ", total=", y);
        rs8.q(this.g, this.h, ", type=", ", status=", y);
        y.append(this.i);
        y.append(", createAt=");
        y.append(this.j);
        y.append(")");
        return y.toString();
    }
}
