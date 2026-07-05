package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rl5  reason: default package */
/* loaded from: classes3.dex */
public final class rl5 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;

    public rl5(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = z7;
        this.q = z8;
        this.r = z9;
    }

    public static rl5 a(rl5 rl5Var, String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i2) {
        String str8;
        String str9;
        String str10;
        int i3;
        String str11;
        String str12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        if ((i2 & 1) != 0) {
            str8 = rl5Var.a;
        } else {
            str8 = str;
        }
        if ((i2 & 2) != 0) {
            str9 = rl5Var.b;
        } else {
            str9 = str2;
        }
        if ((i2 & 4) != 0) {
            str10 = rl5Var.c;
        } else {
            str10 = str3;
        }
        if ((i2 & 32) != 0) {
            i3 = rl5Var.f;
        } else {
            i3 = i;
        }
        String str13 = rl5Var.g;
        if ((i2 & Token.CASE) != 0) {
            str11 = rl5Var.h;
        } else {
            str11 = str6;
        }
        if ((i2 & 256) != 0) {
            str12 = rl5Var.i;
        } else {
            str12 = str7;
        }
        if ((i2 & 512) != 0) {
            z10 = rl5Var.j;
        } else {
            z10 = z;
        }
        if ((i2 & 1024) != 0) {
            z11 = rl5Var.k;
        } else {
            z11 = z2;
        }
        if ((i2 & 2048) != 0) {
            z12 = rl5Var.l;
        } else {
            z12 = z3;
        }
        if ((i2 & 4096) != 0) {
            z13 = rl5Var.m;
        } else {
            z13 = z4;
        }
        if ((i2 & 8192) != 0) {
            z14 = rl5Var.n;
        } else {
            z14 = z5;
        }
        if ((i2 & 16384) != 0) {
            z15 = rl5Var.o;
        } else {
            z15 = z6;
        }
        if ((32768 & i2) != 0) {
            z16 = rl5Var.p;
        } else {
            z16 = z7;
        }
        if ((65536 & i2) != 0) {
            z17 = rl5Var.q;
        } else {
            z17 = z8;
        }
        if ((i2 & 131072) != 0) {
            z18 = rl5Var.r;
        } else {
            z18 = z9;
        }
        rl5Var.getClass();
        str8.getClass();
        str9.getClass();
        str10.getClass();
        str4.getClass();
        str5.getClass();
        str13.getClass();
        str11.getClass();
        str12.getClass();
        return new rl5(str8, str9, str10, str4, str5, i3, str13, str11, str12, z10, z11, z12, z13, z14, z15, z16, z17, z18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl5)) {
            return false;
        }
        rl5 rl5Var = (rl5) obj;
        if (c16.i(this.a, rl5Var.a) && c16.i(this.b, rl5Var.b) && c16.i(this.c, rl5Var.c) && c16.i(this.d, rl5Var.d) && c16.i(this.e, rl5Var.e) && this.f == rl5Var.f && c16.i(this.g, rl5Var.g) && c16.i(this.h, rl5Var.h) && c16.i(this.i, rl5Var.i) && this.j == rl5Var.j && this.k == rl5Var.k && this.l == rl5Var.l && this.m == rl5Var.m && this.n == rl5Var.n && this.o == rl5Var.o && this.p == rl5Var.p && this.q == rl5Var.q && this.r == rl5Var.r) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.r) + eub.k(eub.k(eub.k(eub.k(eub.k(eub.k(eub.k(eub.k(eub.j(eub.j(eub.j(hl5.a(this.f, eub.j(eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q);
    }

    public final String toString() {
        StringBuilder y = nk2.y("ImageBookState(bookId=", this.a, ", name=", this.b, ", author=");
        nk2.C(y, this.c, ", cover=", this.d, ", path=");
        a82.u(this.f, this.e, ", type=", ", translateMode=", y);
        nk2.C(y, this.g, ", language=", this.h, ", description=");
        rs8.y(y, this.i, ", isNfsw=", this.j, ", isOngoing=");
        rs8.z(y, this.k, ", isInShelf=", this.l, ", isFollow=");
        rs8.z(y, this.m, ", isSupportShowDetail=", this.n, ", isSupportDownload=");
        rs8.z(y, this.o, ", isSupportReload=", this.p, ", isSupportShowChapterName=");
        y.append(this.q);
        y.append(", isHideEndChapterDivider=");
        y.append(this.r);
        y.append(")");
        return y.toString();
    }

    public /* synthetic */ rl5() {
        this("", "", "", "", "", 0, "", "", "", false, false, false, false, false, false, false, false, false);
    }
}
