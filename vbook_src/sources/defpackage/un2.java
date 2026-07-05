package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: un2  reason: default package */
/* loaded from: classes3.dex */
public final class un2 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final Map p;
    public final Map q;
    public final Map r;
    public final Map s;
    public final Map t;
    public final long u;
    public final long v;
    public final long w;
    public final long x;

    public un2(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, String str9, int i2, boolean z, boolean z2, boolean z3, boolean z4, Map map, Map map2, Map map3, Map map4, Map map5, long j, long j2, long j3, long j4) {
        s21.B(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        map4.getClass();
        map5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = i2;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = map;
        this.q = map2;
        this.r = map3;
        this.s = map4;
        this.t = map5;
        this.u = j;
        this.v = j2;
        this.w = j3;
        this.x = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un2)) {
            return false;
        }
        un2 un2Var = (un2) obj;
        if (c16.i(this.a, un2Var.a) && c16.i(this.b, un2Var.b) && c16.i(this.c, un2Var.c) && this.d == un2Var.d && c16.i(this.e, un2Var.e) && c16.i(this.f, un2Var.f) && c16.i(this.g, un2Var.g) && c16.i(this.h, un2Var.h) && c16.i(this.i, un2Var.i) && c16.i(this.j, un2Var.j) && this.k == un2Var.k && this.l == un2Var.l && this.m == un2Var.m && this.n == un2Var.n && this.o == un2Var.o && c16.i(this.p, un2Var.p) && c16.i(this.q, un2Var.q) && c16.i(this.r, un2Var.r) && c16.i(this.s, un2Var.s) && c16.i(this.t, un2Var.t) && this.u == un2Var.u && this.v == un2Var.v && this.w == un2Var.w && this.x == un2Var.x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.x) + hl5.c(hl5.c(hl5.c(rs8.a(rs8.a(rs8.a(rs8.a(rs8.a(eub.k(eub.k(eub.k(eub.k(hl5.a(this.k, eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(hl5.a(this.d, eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), this.u, 31), this.v, 31), this.w, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("DbExtension(id=", this.a, ", name=", this.b, ", author=");
        a82.u(this.d, this.c, ", version=", ", source=", y);
        nk2.C(y, this.e, ", path=", this.f, ", regex=");
        nk2.C(y, this.g, ", icon=", this.h, ", description=");
        nk2.C(y, this.i, ", language=", this.j, ", type=");
        eub.w(y, this.k, ", nsfw=", this.l, ", development=");
        rs8.z(y, this.m, ", draft=", this.n, ", encrypt=");
        y.append(this.o);
        y.append(", scriptMetadata=");
        y.append(this.p);
        y.append(", settingMetadata=");
        y.append(this.q);
        y.append(", scriptData=");
        y.append(this.r);
        y.append(", settingData=");
        y.append(this.s);
        y.append(", translateData=");
        y.append(this.t);
        y.append(", pinedAt=");
        y.append(this.u);
        rs8.x(y, ", lastUse=", this.v, ", createAt=");
        y.append(this.w);
        return a82.n(y, ", updateAt=", this.x, ")");
    }
}
