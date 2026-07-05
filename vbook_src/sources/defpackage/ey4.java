package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ey4  reason: default package */
/* loaded from: classes3.dex */
public final class ey4 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final long m;
    public final long n;

    public ey4(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, int i2, boolean z, boolean z2, boolean z3, long j, long j2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = i2;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = j;
        this.n = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ey4) {
                ey4 ey4Var = (ey4) obj;
                if (!this.a.equals(ey4Var.a) || !this.b.equals(ey4Var.b) || !this.c.equals(ey4Var.c) || this.d != ey4Var.d || !this.e.equals(ey4Var.e) || !this.f.equals(ey4Var.f) || !this.g.equals(ey4Var.g) || !this.h.equals(ey4Var.h) || this.i != ey4Var.i || this.j != ey4Var.j || this.k != ey4Var.k || this.l != ey4Var.l || this.m != ey4Var.m || this.n != ey4Var.n) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.n) + hl5.c(eub.k(eub.k(eub.k(hl5.a(this.i, eub.j(eub.j(eub.j(eub.j(hl5.a(this.d, eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31, this.j), 31, this.k), 31, this.l), this.m, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("GetTranslateExtension(id=", this.a, ", name=", this.b, ", author=");
        a82.u(this.d, this.c, ", version=", ", source=", y);
        nk2.C(y, this.e, ", path=", this.f, ", description=");
        nk2.C(y, this.g, ", language=", this.h, ", type=");
        eub.w(y, this.i, ", nsfw=", this.j, ", development=");
        rs8.z(y, this.k, ", draft=", this.l, ", pinedAt=");
        y.append(this.m);
        return a82.n(y, ", updateAt=", this.n, ")");
    }
}
