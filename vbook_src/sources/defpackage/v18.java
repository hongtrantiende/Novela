package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v18  reason: default package */
/* loaded from: classes.dex */
public final class v18 {
    public final String a;
    public final String b;
    public final s18 c;
    public final w94 d;

    public v18(String str, String str2, s18 s18Var, w94 w94Var) {
        this.a = str;
        this.b = str2;
        this.c = s18Var;
        this.d = w94Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v18) {
                v18 v18Var = (v18) obj;
                if (!this.a.equals(v18Var.a) || !c16.i(this.b, v18Var.b) || !this.c.equals(v18Var.c) || !c16.i(this.d, v18Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.a.hashCode() + rs8.a(eub.j(this.a.hashCode() * 31, 31, this.b), 961, this.c.a);
    }

    public final String toString() {
        StringBuilder y = nk2.y("NetworkRequest(url=", this.a, ", method=", this.b, ", headers=");
        y.append(this.c);
        y.append(", body=null, extras=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
