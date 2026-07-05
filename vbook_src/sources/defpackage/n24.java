package defpackage;

import java.util.Arrays;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n24  reason: default package */
/* loaded from: classes3.dex */
public final class n24 {
    public final boolean A;
    public final String B;
    public final String C;
    public final byte[] D;
    public final boolean a;
    public final boolean b;
    public final y24 c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final int l;
    public final int m;
    public final String n;
    public final int o;
    public final long p;
    public final String q;
    public final e24 r;
    public final f24 s;
    public final String t;
    public final String u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public n24(boolean z, boolean z2, y24 y24Var, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, int i3, String str8, int i4, long j, String str9, e24 e24Var, f24 f24Var, String str10, String str11, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str12, String str13, byte[] bArr) {
        e24Var.getClass();
        f24Var.getClass();
        this.a = z;
        this.b = z2;
        this.c = y24Var;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = i2;
        this.m = i3;
        this.n = str8;
        this.o = i4;
        this.p = j;
        this.q = str9;
        this.r = e24Var;
        this.s = f24Var;
        this.t = str10;
        this.u = str11;
        this.v = z3;
        this.w = z4;
        this.x = z5;
        this.y = z6;
        this.z = z7;
        this.A = z8;
        this.B = str12;
        this.C = str13;
        this.D = bArr;
    }

    public static n24 a(n24 n24Var, boolean z, y24 y24Var, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, int i3, String str8, int i4, long j, String str9, e24 e24Var, f24 f24Var, String str10, String str11, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str12, String str13, byte[] bArr, int i5) {
        boolean z8 = (i5 & 1) != 0 ? n24Var.a : false;
        boolean z9 = (i5 & 2) != 0 ? n24Var.b : z;
        y24 y24Var2 = (i5 & 4) != 0 ? n24Var.c : y24Var;
        int i6 = (i5 & 8) != 0 ? n24Var.d : i;
        String str14 = (i5 & 16) != 0 ? n24Var.e : str;
        String str15 = (i5 & 32) != 0 ? n24Var.f : str2;
        String str16 = (i5 & 64) != 0 ? n24Var.g : str3;
        String str17 = (i5 & Token.CASE) != 0 ? n24Var.h : str4;
        String str18 = (i5 & 256) != 0 ? n24Var.i : str5;
        String str19 = (i5 & 512) != 0 ? n24Var.j : str6;
        String str20 = (i5 & 1024) != 0 ? n24Var.k : str7;
        int i7 = (i5 & 2048) != 0 ? n24Var.l : i2;
        int i8 = (i5 & 4096) != 0 ? n24Var.m : i3;
        String str21 = (i5 & 8192) != 0 ? n24Var.n : str8;
        boolean z10 = z8;
        int i9 = (i5 & 16384) != 0 ? n24Var.o : i4;
        long j2 = (i5 & 32768) != 0 ? n24Var.p : j;
        String str22 = (i5 & Parser.ARGC_LIMIT) != 0 ? n24Var.q : str9;
        e24 e24Var2 = (i5 & 131072) != 0 ? n24Var.r : e24Var;
        String str23 = str22;
        f24 f24Var2 = (i5 & 262144) != 0 ? n24Var.s : f24Var;
        String str24 = (i5 & 524288) != 0 ? n24Var.t : str10;
        String str25 = (i5 & 1048576) != 0 ? n24Var.u : str11;
        boolean z11 = (i5 & 2097152) != 0 ? n24Var.v : z2;
        boolean z12 = (i5 & 4194304) != 0 ? n24Var.w : z3;
        boolean z13 = (i5 & 8388608) != 0 ? n24Var.x : z4;
        boolean z14 = (i5 & 16777216) != 0 ? n24Var.y : z5;
        boolean z15 = (i5 & 33554432) != 0 ? n24Var.z : z6;
        boolean z16 = (i5 & 67108864) != 0 ? n24Var.A : z7;
        String str26 = (i5 & 134217728) != 0 ? n24Var.B : str12;
        String str27 = (i5 & 268435456) != 0 ? n24Var.C : str13;
        byte[] bArr2 = (i5 & 536870912) != 0 ? n24Var.D : bArr;
        n24Var.getClass();
        str14.getClass();
        str19.getClass();
        str20.getClass();
        str21.getClass();
        str23.getClass();
        e24Var2.getClass();
        f24Var2.getClass();
        str24.getClass();
        str25.getClass();
        str26.getClass();
        str27.getClass();
        return new n24(z10, z9, y24Var2, i6, str14, str15, str16, str17, str18, str19, str20, i7, i8, str21, i9, j2, str23, e24Var2, f24Var2, str24, str25, z11, z12, z13, z14, z15, z16, str26, str27, bArr2);
    }

    public final boolean b() {
        if (e() && h9a.U(this.r)) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (e() && h9a.W(this.r)) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (e() && h9a.T(this.r)) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        int i = this.m;
        if (i != 10 && i != 20) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n24) {
                n24 n24Var = (n24) obj;
                if (this.a != n24Var.a || this.b != n24Var.b || this.c != n24Var.c || this.d != n24Var.d || !this.e.equals(n24Var.e) || !this.f.equals(n24Var.f) || !this.g.equals(n24Var.g) || !this.h.equals(n24Var.h) || !this.i.equals(n24Var.i) || !this.j.equals(n24Var.j) || !this.k.equals(n24Var.k) || this.l != n24Var.l || this.m != n24Var.m || !this.n.equals(n24Var.n) || this.o != n24Var.o || this.p != n24Var.p || !this.q.equals(n24Var.q) || this.r != n24Var.r || this.s != n24Var.s || !this.t.equals(n24Var.t) || !this.u.equals(n24Var.u) || this.v != n24Var.v || this.w != n24Var.w || this.x != n24Var.x || this.y != n24Var.y || this.z != n24Var.z || this.A != n24Var.A || !this.B.equals(n24Var.B) || !this.C.equals(n24Var.C) || !c16.i(this.D, n24Var.D)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int k = eub.k(Boolean.hashCode(this.a) * 31, 31, this.b);
        int i = 0;
        y24 y24Var = this.c;
        if (y24Var == null) {
            hashCode = 0;
        } else {
            hashCode = y24Var.hashCode();
        }
        int j = eub.j(eub.j(eub.k(eub.k(eub.k(eub.k(eub.k(eub.k(eub.j(eub.j((this.s.hashCode() + ((this.r.hashCode() + eub.j(hl5.c(hl5.a(this.o, eub.j(hl5.a(this.m, hl5.a(this.l, eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(hl5.a(this.d, (k + hashCode) * 31, 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31), 31), 31, this.n), 31), this.p, 31), 31, this.q)) * 31)) * 31, 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C);
        byte[] bArr = this.D;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        }
        return j + i;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.D);
        StringBuilder p = rs8.p("ExportEbookState(isLoading=", this.a, ", isExporting=", this.b, ", exportPhase=");
        p.append(this.c);
        p.append(", exportProgress=");
        p.append(this.d);
        p.append(", bookId=");
        nk2.C(p, this.e, ", bookName=", this.f, ", bookRawName=");
        nk2.C(p, this.g, ", bookAuthor=", this.h, ", bookRawAuthor=");
        nk2.C(p, this.i, ", bookCover=", this.j, ", bookPath=");
        a82.u(this.l, this.k, ", bookType=", ", bookFormat=", p);
        nk2.z(this.m, ", bookLanguage=", this.n, ", totalChapter=", p);
        p.append(this.o);
        p.append(", downloadedChapterCount=");
        p.append(this.p);
        p.append(", introduction=");
        p.append(this.q);
        p.append(", format=");
        p.append(this.r);
        p.append(", scope=");
        p.append(this.s);
        p.append(", rangeStart=");
        p.append(this.t);
        p.append(", rangeEnd=");
        p.append(this.u);
        p.append(", includeIntroduction=");
        p.append(this.v);
        p.append(", includeTableOfContent=");
        p.append(this.w);
        p.append(", showChapterTitle=");
        p.append(this.x);
        p.append(", mergeIntoSingleFile=");
        p.append(this.y);
        p.append(", includeTranslateContent=");
        p.append(this.z);
        p.append(", isAutoTranslateEnabled=");
        p.append(this.A);
        p.append(", customName=");
        p.append(this.B);
        nk2.C(p, ", customAuthor=", this.C, ", customCoverBytes=", arrays);
        p.append(")");
        return p.toString();
    }
}
