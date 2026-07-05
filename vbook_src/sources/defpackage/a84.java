package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a84  reason: default package */
/* loaded from: classes3.dex */
public final class a84 {
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

    public a84(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
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
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a84) {
                a84 a84Var = (a84) obj;
                if (!this.a.equals(a84Var.a) || !this.b.equals(a84Var.b) || !this.c.equals(a84Var.c) || !this.d.equals(a84Var.d) || !this.e.equals(a84Var.e) || !this.f.equals(a84Var.f) || !this.g.equals(a84Var.g) || !this.h.equals(a84Var.h) || !this.i.equals(a84Var.i) || !this.j.equals(a84Var.j)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.j.hashCode() + eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder y = nk2.y("ExtensionScript(discovery=", this.a, ", home=", this.b, ", explore=");
        nk2.C(y, this.c, ", genre=", this.d, ", search=");
        nk2.C(y, this.e, ", detail=", this.f, ", page=");
        nk2.C(y, this.g, ", toc=", this.h, ", chap=");
        return nk2.w(y, this.i, ", track=", this.j, ")");
    }
}
