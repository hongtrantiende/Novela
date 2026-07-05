package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qta  reason: default package */
/* loaded from: classes3.dex */
public final class qta {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final List i;
    public final List j;
    public final List k;
    public final List l;
    public final ArrayList m;
    public final int n;
    public final int o;
    public final boolean p;
    public final boolean q;

    public qta(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, List list3, List list4, ArrayList arrayList, int i, int i2, boolean z, boolean z2) {
        s21.B(str2, str4, str5, str6, str7);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = list;
        this.j = list2;
        this.k = list3;
        this.l = list4;
        this.m = arrayList;
        this.n = i;
        this.o = i2;
        this.p = z;
        this.q = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qta) {
            qta qtaVar = (qta) obj;
            if (this.a.equals(qtaVar.a) && c16.i(this.b, qtaVar.b) && this.c.equals(qtaVar.c) && c16.i(this.d, qtaVar.d) && c16.i(this.e, qtaVar.e) && c16.i(this.f, qtaVar.f) && c16.i(this.g, qtaVar.g) && this.h.equals(qtaVar.h) && this.i.equals(qtaVar.i) && this.j.equals(qtaVar.j) && this.k.equals(qtaVar.k) && this.l.equals(qtaVar.l) && this.m.equals(qtaVar.m) && this.n == qtaVar.n && this.o == qtaVar.o && this.p == qtaVar.p && this.q == qtaVar.q) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int l = eub.l(eub.l(eub.l(eub.l(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), this.i, 31), this.j, 31), this.k, 31), this.l, 31);
        return Boolean.hashCode(true) + eub.k(eub.k(hl5.a(this.o, hl5.a(this.n, (this.m.hashCode() + l) * 31, 31), 31), 31, this.p), 31, this.q);
    }

    public final String toString() {
        StringBuilder y = nk2.y("SourceDetail(name=", this.a, ", path=", this.b, ", author=");
        nk2.C(y, this.c, ", cover=", this.d, ", detail=");
        nk2.C(y, this.e, ", description=", this.f, ", extensionId=");
        nk2.C(y, this.g, ", locale=", this.h, ", tags=");
        y.append(this.i);
        y.append(", genres=");
        y.append(this.j);
        y.append(", suggests=");
        y.append(this.k);
        y.append(", reviews=");
        y.append(this.l);
        y.append(", comments=");
        y.append(this.m);
        y.append(", type=");
        y.append(this.n);
        y.append(", format=");
        eub.w(y, this.o, ", ongoing=", this.p, ", isNsfw=");
        return rs8.m(", hasTableOfContent=true)", y, this.q);
    }
}
