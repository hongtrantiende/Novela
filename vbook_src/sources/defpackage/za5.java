package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: za5  reason: default package */
/* loaded from: classes3.dex */
public final class za5 extends ote {
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;

    public za5(String str, String str2, String str3, String str4, int i) {
        str.getClass();
        str3.getClass();
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof za5) {
                za5 za5Var = (za5) obj;
                if (!c16.i(this.c, za5Var.c) || !this.d.equals(za5Var.d) || !c16.i(this.e, za5Var.e) || !this.f.equals(za5Var.f) || this.g != za5Var.g) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + eub.j(eub.j(eub.j(this.c.hashCode() * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder y = nk2.y("InvalidAttribute(tag=", this.c, ", attr=", this.d, ", value=");
        nk2.C(y, this.e, ", reason=", this.f, ", charOffset=");
        return rs8.g(this.g, ")", y);
    }
}
