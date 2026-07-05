package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ja4  reason: default package */
/* loaded from: classes.dex */
public final class ja4 {
    public final String a;
    public final ga4 b;
    public final String c;
    public final String d;
    public final String e;

    public ja4(String str, ga4 ga4Var, String str2, String str3, String str4) {
        str.getClass();
        this.a = str;
        this.b = ga4Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ja4) {
                ja4 ja4Var = (ja4) obj;
                if (!c16.i(this.a, ja4Var.a) || !this.b.equals(ja4Var.b) || !this.c.equals(ja4Var.c) || !this.d.equals(ja4Var.d) || !this.e.equals(ja4Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + eub.j(eub.j((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FBDocumentInfo(id=");
        sb.append(this.a);
        sb.append(", author=");
        sb.append(this.b);
        sb.append(", programUsed=");
        nk2.C(sb, this.c, ", date=", this.d, ", version=");
        return s21.q(sb, this.e, ")");
    }
}
