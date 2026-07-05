package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: ha8  reason: default package */
/* loaded from: classes3.dex */
public final class ha8 {
    public static final ga8 Companion = new Object();
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final String F;
    public final String G;
    public final boolean H;
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final boolean n;
    public final int o;
    public final String p;
    public final String q;
    public final boolean r;
    public final long s;
    public final int t;
    public final long u;
    public final int v;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    public /* synthetic */ ha8(int i, int i2, String str, String str2, String str3, int i3, String str4, String str5, String str6, String str7, long j, String str8, String str9, String str10, String str11, boolean z, int i4, String str12, String str13, boolean z2, long j2, int i5, long j3, int i6, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, boolean z3) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = 0;
        } else {
            this.d = i3;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str6;
        }
        if ((i & Token.CASE) == 0) {
            this.h = "";
        } else {
            this.h = str7;
        }
        if ((i & 256) == 0) {
            this.i = 0L;
        } else {
            this.i = j;
        }
        if ((i & 512) == 0) {
            this.j = "";
        } else {
            this.j = str8;
        }
        if ((i & 1024) == 0) {
            this.k = "";
        } else {
            this.k = str9;
        }
        if ((i & 2048) == 0) {
            this.l = "";
        } else {
            this.l = str10;
        }
        if ((i & 4096) == 0) {
            this.m = "";
        } else {
            this.m = str11;
        }
        this.n = (i & 8192) == 0 ? true : z;
        if ((i & 16384) == 0) {
            this.o = 0;
        } else {
            this.o = i4;
        }
        if ((32768 & i) == 0) {
            this.p = "";
        } else {
            this.p = str12;
        }
        if ((65536 & i) == 0) {
            this.q = "";
        } else {
            this.q = str13;
        }
        if ((131072 & i) == 0) {
            this.r = false;
        } else {
            this.r = z2;
        }
        if ((262144 & i) == 0) {
            this.s = 0L;
        } else {
            this.s = j2;
        }
        if ((524288 & i) == 0) {
            this.t = 0;
        } else {
            this.t = i5;
        }
        this.u = (1048576 & i) != 0 ? j3 : 0L;
        if ((2097152 & i) == 0) {
            this.v = 0;
        } else {
            this.v = i6;
        }
        if ((4194304 & i) == 0) {
            this.w = "";
        } else {
            this.w = str14;
        }
        if ((8388608 & i) == 0) {
            this.x = "";
        } else {
            this.x = str15;
        }
        if ((16777216 & i) == 0) {
            this.y = "";
        } else {
            this.y = str16;
        }
        if ((33554432 & i) == 0) {
            this.z = "";
        } else {
            this.z = str17;
        }
        if ((67108864 & i) == 0) {
            this.A = "";
        } else {
            this.A = str18;
        }
        if ((134217728 & i) == 0) {
            this.B = "";
        } else {
            this.B = str19;
        }
        if ((268435456 & i) == 0) {
            this.C = "";
        } else {
            this.C = str20;
        }
        if ((536870912 & i) == 0) {
            this.D = "";
        } else {
            this.D = str21;
        }
        if ((1073741824 & i) == 0) {
            this.E = "";
        } else {
            this.E = str22;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.F = "";
        } else {
            this.F = str23;
        }
        if ((i2 & 1) == 0) {
            this.G = "";
        } else {
            this.G = str24;
        }
        if ((i2 & 2) == 0) {
            this.H = false;
        } else {
            this.H = z3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha8)) {
            return false;
        }
        ha8 ha8Var = (ha8) obj;
        if (c16.i(this.a, ha8Var.a) && c16.i(this.b, ha8Var.b) && c16.i(this.c, ha8Var.c) && this.d == ha8Var.d && c16.i(this.e, ha8Var.e) && c16.i(this.f, ha8Var.f) && c16.i(this.g, ha8Var.g) && c16.i(this.h, ha8Var.h) && this.i == ha8Var.i && c16.i(this.j, ha8Var.j) && c16.i(this.k, ha8Var.k) && c16.i(this.l, ha8Var.l) && c16.i(this.m, ha8Var.m) && this.n == ha8Var.n && this.o == ha8Var.o && c16.i(this.p, ha8Var.p) && c16.i(this.q, ha8Var.q) && this.r == ha8Var.r && this.s == ha8Var.s && this.t == ha8Var.t && this.u == ha8Var.u && this.v == ha8Var.v && c16.i(this.w, ha8Var.w) && c16.i(this.x, ha8Var.x) && c16.i(this.y, ha8Var.y) && c16.i(this.z, ha8Var.z) && c16.i(this.A, ha8Var.A) && c16.i(this.B, ha8Var.B) && c16.i(this.C, ha8Var.C) && c16.i(this.D, ha8Var.D) && c16.i(this.E, ha8Var.E) && c16.i(this.F, ha8Var.F) && c16.i(this.G, ha8Var.G) && this.H == ha8Var.H) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.H) + eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(hl5.a(this.v, hl5.c(hl5.a(this.t, hl5.c(eub.k(eub.j(eub.j(hl5.a(this.o, eub.k(eub.j(eub.j(eub.j(eub.j(hl5.c(eub.j(eub.j(eub.j(eub.j(hl5.a(this.d, eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), this.i, 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31), 31, this.p), 31, this.q), 31, this.r), this.s, 31), 31), this.u, 31), 31), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C), 31, this.D), 31, this.E), 31, this.F), 31, this.G);
    }

    public final String toString() {
        StringBuilder y = nk2.y("OldSyncExtension(id=", this.a, ", name=", this.b, ", author=");
        a82.u(this.d, this.c, ", version=", ", source=", y);
        nk2.C(y, this.e, ", icon=", this.f, ", regexp=");
        nk2.C(y, this.g, ", description=", this.h, ", lastUpdate=");
        y.append(this.i);
        y.append(", url=");
        y.append(this.j);
        nk2.C(y, ", local=", this.k, ", language=", this.l);
        y.append(", type=");
        y.append(this.m);
        y.append(", isEnable=");
        y.append(this.n);
        y.append(", priority=");
        y.append(this.o);
        y.append(", tag=");
        y.append(this.p);
        y.append(", agent=");
        y.append(this.q);
        y.append(", debug=");
        y.append(this.r);
        rs8.x(y, ", lastUse=", this.s, ", searchIndex=");
        y.append(this.t);
        y.append(", delayConnect=");
        y.append(this.u);
        y.append(", numConnect=");
        y.append(this.v);
        y.append(", discovery=");
        y.append(this.w);
        nk2.C(y, ", home=", this.x, ", detail=", this.y);
        nk2.C(y, ", page=", this.z, ", site=", this.A);
        nk2.C(y, ", toc=", this.B, ", chap=", this.C);
        nk2.C(y, ", search=", this.D, ", genre=", this.E);
        nk2.C(y, ", data=", this.F, ", config=", this.G);
        y.append(", encrypt=");
        y.append(this.H);
        y.append(")");
        return y.toString();
    }
}
