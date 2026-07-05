package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eia  reason: default package */
/* loaded from: classes3.dex */
public final class eia {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final long l;
    public final String m;
    public final String n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final int s;
    public final int t;
    public final List u;
    public final List v;

    public eia(boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z3, boolean z4, long j, String str8, String str9, boolean z5, boolean z6, boolean z7, boolean z8, int i, int i2, List list, List list2) {
        s21.B(str, str4, str5, str6, str9);
        list.getClass();
        list2.getClass();
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = z3;
        this.k = z4;
        this.l = j;
        this.m = str8;
        this.n = str9;
        this.o = z5;
        this.p = z6;
        this.q = z7;
        this.r = z8;
        this.s = i;
        this.t = i2;
        this.u = list;
        this.v = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof eia) {
                eia eiaVar = (eia) obj;
                if (this.a != eiaVar.a || this.b != eiaVar.b || !c16.i(this.c, eiaVar.c) || !this.d.equals(eiaVar.d) || !this.e.equals(eiaVar.e) || !c16.i(this.f, eiaVar.f) || !c16.i(this.g, eiaVar.g) || !c16.i(this.h, eiaVar.h) || !this.i.equals(eiaVar.i) || this.j != eiaVar.j || this.k != eiaVar.k || this.l != eiaVar.l || !this.m.equals(eiaVar.m) || !c16.i(this.n, eiaVar.n) || this.o != eiaVar.o || this.p != eiaVar.p || this.q != eiaVar.q || this.r != eiaVar.r || this.s != eiaVar.s || this.t != eiaVar.t || !c16.i(this.u, eiaVar.u) || !c16.i(this.v, eiaVar.v)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.v.hashCode() + eub.l(hl5.a(this.t, hl5.a(this.s, eub.k(eub.k(eub.k(eub.k(eub.j(eub.j(hl5.c(eub.k(eub.k(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), this.l, 31), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31), 31), this.u, 31);
    }

    public final String toString() {
        StringBuilder p = rs8.p("ShelfBookDetailState(isLoading=", this.a, ", verified=", this.b, ", bookId=");
        nk2.C(p, this.c, ", bookName=", this.d, ", bookAuthor=");
        nk2.C(p, this.e, ", bookCover=", this.f, ", bookPath=");
        nk2.C(p, this.g, ", bookSource=", this.h, ", sourceId=");
        rs8.y(p, this.i, ", isFavorite=", this.j, ", isFollow=");
        p.append(this.k);
        p.append(", lastRead=");
        p.append(this.l);
        nk2.C(p, ", readPercent=", this.m, ", lastReadChapter=", this.n);
        p.append(", isBook=");
        p.append(this.o);
        p.append(", isOffline=");
        p.append(this.p);
        p.append(", isSupportDownload=");
        p.append(this.q);
        p.append(", isSupportExport=");
        p.append(this.r);
        a82.t(this.s, this.t, ", status=", ", location=", p);
        p.append(", categories=");
        p.append(this.u);
        p.append(", allCategories=");
        p.append(this.v);
        p.append(")");
        return p.toString();
    }
}
