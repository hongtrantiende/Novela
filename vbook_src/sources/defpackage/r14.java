package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r14  reason: default package */
/* loaded from: classes3.dex */
public final class r14 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final g14 f;

    public r14(String str, String str2, String str3, String str4, String str5, g14 g14Var) {
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = g14Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r14) {
                r14 r14Var = (r14) obj;
                if (!this.a.equals(r14Var.a) || !this.b.equals(r14Var.b) || !this.c.equals(r14Var.c) || !this.d.equals(r14Var.d) || !c16.i(this.e, r14Var.e) || !c16.i(this.f, r14Var.f)) {
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
        int j = eub.j(eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        g14 g14Var = this.f;
        if (g14Var == null) {
            hashCode = 0;
        } else {
            hashCode = g14Var.hashCode();
        }
        return j + hashCode;
    }

    public final String toString() {
        StringBuilder y = nk2.y("ExploreItem(name=", this.a, ", cover=", this.b, ", description=");
        nk2.C(y, this.c, ", tag=", this.d, ", data=");
        y.append(this.e);
        y.append(", action=");
        y.append(this.f);
        y.append(")");
        return y.toString();
    }
}
