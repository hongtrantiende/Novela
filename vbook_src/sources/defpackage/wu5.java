package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wu5  reason: default package */
/* loaded from: classes.dex */
public final class wu5 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;

    public wu5(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = i11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wu5) {
                wu5 wu5Var = (wu5) obj;
                if (!this.a.equals(wu5Var.a) || this.b != wu5Var.b || this.c != wu5Var.c || this.d != wu5Var.d || this.e != wu5Var.e || this.f != wu5Var.f || this.g != wu5Var.g || this.h != wu5Var.h || this.i != wu5Var.i || this.j != wu5Var.j || this.k != wu5Var.k || this.l != wu5Var.l) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.l) + hl5.a(this.k, hl5.a(this.j, hl5.a(this.i, hl5.a(this.h, hl5.a(this.g, hl5.a(this.f, hl5.a(this.e, hl5.a(this.d, hl5.a(this.c, hl5.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder s = s21.s("IndxHeader(magic=", this.a, ", length=", this.b, ", type=");
        rs8.q(this.c, this.d, ", idxt=", ", numRecords=", s);
        rs8.q(this.e, this.f, ", encoding=", ", language=", s);
        rs8.q(this.g, this.h, ", total=", ", ordt=", s);
        rs8.q(this.i, this.j, ", ligt=", ", numLigt=", s);
        return hl5.j(this.k, this.l, ", numCncx=", ")", s);
    }
}
