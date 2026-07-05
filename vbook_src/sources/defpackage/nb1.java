package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nb1  reason: default package */
/* loaded from: classes3.dex */
public final class nb1 {
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final long h;

    public nb1(String str, int i, String str2, int i2, boolean z, boolean z2, boolean z3, long j) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = i2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb1)) {
            return false;
        }
        nb1 nb1Var = (nb1) obj;
        if (c16.i(this.a, nb1Var.a) && this.b == nb1Var.b && c16.i(this.c, nb1Var.c) && this.d == nb1Var.d && this.e == nb1Var.e && this.f == nb1Var.f && this.g == nb1Var.g && this.h == nb1Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + eub.k(eub.k(eub.k(hl5.a(this.d, eub.j(hl5.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder s = s21.s("Chapter(id=", this.a, ", index=", this.b, ", path=");
        a82.u(this.d, this.c, ", count=", ", downloaded=", s);
        rs8.z(s, this.e, ", locked=", this.f, ", pay=");
        s.append(this.g);
        s.append(", lastRead=");
        s.append(this.h);
        s.append(")");
        return s.toString();
    }
}
