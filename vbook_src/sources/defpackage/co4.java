package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: co4  reason: default package */
/* loaded from: classes3.dex */
public final class co4 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final ng3 e;

    public co4(String str, String str2, String str3, boolean z, ng3 ng3Var) {
        str.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = ng3Var;
    }

    public static co4 a(co4 co4Var, String str, ng3 ng3Var, int i) {
        String str2 = co4Var.a;
        String str3 = co4Var.b;
        if ((i & 4) != 0) {
            str = co4Var.c;
        }
        String str4 = str;
        boolean z = co4Var.d;
        str2.getClass();
        str4.getClass();
        return new co4(str2, str3, str4, z, ng3Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof co4) {
                co4 co4Var = (co4) obj;
                if (!c16.i(this.a, co4Var.a) || !this.b.equals(co4Var.b) || !c16.i(this.c, co4Var.c) || this.d != co4Var.d || this.e != co4Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + eub.k(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder y = nk2.y("Font(id=", this.a, ", name=", this.b, ", path=");
        rs8.y(y, this.c, ", isDefault=", this.d, ", downloadStatus=");
        y.append(this.e);
        y.append(")");
        return y.toString();
    }
}
