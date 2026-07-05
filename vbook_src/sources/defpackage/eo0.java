package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eo0  reason: default package */
/* loaded from: classes3.dex */
public final class eo0 {
    public final String a;
    public final Map b;
    public final Map c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final Map h;
    public final Map i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;

    public eo0(String str, Map map, Map map2, String str2, String str3, int i, String str4, Map map3, Map map4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        str.getClass();
        map.getClass();
        map2.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        map3.getClass();
        map4.getClass();
        this.a = str;
        this.b = map;
        this.c = map2;
        this.d = str2;
        this.e = str3;
        this.f = i;
        this.g = str4;
        this.h = map3;
        this.i = map4;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo0)) {
            return false;
        }
        eo0 eo0Var = (eo0) obj;
        if (c16.i(this.a, eo0Var.a) && c16.i(this.b, eo0Var.b) && c16.i(this.c, eo0Var.c) && c16.i(this.d, eo0Var.d) && c16.i(this.e, eo0Var.e) && this.f == eo0Var.f && c16.i(this.g, eo0Var.g) && c16.i(this.h, eo0Var.h) && c16.i(this.i, eo0Var.i) && this.j == eo0Var.j && this.k == eo0Var.k && this.l == eo0Var.l && this.m == eo0Var.m && this.n == eo0Var.n) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.n) + eub.k(eub.k(eub.k(eub.k(rs8.a(rs8.a(eub.j(hl5.a(this.f, eub.j(eub.j(rs8.a(rs8.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Book(bookId=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", author=");
        sb.append(this.c);
        sb.append(", cover=");
        sb.append(this.d);
        sb.append(", path=");
        a82.u(this.f, this.e, ", type=", ", language=", sb);
        sb.append(this.g);
        sb.append(", description=");
        sb.append(this.h);
        sb.append(", translateConfig=");
        sb.append(this.i);
        sb.append(", isShowChapterName=");
        sb.append(this.j);
        sb.append(", isNfsw=");
        rs8.z(sb, this.k, ", isOngoing=", this.l, ", isInShelf=");
        sb.append(this.m);
        sb.append(", isFollow=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }
}
