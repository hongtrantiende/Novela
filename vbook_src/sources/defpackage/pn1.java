package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pn1  reason: default package */
/* loaded from: classes3.dex */
public final class pn1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public pn1(String str, String str2, String str3, String str4) {
        hl5.z(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn1)) {
            return false;
        }
        pn1 pn1Var = (pn1) obj;
        if (c16.i(this.a, pn1Var.a) && c16.i(this.b, pn1Var.b) && c16.i(this.c, pn1Var.c) && c16.i(this.d, pn1Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return nk2.w(nk2.y("ColorTheme(id=", this.a, ", textColor=", this.b, ", backgroundColor="), this.c, ", backgroundImage=", this.d, ")");
    }

    public /* synthetic */ pn1() {
        this("", "", "", "");
    }
}
