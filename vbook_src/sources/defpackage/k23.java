package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k23  reason: default package */
/* loaded from: classes3.dex */
public final class k23 {
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
    public final int l;
    public final boolean m;
    public final boolean n;
    public final List o;
    public final List p;
    public final List q;
    public final List r;
    public final List s;

    public k23(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, int i2, boolean z, boolean z2, List list, List list2, List list3, List list4, List list5) {
        s21.B(str3, str5, str6, str7, str9);
        str10.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = i;
        this.l = i2;
        this.m = z;
        this.n = z2;
        this.o = list;
        this.p = list2;
        this.q = list3;
        this.r = list4;
        this.s = list5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public static k23 a(k23 k23Var, String str, String str2, String str3, String str4, String str5, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, int i) {
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        List list;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        String str11 = k23Var.a;
        if ((i & 2) != 0) {
            str6 = k23Var.b;
        } else {
            str6 = str;
        }
        String str12 = k23Var.c;
        if ((i & 8) != 0) {
            str7 = k23Var.d;
        } else {
            str7 = str2;
        }
        String str13 = k23Var.e;
        if ((i & 32) != 0) {
            str8 = k23Var.f;
        } else {
            str8 = str3;
        }
        if ((i & 64) != 0) {
            str9 = k23Var.g;
        } else {
            str9 = str4;
        }
        if ((i & Token.CASE) != 0) {
            str10 = k23Var.h;
        } else {
            str10 = str5;
        }
        String str14 = k23Var.i;
        String str15 = str6;
        String str16 = str7;
        String str17 = str8;
        String str18 = str9;
        String str19 = str10;
        String str20 = k23Var.j;
        int i2 = k23Var.k;
        int i3 = k23Var.l;
        boolean z = k23Var.m;
        boolean z2 = k23Var.n;
        if ((i & 16384) != 0) {
            list = k23Var.o;
        } else {
            list = arrayList;
        }
        if ((i & 32768) != 0) {
            arrayList6 = k23Var.p;
        } else {
            arrayList6 = arrayList2;
        }
        if ((i & Parser.ARGC_LIMIT) != 0) {
            arrayList7 = k23Var.q;
        } else {
            arrayList7 = arrayList3;
        }
        if ((i & 131072) != 0) {
            arrayList8 = k23Var.r;
        } else {
            arrayList8 = arrayList4;
        }
        if ((i & 262144) != 0) {
            arrayList9 = k23Var.s;
        } else {
            arrayList9 = arrayList5;
        }
        k23Var.getClass();
        str12.getClass();
        str16.getClass();
        str13.getClass();
        str17.getClass();
        str18.getClass();
        str14.getClass();
        str20.getClass();
        return new k23(str11, str15, str12, str16, str13, str17, str18, str19, str14, str20, i2, i3, z, z2, list, arrayList6, arrayList7, arrayList8, arrayList9);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k23) {
                k23 k23Var = (k23) obj;
                if (!this.a.equals(k23Var.a) || !this.b.equals(k23Var.b) || !c16.i(this.c, k23Var.c) || !this.d.equals(k23Var.d) || !c16.i(this.e, k23Var.e) || !c16.i(this.f, k23Var.f) || !c16.i(this.g, k23Var.g) || !this.h.equals(k23Var.h) || !c16.i(this.i, k23Var.i) || !c16.i(this.j, k23Var.j) || this.k != k23Var.k || this.l != k23Var.l || this.m != k23Var.m || this.n != k23Var.n || !this.o.equals(k23Var.o) || !this.p.equals(k23Var.p) || !this.q.equals(k23Var.q) || !this.r.equals(k23Var.r) || !this.s.equals(k23Var.s)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.s.hashCode() + eub.l(eub.l(eub.l(eub.l(eub.k(eub.k(hl5.a(this.l, hl5.a(this.k, eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31), 31, this.m), 31, this.n), this.o, 31), this.p, 31), this.q, 31), this.r, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("Detail(rawName=", this.a, ", name=", this.b, ", path=");
        nk2.C(y, this.c, ", author=", this.d, ", cover=");
        nk2.C(y, this.e, ", detail=", this.f, ", description=");
        nk2.C(y, this.g, ", language=", this.h, ", source=");
        nk2.C(y, this.i, ", sourceId=", this.j, ", type=");
        rs8.q(this.k, this.l, ", format=", ", ongoing=", y);
        rs8.z(y, this.m, ", isNsfw=", this.n, ", tags=");
        y.append(this.o);
        y.append(", genres=");
        y.append(this.p);
        y.append(", suggestSections=");
        y.append(this.q);
        y.append(", reviewSections=");
        y.append(this.r);
        y.append(", commentSections=");
        return rs8.n(y, this.s, ")");
    }
}
