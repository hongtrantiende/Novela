package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l54  reason: default package */
/* loaded from: classes3.dex */
public final class l54 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final boolean h;
    public final int i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final long r;

    public l54(String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z, int i2, String str7, String str8, String str9, String str10, boolean z2, boolean z3, boolean z4, boolean z5, long j) {
        s21.B(str, str2, str3, str4, str5);
        rs8.w(str6, str9, str10);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = i;
        this.h = z;
        this.i = i2;
        this.j = str7;
        this.k = str8;
        this.l = str9;
        this.m = str10;
        this.n = z2;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.r = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l54) {
                l54 l54Var = (l54) obj;
                if (!c16.i(this.a, l54Var.a) || !c16.i(this.b, l54Var.b) || !c16.i(this.c, l54Var.c) || !c16.i(this.d, l54Var.d) || !c16.i(this.e, l54Var.e) || !c16.i(this.f, l54Var.f) || this.g != l54Var.g || this.h != l54Var.h || this.i != l54Var.i || !this.j.equals(l54Var.j) || !this.k.equals(l54Var.k) || !c16.i(this.l, l54Var.l) || !c16.i(this.m, l54Var.m) || this.n != l54Var.n || this.o != l54Var.o || this.p != l54Var.p || this.q != l54Var.q || this.r != l54Var.r) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.r) + eub.k(eub.k(eub.k(eub.k(eub.j(eub.j(eub.j(eub.j(hl5.a(this.i, eub.k(hl5.a(this.g, eub.j(eub.j(eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h), 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q);
    }

    public final String toString() {
        StringBuilder y = nk2.y("ExtensionInfo(id=", this.a, ", name=", this.b, ", icon=");
        nk2.C(y, this.c, ", source=", this.d, ", host=");
        nk2.C(y, this.e, ", author=", this.f, ", version=");
        eub.w(y, this.g, ", isNsfw=", this.h, ", type=");
        nk2.z(this.i, ", language=", this.j, ", country=", y);
        nk2.C(y, this.k, ", description=", this.l, ", path=");
        rs8.y(y, this.m, ", isDevelopment=", this.n, ", isDraft=");
        rs8.z(y, this.o, ", isInstalled=", this.p, ", isPined=");
        y.append(this.q);
        y.append(", update=");
        y.append(this.r);
        y.append(")");
        return y.toString();
    }
}
