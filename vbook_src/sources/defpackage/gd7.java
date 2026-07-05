package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gd7  reason: default package */
/* loaded from: classes.dex */
public final class gd7 {
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
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final String q;
    public final String r;

    public gd7(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, String str2, String str3) {
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
        this.m = i12;
        this.n = i13;
        this.o = i14;
        this.p = i15;
        this.q = str2;
        this.r = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gd7) {
                gd7 gd7Var = (gd7) obj;
                if (!this.a.equals(gd7Var.a) || this.b != gd7Var.b || this.c != gd7Var.c || this.d != gd7Var.d || this.e != gd7Var.e || this.f != gd7Var.f || this.g != gd7Var.g || this.h != gd7Var.h || this.i != gd7Var.i || this.j != gd7Var.j || this.k != gd7Var.k || this.l != gd7Var.l || this.m != gd7Var.m || this.n != gd7Var.n || this.o != gd7Var.o || this.p != gd7Var.p || !this.q.equals(gd7Var.q) || !this.r.equals(gd7Var.r)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.r.hashCode() + eub.j(hl5.a(this.p, hl5.a(this.o, hl5.a(this.n, hl5.a(this.m, hl5.a(this.l, hl5.a(this.k, hl5.a(this.j, hl5.a(this.i, hl5.a(this.h, hl5.a(this.g, hl5.a(this.f, hl5.a(this.e, hl5.a(this.d, hl5.a(this.c, hl5.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.q);
    }

    public final String toString() {
        StringBuilder s = s21.s("MobiHeader(identifier=", this.a, ", length=", this.b, ", type=");
        rs8.q(this.c, this.d, ", encoding=", ", uid=", s);
        rs8.q(this.e, this.f, ", version=", ", titleOffset=", s);
        rs8.q(this.g, this.h, ", titleLength=", ", localeRegion=", s);
        rs8.q(this.i, this.j, ", localeLanguage=", ", resourceStart=", s);
        rs8.q(this.k, this.l, ", huffcdic=", ", numHuffcdic=", s);
        rs8.q(this.m, this.n, ", exthFlag=", ", trailingFlags=", s);
        rs8.q(this.o, this.p, ", indx=", ", title=", s);
        return nk2.w(s, this.q, ", languege=", this.r, ")");
    }
}
