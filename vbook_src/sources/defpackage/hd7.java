package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hd7  reason: default package */
/* loaded from: classes3.dex */
public final class hd7 {
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final List h;
    public final String i;

    public hd7(String str, String str2, List list, String str3, String str4, String str5, String str6, List list2, String str7) {
        rs8.w(str, str2, str4);
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = list2;
        this.i = str7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hd7) {
                hd7 hd7Var = (hd7) obj;
                if (!c16.i(this.a, hd7Var.a) || !c16.i(this.b, hd7Var.b) || !this.c.equals(hd7Var.c) || !this.d.equals(hd7Var.d) || !c16.i(this.e, hd7Var.e) || !this.f.equals(hd7Var.f) || !this.g.equals(hd7Var.g) || !this.h.equals(hd7Var.h) || !this.i.equals(hd7Var.i)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.i.hashCode() + eub.l(eub.j(eub.j(eub.j(eub.j(eub.l(eub.j(this.a.hashCode() * 31, 31, this.b), this.c, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), this.h, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("MobiMetadata(identifier=", this.a, ", title=", this.b, ", author=");
        y.append(this.c);
        y.append(", publisher=");
        y.append(this.d);
        y.append(", language=");
        nk2.C(y, this.e, ", published=", this.f, ", description=");
        y.append(this.g);
        y.append(", subject=");
        y.append(this.h);
        y.append(", rights=");
        return s21.q(y, this.i, ")");
    }
}
