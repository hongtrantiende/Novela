package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: s98  reason: default package */
/* loaded from: classes3.dex */
public final class s98 {
    public static final r98 Companion = new Object();
    public final int A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final String E;
    public final boolean F;
    public final boolean G;
    public final String H;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final int k;
    public final float l;
    public final int m;
    public final float n;
    public final String o;
    public final String p;
    public final long q;
    public final long r;
    public final long s;
    public final boolean t;
    public final long u;
    public final long v;
    public final long w;
    public final boolean x;
    public final int y;
    public final int z;

    public /* synthetic */ s98(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i3, float f, int i4, float f2, String str11, String str12, long j, long j2, long j3, boolean z, long j4, long j5, long j6, boolean z2, int i5, int i6, int i7, boolean z3, boolean z4, boolean z5, String str13, boolean z6, boolean z7, String str14) {
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
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str7;
        }
        if ((i & Token.CASE) == 0) {
            this.h = "";
        } else {
            this.h = str8;
        }
        if ((i & 256) == 0) {
            this.i = "";
        } else {
            this.i = str9;
        }
        if ((i & 512) == 0) {
            this.j = "";
        } else {
            this.j = str10;
        }
        if ((i & 1024) == 0) {
            this.k = 0;
        } else {
            this.k = i3;
        }
        if ((i & 2048) == 0) {
            this.l = nae.e;
        } else {
            this.l = f;
        }
        if ((i & 4096) == 0) {
            this.m = 0;
        } else {
            this.m = i4;
        }
        if ((i & 8192) == 0) {
            this.n = nae.e;
        } else {
            this.n = f2;
        }
        if ((i & 16384) == 0) {
            this.o = "";
        } else {
            this.o = str11;
        }
        if ((32768 & i) == 0) {
            this.p = "";
        } else {
            this.p = str12;
        }
        if ((65536 & i) == 0) {
            this.q = 0L;
        } else {
            this.q = j;
        }
        if ((131072 & i) == 0) {
            this.r = 0L;
        } else {
            this.r = j2;
        }
        if ((262144 & i) == 0) {
            this.s = 0L;
        } else {
            this.s = j3;
        }
        if ((524288 & i) == 0) {
            this.t = false;
        } else {
            this.t = z;
        }
        this.u = (1048576 & i) == 0 ? -1L : j4;
        if ((2097152 & i) == 0) {
            this.v = 0L;
        } else {
            this.v = j5;
        }
        this.w = (4194304 & i) != 0 ? j6 : 0L;
        if ((8388608 & i) == 0) {
            this.x = false;
        } else {
            this.x = z2;
        }
        if ((16777216 & i) == 0) {
            this.y = 0;
        } else {
            this.y = i5;
        }
        if ((33554432 & i) == 0) {
            this.z = 0;
        } else {
            this.z = i6;
        }
        if ((67108864 & i) == 0) {
            this.A = 0;
        } else {
            this.A = i7;
        }
        if ((134217728 & i) == 0) {
            this.B = false;
        } else {
            this.B = z3;
        }
        if ((268435456 & i) == 0) {
            this.C = false;
        } else {
            this.C = z4;
        }
        if ((536870912 & i) == 0) {
            this.D = false;
        } else {
            this.D = z5;
        }
        if ((1073741824 & i) == 0) {
            this.E = "";
        } else {
            this.E = str13;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.F = false;
        } else {
            this.F = z6;
        }
        if ((i2 & 1) == 0) {
            this.G = false;
        } else {
            this.G = z7;
        }
        if ((i2 & 2) == 0) {
            this.H = "";
        } else {
            this.H = str14;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s98)) {
            return false;
        }
        s98 s98Var = (s98) obj;
        if (c16.i(this.a, s98Var.a) && c16.i(this.b, s98Var.b) && c16.i(this.c, s98Var.c) && c16.i(this.d, s98Var.d) && c16.i(this.e, s98Var.e) && c16.i(this.f, s98Var.f) && c16.i(this.g, s98Var.g) && c16.i(this.h, s98Var.h) && c16.i(this.i, s98Var.i) && c16.i(this.j, s98Var.j) && this.k == s98Var.k && Float.compare(this.l, s98Var.l) == 0 && this.m == s98Var.m && Float.compare(this.n, s98Var.n) == 0 && c16.i(this.o, s98Var.o) && c16.i(this.p, s98Var.p) && this.q == s98Var.q && this.r == s98Var.r && this.s == s98Var.s && this.t == s98Var.t && this.u == s98Var.u && this.v == s98Var.v && this.w == s98Var.w && this.x == s98Var.x && this.y == s98Var.y && this.z == s98Var.z && this.A == s98Var.A && this.B == s98Var.B && this.C == s98Var.C && this.D == s98Var.D && c16.i(this.E, s98Var.E) && this.F == s98Var.F && this.G == s98Var.G && c16.i(this.H, s98Var.H)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.H.hashCode() + eub.k(eub.k(eub.j(eub.k(eub.k(eub.k(hl5.a(this.A, hl5.a(this.z, hl5.a(this.y, eub.k(hl5.c(hl5.c(hl5.c(eub.k(hl5.c(hl5.c(hl5.c(eub.j(eub.j(nk2.d(this.n, hl5.a(this.m, nk2.d(this.l, hl5.a(this.k, eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31), 31), 31), 31, this.o), 31, this.p), this.q, 31), this.r, 31), this.s, 31), 31, this.t), this.u, 31), this.v, 31), this.w, 31), 31, this.x), 31), 31), 31), 31, this.B), 31, this.C), 31, this.D), 31, this.E), 31, this.F), 31, this.G);
    }

    public final String toString() {
        StringBuilder y = nk2.y("OldSyncBook(id=", this.a, ", extensionId=", this.b, ", name=");
        nk2.C(y, this.c, ", author=", this.d, ", nameTrans=");
        nk2.C(y, this.e, ", authorTrans=", this.f, ", cover=");
        nk2.C(y, this.g, ", path=", this.h, ", referencePath=");
        nk2.C(y, this.i, ", bookSource=", this.j, ", location=");
        y.append(this.k);
        y.append(", percent=");
        y.append(this.l);
        y.append(", lastReadIndex=");
        y.append(this.m);
        y.append(", lastReadPosition=");
        y.append(this.n);
        y.append(", lastChapter=");
        nk2.C(y, this.o, ", lastChapterTrans=", this.p, ", timestamp=");
        y.append(this.q);
        rs8.x(y, ", totalReadingTime=", this.r, ", totalTtsTime=");
        y.append(this.s);
        y.append(", supportUpdate=");
        y.append(this.t);
        rs8.x(y, ", bookFolder=", this.u, ", lastUpdate=");
        y.append(this.v);
        rs8.x(y, ", lastNewChap=", this.w, ", followNewChap=");
        y.append(this.x);
        y.append(", bookType=");
        y.append(this.y);
        y.append(", bookStatus=");
        rs8.q(this.z, this.A, ", chapterCount=", ", isNew=", y);
        rs8.z(y, this.B, ", isNsfw=", this.C, ", isHideChapterName=");
        y.append(this.D);
        y.append(", tags=");
        y.append(this.E);
        y.append(", enableTrans=");
        rs8.z(y, this.F, ", favorite=", this.G, ", config=");
        return s21.q(y, this.H, ")");
    }
}
