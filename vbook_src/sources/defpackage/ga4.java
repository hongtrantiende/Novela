package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ga4  reason: default package */
/* loaded from: classes.dex */
public final class ga4 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ga4(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ga4) {
                ga4 ga4Var = (ga4) obj;
                if (!this.a.equals(ga4Var.a) || !this.b.equals(ga4Var.b) || !this.c.equals(ga4Var.c) || !this.d.equals(ga4Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return nk2.w(nk2.y("FBAuthor(firstName=", this.a, ", middleName=", this.b, ", lastName="), this.c, ", nickName=", this.d, ")");
    }
}
