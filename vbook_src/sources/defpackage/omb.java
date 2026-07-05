package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: omb  reason: default package */
/* loaded from: classes3.dex */
public final class omb {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final String j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;

    public omb(String str, String str2, String str3, String str4, String str5, int i, boolean z, String str6, boolean z2, String str7, String str8, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = z;
        this.h = str6;
        this.i = z2;
        this.j = str7;
        this.k = str8;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = z7;
        this.q = z8;
        this.r = z9;
        this.s = z10;
    }

    public static omb a(omb ombVar, String str, String str2, String str3, String str4, String str5, int i, boolean z, String str6, boolean z2, String str7, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i2) {
        String str8 = (i2 & 1) != 0 ? ombVar.a : str;
        String str9 = (i2 & 2) != 0 ? ombVar.b : str2;
        String str10 = (i2 & 4) != 0 ? ombVar.c : str3;
        String str11 = (i2 & 8) != 0 ? ombVar.d : str4;
        String str12 = (i2 & 16) != 0 ? ombVar.e : str5;
        int i3 = (i2 & 32) != 0 ? ombVar.f : i;
        boolean z11 = (i2 & 64) != 0 ? ombVar.g : z;
        String str13 = (i2 & Token.CASE) != 0 ? ombVar.h : str6;
        boolean z12 = (i2 & 256) != 0 ? ombVar.i : z2;
        String str14 = ombVar.j;
        String str15 = (i2 & 1024) != 0 ? ombVar.k : str7;
        boolean z13 = (i2 & 2048) != 0 ? ombVar.l : z3;
        boolean z14 = (i2 & 4096) != 0 ? ombVar.m : z4;
        boolean z15 = (i2 & 8192) != 0 ? ombVar.n : z5;
        String str16 = str8;
        boolean z16 = (i2 & 16384) != 0 ? ombVar.o : z6;
        boolean z17 = (i2 & 32768) != 0 ? ombVar.p : z7;
        boolean z18 = (i2 & Parser.ARGC_LIMIT) != 0 ? ombVar.q : z8;
        boolean z19 = (i2 & 131072) != 0 ? ombVar.r : z9;
        boolean z20 = (i2 & 262144) != 0 ? ombVar.s : z10;
        ombVar.getClass();
        str16.getClass();
        str11.getClass();
        str12.getClass();
        return new omb(str16, str9, str10, str11, str12, i3, z11, str13, z12, str14, str15, z13, z14, z15, z16, z17, z18, z19, z20);
    }

    public final boolean b() {
        return this.i;
    }

    public final boolean c() {
        return this.n;
    }

    public final boolean d() {
        return this.o;
    }

    public final boolean e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof omb) {
                omb ombVar = (omb) obj;
                if (!this.a.equals(ombVar.a) || !this.b.equals(ombVar.b) || !this.c.equals(ombVar.c) || !this.d.equals(ombVar.d) || !this.e.equals(ombVar.e) || this.f != ombVar.f || this.g != ombVar.g || !this.h.equals(ombVar.h) || this.i != ombVar.i || !this.j.equals(ombVar.j) || !this.k.equals(ombVar.k) || this.l != ombVar.l || this.m != ombVar.m || this.n != ombVar.n || this.o != ombVar.o || this.p != ombVar.p || this.q != ombVar.q || this.r != ombVar.r || this.s != ombVar.s) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.s) + eub.k(eub.k(eub.k(eub.k(eub.k(eub.k(eub.k(eub.j(eub.j(eub.k(eub.j(eub.k(hl5.a(this.f, eub.j(eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r);
    }

    public final String toString() {
        StringBuilder y = nk2.y("TextBookState(bookId=", this.a, ", name=", this.b, ", author=");
        nk2.C(y, this.c, ", cover=", this.d, ", path=");
        a82.u(this.f, this.e, ", type=", ", isShowChapter=", y);
        y.append(this.g);
        y.append(", extensionId=");
        y.append(this.h);
        y.append(", isInQtTranslate=");
        y.append(this.i);
        y.append(", language=");
        y.append(this.j);
        y.append(", description=");
        rs8.y(y, this.k, ", isNfsw=", this.l, ", isOngoing=");
        rs8.z(y, this.m, ", isInShelf=", this.n, ", isOffline=");
        rs8.z(y, this.o, ", isFollow=", this.p, ", isDownloading=");
        rs8.z(y, this.q, ", isSupportDownload=", this.r, ", isSupportReload=");
        return rs8.m(")", y, this.s);
    }
}
